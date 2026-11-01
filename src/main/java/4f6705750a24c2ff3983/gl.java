package com.moon;


public class gl extends com.moon.gj {

private static final long c;

public gl(com.moon.module.impl.KillAura p0) {
super(p0);
}


static {
c = (moom._c.a(-2276772980498394984L, 5888463028437685960L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(149007571486972L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.entity.EntityLivingBase a(java.util.List<net.minecraft.entity.EntityLivingBase> p0) {
long life2_3;
    com.moon.ml life5_7;
    int life6_13;
    int[] life4_14;
    life2_3 = (com.moon.gl.c ^ 7244079623998L);
    int[] spill1139_0 = com.moon.module.SettingOwner.b__ArrayIntStatic();
    life5_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__ml();
    life6_13 = ((((java.util.stream.Stream)(((java.util.List)(p0)).stream())).anyMatch(((java.util.function.Predicate)(__sourceIntrinsic_e0b16db86ac3_invokedynamic1139_5(life5_7))))) ? 1 : 0);
    life4_14 = spill1139_0;
    if ((life6_13 != 0)) {
        return ((net.minecraft.entity.EntityLivingBase)(((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.List)(p0)).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_e0b16db86ac3_invokedynamic1139_9(life5_7)))))).min(((java.util.Comparator)(((com.moon.gf)(((com.moon.bc)(((com.moon.bc)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.KillAura)(((com.moon.gl)(this)).b)).b__kY())).getValue())))).a())).a()))))).orElse(((java.lang.Object)(null)))));
    }
    net.minecraft.entity.EntityLivingBase spill1139_1 = ((net.minecraft.entity.EntityLivingBase)(((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.List)(p0)).stream())).sorted(((java.util.Comparator)(java.util.Comparator.comparingInt(((java.util.function.ToIntFunction)(__sourceIntrinsic_e0b16db86ac3_invokedynamic1139_21(life5_7))))))))).min(((java.util.Comparator)(((com.moon.gf)(((com.moon.bc)(((com.moon.bc)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.KillAura)(((com.moon.gl)(this)).b)).b__kY())).getValue())))).a())).a()))))).orElse(((java.lang.Object)(null)))));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.module.SettingOwner.b(((int[])(new int[5])));
    }
    return spill1139_1;
}


private static int lambda$chooseTarget$2(com.moon.ml p0, net.minecraft.entity.EntityLivingBase p1) {
net.minecraft.entity.EntityLivingBase forwardValue290_12_0;
    int forwardValue290_21_0;
    int forwardValue290_23_0;
    net.minecraft.entity.EntityLivingBase spill290_0;
    boolean spill290_1;
    long life2_3;
    int[] life4_5;
    net.minecraft.entity.player.EntityPlayer life5_19;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_12: {
    life2_3 = (com.moon.gl.c ^ 58110793878220L);
    life4_5 = com.moon.module.SettingOwner.b__ArrayIntStatic();
    spill290_0 = p1;
    if (!((life4_5 == null))) {
        forwardValue290_12_0 = spill290_0;
        break forward_join_12;
    }
    if (!((((spill290_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_22;
    }
    forwardValue290_12_0 = p1;
    }
    life5_19 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue290_12_0));
    spill290_1 = ((com.moon.ml)(p0)).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(life5_19)));
    if (!((life4_5 == null))) {
        forwardValue290_21_0 = ((spill290_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill290_1)) {
        break forward_join_22;
    }
    forwardValue290_21_0 = 1;
    }
    forwardValue290_23_0 = forwardValue290_21_0;
    break forward_join_23;
    }
    forwardValue290_23_0 = 0;
    }
    return forwardValue290_23_0;
}


private static boolean lambda$chooseTarget$1(com.moon.ml p0, net.minecraft.entity.EntityLivingBase p1) {
net.minecraft.entity.EntityLivingBase forwardValue289_12_0;
    int forwardValue289_21_0;
    int forwardValue289_23_0;
    net.minecraft.entity.EntityLivingBase spill289_0;
    boolean spill289_1;
    long life2_3;
    int[] life4_5;
    net.minecraft.entity.player.EntityPlayer life5_19;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_12: {
    life2_3 = (com.moon.gl.c ^ 125349006948798L);
    life4_5 = com.moon.module.SettingOwner.b__ArrayIntStatic();
    spill289_0 = p1;
    if (!((life4_5 == null))) {
        forwardValue289_12_0 = spill289_0;
        break forward_join_12;
    }
    if (!((((spill289_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_22;
    }
    forwardValue289_12_0 = p1;
    }
    life5_19 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue289_12_0));
    spill289_1 = ((com.moon.ml)(p0)).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(life5_19)));
    if (!((life4_5 == null))) {
        forwardValue289_21_0 = ((spill289_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill289_1)) {
        break forward_join_22;
    }
    forwardValue289_21_0 = 1;
    }
    forwardValue289_23_0 = forwardValue289_21_0;
    break forward_join_23;
    }
    forwardValue289_23_0 = 0;
    }
    return ((forwardValue289_23_0) != 0);
}


private static boolean lambda$chooseTarget$0(com.moon.ml p0, net.minecraft.entity.EntityLivingBase p1) {
net.minecraft.entity.EntityLivingBase forwardValue288_12_0;
    int forwardValue288_21_0;
    int forwardValue288_23_0;
    net.minecraft.entity.EntityLivingBase spill288_0;
    boolean spill288_1;
    long life2_3;
    int[] life4_5;
    net.minecraft.entity.player.EntityPlayer life5_19;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_12: {
    life2_3 = (com.moon.gl.c ^ 47752630381218L);
    life4_5 = com.moon.module.SettingOwner.b__ArrayIntStatic();
    spill288_0 = p1;
    if (!((life4_5 == null))) {
        forwardValue288_12_0 = spill288_0;
        break forward_join_12;
    }
    if (!((((spill288_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_22;
    }
    forwardValue288_12_0 = p1;
    }
    life5_19 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue288_12_0));
    spill288_1 = ((com.moon.ml)(p0)).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(life5_19)));
    if (!((life4_5 == null))) {
        forwardValue288_21_0 = ((spill288_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill288_1)) {
        break forward_join_22;
    }
    forwardValue288_21_0 = 1;
    }
    forwardValue288_23_0 = forwardValue288_21_0;
    break forward_join_23;
    }
    forwardValue288_23_0 = 0;
    }
    return ((forwardValue288_23_0) != 0);
}


private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_e0b16db86ac3_invokedynamic1139_5(com.moon.ml a0) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_e0b16db86ac3_invokedynamic1139_9(com.moon.ml a0) throws E;

private static native <E extends Throwable> java.util.function.ToIntFunction __sourceIntrinsic_e0b16db86ac3_invokedynamic1139_21(com.moon.ml a0) throws E;
}
