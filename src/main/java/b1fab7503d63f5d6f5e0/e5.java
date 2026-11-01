package com.moon;


public class e5 extends com.moon.e2<com.moon.module.impl.Velocity> {

private final java.util.LinkedList<moom.DN<com.moon.dW, java.lang.Integer>> e;

private static final long f;

private static final java.lang.String g;

public e5() {
super(com.moon.module.impl.Velocity.class);
    this.e = new java.util.LinkedList();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(5529388303117287192L)), ((long)(-1240155097411031468L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(137098590911297L)))));
    long local0_life6 = (com.moon.e5.f ^ 10939683885057L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill76_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill76_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill76_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill76_13 = new byte[8];
    (__sourceSpill76_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill76_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation76_15 = __sourceSpill76_13;
    ((javax.crypto.Cipher)(__sourceSpill76_10)).init(((int)(__sourceSpill76_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill76_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation76_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill76_19 = ((java.lang.String)("QÎA|ç?Òp")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill76_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill76_20)).doFinal(((byte[])(__sourceSpill76_19)));
    g = ((java.lang.String)(((java.lang.String)(com.moon.e5.a(((byte[])(local4_life22))))).intern()));
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
        byte[] spill182_0 = p0;
        life4_9 += 1;
        life5_44 = (spill182_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill182_1 = p0;
        life4_9 += 1;
        life5_76 = (spill182_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill182_2 = p0;
        life4_9 += 1;
        life5_91 = (spill182_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(com.moon.event.MoveEvent p0) {
int forestValue900014_53_0;
    java.lang.Object forestValue900014_71_0;
    int forestValue900014_108_0;
    com.moon.event.MovePhase spill900014_0;
    int spill900014_1;
    int spill900014_2;
    java.lang.Object spill900014_3;
    long life2_3;
    int life4_5;
    moom.DN life5_22;
    com.moon.dW life6_28;
    com.moon.n5 life7_31;
    int life8_36;
    moom.DN life5_90;
    com.moon.dW life6_96;
    com.moon.n5 life7_99;
    int life8_104;
    forest_join_135: {
    forest_join_130: {
    forest_join_71: {
    forest_join_13: {
    life2_3 = (com.moon.e5.f ^ 115993815012352L);
    life4_5 = com.moon.module.Module.c__IntStatic();
    spill900014_0 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    if (!((life4_5 == 0))) {
        forestValue900014_71_0 = spill900014_0;
        break forest_join_71;
    }
    if (!((spill900014_0 != com.moon.event.MovePhase.PRE))) {
        break forest_join_13;
    }
    return;
    }
    forest_cycle_13: while (true) {
    forest_join_64: {
    forest_join_60: {
    forest_join_53: {
    forest_join_51: {
    if (!(((life5_22 = ((moom.DN)(((java.util.LinkedList)(this.e)).peek()))) != null))) {
        break forest_join_130;
    }
    life6_28 = ((com.moon.dW)(((moom.DN)(life5_22)).a()));
    life7_31 = ((com.moon.dW)(life6_28)).a__sourceReturn_821aa26535();
    life8_36 = ((java.lang.Integer)(((java.lang.Integer)(((moom.DN)(life5_22)).b())))).intValue();
    if (!((life4_5 == 0))) {
        break forest_join_135;
    }
    spill900014_1 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e5.a)).K)).S - life8_36);
    if (!((life4_5 == 0))) {
        forestValue900014_53_0 = spill900014_1;
        break forest_join_53;
    }
    if (!((spill900014_1 < ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e5)(this)).a())))).B)).getValue())))).intValue()))) {
        break forest_join_51;
    }
    if (!((life4_5 != 0))) {
        break forest_join_130;
    }
    }
    forestValue900014_53_0 = ((((com.moon.dW)(life6_28)).b__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((forestValue900014_53_0 != 0))) {
        break forest_join_60;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e5.a)).K)).a(((com.moon.n5)(life7_31)));
    if (!((life4_5 != 0))) {
        break forest_join_64;
    }
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e5.a)).K)).b(((com.moon.n5)(life7_31)));
    }
    ((java.util.LinkedList)(this.e)).poll();
    if (!((life4_5 != 0))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    break forest_join_130;
    }
    forest_cycle_71: while (true) {
    forest_join_126: {
    forest_join_119: {
    forest_join_115: {
    forest_join_108: {
    forest_join_106: {
    if (!(((life5_90 = ((moom.DN)(forestValue900014_71_0))) != null))) {
        break forest_join_130;
    }
    life6_96 = ((com.moon.dW)(((moom.DN)(life5_90)).a()));
    life7_99 = ((com.moon.dW)(life6_96)).a__sourceReturn_821aa26535();
    life8_104 = ((java.lang.Integer)(((java.lang.Integer)(((moom.DN)(life5_90)).b())))).intValue();
    if (!((life4_5 == 0))) {
        break forest_join_135;
    }
    spill900014_2 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e5.a)).K)).S - life8_104);
    if (!((life4_5 == 0))) {
        forestValue900014_108_0 = spill900014_2;
        break forest_join_108;
    }
    if (!((spill900014_2 < ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e5)(this)).a())))).B)).getValue())))).intValue()))) {
        break forest_join_106;
    }
    if (!((life4_5 != 0))) {
        break forest_join_130;
    }
    }
    forestValue900014_108_0 = ((((com.moon.dW)(life6_96)).b__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((forestValue900014_108_0 != 0))) {
        break forest_join_115;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e5.a)).K)).a(((com.moon.n5)(life7_99)));
    if (!((life4_5 != 0))) {
        break forest_join_119;
    }
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e5.a)).K)).b(((com.moon.n5)(life7_99)));
    }
    ((java.util.LinkedList)(this.e)).poll();
    if (!((life4_5 != 0))) {
        break forest_join_126;
    }
    break forest_join_130;
    }
    spill900014_3 = ((java.util.LinkedList)(this.e)).peek();
    forestValue900014_71_0 = spill900014_3;
    continue forest_cycle_71;
    }
    }
    ((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e5)(this)).a())))).setSuffix(((java.lang.String)(com.moon.e5.g)));
    }
    return;
}


