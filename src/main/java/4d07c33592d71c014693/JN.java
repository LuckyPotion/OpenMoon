package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class JN {

private moom.Jk a;

private float[][] b;

private float[][] c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public JN(moom.Jk p0) { super(); __sourceHandlerCall_a95ceafe03be1dfa655d(this, p0); }


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-3696863662425594067L)), ((long)(-22933540868839712L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(14525100344483L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.JN.d ^ 88683381242228L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill598_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill598_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill598_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill598_14 = new byte[8];
    (__sourceSpill598_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill598_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation598_16 = __sourceSpill598_14;
    ((javax.crypto.Cipher)(__sourceSpill598_11)).init(((int)(__sourceSpill598_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill598_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation598_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[3];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "åõ­Ë°~\0221åg¤Ôëº¥3(\006x\024\013ýÑ\030Ý<I0}· õZ*¬mb~jç\023¼\toSßC}7Ê\003°OÝ±³@- !0'\001>]v\0055\023\004·kå\003ÍÿÐ9â\020\1776<äÕ2Új¤\\·ue\031ÿâöÑ'öæÚ«"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill598_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill598_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill598_29)).doFinal(((byte[])(__sourceSpill598_28)));
        java.lang.String __sourceSpill598_34 = ((java.lang.String)(moom.JN.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill598_35 = local20_life19;
        int __sourceSpill598_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill598_35)[__sourceSpill598_36] = __sourceSpill598_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    e = ((java.lang.String[])(local20_life19));
    f = ((java.lang.String[])(new java.lang.String[3]));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill598_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill598_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill598_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill598_47 = new byte[8];
    (__sourceSpill598_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill598_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation598_49 = __sourceSpill598_47;
    ((javax.crypto.Cipher)(__sourceSpill598_44)).init(((int)(__sourceSpill598_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill598_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation598_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[5];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "\02067ªBÞ®\000°O\006\"a,UÄP\013Àe³"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill598_58 = local4_life54;
        int __sourceSpill598_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill598_58)).substring(((int)(__sourceSpill598_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill598_63 = local6_life52;
        int __sourceSpill598_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill598_66 = new byte[8];
        (__sourceSpill598_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill598_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill598_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill598_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill598_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill598_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill598_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill598_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill598_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill598_67)).doFinal(((byte[])(__sourceSpill598_66)));
        (__sourceSpill598_63)[__sourceSpill598_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    local5_life56 = ((java.lang.String)((local4_life54 = "\005-s`ËD}×)Âã"))).length();
    local2_life57 = 0;
    do {
        java.lang.String __sourceSpill598_71 = local4_life54;
        int __sourceSpill598_72 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill598_71)).substring(((int)(__sourceSpill598_72)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill598_76 = local6_life52;
        int __sourceSpill598_77 = local3_life53;
        local3_life53 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill598_79 = new byte[8];
        (__sourceSpill598_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill598_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill598_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill598_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill598_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill598_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill598_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill598_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill598_80 = local0_life42;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill598_80)).doFinal(((byte[])(__sourceSpill598_79)));
        (__sourceSpill598_76)[__sourceSpill598_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    h = ((long[])(local6_life52));
    i = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceHandlerCall_a95ceafe03be1dfa655d(moom.JN a0, moom.Jk a1) throws E;
private static final class __SourceHandler_a95ceafe03be1dfa655d {

public static void f522(moom.JN receiver, moom.Jk p0) throws Throwable {
    long local2_life2 = (__fieldRead522_0() ^ __originalNumericLdc522_1());
    __directSuperInit522_3(receiver);
    __fieldWrite522_4(receiver, null);
    __fieldWrite522_8(receiver, __multiArray522_7(__originalDynamicSite522_6(4128, (__originalNumericLdc522_5() ^ local2_life2)), 3));
    __fieldWrite522_12(receiver, __multiArray522_11(__originalDynamicSite522_10(4128, (__originalNumericLdc522_9() ^ local2_life2)), 3));
    __fieldWrite522_13(receiver, p0);
    return;
}
private static native long __fieldRead522_0() throws Throwable;
private static native long __originalNumericLdc522_1() throws Throwable;
private static native void __directSuperInit522_3(moom.JN a0) throws Throwable;
private static native void __fieldWrite522_4(moom.JN a0, java.lang.Object a1) throws Throwable;
private static native long __originalNumericLdc522_5() throws Throwable;
private static native int __originalDynamicSite522_6(int a0, long a1) throws Throwable;
private static native float[][] __multiArray522_7(int a0, int a1) throws Throwable;
private static native void __fieldWrite522_8(moom.JN a0, float[][] a1) throws Throwable;
private static native long __originalNumericLdc522_9() throws Throwable;
private static native int __originalDynamicSite522_10(int a0, long a1) throws Throwable;
private static native float[][] __multiArray522_11(int a0, int a1) throws Throwable;
private static native void __fieldWrite522_12(moom.JN a0, float[][] a1) throws Throwable;
private static native void __fieldWrite522_13(moom.JN a0, moom.Jk a1) throws Throwable;

}


private static void b(java.lang.String p0) {
long local1_life2 = (moom.JN.d ^ 7659500501261L);
    java.lang.String __stackOp524_5_0 = p0;
    java.lang.String __stackOp524_5_1 = __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite524_4(10230, (5747800649538048413L ^ local1_life2));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_d1c1922d1ba0_originalDynamicSite524_6(__stackOp524_5_1, __stackOp524_5_0))));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5140_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5D50;
        if (i[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = h[n4];
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
                throw new RuntimeException("moom/JN", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            JN.i[n4] = n7;
        }
        return i[n4];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.JN.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JN.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5141_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a(net.minecraft.world.World p0, float p1, int[] p2, boolean p3) {
moom.Jk forestValue688_15_0;
    int forestValue688_35_0;
    int forestValue688_60_0;
    int forestValue688_74_0;
    int forestValue688_121_0;
    int forestValue688_123_0;
    int forestValue688_158_0;
    int forestValue688_247_0;
    int forestValue688_296_0;
    moom.Jk spill688_0;
    boolean spill688_1;
    int spill688_2;
    int spill688_3;
    boolean spill688_4;
    int spill688_5;
    int spill688_6;
    int spill688_7;
    int spill688_8;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    int life8_17;
    int life9_39;
    int life10_65;
    float life11_89;
    float life12_107;
    float life13_117;
    float life14_121;
    int life15_132;
    float[][] life16_136;
    float[] life17_163;
    int life18_165;
    int life19_176;
    int life20_187;
    float life21_205;
    float life22_217;
    float life22_227;
    int life21_258;
    int life22_265;
    forest_join_296: {
    forest_join_295: {
    forest_join_123: {
    forest_join_122: {
    forest_join_121: {
    forest_join_93: {
    forest_join_90: {
    forest_join_75: {
    forest_join_74: {
    forest_join_60: {
    forest_join_59: {
    forest_join_35: {
    forest_join_32: {
    forest_join_15: {
    forest_join_13: {
    life5_3 = (moom.JN.d ^ 80112475663816L);
    life7_5 = moom.JM.b__Arrayr3();
    spill688_0 = this.a;
    if (!((life7_5 != null))) {
        forestValue688_15_0 = spill688_0;
        break forest_join_15;
    }
    if (!((spill688_0 == null))) {
        break forest_join_13;
    }
    return ((0) != 0);
    }
    forestValue688_15_0 = this.a;
    }
    life8_17 = ((moom.Jk)(forestValue688_15_0)).d();
    spill688_1 = p3;
    if (!((life7_5 != null))) {
        forestValue688_35_0 = ((spill688_1) ? 1 : 0);
        break forest_join_35;
    }
    if (!(spill688_1)) {
        break forest_join_32;
    }
    spill688_2 = life8_17;
    if (!((life7_5 != null))) {
        forestValue688_35_0 = spill688_2;
        break forest_join_35;
    }
    if (!((spill688_2 < __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_7(13239, (8415458589608925664L ^ life5_3))))) {
        break forest_join_32;
    }
    return ((0) != 0);
    }
    forestValue688_35_0 = ((moom.Jk)(this.a)).c();
    }
    life9_39 = forestValue688_35_0;
    spill688_3 = life9_39;
    if (!((life7_5 != null))) {
        forestValue688_60_0 = spill688_3;
        break forest_join_60;
    }
    if (!((spill688_3 < __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_11(4128, (2515306431197543027L ^ life5_3))))) {
        break forest_join_59;
    }
    int __stackOp688_13_0 = life9_39;
    java.lang.String __stackOp688_13_1 = __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_12(9696, (4737716488986167116L ^ life5_3));
    moom.JN.b(((java.lang.String)(__sourceIntrinsic_5b3c6b96dc50_invokedynamic688_14(__stackOp688_13_1, __stackOp688_13_0))));
    this.a = ((moom.Jk)(null));
    return ((0) != 0);
    }
    forestValue688_60_0 = 0;
    }
    life10_65 = forestValue688_60_0;
    spill688_4 = p3;
    if (!((life7_5 != null))) {
        forestValue688_74_0 = ((spill688_4) ? 1 : 0);
        break forest_join_74;
    }
    if (!(spill688_4)) {
        break forest_join_75;
    }
    forestValue688_74_0 = ((life9_39 * __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_19(4128, (2515306431197543027L ^ life5_3))) * 2);
    }
    life10_65 = forestValue688_74_0;
    }
    life11_89 = (0x1.2aaaaap0f * (((net.minecraft.world.World)(p0)).a(((float)(0x1.0p0f))) - 0x1.99999ap-3f));
    if (!((life7_5 != null))) {
        break forest_join_93;
    }
    if (!((((net.minecraft.world.World)(p0)).g() > 0))) {
        break forest_join_90;
    }
    life11_89 = 0x1.0p0f;
    }
    life11_89 = moom.BU.a(((float)(life11_89)));
    }
    life12_107 = (life11_89 * ((float) (life9_39 - 1)));
    life13_117 = (moom.BU.a(((float)((p1 + 0x1.0p-1f)))) * ((float) (life9_39 - 1)));
    life14_121 = moom.BU.a(((float)(((net.minecraft.client.settings.GameSettings)(moom.BU.a__pw())).aX)));
    spill688_5 = recovery.source.CarrierOps.fcmpl(((float)(life14_121)), ((float)(0x1.a36e2ep-14f)));
    if (!((life7_5 != null))) {
        forestValue688_121_0 = spill688_5;
        break forest_join_121;
    }
    if (!((spill688_5 > 0))) {
        break forest_join_122;
    }
    forestValue688_121_0 = 1;
    }
    forestValue688_123_0 = forestValue688_121_0;
    break forest_join_123;
    }
    forestValue688_123_0 = 0;
    }
    life15_132 = forestValue688_123_0;
    life16_136 = ((moom.Jk)(this.a)).a__ArrayArrayFloat();
    ((moom.JN)(this)).a(((float[][])(life16_136)), ((float)(life12_107)), ((int)(life10_65)), ((int)(life9_39)), ((float[][])(this.b)));
    ((moom.JN)(this)).a(((float[][])(life16_136)), ((float)(life13_117)), ((int)((life10_65 + (__sourceIntrinsic_5b3c6b96dc50_invokedynamic688_32(4128, (2515306431197543027L ^ life5_3)) * life9_39)))), ((int)(life9_39)), ((float[][])(this.c)));
    life17_163 = new float[3];
    life18_165 = 0;
    forest_cycle_157: while (true) {
    forest_join_292: {
    forestValue688_158_0 = life18_165;
    forest_cycle_158: while (true) {
    if (!((forestValue688_158_0 < __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_35(4128, (2515306431197543027L ^ life5_3))))) {
        break forest_join_295;
    }
    spill688_6 = 0;
    if (!((life7_5 != null))) {
        forestValue688_296_0 = spill688_6;
        break forest_join_296;
    }
    life19_176 = spill688_6;
    forest_cycle_168: while (true) {
    forest_join_247: {
    forest_join_234: {
    if (!((life19_176 < __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_36(4128, (2515306431197543027L ^ life5_3))))) {
        break forest_join_292;
    }
    spill688_7 = 0;
    if (!((life7_5 != null))) {
        forestValue688_158_0 = spill688_7;
        continue forest_cycle_158;
    }
    life20_187 = spill688_7;
    forest_cycle_179: while (true) {
    forest_join_232: {
    forest_join_227: {
    if (!((life20_187 < 3))) {
        break forest_join_234;
    }
    life21_205 = moom.BU.a(((float)((((this.b)[life18_165])[life20_187] + ((this.c)[life19_176])[life20_187]))));
    if (!((life7_5 != null))) {
        break forest_join_232;
    }
    spill688_8 = life15_132;
    if (!((life7_5 != null))) {
        forestValue688_247_0 = spill688_8;
        break forest_join_247;
    }
    if (!((spill688_8 != 0))) {
        break forest_join_227;
    }
    life22_217 = (0x1.0p0f - life21_205);
    life22_227 = (0x1.0p0f - (((life22_217 * life22_217) * life22_217) * life22_217));
    life21_205 = ((life14_121 * life22_227) + ((0x1.0p0f - life14_121) * life21_205));
    }
    (life17_163)[life20_187] = life21_205;
    life20_187 += 1;
    }
    if (!((life7_5 == null))) {
        continue forest_cycle_179;
    }
    break forest_cycle_179;
    }
    }
    life20_187 = ((int) ((life17_163)[0] * 0x1.fep7f));
    forestValue688_247_0 = ((int) ((life17_163)[1] * 0x1.fep7f));
    }
    life21_258 = forestValue688_247_0;
    life22_265 = ((int) ((life17_163)[2] * 0x1.fep7f));
    (p2)[((life18_165 * __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_40(4128, (2515306431197543027L ^ life5_3))) + life19_176)] = (((__sourceIntrinsic_5b3c6b96dc50_invokedynamic688_41(24816, (8936486454849899169L ^ life5_3)) | (life20_187 << __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_42(4128, (2515306431197543027L ^ life5_3)))) | (life21_258 << __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_43(28151, (5282807541999241127L ^ life5_3)))) | life22_265);
    life19_176 += 1;
    if (!((life7_5 == null))) {
        continue forest_cycle_168;
    }
    break forest_cycle_168;
    }
    break forest_cycle_158;
    }
    }
    life18_165 += 1;
    if (!((life7_5 == null))) {
        continue forest_cycle_157;
    }
    break forest_cycle_157;
    }
    }
    forestValue688_296_0 = 1;
    }
    return ((forestValue688_296_0) != 0);
}


public moom.Jk a() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static void a(java.lang.String p0) {
long local1_life2 = (moom.JN.d ^ 66017919298739L);
    java.lang.String __stackOp523_5_0 = p0;
    java.lang.String __stackOp523_5_1 = __sourceIntrinsic_474b89cf9bbb_originalDynamicSite523_4(21530, (7629810985966172110L ^ local1_life2));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_474b89cf9bbb_originalDynamicSite523_6(__stackOp523_5_1, __stackOp523_5_0))));
    return;
}


private void a(float[][] p0, float p1, int p2, int p3, float[][] p4) {
int lexicalValue831_22_0;
    net.minecraft.entity.Entity[] spill831_0;
    int spill831_1;
    long life6_3;
    int life9_9;
    int life10_14;
    net.minecraft.entity.Entity[] life8_15;
    int life11_28;
    float[] life12_45;
    float[] life13_49;
    float life11_72;
    float life12_79;
    int life13_81;
    float[] life14_98;
    float[] life15_108;
    float[] life16_112;
    int life17_114;
    lexical_join_131: {
    lexical_join_57: {
    lexical_join_55: {
    lexical_join_22: {
    life6_3 = (moom.JN.d ^ 115435881713837L);
    spill831_0 = moom.JM.b__Arrayr3();
    life9_9 = ((int) java.lang.Math.floor(((double)(((double) p1)))));
    life10_14 = ((int) java.lang.Math.ceil(((double)(((double) p1)))));
    life8_15 = spill831_0;
    spill831_1 = life9_9;
    if (!((life8_15 != null))) {
        lexicalValue831_22_0 = spill831_1;
        break lexical_join_22;
    }
    if (!((spill831_1 == life10_14))) {
        break lexical_join_57;
    }
    lexicalValue831_22_0 = 0;
    }
    life11_28 = lexicalValue831_22_0;
    lexical_cycle_23: while (true) {
    if (!((life11_28 < __sourceIntrinsic_00b8f74a97fb_invokedynamic831_4(16933, (1237392287838475538L ^ life6_3))))) {
        break lexical_join_55;
    }
    life12_45 = (p0)[((p2 + (life11_28 * p3)) + life9_9)];
    life13_49 = (p4)[life11_28];
    java.lang.System.arraycopy(((java.lang.Object)(life12_45)), ((int)(0)), ((java.lang.Object)(life13_49)), ((int)(0)), ((int)(3)));
    life11_28 += 1;
    if (!((life8_15 != null))) {
        break lexical_join_131;
    }
    if (!((life8_15 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    if (!((life8_15 == null))) {
        break lexical_join_131;
    }
    }
    life11_72 = (0x1.0p0f - (p1 - ((float) life9_9)));
    life12_79 = (0x1.0p0f - (((float) life10_14) - p1));
    life13_81 = 0;
    lexical_cycle_73: while (true) {
    lexical_join_129: {
    lexical_join_128: {
    if (!((life13_81 < __sourceIntrinsic_00b8f74a97fb_invokedynamic831_6(4128, (2515271382671476502L ^ life6_3))))) {
        break lexical_join_131;
    }
    life14_98 = (p0)[((p2 + (life13_81 * p3)) + life9_9)];
    life15_108 = (p0)[((p2 + (life13_81 * p3)) + life10_14)];
    life16_112 = (p4)[life13_81];
    life17_114 = 0;
    lexical_cycle_106: while (true) {
    if (!((life17_114 < 3))) {
        break lexical_join_128;
    }
    (life16_112)[life17_114] = (((life14_98)[life17_114] * life11_72) + ((life15_108)[life17_114] * life12_79));
    life17_114 += 1;
    if (!((life8_15 != null))) {
        break lexical_join_129;
    }
    if (!((life8_15 == null))) { continue lexical_cycle_106; }
    break lexical_cycle_106;
    }
    }
    life13_81 += 1;
    }
    if (!((life8_15 == null))) { continue lexical_cycle_73; }
    break lexical_cycle_73;
    }
    }
    return;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill2662_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2662_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2662_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2662_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2662_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2662_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5549);
    if (((moom.JN.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JN.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JN.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JN", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((moom.JN.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JN.f)[life5_8] = moom.JN.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JN.f)[life5_8];
}


private static native <E extends Throwable> int __sourceIntrinsic_277a4747d752_originalDynamicSite522_6(int a0, long a1) throws E;

private static native <E extends Throwable> float[][] __sourceIntrinsic_277a4747d752_multiArray522_7(int a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_277a4747d752_originalDynamicSite522_10(int a0, long a1) throws E;

private static native <E extends Throwable> float[][] __sourceIntrinsic_277a4747d752_multiArray522_11(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_originalDynamicSite523_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_originalDynamicSite523_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5141_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_14(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b3c6b96dc50_invokedynamic688_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_00b8f74a97fb_invokedynamic831_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_00b8f74a97fb_invokedynamic831_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite524_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite524_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5140_0() throws E;
}
