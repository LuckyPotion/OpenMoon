package com.moon;


public class gw {

private net.minecraft.entity.EntityLivingBase a;

private moom.DR b;

private moom.DR c;

private boolean d;

private static boolean e;

private static long f;

public gw(net.minecraft.entity.EntityLivingBase p0, moom.DR p1, moom.DR p2, boolean p3) { super(); __sourceHandlerCall_798fdce24d80c0e0cc34(this, p0, p1, p2, p3); }

private static native <E extends Throwable> void __sourceHandlerCall_798fdce24d80c0e0cc34(com.moon.gw a0, net.minecraft.entity.EntityLivingBase a1, moom.DR a2, moom.DR a3, boolean a4) throws E;
private static final class __SourceHandler_798fdce24d80c0e0cc34 {

public static void f63(com.moon.gw receiver, net.minecraft.entity.EntityLivingBase p0, moom.DR p1, moom.DR p2, boolean p3) throws Throwable {
    long local5_life1 = (__fieldRead63_0() ^ 80086693962876L);
    __directSuperInit63_2(receiver);
    boolean __sourceSpill63_5 = __call63_3();
    __fieldWrite63_4(receiver, p0);
    boolean local7_life6 = __sourceSpill63_5;
    __fieldWrite63_7(receiver, p1);
    __fieldWrite63_8(receiver, p2);
    __fieldWrite63_9(receiver, p3);
    if ((__call63_10() != null)) {
        __call63_11((local7_life6 ? 0 : 1));
    }
    return;
}
private static native long __fieldRead63_0();
private static native void __directSuperInit63_2(com.moon.gw a0);
private static native boolean __call63_3();
private static native void __fieldWrite63_4(com.moon.gw a0, net.minecraft.entity.EntityLivingBase a1);
private static native void __fieldWrite63_7(com.moon.gw a0, moom.DR a1);
private static native void __fieldWrite63_8(com.moon.gw a0, moom.DR a1);
private static native void __fieldWrite63_9(com.moon.gw a0, boolean a1);
private static native java.lang.String[] __call63_10();
private static native void __call63_11(int a0);

}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(8196113545655543692L)), ((long)(8963207898524070449L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(135742626458253L)))));
    if (com.moon.gw.c__Boolean()) {
        com.moon.gw.b(((boolean)(true)));
    }
}


public static void b(boolean p0) {
e = ((boolean)(p0));
    return;
}


public static boolean b__Boolean() {
return ((((com.moon.gw.e) ? 1 : 0)) != 0);
}


public moom.DR b() {
return this.b;
}


public static boolean c__Boolean() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.gw.b__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public moom.DR c() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.DR a() {
long life1_3;
    float life4_8;
    int life3_9;
    double life5_19;
    double life7_29;
    double life9_39;
    moom.DR life11_46;
    life1_3 = (com.moon.gw.f ^ 107626626137130L);
    boolean spill1150_0 = com.moon.gw.c__Boolean();
    life4_8 = ((moom.DM)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).l)).b;
    life3_9 = ((spill1150_0) ? 1 : 0);
    life5_19 = com.moon.nR.a(((double)(((net.minecraft.entity.EntityLivingBase)(this.a)).n)), ((double)(((net.minecraft.entity.EntityLivingBase)(this.a)).k)), ((double)(((double) life4_8))));
    life7_29 = com.moon.nR.a(((double)(((net.minecraft.entity.EntityLivingBase)(this.a)).o)), ((double)(((net.minecraft.entity.EntityLivingBase)(this.a)).l)), ((double)(((double) life4_8))));
    life9_39 = com.moon.nR.a(((double)(((net.minecraft.entity.EntityLivingBase)(this.a)).p)), ((double)(((net.minecraft.entity.EntityLivingBase)(this.a)).m)), ((double)(((double) life4_8))));
    life11_46 = new moom.DR(life5_19, life7_29, life9_39);
    moom.DR spill1150_1 = ((moom.DR)(life11_46)).d(((moom.DR)(this.b)));
    if ((life3_9 != 0)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return spill1150_1;
}


public boolean a__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


public net.minecraft.entity.EntityLivingBase a__sG() {
return this.a;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
