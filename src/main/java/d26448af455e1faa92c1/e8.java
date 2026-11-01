package com.moon;


public class e8 extends com.moon.e2<com.moon.module.impl.Velocity> {

private boolean e;

private static final long f;

private static final java.lang.String g;

private static final long h;

public e8() {
super(com.moon.module.impl.Velocity.class);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(8604129280756127686L)), ((long)(-7444148283984813651L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(116607622126238L)))));
    long local5_life6 = (com.moon.e8.f ^ 63958507592259L);
    javax.crypto.Cipher local7_life8;
    javax.crypto.Cipher __sourceSpill79_10 = (local7_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill79_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill79_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill79_13 = new byte[8];
    (__sourceSpill79_13)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local8_life14 = 1;
    while ((local8_life14 < 8)) {
        (__sourceSpill79_13)[local8_life14] = ((byte) ((int) ((local5_life6 << (local8_life14 * 8)) >>> 56)));
        local8_life14 += 1;
    }
    byte[] __sourcePreallocation79_15 = __sourceSpill79_13;
    ((javax.crypto.Cipher)(__sourceSpill79_10)).init(((int)(__sourceSpill79_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill79_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation79_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill79_19 = ((java.lang.String)("\033»ó}\036 H2±F\177©\023EæV")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill79_20 = local7_life8;
    byte[] local9_life22 = ((javax.crypto.Cipher)(__sourceSpill79_20)).doFinal(((byte[])(__sourceSpill79_19)));
    g = ((java.lang.String)(((java.lang.String)(com.moon.e8.a(((byte[])(local9_life22))))).intern()));
    javax.crypto.Cipher local0_life27;
    javax.crypto.Cipher __sourceSpill79_29 = (local0_life27 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill79_30 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill79_31 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill79_32 = new byte[8];
    (__sourceSpill79_32)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local1_life33 = 1;
    while ((local1_life33 < 8)) {
        (__sourceSpill79_32)[local1_life33] = ((byte) ((int) ((local5_life6 << (local1_life33 * 8)) >>> 56)));
        local1_life33 += 1;
    }
    byte[] __sourcePreallocation79_34 = __sourceSpill79_32;
    ((javax.crypto.Cipher)(__sourceSpill79_29)).init(((int)(__sourceSpill79_30)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill79_31)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation79_34)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life37 = -6010741731384236947L;
    byte[] __sourceSpill79_38 = new byte[8];
    (__sourceSpill79_38)[0] = ((byte) ((int) (local2_life37 >>> 56)));
    (__sourceSpill79_38)[1] = ((byte) ((int) (local2_life37 >>> 48)));
    (__sourceSpill79_38)[2] = ((byte) ((int) (local2_life37 >>> 40)));
    (__sourceSpill79_38)[3] = ((byte) ((int) (local2_life37 >>> 32)));
    (__sourceSpill79_38)[4] = ((byte) ((int) (local2_life37 >>> 24)));
    (__sourceSpill79_38)[5] = ((byte) ((int) (local2_life37 >>> 16)));
    (__sourceSpill79_38)[6] = ((byte) ((int) (local2_life37 >>> 8)));
    (__sourceSpill79_38)[7] = ((byte) ((int) local2_life37));
    javax.crypto.Cipher __sourceSpill79_39 = local0_life27;
    byte[] local4_life41 = ((javax.crypto.Cipher)(__sourceSpill79_39)).doFinal(((byte[])(__sourceSpill79_38)));
    h = ((long)((((((((((((long) (local4_life41)[0]) & 255L) << 56) | ((((long) (local4_life41)[1]) & 255L) << 48)) | ((((long) (local4_life41)[2]) & 255L) << 40)) | ((((long) (local4_life41)[3]) & 255L) << 32)) | ((((long) (local4_life41)[4]) & 255L) << 24)) | ((((long) (local4_life41)[5]) & 255L) << 16)) | ((((long) (local4_life41)[6]) & 255L) << 8)) | (((long) (local4_life41)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
this.e = ((boolean)(false));
    super.b();
    return;
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
        byte[] spill193_0 = p0;
        life4_9 += 1;
        life5_44 = (spill193_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill193_1 = p0;
        life4_9 += 1;
        life5_76 = (spill193_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill193_2 = p0;
        life4_9 += 1;
        life5_91 = (spill193_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private void a(com.moon.n5 p0) {
int forwardValue68_66_0;
    int spill68_0;
    boolean spill68_1;
    int spill68_2;
    long life2_3;
    int life5_11;
    int life6_20;
    int life4_21;
    forward_join_72: {
    forward_join_66: {
    forward_join_59: {
    life2_3 = (com.moon.e8.f ^ 120380525826086L);
    life5_11 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(this)).a())))).t)).getValue())))).intValue();
    spill68_0 = com.moon.module.Module.c__IntStatic();
    life6_20 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(this)).a())))).u)).getValue())))).intValue();
    life4_21 = spill68_0;
    ((com.moon.n5)(p0)).c(((double)((((double) life5_11) / 0x1.9p6d))), ((double)((((double) life6_20) / 0x1.9p6d))), ((double)((((double) life5_11) / 0x1.9p6d))));
    spill68_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(this)).a())))).y)).getValue())))).booleanValue();
    if (!((life4_21 == 0))) {
        forwardValue68_66_0 = ((spill68_1) ? 1 : 0);
        break forward_join_66;
    }
    if (!(spill68_1)) {
        break forward_join_59;
    }
    spill68_2 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e8.a)).K)).u)), ((double)(0x0.0p0d)));
    if (!((life4_21 == 0))) {
        forwardValue68_66_0 = spill68_2;
        break forward_join_66;
    }
    if (!((spill68_2 > 0))) {
        break forward_join_59;
    }
    ((com.moon.n5)(p0)).d(((double)(-0x1.0p0d)));
    }
    forwardValue68_66_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(this)).a())))).x)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue68_66_0 != 0))) {
        break forward_join_72;
    }
    ((com.moon.n5)(p0)).a(((double)(-0x1.0p0d)), ((double)(-0x1.0p0d)));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue67_26_0;
    int forwardValue67_50_0;
    int forwardValue67_50_1;
    boolean spill67_0;
    int spill67_1;
    int spill67_2;
    long life2_3;
    int life4_5;
    int life5_32;
    int life6_44;
    com.moon.n5 life7_75;
    forward_join_71: {
    forward_join_50: {
    forward_join_26: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (com.moon.e8.f ^ 69584400902627L);
    life4_5 = com.moon.module.Module.d__IntStatic();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_15;
    }
    spill67_0 = this.e;
    if (!((life4_5 != 0))) {
        forwardValue67_26_0 = ((spill67_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill67_0))) {
        break forward_join_16;
    }
    }
    return;
    }
    forwardValue67_26_0 = (((int) com.moon.e8.h) - ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(this)).a())))).v)).getValue())))).intValue());
    }
    life5_32 = forwardValue67_26_0;
    life6_44 = (life5_32 - (((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(this)).a())))).w)).getValue())))).intValue() - 1));
    spill67_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e8.a)).K)).U;
    spill67_2 = life6_44;
    if (!((life4_5 != 0))) {
        forwardValue67_50_0 = spill67_1;
        forwardValue67_50_1 = spill67_2;
        break forward_join_50;
    }
    if (!((spill67_1 >= spill67_2))) {
        break forward_join_71;
    }
    forwardValue67_50_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e8.a)).K)).U;
    forwardValue67_50_1 = life5_32;
    }
    if (!((forwardValue67_50_0 <= forwardValue67_50_1))) {
        break forward_join_71;
    }
    life7_75 = new com.moon.n5(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e8.a)).K)).t, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e8.a)).K)).u, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e8.a)).K)).v);
    ((com.moon.e8)(this)).a(((com.moon.n5)(life7_75)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e8.a)).K)).b(((com.moon.n5)(life7_75)));
    }
    return;
}


