package moom;


public class wz implements net.minecraft.world.ILockableContainer {

private java.lang.String a;

private net.minecraft.world.ILockableContainer b;

private net.minecraft.world.ILockableContainer c;

private static long d;

public wz(java.lang.String p0, net.minecraft.world.ILockableContainer p1, net.minecraft.world.ILockableContainer p2) { super(); }


private static void __sourceConstructorBody_632700430eafbbdf(moom.wz receiver, java.lang.String p0, net.minecraft.world.ILockableContainer p1, net.minecraft.world.ILockableContainer p2) throws Throwable {

net.minecraft.world.ILockableContainer __initValue759_18_0;

    net.minecraft.world.ILockableContainer __initValue759_30_0;

    boolean __initValue759_44_0;

    net.minecraft.world.ILockableContainer __initValue759_46_0;

    long local4_life2;

    net.minecraft.entity.Entity[] local6_life6;

    init_join_49: {

    init_join_46: {

    init_join_44: {

    init_join_40: {

    init_join_30: {

    init_join_23: {

    init_join_18: {

    init_join_17: {

    local4_life2 = (moom.wz.d ^ 133323067277262L);

    net.minecraft.entity.Entity[] __sourceSpill759_4 = moom.v8.b__Arrayr3();

    moom.wz.__sourceConstructorInit_632700430eafbbdf_0(((moom.wz)(receiver)));

    local6_life6 = __sourceSpill759_4;

    ((moom.wz)(receiver)).a = ((java.lang.String)(p0));

    net.minecraft.world.ILockableContainer __sourceSpill759_8 = p1;

    if (!((local6_life6 == null))) {

        __initValue759_18_0 = __sourceSpill759_8;

        break init_join_18;

    }

    if (!((__sourceSpill759_8 == null))) {

        break init_join_17;

    }

    p1 = p2;

    }

    __initValue759_18_0 = p2;

    }

    net.minecraft.world.ILockableContainer __sourceSpill759_9 = __initValue759_18_0;

    if (!((local6_life6 == null))) {

        __initValue759_30_0 = __sourceSpill759_9;

        break init_join_30;

    }

    if (!((__sourceSpill759_9 == null))) {

        break init_join_23;

    }

    p2 = p1;

    }

    ((moom.wz)(receiver)).b = ((net.minecraft.world.ILockableContainer)(p1));

    ((moom.wz)(receiver)).c = ((net.minecraft.world.ILockableContainer)(p2));

    __initValue759_30_0 = p1;

    }

    boolean __sourceSpill759_13 = ((net.minecraft.world.ILockableContainer)(__initValue759_30_0)).d__Boolean();

    if (!((local6_life6 == null))) {

        __initValue759_44_0 = __sourceSpill759_13;

        break init_join_44;

    }

    if (!(__sourceSpill759_13)) {

        break init_join_40;

    }

    ((net.minecraft.world.ILockableContainer)(p2)).a(((moom.Eq)(((net.minecraft.world.ILockableContainer)(p1)).a__Eq())));

    if (!((local6_life6 != null))) {

        break init_join_49;

    }

    }

    net.minecraft.world.ILockableContainer __sourceSpill759_16 = p2;

    if (!((local6_life6 == null))) {

        __initValue759_46_0 = __sourceSpill759_16;

        break init_join_46;

    }

    __initValue759_44_0 = ((net.minecraft.world.ILockableContainer)(__sourceSpill759_16)).d__Boolean();

    }

    if (!(__initValue759_44_0)) {

        break init_join_49;

    }

    __initValue759_46_0 = p1;

    }

    ((net.minecraft.world.ILockableContainer)(__initValue759_46_0)).a(((moom.Eq)(((net.minecraft.world.ILockableContainer)(p2)).a__Eq())));

    }

    return;

}



static {
moom.wz.d = (moom._c.a(-1082766366931282416L, 3577448876419535621L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(91529461023683L);
}

private static native <E extends Throwable> void __sourceConstructorInit_632700430eafbbdf_0(moom.wz a0) throws E;

public void b(net.minecraft.entity.player.EntityPlayer p0) {
((net.minecraft.world.ILockableContainer)(this.b)).b(((net.minecraft.entity.player.EntityPlayer)(p0)));
    ((net.minecraft.world.ILockableContainer)(this.c)).b(((net.minecraft.entity.player.EntityPlayer)(p0)));
    return;
}


public net.minecraft.item.ItemStack b__xW(int p0) {
long local2 = (moom.wz.d ^ 67127382306092L);
    return ((p0 >= ((net.minecraft.world.ILockableContainer)(this.b)).b__Int()) ? ((net.minecraft.world.ILockableContainer)(this.c)).b__xW(((int)((p0 - ((net.minecraft.world.ILockableContainer)(this.b)).b__Int())))) : ((net.minecraft.world.ILockableContainer)(this.b)).b__xW(((int)(p0))));
}


public void b__Void() {
((net.minecraft.world.ILockableContainer)(this.b)).b__Void();
    ((net.minecraft.world.ILockableContainer)(this.c)).b__Void();
    return;
}


public int b__Int() {
return (((net.minecraft.world.ILockableContainer)(this.b)).b__Int() + ((net.minecraft.world.ILockableContainer)(this.c)).b__Int());
}


public boolean e__Boolean() {
int forwardValue4452_19_0;
    int forwardValue4452_21_0;
    boolean spill4452_0;
    boolean spill4452_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (moom.wz.d ^ 119661721368471L);
    life3_5 = moom.v8.b__Arrayr3();
    spill4452_0 = ((net.minecraft.world.ILockableContainer)(this.b)).e__Boolean();
    if (!((life3_5 == null))) {
        forwardValue4452_19_0 = ((spill4452_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill4452_0))) {
        break forward_join_18;
    }
    spill4452_1 = ((net.minecraft.world.ILockableContainer)(this.c)).e__Boolean();
    if (!((life3_5 == null))) {
        forwardValue4452_19_0 = ((spill4452_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill4452_1)) {
        break forward_join_20;
    }
    }
    forwardValue4452_19_0 = 1;
    }
    forwardValue4452_21_0 = forwardValue4452_19_0;
    break forward_join_21;
    }
    forwardValue4452_21_0 = 0;
    }
    return ((forwardValue4452_21_0) != 0);
}


