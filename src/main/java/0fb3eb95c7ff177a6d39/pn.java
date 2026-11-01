package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pn extends moom.h1 {

public int y;

private com.moon.pe z;

private com.moon.nX A;

private static boolean B;

private static long C;

private static long[] D;

private static java.lang.Integer[] E;

private static java.util.Map F;

private static long H;

public pn(com.moon.pe p0) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }

private static void __sourceConstructorBody_59d6f6137c87958b(com.moon.pn receiver, com.moon.pe p0) throws Throwable {
long local2 = (com.moon.pn.C ^ 126760109446096L);
    com.moon.pn.__sourceConstructorInit_59d6f6137c87958b_0(((com.moon.pn)(receiver)), ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())), ((int)(((com.moon.pe)(p0)).k)), ((int)(((com.moon.pe)(p0)).l)), ((int)(__sourceIntrinsic_59d6f6137c87958b_originalDynamicSite1520_4(14064, (6342533307416652824L ^ local2)))), ((int)((((com.moon.pe)(p0)).l - __sourceIntrinsic_59d6f6137c87958b_originalDynamicSite1520_6(28848, (1327002856596433477L ^ local2))))), ((int)(__sourceIntrinsic_59d6f6137c87958b_originalDynamicSite1520_7(17731, (4462129733816475564L ^ local2)))));
    ((com.moon.pn)(receiver)).y = ((int)(0));
    ((com.moon.pn)(receiver)).A = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.pn)(receiver)).z = ((com.moon.pe)(p0));
    return;
}


