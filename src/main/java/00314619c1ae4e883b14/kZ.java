package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class kZ {

private static final moom.k1 a;

private static final moom.k3 b;

private static final moom.k3[] c;

private static final moom.k8 d;

private static final moom.k2 e;

private static final moom.k_ f;

private static final moom.la g;

private static final moom.k9 h;

private static final moom.lb i;

private static final moom.k6 j;

private static final moom.lf k;

private static final moom.k4 l;

private static final moom.ld m;

private static final moom.k3 n;

private static int o;

private static final moom.lg[] p;

private static int q;

private static final moom.k3 r;

private static final moom.k7 s;

private static final moom.k5 t;

public static boolean u;

private static final moom.N0 v;

private static final moom.Mg w;

private static final moom.N0 x;

private static final moom.Mh y;

private static boolean z;

private static java.lang.String A;

private static final long B;

private static final long[] C;

private static final java.lang.Integer[] D;

private static final java.util.Map E;

public kZ() {
super();
}


static {
B = ((long)(((moom._a)(moom._c.a(((long)(-5791288771352785819L)), ((long)(-7752074713859979695L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(219494539152265L)))));
    long local11_life6 = (moom.kZ.B ^ 24278604754027L);
    java.lang.Object __sourceSpill1368_8 = null;
    E = ((java.util.Map)(new java.util.HashMap(13)));
    moom.kZ.b(((java.lang.String)(__sourceSpill1368_8)));
    javax.crypto.Cipher local0_life11;
    javax.crypto.Cipher __sourceSpill1368_13 = (local0_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1368_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1368_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1368_16 = new byte[8];
    (__sourceSpill1368_16)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life17 = 1;
    while ((local1_life17 < 8)) {
        (__sourceSpill1368_16)[local1_life17] = ((byte) ((int) ((local11_life6 << (local1_life17 * 8)) >>> 56)));
        local1_life17 += 1;
    }
    byte[] __sourcePreallocation1368_18 = __sourceSpill1368_16;
    ((javax.crypto.Cipher)(__sourceSpill1368_13)).init(((int)(__sourceSpill1368_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1368_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1368_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life21 = new long[18];
    int local3_life22 = 0;
    java.lang.String local4_life23;
    int local5_life25 = ((java.lang.String)((local4_life23 = "§º'HUí¬Òô3²üâ°Âq\fJÎÂ28~|¢hNòØ!\027²|Ñ³\025¾\006JµMPs\033Öà_¾Ïæ'¨xª×äì®}x5(ç8~¤cQì@óCù¥4\034\035\005\034íØ¬ä\000¦²AlýMõýw[¾ÒÇ²ÆóÆv@ã7bÔ«±§"))).length();
    int local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1368_27 = local4_life23;
        int __sourceSpill1368_28 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1368_27)).substring(((int)(__sourceSpill1368_28)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1368_32 = local6_life21;
        int __sourceSpill1368_33 = local3_life22;
        local3_life22 += 1;
        long local8_life34 = (((((((((((long) (local7_life31)[0]) & 255L) << 56) | ((((long) (local7_life31)[1]) & 255L) << 48)) | ((((long) (local7_life31)[2]) & 255L) << 40)) | ((((long) (local7_life31)[3]) & 255L) << 32)) | ((((long) (local7_life31)[4]) & 255L) << 24)) | ((((long) (local7_life31)[5]) & 255L) << 16)) | ((((long) (local7_life31)[6]) & 255L) << 8)) | (((long) (local7_life31)[7]) & 255L));
        byte[] __sourceSpill1368_35 = new byte[8];
        (__sourceSpill1368_35)[0] = ((byte) ((int) (local8_life34 >>> 56)));
        (__sourceSpill1368_35)[1] = ((byte) ((int) (local8_life34 >>> 48)));
        (__sourceSpill1368_35)[2] = ((byte) ((int) (local8_life34 >>> 40)));
        (__sourceSpill1368_35)[3] = ((byte) ((int) (local8_life34 >>> 32)));
        (__sourceSpill1368_35)[4] = ((byte) ((int) (local8_life34 >>> 24)));
        (__sourceSpill1368_35)[5] = ((byte) ((int) (local8_life34 >>> 16)));
        (__sourceSpill1368_35)[6] = ((byte) ((int) (local8_life34 >>> 8)));
        (__sourceSpill1368_35)[7] = ((byte) ((int) local8_life34));
        javax.crypto.Cipher __sourceSpill1368_36 = local0_life11;
        byte[] local10_life38 = ((javax.crypto.Cipher)(__sourceSpill1368_36)).doFinal(((byte[])(__sourceSpill1368_35)));
        (__sourceSpill1368_32)[__sourceSpill1368_33] = (((((((((((long) (local10_life38)[0]) & 255L) << 56) | ((((long) (local10_life38)[1]) & 255L) << 48)) | ((((long) (local10_life38)[2]) & 255L) << 40)) | ((((long) (local10_life38)[3]) & 255L) << 32)) | ((((long) (local10_life38)[4]) & 255L) << 24)) | ((((long) (local10_life38)[5]) & 255L) << 16)) | ((((long) (local10_life38)[6]) & 255L) << 8)) | (((long) (local10_life38)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    local5_life25 = ((java.lang.String)((local4_life23 = "¶ÊJuÅ\005stg\036eËi"))).length();
    local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1368_40 = local4_life23;
        int __sourceSpill1368_41 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1368_40)).substring(((int)(__sourceSpill1368_41)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1368_45 = local6_life21;
        int __sourceSpill1368_46 = local3_life22;
        local3_life22 += 1;
        long local8_life47 = (((((((((((long) (local7_life44)[0]) & 255L) << 56) | ((((long) (local7_life44)[1]) & 255L) << 48)) | ((((long) (local7_life44)[2]) & 255L) << 40)) | ((((long) (local7_life44)[3]) & 255L) << 32)) | ((((long) (local7_life44)[4]) & 255L) << 24)) | ((((long) (local7_life44)[5]) & 255L) << 16)) | ((((long) (local7_life44)[6]) & 255L) << 8)) | (((long) (local7_life44)[7]) & 255L));
        byte[] __sourceSpill1368_48 = new byte[8];
        (__sourceSpill1368_48)[0] = ((byte) ((int) (local8_life47 >>> 56)));
        (__sourceSpill1368_48)[1] = ((byte) ((int) (local8_life47 >>> 48)));
        (__sourceSpill1368_48)[2] = ((byte) ((int) (local8_life47 >>> 40)));
        (__sourceSpill1368_48)[3] = ((byte) ((int) (local8_life47 >>> 32)));
        (__sourceSpill1368_48)[4] = ((byte) ((int) (local8_life47 >>> 24)));
        (__sourceSpill1368_48)[5] = ((byte) ((int) (local8_life47 >>> 16)));
        (__sourceSpill1368_48)[6] = ((byte) ((int) (local8_life47 >>> 8)));
        (__sourceSpill1368_48)[7] = ((byte) ((int) local8_life47));
        javax.crypto.Cipher __sourceSpill1368_49 = local0_life11;
        byte[] local10_life51 = ((javax.crypto.Cipher)(__sourceSpill1368_49)).doFinal(((byte[])(__sourceSpill1368_48)));
        (__sourceSpill1368_45)[__sourceSpill1368_46] = (((((((((((long) (local10_life51)[0]) & 255L) << 56) | ((((long) (local10_life51)[1]) & 255L) << 48)) | ((((long) (local10_life51)[2]) & 255L) << 40)) | ((((long) (local10_life51)[3]) & 255L) << 32)) | ((((long) (local10_life51)[4]) & 255L) << 24)) | ((((long) (local10_life51)[5]) & 255L) << 16)) | ((((long) (local10_life51)[6]) & 255L) << 8)) | (((long) (local10_life51)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    C = ((long[])(local6_life21));
    D = ((java.lang.Integer[])(new java.lang.Integer[18]));
    a = ((moom.k1)(new moom.k1()));
    b = ((moom.k3)(new moom.k3(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_55(8149, (5968057858467152207L ^ local11_life6)))));
    c = ((moom.k3[])(new moom.k3[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_57(19371, (7800263023117735228L ^ local11_life6))]));
    d = ((moom.k8)(new moom.k8()));
    e = ((moom.k2)(new moom.k2()));
    f = ((moom.k_)(new moom.k_()));
    g = ((moom.la)(new moom.la()));
    h = ((moom.k9)(new moom.k9()));
    i = ((moom.lb)(new moom.lb()));
    j = ((moom.k6)(new moom.k6()));
    k = ((moom.lf)(new moom.lf()));
    l = ((moom.k4)(new moom.k4()));
    m = ((moom.ld)(new moom.ld()));
    n = ((moom.k3)(new moom.k3(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_69(24171, (2141642516835303673L ^ local11_life6)))));
    o = ((int)(0));
    p = ((moom.lg[])(new moom.lg[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_72(15422, (2423106046267941541L ^ local11_life6))]));
    q = ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_74(12125, (5531568470664278468L ^ local11_life6))));
    r = ((moom.k3)(new moom.k3(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_76(13612, (8861335006932528043L ^ local11_life6)))));
    s = ((moom.k7)(new moom.k7()));
    t = ((moom.k5)(new moom.k5()));
    u = ((boolean)(true));
    v = ((moom.N0)(new moom.N0()));
    w = ((moom.Mg)(new moom.Mg()));
    x = ((moom.N0)(new moom.N0()));
    y = ((moom.Mh)(new moom.Mh()));
    z = ((boolean)(false));
    int local13_life86 = 0;
    while ((local13_life86 < __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_87(3536, (4014240489771586372L ^ local11_life6)))) {
        (moom.kZ.c)[local13_life86] = new moom.k3((__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_89(7990, (4480426285739917739L ^ local11_life6)) + local13_life86));
        local13_life86 += 1;
    }
    local13_life86 = 0;
    while ((local13_life86 < (moom.kZ.p).length)) {
        (moom.kZ.p)[local13_life86] = new moom.lg();
        local13_life86 += 1;
    }
}


public static void B() {
org.lwjgl.opengl.GL11.glPushMatrix();
    return;
}


public static void C() {
org.lwjgl.opengl.GL11.glPopMatrix();
    return;
}


public static void D() {
moom.k5 spill873_0;
    moom.k5 spill873_1;
    moom.k5 spill873_2;
    float spill873_3;
    float spill873_4;
    float spill873_5;
    spill873_0 = moom.kZ.t;
    spill873_1 = moom.kZ.t;
    spill873_2 = moom.kZ.t;
    moom.k5 __stackOp873_4_0 = moom.kZ.t;
    float __stackOp873_4_1 = -0x1.0p0f;
    spill873_3 = __stackOp873_4_1;
    ((moom.k5)(__stackOp873_4_0)).d = ((float)(__stackOp873_4_1));
    moom.k5 __stackOp873_6_0 = spill873_2;
    float __stackOp873_6_1 = spill873_3;
    spill873_4 = __stackOp873_6_1;
    ((moom.k5)(__stackOp873_6_0)).c = ((float)(__stackOp873_6_1));
    moom.k5 __stackOp873_8_0 = spill873_1;
    float __stackOp873_8_1 = spill873_4;
    spill873_5 = __stackOp873_8_1;
    ((moom.k5)(__stackOp873_8_0)).b = ((float)(__stackOp873_8_1));
    ((moom.k5)(spill873_0)).a = ((float)(spill873_5));
    return;
}


public static void F() {
org.lwjgl.opengl.GL11.glEndList();
    moom.kZ.z = ((boolean)(false));
    return;
}


public static void I() {
if ((__sourceIntrinsic_booleanComparison(((moom.N0)(moom.kZ.v)).b()) != 0)) {
        moom.kZ.c(((moom.Mg)(moom.kZ.w)));
    }
    return;
}


public static void J() {
if ((__sourceIntrinsic_booleanComparison(((moom.N0)(moom.kZ.x)).b()) != 0)) {
        moom.kZ.c(((moom.Mh)(moom.kZ.y)));
    }
    return;
}


public static void i(int p0) {
long life1_3;
    life1_3 = (moom.kZ.B ^ 27407778016731L);
    if ((p0 != ((moom.lg)((moom.kZ.p)[moom.kZ.o])).b)) {
        ((moom.lg)((moom.kZ.p)[moom.kZ.o])).b = ((int)(p0));
        org.lwjgl.opengl.GL11.glBindTexture(((int)(__sourceIntrinsic_4984c5be6222_invokedynamic3734_7(8815, (6349471669142175054L ^ life1_3)))), ((int)(p0)));
        if (moom.JY.a__Boolean()) {
        moom.JY.b(((int)(p0)));
    }
    }
    return;
}


public static void i() {
((moom.k3)(((moom.k_)(moom.kZ.f)).a)).a();
    return;
}


public static void b(double p0, double p1, double p2) {
org.lwjgl.opengl.GL11.glTranslated(((double)(p0)), ((double)(p1)), ((double)(p2)));
    return;
}


public static java.lang.String b__String() {
return moom.kZ.A;
}


public static void b(int p0, int p1, int p2, java.nio.ByteBuffer p3) {
org.lwjgl.opengl.GL11.glVertexPointer(((int)(p0)), ((int)(p1)), ((int)(p2)), ((java.nio.ByteBuffer)(p3)));
    return;
}


public static void b(float p0) {
long life1_3;
    life1_3 = (moom.kZ.B ^ 263069405522L);
    if ((recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(((moom.la)(moom.kZ.g)).d))) != 0)) {
        ((moom.la)(moom.kZ.g)).d = ((float)(p0));
        org.lwjgl.opengl.GL11.glFogf(((int)(__sourceIntrinsic_43ded3b47eba_invokedynamic3725_6(30675, (7543034880717689977L ^ life1_3)))), ((float)(p0)));
    }
    return;
}


public static void b(java.lang.String p0) {
moom.kZ.A = ((java.lang.String)(p0));
    return;
}


public static int b() {
return org.lwjgl.opengl.GL11.glGetError();
}


public static void b(int p0, int p1, int p2, int p3) {
org.lwjgl.opengl.GL11.glViewport(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    return;
}


public static void b__Void() {
org.lwjgl.opengl.GL11.glPopAttrib();
    return;
}


public static void b(moom.aE p0) {
((moom.k3)(((moom.le)(moom.kZ.a(((moom.aE)(p0))))).a)).a();
    return;
}


public static void b(int p0, java.nio.FloatBuffer p1) {
org.lwjgl.opengl.GL11.glGetFloat(((int)(p0)), ((java.nio.FloatBuffer)(p1)));
    return;
}


public static void b(float p0, float p1, float p2, float p3) {
org.lwjgl.opengl.GL11.glRotatef(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    return;
}


public static void b(float p0, float p1, float p2) {
org.lwjgl.opengl.GL11.glTranslatef(((float)(p0)), ((float)(p1)), ((float)(p2)));
    return;
}


public static void b(int p0) {
((moom.k3)((moom.kZ.c)[p0])).a();
    return;
}


public static void b(int p0, int p1, int p2) {
org.lwjgl.opengl.GL11.glTexParameteri(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public static void b(moom.Mg p0) {
if ((__sourceIntrinsic_booleanComparison(((moom.N0)(moom.kZ.v)).c()) != 0)) {
        ((moom.Mg)(p0)).a(((moom.Mg)(moom.kZ.w)));
    } else {
        ((moom.Mg)(p0)).a(((boolean)__sourceIntrinsic_integerToBoolean((((((moom.k3)(((moom.k1)(moom.kZ.a)).a)).b) ? 1 : 0)))), ((int)(((moom.k1)(moom.kZ.a)).b)), ((float)(((moom.k1)(moom.kZ.a)).c)));
    }
    return;
}


public static void b(moom.Mh p0) {
if ((__sourceIntrinsic_booleanComparison(((moom.N0)(moom.kZ.x)).c()) != 0)) {
        ((moom.Mh)(p0)).a(((moom.Mh)(moom.kZ.y)));
    } else {
        ((moom.Mh)(p0)).a(((boolean)__sourceIntrinsic_integerToBoolean((((((moom.k3)(((moom.k2)(moom.kZ.e)).a)).b) ? 1 : 0)))), ((int)(((moom.k2)(moom.kZ.e)).b)), ((int)(((moom.k2)(moom.kZ.e)).c)), ((int)(((moom.k2)(moom.kZ.e)).d)), ((int)(((moom.k2)(moom.kZ.e)).e)));
    }
    return;
}


public static void b(boolean p0) {
((moom.k3)(((moom.la)(moom.kZ.g)).a)).a(((boolean)(p0)));
    return;
}


public static void b(java.nio.IntBuffer p0) {
((java.nio.IntBuffer)(p0)).rewind();
    while ((((java.nio.IntBuffer)(p0)).position() < ((java.nio.IntBuffer)(p0)).limit())) {
        int local1 = ((java.nio.IntBuffer)(p0)).get();
        moom.kZ.h(((int)(local1)));
    }
    ((java.nio.IntBuffer)(p0)).rewind();
    return;
}


public static void b(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.nio.IntBuffer p8) {
org.lwjgl.opengl.GL11.glTexSubImage2D(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((int)(p7)), ((java.nio.IntBuffer)(p8)));
    return;
}


public static void b(int p0, int p1) {
forward_join_47: {
    forward_join_44: {
    forward_join_24: {
    forward_join_8: {
    if (!(((moom.N0)(moom.kZ.x)).c())) { break forward_join_8; }
    ((moom.Mh)(moom.kZ.y)).a(((int)(p0)), ((int)(p1)));
    break forward_join_47;
    }
    if (!((p0 == ((moom.k2)(moom.kZ.e)).b))) { break forward_join_24; }
    if (!((p1 == ((moom.k2)(moom.kZ.e)).c))) { break forward_join_24; }
    if (!((p0 == ((moom.k2)(moom.kZ.e)).d))) { break forward_join_24; }
    if (!((p1 != ((moom.k2)(moom.kZ.e)).e))) { break forward_join_47; }
    }
    ((moom.k2)(moom.kZ.e)).b = ((int)(p0));
    ((moom.k2)(moom.kZ.e)).c = ((int)(p1));
    ((moom.k2)(moom.kZ.e)).d = ((int)(p0));
    ((moom.k2)(moom.kZ.e)).e = ((int)(p1));
    if (!(moom.BU.ap())) { break forward_join_44; }
    ((moom.Nx)(moom.MP.cc)).a(((int)(p0)), ((int)(p1)), ((int)(p0)), ((int)(p1)));
    }
    org.lwjgl.opengl.GL11.glBlendFunc(((int)(p0)), ((int)(p1)));
    }
    return;
}


public static void e(int p0, int p1) {
org.lwjgl.opengl.GL11.glNewList(((int)(p0)), ((int)(p1)));
    moom.kZ.z = ((boolean)(true));
    return;
}


public static void e() {
((moom.k3)(moom.kZ.b)).b();
    return;
}


public static void e(int p0, int p1, int p2, int p3) {
org.lwjgl.opengl.GL11.glColorPointer(((int)(p0)), ((int)(p1)), ((int)(p2)), ((long)(((long) p3))));
    return;
}


public static void e(int p0) {
if ((p0 != ((moom.k9)(moom.kZ.h)).b)) {
        ((moom.k9)(moom.kZ.h)).b = ((int)(p0));
        org.lwjgl.opengl.GL11.glCullFace(((int)(p0)));
    }
    return;
}


public static void x() {
((moom.k3)(moom.kZ.n)).a();
    return;
}


public static void s() {
((moom.k3)(((moom.k6)(moom.kZ.j)).a)).b();
    return;
}


public static void c(moom.Mg p0) {
if ((__sourceIntrinsic_booleanComparison(((moom.N0)(moom.kZ.v)).c()) != 0)) {
        ((moom.Mg)(moom.kZ.w)).a(((moom.Mg)(p0)));
    } else {
        ((moom.k3)(((moom.k1)(moom.kZ.a)).a)).a(((boolean)(((moom.Mg)(p0)).a__Boolean())));
        moom.kZ.a(((int)(((moom.Mg)(p0)).a__Int())), ((float)(((moom.Mg)(p0)).a())));
    }
    return;
}


public static void c(int p0, int p1, int p2, int p3) {
org.lwjgl.opengl.GL11.glTexCoordPointer(((int)(p0)), ((int)(p1)), ((int)(p2)), ((long)(((long) p3))));
    return;
}


public static void c(int p0, int p1, int p2, java.nio.ByteBuffer p3) {
org.lwjgl.opengl.GL11.glColorPointer(((int)(p0)), ((int)(p1)), ((int)(p2)), ((java.nio.ByteBuffer)(p3)));
    return;
}


public static void c(float p0, float p1, float p2, float p3) {
forward_join_37: {
    forward_join_20: {
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(((moom.k5)(moom.kZ.t)).a))) == 0))) { break forward_join_20; }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p1)), ((float)(((moom.k5)(moom.kZ.t)).b))) == 0))) { break forward_join_20; }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p2)), ((float)(((moom.k5)(moom.kZ.t)).c))) == 0))) { break forward_join_20; }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p3)), ((float)(((moom.k5)(moom.kZ.t)).d))) != 0))) { break forward_join_37; }
    }
    ((moom.k5)(moom.kZ.t)).a = ((float)(p0));
    ((moom.k5)(moom.kZ.t)).b = ((float)(p1));
    ((moom.k5)(moom.kZ.t)).c = ((float)(p2));
    ((moom.k5)(moom.kZ.t)).d = ((float)(p3));
    org.lwjgl.opengl.GL11.glColor4f(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    }
    return;
}


