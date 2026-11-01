package moom;


public class L2 {

private float a;

private float b;

private float c;

private float d;

private float e;

private float f;

private static long g;

public L2(int[] p0) { super(); }


private static void __sourceConstructorBody_47ad45d5231192ac(moom.L2 receiver, int[] p0) throws Throwable {

int __initValue555_73_0;

    int __initValue555_83_0;

    int __initValue555_93_0;

    int __initValue555_103_0;

    int __initValue555_115_0;

    moom.L2 __initValue555_117_0;

    long local2_life2;

    int[] local4_life18;

    int local5_life19;

    int local6_life20;

    int local7_life21;

    float local8_life23;

    float local9_life25;

    float local10_life27;

    init_join_122: {

    local2_life2 = (moom.L2.g ^ 79675303349538L);

    moom.L2.__sourceConstructorInit_47ad45d5231192ac_0(((moom.L2)(receiver)));

    ((moom.L2)(receiver)).a = ((float)(2139095039));

    ((moom.L2)(receiver)).b = ((float)(2139095039));

    ((moom.L2)(receiver)).c = ((float)(2139095039));

    ((moom.L2)(receiver)).d = ((float)(-8388609));

    int[] __sourceSpill555_15 = moom.LZ.b();

    ((moom.L2)(receiver)).e = ((float)(-8388609));

    ((moom.L2)(receiver)).f = ((float)(-8388609));

    local4_life18 = __sourceSpill555_15;

    local5_life19 = ((p0).length / 4);

    local6_life20 = 0;

    init_cycle_33: while (true) {

    init_join_119: {

    init_join_117: {

    init_join_115: {

    init_join_109: {

    init_join_103: {

    init_join_99: {

    init_join_93: {

    init_join_89: {

    init_join_83: {

    init_join_79: {

    init_join_73: {

    init_join_69: {

    if (!((local6_life20 < 4))) {

        break init_join_122;

    }

    local7_life21 = (local6_life20 * local5_life19);

    local8_life23 = java.lang.Float.intBitsToFloat(((int)((p0)[local7_life21])));

    local9_life25 = java.lang.Float.intBitsToFloat(((int)((p0)[(local7_life21 + 1)])));

    local10_life27 = java.lang.Float.intBitsToFloat(((int)((p0)[(local7_life21 + 2)])));

    int __sourceSpill555_30 = recovery.source.CarrierOps.fcmpl(((float)(((moom.L2)(receiver)).a)), ((float)(local8_life23)));

    if (!((local4_life18 != null))) {

        __initValue555_73_0 = __sourceSpill555_30;

        break init_join_73;

    }

    if (!((__sourceSpill555_30 > 0))) {

        break init_join_69;

    }

    ((moom.L2)(receiver)).a = ((float)(local8_life23));

    }

    __initValue555_73_0 = recovery.source.CarrierOps.fcmpl(((float)(((moom.L2)(receiver)).b)), ((float)(local9_life25)));

    }

    int __sourceSpill555_34 = __initValue555_73_0;

    if (!((local4_life18 != null))) {

        __initValue555_83_0 = __sourceSpill555_34;

        break init_join_83;

    }

    if (!((__sourceSpill555_34 > 0))) {

        break init_join_79;

    }

    ((moom.L2)(receiver)).b = ((float)(local9_life25));

    }

    __initValue555_83_0 = recovery.source.CarrierOps.fcmpl(((float)(((moom.L2)(receiver)).c)), ((float)(local10_life27)));

    }

    int __sourceSpill555_38 = __initValue555_83_0;

    if (!((local4_life18 != null))) {

        __initValue555_93_0 = __sourceSpill555_38;

        break init_join_93;

    }

    if (!((__sourceSpill555_38 > 0))) {

        break init_join_89;

    }

    ((moom.L2)(receiver)).c = ((float)(local10_life27));

    }

    __initValue555_93_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.L2)(receiver)).d)), ((float)(local8_life23)));

    }

    int __sourceSpill555_42 = __initValue555_93_0;

    if (!((local4_life18 != null))) {

        __initValue555_103_0 = __sourceSpill555_42;

        break init_join_103;

    }

    if (!((__sourceSpill555_42 < 0))) {

        break init_join_99;

    }

    ((moom.L2)(receiver)).d = ((float)(local8_life23));

    }

    __initValue555_103_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.L2)(receiver)).e)), ((float)(local9_life25)));

    }

    int __sourceSpill555_46 = __initValue555_103_0;

    if (!((local4_life18 != null))) {

        __initValue555_115_0 = __sourceSpill555_46;

        break init_join_115;

    }

    if (!((__sourceSpill555_46 < 0))) {

        break init_join_109;

    }

    ((moom.L2)(receiver)).e = ((float)(local9_life25));

    }

    moom.L2 __sourceSpill555_48 = receiver;

    if (!((local4_life18 != null))) {

        __initValue555_117_0 = __sourceSpill555_48;

        break init_join_117;

    }

    __initValue555_115_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.L2)(__sourceSpill555_48)).f)), ((float)(local10_life27)));

    }

    if (!((__initValue555_115_0 < 0))) {

        break init_join_119;

    }

    __initValue555_117_0 = receiver;

    }

    ((moom.L2)(__initValue555_117_0)).f = ((float)(local10_life27));

    }

    local6_life20 += 1;

    if (!((local4_life18 == null))) { continue init_cycle_33; }

    break init_cycle_33;

    }

    }

    return;

}



