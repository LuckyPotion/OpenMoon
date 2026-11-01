import java.lang.reflect.Field;
import java.util.*;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;

/** The pinned ASM analyzer with exactly the same transfers/merges and fixed point.
 * Only the pending-work multiset order changes, to fair pending rounds, with normal-CFG reverse postorder within a round.
 * No node is added, removed, capped, widened, or declared proved early.
 * ASM 9.9.1 is SHA-locked; a changed scheduler ABI fails before analysis.
 */
class OrderedSourceAnalyzer114<V extends Value> extends Analyzer<V> implements Opcodes {
 private static final Field PENDING,COUNT;
 static {try{PENDING=Analyzer.class.getDeclaredField("instructionsToProcess");COUNT=Analyzer.class.getDeclaredField("numInstructionsToProcess");if(PENDING.getType()!=int[].class||COUNT.getType()!=int.class)throw new IllegalStateException("pinned ASM scheduler field types changed");PENDING.setAccessible(true);COUNT.setAccessible(true);}catch(ReflectiveOperationException e){throw new ExceptionInInitializerError(e);}}
 private int[] priority;private long[] rounds;private int lastFrom=-1;
 OrderedSourceAnalyzer114(Interpreter<V> interpreter){super(interpreter);}
 @Override protected void init(String owner,MethodNode m)throws AnalyzerException {super.init(owner,m);priority=reversePostorder(m);rounds=new long[priority.length];lastFrom=-1;}
 private static int[] reversePostorder(MethodNode m){
  AbstractInsnNode[] nodes=m.instructions.toArray();int n=nodes.length;int[][] next=new int[n][];
  for(int i=0;i<n;i++){var node=nodes[i];List<Integer> edges=new ArrayList<>();int op=node.getOpcode();
   if(node instanceof JumpInsnNode j){edges.add(m.instructions.indexOf(j.label));if(op!=GOTO&&op!=JSR&&i+1<n)edges.add(i+1);}
   else if(node instanceof TableSwitchInsnNode t){edges.add(m.instructions.indexOf(t.dflt));for(var l:t.labels)edges.add(m.instructions.indexOf(l));}
   else if(node instanceof LookupSwitchInsnNode t){edges.add(m.instructions.indexOf(t.dflt));for(var l:t.labels)edges.add(m.instructions.indexOf(l));}
   else if(op!=ATHROW&&op!=RET&&!(op>=IRETURN&&op<=RETURN)&&i+1<n)edges.add(i+1);
   next[i]=edges.stream().mapToInt(Integer::intValue).toArray();for(int target:next[i])if(target<0||target>=n)throw new IllegalArgumentException("normal CFG scheduler target outside method");
  }
  int[] rank=new int[n],cursor=new int[n];boolean[] seen=new boolean[n];Arrays.fill(rank,Integer.MAX_VALUE);int assigned=n-1;
  for(int root=0;root<n;root++)if(!seen[root]){ArrayDeque<Integer> stack=new ArrayDeque<>();seen[root]=true;stack.push(root);while(!stack.isEmpty()){int at=stack.peek();if(cursor[at]<next[at].length){int to=next[at][cursor[at]++];if(!seen[to]){seen[to]=true;stack.push(to);}}else{rank[at]=assigned--;stack.pop();}}}
  return rank;
 }
 @Override protected void newControlFlowEdge(int from,int to){super.newControlFlowEdge(from,to);if(from!=lastFrom){rounds[from]++;lastFrom=from;}prioritizePending();}
 private void prioritizePending(){
  if(priority==null)return;
  try{int size=COUNT.getInt(this);if(size<2)return;int[] pending=(int[])PENDING.get(this);if(size>pending.length)throw new IllegalStateException("pinned ASM worklist bounds changed");int best=size-1;for(int i=0;i<size-1;i++)if(rounds[pending[i]]<rounds[pending[best]]||rounds[pending[i]]==rounds[pending[best]]&&priority[pending[i]]<priority[pending[best]])best=i;if(best!=size-1){int value=pending[size-1];pending[size-1]=pending[best];pending[best]=value;}}
  catch(IllegalAccessException e){throw new IllegalStateException("pinned ASM pending-order access failed",e);}
 }
}
