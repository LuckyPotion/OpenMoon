package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class p2 extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public p2() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(2976985100385108005L)), ((long)(7324600039008944456L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(185017702028438L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.p2.c ^ 47299790598096L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1452_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1452_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1452_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1452_14 = new byte[8];
    (__sourceSpill1452_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1452_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1452_16 = __sourceSpill1452_14;
    ((javax.crypto.Cipher)(__sourceSpill1452_11)).init(((int)(__sourceSpill1452_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1452_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1452_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "SH}+\013ä\031ììv\003Nuab\000PCäP\025\n\177UAiÑ/\030ÀÍÑ@ý)"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1452_25 = local6_life21;
        int __sourceSpill1452_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1452_25)).substring(((int)(__sourceSpill1452_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1452_30 = local8_life19;
        int __sourceSpill1452_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1452_33 = new byte[8];
        (__sourceSpill1452_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1452_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1452_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1452_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1452_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1452_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1452_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1452_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1452_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1452_34)).doFinal(((byte[])(__sourceSpill1452_33)));
        (__sourceSpill1452_30)[__sourceSpill1452_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ýí¹É9M>3ýËfPè "))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1452_38 = local6_life21;
        int __sourceSpill1452_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1452_38)).substring(((int)(__sourceSpill1452_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1452_43 = local8_life19;
        int __sourceSpill1452_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1452_46 = new byte[8];
        (__sourceSpill1452_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1452_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1452_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1452_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1452_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1452_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1452_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1452_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1452_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1452_47)).doFinal(((byte[])(__sourceSpill1452_46)));
        (__sourceSpill1452_43)[__sourceSpill1452_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceHandlerCall_8632e541dfb2f21dfed7(moom.p2 a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_8632e541dfb2f21dfed7 {

public static void f142(moom.p2 receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int lexicalValue142_24_0;
    int lexicalValue142_56_0;
    int lexicalValue142_66_0;
    int lexicalValue142_70_0;
    int lexicalValue142_195_0;
    int lexicalValue142_195_1;
    int lexicalValue142_205_0;
    int lexicalValue142_209_0;
    int lexicalValue142_211_0;
    net.minecraft.world.World lexicalValue142_221_0;
    int spill142_0;
    boolean spill142_1;
    boolean spill142_2;
    int spill142_3;
    int spill142_4;
    int spill142_5;
    net.minecraft.world.World spill142_6;
    long life3_3;
    int life5_5;
    int life6_29;
    net.minecraft.util.EnumParticleTypes life7_31;
    net.minecraft.util.EnumParticleTypes[] life8_33;
    int life9_36;
    int life10_38;
    net.minecraft.util.EnumParticleTypes life11_45;
    java.lang.String life8_113;
    moom.DR life9_116;
    double life10_126;
    double life12_136;
    double life14_146;
    double life16_153;
    double life18_160;
    double life20_171;
    double life22_182;
    int life24_184;
    int life25_242;
    net.minecraft.world.World life26_245;
    net.minecraft.world.WorldServer life27_259;
    int[] life28_263;
    java.lang.String[] life29_278;
    int life30_280;
    lexical_join_289: {
    lexical_join_272: {
    lexical_join_259: {
    lexical_join_221: {
    lexical_join_211: {
    lexical_join_210: {
    lexical_join_209: {
    lexical_join_205: {
    lexical_join_195: {
    lexical_join_186: {
    lexical_join_91: {
    lexical_join_76: {
    lexical_join_24: {
    lexical_join_23: {
    life3_3 = (__fieldRead142_0() ^ 125290442544223L);
    life5_5 = __integerCategory142_2(__call142_1());
    spill142_0 = (p1).length;
    if (!((life5_5 == 0))) {
        lexicalValue142_24_0 = spill142_0;
        break lexical_join_24;
    }
    if (!((spill142_0 < __invokedynamic142_3(28074, (241792102349612114L ^ life3_3))))) {
        break lexical_join_23;
    }
    throw new moom.cc("commands.particle.usage", new java.lang.Object[0]);
    }
    lexicalValue142_24_0 = 0;
    }
    life6_29 = lexicalValue142_24_0;
    life7_31 = null;
    life8_33 = __call142_4();
    life9_36 = (life8_33).length;
    life10_38 = 0;
    lexical_cycle_34: while (true) {
    lexical_join_74: {
    lexical_join_70: {
    lexical_join_66: {
    lexical_join_60: {
    lexical_join_56: {
    if (!((life10_38 < life9_36))) {
        break lexical_join_76;
    }
    life11_45 = (life8_33)[life10_38];
    spill142_1 = __call142_5(life11_45);
    if (!((life5_5 == 0))) {
        lexicalValue142_66_0 = __integerCategory142_6(spill142_1);
        break lexical_join_66;
    }
    if (!(spill142_1)) {
        break lexical_join_60;
    }
    spill142_2 = __call142_8((p1)[0], __call142_7(life11_45));
    if (!((life5_5 == 0))) {
        lexicalValue142_56_0 = __integerCategory142_9(spill142_2);
        break lexical_join_56;
    }
    if (!(spill142_2)) {
        break lexical_join_74;
    }
    lexicalValue142_56_0 = 1;
    }
    life6_29 = lexicalValue142_56_0;
    life7_31 = life11_45;
    break lexical_join_76;
    }
    lexicalValue142_66_0 = __integerCategory142_12(__call142_11((p1)[0], __call142_10(life11_45)));
    }
    if (!((life5_5 == 0))) {
        lexicalValue142_70_0 = lexicalValue142_66_0;
        break lexical_join_70;
    }
    if (!((lexicalValue142_66_0 != 0))) {
        break lexical_join_74;
    }
    lexicalValue142_70_0 = 1;
    }
    life6_29 = lexicalValue142_70_0;
    life7_31 = life11_45;
    break lexical_join_76;
    }
    life10_38 += 1;
    continue lexical_cycle_34;
    }
    }
    if (!((life6_29 == 0))) {
        break lexical_join_91;
    }
    throw new moom.b7("commands.particle.notFound", new java.lang.Object[] {(p1)[0]});
    }
    life8_113 = (p1)[0];
    life9_116 = __call142_13(p0);
    life10_126 = ((double) ((float) __call142_15(__fieldRead142_14(life9_116), (p1)[1], 1)));
    life12_136 = ((double) ((float) __call142_17(__fieldRead142_16(life9_116), (p1)[2], 1)));
    life14_146 = ((double) ((float) __call142_19(__fieldRead142_18(life9_116), (p1)[3], 1)));
    life16_153 = ((double) ((float) __call142_20((p1)[4])));
    life18_160 = ((double) ((float) __call142_21((p1)[5])));
    life20_171 = ((double) ((float) __call142_23((p1)[__invokedynamic142_22(30663, (7405292932384046654L ^ life3_3))])));
    life22_182 = ((double) ((float) __call142_25((p1)[__invokedynamic142_24(12640, (8590923730783271068L ^ life3_3))])));
    life24_184 = 0;
    spill142_3 = (p1).length;
    spill142_4 = __invokedynamic142_26(7944, (9072766169363994357L ^ life3_3));
    if (!((life5_5 == 0))) {
        lexicalValue142_195_0 = spill142_3;
        lexicalValue142_195_1 = spill142_4;
        break lexical_join_195;
    }
    if (!((spill142_3 > spill142_4))) {
        break lexical_join_186;
    }
    life24_184 = __call142_28((p1)[__invokedynamic142_27(7944, (9072766169363994357L ^ life3_3))], 0);
    }
    spill142_5 = (p1).length;
    if (!((life5_5 == 0))) {
        lexicalValue142_205_0 = spill142_5;
        break lexical_join_205;
    }
    lexicalValue142_195_0 = spill142_5;
    lexicalValue142_195_1 = __invokedynamic142_29(28024, (4421080300420834439L ^ life3_3));
    }
    if (!((lexicalValue142_195_0 > lexicalValue142_195_1))) {
        break lexical_join_210;
    }
    lexicalValue142_205_0 = __integerCategory142_32(__call142_31("force", (p1)[__invokedynamic142_30(7092, (4053407750894965327L ^ life3_3))]));
    }
    if (!((life5_5 == 0))) {
        lexicalValue142_209_0 = lexicalValue142_205_0;
        break lexical_join_209;
    }
    if (!((lexicalValue142_205_0 != 0))) {
        break lexical_join_210;
    }
    lexicalValue142_209_0 = 1;
    }
    lexicalValue142_211_0 = lexicalValue142_209_0;
    break lexical_join_211;
    }
    lexicalValue142_211_0 = 0;
    }
    life25_242 = lexicalValue142_211_0;
    life26_245 = __call142_33(p0);
    spill142_6 = life26_245;
    if (!((life5_5 == 0))) {
        lexicalValue142_221_0 = spill142_6;
        break lexical_join_221;
    }
    if (!((__instanceOf142_34(spill142_6) != 0))) {
        break lexical_join_289;
    }
    lexicalValue142_221_0 = life26_245;
    }
    life27_259 = __cast142_35(lexicalValue142_221_0);
    life28_263 = new int[__call142_36(life7_31)];
    if (!((life5_5 == 0))) {
        break lexical_join_272;
    }
    if (!(__call142_37(life7_31))) {
        break lexical_join_259;
    }
    life29_278 = __call142_38((p1)[0], "_", 3);
    life30_280 = 1;
    lexical_cycle_241: while (true) {
    if (!((life30_280 < (life29_278).length))) {
        break lexical_join_259;
    }
    (life28_263)[(life30_280 - 1)] = __call142_39((life29_278)[life30_280]);
    if (!((life5_5 == 0))) {
        break lexical_join_272;
    }
    life30_280 += 1;
    if (!((life5_5 != 0))) { continue lexical_cycle_241; }
    break lexical_cycle_241;
    }
    }
    __call142_40(life27_259, life7_31, life25_242, life10_126, life12_136, life14_146, life24_184, life16_153, life18_160, life20_171, life22_182, life28_263);
    }
    __call142_43(p0, receiver, "commands.particle.success", new java.lang.Object[] {life8_113, __call142_42(__call142_41(life24_184, 1))});
    }
    return;
}
public static void h142_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014200_0(p0);
}
public static void h142_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014201_0(p0);
}
public static void h142_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014202_0(p0);
}
public static void h142_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014203_0(p0);
}
public static void h142_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014204_0(p0);
}
public static void h142_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014205_0(p0);
}
public static void h142_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014206_0(p0);
}
public static void h142_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014207_0(p0);
}
public static void h142_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014208_0(p0);
}
public static void h142_9(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014209_0(p0);
}
public static void h142_10(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014210_0(p0);
}
public static void h142_11(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014211_0(p0);
}
public static void h142_12(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014212_0(p0);
}
public static void h142_13(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3014213_0(p0);
}
public static void h142_14(moom.b7 p0) throws Throwable {
    throw __call3014214_0(p0);
}
public static void h142_15(java.lang.NumberFormatException p0, java.lang.String[] p1) throws Throwable {
    java.lang.NumberFormatException life2_2;
    life2_2 = p0;
    throw new moom.b7("commands.particle.notFound", new java.lang.Object[] {(p1)[0]});
}
private static native long __fieldRead142_0() throws Throwable;
private static native boolean __call142_1() throws Throwable;
private static native int __integerCategory142_2(boolean value) throws Throwable;
private static native int __invokedynamic142_3(int a0, long a1) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes[] __call142_4() throws Throwable;
private static native boolean __call142_5(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native int __integerCategory142_6(boolean value) throws Throwable;
private static native java.lang.String __call142_7(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call142_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory142_9(boolean value) throws Throwable;
private static native java.lang.String __call142_10(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call142_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory142_12(boolean value) throws Throwable;
private static native moom.DR __call142_13(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native double __fieldRead142_14(moom.DR a0) throws Throwable;
private static native double __call142_15(double a0, java.lang.String a1, int a2) throws Throwable;
private static native double __fieldRead142_16(moom.DR a0) throws Throwable;
private static native double __call142_17(double a0, java.lang.String a1, int a2) throws Throwable;
private static native double __fieldRead142_18(moom.DR a0) throws Throwable;
private static native double __call142_19(double a0, java.lang.String a1, int a2) throws Throwable;
private static native double __call142_20(java.lang.String a0) throws Throwable;
private static native double __call142_21(java.lang.String a0) throws Throwable;
private static native int __invokedynamic142_22(int a0, long a1) throws Throwable;
private static native double __call142_23(java.lang.String a0) throws Throwable;
private static native int __invokedynamic142_24(int a0, long a1) throws Throwable;
private static native double __call142_25(java.lang.String a0) throws Throwable;
private static native int __invokedynamic142_26(int a0, long a1) throws Throwable;
private static native int __invokedynamic142_27(int a0, long a1) throws Throwable;
private static native int __call142_28(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic142_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic142_30(int a0, long a1) throws Throwable;
private static native boolean __call142_31(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory142_32(boolean value) throws Throwable;
private static native net.minecraft.world.World __call142_33(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native int __instanceOf142_34(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.WorldServer __cast142_35(net.minecraft.world.World a0) throws Throwable;
private static native int __call142_36(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call142_37(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native java.lang.String[] __call142_38(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call142_39(java.lang.String a0) throws Throwable;
private static native void __call142_40(net.minecraft.world.WorldServer a0, net.minecraft.util.EnumParticleTypes a1, int a2, double a3, double a4, double a5, int a6, double a7, double a8, double a9, double a10, int[] a11) throws Throwable;
private static native int __call142_41(int a0, int a1) throws Throwable;
private static native java.lang.Integer __call142_42(int a0) throws Throwable;
private static native void __call142_43(net.minecraft.command.ICommandSender a0, moom.p2 a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3014200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014201_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014202_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014203_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014204_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014205_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014206_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014207_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014208_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014209_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014210_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014211_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014212_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014213_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3014214_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_a58fc0b42db1281b8326(moom.p2 a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_a58fc0b42db1281b8326 {

public static java.util.List f1091(moom.p2 receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1091_19_0;
    int forwardValue1091_19_1;
    int forwardValue1091_42_0;
    int forwardValue1091_42_1;
    java.lang.String[] forwardValue1091_44_0;
    java.util.List forwardValue1091_57_0;
    int spill1091_0;
    int spill1091_1;
    int spill1091_2;
    int spill1091_3;
    java.lang.String[] spill1091_4;
    long life4_3;
    int life6_5;
    forward_join_57: {
    forward_join_56: {
    forward_join_44: {
    forward_join_42: {
    forward_join_33: {
    forward_join_19: {
    forward_join_16: {
    life4_3 = (__fieldRead1091_0() ^ 60454474663388L);
    life6_5 = __integerCategory1091_2(__call1091_1());
    spill1091_0 = (p1).length;
    spill1091_1 = 1;
    if (!((life6_5 != 0))) {
        forwardValue1091_19_0 = spill1091_0;
        forwardValue1091_19_1 = spill1091_1;
        break forward_join_19;
    }
    if (!((spill1091_0 == spill1091_1))) {
        break forward_join_16;
    }
    forwardValue1091_57_0 = __call1091_4(p1, __call1091_3());
    break forward_join_57;
    }
    forwardValue1091_19_0 = (p1).length;
    forwardValue1091_19_1 = 1;
    }
    if (!((life6_5 != 0))) {
        forwardValue1091_42_0 = forwardValue1091_19_0;
        forwardValue1091_42_1 = forwardValue1091_19_1;
        break forward_join_42;
    }
    if (!((forwardValue1091_19_0 > forwardValue1091_19_1))) {
        break forward_join_33;
    }
    spill1091_2 = (p1).length;
    spill1091_3 = 4;
    if (!((life6_5 != 0))) {
        forwardValue1091_42_0 = spill1091_2;
        forwardValue1091_42_1 = spill1091_3;
        break forward_join_42;
    }
    if (!((spill1091_2 <= spill1091_3))) {
        break forward_join_33;
    }
    forwardValue1091_57_0 = __call1091_5(p1, 1, p2);
    break forward_join_57;
    }
    spill1091_4 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1091_44_0 = spill1091_4;
        break forward_join_44;
    }
    forwardValue1091_42_0 = (spill1091_4).length;
    forwardValue1091_42_1 = __invokedynamic1091_6(2437, (682509043839029756L ^ life4_3));
    }
    if (!((forwardValue1091_42_0 == forwardValue1091_42_1))) {
        break forward_join_56;
    }
    forwardValue1091_44_0 = p1;
    }
    forwardValue1091_57_0 = __call1091_7(forwardValue1091_44_0, new java.lang.String[] {"normal", "force"});
    break forward_join_57;
    }
    forwardValue1091_57_0 = null;
    }
    return forwardValue1091_57_0;
}
public static void h1091_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1109100_0(p0);
}
public static void h1091_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1109101_0(p0);
}
public static void h1091_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1109102_0(p0);
}
public static void h1091_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1109103_0(p0);
}
public static void h1091_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1109104_0(p0);
}
public static void h1091_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1109105_0(p0);
}
public static void h1091_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1109106_0(p0);
}
private static native long __fieldRead1091_0() throws Throwable;
private static native boolean __call1091_1() throws Throwable;
private static native int __integerCategory1091_2(boolean value) throws Throwable;
private static native java.lang.String[] __call1091_3() throws Throwable;
private static native java.util.List __call1091_4(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.util.List __call1091_5(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1091_6(int a0, long a1) throws Throwable;
private static native java.util.List __call1091_7(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1109100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1109101_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1109102_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1109103_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1109104_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1109105_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1109106_0(java.lang.NumberFormatException a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8634_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/p2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17030;
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
            throw new RuntimeException("moom/p2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.p2.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_a58fc0b42db1281b8326(this, p0, p1, p2); }


public java.lang.String a__String() {
return "particle";
}


public int a() {
return 2;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.particle.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_8632e541dfb2f21dfed7(this, p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8634_0() throws E;
}
