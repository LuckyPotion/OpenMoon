package net.minecraft.command;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class CommandDebug extends net.minecraft.command.CommandBase {

private static org.apache.logging.log4j.Logger c;

private long d;

private int e;

private static long g;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public CommandDebug() {
super();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-5671086572030409513L)), ((long)(3695778409504801021L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(161584878187726L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.command.CommandDebug.g ^ 113056931401643L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1841_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1841_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1841_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1841_14 = new byte[8];
    (__sourceSpill1841_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1841_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1841_16 = __sourceSpill1841_14;
    ((javax.crypto.Cipher)(__sourceSpill1841_11)).init(((int)(__sourceSpill1841_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1841_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1841_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "s\025:\003ê¤=ùzíf+\"Ñ\021EéU\033\007\020È­\\R%¼\037¼ê¤40>\037b<s\007¬ë%\bK:áW©c£V*e¼"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1841_25 = local6_life21;
        int __sourceSpill1841_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1841_25)).substring(((int)(__sourceSpill1841_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1841_30 = local8_life19;
        int __sourceSpill1841_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1841_33 = new byte[8];
        (__sourceSpill1841_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1841_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1841_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1841_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1841_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1841_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1841_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1841_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1841_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1841_34)).doFinal(((byte[])(__sourceSpill1841_33)));
        (__sourceSpill1841_30)[__sourceSpill1841_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "È¨á°9l\020Aå#\036Ýåç"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1841_38 = local6_life21;
        int __sourceSpill1841_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1841_38)).substring(((int)(__sourceSpill1841_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1841_43 = local8_life19;
        int __sourceSpill1841_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1841_46 = new byte[8];
        (__sourceSpill1841_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1841_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1841_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1841_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1841_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1841_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1841_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1841_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1841_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1841_47)).doFinal(((byte[])(__sourceSpill1841_46)));
        (__sourceSpill1841_43)[__sourceSpill1841_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[10]));
    c = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_2a51bd77845249d2c62d(net.minecraft.command.CommandDebug a0, int a1, java.lang.String a2, java.lang.StringBuilder a3) throws E;
private static final class __SourceHandler_2a51bd77845249d2c62d {

public static void f1101(net.minecraft.command.CommandDebug receiver, int p0, java.lang.String p1, java.lang.StringBuilder p2) throws Throwable {
    java.util.List forestValue1101_16_0;
    int forestValue1101_22_0;
    boolean spill1101_0;
    java.util.List spill1101_1;
    int spill1101_2;
    java.lang.StringBuilder spill1101_3;
    java.lang.String spill1101_4;
    java.lang.Object[] spill1101_5;
    java.lang.StringBuilder spill1101_6;
    java.lang.String spill1101_7;
    java.lang.Object[] spill1101_8;
    java.lang.StringBuilder spill1101_9;
    java.lang.String spill1101_10;
    java.lang.Object[] spill1101_11;
    long life4_3;
    java.util.List life7_9;
    int life6_10;
    int life8_25;
    moom.A_ life9_34;
    forest_join_105: {
    forest_join_22: {
    forest_join_16: {
    life4_3 = (__fieldRead1101_0() ^ 16724327487168L);
    spill1101_0 = __call1101_1();
    life7_9 = __call1101_4(__fieldRead1101_3(__call1101_2()), p1);
    life6_10 = __integerCategory1101_5(spill1101_0);
    spill1101_1 = life7_9;
    if (!((life6_10 == 0))) {
        forestValue1101_16_0 = spill1101_1;
        break forest_join_16;
    }
    if (!((spill1101_1 != null))) {
        break forest_join_105;
    }
    forestValue1101_16_0 = life7_9;
    }
    spill1101_2 = __call1101_6(forestValue1101_16_0);
    if (!((life6_10 == 0))) {
        forestValue1101_22_0 = spill1101_2;
        break forest_join_22;
    }
    if (!((spill1101_2 >= 3))) {
        break forest_join_105;
    }
    forestValue1101_22_0 = 1;
    }
    life8_25 = forestValue1101_22_0;
    forest_cycle_23: while (true) {
    forest_join_103: {
    forest_join_102: {
    if (!((life8_25 < __call1101_7(life7_9)))) {
        break forest_join_105;
    }
    life9_34 = __cast1101_9(__call1101_8(life7_9, life8_25));
    spill1101_3 = p2;
    spill1101_4 = "[%02d] ";
    java.lang.Object[] __stackOp1101_10_0 = new java.lang.Object[1];
    spill1101_5 = __stackOp1101_10_0;
    (__stackOp1101_10_0)[0] = __call1101_11(p0);
    __call1101_13(spill1101_3, __call1101_12(spill1101_4, spill1101_5));
    __call1101_16(p2, __call1101_15(" ", __call1101_14(0, p0)));
    spill1101_6 = __call1101_19(__call1101_18(p2, __fieldRead1101_17(life9_34)), " - ");
    spill1101_7 = "%.2f";
    java.lang.Object[] __stackOp1101_20_0 = new java.lang.Object[1];
    spill1101_8 = __stackOp1101_20_0;
    (__stackOp1101_20_0)[0] = __call1101_22(__fieldRead1101_21(life9_34));
    spill1101_9 = __call1101_25(__call1101_24(spill1101_6, __call1101_23(spill1101_7, spill1101_8)), "%/");
    spill1101_10 = "%.2f";
    java.lang.Object[] __stackOp1101_26_0 = new java.lang.Object[1];
    spill1101_11 = __stackOp1101_26_0;
    (__stackOp1101_26_0)[0] = __call1101_28(__fieldRead1101_27(life9_34));
    __call1101_31(__call1101_30(spill1101_9, __call1101_29(spill1101_10, spill1101_11)), "%\n");
    if (!((life6_10 == 0))) {
        break forest_join_103;
    }
    if (!((!__call1101_33(__fieldRead1101_32(life9_34), "unspecified")))) {
        break forest_join_102;
    }
    __call1101_36(receiver, (p0 + 1), __invokedynamic1101_35(p1, __fieldRead1101_34(life9_34)), p2);
    }
    life8_25 += 1;
    }
    if (!((life6_10 != 0))) {
        continue forest_cycle_23;
    }
    break forest_cycle_23;
    }
    }
    return;
}
public static void h1101_0(java.lang.Exception p0) throws Throwable {
    throw __call3110100_0(p0);
}
public static void h1101_1(java.lang.Exception p0) throws Throwable {
    throw __call3110101_0(p0);
}
public static void h1101_2(java.lang.Exception p0) throws Throwable {
    throw __call3110102_0(p0);
}
public static void h1101_3(java.lang.Exception p0) throws Throwable {
    throw __call3110103_0(p0);
}
public static void h1101_4(java.lang.Exception p0, net.minecraft.command.CommandDebug p1, int p2, java.lang.String p3, java.lang.StringBuilder p4, int p5, java.util.List p6, int p7, moom.A_ p8) throws Throwable {
    java.lang.StringBuilder spill3110104_0;
    java.lang.String spill3110104_1;
    java.lang.Object[] spill3110104_2;
    java.lang.StringBuilder spill3110104_3;
    java.lang.String spill3110104_4;
    java.lang.Object[] spill3110104_5;
    java.lang.StringBuilder spill3110104_6;
    java.lang.String spill3110104_7;
    java.lang.Object[] spill3110104_8;
    java.lang.Exception life9_2;
    moom.A_ life8_23;
    forest_join_94: {
    life9_2 = p0;
    __call3110104_2(__call3110104_1(__call3110104_0(p4, "[[ EXCEPTION "), life9_2), " ]]");
    forest_cycle_10: while (true) {
    p7 += 1;
    forest_cycle_11: while (true) {
    forest_join_14: {
    if (!((p5 != 0))) {
        break forest_join_14;
    }
    break forest_join_94;
    }
    if (!((p7 < __call3110104_3(p6)))) {
        break forest_join_94;
    }
    life8_23 = __cast3110104_5(__call3110104_4(p6, p7));
    spill3110104_0 = p4;
    spill3110104_1 = "[%02d] ";
    java.lang.Object[] __stackOp3110104_6_0 = new java.lang.Object[1];
    spill3110104_2 = __stackOp3110104_6_0;
    (__stackOp3110104_6_0)[0] = __call3110104_7(p2);
    __call3110104_9(spill3110104_0, __call3110104_8(spill3110104_1, spill3110104_2));
    __call3110104_12(p4, __call3110104_11(" ", __call3110104_10(0, p2)));
    spill3110104_3 = __call3110104_15(__call3110104_14(p4, __fieldRead3110104_13(life8_23)), " - ");
    spill3110104_4 = "%.2f";
    java.lang.Object[] __stackOp3110104_16_0 = new java.lang.Object[1];
    spill3110104_5 = __stackOp3110104_16_0;
    (__stackOp3110104_16_0)[0] = __call3110104_18(__fieldRead3110104_17(life8_23));
    spill3110104_6 = __call3110104_21(__call3110104_20(spill3110104_3, __call3110104_19(spill3110104_4, spill3110104_5)), "%/");
    spill3110104_7 = "%.2f";
    java.lang.Object[] __stackOp3110104_22_0 = new java.lang.Object[1];
    spill3110104_8 = __stackOp3110104_22_0;
    (__stackOp3110104_22_0)[0] = __call3110104_24(__fieldRead3110104_23(life8_23));
    __call3110104_27(__call3110104_26(spill3110104_6, __call3110104_25(spill3110104_7, spill3110104_8)), "%\n");
    if (!((p5 == 0))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    if (!((!__call3110104_29(__fieldRead3110104_28(life8_23), "unspecified")))) {
        continue forest_cycle_10;
    }
    __call3110104_32(p1, (p2 + 1), __invokedynamic3110104_31(p3, __fieldRead3110104_30(life8_23)), p4);
    continue forest_cycle_10;
    }
    }
    return;
}
private static native long __fieldRead1101_0() throws Throwable;
private static native boolean __call1101_1() throws Throwable;
private static native moom.Bl __call1101_2() throws Throwable;
private static native moom.A9 __fieldRead1101_3(moom.Bl a0) throws Throwable;
private static native java.util.List __call1101_4(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1101_5(boolean value) throws Throwable;
private static native int __call1101_6(java.util.List a0) throws Throwable;
private static native int __call1101_7(java.util.List a0) throws Throwable;
private static native java.lang.Object __call1101_8(java.util.List a0, int a1) throws Throwable;
private static native moom.A_ __cast1101_9(java.lang.Object a0) throws Throwable;
private static native java.lang.Integer __call1101_11(int a0) throws Throwable;
private static native java.lang.String __call1101_12(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.StringBuilder __call1101_13(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __call1101_14(int a0, int a1) throws Throwable;
private static native java.lang.String __call1101_15(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.StringBuilder __call1101_16(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead1101_17(moom.A_ a0) throws Throwable;
private static native java.lang.StringBuilder __call1101_18(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1101_19(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native double __fieldRead1101_21(moom.A_ a0) throws Throwable;
private static native java.lang.Double __call1101_22(double a0) throws Throwable;
private static native java.lang.String __call1101_23(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.StringBuilder __call1101_24(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1101_25(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native double __fieldRead1101_27(moom.A_ a0) throws Throwable;
private static native java.lang.Double __call1101_28(double a0) throws Throwable;
private static native java.lang.String __call1101_29(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.StringBuilder __call1101_30(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1101_31(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead1101_32(moom.A_ a0) throws Throwable;
private static native boolean __call1101_33(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead1101_34(moom.A_ a0) throws Throwable;
private static native java.lang.String __invokedynamic1101_35(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call1101_36(net.minecraft.command.CommandDebug a0, int a1, java.lang.String a2, java.lang.StringBuilder a3) throws Throwable;
private static native java.lang.Exception __call3110100_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3110101_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3110102_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3110103_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.StringBuilder __call3110104_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call3110104_1(java.lang.StringBuilder a0, java.lang.Exception a1) throws Throwable;
private static native java.lang.StringBuilder __call3110104_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __call3110104_3(java.util.List a0) throws Throwable;
private static native java.lang.Object __call3110104_4(java.util.List a0, int a1) throws Throwable;
private static native moom.A_ __cast3110104_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Integer __call3110104_7(int a0) throws Throwable;
private static native java.lang.String __call3110104_8(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.StringBuilder __call3110104_9(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __call3110104_10(int a0, int a1) throws Throwable;
private static native java.lang.String __call3110104_11(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.StringBuilder __call3110104_12(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead3110104_13(moom.A_ a0) throws Throwable;
private static native java.lang.StringBuilder __call3110104_14(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call3110104_15(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native double __fieldRead3110104_17(moom.A_ a0) throws Throwable;
private static native java.lang.Double __call3110104_18(double a0) throws Throwable;
private static native java.lang.String __call3110104_19(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.StringBuilder __call3110104_20(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call3110104_21(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native double __fieldRead3110104_23(moom.A_ a0) throws Throwable;
private static native java.lang.Double __call3110104_24(double a0) throws Throwable;
private static native java.lang.String __call3110104_25(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.StringBuilder __call3110104_26(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call3110104_27(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead3110104_28(moom.A_ a0) throws Throwable;
private static native boolean __call3110104_29(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead3110104_30(moom.A_ a0) throws Throwable;
private static native java.lang.String __invokedynamic3110104_31(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3110104_32(net.minecraft.command.CommandDebug a0, int a1, java.lang.String a2, java.lang.StringBuilder a3) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_17b9f6e7e681d2e3511d(net.minecraft.command.CommandDebug a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_17b9f6e7e681d2e3511d {

public static void f1477(net.minecraft.command.CommandDebug receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1477_24_0;
    int forwardValue1477_60_0;
    int forwardValue1477_72_0;
    int forwardValue1477_86_0;
    int spill1477_0;
    long life3_3;
    int life5_5;
    long life6_123;
    int life8_126;
    long life9_131;
    int life11_136;
    forward_join_136: {
    forward_join_94: {
    forward_join_86: {
    forward_join_83: {
    forward_join_72: {
    forward_join_70: {
    forward_join_60: {
    forward_join_55: {
    forward_join_38: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (__fieldRead1477_0() ^ 47434603941726L);
    life5_5 = __integerCategory1477_2(__call1477_1());
    spill1477_0 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue1477_24_0 = spill1477_0;
        break forward_join_24;
    }
    if (!((spill1477_0 < 1))) {
        break forward_join_19;
    }
    throw new moom.cc("commands.debug.usage", new java.lang.Object[0]);
    }
    forwardValue1477_24_0 = __integerCategory1477_4(__call1477_3((p1)[0], "start"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1477_60_0 = forwardValue1477_24_0;
        break forward_join_60;
    }
    if (!((forwardValue1477_24_0 != 0))) {
        break forward_join_55;
    }
    if (!(((p1).length != 1))) {
        break forward_join_38;
    }
    throw new moom.cc("commands.debug.usage", new java.lang.Object[0]);
    }
    __call1477_5(p0, receiver, "commands.debug.start", new java.lang.Object[0]);
    __call1477_7(__call1477_6());
    __fieldWrite1477_9(receiver, __call1477_8());
    __fieldWrite1477_12(receiver, __call1477_11(__call1477_10()));
    if (!((life5_5 != 0))) {
        break forward_join_136;
    }
    }
    forwardValue1477_60_0 = __integerCategory1477_14(__call1477_13((p1)[0], "stop"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1477_72_0 = forwardValue1477_60_0;
        break forward_join_72;
    }
    if (!((forwardValue1477_60_0 == 0))) {
        break forward_join_70;
    }
    throw new moom.cc("commands.debug.usage", new java.lang.Object[0]);
    }
    forwardValue1477_72_0 = (p1).length;
    }
    if (!((life5_5 == 0))) {
        forwardValue1477_86_0 = forwardValue1477_72_0;
        break forward_join_86;
    }
    if (!((forwardValue1477_72_0 != 1))) {
        break forward_join_83;
    }
    throw new moom.cc("commands.debug.usage", new java.lang.Object[0]);
    }
    forwardValue1477_86_0 = __integerCategory1477_18(__fieldRead1477_17(__fieldRead1477_16(__call1477_15())));
    }
    if (!((forwardValue1477_86_0 == 0))) {
        break forward_join_94;
    }
    throw new moom.b7("commands.debug.notStarted", new java.lang.Object[0]);
    }
    life6_123 = __call1477_19();
    life8_126 = __call1477_21(__call1477_20());
    life9_131 = (life6_123 - __fieldRead1477_22(receiver));
    life11_136 = (life8_126 - __fieldRead1477_23(receiver));
    __call1477_24(receiver, life9_131, life11_136);
    __fieldWrite1477_27(__fieldRead1477_26(__call1477_25()), 0);
    __call1477_30(p0, receiver, "commands.debug.stop", new java.lang.Object[] {__call1477_28((((float) life9_131) / 0x1.f4p9f)), __call1477_29(life11_136)});
    }
    return;
}
public static void h1477_0(moom.b7 p0) throws Throwable {
    throw __call1147700_0(p0);
}
public static void h1477_1(moom.b7 p0) throws Throwable {
    throw __call1147701_0(p0);
}
public static void h1477_2(moom.b7 p0) throws Throwable {
    throw __call1147702_0(p0);
}
public static void h1477_3(moom.b7 p0) throws Throwable {
    throw __call1147703_0(p0);
}
public static void h1477_4(moom.b7 p0) throws Throwable {
    throw __call1147704_0(p0);
}
public static void h1477_5(moom.b7 p0) throws Throwable {
    throw __call1147705_0(p0);
}
public static void h1477_6(moom.b7 p0) throws Throwable {
    throw __call1147706_0(p0);
}
public static void h1477_7(moom.b7 p0) throws Throwable {
    throw __call1147707_0(p0);
}
public static void h1477_8(moom.b7 p0) throws Throwable {
    throw __call1147708_0(p0);
}
public static void h1477_9(moom.b7 p0) throws Throwable {
    throw __call1147709_0(p0);
}
public static void h1477_10(moom.b7 p0) throws Throwable {
    throw __call1147710_0(p0);
}
private static native long __fieldRead1477_0() throws Throwable;
private static native boolean __call1477_1() throws Throwable;
private static native int __integerCategory1477_2(boolean value) throws Throwable;
private static native boolean __call1477_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1477_4(boolean value) throws Throwable;
private static native void __call1477_5(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandDebug a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native moom.Bl __call1477_6() throws Throwable;
private static native void __call1477_7(moom.Bl a0) throws Throwable;
private static native long __call1477_8() throws Throwable;
private static native void __fieldWrite1477_9(net.minecraft.command.CommandDebug a0, long a1) throws Throwable;
private static native moom.Bl __call1477_10() throws Throwable;
private static native int __call1477_11(moom.Bl a0) throws Throwable;
private static native void __fieldWrite1477_12(net.minecraft.command.CommandDebug a0, int a1) throws Throwable;
private static native boolean __call1477_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1477_14(boolean value) throws Throwable;
private static native moom.Bl __call1477_15() throws Throwable;
private static native moom.A9 __fieldRead1477_16(moom.Bl a0) throws Throwable;
private static native boolean __fieldRead1477_17(moom.A9 a0) throws Throwable;
private static native int __integerCategory1477_18(boolean value) throws Throwable;
private static native long __call1477_19() throws Throwable;
private static native moom.Bl __call1477_20() throws Throwable;
private static native int __call1477_21(moom.Bl a0) throws Throwable;
private static native long __fieldRead1477_22(net.minecraft.command.CommandDebug a0) throws Throwable;
private static native int __fieldRead1477_23(net.minecraft.command.CommandDebug a0) throws Throwable;
private static native void __call1477_24(net.minecraft.command.CommandDebug a0, long a1, int a2) throws Throwable;
private static native moom.Bl __call1477_25() throws Throwable;
private static native moom.A9 __fieldRead1477_26(moom.Bl a0) throws Throwable;
private static native void __fieldWrite1477_27(moom.A9 a0, int a1) throws Throwable;
private static native java.lang.Float __call1477_28(float a0) throws Throwable;
private static native java.lang.Integer __call1477_29(int a0) throws Throwable;
private static native void __call1477_30(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandDebug a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1147700_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147701_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147702_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147703_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147704_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147705_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147706_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147707_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147708_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147709_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147710_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_fede80f84f116d637f75(net.minecraft.command.CommandDebug a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_fede80f84f116d637f75 {

public static java.util.List f1478(net.minecraft.command.CommandDebug receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1478_13_0;
    java.util.List forwardValue1478_26_0;
    java.lang.String[] spill1478_0;
    long life4_3;
    int life6_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_13: {
    life4_3 = (__fieldRead1478_0() ^ 118940153503453L);
    life6_5 = __integerCategory1478_2(__call1478_1());
    spill1478_0 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1478_13_0 = spill1478_0;
        break forward_join_13;
    }
    if (!(((spill1478_0).length == 1))) {
        break forward_join_25;
    }
    forwardValue1478_13_0 = p1;
    }
    forwardValue1478_26_0 = __call1478_3(forwardValue1478_13_0, new java.lang.String[] {"start", "stop"});
    break forward_join_26;
    }
    forwardValue1478_26_0 = null;
    }
    return forwardValue1478_26_0;
}
public static void h1478_0(moom.Oo p0) throws Throwable {
    throw __call1147800_0(p0);
}
public static void h1478_1(moom.Oo p0) throws Throwable {
    throw __call1147801_0(p0);
}
private static native long __fieldRead1478_0() throws Throwable;
private static native boolean __call1478_1() throws Throwable;
private static native int __integerCategory1478_2(boolean value) throws Throwable;
private static native java.util.List __call1478_3(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1147800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_20c98eb792fc7f2054c7() throws E;
private static final class __SourceHandler_20c98eb792fc7f2054c7 {

public static java.lang.String f576() throws Throwable {
    long life0_3;
    java.lang.String[] life2_98;
    life0_3 = (__fieldRead576_0() ^ 53684034450865L);
    java.lang.String[] __stackOp576_2_0 = new java.lang.String[__invokedynamic576_1(27536, (1817678315930098665L ^ life0_3))];
    java.lang.String[] spill576_0 = __stackOp576_2_0;
    (__stackOp576_2_0)[0] = "Shiny numbers!";
    java.lang.String[] __stackOp576_3_0 = spill576_0;
    java.lang.String[] spill576_1 = __stackOp576_3_0;
    (__stackOp576_3_0)[1] = "Am I not running fast enough? :(";
    java.lang.String[] __stackOp576_4_0 = spill576_1;
    java.lang.String[] spill576_2 = __stackOp576_4_0;
    (__stackOp576_4_0)[2] = "I'm working as hard as I can!";
    java.lang.String[] __stackOp576_5_0 = spill576_2;
    java.lang.String[] spill576_3 = __stackOp576_5_0;
    (__stackOp576_5_0)[3] = "Will I ever be good enough for you? :(";
    java.lang.String[] __stackOp576_6_0 = spill576_3;
    java.lang.String[] spill576_4 = __stackOp576_6_0;
    (__stackOp576_6_0)[4] = "Speedy. Zoooooom!";
    java.lang.String[] __stackOp576_7_0 = spill576_4;
    java.lang.String[] spill576_5 = __stackOp576_7_0;
    (__stackOp576_7_0)[5] = "Hello world";
    java.lang.String[] __stackOp576_8_0 = spill576_5;
    java.lang.String[] spill576_6 = __stackOp576_8_0;
    (__stackOp576_8_0)[__invokedynamic576_9(7760, (977232036646710827L ^ life0_3))] = "40% better than a crash report.";
    java.lang.String[] __stackOp576_10_0 = spill576_6;
    java.lang.String[] spill576_7 = __stackOp576_10_0;
    (__stackOp576_10_0)[__invokedynamic576_11(15063, (5491250968922475172L ^ life0_3))] = "Now with extra numbers";
    java.lang.String[] __stackOp576_12_0 = spill576_7;
    java.lang.String[] spill576_8 = __stackOp576_12_0;
    (__stackOp576_12_0)[__invokedynamic576_13(11792, (8184029924041121391L ^ life0_3))] = "Now with less numbers";
    java.lang.String[] __stackOp576_14_0 = spill576_8;
    java.lang.String[] spill576_9 = __stackOp576_14_0;
    (__stackOp576_14_0)[__invokedynamic576_15(15533, (1974806433004768465L ^ life0_3))] = "Now with the same numbers";
    java.lang.String[] __stackOp576_16_0 = spill576_9;
    java.lang.String[] spill576_10 = __stackOp576_16_0;
    (__stackOp576_16_0)[__invokedynamic576_17(27642, (5063141339218090888L ^ life0_3))] = "You should add flames to things, it makes them go faster!";
    java.lang.String[] __stackOp576_18_0 = spill576_10;
    java.lang.String[] spill576_11 = __stackOp576_18_0;
    (__stackOp576_18_0)[__invokedynamic576_19(21893, (8906750220883338747L ^ life0_3))] = "Do you feel the need for... optimization?";
    java.lang.String[] __stackOp576_20_0 = spill576_11;
    java.lang.String[] spill576_12 = __stackOp576_20_0;
    (__stackOp576_20_0)[__invokedynamic576_21(11575, (2230615894408617295L ^ life0_3))] = "*cracks redstone whip*";
    java.lang.String[] __stackOp576_22_0 = spill576_12;
    java.lang.String[] spill576_13 = __stackOp576_22_0;
    (__stackOp576_22_0)[__invokedynamic576_23(18320, (3124804522100668397L ^ life0_3))] = "Maybe if you treated it better then it'll have more motivation to work faster! Poor server.";
    life2_98 = spill576_13;
    return (life2_98)[((int) (__call576_24() % ((long) (life2_98).length)))];
}
public static java.lang.String h576_0(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    return "Witty comment unavailable :(";
}
private static native long __fieldRead576_0() throws Throwable;
private static native int __invokedynamic576_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic576_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic576_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic576_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic576_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic576_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic576_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic576_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic576_23(int a0, long a1) throws Throwable;
private static native long __call576_24() throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11030_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 490;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/pP", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.command.CommandDebug.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String c() { return __sourceHandlerCall_20c98eb792fc7f2054c7(); }


private void a(int p0, java.lang.String p1, java.lang.StringBuilder p2) { __sourceHandlerCall_2a51bd77845249d2c62d(this, p0, p1, p2); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.debug.usage";
}


public int a() {
return 3;
}


public java.lang.String a__String() {
return "debug";
}


private void a__Void(long p0, int p1) {
java.io.File life4_15;
    java.io.FileWriter life5_24;
    life4_15 = new java.io.File(((moom.Bl)(moom.Bl.a__Bl())).a(((java.lang.String)("debug"))), __sourceIntrinsic_8f348364cb87_invokedynamic9022_3(((java.text.SimpleDateFormat)(new java.text.SimpleDateFormat("yyyy-MM-dd_HH.mm.ss"))).format(((java.util.Date)(new java.util.Date())))));
    ((java.io.File)(((java.io.File)(life4_15)).getParentFile())).mkdirs();
    try {
        life5_24 = new java.io.FileWriter(life4_15);
        ((java.io.FileWriter)(life5_24)).write(((java.lang.String)(((net.minecraft.command.CommandDebug)(this)).a(((long)(p0)), ((int)(p1))))));
        ((java.io.FileWriter)(life5_24)).close();
    } catch (java.lang.Throwable life5_34) {
        ((org.apache.logging.log4j.Logger)(net.minecraft.command.CommandDebug.c)).error(((java.lang.String)(__sourceIntrinsic_8f348364cb87_invokedynamic9022_10(life4_15))), ((java.lang.Throwable)(life5_34)));
    }
    return;
}


private java.lang.String a(long p0, int p1) {
long local4 = (net.minecraft.command.CommandDebug.g ^ 113752398115957L);
    java.lang.StringBuilder local6 = new java.lang.StringBuilder();
    ((java.lang.StringBuilder)(local6)).append(((java.lang.String)("---- Minecraft Profiler Results ----\n")));
    ((java.lang.StringBuilder)(local6)).append(((java.lang.String)("// ")));
    ((java.lang.StringBuilder)(local6)).append(((java.lang.String)(net.minecraft.command.CommandDebug.c())));
    ((java.lang.StringBuilder)(local6)).append(((java.lang.String)("\n\n")));
    ((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(local6)).append(((java.lang.String)("Time span: "))))).append(((long)(p0))))).append(((java.lang.String)(" ms\n")));
    ((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(local6)).append(((java.lang.String)("Tick span: "))))).append(((int)(p1))))).append(((java.lang.String)(" ticks\n")));
    ((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(local6)).append(((java.lang.String)("// This is approximately "))))).append(((java.lang.String)(java.lang.String.format(((java.lang.String)("%.2f")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Float.valueOf(((float)((((float) p1) / (((float) p0) / 0x1.f4p9f)))))})))))))).append(((java.lang.String)(" ticks per second. It should be "))))).append(((int)(__sourceIntrinsic_c5e9979775ff_originalDynamicSite1859_17(22979, (6583678894095804541L ^ local4))))))).append(((java.lang.String)(" ticks per second\n\n")));
    ((java.lang.StringBuilder)(local6)).append(((java.lang.String)("--- BEGIN PROFILE DUMP ---\n\n")));
    ((net.minecraft.command.CommandDebug)(this)).a(((int)(0)), ((java.lang.String)("root")), ((java.lang.StringBuilder)(local6)));
    ((java.lang.StringBuilder)(local6)).append(((java.lang.String)("--- END PROFILE DUMP ---\n\n")));
    return ((java.lang.StringBuilder)(local6)).toString();
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_17b9f6e7e681d2e3511d(this, p0, p1); }


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_fede80f84f116d637f75(this, p0, p1, p2); }


private static native <E extends Throwable> int __sourceIntrinsic_c5e9979775ff_originalDynamicSite1859_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8f348364cb87_invokedynamic9022_3(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8f348364cb87_invokedynamic9022_10(java.io.File a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11030_0() throws E;
}
