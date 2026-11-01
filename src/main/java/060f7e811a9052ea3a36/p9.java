package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class p9 extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public p9() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-1415852677520077407L)), ((long)(7856901581505110192L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(118277802485126L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.p9.c ^ 17176286924567L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill959_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill959_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill959_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill959_14 = new byte[8];
    (__sourceSpill959_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill959_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation959_16 = __sourceSpill959_14;
    ((javax.crypto.Cipher)(__sourceSpill959_11)).init(((int)(__sourceSpill959_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill959_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation959_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "AEõq¬rB\0017=ÌM\002Å5CL¶"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill959_25 = local6_life21;
        int __sourceSpill959_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill959_25)).substring(((int)(__sourceSpill959_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill959_30 = local8_life19;
        int __sourceSpill959_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill959_33 = new byte[8];
        (__sourceSpill959_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill959_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill959_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill959_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill959_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill959_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill959_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill959_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill959_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill959_34)).doFinal(((byte[])(__sourceSpill959_33)));
        (__sourceSpill959_30)[__sourceSpill959_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> int __sourceHandlerCall_8a9d031c179f57640dd6(moom.p9 a0, java.util.List a1) throws E;
private static final class __SourceHandler_8a9d031c179f57640dd6 {

public static int f178(moom.p9 receiver, java.util.List p0) throws Throwable {
    int lexicalValue178_36_0;
    int lexicalValue178_41_0;
    boolean spill178_0;
    int spill178_1;
    long life2_3;
    java.util.HashSet life5_6;
    int life4_7;
    java.util.Iterator life6_10;
    net.minecraft.entity.Entity life7_17;
    lexical_join_41: {
    lexical_join_39: {
    life2_3 = (__fieldRead178_0() ^ 104914168302621L);
    spill178_0 = __call178_1();
    life5_6 = __call178_2();
    life4_7 = __integerCategory178_3(spill178_0);
    life6_10 = __call178_4(p0);
    lexical_cycle_11: while (true) {
    lexical_join_37: {
    lexical_join_36: {
    lexical_join_33: {
    if (!(__call178_5(life6_10))) {
        break lexical_join_39;
    }
    life7_17 = __cast178_7(__call178_6(life6_10));
    spill178_1 = __instanceOf178_8(life7_17);
    if (!((life4_7 != 0))) {
        lexicalValue178_41_0 = spill178_1;
        break lexical_join_41;
    }
    if (!((life4_7 != 0))) {
        lexicalValue178_36_0 = spill178_1;
        break lexical_join_36;
    }
    if (!((spill178_1 != 0))) {
        break lexical_join_33;
    }
    __call178_11(life5_6, __call178_10(__cast178_9(life7_17)));
    if (!((life4_7 == 0))) {
        break lexical_join_37;
    }
    }
    lexicalValue178_36_0 = __integerCategory178_13(__call178_12(life5_6, null));
    }
    __discardScalar178_14(lexicalValue178_36_0);
    }
    if (!((life4_7 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue178_41_0 = __call178_15(life5_6);
    }
    return lexicalValue178_41_0;
}
public static void h178_0(moom.Oo p0) throws Throwable {
    throw __call1017800_0(p0);
}
public static void h178_1(moom.Oo p0) throws Throwable {
    throw __call1017801_0(p0);
}
public static void h178_2(moom.Oo p0) throws Throwable {
    throw __call1017802_0(p0);
}
public static void h178_3(moom.Oo p0) throws Throwable {
    throw __call1017803_0(p0);
}
private static native long __fieldRead178_0() throws Throwable;
private static native boolean __call178_1() throws Throwable;
private static native java.util.HashSet __call178_2() throws Throwable;
private static native int __integerCategory178_3(boolean value) throws Throwable;
private static native java.util.Iterator __call178_4(java.util.List a0) throws Throwable;
private static native boolean __call178_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call178_6(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast178_7(java.lang.Object a0) throws Throwable;
private static native int __instanceOf178_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast178_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.Bj __call178_10(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native boolean __call178_11(java.util.HashSet a0, moom.Bj a1) throws Throwable;
private static native boolean __call178_12(java.util.HashSet a0, java.lang.Object a1) throws Throwable;
private static native int __integerCategory178_13(boolean value) throws Throwable;
private static native void __discardScalar178_14(int a0) throws Throwable;
private static native int __call178_15(java.util.HashSet a0) throws Throwable;
private static native java.lang.Exception __call1017800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017803_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> double __sourceHandlerCall_7539a30bcf28ffd3d701(moom.p9 a0, java.util.List a1, net.minecraft.world.World a2, moom.qP[] a3, boolean a4) throws E;
private static final class __SourceHandler_7539a30bcf28ffd3d701 {

public static double f914(moom.p9 receiver, java.util.List p0, net.minecraft.world.World p1, moom.qP[] p2, boolean p3) throws Throwable {
    java.lang.Object forestValue914_20_0;
    int forestValue914_32_0;
    net.minecraft.entity.Entity forestValue914_34_0;
    moom.Bj forestValue914_38_0;
    java.util.HashMap forestValue914_55_0;
    moom.Bj forestValue914_55_1;
    boolean spill914_0;
    boolean spill914_1;
    net.minecraft.entity.Entity spill914_2;
    java.util.HashMap spill914_3;
    moom.Bj spill914_4;
    moom.qP spill914_5;
    long life5_3;
    double life8_6;
    int life10_8;
    int life7_9;
    java.util.HashMap life11_11;
    java.util.Iterator life12_14;
    net.minecraft.entity.Entity life13_21;
    moom.Bj life15_41;
    moom.qP life14_62;
    double life15_90;
    moom.qP[] life17_92;
    int life18_95;
    int life19_97;
    moom.qP life20_104;
    double life21_116;
    forest_join_130: {
    forest_join_124: {
    life5_3 = (__fieldRead914_0() ^ 129875085577176L);
    spill914_0 = __call914_1();
    life8_6 = 0x0.0p0d;
    life10_8 = 0;
    life7_9 = __integerCategory914_2(spill914_0);
    life11_11 = __call914_3();
    life12_14 = __call914_4(p0);
    forest_cycle_15: while (true) {
    forest_join_118: {
    if (!(__call914_5(life12_14))) {
        break forest_join_124;
    }
    forestValue914_20_0 = __call914_6(life12_14);
    forest_cycle_20: while (true) {
    forest_join_65: {
    forest_join_60: {
    forest_join_55: {
    forest_join_53: {
    forest_join_38: {
    forest_join_37: {
    forest_join_34: {
    forest_join_32: {
    life13_21 = __cast914_7(forestValue914_20_0);
    if (!((life7_9 != 0))) {
        break forest_join_130;
    }
    spill914_1 = p3;
    if (!((life7_9 != 0))) {
        forestValue914_32_0 = __integerCategory914_8(spill914_1);
        break forest_join_32;
    }
    if (!(spill914_1)) {
        break forest_join_60;
    }
    spill914_2 = life13_21;
    if (!((life7_9 != 0))) {
        forestValue914_34_0 = spill914_2;
        break forest_join_34;
    }
    forestValue914_32_0 = __instanceOf914_9(spill914_2);
    }
    if (!((forestValue914_32_0 != 0))) {
        break forest_join_37;
    }
    forestValue914_34_0 = life13_21;
    }
    forestValue914_38_0 = __call914_11(__cast914_10(forestValue914_34_0));
    break forest_join_38;
    }
    forestValue914_38_0 = null;
    }
    life15_41 = forestValue914_38_0;
    spill914_3 = life11_11;
    spill914_4 = life15_41;
    if (!((life7_9 != 0))) {
        forestValue914_55_0 = spill914_3;
        forestValue914_55_1 = spill914_4;
        break forest_join_55;
    }
    if (!((!__call914_12(spill914_3, spill914_4)))) {
        break forest_join_53;
    }
    __call914_13(life11_11, life15_41, (p2)[(life10_8++)]);
    }
    forestValue914_55_0 = life11_11;
    forestValue914_55_1 = life15_41;
    }
    life14_62 = __cast914_15(__call914_14(forestValue914_55_0, forestValue914_55_1));
    if (!((life7_9 == 0))) {
        break forest_join_65;
    }
    }
    life14_62 = (p2)[(life10_8++)];
    }
    __call914_21(life13_21, ((double) (((float) __call914_17(__fieldRead914_16(life14_62))) + 0x1.0p-1f)), ((double) __call914_18(life14_62, p1)), (((double) __call914_20(__fieldRead914_19(life14_62))) + 0x1.0p-1d));
    life15_90 = 0x1.fffffffffffffp1023d;
    life17_92 = p2;
    life18_95 = (life17_92).length;
    life19_97 = 0;
    forest_cycle_93: while (true) {
    forest_join_116: {
    forest_join_115: {
    if (!((life19_97 < life18_95))) {
        break forest_join_118;
    }
    life20_104 = (life17_92)[life19_97];
    if (!((life7_9 != 0))) {
        break forest_join_116;
    }
    spill914_5 = life14_62;
    if (!((life7_9 != 0))) {
        forestValue914_20_0 = spill914_5;
        continue forest_cycle_20;
    }
    if (!((spill914_5 != life20_104))) {
        break forest_join_115;
    }
    life21_116 = __call914_22(life14_62, life20_104);
    life15_90 = __call914_23(life21_116, life15_90);
    }
    life19_97 += 1;
    }
    if (!((life7_9 == 0))) {
        continue forest_cycle_93;
    }
    break forest_cycle_93;
    }
    break forest_cycle_20;
    }
    }
    life8_6 = (life8_6 + life15_90);
    if (!((life7_9 == 0))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    life8_6 = (life8_6 / ((double) __call914_24(p0)));
    }
    return life8_6;
}
public static double h914_0(moom.Oo p0) throws Throwable {
    throw __call3091400_0(p0);
}
public static double h914_1(moom.Oo p0) throws Throwable {
    throw __call3091401_0(p0);
}
public static double h914_2(moom.Oo p0) throws Throwable {
    throw __call3091402_0(p0);
}
public static double h914_3(moom.Oo p0) throws Throwable {
    throw __call3091403_0(p0);
}
public static double h914_4(moom.Oo p0) throws Throwable {
    throw __call3091404_0(p0);
}
public static double h914_5(moom.Oo p0) throws Throwable {
    throw __call3091405_0(p0);
}
private static native long __fieldRead914_0() throws Throwable;
private static native boolean __call914_1() throws Throwable;
private static native int __integerCategory914_2(boolean value) throws Throwable;
private static native java.util.HashMap __call914_3() throws Throwable;
private static native java.util.Iterator __call914_4(java.util.List a0) throws Throwable;
private static native boolean __call914_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call914_6(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast914_7(java.lang.Object a0) throws Throwable;
private static native int __integerCategory914_8(boolean value) throws Throwable;
private static native int __instanceOf914_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast914_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.Bj __call914_11(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native boolean __call914_12(java.util.HashMap a0, moom.Bj a1) throws Throwable;
private static native java.lang.Object __call914_13(java.util.HashMap a0, moom.Bj a1, moom.qP a2) throws Throwable;
private static native java.lang.Object __call914_14(java.util.HashMap a0, moom.Bj a1) throws Throwable;
private static native moom.qP __cast914_15(java.lang.Object a0) throws Throwable;
private static native double __fieldRead914_16(moom.qP a0) throws Throwable;
private static native int __call914_17(double a0) throws Throwable;
private static native int __call914_18(moom.qP a0, net.minecraft.world.World a1) throws Throwable;
private static native double __fieldRead914_19(moom.qP a0) throws Throwable;
private static native int __call914_20(double a0) throws Throwable;
private static native void __call914_21(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native double __call914_22(moom.qP a0, moom.qP a1) throws Throwable;
private static native double __call914_23(double a0, double a1) throws Throwable;
private static native int __call914_24(java.util.List a0) throws Throwable;
private static native java.lang.Exception __call3091400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3091401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3091402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3091403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3091404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3091405_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.qP[] __sourceHandlerCall_7659ae279204f44733f1(moom.p9 a0, java.util.Random a1, int a2, double a3, double a4, double a5, double a6) throws E;
private static final class __SourceHandler_7659ae279204f44733f1 {

public static moom.qP[] f1104(moom.p9 receiver, java.util.Random p0, int p1, double p2, double p3, double p4, double p5) throws Throwable {
    moom.qP[] lexicalValue1104_36_0;
    boolean spill1104_0;
    moom.qP[] spill1104_1;
    long life11_3;
    moom.qP[] life14_6;
    int life15_9;
    int life13_10;
    moom.qP life16_18;
    lexical_join_36: {
    lexical_join_35: {
    life11_3 = (__fieldRead1104_0() ^ 89378953623405L);
    life14_6 = new moom.qP[p1];
    spill1104_0 = __call1104_1();
    life15_9 = 0;
    life13_10 = __integerCategory1104_2(spill1104_0);
    lexical_cycle_11: while (true) {
    if (!((life15_9 < (life14_6).length))) {
        break lexical_join_35;
    }
    life16_18 = new moom.qP();
    __call1104_3(life16_18, p0, p2, p3, p4, p5);
    spill1104_1 = life14_6;
    if (!((life13_10 != 0))) {
        lexicalValue1104_36_0 = spill1104_1;
        break lexical_join_36;
    }
    (spill1104_1)[life15_9] = life16_18;
    life15_9 += 1;
    if (!((life13_10 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue1104_36_0 = life14_6;
    }
    return lexicalValue1104_36_0;
}
public static void h1104_0(moom.Oo p0) throws Throwable {
    throw __call1110400_0(p0);
}
private static native long __fieldRead1104_0() throws Throwable;
private static native boolean __call1104_1() throws Throwable;
private static native int __integerCategory1104_2(boolean value) throws Throwable;
private static native void __call1104_3(moom.qP a0, java.util.Random a1, double a2, double a3, double a4, double a5) throws Throwable;
private static native java.lang.Exception __call1110400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_b7ee74431bdee85ea5ce(moom.p9 a0, moom.qP a1, double a2, net.minecraft.world.World a3, java.util.Random a4, double a5, double a6, double a7, double a8, moom.qP[] a9, boolean a10) throws E;
private static final class __SourceHandler_b7ee74431bdee85ea5ce {

public static int f300103(moom.p9 receiver, moom.qP p0, double p1, net.minecraft.world.World p2, java.util.Random p3, double p4, double p5, double p6, double p7, moom.qP[] p8, boolean p9) throws Throwable {
    int forestValue300103_13_0;
    int forestValue300103_34_0;
    int forestValue300103_34_1;
    int forestValue300103_150_0;
    int forestValue300103_154_0;
    int forestValue300103_159_0;
    int forestValue300103_198_0;
    moom.b7 forestValue300103_212_0;
    moom.b7 forestValue300103_212_1;
    moom.b7 forestValue300103_213_0;
    moom.b7 forestValue300103_213_1;
    java.lang.String forestValue300103_213_2;
    int forestValue300103_249_0;
    boolean spill300103_0;
    int spill300103_1;
    moom.qP spill300103_2;
    int spill300103_3;
    int spill300103_4;
    int spill300103_5;
    int spill300103_6;
    boolean spill300103_7;
    moom.b7 spill300103_8;
    moom.b7 spill300103_9;
    java.lang.String spill300103_10;
    java.lang.Object[] spill300103_11;
    java.lang.Object[] spill300103_12;
    java.lang.Object[] spill300103_13;
    java.lang.Object[] spill300103_14;
    java.lang.Object[] spill300103_15;
    int spill300103_16;
    java.lang.String spill300103_17;
    java.lang.Object[] spill300103_18;
    long life16_3;
    int life19_6;
    int life18_7;
    double life20_9;
    int life22_11;
    int life23_32;
    moom.qP life24_40;
    int life25_42;
    moom.qP life26_46;
    int life27_50;
    moom.qP life28_63;
    double life29_67;
    double life27_126;
    moom.qP[] life23_170;
    int life24_173;
    int life25_175;
    moom.qP life26_182;
    forest_join_249: {
    forest_join_248: {
    forest_join_213: {
    forest_join_212: {
    forest_join_198: {
    forest_join_197: {
    life16_3 = (__fieldRead300103_0() ^ 82927820319089L);
    spill300103_0 = __call300103_1();
    life19_6 = 1;
    life18_7 = __integerCategory300103_2(spill300103_0);
    life20_9 = 0x1.fffffep127d;
    life22_11 = 0;
    forest_cycle_12: while (true) {
    forest_join_194: {
    forestValue300103_13_0 = life22_11;
    forest_cycle_13: while (true) {
    forest_join_159: {
    forest_join_158: {
    if (!((forestValue300103_13_0 < __invokedynamic300103_3(15435, (3635932068394393684L ^ life16_3))))) {
        break forest_join_197;
    }
    spill300103_1 = life19_6;
    if (!((life18_7 == 0))) {
        forestValue300103_198_0 = spill300103_1;
        break forest_join_198;
    }
    if (!((life18_7 == 0))) {
        forestValue300103_198_0 = spill300103_1;
        break forest_join_198;
    }
    if (!((spill300103_1 != 0))) {
        break forest_join_197;
    }
    life19_6 = 0;
    life20_9 = 0x1.fffffep127d;
    life23_32 = 0;
    forest_cycle_31: while (true) {
    forest_join_155: {
    forest_join_154: {
    forest_join_150: {
    forest_join_144: {
    forest_join_142: {
    forest_join_135: {
    forest_join_133: {
    forest_join_100: {
    forestValue300103_34_0 = life23_32;
    forestValue300103_34_1 = (p8).length;
    forest_cycle_34: while (true) {
    if (!((forestValue300103_34_0 < forestValue300103_34_1))) {
        break forest_join_158;
    }
    life24_40 = (p8)[life23_32];
    life25_42 = 0;
    moom.qP __stackOp300103_5_0 = __sourceUninitializedNEW300103_4();
    spill300103_2 = __stackOp300103_5_0;
    __explicitNewInit300103_6(__stackOp300103_5_0);
    life26_46 = spill300103_2;
    spill300103_3 = 0;
    if (!((life18_7 == 0))) {
        forestValue300103_159_0 = spill300103_3;
        break forest_join_159;
    }
    life27_50 = spill300103_3;
    forest_cycle_49: while (true) {
    forest_join_98: {
    forest_join_97: {
    if (!((life27_50 < (p8).length))) {
        break forest_join_100;
    }
    spill300103_4 = life23_32;
    spill300103_5 = life27_50;
    if (!((life18_7 == 0))) {
        forestValue300103_34_0 = spill300103_4;
        forestValue300103_34_1 = spill300103_5;
        continue forest_cycle_34;
    }
    if (!((spill300103_4 != spill300103_5))) {
        break forest_join_97;
    }
    life28_63 = (p8)[life27_50];
    life29_67 = __call300103_7(life24_40, life28_63);
    life20_9 = __call300103_8(life29_67, life20_9);
    if (!((life18_7 == 0))) {
        break forest_join_98;
    }
    if (!((__numericCompare300103_9(life29_67, p1) < 0))) {
        break forest_join_97;
    }
    life25_42 += 1;
    moom.qP __stackOp300103_10_0 = life26_46;
    __fieldWrite300103_14(__stackOp300103_10_0, (__fieldRead300103_11(__stackOp300103_10_0) + (__fieldRead300103_12(life28_63) - __fieldRead300103_13(life24_40))));
    moom.qP __stackOp300103_15_0 = life26_46;
    __fieldWrite300103_19(__stackOp300103_15_0, (__fieldRead300103_16(__stackOp300103_15_0) + (__fieldRead300103_17(life28_63) - __fieldRead300103_18(life24_40))));
    }
    life27_50 += 1;
    }
    if (!((life18_7 != 0))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    break forest_cycle_34;
    }
    }
    spill300103_6 = life25_42;
    if (!((life18_7 == 0))) {
        forestValue300103_150_0 = spill300103_6;
        break forest_join_150;
    }
    if (!((spill300103_6 > 0))) {
        break forest_join_144;
    }
    moom.qP __stackOp300103_20_0 = life26_46;
    __fieldWrite300103_22(__stackOp300103_20_0, (__fieldRead300103_21(__stackOp300103_20_0) / ((double) life25_42)));
    moom.qP __stackOp300103_23_0 = life26_46;
    __fieldWrite300103_25(__stackOp300103_23_0, (__fieldRead300103_24(__stackOp300103_23_0) / ((double) life25_42)));
    life27_126 = ((double) __call300103_26(life26_46));
    if (!((life18_7 == 0))) {
        break forest_join_133;
    }
    if (!((__numericCompare300103_27(life27_126, 0x0.0p0d) > 0))) {
        break forest_join_135;
    }
    __call300103_28(life26_46);
    __call300103_29(life24_40, life26_46);
    }
    if (!((life18_7 != 0))) {
        break forest_join_142;
    }
    }
    __call300103_30(life24_40, p3, p4, p5, p6, p7);
    }
    life19_6 = 1;
    }
    forestValue300103_150_0 = __integerCategory300103_32(__call300103_31(life24_40, p4, p5, p6, p7));
    }
    if (!((life18_7 == 0))) {
        forestValue300103_154_0 = forestValue300103_150_0;
        break forest_join_154;
    }
    if (!((forestValue300103_150_0 != 0))) {
        break forest_join_155;
    }
    forestValue300103_154_0 = 1;
    }
    life19_6 = forestValue300103_154_0;
    }
    life23_32 += 1;
    if (!((life18_7 != 0))) {
        continue forest_cycle_31;
    }
    break forest_cycle_31;
    }
    }
    forestValue300103_159_0 = life19_6;
    }
    if (!((forestValue300103_159_0 == 0))) {
        break forest_join_194;
    }
    life23_170 = p8;
    life24_173 = (life23_170).length;
    life25_175 = 0;
    forest_cycle_167: while (true) {
    forest_join_192: {
    forest_join_191: {
    if (!((life25_175 < life24_173))) {
        break forest_join_194;
    }
    life26_182 = (life23_170)[life25_175];
    if (!((life18_7 == 0))) {
        break forest_join_192;
    }
    spill300103_7 = __call300103_33(life26_182, p2);
    if (!((life18_7 == 0))) {
        forestValue300103_13_0 = __integerCategory300103_34(spill300103_7);
        continue forest_cycle_13;
    }
    if (!((!spill300103_7))) {
        break forest_join_191;
    }
    __call300103_35(life26_182, p3, p4, p5, p6, p7);
    life19_6 = 1;
    }
    life25_175 += 1;
    }
    if (!((life18_7 != 0))) {
        continue forest_cycle_167;
    }
    break forest_cycle_167;
    }
    break forest_cycle_13;
    }
    }
    life22_11 += 1;
    if (!((life18_7 != 0))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    }
    forestValue300103_198_0 = life22_11;
    }
    if (!((life18_7 == 0))) {
        forestValue300103_249_0 = forestValue300103_198_0;
        break forest_join_249;
    }
    if (!((forestValue300103_198_0 >= __invokedynamic300103_36(27699, (852556461446672429L ^ life16_3))))) {
        break forest_join_248;
    }
    moom.b7 __stackOp300103_38_0 = __sourceUninitializedNEW300103_37();
    spill300103_8 = __stackOp300103_38_0;
    spill300103_9 = __stackOp300103_38_0;
    if (!(p9)) {
        forestValue300103_212_0 = spill300103_8;
        forestValue300103_212_1 = spill300103_9;
        break forest_join_212;
    }
    forestValue300103_213_0 = spill300103_8;
    forestValue300103_213_1 = spill300103_9;
    forestValue300103_213_2 = "teams";
    break forest_join_213;
    }
    forestValue300103_213_0 = forestValue300103_212_0;
    forestValue300103_213_1 = forestValue300103_212_1;
    forestValue300103_213_2 = "players";
    }
    spill300103_10 = __invokedynamic300103_39(forestValue300103_213_2);
    java.lang.Object[] __stackOp300103_40_0 = new java.lang.Object[4];
    spill300103_11 = __stackOp300103_40_0;
    (__stackOp300103_40_0)[0] = __call300103_41((p8).length);
    java.lang.Object[] __stackOp300103_42_0 = spill300103_11;
    spill300103_12 = __stackOp300103_42_0;
    (__stackOp300103_42_0)[1] = __call300103_44(__fieldRead300103_43(p0));
    java.lang.Object[] __stackOp300103_45_0 = spill300103_12;
    spill300103_13 = __stackOp300103_45_0;
    (__stackOp300103_45_0)[2] = __call300103_47(__fieldRead300103_46(p0));
    java.lang.Object[] __stackOp300103_48_0 = spill300103_13;
    spill300103_14 = __stackOp300103_48_0;
    spill300103_15 = __stackOp300103_48_0;
    spill300103_16 = 3;
    spill300103_17 = "%.2f";
    java.lang.Object[] __stackOp300103_49_0 = new java.lang.Object[1];
    spill300103_18 = __stackOp300103_49_0;
    (__stackOp300103_49_0)[0] = __call300103_50(life20_9);
    (spill300103_15)[spill300103_16] = __call300103_51(spill300103_17, spill300103_18);
    __explicitNewInit300103_52(forestValue300103_213_1, spill300103_10, spill300103_14);
    throw forestValue300103_213_0;
    }
    forestValue300103_249_0 = life22_11;
    }
    return forestValue300103_249_0;
}
public static int h300103_0(moom.b7 p0) throws Throwable {
    throw __call33010300_0(p0);
}
public static int h300103_1(moom.b7 p0) throws Throwable {
    throw __call33010301_0(p0);
}
public static int h300103_2(moom.b7 p0) throws Throwable {
    throw __call33010302_0(p0);
}
public static int h300103_3(moom.b7 p0) throws Throwable {
    throw __call33010303_0(p0);
}
public static int h300103_4(moom.b7 p0) throws Throwable {
    throw __call33010304_0(p0);
}
public static int h300103_5(moom.b7 p0) throws Throwable {
    throw __call33010305_0(p0);
}
public static int h300103_6(moom.b7 p0) throws Throwable {
    throw __call33010306_0(p0);
}
public static int h300103_7(moom.b7 p0) throws Throwable {
    throw __call33010307_0(p0);
}
public static int h300103_8(moom.b7 p0) throws Throwable {
    throw __call33010308_0(p0);
}
public static int h300103_9(moom.b7 p0) throws Throwable {
    throw __call33010309_0(p0);
}
public static int h300103_10(moom.b7 p0) throws Throwable {
    throw __call33010310_0(p0);
}
public static int h300103_11(moom.b7 p0) throws Throwable {
    throw __call33010311_0(p0);
}
public static int h300103_12(moom.b7 p0) throws Throwable {
    throw __call33010312_0(p0);
}
private static native long __fieldRead300103_0() throws Throwable;
private static native boolean __call300103_1() throws Throwable;
private static native int __integerCategory300103_2(boolean value) throws Throwable;
private static native int __invokedynamic300103_3(int a0, long a1) throws Throwable;
private static native moom.qP __sourceUninitializedNEW300103_4() throws Throwable;
private static native void __explicitNewInit300103_6(moom.qP a0) throws Throwable;
private static native double __call300103_7(moom.qP a0, moom.qP a1) throws Throwable;
private static native double __call300103_8(double a0, double a1) throws Throwable;
private static native int __numericCompare300103_9(double a0, double a1) throws Throwable;
private static native double __fieldRead300103_11(moom.qP a0) throws Throwable;
private static native double __fieldRead300103_12(moom.qP a0) throws Throwable;
private static native double __fieldRead300103_13(moom.qP a0) throws Throwable;
private static native void __fieldWrite300103_14(moom.qP a0, double a1) throws Throwable;
private static native double __fieldRead300103_16(moom.qP a0) throws Throwable;
private static native double __fieldRead300103_17(moom.qP a0) throws Throwable;
private static native double __fieldRead300103_18(moom.qP a0) throws Throwable;
private static native void __fieldWrite300103_19(moom.qP a0, double a1) throws Throwable;
private static native double __fieldRead300103_21(moom.qP a0) throws Throwable;
private static native void __fieldWrite300103_22(moom.qP a0, double a1) throws Throwable;
private static native double __fieldRead300103_24(moom.qP a0) throws Throwable;
private static native void __fieldWrite300103_25(moom.qP a0, double a1) throws Throwable;
private static native float __call300103_26(moom.qP a0) throws Throwable;
private static native int __numericCompare300103_27(double a0, double a1) throws Throwable;
private static native void __call300103_28(moom.qP a0) throws Throwable;
private static native void __call300103_29(moom.qP a0, moom.qP a1) throws Throwable;
private static native void __call300103_30(moom.qP a0, java.util.Random a1, double a2, double a3, double a4, double a5) throws Throwable;
private static native boolean __call300103_31(moom.qP a0, double a1, double a2, double a3, double a4) throws Throwable;
private static native int __integerCategory300103_32(boolean value) throws Throwable;
private static native boolean __call300103_33(moom.qP a0, net.minecraft.world.World a1) throws Throwable;
private static native int __integerCategory300103_34(boolean value) throws Throwable;
private static native void __call300103_35(moom.qP a0, java.util.Random a1, double a2, double a3, double a4, double a5) throws Throwable;
private static native int __invokedynamic300103_36(int a0, long a1) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW300103_37() throws Throwable;
private static native java.lang.String __invokedynamic300103_39(java.lang.String a0) throws Throwable;
private static native java.lang.Integer __call300103_41(int a0) throws Throwable;
private static native double __fieldRead300103_43(moom.qP a0) throws Throwable;
private static native java.lang.Double __call300103_44(double a0) throws Throwable;
private static native double __fieldRead300103_46(moom.qP a0) throws Throwable;
private static native java.lang.Double __call300103_47(double a0) throws Throwable;
private static native java.lang.Double __call300103_50(double a0) throws Throwable;
private static native java.lang.String __call300103_51(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit300103_52(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Exception __call33010300_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010301_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010302_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010303_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010304_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010305_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010306_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010307_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010308_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010309_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010310_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010311_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010312_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_09484c7468b19ae56048(moom.p9 a0, net.minecraft.command.ICommandSender a1, java.util.List a2, moom.qP a3, double a4, double a5, net.minecraft.world.World a6, boolean a7) throws E;
private static final class __SourceHandler_09484c7468b19ae56048 {

public static void f300104(moom.p9 receiver, net.minecraft.command.ICommandSender p0, java.util.List p1, moom.qP p2, double p3, double p4, net.minecraft.world.World p5, boolean p6) throws Throwable {
    moom.p9 forestValue300104_39_0;
    java.util.Random forestValue300104_39_1;
    int forestValue300104_39_2;
    moom.p9 forestValue300104_40_0;
    java.util.Random forestValue300104_40_1;
    moom.p9 forestValue300104_42_0;
    java.util.Random forestValue300104_42_1;
    int forestValue300104_42_2;
    net.minecraft.command.ICommandSender forestValue300104_74_0;
    moom.p9 forestValue300104_74_1;
    net.minecraft.command.ICommandSender forestValue300104_75_0;
    moom.p9 forestValue300104_75_1;
    java.lang.String forestValue300104_75_2;
    net.minecraft.command.ICommandSender forestValue300104_108_0;
    moom.CN forestValue300104_108_1;
    moom.CN forestValue300104_108_2;
    net.minecraft.command.ICommandSender forestValue300104_109_0;
    moom.CN forestValue300104_109_1;
    moom.CN forestValue300104_109_2;
    java.lang.String forestValue300104_109_3;
    java.util.Random spill300104_0;
    boolean spill300104_1;
    moom.p9 spill300104_2;
    java.util.Random spill300104_3;
    boolean spill300104_4;
    net.minecraft.command.ICommandSender spill300104_5;
    moom.p9 spill300104_6;
    java.lang.String spill300104_7;
    java.lang.Object[] spill300104_8;
    java.lang.Object[] spill300104_9;
    java.lang.Object[] spill300104_10;
    net.minecraft.command.ICommandSender spill300104_11;
    moom.CN spill300104_12;
    moom.CN spill300104_13;
    java.lang.String spill300104_14;
    java.lang.Object[] spill300104_15;
    java.lang.Object[] spill300104_16;
    int spill300104_17;
    java.lang.String spill300104_18;
    java.lang.Object[] spill300104_19;
    java.lang.Object[] spill300104_20;
    long life10_3;
    java.util.Random life13_7;
    double life14_12;
    double life16_18;
    double life18_23;
    double life20_28;
    int life12_29;
    moom.qP[] life22_49;
    int life23_62;
    double life24_69;
    forest_join_131: {
    forest_join_109: {
    forest_join_108: {
    forest_join_75: {
    forest_join_74: {
    forest_join_42: {
    forest_join_40: {
    forest_join_39: {
    life10_3 = (__fieldRead300104_0() ^ 49124110727828L);
    java.util.Random __stackOp300104_2_0 = __sourceUninitializedNEW300104_1();
    spill300104_0 = __stackOp300104_2_0;
    __explicitNewInit300104_3(__stackOp300104_2_0);
    life13_7 = spill300104_0;
    life14_12 = (__fieldRead300104_4(p2) - p4);
    spill300104_1 = __call300104_5();
    life16_18 = (__fieldRead300104_6(p2) - p4);
    life18_23 = (__fieldRead300104_7(p2) + p4);
    life20_28 = (__fieldRead300104_8(p2) + p4);
    life12_29 = __integerCategory300104_9(spill300104_1);
    spill300104_2 = receiver;
    spill300104_3 = life13_7;
    spill300104_4 = p6;
    if (!((life12_29 != 0))) {
        forestValue300104_39_0 = spill300104_2;
        forestValue300104_39_1 = spill300104_3;
        forestValue300104_39_2 = __integerCategory300104_10(spill300104_4);
        break forest_join_39;
    }
    if (!(spill300104_4)) {
        forestValue300104_40_0 = spill300104_2;
        forestValue300104_40_1 = spill300104_3;
        break forest_join_40;
    }
    forestValue300104_39_0 = spill300104_2;
    forestValue300104_39_1 = spill300104_3;
    forestValue300104_39_2 = __call300104_11(receiver, p1);
    }
    forestValue300104_42_0 = forestValue300104_39_0;
    forestValue300104_42_1 = forestValue300104_39_1;
    forestValue300104_42_2 = forestValue300104_39_2;
    break forest_join_42;
    }
    forestValue300104_42_0 = forestValue300104_40_0;
    forestValue300104_42_1 = forestValue300104_40_1;
    forestValue300104_42_2 = __call300104_12(p1);
    }
    life22_49 = __call300104_13(forestValue300104_42_0, forestValue300104_42_1, forestValue300104_42_2, life14_12, life16_18, life18_23, life20_28);
    life23_62 = __call300104_14(receiver, p2, p3, p5, life13_7, life14_12, life16_18, life18_23, life20_28, life22_49, p6);
    life24_69 = __call300104_15(receiver, p1, p5, life22_49, p6);
    spill300104_5 = p0;
    spill300104_6 = receiver;
    if (!(p6)) {
        forestValue300104_74_0 = spill300104_5;
        forestValue300104_74_1 = spill300104_6;
        break forest_join_74;
    }
    forestValue300104_75_0 = spill300104_5;
    forestValue300104_75_1 = spill300104_6;
    forestValue300104_75_2 = "teams";
    break forest_join_75;
    }
    forestValue300104_75_0 = forestValue300104_74_0;
    forestValue300104_75_1 = forestValue300104_74_1;
    forestValue300104_75_2 = "players";
    }
    spill300104_7 = __invokedynamic300104_16(forestValue300104_75_2);
    java.lang.Object[] __stackOp300104_17_0 = new java.lang.Object[3];
    spill300104_8 = __stackOp300104_17_0;
    (__stackOp300104_17_0)[0] = __call300104_18((life22_49).length);
    java.lang.Object[] __stackOp300104_19_0 = spill300104_8;
    spill300104_9 = __stackOp300104_19_0;
    (__stackOp300104_19_0)[1] = __call300104_21(__fieldRead300104_20(p2));
    java.lang.Object[] __stackOp300104_22_0 = spill300104_9;
    spill300104_10 = __stackOp300104_22_0;
    (__stackOp300104_22_0)[2] = __call300104_24(__fieldRead300104_23(p2));
    __call300104_25(forestValue300104_75_0, forestValue300104_75_1, spill300104_7, spill300104_10);
    if (!(((life22_49).length > 1))) {
        break forest_join_131;
    }
    spill300104_11 = p0;
    moom.CN __stackOp300104_27_0 = __sourceUninitializedNEW300104_26();
    spill300104_12 = __stackOp300104_27_0;
    spill300104_13 = __stackOp300104_27_0;
    if (!(p6)) {
        forestValue300104_108_0 = spill300104_11;
        forestValue300104_108_1 = spill300104_12;
        forestValue300104_108_2 = spill300104_13;
        break forest_join_108;
    }
    forestValue300104_109_0 = spill300104_11;
    forestValue300104_109_1 = spill300104_12;
    forestValue300104_109_2 = spill300104_13;
    forestValue300104_109_3 = "teams";
    break forest_join_109;
    }
    forestValue300104_109_0 = forestValue300104_108_0;
    forestValue300104_109_1 = forestValue300104_108_1;
    forestValue300104_109_2 = forestValue300104_108_2;
    forestValue300104_109_3 = "players";
    }
    spill300104_14 = __invokedynamic300104_28(forestValue300104_109_3);
    java.lang.Object[] __stackOp300104_29_0 = new java.lang.Object[2];
    spill300104_15 = __stackOp300104_29_0;
    spill300104_16 = __stackOp300104_29_0;
    spill300104_17 = 0;
    spill300104_18 = "%.2f";
    java.lang.Object[] __stackOp300104_30_0 = new java.lang.Object[1];
    spill300104_19 = __stackOp300104_30_0;
    (__stackOp300104_30_0)[0] = __call300104_31(life24_69);
    (spill300104_16)[spill300104_17] = __call300104_32(spill300104_18, spill300104_19);
    java.lang.Object[] __stackOp300104_33_0 = spill300104_15;
    spill300104_20 = __stackOp300104_33_0;
    (__stackOp300104_33_0)[1] = __call300104_34(life23_62);
    __explicitNewInit300104_35(forestValue300104_109_2, spill300104_14, spill300104_20);
    __call300104_36(forestValue300104_109_0, forestValue300104_109_1);
    }
    return;
}
public static void h300104_0(moom.b7 p0) throws Throwable {
    throw __call33010400_0(p0);
}
public static void h300104_1(moom.b7 p0) throws Throwable {
    throw __call33010401_0(p0);
}
public static void h300104_2(moom.b7 p0) throws Throwable {
    throw __call33010402_0(p0);
}
public static void h300104_3(moom.b7 p0) throws Throwable {
    throw __call33010403_0(p0);
}
public static void h300104_4(moom.b7 p0) throws Throwable {
    throw __call33010404_0(p0);
}
private static native long __fieldRead300104_0() throws Throwable;
private static native java.util.Random __sourceUninitializedNEW300104_1() throws Throwable;
private static native void __explicitNewInit300104_3(java.util.Random a0) throws Throwable;
private static native double __fieldRead300104_4(moom.qP a0) throws Throwable;
private static native boolean __call300104_5() throws Throwable;
private static native double __fieldRead300104_6(moom.qP a0) throws Throwable;
private static native double __fieldRead300104_7(moom.qP a0) throws Throwable;
private static native double __fieldRead300104_8(moom.qP a0) throws Throwable;
private static native int __integerCategory300104_9(boolean value) throws Throwable;
private static native int __integerCategory300104_10(boolean value) throws Throwable;
private static native int __call300104_11(moom.p9 a0, java.util.List a1) throws Throwable;
private static native int __call300104_12(java.util.List a0) throws Throwable;
private static native moom.qP[] __call300104_13(moom.p9 a0, java.util.Random a1, int a2, double a3, double a4, double a5, double a6) throws Throwable;
private static native int __call300104_14(moom.p9 a0, moom.qP a1, double a2, net.minecraft.world.World a3, java.util.Random a4, double a5, double a6, double a7, double a8, moom.qP[] a9, boolean a10) throws Throwable;
private static native double __call300104_15(moom.p9 a0, java.util.List a1, net.minecraft.world.World a2, moom.qP[] a3, boolean a4) throws Throwable;
private static native java.lang.String __invokedynamic300104_16(java.lang.String a0) throws Throwable;
private static native java.lang.Integer __call300104_18(int a0) throws Throwable;
private static native double __fieldRead300104_20(moom.qP a0) throws Throwable;
private static native java.lang.Double __call300104_21(double a0) throws Throwable;
private static native double __fieldRead300104_23(moom.qP a0) throws Throwable;
private static native java.lang.Double __call300104_24(double a0) throws Throwable;
private static native void __call300104_25(net.minecraft.command.ICommandSender a0, moom.p9 a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native moom.CN __sourceUninitializedNEW300104_26() throws Throwable;
private static native java.lang.String __invokedynamic300104_28(java.lang.String a0) throws Throwable;
private static native java.lang.Double __call300104_31(double a0) throws Throwable;
private static native java.lang.String __call300104_32(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Integer __call300104_34(int a0) throws Throwable;
private static native void __explicitNewInit300104_35(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call300104_36(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.lang.Exception __call33010400_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010401_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010402_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010403_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010404_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_87e7e4daff9880fa8ed9(moom.p9 a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_87e7e4daff9880fa8ed9 {

public static void f300105(moom.p9 receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forestValue300105_24_0;
    int forestValue300105_100_0;
    int forestValue300105_135_0;
    net.minecraft.command.ICommandSender forestValue300105_141_0;
    net.minecraft.command.ICommandSender forestValue300105_147_0;
    moom.CN forestValue300105_147_1;
    moom.CN forestValue300105_147_2;
    net.minecraft.command.ICommandSender forestValue300105_148_0;
    moom.CN forestValue300105_148_1;
    moom.CN forestValue300105_148_2;
    java.lang.String forestValue300105_148_3;
    int spill300105_0;
    moom.cc spill300105_1;
    boolean spill300105_2;
    int spill300105_3;
    moom.b9 spill300105_4;
    moom.ca spill300105_5;
    net.minecraft.command.ICommandSender spill300105_6;
    moom.b9 spill300105_7;
    moom.CN spill300105_8;
    moom.CN spill300105_9;
    java.lang.String spill300105_10;
    java.lang.Object[] spill300105_11;
    java.lang.Object[] spill300105_12;
    java.lang.Object[] spill300105_13;
    java.lang.Object[] spill300105_14;
    java.lang.Object[] spill300105_15;
    moom.p9 spill300105_16;
    net.minecraft.command.ICommandSender spill300105_17;
    java.util.ArrayList spill300105_18;
    moom.qP spill300105_19;
    long life3_3;
    int life5_5;
    int life6_25;
    moom.DT life7_28;
    double life8_38;
    double life10_48;
    double life12_55;
    double life14_64;
    int life16_70;
    java.util.ArrayList life17_72;
    java.lang.String life18_81;
    java.util.List life19_92;
    net.minecraft.entity.player.EntityPlayerMP life19_109;
    forest_join_148: {
    forest_join_147: {
    forest_join_141: {
    forest_join_140: {
    forest_join_135: {
    forest_join_126: {
    forest_join_122: {
    forest_join_118: {
    forest_join_24: {
    forest_join_23: {
    life3_3 = (__fieldRead300105_0() ^ 11122746057382L);
    life5_5 = __integerCategory300105_2(__call300105_1());
    spill300105_0 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue300105_24_0 = spill300105_0;
        break forest_join_24;
    }
    if (!((spill300105_0 < __invokedynamic300105_3(12349, (8101108101069875191L ^ life3_3))))) {
        break forest_join_23;
    }
    moom.cc __stackOp300105_5_0 = __sourceUninitializedNEW300105_4();
    spill300105_1 = __stackOp300105_5_0;
    __explicitNewInit300105_6(__stackOp300105_5_0, "commands.spreadplayers.usage", new java.lang.Object[0]);
    throw spill300105_1;
    }
    forestValue300105_24_0 = 0;
    }
    life6_25 = forestValue300105_24_0;
    life7_28 = __call300105_7(p0);
    life8_38 = __call300105_9(((double) __call300105_8(life7_28)), (p1)[(life6_25++)], 1);
    life10_48 = __call300105_11(((double) __call300105_10(life7_28)), (p1)[(life6_25++)], 1);
    life12_55 = __call300105_12((p1)[(life6_25++)], 0x0.0p0d);
    life14_64 = __call300105_13((p1)[(life6_25++)], (life12_55 + 0x1.0p0d));
    life16_70 = __integerCategory300105_15(__call300105_14((p1)[(life6_25++)]));
    life17_72 = __call300105_16();
    forest_cycle_72: while (true) {
    forest_join_115: {
    forest_join_111: {
    forest_join_103: {
    forest_join_100: {
    forest_join_97: {
    if (!((life6_25 < (p1).length))) {
        break forest_join_126;
    }
    life18_81 = (p1)[(life6_25++)];
    spill300105_2 = __call300105_17(life18_81);
    if (!((life5_5 != 0))) {
        forestValue300105_135_0 = __integerCategory300105_18(spill300105_2);
        break forest_join_135;
    }
    if (!(spill300105_2)) {
        break forest_join_103;
    }
    life19_92 = __call300105_20(p0, life18_81, __classLiteral300105_19());
    spill300105_3 = __call300105_21(life19_92);
    if (!((life5_5 != 0))) {
        forestValue300105_100_0 = spill300105_3;
        break forest_join_100;
    }
    if (!((spill300105_3 == 0))) {
        break forest_join_97;
    }
    break forest_join_118;
    }
    forestValue300105_100_0 = __integerCategory300105_23(__call300105_22(life17_72, life19_92));
    }
    __discardScalar300105_24(forestValue300105_100_0);
    if (!((life5_5 == 0))) {
        break forest_join_115;
    }
    }
    life19_109 = __call300105_27(__call300105_26(__call300105_25()), life18_81);
    if (!((life19_109 == null))) {
        break forest_join_111;
    }
    break forest_join_122;
    }
    __call300105_28(life17_72, life19_109);
    }
    if (!((life5_5 == 0))) {
        continue forest_cycle_72;
    }
    break forest_cycle_72;
    }
    break forest_join_126;
    }
    moom.b9 __stackOp300105_30_0 = __sourceUninitializedNEW300105_29();
    spill300105_4 = __stackOp300105_30_0;
    __explicitNewInit300105_31(__stackOp300105_30_0);
    throw spill300105_4;
    }
    moom.ca __stackOp300105_33_0 = __sourceUninitializedNEW300105_32();
    spill300105_5 = __stackOp300105_33_0;
    __explicitNewInit300105_34(__stackOp300105_33_0);
    throw spill300105_5;
    }
    spill300105_6 = p0;
    if (!((life5_5 != 0))) {
        forestValue300105_141_0 = spill300105_6;
        break forest_join_141;
    }
    __call300105_37(spill300105_6, __fieldRead300105_35(), __call300105_36(life17_72));
    forestValue300105_135_0 = __integerCategory300105_39(__call300105_38(life17_72));
    }
    if (!((forestValue300105_135_0 != 0))) {
        break forest_join_140;
    }
    moom.b9 __stackOp300105_41_0 = __sourceUninitializedNEW300105_40();
    spill300105_7 = __stackOp300105_41_0;
    __explicitNewInit300105_42(__stackOp300105_41_0);
    throw spill300105_7;
    }
    forestValue300105_141_0 = p0;
    }
    moom.CN __stackOp300105_44_0 = __sourceUninitializedNEW300105_43();
    spill300105_8 = __stackOp300105_44_0;
    spill300105_9 = __stackOp300105_44_0;
    if (!((life16_70 != 0))) {
        forestValue300105_147_0 = forestValue300105_141_0;
        forestValue300105_147_1 = spill300105_8;
        forestValue300105_147_2 = spill300105_9;
        break forest_join_147;
    }
    forestValue300105_148_0 = forestValue300105_141_0;
    forestValue300105_148_1 = spill300105_8;
    forestValue300105_148_2 = spill300105_9;
    forestValue300105_148_3 = "teams";
    break forest_join_148;
    }
    forestValue300105_148_0 = forestValue300105_147_0;
    forestValue300105_148_1 = forestValue300105_147_1;
    forestValue300105_148_2 = forestValue300105_147_2;
    forestValue300105_148_3 = "players";
    }
    spill300105_10 = __invokedynamic300105_45(forestValue300105_148_3);
    java.lang.Object[] __stackOp300105_46_0 = new java.lang.Object[5];
    spill300105_11 = __stackOp300105_46_0;
    (__stackOp300105_46_0)[0] = __call300105_48(__call300105_47(life17_72));
    java.lang.Object[] __stackOp300105_49_0 = spill300105_11;
    spill300105_12 = __stackOp300105_49_0;
    (__stackOp300105_49_0)[1] = __call300105_50(life14_64);
    java.lang.Object[] __stackOp300105_51_0 = spill300105_12;
    spill300105_13 = __stackOp300105_51_0;
    (__stackOp300105_51_0)[2] = __call300105_52(life8_38);
    java.lang.Object[] __stackOp300105_53_0 = spill300105_13;
    spill300105_14 = __stackOp300105_53_0;
    (__stackOp300105_53_0)[3] = __call300105_54(life10_48);
    java.lang.Object[] __stackOp300105_55_0 = spill300105_14;
    spill300105_15 = __stackOp300105_55_0;
    (__stackOp300105_55_0)[4] = __call300105_56(life12_55);
    __explicitNewInit300105_57(forestValue300105_148_2, spill300105_10, spill300105_15);
    __call300105_58(forestValue300105_148_0, forestValue300105_148_1);
    spill300105_16 = receiver;
    spill300105_17 = p0;
    spill300105_18 = life17_72;
    moom.qP __stackOp300105_60_0 = __sourceUninitializedNEW300105_59();
    spill300105_19 = __stackOp300105_60_0;
    __explicitNewInit300105_61(__stackOp300105_60_0, life8_38, life10_48);
    __call300105_65(spill300105_16, spill300105_17, spill300105_18, spill300105_19, life12_55, life14_64, __fieldRead300105_64(__cast300105_63(__call300105_62(life17_72, 0))), life16_70);
    return;
}
public static void h300105_0(moom.b7 p0) throws Throwable {
    throw __call33010500_0(p0);
}
public static void h300105_1(moom.b7 p0) throws Throwable {
    throw __call33010501_0(p0);
}
public static void h300105_2(moom.b7 p0) throws Throwable {
    throw __call33010502_0(p0);
}
public static void h300105_3(moom.b7 p0) throws Throwable {
    throw __call33010503_0(p0);
}
public static void h300105_4(moom.b7 p0) throws Throwable {
    throw __call33010504_0(p0);
}
public static void h300105_5(moom.b7 p0) throws Throwable {
    throw __call33010505_0(p0);
}
public static void h300105_6(moom.b7 p0) throws Throwable {
    throw __call33010506_0(p0);
}
public static void h300105_7(moom.b7 p0) throws Throwable {
    throw __call33010507_0(p0);
}
public static void h300105_8(moom.b7 p0) throws Throwable {
    throw __call33010508_0(p0);
}
private static native long __fieldRead300105_0() throws Throwable;
private static native boolean __call300105_1() throws Throwable;
private static native int __integerCategory300105_2(boolean value) throws Throwable;
private static native int __invokedynamic300105_3(int a0, long a1) throws Throwable;
private static native moom.cc __sourceUninitializedNEW300105_4() throws Throwable;
private static native void __explicitNewInit300105_6(moom.cc a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native moom.DT __call300105_7(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native int __call300105_8(moom.DT a0) throws Throwable;
private static native double __call300105_9(double a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call300105_10(moom.DT a0) throws Throwable;
private static native double __call300105_11(double a0, java.lang.String a1, int a2) throws Throwable;
private static native double __call300105_12(java.lang.String a0, double a1) throws Throwable;
private static native double __call300105_13(java.lang.String a0, double a1) throws Throwable;
private static native boolean __call300105_14(java.lang.String a0) throws Throwable;
private static native int __integerCategory300105_15(boolean value) throws Throwable;
private static native java.util.ArrayList __call300105_16() throws Throwable;
private static native boolean __call300105_17(java.lang.String a0) throws Throwable;
private static native int __integerCategory300105_18(boolean value) throws Throwable;
private static native java.lang.Class __classLiteral300105_19() throws Throwable;
private static native java.util.List __call300105_20(net.minecraft.command.ICommandSender a0, java.lang.String a1, java.lang.Class a2) throws Throwable;
private static native int __call300105_21(java.util.List a0) throws Throwable;
private static native boolean __call300105_22(java.util.ArrayList a0, java.util.List a1) throws Throwable;
private static native int __integerCategory300105_23(boolean value) throws Throwable;
private static native void __discardScalar300105_24(int a0) throws Throwable;
private static native moom.Bl __call300105_25() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call300105_26(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call300105_27(net.minecraft.server.management.ServerConfigurationManager a0, java.lang.String a1) throws Throwable;
private static native boolean __call300105_28(java.util.ArrayList a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native moom.b9 __sourceUninitializedNEW300105_29() throws Throwable;
private static native void __explicitNewInit300105_31(moom.b9 a0) throws Throwable;
private static native moom.ca __sourceUninitializedNEW300105_32() throws Throwable;
private static native void __explicitNewInit300105_34(moom.ca a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead300105_35() throws Throwable;
private static native int __call300105_36(java.util.ArrayList a0) throws Throwable;
private static native void __call300105_37(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native boolean __call300105_38(java.util.ArrayList a0) throws Throwable;
private static native int __integerCategory300105_39(boolean value) throws Throwable;
private static native moom.b9 __sourceUninitializedNEW300105_40() throws Throwable;
private static native void __explicitNewInit300105_42(moom.b9 a0) throws Throwable;
private static native moom.CN __sourceUninitializedNEW300105_43() throws Throwable;
private static native java.lang.String __invokedynamic300105_45(java.lang.String a0) throws Throwable;
private static native int __call300105_47(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Integer __call300105_48(int a0) throws Throwable;
private static native java.lang.Double __call300105_50(double a0) throws Throwable;
private static native java.lang.Double __call300105_52(double a0) throws Throwable;
private static native java.lang.Double __call300105_54(double a0) throws Throwable;
private static native java.lang.Double __call300105_56(double a0) throws Throwable;
private static native void __explicitNewInit300105_57(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call300105_58(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native moom.qP __sourceUninitializedNEW300105_59() throws Throwable;
private static native void __explicitNewInit300105_61(moom.qP a0, double a1, double a2) throws Throwable;
private static native java.lang.Object __call300105_62(java.util.ArrayList a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __cast300105_63(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead300105_64(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call300105_65(moom.p9 a0, net.minecraft.command.ICommandSender a1, java.util.ArrayList a2, moom.qP a3, double a4, double a5, net.minecraft.world.World a6, int a7) throws Throwable;
private static native java.lang.Exception __call33010500_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010501_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010502_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010503_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010504_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010505_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010506_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010507_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call33010508_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_709c57187ec688aea89c(moom.p9 a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_709c57187ec688aea89c {

public static java.util.List f1108(moom.p9 receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1108_17_0;
    int forwardValue1108_17_1;
    java.lang.String[] forwardValue1108_19_0;
    java.util.List forwardValue1108_24_0;
    int spill1108_0;
    int spill1108_1;
    java.lang.String[] spill1108_2;
    long life4_3;
    int life6_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    forward_join_17: {
    life4_3 = (__fieldRead1108_0() ^ 84754275595045L);
    life6_5 = __integerCategory1108_2(__call1108_1());
    spill1108_0 = (p1).length;
    spill1108_1 = 1;
    if (!((life6_5 == 0))) {
        forwardValue1108_17_0 = spill1108_0;
        forwardValue1108_17_1 = spill1108_1;
        break forward_join_17;
    }
    if (!((spill1108_0 >= spill1108_1))) {
        break forward_join_23;
    }
    spill1108_2 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1108_19_0 = spill1108_2;
        break forward_join_19;
    }
    forwardValue1108_17_0 = (spill1108_2).length;
    forwardValue1108_17_1 = 2;
    }
    if (!((forwardValue1108_17_0 <= forwardValue1108_17_1))) {
        break forward_join_23;
    }
    forwardValue1108_19_0 = p1;
    }
    forwardValue1108_24_0 = __call1108_3(forwardValue1108_19_0, 0, p2);
    break forward_join_24;
    }
    forwardValue1108_24_0 = null;
    }
    return forwardValue1108_24_0;
}
public static void h1108_0(moom.Oo p0) throws Throwable {
    throw __call1110800_0(p0);
}
public static void h1108_1(moom.Oo p0) throws Throwable {
    throw __call1110801_0(p0);
}
public static void h1108_2(moom.Oo p0) throws Throwable {
    throw __call1110802_0(p0);
}
private static native long __fieldRead1108_0() throws Throwable;
private static native boolean __call1108_1() throws Throwable;
private static native int __integerCategory1108_2(boolean value) throws Throwable;
private static native java.util.List __call1108_3(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native java.lang.Exception __call1110800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1110801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1110802_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8648_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/p9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7351;
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
            throw new RuntimeException("moom/p9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.p9.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_709c57187ec688aea89c(this, p0, p1, p2); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.spreadplayers.usage";
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "spreadplayers";
}


private double a(java.util.List<net.minecraft.entity.Entity> p0, net.minecraft.world.World p1, moom.qP[] p2, boolean p3) { return __sourceHandlerCall_7539a30bcf28ffd3d701(this, p0, p1, p2, p3); }


private void a(net.minecraft.command.ICommandSender p0, java.util.List<net.minecraft.entity.Entity> p1, moom.qP p2, double p3, double p4, net.minecraft.world.World p5, boolean p6) throws moom.b7 { __sourceHandlerCall_09484c7468b19ae56048(this, p0, p1, p2, p3, p4, p5, p6); }


private int a__sourceGeneric067(java.util.List<net.minecraft.entity.Entity> p0) { return __sourceHandlerCall_8a9d031c179f57640dd6(this, p0); }


private int a(moom.qP p0, double p1, net.minecraft.world.World p2, java.util.Random p3, double p4, double p5, double p6, double p7, moom.qP[] p8, boolean p9) throws moom.b7 { return __sourceHandlerCall_b7ee74431bdee85ea5ce(this, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_87e7e4daff9880fa8ed9(this, p0, p1); }


private moom.qP[] a(java.util.Random p0, int p1, double p2, double p3, double p4, double p5) { return __sourceHandlerCall_7659ae279204f44733f1(this, p0, p1, p2, p3, p4, p5); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8648_0() throws E;
}
