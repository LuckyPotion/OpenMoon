package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GH extends moom.GD {

private net.minecraft.world.biome.BiomeGenBase[] f;

private net.minecraft.world.biome.BiomeGenBase[] g;

private net.minecraft.world.biome.BiomeGenBase[] h;

private net.minecraft.world.biome.BiomeGenBase[] i;

private moom.FD j;

private static long l;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

public GH(long p0, moom.GD p1, net.minecraft.world.WorldType p2, java.lang.String p3) { super(0L); }


private static void __sourceConstructorBody_02deff583c9cf8f2(moom.GH receiver, long p0, moom.GD p1, net.minecraft.world.WorldType p2, java.lang.String p3) throws Throwable {

net.minecraft.world.WorldType __initValue369_160_0;

    net.minecraft.world.WorldType __initValue369_160_1;

    long local6_life2;

    net.minecraft.entity.Entity[] local8_life64;

    init_join_176: {

    init_join_171: {

    init_join_168: {

    init_join_160: {

    init_join_158: {

    local6_life2 = (moom.GH.l ^ 3795670044271L);

    moom.GH.__sourceConstructorInit_02deff583c9cf8f2_0(((moom.GH)(receiver)), ((long)(p0)));

    net.minecraft.entity.Entity[] __sourceSpill369_7 = moom.GD.b();

    moom.GH __sourceSpill369_8 = receiver;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_9_0 = new net.minecraft.world.biome.BiomeGenBase[__sourceIntrinsic_02deff583c9cf8f2_originalDynamicSite369_6(6332, (8713133303007029784L ^ local6_life2))];

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_11 = __stackOp369_9_0;

    (__stackOp369_9_0)[0] = net.minecraft.world.biome.BiomeGenBase.t;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_12_0 = __sourceSpill369_11;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_14 = __stackOp369_12_0;

    (__stackOp369_12_0)[1] = net.minecraft.world.biome.BiomeGenBase.t;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_15_0 = __sourceSpill369_14;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_17 = __stackOp369_15_0;

    (__stackOp369_15_0)[2] = net.minecraft.world.biome.BiomeGenBase.t;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_18_0 = __sourceSpill369_17;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_20 = __stackOp369_18_0;

    (__stackOp369_18_0)[3] = net.minecraft.world.biome.BiomeGenBase.aa;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_21_0 = __sourceSpill369_20;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_23 = __stackOp369_21_0;

    (__stackOp369_21_0)[4] = net.minecraft.world.biome.BiomeGenBase.aa;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_24_0 = __sourceSpill369_23;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_26 = __stackOp369_24_0;

    (__stackOp369_24_0)[5] = net.minecraft.world.biome.BiomeGenBase.s;

    ((moom.GH)(__sourceSpill369_8)).f = ((net.minecraft.world.biome.BiomeGenBase[])(__sourceSpill369_26));

    moom.GH __sourceSpill369_30 = receiver;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_31_0 = new net.minecraft.world.biome.BiomeGenBase[__sourceIntrinsic_02deff583c9cf8f2_originalDynamicSite369_29(30794, (7383558709166033645L ^ local6_life2))];

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_33 = __stackOp369_31_0;

    (__stackOp369_31_0)[0] = net.minecraft.world.biome.BiomeGenBase.v;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_34_0 = __sourceSpill369_33;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_36 = __stackOp369_34_0;

    (__stackOp369_34_0)[1] = net.minecraft.world.biome.BiomeGenBase.U;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_37_0 = __sourceSpill369_36;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_39 = __stackOp369_37_0;

    (__stackOp369_37_0)[2] = net.minecraft.world.biome.BiomeGenBase.u;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_40_0 = __sourceSpill369_39;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_42 = __stackOp369_40_0;

    (__stackOp369_40_0)[3] = net.minecraft.world.biome.BiomeGenBase.s;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_43_0 = __sourceSpill369_42;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_45 = __stackOp369_43_0;

    (__stackOp369_43_0)[4] = net.minecraft.world.biome.BiomeGenBase.S;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_46_0 = __sourceSpill369_45;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_48 = __stackOp369_46_0;

    (__stackOp369_46_0)[5] = net.minecraft.world.biome.BiomeGenBase.x;

    ((moom.GH)(__sourceSpill369_30)).g = ((net.minecraft.world.biome.BiomeGenBase[])(__sourceSpill369_48));

    moom.GH __sourceSpill369_50 = receiver;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_51_0 = new net.minecraft.world.biome.BiomeGenBase[4];

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_53 = __stackOp369_51_0;

    (__stackOp369_51_0)[0] = net.minecraft.world.biome.BiomeGenBase.v;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_54_0 = __sourceSpill369_53;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_56 = __stackOp369_54_0;

    (__stackOp369_54_0)[1] = net.minecraft.world.biome.BiomeGenBase.u;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_57_0 = __sourceSpill369_56;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_59 = __stackOp369_57_0;

    (__stackOp369_57_0)[2] = net.minecraft.world.biome.BiomeGenBase.w;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_60_0 = __sourceSpill369_59;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_62 = __stackOp369_60_0;

    (__stackOp369_60_0)[3] = net.minecraft.world.biome.BiomeGenBase.s;

    ((moom.GH)(__sourceSpill369_50)).h = ((net.minecraft.world.biome.BiomeGenBase[])(__sourceSpill369_62));

    local8_life64 = __sourceSpill369_7;

    moom.GH __sourceSpill369_65 = receiver;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_66_0 = new net.minecraft.world.biome.BiomeGenBase[4];

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_68 = __stackOp369_66_0;

    (__stackOp369_66_0)[0] = net.minecraft.world.biome.BiomeGenBase.D;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_69_0 = __sourceSpill369_68;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_71 = __stackOp369_69_0;

    (__stackOp369_69_0)[1] = net.minecraft.world.biome.BiomeGenBase.D;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_72_0 = __sourceSpill369_71;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_74 = __stackOp369_72_0;

    (__stackOp369_72_0)[2] = net.minecraft.world.biome.BiomeGenBase.D;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_75_0 = __sourceSpill369_74;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_77 = __stackOp369_75_0;

    (__stackOp369_75_0)[3] = net.minecraft.world.biome.BiomeGenBase.V;

    ((moom.GH)(__sourceSpill369_65)).i = ((net.minecraft.world.biome.BiomeGenBase[])(__sourceSpill369_77));

    ((moom.GH)(receiver)).b = ((moom.GD)(p1));

    net.minecraft.world.WorldType __sourceSpill369_81 = p2;

    net.minecraft.world.WorldType __sourceSpill369_82 = net.minecraft.world.WorldType.h;

    if (!((local8_life64 != null))) {

        __initValue369_160_0 = __sourceSpill369_81;

        __initValue369_160_1 = __sourceSpill369_82;

        break init_join_160;

    }

    if (!((__sourceSpill369_81 == __sourceSpill369_82))) {

        break init_join_158;

    }

    moom.GH __sourceSpill369_85 = receiver;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_86_0 = new net.minecraft.world.biome.BiomeGenBase[__sourceIntrinsic_02deff583c9cf8f2_originalDynamicSite369_84(30794, (7383558709166033645L ^ local6_life2))];

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_88 = __stackOp369_86_0;

    (__stackOp369_86_0)[0] = net.minecraft.world.biome.BiomeGenBase.t;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_89_0 = __sourceSpill369_88;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_91 = __stackOp369_89_0;

    (__stackOp369_89_0)[1] = net.minecraft.world.biome.BiomeGenBase.v;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_92_0 = __sourceSpill369_91;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_94 = __stackOp369_92_0;

    (__stackOp369_92_0)[2] = net.minecraft.world.biome.BiomeGenBase.u;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_95_0 = __sourceSpill369_94;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_97 = __stackOp369_95_0;

    (__stackOp369_95_0)[3] = net.minecraft.world.biome.BiomeGenBase.x;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_98_0 = __sourceSpill369_97;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_100 = __stackOp369_98_0;

    (__stackOp369_98_0)[4] = net.minecraft.world.biome.BiomeGenBase.s;

    net.minecraft.world.biome.BiomeGenBase[] __stackOp369_101_0 = __sourceSpill369_100;

    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill369_103 = __stackOp369_101_0;

    (__stackOp369_101_0)[5] = net.minecraft.world.biome.BiomeGenBase.w;

    ((moom.GH)(__sourceSpill369_85)).f = ((net.minecraft.world.biome.BiomeGenBase[])(__sourceSpill369_103));

    ((moom.GH)(receiver)).j = ((moom.FD)(null));

    if (!((local8_life64 == null))) {

        break init_join_171;

    }

    }

    __initValue369_160_0 = p2;

    __initValue369_160_1 = net.minecraft.world.WorldType.f;

    }

    if (!((__initValue369_160_0 == __initValue369_160_1))) {

        break init_join_168;

    }

    ((moom.GH)(receiver)).j = ((moom.FD)(((moom.FE)(moom.FE.a(((java.lang.String)(p3))))).a()));

    if (!((local8_life64 == null))) {

        break init_join_171;

    }

    }

    ((moom.GH)(receiver)).j = ((moom.FD)(null));

    }

    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {

        break init_join_176;

    }

    moom.GD.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));

    }

    return;

}