public static void c(float p0, float p1, float p2) {
moom.kZ.c(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(0x1.0p0f)));
    return;
}


public static void c(moom.Mh p0) {
if ((__sourceIntrinsic_booleanComparison(((moom.N0)(moom.kZ.x)).c()) != 0)) {
        ((moom.Mh)(moom.kZ.y)).a(((moom.Mh)(p0)));
    } else {
        ((moom.k3)(((moom.k2)(moom.kZ.e)).a)).a(((boolean)(((moom.Mh)(p0)).a__Boolean())));
        if ((__sourceIntrinsic_booleanComparison(((moom.Mh)(p0)).b__Boolean()) == 0)) {
        moom.kZ.b(((int)(((moom.Mh)(p0)).a())), ((int)(((moom.Mh)(p0)).b())));
    } else {
        moom.kZ.a(((int)(((moom.Mh)(p0)).a())), ((int)(((moom.Mh)(p0)).b())), ((int)(((moom.Mh)(p0)).c())), ((int)(((moom.Mh)(p0)).d())));
    }
    }
    return;
}


public static int c() {
return (net.minecraft.client.renderer.OpenGlHelper.q + moom.kZ.o);
}


public static void c__Void() {
if ((__sourceIntrinsic_booleanComparison(((moom.N0)(moom.kZ.v)).c()) != 0)) {
        ((moom.Mg)(moom.kZ.w)).b();
    } else {
        ((moom.k3)(((moom.k1)(moom.kZ.a)).a)).a();
    }
    return;
}


