package com.moon.security;


public class o {

public static java.util.Map<java.lang.String, com.moon.security.n> a;

private static java.io.File b;

static boolean c;

private static java.lang.String[] d;

private static long e;

private static java.lang.String[] f;

private static java.lang.String[] g;

private static java.util.Map h;

public o() {
super();
}


static { __sourceHandlerCall_d33b44356c8760357aa2(); }

private static native <E extends Throwable> void __sourceHandlerCall_d33b44356c8760357aa2() throws E;
private static final class __SourceHandler_d33b44356c8760357aa2 {

public static void f351() throws Throwable {
    javax.crypto.Cipher forestValue351_38_0;
    int forestValue351_38_1;
    javax.crypto.SecretKeyFactory forestValue351_38_2;
    byte[] forestValue351_38_3;
    javax.crypto.Cipher forestValue351_55_0;
    int forestValue351_55_1;
    javax.crypto.SecretKeyFactory forestValue351_55_2;
    byte[] forestValue351_55_3;
    java.lang.String forestValue351_88_0;
    int forestValue351_88_1;
    java.lang.String forestValue351_100_0;
    java.lang.String forestValue351_124_0;
    int forestValue351_166_0;
    java.lang.Object spill351_0;
    javax.crypto.Cipher spill351_1;
    int spill351_2;
    javax.crypto.SecretKeyFactory spill351_3;
    byte[] spill351_4;
    byte[] spill351_5;
    java.lang.String spill351_6;
    int spill351_7;
    java.lang.String spill351_8;
    java.lang.String[] spill351_9;
    java.lang.String[] spill351_10;
    java.lang.String spill351_11;
    java.lang.String spill351_12;
    int spill351_13;
    long life0_17;
    javax.crypto.Cipher life2_22;
    int life3_37;
    java.lang.String[] life9_68;
    int life7_70;
    java.lang.String life6_73;
    int life8_75;
    int life5_77;
    int life4_79;
    byte[] life10_95;
    forest_join_166: {
    forest_join_165: {
    forest_join_155: {
    forest_join_55: {
    __fieldWrite351_4(__call351_3(__call351_2(2913643074147282981L, -1005600674680582639L, __call351_1(__call351_0())), 153948490448442L));
    __fieldWrite351_5(new java.util.HashMap(13));
    spill351_0 = null;
    life0_17 = (__fieldRead351_6() ^ 32576325531128L);
    __call351_7(spill351_0);
    spill351_1 = (life2_22 = __call351_8("DES/CBC/PKCS5Padding"));
    spill351_2 = 2;
    spill351_3 = __call351_9("DES");
    byte[] __stackOp351_10_0 = new byte[8];
    spill351_4 = __stackOp351_10_0;
    (__stackOp351_10_0)[0] = ((byte) ((int) (life0_17 >>> 56)));
    life3_37 = 1;
    forestValue351_38_0 = spill351_1;
    forestValue351_38_1 = spill351_2;
    forestValue351_38_2 = spill351_3;
    forestValue351_38_3 = spill351_4;
    forest_cycle_38: while (true) {
    if (!((life3_37 < 8))) {
        forestValue351_55_0 = forestValue351_38_0;
        forestValue351_55_1 = forestValue351_38_1;
        forestValue351_55_2 = forestValue351_38_2;
        forestValue351_55_3 = forestValue351_38_3;
        break forest_join_55;
    }
    byte[] __stackOp351_11_0 = forestValue351_38_3;
    spill351_5 = __stackOp351_11_0;
    (__stackOp351_11_0)[life3_37] = ((byte) ((int) ((life0_17 << (life3_37 * 8)) >>> 56)));
    life3_37 += 1;
    forestValue351_38_3 = spill351_5;
    continue forest_cycle_38;
    }
    }
    __call351_13(forestValue351_55_0, forestValue351_55_1, __call351_12(forestValue351_55_2, new javax.crypto.spec.DESKeySpec(forestValue351_55_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    life9_68 = new java.lang.String[5];
    life7_70 = 0;
    life8_75 = __call351_14((life6_73 = "ÏDR yA¡U±æõ!q`Ä\007µÕØ\020</¡\004k/\025JK_ ûM\003vÖ)G4éïu-ã¼±§\fV½{Ö\177µ|¬TXüí"));
    life5_77 = 24;
    life4_79 = -1;
    forest_cycle_80: while (true) {
    forest_join_150: {
    life4_79 += 1;
    spill351_6 = life6_73;
    int __stackOp351_15_0 = life4_79;
    forestValue351_88_0 = __call351_16(spill351_6, __stackOp351_15_0, (__stackOp351_15_0 + life5_77));
    forestValue351_88_1 = -1;
    forest_cycle_88: while (true) {
    forest_join_141: {
    forest_join_124: {
    forest_join_114: {
    forest_join_100: {
    java.lang.String __stackOp351_17_0 = forestValue351_88_0;
    int __stackOp351_17_1 = forestValue351_88_1;
    spill351_7 = __stackOp351_17_1;
    byte[] __stackOp351_19_0 = __call351_18(__stackOp351_17_0, "ISO-8859-1");
    javax.crypto.Cipher __stackOp351_19_1 = life2_22;
    life10_95 = __call351_20(__stackOp351_19_1, __stackOp351_19_0);
    int __stackOp351_23_0 = spill351_7;
    java.lang.String __stackOp351_23_1 = __call351_22(__call351_21(life10_95));
    spill351_8 = __stackOp351_23_1;
    switch (__stackOp351_23_0) {
default:
{
        forestValue351_100_0 = spill351_8;
        break forest_join_100;
    }
case 0:
{
        forestValue351_124_0 = spill351_8;
        break forest_join_124;
    }
}
    }
    java.lang.String __stackOp351_24_0 = forestValue351_100_0;
    java.lang.String[] __stackOp351_24_1 = life9_68;
    spill351_9 = __stackOp351_24_1;
    java.lang.String __stackOp351_25_0 = __stackOp351_24_0;
    int __stackOp351_25_1 = (life7_70++);
    (spill351_9)[__stackOp351_25_1] = __stackOp351_25_0;
    if (!(((life4_79 = (life4_79 + life5_77)) < life8_75))) {
        break forest_join_114;
    }
    break forest_join_150;
    }
    life8_75 = __call351_26((life6_73 = "+ªë\022S5Ð'·0{a©X\027\035'àQðÿXKEL¸9ÛÚ\022ã%=\031|qÍØ±PÙÆ°|\020üÏB9]¥ÇÁ?\002éó{H"));
    life5_77 = 48;
    life4_79 = -1;
    break forest_join_141;
    }
    java.lang.String __stackOp351_27_0 = forestValue351_124_0;
    java.lang.String[] __stackOp351_27_1 = life9_68;
    spill351_10 = __stackOp351_27_1;
    java.lang.String __stackOp351_28_0 = __stackOp351_27_0;
    int __stackOp351_28_1 = (life7_70++);
    (spill351_10)[__stackOp351_28_1] = __stackOp351_28_0;
    if (!(((life4_79 = (life4_79 + life5_77)) < life8_75))) {
        break forest_join_155;
    }
    life5_77 = __integerCategory351_30(__call351_29(life6_73, life4_79));
    }
    life4_79 += 1;
    spill351_11 = life6_73;
    int __stackOp351_31_0 = life4_79;
    spill351_12 = __call351_32(spill351_11, __stackOp351_31_0, (__stackOp351_31_0 + life5_77));
    spill351_13 = 0;
    forestValue351_88_0 = spill351_12;
    forestValue351_88_1 = spill351_13;
    continue forest_cycle_88;
    }
    }
    life5_77 = __integerCategory351_34(__call351_33(life6_73, life4_79));
    continue forest_cycle_80;
    }
    }
    __fieldWrite351_35(life9_68);
    __fieldWrite351_36(new java.lang.String[5]);
    if (!((!__call351_38(__classLiteral351_37())))) {
        break forest_join_165;
    }
    forestValue351_166_0 = 1;
    break forest_join_166;
    }
    forestValue351_166_0 = 0;
    }
    __fieldWrite351_39(forestValue351_166_0);
    __fieldWrite351_40(new java.util.HashMap());
    return;
}
public static void h351_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call3035100_0(p0);
}
private static native java.lang.invoke.MethodHandles.Lookup __call351_0() throws Throwable;
private static native java.lang.Class __call351_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call351_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call351_3(moom._a a0, long a1) throws Throwable;
private static native void __fieldWrite351_4(long a0) throws Throwable;
private static native void __fieldWrite351_5(java.util.HashMap a0) throws Throwable;
private static native long __fieldRead351_6() throws Throwable;
private static native void __call351_7(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call351_8(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call351_9(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call351_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call351_13(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native int __call351_14(java.lang.String a0) throws Throwable;
private static native java.lang.String __call351_16(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call351_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native byte[] __call351_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call351_21(byte[] a0) throws Throwable;
private static native java.lang.String __call351_22(java.lang.String a0) throws Throwable;
private static native int __call351_26(java.lang.String a0) throws Throwable;
private static native char __call351_29(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory351_30(char value) throws Throwable;
private static native java.lang.String __call351_32(java.lang.String a0, int a1, int a2) throws Throwable;
private static native char __call351_33(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory351_34(char value) throws Throwable;
private static native void __fieldWrite351_35(java.lang.String[] a0) throws Throwable;
private static native void __fieldWrite351_36(java.lang.String[] a0) throws Throwable;
private static native java.lang.Class __classLiteral351_37() throws Throwable;
private static native boolean __call351_38(java.lang.Class a0) throws Throwable;
private static native void __fieldWrite351_39(int a0) throws Throwable;
private static native void __fieldWrite351_40(java.util.HashMap a0) throws Throwable;
private static native java.lang.Throwable __call3035100_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_18c44ba81e8da1ec1c7e() throws E;
private static final class __SourceHandler_18c44ba81e8da1ec1c7e {

public static boolean f84() throws Throwable {
    long life0_3;
    life0_3 = (__fieldRead84_0() ^ 27228520364976L);
    return __call84_4(__call84_2(__call84_1()), __invokedynamic84_3(6934, (9099881843036194118L ^ life0_3)));
}
public static boolean h84_0(java.lang.RuntimeException p0) throws Throwable {
    java.lang.RuntimeException local1 = p0;
    return false;
}
private static native long __fieldRead84_0() throws Throwable;
private static native java.nio.file.FileSystem __call84_1() throws Throwable;
private static native java.util.Set __call84_2(java.nio.file.FileSystem a0) throws Throwable;
private static native java.lang.String __invokedynamic84_3(int a0, long a1) throws Throwable;
private static native boolean __call84_4(java.util.Set a0, java.lang.String a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9390bfd0ca72c948899d(java.lang.String a0) throws E;
private static final class __SourceHandler_9390bfd0ca72c948899d {

public static void f201(java.lang.String p0) throws Throwable {
    java.lang.String forestValue201_20_0;
    java.io.InputStream spill201_0;
    java.nio.file.Path spill201_1;
    java.nio.file.CopyOption[] spill201_2;
    long life1_3;
    java.lang.String[] life3_7;
    java.lang.String life4_20;
    java.io.File life5_47;
    java.io.InputStream life6_51;
    com.moon.security.n life6_78;
    forest_join_91: {
    forest_join_89: {
    forest_join_65: {
    forest_join_40: {
    forest_join_32: {
    forest_join_20: {
    forest_join_19: {
    life1_3 = (__fieldRead201_0() ^ 119746487771879L);
    life3_7 = __call201_1(p0, "/");
    if (!(((life3_7).length > 1))) {
        break forest_join_19;
    }
    forestValue201_20_0 = (life3_7)[((life3_7).length - 1)];
    break forest_join_20;
    }
    forestValue201_20_0 = null;
    }
    life4_20 = forestValue201_20_0;
    if (!((__fieldRead201_2() == null))) {
        break forest_join_32;
    }
    __fieldWrite201_5(__call201_4(__invokedynamic201_3(13728, (1355265295398367905L ^ life1_3))));
    __call201_7(__fieldRead201_6());
    }
    if (!((!__fieldRead201_8()))) {
        break forest_join_40;
    }
    if (!((life4_20 == null))) {
        break forest_join_40;
    }
    throw new java.lang.AssertionError();
    }
    life5_47 = new java.io.File(__fieldRead201_9(), life4_20);
    life6_51 = __call201_11(__classLiteral201_10(), p0);
    spill201_0 = life6_51;
    spill201_1 = __call201_12(life5_47);
    java.nio.file.CopyOption[] __stackOp201_13_0 = new java.nio.file.CopyOption[1];
    spill201_2 = __stackOp201_13_0;
    (__stackOp201_13_0)[0] = __fieldRead201_14();
    __call201_15(spill201_0, spill201_1, spill201_2);
    if (!((life6_51 != null))) {
        break forest_join_65;
    }
    __call201_16(life6_51);
    }
    life6_78 = new com.moon.security.n(__call201_18(__call201_17(life5_47)), __call201_20(__call201_19(life5_47)));
    __call201_22(__fieldRead201_21(), p0, life6_78);
    __call201_24(__call201_23(life5_47));
    if (!(__call201_25())) {
        break forest_join_89;
    }
    __call201_26(life5_47);
    break forest_join_91;
    }
    __call201_27(life5_47);
    }
    return;
}
public static void h201_0(java.lang.Throwable p0) throws Throwable {
    throw __call3020100_0(p0);
}
public static void h201_1(java.lang.Throwable p0) throws Throwable {
    throw __call3020101_0(p0);
}
public static void h201_2(java.lang.Throwable p0) throws Throwable {
    throw __call3020102_0(p0);
}
public static void h201_3(java.lang.Throwable p0) throws Throwable {
    throw __call3020103_0(p0);
}
public static void h201_4(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    forest_join_6: {
    life2_2 = p0;
    if (!((p1 != null))) {
        break forest_join_6;
    }
    __call3020104_0(p1);
    }
    throw life2_2;
}
public static void h201_5(java.lang.Throwable p0, java.lang.Throwable p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3020105_0(p1, life2_2);
    throw p1;
}
public static void h201_6(java.io.IOException p0, java.io.File p1) throws Throwable {
    java.io.IOException life2_2;
    life2_2 = p0;
    __call3020106_0(p1);
    throw life2_2;
}
public static void h201_7(java.lang.NullPointerException p0, java.lang.String p1, long p2, java.io.File p3) throws Throwable {
    java.lang.NullPointerException life5_2;
    life5_2 = p0;
    __call3020107_0(p3);
    java.lang.Object __inlineStack3020107_2Token;
    throw new java.io.FileNotFoundException(__invokedynamic3020107_4(__inlineStack3020107_2Output0((__inlineStack3020107_2Token = __inlineStack3020107_2Pack(p1, __invokedynamic3020107_1(10664, (6524001408879816362L ^ p2))))), __inlineStack3020107_2Output1(__inlineStack3020107_2Token), __invokedynamic3020107_3(14013, (6302241416683647421L ^ p2))));
}
public static void h201_8(java.lang.Throwable p0, java.io.File p1) throws Throwable {
    java.lang.Throwable life2_2;
    forest_join_10: {
    forest_join_8: {
    life2_2 = p0;
    if (!(__call3020108_0())) {
        break forest_join_8;
    }
    __call3020108_1(p1);
    break forest_join_10;
    }
    __call3020108_2(p1);
    }
    throw life2_2;
}
public static void h201_9(java.lang.Throwable p0) throws Throwable {
    throw __call3020109_0(p0);
}
private static native long __fieldRead201_0() throws Throwable;
private static native java.lang.String[] __call201_1(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.io.File __fieldRead201_2() throws Throwable;
private static native java.lang.String __invokedynamic201_3(int a0, long a1) throws Throwable;
private static native java.io.File __call201_4(java.lang.String a0) throws Throwable;
private static native void __fieldWrite201_5(java.io.File a0) throws Throwable;
private static native java.io.File __fieldRead201_6() throws Throwable;
private static native void __call201_7(java.io.File a0) throws Throwable;
private static native boolean __fieldRead201_8() throws Throwable;
private static native java.io.File __fieldRead201_9() throws Throwable;
private static native java.lang.Class __classLiteral201_10() throws Throwable;
private static native java.io.InputStream __call201_11(java.lang.Class a0, java.lang.String a1) throws Throwable;
private static native java.nio.file.Path __call201_12(java.io.File a0) throws Throwable;
private static native java.nio.file.StandardCopyOption __fieldRead201_14() throws Throwable;
private static native long __call201_15(java.io.InputStream a0, java.nio.file.Path a1, java.nio.file.CopyOption[] a2) throws Throwable;
private static native void __call201_16(java.io.InputStream a0) throws Throwable;
private static native java.nio.file.Path __call201_17(java.io.File a0) throws Throwable;
private static native long __call201_18(java.nio.file.Path a0) throws Throwable;
private static native java.nio.file.Path __call201_19(java.io.File a0) throws Throwable;
private static native java.lang.String __call201_20(java.nio.file.Path a0) throws Throwable;
private static native java.util.Map __fieldRead201_21() throws Throwable;
private static native java.lang.Object __call201_22(java.util.Map a0, java.lang.String a1, com.moon.security.n a2) throws Throwable;
private static native java.lang.String __call201_23(java.io.File a0) throws Throwable;
private static native void __call201_24(java.lang.String a0) throws Throwable;
private static native boolean __call201_25() throws Throwable;
private static native boolean __call201_26(java.io.File a0) throws Throwable;
private static native void __call201_27(java.io.File a0) throws Throwable;
private static native java.lang.Throwable __call3020100_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3020101_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3020102_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3020103_0(java.lang.Throwable a0) throws Throwable;
private static native void __call3020104_0(java.io.InputStream a0) throws Throwable;
private static native void __call3020105_0(java.lang.Throwable a0, java.lang.Throwable a1) throws Throwable;
private static native boolean __call3020106_0(java.io.File a0) throws Throwable;
private static native boolean __call3020107_0(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic3020107_1(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack3020107_2Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack3020107_2Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack3020107_2Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic3020107_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3020107_4(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call3020108_0() throws Throwable;
private static native boolean __call3020108_1(java.io.File a0) throws Throwable;
private static native void __call3020108_2(java.io.File a0) throws Throwable;
private static native java.lang.Throwable __call3020109_0(java.lang.Throwable a0) throws Throwable;

}


public static java.lang.String[] b() {
return com.moon.security.o.d;
}


public static void b(java.lang.String[] p0) {
d = ((java.lang.String[])(p0));
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
        byte[] spill1721_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1721_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1721_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1721_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1721_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1721_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 22132);
    if (((com.moon.security.o.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.security.o.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.security.o.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/security/o", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.security.o.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.security.o.g)[life5_8] = com.moon.security.o.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.security.o.g)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.security.o.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3569_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/security/o"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.io.File a(java.lang.String p0) {
long local1 = (com.moon.security.o.e ^ 135828495284663L);
    java.lang.String local3 = java.lang.System.getProperty(((java.lang.String)(__sourceIntrinsic_ad5e12f6b946_originalDynamicSite1027_1(8649, (4295745710703656346L ^ local1)))));
    java.io.File local4 = new java.io.File(local3, p0);
    ((java.io.File)(local4)).mkdir();
    return local4;
}


private static boolean a() { return __sourceHandlerCall_18c44ba81e8da1ec1c7e(); }


public static void a__Void(java.lang.String p0) throws java.io.IOException { __sourceHandlerCall_9390bfd0ca72c948899d(p0); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad5e12f6b946_originalDynamicSite1027_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3569_0() throws E;
}
