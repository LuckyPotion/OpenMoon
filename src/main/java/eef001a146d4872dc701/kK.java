package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class kK {

private static float a;

private static boolean b;

private static net.minecraft.util.EnumWorldBlockLayer[] c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

private static long[] h;

private static java.lang.Long[] i;

private static java.util.Map j;

public kK() {
super();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-3921668554309118067L)), ((long)(9103241842673363428L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(260022628418742L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.kK.d ^ 15820463436317L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill1055_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1055_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1055_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1055_14 = new byte[8];
    (__sourceSpill1055_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill1055_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation1055_16 = __sourceSpill1055_14;
    ((javax.crypto.Cipher)(__sourceSpill1055_11)).init(((int)(__sourceSpill1055_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1055_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1055_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[13];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "W¼J\006HùûKð±@\025;a#\tAÔU _]kZÊXÀ¼¸\177\007\036Ê÷£¢|\005gMm´\025q\020sìkÐ7Úéµ\"?\rÛ)×\r\037åvß¡÷\013írSSqJ\020±\rë\nñg"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1055_25 = local17_life21;
        int __sourceSpill1055_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1055_25)).substring(((int)(__sourceSpill1055_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1055_30 = local19_life19;
        int __sourceSpill1055_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill1055_33 = new byte[8];
        (__sourceSpill1055_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill1055_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill1055_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill1055_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill1055_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill1055_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill1055_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill1055_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill1055_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill1055_34)).doFinal(((byte[])(__sourceSpill1055_33)));
        (__sourceSpill1055_30)[__sourceSpill1055_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "î>\037aÿ.þ}qÛf¬ÎÆAë"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1055_38 = local17_life21;
        int __sourceSpill1055_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1055_38)).substring(((int)(__sourceSpill1055_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1055_43 = local19_life19;
        int __sourceSpill1055_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill1055_46 = new byte[8];
        (__sourceSpill1055_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill1055_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill1055_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill1055_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill1055_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill1055_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill1055_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill1055_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill1055_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill1055_47)).doFinal(((byte[])(__sourceSpill1055_46)));
        (__sourceSpill1055_43)[__sourceSpill1055_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    e = ((long[])(local19_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[13]));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill1055_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1055_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1055_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1055_59 = new byte[8];
    (__sourceSpill1055_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill1055_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation1055_61 = __sourceSpill1055_59;
    ((javax.crypto.Cipher)(__sourceSpill1055_56)).init(((int)(__sourceSpill1055_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1055_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1055_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[6];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "td=ÿ\036í bXõ6$-\035\f9\006®.áÛÇ9ÛTbä\n"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1055_70 = local4_life66;
        int __sourceSpill1055_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1055_70)).substring(((int)(__sourceSpill1055_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1055_75 = local6_life64;
        int __sourceSpill1055_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill1055_78 = new byte[8];
        (__sourceSpill1055_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill1055_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill1055_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill1055_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill1055_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill1055_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill1055_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill1055_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill1055_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1055_79)).doFinal(((byte[])(__sourceSpill1055_78)));
        (__sourceSpill1055_75)[__sourceSpill1055_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    local5_life68 = ((java.lang.String)((local4_life66 = "¤Ebú|\002QJ¢S+!r<"))).length();
    local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1055_83 = local4_life66;
        int __sourceSpill1055_84 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill1055_83)).substring(((int)(__sourceSpill1055_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1055_88 = local6_life64;
        int __sourceSpill1055_89 = local3_life65;
        local3_life65 += 1;
        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));
        byte[] __sourceSpill1055_91 = new byte[8];
        (__sourceSpill1055_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));
        (__sourceSpill1055_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));
        (__sourceSpill1055_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));
        (__sourceSpill1055_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));
        (__sourceSpill1055_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));
        (__sourceSpill1055_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));
        (__sourceSpill1055_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));
        (__sourceSpill1055_91)[7] = ((byte) ((int) local8_life90));
        javax.crypto.Cipher __sourceSpill1055_92 = local0_life54;
        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill1055_92)).doFinal(((byte[])(__sourceSpill1055_91)));
        (__sourceSpill1055_88)[__sourceSpill1055_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    h = ((long[])(local6_life64));
    i = ((java.lang.Long[])(new java.lang.Long[6]));
    a = ((float)(0x1.99999ap-3f));
    b = ((boolean)(false));
    net.minecraft.util.EnumWorldBlockLayer[] __sourceSpill1055_100 = new net.minecraft.util.EnumWorldBlockLayer[3];
    (__sourceSpill1055_100)[0] = net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
    (__sourceSpill1055_100)[1] = net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED;
    (__sourceSpill1055_100)[2] = net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT;
    c = ((net.minecraft.util.EnumWorldBlockLayer[])(__sourceSpill1055_100));
}

private static native <E extends Throwable> void __sourceHandlerCall_3ba97a5b2d751276f38d() throws E;
private static final class __SourceHandler_3ba97a5b2d751276f38d {

public static void f1070() throws Throwable {
    int forwardValue1070_13_0;
    forward_join_13: {
    forward_join_12: {
    __fieldWrite1070_1((0x1.0p0f - (__call1070_0() * 0x1.99999ap-1f)));
    if (!(__call1070_2())) {
        break forward_join_12;
    }
    if (!(__call1070_3())) {
        break forward_join_12;
    }
    forwardValue1070_13_0 = 1;
    break forward_join_13;
    }
    forwardValue1070_13_0 = 0;
    }
    __fieldWrite1070_4(forwardValue1070_13_0);
    return;
}
public static void h1070_0(moom.Oo p0) throws Throwable {
    throw __call1107000_0(p0);
}
public static void h1070_1(moom.Oo p0) throws Throwable {
    throw __call1107001_0(p0);
}
private static native float __call1070_0() throws Throwable;
private static native void __fieldWrite1070_1(float a0) throws Throwable;
private static native boolean __call1070_2() throws Throwable;
private static native boolean __call1070_3() throws Throwable;
private static native void __fieldWrite1070_4(int a0) throws Throwable;
private static native java.lang.Throwable __call1107000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1107001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_ede0d6c759d7d1602f73(float a0) throws E;
private static final class __SourceHandler_ede0d6c759d7d1602f73 {

public static float f1826(float p0) throws Throwable {
    return ((p0 == 0x1.99999ap-3f) ? __fieldRead1826_0() : p0);
}
public static void h1826_0(moom.Oo p0) throws Throwable {
    throw __call1182600_0(p0);
}
private static native float __fieldRead1826_0() throws Throwable;
private static native java.lang.Throwable __call1182600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_07c7548493d0ddb3ad14(moom.kK a0, float a1, float a2, float a3, float a4, java.util.List a5) throws E;
private static final class __SourceHandler_07c7548493d0ddb3ad14 {

public static void f1827(moom.kK receiver, float p0, float p1, float p2, float p3, java.util.List p4) throws Throwable {
    long life6_3;
    net.minecraft.client.renderer.Tessellator life8_5;
    moom.lw life9_8;
    java.util.Iterator life10_11;
    moom.lC life11_18;
    moom.DS life12_60;
    life6_3 = (__fieldRead1827_0() ^ 62101675651021L);
    life8_5 = __call1827_1();
    life9_8 = __call1827_2(life8_5);
    life10_11 = __call1827_3(p4);
    loop_region_12: while (__call1827_4(life10_11)) {
        life11_18 = __cast1827_6(__call1827_5(life10_11));
        __call1827_9(life9_8, __invokedynamic1827_7(17433, (3340689257357765759L ^ life6_3)), __fieldRead1827_8());
        __call1827_11(life9_8, __call1827_10(life11_18));
        __call1827_13(life9_8, __call1827_12(life11_18));
        if (__call1827_14(life11_18)) {
        __call1827_15(life9_8, (p1 * p0), (p2 * p0), (p3 * p0));
    } else {
        __call1827_16(life9_8, p0, p0, p0);
    }
        life12_60 = __call1827_18(__call1827_17(life11_18));
        __call1827_22(life9_8, ((float) __call1827_19(life12_60)), ((float) __call1827_20(life12_60)), ((float) __call1827_21(life12_60)));
        __call1827_23(life8_5);
    }
    return;
}
public static void h1827_0(moom.Oo p0) throws Throwable {
    throw __call1182700_0(p0);
}
private static native long __fieldRead1827_0() throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call1827_1() throws Throwable;
private static native moom.lw __call1827_2(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native java.util.Iterator __call1827_3(java.util.List a0) throws Throwable;
private static native boolean __call1827_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1827_5(java.util.Iterator a0) throws Throwable;
private static native moom.lC __cast1827_6(java.lang.Object a0) throws Throwable;
private static native int __invokedynamic1827_7(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead1827_8() throws Throwable;
private static native void __call1827_9(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native int[] __call1827_10(moom.lC a0) throws Throwable;
private static native void __call1827_11(moom.lw a0, int[] a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call1827_12(moom.lC a0) throws Throwable;
private static native void __call1827_13(moom.lw a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native boolean __call1827_14(moom.lC a0) throws Throwable;
private static native void __call1827_15(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call1827_16(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native moom.bs __call1827_17(moom.lC a0) throws Throwable;
private static native moom.DS __call1827_18(moom.bs a0) throws Throwable;
private static native int __call1827_19(moom.DS a0) throws Throwable;
private static native int __call1827_20(moom.DS a0) throws Throwable;
private static native int __call1827_21(moom.DS a0) throws Throwable;
private static native void __call1827_22(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call1827_23(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native java.lang.Throwable __call1182700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fe33db347f419380baf7(moom.kK a0, net.minecraft.block.Block a1, int[] a2, moom.bs a3, float[] a4, java.util.BitSet a5) throws E;
private static final class __SourceHandler_fe33db347f419380baf7 {

public static void f870(moom.kK receiver, net.minecraft.block.Block p0, int[] p1, moom.bs p2, float[] p3, java.util.BitSet p4) throws Throwable {
    java.util.BitSet forestValue870_189_0;
    int forestValue870_189_1;
    java.util.BitSet forestValue870_191_0;
    int forestValue870_191_1;
    java.util.BitSet forestValue870_192_0;
    int forestValue870_192_1;
    int forestValue870_192_2;
    java.util.BitSet forestValue870_202_0;
    int forestValue870_202_1;
    java.util.BitSet forestValue870_208_0;
    int forestValue870_208_1;
    java.util.BitSet forestValue870_209_0;
    int forestValue870_209_1;
    int forestValue870_209_2;
    java.util.BitSet forestValue870_229_0;
    int forestValue870_229_1;
    java.util.BitSet forestValue870_231_0;
    int forestValue870_231_1;
    java.util.BitSet forestValue870_232_0;
    int forestValue870_232_1;
    int forestValue870_232_2;
    java.util.BitSet forestValue870_242_0;
    int forestValue870_242_1;
    java.util.BitSet forestValue870_248_0;
    int forestValue870_248_1;
    java.util.BitSet forestValue870_249_0;
    int forestValue870_249_1;
    int forestValue870_249_2;
    java.util.BitSet forestValue870_269_0;
    int forestValue870_269_1;
    java.util.BitSet forestValue870_271_0;
    int forestValue870_271_1;
    java.util.BitSet forestValue870_272_0;
    int forestValue870_272_1;
    int forestValue870_272_2;
    java.util.BitSet forestValue870_282_0;
    int forestValue870_282_1;
    java.util.BitSet forestValue870_288_0;
    int forestValue870_288_1;
    java.util.BitSet forestValue870_289_0;
    int forestValue870_289_1;
    int forestValue870_289_2;
    java.util.BitSet forestValue870_309_0;
    int forestValue870_309_1;
    java.util.BitSet forestValue870_311_0;
    int forestValue870_311_1;
    java.util.BitSet forestValue870_312_0;
    int forestValue870_312_1;
    int forestValue870_312_2;
    java.util.BitSet forestValue870_322_0;
    int forestValue870_322_1;
    java.util.BitSet forestValue870_328_0;
    int forestValue870_328_1;
    java.util.BitSet forestValue870_329_0;
    int forestValue870_329_1;
    int forestValue870_329_2;
    java.util.BitSet forestValue870_349_0;
    int forestValue870_349_1;
    java.util.BitSet forestValue870_351_0;
    int forestValue870_351_1;
    java.util.BitSet forestValue870_352_0;
    int forestValue870_352_1;
    int forestValue870_352_2;
    java.util.BitSet forestValue870_362_0;
    int forestValue870_362_1;
    java.util.BitSet forestValue870_368_0;
    int forestValue870_368_1;
    java.util.BitSet forestValue870_369_0;
    int forestValue870_369_1;
    int forestValue870_369_2;
    java.util.BitSet forestValue870_389_0;
    int forestValue870_389_1;
    java.util.BitSet forestValue870_391_0;
    int forestValue870_391_1;
    java.util.BitSet forestValue870_392_0;
    int forestValue870_392_1;
    int forestValue870_392_2;
    java.util.BitSet forestValue870_402_0;
    int forestValue870_402_1;
    java.util.BitSet forestValue870_408_0;
    int forestValue870_408_1;
    java.util.BitSet forestValue870_409_0;
    int forestValue870_409_1;
    int forestValue870_409_2;
    java.util.BitSet spill870_0;
    int spill870_1;
    java.util.BitSet spill870_2;
    int spill870_3;
    java.util.BitSet spill870_4;
    int spill870_5;
    java.util.BitSet spill870_6;
    int spill870_7;
    java.util.BitSet spill870_8;
    int spill870_9;
    java.util.BitSet spill870_10;
    int spill870_11;
    java.util.BitSet spill870_12;
    int spill870_13;
    java.util.BitSet spill870_14;
    int spill870_15;
    java.util.BitSet spill870_16;
    int spill870_17;
    java.util.BitSet spill870_18;
    int spill870_19;
    java.util.BitSet spill870_20;
    int spill870_21;
    java.util.BitSet spill870_22;
    int spill870_23;
    float life6_1;
    float life7_3;
    float life8_5;
    float life9_7;
    float life10_9;
    float life11_11;
    int life12_16;
    int life13_18;
    float life14_28;
    float life15_37;
    float life16_46;
    int life13_107;
    float life13_163;
    float life14_165;
    forest_join_410: {
    forest_join_409: {
    forest_join_408: {
    forest_join_402: {
    forest_join_392: {
    forest_join_391: {
    forest_join_389: {
    forest_join_371: {
    forest_join_369: {
    forest_join_368: {
    forest_join_362: {
    forest_join_352: {
    forest_join_351: {
    forest_join_349: {
    forest_join_331: {
    forest_join_329: {
    forest_join_328: {
    forest_join_322: {
    forest_join_312: {
    forest_join_311: {
    forest_join_309: {
    forest_join_291: {
    forest_join_289: {
    forest_join_288: {
    forest_join_282: {
    forest_join_272: {
    forest_join_271: {
    forest_join_269: {
    forest_join_251: {
    forest_join_249: {
    forest_join_248: {
    forest_join_242: {
    forest_join_232: {
    forest_join_231: {
    forest_join_229: {
    forest_join_211: {
    forest_join_209: {
    forest_join_208: {
    forest_join_202: {
    forest_join_192: {
    forest_join_191: {
    forest_join_189: {
    forest_join_171: {
    forest_join_162: {
    forest_join_73: {
    life6_1 = 0x1.0p5f;
    life7_3 = 0x1.0p5f;
    life8_5 = 0x1.0p5f;
    life9_7 = -0x1.0p5f;
    life10_9 = -0x1.0p5f;
    life11_11 = -0x1.0p5f;
    life12_16 = ((p1).length / 4);
    life13_18 = 0;
    forest_cycle_19: while (true) {
    if (!((life13_18 < 4))) {
        break forest_join_73;
    }
    life14_28 = __call870_0((p1)[(life13_18 * life12_16)]);
    life15_37 = __call870_1((p1)[((life13_18 * life12_16) + 1)]);
    life16_46 = __call870_2((p1)[((life13_18 * life12_16) + 2)]);
    life6_1 = __call870_3(life6_1, life14_28);
    life7_3 = __call870_4(life7_3, life15_37);
    life8_5 = __call870_5(life8_5, life16_46);
    life9_7 = __call870_6(life9_7, life14_28);
    life10_9 = __call870_7(life10_9, life15_37);
    life11_11 = __call870_8(life11_11, life16_46);
    life13_18 += 1;
    continue forest_cycle_19;
    }
    }
    if (!((p3 != null))) {
        break forest_join_162;
    }
    (p3)[__call870_10(__fieldRead870_9())] = life6_1;
    (p3)[__call870_12(__fieldRead870_11())] = life9_7;
    (p3)[__call870_14(__fieldRead870_13())] = life7_3;
    (p3)[__call870_16(__fieldRead870_15())] = life10_9;
    (p3)[__call870_18(__fieldRead870_17())] = life8_5;
    (p3)[__call870_20(__fieldRead870_19())] = life11_11;
    life13_107 = (__fieldRead870_21()).length;
    (p3)[(__call870_23(__fieldRead870_22()) + life13_107)] = (0x1.0p0f - life6_1);
    (p3)[(__call870_25(__fieldRead870_24()) + life13_107)] = (0x1.0p0f - life9_7);
    (p3)[(__call870_27(__fieldRead870_26()) + life13_107)] = (0x1.0p0f - life7_3);
    (p3)[(__call870_29(__fieldRead870_28()) + life13_107)] = (0x1.0p0f - life10_9);
    (p3)[(__call870_31(__fieldRead870_30()) + life13_107)] = (0x1.0p0f - life8_5);
    (p3)[(__call870_33(__fieldRead870_32()) + life13_107)] = (0x1.0p0f - life11_11);
    }
    life13_163 = 0x1.a36e2ep-14f;
    life14_165 = 0x1.fff2e4p-1f;
    switch ((__fieldRead870_34())[__call870_35(p2)]) {
case 1:
{
        break forest_join_171;
    }
case 2:
{
        break forest_join_211;
    }
case 3:
{
        break forest_join_251;
    }
case 4:
{
        break forest_join_291;
    }
case 5:
{
        break forest_join_331;
    }
case 6:
{
        break forest_join_371;
    }
default:
{
        break forest_join_410;
    }
}
    }
    spill870_0 = p4;
    spill870_1 = 1;
    if (!((__numericCompare870_36(life6_1, 0x1.a36e2ep-14f) < 0))) {
        forestValue870_189_0 = spill870_0;
        forestValue870_189_1 = spill870_1;
        break forest_join_189;
    }
    if (!((__numericCompare870_37(life8_5, 0x1.a36e2ep-14f) < 0))) {
        forestValue870_189_0 = spill870_0;
        forestValue870_189_1 = spill870_1;
        break forest_join_189;
    }
    if (!((__numericCompare870_38(life9_7, 0x1.fff2e4p-1f) > 0))) {
        forestValue870_189_0 = spill870_0;
        forestValue870_189_1 = spill870_1;
        break forest_join_189;
    }
    if (!((__numericCompare870_39(life11_11, 0x1.fff2e4p-1f) <= 0))) {
        forestValue870_191_0 = spill870_0;
        forestValue870_191_1 = spill870_1;
        break forest_join_191;
    }
    forestValue870_189_0 = spill870_0;
    forestValue870_189_1 = spill870_1;
    }
    forestValue870_192_0 = forestValue870_189_0;
    forestValue870_192_1 = forestValue870_189_1;
    forestValue870_192_2 = 1;
    break forest_join_192;
    }
    forestValue870_192_0 = forestValue870_191_0;
    forestValue870_192_1 = forestValue870_191_1;
    forestValue870_192_2 = 0;
    }
    __call870_40(forestValue870_192_0, forestValue870_192_1, forestValue870_192_2);
    spill870_2 = p4;
    spill870_3 = 0;
    if (!((__numericCompare870_41(life7_3, 0x1.a36e2ep-14f) >= 0))) {
        forestValue870_202_0 = spill870_2;
        forestValue870_202_1 = spill870_3;
        break forest_join_202;
    }
    if (!(__call870_42(p0))) {
        forestValue870_208_0 = spill870_2;
        forestValue870_208_1 = spill870_3;
        break forest_join_208;
    }
    forestValue870_202_0 = spill870_2;
    forestValue870_202_1 = spill870_3;
    }
    if (!((__numericCompare870_43(life7_3, life10_9) == 0))) {
        forestValue870_208_0 = forestValue870_202_0;
        forestValue870_208_1 = forestValue870_202_1;
        break forest_join_208;
    }
    forestValue870_209_0 = forestValue870_202_0;
    forestValue870_209_1 = forestValue870_202_1;
    forestValue870_209_2 = 1;
    break forest_join_209;
    }
    forestValue870_209_0 = forestValue870_208_0;
    forestValue870_209_1 = forestValue870_208_1;
    forestValue870_209_2 = 0;
    }
    __call870_44(forestValue870_209_0, forestValue870_209_1, forestValue870_209_2);
    break forest_join_410;
    }
    spill870_4 = p4;
    spill870_5 = 1;
    if (!((__numericCompare870_45(life6_1, 0x1.a36e2ep-14f) < 0))) {
        forestValue870_229_0 = spill870_4;
        forestValue870_229_1 = spill870_5;
        break forest_join_229;
    }
    if (!((__numericCompare870_46(life8_5, 0x1.a36e2ep-14f) < 0))) {
        forestValue870_229_0 = spill870_4;
        forestValue870_229_1 = spill870_5;
        break forest_join_229;
    }
    if (!((__numericCompare870_47(life9_7, 0x1.fff2e4p-1f) > 0))) {
        forestValue870_229_0 = spill870_4;
        forestValue870_229_1 = spill870_5;
        break forest_join_229;
    }
    if (!((__numericCompare870_48(life11_11, 0x1.fff2e4p-1f) <= 0))) {
        forestValue870_231_0 = spill870_4;
        forestValue870_231_1 = spill870_5;
        break forest_join_231;
    }
    forestValue870_229_0 = spill870_4;
    forestValue870_229_1 = spill870_5;
    }
    forestValue870_232_0 = forestValue870_229_0;
    forestValue870_232_1 = forestValue870_229_1;
    forestValue870_232_2 = 1;
    break forest_join_232;
    }
    forestValue870_232_0 = forestValue870_231_0;
    forestValue870_232_1 = forestValue870_231_1;
    forestValue870_232_2 = 0;
    }
    __call870_49(forestValue870_232_0, forestValue870_232_1, forestValue870_232_2);
    spill870_6 = p4;
    spill870_7 = 0;
    if (!((__numericCompare870_50(life10_9, 0x1.fff2e4p-1f) <= 0))) {
        forestValue870_242_0 = spill870_6;
        forestValue870_242_1 = spill870_7;
        break forest_join_242;
    }
    if (!(__call870_51(p0))) {
        forestValue870_248_0 = spill870_6;
        forestValue870_248_1 = spill870_7;
        break forest_join_248;
    }
    forestValue870_242_0 = spill870_6;
    forestValue870_242_1 = spill870_7;
    }
    if (!((__numericCompare870_52(life7_3, life10_9) == 0))) {
        forestValue870_248_0 = forestValue870_242_0;
        forestValue870_248_1 = forestValue870_242_1;
        break forest_join_248;
    }
    forestValue870_249_0 = forestValue870_242_0;
    forestValue870_249_1 = forestValue870_242_1;
    forestValue870_249_2 = 1;
    break forest_join_249;
    }
    forestValue870_249_0 = forestValue870_248_0;
    forestValue870_249_1 = forestValue870_248_1;
    forestValue870_249_2 = 0;
    }
    __call870_53(forestValue870_249_0, forestValue870_249_1, forestValue870_249_2);
    break forest_join_410;
    }
    spill870_8 = p4;
    spill870_9 = 1;
    if (!((__numericCompare870_54(life6_1, 0x1.a36e2ep-14f) < 0))) {
        forestValue870_269_0 = spill870_8;
        forestValue870_269_1 = spill870_9;
        break forest_join_269;
    }
    if (!((__numericCompare870_55(life7_3, 0x1.a36e2ep-14f) < 0))) {
        forestValue870_269_0 = spill870_8;
        forestValue870_269_1 = spill870_9;
        break forest_join_269;
    }
    if (!((__numericCompare870_56(life9_7, 0x1.fff2e4p-1f) > 0))) {
        forestValue870_269_0 = spill870_8;
        forestValue870_269_1 = spill870_9;
        break forest_join_269;
    }
    if (!((__numericCompare870_57(life10_9, 0x1.fff2e4p-1f) <= 0))) {
        forestValue870_271_0 = spill870_8;
        forestValue870_271_1 = spill870_9;
        break forest_join_271;
    }
    forestValue870_269_0 = spill870_8;
    forestValue870_269_1 = spill870_9;
    }
    forestValue870_272_0 = forestValue870_269_0;
    forestValue870_272_1 = forestValue870_269_1;
    forestValue870_272_2 = 1;
    break forest_join_272;
    }
    forestValue870_272_0 = forestValue870_271_0;
    forestValue870_272_1 = forestValue870_271_1;
    forestValue870_272_2 = 0;
    }
    __call870_58(forestValue870_272_0, forestValue870_272_1, forestValue870_272_2);
    spill870_10 = p4;
    spill870_11 = 0;
    if (!((__numericCompare870_59(life8_5, 0x1.a36e2ep-14f) >= 0))) {
        forestValue870_282_0 = spill870_10;
        forestValue870_282_1 = spill870_11;
        break forest_join_282;
    }
    if (!(__call870_60(p0))) {
        forestValue870_288_0 = spill870_10;
        forestValue870_288_1 = spill870_11;
        break forest_join_288;
    }
    forestValue870_282_0 = spill870_10;
    forestValue870_282_1 = spill870_11;
    }
    if (!((__numericCompare870_61(life8_5, life11_11) == 0))) {
        forestValue870_288_0 = forestValue870_282_0;
        forestValue870_288_1 = forestValue870_282_1;
        break forest_join_288;
    }
    forestValue870_289_0 = forestValue870_282_0;
    forestValue870_289_1 = forestValue870_282_1;
    forestValue870_289_2 = 1;
    break forest_join_289;
    }
    forestValue870_289_0 = forestValue870_288_0;
    forestValue870_289_1 = forestValue870_288_1;
    forestValue870_289_2 = 0;
    }
    __call870_62(forestValue870_289_0, forestValue870_289_1, forestValue870_289_2);
    break forest_join_410;
    }
    spill870_12 = p4;
    spill870_13 = 1;
    if (!((__numericCompare870_63(life6_1, 0x1.a36e2ep-14f) < 0))) {
        forestValue870_309_0 = spill870_12;
        forestValue870_309_1 = spill870_13;
        break forest_join_309;
    }
    if (!((__numericCompare870_64(life7_3, 0x1.a36e2ep-14f) < 0))) {
        forestValue870_309_0 = spill870_12;
        forestValue870_309_1 = spill870_13;
        break forest_join_309;
    }
    if (!((__numericCompare870_65(life9_7, 0x1.fff2e4p-1f) > 0))) {
        forestValue870_309_0 = spill870_12;
        forestValue870_309_1 = spill870_13;
        break forest_join_309;
    }
    if (!((__numericCompare870_66(life10_9, 0x1.fff2e4p-1f) <= 0))) {
        forestValue870_311_0 = spill870_12;
        forestValue870_311_1 = spill870_13;
        break forest_join_311;
    }
    forestValue870_309_0 = spill870_12;
    forestValue870_309_1 = spill870_13;
    }
    forestValue870_312_0 = forestValue870_309_0;
    forestValue870_312_1 = forestValue870_309_1;
    forestValue870_312_2 = 1;
    break forest_join_312;
    }
    forestValue870_312_0 = forestValue870_311_0;
    forestValue870_312_1 = forestValue870_311_1;
    forestValue870_312_2 = 0;
    }
    __call870_67(forestValue870_312_0, forestValue870_312_1, forestValue870_312_2);
    spill870_14 = p4;
    spill870_15 = 0;
    if (!((__numericCompare870_68(life11_11, 0x1.fff2e4p-1f) <= 0))) {
        forestValue870_322_0 = spill870_14;
        forestValue870_322_1 = spill870_15;
        break forest_join_322;
    }
    if (!(__call870_69(p0))) {
        forestValue870_328_0 = spill870_14;
        forestValue870_328_1 = spill870_15;
        break forest_join_328;
    }
    forestValue870_322_0 = spill870_14;
    forestValue870_322_1 = spill870_15;
    }
    if (!((__numericCompare870_70(life8_5, life11_11) == 0))) {
        forestValue870_328_0 = forestValue870_322_0;
        forestValue870_328_1 = forestValue870_322_1;
        break forest_join_328;
    }
    forestValue870_329_0 = forestValue870_322_0;
    forestValue870_329_1 = forestValue870_322_1;
    forestValue870_329_2 = 1;
    break forest_join_329;
    }
    forestValue870_329_0 = forestValue870_328_0;
    forestValue870_329_1 = forestValue870_328_1;
    forestValue870_329_2 = 0;
    }
    __call870_71(forestValue870_329_0, forestValue870_329_1, forestValue870_329_2);
    break forest_join_410;
    }
    spill870_16 = p4;
    spill870_17 = 1;
    if (!((__numericCompare870_72(life7_3, 0x1.a36e2ep-14f) < 0))) {
        forestValue870_349_0 = spill870_16;
        forestValue870_349_1 = spill870_17;
        break forest_join_349;
    }
    if (!((__numericCompare870_73(life8_5, 0x1.a36e2ep-14f) < 0))) {
        forestValue870_349_0 = spill870_16;
        forestValue870_349_1 = spill870_17;
        break forest_join_349;
    }
    if (!((__numericCompare870_74(life10_9, 0x1.fff2e4p-1f) > 0))) {
        forestValue870_349_0 = spill870_16;
        forestValue870_349_1 = spill870_17;
        break forest_join_349;
    }
    if (!((__numericCompare870_75(life11_11, 0x1.fff2e4p-1f) <= 0))) {
        forestValue870_351_0 = spill870_16;
        forestValue870_351_1 = spill870_17;
        break forest_join_351;
    }
    forestValue870_349_0 = spill870_16;
    forestValue870_349_1 = spill870_17;
    }
    forestValue870_352_0 = forestValue870_349_0;
    forestValue870_352_1 = forestValue870_349_1;
    forestValue870_352_2 = 1;
    break forest_join_352;
    }
    forestValue870_352_0 = forestValue870_351_0;
    forestValue870_352_1 = forestValue870_351_1;
    forestValue870_352_2 = 0;
    }
    __call870_76(forestValue870_352_0, forestValue870_352_1, forestValue870_352_2);
    spill870_18 = p4;
    spill870_19 = 0;
    if (!((__numericCompare870_77(life6_1, 0x1.a36e2ep-14f) >= 0))) {
        forestValue870_362_0 = spill870_18;
        forestValue870_362_1 = spill870_19;
        break forest_join_362;
    }
    if (!(__call870_78(p0))) {
        forestValue870_368_0 = spill870_18;
        forestValue870_368_1 = spill870_19;
        break forest_join_368;
    }
    forestValue870_362_0 = spill870_18;
    forestValue870_362_1 = spill870_19;
    }
    if (!((__numericCompare870_79(life6_1, life9_7) == 0))) {
        forestValue870_368_0 = forestValue870_362_0;
        forestValue870_368_1 = forestValue870_362_1;
        break forest_join_368;
    }
    forestValue870_369_0 = forestValue870_362_0;
    forestValue870_369_1 = forestValue870_362_1;
    forestValue870_369_2 = 1;
    break forest_join_369;
    }
    forestValue870_369_0 = forestValue870_368_0;
    forestValue870_369_1 = forestValue870_368_1;
    forestValue870_369_2 = 0;
    }
    __call870_80(forestValue870_369_0, forestValue870_369_1, forestValue870_369_2);
    break forest_join_410;
    }
    spill870_20 = p4;
    spill870_21 = 1;
    if (!((__numericCompare870_81(life7_3, 0x1.a36e2ep-14f) < 0))) {
        forestValue870_389_0 = spill870_20;
        forestValue870_389_1 = spill870_21;
        break forest_join_389;
    }
    if (!((__numericCompare870_82(life8_5, 0x1.a36e2ep-14f) < 0))) {
        forestValue870_389_0 = spill870_20;
        forestValue870_389_1 = spill870_21;
        break forest_join_389;
    }
    if (!((__numericCompare870_83(life10_9, 0x1.fff2e4p-1f) > 0))) {
        forestValue870_389_0 = spill870_20;
        forestValue870_389_1 = spill870_21;
        break forest_join_389;
    }
    if (!((__numericCompare870_84(life11_11, 0x1.fff2e4p-1f) <= 0))) {
        forestValue870_391_0 = spill870_20;
        forestValue870_391_1 = spill870_21;
        break forest_join_391;
    }
    forestValue870_389_0 = spill870_20;
    forestValue870_389_1 = spill870_21;
    }
    forestValue870_392_0 = forestValue870_389_0;
    forestValue870_392_1 = forestValue870_389_1;
    forestValue870_392_2 = 1;
    break forest_join_392;
    }
    forestValue870_392_0 = forestValue870_391_0;
    forestValue870_392_1 = forestValue870_391_1;
    forestValue870_392_2 = 0;
    }
    __call870_85(forestValue870_392_0, forestValue870_392_1, forestValue870_392_2);
    spill870_22 = p4;
    spill870_23 = 0;
    if (!((__numericCompare870_86(life9_7, 0x1.fff2e4p-1f) <= 0))) {
        forestValue870_402_0 = spill870_22;
        forestValue870_402_1 = spill870_23;
        break forest_join_402;
    }
    if (!(__call870_87(p0))) {
        forestValue870_408_0 = spill870_22;
        forestValue870_408_1 = spill870_23;
        break forest_join_408;
    }
    forestValue870_402_0 = spill870_22;
    forestValue870_402_1 = spill870_23;
    }
    if (!((__numericCompare870_88(life6_1, life9_7) == 0))) {
        forestValue870_408_0 = forestValue870_402_0;
        forestValue870_408_1 = forestValue870_402_1;
        break forest_join_408;
    }
    forestValue870_409_0 = forestValue870_402_0;
    forestValue870_409_1 = forestValue870_402_1;
    forestValue870_409_2 = 1;
    break forest_join_409;
    }
    forestValue870_409_0 = forestValue870_408_0;
    forestValue870_409_1 = forestValue870_408_1;
    forestValue870_409_2 = 0;
    }
    __call870_89(forestValue870_409_0, forestValue870_409_1, forestValue870_409_2);
    }
    return;
}
public static void h870_0(moom.Oo p0) throws Throwable {
    throw __call3087000_0(p0);
}
public static void h870_1(moom.Oo p0) throws Throwable {
    throw __call3087001_0(p0);
}
public static void h870_2(moom.Oo p0) throws Throwable {
    throw __call3087002_0(p0);
}
public static void h870_3(moom.Oo p0) throws Throwable {
    throw __call3087003_0(p0);
}
public static void h870_4(moom.Oo p0) throws Throwable {
    throw __call3087004_0(p0);
}
public static void h870_5(moom.Oo p0) throws Throwable {
    throw __call3087005_0(p0);
}
public static void h870_6(moom.Oo p0) throws Throwable {
    throw __call3087006_0(p0);
}
public static void h870_7(moom.Oo p0) throws Throwable {
    throw __call3087007_0(p0);
}
public static void h870_8(moom.Oo p0) throws Throwable {
    throw __call3087008_0(p0);
}
public static void h870_9(moom.Oo p0) throws Throwable {
    throw __call3087009_0(p0);
}
public static void h870_10(moom.Oo p0) throws Throwable {
    throw __call3087010_0(p0);
}
public static void h870_11(moom.Oo p0) throws Throwable {
    throw __call3087011_0(p0);
}
public static void h870_12(moom.Oo p0) throws Throwable {
    throw __call3087012_0(p0);
}
public static void h870_13(moom.Oo p0) throws Throwable {
    throw __call3087013_0(p0);
}
public static void h870_14(moom.Oo p0) throws Throwable {
    throw __call3087014_0(p0);
}
public static void h870_15(moom.Oo p0) throws Throwable {
    throw __call3087015_0(p0);
}
public static void h870_16(moom.Oo p0) throws Throwable {
    throw __call3087016_0(p0);
}
public static void h870_17(moom.Oo p0) throws Throwable {
    throw __call3087017_0(p0);
}
public static void h870_18(moom.Oo p0) throws Throwable {
    throw __call3087018_0(p0);
}
public static void h870_19(moom.Oo p0) throws Throwable {
    throw __call3087019_0(p0);
}
public static void h870_20(moom.Oo p0) throws Throwable {
    throw __call3087020_0(p0);
}
public static void h870_21(moom.Oo p0) throws Throwable {
    throw __call3087021_0(p0);
}
public static void h870_22(moom.Oo p0) throws Throwable {
    throw __call3087022_0(p0);
}
public static void h870_23(moom.Oo p0) throws Throwable {
    throw __call3087023_0(p0);
}
public static void h870_24(moom.Oo p0) throws Throwable {
    throw __call3087024_0(p0);
}
public static void h870_25(moom.Oo p0) throws Throwable {
    throw __call3087025_0(p0);
}
public static void h870_26(moom.Oo p0) throws Throwable {
    throw __call3087026_0(p0);
}
public static void h870_27(moom.Oo p0) throws Throwable {
    throw __call3087027_0(p0);
}
public static void h870_28(moom.Oo p0) throws Throwable {
    throw __call3087028_0(p0);
}
public static void h870_29(moom.Oo p0) throws Throwable {
    throw __call3087029_0(p0);
}
public static void h870_30(moom.Oo p0) throws Throwable {
    throw __call3087030_0(p0);
}
public static void h870_31(moom.Oo p0) throws Throwable {
    throw __call3087031_0(p0);
}
public static void h870_32(moom.Oo p0) throws Throwable {
    throw __call3087032_0(p0);
}
public static void h870_33(moom.Oo p0) throws Throwable {
    throw __call3087033_0(p0);
}
public static void h870_34(moom.Oo p0) throws Throwable {
    throw __call3087034_0(p0);
}
public static void h870_35(moom.Oo p0) throws Throwable {
    throw __call3087035_0(p0);
}
public static void h870_36(moom.Oo p0) throws Throwable {
    throw __call3087036_0(p0);
}
public static void h870_37(moom.Oo p0) throws Throwable {
    throw __call3087037_0(p0);
}
public static void h870_38(moom.Oo p0) throws Throwable {
    throw __call3087038_0(p0);
}
public static void h870_39(moom.Oo p0) throws Throwable {
    throw __call3087039_0(p0);
}
public static void h870_40(moom.Oo p0) throws Throwable {
    throw __call3087040_0(p0);
}
public static void h870_41(moom.Oo p0) throws Throwable {
    throw __call3087041_0(p0);
}
public static void h870_42(moom.Oo p0) throws Throwable {
    throw __call3087042_0(p0);
}
private static native float __call870_0(int a0) throws Throwable;
private static native float __call870_1(int a0) throws Throwable;
private static native float __call870_2(int a0) throws Throwable;
private static native float __call870_3(float a0, float a1) throws Throwable;
private static native float __call870_4(float a0, float a1) throws Throwable;
private static native float __call870_5(float a0, float a1) throws Throwable;
private static native float __call870_6(float a0, float a1) throws Throwable;
private static native float __call870_7(float a0, float a1) throws Throwable;
private static native float __call870_8(float a0, float a1) throws Throwable;
private static native moom.bs __fieldRead870_9() throws Throwable;
private static native int __call870_10(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead870_11() throws Throwable;
private static native int __call870_12(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead870_13() throws Throwable;
private static native int __call870_14(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead870_15() throws Throwable;
private static native int __call870_16(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead870_17() throws Throwable;
private static native int __call870_18(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead870_19() throws Throwable;
private static native int __call870_20(moom.bs a0) throws Throwable;
private static native moom.bs[] __fieldRead870_21() throws Throwable;
private static native moom.bs __fieldRead870_22() throws Throwable;
private static native int __call870_23(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead870_24() throws Throwable;
private static native int __call870_25(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead870_26() throws Throwable;
private static native int __call870_27(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead870_28() throws Throwable;
private static native int __call870_29(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead870_30() throws Throwable;
private static native int __call870_31(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead870_32() throws Throwable;
private static native int __call870_33(moom.bs a0) throws Throwable;
private static native int[] __fieldRead870_34() throws Throwable;
private static native int __call870_35(moom.bs a0) throws Throwable;
private static native int __numericCompare870_36(float a0, float a1) throws Throwable;
private static native int __numericCompare870_37(float a0, float a1) throws Throwable;
private static native int __numericCompare870_38(float a0, float a1) throws Throwable;
private static native int __numericCompare870_39(float a0, float a1) throws Throwable;
private static native void __call870_40(java.util.BitSet a0, int a1, int a2) throws Throwable;
private static native int __numericCompare870_41(float a0, float a1) throws Throwable;
private static native boolean __call870_42(net.minecraft.block.Block a0) throws Throwable;
private static native int __numericCompare870_43(float a0, float a1) throws Throwable;
private static native void __call870_44(java.util.BitSet a0, int a1, int a2) throws Throwable;
private static native int __numericCompare870_45(float a0, float a1) throws Throwable;
private static native int __numericCompare870_46(float a0, float a1) throws Throwable;
private static native int __numericCompare870_47(float a0, float a1) throws Throwable;
private static native int __numericCompare870_48(float a0, float a1) throws Throwable;
private static native void __call870_49(java.util.BitSet a0, int a1, int a2) throws Throwable;
private static native int __numericCompare870_50(float a0, float a1) throws Throwable;
private static native boolean __call870_51(net.minecraft.block.Block a0) throws Throwable;
private static native int __numericCompare870_52(float a0, float a1) throws Throwable;
private static native void __call870_53(java.util.BitSet a0, int a1, int a2) throws Throwable;
private static native int __numericCompare870_54(float a0, float a1) throws Throwable;
private static native int __numericCompare870_55(float a0, float a1) throws Throwable;
private static native int __numericCompare870_56(float a0, float a1) throws Throwable;
private static native int __numericCompare870_57(float a0, float a1) throws Throwable;
private static native void __call870_58(java.util.BitSet a0, int a1, int a2) throws Throwable;
private static native int __numericCompare870_59(float a0, float a1) throws Throwable;
private static native boolean __call870_60(net.minecraft.block.Block a0) throws Throwable;
private static native int __numericCompare870_61(float a0, float a1) throws Throwable;
private static native void __call870_62(java.util.BitSet a0, int a1, int a2) throws Throwable;
private static native int __numericCompare870_63(float a0, float a1) throws Throwable;
private static native int __numericCompare870_64(float a0, float a1) throws Throwable;
private static native int __numericCompare870_65(float a0, float a1) throws Throwable;
private static native int __numericCompare870_66(float a0, float a1) throws Throwable;
private static native void __call870_67(java.util.BitSet a0, int a1, int a2) throws Throwable;
private static native int __numericCompare870_68(float a0, float a1) throws Throwable;
private static native boolean __call870_69(net.minecraft.block.Block a0) throws Throwable;
private static native int __numericCompare870_70(float a0, float a1) throws Throwable;
private static native void __call870_71(java.util.BitSet a0, int a1, int a2) throws Throwable;
private static native int __numericCompare870_72(float a0, float a1) throws Throwable;
private static native int __numericCompare870_73(float a0, float a1) throws Throwable;
private static native int __numericCompare870_74(float a0, float a1) throws Throwable;
private static native int __numericCompare870_75(float a0, float a1) throws Throwable;
private static native void __call870_76(java.util.BitSet a0, int a1, int a2) throws Throwable;
private static native int __numericCompare870_77(float a0, float a1) throws Throwable;
private static native boolean __call870_78(net.minecraft.block.Block a0) throws Throwable;
private static native int __numericCompare870_79(float a0, float a1) throws Throwable;
private static native void __call870_80(java.util.BitSet a0, int a1, int a2) throws Throwable;
private static native int __numericCompare870_81(float a0, float a1) throws Throwable;
private static native int __numericCompare870_82(float a0, float a1) throws Throwable;
private static native int __numericCompare870_83(float a0, float a1) throws Throwable;
private static native int __numericCompare870_84(float a0, float a1) throws Throwable;
private static native void __call870_85(java.util.BitSet a0, int a1, int a2) throws Throwable;
private static native int __numericCompare870_86(float a0, float a1) throws Throwable;
private static native boolean __call870_87(net.minecraft.block.Block a0) throws Throwable;
private static native int __numericCompare870_88(float a0, float a1) throws Throwable;
private static native void __call870_89(java.util.BitSet a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call3087000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087018_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087019_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087020_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087021_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087022_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087023_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087024_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087025_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087026_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087027_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087028_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087029_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087030_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087031_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087032_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087033_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087034_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087035_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087036_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087037_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087038_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087039_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087040_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087041_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3087042_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_51c823fb556d3bd0d167(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, moom.bs a4, int a5, boolean a6, moom.lw a7, java.util.List a8, moom.Mi a9) throws E;
private static final class __SourceHandler_51c823fb556d3bd0d167 {

public static void f1071(moom.kK receiver, net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, int p4, boolean p5, moom.lw p6, java.util.List p7, moom.Mi p8) throws Throwable {
    int lexicalValue1071_182_0;
    long life10_3;
    net.minecraft.block.Block life12_6;
    java.util.BitSet life13_9;
    double life14_13;
    double life16_17;
    double life18_21;
    moom.F life20_24;
    int life21_30;
    int life22_33;
    long life23_51;
    long life23_69;
    java.util.Iterator life21_147;
    moom.lC life22_154;
    int life23_230;
    int life24_247;
    float life25_277;
    float life26_294;
    float life27_305;
    lexical_join_323: {
    lexical_join_145: {
    life10_3 = (__fieldRead1071_0() ^ 112573997828482L);
    life12_6 = __call1071_1(p1);
    life13_9 = __call1071_2(p8);
    life14_13 = ((double) __call1071_3(p2));
    life16_17 = ((double) __call1071_4(p2));
    life18_21 = ((double) __call1071_5(p2));
    life20_24 = __call1071_6(life12_6);
    if (!((life20_24 != __fieldRead1071_7()))) {
        break lexical_join_145;
    }
    life21_30 = __call1071_8(p2);
    life22_33 = __call1071_9(p2);
    life23_51 = ((((long) life21_30) * __invokedynamic1071_10(25729, (1674064639227826332L ^ life10_3))) ^ (((long) life22_33) * __invokedynamic1071_11(10697, (602509275524619729L ^ life10_3))));
    life23_69 = (((life23_51 * life23_51) * __invokedynamic1071_12(10280, (8281398056313510963L ^ life10_3))) + (life23_51 * __invokedynamic1071_13(24161, (2909961471179467387L ^ life10_3))));
    life14_13 = (life14_13 + ((((double) (((float) ((life23_69 >> __invokedynamic1071_14(15018, (213342092979598464L ^ life10_3))) & __invokedynamic1071_15(10723, (7439822033433943546L ^ life10_3)))) / 0x1.ep3f)) - 0x1.0p-1d) * 0x1.0p-1d));
    life18_21 = (life18_21 + ((((double) (((float) ((life23_69 >> __invokedynamic1071_16(18942, (7893714141230630878L ^ life10_3))) & __invokedynamic1071_17(10723, (7439822033433943546L ^ life10_3)))) / 0x1.ep3f)) - 0x1.0p-1d) * 0x1.0p-1d));
    if (!((life20_24 == __fieldRead1071_18()))) {
        break lexical_join_145;
    }
    life16_17 = (life16_17 + ((((double) (((float) ((life23_69 >> __invokedynamic1071_19(8228, (8013425179067149834L ^ life10_3))) & __invokedynamic1071_20(10723, (7439822033433943546L ^ life10_3)))) / 0x1.ep3f)) - 0x1.0p0d) * 0x1.999999999999ap-3d));
    }
    life21_147 = __call1071_21(p7);
    lexical_cycle_148: while (true) {
    lexical_join_317: {
    lexical_join_248: {
    lexical_join_243: {
    lexical_join_236: {
    lexical_join_230: {
    lexical_join_207: {
    lexical_join_203: {
    lexical_join_195: {
    lexical_join_183: {
    lexical_join_182: {
    lexical_join_178: {
    if (!(__call1071_22(life21_147))) {
        break lexical_join_323;
    }
    life22_154 = __cast1071_24(__call1071_23(life21_147));
    if (!(p5)) {
        break lexical_join_183;
    }
    __call1071_27(receiver, life12_6, __call1071_25(life22_154), __call1071_26(life22_154), null, life13_9);
    if (!(__call1071_28(life13_9, 0))) {
        break lexical_join_178;
    }
    lexicalValue1071_182_0 = __call1071_31(life12_6, p0, __call1071_30(p2, __call1071_29(life22_154)));
    break lexical_join_182;
    }
    lexicalValue1071_182_0 = __call1071_32(life12_6, p0, p2);
    }
    p4 = lexicalValue1071_182_0;
    }
    if (!(__fieldRead1071_34(__call1071_33(life22_154)))) {
        break lexical_join_195;
    }
    p4 = (p4 | __invokedynamic1071_35(15939, (4436034495848050790L ^ life10_3)));
    }
    if (!(__call1071_36(p6))) {
        break lexical_join_203;
    }
    __call1071_38(p6, __call1071_37(life22_154));
    break lexical_join_207;
    }
    __call1071_40(p6, __call1071_39(life22_154));
    }
    __call1071_42(p6, __call1071_41(life22_154));
    __call1071_43(p6, p4, p4, p4, p4);
    life23_230 = __call1071_44(life22_154, p1, p0, p2, p8);
    if (!((!__call1071_45(life22_154)))) {
        break lexical_join_230;
    }
    if (!((life23_230 != -1))) {
        break lexical_join_317;
    }
    }
    if (!((life23_230 != -1))) {
        break lexical_join_236;
    }
    life24_247 = life23_230;
    break lexical_join_243;
    }
    life24_247 = __call1071_47(life12_6, p0, p2, __call1071_46(life22_154));
    }
    if (!(__fieldRead1071_48())) {
        break lexical_join_248;
    }
    life24_247 = __call1071_49(life24_247);
    }
    life25_277 = (((float) ((life24_247 >> __invokedynamic1071_50(15018, (213342092979598464L ^ life10_3))) & __invokedynamic1071_51(10778, (4583204369802028089L ^ life10_3)))) / 0x1.fep7f);
    life26_294 = (((float) ((life24_247 >> __invokedynamic1071_52(2205, (1849056789052376758L ^ life10_3))) & __invokedynamic1071_53(10778, (4583204369802028089L ^ life10_3)))) / 0x1.fep7f);
    life27_305 = (((float) (life24_247 & __invokedynamic1071_54(10778, (4583204369802028089L ^ life10_3)))) / 0x1.fep7f);
    __call1071_55(p6, life25_277, life26_294, life27_305, 4);
    __call1071_56(p6, life25_277, life26_294, life27_305, 3);
    __call1071_57(p6, life25_277, life26_294, life27_305, 2);
    __call1071_58(p6, life25_277, life26_294, life27_305, 1);
    }
    __call1071_59(p6, life14_13, life16_17, life18_21);
    continue lexical_cycle_148;
    }
    }
    return;
}
public static void h1071_0(moom.Oo p0) throws Throwable {
    throw __call1107100_0(p0);
}
public static void h1071_1(moom.Oo p0) throws Throwable {
    throw __call1107101_0(p0);
}
public static void h1071_2(moom.Oo p0) throws Throwable {
    throw __call1107102_0(p0);
}
public static void h1071_3(moom.Oo p0) throws Throwable {
    throw __call1107103_0(p0);
}
public static void h1071_4(moom.Oo p0) throws Throwable {
    throw __call1107104_0(p0);
}
private static native long __fieldRead1071_0() throws Throwable;
private static native net.minecraft.block.Block __call1071_1(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native java.util.BitSet __call1071_2(moom.Mi a0) throws Throwable;
private static native int __call1071_3(moom.DT a0) throws Throwable;
private static native int __call1071_4(moom.DT a0) throws Throwable;
private static native int __call1071_5(moom.DT a0) throws Throwable;
private static native moom.F __call1071_6(net.minecraft.block.Block a0) throws Throwable;
private static native moom.F __fieldRead1071_7() throws Throwable;
private static native int __call1071_8(moom.DT a0) throws Throwable;
private static native int __call1071_9(moom.DT a0) throws Throwable;
private static native long __invokedynamic1071_10(int a0, long a1) throws Throwable;
private static native long __invokedynamic1071_11(int a0, long a1) throws Throwable;
private static native long __invokedynamic1071_12(int a0, long a1) throws Throwable;
private static native long __invokedynamic1071_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic1071_14(int a0, long a1) throws Throwable;
private static native long __invokedynamic1071_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic1071_16(int a0, long a1) throws Throwable;
private static native long __invokedynamic1071_17(int a0, long a1) throws Throwable;
private static native moom.F __fieldRead1071_18() throws Throwable;
private static native int __invokedynamic1071_19(int a0, long a1) throws Throwable;
private static native long __invokedynamic1071_20(int a0, long a1) throws Throwable;
private static native java.util.Iterator __call1071_21(java.util.List a0) throws Throwable;
private static native boolean __call1071_22(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1071_23(java.util.Iterator a0) throws Throwable;
private static native moom.lC __cast1071_24(java.lang.Object a0) throws Throwable;
private static native int[] __call1071_25(moom.lC a0) throws Throwable;
private static native moom.bs __call1071_26(moom.lC a0) throws Throwable;
private static native void __call1071_27(moom.kK a0, net.minecraft.block.Block a1, int[] a2, moom.bs a3, java.lang.Object a4, java.util.BitSet a5) throws Throwable;
private static native boolean __call1071_28(java.util.BitSet a0, int a1) throws Throwable;
private static native moom.bs __call1071_29(moom.lC a0) throws Throwable;
private static native moom.DT __call1071_30(moom.DT a0, moom.bs a1) throws Throwable;
private static native int __call1071_31(net.minecraft.block.Block a0, net.minecraft.world.IBlockAccess a1, moom.DT a2) throws Throwable;
private static native int __call1071_32(net.minecraft.block.Block a0, net.minecraft.world.IBlockAccess a1, moom.DT a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call1071_33(moom.lC a0) throws Throwable;
private static native boolean __fieldRead1071_34(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __invokedynamic1071_35(int a0, long a1) throws Throwable;
private static native boolean __call1071_36(moom.lw a0) throws Throwable;
private static native int[] __call1071_37(moom.lC a0) throws Throwable;
private static native void __call1071_38(moom.lw a0, int[] a1) throws Throwable;
private static native int[] __call1071_39(moom.lC a0) throws Throwable;
private static native void __call1071_40(moom.lw a0, int[] a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call1071_41(moom.lC a0) throws Throwable;
private static native void __call1071_42(moom.lw a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native void __call1071_43(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native int __call1071_44(moom.lC a0, net.minecraft.block.state.IBlockState a1, net.minecraft.world.IBlockAccess a2, moom.DT a3, moom.Mi a4) throws Throwable;
private static native boolean __call1071_45(moom.lC a0) throws Throwable;
private static native int __call1071_46(moom.lC a0) throws Throwable;
private static native int __call1071_47(net.minecraft.block.Block a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, int a3) throws Throwable;
private static native boolean __fieldRead1071_48() throws Throwable;
private static native int __call1071_49(int a0) throws Throwable;
private static native int __invokedynamic1071_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic1071_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic1071_52(int a0, long a1) throws Throwable;
private static native int __invokedynamic1071_53(int a0, long a1) throws Throwable;
private static native int __invokedynamic1071_54(int a0, long a1) throws Throwable;
private static native void __call1071_55(moom.lw a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call1071_56(moom.lw a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call1071_57(moom.lw a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call1071_58(moom.lw a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call1071_59(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call1107100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1107101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1107102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1107103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1107104_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_12da6b526261a0a00347(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, moom.lw a4, java.util.List a5, moom.Mi a6) throws E;
private static final class __SourceHandler_12da6b526261a0a00347 {

public static void f1072(moom.kK receiver, net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.lw p3, java.util.List p4, moom.Mi p5) throws Throwable {
    long life7_3;
    net.minecraft.block.Block life9_6;
    float[] life10_9;
    java.util.BitSet life11_12;
    moom.kM life12_15;
    double life13_19;
    double life15_23;
    double life17_27;
    moom.F life19_30;
    long life20_36;
    java.util.Iterator life20_114;
    moom.lC life21_121;
    int life22_191;
    int life23_314;
    float life24_344;
    float life25_361;
    float life26_372;
    lexical_join_493: {
    lexical_join_112: {
    life7_3 = (__fieldRead1072_0() ^ 116139260009896L);
    life9_6 = __call1072_1(p1);
    life10_9 = __call1072_2(p5);
    life11_12 = __call1072_3(p5);
    life12_15 = __call1072_4(p5);
    life13_19 = ((double) __call1072_5(p2));
    life15_23 = ((double) __call1072_6(p2));
    life17_27 = ((double) __call1072_7(p2));
    life19_30 = __call1072_8(life9_6);
    if (!((life19_30 != __fieldRead1072_9()))) {
        break lexical_join_112;
    }
    life20_36 = __call1072_10(p2);
    life13_19 = (life13_19 + ((((double) (((float) ((life20_36 >> __invokedynamic1072_11(15018, (213356119909687466L ^ life7_3))) & __invokedynamic1072_12(5915, (1364666574565734189L ^ life7_3)))) / 0x1.ep3f)) - 0x1.0p-1d) * 0x1.0p-1d));
    life17_27 = (life17_27 + ((((double) (((float) ((life20_36 >> __invokedynamic1072_13(15806, (3954618941354338227L ^ life7_3))) & __invokedynamic1072_14(10723, (7439807474125031888L ^ life7_3)))) / 0x1.ep3f)) - 0x1.0p-1d) * 0x1.0p-1d));
    if (!((life19_30 == __fieldRead1072_15()))) {
        break lexical_join_112;
    }
    life15_23 = (life15_23 + ((((double) (((float) ((life20_36 >> __invokedynamic1072_16(28043, (8755779082441963395L ^ life7_3))) & __invokedynamic1072_17(10723, (7439807474125031888L ^ life7_3)))) / 0x1.ep3f)) - 0x1.0p0d) * 0x1.999999999999ap-3d));
    }
    life20_114 = __call1072_18(p4);
    lexical_cycle_115: while (true) {
    lexical_join_487: {
    lexical_join_403: {
    lexical_join_315: {
    lexical_join_310: {
    lexical_join_303: {
    lexical_join_297: {
    lexical_join_236: {
    lexical_join_158: {
    lexical_join_154: {
    lexical_join_146: {
    if (!(__call1072_19(life20_114))) {
        break lexical_join_493;
    }
    life21_121 = __cast1072_21(__call1072_20(life20_114));
    __call1072_24(receiver, life9_6, __call1072_22(life21_121), __call1072_23(life21_121), life10_9, life11_12);
    __call1072_26(life12_15, p0, life9_6, p2, __call1072_25(life21_121), life10_9, life11_12);
    if (!(__fieldRead1072_28(__call1072_27(life21_121)))) {
        break lexical_join_146;
    }
    __call1072_29(life12_15);
    }
    if (!(__call1072_30(p3))) {
        break lexical_join_154;
    }
    __call1072_32(p3, __call1072_31(life21_121));
    break lexical_join_158;
    }
    __call1072_34(p3, __call1072_33(life21_121));
    }
    __call1072_36(p3, __call1072_35(life21_121));
    __call1072_41(p3, (__fieldRead1072_37(life12_15))[0], (__fieldRead1072_38(life12_15))[1], (__fieldRead1072_39(life12_15))[2], (__fieldRead1072_40(life12_15))[3]);
    life22_191 = __call1072_42(life21_121, p1, p0, p2, p5);
    if (!((!__call1072_43(life21_121)))) {
        break lexical_join_297;
    }
    if (!((life22_191 == -1))) {
        break lexical_join_297;
    }
    if (!(__fieldRead1072_44())) {
        break lexical_join_236;
    }
    __call1072_46(p3, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, (__fieldRead1072_45(life12_15))[0], 4);
    __call1072_48(p3, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, (__fieldRead1072_47(life12_15))[1], 3);
    __call1072_50(p3, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, (__fieldRead1072_49(life12_15))[2], 2);
    __call1072_52(p3, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, (__fieldRead1072_51(life12_15))[3], 1);
    break lexical_join_487;
    }
    __call1072_56(p3, (__fieldRead1072_53(life12_15))[0], (__fieldRead1072_54(life12_15))[0], (__fieldRead1072_55(life12_15))[0], 4);
    __call1072_60(p3, (__fieldRead1072_57(life12_15))[1], (__fieldRead1072_58(life12_15))[1], (__fieldRead1072_59(life12_15))[1], 3);
    __call1072_64(p3, (__fieldRead1072_61(life12_15))[2], (__fieldRead1072_62(life12_15))[2], (__fieldRead1072_63(life12_15))[2], 2);
    __call1072_68(p3, (__fieldRead1072_65(life12_15))[3], (__fieldRead1072_66(life12_15))[3], (__fieldRead1072_67(life12_15))[3], 1);
    break lexical_join_487;
    }
    if (!((life22_191 != -1))) {
        break lexical_join_303;
    }
    life23_314 = life22_191;
    break lexical_join_310;
    }
    life23_314 = __call1072_70(life9_6, p0, p2, __call1072_69(life21_121));
    }
    if (!(__fieldRead1072_71())) {
        break lexical_join_315;
    }
    life23_314 = __call1072_72(life23_314);
    }
    life24_344 = (((float) ((life23_314 >> __invokedynamic1072_73(15018, (213356119909687466L ^ life7_3))) & __invokedynamic1072_74(10778, (4583221676747124755L ^ life7_3)))) / 0x1.fep7f);
    life25_361 = (((float) ((life23_314 >> __invokedynamic1072_75(2205, (1849049358114050716L ^ life7_3))) & __invokedynamic1072_76(10778, (4583221676747124755L ^ life7_3)))) / 0x1.fep7f);
    life26_372 = (((float) (life23_314 & __invokedynamic1072_77(10778, (4583221676747124755L ^ life7_3)))) / 0x1.fep7f);
    if (!(__fieldRead1072_78())) {
        break lexical_join_403;
    }
    __call1072_80(p3, life24_344, life25_361, life26_372, (__fieldRead1072_79(life12_15))[0], 4);
    __call1072_82(p3, life24_344, life25_361, life26_372, (__fieldRead1072_81(life12_15))[1], 3);
    __call1072_84(p3, life24_344, life25_361, life26_372, (__fieldRead1072_83(life12_15))[2], 2);
    __call1072_86(p3, life24_344, life25_361, life26_372, (__fieldRead1072_85(life12_15))[3], 1);
    break lexical_join_487;
    }
    __call1072_90(p3, ((__fieldRead1072_87(life12_15))[0] * life24_344), ((__fieldRead1072_88(life12_15))[0] * life25_361), ((__fieldRead1072_89(life12_15))[0] * life26_372), 4);
    __call1072_94(p3, ((__fieldRead1072_91(life12_15))[1] * life24_344), ((__fieldRead1072_92(life12_15))[1] * life25_361), ((__fieldRead1072_93(life12_15))[1] * life26_372), 3);
    __call1072_98(p3, ((__fieldRead1072_95(life12_15))[2] * life24_344), ((__fieldRead1072_96(life12_15))[2] * life25_361), ((__fieldRead1072_97(life12_15))[2] * life26_372), 2);
    __call1072_102(p3, ((__fieldRead1072_99(life12_15))[3] * life24_344), ((__fieldRead1072_100(life12_15))[3] * life25_361), ((__fieldRead1072_101(life12_15))[3] * life26_372), 1);
    }
    __call1072_103(p3, life13_19, life15_23, life17_27);
    continue lexical_cycle_115;
    }
    }
    return;
}
public static void h1072_0(moom.Oo p0) throws Throwable {
    throw __call1107200_0(p0);
}
public static void h1072_1(moom.Oo p0) throws Throwable {
    throw __call1107201_0(p0);
}
public static void h1072_2(moom.Oo p0) throws Throwable {
    throw __call1107202_0(p0);
}
public static void h1072_3(moom.Oo p0) throws Throwable {
    throw __call1107203_0(p0);
}
public static void h1072_4(moom.Oo p0) throws Throwable {
    throw __call1107204_0(p0);
}
public static void h1072_5(moom.Oo p0) throws Throwable {
    throw __call1107205_0(p0);
}
private static native long __fieldRead1072_0() throws Throwable;
private static native net.minecraft.block.Block __call1072_1(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native float[] __call1072_2(moom.Mi a0) throws Throwable;
private static native java.util.BitSet __call1072_3(moom.Mi a0) throws Throwable;
private static native moom.kM __call1072_4(moom.Mi a0) throws Throwable;
private static native int __call1072_5(moom.DT a0) throws Throwable;
private static native int __call1072_6(moom.DT a0) throws Throwable;
private static native int __call1072_7(moom.DT a0) throws Throwable;
private static native moom.F __call1072_8(net.minecraft.block.Block a0) throws Throwable;
private static native moom.F __fieldRead1072_9() throws Throwable;
private static native long __call1072_10(moom.DT a0) throws Throwable;
private static native int __invokedynamic1072_11(int a0, long a1) throws Throwable;
private static native long __invokedynamic1072_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic1072_13(int a0, long a1) throws Throwable;
private static native long __invokedynamic1072_14(int a0, long a1) throws Throwable;
private static native moom.F __fieldRead1072_15() throws Throwable;
private static native int __invokedynamic1072_16(int a0, long a1) throws Throwable;
private static native long __invokedynamic1072_17(int a0, long a1) throws Throwable;
private static native java.util.Iterator __call1072_18(java.util.List a0) throws Throwable;
private static native boolean __call1072_19(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1072_20(java.util.Iterator a0) throws Throwable;
private static native moom.lC __cast1072_21(java.lang.Object a0) throws Throwable;
private static native int[] __call1072_22(moom.lC a0) throws Throwable;
private static native moom.bs __call1072_23(moom.lC a0) throws Throwable;
private static native void __call1072_24(moom.kK a0, net.minecraft.block.Block a1, int[] a2, moom.bs a3, float[] a4, java.util.BitSet a5) throws Throwable;
private static native moom.bs __call1072_25(moom.lC a0) throws Throwable;
private static native void __call1072_26(moom.kM a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.Block a2, moom.DT a3, moom.bs a4, float[] a5, java.util.BitSet a6) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call1072_27(moom.lC a0) throws Throwable;
private static native boolean __fieldRead1072_28(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call1072_29(moom.kM a0) throws Throwable;
private static native boolean __call1072_30(moom.lw a0) throws Throwable;
private static native int[] __call1072_31(moom.lC a0) throws Throwable;
private static native void __call1072_32(moom.lw a0, int[] a1) throws Throwable;
private static native int[] __call1072_33(moom.lC a0) throws Throwable;
private static native void __call1072_34(moom.lw a0, int[] a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call1072_35(moom.lC a0) throws Throwable;
private static native void __call1072_36(moom.lw a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native int[] __fieldRead1072_37(moom.kM a0) throws Throwable;
private static native int[] __fieldRead1072_38(moom.kM a0) throws Throwable;
private static native int[] __fieldRead1072_39(moom.kM a0) throws Throwable;
private static native int[] __fieldRead1072_40(moom.kM a0) throws Throwable;
private static native void __call1072_41(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native int __call1072_42(moom.lC a0, net.minecraft.block.state.IBlockState a1, net.minecraft.world.IBlockAccess a2, moom.DT a3, moom.Mi a4) throws Throwable;
private static native boolean __call1072_43(moom.lC a0) throws Throwable;
private static native boolean __fieldRead1072_44() throws Throwable;
private static native float[] __fieldRead1072_45(moom.kM a0) throws Throwable;
private static native void __call1072_46(moom.lw a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native float[] __fieldRead1072_47(moom.kM a0) throws Throwable;
private static native void __call1072_48(moom.lw a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native float[] __fieldRead1072_49(moom.kM a0) throws Throwable;
private static native void __call1072_50(moom.lw a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native float[] __fieldRead1072_51(moom.kM a0) throws Throwable;
private static native void __call1072_52(moom.lw a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native float[] __fieldRead1072_53(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_54(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_55(moom.kM a0) throws Throwable;
private static native void __call1072_56(moom.lw a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native float[] __fieldRead1072_57(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_58(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_59(moom.kM a0) throws Throwable;
private static native void __call1072_60(moom.lw a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native float[] __fieldRead1072_61(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_62(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_63(moom.kM a0) throws Throwable;
private static native void __call1072_64(moom.lw a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native float[] __fieldRead1072_65(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_66(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_67(moom.kM a0) throws Throwable;
private static native void __call1072_68(moom.lw a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native int __call1072_69(moom.lC a0) throws Throwable;
private static native int __call1072_70(net.minecraft.block.Block a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, int a3) throws Throwable;
private static native boolean __fieldRead1072_71() throws Throwable;
private static native int __call1072_72(int a0) throws Throwable;
private static native int __invokedynamic1072_73(int a0, long a1) throws Throwable;
private static native int __invokedynamic1072_74(int a0, long a1) throws Throwable;
private static native int __invokedynamic1072_75(int a0, long a1) throws Throwable;
private static native int __invokedynamic1072_76(int a0, long a1) throws Throwable;
private static native int __invokedynamic1072_77(int a0, long a1) throws Throwable;
private static native boolean __fieldRead1072_78() throws Throwable;
private static native float[] __fieldRead1072_79(moom.kM a0) throws Throwable;
private static native void __call1072_80(moom.lw a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native float[] __fieldRead1072_81(moom.kM a0) throws Throwable;
private static native void __call1072_82(moom.lw a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native float[] __fieldRead1072_83(moom.kM a0) throws Throwable;
private static native void __call1072_84(moom.lw a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native float[] __fieldRead1072_85(moom.kM a0) throws Throwable;
private static native void __call1072_86(moom.lw a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native float[] __fieldRead1072_87(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_88(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_89(moom.kM a0) throws Throwable;
private static native void __call1072_90(moom.lw a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native float[] __fieldRead1072_91(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_92(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_93(moom.kM a0) throws Throwable;
private static native void __call1072_94(moom.lw a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native float[] __fieldRead1072_95(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_96(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_97(moom.kM a0) throws Throwable;
private static native void __call1072_98(moom.lw a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native float[] __fieldRead1072_99(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_100(moom.kM a0) throws Throwable;
private static native float[] __fieldRead1072_101(moom.kM a0) throws Throwable;
private static native void __call1072_102(moom.lw a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call1072_103(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call1107200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1107201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1107202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1107203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1107204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1107205_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9655cfd31420274f95e3(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.client.resources.model.IBakedModel a2, net.minecraft.block.state.IBlockState a3, moom.DT a4, moom.lw a5, boolean a6) throws E;
private static final class __SourceHandler_9655cfd31420274f95e3 {

public static boolean f386(moom.kK receiver, net.minecraft.world.IBlockAccess p0, net.minecraft.client.resources.model.IBakedModel p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, moom.lw p4, boolean p5) throws Throwable {
    int forwardValue386_12_0;
    int forwardValue386_49_0;
    int life7_20;
    moom.Mi life8_35;
    net.minecraft.client.resources.model.IBakedModel life2_40;
    int life9_62;
    forward_join_67: {
    forward_join_63: {
    forward_join_49: {
    forward_join_41: {
    forward_join_20: {
    forward_join_12: {
    forward_join_11: {
    if (!(__call386_0())) {
        break forward_join_11;
    }
    if (!((__call386_2(__call386_1(p2)) == 0))) {
        break forward_join_11;
    }
    if (!(__call386_3(p1))) {
        break forward_join_11;
    }
    forwardValue386_12_0 = 1;
    break forward_join_12;
    }
    forwardValue386_12_0 = 0;
    }
    life7_20 = forwardValue386_12_0;
    if (!(__call386_4())) {
        break forward_join_20;
    }
    __call386_5(p2, p3, p0, p4);
    }
    life8_35 = __call386_6(p4, p2, p3);
    life2_40 = __call386_7(p1, p2, life8_35);
    if (!((life7_20 != 0))) {
        break forward_join_41;
    }
    forwardValue386_49_0 = __integerCategory386_9(__call386_8(receiver, p0, life2_40, p2, p3, p4, p5));
    break forward_join_49;
    }
    forwardValue386_49_0 = __integerCategory386_11(__call386_10(receiver, p0, life2_40, p2, p3, p4, p5));
    }
    life9_62 = forwardValue386_49_0;
    if (!((life9_62 != 0))) {
        break forward_join_63;
    }
    __call386_12(receiver, p0, life2_40, p2, p3, p4, p5, 0L, life8_35, life7_20);
    }
    if (!(__call386_13())) {
        break forward_join_67;
    }
    __call386_14(p4);
    }
    return __integerCategory386_15(life9_62);
}
public static boolean h386_0(java.lang.Throwable p0) throws Throwable {
    throw __call2038600_0(p0);
}
public static boolean h386_1(java.lang.Throwable p0) throws Throwable {
    throw __call2038601_0(p0);
}
public static boolean h386_2(java.lang.Throwable p0) throws Throwable {
    throw __call2038602_0(p0);
}
public static boolean h386_3(java.lang.Throwable p0) throws Throwable {
    throw __call2038603_0(p0);
}
public static boolean h386_4(java.lang.Throwable p0) throws Throwable {
    throw __call2038604_0(p0);
}
public static boolean h386_5(java.lang.Throwable p0) throws Throwable {
    throw __call2038605_0(p0);
}
public static boolean h386_6(java.lang.Throwable p0) throws Throwable {
    throw __call2038606_0(p0);
}
public static boolean h386_7(java.lang.Throwable p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, int p3) throws Throwable {
    java.lang.Throwable local4 = p0;
    moom.qY local5 = __call2038607_0(local4, "Tesselating block model");
    moom.qZ local6 = __call2038607_1(local5, "Block model being tesselated");
    __call2038607_2(local6, p2, p1);
    __call2038607_4(local6, "Using AO", __call2038607_3(p3));
    throw new moom.Oo(local5);
}
private static native boolean __call386_0() throws Throwable;
private static native net.minecraft.block.Block __call386_1(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call386_2(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call386_3(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native boolean __call386_4() throws Throwable;
private static native void __call386_5(net.minecraft.block.state.IBlockState a0, moom.DT a1, net.minecraft.world.IBlockAccess a2, moom.lw a3) throws Throwable;
private static native moom.Mi __call386_6(moom.lw a0, net.minecraft.block.state.IBlockState a1, moom.DT a2) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call386_7(net.minecraft.client.resources.model.IBakedModel a0, net.minecraft.block.state.IBlockState a1, moom.Mi a2) throws Throwable;
private static native boolean __call386_8(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.client.resources.model.IBakedModel a2, net.minecraft.block.state.IBlockState a3, moom.DT a4, moom.lw a5, boolean a6) throws Throwable;
private static native int __integerCategory386_9(boolean value) throws Throwable;
private static native boolean __call386_10(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.client.resources.model.IBakedModel a2, net.minecraft.block.state.IBlockState a3, moom.DT a4, moom.lw a5, boolean a6) throws Throwable;
private static native int __integerCategory386_11(boolean value) throws Throwable;
private static native void __call386_12(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.client.resources.model.IBakedModel a2, net.minecraft.block.state.IBlockState a3, moom.DT a4, moom.lw a5, boolean a6, long a7, moom.Mi a8, int a9) throws Throwable;
private static native boolean __call386_13() throws Throwable;
private static native void __call386_14(moom.lw a0) throws Throwable;
private static native boolean __integerCategory386_15(int value) throws Throwable;
private static native java.lang.Throwable __call2038600_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2038601_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2038602_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2038603_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2038604_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2038605_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2038606_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2038607_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2038607_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call2038607_2(moom.qZ a0, moom.DT a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native java.lang.Boolean __call2038607_3(int a0) throws Throwable;
private static native void __call2038607_4(moom.qZ a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_989cec607da3cc835ff9(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.client.resources.model.IBakedModel a2, net.minecraft.block.state.IBlockState a3, moom.DT a4, moom.lw a5, boolean a6, long a7, moom.Mi a8, boolean a9) throws E;
private static final class __SourceHandler_989cec607da3cc835ff9 {

public static void f1832(moom.kK receiver, net.minecraft.world.IBlockAccess p0, net.minecraft.client.resources.model.IBakedModel p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, moom.lw p4, boolean p5, long p6, moom.Mi p7, boolean p8) throws Throwable {
    long life11_3;
    net.minecraft.util.EnumWorldBlockLayer[] life13_8;
    int life14_11;
    int life15_13;
    net.minecraft.util.EnumWorldBlockLayer life16_20;
    moom.LZ life17_24;
    moom.lp life18_30;
    moom.lw life19_36;
    int life20_60;
    moom.lC life21_68;
    java.util.List life22_72;
    net.minecraft.block.state.IBlockState life23_76;
    int life24_113;
    net.minecraft.client.resources.model.IBakedModel life13_149;
    net.minecraft.block.state.IBlockState life14_151;
    life11_3 = (__fieldRead1832_0() ^ 77060661593274L);
    if (__call1832_1(p7)) {
        life13_8 = __fieldRead1832_2();
        life14_11 = (life13_8).length;
        life15_13 = 0;
        loop_region_14: while ((life15_13 < life14_11)) {
        life16_20 = (life13_8)[life15_13];
        life17_24 = __call1832_3(p7, life16_20);
        if ((__call1832_4(life17_24) > 0)) {
        life18_30 = __call1832_5(p7);
        if ((life18_30 != null)) {
        life19_36 = __call1832_6(life18_30, life16_20);
        if ((!__call1832_7(life19_36))) {
        __call1832_10(life19_36, __invokedynamic1832_8(11265, (3795010924323303192L ^ life11_3)), __fieldRead1832_9());
        __call1832_14(life19_36, __call1832_11(p4), __call1832_12(p4), __call1832_13(p4));
    }
        life20_60 = 0;
        loop_region_58: while ((life20_60 < __call1832_15(life17_24))) {
        life21_68 = __call1832_16(life17_24, life20_60);
        life22_72 = __call1832_17(life17_24, life21_68);
        life23_76 = __call1832_18(life17_24, life20_60);
        if ((__call1832_19(life21_68) != null)) {
        __call1832_21(life17_24, __call1832_20(life21_68), life23_76);
    }
        __call1832_22(p7, life23_76, p3);
        if (p8) {
        __call1832_23(receiver, p0, life23_76, p3, life19_36, life22_72, p7);
    } else {
        life24_113 = __call1832_27(__call1832_24(life23_76), p0, __call1832_26(p3, __call1832_25(life21_68)));
        __call1832_29(receiver, p0, life23_76, p3, __call1832_28(life21_68), life24_113, 0, life19_36, life22_72, p7);
    }
        life20_60 += 1;
    }
    }
        __call1832_30(life17_24);
    }
        life15_13 += 1;
    }
    }
    if (__call1832_31()) {
        if ((!__call1832_32(p7))) {
        if (__call1832_33(p0, p2, p3)) {
        life13_149 = __call1832_34();
        life14_151 = __call1832_35();
        __call1832_36(receiver, p0, life13_149, life14_151, p3, p4, p5);
    }
    }
    }
    return;
}
public static void h1832_0(moom.Oo p0) throws Throwable {
    throw __call1183200_0(p0);
}
public static void h1832_1(moom.Oo p0) throws Throwable {
    throw __call1183201_0(p0);
}
public static void h1832_2(moom.Oo p0) throws Throwable {
    throw __call1183202_0(p0);
}
public static void h1832_3(moom.Oo p0) throws Throwable {
    throw __call1183203_0(p0);
}
public static void h1832_4(moom.Oo p0) throws Throwable {
    throw __call1183204_0(p0);
}
private static native long __fieldRead1832_0() throws Throwable;
private static native boolean __call1832_1(moom.Mi a0) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer[] __fieldRead1832_2() throws Throwable;
private static native moom.LZ __call1832_3(moom.Mi a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native int __call1832_4(moom.LZ a0) throws Throwable;
private static native moom.lp __call1832_5(moom.Mi a0) throws Throwable;
private static native moom.lw __call1832_6(moom.lp a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native boolean __call1832_7(moom.lw a0) throws Throwable;
private static native int __invokedynamic1832_8(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead1832_9() throws Throwable;
private static native void __call1832_10(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native double __call1832_11(moom.lw a0) throws Throwable;
private static native double __call1832_12(moom.lw a0) throws Throwable;
private static native double __call1832_13(moom.lw a0) throws Throwable;
private static native void __call1832_14(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __call1832_15(moom.LZ a0) throws Throwable;
private static native moom.lC __call1832_16(moom.LZ a0, int a1) throws Throwable;
private static native java.util.List __call1832_17(moom.LZ a0, moom.lC a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1832_18(moom.LZ a0, int a1) throws Throwable;
private static native moom.lC __call1832_19(moom.lC a0) throws Throwable;
private static native moom.lC __call1832_20(moom.lC a0) throws Throwable;
private static native void __call1832_21(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native void __call1832_22(moom.Mi a0, net.minecraft.block.state.IBlockState a1, moom.DT a2) throws Throwable;
private static native void __call1832_23(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, moom.lw a4, java.util.List a5, moom.Mi a6) throws Throwable;
private static native net.minecraft.block.Block __call1832_24(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.bs __call1832_25(moom.lC a0) throws Throwable;
private static native moom.DT __call1832_26(moom.DT a0, moom.bs a1) throws Throwable;
private static native int __call1832_27(net.minecraft.block.Block a0, net.minecraft.world.IBlockAccess a1, moom.DT a2) throws Throwable;
private static native moom.bs __call1832_28(moom.lC a0) throws Throwable;
private static native void __call1832_29(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, moom.bs a4, int a5, int a6, moom.lw a7, java.util.List a8, moom.Mi a9) throws Throwable;
private static native void __call1832_30(moom.LZ a0) throws Throwable;
private static native boolean __call1832_31() throws Throwable;
private static native boolean __call1832_32(moom.Mi a0) throws Throwable;
private static native boolean __call1832_33(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call1832_34() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1832_35() throws Throwable;
private static native boolean __call1832_36(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.client.resources.model.IBakedModel a2, net.minecraft.block.state.IBlockState a3, moom.DT a4, moom.lw a5, boolean a6) throws Throwable;
private static native java.lang.Throwable __call1183200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1183201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1183202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1183203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1183204_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_6e1caa60221a89e31b1f(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.client.resources.model.IBakedModel a2, net.minecraft.block.state.IBlockState a3, moom.DT a4, moom.lw a5, boolean a6) throws E;
private static final class __SourceHandler_6e1caa60221a89e31b1f {

public static boolean f1073(moom.kK receiver, net.minecraft.world.IBlockAccess p0, net.minecraft.client.resources.model.IBakedModel p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, moom.lw p4, boolean p5) throws Throwable {
    int life7_1;
    net.minecraft.block.Block life8_4;
    moom.Mi life9_9;
    net.minecraft.util.EnumWorldBlockLayer life10_12;
    moom.bs[] life11_14;
    int life12_17;
    int life13_19;
    moom.bs life14_26;
    java.util.List life15_30;
    moom.DT life16_37;
    java.util.List life15_58;
    java.util.List life11_73;
    java.util.List life11_86;
    lexical_join_94: {
    lexical_join_68: {
    life7_1 = 0;
    life8_4 = __call1073_0(p2);
    life9_9 = __call1073_1(p4, p2, p3);
    life10_12 = __call1073_2(p4);
    life11_14 = __fieldRead1073_3();
    life12_17 = (life11_14).length;
    life13_19 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_66: {
    lexical_join_46: {
    if (!((life13_19 < life12_17))) {
        break lexical_join_68;
    }
    life14_26 = (life11_14)[life13_19];
    life15_30 = __call1073_4(p1, life14_26);
    if (!((!__call1073_5(life15_30)))) {
        break lexical_join_66;
    }
    life16_37 = __call1073_6(p3, life14_26);
    if (!(p5)) {
        break lexical_join_46;
    }
    if (!(__call1073_7(life8_4, p0, life16_37, life14_26))) {
        break lexical_join_66;
    }
    }
    life15_58 = __call1073_8(life15_30, p0, p2, p3, life14_26, life10_12, 0L, life9_9);
    __call1073_9(receiver, p0, p2, p3, p4, life15_58, life9_9);
    life7_1 = 1;
    }
    life13_19 += 1;
    continue lexical_cycle_20;
    }
    }
    life11_73 = __call1073_10(p1);
    if (!((__call1073_11(life11_73) > 0))) {
        break lexical_join_94;
    }
    life11_86 = __call1073_12(life11_73, p0, p2, p3, null, life10_12, 0L, life9_9);
    __call1073_13(receiver, p0, p2, p3, p4, life11_86, life9_9);
    life7_1 = 1;
    }
    return __integerCategory1073_14(life7_1);
}
public static void h1073_0(moom.Oo p0) throws Throwable {
    throw __call1107300_0(p0);
}
private static native net.minecraft.block.Block __call1073_0(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.Mi __call1073_1(moom.lw a0, net.minecraft.block.state.IBlockState a1, moom.DT a2) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __call1073_2(moom.lw a0) throws Throwable;
private static native moom.bs[] __fieldRead1073_3() throws Throwable;
private static native java.util.List __call1073_4(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native boolean __call1073_5(java.util.List a0) throws Throwable;
private static native moom.DT __call1073_6(moom.DT a0, moom.bs a1) throws Throwable;
private static native boolean __call1073_7(net.minecraft.block.Block a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.bs a3) throws Throwable;
private static native java.util.List __call1073_8(java.util.List a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, moom.bs a4, net.minecraft.util.EnumWorldBlockLayer a5, long a6, moom.Mi a7) throws Throwable;
private static native void __call1073_9(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, moom.lw a4, java.util.List a5, moom.Mi a6) throws Throwable;
private static native java.util.List __call1073_10(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native int __call1073_11(java.util.List a0) throws Throwable;
private static native java.util.List __call1073_12(java.util.List a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, java.lang.Object a4, net.minecraft.util.EnumWorldBlockLayer a5, long a6, moom.Mi a7) throws Throwable;
private static native void __call1073_13(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, moom.lw a4, java.util.List a5, moom.Mi a6) throws Throwable;
private static native boolean __integerCategory1073_14(int value) throws Throwable;
private static native java.lang.Throwable __call1107300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_37d6520bf0d78bedf8f3(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.client.resources.model.IBakedModel a2, net.minecraft.block.state.IBlockState a3, moom.DT a4, moom.lw a5, boolean a6) throws E;
private static final class __SourceHandler_37d6520bf0d78bedf8f3 {

public static boolean f1074(moom.kK receiver, net.minecraft.world.IBlockAccess p0, net.minecraft.client.resources.model.IBakedModel p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, moom.lw p4, boolean p5) throws Throwable {
    int life7_1;
    net.minecraft.block.Block life8_4;
    moom.Mi life9_9;
    net.minecraft.util.EnumWorldBlockLayer life10_12;
    moom.bs[] life11_14;
    int life12_17;
    int life13_19;
    moom.bs life14_26;
    java.util.List life15_30;
    moom.DT life16_37;
    int life17_53;
    java.util.List life15_63;
    java.util.List life11_81;
    java.util.List life11_94;
    lexical_join_105: {
    lexical_join_76: {
    life7_1 = 0;
    life8_4 = __call1074_0(p2);
    life9_9 = __call1074_1(p4, p2, p3);
    life10_12 = __call1074_2(p4);
    life11_14 = __fieldRead1074_3();
    life12_17 = (life11_14).length;
    life13_19 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_74: {
    lexical_join_46: {
    if (!((life13_19 < life12_17))) {
        break lexical_join_76;
    }
    life14_26 = (life11_14)[life13_19];
    life15_30 = __call1074_4(p1, life14_26);
    if (!((!__call1074_5(life15_30)))) {
        break lexical_join_74;
    }
    life16_37 = __call1074_6(p3, life14_26);
    if (!(p5)) {
        break lexical_join_46;
    }
    if (!(__call1074_7(life8_4, p0, life16_37, life14_26))) {
        break lexical_join_74;
    }
    }
    life17_53 = __call1074_8(life8_4, p0, life16_37);
    life15_63 = __call1074_9(life15_30, p0, p2, p3, life14_26, life10_12, 0L, life9_9);
    __call1074_10(receiver, p0, p2, p3, life14_26, life17_53, 0, p4, life15_63, life9_9);
    life7_1 = 1;
    }
    life13_19 += 1;
    continue lexical_cycle_20;
    }
    }
    life11_81 = __call1074_11(p1);
    if (!((__call1074_12(life11_81) > 0))) {
        break lexical_join_105;
    }
    life11_94 = __call1074_13(life11_81, p0, p2, p3, null, life10_12, 0L, life9_9);
    __call1074_14(receiver, p0, p2, p3, null, -1, 1, p4, life11_94, life9_9);
    life7_1 = 1;
    }
    return __integerCategory1074_15(life7_1);
}
public static void h1074_0(moom.Oo p0) throws Throwable {
    throw __call1107400_0(p0);
}
private static native net.minecraft.block.Block __call1074_0(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.Mi __call1074_1(moom.lw a0, net.minecraft.block.state.IBlockState a1, moom.DT a2) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __call1074_2(moom.lw a0) throws Throwable;
private static native moom.bs[] __fieldRead1074_3() throws Throwable;
private static native java.util.List __call1074_4(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native boolean __call1074_5(java.util.List a0) throws Throwable;
private static native moom.DT __call1074_6(moom.DT a0, moom.bs a1) throws Throwable;
private static native boolean __call1074_7(net.minecraft.block.Block a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.bs a3) throws Throwable;
private static native int __call1074_8(net.minecraft.block.Block a0, net.minecraft.world.IBlockAccess a1, moom.DT a2) throws Throwable;
private static native java.util.List __call1074_9(java.util.List a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, moom.bs a4, net.minecraft.util.EnumWorldBlockLayer a5, long a6, moom.Mi a7) throws Throwable;
private static native void __call1074_10(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, moom.bs a4, int a5, int a6, moom.lw a7, java.util.List a8, moom.Mi a9) throws Throwable;
private static native java.util.List __call1074_11(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native int __call1074_12(java.util.List a0) throws Throwable;
private static native java.util.List __call1074_13(java.util.List a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, java.lang.Object a4, net.minecraft.util.EnumWorldBlockLayer a5, long a6, moom.Mi a7) throws Throwable;
private static native void __call1074_14(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, java.lang.Object a4, int a5, int a6, moom.lw a7, java.util.List a8, moom.Mi a9) throws Throwable;
private static native boolean __integerCategory1074_15(int value) throws Throwable;
private static native java.lang.Throwable __call1107400_0(moom.Oo a0) throws Throwable;

}


public boolean b(net.minecraft.world.IBlockAccess p0, net.minecraft.client.resources.model.IBakedModel p1, net.minecraft.block.Block p2, moom.DT p3, moom.lw p4, boolean p5) {
java.lang.Object local7 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p3)));
    return (__sourceIntrinsic_booleanComparison((((moom.kK)(this)).c(((net.minecraft.world.IBlockAccess)(p0)), ((net.minecraft.client.resources.model.IBakedModel)(p1)), ((net.minecraft.block.state.IBlockState)(local7)), ((moom.DT)(p3)), ((moom.lw)(p4)), ((boolean)(p5))))) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8210_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/kK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.kK.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20796);
    if (((moom.kK.i)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.kK.h)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.kK.j)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.kK.j)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/kK", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.kK.i)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.kK.i)[life3_8])).longValue();
}


private boolean b(net.minecraft.world.IBlockAccess p0, net.minecraft.client.resources.model.IBakedModel p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, moom.lw p4, boolean p5) { return __sourceHandlerCall_6e1caa60221a89e31b1f(this, p0, p1, p2, p3, p4, p5); }


public boolean c(net.minecraft.world.IBlockAccess p0, net.minecraft.client.resources.model.IBakedModel p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, moom.lw p4, boolean p5) { return __sourceHandlerCall_37d6520bf0d78bedf8f3(this, p0, p1, p2, p3, p4, p5); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.kK.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27398;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
            throw new RuntimeException("moom/kK", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public boolean a(net.minecraft.world.IBlockAccess p0, net.minecraft.client.resources.model.IBakedModel p1, net.minecraft.block.Block p2, moom.DT p3, moom.lw p4, boolean p5) {
java.lang.Object local7 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p3)));
    return (__sourceIntrinsic_booleanComparison((((moom.kK)(this)).b(((net.minecraft.world.IBlockAccess)(p0)), ((net.minecraft.client.resources.model.IBakedModel)(p1)), ((net.minecraft.block.state.IBlockState)(local7)), ((moom.DT)(p3)), ((moom.lw)(p4)), ((boolean)(p5))))) != 0);
}


private void a(float p0, float p1, float p2, float p3, java.util.List<moom.lC> p4) { __sourceHandlerCall_07c7548493d0ddb3ad14(this, p0, p1, p2, p3, p4); }


public boolean a(net.minecraft.world.IBlockAccess p0, net.minecraft.client.resources.model.IBakedModel p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, moom.lw p4) {
java.lang.Object local6 = ((net.minecraft.block.state.IBlockState)(p2)).a__ch();
    ((net.minecraft.block.Block)(local6)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p3)));
    return (__sourceIntrinsic_booleanComparison((((moom.kK)(this)).a(((net.minecraft.world.IBlockAccess)(p0)), ((net.minecraft.client.resources.model.IBakedModel)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.DT)(p3)), ((moom.lw)(p4)), ((boolean)(true))))) != 0);
}


public boolean a(net.minecraft.world.IBlockAccess p0, net.minecraft.client.resources.model.IBakedModel p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, moom.lw p4, boolean p5) { return __sourceHandlerCall_9655cfd31420274f95e3(this, p0, p1, p2, p3, p4, p5); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8216_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/kK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.client.resources.model.IBakedModel p0, float p1, float p2, float p3, float p4) {
moom.bs[] life6_1;
    int life7_4;
    int life8_6;
    moom.bs life9_13;
    life6_1 = moom.bs.VALUES;
    life7_4 = (life6_1).length;
    life8_6 = 0;
    while ((life8_6 < life7_4)) {
        life9_13 = (life6_1)[life8_6];
        ((moom.kK)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((java.util.List)(((net.minecraft.client.resources.model.IBakedModel)(p0)).a(((moom.bs)(life9_13))))));
        life8_6 += 1;
    }
    ((moom.kK)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((java.util.List)(((net.minecraft.client.resources.model.IBakedModel)(p0)).a())));
    return;
}


private void a(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, int p4, boolean p5, moom.lw p6, java.util.List<moom.lC> p7, moom.Mi p8) { __sourceHandlerCall_51c823fb556d3bd0d167(this, p0, p1, p2, p3, p4, p5, p6, p7, p8); }


private void a(net.minecraft.block.Block p0, int[] p1, moom.bs p2, float[] p3, java.util.BitSet p4) { __sourceHandlerCall_fe33db347f419380baf7(this, p0, p1, p2, p3, p4); }


private void a(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.lw p3, java.util.List<moom.lC> p4, moom.Mi p5) { __sourceHandlerCall_12da6b526261a0a00347(this, p0, p1, p2, p3, p4, p5); }


private void a(net.minecraft.world.IBlockAccess p0, net.minecraft.client.resources.model.IBakedModel p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, moom.lw p4, boolean p5, long p6, moom.Mi p7, boolean p8) { __sourceHandlerCall_989cec607da3cc835ff9(this, p0, p1, p2, p3, p4, p5, p6, p7, p8); }


public static void a() { __sourceHandlerCall_3ba97a5b2d751276f38d(); }


public static float a(float p0) { return __sourceHandlerCall_ede0d6c759d7d1602f73(p0); }


public void a(net.minecraft.client.resources.model.IBakedModel p0, net.minecraft.block.state.IBlockState p1, float p2, boolean p3) {
long life5_3;
    net.minecraft.block.Block life7_6;
    int life8_19;
    float life9_41;
    float life10_58;
    float life11_69;
    life5_3 = (moom.kK.d ^ 52099793000743L);
    life7_6 = ((net.minecraft.block.state.IBlockState)(p1)).a__ch();
    ((net.minecraft.block.Block)(life7_6)).a__Void();
    moom.kZ.b(((float)(0x1.68p6f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    life8_19 = ((net.minecraft.block.Block)(life7_6)).d(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(life7_6)).a__fE(((net.minecraft.block.state.IBlockState)(p1))))));
    if (net.minecraft.client.renderer.EntityRenderer.f) {
        life8_19 = moom.ol.a(((int)(life8_19)));
    }
    life9_41 = (((float) ((life8_19 >> __sourceIntrinsic_f1a00c341220_invokedynamic1866_8(10431, (5817879136693401150L ^ life5_3))) & __sourceIntrinsic_f1a00c341220_invokedynamic1866_9(20457, (7019896982956527978L ^ life5_3)))) / 0x1.fep7f);
    life10_58 = (((float) ((life8_19 >> __sourceIntrinsic_f1a00c341220_invokedynamic1866_10(13445, (7744548542909491720L ^ life5_3))) & __sourceIntrinsic_f1a00c341220_invokedynamic1866_11(10778, (4583143897744553116L ^ life5_3)))) / 0x1.fep7f);
    life11_69 = (((float) (life8_19 & __sourceIntrinsic_f1a00c341220_invokedynamic1866_12(10778, (4583143897744553116L ^ life5_3)))) / 0x1.fep7f);
    try {
        if ((!p3)) {
        moom.kZ.c(((float)(p2)), ((float)(p2)), ((float)(p2)), ((float)(0x1.0p0f)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.kK.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    ((moom.kK)(this)).a(((net.minecraft.client.resources.model.IBakedModel)(p0)), ((float)(p2)), ((float)(life9_41)), ((float)(life10_58)), ((float)(life11_69)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8216_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f1a00c341220_invokedynamic1866_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f1a00c341220_invokedynamic1866_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f1a00c341220_invokedynamic1866_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f1a00c341220_invokedynamic1866_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f1a00c341220_invokedynamic1866_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8210_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
