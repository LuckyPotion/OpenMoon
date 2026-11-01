package moom;


public abstract class Ci extends net.minecraft.tileentity.TileEntity implements net.minecraft.world.IInteractionObject, net.minecraft.world.ILockableContainer {

private moom.Eq l;

private static java.lang.String m;

private static final long B;

public Ci() {
super();
    this.l = moom.Eq.a;
}


static {
B = ((long)(__sourceExactCall_93409fc8361486(((moom._a)(__sourceExactCall_41bab94bc4b1bd(((long)(1401583075193880658L)), ((long)(-3077911431472737955L)), ((java.lang.Object)(__sourceExactCall_6c2f42b69bfbc0(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())))))))), ((long)(258527228102137L)))));
    if ((__sourceExactCall_50874028d35822() == null)) {
        __sourceExactCall_29a7eb14ca65eb(((java.lang.String)("q59RC")));
    }
}


public static void b(java.lang.String p0) {
moom.Ci.m = ((java.lang.String)(p0));
    return;
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
moom.Eq forwardValue1635_16_0;
    java.lang.String[] spill1635_0;
    moom.Eq spill1635_1;
    long life2_3;
    java.lang.String[] life4_8;
    forward_join_18: {
    forward_join_16: {
    life2_3 = (moom.Ci.B ^ 82273301780738L);
    spill1635_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill1635_0;
    spill1635_1 = this.l;
    if (!((life4_8 != null))) {
        forwardValue1635_16_0 = spill1635_1;
        break forward_join_16;
    }
    if (!((spill1635_1 != null))) {
        break forward_join_18;
    }
    forwardValue1635_16_0 = this.l;
    }
    ((moom.Eq)(forwardValue1635_16_0)).a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    }
    return;
}


public boolean d__Boolean() {
moom.Eq forwardValue1636_13_0;
    int forwardValue1636_18_0;
    int forwardValue1636_20_0;
    moom.Eq spill1636_0;
    boolean spill1636_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (moom.Ci.B ^ 127286372942040L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1636_0 = this.l;
    if (!((life3_5 != null))) {
        forwardValue1636_13_0 = spill1636_0;
        break forward_join_13;
    }
    if (!((spill1636_0 != null))) {
        break forward_join_19;
    }
    forwardValue1636_13_0 = this.l;
    }
    spill1636_1 = ((moom.Eq)(forwardValue1636_13_0)).a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue1636_18_0 = ((spill1636_1) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill1636_1))) {
        break forward_join_19;
    }
    forwardValue1636_18_0 = 1;
    }
    forwardValue1636_20_0 = forwardValue1636_18_0;
    break forward_join_20;
    }
    forwardValue1636_20_0 = 0;
    }
    return ((forwardValue1636_20_0) != 0);
}


public static java.lang.String d__sourceReturn_0e30dfc966() {
return moom.Ci.m;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.l = ((moom.Eq)(moom.Eq.a(((net.minecraft.nbt.NBTTagCompound)(p0)))));
    return;
}


public moom.Eq a__Eq() {
return this.l;
}


public void a(moom.Eq p0) {
this.l = ((moom.Eq)(p0));
    return;
}


public net.minecraft.util.IChatComponent a__C5() {
moom.CJ forwardValue1634_20_0;
    long life1_3;
    forward_join_20: {
    forward_join_13: {
    life1_3 = (moom.Ci.B ^ 116247687835309L);
    if (!(((moom.Ci)(this)).e__Boolean())) {
        break forward_join_13;
    }
    forwardValue1634_20_0 = new moom.CM(((moom.Ci)(this)).a__String());
    break forward_join_20;
    }
    forwardValue1634_20_0 = new moom.CN(((moom.Ci)(this)).a__String(), new java.lang.Object[0]);
    }
    return forwardValue1634_20_0;
}


private static native long __sourceExactCall_93409fc8361486(moom._a p0, long p1);
private static native moom._a __sourceExactCall_41bab94bc4b1bd(long p0, long p1, java.lang.Object p2);
private static native java.lang.Class __sourceExactCall_6c2f42b69bfbc0(java.lang.invoke.MethodHandles.Lookup p0);
private static native java.lang.String __sourceExactCall_50874028d35822();
private static native void __sourceExactCall_29a7eb14ca65eb(java.lang.String p0);
}
