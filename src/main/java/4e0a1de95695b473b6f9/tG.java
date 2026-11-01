package moom;


public class tG extends moom.tE implements net.minecraft.tileentity.IHopper {

private boolean aS;

private int aT;

private final moom.DT aU;

private static final long bb;

public tG(net.minecraft.world.World p0) {
super(p0);
    this.aS = true;
    this.aT = -1;
    this.aU = moom.DT.f;
}


public tG(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0, p1, p2, p3);
    this.aS = true;
    this.aT = -1;
    this.aU = moom.DT.f;
}


static {
bb = (moom._c.a(-7092032506961492764L, 8957772584734004185L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(241536407942735L);
}


public boolean I() {
moom.tG forwardValue4037_14_0;
    int forwardValue4037_38_0;
    moom.tG spill4037_0;
    int spill4037_1;
    long life1_3;
    int life3_5;
    java.util.List life4_29;
    forward_join_38: {
    forward_join_37: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.tG.bb ^ 19661615865666L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4037_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue4037_14_0 = spill4037_0;
        break forward_join_14;
    }
    if (!(moom.Cp.a__Boolean(((net.minecraft.tileentity.IHopper)(spill4037_0))))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue4037_14_0 = this;
    }
    life4_29 = ((net.minecraft.world.World)(((moom.tG)(forwardValue4037_14_0)).i)).a(((java.lang.Class)(net.minecraft.entity.item.EntityItem.class)), ((moom.CA)(((moom.CA)(((moom.tG)(this)).b())).b(((double)(0x1.0p-2d)), ((double)(0x0.0p0d)), ((double)(0x1.0p-2d))))), ((com.google.common.base.Predicate)(moom.CY.a)));
    spill4037_1 = ((java.util.List)(life4_29)).size();
    if (!((life3_5 == 0))) {
        forwardValue4037_38_0 = spill4037_1;
        break forward_join_38;
    }
    if (!((spill4037_1 > 0))) {
        break forward_join_37;
    }
    __sourceExactCall_c3802b3f9ca905(((net.minecraft.inventory.IInventory)(this)), ((net.minecraft.entity.item.EntityItem)(((net.minecraft.entity.item.EntityItem)(((java.util.List)(life4_29)).get(((int)(0))))))));
    }
    forwardValue4037_38_0 = 0;
    }
    return ((forwardValue4037_38_0) != 0);
}


public boolean J() {
int forwardValue4038_12_0;
    int forwardValue4038_14_0;
    int spill4038_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.tG.bb ^ 139512909975046L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill4038_0 = this.aT;
    if (!((life3_5 != 0))) {
        forwardValue4038_12_0 = spill4038_0;
        break forward_join_12;
    }
    if (!((spill4038_0 > 0))) {
        break forward_join_13;
    }
    forwardValue4038_12_0 = 1;
    }
    forwardValue4038_14_0 = forwardValue4038_12_0;
    break forward_join_14;
    }
    forwardValue4038_14_0 = 0;
    }
    return ((forwardValue4038_14_0) != 0);
}


public void i(boolean p0) {
this.aS = ((boolean)(p0));
    return;
}


public double b__sourceReturn_fedcb3e4d3() {
return (((moom.tG)(this)).o + 0x1.0p-1d);
}


public boolean b__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue4041_16_0;
    boolean spill4041_0;
    long life2_3;
    int life4_5;
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.tG.bb ^ 6129486255316L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4041_0 = ((net.minecraft.world.World)(((moom.tG)(this)).i)).G;
    if (!((life4_5 == 0))) {
        forwardValue4041_16_0 = ((spill4041_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill4041_0))) {
        break forward_join_15;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.inventory.IInventory)(this)));
    }
    forwardValue4041_16_0 = 1;
    }
    return ((forwardValue4041_16_0) != 0);
}


public net.minecraft.block.state.IBlockState b__fE() {
return ((moom.c9)(net.minecraft.init.Blocks.b4)).a__fE();
}


public int b__Int() {
return 5;
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.aT = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("TransferCooldown")))));
    return;
}


public double c__sourceReturn_fedcb3e4d3() {
return ((moom.tG)(this)).p;
}


public java.lang.String c__String() {
return "minecraft:hopper";
}


public net.minecraft.world.World c__sourceInterfaceWorld() {
return ((moom.tG)(this)).i;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("TransferCooldown")), ((int)(this.aT)));
    return;
}


public net.minecraft.entity.item.EntityMinecart$EnumMinecartType a__aT() {
return net.minecraft.entity.item.EntityMinecart$EnumMinecartType.HOPPER;
}


