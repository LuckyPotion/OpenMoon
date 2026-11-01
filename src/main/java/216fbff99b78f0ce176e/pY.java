package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pY extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public pY() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-739974556199414385L)), ((long)(-2863088394752834495L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(86897024179933L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.pY.c ^ 15892889969655L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill962_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill962_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill962_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill962_14 = new byte[8];
    (__sourceSpill962_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill962_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation962_16 = __sourceSpill962_14;
    ((javax.crypto.Cipher)(__sourceSpill962_11)).init(((int)(__sourceSpill962_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill962_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation962_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¡ÞÃyT¸ ]§àÓnªæ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill962_25 = local6_life21;
        int __sourceSpill962_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill962_25)).substring(((int)(__sourceSpill962_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill962_30 = local8_life19;
        int __sourceSpill962_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill962_33 = new byte[8];
        (__sourceSpill962_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill962_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill962_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill962_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill962_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill962_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill962_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill962_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill962_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill962_34)).doFinal(((byte[])(__sourceSpill962_33)));
        (__sourceSpill962_30)[__sourceSpill962_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceHandlerCall_63da25f58fcb629de2d3(moom.pY a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_63da25f58fcb629de2d3 {

public static void f57(moom.pY receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    java.lang.String[] forwardValue57_15_0;
    java.lang.String forwardValue57_19_0;
    java.lang.String[] forwardValue57_27_0;
    java.lang.String forwardValue57_31_0;
    net.minecraft.world.GameRules forwardValue57_66_0;
    java.lang.String forwardValue57_66_1;
    int forwardValue57_92_0;
    int forwardValue57_102_0;
    net.minecraft.world.GameRules forwardValue57_120_0;
    java.lang.String forwardValue57_120_1;
    boolean spill57_0;
    java.lang.String[] spill57_1;
    java.lang.String[] spill57_2;
    int spill57_3;
    net.minecraft.world.GameRules spill57_4;
    java.lang.String spill57_5;
    net.minecraft.world.GameRules spill57_6;
    java.lang.String spill57_7;
    boolean spill57_8;
    long life3_3;
    net.minecraft.world.GameRules life6_7;
    int life5_8;
    java.lang.String life7_25;
    java.lang.String life8_43;
    java.lang.String life9_92;
    forward_join_127: {
    forward_join_120: {
    forward_join_114: {
    forward_join_102: {
    forward_join_92: {
    forward_join_86: {
    forward_join_66: {
    forward_join_64: {
    forward_join_47: {
    forward_join_37: {
    forward_join_31: {
    forward_join_30: {
    forward_join_27: {
    forward_join_19: {
    forward_join_18: {
    forward_join_15: {
    life3_3 = (__fieldRead57_0() ^ 71854736929640L);
    spill57_0 = __call57_1();
    life6_7 = __call57_2(receiver);
    life5_8 = __integerCategory57_3(spill57_0);
    spill57_1 = p1;
    if (!((life5_8 == 0))) {
        forwardValue57_15_0 = spill57_1;
        break forward_join_15;
    }
    if (!(((spill57_1).length > 0))) {
        break forward_join_18;
    }
    forwardValue57_15_0 = p1;
    }
    forwardValue57_19_0 = (forwardValue57_15_0)[0];
    break forward_join_19;
    }
    forwardValue57_19_0 = "";
    }
    life7_25 = forwardValue57_19_0;
    spill57_2 = p1;
    if (!((life5_8 == 0))) {
        forwardValue57_27_0 = spill57_2;
        break forward_join_27;
    }
    if (!(((spill57_2).length > 1))) {
        break forward_join_30;
    }
    forwardValue57_27_0 = p1;
    }
    forwardValue57_31_0 = __call57_4(forwardValue57_27_0, 1);
    break forward_join_31;
    }
    forwardValue57_31_0 = "";
    }
    life8_43 = forwardValue57_31_0;
    spill57_3 = (p1).length;
    if (!((life5_8 == 0))) {
        forwardValue57_92_0 = spill57_3;
        break forward_join_92;
    }
    switch (spill57_3) {
case 0:
{
        break forward_join_37;
    }
case 1:
{
        break forward_join_47;
    }
default:
{
        break forward_join_86;
    }
}
    }
    __call57_7(p0, new moom.CM(__call57_6(__call57_5(life6_7))));
    if (!((life5_8 != 0))) {
        break forward_join_127;
    }
    }
    spill57_4 = life6_7;
    spill57_5 = life7_25;
    if (!((life5_8 == 0))) {
        forwardValue57_66_0 = spill57_4;
        forwardValue57_66_1 = spill57_5;
        break forward_join_66;
    }
    if (!((!__call57_8(spill57_4, spill57_5)))) {
        break forward_join_64;
    }
    throw new moom.b7("commands.gamerule.norule", new java.lang.Object[] {life7_25});
    }
    forwardValue57_66_0 = life6_7;
    forwardValue57_66_1 = life7_25;
    }
    life9_92 = __call57_9(forwardValue57_66_0, forwardValue57_66_1);
    __call57_12(p0, __call57_11(__call57_10(new moom.CM(life7_25), " = "), life9_92));
    __call57_15(p0, __fieldRead57_13(), __call57_14(life6_7, life7_25));
    if (!((life5_8 != 0))) {
        break forward_join_127;
    }
    }
    spill57_6 = life6_7;
    spill57_7 = life7_25;
    if (!((life5_8 == 0))) {
        forwardValue57_120_0 = spill57_6;
        forwardValue57_120_1 = spill57_7;
        break forward_join_120;
    }
    forwardValue57_92_0 = __integerCategory57_18(__call57_17(spill57_6, spill57_7, __fieldRead57_16()));
    }
    if (!((forwardValue57_92_0 != 0))) {
        break forward_join_114;
    }
    spill57_8 = __call57_19("true", life8_43);
    if (!((life5_8 == 0))) {
        forwardValue57_102_0 = __integerCategory57_20(spill57_8);
        break forward_join_102;
    }
    if (!((!spill57_8))) {
        break forward_join_114;
    }
    forwardValue57_102_0 = __integerCategory57_22(__call57_21("false", life8_43));
    }
    if (!((forwardValue57_102_0 == 0))) {
        break forward_join_114;
    }
    throw new moom.b7("commands.generic.boolean.invalid", new java.lang.Object[] {life8_43});
    }
    __call57_23(life6_7, life7_25, life8_43);
    forwardValue57_120_0 = life6_7;
    forwardValue57_120_1 = life7_25;
    }
    __call57_24(forwardValue57_120_0, forwardValue57_120_1);
    __call57_25(p0, receiver, "commands.gamerule.success", new java.lang.Object[0]);
    }
    return;
}
public static void h57_0(moom.b7 p0) throws Throwable {
    throw __call3005700_0(p0);
}
public static void h57_1(moom.b7 p0) throws Throwable {
    throw __call3005701_0(p0);
}
public static void h57_2(moom.b7 p0) throws Throwable {
    throw __call3005702_0(p0);
}
public static void h57_3(moom.b7 p0) throws Throwable {
    throw __call3005703_0(p0);
}
public static void h57_4(moom.b7 p0) throws Throwable {
    throw __call3005704_0(p0);
}
public static void h57_5(moom.b7 p0) throws Throwable {
    throw __call3005705_0(p0);
}
public static void h57_6(moom.b7 p0) throws Throwable {
    throw __call3005706_0(p0);
}
public static void h57_7(moom.b7 p0) throws Throwable {
    throw __call3005707_0(p0);
}
public static void h57_8(moom.b7 p0) throws Throwable {
    throw __call3005708_0(p0);
}
public static void h57_9(moom.b7 p0) throws Throwable {
    throw __call3005709_0(p0);
}
public static void h57_10(moom.b7 p0) throws Throwable {
    throw __call3005710_0(p0);
}
public static void h57_11(moom.b7 p0) throws Throwable {
    throw __call3005711_0(p0);
}
public static void h57_12(moom.b7 p0) throws Throwable {
    throw __call3005712_0(p0);
}
public static void h57_13(moom.b7 p0) throws Throwable {
    throw __call3005713_0(p0);
}
public static void h57_14(moom.b7 p0) throws Throwable {
    throw __call3005714_0(p0);
}
private static native long __fieldRead57_0() throws Throwable;
private static native boolean __call57_1() throws Throwable;
private static native net.minecraft.world.GameRules __call57_2(moom.pY a0) throws Throwable;
private static native int __integerCategory57_3(boolean value) throws Throwable;
private static native java.lang.String __call57_4(java.lang.String[] a0, int a1) throws Throwable;
private static native java.lang.String[] __call57_5(net.minecraft.world.GameRules a0) throws Throwable;
private static native java.lang.String __call57_6(java.lang.String[] a0) throws Throwable;
private static native void __call57_7(net.minecraft.command.ICommandSender a0, moom.CM a1) throws Throwable;
private static native boolean __call57_8(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call57_9(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call57_10(moom.CM a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call57_11(net.minecraft.util.IChatComponent a0, java.lang.String a1) throws Throwable;
private static native void __call57_12(net.minecraft.command.ICommandSender a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead57_13() throws Throwable;
private static native int __call57_14(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native void __call57_15(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native net.minecraft.world.GameRules$ValueType __fieldRead57_16() throws Throwable;
private static native boolean __call57_17(net.minecraft.world.GameRules a0, java.lang.String a1, net.minecraft.world.GameRules$ValueType a2) throws Throwable;
private static native int __integerCategory57_18(boolean value) throws Throwable;
private static native boolean __call57_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory57_20(boolean value) throws Throwable;
private static native boolean __call57_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory57_22(boolean value) throws Throwable;
private static native void __call57_23(net.minecraft.world.GameRules a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call57_24(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native void __call57_25(net.minecraft.command.ICommandSender a0, moom.pY a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3005700_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005701_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005702_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005703_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005704_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005705_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005706_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005707_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005708_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005709_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005710_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005711_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005712_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005713_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005714_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_c67674f099ad15ff4160(moom.pY a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_c67674f099ad15ff4160 {

public static java.util.List f1132(moom.pY receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1132_21_0;
    int forwardValue1132_21_1;
    int spill1132_0;
    int spill1132_1;
    long life4_3;
    int life6_5;
    net.minecraft.world.GameRules life7_29;
    forward_join_45: {
    forward_join_21: {
    forward_join_18: {
    life4_3 = (__fieldRead1132_0() ^ 6945754800875L);
    life6_5 = __integerCategory1132_2(__call1132_1());
    spill1132_0 = (p1).length;
    spill1132_1 = 1;
    if (!((life6_5 == 0))) {
        forwardValue1132_21_0 = spill1132_0;
        forwardValue1132_21_1 = spill1132_1;
        break forward_join_21;
    }
    if (!((spill1132_0 == spill1132_1))) {
        break forward_join_18;
    }
    return __call1132_5(p1, __call1132_4(__call1132_3(receiver)));
    }
    forwardValue1132_21_0 = (p1).length;
    forwardValue1132_21_1 = 2;
    }
    if (!((forwardValue1132_21_0 == forwardValue1132_21_1))) {
        break forward_join_45;
    }
    life7_29 = __call1132_6(receiver);
    if (!(__call1132_8(life7_29, (p1)[0], __fieldRead1132_7()))) {
        break forward_join_45;
    }
    return __call1132_9(p1, new java.lang.String[] {"true", "false"});
    }
    return null;
}
public static void h1132_0(moom.Oo p0) throws Throwable {
    throw __call1113200_0(p0);
}
public static void h1132_1(moom.Oo p0) throws Throwable {
    throw __call1113201_0(p0);
}
public static void h1132_2(moom.Oo p0) throws Throwable {
    throw __call1113202_0(p0);
}
private static native long __fieldRead1132_0() throws Throwable;
private static native boolean __call1132_1() throws Throwable;
private static native int __integerCategory1132_2(boolean value) throws Throwable;
private static native net.minecraft.world.GameRules __call1132_3(moom.pY a0) throws Throwable;
private static native java.lang.String[] __call1132_4(net.minecraft.world.GameRules a0) throws Throwable;
private static native java.util.List __call1132_5(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native net.minecraft.world.GameRules __call1132_6(moom.pY a0) throws Throwable;
private static native net.minecraft.world.GameRules$ValueType __fieldRead1132_7() throws Throwable;
private static native boolean __call1132_8(net.minecraft.world.GameRules a0, java.lang.String a1, net.minecraft.world.GameRules$ValueType a2) throws Throwable;
private static native java.util.List __call1132_9(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1113200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1113201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1113202_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5f83d7125b10798dfefd(net.minecraft.world.GameRules a0, java.lang.String a1) throws E;
private static final class __SourceHandler_5f83d7125b10798dfefd {

public static void f900195(net.minecraft.world.GameRules p0, java.lang.String p1) throws Throwable {
    int forestValue900195_15_0;
    int forestValue900195_23_0;
    int forestValue900195_29_0;
    boolean spill900195_0;
    net.minecraft.network.NetHandlerPlayServer spill900195_1;
    moom.zT spill900195_2;
    long life2_3;
    int life4_5;
    int life5_33;
    java.util.Iterator life6_38;
    net.minecraft.entity.player.EntityPlayerMP life7_45;
    forest_join_53: {
    forest_join_29: {
    forest_join_24: {
    forest_join_23: {
    forest_join_15: {
    life2_3 = (__fieldRead900195_0() ^ 27135043853186L);
    life4_5 = __integerCategory900195_2(__call900195_1());
    spill900195_0 = __call900195_3("reducedDebugInfo", p1);
    if (!((life4_5 == 0))) {
        forestValue900195_15_0 = __integerCategory900195_4(spill900195_0);
        break forest_join_15;
    }
    if (!(spill900195_0)) {
        break forest_join_53;
    }
    forestValue900195_15_0 = __integerCategory900195_6(__call900195_5(p0, p1));
    }
    if (!((life4_5 == 0))) {
        forestValue900195_23_0 = forestValue900195_15_0;
        break forest_join_23;
    }
    if (!((forestValue900195_15_0 != 0))) {
        break forest_join_24;
    }
    forestValue900195_23_0 = __invokedynamic900195_7(4567, (158867493543074080L ^ life2_3));
    }
    forestValue900195_29_0 = forestValue900195_23_0;
    break forest_join_29;
    }
    forestValue900195_29_0 = __invokedynamic900195_8(6729, (109994932613534399L ^ life2_3));
    }
    life5_33 = ((byte) forestValue900195_29_0);
    life6_38 = __call900195_12(__call900195_11(__call900195_10(__call900195_9())));
    forest_cycle_36: while (true) {
    if (!(__call900195_13(life6_38))) {
        break forest_join_53;
    }
    life7_45 = __cast900195_15(__call900195_14(life6_38));
    spill900195_1 = __fieldRead900195_16(life7_45);
    moom.zT __stackOp900195_18_0 = __sourceUninitializedNEW900195_17();
    spill900195_2 = __stackOp900195_18_0;
    __explicitNewInit900195_19(__stackOp900195_18_0, life7_45, __integerCategory900195_20(life5_33));
    __call900195_21(spill900195_1, spill900195_2);
    if (!((life4_5 != 0))) {
        continue forest_cycle_36;
    }
    break forest_cycle_36;
    }
    }
    return;
}
public static void h900195_0(moom.Oo p0) throws Throwable {
    throw __call93019500_0(p0);
}
public static void h900195_1(moom.Oo p0) throws Throwable {
    throw __call93019501_0(p0);
}
public static void h900195_2(moom.Oo p0) throws Throwable {
    throw __call93019502_0(p0);
}
private static native long __fieldRead900195_0() throws Throwable;
private static native boolean __call900195_1() throws Throwable;
private static native int __integerCategory900195_2(boolean value) throws Throwable;
private static native boolean __call900195_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory900195_4(boolean value) throws Throwable;
private static native boolean __call900195_5(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory900195_6(boolean value) throws Throwable;
private static native int __invokedynamic900195_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic900195_8(int a0, long a1) throws Throwable;
private static native moom.Bl __call900195_9() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call900195_10(moom.Bl a0) throws Throwable;
private static native java.util.List __call900195_11(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.util.Iterator __call900195_12(java.util.List a0) throws Throwable;
private static native boolean __call900195_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call900195_14(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast900195_15(java.lang.Object a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead900195_16(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.zT __sourceUninitializedNEW900195_17() throws Throwable;
private static native byte __integerCategory900195_20(int value) throws Throwable;
private static native void __explicitNewInit900195_19(moom.zT a0, net.minecraft.entity.Entity a1, byte a2) throws Throwable;
private static native void __call900195_21(net.minecraft.network.NetHandlerPlayServer a0, moom.zT a1) throws Throwable;
private static native java.lang.Exception __call93019500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call93019501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call93019502_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8698_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27490;
      if (e[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = d[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/pY", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.pY.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "gamerule";
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_c67674f099ad15ff4160(this, p0, p1, p2); }


public static void a(net.minecraft.world.GameRules p0, java.lang.String p1) { __sourceHandlerCall_5f83d7125b10798dfefd(p0, p1); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_63da25f58fcb629de2d3(this, p0, p1); }


private net.minecraft.world.GameRules a__Ej() {
return ((net.minecraft.world.WorldServer)(((moom.Bl)(moom.Bl.a__Bl())).a(((int)(0))))).a__Ej();
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.gamerule.usage";
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8698_0() throws E;
}
