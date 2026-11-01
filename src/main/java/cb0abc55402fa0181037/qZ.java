package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class qZ {

private moom.qY a;

private java.lang.String b;

private java.util.List<moom.q0> c;

private java.lang.StackTraceElement[] d;

private static java.lang.String[] e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

public qZ(moom.qY p0, java.lang.String p1) {
super();
    this.c = com.google.common.collect.Lists.newArrayList();
    this.d = new java.lang.StackTraceElement[0];
    this.a = p0;
    this.b = p1;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(4330602428768126408L)), ((long)(6866061044096591988L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(261167139496146L)))));
    java.lang.Object __sourceSpill1478_6 = null;
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (moom.qZ.f ^ 94795927151717L);
    moom.qZ.b(((java.lang.String[])(__sourceSpill1478_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1478_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1478_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1478_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1478_16 = new byte[8];
    (__sourceSpill1478_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1478_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1478_18 = __sourceSpill1478_16;
    ((javax.crypto.Cipher)(__sourceSpill1478_13)).init(((int)(__sourceSpill1478_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1478_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1478_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[11];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "È¡Ï\bÐå³;\r×Ús\tùcd&½·¶°\030>)ÊèSêù\013×îâ{sb¹[,SHQ¾n56\037\f¿Ò´N\0238¡ð\013kR¥sbv|µÂF"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1478_27 = local6_life23;
        int __sourceSpill1478_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1478_27)).substring(((int)(__sourceSpill1478_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1478_32 = local8_life21;
        int __sourceSpill1478_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1478_35 = new byte[8];
        (__sourceSpill1478_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1478_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1478_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1478_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1478_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1478_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1478_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1478_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1478_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1478_36)).doFinal(((byte[])(__sourceSpill1478_35)));
        (__sourceSpill1478_32)[__sourceSpill1478_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "\\hæÿvfDF\020â\177ïÔÕ"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1478_40 = local6_life23;
        int __sourceSpill1478_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1478_40)).substring(((int)(__sourceSpill1478_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1478_45 = local8_life21;
        int __sourceSpill1478_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1478_48 = new byte[8];
        (__sourceSpill1478_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1478_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1478_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1478_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1478_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1478_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1478_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1478_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1478_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1478_49)).doFinal(((byte[])(__sourceSpill1478_48)));
        (__sourceSpill1478_45)[__sourceSpill1478_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    g = ((long[])(local8_life21));
    h = ((java.lang.Integer[])(new java.lang.Integer[11]));
}

private static native <E extends Throwable> int __sourceHandlerCall_69b0f178c3cc7cbca6f0(moom.qZ a0, int a1) throws E;
private static final class __SourceHandler_69b0f178c3cc7cbca6f0 {

public static int f1164(moom.qZ receiver, int p0) throws Throwable {
    int forwardValue1164_39_0;
    java.lang.String[] spill1164_0;
    int spill1164_1;
    long life2_3;
    java.lang.StackTraceElement[] life5_7;
    java.lang.String[] life4_8;
    forward_join_39: {
    forward_join_16: {
    life2_3 = (__fieldRead1164_0() ^ 58939390351524L);
    spill1164_0 = __call1164_1();
    life5_7 = __call1164_3(__call1164_2());
    life4_8 = spill1164_0;
    spill1164_1 = (life5_7).length;
    if (!((life4_8 == null))) {
        forwardValue1164_39_0 = spill1164_1;
        break forward_join_39;
    }
    if (!((spill1164_1 == 0))) {
        break forward_join_16;
    }
    return 0;
    }
    __fieldWrite1164_4(receiver, new java.lang.StackTraceElement[(((life5_7).length - 3) - p0)]);
    __call1164_7(life5_7, (3 + p0), __fieldRead1164_5(receiver), 0, (__fieldRead1164_6(receiver)).length);
    forwardValue1164_39_0 = (__fieldRead1164_8(receiver)).length;
    }
    return forwardValue1164_39_0;
}
public static void h1164_0(moom.Oo p0) throws Throwable {
    throw __call1116400_0(p0);
}
public static void h1164_1(moom.Oo p0) throws Throwable {
    throw __call1116401_0(p0);
}
private static native long __fieldRead1164_0() throws Throwable;
private static native java.lang.String[] __call1164_1() throws Throwable;
private static native java.lang.Thread __call1164_2() throws Throwable;
private static native java.lang.StackTraceElement[] __call1164_3(java.lang.Thread a0) throws Throwable;
private static native void __fieldWrite1164_4(moom.qZ a0, java.lang.StackTraceElement[] a1) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1164_5(moom.qZ a0) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1164_6(moom.qZ a0) throws Throwable;
private static native void __call1164_7(java.lang.StackTraceElement[] a0, int a1, java.lang.StackTraceElement[] a2, int a3, int a4) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1164_8(moom.qZ a0) throws Throwable;
private static native java.lang.Exception __call1116400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_568638c3fe23b18baa4c(moom.qZ a0, java.lang.StackTraceElement a1, java.lang.StackTraceElement a2) throws E;
private static final class __SourceHandler_568638c3fe23b18baa4c {

public static boolean f1165(moom.qZ receiver, java.lang.StackTraceElement p0, java.lang.StackTraceElement p1) throws Throwable {
    java.lang.StackTraceElement forwardValue1165_20_0;
    int forwardValue1165_57_0;
    int forwardValue1165_65_0;
    int forwardValue1165_65_1;
    int forwardValue1165_66_0;
    int forwardValue1165_67_0;
    int forwardValue1165_67_1;
    java.lang.StackTraceElement forwardValue1165_78_0;
    int forwardValue1165_91_0;
    int forwardValue1165_93_0;
    int forwardValue1165_95_0;
    int spill1165_0;
    java.lang.StackTraceElement spill1165_1;
    boolean spill1165_2;
    boolean spill1165_3;
    boolean spill1165_4;
    boolean spill1165_5;
    int spill1165_6;
    java.lang.StackTraceElement spill1165_7;
    boolean spill1165_8;
    long life3_3;
    java.lang.String[] life5_5;
    java.lang.StackTraceElement life6_32;
    forward_join_95: {
    forward_join_94: {
    forward_join_93: {
    forward_join_92: {
    forward_join_91: {
    forward_join_85: {
    forward_join_78: {
    forward_join_70: {
    forward_join_67: {
    forward_join_66: {
    forward_join_65: {
    forward_join_57: {
    forward_join_56: {
    forward_join_20: {
    life3_3 = (__fieldRead1165_0() ^ 10224257655982L);
    life5_5 = __call1165_1();
    spill1165_0 = (__fieldRead1165_2(receiver)).length;
    if (!((life5_5 == null))) {
        forwardValue1165_95_0 = spill1165_0;
        break forward_join_95;
    }
    if (!((spill1165_0 != 0))) {
        break forward_join_94;
    }
    spill1165_1 = p0;
    if (!((life5_5 == null))) {
        forwardValue1165_20_0 = spill1165_1;
        break forward_join_20;
    }
    if (!((spill1165_1 != null))) {
        break forward_join_94;
    }
    forwardValue1165_20_0 = (__fieldRead1165_3(receiver))[0];
    }
    life6_32 = forwardValue1165_20_0;
    spill1165_2 = __call1165_4(life6_32);
    if (!((life5_5 == null))) {
        forwardValue1165_93_0 = __integerCategory1165_5(spill1165_2);
        break forward_join_93;
    }
    if (!((spill1165_2 == __call1165_6(p0)))) {
        break forward_join_92;
    }
    spill1165_3 = __call1165_9(__call1165_7(life6_32), __call1165_8(p0));
    if (!((life5_5 == null))) {
        forwardValue1165_93_0 = __integerCategory1165_10(spill1165_3);
        break forward_join_93;
    }
    if (!(spill1165_3)) {
        break forward_join_92;
    }
    spill1165_4 = __call1165_13(__call1165_11(life6_32), __call1165_12(p0));
    if (!((life5_5 == null))) {
        forwardValue1165_93_0 = __integerCategory1165_14(spill1165_4);
        break forward_join_93;
    }
    if (!(spill1165_4)) {
        break forward_join_92;
    }
    spill1165_5 = __call1165_17(__call1165_15(life6_32), __call1165_16(p0));
    if (!((life5_5 == null))) {
        forwardValue1165_93_0 = __integerCategory1165_18(spill1165_5);
        break forward_join_93;
    }
    if (!(spill1165_5)) {
        break forward_join_92;
    }
    if (!((p1 == null))) {
        break forward_join_56;
    }
    forwardValue1165_57_0 = 1;
    break forward_join_57;
    }
    forwardValue1165_57_0 = 0;
    }
    spill1165_6 = (__fieldRead1165_19(receiver)).length;
    if (!((life5_5 == null))) {
        forwardValue1165_65_0 = forwardValue1165_57_0;
        forwardValue1165_65_1 = spill1165_6;
        break forward_join_65;
    }
    if (!((spill1165_6 > 1))) {
        forwardValue1165_66_0 = forwardValue1165_57_0;
        break forward_join_66;
    }
    forwardValue1165_65_0 = forwardValue1165_57_0;
    forwardValue1165_65_1 = 1;
    }
    forwardValue1165_67_0 = forwardValue1165_65_0;
    forwardValue1165_67_1 = forwardValue1165_65_1;
    break forward_join_67;
    }
    forwardValue1165_67_0 = forwardValue1165_66_0;
    forwardValue1165_67_1 = 0;
    }
    if (!((forwardValue1165_67_0 == forwardValue1165_67_1))) {
        break forward_join_70;
    }
    return __integerCategory1165_20(0);
    }
    spill1165_7 = p1;
    if (!((life5_5 == null))) {
        forwardValue1165_78_0 = spill1165_7;
        break forward_join_78;
    }
    if (!((spill1165_7 != null))) {
        break forward_join_85;
    }
    forwardValue1165_78_0 = (__fieldRead1165_21(receiver))[1];
    }
    spill1165_8 = __call1165_22(forwardValue1165_78_0, p1);
    if (!((life5_5 == null))) {
        forwardValue1165_91_0 = __integerCategory1165_23(spill1165_8);
        break forward_join_91;
    }
    if (!((!spill1165_8))) {
        break forward_join_85;
    }
    return __integerCategory1165_24(0);
    }
    (__fieldRead1165_25(receiver))[0] = p0;
    forwardValue1165_91_0 = 1;
    }
    return __integerCategory1165_26(forwardValue1165_91_0);
    }
    forwardValue1165_93_0 = 0;
    }
    return __integerCategory1165_27(forwardValue1165_93_0);
    }
    forwardValue1165_95_0 = 0;
    }
    return __integerCategory1165_28(forwardValue1165_95_0);
}
public static void h1165_0(moom.Oo p0) throws Throwable {
    throw __call1116500_0(p0);
}
public static void h1165_1(moom.Oo p0) throws Throwable {
    throw __call1116501_0(p0);
}
public static void h1165_2(moom.Oo p0) throws Throwable {
    throw __call1116502_0(p0);
}
public static void h1165_3(moom.Oo p0) throws Throwable {
    throw __call1116503_0(p0);
}
public static void h1165_4(moom.Oo p0) throws Throwable {
    throw __call1116504_0(p0);
}
public static void h1165_5(moom.Oo p0) throws Throwable {
    throw __call1116505_0(p0);
}
public static void h1165_6(moom.Oo p0) throws Throwable {
    throw __call1116506_0(p0);
}
public static void h1165_7(moom.Oo p0) throws Throwable {
    throw __call1116507_0(p0);
}
public static void h1165_8(moom.Oo p0) throws Throwable {
    throw __call1116508_0(p0);
}
public static void h1165_9(moom.Oo p0) throws Throwable {
    throw __call1116509_0(p0);
}
public static void h1165_10(moom.Oo p0) throws Throwable {
    throw __call1116510_0(p0);
}
public static void h1165_11(moom.Oo p0) throws Throwable {
    throw __call1116511_0(p0);
}
public static void h1165_12(moom.Oo p0) throws Throwable {
    throw __call1116512_0(p0);
}
public static void h1165_13(moom.Oo p0) throws Throwable {
    throw __call1116513_0(p0);
}
public static void h1165_14(moom.Oo p0) throws Throwable {
    throw __call1116514_0(p0);
}
public static void h1165_15(moom.Oo p0) throws Throwable {
    throw __call1116515_0(p0);
}
public static void h1165_16(moom.Oo p0) throws Throwable {
    throw __call1116516_0(p0);
}
public static void h1165_17(moom.Oo p0) throws Throwable {
    throw __call1116517_0(p0);
}
public static void h1165_18(moom.Oo p0) throws Throwable {
    throw __call1116518_0(p0);
}
public static void h1165_19(moom.Oo p0) throws Throwable {
    throw __call1116519_0(p0);
}
private static native long __fieldRead1165_0() throws Throwable;
private static native java.lang.String[] __call1165_1() throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1165_2(moom.qZ a0) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1165_3(moom.qZ a0) throws Throwable;
private static native boolean __call1165_4(java.lang.StackTraceElement a0) throws Throwable;
private static native int __integerCategory1165_5(boolean value) throws Throwable;
private static native boolean __call1165_6(java.lang.StackTraceElement a0) throws Throwable;
private static native java.lang.String __call1165_7(java.lang.StackTraceElement a0) throws Throwable;
private static native java.lang.String __call1165_8(java.lang.StackTraceElement a0) throws Throwable;
private static native boolean __call1165_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1165_10(boolean value) throws Throwable;
private static native java.lang.String __call1165_11(java.lang.StackTraceElement a0) throws Throwable;
private static native java.lang.String __call1165_12(java.lang.StackTraceElement a0) throws Throwable;
private static native boolean __call1165_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1165_14(boolean value) throws Throwable;
private static native java.lang.String __call1165_15(java.lang.StackTraceElement a0) throws Throwable;
private static native java.lang.String __call1165_16(java.lang.StackTraceElement a0) throws Throwable;
private static native boolean __call1165_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1165_18(boolean value) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1165_19(moom.qZ a0) throws Throwable;
private static native boolean __integerCategory1165_20(int value) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1165_21(moom.qZ a0) throws Throwable;
private static native boolean __call1165_22(java.lang.StackTraceElement a0, java.lang.StackTraceElement a1) throws Throwable;
private static native int __integerCategory1165_23(boolean value) throws Throwable;
private static native boolean __integerCategory1165_24(int value) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1165_25(moom.qZ a0) throws Throwable;
private static native boolean __integerCategory1165_26(int value) throws Throwable;
private static native boolean __integerCategory1165_27(int value) throws Throwable;
private static native boolean __integerCategory1165_28(int value) throws Throwable;
private static native java.lang.Exception __call1116500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116508_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116509_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116510_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116511_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116512_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116513_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116514_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116515_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116516_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116517_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116518_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116519_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ffc3fc8655b3e68380d0(moom.qZ a0, java.lang.StringBuilder a1) throws E;
private static final class __SourceHandler_ffc3fc8655b3e68380d0 {

public static void f1166(moom.qZ receiver, java.lang.StringBuilder p0) throws Throwable {
    java.lang.StackTraceElement[] lexicalValue1166_59_0;
    java.lang.StackTraceElement[] lexicalValue1166_69_0;
    java.lang.String[] spill1166_0;
    java.lang.StackTraceElement[] spill1166_1;
    long life2_3;
    java.util.Iterator life5_21;
    java.lang.String[] life4_22;
    moom.q0 life6_29;
    java.lang.StackTraceElement[] life5_84;
    int life6_87;
    int life7_89;
    java.lang.StackTraceElement life8_96;
    lexical_join_94: {
    lexical_join_69: {
    lexical_join_59: {
    lexical_join_52: {
    life2_3 = (__fieldRead1166_0() ^ 129089608044188L);
    spill1166_0 = __call1166_1();
    __call1166_5(__call1166_4(__call1166_2(p0, "-- "), __fieldRead1166_3(receiver)), " --\n");
    __call1166_6(p0, "Details:");
    life5_21 = __call1166_8(__fieldRead1166_7(receiver));
    life4_22 = spill1166_0;
    lexical_cycle_23: while (true) {
    if (!(__call1166_9(life5_21))) {
        break lexical_join_52;
    }
    life6_29 = __cast1166_11(__call1166_10(life5_21));
    __call1166_12(p0, "\n\t");
    __call1166_14(p0, __call1166_13(life6_29));
    __call1166_15(p0, ": ");
    __call1166_17(p0, __call1166_16(life6_29));
    if (!((life4_22 == null))) {
        break lexical_join_94;
    }
    if (!((life4_22 != null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    spill1166_1 = __fieldRead1166_18(receiver);
    if (!((life4_22 == null))) {
        lexicalValue1166_59_0 = spill1166_1;
        break lexical_join_59;
    }
    if (!((spill1166_1 != null))) {
        break lexical_join_94;
    }
    lexicalValue1166_59_0 = __fieldRead1166_19(receiver);
    }
    if (!((life4_22 == null))) {
        lexicalValue1166_69_0 = lexicalValue1166_59_0;
        break lexical_join_69;
    }
    if (!(((lexicalValue1166_59_0).length > 0))) {
        break lexical_join_94;
    }
    __call1166_20(p0, "\nStacktrace:");
    lexicalValue1166_69_0 = __fieldRead1166_21(receiver);
    }
    life5_84 = lexicalValue1166_69_0;
    life6_87 = (life5_84).length;
    life7_89 = 0;
    lexical_cycle_75: while (true) {
    if (!((life7_89 < life6_87))) {
        break lexical_join_94;
    }
    life8_96 = (life5_84)[life7_89];
    __call1166_22(p0, "\n\tat ");
    __call1166_24(p0, __call1166_23(life8_96));
    life7_89 += 1;
    if (!((life4_22 != null))) { continue lexical_cycle_75; }
    break lexical_cycle_75;
    }
    }
    return;
}
public static void h1166_0(moom.Oo p0) throws Throwable {
    throw __call1116600_0(p0);
}
public static void h1166_1(moom.Oo p0) throws Throwable {
    throw __call1116601_0(p0);
}
public static void h1166_2(moom.Oo p0) throws Throwable {
    throw __call1116602_0(p0);
}
public static void h1166_3(moom.Oo p0) throws Throwable {
    throw __call1116603_0(p0);
}
public static void h1166_4(moom.Oo p0) throws Throwable {
    throw __call1116604_0(p0);
}
private static native long __fieldRead1166_0() throws Throwable;
private static native java.lang.String[] __call1166_1() throws Throwable;
private static native java.lang.StringBuilder __call1166_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead1166_3(moom.qZ a0) throws Throwable;
private static native java.lang.StringBuilder __call1166_4(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1166_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1166_6(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead1166_7(moom.qZ a0) throws Throwable;
private static native java.util.Iterator __call1166_8(java.util.List a0) throws Throwable;
private static native boolean __call1166_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1166_10(java.util.Iterator a0) throws Throwable;
private static native moom.q0 __cast1166_11(java.lang.Object a0) throws Throwable;
private static native java.lang.StringBuilder __call1166_12(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1166_13(moom.q0 a0) throws Throwable;
private static native java.lang.StringBuilder __call1166_14(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1166_15(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1166_16(moom.q0 a0) throws Throwable;
private static native java.lang.StringBuilder __call1166_17(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1166_18(moom.qZ a0) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1166_19(moom.qZ a0) throws Throwable;
private static native java.lang.StringBuilder __call1166_20(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1166_21(moom.qZ a0) throws Throwable;
private static native java.lang.StringBuilder __call1166_22(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1166_23(java.lang.StackTraceElement a0) throws Throwable;
private static native java.lang.StringBuilder __call1166_24(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1116600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1116604_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_d5d6aa898f269bf65e9d(moom.DT a0) throws E;
private static final class __SourceHandler_d5d6aa898f269bf65e9d {

public static java.lang.String f496(moom.DT p0) throws Throwable {
    java.lang.StringBuilder spill496_0;
    java.lang.String spill496_1;
    java.lang.Object[] spill496_2;
    java.lang.Object[] spill496_3;
    java.lang.Object[] spill496_4;
    java.lang.StringBuilder spill496_5;
    java.lang.String spill496_6;
    java.lang.Object[] spill496_7;
    java.lang.Object[] spill496_8;
    java.lang.Object[] spill496_9;
    java.lang.Object[] spill496_10;
    java.lang.Object[] spill496_11;
    java.lang.Object[] spill496_12;
    java.lang.Object[] spill496_13;
    java.lang.Object[] spill496_14;
    java.lang.Object[] spill496_15;
    java.lang.StringBuilder spill496_16;
    java.lang.String spill496_17;
    java.lang.Object[] spill496_18;
    java.lang.Object[] spill496_19;
    java.lang.Object[] spill496_20;
    java.lang.Object[] spill496_21;
    java.lang.Object[] spill496_22;
    java.lang.Object[] spill496_23;
    java.lang.Object[] spill496_24;
    java.lang.Object[] spill496_25;
    java.lang.Object[] spill496_26;
    java.lang.Object[] spill496_27;
    long life1_3;
    int life3_6;
    int life4_9;
    int life5_12;
    java.lang.StringBuilder life6_16;
    int life7_52;
    int life8_56;
    int life9_64;
    int life10_68;
    int life11_76;
    int life12_80;
    int life13_84;
    int life14_92;
    int life15_100;
    int life7_186;
    int life8_194;
    int life9_198;
    int life10_202;
    int life11_210;
    int life12_218;
    int life13_226;
    int life14_234;
    int life15_246;
    int life16_258;
    life1_3 = (__fieldRead496_0() ^ 48563679037425L);
    life3_6 = __call496_1(p0);
    life4_9 = __call496_2(p0);
    life5_12 = __call496_3(p0);
    life6_16 = new java.lang.StringBuilder();
    spill496_0 = life6_16;
    spill496_1 = "World: (%d,%d,%d)";
    java.lang.Object[] __stackOp496_4_0 = new java.lang.Object[3];
    spill496_2 = __stackOp496_4_0;
    (__stackOp496_4_0)[0] = __call496_5(life3_6);
    java.lang.Object[] __stackOp496_6_0 = spill496_2;
    spill496_3 = __stackOp496_6_0;
    (__stackOp496_6_0)[1] = __call496_7(life4_9);
    java.lang.Object[] __stackOp496_8_0 = spill496_3;
    spill496_4 = __stackOp496_8_0;
    (__stackOp496_8_0)[2] = __call496_9(life5_12);
    __call496_11(spill496_0, __call496_10(spill496_1, spill496_4));
    __call496_12(life6_16, ", ");
    life7_52 = (life3_6 >> 4);
    life8_56 = (life5_12 >> 4);
    life9_64 = (life3_6 & __invokedynamic496_13(32545, (2532034817691965376L ^ life1_3)));
    life10_68 = (life4_9 >> 4);
    life11_76 = (life5_12 & __invokedynamic496_14(12609, (4511658086373794L ^ life1_3)));
    life12_80 = (life7_52 << 4);
    life13_84 = (life8_56 << 4);
    life14_92 = (((life7_52 + 1) << 4) - 1);
    life15_100 = (((life8_56 + 1) << 4) - 1);
    spill496_5 = life6_16;
    spill496_6 = "Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)";
    java.lang.Object[] __stackOp496_16_0 = new java.lang.Object[__invokedynamic496_15(3113, (5304518316871263436L ^ life1_3))];
    spill496_7 = __stackOp496_16_0;
    (__stackOp496_16_0)[0] = __call496_17(life9_64);
    java.lang.Object[] __stackOp496_18_0 = spill496_7;
    spill496_8 = __stackOp496_18_0;
    (__stackOp496_18_0)[1] = __call496_19(life10_68);
    java.lang.Object[] __stackOp496_20_0 = spill496_8;
    spill496_9 = __stackOp496_20_0;
    (__stackOp496_20_0)[2] = __call496_21(life11_76);
    java.lang.Object[] __stackOp496_22_0 = spill496_9;
    spill496_10 = __stackOp496_22_0;
    (__stackOp496_22_0)[3] = __call496_23(life7_52);
    java.lang.Object[] __stackOp496_24_0 = spill496_10;
    spill496_11 = __stackOp496_24_0;
    (__stackOp496_24_0)[4] = __call496_25(life8_56);
    java.lang.Object[] __stackOp496_26_0 = spill496_11;
    spill496_12 = __stackOp496_26_0;
    (__stackOp496_26_0)[5] = __call496_27(life12_80);
    java.lang.Object[] __stackOp496_28_0 = spill496_12;
    spill496_13 = __stackOp496_28_0;
    (__stackOp496_28_0)[__invokedynamic496_29(27596, (8548421971689423652L ^ life1_3))] = __call496_30(life13_84);
    java.lang.Object[] __stackOp496_31_0 = spill496_13;
    spill496_14 = __stackOp496_31_0;
    (__stackOp496_31_0)[__invokedynamic496_32(7460, (6414801827018178L ^ life1_3))] = __call496_33(life14_92);
    java.lang.Object[] __stackOp496_34_0 = spill496_14;
    spill496_15 = __stackOp496_34_0;
    (__stackOp496_34_0)[__invokedynamic496_35(26610, (5751601876017827600L ^ life1_3))] = __call496_36(life15_100);
    __call496_38(spill496_5, __call496_37(spill496_6, spill496_15));
    __call496_39(life6_16, ", ");
    life7_186 = (life3_6 >> __invokedynamic496_40(11435, (2881371737321276480L ^ life1_3)));
    life8_194 = (life5_12 >> __invokedynamic496_41(11435, (2881371737321276480L ^ life1_3)));
    life9_198 = (life7_186 << 5);
    life10_202 = (life8_194 << 5);
    life11_210 = (((life7_186 + 1) << 5) - 1);
    life12_218 = (((life8_194 + 1) << 5) - 1);
    life13_226 = (life7_186 << __invokedynamic496_42(11435, (2881371737321276480L ^ life1_3)));
    life14_234 = (life8_194 << __invokedynamic496_43(11435, (2881371737321276480L ^ life1_3)));
    life15_246 = (((life7_186 + 1) << __invokedynamic496_44(11435, (2881371737321276480L ^ life1_3))) - 1);
    life16_258 = (((life8_194 + 1) << __invokedynamic496_45(11435, (2881371737321276480L ^ life1_3))) - 1);
    spill496_16 = life6_16;
    spill496_17 = "Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)";
    java.lang.Object[] __stackOp496_47_0 = new java.lang.Object[__invokedynamic496_46(14323, (3374701402832805657L ^ life1_3))];
    spill496_18 = __stackOp496_47_0;
    (__stackOp496_47_0)[0] = __call496_48(life7_186);
    java.lang.Object[] __stackOp496_49_0 = spill496_18;
    spill496_19 = __stackOp496_49_0;
    (__stackOp496_49_0)[1] = __call496_50(life8_194);
    java.lang.Object[] __stackOp496_51_0 = spill496_19;
    spill496_20 = __stackOp496_51_0;
    (__stackOp496_51_0)[2] = __call496_52(life9_198);
    java.lang.Object[] __stackOp496_53_0 = spill496_20;
    spill496_21 = __stackOp496_53_0;
    (__stackOp496_53_0)[3] = __call496_54(life10_202);
    java.lang.Object[] __stackOp496_55_0 = spill496_21;
    spill496_22 = __stackOp496_55_0;
    (__stackOp496_55_0)[4] = __call496_56(life11_210);
    java.lang.Object[] __stackOp496_57_0 = spill496_22;
    spill496_23 = __stackOp496_57_0;
    (__stackOp496_57_0)[5] = __call496_58(life12_218);
    java.lang.Object[] __stackOp496_59_0 = spill496_23;
    spill496_24 = __stackOp496_59_0;
    (__stackOp496_59_0)[__invokedynamic496_60(30106, (5255553577762282874L ^ life1_3))] = __call496_61(life13_226);
    java.lang.Object[] __stackOp496_62_0 = spill496_24;
    spill496_25 = __stackOp496_62_0;
    (__stackOp496_62_0)[__invokedynamic496_63(17819, (569573034628279679L ^ life1_3))] = __call496_64(life14_234);
    java.lang.Object[] __stackOp496_65_0 = spill496_25;
    spill496_26 = __stackOp496_65_0;
    (__stackOp496_65_0)[__invokedynamic496_66(2345, (8676355527132160462L ^ life1_3))] = __call496_67(life15_246);
    java.lang.Object[] __stackOp496_68_0 = spill496_26;
    spill496_27 = __stackOp496_68_0;
    (__stackOp496_68_0)[__invokedynamic496_69(11435, (2881371737321276480L ^ life1_3))] = __call496_70(life16_258);
    __call496_72(spill496_16, __call496_71(spill496_17, spill496_27));
    return __call496_73(life6_16);
}
public static java.lang.String h496_0(java.lang.Throwable p0, long p1, int p2, int p3, int p4, java.lang.StringBuilder p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12, int p13, int p14, int p15) throws Throwable {
    java.lang.StringBuilder spill3049600_0;
    java.lang.String spill3049600_1;
    java.lang.Object[] spill3049600_2;
    java.lang.Object[] spill3049600_3;
    java.lang.Object[] spill3049600_4;
    java.lang.Object[] spill3049600_5;
    java.lang.Object[] spill3049600_6;
    java.lang.Object[] spill3049600_7;
    java.lang.Object[] spill3049600_8;
    java.lang.Object[] spill3049600_9;
    java.lang.Object[] spill3049600_10;
    java.lang.StringBuilder spill3049600_11;
    java.lang.String spill3049600_12;
    java.lang.Object[] spill3049600_13;
    java.lang.Object[] spill3049600_14;
    java.lang.Object[] spill3049600_15;
    java.lang.Object[] spill3049600_16;
    java.lang.Object[] spill3049600_17;
    java.lang.Object[] spill3049600_18;
    java.lang.Object[] spill3049600_19;
    java.lang.Object[] spill3049600_20;
    java.lang.Object[] spill3049600_21;
    java.lang.Object[] spill3049600_22;
    java.lang.Throwable life7_2;
    int life7_14;
    int life8_18;
    int life9_26;
    int life10_30;
    int life11_38;
    int life12_42;
    int life13_46;
    int life14_54;
    int life15_62;
    int life7_143;
    int life8_151;
    int life9_155;
    int life10_159;
    int life11_167;
    int life12_175;
    int life13_183;
    int life14_191;
    int life15_203;
    int life16_215;
    life7_2 = p0;
    __call3049600_0(p5, "(Error finding world loc)");
    __call3049600_1(p5, ", ");
    life7_14 = (p2 >> 4);
    life8_18 = (p4 >> 4);
    life9_26 = (p2 & __invokedynamic3049600_2(32545, (2532034817691965376L ^ p1)));
    life10_30 = (p3 >> 4);
    life11_38 = (p4 & __invokedynamic3049600_3(12609, (4511658086373794L ^ p1)));
    life12_42 = (life7_14 << 4);
    life13_46 = (life8_18 << 4);
    life14_54 = (((life7_14 + 1) << 4) - 1);
    life15_62 = (((life8_18 + 1) << 4) - 1);
    spill3049600_0 = p5;
    spill3049600_1 = "Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)";
    java.lang.Object[] __stackOp3049600_5_0 = new java.lang.Object[__invokedynamic3049600_4(3113, (5304518316871263436L ^ p1))];
    spill3049600_2 = __stackOp3049600_5_0;
    (__stackOp3049600_5_0)[0] = __call3049600_6(life9_26);
    java.lang.Object[] __stackOp3049600_7_0 = spill3049600_2;
    spill3049600_3 = __stackOp3049600_7_0;
    (__stackOp3049600_7_0)[1] = __call3049600_8(life10_30);
    java.lang.Object[] __stackOp3049600_9_0 = spill3049600_3;
    spill3049600_4 = __stackOp3049600_9_0;
    (__stackOp3049600_9_0)[2] = __call3049600_10(life11_38);
    java.lang.Object[] __stackOp3049600_11_0 = spill3049600_4;
    spill3049600_5 = __stackOp3049600_11_0;
    (__stackOp3049600_11_0)[3] = __call3049600_12(life7_14);
    java.lang.Object[] __stackOp3049600_13_0 = spill3049600_5;
    spill3049600_6 = __stackOp3049600_13_0;
    (__stackOp3049600_13_0)[4] = __call3049600_14(life8_18);
    java.lang.Object[] __stackOp3049600_15_0 = spill3049600_6;
    spill3049600_7 = __stackOp3049600_15_0;
    (__stackOp3049600_15_0)[5] = __call3049600_16(life12_42);
    java.lang.Object[] __stackOp3049600_17_0 = spill3049600_7;
    spill3049600_8 = __stackOp3049600_17_0;
    (__stackOp3049600_17_0)[__invokedynamic3049600_18(27596, (8548421971689423652L ^ p1))] = __call3049600_19(life13_46);
    java.lang.Object[] __stackOp3049600_20_0 = spill3049600_8;
    spill3049600_9 = __stackOp3049600_20_0;
    (__stackOp3049600_20_0)[__invokedynamic3049600_21(7460, (6414801827018178L ^ p1))] = __call3049600_22(life14_54);
    java.lang.Object[] __stackOp3049600_23_0 = spill3049600_9;
    spill3049600_10 = __stackOp3049600_23_0;
    (__stackOp3049600_23_0)[__invokedynamic3049600_24(26610, (5751601876017827600L ^ p1))] = __call3049600_25(life15_62);
    __call3049600_27(spill3049600_0, __call3049600_26(spill3049600_1, spill3049600_10));
    __call3049600_28(p5, ", ");
    life7_143 = (p2 >> __invokedynamic3049600_29(11435, (2881371737321276480L ^ p1)));
    life8_151 = (p4 >> __invokedynamic3049600_30(11435, (2881371737321276480L ^ p1)));
    life9_155 = (life7_143 << 5);
    life10_159 = (life8_151 << 5);
    life11_167 = (((life7_143 + 1) << 5) - 1);
    life12_175 = (((life8_151 + 1) << 5) - 1);
    life13_183 = (life7_143 << __invokedynamic3049600_31(11435, (2881371737321276480L ^ p1)));
    life14_191 = (life8_151 << __invokedynamic3049600_32(11435, (2881371737321276480L ^ p1)));
    life15_203 = (((life7_143 + 1) << __invokedynamic3049600_33(11435, (2881371737321276480L ^ p1))) - 1);
    life16_215 = (((life8_151 + 1) << __invokedynamic3049600_34(11435, (2881371737321276480L ^ p1))) - 1);
    spill3049600_11 = p5;
    spill3049600_12 = "Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)";
    java.lang.Object[] __stackOp3049600_36_0 = new java.lang.Object[__invokedynamic3049600_35(14323, (3374701402832805657L ^ p1))];
    spill3049600_13 = __stackOp3049600_36_0;
    (__stackOp3049600_36_0)[0] = __call3049600_37(life7_143);
    java.lang.Object[] __stackOp3049600_38_0 = spill3049600_13;
    spill3049600_14 = __stackOp3049600_38_0;
    (__stackOp3049600_38_0)[1] = __call3049600_39(life8_151);
    java.lang.Object[] __stackOp3049600_40_0 = spill3049600_14;
    spill3049600_15 = __stackOp3049600_40_0;
    (__stackOp3049600_40_0)[2] = __call3049600_41(life9_155);
    java.lang.Object[] __stackOp3049600_42_0 = spill3049600_15;
    spill3049600_16 = __stackOp3049600_42_0;
    (__stackOp3049600_42_0)[3] = __call3049600_43(life10_159);
    java.lang.Object[] __stackOp3049600_44_0 = spill3049600_16;
    spill3049600_17 = __stackOp3049600_44_0;
    (__stackOp3049600_44_0)[4] = __call3049600_45(life11_167);
    java.lang.Object[] __stackOp3049600_46_0 = spill3049600_17;
    spill3049600_18 = __stackOp3049600_46_0;
    (__stackOp3049600_46_0)[5] = __call3049600_47(life12_175);
    java.lang.Object[] __stackOp3049600_48_0 = spill3049600_18;
    spill3049600_19 = __stackOp3049600_48_0;
    (__stackOp3049600_48_0)[__invokedynamic3049600_49(30106, (5255553577762282874L ^ p1))] = __call3049600_50(life13_183);
    java.lang.Object[] __stackOp3049600_51_0 = spill3049600_19;
    spill3049600_20 = __stackOp3049600_51_0;
    (__stackOp3049600_51_0)[__invokedynamic3049600_52(17819, (569573034628279679L ^ p1))] = __call3049600_53(life14_191);
    java.lang.Object[] __stackOp3049600_54_0 = spill3049600_20;
    spill3049600_21 = __stackOp3049600_54_0;
    (__stackOp3049600_54_0)[__invokedynamic3049600_55(2345, (8676355527132160462L ^ p1))] = __call3049600_56(life15_203);
    java.lang.Object[] __stackOp3049600_57_0 = spill3049600_21;
    spill3049600_22 = __stackOp3049600_57_0;
    (__stackOp3049600_57_0)[__invokedynamic3049600_58(11435, (2881371737321276480L ^ p1))] = __call3049600_59(life16_215);
    __call3049600_61(spill3049600_11, __call3049600_60(spill3049600_12, spill3049600_22));
    return __call3049600_62(p5);
}
public static java.lang.String h496_1(java.lang.Throwable p0, long p1, int p2, int p3, java.lang.StringBuilder p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12, int p13, int p14) throws Throwable {
    java.lang.StringBuilder spill3049601_0;
    java.lang.String spill3049601_1;
    java.lang.Object[] spill3049601_2;
    java.lang.Object[] spill3049601_3;
    java.lang.Object[] spill3049601_4;
    java.lang.Object[] spill3049601_5;
    java.lang.Object[] spill3049601_6;
    java.lang.Object[] spill3049601_7;
    java.lang.Object[] spill3049601_8;
    java.lang.Object[] spill3049601_9;
    java.lang.Object[] spill3049601_10;
    java.lang.Object[] spill3049601_11;
    java.lang.Throwable life6_2;
    int life6_18;
    int life7_26;
    int life8_30;
    int life9_34;
    int life10_42;
    int life11_50;
    int life12_58;
    int life13_66;
    int life14_78;
    int life15_90;
    life6_2 = p0;
    __call3049601_0(p4, "(Error finding chunk loc)");
    __call3049601_1(p4, ", ");
    life6_18 = (p2 >> __invokedynamic3049601_2(11435, (2881371737321276480L ^ p1)));
    life7_26 = (p3 >> __invokedynamic3049601_3(11435, (2881371737321276480L ^ p1)));
    life8_30 = (life6_18 << 5);
    life9_34 = (life7_26 << 5);
    life10_42 = (((life6_18 + 1) << 5) - 1);
    life11_50 = (((life7_26 + 1) << 5) - 1);
    life12_58 = (life6_18 << __invokedynamic3049601_4(11435, (2881371737321276480L ^ p1)));
    life13_66 = (life7_26 << __invokedynamic3049601_5(11435, (2881371737321276480L ^ p1)));
    life14_78 = (((life6_18 + 1) << __invokedynamic3049601_6(11435, (2881371737321276480L ^ p1))) - 1);
    life15_90 = (((life7_26 + 1) << __invokedynamic3049601_7(11435, (2881371737321276480L ^ p1))) - 1);
    spill3049601_0 = p4;
    spill3049601_1 = "Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)";
    java.lang.Object[] __stackOp3049601_9_0 = new java.lang.Object[__invokedynamic3049601_8(14323, (3374701402832805657L ^ p1))];
    spill3049601_2 = __stackOp3049601_9_0;
    (__stackOp3049601_9_0)[0] = __call3049601_10(life6_18);
    java.lang.Object[] __stackOp3049601_11_0 = spill3049601_2;
    spill3049601_3 = __stackOp3049601_11_0;
    (__stackOp3049601_11_0)[1] = __call3049601_12(life7_26);
    java.lang.Object[] __stackOp3049601_13_0 = spill3049601_3;
    spill3049601_4 = __stackOp3049601_13_0;
    (__stackOp3049601_13_0)[2] = __call3049601_14(life8_30);
    java.lang.Object[] __stackOp3049601_15_0 = spill3049601_4;
    spill3049601_5 = __stackOp3049601_15_0;
    (__stackOp3049601_15_0)[3] = __call3049601_16(life9_34);
    java.lang.Object[] __stackOp3049601_17_0 = spill3049601_5;
    spill3049601_6 = __stackOp3049601_17_0;
    (__stackOp3049601_17_0)[4] = __call3049601_18(life10_42);
    java.lang.Object[] __stackOp3049601_19_0 = spill3049601_6;
    spill3049601_7 = __stackOp3049601_19_0;
    (__stackOp3049601_19_0)[5] = __call3049601_20(life11_50);
    java.lang.Object[] __stackOp3049601_21_0 = spill3049601_7;
    spill3049601_8 = __stackOp3049601_21_0;
    (__stackOp3049601_21_0)[__invokedynamic3049601_22(30106, (5255553577762282874L ^ p1))] = __call3049601_23(life12_58);
    java.lang.Object[] __stackOp3049601_24_0 = spill3049601_8;
    spill3049601_9 = __stackOp3049601_24_0;
    (__stackOp3049601_24_0)[__invokedynamic3049601_25(17819, (569573034628279679L ^ p1))] = __call3049601_26(life13_66);
    java.lang.Object[] __stackOp3049601_27_0 = spill3049601_9;
    spill3049601_10 = __stackOp3049601_27_0;
    (__stackOp3049601_27_0)[__invokedynamic3049601_28(2345, (8676355527132160462L ^ p1))] = __call3049601_29(life14_78);
    java.lang.Object[] __stackOp3049601_30_0 = spill3049601_10;
    spill3049601_11 = __stackOp3049601_30_0;
    (__stackOp3049601_30_0)[__invokedynamic3049601_31(11435, (2881371737321276480L ^ p1))] = __call3049601_32(life15_90);
    __call3049601_34(spill3049601_0, __call3049601_33(spill3049601_1, spill3049601_11));
    return __call3049601_35(p4);
}
public static java.lang.String h496_2(java.lang.Throwable p0, java.lang.StringBuilder p1, int p2) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3049602_0(p1, "(Error finding world loc)");
    return __call3049602_1(p1);
}
private static native long __fieldRead496_0() throws Throwable;
private static native int __call496_1(moom.DT a0) throws Throwable;
private static native int __call496_2(moom.DT a0) throws Throwable;
private static native int __call496_3(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call496_5(int a0) throws Throwable;
private static native java.lang.Integer __call496_7(int a0) throws Throwable;
private static native java.lang.Integer __call496_9(int a0) throws Throwable;
private static native java.lang.String __call496_10(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.StringBuilder __call496_11(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call496_12(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic496_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic496_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic496_15(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call496_17(int a0) throws Throwable;
private static native java.lang.Integer __call496_19(int a0) throws Throwable;
private static native java.lang.Integer __call496_21(int a0) throws Throwable;
private static native java.lang.Integer __call496_23(int a0) throws Throwable;
private static native java.lang.Integer __call496_25(int a0) throws Throwable;
private static native java.lang.Integer __call496_27(int a0) throws Throwable;
private static native int __invokedynamic496_29(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call496_30(int a0) throws Throwable;
private static native int __invokedynamic496_32(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call496_33(int a0) throws Throwable;
private static native int __invokedynamic496_35(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call496_36(int a0) throws Throwable;
private static native java.lang.String __call496_37(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.StringBuilder __call496_38(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call496_39(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic496_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic496_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic496_42(int a0, long a1) throws Throwable;
private static native int __invokedynamic496_43(int a0, long a1) throws Throwable;
private static native int __invokedynamic496_44(int a0, long a1) throws Throwable;
private static native int __invokedynamic496_45(int a0, long a1) throws Throwable;
private static native int __invokedynamic496_46(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call496_48(int a0) throws Throwable;
private static native java.lang.Integer __call496_50(int a0) throws Throwable;
private static native java.lang.Integer __call496_52(int a0) throws Throwable;
private static native java.lang.Integer __call496_54(int a0) throws Throwable;
private static native java.lang.Integer __call496_56(int a0) throws Throwable;
private static native java.lang.Integer __call496_58(int a0) throws Throwable;
private static native int __invokedynamic496_60(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call496_61(int a0) throws Throwable;
private static native int __invokedynamic496_63(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call496_64(int a0) throws Throwable;
private static native int __invokedynamic496_66(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call496_67(int a0) throws Throwable;
private static native int __invokedynamic496_69(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call496_70(int a0) throws Throwable;
private static native java.lang.String __call496_71(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.StringBuilder __call496_72(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call496_73(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.StringBuilder __call3049600_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call3049600_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic3049600_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049600_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049600_4(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049600_6(int a0) throws Throwable;
private static native java.lang.Integer __call3049600_8(int a0) throws Throwable;
private static native java.lang.Integer __call3049600_10(int a0) throws Throwable;
private static native java.lang.Integer __call3049600_12(int a0) throws Throwable;
private static native java.lang.Integer __call3049600_14(int a0) throws Throwable;
private static native java.lang.Integer __call3049600_16(int a0) throws Throwable;
private static native int __invokedynamic3049600_18(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049600_19(int a0) throws Throwable;
private static native int __invokedynamic3049600_21(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049600_22(int a0) throws Throwable;
private static native int __invokedynamic3049600_24(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049600_25(int a0) throws Throwable;
private static native java.lang.String __call3049600_26(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.StringBuilder __call3049600_27(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call3049600_28(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic3049600_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049600_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049600_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049600_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049600_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049600_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049600_35(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049600_37(int a0) throws Throwable;
private static native java.lang.Integer __call3049600_39(int a0) throws Throwable;
private static native java.lang.Integer __call3049600_41(int a0) throws Throwable;
private static native java.lang.Integer __call3049600_43(int a0) throws Throwable;
private static native java.lang.Integer __call3049600_45(int a0) throws Throwable;
private static native java.lang.Integer __call3049600_47(int a0) throws Throwable;
private static native int __invokedynamic3049600_49(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049600_50(int a0) throws Throwable;
private static native int __invokedynamic3049600_52(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049600_53(int a0) throws Throwable;
private static native int __invokedynamic3049600_55(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049600_56(int a0) throws Throwable;
private static native int __invokedynamic3049600_58(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049600_59(int a0) throws Throwable;
private static native java.lang.String __call3049600_60(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.StringBuilder __call3049600_61(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call3049600_62(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.StringBuilder __call3049601_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call3049601_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic3049601_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049601_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049601_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049601_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049601_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049601_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic3049601_8(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049601_10(int a0) throws Throwable;
private static native java.lang.Integer __call3049601_12(int a0) throws Throwable;
private static native java.lang.Integer __call3049601_14(int a0) throws Throwable;
private static native java.lang.Integer __call3049601_16(int a0) throws Throwable;
private static native java.lang.Integer __call3049601_18(int a0) throws Throwable;
private static native java.lang.Integer __call3049601_20(int a0) throws Throwable;
private static native int __invokedynamic3049601_22(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049601_23(int a0) throws Throwable;
private static native int __invokedynamic3049601_25(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049601_26(int a0) throws Throwable;
private static native int __invokedynamic3049601_28(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049601_29(int a0) throws Throwable;
private static native int __invokedynamic3049601_31(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call3049601_32(int a0) throws Throwable;
private static native java.lang.String __call3049601_33(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.StringBuilder __call3049601_34(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call3049601_35(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.StringBuilder __call3049602_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call3049602_1(java.lang.StringBuilder a0) throws Throwable;

}


public static void b(java.lang.String[] p0) {
e = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b() {
return moom.qZ.e;
}


public static void a(moom.qZ p0, moom.DT p1, net.minecraft.block.Block p2, int p3) {
int local4 = net.minecraft.block.Block.a(((net.minecraft.block.Block)(p2)));
    ((moom.qZ)(p0)).a(((java.lang.String)("Block type")), ((java.util.concurrent.Callable)(__sourceIntrinsic_37fd567d0f4a_originalDynamicSite1592_1(local4, p2))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Block data value")), ((java.util.concurrent.Callable)(__sourceIntrinsic_37fd567d0f4a_originalDynamicSite1592_3(p3))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Block location")), ((java.util.concurrent.Callable)(__sourceIntrinsic_37fd567d0f4a_originalDynamicSite1592_5(p1))));
    return;
}


public static void a(moom.qZ p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
moom.qZ spill427_0 = p0;
    java.lang.String spill427_1 = "Block";
    net.minecraft.block.state.IBlockState __stackOp427_0_0 = p2;
    net.minecraft.block.state.IBlockState spill427_2 = __stackOp427_0_0;
    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp427_0_0)));
    ((moom.qZ)(spill427_0)).a(((java.lang.String)(spill427_1)), ((java.util.concurrent.Callable)(__sourceIntrinsic_1cf025c4e876_invokedynamic427_2(spill427_2))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Block location")), ((java.util.concurrent.Callable)(__sourceIntrinsic_1cf025c4e876_invokedynamic427_4(p1))));
    return;
}


public java.lang.StackTraceElement[] a() {
return this.d;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6E69;
        if (h[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/qZ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qZ.h[n2] = n3;
        }
        return h[n2];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8812_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.qZ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(java.lang.String p0, java.lang.Object p1) {
((java.util.List)(this.c)).add(((java.lang.Object)(new moom.q0(p0, p1))));
    return;
}


public void a(java.lang.String p0, java.lang.Throwable p1) {
((moom.qZ)(this)).a(((java.lang.String)(p0)), ((java.lang.Object)(p1)));
    return;
}


public int a(int p0) { return __sourceHandlerCall_69b0f178c3cc7cbca6f0(this, p0); }


public boolean a(java.lang.StackTraceElement p0, java.lang.StackTraceElement p1) { return __sourceHandlerCall_568638c3fe23b18baa4c(this, p0, p1); }


public void a(java.lang.String p0, java.util.concurrent.Callable<java.lang.String> p1) {
try {
        ((moom.qZ)(this)).a(((java.lang.String)(p0)), ((java.lang.Object)(((java.util.concurrent.Callable)(p1)).call())));
    } catch (java.lang.Throwable caught3) {
        ((moom.qZ)(this)).a(((java.lang.String)(p0)), ((java.lang.Throwable)(caught3)));
    }
    return;
}


public static java.lang.String a(moom.DT p0) { return __sourceHandlerCall_d5d6aa898f269bf65e9d(p0); }


public static java.lang.String a(double p0, double p1, double p2) {
return java.lang.String.format(((java.lang.String)("%.2f,%.2f,%.2f - %s")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Double.valueOf(((double)(p0))), java.lang.Double.valueOf(((double)(p1))), java.lang.Double.valueOf(((double)(p2))), moom.qZ.a(((moom.DT)(new moom.DT(p0, p1, p2))))})));
}


public void a(java.lang.StringBuilder p0) { __sourceHandlerCall_ffc3fc8655b3e68380d0(this, p0); }


public void a__Void(int p0) {
java.lang.StackTraceElement[] local2 = new java.lang.StackTraceElement[((this.d).length - p0)];
    java.lang.System.arraycopy(((java.lang.Object)(this.d)), ((int)(0)), ((java.lang.Object)(local2)), ((int)(0)), ((int)((local2).length)));
    this.d = ((java.lang.StackTraceElement[])(local2));
    return;
}


private static java.lang.String lambda$addBlockInfo$3(moom.DT p0) throws java.lang.Exception {
return moom.qZ.a(((moom.DT)(p0)));
}


private static java.lang.String lambda$addBlockInfo$2(moom.DT p0) throws java.lang.Exception {
return moom.qZ.a(((moom.DT)(p0)));
}


private static java.lang.String lambda$addBlockInfo$0(int p0, net.minecraft.block.Block p1) throws java.lang.Exception {
try {
        return java.lang.String.format(((java.lang.String)("ID #%d (%s // %s)")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(p0))), ((net.minecraft.block.Block)(p1)).b__String(), ((java.lang.Class)(((java.lang.Object)(p1)).getClass())).getCanonicalName()})));
    } catch (java.lang.Throwable caught2) {
        return __sourceIntrinsic_2b3e12df4535_invokedynamic8818_5(p0);
    }
}


private static java.lang.String lambda$addBlockInfo$1(int p0) throws java.lang.Exception {
int forwardValue3883_11_0;
    int spill3883_0;
    long life1_3;
    java.lang.String[] life3_5;
    java.lang.String life4_28;
    forward_join_13: {
    forward_join_11: {
    life1_3 = (moom.qZ.f ^ 110418074415939L);
    life3_5 = moom.qZ.b();
    spill3883_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue3883_11_0 = spill3883_0;
        break forward_join_11;
    }
    if (!((spill3883_0 < 0))) {
        break forward_join_13;
    }
    forwardValue3883_11_0 = p0;
    }
    return __sourceIntrinsic_fd5763e44eb0_invokedynamic3883_2(forwardValue3883_11_0);
    }
    life4_28 = ((java.lang.String)(java.lang.String.format(((java.lang.String)("%4s")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.toBinaryString(((int)(p0)))}))))).replace(((java.lang.CharSequence)(" ")), ((java.lang.CharSequence)("0")));
    return java.lang.String.format(((java.lang.String)("%1$d / 0x%1$X / 0b%2$s")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(p0))), life4_28})));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8812_0() throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_37fd567d0f4a_originalDynamicSite1592_1(int a0, net.minecraft.block.Block a1) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_37fd567d0f4a_originalDynamicSite1592_3(int a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_37fd567d0f4a_originalDynamicSite1592_5(moom.DT a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_1cf025c4e876_invokedynamic427_2(net.minecraft.block.state.IBlockState a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_1cf025c4e876_invokedynamic427_4(moom.DT a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2b3e12df4535_invokedynamic8818_5(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fd5763e44eb0_invokedynamic3883_2(int a0) throws E;
}
