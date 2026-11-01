package net.minecraft.client.audio;


public class SoundHandler implements net.minecraft.client.resources.IResourceManagerReloadListener, net.minecraft.util.ITickable {

private static org.apache.logging.log4j.Logger a;

private static com.google.gson.Gson b;

private static java.lang.reflect.ParameterizedType c;

public static net.minecraft.client.audio.SoundPoolEntry d;

private moom.Dz e;

private net.minecraft.client.audio.SoundManager f;

private moom.oR g;

private static java.lang.String h;

private static long i;

public SoundHandler(moom.oR p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.e = new moom.Dz();
    this.g = p0;
    this.f = new net.minecraft.client.audio.SoundManager(this, p1);
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-7727087285426055896L)), ((long)(1999189581345553881L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(50426328395724L)))));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    java.lang.Object __sourceSpill3157_11 = null;
    b = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(new com.google.gson.GsonBuilder())).registerTypeAdapter(((java.lang.reflect.Type)(moom.f5.class)), ((java.lang.Object)(new moom.f7()))))).create()));
    net.minecraft.client.audio.SoundHandler.b(((java.lang.String)(__sourceSpill3157_11)));
    c = ((java.lang.reflect.ParameterizedType)(new net.minecraft.client.audio.SoundHandler$1()));
    d = ((net.minecraft.client.audio.SoundPoolEntry)(new net.minecraft.client.audio.SoundPoolEntry(new moom.DD("meta:missing_sound"), 0x0.0p0d, 0x0.0p0d, false)));
}

