package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class qe extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public qe() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_122461fc40a78ca6504f(moom.qe a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_122461fc40a78ca6504f {

public static java.util.List f1172(moom.qe receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1172_13_0;
    java.util.List forwardValue1172_30_0;
    java.lang.String[] spill1172_0;
    long life4_3;
    int life6_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_13: {
    life4_3 = (__fieldRead1172_0() ^ 100285193196658L);
    life6_5 = __integerCategory1172_2(__call1172_1());
    spill1172_0 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1172_13_0 = spill1172_0;
        break forward_join_13;
    }
    if (!(((spill1172_0).length == 1))) {
        break forward_join_29;
    }
    forwardValue1172_13_0 = p1;
    }
    forwardValue1172_30_0 = __call1172_3(forwardValue1172_13_0, new java.lang.String[] {"clear", "rain", "thunder"});
    break forward_join_30;
    }
    forwardValue1172_30_0 = null;
    }
    return forwardValue1172_30_0;
}
public static void h1172_0(moom.Oo p0) throws Throwable {
    throw __call1117200_0(p0);
}
public static void h1172_1(moom.Oo p0) throws Throwable {
    throw __call1117201_0(p0);
}
private static native long __fieldRead1172_0() throws Throwable;
private static native boolean __call1172_1() throws Throwable;
private static native int __integerCategory1172_2(boolean value) throws Throwable;
private static native java.util.List __call1172_3(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1117200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1117201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d44d6984cbfcad2044e4(moom.qe a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_d44d6984cbfcad2044e4 {

public static void f1171(moom.qe receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1171_15_0;
    int forwardValue1171_15_1;
    int forwardValue1171_38_0;
    int forwardValue1171_38_1;
    int forwardValue1171_61_0;
    int forwardValue1171_61_1;
    int forwardValue1171_107_0;
    int forwardValue1171_138_0;
    int spill1171_0;
    int spill1171_1;
    int spill1171_2;
    int spill1171_3;
    boolean spill1171_4;
    long life3_3;
    int life5_5;
    int life6_51;
    net.minecraft.world.WorldServer life7_85;
    net.minecraft.world.storage.WorldInfo life8_88;
    forward_join_176: {
    forward_join_169: {
    forward_join_167: {
    forward_join_146: {
    forward_join_138: {
    forward_join_133: {
    forward_join_107: {
    forward_join_102: {
    forward_join_63: {
    forward_join_61: {
    forward_join_38: {
    forward_join_15: {
    life3_3 = (__fieldRead1171_0() ^ 31051078403569L);
    life5_5 = __integerCategory1171_2(__call1171_1());
    spill1171_0 = (p1).length;
    spill1171_1 = 1;
    if (!((life5_5 != 0))) {
        forwardValue1171_15_0 = spill1171_0;
        forwardValue1171_15_1 = spill1171_1;
        break forward_join_15;
    }
    if (!((spill1171_0 >= spill1171_1))) {
        break forward_join_169;
    }
    forwardValue1171_15_0 = (p1).length;
    forwardValue1171_15_1 = 2;
    }
    if (!((life5_5 != 0))) {
        forwardValue1171_38_0 = forwardValue1171_15_0;
        forwardValue1171_38_1 = forwardValue1171_15_1;
        break forward_join_38;
    }
    if (!((forwardValue1171_15_0 <= forwardValue1171_15_1))) {
        break forward_join_169;
    }
    forwardValue1171_38_0 = (__invokedynamic1171_3(16605, (9052245634772876218L ^ life3_3)) + __call1171_5(new java.util.Random(), __invokedynamic1171_4(29123, (3781287957837974183L ^ life3_3))));
    forwardValue1171_38_1 = __invokedynamic1171_6(24895, (8557846996124605021L ^ life3_3));
    }
    life6_51 = (forwardValue1171_38_0 * forwardValue1171_38_1);
    spill1171_2 = (p1).length;
    spill1171_3 = 2;
    if (!((life5_5 != 0))) {
        forwardValue1171_61_0 = spill1171_2;
        forwardValue1171_61_1 = spill1171_3;
        break forward_join_61;
    }
    if (!((spill1171_2 == spill1171_3))) {
        break forward_join_63;
    }
    forwardValue1171_61_0 = __call1171_8((p1)[1], 1, __invokedynamic1171_7(12051, (2330382245153625205L ^ life3_3)));
    forwardValue1171_61_1 = __invokedynamic1171_9(2321, (7525143516862673524L ^ life3_3));
    }
    life6_51 = (forwardValue1171_61_0 * forwardValue1171_61_1);
    }
    life7_85 = (__fieldRead1171_11(__call1171_10()))[0];
    life8_88 = __call1171_12(life7_85);
    spill1171_4 = __call1171_13("clear", (p1)[0]);
    if (!((life5_5 != 0))) {
        forwardValue1171_107_0 = __integerCategory1171_14(spill1171_4);
        break forward_join_107;
    }
    if (!(spill1171_4)) {
        break forward_join_102;
    }
    __call1171_15(life8_88, life6_51);
    __call1171_16(life8_88, 0);
    __call1171_17(life8_88, 0);
    __call1171_18(life8_88, 0);
    __call1171_19(life8_88, 0);
    __call1171_20(p0, receiver, "commands.weather.clear", new java.lang.Object[0]);
    if (!((life5_5 == 0))) {
        break forward_join_167;
    }
    }
    forwardValue1171_107_0 = __integerCategory1171_22(__call1171_21("rain", (p1)[0]));
    }
    if (!((life5_5 != 0))) {
        forwardValue1171_138_0 = forwardValue1171_107_0;
        break forward_join_138;
    }
    if (!((forwardValue1171_107_0 != 0))) {
        break forward_join_133;
    }
    __call1171_23(life8_88, 0);
    __call1171_24(life8_88, life6_51);
    __call1171_25(life8_88, life6_51);
    __call1171_26(life8_88, 1);
    __call1171_27(life8_88, 0);
    __call1171_28(p0, receiver, "commands.weather.rain", new java.lang.Object[0]);
    if (!((life5_5 == 0))) {
        break forward_join_167;
    }
    }
    forwardValue1171_138_0 = __integerCategory1171_30(__call1171_29("thunder", (p1)[0]));
    }
    if (!((forwardValue1171_138_0 == 0))) {
        break forward_join_146;
    }
    throw new moom.cc("commands.weather.usage", new java.lang.Object[0]);
    }
    __call1171_31(life8_88, 0);
    __call1171_32(life8_88, life6_51);
    __call1171_33(life8_88, life6_51);
    __call1171_34(life8_88, 1);
    __call1171_35(life8_88, 1);
    __call1171_36(p0, receiver, "commands.weather.thunder", new java.lang.Object[0]);
    }
    if (!((life5_5 == 0))) {
        break forward_join_176;
    }
    }
    throw new moom.cc("commands.weather.usage", new java.lang.Object[0]);
    }
    return;
}
public static void h1171_0(moom.b7 p0) throws Throwable {
    throw __call1117100_0(p0);
}
public static void h1171_1(moom.b7 p0) throws Throwable {
    throw __call1117101_0(p0);
}
public static void h1171_2(moom.b7 p0) throws Throwable {
    throw __call1117102_0(p0);
}
public static void h1171_3(moom.b7 p0) throws Throwable {
    throw __call1117103_0(p0);
}
public static void h1171_4(moom.b7 p0) throws Throwable {
    throw __call1117104_0(p0);
}
public static void h1171_5(moom.b7 p0) throws Throwable {
    throw __call1117105_0(p0);
}
public static void h1171_6(moom.b7 p0) throws Throwable {
    throw __call1117106_0(p0);
}
public static void h1171_7(moom.b7 p0) throws Throwable {
    throw __call1117107_0(p0);
}
public static void h1171_8(moom.b7 p0) throws Throwable {
    throw __call1117108_0(p0);
}
public static void h1171_9(moom.b7 p0) throws Throwable {
    throw __call1117109_0(p0);
}
public static void h1171_10(moom.b7 p0) throws Throwable {
    throw __call1117110_0(p0);
}
public static void h1171_11(moom.b7 p0) throws Throwable {
    throw __call1117111_0(p0);
}
public static void h1171_12(moom.b7 p0) throws Throwable {
    throw __call1117112_0(p0);
}
public static void h1171_13(moom.b7 p0) throws Throwable {
    throw __call1117113_0(p0);
}
private static native long __fieldRead1171_0() throws Throwable;
private static native boolean __call1171_1() throws Throwable;
private static native int __integerCategory1171_2(boolean value) throws Throwable;
private static native int __invokedynamic1171_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic1171_4(int a0, long a1) throws Throwable;
private static native int __call1171_5(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic1171_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic1171_7(int a0, long a1) throws Throwable;
private static native int __call1171_8(java.lang.String a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1171_9(int a0, long a1) throws Throwable;
private static native moom.Bl __call1171_10() throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead1171_11(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1171_12(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1171_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1171_14(boolean value) throws Throwable;
private static native void __call1171_15(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_16(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_17(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_18(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_19(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_20(net.minecraft.command.ICommandSender a0, moom.qe a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1171_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1171_22(boolean value) throws Throwable;
private static native void __call1171_23(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_24(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_25(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_26(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_27(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_28(net.minecraft.command.ICommandSender a0, moom.qe a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1171_29(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1171_30(boolean value) throws Throwable;
private static native void __call1171_31(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_32(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_33(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_34(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_35(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1171_36(net.minecraft.command.ICommandSender a0, moom.qe a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1117100_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117101_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117102_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117103_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117104_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117105_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117106_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117107_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117108_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117109_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117110_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117111_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117112_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117113_0(moom.b7 a0) throws Throwable;

}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-5518641871191374967L)), ((long)(6978662810467828097L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(13520939438485L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.qe.c ^ 25567004553323L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1480_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1480_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1480_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1480_14 = new byte[8];
    (__sourceSpill1480_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1480_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1480_16 = __sourceSpill1480_14;
    ((javax.crypto.Cipher)(__sourceSpill1480_11)).init(((int)(__sourceSpill1480_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1480_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1480_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "iW\nËÝ\t¹½ã\021'ôê0\021Ã}¡NØ\016\032"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1480_25 = local6_life21;
        int __sourceSpill1480_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1480_25)).substring(((int)(__sourceSpill1480_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1480_30 = local8_life19;
        int __sourceSpill1480_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1480_33 = new byte[8];
        (__sourceSpill1480_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1480_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1480_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1480_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1480_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1480_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1480_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1480_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1480_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1480_34)).doFinal(((byte[])(__sourceSpill1480_33)));
        (__sourceSpill1480_30)[__sourceSpill1480_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Á]Äò3 ÌB\013oÑÆïÐ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1480_38 = local6_life21;
        int __sourceSpill1480_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1480_38)).substring(((int)(__sourceSpill1480_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1480_43 = local8_life19;
        int __sourceSpill1480_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1480_46 = new byte[8];
        (__sourceSpill1480_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1480_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1480_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1480_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1480_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1480_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1480_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1480_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1480_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1480_47)).doFinal(((byte[])(__sourceSpill1480_46)));
        (__sourceSpill1480_43)[__sourceSpill1480_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8830_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qe"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28697;
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
            throw new RuntimeException("moom/qe", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.qe.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_122461fc40a78ca6504f(this, p0, p1, p2); }


public java.lang.String a__String() {
return "weather";
}


public int a() {
return 2;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.weather.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_d44d6984cbfcad2044e4(this, p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8830_0() throws E;
}
