package moom;


public class Nr extends moom.Nq {

private float[] e;

private static final long f;

private static final long h;

public Nr(java.lang.String p0) {
super(p0);
    (this).d();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-2510879017968170020L)), ((long)(-5654944937947879455L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(243109029237940L)))));
    long local0_life6 = (moom.Nr.f ^ 133035168393810L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill735_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill735_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill735_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill735_13 = new byte[8];
    (__sourceSpill735_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill735_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation735_15 = __sourceSpill735_13;
    ((javax.crypto.Cipher)(__sourceSpill735_10)).init(((int)(__sourceSpill735_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill735_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation735_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8578133039989803566L;
    byte[] __sourceSpill735_19 = new byte[8];
    (__sourceSpill735_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill735_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill735_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill735_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill735_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill735_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill735_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill735_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill735_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill735_20)).doFinal(((byte[])(__sourceSpill735_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(int p0) {
long life2_3;
    java.lang.String life4_5;
    float[] life5_13;
    float[] life6_19;
    int life7_29;
    lexical_join_46: {
    lexical_join_43: {
    life2_3 = (moom.Nr.f ^ 121981025321272L);
    life4_5 = moom.Nq.b__String();
    if (!((p0 >= (this.e).length))) {
        break lexical_join_46;
    }
    life5_13 = this.e;
    life6_19 = new float[(p0 + ((int) moom.Nr.h))];
    java.lang.System.arraycopy(((java.lang.Object)(life5_13)), ((int)(0)), ((java.lang.Object)(life6_19)), ((int)(0)), ((int)((life5_13).length)));
    life7_29 = (life5_13).length;
    lexical_cycle_30: while (true) {
    if (!((life7_29 < (life6_19).length))) {
        break lexical_join_43;
    }
    (life6_19)[life7_29] = -0x1.fffffep127f;
    life7_29 += 1;
    if (!((life4_5 != null))) {
        break lexical_join_46;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_30; }
    break lexical_cycle_30;
    }
    }
    this.e = ((float[])(life6_19));
    }
    return;
}


protected void d() {
this.e = ((float[])(new float[] {-0x1.fffffep127f}));
    return;
}


public float a__sourceReturn_bc607678b6() {
int local1 = ((moom.Nr)(this)).a();
    return (this.e)[local1];
}


public void a(float p0) {
int forwardValue2870_27_0;
    int forwardValue2870_33_0;
    java.lang.String spill2870_0;
    int spill2870_1;
    int spill2870_2;
    long life2_3;
    int life5_7;
    java.lang.String life4_8;
    float life6_13;
    int life7_33;
    forward_join_37: {
    forward_join_33: {
    forward_join_27: {
    life2_3 = (moom.Nr.f ^ 55026342757252L);
    spill2870_0 = moom.Nq.b__String();
    life5_7 = ((moom.Nr)(this)).a();
    life4_8 = spill2870_0;
    life6_13 = (this.e)[life5_7];
    spill2870_1 = recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(life6_13)));
    if (!((life4_8 != null))) {
        forwardValue2870_27_0 = spill2870_1;
        break forward_join_27;
    }
    if (!((spill2870_1 != 0))) {
        break forward_join_37;
    }
    (this.e)[life5_7] = p0;
    forwardValue2870_27_0 = ((moom.Nr)(this)).b();
    }
    life7_33 = forwardValue2870_27_0;
    spill2870_2 = life7_33;
    if (!((life4_8 != null))) {
        forwardValue2870_33_0 = spill2870_2;
        break forward_join_33;
    }
    if (!((spill2870_2 >= 0))) {
        break forward_join_37;
    }
    forwardValue2870_33_0 = life7_33;
    }
    org.lwjgl.opengl.ARBShaderObjects.glUniform1fARB(((int)(forwardValue2870_33_0)), ((float)(p0)));
    this.e();
    }
    return;
}

}
