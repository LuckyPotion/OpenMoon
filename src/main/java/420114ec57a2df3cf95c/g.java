package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class g<T> extends com.google.common.collect.UnmodifiableIterator<T[]> {

private int a;

private java.lang.Iterable<? extends T>[] b;

private java.util.Iterator<? extends T>[] c;

private T[] d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private g(java.lang.Class<T> p0, java.lang.Iterable<? extends T>[] p1) { super(); }

private static void __sourceConstructorBody_b4b247dc45db9841(moom.g receiver, java.lang.Class p0, java.lang.Iterable[] p1) throws Throwable {
init_join_53: {
    init_join_46: {
    long local3_life2 = (moom.g.e ^ 57177350991958L);
    moom.g.__sourceConstructorInit_b4b247dc45db9841_0(((moom.g)(receiver)));
    boolean __sourceSpill653_8 = moom.DS.c__Boolean();
    ((moom.g)(receiver)).a = ((int)(__sourceIntrinsic_b4b247dc45db9841_originalDynamicSite653_6(20992, (7390393714374339875L ^ local3_life2))));
    boolean local5_life9 = __sourceSpill653_8;
    ((moom.g)(receiver)).b = ((java.lang.Iterable[])(p1));
    ((moom.g)(receiver)).c = ((java.util.Iterator[])(((java.util.Iterator[])(__sourceExactCall_04a2a135697ed3(((java.lang.Class)(java.util.Iterator.class)), ((int)((((moom.g)(receiver)).b).length)))))));
    int local6_life16 = 0;
    init_cycle_28: while (true) {
    if (!((local6_life16 < (((moom.g)(receiver)).b).length))) {
        break init_join_46;
    }
    (((moom.g)(receiver)).c)[local6_life16] = ((java.lang.Iterable)((p1)[local6_life16])).iterator();
    local6_life16 += 1;
    if (!(local5_life9)) {
        break init_join_53;
    }
    if (!((!local5_life9))) { continue init_cycle_28; }
    break init_cycle_28;
    }
    }
    ((moom.g)(receiver)).d = ((java.lang.Object[])(__sourceExactCall_04a2a135697ed3(((java.lang.Class)(p0)), ((int)((((moom.g)(receiver)).c).length)))));
    }
    return;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(2839892642500706732L)), ((long)(9005383375380770648L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(88687938024705L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.g.e ^ 121540283373982L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill844_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill844_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill844_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill844_14 = new byte[8];
    (__sourceSpill844_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill844_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation844_16 = __sourceSpill844_14;
    ((javax.crypto.Cipher)(__sourceSpill844_11)).init(((int)(__sourceSpill844_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill844_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation844_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "£ø¿½¡¤Å2©¾Ñ\001û¯"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill844_25 = local6_life21;
        int __sourceSpill844_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill844_25)).substring(((int)(__sourceSpill844_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill844_30 = local8_life19;
        int __sourceSpill844_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill844_33 = new byte[8];
        (__sourceSpill844_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill844_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill844_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill844_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill844_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill844_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill844_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill844_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill844_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill844_34)).doFinal(((byte[])(__sourceSpill844_33)));
        (__sourceSpill844_30)[__sourceSpill844_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_b4b247dc45db9841_0(moom.g a0) throws E;

public boolean hasNext() {
int lexicalValue1174_49_0;
    int lexicalValue1174_57_0;
    int lexicalValue1174_57_1;
    int lexicalValue1174_85_0;
    int lexicalValue1174_109_0;
    int lexicalValue1174_124_0;
    int lexicalValue1174_128_0;
    int lexicalValue1174_130_0;
    int spill1174_0;
    int spill1174_1;
    boolean spill1174_2;
    int spill1174_3;
    boolean spill1174_4;
    long life1_3;
    int life3_5;
    java.util.Iterator[] life4_24;
    int life5_27;
    int life6_29;
    java.util.Iterator life7_36;
    java.util.Iterator life4_94;
    java.util.Iterator life4_137;
    lexical_join_130: {
    lexical_join_129: {
    lexical_join_128: {
    lexical_join_124: {
    lexical_join_122: {
    lexical_join_57: {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_48: {
    life1_3 = (moom.g.e ^ 129495335478386L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1174_0 = this.a;
    spill1174_1 = __sourceIntrinsic_b8e24fa35d15_invokedynamic1174_4(31911, (8954836655564298145L ^ life1_3));
    if (!((life3_5 == 0))) {
        lexicalValue1174_57_0 = spill1174_0;
        lexicalValue1174_57_1 = spill1174_1;
        break lexical_join_57;
    }
    if (!((spill1174_0 == spill1174_1))) {
        break lexical_join_50;
    }
    this.a = ((int)(0));
    life4_24 = this.c;
    life5_27 = (life4_24).length;
    life6_29 = 0;
    lexical_cycle_27: while (true) {
    lexical_join_46: {
    lexical_join_45: {
    if (!((life6_29 < life5_27))) {
        break lexical_join_48;
    }
    life7_36 = (life4_24)[life6_29];
    if (!((life3_5 == 0))) {
        break lexical_join_46;
    }
    spill1174_2 = ((java.util.Iterator)(life7_36)).hasNext();
    if (!((life3_5 == 0))) {
        lexicalValue1174_49_0 = ((spill1174_2) ? 1 : 0);
        break lexical_join_49;
    }
    if (!((!spill1174_2))) {
        break lexical_join_45;
    }
    ((moom.g)(this)).a();
    if (!((life3_5 != 0))) {
        break lexical_join_48;
    }
    }
    life6_29 += 1;
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    lexicalValue1174_49_0 = 1;
    }
    return ((lexicalValue1174_49_0) != 0);
    }
    spill1174_3 = this.a;
    if (!((life3_5 == 0))) {
        lexicalValue1174_124_0 = spill1174_3;
        break lexical_join_124;
    }
    lexicalValue1174_57_0 = spill1174_3;
    lexicalValue1174_57_1 = (this.c).length;
    }
    if (!((lexicalValue1174_57_0 >= lexicalValue1174_57_1))) {
        break lexical_join_122;
    }
    this.a = ((int)(((this.c).length - 1)));
    lexical_cycle_65: while (true) {
    lexical_join_120: {
    lexical_join_114: {
    lexical_join_109: {
    lexical_join_92: {
    lexical_join_85: {
    lexical_join_83: {
    if (!((this.a >= 0))) {
        break lexical_join_122;
    }
    life4_94 = (this.c)[this.a];
    spill1174_4 = ((java.util.Iterator)(life4_94)).hasNext();
    if (!((life3_5 == 0))) {
        lexicalValue1174_124_0 = ((spill1174_4) ? 1 : 0);
        break lexical_join_124;
    }
    if (!((life3_5 == 0))) {
        lexicalValue1174_85_0 = ((spill1174_4) ? 1 : 0);
        break lexical_join_85;
    }
    if (!(spill1174_4)) {
        break lexical_join_83;
    }
    if (!((life3_5 != 0))) {
        break lexical_join_122;
    }
    }
    lexicalValue1174_85_0 = this.a;
    }
    if (!((life3_5 == 0))) {
        lexicalValue1174_109_0 = lexicalValue1174_85_0;
        break lexical_join_109;
    }
    if (!((lexicalValue1174_85_0 == 0))) {
        break lexical_join_92;
    }
    ((moom.g)(this)).a();
    if (!((life3_5 != 0))) {
        break lexical_join_122;
    }
    }
    life4_137 = ((java.lang.Iterable)((this.b)[this.a])).iterator();
    (this.c)[this.a] = life4_137;
    if (!((life3_5 == 0))) {
        break lexical_join_120;
    }
    lexicalValue1174_109_0 = ((((java.util.Iterator)(life4_137)).hasNext()) ? 1 : 0);
    }
    if (!((lexicalValue1174_109_0 == 0))) {
        break lexical_join_114;
    }
    ((moom.g)(this)).a();
    if (!((life3_5 != 0))) {
        break lexical_join_122;
    }
    }
    moom.g __stackOp1174_31_0 = this;
    ((moom.g)(__stackOp1174_31_0)).a = ((int)((((moom.g)(__stackOp1174_31_0)).a - 1)));
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_65; }
    break lexical_cycle_65;
    }
    }
    lexicalValue1174_124_0 = this.a;
    }
    if (!((life3_5 == 0))) {
        lexicalValue1174_128_0 = lexicalValue1174_124_0;
        break lexical_join_128;
    }
    if (!((lexicalValue1174_124_0 >= 0))) {
        break lexical_join_129;
    }
    lexicalValue1174_128_0 = 1;
    }
    lexicalValue1174_130_0 = lexicalValue1174_128_0;
    break lexical_join_130;
    }
    lexicalValue1174_130_0 = 0;
    }
    return ((lexicalValue1174_130_0) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7654_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/g"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.g.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18664;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = f[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/g", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static java.util.NoSuchElementException a(java.util.NoSuchElementException p0) {
return p0;
}


private void a() {
this.a = ((int)(-1));
    java.util.Arrays.fill(((java.lang.Object[])(this.c)), ((java.lang.Object)(null)));
    java.util.Arrays.fill(((java.lang.Object[])(this.d)), ((java.lang.Object)(null)));
    return;
}


public T[] a__ArrayObject() {
int forestValue900084_43_0;
    java.lang.Object forestValue900084_75_0;
    boolean spill900084_0;
    moom.g spill900084_1;
    moom.g spill900084_2;
    int spill900084_3;
    long life1_3;
    int life3_5;
    forest_join_75: {
    forest_join_72: {
    forest_join_43: {
    forest_join_15: {
    life1_3 = (moom.g.e ^ 139831659645236L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill900084_0 = ((moom.g)(this)).hasNext();
    if (!((life3_5 == 0))) {
        forestValue900084_43_0 = ((spill900084_0) ? 1 : 0);
        break forest_join_43;
    }
    if (!((!spill900084_0))) {
        break forest_join_15;
    }
    throw new java.util.NoSuchElementException();
    }
    forest_cycle_15: while (true) {
    if (!((this.a < (this.c).length))) {
        break forest_join_72;
    }
    (this.d)[this.a] = ((T)(((java.util.Iterator)((this.c)[this.a])).next()));
    spill900084_1 = this;
    if (!((life3_5 == 0))) {
        forestValue900084_75_0 = spill900084_1;
        break forest_join_75;
    }
    moom.g __stackOp900084_12_0 = spill900084_1;
    ((moom.g)(__stackOp900084_12_0)).a = ((int)((((moom.g)(__stackOp900084_12_0)).a + 1)));
    if (!((life3_5 != 0))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    break forest_join_72;
    }
    forest_cycle_43: while (true) {
    forest_join_69: {
    if (!((forestValue900084_43_0 < (this.c).length))) {
        break forest_join_72;
    }
    (this.d)[this.a] = ((T)(((java.util.Iterator)((this.c)[this.a])).next()));
    spill900084_2 = this;
    if (!((life3_5 == 0))) {
        forestValue900084_75_0 = spill900084_2;
        break forest_join_75;
    }
    moom.g __stackOp900084_21_0 = spill900084_2;
    ((moom.g)(__stackOp900084_21_0)).a = ((int)((((moom.g)(__stackOp900084_21_0)).a + 1)));
    if (!((life3_5 != 0))) {
        break forest_join_69;
    }
    break forest_join_72;
    }
    spill900084_3 = this.a;
    forestValue900084_43_0 = spill900084_3;
    continue forest_cycle_43;
    }
    }
    forestValue900084_75_0 = ((java.lang.Object[])(this.d)).clone();
    }
    return (((T[])((java.lang.Object[])(forestValue900084_75_0))));
}


private static native <E extends Throwable> int __sourceIntrinsic_b4b247dc45db9841_originalDynamicSite653_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7654_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b8e24fa35d15_invokedynamic1174_4(int a0, long a1) throws E;

public java.lang.Object next__sourceBridge_0502b11602() {
return ((moom.g)(this)).a__ArrayObject();
}

public T[] next() { return ((T[])(this.next__sourceBridge_0502b11602())); }

private static native java.lang.Object[] __sourceExactCall_04a2a135697ed3(java.lang.Class p0, int p1);
}