public java.lang.String c__String() {
return ((net.minecraft.world.ILockableContainer)(this.b)).c__String();
}


public int c__Int() {
return ((net.minecraft.world.ILockableContainer)(this.b)).c__Int();
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
__sourceExactCall_05a83965f8ad5c(((net.minecraft.world.ILockableContainer)(this.b)), ((net.minecraft.entity.player.EntityPlayer)(p0)));
    __sourceExactCall_05a83965f8ad5c(((net.minecraft.world.ILockableContainer)(this.c)), ((net.minecraft.entity.player.EntityPlayer)(p0)));
    return;
}


public boolean d__Boolean() {
int forwardValue4451_19_0;
    int forwardValue4451_21_0;
    boolean spill4451_0;
    boolean spill4451_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (moom.wz.d ^ 71802584156480L);
    life3_5 = moom.v8.b__Arrayr3();
    spill4451_0 = ((net.minecraft.world.ILockableContainer)(this.b)).d__Boolean();
    if (!((life3_5 == null))) {
        forwardValue4451_19_0 = ((spill4451_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill4451_0))) {
        break forward_join_18;
    }
    spill4451_1 = ((net.minecraft.world.ILockableContainer)(this.c)).d__Boolean();
    if (!((life3_5 == null))) {
        forwardValue4451_19_0 = ((spill4451_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill4451_1)) {
        break forward_join_20;
    }
    }
    forwardValue4451_19_0 = 1;
    }
    forwardValue4451_21_0 = forwardValue4451_19_0;
    break forward_join_21;
    }
    forwardValue4451_21_0 = 0;
    }
    return ((forwardValue4451_21_0) != 0);
}


public int d__Int() {
return 0;
}


public void a__Void(int p0, int p1) {
return;
}


public void a(moom.Eq p0) {
((net.minecraft.world.ILockableContainer)(this.b)).a(((moom.Eq)(p0)));
    ((net.minecraft.world.ILockableContainer)(this.c)).a(((moom.Eq)(p0)));
    return;
}


