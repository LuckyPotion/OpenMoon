package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class n4 extends moom.n2 {

private static org.apache.logging.log4j.Logger h;

private moom.DD i;

private java.util.List<java.lang.String> j;

private java.util.List<net.minecraft.item.EnumDyeColor> k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

public n4(moom.DD p0, java.util.List<java.lang.String> p1, java.util.List<net.minecraft.item.EnumDyeColor> p2) {
super();
    this.i = p0;
    this.j = p1;
    this.k = p2;
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-7008447466701783876L)), ((long)(2489962112883174541L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(193550031601880L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.n4.l ^ 54563562236143L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1416_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1416_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1416_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1416_14 = new byte[8];
    (__sourceSpill1416_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1416_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1416_16 = __sourceSpill1416_14;
    ((javax.crypto.Cipher)(__sourceSpill1416_11)).init(((int)(__sourceSpill1416_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1416_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1416_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "k\004\tËWBj\031§ÙºâÕdÿWÈ;­¯\b!+l¤ñä¼\025¡ý6v&ÔÀí·Yl±\003"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1416_25 = local6_life21;
        int __sourceSpill1416_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1416_25)).substring(((int)(__sourceSpill1416_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1416_30 = local8_life19;
        int __sourceSpill1416_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1416_33 = new byte[8];
        (__sourceSpill1416_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1416_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1416_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1416_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1416_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1416_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1416_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1416_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1416_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1416_34)).doFinal(((byte[])(__sourceSpill1416_33)));
        (__sourceSpill1416_30)[__sourceSpill1416_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "e¹?$ÛÁ\td\tß\f\007±L;+"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1416_38 = local6_life21;
        int __sourceSpill1416_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1416_38)).substring(((int)(__sourceSpill1416_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1416_43 = local8_life19;
        int __sourceSpill1416_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1416_46 = new byte[8];
        (__sourceSpill1416_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1416_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1416_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1416_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1416_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1416_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1416_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1416_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1416_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1416_47)).doFinal(((byte[])(__sourceSpill1416_46)));
        (__sourceSpill1416_43)[__sourceSpill1416_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[8]));
    h = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_5173ff2ec03b9f289d81(moom.n4 a0, moom.oR a1) throws E;
private static final class __SourceHandler_5173ff2ec03b9f289d81 {

public static void f423(moom.n4 receiver, moom.oR p0) throws Throwable {
    long life2_3;
    java.awt.image.BufferedImage life5_12;
    int life6_15;
    java.awt.image.BufferedImage life4_32;
    java.awt.Graphics life7_35;
    int life8_44;
    java.lang.String life9_73;
    moom.fm life10_80;
    java.io.InputStream life11_90;
    java.awt.image.BufferedImage life12_93;
    int life13_119;
    int life14_125;
    int life15_134;
    int life16_162;
    int life17_167;
    int life18_178;
    lexical_join_208: {
    lexical_join_203: {
    lexical_join_188: {
    lexical_join_24: {
    life2_3 = (__fieldRead423_0() ^ 86876982331743L);
    __call423_1(receiver);
    life5_12 = __call423_5(__call423_4(__call423_3(p0, __fieldRead423_2(receiver))));
    life6_15 = __call423_6(life5_12);
    if (!((life6_15 == 0))) {
        break lexical_join_24;
    }
    life6_15 = __invokedynamic423_7(14219, (3158456798381158570L ^ life2_3));
    }
    life4_32 = new java.awt.image.BufferedImage(__call423_8(life5_12), __call423_9(life5_12), life6_15);
    life7_35 = __call423_10(life4_32);
    __call423_11(life7_35, life5_12, 0, 0, null);
    life8_44 = 0;
    lexical_cycle_45: while (true) {
    lexical_join_186: {
    lexical_join_178: {
    if (!((life8_44 < __invokedynamic423_12(20975, (8165211807065003723L ^ life2_3))))) {
        break lexical_join_188;
    }
    if (!((life8_44 < __call423_14(__fieldRead423_13(receiver))))) {
        break lexical_join_188;
    }
    if (!((life8_44 < __call423_16(__fieldRead423_15(receiver))))) {
        break lexical_join_188;
    }
    life9_73 = __cast423_19(__call423_18(__fieldRead423_17(receiver), life8_44));
    life10_80 = __call423_23(__cast423_22(__call423_21(__fieldRead423_20(receiver), life8_44)));
    if (!((life9_73 != null))) {
        break lexical_join_186;
    }
    life11_90 = __call423_25(__call423_24(p0, new moom.DD(life9_73)));
    life12_93 = __call423_26(life11_90);
    if (!((__call423_27(life12_93) == __call423_28(life4_32)))) {
        break lexical_join_186;
    }
    if (!((__call423_29(life12_93) == __call423_30(life4_32)))) {
        break lexical_join_186;
    }
    if (!((__call423_31(life12_93) == __invokedynamic423_32(21458, (6798285792660608241L ^ life2_3))))) {
        break lexical_join_186;
    }
    life13_119 = 0;
    lexical_cycle_108: while (true) {
    lexical_join_176: {
    if (!((life13_119 < __call423_33(life12_93)))) {
        break lexical_join_178;
    }
    life14_125 = 0;
    lexical_cycle_114: while (true) {
    lexical_join_174: {
    if (!((life14_125 < __call423_34(life12_93)))) {
        break lexical_join_176;
    }
    life15_134 = __call423_35(life12_93, life14_125, life13_119);
    if (!(((life15_134 & __invokedynamic423_36(16706, (8967940167815218789L ^ life2_3))) != 0))) {
        break lexical_join_174;
    }
    life16_162 = (((life15_134 & __invokedynamic423_37(20105, (936587305241921967L ^ life2_3))) << __invokedynamic423_38(24839, (4711925540883981858L ^ life2_3))) & __invokedynamic423_39(31209, (3700271728229121737L ^ life2_3)));
    life17_167 = __call423_40(life5_12, life14_125, life13_119);
    life18_178 = (__call423_42(life17_167, __fieldRead423_41(life10_80)) & __invokedynamic423_43(15085, (7341225465484361167L ^ life2_3)));
    __call423_44(life12_93, life14_125, life13_119, (life16_162 | life18_178));
    }
    life14_125 += 1;
    continue lexical_cycle_114;
    }
    }
    life13_119 += 1;
    continue lexical_cycle_108;
    }
    }
    __call423_46(__call423_45(life4_32), life12_93, 0, 0, null);
    }
    life8_44 += 1;
    continue lexical_cycle_45;
    }
    }
    if (!(__call423_47())) {
        break lexical_join_203;
    }
    __call423_51(__call423_48(receiver), life4_32, 0, 0, p0, __fieldRead423_49(receiver), __call423_50(receiver));
    break lexical_join_208;
    }
    __call423_53(__call423_52(receiver), life4_32);
    }
    return;
}
public static void h423_0(java.io.IOException p0) throws Throwable {
    throw __call2042300_0(p0);
}
public static void h423_1(java.io.IOException p0) throws Throwable {
    throw __call2042301_0(p0);
}
public static void h423_2(java.io.IOException p0) throws Throwable {
    throw __call2042302_0(p0);
}
public static void h423_3(java.io.IOException p0) throws Throwable {
    throw __call2042303_0(p0);
}
public static void h423_4(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    __call2042304_1(__fieldRead2042304_0(), "Couldn't load layered image", local1);
    return;
}
public static void h423_5(java.io.IOException p0) throws Throwable {
    throw __call2042305_0(p0);
}
private static native long __fieldRead423_0() throws Throwable;
private static native void __call423_1(moom.n4 a0) throws Throwable;
private static native moom.DD __fieldRead423_2(moom.n4 a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call423_3(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call423_4(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call423_5(java.io.InputStream a0) throws Throwable;
private static native int __call423_6(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __invokedynamic423_7(int a0, long a1) throws Throwable;
private static native int __call423_8(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call423_9(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.awt.Graphics __call423_10(java.awt.image.BufferedImage a0) throws Throwable;
private static native boolean __call423_11(java.awt.Graphics a0, java.awt.image.BufferedImage a1, int a2, int a3, java.lang.Object a4) throws Throwable;
private static native int __invokedynamic423_12(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead423_13(moom.n4 a0) throws Throwable;
private static native int __call423_14(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead423_15(moom.n4 a0) throws Throwable;
private static native int __call423_16(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead423_17(moom.n4 a0) throws Throwable;
private static native java.lang.Object __call423_18(java.util.List a0, int a1) throws Throwable;
private static native java.lang.String __cast423_19(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead423_20(moom.n4 a0) throws Throwable;
private static native java.lang.Object __call423_21(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.item.EnumDyeColor __cast423_22(java.lang.Object a0) throws Throwable;
private static native moom.fm __call423_23(net.minecraft.item.EnumDyeColor a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call423_24(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call423_25(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call423_26(java.io.InputStream a0) throws Throwable;
private static native int __call423_27(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call423_28(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call423_29(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call423_30(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call423_31(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __invokedynamic423_32(int a0, long a1) throws Throwable;
private static native int __call423_33(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call423_34(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call423_35(java.awt.image.BufferedImage a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic423_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic423_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic423_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic423_39(int a0, long a1) throws Throwable;
private static native int __call423_40(java.awt.image.BufferedImage a0, int a1, int a2) throws Throwable;
private static native int __fieldRead423_41(moom.fm a0) throws Throwable;
private static native int __call423_42(int a0, int a1) throws Throwable;
private static native int __invokedynamic423_43(int a0, long a1) throws Throwable;
private static native void __call423_44(java.awt.image.BufferedImage a0, int a1, int a2, int a3) throws Throwable;
private static native java.awt.Graphics __call423_45(java.awt.image.BufferedImage a0) throws Throwable;
private static native boolean __call423_46(java.awt.Graphics a0, java.awt.image.BufferedImage a1, int a2, int a3, java.lang.Object a4) throws Throwable;
private static native boolean __call423_47() throws Throwable;
private static native int __call423_48(moom.n4 a0) throws Throwable;
private static native moom.DD __fieldRead423_49(moom.n4 a0) throws Throwable;
private static native moom.MA __call423_50(moom.n4 a0) throws Throwable;
private static native int __call423_51(int a0, java.awt.image.BufferedImage a1, int a2, int a3, moom.oR a4, moom.DD a5, moom.MA a6) throws Throwable;
private static native int __call423_52(moom.n4 a0) throws Throwable;
private static native int __call423_53(int a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native java.io.IOException __call2042300_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2042301_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2042302_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2042303_0(java.io.IOException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2042304_0() throws Throwable;
private static native void __call2042304_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native java.io.IOException __call2042305_0(java.io.IOException a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8476_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/n4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.n4.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10929;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/n4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public void a(moom.oR p0) throws java.io.IOException { __sourceHandlerCall_5173ff2ec03b9f289d81(this, p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8476_0() throws E;
}