public void a(com.moon.dW p0) {
int forwardValue59_18_0;
    java.lang.Object forwardValue59_35_0;
    java.lang.Object forwardValue59_46_0;
    int forwardValue59_52_0;
    boolean spill59_0;
    java.lang.Boolean spill59_1;
    moom.DN spill59_2;
    long life2_3;
    int life4_5;
    moom.DN life5_27;
    int life6_70;
    forward_join_52: {
    forward_join_49: {
    forward_join_46: {
    forward_join_40: {
    forward_join_35: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (com.moon.e5.f ^ 44336087025153L);
    life4_5 = com.moon.module.Module.d__IntStatic();
    spill59_0 = ((com.moon.dW)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 != 0))) {
        forwardValue59_18_0 = ((spill59_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill59_0)) {
        break forward_join_20;
    }
    forwardValue59_18_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e5)(this)).a())))).C)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue59_18_0 == 0))) {
        break forward_join_20;
    }
    return;
    }
    life5_27 = null;
    spill59_1 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e5)(this)).a())))).A)).getValue()));
    if (!((life4_5 != 0))) {
        forwardValue59_35_0 = spill59_1;
        break forward_join_35;
    }
    if (!(((java.lang.Boolean)(spill59_1)).booleanValue())) {
        break forward_join_40;
    }
    forwardValue59_35_0 = ((java.util.LinkedList)(this.e)).peek();
    }
    life5_27 = ((moom.DN)(forwardValue59_35_0));
    ((java.util.LinkedList)(this.e)).clear();
    }
    spill59_2 = life5_27;
    if (!((life4_5 != 0))) {
        forwardValue59_46_0 = spill59_2;
        break forward_join_46;
    }
    if (!((spill59_2 != null))) {
        break forward_join_49;
    }
    forwardValue59_46_0 = ((moom.DN)(life5_27)).b();
    }
    forwardValue59_52_0 = ((java.lang.Integer)(((java.lang.Integer)(forwardValue59_46_0)))).intValue();
    break forward_join_52;
    }
    forwardValue59_52_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e5.a)).K)).S;
    }
    life6_70 = forwardValue59_52_0;
    ((java.util.LinkedList)(this.e)).add(((java.lang.Object)(new moom.DN(p0, java.lang.Integer.valueOf(((int)(life6_70)))))));
    ((com.moon.dW)(p0)).setCancelled(((boolean)(true)));
    return;
}

}
