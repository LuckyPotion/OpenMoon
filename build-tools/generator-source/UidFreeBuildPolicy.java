import com.google.gson.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.commons.*;

/** Enforces the production/reference boundary without loading client classes. */
public final class UidFreeBuildPolicy implements Opcodes {
    private static final List<Map<String,String>> titleChanges = new ArrayList<>();
    private static final List<Map<String,String>> interactionChanges = new ArrayList<>();
    private static final Set<String> sentinelOwners = Set.of("com/moon/cY", "com/moon/ct", "com/moon/fW", "com/moon/n0",
        "moom/jI", "net/minecraft/client/Minecraft", "net/minecraft/client/entity/EntityPlayerSP",
        "net/minecraft/client/renderer/EntityRenderer", "net/minecraft/world/World");
    private static boolean legacy(String value) {
        return value != null && (value.contains("com/moon/security/")
            || value.matches(".*(?:^|[L\\s])com/moon/(?:cn|ph)(?:;|\\.|$).*" )
            || value.contains("com/moon/obfuscator/Loader")
            || value.contains("com/moon/obfuscator/Bootstrap")
            || value.contains("com/moon/obfuscator/NativeLoader"));
    }
    public static int removeLegacyTitleSentinel(ClassNode owner) {
        if (!sentinelOwners.contains(owner.name)) return 0;
        int changed = 0;
        for (MethodNode method : owner.methods) {
            for (AbstractInsnNode instruction : method.instructions.toArray()) {
                if (!(instruction instanceof MethodInsnNode call)
                    || !call.owner.equals("java/lang/String") || !call.name.equals("contains")
                    || !call.desc.equals("(Ljava/lang/CharSequence;)Z")) continue;
                AbstractInsnNode literal = instruction.getPrevious();
                while (literal != null && literal.getOpcode() < 0) literal = literal.getPrevious();
                if (!(literal instanceof LdcInsnNode text) || !"\n".equals(text.cst)) continue;
                AbstractInsnNode title = literal.getPrevious();
                while (title != null && title.getOpcode() < 0) title = title.getPrevious();
                if (!(title instanceof MethodInsnNode getTitle)
                    || !getTitle.owner.equals("org/lwjgl/opengl/Display")
                    || !getTitle.name.equals("getTitle")) continue;
                // The old title marker was exclusively a verifier sentinel.
                // Ordinary readiness continues to be tracked by local startup.
                // Keep the operand evaluation and existing exception/frame
                // boundaries. Discard only the old title-based condition.
                method.instructions.insertBefore(instruction, new InsnNode(POP2));
                method.instructions.set(instruction, new InsnNode(ICONST_1));
                titleChanges.add(Map.of("owner", owner.name, "method", method.name + method.desc));
                changed++;
            }
        }
        return changed;
    }
    private static AbstractInsnNode nextInstruction(AbstractInsnNode at) {
        do { at = at.getNext(); } while (at != null && at.getOpcode() < 0);
        return at;
    }
    private static void removeInteractionLicenseConditions(ClassNode owner) {
        if (!owner.name.equals("net/minecraft/client/renderer/EntityRenderer")) return;
        int changed = 0;
        for (MethodNode method : owner.methods) {
            if (!method.name.equals("a") || !method.desc.equals("(F)V")) continue;
            for (AbstractInsnNode instruction : method.instructions.toArray()) {
                if (!(instruction instanceof FieldInsnNode field) || field.getOpcode() != GETSTATIC
                    || !field.owner.equals("com/moon/runtime/LocalClientState")
                    || !field.name.equals("a") || !field.desc.equals("Ljava/lang/String;")) continue;
                AbstractInsnNode next = nextInstruction(field);
                String condition;
                if (next instanceof JumpInsnNode jump && jump.getOpcode() == IFNONNULL) {
                    method.instructions.insertBefore(jump, new InsnNode(POP));
                    method.instructions.insertBefore(jump, new InsnNode(ICONST_1));
                    method.instructions.set(jump, new JumpInsnNode(IFNE, jump.label));
                    condition = "remove_license_null_reach_restriction";
                } else if (next instanceof JumpInsnNode jump && jump.getOpcode() == IFNULL) {
                    method.instructions.insertBefore(jump, new InsnNode(POP));
                    method.instructions.insertBefore(jump, new InsnNode(ICONST_1));
                    method.instructions.set(jump, new JumpInsnNode(IFEQ, jump.label));
                    condition = "remove_license_entity_selection_restriction";
                } else if (next instanceof LdcInsnNode literal && literal.cst instanceof String
                    && nextInstruction(literal) instanceof MethodInsnNode call
                    && call.owner.equals("java/lang/String") && call.name.equals("equals")
                    && call.desc.equals("(Ljava/lang/Object;)Z")) {
                    method.instructions.insertBefore(call, new InsnNode(POP2));
                    method.instructions.set(call, new InsnNode(ICONST_1));
                    condition = "remove_license_string_reach_restriction";
                } else throw new IllegalStateException("Unexpected interaction license guard shape");
                method.instructions.set(field, new InsnNode(ACONST_NULL));
                interactionChanges.add(Map.of("owner", owner.name, "method", method.name + method.desc, "condition", condition));
                changed++;
            }
        }
        if (changed != 3) throw new IllegalStateException("Expected exactly three interaction license conditions, found " + changed);
    }
    public static void apply(ClassNode owner) {
        removeLegacyTitleSentinel(owner);
        removeInteractionLicenseConditions(owner);
    }
    public static Map<String,Object> changes() {
        return Map.of("title_sentinels", titleChanges, "interaction_conditions", interactionChanges);
    }
    public static void requireExpectedChanges() {
        if (titleChanges.size() != 22 || interactionChanges.size() != 3)
            throw new IllegalStateException("UID-free guard coverage differs: titles=" + titleChanges.size()
                + ", interactions=" + interactionChanges.size());
    }
    public static void audit(Path archive, Path report, Set<String> forbiddenResources) throws Exception {
        List<String> failures = new ArrayList<>();
        int classes = 0, nativeMethods = 0;
        try (ZipFile zip = new ZipFile(archive.toFile())) {
            for (ZipEntry entry : Collections.list(zip.entries())) {
                if (forbiddenResources.contains(entry.getName())) failures.add("legacy resource: " + entry.getName());
                if (!entry.getName().endsWith(".class")) continue;
                ClassNode owner = new ClassNode();
                new ClassReader(zip.getInputStream(entry).readAllBytes()).accept(owner, 0);
                classes++;
                owner.accept(new ClassRemapper(new ClassWriter(0), new Remapper(ASM9) {
                    public String map(String name) {
                        if (legacy(name)) failures.add("legacy type linkage: " + name);
                        return name;
                    }
                }));
                if (legacy(owner.name)) failures.add("legacy class: " + owner.name);
                for (FieldNode field : owner.fields) if (legacy(field.desc)) failures.add(owner.name + "." + field.name + field.desc);
                for (MethodNode method : owner.methods) {
                    if ((method.access & ACC_NATIVE) != 0) nativeMethods++;
                    if (legacy(method.desc)) failures.add(owner.name + "." + method.name + method.desc);
                    for (AbstractInsnNode instruction : method.instructions) {
                        String target = instruction instanceof MethodInsnNode x ? x.owner + "." + x.name + x.desc
                            : instruction instanceof FieldInsnNode x ? x.owner + "." + x.name + x.desc
                            : instruction instanceof TypeInsnNode x ? x.desc : "";
                        if (legacy(target)) failures.add(owner.name + "." + method.name + " -> " + target);
                        if (instruction instanceof FieldInsnNode field && field.owner.equals("com/moon/runtime/LocalClientState")
                            && field.name.equals("a") && field.desc.equals("Ljava/lang/String;"))
                            failures.add(owner.name + "." + method.name + " retains an interaction license-state read");
                        if (instruction instanceof LdcInsnNode ldc && "moon.input-uid".equals(ldc.cst))
                            failures.add(owner.name + "." + method.name + " retains UID input property");
                    }
                }
            }
        }
        if (nativeMethods != 0) failures.add("Unexpected owned native methods: " + nativeMethods);
        Files.writeString(report, new GsonBuilder().setPrettyPrinting().create().toJson(Map.of(
            "status", failures.isEmpty() ? "uid_verifier_excluded" : "failed",
            "classes", classes, "owned_native_methods", nativeMethods,
            "title_sentinel_changes", titleChanges, "interaction_condition_changes", interactionChanges,
            "failure_count", failures.size(), "failures", failures,
            "client_initialized", false)), StandardOpenOption.CREATE_NEW);
        if (!failures.isEmpty()) throw new IllegalStateException("UID verification boundary failed: " + failures);
    }
}