public boolean a(net.minecraft.inventory.IInventory p0) {
net.minecraft.world.ILockableContainer forwardValue4448_15_0;
    net.minecraft.inventory.IInventory forwardValue4448_15_1;
    int forwardValue4448_19_0;
    net.minecraft.world.ILockableContainer spill4448_0;
    net.minecraft.inventory.IInventory spill4448_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.wz.d ^ 64286700472448L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4448_0 = this.b;
    spill4448_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue4448_15_0 = spill4448_0;
        forwardValue4448_15_1 = spill4448_1;
        break forward_join_15;
    }
    if (!((spill4448_0 != spill4448_1))) {
        break forward_join_16;
    }
    forwardValue4448_15_0 = this.c;
    forwardValue4448_15_1 = p0;
    }
    if (!((forwardValue4448_15_0 == forwardValue4448_15_1))) {
        break forward_join_18;
    }
    }
    forwardValue4448_19_0 = 1;
    break forward_join_19;
    }
    forwardValue4448_19_0 = 0;
    }
    return ((forwardValue4448_19_0) != 0);
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
return new moom.wc(p0, this, p1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.Eq a__Eq() {
return ((net.minecraft.world.ILockableContainer)(this.b)).a__Eq();
}


public void a__Void() {
((net.minecraft.world.ILockableContainer)(this.b)).a__Void();
    ((net.minecraft.world.ILockableContainer)(this.c)).a__Void();
    return;
}


public void a__Void(int p0, net.minecraft.item.ItemStack p1) {
long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_29: {
    forward_join_24: {
    forward_join_22: {
    life3_3 = (moom.wz.d ^ 132951812785239L);
    life5_5 = moom.v8.b__Arrayr3();
    if (!((life5_5 == null))) { break forward_join_22; }
    if (!((p0 >= ((net.minecraft.world.ILockableContainer)(this.b)).b__Int()))) { break forward_join_24; }
    ((net.minecraft.world.ILockableContainer)(this.c)).a__Void(((int)((p0 - ((net.minecraft.world.ILockableContainer)(this.b)).b__Int()))), ((net.minecraft.item.ItemStack)(p1)));
    }
    if (!((life5_5 != null))) { break forward_join_29; }
    }
    ((net.minecraft.world.ILockableContainer)(this.b)).a__Void(((int)(p0)), ((net.minecraft.item.ItemStack)(p1)));
    }
    return;
}


public net.minecraft.item.ItemStack a(int p0, int p1) {
long local3 = (moom.wz.d ^ 94226970307684L);
    return ((p0 >= ((net.minecraft.world.ILockableContainer)(this.b)).b__Int()) ? ((net.minecraft.world.ILockableContainer)(this.c)).a(((int)((p0 - ((net.minecraft.world.ILockableContainer)(this.b)).b__Int()))), ((int)(p1))) : ((net.minecraft.world.ILockableContainer)(this.b)).a(((int)(p0)), ((int)(p1))));
}


public net.minecraft.item.ItemStack a__xW(int p0) {
long local2 = (moom.wz.d ^ 13871583737943L);
    return ((p0 >= ((net.minecraft.world.ILockableContainer)(this.b)).b__Int()) ? ((net.minecraft.world.ILockableContainer)(this.c)).a__xW(((int)((p0 - ((net.minecraft.world.ILockableContainer)(this.b)).b__Int())))) : ((net.minecraft.world.ILockableContainer)(this.b)).a__xW(((int)(p0))));
}


public net.minecraft.util.IChatComponent a__C5() {
moom.CJ forwardValue4449_20_0;
    long life1_3;
    forward_join_20: {
    forward_join_13: {
    life1_3 = (moom.wz.d ^ 100278807111477L);
    if (!(((moom.wz)(this)).e__Boolean())) {
        break forward_join_13;
    }
    forwardValue4449_20_0 = new moom.CM(((moom.wz)(this)).a__String());
    break forward_join_20;
    }
    forwardValue4449_20_0 = new moom.CN(((moom.wz)(this)).a__String(), new java.lang.Object[0]);
    }
    return forwardValue4449_20_0;
}


public int a__sourceReturn_0f7a48eca2(int p0) {
return 0;
}


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
return ((1) != 0);
}


public java.lang.String a__String() {
int forwardValue4450_21_0;
    moom.wz forwardValue4450_27_0;
    java.lang.String forwardValue4450_28_0;
    boolean spill4450_0;
    moom.wz spill4450_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (moom.wz.d ^ 42491711240329L);
    life3_5 = moom.v8.b__Arrayr3();
    spill4450_0 = ((net.minecraft.world.ILockableContainer)(this.b)).e__Boolean();
    if (!((life3_5 == null))) {
        forwardValue4450_21_0 = ((spill4450_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill4450_0)) {
        break forward_join_16;
    }
    forwardValue4450_28_0 = ((net.minecraft.world.ILockableContainer)(this.b)).a__String();
    break forward_join_28;
    }
    spill4450_1 = this;
    if (!((life3_5 == null))) {
        forwardValue4450_27_0 = spill4450_1;
        break forward_join_27;
    }
    forwardValue4450_21_0 = ((((net.minecraft.world.ILockableContainer)(((moom.wz)(spill4450_1)).c)).e__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4450_21_0 != 0))) {
        break forward_join_26;
    }
    forwardValue4450_28_0 = ((net.minecraft.world.ILockableContainer)(this.c)).a__String();
    break forward_join_28;
    }
    forwardValue4450_27_0 = this;
    }
    forwardValue4450_28_0 = ((moom.wz)(forwardValue4450_27_0)).a;
    }
    return forwardValue4450_28_0;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue4447_17_0;
    int forwardValue4447_21_0;
    int forwardValue4447_23_0;
    boolean spill4447_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life2_3 = (moom.wz.d ^ 7233827704536L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4447_0 = ((net.minecraft.world.ILockableContainer)(this.b)).a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4447_17_0 = ((spill4447_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill4447_0)) {
        break forward_join_22;
    }
    forwardValue4447_17_0 = ((((net.minecraft.world.ILockableContainer)(this.c)).a(((net.minecraft.entity.player.EntityPlayer)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue4447_21_0 = forwardValue4447_17_0;
        break forward_join_21;
    }
    if (!((forwardValue4447_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue4447_21_0 = 1;
    }
    forwardValue4447_23_0 = forwardValue4447_21_0;
    break forward_join_23;
    }
    forwardValue4447_23_0 = 0;
    }
    return ((forwardValue4447_23_0) != 0);
}


private static native void __sourceExactCall_05a83965f8ad5c(net.minecraft.world.ILockableContainer p0, net.minecraft.entity.player.EntityPlayer p1);
}
