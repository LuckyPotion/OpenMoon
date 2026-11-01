package moom;


public class Nv extends moom.Nq {

private float[][] e;

private static final long f;

private static final long h;

public Nv(java.lang.String p0) {
super(p0);
    (this).d();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-1718864038130987061L)), ((long)(7415792604986610776L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(94643131753101L)))));
    long local0_life6 = (moom.Nv.f ^ 118147352074940L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill739_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill739_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill739_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill739_13 = new byte[8];
    (__sourceSpill739_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill739_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation739_15 = __sourceSpill739_13;
    ((javax.crypto.Cipher)(__sourceSpill739_10)).init(((int)(__sourceSpill739_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill739_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation739_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8162371336504066568L;
    byte[] __sourceSpill739_19 = new byte[8];
    (__sourceSpill739_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill739_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill739_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill739_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill739_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill739_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill739_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill739_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill739_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill739_20)).doFinal(((byte[])(__sourceSpill739_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(int p0) {
float[][] forwardValue2879_40_0;
    int forwardValue2879_40_1;
    float[][] spill2879_0;
    int spill2879_1;
    long life2_3;
    java.lang.String life4_5;
    float[][] life5_13;
    float[][] life6_19;
    forward_join_55: {
    forward_join_40: {
    forward_join_30: {
    life2_3 = (moom.Nv.f ^ 107639978159774L);
    life4_5 = moom.Nq.b__String();
    if (!((p0 >= (this.e).length))) {
        break forward_join_30;
    }
    life5_13 = this.e;
    life6_19 = new float[(p0 + ((int) moom.Nv.h))][];
    java.lang.System.arraycopy(((java.lang.Object)(life5_13)), ((int)(0)), ((java.lang.Object)(life6_19)), ((int)(0)), ((int)((life5_13).length)));
    this.e = ((float[][])(life6_19));
    }
    spill2879_0 = this.e;
    spill2879_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue2879_40_0 = spill2879_0;
        forwardValue2879_40_1 = spill2879_1;
        break forward_join_40;
    }
    if (!(((spill2879_0)[spill2879_1] == null))) {
        break forward_join_55;
    }
    forwardValue2879_40_0 = this.e;
    forwardValue2879_40_1 = p0;
    }
    (forwardValue2879_40_0)[forwardValue2879_40_1] = new float[] {-0x1.fffffep127f, -0x1.fffffep127f, -0x1.fffffep127f};
    }
    return;
}


protected void d() {
this.e = ((float[][])(new float[][] {new float[] {-0x1.fffffep127f, -0x1.fffffep127f, -0x1.fffffep127f}}));
    return;
}


public float[] a__sourceReturn_aefe87013c() {
int local1 = ((moom.Nv)(this)).a();
    return (this.e)[local1];
}


public void a(float p0, float p1, float p2) {
int forwardValue2878_52_0;
    int forwardValue2878_58_0;
    java.lang.String spill2878_0;
    int spill2878_1;
    int spill2878_2;
    int spill2878_3;
    int spill2878_4;
    long life4_3;
    int life7_6;
    float[] life8_12;
    java.lang.String life6_13;
    int life9_70;
    forward_join_64: {
    forward_join_58: {
    forward_join_52: {
    forward_join_38: {
    life4_3 = (moom.Nv.f ^ 102304481488969L);
    life7_6 = ((moom.Nv)(this)).a();
    spill2878_0 = moom.Nq.b__String();
    life8_12 = (this.e)[life7_6];
    life6_13 = spill2878_0;
    spill2878_1 = recovery.source.CarrierOps.fcmpl(((float)((life8_12)[0])), ((float)(p0)));
    if (!((life6_13 != null))) {
        forwardValue2878_52_0 = spill2878_1;
        break forward_join_52;
    }
    if (!((spill2878_1 == 0))) {
        break forward_join_38;
    }
    spill2878_2 = recovery.source.CarrierOps.fcmpl(((float)((life8_12)[1])), ((float)(p1)));
    if (!((life6_13 != null))) {
        forwardValue2878_52_0 = spill2878_2;
        break forward_join_52;
    }
    if (!((spill2878_2 == 0))) {
        break forward_join_38;
    }
    spill2878_3 = recovery.source.CarrierOps.fcmpl(((float)((life8_12)[2])), ((float)(p2)));
    if (!((life6_13 != null))) {
        forwardValue2878_52_0 = spill2878_3;
        break forward_join_52;
    }
    if (!((spill2878_3 != 0))) {
        break forward_join_64;
    }
    }
    (life8_12)[0] = p0;
    (life8_12)[1] = p1;
    (life8_12)[2] = p2;
    forwardValue2878_52_0 = ((moom.Nv)(this)).b();
    }
    life9_70 = forwardValue2878_52_0;
    spill2878_4 = life9_70;
    if (!((life6_13 != null))) {
        forwardValue2878_58_0 = spill2878_4;
        break forward_join_58;
    }
    if (!((spill2878_4 >= 0))) {
        break forward_join_64;
    }
    forwardValue2878_58_0 = life9_70;
    }
    org.lwjgl.opengl.ARBShaderObjects.glUniform3fARB(((int)(forwardValue2878_58_0)), ((float)(p0)), ((float)(p1)), ((float)(p2)));
    this.e();
    }
    return;
}

}