private static native <E extends Throwable> java.util.Map __sourceHandlerCall_3cca13d4537f9d8c2c10(net.minecraft.client.audio.SoundHandler a0, java.io.InputStream a1) throws E;
private static final class __SourceHandler_3cca13d4537f9d8c2c10 {

public static java.util.Map f546(net.minecraft.client.audio.SoundHandler receiver, java.io.InputStream p0) throws Throwable {
    java.util.Map life2_8;
    life2_8 = __cast546_3(__call546_2(__fieldRead546_0(), new java.io.InputStreamReader(p0), __fieldRead546_1()));
    __call546_4(p0);
    return life2_8;
}
public static java.util.Map h546_0(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3054600_0(p1);
    throw life2_2;
}
private static native com.google.gson.Gson __fieldRead546_0() throws Throwable;
private static native java.lang.reflect.ParameterizedType __fieldRead546_1() throws Throwable;
private static native java.lang.Object __call546_2(com.google.gson.Gson a0, java.io.InputStreamReader a1, java.lang.reflect.ParameterizedType a2) throws Throwable;
private static native java.util.Map __cast546_3(java.lang.Object a0) throws Throwable;
private static native void __call546_4(java.io.InputStream a0) throws Throwable;
private static native void __call3054600_0(java.io.InputStream a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bc1654b2648c7a500343(net.minecraft.client.audio.SoundHandler a0, moom.DD a1, moom.f5 a2) throws E;
private static final class __SourceHandler_bc1654b2648c7a500343 {

public static void f100142(net.minecraft.client.audio.SoundHandler receiver, moom.DD p0, moom.f5 p1) throws Throwable {
    int forestValue100142_14_0;
    int forestValue100142_16_0;
    int forestValue100142_35_0;
    java.lang.String forestValue100142_85_0;
    java.lang.String forestValue100142_88_0;
    boolean spill100142_0;
    int spill100142_1;
    boolean spill100142_2;
    org.apache.logging.log4j.Logger spill100142_3;
    java.lang.String spill100142_4;
    java.lang.Object[] spill100142_5;
    java.lang.String spill100142_6;
    long life3_3;
    java.lang.String life5_5;
    int life6_17;
    net.minecraft.client.audio.SoundEventAccessorComposite life7_35;
    java.util.Iterator life8_67;
    moom.f6 life9_74;
    java.lang.String life10_77;
    moom.DD life11_82;
    java.lang.String life12_96;
    moom.DD life14_110;
    java.lang.Object life15_112;
    java.io.InputStream life15_118;
    java.lang.Object life13_139;
    forest_join_154: {
    forest_join_149: {
    forest_join_58: {
    forest_join_45: {
    forest_join_35: {
    forest_join_34: {
    forest_join_16: {
    forest_join_15: {
    forest_join_14: {
    life3_3 = (__fieldRead100142_0() ^ 1205802471239L);
    life5_5 = __call100142_1();
    spill100142_0 = __call100142_3(__fieldRead100142_2(receiver), p0);
    if (!((life5_5 == null))) {
        forestValue100142_14_0 = __integerCategory100142_4(spill100142_0);
        break forest_join_14;
    }
    if (!((!spill100142_0))) {
        break forest_join_15;
    }
    forestValue100142_14_0 = 1;
    }
    forestValue100142_16_0 = forestValue100142_14_0;
    break forest_join_16;
    }
    forestValue100142_16_0 = 0;
    }
    life6_17 = forestValue100142_16_0;
    spill100142_1 = life6_17;
    if (!((life5_5 == null))) {
        forestValue100142_35_0 = spill100142_1;
        break forest_join_35;
    }
    if (!((spill100142_1 == 0))) {
        break forest_join_34;
    }
    spill100142_2 = __call100142_5(p1);
    if (!((life5_5 == null))) {
        forestValue100142_35_0 = __integerCategory100142_6(spill100142_2);
        break forest_join_35;
    }
    if (!((!spill100142_2))) {
        break forest_join_34;
    }
    life7_35 = __cast100142_9(__call100142_8(__fieldRead100142_7(receiver), p0));
    if (!((life5_5 != null))) {
        break forest_join_58;
    }
    }
    forestValue100142_35_0 = life6_17;
    }
    if (!((forestValue100142_35_0 == 0))) {
        break forest_join_45;
    }
    spill100142_3 = __fieldRead100142_10();
    spill100142_4 = "Replaced sound event location {}";
    java.lang.Object[] __stackOp100142_11_0 = new java.lang.Object[1];
    spill100142_5 = __stackOp100142_11_0;
    (__stackOp100142_11_0)[0] = p0;
    __call100142_12(spill100142_3, spill100142_4, spill100142_5);
    }
    life7_35 = new net.minecraft.client.audio.SoundEventAccessorComposite(p0, 0x1.0p0d, 0x1.0p0d, __call100142_13(p1));
    __call100142_15(__fieldRead100142_14(receiver), life7_35);
    }
    life8_67 = __call100142_17(__call100142_16(p1));
    forest_cycle_62: while (true) {
    forest_join_143: {
    forest_join_133: {
    forest_join_95: {
    forest_join_88: {
    forest_join_86: {
    forest_join_85: {
    if (!(__call100142_18(life8_67))) {
        break forest_join_154;
    }
    life9_74 = __cast100142_20(__call100142_19(life8_67));
    life10_77 = __call100142_21(life9_74);
    life11_82 = new moom.DD(life10_77);
    spill100142_6 = life10_77;
    if (!((life5_5 == null))) {
        forestValue100142_85_0 = spill100142_6;
        break forest_join_85;
    }
    if (!(__call100142_22(spill100142_6, ":"))) {
        break forest_join_86;
    }
    forestValue100142_85_0 = __call100142_23(life11_82);
    }
    forestValue100142_88_0 = forestValue100142_85_0;
    break forest_join_88;
    }
    forestValue100142_88_0 = __call100142_24(p0);
    }
    life12_96 = forestValue100142_88_0;
    switch ((__fieldRead100142_25())[__call100142_27(__call100142_26(life9_74))]) {
case 1:
{
        break forest_join_95;
    }
case 2:
{
        break forest_join_133;
    }
default:
{
        break forest_join_149;
    }
}
    }
    life14_110 = new moom.DD(life12_96, __invokedynamic100142_29(__call100142_28(life11_82)));
    life15_112 = null;
    life15_118 = __call100142_32(__call100142_31(__fieldRead100142_30(receiver), life14_110));
    __call100142_33(life15_118);
    life13_139 = new net.minecraft.client.audio.SoundEventAccessor(new net.minecraft.client.audio.SoundPoolEntry(life14_110, ((double) __call100142_34(life9_74)), ((double) __call100142_35(life9_74)), __call100142_36(life9_74)), __call100142_37(life9_74));
    if (!((life5_5 != null))) {
        break forest_join_143;
    }
    }
    life13_139 = new net.minecraft.client.audio.SoundHandler$2(receiver, life12_96, life9_74);
    if (!((life5_5 != null))) {
        break forest_join_143;
    }
    break forest_join_149;
    }
    __call100142_38(life7_35, life13_139);
    if (!((life5_5 != null))) {
        continue forest_cycle_62;
    }
    break forest_cycle_62;
    }
    break forest_join_154;
    }
    throw new java.lang.IllegalStateException("IN YOU FACE");
    }
    return;
}
public static void h100142_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13014200_0(p0);
}
public static void h100142_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13014201_0(p0);
}
public static void h100142_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13014202_0(p0);
}
public static void h100142_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13014203_0(p0);
}
public static void h100142_4(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13014204_0(p0);
}
public static void h100142_5(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13014205_0(p0);
}
public static void h100142_6(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13014206_0(p0);
}
public static void h100142_7(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13014207_0(p0);
}
public static void h100142_8(java.io.FileNotFoundException p0, net.minecraft.client.audio.SoundHandler p1, moom.DD p2, java.lang.String p3, net.minecraft.client.audio.SoundEventAccessorComposite p4, java.util.Iterator p5, moom.DD p6, java.io.InputStream p7) throws Throwable {
    java.lang.String forestValue13014208_40_0;
    java.lang.String forestValue13014208_43_0;
    org.apache.logging.log4j.Logger spill13014208_0;
    java.lang.String spill13014208_1;
    java.lang.Object[] spill13014208_2;
    java.lang.Object[] spill13014208_3;
    java.lang.String spill13014208_4;
    java.io.FileNotFoundException life13_2;
    moom.f6 life8_25;
    java.lang.String life9_28;
    moom.DD life10_33;
    java.lang.String life11_47;
    moom.DD life6_61;
    java.lang.Object life7_63;
    java.io.InputStream life7_69;
    java.lang.Object life12_90;
    forest_join_109: {
    forest_join_104: {
    life13_2 = p0;
    spill13014208_0 = __fieldRead13014208_0();
    spill13014208_1 = "File {} does not exist, cannot add it to event {}";
    java.lang.Object[] __stackOp13014208_1_0 = new java.lang.Object[2];
    spill13014208_2 = __stackOp13014208_1_0;
    (__stackOp13014208_1_0)[0] = p6;
    java.lang.Object[] __stackOp13014208_2_0 = spill13014208_2;
    spill13014208_3 = __stackOp13014208_2_0;
    (__stackOp13014208_2_0)[1] = p2;
    __call13014208_3(spill13014208_0, spill13014208_1, spill13014208_3);
    __call13014208_4(p7);
    forest_cycle_17: while (true) {
    forest_join_98: {
    forest_join_88: {
    forest_join_50: {
    forest_join_43: {
    forest_join_41: {
    forest_join_40: {
    if (!(__call13014208_5(p5))) {
        break forest_join_109;
    }
    life8_25 = __cast13014208_7(__call13014208_6(p5));
    life9_28 = __call13014208_8(life8_25);
    life10_33 = new moom.DD(life9_28);
    spill13014208_4 = life9_28;
    if (!((p3 == null))) {
        forestValue13014208_40_0 = spill13014208_4;
        break forest_join_40;
    }
    if (!(__call13014208_9(spill13014208_4, ":"))) {
        break forest_join_41;
    }
    forestValue13014208_40_0 = __call13014208_10(life10_33);
    }
    forestValue13014208_43_0 = forestValue13014208_40_0;
    break forest_join_43;
    }
    forestValue13014208_43_0 = __call13014208_11(p2);
    }
    life11_47 = forestValue13014208_43_0;
    switch ((__fieldRead13014208_12())[__call13014208_14(__call13014208_13(life8_25))]) {
case 1:
{
        break forest_join_50;
    }
case 2:
{
        break forest_join_88;
    }
default:
{
        break forest_join_104;
    }
}
    }
    life6_61 = new moom.DD(life11_47, __invokedynamic13014208_16(__call13014208_15(life10_33)));
    life7_63 = null;
    life7_69 = __call13014208_19(__call13014208_18(__fieldRead13014208_17(p1), life6_61));
    __call13014208_20(life7_69);
    life12_90 = new net.minecraft.client.audio.SoundEventAccessor(new net.minecraft.client.audio.SoundPoolEntry(life6_61, ((double) __call13014208_21(life8_25)), ((double) __call13014208_22(life8_25)), __call13014208_23(life8_25)), __call13014208_24(life8_25));
    if (!((p3 != null))) {
        break forest_join_98;
    }
    }
    life12_90 = new net.minecraft.client.audio.SoundHandler$2(p1, life11_47, life8_25);
    if (!((p3 != null))) {
        break forest_join_98;
    }
    break forest_join_104;
    }
    __call13014208_25(p4, life12_90);
    if (!((p3 != null))) {
        continue forest_cycle_17;
    }
    break forest_cycle_17;
    }
    break forest_join_109;
    }
    throw new java.lang.IllegalStateException("IN YOU FACE");
    }
    return;
}
public static void h100142_9(java.io.IOException p0, net.minecraft.client.audio.SoundHandler p1, moom.DD p2, java.lang.String p3, net.minecraft.client.audio.SoundEventAccessorComposite p4, java.util.Iterator p5, moom.DD p6, java.io.InputStream p7) throws Throwable {
    java.lang.String forestValue13014209_33_0;
    java.lang.String forestValue13014209_36_0;
    java.lang.String spill13014209_0;
    java.io.IOException life13_2;
    moom.f6 life8_18;
    java.lang.String life9_21;
    moom.DD life10_26;
    java.lang.String life11_40;
    moom.DD life6_54;
    java.lang.Object life7_56;
    java.io.InputStream life7_62;
    java.lang.Object life12_83;
    forest_join_102: {
    forest_join_97: {
    life13_2 = p0;
    __call13014209_2(__fieldRead13014209_0(), __invokedynamic13014209_1(p6, p2), life13_2);
    __call13014209_3(p7);
    forest_cycle_10: while (true) {
    forest_join_91: {
    forest_join_81: {
    forest_join_43: {
    forest_join_36: {
    forest_join_34: {
    forest_join_33: {
    if (!(__call13014209_4(p5))) {
        break forest_join_102;
    }
    life8_18 = __cast13014209_6(__call13014209_5(p5));
    life9_21 = __call13014209_7(life8_18);
    life10_26 = new moom.DD(life9_21);
    spill13014209_0 = life9_21;
    if (!((p3 == null))) {
        forestValue13014209_33_0 = spill13014209_0;
        break forest_join_33;
    }
    if (!(__call13014209_8(spill13014209_0, ":"))) {
        break forest_join_34;
    }
    forestValue13014209_33_0 = __call13014209_9(life10_26);
    }
    forestValue13014209_36_0 = forestValue13014209_33_0;
    break forest_join_36;
    }
    forestValue13014209_36_0 = __call13014209_10(p2);
    }
    life11_40 = forestValue13014209_36_0;
    switch ((__fieldRead13014209_11())[__call13014209_13(__call13014209_12(life8_18))]) {
case 1:
{
        break forest_join_43;
    }
case 2:
{
        break forest_join_81;
    }
default:
{
        break forest_join_97;
    }
}
    }
    life6_54 = new moom.DD(life11_40, __invokedynamic13014209_15(__call13014209_14(life10_26)));
    life7_56 = null;
    life7_62 = __call13014209_18(__call13014209_17(__fieldRead13014209_16(p1), life6_54));
    __call13014209_19(life7_62);
    life12_83 = new net.minecraft.client.audio.SoundEventAccessor(new net.minecraft.client.audio.SoundPoolEntry(life6_54, ((double) __call13014209_20(life8_18)), ((double) __call13014209_21(life8_18)), __call13014209_22(life8_18)), __call13014209_23(life8_18));
    if (!((p3 != null))) {
        break forest_join_91;
    }
    }
    life12_83 = new net.minecraft.client.audio.SoundHandler$2(p1, life11_40, life8_18);
    if (!((p3 != null))) {
        break forest_join_91;
    }
    break forest_join_97;
    }
    __call13014209_24(p4, life12_83);
    if (!((p3 != null))) {
        continue forest_cycle_10;
    }
    break forest_cycle_10;
    }
    break forest_join_102;
    }
    throw new java.lang.IllegalStateException("IN YOU FACE");
    }
    return;
}
public static void h100142_10(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call13014210_0(p1);
    throw life2_2;
}
public static void h100142_11(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13014211_0(p0);
}
private static native long __fieldRead100142_0() throws Throwable;
private static native java.lang.String __call100142_1() throws Throwable;
private static native moom.Dz __fieldRead100142_2(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native boolean __call100142_3(moom.Dz a0, moom.DD a1) throws Throwable;
private static native int __integerCategory100142_4(boolean value) throws Throwable;
private static native boolean __call100142_5(moom.f5 a0) throws Throwable;
private static native int __integerCategory100142_6(boolean value) throws Throwable;
private static native moom.Dz __fieldRead100142_7(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native java.lang.Object __call100142_8(moom.Dz a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.audio.SoundEventAccessorComposite __cast100142_9(java.lang.Object a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead100142_10() throws Throwable;
private static native void __call100142_12(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.client.audio.SoundCategory __call100142_13(moom.f5 a0) throws Throwable;
private static native moom.Dz __fieldRead100142_14(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native void __call100142_15(moom.Dz a0, net.minecraft.client.audio.SoundEventAccessorComposite a1) throws Throwable;
private static native java.util.List __call100142_16(moom.f5 a0) throws Throwable;
private static native java.util.Iterator __call100142_17(java.util.List a0) throws Throwable;
private static native boolean __call100142_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100142_19(java.util.Iterator a0) throws Throwable;
private static native moom.f6 __cast100142_20(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call100142_21(moom.f6 a0) throws Throwable;
private static native boolean __call100142_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call100142_23(moom.DD a0) throws Throwable;
private static native java.lang.String __call100142_24(moom.DD a0) throws Throwable;
private static native int[] __fieldRead100142_25() throws Throwable;
private static native net.minecraft.client.audio.SoundList$SoundEntry$Type __call100142_26(moom.f6 a0) throws Throwable;
private static native int __call100142_27(net.minecraft.client.audio.SoundList$SoundEntry$Type a0) throws Throwable;
private static native java.lang.String __call100142_28(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic100142_29(java.lang.String a0) throws Throwable;
private static native moom.oR __fieldRead100142_30(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call100142_31(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call100142_32(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native void __call100142_33(java.io.InputStream a0) throws Throwable;
private static native float __call100142_34(moom.f6 a0) throws Throwable;
private static native float __call100142_35(moom.f6 a0) throws Throwable;
private static native boolean __call100142_36(moom.f6 a0) throws Throwable;
private static native int __call100142_37(moom.f6 a0) throws Throwable;
private static native void __call100142_38(net.minecraft.client.audio.SoundEventAccessorComposite a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Exception __call13014200_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13014201_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13014202_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13014203_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13014204_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13014205_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13014206_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13014207_0(java.io.FileNotFoundException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13014208_0() throws Throwable;
private static native void __call13014208_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call13014208_4(java.io.InputStream a0) throws Throwable;
private static native boolean __call13014208_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13014208_6(java.util.Iterator a0) throws Throwable;
private static native moom.f6 __cast13014208_7(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call13014208_8(moom.f6 a0) throws Throwable;
private static native boolean __call13014208_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call13014208_10(moom.DD a0) throws Throwable;
private static native java.lang.String __call13014208_11(moom.DD a0) throws Throwable;
private static native int[] __fieldRead13014208_12() throws Throwable;
private static native net.minecraft.client.audio.SoundList$SoundEntry$Type __call13014208_13(moom.f6 a0) throws Throwable;
private static native int __call13014208_14(net.minecraft.client.audio.SoundList$SoundEntry$Type a0) throws Throwable;
private static native java.lang.String __call13014208_15(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic13014208_16(java.lang.String a0) throws Throwable;
private static native moom.oR __fieldRead13014208_17(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call13014208_18(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call13014208_19(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native void __call13014208_20(java.io.InputStream a0) throws Throwable;
private static native float __call13014208_21(moom.f6 a0) throws Throwable;
private static native float __call13014208_22(moom.f6 a0) throws Throwable;
private static native boolean __call13014208_23(moom.f6 a0) throws Throwable;
private static native int __call13014208_24(moom.f6 a0) throws Throwable;
private static native void __call13014208_25(net.minecraft.client.audio.SoundEventAccessorComposite a0, java.lang.Object a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13014209_0() throws Throwable;
private static native java.lang.String __invokedynamic13014209_1(moom.DD a0, moom.DD a1) throws Throwable;
private static native void __call13014209_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native void __call13014209_3(java.io.InputStream a0) throws Throwable;
private static native boolean __call13014209_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13014209_5(java.util.Iterator a0) throws Throwable;
private static native moom.f6 __cast13014209_6(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call13014209_7(moom.f6 a0) throws Throwable;
private static native boolean __call13014209_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call13014209_9(moom.DD a0) throws Throwable;
private static native java.lang.String __call13014209_10(moom.DD a0) throws Throwable;
private static native int[] __fieldRead13014209_11() throws Throwable;
private static native net.minecraft.client.audio.SoundList$SoundEntry$Type __call13014209_12(moom.f6 a0) throws Throwable;
private static native int __call13014209_13(net.minecraft.client.audio.SoundList$SoundEntry$Type a0) throws Throwable;
private static native java.lang.String __call13014209_14(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic13014209_15(java.lang.String a0) throws Throwable;
private static native moom.oR __fieldRead13014209_16(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call13014209_17(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call13014209_18(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native void __call13014209_19(java.io.InputStream a0) throws Throwable;
private static native float __call13014209_20(moom.f6 a0) throws Throwable;
private static native float __call13014209_21(moom.f6 a0) throws Throwable;
private static native boolean __call13014209_22(moom.f6 a0) throws Throwable;
private static native int __call13014209_23(moom.f6 a0) throws Throwable;
private static native void __call13014209_24(net.minecraft.client.audio.SoundEventAccessorComposite a0, java.lang.Object a1) throws Throwable;
private static native void __call13014210_0(java.io.InputStream a0) throws Throwable;
private static native java.lang.Exception __call13014211_0(java.io.FileNotFoundException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2e3ee015e98073f53d18(net.minecraft.client.audio.SoundHandler a0, net.minecraft.client.audio.SoundCategory a1, float a2) throws E;
private static final class __SourceHandler_2e3ee015e98073f53d18 {

public static void f2191(net.minecraft.client.audio.SoundHandler receiver, net.minecraft.client.audio.SoundCategory p0, float p1) throws Throwable {
    long life3_3;
    java.lang.String life5_5;
    life3_3 = (__fieldRead2191_0() ^ 97551709865641L);
    life5_5 = __call2191_1();
    if ((life5_5 == null)) {
        if ((p0 == __fieldRead2191_2())) {
        if ((p1 <= 0x0.0p0f)) {
        __call2191_3(receiver);
    }
    }
        __call2191_5(__fieldRead2191_4(receiver), p0, p1);
    }
    return;
}
public static void h2191_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1219100_0(p0);
}
public static void h2191_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1219101_0(p0);
}
public static void h2191_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1219102_0(p0);
}
private static native long __fieldRead2191_0() throws Throwable;
private static native java.lang.String __call2191_1() throws Throwable;
private static native net.minecraft.client.audio.SoundCategory __fieldRead2191_2() throws Throwable;
private static native void __call2191_3(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native net.minecraft.client.audio.SoundManager __fieldRead2191_4(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native void __call2191_5(net.minecraft.client.audio.SoundManager a0, net.minecraft.client.audio.SoundCategory a1, float a2) throws Throwable;
private static native java.lang.Exception __call1219100_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1219101_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1219102_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.audio.SoundEventAccessorComposite __sourceHandlerCall_b7bd27cd24004516fdbc(net.minecraft.client.audio.SoundHandler a0, net.minecraft.client.audio.SoundCategory[] a1) throws E;
private static final class __SourceHandler_b7bd27cd24004516fdbc {

public static net.minecraft.client.audio.SoundEventAccessorComposite f195(net.minecraft.client.audio.SoundHandler receiver, net.minecraft.client.audio.SoundCategory[] p0) throws Throwable {
    int lexicalValue195_38_0;
    int lexicalValue195_45_0;
    java.lang.Object lexicalValue195_56_0;
    java.lang.String spill195_0;
    boolean spill195_1;
    java.util.ArrayList spill195_2;
    long life2_3;
    java.util.ArrayList life5_6;
    java.lang.String life4_7;
    java.util.Iterator life6_12;
    moom.DD life7_19;
    net.minecraft.client.audio.SoundEventAccessorComposite life8_25;
    lexical_join_56: {
    lexical_join_48: {
    lexical_join_45: {
    lexical_join_41: {
    life2_3 = (__fieldRead195_0() ^ 55851983284265L);
    spill195_0 = __call195_1();
    life5_6 = __call195_2();
    life4_7 = spill195_0;
    life6_12 = __call195_5(__call195_4(__fieldRead195_3(receiver)));
    lexical_cycle_13: while (true) {
    lexical_join_39: {
    lexical_join_38: {
    if (!(__call195_6(life6_12))) {
        break lexical_join_41;
    }
    life7_19 = __cast195_8(__call195_7(life6_12));
    life8_25 = __cast195_11(__call195_10(__fieldRead195_9(receiver), life7_19));
    spill195_1 = __call195_13(p0, __call195_12(life8_25));
    if (!((life4_7 == null))) {
        lexicalValue195_45_0 = __integerCategory195_14(spill195_1);
        break lexical_join_45;
    }
    if (!((life4_7 == null))) {
        lexicalValue195_38_0 = __integerCategory195_15(spill195_1);
        break lexical_join_38;
    }
    if (!(spill195_1)) {
        break lexical_join_39;
    }
    lexicalValue195_38_0 = __integerCategory195_17(__call195_16(life5_6, life8_25));
    }
    __discardScalar195_18(lexicalValue195_38_0);
    }
    if (!((life4_7 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    spill195_2 = life5_6;
    if (!((life4_7 == null))) {
        lexicalValue195_56_0 = spill195_2;
        break lexical_join_56;
    }
    lexicalValue195_45_0 = __integerCategory195_20(__call195_19(spill195_2));
    }
    if (!((lexicalValue195_45_0 != 0))) {
        break lexical_join_48;
    }
    return null;
    }
    lexicalValue195_56_0 = __call195_23(life5_6, __call195_22(new java.util.Random(), __call195_21(life5_6)));
    }
    return __cast195_24(lexicalValue195_56_0);
}
public static void h195_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019500_0(p0);
}
public static void h195_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019501_0(p0);
}
public static void h195_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019502_0(p0);
}
public static void h195_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019503_0(p0);
}
public static void h195_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019504_0(p0);
}
private static native long __fieldRead195_0() throws Throwable;
private static native java.lang.String __call195_1() throws Throwable;
private static native java.util.ArrayList __call195_2() throws Throwable;
private static native moom.Dz __fieldRead195_3(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native java.util.Set __call195_4(moom.Dz a0) throws Throwable;
private static native java.util.Iterator __call195_5(java.util.Set a0) throws Throwable;
private static native boolean __call195_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call195_7(java.util.Iterator a0) throws Throwable;
private static native moom.DD __cast195_8(java.lang.Object a0) throws Throwable;
private static native moom.Dz __fieldRead195_9(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native java.lang.Object __call195_10(moom.Dz a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.audio.SoundEventAccessorComposite __cast195_11(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.audio.SoundCategory __call195_12(net.minecraft.client.audio.SoundEventAccessorComposite a0) throws Throwable;
private static native boolean __call195_13(net.minecraft.client.audio.SoundCategory[] a0, net.minecraft.client.audio.SoundCategory a1) throws Throwable;
private static native int __integerCategory195_14(boolean value) throws Throwable;
private static native int __integerCategory195_15(boolean value) throws Throwable;
private static native boolean __call195_16(java.util.ArrayList a0, net.minecraft.client.audio.SoundEventAccessorComposite a1) throws Throwable;
private static native int __integerCategory195_17(boolean value) throws Throwable;
private static native void __discardScalar195_18(int a0) throws Throwable;
private static native boolean __call195_19(java.util.ArrayList a0) throws Throwable;
private static native int __integerCategory195_20(boolean value) throws Throwable;
private static native int __call195_21(java.util.ArrayList a0) throws Throwable;
private static native int __call195_22(java.util.Random a0, int a1) throws Throwable;
private static native java.lang.Object __call195_23(java.util.ArrayList a0, int a1) throws Throwable;
private static native net.minecraft.client.audio.SoundEventAccessorComposite __cast195_24(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1019500_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019501_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019502_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019503_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019504_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_518ff5ba9f819275d1c0(net.minecraft.client.audio.SoundHandler a0, moom.oR a1) throws E;
private static final class __SourceHandler_518ff5ba9f819275d1c0 {

public static void f972(net.minecraft.client.audio.SoundHandler receiver, moom.oR p0) throws Throwable {
    java.util.Iterator forestValue972_17_0;
    java.lang.String spill972_0;
    java.util.Iterator spill972_1;
    long life2_3;
    java.lang.String life4_11;
    java.util.Iterator life5_15;
    java.lang.String life6_25;
    java.util.Iterator life7_34;
    net.minecraft.client.resources.IResource life8_43;
    java.util.Map life9_48;
    java.util.Iterator life10_55;
    java.util.Map.Entry life11_64;
    forest_join_77: {
    life2_3 = (__fieldRead972_0() ^ 101299157408935L);
    __call972_2(__fieldRead972_1(receiver));
    spill972_0 = __call972_3();
    __call972_5(__fieldRead972_4(receiver));
    life4_11 = spill972_0;
    life5_15 = __call972_7(__call972_6(p0));
    forest_cycle_16: while (true) {
    forest_join_75: {
    forestValue972_17_0 = life5_15;
    forest_cycle_17: while (true) {
    if (!(__call972_8(forestValue972_17_0))) {
        break forest_join_77;
    }
    life6_25 = __cast972_10(__call972_9(life5_15));
    life7_34 = __call972_12(__call972_11(p0, new moom.DD(life6_25, "sounds.json")));
    forest_cycle_32: while (true) {
    forest_join_73: {
    if (!(__call972_13(life7_34))) {
        break forest_join_75;
    }
    life8_43 = __cast972_15(__call972_14(life7_34));
    life9_48 = __call972_17(receiver, __call972_16(life8_43));
    spill972_1 = __call972_19(__call972_18(life9_48));
    if (!((life4_11 == null))) {
        forestValue972_17_0 = spill972_1;
        continue forest_cycle_17;
    }
    life10_55 = spill972_1;
    forest_cycle_50: while (true) {
    if (!(__call972_20(life10_55))) {
        break forest_join_73;
    }
    life11_64 = __cast972_22(__call972_21(life10_55));
    __call972_27(receiver, new moom.DD(life6_25, __cast972_24(__call972_23(life11_64))), __cast972_26(__call972_25(life11_64)));
    if (!((life4_11 == null))) {
        break forest_join_73;
    }
    if (!((life4_11 != null))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    }
    if (!((life4_11 != null))) {
        continue forest_cycle_32;
    }
    break forest_cycle_32;
    }
    break forest_cycle_17;
    }
    }
    if (!((life4_11 != null))) {
        continue forest_cycle_16;
    }
    break forest_cycle_16;
    }
    }
    return;
}
public static void h972_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097200_0(p0);
}
public static void h972_1(java.lang.RuntimeException p0, net.minecraft.client.audio.SoundHandler p1, moom.oR p2, java.lang.String p3, java.util.Iterator p4, java.lang.String p5, java.util.Iterator p6, net.minecraft.client.resources.IResource p7, java.util.Map p8, java.util.Iterator p9, java.util.Map.Entry p10) throws Throwable {
    java.util.Iterator forestValue3097201_31_0;
    java.util.Iterator forestValue3097201_47_0;
    java.util.Iterator forestValue3097201_52_0;
    java.util.Iterator forestValue3097201_84_0;
    java.util.Iterator spill3097201_0;
    java.util.Iterator spill3097201_1;
    java.lang.RuntimeException life8_2;
    net.minecraft.client.resources.IResource life7_18;
    java.util.Map life8_23;
    net.minecraft.client.resources.IResource life7_84;
    java.util.Map life8_89;
    java.util.Iterator life9_96;
    java.util.Map.Entry life10_105;
    forest_join_109: {
    life8_2 = p0;
    __call3097201_1(__fieldRead3097201_0(), "Invalid sounds.json", life8_2);
    forest_cycle_6: while (true) {
    forest_join_108: {
    forest_join_84: {
    forest_join_48: {
    forest_join_47: {
    forest_join_9: {
    if (!((p3 != null))) {
        break forest_join_9;
    }
    break forest_join_48;
    }
    forest_cycle_9: while (true) {
    forest_join_31: {
    forest_join_30: {
    forest_join_27: {
    if (!(__call3097201_2(p6))) {
        break forest_join_27;
    }
    life7_18 = __cast3097201_4(__call3097201_3(p6));
    life8_23 = __call3097201_6(p1, __call3097201_5(life7_18));
    spill3097201_0 = __call3097201_8(__call3097201_7(life8_23));
    if (!((p3 == null))) {
        forestValue3097201_31_0 = spill3097201_0;
        break forest_join_31;
    }
    forestValue3097201_47_0 = spill3097201_0;
    break forest_join_47;
    }
    if (!((p3 != null))) {
        break forest_join_30;
    }
    break forest_join_109;
    }
    forestValue3097201_31_0 = p4;
    }
    if (!(__call3097201_9(forestValue3097201_31_0))) {
        break forest_join_109;
    }
    p5 = __cast3097201_11(__call3097201_10(p4));
    p6 = __call3097201_13(__call3097201_12(p2, new moom.DD(p5, "sounds.json")));
    continue forest_cycle_9;
    }
    }
    forestValue3097201_84_0 = forestValue3097201_47_0;
    break forest_join_84;
    }
    forest_cycle_48: while (true) {
    forest_join_51: {
    if (!((p3 != null))) {
        break forest_join_51;
    }
    break forest_join_109;
    }
    forestValue3097201_52_0 = p4;
    forest_cycle_52: while (true) {
    if (!(__call3097201_14(forestValue3097201_52_0))) {
        break forest_join_109;
    }
    p5 = __cast3097201_16(__call3097201_15(p4));
    p6 = __call3097201_18(__call3097201_17(p2, new moom.DD(p5, "sounds.json")));
    if (!(__call3097201_19(p6))) {
        continue forest_cycle_48;
    }
    life7_84 = __cast3097201_21(__call3097201_20(p6));
    life8_89 = __call3097201_23(p1, __call3097201_22(life7_84));
    spill3097201_1 = __call3097201_25(__call3097201_24(life8_89));
    if (!((p3 == null))) {
        forestValue3097201_52_0 = spill3097201_1;
        continue forest_cycle_52;
    }
    break forest_cycle_52;
    }
    break forest_cycle_48;
    }
    forestValue3097201_84_0 = spill3097201_1;
    }
    life9_96 = forestValue3097201_84_0;
    forest_cycle_85: while (true) {
    if (!(__call3097201_26(life9_96))) {
        break forest_join_108;
    }
    life10_105 = __cast3097201_28(__call3097201_27(life9_96));
    __call3097201_33(p1, new moom.DD(p5, __cast3097201_30(__call3097201_29(life10_105))), __cast3097201_32(__call3097201_31(life10_105)));
    if (!((p3 == null))) {
        continue forest_cycle_6;
    }
    if (!((p3 != null))) {
        continue forest_cycle_85;
    }
    break forest_cycle_85;
    }
    }
    continue forest_cycle_6;
    }
    }
    return;
}
public static void h972_2(java.io.IOException p0, net.minecraft.client.audio.SoundHandler p1, moom.oR p2, java.lang.String p3, java.util.Iterator p4, java.lang.String p5, java.util.Iterator p6, net.minecraft.client.resources.IResource p7, java.util.Map p8, java.util.Iterator p9, java.util.Map.Entry p10) throws Throwable {
    java.util.Iterator forestValue3097202_6_0;
    java.util.Iterator spill3097202_0;
    java.io.IOException life6_2;
    java.lang.String life5_15;
    java.util.Iterator life6_24;
    net.minecraft.client.resources.IResource life7_33;
    java.util.Map life8_38;
    java.util.Iterator life9_45;
    java.util.Map.Entry life10_54;
    forest_join_65: {
    life6_2 = p0;
    forest_cycle_2: while (true) {
    forest_join_64: {
    forest_join_5: {
    if (!((p3 != null))) {
        break forest_join_5;
    }
    break forest_join_65;
    }
    forestValue3097202_6_0 = p4;
    forest_cycle_6: while (true) {
    if (!(__call3097202_0(forestValue3097202_6_0))) {
        break forest_join_65;
    }
    life5_15 = __cast3097202_2(__call3097202_1(p4));
    life6_24 = __call3097202_4(__call3097202_3(p2, new moom.DD(life5_15, "sounds.json")));
    forest_cycle_21: while (true) {
    forest_join_62: {
    if (!(__call3097202_5(life6_24))) {
        break forest_join_64;
    }
    life7_33 = __cast3097202_7(__call3097202_6(life6_24));
    life8_38 = __call3097202_9(p1, __call3097202_8(life7_33));
    spill3097202_0 = __call3097202_11(__call3097202_10(life8_38));
    if (!((p3 == null))) {
        forestValue3097202_6_0 = spill3097202_0;
        continue forest_cycle_6;
    }
    life9_45 = spill3097202_0;
    forest_cycle_39: while (true) {
    if (!(__call3097202_12(life9_45))) {
        break forest_join_62;
    }
    life10_54 = __cast3097202_14(__call3097202_13(life9_45));
    __call3097202_19(p1, new moom.DD(life5_15, __cast3097202_16(__call3097202_15(life10_54))), __cast3097202_18(__call3097202_17(life10_54)));
    if (!((p3 == null))) {
        break forest_join_62;
    }
    if (!((p3 != null))) {
        continue forest_cycle_39;
    }
    break forest_cycle_39;
    }
    }
    if (!((p3 != null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    break forest_cycle_6;
    }
    }
    continue forest_cycle_2;
    }
    }
    return;
}
private static native long __fieldRead972_0() throws Throwable;
private static native net.minecraft.client.audio.SoundManager __fieldRead972_1(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native void __call972_2(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.String __call972_3() throws Throwable;
private static native moom.Dz __fieldRead972_4(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native void __call972_5(moom.Dz a0) throws Throwable;
private static native java.util.Set __call972_6(moom.oR a0) throws Throwable;
private static native java.util.Iterator __call972_7(java.util.Set a0) throws Throwable;
private static native boolean __call972_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call972_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast972_10(java.lang.Object a0) throws Throwable;
private static native java.util.List __call972_11(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.util.Iterator __call972_12(java.util.List a0) throws Throwable;
private static native boolean __call972_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call972_14(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __cast972_15(java.lang.Object a0) throws Throwable;
private static native java.io.InputStream __call972_16(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.util.Map __call972_17(net.minecraft.client.audio.SoundHandler a0, java.io.InputStream a1) throws Throwable;
private static native java.util.Set __call972_18(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call972_19(java.util.Set a0) throws Throwable;
private static native boolean __call972_20(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call972_21(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast972_22(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call972_23(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast972_24(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call972_25(java.util.Map.Entry a0) throws Throwable;
private static native moom.f5 __cast972_26(java.lang.Object a0) throws Throwable;
private static native void __call972_27(net.minecraft.client.audio.SoundHandler a0, moom.DD a1, moom.f5 a2) throws Throwable;
private static native java.lang.Exception __call3097200_0(java.lang.RuntimeException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3097201_0() throws Throwable;
private static native void __call3097201_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.RuntimeException a2) throws Throwable;
private static native boolean __call3097201_2(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3097201_3(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __cast3097201_4(java.lang.Object a0) throws Throwable;
private static native java.io.InputStream __call3097201_5(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.util.Map __call3097201_6(net.minecraft.client.audio.SoundHandler a0, java.io.InputStream a1) throws Throwable;
private static native java.util.Set __call3097201_7(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call3097201_8(java.util.Set a0) throws Throwable;
private static native boolean __call3097201_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3097201_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3097201_11(java.lang.Object a0) throws Throwable;
private static native java.util.List __call3097201_12(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.util.Iterator __call3097201_13(java.util.List a0) throws Throwable;
private static native boolean __call3097201_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3097201_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3097201_16(java.lang.Object a0) throws Throwable;
private static native java.util.List __call3097201_17(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.util.Iterator __call3097201_18(java.util.List a0) throws Throwable;
private static native boolean __call3097201_19(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3097201_20(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __cast3097201_21(java.lang.Object a0) throws Throwable;
private static native java.io.InputStream __call3097201_22(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.util.Map __call3097201_23(net.minecraft.client.audio.SoundHandler a0, java.io.InputStream a1) throws Throwable;
private static native java.util.Set __call3097201_24(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call3097201_25(java.util.Set a0) throws Throwable;
private static native boolean __call3097201_26(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3097201_27(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast3097201_28(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3097201_29(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast3097201_30(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3097201_31(java.util.Map.Entry a0) throws Throwable;
private static native moom.f5 __cast3097201_32(java.lang.Object a0) throws Throwable;
private static native void __call3097201_33(net.minecraft.client.audio.SoundHandler a0, moom.DD a1, moom.f5 a2) throws Throwable;
private static native boolean __call3097202_0(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3097202_1(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3097202_2(java.lang.Object a0) throws Throwable;
private static native java.util.List __call3097202_3(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.util.Iterator __call3097202_4(java.util.List a0) throws Throwable;
private static native boolean __call3097202_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3097202_6(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __cast3097202_7(java.lang.Object a0) throws Throwable;
private static native java.io.InputStream __call3097202_8(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.util.Map __call3097202_9(net.minecraft.client.audio.SoundHandler a0, java.io.InputStream a1) throws Throwable;
private static native java.util.Set __call3097202_10(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call3097202_11(java.util.Set a0) throws Throwable;
private static native boolean __call3097202_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3097202_13(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast3097202_14(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3097202_15(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast3097202_16(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3097202_17(java.util.Map.Entry a0) throws Throwable;
private static native moom.f5 __cast3097202_18(java.lang.Object a0) throws Throwable;
private static native void __call3097202_19(net.minecraft.client.audio.SoundHandler a0, moom.DD a1, moom.f5 a2) throws Throwable;

}


public void b__Void() {
((net.minecraft.client.audio.SoundManager)(this.f)).d();
    return;
}


public void b(net.minecraft.client.audio.ISound p0) {
((net.minecraft.client.audio.SoundManager)(this.f)).a(((net.minecraft.client.audio.ISound)(p0)));
    return;
}


public void b(moom.oR p0) { __sourceHandlerCall_518ff5ba9f819275d1c0(this, p0); }


public static java.lang.String b() {
return net.minecraft.client.audio.SoundHandler.h;
}


public static void b(java.lang.String p0) {
h = ((java.lang.String)(p0));
    return;
}


public void e() {
((net.minecraft.client.audio.SoundManager)(this.f)).g();
    return;
}


public void c__Void() {
((net.minecraft.client.audio.SoundManager)(this.f)).e();
    return;
}


public void d() {
((net.minecraft.client.audio.SoundManager)(this.f)).c();
    return;
}


public net.minecraft.client.audio.SoundEventAccessorComposite a(net.minecraft.client.audio.SoundCategory[] p0) { return __sourceHandlerCall_b7bd27cd24004516fdbc(this, p0); }


public boolean a__Boolean(net.minecraft.client.audio.ISound p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.audio.SoundManager)(this.f)).a__Boolean(((net.minecraft.client.audio.ISound)(p0))))) != 0);
}


public net.minecraft.client.audio.SoundEventAccessorComposite a(moom.DD p0) {
return ((net.minecraft.client.audio.SoundEventAccessorComposite)(((moom.Dz)(this.e)).a__Object(((p0)))));
}


private void a(moom.DD p0, moom.f5 p1) { __sourceHandlerCall_bc1654b2648c7a500343(this, p0, p1); }


protected java.util.Map<java.lang.String, moom.f5> a(java.io.InputStream p0) { return __sourceHandlerCall_3cca13d4537f9d8c2c10(this, p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a() {
((net.minecraft.client.audio.SoundManager)(this.f)).f();
    return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0, float p1) {
((net.minecraft.client.audio.SoundManager)(this.f)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((float)(p1)));
    return;
}


public void a(net.minecraft.client.audio.ISound p0, int p1) {
((net.minecraft.client.audio.SoundManager)(this.f)).a(((net.minecraft.client.audio.ISound)(p0)), ((int)(p1)));
    return;
}


public void a(net.minecraft.client.audio.SoundCategory p0, float p1) { __sourceHandlerCall_2e3ee015e98073f53d18(this, p0, p1); }


public void a(net.minecraft.client.audio.ISound p0) {
((net.minecraft.client.audio.SoundManager)(this.f)).b(((net.minecraft.client.audio.ISound)(p0)));
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
