package moom;


public class Nw extends moom.Nq {

private float[][] e;

private static final long f;

private static final long h;

public Nw(java.lang.String p0) {
super(p0);
    (this).d();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-325332564505270290L)), ((long)(8409213049462055389L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(252974979977141L)))));
    long local0_life6 = (moom.Nw.f ^ 83048039701358L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill740_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill740_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill740_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill740_13 = new byte[8];
    (__sourceSpill740_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill740_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation740_15 = __sourceSpill740_13;
    ((javax.crypto.Cipher)(__sourceSpill740_10)).init(((int)(__sourceSpill740_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill740_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation740_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3641000842942357817L;
    byte[] __sourceSpill740_19 = new byte[8];
    (__sourceSpill740_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill740_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill740_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill740_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill740_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill740_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill740_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill740_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill740_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill740_20)).doFinal(((byte[])(__sourceSpill740_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(int p0) {
float[][] forwardValue2881_40_0;
    int forwardValue2881_40_1;
    float[][] spill2881_0;
    int spill2881_1;
    long life2_3;
    java.lang.String life4_5;
    float[][] life5_13;
    float[][] life6_19;
    forward_join_59: {
    forward_join_40: {
    forward_join_30: {
    life2_3 = (moom.Nw.f ^ 31244473109455L);
    life4_5 = moom.Nq.b__String();
    if (!((p0 >= (this.e).length))) {
        break forward_join_30;
    }
    life5_13 = this.e;
    life6_19 = new float[(p0 + ((int) moom.Nw.h))][];
    java.lang.System.arraycopy(((java.lang.Object)(life5_13)), ((int)(0)), ((java.lang.Object)(life6_19)), ((int)(0)), ((int)((life5_13).length)));
    this.e = ((float[][])(life6_19));
    }
    spill2881_0 = this.e;
    spill2881_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue2881_40_0 = spill2881_0;
        forwardValue2881_40_1 = spill2881_1;
        break forward_join_40;
    }
    if (!(((spill2881_0)[spill2881_1] == null))) {
        break forward_join_59;
    }
    forwardValue2881_40_0 = this.e;
    forwardValue2881_40_1 = p0;
    }
    (forwardValue2881_40_0)[forwardValue2881_40_1] = new float[] {-0x1.fffffep127f, -0x1.fffffep127f, -0x1.fffffep127f, -0x1.fffffep127f};
    }
    return;
}


protected void d() {
this.e = ((float[][])(new float[][] {new float[] {-0x1.fffffep127f, -0x1.fffffep127f, -0x1.fffffep127f, -0x1.fffffep127f}}));
    return;
}


public float[] a__sourceReturn_aefe87013c() {
int local1 = ((moom.Nw)(this)).a();
    return (this.e)[local1];
}


public void a(float p0, float p1, float p2, float p3) {
int forwardValue2880_64_0;
    int forwardValue2880_70_0;
    java.lang.String spill2880_0;
    int spill2880_1;
    int spill2880_2;
    int spill2880_3;
    int spill2880_4;
    int spill2880_5;
    long life5_3;
    int life8_7;
    java.lang.String life7_8;
    float[] life9_13;
    int life10_88;
    forward_join_82: {
    forward_join_77: {
    forward_join_70: {
    forward_join_64: {
    forward_join_46: {
    life5_3 = (moom.Nw.f ^ 107472140126628L);
    spill2880_0 = moom.Nq.b__String();
    life8_7 = ((moom.Nw)(this)).a();
    life7_8 = spill2880_0;
    life9_13 = (this.e)[life8_7];
    spill2880_1 = recovery.source.CarrierOps.fcmpl(((float)((life9_13)[0])), ((float)(p0)));
    if (!((life7_8 != null))) {
        forwardValue2880_64_0 = spill2880_1;
        break forward_join_64;
    }
    if (!((spill2880_1 == 0))) {
        break forward_join_46;
    }
    spill2880_2 = recovery.source.CarrierOps.fcmpl(((float)((life9_13)[1])), ((float)(p1)));
    if (!((life7_8 != null))) {
        forwardValue2880_64_0 = spill2880_2;
        break forward_join_64;
    }
    if (!((spill2880_2 == 0))) {
        break forward_join_46;
    }
    spill2880_3 = recovery.source.CarrierOps.fcmpl(((float)((life9_13)[2])), ((float)(p2)));
    if (!((life7_8 != null))) {
        forwardValue2880_64_0 = spill2880_3;
        break forward_join_64;
    }
    if (!((spill2880_3 == 0))) {
        break forward_join_46;
    }
    spill2880_4 = recovery.source.CarrierOps.fcmpl(((float)((life9_13)[3])), ((float)(p3)));
    if (!((life7_8 != null))) {
        forwardValue2880_64_0 = spill2880_4;
        break forward_join_64;
    }
    if (!((spill2880_4 != 0))) {
        break forward_join_77;
    }
    }
    (life9_13)[0] = p0;
    (life9_13)[1] = p1;
    (life9_13)[2] = p2;
    (life9_13)[3] = p3;
    forwardValue2880_64_0 = ((moom.Nw)(this)).b();
    }
    life10_88 = forwardValue2880_64_0;
    spill2880_5 = life10_88;
    if (!((life7_8 != null))) {
        forwardValue2880_70_0 = spill2880_5;
        break forward_join_70;
    }
    if (!((spill2880_5 >= 0))) {
        break forward_join_77;
    }
    forwardValue2880_70_0 = life10_88;
    }
    org.lwjgl.opengl.ARBShaderObjects.glUniform4fARB(((int)(forwardValue2880_70_0)), ((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    this.e();
    }
    if (!((life7_8 == null))) {
        break forward_join_82;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}

}
