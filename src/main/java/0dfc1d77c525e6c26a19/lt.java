package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class lt {

private static final java.nio.FloatBuffer a;

private static final moom.DR b;

private static final moom.DR c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public lt() {
super();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-2021817054658651203L)), ((long)(-1960244130711662883L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(70311541703450L)))));
    long local11_life6 = (moom.lt.d ^ 4802922615305L);
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1389_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1389_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1389_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1389_14 = new byte[8];
    (__sourceSpill1389_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1389_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1389_16 = __sourceSpill1389_14;
    ((javax.crypto.Cipher)(__sourceSpill1389_11)).init(((int)(__sourceSpill1389_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1389_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1389_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[17];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "üÊr5ëÁ÷ÓöMd®C\031°\001¨©Ù\003Ì³«V.\033k\n7\001N!ü>tèåÞ\177ÓÍ«àaOÁÁEëÓÂOú2öñËMRDýY!Ýãû©ÍOÃÔ¡k:&[»\016>n2\000¤MK!Î.#Ú¸\023Ü#\000'\026o¢â7=b¶"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1389_25 = local4_life21;
        int __sourceSpill1389_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1389_25)).substring(((int)(__sourceSpill1389_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1389_30 = local6_life19;
        int __sourceSpill1389_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1389_33 = new byte[8];
        (__sourceSpill1389_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1389_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1389_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1389_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1389_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1389_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1389_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1389_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1389_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1389_34)).doFinal(((byte[])(__sourceSpill1389_33)));
        (__sourceSpill1389_30)[__sourceSpill1389_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "Zg \000\013¯\036¡ÈJ¬\004\013/å"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1389_38 = local4_life21;
        int __sourceSpill1389_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1389_38)).substring(((int)(__sourceSpill1389_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1389_43 = local6_life19;
        int __sourceSpill1389_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1389_46 = new byte[8];
        (__sourceSpill1389_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1389_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1389_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1389_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1389_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1389_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1389_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1389_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1389_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1389_47)).doFinal(((byte[])(__sourceSpill1389_46)));
        (__sourceSpill1389_43)[__sourceSpill1389_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    e = ((long[])(local6_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[17]));
    a = ((java.nio.FloatBuffer)(net.minecraft.client.renderer.GLAllocation.a__FloatBuffer(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1389_52(29565, (2432926686863812674L ^ local11_life6)))))));
    b = ((moom.DR)(((moom.DR)(new moom.DR(0x1.99999ap-3d, 0x1.0p0d, -0x1.666666p-1d))).a__DR()));
    c = ((moom.DR)(((moom.DR)(new moom.DR(-0x1.99999ap-3d, 0x1.0p0d, 0x1.666666p-1d))).a__DR()));
}


public static void b() {
long local0_life2 = (moom.lt.d ^ 53127573065999L);
    moom.kZ.e();
    moom.kZ.a(((int)(0)));
    moom.kZ.a(((int)(1)));
    moom.kZ.g();
    moom.kZ.a(((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_8(17576, (6584216800027843730L ^ local0_life2)))), ((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_10(5809, (4794720916921011854L ^ local0_life2)))));
    float local2_life13 = 1053609165;
    float local3_life15 = 1058642330;
    float local4_life16 = 0x0.0p0f;
    org.lwjgl.opengl.GL11.glLight(((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_18(23982, (6348005998115325342L ^ local0_life2)))), ((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_20(14429, (4201889957123252330L ^ local0_life2)))), ((java.nio.FloatBuffer)(moom.lt.a(((double)(((moom.DR)(moom.lt.b)).a)), ((double)(((moom.DR)(moom.lt.b)).b)), ((double)(((moom.DR)(moom.lt.b)).c)), ((double)(0x0.0p0d))))));
    org.lwjgl.opengl.GL11.glLight(((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_30(21268, (6364561005568330529L ^ local0_life2)))), ((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_32(25785, (5663689397040233607L ^ local0_life2)))), ((java.nio.FloatBuffer)(moom.lt.a(((float)(local3_life15)), ((float)(local3_life15)), ((float)(local3_life15)), ((float)(0x1.0p0f))))));
    org.lwjgl.opengl.GL11.glLight(((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_36(21268, (6364561005568330529L ^ local0_life2)))), ((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_38(6569, (6941780233882321311L ^ local0_life2)))), ((java.nio.FloatBuffer)(moom.lt.a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))))));
    org.lwjgl.opengl.GL11.glLight(((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_42(21268, (6364561005568330529L ^ local0_life2)))), ((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_44(5252, (2832882270359309482L ^ local0_life2)))), ((java.nio.FloatBuffer)(moom.lt.a(((float)(local4_life16)), ((float)(local4_life16)), ((float)(local4_life16)), ((float)(0x1.0p0f))))));
    org.lwjgl.opengl.GL11.glLight(((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_48(30279, (5740870089138450038L ^ local0_life2)))), ((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_50(3443, (2039442257847670080L ^ local0_life2)))), ((java.nio.FloatBuffer)(moom.lt.a(((double)(((moom.DR)(moom.lt.c)).a)), ((double)(((moom.DR)(moom.lt.c)).b)), ((double)(((moom.DR)(moom.lt.c)).c)), ((double)(0x0.0p0d))))));
    org.lwjgl.opengl.GL11.glLight(((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_60(31320, (7815429174343606885L ^ local0_life2)))), ((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_62(31373, (4464353312400089781L ^ local0_life2)))), ((java.nio.FloatBuffer)(moom.lt.a(((float)(local3_life15)), ((float)(local3_life15)), ((float)(local3_life15)), ((float)(0x1.0p0f))))));
    org.lwjgl.opengl.GL11.glLight(((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_66(31320, (7815429174343606885L ^ local0_life2)))), ((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_68(8681, (5027174331794323925L ^ local0_life2)))), ((java.nio.FloatBuffer)(moom.lt.a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))))));
    org.lwjgl.opengl.GL11.glLight(((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_72(31320, (7815429174343606885L ^ local0_life2)))), ((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_74(6685, (8884808787359285801L ^ local0_life2)))), ((java.nio.FloatBuffer)(moom.lt.a(((float)(local4_life16)), ((float)(local4_life16)), ((float)(local4_life16)), ((float)(0x1.0p0f))))));
    moom.kZ.j(((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_78(7501, (2338782230455567734L ^ local0_life2)))));
    org.lwjgl.opengl.GL11.glLightModel(((int)(__sourceIntrinsic_938da207dded_originalDynamicSite699_81(9797, (57560132095704695L ^ local0_life2)))), ((java.nio.FloatBuffer)(moom.lt.a(((float)(local2_life13)), ((float)(local2_life13)), ((float)(local2_life13)), ((float)(0x1.0p0f))))));
    return;
}


public static void c() {
moom.kZ.B();
    moom.kZ.b(((float)(-0x1.ep4f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x1.4ap7f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.lt.b();
    moom.kZ.C();
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8333_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lt"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.lt.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18119;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/lt", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


public static void a() {
moom.kZ.f();
    moom.kZ.b(((int)(0)));
    moom.kZ.b(((int)(1)));
    moom.kZ.h();
    return;
}


private static java.nio.FloatBuffer a(double p0, double p1, double p2, double p3) {
return moom.lt.a(((float)(((float) p0))), ((float)(((float) p1))), ((float)(((float) p2))), ((float)(((float) p3))));
}


private static java.nio.FloatBuffer a(float p0, float p1, float p2, float p3) {
((java.nio.FloatBuffer)(moom.lt.a)).clear();
    ((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(moom.lt.a)).put(((float)(p0))))).put(((float)(p1))))).put(((float)(p2))))).put(((float)(p3)));
    ((java.nio.FloatBuffer)(moom.lt.a)).flip();
    return moom.lt.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1389_52(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8333_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite699_81(int a0, long a1) throws E;
}