static {
C = ((long)(((moom._a)(moom._c.a(((long)(5149536916143206716L)), ((long)(7767272639989680660L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(212107494453727L)))));
    int __sourceSpill379_6 = 0;
    F = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.pn.c(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill379_6))));
    long local5_life9 = (com.moon.pn.C ^ 129934968232914L);
    javax.crypto.Cipher local7_life11;
    javax.crypto.Cipher __sourceSpill379_13 = (local7_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill379_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill379_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill379_16 = new byte[8];
    (__sourceSpill379_16)[0] = ((byte) ((int) (local5_life9 >>> 56)));
    int local8_life17 = 1;
    while ((local8_life17 < 8)) {
        (__sourceSpill379_16)[local8_life17] = ((byte) ((int) ((local5_life9 << (local8_life17 * 8)) >>> 56)));
        local8_life17 += 1;
    }
    byte[] __sourcePreallocation379_18 = __sourceSpill379_16;
    ((javax.crypto.Cipher)(__sourceSpill379_13)).init(((int)(__sourceSpill379_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill379_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation379_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life21 = new long[23];
    int local10_life22 = 0;
    java.lang.String local11_life23;
    int local12_life25 = ((java.lang.String)((local11_life23 = "ÐIº¥³ç­§+¼È9ÇB\013ò\003 ¹àX¢Ùü¥DÙ4ÎvèOPHMåÓ2ü;Ûæ`r\025\0032ÆþÔl;Q°nû}{PÊ¤OÔvH6L*ÈòÐßúJ-TÝ\bj\t9Í»fq¿èëù\025ûî\037/¨À;ìù£uõ¦\"É\025äjpÑ4$\026^\013\001\030DnXmg3ÙY¢\003¬Ëj-©ÄÍÓ\002lèj§ãK|ãêGÒ:\026"))).length();
    int local9_life26 = 0;
    do {
        java.lang.String __sourceSpill379_27 = local11_life23;
        int __sourceSpill379_28 = local9_life26;
        local9_life26 += 8;
        byte[] local14_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill379_27)).substring(((int)(__sourceSpill379_28)), ((int)(local9_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill379_32 = local13_life21;
        int __sourceSpill379_33 = local10_life22;
        local10_life22 += 1;
        long local15_life34 = (((((((((((long) (local14_life31)[0]) & 255L) << 56) | ((((long) (local14_life31)[1]) & 255L) << 48)) | ((((long) (local14_life31)[2]) & 255L) << 40)) | ((((long) (local14_life31)[3]) & 255L) << 32)) | ((((long) (local14_life31)[4]) & 255L) << 24)) | ((((long) (local14_life31)[5]) & 255L) << 16)) | ((((long) (local14_life31)[6]) & 255L) << 8)) | (((long) (local14_life31)[7]) & 255L));
        byte[] __sourceSpill379_35 = new byte[8];
        (__sourceSpill379_35)[0] = ((byte) ((int) (local15_life34 >>> 56)));
        (__sourceSpill379_35)[1] = ((byte) ((int) (local15_life34 >>> 48)));
        (__sourceSpill379_35)[2] = ((byte) ((int) (local15_life34 >>> 40)));
        (__sourceSpill379_35)[3] = ((byte) ((int) (local15_life34 >>> 32)));
        (__sourceSpill379_35)[4] = ((byte) ((int) (local15_life34 >>> 24)));
        (__sourceSpill379_35)[5] = ((byte) ((int) (local15_life34 >>> 16)));
        (__sourceSpill379_35)[6] = ((byte) ((int) (local15_life34 >>> 8)));
        (__sourceSpill379_35)[7] = ((byte) ((int) local15_life34));
        javax.crypto.Cipher __sourceSpill379_36 = local7_life11;
        byte[] local17_life38 = ((javax.crypto.Cipher)(__sourceSpill379_36)).doFinal(((byte[])(__sourceSpill379_35)));
        (__sourceSpill379_32)[__sourceSpill379_33] = (((((((((((long) (local17_life38)[0]) & 255L) << 56) | ((((long) (local17_life38)[1]) & 255L) << 48)) | ((((long) (local17_life38)[2]) & 255L) << 40)) | ((((long) (local17_life38)[3]) & 255L) << 32)) | ((((long) (local17_life38)[4]) & 255L) << 24)) | ((((long) (local17_life38)[5]) & 255L) << 16)) | ((((long) (local17_life38)[6]) & 255L) << 8)) | (((long) (local17_life38)[7]) & 255L));
    } while ((!(local9_life26 >= local12_life25)));
    local12_life25 = ((java.lang.String)((local11_life23 = "ÌtalEÍÎ«×*óæyT"))).length();
    local9_life26 = 0;
    do {
        java.lang.String __sourceSpill379_40 = local11_life23;
        int __sourceSpill379_41 = local9_life26;
        local9_life26 += 8;
        byte[] local14_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill379_40)).substring(((int)(__sourceSpill379_41)), ((int)(local9_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill379_45 = local13_life21;
        int __sourceSpill379_46 = local10_life22;
        local10_life22 += 1;
        long local15_life47 = (((((((((((long) (local14_life44)[0]) & 255L) << 56) | ((((long) (local14_life44)[1]) & 255L) << 48)) | ((((long) (local14_life44)[2]) & 255L) << 40)) | ((((long) (local14_life44)[3]) & 255L) << 32)) | ((((long) (local14_life44)[4]) & 255L) << 24)) | ((((long) (local14_life44)[5]) & 255L) << 16)) | ((((long) (local14_life44)[6]) & 255L) << 8)) | (((long) (local14_life44)[7]) & 255L));
        byte[] __sourceSpill379_48 = new byte[8];
        (__sourceSpill379_48)[0] = ((byte) ((int) (local15_life47 >>> 56)));
        (__sourceSpill379_48)[1] = ((byte) ((int) (local15_life47 >>> 48)));
        (__sourceSpill379_48)[2] = ((byte) ((int) (local15_life47 >>> 40)));
        (__sourceSpill379_48)[3] = ((byte) ((int) (local15_life47 >>> 32)));
        (__sourceSpill379_48)[4] = ((byte) ((int) (local15_life47 >>> 24)));
        (__sourceSpill379_48)[5] = ((byte) ((int) (local15_life47 >>> 16)));
        (__sourceSpill379_48)[6] = ((byte) ((int) (local15_life47 >>> 8)));
        (__sourceSpill379_48)[7] = ((byte) ((int) local15_life47));
        javax.crypto.Cipher __sourceSpill379_49 = local7_life11;
        byte[] local17_life51 = ((javax.crypto.Cipher)(__sourceSpill379_49)).doFinal(((byte[])(__sourceSpill379_48)));
        (__sourceSpill379_45)[__sourceSpill379_46] = (((((((((((long) (local17_life51)[0]) & 255L) << 56) | ((((long) (local17_life51)[1]) & 255L) << 48)) | ((((long) (local17_life51)[2]) & 255L) << 40)) | ((((long) (local17_life51)[3]) & 255L) << 32)) | ((((long) (local17_life51)[4]) & 255L) << 24)) | ((((long) (local17_life51)[5]) & 255L) << 16)) | ((((long) (local17_life51)[6]) & 255L) << 8)) | (((long) (local17_life51)[7]) & 255L));
    } while ((!(local9_life26 >= local12_life25)));
    D = ((long[])(local13_life21));
    E = ((java.lang.Integer[])(new java.lang.Integer[23]));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill379_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill379_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill379_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill379_60 = new byte[8];
    (__sourceSpill379_60)[0] = ((byte) ((int) (local5_life9 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill379_60)[local1_life61] = ((byte) ((int) ((local5_life9 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation379_62 = __sourceSpill379_60;
    ((javax.crypto.Cipher)(__sourceSpill379_57)).init(((int)(__sourceSpill379_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill379_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation379_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life65 = 8490598451524836906L;
    byte[] __sourceSpill379_66 = new byte[8];
    (__sourceSpill379_66)[0] = ((byte) ((int) (local2_life65 >>> 56)));
    (__sourceSpill379_66)[1] = ((byte) ((int) (local2_life65 >>> 48)));
    (__sourceSpill379_66)[2] = ((byte) ((int) (local2_life65 >>> 40)));
    (__sourceSpill379_66)[3] = ((byte) ((int) (local2_life65 >>> 32)));
    (__sourceSpill379_66)[4] = ((byte) ((int) (local2_life65 >>> 24)));
    (__sourceSpill379_66)[5] = ((byte) ((int) (local2_life65 >>> 16)));
    (__sourceSpill379_66)[6] = ((byte) ((int) (local2_life65 >>> 8)));
    (__sourceSpill379_66)[7] = ((byte) ((int) local2_life65));
    javax.crypto.Cipher __sourceSpill379_67 = local0_life55;
    byte[] local4_life69 = ((javax.crypto.Cipher)(__sourceSpill379_67)).doFinal(((byte[])(__sourceSpill379_66)));
    H = ((long)((((((((((((long) (local4_life69)[0]) & 255L) << 56) | ((((long) (local4_life69)[1]) & 255L) << 48)) | ((((long) (local4_life69)[2]) & 255L) << 40)) | ((((long) (local4_life69)[3]) & 255L) << 32)) | ((((long) (local4_life69)[4]) & 255L) << 24)) | ((((long) (local4_life69)[5]) & 255L) << 16)) | ((((long) (local4_life69)[6]) & 255L) << 8)) | (((long) (local4_life69)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_59d6f6137c87958b_0(com.moon.pn a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_a6cfdaa6d93b0a6dd06c(com.moon.pn a0, java.lang.String a1, float a2, float a3, int a4, int a5) throws E;
private static final class __SourceHandler_a6cfdaa6d93b0a6dd06c {

public static void f164(com.moon.pn receiver, java.lang.String p0, float p1, float p2, int p3, int p4) throws Throwable {
    long life6_3;
    com.moon.hW life8_26;
    float life9_28;
    float life10_30;
    float life11_32;
    float life12_34;
    life6_3 = (__fieldRead164_0() ^ 129918121573342L);
    __call164_5(__call164_2(__call164_1(p0), p0), __call164_4(__call164_3()));
    __call164_9(__call164_7(__call164_6()), __call164_8(p0));
    __call164_11(__invokedynamic164_10(25054, (3830453007147438883L ^ life6_3)));
    life8_26 = __call164_15(__call164_14(__call164_12(), __fieldRead164_13()));
    life9_28 = 0x1.0p-3f;
    life10_30 = 0x1.0p-2f;
    life11_32 = 0x1.4p-1f;
    life12_34 = 0x1.8p-1f;
    __call164_17(life8_26, __call164_16((p1 - 0x1.0p0f), (p2 - 0x1.0p0f), ((p1 + ((float) p3)) + 0x1.0p1f), ((p2 + ((float) p4)) + 0x1.0p1f), life9_28, life9_28, life10_30, life10_30, 0x1.0p2f, -1));
    __call164_19(life8_26, __call164_18((p1 - 0x1.0p0f), (p2 - 0x1.0p0f), ((p1 + ((float) p3)) + 0x1.0p1f), ((p2 + ((float) p4)) + 0x1.0p1f), life11_32, life9_28, life12_34, life10_30, 0x1.0p2f, -1));
    __call164_20(life8_26);
    __call164_22(__invokedynamic164_21(25699, (2332468460013393543L ^ life6_3)));
    return;
}
public static void h164_0(java.lang.Exception p0, com.moon.hW p1) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    return;
}
private static native long __fieldRead164_0() throws Throwable;
private static native moom.DD __call164_1(java.lang.String a0) throws Throwable;
private static native moom.n7 __call164_2(moom.DD a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call164_3() throws Throwable;
private static native moom.oR __call164_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call164_5(moom.n7 a0, moom.oR a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call164_6() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call164_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __call164_8(java.lang.String a0) throws Throwable;
private static native void __call164_9(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic164_10(int a0, long a1) throws Throwable;
private static native void __call164_11(int a0) throws Throwable;
private static native com.moon.hX __call164_12() throws Throwable;
private static native com.moon.cb __fieldRead164_13() throws Throwable;
private static native com.moon.hX __call164_14(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call164_15(com.moon.hX a0) throws Throwable;
private static native com.moon.i6 __call164_16(float a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8, int a9) throws Throwable;
private static native void __call164_17(com.moon.hW a0, com.moon.i6 a1) throws Throwable;
private static native com.moon.i6 __call164_18(float a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8, int a9) throws Throwable;
private static native void __call164_19(com.moon.hW a0, com.moon.i6 a1) throws Throwable;
private static native void __call164_20(com.moon.hW a0) throws Throwable;
private static native int __invokedynamic164_21(int a0, long a1) throws Throwable;
private static native void __call164_22(int a0) throws Throwable;

}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static boolean b__Boolean() {
return ((((com.moon.pn.B) ? 1 : 0)) != 0);
}


protected int b() {
long local1 = (com.moon.pn.C ^ 1849981300610L);
    moom.ir local3 = com.moon.nS.a();
    float local4 = ((float) (((moom.ir)(local3)).a__Int() - __sourceIntrinsic_e1958f95391c_originalDynamicSite619_3(25639, (4631568750188036752L ^ local1))));
    int local5 = ((int) java.lang.Math.floor(((double)(((double) (local4 / ((float) (((com.moon.pn)(this)).e() + 3))))))));
    return (((((com.moon.pn)(this)).a() / java.lang.Math.max(((int)(local5)), ((int)(1)))) * this.h) + this.v);
}


public static boolean c__Boolean() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.pn.b__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public void c__Void() {
int lexicalValue374_60_0;
    int lexicalValue374_123_0;
    int lexicalValue374_140_0;
    int lexicalValue374_148_0;
    int lexicalValue374_155_0;
    int lexicalValue374_225_0;
    int lexicalValue374_232_0;
    int lexicalValue374_265_0;
    int lexicalValue374_324_0;
    int lexicalValue374_341_0;
    int lexicalValue374_349_0;
    int lexicalValue374_356_0;
    int lexicalValue374_423_0;
    int lexicalValue374_427_0;
    int lexicalValue374_429_0;
    int lexicalValue374_450_0;
    int lexicalValue374_465_0;
    int lexicalValue374_501_0;
    int lexicalValue374_501_1;
    com.moon.pn lexicalValue374_547_0;
    com.moon.pn lexicalValue374_567_0;
    com.moon.pn lexicalValue374_576_0;
    int lexicalValue374_579_0;
    int lexicalValue374_585_0;
    int lexicalValue374_593_0;
    int lexicalValue374_597_0;
    boolean spill374_0;
    boolean spill374_1;
    boolean spill374_2;
    int spill374_3;
    int spill374_4;
    int spill374_5;
    com.moon.pn spill374_6;
    int spill374_7;
    int spill374_8;
    com.moon.pn spill374_9;
    com.moon.pn spill374_10;
    int spill374_11;
    int spill374_12;
    com.moon.pn spill374_13;
    com.moon.pn spill374_14;
    int spill374_15;
    int spill374_16;
    int spill374_17;
    long life1_3;
    moom.ir life4_6;
    float life5_16;
    int life6_27;
    int life3_28;
    int life7_31;
    int life8_41;
    float life9_51;
    int life10_106;
    float life11_123;
    int life12_128;
    int life13_206;
    float life14_220;
    int life15_223;
    float life16_235;
    float life17_239;
    int life18_244;
    int life10_349;
    int life11_374;
    int life12_376;
    float life13_393;
    int life14_398;
    int life15_476;
    float life16_490;
    int life17_494;
    float life18_506;
    float life19_510;
    int life20_515;
    int life21_564;
    int life13_603;
    int life14_630;
    int life15_658;
    int life15_677;
    int life10_744;
    lexical_join_610: {
    lexical_join_598: {
    lexical_join_597: {
    lexical_join_593: {
    lexical_join_592: {
    lexical_join_585: {
    lexical_join_579: {
    lexical_join_578: {
    lexical_join_576: {
    lexical_join_575: {
    lexical_join_573: {
    lexical_join_567: {
    lexical_join_566: {
    lexical_join_564: {
    lexical_join_557: {
    lexical_join_549: {
    lexical_join_547: {
    lexical_join_546: {
    lexical_join_501: {
    lexical_join_491: {
    lexical_join_465: {
    lexical_join_455: {
    lexical_join_450: {
    lexical_join_449: {
    lexical_join_265: {
    lexical_join_264: {
    lexical_join_232: {
    lexical_join_225: {
    lexical_join_223: {
    lexical_join_60: {
    life1_3 = (com.moon.pn.C ^ 69296792096039L);
    spill374_0 = com.moon.pn.c__Boolean();
    life4_6 = com.moon.nS.a();
    life5_16 = ((float) (((moom.ir)(life4_6)).a__Int() - __sourceIntrinsic_7ac46ee229a8_invokedynamic374_4(25639, (4631562534000074805L ^ life1_3))));
    life6_27 = ((int) java.lang.Math.floor(((double)(((double) (life5_16 / ((float) (((com.moon.pn)(this)).e() + 3))))))));
    life3_28 = ((spill374_0) ? 1 : 0);
    life7_31 = ((com.moon.pn)(this)).a();
    life8_41 = ((this.g + (this.b / 2)) + 2);
    life9_51 = (((float) (this.d + 4)) - ((com.moon.nX)(this.A)).b());
    spill374_1 = ((com.moon.pn)(this)).b__Boolean(((int)(this.l)));
    if (!((life3_28 != 0))) {
        lexicalValue374_60_0 = ((spill374_1) ? 1 : 0);
        break lexical_join_60;
    }
    if (!(spill374_1)) {
        break lexical_join_610;
    }
    lexicalValue374_60_0 = org.lwjgl.input.Mouse.getEventButton();
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_225_0 = lexicalValue374_60_0;
        break lexical_join_225;
    }
    if (!((lexicalValue374_60_0 == 0))) {
        break lexical_join_223;
    }
    spill374_2 = org.lwjgl.input.Mouse.getEventButtonState();
    if (!((life3_28 != 0))) {
        lexicalValue374_225_0 = ((spill374_2) ? 1 : 0);
        break lexical_join_225;
    }
    if (!(spill374_2)) {
        break lexical_join_223;
    }
    spill374_3 = this.l;
    if (!((life3_28 != 0))) {
        lexicalValue374_225_0 = spill374_3;
        break lexical_join_225;
    }
    if (!((spill374_3 >= this.d))) {
        break lexical_join_223;
    }
    spill374_4 = this.l;
    if (!((life3_28 != 0))) {
        lexicalValue374_225_0 = spill374_4;
        break lexical_join_225;
    }
    if (!((spill374_4 <= this.e))) {
        break lexical_join_223;
    }
    life10_106 = 0;
    lexical_cycle_83: while (true) {
    lexical_join_221: {
    lexical_join_220: {
    lexical_join_155: {
    lexical_join_148: {
    lexical_join_140: {
    lexical_join_132: {
    lexical_join_126: {
    lexical_join_123: {
    if (!((life10_106 < life7_31))) {
        break lexical_join_223;
    }
    life11_123 = ((life9_51 + ((float) ((life10_106 / life6_27) * this.h))) + ((float) this.v));
    life12_128 = (this.h - 4);
    spill374_5 = recovery.source.CarrierOps.fcmpl(((float)(life11_123)), ((float)(((float) this.e))));
    if (!((life3_28 != 0))) {
        lexicalValue374_225_0 = spill374_5;
        break lexical_join_225;
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_123_0 = spill374_5;
        break lexical_join_123;
    }
    if (!((spill374_5 <= 0))) {
        break lexical_join_126;
    }
    lexicalValue374_123_0 = recovery.source.CarrierOps.fcmpg(((float)((life11_123 + ((float) life12_128)))), ((float)(((float) this.d))));
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_140_0 = lexicalValue374_123_0;
        break lexical_join_140;
    }
    if (!((lexicalValue374_123_0 < 0))) {
        break lexical_join_132;
    }
    }
    ((com.moon.pn)(this)).a(((int)(life10_106)), ((int)(life8_41)), ((int)(moom.Dr.b__Int(((float)(life11_123))))));
    }
    lexicalValue374_140_0 = recovery.source.CarrierOps.fcmpl(((float)(life11_123)), ((float)(((float) (this.d - this.h)))));
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_148_0 = lexicalValue374_140_0;
        break lexical_join_148;
    }
    if (!((lexicalValue374_140_0 >= 0))) {
        break lexical_join_220;
    }
    lexicalValue374_148_0 = recovery.source.CarrierOps.fcmpg(((float)(life11_123)), ((float)(((float) this.e))));
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_155_0 = lexicalValue374_148_0;
        break lexical_join_155;
    }
    if (!((lexicalValue374_148_0 <= 0))) {
        break lexical_join_220;
    }
    lexicalValue374_155_0 = (((com.moon.pn)(this)).e() + 3);
    }
    life13_206 = lexicalValue374_155_0;
    life14_220 = (((float) (life13_206 * (life10_106 % life6_27))) - (((float) (life13_206 * life6_27)) / 0x1.0p1f));
    life15_223 = ((com.moon.pn)(this)).e();
    life16_235 = ((((float) this.g) + (((float) this.b) / 0x1.0p1f)) + life14_220);
    life17_239 = (life11_123 - 0x1.0p0f);
    life18_244 = (this.h - 3);
    if (!((life3_28 != 0))) {
        break lexical_join_221;
    }
    if (!(((com.moon.pn)(this)).a(((int)(this.k)), ((int)(this.l)), ((float)(life16_235)), ((float)(life17_239)), ((float)(((float) life15_223))), ((float)(((float) life18_244)))))) {
        break lexical_join_220;
    }
    ((com.moon.pn)(this)).a(((int)(life10_106)), ((boolean)(false)), ((int)(this.k)), ((int)(this.l)));
    this.q = ((int)(life10_106));
    }
    life10_106 += 1;
    }
    if (!((life3_28 == 0))) { continue lexical_cycle_83; }
    break lexical_cycle_83;
    }
    }
    lexicalValue374_225_0 = ((org.lwjgl.input.Mouse.isButtonDown(((int)(0)))) ? 1 : 0);
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_232_0 = lexicalValue374_225_0;
        break lexical_join_232;
    }
    if (!((lexicalValue374_225_0 != 0))) {
        break lexical_join_575;
    }
    spill374_6 = this;
    if (!((life3_28 != 0))) {
        lexicalValue374_576_0 = spill374_6;
        break lexical_join_576;
    }
    lexicalValue374_232_0 = ((((com.moon.pn)(spill374_6)).a__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue374_232_0 != 0))) {
        break lexical_join_575;
    }
    spill374_7 = this.n;
    if (!((life3_28 != 0))) {
        lexicalValue374_265_0 = spill374_7;
        break lexical_join_265;
    }
    if (!((spill374_7 != -1))) {
        break lexical_join_264;
    }
    spill374_8 = this.n;
    if (!((life3_28 != 0))) {
        lexicalValue374_579_0 = spill374_8;
        break lexical_join_579;
    }
    if (!((spill374_8 >= 0))) {
        break lexical_join_578;
    }
    com.moon.pn __stackOp374_56_0 = this;
    ((com.moon.pn)(__stackOp374_56_0)).p = ((float)((((com.moon.pn)(__stackOp374_56_0)).p - (((float) (this.l - this.n)) * this.o))));
    this.n = ((int)(this.l));
    if (!((life3_28 == 0))) {
        break lexical_join_578;
    }
    }
    lexicalValue374_265_0 = 1;
    }
    life10_349 = lexicalValue374_265_0;
    spill374_9 = this;
    if (!((life3_28 != 0))) {
        lexicalValue374_567_0 = spill374_9;
        break lexical_join_567;
    }
    if (!((((com.moon.pn)(spill374_9)).l >= this.d))) {
        break lexical_join_566;
    }
    spill374_10 = this;
    if (!((life3_28 != 0))) {
        lexicalValue374_567_0 = spill374_10;
        break lexical_join_567;
    }
    if (!((((com.moon.pn)(spill374_10)).l <= this.e))) {
        break lexical_join_566;
    }
    life11_374 = 0;
    life12_376 = 0;
    lexical_cycle_284: while (true) {
    lexical_join_447: {
    lexical_join_446: {
    lexical_join_429: {
    lexical_join_428: {
    lexical_join_427: {
    lexical_join_423: {
    lexical_join_356: {
    lexical_join_349: {
    lexical_join_341: {
    lexical_join_333: {
    lexical_join_327: {
    lexical_join_324: {
    if (!((life12_376 < life7_31))) {
        break lexical_join_449;
    }
    life13_393 = ((life9_51 + ((float) ((life12_376 / life6_27) * this.h))) + ((float) this.v));
    life14_398 = (this.h - 4);
    spill374_11 = recovery.source.CarrierOps.fcmpl(((float)(life13_393)), ((float)(((float) this.e))));
    if (!((life3_28 != 0))) {
        lexicalValue374_450_0 = spill374_11;
        break lexical_join_450;
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_324_0 = spill374_11;
        break lexical_join_324;
    }
    if (!((spill374_11 <= 0))) {
        break lexical_join_327;
    }
    lexicalValue374_324_0 = recovery.source.CarrierOps.fcmpg(((float)((life13_393 + ((float) life14_398)))), ((float)(((float) this.d))));
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_341_0 = lexicalValue374_324_0;
        break lexical_join_341;
    }
    if (!((lexicalValue374_324_0 < 0))) {
        break lexical_join_333;
    }
    }
    ((com.moon.pn)(this)).a(((int)(life12_376)), ((int)(life8_41)), ((int)(moom.Dr.b__Int(((float)(life13_393))))));
    }
    lexicalValue374_341_0 = recovery.source.CarrierOps.fcmpl(((float)(life13_393)), ((float)(((float) (this.d - this.h)))));
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_349_0 = lexicalValue374_341_0;
        break lexical_join_349;
    }
    if (!((lexicalValue374_341_0 >= 0))) {
        break lexical_join_446;
    }
    lexicalValue374_349_0 = recovery.source.CarrierOps.fcmpg(((float)(life13_393)), ((float)(((float) this.e))));
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_356_0 = lexicalValue374_349_0;
        break lexical_join_356;
    }
    if (!((lexicalValue374_349_0 <= 0))) {
        break lexical_join_446;
    }
    lexicalValue374_356_0 = (((com.moon.pn)(this)).e() + 3);
    }
    life15_476 = lexicalValue374_356_0;
    life16_490 = (((float) (life15_476 * (life12_376 % life6_27))) - (((float) (life15_476 * life6_27)) / 0x1.0p1f));
    moom.kZ.l();
    life17_494 = ((com.moon.pn)(this)).e();
    life18_506 = ((((float) this.g) + (((float) this.b) / 0x1.0p1f)) + life16_490);
    life19_510 = (life13_393 - 0x1.0p0f);
    life20_515 = (this.h - 3);
    if (!((life3_28 != 0))) {
        break lexical_join_447;
    }
    if (!(((com.moon.pn)(this)).a(((int)(this.k)), ((int)(this.l)), ((float)(life18_506)), ((float)(life19_510)), ((float)(((float) life17_494))), ((float)(((float) life20_515)))))) {
        break lexical_join_446;
    }
    spill374_12 = life12_376;
    if (!((life3_28 != 0))) {
        lexicalValue374_423_0 = spill374_12;
        break lexical_join_423;
    }
    if (!((spill374_12 == this.q))) {
        break lexical_join_428;
    }
    lexicalValue374_423_0 = recovery.source.CarrierOps.lcmp(((long)((net.minecraft.client.Minecraft.a__Long() - this.r))), ((long)(com.moon.pn.H)));
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_427_0 = lexicalValue374_423_0;
        break lexical_join_427;
    }
    if (!((lexicalValue374_423_0 < 0))) {
        break lexical_join_428;
    }
    lexicalValue374_427_0 = 1;
    }
    lexicalValue374_429_0 = lexicalValue374_427_0;
    break lexical_join_429;
    }
    lexicalValue374_429_0 = 0;
    }
    life21_564 = lexicalValue374_429_0;
    ((com.moon.pn)(this)).a(((int)(life12_376)), ((boolean)__sourceIntrinsic_integerToBoolean((life21_564))), ((int)(this.k)), ((int)(this.l)));
    this.q = ((int)(life12_376));
    this.r = ((long)(net.minecraft.client.Minecraft.a__Long()));
    life11_374 = 1;
    }
    life12_376 += 1;
    }
    if (!((life3_28 == 0))) { continue lexical_cycle_284; }
    break lexical_cycle_284;
    }
    }
    lexicalValue374_450_0 = life11_374;
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_465_0 = lexicalValue374_450_0;
        break lexical_join_465;
    }
    if (!((lexicalValue374_450_0 != 0))) {
        break lexical_join_455;
    }
    life10_349 = 0;
    }
    life12_376 = ((com.moon.pn)(this)).f();
    lexicalValue374_465_0 = (life12_376 + __sourceIntrinsic_7ac46ee229a8_invokedynamic374_103(28404, (481023189425040104L ^ life1_3)));
    }
    life13_603 = lexicalValue374_465_0;
    spill374_13 = this;
    if (!((life3_28 != 0))) {
        lexicalValue374_547_0 = spill374_13;
        break lexical_join_547;
    }
    if (!((((com.moon.pn)(spill374_13)).k >= life12_376))) {
        break lexical_join_546;
    }
    spill374_14 = this;
    if (!((life3_28 != 0))) {
        lexicalValue374_547_0 = spill374_14;
        break lexical_join_547;
    }
    if (!((((com.moon.pn)(spill374_14)).k <= life13_603))) {
        break lexical_join_546;
    }
    this.o = ((float)(-0x1.0p0f));
    life14_630 = ((com.moon.pn)(this)).c();
    spill374_15 = life14_630;
    spill374_16 = 1;
    if (!((life3_28 != 0))) {
        lexicalValue374_501_0 = spill374_15;
        lexicalValue374_501_1 = spill374_16;
        break lexical_join_501;
    }
    if (!((spill374_15 < spill374_16))) {
        break lexical_join_491;
    }
    life14_630 = 1;
    }
    lexicalValue374_501_0 = (this.e - this.d);
    lexicalValue374_501_1 = (this.e - this.d);
    }
    life15_658 = ((int) (((float) (lexicalValue374_501_0 * lexicalValue374_501_1)) / ((float) ((com.moon.pn)(this)).b())));
    life15_677 = moom.Dr.a(((int)(life15_658)), ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic374_113(23253, (5482608983514390220L ^ life1_3)))), ((int)(((this.e - this.d) - __sourceIntrinsic_7ac46ee229a8_invokedynamic374_116(30773, (4845337290931485732L ^ life1_3))))));
    com.moon.pn __stackOp374_118_0 = this;
    ((com.moon.pn)(__stackOp374_118_0)).o = ((float)((((com.moon.pn)(__stackOp374_118_0)).o / (((float) ((this.e - this.d) - life15_677)) / ((float) life14_630)))));
    if (!((life3_28 == 0))) {
        break lexical_join_549;
    }
    }
    lexicalValue374_547_0 = this;
    }
    ((com.moon.pn)(lexicalValue374_547_0)).o = ((float)(0x1.0p0f));
    }
    if (!((life10_349 != 0))) {
        break lexical_join_557;
    }
    this.n = ((int)(this.l));
    if (!((life3_28 == 0))) {
        break lexical_join_564;
    }
    }
    this.n = ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic374_126(144, (4526161102629454999L ^ life1_3))));
    }
    if (!((life3_28 == 0))) {
        break lexical_join_573;
    }
    }
    lexicalValue374_567_0 = this;
    }
    ((com.moon.pn)(lexicalValue374_567_0)).n = ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic374_128(9851, (9156295793416888940L ^ life1_3))));
    }
    if (!((life3_28 == 0))) {
        break lexical_join_578;
    }
    }
    lexicalValue374_576_0 = this;
    }
    ((com.moon.pn)(lexicalValue374_576_0)).n = ((int)(-1));
    }
    lexicalValue374_579_0 = org.lwjgl.input.Mouse.getEventDWheel();
    }
    life10_744 = lexicalValue374_579_0;
    spill374_17 = life10_744;
    if (!((life3_28 != 0))) {
        lexicalValue374_585_0 = spill374_17;
        break lexical_join_585;
    }
    if (!((spill374_17 != 0))) {
        break lexical_join_610;
    }
    lexicalValue374_585_0 = life10_744;
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_593_0 = lexicalValue374_585_0;
        break lexical_join_593;
    }
    if (!((lexicalValue374_585_0 > 0))) {
        break lexical_join_592;
    }
    life10_744 = -1;
    if (!((life3_28 == 0))) {
        break lexical_join_598;
    }
    }
    lexicalValue374_593_0 = life10_744;
    }
    if (!((life3_28 != 0))) {
        lexicalValue374_597_0 = lexicalValue374_593_0;
        break lexical_join_597;
    }
    if (!((lexicalValue374_593_0 < 0))) {
        break lexical_join_598;
    }
    lexicalValue374_597_0 = 1;
    }
    life10_744 = lexicalValue374_597_0;
    }
    com.moon.pn __stackOp374_132_0 = this;
    ((com.moon.pn)(__stackOp374_132_0)).p = ((float)((((com.moon.pn)(__stackOp374_132_0)).p + ((float) ((life10_744 * this.h) / 2)))));
    }
    return;
}


public static void c(boolean p0) {
B = ((boolean)(p0));
    return;
}


protected int f() {
long local1 = (com.moon.pn.C ^ 112574719619632L);
    moom.ir local3 = com.moon.nS.a();
    float local4 = ((float) (((moom.ir)(local3)).a__Int() - __sourceIntrinsic_d5f736cb4191_originalDynamicSite620_3(25639, (4631605807649398562L ^ local1))));
    int local5 = ((int) java.lang.Math.floor(((double)(((double) (local4 / ((float) (((com.moon.pn)(this)).e() + 3))))))));
    return (((this.b / 2) + ((local5 * (((com.moon.pn)(this)).e() + 3)) / 2)) + 4);
}


public void d__sourceReturn_da8c82d5d4() {
int lexicalValue375_159_0;
    int lexicalValue375_176_0;
    int lexicalValue375_184_0;
    boolean spill375_0;
    int spill375_1;
    long life1_3;
    moom.ir life4_5;
    float life5_15;
    int life6_27;
    com.v life7_31;
    com.moon.hW life8_36;
    com.moon.jC life9_89;
    int life10_104;
    float life11_114;
    int life12_117;
    int life3_118;
    int life13_120;
    float life14_137;
    int life15_142;
    com.moon.hW life16_207;
    int life17_212;
    float life18_226;
    float life19_230;
    int life20_233;
    float life21_245;
    float life22_249;
    int life23_254;
    lexical_join_257: {
    life1_3 = (com.moon.pn.C ^ 39929693753087L);
    life4_5 = com.moon.nS.a();
    life5_15 = ((float) (((moom.ir)(life4_5)).a__Int() - __sourceIntrinsic_6cce62949456_invokedynamic375_3(826, (5177086985254946041L ^ life1_3))));
    spill375_0 = com.moon.pn.c__Boolean();
    life6_27 = ((int) java.lang.Math.floor(((double)(((double) (life5_15 / ((float) (((com.moon.pn)(this)).e() + 3))))))));
    life7_31 = ((com.moon.cs)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__cs())).a();
    life8_36 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.RECTANGLE))))).a();
    ((com.moon.hW)(life8_36)).a(((com.moon.iX)(com.moon.i2.a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(((float) ((net.minecraft.client.Minecraft)(this.a)).G))), ((float)(((float) (this.d - 1)))), ((int)(((com.v)(life7_31)).x()))))));
    ((com.moon.hW)(life8_36)).a(((com.moon.iX)(com.moon.i2.a(((float)(0x0.0p0f)), ((float)(((float) this.e))), ((float)(((float) ((net.minecraft.client.Minecraft)(this.a)).G))), ((float)(((float) this.c))), ((int)(((com.v)(life7_31)).x()))))));
    ((com.moon.hW)(life8_36)).b();
    life9_89 = com.moon.jC.a(((float)(0x0.0p0f)), ((float)(((float) (this.d - 1)))), ((float)(((float) this.b))), ((float)(((float) ((this.e - this.d) + 1)))));
    life10_104 = (((this.g + (this.b / 2)) - (((com.moon.pn)(this)).e() / 2)) + 2);
    life11_114 = (((float) (this.d + 4)) - ((com.moon.nX)(this.A)).b());
    life12_117 = ((com.moon.pn)(this)).a();
    life3_118 = ((spill375_0) ? 1 : 0);
    life13_120 = 0;
    lexical_cycle_121: while (true) {
    lexical_join_254: {
    lexical_join_184: {
    lexical_join_176: {
    lexical_join_168: {
    lexical_join_162: {
    lexical_join_159: {
    if (!((life13_120 < life12_117))) {
        break lexical_join_257;
    }
    life14_137 = ((life11_114 + ((float) ((life13_120 / life6_27) * this.h))) + ((float) this.v));
    life15_142 = (this.h - 4);
    spill375_1 = recovery.source.CarrierOps.fcmpl(((float)(life14_137)), ((float)(((float) this.e))));
    if (!((life3_118 != 0))) {
        lexicalValue375_159_0 = spill375_1;
        break lexical_join_159;
    }
    if (!((spill375_1 <= 0))) {
        break lexical_join_162;
    }
    lexicalValue375_159_0 = recovery.source.CarrierOps.fcmpg(((float)((life14_137 + ((float) life15_142)))), ((float)(((float) this.d))));
    }
    if (!((life3_118 != 0))) {
        lexicalValue375_176_0 = lexicalValue375_159_0;
        break lexical_join_176;
    }
    if (!((lexicalValue375_159_0 < 0))) {
        break lexical_join_168;
    }
    }
    ((com.moon.pn)(this)).a(((int)(life13_120)), ((int)(life10_104)), ((int)(moom.Dr.b__Int(((float)(life14_137))))));
    }
    lexicalValue375_176_0 = recovery.source.CarrierOps.fcmpl(((float)(life14_137)), ((float)(((float) (this.d - this.h)))));
    }
    if (!((life3_118 != 0))) {
        lexicalValue375_184_0 = lexicalValue375_176_0;
        break lexical_join_184;
    }
    if (!((lexicalValue375_176_0 >= 0))) {
        break lexical_join_254;
    }
    lexicalValue375_184_0 = recovery.source.CarrierOps.fcmpg(((float)(life14_137)), ((float)(((float) this.e))));
    }
    if (!((lexicalValue375_184_0 <= 0))) {
        break lexical_join_254;
    }
    life16_207 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life17_212 = (((com.moon.pn)(this)).e() + 3);
    life18_226 = (((float) (life17_212 * (life13_120 % life6_27))) - (((float) (life17_212 * life6_27)) / 0x1.0p1f));
    life19_230 = (0x1.8p1f + life18_226);
    life20_233 = ((com.moon.pn)(this)).e();
    life21_245 = ((((float) this.g) + (((float) this.b) / 0x1.0p1f)) + life18_226);
    life22_249 = (life14_137 - 0x1.0p0f);
    life23_254 = (this.h - 3);
    ((com.moon.hW)(life16_207)).a(((com.moon.jA)(life9_89)));
    ((com.moon.hW)(life16_207)).a(((com.moon.iX)(com.moon.i3.a(((float)(life21_245)), ((float)(life22_249)), ((float)(((float) life20_233))), ((float)(((float) life23_254))), ((float)(0x1.0p3f)), ((int)(((com.v)(life7_31)).x()))))));
    ((com.moon.hW)(life16_207)).b();
    }
    life13_120 += 1;
    if (!((life3_118 == 0))) { continue lexical_cycle_121; }
    break lexical_cycle_121;
    }
    }
    return;
}


protected boolean a__Boolean(int p0) {
int forwardValue1235_13_0;
    int forwardValue1235_15_0;
    int spill1235_0;
    long life2_3;
    int life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (com.moon.pn.C ^ 104067415447478L);
    life4_5 = ((com.moon.pn.b__Boolean()) ? 1 : 0);
    spill1235_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1235_13_0 = spill1235_0;
        break forward_join_13;
    }
    if (!((spill1235_0 == this.y))) {
        break forward_join_14;
    }
    forwardValue1235_13_0 = 1;
    }
    forwardValue1235_15_0 = forwardValue1235_13_0;
    break forward_join_15;
    }
    forwardValue1235_15_0 = 0;
    }
    return ((forwardValue1235_15_0) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3286_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_cbed8841c47651(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27984;
      if (E[var3] == null) {
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
         long var5 = D[var3];
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
         Object[] var9 = (Object[])F.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               F.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/pn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         E[var3] = var15;
      }

      return E[var3];
}


protected int a() {
return ((java.util.List)(((com.moon.cs)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__cs())).a__List())).size();
}


protected void a(int p0, boolean p1, int p2, int p3) {
block3: {
            int n6;
            pn pn2;
            block2: {
                long l = com.moon.pn.C ^ 0x40859A10A96BL;
                boolean bl2 = pn.b__Boolean();
                pn2 = this;
                n6 = p0;
                if (bl2) break block2;
                pn2.y = n6;
                if (!p1) break block3;
                pn2 = this;
                n6 = p0;
            }
            pn2.a__sourceReturn_91a779349d(n6).a__Void();
        }
}


protected void a(int p0, int p1, float p2, int p3, int p4, int p5, int p6, int p7) {
int forwardValue1234_42_0;
    int forwardValue1234_50_0;
    int forwardValue1234_111_0;
    int forwardValue1234_118_0;
    int forwardValue1234_128_0;
    int forwardValue1234_132_0;
    int forwardValue1234_142_0;
    int forwardValue1234_142_1;
    int forwardValue1234_144_0;
    int forwardValue1234_146_0;
    com.moon.hW forwardValue1234_161_0;
    float forwardValue1234_161_1;
    float forwardValue1234_161_2;
    float forwardValue1234_161_3;
    float forwardValue1234_161_4;
    float forwardValue1234_161_5;
    int forwardValue1234_161_6;
    com.moon.hW forwardValue1234_162_0;
    float forwardValue1234_162_1;
    float forwardValue1234_162_2;
    float forwardValue1234_162_3;
    float forwardValue1234_162_4;
    float forwardValue1234_162_5;
    com.moon.hW forwardValue1234_171_0;
    float forwardValue1234_171_1;
    float forwardValue1234_171_2;
    float forwardValue1234_171_3;
    float forwardValue1234_171_4;
    float forwardValue1234_171_5;
    com.moon.aO forwardValue1234_171_6;
    com.moon.hW forwardValue1234_172_0;
    float forwardValue1234_172_1;
    float forwardValue1234_172_2;
    float forwardValue1234_172_3;
    float forwardValue1234_172_4;
    float forwardValue1234_172_5;
    com.moon.aO forwardValue1234_172_6;
    float forwardValue1234_172_7;
    com.moon.hW forwardValue1234_174_0;
    float forwardValue1234_174_1;
    float forwardValue1234_174_2;
    float forwardValue1234_174_3;
    float forwardValue1234_174_4;
    float forwardValue1234_174_5;
    int forwardValue1234_174_6;
    com.moon.jm forwardValue1234_267_0;
    com.moon.hW forwardValue1234_267_1;
    java.lang.String forwardValue1234_267_2;
    float forwardValue1234_267_3;
    float forwardValue1234_267_4;
    float forwardValue1234_267_5;
    int forwardValue1234_267_6;
    com.moon.jm forwardValue1234_268_0;
    com.moon.hW forwardValue1234_268_1;
    java.lang.String forwardValue1234_268_2;
    float forwardValue1234_268_3;
    float forwardValue1234_268_4;
    float forwardValue1234_268_5;
    com.moon.jm forwardValue1234_270_0;
    com.moon.hW forwardValue1234_270_1;
    java.lang.String forwardValue1234_270_2;
    float forwardValue1234_270_3;
    float forwardValue1234_270_4;
    float forwardValue1234_270_5;
    int forwardValue1234_270_6;
    com.moon.jm forwardValue1234_299_0;
    com.moon.hW forwardValue1234_299_1;
    java.lang.String forwardValue1234_299_2;
    float forwardValue1234_299_3;
    float forwardValue1234_299_4;
    float forwardValue1234_299_5;
    int forwardValue1234_299_6;
    com.moon.jm forwardValue1234_300_0;
    com.moon.hW forwardValue1234_300_1;
    java.lang.String forwardValue1234_300_2;
    float forwardValue1234_300_3;
    float forwardValue1234_300_4;
    float forwardValue1234_300_5;
    com.moon.jm forwardValue1234_302_0;
    com.moon.hW forwardValue1234_302_1;
    java.lang.String forwardValue1234_302_2;
    float forwardValue1234_302_3;
    float forwardValue1234_302_4;
    float forwardValue1234_302_5;
    int forwardValue1234_302_6;
    boolean spill1234_0;
    int spill1234_1;
    int spill1234_2;
    int spill1234_3;
    int spill1234_4;
    com.moon.hW spill1234_5;
    float spill1234_6;
    float spill1234_7;
    float spill1234_8;
    float spill1234_9;
    float spill1234_10;
    int spill1234_11;
    com.moon.aO spill1234_12;
    int spill1234_13;
    long spill1234_14;
    com.moon.jm spill1234_15;
    com.moon.hW spill1234_16;
    java.lang.String spill1234_17;
    float spill1234_18;
    float spill1234_19;
    float spill1234_20;
    int spill1234_21;
    com.moon.jm spill1234_22;
    com.moon.hW spill1234_23;
    java.lang.String spill1234_24;
    float spill1234_25;
    float spill1234_26;
    float spill1234_27;
    int spill1234_28;
    long life9_3;
    com.v life12_7;
    com.moon.cq life13_11;
    net.minecraft.client.Minecraft life14_13;
    moom.ir life15_18;
    int life16_22;
    int life17_27;
    int life11_28;
    float life18_30;
    int life19_59;
    float life20_71;
    float life21_75;
    com.moon.hW life22_81;
    int life23_84;
    float life24_96;
    float life25_100;
    int life26_105;
    int life27_185;
    com.moon.jm life28_279;
    com.moon.hW life29_286;
    forward_join_302: {
    forward_join_300: {
    forward_join_299: {
    forward_join_270: {
    forward_join_268: {
    forward_join_267: {
    forward_join_174: {
    forward_join_172: {
    forward_join_171: {
    forward_join_162: {
    forward_join_161: {
    forward_join_146: {
    forward_join_145: {
    forward_join_144: {
    forward_join_142: {
    forward_join_132: {
    forward_join_128: {
    forward_join_118: {
    forward_join_111: {
    forward_join_50: {
    forward_join_46: {
    forward_join_45: {
    forward_join_42: {
    life9_3 = (com.moon.pn.C ^ 70117087550549L);
    life12_7 = ((com.moon.cs)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__cs())).a();
    life13_11 = ((com.moon.pn)(this)).a__sourceReturn_91a779349d(((int)(p0)));
    life14_13 = net.minecraft.client.Minecraft.a__fM();
    life15_18 = new moom.ir(life14_13);
    life16_22 = ((((com.moon.pn)(this)).a__Boolean(((int)(p0)))) ? 1 : 0);
    spill1234_0 = com.moon.pn.c__Boolean();
    life17_27 = (p1 + 2);
    life11_28 = ((spill1234_0) ? 1 : 0);
    life18_30 = p2;
    spill1234_1 = recovery.source.CarrierOps.fcmpl(((float)(life18_30)), ((float)(((float) ((moom.ir)(life15_18)).b__Int()))));
    if (!((life11_28 != 0))) {
        forwardValue1234_42_0 = spill1234_1;
        break forward_join_42;
    }
    if (!((spill1234_1 < 0))) {
        break forward_join_45;
    }
    forwardValue1234_42_0 = recovery.source.CarrierOps.fcmpg(((float)(life18_30)), ((float)(0x0.0p0f)));
    }
    if (!((life11_28 != 0))) {
        forwardValue1234_50_0 = forwardValue1234_42_0;
        break forward_join_50;
    }
    if (!((forwardValue1234_42_0 < 0))) {
        break forward_join_46;
    }
    }
    return;
    }
    forwardValue1234_50_0 = (((com.moon.pn)(this)).e() + 3);
    }
    life19_59 = forwardValue1234_50_0;
    life20_71 = (((float) (life19_59 * p6)) - (((float) (life19_59 * p7)) / 0x1.0p1f));
    life21_75 = (0x1.8p1f + life20_71);
    moom.kZ.l();
    life22_81 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life23_84 = ((com.moon.pn)(this)).e();
    life24_96 = ((((float) this.g) + (((float) this.b) / 0x1.0p1f)) + life20_71);
    life25_100 = (life18_30 - 0x1.0p0f);
    life26_105 = (this.h - 3);
    spill1234_2 = recovery.source.CarrierOps.fcmpl(((float)(((float) p4))), ((float)(life24_96)));
    if (!((life11_28 != 0))) {
        forwardValue1234_111_0 = spill1234_2;
        break forward_join_111;
    }
    if (!((spill1234_2 > 0))) {
        break forward_join_145;
    }
    forwardValue1234_111_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p4))), ((float)((life24_96 + ((float) life23_84)))));
    }
    if (!((life11_28 != 0))) {
        forwardValue1234_118_0 = forwardValue1234_111_0;
        break forward_join_118;
    }
    if (!((forwardValue1234_111_0 < 0))) {
        break forward_join_145;
    }
    forwardValue1234_118_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p5))), ((float)(life25_100)));
    }
    if (!((life11_28 != 0))) {
        forwardValue1234_128_0 = forwardValue1234_118_0;
        break forward_join_128;
    }
    if (!((forwardValue1234_118_0 > 0))) {
        break forward_join_145;
    }
    forwardValue1234_128_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p5))), ((float)((life25_100 + ((float) life26_105)))));
    }
    if (!((life11_28 != 0))) {
        forwardValue1234_132_0 = forwardValue1234_128_0;
        break forward_join_132;
    }
    if (!((forwardValue1234_128_0 < 0))) {
        break forward_join_145;
    }
    forwardValue1234_132_0 = p5;
    }
    spill1234_3 = this.d;
    if (!((life11_28 != 0))) {
        forwardValue1234_142_0 = forwardValue1234_132_0;
        forwardValue1234_142_1 = spill1234_3;
        break forward_join_142;
    }
    if (!((forwardValue1234_132_0 > spill1234_3))) {
        break forward_join_145;
    }
    spill1234_4 = p5;
    if (!((life11_28 != 0))) {
        forwardValue1234_144_0 = spill1234_4;
        break forward_join_144;
    }
    forwardValue1234_142_0 = spill1234_4;
    forwardValue1234_142_1 = this.e;
    }
    if (!((forwardValue1234_142_0 < forwardValue1234_142_1))) {
        break forward_join_145;
    }
    forwardValue1234_144_0 = 1;
    }
    forwardValue1234_146_0 = forwardValue1234_144_0;
    break forward_join_146;
    }
    forwardValue1234_146_0 = 0;
    }
    life27_185 = forwardValue1234_146_0;
    spill1234_5 = life22_81;
    spill1234_6 = life24_96;
    spill1234_7 = life25_100;
    spill1234_8 = ((float) life23_84);
    spill1234_9 = ((float) life26_105);
    spill1234_10 = 0x1.0p3f;
    spill1234_11 = life16_22;
    if (!((life11_28 != 0))) {
        forwardValue1234_161_0 = spill1234_5;
        forwardValue1234_161_1 = spill1234_6;
        forwardValue1234_161_2 = spill1234_7;
        forwardValue1234_161_3 = spill1234_8;
        forwardValue1234_161_4 = spill1234_9;
        forwardValue1234_161_5 = spill1234_10;
        forwardValue1234_161_6 = spill1234_11;
        break forward_join_161;
    }
    if (!((spill1234_11 != 0))) {
        forwardValue1234_162_0 = spill1234_5;
        forwardValue1234_162_1 = spill1234_6;
        forwardValue1234_162_2 = spill1234_7;
        forwardValue1234_162_3 = spill1234_8;
        forwardValue1234_162_4 = spill1234_9;
        forwardValue1234_162_5 = spill1234_10;
        break forward_join_162;
    }
    forwardValue1234_161_0 = spill1234_5;
    forwardValue1234_161_1 = spill1234_6;
    forwardValue1234_161_2 = spill1234_7;
    forwardValue1234_161_3 = spill1234_8;
    forwardValue1234_161_4 = spill1234_9;
    forwardValue1234_161_5 = spill1234_10;
    forwardValue1234_161_6 = ((com.v)(life12_7)).a();
    }
    forwardValue1234_174_0 = forwardValue1234_161_0;
    forwardValue1234_174_1 = forwardValue1234_161_1;
    forwardValue1234_174_2 = forwardValue1234_161_2;
    forwardValue1234_174_3 = forwardValue1234_161_3;
    forwardValue1234_174_4 = forwardValue1234_161_4;
    forwardValue1234_174_5 = forwardValue1234_161_5;
    forwardValue1234_174_6 = forwardValue1234_161_6;
    break forward_join_174;
    }
    spill1234_12 = new com.moon.aO(((com.v)(life12_7)).u());
    if (!((life27_185 != 0))) {
        forwardValue1234_171_0 = forwardValue1234_162_0;
        forwardValue1234_171_1 = forwardValue1234_162_1;
        forwardValue1234_171_2 = forwardValue1234_162_2;
        forwardValue1234_171_3 = forwardValue1234_162_3;
        forwardValue1234_171_4 = forwardValue1234_162_4;
        forwardValue1234_171_5 = forwardValue1234_162_5;
        forwardValue1234_171_6 = spill1234_12;
        break forward_join_171;
    }
    forwardValue1234_172_0 = forwardValue1234_162_0;
    forwardValue1234_172_1 = forwardValue1234_162_1;
    forwardValue1234_172_2 = forwardValue1234_162_2;
    forwardValue1234_172_3 = forwardValue1234_162_3;
    forwardValue1234_172_4 = forwardValue1234_162_4;
    forwardValue1234_172_5 = forwardValue1234_162_5;
    forwardValue1234_172_6 = spill1234_12;
    forwardValue1234_172_7 = 0x1.4cccccp-1f;
    break forward_join_172;
    }
    forwardValue1234_172_0 = forwardValue1234_171_0;
    forwardValue1234_172_1 = forwardValue1234_171_1;
    forwardValue1234_172_2 = forwardValue1234_171_2;
    forwardValue1234_172_3 = forwardValue1234_171_3;
    forwardValue1234_172_4 = forwardValue1234_171_4;
    forwardValue1234_172_5 = forwardValue1234_171_5;
    forwardValue1234_172_6 = forwardValue1234_171_6;
    forwardValue1234_172_7 = 0x1.0p0f;
    }
    forwardValue1234_174_0 = forwardValue1234_172_0;
    forwardValue1234_174_1 = forwardValue1234_172_1;
    forwardValue1234_174_2 = forwardValue1234_172_2;
    forwardValue1234_174_3 = forwardValue1234_172_3;
    forwardValue1234_174_4 = forwardValue1234_172_4;
    forwardValue1234_174_5 = forwardValue1234_172_5;
    forwardValue1234_174_6 = ((com.moon.aO)(((com.moon.aO)(forwardValue1234_172_6)).a(((float)(forwardValue1234_172_7))))).getRGB();
    }
    ((com.moon.hW)(forwardValue1234_174_0)).a(((com.moon.iX)(com.moon.i3.a(((float)(forwardValue1234_174_1)), ((float)(forwardValue1234_174_2)), ((float)(forwardValue1234_174_3)), ((float)(forwardValue1234_174_4)), ((float)(forwardValue1234_174_5)), ((int)(forwardValue1234_174_6))))));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life22_81)));
    moom.kZ.k();
    org.lwjgl.opengl.GL11.glTranslated(((double)(((double) life17_27))), ((double)(((double) life18_30))), ((double)(0x0.0p0d)));
    ((com.moon.pn)(this)).a(((java.lang.String)(((com.moon.cx)(((com.moon.cq)(life13_11)).a__cx())).a())), ((float)((life24_96 + 0x1.ap2f))), ((float)((life25_100 + 0x1.ap2f))), ((int)(__sourceIntrinsic_953d98d7ad99_invokedynamic1234_40(13637, (3819758307862519857L ^ life9_3)))), ((int)(__sourceIntrinsic_953d98d7ad99_invokedynamic1234_41(15293, (6980318462869450457L ^ life9_3)))));
    spill1234_13 = 24753;
    org.lwjgl.opengl.GL11.glTranslated(((double)(((double) (-life17_27)))), ((double)(((double) (-life18_30)))), ((double)(0x0.0p0d)));
    spill1234_14 = (2693100863162086873L ^ life9_3);
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_953d98d7ad99_invokedynamic1234_45(spill1234_13, spill1234_14))), ((int)(__sourceIntrinsic_953d98d7ad99_invokedynamic1234_46(18206, (8452904680122274413L ^ life9_3)))), ((int)(1)), ((int)(0)));
    life28_279 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life29_286 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life28_279))))).a();
    spill1234_15 = life28_279;
    spill1234_16 = life29_286;
    spill1234_17 = ((com.moon.cx)(((com.moon.cq)(life13_11)).a__cx())).a();
    spill1234_18 = 0x1.0p3f;
    spill1234_19 = ((((float) life17_27) + life21_75) + 0x1.ep4f);
    spill1234_20 = (((life18_30 + 0x1.8p2f) + 0x1.9p3f) - ((com.moon.jm)(life28_279)).a(((float)(0x1.0p3f))));
    spill1234_21 = life16_22;
    if (!((life11_28 != 0))) {
        forwardValue1234_267_0 = spill1234_15;
        forwardValue1234_267_1 = spill1234_16;
        forwardValue1234_267_2 = spill1234_17;
        forwardValue1234_267_3 = spill1234_18;
        forwardValue1234_267_4 = spill1234_19;
        forwardValue1234_267_5 = spill1234_20;
        forwardValue1234_267_6 = spill1234_21;
        break forward_join_267;
    }
    if (!((spill1234_21 != 0))) {
        forwardValue1234_268_0 = spill1234_15;
        forwardValue1234_268_1 = spill1234_16;
        forwardValue1234_268_2 = spill1234_17;
        forwardValue1234_268_3 = spill1234_18;
        forwardValue1234_268_4 = spill1234_19;
        forwardValue1234_268_5 = spill1234_20;
        break forward_join_268;
    }
    forwardValue1234_267_0 = spill1234_15;
    forwardValue1234_267_1 = spill1234_16;
    forwardValue1234_267_2 = spill1234_17;
    forwardValue1234_267_3 = spill1234_18;
    forwardValue1234_267_4 = spill1234_19;
    forwardValue1234_267_5 = spill1234_20;
    forwardValue1234_267_6 = __sourceExactCall_66349b953a09b2(((com.v)(life12_7)));
    }
    forwardValue1234_270_0 = forwardValue1234_267_0;
    forwardValue1234_270_1 = forwardValue1234_267_1;
    forwardValue1234_270_2 = forwardValue1234_267_2;
    forwardValue1234_270_3 = forwardValue1234_267_3;
    forwardValue1234_270_4 = forwardValue1234_267_4;
    forwardValue1234_270_5 = forwardValue1234_267_5;
    forwardValue1234_270_6 = forwardValue1234_267_6;
    break forward_join_270;
    }
    forwardValue1234_270_0 = forwardValue1234_268_0;
    forwardValue1234_270_1 = forwardValue1234_268_1;
    forwardValue1234_270_2 = forwardValue1234_268_2;
    forwardValue1234_270_3 = forwardValue1234_268_3;
    forwardValue1234_270_4 = forwardValue1234_268_4;
    forwardValue1234_270_5 = forwardValue1234_268_5;
    forwardValue1234_270_6 = ((com.v)(life12_7)).h();
    }
    ((com.moon.jm)(forwardValue1234_270_0)).a(((com.moon.hW)(forwardValue1234_270_1)), ((java.lang.String)(forwardValue1234_270_2)), ((float)(forwardValue1234_270_3)), ((float)(forwardValue1234_270_4)), ((float)(forwardValue1234_270_5)), ((int)(forwardValue1234_270_6)), ((boolean)(false)), ((boolean)(false)), ((float)(0x1.47ae14p-6f)));
    spill1234_22 = life28_279;
    spill1234_23 = life29_286;
    spill1234_24 = org.apache.commons.lang3.StringUtils.capitalize(((java.lang.String)(((java.lang.String)(((com.moon.aP)(((com.moon.cq)(life13_11)).a__aP())).name())).toLowerCase())));
    spill1234_25 = 0x1.0p3f;
    spill1234_26 = ((((float) life17_27) + life21_75) + 0x1.ep4f);
    spill1234_27 = ((life18_30 + 0x1.8p2f) + 0x1.9p3f);
    spill1234_28 = life16_22;
    if (!((life11_28 != 0))) {
        forwardValue1234_299_0 = spill1234_22;
        forwardValue1234_299_1 = spill1234_23;
        forwardValue1234_299_2 = spill1234_24;
        forwardValue1234_299_3 = spill1234_25;
        forwardValue1234_299_4 = spill1234_26;
        forwardValue1234_299_5 = spill1234_27;
        forwardValue1234_299_6 = spill1234_28;
        break forward_join_299;
    }
    if (!((spill1234_28 != 0))) {
        forwardValue1234_300_0 = spill1234_22;
        forwardValue1234_300_1 = spill1234_23;
        forwardValue1234_300_2 = spill1234_24;
        forwardValue1234_300_3 = spill1234_25;
        forwardValue1234_300_4 = spill1234_26;
        forwardValue1234_300_5 = spill1234_27;
        break forward_join_300;
    }
    forwardValue1234_299_0 = spill1234_22;
    forwardValue1234_299_1 = spill1234_23;
    forwardValue1234_299_2 = spill1234_24;
    forwardValue1234_299_3 = spill1234_25;
    forwardValue1234_299_4 = spill1234_26;
    forwardValue1234_299_5 = spill1234_27;
    forwardValue1234_299_6 = __sourceExactCall_66349b953a09b2(((com.v)(life12_7)));
    }
    forwardValue1234_302_0 = forwardValue1234_299_0;
    forwardValue1234_302_1 = forwardValue1234_299_1;
    forwardValue1234_302_2 = forwardValue1234_299_2;
    forwardValue1234_302_3 = forwardValue1234_299_3;
    forwardValue1234_302_4 = forwardValue1234_299_4;
    forwardValue1234_302_5 = forwardValue1234_299_5;
    forwardValue1234_302_6 = forwardValue1234_299_6;
    break forward_join_302;
    }
    forwardValue1234_302_0 = forwardValue1234_300_0;
    forwardValue1234_302_1 = forwardValue1234_300_1;
    forwardValue1234_302_2 = forwardValue1234_300_2;
    forwardValue1234_302_3 = forwardValue1234_300_3;
    forwardValue1234_302_4 = forwardValue1234_300_4;
    forwardValue1234_302_5 = forwardValue1234_300_5;
    forwardValue1234_302_6 = ((com.v)(life12_7)).h();
    }
    __sourceExactCall_1949570a13ee94(((com.moon.jm)(forwardValue1234_302_0)), ((com.moon.hW)(forwardValue1234_302_1)), ((java.lang.String)(forwardValue1234_302_2)), ((float)(forwardValue1234_302_3)), ((float)(forwardValue1234_302_4)), ((float)(forwardValue1234_302_5)), ((int)(forwardValue1234_302_6)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life29_286)));
    moom.kZ.k();
    return;
}


