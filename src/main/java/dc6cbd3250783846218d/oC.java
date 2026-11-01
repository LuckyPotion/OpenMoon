package moom;


public class oC {

private int a;

private final moom.oD b;

private int c;

private moom.Mk d;

private moom.Mj e;

private int f;

private static final long g;

private static final long h;

public oC(moom.oD p0) {
super();
    this.b = p0;
    this.a = net.minecraft.client.renderer.OpenGlHelper.b();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(1081374706962138840L)), ((long)(2762715822628183881L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(216680986944380L)))));
    long local0_life6 = (moom.oC.g ^ 94907802620254L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill950_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill950_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill950_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill950_13 = new byte[8];
    (__sourceSpill950_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill950_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation950_15 = __sourceSpill950_13;
    ((javax.crypto.Cipher)(__sourceSpill950_10)).init(((int)(__sourceSpill950_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill950_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation950_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3159586650310634737L;
    byte[] __sourceSpill950_19 = new byte[8];
    (__sourceSpill950_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill950_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill950_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill950_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill950_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill950_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill950_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill950_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill950_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill950_20)).doFinal(((byte[])(__sourceSpill950_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b() {
net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((int)(0)));
    return;
}


public void b(int p0) {
this.f = ((int)(p0));
    return;
}


public void c() {
if ((this.a >= 0)) {
        net.minecraft.client.renderer.OpenGlHelper.f(((int)(this.a)));
        this.a = ((int)(-1));
    }
    return;
}


public moom.Mj a__Mj() {
return this.e;
}


public int a() {
return this.f;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((int)(this.a)));
    return;
}


public void a(java.nio.ByteBuffer p0) {
long local2 = (moom.oC.g ^ 134973718722197L);
    if ((this.d != null)) {
        ((moom.Mk)(this.d)).a(((java.nio.ByteBuffer)(p0)), ((moom.Mj)(this.e)));
    } else {
        ((moom.oC)(this)).a__Void();
        net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((java.nio.ByteBuffer)(p0)), ((int)(((int) moom.oC.h))));
        this.b();
        this.c = ((int)((((java.nio.ByteBuffer)(p0)).limit() / ((moom.oD)(this.b)).d())));
    }
    return;
}


public void a(int p0) {
if ((this.f > 0)) {
        p0 = this.f;
    }
    if ((this.d != null)) {
        ((moom.Mk)(this.d)).a(((int)(p0)), ((moom.Mj)(this.e)));
    } else {
        org.lwjgl.opengl.GL11.glDrawArrays(((int)(p0)), ((int)(0)), ((int)(this.c)));
    }
    return;
}


public void a(moom.Mk p0) {
if ((p0 != null)) {
        this.c();
        this.d = ((moom.Mk)(p0));
        this.e = ((moom.Mj)(new moom.Mj()));
    }
    return;
}


public moom.Mk a__Mk() {
return this.d;
}

}
