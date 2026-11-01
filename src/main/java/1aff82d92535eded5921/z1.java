package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class z1 implements moom.yK<moom.y2> {

private int a;

private int b;

private moom.z2 c;

private boolean d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public z1() {
super();
}


public z1(net.minecraft.world.chunk.Chunk p0, boolean p1, int p2) { super(); }


private static void __sourceConstructorBody_b376f21353b4a06b(moom.z1 receiver, net.minecraft.world.chunk.Chunk p0, boolean p1, int p2) throws Throwable {

moom.z1 forwardValue514_30_0;

    net.minecraft.world.chunk.Chunk forwardValue514_30_1;

    int forwardValue514_30_2;

    int forwardValue514_30_3;

    moom.z1 forwardValue514_31_0;

    net.minecraft.world.chunk.Chunk forwardValue514_31_1;

    int forwardValue514_31_2;

    moom.z1 forwardValue514_32_0;

    net.minecraft.world.chunk.Chunk forwardValue514_32_1;

    int forwardValue514_32_2;

    int forwardValue514_32_3;

    int[] spill514_0;

    moom.z1 spill514_1;

    net.minecraft.world.chunk.Chunk spill514_2;

    boolean spill514_3;

    boolean spill514_4;

    long life4_3;

    int[] life6_18;

    forward_join_32: {

    forward_join_31: {

    forward_join_30: {

    life4_3 = (moom.z1.e ^ 26892024584246L);

    moom.z1.__sourceConstructorInit_b376f21353b4a06b_0(((moom.z1)(receiver)));

    ((moom.z1)(receiver)).a = ((int)(((net.minecraft.world.chunk.Chunk)(p0)).i));

    ((moom.z1)(receiver)).b = ((int)(((net.minecraft.world.chunk.Chunk)(p0)).j));

    spill514_0 = moom.zN.b__ArrayInt();

    ((moom.z1)(receiver)).d = ((boolean)(p1));

    life6_18 = spill514_0;

    spill514_1 = receiver;

    spill514_2 = p0;

    spill514_3 = p1;

    spill514_4 = ((moom.EA)(((net.minecraft.world.World)(((net.minecraft.world.chunk.Chunk)(p0)).a__Eu())).v)).e();

    if (!((life6_18 == null))) {

        forwardValue514_30_0 = spill514_1;

        forwardValue514_30_1 = spill514_2;

        forwardValue514_30_2 = ((spill514_3) ? 1 : 0);

        forwardValue514_30_3 = ((spill514_4) ? 1 : 0);

        break forward_join_30;

    }

    if (!((!spill514_4))) {

        forwardValue514_31_0 = spill514_1;

        forwardValue514_31_1 = spill514_2;

        forwardValue514_31_2 = ((spill514_3) ? 1 : 0);

        break forward_join_31;

    }

    forwardValue514_30_0 = spill514_1;

    forwardValue514_30_1 = spill514_2;

    forwardValue514_30_2 = ((spill514_3) ? 1 : 0);

    forwardValue514_30_3 = 1;

    }

    forwardValue514_32_0 = forwardValue514_30_0;

    forwardValue514_32_1 = forwardValue514_30_1;

    forwardValue514_32_2 = forwardValue514_30_2;

    forwardValue514_32_3 = forwardValue514_30_3;

    break forward_join_32;

    }

    forwardValue514_32_0 = forwardValue514_31_0;

    forwardValue514_32_1 = forwardValue514_31_1;

    forwardValue514_32_2 = forwardValue514_31_2;

    forwardValue514_32_3 = 0;

    }

    ((moom.z1)(forwardValue514_32_0)).c = ((moom.z2)(moom.z1.a(((net.minecraft.world.chunk.Chunk)(forwardValue514_32_1)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue514_32_2))), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue514_32_3))), ((int)(p2)))));

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(-361927266535181540L)), ((long)(1767597362327497432L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(188685196261556L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.z1.e ^ 121250054100442L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1724_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1724_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1724_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1724_14 = new byte[8];
    (__sourceSpill1724_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1724_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1724_16 = __sourceSpill1724_14;
    ((javax.crypto.Cipher)(__sourceSpill1724_11)).init(((int)(__sourceSpill1724_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1724_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1724_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = " òæ\002zl\025fµÜ[©GÌ\021JX=¢K\b­\037§Á+ ñÜK~â¨kf"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1724_25 = local6_life21;
        int __sourceSpill1724_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1724_25)).substring(((int)(__sourceSpill1724_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1724_30 = local8_life19;
        int __sourceSpill1724_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1724_33 = new byte[8];
        (__sourceSpill1724_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1724_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1724_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1724_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1724_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1724_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1724_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1724_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1724_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1724_34)).doFinal(((byte[])(__sourceSpill1724_33)));
        (__sourceSpill1724_30)[__sourceSpill1724_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\004}Öîî{Ñ­\000Ccê"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1724_38 = local6_life21;
        int __sourceSpill1724_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1724_38)).substring(((int)(__sourceSpill1724_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1724_43 = local8_life19;
        int __sourceSpill1724_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1724_46 = new byte[8];
        (__sourceSpill1724_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1724_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1724_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1724_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1724_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1724_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1724_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1724_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1724_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1724_47)).doFinal(((byte[])(__sourceSpill1724_46)));
        (__sourceSpill1724_43)[__sourceSpill1724_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_b376f21353b4a06b_0(moom.z1 a0) throws E;

public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (moom.z1.e ^ 4058650828655L);
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(((short) (((moom.z2)(this.c)).b & __sourceIntrinsic_0875c19f50e0_originalDynamicSite1730_9(1452, (6146128187174111323L ^ local2)))))));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((byte[])(((moom.z2)(this.c)).a)));
    return;
}


public int b() {
return this.b;
}


public int c() {
return ((moom.z2)(this.c)).b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9864_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/z1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.z1.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8215;
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
            throw new RuntimeException("moom/z1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


protected static int a(int p0, boolean p1, boolean p2) {
int forwardValue4588_75_0;
    int forwardValue4588_77_0;
    int forwardValue4588_87_0;
    int forwardValue4588_89_0;
    int[] spill4588_0;
    boolean spill4588_1;
    boolean spill4588_2;
    long life3_3;
    int life6_26;
    int[] life5_27;
    int life7_49;
    int life8_83;
    int life9_98;
    forward_join_89: {
    forward_join_88: {
    forward_join_87: {
    forward_join_77: {
    forward_join_76: {
    forward_join_75: {
    life3_3 = (moom.z1.e ^ 59560978582934L);
    spill4588_0 = moom.zN.b__ArrayInt();
    life6_26 = ((((p0 * 2) * __sourceIntrinsic_94df99318db9_invokedynamic4588_2(6876, (5298130635307124183L ^ life3_3))) * __sourceIntrinsic_94df99318db9_invokedynamic4588_3(6539, (5524145637763647111L ^ life3_3))) * __sourceIntrinsic_94df99318db9_invokedynamic4588_4(6539, (5524145637763647111L ^ life3_3)));
    life5_27 = spill4588_0;
    life7_49 = ((((p0 * __sourceIntrinsic_94df99318db9_invokedynamic4588_5(6539, (5524145637763647111L ^ life3_3))) * __sourceIntrinsic_94df99318db9_invokedynamic4588_6(6539, (5524145637763647111L ^ life3_3))) * __sourceIntrinsic_94df99318db9_invokedynamic4588_7(6539, (5524145637763647111L ^ life3_3))) / 2);
    spill4588_1 = p1;
    if (!((life5_27 == null))) {
        forwardValue4588_75_0 = ((spill4588_1) ? 1 : 0);
        break forward_join_75;
    }
    if (!(spill4588_1)) {
        break forward_join_76;
    }
    forwardValue4588_75_0 = ((((p0 * __sourceIntrinsic_94df99318db9_invokedynamic4588_9(6539, (5524145637763647111L ^ life3_3))) * __sourceIntrinsic_94df99318db9_invokedynamic4588_10(6539, (5524145637763647111L ^ life3_3))) * __sourceIntrinsic_94df99318db9_invokedynamic4588_11(6539, (5524145637763647111L ^ life3_3))) / 2);
    }
    forwardValue4588_77_0 = forwardValue4588_75_0;
    break forward_join_77;
    }
    forwardValue4588_77_0 = 0;
    }
    life8_83 = forwardValue4588_77_0;
    spill4588_2 = p2;
    if (!((life5_27 == null))) {
        forwardValue4588_87_0 = ((spill4588_2) ? 1 : 0);
        break forward_join_87;
    }
    if (!(spill4588_2)) {
        break forward_join_88;
    }
    forwardValue4588_87_0 = __sourceIntrinsic_94df99318db9_invokedynamic4588_13(29475, (9147281394659355694L ^ life3_3));
    }
    forwardValue4588_89_0 = forwardValue4588_87_0;
    break forward_join_89;
    }
    forwardValue4588_89_0 = 0;
    }
    life9_98 = forwardValue4588_89_0;
    return (((life6_26 + life7_49) + life8_83) + life9_98);
}


public byte[] a__ArrayByte() {
return ((moom.z2)(this.c)).a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.z1)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.d = ((boolean)(((net.minecraft.network.PacketBuffer)(p0)).readBoolean()));
    this.c = ((moom.z2)(new moom.z2()));
    ((moom.z2)(this.c)).b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    ((moom.z2)(this.c)).a = ((byte[])(((net.minecraft.network.PacketBuffer)(p0)).a__ArrayByte()));
    return;
}


public static moom.z2 a(net.minecraft.world.chunk.Chunk p0, boolean p1, boolean p2, int p3) {
int forestValue528_45_0;
    int forestValue528_59_0;
    int forestValue528_165_0;
    int forestValue528_213_0;
    int forestValue528_222_0;
    int[] spill528_0;
    boolean spill528_1;
    boolean spill528_2;
    int spill528_3;
    boolean spill528_4;
    boolean spill528_5;
    long life4_3;
    moom.Fs[] life7_7;
    int[] life6_8;
    moom.z2 life8_12;
    java.util.ArrayList life9_14;
    int life10_16;
    moom.Fs life11_26;
    java.util.Iterator life11_100;
    moom.Fs life12_109;
    char[] life13_112;
    char[] life14_114;
    int life15_117;
    int life16_122;
    int life17_131;
    java.util.Iterator life11_176;
    moom.Fs life12_186;
    moom.Fs life12_206;
    java.util.Iterator life11_235;
    moom.Fs life12_244;
    forest_join_223: {
    forest_join_222: {
    forest_join_213: {
    forest_join_212: {
    forest_join_186: {
    forest_join_165: {
    forest_join_142: {
    forest_join_74: {
    forest_join_63: {
    life4_3 = (moom.z1.e ^ 26432979468822L);
    spill528_0 = moom.zN.b__ArrayInt();
    life7_7 = ((net.minecraft.world.chunk.Chunk)(p0)).a__ArrayFs();
    life6_8 = spill528_0;
    life8_12 = new moom.z2();
    life9_14 = com.google.common.collect.Lists.newArrayList();
    life10_16 = 0;
    forest_cycle_17: while (true) {
    forest_join_61: {
    forest_join_60: {
    forest_join_59: {
    forest_join_45: {
    forest_join_40: {
    if (!((life10_16 < (life7_7).length))) {
        break forest_join_63;
    }
    life11_26 = (life7_7)[life10_16];
    if (!((life6_8 == null))) {
        break forest_join_74;
    }
    if (!((life6_8 == null))) {
        break forest_join_61;
    }
    if (!((life11_26 != null))) {
        break forest_join_60;
    }
    spill528_1 = p1;
    if (!((life6_8 == null))) {
        forestValue528_45_0 = ((spill528_1) ? 1 : 0);
        break forest_join_45;
    }
    if (!(spill528_1)) {
        break forest_join_40;
    }
    spill528_2 = ((moom.Fs)(life11_26)).a__Boolean();
    if (!((life6_8 == null))) {
        forestValue528_45_0 = ((spill528_2) ? 1 : 0);
        break forest_join_45;
    }
    if (!((!spill528_2))) {
        break forest_join_60;
    }
    }
    forestValue528_45_0 = (p3 & (1 << life10_16));
    }
    if (!((life6_8 == null))) {
        forestValue528_59_0 = forestValue528_45_0;
        break forest_join_59;
    }
    if (!((forestValue528_45_0 != 0))) {
        break forest_join_60;
    }
    moom.z2 __stackOp528_7_0 = life8_12;
    ((moom.z2)(__stackOp528_7_0)).b = ((int)((((moom.z2)(__stackOp528_7_0)).b | (1 << life10_16))));
    forestValue528_59_0 = ((((java.util.List)(life9_14)).add(((java.lang.Object)(life11_26)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue528_59_0);
    }
    life10_16 += 1;
    }
    if (!((life6_8 != null))) {
        continue forest_cycle_17;
    }
    break forest_cycle_17;
    }
    }
    ((moom.z2)(life8_12)).a = ((byte[])(new byte[moom.z1.a(((int)(java.lang.Integer.bitCount(((int)(((moom.z2)(life8_12)).b))))), ((boolean)(p2)), ((boolean)(p1)))]));
    life10_16 = 0;
    }
    life11_100 = ((java.util.List)(life9_14)).iterator();
    forest_cycle_77: while (true) {
    forest_join_140: {
    if (!(((java.util.Iterator)(life11_100)).hasNext())) {
        break forest_join_142;
    }
    life12_109 = ((moom.Fs)(((java.util.Iterator)(life11_100)).next()));
    life13_112 = ((moom.Fs)(life12_109)).a__ArrayChar();
    life14_114 = life13_112;
    life15_117 = (life14_114).length;
    spill528_3 = 0;
    if (!((life6_8 == null))) {
        forestValue528_165_0 = spill528_3;
        break forest_join_165;
    }
    life16_122 = spill528_3;
    forest_cycle_96: while (true) {
    if (!((life16_122 < life15_117))) {
        break forest_join_140;
    }
    life17_131 = ((int)((life14_114)[life16_122]));
    (((moom.z2)(life8_12)).a)[(life10_16++)] = ((byte) (life17_131 & __sourceIntrinsic_04624cc6e96a_invokedynamic528_24(27567, (1658896680287861543L ^ life4_3))));
    (((moom.z2)(life8_12)).a)[(life10_16++)] = ((byte) ((life17_131 >> __sourceIntrinsic_04624cc6e96a_invokedynamic528_26(830, (4806517701772612529L ^ life4_3))) & __sourceIntrinsic_04624cc6e96a_invokedynamic528_27(205, (4348875786995077191L ^ life4_3))));
    life16_122 += 1;
    if (!((life6_8 == null))) {
        continue forest_cycle_77;
    }
    if (!((life6_8 != null))) {
        continue forest_cycle_96;
    }
    break forest_cycle_96;
    }
    }
    if (!((life6_8 != null))) {
        continue forest_cycle_77;
    }
    break forest_cycle_77;
    }
    }
    life11_176 = ((java.util.List)(life9_14)).iterator();
    forest_cycle_145: while (true) {
    if (!(((java.util.Iterator)(life11_176)).hasNext())) {
        break forest_join_186;
    }
    life12_186 = ((moom.Fs)(((java.util.Iterator)(life11_176)).next()));
    life10_16 = moom.z1.a(((byte[])(((moom.Fo)(((moom.Fs)(life12_186)).a__Fo())).a())), ((byte[])(((moom.z2)(life8_12)).a)), ((int)(life10_16)));
    if (!((life6_8 == null))) {
        break forest_join_212;
    }
    if (!((life6_8 != null))) {
        continue forest_cycle_145;
    }
    break forest_cycle_145;
    }
    break forest_join_186;
    }
    forest_cycle_165: while (true) {
    forest_join_183: {
    if (!((forestValue528_165_0 != 0))) {
        break forest_join_186;
    }
    life12_206 = ((moom.Fs)(((java.util.Iterator)(life11_100)).next()));
    life10_16 = moom.z1.a(((byte[])(((moom.Fo)(((moom.Fs)(life12_206)).a__Fo())).a())), ((byte[])(((moom.z2)(life8_12)).a)), ((int)(life10_16)));
    if (!((life6_8 == null))) {
        break forest_join_212;
    }
    if (!((life6_8 != null))) {
        break forest_join_183;
    }
    break forest_join_186;
    }
    spill528_4 = ((java.util.Iterator)(life11_100)).hasNext();
    forestValue528_165_0 = ((spill528_4) ? 1 : 0);
    continue forest_cycle_165;
    }
    }
    spill528_5 = p2;
    if (!((life6_8 == null))) {
        forestValue528_213_0 = ((spill528_5) ? 1 : 0);
        break forest_join_213;
    }
    if (!(spill528_5)) {
        break forest_join_212;
    }
    life11_235 = ((java.util.List)(life9_14)).iterator();
    forest_cycle_193: while (true) {
    if (!(((java.util.Iterator)(life11_235)).hasNext())) {
        break forest_join_212;
    }
    life12_244 = ((moom.Fs)(((java.util.Iterator)(life11_235)).next()));
    life10_16 = moom.z1.a(((byte[])(((moom.Fo)(((moom.Fs)(life12_244)).b__Fo())).a())), ((byte[])(((moom.z2)(life8_12)).a)), ((int)(life10_16)));
    if (!((life6_8 == null))) {
        break forest_join_223;
    }
    if (!((life6_8 != null))) {
        continue forest_cycle_193;
    }
    break forest_cycle_193;
    }
    }
    forestValue528_213_0 = ((p1) ? 1 : 0);
    }
    if (!((life6_8 == null))) {
        forestValue528_222_0 = forestValue528_213_0;
        break forest_join_222;
    }
    if (!((forestValue528_213_0 != 0))) {
        break forest_join_223;
    }
    forestValue528_222_0 = moom.z1.a(((byte[])(((net.minecraft.world.chunk.Chunk)(p0)).a__ArrayByte())), ((byte[])(((moom.z2)(life8_12)).a)), ((int)(life10_16)));
    }
    recovery.source.CarrierOps.discard(forestValue528_222_0);
    }
    return life8_12;
}


private static int a(byte[] p0, byte[] p1, int p2) {
java.lang.System.arraycopy(((java.lang.Object)(p0)), ((int)(0)), ((java.lang.Object)(p1)), ((int)(p2)), ((int)((p0).length)));
    return (p2 + (p0).length);
}


public int a() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_94df99318db9_invokedynamic4588_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94df99318db9_invokedynamic4588_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94df99318db9_invokedynamic4588_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94df99318db9_invokedynamic4588_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94df99318db9_invokedynamic4588_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94df99318db9_invokedynamic4588_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94df99318db9_invokedynamic4588_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94df99318db9_invokedynamic4588_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94df99318db9_invokedynamic4588_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94df99318db9_invokedynamic4588_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9864_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04624cc6e96a_invokedynamic528_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04624cc6e96a_invokedynamic528_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04624cc6e96a_invokedynamic528_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0875c19f50e0_originalDynamicSite1730_9(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
