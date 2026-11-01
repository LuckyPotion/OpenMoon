package moom;


public class wO extends moom.wB {

private final net.minecraft.entity.player.EntityPlayer f;

private int g;

private static final long h;

public wO(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.inventory.IInventory p1, int p2, int p3, int p4) {
super(p1, p2, p3, p4);
    this.f = p0;
}


static {
moom.wO.h = (moom._c.a(-235236049786111299L, -285157552972910436L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(125866892385153L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void a(net.minecraft.item.ItemStack p0, int p1) {
this.g += p1;
    ((moom.wO)(this)).a__Void(((net.minecraft.item.ItemStack)(p0)));
    return;
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) {
return ((0) != 0);
}


protected void a__Void(net.minecraft.item.ItemStack p0) {
int forestValue515_42_0;
    int forestValue515_75_0;
    int forestValue515_115_0;
    moom.wO forestValue515_156_0;
    net.minecraft.item.Item forestValue515_171_0;
    net.minecraft.item.Item forestValue515_171_1;
    net.minecraft.entity.Entity[] spill515_0;
    moom.wO spill515_1;
    int spill515_2;
    int spill515_3;
    int spill515_4;
    int spill515_5;
    net.minecraft.item.Item spill515_6;
    net.minecraft.item.Item spill515_7;
    long life2_3;
    net.minecraft.entity.Entity[] life4_14;
    int life5_27;
    float life6_31;
    int life7_61;
    int life7_103;
    int life7_143;
    forest_join_176: {
    forest_join_171: {
    forest_join_168: {
    forest_join_158: {
    forest_join_156: {
    forest_join_155: {
    forest_join_115: {
    forest_join_76: {
    forest_join_75: {
    forest_join_74: {
    forest_join_42: {
    forest_join_39: {
    life2_3 = (moom.wO.h ^ 25823412811349L);
    spill515_0 = moom.v8.b__Arrayr3();
    ((net.minecraft.item.ItemStack)(p0)).a(((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(this.f)).i)), ((net.minecraft.entity.player.EntityPlayer)(this.f)), ((int)(this.g)));
    life4_14 = spill515_0;
    spill515_1 = this;
    if (!((life4_14 == null))) {
        forestValue515_156_0 = spill515_1;
        break forest_join_156;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(((moom.wO)(spill515_1)).f)).i)).G))) {
        break forest_join_155;
    }
    life5_27 = this.g;
    life6_31 = ((moom.xY)(moom.xY.a__xY())).a(((net.minecraft.item.ItemStack)(p0)));
    spill515_2 = recovery.source.CarrierOps.fcmpl(((float)(life6_31)), ((float)(0x0.0p0f)));
    if (!((life4_14 == null))) {
        forestValue515_42_0 = spill515_2;
        break forest_join_42;
    }
    if (!((spill515_2 == 0))) {
        break forest_join_39;
    }
    life5_27 = 0;
    if (!((life4_14 != null))) {
        break forest_join_76;
    }
    }
    forestValue515_42_0 = recovery.source.CarrierOps.fcmpg(((float)(life6_31)), ((float)(0x1.0p0f)));
    }
    if (!((life4_14 == null))) {
        forestValue515_115_0 = forestValue515_42_0;
        break forest_join_115;
    }
    if (!((forestValue515_42_0 < 0))) {
        break forest_join_76;
    }
    life7_61 = moom.Dr.a__Int(((float)((((float) life5_27) * life6_31))));
    spill515_3 = life7_61;
    if (!((life4_14 == null))) {
        forestValue515_75_0 = spill515_3;
        break forest_join_75;
    }
    if (!((spill515_3 < moom.Dr.b__Int(((float)((((float) life5_27) * life6_31))))))) {
        break forest_join_74;
    }
    spill515_4 = recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.random())), ((double)(((double) ((((float) life5_27) * life6_31) - ((float) life7_61))))));
    if (!((life4_14 == null))) {
        forestValue515_75_0 = spill515_4;
        break forest_join_75;
    }
    if (!((spill515_4 < 0))) {
        break forest_join_74;
    }
    life7_61 += 1;
    }
    forestValue515_75_0 = life7_61;
    }
    life5_27 = forestValue515_75_0;
    }
    forest_cycle_76: while (true) {
    if (!((life5_27 > 0))) {
        break forest_join_155;
    }
    life7_103 = __sourceExactCall_d69b06941ddd75(((int)(life5_27)));
    life5_27 = (life5_27 - life7_103);
    ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(this.f)).i)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tL(((net.minecraft.entity.player.EntityPlayer)(this.f)).i, ((net.minecraft.entity.player.EntityPlayer)(this.f)).n, (((net.minecraft.entity.player.EntityPlayer)(this.f)).o + 0x1.0p-1d), (((net.minecraft.entity.player.EntityPlayer)(this.f)).p + 0x1.0p-1d), life7_103))));
    if (!((life4_14 == null))) {
        break forest_join_158;
    }
    if (!((life4_14 != null))) {
        continue forest_cycle_76;
    }
    break forest_cycle_76;
    }
    break forest_join_155;
    }
    forest_cycle_115: while (true) {
    forest_join_153: {
    if (!((forestValue515_115_0 > 0))) {
        break forest_join_155;
    }
    life7_143 = __sourceExactCall_d69b06941ddd75(((int)(life5_27)));
    life5_27 = (life5_27 - life7_143);
    ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(this.f)).i)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tL(((net.minecraft.entity.player.EntityPlayer)(this.f)).i, ((net.minecraft.entity.player.EntityPlayer)(this.f)).n, (((net.minecraft.entity.player.EntityPlayer)(this.f)).o + 0x1.0p-1d), (((net.minecraft.entity.player.EntityPlayer)(this.f)).p + 0x1.0p-1d), life7_143))));
    if (!((life4_14 == null))) {
        break forest_join_158;
    }
    if (!((life4_14 != null))) {
        break forest_join_153;
    }
    break forest_join_155;
    }
    spill515_5 = life5_27;
    forestValue515_115_0 = spill515_5;
    continue forest_cycle_115;
    }
    }
    forestValue515_156_0 = this;
    }
    ((moom.wO)(forestValue515_156_0)).g = ((int)(0));
    }
    spill515_6 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    spill515_7 = net.minecraft.init.Items.j;
    if (!((life4_14 == null))) {
        forestValue515_171_0 = spill515_6;
        forestValue515_171_1 = spill515_7;
        break forest_join_171;
    }
    if (!((spill515_6 == spill515_7))) {
        break forest_join_168;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this.f)).a(((moom.BY)(net.minecraft.stats.AchievementList.k)));
    }
    forestValue515_171_0 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    forestValue515_171_1 = net.minecraft.init.Items.aV;
    }
    if (!((forestValue515_171_0 == forestValue515_171_1))) {
        break forest_join_176;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this.f)).a(((moom.BY)(net.minecraft.stats.AchievementList.p)));
    }
    return;
}


