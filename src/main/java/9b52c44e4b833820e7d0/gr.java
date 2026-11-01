package com.moon;


public class gr {

private final com.moon.gs a;

private final com.moon.gt b;

private boolean c;

private boolean d;

private boolean e;

private static final long f;

private static final long g;

public gr(com.moon.gs p0, com.moon.gt p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(9202782134615059476L)), ((long)(-3719410134763561435L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(128743945094687L)))));
    long local0_life6 = (com.moon.gr.f ^ 34683828674710L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill121_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill121_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill121_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill121_13 = new byte[8];
    (__sourceSpill121_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill121_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation121_15 = __sourceSpill121_13;
    ((javax.crypto.Cipher)(__sourceSpill121_10)).init(((int)(__sourceSpill121_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill121_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation121_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 2336746570416177453L;
    byte[] __sourceSpill121_19 = new byte[8];
    (__sourceSpill121_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill121_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill121_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill121_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill121_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill121_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill121_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill121_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill121_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill121_20)).doFinal(((byte[])(__sourceSpill121_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean b__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}


public void b() {
this.e = ((boolean)(true));
    return;
}


public void c() {
this.d = ((boolean)(true));
    return;
}


public void d() {
int forwardValue296_20_0;
    net.minecraft.entity.Entity[] spill296_0;
    boolean spill296_1;
    long life1_3;
    net.minecraft.entity.player.EntityPlayer life4_8;
    net.minecraft.entity.Entity[] life3_9;
    forward_join_25: {
    forward_join_20: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (com.moon.gr.f ^ 120716438588833L);
    spill296_0 = com.moon.gt.b();
    life4_8 = ((com.moon.gt)(this.b)).a();
    life3_9 = spill296_0;
    if (!((life4_8 != null))) {
        break forward_join_17;
    }
    spill296_1 = this.d;
    if (!((life3_9 == null))) {
        forwardValue296_20_0 = ((spill296_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill296_1))) {
        break forward_join_18;
    }
    }
    return;
    }
    forwardValue296_20_0 = ((net.minecraft.entity.player.EntityPlayer)(life4_8)).U;
    }
    if (!((forwardValue296_20_0 <= ((int) com.moon.gr.g)))) {
        break forward_join_25;
    }
    this.a();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.client.entity.EntityPlayerSP p0, boolean p1) {
net.minecraft.entity.player.EntityPlayer forwardValue294_15_0;
    int forwardValue294_41_0;
    int forwardValue294_49_0;
    int forwardValue294_58_0;
    int forwardValue294_63_0;
    int forwardValue294_69_0;
    int forwardValue294_73_0;
    int forwardValue294_75_0;
    int forwardValue294_83_0;
    net.minecraft.entity.Entity[] spill294_0;
    net.minecraft.client.entity.EntityPlayerSP spill294_1;
    boolean spill294_2;
    int spill294_3;
    long life3_3;
    net.minecraft.entity.player.EntityPlayer life6_8;
    net.minecraft.entity.Entity[] life5_9;
    com.moon.n5 life7_23;
    double life8_28;
    double life10_37;
    int life12_111;
    forward_join_86: {
    forward_join_83: {
    forward_join_75: {
    forward_join_74: {
    forward_join_73: {
    forward_join_69: {
    forward_join_63: {
    forward_join_58: {
    forward_join_49: {
    forward_join_41: {
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life3_3 = (com.moon.gr.f ^ 98377677797187L);
    spill294_0 = com.moon.gt.b();
    life6_8 = ((com.moon.gt)(this.b)).a();
    life5_9 = spill294_0;
    spill294_1 = p0;
    if (!((life5_9 == null))) {
        forwardValue294_15_0 = spill294_1;
        break forward_join_15;
    }
    if (!((spill294_1 != null))) {
        break forward_join_16;
    }
    forwardValue294_15_0 = life6_8;
    }
    if (!((forwardValue294_15_0 == null))) {
        break forward_join_17;
    }
    }
    return;
    }
    life7_23 = ((com.moon.gs)(this.a)).a__n5();
    life8_28 = ((double) ((net.minecraft.entity.player.EntityPlayer)(life6_8)).a__Float(((net.minecraft.entity.Entity)(p0))));
    life10_37 = ((net.minecraft.entity.player.EntityPlayer)(life6_8)).b(((double)(((com.moon.n5)(life7_23)).e())), ((double)(((com.moon.n5)(life7_23)).f())), ((double)(((com.moon.n5)(life7_23)).g())));
    spill294_2 = p1;
    if (!((life5_9 == null))) {
        forwardValue294_41_0 = ((spill294_2) ? 1 : 0);
        break forward_join_41;
    }
    if (!(spill294_2)) {
        break forward_join_74;
    }
    forwardValue294_41_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(p0)).A) ? 1 : 0);
    }
    if (!((life5_9 == null))) {
        forwardValue294_49_0 = forwardValue294_41_0;
        break forward_join_49;
    }
    if (!((forwardValue294_41_0 != 0))) {
        break forward_join_74;
    }
    forwardValue294_49_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.client.entity.EntityPlayerSP)(p0)).o)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(p0)).N)));
    }
    if (!((life5_9 == null))) {
        forwardValue294_58_0 = forwardValue294_49_0;
        break forward_join_58;
    }
    if (!((forwardValue294_49_0 == 0))) {
        break forward_join_74;
    }
    forwardValue294_58_0 = recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.abs(((double)((life8_28 - life10_37)))))), ((double)(0x1.0p0d)));
    }
    if (!((life5_9 == null))) {
        forwardValue294_63_0 = forwardValue294_58_0;
        break forward_join_63;
    }
    if (!((forwardValue294_58_0 <= 0))) {
        break forward_join_74;
    }
    forwardValue294_63_0 = ((this.e) ? 1 : 0);
    }
    if (!((life5_9 == null))) {
        forwardValue294_69_0 = forwardValue294_63_0;
        break forward_join_69;
    }
    if (!((forwardValue294_63_0 == 0))) {
        break forward_join_74;
    }
    forwardValue294_69_0 = recovery.source.CarrierOps.dcmpg(((double)(life8_28)), ((double)(0x1.ap2d)));
    }
    if (!((life5_9 == null))) {
        forwardValue294_73_0 = forwardValue294_69_0;
        break forward_join_73;
    }
    if (!((forwardValue294_69_0 <= 0))) {
        break forward_join_74;
    }
    forwardValue294_73_0 = 1;
    }
    forwardValue294_75_0 = forwardValue294_73_0;
    break forward_join_75;
    }
    forwardValue294_75_0 = 0;
    }
    life12_111 = forwardValue294_75_0;
    spill294_3 = recovery.source.CarrierOps.dcmpl(((double)(life8_28)), ((double)(life10_37)));
    if (!((life5_9 == null))) {
        forwardValue294_83_0 = spill294_3;
        break forward_join_83;
    }
    if (!((spill294_3 > 0))) {
        break forward_join_86;
    }
    forwardValue294_83_0 = life12_111;
    }
    if (!((forwardValue294_83_0 == 0))) {
        break forward_join_86;
    }
    this.a();
    }
    return;
}


public void a() {
this.c = ((boolean)(true));
    return;
}


public boolean a__Boolean() {
int forwardValue295_23_0;
    int forwardValue295_28_0;
    net.minecraft.entity.Entity[] spill295_0;
    int spill295_1;
    long life1_3;
    int life4_7;
    net.minecraft.entity.Entity[] life3_8;
    forward_join_28: {
    forward_join_23: {
    forward_join_22: {
    life1_3 = (com.moon.gr.f ^ 51417554410783L);
    spill295_0 = com.moon.gt.b();
    life4_7 = ((this.c) ? 1 : 0);
    life3_8 = spill295_0;
    this.c = ((boolean)(false));
    spill295_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue295_23_0 = spill295_1;
        break forward_join_23;
    }
    if (!((spill295_1 != 0))) {
        break forward_join_22;
    }
    this.e = ((boolean)(false));
    this.d = ((boolean)(false));
    }
    forwardValue295_23_0 = life4_7;
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forwardValue295_28_0 = forwardValue295_23_0;
        break forward_join_28;
    }
    com.moon.gt.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    forwardValue295_28_0 = forwardValue295_23_0;
    }
    return ((forwardValue295_28_0) != 0);
}

}
