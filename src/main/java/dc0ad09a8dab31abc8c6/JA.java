package moom;


public class JA {

private static moom.JB a;

private static java.util.Random b;

private static long c;

private static java.lang.String[] d;

private static java.lang.String[] e;

private static java.util.Map f;

private static long g;

public JA() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(5250654753063845988L)), ((long)(6596258438630327049L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(37047077683522L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.JA.c ^ 56005996971135L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill589_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill589_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill589_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill589_14 = new byte[8];
    (__sourceSpill589_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill589_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation589_16 = __sourceSpill589_14;
    ((javax.crypto.Cipher)(__sourceSpill589_11)).init(((int)(__sourceSpill589_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill589_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation589_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[8];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "»ú1Hª\001H\013O\f¶úÿj\177ãÖJµL&\025ê&\031ö*ªZ(\177IÃkÝKm\026\b(èzùS(x$\003\fÓâõ\021u¶ò«Sáõ~ó­1Yù- \026:æc´w·-\025MxÖsO\006.\nÃ´I\003\036'ºì'|ö(Ôuhö\000UÑàSÞy\013£3P´·ß&qtË9!\025ô&XßgHl®0ª7µ|\016Àu´ã£k¨àN\032ÀÂ>§Ç´°\035C_nÉN2\004uX­Jñ¸12l,BN\020þ\020\002«ÐíÃîL\"Î°­¿÷©\037"))).length();
    int local10_life24 = 32;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill589_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill589_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill589_29)).doFinal(((byte[])(__sourceSpill589_28)));
        java.lang.String __sourceSpill589_34 = ((java.lang.String)(moom.JA.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill589_35 = local14_life19;
        int __sourceSpill589_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill589_35)[__sourceSpill589_36] = __sourceSpill589_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "7eËg×naA\032½6aµ\037x3vØ6J,X\007Ã×Bûk¥Ç± Û\027Î8$\032&ì7%u>öúîÇ%°ôD\000F^4\024;É\030¯CüI÷I\021\0242÷ÁÔÀ º*®À4©\"yÈ+XÅÛl"))).length();
    local10_life24 = 40;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill589_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill589_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill589_42)).doFinal(((byte[])(__sourceSpill589_41)));
        java.lang.String __sourceSpill589_47 = ((java.lang.String)(moom.JA.a(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill589_48 = local14_life19;
        int __sourceSpill589_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill589_48)[__sourceSpill589_49] = __sourceSpill589_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    d = ((java.lang.String[])(local14_life19));
    e = ((java.lang.String[])(new java.lang.String[8]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill589_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill589_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill589_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill589_59 = new byte[8];
    (__sourceSpill589_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill589_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation589_61 = __sourceSpill589_59;
    ((javax.crypto.Cipher)(__sourceSpill589_56)).init(((int)(__sourceSpill589_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill589_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation589_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = 2887633291732865038L;
    byte[] __sourceSpill589_65 = new byte[8];
    (__sourceSpill589_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill589_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill589_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill589_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill589_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill589_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill589_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill589_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill589_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill589_66)).doFinal(((byte[])(__sourceSpill589_65)));
    g = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
    a = ((moom.JB)(null));
    b = ((java.util.Random)(new java.util.Random()));
}

private static native <E extends Throwable> int __sourceHandlerCall_311e2c2a839f5e8f1183(int[] a0) throws E;
private static final class __SourceHandler_311e2c2a839f5e8f1183 {

public static int f656(int[] p0) throws Throwable {
    int lexicalValue656_42_0;
    int lexicalValue656_42_1;
    net.minecraft.entity.Entity[] spill656_0;
    int spill656_1;
    int spill656_2;
    long life1_3;
    int life4_6;
    int life5_11;
    int life6_13;
    net.minecraft.entity.Entity[] life3_14;
    int life7_16;
    lexical_join_42: {
    lexical_join_39: {
    life1_3 = (__fieldRead656_0() ^ 50905991582909L);
    life4_6 = __call656_1(p0);
    spill656_0 = __call656_2();
    life5_11 = __call656_4(__fieldRead656_3(), life4_6);
    life6_13 = 0;
    life3_14 = spill656_0;
    life7_16 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_37: {
    lexical_join_36: {
    if (!((life7_16 < (p0).length))) {
        break lexical_join_39;
    }
    life6_13 = (life6_13 + (p0)[life7_16]);
    if (!((life3_14 != null))) {
        break lexical_join_37;
    }
    spill656_1 = life6_13;
    spill656_2 = life5_11;
    if (!((life3_14 != null))) {
        lexicalValue656_42_0 = spill656_1;
        lexicalValue656_42_1 = spill656_2;
        break lexical_join_42;
    }
    if (!((spill656_1 > spill656_2))) {
        break lexical_join_36;
    }
    return life7_16;
    }
    life7_16 += 1;
    }
    if (!((life3_14 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue656_42_0 = (p0).length;
    lexicalValue656_42_1 = 1;
    }
    return (lexicalValue656_42_0 - lexicalValue656_42_1);
}
public static void h656_0(moom.Oo p0) throws Throwable {
    throw __call1065600_0(p0);
}
public static void h656_1(moom.Oo p0) throws Throwable {
    throw __call1065601_0(p0);
}
public static void h656_2(moom.Oo p0) throws Throwable {
    throw __call1065602_0(p0);
}
private static native long __fieldRead656_0() throws Throwable;
private static native int __call656_1(int[] a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call656_2() throws Throwable;
private static native java.util.Random __fieldRead656_3() throws Throwable;
private static native int __call656_4(java.util.Random a0, int a1) throws Throwable;
private static native java.lang.Exception __call1065600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065602_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.Properties[] __sourceHandlerCall_dae0844a5f7fcf8d3159(java.lang.String[] a0) throws E;
private static final class __SourceHandler_dae0844a5f7fcf8d3159 {

public static java.util.Properties[] f686(java.lang.String[] p0) throws Throwable {
    net.minecraft.entity.Entity[] spill686_0;
    long life1_3;
    java.util.Properties[] life4_8;
    net.minecraft.entity.Entity[] life3_9;
    int life5_11;
    java.lang.String life6_19;
    moom.DD life7_53;
    java.io.InputStream life8_56;
    moom.OH life9_62;
    forest_join_83: {
    life1_3 = (__fieldRead686_0() ^ 138955961408411L);
    spill686_0 = __call686_1();
    life4_8 = new java.util.Properties[(p0).length];
    life3_9 = spill686_0;
    life5_11 = 0;
    forest_cycle_12: while (true) {
    forest_join_80: {
    forest_join_41: {
    forest_join_32: {
    forest_join_30: {
    if (!((life5_11 < (p0).length))) {
        break forest_join_83;
    }
    life6_19 = (p0)[life5_11];
    if (!((life3_9 != null))) {
        break forest_join_30;
    }
    if (!((life5_11 == 0))) {
        break forest_join_32;
    }
    life6_19 = __invokedynamic686_2(6863, (8807839706024841154L ^ life1_3));
    }
    if (!((life3_9 == null))) {
        break forest_join_41;
    }
    }
    java.lang.String __stackOp686_4_0 = life6_19;
    java.lang.String __stackOp686_4_1 = __invokedynamic686_3(15505, (4505653248437234072L ^ life1_3));
    __call686_6(__invokedynamic686_5(__stackOp686_4_1, __stackOp686_4_0));
    }
    life7_53 = new moom.DD(__invokedynamic686_8(life6_19, __invokedynamic686_7(6888, (8632337673225637862L ^ life1_3))));
    life8_56 = __call686_9(life7_53);
    if (!((life8_56 != null))) {
        break forest_join_80;
    }
    life9_62 = new moom.OH();
    __call686_10(life9_62, life8_56);
    java.lang.String __stackOp686_13_0 = __call686_11(life7_53);
    java.lang.String __stackOp686_13_1 = __invokedynamic686_12(17314, (5520329966710445742L ^ life1_3));
    __call686_15(__invokedynamic686_14(__stackOp686_13_1, __stackOp686_13_0));
    (life4_8)[life5_11] = life9_62;
    __call686_16(life8_56);
    }
    life5_11 += 1;
    if (!((life3_9 == null))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    }
    return life4_8;
}
public static java.util.Properties[] h686_0(java.io.IOException p0) throws Throwable {
    throw __call3068600_0(p0);
}
public static java.util.Properties[] h686_1(java.io.IOException p0) throws Throwable {
    throw __call3068601_0(p0);
}
public static java.util.Properties[] h686_2(java.io.IOException p0, java.lang.String[] p1, long p2, net.minecraft.entity.Entity[] p3, java.util.Properties[] p4, int p5, java.lang.String p6, moom.DD p7, java.io.InputStream p8, moom.OH p9) throws Throwable {
    java.io.IOException life9_2;
    java.lang.String life7_14;
    moom.DD life8_48;
    java.io.InputStream life9_51;
    moom.OH life10_57;
    forest_join_75: {
    life9_2 = p0;
    forest_cycle_2: while (true) {
    forest_join_74: {
    forest_join_35: {
    forest_join_26: {
    forest_join_24: {
    forest_join_6: {
    p5 += 1;
    if (!((p3 == null))) {
        break forest_join_6;
    }
    break forest_join_75;
    }
    if (!((p5 < (p1).length))) {
        break forest_join_75;
    }
    life7_14 = (p1)[p5];
    if (!((p3 != null))) {
        break forest_join_24;
    }
    if (!((p5 == 0))) {
        break forest_join_26;
    }
    life7_14 = __invokedynamic3068602_0(6863, (8807839706024841154L ^ p2));
    }
    if (!((p3 == null))) {
        break forest_join_35;
    }
    }
    java.lang.String __stackOp3068602_2_0 = life7_14;
    java.lang.String __stackOp3068602_2_1 = __invokedynamic3068602_1(15505, (4505653248437234072L ^ p2));
    __call3068602_4(__invokedynamic3068602_3(__stackOp3068602_2_1, __stackOp3068602_2_0));
    }
    life8_48 = new moom.DD(__invokedynamic3068602_6(life7_14, __invokedynamic3068602_5(6888, (8632337673225637862L ^ p2))));
    life9_51 = __call3068602_7(life8_48);
    if (!((life9_51 != null))) {
        break forest_join_74;
    }
    life10_57 = new moom.OH();
    __call3068602_8(life10_57, life9_51);
    java.lang.String __stackOp3068602_11_0 = __call3068602_9(life8_48);
    java.lang.String __stackOp3068602_11_1 = __invokedynamic3068602_10(17314, (5520329966710445742L ^ p2));
    __call3068602_13(__invokedynamic3068602_12(__stackOp3068602_11_1, __stackOp3068602_11_0));
    (p4)[p5] = life10_57;
    __call3068602_14(life9_51);
    }
    continue forest_cycle_2;
    }
    }
    return p4;
}
private static native long __fieldRead686_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call686_1() throws Throwable;
private static native java.lang.String __invokedynamic686_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic686_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic686_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call686_6(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic686_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic686_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.io.InputStream __call686_9(moom.DD a0) throws Throwable;
private static native void __call686_10(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native java.lang.String __call686_11(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic686_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic686_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call686_15(java.lang.String a0) throws Throwable;
private static native void __call686_16(java.io.InputStream a0) throws Throwable;
private static native java.lang.Exception __call3068600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3068601_0(java.io.IOException a0) throws Throwable;
private static native java.lang.String __invokedynamic3068602_0(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3068602_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3068602_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3068602_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic3068602_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3068602_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.io.InputStream __call3068602_7(moom.DD a0) throws Throwable;
private static native void __call3068602_8(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native java.lang.String __call3068602_9(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic3068602_10(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3068602_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3068602_13(java.lang.String a0) throws Throwable;
private static native void __call3068602_14(java.io.InputStream a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_fd262f85c7f479c1d3b6(java.util.Properties[] a0) throws E;
private static final class __SourceHandler_fd262f85c7f479c1d3b6 {

public static int[] f657(java.util.Properties[] p0) throws Throwable {
    java.util.Properties lexicalValue657_29_0;
    java.util.Properties lexicalValue657_39_0;
    net.minecraft.entity.Entity[] spill657_0;
    java.util.Properties spill657_1;
    long life1_3;
    int[] life4_8;
    int life5_10;
    net.minecraft.entity.Entity[] life3_11;
    java.util.Properties life6_19;
    java.lang.String life7_58;
    lexical_join_56: {
    life1_3 = (__fieldRead657_0() ^ 6318248079818L);
    spill657_0 = __call657_1();
    life4_8 = new int[(p0).length];
    life5_10 = 0;
    life3_11 = spill657_0;
    lexical_cycle_12: while (true) {
    lexical_join_53: {
    lexical_join_39: {
    lexical_join_38: {
    lexical_join_29: {
    lexical_join_28: {
    if (!((life5_10 < (life4_8).length))) {
        break lexical_join_56;
    }
    life6_19 = (p0)[life5_10];
    spill657_1 = life6_19;
    if (!((life3_11 != null))) {
        lexicalValue657_29_0 = spill657_1;
        break lexical_join_29;
    }
    if (!((spill657_1 == null))) {
        break lexical_join_28;
    }
    life6_19 = (p0)[0];
    }
    lexicalValue657_29_0 = life6_19;
    }
    if (!((life3_11 != null))) {
        lexicalValue657_39_0 = lexicalValue657_29_0;
        break lexical_join_39;
    }
    if (!((lexicalValue657_29_0 == null))) {
        break lexical_join_38;
    }
    (life4_8)[life5_10] = 1;
    if (!((life3_11 == null))) {
        break lexical_join_53;
    }
    }
    lexicalValue657_39_0 = life6_19;
    }
    life7_58 = __call657_3(lexicalValue657_39_0, __invokedynamic657_2(7687, (8997042077395198302L ^ life1_3)), null);
    (life4_8)[life5_10] = __call657_4(life7_58, 1);
    }
    life5_10 += 1;
    if (!((life3_11 == null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life4_8;
}
public static void h657_0(moom.Oo p0) throws Throwable {
    throw __call1065700_0(p0);
}
public static void h657_1(moom.Oo p0) throws Throwable {
    throw __call1065701_0(p0);
}
public static void h657_2(moom.Oo p0) throws Throwable {
    throw __call1065702_0(p0);
}
public static void h657_3(moom.Oo p0) throws Throwable {
    throw __call1065703_0(p0);
}
private static native long __fieldRead657_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call657_1() throws Throwable;
private static native java.lang.String __invokedynamic657_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call657_3(java.util.Properties a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native int __call657_4(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Exception __call1065700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String[] __sourceHandlerCall_07576b4dd7ef6bd48bbd() throws E;
private static final class __SourceHandler_07576b4dd7ef6bd48bbd {

public static java.lang.String[] f70() throws Throwable {
    net.minecraft.entity.Entity[] spill70_0;
    long life0_3;
    java.util.ArrayList life3_8;
    net.minecraft.entity.Entity[] life2_17;
    int life4_19;
    java.lang.String life5_32;
    java.lang.String life6_40;
    moom.DD life7_45;
    lexical_join_58: {
    life0_3 = (__fieldRead70_0() ^ 56434661713963L);
    spill70_0 = __call70_1();
    life3_8 = new java.util.ArrayList();
    __call70_3(life3_8, __invokedynamic70_2(12831, (2290369201137439909L ^ life0_3)));
    life2_17 = spill70_0;
    life4_19 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_56: {
    lexical_join_55: {
    if (!((life4_19 < ((int) __fieldRead70_4())))) {
        break lexical_join_58;
    }
    int __stackOp70_6_0 = life4_19;
    java.lang.String __stackOp70_6_1 = __invokedynamic70_5(9038, (3510345089311622645L ^ life0_3));
    life5_32 = __invokedynamic70_7(__stackOp70_6_1, __stackOp70_6_0);
    life6_40 = __invokedynamic70_9(life5_32, __invokedynamic70_8(32524, (4193472057285843379L ^ life0_3)));
    life7_45 = new moom.DD(life6_40);
    if (!((life2_17 != null))) {
        break lexical_join_56;
    }
    if (!(__call70_10(life7_45))) {
        break lexical_join_55;
    }
    __call70_11(life3_8, life5_32);
    }
    life4_19 += 1;
    }
    if (!((life2_17 == null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return __cast70_13(__call70_12(life3_8, new java.lang.String[0]));
}
public static void h70_0(moom.Oo p0) throws Throwable {
    throw __call1007000_0(p0);
}
public static void h70_1(moom.Oo p0) throws Throwable {
    throw __call1007001_0(p0);
}
private static native long __fieldRead70_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call70_1() throws Throwable;
private static native java.lang.String __invokedynamic70_2(int a0, long a1) throws Throwable;
private static native boolean __call70_3(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native long __fieldRead70_4() throws Throwable;
private static native java.lang.String __invokedynamic70_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic70_7(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic70_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic70_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call70_10(moom.DD a0) throws Throwable;
private static native boolean __call70_11(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object[] __call70_12(java.util.ArrayList a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast70_13(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Exception __call1007000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4447014f8cf94030a0d8() throws E;
private static final class __SourceHandler_4447014f8cf94030a0d8 {

public static void f35() throws Throwable {
    java.lang.String[] forestValue35_17_0;
    java.util.Properties forestValue35_42_0;
    net.minecraft.entity.Entity[] spill35_0;
    java.lang.String[] spill35_1;
    java.util.Properties spill35_2;
    long life0_3;
    java.lang.String[] life3_8;
    net.minecraft.entity.Entity[] life2_9;
    java.util.Properties[] life4_22;
    int[] life5_25;
    int life6_28;
    java.lang.String life7_32;
    java.util.Properties life8_36;
    forest_join_53: {
    forest_join_47: {
    forest_join_42: {
    forest_join_41: {
    forest_join_17: {
    life0_3 = (__fieldRead35_0() ^ 89429554582163L);
    __fieldWrite35_1(null);
    spill35_0 = __call35_2();
    life3_8 = __call35_3();
    life2_9 = spill35_0;
    spill35_1 = life3_8;
    if (!((life2_9 != null))) {
        forestValue35_17_0 = spill35_1;
        break forest_join_17;
    }
    if (!(((spill35_1).length > 1))) {
        break forest_join_53;
    }
    forestValue35_17_0 = life3_8;
    }
    life4_22 = __call35_4(forestValue35_17_0);
    life5_25 = __call35_5(life4_22);
    life6_28 = __call35_6(life5_25);
    life7_32 = (life3_8)[life6_28];
    life8_36 = (life4_22)[life6_28];
    spill35_2 = life8_36;
    if (!((life2_9 != null))) {
        forestValue35_42_0 = spill35_2;
        break forest_join_42;
    }
    if (!((spill35_2 == null))) {
        break forest_join_41;
    }
    life8_36 = (life4_22)[0];
    }
    forestValue35_42_0 = life8_36;
    }
    if (!((forestValue35_42_0 == null))) {
        break forest_join_47;
    }
    life8_36 = new moom.OH();
    }
    __fieldWrite35_7(new moom.JB(life7_32, life8_36));
    }
    return;
}
public static void h35_0(moom.Oo p0) throws Throwable {
    throw __call3003500_0(p0);
}
public static void h35_1(moom.Oo p0) throws Throwable {
    throw __call3003501_0(p0);
}
public static void h35_2(moom.Oo p0) throws Throwable {
    throw __call3003502_0(p0);
}
private static native long __fieldRead35_0() throws Throwable;
private static native void __fieldWrite35_1(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call35_2() throws Throwable;
private static native java.lang.String[] __call35_3() throws Throwable;
private static native java.util.Properties[] __call35_4(java.lang.String[] a0) throws Throwable;
private static native int[] __call35_5(java.util.Properties[] a0) throws Throwable;
private static native int __call35_6(int[] a0) throws Throwable;
private static native void __fieldWrite35_7(moom.JB a0) throws Throwable;
private static native java.lang.Exception __call3003500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3003501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3003502_0(moom.Oo a0) throws Throwable;

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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18314);
    if (((moom.JA.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JA.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JA.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JA", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JA.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JA.e)[life5_8] = moom.JA.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JA.e)[life5_8];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
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
        byte[] spill2617_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2617_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2617_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2617_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2617_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2617_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5041_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JA.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static moom.JB a() {
return moom.JA.a;
}


public static void a__Void() { __sourceHandlerCall_4447014f8cf94030a0d8(); }


private static java.lang.String[] a__ArrayString() { return __sourceHandlerCall_07576b4dd7ef6bd48bbd(); }


private static java.util.Properties[] a(java.lang.String[] p0) { return __sourceHandlerCall_dae0844a5f7fcf8d3159(p0); }


private static int[] a(java.util.Properties[] p0) { return __sourceHandlerCall_fd262f85c7f479c1d3b6(p0); }


private static int a(int[] p0) { return __sourceHandlerCall_311e2c2a839f5e8f1183(p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5041_0() throws E;
}
