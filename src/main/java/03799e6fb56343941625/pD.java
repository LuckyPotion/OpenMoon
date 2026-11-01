package moom;


public class pD {

private static final org.apache.logging.log4j.Logger a;

private static moom.pD b;

private static final long c;

private static final long d;

public pD() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(2230519545490922137L)), ((long)(-2118975100110447151L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(61994577669382L)))));
    long local0_life6 = (moom.pD.c ^ 2674233800808L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill960_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill960_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill960_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill960_13 = new byte[8];
    (__sourceSpill960_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill960_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation960_15 = __sourceSpill960_13;
    ((javax.crypto.Cipher)(__sourceSpill960_10)).init(((int)(__sourceSpill960_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill960_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation960_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8287898053815233160L;
    byte[] __sourceSpill960_19 = new byte[8];
    (__sourceSpill960_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill960_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill960_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill960_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill960_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill960_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill960_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill960_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill960_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill960_20)).doFinal(((byte[])(__sourceSpill960_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}


public void b(net.minecraft.client.shader.ShaderManager p0) throws java.io.IOException {
long local2 = (moom.pD.c ^ 53761475483555L);
    ((moom.pE)(((net.minecraft.client.shader.ShaderManager)(p0)).b())).a(((net.minecraft.client.shader.ShaderManager)(p0)));
    ((moom.pE)(((net.minecraft.client.shader.ShaderManager)(p0)).a__pE())).a(((net.minecraft.client.shader.ShaderManager)(p0)));
    net.minecraft.client.renderer.OpenGlHelper.e(((int)(((net.minecraft.client.shader.ShaderManager)(p0)).a())));
    int local4 = net.minecraft.client.renderer.OpenGlHelper.a(((int)(((net.minecraft.client.shader.ShaderManager)(p0)).a())), ((int)(net.minecraft.client.renderer.OpenGlHelper.m)));
    if ((local4 == 0)) {
        ((org.apache.logging.log4j.Logger)(moom.pD.a)).warn(((java.lang.String)(__sourceIntrinsic_f1d0120a52cc_invokedynamic8656_15(((moom.pE)(((net.minecraft.client.shader.ShaderManager)(p0)).a__pE())).a(), ((moom.pE)(((net.minecraft.client.shader.ShaderManager)(p0)).b())).a()))));
        ((org.apache.logging.log4j.Logger)(moom.pD.a)).warn(((java.lang.String)(net.minecraft.client.renderer.OpenGlHelper.b__String(((int)(((net.minecraft.client.shader.ShaderManager)(p0)).a())), ((int)(((int) moom.pD.d)))))));
    }
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public int a() throws moom.D {
int life1_1;
life1_1 = net.minecraft.client.renderer.OpenGlHelper.a();
try {
if ((life1_1 <= 0)) {
throw new moom.D(__sourceIntrinsic_8aebf151eadb_invokedynamic1921_1(life1_1));
}
}
catch (moom.D __caughtSource0) {
throw moom.pD.a(((java.io.IOException)(__caughtSource0)));
}
return life1_1;
}


public void a(net.minecraft.client.shader.ShaderManager p0) {
((moom.pE)(((net.minecraft.client.shader.ShaderManager)(p0)).b())).b(((net.minecraft.client.shader.ShaderManager)(p0)));
    ((moom.pE)(((net.minecraft.client.shader.ShaderManager)(p0)).a__pE())).b(((net.minecraft.client.shader.ShaderManager)(p0)));
    net.minecraft.client.renderer.OpenGlHelper.d(((int)(((net.minecraft.client.shader.ShaderManager)(p0)).a())));
    return;
}


public static moom.pD a__pD() {
return moom.pD.b;
}


public static void a__Void() {
b = ((moom.pD)(new moom.pD()));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f1d0120a52cc_invokedynamic8656_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8aebf151eadb_invokedynamic1921_1(int a0) throws E;
}