public net.minecraft.item.ItemStack a(int p0) {
moom.wO forwardValue4372_22_0;
    moom.wO spill4372_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.wO.h ^ 125504312504987L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4372_0 = this;
    if (!((life4_5 == null))) {
        forwardValue4372_22_0 = spill4372_0;
        break forward_join_22;
    }
    if (!(((moom.wO)(spill4372_0)).a__Boolean())) {
        break forward_join_21;
    }
    moom.wO __stackOp4372_3_0 = this;
    ((moom.wO)(__stackOp4372_3_0)).g = ((int)((((moom.wO)(__stackOp4372_3_0)).g + java.lang.Math.min(((int)(p0)), ((int)(((net.minecraft.item.ItemStack)(((moom.wO)(this)).a__xW())).b))))));
    }
    forwardValue4372_22_0 = this;
    }
    return __sourceIntrinsic_089d864267ae_call4372_9(forwardValue4372_22_0, p0);
}


public void a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.item.ItemStack p1) {
((moom.wO)(this)).a__Void(((net.minecraft.item.ItemStack)(p1)));
    super.a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(p1)));
    return;
}


private static native <E extends Throwable> net.minecraft.item.ItemStack __sourceIntrinsic_089d864267ae_call4372_9(moom.wO a0, int a1) throws E;

private static native int __sourceExactCall_d69b06941ddd75(int p0);
}