protected void a(int p0, float p1, int p2, int p3) {
int lexicalValue373_77_0;
    int lexicalValue373_94_0;
    int lexicalValue373_102_0;
    boolean spill373_0;
    int spill373_1;
    long life5_3;
    int life8_6;
    net.minecraft.client.renderer.Tessellator life9_8;
    moom.lw life10_11;
    moom.ir life11_14;
    int life7_15;
    float life12_25;
    int life13_36;
    int life14_38;
    float life15_55;
    int life16_60;
    lexical_join_118: {
    life5_3 = (com.moon.pn.C ^ 12114974260586L);
    life8_6 = ((com.moon.pn)(this)).a();
    life9_8 = net.minecraft.client.renderer.Tessellator.a();
    life10_11 = ((net.minecraft.client.renderer.Tessellator)(life9_8)).a__lw();
    spill373_0 = com.moon.pn.b__Boolean();
    life11_14 = com.moon.nS.a();
    life7_15 = ((spill373_0) ? 1 : 0);
    life12_25 = ((float) (((moom.ir)(life11_14)).a__Int() - __sourceIntrinsic_d1729f274022_invokedynamic373_8(25639, (4631575733809238136L ^ life5_3))));
    life13_36 = ((int) java.lang.Math.floor(((double)(((double) (life12_25 / ((float) (((com.moon.pn)(this)).e() + 3))))))));
    life14_38 = 0;
    lexical_cycle_39: while (true) {
    lexical_join_115: {
    lexical_join_102: {
    lexical_join_94: {
    lexical_join_86: {
    lexical_join_80: {
    lexical_join_77: {
    if (!((life14_38 < life8_6))) {
        break lexical_join_118;
    }
    life15_55 = ((p1 + ((float) ((life14_38 / life13_36) * this.h))) + ((float) this.v));
    life16_60 = (this.h - 4);
    spill373_1 = recovery.source.CarrierOps.fcmpl(((float)(life15_55)), ((float)(((float) this.e))));
    if (!((life7_15 == 0))) {
        lexicalValue373_77_0 = spill373_1;
        break lexical_join_77;
    }
    if (!((spill373_1 <= 0))) {
        break lexical_join_80;
    }
    lexicalValue373_77_0 = recovery.source.CarrierOps.fcmpg(((float)((life15_55 + ((float) life16_60)))), ((float)(((float) this.d))));
    }
    if (!((life7_15 == 0))) {
        lexicalValue373_94_0 = lexicalValue373_77_0;
        break lexical_join_94;
    }
    if (!((lexicalValue373_77_0 < 0))) {
        break lexical_join_86;
    }
    }
    ((com.moon.pn)(this)).a(((int)(life14_38)), ((int)(p0)), ((int)(moom.Dr.b__Int(((float)(life15_55))))));
    }
    lexicalValue373_94_0 = recovery.source.CarrierOps.fcmpl(((float)(life15_55)), ((float)(((float) (this.d - this.h)))));
    }
    if (!((life7_15 == 0))) {
        lexicalValue373_102_0 = lexicalValue373_94_0;
        break lexical_join_102;
    }
    if (!((lexicalValue373_94_0 >= 0))) {
        break lexical_join_115;
    }
    lexicalValue373_102_0 = recovery.source.CarrierOps.fcmpg(((float)(life15_55)), ((float)(((float) this.e))));
    }
    if (!((lexicalValue373_102_0 <= 0))) {
        break lexical_join_115;
    }
    ((com.moon.pn)(this)).a(((int)(life14_38)), ((int)(p0)), ((float)(life15_55)), ((int)(life16_60)), ((int)(p2)), ((int)(p3)), ((int)((life14_38 % life13_36))), ((int)(life13_36)));
    }
    life14_38 += 1;
    if (!((life7_15 != 0))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    return;
}


public void a(int p0, int p1, float p2) {
com.moon.pn forwardValue1232_188_0;
    int forwardValue1232_217_0;
    int forwardValue1232_280_0;
    int spill1232_0;
    long spill1232_1;
    int spill1232_2;
    int spill1232_3;
    com.moon.pn spill1232_4;
    int spill1232_5;
    int spill1232_6;
    long life4_3;
    int life6_5;
    com.v life7_12;
    int life8_21;
    int life9_29;
    net.minecraft.client.renderer.Tessellator life10_39;
    int life11_49;
    float life12_59;
    com.moon.hW life13_70;
    int life14_130;
    int life15_154;
    int life15_173;
    float life16_215;
    com.moon.hW life17_238;
    forward_join_283: {
    forward_join_280: {
    forward_join_270: {
    forward_join_219: {
    forward_join_217: {
    forward_join_188: {
    forward_join_187: {
    life4_3 = (com.moon.pn.C ^ 43753062507084L);
    life6_5 = ((com.moon.pn.c__Boolean()) ? 1 : 0);
    if (!(this.s)) {
        break forward_join_283;
    }
    life7_12 = ((com.moon.cs)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__cs())).a();
    this.k = ((int)(p0));
    this.l = ((int)(p1));
    life8_21 = ((com.moon.pn)(this)).f();
    life9_29 = (life8_21 + __sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_10(22677, (7563404751408952318L ^ life4_3)));
    spill1232_0 = 16765;
    ((com.moon.pn)(this)).b__Void();
    spill1232_1 = (7565194726790392339L ^ life4_3);
    moom.kZ.f();
    moom.kZ.n();
    life10_39 = net.minecraft.client.renderer.Tessellator.a();
    life11_49 = ((this.g + (this.b / 2)) + 2);
    life12_59 = (((float) (this.d + 4)) - ((com.moon.nX)(this.A)).b());
    ((com.moon.pn)(this)).a(((int)(life11_49)), ((float)(life12_59)), ((int)(p0)), ((int)(p1)));
    life13_70 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(life13_70)).a(((com.moon.iX)(com.moon.i3.a(((float)(-0x1.0p0f)), ((float)(-0x1.0p0f)), ((float)(((float) (((net.minecraft.client.Minecraft)(this.a)).G + 1)))), ((float)(((float) this.d))), ((float)(0x0.0p0f)), ((int)(((com.v)(life7_12)).g()))))));
    ((com.moon.hW)(life13_70)).a(((com.moon.iX)(com.moon.i3.a(((float)(-0x1.0p0f)), ((float)(((float) this.e))), ((float)(((float) (((net.minecraft.client.Minecraft)(this.a)).G + 1)))), ((float)(((float) this.c))), ((float)(0x0.0p0f)), ((int)(((com.v)(life7_12)).g()))))));
    ((com.moon.hW)(life13_70)).b();
    moom.kZ.i();
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_41(spill1232_0, spill1232_1))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_42(25661, (8751443087476248392L ^ life4_3)))), ((int)(0)), ((int)(1)));
    spill1232_2 = 21631;
    moom.kZ.c__Void();
    moom.kZ.j(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_45(spill1232_2, (1955325240233983751L ^ life4_3)))));
    moom.kZ.v();
    life14_130 = ((com.moon.pn)(this)).c();
    spill1232_3 = life14_130;
    if (!((life6_5 != 0))) {
        forwardValue1232_280_0 = spill1232_3;
        break forward_join_280;
    }
    if (!((spill1232_3 > 0))) {
        break forward_join_270;
    }
    life15_154 = (((this.e - this.d) * (this.e - this.d)) / java.lang.Math.max(((int)(((com.moon.pn)(this)).b())), ((int)(1))));
    life15_173 = moom.Dr.a(((int)(life15_154)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_55(403, (5843411432177085164L ^ life4_3)))), ((int)(((this.e - this.d) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_58(28525, (1957002043558118419L ^ life4_3))))));
    ((com.moon.nX)(this.A)).a(((float)(this.p)), ((double)(0x1.333334p-2d)));
    spill1232_4 = this;
    if (!((life6_5 != 0))) {
        forwardValue1232_188_0 = spill1232_4;
        break forward_join_188;
    }
    if (!((((com.moon.pn)(spill1232_4)).n > 0))) {
        break forward_join_187;
    }
    ((com.moon.nX)(this.A)).a(((float)(this.p)));
    }
    forwardValue1232_188_0 = this;
    }
    life16_215 = (((((com.moon.nX)(((com.moon.pn)(forwardValue1232_188_0)).A)).b() * ((float) ((this.e - this.d) - life15_173))) / ((float) life14_130)) + ((float) this.d));
    spill1232_5 = recovery.source.CarrierOps.fcmpg(((float)(life16_215)), ((float)(((float) this.d))));
    if (!((life6_5 != 0))) {
        forwardValue1232_217_0 = spill1232_5;
        break forward_join_217;
    }
    if (!((spill1232_5 < 0))) {
        break forward_join_219;
    }
    forwardValue1232_217_0 = this.d;
    }
    life16_215 = ((float) forwardValue1232_217_0);
    }
    life17_238 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(life17_238)).a(((com.moon.iX)(com.moon.i3.a(((float)(((float) (life8_21 - 1)))), ((float)(((float) this.d))), ((float)(((float) (life9_29 - life8_21)))), ((float)((((float) (this.e - this.d)) - 0x1.0p0f))), ((float)(0x1.8p0f)), ((int)(((com.v)(life7_12)).u()))))));
    ((com.moon.hW)(life17_238)).a(((com.moon.iX)(com.moon.i3.a(((float)(((float) (life8_21 - 1)))), ((float)(life16_215)), ((float)(((float) (life9_29 - life8_21)))), ((float)(((float) (life15_173 - 1)))), ((float)(0x1.8p0f)), ((int)(((com.v)(life7_12)).a()))))));
    ((com.moon.hW)(life17_238)).b();
    }
    ((com.moon.pn)(this)).b(((int)(p0)), ((int)(p1)));
    spill1232_6 = 1710;
    moom.kZ.u();
    forwardValue1232_280_0 = __sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_91(spill1232_6, (6904216679004646869L ^ life4_3));
    }
    moom.kZ.j(((int)(forwardValue1232_280_0)));
    moom.kZ.d__Void();
    moom.kZ.k();
    }
    return;
}


