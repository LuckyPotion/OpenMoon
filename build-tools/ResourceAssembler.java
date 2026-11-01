import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Reassembles the binary parts described by resource-manifest.json.
 *
 * This class intentionally uses only Java SE 17 APIs.  Every part is checked
 * before assembly; the output is written beside its target and atomically
 * moved into place only after the complete SHA-256 matches the manifest.
 */
public final class ResourceAssembler {
    private static final String EXPECTED_SCHEMA = "moon-resource-packaging050/v1";
    private static final int BUFFER_SIZE = 1024 * 1024;
    private static final Pattern SHA256 = Pattern.compile("[0-9a-fA-F]{64}");

    private ResourceAssembler() {
    }

    public static void main(String[] args) {
        try {
            Options options = Options.parse(args);
            if (options.help) {
                printUsage();
                return;
            }
            AssemblyResult result = assemble(options.manifest);
            System.out.println(
                    "ASSEMBLE PASS mode=" + result.mode
                            + " bytes=" + result.size
                            + " sha256=" + result.sha256
                            + " output=" + result.output);
        } catch (AssemblyException | IOException error) {
            System.err.println("ERROR: " + error.getMessage());
            System.exit(2);
        }
    }

    private static void printUsage() {
        System.out.println("usage: java ResourceAssembler --manifest PATH");
        System.out.println("       java ResourceAssembler --help");
    }

    private static AssemblyResult assemble(Path manifestPath)
            throws IOException, AssemblyException {
        Manifest manifest = Manifest.read(manifestPath);

        // Preflight catches missing or damaged parts before an existing output
        // can be reused, and keeps failure output-free when no target exists.
        validateParts(manifest);

        if (Files.exists(manifest.output)) {
            if (!Files.isRegularFile(manifest.output)) {
                throw new AssemblyException("output exists but is not a regular file: " + manifest.output);
            }
            DigestResult existing = digestFile(manifest.output);
            if (existing.size == manifest.expectedSize
                    && existing.sha256.equals(manifest.expectedSha256)) {
                return new AssemblyResult("REUSED", existing.size, existing.sha256, manifest.output);
            }
        }

        Files.createDirectories(manifest.output.getParent());
        Path temporary = Files.createTempFile(
                manifest.output.getParent(), "." + manifest.output.getFileName() + ".", ".tmp");
        boolean moved = false;
        try {
            MessageDigest completeDigest = sha256Digest();
            long completeSize = 0L;
            try (FileChannel channel = FileChannel.open(temporary, StandardOpenOption.WRITE)) {
                OutputStream outputStream = Channels.newOutputStream(channel);
                for (Part part : manifest.parts) {
                    MessageDigest partDigest = sha256Digest();
                    long partSize = 0L;
                    try (InputStream input = Files.newInputStream(part.path)) {
                        byte[] buffer = new byte[BUFFER_SIZE];
                        int read;
                        while ((read = input.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, read);
                            partDigest.update(buffer, 0, read);
                            completeDigest.update(buffer, 0, read);
                            partSize += read;
                            completeSize += read;
                        }
                    }
                    String actualPartSha256 = hex(partDigest.digest());
                    if (partSize != part.size || !actualPartSha256.equals(part.sha256)) {
                        throw new AssemblyException(
                                "part changed during assembly: " + part.path
                                        + " expected=" + part.size + "/" + part.sha256
                                        + " actual=" + partSize + "/" + actualPartSha256);
                    }
                }
                outputStream.flush();
                channel.force(true);
            }

            String completeSha256 = hex(completeDigest.digest());
            if (completeSize != manifest.expectedSize
                    || !completeSha256.equals(manifest.expectedSha256)) {
                throw new AssemblyException(
                        "reassembled output mismatch: expected="
                                + manifest.expectedSize + "/" + manifest.expectedSha256
                                + " actual=" + completeSize + "/" + completeSha256);
            }

            try {
                Files.move(
                        temporary,
                        manifest.output,
                        StandardCopyOption.ATOMIC_MOVE,
                        StandardCopyOption.REPLACE_EXISTING);
            } catch (AtomicMoveNotSupportedException error) {
                throw new AssemblyException(
                        "filesystem does not support the required atomic move: "
                                + manifest.output,
                        error);
            }
            moved = true;
            return new AssemblyResult(
                    "REBUILT", completeSize, completeSha256, manifest.output);
        } finally {
            if (!moved) {
                Files.deleteIfExists(temporary);
            }
        }
    }

