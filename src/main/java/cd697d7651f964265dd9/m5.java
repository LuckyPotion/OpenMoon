package com.moon;


public abstract class m5 extends com.moon.m3 {

private com.moon.nY g;

private com.moon.nX h;

private com.moon.nh i;

private boolean j;

protected float k;

protected boolean l;

protected com.moon.nv m;

private static long I;

private static long M;

private static long Q;

public m5(com.moon.nh p0, float p1, float p2, float p3, float p4) { super(0.0F, 0.0F, 0.0F, 0.0F); }


private static void __sourceConstructorBody_80c54356428c7c83(com.moon.m5 receiver, com.moon.nh p0, float p1, float p2, float p3, float p4) throws Throwable {

long local6 = (com.moon.m5.I ^ 7433627276971L);

    com.moon.m5.__sourceConstructorInit_80c54356428c7c83_0(((com.moon.m5)(receiver)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)));

    ((com.moon.m5)(receiver)).g = ((com.moon.nY)(new com.moon.nY(com.moon.m5.Q, com.moon.cj.EASE_IN_SINE_OUT)));

    ((com.moon.m5)(receiver)).h = ((com.moon.nX)(new com.moon.nX()));

    ((com.moon.m5)(receiver)).d(((float)(0x0.0p0f)));

    ((com.moon.m5)(receiver)).k = ((float)(p4));

    ((com.moon.m5)(receiver)).i = ((com.moon.nh)(p0));

    ((com.moon.nY)(((com.moon.m5)(receiver)).g)).b__Void();

    ((com.moon.nX)(((com.moon.m5)(receiver)).h)).a(((float)(0x1.0p0f)));

    return;

}