public void a(com.moon.dW p0) {
int forwardValue66_20_0;
    com.moon.e8 forwardValue66_23_0;
    com.moon.e8 forwardValue66_32_0;
    int forwardValue66_32_1;
    com.moon.e8 forwardValue66_33_0;
    com.moon.e8 forwardValue66_34_0;
    int forwardValue66_34_1;
    int forwardValue66_57_0;
    int forwardValue66_77_0;
    int forwardValue66_89_0;
    com.moon.e8 forwardValue66_95_0;
    boolean spill66_0;
    com.moon.e8 spill66_1;
    int spill66_2;
    int spill66_3;
    int spill66_4;
    int spill66_5;
    com.moon.e8 spill66_6;
    long life2_3;
    int life4_5;
    int life5_72;
    forward_join_95: {
    forward_join_94: {
    forward_join_89: {
    forward_join_77: {
    forward_join_76: {
    forward_join_57: {
    forward_join_46: {
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (com.moon.e8.f ^ 17833783805618L);
    life4_5 = com.moon.module.Module.d__IntStatic();
    spill66_0 = ((com.moon.dW)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 != 0))) {
        forwardValue66_20_0 = ((spill66_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill66_0)) {
        break forward_join_22;
    }
    spill66_1 = this;
    if (!((life4_5 != 0))) {
        forwardValue66_23_0 = spill66_1;
        break forward_join_23;
    }
    forwardValue66_20_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(spill66_1)).a())))).C)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue66_20_0 == 0))) {
        break forward_join_22;
    }
    return;
    }
    forwardValue66_23_0 = this;
    }
    spill66_2 = recovery.source.CarrierOps.dcmpl(((double)(((com.moon.n5)(((com.moon.dW)(p0)).a__sourceReturn_821aa26535())).a())), ((double)(0x1.999999999999ap-5d)));
    if (!((life4_5 != 0))) {
        forwardValue66_32_0 = forwardValue66_23_0;
        forwardValue66_32_1 = spill66_2;
        break forward_join_32;
    }
    if (!((spill66_2 > 0))) {
        forwardValue66_33_0 = forwardValue66_23_0;
        break forward_join_33;
    }
    forwardValue66_32_0 = forwardValue66_23_0;
    forwardValue66_32_1 = 1;
    }
    forwardValue66_34_0 = forwardValue66_32_0;
    forwardValue66_34_1 = forwardValue66_32_1;
    break forward_join_34;
    }
    forwardValue66_34_0 = forwardValue66_33_0;
    forwardValue66_34_1 = 0;
    }
    ((com.moon.e8)(forwardValue66_34_0)).e = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue66_34_1)));
    spill66_3 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(this)).a())))).v)).getValue())))).intValue();
    if (!((life4_5 != 0))) {
        forwardValue66_57_0 = spill66_3;
        break forward_join_57;
    }
    if (!((spill66_3 != 0))) {
        break forward_join_46;
    }
    return;
    }
    ((com.moon.e8)(this)).a(((com.moon.n5)(((com.moon.dW)(p0)).a__sourceReturn_821aa26535())));
    forwardValue66_57_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(this)).a())))).z)).getValue())))).booleanValue()) ? 1 : 0);
    }
    life5_72 = forwardValue66_57_0;
    spill66_4 = life5_72;
    if (!((life4_5 != 0))) {
        forwardValue66_77_0 = spill66_4;
        break forward_join_77;
    }
    if (!((spill66_4 != 0))) {
        break forward_join_76;
    }
    spill66_5 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(this)).a())))).t)).getValue())))).intValue();
    if (!((life4_5 != 0))) {
        forwardValue66_77_0 = spill66_5;
        break forward_join_77;
    }
    if (!((spill66_5 == 0))) {
        break forward_join_76;
    }
    ((com.moon.dW)(p0)).b(((boolean)(true)));
    }
    forwardValue66_77_0 = life5_72;
    }
    if (!((life4_5 != 0))) {
        forwardValue66_89_0 = forwardValue66_77_0;
        break forward_join_89;
    }
    if (!((forwardValue66_77_0 != 0))) {
        break forward_join_94;
    }
    spill66_6 = this;
    if (!((life4_5 != 0))) {
        forwardValue66_95_0 = spill66_6;
        break forward_join_95;
    }
    forwardValue66_89_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(spill66_6)).a())))).u)).getValue())))).intValue();
    }
    if (!((forwardValue66_89_0 == 0))) {
        break forward_join_94;
    }
    ((com.moon.dW)(p0)).a(((boolean)(true)));
    }
    forwardValue66_95_0 = this;
    }
    ((com.moon.e8)(forwardValue66_95_0)).e = ((boolean)(false));
    return;
}


public void a(com.moon.event.TickEvent p0) {
long local2 = (com.moon.e8.f ^ 34826040624863L);
    if ((((com.moon.event.TickEvent)(p0)).getPhase() != com.moon.event.TickPhase.PRE)) {
        return;
    }
    java.lang.String local4 = java.lang.String.format(((java.lang.String)(com.moon.e8.g)), ((java.lang.Object[])(new java.lang.Object[] {((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(this)).a())))).t)).getValue(), ((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(this)).a())))).u)).getValue()})));
    ((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e8)(this)).a())))).setSuffix(((java.lang.String)(local4)));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
