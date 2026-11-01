package net.minecraft.client.shader;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ShaderUniform {

private static final org.apache.logging.log4j.Logger a;

private int b;

private final int c;

private final int d;

private final java.nio.IntBuffer e;

private final java.nio.FloatBuffer f;

private final java.lang.String g;

private boolean h;

private final net.minecraft.client.shader.ShaderManager i;

private static final long j;

private static final long[] k;

private static final java.lang.Integer[] l;

private static final java.util.Map m;

public ShaderUniform(java.lang.String p0, int p1, int p2, net.minecraft.client.shader.ShaderManager p3) {
super();
    this.g = ((java.lang.String)(p0));
    this.c = ((int)(p2));
    this.d = ((int)(p1));
    this.i = ((net.minecraft.client.shader.ShaderManager)(p3));
    if ((p1 <= 3)) {
        this.e = ((java.nio.IntBuffer)(org.lwjgl.BufferUtils.createIntBuffer(((int)(p2)))));
        this.f = ((java.nio.FloatBuffer)(null));
    } else {
        this.e = ((java.nio.IntBuffer)(null));
        this.f = ((java.nio.FloatBuffer)(org.lwjgl.BufferUtils.createFloatBuffer(((int)(p2)))));
    }
    this.b = ((int)(-1));
    ((net.minecraft.client.shader.ShaderUniform)(this)).a__Void();
    return;
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(-5549317172406710543L)), ((long)(5319394195828511532L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(240939699564850L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.shader.ShaderUniform.j ^ 123417198716542L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1185_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1185_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1185_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1185_14 = new byte[8];
    (__sourceSpill1185_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1185_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1185_16 = __sourceSpill1185_14;
    ((javax.crypto.Cipher)(__sourceSpill1185_11)).init(((int)(__sourceSpill1185_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1185_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1185_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[15];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "§lûø[Â'\036Ó:\n0S­\006 ÞKZÍ®³\016\bÜÉ#rÚ\004±ã×}aÊÉ\021\002\031»¡/¯ø\013Þ\003ª1\025£½4£êZ5lÕugË´\016Æçù4k\022Ä¬¯æZ§\\hÓvrU~sÀ\035±³û"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1185_25 = local6_life21;
        int __sourceSpill1185_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1185_25)).substring(((int)(__sourceSpill1185_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1185_30 = local8_life19;
        int __sourceSpill1185_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1185_33 = new byte[8];
        (__sourceSpill1185_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1185_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1185_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1185_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1185_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1185_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1185_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1185_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1185_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1185_34)).doFinal(((byte[])(__sourceSpill1185_33)));
        (__sourceSpill1185_30)[__sourceSpill1185_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ôb:'\033£Í·ÃÒ ¶>\002¡"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1185_38 = local6_life21;
        int __sourceSpill1185_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1185_38)).substring(((int)(__sourceSpill1185_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1185_43 = local8_life19;
        int __sourceSpill1185_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1185_46 = new byte[8];
        (__sourceSpill1185_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1185_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1185_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1185_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1185_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1185_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1185_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1185_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1185_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1185_47)).doFinal(((byte[])(__sourceSpill1185_46)));
        (__sourceSpill1185_43)[__sourceSpill1185_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[15]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}


public void b() {
long local1 = (net.minecraft.client.shader.ShaderUniform.j ^ 118202362612576L);
    if ((!this.h)) {
        
    }
    this.h = ((boolean)(false));
    if ((this.d <= 3)) {
        this.c();
    } else {
        if ((this.d <= __sourceIntrinsic_938da207dded_invokedynamic10989_6(23195, (3295416085794126906L ^ local1)))) {
        this.d();
    } else {
        if ((this.d > __sourceIntrinsic_938da207dded_invokedynamic10989_9(10614, (4887736733348073426L ^ local1)))) {
        ((org.apache.logging.log4j.Logger)(net.minecraft.client.shader.ShaderUniform.a)).warn(((java.lang.String)(__sourceIntrinsic_938da207dded_invokedynamic10989_12(this.d))));
        return;
    }
        this.e();
    }
    }
    return;
}


public void b(float p0, float p1, float p2, float p3) {
long local5 = (net.minecraft.client.shader.ShaderUniform.j ^ 109381437756498L);
    ((java.nio.FloatBuffer)(this.f)).position(((int)(0)));
    if ((this.d >= 4)) {
        ((java.nio.FloatBuffer)(this.f)).put(((int)(0)), ((float)(p0)));
    }
    if ((this.d >= 5)) {
        ((java.nio.FloatBuffer)(this.f)).put(((int)(1)), ((float)(p1)));
    }
    if ((this.d >= __sourceIntrinsic_d40c86d02a0c_invokedynamic10990_10(32623, (3987761849160664819L ^ local5)))) {
        ((java.nio.FloatBuffer)(this.f)).put(((int)(2)), ((float)(p2)));
    }
    if ((this.d >= __sourceIntrinsic_d40c86d02a0c_invokedynamic10990_14(23195, (3295407331708642056L ^ local5)))) {
        ((java.nio.FloatBuffer)(this.f)).put(((int)(3)), ((float)(p3)));
    }
    ((net.minecraft.client.shader.ShaderUniform)(this)).a__Void();
    return;
}


private void e() {
forest_join_23: {
    forest_join_17: {
    forest_join_10: {
    forest_join_3: {
    switch (this.d) {
case 8:
{
        break forest_join_3;
    }
case 9:
{
        break forest_join_10;
    }
case 10:
{
        break forest_join_17;
    }
default:
{
        break forest_join_23;
    }
}
    }
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(this.b)), ((boolean)(true)), ((java.nio.FloatBuffer)(this.f)));
    break forest_join_23;
    }
    net.minecraft.client.renderer.OpenGlHelper.b(((int)(this.b)), ((boolean)(true)), ((java.nio.FloatBuffer)(this.f)));
    break forest_join_23;
    }
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(this.b)), ((boolean)(true)), ((java.nio.FloatBuffer)(this.f)));
    }
    return;
}


private void c() {
switch (this.d) {
case 0:
{
        net.minecraft.client.renderer.OpenGlHelper.a(((int)(this.b)), ((java.nio.IntBuffer)(this.e)));
        break;
    }
case 1:
{
        net.minecraft.client.renderer.OpenGlHelper.b(((int)(this.b)), ((java.nio.IntBuffer)(this.e)));
        break;
    }
case 2:
{
        net.minecraft.client.renderer.OpenGlHelper.c(((int)(this.b)), ((java.nio.IntBuffer)(this.e)));
        break;
    }
case 3:
{
        net.minecraft.client.renderer.OpenGlHelper.d(((int)(this.b)), ((java.nio.IntBuffer)(this.e)));
        break;
    }
default:
{
        ((org.apache.logging.log4j.Logger)(net.minecraft.client.shader.ShaderUniform.a)).warn(((java.lang.String)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic9078_15(this.c))));
        break;
    }
}
    return;
}


private void d() {
switch (this.d) {
case 4:
{
        net.minecraft.client.renderer.OpenGlHelper.a(((int)(this.b)), ((java.nio.FloatBuffer)(this.f)));
        break;
    }
case 5:
{
        net.minecraft.client.renderer.OpenGlHelper.b(((int)(this.b)), ((java.nio.FloatBuffer)(this.f)));
        break;
    }
case 6:
{
        net.minecraft.client.renderer.OpenGlHelper.c(((int)(this.b)), ((java.nio.FloatBuffer)(this.f)));
        break;
    }
case 7:
{
        net.minecraft.client.renderer.OpenGlHelper.d(((int)(this.b)), ((java.nio.FloatBuffer)(this.f)));
        break;
    }
default:
{
        ((org.apache.logging.log4j.Logger)(net.minecraft.client.shader.ShaderUniform.a)).warn(((java.lang.String)(__sourceIntrinsic_6cce62949456_invokedynamic9079_15(this.c))));
        break;
    }
}
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10994_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10, float p11, float p12, float p13, float p14, float p15) {
long local17 = (net.minecraft.client.shader.ShaderUniform.j ^ 116093971754733L);
    ((java.nio.FloatBuffer)(this.f)).position(((int)(0)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(0)), ((float)(p0)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(1)), ((float)(p1)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(2)), ((float)(p2)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(3)), ((float)(p3)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(4)), ((float)(p4)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(5)), ((float)(p5)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(__sourceIntrinsic_4c58593e285a_originalDynamicSite1854_16(5519, (5737950558673606311L ^ local17)))), ((float)(p6)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(__sourceIntrinsic_4c58593e285a_originalDynamicSite1854_19(8282, (4070294666146849648L ^ local17)))), ((float)(p7)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(__sourceIntrinsic_4c58593e285a_originalDynamicSite1854_22(5944, (1048814278213178392L ^ local17)))), ((float)(p8)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(__sourceIntrinsic_4c58593e285a_originalDynamicSite1854_25(11712, (7681349775333338859L ^ local17)))), ((float)(p9)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(__sourceIntrinsic_4c58593e285a_originalDynamicSite1854_28(31025, (6845571497808296470L ^ local17)))), ((float)(p10)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(__sourceIntrinsic_4c58593e285a_originalDynamicSite1854_31(974, (3231604521741943020L ^ local17)))), ((float)(p11)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(__sourceIntrinsic_4c58593e285a_originalDynamicSite1854_34(9366, (393091396524058547L ^ local17)))), ((float)(p12)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(__sourceIntrinsic_4c58593e285a_originalDynamicSite1854_37(6920, (6916500807697864748L ^ local17)))), ((float)(p13)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(__sourceIntrinsic_4c58593e285a_originalDynamicSite1854_40(17780, (5290691460070065753L ^ local17)))), ((float)(p14)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(__sourceIntrinsic_4c58593e285a_originalDynamicSite1854_43(25001, (3158546569519981190L ^ local17)))), ((float)(p15)));
    ((net.minecraft.client.shader.ShaderUniform)(this)).a__Void();
    return;
}


public void a(org.lwjgl.util.vector.Matrix4f p0) {
this.a(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m00)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m01)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m02)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m03)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m10)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m11)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m12)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m13)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m20)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m21)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m22)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m23)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m30)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m31)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m32)), ((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m33)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.shader.ShaderUniform.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22317;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/pG", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(float p0) {
((java.nio.FloatBuffer)(this.f)).position(((int)(0)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(0)), ((float)(p0)));
    ((net.minecraft.client.shader.ShaderUniform)(this)).a__Void();
    return;
}


