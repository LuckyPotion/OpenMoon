import java.util.*;import org.objectweb.asm.tree.*;import org.objectweb.asm.tree.analysis.*;
/** Exact immutable identity sets with a per-interpreter monotone node dictionary.
 * Iteration/contains/equality/hashCode expose the original AbstractInsnNode objects.
 * No origin quotient, cardinality cap, widening, shared cache or skipped merge.
 */
final class ExactOrigins069 {
 final IdentityHashMap<AbstractInsnNode,Integer> ids=new IdentityHashMap<>();
 final ArrayList<AbstractInsnNode> nodes=new ArrayList<>();
 int id(AbstractInsnNode n){Integer i=ids.get(n);if(i==null){i=nodes.size();ids.put(n,i);nodes.add(n);}return i;}
 BitSet bits(Set<AbstractInsnNode> s){
  if(s instanceof Origins o&&o.domain==this)return(BitSet)o.bits.clone();
  var b=new BitSet();for(var n:s)b.set(id(n));return b;
 }
 SourceValue merge(SourceValue a,SourceValue b){
  if(a==b)return a;
  int size=Math.min(a.size,b.size);
  if(a.insns.isEmpty()&&b.insns.isEmpty())return size==a.size?a:b;
  if(a.insns instanceof Origins x&&x.domain==this&&b.insns instanceof Origins y&&y.domain==this&&x.bits.equals(y.bits))return size==a.size?a:b;
  var ab=bits(a.insns);
  if(b.insns instanceof Origins y&&y.domain==this)ab.or(y.bits);else ab.or(bits(b.insns));
  if(size==a.size&&same(ab,a.insns))return a;
  if(size==b.size&&same(ab,b.insns))return b;
  return new SourceValue(size,new Origins(this,ab,true));
 }
 boolean same(BitSet b,Set<AbstractInsnNode>s){
  if(s instanceof Origins o&&o.domain==this)return b.equals(o.bits);
  if(b.cardinality()!=s.size())return false;
  for(var n:s){Integer i=ids.get(n);if(i==null||!b.get(i))return false;}return true;
 }
 static final class Origins extends AbstractSet<AbstractInsnNode>{
  final ExactOrigins069 domain;final BitSet bits;final int size;
  Origins(ExactOrigins069 d,BitSet b){domain=d;bits=(BitSet)b.clone();size=bits.cardinality();}
  private Origins(ExactOrigins069 d,BitSet b,boolean exclusivelyOwned){domain=d;bits=b;size=bits.cardinality();}
  public int size(){return size;}
  public boolean contains(Object n){Integer i=domain.ids.get(n);return i!=null&&bits.get(i);}
  public Iterator<AbstractInsnNode> iterator(){return new Iterator<AbstractInsnNode>(){
   int at=bits.nextSetBit(0);public boolean hasNext(){return at>=0;}public AbstractInsnNode next(){if(at<0)throw new NoSuchElementException();var n=domain.nodes.get(at);at=bits.nextSetBit(at+1);return n;}
  };}
  public boolean equals(Object x){if(x==this)return true;if(x instanceof Origins o&&o.domain==domain)return bits.equals(o.bits);return super.equals(x);}
 }
}
