import java.nio.file.*;
import java.util.*;
import java.util.zip.*;

/** Keeps production R definitions out of external runtime providers. */
public final class RuntimeDependencyBoundary {
    public static Set<String> classEntries(Path archive) throws Exception {
        Set<String> result = new TreeSet<>();
        try (ZipFile zip = new ZipFile(archive.toFile())) {
            for (ZipEntry entry : Collections.list(zip.entries())) {
                if (entry.getName().endsWith(".class") && !result.add(entry.getName()))
                    throw new IllegalStateException("Duplicate class entry: " + entry.getName());
            }
        }
        return result;
    }

    public static Map<String, Object> audit(Path owned, List<Path> providers) throws Exception {
        Set<String> names = classEntries(owned);
        List<String> conflicts = new ArrayList<>();
        int entries = 0;
        for (Path provider : providers) {
            Set<String> external = classEntries(provider);
            entries += external.size();
            for (String entry : external)
                if (names.contains(entry)) conflicts.add(provider.getFileName() + ":" + entry);
        }
        if (!conflicts.isEmpty()) throw new IllegalStateException(
            "Runtime provider shadows owned R classes: count=" + conflicts.size()
            + ", first=" + conflicts.get(0));
        return Map.of("owned_classes", names.size(), "provider_count", providers.size(),
            "provider_class_entries", entries, "owned_provider_overlap", 0,
            "namespace", "R", "client_initialized", false);
    }

    public static void verifySlice(Path original, Path slice, Set<String> owned) throws Exception {
        try (ZipFile source = new ZipFile(original.toFile()); ZipFile target = new ZipFile(slice.toFile())) {
            Set<String> expected = new TreeSet<>();
            for (ZipEntry entry : Collections.list(source.entries())) {
                String name = entry.getName();
                if (owned.contains(name)) continue;
                if (!expected.add(name)) throw new IllegalStateException("Duplicate original entry: " + name);
                ZipEntry actual = target.getEntry(name);
                if (actual == null || !Arrays.equals(source.getInputStream(entry).readAllBytes(),
                        target.getInputStream(actual).readAllBytes()))
                    throw new IllegalStateException("External slice bytes differ: " + name);
            }
            Set<String> actual = new TreeSet<>();
            for (ZipEntry entry : Collections.list(target.entries()))
                if (!actual.add(entry.getName())) throw new IllegalStateException("Duplicate slice entry");
            if (!actual.equals(expected)) throw new IllegalStateException("External slice scope differs");
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 4 || !args[0].equals("filter"))
            throw new IllegalArgumentException("filter original-provider.jar RUNTIME_S_TO_R.tsv new-provider.jar");
        Path original = Path.of(args[1]), mapping = Path.of(args[2]), output = Path.of(args[3]);
        Set<String> owned = new TreeSet<>();
        for (String line : Files.readAllLines(mapping)) {
            String[] row = line.split("\t", -1);
            if (row[0].equals("C") && !owned.add(row[row.length - 1] + ".class"))
                throw new IllegalStateException("Duplicate R ownership mapping");
        }
        if (owned.isEmpty()) throw new IllegalArgumentException("Empty R ownership mapping");
        int removed = 0, retained = 0;
        try (ZipFile source = new ZipFile(original.toFile());
             ZipOutputStream target = new ZipOutputStream(Files.newOutputStream(output, StandardOpenOption.CREATE_NEW))) {
            target.setLevel(6);
            List<? extends ZipEntry> entries = Collections.list(source.entries());
            entries.sort(Comparator.comparing(ZipEntry::getName));
            for (ZipEntry entry : entries) {
                if (owned.contains(entry.getName())) { removed++; continue; }
                ZipEntry next = new ZipEntry(entry.getName());
                next.setTime(0);
                target.putNextEntry(next);
                target.write(source.getInputStream(entry).readAllBytes());
                target.closeEntry();
                retained++;
            }
        }
        verifySlice(original, output, owned);
        System.out.println("R-owned definitions removed=" + removed + ", external entries retained=" + retained);
    }
}
