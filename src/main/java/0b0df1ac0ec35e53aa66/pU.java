package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pU extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public pU() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-2224433578830169202L)), ((long)(8248914561138790336L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(116931339889513L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.pU.c ^ 59231668757859L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1459_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1459_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1459_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1459_14 = new byte[8];
    (__sourceSpill1459_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1459_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1459_16 = __sourceSpill1459_14;
    ((javax.crypto.Cipher)(__sourceSpill1459_11)).init(((int)(__sourceSpill1459_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1459_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1459_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¹Ø¾æ¾öq\007¡©\023ì\002e`NZÒ\0208qÁ»\022£JiË±Û4ØÜÛujMÄ7À3_ÞöË\0077[ü"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1459_25 = local6_life21;
        int __sourceSpill1459_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1459_25)).substring(((int)(__sourceSpill1459_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1459_30 = local8_life19;
        int __sourceSpill1459_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1459_33 = new byte[8];
        (__sourceSpill1459_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1459_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1459_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1459_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1459_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1459_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1459_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1459_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1459_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1459_34)).doFinal(((byte[])(__sourceSpill1459_33)));
        (__sourceSpill1459_30)[__sourceSpill1459_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "+8¨%\001=|içp\020\017\031÷"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1459_38 = local6_life21;
        int __sourceSpill1459_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1459_38)).substring(((int)(__sourceSpill1459_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1459_43 = local8_life19;
        int __sourceSpill1459_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1459_46 = new byte[8];
        (__sourceSpill1459_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1459_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1459_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1459_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1459_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1459_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1459_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1459_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1459_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1459_47)).doFinal(((byte[])(__sourceSpill1459_46)));
        (__sourceSpill1459_43)[__sourceSpill1459_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[9]));
}

private static native <E extends Throwable> void __sourceHandlerCall_89e80267d2f805c3c743(moom.pU a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_89e80267d2f805c3c743 {

public static void f148(moom.pU receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue148_180_0;
    java.lang.String[] forwardValue148_182_0;
    java.lang.String forwardValue148_184_0;
    java.lang.String spill148_0;
    java.lang.String[] spill148_1;
    int spill148_2;
    int spill148_3;
    long life3_3;
    int life5_5;
    net.minecraft.entity.Entity life6_25;
    double life7_33;
    double life9_41;
    double life11_49;
    moom.DT life13_56;
    int life14_58;
    net.minecraft.world.World life15_88;
    double life16_95;
    double life18_106;
    double life20_117;
    net.minecraft.block.Block life22_127;
    int life23_142;
    moom.DT life24_149;
    net.minecraft.block.state.IBlockState life25_153;
    java.lang.String life15_209;
    moom.qJ life16_220;
    net.minecraft.command.ICommandManager life17_223;
    int life18_228;
    forward_join_218: {
    forward_join_184: {
    forward_join_182: {
    forward_join_181: {
    forward_join_180: {
    forward_join_175: {
    forward_join_159: {
    forward_join_17: {
    life3_3 = (__fieldRead148_0() ^ 103436177869787L);
    life5_5 = __integerCategory148_2(__call148_1());
    if (!(((p1).length < 5))) {
        break forward_join_17;
    }
    throw new moom.cc("commands.execute.usage", new java.lang.Object[0]);
    }
    life6_25 = __call148_4(p0, (p1)[0], __classLiteral148_3());
    life7_33 = __call148_6(__fieldRead148_5(life6_25), (p1)[1], 0);
    life9_41 = __call148_8(__fieldRead148_7(life6_25), (p1)[2], 0);
    life11_49 = __call148_10(__fieldRead148_9(life6_25), (p1)[3], 0);
    life13_56 = new moom.DT(life7_33, life9_41, life11_49);
    life14_58 = 4;
    spill148_0 = "detect";
    if (!((life5_5 == 0))) {
        forwardValue148_184_0 = spill148_0;
        break forward_join_184;
    }
    if (!(__call148_11(spill148_0, (p1)[4]))) {
        break forward_join_181;
    }
    spill148_1 = p1;
    if (!((life5_5 == 0))) {
        forwardValue148_182_0 = spill148_1;
        break forward_join_182;
    }
    if (!(((spill148_1).length > __invokedynamic148_12(3223, (4505815214837391477L ^ life3_3))))) {
        break forward_join_181;
    }
    life15_88 = __call148_13(life6_25);
    life16_95 = __call148_14(life7_33, (p1)[5], 0);
    life18_106 = __call148_16(life9_41, (p1)[__invokedynamic148_15(4702, (4032107521841430195L ^ life3_3))], 0);
    life20_117 = __call148_18(life11_49, (p1)[__invokedynamic148_17(17957, (6888521843619998404L ^ life3_3))], 0);
    life22_127 = __call148_20(p0, (p1)[__invokedynamic148_19(30447, (6724396559155108364L ^ life3_3))]);
    life23_142 = __call148_23((p1)[__invokedynamic148_21(15353, (3380978013745501980L ^ life3_3))], -1, __invokedynamic148_22(9273, (4678016542578755805L ^ life3_3)));
    life24_149 = new moom.DT(life16_95, life18_106, life20_117);
    life25_153 = __call148_24(life15_88, life24_149);
    if (!((__call148_25(life25_153) == life22_127))) {
        break forward_join_159;
    }
    spill148_2 = life23_142;
    if (!((life5_5 == 0))) {
        forwardValue148_180_0 = spill148_2;
        break forward_join_180;
    }
    if (!((spill148_2 >= 0))) {
        break forward_join_175;
    }
    spill148_3 = __call148_27(__call148_26(life25_153), life25_153);
    if (!((life5_5 == 0))) {
        forwardValue148_180_0 = spill148_3;
        break forward_join_180;
    }
    if (!((spill148_3 != life23_142))) {
        break forward_join_175;
    }
    }
    throw new moom.b7("commands.execute.failed", new java.lang.Object[] {"detect", __call148_28(life6_25)});
    }
    forwardValue148_180_0 = __invokedynamic148_29(13812, (8751392616295717139L ^ life3_3));
    }
    life14_58 = forwardValue148_180_0;
    }
    forwardValue148_182_0 = p1;
    }
    forwardValue148_184_0 = __call148_30(forwardValue148_182_0, life14_58);
    }
    life15_209 = forwardValue148_184_0;
    life16_220 = new moom.qJ(receiver, life6_25, p0, life13_56, life7_33, life9_41, life11_49);
    life17_223 = __call148_32(__call148_31());
    life18_228 = __call148_33(life17_223, life16_220, life15_209);
    if (!((life18_228 < 1))) {
        break forward_join_218;
    }
    throw new moom.b7("commands.execute.allInvocationsFailed", new java.lang.Object[] {life15_209});
    }
    return;
}
public static void h148_0(java.lang.Throwable p0) throws Throwable {
    throw __call3014800_0(p0);
}
public static void h148_1(java.lang.Throwable p0) throws Throwable {
    throw __call3014801_0(p0);
}
public static void h148_2(java.lang.Throwable p0) throws Throwable {
    throw __call3014802_0(p0);
}
public static void h148_3(java.lang.Throwable p0) throws Throwable {
    throw __call3014803_0(p0);
}
public static void h148_4(java.lang.Throwable p0) throws Throwable {
    throw __call3014804_0(p0);
}
public static void h148_5(java.lang.Throwable p0) throws Throwable {
    throw __call3014805_0(p0);
}
public static void h148_6(java.lang.Throwable p0) throws Throwable {
    throw __call3014806_0(p0);
}
public static void h148_7(java.lang.Throwable p0) throws Throwable {
    throw __call3014807_0(p0);
}
public static void h148_8(java.lang.Throwable p0) throws Throwable {
    throw __call3014808_0(p0);
}
public static void h148_9(java.lang.Throwable p0) throws Throwable {
    throw __call3014809_0(p0);
}
public static void h148_10(java.lang.Throwable p0, net.minecraft.entity.Entity p1, java.lang.String p2) throws Throwable {
    java.lang.Throwable life3_2;
    life3_2 = p0;
    throw new moom.b7("commands.execute.failed", new java.lang.Object[] {p2, __call3014810_0(p1)});
}
private static native long __fieldRead148_0() throws Throwable;
private static native boolean __call148_1() throws Throwable;
private static native int __integerCategory148_2(boolean value) throws Throwable;
private static native java.lang.Class __classLiteral148_3() throws Throwable;
private static native net.minecraft.entity.Entity __call148_4(net.minecraft.command.ICommandSender a0, java.lang.String a1, java.lang.Class a2) throws Throwable;
private static native double __fieldRead148_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call148_6(double a0, java.lang.String a1, int a2) throws Throwable;
private static native double __fieldRead148_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call148_8(double a0, java.lang.String a1, int a2) throws Throwable;
private static native double __fieldRead148_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call148_10(double a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call148_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic148_12(int a0, long a1) throws Throwable;
private static native net.minecraft.world.World __call148_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call148_14(double a0, java.lang.String a1, int a2) throws Throwable;
private static native int __invokedynamic148_15(int a0, long a1) throws Throwable;
private static native double __call148_16(double a0, java.lang.String a1, int a2) throws Throwable;
private static native int __invokedynamic148_17(int a0, long a1) throws Throwable;
private static native double __call148_18(double a0, java.lang.String a1, int a2) throws Throwable;
private static native int __invokedynamic148_19(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __call148_20(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic148_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic148_22(int a0, long a1) throws Throwable;
private static native int __call148_23(java.lang.String a0, int a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call148_24(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call148_25(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __call148_26(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call148_27(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native java.lang.String __call148_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic148_29(int a0, long a1) throws Throwable;
private static native java.lang.String __call148_30(java.lang.String[] a0, int a1) throws Throwable;
private static native moom.Bl __call148_31() throws Throwable;
private static native net.minecraft.command.ICommandManager __call148_32(moom.Bl a0) throws Throwable;
private static native int __call148_33(net.minecraft.command.ICommandManager a0, moom.qJ a1, java.lang.String a2) throws Throwable;
private static native java.lang.Throwable __call3014800_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3014801_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3014802_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3014803_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3014804_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3014805_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3014806_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3014807_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3014808_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3014809_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __call3014810_0(net.minecraft.entity.Entity a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_233c3dfcea695c658acb(moom.pU a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_233c3dfcea695c658acb {

public static java.util.List f1123(moom.pU receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1123_20_0;
    int forwardValue1123_20_1;
    int forwardValue1123_37_0;
    int forwardValue1123_37_1;
    int forwardValue1123_65_0;
    int forwardValue1123_72_0;
    int forwardValue1123_72_1;
    int forwardValue1123_78_0;
    java.util.List forwardValue1123_85_0;
    int spill1123_0;
    int spill1123_1;
    int spill1123_2;
    int spill1123_3;
    int spill1123_4;
    int spill1123_5;
    boolean spill1123_6;
    long life4_3;
    int life6_5;
    forward_join_85: {
    forward_join_84: {
    forward_join_78: {
    forward_join_72: {
    forward_join_65: {
    forward_join_63: {
    forward_join_37: {
    forward_join_34: {
    forward_join_20: {
    forward_join_17: {
    life4_3 = (__fieldRead1123_0() ^ 27607236942424L);
    life6_5 = __integerCategory1123_2(__call1123_1());
    spill1123_0 = (p1).length;
    spill1123_1 = 1;
    if (!((life6_5 == 0))) {
        forwardValue1123_20_0 = spill1123_0;
        forwardValue1123_20_1 = spill1123_1;
        break forward_join_20;
    }
    if (!((spill1123_0 == spill1123_1))) {
        break forward_join_17;
    }
    forwardValue1123_85_0 = __call1123_5(p1, __call1123_4(__call1123_3()));
    break forward_join_85;
    }
    forwardValue1123_20_0 = (p1).length;
    forwardValue1123_20_1 = 1;
    }
    if (!((life6_5 == 0))) {
        forwardValue1123_37_0 = forwardValue1123_20_0;
        forwardValue1123_37_1 = forwardValue1123_20_1;
        break forward_join_37;
    }
    if (!((forwardValue1123_20_0 > forwardValue1123_20_1))) {
        break forward_join_34;
    }
    spill1123_2 = (p1).length;
    spill1123_3 = 4;
    if (!((life6_5 == 0))) {
        forwardValue1123_37_0 = spill1123_2;
        forwardValue1123_37_1 = spill1123_3;
        break forward_join_37;
    }
    if (!((spill1123_2 <= spill1123_3))) {
        break forward_join_34;
    }
    forwardValue1123_85_0 = __call1123_6(p1, 1, p2);
    break forward_join_85;
    }
    forwardValue1123_37_0 = (p1).length;
    forwardValue1123_37_1 = 5;
    }
    if (!((life6_5 == 0))) {
        forwardValue1123_72_0 = forwardValue1123_37_0;
        forwardValue1123_72_1 = forwardValue1123_37_1;
        break forward_join_72;
    }
    if (!((forwardValue1123_37_0 > forwardValue1123_37_1))) {
        break forward_join_63;
    }
    spill1123_4 = (p1).length;
    spill1123_5 = __invokedynamic1123_7(2455, (2602734306727326962L ^ life4_3));
    if (!((life6_5 == 0))) {
        forwardValue1123_72_0 = spill1123_4;
        forwardValue1123_72_1 = spill1123_5;
        break forward_join_72;
    }
    if (!((spill1123_4 <= spill1123_5))) {
        break forward_join_63;
    }
    spill1123_6 = __call1123_8("detect", (p1)[4]);
    if (!((life6_5 == 0))) {
        forwardValue1123_65_0 = __integerCategory1123_9(spill1123_6);
        break forward_join_65;
    }
    if (!(spill1123_6)) {
        break forward_join_63;
    }
    forwardValue1123_85_0 = __call1123_10(p1, 5, p2);
    break forward_join_85;
    }
    forwardValue1123_65_0 = (p1).length;
    }
    if (!((life6_5 == 0))) {
        forwardValue1123_78_0 = forwardValue1123_65_0;
        break forward_join_78;
    }
    forwardValue1123_72_0 = forwardValue1123_65_0;
    forwardValue1123_72_1 = __invokedynamic1123_11(19554, (728027665693094145L ^ life4_3));
    }
    if (!((forwardValue1123_72_0 == forwardValue1123_72_1))) {
        break forward_join_84;
    }
    forwardValue1123_78_0 = __integerCategory1123_13(__call1123_12("detect", (p1)[4]));
    }
    if (!((forwardValue1123_78_0 != 0))) {
        break forward_join_84;
    }
    forwardValue1123_85_0 = __call1123_16(p1, __call1123_15(__fieldRead1123_14()));
    break forward_join_85;
    }
    forwardValue1123_85_0 = null;
    }
    return forwardValue1123_85_0;
}
public static void h1123_0(moom.Oo p0) throws Throwable {
    throw __call1112300_0(p0);
}
public static void h1123_1(moom.Oo p0) throws Throwable {
    throw __call1112301_0(p0);
}
public static void h1123_2(moom.Oo p0) throws Throwable {
    throw __call1112302_0(p0);
}
public static void h1123_3(moom.Oo p0) throws Throwable {
    throw __call1112303_0(p0);
}
public static void h1123_4(moom.Oo p0) throws Throwable {
    throw __call1112304_0(p0);
}
public static void h1123_5(moom.Oo p0) throws Throwable {
    throw __call1112305_0(p0);
}
public static void h1123_6(moom.Oo p0) throws Throwable {
    throw __call1112306_0(p0);
}
public static void h1123_7(moom.Oo p0) throws Throwable {
    throw __call1112307_0(p0);
}
public static void h1123_8(moom.Oo p0) throws Throwable {
    throw __call1112308_0(p0);
}
public static void h1123_9(moom.Oo p0) throws Throwable {
    throw __call1112309_0(p0);
}
public static void h1123_10(moom.Oo p0) throws Throwable {
    throw __call1112310_0(p0);
}
public static void h1123_11(moom.Oo p0) throws Throwable {
    throw __call1112311_0(p0);
}
public static void h1123_12(moom.Oo p0) throws Throwable {
    throw __call1112312_0(p0);
}
public static void h1123_13(moom.Oo p0) throws Throwable {
    throw __call1112313_0(p0);
}
public static void h1123_14(moom.Oo p0) throws Throwable {
    throw __call1112314_0(p0);
}
private static native long __fieldRead1123_0() throws Throwable;
private static native boolean __call1123_1() throws Throwable;
private static native int __integerCategory1123_2(boolean value) throws Throwable;
private static native moom.Bl __call1123_3() throws Throwable;
private static native java.lang.String[] __call1123_4(moom.Bl a0) throws Throwable;
private static native java.util.List __call1123_5(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.util.List __call1123_6(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1123_7(int a0, long a1) throws Throwable;
private static native boolean __call1123_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1123_9(boolean value) throws Throwable;
private static native java.util.List __call1123_10(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1123_11(int a0, long a1) throws Throwable;
private static native boolean __call1123_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1123_13(boolean value) throws Throwable;
private static native moom.DC __fieldRead1123_14() throws Throwable;
private static native java.util.Set __call1123_15(moom.DC a0) throws Throwable;
private static native java.util.List __call1123_16(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native java.lang.Throwable __call1112300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112308_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112309_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112310_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112311_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112312_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112313_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1112314_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_1aaa464c421f35ca1438(moom.pU a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_1aaa464c421f35ca1438 {

public static boolean f1124(moom.pU receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1124_11_0;
    int forwardValue1124_13_0;
    int spill1124_0;
    long life3_3;
    int life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (__fieldRead1124_0() ^ 37105330072131L);
    life5_5 = __integerCategory1124_2(__call1124_1());
    spill1124_0 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1124_11_0 = spill1124_0;
        break forward_join_11;
    }
    if (!((spill1124_0 == 0))) {
        break forward_join_12;
    }
    forwardValue1124_11_0 = 1;
    }
    forwardValue1124_13_0 = forwardValue1124_11_0;
    break forward_join_13;
    }
    forwardValue1124_13_0 = 0;
    }
    return __integerCategory1124_3(forwardValue1124_13_0);
}
public static void h1124_0(moom.Oo p0) throws Throwable {
    throw __call1112400_0(p0);
}
private static native long __fieldRead1124_0() throws Throwable;
private static native boolean __call1124_1() throws Throwable;
private static native int __integerCategory1124_2(boolean value) throws Throwable;
private static native boolean __integerCategory1124_3(int value) throws Throwable;
private static native java.lang.Throwable __call1112400_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8685_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26522;
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
            throw new RuntimeException("moom/pU", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.pU.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "execute";
}


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_1aaa464c421f35ca1438(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.execute.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_89e80267d2f805c3c743(this, p0, p1); }


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_233c3dfcea695c658acb(this, p0, p1, p2); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8685_0() throws E;
}