public java.lang.String a() {
return this.g;
}


public void a(int p0) {
this.b = ((int)(p0));
    return;
}


public static int a(java.lang.String p0) {
long local1 = (net.minecraft.client.shader.ShaderUniform.j ^ 88522674719378L);
    int local3 = -1;
    if (((java.lang.String)(p0)).equals(((java.lang.Object)("int")))) {
        local3 = 0;
    } else {
        if (((java.lang.String)(p0)).equals(((java.lang.Object)("float")))) {
        local3 = 4;
    } else {
        if (((java.lang.String)(p0)).startsWith(((java.lang.String)("matrix")))) {
        if (((java.lang.String)(p0)).endsWith(((java.lang.String)("2x2")))) {
        local3 = __sourceIntrinsic_599c5f800586_invokedynamic10995_5(2689, (4692391787956678111L ^ local1));
    } else {
        if (((java.lang.String)(p0)).endsWith(((java.lang.String)("3x3")))) {
        local3 = __sourceIntrinsic_599c5f800586_invokedynamic10995_7(4218, (4844463325427742499L ^ local1));
    } else {
        if (((java.lang.String)(p0)).endsWith(((java.lang.String)("4x4")))) {
        local3 = __sourceIntrinsic_599c5f800586_invokedynamic10995_9(10614, (4887674063982824992L ^ local1));
    }
    }
    }
    }
    }
    }
    return local3;
}


