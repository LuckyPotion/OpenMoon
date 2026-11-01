package moom;


public class sF extends net.minecraft.entity.EntityHanging {

public moom.aU aH;

private static long cb;

public sF(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, java.lang.String p3) { this((net.minecraft.world.World)null, (moom.DT)null, (moom.bs)null); }

private static void __sourceConstructorBody_09b50dfa41b79550(moom.sF receiver, net.minecraft.world.World p0, moom.DT p1, moom.bs p2, java.lang.String p3) throws Throwable {
init_join_45: {
    init_join_42: {
    long local5_life2 = (moom.sF.cb ^ 94184786647142L);
    int __sourceSpill727_4 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    moom.sF.__sourceConstructorInit_09b50dfa41b79550_0(((moom.sF)(receiver)), ((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)));
    int local7_life6 = __sourceSpill727_4;
    moom.aU[] local8_life8 = moom.aU.values();
    int local9_life9 = (local8_life8).length;
    int local10_life10 = 0;
    init_cycle_18: while (true) {
    init_join_40: {
    init_join_39: {
    if (!((local10_life10 < local9_life9))) {
        break init_join_42;
    }
    moom.aU local11_life11 = (local8_life8)[local10_life10];
    if (!((local7_life6 != 0))) {
        break init_join_45;
    }
    if (!((local7_life6 != 0))) {
        break init_join_40;
    }
    if (!(((java.lang.String)(((moom.aU)(local11_life11)).title)).equals(((java.lang.Object)(p3))))) {
        break init_join_39;
    }
    ((moom.sF)(receiver)).aH = ((moom.aU)(local11_life11));
    if (!((local7_life6 == 0))) {
        break init_join_42;
    }
    }
    local10_life10 += 1;
    }
    if (!((local7_life6 == 0))) { continue init_cycle_18; }
    break init_cycle_18;
    }
    }
    ((moom.sF)(receiver)).a(((moom.bs)(p2)));
    }
    return;
}


public sF(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) { super((net.minecraft.world.World)null, (moom.DT)null); }

private static void __sourceConstructorBody_e268db7ee0d7d079(moom.sF receiver, net.minecraft.world.World p0, moom.DT p1, moom.bs p2) throws Throwable {
boolean __initValue726_48_0;
    long local4_life2;
    int local6_life6;
    java.util.ArrayList local7_life8;
    moom.aU[] local8_life10;
    int local9_life11;
    int local10_life12;
    moom.aU local11_life13;
    init_join_59: {
    init_join_48: {
    init_join_46: {
    local4_life2 = (moom.sF.cb ^ 6366949621037L);
    int __sourceSpill726_4 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    moom.sF.__sourceConstructorInit_e268db7ee0d7d079_0(((moom.sF)(receiver)), ((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    local6_life6 = __sourceSpill726_4;
    local7_life8 = com.google.common.collect.Lists.newArrayList();
    local8_life10 = moom.aU.values();
    local9_life11 = (local8_life10).length;
    local10_life12 = 0;
    init_cycle_19: while (true) {
    init_join_44: {
    init_join_43: {
    if (!((local10_life12 < local9_life11))) {
        break init_join_46;
    }
    local11_life13 = (local8_life10)[local10_life12];
    ((moom.sF)(receiver)).aH = ((moom.aU)(local11_life13));
    ((moom.sF)(receiver)).a(((moom.bs)(p2)));
    if (!((local6_life6 != 0))) {
        break init_join_44;
    }
    boolean __sourceSpill726_17 = ((moom.sF)(receiver)).b__Boolean();
    if (!((local6_life6 != 0))) {
        __initValue726_48_0 = __sourceSpill726_17;
        break init_join_48;
    }
    if (!(__sourceSpill726_17)) {
        break init_join_43;
    }
    ((java.util.List)(local7_life8)).add(((java.lang.Object)(local11_life13)));
    }
    local10_life12 += 1;
    }
    if (!((local6_life6 == 0))) { continue init_cycle_19; }
    break init_cycle_19;
    }
    }
    __initValue726_48_0 = ((java.util.List)(local7_life8)).isEmpty();
    }
    if (!((!__initValue726_48_0))) {
        break init_join_59;
    }
    ((moom.sF)(receiver)).aH = ((moom.aU)(((moom.aU)(((java.util.List)(local7_life8)).get(((int)(((java.util.Random)(((moom.sF)(receiver)).ah)).nextInt(((int)(((java.util.List)(local7_life8)).size()))))))))));
    }
    ((moom.sF)(receiver)).a(((moom.bs)(p2)));
    return;
}


public sF(net.minecraft.world.World p0) {
super(p0);
}


static {
moom.sF.cb = (moom._c.a(-7083611279797424490L, 9214821311968880792L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(74345976382249L);
}

private static native <E extends Throwable> void __sourceConstructorInit_e268db7ee0d7d079_0(moom.sF a0, net.minecraft.world.World a1, moom.DT a2) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_09b50dfa41b79550_0(moom.sF a0, net.minecraft.world.World a1, moom.DT a2, moom.bs a3) throws E;

public int b__sourceReturn_8abf5c6871() {
return ((moom.aU)(this.aH)).sizeY;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
moom.aU lexicalValue1297_43_0;
    moom.sF lexicalValue1297_48_0;
    int spill1297_0;
    moom.aU spill1297_1;
    moom.sF spill1297_2;
    long life2_3;
    java.lang.String life5_8;
    moom.aU[] life6_10;
    int life7_13;
    int life8_15;
    int life4_16;
    moom.aU life9_23;
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_43: {
    lexical_join_39: {
    life2_3 = (moom.sF.cb ^ 125155422695064L);
    spill1297_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life5_8 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("Motive")));
    life6_10 = moom.aU.values();
    life7_13 = (life6_10).length;
    life8_15 = 0;
    life4_16 = spill1297_0;
    lexical_cycle_17: while (true) {
    lexical_join_37: {
    lexical_join_36: {
    if (!((life8_15 < life7_13))) {
        break lexical_join_39;
    }
    life9_23 = (life6_10)[life8_15];
    if (!((life4_16 == 0))) {
        break lexical_join_37;
    }
    spill1297_1 = life9_23;
    if (!((life4_16 == 0))) {
        lexicalValue1297_43_0 = spill1297_1;
        break lexical_join_43;
    }
    if (!(((java.lang.String)(((moom.aU)(spill1297_1)).title)).equals(((java.lang.Object)(life5_8))))) {
        break lexical_join_36;
    }
    this.aH = ((moom.aU)(life9_23));
    }
    life8_15 += 1;
    }
    if (!((life4_16 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    spill1297_2 = this;
    if (!((life4_16 == 0))) {
        lexicalValue1297_48_0 = spill1297_2;
        break lexical_join_48;
    }
    lexicalValue1297_43_0 = ((moom.sF)(spill1297_2)).aH;
    }
    if (!((lexicalValue1297_43_0 == null))) {
        break lexical_join_47;
    }
    this.aH = ((moom.aU)(moom.aU.KEBAB));
    }
    lexicalValue1297_48_0 = this;
    }
    __sourceIntrinsic_01f4e1cd062e_call1297_10(lexicalValue1297_48_0, p0);
    return;
}


public void c(double p0, double p1, double p2, float p3, float p4) {
java.lang.Object local9 = ((moom.DT)(this.aF)).a(((double)((p0 - this.n))), ((double)((p1 - this.o))), ((double)((p2 - this.p))));
    ((moom.sF)(this)).a__Void(((double)(((double) ((moom.DT)(local9)).a()))), ((double)(((double) ((moom.DT)(local9)).b()))), ((double)(((double) ((moom.DT)(local9)).c()))));
    return;
}


public void f(net.minecraft.entity.Entity p0) {
int forwardValue3949_18_0;
    net.minecraft.entity.Entity forwardValue3949_20_0;
    boolean spill3949_0;
    net.minecraft.entity.Entity spill3949_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.player.EntityPlayer life5_30;
    forward_join_35: {
    forward_join_27: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (moom.sF.cb ^ 66005502116225L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill3949_0 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops")));
    if (!((life4_5 != 0))) {
        forwardValue3949_18_0 = ((spill3949_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill3949_0)) {
        break forward_join_35;
    }
    spill3949_1 = p0;
    if (!((life4_5 != 0))) {
        forwardValue3949_20_0 = spill3949_1;
        break forward_join_20;
    }
    forwardValue3949_18_0 = ((spill3949_1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((forwardValue3949_18_0 != 0))) {
        break forward_join_27;
    }
    forwardValue3949_20_0 = p0;
    }
    life5_30 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue3949_20_0));
    if (!(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(life5_30)).b1)).d)) {
        break forward_join_27;
    }
    return;
    }
    ((moom.sF)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.an))), ((float)(0x0.0p0f)));
    }
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Motive")), ((java.lang.String)(((moom.aU)(this.aH)).title)));
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    return;
}


public int a() {
return ((moom.aU)(this.aH)).sizeX;
}


public void a(double p0, double p1, double p2, float p3, float p4, int p5, boolean p6) {
java.lang.Object local11 = ((moom.DT)(this.aF)).a(((double)((p0 - this.n))), ((double)((p1 - this.o))), ((double)((p2 - this.p))));
    ((moom.sF)(this)).a__Void(((double)(((double) ((moom.DT)(local11)).a()))), ((double)(((double) ((moom.DT)(local11)).b()))), ((double)(((double) ((moom.DT)(local11)).c()))));
    return;
}


private static native <E extends Throwable> void __sourceIntrinsic_01f4e1cd062e_call1297_10(moom.sF a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
}
