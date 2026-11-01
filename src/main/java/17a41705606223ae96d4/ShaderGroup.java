package net.minecraft.client.shader;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ShaderGroup {

private net.minecraft.client.shader.Framebuffer a;

private moom.oR b;

private java.lang.String c;

private java.util.List<net.minecraft.client.shader.Shader> d;

private java.util.Map<java.lang.String, net.minecraft.client.shader.Framebuffer> e;

private java.util.List<net.minecraft.client.shader.Framebuffer> f;

private org.lwjgl.util.vector.Matrix4f g;

private int h;

private int i;

private float j;

private float k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

public ShaderGroup(net.minecraft.client.renderer.texture.TextureManager p0, moom.oR p1, net.minecraft.client.shader.Framebuffer p2, moom.DD p3) throws java.io.IOException, com.google.gson.JsonSyntaxException {
super();
    this.d = com.google.common.collect.Lists.newArrayList();
    this.e = com.google.common.collect.Maps.newHashMap();
    this.f = com.google.common.collect.Lists.newArrayList();
    this.b = p1;
    this.a = p2;
    this.j = 0x0.0p+0f;
    this.k = 0x0.0p+0f;
    this.h = p2.c;
    this.i = p2.d;
    this.c = (p3).toString();
    (this).b();
    (this).a(p0, p3);
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(53872078123971276L)), ((long)(8306282091203161556L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(111271748574851L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.shader.ShaderGroup.l ^ 21388803757370L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1836_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1836_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1836_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1836_14 = new byte[8];
    (__sourceSpill1836_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1836_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1836_16 = __sourceSpill1836_14;
    ((javax.crypto.Cipher)(__sourceSpill1836_11)).init(((int)(__sourceSpill1836_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1836_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1836_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "½\001~Úî©èÛZ%7ú:ð× 9$Âç'<Àª|jÍ1\036qi¨ðïíÏ¢í\b\036Ðàsýmº\035\0131ï*Ý×PÌý"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1836_25 = local6_life21;
        int __sourceSpill1836_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1836_25)).substring(((int)(__sourceSpill1836_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1836_30 = local8_life19;
        int __sourceSpill1836_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1836_33 = new byte[8];
        (__sourceSpill1836_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1836_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1836_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1836_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1836_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1836_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1836_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1836_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1836_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1836_34)).doFinal(((byte[])(__sourceSpill1836_33)));
        (__sourceSpill1836_30)[__sourceSpill1836_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "åÅ\bvìdÑZÜãÎ~Àµ'"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1836_38 = local6_life21;
        int __sourceSpill1836_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1836_38)).substring(((int)(__sourceSpill1836_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1836_43 = local8_life19;
        int __sourceSpill1836_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1836_46 = new byte[8];
        (__sourceSpill1836_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1836_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1836_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1836_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1836_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1836_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1836_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1836_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1836_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1836_47)).doFinal(((byte[])(__sourceSpill1836_46)));
        (__sourceSpill1836_43)[__sourceSpill1836_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[10]));
}

private static native <E extends Throwable> void __sourceHandlerCall_ef5d7c18b3e91b3ecada(net.minecraft.client.shader.ShaderGroup a0, float a1) throws E;
private static final class __SourceHandler_ef5d7c18b3e91b3ecada {

public static void f242(net.minecraft.client.shader.ShaderGroup receiver, float p0) throws Throwable {
    java.util.Iterator life2_52;
    net.minecraft.client.shader.Shader life3_59;
    if ((p0 < __fieldRead242_0(receiver))) {
        net.minecraft.client.shader.ShaderGroup __stackOp242_1_0 = receiver;
        __fieldWrite242_4(__stackOp242_1_0, (__fieldRead242_2(__stackOp242_1_0) + (0x1.0p0f - __fieldRead242_3(receiver))));
        net.minecraft.client.shader.ShaderGroup __stackOp242_5_0 = receiver;
        __fieldWrite242_7(__stackOp242_5_0, (__fieldRead242_6(__stackOp242_5_0) + p0));
    } else {
        net.minecraft.client.shader.ShaderGroup __stackOp242_8_0 = receiver;
        __fieldWrite242_11(__stackOp242_8_0, (__fieldRead242_9(__stackOp242_8_0) + (p0 - __fieldRead242_10(receiver))));
    }
    __fieldWrite242_12(receiver, p0);
    loop_region_33: while ((__fieldRead242_13(receiver) > 0x1.4p4f)) {
        net.minecraft.client.shader.ShaderGroup __stackOp242_14_0 = receiver;
        __fieldWrite242_16(__stackOp242_14_0, (__fieldRead242_15(__stackOp242_14_0) - 0x1.4p4f));
    }
    life2_52 = __call242_18(__fieldRead242_17(receiver));
    loop_region_49: while (__call242_19(life2_52)) {
        life3_59 = __cast242_21(__call242_20(life2_52));
        __call242_23(life3_59, (__fieldRead242_22(receiver) / 0x1.4p4f));
    }
    return;
}
public static void h242_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1024200_0(p0);
}
public static void h242_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1024201_0(p0);
}
private static native float __fieldRead242_0(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native float __fieldRead242_2(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native float __fieldRead242_3(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native void __fieldWrite242_4(net.minecraft.client.shader.ShaderGroup a0, float a1) throws Throwable;
private static native float __fieldRead242_6(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native void __fieldWrite242_7(net.minecraft.client.shader.ShaderGroup a0, float a1) throws Throwable;
private static native float __fieldRead242_9(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native float __fieldRead242_10(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native void __fieldWrite242_11(net.minecraft.client.shader.ShaderGroup a0, float a1) throws Throwable;
private static native void __fieldWrite242_12(net.minecraft.client.shader.ShaderGroup a0, float a1) throws Throwable;
private static native float __fieldRead242_13(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native float __fieldRead242_15(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native void __fieldWrite242_16(net.minecraft.client.shader.ShaderGroup a0, float a1) throws Throwable;
private static native java.util.List __fieldRead242_17(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native java.util.Iterator __call242_18(java.util.List a0) throws Throwable;
private static native boolean __call242_19(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call242_20(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.shader.Shader __cast242_21(java.lang.Object a0) throws Throwable;
private static native float __fieldRead242_22(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native void __call242_23(net.minecraft.client.shader.Shader a0, float a1) throws Throwable;
private static native java.lang.Exception __call1024200_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Exception __call1024201_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_66075e83c0ced2d919d4(net.minecraft.client.shader.ShaderGroup a0, com.google.gson.JsonElement a1) throws E;
private static final class __SourceHandler_66075e83c0ced2d919d4 {

public static void f2670(net.minecraft.client.shader.ShaderGroup receiver, com.google.gson.JsonElement p0) throws Throwable {
    com.google.gson.JsonObject life2_17;
    java.lang.String life3_21;
    int life4_27;
    int life5_33;
    if (__call2670_0(p0)) {
        __call2670_4(receiver, __call2670_1(p0), __fieldRead2670_2(receiver), __fieldRead2670_3(receiver));
    } else {
        life2_17 = __call2670_5(p0, "target");
        life3_21 = __call2670_6(life2_17, "name");
        life4_27 = __call2670_8(life2_17, "width", __fieldRead2670_7(receiver));
        life5_33 = __call2670_10(life2_17, "height", __fieldRead2670_9(receiver));
        if (__call2670_12(__fieldRead2670_11(receiver), life3_21)) {
        throw new moom.D(__invokedynamic2670_13(life3_21));
    }
        __call2670_14(receiver, life3_21, life4_27, life5_33);
    }
    return;
}
public static void h2670_0(moom.D p0) throws Throwable {
    throw __call1267000_0(p0);
}
public static void h2670_1(moom.D p0) throws Throwable {
    throw __call1267001_0(p0);
}
private static native boolean __call2670_0(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __call2670_1(com.google.gson.JsonElement a0) throws Throwable;
private static native int __fieldRead2670_2(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native int __fieldRead2670_3(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native void __call2670_4(net.minecraft.client.shader.ShaderGroup a0, java.lang.String a1, int a2, int a3) throws Throwable;
private static native com.google.gson.JsonObject __call2670_5(com.google.gson.JsonElement a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2670_6(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead2670_7(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native int __call2670_8(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native int __fieldRead2670_9(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native int __call2670_10(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.Map __fieldRead2670_11(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native boolean __call2670_12(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic2670_13(java.lang.String a0) throws Throwable;
private static native void __call2670_14(net.minecraft.client.shader.ShaderGroup a0, java.lang.String a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1267000_0(moom.D a0) throws Throwable;
private static native java.lang.Exception __call1267001_0(moom.D a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_428c192a7d5a79a9a682(net.minecraft.client.shader.ShaderGroup a0, java.lang.String a1, int a2, int a3) throws E;
private static final class __SourceHandler_428c192a7d5a79a9a682 {

public static void f2671(net.minecraft.client.shader.ShaderGroup receiver, java.lang.String p0, int p1, int p2) throws Throwable {
    net.minecraft.client.shader.Framebuffer life4_6;
    life4_6 = new net.minecraft.client.shader.Framebuffer(p1, p2, true);
    __call2671_0(life4_6, 0x0.0p0f, 0x0.0p0f, 0x0.0p0f, 0x0.0p0f);
    __call2671_2(__fieldRead2671_1(receiver), p0, life4_6);
    if ((p1 == __fieldRead2671_3(receiver))) {
        if ((p2 == __fieldRead2671_4(receiver))) {
        __call2671_6(__fieldRead2671_5(receiver), life4_6);
    }
    }
    return;
}
public static void h2671_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1267100_0(p0);
}
public static void h2671_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1267101_0(p0);
}
private static native void __call2671_0(net.minecraft.client.shader.Framebuffer a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native java.util.Map __fieldRead2671_1(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native java.lang.Object __call2671_2(java.util.Map a0, java.lang.String a1, net.minecraft.client.shader.Framebuffer a2) throws Throwable;
private static native int __fieldRead2671_3(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native int __fieldRead2671_4(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native java.util.List __fieldRead2671_5(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native boolean __call2671_6(java.util.List a0, net.minecraft.client.shader.Framebuffer a1) throws Throwable;
private static native java.lang.Exception __call1267100_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Exception __call1267101_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_182ce9ed63a514ba89af(net.minecraft.client.shader.ShaderGroup a0, net.minecraft.client.renderer.texture.TextureManager a1, com.google.gson.JsonElement a2) throws E;
private static final class __SourceHandler_182ce9ed63a514ba89af {

public static void f900220(net.minecraft.client.shader.ShaderGroup receiver, net.minecraft.client.renderer.texture.TextureManager p0, com.google.gson.JsonElement p1) throws Throwable {
    long life3_3;
    com.google.gson.JsonObject life5_7;
    java.lang.String life6_11;
    java.lang.String life7_15;
    java.lang.String life8_19;
    net.minecraft.client.shader.Framebuffer life9_23;
    net.minecraft.client.shader.Framebuffer life10_27;
    net.minecraft.client.shader.Shader life11_51;
    com.google.gson.JsonArray life12_56;
    int life13_61;
    java.util.Iterator life14_64;
    com.google.gson.JsonElement life15_73;
    com.google.gson.JsonObject life16_77;
    java.lang.String life17_81;
    java.lang.String life18_85;
    net.minecraft.client.shader.Framebuffer life19_89;
    moom.DD life20_98;
    net.minecraft.client.renderer.texture.ITextureObject life21_111;
    int life22_115;
    int life23_119;
    int life24_123;
    com.google.gson.JsonArray life13_218;
    int life14_223;
    java.util.Iterator life15_226;
    com.google.gson.JsonElement life16_235;
    forest_join_227: {
    forest_join_203: {
    forest_join_44: {
    forest_join_36: {
    life3_3 = (__fieldRead900220_0() ^ 63922680665952L);
    life5_7 = __call900220_1(p1, "pass");
    life6_11 = __call900220_2(life5_7, "name");
    life7_15 = __call900220_3(life5_7, "intarget");
    life8_19 = __call900220_4(life5_7, "outtarget");
    life9_23 = __call900220_5(receiver, life7_15);
    life10_27 = __call900220_6(receiver, life8_19);
    if (!((life9_23 == null))) {
        break forest_join_36;
    }
    throw new moom.D(__invokedynamic900220_7(life7_15));
    }
    if (!((life10_27 == null))) {
        break forest_join_44;
    }
    throw new moom.D(__invokedynamic900220_8(life8_19));
    }
    life11_51 = __call900220_9(receiver, life6_11, life9_23, life10_27);
    life12_56 = __call900220_10(life5_7, "auxtargets", null);
    if (!((life12_56 != null))) {
        break forest_join_203;
    }
    life13_61 = 0;
    life14_64 = __call900220_11(life12_56);
    forest_cycle_62: while (true) {
    forest_join_201: {
    forest_join_193: {
    forest_join_184: {
    forest_join_152: {
    if (!(__call900220_12(life14_64))) {
        break forest_join_203;
    }
    life15_73 = __cast900220_14(__call900220_13(life14_64));
    life16_77 = __call900220_15(life15_73, "auxtarget");
    life17_81 = __call900220_16(life16_77, "name");
    life18_85 = __call900220_17(life16_77, "id");
    life19_89 = __call900220_18(receiver, life18_85);
    if (!((life19_89 == null))) {
        break forest_join_193;
    }
    life20_98 = new moom.DD(__invokedynamic900220_19(life18_85));
    __call900220_21(__fieldRead900220_20(receiver), life20_98);
    __call900220_22(p0, life20_98);
    life21_111 = __call900220_23(p0, life20_98);
    life22_115 = __call900220_24(life16_77, "width");
    life23_119 = __call900220_25(life16_77, "height");
    life24_123 = __integerCategory900220_27(__call900220_26(life16_77, "bilinear"));
    if (!((life24_123 != 0))) {
        break forest_join_152;
    }
    __call900220_31(__invokedynamic900220_28(5247, (6124524446090933018L ^ life3_3)), __invokedynamic900220_29(25986, (235844868958044907L ^ life3_3)), __invokedynamic900220_30(25751, (8664341822579164144L ^ life3_3)));
    __call900220_35(__invokedynamic900220_32(1626, (2866183663198839097L ^ life3_3)), __invokedynamic900220_33(28114, (3693621940049005238L ^ life3_3)), __invokedynamic900220_34(14323, (1465513563293028497L ^ life3_3)));
    break forest_join_184;
    }
    __call900220_39(__invokedynamic900220_36(1626, (2866183663198839097L ^ life3_3)), __invokedynamic900220_37(11131, (8592473453197036571L ^ life3_3)), __invokedynamic900220_38(31509, (2644099325416987763L ^ life3_3)));
    __call900220_43(__invokedynamic900220_40(1626, (2866183663198839097L ^ life3_3)), __invokedynamic900220_41(24380, (3922772417535342676L ^ life3_3)), __invokedynamic900220_42(9255, (6390835343840543558L ^ life3_3)));
    }
    __call900220_46(life11_51, life17_81, __call900220_45(__call900220_44(life21_111)), life22_115, life23_119);
    break forest_join_201;
    }
    __call900220_49(life11_51, life17_81, life19_89, __fieldRead900220_47(life19_89), __fieldRead900220_48(life19_89));
    }
    life13_61 += 1;
    continue forest_cycle_62;
    }
    }
    life13_218 = __call900220_50(life5_7, "uniforms", null);
    if (!((life13_218 != null))) {
        break forest_join_227;
    }
    life14_223 = 0;
    life15_226 = __call900220_51(life13_218);
    forest_cycle_215: while (true) {
    if (!(__call900220_52(life15_226))) {
        break forest_join_227;
    }
    life16_235 = __cast900220_54(__call900220_53(life15_226));
    __call900220_55(receiver, life16_235);
    life14_223 += 1;
    continue forest_cycle_215;
    }
    }
    return;
}
public static void h900220_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call93022000_0(p0);
}
public static void h900220_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call93022001_0(p0);
}
public static void h900220_2(java.io.FileNotFoundException p0, java.lang.String p1) throws Throwable {
    java.io.FileNotFoundException life2_2;
    life2_2 = p0;
    throw new moom.D(__invokedynamic93022002_0(p1));
}
public static void h900220_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call93022003_0(p0);
}
public static void h900220_4(java.lang.Exception p0, int p1) throws Throwable {
    java.lang.Exception life2_2;
    moom.D life3_5;
    life2_2 = p0;
    life3_5 = __call93022004_0(life2_2);
    __call93022004_2(life3_5, __invokedynamic93022004_1(p1));
    throw life3_5;
}
public static void h900220_5(java.lang.Exception p0, int p1) throws Throwable {
    java.lang.Exception life2_2;
    moom.D life3_5;
    life2_2 = p0;
    life3_5 = __call93022005_0(life2_2);
    __call93022005_2(life3_5, __invokedynamic93022005_1(p1));
    throw life3_5;
}
private static native long __fieldRead900220_0() throws Throwable;
private static native com.google.gson.JsonObject __call900220_1(com.google.gson.JsonElement a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call900220_2(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call900220_3(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call900220_4(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __call900220_5(net.minecraft.client.shader.ShaderGroup a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __call900220_6(net.minecraft.client.shader.ShaderGroup a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900220_7(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic900220_8(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.shader.Shader __call900220_9(net.minecraft.client.shader.ShaderGroup a0, java.lang.String a1, net.minecraft.client.shader.Framebuffer a2, net.minecraft.client.shader.Framebuffer a3) throws Throwable;
private static native com.google.gson.JsonArray __call900220_10(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Iterator __call900220_11(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call900220_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call900220_13(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast900220_14(java.lang.Object a0) throws Throwable;
private static native com.google.gson.JsonObject __call900220_15(com.google.gson.JsonElement a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call900220_16(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call900220_17(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __call900220_18(net.minecraft.client.shader.ShaderGroup a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900220_19(java.lang.String a0) throws Throwable;
private static native moom.oR __fieldRead900220_20(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call900220_21(moom.oR a0, moom.DD a1) throws Throwable;
private static native void __call900220_22(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call900220_23(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __call900220_24(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __call900220_25(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native boolean __call900220_26(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory900220_27(boolean value) throws Throwable;
private static native int __invokedynamic900220_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic900220_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic900220_30(int a0, long a1) throws Throwable;
private static native void __call900220_31(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic900220_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic900220_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic900220_34(int a0, long a1) throws Throwable;
private static native void __call900220_35(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic900220_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic900220_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic900220_38(int a0, long a1) throws Throwable;
private static native void __call900220_39(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic900220_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic900220_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic900220_42(int a0, long a1) throws Throwable;
private static native void __call900220_43(int a0, int a1, int a2) throws Throwable;
private static native int __call900220_44(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native java.lang.Integer __call900220_45(int a0) throws Throwable;
private static native void __call900220_46(net.minecraft.client.shader.Shader a0, java.lang.String a1, java.lang.Integer a2, int a3, int a4) throws Throwable;
private static native int __fieldRead900220_47(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead900220_48(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call900220_49(net.minecraft.client.shader.Shader a0, java.lang.String a1, net.minecraft.client.shader.Framebuffer a2, int a3, int a4) throws Throwable;
private static native com.google.gson.JsonArray __call900220_50(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Iterator __call900220_51(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call900220_52(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call900220_53(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast900220_54(java.lang.Object a0) throws Throwable;
private static native void __call900220_55(net.minecraft.client.shader.ShaderGroup a0, com.google.gson.JsonElement a1) throws Throwable;
private static native java.lang.Exception __call93022000_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call93022001_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.String __invokedynamic93022002_0(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call93022003_0(java.io.FileNotFoundException a0) throws Throwable;
private static native moom.D __call93022004_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic93022004_1(int a0) throws Throwable;
private static native void __call93022004_2(moom.D a0, java.lang.String a1) throws Throwable;
private static native moom.D __call93022005_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic93022005_1(int a0) throws Throwable;
private static native void __call93022005_2(moom.D a0, java.lang.String a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_aef1986bc5245959594f(net.minecraft.client.shader.ShaderGroup a0, net.minecraft.client.renderer.texture.TextureManager a1, moom.DD a2) throws E;
private static final class __SourceHandler_aef1986bc5245959594f {

public static void f635(net.minecraft.client.shader.ShaderGroup receiver, net.minecraft.client.renderer.texture.TextureManager p0, moom.DD p1) throws Throwable {
    java.lang.Object life3_1;
    net.minecraft.client.resources.IResource life4_6;
    java.io.InputStream life3_9;
    com.google.gson.JsonObject life5_15;
    com.google.gson.JsonArray life6_23;
    int life7_25;
    java.util.Iterator life8_28;
    com.google.gson.JsonElement life9_35;
    com.google.gson.JsonArray life6_49;
    int life7_51;
    java.util.Iterator life8_54;
    com.google.gson.JsonElement life9_61;
    forest_join_67: {
    forest_join_41: {
    life3_1 = null;
    life4_6 = __call635_1(__fieldRead635_0(receiver), p1);
    life3_9 = __call635_2(life4_6);
    life5_15 = __call635_6(__call635_5(__call635_4(life3_9, __fieldRead635_3())));
    if (!(__call635_7(life5_15, "targets"))) {
        break forest_join_41;
    }
    life6_23 = __call635_8(life5_15, "targets");
    life7_25 = 0;
    life8_28 = __call635_9(life6_23);
    forest_cycle_29: while (true) {
    if (!(__call635_10(life8_28))) {
        break forest_join_41;
    }
    life9_35 = __cast635_12(__call635_11(life8_28));
    __call635_13(receiver, life9_35);
    life7_25 += 1;
    continue forest_cycle_29;
    }
    }
    if (!(__call635_14(life5_15, "passes"))) {
        break forest_join_67;
    }
    life6_49 = __call635_15(life5_15, "passes");
    life7_51 = 0;
    life8_54 = __call635_16(life6_49);
    forest_cycle_54: while (true) {
    if (!(__call635_17(life8_54))) {
        break forest_join_67;
    }
    life9_61 = __cast635_19(__call635_18(life8_54));
    __call635_20(receiver, p0, life9_61);
    life7_51 += 1;
    continue forest_cycle_54;
    }
    }
    __call635_21(life3_9);
    return;
}
public static void h635_0(java.lang.Exception p0, int p1) throws Throwable {
    java.lang.Exception life2_2;
    moom.D life3_5;
    life2_2 = p0;
    life3_5 = __call3063500_0(life2_2);
    __call3063500_2(life3_5, __invokedynamic3063500_1(p1));
    throw life3_5;
}
public static void h635_1(java.lang.Exception p0, int p1) throws Throwable {
    java.lang.Exception life2_2;
    moom.D life3_5;
    life2_2 = p0;
    life3_5 = __call3063501_0(life2_2);
    __call3063501_2(life3_5, __invokedynamic3063501_1(p1));
    throw life3_5;
}
public static void h635_2(java.lang.Exception p0, moom.DD p1) throws Throwable {
    java.lang.Exception life2_2;
    moom.D life3_5;
    life2_2 = p0;
    life3_5 = __call3063502_0(life2_2);
    __call3063502_2(life3_5, __call3063502_1(p1));
    throw life3_5;
}
public static void h635_3(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3063503_0(p1);
    throw life2_2;
}
private static native moom.oR __fieldRead635_0(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call635_1(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call635_2(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead635_3() throws Throwable;
private static native java.lang.String __call635_4(java.io.InputStream a0, java.nio.charset.Charset a1) throws Throwable;
private static native com.google.gson.JsonElement __call635_5(java.lang.String a0) throws Throwable;
private static native com.google.gson.JsonObject __call635_6(com.google.gson.JsonElement a0) throws Throwable;
private static native boolean __call635_7(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonArray __call635_8(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.util.Iterator __call635_9(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call635_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call635_11(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast635_12(java.lang.Object a0) throws Throwable;
private static native void __call635_13(net.minecraft.client.shader.ShaderGroup a0, com.google.gson.JsonElement a1) throws Throwable;
private static native boolean __call635_14(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonArray __call635_15(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.util.Iterator __call635_16(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call635_17(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call635_18(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast635_19(java.lang.Object a0) throws Throwable;
private static native void __call635_20(net.minecraft.client.shader.ShaderGroup a0, net.minecraft.client.renderer.texture.TextureManager a1, com.google.gson.JsonElement a2) throws Throwable;
private static native void __call635_21(java.io.InputStream a0) throws Throwable;
private static native moom.D __call3063500_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic3063500_1(int a0) throws Throwable;
private static native void __call3063500_2(moom.D a0, java.lang.String a1) throws Throwable;
private static native moom.D __call3063501_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic3063501_1(int a0) throws Throwable;
private static native void __call3063501_2(moom.D a0, java.lang.String a1) throws Throwable;
private static native moom.D __call3063502_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call3063502_1(moom.DD a0) throws Throwable;
private static native void __call3063502_2(moom.D a0, java.lang.String a1) throws Throwable;
private static native void __call3063503_0(java.io.InputStream a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f89b14c292e8d8b9410d(net.minecraft.client.shader.ShaderGroup a0, com.google.gson.JsonElement a1) throws E;
private static final class __SourceHandler_f89b14c292e8d8b9410d {

public static void f568(net.minecraft.client.shader.ShaderGroup receiver, com.google.gson.JsonElement p0) throws Throwable {
    com.google.gson.JsonObject life2_3;
    java.lang.String life3_7;
    net.minecraft.client.shader.ShaderUniform life4_20;
    float[] life5_33;
    int life6_35;
    java.util.Iterator life7_40;
    com.google.gson.JsonElement life8_47;
    life2_3 = __call568_0(p0, "uniform");
    life3_7 = __call568_1(life2_3, "name");
    life4_20 = __call568_8(__call568_7(__cast568_6(__call568_5(__fieldRead568_2(receiver), (__call568_4(__fieldRead568_3(receiver)) - 1)))), life3_7);
    if ((life4_20 == null)) {
        throw new moom.D(__invokedynamic568_9(life3_7));
    }
    life5_33 = new float[4];
    life6_35 = 0;
    life7_40 = __call568_11(__call568_10(life2_3, "values"));
    loop_region_39: while (__call568_12(life7_40)) {
        life8_47 = __cast568_14(__call568_13(life7_40));
        (life5_33)[life6_35] = __call568_15(life8_47, "value");
        life6_35 += 1;
    }
    switch (life6_35) {
case 0:
default:
{
        break;
    }
case 1:
{
        __call568_16(life4_20, (life5_33)[0]);
        break;
    }
case 2:
{
        __call568_17(life4_20, (life5_33)[0], (life5_33)[1]);
        break;
    }
case 3:
{
        __call568_18(life4_20, (life5_33)[0], (life5_33)[1], (life5_33)[2]);
        break;
    }
case 4:
{
        __call568_19(life4_20, (life5_33)[0], (life5_33)[1], (life5_33)[2], (life5_33)[3]);
        break;
    }
}
    return;
}
public static void h568_0(java.lang.Exception p0) throws Throwable {
    throw __call2056800_0(p0);
}
public static void h568_1(java.lang.Exception p0, int p1) throws Throwable {
    java.lang.Exception local2 = p0;
    moom.D local3 = __call2056801_0(local2);
    __call2056801_2(local3, __invokedynamic2056801_1(p1));
    throw local3;
}
public static void h568_2(java.lang.Exception p0) throws Throwable {
    throw __call2056802_0(p0);
}
private static native com.google.gson.JsonObject __call568_0(com.google.gson.JsonElement a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call568_1(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead568_2(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native java.util.List __fieldRead568_3(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native int __call568_4(java.util.List a0) throws Throwable;
private static native java.lang.Object __call568_5(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.client.shader.Shader __cast568_6(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderManager __call568_7(net.minecraft.client.shader.Shader a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderUniform __call568_8(net.minecraft.client.shader.ShaderManager a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic568_9(java.lang.String a0) throws Throwable;
private static native com.google.gson.JsonArray __call568_10(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.util.Iterator __call568_11(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call568_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call568_13(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast568_14(java.lang.Object a0) throws Throwable;
private static native float __call568_15(com.google.gson.JsonElement a0, java.lang.String a1) throws Throwable;
private static native void __call568_16(net.minecraft.client.shader.ShaderUniform a0, float a1) throws Throwable;
private static native void __call568_17(net.minecraft.client.shader.ShaderUniform a0, float a1, float a2) throws Throwable;
private static native void __call568_18(net.minecraft.client.shader.ShaderUniform a0, float a1, float a2, float a3) throws Throwable;
private static native void __call568_19(net.minecraft.client.shader.ShaderUniform a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native java.lang.Exception __call2056800_0(java.lang.Exception a0) throws Throwable;
private static native moom.D __call2056801_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic2056801_1(int a0) throws Throwable;
private static native void __call2056801_2(moom.D a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call2056802_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.shader.Framebuffer __sourceHandlerCall_651c6309d3762f5f826d(net.minecraft.client.shader.ShaderGroup a0, java.lang.String a1) throws E;
private static final class __SourceHandler_651c6309d3762f5f826d {

public static net.minecraft.client.shader.Framebuffer f2675(net.minecraft.client.shader.ShaderGroup receiver, java.lang.String p0) throws Throwable {
    return ((p0 == null) ? null : (__call2675_0(p0, "minecraft:main") ? __fieldRead2675_1(receiver) : __cast2675_4(__call2675_3(__fieldRead2675_2(receiver), p0))));
}
public static void h2675_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1267500_0(p0);
}
public static void h2675_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1267501_0(p0);
}
private static native boolean __call2675_0(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead2675_1(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native java.util.Map __fieldRead2675_2(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native java.lang.Object __call2675_3(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __cast2675_4(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1267500_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Exception __call1267501_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}


private void b() {
this.g = ((org.lwjgl.util.vector.Matrix4f)(new org.lwjgl.util.vector.Matrix4f()));
    ((org.lwjgl.util.vector.Matrix4f)(this.g)).setIdentity();
    ((org.lwjgl.util.vector.Matrix4f)(this.g)).m00 = ((float)((0x1.0p1f / ((float) ((net.minecraft.client.shader.Framebuffer)(this.a)).a))));
    ((org.lwjgl.util.vector.Matrix4f)(this.g)).m11 = ((float)((0x1.0p1f / ((float) (-((net.minecraft.client.shader.Framebuffer)(this.a)).b)))));
    ((org.lwjgl.util.vector.Matrix4f)(this.g)).m22 = ((float)(-0x1.062b920000000p-9F));
    ((org.lwjgl.util.vector.Matrix4f)(this.g)).m33 = ((float)(0x1.0p0f));
    ((org.lwjgl.util.vector.Matrix4f)(this.g)).m03 = ((float)(-0x1.0000000000000p+0F));
    ((org.lwjgl.util.vector.Matrix4f)(this.g)).m13 = ((float)(0x1.0p0f));
    ((org.lwjgl.util.vector.Matrix4f)(this.g)).m23 = ((float)(-0x1.000d1a0000000p+0F));
    return;
}


private void b(com.google.gson.JsonElement p0) throws moom.D { __sourceHandlerCall_f89b14c292e8d8b9410d(this, p0); }


private net.minecraft.client.shader.Framebuffer b(java.lang.String p0) { return __sourceHandlerCall_651c6309d3762f5f826d(this, p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(net.minecraft.client.renderer.texture.TextureManager p0, moom.DD p1) throws java.io.IOException, com.google.gson.JsonSyntaxException { __sourceHandlerCall_aef1986bc5245959594f(this, p0, p1); }


private void a(com.google.gson.JsonElement p0) throws moom.D { __sourceHandlerCall_66075e83c0ced2d919d4(this, p0); }


public final java.lang.String a() {
return this.c;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6633;
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
            throw new RuntimeException("moom/pC", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.shader.ShaderGroup.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10977_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.client.shader.Shader a(java.lang.String p0, net.minecraft.client.shader.Framebuffer p1, net.minecraft.client.shader.Framebuffer p2) throws java.io.IOException {
net.minecraft.client.shader.Shader local4 = new net.minecraft.client.shader.Shader(this.b, p0, p1, p2);
    ((java.util.List)(this.d)).add(((int)(((java.util.List)(this.d)).size())), ((java.lang.Object)(local4)));
    return local4;
}


public void a__Void() {
java.util.Iterator life1_4;
    net.minecraft.client.shader.Framebuffer life2_11;
    java.util.Iterator life1_18;
    net.minecraft.client.shader.Shader life2_25;
    life1_4 = ((java.util.Collection)(((java.util.Map)(this.e)).values())).iterator();
    while (((java.util.Iterator)(life1_4)).hasNext()) {
        life2_11 = ((net.minecraft.client.shader.Framebuffer)(((java.util.Iterator)(life1_4)).next()));
        ((net.minecraft.client.shader.Framebuffer)(life2_11)).a();
    }
    life1_18 = ((java.util.List)(this.d)).iterator();
    while (((java.util.Iterator)(life1_18)).hasNext()) {
        life2_25 = ((net.minecraft.client.shader.Shader)(((java.util.Iterator)(life1_18)).next()));
        ((net.minecraft.client.shader.Shader)(life2_25)).a__Void();
    }
    ((java.util.List)(this.d)).clear();
    return;
}


public void a(java.lang.String p0, int p1, int p2) { __sourceHandlerCall_428c192a7d5a79a9a682(this, p0, p1, p2); }


public net.minecraft.client.shader.Framebuffer a(java.lang.String p0) {
return ((net.minecraft.client.shader.Framebuffer)(((java.util.Map)(this.e)).get(((java.lang.Object)(p0)))));
}


private void a(net.minecraft.client.renderer.texture.TextureManager p0, com.google.gson.JsonElement p1) throws java.io.IOException { __sourceHandlerCall_182ce9ed63a514ba89af(this, p0, p1); }


public void a(int p0, int p1) {
java.util.Iterator life3_15;
    net.minecraft.client.shader.Shader life4_22;
    java.util.Iterator life3_31;
    net.minecraft.client.shader.Framebuffer life4_38;
    this.h = ((int)(((net.minecraft.client.shader.Framebuffer)(this.a)).a));
    this.i = ((int)(((net.minecraft.client.shader.Framebuffer)(this.a)).b));
    ((net.minecraft.client.shader.ShaderGroup)(this)).b();
    life3_15 = ((java.util.List)(this.d)).iterator();
    loop_region_16: while (((java.util.Iterator)(life3_15)).hasNext()) {
        life4_22 = ((net.minecraft.client.shader.Shader)(((java.util.Iterator)(life3_15)).next()));
        ((net.minecraft.client.shader.Shader)(life4_22)).a(((org.lwjgl.util.vector.Matrix4f)(this.g)));
    }
    life3_31 = ((java.util.List)(this.f)).iterator();
    loop_region_32: while (((java.util.Iterator)(life3_31)).hasNext()) {
        life4_38 = ((net.minecraft.client.shader.Framebuffer)(((java.util.Iterator)(life3_31)).next()));
        ((net.minecraft.client.shader.Framebuffer)(life4_38)).a(((int)(p0)), ((int)(p1)));
    }
    return;
}


public void a(float p0) { __sourceHandlerCall_ef5d7c18b3e91b3ecada(this, p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10977_0() throws E;
}
