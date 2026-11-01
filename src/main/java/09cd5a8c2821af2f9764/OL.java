package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class OL extends org.lwjgl.util.vector.Matrix4f {

private static long a;

private static long[] b;

private static java.lang.Integer[] c;

private static java.util.Map d;

public OL(float[] p0) { super(); }

private static void __sourceConstructorBody_c490ebc5e22fc09d(moom.OL receiver, float[] p0) throws Throwable {
long local2_life2 = (moom.OL.a ^ 10202679781248L);
    moom.OL.__sourceConstructorInit_c490ebc5e22fc09d_0(((moom.OL)(receiver)));
    ((moom.OL)(receiver)).m00 = ((float)((p0)[0]));
    ((moom.OL)(receiver)).m01 = ((float)((p0)[1]));
    ((moom.OL)(receiver)).m02 = ((float)((p0)[2]));
    ((moom.OL)(receiver)).m03 = ((float)((p0)[3]));
    ((moom.OL)(receiver)).m10 = ((float)((p0)[4]));
    ((moom.OL)(receiver)).m11 = ((float)((p0)[5]));
    ((moom.OL)(receiver)).m12 = ((float)((p0)[__sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_11(32492, (6643341086188474259L ^ local2_life2))]));
    ((moom.OL)(receiver)).m13 = ((float)((p0)[__sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_14(14884, (8469451751172524885L ^ local2_life2))]));
    ((moom.OL)(receiver)).m20 = ((float)((p0)[__sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_17(6474, (6051667800163149879L ^ local2_life2))]));
    ((moom.OL)(receiver)).m21 = ((float)((p0)[__sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_20(24233, (7212962035128414165L ^ local2_life2))]));
    ((moom.OL)(receiver)).m22 = ((float)((p0)[__sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_23(10590, (4410974962302474279L ^ local2_life2))]));
    ((moom.OL)(receiver)).m23 = ((float)((p0)[__sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_26(19743, (8008425590520462439L ^ local2_life2))]));
    ((moom.OL)(receiver)).m30 = ((float)((p0)[__sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_29(20471, (801755202990521996L ^ local2_life2))]));
    ((moom.OL)(receiver)).m31 = ((float)((p0)[__sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_32(2787, (7825108511206865811L ^ local2_life2))]));
    ((moom.OL)(receiver)).m32 = ((float)((p0)[__sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_35(19789, (3853797672469904439L ^ local2_life2))]));
    ((moom.OL)(receiver)).m33 = ((float)((p0)[__sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_38(12236, (8398599398962749106L ^ local2_life2))]));
    return;
}


public OL() { super(); }

private static void __sourceConstructorBody_b0bff3fffe5c56ad(moom.OL receiver) throws Throwable {
moom.OL spill210017_0;
    moom.OL spill210017_1;
    moom.OL spill210017_2;
    moom.OL spill210017_3;
    moom.OL spill210017_4;
    moom.OL spill210017_5;
    moom.OL spill210017_6;
    moom.OL spill210017_7;
    moom.OL spill210017_8;
    moom.OL spill210017_9;
    moom.OL spill210017_10;
    moom.OL spill210017_11;
    moom.OL spill210017_12;
    moom.OL spill210017_13;
    moom.OL spill210017_14;
    float spill210017_15;
    float spill210017_16;
    float spill210017_17;
    float spill210017_18;
    float spill210017_19;
    float spill210017_20;
    float spill210017_21;
    float spill210017_22;
    float spill210017_23;
    float spill210017_24;
    float spill210017_25;
    float spill210017_26;
    float spill210017_27;
    float spill210017_28;
    float spill210017_29;
    moom.OL.__sourceConstructorInit_b0bff3fffe5c56ad_0(((moom.OL)(receiver)));
    spill210017_0 = receiver;
    spill210017_1 = receiver;
    spill210017_2 = receiver;
    spill210017_3 = receiver;
    spill210017_4 = receiver;
    spill210017_5 = receiver;
    spill210017_6 = receiver;
    spill210017_7 = receiver;
    spill210017_8 = receiver;
    spill210017_9 = receiver;
    spill210017_10 = receiver;
    spill210017_11 = receiver;
    spill210017_12 = receiver;
    spill210017_13 = receiver;
    spill210017_14 = receiver;
    moom.OL __stackOp210017_1_0 = receiver;
    float __stackOp210017_1_1 = 0x0.0p0f;
    spill210017_15 = __stackOp210017_1_1;
    ((moom.OL)(__stackOp210017_1_0)).m33 = ((float)(__stackOp210017_1_1));
    moom.OL __stackOp210017_3_0 = spill210017_14;
    float __stackOp210017_3_1 = spill210017_15;
    spill210017_16 = __stackOp210017_3_1;
    ((moom.OL)(__stackOp210017_3_0)).m32 = ((float)(__stackOp210017_3_1));
    moom.OL __stackOp210017_5_0 = spill210017_13;
    float __stackOp210017_5_1 = spill210017_16;
    spill210017_17 = __stackOp210017_5_1;
    ((moom.OL)(__stackOp210017_5_0)).m31 = ((float)(__stackOp210017_5_1));
    moom.OL __stackOp210017_7_0 = spill210017_12;
    float __stackOp210017_7_1 = spill210017_17;
    spill210017_18 = __stackOp210017_7_1;
    ((moom.OL)(__stackOp210017_7_0)).m30 = ((float)(__stackOp210017_7_1));
    moom.OL __stackOp210017_9_0 = spill210017_11;
    float __stackOp210017_9_1 = spill210017_18;
    spill210017_19 = __stackOp210017_9_1;
    ((moom.OL)(__stackOp210017_9_0)).m23 = ((float)(__stackOp210017_9_1));
    moom.OL __stackOp210017_11_0 = spill210017_10;
    float __stackOp210017_11_1 = spill210017_19;
    spill210017_20 = __stackOp210017_11_1;
    ((moom.OL)(__stackOp210017_11_0)).m22 = ((float)(__stackOp210017_11_1));
    moom.OL __stackOp210017_13_0 = spill210017_9;
    float __stackOp210017_13_1 = spill210017_20;
    spill210017_21 = __stackOp210017_13_1;
    ((moom.OL)(__stackOp210017_13_0)).m21 = ((float)(__stackOp210017_13_1));
    moom.OL __stackOp210017_15_0 = spill210017_8;
    float __stackOp210017_15_1 = spill210017_21;
    spill210017_22 = __stackOp210017_15_1;
    ((moom.OL)(__stackOp210017_15_0)).m20 = ((float)(__stackOp210017_15_1));
    moom.OL __stackOp210017_17_0 = spill210017_7;
    float __stackOp210017_17_1 = spill210017_22;
    spill210017_23 = __stackOp210017_17_1;
    ((moom.OL)(__stackOp210017_17_0)).m13 = ((float)(__stackOp210017_17_1));
    moom.OL __stackOp210017_19_0 = spill210017_6;
    float __stackOp210017_19_1 = spill210017_23;
    spill210017_24 = __stackOp210017_19_1;
    ((moom.OL)(__stackOp210017_19_0)).m12 = ((float)(__stackOp210017_19_1));
    moom.OL __stackOp210017_21_0 = spill210017_5;
    float __stackOp210017_21_1 = spill210017_24;
    spill210017_25 = __stackOp210017_21_1;
    ((moom.OL)(__stackOp210017_21_0)).m11 = ((float)(__stackOp210017_21_1));
    moom.OL __stackOp210017_23_0 = spill210017_4;
    float __stackOp210017_23_1 = spill210017_25;
    spill210017_26 = __stackOp210017_23_1;
    ((moom.OL)(__stackOp210017_23_0)).m10 = ((float)(__stackOp210017_23_1));
    moom.OL __stackOp210017_25_0 = spill210017_3;
    float __stackOp210017_25_1 = spill210017_26;
    spill210017_27 = __stackOp210017_25_1;
    ((moom.OL)(__stackOp210017_25_0)).m03 = ((float)(__stackOp210017_25_1));
    moom.OL __stackOp210017_27_0 = spill210017_2;
    float __stackOp210017_27_1 = spill210017_27;
    spill210017_28 = __stackOp210017_27_1;
    ((moom.OL)(__stackOp210017_27_0)).m02 = ((float)(__stackOp210017_27_1));
    moom.OL __stackOp210017_29_0 = spill210017_1;
    float __stackOp210017_29_1 = spill210017_28;
    spill210017_29 = __stackOp210017_29_1;
    ((moom.OL)(__stackOp210017_29_0)).m01 = ((float)(__stackOp210017_29_1));
    ((moom.OL)(spill210017_0)).m00 = ((float)(spill210017_29));
    return;
}


static {
javax.crypto.Cipher forestValue425_36_0;
    int forestValue425_36_1;
    javax.crypto.SecretKeyFactory forestValue425_36_2;
    byte[] forestValue425_36_3;
    javax.crypto.Cipher forestValue425_53_0;
    int forestValue425_53_1;
    javax.crypto.SecretKeyFactory forestValue425_53_2;
    byte[] forestValue425_53_3;
    long[] forestValue425_157_0;
    int forestValue425_157_1;
    long forestValue425_157_2;
    int forestValue425_157_3;
    long[] forestValue425_300_0;
    int forestValue425_300_1;
    long forestValue425_300_2;
    long[] forestValue425_312_0;
    int forestValue425_312_1;
    long forestValue425_312_2;
    javax.crypto.Cipher spill425_0;
    int spill425_1;
    javax.crypto.SecretKeyFactory spill425_2;
    byte[] spill425_3;
    byte[] spill425_4;
    java.lang.String spill425_5;
    int spill425_6;
    int spill425_7;
    long spill425_8;
    byte[] spill425_9;
    byte[] spill425_10;
    byte[] spill425_11;
    byte[] spill425_12;
    byte[] spill425_13;
    byte[] spill425_14;
    byte[] spill425_15;
    byte[] spill425_16;
    long spill425_17;
    int spill425_18;
    java.lang.String spill425_19;
    int spill425_20;
    long[] spill425_21;
    int spill425_22;
    long spill425_23;
    int spill425_24;
    long life0_16;
    javax.crypto.Cipher life2_20;
    int life3_35;
    long[] life8_66;
    int life5_68;
    java.lang.String life6_71;
    int life7_73;
    int life4_75;
    byte[] life9_83;
    long life10_160;
    byte[] life12_228;
    byte[] life9_325;
    forest_join_399: {
    forest_join_53: {
    a = ((long)(((moom._a)(moom._c.a(((long)(-566322025093204755L)), ((long)(8309526622039072033L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(17405834168614L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.OL.a ^ 16136327758446L);
    spill425_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill425_1 = 2;
    spill425_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp425_9_0 = new byte[8];
    spill425_3 = __stackOp425_9_0;
    (__stackOp425_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue425_36_0 = spill425_0;
    forestValue425_36_1 = spill425_1;
    forestValue425_36_2 = spill425_2;
    forestValue425_36_3 = spill425_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue425_53_0 = forestValue425_36_0;
        forestValue425_53_1 = forestValue425_36_1;
        forestValue425_53_2 = forestValue425_36_2;
        forestValue425_53_3 = forestValue425_36_3;
        break forest_join_53;
    }
    byte[] __stackOp425_10_0 = forestValue425_36_3;
    spill425_4 = __stackOp425_10_0;
    (__stackOp425_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue425_36_3 = spill425_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue425_53_0)).init(((int)(forestValue425_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue425_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue425_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[10];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "¿8%\003\030aA6p°;9ÚbS¨É,uÜT\\Wº\013{Ç\007Ôü°h9º4ÚamKÞ÷8£?¹8`éa7\005A\025qOÈk"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill425_5 = life6_71;
    spill425_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill425_5)).substring(((int)(spill425_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue425_157_0 = life8_66;
    forestValue425_157_1 = (life5_68++);
    forestValue425_157_2 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    forestValue425_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp425_16_0 = forestValue425_157_2;
    int __stackOp425_16_1 = forestValue425_157_3;
    spill425_7 = __stackOp425_16_1;
    spill425_8 = __stackOp425_16_0;
    recovery.source.CarrierOps.discard(__stackOp425_16_1);
    life10_160 = spill425_8;
    byte[] __stackOp425_18_0 = new byte[8];
    spill425_9 = __stackOp425_18_0;
    (__stackOp425_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp425_19_0 = spill425_9;
    spill425_10 = __stackOp425_19_0;
    (__stackOp425_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp425_20_0 = spill425_10;
    spill425_11 = __stackOp425_20_0;
    (__stackOp425_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp425_21_0 = spill425_11;
    spill425_12 = __stackOp425_21_0;
    (__stackOp425_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp425_22_0 = spill425_12;
    spill425_13 = __stackOp425_22_0;
    (__stackOp425_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp425_23_0 = spill425_13;
    spill425_14 = __stackOp425_23_0;
    (__stackOp425_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp425_24_0 = spill425_14;
    spill425_15 = __stackOp425_24_0;
    (__stackOp425_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp425_25_0 = spill425_15;
    spill425_16 = __stackOp425_25_0;
    (__stackOp425_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp425_26_0 = spill425_16;
    javax.crypto.Cipher __stackOp425_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp425_26_1)).doFinal(((byte[])(__stackOp425_26_0)));
    int __stackOp425_28_0 = spill425_7;
    long __stackOp425_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill425_17 = __stackOp425_28_1;
    spill425_18 = __stackOp425_28_0;
    recovery.source.CarrierOps.discard(__stackOp425_28_1);
    switch (spill425_18) {
default:
{
        forestValue425_300_0 = forestValue425_157_0;
        forestValue425_300_1 = forestValue425_157_1;
        forestValue425_300_2 = spill425_17;
        break forest_join_300;
    }
case 0:
{
        forestValue425_312_0 = forestValue425_157_0;
        forestValue425_312_1 = forestValue425_157_1;
        forestValue425_312_2 = spill425_17;
        break forest_join_312;
    }
}
    }
    (forestValue425_300_0)[forestValue425_300_1] = forestValue425_300_2;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    life7_73 = ((java.lang.String)((life6_71 = "Fîõ\002w1¿Hd¦²¯µÒ"))).length();
    life4_75 = 0;
    break forest_join_317;
    }
    (forestValue425_312_0)[forestValue425_312_1] = forestValue425_312_2;
    if (!((life4_75 >= life7_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill425_19 = life6_71;
    spill425_20 = life4_75;
    life4_75 += 8;
    life9_325 = ((java.lang.String)(((java.lang.String)(spill425_19)).substring(((int)(spill425_20)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill425_21 = life8_66;
    spill425_22 = (life5_68++);
    spill425_23 = (((((((((((long) (life9_325)[0]) & 255L) << 56) | ((((long) (life9_325)[1]) & 255L) << 48)) | ((((long) (life9_325)[2]) & 255L) << 40)) | ((((long) (life9_325)[3]) & 255L) << 32)) | ((((long) (life9_325)[4]) & 255L) << 24)) | ((((long) (life9_325)[5]) & 255L) << 16)) | ((((long) (life9_325)[6]) & 255L) << 8)) | (((long) (life9_325)[7]) & 255L));
    spill425_24 = 0;
    forestValue425_157_0 = spill425_21;
    forestValue425_157_1 = spill425_22;
    forestValue425_157_2 = spill425_23;
    forestValue425_157_3 = spill425_24;
    continue forest_cycle_157;
    }
    }
    }
    b = ((long[])(life8_66));
    c = ((java.lang.Integer[])(new java.lang.Integer[10]));
}

private static native <E extends Throwable> void __sourceConstructorInit_b0bff3fffe5c56ad_0(moom.OL a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_c490ebc5e22fc09d_0(moom.OL a0) throws E;
private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_4c93cb6878ab08087681(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_4c93cb6878ab08087681 {

public static java.lang.invoke.CallSite f376(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill376_0 = life3_4;
    java.lang.invoke.MethodHandle spill376_1 = __call376_3(__methodHandleLiteral376_0(), __classLiteral376_1(), __call376_2(p2));
    int spill376_2 = 0;
    java.lang.Object[] __stackOp376_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill376_3 = __stackOp376_4_0;
    (__stackOp376_4_0)[0] = p0;
    java.lang.Object[] __stackOp376_5_0 = spill376_3;
    java.lang.Object[] spill376_4 = __stackOp376_5_0;
    (__stackOp376_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp376_6_0 = spill376_4;
    java.lang.Object[] spill376_5 = __stackOp376_6_0;
    (__stackOp376_6_0)[2] = p1;
    __call376_9(spill376_0, __call376_8(__call376_7(spill376_1, spill376_2, spill376_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h376_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2037600_6(__call2037600_5(__call2037600_3(__call2037600_2(__call2037600_1(__call2037600_0(new java.lang.StringBuilder(), "moom/OL"), " : "), p1), " : "), __call2037600_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral376_0() throws Throwable;
private static native java.lang.Object __classLiteral376_1() throws Throwable;
private static native int __call376_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call376_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call376_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call376_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call376_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2037600_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2037600_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2037600_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2037600_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2037600_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2037600_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2037600_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_4c93cb6878ab08087681(p0, p1, p2); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.OL.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x74B6;
        if (c[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/OL", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            OL.c[n2] = n4;
        }
        return c[n2];
}


private static native <E extends Throwable> int __sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c490ebc5e22fc09d_originalDynamicSite395_38(int a0, long a1) throws E;
}
