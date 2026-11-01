package moom;


public class v5 {

private static final java.io.PrintStream a;

private static boolean b;

private static final org.apache.logging.log4j.Logger c;

private static boolean d;

private static final long e;

public v5() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(273357585173763057L)), ((long)(-7099931992852995160L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(28777162436603L)))));
    a = ((java.io.PrintStream)(java.lang.System.out));
    int __sourceSpill2916_8 = 1;
    b = ((boolean)(false));
    c = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    moom.v5.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill2916_8))));
}


public static void b(boolean p0) {
moom.v5.d = ((boolean)(p0));
    return;
}


public static boolean b__Boolean() {
return ((((moom.v5.d) ? 1 : 0)) != 0);
}


public static void b() {
int forwardValue4263_16_0;
    boolean spill4263_0;
    long life0_3;
    int life2_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    forward_join_16: {
    life0_3 = (moom.v5.e ^ 93634141583964L);
    life2_5 = ((moom.v5.c__Boolean()) ? 1 : 0);
    spill4263_0 = moom.v5.b;
    if (!((life2_5 == 0))) {
        forwardValue4263_16_0 = ((spill4263_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill4263_0))) {
        break forward_join_23;
    }
    moom.v5.b = ((boolean)(true));
    if (!((life2_5 == 0))) {
        break forward_join_22;
    }
    forwardValue4263_16_0 = ((((org.apache.logging.log4j.Logger)(moom.v5.c)).isDebugEnabled()) ? 1 : 0);
    }
    if (!((forwardValue4263_16_0 != 0))) {
        break forward_join_18;
    }
    moom.v5.c();
    }
    net.minecraft.block.Block.b__Void();
    __sourceExactCall_05c4b9402f3742();
    net.minecraft.item.Item.a__Void();
    net.minecraft.stats.StatList.a();
    }
    moom.v5.a();
    }
    return;
}


private static void c() {
java.lang.System.setErr(((java.io.PrintStream)(new moom.E("STDERR", java.lang.System.err))));
    java.lang.System.setOut(((java.io.PrintStream)(new moom.E("STDOUT", moom.v5.a))));
    return;
}


public static boolean c__Boolean() {
int local0 = __sourceIntrinsic_booleanToInteger(moom.v5.b__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static void a(java.lang.String p0) {
((java.io.PrintStream)(moom.v5.a)).println(((java.lang.String)(p0)));
    return;
}


static void a() {
long life0_3;
    moom.rk life3_62;
    int life2_96;
    life0_3 = (moom.v5.e ^ 71582889193373L);
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.g)), ((java.lang.Object)(new moom.rf())));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.aP)), ((java.lang.Object)(new moom.rg())));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.aD)), ((java.lang.Object)(new moom.rh())));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.bz)), ((java.lang.Object)(new moom.ri())));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.bo)), ((java.lang.Object)(new moom.v6())));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.by)), ((java.lang.Object)(new moom.rr())));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.bQ)), ((java.lang.Object)(new moom.rs())));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.bA)), ((java.lang.Object)(new moom.rt())));
    boolean spill7663_0 = moom.v5.c__Boolean();
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.aE)), ((java.lang.Object)(new moom.ru())));
    life3_62 = new moom.rk();
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.ay)), ((java.lang.Object)(life3_62)));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.ax)), ((java.lang.Object)(life3_62)));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.aw)), ((java.lang.Object)(new moom.rl())));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.d)), ((java.lang.Object)(new moom.rm())));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.aW)), ((java.lang.Object)(new moom.rn())));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(__sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.W))))), ((java.lang.Object)(new moom.ro())));
    life2_96 = ((spill7663_0) ? 1 : 0);
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(net.minecraft.init.Items.bM)), ((java.lang.Object)(new moom.rp())));
    ((moom.DA)(moom.c2.T)).a(((java.lang.Object)(__sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aU))))), ((java.lang.Object)(new moom.rq())));
    if ((life2_96 != 0)) {
        __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public static boolean a__Boolean() {
return ((((moom.v5.b) ? 1 : 0)) != 0);
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native void __sourceExactCall_05c4b9402f3742();
private static native net.minecraft.item.Item __sourceExactCall_42e37b9acc15b0(net.minecraft.block.Block p0);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
