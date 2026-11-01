package com.moon;


class kJ {

static int[] a;

static { __sourceHandlerCall_36defe6b55fefba76048(); }

private static native <E extends Throwable> void __sourceHandlerCall_36defe6b55fefba76048() throws E;
private static final class __SourceHandler_36defe6b55fefba76048 {

public static void f30() throws Throwable {
    javax.crypto.Cipher forestValue30_29_0;
    int forestValue30_29_1;
    javax.crypto.SecretKeyFactory forestValue30_29_2;
    byte[] forestValue30_29_3;
    javax.crypto.Cipher forestValue30_46_0;
    int forestValue30_46_1;
    javax.crypto.SecretKeyFactory forestValue30_46_2;
    byte[] forestValue30_46_3;
    javax.crypto.Cipher spill30_0;
    int spill30_1;
    javax.crypto.SecretKeyFactory spill30_2;
    byte[] spill30_3;
    byte[] spill30_4;
    int spill30_5;
    long spill30_6;
    byte[] spill30_7;
    byte[] spill30_8;
    byte[] spill30_9;
    byte[] spill30_10;
    byte[] spill30_11;
    byte[] spill30_12;
    byte[] spill30_13;
    byte[] spill30_14;
    long spill30_15;
    int spill30_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call30_3(__call30_2(-1604669237475750543L, 7066495663000110452L, __call30_1(__call30_0())), 221821892625802L) ^ 51764866966383L);
    spill30_0 = (life1_13 = __call30_4("DES/CBC/NoPadding"));
    spill30_1 = 2;
    spill30_2 = __call30_5("DES");
    byte[] __stackOp30_6_0 = new byte[8];
    spill30_3 = __stackOp30_6_0;
    (__stackOp30_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue30_29_0 = spill30_0;
    forestValue30_29_1 = spill30_1;
    forestValue30_29_2 = spill30_2;
    forestValue30_29_3 = spill30_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue30_46_0 = forestValue30_29_0;
        forestValue30_46_1 = forestValue30_29_1;
        forestValue30_46_2 = forestValue30_29_2;
        forestValue30_46_3 = forestValue30_29_3;
        break forest_join_46;
    }
    byte[] __stackOp30_7_0 = forestValue30_29_3;
    spill30_4 = __stackOp30_7_0;
    (__stackOp30_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue30_29_3 = spill30_4;
    continue forest_cycle_29;
    }
    }
    __call30_9(forestValue30_46_0, forestValue30_46_1, __call30_8(forestValue30_46_2, new javax.crypto.spec.DESKeySpec(forestValue30_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp30_10_0 = 6063303024387508991L;
    int __stackOp30_10_1 = -1;
    spill30_5 = __stackOp30_10_1;
    spill30_6 = __stackOp30_10_0;
    __discardScalar30_11(__stackOp30_10_1);
    life3_62 = spill30_6;
    byte[] __stackOp30_12_0 = new byte[8];
    spill30_7 = __stackOp30_12_0;
    (__stackOp30_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp30_13_0 = spill30_7;
    spill30_8 = __stackOp30_13_0;
    (__stackOp30_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp30_14_0 = spill30_8;
    spill30_9 = __stackOp30_14_0;
    (__stackOp30_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp30_15_0 = spill30_9;
    spill30_10 = __stackOp30_15_0;
    (__stackOp30_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp30_16_0 = spill30_10;
    spill30_11 = __stackOp30_16_0;
    (__stackOp30_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp30_17_0 = spill30_11;
    spill30_12 = __stackOp30_17_0;
    (__stackOp30_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp30_18_0 = spill30_12;
    spill30_13 = __stackOp30_18_0;
    (__stackOp30_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp30_19_0 = spill30_13;
    spill30_14 = __stackOp30_19_0;
    (__stackOp30_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp30_20_0 = spill30_14;
    javax.crypto.Cipher __stackOp30_20_1 = life1_13;
    life5_130 = __call30_21(__stackOp30_20_1, __stackOp30_20_0);
    int __stackOp30_22_0 = spill30_5;
    long __stackOp30_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill30_15 = __stackOp30_22_1;
    spill30_16 = __stackOp30_22_0;
    __discardWide30_23(__stackOp30_22_1);
    __discardScalar30_24(spill30_16);
    life0_204 = spill30_15;
    __fieldWrite30_26(new int[(__call30_25()).length]);
    (__fieldRead30_27())[__call30_29(__fieldRead30_28())] = 1;
    (__fieldRead30_30())[__call30_32(__fieldRead30_31())] = 2;
    (__fieldRead30_33())[__call30_35(__fieldRead30_34())] = 3;
    (__fieldRead30_36())[__call30_38(__fieldRead30_37())] = 4;
    (__fieldRead30_39())[__call30_41(__fieldRead30_40())] = 5;
    (__fieldRead30_42())[__call30_44(__fieldRead30_43())] = ((int) life0_204);
    return;
}
public static void h30_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3003000_0())[__call3003000_2(__fieldRead3003000_1())] = 2;
    (__fieldRead3003000_3())[__call3003000_5(__fieldRead3003000_4())] = 3;
    (__fieldRead3003000_6())[__call3003000_8(__fieldRead3003000_7())] = 4;
    (__fieldRead3003000_9())[__call3003000_11(__fieldRead3003000_10())] = 5;
    (__fieldRead3003000_12())[__call3003000_14(__fieldRead3003000_13())] = ((int) p1);
    return;
}
public static void h30_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3003001_0())[__call3003001_2(__fieldRead3003001_1())] = 3;
    (__fieldRead3003001_3())[__call3003001_5(__fieldRead3003001_4())] = 4;
    (__fieldRead3003001_6())[__call3003001_8(__fieldRead3003001_7())] = 5;
    (__fieldRead3003001_9())[__call3003001_11(__fieldRead3003001_10())] = ((int) p1);
    return;
}
public static void h30_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3003002_0())[__call3003002_2(__fieldRead3003002_1())] = 4;
    (__fieldRead3003002_3())[__call3003002_5(__fieldRead3003002_4())] = 5;
    (__fieldRead3003002_6())[__call3003002_8(__fieldRead3003002_7())] = ((int) p1);
    return;
}
public static void h30_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3003003_0())[__call3003003_2(__fieldRead3003003_1())] = 5;
    (__fieldRead3003003_3())[__call3003003_5(__fieldRead3003003_4())] = ((int) p1);
    return;
}
public static void h30_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3003004_0())[__call3003004_2(__fieldRead3003004_1())] = ((int) p1);
    return;
}
public static void h30_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call30_0() throws Throwable;
private static native java.lang.Class __call30_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call30_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call30_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call30_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call30_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call30_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call30_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar30_11(int a0) throws Throwable;
private static native byte[] __call30_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide30_23(long a0) throws Throwable;
private static native void __discardScalar30_24(int a0) throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType[] __call30_25() throws Throwable;
private static native void __fieldWrite30_26(int[] a0) throws Throwable;
private static native int[] __fieldRead30_27() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead30_28() throws Throwable;
private static native int __call30_29(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead30_30() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead30_31() throws Throwable;
private static native int __call30_32(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead30_33() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead30_34() throws Throwable;
private static native int __call30_35(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead30_36() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead30_37() throws Throwable;
private static native int __call30_38(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead30_39() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead30_40() throws Throwable;
private static native int __call30_41(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead30_42() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead30_43() throws Throwable;
private static native int __call30_44(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003000_0() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003000_1() throws Throwable;
private static native int __call3003000_2(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003000_3() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003000_4() throws Throwable;
private static native int __call3003000_5(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003000_6() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003000_7() throws Throwable;
private static native int __call3003000_8(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003000_9() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003000_10() throws Throwable;
private static native int __call3003000_11(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003000_12() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003000_13() throws Throwable;
private static native int __call3003000_14(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003001_0() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003001_1() throws Throwable;
private static native int __call3003001_2(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003001_3() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003001_4() throws Throwable;
private static native int __call3003001_5(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003001_6() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003001_7() throws Throwable;
private static native int __call3003001_8(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003001_9() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003001_10() throws Throwable;
private static native int __call3003001_11(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003002_0() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003002_1() throws Throwable;
private static native int __call3003002_2(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003002_3() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003002_4() throws Throwable;
private static native int __call3003002_5(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003002_6() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003002_7() throws Throwable;
private static native int __call3003002_8(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003003_0() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003003_1() throws Throwable;
private static native int __call3003003_2(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003003_3() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003003_4() throws Throwable;
private static native int __call3003003_5(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;
private static native int[] __fieldRead3003004_0() throws Throwable;
private static native com.moon.scripting.api.enums.TemplateType __fieldRead3003004_1() throws Throwable;
private static native int __call3003004_2(com.moon.scripting.api.enums.TemplateType a0) throws Throwable;

}

}
