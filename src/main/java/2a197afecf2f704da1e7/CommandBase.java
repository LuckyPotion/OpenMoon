package net.minecraft.command;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class CommandBase implements net.minecraft.command.ICommand {

private static net.minecraft.command.IAdminCommand a;

private static java.lang.String b;

private static long f;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public CommandBase() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-736136339426740368L)), ((long)(-2846957586200815203L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(67922308567018L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.String __sourceSpill1840_7 = "tMgX9b";
    long local0_life8 = (net.minecraft.command.CommandBase.f ^ 34056595284720L);
    net.minecraft.command.CommandBase.b(((java.lang.String)(__sourceSpill1840_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1840_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1840_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1840_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1840_16 = new byte[8];
    (__sourceSpill1840_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1840_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1840_18 = __sourceSpill1840_16;
    ((javax.crypto.Cipher)(__sourceSpill1840_13)).init(((int)(__sourceSpill1840_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1840_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1840_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[6];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "±,\004¡ï2nÿ\tj,Ô\023â*j\t'\037ëvDÔò×C\032"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1840_27 = local6_life23;
        int __sourceSpill1840_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1840_27)).substring(((int)(__sourceSpill1840_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1840_32 = local8_life21;
        int __sourceSpill1840_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1840_35 = new byte[8];
        (__sourceSpill1840_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1840_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1840_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1840_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1840_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1840_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1840_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1840_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1840_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1840_36)).doFinal(((byte[])(__sourceSpill1840_35)));
        (__sourceSpill1840_32)[__sourceSpill1840_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "\025UÁµÉÂ\020=µS1î\026Æb"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1840_40 = local6_life23;
        int __sourceSpill1840_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1840_40)).substring(((int)(__sourceSpill1840_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1840_45 = local8_life21;
        int __sourceSpill1840_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1840_48 = new byte[8];
        (__sourceSpill1840_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1840_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1840_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1840_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1840_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1840_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1840_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1840_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1840_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1840_49)).doFinal(((byte[])(__sourceSpill1840_48)));
        (__sourceSpill1840_45)[__sourceSpill1840_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    h = ((long[])(local8_life21));
    i = ((java.lang.Integer[])(new java.lang.Integer[6]));
}

private static native <E extends Throwable> double __sourceHandlerCall_f4d1c4e376f5b637a7f7(double a0, java.lang.String a1, int a2, int a3, boolean a4) throws E;
private static final class __SourceHandler_f4d1c4e376f5b637a7f7 {

public static double f1462(double p0, java.lang.String p1, int p2, int p3, boolean p4) throws Throwable {
    int forwardValue1462_32_0;
    double forwardValue1462_36_0;
    int forwardValue1462_50_0;
    int forwardValue1462_65_0;
    int forwardValue1462_81_0;
    int forwardValue1462_92_0;
    int forwardValue1462_118_0;
    double forwardValue1462_137_0;
    boolean spill1462_0;
    int spill1462_1;
    boolean spill1462_2;
    int spill1462_3;
    int spill1462_4;
    int spill1462_5;
    int spill1462_6;
    boolean spill1462_7;
    int spill1462_8;
    double spill1462_9;
    long life6_3;
    int life9_8;
    int life8_9;
    double life10_49;
    int life12_75;
    forward_join_137: {
    forward_join_136: {
    forward_join_118: {
    forward_join_112: {
    forward_join_92: {
    forward_join_88: {
    forward_join_81: {
    forward_join_80: {
    forward_join_65: {
    forward_join_59: {
    forward_join_50: {
    forward_join_47: {
    forward_join_36: {
    forward_join_35: {
    forward_join_32: {
    forward_join_31: {
    life6_3 = (__fieldRead1462_0() ^ 54167032926934L);
    spill1462_0 = __call1462_1();
    life9_8 = __integerCategory1462_3(__call1462_2(p1, "~"));
    life8_9 = __integerCategory1462_4(spill1462_0);
    spill1462_1 = life9_8;
    if (!((life8_9 == 0))) {
        forwardValue1462_32_0 = spill1462_1;
        break forward_join_32;
    }
    if (!((spill1462_1 != 0))) {
        break forward_join_31;
    }
    spill1462_2 = __call1462_5(p0);
    if (!((life8_9 == 0))) {
        forwardValue1462_32_0 = __integerCategory1462_6(spill1462_2);
        break forward_join_32;
    }
    if (!(spill1462_2)) {
        break forward_join_31;
    }
    throw new moom.b_("commands.generic.num.invalid", new java.lang.Object[] {__call1462_7(p0)});
    }
    forwardValue1462_32_0 = life9_8;
    }
    if (!((forwardValue1462_32_0 != 0))) {
        break forward_join_35;
    }
    forwardValue1462_36_0 = p0;
    break forward_join_36;
    }
    forwardValue1462_36_0 = 0x0.0p0d;
    }
    life10_49 = forwardValue1462_36_0;
    spill1462_3 = life9_8;
    if (!((life8_9 == 0))) {
        forwardValue1462_50_0 = spill1462_3;
        break forward_join_50;
    }
    if (!((spill1462_3 != 0))) {
        break forward_join_47;
    }
    spill1462_4 = __call1462_8(p1);
    if (!((life8_9 == 0))) {
        forwardValue1462_81_0 = spill1462_4;
        break forward_join_81;
    }
    if (!((spill1462_4 > 1))) {
        break forward_join_80;
    }
    }
    forwardValue1462_50_0 = __integerCategory1462_10(__call1462_9(p1, "."));
    }
    life12_75 = forwardValue1462_50_0;
    spill1462_5 = life9_8;
    if (!((life8_9 == 0))) {
        forwardValue1462_65_0 = spill1462_5;
        break forward_join_65;
    }
    if (!((spill1462_5 != 0))) {
        break forward_join_59;
    }
    p1 = __call1462_11(p1, 1);
    }
    life10_49 = (life10_49 + __call1462_12(p1));
    forwardValue1462_65_0 = life12_75;
    }
    if (!((life8_9 == 0))) {
        forwardValue1462_81_0 = forwardValue1462_65_0;
        break forward_join_81;
    }
    if (!((forwardValue1462_65_0 == 0))) {
        break forward_join_80;
    }
    spill1462_6 = life9_8;
    if (!((life8_9 == 0))) {
        forwardValue1462_81_0 = spill1462_6;
        break forward_join_81;
    }
    if (!((spill1462_6 == 0))) {
        break forward_join_80;
    }
    spill1462_7 = p4;
    if (!((life8_9 == 0))) {
        forwardValue1462_81_0 = __integerCategory1462_13(spill1462_7);
        break forward_join_81;
    }
    if (!(spill1462_7)) {
        break forward_join_80;
    }
    life10_49 = (life10_49 + 0x1.0p-1d);
    }
    forwardValue1462_81_0 = p2;
    }
    if (!((life8_9 == 0))) {
        forwardValue1462_92_0 = forwardValue1462_81_0;
        break forward_join_92;
    }
    if (!((forwardValue1462_81_0 == 0))) {
        break forward_join_88;
    }
    spill1462_8 = p3;
    if (!((life8_9 == 0))) {
        forwardValue1462_92_0 = spill1462_8;
        break forward_join_92;
    }
    if (!((spill1462_8 != 0))) {
        break forward_join_136;
    }
    }
    forwardValue1462_92_0 = __numericCompare1462_14(life10_49, ((double) p2));
    }
    if (!((life8_9 == 0))) {
        forwardValue1462_118_0 = forwardValue1462_92_0;
        break forward_join_118;
    }
    if (!((forwardValue1462_92_0 < 0))) {
        break forward_join_112;
    }
    throw new moom.b_("commands.generic.double.tooSmall", new java.lang.Object[] {__call1462_15(life10_49), __call1462_16(p2)});
    }
    spill1462_9 = life10_49;
    if (!((life8_9 == 0))) {
        forwardValue1462_137_0 = spill1462_9;
        break forward_join_137;
    }
    forwardValue1462_118_0 = __numericCompare1462_17(spill1462_9, ((double) p3));
    }
    if (!((forwardValue1462_118_0 > 0))) {
        break forward_join_136;
    }
    throw new moom.b_("commands.generic.double.tooBig", new java.lang.Object[] {__call1462_18(life10_49), __call1462_19(p3)});
    }
    forwardValue1462_137_0 = life10_49;
    }
    return forwardValue1462_137_0;
}
public static void h1462_0(moom.b_ p0) throws Throwable {
    throw __call1146200_0(p0);
}
public static void h1462_1(moom.b_ p0) throws Throwable {
    throw __call1146201_0(p0);
}
public static void h1462_2(moom.b_ p0) throws Throwable {
    throw __call1146202_0(p0);
}
public static void h1462_3(moom.b_ p0) throws Throwable {
    throw __call1146203_0(p0);
}
public static void h1462_4(moom.b_ p0) throws Throwable {
    throw __call1146204_0(p0);
}
public static void h1462_5(moom.b_ p0) throws Throwable {
    throw __call1146205_0(p0);
}
public static void h1462_6(moom.b_ p0) throws Throwable {
    throw __call1146206_0(p0);
}
public static void h1462_7(moom.b_ p0) throws Throwable {
    throw __call1146207_0(p0);
}
public static void h1462_8(moom.b_ p0) throws Throwable {
    throw __call1146208_0(p0);
}
public static void h1462_9(moom.b_ p0) throws Throwable {
    throw __call1146209_0(p0);
}
public static void h1462_10(moom.b_ p0) throws Throwable {
    throw __call1146210_0(p0);
}
public static void h1462_11(moom.b_ p0) throws Throwable {
    throw __call1146211_0(p0);
}
public static void h1462_12(moom.b_ p0) throws Throwable {
    throw __call1146212_0(p0);
}
public static void h1462_13(moom.b_ p0) throws Throwable {
    throw __call1146213_0(p0);
}
public static void h1462_14(moom.b_ p0) throws Throwable {
    throw __call1146214_0(p0);
}
public static void h1462_15(moom.b_ p0) throws Throwable {
    throw __call1146215_0(p0);
}
public static void h1462_16(moom.b_ p0) throws Throwable {
    throw __call1146216_0(p0);
}
public static void h1462_17(moom.b_ p0) throws Throwable {
    throw __call1146217_0(p0);
}
public static void h1462_18(moom.b_ p0) throws Throwable {
    throw __call1146218_0(p0);
}
public static void h1462_19(moom.b_ p0) throws Throwable {
    throw __call1146219_0(p0);
}
public static void h1462_20(moom.b_ p0) throws Throwable {
    throw __call1146220_0(p0);
}
public static void h1462_21(moom.b_ p0) throws Throwable {
    throw __call1146221_0(p0);
}
public static void h1462_22(moom.b_ p0) throws Throwable {
    throw __call1146222_0(p0);
}
private static native long __fieldRead1462_0() throws Throwable;
private static native boolean __call1462_1() throws Throwable;
private static native boolean __call1462_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1462_3(boolean value) throws Throwable;
private static native int __integerCategory1462_4(boolean value) throws Throwable;
private static native boolean __call1462_5(double a0) throws Throwable;
private static native int __integerCategory1462_6(boolean value) throws Throwable;
private static native java.lang.Double __call1462_7(double a0) throws Throwable;
private static native int __call1462_8(java.lang.String a0) throws Throwable;
private static native boolean __call1462_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1462_10(boolean value) throws Throwable;
private static native java.lang.String __call1462_11(java.lang.String a0, int a1) throws Throwable;
private static native double __call1462_12(java.lang.String a0) throws Throwable;
private static native int __integerCategory1462_13(boolean value) throws Throwable;
private static native int __numericCompare1462_14(double a0, double a1) throws Throwable;
private static native java.lang.Double __call1462_15(double a0) throws Throwable;
private static native java.lang.Integer __call1462_16(int a0) throws Throwable;
private static native int __numericCompare1462_17(double a0, double a1) throws Throwable;
private static native java.lang.Double __call1462_18(double a0) throws Throwable;
private static native java.lang.Integer __call1462_19(int a0) throws Throwable;
private static native java.lang.Exception __call1146200_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146201_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146202_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146203_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146204_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146205_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146206_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146207_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146208_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146209_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146210_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146211_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146212_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146213_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146214_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146215_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146216_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146217_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146218_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146219_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146220_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146221_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146222_0(moom.b_ a0) throws Throwable;

}

private static native <E extends Throwable> double __sourceHandlerCall_e579320c0c590434ba39(java.lang.String a0) throws E;
private static final class __SourceHandler_e579320c0c590434ba39 {

public static double f163(java.lang.String p0) throws Throwable {
    double spill163_0;
    double joinValue163_0_0;
    long life1_3;
    int life3_5;
    double life4_8;
    life1_3 = (__fieldRead163_0() ^ 70031053653444L);
    life3_5 = __integerCategory163_2(__call163_1());
    life4_8 = __call163_3(p0);
    spill163_0 = life4_8;
    if ((life3_5 == 0)) {
        if ((!__call163_4(spill163_0))) {
        throw new moom.b_("commands.generic.num.invalid", new java.lang.Object[] {p0});
    }
        joinValue163_0_0 = life4_8;
    } else {
        joinValue163_0_0 = spill163_0;
    }
    return joinValue163_0_0;
}
public static double h163_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3016300_0(p0);
}
public static double h163_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3016301_0(p0);
}
public static double h163_2(java.lang.NumberFormatException p0, java.lang.String p1, double p2) throws Throwable {
    java.lang.NumberFormatException life2_2;
    life2_2 = p0;
    throw new moom.b_("commands.generic.num.invalid", new java.lang.Object[] {p1});
}
private static native long __fieldRead163_0() throws Throwable;
private static native boolean __call163_1() throws Throwable;
private static native int __integerCategory163_2(boolean value) throws Throwable;
private static native double __call163_3(java.lang.String a0) throws Throwable;
private static native boolean __call163_4(double a0) throws Throwable;
private static native java.lang.Exception __call3016300_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3016301_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> double __sourceHandlerCall_3bea7e736e6f6950202a(java.lang.String a0, double a1, double a2) throws E;
private static final class __SourceHandler_3bea7e736e6f6950202a {

public static double f164(java.lang.String p0, double p1, double p2) throws Throwable {
    int forwardValue164_37_0;
    double forwardValue164_56_0;
    boolean spill164_0;
    int spill164_1;
    double spill164_2;
    long life5_3;
    double life8_7;
    int life7_8;
    forward_join_56: {
    forward_join_55: {
    forward_join_37: {
    forward_join_32: {
    life5_3 = (__fieldRead164_0() ^ 88145004893817L);
    spill164_0 = __call164_1();
    life8_7 = __call164_2(p0);
    life7_8 = __integerCategory164_3(spill164_0);
    spill164_1 = __numericCompare164_4(life8_7, p1);
    if (!((life7_8 == 0))) {
        forwardValue164_37_0 = spill164_1;
        break forward_join_37;
    }
    if (!((spill164_1 < 0))) {
        break forward_join_32;
    }
    throw new moom.b_("commands.generic.double.tooSmall", new java.lang.Object[] {__call164_5(life8_7), __call164_6(p1)});
    }
    spill164_2 = life8_7;
    if (!((life7_8 == 0))) {
        forwardValue164_56_0 = spill164_2;
        break forward_join_56;
    }
    forwardValue164_37_0 = __numericCompare164_7(spill164_2, p2);
    }
    if (!((forwardValue164_37_0 > 0))) {
        break forward_join_55;
    }
    throw new moom.b_("commands.generic.double.tooBig", new java.lang.Object[] {__call164_8(life8_7), __call164_9(p2)});
    }
    forwardValue164_56_0 = life8_7;
    }
    return forwardValue164_56_0;
}
public static double h164_0(moom.b_ p0) throws Throwable {
    throw __call3016400_0(p0);
}
public static double h164_1(moom.b_ p0) throws Throwable {
    throw __call3016401_0(p0);
}
public static double h164_2(moom.b_ p0) throws Throwable {
    throw __call3016402_0(p0);
}
public static double h164_3(moom.b_ p0) throws Throwable {
    throw __call3016403_0(p0);
}
private static native long __fieldRead164_0() throws Throwable;
private static native boolean __call164_1() throws Throwable;
private static native double __call164_2(java.lang.String a0) throws Throwable;
private static native int __integerCategory164_3(boolean value) throws Throwable;
private static native int __numericCompare164_4(double a0, double a1) throws Throwable;
private static native java.lang.Double __call164_5(double a0) throws Throwable;
private static native java.lang.Double __call164_6(double a0) throws Throwable;
private static native int __numericCompare164_7(double a0, double a1) throws Throwable;
private static native java.lang.Double __call164_8(double a0) throws Throwable;
private static native java.lang.Double __call164_9(double a0) throws Throwable;
private static native java.lang.Exception __call3016400_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3016401_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3016402_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3016403_0(moom.b_ a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_aa6cd429436d99f705bf(java.lang.String a0, int a1, int a2) throws E;
private static final class __SourceHandler_aa6cd429436d99f705bf {

public static int f1463(java.lang.String p0, int p1, int p2) throws Throwable {
    int forwardValue1463_35_0;
    int forwardValue1463_35_1;
    int forwardValue1463_54_0;
    boolean spill1463_0;
    int spill1463_1;
    int spill1463_2;
    int spill1463_3;
    long life3_3;
    int life6_7;
    int life5_8;
    forward_join_54: {
    forward_join_53: {
    forward_join_35: {
    forward_join_31: {
    life3_3 = (__fieldRead1463_0() ^ 54395011686946L);
    spill1463_0 = __call1463_1();
    life6_7 = __call1463_2(p0);
    life5_8 = __integerCategory1463_3(spill1463_0);
    spill1463_1 = life6_7;
    spill1463_2 = p1;
    if (!((life5_8 != 0))) {
        forwardValue1463_35_0 = spill1463_1;
        forwardValue1463_35_1 = spill1463_2;
        break forward_join_35;
    }
    if (!((spill1463_1 < spill1463_2))) {
        break forward_join_31;
    }
    throw new moom.b_("commands.generic.num.tooSmall", new java.lang.Object[] {__call1463_4(life6_7), __call1463_5(p1)});
    }
    spill1463_3 = life6_7;
    if (!((life5_8 != 0))) {
        forwardValue1463_54_0 = spill1463_3;
        break forward_join_54;
    }
    forwardValue1463_35_0 = spill1463_3;
    forwardValue1463_35_1 = p2;
    }
    if (!((forwardValue1463_35_0 > forwardValue1463_35_1))) {
        break forward_join_53;
    }
    throw new moom.b_("commands.generic.num.tooBig", new java.lang.Object[] {__call1463_6(life6_7), __call1463_7(p2)});
    }
    forwardValue1463_54_0 = life6_7;
    }
    return forwardValue1463_54_0;
}
public static void h1463_0(moom.b_ p0) throws Throwable {
    throw __call1146300_0(p0);
}
public static void h1463_1(moom.b_ p0) throws Throwable {
    throw __call1146301_0(p0);
}
public static void h1463_2(moom.b_ p0) throws Throwable {
    throw __call1146302_0(p0);
}
public static void h1463_3(moom.b_ p0) throws Throwable {
    throw __call1146303_0(p0);
}
private static native long __fieldRead1463_0() throws Throwable;
private static native boolean __call1463_1() throws Throwable;
private static native int __call1463_2(java.lang.String a0) throws Throwable;
private static native int __integerCategory1463_3(boolean value) throws Throwable;
private static native java.lang.Integer __call1463_4(int a0) throws Throwable;
private static native java.lang.Integer __call1463_5(int a0) throws Throwable;
private static native java.lang.Integer __call1463_6(int a0) throws Throwable;
private static native java.lang.Integer __call1463_7(int a0) throws Throwable;
private static native java.lang.Exception __call1146300_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146301_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146302_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1146303_0(moom.b_ a0) throws Throwable;

}

private static native <E extends Throwable> long __sourceHandlerCall_06fa7e629c01f1a9009b(java.lang.String a0, long a1, long a2) throws E;
private static final class __SourceHandler_06fa7e629c01f1a9009b {

public static long f162(java.lang.String p0, long p1, long p2) throws Throwable {
    int forwardValue162_37_0;
    long forwardValue162_56_0;
    boolean spill162_0;
    int spill162_1;
    long spill162_2;
    long life5_3;
    long life8_7;
    int life7_8;
    forward_join_56: {
    forward_join_55: {
    forward_join_37: {
    forward_join_32: {
    life5_3 = (__fieldRead162_0() ^ 33806961922658L);
    spill162_0 = __call162_1();
    life8_7 = __call162_2(p0);
    life7_8 = __integerCategory162_3(spill162_0);
    spill162_1 = __numericCompare162_4(life8_7, p1);
    if (!((life7_8 != 0))) {
        forwardValue162_37_0 = spill162_1;
        break forward_join_37;
    }
    if (!((spill162_1 < 0))) {
        break forward_join_32;
    }
    throw new moom.b_("commands.generic.num.tooSmall", new java.lang.Object[] {__call162_5(life8_7), __call162_6(p1)});
    }
    spill162_2 = life8_7;
    if (!((life7_8 != 0))) {
        forwardValue162_56_0 = spill162_2;
        break forward_join_56;
    }
    forwardValue162_37_0 = __numericCompare162_7(spill162_2, p2);
    }
    if (!((forwardValue162_37_0 > 0))) {
        break forward_join_55;
    }
    throw new moom.b_("commands.generic.num.tooBig", new java.lang.Object[] {__call162_8(life8_7), __call162_9(p2)});
    }
    forwardValue162_56_0 = life8_7;
    }
    return forwardValue162_56_0;
}
public static long h162_0(moom.b_ p0) throws Throwable {
    throw __call3016200_0(p0);
}
public static long h162_1(moom.b_ p0) throws Throwable {
    throw __call3016201_0(p0);
}
public static long h162_2(moom.b_ p0) throws Throwable {
    throw __call3016202_0(p0);
}
public static long h162_3(moom.b_ p0) throws Throwable {
    throw __call3016203_0(p0);
}
private static native long __fieldRead162_0() throws Throwable;
private static native boolean __call162_1() throws Throwable;
private static native long __call162_2(java.lang.String a0) throws Throwable;
private static native int __integerCategory162_3(boolean value) throws Throwable;
private static native int __numericCompare162_4(long a0, long a1) throws Throwable;
private static native java.lang.Long __call162_5(long a0) throws Throwable;
private static native java.lang.Long __call162_6(long a0) throws Throwable;
private static native int __numericCompare162_7(long a0, long a1) throws Throwable;
private static native java.lang.Long __call162_8(long a0) throws Throwable;
private static native java.lang.Long __call162_9(long a0) throws Throwable;
private static native java.lang.Exception __call3016200_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3016201_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3016202_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3016203_0(moom.b_ a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.util.IChatComponent __sourceHandlerCall_4787658bd55b72bea73a(java.util.List a0) throws E;
private static final class __SourceHandler_4787658bd55b72bea73a {

public static net.minecraft.util.IChatComponent f1464(java.util.List p0) throws Throwable {
    int lexicalValue1464_22_0;
    int lexicalValue1464_36_0;
    boolean spill1464_0;
    int spill1464_1;
    long life1_3;
    moom.CM life4_9;
    int life5_11;
    int life3_12;
    lexical_join_51: {
    life1_3 = (__fieldRead1464_0() ^ 91217576604040L);
    spill1464_0 = __call1464_1();
    life4_9 = new moom.CM("");
    life5_11 = 0;
    life3_12 = __integerCategory1464_2(spill1464_0);
    lexical_cycle_13: while (true) {
    lexical_join_41: {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_22: {
    if (!((life5_11 < __call1464_3(p0)))) {
        break lexical_join_51;
    }
    spill1464_1 = life5_11;
    if (!((life3_12 == 0))) {
        lexicalValue1464_22_0 = spill1464_1;
        break lexical_join_22;
    }
    if (!((spill1464_1 > 0))) {
        break lexical_join_41;
    }
    lexicalValue1464_22_0 = life5_11;
    }
    if (!((life3_12 == 0))) {
        lexicalValue1464_36_0 = lexicalValue1464_22_0;
        break lexical_join_36;
    }
    if (!((lexicalValue1464_22_0 == (__call1464_4(p0) - 1)))) {
        break lexical_join_35;
    }
    __call1464_5(life4_9, " and ");
    if (!((life3_12 != 0))) {
        break lexical_join_41;
    }
    }
    lexicalValue1464_36_0 = life5_11;
    }
    if (!((lexicalValue1464_36_0 > 0))) {
        break lexical_join_41;
    }
    __call1464_6(life4_9, ", ");
    }
    __call1464_9(life4_9, __cast1464_8(__call1464_7(p0, life5_11)));
    life5_11 += 1;
    if (!((life3_12 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return life4_9;
}
public static void h1464_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146400_0(p0);
}
public static void h1464_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146401_0(p0);
}
public static void h1464_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146402_0(p0);
}
public static void h1464_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146403_0(p0);
}
public static void h1464_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146404_0(p0);
}
private static native long __fieldRead1464_0() throws Throwable;
private static native boolean __call1464_1() throws Throwable;
private static native int __integerCategory1464_2(boolean value) throws Throwable;
private static native int __call1464_3(java.util.List a0) throws Throwable;
private static native int __call1464_4(java.util.List a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1464_5(moom.CM a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1464_6(moom.CM a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call1464_7(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __cast1464_8(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1464_9(moom.CM a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native java.lang.Exception __call1146400_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146401_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146402_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146403_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146404_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.player.EntityPlayerMP __sourceHandlerCall_1592fec85eb90f7f66e7(net.minecraft.command.ICommandSender a0) throws E;
private static final class __SourceHandler_1592fec85eb90f7f66e7 {

public static net.minecraft.entity.player.EntityPlayerMP f1465(net.minecraft.command.ICommandSender p0) throws Throwable {
    net.minecraft.command.ICommandSender forwardValue1465_12_0;
    net.minecraft.command.ICommandSender spill1465_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_12: {
    life1_3 = (__fieldRead1465_0() ^ 136118099713804L);
    life3_5 = __integerCategory1465_2(__call1465_1());
    spill1465_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue1465_12_0 = spill1465_0;
        break forward_join_12;
    }
    if (!((__instanceOf1465_3(spill1465_0) != 0))) {
        break forward_join_14;
    }
    forwardValue1465_12_0 = p0;
    }
    return __cast1465_4(forwardValue1465_12_0);
    }
    throw new moom.ca("You must specify which player you wish to perform this action on.", new java.lang.Object[0]);
}
public static void h1465_0(moom.ca p0) throws Throwable {
    throw __call1146500_0(p0);
}
public static void h1465_1(moom.ca p0) throws Throwable {
    throw __call1146501_0(p0);
}
private static native long __fieldRead1465_0() throws Throwable;
private static native boolean __call1465_1() throws Throwable;
private static native int __integerCategory1465_2(boolean value) throws Throwable;
private static native int __instanceOf1465_3(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast1465_4(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native java.lang.Exception __call1146500_0(moom.ca a0) throws Throwable;
private static native java.lang.Exception __call1146501_0(moom.ca a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_882a268083f90542d844(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws E;
private static final class __SourceHandler_882a268083f90542d844 {

public static java.lang.String f1098(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws Throwable {
    long life2_3;
    int life4_5;
    life2_3 = (__fieldRead1098_0() ^ 106329174684772L);
    life4_5 = __integerCategory1098_2(__call1098_1());
    return __call1098_4(__call1098_3(p0, p1));
}
public static java.lang.String h1098_0(moom.ca p0, java.lang.String p1, int p2) throws Throwable {
    java.lang.String forestValue3109800_10_0;
    java.lang.String spill3109800_0;
    moom.ca life3_2;
    forest_join_10: {
    forest_join_9: {
    life3_2 = p0;
    spill3109800_0 = p1;
    if (!((p2 == 0))) {
        forestValue3109800_10_0 = spill3109800_0;
        break forest_join_10;
    }
    if (!(__call3109800_0(spill3109800_0))) {
        break forest_join_9;
    }
    throw life3_2;
    }
    forestValue3109800_10_0 = p1;
    }
    return forestValue3109800_10_0;
}
public static java.lang.String h1098_1(moom.ca p0) throws Throwable {
    throw __call3109801_0(p0);
}
public static java.lang.String h1098_2(moom.ca p0) throws Throwable {
    throw __call3109802_0(p0);
}
private static native long __fieldRead1098_0() throws Throwable;
private static native boolean __call1098_1() throws Throwable;
private static native int __integerCategory1098_2(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call1098_3(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1098_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call3109800_0(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call3109801_0(moom.ca a0) throws Throwable;
private static native java.lang.Exception __call3109802_0(moom.ca a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.Entity __sourceHandlerCall_8b692b8c064446b1d3d3(net.minecraft.command.ICommandSender a0, java.lang.String a1, java.lang.Class a2) throws E;
private static final class __SourceHandler_8b692b8c064446b1d3d3 {

public static net.minecraft.entity.Entity f58(net.minecraft.command.ICommandSender p0, java.lang.String p1, java.lang.Class p2) throws Throwable {
    net.minecraft.entity.Entity forestValue58_23_0;
    moom.Bl forestValue58_38_0;
    net.minecraft.entity.Entity forestValue58_43_0;
    boolean spill58_0;
    net.minecraft.entity.Entity spill58_1;
    moom.Bl spill58_2;
    long life3_3;
    net.minecraft.entity.Entity life6_8;
    moom.Bl life7_11;
    int life5_12;
    java.util.UUID life8_36;
    forest_join_51: {
    forest_join_43: {
    forest_join_42: {
    forest_join_38: {
    forest_join_23: {
    forest_join_22: {
    life3_3 = (__fieldRead58_0() ^ 77169092912639L);
    life6_8 = __call58_1(p0, p1, p2);
    spill58_0 = __call58_2();
    life7_11 = __call58_3();
    life5_12 = __integerCategory58_4(spill58_0);
    spill58_1 = life6_8;
    if (!((life5_12 == 0))) {
        forestValue58_23_0 = spill58_1;
        break forest_join_23;
    }
    if (!((spill58_1 == null))) {
        break forest_join_22;
    }
    life6_8 = __call58_6(__call58_5(life7_11), p1);
    }
    forestValue58_23_0 = life6_8;
    }
    if (!((life5_12 == 0))) {
        forestValue58_43_0 = forestValue58_23_0;
        break forest_join_43;
    }
    if (!((forestValue58_23_0 == null))) {
        break forest_join_42;
    }
    life8_36 = __call58_7(p1);
    spill58_2 = life7_11;
    if (!((life5_12 == 0))) {
        forestValue58_38_0 = spill58_2;
        break forest_join_38;
    }
    life6_8 = __call58_8(spill58_2, life8_36);
    if (!((life6_8 == null))) {
        break forest_join_42;
    }
    forestValue58_38_0 = life7_11;
    }
    life6_8 = __call58_10(__call58_9(forestValue58_38_0), life8_36);
    }
    forestValue58_43_0 = life6_8;
    }
    if (!((forestValue58_43_0 != null))) {
        break forest_join_51;
    }
    if (!(__call58_12(p2, __call58_11(life6_8)))) {
        break forest_join_51;
    }
    return life6_8;
    }
    throw new moom.b9();
}
public static net.minecraft.entity.Entity h58_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3005800_0(p0);
}
public static net.minecraft.entity.Entity h58_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3005801_0(p0);
}
public static net.minecraft.entity.Entity h58_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3005802_0(p0);
}
public static net.minecraft.entity.Entity h58_3(java.lang.IllegalArgumentException p0, java.util.UUID p1) throws Throwable {
    java.lang.IllegalArgumentException life1_2;
    life1_2 = p0;
    throw new moom.b9("commands.generic.entity.invalidUuid", new java.lang.Object[0]);
}
public static net.minecraft.entity.Entity h58_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3005804_0(p0);
}
public static net.minecraft.entity.Entity h58_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3005805_0(p0);
}
private static native long __fieldRead58_0() throws Throwable;
private static native net.minecraft.entity.Entity __call58_1(net.minecraft.command.ICommandSender a0, java.lang.String a1, java.lang.Class a2) throws Throwable;
private static native boolean __call58_2() throws Throwable;
private static native moom.Bl __call58_3() throws Throwable;
private static native int __integerCategory58_4(boolean value) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call58_5(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call58_6(net.minecraft.server.management.ServerConfigurationManager a0, java.lang.String a1) throws Throwable;
private static native java.util.UUID __call58_7(java.lang.String a0) throws Throwable;
private static native net.minecraft.entity.Entity __call58_8(moom.Bl a0, java.util.UUID a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call58_9(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call58_10(net.minecraft.server.management.ServerConfigurationManager a0, java.util.UUID a1) throws Throwable;
private static native java.lang.Class __call58_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call58_12(java.lang.Class a0, java.lang.Class a1) throws Throwable;
private static native java.lang.Exception __call3005800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3005801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3005802_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3005804_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3005805_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c6cb58559362f7b6b838(net.minecraft.command.ICommandSender a0, net.minecraft.command.ICommand a1, int a2, java.lang.String a3, java.lang.Object[] a4) throws E;
private static final class __SourceHandler_c6cb58559362f7b6b838 {

public static void f1466(net.minecraft.command.ICommandSender p0, net.minecraft.command.ICommand p1, int p2, java.lang.String p3, java.lang.Object[] p4) throws Throwable {
    net.minecraft.command.IAdminCommand forwardValue1466_11_0;
    net.minecraft.command.IAdminCommand spill1466_0;
    long life5_3;
    int life7_5;
    forward_join_17: {
    forward_join_11: {
    life5_3 = (__fieldRead1466_0() ^ 100441930499589L);
    life7_5 = __integerCategory1466_2(__call1466_1());
    spill1466_0 = __fieldRead1466_3();
    if (!((life7_5 != 0))) {
        forwardValue1466_11_0 = spill1466_0;
        break forward_join_11;
    }
    if (!((spill1466_0 != null))) {
        break forward_join_17;
    }
    forwardValue1466_11_0 = __fieldRead1466_4();
    }
    __call1466_5(forwardValue1466_11_0, p0, p1, p2, p3, p4);
    }
    return;
}
public static void h1466_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146600_0(p0);
}
private static native long __fieldRead1466_0() throws Throwable;
private static native boolean __call1466_1() throws Throwable;
private static native int __integerCategory1466_2(boolean value) throws Throwable;
private static native net.minecraft.command.IAdminCommand __fieldRead1466_3() throws Throwable;
private static native net.minecraft.command.IAdminCommand __fieldRead1466_4() throws Throwable;
private static native void __call1466_5(net.minecraft.command.IAdminCommand a0, net.minecraft.command.ICommandSender a1, net.minecraft.command.ICommand a2, int a3, java.lang.String a4, java.lang.Object[] a5) throws Throwable;
private static native java.lang.Exception __call1146600_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.util.IChatComponent __sourceHandlerCall_45bf9dc1f41e9ed8ab5d(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, boolean a3) throws E;
private static final class __SourceHandler_45bf9dc1f41e9ed8ab5d {

public static net.minecraft.util.IChatComponent f24(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2, boolean p3) throws Throwable {
    net.minecraft.util.IChatComponent forestValue24_52_0;
    boolean spill24_0;
    net.minecraft.util.IChatComponent spill24_1;
    long life4_3;
    moom.CM life7_8;
    int life8_11;
    int life6_12;
    net.minecraft.util.IChatComponent life9_34;
    net.minecraft.util.IChatComponent life10_47;
    forest_join_65: {
    forest_join_61: {
    life4_3 = (__fieldRead24_0() ^ 129624120407907L);
    life7_8 = new moom.CM("");
    spill24_0 = __call24_1();
    life8_11 = p2;
    life6_12 = __integerCategory24_2(spill24_0);
    forest_cycle_13: while (true) {
    forest_join_58: {
    forest_join_53: {
    forest_join_52: {
    forest_join_51: {
    forest_join_24: {
    if (!((life8_11 < (p1).length))) {
        break forest_join_65;
    }
    if (!((life8_11 > p2))) {
        break forest_join_24;
    }
    __call24_3(life7_8, " ");
    }
    life9_34 = new moom.CM((p1)[life8_11]);
    if (!((life6_12 != 0))) {
        break forest_join_58;
    }
    if (!(p3)) {
        break forest_join_53;
    }
    life10_47 = __call24_4(p0, (p1)[life8_11]);
    spill24_1 = life10_47;
    if (!((life6_12 != 0))) {
        forestValue24_52_0 = spill24_1;
        break forest_join_52;
    }
    if (!((spill24_1 == null))) {
        break forest_join_51;
    }
    if (!(__call24_5((p1)[life8_11]))) {
        break forest_join_53;
    }
    break forest_join_61;
    }
    forestValue24_52_0 = life10_47;
    }
    life9_34 = forestValue24_52_0;
    }
    __call24_6(life7_8, life9_34);
    life8_11 += 1;
    }
    if (!((life6_12 == 0))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    break forest_join_65;
    }
    throw new moom.ca();
    }
    return life7_8;
}
public static net.minecraft.util.IChatComponent h24_0(moom.ca p0) throws Throwable {
    throw __call3002400_0(p0);
}
public static net.minecraft.util.IChatComponent h24_1(moom.ca p0) throws Throwable {
    throw __call3002401_0(p0);
}
public static net.minecraft.util.IChatComponent h24_2(moom.ca p0) throws Throwable {
    throw __call3002402_0(p0);
}
public static net.minecraft.util.IChatComponent h24_3(moom.ca p0) throws Throwable {
    throw __call3002403_0(p0);
}
public static net.minecraft.util.IChatComponent h24_4(moom.ca p0) throws Throwable {
    throw __call3002404_0(p0);
}
private static native long __fieldRead24_0() throws Throwable;
private static native boolean __call24_1() throws Throwable;
private static native int __integerCategory24_2(boolean value) throws Throwable;
private static native net.minecraft.util.IChatComponent __call24_3(moom.CM a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call24_4(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call24_5(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call24_6(moom.CM a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native java.lang.Exception __call3002400_0(moom.ca a0) throws Throwable;
private static native java.lang.Exception __call3002401_0(moom.ca a0) throws Throwable;
private static native java.lang.Exception __call3002402_0(moom.ca a0) throws Throwable;
private static native java.lang.Exception __call3002403_0(moom.ca a0) throws Throwable;
private static native java.lang.Exception __call3002404_0(moom.ca a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_8c774d81fa5d906f83d5(java.lang.Object[] a0) throws E;
private static final class __SourceHandler_8c774d81fa5d906f83d5 {

public static java.lang.String f1467(java.lang.Object[] p0) throws Throwable {
    java.lang.String lexicalValue1467_52_0;
    boolean spill1467_0;
    java.lang.String spill1467_1;
    long life1_3;
    java.lang.StringBuilder life4_8;
    int life5_10;
    int life3_11;
    java.lang.String life6_22;
    lexical_join_52: {
    lexical_join_50: {
    life1_3 = (__fieldRead1467_0() ^ 138660492265871L);
    spill1467_0 = __call1467_1();
    life4_8 = new java.lang.StringBuilder();
    life5_10 = 0;
    life3_11 = __integerCategory1467_2(spill1467_0);
    lexical_cycle_12: while (true) {
    lexical_join_48: {
    lexical_join_43: {
    lexical_join_39: {
    if (!((life5_10 < (p0).length))) {
        break lexical_join_50;
    }
    spill1467_1 = __call1467_3((p0)[life5_10]);
    if (!((life3_11 != 0))) {
        lexicalValue1467_52_0 = spill1467_1;
        break lexical_join_52;
    }
    life6_22 = spill1467_1;
    if (!((life3_11 != 0))) {
        break lexical_join_48;
    }
    if (!((life5_10 > 0))) {
        break lexical_join_43;
    }
    if (!((life5_10 == ((p0).length - 1)))) {
        break lexical_join_39;
    }
    __call1467_4(life4_8, " and ");
    if (!((life3_11 == 0))) {
        break lexical_join_43;
    }
    }
    __call1467_5(life4_8, ", ");
    }
    __call1467_6(life4_8, life6_22);
    life5_10 += 1;
    }
    if (!((life3_11 == 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1467_52_0 = __call1467_7(life4_8);
    }
    return lexicalValue1467_52_0;
}
public static void h1467_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146700_0(p0);
}
public static void h1467_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146701_0(p0);
}
public static void h1467_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146702_0(p0);
}
public static void h1467_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146703_0(p0);
}
private static native long __fieldRead1467_0() throws Throwable;
private static native boolean __call1467_1() throws Throwable;
private static native int __integerCategory1467_2(boolean value) throws Throwable;
private static native java.lang.String __call1467_3(java.lang.Object a0) throws Throwable;
private static native java.lang.StringBuilder __call1467_4(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1467_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1467_6(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1467_7(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Exception __call1146700_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146701_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146702_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146703_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_b91057284ec19108d8a8(java.lang.String[] a0, int a1) throws E;
private static final class __SourceHandler_b91057284ec19108d8a8 {

public static java.lang.String f1468(java.lang.String[] p0, int p1) throws Throwable {
    boolean spill1468_0;
    long life2_3;
    java.lang.StringBuilder life5_7;
    int life6_10;
    int life4_11;
    java.lang.String life7_29;
    lexical_join_34: {
    life2_3 = (__fieldRead1468_0() ^ 5069357873990L);
    life5_7 = new java.lang.StringBuilder();
    spill1468_0 = __call1468_1();
    life6_10 = p1;
    life4_11 = __integerCategory1468_2(spill1468_0);
    lexical_cycle_12: while (true) {
    lexical_join_23: {
    if (!((life6_10 < (p0).length))) {
        break lexical_join_34;
    }
    if (!((life6_10 > p1))) {
        break lexical_join_23;
    }
    __call1468_3(life5_7, " ");
    }
    life7_29 = (p0)[life6_10];
    __call1468_4(life5_7, life7_29);
    life6_10 += 1;
    if (!((life4_11 == 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return __call1468_5(life5_7);
}
public static void h1468_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146800_0(p0);
}
private static native long __fieldRead1468_0() throws Throwable;
private static native boolean __call1468_1() throws Throwable;
private static native int __integerCategory1468_2(boolean value) throws Throwable;
private static native java.lang.StringBuilder __call1468_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1468_4(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1468_5(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Exception __call1146800_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_bc4cb6d2aa51ea55043f(java.lang.String[] a0, int a1, moom.DT a2) throws E;
private static final class __SourceHandler_bc4cb6d2aa51ea55043f {

public static java.util.List f1469(java.lang.String[] p0, int p1, moom.DT p2) throws Throwable {
    int forwardValue1469_30_0;
    int forwardValue1469_30_1;
    int forwardValue1469_45_0;
    int forwardValue1469_45_1;
    int forwardValue1469_50_0;
    int spill1469_0;
    int spill1469_1;
    int spill1469_2;
    long life3_3;
    int life5_5;
    int life6_16;
    java.lang.String life7_28;
    forward_join_52: {
    forward_join_50: {
    forward_join_48: {
    forward_join_45: {
    forward_join_39: {
    forward_join_30: {
    forward_join_26: {
    forward_join_10: {
    life3_3 = (__fieldRead1469_0() ^ 52915231265672L);
    life5_5 = __integerCategory1469_2(__call1469_1());
    if (!((p2 == null))) {
        break forward_join_10;
    }
    return null;
    }
    life6_16 = ((p0).length - 1);
    spill1469_0 = life6_16;
    spill1469_1 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1469_30_0 = spill1469_0;
        forwardValue1469_30_1 = spill1469_1;
        break forward_join_30;
    }
    if (!((spill1469_0 == spill1469_1))) {
        break forward_join_26;
    }
    life7_28 = __call1469_4(__call1469_3(p2));
    if (!((life5_5 != 0))) {
        break forward_join_52;
    }
    }
    forwardValue1469_30_0 = life6_16;
    forwardValue1469_30_1 = (p1 + 1);
    }
    if (!((life5_5 == 0))) {
        forwardValue1469_45_0 = forwardValue1469_30_0;
        forwardValue1469_45_1 = forwardValue1469_30_1;
        break forward_join_45;
    }
    if (!((forwardValue1469_30_0 == forwardValue1469_30_1))) {
        break forward_join_39;
    }
    life7_28 = __call1469_6(__call1469_5(p2));
    if (!((life5_5 != 0))) {
        break forward_join_52;
    }
    }
    spill1469_2 = life6_16;
    if (!((life5_5 == 0))) {
        forwardValue1469_50_0 = spill1469_2;
        break forward_join_50;
    }
    forwardValue1469_45_0 = spill1469_2;
    forwardValue1469_45_1 = (p1 + 2);
    }
    if (!((forwardValue1469_45_0 != forwardValue1469_45_1))) {
        break forward_join_48;
    }
    return null;
    }
    forwardValue1469_50_0 = __call1469_7(p2);
    }
    life7_28 = __call1469_8(forwardValue1469_50_0);
    }
    return __call1469_9(new java.lang.String[] {life7_28});
}
public static void h1469_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146900_0(p0);
}
public static void h1469_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146901_0(p0);
}
public static void h1469_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146902_0(p0);
}
public static void h1469_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146903_0(p0);
}
public static void h1469_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146904_0(p0);
}
public static void h1469_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146905_0(p0);
}
public static void h1469_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1146906_0(p0);
}
private static native long __fieldRead1469_0() throws Throwable;
private static native boolean __call1469_1() throws Throwable;
private static native int __integerCategory1469_2(boolean value) throws Throwable;
private static native int __call1469_3(moom.DT a0) throws Throwable;
private static native java.lang.String __call1469_4(int a0) throws Throwable;
private static native int __call1469_5(moom.DT a0) throws Throwable;
private static native java.lang.String __call1469_6(int a0) throws Throwable;
private static native int __call1469_7(moom.DT a0) throws Throwable;
private static native java.lang.String __call1469_8(int a0) throws Throwable;
private static native java.util.ArrayList __call1469_9(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call1146900_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146901_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146902_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146903_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146904_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146905_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1146906_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_070b891e7e45b8aedf66(java.lang.String[] a0, java.util.Collection a1) throws E;
private static final class __SourceHandler_070b891e7e45b8aedf66 {

public static java.util.List f243(java.lang.String[] p0, java.util.Collection p1) throws Throwable {
    java.lang.Object lexicalValue243_30_0;
    int lexicalValue243_51_0;
    int lexicalValue243_58_0;
    int lexicalValue243_78_0;
    int lexicalValue243_85_0;
    java.util.ArrayList lexicalValue243_89_0;
    boolean spill243_0;
    java.util.Collection spill243_1;
    java.util.stream.Stream spill243_2;
    com.google.common.base.Function spill243_3;
    boolean spill243_4;
    java.util.ArrayList spill243_5;
    int spill243_6;
    long life2_3;
    java.lang.String life5_11;
    int life4_12;
    java.util.ArrayList life6_14;
    java.util.Iterator life7_38;
    java.lang.String life8_45;
    java.util.Iterator life7_79;
    java.lang.Object life8_85;
    lexical_join_89: {
    lexical_join_88: {
    lexical_join_58: {
    lexical_join_54: {
    lexical_join_30: {
    life2_3 = (__fieldRead243_0() ^ 38135077589146L);
    spill243_0 = __call243_1();
    life5_11 = (p0)[((p0).length - 1)];
    life4_12 = __integerCategory243_2(spill243_0);
    life6_14 = __call243_3();
    spill243_1 = p1;
    if (!((life4_12 == 0))) {
        lexicalValue243_30_0 = spill243_1;
        break lexical_join_30;
    }
    if (!((!__call243_4(spill243_1)))) {
        break lexical_join_88;
    }
    spill243_2 = __call243_5(p1);
    com.google.common.base.Function __stackOp243_7_0 = __call243_6();
    spill243_3 = __stackOp243_7_0;
    __call243_8(__stackOp243_7_0);
    lexicalValue243_30_0 = __call243_12(__call243_10(spill243_2, __invokedynamic243_9(spill243_3)), __call243_11());
    }
    life7_38 = __call243_14(__cast243_13(lexicalValue243_30_0));
    lexical_cycle_33: while (true) {
    lexical_join_52: {
    lexical_join_51: {
    if (!(__call243_15(life7_38))) {
        break lexical_join_54;
    }
    life8_45 = __cast243_17(__call243_16(life7_38));
    spill243_4 = __call243_18(life5_11, life8_45);
    if (!((life4_12 == 0))) {
        lexicalValue243_58_0 = __integerCategory243_19(spill243_4);
        break lexical_join_58;
    }
    if (!((life4_12 == 0))) {
        lexicalValue243_51_0 = __integerCategory243_20(spill243_4);
        break lexical_join_51;
    }
    if (!(spill243_4)) {
        break lexical_join_52;
    }
    lexicalValue243_51_0 = __integerCategory243_22(__call243_21(life6_14, life8_45));
    }
    __discardScalar243_23(lexicalValue243_51_0);
    }
    if (!((life4_12 != 0))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    spill243_5 = life6_14;
    if (!((life4_12 == 0))) {
        lexicalValue243_89_0 = spill243_5;
        break lexical_join_89;
    }
    lexicalValue243_58_0 = __integerCategory243_25(__call243_24(spill243_5));
    }
    if (!((lexicalValue243_58_0 != 0))) {
        break lexical_join_88;
    }
    life7_79 = __call243_26(p1);
    lexical_cycle_62: while (true) {
    lexical_join_86: {
    lexical_join_85: {
    lexical_join_78: {
    if (!(__call243_27(life7_79))) {
        break lexical_join_88;
    }
    life8_85 = __call243_28(life7_79);
    spill243_6 = __instanceOf243_29(life8_85);
    if (!((life4_12 == 0))) {
        lexicalValue243_78_0 = spill243_6;
        break lexical_join_78;
    }
    if (!((spill243_6 != 0))) {
        break lexical_join_86;
    }
    lexicalValue243_78_0 = __integerCategory243_33(__call243_32(life5_11, __call243_31(__cast243_30(life8_85))));
    }
    if (!((life4_12 == 0))) {
        lexicalValue243_85_0 = lexicalValue243_78_0;
        break lexical_join_85;
    }
    if (!((lexicalValue243_78_0 != 0))) {
        break lexical_join_86;
    }
    lexicalValue243_85_0 = __integerCategory243_36(__call243_35(life6_14, __call243_34(life8_85)));
    }
    __discardScalar243_37(lexicalValue243_85_0);
    }
    if (!((life4_12 != 0))) { continue lexical_cycle_62; }
    break lexical_cycle_62;
    }
    }
    lexicalValue243_89_0 = life6_14;
    }
    return lexicalValue243_89_0;
}
public static void h243_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1024300_0(p0);
}
public static void h243_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1024301_0(p0);
}
public static void h243_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1024302_0(p0);
}
public static void h243_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1024303_0(p0);
}
public static void h243_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1024304_0(p0);
}
public static void h243_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1024305_0(p0);
}
public static void h243_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1024306_0(p0);
}
public static void h243_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1024307_0(p0);
}
public static void h243_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1024308_0(p0);
}
public static void h243_9(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1024309_0(p0);
}
private static native long __fieldRead243_0() throws Throwable;
private static native boolean __call243_1() throws Throwable;
private static native int __integerCategory243_2(boolean value) throws Throwable;
private static native java.util.ArrayList __call243_3() throws Throwable;
private static native boolean __call243_4(java.util.Collection a0) throws Throwable;
private static native java.util.stream.Stream __call243_5(java.util.Collection a0) throws Throwable;
private static native com.google.common.base.Function __call243_6() throws Throwable;
private static native java.lang.Object __call243_8(com.google.common.base.Function a0) throws Throwable;
private static native java.util.function.Function __invokedynamic243_9(com.google.common.base.Function a0) throws Throwable;
private static native java.util.stream.Stream __call243_10(java.util.stream.Stream a0, java.util.function.Function a1) throws Throwable;
private static native java.util.stream.Collector __call243_11() throws Throwable;
private static native java.lang.Object __call243_12(java.util.stream.Stream a0, java.util.stream.Collector a1) throws Throwable;
private static native java.util.List __cast243_13(java.lang.Object a0) throws Throwable;
private static native java.util.Iterator __call243_14(java.util.List a0) throws Throwable;
private static native boolean __call243_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call243_16(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast243_17(java.lang.Object a0) throws Throwable;
private static native boolean __call243_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory243_19(boolean value) throws Throwable;
private static native int __integerCategory243_20(boolean value) throws Throwable;
private static native boolean __call243_21(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory243_22(boolean value) throws Throwable;
private static native void __discardScalar243_23(int a0) throws Throwable;
private static native boolean __call243_24(java.util.ArrayList a0) throws Throwable;
private static native int __integerCategory243_25(boolean value) throws Throwable;
private static native java.util.Iterator __call243_26(java.util.Collection a0) throws Throwable;
private static native boolean __call243_27(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call243_28(java.util.Iterator a0) throws Throwable;
private static native int __instanceOf243_29(java.lang.Object a0) throws Throwable;
private static native moom.DD __cast243_30(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call243_31(moom.DD a0) throws Throwable;
private static native boolean __call243_32(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory243_33(boolean value) throws Throwable;
private static native java.lang.String __call243_34(java.lang.Object a0) throws Throwable;
private static native boolean __call243_35(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory243_36(boolean value) throws Throwable;
private static native void __discardScalar243_37(int a0) throws Throwable;
private static native java.lang.Exception __call1024300_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1024301_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1024302_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1024303_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1024304_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1024305_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1024306_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1024307_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1024308_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1024309_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_bef3ace5e2fb9df2396b(java.lang.String a0) throws E;
private static final class __SourceHandler_bef3ace5e2fb9df2396b {

public static boolean f1471(java.lang.String p0) throws Throwable {
    int forwardValue1471_42_0;
    int forwardValue1471_44_0;
    boolean spill1471_0;
    boolean spill1471_1;
    boolean spill1471_2;
    boolean spill1471_3;
    long life1_3;
    int life3_5;
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    life1_3 = (__fieldRead1471_0() ^ 1518207418351L);
    life3_5 = __integerCategory1471_2(__call1471_1());
    spill1471_0 = __call1471_3(p0, "true");
    if (!((life3_5 == 0))) {
        forwardValue1471_44_0 = __integerCategory1471_4(spill1471_0);
        break forward_join_44;
    }
    if (!((!spill1471_0))) {
        break forward_join_43;
    }
    spill1471_1 = __call1471_5(p0, "1");
    if (!((life3_5 == 0))) {
        forwardValue1471_44_0 = __integerCategory1471_6(spill1471_1);
        break forward_join_44;
    }
    if (!((!spill1471_1))) {
        break forward_join_43;
    }
    spill1471_2 = __call1471_7(p0, "false");
    if (!((life3_5 == 0))) {
        forwardValue1471_42_0 = __integerCategory1471_8(spill1471_2);
        break forward_join_42;
    }
    if (!((!spill1471_2))) {
        break forward_join_41;
    }
    spill1471_3 = __call1471_9(p0, "0");
    if (!((life3_5 == 0))) {
        forwardValue1471_42_0 = __integerCategory1471_10(spill1471_3);
        break forward_join_42;
    }
    if (!((!spill1471_3))) {
        break forward_join_41;
    }
    throw new moom.b7("commands.generic.boolean.invalid", new java.lang.Object[] {p0});
    }
    forwardValue1471_42_0 = 0;
    }
    return __integerCategory1471_11(forwardValue1471_42_0);
    }
    forwardValue1471_44_0 = 1;
    }
    return __integerCategory1471_12(forwardValue1471_44_0);
}
public static void h1471_0(moom.b7 p0) throws Throwable {
    throw __call1147100_0(p0);
}
public static void h1471_1(moom.b7 p0) throws Throwable {
    throw __call1147101_0(p0);
}
public static void h1471_2(moom.b7 p0) throws Throwable {
    throw __call1147102_0(p0);
}
public static void h1471_3(moom.b7 p0) throws Throwable {
    throw __call1147103_0(p0);
}
public static void h1471_4(moom.b7 p0) throws Throwable {
    throw __call1147104_0(p0);
}
public static void h1471_5(moom.b7 p0) throws Throwable {
    throw __call1147105_0(p0);
}
public static void h1471_6(moom.b7 p0) throws Throwable {
    throw __call1147106_0(p0);
}
public static void h1471_7(moom.b7 p0) throws Throwable {
    throw __call1147107_0(p0);
}
private static native long __fieldRead1471_0() throws Throwable;
private static native boolean __call1471_1() throws Throwable;
private static native int __integerCategory1471_2(boolean value) throws Throwable;
private static native boolean __call1471_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1471_4(boolean value) throws Throwable;
private static native boolean __call1471_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1471_6(boolean value) throws Throwable;
private static native boolean __call1471_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1471_8(boolean value) throws Throwable;
private static native boolean __call1471_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1471_10(boolean value) throws Throwable;
private static native boolean __integerCategory1471_11(int value) throws Throwable;
private static native boolean __integerCategory1471_12(int value) throws Throwable;
private static native java.lang.Exception __call1147100_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147101_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147102_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147103_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147104_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147105_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147106_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1147107_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_bc253a8f562658b4fd50(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws E;
private static final class __SourceHandler_bc253a8f562658b4fd50 {

public static java.util.List f244(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws Throwable {
    int forwardValue244_17_0;
    java.util.List forwardValue244_25_0;
    boolean spill244_0;
    net.minecraft.entity.Entity[] spill244_1;
    long life2_3;
    int life4_5;
    forward_join_25: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (__fieldRead244_0() ^ 12775909554071L);
    life4_5 = __integerCategory244_2(__call244_1());
    spill244_0 = __call244_3(p1);
    if (!((life4_5 == 0))) {
        forwardValue244_17_0 = __integerCategory244_4(spill244_0);
        break forward_join_17;
    }
    if (!(spill244_0)) {
        break forward_join_16;
    }
    forwardValue244_25_0 = __call244_6(p0, p1, __classLiteral244_5());
    break forward_join_25;
    }
    forwardValue244_17_0 = 1;
    }
    net.minecraft.entity.Entity[] __stackOp244_7_0 = new net.minecraft.entity.Entity[forwardValue244_17_0];
    spill244_1 = __stackOp244_7_0;
    (__stackOp244_7_0)[0] = __call244_8(p0, p1);
    forwardValue244_25_0 = __call244_9(spill244_1);
    }
    return forwardValue244_25_0;
}
public static void h244_0(moom.b9 p0) throws Throwable {
    throw __call1024400_0(p0);
}
public static void h244_1(moom.b9 p0) throws Throwable {
    throw __call1024401_0(p0);
}
private static native long __fieldRead244_0() throws Throwable;
private static native boolean __call244_1() throws Throwable;
private static native int __integerCategory244_2(boolean value) throws Throwable;
private static native boolean __call244_3(java.lang.String a0) throws Throwable;
private static native int __integerCategory244_4(boolean value) throws Throwable;
private static native java.lang.Object __classLiteral244_5() throws Throwable;
private static native java.util.List __call244_6(net.minecraft.command.ICommandSender a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native net.minecraft.entity.Entity __call244_8(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.util.ArrayList __call244_9(net.minecraft.entity.Entity[] a0) throws Throwable;
private static native java.lang.Exception __call1024400_0(moom.b9 a0) throws Throwable;
private static native java.lang.Exception __call1024401_0(moom.b9 a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.block.Block __sourceHandlerCall_cf155d92d6a4bcd61ff7(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws E;
private static final class __SourceHandler_cf155d92d6a4bcd61ff7 {

public static net.minecraft.block.Block f1473(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws Throwable {
    moom.DC forwardValue1473_30_0;
    moom.DD forwardValue1473_30_1;
    net.minecraft.block.Block forwardValue1473_49_0;
    boolean spill1473_0;
    moom.DC spill1473_1;
    moom.DD spill1473_2;
    net.minecraft.block.Block spill1473_3;
    long life2_3;
    moom.DD life5_9;
    int life4_10;
    net.minecraft.block.Block life6_37;
    forward_join_49: {
    forward_join_48: {
    forward_join_30: {
    forward_join_28: {
    life2_3 = (__fieldRead1473_0() ^ 60598738711605L);
    spill1473_0 = __call1473_1();
    life5_9 = new moom.DD(p1);
    life4_10 = __integerCategory1473_2(spill1473_0);
    spill1473_1 = __fieldRead1473_3();
    spill1473_2 = life5_9;
    if (!((life4_10 != 0))) {
        forwardValue1473_30_0 = spill1473_1;
        forwardValue1473_30_1 = spill1473_2;
        break forward_join_30;
    }
    if (!((!__call1473_4(spill1473_1, spill1473_2)))) {
        break forward_join_28;
    }
    throw new moom.b_("commands.give.block.notFound", new java.lang.Object[] {life5_9});
    }
    forwardValue1473_30_0 = __fieldRead1473_5();
    forwardValue1473_30_1 = life5_9;
    }
    life6_37 = __cast1473_7(__call1473_6(forwardValue1473_30_0, forwardValue1473_30_1));
    spill1473_3 = life6_37;
    if (!((life4_10 != 0))) {
        forwardValue1473_49_0 = spill1473_3;
        break forward_join_49;
    }
    if (!((spill1473_3 == null))) {
        break forward_join_48;
    }
    throw new moom.b_("commands.give.block.notFound", new java.lang.Object[] {life5_9});
    }
    forwardValue1473_49_0 = life6_37;
    }
    return forwardValue1473_49_0;
}
public static void h1473_0(moom.b_ p0) throws Throwable {
    throw __call1147300_0(p0);
}
public static void h1473_1(moom.b_ p0) throws Throwable {
    throw __call1147301_0(p0);
}
public static void h1473_2(moom.b_ p0) throws Throwable {
    throw __call1147302_0(p0);
}
public static void h1473_3(moom.b_ p0) throws Throwable {
    throw __call1147303_0(p0);
}
private static native long __fieldRead1473_0() throws Throwable;
private static native boolean __call1473_1() throws Throwable;
private static native int __integerCategory1473_2(boolean value) throws Throwable;
private static native moom.DC __fieldRead1473_3() throws Throwable;
private static native boolean __call1473_4(moom.DC a0, moom.DD a1) throws Throwable;
private static native moom.DC __fieldRead1473_5() throws Throwable;
private static native java.lang.Object __call1473_6(moom.DC a0, moom.DD a1) throws Throwable;
private static native net.minecraft.block.Block __cast1473_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1147300_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1147301_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1147302_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1147303_0(moom.b_ a0) throws Throwable;

}

private static native <E extends Throwable> moom.qH __sourceHandlerCall_c81d684790d9f260c4e3(double a0, java.lang.String a1, int a2, int a3, boolean a4) throws E;
private static final class __SourceHandler_c81d684790d9f260c4e3 {

public static moom.qH f300131(double p0, java.lang.String p1, int p2, int p3, boolean p4) throws Throwable {
    int forestValue300131_18_0;
    double forestValue300131_32_0;
    int forestValue300131_46_0;
    int forestValue300131_61_0;
    int forestValue300131_77_0;
    int forestValue300131_88_0;
    int forestValue300131_112_0;
    moom.qH forestValue300131_137_0;
    moom.qH forestValue300131_137_1;
    double forestValue300131_137_2;
    moom.qH forestValue300131_138_0;
    moom.qH forestValue300131_138_1;
    double forestValue300131_138_2;
    double forestValue300131_138_3;
    boolean spill300131_0;
    int spill300131_1;
    double spill300131_2;
    moom.b_ spill300131_3;
    moom.b_ spill300131_4;
    java.lang.String spill300131_5;
    java.lang.Object[] spill300131_6;
    int spill300131_7;
    int spill300131_8;
    int spill300131_9;
    int spill300131_10;
    boolean spill300131_11;
    int spill300131_12;
    moom.b_ spill300131_13;
    moom.b_ spill300131_14;
    java.lang.String spill300131_15;
    java.lang.Object[] spill300131_16;
    java.lang.Object[] spill300131_17;
    moom.b_ spill300131_18;
    moom.b_ spill300131_19;
    java.lang.String spill300131_20;
    java.lang.Object[] spill300131_21;
    java.lang.Object[] spill300131_22;
    moom.qH spill300131_23;
    moom.qH spill300131_24;
    double spill300131_25;
    long life6_3;
    int life9_8;
    int life8_9;
    double life10_35;
    int life12_53;
    forest_join_138: {
    forest_join_137: {
    forest_join_130: {
    forest_join_112: {
    forest_join_108: {
    forest_join_88: {
    forest_join_84: {
    forest_join_77: {
    forest_join_76: {
    forest_join_61: {
    forest_join_55: {
    forest_join_46: {
    forest_join_43: {
    forest_join_32: {
    forest_join_31: {
    forest_join_18: {
    life6_3 = (__fieldRead300131_0() ^ 42581762977148L);
    spill300131_0 = __call300131_1();
    life9_8 = __integerCategory300131_3(__call300131_2(p1, "~"));
    life8_9 = __integerCategory300131_4(spill300131_0);
    spill300131_1 = life9_8;
    if (!((life8_9 != 0))) {
        forestValue300131_18_0 = spill300131_1;
        break forest_join_18;
    }
    if (!((spill300131_1 != 0))) {
        break forest_join_31;
    }
    spill300131_2 = p0;
    if (!((life8_9 != 0))) {
        forestValue300131_32_0 = spill300131_2;
        break forest_join_32;
    }
    forestValue300131_18_0 = __integerCategory300131_6(__call300131_5(spill300131_2));
    }
    if (!((forestValue300131_18_0 != 0))) {
        break forest_join_31;
    }
    moom.b_ __stackOp300131_8_0 = __sourceUninitializedNEW300131_7();
    spill300131_3 = __stackOp300131_8_0;
    spill300131_4 = __stackOp300131_8_0;
    spill300131_5 = "commands.generic.num.invalid";
    java.lang.Object[] __stackOp300131_9_0 = new java.lang.Object[1];
    spill300131_6 = __stackOp300131_9_0;
    (__stackOp300131_9_0)[0] = __call300131_10(p0);
    __explicitNewInit300131_11(spill300131_4, spill300131_5, spill300131_6);
    throw spill300131_3;
    }
    forestValue300131_32_0 = 0x0.0p0d;
    }
    life10_35 = forestValue300131_32_0;
    spill300131_7 = life9_8;
    if (!((life8_9 != 0))) {
        forestValue300131_46_0 = spill300131_7;
        break forest_join_46;
    }
    if (!((spill300131_7 != 0))) {
        break forest_join_43;
    }
    spill300131_8 = __call300131_12(p1);
    if (!((life8_9 != 0))) {
        forestValue300131_77_0 = spill300131_8;
        break forest_join_77;
    }
    if (!((spill300131_8 > 1))) {
        break forest_join_76;
    }
    }
    forestValue300131_46_0 = __integerCategory300131_14(__call300131_13(p1, "."));
    }
    life12_53 = forestValue300131_46_0;
    spill300131_9 = life9_8;
    if (!((life8_9 != 0))) {
        forestValue300131_61_0 = spill300131_9;
        break forest_join_61;
    }
    if (!((spill300131_9 != 0))) {
        break forest_join_55;
    }
    p1 = __call300131_15(p1, 1);
    }
    life10_35 = (life10_35 + __call300131_16(p1));
    forestValue300131_61_0 = life12_53;
    }
    if (!((life8_9 != 0))) {
        forestValue300131_77_0 = forestValue300131_61_0;
        break forest_join_77;
    }
    if (!((forestValue300131_61_0 == 0))) {
        break forest_join_76;
    }
    spill300131_10 = life9_8;
    if (!((life8_9 != 0))) {
        forestValue300131_77_0 = spill300131_10;
        break forest_join_77;
    }
    if (!((spill300131_10 == 0))) {
        break forest_join_76;
    }
    spill300131_11 = p4;
    if (!((life8_9 != 0))) {
        forestValue300131_77_0 = __integerCategory300131_17(spill300131_11);
        break forest_join_77;
    }
    if (!(spill300131_11)) {
        break forest_join_76;
    }
    life10_35 = (life10_35 + 0x1.0p-1d);
    }
    forestValue300131_77_0 = p2;
    }
    if (!((life8_9 != 0))) {
        forestValue300131_88_0 = forestValue300131_77_0;
        break forest_join_88;
    }
    if (!((forestValue300131_77_0 == 0))) {
        break forest_join_84;
    }
    spill300131_12 = p3;
    if (!((life8_9 != 0))) {
        forestValue300131_88_0 = spill300131_12;
        break forest_join_88;
    }
    if (!((spill300131_12 != 0))) {
        break forest_join_130;
    }
    }
    forestValue300131_88_0 = __numericCompare300131_18(life10_35, ((double) p2));
    }
    if (!((life8_9 != 0))) {
        forestValue300131_112_0 = forestValue300131_88_0;
        break forest_join_112;
    }
    if (!((forestValue300131_88_0 < 0))) {
        break forest_join_108;
    }
    moom.b_ __stackOp300131_20_0 = __sourceUninitializedNEW300131_19();
    spill300131_13 = __stackOp300131_20_0;
    spill300131_14 = __stackOp300131_20_0;
    spill300131_15 = "commands.generic.double.tooSmall";
    java.lang.Object[] __stackOp300131_21_0 = new java.lang.Object[2];
    spill300131_16 = __stackOp300131_21_0;
    (__stackOp300131_21_0)[0] = __call300131_22(life10_35);
    java.lang.Object[] __stackOp300131_23_0 = spill300131_16;
    spill300131_17 = __stackOp300131_23_0;
    (__stackOp300131_23_0)[1] = __call300131_24(p2);
    __explicitNewInit300131_25(spill300131_14, spill300131_15, spill300131_17);
    throw spill300131_13;
    }
    forestValue300131_112_0 = __numericCompare300131_26(life10_35, ((double) p3));
    }
    if (!((forestValue300131_112_0 > 0))) {
        break forest_join_130;
    }
    moom.b_ __stackOp300131_28_0 = __sourceUninitializedNEW300131_27();
    spill300131_18 = __stackOp300131_28_0;
    spill300131_19 = __stackOp300131_28_0;
    spill300131_20 = "commands.generic.double.tooBig";
    java.lang.Object[] __stackOp300131_29_0 = new java.lang.Object[2];
    spill300131_21 = __stackOp300131_29_0;
    (__stackOp300131_29_0)[0] = __call300131_30(life10_35);
    java.lang.Object[] __stackOp300131_31_0 = spill300131_21;
    spill300131_22 = __stackOp300131_31_0;
    (__stackOp300131_31_0)[1] = __call300131_32(p3);
    __explicitNewInit300131_33(spill300131_19, spill300131_20, spill300131_22);
    throw spill300131_18;
    }
    moom.qH __stackOp300131_35_0 = __sourceUninitializedNEW300131_34();
    spill300131_23 = __stackOp300131_35_0;
    spill300131_24 = __stackOp300131_35_0;
    spill300131_25 = life10_35;
    if (!((life9_8 != 0))) {
        forestValue300131_137_0 = spill300131_23;
        forestValue300131_137_1 = spill300131_24;
        forestValue300131_137_2 = spill300131_25;
        break forest_join_137;
    }
    forestValue300131_138_0 = spill300131_23;
    forestValue300131_138_1 = spill300131_24;
    forestValue300131_138_2 = spill300131_25;
    forestValue300131_138_3 = p0;
    break forest_join_138;
    }
    forestValue300131_138_0 = forestValue300131_137_0;
    forestValue300131_138_1 = forestValue300131_137_1;
    forestValue300131_138_2 = forestValue300131_137_2;
    forestValue300131_138_3 = 0x0.0p0d;
    }
    __explicitNewInit300131_36(forestValue300131_138_1, (forestValue300131_138_2 + forestValue300131_138_3), life10_35, __integerCategory300131_37(life9_8));
    return forestValue300131_138_0;
}
public static moom.qH h300131_0(moom.b_ p0) throws Throwable {
    throw __call33013100_0(p0);
}
public static moom.qH h300131_1(moom.b_ p0) throws Throwable {
    throw __call33013101_0(p0);
}
public static moom.qH h300131_2(moom.b_ p0) throws Throwable {
    throw __call33013102_0(p0);
}
public static moom.qH h300131_3(moom.b_ p0) throws Throwable {
    throw __call33013103_0(p0);
}
public static moom.qH h300131_4(moom.b_ p0) throws Throwable {
    throw __call33013104_0(p0);
}
public static moom.qH h300131_5(moom.b_ p0) throws Throwable {
    throw __call33013105_0(p0);
}
public static moom.qH h300131_6(moom.b_ p0) throws Throwable {
    throw __call33013106_0(p0);
}
public static moom.qH h300131_7(moom.b_ p0) throws Throwable {
    throw __call33013107_0(p0);
}
public static moom.qH h300131_8(moom.b_ p0) throws Throwable {
    throw __call33013108_0(p0);
}
public static moom.qH h300131_9(moom.b_ p0) throws Throwable {
    throw __call33013109_0(p0);
}
public static moom.qH h300131_10(moom.b_ p0) throws Throwable {
    throw __call33013110_0(p0);
}
public static moom.qH h300131_11(moom.b_ p0) throws Throwable {
    throw __call33013111_0(p0);
}
public static moom.qH h300131_12(moom.b_ p0) throws Throwable {
    throw __call33013112_0(p0);
}
public static moom.qH h300131_13(moom.b_ p0) throws Throwable {
    throw __call33013113_0(p0);
}
public static moom.qH h300131_14(moom.b_ p0) throws Throwable {
    throw __call33013114_0(p0);
}
public static moom.qH h300131_15(moom.b_ p0) throws Throwable {
    throw __call33013115_0(p0);
}
public static moom.qH h300131_16(moom.b_ p0) throws Throwable {
    throw __call33013116_0(p0);
}
public static moom.qH h300131_17(moom.b_ p0) throws Throwable {
    throw __call33013117_0(p0);
}
public static moom.qH h300131_18(moom.b_ p0) throws Throwable {
    throw __call33013118_0(p0);
}
public static moom.qH h300131_19(moom.b_ p0) throws Throwable {
    throw __call33013119_0(p0);
}
public static moom.qH h300131_20(moom.b_ p0) throws Throwable {
    throw __call33013120_0(p0);
}
public static moom.qH h300131_21(moom.b_ p0) throws Throwable {
    throw __call33013121_0(p0);
}
private static native long __fieldRead300131_0() throws Throwable;
private static native boolean __call300131_1() throws Throwable;
private static native boolean __call300131_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory300131_3(boolean value) throws Throwable;
private static native int __integerCategory300131_4(boolean value) throws Throwable;
private static native boolean __call300131_5(double a0) throws Throwable;
private static native int __integerCategory300131_6(boolean value) throws Throwable;
private static native moom.b_ __sourceUninitializedNEW300131_7() throws Throwable;
private static native java.lang.Double __call300131_10(double a0) throws Throwable;
private static native void __explicitNewInit300131_11(moom.b_ a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __call300131_12(java.lang.String a0) throws Throwable;
private static native boolean __call300131_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory300131_14(boolean value) throws Throwable;
private static native java.lang.String __call300131_15(java.lang.String a0, int a1) throws Throwable;
private static native double __call300131_16(java.lang.String a0) throws Throwable;
private static native int __integerCategory300131_17(boolean value) throws Throwable;
private static native int __numericCompare300131_18(double a0, double a1) throws Throwable;
private static native moom.b_ __sourceUninitializedNEW300131_19() throws Throwable;
private static native java.lang.Double __call300131_22(double a0) throws Throwable;
private static native java.lang.Integer __call300131_24(int a0) throws Throwable;
private static native void __explicitNewInit300131_25(moom.b_ a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __numericCompare300131_26(double a0, double a1) throws Throwable;
private static native moom.b_ __sourceUninitializedNEW300131_27() throws Throwable;
private static native java.lang.Double __call300131_30(double a0) throws Throwable;
private static native java.lang.Integer __call300131_32(int a0) throws Throwable;
private static native void __explicitNewInit300131_33(moom.b_ a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native moom.qH __sourceUninitializedNEW300131_34() throws Throwable;
private static native boolean __integerCategory300131_37(int value) throws Throwable;
private static native void __explicitNewInit300131_36(moom.qH a0, double a1, double a2, boolean a3) throws Throwable;
private static native java.lang.Exception __call33013100_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013101_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013102_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013103_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013104_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013105_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013106_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013107_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013108_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013109_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013110_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013111_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013112_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013113_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013114_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013115_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013116_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013117_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013118_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013119_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013120_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call33013121_0(moom.b_ a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.player.EntityPlayerMP __sourceHandlerCall_06c31bbf8655ecbeebc0(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws E;
private static final class __SourceHandler_06c31bbf8655ecbeebc0 {

public static net.minecraft.entity.player.EntityPlayerMP f642(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws Throwable {
    boolean spill642_0;
    net.minecraft.entity.player.EntityPlayerMP spill642_1;
    net.minecraft.entity.player.EntityPlayerMP joinValue642_1_0;
    net.minecraft.entity.player.EntityPlayerMP joinValue642_3_0;
    net.minecraft.entity.player.EntityPlayerMP joinValue642_4_0;
    long life2_3;
    net.minecraft.entity.player.EntityPlayerMP life5_8;
    int life4_9;
    life2_3 = (__fieldRead642_0() ^ 33576533212823L);
    spill642_0 = __call642_1();
    life5_8 = __call642_2(p0, p1);
    life4_9 = __integerCategory642_3(spill642_0);
    spill642_1 = life5_8;
    if ((life4_9 == 0)) {
        if ((spill642_1 == null)) {
        life5_8 = __call642_7(__call642_5(__call642_4()), __call642_6(p1));
    } else {
        
    }
        joinValue642_1_0 = life5_8;
    } else {
        joinValue642_1_0 = spill642_1;
    }
    if ((life4_9 == 0)) {
        if ((joinValue642_1_0 == null)) {
        life5_8 = __call642_10(__call642_9(__call642_8()), p1);
    } else {
        
    }
        joinValue642_3_0 = life5_8;
    } else {
        joinValue642_3_0 = joinValue642_1_0;
    }
    if ((life4_9 == 0)) {
        if ((joinValue642_3_0 == null)) {
        throw new moom.ca();
    }
        joinValue642_4_0 = life5_8;
    } else {
        joinValue642_4_0 = joinValue642_3_0;
    }
    return joinValue642_4_0;
}
public static net.minecraft.entity.player.EntityPlayerMP h642_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3064200_0(p0);
}
public static net.minecraft.entity.player.EntityPlayerMP h642_1(java.lang.IllegalArgumentException p0, java.lang.String p1, int p2, net.minecraft.entity.player.EntityPlayerMP p3) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP spill3064201_0;
    net.minecraft.entity.player.EntityPlayerMP joinValue3064201_1_0;
    net.minecraft.entity.player.EntityPlayerMP joinValue3064201_2_0;
    java.lang.IllegalArgumentException life4_2;
    life4_2 = p0;
    spill3064201_0 = p3;
    if ((p2 == 0)) {
        if ((spill3064201_0 == null)) {
        p3 = __call3064201_2(__call3064201_1(__call3064201_0()), p1);
    } else {
        
    }
        joinValue3064201_1_0 = p3;
    } else {
        joinValue3064201_1_0 = spill3064201_0;
    }
    if ((p2 == 0)) {
        if ((joinValue3064201_1_0 == null)) {
        throw new moom.ca();
    }
        joinValue3064201_2_0 = p3;
    } else {
        joinValue3064201_2_0 = joinValue3064201_1_0;
    }
    return joinValue3064201_2_0;
}
public static net.minecraft.entity.player.EntityPlayerMP h642_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3064202_0(p0);
}
public static net.minecraft.entity.player.EntityPlayerMP h642_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3064203_0(p0);
}
public static net.minecraft.entity.player.EntityPlayerMP h642_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3064204_0(p0);
}
private static native long __fieldRead642_0() throws Throwable;
private static native boolean __call642_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call642_2(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory642_3(boolean value) throws Throwable;
private static native moom.Bl __call642_4() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call642_5(moom.Bl a0) throws Throwable;
private static native java.util.UUID __call642_6(java.lang.String a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call642_7(net.minecraft.server.management.ServerConfigurationManager a0, java.util.UUID a1) throws Throwable;
private static native moom.Bl __call642_8() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call642_9(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call642_10(net.minecraft.server.management.ServerConfigurationManager a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3064200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native moom.Bl __call3064201_0() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call3064201_1(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call3064201_2(net.minecraft.server.management.ServerConfigurationManager a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3064202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3064203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3064204_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.item.Item __sourceHandlerCall_4c1b87d19d53f74288fa(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws E;
private static final class __SourceHandler_4c1b87d19d53f74288fa {

public static net.minecraft.item.Item f1475(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws Throwable {
    net.minecraft.item.Item forwardValue1475_32_0;
    boolean spill1475_0;
    net.minecraft.item.Item spill1475_1;
    long life2_3;
    moom.DD life5_9;
    int life4_10;
    net.minecraft.item.Item life6_15;
    forward_join_32: {
    forward_join_31: {
    life2_3 = (__fieldRead1475_0() ^ 84596862355651L);
    spill1475_0 = __call1475_1();
    life5_9 = new moom.DD(p1);
    life4_10 = __integerCategory1475_2(spill1475_0);
    life6_15 = __cast1475_5(__call1475_4(__fieldRead1475_3(), life5_9));
    spill1475_1 = life6_15;
    if (!((life4_10 != 0))) {
        forwardValue1475_32_0 = spill1475_1;
        break forward_join_32;
    }
    if (!((spill1475_1 == null))) {
        break forward_join_31;
    }
    throw new moom.b_("commands.give.item.notFound", new java.lang.Object[] {life5_9});
    }
    forwardValue1475_32_0 = life6_15;
    }
    return forwardValue1475_32_0;
}
public static void h1475_0(moom.b_ p0) throws Throwable {
    throw __call1147500_0(p0);
}
public static void h1475_1(moom.b_ p0) throws Throwable {
    throw __call1147501_0(p0);
}
private static native long __fieldRead1475_0() throws Throwable;
private static native boolean __call1475_1() throws Throwable;
private static native int __integerCategory1475_2(boolean value) throws Throwable;
private static native moom.DB __fieldRead1475_3() throws Throwable;
private static native java.lang.Object __call1475_4(moom.DB a0, moom.DD a1) throws Throwable;
private static native net.minecraft.item.Item __cast1475_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1147500_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call1147501_0(moom.b_ a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_072db0efb9bda9330b2a(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws E;
private static final class __SourceHandler_072db0efb9bda9330b2a {

public static java.lang.String f1097(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws Throwable {
    long life2_3;
    int life4_5;
    life2_3 = (__fieldRead1097_0() ^ 108336026376806L);
    life4_5 = __integerCategory1097_2(__call1097_1());
    return __call1097_4(__call1097_3(p0, p1));
}
public static java.lang.String h1097_0(moom.ca p0, net.minecraft.command.ICommandSender p1, java.lang.String p2) throws Throwable {
    moom.ca life3_2;
    life3_2 = p0;
    return __call3109700_2(__call3109700_1(__call3109700_0(p1, p2)));
}
public static java.lang.String h1097_1(moom.b9 p0, java.lang.String p1, int p2) throws Throwable {
    java.lang.String forestValue3109701_10_0;
    java.lang.String spill3109701_0;
    moom.b9 life3_2;
    forest_join_10: {
    forest_join_9: {
    life3_2 = p0;
    spill3109701_0 = p1;
    if (!((p2 != 0))) {
        forestValue3109701_10_0 = spill3109701_0;
        break forest_join_10;
    }
    if (!(__call3109701_0(spill3109701_0))) {
        break forest_join_9;
    }
    throw life3_2;
    }
    forestValue3109701_10_0 = p1;
    }
    return forestValue3109701_10_0;
}
public static java.lang.String h1097_2(moom.ca p0) throws Throwable {
    throw __call3109702_0(p0);
}
public static java.lang.String h1097_3(moom.ca p0) throws Throwable {
    throw __call3109703_0(p0);
}
private static native long __fieldRead1097_0() throws Throwable;
private static native boolean __call1097_1() throws Throwable;
private static native int __integerCategory1097_2(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call1097_3(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1097_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.Entity __call3109700_0(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.util.UUID __call3109700_1(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call3109700_2(java.util.UUID a0) throws Throwable;
private static native boolean __call3109701_0(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call3109702_0(moom.ca a0) throws Throwable;
private static native java.lang.Exception __call3109703_0(moom.ca a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_f7eecb9071cb54ebb28a(java.lang.String[] a0, int a1, moom.DT a2) throws E;
private static final class __SourceHandler_f7eecb9071cb54ebb28a {

public static java.util.List f1476(java.lang.String[] p0, int p1, moom.DT p2) throws Throwable {
    int forwardValue1476_32_0;
    int forwardValue1476_32_1;
    int forwardValue1476_37_0;
    int spill1476_0;
    int spill1476_1;
    int spill1476_2;
    long life3_3;
    int life5_5;
    int life6_16;
    java.lang.String life7_28;
    forward_join_39: {
    forward_join_37: {
    forward_join_35: {
    forward_join_32: {
    forward_join_26: {
    forward_join_10: {
    life3_3 = (__fieldRead1476_0() ^ 86535867420472L);
    life5_5 = __integerCategory1476_2(__call1476_1());
    if (!((p2 == null))) {
        break forward_join_10;
    }
    return null;
    }
    life6_16 = ((p0).length - 1);
    spill1476_0 = life6_16;
    spill1476_1 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1476_32_0 = spill1476_0;
        forwardValue1476_32_1 = spill1476_1;
        break forward_join_32;
    }
    if (!((spill1476_0 == spill1476_1))) {
        break forward_join_26;
    }
    life7_28 = __call1476_4(__call1476_3(p2));
    if (!((life5_5 != 0))) {
        break forward_join_39;
    }
    }
    spill1476_2 = life6_16;
    if (!((life5_5 == 0))) {
        forwardValue1476_37_0 = spill1476_2;
        break forward_join_37;
    }
    forwardValue1476_32_0 = spill1476_2;
    forwardValue1476_32_1 = (p1 + 1);
    }
    if (!((forwardValue1476_32_0 != forwardValue1476_32_1))) {
        break forward_join_35;
    }
    return null;
    }
    forwardValue1476_37_0 = __call1476_5(p2);
    }
    life7_28 = __call1476_6(forwardValue1476_37_0);
    }
    return __call1476_7(new java.lang.String[] {life7_28});
}
public static void h1476_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1147600_0(p0);
}
public static void h1476_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1147601_0(p0);
}
public static void h1476_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1147602_0(p0);
}
public static void h1476_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1147603_0(p0);
}
public static void h1476_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1147604_0(p0);
}
private static native long __fieldRead1476_0() throws Throwable;
private static native boolean __call1476_1() throws Throwable;
private static native int __integerCategory1476_2(boolean value) throws Throwable;
private static native int __call1476_3(moom.DT a0) throws Throwable;
private static native java.lang.String __call1476_4(int a0) throws Throwable;
private static native int __call1476_5(moom.DT a0) throws Throwable;
private static native java.lang.String __call1476_6(int a0) throws Throwable;
private static native java.util.ArrayList __call1476_7(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call1147600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1147601_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1147602_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1147603_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1147604_0(java.lang.NumberFormatException a0) throws Throwable;

}


public int compareTo__sourceBridge_e47da4afb6(java.lang.Object p0) {
return ((net.minecraft.command.CommandBase)(this)).a(((net.minecraft.command.ICommand)(((net.minecraft.command.ICommand)(p0)))));
}


public static java.lang.String b(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws moom.b9 { return __sourceHandlerCall_072db0efb9bda9330b2a(p0, p1); }


public static java.lang.String b() {
return net.minecraft.command.CommandBase.b;
}


public static java.util.List<java.lang.String> b(java.lang.String[] p0, int p1, moom.DT p2) { return __sourceHandlerCall_f7eecb9071cb54ebb28a(p0, p1, p2); }


private static java.lang.Exception b(java.lang.Exception p0) {
return p0;
}


public static void b(java.lang.String p0) {
b = ((java.lang.String)(p0));
    return;
}


public static net.minecraft.util.IChatComponent a(java.util.List<net.minecraft.util.IChatComponent> p0) { return __sourceHandlerCall_4787658bd55b72bea73a(p0); }


public static boolean a(java.lang.String p0, java.lang.String p1) {
return (__sourceIntrinsic_booleanComparison((((java.lang.String)(p1)).regionMatches(((boolean)(true)), ((int)(0)), ((java.lang.String)(p0)), ((int)(0)), ((int)(((java.lang.String)(p0)).length()))))) != 0);
}


public static java.lang.String a(java.util.Collection<java.lang.String> p0) {
return __sourceExactCall_cc8499914cc81a(((java.lang.Object[])(((java.util.Collection)(p0)).toArray(((java.lang.Object[])(new java.lang.String[0]))))));
}


public static java.util.List<java.lang.String> a(java.lang.String[] p0, int p1, moom.DT p2) { return __sourceHandlerCall_bc4cb6d2aa51ea55043f(p0, p1, p2); }


public static net.minecraft.item.Item a__wQ(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws moom.b_ { return __sourceHandlerCall_4c1b87d19d53f74288fa(p0, p1); }


public static double a(double p0, java.lang.String p1, int p2, int p3, boolean p4) throws moom.b_ { return __sourceHandlerCall_f4d1c4e376f5b637a7f7(p0, p1, p2, p3, p4); }


public static double a(double p0, java.lang.String p1, boolean p2) throws moom.b_ {
long local4 = (net.minecraft.command.CommandBase.f ^ 60248653751916L);
    return net.minecraft.command.CommandBase.a(((double)(p0)), ((java.lang.String)(p1)), ((int)(__sourceIntrinsic_cf5e4fe439c8_originalDynamicSite1855_1(30404, (1890700336568299172L ^ local4)))), ((int)(__sourceIntrinsic_cf5e4fe439c8_originalDynamicSite1855_2(10630, (2869075642796978663L ^ local4)))), ((boolean)(p2)));
}


public static net.minecraft.block.Block a__ch(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws moom.b_ { return __sourceHandlerCall_cf155d92d6a4bcd61ff7(p0, p1); }


public static java.lang.String a(java.lang.Object[] p0) { return __sourceHandlerCall_8c774d81fa5d906f83d5(p0); }


public static void a(net.minecraft.command.IAdminCommand p0) {
a = ((net.minecraft.command.IAdminCommand)(p0));
    return;
}


public int a(net.minecraft.command.ICommand p0) {
return ((java.lang.String)(__sourceExactCall_1ab861602345d9(((net.minecraft.command.CommandBase)(this))))).compareTo(((java.lang.String)(__sourceExactCall_1a0c6676d2fb86(((net.minecraft.command.ICommand)(p0))))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12857;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/pK", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_f7ec289cdd8c51(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11012_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.util.List<java.lang.String> a(java.lang.String[] p0, java.lang.String[] p1) {
return __sourceExactCall_fd68c00594ddc6(((java.lang.String[])(p0)), ((java.util.Collection)(java.util.Arrays.asList(((java.lang.Object[])(p1))))));
}


public static java.util.List<java.lang.String> a(java.lang.String[] p0, java.util.Collection<?> p1) { return __sourceHandlerCall_070b891e7e45b8aedf66(p0, p1); }


public boolean a__Boolean(java.lang.String[] p0, int p1) {
return ((0) != 0);
}


public static void a(net.minecraft.command.ICommandSender p0, net.minecraft.command.ICommand p1, java.lang.String p2, java.lang.Object[] p3) {
net.minecraft.command.CommandBase.a(((net.minecraft.command.ICommandSender)(p0)), ((net.minecraft.command.ICommand)(p1)), ((int)(0)), ((java.lang.String)(p2)), ((java.lang.Object[])(p3)));
    return;
}


public static void a(net.minecraft.command.ICommandSender p0, net.minecraft.command.ICommand p1, int p2, java.lang.String p3, java.lang.Object[] p4) { __sourceHandlerCall_c6cb58559362f7b6b838(p0, p1, p2, p3, p4); }


public static moom.DT a__DT(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2, boolean p3) throws moom.b_ {
long local4 = (net.minecraft.command.CommandBase.f ^ 83517103769593L);
    moom.DT local6 = ((net.minecraft.command.ICommandSender)(p0)).a__DT();
    return new moom.DT(net.minecraft.command.CommandBase.a(((double)(((double) ((moom.DT)(local6)).a()))), ((java.lang.String)((p1)[p2])), ((int)(__sourceIntrinsic_4a4cb171e419_originalDynamicSite1856_3(10387, (6724067631329464676L ^ local4)))), ((int)(__sourceIntrinsic_4a4cb171e419_originalDynamicSite1856_4(7456, (2021338113369957587L ^ local4)))), ((boolean)(p3))), net.minecraft.command.CommandBase.a(((double)(((double) ((moom.DT)(local6)).b()))), ((java.lang.String)((p1)[(p2 + 1)])), ((int)(0)), ((int)(__sourceIntrinsic_4a4cb171e419_originalDynamicSite1856_7(1285, (8960709538729360631L ^ local4)))), ((boolean)(false))), net.minecraft.command.CommandBase.a(((double)(((double) ((moom.DT)(local6)).c()))), ((java.lang.String)((p1)[(p2 + 2)])), ((int)(__sourceIntrinsic_4a4cb171e419_originalDynamicSite1856_10(30404, (1890773859616558897L ^ local4)))), ((int)(__sourceIntrinsic_4a4cb171e419_originalDynamicSite1856_11(10630, (2869210942249685106L ^ local4)))), ((boolean)(p3))));
}


public static long a(java.lang.String p0, long p1, long p2) throws moom.b_ { return __sourceHandlerCall_06fa7e629c01f1a9009b(p0, p1, p2); }


public static long a__Long(java.lang.String p0) throws moom.b_ {
try {
        return java.lang.Long.parseLong(((java.lang.String)(p0)));
    } catch (java.lang.NumberFormatException caught1) {
        throw new moom.b_("commands.generic.num.invalid", new java.lang.Object[] {p0});
    }
}


public static int a(java.lang.String p0, int p1, int p2) throws moom.b_ { return __sourceHandlerCall_aa6cd429436d99f705bf(p0, p1, p2); }


public static double a(java.lang.String p0) throws moom.b_ { return __sourceHandlerCall_e579320c0c590434ba39(p0); }


public static double a(java.lang.String p0, double p1) throws moom.b_ {
return __sourceExactCall_d3be7015175e92(((java.lang.String)(p0)), ((double)(p1)), ((double)(0x1.fffffffffffffp1023d)));
}


public static double a(java.lang.String p0, double p1, double p2) throws moom.b_ { return __sourceHandlerCall_3bea7e736e6f6950202a(p0, p1, p2); }


public int a() {
return 4;
}


public java.util.List<java.lang.String> a__List() {
return java.util.Collections.emptyList();
}


public boolean a__Boolean(net.minecraft.command.ICommandSender p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.command.ICommandSender)(p0)).a(((int)(((net.minecraft.command.CommandBase)(this)).a())), ((java.lang.String)(((net.minecraft.command.CommandBase)(this)).a__String()))))) != 0);
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) {
return null;
}


public static int a__Int(java.lang.String p0) throws moom.b_ {
try {
        return java.lang.Integer.parseInt(((java.lang.String)(p0)));
    } catch (java.lang.NumberFormatException caught1) {
        throw new moom.b_("commands.generic.num.invalid", new java.lang.Object[] {p0});
    }
}


public static int a(java.lang.String p0, int p1) throws moom.b_ {
long local2 = (net.minecraft.command.CommandBase.f ^ 63301182195219L);
    return __sourceExactCall_66c8783309895d(((java.lang.String)(p0)), ((int)(p1)), ((int)(__sourceIntrinsic_5e130d9b8037_originalDynamicSite1857_1(31592, (6763164865242956660L ^ local2)))));
}


public static java.lang.String a(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws moom.ca { return __sourceHandlerCall_882a268083f90542d844(p0, p1); }


public static net.minecraft.util.IChatComponent a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 {
return net.minecraft.command.CommandBase.a(((net.minecraft.command.ICommandSender)(p0)), ((java.lang.String[])(p1)), ((int)(p2)), ((boolean)(false)));
}


public static net.minecraft.util.IChatComponent a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2, boolean p3) throws moom.ca { return __sourceHandlerCall_45bf9dc1f41e9ed8ab5d(p0, p1, p2, p3); }


public static java.lang.String a(java.lang.String[] p0, int p1) { return __sourceHandlerCall_b91057284ec19108d8a8(p0, p1); }


public static moom.qH a__qH(double p0, java.lang.String p1, boolean p2) throws moom.b_ {
long local4 = (net.minecraft.command.CommandBase.f ^ 59033916924442L);
    return net.minecraft.command.CommandBase.a__qH(((double)(p0)), ((java.lang.String)(p1)), ((int)(__sourceIntrinsic_ec21bf35e63e_originalDynamicSite1858_1(30404, (1890701001147706066L ^ local4)))), ((int)(__sourceIntrinsic_ec21bf35e63e_originalDynamicSite1858_2(10630, (2869077065168893329L ^ local4)))), ((boolean)(p2)));
}


public static moom.qH a__qH(double p0, java.lang.String p1, int p2, int p3, boolean p4) throws moom.b_ { return __sourceHandlerCall_c81d684790d9f260c4e3(p0, p1, p2, p3, p4); }


public static boolean a__Boolean(java.lang.String p0) throws moom.b7 { return __sourceHandlerCall_bef3ace5e2fb9df2396b(p0); }


public static net.minecraft.entity.player.EntityPlayerMP a__sourceReturn_444ce1e828(net.minecraft.command.ICommandSender p0) throws moom.ca { return __sourceHandlerCall_1592fec85eb90f7f66e7(p0); }


public static net.minecraft.entity.player.EntityPlayerMP a__tr(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws moom.ca { return __sourceHandlerCall_06c31bbf8655ecbeebc0(p0, p1); }


public static net.minecraft.entity.Entity a__r3(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws moom.b9 {
return __sourceExactCall_6927b71931c830(((net.minecraft.command.ICommandSender)(p0)), ((java.lang.String)(p1)), ((java.lang.Class)(net.minecraft.entity.Entity.class)));
}


public static <T extends net.minecraft.entity.Entity> T a(net.minecraft.command.ICommandSender p0, java.lang.String p1, java.lang.Class<? extends T> p2) throws moom.b9 { return ((T)(__sourceHandlerCall_8b692b8c064446b1d3d3(p0, p1, p2))); }


public static java.util.List<net.minecraft.entity.Entity> a__List(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws moom.b9 { return __sourceHandlerCall_bc253a8f562658b4fd50(p0, p1); }


private static native <E extends Throwable> int __sourceIntrinsic_cf5e4fe439c8_originalDynamicSite1855_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cf5e4fe439c8_originalDynamicSite1855_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e130d9b8037_originalDynamicSite1857_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11012_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a4cb171e419_originalDynamicSite1856_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a4cb171e419_originalDynamicSite1856_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a4cb171e419_originalDynamicSite1856_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a4cb171e419_originalDynamicSite1856_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a4cb171e419_originalDynamicSite1856_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec21bf35e63e_originalDynamicSite1858_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec21bf35e63e_originalDynamicSite1858_2(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

public int compareTo(net.minecraft.command.ICommand __bridgeParam0) { return this.compareTo__sourceBridge_e47da4afb6(((java.lang.Object)(__bridgeParam0))); }

private static native java.lang.String __sourceExactCall_cc8499914cc81a(java.lang.Object[] p0);
private static native int __sourceExactCall_f7ec289cdd8c51(int p0, long p1);
private static native java.util.List __sourceExactCall_fd68c00594ddc6(java.lang.String[] p0, java.util.Collection p1);
private static native double __sourceExactCall_d3be7015175e92(java.lang.String p0, double p1, double p2) throws moom.b_;
private static native int __sourceExactCall_66c8783309895d(java.lang.String p0, int p1, int p2) throws moom.b_;
private static native net.minecraft.entity.Entity __sourceExactCall_6927b71931c830(net.minecraft.command.ICommandSender p0, java.lang.String p1, java.lang.Class p2) throws moom.b9;

private static native java.lang.String __sourceExactCall_1ab861602345d9(net.minecraft.command.CommandBase p0);
private static native java.lang.String __sourceExactCall_1a0c6676d2fb86(net.minecraft.command.ICommand p0);
}
