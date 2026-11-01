package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ph extends net.minecraft.client.gui.GuiScreen {

private moom.DD w;

private com.v x;

private com.moon.mz y;

private com.moon.pc z;

private boolean A;

private boolean B;

private static long C;

private static java.lang.String[] D;

private static java.lang.String[] E;

private static java.util.Map F;

private static long[] G;

private static java.lang.Integer[] H;

private static java.util.Map I;

public ph() { super(); __sourceHandlerCall_46572f8ca53fb2ffa13c(this); }


static {
C = ((long)(((moom._a)(moom._c.a(((long)(4299851592365120177L)), ((long)(-4937946477735329136L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(220787890688664L)))));
    F = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.ph.C ^ 20597292931129L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill374_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill374_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill374_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill374_14 = new byte[8];
    (__sourceSpill374_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill374_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation374_16 = __sourceSpill374_14;
    ((javax.crypto.Cipher)(__sourceSpill374_11)).init(((int)(__sourceSpill374_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill374_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation374_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[13];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "%ßù)ªñVæt¿T¾á N\013\006\032Gb³ü¢´ÚzTÀÀ\022m\017\021WK#FFÚ\\`\000\020'S/\005G\177&½ò\017óÚê\005ØJ\030í1Å¼1è\007Du|#Ê©9{(r>\030\0307e\020îNM^\0226¬îþïE\bUJ\030bóÊÈÊÂ\017\0349Ês\007I·iª1¼\1770Ã!ºÍÏ2\025yhSK*z²9L\006\003µ\006úÞâ¹Ów½@cæk°ÄÆÁö\002kåÂ&Dè¿\020¾¤B£y\020Ò)÷¦m«\036|È n´ã>&#â6\020c-úÃ½NyÆç<Â±7}w»\b³P7)\n>·ªk\007ØÅ'i/Kp@a\016|4Q\025¼ÍÃ¢Oû4|U÷`Åjÿ(NÅü}Ç,}ÀÃÆ~\rMc.=-J3«y_«ô´\004ù>ªªp \1778:\004Xo~>Y±ÓMo\037\f\022À¢ìûÏx§RJê"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill374_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill374_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill374_29)).doFinal(((byte[])(__sourceSpill374_28)));
        java.lang.String __sourceSpill374_34 = ((java.lang.String)(com.moon.ph.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill374_35 = local20_life19;
        int __sourceSpill374_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill374_35)[__sourceSpill374_36] = __sourceSpill374_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "\013±@°R\002ÑD@7N-R\025!t-XØÉæ¢NbºI\020ªÂyñã³Ëo÷Íf/î\033"))).length();
    local16_life24 = 32;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill374_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill374_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill374_42)).doFinal(((byte[])(__sourceSpill374_41)));
        java.lang.String __sourceSpill374_47 = ((java.lang.String)(com.moon.ph.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill374_48 = local20_life19;
        int __sourceSpill374_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill374_48)[__sourceSpill374_49] = __sourceSpill374_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    D = ((java.lang.String[])(local20_life19));
    E = ((java.lang.String[])(new java.lang.String[13]));
    I = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill374_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill374_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill374_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill374_60 = new byte[8];
    (__sourceSpill374_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill374_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation374_62 = __sourceSpill374_60;
    ((javax.crypto.Cipher)(__sourceSpill374_57)).init(((int)(__sourceSpill374_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill374_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation374_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[6];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "Ù/}\b¥h\feülHÜ¨¢F·¬#´\005%»úûÝ\032"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill374_71 = local4_life67;
        int __sourceSpill374_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill374_71)).substring(((int)(__sourceSpill374_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill374_76 = local6_life65;
        int __sourceSpill374_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill374_79 = new byte[8];
        (__sourceSpill374_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill374_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill374_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill374_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill374_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill374_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill374_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill374_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill374_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill374_80)).doFinal(((byte[])(__sourceSpill374_79)));
        (__sourceSpill374_76)[__sourceSpill374_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "2DÄåú\036ØùÃ{Äôú=F"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill374_84 = local4_life67;
        int __sourceSpill374_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill374_84)).substring(((int)(__sourceSpill374_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill374_89 = local6_life65;
        int __sourceSpill374_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill374_92 = new byte[8];
        (__sourceSpill374_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill374_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill374_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill374_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill374_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill374_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill374_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill374_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill374_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill374_93)).doFinal(((byte[])(__sourceSpill374_92)));
        (__sourceSpill374_89)[__sourceSpill374_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    G = ((long[])(local6_life65));
    H = ((java.lang.Integer[])(new java.lang.Integer[6]));
}

private static native <E extends Throwable> void __sourceHandlerCall_46572f8ca53fb2ffa13c(com.moon.ph a0) throws E;
private static final class __SourceHandler_46572f8ca53fb2ffa13c {

public static void f129(com.moon.ph receiver) throws Throwable {
    com.moon.ph forwardValue129_37_0;
    int forwardValue129_37_1;
    com.moon.ph forwardValue129_38_0;
    com.moon.ph forwardValue129_39_0;
    int forwardValue129_39_1;
    boolean spill129_0;
    com.moon.ph spill129_1;
    int spill129_2;
    com.moon.ph spill129_3;
    long life1_3;
    int life3_7;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    life1_3 = (__fieldRead129_0() ^ 21285365698358L);
    spill129_0 = __call129_1();
    __directSuperInit129_2(receiver);
    life3_7 = __integerCategory129_3(spill129_0);
    __fieldWrite129_5(receiver, new moom.DD(__invokedynamic129_4(29557, (6401109526210029208L ^ life1_3))));
    spill129_1 = receiver;
    spill129_2 = __invokedynamic129_6(24962, (5852514623725866342L ^ life1_3));
    if (!((life3_7 == 0))) {
        forwardValue129_37_0 = spill129_1;
        forwardValue129_37_1 = spill129_2;
        break forward_join_37;
    }
    __fieldWrite129_8(spill129_1, __call129_7(spill129_2));
    spill129_3 = receiver;
    if (!((__call129_10(__invokedynamic129_9(2326, (244110763823914236L ^ life1_3))) != null))) {
        forwardValue129_38_0 = spill129_3;
        break forward_join_38;
    }
    forwardValue129_37_0 = spill129_3;
    forwardValue129_37_1 = 1;
    }
    forwardValue129_39_0 = forwardValue129_37_0;
    forwardValue129_39_1 = forwardValue129_37_1;
    break forward_join_39;
    }
    forwardValue129_39_0 = forwardValue129_38_0;
    forwardValue129_39_1 = 0;
    }
    __fieldWrite129_11(forwardValue129_39_0, forwardValue129_39_1);
    return;
}
public static void h129_0(moom.Oo p0) throws Throwable {
    throw __call3012900_0(p0);
}
public static void h129_1(moom.Oo p0) throws Throwable {
    throw __call3012901_0(p0);
}
private static native long __fieldRead129_0() throws Throwable;
private static native boolean __call129_1() throws Throwable;
private static native void __directSuperInit129_2(com.moon.ph a0) throws Throwable;
private static native int __integerCategory129_3(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic129_4(int a0, long a1) throws Throwable;
private static native void __fieldWrite129_5(com.moon.ph a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic129_6(int a0, long a1) throws Throwable;
private static native com.v __call129_7(int a0) throws Throwable;
private static native void __fieldWrite129_8(com.moon.ph a0, com.v a1) throws Throwable;
private static native java.lang.String __invokedynamic129_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call129_10(java.lang.String a0) throws Throwable;
private static native void __fieldWrite129_11(com.moon.ph a0, int a1) throws Throwable;
private static native java.lang.Exception __call3012900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3012901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0295a1a89b42b92ef9af(com.moon.ph a0, char a1, int a2) throws E;
private static final class __SourceHandler_0295a1a89b42b92ef9af {

public static void f55(com.moon.ph receiver, char p0, int p1) throws Throwable {
    int forwardValue55_17_0;
    int spill55_0;
    long life3_3;
    int life5_5;
    forward_join_17: {
    forward_join_12: {
    life3_3 = (__fieldRead55_0() ^ 85714582091767L);
    life5_5 = __integerCategory55_2(__call55_1());
    spill55_0 = p1;
    if (!((life5_5 != 0))) {
        forwardValue55_17_0 = spill55_0;
        break forward_join_17;
    }
    if (!((spill55_0 == 1))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue55_17_0 = __integerCategory55_5(__call55_4(__fieldRead55_3(receiver), p0, p1));
    }
    __discardScalar55_6(forwardValue55_17_0);
    __call55_7(receiver, p0, p1);
    return;
}
public static void h55_0(java.io.IOException p0) throws Throwable {
    throw __call1005500_0(p0);
}
public static void h55_1(java.io.IOException p0) throws Throwable {
    throw __call1005501_0(p0);
}
private static native long __fieldRead55_0() throws Throwable;
private static native boolean __call55_1() throws Throwable;
private static native int __integerCategory55_2(boolean value) throws Throwable;
private static native com.moon.pc __fieldRead55_3(com.moon.ph a0) throws Throwable;
private static native boolean __call55_4(com.moon.pc a0, char a1, int a2) throws Throwable;
private static native int __integerCategory55_5(boolean value) throws Throwable;
private static native void __discardScalar55_6(int a0) throws Throwable;
private static native void __call55_7(com.moon.ph a0, char a1, int a2) throws Throwable;
private static native java.lang.Exception __call1005500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005501_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_45c0f6adf306a5022f50(com.moon.ph a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_45c0f6adf306a5022f50 {

public static void f551(com.moon.ph receiver, int p0, int p1, int p2) throws Throwable {
    com.moon.ph forwardValue551_24_0;
    boolean spill551_0;
    com.moon.ph spill551_1;
    long life4_3;
    int life6_11;
    forward_join_24: {
    forward_join_23: {
    life4_3 = (__fieldRead551_0() ^ 23913379624224L);
    spill551_0 = __call551_1();
    __call551_3(__fieldRead551_2(receiver), p0, p1, p2);
    life6_11 = __integerCategory551_4(spill551_0);
    spill551_1 = receiver;
    if (!((life6_11 != 0))) {
        forwardValue551_24_0 = spill551_1;
        break forward_join_24;
    }
    if (!(__call551_6(__fieldRead551_5(spill551_1), p0, p1, p2))) {
        break forward_join_23;
    }
    __call551_7(receiver);
    }
    forwardValue551_24_0 = receiver;
    }
    __call551_8(forwardValue551_24_0, p0, p1, p2);
    return;
}
public static void h551_0(java.io.IOException p0) throws Throwable {
    throw __call1055100_0(p0);
}
public static void h551_1(java.io.IOException p0) throws Throwable {
    throw __call1055101_0(p0);
}
private static native long __fieldRead551_0() throws Throwable;
private static native boolean __call551_1() throws Throwable;
private static native com.moon.pc __fieldRead551_2(com.moon.ph a0) throws Throwable;
private static native void __call551_3(com.moon.pc a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory551_4(boolean value) throws Throwable;
private static native com.moon.mz __fieldRead551_5(com.moon.ph a0) throws Throwable;
private static native boolean __call551_6(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native void __call551_7(com.moon.ph a0) throws Throwable;
private static native void __call551_8(com.moon.ph a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1055100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055101_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d952f66abdda273fd7d6(com.moon.ph a0) throws E;
private static final class __SourceHandler_d952f66abdda273fd7d6 {

public static void f100042(com.moon.ph receiver) throws Throwable {
    boolean spill100042_0;
    long life1_3;
    com.moon.jm life4_8;
    moom.ir life5_10;
    float life6_12;
    float life7_22;
    float life8_36;
    float life9_46;
    float life10_52;
    float life11_54;
    com.moon.hW life12_59;
    com.moon.hW life13_95;
    int life3_133;
    forest_join_141: {
    life1_3 = (__fieldRead100042_0() ^ 49241037721517L);
    life4_8 = __call100042_4(__call100042_2(__call100042_1()), __fieldRead100042_3());
    life5_10 = __call100042_5();
    life6_12 = 0x1.bp6f;
    life7_22 = ((((float) __call100042_6(life5_10)) / 0x1.0p1f) - (life6_12 / 0x1.0p1f));
    spill100042_0 = __call100042_7();
    life8_36 = ((0x1.0p6f + __call100042_9(life4_8, __invokedynamic100042_8(18991, (4385797974236569432L ^ life1_3)), 0x1.0p5f)) + 0x1.9p3f);
    life9_46 = ((((float) __call100042_10(life5_10)) / 0x1.0p1f) - (life8_36 / 0x1.0p1f));
    life10_52 = __call100042_11((life7_22 - 0x1.fp6f), 0x0.0p0f);
    life11_54 = 0x1.0p6f;
    life12_59 = __call100042_15(__call100042_14(__call100042_12(), __fieldRead100042_13()));
    __call100042_18(life12_59, __call100042_17(life9_46, life10_52, (life9_46 + life11_54), (life10_52 + life11_54), 0x0.0p0f, 0x0.0p0f, 0x1.0p0f, 0x1.0p0f, __invokedynamic100042_16(25430, (7415203204447276846L ^ life1_3))));
    __call100042_22(__call100042_20(__call100042_19()), __fieldRead100042_21(receiver));
    __call100042_23(life12_59);
    __call100042_24(0);
    life13_95 = __call100042_29(__call100042_28(__call100042_27(__call100042_25(), __fieldRead100042_26()), life4_8));
    __call100042_37(life4_8, life13_95, __invokedynamic100042_30(29616, (5931761558939412165L ^ life1_3)), 0x1.0p5f, (life9_46 + 0x1.0p6f), ((life10_52 + (life11_54 / 0x1.0p1f)) - (__call100042_31(life4_8, 0x1.0p5f) / 0x1.0p1f)), __call100042_36(__call100042_35(new com.moon.aO(__call100042_33(__fieldRead100042_32(receiver))), __invokedynamic100042_34(3870, (3685816728142275424L ^ life1_3)))), 0);
    life3_133 = __integerCategory100042_38(spill100042_0);
    __call100042_39(life13_95);
    if (!((life3_133 != 0))) {
        break forest_join_141;
    }
    __call100042_40(new java.lang.String[5]);
    }
    return;
}
public static void h100042_0(moom.Oo p0) throws Throwable {
    throw __call13004200_0(p0);
}
private static native long __fieldRead100042_0() throws Throwable;
private static native com.moon.runtime.ClientContext __call100042_1() throws Throwable;
private static native com.moon.jo __call100042_2(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.ce __fieldRead100042_3() throws Throwable;
private static native com.moon.jm __call100042_4(com.moon.jo a0, com.moon.ce a1) throws Throwable;
private static native moom.ir __call100042_5() throws Throwable;
private static native int __call100042_6(moom.ir a0) throws Throwable;
private static native boolean __call100042_7() throws Throwable;
private static native java.lang.String __invokedynamic100042_8(int a0, long a1) throws Throwable;
private static native float __call100042_9(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native int __call100042_10(moom.ir a0) throws Throwable;
private static native float __call100042_11(float a0, float a1) throws Throwable;
private static native com.moon.hX __call100042_12() throws Throwable;
private static native com.moon.cb __fieldRead100042_13() throws Throwable;
private static native com.moon.hX __call100042_14(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call100042_15(com.moon.hX a0) throws Throwable;
private static native int __invokedynamic100042_16(int a0, long a1) throws Throwable;
private static native com.moon.i7 __call100042_17(float a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7, int a8) throws Throwable;
private static native void __call100042_18(com.moon.hW a0, com.moon.i7 a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call100042_19() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call100042_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead100042_21(com.moon.ph a0) throws Throwable;
private static native void __call100042_22(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call100042_23(com.moon.hW a0) throws Throwable;
private static native void __call100042_24(int a0) throws Throwable;
private static native com.moon.hX __call100042_25() throws Throwable;
private static native com.moon.cb __fieldRead100042_26() throws Throwable;
private static native com.moon.hX __call100042_27(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call100042_28(com.moon.hX a0, com.moon.jm a1) throws Throwable;
private static native com.moon.hW __call100042_29(com.moon.hX a0) throws Throwable;
private static native java.lang.String __invokedynamic100042_30(int a0, long a1) throws Throwable;
private static native float __call100042_31(com.moon.jm a0, float a1) throws Throwable;
private static native com.v __fieldRead100042_32(com.moon.ph a0) throws Throwable;
private static native int __call100042_33(com.v a0) throws Throwable;
private static native int __invokedynamic100042_34(int a0, long a1) throws Throwable;
private static native com.moon.aO __call100042_35(com.moon.aO a0, int a1) throws Throwable;
private static native int __call100042_36(com.moon.aO a0) throws Throwable;
private static native void __call100042_37(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6, int a7) throws Throwable;
private static native int __integerCategory100042_38(boolean value) throws Throwable;
private static native void __call100042_39(com.moon.hW a0) throws Throwable;
private static native void __call100042_40(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call13004200_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_33d1cccd38e9c433cb7b(com.moon.ph a0) throws E;
private static final class __SourceHandler_33d1cccd38e9c433cb7b {

public static void f552(com.moon.ph receiver) throws Throwable {
    com.moon.ph forwardValue552_108_0;
    com.moon.ph forwardValue552_113_0;
    int forwardValue552_121_0;
    boolean spill552_0;
    com.moon.ph spill552_1;
    com.moon.ph spill552_2;
    long life1_3;
    moom.ir life4_5;
    float life5_7;
    float life6_9;
    float life7_19;
    float life8_30;
    int life3_31;
    java.lang.String life9_96;
    forward_join_122: {
    forward_join_121: {
    forward_join_120: {
    forward_join_113: {
    forward_join_112: {
    forward_join_108: {
    forward_join_107: {
    life1_3 = (__fieldRead552_0() ^ 76961936305082L);
    life4_5 = __call552_1();
    life5_7 = 0x1.c2p7f;
    life6_9 = 0x1.bp6f;
    life7_19 = ((((float) __call552_2(life4_5)) / 0x1.0p1f) - (life5_7 / 0x1.0p1f));
    spill552_0 = __call552_3();
    life8_30 = ((((float) __call552_4(life4_5)) / 0x1.0p1f) - (life6_9 / 0x1.0p1f));
    life3_31 = __integerCategory552_5(spill552_0);
    __fieldWrite552_10(receiver, new com.moon.pc(0, __fieldRead552_7(__call552_6()), (life7_19 + 0x1.cp2f), (life8_30 + 0x1.9p5f), ((int) (life5_7 - 0x1.cp3f)), __invokedynamic552_8(4535, (6887607329654168028L ^ life1_3)), __fieldRead552_9(receiver)));
    __fieldWrite552_13(receiver, new com.moon.mz(((life7_19 + (life5_7 / 0x1.0p1f)) - 0x1.9p5f), (life8_30 + 0x1.39p6f), 0x1.9p6f, 0x1.6p4f, __invokedynamic552_11(10950, (3582208236943727532L ^ life1_3)), false, __fieldRead552_12(receiver)));
    spill552_1 = receiver;
    if (!((life3_31 != 0))) {
        forwardValue552_113_0 = spill552_1;
        break forward_join_113;
    }
    if (!(__fieldRead552_14(spill552_1))) {
        break forward_join_112;
    }
    life9_96 = __call552_16(__invokedynamic552_15(5811, (7149242040122140637L ^ life1_3)));
    __call552_18(__fieldRead552_17(receiver), life9_96);
    spill552_2 = receiver;
    if (!((life3_31 != 0))) {
        forwardValue552_108_0 = spill552_2;
        break forward_join_108;
    }
    if (!((!__fieldRead552_19(spill552_2)))) {
        break forward_join_107;
    }
    __call552_20(receiver);
    if (!((life3_31 == 0))) {
        break forward_join_112;
    }
    }
    forwardValue552_108_0 = receiver;
    }
    __call552_22(__fieldRead552_21(forwardValue552_108_0), 1);
    }
    forwardValue552_113_0 = receiver;
    }
    __call552_23(forwardValue552_113_0);
    if (!((__call552_24() != null))) {
        break forward_join_122;
    }
    if (!((life3_31 != 0))) {
        break forward_join_120;
    }
    forwardValue552_121_0 = 0;
    break forward_join_121;
    }
    forwardValue552_121_0 = 1;
    }
    __call552_25(forwardValue552_121_0);
    }
    return;
}
public static void h552_0(moom.Oo p0) throws Throwable {
    throw __call1055200_0(p0);
}
public static void h552_1(moom.Oo p0) throws Throwable {
    throw __call1055201_0(p0);
}
public static void h552_2(moom.Oo p0) throws Throwable {
    throw __call1055202_0(p0);
}
public static void h552_3(moom.Oo p0) throws Throwable {
    throw __call1055203_0(p0);
}
public static void h552_4(moom.Oo p0) throws Throwable {
    throw __call1055204_0(p0);
}
public static void h552_5(moom.Oo p0) throws Throwable {
    throw __call1055205_0(p0);
}
private static native long __fieldRead552_0() throws Throwable;
private static native moom.ir __call552_1() throws Throwable;
private static native int __call552_2(moom.ir a0) throws Throwable;
private static native boolean __call552_3() throws Throwable;
private static native int __call552_4(moom.ir a0) throws Throwable;
private static native int __integerCategory552_5(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __call552_6() throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead552_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic552_8(int a0, long a1) throws Throwable;
private static native com.v __fieldRead552_9(com.moon.ph a0) throws Throwable;
private static native void __fieldWrite552_10(com.moon.ph a0, com.moon.pc a1) throws Throwable;
private static native java.lang.String __invokedynamic552_11(int a0, long a1) throws Throwable;
private static native com.v __fieldRead552_12(com.moon.ph a0) throws Throwable;
private static native void __fieldWrite552_13(com.moon.ph a0, com.moon.mz a1) throws Throwable;
private static native boolean __fieldRead552_14(com.moon.ph a0) throws Throwable;
private static native java.lang.String __invokedynamic552_15(int a0, long a1) throws Throwable;
private static native java.lang.String __call552_16(java.lang.String a0) throws Throwable;
private static native com.moon.pc __fieldRead552_17(com.moon.ph a0) throws Throwable;
private static native void __call552_18(com.moon.pc a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead552_19(com.moon.ph a0) throws Throwable;
private static native void __call552_20(com.moon.ph a0) throws Throwable;
private static native com.moon.mz __fieldRead552_21(com.moon.ph a0) throws Throwable;
private static native com.moon.mz __call552_22(com.moon.mz a0, int a1) throws Throwable;
private static native void __call552_23(com.moon.ph a0) throws Throwable;
private static native java.lang.String[] __call552_24() throws Throwable;
private static native void __call552_25(int a0) throws Throwable;
private static native java.lang.Exception __call1055200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055205_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d735f574a5f7670ad90b(com.moon.ph a0) throws E;
private static final class __SourceHandler_d735f574a5f7670ad90b {

public static void f553(com.moon.ph receiver) throws Throwable {
    com.moon.ph forwardValue553_27_0;
    com.moon.ph spill553_0;
    long life1_3;
    int life3_5;
    forward_join_27: {
    forward_join_12: {
    life1_3 = (__fieldRead553_0() ^ 510619780388L);
    life3_5 = __integerCategory553_2(__call553_1());
    spill553_0 = receiver;
    if (!((life3_5 == 0))) {
        forwardValue553_27_0 = spill553_0;
        break forward_join_27;
    }
    if (!(__fieldRead553_3(spill553_0))) {
        break forward_join_12;
    }
    return;
    }
    __call553_5(__fieldRead553_4(receiver), 1);
    __call553_8(__fieldRead553_6(receiver), __invokedynamic553_7(7611, (3962389266993709646L ^ life1_3)));
    forwardValue553_27_0 = receiver;
    }
    __fieldWrite553_9(forwardValue553_27_0, 1);
    __call553_12(new java.lang.Thread(__invokedynamic553_10(receiver), __invokedynamic553_11(8260, (7889178473008971702L ^ life1_3))));
    return;
}
public static void h553_0(moom.Oo p0) throws Throwable {
    throw __call1055300_0(p0);
}
public static void h553_1(moom.Oo p0) throws Throwable {
    throw __call1055301_0(p0);
}
private static native long __fieldRead553_0() throws Throwable;
private static native boolean __call553_1() throws Throwable;
private static native int __integerCategory553_2(boolean value) throws Throwable;
private static native boolean __fieldRead553_3(com.moon.ph a0) throws Throwable;
private static native com.moon.mz __fieldRead553_4(com.moon.ph a0) throws Throwable;
private static native com.moon.mz __call553_5(com.moon.mz a0, int a1) throws Throwable;
private static native com.moon.mz __fieldRead553_6(com.moon.ph a0) throws Throwable;
private static native java.lang.String __invokedynamic553_7(int a0, long a1) throws Throwable;
private static native com.moon.mz __call553_8(com.moon.mz a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite553_9(com.moon.ph a0, int a1) throws Throwable;
private static native java.lang.Runnable __invokedynamic553_10(com.moon.ph a0) throws Throwable;
private static native java.lang.String __invokedynamic553_11(int a0, long a1) throws Throwable;
private static native void __call553_12(java.lang.Thread a0) throws Throwable;
private static native java.lang.Exception __call1055300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055301_0(moom.Oo a0) throws Throwable;

}


protected void b(int p0, int p1, int p2) {
super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void b() { __sourceHandlerCall_d952f66abdda273fd7d6(this); }


public void c__Void() { __sourceHandlerCall_33d1cccd38e9c433cb7b(this); }


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral3236_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ph"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ph.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6941;
      if (H[var3] == null) {
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
         long var5 = G[var3];
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
         Object[] var9 = (Object[])I.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               I.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ph", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         H[var3] = var15;
      }

      return H[var3];
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
        byte[] spill1549_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1549_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1549_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1549_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1549_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1549_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8733);
    if (((com.moon.ph.E)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.ph.F)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.ph.F)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ph", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.ph.D)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.ph.E)[life5_8] = com.moon.ph.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.ph.E)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.ph.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3239_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ph"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a(com.moon.hW p0) {
java.lang.Object local2 = com.moon.nS.a();
    float local3 = 0x1.c2p7f;
    float local4 = 0x1.bp6f;
    float local5 = ((((float) ((moom.ir)(local2)).a__Int()) / 0x1.0p1f) - (local3 / 0x1.0p1f));
    float local6 = ((((float) ((moom.ir)(local2)).b__Int()) / 0x1.0p1f) - (local4 / 0x1.0p1f));
    ((com.moon.hW)(p0)).a(((com.moon.iX)(com.moon.i3.a(((float)(local5)), ((float)(local6)), ((float)(local3)), ((float)(local4)), ((float)(0x1.cp2f)), ((int)(((com.v)(this.x)).u()))))));
    return;
}


public void a(int p0, int p1, float p2) {
long local4_life2 = (com.moon.ph.C ^ 132644027133500L);
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite264_5(19989, (3978992316257371129L ^ local4_life2)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite264_7(21525, (8594271396221721085L ^ local4_life2)))));
    moom.kZ.d__Void();
    com.moon.hW local6_life14 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(local6_life14)).a(((com.moon.iX)(com.moon.i3.a(((float)(-0x1.0000000000000p+1F)), ((float)(-0x1.0000000000000p+1F)), ((float)(((float) (this.k + 4)))), ((float)(((float) (this.l + 4)))), ((float)(0x0.0p0f)), ((int)(((com.v)(this.x)).q()))))));
    ((com.moon.ph)(this)).a(((com.moon.hW)(local6_life14)));
    ((com.moon.hW)(local6_life14)).b();
    ((com.moon.ph)(this)).a();
    ((com.moon.mz)(this.y)).a(((int)(p0)), ((int)(p1)));
    ((com.moon.pc)(this.z)).d__Void();
    ((com.moon.ph)(this)).b();
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_45c0f6adf306a5022f50(this, p0, p1, p2); }


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_0295a1a89b42b92ef9af(this, p0, p1); }


private void a() {
long local1_life2 = (com.moon.ph.C ^ 131692957154551L);
    moom.ir local3_life4 = com.moon.nS.a();
    float local4_life6 = 0x1.c200000000000p+7F;
    float local5_life8 = 0x1.b000000000000p+6F;
    float local6_life10 = ((((float) ((moom.ir)(local3_life4)).a__Int()) / 0x1.0p1f) - (local4_life6 / 0x1.0p1f));
    float local7_life12 = ((((float) ((moom.ir)(local3_life4)).b__Int()) / 0x1.0p1f) - (local5_life8 / 0x1.0p1f));
    com.moon.jm local8_life17 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.SOURCE_SANS)));
    com.moon.hW local9_life23 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(local8_life17))))).a();
    ((com.moon.jm)(local8_life17)).a(((com.moon.hW)(local9_life23)), ((java.lang.String)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite263_25(26664, (5095515666887626252L ^ local1_life2)))), ((float)(0x1.2000000000000p+4F)), ((float)((local6_life10 + 0x1.0000000000000p+3F))), ((float)((local7_life12 + 0x1.0000000000000p+2F))), ((int)(((com.v)(this.x)).a())), ((boolean)(true)));
    ((com.moon.jm)(local8_life17)).a(((com.moon.hW)(local9_life23)), ((java.lang.String)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite263_33(28366, (1358574197694286048L ^ local1_life2)))), ((float)(0x1.0000000000000p+3F)), ((float)((local6_life10 + 0x1.0000000000000p+3F))), ((float)((local7_life12 + 0x1.7000000000000p+4F))), ((int)(((com.v)(this.x)).e())), ((boolean)(true)));
    ((com.moon.jm)(local8_life17)).a(((com.moon.hW)(local9_life23)), ((java.lang.String)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite263_41(11731, (8754519549494397939L ^ local1_life2)))), ((float)(0x1.c000000000000p+2F)), ((float)((local6_life10 + 0x1.e000000000000p+2F))), ((float)((((com.moon.pc)(this.z)).k - 0x1.5000000000000p+3F))), ((int)(((com.v)(this.x)).e())), ((boolean)(true)));
    ((com.moon.hW)(local9_life23)).b();
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void g() {
((com.moon.pc)(this.z)).a__Void();
    super.g();
    return;
}


private void j() { __sourceHandlerCall_d735f574a5f7670ad90b(this); }


private void lambda$login$0() {
long local1 = (com.moon.ph.C ^ 3694405382412L);
    try {
        ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__Void(((java.lang.String)(((com.moon.pc)(this.z)).a__String())));
    } catch (java.lang.Exception caught3) {
        ((org.tinylog.TaggedLogger)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__TaggedLogger())).error(((java.lang.Object)(__sourceIntrinsic_faa96815412c_invokedynamic3243_7(18111, (6066470090818956646L ^ local1)))));
        ((java.lang.Exception)(caught3)).printStackTrace();
        ((com.moon.mz)(this.y)).a(((boolean)(false)));
        ((com.moon.mz)(this.y)).a(((java.lang.String)(__sourceIntrinsic_faa96815412c_invokedynamic3243_13(21106, (8608442323450378668L ^ local1)))));
        this.B = ((boolean)(false));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_originalDynamicSite263_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_originalDynamicSite263_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_originalDynamicSite263_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite264_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite264_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3239_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral3236_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_faa96815412c_invokedynamic3243_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_faa96815412c_invokedynamic3243_13(int a0, long a1) throws E;
}
