package com.moon;


public class gm extends com.moon.gj {

private final com.moon.nW c;

private int d;

private static final long e;

public gm(com.moon.module.impl.KillAura p0) {
super(p0);
    this.c = new com.moon.nW();
}


static {
e = (moom._c.a(-9125214151877284667L, 5483071040481536676L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(172510437155507L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.entity.EntityLivingBase a(java.util.List<net.minecraft.entity.EntityLivingBase> p0) {
int forwardValue291_38_0;
    int forwardValue291_68_0;
    java.lang.Object forwardValue291_80_0;
    net.minecraft.entity.EntityLivingBase forwardValue291_81_0;
    net.minecraft.entity.EntityLivingBase forwardValue291_86_0;
    int[] spill291_0;
    int spill291_1;
    boolean spill291_2;
    int spill291_3;
    java.util.List spill291_4;
    long life2_3;
    com.moon.ml life5_7;
    int[] life4_8;
    int life6_14;
    java.util.List life7_16;
    forward_join_86: {
    forward_join_81: {
    forward_join_80: {
    forward_join_71: {
    forward_join_68: {
    forward_join_64: {
    forward_join_38: {
    forward_join_28: {
    life2_3 = (com.moon.gm.e ^ 18219391000758L);
    spill291_0 = com.moon.module.SettingOwner.b__ArrayIntStatic();
    life5_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__ml();
    life4_8 = spill291_0;
    life6_14 = ((((java.util.stream.Stream)(((java.util.List)(p0)).stream())).anyMatch(((java.util.function.Predicate)(__sourceIntrinsic_e0b16db86ac3_invokedynamic291_5(life5_7))))) ? 1 : 0);
    life7_16 = p0;
    spill291_1 = life6_14;
    if (!((life4_8 == null))) {
        forwardValue291_38_0 = spill291_1;
        break forward_join_38;
    }
    if (!((spill291_1 != 0))) {
        break forward_join_28;
    }
    life7_16 = ((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.List)(life7_16)).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_e0b16db86ac3_invokedynamic291_9(life5_7)))))).toList();
    }
    forwardValue291_38_0 = ((((com.moon.nW)(this.c)).b(((long)(((long) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.KillAura)(((com.moon.gm)(this)).b)).b__k1())).getValue())))).intValue()))))) ? 1 : 0);
    }
    if (!((life4_8 == null))) {
        forwardValue291_68_0 = forwardValue291_38_0;
        break forward_join_68;
    }
    if (!((forwardValue291_38_0 != 0))) {
        break forward_join_64;
    }
    spill291_2 = ((java.util.List)(life7_16)).isEmpty();
    if (!((life4_8 == null))) {
        forwardValue291_68_0 = ((spill291_2) ? 1 : 0);
        break forward_join_68;
    }
    if (!((!spill291_2))) {
        break forward_join_64;
    }
    com.moon.gm __stackOp291_22_0 = this;
    ((com.moon.gm)(__stackOp291_22_0)).d = ((int)((((com.moon.gm)(__stackOp291_22_0)).d + 1)));
    spill291_3 = this.d;
    if (!((life4_8 == null))) {
        forwardValue291_68_0 = spill291_3;
        break forward_join_68;
    }
    if (!((spill291_3 > (((java.util.List)(life7_16)).size() - 1)))) {
        break forward_join_64;
    }
    this.d = ((int)(0));
    }
    spill291_4 = life7_16;
    if (!((life4_8 == null))) {
        forwardValue291_80_0 = spill291_4;
        break forward_join_80;
    }
    forwardValue291_68_0 = ((((java.util.List)(spill291_4)).isEmpty()) ? 1 : 0);
    }
    if (!((forwardValue291_68_0 != 0))) {
        break forward_join_71;
    }
    forwardValue291_81_0 = null;
    break forward_join_81;
    }
    forwardValue291_80_0 = ((java.util.List)(life7_16)).get(((int)(java.lang.Math.min(((int)(this.d)), ((int)((((java.util.List)(life7_16)).size() - 1)))))));
    }
    forwardValue291_81_0 = ((net.minecraft.entity.EntityLivingBase)(forwardValue291_80_0));
    }
    if (!((life4_8 != null))) {
        forwardValue291_86_0 = forwardValue291_81_0;
        break forward_join_86;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    forwardValue291_86_0 = forwardValue291_81_0;
    }
    return forwardValue291_86_0;
}


private static boolean lambda$chooseTarget$1(com.moon.ml p0, net.minecraft.entity.EntityLivingBase p1) {
net.minecraft.entity.EntityLivingBase forwardValue293_12_0;
    int forwardValue293_21_0;
    int forwardValue293_23_0;
    net.minecraft.entity.EntityLivingBase spill293_0;
    boolean spill293_1;
    long life2_3;
    int[] life4_5;
    net.minecraft.entity.player.EntityPlayer life5_19;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_12: {
    life2_3 = (com.moon.gm.e ^ 64992135812171L);
    life4_5 = com.moon.module.SettingOwner.b__ArrayIntStatic();
    spill293_0 = p1;
    if (!((life4_5 == null))) {
        forwardValue293_12_0 = spill293_0;
        break forward_join_12;
    }
    if (!((((spill293_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_22;
    }
    forwardValue293_12_0 = p1;
    }
    life5_19 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue293_12_0));
    spill293_1 = ((com.moon.ml)(p0)).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(life5_19)));
    if (!((life4_5 == null))) {
        forwardValue293_21_0 = ((spill293_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill293_1)) {
        break forward_join_22;
    }
    forwardValue293_21_0 = 1;
    }
    forwardValue293_23_0 = forwardValue293_21_0;
    break forward_join_23;
    }
    forwardValue293_23_0 = 0;
    }
    return ((forwardValue293_23_0) != 0);
}


private static boolean lambda$chooseTarget$0(com.moon.ml p0, net.minecraft.entity.EntityLivingBase p1) {
net.minecraft.entity.EntityLivingBase forwardValue292_12_0;
    int forwardValue292_21_0;
    int forwardValue292_23_0;
    net.minecraft.entity.EntityLivingBase spill292_0;
    boolean spill292_1;
    long life2_3;
    int[] life4_5;
    net.minecraft.entity.player.EntityPlayer life5_19;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_12: {
    life2_3 = (com.moon.gm.e ^ 99702454706629L);
    life4_5 = com.moon.module.SettingOwner.b__ArrayIntStatic();
    spill292_0 = p1;
    if (!((life4_5 == null))) {
        forwardValue292_12_0 = spill292_0;
        break forward_join_12;
    }
    if (!((((spill292_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_22;
    }
    forwardValue292_12_0 = p1;
    }
    life5_19 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue292_12_0));
    spill292_1 = ((com.moon.ml)(p0)).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(life5_19)));
    if (!((life4_5 == null))) {
        forwardValue292_21_0 = ((spill292_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill292_1)) {
        break forward_join_22;
    }
    forwardValue292_21_0 = 1;
    }
    forwardValue292_23_0 = forwardValue292_21_0;
    break forward_join_23;
    }
    forwardValue292_23_0 = 0;
    }
    return ((forwardValue292_23_0) != 0);
}


private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_e0b16db86ac3_invokedynamic291_5(com.moon.ml a0) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_e0b16db86ac3_invokedynamic291_9(com.moon.ml a0) throws E;
}