private void a__Void() {
this.h = ((boolean)(true));
    if ((this.i != null)) {
        ((net.minecraft.client.shader.ShaderManager)(this.i)).d();
    }
    return;
}


public void a(float[] p0) {
if (((p0).length < this.c)) {
        ((org.apache.logging.log4j.Logger)(net.minecraft.client.shader.ShaderUniform.a)).warn(((java.lang.String)(__sourceIntrinsic_619a0642cebe_invokedynamic10996_3(this.c, (p0).length))));
    } else {
        ((java.nio.FloatBuffer)(this.f)).position(((int)(0)));
        ((java.nio.FloatBuffer)(this.f)).put(((float[])(p0)));
        ((java.nio.FloatBuffer)(this.f)).position(((int)(0)));
        ((net.minecraft.client.shader.ShaderUniform)(this)).a__Void();
    }
    return;
}


public void a(int p0, int p1, int p2, int p3) {
((java.nio.IntBuffer)(this.e)).position(((int)(0)));
    if ((this.d >= 0)) {
        ((java.nio.IntBuffer)(this.e)).put(((int)(0)), ((int)(p0)));
    }
    if ((this.d >= 1)) {
        ((java.nio.IntBuffer)(this.e)).put(((int)(1)), ((int)(p1)));
    }
    if ((this.d >= 2)) {
        ((java.nio.IntBuffer)(this.e)).put(((int)(2)), ((int)(p2)));
    }
    if ((this.d >= 3)) {
        ((java.nio.IntBuffer)(this.e)).put(((int)(3)), ((int)(p3)));
    }
    ((net.minecraft.client.shader.ShaderUniform)(this)).a__Void();
    return;
}