public static void c(float p0) {
long life1_3;
    life1_3 = (moom.kZ.B ^ 91821938376314L);
    if ((recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(((moom.la)(moom.kZ.g)).e))) != 0)) {
        ((moom.la)(moom.kZ.g)).e = ((float)(p0));
        org.lwjgl.opengl.GL11.glFogf(((int)(__sourceIntrinsic_c0891f2beaed_invokedynamic3727_6(15859, (3115670357211066740L ^ life1_3)))), ((float)(p0)));
    }
    return;
}


public static void c(int p0, int p1) {
org.lwjgl.opengl.GL11.glFogi(((int)(p0)), ((int)(p1)));
    return;
}


public static void c(int p0) {
if ((p0 != ((moom.k_)(moom.kZ.f)).c)) {
        ((moom.k_)(moom.kZ.f)).c = ((int)(p0));
        org.lwjgl.opengl.GL11.glDepthFunc(((int)(p0)));
    }
    return;
}


public static void n() {
((moom.k3)(((moom.la)(moom.kZ.g)).a)).a();
    return;
}


public static void n(int p0) {
org.lwjgl.opengl.GL11.glEnableClientState(((int)(p0)));
    return;
}


public static void h() {
((moom.k3)(((moom.k8)(moom.kZ.d)).a)).a();
    return;
}


