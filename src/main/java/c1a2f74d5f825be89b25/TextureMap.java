package net.minecraft.client.renderer.texture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class TextureMap extends moom.n2 implements net.minecraft.client.renderer.texture.ITickableTextureObject {

private static boolean h;

private static org.apache.logging.log4j.Logger i;

public static moom.DD j;

public static moom.DD k;

private java.util.List<net.minecraft.client.renderer.texture.TextureAtlasSprite> l;

private java.util.Map<java.lang.String, net.minecraft.client.renderer.texture.TextureAtlasSprite> m;

private java.util.Map<java.lang.String, net.minecraft.client.renderer.texture.TextureAtlasSprite> n;

private java.lang.String o;

private net.minecraft.client.renderer.texture.IIconCreator p;

private int q;

private net.minecraft.client.renderer.texture.TextureAtlasSprite r;

private boolean s;

private net.minecraft.client.renderer.texture.TextureAtlasSprite[] t;

private int u;

private int v;

private int w;

private double x;

private double y;

private moom.NK z;

public int A;

public int B;

private int C;

private int D;

private static long F;

private static long[] J;

private static java.lang.Integer[] K;

private static java.util.Map L;

public TextureMap(java.lang.String p0, net.minecraft.client.renderer.texture.IIconCreator p1, boolean p2) { super(); __sourceHandlerCall_2451bb48713fb95bab6f(this, p0, p1, p2); }


public TextureMap(java.lang.String p0, net.minecraft.client.renderer.texture.IIconCreator p1) {
this(((java.lang.String)(p0)), ((net.minecraft.client.renderer.texture.IIconCreator)(p1)), ((boolean)(false)));
    return;
}


public TextureMap(java.lang.String p0, boolean p1) {
this(((java.lang.String)(p0)), ((net.minecraft.client.renderer.texture.IIconCreator)(null)), ((boolean)(p1)));
    return;
}


public TextureMap(java.lang.String p0) {
this(((java.lang.String)(p0)), ((net.minecraft.client.renderer.texture.IIconCreator)(null)));
    return;
}


static {
F = ((long)(((moom._a)(moom._c.a(((long)(5216021786492588603L)), ((long)(2980142306635880656L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(94360331009720L)))));
    L = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.renderer.texture.TextureMap.F ^ 22724502360401L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1822_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1822_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1822_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1822_14 = new byte[8];
    (__sourceSpill1822_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1822_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1822_16 = __sourceSpill1822_14;
    ((javax.crypto.Cipher)(__sourceSpill1822_11)).init(((int)(__sourceSpill1822_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1822_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1822_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "J×^é\036õ|@ú\017Û{E»\037\006³'ñN¼nW\035Mì­»×Ò\003"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1822_25 = local6_life21;
        int __sourceSpill1822_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1822_25)).substring(((int)(__sourceSpill1822_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1822_30 = local8_life19;
        int __sourceSpill1822_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1822_33 = new byte[8];
        (__sourceSpill1822_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1822_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1822_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1822_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1822_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1822_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1822_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1822_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1822_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1822_34)).doFinal(((byte[])(__sourceSpill1822_33)));
        (__sourceSpill1822_30)[__sourceSpill1822_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "»L­n\002r\023]b©üdôÓ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1822_38 = local6_life21;
        int __sourceSpill1822_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1822_38)).substring(((int)(__sourceSpill1822_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1822_43 = local8_life19;
        int __sourceSpill1822_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1822_46 = new byte[8];
        (__sourceSpill1822_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1822_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1822_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1822_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1822_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1822_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1822_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1822_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1822_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1822_47)).doFinal(((byte[])(__sourceSpill1822_46)));
        (__sourceSpill1822_43)[__sourceSpill1822_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    J = ((long[])(local8_life19));
    K = ((java.lang.Integer[])(new java.lang.Integer[7]));
    h = ((boolean)(java.lang.Boolean.parseBoolean(((java.lang.String)(java.lang.System.getProperty(((java.lang.String)("fml.skipFirstTextureLoad")), ((java.lang.String)("true"))))))));
    i = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    j = ((moom.DD)(new moom.DD("missingno")));
    k = ((moom.DD)(new moom.DD("textures/atlas/blocks.png")));
}

private static native <E extends Throwable> void __sourceHandlerCall_2451bb48713fb95bab6f(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1, net.minecraft.client.renderer.texture.IIconCreator a2, boolean a3) throws E;
private static final class __SourceHandler_2451bb48713fb95bab6f {

public static void f547(net.minecraft.client.renderer.texture.TextureMap receiver, java.lang.String p0, net.minecraft.client.renderer.texture.IIconCreator p1, boolean p2) throws Throwable {
    net.minecraft.client.renderer.texture.TextureMap forwardValue547_63_0;
    net.minecraft.client.renderer.texture.TextureMap forwardValue547_64_0;
    int forwardValue547_64_1;
    net.minecraft.client.renderer.texture.TextureMap spill547_0;
    forward_join_64: {
    forward_join_63: {
    __directSuperInit547_0(receiver);
    __fieldWrite547_1(receiver, 0);
    __fieldWrite547_2(receiver, null);
    __fieldWrite547_3(receiver, -1);
    __fieldWrite547_4(receiver, -1);
    __fieldWrite547_5(receiver, -1);
    __fieldWrite547_6(receiver, -0x1.0p0d);
    __fieldWrite547_7(receiver, -0x1.0p0d);
    __fieldWrite547_8(receiver, new moom.NK(0));
    __fieldWrite547_9(receiver, 0);
    __fieldWrite547_10(receiver, 0);
    __fieldWrite547_12(receiver, __call547_11());
    __fieldWrite547_14(receiver, __call547_13());
    __fieldWrite547_16(receiver, __call547_15());
    __fieldWrite547_17(receiver, new net.minecraft.client.renderer.texture.TextureAtlasSprite("missingno"));
    __fieldWrite547_18(receiver, p0);
    __fieldWrite547_19(receiver, p1);
    spill547_0 = receiver;
    if (!(p2)) {
        forwardValue547_63_0 = spill547_0;
        break forward_join_63;
    }
    if (!(__fieldRead547_20())) {
        forwardValue547_63_0 = spill547_0;
        break forward_join_63;
    }
    forwardValue547_64_0 = spill547_0;
    forwardValue547_64_1 = 1;
    break forward_join_64;
    }
    forwardValue547_64_0 = forwardValue547_63_0;
    forwardValue547_64_1 = 0;
    }
    __fieldWrite547_21(forwardValue547_64_0, forwardValue547_64_1);
    return;
}
public static void h547_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3054700_0(p0);
}
private static native void __directSuperInit547_0(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite547_1(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __fieldWrite547_2(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite547_3(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __fieldWrite547_4(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __fieldWrite547_5(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __fieldWrite547_6(net.minecraft.client.renderer.texture.TextureMap a0, double a1) throws Throwable;
private static native void __fieldWrite547_7(net.minecraft.client.renderer.texture.TextureMap a0, double a1) throws Throwable;
private static native void __fieldWrite547_8(net.minecraft.client.renderer.texture.TextureMap a0, moom.NK a1) throws Throwable;
private static native void __fieldWrite547_9(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __fieldWrite547_10(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native java.util.ArrayList __call547_11() throws Throwable;
private static native void __fieldWrite547_12(net.minecraft.client.renderer.texture.TextureMap a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.HashMap __call547_13() throws Throwable;
private static native void __fieldWrite547_14(net.minecraft.client.renderer.texture.TextureMap a0, java.util.HashMap a1) throws Throwable;
private static native java.util.HashMap __call547_15() throws Throwable;
private static native void __fieldWrite547_16(net.minecraft.client.renderer.texture.TextureMap a0, java.util.HashMap a1) throws Throwable;
private static native void __fieldWrite547_17(net.minecraft.client.renderer.texture.TextureMap a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native void __fieldWrite547_18(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite547_19(net.minecraft.client.renderer.texture.TextureMap a0, net.minecraft.client.renderer.texture.IIconCreator a1) throws Throwable;
private static native boolean __fieldRead547_20() throws Throwable;
private static native void __fieldWrite547_21(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native java.lang.Exception __call3054700_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceHandlerCall_4b9bbd2d12e788fb2787(net.minecraft.client.renderer.texture.TextureMap a0, double a1, double a2) throws E;
private static final class __SourceHandler_4b9bbd2d12e788fb2787 {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f1420(net.minecraft.client.renderer.texture.TextureMap receiver, double p0, double p1) throws Throwable {
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue1420_37_0;
    int life5_12;
    int life6_18;
    int life7_25;
    forward_join_37: {
    forward_join_36: {
    forward_join_5: {
    if (!((__fieldRead1420_0(receiver) == null))) {
        break forward_join_5;
    }
    return null;
    }
    life5_12 = ((int) (p0 / __fieldRead1420_1(receiver)));
    life6_18 = ((int) (p1 / __fieldRead1420_2(receiver)));
    life7_25 = ((life6_18 * __fieldRead1420_3(receiver)) + life5_12);
    if (!((life7_25 >= 0))) {
        break forward_join_36;
    }
    if (!((life7_25 <= (__fieldRead1420_4(receiver)).length))) {
        break forward_join_36;
    }
    forwardValue1420_37_0 = (__fieldRead1420_5(receiver))[life7_25];
    break forward_join_37;
    }
    forwardValue1420_37_0 = null;
    }
    return forwardValue1420_37_0;
}
public static void h1420_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142000_0(p0);
}
public static void h1420_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142001_0(p0);
}
public static void h1420_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142002_0(p0);
}
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead1420_0(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native double __fieldRead1420_1(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native double __fieldRead1420_2(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead1420_3(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead1420_4(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead1420_5(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Exception __call1142000_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1142001_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1142002_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_60c152032c6046af7eb8(net.minecraft.client.renderer.texture.TextureMap a0, int a1, int a2) throws E;
private static final class __SourceHandler_60c152032c6046af7eb8 {

public static void f619(net.minecraft.client.renderer.texture.TextureMap receiver, int p0, int p1) throws Throwable {
    java.util.Iterator life3_50;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life4_57;
    double life5_62;
    double life7_67;
    double life9_76;
    double life11_85;
    double life13_94;
    double life15_103;
    int life17_109;
    int life18_115;
    int life19_121;
    int life20_127;
    int life21_129;
    int life22_142;
    int life23_160;
    forest_join_179: {
    __fieldWrite619_0(receiver, -1);
    __fieldWrite619_1(receiver, -1);
    __fieldWrite619_2(receiver, null);
    if (!((__fieldRead619_3(receiver) > 0))) {
        break forest_join_179;
    }
    __fieldWrite619_5(receiver, (p0 / __fieldRead619_4(receiver)));
    __fieldWrite619_7(receiver, (p1 / __fieldRead619_6(receiver)));
    __fieldWrite619_10(receiver, new net.minecraft.client.renderer.texture.TextureAtlasSprite[(__fieldRead619_8(receiver) * __fieldRead619_9(receiver))]);
    __fieldWrite619_12(receiver, (0x1.0p0d / ((double) __fieldRead619_11(receiver))));
    __fieldWrite619_14(receiver, (0x1.0p0d / ((double) __fieldRead619_13(receiver))));
    life3_50 = __call619_17(__call619_16(__fieldRead619_15(receiver)));
    forest_cycle_51: while (true) {
    forest_join_178: {
    if (!(__call619_18(life3_50))) {
        break forest_join_179;
    }
    life4_57 = __cast619_20(__call619_19(life3_50));
    life5_62 = (0x1.0p-1d / ((double) p0));
    life7_67 = (0x1.0p-1d / ((double) p1));
    life9_76 = (((double) __call619_23(__call619_21(life4_57), __call619_22(life4_57))) + life5_62);
    life11_85 = (((double) __call619_26(__call619_24(life4_57), __call619_25(life4_57))) + life7_67);
    life13_94 = (((double) __call619_29(__call619_27(life4_57), __call619_28(life4_57))) - life5_62);
    life15_103 = (((double) __call619_32(__call619_30(life4_57), __call619_31(life4_57))) - life7_67);
    life17_109 = ((int) (life9_76 / __fieldRead619_33(receiver)));
    life18_115 = ((int) (life11_85 / __fieldRead619_34(receiver)));
    life19_121 = ((int) (life13_94 / __fieldRead619_35(receiver)));
    life20_127 = ((int) (life15_103 / __fieldRead619_36(receiver)));
    life21_129 = life17_109;
    forest_cycle_130: while (true) {
    forest_join_176: {
    forest_join_171: {
    forest_join_170: {
    if (!((life21_129 <= life19_121))) {
        break forest_join_178;
    }
    if (!((life21_129 >= 0))) {
        break forest_join_171;
    }
    if (!((life21_129 < __fieldRead619_37(receiver)))) {
        break forest_join_171;
    }
    life22_142 = life18_115;
    forest_cycle_141: while (true) {
    forest_join_168: {
    forest_join_163: {
    if (!((life22_142 <= life20_127))) {
        break forest_join_170;
    }
    if (!((life22_142 >= 0))) {
        break forest_join_163;
    }
    if (!((life22_142 < __fieldRead619_38(receiver)))) {
        break forest_join_163;
    }
    life23_160 = ((life22_142 * __fieldRead619_39(receiver)) + life21_129);
    (__fieldRead619_40(receiver))[life23_160] = life4_57;
    break forest_join_168;
    }
    __call619_43(__invokedynamic619_42(life22_142, __call619_41(life4_57)));
    }
    life22_142 += 1;
    continue forest_cycle_141;
    }
    }
    break forest_join_176;
    }
    __call619_46(__invokedynamic619_45(life21_129, __call619_44(life4_57)));
    }
    life21_129 += 1;
    continue forest_cycle_130;
    }
    }
    continue forest_cycle_51;
    }
    }
    return;
}
public static void h619_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061900_0(p0);
}
public static void h619_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061901_0(p0);
}
public static void h619_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061902_0(p0);
}
public static void h619_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3061903_0(p0);
}
private static native void __fieldWrite619_0(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __fieldWrite619_1(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __fieldWrite619_2(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead619_3(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead619_4(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite619_5(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native int __fieldRead619_6(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite619_7(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native int __fieldRead619_8(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead619_9(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite619_10(net.minecraft.client.renderer.texture.TextureMap a0, net.minecraft.client.renderer.texture.TextureAtlasSprite[] a1) throws Throwable;
private static native int __fieldRead619_11(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite619_12(net.minecraft.client.renderer.texture.TextureMap a0, double a1) throws Throwable;
private static native int __fieldRead619_13(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite619_14(net.minecraft.client.renderer.texture.TextureMap a0, double a1) throws Throwable;
private static native java.util.Map __fieldRead619_15(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Collection __call619_16(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call619_17(java.util.Collection a0) throws Throwable;
private static native boolean __call619_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call619_19(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast619_20(java.lang.Object a0) throws Throwable;
private static native float __call619_21(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native float __call619_22(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native float __call619_23(float a0, float a1) throws Throwable;
private static native float __call619_24(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native float __call619_25(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native float __call619_26(float a0, float a1) throws Throwable;
private static native float __call619_27(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native float __call619_28(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native float __call619_29(float a0, float a1) throws Throwable;
private static native float __call619_30(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native float __call619_31(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native float __call619_32(float a0, float a1) throws Throwable;
private static native double __fieldRead619_33(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native double __fieldRead619_34(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native double __fieldRead619_35(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native double __fieldRead619_36(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead619_37(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead619_38(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead619_39(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead619_40(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __call619_41(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic619_42(int a0, java.lang.String a1) throws Throwable;
private static native void __call619_43(java.lang.String a0) throws Throwable;
private static native java.lang.String __call619_44(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic619_45(int a0, java.lang.String a1) throws Throwable;
private static native void __call619_46(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call3061900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3061901_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3061902_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3061903_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_5ecc17e77f5bf7d8e381(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1, net.minecraft.client.renderer.texture.TextureAtlasSprite a2) throws E;
private static final class __SourceHandler_5ecc17e77f5bf7d8e381 {

public static boolean f2587(net.minecraft.client.renderer.texture.TextureMap receiver, java.lang.String p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1) throws Throwable {
    if ((!__call2587_1(__fieldRead2587_0(receiver), p0))) {
        __call2587_3(__fieldRead2587_2(receiver), p0, p1);
        __call2587_5(p1, __fieldRead2587_4(receiver));
        return true;
    }
    return false;
}
public static void h2587_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1258700_0(p0);
}
private static native java.util.Map __fieldRead2587_0(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native boolean __call2587_1(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead2587_2(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Object __call2587_3(java.util.Map a0, java.lang.String a1, net.minecraft.client.renderer.texture.TextureAtlasSprite a2) throws Throwable;
private static native moom.NK __fieldRead2587_4(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call2587_5(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.NK a1) throws Throwable;
private static native java.lang.Exception __call1258700_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_7c895286d0dd214dd7d9(net.minecraft.client.renderer.texture.TextureMap a0, java.util.Map a1, moom.oR a2, int a3) throws E;
private static final class __SourceHandler_7c895286d0dd214dd7d9 {

public static int f900103(net.minecraft.client.renderer.texture.TextureMap receiver, java.util.Map p0, moom.oR p1, int p2) throws Throwable {
    long life4_3;
    java.util.HashMap life6_7;
    java.util.Iterator life7_11;
    java.util.Map.Entry life8_20;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life9_24;
    moom.DD life10_30;
    moom.DD life11_34;
    net.minecraft.client.resources.IResource life12_44;
    java.io.InputStream life13_50;
    java.awt.Dimension life14_57;
    int life15_65;
    int life16_68;
    int life17_89;
    int life7_103;
    java.util.Set life8_106;
    java.util.TreeSet life9_111;
    java.util.Iterator life11_114;
    int life12_124;
    int life10_131;
    int life11_142;
    int life12_144;
    int life10_154;
    java.util.Iterator life13_157;
    java.lang.Object life14_165;
    int life15_169;
    int life16_176;
    forest_join_180: {
    forest_join_178: {
    forest_join_126: {
    forest_join_93: {
    life4_3 = (__fieldRead900103_0() ^ 129179702204542L);
    life6_7 = new java.util.HashMap();
    life7_11 = __call900103_2(__call900103_1(p0));
    forest_cycle_12: while (true) {
    forest_join_92: {
    forest_join_76: {
    if (!(__call900103_3(life7_11))) {
        break forest_join_93;
    }
    life8_20 = __cast900103_5(__call900103_4(life7_11));
    life9_24 = __cast900103_7(__call900103_6(life8_20));
    life10_30 = new moom.DD(__call900103_8(life9_24));
    life11_34 = __call900103_9(receiver, life10_30);
    if (!((!__call900103_10(life9_24, p1, life10_30)))) {
        break forest_join_92;
    }
    life12_44 = __call900103_11(p1, life11_34);
    if (!((life12_44 != null))) {
        break forest_join_92;
    }
    life13_50 = __call900103_12(life12_44);
    if (!((life13_50 != null))) {
        break forest_join_92;
    }
    life14_57 = __call900103_13(life13_50, "png");
    __call900103_14(life13_50);
    if (!((life14_57 != null))) {
        break forest_join_92;
    }
    life15_65 = __fieldRead900103_15(life14_57);
    life16_68 = __call900103_16(life15_65);
    if (!((!__call900103_18(life6_7, __call900103_17(life16_68))))) {
        break forest_join_76;
    }
    __call900103_21(life6_7, __call900103_19(life16_68), __call900103_20(1));
    break forest_join_92;
    }
    life17_89 = __call900103_25(__cast900103_24(__call900103_23(life6_7, __call900103_22(life16_68))));
    __call900103_28(life6_7, __call900103_26(life16_68), __call900103_27((life17_89 + 1)));
    }
    continue forest_cycle_12;
    }
    }
    life7_103 = 0;
    life8_106 = __call900103_29(life6_7);
    life9_111 = new java.util.TreeSet(life8_106);
    life11_114 = __call900103_30(life9_111);
    forest_cycle_106: while (true) {
    if (!(__call900103_31(life11_114))) {
        break forest_join_126;
    }
    life12_124 = __call900103_34(__cast900103_33(__call900103_32(life11_114)));
    life10_131 = __call900103_38(__cast900103_37(__call900103_36(life6_7, __call900103_35(life12_124))));
    life7_103 = (life7_103 + life10_131);
    continue forest_cycle_106;
    }
    }
    life11_142 = __invokedynamic900103_39(27998, (2056121766738390111L ^ life4_3));
    life12_144 = 0;
    life10_154 = ((life7_103 * p2) / __invokedynamic900103_40(31552, (4336140005844384327L ^ life4_3)));
    life13_157 = __call900103_41(life9_111);
    forest_cycle_147: while (true) {
    forest_join_177: {
    forest_join_173: {
    if (!(__call900103_42(life13_157))) {
        break forest_join_180;
    }
    life14_165 = __call900103_43(life13_157);
    life15_169 = __call900103_45(__cast900103_44(life14_165));
    life16_176 = __call900103_49(__cast900103_48(__call900103_47(life6_7, __call900103_46(life15_169))));
    life12_144 = (life12_144 + life16_176);
    if (!((life15_169 > life11_142))) {
        break forest_join_173;
    }
    life11_142 = life15_169;
    }
    if (!((life12_144 > life10_154))) {
        break forest_join_177;
    }
    break forest_join_178;
    }
    continue forest_cycle_147;
    }
    }
    return life11_142;
    }
    return life11_142;
}
public static int h900103_0(java.lang.Exception p0) throws Throwable {
    throw __call93010300_0(p0);
}
public static int h900103_1(java.lang.Exception p0, net.minecraft.client.renderer.texture.TextureMap p1, moom.oR p2, int p3, long p4, java.util.HashMap p5, java.util.Iterator p6) throws Throwable {
    java.lang.Exception life12_2;
    java.util.Map.Entry life8_12;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life9_16;
    moom.DD life10_22;
    moom.DD life11_26;
    net.minecraft.client.resources.IResource life12_36;
    java.io.InputStream life13_42;
    java.awt.Dimension life14_49;
    int life15_57;
    int life16_60;
    int life17_81;
    int life7_94;
    java.util.Set life8_97;
    java.util.TreeSet life9_102;
    java.util.Iterator life11_105;
    int life12_115;
    int life10_122;
    int life11_133;
    int life12_135;
    int life10_145;
    java.util.Iterator life13_148;
    java.lang.Object life14_156;
    int life15_160;
    int life16_167;
    forest_join_170: {
    forest_join_168: {
    forest_join_116: {
    forest_join_83: {
    life12_2 = p0;
    forest_cycle_2: while (true) {
    forest_join_82: {
    forest_join_66: {
    if (!(__call93010301_0(p6))) {
        break forest_join_83;
    }
    life8_12 = __cast93010301_2(__call93010301_1(p6));
    life9_16 = __cast93010301_4(__call93010301_3(life8_12));
    life10_22 = new moom.DD(__call93010301_5(life9_16));
    life11_26 = __call93010301_6(p1, life10_22);
    if (!((!__call93010301_7(life9_16, p2, life10_22)))) {
        continue forest_cycle_2;
    }
    life12_36 = __call93010301_8(p2, life11_26);
    if (!((life12_36 != null))) {
        break forest_join_82;
    }
    life13_42 = __call93010301_9(life12_36);
    if (!((life13_42 != null))) {
        break forest_join_82;
    }
    life14_49 = __call93010301_10(life13_42, "png");
    __call93010301_11(life13_42);
    if (!((life14_49 != null))) {
        break forest_join_82;
    }
    life15_57 = __fieldRead93010301_12(life14_49);
    life16_60 = __call93010301_13(life15_57);
    if (!((!__call93010301_15(p5, __call93010301_14(life16_60))))) {
        break forest_join_66;
    }
    __call93010301_18(p5, __call93010301_16(life16_60), __call93010301_17(1));
    break forest_join_82;
    }
    life17_81 = __call93010301_22(__cast93010301_21(__call93010301_20(p5, __call93010301_19(life16_60))));
    __call93010301_25(p5, __call93010301_23(life16_60), __call93010301_24((life17_81 + 1)));
    }
    continue forest_cycle_2;
    }
    }
    life7_94 = 0;
    life8_97 = __call93010301_26(p5);
    life9_102 = new java.util.TreeSet(life8_97);
    life11_105 = __call93010301_27(life9_102);
    forest_cycle_96: while (true) {
    if (!(__call93010301_28(life11_105))) {
        break forest_join_116;
    }
    life12_115 = __call93010301_31(__cast93010301_30(__call93010301_29(life11_105)));
    life10_122 = __call93010301_35(__cast93010301_34(__call93010301_33(p5, __call93010301_32(life12_115))));
    life7_94 = (life7_94 + life10_122);
    continue forest_cycle_96;
    }
    }
    life11_133 = __invokedynamic93010301_36(27998, (2056121766738390111L ^ p4));
    life12_135 = 0;
    life10_145 = ((life7_94 * p3) / __invokedynamic93010301_37(31552, (4336140005844384327L ^ p4)));
    life13_148 = __call93010301_38(life9_102);
    forest_cycle_137: while (true) {
    forest_join_167: {
    forest_join_163: {
    if (!(__call93010301_39(life13_148))) {
        break forest_join_170;
    }
    life14_156 = __call93010301_40(life13_148);
    life15_160 = __call93010301_42(__cast93010301_41(life14_156));
    life16_167 = __call93010301_46(__cast93010301_45(__call93010301_44(p5, __call93010301_43(life15_160))));
    life12_135 = (life12_135 + life16_167);
    if (!((life15_160 > life11_133))) {
        break forest_join_163;
    }
    life11_133 = life15_160;
    }
    if (!((life12_135 > life10_145))) {
        break forest_join_167;
    }
    break forest_join_168;
    }
    continue forest_cycle_137;
    }
    }
    return life11_133;
    }
    return life11_133;
}
public static int h900103_2(java.lang.Exception p0) throws Throwable {
    throw __call93010302_0(p0);
}
private static native long __fieldRead900103_0() throws Throwable;
private static native java.util.Set __call900103_1(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call900103_2(java.util.Set a0) throws Throwable;
private static native boolean __call900103_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call900103_4(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast900103_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call900103_6(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast900103_7(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call900103_8(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native moom.DD __call900103_9(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native boolean __call900103_10(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.oR a1, moom.DD a2) throws Throwable;
private static native net.minecraft.client.resources.IResource __call900103_11(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call900103_12(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.Dimension __call900103_13(java.io.InputStream a0, java.lang.String a1) throws Throwable;
private static native void __call900103_14(java.io.InputStream a0) throws Throwable;
private static native int __fieldRead900103_15(java.awt.Dimension a0) throws Throwable;
private static native int __call900103_16(int a0) throws Throwable;
private static native java.lang.Integer __call900103_17(int a0) throws Throwable;
private static native boolean __call900103_18(java.util.HashMap a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.Integer __call900103_19(int a0) throws Throwable;
private static native java.lang.Integer __call900103_20(int a0) throws Throwable;
private static native java.lang.Object __call900103_21(java.util.HashMap a0, java.lang.Integer a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call900103_22(int a0) throws Throwable;
private static native java.lang.Object __call900103_23(java.util.HashMap a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.Integer __cast900103_24(java.lang.Object a0) throws Throwable;
private static native int __call900103_25(java.lang.Integer a0) throws Throwable;
private static native java.lang.Integer __call900103_26(int a0) throws Throwable;
private static native java.lang.Integer __call900103_27(int a0) throws Throwable;
private static native java.lang.Object __call900103_28(java.util.HashMap a0, java.lang.Integer a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Set __call900103_29(java.util.HashMap a0) throws Throwable;
private static native java.util.Iterator __call900103_30(java.util.TreeSet a0) throws Throwable;
private static native boolean __call900103_31(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call900103_32(java.util.Iterator a0) throws Throwable;
private static native java.lang.Integer __cast900103_33(java.lang.Object a0) throws Throwable;
private static native int __call900103_34(java.lang.Integer a0) throws Throwable;
private static native java.lang.Integer __call900103_35(int a0) throws Throwable;
private static native java.lang.Object __call900103_36(java.util.HashMap a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.Integer __cast900103_37(java.lang.Object a0) throws Throwable;
private static native int __call900103_38(java.lang.Integer a0) throws Throwable;
private static native int __invokedynamic900103_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic900103_40(int a0, long a1) throws Throwable;
private static native java.util.Iterator __call900103_41(java.util.TreeSet a0) throws Throwable;
private static native boolean __call900103_42(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call900103_43(java.util.Iterator a0) throws Throwable;
private static native java.lang.Integer __cast900103_44(java.lang.Object a0) throws Throwable;
private static native int __call900103_45(java.lang.Integer a0) throws Throwable;
private static native java.lang.Integer __call900103_46(int a0) throws Throwable;
private static native java.lang.Object __call900103_47(java.util.HashMap a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.Integer __cast900103_48(java.lang.Object a0) throws Throwable;
private static native int __call900103_49(java.lang.Integer a0) throws Throwable;
private static native java.lang.Exception __call93010300_0(java.lang.Exception a0) throws Throwable;
private static native boolean __call93010301_0(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call93010301_1(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast93010301_2(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call93010301_3(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast93010301_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call93010301_5(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native moom.DD __call93010301_6(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native boolean __call93010301_7(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.oR a1, moom.DD a2) throws Throwable;
private static native net.minecraft.client.resources.IResource __call93010301_8(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call93010301_9(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.Dimension __call93010301_10(java.io.InputStream a0, java.lang.String a1) throws Throwable;
private static native void __call93010301_11(java.io.InputStream a0) throws Throwable;
private static native int __fieldRead93010301_12(java.awt.Dimension a0) throws Throwable;
private static native int __call93010301_13(int a0) throws Throwable;
private static native java.lang.Integer __call93010301_14(int a0) throws Throwable;
private static native boolean __call93010301_15(java.util.HashMap a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.Integer __call93010301_16(int a0) throws Throwable;
private static native java.lang.Integer __call93010301_17(int a0) throws Throwable;
private static native java.lang.Object __call93010301_18(java.util.HashMap a0, java.lang.Integer a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call93010301_19(int a0) throws Throwable;
private static native java.lang.Object __call93010301_20(java.util.HashMap a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.Integer __cast93010301_21(java.lang.Object a0) throws Throwable;
private static native int __call93010301_22(java.lang.Integer a0) throws Throwable;
private static native java.lang.Integer __call93010301_23(int a0) throws Throwable;
private static native java.lang.Integer __call93010301_24(int a0) throws Throwable;
private static native java.lang.Object __call93010301_25(java.util.HashMap a0, java.lang.Integer a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Set __call93010301_26(java.util.HashMap a0) throws Throwable;
private static native java.util.Iterator __call93010301_27(java.util.TreeSet a0) throws Throwable;
private static native boolean __call93010301_28(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call93010301_29(java.util.Iterator a0) throws Throwable;
private static native java.lang.Integer __cast93010301_30(java.lang.Object a0) throws Throwable;
private static native int __call93010301_31(java.lang.Integer a0) throws Throwable;
private static native java.lang.Integer __call93010301_32(int a0) throws Throwable;
private static native java.lang.Object __call93010301_33(java.util.HashMap a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.Integer __cast93010301_34(java.lang.Object a0) throws Throwable;
private static native int __call93010301_35(java.lang.Integer a0) throws Throwable;
private static native int __invokedynamic93010301_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic93010301_37(int a0, long a1) throws Throwable;
private static native java.util.Iterator __call93010301_38(java.util.TreeSet a0) throws Throwable;
private static native boolean __call93010301_39(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call93010301_40(java.util.Iterator a0) throws Throwable;
private static native java.lang.Integer __cast93010301_41(java.lang.Object a0) throws Throwable;
private static native int __call93010301_42(java.lang.Integer a0) throws Throwable;
private static native java.lang.Integer __call93010301_43(int a0) throws Throwable;
private static native java.lang.Object __call93010301_44(java.util.HashMap a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.Integer __cast93010301_45(java.lang.Object a0) throws Throwable;
private static native int __call93010301_46(java.lang.Integer a0) throws Throwable;
private static native java.lang.Exception __call93010302_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_f4ffaacc9d01905d1b88(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1, int a2) throws E;
private static final class __SourceHandler_f4ffaacc9d01905d1b88 {

public static moom.DD f2589(net.minecraft.client.renderer.texture.TextureMap receiver, moom.DD p0, int p1) throws Throwable {
    return (__call2589_0(receiver, p0) ? new moom.DD(__call2589_1(p0), __invokedynamic2589_3(__call2589_2(p0))) : ((p1 == 0) ? new moom.DD(__call2589_4(p0), __call2589_7("%s/%s%s", new java.lang.Object[] {__fieldRead2589_5(receiver), __call2589_6(p0), ".png"})) : new moom.DD(__call2589_8(p0), __call2589_12("%s/mipmaps/%s.%d%s", new java.lang.Object[] {__fieldRead2589_9(receiver), __call2589_10(p0), __call2589_11(p1), ".png"}))));
}
public static void h2589_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1258900_0(p0);
}
public static void h2589_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1258901_0(p0);
}
private static native boolean __call2589_0(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native java.lang.String __call2589_1(moom.DD a0) throws Throwable;
private static native java.lang.String __call2589_2(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic2589_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __call2589_4(moom.DD a0) throws Throwable;
private static native java.lang.String __fieldRead2589_5(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __call2589_6(moom.DD a0) throws Throwable;
private static native java.lang.String __call2589_7(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __call2589_8(moom.DD a0) throws Throwable;
private static native java.lang.String __fieldRead2589_9(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __call2589_10(moom.DD a0) throws Throwable;
private static native java.lang.Integer __call2589_11(int a0) throws Throwable;
private static native java.lang.String __call2589_12(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Exception __call1258900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1258901_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6bdc0bef716251f5a11c(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1, net.minecraft.client.renderer.texture.TextureAtlasSprite a2) throws E;
private static final class __SourceHandler_6bdc0bef716251f5a11c {

public static void f2590(net.minecraft.client.renderer.texture.TextureMap receiver, moom.DD p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1) throws Throwable {
    java.lang.String life3_1;
    moom.DD life4_21;
    moom.DD life5_25;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life6_32;
    life3_1 = __call2590_0();
    if ((life3_1 != null)) {
        if ((!__call2590_2(__call2590_1(p0), life3_1))) {
        life4_21 = new moom.DD(__call2590_3(p0), __invokedynamic2590_5(__call2590_4(p0), life3_1));
        life5_25 = __call2590_6(receiver, life4_21);
        if (__call2590_7(life5_25)) {
        life6_32 = __call2590_8(receiver, life4_21);
        __fieldWrite2590_9(life6_32, 1);
        __fieldWrite2590_10(p1, life6_32);
    }
    }
    }
    return;
}
public static void h2590_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1259000_0(p0);
}
private static native java.lang.String __call2590_0() throws Throwable;
private static native java.lang.String __call2590_1(moom.DD a0) throws Throwable;
private static native boolean __call2590_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2590_3(moom.DD a0) throws Throwable;
private static native java.lang.String __call2590_4(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic2590_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.DD __call2590_6(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native boolean __call2590_7(moom.DD a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call2590_8(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite2590_9(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite2590_10(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.lang.Exception __call1259000_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a2bddac479e954a5dd6e(net.minecraft.client.renderer.texture.TextureMap a0) throws E;
private static final class __SourceHandler_a2bddac479e954a5dd6e {

public static boolean f2591(net.minecraft.client.renderer.texture.TextureMap receiver) throws Throwable {
    int life1_1;
    int life2_4;
    life1_1 = __call2591_0();
    life2_4 = __call2591_1(receiver);
    return ((life1_1 == life2_4) ? true : false);
}
public static void h2591_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1259100_0(p0);
}
private static native int __call2591_0() throws Throwable;
private static native int __call2591_1(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Exception __call1259100_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_323ce2377b888c848c87(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1) throws E;
private static final class __SourceHandler_323ce2377b888c848c87 {

public static boolean f1422(net.minecraft.client.renderer.texture.TextureMap receiver, java.lang.String p0) throws Throwable {
    int forwardValue1422_14_0;
    java.lang.String life2_2;
    forward_join_14: {
    forward_join_13: {
    forward_join_11: {
    life2_2 = __call1422_0(p0);
    if (!((!__call1422_1(life2_2, "mcpatcher/")))) {
        break forward_join_11;
    }
    if (!(__call1422_2(life2_2, "optifine/"))) {
        break forward_join_13;
    }
    }
    forwardValue1422_14_0 = 1;
    break forward_join_14;
    }
    forwardValue1422_14_0 = 0;
    }
    return __integerCategory1422_3(forwardValue1422_14_0);
}
public static void h1422_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142200_0(p0);
}
public static void h1422_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142201_0(p0);
}
private static native java.lang.String __call1422_0(java.lang.String a0) throws Throwable;
private static native boolean __call1422_1(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call1422_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __integerCategory1422_3(int value) throws Throwable;
private static native java.lang.Exception __call1142200_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1142201_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceHandlerCall_03f57f458cd8ee35c802(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws E;
private static final class __SourceHandler_03f57f458cd8ee35c802 {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f2593(net.minecraft.client.renderer.texture.TextureMap receiver, moom.DD p0) throws Throwable {
    net.minecraft.client.renderer.texture.TextureAtlasSprite life2_15;
    if ((p0 == null)) {
        throw new java.lang.IllegalArgumentException("Location cannot be null!");
    }
    life2_15 = __cast2593_3(__call2593_2(__fieldRead2593_0(receiver), __call2593_1(p0)));
    if ((life2_15 == null)) {
        life2_15 = __call2593_4(p0);
        __call2593_7(__fieldRead2593_5(receiver), __call2593_6(p0), life2_15);
        __call2593_9(life2_15, __fieldRead2593_8(receiver));
        if (__call2593_10()) {
        __call2593_11(receiver, p0, life2_15);
    }
    }
    return life2_15;
}
public static void h2593_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1259300_0(p0);
}
public static void h2593_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1259301_0(p0);
}
private static native java.util.Map __fieldRead2593_0(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __call2593_1(moom.DD a0) throws Throwable;
private static native java.lang.Object __call2593_2(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast2593_3(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call2593_4(moom.DD a0) throws Throwable;
private static native java.util.Map __fieldRead2593_5(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __call2593_6(moom.DD a0) throws Throwable;
private static native java.lang.Object __call2593_7(java.util.Map a0, java.lang.String a1, net.minecraft.client.renderer.texture.TextureAtlasSprite a2) throws Throwable;
private static native moom.NK __fieldRead2593_8(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call2593_9(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.NK a1) throws Throwable;
private static native boolean __call2593_10() throws Throwable;
private static native void __call2593_11(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1, net.minecraft.client.renderer.texture.TextureAtlasSprite a2) throws Throwable;
private static native java.lang.Exception __call1259300_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1259301_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cb489224062be3442080(net.minecraft.client.renderer.texture.TextureMap a0, moom.oR a1) throws E;
private static final class __SourceHandler_cb489224062be3442080 {

public static void f100201(net.minecraft.client.renderer.texture.TextureMap receiver, moom.oR p0) throws Throwable {
    int forestValue100201_185_0;
    int spill100201_0;
    long spill100201_1;
    org.apache.logging.log4j.Logger spill100201_2;
    java.lang.String spill100201_3;
    java.lang.Object[] spill100201_4;
    java.lang.Object[] spill100201_5;
    java.lang.Object[] spill100201_6;
    java.lang.Object[] spill100201_7;
    java.lang.Object[] spill100201_8;
    org.apache.logging.log4j.Logger spill100201_9;
    java.lang.String spill100201_10;
    java.lang.Object[] spill100201_11;
    java.lang.Object[] spill100201_12;
    java.lang.Object[] spill100201_13;
    java.lang.Object[] spill100201_14;
    org.apache.logging.log4j.Logger spill100201_15;
    java.lang.String spill100201_16;
    java.lang.Object[] spill100201_17;
    java.lang.Object[] spill100201_18;
    java.lang.Object[] spill100201_19;
    long life2_3;
    java.util.Iterator life4_13;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life5_20;
    int life4_35;
    moom.oe life5_45;
    int life6_53;
    int life7_56;
    int life8_64;
    int life9_66;
    int life10_68;
    java.util.Iterator life11_73;
    java.util.Map.Entry life12_80;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life13_87;
    moom.DD life14_93;
    moom.DD life15_98;
    net.minecraft.client.resources.IResource life16_137;
    java.awt.image.BufferedImage[] life17_143;
    int life18_154;
    int life19_159;
    int life20_189;
    int life21_215;
    net.minecraft.client.resources.data.TextureMetadataSection life20_228;
    java.util.List life21_233;
    int life22_241;
    int life23_246;
    java.util.Iterator life22_258;
    int life23_266;
    moom.DD life24_285;
    net.minecraft.client.resources.data.AnimationMetadataSection life21_300;
    int life16_321;
    int life12_385;
    int life13_388;
    java.util.Iterator life14_431;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life15_438;
    java.util.HashMap life14_513;
    java.util.Iterator life15_517;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life16_524;
    java.lang.String life17_527;
    java.util.Iterator life15_591;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life16_598;
    int life15_613;
    int life16_616;
    java.util.Iterator life17_620;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life18_627;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life19_640;
    java.util.List life20_668;
    int life20_693;
    int life21_695;
    forest_join_726: {
    forest_join_696: {
    forest_join_692: {
    forest_join_586: {
    forest_join_570: {
    forest_join_494: {
    forest_join_485: {
    forest_join_435: {
    forest_join_414: {
    forest_join_381: {
    forest_join_370: {
    forest_join_365: {
    forest_join_360: {
    forest_join_355: {
    forest_join_24: {
    life2_3 = (__fieldRead100201_0() ^ 26266814381171L);
    __call100201_3(__invokedynamic100201_2(__call100201_1()));
    if (!(__call100201_4())) {
        break forest_join_24;
    }
    life4_13 = __call100201_7(__call100201_6(__fieldRead100201_5(receiver)));
    forest_cycle_14: while (true) {
    if (!(__call100201_8(life4_13))) {
        break forest_join_24;
    }
    life5_20 = __cast100201_10(__call100201_9(life4_13));
    __call100201_11(life5_20);
    continue forest_cycle_14;
    }
    }
    __call100201_12(receiver);
    spill100201_0 = 9070;
    __call100201_13(receiver);
    spill100201_1 = (8848203312104293991L ^ life2_3);
    __call100201_14(receiver);
    life4_35 = __call100201_15();
    life5_45 = new moom.oe(life4_35, life4_35, true, 0, __fieldRead100201_16(receiver));
    __call100201_18(__fieldRead100201_17(receiver));
    __call100201_20(__fieldRead100201_19(receiver));
    life6_53 = __invokedynamic100201_21(spill100201_0, spill100201_1);
    life7_56 = __call100201_22(receiver);
    __fieldWrite100201_23(receiver, life7_56);
    life8_64 = (1 << __fieldRead100201_24(receiver));
    life9_66 = 0;
    life10_68 = 0;
    life11_73 = __call100201_27(__call100201_26(__fieldRead100201_25(receiver)));
    forest_cycle_74: while (true) {
    forest_join_351: {
    forest_join_288: {
    forest_join_251: {
    forest_join_219: {
    forest_join_205: {
    forest_join_199: {
    forest_join_185: {
    forest_join_182: {
    forest_join_175: {
    forest_join_169: {
    forest_join_165: {
    forest_join_133: {
    forest_join_128: {
    if (!(__call100201_28(life11_73))) {
        break forest_join_360;
    }
    life12_80 = __cast100201_30(__call100201_29(life11_73));
    if (!((!__fieldRead100201_31(receiver)))) {
        break forest_join_360;
    }
    life13_87 = __cast100201_33(__call100201_32(life12_80));
    life14_93 = new moom.DD(__call100201_34(life13_87));
    life15_98 = __call100201_35(receiver, life14_93, 0);
    __call100201_37(life13_87, __fieldRead100201_36(receiver));
    if (!(__call100201_38(life13_87, p0, life14_93))) {
        break forest_join_133;
    }
    if (!((!__call100201_39(life13_87, p0, life14_93)))) {
        break forest_join_128;
    }
    life6_53 = __call100201_43(life6_53, __call100201_42(__call100201_40(life13_87), __call100201_41(life13_87)));
    __call100201_44(life5_45, life13_87);
    __call100201_46(__invokedynamic100201_45(life13_87));
    life10_68 += 1;
    }
    __call100201_48(__invokedynamic100201_47(life13_87));
    life9_66 += 1;
    continue forest_cycle_74;
    }
    life16_137 = __call100201_49(p0, life15_98);
    life17_143 = new java.awt.image.BufferedImage[(1 + __fieldRead100201_50(receiver))];
    (life17_143)[0] = __call100201_52(__call100201_51(life16_137));
    life18_154 = __call100201_53((life17_143)[0]);
    life19_159 = __call100201_54((life17_143)[0]);
    if (!((life18_154 >= 1))) {
        break forest_join_165;
    }
    if (!((life19_159 < 1))) {
        break forest_join_169;
    }
    }
    __call100201_56(__invokedynamic100201_55(life13_87));
    continue forest_cycle_74;
    }
    if (!((life18_154 >= life7_56))) {
        break forest_join_175;
    }
    if (!((__fieldRead100201_57(receiver) > 0))) {
        break forest_join_219;
    }
    }
    if (!((__fieldRead100201_58(receiver) > 0))) {
        break forest_join_182;
    }
    forestValue100201_185_0 = __call100201_59(life18_154, life7_56);
    break forest_join_185;
    }
    forestValue100201_185_0 = __call100201_60(life18_154, life7_56);
    }
    life20_189 = forestValue100201_185_0;
    if (!((life20_189 != life18_154))) {
        break forest_join_219;
    }
    if (!((!__call100201_61(life18_154)))) {
        break forest_join_199;
    }
    __call100201_64(__invokedynamic100201_63(__call100201_62(life13_87), life18_154, life20_189));
    break forest_join_205;
    }
    __call100201_67(__invokedynamic100201_66(__call100201_65(life13_87), life18_154, life20_189));
    }
    life21_215 = ((life19_159 * life20_189) / life18_154);
    (life17_143)[0] = __call100201_68((life17_143)[0], life20_189);
    }
    life20_228 = __cast100201_70(__call100201_69(life16_137, "texture"));
    if (!((life20_228 != null))) {
        break forest_join_288;
    }
    life21_233 = __call100201_71(life20_228);
    if (!((!__call100201_72(life21_233)))) {
        break forest_join_251;
    }
    life22_241 = __call100201_73((life17_143)[0]);
    life23_246 = __call100201_74((life17_143)[0]);
    if (!((__call100201_75(life22_241) == life22_241))) {
        break forest_join_355;
    }
    if (!((__call100201_76(life23_246) != life23_246))) {
        break forest_join_251;
    }
    break forest_join_355;
    }
    life22_258 = __call100201_77(life21_233);
    forest_cycle_254: while (true) {
    forest_join_287: {
    if (!(__call100201_78(life22_258))) {
        break forest_join_288;
    }
    life23_266 = __call100201_81(__cast100201_80(__call100201_79(life22_258)));
    if (!((life23_266 > 0))) {
        break forest_join_287;
    }
    if (!((life23_266 < ((life17_143).length - 1)))) {
        break forest_join_287;
    }
    if (!(((life17_143)[life23_266] == null))) {
        break forest_join_287;
    }
    life24_285 = __call100201_82(receiver, life14_93, life23_266);
    (life17_143)[life23_266] = __call100201_85(__call100201_84(__call100201_83(p0, life24_285)));
    }
    continue forest_cycle_254;
    }
    }
    life21_300 = __cast100201_87(__call100201_86(life16_137, "animation"));
    __call100201_88(life13_87, life17_143, life21_300);
    life6_53 = __call100201_92(life6_53, __call100201_91(__call100201_89(life13_87), __call100201_90(life13_87)));
    life16_321 = __call100201_97(__call100201_94(__call100201_93(life13_87)), __call100201_96(__call100201_95(life13_87)));
    if (!((life16_321 < life8_64))) {
        break forest_join_351;
    }
    spill100201_2 = __fieldRead100201_98();
    spill100201_3 = "Texture {} with size {}x{} limits mip level from {} to {}";
    java.lang.Object[] __stackOp100201_99_0 = new java.lang.Object[5];
    spill100201_4 = __stackOp100201_99_0;
    (__stackOp100201_99_0)[0] = life15_98;
    java.lang.Object[] __stackOp100201_100_0 = spill100201_4;
    spill100201_5 = __stackOp100201_100_0;
    (__stackOp100201_100_0)[1] = __call100201_102(__call100201_101(life13_87));
    java.lang.Object[] __stackOp100201_103_0 = spill100201_5;
    spill100201_6 = __stackOp100201_103_0;
    (__stackOp100201_103_0)[2] = __call100201_105(__call100201_104(life13_87));
    java.lang.Object[] __stackOp100201_106_0 = spill100201_6;
    spill100201_7 = __stackOp100201_106_0;
    (__stackOp100201_106_0)[3] = __call100201_108(__call100201_107(life8_64));
    java.lang.Object[] __stackOp100201_109_0 = spill100201_7;
    spill100201_8 = __stackOp100201_109_0;
    (__stackOp100201_109_0)[4] = __call100201_111(__call100201_110(life16_321));
    __call100201_112(spill100201_2, spill100201_3, spill100201_8);
    life8_64 = life16_321;
    }
    __call100201_113(life5_45, life13_87);
    continue forest_cycle_74;
    }
    }
    throw new java.lang.RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
    }
    if (!((life9_66 > 0))) {
        break forest_join_365;
    }
    __call100201_115(__invokedynamic100201_114(life9_66));
    }
    if (!((life10_68 > 0))) {
        break forest_join_370;
    }
    __call100201_117(__invokedynamic100201_116(life10_68));
    }
    life12_385 = __call100201_118(life6_53, life8_64);
    life13_388 = __call100201_119(life12_385);
    if (!((life13_388 < 0))) {
        break forest_join_381;
    }
    life13_388 = 0;
    }
    if (!((life13_388 < __fieldRead100201_120(receiver)))) {
        break forest_join_414;
    }
    spill100201_9 = __fieldRead100201_121();
    spill100201_10 = "{}: dropping miplevel from {} to {}, because of minimum power of two: {}";
    java.lang.Object[] __stackOp100201_122_0 = new java.lang.Object[4];
    spill100201_11 = __stackOp100201_122_0;
    (__stackOp100201_122_0)[0] = __fieldRead100201_123(receiver);
    java.lang.Object[] __stackOp100201_124_0 = spill100201_11;
    spill100201_12 = __stackOp100201_124_0;
    (__stackOp100201_124_0)[1] = __call100201_126(__fieldRead100201_125(receiver));
    java.lang.Object[] __stackOp100201_127_0 = spill100201_12;
    spill100201_13 = __stackOp100201_127_0;
    (__stackOp100201_127_0)[2] = __call100201_128(life13_388);
    java.lang.Object[] __stackOp100201_129_0 = spill100201_13;
    spill100201_14 = __stackOp100201_129_0;
    (__stackOp100201_129_0)[3] = __call100201_130(life12_385);
    __call100201_131(spill100201_9, spill100201_10, spill100201_14);
    __fieldWrite100201_132(receiver, life13_388);
    }
    life14_431 = __call100201_135(__call100201_134(__fieldRead100201_133(receiver)));
    forest_cycle_419: while (true) {
    forest_join_430: {
    if (!(__call100201_136(life14_431))) {
        break forest_join_435;
    }
    life15_438 = __cast100201_138(__call100201_137(life14_431));
    if (!(__fieldRead100201_139(receiver))) {
        break forest_join_430;
    }
    break forest_join_435;
    }
    __call100201_141(life15_438, __fieldRead100201_140(receiver));
    continue forest_cycle_419;
    }
    }
    __call100201_144(__fieldRead100201_142(receiver), __fieldRead100201_143(receiver));
    __call100201_146(life5_45, __fieldRead100201_145(receiver));
    __fieldWrite100201_147(receiver, 0);
    __call100201_148(life5_45);
    spill100201_15 = __fieldRead100201_149();
    spill100201_16 = "Created: {}x{} {}-atlas";
    java.lang.Object[] __stackOp100201_150_0 = new java.lang.Object[3];
    spill100201_17 = __stackOp100201_150_0;
    (__stackOp100201_150_0)[0] = __call100201_152(__call100201_151(life5_45));
    java.lang.Object[] __stackOp100201_153_0 = spill100201_17;
    spill100201_18 = __stackOp100201_153_0;
    (__stackOp100201_153_0)[1] = __call100201_155(__call100201_154(life5_45));
    java.lang.Object[] __stackOp100201_156_0 = spill100201_18;
    spill100201_19 = __stackOp100201_156_0;
    (__stackOp100201_156_0)[2] = __fieldRead100201_157(receiver);
    __call100201_158(spill100201_15, spill100201_16, spill100201_19);
    if (!(__call100201_159())) {
        break forest_join_485;
    }
    __call100201_164(__call100201_160(receiver), __fieldRead100201_161(receiver), __call100201_162(life5_45), __call100201_163(life5_45), life5_45, receiver);
    break forest_join_494;
    }
    __call100201_169(__call100201_165(receiver), __fieldRead100201_166(receiver), __call100201_167(life5_45), __call100201_168(life5_45));
    }
    life14_513 = __call100201_171(__fieldRead100201_170(receiver));
    life15_517 = __call100201_173(__call100201_172(life5_45));
    forest_cycle_502: while (true) {
    forest_join_569: {
    forest_join_556: {
    forest_join_542: {
    if (!(__call100201_174(life15_517))) {
        break forest_join_570;
    }
    life16_524 = __cast100201_176(__call100201_175(life15_517));
    life17_527 = __call100201_177(life16_524);
    __call100201_178(life14_513, life17_527);
    __call100201_180(__fieldRead100201_179(receiver), life17_527, life16_524);
    if (!(__call100201_181())) {
        break forest_join_542;
    }
    __call100201_188(receiver, __call100201_182(life16_524), __call100201_183(life16_524, 0), __call100201_184(life16_524), __call100201_185(life16_524), __call100201_186(life16_524), __call100201_187(life16_524), 0, 0);
    break forest_join_556;
    }
    __call100201_194(__call100201_189(life16_524, 0), __call100201_190(life16_524), __call100201_191(life16_524), __call100201_192(life16_524), __call100201_193(life16_524), 0, 0);
    }
    if (!(__call100201_195(life16_524))) {
        break forest_join_569;
    }
    __call100201_198(life16_524, __call100201_197(__fieldRead100201_196(receiver)));
    __call100201_200(__fieldRead100201_199(receiver), life16_524);
    }
    continue forest_cycle_502;
    }
    }
    life15_591 = __call100201_202(__call100201_201(life14_513));
    forest_cycle_574: while (true) {
    if (!(__call100201_203(life15_591))) {
        break forest_join_586;
    }
    life16_598 = __cast100201_205(__call100201_204(life15_591));
    __call100201_207(life16_598, __fieldRead100201_206(receiver));
    continue forest_cycle_574;
    }
    }
    __call100201_211(__invokedynamic100201_210(__call100201_209(__fieldRead100201_208(receiver))));
    if (!(__call100201_212())) {
        break forest_join_696;
    }
    life15_613 = __call100201_213(life5_45);
    life16_616 = __call100201_214(life5_45);
    life17_620 = __call100201_216(__call100201_215(life5_45));
    forest_cycle_603: while (true) {
    forest_join_691: {
    forest_join_657: {
    if (!(__call100201_217(life17_620))) {
        break forest_join_692;
    }
    life18_627 = __cast100201_219(__call100201_218(life17_620));
    __fieldWrite100201_220(life18_627, life15_613);
    __fieldWrite100201_221(life18_627, life16_616);
    __fieldWrite100201_223(life18_627, __fieldRead100201_222(receiver));
    life19_640 = __fieldRead100201_224(life18_627);
    if (!((life19_640 != null))) {
        break forest_join_691;
    }
    if (!((__call100201_225(life19_640) <= 0))) {
        break forest_join_657;
    }
    __call100201_227(life19_640, __call100201_226(life18_627));
    __call100201_229(life19_640, __call100201_228(life18_627));
    __call100201_232(life19_640, __call100201_230(life18_627), __call100201_231(life18_627), 0, 0, 0);
    __call100201_233(life19_640);
    life20_668 = __call100201_234(life18_627);
    __call100201_235(life19_640, life20_668);
    __call100201_237(life19_640, __call100201_236(life18_627));
    }
    __fieldWrite100201_238(life19_640, life15_613);
    __fieldWrite100201_239(life19_640, life16_616);
    __fieldWrite100201_241(life19_640, __fieldRead100201_240(receiver));
    __call100201_243(life19_640, __call100201_242(life18_627));
    __call100201_244(life18_627);
    life20_693 = 0;
    life21_695 = 1;
    __call100201_250(__call100201_245(life19_640, 0), __call100201_246(life19_640), __call100201_247(life19_640), __call100201_248(life19_640), __call100201_249(life19_640), life20_693, life21_695);
    }
    continue forest_cycle_603;
    }
    }
    __call100201_254(__call100201_252(__call100201_251()), __fieldRead100201_253());
    }
    __call100201_257(receiver, __call100201_255(life5_45), __call100201_256(life5_45));
    if (!(__call100201_259(__call100201_258("saveTextureMap"), "true"))) {
        break forest_join_726;
    }
    __call100201_262(__invokedynamic100201_261(__fieldRead100201_260(receiver)));
    __call100201_270(__invokedynamic100201_265(__call100201_264(__fieldRead100201_263(receiver), "/", "_")), __call100201_266(receiver), __fieldRead100201_267(receiver), __call100201_268(life5_45), __call100201_269(life5_45));
    }
    return;
}
public static void h100201_0(java.io.IOException p0) throws Throwable {
    throw __call13020100_0(p0);
}
public static void h100201_1(java.io.IOException p0) throws Throwable {
    throw __call13020101_0(p0);
}
public static void h100201_2(java.io.IOException p0) throws Throwable {
    throw __call13020102_0(p0);
}
public static void h100201_3(java.io.IOException p0) throws Throwable {
    throw __call13020103_0(p0);
}
public static void h100201_4(java.io.IOException p0) throws Throwable {
    throw __call13020104_0(p0);
}
public static void h100201_5(java.io.IOException p0) throws Throwable {
    throw __call13020105_0(p0);
}
public static void h100201_6(java.io.IOException p0) throws Throwable {
    throw __call13020106_0(p0);
}
public static void h100201_7(java.io.IOException p0) throws Throwable {
    throw __call13020107_0(p0);
}
public static void h100201_8(java.io.IOException p0) throws Throwable {
    throw __call13020108_0(p0);
}
public static void h100201_9(java.io.IOException p0) throws Throwable {
    throw __call13020109_0(p0);
}
public static void h100201_10(java.io.IOException p0) throws Throwable {
    throw __call13020110_0(p0);
}
public static void h100201_11(java.io.IOException p0, net.minecraft.client.renderer.texture.TextureMap p1, moom.oR p2, moom.oe p3, int p4, int p5, int p6, int p7, int p8, java.util.Iterator p9, net.minecraft.client.renderer.texture.TextureAtlasSprite p10, moom.DD p11, moom.DD p12, net.minecraft.client.resources.IResource p13, java.awt.image.BufferedImage[] p14, java.util.Iterator p15, int p16, moom.DD p17) throws Throwable {
    int forestValue13020111_201_0;
    org.apache.logging.log4j.Logger spill13020111_0;
    java.lang.String spill13020111_1;
    java.lang.Object[] spill13020111_2;
    java.lang.Object[] spill13020111_3;
    java.lang.Object[] spill13020111_4;
    org.apache.logging.log4j.Logger spill13020111_5;
    java.lang.String spill13020111_6;
    java.lang.Object[] spill13020111_7;
    java.lang.Object[] spill13020111_8;
    java.lang.Object[] spill13020111_9;
    java.lang.Object[] spill13020111_10;
    java.lang.Object[] spill13020111_11;
    org.apache.logging.log4j.Logger spill13020111_12;
    java.lang.String spill13020111_13;
    java.lang.Object[] spill13020111_14;
    java.lang.Object[] spill13020111_15;
    java.lang.Object[] spill13020111_16;
    java.lang.Object[] spill13020111_17;
    org.apache.logging.log4j.Logger spill13020111_18;
    java.lang.String spill13020111_19;
    java.lang.Object[] spill13020111_20;
    java.lang.Object[] spill13020111_21;
    java.lang.Object[] spill13020111_22;
    java.io.IOException life23_2;
    net.minecraft.client.resources.data.AnimationMetadataSection life22_30;
    int life13_51;
    java.util.Map.Entry life18_100;
    int life19_174;
    int life20_179;
    int life21_209;
    int life22_235;
    net.minecraft.client.resources.data.TextureMetadataSection life21_248;
    java.util.List life22_253;
    int life15_261;
    int life16_266;
    int life16_284;
    moom.DD life17_303;
    int life18_334;
    int life10_337;
    java.util.Iterator life11_380;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life12_387;
    java.util.HashMap life11_462;
    java.util.Iterator life12_466;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life13_473;
    java.lang.String life14_476;
    java.util.Iterator life12_540;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life13_547;
    int life12_562;
    int life13_565;
    java.util.Iterator life14_569;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life19_576;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life20_589;
    java.util.List life21_617;
    int life21_642;
    int life22_644;
    forest_join_673: {
    forest_join_643: {
    forest_join_639: {
    forest_join_533: {
    forest_join_517: {
    forest_join_441: {
    forest_join_432: {
    forest_join_382: {
    forest_join_361: {
    forest_join_328: {
    forest_join_317: {
    forest_join_312: {
    forest_join_307: {
    forest_join_302: {
    life23_2 = p0;
    spill13020111_0 = __fieldRead13020111_0();
    spill13020111_1 = "Unable to load miplevel {} from: {}";
    java.lang.Object[] __stackOp13020111_1_0 = new java.lang.Object[3];
    spill13020111_2 = __stackOp13020111_1_0;
    (__stackOp13020111_1_0)[0] = __call13020111_2(p16);
    java.lang.Object[] __stackOp13020111_3_0 = spill13020111_2;
    spill13020111_3 = __stackOp13020111_3_0;
    (__stackOp13020111_3_0)[1] = p17;
    java.lang.Object[] __stackOp13020111_4_0 = spill13020111_3;
    spill13020111_4 = __stackOp13020111_4_0;
    (__stackOp13020111_4_0)[2] = life23_2;
    __call13020111_5(spill13020111_0, spill13020111_1, spill13020111_4);
    forest_cycle_20: while (true) {
    forest_join_271: {
    forest_join_267: {
    forest_join_24: {
    if (!(__call13020111_6(p15))) {
        break forest_join_24;
    }
    break forest_join_271;
    }
    forest_cycle_24: while (true) {
    forest_join_235: {
    forest_join_221: {
    forest_join_215: {
    forest_join_201: {
    forest_join_198: {
    forest_join_191: {
    forest_join_185: {
    forest_join_87: {
    life22_30 = __cast13020111_8(__call13020111_7(p13, "animation"));
    __call13020111_9(p10, p14, life22_30);
    p4 = __call13020111_13(p4, __call13020111_12(__call13020111_10(p10), __call13020111_11(p10)));
    life13_51 = __call13020111_18(__call13020111_15(__call13020111_14(p10)), __call13020111_17(__call13020111_16(p10)));
    if (!((life13_51 < p6))) {
        break forest_join_87;
    }
    spill13020111_5 = __fieldRead13020111_19();
    spill13020111_6 = "Texture {} with size {}x{} limits mip level from {} to {}";
    java.lang.Object[] __stackOp13020111_20_0 = new java.lang.Object[5];
    spill13020111_7 = __stackOp13020111_20_0;
    (__stackOp13020111_20_0)[0] = p12;
    java.lang.Object[] __stackOp13020111_21_0 = spill13020111_7;
    spill13020111_8 = __stackOp13020111_21_0;
    (__stackOp13020111_21_0)[1] = __call13020111_23(__call13020111_22(p10));
    java.lang.Object[] __stackOp13020111_24_0 = spill13020111_8;
    spill13020111_9 = __stackOp13020111_24_0;
    (__stackOp13020111_24_0)[2] = __call13020111_26(__call13020111_25(p10));
    java.lang.Object[] __stackOp13020111_27_0 = spill13020111_9;
    spill13020111_10 = __stackOp13020111_27_0;
    (__stackOp13020111_27_0)[3] = __call13020111_29(__call13020111_28(p6));
    java.lang.Object[] __stackOp13020111_30_0 = spill13020111_10;
    spill13020111_11 = __stackOp13020111_30_0;
    (__stackOp13020111_30_0)[4] = __call13020111_32(__call13020111_31(life13_51));
    __call13020111_33(spill13020111_5, spill13020111_6, spill13020111_11);
    p6 = life13_51;
    }
    __call13020111_34(p3, p10);
    forest_cycle_90: while (true) {
    forest_join_181: {
    forest_join_149: {
    forest_join_144: {
    if (!(__call13020111_35(p9))) {
        break forest_join_307;
    }
    life18_100 = __cast13020111_37(__call13020111_36(p9));
    if (!((!__fieldRead13020111_38(p1)))) {
        break forest_join_307;
    }
    p10 = __cast13020111_40(__call13020111_39(life18_100));
    p11 = new moom.DD(__call13020111_41(p10));
    p12 = __call13020111_42(p1, p11, 0);
    __call13020111_44(p10, __fieldRead13020111_43(p1));
    if (!(__call13020111_45(p10, p2, p11))) {
        break forest_join_149;
    }
    if (!((!__call13020111_46(p10, p2, p11)))) {
        break forest_join_144;
    }
    p4 = __call13020111_50(p4, __call13020111_49(__call13020111_47(p10), __call13020111_48(p10)));
    __call13020111_51(p3, p10);
    __call13020111_53(__invokedynamic13020111_52(p10));
    p8 += 1;
    }
    __call13020111_55(__invokedynamic13020111_54(p10));
    p7 += 1;
    continue forest_cycle_90;
    }
    p13 = __call13020111_56(p2, p12);
    p14 = new java.awt.image.BufferedImage[(1 + __fieldRead13020111_57(p1))];
    (p14)[0] = __call13020111_59(__call13020111_58(p13));
    life19_174 = __call13020111_60((p14)[0]);
    life20_179 = __call13020111_61((p14)[0]);
    if (!((life19_174 >= 1))) {
        break forest_join_181;
    }
    if (!((life20_179 < 1))) {
        break forest_join_185;
    }
    }
    __call13020111_63(__invokedynamic13020111_62(p10));
    continue forest_cycle_90;
    }
    }
    if (!((life19_174 >= p5))) {
        break forest_join_191;
    }
    if (!((__fieldRead13020111_64(p1) > 0))) {
        break forest_join_235;
    }
    }
    if (!((__fieldRead13020111_65(p1) > 0))) {
        break forest_join_198;
    }
    forestValue13020111_201_0 = __call13020111_66(life19_174, p5);
    break forest_join_201;
    }
    forestValue13020111_201_0 = __call13020111_67(life19_174, p5);
    }
    life21_209 = forestValue13020111_201_0;
    if (!((life21_209 != life19_174))) {
        break forest_join_235;
    }
    if (!((!__call13020111_68(life19_174)))) {
        break forest_join_215;
    }
    __call13020111_71(__invokedynamic13020111_70(__call13020111_69(p10), life19_174, life21_209));
    break forest_join_221;
    }
    __call13020111_74(__invokedynamic13020111_73(__call13020111_72(p10), life19_174, life21_209));
    }
    life22_235 = ((life20_179 * life21_209) / life19_174);
    (p14)[0] = __call13020111_75((p14)[0], life21_209);
    }
    life21_248 = __cast13020111_77(__call13020111_76(p13, "texture"));
    if (!((life21_248 != null))) {
        continue forest_cycle_24;
    }
    break forest_cycle_24;
    }
    life22_253 = __call13020111_78(life21_248);
    if (!((!__call13020111_79(life22_253)))) {
        break forest_join_267;
    }
    life15_261 = __call13020111_80((p14)[0]);
    life16_266 = __call13020111_81((p14)[0]);
    if (!((__call13020111_82(life15_261) == life15_261))) {
        break forest_join_302;
    }
    if (!((__call13020111_83(life16_266) != life16_266))) {
        break forest_join_267;
    }
    break forest_join_302;
    }
    p15 = __call13020111_84(life22_253);
    continue forest_cycle_20;
    }
    life16_284 = __call13020111_87(__cast13020111_86(__call13020111_85(p15)));
    if (!((life16_284 > 0))) {
        continue forest_cycle_20;
    }
    if (!((life16_284 < ((p14).length - 1)))) {
        continue forest_cycle_20;
    }
    if (!(((p14)[life16_284] == null))) {
        continue forest_cycle_20;
    }
    life17_303 = __call13020111_88(p1, p11, life16_284);
    (p14)[life16_284] = __call13020111_91(__call13020111_90(__call13020111_89(p2, life17_303)));
    continue forest_cycle_20;
    }
    }
    throw new java.lang.RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
    }
    if (!((p7 > 0))) {
        break forest_join_312;
    }
    __call13020111_93(__invokedynamic13020111_92(p7));
    }
    if (!((p8 > 0))) {
        break forest_join_317;
    }
    __call13020111_95(__invokedynamic13020111_94(p8));
    }
    life18_334 = __call13020111_96(p4, p6);
    life10_337 = __call13020111_97(life18_334);
    if (!((life10_337 < 0))) {
        break forest_join_328;
    }
    life10_337 = 0;
    }
    if (!((life10_337 < __fieldRead13020111_98(p1)))) {
        break forest_join_361;
    }
    spill13020111_12 = __fieldRead13020111_99();
    spill13020111_13 = "{}: dropping miplevel from {} to {}, because of minimum power of two: {}";
    java.lang.Object[] __stackOp13020111_100_0 = new java.lang.Object[4];
    spill13020111_14 = __stackOp13020111_100_0;
    (__stackOp13020111_100_0)[0] = __fieldRead13020111_101(p1);
    java.lang.Object[] __stackOp13020111_102_0 = spill13020111_14;
    spill13020111_15 = __stackOp13020111_102_0;
    (__stackOp13020111_102_0)[1] = __call13020111_104(__fieldRead13020111_103(p1));
    java.lang.Object[] __stackOp13020111_105_0 = spill13020111_15;
    spill13020111_16 = __stackOp13020111_105_0;
    (__stackOp13020111_105_0)[2] = __call13020111_106(life10_337);
    java.lang.Object[] __stackOp13020111_107_0 = spill13020111_16;
    spill13020111_17 = __stackOp13020111_107_0;
    (__stackOp13020111_107_0)[3] = __call13020111_108(life18_334);
    __call13020111_109(spill13020111_12, spill13020111_13, spill13020111_17);
    __fieldWrite13020111_110(p1, life10_337);
    }
    life11_380 = __call13020111_113(__call13020111_112(__fieldRead13020111_111(p1)));
    forest_cycle_366: while (true) {
    forest_join_377: {
    if (!(__call13020111_114(life11_380))) {
        break forest_join_382;
    }
    life12_387 = __cast13020111_116(__call13020111_115(life11_380));
    if (!(__fieldRead13020111_117(p1))) {
        break forest_join_377;
    }
    break forest_join_382;
    }
    __call13020111_119(life12_387, __fieldRead13020111_118(p1));
    continue forest_cycle_366;
    }
    }
    __call13020111_122(__fieldRead13020111_120(p1), __fieldRead13020111_121(p1));
    __call13020111_124(p3, __fieldRead13020111_123(p1));
    __fieldWrite13020111_125(p1, 0);
    __call13020111_126(p3);
    spill13020111_18 = __fieldRead13020111_127();
    spill13020111_19 = "Created: {}x{} {}-atlas";
    java.lang.Object[] __stackOp13020111_128_0 = new java.lang.Object[3];
    spill13020111_20 = __stackOp13020111_128_0;
    (__stackOp13020111_128_0)[0] = __call13020111_130(__call13020111_129(p3));
    java.lang.Object[] __stackOp13020111_131_0 = spill13020111_20;
    spill13020111_21 = __stackOp13020111_131_0;
    (__stackOp13020111_131_0)[1] = __call13020111_133(__call13020111_132(p3));
    java.lang.Object[] __stackOp13020111_134_0 = spill13020111_21;
    spill13020111_22 = __stackOp13020111_134_0;
    (__stackOp13020111_134_0)[2] = __fieldRead13020111_135(p1);
    __call13020111_136(spill13020111_18, spill13020111_19, spill13020111_22);
    if (!(__call13020111_137())) {
        break forest_join_432;
    }
    __call13020111_142(__call13020111_138(p1), __fieldRead13020111_139(p1), __call13020111_140(p3), __call13020111_141(p3), p3, p1);
    break forest_join_441;
    }
    __call13020111_147(__call13020111_143(p1), __fieldRead13020111_144(p1), __call13020111_145(p3), __call13020111_146(p3));
    }
    life11_462 = __call13020111_149(__fieldRead13020111_148(p1));
    life12_466 = __call13020111_151(__call13020111_150(p3));
    forest_cycle_449: while (true) {
    forest_join_516: {
    forest_join_503: {
    forest_join_489: {
    if (!(__call13020111_152(life12_466))) {
        break forest_join_517;
    }
    life13_473 = __cast13020111_154(__call13020111_153(life12_466));
    life14_476 = __call13020111_155(life13_473);
    __call13020111_156(life11_462, life14_476);
    __call13020111_158(__fieldRead13020111_157(p1), life14_476, life13_473);
    if (!(__call13020111_159())) {
        break forest_join_489;
    }
    __call13020111_166(p1, __call13020111_160(life13_473), __call13020111_161(life13_473, 0), __call13020111_162(life13_473), __call13020111_163(life13_473), __call13020111_164(life13_473), __call13020111_165(life13_473), 0, 0);
    break forest_join_503;
    }
    __call13020111_172(__call13020111_167(life13_473, 0), __call13020111_168(life13_473), __call13020111_169(life13_473), __call13020111_170(life13_473), __call13020111_171(life13_473), 0, 0);
    }
    if (!(__call13020111_173(life13_473))) {
        break forest_join_516;
    }
    __call13020111_176(life13_473, __call13020111_175(__fieldRead13020111_174(p1)));
    __call13020111_178(__fieldRead13020111_177(p1), life13_473);
    }
    continue forest_cycle_449;
    }
    }
    life12_540 = __call13020111_180(__call13020111_179(life11_462));
    forest_cycle_521: while (true) {
    if (!(__call13020111_181(life12_540))) {
        break forest_join_533;
    }
    life13_547 = __cast13020111_183(__call13020111_182(life12_540));
    __call13020111_185(life13_547, __fieldRead13020111_184(p1));
    continue forest_cycle_521;
    }
    }
    __call13020111_189(__invokedynamic13020111_188(__call13020111_187(__fieldRead13020111_186(p1))));
    if (!(__call13020111_190())) {
        break forest_join_643;
    }
    life12_562 = __call13020111_191(p3);
    life13_565 = __call13020111_192(p3);
    life14_569 = __call13020111_194(__call13020111_193(p3));
    forest_cycle_550: while (true) {
    forest_join_638: {
    forest_join_604: {
    if (!(__call13020111_195(life14_569))) {
        break forest_join_639;
    }
    life19_576 = __cast13020111_197(__call13020111_196(life14_569));
    __fieldWrite13020111_198(life19_576, life12_562);
    __fieldWrite13020111_199(life19_576, life13_565);
    __fieldWrite13020111_201(life19_576, __fieldRead13020111_200(p1));
    life20_589 = __fieldRead13020111_202(life19_576);
    if (!((life20_589 != null))) {
        break forest_join_638;
    }
    if (!((__call13020111_203(life20_589) <= 0))) {
        break forest_join_604;
    }
    __call13020111_205(life20_589, __call13020111_204(life19_576));
    __call13020111_207(life20_589, __call13020111_206(life19_576));
    __call13020111_210(life20_589, __call13020111_208(life19_576), __call13020111_209(life19_576), 0, 0, 0);
    __call13020111_211(life20_589);
    life21_617 = __call13020111_212(life19_576);
    __call13020111_213(life20_589, life21_617);
    __call13020111_215(life20_589, __call13020111_214(life19_576));
    }
    __fieldWrite13020111_216(life20_589, life12_562);
    __fieldWrite13020111_217(life20_589, life13_565);
    __fieldWrite13020111_219(life20_589, __fieldRead13020111_218(p1));
    __call13020111_221(life20_589, __call13020111_220(life19_576));
    __call13020111_222(life19_576);
    life21_642 = 0;
    life22_644 = 1;
    __call13020111_228(__call13020111_223(life20_589, 0), __call13020111_224(life20_589), __call13020111_225(life20_589), __call13020111_226(life20_589), __call13020111_227(life20_589), life21_642, life22_644);
    }
    continue forest_cycle_550;
    }
    }
    __call13020111_232(__call13020111_230(__call13020111_229()), __fieldRead13020111_231());
    }
    __call13020111_235(p1, __call13020111_233(p3), __call13020111_234(p3));
    if (!(__call13020111_237(__call13020111_236("saveTextureMap"), "true"))) {
        break forest_join_673;
    }
    __call13020111_240(__invokedynamic13020111_239(__fieldRead13020111_238(p1)));
    __call13020111_248(__invokedynamic13020111_243(__call13020111_242(__fieldRead13020111_241(p1), "/", "_")), __call13020111_244(p1), __fieldRead13020111_245(p1), __call13020111_246(p3), __call13020111_247(p3));
    }
    return;
}
public static void h100201_12(java.lang.RuntimeException p0, net.minecraft.client.renderer.texture.TextureMap p1, moom.oR p2, moom.oe p3, int p4, int p5, int p6, int p7, int p8, java.util.Iterator p9, moom.DD p10) throws Throwable {
    int forestValue13020112_118_0;
    org.apache.logging.log4j.Logger spill13020112_0;
    java.lang.String spill13020112_1;
    java.lang.Object[] spill13020112_2;
    java.lang.Object[] spill13020112_3;
    java.lang.Object[] spill13020112_4;
    java.lang.Object[] spill13020112_5;
    java.lang.Object[] spill13020112_6;
    org.apache.logging.log4j.Logger spill13020112_7;
    java.lang.String spill13020112_8;
    java.lang.Object[] spill13020112_9;
    java.lang.Object[] spill13020112_10;
    java.lang.Object[] spill13020112_11;
    java.lang.Object[] spill13020112_12;
    org.apache.logging.log4j.Logger spill13020112_13;
    java.lang.String spill13020112_14;
    java.lang.Object[] spill13020112_15;
    java.lang.Object[] spill13020112_16;
    java.lang.Object[] spill13020112_17;
    java.lang.RuntimeException life14_2;
    java.util.Map.Entry life11_15;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life12_22;
    moom.DD life13_28;
    moom.DD life10_33;
    net.minecraft.client.resources.IResource life14_72;
    java.awt.image.BufferedImage[] life15_78;
    int life16_89;
    int life17_94;
    int life18_124;
    int life19_150;
    net.minecraft.client.resources.data.TextureMetadataSection life18_163;
    java.util.List life19_168;
    int life20_176;
    int life21_181;
    java.util.Iterator life20_193;
    int life21_201;
    moom.DD life22_220;
    net.minecraft.client.resources.data.AnimationMetadataSection life19_235;
    int life14_256;
    int life11_320;
    int life12_323;
    java.util.Iterator life13_366;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life10_373;
    java.util.HashMap life13_448;
    java.util.Iterator life10_452;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life14_459;
    java.lang.String life15_462;
    java.util.Iterator life10_526;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life14_533;
    int life10_548;
    int life14_551;
    java.util.Iterator life15_555;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life16_562;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life17_575;
    java.util.List life18_603;
    int life18_628;
    int life19_630;
    forest_join_659: {
    forest_join_629: {
    forest_join_625: {
    forest_join_519: {
    forest_join_503: {
    forest_join_427: {
    forest_join_418: {
    forest_join_368: {
    forest_join_347: {
    forest_join_314: {
    forest_join_303: {
    forest_join_298: {
    forest_join_293: {
    forest_join_288: {
    life14_2 = p0;
    __call13020112_2(__fieldRead13020112_0(), __invokedynamic13020112_1(p10), life14_2);
    forest_cycle_7: while (true) {
    forest_join_284: {
    forest_join_221: {
    forest_join_184: {
    forest_join_152: {
    forest_join_138: {
    forest_join_132: {
    forest_join_118: {
    forest_join_115: {
    forest_join_108: {
    forest_join_102: {
    forest_join_98: {
    forest_join_66: {
    forest_join_61: {
    if (!(__call13020112_3(p9))) {
        break forest_join_293;
    }
    life11_15 = __cast13020112_5(__call13020112_4(p9));
    if (!((!__fieldRead13020112_6(p1)))) {
        break forest_join_293;
    }
    life12_22 = __cast13020112_8(__call13020112_7(life11_15));
    life13_28 = new moom.DD(__call13020112_9(life12_22));
    life10_33 = __call13020112_10(p1, life13_28, 0);
    __call13020112_12(life12_22, __fieldRead13020112_11(p1));
    if (!(__call13020112_13(life12_22, p2, life13_28))) {
        break forest_join_66;
    }
    if (!((!__call13020112_14(life12_22, p2, life13_28)))) {
        break forest_join_61;
    }
    p4 = __call13020112_18(p4, __call13020112_17(__call13020112_15(life12_22), __call13020112_16(life12_22)));
    __call13020112_19(p3, life12_22);
    __call13020112_21(__invokedynamic13020112_20(life12_22));
    p8 += 1;
    }
    __call13020112_23(__invokedynamic13020112_22(life12_22));
    p7 += 1;
    continue forest_cycle_7;
    }
    life14_72 = __call13020112_24(p2, life10_33);
    life15_78 = new java.awt.image.BufferedImage[(1 + __fieldRead13020112_25(p1))];
    (life15_78)[0] = __call13020112_27(__call13020112_26(life14_72));
    life16_89 = __call13020112_28((life15_78)[0]);
    life17_94 = __call13020112_29((life15_78)[0]);
    if (!((life16_89 >= 1))) {
        break forest_join_98;
    }
    if (!((life17_94 < 1))) {
        break forest_join_102;
    }
    }
    __call13020112_31(__invokedynamic13020112_30(life12_22));
    continue forest_cycle_7;
    }
    if (!((life16_89 >= p5))) {
        break forest_join_108;
    }
    if (!((__fieldRead13020112_32(p1) > 0))) {
        break forest_join_152;
    }
    }
    if (!((__fieldRead13020112_33(p1) > 0))) {
        break forest_join_115;
    }
    forestValue13020112_118_0 = __call13020112_34(life16_89, p5);
    break forest_join_118;
    }
    forestValue13020112_118_0 = __call13020112_35(life16_89, p5);
    }
    life18_124 = forestValue13020112_118_0;
    if (!((life18_124 != life16_89))) {
        break forest_join_152;
    }
    if (!((!__call13020112_36(life16_89)))) {
        break forest_join_132;
    }
    __call13020112_39(__invokedynamic13020112_38(__call13020112_37(life12_22), life16_89, life18_124));
    break forest_join_138;
    }
    __call13020112_42(__invokedynamic13020112_41(__call13020112_40(life12_22), life16_89, life18_124));
    }
    life19_150 = ((life17_94 * life18_124) / life16_89);
    (life15_78)[0] = __call13020112_43((life15_78)[0], life18_124);
    }
    life18_163 = __cast13020112_45(__call13020112_44(life14_72, "texture"));
    if (!((life18_163 != null))) {
        break forest_join_221;
    }
    life19_168 = __call13020112_46(life18_163);
    if (!((!__call13020112_47(life19_168)))) {
        break forest_join_184;
    }
    life20_176 = __call13020112_48((life15_78)[0]);
    life21_181 = __call13020112_49((life15_78)[0]);
    if (!((__call13020112_50(life20_176) == life20_176))) {
        break forest_join_288;
    }
    if (!((__call13020112_51(life21_181) != life21_181))) {
        break forest_join_184;
    }
    break forest_join_288;
    }
    life20_193 = __call13020112_52(life19_168);
    forest_cycle_187: while (true) {
    forest_join_220: {
    if (!(__call13020112_53(life20_193))) {
        break forest_join_221;
    }
    life21_201 = __call13020112_56(__cast13020112_55(__call13020112_54(life20_193)));
    if (!((life21_201 > 0))) {
        break forest_join_220;
    }
    if (!((life21_201 < ((life15_78).length - 1)))) {
        break forest_join_220;
    }
    if (!(((life15_78)[life21_201] == null))) {
        break forest_join_220;
    }
    life22_220 = __call13020112_57(p1, life13_28, life21_201);
    (life15_78)[life21_201] = __call13020112_60(__call13020112_59(__call13020112_58(p2, life22_220)));
    }
    continue forest_cycle_187;
    }
    }
    life19_235 = __cast13020112_62(__call13020112_61(life14_72, "animation"));
    __call13020112_63(life12_22, life15_78, life19_235);
    p4 = __call13020112_67(p4, __call13020112_66(__call13020112_64(life12_22), __call13020112_65(life12_22)));
    life14_256 = __call13020112_72(__call13020112_69(__call13020112_68(life12_22)), __call13020112_71(__call13020112_70(life12_22)));
    if (!((life14_256 < p6))) {
        break forest_join_284;
    }
    spill13020112_0 = __fieldRead13020112_73();
    spill13020112_1 = "Texture {} with size {}x{} limits mip level from {} to {}";
    java.lang.Object[] __stackOp13020112_74_0 = new java.lang.Object[5];
    spill13020112_2 = __stackOp13020112_74_0;
    (__stackOp13020112_74_0)[0] = life10_33;
    java.lang.Object[] __stackOp13020112_75_0 = spill13020112_2;
    spill13020112_3 = __stackOp13020112_75_0;
    (__stackOp13020112_75_0)[1] = __call13020112_77(__call13020112_76(life12_22));
    java.lang.Object[] __stackOp13020112_78_0 = spill13020112_3;
    spill13020112_4 = __stackOp13020112_78_0;
    (__stackOp13020112_78_0)[2] = __call13020112_80(__call13020112_79(life12_22));
    java.lang.Object[] __stackOp13020112_81_0 = spill13020112_4;
    spill13020112_5 = __stackOp13020112_81_0;
    (__stackOp13020112_81_0)[3] = __call13020112_83(__call13020112_82(p6));
    java.lang.Object[] __stackOp13020112_84_0 = spill13020112_5;
    spill13020112_6 = __stackOp13020112_84_0;
    (__stackOp13020112_84_0)[4] = __call13020112_86(__call13020112_85(life14_256));
    __call13020112_87(spill13020112_0, spill13020112_1, spill13020112_6);
    p6 = life14_256;
    }
    __call13020112_88(p3, life12_22);
    continue forest_cycle_7;
    }
    }
    throw new java.lang.RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
    }
    if (!((p7 > 0))) {
        break forest_join_298;
    }
    __call13020112_90(__invokedynamic13020112_89(p7));
    }
    if (!((p8 > 0))) {
        break forest_join_303;
    }
    __call13020112_92(__invokedynamic13020112_91(p8));
    }
    life11_320 = __call13020112_93(p4, p6);
    life12_323 = __call13020112_94(life11_320);
    if (!((life12_323 < 0))) {
        break forest_join_314;
    }
    life12_323 = 0;
    }
    if (!((life12_323 < __fieldRead13020112_95(p1)))) {
        break forest_join_347;
    }
    spill13020112_7 = __fieldRead13020112_96();
    spill13020112_8 = "{}: dropping miplevel from {} to {}, because of minimum power of two: {}";
    java.lang.Object[] __stackOp13020112_97_0 = new java.lang.Object[4];
    spill13020112_9 = __stackOp13020112_97_0;
    (__stackOp13020112_97_0)[0] = __fieldRead13020112_98(p1);
    java.lang.Object[] __stackOp13020112_99_0 = spill13020112_9;
    spill13020112_10 = __stackOp13020112_99_0;
    (__stackOp13020112_99_0)[1] = __call13020112_101(__fieldRead13020112_100(p1));
    java.lang.Object[] __stackOp13020112_102_0 = spill13020112_10;
    spill13020112_11 = __stackOp13020112_102_0;
    (__stackOp13020112_102_0)[2] = __call13020112_103(life12_323);
    java.lang.Object[] __stackOp13020112_104_0 = spill13020112_11;
    spill13020112_12 = __stackOp13020112_104_0;
    (__stackOp13020112_104_0)[3] = __call13020112_105(life11_320);
    __call13020112_106(spill13020112_7, spill13020112_8, spill13020112_12);
    __fieldWrite13020112_107(p1, life12_323);
    }
    life13_366 = __call13020112_110(__call13020112_109(__fieldRead13020112_108(p1)));
    forest_cycle_352: while (true) {
    forest_join_363: {
    if (!(__call13020112_111(life13_366))) {
        break forest_join_368;
    }
    life10_373 = __cast13020112_113(__call13020112_112(life13_366));
    if (!(__fieldRead13020112_114(p1))) {
        break forest_join_363;
    }
    break forest_join_368;
    }
    __call13020112_116(life10_373, __fieldRead13020112_115(p1));
    continue forest_cycle_352;
    }
    }
    __call13020112_119(__fieldRead13020112_117(p1), __fieldRead13020112_118(p1));
    __call13020112_121(p3, __fieldRead13020112_120(p1));
    __fieldWrite13020112_122(p1, 0);
    __call13020112_123(p3);
    spill13020112_13 = __fieldRead13020112_124();
    spill13020112_14 = "Created: {}x{} {}-atlas";
    java.lang.Object[] __stackOp13020112_125_0 = new java.lang.Object[3];
    spill13020112_15 = __stackOp13020112_125_0;
    (__stackOp13020112_125_0)[0] = __call13020112_127(__call13020112_126(p3));
    java.lang.Object[] __stackOp13020112_128_0 = spill13020112_15;
    spill13020112_16 = __stackOp13020112_128_0;
    (__stackOp13020112_128_0)[1] = __call13020112_130(__call13020112_129(p3));
    java.lang.Object[] __stackOp13020112_131_0 = spill13020112_16;
    spill13020112_17 = __stackOp13020112_131_0;
    (__stackOp13020112_131_0)[2] = __fieldRead13020112_132(p1);
    __call13020112_133(spill13020112_13, spill13020112_14, spill13020112_17);
    if (!(__call13020112_134())) {
        break forest_join_418;
    }
    __call13020112_139(__call13020112_135(p1), __fieldRead13020112_136(p1), __call13020112_137(p3), __call13020112_138(p3), p3, p1);
    break forest_join_427;
    }
    __call13020112_144(__call13020112_140(p1), __fieldRead13020112_141(p1), __call13020112_142(p3), __call13020112_143(p3));
    }
    life13_448 = __call13020112_146(__fieldRead13020112_145(p1));
    life10_452 = __call13020112_148(__call13020112_147(p3));
    forest_cycle_435: while (true) {
    forest_join_502: {
    forest_join_489: {
    forest_join_475: {
    if (!(__call13020112_149(life10_452))) {
        break forest_join_503;
    }
    life14_459 = __cast13020112_151(__call13020112_150(life10_452));
    life15_462 = __call13020112_152(life14_459);
    __call13020112_153(life13_448, life15_462);
    __call13020112_155(__fieldRead13020112_154(p1), life15_462, life14_459);
    if (!(__call13020112_156())) {
        break forest_join_475;
    }
    __call13020112_163(p1, __call13020112_157(life14_459), __call13020112_158(life14_459, 0), __call13020112_159(life14_459), __call13020112_160(life14_459), __call13020112_161(life14_459), __call13020112_162(life14_459), 0, 0);
    break forest_join_489;
    }
    __call13020112_169(__call13020112_164(life14_459, 0), __call13020112_165(life14_459), __call13020112_166(life14_459), __call13020112_167(life14_459), __call13020112_168(life14_459), 0, 0);
    }
    if (!(__call13020112_170(life14_459))) {
        break forest_join_502;
    }
    __call13020112_173(life14_459, __call13020112_172(__fieldRead13020112_171(p1)));
    __call13020112_175(__fieldRead13020112_174(p1), life14_459);
    }
    continue forest_cycle_435;
    }
    }
    life10_526 = __call13020112_177(__call13020112_176(life13_448));
    forest_cycle_507: while (true) {
    if (!(__call13020112_178(life10_526))) {
        break forest_join_519;
    }
    life14_533 = __cast13020112_180(__call13020112_179(life10_526));
    __call13020112_182(life14_533, __fieldRead13020112_181(p1));
    continue forest_cycle_507;
    }
    }
    __call13020112_186(__invokedynamic13020112_185(__call13020112_184(__fieldRead13020112_183(p1))));
    if (!(__call13020112_187())) {
        break forest_join_629;
    }
    life10_548 = __call13020112_188(p3);
    life14_551 = __call13020112_189(p3);
    life15_555 = __call13020112_191(__call13020112_190(p3));
    forest_cycle_536: while (true) {
    forest_join_624: {
    forest_join_590: {
    if (!(__call13020112_192(life15_555))) {
        break forest_join_625;
    }
    life16_562 = __cast13020112_194(__call13020112_193(life15_555));
    __fieldWrite13020112_195(life16_562, life10_548);
    __fieldWrite13020112_196(life16_562, life14_551);
    __fieldWrite13020112_198(life16_562, __fieldRead13020112_197(p1));
    life17_575 = __fieldRead13020112_199(life16_562);
    if (!((life17_575 != null))) {
        break forest_join_624;
    }
    if (!((__call13020112_200(life17_575) <= 0))) {
        break forest_join_590;
    }
    __call13020112_202(life17_575, __call13020112_201(life16_562));
    __call13020112_204(life17_575, __call13020112_203(life16_562));
    __call13020112_207(life17_575, __call13020112_205(life16_562), __call13020112_206(life16_562), 0, 0, 0);
    __call13020112_208(life17_575);
    life18_603 = __call13020112_209(life16_562);
    __call13020112_210(life17_575, life18_603);
    __call13020112_212(life17_575, __call13020112_211(life16_562));
    }
    __fieldWrite13020112_213(life17_575, life10_548);
    __fieldWrite13020112_214(life17_575, life14_551);
    __fieldWrite13020112_216(life17_575, __fieldRead13020112_215(p1));
    __call13020112_218(life17_575, __call13020112_217(life16_562));
    __call13020112_219(life16_562);
    life18_628 = 0;
    life19_630 = 1;
    __call13020112_225(__call13020112_220(life17_575, 0), __call13020112_221(life17_575), __call13020112_222(life17_575), __call13020112_223(life17_575), __call13020112_224(life17_575), life18_628, life19_630);
    }
    continue forest_cycle_536;
    }
    }
    __call13020112_229(__call13020112_227(__call13020112_226()), __fieldRead13020112_228());
    }
    __call13020112_232(p1, __call13020112_230(p3), __call13020112_231(p3));
    if (!(__call13020112_234(__call13020112_233("saveTextureMap"), "true"))) {
        break forest_join_659;
    }
    __call13020112_237(__invokedynamic13020112_236(__fieldRead13020112_235(p1)));
    __call13020112_245(__invokedynamic13020112_240(__call13020112_239(__fieldRead13020112_238(p1), "/", "_")), __call13020112_241(p1), __fieldRead13020112_242(p1), __call13020112_243(p3), __call13020112_244(p3));
    }
    return;
}
public static void h100201_13(java.io.IOException p0, net.minecraft.client.renderer.texture.TextureMap p1, moom.oR p2, moom.oe p3, int p4, int p5, int p6, int p7, int p8, java.util.Iterator p9, moom.DD p10) throws Throwable {
    int forestValue13020113_120_0;
    org.apache.logging.log4j.Logger spill13020113_0;
    java.lang.String spill13020113_1;
    java.lang.Object[] spill13020113_2;
    java.lang.Object[] spill13020113_3;
    java.lang.Object[] spill13020113_4;
    java.lang.Object[] spill13020113_5;
    java.lang.Object[] spill13020113_6;
    org.apache.logging.log4j.Logger spill13020113_7;
    java.lang.String spill13020113_8;
    java.lang.Object[] spill13020113_9;
    java.lang.Object[] spill13020113_10;
    java.lang.Object[] spill13020113_11;
    java.lang.Object[] spill13020113_12;
    org.apache.logging.log4j.Logger spill13020113_13;
    java.lang.String spill13020113_14;
    java.lang.Object[] spill13020113_15;
    java.lang.Object[] spill13020113_16;
    java.lang.Object[] spill13020113_17;
    java.io.IOException life14_2;
    java.util.Map.Entry life11_17;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life12_24;
    moom.DD life13_30;
    moom.DD life10_35;
    net.minecraft.client.resources.IResource life14_74;
    java.awt.image.BufferedImage[] life15_80;
    int life16_91;
    int life17_96;
    int life18_126;
    int life19_152;
    net.minecraft.client.resources.data.TextureMetadataSection life18_165;
    java.util.List life19_170;
    int life20_178;
    int life21_183;
    java.util.Iterator life20_195;
    int life21_203;
    moom.DD life22_222;
    net.minecraft.client.resources.data.AnimationMetadataSection life19_237;
    int life14_258;
    int life11_322;
    int life12_325;
    java.util.Iterator life13_368;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life10_375;
    java.util.HashMap life13_450;
    java.util.Iterator life10_454;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life14_461;
    java.lang.String life15_464;
    java.util.Iterator life10_528;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life14_535;
    int life10_550;
    int life14_553;
    java.util.Iterator life15_557;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life16_564;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life17_577;
    java.util.List life18_605;
    int life18_630;
    int life19_632;
    forest_join_661: {
    forest_join_631: {
    forest_join_627: {
    forest_join_521: {
    forest_join_505: {
    forest_join_429: {
    forest_join_420: {
    forest_join_370: {
    forest_join_349: {
    forest_join_316: {
    forest_join_305: {
    forest_join_300: {
    forest_join_295: {
    forest_join_290: {
    life14_2 = p0;
    __call13020113_4(__fieldRead13020113_0(), __invokedynamic13020113_3(p10, __call13020113_2(__call13020113_1(life14_2))));
    forest_cycle_9: while (true) {
    forest_join_286: {
    forest_join_223: {
    forest_join_186: {
    forest_join_154: {
    forest_join_140: {
    forest_join_134: {
    forest_join_120: {
    forest_join_117: {
    forest_join_110: {
    forest_join_104: {
    forest_join_100: {
    forest_join_68: {
    forest_join_63: {
    if (!(__call13020113_5(p9))) {
        break forest_join_295;
    }
    life11_17 = __cast13020113_7(__call13020113_6(p9));
    if (!((!__fieldRead13020113_8(p1)))) {
        break forest_join_295;
    }
    life12_24 = __cast13020113_10(__call13020113_9(life11_17));
    life13_30 = new moom.DD(__call13020113_11(life12_24));
    life10_35 = __call13020113_12(p1, life13_30, 0);
    __call13020113_14(life12_24, __fieldRead13020113_13(p1));
    if (!(__call13020113_15(life12_24, p2, life13_30))) {
        break forest_join_68;
    }
    if (!((!__call13020113_16(life12_24, p2, life13_30)))) {
        break forest_join_63;
    }
    p4 = __call13020113_20(p4, __call13020113_19(__call13020113_17(life12_24), __call13020113_18(life12_24)));
    __call13020113_21(p3, life12_24);
    __call13020113_23(__invokedynamic13020113_22(life12_24));
    p8 += 1;
    }
    __call13020113_25(__invokedynamic13020113_24(life12_24));
    p7 += 1;
    continue forest_cycle_9;
    }
    life14_74 = __call13020113_26(p2, life10_35);
    life15_80 = new java.awt.image.BufferedImage[(1 + __fieldRead13020113_27(p1))];
    (life15_80)[0] = __call13020113_29(__call13020113_28(life14_74));
    life16_91 = __call13020113_30((life15_80)[0]);
    life17_96 = __call13020113_31((life15_80)[0]);
    if (!((life16_91 >= 1))) {
        break forest_join_100;
    }
    if (!((life17_96 < 1))) {
        break forest_join_104;
    }
    }
    __call13020113_33(__invokedynamic13020113_32(life12_24));
    continue forest_cycle_9;
    }
    if (!((life16_91 >= p5))) {
        break forest_join_110;
    }
    if (!((__fieldRead13020113_34(p1) > 0))) {
        break forest_join_154;
    }
    }
    if (!((__fieldRead13020113_35(p1) > 0))) {
        break forest_join_117;
    }
    forestValue13020113_120_0 = __call13020113_36(life16_91, p5);
    break forest_join_120;
    }
    forestValue13020113_120_0 = __call13020113_37(life16_91, p5);
    }
    life18_126 = forestValue13020113_120_0;
    if (!((life18_126 != life16_91))) {
        break forest_join_154;
    }
    if (!((!__call13020113_38(life16_91)))) {
        break forest_join_134;
    }
    __call13020113_41(__invokedynamic13020113_40(__call13020113_39(life12_24), life16_91, life18_126));
    break forest_join_140;
    }
    __call13020113_44(__invokedynamic13020113_43(__call13020113_42(life12_24), life16_91, life18_126));
    }
    life19_152 = ((life17_96 * life18_126) / life16_91);
    (life15_80)[0] = __call13020113_45((life15_80)[0], life18_126);
    }
    life18_165 = __cast13020113_47(__call13020113_46(life14_74, "texture"));
    if (!((life18_165 != null))) {
        break forest_join_223;
    }
    life19_170 = __call13020113_48(life18_165);
    if (!((!__call13020113_49(life19_170)))) {
        break forest_join_186;
    }
    life20_178 = __call13020113_50((life15_80)[0]);
    life21_183 = __call13020113_51((life15_80)[0]);
    if (!((__call13020113_52(life20_178) == life20_178))) {
        break forest_join_290;
    }
    if (!((__call13020113_53(life21_183) != life21_183))) {
        break forest_join_186;
    }
    break forest_join_290;
    }
    life20_195 = __call13020113_54(life19_170);
    forest_cycle_189: while (true) {
    forest_join_222: {
    if (!(__call13020113_55(life20_195))) {
        break forest_join_223;
    }
    life21_203 = __call13020113_58(__cast13020113_57(__call13020113_56(life20_195)));
    if (!((life21_203 > 0))) {
        break forest_join_222;
    }
    if (!((life21_203 < ((life15_80).length - 1)))) {
        break forest_join_222;
    }
    if (!(((life15_80)[life21_203] == null))) {
        break forest_join_222;
    }
    life22_222 = __call13020113_59(p1, life13_30, life21_203);
    (life15_80)[life21_203] = __call13020113_62(__call13020113_61(__call13020113_60(p2, life22_222)));
    }
    continue forest_cycle_189;
    }
    }
    life19_237 = __cast13020113_64(__call13020113_63(life14_74, "animation"));
    __call13020113_65(life12_24, life15_80, life19_237);
    p4 = __call13020113_69(p4, __call13020113_68(__call13020113_66(life12_24), __call13020113_67(life12_24)));
    life14_258 = __call13020113_74(__call13020113_71(__call13020113_70(life12_24)), __call13020113_73(__call13020113_72(life12_24)));
    if (!((life14_258 < p6))) {
        break forest_join_286;
    }
    spill13020113_0 = __fieldRead13020113_75();
    spill13020113_1 = "Texture {} with size {}x{} limits mip level from {} to {}";
    java.lang.Object[] __stackOp13020113_76_0 = new java.lang.Object[5];
    spill13020113_2 = __stackOp13020113_76_0;
    (__stackOp13020113_76_0)[0] = life10_35;
    java.lang.Object[] __stackOp13020113_77_0 = spill13020113_2;
    spill13020113_3 = __stackOp13020113_77_0;
    (__stackOp13020113_77_0)[1] = __call13020113_79(__call13020113_78(life12_24));
    java.lang.Object[] __stackOp13020113_80_0 = spill13020113_3;
    spill13020113_4 = __stackOp13020113_80_0;
    (__stackOp13020113_80_0)[2] = __call13020113_82(__call13020113_81(life12_24));
    java.lang.Object[] __stackOp13020113_83_0 = spill13020113_4;
    spill13020113_5 = __stackOp13020113_83_0;
    (__stackOp13020113_83_0)[3] = __call13020113_85(__call13020113_84(p6));
    java.lang.Object[] __stackOp13020113_86_0 = spill13020113_5;
    spill13020113_6 = __stackOp13020113_86_0;
    (__stackOp13020113_86_0)[4] = __call13020113_88(__call13020113_87(life14_258));
    __call13020113_89(spill13020113_0, spill13020113_1, spill13020113_6);
    p6 = life14_258;
    }
    __call13020113_90(p3, life12_24);
    continue forest_cycle_9;
    }
    }
    throw new java.lang.RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
    }
    if (!((p7 > 0))) {
        break forest_join_300;
    }
    __call13020113_92(__invokedynamic13020113_91(p7));
    }
    if (!((p8 > 0))) {
        break forest_join_305;
    }
    __call13020113_94(__invokedynamic13020113_93(p8));
    }
    life11_322 = __call13020113_95(p4, p6);
    life12_325 = __call13020113_96(life11_322);
    if (!((life12_325 < 0))) {
        break forest_join_316;
    }
    life12_325 = 0;
    }
    if (!((life12_325 < __fieldRead13020113_97(p1)))) {
        break forest_join_349;
    }
    spill13020113_7 = __fieldRead13020113_98();
    spill13020113_8 = "{}: dropping miplevel from {} to {}, because of minimum power of two: {}";
    java.lang.Object[] __stackOp13020113_99_0 = new java.lang.Object[4];
    spill13020113_9 = __stackOp13020113_99_0;
    (__stackOp13020113_99_0)[0] = __fieldRead13020113_100(p1);
    java.lang.Object[] __stackOp13020113_101_0 = spill13020113_9;
    spill13020113_10 = __stackOp13020113_101_0;
    (__stackOp13020113_101_0)[1] = __call13020113_103(__fieldRead13020113_102(p1));
    java.lang.Object[] __stackOp13020113_104_0 = spill13020113_10;
    spill13020113_11 = __stackOp13020113_104_0;
    (__stackOp13020113_104_0)[2] = __call13020113_105(life12_325);
    java.lang.Object[] __stackOp13020113_106_0 = spill13020113_11;
    spill13020113_12 = __stackOp13020113_106_0;
    (__stackOp13020113_106_0)[3] = __call13020113_107(life11_322);
    __call13020113_108(spill13020113_7, spill13020113_8, spill13020113_12);
    __fieldWrite13020113_109(p1, life12_325);
    }
    life13_368 = __call13020113_112(__call13020113_111(__fieldRead13020113_110(p1)));
    forest_cycle_354: while (true) {
    forest_join_365: {
    if (!(__call13020113_113(life13_368))) {
        break forest_join_370;
    }
    life10_375 = __cast13020113_115(__call13020113_114(life13_368));
    if (!(__fieldRead13020113_116(p1))) {
        break forest_join_365;
    }
    break forest_join_370;
    }
    __call13020113_118(life10_375, __fieldRead13020113_117(p1));
    continue forest_cycle_354;
    }
    }
    __call13020113_121(__fieldRead13020113_119(p1), __fieldRead13020113_120(p1));
    __call13020113_123(p3, __fieldRead13020113_122(p1));
    __fieldWrite13020113_124(p1, 0);
    __call13020113_125(p3);
    spill13020113_13 = __fieldRead13020113_126();
    spill13020113_14 = "Created: {}x{} {}-atlas";
    java.lang.Object[] __stackOp13020113_127_0 = new java.lang.Object[3];
    spill13020113_15 = __stackOp13020113_127_0;
    (__stackOp13020113_127_0)[0] = __call13020113_129(__call13020113_128(p3));
    java.lang.Object[] __stackOp13020113_130_0 = spill13020113_15;
    spill13020113_16 = __stackOp13020113_130_0;
    (__stackOp13020113_130_0)[1] = __call13020113_132(__call13020113_131(p3));
    java.lang.Object[] __stackOp13020113_133_0 = spill13020113_16;
    spill13020113_17 = __stackOp13020113_133_0;
    (__stackOp13020113_133_0)[2] = __fieldRead13020113_134(p1);
    __call13020113_135(spill13020113_13, spill13020113_14, spill13020113_17);
    if (!(__call13020113_136())) {
        break forest_join_420;
    }
    __call13020113_141(__call13020113_137(p1), __fieldRead13020113_138(p1), __call13020113_139(p3), __call13020113_140(p3), p3, p1);
    break forest_join_429;
    }
    __call13020113_146(__call13020113_142(p1), __fieldRead13020113_143(p1), __call13020113_144(p3), __call13020113_145(p3));
    }
    life13_450 = __call13020113_148(__fieldRead13020113_147(p1));
    life10_454 = __call13020113_150(__call13020113_149(p3));
    forest_cycle_437: while (true) {
    forest_join_504: {
    forest_join_491: {
    forest_join_477: {
    if (!(__call13020113_151(life10_454))) {
        break forest_join_505;
    }
    life14_461 = __cast13020113_153(__call13020113_152(life10_454));
    life15_464 = __call13020113_154(life14_461);
    __call13020113_155(life13_450, life15_464);
    __call13020113_157(__fieldRead13020113_156(p1), life15_464, life14_461);
    if (!(__call13020113_158())) {
        break forest_join_477;
    }
    __call13020113_165(p1, __call13020113_159(life14_461), __call13020113_160(life14_461, 0), __call13020113_161(life14_461), __call13020113_162(life14_461), __call13020113_163(life14_461), __call13020113_164(life14_461), 0, 0);
    break forest_join_491;
    }
    __call13020113_171(__call13020113_166(life14_461, 0), __call13020113_167(life14_461), __call13020113_168(life14_461), __call13020113_169(life14_461), __call13020113_170(life14_461), 0, 0);
    }
    if (!(__call13020113_172(life14_461))) {
        break forest_join_504;
    }
    __call13020113_175(life14_461, __call13020113_174(__fieldRead13020113_173(p1)));
    __call13020113_177(__fieldRead13020113_176(p1), life14_461);
    }
    continue forest_cycle_437;
    }
    }
    life10_528 = __call13020113_179(__call13020113_178(life13_450));
    forest_cycle_509: while (true) {
    if (!(__call13020113_180(life10_528))) {
        break forest_join_521;
    }
    life14_535 = __cast13020113_182(__call13020113_181(life10_528));
    __call13020113_184(life14_535, __fieldRead13020113_183(p1));
    continue forest_cycle_509;
    }
    }
    __call13020113_188(__invokedynamic13020113_187(__call13020113_186(__fieldRead13020113_185(p1))));
    if (!(__call13020113_189())) {
        break forest_join_631;
    }
    life10_550 = __call13020113_190(p3);
    life14_553 = __call13020113_191(p3);
    life15_557 = __call13020113_193(__call13020113_192(p3));
    forest_cycle_538: while (true) {
    forest_join_626: {
    forest_join_592: {
    if (!(__call13020113_194(life15_557))) {
        break forest_join_627;
    }
    life16_564 = __cast13020113_196(__call13020113_195(life15_557));
    __fieldWrite13020113_197(life16_564, life10_550);
    __fieldWrite13020113_198(life16_564, life14_553);
    __fieldWrite13020113_200(life16_564, __fieldRead13020113_199(p1));
    life17_577 = __fieldRead13020113_201(life16_564);
    if (!((life17_577 != null))) {
        break forest_join_626;
    }
    if (!((__call13020113_202(life17_577) <= 0))) {
        break forest_join_592;
    }
    __call13020113_204(life17_577, __call13020113_203(life16_564));
    __call13020113_206(life17_577, __call13020113_205(life16_564));
    __call13020113_209(life17_577, __call13020113_207(life16_564), __call13020113_208(life16_564), 0, 0, 0);
    __call13020113_210(life17_577);
    life18_605 = __call13020113_211(life16_564);
    __call13020113_212(life17_577, life18_605);
    __call13020113_214(life17_577, __call13020113_213(life16_564));
    }
    __fieldWrite13020113_215(life17_577, life10_550);
    __fieldWrite13020113_216(life17_577, life14_553);
    __fieldWrite13020113_218(life17_577, __fieldRead13020113_217(p1));
    __call13020113_220(life17_577, __call13020113_219(life16_564));
    __call13020113_221(life16_564);
    life18_630 = 0;
    life19_632 = 1;
    __call13020113_227(__call13020113_222(life17_577, 0), __call13020113_223(life17_577), __call13020113_224(life17_577), __call13020113_225(life17_577), __call13020113_226(life17_577), life18_630, life19_632);
    }
    continue forest_cycle_538;
    }
    }
    __call13020113_231(__call13020113_229(__call13020113_228()), __fieldRead13020113_230());
    }
    __call13020113_234(p1, __call13020113_232(p3), __call13020113_233(p3));
    if (!(__call13020113_236(__call13020113_235("saveTextureMap"), "true"))) {
        break forest_join_661;
    }
    __call13020113_239(__invokedynamic13020113_238(__fieldRead13020113_237(p1)));
    __call13020113_247(__invokedynamic13020113_242(__call13020113_241(__fieldRead13020113_240(p1), "/", "_")), __call13020113_243(p1), __fieldRead13020113_244(p1), __call13020113_245(p3), __call13020113_246(p3));
    }
    return;
}
public static void h100201_14(java.io.IOException p0) throws Throwable {
    throw __call13020114_0(p0);
}
public static void h100201_15(java.io.IOException p0) throws Throwable {
    throw __call13020115_0(p0);
}
public static void h100201_16(java.io.IOException p0) throws Throwable {
    throw __call13020116_0(p0);
}
public static void h100201_17(java.io.IOException p0) throws Throwable {
    throw __call13020117_0(p0);
}
public static void h100201_18(java.lang.Throwable p0, net.minecraft.client.renderer.texture.TextureMap p1, net.minecraft.client.renderer.texture.TextureAtlasSprite p2) throws Throwable {
    java.lang.Throwable life3_2;
    moom.qY life4_6;
    moom.qZ life5_10;
    life3_2 = p0;
    life4_6 = __call13020118_0(life3_2, "Applying mipmap");
    life5_10 = __call13020118_1(life4_6, "Sprite being mipmapped");
    __call13020118_3(life5_10, "Sprite name", __invokedynamic13020118_2(p2));
    __call13020118_5(life5_10, "Sprite size", __invokedynamic13020118_4(p2));
    __call13020118_7(life5_10, "Sprite frames", __invokedynamic13020118_6(p2));
    __call13020118_10(life5_10, "Mipmap levels", __call13020118_9(__fieldRead13020118_8(p1)));
    throw new moom.Oo(life4_6);
}
public static void h100201_19(net.minecraft.client.renderer.StitcherException p0) throws Throwable {
    net.minecraft.client.renderer.StitcherException life1_2;
    life1_2 = p0;
    throw life1_2;
}
public static void h100201_20(java.io.IOException p0) throws Throwable {
    throw __call13020120_0(p0);
}
public static void h100201_21(java.lang.Throwable p0, net.minecraft.client.renderer.texture.TextureMap p1, net.minecraft.client.renderer.texture.TextureAtlasSprite p2) throws Throwable {
    java.lang.Throwable life3_2;
    moom.qY life4_6;
    moom.qZ life5_10;
    life3_2 = p0;
    life4_6 = __call13020121_0(life3_2, "Stitching texture atlas");
    life5_10 = __call13020121_1(life4_6, "Texture being stitched together");
    __call13020121_3(life5_10, "Atlas path", __fieldRead13020121_2(p1));
    __call13020121_4(life5_10, "Sprite", p2);
    throw new moom.Oo(life4_6);
}
public static void h100201_22(java.io.IOException p0) throws Throwable {
    throw __call13020122_0(p0);
}
public static void h100201_23(java.io.IOException p0) throws Throwable {
    throw __call13020123_0(p0);
}
public static void h100201_24(java.lang.Exception p0, net.minecraft.client.renderer.texture.TextureMap p1, moom.oe p2, int p3, int p4, java.util.Iterator p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, net.minecraft.client.renderer.texture.TextureAtlasSprite p7) throws Throwable {
    java.lang.Exception life10_2;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life6_16;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life7_29;
    java.util.List life8_57;
    int life8_82;
    int life9_84;
    forest_join_131: {
    forest_join_97: {
    life10_2 = p0;
    __call13020124_1(__invokedynamic13020124_0(p7, p6));
    __call13020124_2(life10_2);
    forest_cycle_8: while (true) {
    forest_join_62: {
    if (!(__call13020124_3(p5))) {
        break forest_join_97;
    }
    life6_16 = __cast13020124_5(__call13020124_4(p5));
    __fieldWrite13020124_6(life6_16, p3);
    __fieldWrite13020124_7(life6_16, p4);
    __fieldWrite13020124_9(life6_16, __fieldRead13020124_8(p1));
    life7_29 = __fieldRead13020124_10(life6_16);
    if (!((life7_29 != null))) {
        continue forest_cycle_8;
    }
    if (!((__call13020124_11(life7_29) <= 0))) {
        break forest_join_62;
    }
    __call13020124_13(life7_29, __call13020124_12(life6_16));
    __call13020124_15(life7_29, __call13020124_14(life6_16));
    __call13020124_18(life7_29, __call13020124_16(life6_16), __call13020124_17(life6_16), 0, 0, 0);
    __call13020124_19(life7_29);
    life8_57 = __call13020124_20(life6_16);
    __call13020124_21(life7_29, life8_57);
    __call13020124_23(life7_29, __call13020124_22(life6_16));
    }
    __fieldWrite13020124_24(life7_29, p3);
    __fieldWrite13020124_25(life7_29, p4);
    __fieldWrite13020124_27(life7_29, __fieldRead13020124_26(p1));
    __call13020124_29(life7_29, __call13020124_28(life6_16));
    __call13020124_30(life6_16);
    life8_82 = 0;
    life9_84 = 1;
    __call13020124_36(__call13020124_31(life7_29, 0), __call13020124_32(life7_29), __call13020124_33(life7_29), __call13020124_34(life7_29), __call13020124_35(life7_29), life8_82, life9_84);
    continue forest_cycle_8;
    }
    }
    __call13020124_40(__call13020124_38(__call13020124_37()), __fieldRead13020124_39());
    __call13020124_43(p1, __call13020124_41(p2), __call13020124_42(p2));
    if (!(__call13020124_45(__call13020124_44("saveTextureMap"), "true"))) {
        break forest_join_131;
    }
    __call13020124_48(__invokedynamic13020124_47(__fieldRead13020124_46(p1)));
    __call13020124_56(__invokedynamic13020124_51(__call13020124_50(__fieldRead13020124_49(p1), "/", "_")), __call13020124_52(p1), __fieldRead13020124_53(p1), __call13020124_54(p2), __call13020124_55(p2));
    }
    return;
}
public static void h100201_25(java.io.IOException p0) throws Throwable {
    throw __call13020125_0(p0);
}
private static native long __fieldRead100201_0() throws Throwable;
private static native boolean __call100201_1() throws Throwable;
private static native java.lang.String __invokedynamic100201_2(boolean a0) throws Throwable;
private static native void __call100201_3(java.lang.String a0) throws Throwable;
private static native boolean __call100201_4() throws Throwable;
private static native java.util.Map __fieldRead100201_5(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Collection __call100201_6(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call100201_7(java.util.Collection a0) throws Throwable;
private static native boolean __call100201_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100201_9(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast100201_10(java.lang.Object a0) throws Throwable;
private static native void __call100201_11(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_12(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call100201_13(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call100201_14(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call100201_15() throws Throwable;
private static native int __fieldRead100201_16(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Map __fieldRead100201_17(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call100201_18(java.util.Map a0) throws Throwable;
private static native java.util.List __fieldRead100201_19(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call100201_20(java.util.List a0) throws Throwable;
private static native int __invokedynamic100201_21(int a0, long a1) throws Throwable;
private static native int __call100201_22(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite100201_23(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native int __fieldRead100201_24(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Map __fieldRead100201_25(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Set __call100201_26(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call100201_27(java.util.Set a0) throws Throwable;
private static native boolean __call100201_28(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100201_29(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast100201_30(java.lang.Object a0) throws Throwable;
private static native boolean __fieldRead100201_31(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Object __call100201_32(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast100201_33(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call100201_34(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native moom.DD __call100201_35(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1, int a2) throws Throwable;
private static native moom.NK __fieldRead100201_36(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call100201_37(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.NK a1) throws Throwable;
private static native boolean __call100201_38(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.oR a1, moom.DD a2) throws Throwable;
private static native boolean __call100201_39(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.oR a1, moom.DD a2) throws Throwable;
private static native int __call100201_40(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_41(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_42(int a0, int a1) throws Throwable;
private static native int __call100201_43(int a0, int a1) throws Throwable;
private static native void __call100201_44(moom.oe a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.lang.String __invokedynamic100201_45(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_46(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic100201_47(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_48(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call100201_49(moom.oR a0, moom.DD a1) throws Throwable;
private static native int __fieldRead100201_50(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.io.InputStream __call100201_51(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call100201_52(java.io.InputStream a0) throws Throwable;
private static native int __call100201_53(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call100201_54(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.lang.String __invokedynamic100201_55(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_56(java.lang.String a0) throws Throwable;
private static native int __fieldRead100201_57(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead100201_58(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call100201_59(int a0, int a1) throws Throwable;
private static native int __call100201_60(int a0, int a1) throws Throwable;
private static native boolean __call100201_61(int a0) throws Throwable;
private static native java.lang.String __call100201_62(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic100201_63(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __call100201_64(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100201_65(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic100201_66(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __call100201_67(java.lang.String a0) throws Throwable;
private static native java.awt.image.BufferedImage __call100201_68(java.awt.image.BufferedImage a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call100201_69(net.minecraft.client.resources.IResource a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.resources.data.TextureMetadataSection __cast100201_70(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native java.util.List __call100201_71(net.minecraft.client.resources.data.TextureMetadataSection a0) throws Throwable;
private static native boolean __call100201_72(java.util.List a0) throws Throwable;
private static native int __call100201_73(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call100201_74(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call100201_75(int a0) throws Throwable;
private static native int __call100201_76(int a0) throws Throwable;
private static native java.util.Iterator __call100201_77(java.util.List a0) throws Throwable;
private static native boolean __call100201_78(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100201_79(java.util.Iterator a0) throws Throwable;
private static native java.lang.Integer __cast100201_80(java.lang.Object a0) throws Throwable;
private static native int __call100201_81(java.lang.Integer a0) throws Throwable;
private static native moom.DD __call100201_82(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1, int a2) throws Throwable;
private static native net.minecraft.client.resources.IResource __call100201_83(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call100201_84(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call100201_85(java.io.InputStream a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call100201_86(net.minecraft.client.resources.IResource a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __cast100201_87(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native void __call100201_88(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.awt.image.BufferedImage[] a1, net.minecraft.client.resources.data.AnimationMetadataSection a2) throws Throwable;
private static native int __call100201_89(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_90(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_91(int a0, int a1) throws Throwable;
private static native int __call100201_92(int a0, int a1) throws Throwable;
private static native int __call100201_93(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_94(int a0) throws Throwable;
private static native int __call100201_95(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_96(int a0) throws Throwable;
private static native int __call100201_97(int a0, int a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead100201_98() throws Throwable;
private static native int __call100201_101(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Integer __call100201_102(int a0) throws Throwable;
private static native int __call100201_104(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Integer __call100201_105(int a0) throws Throwable;
private static native int __call100201_107(int a0) throws Throwable;
private static native java.lang.Integer __call100201_108(int a0) throws Throwable;
private static native int __call100201_110(int a0) throws Throwable;
private static native java.lang.Integer __call100201_111(int a0) throws Throwable;
private static native void __call100201_112(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call100201_113(moom.oe a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.lang.String __invokedynamic100201_114(int a0) throws Throwable;
private static native void __call100201_115(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic100201_116(int a0) throws Throwable;
private static native void __call100201_117(java.lang.String a0) throws Throwable;
private static native int __call100201_118(int a0, int a1) throws Throwable;
private static native int __call100201_119(int a0) throws Throwable;
private static native int __fieldRead100201_120(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead100201_121() throws Throwable;
private static native java.lang.String __fieldRead100201_123(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead100201_125(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Integer __call100201_126(int a0) throws Throwable;
private static native java.lang.Integer __call100201_128(int a0) throws Throwable;
private static native java.lang.Integer __call100201_130(int a0) throws Throwable;
private static native void __call100201_131(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __fieldWrite100201_132(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead100201_133(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Collection __call100201_134(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call100201_135(java.util.Collection a0) throws Throwable;
private static native boolean __call100201_136(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100201_137(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast100201_138(java.lang.Object a0) throws Throwable;
private static native boolean __fieldRead100201_139(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead100201_140(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call100201_141(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead100201_142(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead100201_143(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call100201_144(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead100201_145(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call100201_146(moom.oe a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native void __fieldWrite100201_147(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __call100201_148(moom.oe a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead100201_149() throws Throwable;
private static native int __call100201_151(moom.oe a0) throws Throwable;
private static native java.lang.Integer __call100201_152(int a0) throws Throwable;
private static native int __call100201_154(moom.oe a0) throws Throwable;
private static native java.lang.Integer __call100201_155(int a0) throws Throwable;
private static native java.lang.String __fieldRead100201_157(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call100201_158(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __call100201_159() throws Throwable;
private static native int __call100201_160(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead100201_161(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call100201_162(moom.oe a0) throws Throwable;
private static native int __call100201_163(moom.oe a0) throws Throwable;
private static native void __call100201_164(int a0, int a1, int a2, int a3, moom.oe a4, net.minecraft.client.renderer.texture.TextureMap a5) throws Throwable;
private static native int __call100201_165(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead100201_166(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call100201_167(moom.oe a0) throws Throwable;
private static native int __call100201_168(moom.oe a0) throws Throwable;
private static native void __call100201_169(int a0, int a1, int a2, int a3) throws Throwable;
private static native java.util.Map __fieldRead100201_170(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.HashMap __call100201_171(java.util.Map a0) throws Throwable;
private static native java.util.List __call100201_172(moom.oe a0) throws Throwable;
private static native java.util.Iterator __call100201_173(java.util.List a0) throws Throwable;
private static native boolean __call100201_174(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100201_175(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast100201_176(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call100201_177(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Object __call100201_178(java.util.HashMap a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead100201_179(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Object __call100201_180(java.util.Map a0, java.lang.String a1, net.minecraft.client.renderer.texture.TextureAtlasSprite a2) throws Throwable;
private static native boolean __call100201_181() throws Throwable;
private static native java.lang.String __call100201_182(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __call100201_183(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call100201_184(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_185(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_186(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_187(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_188(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1, int[][] a2, int a3, int a4, int a5, int a6, int a7, int a8) throws Throwable;
private static native int[][] __call100201_189(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call100201_190(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_191(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_192(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_193(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_194(int[][] a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native boolean __call100201_195(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.List __fieldRead100201_196(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call100201_197(java.util.List a0) throws Throwable;
private static native void __call100201_198(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native java.util.List __fieldRead100201_199(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native boolean __call100201_200(java.util.List a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.util.Collection __call100201_201(java.util.HashMap a0) throws Throwable;
private static native java.util.Iterator __call100201_202(java.util.Collection a0) throws Throwable;
private static native boolean __call100201_203(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100201_204(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast100201_205(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead100201_206(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call100201_207(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.util.List __fieldRead100201_208(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call100201_209(java.util.List a0) throws Throwable;
private static native java.lang.String __invokedynamic100201_210(int a0) throws Throwable;
private static native void __call100201_211(java.lang.String a0) throws Throwable;
private static native boolean __call100201_212() throws Throwable;
private static native int __call100201_213(moom.oe a0) throws Throwable;
private static native int __call100201_214(moom.oe a0) throws Throwable;
private static native java.util.List __call100201_215(moom.oe a0) throws Throwable;
private static native java.util.Iterator __call100201_216(java.util.List a0) throws Throwable;
private static native boolean __call100201_217(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100201_218(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast100201_219(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite100201_220(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite100201_221(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead100201_222(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite100201_223(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead100201_224(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_225(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_226(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_227(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call100201_228(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_229(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call100201_230(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_231(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_232(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native void __call100201_233(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.List __call100201_234(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_235(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.util.List a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __call100201_236(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_237(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.resources.data.AnimationMetadataSection a1) throws Throwable;
private static native void __fieldWrite100201_238(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite100201_239(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead100201_240(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite100201_241(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call100201_242(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_243(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __call100201_244(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __call100201_245(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call100201_246(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_247(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_248(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call100201_249(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call100201_250(int[][] a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.Minecraft __call100201_251() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call100201_252(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead100201_253() throws Throwable;
private static native void __call100201_254(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __call100201_255(moom.oe a0) throws Throwable;
private static native int __call100201_256(moom.oe a0) throws Throwable;
private static native void __call100201_257(net.minecraft.client.renderer.texture.TextureMap a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call100201_258(java.lang.String a0) throws Throwable;
private static native boolean __call100201_259(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead100201_260(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __invokedynamic100201_261(java.lang.String a0) throws Throwable;
private static native void __call100201_262(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead100201_263(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __call100201_264(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic100201_265(java.lang.String a0) throws Throwable;
private static native int __call100201_266(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead100201_267(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call100201_268(moom.oe a0) throws Throwable;
private static native int __call100201_269(moom.oe a0) throws Throwable;
private static native void __call100201_270(java.lang.String a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native java.lang.Exception __call13020100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020102_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020103_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020104_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020105_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020106_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020107_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020108_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020109_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020110_0(java.io.IOException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020111_0() throws Throwable;
private static native java.lang.Integer __call13020111_2(int a0) throws Throwable;
private static native void __call13020111_5(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __call13020111_6(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call13020111_7(net.minecraft.client.resources.IResource a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __cast13020111_8(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native void __call13020111_9(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.awt.image.BufferedImage[] a1, net.minecraft.client.resources.data.AnimationMetadataSection a2) throws Throwable;
private static native int __call13020111_10(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_11(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_12(int a0, int a1) throws Throwable;
private static native int __call13020111_13(int a0, int a1) throws Throwable;
private static native int __call13020111_14(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_15(int a0) throws Throwable;
private static native int __call13020111_16(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_17(int a0) throws Throwable;
private static native int __call13020111_18(int a0, int a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020111_19() throws Throwable;
private static native int __call13020111_22(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Integer __call13020111_23(int a0) throws Throwable;
private static native int __call13020111_25(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Integer __call13020111_26(int a0) throws Throwable;
private static native int __call13020111_28(int a0) throws Throwable;
private static native java.lang.Integer __call13020111_29(int a0) throws Throwable;
private static native int __call13020111_31(int a0) throws Throwable;
private static native java.lang.Integer __call13020111_32(int a0) throws Throwable;
private static native void __call13020111_33(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call13020111_34(moom.oe a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native boolean __call13020111_35(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020111_36(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast13020111_37(java.lang.Object a0) throws Throwable;
private static native boolean __fieldRead13020111_38(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Object __call13020111_39(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020111_40(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call13020111_41(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native moom.DD __call13020111_42(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1, int a2) throws Throwable;
private static native moom.NK __fieldRead13020111_43(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020111_44(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.NK a1) throws Throwable;
private static native boolean __call13020111_45(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.oR a1, moom.DD a2) throws Throwable;
private static native boolean __call13020111_46(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.oR a1, moom.DD a2) throws Throwable;
private static native int __call13020111_47(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_48(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_49(int a0, int a1) throws Throwable;
private static native int __call13020111_50(int a0, int a1) throws Throwable;
private static native void __call13020111_51(moom.oe a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.lang.String __invokedynamic13020111_52(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020111_53(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13020111_54(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020111_55(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call13020111_56(moom.oR a0, moom.DD a1) throws Throwable;
private static native int __fieldRead13020111_57(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.io.InputStream __call13020111_58(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call13020111_59(java.io.InputStream a0) throws Throwable;
private static native int __call13020111_60(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call13020111_61(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.lang.String __invokedynamic13020111_62(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020111_63(java.lang.String a0) throws Throwable;
private static native int __fieldRead13020111_64(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020111_65(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020111_66(int a0, int a1) throws Throwable;
private static native int __call13020111_67(int a0, int a1) throws Throwable;
private static native boolean __call13020111_68(int a0) throws Throwable;
private static native java.lang.String __call13020111_69(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic13020111_70(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __call13020111_71(java.lang.String a0) throws Throwable;
private static native java.lang.String __call13020111_72(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic13020111_73(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __call13020111_74(java.lang.String a0) throws Throwable;
private static native java.awt.image.BufferedImage __call13020111_75(java.awt.image.BufferedImage a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call13020111_76(net.minecraft.client.resources.IResource a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.resources.data.TextureMetadataSection __cast13020111_77(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native java.util.List __call13020111_78(net.minecraft.client.resources.data.TextureMetadataSection a0) throws Throwable;
private static native boolean __call13020111_79(java.util.List a0) throws Throwable;
private static native int __call13020111_80(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call13020111_81(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call13020111_82(int a0) throws Throwable;
private static native int __call13020111_83(int a0) throws Throwable;
private static native java.util.Iterator __call13020111_84(java.util.List a0) throws Throwable;
private static native java.lang.Object __call13020111_85(java.util.Iterator a0) throws Throwable;
private static native java.lang.Integer __cast13020111_86(java.lang.Object a0) throws Throwable;
private static native int __call13020111_87(java.lang.Integer a0) throws Throwable;
private static native moom.DD __call13020111_88(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1, int a2) throws Throwable;
private static native net.minecraft.client.resources.IResource __call13020111_89(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call13020111_90(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call13020111_91(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic13020111_92(int a0) throws Throwable;
private static native void __call13020111_93(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13020111_94(int a0) throws Throwable;
private static native void __call13020111_95(java.lang.String a0) throws Throwable;
private static native int __call13020111_96(int a0, int a1) throws Throwable;
private static native int __call13020111_97(int a0) throws Throwable;
private static native int __fieldRead13020111_98(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020111_99() throws Throwable;
private static native java.lang.String __fieldRead13020111_101(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020111_103(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Integer __call13020111_104(int a0) throws Throwable;
private static native java.lang.Integer __call13020111_106(int a0) throws Throwable;
private static native java.lang.Integer __call13020111_108(int a0) throws Throwable;
private static native void __call13020111_109(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __fieldWrite13020111_110(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead13020111_111(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Collection __call13020111_112(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call13020111_113(java.util.Collection a0) throws Throwable;
private static native boolean __call13020111_114(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020111_115(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020111_116(java.lang.Object a0) throws Throwable;
private static native boolean __fieldRead13020111_117(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020111_118(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020111_119(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020111_120(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020111_121(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020111_122(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020111_123(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020111_124(moom.oe a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native void __fieldWrite13020111_125(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __call13020111_126(moom.oe a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020111_127() throws Throwable;
private static native int __call13020111_129(moom.oe a0) throws Throwable;
private static native java.lang.Integer __call13020111_130(int a0) throws Throwable;
private static native int __call13020111_132(moom.oe a0) throws Throwable;
private static native java.lang.Integer __call13020111_133(int a0) throws Throwable;
private static native java.lang.String __fieldRead13020111_135(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020111_136(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __call13020111_137() throws Throwable;
private static native int __call13020111_138(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020111_139(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020111_140(moom.oe a0) throws Throwable;
private static native int __call13020111_141(moom.oe a0) throws Throwable;
private static native void __call13020111_142(int a0, int a1, int a2, int a3, moom.oe a4, net.minecraft.client.renderer.texture.TextureMap a5) throws Throwable;
private static native int __call13020111_143(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020111_144(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020111_145(moom.oe a0) throws Throwable;
private static native int __call13020111_146(moom.oe a0) throws Throwable;
private static native void __call13020111_147(int a0, int a1, int a2, int a3) throws Throwable;
private static native java.util.Map __fieldRead13020111_148(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.HashMap __call13020111_149(java.util.Map a0) throws Throwable;
private static native java.util.List __call13020111_150(moom.oe a0) throws Throwable;
private static native java.util.Iterator __call13020111_151(java.util.List a0) throws Throwable;
private static native boolean __call13020111_152(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020111_153(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020111_154(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call13020111_155(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Object __call13020111_156(java.util.HashMap a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead13020111_157(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Object __call13020111_158(java.util.Map a0, java.lang.String a1, net.minecraft.client.renderer.texture.TextureAtlasSprite a2) throws Throwable;
private static native boolean __call13020111_159() throws Throwable;
private static native java.lang.String __call13020111_160(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __call13020111_161(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020111_162(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_163(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_164(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_165(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020111_166(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1, int[][] a2, int a3, int a4, int a5, int a6, int a7, int a8) throws Throwable;
private static native int[][] __call13020111_167(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020111_168(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_169(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_170(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_171(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020111_172(int[][] a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native boolean __call13020111_173(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.List __fieldRead13020111_174(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020111_175(java.util.List a0) throws Throwable;
private static native void __call13020111_176(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native java.util.List __fieldRead13020111_177(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native boolean __call13020111_178(java.util.List a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.util.Collection __call13020111_179(java.util.HashMap a0) throws Throwable;
private static native java.util.Iterator __call13020111_180(java.util.Collection a0) throws Throwable;
private static native boolean __call13020111_181(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020111_182(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020111_183(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020111_184(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020111_185(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.util.List __fieldRead13020111_186(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020111_187(java.util.List a0) throws Throwable;
private static native java.lang.String __invokedynamic13020111_188(int a0) throws Throwable;
private static native void __call13020111_189(java.lang.String a0) throws Throwable;
private static native boolean __call13020111_190() throws Throwable;
private static native int __call13020111_191(moom.oe a0) throws Throwable;
private static native int __call13020111_192(moom.oe a0) throws Throwable;
private static native java.util.List __call13020111_193(moom.oe a0) throws Throwable;
private static native java.util.Iterator __call13020111_194(java.util.List a0) throws Throwable;
private static native boolean __call13020111_195(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020111_196(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020111_197(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite13020111_198(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite13020111_199(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead13020111_200(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite13020111_201(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020111_202(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_203(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_204(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020111_205(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020111_206(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020111_207(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020111_208(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_209(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020111_210(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native void __call13020111_211(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.List __call13020111_212(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020111_213(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.util.List a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __call13020111_214(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020111_215(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.resources.data.AnimationMetadataSection a1) throws Throwable;
private static native void __fieldWrite13020111_216(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite13020111_217(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead13020111_218(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite13020111_219(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020111_220(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020111_221(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __call13020111_222(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __call13020111_223(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020111_224(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_225(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_226(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020111_227(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020111_228(int[][] a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.Minecraft __call13020111_229() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call13020111_230(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead13020111_231() throws Throwable;
private static native void __call13020111_232(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __call13020111_233(moom.oe a0) throws Throwable;
private static native int __call13020111_234(moom.oe a0) throws Throwable;
private static native void __call13020111_235(net.minecraft.client.renderer.texture.TextureMap a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call13020111_236(java.lang.String a0) throws Throwable;
private static native boolean __call13020111_237(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead13020111_238(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __invokedynamic13020111_239(java.lang.String a0) throws Throwable;
private static native void __call13020111_240(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead13020111_241(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __call13020111_242(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic13020111_243(java.lang.String a0) throws Throwable;
private static native int __call13020111_244(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020111_245(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020111_246(moom.oe a0) throws Throwable;
private static native int __call13020111_247(moom.oe a0) throws Throwable;
private static native void __call13020111_248(java.lang.String a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020112_0() throws Throwable;
private static native java.lang.String __invokedynamic13020112_1(moom.DD a0) throws Throwable;
private static native void __call13020112_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.RuntimeException a2) throws Throwable;
private static native boolean __call13020112_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020112_4(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast13020112_5(java.lang.Object a0) throws Throwable;
private static native boolean __fieldRead13020112_6(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Object __call13020112_7(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020112_8(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call13020112_9(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native moom.DD __call13020112_10(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1, int a2) throws Throwable;
private static native moom.NK __fieldRead13020112_11(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020112_12(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.NK a1) throws Throwable;
private static native boolean __call13020112_13(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.oR a1, moom.DD a2) throws Throwable;
private static native boolean __call13020112_14(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.oR a1, moom.DD a2) throws Throwable;
private static native int __call13020112_15(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_16(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_17(int a0, int a1) throws Throwable;
private static native int __call13020112_18(int a0, int a1) throws Throwable;
private static native void __call13020112_19(moom.oe a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.lang.String __invokedynamic13020112_20(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020112_21(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13020112_22(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020112_23(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call13020112_24(moom.oR a0, moom.DD a1) throws Throwable;
private static native int __fieldRead13020112_25(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.io.InputStream __call13020112_26(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call13020112_27(java.io.InputStream a0) throws Throwable;
private static native int __call13020112_28(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call13020112_29(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.lang.String __invokedynamic13020112_30(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020112_31(java.lang.String a0) throws Throwable;
private static native int __fieldRead13020112_32(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020112_33(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020112_34(int a0, int a1) throws Throwable;
private static native int __call13020112_35(int a0, int a1) throws Throwable;
private static native boolean __call13020112_36(int a0) throws Throwable;
private static native java.lang.String __call13020112_37(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic13020112_38(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __call13020112_39(java.lang.String a0) throws Throwable;
private static native java.lang.String __call13020112_40(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic13020112_41(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __call13020112_42(java.lang.String a0) throws Throwable;
private static native java.awt.image.BufferedImage __call13020112_43(java.awt.image.BufferedImage a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call13020112_44(net.minecraft.client.resources.IResource a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.resources.data.TextureMetadataSection __cast13020112_45(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native java.util.List __call13020112_46(net.minecraft.client.resources.data.TextureMetadataSection a0) throws Throwable;
private static native boolean __call13020112_47(java.util.List a0) throws Throwable;
private static native int __call13020112_48(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call13020112_49(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call13020112_50(int a0) throws Throwable;
private static native int __call13020112_51(int a0) throws Throwable;
private static native java.util.Iterator __call13020112_52(java.util.List a0) throws Throwable;
private static native boolean __call13020112_53(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020112_54(java.util.Iterator a0) throws Throwable;
private static native java.lang.Integer __cast13020112_55(java.lang.Object a0) throws Throwable;
private static native int __call13020112_56(java.lang.Integer a0) throws Throwable;
private static native moom.DD __call13020112_57(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1, int a2) throws Throwable;
private static native net.minecraft.client.resources.IResource __call13020112_58(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call13020112_59(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call13020112_60(java.io.InputStream a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call13020112_61(net.minecraft.client.resources.IResource a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __cast13020112_62(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native void __call13020112_63(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.awt.image.BufferedImage[] a1, net.minecraft.client.resources.data.AnimationMetadataSection a2) throws Throwable;
private static native int __call13020112_64(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_65(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_66(int a0, int a1) throws Throwable;
private static native int __call13020112_67(int a0, int a1) throws Throwable;
private static native int __call13020112_68(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_69(int a0) throws Throwable;
private static native int __call13020112_70(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_71(int a0) throws Throwable;
private static native int __call13020112_72(int a0, int a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020112_73() throws Throwable;
private static native int __call13020112_76(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Integer __call13020112_77(int a0) throws Throwable;
private static native int __call13020112_79(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Integer __call13020112_80(int a0) throws Throwable;
private static native int __call13020112_82(int a0) throws Throwable;
private static native java.lang.Integer __call13020112_83(int a0) throws Throwable;
private static native int __call13020112_85(int a0) throws Throwable;
private static native java.lang.Integer __call13020112_86(int a0) throws Throwable;
private static native void __call13020112_87(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call13020112_88(moom.oe a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.lang.String __invokedynamic13020112_89(int a0) throws Throwable;
private static native void __call13020112_90(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13020112_91(int a0) throws Throwable;
private static native void __call13020112_92(java.lang.String a0) throws Throwable;
private static native int __call13020112_93(int a0, int a1) throws Throwable;
private static native int __call13020112_94(int a0) throws Throwable;
private static native int __fieldRead13020112_95(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020112_96() throws Throwable;
private static native java.lang.String __fieldRead13020112_98(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020112_100(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Integer __call13020112_101(int a0) throws Throwable;
private static native java.lang.Integer __call13020112_103(int a0) throws Throwable;
private static native java.lang.Integer __call13020112_105(int a0) throws Throwable;
private static native void __call13020112_106(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __fieldWrite13020112_107(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead13020112_108(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Collection __call13020112_109(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call13020112_110(java.util.Collection a0) throws Throwable;
private static native boolean __call13020112_111(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020112_112(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020112_113(java.lang.Object a0) throws Throwable;
private static native boolean __fieldRead13020112_114(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020112_115(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020112_116(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020112_117(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020112_118(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020112_119(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020112_120(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020112_121(moom.oe a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native void __fieldWrite13020112_122(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __call13020112_123(moom.oe a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020112_124() throws Throwable;
private static native int __call13020112_126(moom.oe a0) throws Throwable;
private static native java.lang.Integer __call13020112_127(int a0) throws Throwable;
private static native int __call13020112_129(moom.oe a0) throws Throwable;
private static native java.lang.Integer __call13020112_130(int a0) throws Throwable;
private static native java.lang.String __fieldRead13020112_132(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020112_133(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __call13020112_134() throws Throwable;
private static native int __call13020112_135(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020112_136(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020112_137(moom.oe a0) throws Throwable;
private static native int __call13020112_138(moom.oe a0) throws Throwable;
private static native void __call13020112_139(int a0, int a1, int a2, int a3, moom.oe a4, net.minecraft.client.renderer.texture.TextureMap a5) throws Throwable;
private static native int __call13020112_140(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020112_141(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020112_142(moom.oe a0) throws Throwable;
private static native int __call13020112_143(moom.oe a0) throws Throwable;
private static native void __call13020112_144(int a0, int a1, int a2, int a3) throws Throwable;
private static native java.util.Map __fieldRead13020112_145(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.HashMap __call13020112_146(java.util.Map a0) throws Throwable;
private static native java.util.List __call13020112_147(moom.oe a0) throws Throwable;
private static native java.util.Iterator __call13020112_148(java.util.List a0) throws Throwable;
private static native boolean __call13020112_149(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020112_150(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020112_151(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call13020112_152(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Object __call13020112_153(java.util.HashMap a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead13020112_154(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Object __call13020112_155(java.util.Map a0, java.lang.String a1, net.minecraft.client.renderer.texture.TextureAtlasSprite a2) throws Throwable;
private static native boolean __call13020112_156() throws Throwable;
private static native java.lang.String __call13020112_157(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __call13020112_158(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020112_159(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_160(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_161(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_162(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020112_163(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1, int[][] a2, int a3, int a4, int a5, int a6, int a7, int a8) throws Throwable;
private static native int[][] __call13020112_164(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020112_165(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_166(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_167(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_168(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020112_169(int[][] a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native boolean __call13020112_170(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.List __fieldRead13020112_171(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020112_172(java.util.List a0) throws Throwable;
private static native void __call13020112_173(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native java.util.List __fieldRead13020112_174(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native boolean __call13020112_175(java.util.List a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.util.Collection __call13020112_176(java.util.HashMap a0) throws Throwable;
private static native java.util.Iterator __call13020112_177(java.util.Collection a0) throws Throwable;
private static native boolean __call13020112_178(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020112_179(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020112_180(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020112_181(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020112_182(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.util.List __fieldRead13020112_183(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020112_184(java.util.List a0) throws Throwable;
private static native java.lang.String __invokedynamic13020112_185(int a0) throws Throwable;
private static native void __call13020112_186(java.lang.String a0) throws Throwable;
private static native boolean __call13020112_187() throws Throwable;
private static native int __call13020112_188(moom.oe a0) throws Throwable;
private static native int __call13020112_189(moom.oe a0) throws Throwable;
private static native java.util.List __call13020112_190(moom.oe a0) throws Throwable;
private static native java.util.Iterator __call13020112_191(java.util.List a0) throws Throwable;
private static native boolean __call13020112_192(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020112_193(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020112_194(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite13020112_195(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite13020112_196(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead13020112_197(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite13020112_198(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020112_199(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_200(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_201(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020112_202(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020112_203(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020112_204(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020112_205(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_206(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020112_207(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native void __call13020112_208(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.List __call13020112_209(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020112_210(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.util.List a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __call13020112_211(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020112_212(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.resources.data.AnimationMetadataSection a1) throws Throwable;
private static native void __fieldWrite13020112_213(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite13020112_214(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead13020112_215(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite13020112_216(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020112_217(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020112_218(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __call13020112_219(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __call13020112_220(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020112_221(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_222(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_223(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020112_224(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020112_225(int[][] a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.Minecraft __call13020112_226() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call13020112_227(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead13020112_228() throws Throwable;
private static native void __call13020112_229(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __call13020112_230(moom.oe a0) throws Throwable;
private static native int __call13020112_231(moom.oe a0) throws Throwable;
private static native void __call13020112_232(net.minecraft.client.renderer.texture.TextureMap a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call13020112_233(java.lang.String a0) throws Throwable;
private static native boolean __call13020112_234(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead13020112_235(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __invokedynamic13020112_236(java.lang.String a0) throws Throwable;
private static native void __call13020112_237(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead13020112_238(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __call13020112_239(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic13020112_240(java.lang.String a0) throws Throwable;
private static native int __call13020112_241(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020112_242(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020112_243(moom.oe a0) throws Throwable;
private static native int __call13020112_244(moom.oe a0) throws Throwable;
private static native void __call13020112_245(java.lang.String a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020113_0() throws Throwable;
private static native java.lang.Class __call13020113_1(java.io.IOException a0) throws Throwable;
private static native java.lang.String __call13020113_2(java.lang.Class a0) throws Throwable;
private static native java.lang.String __invokedynamic13020113_3(moom.DD a0, java.lang.String a1) throws Throwable;
private static native void __call13020113_4(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __call13020113_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020113_6(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast13020113_7(java.lang.Object a0) throws Throwable;
private static native boolean __fieldRead13020113_8(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Object __call13020113_9(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020113_10(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call13020113_11(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native moom.DD __call13020113_12(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1, int a2) throws Throwable;
private static native moom.NK __fieldRead13020113_13(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020113_14(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.NK a1) throws Throwable;
private static native boolean __call13020113_15(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.oR a1, moom.DD a2) throws Throwable;
private static native boolean __call13020113_16(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.oR a1, moom.DD a2) throws Throwable;
private static native int __call13020113_17(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_18(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_19(int a0, int a1) throws Throwable;
private static native int __call13020113_20(int a0, int a1) throws Throwable;
private static native void __call13020113_21(moom.oe a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.lang.String __invokedynamic13020113_22(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020113_23(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13020113_24(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020113_25(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call13020113_26(moom.oR a0, moom.DD a1) throws Throwable;
private static native int __fieldRead13020113_27(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.io.InputStream __call13020113_28(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call13020113_29(java.io.InputStream a0) throws Throwable;
private static native int __call13020113_30(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call13020113_31(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.lang.String __invokedynamic13020113_32(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020113_33(java.lang.String a0) throws Throwable;
private static native int __fieldRead13020113_34(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020113_35(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020113_36(int a0, int a1) throws Throwable;
private static native int __call13020113_37(int a0, int a1) throws Throwable;
private static native boolean __call13020113_38(int a0) throws Throwable;
private static native java.lang.String __call13020113_39(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic13020113_40(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __call13020113_41(java.lang.String a0) throws Throwable;
private static native java.lang.String __call13020113_42(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic13020113_43(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __call13020113_44(java.lang.String a0) throws Throwable;
private static native java.awt.image.BufferedImage __call13020113_45(java.awt.image.BufferedImage a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call13020113_46(net.minecraft.client.resources.IResource a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.resources.data.TextureMetadataSection __cast13020113_47(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native java.util.List __call13020113_48(net.minecraft.client.resources.data.TextureMetadataSection a0) throws Throwable;
private static native boolean __call13020113_49(java.util.List a0) throws Throwable;
private static native int __call13020113_50(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call13020113_51(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call13020113_52(int a0) throws Throwable;
private static native int __call13020113_53(int a0) throws Throwable;
private static native java.util.Iterator __call13020113_54(java.util.List a0) throws Throwable;
private static native boolean __call13020113_55(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020113_56(java.util.Iterator a0) throws Throwable;
private static native java.lang.Integer __cast13020113_57(java.lang.Object a0) throws Throwable;
private static native int __call13020113_58(java.lang.Integer a0) throws Throwable;
private static native moom.DD __call13020113_59(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1, int a2) throws Throwable;
private static native net.minecraft.client.resources.IResource __call13020113_60(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call13020113_61(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call13020113_62(java.io.InputStream a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call13020113_63(net.minecraft.client.resources.IResource a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __cast13020113_64(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native void __call13020113_65(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.awt.image.BufferedImage[] a1, net.minecraft.client.resources.data.AnimationMetadataSection a2) throws Throwable;
private static native int __call13020113_66(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_67(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_68(int a0, int a1) throws Throwable;
private static native int __call13020113_69(int a0, int a1) throws Throwable;
private static native int __call13020113_70(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_71(int a0) throws Throwable;
private static native int __call13020113_72(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_73(int a0) throws Throwable;
private static native int __call13020113_74(int a0, int a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020113_75() throws Throwable;
private static native int __call13020113_78(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Integer __call13020113_79(int a0) throws Throwable;
private static native int __call13020113_81(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Integer __call13020113_82(int a0) throws Throwable;
private static native int __call13020113_84(int a0) throws Throwable;
private static native java.lang.Integer __call13020113_85(int a0) throws Throwable;
private static native int __call13020113_87(int a0) throws Throwable;
private static native java.lang.Integer __call13020113_88(int a0) throws Throwable;
private static native void __call13020113_89(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call13020113_90(moom.oe a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.lang.String __invokedynamic13020113_91(int a0) throws Throwable;
private static native void __call13020113_92(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13020113_93(int a0) throws Throwable;
private static native void __call13020113_94(java.lang.String a0) throws Throwable;
private static native int __call13020113_95(int a0, int a1) throws Throwable;
private static native int __call13020113_96(int a0) throws Throwable;
private static native int __fieldRead13020113_97(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020113_98() throws Throwable;
private static native java.lang.String __fieldRead13020113_100(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020113_102(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Integer __call13020113_103(int a0) throws Throwable;
private static native java.lang.Integer __call13020113_105(int a0) throws Throwable;
private static native java.lang.Integer __call13020113_107(int a0) throws Throwable;
private static native void __call13020113_108(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __fieldWrite13020113_109(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead13020113_110(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Collection __call13020113_111(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call13020113_112(java.util.Collection a0) throws Throwable;
private static native boolean __call13020113_113(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020113_114(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020113_115(java.lang.Object a0) throws Throwable;
private static native boolean __fieldRead13020113_116(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020113_117(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020113_118(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020113_119(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020113_120(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020113_121(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020113_122(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020113_123(moom.oe a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native void __fieldWrite13020113_124(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __call13020113_125(moom.oe a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13020113_126() throws Throwable;
private static native int __call13020113_128(moom.oe a0) throws Throwable;
private static native java.lang.Integer __call13020113_129(int a0) throws Throwable;
private static native int __call13020113_131(moom.oe a0) throws Throwable;
private static native java.lang.Integer __call13020113_132(int a0) throws Throwable;
private static native java.lang.String __fieldRead13020113_134(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020113_135(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __call13020113_136() throws Throwable;
private static native int __call13020113_137(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020113_138(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020113_139(moom.oe a0) throws Throwable;
private static native int __call13020113_140(moom.oe a0) throws Throwable;
private static native void __call13020113_141(int a0, int a1, int a2, int a3, moom.oe a4, net.minecraft.client.renderer.texture.TextureMap a5) throws Throwable;
private static native int __call13020113_142(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020113_143(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020113_144(moom.oe a0) throws Throwable;
private static native int __call13020113_145(moom.oe a0) throws Throwable;
private static native void __call13020113_146(int a0, int a1, int a2, int a3) throws Throwable;
private static native java.util.Map __fieldRead13020113_147(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.HashMap __call13020113_148(java.util.Map a0) throws Throwable;
private static native java.util.List __call13020113_149(moom.oe a0) throws Throwable;
private static native java.util.Iterator __call13020113_150(java.util.List a0) throws Throwable;
private static native boolean __call13020113_151(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020113_152(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020113_153(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call13020113_154(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Object __call13020113_155(java.util.HashMap a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead13020113_156(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Object __call13020113_157(java.util.Map a0, java.lang.String a1, net.minecraft.client.renderer.texture.TextureAtlasSprite a2) throws Throwable;
private static native boolean __call13020113_158() throws Throwable;
private static native java.lang.String __call13020113_159(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __call13020113_160(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020113_161(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_162(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_163(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_164(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020113_165(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1, int[][] a2, int a3, int a4, int a5, int a6, int a7, int a8) throws Throwable;
private static native int[][] __call13020113_166(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020113_167(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_168(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_169(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_170(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020113_171(int[][] a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native boolean __call13020113_172(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.List __fieldRead13020113_173(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020113_174(java.util.List a0) throws Throwable;
private static native void __call13020113_175(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native java.util.List __fieldRead13020113_176(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native boolean __call13020113_177(java.util.List a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.util.Collection __call13020113_178(java.util.HashMap a0) throws Throwable;
private static native java.util.Iterator __call13020113_179(java.util.Collection a0) throws Throwable;
private static native boolean __call13020113_180(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020113_181(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020113_182(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020113_183(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020113_184(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.util.List __fieldRead13020113_185(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020113_186(java.util.List a0) throws Throwable;
private static native java.lang.String __invokedynamic13020113_187(int a0) throws Throwable;
private static native void __call13020113_188(java.lang.String a0) throws Throwable;
private static native boolean __call13020113_189() throws Throwable;
private static native int __call13020113_190(moom.oe a0) throws Throwable;
private static native int __call13020113_191(moom.oe a0) throws Throwable;
private static native java.util.List __call13020113_192(moom.oe a0) throws Throwable;
private static native java.util.Iterator __call13020113_193(java.util.List a0) throws Throwable;
private static native boolean __call13020113_194(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020113_195(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020113_196(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite13020113_197(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite13020113_198(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead13020113_199(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite13020113_200(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020113_201(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_202(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_203(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020113_204(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020113_205(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020113_206(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020113_207(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_208(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020113_209(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native void __call13020113_210(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.List __call13020113_211(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020113_212(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.util.List a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __call13020113_213(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020113_214(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.resources.data.AnimationMetadataSection a1) throws Throwable;
private static native void __fieldWrite13020113_215(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite13020113_216(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead13020113_217(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite13020113_218(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020113_219(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020113_220(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __call13020113_221(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __call13020113_222(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020113_223(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_224(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_225(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020113_226(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020113_227(int[][] a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.Minecraft __call13020113_228() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call13020113_229(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead13020113_230() throws Throwable;
private static native void __call13020113_231(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __call13020113_232(moom.oe a0) throws Throwable;
private static native int __call13020113_233(moom.oe a0) throws Throwable;
private static native void __call13020113_234(net.minecraft.client.renderer.texture.TextureMap a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call13020113_235(java.lang.String a0) throws Throwable;
private static native boolean __call13020113_236(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead13020113_237(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __invokedynamic13020113_238(java.lang.String a0) throws Throwable;
private static native void __call13020113_239(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead13020113_240(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __call13020113_241(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic13020113_242(java.lang.String a0) throws Throwable;
private static native int __call13020113_243(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020113_244(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020113_245(moom.oe a0) throws Throwable;
private static native int __call13020113_246(moom.oe a0) throws Throwable;
private static native void __call13020113_247(java.lang.String a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native java.lang.Exception __call13020114_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020115_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020116_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020117_0(java.io.IOException a0) throws Throwable;
private static native moom.qY __call13020118_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call13020118_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic13020118_2(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020118_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic13020118_4(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020118_5(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic13020118_6(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020118_7(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native int __fieldRead13020118_8(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.Integer __call13020118_9(int a0) throws Throwable;
private static native void __call13020118_10(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Exception __call13020120_0(java.io.IOException a0) throws Throwable;
private static native moom.qY __call13020121_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call13020121_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead13020121_2(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call13020121_3(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call13020121_4(moom.qZ a0, java.lang.String a1, net.minecraft.client.renderer.texture.TextureAtlasSprite a2) throws Throwable;
private static native java.lang.Exception __call13020122_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13020123_0(java.io.IOException a0) throws Throwable;
private static native java.lang.String __invokedynamic13020124_0(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native void __call13020124_1(java.lang.String a0) throws Throwable;
private static native void __call13020124_2(java.lang.Exception a0) throws Throwable;
private static native boolean __call13020124_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13020124_4(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast13020124_5(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite13020124_6(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite13020124_7(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead13020124_8(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite13020124_9(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead13020124_10(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020124_11(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020124_12(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020124_13(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020124_14(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020124_15(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020124_16(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020124_17(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020124_18(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native void __call13020124_19(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.List __call13020124_20(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020124_21(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.util.List a1) throws Throwable;
private static native net.minecraft.client.resources.data.AnimationMetadataSection __call13020124_22(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020124_23(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.resources.data.AnimationMetadataSection a1) throws Throwable;
private static native void __fieldWrite13020124_24(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite13020124_25(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __fieldRead13020124_26(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite13020124_27(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020124_28(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020124_29(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __call13020124_30(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[][] __call13020124_31(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native int __call13020124_32(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020124_33(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020124_34(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call13020124_35(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call13020124_36(int[][] a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.Minecraft __call13020124_37() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call13020124_38(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead13020124_39() throws Throwable;
private static native void __call13020124_40(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __call13020124_41(moom.oe a0) throws Throwable;
private static native int __call13020124_42(moom.oe a0) throws Throwable;
private static native void __call13020124_43(net.minecraft.client.renderer.texture.TextureMap a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call13020124_44(java.lang.String a0) throws Throwable;
private static native boolean __call13020124_45(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead13020124_46(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __invokedynamic13020124_47(java.lang.String a0) throws Throwable;
private static native void __call13020124_48(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead13020124_49(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.lang.String __call13020124_50(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic13020124_51(java.lang.String a0) throws Throwable;
private static native int __call13020124_52(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead13020124_53(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __call13020124_54(moom.oe a0) throws Throwable;
private static native int __call13020124_55(moom.oe a0) throws Throwable;
private static native void __call13020124_56(java.lang.String a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native java.lang.Exception __call13020125_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_12e33cea2a44f378e8cd(net.minecraft.client.renderer.texture.TextureMap a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws E;
private static final class __SourceHandler_12e33cea2a44f378e8cd {

public static boolean f1423(net.minecraft.client.renderer.texture.TextureMap receiver, net.minecraft.client.renderer.texture.TextureAtlasSprite p0) throws Throwable {
    int forwardValue1423_40_0;
    forward_join_40: {
    forward_join_39: {
    forward_join_37: {
    forward_join_35: {
    forward_join_33: {
    forward_join_31: {
    forward_join_23: {
    if (!((p0 != __fieldRead1423_0()))) {
        break forward_join_39;
    }
    if (!((p0 != __fieldRead1423_1()))) {
        break forward_join_39;
    }
    if (!((p0 != __fieldRead1423_2()))) {
        break forward_join_37;
    }
    if (!((p0 != __fieldRead1423_3()))) {
        break forward_join_37;
    }
    if (!((p0 != __fieldRead1423_4()))) {
        break forward_join_35;
    }
    if (!((p0 != __fieldRead1423_5()))) {
        break forward_join_35;
    }
    if (!((p0 == __fieldRead1423_6()))) {
        break forward_join_23;
    }
    forwardValue1423_40_0 = __integerCategory1423_8(__call1423_7());
    break forward_join_40;
    }
    if (!((p0 != __fieldRead1423_9()))) {
        break forward_join_31;
    }
    if (!((p0 != __fieldRead1423_10()))) {
        break forward_join_31;
    }
    if (!(__call1423_11())) {
        break forward_join_33;
    }
    }
    forwardValue1423_40_0 = 1;
    break forward_join_40;
    }
    forwardValue1423_40_0 = 0;
    break forward_join_40;
    }
    forwardValue1423_40_0 = __integerCategory1423_13(__call1423_12());
    break forward_join_40;
    }
    forwardValue1423_40_0 = __integerCategory1423_15(__call1423_14());
    break forward_join_40;
    }
    forwardValue1423_40_0 = __integerCategory1423_17(__call1423_16());
    }
    return __integerCategory1423_18(forwardValue1423_40_0);
}
public static void h1423_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142300_0(p0);
}
public static void h1423_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142301_0(p0);
}
public static void h1423_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142302_0(p0);
}
public static void h1423_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142303_0(p0);
}
public static void h1423_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142304_0(p0);
}
public static void h1423_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142305_0(p0);
}
public static void h1423_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142306_0(p0);
}
public static void h1423_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142307_0(p0);
}
public static void h1423_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142308_0(p0);
}
public static void h1423_9(java.lang.RuntimeException p0) throws Throwable {
    throw __call1142309_0(p0);
}
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead1423_0() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead1423_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead1423_2() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead1423_3() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead1423_4() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead1423_5() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead1423_6() throws Throwable;
private static native boolean __call1423_7() throws Throwable;
private static native int __integerCategory1423_8(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead1423_9() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead1423_10() throws Throwable;
private static native boolean __call1423_11() throws Throwable;
private static native boolean __call1423_12() throws Throwable;
private static native int __integerCategory1423_13(boolean value) throws Throwable;
private static native boolean __call1423_14() throws Throwable;
private static native int __integerCategory1423_15(boolean value) throws Throwable;
private static native boolean __call1423_16() throws Throwable;
private static native int __integerCategory1423_17(boolean value) throws Throwable;
private static native boolean __integerCategory1423_18(int value) throws Throwable;
private static native java.lang.Exception __call1142300_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1142301_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1142302_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1142303_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1142304_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1142305_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1142306_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1142307_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1142308_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1142309_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_757ee82eb43f918df641(net.minecraft.client.renderer.texture.TextureMap a0) throws E;
private static final class __SourceHandler_757ee82eb43f918df641 {

public static void f620(net.minecraft.client.renderer.texture.TextureMap receiver) throws Throwable {
    int life1_1;
    int life2_3;
    int life3_8;
    java.util.Iterator life4_12;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life5_19;
    java.util.Iterator life4_48;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life5_55;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life6_62;
    java.util.Iterator life4_103;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life5_110;
    java.util.Iterator life4_152;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life5_159;
    int life4_204;
    forest_join_199: {
    forest_join_196: {
    forest_join_182: {
    forest_join_179: {
    forest_join_175: {
    forest_join_131: {
    forest_join_85: {
    forest_join_82: {
    forest_join_41: {
    life1_1 = 0;
    life2_3 = 0;
    __call620_1(__call620_0(receiver));
    life3_8 = 0;
    life4_12 = __call620_3(__fieldRead620_2(receiver));
    forest_cycle_13: while (true) {
    forest_join_40: {
    forest_join_35: {
    forest_join_30: {
    if (!(__call620_4(life4_12))) {
        break forest_join_41;
    }
    life5_19 = __cast620_6(__call620_5(life4_12));
    if (!(__call620_7(receiver, life5_19))) {
        break forest_join_40;
    }
    __call620_8(life5_19);
    if (!(__call620_9(life5_19))) {
        break forest_join_30;
    }
    life3_8 += 1;
    }
    if (!((__fieldRead620_10(life5_19) != null))) {
        break forest_join_35;
    }
    life1_1 = 1;
    }
    if (!((__fieldRead620_11(life5_19) != null))) {
        break forest_join_40;
    }
    life2_3 = 1;
    }
    continue forest_cycle_13;
    }
    }
    if (!(__call620_12())) {
        break forest_join_85;
    }
    life4_48 = __call620_14(__fieldRead620_13(receiver));
    forest_cycle_47: while (true) {
    forest_join_81: {
    forest_join_73: {
    forest_join_69: {
    if (!(__call620_15(life4_48))) {
        break forest_join_82;
    }
    life5_55 = __cast620_17(__call620_16(life4_48));
    if (!(__call620_18(receiver, life5_55))) {
        break forest_join_81;
    }
    life6_62 = __fieldRead620_19(life5_55);
    if (!((life6_62 != null))) {
        break forest_join_81;
    }
    if (!((life5_55 != __fieldRead620_20()))) {
        break forest_join_69;
    }
    if (!((life5_55 == __fieldRead620_21()))) {
        break forest_join_73;
    }
    }
    __fieldWrite620_23(life6_62, __fieldRead620_22(life5_55));
    }
    __call620_24(life5_55);
    __call620_25(life6_62);
    if (!(__call620_26(life6_62))) {
        break forest_join_81;
    }
    life3_8 += 1;
    }
    continue forest_cycle_47;
    }
    }
    __call620_28(__call620_27(receiver));
    }
    if (!(__call620_29())) {
        break forest_join_182;
    }
    if (!((life1_1 != 0))) {
        break forest_join_131;
    }
    __call620_32(__fieldRead620_31(__call620_30(receiver)));
    life4_103 = __call620_34(__fieldRead620_33(receiver));
    forest_cycle_97: while (true) {
    forest_join_130: {
    forest_join_122: {
    forest_join_117: {
    if (!(__call620_35(life4_103))) {
        break forest_join_131;
    }
    life5_110 = __cast620_37(__call620_36(life4_103));
    if (!((__fieldRead620_38(life5_110) != null))) {
        break forest_join_130;
    }
    if (!(__call620_39(receiver, life5_110))) {
        break forest_join_130;
    }
    if (!((life5_110 != __fieldRead620_40()))) {
        break forest_join_117;
    }
    if (!((life5_110 == __fieldRead620_41()))) {
        break forest_join_122;
    }
    }
    __fieldWrite620_44(__fieldRead620_42(life5_110), __fieldRead620_43(life5_110));
    }
    __call620_46(__fieldRead620_45(life5_110));
    if (!(__call620_48(__fieldRead620_47(life5_110)))) {
        break forest_join_130;
    }
    life3_8 += 1;
    }
    continue forest_cycle_97;
    }
    }
    if (!((life2_3 != 0))) {
        break forest_join_175;
    }
    __call620_51(__fieldRead620_50(__call620_49(receiver)));
    life4_152 = __call620_53(__fieldRead620_52(receiver));
    forest_cycle_141: while (true) {
    forest_join_174: {
    forest_join_166: {
    forest_join_161: {
    if (!(__call620_54(life4_152))) {
        break forest_join_175;
    }
    life5_159 = __cast620_56(__call620_55(life4_152));
    if (!((__fieldRead620_57(life5_159) != null))) {
        break forest_join_174;
    }
    if (!(__call620_58(receiver, life5_159))) {
        break forest_join_174;
    }
    if (!((life5_159 != __fieldRead620_59()))) {
        break forest_join_161;
    }
    if (!((life5_159 == __fieldRead620_60()))) {
        break forest_join_166;
    }
    }
    __fieldWrite620_63(__fieldRead620_61(life5_159), __fieldRead620_62(life5_159));
    }
    __call620_65(__fieldRead620_64(life5_159));
    if (!(__call620_67(__fieldRead620_66(life5_159)))) {
        break forest_join_174;
    }
    life3_8 += 1;
    }
    continue forest_cycle_141;
    }
    }
    if (!((life1_1 == 0))) {
        break forest_join_179;
    }
    if (!((life2_3 != 0))) {
        break forest_join_182;
    }
    }
    __call620_69(__call620_68(receiver));
    }
    life4_204 = __fieldRead620_72(__fieldRead620_71(__call620_70()));
    if (!((life4_204 != __fieldRead620_73(receiver)))) {
        break forest_join_196;
    }
    __fieldWrite620_74(receiver, life3_8);
    __fieldWrite620_75(receiver, life4_204);
    }
    if (!(__call620_76())) {
        break forest_join_199;
    }
    __call620_77();
    }
    return;
}
public static void h620_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062000_0(p0);
}
public static void h620_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062001_0(p0);
}
public static void h620_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062002_0(p0);
}
public static void h620_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062003_0(p0);
}
public static void h620_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062004_0(p0);
}
public static void h620_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062005_0(p0);
}
public static void h620_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062006_0(p0);
}
public static void h620_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062007_0(p0);
}
public static void h620_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062008_0(p0);
}
public static void h620_9(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062009_0(p0);
}
public static void h620_10(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062010_0(p0);
}
public static void h620_11(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062011_0(p0);
}
public static void h620_12(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062012_0(p0);
}
public static void h620_13(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062013_0(p0);
}
public static void h620_14(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062014_0(p0);
}
public static void h620_15(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062015_0(p0);
}
public static void h620_16(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062016_0(p0);
}
public static void h620_17(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062017_0(p0);
}
public static void h620_18(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062018_0(p0);
}
public static void h620_19(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062019_0(p0);
}
public static void h620_20(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062020_0(p0);
}
private static native int __call620_0(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call620_1(int a0) throws Throwable;
private static native java.util.List __fieldRead620_2(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Iterator __call620_3(java.util.List a0) throws Throwable;
private static native boolean __call620_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call620_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast620_6(java.lang.Object a0) throws Throwable;
private static native boolean __call620_7(net.minecraft.client.renderer.texture.TextureMap a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native void __call620_8(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call620_9(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_10(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_11(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call620_12() throws Throwable;
private static native java.util.List __fieldRead620_13(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Iterator __call620_14(java.util.List a0) throws Throwable;
private static native boolean __call620_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call620_16(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast620_17(java.lang.Object a0) throws Throwable;
private static native boolean __call620_18(net.minecraft.client.renderer.texture.TextureMap a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_19(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_20() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_21() throws Throwable;
private static native int __fieldRead620_22(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __fieldWrite620_23(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __call620_24(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call620_25(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call620_26(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call620_27(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call620_28(int a0) throws Throwable;
private static native boolean __call620_29() throws Throwable;
private static native moom.MA __call620_30(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead620_31(moom.MA a0) throws Throwable;
private static native void __call620_32(int a0) throws Throwable;
private static native java.util.List __fieldRead620_33(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Iterator __call620_34(java.util.List a0) throws Throwable;
private static native boolean __call620_35(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call620_36(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast620_37(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_38(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call620_39(net.minecraft.client.renderer.texture.TextureMap a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_40() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_41() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_42(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead620_43(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __fieldWrite620_44(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_45(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call620_46(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_47(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call620_48(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native moom.MA __call620_49(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead620_50(moom.MA a0) throws Throwable;
private static native void __call620_51(int a0) throws Throwable;
private static native java.util.List __fieldRead620_52(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native java.util.Iterator __call620_53(java.util.List a0) throws Throwable;
private static native boolean __call620_54(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call620_55(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __cast620_56(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_57(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call620_58(net.minecraft.client.renderer.texture.TextureMap a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_59() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_60() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_61(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __fieldRead620_62(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __fieldWrite620_63(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_64(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __call620_65(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead620_66(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call620_67(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call620_68(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call620_69(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call620_70() throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead620_71(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead620_72(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead620_73(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite620_74(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __fieldWrite620_75(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native boolean __call620_76() throws Throwable;
private static native void __call620_77() throws Throwable;
private static native java.lang.Exception __call3062000_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062001_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062002_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062003_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062004_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062005_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062006_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062007_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062008_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062009_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062010_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062011_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062012_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062013_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062014_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062015_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062016_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062017_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062018_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062019_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3062020_0(java.lang.RuntimeException a0) throws Throwable;

}


public net.minecraft.client.renderer.texture.TextureAtlasSprite b(java.lang.String p0) {
return ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((java.util.Map)(this.m)).get(((java.lang.Object)(p0)))));
}


public void b__Void() {
((net.minecraft.client.renderer.texture.TextureMap)(this)).e__Void();
    return;
}


private boolean b(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) { return __sourceHandlerCall_12e33cea2a44f378e8cd(this, p0); }


public net.minecraft.client.renderer.texture.TextureAtlasSprite b(moom.DD p0) {
return ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((java.util.Map)(this.m)).get(((java.lang.Object)(((moom.DD)(p0)).toString())))));
}


public void b(moom.oR p0) { __sourceHandlerCall_cb489224062be3442080(this, p0); }


public void e__Void() { __sourceHandlerCall_757ee82eb43f918df641(this); }


public int e() {
return ((moom.NK)(this.z)).b();
}


public net.minecraft.client.renderer.texture.TextureAtlasSprite c(java.lang.String p0) {
moom.DD local2 = new moom.DD(p0);
    return ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((java.util.Map)(this.m)).get(((java.lang.Object)(((moom.DD)(local2)).toString())))));
}


public int h() {
return this.C;
}


private int f() {
long local1 = (net.minecraft.client.renderer.texture.TextureMap.F ^ 116296007480601L);
    int local3 = (1 << this.q);
    if ((local3 < __sourceIntrinsic_d5f736cb4191_invokedynamic10846_2(19230, (1770901425498138495L ^ local1)))) {
        local3 = __sourceIntrinsic_d5f736cb4191_invokedynamic10846_3(6525, (8036120117955556632L ^ local1));
    }
    return local3;
}


private void d__Void() {
int local1 = ((net.minecraft.client.renderer.texture.TextureMap)(this)).f();
    int[] local2 = ((net.minecraft.client.renderer.texture.TextureMap)(this)).a__ArrayInt(((int)(local1)));
    ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.r)).a(((int)(local1)));
    ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.r)).b(((int)(local1)));
    int[][] local3 = new int[(this.q + 1)][];
    (local3)[0] = local2;
    ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.r)).a(((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(new int[][][] {local3}))))));
    ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.r)).e(((int)(((moom.NK)(this.z)).a())));
    return;
}


public int d() {
return this.q;
}


private int[] a__ArrayInt(int p0) {
long local2 = (net.minecraft.client.renderer.texture.TextureMap.F ^ 133357902990303L);
    java.awt.image.BufferedImage local4 = new java.awt.image.BufferedImage(__sourceIntrinsic_89672034bdfc_originalDynamicSite1840_1(27998, (2056108662523396094L ^ local2)), __sourceIntrinsic_89672034bdfc_originalDynamicSite1840_2(27998, (2056108662523396094L ^ local2)), 2);
    ((java.awt.image.BufferedImage)(local4)).setRGB(((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_89672034bdfc_originalDynamicSite1840_3(27998, (2056108662523396094L ^ local2)))), ((int)(__sourceIntrinsic_89672034bdfc_originalDynamicSite1840_4(27998, (2056108662523396094L ^ local2)))), ((int[])(moom.ol.d)), ((int)(0)), ((int)(__sourceIntrinsic_89672034bdfc_originalDynamicSite1840_6(27998, (2056108662523396094L ^ local2)))));
    java.awt.image.BufferedImage local5 = moom.Oc.a(((java.awt.image.BufferedImage)(local4)), ((int)(p0)));
    int[] local6 = new int[(p0 * p0)];
    ((java.awt.image.BufferedImage)(local5)).getRGB(((int)(0)), ((int)(0)), ((int)(p0)), ((int)(p0)), ((int[])(local6)), ((int)(0)), ((int)(p0)));
    return local6;
}


private int a(java.util.Map<java.lang.Object, java.lang.Object> p0, moom.oR p1, int p2) { return __sourceHandlerCall_7c895286d0dd214dd7d9(this, p0, p1, p2); }


private int a(java.util.Map p0, moom.oR p1) {
long life3_3;
    int life5_13;
    int life5_29;
    int life6_45;
    life3_3 = (net.minecraft.client.renderer.texture.TextureMap.F ^ 103215392662455L);
    life5_13 = ((net.minecraft.client.renderer.texture.TextureMap)(this)).a(((java.util.Map)(p0)), ((moom.oR)(p1)), ((int)(__sourceIntrinsic_60a8a3e10e12_invokedynamic2673_1(15525, (852131048711587439L ^ life3_3)))));
    if ((life5_13 < __sourceIntrinsic_60a8a3e10e12_invokedynamic2673_3(4341, (2223523329529063996L ^ life3_3)))) {
        life5_13 = __sourceIntrinsic_60a8a3e10e12_invokedynamic2673_4(27998, (2056147737508861846L ^ life3_3));
    }
    life5_29 = moom.Dr.b(((int)(life5_13)));
    try {
        if ((life5_29 > __sourceIntrinsic_60a8a3e10e12_invokedynamic2673_6(27998, (2056147737508861846L ^ life3_3)))) {
        moom.BU.e(((java.lang.String)(__sourceIntrinsic_60a8a3e10e12_invokedynamic2673_7(life5_29))));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw __sourceExactCall_e7fe476b9ea4de(((java.lang.Exception)(caught_rethrow_0)));
    }
    life6_45 = moom.Dr.d(((int)(life5_29)));
    if ((life6_45 < 4)) {
        life6_45 = 4;
    }
    return life6_45;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30873;
      if (K[var3] == null) {
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
         long var5 = J[var3];
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
         Object[] var9 = (Object[])L.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               L.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/n8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         K[var3] = var15;
      }

      return K[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_f457df95bfe86a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10849_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/n8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean() { return __sourceHandlerCall_a2bddac479e954a5dd6e(this); }


private void a(int p0, int p1) { __sourceHandlerCall_60c152032c6046af7eb8(this, p0, p1); }


public net.minecraft.client.renderer.texture.TextureAtlasSprite a(double p0, double p1) { return __sourceHandlerCall_4b9bbd2d12e788fb2787(this, p0, p1); }


private void a(moom.DD p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1) { __sourceHandlerCall_6bdc0bef716251f5a11c(this, p0, p1); }


public moom.DD a(moom.DD p0, int p1) { return __sourceHandlerCall_f4ffaacc9d01905d1b88(this, p0, p1); }


public net.minecraft.client.renderer.texture.TextureAtlasSprite a(java.lang.String p0) {
java.lang.Object local2 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((java.util.Map)(this.n)).get(((java.lang.Object)(p0)))));
    if ((local2 == null)) {
        local2 = this.r;
    }
    return ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local2));
}


public net.minecraft.client.renderer.texture.TextureAtlasSprite a__oh(moom.DD p0) { return __sourceHandlerCall_03f57f458cd8ee35c802(this, p0); }


public void a(int p0) {
this.q = ((int)(p0));
    return;
}


public moom.DD a(moom.DD p0) {
return ((net.minecraft.client.renderer.texture.TextureMap)(this)).a(((moom.DD)(p0)), ((int)(0)));
}


public void a(moom.oR p0, net.minecraft.client.renderer.texture.IIconCreator p1) {
try {
        ((java.util.Map)(this.m)).clear();
        ((moom.NK)(this.z)).a__Void();
        ((net.minecraft.client.renderer.texture.IIconCreator)(p1)).a(((net.minecraft.client.renderer.texture.TextureMap)(this)));
        if ((this.q >= 4)) {
        this.q = ((int)(((net.minecraft.client.renderer.texture.TextureMap)(this)).a(((java.util.Map)(this.m)), ((moom.oR)(p0)))));
        moom.BU.e(((java.lang.String)(__sourceIntrinsic_b4e5191e2d32_invokedynamic2678_10(this.q))));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw __sourceExactCall_e7fe476b9ea4de(((java.lang.Exception)(caught_rethrow_0)));
    }
    ((net.minecraft.client.renderer.texture.TextureMap)(this)).d__Void();
    ((net.minecraft.client.renderer.texture.TextureMap)(this)).c__Void();
    ((net.minecraft.client.renderer.texture.TextureMap)(this)).b(((moom.oR)(p0)));
    return;
}


public void a(moom.oR p0) throws java.io.IOException {
try {
        if ((this.p != null)) {
        ((net.minecraft.client.renderer.texture.TextureMap)(this)).a(((moom.oR)(p0)), ((net.minecraft.client.renderer.texture.IIconCreator)(this.p)));
    }
    } catch (java.io.IOException caught_rethrow_0) {
        throw __sourceExactCall_e7fe476b9ea4de(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private boolean a__Boolean(java.lang.String p0) { return __sourceHandlerCall_323ce2377b888c848c87(this, p0); }


public boolean a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.renderer.texture.TextureMap)(this)).a(((java.lang.String)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).a__String())), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0))))) != 0);
}


public java.lang.String a__String() {
return this.o;
}


private boolean a__Boolean(moom.DD p0) {
java.lang.Object local2 = ((moom.DD)(p0)).a();
    return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.renderer.texture.TextureMap)(this)).a__Boolean(((java.lang.String)(local2))))) != 0);
}


public net.minecraft.client.renderer.texture.TextureAtlasSprite a__oh() {
return this.r;
}


public boolean a(java.lang.String p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1) { return __sourceHandlerCall_5ecc17e77f5bf7d8e381(this, p0, p1); }


public int g() {
return ((java.util.List)(this.l)).size();
}


private static java.lang.String lambda$loadTextureAtlas$0(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) throws java.lang.Exception {
return ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).a__String();
}


private static java.lang.String lambda$loadTextureAtlas$1(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) throws java.lang.Exception {
return __sourceIntrinsic_9d6d7ac6b41e_originalDynamicSite1841_2(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).c__Int(), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).d__Int());
}


private static java.lang.String lambda$loadTextureAtlas$2(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) throws java.lang.Exception {
return __sourceIntrinsic_1d0190851eb4_originalDynamicSite1842_1(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).e());
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10849_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60a8a3e10e12_invokedynamic2673_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60a8a3e10e12_invokedynamic2673_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60a8a3e10e12_invokedynamic2673_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60a8a3e10e12_invokedynamic2673_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60a8a3e10e12_invokedynamic2673_7(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b4e5191e2d32_invokedynamic2678_10(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_89672034bdfc_originalDynamicSite1840_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_89672034bdfc_originalDynamicSite1840_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_89672034bdfc_originalDynamicSite1840_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_89672034bdfc_originalDynamicSite1840_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_89672034bdfc_originalDynamicSite1840_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_invokedynamic10846_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_invokedynamic10846_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9d6d7ac6b41e_originalDynamicSite1841_2(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1d0190851eb4_originalDynamicSite1842_1(int a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native java.lang.Exception __sourceExactCall_e7fe476b9ea4de(java.lang.Exception p0);
private static native int __sourceExactCall_f457df95bfe86a(int p0, long p1);
}