public void a(int p0, int p1, int p2, boolean p3) {
int forwardValue4039_11_0;
    int forwardValue4039_13_0;
    boolean spill4039_0;
    long life5_3;
    int life7_5;
    int life8_16;
    forward_join_21: {
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life5_3 = (moom.tG.bb ^ 128739629280450L);
    life7_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4039_0 = p3;
    if (!((life7_5 == 0))) {
        forwardValue4039_11_0 = ((spill4039_0) ? 1 : 0);
        break forward_join_11;
    }
    if (!((!spill4039_0))) {
        break forward_join_12;
    }
    forwardValue4039_11_0 = 1;
    }
    forwardValue4039_13_0 = forwardValue4039_11_0;
    break forward_join_13;
    }
    forwardValue4039_13_0 = 0;
    }
    life8_16 = forwardValue4039_13_0;
    if (!((life8_16 != ((((moom.tG)(this)).H()) ? 1 : 0)))) {
        break forward_join_21;
    }
    ((moom.tG)(this)).i(((boolean)__sourceIntrinsic_integerToBoolean((life8_16))));
    }
    return;
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
return new moom.wg(p0, this, p1);
}


public double a__sourceReturn_fedcb3e4d3() {
return ((moom.tG)(this)).n;
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
moom.tG forwardValue4040_18_0;
    int spill4040_0;
    moom.tG spill4040_1;
    long life2_3;
    int life4_8;
    forward_join_24: {
    forward_join_18: {
    life2_3 = (moom.tG.bb ^ 140113268795671L);
    spill4040_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    super.a__sourceReturn_7889e8f768(((net.minecraft.util.DamageSource)(p0)));
    life4_8 = spill4040_0;
    spill4040_1 = this;
    if (!((life4_8 == 0))) {
        forwardValue4040_18_0 = spill4040_1;
        break forward_join_18;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((moom.tG)(spill4040_1)).i)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops"))))) {
        break forward_join_24;
    }
    forwardValue4040_18_0 = this;
    }
    ((moom.tG)(forwardValue4040_18_0)).a(((net.minecraft.item.Item)(__sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b4))))), ((int)(1)), ((float)(0x0.0p0f)));
    }
    return;
}


public int m__sourceReturn_8abf5c6871() {
return 1;
}


public void g__Void() {
int forwardValue4042_16_0;
    int forwardValue4042_21_0;
    int forwardValue4042_57_0;
    moom.tG forwardValue4042_62_0;
    int spill4042_0;
    boolean spill4042_1;
    boolean spill4042_2;
    moom.tG spill4042_3;
    long life1_3;
    int life3_7;
    moom.DT life4_38;
    forward_join_63: {
    forward_join_62: {
    forward_join_57: {
    forward_join_45: {
    forward_join_42: {
    forward_join_40: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (moom.tG.bb ^ 71838654362584L);
    spill4042_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    super.g__Void();
    life3_7 = spill4042_0;
    spill4042_1 = ((net.minecraft.world.World)(((moom.tG)(this)).i)).G;
    if (!((life3_7 == 0))) {
        forwardValue4042_16_0 = ((spill4042_1) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill4042_1))) {
        break forward_join_63;
    }
    forwardValue4042_16_0 = ((((moom.tG)(this)).p__Boolean()) ? 1 : 0);
    }
    if (!((life3_7 == 0))) {
        forwardValue4042_21_0 = forwardValue4042_16_0;
        break forward_join_21;
    }
    if (!((forwardValue4042_16_0 != 0))) {
        break forward_join_63;
    }
    forwardValue4042_21_0 = ((((moom.tG)(this)).H()) ? 1 : 0);
    }
    if (!((forwardValue4042_21_0 != 0))) {
        break forward_join_63;
    }
    life4_38 = new moom.DT(this);
    if (!((life3_7 == 0))) {
        break forward_join_40;
    }
    if (!(((moom.DT)(life4_38)).equals(((java.lang.Object)(this.aU))))) {
        break forward_join_42;
    }
    moom.tG __stackOp4042_12_0 = this;
    ((moom.tG)(__stackOp4042_12_0)).aT = ((int)((((moom.tG)(__stackOp4042_12_0)).aT - 1)));
    }
    if (!((life3_7 != 0))) {
        break forward_join_45;
    }
    }
    ((moom.tG)(this)).j(((int)(0)));
    }
    spill4042_2 = ((moom.tG)(this)).J();
    if (!((life3_7 == 0))) {
        forwardValue4042_57_0 = ((spill4042_2) ? 1 : 0);
        break forward_join_57;
    }
    if (!((!spill4042_2))) {
        break forward_join_63;
    }
    ((moom.tG)(this)).j(((int)(0)));
    spill4042_3 = this;
    if (!((life3_7 == 0))) {
        forwardValue4042_62_0 = spill4042_3;
        break forward_join_62;
    }
    forwardValue4042_57_0 = ((((moom.tG)(spill4042_3)).I()) ? 1 : 0);
    }
    if (!((forwardValue4042_57_0 != 0))) {
        break forward_join_63;
    }
    ((moom.tG)(this)).j(((int)(4)));
    forwardValue4042_62_0 = this;
    }
    ((moom.tG)(forwardValue4042_62_0)).a__Void();
    }
    return;
}


public void j(int p0) {
this.aT = ((int)(p0));
    return;
}


public boolean H() {
return ((((this.aS) ? 1 : 0)) != 0);
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native boolean __sourceExactCall_c3802b3f9ca905(net.minecraft.inventory.IInventory p0, net.minecraft.entity.item.EntityItem p1);
private static native net.minecraft.item.Item __sourceExactCall_42e37b9acc15b0(net.minecraft.block.Block p0);
}