protected void a(int p0, int p1, int p2, int p3, int p4, int p5) {
return;
}


public com.moon.cq a__sourceReturn_91a779349d(int p0) {
return ((com.moon.cq)(((java.util.List)(((com.moon.cs)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__cs())).a__List())).get(((int)(p0)))));
}


private boolean a(int p0, int p1, float p2, float p3, float p4, float p5) {
int forwardValue1233_19_0;
    int forwardValue1233_26_0;
    int forwardValue1233_35_0;
    int forwardValue1233_39_0;
    int forwardValue1233_41_0;
    int spill1233_0;
    long life7_3;
    int life9_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    forward_join_26: {
    forward_join_19: {
    life7_3 = (com.moon.pn.C ^ 64361988867733L);
    life9_5 = ((com.moon.pn.b__Boolean()) ? 1 : 0);
    spill1233_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p0))), ((float)(p2)));
    if (!((life9_5 == 0))) {
        forwardValue1233_19_0 = spill1233_0;
        break forward_join_19;
    }
    if (!((spill1233_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue1233_19_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p0))), ((float)((p2 + p4))));
    }
    if (!((life9_5 == 0))) {
        forwardValue1233_26_0 = forwardValue1233_19_0;
        break forward_join_26;
    }
    if (!((forwardValue1233_19_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue1233_26_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p1))), ((float)(p3)));
    }
    if (!((life9_5 == 0))) {
        forwardValue1233_35_0 = forwardValue1233_26_0;
        break forward_join_35;
    }
    if (!((forwardValue1233_26_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue1233_35_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p1))), ((float)((p3 + p5))));
    }
    if (!((life9_5 == 0))) {
        forwardValue1233_39_0 = forwardValue1233_35_0;
        break forward_join_39;
    }
    if (!((forwardValue1233_35_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue1233_39_0 = 1;
    }
    forwardValue1233_41_0 = forwardValue1233_39_0;
    break forward_join_41;
    }
    forwardValue1233_41_0 = 0;
    }
    return ((forwardValue1233_41_0) != 0);
}


protected void a__Void() {
return;
}


private void a(java.lang.String p0, float p1, float p2, int p3, int p4) { __sourceHandlerCall_a6cfdaa6d93b0a6dd06c(this, p0, p1, p2, p3, p4); }


private static native <E extends Throwable> int __sourceIntrinsic_59d6f6137c87958b_originalDynamicSite1520_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_59d6f6137c87958b_originalDynamicSite1520_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_59d6f6137c87958b_originalDynamicSite1520_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d1729f274022_invokedynamic373_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1232_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_953d98d7ad99_invokedynamic1234_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_953d98d7ad99_invokedynamic1234_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_953d98d7ad99_invokedynamic1234_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_953d98d7ad99_invokedynamic1234_46(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3286_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_originalDynamicSite619_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_invokedynamic375_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_originalDynamicSite620_3(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_cbed8841c47651(int p0, long p1);

private static native void __sourceExactCall_247fe3d2bc87d6(com.moon.hW p0);
private static native void __sourceExactCall_1949570a13ee94(com.moon.jm p0, com.moon.hW p1, java.lang.String p2, float p3, float p4, float p5, int p6);

private static native int __sourceExactCall_66349b953a09b2(com.v p0);
}