public static void h(int p0) {
moom.lg[] life1_5;
    int life2_8;
    int life3_10;
    moom.lg life4_17;
    if ((p0 != 0)) {
        org.lwjgl.opengl.GL11.glDeleteTextures(((int)(p0)));
        life1_5 = moom.kZ.p;
        life2_8 = (life1_5).length;
        life3_10 = 0;
        loop_region_11: while ((life3_10 < life2_8)) {
        life4_17 = (life1_5)[life3_10];
        if ((((moom.lg)(life4_17)).b == p0)) {
        ((moom.lg)(life4_17)).b = ((int)(0));
    }
        life3_10 += 1;
    }
    }
    return;
}


public static void f() {
((moom.k3)(moom.kZ.b)).a();
    return;
}


public static void f(int p0) {
if ((p0 != ((moom.k6)(moom.kZ.j)).b)) {
        ((moom.k6)(moom.kZ.j)).b = ((int)(p0));
        org.lwjgl.opengl.GL11.glLogicOp(((int)(p0)));
    }
    return;
}


public static void l() {
if ((__sourceIntrinsic_booleanComparison(((moom.N0)(moom.kZ.x)).c()) != 0)) {
        ((moom.Mh)(moom.kZ.y)).a__Void();
    } else {
        ((moom.k3)(((moom.k2)(moom.kZ.e)).a)).b();
    }
    return;
}


