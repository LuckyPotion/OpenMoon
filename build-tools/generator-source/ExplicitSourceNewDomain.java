import java.util.*;import org.objectweb.asm.tree.*;
/** Author-only exact fresh source allocation marker. No target Code or frame input. */
public final class ExplicitSourceNewDomain {
 static final Map<MethodNode,Set<AbstractInsnNode>> births=new WeakHashMap<>();
 static void register(MethodNode m,AbstractInsnNode n){ExecutableVerify.need(n instanceof TypeInsnNode&&n.getOpcode()==187,"source-only actual NEW birth");births.computeIfAbsent(m,k->Collections.newSetFromMap(new IdentityHashMap<>())).add(n);}
 static boolean allowed(MethodNode m,AbstractInsnNode n){return births.getOrDefault(m,Set.of()).contains(n);}
}