    private static void validateParts(Manifest manifest)
            throws IOException, AssemblyException {
        for (Part part : manifest.parts) {
            if (!Files.isRegularFile(part.path)) {
                throw new AssemblyException("missing part: " + part.path);
            }
            DigestResult actual = digestFile(part.path);
            if (actual.size != part.size || !actual.sha256.equals(part.sha256)) {
                throw new AssemblyException(
                        "part hash/size mismatch: " + part.path
                                + " expected=" + part.size + "/" + part.sha256
                                + " actual=" + actual.size + "/" + actual.sha256);
            }
        }
    }

    private static DigestResult digestFile(Path path) throws IOException {
        MessageDigest digest = sha256Digest();
        long size = 0L;
        try (InputStream input = Files.newInputStream(path)) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int read;
            while ((read = input.read(buffer)) != -1) {
                digest.update(buffer, 0, read);
                size += read;
            }
        }
        return new DigestResult(size, hex(digest.digest()));
    }

    private static MessageDigest sha256Digest() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException impossible) {
            throw new AssertionError("Java runtime does not provide SHA-256", impossible);
        }
    }

    private static String hex(byte[] bytes) {
        StringBuilder result = new StringBuilder(bytes.length * 2);
        for (byte value : bytes) {
            result.append(Character.toUpperCase(Character.forDigit((value >>> 4) & 0x0f, 16)));
            result.append(Character.toUpperCase(Character.forDigit(value & 0x0f, 16)));
        }
        return result.toString();
    }

    private static Path resolveWithin(Path root, String relative, String label)
            throws AssemblyException {
        Path candidate;
        try {
            Path relativePath = Path.of(relative);
            if (relativePath.isAbsolute()) {
                throw new AssemblyException(label + " must be relative: " + relative);
            }
            candidate = root.resolve(relativePath).normalize();
        } catch (RuntimeException error) {
            throw new AssemblyException(label + " is not a valid path: " + relative, error);
        }
        if (!candidate.startsWith(root)) {
            throw new AssemblyException(label + " escapes manifest directory: " + relative);
        }
        return candidate;
    }

    private record AssemblyResult(String mode, long size, String sha256, Path output) {
    }

    private record DigestResult(long size, String sha256) {
    }

    private record Part(int index, Path path, long size, String sha256) {
    }

    private static final class Manifest {
        private final List<Part> parts;
        private final Path output;
        private final long expectedSize;
        private final String expectedSha256;

        private Manifest(
                List<Part> parts, Path output, long expectedSize, String expectedSha256) {
            this.parts = parts;
            this.output = output;
            this.expectedSize = expectedSize;
            this.expectedSha256 = expectedSha256;
        }

        private static Manifest read(Path manifestPath)
                throws IOException, AssemblyException {
            Path absoluteManifest = manifestPath.toAbsolutePath().normalize();
            if (!Files.isRegularFile(absoluteManifest)) {
                throw new AssemblyException("manifest is missing: " + absoluteManifest);
            }
            String text = Files.readString(absoluteManifest, StandardCharsets.UTF_8);
            Object parsed = new JsonParser(text).parse();
            Map<String, Object> root = object(parsed, "manifest root");
            String schema = string(root, "schema");
            if (!EXPECTED_SCHEMA.equals(schema)) {
                throw new AssemblyException("unsupported manifest schema: " + schema);
            }

            Map<String, Object> source = object(root.get("source"), "source");
            long expectedSize = number(source, "size_bytes");
            String expectedSha256 = sha256(string(source, "sha256"), "source.sha256");

            Map<String, Object> reassembled = object(root.get("reassembled"), "reassembled");
            long reassembledSize = number(reassembled, "size_bytes");
            String reassembledSha256 = sha256(
                    string(reassembled, "sha256"), "reassembled.sha256");
            if (expectedSize != reassembledSize || !expectedSha256.equals(reassembledSha256)) {
                throw new AssemblyException("source and reassembled manifest locks differ");
            }

            Path rootDirectory = absoluteManifest.getParent();
            if (rootDirectory == null) {
                throw new AssemblyException("manifest has no parent directory");
            }
            Path output = resolveWithin(
                    rootDirectory, string(reassembled, "path"), "reassembled.path");

            long maximumPartSize = Long.MAX_VALUE;
            Object chunkingValue = root.get("chunking");
            if (chunkingValue != null) {
                Map<String, Object> chunking = object(chunkingValue, "chunking");
                Object maximumValue = chunking.get("maximum_allowed_bytes");
                if (maximumValue != null) {
                    maximumPartSize = numberValue(maximumValue, "chunking.maximum_allowed_bytes");
                }
            }

            List<Object> rawParts = array(root.get("parts"), "parts");
            if (rawParts.isEmpty()) {
                throw new AssemblyException("manifest parts list is empty");
            }
            List<Part> parts = new ArrayList<>(rawParts.size());
            Set<Path> uniquePaths = new HashSet<>();
            for (int offset = 0; offset < rawParts.size(); offset++) {
                int expectedIndex = offset + 1;
                Map<String, Object> rawPart = object(rawParts.get(offset), "parts[" + offset + "]");
                long index = number(rawPart, "index");
                if (index != expectedIndex) {
                    throw new AssemblyException(
                            "part index is not contiguous: expected " + expectedIndex + " got " + index);
                }
                long size = number(rawPart, "size_bytes");
                if (size < 0L || size > maximumPartSize) {
                    throw new AssemblyException(
                            "part size is outside manifest limit at index " + expectedIndex);
                }
                String sha256 = sha256(string(rawPart, "sha256"), "parts[" + offset + "].sha256");
                Path path = resolveWithin(rootDirectory, string(rawPart, "path"),
                        "parts[" + offset + "].path");
                if (!uniquePaths.add(path) || path.equals(output)) {
                    throw new AssemblyException("duplicate or output-overlapping part path: " + path);
                }
                parts.add(new Part(expectedIndex, path, size, sha256));
            }
            return new Manifest(parts, output, expectedSize, expectedSha256);
        }
    }

    private static String sha256(String value, String label) throws AssemblyException {
        if (!SHA256.matcher(value).matches()) {
            throw new AssemblyException(label + " must be a 64-character SHA-256 hex string");
        }
        return value.toUpperCase(java.util.Locale.ROOT);
    }

    private static Map<String, Object> object(Object value, String label)
            throws AssemblyException {
        if (!(value instanceof Map<?, ?> raw)) {
            throw new AssemblyException(label + " must be a JSON object");
        }
        Map<String, Object> result = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : raw.entrySet()) {
            if (!(entry.getKey() instanceof String key)) {
                throw new AssemblyException(label + " has a non-string key");
            }
            result.put(key, entry.getValue());
        }
        return result;
    }

    private static List<Object> array(Object value, String label) throws AssemblyException {
        if (!(value instanceof List<?> raw)) {
            throw new AssemblyException(label + " must be a JSON array");
        }
        return new ArrayList<>(raw);
    }

    private static String string(Map<String, Object> object, String key)
            throws AssemblyException {
        return string(object.get(key), key);
    }

    private static String string(Object value, String label) throws AssemblyException {
        if (!(value instanceof String result)) {
            throw new AssemblyException(label + " must be a JSON string");
        }
        return result;
    }

    private static long number(Map<String, Object> object, String key)
            throws AssemblyException {
        return numberValue(object.get(key), key);
    }

    private static long numberValue(Object value, String label) throws AssemblyException {
        if (!(value instanceof Number number)
                || number.longValue() != number.doubleValue()) {
            throw new AssemblyException(label + " must be an integer JSON number");
        }
        long result = number.longValue();
        if (result < 0L) {
            throw new AssemblyException(label + " must not be negative");
        }
        return result;
    }

    private static final class Options {
        private final Path manifest;
        private final boolean help;

        private Options(Path manifest, boolean help) {
            this.manifest = manifest;
            this.help = help;
        }

        private static Options parse(String[] args) throws AssemblyException {
            if (args.length == 1 && "--help".equals(args[0])) {
                return new Options(null, true);
            }
            if (args.length != 2 || !"--manifest".equals(args[0])) {
                throw new AssemblyException("expected --manifest PATH (use --help for usage)");
            }
            return new Options(Path.of(args[1]), false);
        }
    }

    private static final class AssemblyException extends Exception {
        private AssemblyException(String message) {
            super(message);
        }

        private AssemblyException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    /** Minimal JSON reader for the fixed manifest schema; no third-party jar is required. */
    private static final class JsonParser {
        private final String text;
        private int position;

        private JsonParser(String text) {
            this.text = text;
        }

        private Object parse() throws AssemblyException {
            skipWhitespace();
            Object value = value();
            skipWhitespace();
            if (position != text.length()) {
                throw error("trailing data");
            }
            return value;
        }

        private Object value() throws AssemblyException {
            skipWhitespace();
            if (position >= text.length()) {
                throw error("unexpected end of JSON");
            }
            return switch (text.charAt(position)) {
                case '{' -> objectValue();
                case '[' -> arrayValue();
                case '"' -> stringValue();
                case 't' -> literal("true", Boolean.TRUE);
                case 'f' -> literal("false", Boolean.FALSE);
                case 'n' -> literal("null", null);
                default -> numberValue();
            };
        }

        private Object literal(String literal, Object value) throws AssemblyException {
            if (!text.startsWith(literal, position)) {
                throw error("invalid literal");
            }
            position += literal.length();
            return value;
        }

        private Map<String, Object> objectValue() throws AssemblyException {
            expect('{');
            Map<String, Object> result = new LinkedHashMap<>();
            skipWhitespace();
            if (consume('}')) {
                return result;
            }
            while (true) {
                skipWhitespace();
                if (position >= text.length() || text.charAt(position) != '"') {
                    throw error("object key must be a string");
                }
                String key = stringValue();
                skipWhitespace();
                expect(':');
                result.put(key, value());
                skipWhitespace();
                if (consume('}')) {
                    return result;
                }
                expect(',');
            }
        }

        private List<Object> arrayValue() throws AssemblyException {
            expect('[');
            List<Object> result = new ArrayList<>();
            skipWhitespace();
            if (consume(']')) {
                return result;
            }
            while (true) {
                result.add(value());
                skipWhitespace();
                if (consume(']')) {
                    return result;
                }
                expect(',');
            }
        }

        private String stringValue() throws AssemblyException {
            expect('"');
            StringBuilder result = new StringBuilder();
            while (position < text.length()) {
                char current = text.charAt(position++);
                if (current == '"') {
                    return result.toString();
                }
                if (current < 0x20) {
                    throw error("control character in string");
                }
                if (current != '\\') {
                    result.append(current);
                    continue;
                }
                if (position >= text.length()) {
                    throw error("unterminated escape");
                }
                char escaped = text.charAt(position++);
                switch (escaped) {
                    case '"' -> result.append('"');
                    case '\\' -> result.append('\\');
                    case '/' -> result.append('/');
                    case 'b' -> result.append('\b');
                    case 'f' -> result.append('\f');
                    case 'n' -> result.append('\n');
                    case 'r' -> result.append('\r');
                    case 't' -> result.append('\t');
                    case 'u' -> result.append(unicodeEscape());
                    default -> throw error("invalid string escape");
                }
            }
            throw error("unterminated string");
        }

        private char unicodeEscape() throws AssemblyException {
            if (position + 4 > text.length()) {
                throw error("short unicode escape");
            }
            int value = 0;
            for (int offset = 0; offset < 4; offset++) {
                int digit = Character.digit(text.charAt(position++), 16);
                if (digit < 0) {
                    throw error("invalid unicode escape");
                }
                value = value * 16 + digit;
            }
            return (char) value;
        }

        private Number numberValue() throws AssemblyException {
            int start = position;
            if (consume('-')) {
                if (position >= text.length()) {
                    throw error("invalid number");
                }
            }
            digits();
            boolean decimal = false;
            if (consume('.')) {
                decimal = true;
                digits();
            }
            if (position < text.length()
                    && (text.charAt(position) == 'e' || text.charAt(position) == 'E')) {
                decimal = true;
                position++;
                if (position < text.length()
                        && (text.charAt(position) == '+' || text.charAt(position) == '-')) {
                    position++;
                }
                digits();
            }
            String token = text.substring(start, position);
            try {
                if (!decimal) {
                    return Long.parseLong(token);
                }
                double result = Double.parseDouble(token);
                if (!Double.isFinite(result)) {
                    throw error("non-finite number");
                }
                return result;
            } catch (NumberFormatException numberFormatError) {
                throw error("invalid number");
            }
        }

        private void digits() throws AssemblyException {
            int start = position;
            while (position < text.length() && Character.isDigit(text.charAt(position))) {
                position++;
            }
            if (position == start) {
                throw error("expected a digit");
            }
        }

        private void skipWhitespace() {
            while (position < text.length() && Character.isWhitespace(text.charAt(position))) {
                position++;
            }
        }

        private boolean consume(char expected) {
            if (position < text.length() && text.charAt(position) == expected) {
                position++;
                return true;
            }
            return false;
        }

        private void expect(char expected) throws AssemblyException {
            if (!consume(expected)) {
                throw error("expected '" + expected + "'");
            }
        }

        private AssemblyException error(String message) {
            return new AssemblyException(message + " at JSON offset " + position);
        }
    }
}
