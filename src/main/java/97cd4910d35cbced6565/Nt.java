package moom;


public class Nt extends moom.Nq {

private float[][] e;

private static final long f;

private static final long h;

public Nt(java.lang.String p0) {
super(p0);
    (this).d();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(3063467479539778794L)), ((long)(-1508791338248191643L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(100744482417667L)))));
    long local0_life6 = (moom.Nt.f ^ 76699790133215L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill737_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill737_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill737_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill737_13 = new byte[8];
    (__sourceSpill737_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill737_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation737_15 = __sourceSpill737_13;
    ((javax.crypto.Cipher)(__sourceSpill737_10)).init(((int)(__sourceSpill737_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill737_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation737_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8873333424760917258L;
    byte[] __sourceSpill737_19 = new byte[8];
    (__sourceSpill737_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill737_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill737_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill737_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill737_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill737_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill737_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill737_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill737_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill737_20)).doFinal(((byte[])(__sourceSpill737_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(int p0) {
float[][] forwardValue2875_40_0;
    int forwardValue2875_40_1;
    float[][] spill2875_0;
    int spill2875_1;
    long life2_3;
    java.lang.String life4_5;
    float[][] life5_13;
    float[][] life6_19;
    forward_join_51: {
    forward_join_40: {
    forward_join_30: {
    life2_3 = (moom.Nt.f ^ 20317220386727L);
    life4_5 = moom.Nq.b__String();
    if (!((p0 >= (this.e).length))) {
        break forward_join_30;
    }
    life5_13 = this.e;
    life6_19 = new float[(p0 + ((int) moom.Nt.h))][];
    java.lang.System.arraycopy(((java.lang.Object)(life5_13)), ((int)(0)), ((java.lang.Object)(life6_19)), ((int)(0)), ((int)((life5_13).length)));
    this.e = ((float[][])(life6_19));
    }
    spill2875_0 = this.e;
    spill2875_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue2875_40_0 = spill2875_0;
        forwardValue2875_40_1 = spill2875_1;
        break forward_join_40;
    }
    if (!(((spill2875_0)[spill2875_1] == null))) {
        break forward_join_51;
    }
    forwardValue2875_40_0 = this.e;
    forwardValue2875_40_1 = p0;
    }
    (forwardValue2875_40_0)[forwardValue2875_40_1] = new float[] {-0x1.fffffep127f, -0x1.fffffep127f};
    }
    return;
}


protected void d() {
this.e = ((float[][])(new float[][] {new float[] {-0x1.fffffep127f, -0x1.fffffep127f}}));
    return;
}


public float[] a__sourceReturn_aefe87013c() {
int local1 = ((moom.Nt)(this)).a();
    return (this.e)[local1];
}


public void a(float p0, float p1) {
int forwardValue2874_40_0;
    int forwardValue2874_46_0;
    java.lang.String spill2874_0;
    int spill2874_1;
    int spill2874_2;
    int spill2874_3;
    long life3_3;
    int life6_7;
    java.lang.String life5_8;
    float[] life7_13;
    int life8_52;
    forward_join_51: {
    forward_join_46: {
    forward_join_40: {
    forward_join_30: {
    life3_3 = (moom.Nt.f ^ 126948402411475L);
    spill2874_0 = moom.Nq.b__String();
    life6_7 = ((moom.Nt)(this)).a();
    life5_8 = spill2874_0;
    life7_13 = (this.e)[life6_7];
    spill2874_1 = recovery.source.CarrierOps.fcmpl(((float)((life7_13)[0])), ((float)(p0)));
    if (!((life5_8 != null))) {
        forwardValue2874_40_0 = spill2874_1;
        break forward_join_40;
    }
    if (!((spill2874_1 == 0))) {
        break forward_join_30;
    }
    spill2874_2 = recovery.source.CarrierOps.fcmpl(((float)((life7_13)[1])), ((float)(p1)));
    if (!((life5_8 != null))) {
        forwardValue2874_40_0 = spill2874_2;
        break forward_join_40;
    }
    if (!((spill2874_2 != 0))) {
        break forward_join_51;
    }
    }
    (life7_13)[0] = p0;
    (life7_13)[1] = p1;
    forwardValue2874_40_0 = ((moom.Nt)(this)).b();
    }
    life8_52 = forwardValue2874_40_0;
    spill2874_3 = life8_52;
    if (!((life5_8 != null))) {
        forwardValue2874_46_0 = spill2874_3;
        break forward_join_46;
    }
    if (!((spill2874_3 >= 0))) {
        break forward_join_51;
    }
    forwardValue2874_46_0 = life8_52;
    }
    org.lwjgl.opengl.ARBShaderObjects.glUniform2fARB(((int)(forwardValue2874_46_0)), ((float)(p0)), ((float)(p1)));
    this.e();
    }
    return;
}

}
