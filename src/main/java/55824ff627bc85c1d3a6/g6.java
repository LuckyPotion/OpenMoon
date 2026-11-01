package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class g6 {

private static net.minecraft.client.Minecraft a;

private static int[] b;

private com.moon.module.impl.ESP c;

private com.moon.iu d;

private com.moon.iu e;

private com.moon.iu[] f;

private int g;

private int h;

private com.moon.hW i;

private com.moon.hW j;

private static long k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

public g6(com.moon.module.impl.ESP p0) { super(); }


private static void __sourceConstructorBody_c5f1893356c3b0f5(com.moon.g6 receiver, com.moon.module.impl.ESP p0) throws Throwable {

init_join_57: {

    init_join_54: {

    long local2_life2 = (com.moon.g6.k ^ 8805240853529L);

    net.minecraft.entity.Entity[] __sourceSpill24_4 = moom.CA.b();

    com.moon.g6.__sourceConstructorInit_c5f1893356c3b0f5_0(((com.moon.g6)(receiver)));

    ((com.moon.g6)(receiver)).d = ((com.moon.iu)(new com.moon.iu(1, 1, false)));

    net.minecraft.entity.Entity[] local4_life7 = __sourceSpill24_4;

    ((com.moon.g6)(receiver)).e = ((com.moon.iu)(new com.moon.iu(1, 1, false)));

    ((com.moon.g6)(receiver)).f = ((com.moon.iu[])(new com.moon.iu[__sourceIntrinsic_c5f1893356c3b0f5_originalDynamicSite24_10(7492, (2193800707168528142L ^ local2_life2))]));

    int local5_life12 = 0;

    init_cycle_34: while (true) {

    if (!((local5_life12 < (((com.moon.g6)(receiver)).f).length))) {

        break init_join_54;

    }

    (((com.moon.g6)(receiver)).f)[local5_life12] = new com.moon.iu(1, 1, false);

    local5_life12 += 1;

    if (!((local4_life7 != null))) {

        break init_join_57;

    }

    if (!((local4_life7 == null))) { continue init_cycle_34; }

    break init_cycle_34;

    }

    }

    ((com.moon.g6)(receiver)).c = ((com.moon.module.impl.ESP)(p0));

    }

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(1703356022751152608L)), ((long)(1895933396851215249L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(132907654533215L)))));
    long local11_life6 = (com.moon.g6.k ^ 125343404610514L);
    n = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill197_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill197_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill197_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill197_14 = new byte[8];
    (__sourceSpill197_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill197_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation197_16 = __sourceSpill197_14;
    ((javax.crypto.Cipher)(__sourceSpill197_11)).init(((int)(__sourceSpill197_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill197_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation197_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[30];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "µl¶\rÐ©ªySÿ[éó×DÞ\"ÕzÚ\177õ¯Þ¿¦7&¯\004=\033ôÉpv$fCë[^\033³¶ü\031¯\026o¤%eWå³\021Ø\023âÚT×Ò\023F\027q\017áÐ-ÌG«\034×:pm0o¢Z\035ÝÃì7XÉzVÎ\nç¢õ\007¤c¦<ãÁH ®ùÇ\rëÁìðò\0019â&$³ÜB{¹heØ\036pgÈ\033 ËÞìw+\030&·}\024°n³Ø-pÁ\037ÅP3Ö\006Özq´mT´âzÈ\005±ÍhÀ¹']¯X4\031@\005ÑÁ×\\ÜkôN¶"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill197_25 = local4_life21;
        int __sourceSpill197_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill197_25)).substring(((int)(__sourceSpill197_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill197_30 = local6_life19;
        int __sourceSpill197_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill197_33 = new byte[8];
        (__sourceSpill197_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill197_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill197_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill197_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill197_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill197_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill197_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill197_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill197_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill197_34)).doFinal(((byte[])(__sourceSpill197_33)));
        (__sourceSpill197_30)[__sourceSpill197_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "bpç\027¥9Õø\036X>*ÅË<"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill197_38 = local4_life21;
        int __sourceSpill197_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill197_38)).substring(((int)(__sourceSpill197_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill197_43 = local6_life19;
        int __sourceSpill197_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill197_46 = new byte[8];
        (__sourceSpill197_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill197_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill197_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill197_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill197_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill197_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill197_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill197_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill197_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill197_47)).doFinal(((byte[])(__sourceSpill197_46)));
        (__sourceSpill197_43)[__sourceSpill197_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    l = ((long[])(local6_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[30]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
    int[] __sourceSpill197_55 = new int[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_54(23225, (5264299604682352447L ^ local11_life6))];
    (__sourceSpill197_55)[0] = 1;
    (__sourceSpill197_55)[1] = 2;
    (__sourceSpill197_55)[2] = 4;
    (__sourceSpill197_55)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_56(5925, (6873989168330500781L ^ local11_life6));
    (__sourceSpill197_55)[4] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_57(8958, (5955016717668802415L ^ local11_life6));
    (__sourceSpill197_55)[5] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_58(8386, (8415224166960455000L ^ local11_life6));
    (__sourceSpill197_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_59(23933, (5589366950860103926L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_60(29574, (8395199535718174220L ^ local11_life6));
    (__sourceSpill197_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_61(22881, (8328165396279272678L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_62(12742, (2374859195569982558L ^ local11_life6));
    (__sourceSpill197_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_63(30812, (7634441391196636625L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_64(448, (542482252430801986L ^ local11_life6));
    (__sourceSpill197_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_65(11668, (762212604261715995L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_66(2034, (2575242487559944828L ^ local11_life6));
    (__sourceSpill197_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_67(18893, (8046023788488537168L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_68(3329, (8046797966472179860L ^ local11_life6));
    (__sourceSpill197_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_69(22122, (7348736816627100659L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_70(23940, (4979244572966199327L ^ local11_life6));
    (__sourceSpill197_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_71(24821, (6992718664008211829L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_72(18155, (8151575949293763431L ^ local11_life6));
    b = ((int[])(__sourceSpill197_55));
}

private static native <E extends Throwable> void __sourceConstructorInit_c5f1893356c3b0f5_0(com.moon.g6 a0) throws E;

public com.moon.iu b__iu() {
return this.e;
}


public com.moon.hW b__hW() {
return this.j;
}


public int b() {
return this.h;
}


public com.moon.hW a__hW() {
return this.i;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1203_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/g6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.g6.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23595;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/g6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.iu a__iu() {
return this.d;
}


public com.moon.module.impl.ESP a__lV() {
return this.c;
}


private void a(com.moon.iu p0, int p1, com.moon.iu p2, float p3) {
com.moon.jE forwardValue227_94_0;
    java.lang.Object forwardValue227_94_1;
    com.moon.jE forwardValue227_97_0;
    com.moon.jE forwardValue227_98_0;
    float forwardValue227_98_1;
    com.moon.jE forwardValue227_111_0;
    java.lang.Object forwardValue227_111_1;
    com.moon.jE forwardValue227_117_0;
    int forwardValue227_117_1;
    com.moon.jE forwardValue227_118_0;
    com.moon.jE forwardValue227_119_0;
    int forwardValue227_119_1;
    int forwardValue227_146_0;
    net.minecraft.entity.Entity[] spill227_0;
    int spill227_1;
    com.moon.jE spill227_2;
    com.moon.iu spill227_3;
    com.moon.jE spill227_4;
    com.moon.iu spill227_5;
    boolean spill227_6;
    int spill227_7;
    int spill227_8;
    long life5_3;
    com.moon.iw life8_8;
    net.minecraft.entity.Entity[] life7_9;
    com.moon.iB life9_20;
    forward_join_146: {
    forward_join_120: {
    forward_join_119: {
    forward_join_118: {
    forward_join_117: {
    forward_join_111: {
    forward_join_98: {
    forward_join_97: {
    forward_join_94: {
    life5_3 = (com.moon.g6.k ^ 139472149496874L);
    spill227_0 = moom.CA.b();
    life8_8 = ((com.moon.hW)(this.j)).a__iw();
    life7_9 = spill227_0;
    spill227_1 = ((life8_8 instanceof com.moon.iB) ? 1 : 0);
    if (!((life7_9 != null))) {
        forwardValue227_146_0 = spill227_1;
        break forward_join_146;
    }
    if (!((spill227_1 != 0))) {
        break forward_join_120;
    }
    life9_20 = ((com.moon.iB)(life8_8));
    ((com.moon.jD)(((com.moon.iB)(life9_20)).a__jD())).a__Void();
    ((com.moon.iu)(p2)).a(((boolean)(true)));
    org.lwjgl.opengl.GL11.glClearColor(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((com.moon.iu)(p2)).e();
    ((com.moon.jE)(((com.moon.iB)(life9_20)).g())).a__Void(((int)(__sourceIntrinsic_6c59c9a04cf5_invokedynamic227_12(4575, (3222584918465084324L ^ life5_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_6c59c9a04cf5_invokedynamic227_14(28312, (2125702511898985700L ^ life5_3)))));
    moom.kZ.i(((int)(((com.moon.iu)(p0)).g)));
    ((com.moon.jE)(((com.moon.iB)(life9_20)).c())).a__Void(((int)(__sourceIntrinsic_6c59c9a04cf5_invokedynamic227_19(28087, (2963918159742666707L ^ life5_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_6c59c9a04cf5_invokedynamic227_21(6379, (4094749008786518678L ^ life5_3)))));
    moom.kZ.i(((int)(p1)));
    ((com.moon.jE)(((com.moon.iB)(life9_20)).e())).a(((float)((0x1.0p0f / ((float) ((com.moon.iu)(p2)).c)))), ((float)((0x1.0p0f / ((float) ((com.moon.iu)(p2)).d)))));
    ((com.moon.jE)(((com.moon.iB)(life9_20)).d__sourceReturn_2220af9394())).a(((float)(p3)), ((float)(p3)));
    spill227_2 = ((com.moon.iB)(life9_20)).f();
    spill227_3 = p2;
    if (!((life7_9 != null))) {
        forwardValue227_94_0 = spill227_2;
        forwardValue227_94_1 = spill227_3;
        break forward_join_94;
    }
    if (!((spill227_3 == this.d))) {
        forwardValue227_97_0 = spill227_2;
        break forward_join_97;
    }
    forwardValue227_94_0 = spill227_2;
    forwardValue227_94_1 = ((com.moon.setting.FloatSetting)(((com.moon.module.impl.ESP)(((com.moon.g6)(this)).a__lV())).c__kZ())).getValue();
    }
    forwardValue227_98_0 = forwardValue227_94_0;
    forwardValue227_98_1 = ((java.lang.Float)(((java.lang.Float)(forwardValue227_94_1)))).floatValue();
    break forward_join_98;
    }
    forwardValue227_98_0 = forwardValue227_97_0;
    forwardValue227_98_1 = 0x1.0p0f;
    }
    ((com.moon.jE)(forwardValue227_98_0)).a(((float)(forwardValue227_98_1)));
    spill227_4 = ((com.moon.iB)(life9_20)).h();
    spill227_5 = p2;
    if (!((life7_9 != null))) {
        forwardValue227_111_0 = spill227_4;
        forwardValue227_111_1 = spill227_5;
        break forward_join_111;
    }
    if (!((spill227_5 == this.d))) {
        forwardValue227_118_0 = spill227_4;
        break forward_join_118;
    }
    forwardValue227_111_0 = spill227_4;
    forwardValue227_111_1 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g6)(this)).a__lV())).q())).getValue();
    }
    spill227_6 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue227_111_1)))).booleanValue();
    if (!((life7_9 != null))) {
        forwardValue227_117_0 = forwardValue227_111_0;
        forwardValue227_117_1 = ((spill227_6) ? 1 : 0);
        break forward_join_117;
    }
    if (!(spill227_6)) {
        forwardValue227_118_0 = forwardValue227_111_0;
        break forward_join_118;
    }
    forwardValue227_117_0 = forwardValue227_111_0;
    forwardValue227_117_1 = 1;
    }
    forwardValue227_119_0 = forwardValue227_117_0;
    forwardValue227_119_1 = forwardValue227_117_1;
    break forward_join_119;
    }
    forwardValue227_119_0 = forwardValue227_118_0;
    forwardValue227_119_1 = 0;
    }
    ((com.moon.jE)(forwardValue227_119_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue227_119_1))));
    }
    ((com.moon.hW)(this.j)).b();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_6c59c9a04cf5_invokedynamic227_49(26480, (8487351017982954774L ^ life5_3)))));
    spill227_7 = 6379;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_6c59c9a04cf5_invokedynamic227_52(spill227_7, (4094749008786518678L ^ life5_3)))));
    spill227_8 = 5177;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_6c59c9a04cf5_invokedynamic227_55(spill227_8, (8280189055400312406L ^ life5_3)))));
    forwardValue227_146_0 = 0;
    }
    moom.kZ.i(((int)(forwardValue227_146_0)));
    return;
}


private void a(com.moon.iu p0, com.moon.iu p1, float p2) {
int forwardValue229_83_0;
    net.minecraft.entity.Entity[] spill229_0;
    int spill229_1;
    int spill229_2;
    long spill229_3;
    int spill229_4;
    long life4_3;
    com.moon.iw life7_8;
    net.minecraft.entity.Entity[] life6_9;
    com.moon.iA life8_20;
    forward_join_83: {
    forward_join_65: {
    life4_3 = (com.moon.g6.k ^ 36731004514402L);
    spill229_0 = moom.CA.b();
    life7_8 = ((com.moon.hW)(this.i)).a__iw();
    life6_9 = spill229_0;
    spill229_1 = ((life7_8 instanceof com.moon.iA) ? 1 : 0);
    if (!((life6_9 != null))) {
        forwardValue229_83_0 = spill229_1;
        break forward_join_83;
    }
    if (!((spill229_1 != 0))) {
        break forward_join_65;
    }
    life8_20 = ((com.moon.iA)(life7_8));
    spill229_2 = 2897;
    ((com.moon.jD)(((com.moon.iA)(life8_20)).a__jD())).a__Void();
    spill229_3 = (1751943667991565672L ^ life4_3);
    ((com.moon.iu)(p1)).a(((boolean)(true)));
    org.lwjgl.opengl.GL11.glClearColor(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((com.moon.iu)(p1)).e();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_6bc8a33bc229_invokedynamic229_11(spill229_2, spill229_3))));
    ((com.moon.iu)(p0)).c();
    ((com.moon.jE)(((com.moon.iA)(life8_20)).c())).a__Void(((int)(0)));
    ((com.moon.jE)(((com.moon.iA)(life8_20)).e())).a(((float)((0x1.0p0f / ((float) ((com.moon.iu)(p1)).c)))), ((float)((0x1.0p0f / ((float) ((com.moon.iu)(p1)).d)))));
    ((com.moon.jE)(((com.moon.iA)(life8_20)).d__sourceReturn_2220af9394())).a(((float)(p2)), ((float)(p2)));
    ((com.moon.jE)(((com.moon.iA)(life8_20)).f())).a(((float)(0x1.0p0f)));
    }
    ((com.moon.hW)(this.i)).b();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_6bc8a33bc229_invokedynamic229_26(7394, (755790010144932557L ^ life4_3)))));
    spill229_4 = 5177;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_6bc8a33bc229_invokedynamic229_29(spill229_4, (8280285326176602654L ^ life4_3)))));
    forwardValue229_83_0 = 0;
    }
    moom.kZ.i(((int)(forwardValue229_83_0)));
    return;
}


public com.moon.iu[] a__Arrayiu() {
return this.f;
}


public int a() {
return this.g;
}


public void a(com.moon.iu p0, com.moon.iu p1) {
com.moon.g6 lexicalValue43_55_0;
    com.moon.hW lexicalValue43_56_0;
    com.moon.hW lexicalValue43_67_0;
    com.moon.g6 lexicalValue43_81_0;
    com.moon.g6 lexicalValue43_89_0;
    int lexicalValue43_117_0;
    int lexicalValue43_129_0;
    int lexicalValue43_188_0;
    com.moon.g6 lexicalValue43_201_0;
    com.moon.iu lexicalValue43_201_1;
    int lexicalValue43_201_2;
    com.moon.g6 lexicalValue43_202_0;
    com.moon.iu lexicalValue43_202_1;
    com.moon.g6 lexicalValue43_207_0;
    com.moon.iu lexicalValue43_207_1;
    int lexicalValue43_207_2;
    com.moon.g6 lexicalValue43_213_0;
    com.moon.iu lexicalValue43_213_1;
    int lexicalValue43_213_2;
    com.moon.g6 lexicalValue43_219_0;
    com.moon.iu lexicalValue43_219_1;
    int lexicalValue43_219_2;
    com.moon.iu lexicalValue43_219_3;
    net.minecraft.entity.Entity[] spill43_0;
    com.moon.g6 spill43_1;
    com.moon.g6 spill43_2;
    com.moon.hW spill43_3;
    com.moon.g6 spill43_4;
    com.moon.g6 spill43_5;
    boolean spill43_6;
    boolean spill43_7;
    com.moon.g6 spill43_8;
    com.moon.iu spill43_9;
    int spill43_10;
    long life3_3;
    int life6_10;
    float life7_18;
    int life8_21;
    net.minecraft.entity.Entity[] life5_22;
    int life9_25;
    int life10_177;
    int life11_186;
    com.moon.iu life12_191;
    int life10_245;
    lexical_join_229: {
    lexical_join_224: {
    lexical_join_188: {
    lexical_join_176: {
    lexical_join_129: {
    lexical_join_128: {
    lexical_join_117: {
    lexical_join_106: {
    lexical_join_89: {
    lexical_join_88: {
    lexical_join_81: {
    lexical_join_72: {
    lexical_join_67: {
    lexical_join_63: {
    lexical_join_56: {
    lexical_join_55: {
    lexical_join_48: {
    life3_3 = (com.moon.g6.k ^ 134153353167566L);
    life6_10 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.ESP)(((com.moon.g6)(this)).a__lV())).b__k1())).getValue())))).intValue();
    spill43_0 = moom.CA.b();
    life7_18 = ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.ESP)(((com.moon.g6)(this)).a__lV())).b__kZ())).getValue())))).floatValue();
    life8_21 = ((net.minecraft.client.Minecraft)(com.moon.g6.a)).G;
    life5_22 = spill43_0;
    life9_25 = ((net.minecraft.client.Minecraft)(com.moon.g6.a)).H;
    spill43_1 = this;
    if (!((life5_22 != null))) {
        lexicalValue43_55_0 = spill43_1;
        break lexical_join_55;
    }
    if (!((((com.moon.g6)(spill43_1)).g == life8_21))) {
        break lexical_join_48;
    }
    spill43_2 = this;
    if (!((life5_22 != null))) {
        lexicalValue43_55_0 = spill43_2;
        break lexical_join_55;
    }
    if (!((((com.moon.g6)(spill43_2)).h == life9_25))) {
        break lexical_join_48;
    }
    spill43_3 = this.i;
    if (!((life5_22 != null))) {
        lexicalValue43_56_0 = spill43_3;
        break lexical_join_56;
    }
    if (!((spill43_3 != null))) {
        break lexical_join_48;
    }
    spill43_4 = this;
    if (!((life5_22 != null))) {
        lexicalValue43_89_0 = spill43_4;
        break lexical_join_89;
    }
    if (!((((com.moon.g6)(spill43_4)).j == null))) {
        break lexical_join_88;
    }
    }
    this.g = ((int)(life8_21));
    this.h = ((int)(life9_25));
    lexicalValue43_55_0 = this;
    }
    lexicalValue43_56_0 = ((com.moon.g6)(lexicalValue43_55_0)).i;
    }
    if (!((life5_22 != null))) {
        lexicalValue43_67_0 = lexicalValue43_56_0;
        break lexical_join_67;
    }
    if (!((lexicalValue43_56_0 != null))) {
        break lexical_join_63;
    }
    ((com.moon.hY)(((com.moon.hW)(this.i)).a__hY())).g();
    }
    spill43_5 = this;
    if (!((life5_22 != null))) {
        lexicalValue43_81_0 = spill43_5;
        break lexical_join_81;
    }
    lexicalValue43_67_0 = ((com.moon.g6)(spill43_5)).j;
    }
    if (!((lexicalValue43_67_0 != null))) {
        break lexical_join_72;
    }
    ((com.moon.hY)(((com.moon.hW)(this.j)).a__hY())).g();
    }
    this.i = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.GLOW_DOWN))))).c())).a__hX())).a()));
    lexicalValue43_81_0 = this;
    }
    ((com.moon.g6)(lexicalValue43_81_0)).j = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.GLOW_UP))))).c())).a__hX())).a()));
    }
    lexicalValue43_89_0 = this;
    }
    spill43_6 = ((com.moon.iu)(((com.moon.g6)(lexicalValue43_89_0)).d)).a__Boolean(((int)(((net.minecraft.client.Minecraft)(com.moon.g6.a)).G)), ((int)(((net.minecraft.client.Minecraft)(com.moon.g6.a)).H)));
    if (!((life5_22 != null))) {
        lexicalValue43_117_0 = ((spill43_6) ? 1 : 0);
        break lexical_join_117;
    }
    if (!(spill43_6)) {
        break lexical_join_106;
    }
    ((com.moon.iu)(this.d)).a(((int)(__sourceIntrinsic_31c793b1bac2_invokedynamic43_52(6961, (7412680960804632509L ^ life3_3)))));
    }
    lexicalValue43_117_0 = ((((com.moon.iu)(this.e)).a__Boolean(((int)((((net.minecraft.client.Minecraft)(com.moon.g6.a)).G / 2))), ((int)((((net.minecraft.client.Minecraft)(com.moon.g6.a)).H / 2))))) ? 1 : 0);
    }
    if (!((life5_22 != null))) {
        lexicalValue43_129_0 = lexicalValue43_117_0;
        break lexical_join_129;
    }
    if (!((lexicalValue43_117_0 != 0))) {
        break lexical_join_128;
    }
    ((com.moon.iu)(this.e)).a(((int)(__sourceIntrinsic_31c793b1bac2_invokedynamic43_62(25920, (3762482553038588360L ^ life3_3)))));
    }
    lexicalValue43_129_0 = 0;
    }
    life10_177 = lexicalValue43_129_0;
    lexical_cycle_130: while (true) {
    lexical_join_174: {
    lexical_join_173: {
    if (!((life10_177 < (this.f).length))) {
        break lexical_join_176;
    }
    life11_186 = (com.moon.g6.b)[life10_177];
    life12_191 = (this.f)[life10_177];
    if (!((life5_22 != null))) {
        break lexical_join_174;
    }
    spill43_7 = ((com.moon.iu)(life12_191)).a__Boolean(((int)((((net.minecraft.client.Minecraft)(com.moon.g6.a)).G / life11_186))), ((int)((((net.minecraft.client.Minecraft)(com.moon.g6.a)).H / life11_186))));
    if (!((life5_22 != null))) {
        lexicalValue43_188_0 = ((spill43_7) ? 1 : 0);
        break lexical_join_188;
    }
    if (!(spill43_7)) {
        break lexical_join_173;
    }
    ((com.moon.iu)(life12_191)).a(((int)(__sourceIntrinsic_31c793b1bac2_invokedynamic43_73(25920, (3762482553038588360L ^ life3_3)))));
    ((com.moon.iu)(life12_191)).b(((int)(__sourceIntrinsic_31c793b1bac2_invokedynamic43_75(19195, (1173570652431771249L ^ life3_3)))));
    }
    life10_177 += 1;
    }
    if (!((life5_22 == null))) { continue lexical_cycle_130; }
    break lexical_cycle_130;
    }
    }
    moom.kZ.a(((int)(1)), ((int)(0)), ((int)(1)), ((int)(0)));
    ((com.moon.g6)(this)).a(((com.moon.iu)(p1)), ((com.moon.iu)(this.e)), ((float)(life7_18)));
    lexicalValue43_188_0 = life6_10;
    }
    life10_245 = lexicalValue43_188_0;
    lexical_cycle_189: while (true) {
    lexical_join_219: {
    lexical_join_213: {
    lexical_join_207: {
    lexical_join_202: {
    lexical_join_201: {
    if (!((life10_245 > 0))) {
        break lexical_join_224;
    }
    spill43_8 = this;
    spill43_9 = p0;
    spill43_10 = life10_245;
    if (!((life5_22 != null))) {
        lexicalValue43_201_0 = spill43_8;
        lexicalValue43_201_1 = spill43_9;
        lexicalValue43_201_2 = spill43_10;
        break lexical_join_201;
    }
    if (!((spill43_10 == life6_10))) {
        lexicalValue43_202_0 = spill43_8;
        lexicalValue43_202_1 = spill43_9;
        break lexical_join_202;
    }
    lexicalValue43_201_0 = spill43_8;
    lexicalValue43_201_1 = spill43_9;
    lexicalValue43_201_2 = ((com.moon.iu)(this.e)).g;
    }
    lexicalValue43_207_0 = lexicalValue43_201_0;
    lexicalValue43_207_1 = lexicalValue43_201_1;
    lexicalValue43_207_2 = lexicalValue43_201_2;
    break lexical_join_207;
    }
    lexicalValue43_207_0 = lexicalValue43_202_0;
    lexicalValue43_207_1 = lexicalValue43_202_1;
    lexicalValue43_207_2 = ((com.moon.iu)((this.f)[life10_245])).g;
    }
    if (!((life10_245 == 1))) {
        lexicalValue43_213_0 = lexicalValue43_207_0;
        lexicalValue43_213_1 = lexicalValue43_207_1;
        lexicalValue43_213_2 = lexicalValue43_207_2;
        break lexical_join_213;
    }
    lexicalValue43_219_0 = lexicalValue43_207_0;
    lexicalValue43_219_1 = lexicalValue43_207_1;
    lexicalValue43_219_2 = lexicalValue43_207_2;
    lexicalValue43_219_3 = this.d;
    break lexical_join_219;
    }
    lexicalValue43_219_0 = lexicalValue43_213_0;
    lexicalValue43_219_1 = lexicalValue43_213_1;
    lexicalValue43_219_2 = lexicalValue43_213_2;
    lexicalValue43_219_3 = (this.f)[(life10_245 - 1)];
    }
    ((com.moon.g6)(lexicalValue43_219_0)).a(((com.moon.iu)(lexicalValue43_219_1)), ((int)(lexicalValue43_219_2)), ((com.moon.iu)(lexicalValue43_219_3)), ((float)(life7_18)));
    life10_245 += -1;
    if (!((life5_22 == null))) { continue lexical_cycle_189; }
    break lexical_cycle_189;
    }
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_229;
    }
    moom.CA.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[5])));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite197_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c5f1893356c3b0f5_originalDynamicSite24_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c59c9a04cf5_invokedynamic227_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c59c9a04cf5_invokedynamic227_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c59c9a04cf5_invokedynamic227_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c59c9a04cf5_invokedynamic227_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c59c9a04cf5_invokedynamic227_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c59c9a04cf5_invokedynamic227_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c59c9a04cf5_invokedynamic227_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_31c793b1bac2_invokedynamic43_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_31c793b1bac2_invokedynamic43_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_31c793b1bac2_invokedynamic43_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_31c793b1bac2_invokedynamic43_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6bc8a33bc229_invokedynamic229_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6bc8a33bc229_invokedynamic229_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6bc8a33bc229_invokedynamic229_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1203_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
