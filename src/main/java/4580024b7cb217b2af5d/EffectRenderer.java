package net.minecraft.client.particle;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EffectRenderer {

public static moom.DD a;

protected net.minecraft.world.World b;

private java.util.List<net.minecraft.client.particle.EntityFX>[][] c;

private java.util.List<moom.sq> d;

private net.minecraft.client.renderer.texture.TextureManager e;

private java.util.Random f;

private java.util.Map<java.lang.Integer, net.minecraft.client.particle.IParticleFactory> g;

private java.util.List<net.minecraft.client.particle.EntityFX> h;

private java.util.List<net.minecraft.client.particle.EntityFX> i;

private static net.minecraft.entity.Entity[] j;

private static long k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

private static long o;

public EffectRenderer(net.minecraft.world.World p0, net.minecraft.client.renderer.texture.TextureManager p1) { super(); __sourceHandlerCall_0bdd1b80a47edba7b5db(this, p0, p1); }


static {
k = ((long)(((moom._a)(moom._c.a(((long)(3164545072092843800L)), ((long)(2902113923995360397L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(263067410600824L)))));
    java.lang.Object __sourceSpill1169_6 = null;
    n = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.client.particle.EffectRenderer.b(((net.minecraft.entity.Entity[])(__sourceSpill1169_6)));
    long local5_life9 = (net.minecraft.client.particle.EffectRenderer.k ^ 67024639152015L);
    javax.crypto.Cipher local7_life11;
    javax.crypto.Cipher __sourceSpill1169_13 = (local7_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1169_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1169_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1169_16 = new byte[8];
    (__sourceSpill1169_16)[0] = ((byte) ((int) (local5_life9 >>> 56)));
    int local8_life17 = 1;
    while ((local8_life17 < 8)) {
        (__sourceSpill1169_16)[local8_life17] = ((byte) ((int) ((local5_life9 << (local8_life17 * 8)) >>> 56)));
        local8_life17 += 1;
    }
    byte[] __sourcePreallocation1169_18 = __sourceSpill1169_16;
    ((javax.crypto.Cipher)(__sourceSpill1169_13)).init(((int)(__sourceSpill1169_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1169_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1169_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life21 = new long[6];
    int local10_life22 = 0;
    java.lang.String local11_life23;
    int local12_life25 = ((java.lang.String)((local11_life23 = "°v[t)QhGó^\021ÄDÍuÞU¬ÐSSÂ±óÜl"))).length();
    int local9_life26 = 0;
    do {
        java.lang.String __sourceSpill1169_27 = local11_life23;
        int __sourceSpill1169_28 = local9_life26;
        local9_life26 += 8;
        byte[] local14_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1169_27)).substring(((int)(__sourceSpill1169_28)), ((int)(local9_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1169_32 = local13_life21;
        int __sourceSpill1169_33 = local10_life22;
        local10_life22 += 1;
        long local15_life34 = (((((((((((long) (local14_life31)[0]) & 255L) << 56) | ((((long) (local14_life31)[1]) & 255L) << 48)) | ((((long) (local14_life31)[2]) & 255L) << 40)) | ((((long) (local14_life31)[3]) & 255L) << 32)) | ((((long) (local14_life31)[4]) & 255L) << 24)) | ((((long) (local14_life31)[5]) & 255L) << 16)) | ((((long) (local14_life31)[6]) & 255L) << 8)) | (((long) (local14_life31)[7]) & 255L));
        byte[] __sourceSpill1169_35 = new byte[8];
        (__sourceSpill1169_35)[0] = ((byte) ((int) (local15_life34 >>> 56)));
        (__sourceSpill1169_35)[1] = ((byte) ((int) (local15_life34 >>> 48)));
        (__sourceSpill1169_35)[2] = ((byte) ((int) (local15_life34 >>> 40)));
        (__sourceSpill1169_35)[3] = ((byte) ((int) (local15_life34 >>> 32)));
        (__sourceSpill1169_35)[4] = ((byte) ((int) (local15_life34 >>> 24)));
        (__sourceSpill1169_35)[5] = ((byte) ((int) (local15_life34 >>> 16)));
        (__sourceSpill1169_35)[6] = ((byte) ((int) (local15_life34 >>> 8)));
        (__sourceSpill1169_35)[7] = ((byte) ((int) local15_life34));
        javax.crypto.Cipher __sourceSpill1169_36 = local7_life11;
        byte[] local17_life38 = ((javax.crypto.Cipher)(__sourceSpill1169_36)).doFinal(((byte[])(__sourceSpill1169_35)));
        (__sourceSpill1169_32)[__sourceSpill1169_33] = (((((((((((long) (local17_life38)[0]) & 255L) << 56) | ((((long) (local17_life38)[1]) & 255L) << 48)) | ((((long) (local17_life38)[2]) & 255L) << 40)) | ((((long) (local17_life38)[3]) & 255L) << 32)) | ((((long) (local17_life38)[4]) & 255L) << 24)) | ((((long) (local17_life38)[5]) & 255L) << 16)) | ((((long) (local17_life38)[6]) & 255L) << 8)) | (((long) (local17_life38)[7]) & 255L));
    } while ((!(local9_life26 >= local12_life25)));
    local12_life25 = ((java.lang.String)((local11_life23 = "®)=`Â¿\025ÂùÊcP»v"))).length();
    local9_life26 = 0;
    do {
        java.lang.String __sourceSpill1169_40 = local11_life23;
        int __sourceSpill1169_41 = local9_life26;
        local9_life26 += 8;
        byte[] local14_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1169_40)).substring(((int)(__sourceSpill1169_41)), ((int)(local9_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1169_45 = local13_life21;
        int __sourceSpill1169_46 = local10_life22;
        local10_life22 += 1;
        long local15_life47 = (((((((((((long) (local14_life44)[0]) & 255L) << 56) | ((((long) (local14_life44)[1]) & 255L) << 48)) | ((((long) (local14_life44)[2]) & 255L) << 40)) | ((((long) (local14_life44)[3]) & 255L) << 32)) | ((((long) (local14_life44)[4]) & 255L) << 24)) | ((((long) (local14_life44)[5]) & 255L) << 16)) | ((((long) (local14_life44)[6]) & 255L) << 8)) | (((long) (local14_life44)[7]) & 255L));
        byte[] __sourceSpill1169_48 = new byte[8];
        (__sourceSpill1169_48)[0] = ((byte) ((int) (local15_life47 >>> 56)));
        (__sourceSpill1169_48)[1] = ((byte) ((int) (local15_life47 >>> 48)));
        (__sourceSpill1169_48)[2] = ((byte) ((int) (local15_life47 >>> 40)));
        (__sourceSpill1169_48)[3] = ((byte) ((int) (local15_life47 >>> 32)));
        (__sourceSpill1169_48)[4] = ((byte) ((int) (local15_life47 >>> 24)));
        (__sourceSpill1169_48)[5] = ((byte) ((int) (local15_life47 >>> 16)));
        (__sourceSpill1169_48)[6] = ((byte) ((int) (local15_life47 >>> 8)));
        (__sourceSpill1169_48)[7] = ((byte) ((int) local15_life47));
        javax.crypto.Cipher __sourceSpill1169_49 = local7_life11;
        byte[] local17_life51 = ((javax.crypto.Cipher)(__sourceSpill1169_49)).doFinal(((byte[])(__sourceSpill1169_48)));
        (__sourceSpill1169_45)[__sourceSpill1169_46] = (((((((((((long) (local17_life51)[0]) & 255L) << 56) | ((((long) (local17_life51)[1]) & 255L) << 48)) | ((((long) (local17_life51)[2]) & 255L) << 40)) | ((((long) (local17_life51)[3]) & 255L) << 32)) | ((((long) (local17_life51)[4]) & 255L) << 24)) | ((((long) (local17_life51)[5]) & 255L) << 16)) | ((((long) (local17_life51)[6]) & 255L) << 8)) | (((long) (local17_life51)[7]) & 255L));
    } while ((!(local9_life26 >= local12_life25)));
    l = ((long[])(local13_life21));
    m = ((java.lang.Integer[])(new java.lang.Integer[6]));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill1169_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1169_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1169_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1169_60 = new byte[8];
    (__sourceSpill1169_60)[0] = ((byte) ((int) (local5_life9 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill1169_60)[local1_life61] = ((byte) ((int) ((local5_life9 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation1169_62 = __sourceSpill1169_60;
    ((javax.crypto.Cipher)(__sourceSpill1169_57)).init(((int)(__sourceSpill1169_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1169_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1169_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life65 = -6553327707053709298L;
    byte[] __sourceSpill1169_66 = new byte[8];
    (__sourceSpill1169_66)[0] = ((byte) ((int) (local2_life65 >>> 56)));
    (__sourceSpill1169_66)[1] = ((byte) ((int) (local2_life65 >>> 48)));
    (__sourceSpill1169_66)[2] = ((byte) ((int) (local2_life65 >>> 40)));
    (__sourceSpill1169_66)[3] = ((byte) ((int) (local2_life65 >>> 32)));
    (__sourceSpill1169_66)[4] = ((byte) ((int) (local2_life65 >>> 24)));
    (__sourceSpill1169_66)[5] = ((byte) ((int) (local2_life65 >>> 16)));
    (__sourceSpill1169_66)[6] = ((byte) ((int) (local2_life65 >>> 8)));
    (__sourceSpill1169_66)[7] = ((byte) ((int) local2_life65));
    javax.crypto.Cipher __sourceSpill1169_67 = local0_life55;
    byte[] local4_life69 = ((javax.crypto.Cipher)(__sourceSpill1169_67)).doFinal(((byte[])(__sourceSpill1169_66)));
    o = ((long)((((((((((((long) (local4_life69)[0]) & 255L) << 56) | ((((long) (local4_life69)[1]) & 255L) << 48)) | ((((long) (local4_life69)[2]) & 255L) << 40)) | ((((long) (local4_life69)[3]) & 255L) << 32)) | ((((long) (local4_life69)[4]) & 255L) << 24)) | ((((long) (local4_life69)[5]) & 255L) << 16)) | ((((long) (local4_life69)[6]) & 255L) << 8)) | (((long) (local4_life69)[7]) & 255L))));
    a = ((moom.DD)(null));
}

private static native <E extends Throwable> void __sourceHandlerCall_0bdd1b80a47edba7b5db(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.world.World a1, net.minecraft.client.renderer.texture.TextureManager a2) throws E;
private static final class __SourceHandler_0bdd1b80a47edba7b5db {

public static void f535(net.minecraft.client.particle.EffectRenderer receiver, net.minecraft.world.World p0, net.minecraft.client.renderer.texture.TextureManager p1) throws Throwable {
    int life3_34;
    int life4_45;
    forest_join_60: {
    __directSuperInit535_0(receiver);
    __fieldWrite535_1(receiver, new java.util.List[4][]);
    __fieldWrite535_3(receiver, __call535_2());
    __fieldWrite535_4(receiver, new java.util.Random());
    __fieldWrite535_6(receiver, __call535_5());
    __fieldWrite535_7(receiver, new java.util.ArrayList());
    __fieldWrite535_8(receiver, new java.util.ArrayList());
    __fieldWrite535_9(receiver, p0);
    __fieldWrite535_10(receiver, p1);
    life3_34 = 0;
    forest_cycle_35: while (true) {
    forest_join_58: {
    if (!((life3_34 < 4))) {
        break forest_join_60;
    }
    (__fieldRead535_11(receiver))[life3_34] = new java.util.List[2];
    life4_45 = 0;
    forest_cycle_46: while (true) {
    if (!((life4_45 < 2))) {
        break forest_join_58;
    }
    ((__fieldRead535_12(receiver))[life3_34])[life4_45] = __call535_13();
    life4_45 += 1;
    continue forest_cycle_46;
    }
    }
    life3_34 += 1;
    continue forest_cycle_35;
    }
    }
    __call535_14(receiver);
    return;
}
public static void h535_0(moom.Oo p0) throws Throwable {
    throw __call3053500_0(p0);
}
private static native void __directSuperInit535_0(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native void __fieldWrite535_1(net.minecraft.client.particle.EffectRenderer a0, java.util.List[][] a1) throws Throwable;
private static native java.util.ArrayList __call535_2() throws Throwable;
private static native void __fieldWrite535_3(net.minecraft.client.particle.EffectRenderer a0, java.util.ArrayList a1) throws Throwable;
private static native void __fieldWrite535_4(net.minecraft.client.particle.EffectRenderer a0, java.util.Random a1) throws Throwable;
private static native java.util.HashMap __call535_5() throws Throwable;
private static native void __fieldWrite535_6(net.minecraft.client.particle.EffectRenderer a0, java.util.HashMap a1) throws Throwable;
private static native void __fieldWrite535_7(net.minecraft.client.particle.EffectRenderer a0, java.util.ArrayList a1) throws Throwable;
private static native void __fieldWrite535_8(net.minecraft.client.particle.EffectRenderer a0, java.util.ArrayList a1) throws Throwable;
private static native void __fieldWrite535_9(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.world.World a1) throws Throwable;
private static native void __fieldWrite535_10(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.client.renderer.texture.TextureManager a1) throws Throwable;
private static native java.util.List[][] __fieldRead535_11(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native java.util.List[][] __fieldRead535_12(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native java.util.ArrayList __call535_13() throws Throwable;
private static native void __call535_14(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native java.lang.Throwable __call3053500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1c006c2a5e83c29e68e9(net.minecraft.client.particle.EffectRenderer a0, int a1) throws E;
private static final class __SourceHandler_1c006c2a5e83c29e68e9 {

public static void f2407(net.minecraft.client.particle.EffectRenderer receiver, int p0) throws Throwable {
    int life2_1;
    life2_1 = 0;
    loop_region_2: while ((life2_1 < 2)) {
        __call2407_1(receiver, ((__fieldRead2407_0(receiver))[p0])[life2_1]);
        life2_1 += 1;
    }
    return;
}
public static void h2407_0(moom.Oo p0) throws Throwable {
    throw __call1240700_0(p0);
}
private static native java.util.List[][] __fieldRead2407_0(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native void __call2407_1(net.minecraft.client.particle.EffectRenderer a0, java.util.List a1) throws Throwable;
private static native java.lang.Throwable __call1240700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.particle.EntityFX __sourceHandlerCall_4f28af5ff7a3718eb027(net.minecraft.client.particle.EffectRenderer a0, int a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws E;
private static final class __SourceHandler_4f28af5ff7a3718eb027 {

public static net.minecraft.client.particle.EntityFX f2408(net.minecraft.client.particle.EffectRenderer receiver, int p0, double p1, double p2, double p3, double p4, double p5, double p6, int[] p7) throws Throwable {
    net.minecraft.client.particle.IParticleFactory life15_6;
    net.minecraft.client.particle.EntityFX life16_21;
    life15_6 = __cast2408_3(__call2408_2(__fieldRead2408_0(receiver), __call2408_1(p0)));
    if ((life15_6 != null)) {
        life16_21 = __call2408_5(life15_6, p0, __fieldRead2408_4(receiver), p1, p2, p3, p4, p5, p6, p7);
        if ((life16_21 != null)) {
        __call2408_6(receiver, life16_21);
        return life16_21;
    }
    }
    return null;
}
public static void h2408_0(moom.Oo p0) throws Throwable {
    throw __call1240800_0(p0);
}
private static native java.util.Map __fieldRead2408_0(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native java.lang.Integer __call2408_1(int a0) throws Throwable;
private static native java.lang.Object __call2408_2(java.util.Map a0, java.lang.Integer a1) throws Throwable;
private static native net.minecraft.client.particle.IParticleFactory __cast2408_3(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead2408_4(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native net.minecraft.client.particle.EntityFX __call2408_5(net.minecraft.client.particle.IParticleFactory a0, int a1, net.minecraft.world.World a2, double a3, double a4, double a5, double a6, double a7, double a8, int[] a9) throws Throwable;
private static native void __call2408_6(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.client.particle.EntityFX a1) throws Throwable;
private static native java.lang.Throwable __call1240800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b1fdba1265c56ecae6e8(net.minecraft.client.particle.EffectRenderer a0, java.util.List a1) throws E;
private static final class __SourceHandler_b1fdba1265c56ecae6e8 {

public static void f575(net.minecraft.client.particle.EffectRenderer receiver, java.util.List p0) throws Throwable {
    long life2_3;
    java.util.ArrayList life4_5;
    long life5_7;
    int life7_10;
    int life8_12;
    net.minecraft.client.particle.EntityFX life9_21;
    int life8_47;
    java.util.Iterator life9_50;
    net.minecraft.client.particle.EntityFX life10_60;
    forest_join_64: {
    forest_join_42: {
    life2_3 = (__fieldRead575_0() ^ 99840327068816L);
    life4_5 = __call575_1();
    life5_7 = __call575_2();
    life7_10 = __call575_3(p0);
    life8_12 = 0;
    forest_cycle_13: while (true) {
    forest_join_40: {
    forest_join_32: {
    if (!((life8_12 < __call575_4(p0)))) {
        break forest_join_42;
    }
    life9_21 = __cast575_6(__call575_5(p0, life8_12));
    __call575_7(receiver, life9_21);
    if (!(__fieldRead575_8(life9_21))) {
        break forest_join_32;
    }
    __call575_9(life4_5, life9_21);
    }
    life7_10 += -1;
    if (!((__numericCompare575_12(__call575_10(), (life5_7 + __fieldRead575_11())) > 0))) {
        break forest_join_40;
    }
    break forest_join_42;
    }
    life8_12 += 1;
    continue forest_cycle_13;
    }
    }
    if (!((life7_10 > 0))) {
        break forest_join_64;
    }
    life8_47 = life7_10;
    life9_50 = __call575_13(p0);
    forest_cycle_49: while (true) {
    if (!(__call575_14(life9_50))) {
        break forest_join_64;
    }
    if (!((life8_47 > 0))) {
        break forest_join_64;
    }
    life10_60 = __cast575_16(__call575_15(life9_50));
    __call575_17(life10_60);
    __call575_18(life9_50);
    life8_47 += -1;
    continue forest_cycle_49;
    }
    }
    __call575_19(p0, life4_5);
    return;
}
public static void h575_0(moom.Oo p0) throws Throwable {
    throw __call3057500_0(p0);
}
public static void h575_1(moom.Oo p0) throws Throwable {
    throw __call3057501_0(p0);
}
public static void h575_2(moom.Oo p0) throws Throwable {
    throw __call3057502_0(p0);
}
private static native long __fieldRead575_0() throws Throwable;
private static native java.util.ArrayList __call575_1() throws Throwable;
private static native long __call575_2() throws Throwable;
private static native int __call575_3(java.util.List a0) throws Throwable;
private static native int __call575_4(java.util.List a0) throws Throwable;
private static native java.lang.Object __call575_5(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.client.particle.EntityFX __cast575_6(java.lang.Object a0) throws Throwable;
private static native void __call575_7(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.client.particle.EntityFX a1) throws Throwable;
private static native boolean __fieldRead575_8(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native boolean __call575_9(java.util.ArrayList a0, net.minecraft.client.particle.EntityFX a1) throws Throwable;
private static native long __call575_10() throws Throwable;
private static native long __fieldRead575_11() throws Throwable;
private static native int __numericCompare575_12(long a0, long a1) throws Throwable;
private static native java.util.Iterator __call575_13(java.util.List a0) throws Throwable;
private static native boolean __call575_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call575_15(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.particle.EntityFX __cast575_16(java.lang.Object a0) throws Throwable;
private static native void __call575_17(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native void __call575_18(java.util.Iterator a0) throws Throwable;
private static native boolean __call575_19(java.util.List a0, java.util.ArrayList a1) throws Throwable;
private static native java.lang.Throwable __call3057500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3057501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3057502_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7f1c31e7a3033d5c2d00(net.minecraft.client.particle.EffectRenderer a0, moom.DT a1, net.minecraft.block.state.IBlockState a2) throws E;
private static final class __SourceHandler_7f1c31e7a3033d5c2d00 {

public static void f2410(net.minecraft.client.particle.EffectRenderer receiver, moom.DT p0, net.minecraft.block.state.IBlockState p1) throws Throwable {
    int life3_10;
    net.minecraft.block.state.IBlockState life2_20;
    int life4_22;
    int life5_24;
    int life6_29;
    int life7_34;
    double life8_49;
    double life10_61;
    double life12_73;
    life3_10 = ((__call2410_1(__call2410_0(p1)) != __fieldRead2410_2()) ? 1 : 0);
    if ((life3_10 != 0)) {
        life2_20 = __call2410_5(__call2410_3(p1), p1, __fieldRead2410_4(receiver), p0);
        life4_22 = 4;
        life5_24 = 0;
        loop_region_23: while ((life5_24 < life4_22)) {
        life6_29 = 0;
        loop_region_28: while ((life6_29 < life4_22)) {
        life7_34 = 0;
        loop_region_33: while ((life7_34 < life4_22)) {
        life8_49 = (((double) __call2410_6(p0)) + ((((double) life5_24) + 0x1.0p-1d) / ((double) life4_22)));
        life10_61 = (((double) __call2410_7(p0)) + ((((double) life6_29) + 0x1.0p-1d) / ((double) life4_22)));
        life12_73 = (((double) __call2410_8(p0)) + ((((double) life7_34) + 0x1.0p-1d) / ((double) life4_22)));
        __call2410_14(receiver, __call2410_13(new moom.sa(__fieldRead2410_9(receiver), life8_49, life10_61, life12_73, ((life8_49 - ((double) __call2410_10(p0))) - 0x1.0p-1d), ((life10_61 - ((double) __call2410_11(p0))) - 0x1.0p-1d), ((life12_73 - ((double) __call2410_12(p0))) - 0x1.0p-1d), life2_20), p0));
        life7_34 += 1;
    }
        life6_29 += 1;
    }
        life5_24 += 1;
    }
    }
    return;
}
public static void h2410_0(moom.Oo p0) throws Throwable {
    throw __call1241000_0(p0);
}
private static native net.minecraft.block.Block __call2410_0(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call2410_1(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead2410_2() throws Throwable;
private static native net.minecraft.block.Block __call2410_3(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead2410_4(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call2410_5(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1, net.minecraft.world.World a2, moom.DT a3) throws Throwable;
private static native int __call2410_6(moom.DT a0) throws Throwable;
private static native int __call2410_7(moom.DT a0) throws Throwable;
private static native int __call2410_8(moom.DT a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead2410_9(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native int __call2410_10(moom.DT a0) throws Throwable;
private static native int __call2410_11(moom.DT a0) throws Throwable;
private static native int __call2410_12(moom.DT a0) throws Throwable;
private static native moom.sa __call2410_13(moom.sa a0, moom.DT a1) throws Throwable;
private static native void __call2410_14(net.minecraft.client.particle.EffectRenderer a0, moom.sa a1) throws Throwable;
private static native java.lang.Throwable __call1241000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bf933422ec26a67f0b65(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.client.particle.EntityFX a1) throws E;
private static final class __SourceHandler_bf933422ec26a67f0b65 {

public static void f1387(net.minecraft.client.particle.EffectRenderer receiver, net.minecraft.client.particle.EntityFX p0) throws Throwable {
    int forwardValue1387_22_0;
    long life2_3;
    int life4_19;
    int life5_30;
    forward_join_54: {
    forward_join_45: {
    forward_join_22: {
    forward_join_21: {
    forward_join_11: {
    life2_3 = (__fieldRead1387_0() ^ 48024087883917L);
    if (!((p0 != null))) {
        break forward_join_54;
    }
    if (!((__instanceOf1387_1(p0) != 0))) {
        break forward_join_11;
    }
    if (!(__call1387_2())) {
        break forward_join_54;
    }
    }
    life4_19 = __call1387_3(p0);
    if (!((__numericCompare1387_5(__call1387_4(p0), 0x1.0p0f) != 0))) {
        break forward_join_21;
    }
    forwardValue1387_22_0 = 0;
    break forward_join_22;
    }
    forwardValue1387_22_0 = 1;
    }
    life5_30 = forwardValue1387_22_0;
    if (!((__call1387_7(((__fieldRead1387_6(receiver))[life4_19])[life5_30]) >= __invokedynamic1387_8(9421, (7298940186205642889L ^ life2_3))))) {
        break forward_join_45;
    }
    __call1387_10(((__fieldRead1387_9(receiver))[life4_19])[life5_30], 0);
    }
    __call1387_12(((__fieldRead1387_11(receiver))[life4_19])[life5_30], p0);
    }
    return;
}
public static void h1387_0(moom.Oo p0) throws Throwable {
    throw __call1138700_0(p0);
}
public static void h1387_1(moom.Oo p0) throws Throwable {
    throw __call1138701_0(p0);
}
public static void h1387_2(moom.Oo p0) throws Throwable {
    throw __call1138702_0(p0);
}
public static void h1387_3(moom.Oo p0) throws Throwable {
    throw __call1138703_0(p0);
}
private static native long __fieldRead1387_0() throws Throwable;
private static native int __instanceOf1387_1(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native boolean __call1387_2() throws Throwable;
private static native int __call1387_3(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native float __call1387_4(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native int __numericCompare1387_5(float a0, float a1) throws Throwable;
private static native java.util.List[][] __fieldRead1387_6(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native int __call1387_7(java.util.List a0) throws Throwable;
private static native int __invokedynamic1387_8(int a0, long a1) throws Throwable;
private static native java.util.List[][] __fieldRead1387_9(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native java.lang.Object __call1387_10(java.util.List a0, int a1) throws Throwable;
private static native java.util.List[][] __fieldRead1387_11(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native boolean __call1387_12(java.util.List a0, net.minecraft.client.particle.EntityFX a1) throws Throwable;
private static native java.lang.Throwable __call1138700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1138701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1138702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1138703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6968cdcb062cbf2b57df(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.client.particle.EntityFX a1, int a2, int a3) throws E;
private static final class __SourceHandler_6968cdcb062cbf2b57df {

public static void f2412(net.minecraft.client.particle.EffectRenderer receiver, net.minecraft.client.particle.EntityFX p0, int p1, int p2) throws Throwable {
    int life4_1;
    life4_1 = 0;
    loop_region_2: while ((life4_1 < 4)) {
        if (__call2412_1(((__fieldRead2412_0(receiver))[life4_1])[p1], p0)) {
        __call2412_3(((__fieldRead2412_2(receiver))[life4_1])[p1], p0);
        __call2412_5(((__fieldRead2412_4(receiver))[life4_1])[p2], p0);
    }
        life4_1 += 1;
    }
    return;
}
public static void h2412_0(moom.Oo p0) throws Throwable {
    throw __call1241200_0(p0);
}
public static void h2412_1(moom.Oo p0) throws Throwable {
    throw __call1241201_0(p0);
}
private static native java.util.List[][] __fieldRead2412_0(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native boolean __call2412_1(java.util.List a0, net.minecraft.client.particle.EntityFX a1) throws Throwable;
private static native java.util.List[][] __fieldRead2412_2(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native boolean __call2412_3(java.util.List a0, net.minecraft.client.particle.EntityFX a1) throws Throwable;
private static native java.util.List[][] __fieldRead2412_4(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native boolean __call2412_5(java.util.List a0, net.minecraft.client.particle.EntityFX a1) throws Throwable;
private static native java.lang.Throwable __call1241200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1241201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_72cc04a1689df61c9d76(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.entity.Entity a1, float a2) throws E;
private static final class __SourceHandler_72cc04a1689df61c9d76 {

public static void f900211(net.minecraft.client.particle.EffectRenderer receiver, net.minecraft.entity.Entity p0, float p1) throws Throwable {
    int forestValue900211_82_0;
    int spill900211_0;
    long life3_3;
    float life5_5;
    float life6_7;
    float life7_9;
    float life8_11;
    float life9_13;
    net.minecraft.block.Block life10_74;
    int life11_84;
    int life12_92;
    int life13_99;
    int life14_106;
    net.minecraft.client.renderer.Tessellator life15_142;
    moom.lw life16_145;
    int life17_155;
    net.minecraft.client.particle.EntityFX life18_176;
    forest_join_196: {
    forest_join_82: {
    forest_join_81: {
    life3_3 = (__fieldRead900211_0() ^ 4861507895534L);
    life5_5 = __call900211_1();
    life6_7 = __call900211_2();
    life7_9 = __call900211_3();
    life8_11 = __call900211_4();
    life9_13 = __call900211_5();
    __fieldWrite900211_9((__fieldRead900211_6(p0) + ((__fieldRead900211_7(p0) - __fieldRead900211_8(p0)) * ((double) p1))));
    __fieldWrite900211_13((__fieldRead900211_10(p0) + ((__fieldRead900211_11(p0) - __fieldRead900211_12(p0)) * ((double) p1))));
    __fieldWrite900211_17((__fieldRead900211_14(p0) + ((__fieldRead900211_15(p0) - __fieldRead900211_16(p0)) * ((double) p1))));
    __call900211_18();
    __call900211_21(__invokedynamic900211_19(24124, (6324994427641621020L ^ life3_3)), __invokedynamic900211_20(9138, (6914466499883374487L ^ life3_3)));
    __call900211_23(__invokedynamic900211_22(20513, (2735022090111869957L ^ life3_3)), 0x1.010102p-8f);
    life10_74 = __call900211_25(__fieldRead900211_24(receiver), p0, p1);
    if (!((__call900211_26(life10_74) == __fieldRead900211_27()))) {
        break forest_join_81;
    }
    forestValue900211_82_0 = 1;
    break forest_join_82;
    }
    forestValue900211_82_0 = 0;
    }
    life11_84 = forestValue900211_82_0;
    __call900211_29(__fieldRead900211_28(receiver));
    __call900211_31(__fieldRead900211_30(receiver));
    life12_92 = 0;
    forest_cycle_91: while (true) {
    forest_join_194: {
    if (!((life12_92 < 3))) {
        break forest_join_196;
    }
    life13_99 = 0;
    forest_cycle_96: while (true) {
    forest_join_192: {
    forest_join_190: {
    forest_join_127: {
    forest_join_123: {
    forest_join_118: {
    forest_join_116: {
    forest_join_114: {
    forest_join_111: {
    if (!((life13_99 < 2))) {
        break forest_join_194;
    }
    life14_106 = life12_92;
    if (!((!__call900211_33(((__fieldRead900211_32(receiver))[life12_92])[life13_99])))) {
        break forest_join_192;
    }
    switch (life13_99) {
case 0:
{
        break forest_join_111;
    }
case 1:
{
        break forest_join_114;
    }
default:
{
        break forest_join_116;
    }
}
    }
    __call900211_34(0);
    break forest_join_116;
    }
    __call900211_35(1);
    }
    switch (life12_92) {
case 0:
default:
{
        break forest_join_118;
    }
case 1:
{
        break forest_join_123;
    }
}
    }
    __call900211_38(__fieldRead900211_36(receiver), __fieldRead900211_37());
    break forest_join_127;
    }
    __call900211_41(__fieldRead900211_39(receiver), __fieldRead900211_40());
    }
    __call900211_42(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    life15_142 = __call900211_43();
    life16_145 = __call900211_44(life15_142);
    __call900211_47(life16_145, __invokedynamic900211_45(9326, (2766291132595998792L ^ life3_3)), __fieldRead900211_46());
    life17_155 = 0;
    forest_cycle_147: while (true) {
    forest_join_188: {
    forest_join_175: {
    if (!((life17_155 < __call900211_49(((__fieldRead900211_48(receiver))[life12_92])[life13_99])))) {
        break forest_join_190;
    }
    life18_176 = __cast900211_52(__call900211_51(((__fieldRead900211_50(receiver))[life12_92])[life13_99], life17_155));
    if (!(__call900211_54(__call900211_53(life18_176)))) {
        break forest_join_188;
    }
    if (!((life11_84 == 0))) {
        break forest_join_175;
    }
    if (!((__instanceOf900211_55(life18_176) == 0))) {
        break forest_join_188;
    }
    }
    if (!(__call900211_56(life18_176))) {
        break forest_join_188;
    }
    __call900211_57(life18_176, life16_145, p0, p1, life5_5, life9_13, life6_7, life7_9, life8_11);
    }
    life17_155 += 1;
    continue forest_cycle_147;
    }
    }
    __call900211_58(life15_142);
    }
    life13_99 += 1;
    continue forest_cycle_96;
    }
    }
    life12_92 += 1;
    continue forest_cycle_91;
    }
    }
    __call900211_59(1);
    spill900211_0 = 13746;
    __call900211_60();
    __call900211_62(__invokedynamic900211_61(spill900211_0, (8090329550825193875L ^ life3_3)), 0x1.99999ap-4f);
    return;
}
public static void h900211_0(java.lang.Throwable p0) throws Throwable {
    throw __call93021100_0(p0);
}
public static void h900211_1(java.lang.Throwable p0) throws Throwable {
    throw __call93021101_0(p0);
}
public static void h900211_2(java.lang.Throwable p0) throws Throwable {
    throw __call93021102_0(p0);
}
public static void h900211_3(java.lang.Throwable p0) throws Throwable {
    throw __call93021103_0(p0);
}
public static void h900211_4(java.lang.Throwable p0) throws Throwable {
    throw __call93021104_0(p0);
}
public static void h900211_5(java.lang.Throwable p0) throws Throwable {
    throw __call93021105_0(p0);
}
public static void h900211_6(java.lang.Throwable p0) throws Throwable {
    throw __call93021106_0(p0);
}
public static void h900211_7(java.lang.Throwable p0, int p1, net.minecraft.client.particle.EntityFX p2) throws Throwable {
    java.lang.Throwable life3_2;
    moom.qY life4_6;
    moom.qZ life5_10;
    life3_2 = p0;
    life4_6 = __call93021107_0(life3_2, "Rendering Particle");
    life5_10 = __call93021107_1(life4_6, "Particle being rendered");
    __call93021107_3(life5_10, "Particle", __invokedynamic93021107_2(p2));
    __call93021107_5(life5_10, "Particle Type", __invokedynamic93021107_4(p1));
    throw new moom.Oo(life4_6);
}
private static native long __fieldRead900211_0() throws Throwable;
private static native float __call900211_1() throws Throwable;
private static native float __call900211_2() throws Throwable;
private static native float __call900211_3() throws Throwable;
private static native float __call900211_4() throws Throwable;
private static native float __call900211_5() throws Throwable;
private static native double __fieldRead900211_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead900211_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead900211_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite900211_9(double a0) throws Throwable;
private static native double __fieldRead900211_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead900211_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead900211_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite900211_13(double a0) throws Throwable;
private static native double __fieldRead900211_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead900211_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead900211_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite900211_17(double a0) throws Throwable;
private static native void __call900211_18() throws Throwable;
private static native int __invokedynamic900211_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic900211_20(int a0, long a1) throws Throwable;
private static native void __call900211_21(int a0, int a1) throws Throwable;
private static native int __invokedynamic900211_22(int a0, long a1) throws Throwable;
private static native void __call900211_23(int a0, float a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead900211_24(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native net.minecraft.block.Block __call900211_25(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native moom.fn __call900211_26(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead900211_27() throws Throwable;
private static native java.util.List __fieldRead900211_28(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native void __call900211_29(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead900211_30(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native void __call900211_31(java.util.List a0) throws Throwable;
private static native java.util.List[][] __fieldRead900211_32(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native boolean __call900211_33(java.util.List a0) throws Throwable;
private static native void __call900211_34(int a0) throws Throwable;
private static native void __call900211_35(int a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead900211_36(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native moom.DD __fieldRead900211_37() throws Throwable;
private static native void __call900211_38(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead900211_39(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native moom.DD __fieldRead900211_40() throws Throwable;
private static native void __call900211_41(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call900211_42(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call900211_43() throws Throwable;
private static native moom.lw __call900211_44(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic900211_45(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead900211_46() throws Throwable;
private static native void __call900211_47(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native java.util.List[][] __fieldRead900211_48(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native int __call900211_49(java.util.List a0) throws Throwable;
private static native java.util.List[][] __fieldRead900211_50(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native java.lang.Object __call900211_51(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.client.particle.EntityFX __cast900211_52(java.lang.Object a0) throws Throwable;
private static native moom.CA __call900211_53(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native boolean __call900211_54(moom.CA a0) throws Throwable;
private static native int __instanceOf900211_55(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native boolean __call900211_56(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native void __call900211_57(net.minecraft.client.particle.EntityFX a0, moom.lw a1, net.minecraft.entity.Entity a2, float a3, float a4, float a5, float a6, float a7, float a8) throws Throwable;
private static native void __call900211_58(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call900211_59(int a0) throws Throwable;
private static native void __call900211_60() throws Throwable;
private static native int __invokedynamic900211_61(int a0, long a1) throws Throwable;
private static native void __call900211_62(int a0, float a1) throws Throwable;
private static native java.lang.Throwable __call93021100_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021101_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021102_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021103_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021104_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021105_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021106_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call93021107_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call93021107_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic93021107_2(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native void __call93021107_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic93021107_4(int a0) throws Throwable;
private static native void __call93021107_5(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_256a21e04b3cf2ea3d42(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.world.World a1) throws E;
private static final class __SourceHandler_256a21e04b3cf2ea3d42 {

public static void f2414(net.minecraft.client.particle.EffectRenderer receiver, net.minecraft.world.World p0) throws Throwable {
    int life2_4;
    int life3_9;
    __fieldWrite2414_0(receiver, p0);
    life2_4 = 0;
    loop_region_5: while ((life2_4 < 4)) {
        life3_9 = 0;
        loop_region_10: while ((life3_9 < 2)) {
        __call2414_2(((__fieldRead2414_1(receiver))[life2_4])[life3_9]);
        life3_9 += 1;
    }
        life2_4 += 1;
    }
    __call2414_4(__fieldRead2414_3(receiver));
    return;
}
public static void h2414_0(moom.Oo p0) throws Throwable {
    throw __call1241400_0(p0);
}
private static native void __fieldWrite2414_0(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.world.World a1) throws Throwable;
private static native java.util.List[][] __fieldRead2414_1(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native void __call2414_2(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead2414_3(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native void __call2414_4(java.util.List a0) throws Throwable;
private static native java.lang.Throwable __call1241400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_39fa2746bf40cf60a6fb(net.minecraft.client.particle.EffectRenderer a0) throws E;
private static final class __SourceHandler_39fa2746bf40cf60a6fb {

public static void f900210(net.minecraft.client.particle.EffectRenderer receiver) throws Throwable {
    int life1_1;
    java.util.ArrayList life1_13;
    java.util.Iterator life2_17;
    moom.sq life3_26;
    forest_join_33: {
    forest_join_10: {
    life1_1 = 0;
    forest_cycle_2: while (true) {
    if (!((life1_1 < 4))) {
        break forest_join_10;
    }
    __call900210_0(receiver, life1_1);
    life1_1 += 1;
    continue forest_cycle_2;
    }
    }
    life1_13 = __call900210_1();
    life2_17 = __call900210_3(__fieldRead900210_2(receiver));
    forest_cycle_16: while (true) {
    forest_join_32: {
    if (!(__call900210_4(life2_17))) {
        break forest_join_33;
    }
    life3_26 = __cast900210_6(__call900210_5(life2_17));
    __call900210_7(life3_26);
    if (!(__fieldRead900210_8(life3_26))) {
        break forest_join_32;
    }
    __call900210_9(life1_13, life3_26);
    }
    continue forest_cycle_16;
    }
    }
    __call900210_11(__fieldRead900210_10(receiver), life1_13);
    return;
}
public static void h900210_0(moom.Oo p0) throws Throwable {
    throw __call93021000_0(p0);
}
public static void h900210_1(moom.Oo p0) throws Throwable {
    throw __call93021001_0(p0);
}
private static native void __call900210_0(net.minecraft.client.particle.EffectRenderer a0, int a1) throws Throwable;
private static native java.util.ArrayList __call900210_1() throws Throwable;
private static native java.util.List __fieldRead900210_2(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native java.util.Iterator __call900210_3(java.util.List a0) throws Throwable;
private static native boolean __call900210_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call900210_5(java.util.Iterator a0) throws Throwable;
private static native moom.sq __cast900210_6(java.lang.Object a0) throws Throwable;
private static native void __call900210_7(moom.sq a0) throws Throwable;
private static native boolean __fieldRead900210_8(moom.sq a0) throws Throwable;
private static native boolean __call900210_9(java.util.ArrayList a0, moom.sq a1) throws Throwable;
private static native java.util.List __fieldRead900210_10(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native boolean __call900210_11(java.util.List a0, java.util.ArrayList a1) throws Throwable;
private static native java.lang.Throwable __call93021000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93021001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9f493eb8b0d3b1f17b3a(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.client.particle.EntityFX a1) throws E;
private static final class __SourceHandler_9f493eb8b0d3b1f17b3a {

public static void f502(net.minecraft.client.particle.EffectRenderer receiver, net.minecraft.client.particle.EntityFX p0) throws Throwable {
    __call502_0(p0);
    return;
}
public static void h502_0(java.lang.Throwable p0, net.minecraft.client.particle.EntityFX p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    moom.qY local3 = __call2050200_0(local2, "Ticking Particle");
    moom.qZ local4 = __call2050200_1(local3, "Particle being ticked");
    int local5 = __call2050200_2(p1);
    moom.qZ spill2050200_0 = local4;
    java.lang.String spill2050200_1 = "Particle";
    net.minecraft.client.particle.EntityFX __stackOp2050200_3_0 = p1;
    net.minecraft.client.particle.EntityFX spill2050200_2 = __stackOp2050200_3_0;
    __call2050200_4(__stackOp2050200_3_0);
    __call2050200_6(spill2050200_0, spill2050200_1, __invokedynamic2050200_5(spill2050200_2));
    __call2050200_8(local4, "Particle Type", __invokedynamic2050200_7(local5));
    throw new moom.Oo(local3);
}
private static native void __call502_0(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native moom.qY __call2050200_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2050200_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native int __call2050200_2(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native java.lang.Object __call2050200_4(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2050200_5(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native void __call2050200_6(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2050200_7(int a0) throws Throwable;
private static native void __call2050200_8(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_a1ad7fbfd4a9dce87a24(int a0) throws E;
private static final class __SourceHandler_a1ad7fbfd4a9dce87a24 {

public static java.lang.String f2417(int p0) throws Throwable {
    return ((p0 == 0) ? "MISC_TEXTURE" : ((p0 == 1) ? "TERRAIN_TEXTURE" : ((p0 == 3) ? "ENTITY_PARTICLE_TEXTURE" : __invokedynamic2417_0(p0))));
}
public static void h2417_0(java.lang.Exception p0) throws Throwable {
    throw __call1241700_0(p0);
}
public static void h2417_1(java.lang.Exception p0) throws Throwable {
    throw __call1241701_0(p0);
}
public static void h2417_2(java.lang.Exception p0) throws Throwable {
    throw __call1241702_0(p0);
}
private static native java.lang.String __invokedynamic2417_0(int a0) throws Throwable;
private static native java.lang.Throwable __call1241700_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1241701_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1241702_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_1945c68e57e1431bd5c2(int a0) throws E;
private static final class __SourceHandler_1945c68e57e1431bd5c2 {

public static java.lang.String f2418(int p0) throws Throwable {
    return ((p0 == 0) ? "MISC_TEXTURE" : ((p0 == 1) ? "TERRAIN_TEXTURE" : ((p0 == 3) ? "ENTITY_PARTICLE_TEXTURE" : __invokedynamic2418_0(p0))));
}
public static void h2418_0(java.lang.Exception p0) throws Throwable {
    throw __call1241800_0(p0);
}
public static void h2418_1(java.lang.Exception p0) throws Throwable {
    throw __call1241801_0(p0);
}
public static void h2418_2(java.lang.Exception p0) throws Throwable {
    throw __call1241802_0(p0);
}
private static native java.lang.String __invokedynamic2418_0(int a0) throws Throwable;
private static native java.lang.Throwable __call1241800_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1241801_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1241802_0(java.lang.Exception a0) throws Throwable;

}


public void b() { __sourceHandlerCall_39fa2746bf40cf60a6fb(this); }


public static void b(net.minecraft.entity.Entity[] p0) {
j = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public void b(net.minecraft.entity.Entity p0, float p1) {
float life3_1;
    float life4_7;
    float life5_13;
    float life6_22;
    float life7_30;
    float life8_36;
    int life9_38;
    java.util.List life10_48;
    net.minecraft.client.renderer.Tessellator life11_53;
    moom.lw life12_56;
    java.util.Iterator life13_59;
    net.minecraft.client.particle.EntityFX life14_66;
    life3_1 = 0x1.1df46ap-6f;
    life4_7 = moom.Dr.b(((float)((((net.minecraft.entity.Entity)(p0)).w * 0x1.1df46ap-6f))));
    life5_13 = moom.Dr.a(((float)((((net.minecraft.entity.Entity)(p0)).w * 0x1.1df46ap-6f))));
    life6_22 = ((-life5_13) * moom.Dr.a(((float)((((net.minecraft.entity.Entity)(p0)).x * 0x1.1df46ap-6f)))));
    life7_30 = (life4_7 * moom.Dr.a(((float)((((net.minecraft.entity.Entity)(p0)).x * 0x1.1df46ap-6f)))));
    life8_36 = moom.Dr.b(((float)((((net.minecraft.entity.Entity)(p0)).x * 0x1.1df46ap-6f))));
    life9_38 = 0;
    loop_region_39: while ((life9_38 < 2)) {
        life10_48 = ((this.c)[3])[life9_38];
        if ((!((java.util.List)(life10_48)).isEmpty())) {
        life11_53 = net.minecraft.client.renderer.Tessellator.a();
        life12_56 = ((net.minecraft.client.renderer.Tessellator)(life11_53)).a__lw();
        life13_59 = ((java.util.List)(life10_48)).iterator();
        loop_region_60: while (((java.util.Iterator)(life13_59)).hasNext()) {
        life14_66 = ((net.minecraft.client.particle.EntityFX)(((java.util.Iterator)(life13_59)).next()));
        ((net.minecraft.client.particle.EntityFX)(life14_66)).a(((moom.lw)(life12_56)), ((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(life4_7)), ((float)(life8_36)), ((float)(life5_13)), ((float)(life6_22)), ((float)(life7_30)));
    }
    }
        life9_38 += 1;
    }
    return;
}


private void b(net.minecraft.client.particle.EntityFX p0) { __sourceHandlerCall_9f493eb8b0d3b1f17b3a(this, p0); }


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return net.minecraft.client.particle.EffectRenderer.j;
}


public void c(net.minecraft.client.particle.EntityFX p0) {
((net.minecraft.client.particle.EffectRenderer)(this)).a(((net.minecraft.client.particle.EntityFX)(p0)), ((int)(1)), ((int)(0)));
    return;
}


public void d(net.minecraft.client.particle.EntityFX p0) {
((net.minecraft.client.particle.EffectRenderer)(this)).a(((net.minecraft.client.particle.EntityFX)(p0)), ((int)(0)), ((int)(1)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10509_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/j2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a(net.minecraft.client.particle.EntityFX p0, int p1, int p2) { __sourceHandlerCall_6968cdcb062cbf2b57df(this, p0, p1, p2); }


public java.lang.String a() {
int life1_1;
    int life2_3;
    int life3_8;
    life1_1 = 0;
    life2_3 = 0;
    while ((life2_3 < 4)) {
        life3_8 = 0;
        while ((life3_8 < 2)) {
        life1_1 = (life1_1 + ((java.util.List)(((this.c)[life2_3])[life3_8])).size());
        life3_8 += 1;
    }
        life2_3 += 1;
    }
    return __sourceIntrinsic_63ef3276e4d3_invokedynamic8587_2(life1_1);
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.particle.EffectRenderer.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14268;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/j2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


public net.minecraft.client.particle.EntityFX a(int p0, double p1, double p2, double p3, double p4, double p5, double p6, int[] p7) { return __sourceHandlerCall_4f28af5ff7a3718eb027(this, p0, p1, p2, p3, p4, p5, p6, p7); }


public void a(net.minecraft.client.particle.EntityFX p0) { __sourceHandlerCall_bf933422ec26a67f0b65(this, p0); }


private void a(int p0) { __sourceHandlerCall_1c006c2a5e83c29e68e9(this, p0); }


private void a(java.util.List<net.minecraft.client.particle.EntityFX> p0) { __sourceHandlerCall_b1fdba1265c56ecae6e8(this, p0); }


public void a(net.minecraft.entity.Entity p0, net.minecraft.util.EnumParticleTypes p1) {
((java.util.List)(this.d)).add(((java.lang.Object)(new moom.sq(this.b, p0, p1))));
    return;
}


public void a(int p0, net.minecraft.client.particle.IParticleFactory p1) {
((java.util.Map)(this.g)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))), ((java.lang.Object)(p1)));
    return;
}


private void a__Void() {
((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.EXPLOSION_NORMAL)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kh())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_BUBBLE)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.j9())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_SPLASH)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kD())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_WAKE)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kk())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_DROP)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.ku())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SUSPENDED)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kE())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SUSPENDED_DEPTH)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.j3())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.CRIT)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.ka())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.CRIT_MAGIC)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kb())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kw())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_LARGE)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kc())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SPELL)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kz())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SPELL_INSTANT)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kA())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SPELL_MOB)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kB())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SPELL_MOB_AMBIENT)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.ky())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SPELL_WITCH)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kC())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.DRIP_WATER)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kf())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.DRIP_LAVA)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.ke())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.VILLAGER_ANGRY)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kn())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.VILLAGER_HAPPY)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.j4())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.TOWN_AURA)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.j3())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.NOTE)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.ks())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.PORTAL)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kt())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.ENCHANTMENT_TABLE)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kg())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.FLAME)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kl())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.LAVA)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kr())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.FOOTSTEP)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.km())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.CLOUD)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.j_())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.REDSTONE)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kv())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SNOWBALL)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.j8())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SNOW_SHOVEL)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kx())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SLIME)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.j7())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.HEART)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.ko())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.BARRIER)).a())), ((net.minecraft.client.particle.IParticleFactory)(new net.minecraft.client.particle.Barrier$Factory())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.ITEM_CRACK)).a())), ((net.minecraft.client.particle.IParticleFactory)(new net.minecraft.client.particle.EntityBreakingFX$Factory())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.BLOCK_CRACK)).a())), ((net.minecraft.client.particle.IParticleFactory)(new net.minecraft.client.particle.EntityDiggingFX$Factory())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.BLOCK_DUST)).a())), ((net.minecraft.client.particle.IParticleFactory)(new net.minecraft.client.particle.EntityBlockDustFX$Factory())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.EXPLOSION_HUGE)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kp())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.EXPLOSION_LARGE)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kq())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.FIREWORKS_SPARK)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kj())));
    ((net.minecraft.client.particle.EffectRenderer)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.MOB_APPEARANCE)).a())), ((net.minecraft.client.particle.IParticleFactory)(new moom.kG())));
    return;
}


public void a(moom.DT p0, net.minecraft.block.state.IBlockState p1) { __sourceHandlerCall_7f1c31e7a3033d5c2d00(this, p0, p1); }


public void a(net.minecraft.world.World p0) { __sourceHandlerCall_256a21e04b3cf2ea3d42(this, p0); }


public void a(moom.DT p0, moom.bs p1) {
net.minecraft.block.state.IBlockState life3_4;
    net.minecraft.block.Block life4_7;
    int life5_14;
    int life6_17;
    int life7_20;
    float life8_22;
    double life9_46;
    double life11_70;
    double life13_94;
    life3_4 = ((net.minecraft.world.World)(this.b)).a__fE(((moom.DT)(p0)));
    life4_7 = ((net.minecraft.block.state.IBlockState)(life3_4)).a__ch();
    if ((((net.minecraft.block.Block)(life4_7)).c__Int() != -1)) {
        life5_14 = ((moom.DT)(p0)).a();
        life6_17 = ((moom.DT)(p0)).b();
        life7_20 = ((moom.DT)(p0)).c();
        life8_22 = 0x1.99999ap-4f;
        life9_46 = (((((double) life5_14) + (((java.util.Random)(this.f)).nextDouble() * ((((net.minecraft.block.Block)(life4_7)).b() - ((net.minecraft.block.Block)(life4_7)).a()) - ((double) (life8_22 * 0x1.0p1f))))) + ((double) life8_22)) + ((net.minecraft.block.Block)(life4_7)).a());
        life11_70 = (((((double) life6_17) + (((java.util.Random)(this.f)).nextDouble() * ((((net.minecraft.block.Block)(life4_7)).d() - ((net.minecraft.block.Block)(life4_7)).c()) - ((double) (life8_22 * 0x1.0p1f))))) + ((double) life8_22)) + ((net.minecraft.block.Block)(life4_7)).c());
        life13_94 = (((((double) life7_20) + (((java.util.Random)(this.f)).nextDouble() * ((((net.minecraft.block.Block)(life4_7)).f() - ((net.minecraft.block.Block)(life4_7)).e()) - ((double) (life8_22 * 0x1.0p1f))))) + ((double) life8_22)) + ((net.minecraft.block.Block)(life4_7)).e());
        if ((p1 == moom.bs.DOWN)) {
        life11_70 = ((((double) life6_17) + ((net.minecraft.block.Block)(life4_7)).c()) - ((double) life8_22));
    }
        if ((p1 == moom.bs.UP)) {
        life11_70 = ((((double) life6_17) + ((net.minecraft.block.Block)(life4_7)).d()) + ((double) life8_22));
    }
        if ((p1 == moom.bs.NORTH)) {
        life13_94 = ((((double) life7_20) + ((net.minecraft.block.Block)(life4_7)).e()) - ((double) life8_22));
    }
        if ((p1 == moom.bs.SOUTH)) {
        life13_94 = ((((double) life7_20) + ((net.minecraft.block.Block)(life4_7)).f()) + ((double) life8_22));
    }
        if ((p1 == moom.bs.WEST)) {
        life9_46 = ((((double) life5_14) + ((net.minecraft.block.Block)(life4_7)).a()) - ((double) life8_22));
    }
        if ((p1 == moom.bs.EAST)) {
        life9_46 = ((((double) life5_14) + ((net.minecraft.block.Block)(life4_7)).b()) + ((double) life8_22));
    }
        ((net.minecraft.client.particle.EffectRenderer)(this)).a(((net.minecraft.client.particle.EntityFX)(((net.minecraft.client.particle.EntityFX)(((moom.sa)(((moom.sa)(new moom.sa(this.b, life9_46, life11_70, life13_94, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d, life3_4))).a__sourceReturn_9939664860(((moom.DT)(p0))))).a__sourceReturn_89111cbc68(((float)(0x1.99999ap-3f))))).b__sourceReturn_89111cbc68(((float)(0x1.333334p-1f))))));
    }
    return;
}


public void a(net.minecraft.entity.Entity p0, float p1) { __sourceHandlerCall_72cc04a1689df61c9d76(this, p0, p1); }


private static java.lang.String lambda$tickParticle$0(int p0) throws java.lang.Exception { return __sourceHandlerCall_1945c68e57e1431bd5c2(p0); }


private static java.lang.String lambda$renderParticlesBatched$1(net.minecraft.client.particle.EntityFX p0) throws java.lang.Exception {
return ((net.minecraft.client.particle.EntityFX)(p0)).toString();
}


private static java.lang.String lambda$renderParticlesBatched$2(int p0) throws java.lang.Exception { return __sourceHandlerCall_a1ad7fbfd4a9dce87a24(p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic8587_2(int a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10509_0() throws E;
}
