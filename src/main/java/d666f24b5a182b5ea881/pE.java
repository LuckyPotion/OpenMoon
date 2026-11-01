package moom;


public class pE {

private net.minecraft.client.shader.ShaderLoader$ShaderType a;

private java.lang.String b;

private int c;

private int d;

private static long e;

private static long f;

private pE(net.minecraft.client.shader.ShaderLoader$ShaderType p0, int p1, java.lang.String p2) {
super();
    this.d = 0;
    this.a = p0;
    this.c = p1;
    this.b = p2;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-4029660804638675031L)), ((long)(-1150338971243033680L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(114746984916123L)))));
    long local0_life6 = (moom.pE.e ^ 97222145547899L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill961_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill961_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill961_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill961_13 = new byte[8];
    (__sourceSpill961_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill961_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation961_15 = __sourceSpill961_13;
    ((javax.crypto.Cipher)(__sourceSpill961_10)).init(((int)(__sourceSpill961_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill961_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation961_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7330287230835680603L;
    byte[] __sourceSpill961_19 = new byte[8];
    (__sourceSpill961_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill961_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill961_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill961_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill961_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill961_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill961_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill961_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill961_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill961_20)).doFinal(((byte[])(__sourceSpill961_19)));
    f = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> byte[] __sourceHandlerCall_07fb6ce96e08a4a212e5(java.io.BufferedInputStream a0) throws E;
private static final class __SourceHandler_07fb6ce96e08a4a212e5 {

public static byte[] f100129(java.io.BufferedInputStream p0) throws Throwable {
    java.io.BufferedInputStream life2_1;
    byte[] life1_4;
    forest_join_9: {
    life2_1 = p0;
    life1_4 = __call100129_0(p0);
    if (!((life2_1 != null))) {
        break forest_join_9;
    }
    __call100129_1(life2_1);
    }
    return life1_4;
}
public static byte[] h100129_0(java.lang.Throwable p0) throws Throwable {
    throw __call13012900_0(p0);
}
public static byte[] h100129_1(java.lang.Throwable p0, java.io.BufferedInputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    forest_join_6: {
    life2_2 = p0;
    if (!((p1 != null))) {
        break forest_join_6;
    }
    __call13012901_0(p1);
    }
    throw life2_2;
}
public static byte[] h100129_2(java.lang.Throwable p0, java.lang.Throwable p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call13012902_0(p1, life2_2);
    throw p1;
}
private static native byte[] __call100129_0(java.io.BufferedInputStream a0) throws Throwable;
private static native void __call100129_1(java.io.BufferedInputStream a0) throws Throwable;
private static native java.lang.Throwable __call13012900_0(java.lang.Throwable a0) throws Throwable;
private static native void __call13012901_0(java.io.BufferedInputStream a0) throws Throwable;
private static native void __call13012902_0(java.lang.Throwable a0, java.lang.Throwable a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5589a4f6660a4ec2527b(moom.pE a0, net.minecraft.client.shader.ShaderManager a1) throws E;
private static final class __SourceHandler_5589a4f6660a4ec2527b {

public static void f181(moom.pE receiver, net.minecraft.client.shader.ShaderManager p0) throws Throwable {
    moom.pE __stackOp181_0_0 = receiver;
    __fieldWrite181_2(__stackOp181_0_0, (__fieldRead181_1(__stackOp181_0_0) - 1));
    if ((__fieldRead181_3(receiver) <= 0)) {
        __call181_5(__fieldRead181_4(receiver));
        __call181_9(__call181_7(__fieldRead181_6(receiver)), __fieldRead181_8(receiver));
    }
    return;
}
public static void h181_0(moom.Oo p0) throws Throwable {
    throw __call1018100_0(p0);
}
private static native int __fieldRead181_1(moom.pE a0) throws Throwable;
private static native void __fieldWrite181_2(moom.pE a0, int a1) throws Throwable;
private static native int __fieldRead181_3(moom.pE a0) throws Throwable;
private static native int __fieldRead181_4(moom.pE a0) throws Throwable;
private static native void __call181_5(int a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderLoader$ShaderType __fieldRead181_6(moom.pE a0) throws Throwable;
private static native java.util.Map __call181_7(net.minecraft.client.shader.ShaderLoader$ShaderType a0) throws Throwable;
private static native java.lang.String __fieldRead181_8(moom.pE a0) throws Throwable;
private static native java.lang.Object __call181_9(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1018100_0(moom.Oo a0) throws Throwable;

}


public void b(net.minecraft.client.shader.ShaderManager p0) { __sourceHandlerCall_5589a4f6660a4ec2527b(this, p0); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


protected static byte[] a(java.io.BufferedInputStream p0) throws java.io.IOException { return __sourceHandlerCall_07fb6ce96e08a4a212e5(p0); }


public static moom.pE a(moom.oR p0, net.minecraft.client.shader.ShaderLoader$ShaderType p1, java.lang.String p2) throws java.io.IOException {
long life3_3;
    moom.pE life5_9;
    moom.DD life6_19;
    java.io.BufferedInputStream life7_27;
    byte[] life8_30;
    java.nio.ByteBuffer life9_34;
    int life10_46;
    java.lang.String life11_61;
    moom.D life12_69;
    life3_3 = (moom.pE.e ^ 57325885855893L);
    life5_9 = ((moom.pE)(__sourceExactCall_cb81c1bdb11745(((java.util.Map)(__sourceExactCall_8078de89e20c20(((net.minecraft.client.shader.ShaderLoader$ShaderType)(p1))))), ((java.lang.Object)(p2)))));
    if ((life5_9 == null)) {
        life6_19 = new moom.DD(__sourceIntrinsic_d2e6f622b9b9_invokedynamic3832_5(p2, __sourceExactCall_06831097dfb7dc(((net.minecraft.client.shader.ShaderLoader$ShaderType)(p1)))));
        life7_27 = new java.io.BufferedInputStream(__sourceExactCall_0df9e8b2fa1677(((net.minecraft.client.resources.IResource)(__sourceExactCall_e277a266c321a5(((moom.oR)(p0)), ((moom.DD)(life6_19)))))));
        life8_30 = __sourceExactCall_592ab8aa35917e(((java.io.BufferedInputStream)(life7_27)));
        life9_34 = org.lwjgl.BufferUtils.createByteBuffer(((int)((life8_30).length)));
        ((java.nio.ByteBuffer)(life9_34)).put(((byte[])(life8_30)));
        __sourceExactCall_9389e89ee53d8c(((java.nio.ByteBuffer)(life9_34)), ((int)(0)));
        life10_46 = __sourceExactCall_3128a590b7defb(((int)(__sourceExactCall_81a682b444d5b8(((net.minecraft.client.shader.ShaderLoader$ShaderType)(p1))))));
        __sourceExactCall_5873ac5988a31f(((int)(life10_46)), ((java.nio.ByteBuffer)(life9_34)));
        net.minecraft.client.renderer.OpenGlHelper.b__Void(((int)(life10_46)));
        if ((__sourceExactCall_c4bfcdd7e6856f(((int)(life10_46)), ((int)(net.minecraft.client.renderer.OpenGlHelper.n))) == 0)) {
        life11_61 = org.apache.commons.lang3.StringUtils.trim(((java.lang.String)(net.minecraft.client.renderer.OpenGlHelper.a__String(((int)(life10_46)), ((int)(((int) moom.pE.f)))))));
        life12_69 = new moom.D(__sourceIntrinsic_d2e6f622b9b9_invokedynamic3832_22(((net.minecraft.client.shader.ShaderLoader$ShaderType)(p1)).a__String(), life11_61));
        __sourceExactCall_a879f25f2fbd14(((moom.D)(life12_69)), ((java.lang.String)(__sourceExactCall_c3934c98153e35(((moom.DD)(life6_19))))));
        throw life12_69;
    }
        life5_9 = new moom.pE(p1, life10_46, p2);
        __sourceExactCall_324d355aa5b24e(((java.util.Map)(__sourceExactCall_8078de89e20c20(((net.minecraft.client.shader.ShaderLoader$ShaderType)(p1))))), ((java.lang.Object)(p2)), ((java.lang.Object)(life5_9)));
    }
    return life5_9;
}


public java.lang.String a() {
return this.b;
}


public void a(net.minecraft.client.shader.ShaderManager p0) {
this.d += 1;
    net.minecraft.client.renderer.OpenGlHelper.a__Void(((int)(((net.minecraft.client.shader.ShaderManager)(p0)).a())), ((int)(this.c)));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d2e6f622b9b9_invokedynamic3832_5(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d2e6f622b9b9_invokedynamic3832_22(java.lang.String a0, java.lang.String a1) throws E;

private static native byte[] __sourceExactCall_592ab8aa35917e(java.io.BufferedInputStream p0) throws java.io.IOException;

private static native java.io.InputStream __sourceExactCall_0df9e8b2fa1677(net.minecraft.client.resources.IResource p0);
private static native net.minecraft.client.resources.IResource __sourceExactCall_e277a266c321a5(moom.oR p0, moom.DD p1) throws java.io.IOException;
private static native void __sourceExactCall_5873ac5988a31f(int p0, java.nio.ByteBuffer p1);
private static native int __sourceExactCall_c4bfcdd7e6856f(int p0, int p1);
private static native void __sourceExactCall_a879f25f2fbd14(moom.D p0, java.lang.String p1);
private static native java.lang.String __sourceExactCall_c3934c98153e35(moom.DD p0);

private static native java.nio.ByteBuffer __sourceExactCall_9389e89ee53d8c(java.nio.ByteBuffer p0, int p1);

private static native java.lang.Object __sourceExactCall_cb81c1bdb11745(java.util.Map p0, java.lang.Object p1);
private static native java.util.Map __sourceExactCall_8078de89e20c20(net.minecraft.client.shader.ShaderLoader$ShaderType p0);
private static native java.lang.String __sourceExactCall_06831097dfb7dc(net.minecraft.client.shader.ShaderLoader$ShaderType p0);
private static native int __sourceExactCall_3128a590b7defb(int p0);
private static native int __sourceExactCall_81a682b444d5b8(net.minecraft.client.shader.ShaderLoader$ShaderType p0);
private static native java.lang.Object __sourceExactCall_324d355aa5b24e(java.util.Map p0, java.lang.Object p1, java.lang.Object p2);
}
