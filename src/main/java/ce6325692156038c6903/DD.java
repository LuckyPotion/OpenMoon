package moom;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
public class DD {

protected java.lang.String a;

protected java.lang.String b;

private static boolean c;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public DD(java.lang.String p0, java.lang.String p1) {
this(((int)(0)), ((java.lang.String[])(new java.lang.String[] {p0, p1})));
    return;
}

private static native <E extends Throwable> void __sourceHandlerCall_e5012b8abacb31de9d01(moom.DD a0, int a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_e5012b8abacb31de9d01 {

public java.lang.String a;
public java.lang.String b;
public static boolean c;
public static long g;
public static long[] h;
public static java.lang.Integer[] i;
public static java.util.Map j;
public static void f557(moom.DD.__SourceHandler_e5012b8abacb31de9d01 receiver, java.lang.String p0, java.lang.String p1) throws Throwable {
    __directThisInit557_0(receiver, 0, new java.lang.String[] {p0, p1});
    return;
}
public static void f558(moom.DD.__SourceHandler_e5012b8abacb31de9d01 receiver, java.lang.String p0) throws Throwable {
    __directThisInit558_1(receiver, 0, __call558_0(p0));
    return;
}
public static void f1905(moom.DD.__SourceHandler_e5012b8abacb31de9d01 receiver, int p0, java.lang.String[] p1) throws Throwable {
    long local3 = (__fieldRead1905_0() ^ 131674439656515L);
    __directSuperInit1905_1(receiver);
    __fieldWrite1905_4(receiver, (__call1905_2((p1)[0]) ? "minecraft" : __call1905_3((p1)[0])));
    __fieldWrite1905_5(receiver, (p1)[1]);
    __call1905_7(__fieldRead1905_6(receiver));
    return;
}
public static void f510() throws Throwable {
    __fieldWrite510_4(__call510_3(__call510_2(-8684598144439941335L, -8299925314111963951L, __call510_1(__call510_0())), 205397606959897L));
    int __sourceSpill510_6 = 1;
    __fieldWrite510_5(new java.util.HashMap(13));
    __call510_7(__sourceSpill510_6);
    long local0_life9 = (__fieldRead510_8() ^ 135073530538831L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill510_13 = (local2_life11 = __call510_10("DES/CBC/NoPadding"));
    int __sourceSpill510_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill510_15 = __call510_12("DES");
    byte[] __sourceSpill510_16 = new byte[8];
    (__sourceSpill510_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill510_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation510_18 = __sourceSpill510_16;
    __call510_20(__sourceSpill510_13, __sourceSpill510_14, __call510_19(__sourceSpill510_15, new javax.crypto.spec.DESKeySpec(__sourcePreallocation510_18)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = __call510_24((local6_life23 = "rÒy/¶%?q7ù\026Þ\030~"));
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill510_27 = local6_life23;
        int __sourceSpill510_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = __call510_30(__call510_29(__sourceSpill510_27, __sourceSpill510_28, local4_life26), "ISO-8859-1");
        long[] __sourceSpill510_32 = local8_life21;
        int __sourceSpill510_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill510_35 = new byte[8];
        (__sourceSpill510_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill510_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill510_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill510_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill510_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill510_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill510_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill510_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill510_36 = local2_life11;
        byte[] local12_life38 = __call510_37(__sourceSpill510_36, __sourceSpill510_35);
        (__sourceSpill510_32)[__sourceSpill510_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    __fieldWrite510_39(local8_life21);
    __fieldWrite510_40(new java.lang.Integer[2]);
    return;
}
public static boolean f1690(moom.DD.__SourceHandler_e5012b8abacb31de9d01 receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue1690_14_0;
    int forwardValue1690_24_0;
    int forwardValue1690_38_0;
    int forwardValue1690_42_0;
    int forwardValue1690_44_0;
    moom.DD.__SourceHandler_e5012b8abacb31de9d01 spill1690_0;
    int spill1690_1;
    boolean spill1690_2;
    long life2_3;
    int life4_5;
    moom.DD.__SourceHandler_e5012b8abacb31de9d01 life5_28;
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_38: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead1690_0() ^ 34759010833611L);
    life4_5 = __integerCategory1690_2(__call1690_1());
    spill1690_0 = receiver;
    if (!((life4_5 == 0))) {
        forwardValue1690_14_0 = spill1690_0;
        break forward_join_14;
    }
    if (!((spill1690_0 == p0))) {
        break forward_join_13;
    }
    return __integerCategory1690_3(1);
    }
    forwardValue1690_14_0 = p0;
    }
    spill1690_1 = __instanceOf1690_4(forwardValue1690_14_0);
    if (!((life4_5 == 0))) {
        forwardValue1690_24_0 = spill1690_1;
        break forward_join_24;
    }
    if (!((spill1690_1 != 0))) {
        break forward_join_23;
    }
    life5_28 = __cast1690_5(p0);
    if (!((life4_5 != 0))) {
        break forward_join_25;
    }
    }
    forwardValue1690_24_0 = 0;
    }
    return __integerCategory1690_6(forwardValue1690_24_0);
    }
    spill1690_2 = __call1690_9(__fieldRead1690_7(receiver), __fieldRead1690_8(life5_28));
    if (!((life4_5 == 0))) {
        forwardValue1690_38_0 = __integerCategory1690_10(spill1690_2);
        break forward_join_38;
    }
    if (!(spill1690_2)) {
        break forward_join_43;
    }
    forwardValue1690_38_0 = __integerCategory1690_14(__call1690_13(__fieldRead1690_11(receiver), __fieldRead1690_12(life5_28)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1690_42_0 = forwardValue1690_38_0;
        break forward_join_42;
    }
    if (!((forwardValue1690_38_0 != 0))) {
        break forward_join_43;
    }
    forwardValue1690_42_0 = 1;
    }
    forwardValue1690_44_0 = forwardValue1690_42_0;
    break forward_join_44;
    }
    forwardValue1690_44_0 = 0;
    }
    return __integerCategory1690_15(forwardValue1690_44_0);
}
public static java.lang.String f1102(moom.DD.__SourceHandler_e5012b8abacb31de9d01 receiver) throws Throwable {
    return __originalDynamicSite1102_2(__fieldRead1102_0(receiver), __fieldRead1102_1(receiver));
}
public static int f1103(moom.DD.__SourceHandler_e5012b8abacb31de9d01 receiver) throws Throwable {
    long local1 = (__fieldRead1103_0() ^ 59766073880919L);
    return ((__originalDynamicSite1103_1(10092, (3450049633915166545L ^ local1)) * __call1103_3(__fieldRead1103_2(receiver))) + __call1103_5(__fieldRead1103_4(receiver)));
}
public static int f4321() {
    int local0 = __call4321_0();
    if ((local0 == 0)) {
        return 1;
    }
    return 0;
}
public static void f12359(int p0) {
    __fieldWrite12359_0(p0);
    return;
}
public static java.lang.Object f12360(Object receiver) {
    return __fieldRead12360_0(receiver);
}
private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x663A;
        if (i[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/DD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            __SourceHandler_e5012b8abacb31de9d01.i[n2] = n3;
        }
        return i[n2];
    }
public static java.lang.Object f12361(java.lang.Object p0) {
    return p0;
}
public static int f1979(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) throws Throwable {
    int local4 = __call1979_1(__cast1979_0((p3)[0]));
    long local5 = __call1979_3(__cast1979_2((p3)[1]));
    int local7 = __call1979_4(local4, local5);
    java.lang.invoke.MethodHandle local8 = __call1979_7(__fieldRead1979_5(), __call1979_6(local7));
    __call1979_11(p1, __call1979_10(local8, 0, new java.lang.Class[] {__fieldRead1979_8(), __fieldRead1979_9()}));
    return local7;
}
public static java.lang.invoke.CallSite f4160(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        __call4160_6(local3, __call4160_5(__call4160_4(__call4160_3(__methodHandleLiteral4160_0(), __classLiteral4160_1(), __call4160_2(p2)), 0, new java.lang.Object[] {p0, local3, p1}), p2));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(__call4160_13(__call4160_12(__call4160_10(__call4160_9(__call4160_8(__call4160_7(new java.lang.StringBuilder(), "moom/DD"), " : "), p1), " : "), __call4160_11(p2))), caught4);
    }
    return local3;
}
public static java.lang.String[] f4161(java.lang.String p0) throws Throwable {
    long local1 = (__fieldRead4161_0() ^ 67892992303743L);
    java.lang.String[] local3 = new java.lang.String[] {null, p0};
    int local4 = __call4161_2(p0, __invokedynamic4161_1(27215, (2682420782806303067L ^ local1)));
    if ((local4 >= 0)) {
        (local3)[1] = __call4161_3(p0, (local4 + 1));
        if ((local4 > 1)) {
        (local3)[0] = __call4161_4(p0, 0, local4);
    }
    }
    return local3;
}
public static int f12365() {
    return __fieldRead12365_0();
}
public static java.lang.Object f12366(Object receiver) {
    return __fieldRead12366_0(receiver);
}
private static native void __directThisInit557_0(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0, int a1, java.lang.String[] a2);
private static native java.lang.String[] __call558_0(java.lang.String a0);
private static native void __directThisInit558_1(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0, int a1, java.lang.String[] a2);
private static native long __fieldRead1905_0();
private static native void __directSuperInit1905_1(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0);
private static native boolean __call1905_2(java.lang.String a0);
private static native java.lang.String __call1905_3(java.lang.String a0);
private static native void __fieldWrite1905_4(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0, java.lang.String a1);
private static native void __fieldWrite1905_5(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0, java.lang.String a1);
private static native java.lang.String __fieldRead1905_6(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0);
private static native java.lang.Object __call1905_7(java.lang.String a0);
private static native java.lang.invoke.MethodHandles.Lookup __call510_0();
private static native java.lang.Class __call510_1(java.lang.invoke.MethodHandles.Lookup a0);
private static native moom._a __call510_2(long a0, long a1, java.lang.Class a2);
private static native long __call510_3(moom._a a0, long a1);
private static native void __fieldWrite510_4(long a0);
private static native void __fieldWrite510_5(java.util.HashMap a0);
private static native void __call510_7(int a0);
private static native long __fieldRead510_8();
private static native javax.crypto.Cipher __call510_10(java.lang.String a0);
private static native javax.crypto.SecretKeyFactory __call510_12(java.lang.String a0);
private static native javax.crypto.SecretKey __call510_19(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1);
private static native void __call510_20(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3);
private static native int __call510_24(java.lang.String a0);
private static native java.lang.String __call510_29(java.lang.String a0, int a1, int a2);
private static native byte[] __call510_30(java.lang.String a0, java.lang.String a1);
private static native byte[] __call510_37(javax.crypto.Cipher a0, byte[] a1);
private static native void __fieldWrite510_39(long[] a0);
private static native void __fieldWrite510_40(java.lang.Integer[] a0);
private static native long __fieldRead1690_0() throws Throwable;
private static native boolean __call1690_1() throws Throwable;
private static native int __integerCategory1690_2(boolean value) throws Throwable;
private static native boolean __integerCategory1690_3(int value) throws Throwable;
private static native int __instanceOf1690_4(java.lang.Object a0) throws Throwable;
private static native moom.DD.__SourceHandler_e5012b8abacb31de9d01 __cast1690_5(java.lang.Object a0) throws Throwable;
private static native boolean __integerCategory1690_6(int value) throws Throwable;
private static native java.lang.String __fieldRead1690_7(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0) throws Throwable;
private static native java.lang.String __fieldRead1690_8(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0) throws Throwable;
private static native boolean __call1690_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1690_10(boolean value) throws Throwable;
private static native java.lang.String __fieldRead1690_11(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0) throws Throwable;
private static native java.lang.String __fieldRead1690_12(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0) throws Throwable;
private static native boolean __call1690_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1690_14(boolean value) throws Throwable;
private static native boolean __integerCategory1690_15(int value) throws Throwable;
private static native java.lang.String __fieldRead1102_0(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0);
private static native java.lang.String __fieldRead1102_1(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0);
private static native java.lang.String __originalDynamicSite1102_2(java.lang.String a0, java.lang.String a1);
private static native long __fieldRead1103_0();
private static native int __originalDynamicSite1103_1(int a0, long a1);
private static native java.lang.String __fieldRead1103_2(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0);
private static native int __call1103_3(java.lang.String a0);
private static native java.lang.String __fieldRead1103_4(moom.DD.__SourceHandler_e5012b8abacb31de9d01 a0);
private static native int __call1103_5(java.lang.String a0);
private static native int __call4321_0();
private static native void __fieldWrite12359_0(int a0);
private static native java.lang.Object __fieldRead12360_0(java.lang.Object a0);
private static native java.lang.Integer __cast1979_0(java.lang.Object a0);
private static native int __call1979_1(java.lang.Integer a0);
private static native java.lang.Long __cast1979_2(java.lang.Object a0);
private static native long __call1979_3(java.lang.Long a0);
private static native int __call1979_4(int a0, long a1);
private static native java.lang.Class __fieldRead1979_5();
private static native java.lang.Integer __call1979_6(int a0);
private static native java.lang.invoke.MethodHandle __call1979_7(java.lang.Class a0, java.lang.Integer a1);
private static native java.lang.Class __fieldRead1979_8();
private static native java.lang.Class __fieldRead1979_9();
private static native java.lang.invoke.MethodHandle __call1979_10(java.lang.invoke.MethodHandle a0, int a1, java.lang.Class[] a2);
private static native void __call1979_11(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1);
private static native java.lang.invoke.MethodHandle __methodHandleLiteral4160_0() throws Throwable;
private static native java.lang.Object __classLiteral4160_1() throws Throwable;
private static native int __call4160_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call4160_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call4160_4(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call4160_5(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call4160_6(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call4160_7(java.lang.StringBuilder a0, java.lang.Object a1) throws Throwable;
private static native java.lang.StringBuilder __call4160_8(java.lang.StringBuilder a0, java.lang.Object a1) throws Throwable;
private static native java.lang.StringBuilder __call4160_9(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call4160_10(java.lang.StringBuilder a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String __call4160_11(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call4160_12(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call4160_13(java.lang.StringBuilder a0) throws Throwable;
private static native long __fieldRead4161_0() throws Throwable;
private static native int __invokedynamic4161_1(int a0, long a1) throws Throwable;
private static native int __call4161_2(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call4161_3(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call4161_4(java.lang.String a0, int a1, int a2) throws Throwable;
private static native int __fieldRead12365_0();
private static native java.lang.Object __fieldRead12366_0(java.lang.Object a0);

}


public DD(java.lang.String p0) {
this(((int)(0)), ((java.lang.String[])(moom.DD.a(((java.lang.String)(p0))))));
    return;
}


protected DD(int p0, java.lang.String[] p1) { super(); __sourceHandlerCall_e5012b8abacb31de9d01(this, p0, p1); }


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-8684598144439941335L)), ((long)(-8299925314111963951L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(205397606959897L)))));
    int __sourceSpill510_6 = 1;
    j = ((java.util.Map)(new java.util.HashMap(13)));
    moom.DD.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill510_6))));
    long local0_life9 = (moom.DD.g ^ 135073530538831L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill510_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill510_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill510_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill510_16 = new byte[8];
    (__sourceSpill510_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill510_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation510_18 = __sourceSpill510_16;
    ((javax.crypto.Cipher)(__sourceSpill510_13)).init(((int)(__sourceSpill510_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill510_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation510_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "rÒy/¶%?q7ù\026Þ\030~"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill510_27 = local6_life23;
        int __sourceSpill510_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill510_27)).substring(((int)(__sourceSpill510_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill510_32 = local8_life21;
        int __sourceSpill510_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill510_35 = new byte[8];
        (__sourceSpill510_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill510_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill510_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill510_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill510_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill510_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill510_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill510_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill510_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill510_36)).doFinal(((byte[])(__sourceSpill510_35)));
        (__sourceSpill510_32)[__sourceSpill510_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    h = ((long[])(local8_life21));
    i = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue1690_14_0;
    int forwardValue1690_24_0;
    int forwardValue1690_38_0;
    int forwardValue1690_42_0;
    int forwardValue1690_44_0;
    moom.DD spill1690_0;
    int spill1690_1;
    boolean spill1690_2;
    long life2_3;
    int life4_5;
    moom.DD life5_28;
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_38: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.DD.g ^ 34759010833611L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1690_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue1690_14_0 = spill1690_0;
        break forward_join_14;
    }
    if (!((spill1690_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue1690_14_0 = p0;
    }
    spill1690_1 = ((forwardValue1690_14_0 instanceof moom.DD) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue1690_24_0 = spill1690_1;
        break forward_join_24;
    }
    if (!((spill1690_1 != 0))) {
        break forward_join_23;
    }
    life5_28 = ((moom.DD)(p0));
    if (!((life4_5 != 0))) {
        break forward_join_25;
    }
    }
    forwardValue1690_24_0 = 0;
    }
    return ((forwardValue1690_24_0) != 0);
    }
    spill1690_2 = ((java.lang.String)(this.a)).equals(((java.lang.Object)(((moom.DD)(life5_28)).a)));
    if (!((life4_5 == 0))) {
        forwardValue1690_38_0 = ((spill1690_2) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill1690_2)) {
        break forward_join_43;
    }
    forwardValue1690_38_0 = ((((java.lang.String)(this.b)).equals(((java.lang.Object)(((moom.DD)(life5_28)).b)))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue1690_42_0 = forwardValue1690_38_0;
        break forward_join_42;
    }
    if (!((forwardValue1690_38_0 != 0))) {
        break forward_join_43;
    }
    forwardValue1690_42_0 = 1;
    }
    forwardValue1690_44_0 = forwardValue1690_42_0;
    break forward_join_44;
    }
    forwardValue1690_44_0 = 0;
    }
    return ((forwardValue1690_44_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1102_2(this.a, this.b);
}


public int hashCode() {
long local1 = (moom.DD.g ^ 59766073880919L);
    return ((__sourceIntrinsic_1861091996aa_originalDynamicSite1103_1(10092, (3450049633915166545L ^ local1)) * ((java.lang.String)(this.a)).hashCode()) + ((java.lang.String)(this.b)).hashCode());
}


public static boolean b__Boolean() {
int local0 = __sourceIntrinsic_booleanToInteger(moom.DD.a__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public static void b(boolean p0) {
c = ((boolean)(p0));
    return;
}


public java.lang.String b() {
return this.a;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x663A;
        if (i[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/DD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DD.i[n2] = n3;
        }
        return i[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.DD.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4160_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/DD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected static java.lang.String[] a(java.lang.String p0) {
long local1 = (moom.DD.g ^ 67892992303743L);
    java.lang.String[] local3 = new java.lang.String[] {null, p0};
    int local4 = ((java.lang.String)(p0)).indexOf(((int)(__sourceIntrinsic_7e7263bfc9f4_invokedynamic4161_1(27215, (2682420782806303067L ^ local1)))));
    if ((local4 >= 0)) {
        (local3)[1] = ((java.lang.String)(p0)).substring(((int)((local4 + 1))));
        if ((local4 > 1)) {
        (local3)[0] = ((java.lang.String)(p0)).substring(((int)(0)), ((int)(local4)));
    }
    }
    return local3;
}


public static boolean a__Boolean() {
return ((((moom.DD.c) ? 1 : 0)) != 0);
}


public java.lang.String a() {
return this.b;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1102_2(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1103_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4160_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7e7263bfc9f4_invokedynamic4161_1(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
