package moom;


public class jJ extends moom.jI {

private boolean m;

private moom.DT n;

private net.minecraft.entity.Entity o;

private static java.lang.String[] p;

private static final long r;

public jJ(net.minecraft.client.Minecraft p0, net.minecraft.client.network.NetHandlerPlayClient p1) {
super(p0, p1);
    this.m = false;
    this.n = null;
    this.o = null;
}


static {
r = ((long)(__sourceExactCall_93409fc8361486(((moom._a)(__sourceExactCall_41bab94bc4b1bd(((long)(-4919424460213350393L)), ((long)(-5422303557703847916L)), ((java.lang.Object)(__sourceExactCall_6c2f42b69bfbc0(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())))))))), ((long)(255289544194599L)))));
    if ((__sourceExactCall_7fb8207a1d9353() != null)) {
        __sourceExactCall_7be4daa030356d(((java.lang.String[])(new java.lang.String[2])));
    }
}


public static void b(java.lang.String[] p0) {
moom.jJ.p = ((java.lang.String[])(p0));
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static java.lang.String[] b__sourceReturn_44c5829186() {
return moom.jJ.p;
}


public boolean b(moom.DT p0, moom.bs p1) {
this.m = ((boolean)(true));
    this.n = ((moom.DT)(p0));
    int local3 = __sourceIntrinsic_booleanToInteger(super.b(((moom.DT)(p0)), ((moom.bs)(p1))));
    this.m = ((boolean)(false));
    return ((local3) != 0);
}


public boolean c(moom.DT p0, moom.bs p1) {
this.m = ((boolean)(true));
    this.n = ((moom.DT)(p0));
    int local3 = __sourceIntrinsic_booleanToInteger(super.c(((moom.DT)(p0)), ((moom.bs)(p1))));
    this.m = ((boolean)(false));
    return ((local3) != 0);
}


public net.minecraft.entity.Entity a__r3() {
return this.o;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.world.World p1, net.minecraft.item.ItemStack p2) {
this.m = ((boolean)(true));
    int local4 = __sourceIntrinsic_booleanToInteger(super.a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.world.World)(p1)), ((net.minecraft.item.ItemStack)(p2))));
    this.m = ((boolean)(false));
    return ((local4) != 0);
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.entity.Entity p1) {
this.o = ((net.minecraft.entity.Entity)(p1));
    return (__sourceIntrinsic_booleanComparison((super.a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.entity.Entity)(p1))))) != 0);
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.entity.Entity p1, net.minecraft.util.MovingObjectPosition p2) {
this.o = ((net.minecraft.entity.Entity)(p1));
    return (__sourceIntrinsic_booleanComparison((super.a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.entity.Entity)(p1)), ((net.minecraft.util.MovingObjectPosition)(p2))))) != 0);
}


public boolean a(net.minecraft.client.entity.EntityPlayerSP p0, net.minecraft.client.multiplayer.WorldClient p1, net.minecraft.item.ItemStack p2, moom.DT p3, moom.bs p4, moom.DR p5) {
long local7 = (moom.jJ.r ^ 31458093741977L);
    java.lang.String[] spill6766_0 = __sourceExactCall_7fb8207a1d9353();
    this.m = ((boolean)(true));
    java.lang.String[] local9 = spill6766_0;
    this.n = ((moom.DT)(p3));
    boolean local10 = super.a(((net.minecraft.client.entity.EntityPlayerSP)(p0)), ((net.minecraft.client.multiplayer.WorldClient)(p1)), ((net.minecraft.item.ItemStack)(p2)), ((moom.DT)(p3)), ((moom.bs)(p4)), ((moom.DR)(p5)));
    this.m = ((boolean)(false));
    boolean spill6766_1 = local10;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        __sourceExactCall_7be4daa030356d(((java.lang.String[])(new java.lang.String[5])));
    }
    return spill6766_1;
}


public moom.DT a__sourceReturn_f4db834595() {
return this.n;
}


public boolean j() {
return ((((this.m) ? 1 : 0)) != 0);
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native java.lang.String[] __sourceExactCall_7fb8207a1d9353();
private static native void __sourceExactCall_7be4daa030356d(java.lang.String[] p0);

private static native long __sourceExactCall_93409fc8361486(moom._a p0, long p1);
private static native moom._a __sourceExactCall_41bab94bc4b1bd(long p0, long p1, java.lang.Object p2);
private static native java.lang.Class __sourceExactCall_6c2f42b69bfbc0(java.lang.invoke.MethodHandles.Lookup p0);
}