public static void l(int p0) {
org.lwjgl.opengl.GL11.glMatrixMode(((int)(p0)));
    return;
}


public static void d(int p0, int p1) {
org.lwjgl.opengl.GL11.glDeleteLists(((int)(p0)), ((int)(p1)));
    return;
}


public static int d() {
return ((moom.lg)((moom.kZ.p)[moom.kZ.o])).b;
}


public static void d(int p0, int p1, int p2, int p3) {
org.lwjgl.opengl.GL11.glVertexPointer(((int)(p0)), ((int)(p1)), ((int)(p2)), ((long)(((long) p3))));
    return;
}


public static void d__Void() {
if ((__sourceIntrinsic_booleanComparison(((moom.N0)(moom.kZ.v)).c()) != 0)) {
        ((moom.Mg)(moom.kZ.w)).a__Void();
    } else {
        ((moom.k3)(((moom.k1)(moom.kZ.a)).a)).b();
    }
    return;
}


public static void d(int p0) {
long life1_3;
    life1_3 = (moom.kZ.B ^ 54270775739791L);
    if ((p0 != ((moom.la)(moom.kZ.g)).b)) {
        ((moom.la)(moom.kZ.g)).b = ((int)(p0));
        org.lwjgl.opengl.GL11.glFogi(((int)(__sourceIntrinsic_dd71d5205281_invokedynamic3730_5(28603, (4096308816127711431L ^ life1_3)))), ((int)(p0)));
        if (moom.BU.ap()) {
        moom.MP.a__Void(((int)(p0)));
    }
    }
    return;
}


public static void a(int p0, java.nio.FloatBuffer p1) {
org.lwjgl.opengl.GL11.glFog(((int)(p0)), ((java.nio.FloatBuffer)(p1)));
    return;
}


public static void a(int p0, int p1, float p2) {
org.lwjgl.opengl.GL11.glTexParameterf(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


public static void a(int p0, int p1, int p2, int p3, java.nio.IntBuffer p4) {
org.lwjgl.opengl.GL11.glGetTexImage(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((java.nio.IntBuffer)(p4)));
    return;
}


public static void a(float p0) {
long life1_3;
    life1_3 = (moom.kZ.B ^ 122253490608837L);
    if ((recovery.source.CarrierOps.fcmpg(((float)(p0)), ((float)(0x0.0p0f))) < 0)) {
        p0 = 0x0.0p0f;
    }
    if ((recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(((moom.la)(moom.kZ.g)).c))) != 0)) {
        ((moom.la)(moom.kZ.g)).c = ((float)(p0));
        org.lwjgl.opengl.GL11.glFogf(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic3714_7(6364, (6107912601608007924L ^ life1_3)))), ((float)(p0)));
        if (moom.BU.ap()) {
        moom.MP.c(((float)(p0)));
    }
    }
    return;
}


