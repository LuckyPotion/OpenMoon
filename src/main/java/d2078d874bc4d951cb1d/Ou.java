package moom;


class Ou extends java.lang.Thread {

moom.n7 a;

private static long b;

private static long c;

Ou(moom.n7 p0, java.lang.String p1) { super((java.lang.String)null); }

private static void __sourceConstructorBody_9936a3ac3681474b(moom.Ou receiver, moom.n7 p0, java.lang.String p1) throws Throwable {
((moom.Ou)(receiver)).a = ((moom.n7)(p0));
    moom.Ou.__sourceConstructorInit_9936a3ac3681474b_0(((moom.Ou)(receiver)), ((java.lang.String)(p1)));
    return;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(8022491027200815462L)), ((long)(-1503121625254994760L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(153848335538078L)))));
    long local0_life6 = (moom.Ou.b ^ 122438088527124L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill753_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill753_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill753_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill753_13 = new byte[8];
    (__sourceSpill753_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill753_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation753_15 = __sourceSpill753_13;
    ((javax.crypto.Cipher)(__sourceSpill753_10)).init(((int)(__sourceSpill753_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill753_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation753_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1999900388524995034L;
    byte[] __sourceSpill753_19 = new byte[8];
    (__sourceSpill753_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill753_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill753_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill753_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill753_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill753_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill753_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill753_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill753_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill753_20)).doFinal(((byte[])(__sourceSpill753_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_9936a3ac3681474b_0(moom.Ou a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_ca957a071cb2681df30a(moom.Ou a0) throws E;
private static final class __SourceHandler_ca957a071cb2681df30a {

public static void f384(moom.Ou receiver) throws Throwable {
    org.apache.logging.log4j.Logger spill384_0;
    java.lang.String spill384_1;
    java.lang.Object[] spill384_2;
    java.lang.Object[] spill384_3;
    long life1_3;
    java.lang.Object life3_5;
    java.net.HttpURLConnection life3_41;
    java.awt.image.BufferedImage life4_89;
    forest_join_113: {
    forest_join_110: {
    forest_join_102: {
    forest_join_92: {
    forest_join_88: {
    forest_join_72: {
    forest_join_68: {
    forest_join_64: {
    forest_join_31: {
    life1_3 = (__fieldRead384_0() ^ 72310623367695L);
    life3_5 = null;
    spill384_0 = __fieldRead384_1();
    spill384_1 = "Downloading http texture from {} to {}";
    java.lang.Object[] __stackOp384_2_0 = new java.lang.Object[2];
    spill384_2 = __stackOp384_2_0;
    (__stackOp384_2_0)[0] = __fieldRead384_4(__fieldRead384_3(receiver));
    java.lang.Object[] __stackOp384_5_0 = spill384_2;
    spill384_3 = __stackOp384_5_0;
    (__stackOp384_5_0)[1] = __fieldRead384_7(__fieldRead384_6(receiver));
    __call384_8(spill384_0, spill384_1, spill384_3);
    if (!(__call384_10(__fieldRead384_9(receiver)))) {
        break forest_join_31;
    }
    __call384_12(__fieldRead384_11(receiver));
    break forest_join_113;
    }
    life3_41 = __cast384_18(__call384_17(new java.net.URL(__fieldRead384_14(__fieldRead384_13(receiver))), __call384_16(__call384_15())));
    __call384_19(life3_41, 1);
    __call384_20(life3_41, 0);
    __call384_21(life3_41);
    if (!(((__call384_22(life3_41) / ((int) __fieldRead384_23())) != 2))) {
        break forest_join_72;
    }
    if (!((__call384_24(life3_41) != null))) {
        break forest_join_64;
    }
    __call384_26(__call384_25(life3_41));
    }
    if (!((life3_41 != null))) {
        break forest_join_68;
    }
    __call384_27(life3_41);
    }
    __call384_29(__fieldRead384_28(receiver));
    return;
    }
    if (!((__fieldRead384_31(__fieldRead384_30(receiver)) != null))) {
        break forest_join_88;
    }
    __call384_35(__call384_32(life3_41), __fieldRead384_34(__fieldRead384_33(receiver)));
    life4_89 = __call384_38(__fieldRead384_37(__fieldRead384_36(receiver)));
    break forest_join_92;
    }
    life4_89 = __call384_40(__call384_39(life3_41));
    }
    if (!((__fieldRead384_42(__fieldRead384_41(receiver)) != null))) {
        break forest_join_102;
    }
    life4_89 = __call384_45(__fieldRead384_44(__fieldRead384_43(receiver)), life4_89);
    }
    __call384_47(__fieldRead384_46(receiver), life4_89);
    if (!((life3_41 != null))) {
        break forest_join_110;
    }
    __call384_48(life3_41);
    }
    __call384_50(__fieldRead384_49(receiver));
    }
    return;
}
public static void h384_0(java.lang.Exception p0) throws Throwable {
    throw __call3038400_0(p0);
}
public static void h384_1(java.lang.Exception p0) throws Throwable {
    throw __call3038401_0(p0);
}
public static void h384_2(java.lang.Exception p0) throws Throwable {
    throw __call3038402_0(p0);
}
public static void h384_3(java.lang.Exception p0) throws Throwable {
    throw __call3038403_0(p0);
}
public static void h384_4(java.lang.Exception p0, moom.Ou p1, java.net.HttpURLConnection p2) throws Throwable {
    java.lang.Exception life3_2;
    forest_join_14: {
    life3_2 = p0;
    __call3038404_5(__fieldRead3038404_0(), __invokedynamic3038404_4(__call3038404_2(__call3038404_1(life3_2)), __call3038404_3(life3_2)));
    if (!((p2 != null))) {
        break forest_join_14;
    }
    __call3038404_6(p2);
    }
    __call3038404_8(__fieldRead3038404_7(p1));
    return;
}
public static void h384_5(java.lang.Throwable p0, moom.Ou p1, java.net.HttpURLConnection p2) throws Throwable {
    java.lang.Throwable life3_2;
    forest_join_6: {
    life3_2 = p0;
    if (!((p2 != null))) {
        break forest_join_6;
    }
    __call3038405_0(p2);
    }
    __call3038405_2(__fieldRead3038405_1(p1));
    throw life3_2;
}
public static void h384_6(java.lang.Exception p0) throws Throwable {
    throw __call3038406_0(p0);
}
private static native long __fieldRead384_0() throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead384_1() throws Throwable;
private static native moom.n7 __fieldRead384_3(moom.Ou a0) throws Throwable;
private static native java.lang.String __fieldRead384_4(moom.n7 a0) throws Throwable;
private static native moom.n7 __fieldRead384_6(moom.Ou a0) throws Throwable;
private static native java.io.File __fieldRead384_7(moom.n7 a0) throws Throwable;
private static native void __call384_8(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native moom.n7 __fieldRead384_9(moom.Ou a0) throws Throwable;
private static native boolean __call384_10(moom.n7 a0) throws Throwable;
private static native moom.n7 __fieldRead384_11(moom.Ou a0) throws Throwable;
private static native void __call384_12(moom.n7 a0) throws Throwable;
private static native moom.n7 __fieldRead384_13(moom.Ou a0) throws Throwable;
private static native java.lang.String __fieldRead384_14(moom.n7 a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call384_15() throws Throwable;
private static native java.net.Proxy __call384_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.net.URLConnection __call384_17(java.net.URL a0, java.net.Proxy a1) throws Throwable;
private static native java.net.HttpURLConnection __cast384_18(java.net.URLConnection a0) throws Throwable;
private static native void __call384_19(java.net.HttpURLConnection a0, int a1) throws Throwable;
private static native void __call384_20(java.net.HttpURLConnection a0, int a1) throws Throwable;
private static native void __call384_21(java.net.HttpURLConnection a0) throws Throwable;
private static native int __call384_22(java.net.HttpURLConnection a0) throws Throwable;
private static native long __fieldRead384_23() throws Throwable;
private static native java.io.InputStream __call384_24(java.net.HttpURLConnection a0) throws Throwable;
private static native java.io.InputStream __call384_25(java.net.HttpURLConnection a0) throws Throwable;
private static native byte[] __call384_26(java.io.InputStream a0) throws Throwable;
private static native void __call384_27(java.net.HttpURLConnection a0) throws Throwable;
private static native moom.n7 __fieldRead384_28(moom.Ou a0) throws Throwable;
private static native void __call384_29(moom.n7 a0) throws Throwable;
private static native moom.n7 __fieldRead384_30(moom.Ou a0) throws Throwable;
private static native java.io.File __fieldRead384_31(moom.n7 a0) throws Throwable;
private static native java.io.InputStream __call384_32(java.net.HttpURLConnection a0) throws Throwable;
private static native moom.n7 __fieldRead384_33(moom.Ou a0) throws Throwable;
private static native java.io.File __fieldRead384_34(moom.n7 a0) throws Throwable;
private static native void __call384_35(java.io.InputStream a0, java.io.File a1) throws Throwable;
private static native moom.n7 __fieldRead384_36(moom.Ou a0) throws Throwable;
private static native java.io.File __fieldRead384_37(moom.n7 a0) throws Throwable;
private static native java.awt.image.BufferedImage __call384_38(java.io.File a0) throws Throwable;
private static native java.io.InputStream __call384_39(java.net.HttpURLConnection a0) throws Throwable;
private static native java.awt.image.BufferedImage __call384_40(java.io.InputStream a0) throws Throwable;
private static native moom.n7 __fieldRead384_41(moom.Ou a0) throws Throwable;
private static native moom.lh __fieldRead384_42(moom.n7 a0) throws Throwable;
private static native moom.n7 __fieldRead384_43(moom.Ou a0) throws Throwable;
private static native moom.lh __fieldRead384_44(moom.n7 a0) throws Throwable;
private static native java.awt.image.BufferedImage __call384_45(moom.lh a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native moom.n7 __fieldRead384_46(moom.Ou a0) throws Throwable;
private static native void __call384_47(moom.n7 a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native void __call384_48(java.net.HttpURLConnection a0) throws Throwable;
private static native moom.n7 __fieldRead384_49(moom.Ou a0) throws Throwable;
private static native void __call384_50(moom.n7 a0) throws Throwable;
private static native java.lang.Exception __call3038400_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3038401_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3038402_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3038403_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3038404_0() throws Throwable;
private static native java.lang.Class __call3038404_1(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call3038404_2(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call3038404_3(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic3038404_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3038404_5(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call3038404_6(java.net.HttpURLConnection a0) throws Throwable;
private static native moom.n7 __fieldRead3038404_7(moom.Ou a0) throws Throwable;
private static native void __call3038404_8(moom.n7 a0) throws Throwable;
private static native void __call3038405_0(java.net.HttpURLConnection a0) throws Throwable;
private static native moom.n7 __fieldRead3038405_1(moom.Ou a0) throws Throwable;
private static native void __call3038405_2(moom.n7 a0) throws Throwable;
private static native java.lang.Exception __call3038406_0(java.lang.Exception a0) throws Throwable;

}


public void run() { __sourceHandlerCall_ca957a071cb2681df30a(this); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}

}