public void a(float p0, float p1, float p2, float p3) {
((java.nio.FloatBuffer)(this.f)).position(((int)(0)));
    ((java.nio.FloatBuffer)(this.f)).put(((float)(p0)));
    ((java.nio.FloatBuffer)(this.f)).put(((float)(p1)));
    ((java.nio.FloatBuffer)(this.f)).put(((float)(p2)));
    ((java.nio.FloatBuffer)(this.f)).put(((float)(p3)));
    ((java.nio.FloatBuffer)(this.f)).flip();
    ((net.minecraft.client.shader.ShaderUniform)(this)).a__Void();
    return;
}


public void a(float p0, float p1, float p2) {
((java.nio.FloatBuffer)(this.f)).position(((int)(0)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(0)), ((float)(p0)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(1)), ((float)(p1)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(2)), ((float)(p2)));
    ((net.minecraft.client.shader.ShaderUniform)(this)).a__Void();
    return;
}


public void a(float p0, float p1) {
((java.nio.FloatBuffer)(this.f)).position(((int)(0)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(0)), ((float)(p0)));
    ((java.nio.FloatBuffer)(this.f)).put(((int)(1)), ((float)(p1)));
    ((net.minecraft.client.shader.ShaderUniform)(this)).a__Void();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_4c58593e285a_originalDynamicSite1854_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c58593e285a_originalDynamicSite1854_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c58593e285a_originalDynamicSite1854_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c58593e285a_originalDynamicSite1854_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c58593e285a_originalDynamicSite1854_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c58593e285a_originalDynamicSite1854_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c58593e285a_originalDynamicSite1854_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c58593e285a_originalDynamicSite1854_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c58593e285a_originalDynamicSite1854_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c58593e285a_originalDynamicSite1854_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic10995_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic10995_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic10995_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10994_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_619a0642cebe_invokedynamic10996_3(int a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic10989_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic10989_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_938da207dded_invokedynamic10989_12(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d40c86d02a0c_invokedynamic10990_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d40c86d02a0c_invokedynamic10990_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5b7380e7aa7c_invokedynamic9078_15(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6cce62949456_invokedynamic9079_15(int a0) throws E;
}
