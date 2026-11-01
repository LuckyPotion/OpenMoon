package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class oo {

public java.util.Map<java.lang.Class, net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer> a;

public static moom.oo b;

public net.minecraft.client.gui.FontRenderer c;

public static double d;

public static double e;

public static double f;

public net.minecraft.client.renderer.texture.TextureManager g;

public net.minecraft.world.World h;

public net.minecraft.entity.Entity i;

public float j;

public float k;

public double l;

public double m;

public double n;

public net.minecraft.tileentity.TileEntity o;

private net.minecraft.client.renderer.Tessellator p;

private boolean q;

private static long r;

private static long[] s;

private static java.lang.Integer[] t;

private static java.util.Map u;

private oo() { super(); }

private static void __sourceConstructorBody_48925164ec0cf2ec(moom.oo receiver) throws Throwable {
long local1_life1 = (moom.oo.r ^ 58878273630696L);
    moom.oo.__sourceConstructorInit_48925164ec0cf2ec_0(((moom.oo)(receiver)));
    ((moom.oo)(receiver)).a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    ((moom.oo)(receiver)).p = ((net.minecraft.client.renderer.Tessellator)(new net.minecraft.client.renderer.Tessellator(__sourceIntrinsic_48925164ec0cf2ec_originalDynamicSite2472_5(14979, (6333588027534821670L ^ local1_life1)))));
    ((moom.oo)(receiver)).q = ((boolean)(false));
    ((java.util.Map)(((moom.oo)(receiver)).a)).put(((java.lang.Object)(moom.Ct.class)), ((java.lang.Object)(new moom.oz())));
    ((java.util.Map)(((moom.oo)(receiver)).a)).put(((java.lang.Object)(moom.Cq.class)), ((java.lang.Object)(new net.minecraft.client.renderer.tileentity.TileEntityMobSpawnerRenderer())));
    ((java.util.Map)(((moom.oo)(receiver)).a)).put(((java.lang.Object)(net.minecraft.tileentity.TileEntityPiston.class)), ((java.lang.Object)(new moom.oy())));
    ((java.util.Map)(((moom.oo)(receiver)).a)).put(((java.lang.Object)(net.minecraft.tileentity.TileEntityChest.class)), ((java.lang.Object)(new net.minecraft.client.renderer.tileentity.TileEntityChestRenderer())));
    ((java.util.Map)(((moom.oo)(receiver)).a)).put(((java.lang.Object)(moom.Cg.class)), ((java.lang.Object)(new moom.ow())));
    ((java.util.Map)(((moom.oo)(receiver)).a)).put(((java.lang.Object)(moom.Ce.class)), ((java.lang.Object)(new moom.ou())));
    ((java.util.Map)(((moom.oo)(receiver)).a)).put(((java.lang.Object)(net.minecraft.tileentity.TileEntityEndPortal.class)), ((java.lang.Object)(new moom.ov())));
    ((java.util.Map)(((moom.oo)(receiver)).a)).put(((java.lang.Object)(net.minecraft.tileentity.TileEntityBeacon.class)), ((java.lang.Object)(new moom.os())));
    ((java.util.Map)(((moom.oo)(receiver)).a)).put(((java.lang.Object)(net.minecraft.tileentity.TileEntitySkull.class)), ((java.lang.Object)(new moom.oA())));
    ((java.util.Map)(((moom.oo)(receiver)).a)).put(((java.lang.Object)(moom.Ca.class)), ((java.lang.Object)(new moom.or())));
    java.util.Iterator local3_life41 = ((java.util.Collection)(((java.util.Map)(((moom.oo)(receiver)).a)).values())).iterator();
    while (((java.util.Iterator)(local3_life41)).hasNext()) {
        net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer local4_life45 = ((net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer)(((java.util.Iterator)(local3_life41)).next()));
        ((net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer)(local4_life45)).a(((moom.oo)(receiver)));
    }
    return;
}


static {
r = ((long)(((moom._a)(moom._c.a(((long)(3982676418813831501L)), ((long)(-6433361555769921048L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(66584031021011L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.oo.r ^ 99191395534578L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1444_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1444_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1444_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1444_14 = new byte[8];
    (__sourceSpill1444_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1444_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1444_16 = __sourceSpill1444_14;
    ((javax.crypto.Cipher)(__sourceSpill1444_11)).init(((int)(__sourceSpill1444_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1444_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1444_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Â'\026gpý¼º7+¹Á®ýäL(\002í¥ÃíkFh³*ÈÕ§³¢FÉìã.UÿÕæî\021U"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1444_25 = local6_life21;
        int __sourceSpill1444_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1444_25)).substring(((int)(__sourceSpill1444_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1444_30 = local8_life19;
        int __sourceSpill1444_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1444_33 = new byte[8];
        (__sourceSpill1444_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1444_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1444_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1444_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1444_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1444_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1444_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1444_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1444_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1444_34)).doFinal(((byte[])(__sourceSpill1444_33)));
        (__sourceSpill1444_30)[__sourceSpill1444_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "÷°aXûKL¯¤\027o+\006:ªq"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1444_38 = local6_life21;
        int __sourceSpill1444_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1444_38)).substring(((int)(__sourceSpill1444_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1444_43 = local8_life19;
        int __sourceSpill1444_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1444_46 = new byte[8];
        (__sourceSpill1444_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1444_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1444_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1444_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1444_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1444_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1444_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1444_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1444_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1444_47)).doFinal(((byte[])(__sourceSpill1444_46)));
        (__sourceSpill1444_43)[__sourceSpill1444_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    s = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[8]));
    b = ((moom.oo)(new moom.oo()));
}

private static native <E extends Throwable> void __sourceConstructorInit_48925164ec0cf2ec_0(moom.oo a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_dbb60dfc5e33c5f53842(moom.oo a0, int a1) throws E;
private static final class __SourceHandler_dbb60dfc5e33c5f53842 {

public static void f1896(moom.oo receiver, int p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead1896_0() ^ 35744774681380L);
    __call1896_3(__fieldRead1896_1(receiver), __fieldRead1896_2());
    __call1896_4();
    __call1896_7(__invokedynamic1896_5(1254, (4462629614787933580L ^ life2_3)), __invokedynamic1896_6(28737, (4336498748393079082L ^ life2_3)));
    __call1896_8();
    __call1896_9();
    if (__call1896_10()) {
        __call1896_12(__invokedynamic1896_11(11670, (725167363839663358L ^ life2_3)));
    } else {
        __call1896_14(__invokedynamic1896_13(21511, (4670592369901495657L ^ life2_3)));
    }
    if ((p0 > 0)) {
        __call1896_20(__call1896_16(__fieldRead1896_15(receiver)), ((float) __fieldRead1896_17()), ((float) __fieldRead1896_18()), ((float) __fieldRead1896_19()));
    }
    __call1896_22(__fieldRead1896_21(receiver));
    __call1896_23();
    __fieldWrite1896_24(receiver, 0);
    return;
}
public static void h1896_0(moom.Oo p0) throws Throwable {
    throw __call1189600_0(p0);
}
public static void h1896_1(moom.Oo p0) throws Throwable {
    throw __call1189601_0(p0);
}
private static native long __fieldRead1896_0() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead1896_1(moom.oo a0) throws Throwable;
private static native moom.DD __fieldRead1896_2() throws Throwable;
private static native void __call1896_3(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call1896_4() throws Throwable;
private static native int __invokedynamic1896_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1896_6(int a0, long a1) throws Throwable;
private static native void __call1896_7(int a0, int a1) throws Throwable;
private static native void __call1896_8() throws Throwable;
private static native void __call1896_9() throws Throwable;
private static native boolean __call1896_10() throws Throwable;
private static native int __invokedynamic1896_11(int a0, long a1) throws Throwable;
private static native void __call1896_12(int a0) throws Throwable;
private static native int __invokedynamic1896_13(int a0, long a1) throws Throwable;
private static native void __call1896_14(int a0) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __fieldRead1896_15(moom.oo a0) throws Throwable;
private static native moom.lw __call1896_16(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native double __fieldRead1896_17() throws Throwable;
private static native double __fieldRead1896_18() throws Throwable;
private static native double __fieldRead1896_19() throws Throwable;
private static native void __call1896_20(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __fieldRead1896_21(moom.oo a0) throws Throwable;
private static native void __call1896_22(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call1896_23() throws Throwable;
private static native void __fieldWrite1896_24(moom.oo a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1189600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1189601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer __sourceHandlerCall_43f53d03fc5fae67d915(moom.oo a0, java.lang.Class a1) throws E;
private static final class __SourceHandler_43f53d03fc5fae67d915 {

public static net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer f1897(moom.oo receiver, java.lang.Class p0) throws Throwable {
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer life2_5;
    life2_5 = __cast1897_2(__call1897_1(__fieldRead1897_0(receiver), p0));
    if ((life2_5 == null)) {
        if ((p0 != __classLiteral1897_3())) {
        life2_5 = __call1897_5(receiver, __call1897_4(p0));
        __call1897_7(__fieldRead1897_6(receiver), p0, life2_5);
    }
    }
    return life2_5;
}
public static void h1897_0(moom.Oo p0) throws Throwable {
    throw __call1189700_0(p0);
}
private static native java.util.Map __fieldRead1897_0(moom.oo a0) throws Throwable;
private static native java.lang.Object __call1897_1(java.util.Map a0, java.lang.Class a1) throws Throwable;
private static native net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer __cast1897_2(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __classLiteral1897_3() throws Throwable;
private static native java.lang.Class __call1897_4(java.lang.Class a0) throws Throwable;
private static native net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer __call1897_5(moom.oo a0, java.lang.Class a1) throws Throwable;
private static native java.util.Map __fieldRead1897_6(moom.oo a0) throws Throwable;
private static native java.lang.Object __call1897_7(java.util.Map a0, java.lang.Class a1, net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer a2) throws Throwable;
private static native java.lang.Throwable __call1189700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer __sourceHandlerCall_b3ce556a4cd69509239d(moom.oo a0, net.minecraft.tileentity.TileEntity a1) throws E;
private static final class __SourceHandler_b3ce556a4cd69509239d {

public static net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer f1090(moom.oo receiver, net.minecraft.tileentity.TileEntity p0) throws Throwable {
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer forwardValue1090_11_0;
    forward_join_11: {
    forward_join_10: {
    if (!((p0 != null))) {
        break forward_join_10;
    }
    if (!((!__call1090_0(p0)))) {
        break forward_join_10;
    }
    forwardValue1090_11_0 = __call1090_2(receiver, __call1090_1(p0));
    break forward_join_11;
    }
    forwardValue1090_11_0 = null;
    }
    return forwardValue1090_11_0;
}
public static void h1090_0(moom.Oo p0) throws Throwable {
    throw __call1109000_0(p0);
}
public static void h1090_1(moom.Oo p0) throws Throwable {
    throw __call1109001_0(p0);
}
private static native boolean __call1090_0(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.lang.Class __call1090_1(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer __call1090_2(moom.oo a0, java.lang.Class a1) throws Throwable;
private static native java.lang.Throwable __call1109000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1109001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ef24e8718731e9dc45d7(moom.oo a0, net.minecraft.tileentity.TileEntity a1, double a2, double a3, double a4, float a5, int a6) throws E;
private static final class __SourceHandler_ef24e8718731e9dc45d7 {

public static void f414(moom.oo receiver, net.minecraft.tileentity.TileEntity p0, double p1, double p2, double p3, float p4, int p5) throws Throwable {
    com.moon.ef life10_4;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer life11_18;
    life10_4 = new com.moon.ef(p0);
    __call414_2(__call414_1(__call414_0()), life10_4);
    if (__call414_3(life10_4)) {
        return;
    }
    life11_18 = __call414_4(receiver, p0);
    if ((life11_18 != null)) {
        __fieldWrite414_5(receiver, p0);
        if (__fieldRead414_6(receiver)) {
        __call414_9(life11_18, p0, p1, p2, p3, p4, p5, __call414_8(__fieldRead414_7(receiver)));
    } else {
        __call414_10(life11_18, p0, p1, p2, p3, p4, p5);
    }
        __fieldWrite414_11(receiver, null);
    }
    return;
}
public static void h414_0(java.lang.Throwable p0) throws Throwable {
    throw __call2041400_0(p0);
}
public static void h414_1(java.lang.Throwable p0) throws Throwable {
    throw __call2041401_0(p0);
}
public static void h414_2(java.lang.Throwable p0, net.minecraft.tileentity.TileEntity p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    moom.qY local3 = __call2041402_0(local2, "Rendering Block Entity");
    moom.qZ local4 = __call2041402_1(local3, "Block Entity Details");
    __call2041402_2(p1, local4);
    throw new moom.Oo(local3);
}
private static native com.moon.runtime.ClientContext __call414_0() throws Throwable;
private static native com.moon.events.EventBus __call414_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call414_2(com.moon.events.EventBus a0, com.moon.ef a1) throws Throwable;
private static native boolean __call414_3(com.moon.ef a0) throws Throwable;
private static native net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer __call414_4(moom.oo a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native void __fieldWrite414_5(moom.oo a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native boolean __fieldRead414_6(moom.oo a0) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __fieldRead414_7(moom.oo a0) throws Throwable;
private static native moom.lw __call414_8(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call414_9(net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer a0, net.minecraft.tileentity.TileEntity a1, double a2, double a3, double a4, float a5, int a6, moom.lw a7) throws Throwable;
private static native void __call414_10(net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer a0, net.minecraft.tileentity.TileEntity a1, double a2, double a3, double a4, float a5, int a6) throws Throwable;
private static native void __fieldWrite414_11(moom.oo a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Throwable __call2041400_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2041401_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2041402_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2041402_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call2041402_2(net.minecraft.tileentity.TileEntity a0, moom.qZ a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_79e915f86d49fe00a09d(moom.oo a0, net.minecraft.tileentity.TileEntity a1, float a2, int a3) throws E;
private static final class __SourceHandler_79e915f86d49fe00a09d {

public static void f1900(moom.oo receiver, net.minecraft.tileentity.TileEntity p0, float p1, int p2) throws Throwable {
    long life4_3;
    int life6_17;
    int life7_27;
    int life8_35;
    int life9_43;
    moom.DT life7_57;
    life4_3 = (__fieldRead1900_0() ^ 25701736259280L);
    if ((__call1900_4(p0, __fieldRead1900_1(receiver), __fieldRead1900_2(receiver), __fieldRead1900_3(receiver)) < __call1900_5(p0))) {
        life6_17 = 1;
        if ((life6_17 != 0)) {
        __call1900_6();
        life7_27 = __call1900_9(__fieldRead1900_7(receiver), __call1900_8(p0), 0);
        life8_35 = (life7_27 % __invokedynamic1900_10(13241, (4769125378157506337L ^ life4_3)));
        life9_43 = (life7_27 / __invokedynamic1900_11(11231, (560619942284130118L ^ life4_3)));
        __call1900_13(__fieldRead1900_12(), ((float) life8_35), ((float) life9_43));
        __call1900_14(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    }
        life7_57 = __call1900_15(p0);
        if ((!__call1900_17(__fieldRead1900_16(receiver), life7_57, 0))) {
        return;
    }
        if (__call1900_18()) {
        __call1900_19();
    }
        __call1900_26(receiver, p0, (((double) __call1900_20(life7_57)) - __fieldRead1900_21()), (((double) __call1900_22(life7_57)) - __fieldRead1900_23()), (((double) __call1900_24(life7_57)) - __fieldRead1900_25()), p1, p2);
        if (__call1900_27()) {
        if (__call1900_28()) {
        __call1900_29();
        __call1900_36(receiver, p0, (((double) __call1900_30(life7_57)) - __fieldRead1900_31()), (((double) __call1900_32(life7_57)) - __fieldRead1900_33()), (((double) __call1900_34(life7_57)) - __fieldRead1900_35()), p1, p2);
        __call1900_37();
    }
        __call1900_38();
    }
    }
    return;
}
public static void h1900_0(moom.Oo p0) throws Throwable {
    throw __call1190000_0(p0);
}
public static void h1900_1(moom.Oo p0) throws Throwable {
    throw __call1190001_0(p0);
}
public static void h1900_2(moom.Oo p0) throws Throwable {
    throw __call1190002_0(p0);
}
public static void h1900_3(moom.Oo p0) throws Throwable {
    throw __call1190003_0(p0);
}
private static native long __fieldRead1900_0() throws Throwable;
private static native double __fieldRead1900_1(moom.oo a0) throws Throwable;
private static native double __fieldRead1900_2(moom.oo a0) throws Throwable;
private static native double __fieldRead1900_3(moom.oo a0) throws Throwable;
private static native double __call1900_4(net.minecraft.tileentity.TileEntity a0, double a1, double a2, double a3) throws Throwable;
private static native double __call1900_5(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call1900_6() throws Throwable;
private static native net.minecraft.world.World __fieldRead1900_7(moom.oo a0) throws Throwable;
private static native moom.DT __call1900_8(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __call1900_9(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native int __invokedynamic1900_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic1900_11(int a0, long a1) throws Throwable;
private static native int __fieldRead1900_12() throws Throwable;
private static native void __call1900_13(int a0, float a1, float a2) throws Throwable;
private static native void __call1900_14(float a0, float a1, float a2, float a3) throws Throwable;
private static native moom.DT __call1900_15(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1900_16(moom.oo a0) throws Throwable;
private static native boolean __call1900_17(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native boolean __call1900_18() throws Throwable;
private static native void __call1900_19() throws Throwable;
private static native int __call1900_20(moom.DT a0) throws Throwable;
private static native double __fieldRead1900_21() throws Throwable;
private static native int __call1900_22(moom.DT a0) throws Throwable;
private static native double __fieldRead1900_23() throws Throwable;
private static native int __call1900_24(moom.DT a0) throws Throwable;
private static native double __fieldRead1900_25() throws Throwable;
private static native void __call1900_26(moom.oo a0, net.minecraft.tileentity.TileEntity a1, double a2, double a3, double a4, float a5, int a6) throws Throwable;
private static native boolean __call1900_27() throws Throwable;
private static native boolean __call1900_28() throws Throwable;
private static native void __call1900_29() throws Throwable;
private static native int __call1900_30(moom.DT a0) throws Throwable;
private static native double __fieldRead1900_31() throws Throwable;
private static native int __call1900_32(moom.DT a0) throws Throwable;
private static native double __fieldRead1900_33() throws Throwable;
private static native int __call1900_34(moom.DT a0) throws Throwable;
private static native double __fieldRead1900_35() throws Throwable;
private static native void __call1900_36(moom.oo a0, net.minecraft.tileentity.TileEntity a1, double a2, double a3, double a4, float a5, int a6) throws Throwable;
private static native void __call1900_37() throws Throwable;
private static native void __call1900_38() throws Throwable;
private static native java.lang.Throwable __call1190000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1190001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1190002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1190003_0(moom.Oo a0) throws Throwable;

}


public net.minecraft.client.gui.FontRenderer a() {
return this.c;
}


public void a(int p0) { __sourceHandlerCall_dbb60dfc5e33c5f53842(this, p0); }


public void a__Void() {
long local1 = (moom.oo.r ^ 73723570871823L);
    ((moom.lw)(((net.minecraft.client.renderer.Tessellator)(this.p)).a__lw())).a(((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1582_3(28233, (294258471288467981L ^ local1)))), ((moom.oD)(moom.oB.a)));
    this.q = ((boolean)(true));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8605_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/oo"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.oo.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26865;
      if (t[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/oo", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public void a(net.minecraft.tileentity.TileEntity p0, float p1, int p2) { __sourceHandlerCall_79e915f86d49fe00a09d(this, p0, p1, p2); }


public void a(net.minecraft.world.World p0, net.minecraft.client.renderer.texture.TextureManager p1, net.minecraft.client.gui.FontRenderer p2, net.minecraft.entity.Entity p3, float p4) {
try {
        if ((this.h != p0)) {
        ((moom.oo)(this)).a(((net.minecraft.world.World)(p0)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.oo.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    this.g = ((net.minecraft.client.renderer.texture.TextureManager)(p1));
    this.i = ((net.minecraft.entity.Entity)(p3));
    this.c = ((net.minecraft.client.gui.FontRenderer)(p2));
    this.j = ((float)((((net.minecraft.entity.Entity)(p3)).y + ((((net.minecraft.entity.Entity)(p3)).w - ((net.minecraft.entity.Entity)(p3)).y) * p4))));
    this.k = ((float)((((net.minecraft.entity.Entity)(p3)).z + ((((net.minecraft.entity.Entity)(p3)).x - ((net.minecraft.entity.Entity)(p3)).z) * p4))));
    this.l = ((double)((((net.minecraft.entity.Entity)(p3)).M + ((((net.minecraft.entity.Entity)(p3)).n - ((net.minecraft.entity.Entity)(p3)).M) * ((double) p4)))));
    this.m = ((double)((((net.minecraft.entity.Entity)(p3)).N + ((((net.minecraft.entity.Entity)(p3)).o - ((net.minecraft.entity.Entity)(p3)).N) * ((double) p4)))));
    this.n = ((double)((((net.minecraft.entity.Entity)(p3)).O + ((((net.minecraft.entity.Entity)(p3)).p - ((net.minecraft.entity.Entity)(p3)).O) * ((double) p4)))));
    return;
}


public <T extends net.minecraft.tileentity.TileEntity> net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<T> a(net.minecraft.tileentity.TileEntity p0) { return __sourceHandlerCall_b3ce556a4cd69509239d(this, p0); }


public <T extends net.minecraft.tileentity.TileEntity> net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<T> a(java.lang.Class<? extends net.minecraft.tileentity.TileEntity> p0) { return __sourceHandlerCall_43f53d03fc5fae67d915(this, p0); }


public void a(net.minecraft.tileentity.TileEntity p0, double p1, double p2, double p3, float p4) {
((moom.oo)(this)).a(((net.minecraft.tileentity.TileEntity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((int)(-1)));
    return;
}


public void a(net.minecraft.tileentity.TileEntity p0, double p1, double p2, double p3, float p4, int p5) { __sourceHandlerCall_ef24e8718731e9dc45d7(this, p0, p1, p2, p3, p4, p5); }


public void a(net.minecraft.world.World p0) {
this.h = ((net.minecraft.world.World)(p0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_48925164ec0cf2ec_originalDynamicSite2472_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8605_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1582_3(int a0, long a1) throws E;
}