static {
l = ((long)(((moom._a)(moom._c.a(((long)(-2412367309425558934L)), ((long)(-2242621466414661716L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(35003775502783L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.GH.l ^ 56846493704061L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill775_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill775_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill775_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill775_14 = new byte[8];
    (__sourceSpill775_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill775_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation775_16 = __sourceSpill775_14;
    ((javax.crypto.Cipher)(__sourceSpill775_11)).init(((int)(__sourceSpill775_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill775_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation775_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¿^É¹\017\nEñ2odà£ùÒÅQ~à\f\033è"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill775_25 = local6_life21;
        int __sourceSpill775_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill775_25)).substring(((int)(__sourceSpill775_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill775_30 = local8_life19;
        int __sourceSpill775_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill775_33 = new byte[8];
        (__sourceSpill775_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill775_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill775_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill775_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill775_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill775_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill775_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill775_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill775_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill775_34)).doFinal(((byte[])(__sourceSpill775_33)));
        (__sourceSpill775_30)[__sourceSpill775_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "4×lÞ¶J\1774°#¦úw\036"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill775_38 = local6_life21;
        int __sourceSpill775_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill775_38)).substring(((int)(__sourceSpill775_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill775_43 = local8_life19;
        int __sourceSpill775_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill775_46 = new byte[8];
        (__sourceSpill775_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill775_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill775_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill775_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill775_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill775_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill775_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill775_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill775_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill775_47)).doFinal(((byte[])(__sourceSpill775_46)));
        (__sourceSpill775_43)[__sourceSpill775_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_02deff583c9cf8f2_0(moom.GH a0, long a1) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.GH.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20400;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/GH", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4629_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/GH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int lexicalValue681_96_0;
    int lexicalValue681_110_0;
    int lexicalValue681_127_0;
    int lexicalValue681_127_1;
    int lexicalValue681_137_0;
    int lexicalValue681_180_0;
    int lexicalValue681_180_1;
    int lexicalValue681_216_0;
    int lexicalValue681_216_1;
    int lexicalValue681_252_0;
    int lexicalValue681_252_1;
    net.minecraft.entity.Entity[] spill681_0;
    int spill681_1;
    int spill681_2;
    int spill681_3;
    int spill681_4;
    long life5_3;
    int[] life8_12;
    int[] life9_17;
    net.minecraft.entity.Entity[] life7_18;
    int life10_20;
    int life11_25;
    int life12_46;
    int life13_60;
    lexical_join_286: {
    life5_3 = (moom.GH.l ^ 42212683556622L);
    spill681_0 = moom.GD.b();
    life8_12 = ((moom.GD)(this.b)).a__ArrayInt(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    life9_17 = moom.GY.a(((int)((p2 * p3))));
    life7_18 = spill681_0;
    life10_20 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_284: {
    lexical_join_283: {
    if (!((life10_20 < p3))) {
        break lexical_join_286;
    }
    life11_25 = 0;
    lexical_cycle_26: while (true) {
    lexical_join_280: {
    lexical_join_271: {
    lexical_join_252: {
    lexical_join_250: {
    lexical_join_232: {
    lexical_join_216: {
    lexical_join_214: {
    lexical_join_196: {
    lexical_join_180: {
    lexical_join_178: {
    lexical_join_160: {
    lexical_join_149: {
    lexical_join_137: {
    lexical_join_127: {
    lexical_join_125: {
    lexical_join_110: {
    lexical_join_109: {
    lexical_join_96: {
    lexical_join_94: {
    if (!((life11_25 < p2))) {
        break lexical_join_283;
    }
    ((moom.GH)(this)).a(((long)(((long) (life11_25 + p0)))), ((long)(((long) (life10_20 + p1)))));
    life12_46 = (life8_12)[(life11_25 + (life10_20 * p2))];
    life13_60 = ((life12_46 & __sourceIntrinsic_7c530025ef13_invokedynamic681_6(6962, (7860316971024154869L ^ life5_3))) >> __sourceIntrinsic_7c530025ef13_invokedynamic681_7(14865, (664632693043372501L ^ life5_3)));
    spill681_1 = (life12_46 & __sourceIntrinsic_7c530025ef13_invokedynamic681_8(21065, (8186167788181408139L ^ life5_3)));
    if (!((life7_18 != null))) {
        lexicalValue681_96_0 = spill681_1;
        break lexical_join_96;
    }
    life12_46 = spill681_1;
    if (!((life7_18 != null))) {
        break lexical_join_284;
    }
    if (!((this.j != null))) {
        break lexical_join_94;
    }
    spill681_2 = ((moom.FD)(this.j)).F;
    if (!((life7_18 != null))) {
        lexicalValue681_96_0 = spill681_2;
        break lexical_join_96;
    }
    if (!((spill681_2 >= 0))) {
        break lexical_join_94;
    }
    (life9_17)[(life11_25 + (life10_20 * p2))] = ((moom.FD)(this.j)).F;
    if (!((life7_18 == null))) {
        break lexical_join_280;
    }
    }
    lexicalValue681_96_0 = ((moom.GH.a__Boolean(((int)(life12_46)))) ? 1 : 0);
    }
    if (!((life7_18 != null))) {
        lexicalValue681_110_0 = lexicalValue681_96_0;
        break lexical_join_110;
    }
    if (!((lexicalValue681_96_0 != 0))) {
        break lexical_join_109;
    }
    (life9_17)[(life11_25 + (life10_20 * p2))] = life12_46;
    if (!((life7_18 == null))) {
        break lexical_join_280;
    }
    }
    lexicalValue681_110_0 = life12_46;
    }
    spill681_3 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.F)).aB;
    if (!((life7_18 != null))) {
        lexicalValue681_127_0 = lexicalValue681_110_0;
        lexicalValue681_127_1 = spill681_3;
        break lexical_join_127;
    }
    if (!((lexicalValue681_110_0 == spill681_3))) {
        break lexical_join_125;
    }
    (life9_17)[(life11_25 + (life10_20 * p2))] = life12_46;
    if (!((life7_18 == null))) {
        break lexical_join_280;
    }
    }
    lexicalValue681_127_0 = life12_46;
    lexicalValue681_127_1 = 1;
    }
    if (!((life7_18 != null))) {
        lexicalValue681_180_0 = lexicalValue681_127_0;
        lexicalValue681_180_1 = lexicalValue681_127_1;
        break lexical_join_180;
    }
    if (!((lexicalValue681_127_0 == lexicalValue681_127_1))) {
        break lexical_join_178;
    }
    spill681_4 = life13_60;
    if (!((life7_18 != null))) {
        lexicalValue681_137_0 = spill681_4;
        break lexical_join_137;
    }
    if (!((spill681_4 > 0))) {
        break lexical_join_160;
    }
    lexicalValue681_137_0 = ((moom.GH)(this)).a(((int)(3)));
    }
    if (!((lexicalValue681_137_0 == 0))) {
        break lexical_join_149;
    }
    (life9_17)[(life11_25 + (life10_20 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ae)).aB;
    if (!((life7_18 == null))) {
        break lexical_join_280;
    }
    }
    (life9_17)[(life11_25 + (life10_20 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ad)).aB;
    if (!((life7_18 == null))) {
        break lexical_join_280;
    }
    }
    (life9_17)[(life11_25 + (life10_20 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)((this.f)[((moom.GH)(this)).a(((int)((this.f).length)))])).aB;
    if (!((life7_18 == null))) {
        break lexical_join_280;
    }
    }
    lexicalValue681_180_0 = life12_46;
    lexicalValue681_180_1 = 2;
    }
    if (!((life7_18 != null))) {
        lexicalValue681_216_0 = lexicalValue681_180_0;
        lexicalValue681_216_1 = lexicalValue681_180_1;
        break lexical_join_216;
    }
    if (!((lexicalValue681_180_0 == lexicalValue681_180_1))) {
        break lexical_join_214;
    }
    if (!((life13_60 > 0))) {
        break lexical_join_196;
    }
    (life9_17)[(life11_25 + (life10_20 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.M)).aB;
    if (!((life7_18 == null))) {
        break lexical_join_280;
    }
    }
    (life9_17)[(life11_25 + (life10_20 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)((this.g)[((moom.GH)(this)).a(((int)((this.g).length)))])).aB;
    if (!((life7_18 == null))) {
        break lexical_join_280;
    }
    }
    lexicalValue681_216_0 = life12_46;
    lexicalValue681_216_1 = 3;
    }
    if (!((life7_18 != null))) {
        lexicalValue681_252_0 = lexicalValue681_216_0;
        lexicalValue681_252_1 = lexicalValue681_216_1;
        break lexical_join_252;
    }
    if (!((lexicalValue681_216_0 == lexicalValue681_216_1))) {
        break lexical_join_250;
    }
    if (!((life13_60 > 0))) {
        break lexical_join_232;
    }
    (life9_17)[(life11_25 + (life10_20 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.X)).aB;
    if (!((life7_18 == null))) {
        break lexical_join_280;
    }
    }
    (life9_17)[(life11_25 + (life10_20 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)((this.h)[((moom.GH)(this)).a(((int)((this.h).length)))])).aB;
    if (!((life7_18 == null))) {
        break lexical_join_280;
    }
    }
    lexicalValue681_252_0 = life12_46;
    lexicalValue681_252_1 = 4;
    }
    if (!((lexicalValue681_252_0 == lexicalValue681_252_1))) {
        break lexical_join_271;
    }
    (life9_17)[(life11_25 + (life10_20 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)((this.i)[((moom.GH)(this)).a(((int)((this.i).length)))])).aB;
    if (!((life7_18 == null))) {
        break lexical_join_280;
    }
    }
    (life9_17)[(life11_25 + (life10_20 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.F)).aB;
    }
    life11_25 += 1;
    if (!((life7_18 == null))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    life10_20 += 1;
    }
    if (!((life7_18 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    return life9_17;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_02deff583c9cf8f2_originalDynamicSite369_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02deff583c9cf8f2_originalDynamicSite369_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02deff583c9cf8f2_originalDynamicSite369_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic681_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic681_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic681_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4629_0() throws E;
}