public static void a(int p0, int p1, java.nio.ByteBuffer p2) {
org.lwjgl.opengl.GL11.glNormalPointer(((int)(p0)), ((int)(p1)), ((java.nio.ByteBuffer)(p2)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8250_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/kZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a(int p0, int p1, int p2, java.nio.ByteBuffer p3) {
org.lwjgl.opengl.GL11.glTexCoordPointer(((int)(p0)), ((int)(p1)), ((int)(p2)), ((java.nio.ByteBuffer)(p3)));
    return;
}


public static int a(int p0, int p1, int p2) {
return org.lwjgl.opengl.GL11.glGetTexLevelParameteri(((int)(p0)), ((int)(p1)), ((int)(p2)));
}


public static void a(int p0, int p1, int p2, int p3) {
forward_join_51: {
    forward_join_46: {
    forward_join_26: {
    forward_join_10: {
    if (!(((moom.N0)(moom.kZ.x)).c())) { break forward_join_10; }
    ((moom.Mh)(moom.kZ.y)).a(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    break forward_join_51;
    }
    if (!((p0 == ((moom.k2)(moom.kZ.e)).b))) { break forward_join_26; }
    if (!((p1 == ((moom.k2)(moom.kZ.e)).c))) { break forward_join_26; }
    if (!((p2 == ((moom.k2)(moom.kZ.e)).d))) { break forward_join_26; }
    if (!((p3 != ((moom.k2)(moom.kZ.e)).e))) { break forward_join_51; }
    }
    ((moom.k2)(moom.kZ.e)).b = ((int)(p0));
    ((moom.k2)(moom.kZ.e)).c = ((int)(p1));
    ((moom.k2)(moom.kZ.e)).d = ((int)(p2));
    ((moom.k2)(moom.kZ.e)).e = ((int)(p3));
    if (!(moom.BU.ap())) { break forward_join_46; }
    ((moom.Nx)(moom.MP.cc)).a(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    }
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    }
    return;
}


public static void a__Void(int p0, int p1, int p2) {
int life3_13;
    int life4_18;
    org.lwjgl.opengl.GL11.glDrawArrays(((int)(p0)), ((int)(p1)), ((int)(p2)));
    if (moom.BU.ap()) {
        if ((!moom.kZ.z)) {
        life3_13 = ((moom.MB)(moom.MP.dk)).e();
        if ((life3_13 > 1)) {
        life4_18 = 1;
        loop_region_16: while ((life4_18 < life3_13)) {
        ((moom.Ns)(moom.MP.cd)).c(((int)(life4_18)));
        org.lwjgl.opengl.GL11.glDrawArrays(((int)(p0)), ((int)(p1)), ((int)(p2)));
        life4_18 += 1;
    }
        ((moom.Ns)(moom.MP.cd)).c(((int)(0)));
    }
    }
    }
    return;
}


public static void a(boolean p0) {
if ((p0 != ((moom.k_)(moom.kZ.f)).b)) {
        ((moom.k_)(moom.kZ.f)).b = ((boolean)(p0));
        org.lwjgl.opengl.GL11.glDepthMask(((boolean)(p0)));
    }
    return;
}


public static void a(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.nio.IntBuffer p8) {
org.lwjgl.opengl.GL11.glTexImage2D(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((int)(p7)), ((java.nio.IntBuffer)(p8)));
    return;
}


public static boolean a__Boolean() {
return ((((((moom.k3)(((moom.la)(moom.kZ.g)).a)).b) ? 1 : 0)) != 0);
}


public static void a(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {
org.lwjgl.opengl.GL11.glCopyTexSubImage2D(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((int)(p7)));
    return;
}


public static void a(java.nio.IntBuffer p0) {
int life1_11;
    int life2_16;
    org.lwjgl.opengl.GL11.glCallLists(((java.nio.IntBuffer)(p0)));
    if (moom.BU.ap()) {
        if ((!moom.kZ.z)) {
        life1_11 = ((moom.MB)(moom.MP.dk)).e();
        if ((life1_11 > 1)) {
        life2_16 = 1;
        loop_region_14: while ((life2_16 < life1_11)) {
        ((moom.Ns)(moom.MP.cd)).c(((int)(life2_16)));
        org.lwjgl.opengl.GL11.glCallLists(((java.nio.IntBuffer)(p0)));
        life2_16 += 1;
    }
        ((moom.Ns)(moom.MP.cd)).c(((int)(0)));
    }
    }
    }
    return;
}


public static void a__Void() {
long local0_life2 = (moom.kZ.B ^ 61278476786598L);
    org.lwjgl.opengl.GL11.glPushAttrib(((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite691_4(26689, (614356217584894236L ^ local0_life2)))));
    return;
}


public static void a(moom.aE p0, int p1, java.nio.FloatBuffer p2) {
org.lwjgl.opengl.GL11.glTexGen(((int)(((moom.le)(moom.kZ.a(((moom.aE)(p0))))).b)), ((int)(p1)), ((java.nio.FloatBuffer)(p2)));
    return;
}


public static void a(boolean p0, boolean p1, boolean p2, boolean p3) {
forward_join_33: {
    forward_join_16: {
    if (!((p0 == ((moom.k7)(moom.kZ.s)).a))) { break forward_join_16; }
    if (!((p1 == ((moom.k7)(moom.kZ.s)).b))) { break forward_join_16; }
    if (!((p2 == ((moom.k7)(moom.kZ.s)).c))) { break forward_join_16; }
    if (!((p3 != ((moom.k7)(moom.kZ.s)).d))) { break forward_join_33; }
    }
    ((moom.k7)(moom.kZ.s)).a = ((boolean)(p0));
    ((moom.k7)(moom.kZ.s)).b = ((boolean)(p1));
    ((moom.k7)(moom.kZ.s)).c = ((boolean)(p2));
    ((moom.k7)(moom.kZ.s)).d = ((boolean)(p3));
    org.lwjgl.opengl.GL11.glColorMask(((boolean)(p0)), ((boolean)(p1)), ((boolean)(p2)), ((boolean)(p3)));
    }
    return;
}


public static void a(double p0) {
if ((recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(((moom.k4)(moom.kZ.l)).a))) != 0)) {
        ((moom.k4)(moom.kZ.l)).a = ((double)(p0));
        org.lwjgl.opengl.GL11.glClearDepth(((double)(p0)));
    }
    return;
}


public static void a(float p0, float p1, float p2, float p3) {
forward_join_45: {
    forward_join_24: {
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(((moom.k5)(((moom.k4)(moom.kZ.l)).b)).a))) == 0))) { break forward_join_24; }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p1)), ((float)(((moom.k5)(((moom.k4)(moom.kZ.l)).b)).b))) == 0))) { break forward_join_24; }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p2)), ((float)(((moom.k5)(((moom.k4)(moom.kZ.l)).b)).c))) == 0))) { break forward_join_24; }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p3)), ((float)(((moom.k5)(((moom.k4)(moom.kZ.l)).b)).d))) != 0))) { break forward_join_45; }
    }
    ((moom.k5)(((moom.k4)(moom.kZ.l)).b)).a = ((float)(p0));
    ((moom.k5)(((moom.k4)(moom.kZ.l)).b)).b = ((float)(p1));
    ((moom.k5)(((moom.k4)(moom.kZ.l)).b)).c = ((float)(p2));
    ((moom.k5)(((moom.k4)(moom.kZ.l)).b)).d = ((float)(p3));
    org.lwjgl.opengl.GL11.glClearColor(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    }
    return;
}


