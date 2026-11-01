package net.minecraft.client.renderer.texture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class TextureAtlasSprite {

private java.lang.String a;

protected java.util.List<int[][]> b;

protected int[][] c;

private net.minecraft.client.resources.data.AnimationMetadataSection d;

protected boolean e;

protected int f;

protected int g;

protected int h;

protected int i;

private float j;

private float k;

private float l;

private float m;

protected int n;

protected int o;

private static java.lang.String p;

private static java.lang.String q;

private int r;

public float s;

public float t;

public int u;

public int v;

public int w;

public net.minecraft.client.renderer.texture.TextureAtlasSprite x;

public boolean y;

public int z;

public net.minecraft.client.renderer.texture.TextureAtlasSprite A;

public net.minecraft.client.renderer.texture.TextureAtlasSprite B;

public boolean C;

public boolean D;

public net.minecraft.client.renderer.texture.TextureAtlasSprite E;

private int F;

private boolean G;

private static long K;

private static long[] L;

private static java.lang.Integer[] M;

private static java.util.Map N;

private TextureAtlasSprite(java.lang.String p0, boolean p1) {
super();
    this.b = com.google.common.collect.Lists.newArrayList();
    this.r = -1;
    this.w = -1;
    this.x = null;
    this.y = false;
    this.z = 0;
    this.A = null;
    this.B = null;
    this.C = false;
    this.D = false;
    this.E = null;
    this.F = -1;
    this.G = false;
    this.a = p0;
    this.y = p1;
}


public TextureAtlasSprite(java.lang.String p0) {
super();
    this.b = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    this.r = ((int)(-1));
    this.w = ((int)(-1));
    this.x = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));
    this.y = ((boolean)(false));
    this.z = ((int)(0));
    this.A = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));
    this.B = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));
    this.C = ((boolean)(false));
    this.D = ((boolean)(false));
    this.E = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));
    this.F = ((int)(-1));
    this.G = ((boolean)(false));
    this.a = ((java.lang.String)(p0));
    if (moom.BU.Y()) {
        this.x = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(new net.minecraft.client.renderer.texture.TextureAtlasSprite(__sourceIntrinsic_5ca107de5868_originalDynamicSite3770_18(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this)).a__String()), true)));
    }
    return;
}