static {
I = ((long)(((moom._a)(moom._c.a(((long)(9103345244124298753L)), ((long)(318679439585349573L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200129623705728L)))));
    long local5_life6 = (com.moon.m5.I ^ 84564815285178L);
    javax.crypto.Cipher local7_life8;
    javax.crypto.Cipher __sourceSpill236_10 = (local7_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill236_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill236_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill236_13 = new byte[8];
    (__sourceSpill236_13)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local8_life14 = 1;
    while ((local8_life14 < 8)) {
        (__sourceSpill236_13)[local8_life14] = ((byte) ((int) ((local5_life6 << (local8_life14 * 8)) >>> 56)));
        local8_life14 += 1;
    }
    byte[] __sourcePreallocation236_15 = __sourceSpill236_13;
    ((javax.crypto.Cipher)(__sourceSpill236_10)).init(((int)(__sourceSpill236_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill236_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation236_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local9_life18 = 8825944776173498787L;
    byte[] __sourceSpill236_19 = new byte[8];
    (__sourceSpill236_19)[0] = ((byte) ((int) (local9_life18 >>> 56)));
    (__sourceSpill236_19)[1] = ((byte) ((int) (local9_life18 >>> 48)));
    (__sourceSpill236_19)[2] = ((byte) ((int) (local9_life18 >>> 40)));
    (__sourceSpill236_19)[3] = ((byte) ((int) (local9_life18 >>> 32)));
    (__sourceSpill236_19)[4] = ((byte) ((int) (local9_life18 >>> 24)));
    (__sourceSpill236_19)[5] = ((byte) ((int) (local9_life18 >>> 16)));
    (__sourceSpill236_19)[6] = ((byte) ((int) (local9_life18 >>> 8)));
    (__sourceSpill236_19)[7] = ((byte) ((int) local9_life18));
    javax.crypto.Cipher __sourceSpill236_20 = local7_life8;
    byte[] local11_life22 = ((javax.crypto.Cipher)(__sourceSpill236_20)).doFinal(((byte[])(__sourceSpill236_19)));
    M = ((long)((((((((((((long) (local11_life22)[0]) & 255L) << 56) | ((((long) (local11_life22)[1]) & 255L) << 48)) | ((((long) (local11_life22)[2]) & 255L) << 40)) | ((((long) (local11_life22)[3]) & 255L) << 32)) | ((((long) (local11_life22)[4]) & 255L) << 24)) | ((((long) (local11_life22)[5]) & 255L) << 16)) | ((((long) (local11_life22)[6]) & 255L) << 8)) | (((long) (local11_life22)[7]) & 255L))));
    javax.crypto.Cipher local0_life25;
    javax.crypto.Cipher __sourceSpill236_27 = (local0_life25 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill236_28 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill236_29 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill236_30 = new byte[8];
    (__sourceSpill236_30)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local1_life31 = 1;
    while ((local1_life31 < 8)) {
        (__sourceSpill236_30)[local1_life31] = ((byte) ((int) ((local5_life6 << (local1_life31 * 8)) >>> 56)));
        local1_life31 += 1;
    }
    byte[] __sourcePreallocation236_32 = __sourceSpill236_30;
    ((javax.crypto.Cipher)(__sourceSpill236_27)).init(((int)(__sourceSpill236_28)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill236_29)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation236_32)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life35 = 8310826092356197963L;
    byte[] __sourceSpill236_36 = new byte[8];
    (__sourceSpill236_36)[0] = ((byte) ((int) (local2_life35 >>> 56)));
    (__sourceSpill236_36)[1] = ((byte) ((int) (local2_life35 >>> 48)));
    (__sourceSpill236_36)[2] = ((byte) ((int) (local2_life35 >>> 40)));
    (__sourceSpill236_36)[3] = ((byte) ((int) (local2_life35 >>> 32)));
    (__sourceSpill236_36)[4] = ((byte) ((int) (local2_life35 >>> 24)));
    (__sourceSpill236_36)[5] = ((byte) ((int) (local2_life35 >>> 16)));
    (__sourceSpill236_36)[6] = ((byte) ((int) (local2_life35 >>> 8)));
    (__sourceSpill236_36)[7] = ((byte) ((int) local2_life35));
    javax.crypto.Cipher __sourceSpill236_37 = local0_life25;
    byte[] local4_life39 = ((javax.crypto.Cipher)(__sourceSpill236_37)).doFinal(((byte[])(__sourceSpill236_36)));
    Q = ((long)((((((((((((long) (local4_life39)[0]) & 255L) << 56) | ((((long) (local4_life39)[1]) & 255L) << 48)) | ((((long) (local4_life39)[2]) & 255L) << 40)) | ((((long) (local4_life39)[3]) & 255L) << 32)) | ((((long) (local4_life39)[4]) & 255L) << 24)) | ((((long) (local4_life39)[5]) & 255L) << 16)) | ((((long) (local4_life39)[6]) & 255L) << 8)) | (((long) (local4_life39)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_80c54356428c7c83_0(com.moon.m5 a0, float a1, float a2, float a3, float a4) throws E;

public boolean e__Boolean() {
return ((((this.l) ? 1 : 0)) != 0);
}


public float e() {
return ((com.moon.nY)(this.g)).c();
}


public void c__sourceReturn_da8c82d5d4() {
int forwardValue669_13_0;
    int forwardValue669_17_0;
    int forwardValue669_19_0;
    com.moon.nY forwardValue669_33_0;
    com.moon.nY forwardValue669_34_0;
    float forwardValue669_34_1;
    boolean spill669_0;
    com.moon.nY spill669_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_28;
    forward_join_54: {
    forward_join_38: {
    forward_join_34: {
    forward_join_33: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (com.moon.m5.I ^ 136888561045134L);
    life3_5 = moom.lw.b__Arrayr3();
    spill669_0 = ((com.moon.m5)(this)).c__Boolean();
    if (!((life3_5 == null))) {
        forwardValue669_13_0 = ((spill669_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill669_0)) {
        break forward_join_18;
    }
    forwardValue669_13_0 = ((((com.moon.m5)(this)).d__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue669_17_0 = forwardValue669_13_0;
        break forward_join_17;
    }
    if (!((forwardValue669_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue669_17_0 = 1;
    }
    forwardValue669_19_0 = forwardValue669_17_0;
    break forward_join_19;
    }
    forwardValue669_19_0 = 0;
    }
    life4_28 = forwardValue669_19_0;
    if (!((life3_5 == null))) {
        break forward_join_54;
    }
    if (!((life4_28 != ((this.j) ? 1 : 0)))) {
        break forward_join_38;
    }
    spill669_1 = this.g;
    if (!(this.j)) {
        forwardValue669_33_0 = spill669_1;
        break forward_join_33;
    }
    forwardValue669_34_0 = spill669_1;
    forwardValue669_34_1 = 0x1.0p0f;
    break forward_join_34;
    }
    forwardValue669_34_0 = forwardValue669_33_0;
    forwardValue669_34_1 = 0x0.0p0f;
    }
    ((com.moon.nY)(forwardValue669_34_0)).a(((float)(forwardValue669_34_1)));
    this.j = ((boolean)__sourceIntrinsic_integerToBoolean((life4_28)));
    }
    ((com.moon.nY)(this.g)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.j)));
    ((com.moon.m5)(this)).d(((float)((this.k * ((com.moon.nY)(this.g)).c()))));
    }
    return;
}


public abstract boolean c__Boolean();

public float f() {
return this.k;
}


protected boolean d__sourceReturn_aae029aa0a() {
return (__sourceIntrinsic_booleanComparison((((com.moon.nh)(this.i)).a__Boolean())) != 0);
}


private static java.lang.ClassCastException a(java.lang.ClassCastException p0) {
return p0;
}


protected void a(float p0, float p1, int p2, int p3) {
long life5_3;
    com.moon.jm life7_11;
    float life8_13;
    java.lang.String life9_15;
    com.moon.hW life10_22;
    float life11_27;
    float life12_34;
    int life13_43;
    life5_3 = (com.moon.m5.I ^ 98522487880039L);
    if ((this.m != null)) {
        life7_11 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
        life8_13 = 0x1.08p3f;
        life9_15 = "";
        life10_22 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life7_11))))).a();
        life11_27 = ((com.moon.jm)(life7_11)).a(((java.lang.String)(life9_15)), ((float)(life8_13)));
        life12_34 = (((com.moon.jm)(life7_11)).b(((java.lang.String)(life9_15)), ((float)(life8_13))) - 0x1.8p2f);
        life13_43 = ((((com.moon.m5)(this)).a(((int)(p2)), ((int)(p3)), ((float)(p0)), ((float)(p1)), ((float)(life11_27)), ((float)(life12_34)))) ? 1 : 0);
        this.l = ((boolean)__sourceIntrinsic_integerToBoolean((life13_43)));
        com.moon.nX spill1776_0 = this.h;
        ((com.moon.nX)(spill1776_0)).a(((float)(((life13_43 != 0) ? 0x1.0p-1f : 0x1.0p0f))), ((double)(0x1.99999ap-2d)));
        ((com.moon.jm)(life7_11)).b(((com.moon.hW)(life10_22)), ((java.lang.String)(life9_15)), ((float)(life8_13)), ((float)(p0)), ((float)(p1)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((int) com.moon.m5.M)))).a(((float)(((com.moon.nX)(this.h)).b()))))).getRGB())));
        ((com.moon.hW)(life10_22)).b();
        if ((life13_43 != 0)) {
        ((com.moon.pk)(((com.moon.module.impl.ClickGUI)(((com.moon.m5)(this)).a__lS())).a__pk())).a(((com.moon.nw)(new com.moon.nw(this.m, p2, p3))));
    }
    }
    return;
}


public com.moon.nv a__nv() {
return this.m;
}


public com.moon.m5 a(com.moon.nv p0) {
this.m = ((com.moon.nv)(p0));
    return this;
}


protected <T> T a(java.lang.Object p0) {
try {
        return ((T)(p0));
    } catch (java.lang.ClassCastException caught2) {
        return null;
    }
}


public abstract com.moon.setting.Setting a__sourceReturn_7d3c444d39();

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