public static void a(int p0, java.nio.IntBuffer p1, java.nio.IntBuffer p2) {
int life3_13;
    int life4_18;
    org.lwjgl.opengl.GL14.glMultiDrawArrays(((int)(p0)), ((java.nio.IntBuffer)(p1)), ((java.nio.IntBuffer)(p2)));
    if (moom.BU.ap()) {
        if ((!moom.kZ.z)) {
        life3_13 = ((moom.MB)(moom.MP.dk)).e();
        if ((life3_13 > 1)) {
        life4_18 = 1;
        loop_region_16: while ((life4_18 < life3_13)) {
        ((moom.Ns)(moom.MP.cd)).c(((int)(life4_18)));
        org.lwjgl.opengl.GL14.glMultiDrawArrays(((int)(p0)), ((java.nio.IntBuffer)(p1)), ((java.nio.IntBuffer)(p2)));
        life4_18 += 1;
    }
        ((moom.Ns)(moom.MP.cd)).c(((int)(0)));
    }
    }
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.kZ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static int a() {
return org.lwjgl.opengl.GL11.glGenTextures();
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 26338;
        if (D[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = C[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])E.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    E.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/kZ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            kZ.D[n2] = n3;
        }
        return D[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static moom.le a(moom.aE p0) {
switch ((moom.k0.a)[((moom.aE)(p0)).ordinal()]) {
case 1:
{
        return ((moom.lf)(moom.kZ.k)).b;
    }
case 2:
{
        return ((moom.lf)(moom.kZ.k)).c;
    }
case 3:
{
        return ((moom.lf)(moom.kZ.k)).d;
    }
default:
{
        return ((moom.lf)(moom.kZ.k)).a;
    }
}
}


public static void a(int p0, float p1) {
forward_join_26: {
    forward_join_17: {
    forward_join_8: {
    if (!(((moom.N0)(moom.kZ.v)).c())) { break forward_join_8; }
    ((moom.Mg)(moom.kZ.w)).a(((int)(p0)), ((float)(p1)));
    break forward_join_26;
    }
    if (!((p0 == ((moom.k1)(moom.kZ.a)).b))) { break forward_join_17; }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p1)), ((float)(((moom.k1)(moom.kZ.a)).c))) != 0))) { break forward_join_26; }
    }
    ((moom.k1)(moom.kZ.a)).b = ((int)(p0));
    ((moom.k1)(moom.kZ.a)).c = ((float)(p1));
    org.lwjgl.opengl.GL11.glAlphaFunc(((int)(p0)), ((float)(p1)));
    }
    return;
}


public static void a(moom.Mg p0) {
if ((__sourceIntrinsic_booleanComparison(((moom.N0)(moom.kZ.v)).c()) == 0)) {
        moom.kZ.b(((moom.Mg)(moom.kZ.w)));
        moom.kZ.c(((moom.Mg)(p0)));
        ((moom.N0)(moom.kZ.v)).a__Boolean();
    }
    return;
}


public static void a(double p0, double p1, double p2) {
org.lwjgl.opengl.GL11.glScaled(((double)(p0)), ((double)(p1)), ((double)(p2)));
    return;
}


public static void a(float p0, float p1) {
forward_join_19: {
    forward_join_10: {
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(((moom.lb)(moom.kZ.i)).c))) == 0))) { break forward_join_10; }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p1)), ((float)(((moom.lb)(moom.kZ.i)).d))) != 0))) { break forward_join_19; }
    }
    ((moom.lb)(moom.kZ.i)).c = ((float)(p0));
    ((moom.lb)(moom.kZ.i)).d = ((float)(p1));
    org.lwjgl.opengl.GL11.glPolygonOffset(((float)(p0)), ((float)(p1)));
    }
    return;
}


public static void a(moom.Mh p0) {
if ((__sourceIntrinsic_booleanComparison(((moom.N0)(moom.kZ.x)).c()) == 0)) {
        moom.kZ.b(((moom.Mh)(moom.kZ.y)));
        moom.kZ.c(((moom.Mh)(p0)));
        ((moom.N0)(moom.kZ.x)).a__Boolean();
    }
    return;
}


public static void a(java.nio.FloatBuffer p0) {
org.lwjgl.opengl.GL11.glMultMatrix(((java.nio.FloatBuffer)(p0)));
    return;
}


public static void a(int p0, int p1) {
forward_join_17: {
    forward_join_8: {
    if (!((p0 == ((moom.k8)(moom.kZ.d)).b))) { break forward_join_8; }
    if (!((p1 != ((moom.k8)(moom.kZ.d)).c))) { break forward_join_17; }
    }
    ((moom.k8)(moom.kZ.d)).b = ((int)(p0));
    ((moom.k8)(moom.kZ.d)).c = ((int)(p1));
    org.lwjgl.opengl.GL11.glColorMaterial(((int)(p0)), ((int)(p1)));
    }
    return;
}


public static void a(moom.aE p0, int p1) {
long life2_3;
    moom.le life4_6;
    life2_3 = (moom.kZ.B ^ 29709116542506L);
    life4_6 = moom.kZ.a(((moom.aE)(p0)));
    if ((p1 != ((moom.le)(life4_6)).c)) {
        ((moom.le)(life4_6)).c = ((int)(p1));
        org.lwjgl.opengl.GL11.glTexGeni(((int)(((moom.le)(life4_6)).b)), ((int)(__sourceIntrinsic_64f785aece7f_invokedynamic3721_5(22782, (3761520198307882019L ^ life2_3)))), ((int)(p1)));
    }
    return;
}


public static void a__Void(moom.aE p0) {
((moom.k3)(((moom.le)(moom.kZ.a(((moom.aE)(p0))))).a)).b();
    return;
}


public static void a(double p0, double p1, double p2, double p3, double p4, double p5) {
org.lwjgl.opengl.GL11.glOrtho(((double)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)));
    return;
}