static {
moom.L2.g = (moom._c.a(-1301412998038038452L, -5580808101222478515L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(86664860768826L);
}

private static native <E extends Throwable> void __sourceConstructorInit_47ad45d5231192ac_0(moom.L2 a0) throws E;

public boolean b(moom.bs p0) {
int forestValue721_56_0;
    int forestValue721_66_0;
    int forestValue721_72_0;
    int forestValue721_78_0;
    int forestValue721_82_0;
    int forestValue721_84_0;
    int spill721_0;
    int spill721_1;
    long life2_3;
    int[] life4_5;
    float life5_15;
    float life6_18;
    float life7_21;
    float life8_24;
    forest_join_84: {
    forest_join_83: {
    forest_join_82: {
    forest_join_78: {
    forest_join_72: {
    forest_join_66: {
    forest_join_57: {
    forest_join_56: {
    forest_join_55: {
    forest_join_41: {
    forest_join_27: {
    forest_join_13: {
    life2_3 = (moom.L2.g ^ 41864511621501L);
    life4_5 = moom.LZ.b();
    spill721_0 = (moom.L3.a)[((moom.bs)(p0)).ordinal()];
    if (!((life4_5 != null))) {
        forestValue721_56_0 = spill721_0;
        break forest_join_56;
    }
    switch (spill721_0) {
case 1:
case 2:
{
        break forest_join_13;
    }
case 3:
case 4:
{
        break forest_join_27;
    }
case 5:
case 6:
{
        break forest_join_41;
    }
default:
{
        break forest_join_55;
    }
}
    }
    life5_15 = ((moom.L2)(this)).a();
    life6_18 = ((moom.L2)(this)).d();
    life7_21 = ((moom.L2)(this)).c();
    life8_24 = ((moom.L2)(this)).f();
    if (!((life4_5 == null))) {
        break forest_join_57;
    }
    }
    life5_15 = ((moom.L2)(this)).a();
    life6_18 = ((moom.L2)(this)).d();
    life7_21 = ((moom.L2)(this)).b();
    life8_24 = ((moom.L2)(this)).e();
    if (!((life4_5 == null))) {
        break forest_join_57;
    }
    }
    life5_15 = ((moom.L2)(this)).b();
    life6_18 = ((moom.L2)(this)).e();
    life7_21 = ((moom.L2)(this)).c();
    life8_24 = ((moom.L2)(this)).f();
    if (!((life4_5 == null))) {
        break forest_join_57;
    }
    }
    forestValue721_56_0 = 0;
    }
    return ((forestValue721_56_0) != 0);
    }
    spill721_1 = recovery.source.CarrierOps.fcmpl(((float)(life5_15)), ((float)(0x0.0p0f)));
    if (!((life4_5 != null))) {
        forestValue721_66_0 = spill721_1;
        break forest_join_66;
    }
    if (!((spill721_1 == 0))) {
        break forest_join_83;
    }
    forestValue721_66_0 = recovery.source.CarrierOps.fcmpl(((float)(life6_18)), ((float)(0x1.0p0f)));
    }
    if (!((life4_5 != null))) {
        forestValue721_72_0 = forestValue721_66_0;
        break forest_join_72;
    }
    if (!((forestValue721_66_0 == 0))) {
        break forest_join_83;
    }
    forestValue721_72_0 = recovery.source.CarrierOps.fcmpl(((float)(life7_21)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != null))) {
        forestValue721_78_0 = forestValue721_72_0;
        break forest_join_78;
    }
    if (!((forestValue721_72_0 == 0))) {
        break forest_join_83;
    }
    forestValue721_78_0 = recovery.source.CarrierOps.fcmpl(((float)(life8_24)), ((float)(0x1.0p0f)));
    }
    if (!((life4_5 != null))) {
        forestValue721_82_0 = forestValue721_78_0;
        break forest_join_82;
    }
    if (!((forestValue721_78_0 == 0))) {
        break forest_join_83;
    }
    forestValue721_82_0 = 1;
    }
    forestValue721_84_0 = forestValue721_82_0;
    break forest_join_84;
    }
    forestValue721_84_0 = 0;
    }
    return ((forestValue721_84_0) != 0);
}


public float b() {
return this.b;
}


public float e() {
return this.e;
}


public float c() {
return this.c;
}


public float f() {
return this.f;
}


public float d() {
return this.d;
}


public boolean a(moom.bs p0) {
int forestValue722_74_0;
    int forestValue722_84_0;
    int forestValue722_88_0;
    int forestValue722_90_0;
    int spill722_0;
    int spill722_1;
    long life2_3;
    int[] life4_5;
    float life5_15;
    float life6_18;
    float life7_20;
    forest_join_90: {
    forest_join_89: {
    forest_join_88: {
    forest_join_84: {
    forest_join_75: {
    forest_join_74: {
    forest_join_73: {
    forest_join_63: {
    forest_join_53: {
    forest_join_43: {
    forest_join_33: {
    forest_join_23: {
    forest_join_13: {
    life2_3 = (moom.L2.g ^ 77502958472411L);
    life4_5 = moom.LZ.b();
    spill722_0 = (moom.L3.a)[((moom.bs)(p0)).ordinal()];
    if (!((life4_5 != null))) {
        forestValue722_74_0 = spill722_0;
        break forest_join_74;
    }
    switch (spill722_0) {
case 1:
{
        break forest_join_13;
    }
case 2:
{
        break forest_join_23;
    }
case 3:
{
        break forest_join_33;
    }
case 4:
{
        break forest_join_43;
    }
case 5:
{
        break forest_join_53;
    }
case 6:
{
        break forest_join_63;
    }
default:
{
        break forest_join_73;
    }
}
    }
    life5_15 = ((moom.L2)(this)).b();
    life6_18 = ((moom.L2)(this)).e();
    life7_20 = 0x0.0p0f;
    if (!((life4_5 == null))) {
        break forest_join_75;
    }
    }
    life5_15 = ((moom.L2)(this)).b();
    life6_18 = ((moom.L2)(this)).e();
    life7_20 = 0x1.0p0f;
    if (!((life4_5 == null))) {
        break forest_join_75;
    }
    }
    life5_15 = ((moom.L2)(this)).c();
    life6_18 = ((moom.L2)(this)).f();
    life7_20 = 0x0.0p0f;
    if (!((life4_5 == null))) {
        break forest_join_75;
    }
    }
    life5_15 = ((moom.L2)(this)).c();
    life6_18 = ((moom.L2)(this)).f();
    life7_20 = 0x1.0p0f;
    if (!((life4_5 == null))) {
        break forest_join_75;
    }
    }
    life5_15 = ((moom.L2)(this)).a();
    life6_18 = ((moom.L2)(this)).d();
    life7_20 = 0x0.0p0f;
    if (!((life4_5 == null))) {
        break forest_join_75;
    }
    }
    life5_15 = ((moom.L2)(this)).a();
    life6_18 = ((moom.L2)(this)).d();
    life7_20 = 0x1.0p0f;
    if (!((life4_5 == null))) {
        break forest_join_75;
    }
    }
    forestValue722_74_0 = 0;
    }
    return ((forestValue722_74_0) != 0);
    }
    spill722_1 = recovery.source.CarrierOps.fcmpl(((float)(life5_15)), ((float)(life7_20)));
    if (!((life4_5 != null))) {
        forestValue722_84_0 = spill722_1;
        break forest_join_84;
    }
    if (!((spill722_1 == 0))) {
        break forest_join_89;
    }
    forestValue722_84_0 = recovery.source.CarrierOps.fcmpl(((float)(life6_18)), ((float)(life7_20)));
    }
    if (!((life4_5 != null))) {
        forestValue722_88_0 = forestValue722_84_0;
        break forest_join_88;
    }
    if (!((forestValue722_84_0 == 0))) {
        break forest_join_89;
    }
    forestValue722_88_0 = 1;
    }
    forestValue722_90_0 = forestValue722_88_0;
    break forest_join_90;
    }
    forestValue722_90_0 = 0;
    }
    return ((forestValue722_90_0) != 0);
}


public float a() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
