package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mt {

private static int a;

private static int b;

private static int c;

private java.util.BitSet d;

private static int[] e;

private int f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public mt() { super(); }


private static void __sourceConstructorBody_e8b2964dc6b920a5(moom.mt receiver) throws Throwable {

long local1 = (moom.mt.g ^ 16325321428770L);

    moom.mt.__sourceConstructorInit_e8b2964dc6b920a5_0(((moom.mt)(receiver)));

    ((moom.mt)(receiver)).d = ((java.util.BitSet)(new java.util.BitSet(__sourceIntrinsic_e8b2964dc6b920a5_originalDynamicSite3114_2(8083, (3907384104113227052L ^ local1)))));

    ((moom.mt)(receiver)).f = ((int)(__sourceIntrinsic_e8b2964dc6b920a5_originalDynamicSite3114_4(8083, (3907384104113227052L ^ local1))));

    return;

}



static {
javax.crypto.Cipher forestValue484_36_0;
    int forestValue484_36_1;
    javax.crypto.SecretKeyFactory forestValue484_36_2;
    byte[] forestValue484_36_3;
    javax.crypto.Cipher forestValue484_53_0;
    int forestValue484_53_1;
    javax.crypto.SecretKeyFactory forestValue484_53_2;
    byte[] forestValue484_53_3;
    long[] forestValue484_157_0;
    int forestValue484_157_1;
    long forestValue484_157_2;
    int forestValue484_157_3;
    long[] forestValue484_300_0;
    int forestValue484_300_1;
    long forestValue484_300_2;
    long[] forestValue484_312_0;
    int forestValue484_312_1;
    long forestValue484_312_2;
    javax.crypto.Cipher spill484_0;
    int spill484_1;
    javax.crypto.SecretKeyFactory spill484_2;
    byte[] spill484_3;
    byte[] spill484_4;
    java.lang.String spill484_5;
    int spill484_6;
    int spill484_7;
    long spill484_8;
    byte[] spill484_9;
    byte[] spill484_10;
    byte[] spill484_11;
    byte[] spill484_12;
    byte[] spill484_13;
    byte[] spill484_14;
    byte[] spill484_15;
    byte[] spill484_16;
    long spill484_17;
    int spill484_18;
    java.lang.String spill484_19;
    int spill484_20;
    long[] spill484_21;
    int spill484_22;
    long spill484_23;
    int spill484_24;
    long life11_11;
    javax.crypto.Cipher life0_20;
    int life1_35;
    long[] life6_66;
    int life3_68;
    java.lang.String life4_71;
    int life5_73;
    int life2_75;
    byte[] life7_83;
    long life8_160;
    byte[] life10_228;
    byte[] life7_325;
    int life13_429;
    int life14_435;
    int life15_437;
    int life16_439;
    int life17_448;
    int life18_457;
    forest_join_504: {
    forest_join_399: {
    forest_join_53: {
    g = ((long)(((moom._a)(moom._c.a(((long)(-4343476282080865799L)), ((long)(7124056133865387469L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(78239377979255L)))));
    life11_11 = (moom.mt.g ^ 30945825748610L);
    j = ((java.util.Map)(new java.util.HashMap(13)));
    spill484_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill484_1 = 2;
    spill484_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp484_9_0 = new byte[8];
    spill484_3 = __stackOp484_9_0;
    (__stackOp484_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue484_36_0 = spill484_0;
    forestValue484_36_1 = spill484_1;
    forestValue484_36_2 = spill484_2;
    forestValue484_36_3 = spill484_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue484_53_0 = forestValue484_36_0;
        forestValue484_53_1 = forestValue484_36_1;
        forestValue484_53_2 = forestValue484_36_2;
        forestValue484_53_3 = forestValue484_36_3;
        break forest_join_53;
    }
    byte[] __stackOp484_10_0 = forestValue484_36_3;
    spill484_4 = __stackOp484_10_0;
    (__stackOp484_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue484_36_3 = spill484_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue484_53_0)).init(((int)(forestValue484_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue484_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue484_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[11];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "¡\fÑ%R\022ã ÇÌÑ.Ís rE\013xR9y\bîú)½¹\tåÐý¯RgfµàeäÂñ«ß=²¸·:êH\016\021OEù&DV"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill484_5 = life4_71;
    spill484_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill484_5)).substring(((int)(spill484_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue484_157_0 = life6_66;
    forestValue484_157_1 = (life3_68++);
    forestValue484_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue484_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp484_16_0 = forestValue484_157_2;
    int __stackOp484_16_1 = forestValue484_157_3;
    spill484_7 = __stackOp484_16_1;
    spill484_8 = __stackOp484_16_0;
    recovery.source.CarrierOps.discard(__stackOp484_16_1);
    life8_160 = spill484_8;
    byte[] __stackOp484_18_0 = new byte[8];
    spill484_9 = __stackOp484_18_0;
    (__stackOp484_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp484_19_0 = spill484_9;
    spill484_10 = __stackOp484_19_0;
    (__stackOp484_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp484_20_0 = spill484_10;
    spill484_11 = __stackOp484_20_0;
    (__stackOp484_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp484_21_0 = spill484_11;
    spill484_12 = __stackOp484_21_0;
    (__stackOp484_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp484_22_0 = spill484_12;
    spill484_13 = __stackOp484_22_0;
    (__stackOp484_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp484_23_0 = spill484_13;
    spill484_14 = __stackOp484_23_0;
    (__stackOp484_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp484_24_0 = spill484_14;
    spill484_15 = __stackOp484_24_0;
    (__stackOp484_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp484_25_0 = spill484_15;
    spill484_16 = __stackOp484_25_0;
    (__stackOp484_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp484_26_0 = spill484_16;
    javax.crypto.Cipher __stackOp484_26_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp484_26_1)).doFinal(((byte[])(__stackOp484_26_0)));
    int __stackOp484_28_0 = spill484_7;
    long __stackOp484_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill484_17 = __stackOp484_28_1;
    spill484_18 = __stackOp484_28_0;
    recovery.source.CarrierOps.discard(__stackOp484_28_1);
    switch (spill484_18) {
default:
{
        forestValue484_300_0 = forestValue484_157_0;
        forestValue484_300_1 = forestValue484_157_1;
        forestValue484_300_2 = spill484_17;
        break forest_join_300;
    }
case 0:
{
        forestValue484_312_0 = forestValue484_157_0;
        forestValue484_312_1 = forestValue484_157_1;
        forestValue484_312_2 = spill484_17;
        break forest_join_312;
    }
}
    }
    (forestValue484_300_0)[forestValue484_300_1] = forestValue484_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = "-\030á2ZX\024´àïÓzÔð"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue484_312_0)[forestValue484_312_1] = forestValue484_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill484_19 = life4_71;
    spill484_20 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill484_19)).substring(((int)(spill484_20)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill484_21 = life6_66;
    spill484_22 = (life3_68++);
    spill484_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill484_24 = 0;
    forestValue484_157_0 = spill484_21;
    forestValue484_157_1 = spill484_22;
    forestValue484_157_2 = spill484_23;
    forestValue484_157_3 = spill484_24;
    continue forest_cycle_157;
    }
    }
    }
    h = ((long[])(life6_66));
    i = ((java.lang.Integer[])(new java.lang.Integer[11]));
    a = ((int)(((int) java.lang.Math.pow(((double)(0x1.0p4d)), ((double)(0x0.0p0d))))));
    b = ((int)(((int) java.lang.Math.pow(((double)(0x1.0p4d)), ((double)(0x1.0p0d))))));
    c = ((int)(((int) java.lang.Math.pow(((double)(0x1.0p4d)), ((double)(0x1.0p1d))))));
    e = ((int[])(new int[__sourceIntrinsic_eb8803ad1f63_invokedynamic484_41(22117, (4794133606143751545L ^ life11_11))]));
    life13_429 = 0;
    life14_435 = __sourceIntrinsic_eb8803ad1f63_invokedynamic484_43(17273, (4361919265917263975L ^ life11_11));
    life15_437 = 0;
    life16_439 = 0;
    forest_cycle_438: while (true) {
    forest_join_502: {
    if (!((life16_439 < __sourceIntrinsic_eb8803ad1f63_invokedynamic484_44(2128, (105126112983952199L ^ life11_11))))) {
        break forest_join_504;
    }
    life17_448 = 0;
    forest_cycle_447: while (true) {
    forest_join_500: {
    if (!((life17_448 < __sourceIntrinsic_eb8803ad1f63_invokedynamic484_45(7154, (8294671349973694703L ^ life11_11))))) {
        break forest_join_502;
    }
    life18_457 = 0;
    forest_cycle_456: while (true) {
    forest_join_498: {
    forest_join_490: {
    if (!((life18_457 < __sourceIntrinsic_eb8803ad1f63_invokedynamic484_46(7154, (8294671349973694703L ^ life11_11))))) {
        break forest_join_500;
    }
    if (!((life16_439 != 0))) {
        break forest_join_490;
    }
    if (!((life16_439 != __sourceIntrinsic_eb8803ad1f63_invokedynamic484_47(17273, (4361919265917263975L ^ life11_11))))) {
        break forest_join_490;
    }
    if (!((life17_448 != 0))) {
        break forest_join_490;
    }
    if (!((life17_448 != __sourceIntrinsic_eb8803ad1f63_invokedynamic484_48(17273, (4361919265917263975L ^ life11_11))))) {
        break forest_join_490;
    }
    if (!((life18_457 != 0))) {
        break forest_join_490;
    }
    if (!((life18_457 == __sourceIntrinsic_eb8803ad1f63_invokedynamic484_49(17273, (4361919265917263975L ^ life11_11))))) {
        break forest_join_498;
    }
    }
    (moom.mt.e)[(life15_437++)] = moom.mt.a(((int)(life16_439)), ((int)(life17_448)), ((int)(life18_457)));
    }
    life18_457 += 1;
    continue forest_cycle_456;
    }
    }
    life17_448 += 1;
    continue forest_cycle_447;
    }
    }
    life16_439 += 1;
    continue forest_cycle_438;
    }
    }
}

private static native <E extends Throwable> void __sourceConstructorInit_e8b2964dc6b920a5_0(moom.mt a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


private int a(int p0, moom.bs p1) {
long local3 = (moom.mt.g ^ 35043308201482L);
    switch ((moom.mu.a)[((moom.bs)(p1)).ordinal()]) {
case 1:
{
        if ((((p0 >> __sourceIntrinsic_275f0d9b7270_invokedynamic6968_3(8936, (2841430937254826358L ^ local3))) & __sourceIntrinsic_275f0d9b7270_invokedynamic6968_4(2513, (5616310516562868800L ^ local3))) == 0)) {
        return -1;
    }
        return (p0 - moom.mt.c);
    }
case 2:
{
        if ((((p0 >> __sourceIntrinsic_275f0d9b7270_invokedynamic6968_6(8936, (2841430937254826358L ^ local3))) & __sourceIntrinsic_275f0d9b7270_invokedynamic6968_7(17273, (4361918260811329775L ^ local3))) == __sourceIntrinsic_275f0d9b7270_invokedynamic6968_8(17273, (4361918260811329775L ^ local3)))) {
        return -1;
    }
        return (p0 + moom.mt.c);
    }
case 3:
{
        if ((((p0 >> 4) & __sourceIntrinsic_275f0d9b7270_invokedynamic6968_10(17273, (4361918260811329775L ^ local3))) == 0)) {
        return -1;
    }
        return (p0 - moom.mt.b);
    }
case 4:
{
        if ((((p0 >> 4) & __sourceIntrinsic_275f0d9b7270_invokedynamic6968_12(17273, (4361918260811329775L ^ local3))) == __sourceIntrinsic_275f0d9b7270_invokedynamic6968_13(17273, (4361918260811329775L ^ local3)))) {
        return -1;
    }
        return (p0 + moom.mt.b);
    }
case 5:
{
        if (((p0 & __sourceIntrinsic_275f0d9b7270_invokedynamic6968_15(17273, (4361918260811329775L ^ local3))) == 0)) {
        return -1;
    }
        return (p0 - moom.mt.a);
    }
case 6:
{
        if (((p0 & __sourceIntrinsic_275f0d9b7270_invokedynamic6968_17(17273, (4361918260811329775L ^ local3))) == __sourceIntrinsic_275f0d9b7270_invokedynamic6968_18(17273, (4361918260811329775L ^ local3)))) {
        return -1;
    }
        return (p0 + moom.mt.a);
    }
default:
{
        return -1;
    }
}
}


private void a(int p0, java.util.Set<moom.bs> p1) {
long local3 = (moom.mt.g ^ 109621341663404L);
    int local5 = (p0 & __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_1(17273, (4361975795879257673L ^ local3)));
    if ((local5 == 0)) {
        ((java.util.Set)(p1)).add(((java.lang.Object)(moom.bs.WEST)));
    } else {
        if ((local5 == __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_4(17273, (4361975795879257673L ^ local3)))) {
        ((java.util.Set)(p1)).add(((java.lang.Object)(moom.bs.EAST)));
    }
    }
    int local6 = ((p0 >> __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_7(8936, (2841408586535389136L ^ local3))) & __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_8(17273, (4361975795879257673L ^ local3)));
    if ((local6 == 0)) {
        ((java.util.Set)(p1)).add(((java.lang.Object)(moom.bs.DOWN)));
    } else {
        if ((local6 == __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_11(17273, (4361975795879257673L ^ local3)))) {
        ((java.util.Set)(p1)).add(((java.lang.Object)(moom.bs.UP)));
    }
    }
    int local7 = ((p0 >> 4) & __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_14(17273, (4361975795879257673L ^ local3)));
    if ((local7 == 0)) {
        ((java.util.Set)(p1)).add(((java.lang.Object)(moom.bs.NORTH)));
    } else {
        if ((local7 == __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_17(17273, (4361975795879257673L ^ local3)))) {
        ((java.util.Set)(p1)).add(((java.lang.Object)(moom.bs.SOUTH)));
    }
    }
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7578;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/mt", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mt.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8461_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mt"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a__Void(moom.DT p0) {
((java.util.BitSet)(this.d)).set(((int)(moom.mt.a(((moom.DT)(p0))))), ((boolean)(true)));
    this.f -= 1;
    return;
}


private static int a(moom.DT p0) {
long local1 = (moom.mt.g ^ 122490401623392L);
    return moom.mt.a(((int)((((moom.DT)(p0)).a() & __sourceIntrinsic_d85576047056_originalDynamicSite1564_2(17273, (4361970661006875525L ^ local1))))), ((int)((((moom.DT)(p0)).b() & __sourceIntrinsic_d85576047056_originalDynamicSite1564_4(17273, (4361970661006875525L ^ local1))))), ((int)((((moom.DT)(p0)).c() & __sourceIntrinsic_d85576047056_originalDynamicSite1564_6(17273, (4361970661006875525L ^ local1))))));
}


private static int a(int p0, int p1, int p2) {
long local3 = (moom.mt.g ^ 65430806578583L);
    return ((p0 | (p1 << __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1565_1(1251, (1366109124659123436L ^ local3)))) | (p2 << 4));
}


public moom.mr a() {
long life1_3;
    moom.mr life3_7;
    int[] life4_38;
    int life5_41;
    int life6_43;
    int life7_50;
    life1_3 = (moom.mt.g ^ 67282472292845L);
    life3_7 = new moom.mr();
    if (((__sourceIntrinsic_8bebe0fbc3eb_invokedynamic6897_1(29174, (7885325349751846273L ^ life1_3)) - this.f) < __sourceIntrinsic_8bebe0fbc3eb_invokedynamic6897_3(10083, (3668404951956890393L ^ life1_3)))) {
        ((moom.mr)(life3_7)).a(((boolean)(true)));
    } else {
        if ((this.f == 0)) {
        ((moom.mr)(life3_7)).a(((boolean)(false)));
    } else {
        life4_38 = moom.mt.e;
        life5_41 = (life4_38).length;
        life6_43 = 0;
        while ((life6_43 < life5_41)) {
        life7_50 = (life4_38)[life6_43];
        if ((!((java.util.BitSet)(this.d)).get(((int)(life7_50))))) {
        ((moom.mr)(life3_7)).a(((java.util.Set)(((moom.mt)(this)).a(((int)(life7_50))))));
    }
        life6_43 += 1;
    }
    }
    }
    return life3_7;
}


public java.util.Set<moom.bs> a__Set(moom.DT p0) {
return ((moom.mt)(this)).a(((int)(moom.mt.a(((moom.DT)(p0))))));
}


private java.util.Set<moom.bs> a(int p0) {
long local2 = (moom.mt.g ^ 11743078745980L);
    java.util.EnumSet local4 = java.util.EnumSet.noneOf(((java.lang.Class)(moom.bs.class)));
    java.util.ArrayDeque local5 = new java.util.ArrayDeque(__sourceIntrinsic_c48954907ab2_invokedynamic7050_3(28786, (6773760437516935831L ^ local2)));
    ((java.util.Queue)(local5)).add(((java.lang.Object)(moom.Df.a(((int)(p0))))));
    ((java.util.BitSet)(this.d)).set(((int)(p0)), ((boolean)(true)));
    while ((!((java.util.Queue)(local5)).isEmpty())) {
        int local6 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Queue)(local5)).poll())))).intValue();
        ((moom.mt)(this)).a(((int)(local6)), ((java.util.Set)(local4)));
        moom.bs[] local7 = moom.bs.VALUES;
        int local8 = (local7).length;
        int local9 = 0;
        while ((local9 < local8)) {
        moom.bs local10 = (local7)[local9];
        int local11 = ((moom.mt)(this)).a(((int)(local6)), ((moom.bs)(local10)));
        if ((local11 >= 0)) {
        if ((!((java.util.BitSet)(this.d)).get(((int)(local11))))) {
        ((java.util.BitSet)(this.d)).set(((int)(local11)), ((boolean)(true)));
        ((java.util.Queue)(local5)).add(((java.lang.Object)(moom.Df.a(((int)(local11))))));
    }
    }
        local9 += 1;
    }
    }
    return local4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic484_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic484_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic484_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic484_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic484_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic484_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic484_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic484_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8b2964dc6b920a5_originalDynamicSite3114_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8b2964dc6b920a5_originalDynamicSite3114_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8bebe0fbc3eb_invokedynamic6897_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8bebe0fbc3eb_invokedynamic6897_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c48954907ab2_invokedynamic7050_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1565_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dae4f7ba2244_invokedynamic8460_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_275f0d9b7270_invokedynamic6968_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_275f0d9b7270_invokedynamic6968_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_275f0d9b7270_invokedynamic6968_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_275f0d9b7270_invokedynamic6968_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_275f0d9b7270_invokedynamic6968_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_275f0d9b7270_invokedynamic6968_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_275f0d9b7270_invokedynamic6968_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_275f0d9b7270_invokedynamic6968_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_275f0d9b7270_invokedynamic6968_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_275f0d9b7270_invokedynamic6968_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_275f0d9b7270_invokedynamic6968_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8461_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_originalDynamicSite1564_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_originalDynamicSite1564_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_originalDynamicSite1564_6(int a0, long a1) throws E;
}
