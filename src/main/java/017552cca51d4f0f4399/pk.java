package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pk extends net.minecraft.client.gui.GuiScreen {

private net.minecraft.client.shader.Framebuffer w;

private net.minecraft.client.shader.Framebuffer[] x;

private com.moon.gW y;

private com.moon.nY z;

private java.util.List<com.moon.nr> A;

private long B;

private com.moon.ns C;

private int D;

private int E;

private com.moon.module.impl.ClickGUI F;

private com.moon.module.impl.Effects G;

private boolean H;

private boolean I;

private com.moon.nw J;

private com.moon.nk K;

private static long L;

private static long[] M;

private static java.lang.Integer[] N;

private static java.util.Map O;

private static long[] P;

private static java.lang.Long[] Q;

private static java.util.Map R;

public pk() { super(); __sourceHandlerCall_efe0718b780309f58e98(this); }


static {
L = ((long)(((moom._a)(moom._c.a(((long)(9190620361905864403L)), ((long)(-6317083694928388300L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(97637758602665L)))));
    O = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.pk.L ^ 107278028943762L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill377_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill377_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill377_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill377_14 = new byte[8];
    (__sourceSpill377_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill377_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation377_16 = __sourceSpill377_14;
    ((javax.crypto.Cipher)(__sourceSpill377_11)).init(((int)(__sourceSpill377_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill377_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation377_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[2];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "7\027K^¼\007(:îA>·\007¥®"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill377_25 = local17_life21;
        int __sourceSpill377_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill377_25)).substring(((int)(__sourceSpill377_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill377_30 = local19_life19;
        int __sourceSpill377_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill377_33 = new byte[8];
        (__sourceSpill377_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill377_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill377_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill377_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill377_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill377_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill377_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill377_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill377_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill377_34)).doFinal(((byte[])(__sourceSpill377_33)));
        (__sourceSpill377_30)[__sourceSpill377_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    M = ((long[])(local19_life19));
    N = ((java.lang.Integer[])(new java.lang.Integer[2]));
    R = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill377_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill377_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill377_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill377_46 = new byte[8];
    (__sourceSpill377_46)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill377_46)[local1_life47] = ((byte) ((int) ((local11_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation377_48 = __sourceSpill377_46;
    ((javax.crypto.Cipher)(__sourceSpill377_43)).init(((int)(__sourceSpill377_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill377_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation377_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life51 = new long[2];
    int local3_life52 = 0;
    java.lang.String local4_life53;
    int local5_life55 = ((java.lang.String)((local4_life53 = "ú'æ²Ô4\bÿ®.}óëLçT"))).length();
    int local2_life56 = 0;
    do {
        java.lang.String __sourceSpill377_57 = local4_life53;
        int __sourceSpill377_58 = local2_life56;
        local2_life56 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill377_57)).substring(((int)(__sourceSpill377_58)), ((int)(local2_life56))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill377_62 = local6_life51;
        int __sourceSpill377_63 = local3_life52;
        local3_life52 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill377_65 = new byte[8];
        (__sourceSpill377_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill377_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill377_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill377_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill377_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill377_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill377_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill377_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill377_66 = local0_life41;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill377_66)).doFinal(((byte[])(__sourceSpill377_65)));
        (__sourceSpill377_62)[__sourceSpill377_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life56 >= local5_life55)));
    P = ((long[])(local6_life51));
    Q = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceHandlerCall_efe0718b780309f58e98(com.moon.pk a0) throws E;
private static final class __SourceHandler_efe0718b780309f58e98 {

public static void f131(com.moon.pk receiver) throws Throwable {
    net.minecraft.entity.Entity[] spill131_0;
    long life1_3;
    int life4_24;
    net.minecraft.entity.Entity[] life3_25;
    forest_join_76: {
    forest_join_46: {
    life1_3 = (__fieldRead131_0() ^ 78872058118286L);
    __directSuperInit131_1(receiver);
    __fieldWrite131_2(receiver, new net.minecraft.client.shader.Framebuffer(1, 1, true));
    spill131_0 = __call131_3();
    __fieldWrite131_5(receiver, new net.minecraft.client.shader.Framebuffer[__invokedynamic131_4(6658, (5558239710308170703L ^ life1_3))]);
    life4_24 = 0;
    life3_25 = spill131_0;
    forest_cycle_26: while (true) {
    if (!((life4_24 < (__fieldRead131_6(receiver)).length))) {
        break forest_join_46;
    }
    (__fieldRead131_7(receiver))[life4_24] = new net.minecraft.client.shader.Framebuffer(1, 1, false);
    life4_24 += 1;
    if (!((life3_25 != null))) {
        break forest_join_76;
    }
    if (!((life3_25 == null))) {
        continue forest_cycle_26;
    }
    break forest_cycle_26;
    }
    }
    __fieldWrite131_10(receiver, new com.moon.gW(__fieldRead131_8(receiver), __fieldRead131_9(receiver), 2, 2));
    __fieldWrite131_13(receiver, new com.moon.nY(__invokedynamic131_11(18350, (6426725313473377899L ^ life1_3)), __fieldRead131_12()));
    __fieldWrite131_14(receiver, new java.util.ArrayList());
    __fieldWrite131_16(receiver, __call131_15());
    }
    return;
}
public static void h131_0(moom.Oo p0) throws Throwable {
    throw __call3013100_0(p0);
}
private static native long __fieldRead131_0() throws Throwable;
private static native void __directSuperInit131_1(com.moon.pk a0) throws Throwable;
private static native void __fieldWrite131_2(com.moon.pk a0, net.minecraft.client.shader.Framebuffer a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call131_3() throws Throwable;
private static native int __invokedynamic131_4(int a0, long a1) throws Throwable;
private static native void __fieldWrite131_5(com.moon.pk a0, net.minecraft.client.shader.Framebuffer[] a1) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer[] __fieldRead131_6(com.moon.pk a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer[] __fieldRead131_7(com.moon.pk a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead131_8(com.moon.pk a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer[] __fieldRead131_9(com.moon.pk a0) throws Throwable;
private static native void __fieldWrite131_10(com.moon.pk a0, com.moon.gW a1) throws Throwable;
private static native long __invokedynamic131_11(int a0, long a1) throws Throwable;
private static native com.moon.cj __fieldRead131_12() throws Throwable;
private static native void __fieldWrite131_13(com.moon.pk a0, com.moon.nY a1) throws Throwable;
private static native void __fieldWrite131_14(com.moon.pk a0, java.util.ArrayList a1) throws Throwable;
private static native long __call131_15() throws Throwable;
private static native void __fieldWrite131_16(com.moon.pk a0, long a1) throws Throwable;
private static native java.lang.Exception __call3013100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_de9cfe4c836a0960dcd7(com.moon.pk a0, char a1, int a2) throws E;
private static final class __SourceHandler_de9cfe4c836a0960dcd7 {

public static void f563(com.moon.pk receiver, char p0, int p1) throws Throwable {
    com.moon.pk lexicalValue563_38_0;
    com.moon.pk lexicalValue563_47_0;
    com.moon.pk lexicalValue563_62_0;
    net.minecraft.entity.Entity[] spill563_0;
    com.moon.pk spill563_1;
    com.moon.pk spill563_2;
    long life3_3;
    java.util.Iterator life6_8;
    net.minecraft.entity.Entity[] life5_9;
    com.moon.nr life7_16;
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_47: {
    lexical_join_38: {
    lexical_join_37: {
    lexical_join_25: {
    life3_3 = (__fieldRead563_0() ^ 21909228343252L);
    spill563_0 = __call563_1();
    life6_8 = __call563_3(__fieldRead563_2(receiver));
    life5_9 = spill563_0;
    lexical_cycle_10: while (true) {
    if (!(__call563_4(life6_8))) {
        break lexical_join_25;
    }
    life7_16 = __cast563_6(__call563_5(life6_8));
    __call563_7(life7_16, p0, p1);
    if (!((life5_9 != null))) {
        break lexical_join_50;
    }
    if (!((life5_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    if (!((p1 == 1))) {
        break lexical_join_50;
    }
    spill563_1 = receiver;
    if (!((life5_9 != null))) {
        lexicalValue563_38_0 = spill563_1;
        break lexical_join_38;
    }
    if (!((__fieldRead563_8(spill563_1) != null))) {
        break lexical_join_37;
    }
    __call563_9(receiver, null);
    return;
    }
    lexicalValue563_38_0 = receiver;
    }
    if (!((life5_9 != null))) {
        lexicalValue563_47_0 = lexicalValue563_38_0;
        break lexical_join_47;
    }
    if (!((!__fieldRead563_10(lexicalValue563_38_0)))) {
        break lexical_join_49;
    }
    __call563_12(__fieldRead563_11(receiver), 0x1.0p0f);
    lexicalValue563_47_0 = receiver;
    }
    __fieldWrite563_13(lexicalValue563_47_0, 1);
    }
    return;
    }
    spill563_2 = receiver;
    if (!((life5_9 != null))) {
        lexicalValue563_62_0 = spill563_2;
        break lexical_join_62;
    }
    if (!((__fieldRead563_14(spill563_2) != null))) {
        break lexical_join_61;
    }
    __call563_16(__fieldRead563_15(receiver), p0, p1);
    return;
    }
    lexicalValue563_62_0 = receiver;
    }
    __call563_17(lexicalValue563_62_0, p0, p1);
    return;
}
public static void h563_0(java.io.IOException p0) throws Throwable {
    throw __call1056300_0(p0);
}
public static void h563_1(java.io.IOException p0) throws Throwable {
    throw __call1056301_0(p0);
}
public static void h563_2(java.io.IOException p0) throws Throwable {
    throw __call1056302_0(p0);
}
public static void h563_3(java.io.IOException p0) throws Throwable {
    throw __call1056303_0(p0);
}
public static void h563_4(java.io.IOException p0) throws Throwable {
    throw __call1056304_0(p0);
}
public static void h563_5(java.io.IOException p0) throws Throwable {
    throw __call1056305_0(p0);
}
public static void h563_6(java.io.IOException p0) throws Throwable {
    throw __call1056306_0(p0);
}
public static void h563_7(java.io.IOException p0) throws Throwable {
    throw __call1056307_0(p0);
}
private static native long __fieldRead563_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call563_1() throws Throwable;
private static native java.util.List __fieldRead563_2(com.moon.pk a0) throws Throwable;
private static native java.util.Iterator __call563_3(java.util.List a0) throws Throwable;
private static native boolean __call563_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call563_5(java.util.Iterator a0) throws Throwable;
private static native com.moon.nr __cast563_6(java.lang.Object a0) throws Throwable;
private static native void __call563_7(com.moon.nr a0, char a1, int a2) throws Throwable;
private static native com.moon.nk __fieldRead563_8(com.moon.pk a0) throws Throwable;
private static native void __call563_9(com.moon.pk a0, java.lang.Object a1) throws Throwable;
private static native boolean __fieldRead563_10(com.moon.pk a0) throws Throwable;
private static native com.moon.nY __fieldRead563_11(com.moon.pk a0) throws Throwable;
private static native void __call563_12(com.moon.nY a0, float a1) throws Throwable;
private static native void __fieldWrite563_13(com.moon.pk a0, int a1) throws Throwable;
private static native com.moon.nk __fieldRead563_14(com.moon.pk a0) throws Throwable;
private static native com.moon.nk __fieldRead563_15(com.moon.pk a0) throws Throwable;
private static native void __call563_16(com.moon.nk a0, char a1, int a2) throws Throwable;
private static native void __call563_17(com.moon.pk a0, char a1, int a2) throws Throwable;
private static native java.lang.Exception __call1056300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1056301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1056302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1056303_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1056304_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1056305_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1056306_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1056307_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fb7465a05f061c1a4d6c(com.moon.pk a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_fb7465a05f061c1a4d6c {

public static void f564(com.moon.pk receiver, int p0, int p1, float p2) throws Throwable {
    com.moon.pk lexicalValue564_12_0;
    int lexicalValue564_39_0;
    int lexicalValue564_41_0;
    int lexicalValue564_106_0;
    float lexicalValue564_115_0;
    com.moon.pk lexicalValue564_203_0;
    com.moon.pk lexicalValue564_236_0;
    com.moon.pk lexicalValue564_263_0;
    int lexicalValue564_267_0;
    com.moon.nY lexicalValue564_273_0;
    com.moon.nY lexicalValue564_281_0;
    float lexicalValue564_281_1;
    float lexicalValue564_281_2;
    int lexicalValue564_281_3;
    com.moon.nY lexicalValue564_282_0;
    float lexicalValue564_282_1;
    float lexicalValue564_282_2;
    com.moon.nY lexicalValue564_283_0;
    float lexicalValue564_283_1;
    float lexicalValue564_283_2;
    int lexicalValue564_283_3;
    com.moon.pk lexicalValue564_295_0;
    com.moon.pk spill564_0;
    boolean spill564_1;
    boolean spill564_2;
    com.moon.pk spill564_3;
    com.moon.pk spill564_4;
    int spill564_5;
    boolean spill564_6;
    com.moon.pk spill564_7;
    com.moon.nY spill564_8;
    float spill564_9;
    float spill564_10;
    boolean spill564_11;
    com.moon.pk spill564_12;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    float life7_25;
    int life1_31;
    int life2_37;
    float life8_61;
    float life9_65;
    float life10_69;
    float life11_73;
    float life12_103;
    float life13_130;
    java.util.Iterator life14_134;
    com.moon.nr life15_141;
    com.moon.nr life15_170;
    java.util.Iterator life14_232;
    com.moon.nr life15_239;
    lexical_join_295: {
    lexical_join_294: {
    lexical_join_283: {
    lexical_join_282: {
    lexical_join_281: {
    lexical_join_273: {
    lexical_join_271: {
    lexical_join_267: {
    lexical_join_263: {
    lexical_join_262: {
    lexical_join_236: {
    lexical_join_235: {
    lexical_join_232: {
    lexical_join_221: {
    lexical_join_203: {
    lexical_join_202: {
    lexical_join_188: {
    lexical_join_161: {
    lexical_join_146: {
    lexical_join_142: {
    lexical_join_115: {
    lexical_join_114: {
    lexical_join_106: {
    lexical_join_41: {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_18: {
    lexical_join_12: {
    life4_3 = (__fieldRead564_0() ^ 42581394986527L);
    life6_5 = __call564_1();
    spill564_0 = receiver;
    if (!((life6_5 != null))) {
        lexicalValue564_12_0 = spill564_0;
        break lexical_join_12;
    }
    if (!((__fieldRead564_2(spill564_0) == null))) {
        break lexical_join_18;
    }
    lexicalValue564_12_0 = receiver;
    }
    __fieldWrite564_8(lexicalValue564_12_0, __cast564_7(__call564_6(__call564_4(__call564_3()), __classLiteral564_5())));
    }
    life7_25 = __fieldRead564_9();
    life1_31 = ((int) (((float) p0) / life7_25));
    life2_37 = ((int) (((float) p1) / life7_25));
    spill564_1 = __call564_11(__fieldRead564_10(receiver));
    if (!((life6_5 != null))) {
        lexicalValue564_39_0 = __integerCategory564_12(spill564_1);
        break lexical_join_39;
    }
    if (!((!spill564_1))) {
        break lexical_join_40;
    }
    lexicalValue564_39_0 = 1;
    }
    lexicalValue564_41_0 = lexicalValue564_39_0;
    break lexical_join_41;
    }
    lexicalValue564_41_0 = 0;
    }
    __fieldWrite564_13(lexicalValue564_41_0);
    __fieldWrite564_14(receiver, life1_31);
    __fieldWrite564_15(receiver, life2_37);
    __call564_16();
    life8_61 = __call564_18(__fieldRead564_17(receiver));
    life9_65 = (0x1.0p0f - life8_61);
    life10_69 = (life9_65 / 0x1.0p1f);
    life11_73 = (life9_65 / 0x1.0p1f);
    __call564_19((life8_61 * life7_25), (life8_61 * life7_25), 0x1.0p0f);
    __call564_20(life10_69, life11_73, 0x0.0p0f);
    __call564_21(life8_61);
    life12_103 = ((((float) __call564_23(__fieldRead564_22(receiver))) * 0x1.18p7f) + (((float) (__call564_25(__fieldRead564_24(receiver)) - 1)) * 0x1.4p2f));
    spill564_2 = __call564_30(__cast564_29(__call564_28(__call564_27(__fieldRead564_26(receiver)))));
    if (!((life6_5 != null))) {
        lexicalValue564_106_0 = __integerCategory564_31(spill564_2);
        break lexical_join_106;
    }
    if (!(spill564_2)) {
        break lexical_join_114;
    }
    lexicalValue564_106_0 = __call564_33(__call564_32());
    }
    lexicalValue564_115_0 = ((((float) lexicalValue564_106_0) / 0x1.0p1f) - (life12_103 / 0x1.0p1f));
    break lexical_join_115;
    }
    lexicalValue564_115_0 = 0x1.4p2f;
    }
    life13_130 = lexicalValue564_115_0;
    life14_134 = __call564_35(__fieldRead564_34(receiver));
    lexical_cycle_120: while (true) {
    if (!(__call564_36(life14_134))) {
        break lexical_join_142;
    }
    life15_141 = __cast564_38(__call564_37(life14_134));
    __call564_39(life15_141, life13_130);
    life13_130 = (life13_130 + 0x1.22p7f);
    if (!((life6_5 != null))) {
        break lexical_join_146;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_120; }
    break lexical_cycle_120;
    }
    __call564_40(new java.lang.String[3]);
    }
    life14_134 = __call564_42(__fieldRead564_41(receiver));
    }
    lexical_cycle_146: while (true) {
    if (!(__call564_43(life14_134))) {
        break lexical_join_161;
    }
    life15_170 = __cast564_45(__call564_44(life14_134));
    __call564_46(life15_170, life1_31, life2_37);
    if (!((life6_5 != null))) {
        break lexical_join_202;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_146; }
    break lexical_cycle_146;
    }
    }
    spill564_3 = receiver;
    if (!((life6_5 != null))) {
        lexicalValue564_203_0 = spill564_3;
        break lexical_join_203;
    }
    if (!(__call564_51(__cast564_50(__call564_49(__call564_48(__fieldRead564_47(spill564_3))))))) {
        break lexical_join_188;
    }
    __call564_52();
    __call564_54(__fieldRead564_53(receiver), 2);
    __call564_56(__fieldRead564_55(receiver), 0x1.8p0f);
    __call564_58(__fieldRead564_57(receiver));
    __call564_60(__fieldRead564_59(receiver));
    __call564_61();
    }
    __call564_62((life8_61 * life7_25), (life8_61 * life7_25), 0x1.0p0f);
    __call564_63(life10_69, life11_73, 0x0.0p0f);
    __call564_64(life8_61);
    }
    lexicalValue564_203_0 = receiver;
    }
    life14_232 = __call564_66(__fieldRead564_65(lexicalValue564_203_0));
    lexical_cycle_206: while (true) {
    if (!(__call564_67(life14_232))) {
        break lexical_join_221;
    }
    life15_239 = __cast564_69(__call564_68(life14_232));
    __call564_70(life15_239, life1_31, life2_37);
    if (!((life6_5 != null))) {
        break lexical_join_235;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_206; }
    break lexical_cycle_206;
    }
    }
    spill564_4 = receiver;
    if (!((life6_5 != null))) {
        lexicalValue564_236_0 = spill564_4;
        break lexical_join_236;
    }
    if (!((__fieldRead564_71(spill564_4) != null))) {
        break lexical_join_232;
    }
    __call564_73(__fieldRead564_72(receiver));
    __fieldWrite564_74(receiver, null);
    }
    __call564_75();
    __call564_76();
    __call564_77();
    }
    lexicalValue564_236_0 = receiver;
    }
    spill564_5 = __numericCompare564_80(((double) __call564_79(__fieldRead564_78(lexicalValue564_236_0))), 0x1.0p-1d);
    if (!((life6_5 != null))) {
        lexicalValue564_267_0 = spill564_5;
        break lexical_join_267;
    }
    if (!((spill564_5 < 0))) {
        break lexical_join_262;
    }
    spill564_6 = __fieldRead564_81(receiver);
    if (!((life6_5 != null))) {
        lexicalValue564_267_0 = __integerCategory564_82(spill564_6);
        break lexical_join_267;
    }
    if (!(spill564_6)) {
        break lexical_join_262;
    }
    __call564_84(__fieldRead564_83(receiver), null);
    spill564_7 = receiver;
    if (!((life6_5 != null))) {
        lexicalValue564_263_0 = spill564_7;
        break lexical_join_263;
    }
    if (!((__fieldRead564_86(__fieldRead564_85(spill564_7)) == null))) {
        break lexical_join_262;
    }
    __call564_88(__fieldRead564_87(receiver));
    }
    lexicalValue564_263_0 = receiver;
    }
    spill564_8 = __fieldRead564_89(lexicalValue564_263_0);
    if (!((life6_5 != null))) {
        lexicalValue564_273_0 = spill564_8;
        break lexical_join_273;
    }
    lexicalValue564_267_0 = __integerCategory564_91(__call564_90(spill564_8));
    }
    if (!((lexicalValue564_267_0 == 0))) {
        break lexical_join_271;
    }
    __fieldWrite564_93(receiver, __call564_92());
    }
    lexicalValue564_273_0 = __fieldRead564_94(receiver);
    }
    spill564_9 = 0x0.0p0f;
    spill564_10 = 0x1.0p0f;
    spill564_11 = __fieldRead564_95(receiver);
    if (!((life6_5 != null))) {
        lexicalValue564_281_0 = lexicalValue564_273_0;
        lexicalValue564_281_1 = spill564_9;
        lexicalValue564_281_2 = spill564_10;
        lexicalValue564_281_3 = __integerCategory564_96(spill564_11);
        break lexical_join_281;
    }
    if (!((!spill564_11))) {
        lexicalValue564_282_0 = lexicalValue564_273_0;
        lexicalValue564_282_1 = spill564_9;
        lexicalValue564_282_2 = spill564_10;
        break lexical_join_282;
    }
    lexicalValue564_281_0 = lexicalValue564_273_0;
    lexicalValue564_281_1 = spill564_9;
    lexicalValue564_281_2 = spill564_10;
    lexicalValue564_281_3 = 1;
    }
    lexicalValue564_283_0 = lexicalValue564_281_0;
    lexicalValue564_283_1 = lexicalValue564_281_1;
    lexicalValue564_283_2 = lexicalValue564_281_2;
    lexicalValue564_283_3 = lexicalValue564_281_3;
    break lexical_join_283;
    }
    lexicalValue564_283_0 = lexicalValue564_282_0;
    lexicalValue564_283_1 = lexicalValue564_282_1;
    lexicalValue564_283_2 = lexicalValue564_282_2;
    lexicalValue564_283_3 = 0;
    }
    __call564_97(lexicalValue564_283_0, lexicalValue564_283_1, lexicalValue564_283_2, lexicalValue564_283_3);
    spill564_12 = receiver;
    if (!((life6_5 != null))) {
        lexicalValue564_295_0 = spill564_12;
        break lexical_join_295;
    }
    if (!((__fieldRead564_98(spill564_12) != null))) {
        break lexical_join_294;
    }
    __call564_100(__fieldRead564_99(receiver), life1_31, life2_37);
    }
    lexicalValue564_295_0 = receiver;
    }
    __call564_101(lexicalValue564_295_0, life1_31, life2_37, p2);
    return;
}
public static void h564_0(moom.Oo p0) throws Throwable {
    throw __call1056400_0(p0);
}
public static void h564_1(moom.Oo p0) throws Throwable {
    throw __call1056401_0(p0);
}
public static void h564_2(moom.Oo p0) throws Throwable {
    throw __call1056402_0(p0);
}
public static void h564_3(moom.Oo p0) throws Throwable {
    throw __call1056403_0(p0);
}
public static void h564_4(moom.Oo p0) throws Throwable {
    throw __call1056404_0(p0);
}
public static void h564_5(moom.Oo p0) throws Throwable {
    throw __call1056405_0(p0);
}
public static void h564_6(moom.Oo p0) throws Throwable {
    throw __call1056406_0(p0);
}
public static void h564_7(moom.Oo p0) throws Throwable {
    throw __call1056407_0(p0);
}
public static void h564_8(moom.Oo p0) throws Throwable {
    throw __call1056408_0(p0);
}
public static void h564_9(moom.Oo p0) throws Throwable {
    throw __call1056409_0(p0);
}
public static void h564_10(moom.Oo p0) throws Throwable {
    throw __call1056410_0(p0);
}
public static void h564_11(moom.Oo p0) throws Throwable {
    throw __call1056411_0(p0);
}
public static void h564_12(moom.Oo p0) throws Throwable {
    throw __call1056412_0(p0);
}
public static void h564_13(moom.Oo p0) throws Throwable {
    throw __call1056413_0(p0);
}
public static void h564_14(moom.Oo p0) throws Throwable {
    throw __call1056414_0(p0);
}
public static void h564_15(moom.Oo p0) throws Throwable {
    throw __call1056415_0(p0);
}
public static void h564_16(moom.Oo p0) throws Throwable {
    throw __call1056416_0(p0);
}
public static void h564_17(moom.Oo p0) throws Throwable {
    throw __call1056417_0(p0);
}
public static void h564_18(moom.Oo p0) throws Throwable {
    throw __call1056418_0(p0);
}
public static void h564_19(moom.Oo p0) throws Throwable {
    throw __call1056419_0(p0);
}
public static void h564_20(moom.Oo p0) throws Throwable {
    throw __call1056420_0(p0);
}
public static void h564_21(moom.Oo p0) throws Throwable {
    throw __call1056421_0(p0);
}
public static void h564_22(moom.Oo p0) throws Throwable {
    throw __call1056422_0(p0);
}
private static native long __fieldRead564_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call564_1() throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead564_2(com.moon.pk a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call564_3() throws Throwable;
private static native com.moon.fU __call564_4(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral564_5() throws Throwable;
private static native com.moon.module.Module __call564_6(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.ClickGUI __cast564_7(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite564_8(com.moon.pk a0, com.moon.module.impl.ClickGUI a1) throws Throwable;
private static native float __fieldRead564_9() throws Throwable;
private static native com.moon.nY __fieldRead564_10(com.moon.pk a0) throws Throwable;
private static native boolean __call564_11(com.moon.nY a0) throws Throwable;
private static native int __integerCategory564_12(boolean value) throws Throwable;
private static native void __fieldWrite564_13(int a0) throws Throwable;
private static native void __fieldWrite564_14(com.moon.pk a0, int a1) throws Throwable;
private static native void __fieldWrite564_15(com.moon.pk a0, int a1) throws Throwable;
private static native void __call564_16() throws Throwable;
private static native com.moon.nY __fieldRead564_17(com.moon.pk a0) throws Throwable;
private static native float __call564_18(com.moon.nY a0) throws Throwable;
private static native void __call564_19(float a0, float a1, float a2) throws Throwable;
private static native void __call564_20(float a0, float a1, float a2) throws Throwable;
private static native void __call564_21(float a0) throws Throwable;
private static native java.util.List __fieldRead564_22(com.moon.pk a0) throws Throwable;
private static native int __call564_23(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead564_24(com.moon.pk a0) throws Throwable;
private static native int __call564_25(java.util.List a0) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead564_26(com.moon.pk a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __call564_27(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native java.lang.Object __call564_28(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast564_29(java.lang.Object a0) throws Throwable;
private static native boolean __call564_30(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory564_31(boolean value) throws Throwable;
private static native moom.ir __call564_32() throws Throwable;
private static native int __call564_33(moom.ir a0) throws Throwable;
private static native java.util.List __fieldRead564_34(com.moon.pk a0) throws Throwable;
private static native java.util.Iterator __call564_35(java.util.List a0) throws Throwable;
private static native boolean __call564_36(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call564_37(java.util.Iterator a0) throws Throwable;
private static native com.moon.nr __cast564_38(java.lang.Object a0) throws Throwable;
private static native com.moon.nr __call564_39(com.moon.nr a0, float a1) throws Throwable;
private static native void __call564_40(java.lang.String[] a0) throws Throwable;
private static native java.util.List __fieldRead564_41(com.moon.pk a0) throws Throwable;
private static native java.util.Iterator __call564_42(java.util.List a0) throws Throwable;
private static native boolean __call564_43(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call564_44(java.util.Iterator a0) throws Throwable;
private static native com.moon.nr __cast564_45(java.lang.Object a0) throws Throwable;
private static native void __call564_46(com.moon.nr a0, int a1, int a2) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead564_47(com.moon.pk a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __call564_48(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native java.lang.Object __call564_49(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast564_50(java.lang.Object a0) throws Throwable;
private static native boolean __call564_51(java.lang.Boolean a0) throws Throwable;
private static native void __call564_52() throws Throwable;
private static native com.moon.gW __fieldRead564_53(com.moon.pk a0) throws Throwable;
private static native com.moon.gW __call564_54(com.moon.gW a0, int a1) throws Throwable;
private static native com.moon.gW __fieldRead564_55(com.moon.pk a0) throws Throwable;
private static native com.moon.gW __call564_56(com.moon.gW a0, float a1) throws Throwable;
private static native com.moon.gW __fieldRead564_57(com.moon.pk a0) throws Throwable;
private static native void __call564_58(com.moon.gW a0) throws Throwable;
private static native com.moon.gW __fieldRead564_59(com.moon.pk a0) throws Throwable;
private static native void __call564_60(com.moon.gW a0) throws Throwable;
private static native void __call564_61() throws Throwable;
private static native void __call564_62(float a0, float a1, float a2) throws Throwable;
private static native void __call564_63(float a0, float a1, float a2) throws Throwable;
private static native void __call564_64(float a0) throws Throwable;
private static native java.util.List __fieldRead564_65(com.moon.pk a0) throws Throwable;
private static native java.util.Iterator __call564_66(java.util.List a0) throws Throwable;
private static native boolean __call564_67(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call564_68(java.util.Iterator a0) throws Throwable;
private static native com.moon.nr __cast564_69(java.lang.Object a0) throws Throwable;
private static native void __call564_70(com.moon.nr a0, int a1, int a2) throws Throwable;
private static native com.moon.nw __fieldRead564_71(com.moon.pk a0) throws Throwable;
private static native com.moon.nw __fieldRead564_72(com.moon.pk a0) throws Throwable;
private static native void __call564_73(com.moon.nw a0) throws Throwable;
private static native void __fieldWrite564_74(com.moon.pk a0, java.lang.Object a1) throws Throwable;
private static native void __call564_75() throws Throwable;
private static native void __call564_76() throws Throwable;
private static native void __call564_77() throws Throwable;
private static native com.moon.nY __fieldRead564_78(com.moon.pk a0) throws Throwable;
private static native float __call564_79(com.moon.nY a0) throws Throwable;
private static native int __numericCompare564_80(double a0, double a1) throws Throwable;
private static native boolean __fieldRead564_81(com.moon.pk a0) throws Throwable;
private static native int __integerCategory564_82(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead564_83(com.moon.pk a0) throws Throwable;
private static native void __call564_84(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead564_85(com.moon.pk a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead564_86(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead564_87(com.moon.pk a0) throws Throwable;
private static native void __call564_88(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.nY __fieldRead564_89(com.moon.pk a0) throws Throwable;
private static native boolean __call564_90(com.moon.nY a0) throws Throwable;
private static native int __integerCategory564_91(boolean value) throws Throwable;
private static native long __call564_92() throws Throwable;
private static native void __fieldWrite564_93(com.moon.pk a0, long a1) throws Throwable;
private static native com.moon.nY __fieldRead564_94(com.moon.pk a0) throws Throwable;
private static native boolean __fieldRead564_95(com.moon.pk a0) throws Throwable;
private static native int __integerCategory564_96(boolean value) throws Throwable;
private static native void __call564_97(com.moon.nY a0, float a1, float a2, int a3) throws Throwable;
private static native com.moon.nk __fieldRead564_98(com.moon.pk a0) throws Throwable;
private static native com.moon.nk __fieldRead564_99(com.moon.pk a0) throws Throwable;
private static native void __call564_100(com.moon.nk a0, int a1, int a2) throws Throwable;
private static native void __call564_101(com.moon.pk a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Exception __call1056400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056410_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056411_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056412_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056413_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056414_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056415_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056416_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056417_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056418_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056419_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056420_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056421_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056422_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e84629e8e7a09d0e6ec5(com.moon.pk a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_e84629e8e7a09d0e6ec5 {

public static void f565(com.moon.pk receiver, int p0, int p1, int p2) throws Throwable {
    com.moon.pk lexicalValue565_19_0;
    com.moon.pk lexicalValue565_24_0;
    com.moon.pk spill565_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    float life7_42;
    int life1_48;
    int life2_54;
    java.util.Iterator life8_58;
    com.moon.nr life9_65;
    lexical_join_69: {
    lexical_join_64: {
    lexical_join_30: {
    lexical_join_24: {
    lexical_join_19: {
    lexical_join_18: {
    life4_3 = (__fieldRead565_0() ^ 83176815660291L);
    life6_5 = __call565_1();
    spill565_0 = receiver;
    if (!((life6_5 != null))) {
        lexicalValue565_19_0 = spill565_0;
        break lexical_join_19;
    }
    if (!((__fieldRead565_2(spill565_0) != null))) {
        break lexical_join_18;
    }
    __call565_4(__fieldRead565_3(receiver), p0, p1, p2);
    return;
    }
    lexicalValue565_19_0 = receiver;
    }
    if (!((life6_5 != null))) {
        lexicalValue565_24_0 = lexicalValue565_19_0;
        break lexical_join_24;
    }
    if (!((__fieldRead565_5(lexicalValue565_19_0) == null))) {
        break lexical_join_30;
    }
    lexicalValue565_24_0 = receiver;
    }
    __fieldWrite565_11(lexicalValue565_24_0, __cast565_10(__call565_9(__call565_7(__call565_6()), __classLiteral565_8())));
    }
    life7_42 = __fieldRead565_12();
    life1_48 = ((int) (((float) p0) / life7_42));
    life2_54 = ((int) (((float) p1) / life7_42));
    life8_58 = __call565_14(__fieldRead565_13(receiver));
    lexical_cycle_48: while (true) {
    if (!(__call565_15(life8_58))) {
        break lexical_join_64;
    }
    life9_65 = __cast565_17(__call565_16(life8_58));
    __call565_18(life9_65, life1_48, life2_54, p2);
    if (!((life6_5 != null))) {
        break lexical_join_69;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    __call565_19(receiver, life1_48, life2_54, p2);
    }
    return;
}
public static void h565_0(java.io.IOException p0) throws Throwable {
    throw __call1056500_0(p0);
}
public static void h565_1(java.io.IOException p0) throws Throwable {
    throw __call1056501_0(p0);
}
public static void h565_2(java.io.IOException p0) throws Throwable {
    throw __call1056502_0(p0);
}
public static void h565_3(java.io.IOException p0) throws Throwable {
    throw __call1056503_0(p0);
}
public static void h565_4(java.io.IOException p0) throws Throwable {
    throw __call1056504_0(p0);
}
private static native long __fieldRead565_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call565_1() throws Throwable;
private static native com.moon.nk __fieldRead565_2(com.moon.pk a0) throws Throwable;
private static native com.moon.nk __fieldRead565_3(com.moon.pk a0) throws Throwable;
private static native void __call565_4(com.moon.nk a0, int a1, int a2, int a3) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead565_5(com.moon.pk a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call565_6() throws Throwable;
private static native com.moon.fU __call565_7(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral565_8() throws Throwable;
private static native com.moon.module.Module __call565_9(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.ClickGUI __cast565_10(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite565_11(com.moon.pk a0, com.moon.module.impl.ClickGUI a1) throws Throwable;
private static native float __fieldRead565_12() throws Throwable;
private static native java.util.List __fieldRead565_13(com.moon.pk a0) throws Throwable;
private static native java.util.Iterator __call565_14(java.util.List a0) throws Throwable;
private static native boolean __call565_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call565_16(java.util.Iterator a0) throws Throwable;
private static native com.moon.nr __cast565_17(java.lang.Object a0) throws Throwable;
private static native void __call565_18(com.moon.nr a0, int a1, int a2, int a3) throws Throwable;
private static native void __call565_19(com.moon.pk a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1056500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1056501_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1056502_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1056503_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1056504_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e22de2aaba06619accab(com.moon.pk a0, com.moon.ei a1) throws E;
private static final class __SourceHandler_e22de2aaba06619accab {

public static void f566(com.moon.pk receiver, com.moon.ei p0) throws Throwable {
    com.moon.pk lexicalValue566_19_0;
    com.moon.pk lexicalValue566_36_0;
    com.moon.module.impl.Effects lexicalValue566_55_0;
    com.moon.pk spill566_0;
    com.moon.module.impl.Effects spill566_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    float life5_81;
    float life6_85;
    float life7_89;
    float life8_93;
    java.util.Iterator life9_111;
    com.moon.nr life10_118;
    lexical_join_112: {
    lexical_join_107: {
    lexical_join_104: {
    lexical_join_57: {
    lexical_join_55: {
    lexical_join_47: {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_19: {
    lexical_join_18: {
    life2_3 = (__fieldRead566_0() ^ 22384186854219L);
    life4_5 = __call566_1();
    spill566_0 = receiver;
    if (!((life4_5 != null))) {
        lexicalValue566_19_0 = spill566_0;
        break lexical_join_19;
    }
    if (!((__fieldRead566_2(spill566_0) == null))) {
        break lexical_join_18;
    }
    __fieldWrite566_8(receiver, __cast566_7(__call566_6(__call566_4(__call566_3()), __classLiteral566_5())));
    }
    lexicalValue566_19_0 = receiver;
    }
    if (!((life4_5 != null))) {
        lexicalValue566_36_0 = lexicalValue566_19_0;
        break lexical_join_36;
    }
    if (!(__call566_10(__fieldRead566_9(lexicalValue566_19_0)))) {
        break lexical_join_35;
    }
    if (!((__numericCompare566_14((__call566_11() - __fieldRead566_12(receiver)), __invokedynamic566_13(32306, (5511026858354213939L ^ life2_3))) < 0))) {
        break lexical_join_57;
    }
    }
    lexicalValue566_36_0 = receiver;
    }
    spill566_1 = __fieldRead566_15(lexicalValue566_36_0);
    if (!((life4_5 != null))) {
        lexicalValue566_55_0 = spill566_1;
        break lexical_join_55;
    }
    if (!((spill566_1 == null))) {
        break lexical_join_47;
    }
    __fieldWrite566_21(receiver, __cast566_20(__call566_19(__call566_17(__call566_16()), __classLiteral566_18())));
    }
    __call566_24(__call566_23(__fieldRead566_22(receiver)), 1);
    lexicalValue566_55_0 = __fieldRead566_25(receiver);
    }
    __call566_27(__call566_26(lexicalValue566_55_0));
    }
    life5_81 = __call566_29(__fieldRead566_28(receiver));
    life6_85 = (0x1.0p0f - life5_81);
    life7_89 = (life6_85 / 0x1.0p1f);
    life8_93 = (life6_85 / 0x1.0p1f);
    __call566_32((life5_81 * __fieldRead566_30()), (life5_81 * __fieldRead566_31()), 0x1.0p0f);
    __call566_33(life7_89, life8_93, 0x0.0p0f);
    __call566_34(life5_81);
    life9_111 = __call566_36(__fieldRead566_35(receiver));
    lexical_cycle_91: while (true) {
    if (!(__call566_37(life9_111))) {
        break lexical_join_104;
    }
    life10_118 = __cast566_39(__call566_38(life9_111));
    __call566_40(life10_118);
    if (!((life4_5 != null))) {
        break lexical_join_107;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_91; }
    break lexical_cycle_91;
    }
    }
    __call566_41();
    __call566_42();
    __call566_43();
    }
    if (!((__call566_44() != null))) {
        break lexical_join_112;
    }
    __call566_45(new net.minecraft.entity.Entity[1]);
    }
    return;
}
public static void h566_0(moom.Oo p0) throws Throwable {
    throw __call1056600_0(p0);
}
public static void h566_1(moom.Oo p0) throws Throwable {
    throw __call1056601_0(p0);
}
public static void h566_2(moom.Oo p0) throws Throwable {
    throw __call1056602_0(p0);
}
public static void h566_3(moom.Oo p0) throws Throwable {
    throw __call1056603_0(p0);
}
public static void h566_4(moom.Oo p0) throws Throwable {
    throw __call1056604_0(p0);
}
public static void h566_5(moom.Oo p0) throws Throwable {
    throw __call1056605_0(p0);
}
public static void h566_6(moom.Oo p0) throws Throwable {
    throw __call1056606_0(p0);
}
public static void h566_7(moom.Oo p0) throws Throwable {
    throw __call1056607_0(p0);
}
public static void h566_8(moom.Oo p0) throws Throwable {
    throw __call1056608_0(p0);
}
private static native long __fieldRead566_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call566_1() throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead566_2(com.moon.pk a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call566_3() throws Throwable;
private static native com.moon.fU __call566_4(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral566_5() throws Throwable;
private static native com.moon.module.Module __call566_6(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.ClickGUI __cast566_7(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite566_8(com.moon.pk a0, com.moon.module.impl.ClickGUI a1) throws Throwable;
private static native com.moon.nY __fieldRead566_9(com.moon.pk a0) throws Throwable;
private static native boolean __call566_10(com.moon.nY a0) throws Throwable;
private static native long __call566_11() throws Throwable;
private static native long __fieldRead566_12(com.moon.pk a0) throws Throwable;
private static native long __invokedynamic566_13(int a0, long a1) throws Throwable;
private static native int __numericCompare566_14(long a0, long a1) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead566_15(com.moon.pk a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call566_16() throws Throwable;
private static native com.moon.fU __call566_17(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral566_18() throws Throwable;
private static native com.moon.module.Module __call566_19(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.Effects __cast566_20(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite566_21(com.moon.pk a0, com.moon.module.impl.Effects a1) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead566_22(com.moon.pk a0) throws Throwable;
private static native com.moon.gV __call566_23(com.moon.module.impl.Effects a0) throws Throwable;
private static native com.moon.gV __call566_24(com.moon.gV a0, int a1) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead566_25(com.moon.pk a0) throws Throwable;
private static native com.moon.gW __call566_26(com.moon.module.impl.Effects a0) throws Throwable;
private static native void __call566_27(com.moon.gW a0) throws Throwable;
private static native com.moon.nY __fieldRead566_28(com.moon.pk a0) throws Throwable;
private static native float __call566_29(com.moon.nY a0) throws Throwable;
private static native float __fieldRead566_30() throws Throwable;
private static native float __fieldRead566_31() throws Throwable;
private static native void __call566_32(float a0, float a1, float a2) throws Throwable;
private static native void __call566_33(float a0, float a1, float a2) throws Throwable;
private static native void __call566_34(float a0) throws Throwable;
private static native java.util.List __fieldRead566_35(com.moon.pk a0) throws Throwable;
private static native java.util.Iterator __call566_36(java.util.List a0) throws Throwable;
private static native boolean __call566_37(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call566_38(java.util.Iterator a0) throws Throwable;
private static native com.moon.nr __cast566_39(java.lang.Object a0) throws Throwable;
private static native void __call566_40(com.moon.nr a0) throws Throwable;
private static native void __call566_41() throws Throwable;
private static native void __call566_42() throws Throwable;
private static native void __call566_43() throws Throwable;
private static native java.lang.String[] __call566_44() throws Throwable;
private static native void __call566_45(net.minecraft.entity.Entity[] a0) throws Throwable;
private static native java.lang.Exception __call1056600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056608_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_42d6b404c42490379bcc(com.moon.pk a0, com.moon.ej a1) throws E;
private static final class __SourceHandler_42d6b404c42490379bcc {

public static void f567(com.moon.pk receiver, com.moon.ej p0) throws Throwable {
    net.minecraft.entity.Entity[] spill567_0;
    long life2_3;
    float life5_7;
    float life6_11;
    float life7_15;
    float life8_20;
    net.minecraft.entity.Entity[] life4_33;
    java.util.Iterator life9_39;
    com.moon.nr life10_46;
    lexical_join_58: {
    lexical_join_55: {
    life2_3 = (__fieldRead567_0() ^ 77585341227397L);
    life5_7 = __call567_2(__fieldRead567_1(receiver));
    life6_11 = (0x1.0p0f - life5_7);
    life7_15 = (life6_11 / 0x1.0p1f);
    spill567_0 = __call567_3();
    life8_20 = (life6_11 / 0x1.0p1f);
    __call567_6((life5_7 * __fieldRead567_4()), (life5_7 * __fieldRead567_5()), 0x1.0p0f);
    __call567_7(life7_15, life8_20, 0x0.0p0f);
    life4_33 = spill567_0;
    __call567_8(life5_7);
    life9_39 = __call567_10(__fieldRead567_9(receiver));
    lexical_cycle_40: while (true) {
    if (!(__call567_11(life9_39))) {
        break lexical_join_55;
    }
    life10_46 = __cast567_13(__call567_12(life9_39));
    __call567_15(life10_46, __call567_14(p0));
    if (!((life4_33 != null))) {
        break lexical_join_58;
    }
    if (!((life4_33 == null))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    __call567_16();
    __call567_17();
    __call567_18();
    }
    return;
}
public static void h567_0(moom.Oo p0) throws Throwable {
    throw __call1056700_0(p0);
}
private static native long __fieldRead567_0() throws Throwable;
private static native com.moon.nY __fieldRead567_1(com.moon.pk a0) throws Throwable;
private static native float __call567_2(com.moon.nY a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call567_3() throws Throwable;
private static native float __fieldRead567_4() throws Throwable;
private static native float __fieldRead567_5() throws Throwable;
private static native void __call567_6(float a0, float a1, float a2) throws Throwable;
private static native void __call567_7(float a0, float a1, float a2) throws Throwable;
private static native void __call567_8(float a0) throws Throwable;
private static native java.util.List __fieldRead567_9(com.moon.pk a0) throws Throwable;
private static native java.util.Iterator __call567_10(java.util.List a0) throws Throwable;
private static native boolean __call567_11(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call567_12(java.util.Iterator a0) throws Throwable;
private static native com.moon.nr __cast567_13(java.lang.Object a0) throws Throwable;
private static native boolean __call567_14(com.moon.ej a0) throws Throwable;
private static native void __call567_15(com.moon.nr a0, boolean a1) throws Throwable;
private static native void __call567_16() throws Throwable;
private static native void __call567_17() throws Throwable;
private static native void __call567_18() throws Throwable;
private static native java.lang.Exception __call1056700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c016e78e696d1cf05b36(com.moon.pk a0, com.moon.nk a1) throws E;
private static final class __SourceHandler_c016e78e696d1cf05b36 {

public static void f568(com.moon.pk receiver, com.moon.nk p0) throws Throwable {
    com.moon.nk forwardValue568_14_0;
    net.minecraft.entity.Entity[] spill568_0;
    com.moon.nk spill568_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead568_0() ^ 21149792235856L);
    spill568_0 = __call568_1();
    __fieldWrite568_2(receiver, p0);
    life4_8 = spill568_0;
    spill568_1 = p0;
    if (!((life4_8 != null))) {
        forwardValue568_14_0 = spill568_1;
        break forward_join_14;
    }
    if (!((spill568_1 != null))) {
        break forward_join_15;
    }
    forwardValue568_14_0 = p0;
    }
    __call568_3(forwardValue568_14_0);
    }
    return;
}
public static void h568_0(moom.Oo p0) throws Throwable {
    throw __call1056800_0(p0);
}
private static native long __fieldRead568_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call568_1() throws Throwable;
private static native void __fieldWrite568_2(com.moon.pk a0, com.moon.nk a1) throws Throwable;
private static native void __call568_3(com.moon.nk a0) throws Throwable;
private static native java.lang.Exception __call1056800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_07fb72145c68e999258f(com.moon.pk a0) throws E;
private static final class __SourceHandler_07fb72145c68e999258f {

public static void f569(com.moon.pk receiver) throws Throwable {
    net.minecraft.entity.Entity[] spill569_0;
    long life1_3;
    moom.ir life4_12;
    net.minecraft.entity.Entity[] life3_13;
    float life5_15;
    float life6_17;
    com.moon.module.ModuleCategory[] life7_19;
    int life8_22;
    int life9_24;
    com.moon.module.ModuleCategory life10_31;
    com.moon.ns life11_48;
    lexical_join_71: {
    life1_3 = (__fieldRead569_0() ^ 137849313464185L);
    __call569_3(__fieldRead569_1(receiver), __invokedynamic569_2(receiver));
    spill569_0 = __call569_4();
    life4_12 = __call569_5();
    life3_13 = spill569_0;
    life5_15 = 0x1.4p2f;
    life6_17 = 0x1.4p2f;
    life7_19 = __call569_6();
    life8_22 = (life7_19).length;
    life9_24 = 0;
    lexical_cycle_25: while (true) {
    lexical_join_69: {
    lexical_join_68: {
    if (!((life9_24 < life8_22))) {
        break lexical_join_71;
    }
    life10_31 = (life7_19)[life9_24];
    life11_48 = new com.moon.ns(life10_31, life5_15, life6_17, 0x1.18p7f, ((float) (__call569_7(life4_12) - __invokedynamic569_8(18704, (8218920319347156779L ^ life1_3)))));
    __call569_9(life11_48);
    __call569_11(__fieldRead569_10(receiver), life11_48);
    life5_15 = (life5_15 + 0x1.22p7f);
    if (!((life3_13 != null))) {
        break lexical_join_69;
    }
    if (!((life10_31 == __fieldRead569_12()))) {
        break lexical_join_68;
    }
    __fieldWrite569_13(receiver, life11_48);
    }
    life9_24 += 1;
    }
    if (!((life3_13 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    return;
}
public static void h569_0(moom.Oo p0) throws Throwable {
    throw __call1056900_0(p0);
}
public static void h569_1(moom.Oo p0) throws Throwable {
    throw __call1056901_0(p0);
}
private static native long __fieldRead569_0() throws Throwable;
private static native com.moon.gW __fieldRead569_1(com.moon.pk a0) throws Throwable;
private static native java.util.function.Consumer __invokedynamic569_2(com.moon.pk a0) throws Throwable;
private static native com.moon.gW __call569_3(com.moon.gW a0, java.util.function.Consumer a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call569_4() throws Throwable;
private static native moom.ir __call569_5() throws Throwable;
private static native com.moon.module.ModuleCategory[] __call569_6() throws Throwable;
private static native int __call569_7(moom.ir a0) throws Throwable;
private static native int __invokedynamic569_8(int a0, long a1) throws Throwable;
private static native void __call569_9(com.moon.ns a0) throws Throwable;
private static native java.util.List __fieldRead569_10(com.moon.pk a0) throws Throwable;
private static native boolean __call569_11(java.util.List a0, com.moon.ns a1) throws Throwable;
private static native com.moon.module.ModuleCategory __fieldRead569_12() throws Throwable;
private static native void __fieldWrite569_13(com.moon.pk a0, com.moon.ns a1) throws Throwable;
private static native java.lang.Exception __call1056900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_61c239d0048b97058933(com.moon.pk a0) throws E;
private static final class __SourceHandler_61c239d0048b97058933 {

public static void f570(com.moon.pk receiver) throws Throwable {
    com.moon.pk lexicalValue570_19_0;
    com.moon.pk spill570_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    float life4_27;
    float life5_31;
    float life6_35;
    float life7_39;
    java.util.Iterator life8_57;
    com.moon.nr life9_64;
    lexical_join_72: {
    lexical_join_69: {
    lexical_join_19: {
    lexical_join_18: {
    life1_3 = (__fieldRead570_0() ^ 93939886114245L);
    life3_5 = __call570_1();
    spill570_0 = receiver;
    if (!((life3_5 != null))) {
        lexicalValue570_19_0 = spill570_0;
        break lexical_join_19;
    }
    if (!((__fieldRead570_2(spill570_0) == null))) {
        break lexical_join_18;
    }
    __fieldWrite570_8(receiver, __cast570_7(__call570_6(__call570_4(__call570_3()), __classLiteral570_5())));
    }
    lexicalValue570_19_0 = receiver;
    }
    life4_27 = __call570_10(__fieldRead570_9(lexicalValue570_19_0));
    life5_31 = (0x1.0p0f - life4_27);
    life6_35 = (life5_31 / 0x1.0p1f);
    life7_39 = (life5_31 / 0x1.0p1f);
    __call570_13((life4_27 * __fieldRead570_11()), (life4_27 * __fieldRead570_12()), 0x1.0p0f);
    __call570_14(life6_35, life7_39, 0x0.0p0f);
    __call570_15(life4_27);
    life8_57 = __call570_17(__fieldRead570_16(receiver));
    lexical_cycle_52: while (true) {
    if (!(__call570_18(life8_57))) {
        break lexical_join_69;
    }
    life9_64 = __cast570_20(__call570_19(life8_57));
    __call570_23(life9_64, __fieldRead570_21(receiver), __fieldRead570_22(receiver));
    if (!((life3_5 != null))) {
        break lexical_join_72;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_52; }
    break lexical_cycle_52;
    }
    }
    __call570_24();
    __call570_25();
    __call570_26();
    }
    return;
}
public static void h570_0(moom.Oo p0) throws Throwable {
    throw __call1057000_0(p0);
}
public static void h570_1(moom.Oo p0) throws Throwable {
    throw __call1057001_0(p0);
}
public static void h570_2(moom.Oo p0) throws Throwable {
    throw __call1057002_0(p0);
}
private static native long __fieldRead570_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call570_1() throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead570_2(com.moon.pk a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call570_3() throws Throwable;
private static native com.moon.fU __call570_4(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral570_5() throws Throwable;
private static native com.moon.module.Module __call570_6(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.ClickGUI __cast570_7(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite570_8(com.moon.pk a0, com.moon.module.impl.ClickGUI a1) throws Throwable;
private static native com.moon.nY __fieldRead570_9(com.moon.pk a0) throws Throwable;
private static native float __call570_10(com.moon.nY a0) throws Throwable;
private static native float __fieldRead570_11() throws Throwable;
private static native float __fieldRead570_12() throws Throwable;
private static native void __call570_13(float a0, float a1, float a2) throws Throwable;
private static native void __call570_14(float a0, float a1, float a2) throws Throwable;
private static native void __call570_15(float a0) throws Throwable;
private static native java.util.List __fieldRead570_16(com.moon.pk a0) throws Throwable;
private static native java.util.Iterator __call570_17(java.util.List a0) throws Throwable;
private static native boolean __call570_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call570_19(java.util.Iterator a0) throws Throwable;
private static native com.moon.nr __cast570_20(java.lang.Object a0) throws Throwable;
private static native int __fieldRead570_21(com.moon.pk a0) throws Throwable;
private static native int __fieldRead570_22(com.moon.pk a0) throws Throwable;
private static native void __call570_23(com.moon.nr a0, int a1, int a2) throws Throwable;
private static native void __call570_24() throws Throwable;
private static native void __call570_25() throws Throwable;
private static native void __call570_26() throws Throwable;
private static native java.lang.Exception __call1057000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1057001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1057002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_09d18aa2040c6b7d5eda(com.moon.pk a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_09d18aa2040c6b7d5eda {

public static void f571(com.moon.pk receiver, int p0, int p1, int p2) throws Throwable {
    com.moon.pk lexicalValue571_19_0;
    com.moon.pk lexicalValue571_24_0;
    com.moon.pk spill571_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    float life7_42;
    int life1_48;
    int life2_54;
    java.util.Iterator life8_58;
    com.moon.nr life9_65;
    lexical_join_69: {
    lexical_join_64: {
    lexical_join_30: {
    lexical_join_24: {
    lexical_join_19: {
    lexical_join_18: {
    life4_3 = (__fieldRead571_0() ^ 107837420319L);
    life6_5 = __call571_1();
    spill571_0 = receiver;
    if (!((life6_5 != null))) {
        lexicalValue571_19_0 = spill571_0;
        break lexical_join_19;
    }
    if (!((__fieldRead571_2(spill571_0) != null))) {
        break lexical_join_18;
    }
    __call571_4(__fieldRead571_3(receiver), p0, p1, p2);
    return;
    }
    lexicalValue571_19_0 = receiver;
    }
    if (!((life6_5 != null))) {
        lexicalValue571_24_0 = lexicalValue571_19_0;
        break lexical_join_24;
    }
    if (!((__fieldRead571_5(lexicalValue571_19_0) == null))) {
        break lexical_join_30;
    }
    lexicalValue571_24_0 = receiver;
    }
    __fieldWrite571_11(lexicalValue571_24_0, __cast571_10(__call571_9(__call571_7(__call571_6()), __classLiteral571_8())));
    }
    life7_42 = __fieldRead571_12();
    life1_48 = ((int) (((float) p0) / life7_42));
    life2_54 = ((int) (((float) p1) / life7_42));
    life8_58 = __call571_14(__fieldRead571_13(receiver));
    lexical_cycle_48: while (true) {
    if (!(__call571_15(life8_58))) {
        break lexical_join_64;
    }
    life9_65 = __cast571_17(__call571_16(life8_58));
    __call571_18(life9_65, life1_48, life2_54, p2);
    if (!((life6_5 != null))) {
        break lexical_join_69;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    __call571_19(receiver, life1_48, life2_54, p2);
    }
    return;
}
public static void h571_0(moom.Oo p0) throws Throwable {
    throw __call1057100_0(p0);
}
public static void h571_1(moom.Oo p0) throws Throwable {
    throw __call1057101_0(p0);
}
public static void h571_2(moom.Oo p0) throws Throwable {
    throw __call1057102_0(p0);
}
public static void h571_3(moom.Oo p0) throws Throwable {
    throw __call1057103_0(p0);
}
public static void h571_4(moom.Oo p0) throws Throwable {
    throw __call1057104_0(p0);
}
private static native long __fieldRead571_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call571_1() throws Throwable;
private static native com.moon.nk __fieldRead571_2(com.moon.pk a0) throws Throwable;
private static native com.moon.nk __fieldRead571_3(com.moon.pk a0) throws Throwable;
private static native void __call571_4(com.moon.nk a0, int a1, int a2, int a3) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead571_5(com.moon.pk a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call571_6() throws Throwable;
private static native com.moon.fU __call571_7(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral571_8() throws Throwable;
private static native com.moon.module.Module __call571_9(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.ClickGUI __cast571_10(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite571_11(com.moon.pk a0, com.moon.module.impl.ClickGUI a1) throws Throwable;
private static native float __fieldRead571_12() throws Throwable;
private static native java.util.List __fieldRead571_13(com.moon.pk a0) throws Throwable;
private static native java.util.Iterator __call571_14(java.util.List a0) throws Throwable;
private static native boolean __call571_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call571_16(java.util.Iterator a0) throws Throwable;
private static native com.moon.nr __cast571_17(java.lang.Object a0) throws Throwable;
private static native void __call571_18(com.moon.nr a0, int a1, int a2, int a3) throws Throwable;
private static native void __call571_19(com.moon.pk a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1057100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1057101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1057102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1057103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1057104_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_900fa57b419c76976530(com.moon.pk a0) throws E;
private static final class __SourceHandler_900fa57b419c76976530 {

public static void f572(com.moon.pk receiver) throws Throwable {
    java.lang.Object lexicalValue572_22_0;
    com.moon.pk lexicalValue572_51_0;
    com.moon.module.impl.ClickGUI spill572_0;
    com.moon.pk spill572_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    java.util.Iterator life4_65;
    com.moon.nr life5_72;
    lexical_join_71: {
    lexical_join_69: {
    lexical_join_51: {
    lexical_join_43: {
    lexical_join_22: {
    lexical_join_18: {
    life1_3 = (__fieldRead572_0() ^ 30677880640409L);
    life3_5 = __call572_1();
    spill572_0 = __fieldRead572_2(receiver);
    if (!((life3_5 != null))) {
        lexicalValue572_22_0 = spill572_0;
        break lexical_join_22;
    }
    if (!((spill572_0 == null))) {
        break lexical_join_18;
    }
    __fieldWrite572_8(receiver, __cast572_7(__call572_6(__call572_4(__call572_3()), __classLiteral572_5())));
    }
    lexicalValue572_22_0 = __call572_11(__call572_10(__fieldRead572_9(receiver)));
    }
    __fieldWrite572_14(__call572_13(__cast572_12(lexicalValue572_22_0)));
    __fieldWrite572_18(receiver, __fieldRead572_17(__fieldRead572_16(__fieldRead572_15(receiver))));
    spill572_1 = receiver;
    if (!((life3_5 != null))) {
        lexicalValue572_51_0 = spill572_1;
        break lexical_join_51;
    }
    if (!((!__fieldRead572_19(spill572_1)))) {
        break lexical_join_43;
    }
    __fieldWrite572_22(__fieldRead572_21(__fieldRead572_20(receiver)), 1);
    __call572_23(1);
    }
    __fieldWrite572_24(receiver, 0);
    __call572_26(__fieldRead572_25(receiver), 0x0.0p0f);
    lexicalValue572_51_0 = receiver;
    }
    life4_65 = __call572_28(__fieldRead572_27(lexicalValue572_51_0));
    lexical_cycle_54: while (true) {
    if (!(__call572_29(life4_65))) {
        break lexical_join_69;
    }
    life5_72 = __cast572_31(__call572_30(life4_65));
    __call572_32(life5_72, 1);
    if (!((life3_5 != null))) {
        break lexical_join_71;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_54; }
    break lexical_cycle_54;
    }
    }
    __call572_33(receiver);
    }
    return;
}
public static void h572_0(moom.Oo p0) throws Throwable {
    throw __call1057200_0(p0);
}
public static void h572_1(moom.Oo p0) throws Throwable {
    throw __call1057201_0(p0);
}
public static void h572_2(moom.Oo p0) throws Throwable {
    throw __call1057202_0(p0);
}
public static void h572_3(moom.Oo p0) throws Throwable {
    throw __call1057203_0(p0);
}
public static void h572_4(moom.Oo p0) throws Throwable {
    throw __call1057204_0(p0);
}
private static native long __fieldRead572_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call572_1() throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead572_2(com.moon.pk a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call572_3() throws Throwable;
private static native com.moon.fU __call572_4(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral572_5() throws Throwable;
private static native com.moon.module.Module __call572_6(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.ClickGUI __cast572_7(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite572_8(com.moon.pk a0, com.moon.module.impl.ClickGUI a1) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead572_9(com.moon.pk a0) throws Throwable;
private static native com.moon.setting.FloatSetting __call572_10(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native java.lang.Object __call572_11(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast572_12(java.lang.Object a0) throws Throwable;
private static native float __call572_13(java.lang.Float a0) throws Throwable;
private static native void __fieldWrite572_14(float a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead572_15(com.moon.pk a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead572_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead572_17(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __fieldWrite572_18(com.moon.pk a0, boolean a1) throws Throwable;
private static native boolean __fieldRead572_19(com.moon.pk a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead572_20(com.moon.pk a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead572_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite572_22(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native void __call572_23(int a0) throws Throwable;
private static native void __fieldWrite572_24(com.moon.pk a0, int a1) throws Throwable;
private static native com.moon.nY __fieldRead572_25(com.moon.pk a0) throws Throwable;
private static native void __call572_26(com.moon.nY a0, float a1) throws Throwable;
private static native java.util.List __fieldRead572_27(com.moon.pk a0) throws Throwable;
private static native java.util.Iterator __call572_28(java.util.List a0) throws Throwable;
private static native boolean __call572_29(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call572_30(java.util.Iterator a0) throws Throwable;
private static native com.moon.nr __cast572_31(java.lang.Object a0) throws Throwable;
private static native com.moon.nr __call572_32(com.moon.nr a0, int a1) throws Throwable;
private static native void __call572_33(com.moon.pk a0) throws Throwable;
private static native java.lang.Exception __call1057200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1057201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1057202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1057203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1057204_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_664ae99fc5e9b120404c(com.moon.pk a0) throws E;
private static final class __SourceHandler_664ae99fc5e9b120404c {

public static void f573(com.moon.pk receiver) throws Throwable {
    int forwardValue573_17_0;
    boolean spill573_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead573_0() ^ 57222743037236L);
    life3_5 = __call573_1();
    spill573_0 = __fieldRead573_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue573_17_0 = __integerCategory573_3(spill573_0);
        break forward_join_17;
    }
    if (!((!spill573_0))) {
        break forward_join_18;
    }
    __fieldWrite573_6(__fieldRead573_5(__fieldRead573_4(receiver)), 0);
    forwardValue573_17_0 = 0;
    }
    __call573_7(forwardValue573_17_0);
    }
    return;
}
public static void h573_0(moom.Oo p0) throws Throwable {
    throw __call1057300_0(p0);
}
public static void h573_1(moom.Oo p0) throws Throwable {
    throw __call1057301_0(p0);
}
private static native long __fieldRead573_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call573_1() throws Throwable;
private static native boolean __fieldRead573_2(com.moon.pk a0) throws Throwable;
private static native int __integerCategory573_3(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead573_4(com.moon.pk a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead573_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite573_6(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native void __call573_7(int a0) throws Throwable;
private static native java.lang.Exception __call1057300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1057301_0(moom.Oo a0) throws Throwable;

}


private void b() { __sourceHandlerCall_61c239d0048b97058933(this); }


protected void b(int p0, int p1, int p2) { __sourceHandlerCall_09d18aa2040c6b7d5eda(this, p0, p1, p2); }


public void c__Void() { __sourceHandlerCall_900fa57b419c76976530(this); }


public void h() {
((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a(((java.lang.Runnable)(__sourceIntrinsic_a33ceaa00d22_originalDynamicSite617_1(this))));
    return;
}


private static long d(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12709);
    if (((com.moon.pk.Q)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.pk.P)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.pk.R)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.pk.R)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/pk", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.pk.Q)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.pk.Q)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral3267_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.pk.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25004;
      if (N[var3] == null) {
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
         long var5 = M[var3];
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
         Object[] var9 = (Object[])O.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               O.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/pk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         N[var3] = var15;
      }

      return N[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(com.moon.ej p0) { __sourceHandlerCall_42d6b404c42490379bcc(this, p0); }


public com.moon.ns a__ns() {
return this.C;
}


public com.moon.nk a__nk() {
return this.K;
}


public void a__Void() { __sourceHandlerCall_07fb72145c68e999258f(this); }


public void a(com.moon.ei p0) { __sourceHandlerCall_e22de2aaba06619accab(this, p0); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3271_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.pk.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.gW a() {
return this.y;
}


public boolean a__Boolean() {
return ((0) != 0);
}


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_de9cfe4c836a0960dcd7(this, p0, p1); }


public void a(com.moon.nk p0) { __sourceHandlerCall_c016e78e696d1cf05b36(this, p0); }


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_e84629e8e7a09d0e6ec5(this, p0, p1, p2); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_fb7465a05f061c1a4d6c(this, p0, p1, p2); }


public com.moon.module.impl.ClickGUI a__lS() {
return this.F;
}


public com.moon.pk a(com.moon.nw p0) {
this.J = ((com.moon.nw)(p0));
    return this;
}


private void lambda$init$0(java.lang.Boolean p0) {
((com.moon.pk)(this)).b();
    return;
}


private void lambda$onGuiClosed$1() { __sourceHandlerCall_664ae99fc5e9b120404c(this); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3271_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral3267_0() throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_a33ceaa00d22_originalDynamicSite617_1(com.moon.pk a0) throws E;
}