public static void a(float p0, float p1, float p2) {
org.lwjgl.opengl.GL11.glScalef(((float)(p0)), ((float)(p1)), ((float)(p2)));
    return;
}


public static void a(int p0) {
((moom.k3)((moom.kZ.c)[p0])).b();
    return;
}


public static void m() {
((moom.k3)(((moom.la)(moom.kZ.g)).a)).b();
    return;
}


public static void m(int p0) {
org.lwjgl.opengl.GL11.glDisableClientState(((int)(p0)));
    return;
}


public static void o(int p0) {
org.lwjgl.opengl.GL11.glBegin(((int)(p0)));
    return;
}


public static void o() {
((moom.k3)(((moom.k9)(moom.kZ.h)).a)).b();
    return;
}


public static void p(int p0) {
int life1_11;
    int life2_16;
    org.lwjgl.opengl.GL11.glCallList(((int)(p0)));
    if (moom.BU.ap()) {
        if ((!moom.kZ.z)) {
        life1_11 = ((moom.MB)(moom.MP.dk)).e();
        if ((life1_11 > 1)) {
        life2_16 = 1;
        loop_region_14: while ((life2_16 < life1_11)) {
        ((moom.Ns)(moom.MP.cd)).c(((int)(life2_16)));
        org.lwjgl.opengl.GL11.glCallList(((int)(p0)));
        life2_16 += 1;
    }
        ((moom.Ns)(moom.MP.cd)).c(((int)(0)));
    }
    }
    }
    return;
}


public static void p() {
((moom.k3)(((moom.k9)(moom.kZ.h)).a)).a();
    return;
}


public static void k(int p0) {
if (moom.kZ.u) {
        org.lwjgl.opengl.GL11.glClear(((int)(p0)));
    }
    return;
}


public static void k() {
if ((__sourceIntrinsic_booleanComparison(((moom.N0)(moom.kZ.x)).c()) != 0)) {
        ((moom.Mh)(moom.kZ.y)).b__Void();
    } else {
        ((moom.k3)(((moom.k2)(moom.kZ.e)).a)).a();
    }
    return;
}


public static void t() {
((moom.k3)(((moom.k6)(moom.kZ.j)).a)).a();
    return;
}


public static void g() {
((moom.k3)(((moom.k8)(moom.kZ.d)).a)).b();
    return;
}


public static void g(int p0) {
if ((moom.kZ.o != (p0 - net.minecraft.client.renderer.OpenGlHelper.q))) {
        moom.kZ.o = ((int)((p0 - net.minecraft.client.renderer.OpenGlHelper.q)));
        net.minecraft.client.renderer.OpenGlHelper.i(((int)(p0)));
    }
    return;
}


public static void v() {
((moom.k3)(((moom.lg)((moom.kZ.p)[moom.kZ.o])).a)).a();
    return;
}


public static void j() {
((moom.k3)(((moom.k_)(moom.kZ.f)).a)).b();
    return;
}


public static void j(int p0) {
if ((p0 != moom.kZ.q)) {
        moom.kZ.q = ((int)(p0));
        org.lwjgl.opengl.GL11.glShadeModel(((int)(p0)));
    }
    return;
}


public static void q() {
((moom.k3)(((moom.lb)(moom.kZ.i)).a)).b();
    return;
}


public static void z() {
((moom.k3)(moom.kZ.r)).a();
    return;
}


public static void w() {
((moom.k3)(moom.kZ.n)).b();
    return;
}


public static void u() {
((moom.k3)(((moom.lg)((moom.kZ.p)[moom.kZ.o])).a)).b();
    return;
}


public static void r() {
((moom.k3)(((moom.lb)(moom.kZ.i)).a)).a();
    return;
}


public static void y() {
((moom.k3)(moom.kZ.r)).b();
    return;
}


public static void E() {
org.lwjgl.opengl.GL11.glEnd();
    return;
}


public static void A() {
org.lwjgl.opengl.GL11.glLoadIdentity();
    return;
}


public static void H() {
long life0_3;
    int life2_12;
    int life3_19;
    int life4_21;
    int life5_23;
    forward_join_38: {
    forward_join_32: {
    life0_3 = (moom.kZ.B ^ 97449793201795L);
    if (!(moom.BU.c__Boolean())) { break forward_join_38; }
    life2_12 = org.lwjgl.opengl.GL11.glGetInteger(((int)(__sourceIntrinsic_a6e3b045a2a4_invokedynamic3712_2(4121, (1485221649343890532L ^ life0_3)))));
    life3_19 = org.lwjgl.opengl.GL11.glGetInteger(((int)(__sourceIntrinsic_a6e3b045a2a4_invokedynamic3712_4(20799, (1044339641330566472L ^ life0_3)))));
    life4_21 = moom.kZ.c();
    life5_23 = moom.kZ.d();
    if (!((life5_23 > 0))) { break forward_join_38; }
    if (!((life2_12 == life4_21))) { break forward_join_32; }
    if (!((life3_19 != life5_23))) { break forward_join_38; }
    }
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_a6e3b045a2a4_invokedynamic3712_8(life4_21, life2_12, life5_23, life3_19))));
    }
    return;
}


public static void G() {
long local0_life2 = (moom.kZ.B ^ 127878326682120L);
    org.lwjgl.opengl.GL11.glBindTexture(((int)(__sourceIntrinsic_c7b45e3c376e_originalDynamicSite690_4(9607, (853728041324926330L ^ local0_life2)))), ((int)(((moom.lg)((moom.kZ.p)[moom.kZ.o])).b)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1368_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_originalDynamicSite690_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6e3b045a2a4_invokedynamic3712_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6e3b045a2a4_invokedynamic3712_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a6e3b045a2a4_invokedynamic3712_8(int a0, int a1, int a2, int a3) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic3714_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8250_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64f785aece7f_invokedynamic3721_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite691_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_43ded3b47eba_invokedynamic3725_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0891f2beaed_invokedynamic3727_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dd71d5205281_invokedynamic3730_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4984c5be6222_invokedynamic3734_7(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
