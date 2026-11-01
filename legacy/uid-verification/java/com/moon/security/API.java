package com.moon.security;


public class API {

public API() {
super();
}


static { __sourceHandlerCall_c3240243c3980aaeff26(); }

private static native <E extends Throwable> void __sourceHandlerCall_c3240243c3980aaeff26() throws E;
private static final class __SourceHandler_c3240243c3980aaeff26 {

public static void f340() throws Throwable {
    javax.crypto.Cipher forestValue340_29_0;
    int forestValue340_29_1;
    javax.crypto.SecretKeyFactory forestValue340_29_2;
    byte[] forestValue340_29_3;
    javax.crypto.Cipher forestValue340_46_0;
    int forestValue340_46_1;
    javax.crypto.SecretKeyFactory forestValue340_46_2;
    byte[] forestValue340_46_3;
    java.lang.String forestValue340_79_0;
    int forestValue340_79_1;
    java.lang.String forestValue340_91_0;
    java.lang.String forestValue340_115_0;
    javax.crypto.Cipher spill340_0;
    int spill340_1;
    javax.crypto.SecretKeyFactory spill340_2;
    byte[] spill340_3;
    byte[] spill340_4;
    java.lang.String spill340_5;
    int spill340_6;
    java.lang.String spill340_7;
    java.lang.String[] spill340_8;
    java.lang.String[] spill340_9;
    java.lang.String spill340_10;
    java.lang.String spill340_11;
    int spill340_12;
    long life9_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    java.lang.String[] life0_59;
    int life6_61;
    java.lang.String life5_64;
    int life7_66;
    int life4_68;
    int life3_70;
    byte[] life8_86;
    com.moon.security.a life11_151;
    forest_join_158: {
    forest_join_146: {
    forest_join_46: {
    life9_9 = (__call340_3(__call340_2(-6768034578231083407L, -8194298023055132536L, __call340_1(__call340_0())), 158389398337818L) ^ 21243200702927L);
    spill340_0 = (life1_13 = __call340_4("DES/CBC/PKCS5Padding"));
    spill340_1 = 2;
    spill340_2 = __call340_5("DES");
    byte[] __stackOp340_6_0 = new byte[8];
    spill340_3 = __stackOp340_6_0;
    (__stackOp340_6_0)[0] = ((byte) ((int) (life9_9 >>> 56)));
    life2_28 = 1;
    forestValue340_29_0 = spill340_0;
    forestValue340_29_1 = spill340_1;
    forestValue340_29_2 = spill340_2;
    forestValue340_29_3 = spill340_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue340_46_0 = forestValue340_29_0;
        forestValue340_46_1 = forestValue340_29_1;
        forestValue340_46_2 = forestValue340_29_2;
        forestValue340_46_3 = forestValue340_29_3;
        break forest_join_46;
    }
    byte[] __stackOp340_7_0 = forestValue340_29_3;
    spill340_4 = __stackOp340_7_0;
    (__stackOp340_7_0)[life2_28] = ((byte) ((int) ((life9_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue340_29_3 = spill340_4;
    continue forest_cycle_29;
    }
    }
    __call340_9(forestValue340_46_0, forestValue340_46_1, __call340_8(forestValue340_46_2, new javax.crypto.spec.DESKeySpec(forestValue340_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    life0_59 = new java.lang.String[4];
    life6_61 = 0;
    life7_66 = __call340_10((life5_64 = "\013;\177`|Ù·\033\000\013jBfw¶«\002\022ë\034eÉÉ\\\b*g]\000DçW Ú¼y¯OkKâÒÎ4W)`éÆ\007V\021Í9ÿå­>¶@\000ÔxUª\031\b\022( ¼o\bºùírÍØZ"));
    life4_68 = 80;
    life3_70 = -1;
    forest_cycle_71: while (true) {
    forest_join_141: {
    life3_70 += 1;
    spill340_5 = life5_64;
    int __stackOp340_11_0 = life3_70;
    forestValue340_79_0 = __call340_12(spill340_5, __stackOp340_11_0, (__stackOp340_11_0 + life4_68));
    forestValue340_79_1 = -1;
    forest_cycle_79: while (true) {
    forest_join_132: {
    forest_join_115: {
    forest_join_105: {
    forest_join_91: {
    java.lang.String __stackOp340_13_0 = forestValue340_79_0;
    int __stackOp340_13_1 = forestValue340_79_1;
    spill340_6 = __stackOp340_13_1;
    byte[] __stackOp340_15_0 = __call340_14(__stackOp340_13_0, "ISO-8859-1");
    javax.crypto.Cipher __stackOp340_15_1 = life1_13;
    life8_86 = __call340_16(__stackOp340_15_1, __stackOp340_15_0);
    int __stackOp340_19_0 = spill340_6;
    java.lang.String __stackOp340_19_1 = __call340_18(__call340_17(life8_86));
    spill340_7 = __stackOp340_19_1;
    switch (__stackOp340_19_0) {
default:
{
        forestValue340_91_0 = spill340_7;
        break forest_join_91;
    }
case 0:
{
        forestValue340_115_0 = spill340_7;
        break forest_join_115;
    }
}
    }
    java.lang.String __stackOp340_20_0 = forestValue340_91_0;
    java.lang.String[] __stackOp340_20_1 = life0_59;
    spill340_8 = __stackOp340_20_1;
    java.lang.String __stackOp340_21_0 = __stackOp340_20_0;
    int __stackOp340_21_1 = (life6_61++);
    (spill340_8)[__stackOp340_21_1] = __stackOp340_21_0;
    if (!(((life3_70 = (life3_70 + life4_68)) < life7_66))) {
        break forest_join_105;
    }
    break forest_join_141;
    }
    life7_66 = __call340_22((life5_64 = "ÌÍ\006üÜ'\037ç\025ß·\020t°\006c¸5è¾êÒ£¡Ô\030+"));
    life4_68 = 16;
    life3_70 = -1;
    break forest_join_132;
    }
    java.lang.String __stackOp340_23_0 = forestValue340_115_0;
    java.lang.String[] __stackOp340_23_1 = life0_59;
    spill340_9 = __stackOp340_23_1;
    java.lang.String __stackOp340_24_0 = __stackOp340_23_0;
    int __stackOp340_24_1 = (life6_61++);
    (spill340_9)[__stackOp340_24_1] = __stackOp340_24_0;
    if (!(((life3_70 = (life3_70 + life4_68)) < life7_66))) {
        break forest_join_146;
    }
    life4_68 = __integerCategory340_26(__call340_25(life5_64, life3_70));
    }
    life3_70 += 1;
    spill340_10 = life5_64;
    int __stackOp340_27_0 = life3_70;
    spill340_11 = __call340_28(spill340_10, __stackOp340_27_0, (__stackOp340_27_0 + life4_68));
    spill340_12 = 0;
    forestValue340_79_0 = spill340_11;
    forestValue340_79_1 = spill340_12;
    continue forest_cycle_79;
    }
    }
    life4_68 = __integerCategory340_30(__call340_29(life5_64, life3_70));
    continue forest_cycle_71;
    }
    }
    life11_151 = __call340_32(__call340_31());
    if (!((life11_151 == null))) {
        break forest_join_158;
    }
    throw new java.lang.IllegalStateException((life0_59)[3]);
    }
    java.lang.String __stackOp340_34_0 = __call340_33(life11_151);
    java.lang.String __stackOp340_34_1 = (life0_59)[2];
    __call340_36(__invokedynamic340_35(__stackOp340_34_1, __stackOp340_34_0));
    return;
}
public static void h340_0(java.lang.UnsatisfiedLinkError p0) throws Throwable {
    throw __call3034000_0(p0);
}
public static void h340_1(java.lang.Throwable p0, java.lang.String[] p1, com.moon.security.a p2) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3034001_0(life2_2);
    __call3034001_2(__fieldRead3034001_1(), (p1)[0]);
    throw new com.moon.security.r((p1)[1]);
}
private static native java.lang.invoke.MethodHandles.Lookup __call340_0() throws Throwable;
private static native java.lang.Class __call340_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call340_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call340_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call340_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call340_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call340_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call340_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native int __call340_10(java.lang.String a0) throws Throwable;
private static native java.lang.String __call340_12(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call340_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native byte[] __call340_16(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call340_17(byte[] a0) throws Throwable;
private static native java.lang.String __call340_18(java.lang.String a0) throws Throwable;
private static native int __call340_22(java.lang.String a0) throws Throwable;
private static native char __call340_25(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory340_26(char value) throws Throwable;
private static native java.lang.String __call340_28(java.lang.String a0, int a1, int a2) throws Throwable;
private static native char __call340_29(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory340_30(char value) throws Throwable;
private static native com.moon.security.b __call340_31() throws Throwable;
private static native com.moon.security.a __call340_32(com.moon.security.b a0) throws Throwable;
private static native java.lang.String __call340_33(com.moon.security.a a0) throws Throwable;
private static native java.lang.String __invokedynamic340_35(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call340_36(java.lang.String a0) throws Throwable;
private static native java.lang.UnsatisfiedLinkError __call3034000_0(java.lang.UnsatisfiedLinkError a0) throws Throwable;
private static native void __call3034001_0(java.lang.Throwable a0) throws Throwable;
private static native java.io.PrintStream __fieldRead3034001_1() throws Throwable;
private static native void __call3034001_2(java.io.PrintStream a0, java.lang.String a1) throws Throwable;

}


private static java.lang.UnsatisfiedLinkError a(java.lang.UnsatisfiedLinkError p0) {
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
        byte[] spill1717_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1717_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1717_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1717_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1717_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1717_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static native void initialize(java.lang.String p0);

public static native java.lang.String getHost();

public static native java.lang.String getHWID(boolean p0);

public static native java.lang.String getSparkyDisabler();
}
