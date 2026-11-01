package com.moon;


public class e7 extends com.moon.e2<com.moon.module.impl.Velocity> {

private boolean e;

private static final long f;

private static final java.lang.String g;

public e7() {
super(com.moon.module.impl.Velocity.class);
    this.e = false;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(5030054687926265359L)), ((long)(2843554894617505841L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(260870330884180L)))));
    long local0_life6 = (com.moon.e7.f ^ 14182524042211L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill78_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill78_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill78_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill78_13 = new byte[8];
    (__sourceSpill78_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill78_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation78_15 = __sourceSpill78_13;
    ((javax.crypto.Cipher)(__sourceSpill78_10)).init(((int)(__sourceSpill78_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill78_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation78_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill78_19 = ((java.lang.String)("«\001ü\032²")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill78_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill78_20)).doFinal(((byte[])(__sourceSpill78_19)));
    g = ((java.lang.String)(((java.lang.String)(com.moon.e7.a(((byte[])(local4_life22))))).intern()));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill189_0 = p0;
        life4_9 += 1;
        life5_44 = (spill189_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill189_1 = p0;
        life4_9 += 1;
        life5_76 = (spill189_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill189_2 = p0;
        life4_9 += 1;
        life5_91 = (spill189_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(com.moon.dW p0) {
com.moon.e7 forwardValue64_12_0;
    int forwardValue64_36_0;
    int forwardValue64_42_0;
    int forwardValue64_49_0;
    com.moon.e7 spill64_0;
    int spill64_1;
    long life2_3;
    int life4_5;
    com.moon.n5 life5_23;
    double life6_26;
    double life8_29;
    double life10_33;
    int life12_73;
    forward_join_53: {
    forward_join_49: {
    forward_join_42: {
    forward_join_36: {
    forward_join_15: {
    forward_join_12: {
    life2_3 = (com.moon.e7.f ^ 25781893163806L);
    life4_5 = com.moon.module.Module.d__IntStatic();
    spill64_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue64_12_0 = spill64_0;
        break forward_join_12;
    }
    if (!(((com.moon.e7)(spill64_0)).e)) {
        break forward_join_15;
    }
    forwardValue64_12_0 = this;
    }
    ((com.moon.e7)(forwardValue64_12_0)).e = ((boolean)(false));
    return;
    }
    life5_23 = ((com.moon.dW)(p0)).a__sourceReturn_821aa26535();
    life6_26 = ((com.moon.n5)(life5_23)).e();
    life8_29 = ((com.moon.n5)(life5_23)).g();
    life10_33 = java.lang.Math.hypot(((double)(life6_26)), ((double)(life8_29)));
    spill64_1 = recovery.source.CarrierOps.dcmpl(((double)(life10_33)), ((double)(0x1.3333333333333p-3d)));
    if (!((life4_5 != 0))) {
        forwardValue64_36_0 = spill64_1;
        break forward_join_36;
    }
    if (!((spill64_1 > 0))) {
        break forward_join_53;
    }
    forwardValue64_36_0 = ((((com.moon.dW)(p0)).b__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue64_42_0 = forwardValue64_36_0;
        break forward_join_42;
    }
    if (!((forwardValue64_36_0 == 0))) {
        break forward_join_53;
    }
    forwardValue64_42_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e7.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue64_49_0 = forwardValue64_42_0;
        break forward_join_49;
    }
    if (!((forwardValue64_42_0 != 0))) {
        break forward_join_53;
    }
    forwardValue64_49_0 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.e7.a)).W)).ap)).b();
    }
    life12_73 = forwardValue64_49_0;
    this.e = ((boolean)(true));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue65_30_0;
    int forwardValue65_36_0;
    int forwardValue65_43_0;
    com.moon.e7 forwardValue65_48_0;
    com.moon.event.MovePhase forwardValue65_53_0;
    com.moon.event.MovePhase forwardValue65_53_1;
    int spill65_0;
    com.moon.event.MovePhase spill65_1;
    com.moon.event.MovePhase spill65_2;
    int spill65_3;
    com.moon.e7 spill65_4;
    long life2_3;
    int life5_9;
    int life4_10;
    forward_join_71: {
    forward_join_61: {
    forward_join_53: {
    forward_join_50: {
    forward_join_48: {
    forward_join_47: {
    forward_join_43: {
    forward_join_36: {
    forward_join_30: {
    forward_join_27: {
    life2_3 = (com.moon.e7.f ^ 7355626525290L);
    spill65_0 = com.moon.module.Module.c__IntStatic();
    life5_9 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.e7.a)).W)).ap)).b();
    life4_10 = spill65_0;
    spill65_1 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    spill65_2 = com.moon.event.MovePhase.BEFORE;
    if (!((life4_10 == 0))) {
        forwardValue65_53_0 = spill65_1;
        forwardValue65_53_1 = spill65_2;
        break forward_join_53;
    }
    if (!((spill65_1 == spill65_2))) {
        break forward_join_50;
    }
    spill65_3 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e7.a)).K)).S;
    if (!((life4_10 == 0))) {
        forwardValue65_30_0 = spill65_3;
        break forward_join_30;
    }
    if (!((spill65_3 <= 2))) {
        break forward_join_27;
    }
    this.e = ((boolean)(false));
    }
    forwardValue65_30_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e7.a)).K)).u__Boolean()) ? 1 : 0);
    }
    if (!((life4_10 == 0))) {
        forwardValue65_36_0 = forwardValue65_30_0;
        break forward_join_36;
    }
    if (!((forwardValue65_30_0 != 0))) {
        break forward_join_47;
    }
    forwardValue65_36_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e7.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_10 == 0))) {
        forwardValue65_43_0 = forwardValue65_36_0;
        break forward_join_43;
    }
    if (!((forwardValue65_36_0 != 0))) {
        break forward_join_47;
    }
    spill65_4 = this;
    if (!((life4_10 == 0))) {
        forwardValue65_48_0 = spill65_4;
        break forward_join_48;
    }
    forwardValue65_43_0 = ((((com.moon.e7)(spill65_4)).e) ? 1 : 0);
    }
    if (!((forwardValue65_43_0 != 0))) {
        break forward_join_47;
    }
    moom.pz.a(((int)(life5_9)), ((boolean)(true)));
    }
    forwardValue65_48_0 = this;
    }
    ((com.moon.e7)(forwardValue65_48_0)).e = ((boolean)(false));
    }
    forwardValue65_53_0 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    forwardValue65_53_1 = com.moon.event.MovePhase.POST;
    }
    if (!((forwardValue65_53_0 == forwardValue65_53_1))) {
        break forward_join_61;
    }
    if (!((((net.minecraft.client.Minecraft)(com.moon.e7.a)).P == null))) {
        break forward_join_61;
    }
    moom.pz.a(((int)(life5_9)), ((boolean)(org.lwjgl.input.Keyboard.isKeyDown(((int)(life5_9))))));
    }
    ((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e7)(this)).a())))).setSuffix(((java.lang.String)(com.moon.e7.g)));
    if (!((life4_10 != 0))) {
        break forward_join_71;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return;
}

}
