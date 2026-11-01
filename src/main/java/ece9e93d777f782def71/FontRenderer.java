package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FontRenderer implements net.minecraft.client.resources.IResourceManagerReloadListener {

private static moom.DD[] a;

private int[] b;

public int c;

public java.util.Random d;

private byte[] e;

private int[] f;

private moom.DD g;

private net.minecraft.client.renderer.texture.TextureManager h;

private float i;

private float j;

private boolean k;

private boolean l;

private float m;

private float n;

private float o;

private float p;

private int q;

private boolean r;

private boolean s;

private boolean t;

private boolean u;

private boolean v;

public net.minecraft.client.settings.GameSettings w;

public moom.DD x;

public float y;

private float[] z;

private boolean A;

private moom.Mh B;

private java.util.HashMap<java.lang.String, java.lang.Integer> C;

private boolean D;

private static boolean E;

private static long F;

private static long[] G;

private static java.lang.Integer[] H;

private static java.util.Map I;

public FontRenderer(net.minecraft.client.settings.GameSettings p0, moom.DD p1, net.minecraft.client.renderer.texture.TextureManager p2, boolean p3) { super(); __sourceHandlerCall_5a5e48d508c2d43d28a1(this, p0, p1, p2, p3); }


static {
F = ((long)(((moom._a)(moom._c.a(((long)(217006497646121149L)), ((long)(6276068622443723321L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(163167614737438L)))));
    long local11_life6 = (net.minecraft.client.gui.FontRenderer.F ^ 20542243914740L);
    int __sourceSpill1765_8 = 0;
    I = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.client.gui.FontRenderer.c(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill1765_8))));
    javax.crypto.Cipher local0_life11;
    javax.crypto.Cipher __sourceSpill1765_13 = (local0_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1765_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1765_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1765_16 = new byte[8];
    (__sourceSpill1765_16)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life17 = 1;
    while ((local1_life17 < 8)) {
        (__sourceSpill1765_16)[local1_life17] = ((byte) ((int) ((local11_life6 << (local1_life17 * 8)) >>> 56)));
        local1_life17 += 1;
    }
    byte[] __sourcePreallocation1765_18 = __sourceSpill1765_16;
    ((javax.crypto.Cipher)(__sourceSpill1765_13)).init(((int)(__sourceSpill1765_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1765_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1765_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life21 = new long[69];
    int local3_life22 = 0;
    java.lang.String local4_life23;
    int local5_life25 = ((java.lang.String)((local4_life23 = "³í:¡½$\006U,9ó|Ä\0235-\023íÕ@`\003,$KsÉ[\013\\ \1777\021ZPG¼Moà(\003Z\004Üa«Uãw½Êñ«vÀW\037l1<\036&_FyGÞè\036!9Iùô»\000,xV`ù%ô\022b¸±\031 #i^\001Ä©Ó?ß\033y\"\034t¡\004\027®\0075ÃÉfªû^\016Zß©-PN×ô{ñn8¯ï\022Ê0Ì\fxqM\022\034{]Ä¦»ÀÕqqR%jNÒØa\001.\006èñ9×Ãnì0¶Þ,c\023\005\033,éí\037håZïp´Å`oóøÆ\013Ã@yø¤Õ\035¥ùi\rxêøï*1ê\t©c\026\"ÿhYýGHW?p\037Ê\005ñ7ò\031\0278\016jE^æ5\020þÃ¬s*÷{`\022\f;­\031¯\006Ú\031Neâ²»³ñÐu8ÊJa\000nI_\013:º¨Ç(±\033òÔ>ý´9¼Þ)0]r½Tß\030\003Ý\0229Åÿüý\026o§EDtr$·\013@îdJ&ÉòY±*¥áF\r\177\032\034Ö&\023©\022Ó\017ÏÓ\031×Å¬46ÿié&@À\013+\013­ÆãFÅp©\013N\026íºSêMg\036\001ÙÌÑÎ/l®ö¸÷¾Ãì\013\013\024´7Øt×¾ñN²\fïÊò\"ýêóLF¡Pî\t,½`u]E%Ñ)%Þ~ ä\002ì&k\000\003\0207îEÀDµ\027éÍ2[pDÈ\005Ã\\\fQg\023\001\016\025HâøÌL¶¤Lû"))).length();
    int local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1765_27 = local4_life23;
        int __sourceSpill1765_28 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1765_27)).substring(((int)(__sourceSpill1765_28)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1765_32 = local6_life21;
        int __sourceSpill1765_33 = local3_life22;
        local3_life22 += 1;
        long local8_life34 = (((((((((((long) (local7_life31)[0]) & 255L) << 56) | ((((long) (local7_life31)[1]) & 255L) << 48)) | ((((long) (local7_life31)[2]) & 255L) << 40)) | ((((long) (local7_life31)[3]) & 255L) << 32)) | ((((long) (local7_life31)[4]) & 255L) << 24)) | ((((long) (local7_life31)[5]) & 255L) << 16)) | ((((long) (local7_life31)[6]) & 255L) << 8)) | (((long) (local7_life31)[7]) & 255L));
        byte[] __sourceSpill1765_35 = new byte[8];
        (__sourceSpill1765_35)[0] = ((byte) ((int) (local8_life34 >>> 56)));
        (__sourceSpill1765_35)[1] = ((byte) ((int) (local8_life34 >>> 48)));
        (__sourceSpill1765_35)[2] = ((byte) ((int) (local8_life34 >>> 40)));
        (__sourceSpill1765_35)[3] = ((byte) ((int) (local8_life34 >>> 32)));
        (__sourceSpill1765_35)[4] = ((byte) ((int) (local8_life34 >>> 24)));
        (__sourceSpill1765_35)[5] = ((byte) ((int) (local8_life34 >>> 16)));
        (__sourceSpill1765_35)[6] = ((byte) ((int) (local8_life34 >>> 8)));
        (__sourceSpill1765_35)[7] = ((byte) ((int) local8_life34));
        javax.crypto.Cipher __sourceSpill1765_36 = local0_life11;
        byte[] local10_life38 = ((javax.crypto.Cipher)(__sourceSpill1765_36)).doFinal(((byte[])(__sourceSpill1765_35)));
        (__sourceSpill1765_32)[__sourceSpill1765_33] = (((((((((((long) (local10_life38)[0]) & 255L) << 56) | ((((long) (local10_life38)[1]) & 255L) << 48)) | ((((long) (local10_life38)[2]) & 255L) << 40)) | ((((long) (local10_life38)[3]) & 255L) << 32)) | ((((long) (local10_life38)[4]) & 255L) << 24)) | ((((long) (local10_life38)[5]) & 255L) << 16)) | ((((long) (local10_life38)[6]) & 255L) << 8)) | (((long) (local10_life38)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    local5_life25 = ((java.lang.String)((local4_life23 = "\035ÄíÏ$\t÷ó\025á¶\006bñ"))).length();
    local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1765_40 = local4_life23;
        int __sourceSpill1765_41 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1765_40)).substring(((int)(__sourceSpill1765_41)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1765_45 = local6_life21;
        int __sourceSpill1765_46 = local3_life22;
        local3_life22 += 1;
        long local8_life47 = (((((((((((long) (local7_life44)[0]) & 255L) << 56) | ((((long) (local7_life44)[1]) & 255L) << 48)) | ((((long) (local7_life44)[2]) & 255L) << 40)) | ((((long) (local7_life44)[3]) & 255L) << 32)) | ((((long) (local7_life44)[4]) & 255L) << 24)) | ((((long) (local7_life44)[5]) & 255L) << 16)) | ((((long) (local7_life44)[6]) & 255L) << 8)) | (((long) (local7_life44)[7]) & 255L));
        byte[] __sourceSpill1765_48 = new byte[8];
        (__sourceSpill1765_48)[0] = ((byte) ((int) (local8_life47 >>> 56)));
        (__sourceSpill1765_48)[1] = ((byte) ((int) (local8_life47 >>> 48)));
        (__sourceSpill1765_48)[2] = ((byte) ((int) (local8_life47 >>> 40)));
        (__sourceSpill1765_48)[3] = ((byte) ((int) (local8_life47 >>> 32)));
        (__sourceSpill1765_48)[4] = ((byte) ((int) (local8_life47 >>> 24)));
        (__sourceSpill1765_48)[5] = ((byte) ((int) (local8_life47 >>> 16)));
        (__sourceSpill1765_48)[6] = ((byte) ((int) (local8_life47 >>> 8)));
        (__sourceSpill1765_48)[7] = ((byte) ((int) local8_life47));
        javax.crypto.Cipher __sourceSpill1765_49 = local0_life11;
        byte[] local10_life51 = ((javax.crypto.Cipher)(__sourceSpill1765_49)).doFinal(((byte[])(__sourceSpill1765_48)));
        (__sourceSpill1765_45)[__sourceSpill1765_46] = (((((((((((long) (local10_life51)[0]) & 255L) << 56) | ((((long) (local10_life51)[1]) & 255L) << 48)) | ((((long) (local10_life51)[2]) & 255L) << 40)) | ((((long) (local10_life51)[3]) & 255L) << 32)) | ((((long) (local10_life51)[4]) & 255L) << 24)) | ((((long) (local10_life51)[5]) & 255L) << 16)) | ((((long) (local10_life51)[6]) & 255L) << 8)) | (((long) (local10_life51)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    G = ((long[])(local6_life21));
    H = ((java.lang.Integer[])(new java.lang.Integer[69]));
    a = ((moom.DD[])(new moom.DD[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1765_54(5185, (1906017456305791365L ^ local11_life6))]));
}

private static native <E extends Throwable> void __sourceHandlerCall_5a5e48d508c2d43d28a1(net.minecraft.client.gui.FontRenderer a0, net.minecraft.client.settings.GameSettings a1, moom.DD a2, net.minecraft.client.renderer.texture.TextureManager a3, boolean a4) throws E;
private static final class __SourceHandler_5a5e48d508c2d43d28a1 {

public static void f529(net.minecraft.client.gui.FontRenderer receiver, net.minecraft.client.settings.GameSettings p0, moom.DD p1, net.minecraft.client.renderer.texture.TextureManager p2, boolean p3) throws Throwable {
    long life5_3;
    int life7_91;
    int life8_110;
    int life9_124;
    int life10_138;
    int life11_150;
    int life12_192;
    int life13_214;
    int life14_236;
    forest_join_302: {
    life5_3 = (__fieldRead529_0() ^ 130118606182687L);
    __directSuperInit529_1(receiver);
    __fieldWrite529_3(receiver, new int[__invokedynamic529_2(22565, (1302799452202448679L ^ life5_3))]);
    __fieldWrite529_5(receiver, __invokedynamic529_4(1736, (2589543678816479687L ^ life5_3)));
    __fieldWrite529_6(receiver, new java.util.Random());
    __fieldWrite529_8(receiver, new byte[__invokedynamic529_7(5126, (391499920194403080L ^ life5_3))]);
    __fieldWrite529_10(receiver, new int[__invokedynamic529_9(5331, (7240634302566398958L ^ life5_3))]);
    __fieldWrite529_11(receiver, 0x1.0p0f);
    __fieldWrite529_13(receiver, new float[__invokedynamic529_12(5185, (1906126820196416366L ^ life5_3))]);
    __fieldWrite529_14(receiver, 0);
    __fieldWrite529_15(receiver, new moom.Mh());
    __fieldWrite529_16(receiver, new java.util.HashMap());
    __fieldWrite529_17(receiver, p0);
    __fieldWrite529_18(receiver, p1);
    __fieldWrite529_19(receiver, p1);
    __fieldWrite529_20(receiver, p2);
    __fieldWrite529_21(receiver, p3);
    __fieldWrite529_24(receiver, __call529_23(__fieldRead529_22(receiver)));
    __call529_26(receiver, __fieldRead529_25(receiver));
    life7_91 = 0;
    forest_cycle_92: while (true) {
    forest_join_261: {
    forest_join_242: {
    forest_join_159: {
    if (!((life7_91 < __invokedynamic529_27(22940, (4991588965732202136L ^ life5_3))))) {
        break forest_join_302;
    }
    life8_110 = (((life7_91 >> 3) & 1) * __invokedynamic529_28(20010, (8733669093016281387L ^ life5_3)));
    life9_124 = ((((life7_91 >> 2) & 1) * __invokedynamic529_29(15133, (2962387472297907200L ^ life5_3))) + life8_110);
    life10_138 = ((((life7_91 >> 1) & 1) * __invokedynamic529_30(5291, (1270101355052923835L ^ life5_3))) + life8_110);
    life11_150 = (((life7_91 & 1) * __invokedynamic529_31(5291, (1270101355052923835L ^ life5_3))) + life8_110);
    if (!((life7_91 == __invokedynamic529_32(24975, (112574365732900529L ^ life5_3))))) {
        break forest_join_159;
    }
    life9_124 += 85;
    }
    if (!(__fieldRead529_33(p0))) {
        break forest_join_242;
    }
    life12_192 = ((((life9_124 * __invokedynamic529_34(12798, (2810257367708819177L ^ life5_3))) + (life10_138 * __invokedynamic529_35(31071, (6307191446989837931L ^ life5_3)))) + (life11_150 * __invokedynamic529_36(4354, (7236144439613324851L ^ life5_3)))) / __invokedynamic529_37(24524, (4082672288592965865L ^ life5_3)));
    life13_214 = (((life9_124 * __invokedynamic529_38(21005, (8543761093318851865L ^ life5_3))) + (life10_138 * __invokedynamic529_39(21741, (4597505059660905421L ^ life5_3)))) / __invokedynamic529_40(27908, (2390866458048528956L ^ life5_3)));
    life14_236 = (((life9_124 * __invokedynamic529_41(21005, (8543761093318851865L ^ life5_3))) + (life11_150 * __invokedynamic529_42(24404, (9081596816257265764L ^ life5_3)))) / __invokedynamic529_43(27908, (2390866458048528956L ^ life5_3)));
    life9_124 = life12_192;
    life10_138 = life13_214;
    life11_150 = life14_236;
    }
    if (!((life7_91 >= __invokedynamic529_44(5430, (548178772821211706L ^ life5_3))))) {
        break forest_join_261;
    }
    life9_124 = (life9_124 / 4);
    life10_138 = (life10_138 / 4);
    life11_150 = (life11_150 / 4);
    }
    (__fieldRead529_45(receiver))[life7_91] = ((((life9_124 & __invokedynamic529_46(24422, (4122058941798330447L ^ life5_3))) << __invokedynamic529_47(2553, (7262967051924236028L ^ life5_3))) | ((life10_138 & __invokedynamic529_48(22203, (6497960793295960480L ^ life5_3))) << __invokedynamic529_49(2517, (8829335849139726057L ^ life5_3)))) | (life11_150 & __invokedynamic529_50(22203, (6497960793295960480L ^ life5_3))));
    life7_91 += 1;
    continue forest_cycle_92;
    }
    }
    __call529_51(receiver);
    return;
}
public static void h529_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3052900_0(p0);
}
private static native long __fieldRead529_0() throws Throwable;
private static native void __directSuperInit529_1(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __invokedynamic529_2(int a0, long a1) throws Throwable;
private static native void __fieldWrite529_3(net.minecraft.client.gui.FontRenderer a0, int[] a1) throws Throwable;
private static native int __invokedynamic529_4(int a0, long a1) throws Throwable;
private static native void __fieldWrite529_5(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite529_6(net.minecraft.client.gui.FontRenderer a0, java.util.Random a1) throws Throwable;
private static native int __invokedynamic529_7(int a0, long a1) throws Throwable;
private static native void __fieldWrite529_8(net.minecraft.client.gui.FontRenderer a0, byte[] a1) throws Throwable;
private static native int __invokedynamic529_9(int a0, long a1) throws Throwable;
private static native void __fieldWrite529_10(net.minecraft.client.gui.FontRenderer a0, int[] a1) throws Throwable;
private static native void __fieldWrite529_11(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native int __invokedynamic529_12(int a0, long a1) throws Throwable;
private static native void __fieldWrite529_13(net.minecraft.client.gui.FontRenderer a0, float[] a1) throws Throwable;
private static native void __fieldWrite529_14(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite529_15(net.minecraft.client.gui.FontRenderer a0, moom.Mh a1) throws Throwable;
private static native void __fieldWrite529_16(net.minecraft.client.gui.FontRenderer a0, java.util.HashMap a1) throws Throwable;
private static native void __fieldWrite529_17(net.minecraft.client.gui.FontRenderer a0, net.minecraft.client.settings.GameSettings a1) throws Throwable;
private static native void __fieldWrite529_18(net.minecraft.client.gui.FontRenderer a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite529_19(net.minecraft.client.gui.FontRenderer a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite529_20(net.minecraft.client.gui.FontRenderer a0, net.minecraft.client.renderer.texture.TextureManager a1) throws Throwable;
private static native void __fieldWrite529_21(net.minecraft.client.gui.FontRenderer a0, boolean a1) throws Throwable;
private static native moom.DD __fieldRead529_22(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.DD __call529_23(moom.DD a0) throws Throwable;
private static native void __fieldWrite529_24(net.minecraft.client.gui.FontRenderer a0, moom.DD a1) throws Throwable;
private static native moom.DD __fieldRead529_25(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call529_26(net.minecraft.client.gui.FontRenderer a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic529_27(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_32(int a0, long a1) throws Throwable;
private static native boolean __fieldRead529_33(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __invokedynamic529_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_42(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_43(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_44(int a0, long a1) throws Throwable;
private static native int[] __fieldRead529_45(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __invokedynamic529_46(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic529_50(int a0, long a1) throws Throwable;
private static native void __call529_51(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.lang.Exception __call3052900_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ad967a4fc953c658b08f(net.minecraft.client.gui.FontRenderer a0) throws E;
private static final class __SourceHandler_ad967a4fc953c658b08f {

public static void f547(net.minecraft.client.gui.FontRenderer receiver) throws Throwable {
    long life1_3;
    java.awt.image.BufferedImage life3_9;
    java.util.Properties life4_14;
    int life5_23;
    int life6_26;
    int life7_34;
    int life8_42;
    float life9_47;
    float life10_52;
    float life11_62;
    int[] life12_75;
    int life13_87;
    int life14_102;
    int life15_110;
    int life16_112;
    int life16_116;
    int life17_124;
    int life18_126;
    int life19_128;
    int life20_142;
    int life21_148;
    int life22_162;
    int life13_234;
    forest_join_245: {
    forest_join_223: {
    forest_join_69: {
    life1_3 = (__fieldRead547_0() ^ 4068836446488L);
    life3_9 = __call547_3(__call547_2(receiver, __fieldRead547_1(receiver)));
    life4_14 = __call547_5(__fieldRead547_4(receiver));
    __fieldWrite547_7(receiver, __call547_6(life4_14, "blend", 0));
    life5_23 = __call547_8(life3_9);
    life6_26 = __call547_9(life3_9);
    life7_34 = (life5_23 / __invokedynamic547_10(2553, (7262982289398607611L ^ life1_3)));
    life8_42 = (life6_26 / __invokedynamic547_11(2553, (7262982289398607611L ^ life1_3)));
    life9_47 = (((float) life5_23) / 0x1.0p7f);
    life10_52 = __call547_12(life9_47, 0x1.0p0f, 0x1.0p1f);
    __fieldWrite547_13(receiver, (0x1.0p0f / life10_52));
    life11_62 = __call547_14(life4_14, "offsetBold", -0x1.0p0f);
    if (!((__numericCompare547_15(life11_62, 0x0.0p0f) >= 0))) {
        break forest_join_69;
    }
    __fieldWrite547_16(receiver, life11_62);
    }
    life12_75 = new int[(life5_23 * life6_26)];
    __call547_17(life3_9, 0, 0, life5_23, life6_26, life12_75, 0, life5_23);
    life13_87 = 0;
    forest_cycle_86: while (true) {
    forest_join_209: {
    forest_join_204: {
    forest_join_184: {
    forest_join_177: {
    if (!((life13_87 < __invokedynamic547_18(5185, (1906036231815770985L ^ life1_3))))) {
        break forest_join_223;
    }
    life14_102 = (life13_87 % __invokedynamic547_19(2553, (7262982289398607611L ^ life1_3)));
    life15_110 = (life13_87 / __invokedynamic547_20(2553, (7262982289398607611L ^ life1_3)));
    life16_112 = 0;
    life16_116 = (life7_34 - 1);
    forest_cycle_115: while (true) {
    forest_join_175: {
    forest_join_172: {
    forest_join_170: {
    if (!((life16_116 >= 0))) {
        break forest_join_177;
    }
    life17_124 = ((life14_102 * life7_34) + life16_116);
    life18_126 = 1;
    life19_128 = 0;
    forest_cycle_127: while (true) {
    forest_join_168: {
    if (!((life19_128 < life8_42))) {
        break forest_join_172;
    }
    if (!((life18_126 != 0))) {
        break forest_join_172;
    }
    life20_142 = (((life15_110 * life8_42) + life19_128) * life5_23);
    life21_148 = (life12_75)[(life17_124 + life20_142)];
    life22_162 = ((life21_148 >> __invokedynamic547_21(10241, (8561760841857240862L ^ life1_3))) & __invokedynamic547_22(22203, (6497868585704354215L ^ life1_3)));
    if (!((life22_162 > __invokedynamic547_23(2553, (7262982289398607611L ^ life1_3))))) {
        break forest_join_168;
    }
    break forest_join_170;
    }
    life19_128 += 1;
    continue forest_cycle_127;
    }
    }
    life18_126 = 0;
    }
    if (!((life18_126 == 0))) {
        break forest_join_175;
    }
    break forest_join_177;
    }
    life16_116 += -1;
    continue forest_cycle_115;
    }
    }
    if (!((life13_87 == __invokedynamic547_24(10079, (3272323741910827076L ^ life1_3))))) {
        break forest_join_184;
    }
    }
    if (!((life13_87 == __invokedynamic547_25(22940, (4991635814174424735L ^ life1_3))))) {
        break forest_join_209;
    }
    if (!((life7_34 <= __invokedynamic547_26(24832, (8609867059873695268L ^ life1_3))))) {
        break forest_join_204;
    }
    life16_116 = ((int) (0x1.0p1f * life9_47));
    break forest_join_209;
    }
    life16_116 = ((int) (0x1.8p0f * life9_47));
    }
    (__fieldRead547_27(receiver))[life13_87] = ((((float) (life16_116 + 1)) / life9_47) + 0x1.0p0f);
    life13_87 += 1;
    continue forest_cycle_86;
    }
    }
    __call547_29(life4_14, __fieldRead547_28(receiver));
    life13_234 = 0;
    forest_cycle_229: while (true) {
    if (!((life13_234 < (__fieldRead547_30(receiver)).length))) {
        break forest_join_245;
    }
    (__fieldRead547_31(receiver))[life13_234] = __call547_33((__fieldRead547_32(receiver))[life13_234]);
    life13_234 += 1;
    continue forest_cycle_229;
    }
    }
    return;
}
public static void h547_0(java.io.IOException p0, java.util.Properties p1) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    throw new java.lang.RuntimeException(life1_2);
}
public static void h547_1(java.io.IOException p0) throws Throwable {
    throw __call3054701_0(p0);
}
public static void h547_2(java.io.IOException p0) throws Throwable {
    throw __call3054702_0(p0);
}
public static void h547_3(java.io.IOException p0) throws Throwable {
    throw __call3054703_0(p0);
}
public static void h547_4(java.io.IOException p0) throws Throwable {
    throw __call3054704_0(p0);
}
public static void h547_5(java.io.IOException p0) throws Throwable {
    throw __call3054705_0(p0);
}
private static native long __fieldRead547_0() throws Throwable;
private static native moom.DD __fieldRead547_1(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.io.InputStream __call547_2(net.minecraft.client.gui.FontRenderer a0, moom.DD a1) throws Throwable;
private static native java.awt.image.BufferedImage __call547_3(java.io.InputStream a0) throws Throwable;
private static native moom.DD __fieldRead547_4(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.util.Properties __call547_5(moom.DD a0) throws Throwable;
private static native boolean __call547_6(java.util.Properties a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite547_7(net.minecraft.client.gui.FontRenderer a0, boolean a1) throws Throwable;
private static native int __call547_8(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call547_9(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __invokedynamic547_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic547_11(int a0, long a1) throws Throwable;
private static native float __call547_12(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite547_13(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native float __call547_14(java.util.Properties a0, java.lang.String a1, float a2) throws Throwable;
private static native int __numericCompare547_15(float a0, float a1) throws Throwable;
private static native void __fieldWrite547_16(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native int[] __call547_17(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native int __invokedynamic547_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic547_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic547_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic547_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic547_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic547_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic547_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic547_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic547_26(int a0, long a1) throws Throwable;
private static native float[] __fieldRead547_27(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float[] __fieldRead547_28(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call547_29(java.util.Properties a0, float[] a1) throws Throwable;
private static native int[] __fieldRead547_30(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int[] __fieldRead547_31(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float[] __fieldRead547_32(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __call547_33(float a0) throws Throwable;
private static native java.lang.Exception __call3054701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3054702_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3054703_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3054704_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3054705_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_a9df8a6dbc2c55f3f326(net.minecraft.client.gui.FontRenderer a0, char a1) throws E;
private static final class __SourceHandler_a9df8a6dbc2c55f3f326 {

public static float f2197(net.minecraft.client.gui.FontRenderer receiver, char p0) throws Throwable {
    long life2_3;
    int life4_35;
    int life5_68;
    int life6_79;
    life2_3 = (__fieldRead2197_0() ^ 56667619145799L);
    if ((p0 == __invokedynamic2197_1(30392, (2113650383155198166L ^ life2_3)))) {
        return -0x1.0p0f;
    }
    if ((p0 != __invokedynamic2197_2(22940, (4991653502246311872L ^ life2_3)))) {
        if ((p0 != __invokedynamic2197_3(31176, (7292879513941702531L ^ life2_3)))) {
        life4_35 = __call2197_4("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000", p0);
        if ((p0 > 0)) {
        if ((life4_35 != -1)) {
        if ((!__fieldRead2197_5(receiver))) {
        return (__fieldRead2197_6(receiver))[life4_35];
    }
    }
    }
        if (((__fieldRead2197_7(receiver))[p0] != 0)) {
        life5_68 = ((__fieldRead2197_8(receiver))[p0] >>> 4);
        life6_79 = ((__fieldRead2197_9(receiver))[p0] & __invokedynamic2197_10(14560, (5905460416120633019L ^ life2_3)));
        if ((life6_79 > __invokedynamic2197_11(12607, (1767331239220854625L ^ life2_3)))) {
        life6_79 = __invokedynamic2197_12(14560, (5905460416120633019L ^ life2_3));
        life5_68 = 0;
    }
        life6_79 += 1;
        return ((float) (((life6_79 - life5_68) / 2) + 1));
    }
        return 0x0.0p0f;
    }
    }
    return (__fieldRead2197_13(receiver))[__invokedynamic2197_14(22940, (4991653502246311872L ^ life2_3))];
}
public static void h2197_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1219700_0(p0);
}
public static void h2197_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1219701_0(p0);
}
public static void h2197_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1219702_0(p0);
}
public static void h2197_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1219703_0(p0);
}
public static void h2197_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1219704_0(p0);
}
private static native long __fieldRead2197_0() throws Throwable;
private static native int __invokedynamic2197_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic2197_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic2197_3(int a0, long a1) throws Throwable;
private static native int __call2197_4(java.lang.String a0, char a1) throws Throwable;
private static native boolean __fieldRead2197_5(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float[] __fieldRead2197_6(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native byte[] __fieldRead2197_7(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native byte[] __fieldRead2197_8(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native byte[] __fieldRead2197_9(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __invokedynamic2197_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic2197_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic2197_12(int a0, long a1) throws Throwable;
private static native float[] __fieldRead2197_13(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __invokedynamic2197_14(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1219700_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1219701_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1219702_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1219703_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1219704_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_cba209b9f296aa0ff12f(net.minecraft.client.gui.FontRenderer a0, char a1, boolean a2) throws E;
private static final class __SourceHandler_cba209b9f296aa0ff12f {

public static float f1291(net.minecraft.client.gui.FontRenderer receiver, char p0, boolean p1) throws Throwable {
    float forwardValue1291_37_0;
    float forwardValue1291_47_0;
    long life3_3;
    int life5_24;
    forward_join_47: {
    forward_join_46: {
    forward_join_38: {
    forward_join_37: {
    forward_join_33: {
    life3_3 = (__fieldRead1291_0() ^ 87937763760893L);
    if (!((p0 != __invokedynamic1291_1(22940, (4991560803600381306L ^ life3_3))))) {
        break forward_join_38;
    }
    if (!((p0 != __invokedynamic1291_2(13535, (50446864496744450L ^ life3_3))))) {
        break forward_join_38;
    }
    life5_24 = __call1291_3("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000", p0);
    if (!((life5_24 != -1))) {
        break forward_join_33;
    }
    if (!((!__fieldRead1291_4(receiver)))) {
        break forward_join_33;
    }
    forwardValue1291_37_0 = __call1291_5(receiver, life5_24, p1);
    break forward_join_37;
    }
    forwardValue1291_37_0 = __call1291_6(receiver, p0, p1);
    }
    return forwardValue1291_37_0;
    }
    if (!((!__fieldRead1291_7(receiver)))) {
        break forward_join_46;
    }
    forwardValue1291_47_0 = (__fieldRead1291_8(receiver))[p0];
    break forward_join_47;
    }
    forwardValue1291_47_0 = 0x1.0p2f;
    }
    return forwardValue1291_47_0;
}
public static void h1291_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129100_0(p0);
}
public static void h1291_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129101_0(p0);
}
public static void h1291_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129102_0(p0);
}
public static void h1291_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129103_0(p0);
}
private static native long __fieldRead1291_0() throws Throwable;
private static native int __invokedynamic1291_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic1291_2(int a0, long a1) throws Throwable;
private static native int __call1291_3(java.lang.String a0, char a1) throws Throwable;
private static native boolean __fieldRead1291_4(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __call1291_5(net.minecraft.client.gui.FontRenderer a0, int a1, boolean a2) throws Throwable;
private static native float __call1291_6(net.minecraft.client.gui.FontRenderer a0, char a1, boolean a2) throws Throwable;
private static native boolean __fieldRead1291_7(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float[] __fieldRead1291_8(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.lang.Exception __call1129100_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129101_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129102_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129103_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a51ef6a933af076898bf(net.minecraft.client.gui.FontRenderer a0, float a1) throws E;
private static final class __SourceHandler_a51ef6a933af076898bf {

public static void f196(net.minecraft.client.gui.FontRenderer receiver, float p0) throws Throwable {
    long life2_3;
    net.minecraft.client.renderer.Tessellator life4_8;
    moom.lw life5_11;
    net.minecraft.client.renderer.Tessellator life4_100;
    moom.lw life5_103;
    int life6_121;
    life2_3 = (__fieldRead196_0() ^ 92804821450335L);
    if (__fieldRead196_1(receiver)) {
        life4_8 = __call196_2();
        life5_11 = __call196_3(life4_8);
        __call196_4();
        __call196_7(life5_11, __invokedynamic196_5(20724, (747938481695365309L ^ life2_3)), __fieldRead196_6());
        __call196_12(__call196_11(life5_11, ((double) __fieldRead196_8(receiver)), ((double) (__fieldRead196_9(receiver) + ((float) (__fieldRead196_10(receiver) / 2)))), 0x0.0p0d));
        __call196_17(__call196_16(life5_11, ((double) (__fieldRead196_13(receiver) + p0)), ((double) (__fieldRead196_14(receiver) + ((float) (__fieldRead196_15(receiver) / 2)))), 0x0.0p0d));
        __call196_22(__call196_21(life5_11, ((double) (__fieldRead196_18(receiver) + p0)), ((double) ((__fieldRead196_19(receiver) + ((float) (__fieldRead196_20(receiver) / 2))) - 0x1.0p0f)), 0x0.0p0d));
        __call196_27(__call196_26(life5_11, ((double) __fieldRead196_23(receiver)), ((double) ((__fieldRead196_24(receiver) + ((float) (__fieldRead196_25(receiver) / 2))) - 0x1.0p0f)), 0x0.0p0d));
        __call196_28(life4_8);
        __call196_29();
    }
    if (__fieldRead196_30(receiver)) {
        life4_100 = __call196_31();
        life5_103 = __call196_32(life4_100);
        __call196_33();
        __call196_36(life5_103, __invokedynamic196_34(12607, (1767299515633695097L ^ life2_3)), __fieldRead196_35());
        life6_121 = (__fieldRead196_37(receiver) ? -1 : 0);
        __call196_42(__call196_41(life5_103, ((double) (__fieldRead196_38(receiver) + ((float) life6_121))), ((double) (__fieldRead196_39(receiver) + ((float) __fieldRead196_40(receiver)))), 0x0.0p0d));
        __call196_47(__call196_46(life5_103, ((double) (__fieldRead196_43(receiver) + p0)), ((double) (__fieldRead196_44(receiver) + ((float) __fieldRead196_45(receiver)))), 0x0.0p0d));
        __call196_52(__call196_51(life5_103, ((double) (__fieldRead196_48(receiver) + p0)), ((double) ((__fieldRead196_49(receiver) + ((float) __fieldRead196_50(receiver))) - 0x1.0p0f)), 0x0.0p0d));
        __call196_57(__call196_56(life5_103, ((double) (__fieldRead196_53(receiver) + ((float) life6_121))), ((double) ((__fieldRead196_54(receiver) + ((float) __fieldRead196_55(receiver))) - 0x1.0p0f)), 0x0.0p0d));
        __call196_58(life4_100);
        __call196_59();
    }
    net.minecraft.client.gui.FontRenderer __stackOp196_60_0 = receiver;
    __fieldWrite196_62(__stackOp196_60_0, (__fieldRead196_61(__stackOp196_60_0) + p0));
    return;
}
public static void h196_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019600_0(p0);
}
private static native long __fieldRead196_0() throws Throwable;
private static native boolean __fieldRead196_1(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call196_2() throws Throwable;
private static native moom.lw __call196_3(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call196_4() throws Throwable;
private static native int __invokedynamic196_5(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead196_6() throws Throwable;
private static native void __call196_7(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native float __fieldRead196_8(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead196_9(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __fieldRead196_10(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.lw __call196_11(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call196_12(moom.lw a0) throws Throwable;
private static native float __fieldRead196_13(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead196_14(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __fieldRead196_15(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.lw __call196_16(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call196_17(moom.lw a0) throws Throwable;
private static native float __fieldRead196_18(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead196_19(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __fieldRead196_20(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.lw __call196_21(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call196_22(moom.lw a0) throws Throwable;
private static native float __fieldRead196_23(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead196_24(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __fieldRead196_25(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.lw __call196_26(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call196_27(moom.lw a0) throws Throwable;
private static native void __call196_28(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call196_29() throws Throwable;
private static native boolean __fieldRead196_30(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call196_31() throws Throwable;
private static native moom.lw __call196_32(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call196_33() throws Throwable;
private static native int __invokedynamic196_34(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead196_35() throws Throwable;
private static native void __call196_36(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native boolean __fieldRead196_37(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead196_38(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead196_39(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __fieldRead196_40(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.lw __call196_41(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call196_42(moom.lw a0) throws Throwable;
private static native float __fieldRead196_43(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead196_44(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __fieldRead196_45(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.lw __call196_46(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call196_47(moom.lw a0) throws Throwable;
private static native float __fieldRead196_48(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead196_49(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __fieldRead196_50(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.lw __call196_51(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call196_52(moom.lw a0) throws Throwable;
private static native float __fieldRead196_53(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead196_54(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __fieldRead196_55(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.lw __call196_56(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call196_57(moom.lw a0) throws Throwable;
private static native void __call196_58(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call196_59() throws Throwable;
private static native float __fieldRead196_61(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __fieldWrite196_62(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native java.lang.Exception __call1019600_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_8d69771daa8243f9b140(net.minecraft.client.gui.FontRenderer a0, int a1, boolean a2) throws E;
private static final class __SourceHandler_8d69771daa8243f9b140 {

public static float f100144(net.minecraft.client.gui.FontRenderer receiver, int p0, boolean p1) throws Throwable {
    int forestValue100144_37_0;
    long life3_3;
    int life5_17;
    int life6_31;
    int life7_37;
    float life8_46;
    float life9_48;
    forest_join_37: {
    forest_join_36: {
    life3_3 = (__fieldRead100144_0() ^ 132988003477600L);
    life5_17 = ((p0 % __invokedynamic100144_1(2553, (7262952329672349571L ^ life3_3))) * __invokedynamic100144_2(24832, (8609790920052850524L ^ life3_3)));
    life6_31 = ((p0 / __invokedynamic100144_3(2553, (7262952329672349571L ^ life3_3))) * __invokedynamic100144_4(24832, (8609790920052850524L ^ life3_3)));
    if (!(p1)) {
        break forest_join_36;
    }
    forestValue100144_37_0 = 1;
    break forest_join_37;
    }
    forestValue100144_37_0 = 0;
    }
    life7_37 = forestValue100144_37_0;
    __call100144_6(receiver, __fieldRead100144_5(receiver));
    life8_46 = (__fieldRead100144_7(receiver))[p0];
    life9_48 = 0x1.ff5c28p2f;
    __call100144_8(5);
    __call100144_9((((float) life5_17) / 0x1.0p7f), (((float) life6_31) / 0x1.0p7f));
    __call100144_12((__fieldRead100144_10(receiver) + ((float) life7_37)), __fieldRead100144_11(receiver), 0x0.0p0f);
    __call100144_13((((float) life5_17) / 0x1.0p7f), ((((float) life6_31) + 0x1.ff5c28p2f) / 0x1.0p7f));
    __call100144_16((__fieldRead100144_14(receiver) - ((float) life7_37)), (__fieldRead100144_15(receiver) + 0x1.ff5c28p2f), 0x0.0p0f);
    __call100144_17((((((float) life5_17) + life9_48) - 0x1.0p0f) / 0x1.0p7f), (((float) life6_31) / 0x1.0p7f));
    __call100144_20((((__fieldRead100144_18(receiver) + life9_48) - 0x1.0p0f) + ((float) life7_37)), __fieldRead100144_19(receiver), 0x0.0p0f);
    __call100144_21((((((float) life5_17) + life9_48) - 0x1.0p0f) / 0x1.0p7f), ((((float) life6_31) + 0x1.ff5c28p2f) / 0x1.0p7f));
    __call100144_24((((__fieldRead100144_22(receiver) + life9_48) - 0x1.0p0f) - ((float) life7_37)), (__fieldRead100144_23(receiver) + 0x1.ff5c28p2f), 0x0.0p0f);
    __call100144_25();
    return life8_46;
}
public static float h100144_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call13014400_0(p0);
}
private static native long __fieldRead100144_0() throws Throwable;
private static native int __invokedynamic100144_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic100144_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic100144_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic100144_4(int a0, long a1) throws Throwable;
private static native moom.DD __fieldRead100144_5(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call100144_6(net.minecraft.client.gui.FontRenderer a0, moom.DD a1) throws Throwable;
private static native float[] __fieldRead100144_7(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call100144_8(int a0) throws Throwable;
private static native void __call100144_9(float a0, float a1) throws Throwable;
private static native float __fieldRead100144_10(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead100144_11(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call100144_12(float a0, float a1, float a2) throws Throwable;
private static native void __call100144_13(float a0, float a1) throws Throwable;
private static native float __fieldRead100144_14(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead100144_15(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call100144_16(float a0, float a1, float a2) throws Throwable;
private static native void __call100144_17(float a0, float a1) throws Throwable;
private static native float __fieldRead100144_18(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead100144_19(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call100144_20(float a0, float a1, float a2) throws Throwable;
private static native void __call100144_21(float a0, float a1) throws Throwable;
private static native float __fieldRead100144_22(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead100144_23(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call100144_24(float a0, float a1, float a2) throws Throwable;
private static native void __call100144_25() throws Throwable;
private static native java.lang.Exception __call13014400_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_12d384cfcf144e31a175(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws E;
private static final class __SourceHandler_12d384cfcf144e31a175 {

public static int f1292(net.minecraft.client.gui.FontRenderer receiver, java.lang.String p0) throws Throwable {
    float lexicalValue1292_104_0;
    float lexicalValue1292_106_0;
    float lexicalValue1292_106_1;
    float spill1292_0;
    long life2_3;
    float life4_25;
    int life5_27;
    int life6_29;
    int life7_37;
    float life8_41;
    int life7_59;
    lexical_join_110: {
    lexical_join_20: {
    lexical_join_16: {
    life2_3 = (__fieldRead1292_0() ^ 125080961009117L);
    if (!(__call1292_2(__fieldRead1292_1(receiver), p0))) {
        break lexical_join_16;
    }
    return __call1292_6(__cast1292_5(__call1292_4(__fieldRead1292_3(receiver), p0)));
    }
    if (!((p0 == null))) {
        break lexical_join_20;
    }
    return 0;
    }
    life4_25 = 0x0.0p0f;
    life5_27 = 0;
    life6_29 = 0;
    lexical_cycle_26: while (true) {
    lexical_join_108: {
    lexical_join_106: {
    lexical_join_104: {
    lexical_join_88: {
    lexical_join_86: {
    lexical_join_84: {
    lexical_join_81: {
    if (!((life6_29 < __call1292_7(p0)))) {
        break lexical_join_110;
    }
    life7_37 = __integerCategory1292_9(__call1292_8(p0, life6_29));
    life8_41 = __call1292_10(receiver, life7_37);
    if (!((__numericCompare1292_11(life8_41, 0x0.0p0f) < 0))) {
        break lexical_join_88;
    }
    if (!((life6_29 < (__call1292_12(p0) - 1)))) {
        break lexical_join_88;
    }
    life6_29 += 1;
    life7_59 = __integerCategory1292_14(__call1292_13(p0, life6_29));
    if (!((life7_59 != __invokedynamic1292_15(14356, (521189919234116604L ^ life2_3))))) {
        break lexical_join_84;
    }
    if (!((life7_59 != __invokedynamic1292_16(13303, (5603630164753465362L ^ life2_3))))) {
        break lexical_join_84;
    }
    if (!((life7_59 != __invokedynamic1292_17(19853, (6306313146775125601L ^ life2_3))))) {
        break lexical_join_81;
    }
    if (!((life7_59 == __invokedynamic1292_18(9344, (5006784902059480925L ^ life2_3))))) {
        break lexical_join_86;
    }
    }
    life5_27 = 0;
    break lexical_join_86;
    }
    life5_27 = 1;
    }
    life8_41 = 0x0.0p0f;
    }
    life4_25 = (life4_25 + life8_41);
    if (!((life5_27 != 0))) {
        break lexical_join_108;
    }
    if (!((__numericCompare1292_19(life8_41, 0x0.0p0f) > 0))) {
        break lexical_join_108;
    }
    spill1292_0 = life4_25;
    if (!(__fieldRead1292_20(receiver))) {
        lexicalValue1292_104_0 = spill1292_0;
        break lexical_join_104;
    }
    lexicalValue1292_106_0 = spill1292_0;
    lexicalValue1292_106_1 = 0x1.0p0f;
    break lexical_join_106;
    }
    lexicalValue1292_106_0 = lexicalValue1292_104_0;
    lexicalValue1292_106_1 = __fieldRead1292_21(receiver);
    }
    life4_25 = (lexicalValue1292_106_0 + lexicalValue1292_106_1);
    }
    life6_29 += 1;
    continue lexical_cycle_26;
    }
    }
    __call1292_25(__fieldRead1292_22(receiver), p0, __call1292_24(__call1292_23(life4_25)));
    return __call1292_26(life4_25);
}
public static void h1292_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129200_0(p0);
}
public static void h1292_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129201_0(p0);
}
public static void h1292_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129202_0(p0);
}
public static void h1292_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129203_0(p0);
}
public static void h1292_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129204_0(p0);
}
public static void h1292_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129205_0(p0);
}
public static void h1292_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129206_0(p0);
}
public static void h1292_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129207_0(p0);
}
public static void h1292_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129208_0(p0);
}
private static native long __fieldRead1292_0() throws Throwable;
private static native java.util.HashMap __fieldRead1292_1(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native boolean __call1292_2(java.util.HashMap a0, java.lang.String a1) throws Throwable;
private static native java.util.HashMap __fieldRead1292_3(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.lang.Object __call1292_4(java.util.HashMap a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __cast1292_5(java.lang.Object a0) throws Throwable;
private static native int __call1292_6(java.lang.Integer a0) throws Throwable;
private static native int __call1292_7(java.lang.String a0) throws Throwable;
private static native char __call1292_8(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1292_9(char value) throws Throwable;
private static native float __call1292_10(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native int __numericCompare1292_11(float a0, float a1) throws Throwable;
private static native int __call1292_12(java.lang.String a0) throws Throwable;
private static native char __call1292_13(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1292_14(char value) throws Throwable;
private static native int __invokedynamic1292_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic1292_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic1292_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic1292_18(int a0, long a1) throws Throwable;
private static native int __numericCompare1292_19(float a0, float a1) throws Throwable;
private static native boolean __fieldRead1292_20(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead1292_21(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.util.HashMap __fieldRead1292_22(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __call1292_23(float a0) throws Throwable;
private static native java.lang.Integer __call1292_24(int a0) throws Throwable;
private static native java.lang.Object __call1292_25(java.util.HashMap a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __call1292_26(float a0) throws Throwable;
private static native java.lang.Exception __call1129200_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129201_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129202_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129203_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129204_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129205_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129206_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129207_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129208_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_bf7dc2460a7f1305ed0a(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4, boolean a5) throws E;
private static final class __SourceHandler_bf7dc2460a7f1305ed0a {

public static int f2202(net.minecraft.client.gui.FontRenderer receiver, java.lang.String p0, float p1, float p2, int p3, boolean p4) throws Throwable {
    long life6_3;
    int life8_45;
    int life8_55;
    life6_3 = (__fieldRead2202_0() ^ 30320128268805L);
    __fieldWrite2202_1(receiver, 1);
    __call2202_2(receiver);
    if (__fieldRead2202_3(receiver)) {
        __call2202_5(__fieldRead2202_4(receiver));
        int spill2202_0 = 30094;
        __call2202_6();
        __call2202_9(__invokedynamic2202_7(spill2202_0, (2095747142343809531L ^ life6_3)), __invokedynamic2202_8(15059, (4085885768494552795L ^ life6_3)));
    }
    __call2202_10(receiver);
    if (p4) {
        life8_45 = __call2202_11(receiver, p0, (p1 + 0x1.0p0f), (p2 + 0x1.0p0f), p3, 1);
        life8_55 = __call2202_13(life8_45, __call2202_12(receiver, p0, p1, p2, p3, 0));
    } else {
        life8_55 = __call2202_14(receiver, p0, p1, p2, p3, 0);
    }
    if (__fieldRead2202_15(receiver)) {
        __call2202_17(__fieldRead2202_16(receiver));
    }
    return life8_55;
}
public static void h2202_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1220200_0(p0);
}
public static void h2202_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1220201_0(p0);
}
private static native long __fieldRead2202_0() throws Throwable;
private static native void __fieldWrite2202_1(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native void __call2202_2(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native boolean __fieldRead2202_3(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.Mh __fieldRead2202_4(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call2202_5(moom.Mh a0) throws Throwable;
private static native void __call2202_6() throws Throwable;
private static native int __invokedynamic2202_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic2202_8(int a0, long a1) throws Throwable;
private static native void __call2202_9(int a0, int a1) throws Throwable;
private static native void __call2202_10(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __call2202_11(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4, int a5) throws Throwable;
private static native int __call2202_12(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4, int a5) throws Throwable;
private static native int __call2202_13(int a0, int a1) throws Throwable;
private static native int __call2202_14(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4, int a5) throws Throwable;
private static native boolean __fieldRead2202_15(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.Mh __fieldRead2202_16(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call2202_17(moom.Mh a0) throws Throwable;
private static native java.lang.Exception __call1220200_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1220201_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_b21d98c94e9106569554(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3) throws E;
private static final class __SourceHandler_b21d98c94e9106569554 {

public static java.lang.String f1293(net.minecraft.client.gui.FontRenderer receiver, java.lang.String p0, int p1, int p2) throws Throwable {
    int forwardValue1293_56_0;
    java.lang.String forwardValue1293_65_0;
    java.lang.String forwardValue1293_65_1;
    int forwardValue1293_65_2;
    java.lang.String forwardValue1293_66_0;
    java.lang.String forwardValue1293_66_1;
    int forwardValue1293_66_2;
    int forwardValue1293_66_3;
    java.lang.String spill1293_0;
    java.lang.String spill1293_1;
    int spill1293_2;
    long life4_3;
    int life6_27;
    java.lang.String life7_40;
    int life8_44;
    int life9_67;
    java.lang.String life10_82;
    forward_join_66: {
    forward_join_65: {
    forward_join_56: {
    forward_join_55: {
    forward_join_53: {
    forward_join_30: {
    forward_join_19: {
    forward_join_13: {
    life4_3 = (__fieldRead1293_0() ^ 84005298852860L);
    if (!((p2 > __invokedynamic1293_1(27908, (2390894978652080351L ^ life4_3))))) {
        break forward_join_13;
    }
    return p0;
    }
    if (!((__call1293_2(p0) <= 1))) {
        break forward_join_19;
    }
    return p0;
    }
    life6_27 = __call1293_3(receiver, p0, p1);
    if (!((__call1293_4(p0) <= life6_27))) {
        break forward_join_30;
    }
    return p0;
    }
    life7_40 = __call1293_5(p0, 0, life6_27);
    life8_44 = __integerCategory1293_7(__call1293_6(p0, life6_27));
    if (!((life8_44 != __invokedynamic1293_8(22940, (4991560169726524539L ^ life4_3))))) {
        break forward_join_53;
    }
    if (!((life8_44 == __invokedynamic1293_9(12403, (1484847459483637169L ^ life4_3))))) {
        break forward_join_55;
    }
    }
    forwardValue1293_56_0 = 1;
    break forward_join_56;
    }
    forwardValue1293_56_0 = 0;
    }
    life9_67 = forwardValue1293_56_0;
    spill1293_0 = __call1293_10(life7_40);
    spill1293_1 = p0;
    spill1293_2 = life6_27;
    if (!((life9_67 != 0))) {
        forwardValue1293_65_0 = spill1293_0;
        forwardValue1293_65_1 = spill1293_1;
        forwardValue1293_65_2 = spill1293_2;
        break forward_join_65;
    }
    forwardValue1293_66_0 = spill1293_0;
    forwardValue1293_66_1 = spill1293_1;
    forwardValue1293_66_2 = spill1293_2;
    forwardValue1293_66_3 = 1;
    break forward_join_66;
    }
    forwardValue1293_66_0 = forwardValue1293_65_0;
    forwardValue1293_66_1 = forwardValue1293_65_1;
    forwardValue1293_66_2 = forwardValue1293_65_2;
    forwardValue1293_66_3 = 0;
    }
    life10_82 = __invokedynamic1293_12(forwardValue1293_66_0, __call1293_11(forwardValue1293_66_1, (forwardValue1293_66_2 + forwardValue1293_66_3)));
    return __invokedynamic1293_14(life7_40, __call1293_13(receiver, life10_82, p1, (p2 + 1)));
}
public static void h1293_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129300_0(p0);
}
public static void h1293_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129301_0(p0);
}
public static void h1293_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129302_0(p0);
}
public static void h1293_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129303_0(p0);
}
public static void h1293_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129304_0(p0);
}
public static void h1293_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129305_0(p0);
}
private static native long __fieldRead1293_0() throws Throwable;
private static native int __invokedynamic1293_1(int a0, long a1) throws Throwable;
private static native int __call1293_2(java.lang.String a0) throws Throwable;
private static native int __call1293_3(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call1293_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1293_5(java.lang.String a0, int a1, int a2) throws Throwable;
private static native char __call1293_6(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1293_7(char value) throws Throwable;
private static native int __invokedynamic1293_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic1293_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call1293_10(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1293_11(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic1293_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1293_13(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3) throws Throwable;
private static native java.lang.String __invokedynamic1293_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1129300_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129301_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129302_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129303_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129304_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129305_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1e313581364a5db123b1(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws E;
private static final class __SourceHandler_1e313581364a5db123b1 {

public static void f2204(net.minecraft.client.gui.FontRenderer receiver, java.lang.String p0, int p1, int p2, int p3, int p4) throws Throwable {
    long life6_3;
    java.lang.String life1_33;
    life6_3 = (__fieldRead2204_0() ^ 81809218984709L);
    if (__fieldRead2204_1(receiver)) {
        __call2204_3(__fieldRead2204_2(receiver));
        int spill2204_0 = 9741;
        __call2204_4();
        __call2204_7(__invokedynamic2204_5(spill2204_0, (5018878018316290939L ^ life6_3)), __invokedynamic2204_6(21963, (8592609881359202532L ^ life6_3)));
    }
    __call2204_8(receiver);
    __fieldWrite2204_9(receiver, p4);
    life1_33 = __call2204_10(receiver, p0);
    __call2204_11(receiver, life1_33, p1, p2, p3, 0);
    if (__fieldRead2204_12(receiver)) {
        __call2204_14(__fieldRead2204_13(receiver));
    }
    return;
}
public static void h2204_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1220400_0(p0);
}
public static void h2204_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1220401_0(p0);
}
private static native long __fieldRead2204_0() throws Throwable;
private static native boolean __fieldRead2204_1(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.Mh __fieldRead2204_2(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call2204_3(moom.Mh a0) throws Throwable;
private static native void __call2204_4() throws Throwable;
private static native int __invokedynamic2204_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic2204_6(int a0, long a1) throws Throwable;
private static native void __call2204_7(int a0, int a1) throws Throwable;
private static native void __call2204_8(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __fieldWrite2204_9(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native java.lang.String __call2204_10(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native void __call2204_11(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native boolean __fieldRead2204_12(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.Mh __fieldRead2204_13(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call2204_14(moom.Mh a0) throws Throwable;
private static native java.lang.Exception __call1220400_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1220401_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_6e14f86aab4c98feb33c(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, boolean a3) throws E;
private static final class __SourceHandler_6e14f86aab4c98feb33c {

public static java.lang.String f548(net.minecraft.client.gui.FontRenderer receiver, java.lang.String p0, int p1, boolean p2) throws Throwable {
    int forestValue548_18_0;
    int forestValue548_24_0;
    long life4_3;
    java.lang.StringBuilder life6_7;
    float life7_9;
    int life8_18;
    int life9_24;
    int life10_26;
    int life11_28;
    int life12_30;
    int life13_47;
    float life14_51;
    forest_join_128: {
    forest_join_24: {
    forest_join_23: {
    forest_join_18: {
    forest_join_17: {
    life4_3 = (__fieldRead548_0() ^ 114375265449940L);
    life6_7 = new java.lang.StringBuilder();
    life7_9 = 0x0.0p0f;
    if (!(p2)) {
        break forest_join_17;
    }
    forestValue548_18_0 = (__call548_1(p0) - 1);
    break forest_join_18;
    }
    forestValue548_18_0 = 0;
    }
    life8_18 = forestValue548_18_0;
    if (!(p2)) {
        break forest_join_23;
    }
    forestValue548_24_0 = -1;
    break forest_join_24;
    }
    forestValue548_24_0 = 1;
    }
    life9_24 = forestValue548_24_0;
    life10_26 = 0;
    life11_28 = 0;
    life12_30 = life8_18;
    forest_cycle_31: while (true) {
    forest_join_123: {
    forest_join_119: {
    forest_join_111: {
    forest_join_105: {
    forest_join_95: {
    forest_join_88: {
    forest_join_85: {
    forest_join_82: {
    if (!((life12_30 >= 0))) {
        break forest_join_128;
    }
    if (!((life12_30 < __call548_2(p0)))) {
        break forest_join_128;
    }
    if (!((__numericCompare548_3(life7_9, ((float) p1)) < 0))) {
        break forest_join_128;
    }
    life13_47 = __integerCategory548_5(__call548_4(p0, life12_30));
    life14_51 = __call548_6(receiver, life13_47);
    if (!((life10_26 != 0))) {
        break forest_join_88;
    }
    life10_26 = 0;
    if (!((life13_47 != __invokedynamic548_7(30433, (6438098950036207362L ^ life4_3))))) {
        break forest_join_85;
    }
    if (!((life13_47 != __invokedynamic548_8(23801, (6935419592498584863L ^ life4_3))))) {
        break forest_join_85;
    }
    if (!((life13_47 != __invokedynamic548_9(15278, (6080035164127689331L ^ life4_3))))) {
        break forest_join_82;
    }
    if (!((life13_47 == __invokedynamic548_10(12953, (7187341075511178080L ^ life4_3))))) {
        break forest_join_105;
    }
    }
    life11_28 = 0;
    break forest_join_105;
    }
    life11_28 = 1;
    break forest_join_105;
    }
    if (!((__numericCompare548_11(life14_51, 0x0.0p0f) < 0))) {
        break forest_join_95;
    }
    life10_26 = 1;
    break forest_join_105;
    }
    life7_9 = (life7_9 + life14_51);
    if (!((life11_28 != 0))) {
        break forest_join_105;
    }
    life7_9 = (life7_9 + 0x1.0p0f);
    }
    if (!((__numericCompare548_12(life7_9, ((float) p1)) > 0))) {
        break forest_join_111;
    }
    break forest_join_128;
    }
    if (!(p2)) {
        break forest_join_119;
    }
    __call548_13(life6_7, 0, life13_47);
    break forest_join_123;
    }
    __call548_14(life6_7, life13_47);
    }
    life12_30 = (life12_30 + life9_24);
    continue forest_cycle_31;
    }
    }
    return __call548_15(life6_7);
}
public static java.lang.String h548_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3054800_0(p0);
}
public static java.lang.String h548_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3054801_0(p0);
}
public static java.lang.String h548_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3054802_0(p0);
}
public static java.lang.String h548_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3054803_0(p0);
}
public static java.lang.String h548_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call3054804_0(p0);
}
public static java.lang.String h548_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call3054805_0(p0);
}
public static java.lang.String h548_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call3054806_0(p0);
}
public static java.lang.String h548_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call3054807_0(p0);
}
public static java.lang.String h548_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call3054808_0(p0);
}
private static native long __fieldRead548_0() throws Throwable;
private static native int __call548_1(java.lang.String a0) throws Throwable;
private static native int __call548_2(java.lang.String a0) throws Throwable;
private static native int __numericCompare548_3(float a0, float a1) throws Throwable;
private static native char __call548_4(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory548_5(char value) throws Throwable;
private static native float __call548_6(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native int __invokedynamic548_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic548_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic548_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic548_10(int a0, long a1) throws Throwable;
private static native int __numericCompare548_11(float a0, float a1) throws Throwable;
private static native int __numericCompare548_12(float a0, float a1) throws Throwable;
private static native java.lang.StringBuilder __call548_13(java.lang.StringBuilder a0, int a1, int a2) throws Throwable;
private static native java.lang.StringBuilder __call548_14(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.String __call548_15(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Exception __call3054800_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3054801_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3054802_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3054803_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3054804_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3054805_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3054806_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3054807_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3054808_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6af298647daae82947c4(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, boolean a2) throws E;
private static final class __SourceHandler_6af298647daae82947c4 {

public static void f197(net.minecraft.client.gui.FontRenderer receiver, java.lang.String p0, boolean p1) throws Throwable {
    float lexicalValue197_262_0;
    int lexicalValue197_276_0;
    long life3_3;
    int life5_5;
    int life6_13;
    int life7_39;
    int life8_93;
    int life7_249;
    int life8_262;
    int life9_272;
    float life8_295;
    int life9_320;
    float life10_343;
    lexical_join_369: {
    life3_3 = (__fieldRead197_0() ^ 13655078614075L);
    life5_5 = 0;
    lexical_cycle_6: while (true) {
    lexical_join_367: {
    lexical_join_364: {
    lexical_join_360: {
    lexical_join_334: {
    lexical_join_311: {
    lexical_join_291: {
    lexical_join_276: {
    lexical_join_275: {
    lexical_join_271: {
    lexical_join_262: {
    lexical_join_261: {
    lexical_join_252: {
    lexical_join_221: {
    lexical_join_219: {
    lexical_join_187: {
    lexical_join_176: {
    lexical_join_165: {
    lexical_join_154: {
    lexical_join_143: {
    lexical_join_132: {
    lexical_join_88: {
    lexical_join_77: {
    lexical_join_74: {
    lexical_join_68: {
    if (!((life5_5 < __call197_1(p0)))) {
        break lexical_join_369;
    }
    life6_13 = __integerCategory197_3(__call197_2(p0, life5_5));
    if (!((life6_13 == __invokedynamic197_4(30392, (2113611206085735594L ^ life3_3))))) {
        break lexical_join_221;
    }
    if (!(((life5_5 + 1) < __call197_5(p0)))) {
        break lexical_join_221;
    }
    life7_39 = __call197_9("0123456789abcdefklmnor", __call197_8(__call197_7(p0, __fieldRead197_6()), (life5_5 + 1)));
    if (!((life7_39 < __invokedynamic197_10(2553, (7262973802418506712L ^ life3_3))))) {
        break lexical_join_132;
    }
    __fieldWrite197_11(receiver, 0);
    __fieldWrite197_12(receiver, 0);
    __fieldWrite197_13(receiver, 0);
    __fieldWrite197_14(receiver, 0);
    __fieldWrite197_15(receiver, 0);
    if (!((life7_39 >= 0))) {
        break lexical_join_68;
    }
    if (!((life7_39 > __invokedynamic197_16(14560, (5905440769385380551L ^ life3_3))))) {
        break lexical_join_74;
    }
    }
    life7_39 = __invokedynamic197_17(14560, (5905440769385380551L ^ life3_3));
    }
    if (!(p1)) {
        break lexical_join_77;
    }
    life7_39 += 16;
    }
    life8_93 = (__fieldRead197_18(receiver))[life7_39];
    if (!(__call197_19())) {
        break lexical_join_88;
    }
    life8_93 = __call197_20(life7_39, life8_93);
    }
    __fieldWrite197_21(receiver, life8_93);
    __call197_27(receiver, (((float) (life8_93 >> __invokedynamic197_22(2553, (7262973802418506712L ^ life3_3)))) / 0x1.fep7f), (((float) ((life8_93 >> __invokedynamic197_23(24832, (8609874928344949511L ^ life3_3))) & __invokedynamic197_24(22203, (6497883738540790916L ^ life3_3)))) / 0x1.fep7f), (((float) (life8_93 & __invokedynamic197_25(22203, (6497883738540790916L ^ life3_3)))) / 0x1.fep7f), __fieldRead197_26(receiver));
    break lexical_join_219;
    }
    if (!((life7_39 == __invokedynamic197_28(2553, (7262973802418506712L ^ life3_3))))) {
        break lexical_join_143;
    }
    __fieldWrite197_29(receiver, 1);
    break lexical_join_219;
    }
    if (!((life7_39 == __invokedynamic197_30(31802, (8949173729720892984L ^ life3_3))))) {
        break lexical_join_154;
    }
    __fieldWrite197_31(receiver, 1);
    break lexical_join_219;
    }
    if (!((life7_39 == __invokedynamic197_32(32217, (281238496993869813L ^ life3_3))))) {
        break lexical_join_165;
    }
    __fieldWrite197_33(receiver, 1);
    break lexical_join_219;
    }
    if (!((life7_39 == __invokedynamic197_34(18525, (2137578352087550579L ^ life3_3))))) {
        break lexical_join_176;
    }
    __fieldWrite197_35(receiver, 1);
    break lexical_join_219;
    }
    if (!((life7_39 == __invokedynamic197_36(32535, (589306088224619793L ^ life3_3))))) {
        break lexical_join_187;
    }
    __fieldWrite197_37(receiver, 1);
    break lexical_join_219;
    }
    if (!((life7_39 == __invokedynamic197_38(27479, (9056698512109234461L ^ life3_3))))) {
        break lexical_join_219;
    }
    __fieldWrite197_39(receiver, 0);
    __fieldWrite197_40(receiver, 0);
    __fieldWrite197_41(receiver, 0);
    __fieldWrite197_42(receiver, 0);
    __fieldWrite197_43(receiver, 0);
    __call197_48(receiver, __fieldRead197_44(receiver), __fieldRead197_45(receiver), __fieldRead197_46(receiver), __fieldRead197_47(receiver));
    }
    life5_5 += 1;
    break lexical_join_367;
    }
    life7_249 = __call197_49("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000", life6_13);
    if (!(__fieldRead197_50(receiver))) {
        break lexical_join_252;
    }
    if (!((life7_249 != -1))) {
        break lexical_join_252;
    }
    life8_262 = __call197_51(receiver, life6_13);
    lexical_cycle_235: while (true) {
    life7_249 = __call197_54(__fieldRead197_52(receiver), __call197_53("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000"));
    life9_272 = __integerCategory197_56(__call197_55("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000", life7_249));
    if (!((life8_262 == __call197_57(receiver, life9_272)))) { continue lexical_cycle_235; }
    break lexical_cycle_235;
    }
    life6_13 = life9_272;
    }
    if (!((life7_249 != -1))) {
        break lexical_join_261;
    }
    if (!((!__fieldRead197_58(receiver)))) {
        break lexical_join_261;
    }
    lexicalValue197_262_0 = __fieldRead197_59(receiver);
    break lexical_join_262;
    }
    lexicalValue197_262_0 = 0x1.0p-1f;
    }
    life8_295 = lexicalValue197_262_0;
    if (!((life6_13 != 0))) {
        break lexical_join_271;
    }
    if (!((life7_249 != -1))) {
        break lexical_join_271;
    }
    if (!(__fieldRead197_60(receiver))) {
        break lexical_join_275;
    }
    }
    if (!(p1)) {
        break lexical_join_275;
    }
    lexicalValue197_276_0 = 1;
    break lexical_join_276;
    }
    lexicalValue197_276_0 = 0;
    }
    life9_320 = lexicalValue197_276_0;
    if (!((life9_320 != 0))) {
        break lexical_join_291;
    }
    net.minecraft.client.gui.FontRenderer __stackOp197_61_0 = receiver;
    __fieldWrite197_63(__stackOp197_61_0, (__fieldRead197_62(__stackOp197_61_0) - life8_295));
    net.minecraft.client.gui.FontRenderer __stackOp197_64_0 = receiver;
    __fieldWrite197_66(__stackOp197_64_0, (__fieldRead197_65(__stackOp197_64_0) - life8_295));
    }
    life10_343 = __call197_68(receiver, life6_13, __fieldRead197_67(receiver));
    if (!((life9_320 != 0))) {
        break lexical_join_311;
    }
    net.minecraft.client.gui.FontRenderer __stackOp197_69_0 = receiver;
    __fieldWrite197_71(__stackOp197_69_0, (__fieldRead197_70(__stackOp197_69_0) + life8_295));
    net.minecraft.client.gui.FontRenderer __stackOp197_72_0 = receiver;
    __fieldWrite197_74(__stackOp197_72_0, (__fieldRead197_73(__stackOp197_72_0) + life8_295));
    }
    if (!(__fieldRead197_75(receiver))) {
        break lexical_join_364;
    }
    net.minecraft.client.gui.FontRenderer __stackOp197_76_0 = receiver;
    __fieldWrite197_78(__stackOp197_76_0, (__fieldRead197_77(__stackOp197_76_0) + life8_295));
    if (!((life9_320 != 0))) {
        break lexical_join_334;
    }
    net.minecraft.client.gui.FontRenderer __stackOp197_79_0 = receiver;
    __fieldWrite197_81(__stackOp197_79_0, (__fieldRead197_80(__stackOp197_79_0) - life8_295));
    net.minecraft.client.gui.FontRenderer __stackOp197_82_0 = receiver;
    __fieldWrite197_84(__stackOp197_82_0, (__fieldRead197_83(__stackOp197_82_0) - life8_295));
    }
    __call197_86(receiver, life6_13, __fieldRead197_85(receiver));
    net.minecraft.client.gui.FontRenderer __stackOp197_87_0 = receiver;
    __fieldWrite197_89(__stackOp197_87_0, (__fieldRead197_88(__stackOp197_87_0) - life8_295));
    if (!((life9_320 != 0))) {
        break lexical_join_360;
    }
    net.minecraft.client.gui.FontRenderer __stackOp197_90_0 = receiver;
    __fieldWrite197_92(__stackOp197_90_0, (__fieldRead197_91(__stackOp197_90_0) + life8_295));
    net.minecraft.client.gui.FontRenderer __stackOp197_93_0 = receiver;
    __fieldWrite197_95(__stackOp197_93_0, (__fieldRead197_94(__stackOp197_93_0) + life8_295));
    }
    life10_343 = (life10_343 + life8_295);
    }
    __call197_96(receiver, life10_343);
    }
    life5_5 += 1;
    continue lexical_cycle_6;
    }
    }
    return;
}
public static void h197_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019700_0(p0);
}
public static void h197_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019701_0(p0);
}
public static void h197_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019702_0(p0);
}
public static void h197_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019703_0(p0);
}
public static void h197_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019704_0(p0);
}
public static void h197_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019705_0(p0);
}
public static void h197_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019706_0(p0);
}
public static void h197_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019707_0(p0);
}
public static void h197_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019708_0(p0);
}
public static void h197_9(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019709_0(p0);
}
public static void h197_10(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019710_0(p0);
}
public static void h197_11(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019711_0(p0);
}
public static void h197_12(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019712_0(p0);
}
public static void h197_13(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019713_0(p0);
}
public static void h197_14(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019714_0(p0);
}
public static void h197_15(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019715_0(p0);
}
public static void h197_16(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019716_0(p0);
}
public static void h197_17(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019717_0(p0);
}
public static void h197_18(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019718_0(p0);
}
public static void h197_19(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019719_0(p0);
}
public static void h197_20(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019720_0(p0);
}
public static void h197_21(java.lang.RuntimeException p0) throws Throwable {
    throw __call1019721_0(p0);
}
private static native long __fieldRead197_0() throws Throwable;
private static native int __call197_1(java.lang.String a0) throws Throwable;
private static native char __call197_2(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory197_3(char value) throws Throwable;
private static native int __invokedynamic197_4(int a0, long a1) throws Throwable;
private static native int __call197_5(java.lang.String a0) throws Throwable;
private static native java.util.Locale __fieldRead197_6() throws Throwable;
private static native java.lang.String __call197_7(java.lang.String a0, java.util.Locale a1) throws Throwable;
private static native char __call197_8(java.lang.String a0, int a1) throws Throwable;
private static native int __call197_9(java.lang.String a0, char a1) throws Throwable;
private static native int __invokedynamic197_10(int a0, long a1) throws Throwable;
private static native void __fieldWrite197_11(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite197_12(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite197_13(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite197_14(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite197_15(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native int __invokedynamic197_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic197_17(int a0, long a1) throws Throwable;
private static native int[] __fieldRead197_18(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native boolean __call197_19() throws Throwable;
private static native int __call197_20(int a0, int a1) throws Throwable;
private static native void __fieldWrite197_21(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native int __invokedynamic197_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic197_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic197_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic197_25(int a0, long a1) throws Throwable;
private static native float __fieldRead197_26(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call197_27(net.minecraft.client.gui.FontRenderer a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native int __invokedynamic197_28(int a0, long a1) throws Throwable;
private static native void __fieldWrite197_29(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native int __invokedynamic197_30(int a0, long a1) throws Throwable;
private static native void __fieldWrite197_31(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native int __invokedynamic197_32(int a0, long a1) throws Throwable;
private static native void __fieldWrite197_33(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native int __invokedynamic197_34(int a0, long a1) throws Throwable;
private static native void __fieldWrite197_35(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native int __invokedynamic197_36(int a0, long a1) throws Throwable;
private static native void __fieldWrite197_37(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native int __invokedynamic197_38(int a0, long a1) throws Throwable;
private static native void __fieldWrite197_39(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite197_40(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite197_41(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite197_42(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite197_43(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native float __fieldRead197_44(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead197_45(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead197_46(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead197_47(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call197_48(net.minecraft.client.gui.FontRenderer a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native int __call197_49(java.lang.String a0, int a1) throws Throwable;
private static native boolean __fieldRead197_50(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __call197_51(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead197_52(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __call197_53(java.lang.String a0) throws Throwable;
private static native int __call197_54(java.util.Random a0, int a1) throws Throwable;
private static native char __call197_55(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory197_56(char value) throws Throwable;
private static native int __call197_57(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native boolean __fieldRead197_58(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead197_59(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native boolean __fieldRead197_60(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead197_62(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __fieldWrite197_63(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native float __fieldRead197_65(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __fieldWrite197_66(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native boolean __fieldRead197_67(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __call197_68(net.minecraft.client.gui.FontRenderer a0, int a1, boolean a2) throws Throwable;
private static native float __fieldRead197_70(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __fieldWrite197_71(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native float __fieldRead197_73(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __fieldWrite197_74(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native boolean __fieldRead197_75(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead197_77(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __fieldWrite197_78(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native float __fieldRead197_80(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __fieldWrite197_81(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native float __fieldRead197_83(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __fieldWrite197_84(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native boolean __fieldRead197_85(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __call197_86(net.minecraft.client.gui.FontRenderer a0, int a1, boolean a2) throws Throwable;
private static native float __fieldRead197_88(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __fieldWrite197_89(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native float __fieldRead197_91(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __fieldWrite197_92(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native float __fieldRead197_94(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __fieldWrite197_95(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native void __call197_96(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native java.lang.Exception __call1019700_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019701_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019702_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019703_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019704_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019705_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019706_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019707_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019708_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019709_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019710_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019711_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019712_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019713_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019714_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019715_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019716_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019717_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019718_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019719_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019720_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1019721_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0a17112c8c1da8cdadcd(char a0) throws E;
private static final class __SourceHandler_0a17112c8c1da8cdadcd {

public static boolean f1296(char p0) throws Throwable {
    int forwardValue1296_49_0;
    long life1_3;
    forward_join_49: {
    forward_join_48: {
    forward_join_46: {
    forward_join_32: {
    forward_join_18: {
    life1_3 = (__fieldRead1296_0() ^ 48906912009994L);
    if (!((p0 >= __invokedynamic1296_1(18825, (39308792659800240L ^ life1_3))))) {
        break forward_join_18;
    }
    if (!((p0 > __invokedynamic1296_2(20115, (2855876710395377537L ^ life1_3))))) {
        break forward_join_46;
    }
    }
    if (!((p0 >= __invokedynamic1296_3(22311, (7807560495750278700L ^ life1_3))))) {
        break forward_join_32;
    }
    if (!((p0 > __invokedynamic1296_4(21018, (4586494162544192316L ^ life1_3))))) {
        break forward_join_46;
    }
    }
    if (!((p0 >= __invokedynamic1296_5(13118, (1519400110596164154L ^ life1_3))))) {
        break forward_join_48;
    }
    if (!((p0 <= __invokedynamic1296_6(24404, (9081519767122601585L ^ life1_3))))) {
        break forward_join_48;
    }
    }
    forwardValue1296_49_0 = 1;
    break forward_join_49;
    }
    forwardValue1296_49_0 = 0;
    }
    return __integerCategory1296_7(forwardValue1296_49_0);
}
public static void h1296_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129600_0(p0);
}
public static void h1296_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129601_0(p0);
}
public static void h1296_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129602_0(p0);
}
public static void h1296_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129603_0(p0);
}
public static void h1296_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129604_0(p0);
}
public static void h1296_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129605_0(p0);
}
private static native long __fieldRead1296_0() throws Throwable;
private static native int __invokedynamic1296_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic1296_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic1296_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic1296_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic1296_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1296_6(int a0, long a1) throws Throwable;
private static native boolean __integerCategory1296_7(int value) throws Throwable;
private static native java.lang.Exception __call1129600_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129601_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129602_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129603_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129604_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129605_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_429c9ff90a2010190f0e(net.minecraft.client.gui.FontRenderer a0, moom.DD a1) throws E;
private static final class __SourceHandler_429c9ff90a2010190f0e {

public static void f1297(net.minecraft.client.gui.FontRenderer receiver, moom.DD p0) throws Throwable {
    forward_join_15: {
    forward_join_8: {
    if (!((__call1297_1(__fieldRead1297_0(receiver)) == p0))) { break forward_join_8; }
    if (!(__fieldRead1297_2(receiver))) { break forward_join_15; }
    }
    __call1297_4(__fieldRead1297_3(receiver), p0);
    __fieldWrite1297_5(receiver, 0);
    }
    return;
}
public static void h1297_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129700_0(p0);
}
public static void h1297_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129701_0(p0);
}
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead1297_0(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native moom.DD __call1297_1(net.minecraft.client.renderer.texture.TextureManager a0) throws Throwable;
private static native boolean __fieldRead1297_2(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead1297_3(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call1297_4(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite1297_5(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1129700_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129701_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8d600925b4192b44368b(net.minecraft.client.gui.FontRenderer a0) throws E;
private static final class __SourceHandler_8d600925b4192b44368b {

public static void f549(net.minecraft.client.gui.FontRenderer receiver) throws Throwable {
    java.lang.Object life1_1;
    java.io.InputStream life1_8;
    life1_1 = null;
    life1_8 = __call549_0(receiver, new moom.DD("font/glyph_sizes.bin"));
    __call549_2(life1_8, __fieldRead549_1(receiver));
    __call549_3(life1_8);
    return;
}
public static void h549_0(java.io.IOException p0) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    throw new java.lang.RuntimeException(life1_2);
}
public static void h549_1(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3054901_0(p1);
    throw life2_2;
}
private static native java.io.InputStream __call549_0(net.minecraft.client.gui.FontRenderer a0, moom.DD a1) throws Throwable;
private static native byte[] __fieldRead549_1(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __call549_2(java.io.InputStream a0, byte[] a1) throws Throwable;
private static native void __call549_3(java.io.InputStream a0) throws Throwable;
private static native void __call3054901_0(java.io.InputStream a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_7dc639d10057aa19487c(net.minecraft.client.gui.FontRenderer a0, char a1) throws E;
private static final class __SourceHandler_7dc639d10057aa19487c {

public static int f2210(net.minecraft.client.gui.FontRenderer receiver, char p0) throws Throwable {
    long life2_3;
    int life4_7;
    int life5_22;
    life2_3 = (__fieldRead2210_0() ^ 5606442596277L);
    life4_7 = __call2210_1("0123456789abcdef", p0);
    if ((life4_7 >= 0)) {
        if ((life4_7 < (__fieldRead2210_2(receiver)).length)) {
        life5_22 = (__fieldRead2210_3(receiver))[life4_7];
        if (__call2210_4()) {
        life5_22 = __call2210_5(life4_7, life5_22);
    }
        return life5_22;
    }
    }
    return __invokedynamic2210_6(7163, (1971744554248919644L ^ life2_3));
}
public static void h2210_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1221000_0(p0);
}
private static native long __fieldRead2210_0() throws Throwable;
private static native int __call2210_1(java.lang.String a0, char a1) throws Throwable;
private static native int[] __fieldRead2210_2(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int[] __fieldRead2210_3(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native boolean __call2210_4() throws Throwable;
private static native int __call2210_5(int a0, int a1) throws Throwable;
private static native int __invokedynamic2210_6(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1221000_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_8cb475bd4588138812ff(net.minecraft.client.gui.FontRenderer a0, char a1, boolean a2) throws E;
private static final class __SourceHandler_8cb475bd4588138812ff {

public static float f100143(net.minecraft.client.gui.FontRenderer receiver, char p0, boolean p1) throws Throwable {
    float forestValue100143_97_0;
    long life3_3;
    int life5_18;
    int life6_28;
    int life7_39;
    float life8_42;
    float life9_47;
    float life10_64;
    float life11_85;
    float life12_91;
    float life13_97;
    forest_join_97: {
    forest_join_96: {
    forest_join_11: {
    life3_3 = (__fieldRead100143_0() ^ 39964548260740L);
    if (!(((__fieldRead100143_1(receiver))[p0] == 0))) {
        break forest_join_11;
    }
    return 0x0.0p0f;
    }
    life5_18 = (p0 / __invokedynamic100143_2(5185, (1906076185228067317L ^ life3_3)));
    __call100143_3(receiver, life5_18);
    life6_28 = ((__fieldRead100143_4(receiver))[p0] >>> 4);
    life7_39 = ((__fieldRead100143_5(receiver))[p0] & __invokedynamic100143_6(22437, (1792374337389396501L ^ life3_3)));
    life8_42 = ((float) life6_28);
    life9_47 = ((float) (life7_39 + 1));
    life10_64 = (((float) ((p0 % __invokedynamic100143_7(2553, (7263017583814663271L ^ life3_3))) * __invokedynamic100143_8(2553, (7263017583814663271L ^ life3_3)))) + life8_42);
    life11_85 = ((float) (((p0 & __invokedynamic100143_9(22203, (6497910201271518011L ^ life3_3))) / __invokedynamic100143_10(2553, (7263017583814663271L ^ life3_3))) * __invokedynamic100143_11(2553, (7263017583814663271L ^ life3_3))));
    life12_91 = ((life9_47 - life8_42) - 0x1.47ae14p-6f);
    if (!(p1)) {
        break forest_join_96;
    }
    forestValue100143_97_0 = 0x1.0p0f;
    break forest_join_97;
    }
    forestValue100143_97_0 = 0x0.0p0f;
    }
    life13_97 = forestValue100143_97_0;
    __call100143_12(5);
    __call100143_13((life10_64 / 0x1.0p8f), (life11_85 / 0x1.0p8f));
    __call100143_16((__fieldRead100143_14(receiver) + life13_97), __fieldRead100143_15(receiver), 0x0.0p0f);
    __call100143_17((life10_64 / 0x1.0p8f), ((life11_85 + 0x1.ff5c28p3f) / 0x1.0p8f));
    __call100143_20((__fieldRead100143_18(receiver) - life13_97), (__fieldRead100143_19(receiver) + 0x1.ff5c28p2f), 0x0.0p0f);
    __call100143_21(((life10_64 + life12_91) / 0x1.0p8f), (life11_85 / 0x1.0p8f));
    __call100143_24(((__fieldRead100143_22(receiver) + (life12_91 / 0x1.0p1f)) + life13_97), __fieldRead100143_23(receiver), 0x0.0p0f);
    __call100143_25(((life10_64 + life12_91) / 0x1.0p8f), ((life11_85 + 0x1.ff5c28p3f) / 0x1.0p8f));
    __call100143_28(((__fieldRead100143_26(receiver) + (life12_91 / 0x1.0p1f)) - life13_97), (__fieldRead100143_27(receiver) + 0x1.ff5c28p2f), 0x0.0p0f);
    __call100143_29();
    return (((life9_47 - life8_42) / 0x1.0p1f) + 0x1.0p0f);
}
public static float h100143_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call13014300_0(p0);
}
public static float h100143_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call13014301_0(p0);
}
private static native long __fieldRead100143_0() throws Throwable;
private static native byte[] __fieldRead100143_1(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __invokedynamic100143_2(int a0, long a1) throws Throwable;
private static native void __call100143_3(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native byte[] __fieldRead100143_4(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native byte[] __fieldRead100143_5(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __invokedynamic100143_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic100143_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic100143_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic100143_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic100143_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic100143_11(int a0, long a1) throws Throwable;
private static native void __call100143_12(int a0) throws Throwable;
private static native void __call100143_13(float a0, float a1) throws Throwable;
private static native float __fieldRead100143_14(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead100143_15(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call100143_16(float a0, float a1, float a2) throws Throwable;
private static native void __call100143_17(float a0, float a1) throws Throwable;
private static native float __fieldRead100143_18(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead100143_19(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call100143_20(float a0, float a1, float a2) throws Throwable;
private static native void __call100143_21(float a0, float a1) throws Throwable;
private static native float __fieldRead100143_22(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead100143_23(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call100143_24(float a0, float a1, float a2) throws Throwable;
private static native void __call100143_25(float a0, float a1) throws Throwable;
private static native float __fieldRead100143_26(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead100143_27(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call100143_28(float a0, float a1, float a2) throws Throwable;
private static native void __call100143_29() throws Throwable;
private static native java.lang.Exception __call13014300_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13014301_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_413597a30e852c44d91f(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws E;
private static final class __SourceHandler_413597a30e852c44d91f {

public static java.lang.String f1298(net.minecraft.client.gui.FontRenderer receiver, java.lang.String p0) throws Throwable {
    lexical_join_15: {
    lexical_cycle_0: while (true) {
    if (!((p0 != null))) {
        break lexical_join_15;
    }
    if (!(__call1298_0(p0, "\n"))) {
        break lexical_join_15;
    }
    p0 = __call1298_2(p0, 0, (__call1298_1(p0) - 1));
    continue lexical_cycle_0;
    }
    }
    return p0;
}
public static void h1298_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129800_0(p0);
}
private static native boolean __call1298_0(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call1298_1(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1298_2(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1129800_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_d7190a13c7ee7a397ec0(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4, boolean a5) throws E;
private static final class __SourceHandler_d7190a13c7ee7a397ec0 {

public static int f2213(net.minecraft.client.gui.FontRenderer receiver, java.lang.String p0, float p1, float p2, int p3, boolean p4) throws Throwable {
    long life6_3;
    life6_3 = (__fieldRead2213_0() ^ 49134193948255L);
    if ((p0 == null)) {
        return 0;
    }
    if (__fieldRead2213_1(receiver)) {
        p0 = __call2213_2(receiver, p0);
    }
    if (((p3 & __invokedynamic2213_3(16748, (7332717468629057819L ^ life6_3))) == 0)) {
        p3 = (p3 | __invokedynamic2213_4(5325, (8880483737316791447L ^ life6_3)));
    }
    if (p4) {
        p3 = (((p3 & __invokedynamic2213_5(2077, (7250929670155831382L ^ life6_3))) >> 2) | (p3 & __invokedynamic2213_6(26920, (6049698216731535699L ^ life6_3))));
    }
    __fieldWrite2213_9(receiver, (((float) ((p3 >> __invokedynamic2213_7(2553, (7263009831289522620L ^ life6_3))) & __invokedynamic2213_8(22203, (6497918082713114336L ^ life6_3)))) / 0x1.fep7f));
    __fieldWrite2213_12(receiver, (((float) ((p3 >> __invokedynamic2213_10(24832, (8609839488962388323L ^ life6_3))) & __invokedynamic2213_11(22203, (6497918082713114336L ^ life6_3)))) / 0x1.fep7f));
    __fieldWrite2213_14(receiver, (((float) (p3 & __invokedynamic2213_13(22203, (6497918082713114336L ^ life6_3)))) / 0x1.fep7f));
    __fieldWrite2213_17(receiver, (((float) ((p3 >> __invokedynamic2213_15(21135, (5823217053250376354L ^ life6_3))) & __invokedynamic2213_16(22203, (6497918082713114336L ^ life6_3)))) / 0x1.fep7f));
    __call2213_22(receiver, __fieldRead2213_18(receiver), __fieldRead2213_19(receiver), __fieldRead2213_20(receiver), __fieldRead2213_21(receiver));
    __fieldWrite2213_23(receiver, p1);
    __fieldWrite2213_24(receiver, p2);
    __call2213_25(receiver, p0, p4);
    return ((int) __fieldRead2213_26(receiver));
}
public static void h2213_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1221300_0(p0);
}
private static native long __fieldRead2213_0() throws Throwable;
private static native boolean __fieldRead2213_1(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.lang.String __call2213_2(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic2213_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic2213_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic2213_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic2213_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic2213_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic2213_8(int a0, long a1) throws Throwable;
private static native void __fieldWrite2213_9(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native int __invokedynamic2213_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic2213_11(int a0, long a1) throws Throwable;
private static native void __fieldWrite2213_12(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native int __invokedynamic2213_13(int a0, long a1) throws Throwable;
private static native void __fieldWrite2213_14(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native int __invokedynamic2213_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic2213_16(int a0, long a1) throws Throwable;
private static native void __fieldWrite2213_17(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native float __fieldRead2213_18(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead2213_19(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead2213_20(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native float __fieldRead2213_21(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native void __call2213_22(net.minecraft.client.gui.FontRenderer a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __fieldWrite2213_23(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite2213_24(net.minecraft.client.gui.FontRenderer a0, float a1) throws Throwable;
private static native void __call2213_25(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, boolean a2) throws Throwable;
private static native float __fieldRead2213_26(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.lang.Exception __call1221300_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_0c42868a1e58b1ee4fd6(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws E;
private static final class __SourceHandler_0c42868a1e58b1ee4fd6 {

public static int f976(net.minecraft.client.gui.FontRenderer receiver, java.lang.String p0, int p1) throws Throwable {
    int forestValue976_118_0;
    long life3_3;
    int life5_6;
    float life6_8;
    int life7_10;
    int life8_12;
    int life9_14;
    int life10_21;
    int life11_51;
    forest_join_118: {
    forest_join_117: {
    forest_join_106: {
    forest_join_103: {
    life3_3 = (__fieldRead976_0() ^ 7682037225064L);
    life5_6 = __call976_1(p0);
    life6_8 = 0x0.0p0f;
    life7_10 = 0;
    life8_12 = -1;
    life9_14 = 0;
    forest_cycle_15: while (true) {
    forest_join_101: {
    forest_join_96: {
    forest_join_88: {
    forest_join_86: {
    forest_join_83: {
    forest_join_42: {
    forest_join_28: {
    forest_join_26: {
    forest_join_24: {
    if (!((life7_10 < life5_6))) {
        break forest_join_106;
    }
    life10_21 = __integerCategory976_3(__call976_2(p0, life7_10));
    switch (life10_21) {
case 10:
{
        break forest_join_24;
    }
case 32:
{
        break forest_join_26;
    }
default:
{
        break forest_join_28;
    }
case 167:
{
        break forest_join_42;
    }
}
    }
    life7_10 += -1;
    break forest_join_88;
    }
    life8_12 = life7_10;
    }
    life6_8 = (life6_8 + ((float) __call976_4(receiver, life10_21)));
    if (!((life9_14 != 0))) {
        break forest_join_88;
    }
    life6_8 = (life6_8 + 0x1.0p0f);
    break forest_join_88;
    }
    if (!((life7_10 < (life5_6 - 1)))) {
        break forest_join_88;
    }
    life7_10 += 1;
    life11_51 = __integerCategory976_6(__call976_5(p0, life7_10));
    if (!((life11_51 != __invokedynamic976_7(14356, (521243580871776329L ^ life3_3))))) {
        break forest_join_86;
    }
    if (!((life11_51 != __invokedynamic976_8(13303, (5603710266684281767L ^ life3_3))))) {
        break forest_join_86;
    }
    if (!((life11_51 != __invokedynamic976_9(19853, (6306430752322907604L ^ life3_3))))) {
        break forest_join_83;
    }
    if (!((life11_51 != __invokedynamic976_10(9344, (5006836656132392168L ^ life3_3))))) {
        break forest_join_83;
    }
    if (!(__call976_11(life11_51))) {
        break forest_join_88;
    }
    }
    life9_14 = 0;
    break forest_join_88;
    }
    life9_14 = 1;
    }
    if (!((life10_21 == __invokedynamic976_12(24267, (4200115199606521496L ^ life3_3))))) {
        break forest_join_96;
    }
    break forest_join_103;
    }
    if (!((__call976_13(life6_8) > p1))) {
        break forest_join_101;
    }
    break forest_join_106;
    }
    life7_10 += 1;
    continue forest_cycle_15;
    }
    }
    life7_10 += 1;
    life8_12 = life7_10;
    }
    if (!((life7_10 != life5_6))) {
        break forest_join_117;
    }
    if (!((life8_12 != -1))) {
        break forest_join_117;
    }
    if (!((life8_12 < life7_10))) {
        break forest_join_117;
    }
    forestValue976_118_0 = life8_12;
    break forest_join_118;
    }
    forestValue976_118_0 = life7_10;
    }
    return forestValue976_118_0;
}
public static int h976_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097600_0(p0);
}
public static int h976_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097601_0(p0);
}
public static int h976_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097602_0(p0);
}
public static int h976_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097603_0(p0);
}
public static int h976_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097604_0(p0);
}
public static int h976_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097605_0(p0);
}
public static int h976_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097606_0(p0);
}
public static int h976_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097607_0(p0);
}
public static int h976_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097608_0(p0);
}
private static native long __fieldRead976_0() throws Throwable;
private static native int __call976_1(java.lang.String a0) throws Throwable;
private static native char __call976_2(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory976_3(char value) throws Throwable;
private static native int __call976_4(net.minecraft.client.gui.FontRenderer a0, int a1) throws Throwable;
private static native char __call976_5(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory976_6(char value) throws Throwable;
private static native int __invokedynamic976_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic976_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic976_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic976_10(int a0, long a1) throws Throwable;
private static native boolean __call976_11(int a0) throws Throwable;
private static native int __invokedynamic976_12(int a0, long a1) throws Throwable;
private static native int __call976_13(float a0) throws Throwable;
private static native java.lang.Exception __call3097600_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3097601_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3097602_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3097603_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3097604_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3097605_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3097606_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3097607_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3097608_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b952fddde7f890b0cb89(char a0) throws E;
private static final class __SourceHandler_b952fddde7f890b0cb89 {

public static boolean f1299(char p0) throws Throwable {
    int forwardValue1299_49_0;
    long life1_3;
    forward_join_49: {
    forward_join_48: {
    forward_join_46: {
    forward_join_32: {
    forward_join_18: {
    life1_3 = (__fieldRead1299_0() ^ 31090731413496L);
    if (!((p0 >= __invokedynamic1299_1(28249, (4777620291384326023L ^ life1_3))))) {
        break forward_join_18;
    }
    if (!((p0 > __invokedynamic1299_2(8032, (6938029043886802590L ^ life1_3))))) {
        break forward_join_46;
    }
    }
    if (!((p0 >= __invokedynamic1299_3(16709, (4671379581254736055L ^ life1_3))))) {
        break forward_join_32;
    }
    if (!((p0 > __invokedynamic1299_4(1196, (5644401968256212337L ^ life1_3))))) {
        break forward_join_46;
    }
    }
    if (!((p0 != __invokedynamic1299_5(19853, (6306424730997462084L ^ life1_3))))) {
        break forward_join_46;
    }
    if (!((p0 == __invokedynamic1299_6(9344, (5006808523476368760L ^ life1_3))))) {
        break forward_join_48;
    }
    }
    forwardValue1299_49_0 = 1;
    break forward_join_49;
    }
    forwardValue1299_49_0 = 0;
    }
    return __integerCategory1299_7(forwardValue1299_49_0);
}
public static void h1299_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129900_0(p0);
}
public static void h1299_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129901_0(p0);
}
public static void h1299_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129902_0(p0);
}
public static void h1299_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129903_0(p0);
}
public static void h1299_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129904_0(p0);
}
public static void h1299_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1129905_0(p0);
}
private static native long __fieldRead1299_0() throws Throwable;
private static native int __invokedynamic1299_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic1299_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic1299_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic1299_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic1299_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1299_6(int a0, long a1) throws Throwable;
private static native boolean __integerCategory1299_7(int value) throws Throwable;
private static native java.lang.Exception __call1129900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129901_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129902_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129903_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129904_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1129905_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_9f6c34e2976bdbae1afb(java.lang.String a0) throws E;
private static final class __SourceHandler_9f6c34e2976bdbae1afb {

public static java.lang.String f550(java.lang.String p0) throws Throwable {
    long life1_3;
    java.lang.StringBuilder life3_7;
    int life4_9;
    int life5_12;
    int life6_38;
    forest_join_58: {
    life1_3 = (__fieldRead550_0() ^ 56810625362176L);
    life3_7 = new java.lang.StringBuilder();
    life4_9 = -1;
    life5_12 = __call550_1(p0);
    forest_cycle_13: while (true) {
    forest_join_57: {
    forest_join_48: {
    if (!(((life4_9 = __call550_3(p0, __invokedynamic550_2(10768, (3103215174929118564L ^ life1_3)), (life4_9 + 1))) != -1))) {
        break forest_join_58;
    }
    if (!((life4_9 < (life5_12 - 1)))) {
        continue forest_cycle_13;
    }
    life6_38 = __integerCategory550_5(__call550_4(p0, (life4_9 + 1)));
    if (!(__call550_6(life6_38))) {
        break forest_join_48;
    }
    life3_7 = new java.lang.StringBuilder(__invokedynamic550_7(life6_38));
    break forest_join_57;
    }
    if (!(__call550_8(life6_38))) {
        break forest_join_57;
    }
    __call550_10(__call550_9(life3_7, "§"), life6_38);
    }
    continue forest_cycle_13;
    }
    }
    return __call550_11(life3_7);
}
public static java.lang.String h550_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3055000_0(p0);
}
public static java.lang.String h550_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3055001_0(p0);
}
private static native long __fieldRead550_0() throws Throwable;
private static native int __call550_1(java.lang.String a0) throws Throwable;
private static native int __invokedynamic550_2(int a0, long a1) throws Throwable;
private static native int __call550_3(java.lang.String a0, int a1, int a2) throws Throwable;
private static native char __call550_4(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory550_5(char value) throws Throwable;
private static native boolean __call550_6(int a0) throws Throwable;
private static native java.lang.String __invokedynamic550_7(int a0) throws Throwable;
private static native boolean __call550_8(int a0) throws Throwable;
private static native java.lang.StringBuilder __call550_9(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call550_10(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.String __call550_11(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Exception __call3055000_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3055001_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a873c0ca62006705ec0d() throws E;
private static final class __SourceHandler_a873c0ca62006705ec0d {

public static boolean f2217() throws Throwable {
    int life0_1;
    life0_1 = __integerCategory2217_1(__call2217_0());
    if ((life0_1 == 0)) {
        return true;
    }
    return false;
}
public static void h2217_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1221700_0(p0);
}
private static native boolean __call2217_0() throws Throwable;
private static native int __integerCategory2217_1(boolean value) throws Throwable;
private static native java.lang.Exception __call1221700_0(java.lang.RuntimeException a0) throws Throwable;

}


public int b(char p0) { return __sourceHandlerCall_7dc639d10057aa19487c(this, p0); }


private int b(java.lang.String p0, float p1, float p2, int p3, boolean p4) { return __sourceHandlerCall_d7190a13c7ee7a397ec0(this, p0, p1, p2, p3, p4); }


public void b(boolean p0) {
this.l = ((boolean)(p0));
    return;
}


public int b(java.lang.String p0, float p1, float p2, int p3) {
return ((net.minecraft.client.gui.FontRenderer)(this)).a(((java.lang.String)(p0)), ((float)(p1)), ((float)(p2)), ((int)(p3)), ((boolean)(false)));
}


private int b(java.lang.String p0, int p1) { return __sourceHandlerCall_0c42868a1e58b1ee4fd6(this, p0, p1); }


private static boolean b__Boolean(char p0) { return __sourceHandlerCall_b952fddde7f890b0cb89(p0); }


private java.lang.String b(java.lang.String p0) { return __sourceHandlerCall_413597a30e852c44d91f(this, p0); }


public boolean b__Boolean() {
return ((((this.l) ? 1 : 0)) != 0);
}


private float b(char p0, boolean p1) { return __sourceHandlerCall_8cb475bd4588138812ff(this, p0, p1); }


public void b(moom.oR p0) {
this.g = ((moom.DD)(moom.NN.a__DD(((moom.DD)(this.x)))));
    java.util.Arrays.fill(((java.lang.Object[])(net.minecraft.client.gui.FontRenderer.a)), ((java.lang.Object)(null)));
    ((net.minecraft.client.gui.FontRenderer)(this)).a();
    ((net.minecraft.client.gui.FontRenderer)(this)).b();
    return;
}


private void b() { __sourceHandlerCall_8d600925b4192b44368b(this); }


public void e() {
((java.util.HashMap)(this.C)).clear();
    return;
}


public static java.lang.String c(java.lang.String p0) { return __sourceHandlerCall_9f6c34e2976bdbae1afb(p0); }


public static boolean c__Boolean() {
return ((((net.minecraft.client.gui.FontRenderer.E) ? 1 : 0)) != 0);
}


private void c() {
this.r = ((boolean)(false));
    this.s = ((boolean)(false));
    this.t = ((boolean)(false));
    this.u = ((boolean)(false));
    this.v = ((boolean)(false));
    return;
}


public static void c(boolean p0) {
E = ((boolean)(p0));
    return;
}


public static boolean d__Boolean() { return __sourceHandlerCall_a873c0ca62006705ec0d(); }


protected void d() {
moom.kZ.d__Void();
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24395;
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
            throw new RuntimeException("moom/ga", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         H[var3] = var15;
      }

      return H[var3];
}


private static boolean a__Boolean(char p0) { return __sourceHandlerCall_0a17112c8c1da8cdadcd(p0); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10194_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ga"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


java.lang.String a(java.lang.String p0, int p1, int p2) { return __sourceHandlerCall_b21d98c94e9106569554(this, p0, p1, p2); }


public java.util.List<java.lang.String> a__List(java.lang.String p0, int p1) {
return java.util.Arrays.asList(((((java.lang.String)(((net.minecraft.client.gui.FontRenderer)(this)).a(((java.lang.String)(p0)), ((int)(p1)), ((int)(0))))).split(((java.lang.String)("\n"))))));
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


protected void a(float p0, float p1, float p2, float p3) {
moom.kZ.c(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_983d49ee113640(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected java.io.InputStream a(moom.DD p0) throws java.io.IOException {
return ((net.minecraft.client.resources.IResource)(((moom.oR)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__oR())).a__oQ(((moom.DD)(p0))))).a();
}


protected void a__Void(moom.DD p0) { __sourceHandlerCall_429c9ff90a2010190f0e(this, p0); }


public int a(java.lang.String p0, float p1, float p2, int p3) {
return ((net.minecraft.client.gui.FontRenderer)(this)).a(((java.lang.String)(p0)), ((float)(p1)), ((float)(p2)), ((int)(p3)), ((boolean)(true)));
}


public int a(java.lang.String p0, float p1, float p2, int p3, boolean p4) { return __sourceHandlerCall_bf7dc2460a7f1305ed0a(this, p0, p1, p2, p3, p4); }


private java.lang.String a__String(java.lang.String p0) {
long local2 = (net.minecraft.client.gui.FontRenderer.F ^ 112928355641063L);
    try {
        com.ibm.icu.text.Bidi local4 = new com.ibm.icu.text.Bidi(((com.ibm.icu.text.ArabicShaping)(new com.ibm.icu.text.ArabicShaping(__sourceIntrinsic_7d31a37a36f2_invokedynamic10198_1(24832, (8609758233203257819L ^ local2))))).shape(((java.lang.String)(p0))), __sourceIntrinsic_7d31a37a36f2_invokedynamic10198_3(31672, (1434396443777182528L ^ local2)));
        ((com.ibm.icu.text.Bidi)(local4)).setReorderingMode(((int)(0)));
        return ((com.ibm.icu.text.Bidi)(local4)).writeReordered(((int)(2)));
    } catch (com.ibm.icu.text.ArabicShapingException caught4) {
        return p0;
    }
}


private void a(java.lang.String p0, boolean p1) { __sourceHandlerCall_6af298647daae82947c4(this, p0, p1); }


protected void a(float p0) { __sourceHandlerCall_a51ef6a933af076898bf(this, p0); }


private int a(java.lang.String p0, int p1, int p2, int p3, int p4, boolean p5) {
int life7_8;
    if (this.l) {
        life7_8 = ((net.minecraft.client.gui.FontRenderer)(this)).a(((java.lang.String)(((net.minecraft.client.gui.FontRenderer)(this)).a__String(((java.lang.String)(p0))))));
        p1 = ((p1 + p3) - life7_8);
    }
    return ((net.minecraft.client.gui.FontRenderer)(this)).b(((java.lang.String)(p0)), ((float)(((float) p1))), ((float)(((float) p2))), ((int)(p4)), ((boolean)(p5)));
}


private void a() { __sourceHandlerCall_ad967a4fc953c658b08f(this); }


private float a(char p0, boolean p1) { return __sourceHandlerCall_cba209b9f296aa0ff12f(this, p0, p1); }


private float a(int p0, boolean p1) { return __sourceHandlerCall_8d69771daa8243f9b140(this, p0, p1); }


private moom.DD a(int p0) {
try {
        if (((net.minecraft.client.gui.FontRenderer.a)[p0] == null)) {
        (net.minecraft.client.gui.FontRenderer.a)[p0] = new moom.DD(java.lang.String.format(((java.lang.String)("textures/font/unicode_page_%02x.png")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(p0)))}))));
        (net.minecraft.client.gui.FontRenderer.a)[p0] = moom.NN.a__DD(((moom.DD)((net.minecraft.client.gui.FontRenderer.a)[p0])));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw __sourceExactCall_5eb319d8dc2fee(((java.lang.Exception)(caught_rethrow_0)));
    }
    return (net.minecraft.client.gui.FontRenderer.a)[p0];
}


private void a__Void(int p0) {
((net.minecraft.client.gui.FontRenderer)(this)).a__Void(((moom.DD)(((net.minecraft.client.gui.FontRenderer)(this)).a(((int)(p0))))));
    return;
}


public void a(java.lang.String p0, int p1, int p2, int p3, int p4) { __sourceHandlerCall_1e313581364a5db123b1(this, p0, p1, p2, p3, p4); }


private void a(java.lang.String p0, int p1, int p2, int p3, boolean p4) {
java.util.Iterator life6_5;
    java.lang.String life7_12;
    life6_5 = ((java.util.List)(((net.minecraft.client.gui.FontRenderer)(this)).a__List(((java.lang.String)(p0)), ((int)(p3))))).iterator();
    while (((java.util.Iterator)(life6_5)).hasNext()) {
        life7_12 = ((java.lang.String)(((java.util.Iterator)(life6_5)).next()));
        ((net.minecraft.client.gui.FontRenderer)(this)).a(((java.lang.String)(life7_12)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(this.q)), ((boolean)(p4)));
        p2 = (p2 + this.c);
    }
    return;
}


public int a(java.lang.String p0, int p1) {
return (this.c * ((java.util.List)(((net.minecraft.client.gui.FontRenderer)(this)).a__List(((java.lang.String)(p0)), ((int)(p1))))).size());
}


public void a(boolean p0) {
this.k = ((boolean)(p0));
    return;
}


public boolean a__Boolean() {
return ((((this.k) ? 1 : 0)) != 0);
}


public int a(java.lang.String p0) { return __sourceHandlerCall_12d384cfcf144e31a175(this, p0); }


public int a__Int(char p0) {
return java.lang.Math.round(((float)(((net.minecraft.client.gui.FontRenderer)(this)).a(((char)(p0))))));
}


private float a(char p0) { return __sourceHandlerCall_a9df8a6dbc2c55f3f326(this, p0); }


public java.lang.String a__String(java.lang.String p0, int p1) {
return ((net.minecraft.client.gui.FontRenderer)(this)).a(((java.lang.String)(p0)), ((int)(p1)), ((boolean)(false)));
}


public java.lang.String a(java.lang.String p0, int p1, boolean p2) { return __sourceHandlerCall_6e14f86aab4c98feb33c(this, p0, p1, p2); }


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1765_54(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10194_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7d31a37a36f2_invokedynamic10198_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7d31a37a36f2_invokedynamic10198_3(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_983d49ee113640(int p0, long p1);
private static native java.lang.Exception __sourceExactCall_5eb319d8dc2fee(java.lang.Exception p0);
}