static {
K = ((long)(((moom._a)(moom._c.a(((long)(2131710286545088388L)), ((long)(-6977851289777096696L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9949574090724L)))));
    N = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.renderer.texture.TextureAtlasSprite.K ^ 89267205346999L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1821_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1821_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1821_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1821_14 = new byte[8];
    (__sourceSpill1821_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1821_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1821_16 = __sourceSpill1821_14;
    ((javax.crypto.Cipher)(__sourceSpill1821_11)).init(((int)(__sourceSpill1821_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1821_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1821_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ç\005^Ý\005E\023ÙÌî­X\027\003µ.~u â±\021L©ûTõµ{åx\030õqÍÕ\005\033{î¿\020°j?§ß\031¦o¥-úU'lSñë¸-ý]Üêr½öó/#\026x|4"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1821_25 = local6_life21;
        int __sourceSpill1821_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1821_25)).substring(((int)(__sourceSpill1821_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1821_30 = local8_life19;
        int __sourceSpill1821_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1821_33 = new byte[8];
        (__sourceSpill1821_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1821_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1821_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1821_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1821_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1821_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1821_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1821_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1821_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1821_34)).doFinal(((byte[])(__sourceSpill1821_33)));
        (__sourceSpill1821_30)[__sourceSpill1821_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\035ý÷ÖL~gÒ«; ¥ð"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1821_38 = local6_life21;
        int __sourceSpill1821_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1821_38)).substring(((int)(__sourceSpill1821_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1821_43 = local8_life19;
        int __sourceSpill1821_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1821_46 = new byte[8];
        (__sourceSpill1821_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1821_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1821_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1821_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1821_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1821_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1821_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1821_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1821_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1821_47)).doFinal(((byte[])(__sourceSpill1821_46)));
        (__sourceSpill1821_43)[__sourceSpill1821_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    L = ((long[])(local8_life19));
    M = ((java.lang.Integer[])(new java.lang.Integer[13]));
    p = ((java.lang.String)("builtin/clock"));
    q = ((java.lang.String)("builtin/compass"));
}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceHandlerCall_df8b2854543eccf8c0cc(moom.DD a0) throws E;
private static final class __SourceHandler_df8b2854543eccf8c0cc {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f519(moom.DD p0) throws Throwable {
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue519_25_0;
    java.lang.String life1_2;
    forward_join_25: {
    forward_join_21: {
    forward_join_12: {
    life1_2 = __call519_0(p0);
    if (!(__call519_2(__fieldRead519_1(), life1_2))) {
        break forward_join_12;
    }
    forwardValue519_25_0 = new net.minecraft.client.renderer.texture.TextureClock(life1_2);
    break forward_join_25;
    }
    if (!(__call519_4(__fieldRead519_3(), life1_2))) {
        break forward_join_21;
    }
    forwardValue519_25_0 = new net.minecraft.client.renderer.texture.TextureCompass(life1_2);
    break forward_join_25;
    }
    forwardValue519_25_0 = new net.minecraft.client.renderer.texture.TextureAtlasSprite(life1_2);
    }
    return forwardValue519_25_0;
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h519_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call2051900_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h519_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call2051901_0(p0);
}
private static native java.lang.String __call519_0(moom.DD a0) throws Throwable;
private static native java.lang.String __fieldRead519_1() throws Throwable;
private static native boolean __call519_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead519_3() throws Throwable;
private static native boolean __call519_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call2051900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call2051901_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dda0d309720f567181d4(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.awt.image.BufferedImage[] a1, net.minecraft.client.resources.data.AnimationMetadataSection a2) throws E;
private static final class __SourceHandler_dda0d309720f567181d4 {

public static void f161(net.minecraft.client.renderer.texture.TextureAtlasSprite receiver, java.awt.image.BufferedImage[] p0, net.minecraft.client.resources.data.AnimationMetadataSection p1) throws Throwable {
    int life3_6;
    int life4_11;
    int[][] life5_37;
    int life6_39;
    java.awt.image.BufferedImage life7_47;
    int life6_178;
    java.util.Iterator life7_189;
    int life8_197;
    java.util.ArrayList life7_228;
    int life8_230;
    java.util.Iterator life6_285;
    int[][] life7_292;
    int[][] life8_304;
    int life9_307;
    int life10_309;
    int[] life11_316;
    lexical_join_299: {
    lexical_join_291: {
    lexical_join_253: {
    lexical_join_246: {
    lexical_join_232: {
    lexical_join_206: {
    lexical_join_202: {
    lexical_join_156: {
    lexical_join_150: {
    lexical_join_140: {
    lexical_join_31: {
    __call161_0(receiver);
    life3_6 = __call161_1((p0)[0]);
    life4_11 = __call161_2((p0)[0]);
    __fieldWrite161_3(receiver, life3_6);
    __fieldWrite161_4(receiver, life4_11);
    if (!((__fieldRead161_5(receiver) != null))) {
        break lexical_join_31;
    }
    __fieldWrite161_8(__fieldRead161_6(receiver), __fieldRead161_7(receiver));
    __fieldWrite161_11(__fieldRead161_9(receiver), __fieldRead161_10(receiver));
    }
    life5_37 = new int[(p0).length][];
    life6_39 = 0;
    lexical_cycle_37: while (true) {
    lexical_join_138: {
    lexical_join_114: {
    lexical_join_75: {
    lexical_join_61: {
    if (!((life6_39 < (p0).length))) {
        break lexical_join_140;
    }
    life7_47 = (p0)[life6_39];
    if (!((life7_47 != null))) {
        break lexical_join_138;
    }
    if (!(((__fieldRead161_12(receiver) >> life6_39) != __call161_13(life7_47)))) {
        break lexical_join_61;
    }
    life7_47 = __call161_15(life7_47, (__fieldRead161_14(receiver) >> life6_39));
    }
    if (!((life6_39 > 0))) {
        break lexical_join_114;
    }
    if (!((__call161_16(life7_47) == (life3_6 >> life6_39)))) {
        break lexical_join_75;
    }
    if (!((__call161_17(life7_47) != (life4_11 >> life6_39)))) {
        break lexical_join_114;
    }
    }
    throw new java.lang.RuntimeException(__call161_25("Unable to load miplevel: %d, image is size: %dx%d, expected %dx%d", new java.lang.Object[] {__call161_18(life6_39), __call161_20(__call161_19(life7_47)), __call161_22(__call161_21(life7_47)), __call161_23((life3_6 >> life6_39)), __call161_24((life4_11 >> life6_39))}));
    }
    (life5_37)[life6_39] = new int[(__call161_26(life7_47) * __call161_27(life7_47))];
    __call161_31(life7_47, 0, 0, __call161_28(life7_47), __call161_29(life7_47), (life5_37)[life6_39], 0, __call161_30(life7_47));
    }
    life6_39 += 1;
    continue lexical_cycle_37;
    }
    }
    if (!((p1 == null))) {
        break lexical_join_156;
    }
    if (!((life4_11 != life3_6))) {
        break lexical_join_150;
    }
    throw new java.lang.RuntimeException("broken aspect ratio and not an animation");
    }
    __call161_33(__fieldRead161_32(receiver), life5_37);
    break lexical_join_246;
    }
    life6_178 = (life4_11 / life3_6);
    __fieldWrite161_35(receiver, __fieldRead161_34(receiver));
    if (!((__call161_36(p1) > 0))) {
        break lexical_join_206;
    }
    life7_189 = __call161_38(__call161_37(p1));
    lexical_cycle_171: while (true) {
    lexical_join_188: {
    if (!(__call161_39(life7_189))) {
        break lexical_join_202;
    }
    life8_197 = __call161_42(__cast161_41(__call161_40(life7_189)));
    if (!((life8_197 >= life6_178))) {
        break lexical_join_188;
    }
    throw new java.lang.RuntimeException(__invokedynamic161_43(life8_197));
    }
    __call161_44(receiver, life8_197);
    __call161_47(__fieldRead161_45(receiver), life8_197, __call161_46(life5_37, life3_6, life3_6, life8_197));
    continue lexical_cycle_171;
    }
    }
    __fieldWrite161_48(receiver, p1);
    break lexical_join_246;
    }
    life7_228 = __call161_49();
    life8_230 = 0;
    lexical_cycle_210: while (true) {
    if (!((life8_230 < life6_178))) {
        break lexical_join_232;
    }
    __call161_52(__fieldRead161_50(receiver), __call161_51(life5_37, life3_6, life3_6, life8_230));
    __call161_53(life7_228, new moom.o9(life8_230, -1));
    life8_230 += 1;
    continue lexical_cycle_210;
    }
    }
    __fieldWrite161_58(receiver, new net.minecraft.client.resources.data.AnimationMetadataSection(life7_228, __fieldRead161_54(receiver), __fieldRead161_55(receiver), __call161_56(p1), __call161_57(p1)));
    }
    if (!((!__fieldRead161_59(receiver)))) {
        break lexical_join_299;
    }
    if (!(__call161_60())) {
        break lexical_join_253;
    }
    __call161_61(receiver);
    }
    life6_285 = __call161_63(__fieldRead161_62(receiver));
    lexical_cycle_257: while (true) {
    lexical_join_290: {
    if (!(__call161_64(life6_285))) {
        break lexical_join_291;
    }
    life7_292 = __cast161_66(__call161_65(life6_285));
    if (!((life7_292 != null))) {
        break lexical_join_290;
    }
    if (!((!__call161_68(__fieldRead161_67(receiver), "minecraft:blocks/leaves_")))) {
        break lexical_join_290;
    }
    life8_304 = life7_292;
    life9_307 = (life8_304).length;
    life10_309 = 0;
    lexical_cycle_278: while (true) {
    if (!((life10_309 < life9_307))) {
        break lexical_join_290;
    }
    life11_316 = (life8_304)[life10_309];
    __call161_69(receiver, life11_316);
    life10_309 += 1;
    continue lexical_cycle_278;
    }
    }
    continue lexical_cycle_257;
    }
    }
    if (!((__fieldRead161_70(receiver) != null))) {
        break lexical_join_299;
    }
    __call161_72(__fieldRead161_71(receiver), p0, p1);
    }
    return;
}
public static void h161_0(java.io.IOException p0) throws Throwable {
    throw __call3016100_0(p0);
}
public static void h161_1(java.io.IOException p0) throws Throwable {
    throw __call3016101_0(p0);
}
public static void h161_2(java.io.IOException p0) throws Throwable {
    throw __call3016102_0(p0);
}
public static void h161_3(java.io.IOException p0) throws Throwable {
    throw __call3016103_0(p0);
}
public static void h161_4(java.io.IOException p0) throws Throwable {
    throw __call3016104_0(p0);
}
public static void h161_5(java.io.IOException p0) throws Throwable {
    throw __call3016105_0(p0);
}
public static void h161_6(java.io.IOException p0) throws Throwable {
    throw __call3016106_0(p0);
}
public static void h161_7(java.io.IOException p0) throws Throwable {
    throw __call3016107_0(p0);
}
public static void h161_8(java.io.IOException p0) throws Throwable {
    throw __call3016108_0(p0);
}
public static void h161_9(java.io.IOException p0) throws Throwable {
    throw __call3016109_0(p0);
}
public static void h161_10(java.io.IOException p0) throws Throwable {
    throw __call3016110_0(p0);
}
public static void h161_11(java.io.IOException p0) throws Throwable {
    throw __call3016111_0(p0);
}
public static void h161_12(java.io.IOException p0) throws Throwable {
    throw __call3016112_0(p0);
}
private static native void __call161_0(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call161_1(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call161_2(java.awt.image.BufferedImage a0) throws Throwable;
private static native void __fieldWrite161_3(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite161_4(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead161_5(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead161_6(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead161_7(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __fieldWrite161_8(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead161_9(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead161_10(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __fieldWrite161_11(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead161_12(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call161_13(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __fieldRead161_14(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.awt.image.BufferedImage __call161_15(java.awt.image.BufferedImage a0, int a1) throws Throwable;
private static native int __call161_16(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call161_17(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.lang.Integer __call161_18(int a0) throws Throwable;
private static native int __call161_19(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.lang.Integer __call161_20(int a0) throws Throwable;
private static native int __call161_21(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.lang.Integer __call161_22(int a0) throws Throwable;
private static native java.lang.Integer __call161_23(int a0) throws Throwable;
private static native java.lang.Integer __call161_24(int a0) throws Throwable;
private static native java.lang.String __call161_25(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __call161_26(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call161_27(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call161_28(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call161_29(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call161_30(java.awt.image.BufferedImage a0) throws Throwable;
private static native int[] __call161_31(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native java.util.List __fieldRead161_32(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call161_33(java.util.List a0, int[][] a1) throws Throwable;
private static native int __fieldRead161_34(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __fieldWrite161_35(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call161_36(net.minecraft.client.resources.data.AnimationMetadataSection a0) throws Throwable;
private static native java.util.Set __call161_37(net.minecraft.client.resources.data.AnimationMetadataSection a0) throws Throwable;
private static native java.util.Iterator __call161_38(java.util.Set a0) throws Throwable;
private static native boolean __call161_39(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call161_40(java.util.Iterator a0) throws Throwable;
private static native java.lang.Integer __cast161_41(java.lang.Object a0) throws Throwable;
private static native int __call161_42(java.lang.Integer a0) throws Throwable;
private static native java.lang.String __invokedynamic161_43(int a0) throws Throwable;
private static native void __call161_44(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native java.util.List __fieldRead161_45(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __call161_46(int[][] a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Object __call161_47(java.util.List a0, int a1, int[][] a2) throws Throwable;
private static native void __fieldWrite161_48(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.resources.data.AnimationMetadataSection a1) throws Throwable;
private static native java.util.ArrayList __call161_49() throws Throwable;
private static native java.util.List __fieldRead161_50(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __call161_51(int[][] a0, int a1, int a2, int a3) throws Throwable;
private static native boolean __call161_52(java.util.List a0, int[][] a1) throws Throwable;
private static native boolean __call161_53(java.util.ArrayList a0, moom.o9 a1) throws Throwable;
private static native int __fieldRead161_54(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead161_55(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call161_56(net.minecraft.client.resources.data.AnimationMetadataSection a0) throws Throwable;
private static native boolean __call161_57(net.minecraft.client.resources.data.AnimationMetadataSection a0) throws Throwable;
private static native void __fieldWrite161_58(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.resources.data.AnimationMetadataSection a1) throws Throwable;
private static native boolean __fieldRead161_59(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call161_60() throws Throwable;
private static native void __call161_61(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.List __fieldRead161_62(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.Iterator __call161_63(java.util.List a0) throws Throwable;
private static native boolean __call161_64(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call161_65(java.util.Iterator a0) throws Throwable;
private static native int[][] __cast161_66(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead161_67(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call161_68(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call161_69(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int[] a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead161_70(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead161_71(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call161_72(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.awt.image.BufferedImage[] a1, net.minecraft.client.resources.data.AnimationMetadataSection a2) throws Throwable;
private static native java.lang.Throwable __call3016100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3016101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3016102_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3016103_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3016104_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3016105_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3016106_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3016107_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3016108_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3016109_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3016110_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3016111_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3016112_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_62a21abffb783bcc7d8d(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws E;
private static final class __SourceHandler_62a21abffb783bcc7d8d {

public static boolean f2578(net.minecraft.client.renderer.texture.TextureAtlasSprite receiver) throws Throwable {
    return ((__fieldRead2578_0(receiver) != null) ? true : false);
}
public static void h2578_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1257800_0(p0);
}
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead2578_0(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Throwable __call1257800_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3d4b5be2b20c027c1b51(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws E;
private static final class __SourceHandler_3d4b5be2b20c027c1b51 {

public static void f616(net.minecraft.client.renderer.texture.TextureAtlasSprite receiver) throws Throwable {
    net.minecraft.client.renderer.texture.TextureAtlasSprite forestValue616_10_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forestValue616_12_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forestValue616_13_0;
    int forestValue616_13_1;
    int forestValue616_45_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill616_0;
    int life1_35;
    int life2_47;
    int life3_64;
    int life4_66;
    int life5_69;
    forest_join_109: {
    forest_join_107: {
    forest_join_99: {
    forest_join_98: {
    forest_join_72: {
    forest_join_45: {
    forest_join_42: {
    forest_join_13: {
    forest_join_12: {
    forest_join_10: {
    if (!((__fieldRead616_0(receiver) != null))) {
        break forest_join_109;
    }
    spill616_0 = receiver;
    if (!(__call616_1())) {
        forestValue616_10_0 = spill616_0;
        break forest_join_10;
    }
    if (!(__call616_3(__fieldRead616_2(receiver)))) {
        forestValue616_12_0 = spill616_0;
        break forest_join_12;
    }
    forestValue616_10_0 = spill616_0;
    }
    forestValue616_13_0 = forestValue616_10_0;
    forestValue616_13_1 = 1;
    break forest_join_13;
    }
    forestValue616_13_0 = forestValue616_12_0;
    forestValue616_13_1 = 0;
    }
    __fieldWrite616_4(forestValue616_13_0, forestValue616_13_1);
    net.minecraft.client.renderer.texture.TextureAtlasSprite __stackOp616_5_0 = receiver;
    __fieldWrite616_7(__stackOp616_5_0, (__fieldRead616_6(__stackOp616_5_0) + 1));
    if (!((__fieldRead616_8(receiver) >= __call616_11(__fieldRead616_9(receiver), __fieldRead616_10(receiver))))) {
        break forest_join_99;
    }
    life1_35 = __call616_14(__fieldRead616_12(receiver), __fieldRead616_13(receiver));
    if (!((__call616_16(__fieldRead616_15(receiver)) == 0))) {
        break forest_join_42;
    }
    forestValue616_45_0 = __call616_18(__fieldRead616_17(receiver));
    break forest_join_45;
    }
    forestValue616_45_0 = __call616_20(__fieldRead616_19(receiver));
    }
    life2_47 = forestValue616_45_0;
    __fieldWrite616_22(receiver, ((__fieldRead616_21(receiver) + 1) % life2_47));
    __fieldWrite616_23(receiver, 0);
    life3_64 = __call616_26(__fieldRead616_24(receiver), __fieldRead616_25(receiver));
    life4_66 = 0;
    life5_69 = __integerCategory616_28(__fieldRead616_27(receiver));
    if (!((!__fieldRead616_29(receiver)))) {
        break forest_join_72;
    }
    return;
    }
    if (!((life1_35 != life3_64))) {
        break forest_join_98;
    }
    if (!((life3_64 >= 0))) {
        break forest_join_98;
    }
    if (!((life3_64 < __call616_31(__fieldRead616_30(receiver))))) {
        break forest_join_98;
    }
    __call616_39(__cast616_34(__call616_33(__fieldRead616_32(receiver), life3_64)), __fieldRead616_35(receiver), __fieldRead616_36(receiver), __fieldRead616_37(receiver), __fieldRead616_38(receiver), life4_66, life5_69);
    }
    break forest_join_109;
    }
    if (!(__call616_41(__fieldRead616_40(receiver)))) {
        break forest_join_109;
    }
    if (!((!__fieldRead616_42(receiver)))) {
        break forest_join_107;
    }
    return;
    }
    __call616_43(receiver);
    }
    return;
}
public static void h616_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061600_0(p0);
}
public static void h616_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061601_0(p0);
}
public static void h616_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061602_0(p0);
}
public static void h616_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061603_0(p0);
}
public static void h616_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061604_0(p0);
}
public static void h616_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061605_0(p0);
}
public static void h616_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061606_0(p0);
}
public static void h616_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061607_0(p0);
}
public static void h616_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061608_0(p0);
}
public static void h616_9(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061609_0(p0);
}
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead616_0(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call616_1() throws Throwable;
private static native int __fieldRead616_2(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call616_3(int a0) throws Throwable;
private static native void __fieldWrite616_4(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead616_6(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __fieldWrite616_7(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead616_8(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead616_9(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead616_10(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call616_11(net.minecraft.client.resources.data.AnimationMetadataSection a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead616_12(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead616_13(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call616_14(net.minecraft.client.resources.data.AnimationMetadataSection a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead616_15(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call616_16(net.minecraft.client.resources.data.AnimationMetadataSection a0) throws Throwable;
private static native java.util.List __fieldRead616_17(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call616_18(java.util.List a0) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead616_19(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call616_20(net.minecraft.client.resources.data.AnimationMetadataSection a0) throws Throwable;
private static native int __fieldRead616_21(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __fieldWrite616_22(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite616_23(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead616_24(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead616_25(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call616_26(net.minecraft.client.resources.data.AnimationMetadataSection a0, int a1) throws Throwable;
private static native boolean __fieldRead616_27(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __integerCategory616_28(boolean value) throws Throwable;
private static native boolean __fieldRead616_29(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.List __fieldRead616_30(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call616_31(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead616_32(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Object __call616_33(java.util.List a0, int a1) throws Throwable;
private static native int[][] __cast616_34(java.lang.Object a0) throws Throwable;
private static native int __fieldRead616_35(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead616_36(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead616_37(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead616_38(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call616_39(int[][] a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead616_40(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call616_41(net.minecraft.client.resources.data.AnimationMetadataSection a0) throws Throwable;
private static native boolean __fieldRead616_42(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call616_43(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Throwable __call3061600_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3061601_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3061602_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3061603_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3061604_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3061605_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3061606_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3061607_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3061608_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3061609_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_02cf59d2b4fdb747c114(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws E;
private static final class __SourceHandler_02cf59d2b4fdb747c114 {

public static void f1419(net.minecraft.client.renderer.texture.TextureAtlasSprite receiver) throws Throwable {
    int lexicalValue1419_34_0;
    long life1_3;
    double life3_16;
    int life5_22;
    int life6_36;
    int life7_46;
    int[][] life8_68;
    int[][] life9_74;
    int life10_96;
    int life11_138;
    int life12_150;
    int life13_156;
    int life14_193;
    int life15_230;
    int life16_255;
    lexical_join_281: {
    lexical_join_268: {
    lexical_join_81: {
    lexical_join_76: {
    lexical_join_34: {
    lexical_join_31: {
    life1_3 = (__fieldRead1419_0() ^ 99846715524984L);
    life3_16 = (0x1.0p0d - (((double) __fieldRead1419_1(receiver)) / ((double) __call1419_4(__fieldRead1419_2(receiver), __fieldRead1419_3(receiver)))));
    life5_22 = __call1419_7(__fieldRead1419_5(receiver), __fieldRead1419_6(receiver));
    if (!((__call1419_9(__fieldRead1419_8(receiver)) == 0))) {
        break lexical_join_31;
    }
    lexicalValue1419_34_0 = __call1419_11(__fieldRead1419_10(receiver));
    break lexical_join_34;
    }
    lexicalValue1419_34_0 = __call1419_13(__fieldRead1419_12(receiver));
    }
    life6_36 = lexicalValue1419_34_0;
    life7_46 = __call1419_16(__fieldRead1419_14(receiver), ((__fieldRead1419_15(receiver) + 1) % life6_36));
    if (!((life5_22 != life7_46))) {
        break lexical_join_281;
    }
    if (!((life7_46 >= 0))) {
        break lexical_join_281;
    }
    if (!((life7_46 < __call1419_18(__fieldRead1419_17(receiver))))) {
        break lexical_join_281;
    }
    life8_68 = __cast1419_21(__call1419_20(__fieldRead1419_19(receiver), life5_22));
    life9_74 = __cast1419_24(__call1419_23(__fieldRead1419_22(receiver), life7_46));
    if (!((__fieldRead1419_25(receiver) != null))) {
        break lexical_join_76;
    }
    if (!(((__fieldRead1419_26(receiver)).length != (life8_68).length))) {
        break lexical_join_81;
    }
    }
    __fieldWrite1419_27(receiver, new int[(life8_68).length][]);
    }
    life10_96 = 0;
    lexical_cycle_83: while (true) {
    lexical_join_266: {
    lexical_join_101: {
    if (!((life10_96 < (life8_68).length))) {
        break lexical_join_268;
    }
    if (!(((__fieldRead1419_28(receiver))[life10_96] == null))) {
        break lexical_join_101;
    }
    (__fieldRead1419_29(receiver))[life10_96] = new int[((life8_68)[life10_96]).length];
    }
    if (!((life10_96 < (life9_74).length))) {
        break lexical_join_266;
    }
    if (!((((life9_74)[life10_96]).length == ((life8_68)[life10_96]).length))) {
        break lexical_join_266;
    }
    life11_138 = 0;
    lexical_cycle_116: while (true) {
    if (!((life11_138 < ((life8_68)[life10_96]).length))) {
        break lexical_join_266;
    }
    life12_150 = ((life8_68)[life10_96])[life11_138];
    life13_156 = ((life9_74)[life10_96])[life11_138];
    life14_193 = ((int) ((((double) ((life12_150 & __invokedynamic1419_30(14263, (4898165406576426519L ^ life1_3))) >> __invokedynamic1419_31(12978, (8086967934210685725L ^ life1_3)))) * life3_16) + (((double) ((life13_156 & __invokedynamic1419_32(20239, (9075226435986245287L ^ life1_3))) >> __invokedynamic1419_33(26613, (5170006429382569563L ^ life1_3)))) * (0x1.0p0d - life3_16))));
    life15_230 = ((int) ((((double) ((life12_150 & __invokedynamic1419_34(29371, (5726523220588133148L ^ life1_3))) >> __invokedynamic1419_35(12050, (936191974877144767L ^ life1_3)))) * life3_16) + (((double) ((life13_156 & __invokedynamic1419_36(20345, (996429680500328152L ^ life1_3))) >> __invokedynamic1419_37(32259, (3739427129892927399L ^ life1_3)))) * (0x1.0p0d - life3_16))));
    life16_255 = ((int) ((((double) (life12_150 & __invokedynamic1419_38(19164, (4941974114859598713L ^ life1_3)))) * life3_16) + (((double) (life13_156 & __invokedynamic1419_39(18102, (2160572719120469780L ^ life1_3)))) * (0x1.0p0d - life3_16))));
    ((__fieldRead1419_40(receiver))[life10_96])[life11_138] = ((((life12_150 & __invokedynamic1419_41(32599, (1265022834350716667L ^ life1_3))) | (life14_193 << __invokedynamic1419_42(26613, (5170006429382569563L ^ life1_3)))) | (life15_230 << __invokedynamic1419_43(32259, (3739427129892927399L ^ life1_3)))) | life16_255);
    life11_138 += 1;
    continue lexical_cycle_116;
    }
    }
    life10_96 += 1;
    continue lexical_cycle_83;
    }
    }
    __call1419_49(__fieldRead1419_44(receiver), __fieldRead1419_45(receiver), __fieldRead1419_46(receiver), __fieldRead1419_47(receiver), __fieldRead1419_48(receiver), 0, 0);
    }
    return;
}
public static void h1419_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1141900_0(p0);
}
public static void h1419_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1141901_0(p0);
}
public static void h1419_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1141902_0(p0);
}
public static void h1419_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1141903_0(p0);
}
public static void h1419_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1141904_0(p0);
}
public static void h1419_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1141905_0(p0);
}
public static void h1419_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call1141906_0(p0);
}
public static void h1419_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call1141907_0(p0);
}
private static native long __fieldRead1419_0() throws Throwable;
private static native int __fieldRead1419_1(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead1419_2(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead1419_3(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call1419_4(net.minecraft.client.resources.data.AnimationMetadataSection a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead1419_5(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead1419_6(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call1419_7(net.minecraft.client.resources.data.AnimationMetadataSection a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead1419_8(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call1419_9(net.minecraft.client.resources.data.AnimationMetadataSection a0) throws Throwable;
private static native java.util.List __fieldRead1419_10(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call1419_11(java.util.List a0) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead1419_12(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call1419_13(net.minecraft.client.resources.data.AnimationMetadataSection a0) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __fieldRead1419_14(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead1419_15(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call1419_16(net.minecraft.client.resources.data.AnimationMetadataSection a0, int a1) throws Throwable;
private static native java.util.List __fieldRead1419_17(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call1419_18(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1419_19(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Object __call1419_20(java.util.List a0, int a1) throws Throwable;
private static native int[][] __cast1419_21(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead1419_22(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Object __call1419_23(java.util.List a0, int a1) throws Throwable;
private static native int[][] __cast1419_24(java.lang.Object a0) throws Throwable;
private static native int[][] __fieldRead1419_25(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __fieldRead1419_26(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __fieldWrite1419_27(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int[][] a1) throws Throwable;
private static native int[][] __fieldRead1419_28(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __fieldRead1419_29(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __invokedynamic1419_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic1419_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic1419_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic1419_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic1419_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic1419_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic1419_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic1419_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic1419_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic1419_39(int a0, long a1) throws Throwable;
private static native int[][] __fieldRead1419_40(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __invokedynamic1419_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic1419_42(int a0, long a1) throws Throwable;
private static native int __invokedynamic1419_43(int a0, long a1) throws Throwable;
private static native int[][] __fieldRead1419_44(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead1419_45(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead1419_46(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead1419_47(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead1419_48(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call1419_49(int[][] a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native java.lang.Throwable __call1141900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call1141901_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call1141902_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call1141903_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call1141904_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call1141905_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call1141906_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call1141907_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ca967c4cfbfd191c1653(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws E;
private static final class __SourceHandler_ca967c4cfbfd191c1653 {

public static void f520(net.minecraft.client.renderer.texture.TextureAtlasSprite receiver, int p0) throws Throwable {
    java.util.ArrayList life2_1;
    int life3_3;
    int[][] life4_14;
    life2_1 = __call520_0();
    life3_3 = 0;
    loop_region_4: while ((life3_3 < __call520_2(__fieldRead520_1(receiver)))) {
        life4_14 = __cast520_5(__call520_4(__fieldRead520_3(receiver), life3_3));
        if ((life4_14 != null)) {
        __call520_8(life2_1, __call520_7(p0, __fieldRead520_6(receiver), life4_14));
    }
        life3_3 += 1;
    }
    __call520_9(receiver, life2_1);
    if ((__fieldRead520_10(receiver) != null)) {
        __call520_12(__fieldRead520_11(receiver), p0);
    }
    return;
}
public static void h520_0(java.lang.Throwable p0, int p1, int[][] p2) throws Throwable {
    java.lang.Throwable local3 = p0;
    moom.qY local4 = __call2052000_0(local3, "Generating mipmaps for frame");
    moom.qZ local5 = __call2052000_1(local4, "Frame being iterated");
    __call2052000_3(local5, "Frame index", __call2052000_2(p1));
    __call2052000_5(local5, "Frame sizes", __invokedynamic2052000_4(p2));
    throw new moom.Oo(local4);
}
public static void h520_1(java.lang.Throwable p0) throws Throwable {
    throw __call2052001_0(p0);
}
private static native java.util.ArrayList __call520_0() throws Throwable;
private static native java.util.List __fieldRead520_1(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call520_2(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead520_3(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Object __call520_4(java.util.List a0, int a1) throws Throwable;
private static native int[][] __cast520_5(java.lang.Object a0) throws Throwable;
private static native int __fieldRead520_6(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __call520_7(int a0, int a1, int[][] a2) throws Throwable;
private static native boolean __call520_8(java.util.ArrayList a0, int[][] a1) throws Throwable;
private static native void __call520_9(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.util.ArrayList a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead520_10(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead520_11(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call520_12(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native moom.qY __call2052000_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2052000_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __call2052000_2(int a0) throws Throwable;
private static native void __call2052000_3(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2052000_4(int[][] a0) throws Throwable;
private static native void __call2052000_5(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.lang.Throwable __call2052001_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5d570ccc2e8bf4e26f41(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws E;
private static final class __SourceHandler_5d570ccc2e8bf4e26f41 {

public static void f2582(net.minecraft.client.renderer.texture.TextureAtlasSprite receiver, int p0) throws Throwable {
    int life2_8;
    if ((__call2582_1(__fieldRead2582_0(receiver)) <= p0)) {
        life2_8 = __call2582_3(__fieldRead2582_2(receiver));
        loop_region_9: while ((life2_8 <= p0)) {
        __call2582_5(__fieldRead2582_4(receiver), null);
        life2_8 += 1;
    }
    }
    if ((__fieldRead2582_6(receiver) != null)) {
        __call2582_8(__fieldRead2582_7(receiver), p0);
    }
    return;
}
public static void h2582_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1258200_0(p0);
}
public static void h2582_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1258201_0(p0);
}
private static native java.util.List __fieldRead2582_0(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call2582_1(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead2582_2(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call2582_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead2582_4(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call2582_5(java.util.List a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead2582_6(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead2582_7(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call2582_8(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1258200_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call1258201_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_d238a58011a93ad6aad1(int[][] a0) throws E;
private static final class __SourceHandler_d238a58011a93ad6aad1 {

public static java.lang.String f521(int[][] p0) throws Throwable {
    java.lang.StringBuilder lexicalValue521_30_0;
    java.lang.StringBuilder lexicalValue521_33_0;
    java.lang.Object lexicalValue521_33_1;
    java.lang.StringBuilder spill521_0;
    java.lang.StringBuilder life1_3;
    int[][] life2_5;
    int life3_8;
    int life4_10;
    int[] life5_17;
    lexical_join_37: {
    life1_3 = new java.lang.StringBuilder();
    life2_5 = p0;
    life3_8 = (life2_5).length;
    life4_10 = 0;
    lexical_cycle_11: while (true) {
    lexical_join_33: {
    lexical_join_30: {
    lexical_join_25: {
    if (!((life4_10 < life3_8))) {
        break lexical_join_37;
    }
    life5_17 = (life2_5)[life4_10];
    if (!((__call521_0(life1_3) > 0))) {
        break lexical_join_25;
    }
    __call521_1(life1_3, ", ");
    }
    spill521_0 = life1_3;
    if (!((life5_17 == null))) {
        lexicalValue521_30_0 = spill521_0;
        break lexical_join_30;
    }
    lexicalValue521_33_0 = spill521_0;
    lexicalValue521_33_1 = "null";
    break lexical_join_33;
    }
    lexicalValue521_33_0 = lexicalValue521_30_0;
    lexicalValue521_33_1 = __call521_2((life5_17).length);
    }
    __call521_3(lexicalValue521_33_0, lexicalValue521_33_1);
    life4_10 += 1;
    continue lexical_cycle_11;
    }
    }
    return __call521_4(life1_3);
}
public static java.lang.String h521_0(java.lang.Exception p0) throws Throwable {
    throw __call2052100_0(p0);
}
public static java.lang.String h521_1(java.lang.Exception p0) throws Throwable {
    throw __call2052101_0(p0);
}
private static native int __call521_0(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.StringBuilder __call521_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __call521_2(int a0) throws Throwable;
private static native java.lang.StringBuilder __call521_3(java.lang.StringBuilder a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String __call521_4(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Throwable __call2052100_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2052101_0(java.lang.Exception a0) throws Throwable;

}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1839_12(this.a, ((java.util.List)(this.b)).size(), this.e, this.f, this.g, this.i, this.h, this.j, this.k, this.l, this.m);
}


public float b(double p0) {
float local3 = (this.m - this.l);
    return (this.l + (local3 * (((float) p0) / 0x1.0p4f)));
}


private void b__Void() { __sourceHandlerCall_02cf59d2b4fdb747c114(this); }


public float b__Float(float p0) {
p0 = (p0 - this.t);
    float local2 = (((float) this.v) / ((float) this.i));
    p0 = (p0 * local2);
    return p0;
}


public float b() {
return this.k;
}


public boolean b(moom.oR p0, moom.DD p1) {
return ((1) != 0);
}


public boolean b__Boolean() {
return ((((this.G) ? 1 : 0)) != 0);
}


public double b(float p0) {
float local2 = (this.m - this.l);
    return ((double) (((p0 - this.l) / local2) * 0x1.0p4f));
}


public void b(int p0) {
try {
        this.i = ((int)(p0));
        if ((this.x != null)) {
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.x)).b(((int)(this.i)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public int b__Int() {
return this.g;
}


public static void b(java.lang.String p0) {
q = ((java.lang.String)(p0));
    return;
}


public int e() {
return ((java.util.List)(this.b)).size();
}


public void e__Void() {
try {
        if ((this.w < 0)) {
        this.w = ((int)(moom.ol.a()));
        moom.ol.a(((int)(this.w)), ((int)(this.z)), ((int)(this.h)), ((int)(this.i)));
        moom.Oc.c();
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    moom.Oc.a__Void(((int)(this.w)));
    return;
}


public void e(int p0) {
this.r = ((int)(p0));
    return;
}


public int c__Int() {
return this.h;
}


public void c(int p0) { __sourceHandlerCall_ca967c4cfbfd191c1653(this, p0); }


public float c() {
return this.l;
}


public void c__Void() {
try {
        ((java.util.List)(this.b)).clear();
        if ((this.x != null)) {
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.x)).c__Void();
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public void f(int p0) {
try {
        this.F = ((int)(p0));
        if ((this.A != null)) {
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.A)).f(((int)(p0)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    try {
        if ((this.B != null)) {
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.B)).f(((int)(p0)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_1) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_1)));
    }
    return;
}


public int f() {
return this.r;
}


public void f__Void() {
try {
        if ((this.w >= 0)) {
        moom.ol.a__Void(((int)(this.w)));
        this.w = ((int)(-1));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


private void d(int p0) { __sourceHandlerCall_5d570ccc2e8bf4e26f41(this, p0); }


private void d__Void() {
try {
        this.d = ((net.minecraft.client.resources.data.AnimationMetadataSection)(null));
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this)).a(((java.util.List)(com.google.common.collect.Lists.newArrayList())));
        this.n = ((int)(0));
        this.o = ((int)(0));
        if ((this.x != null)) {
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.x)).d__Void();
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public int d__Int() {
return this.i;
}


public float d() {
return this.m;
}


public void a(net.minecraft.client.resources.data.AnimationMetadataSection p0) {
this.d = ((net.minecraft.client.resources.data.AnimationMetadataSection)(p0));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10820_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/oh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.client.resources.data.AnimationMetadataSection a__o_() {
return this.d;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public float a__Float(float p0) {
p0 = (p0 - this.s);
    float local2 = (((float) this.u) / ((float) this.h));
    p0 = (p0 * local2);
    return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3115;
      if (M[var3] == null) {
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
         long var5 = L[var3];
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
         Object[] var9 = (Object[])N.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               N.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/oh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         M[var3] = var15;
      }

      return M[var3];
}


public java.util.List<int[][]> a__List() {
return new java.util.ArrayList(this.b);
}


public double a(float p0) {
float local2 = (this.k - this.j);
    return ((double) (((p0 - this.j) / local2) * 0x1.0p4f));
}


private void a(int[] p0) {
long life2_3;
    long life4_7;
    long life6_9;
    long life8_11;
    long life10_13;
    int[] life12_15;
    int life13_18;
    int life14_20;
    int life15_27;
    int life16_41;
    int life17_62;
    int life18_76;
    int life19_84;
    int life12_114;
    int life13_119;
    int life14_124;
    int life15_142;
    int life16_144;
    int life17_152;
    int life18_166;
    life2_3 = (net.minecraft.client.renderer.texture.TextureAtlasSprite.K ^ 124402025661905L);
    if ((p0 != null)) {
        life4_7 = 0L;
        life6_9 = 0L;
        life8_11 = 0L;
        life10_13 = 0L;
        life12_15 = p0;
        life13_18 = (life12_15).length;
        life14_20 = 0;
        loop_region_21: while ((life14_20 < life13_18)) {
        life15_27 = (life12_15)[life14_20];
        life16_41 = ((life15_27 >> __sourceIntrinsic_261eb4ae503f_invokedynamic2653_1(5808, (4144044627703520698L ^ life2_3))) & __sourceIntrinsic_261eb4ae503f_invokedynamic2653_2(18102, (2160547611908312509L ^ life2_3)));
        if ((life16_41 >= __sourceIntrinsic_261eb4ae503f_invokedynamic2653_3(26613, (5170034100674440434L ^ life2_3)))) {
        life17_62 = ((life15_27 >> __sourceIntrinsic_261eb4ae503f_invokedynamic2653_4(26613, (5170034100674440434L ^ life2_3))) & __sourceIntrinsic_261eb4ae503f_invokedynamic2653_5(18102, (2160547611908312509L ^ life2_3)));
        life18_76 = ((life15_27 >> __sourceIntrinsic_261eb4ae503f_invokedynamic2653_6(32259, (3739455274435982606L ^ life2_3))) & __sourceIntrinsic_261eb4ae503f_invokedynamic2653_7(18102, (2160547611908312509L ^ life2_3)));
        life19_84 = (life15_27 & __sourceIntrinsic_261eb4ae503f_invokedynamic2653_8(18102, (2160547611908312509L ^ life2_3)));
        life4_7 = (life4_7 + ((long) life17_62));
        life6_9 = (life6_9 + ((long) life18_76));
        life8_11 = (life8_11 + ((long) life19_84));
        life10_13 = (life10_13 + 1L);
    }
        life14_20 += 1;
    }
        if ((life10_13 > 0L)) {
        life12_114 = ((int) (life4_7 / life10_13));
        life13_119 = ((int) (life6_9 / life10_13));
        life14_124 = ((int) (life8_11 / life10_13));
        life15_142 = (((life12_114 << __sourceIntrinsic_261eb4ae503f_invokedynamic2653_9(26613, (5170034100674440434L ^ life2_3))) | (life13_119 << __sourceIntrinsic_261eb4ae503f_invokedynamic2653_10(32259, (3739455274435982606L ^ life2_3)))) | life14_124);
        life16_144 = 0;
        loop_region_145: while ((life16_144 < (p0).length)) {
        life17_152 = (p0)[life16_144];
        life18_166 = ((life17_152 >> __sourceIntrinsic_261eb4ae503f_invokedynamic2653_11(25599, (1770897345656629488L ^ life2_3))) & __sourceIntrinsic_261eb4ae503f_invokedynamic2653_12(18102, (2160547611908312509L ^ life2_3)));
        try {
        if ((life18_166 <= __sourceIntrinsic_261eb4ae503f_invokedynamic2653_13(26613, (5170034100674440434L ^ life2_3)))) {
        (p0)[life16_144] = life15_142;
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
        life16_144 += 1;
    }
    }
    }
    return;
}


public float a() {
return this.j;
}


public float a(double p0) {
float local3 = (this.k - this.j);
    return (this.j + ((local3 * ((float) p0)) / 0x1.0p4f));
}


protected static net.minecraft.client.renderer.texture.TextureAtlasSprite a(moom.DD p0) { return __sourceHandlerCall_df8b2854543eccf8c0cc(p0); }


public void a__Void() { __sourceHandlerCall_3d4b5be2b20c027c1b51(this); }


public int[][] a__ArrayArrayInt(int p0) {
return ((int[][])(((java.util.List)(this.b)).get(((int)(p0)))));
}


public static void a(java.lang.String p0) {
p = ((java.lang.String)(p0));
    return;
}


public void a(int p0, int p1, int p2, int p3, boolean p4) {
float life6_14;
    float life7_20;
    this.f = ((int)(p2));
    this.g = ((int)(p3));
    this.e = ((boolean)(p4));
    life6_14 = ((float) (0x1.47ae14p-7d / ((double) p0)));
    life7_20 = ((float) (0x1.47ae14p-7d / ((double) p1)));
    try {
        this.j = ((float)(((((float) p2) / ((float) ((double) p0))) + life6_14)));
        this.k = ((float)(((((float) (p2 + this.h)) / ((float) ((double) p0))) - life6_14)));
        this.l = ((float)(((((float) p3) / ((float) p1)) + life7_20)));
        this.m = ((float)(((((float) (p3 + this.i)) / ((float) p1)) - life7_20)));
        this.s = ((float)(java.lang.Math.min(((float)(this.j)), ((float)(this.k)))));
        this.t = ((float)(java.lang.Math.min(((float)(this.l)), ((float)(this.m)))));
        if ((this.x != null)) {
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.x)).a(((int)(this.h)), ((int)(this.i)), ((int)(0)), ((int)(0)), ((boolean)(false)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    try {
        if ((this.A != null)) {
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.A)).a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_1) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_1)));
    }
    try {
        if ((this.B != null)) {
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.B)).a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_2) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_2)));
    }
    return;
}


public void a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) {
try {
        this.f = ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).f));
        this.g = ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).g));
        this.h = ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).h));
        this.i = ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).i));
        this.e = ((boolean)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).e));
        this.j = ((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).j));
        this.k = ((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).k));
        this.l = ((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).l));
        this.m = ((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).m));
        if ((p0 != ((net.minecraft.client.renderer.texture.TextureMap)(moom.BU.a__n8())).a__oh())) {
        this.r = ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).r));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    try {
        this.s = ((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).s));
        this.t = ((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).t));
        this.u = ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).u));
        this.v = ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).v));
        this.w = ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).w));
        this.z = ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).z));
        if ((this.x != null)) {
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.x)).a(((int)(this.h)), ((int)(this.i)), ((int)(0)), ((int)(0)), ((boolean)(false)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_1) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_1)));
    }
    this.F = ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).F));
    return;
}


public int a__Int() {
return this.f;
}


public java.lang.String a__String() {
return this.a;
}


public void a(moom.NK p0) {
try {
        if ((this.r < 0)) {
        this.r = ((int)(((moom.NK)(p0)).a()));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public void a(java.util.List<int[][]> p0) {
try {
        this.b = ((java.util.List)(p0));
        if ((this.x != null)) {
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.x)).a(((java.util.List)(p0)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public boolean a(moom.oR p0, moom.DD p1) {
return ((0) != 0);
}


public void a(int p0) {
try {
        this.h = ((int)(p0));
        if ((this.x != null)) {
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.x)).a(((int)(this.h)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public void a(java.awt.image.BufferedImage[] p0, net.minecraft.client.resources.data.AnimationMetadataSection p1) throws java.io.IOException { __sourceHandlerCall_dda0d309720f567181d4(this, p0, p1); }


private static int[][] a(int[][] p0, int p1, int p2, int p3) {
int[][] life4_3;
    int life5_5;
    int[] life6_13;
    life4_3 = new int[(p0).length][];
    life5_5 = 0;
    loop_region_6: while ((life5_5 < (p0).length)) {
        life6_13 = (p0)[life5_5];
        try {
        if ((life6_13 != null)) {
        (life4_3)[life5_5] = new int[((p1 >> life5_5) * (p2 >> life5_5))];
        java.lang.System.arraycopy(((java.lang.Object)(life6_13)), ((int)((p3 * ((life4_3)[life5_5]).length))), ((java.lang.Object)((life4_3)[life5_5])), ((int)(0)), ((int)(((life4_3)[life5_5]).length)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
        life5_5 += 1;
    }
    return life4_3;
}


public boolean a__Boolean() { return __sourceHandlerCall_62a21abffb783bcc7d8d(this); }


public int g() {
return this.F;
}


private void g__Void() {
java.lang.String life1_5;
    moom.DD life2_10;
    moom.DD life2_14;
    java.lang.String life1_45;
    moom.DD life2_50;
    moom.DD life2_54;
    if (moom.MP.dL) {
        life1_5 = __sourceIntrinsic_736a66cda11e_invokedynamic2667_2(this.a);
        life2_10 = new moom.DD(life1_5);
        life2_14 = ((net.minecraft.client.renderer.texture.TextureMap)(moom.BU.a__n8())).a(((moom.DD)(life2_10)));
        try {
        if (moom.BU.a__Boolean(((moom.DD)(life2_14)))) {
        this.A = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(new net.minecraft.client.renderer.texture.TextureAtlasSprite(life1_5)));
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.A)).C = ((boolean)(true));
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.A)).a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this)));
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.A)).c(((int)(this.z)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    }
    if (moom.MP.dM) {
        life1_45 = __sourceIntrinsic_736a66cda11e_invokedynamic2667_17(this.a);
        life2_50 = new moom.DD(life1_45);
        life2_54 = ((net.minecraft.client.renderer.texture.TextureMap)(moom.BU.a__n8())).a(((moom.DD)(life2_50)));
        try {
        if (moom.BU.a__Boolean(((moom.DD)(life2_54)))) {
        this.B = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(new net.minecraft.client.renderer.texture.TextureAtlasSprite(life1_45)));
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.B)).C = ((boolean)(true));
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.B)).a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this)));
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.B)).c(((int)(this.z)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_1) {
        throw net.minecraft.client.renderer.texture.TextureAtlasSprite.a(((java.lang.Throwable)(caught_rethrow_1)));
    }
    }
    return;
}


private static java.lang.String lambda$generateMipmaps$0(int[][] p0) throws java.lang.Exception { return __sourceHandlerCall_d238a58011a93ad6aad1(p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5ca107de5868_originalDynamicSite3770_18(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10820_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_261eb4ae503f_invokedynamic2653_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_736a66cda11e_invokedynamic2667_2(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_736a66cda11e_invokedynamic2667_17(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1839_12(java.lang.String a0, int a1, boolean a2, int a3, int a4, int a5, int a6, float a7, float a8, float a9, float a10) throws E;
}
