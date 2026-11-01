package net.minecraft.world;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class World implements net.minecraft.world.IBlockAccess {

private int a;

protected boolean b;

public java.util.List<net.minecraft.entity.Entity> c;

protected java.util.List<net.minecraft.entity.Entity> d;

public java.util.List<net.minecraft.tileentity.TileEntity> e;

public java.util.List<net.minecraft.tileentity.TileEntity> f;

private java.util.List<net.minecraft.tileentity.TileEntity> g;

private java.util.List<net.minecraft.tileentity.TileEntity> h;

public java.util.List<net.minecraft.entity.player.EntityPlayer> i;

public java.util.List<net.minecraft.entity.Entity> j;

protected moom.Dd<net.minecraft.entity.Entity> k;

private long l;

private int m;

protected int n;

protected int o;

protected float p;

protected float q;

protected float r;

protected float s;

private int t;

public java.util.Random u;

public moom.EA v;

protected java.util.List<net.minecraft.world.IWorldAccess> w;

protected moom.Fn x;

protected net.minecraft.world.storage.ISaveHandler y;

protected net.minecraft.world.storage.WorldInfo z;

protected boolean A;

protected moom.IO B;

protected moom.EG C;

public moom.A9 D;

private java.util.Calendar E;

protected net.minecraft.scoreboard.Scoreboard F;

public boolean G;

protected java.util.Set<moom.Ee> H;

private int I;

protected boolean J;

protected boolean K;

private boolean L;

private net.minecraft.world.border.WorldBorder M;

int[] N;

private com.moon.nW O;

private java.lang.String P;

private java.lang.String Q;

private static java.lang.String R;

private static long bb;

private static long[] eb;

private static java.lang.Integer[] fb;

private static java.util.Map gb;

private static long[] kb;

private static java.lang.Long[] lb;

private static java.util.Map mb;

protected World(net.minecraft.world.storage.ISaveHandler p0, net.minecraft.world.storage.WorldInfo p1, moom.EA p2, moom.A9 p3, boolean p4) { super(); }

private static void __sourceConstructorBody_b263e73c8dee9d46(net.minecraft.world.World receiver, net.minecraft.world.storage.ISaveHandler p0, net.minecraft.world.storage.WorldInfo p1, moom.EA p2, moom.A9 p3, boolean p4) throws Throwable {
long local6_life2 = (net.minecraft.world.World.bb ^ 101674804784988L);
    net.minecraft.world.World.__sourceConstructorInit_b263e73c8dee9d46_0(((net.minecraft.world.World)(receiver)));
    ((net.minecraft.world.World)(receiver)).a = ((int)(__sourceIntrinsic_b263e73c8dee9d46_originalDynamicSite869_5(12836, (8951781680043353437L ^ local6_life2))));
    java.lang.String __sourceSpill869_10 = net.minecraft.world.World.c__String();
    ((net.minecraft.world.World)(receiver)).c = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((net.minecraft.world.World)(receiver)).d = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((net.minecraft.world.World)(receiver)).e = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((net.minecraft.world.World)(receiver)).f = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((net.minecraft.world.World)(receiver)).g = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((net.minecraft.world.World)(receiver)).h = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((net.minecraft.world.World)(receiver)).i = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((net.minecraft.world.World)(receiver)).j = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((net.minecraft.world.World)(receiver)).k = ((moom.Dd)(new moom.Dd()));
    ((net.minecraft.world.World)(receiver)).l = ((long)(__sourceIntrinsic_b263e73c8dee9d46_originalDynamicSite869_27(20715, (1988459944818755577L ^ local6_life2))));
    ((net.minecraft.world.World)(receiver)).n = ((int)(((java.util.Random)(new java.util.Random())).nextInt()));
    ((net.minecraft.world.World)(receiver)).o = ((int)(__sourceIntrinsic_b263e73c8dee9d46_originalDynamicSite869_32(11516, (4865350021636488079L ^ local6_life2))));
    ((net.minecraft.world.World)(receiver)).u = ((java.util.Random)(new java.util.Random()));
    ((net.minecraft.world.World)(receiver)).w = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((net.minecraft.world.World)(receiver)).E = ((java.util.Calendar)(java.util.Calendar.getInstance()));
    ((net.minecraft.world.World)(receiver)).F = ((net.minecraft.scoreboard.Scoreboard)(new net.minecraft.scoreboard.Scoreboard()));
    ((net.minecraft.world.World)(receiver)).H = ((java.util.Set)(com.google.common.collect.Sets.newHashSet()));
    ((net.minecraft.world.World)(receiver)).O = ((com.moon.nW)(new com.moon.nW()));
    java.lang.String local8_life43 = __sourceSpill869_10;
    try {
        ((net.minecraft.world.World)(receiver)).I = ((int)(((java.util.Random)(((net.minecraft.world.World)(receiver)).u)).nextInt(((int)(__sourceIntrinsic_b263e73c8dee9d46_originalDynamicSite869_46(8601, (1414637026878289607L ^ local6_life2)))))));
        ((net.minecraft.world.World)(receiver)).J = ((boolean)(true));
        ((net.minecraft.world.World)(receiver)).K = ((boolean)(true));
        ((net.minecraft.world.World)(receiver)).N = ((int[])(new int[__sourceIntrinsic_b263e73c8dee9d46_originalDynamicSite869_52(1064, (3650774064287273821L ^ local6_life2))]));
        ((net.minecraft.world.World)(receiver)).y = ((net.minecraft.world.storage.ISaveHandler)(p0));
        ((net.minecraft.world.World)(receiver)).D = ((moom.A9)(p3));
        ((net.minecraft.world.World)(receiver)).z = ((net.minecraft.world.storage.WorldInfo)(p1));
        ((net.minecraft.world.World)(receiver)).v = ((moom.EA)(p2));
        ((net.minecraft.world.World)(receiver)).G = ((boolean)(p4));
        ((net.minecraft.world.World)(receiver)).M = ((net.minecraft.world.border.WorldBorder)(((moom.EA)(p2)).a__Fi()));
        if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        net.minecraft.world.World.b(((java.lang.String)("zvbtPc")));
    }
    } catch (moom.Oo __catchStack869) {
        throw net.minecraft.world.World.a(((java.lang.Throwable)(__catchStack869)));
    }
    return;
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(302581086495666765L)), ((long)(4066282528510539604L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(4852562006413L)))));
    java.lang.Object __sourceSpill1364_6 = null;
    gb = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life8 = (net.minecraft.world.World.bb ^ 115429957772006L);
    net.minecraft.world.World.b(((java.lang.String)(__sourceSpill1364_6)));
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill1364_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1364_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1364_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1364_16 = new byte[8];
    (__sourceSpill1364_16)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill1364_16)[local14_life17] = ((byte) ((int) ((local11_life8 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation1364_18 = __sourceSpill1364_16;
    ((javax.crypto.Cipher)(__sourceSpill1364_13)).init(((int)(__sourceSpill1364_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1364_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1364_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life21 = new long[55];
    int local16_life22 = 0;
    java.lang.String local17_life23;
    int local18_life25 = ((java.lang.String)((local17_life23 = "V¾Ôb)û±\002ÆgÇ%<>r´¢YñRowø.\027\177@¾V¼¯Á\\Àæ«Ã+e*eúðd\017M]ó\036\024THðÑûD[âZï8±n\026Ì@®âcÇÁÙjmÔBa8MµX\022&{e¥ \0261:\023\037)\005m+0ÊsÊn(µ\031¨âXì\031%mË¶@'Z\006\0064sð_¼\037ÒáoJÕê\\\"dFg7Ôà\n÷]ò\030õ\024*í6u¼ô½_\002yNº\027ç\036³#îE¨Là¾*ì]ÀO,?¨_K±h:9ÓÜÂÛ?ó··nõ4ÔI/YHiÀ\031ÏÐlþqÆ\023>ö[Þhzñ¡_¤cärªæm,Ä_YµÚî?<`o\023`\024®´_È¼:.ÁÙ$­ö\r\007]\0231\016ü{QQ\034·£ª6ÂNÖc#ñûxù\016\030ðè\n3ÎisÅôØFë9ºhü9¶éY½Ðk\023\036_ìB°N¤va\030ìqÞA#\027èÇ \031³O\035M\031µ,´\004¥kÞ¸3KôKMè¢TQ\013gH#'&ù¾>kÝ\tªÇªn½Vbfo#\035ü¤~_ÛÃ°N¼)K9\"o"))).length();
    int local15_life26 = 0;
    do {
        java.lang.String __sourceSpill1364_27 = local17_life23;
        int __sourceSpill1364_28 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1364_27)).substring(((int)(__sourceSpill1364_28)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1364_32 = local19_life21;
        int __sourceSpill1364_33 = local16_life22;
        local16_life22 += 1;
        long local21_life34 = (((((((((((long) (local20_life31)[0]) & 255L) << 56) | ((((long) (local20_life31)[1]) & 255L) << 48)) | ((((long) (local20_life31)[2]) & 255L) << 40)) | ((((long) (local20_life31)[3]) & 255L) << 32)) | ((((long) (local20_life31)[4]) & 255L) << 24)) | ((((long) (local20_life31)[5]) & 255L) << 16)) | ((((long) (local20_life31)[6]) & 255L) << 8)) | (((long) (local20_life31)[7]) & 255L));
        byte[] __sourceSpill1364_35 = new byte[8];
        (__sourceSpill1364_35)[0] = ((byte) ((int) (local21_life34 >>> 56)));
        (__sourceSpill1364_35)[1] = ((byte) ((int) (local21_life34 >>> 48)));
        (__sourceSpill1364_35)[2] = ((byte) ((int) (local21_life34 >>> 40)));
        (__sourceSpill1364_35)[3] = ((byte) ((int) (local21_life34 >>> 32)));
        (__sourceSpill1364_35)[4] = ((byte) ((int) (local21_life34 >>> 24)));
        (__sourceSpill1364_35)[5] = ((byte) ((int) (local21_life34 >>> 16)));
        (__sourceSpill1364_35)[6] = ((byte) ((int) (local21_life34 >>> 8)));
        (__sourceSpill1364_35)[7] = ((byte) ((int) local21_life34));
        javax.crypto.Cipher __sourceSpill1364_36 = local13_life11;
        byte[] local23_life38 = ((javax.crypto.Cipher)(__sourceSpill1364_36)).doFinal(((byte[])(__sourceSpill1364_35)));
        (__sourceSpill1364_32)[__sourceSpill1364_33] = (((((((((((long) (local23_life38)[0]) & 255L) << 56) | ((((long) (local23_life38)[1]) & 255L) << 48)) | ((((long) (local23_life38)[2]) & 255L) << 40)) | ((((long) (local23_life38)[3]) & 255L) << 32)) | ((((long) (local23_life38)[4]) & 255L) << 24)) | ((((long) (local23_life38)[5]) & 255L) << 16)) | ((((long) (local23_life38)[6]) & 255L) << 8)) | (((long) (local23_life38)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    local18_life25 = ((java.lang.String)((local17_life23 = "õDÕA:¬_W\023©2­b\f"))).length();
    local15_life26 = 0;
    do {
        java.lang.String __sourceSpill1364_40 = local17_life23;
        int __sourceSpill1364_41 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1364_40)).substring(((int)(__sourceSpill1364_41)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1364_45 = local19_life21;
        int __sourceSpill1364_46 = local16_life22;
        local16_life22 += 1;
        long local21_life47 = (((((((((((long) (local20_life44)[0]) & 255L) << 56) | ((((long) (local20_life44)[1]) & 255L) << 48)) | ((((long) (local20_life44)[2]) & 255L) << 40)) | ((((long) (local20_life44)[3]) & 255L) << 32)) | ((((long) (local20_life44)[4]) & 255L) << 24)) | ((((long) (local20_life44)[5]) & 255L) << 16)) | ((((long) (local20_life44)[6]) & 255L) << 8)) | (((long) (local20_life44)[7]) & 255L));
        byte[] __sourceSpill1364_48 = new byte[8];
        (__sourceSpill1364_48)[0] = ((byte) ((int) (local21_life47 >>> 56)));
        (__sourceSpill1364_48)[1] = ((byte) ((int) (local21_life47 >>> 48)));
        (__sourceSpill1364_48)[2] = ((byte) ((int) (local21_life47 >>> 40)));
        (__sourceSpill1364_48)[3] = ((byte) ((int) (local21_life47 >>> 32)));
        (__sourceSpill1364_48)[4] = ((byte) ((int) (local21_life47 >>> 24)));
        (__sourceSpill1364_48)[5] = ((byte) ((int) (local21_life47 >>> 16)));
        (__sourceSpill1364_48)[6] = ((byte) ((int) (local21_life47 >>> 8)));
        (__sourceSpill1364_48)[7] = ((byte) ((int) local21_life47));
        javax.crypto.Cipher __sourceSpill1364_49 = local13_life11;
        byte[] local23_life51 = ((javax.crypto.Cipher)(__sourceSpill1364_49)).doFinal(((byte[])(__sourceSpill1364_48)));
        (__sourceSpill1364_45)[__sourceSpill1364_46] = (((((((((((long) (local23_life51)[0]) & 255L) << 56) | ((((long) (local23_life51)[1]) & 255L) << 48)) | ((((long) (local23_life51)[2]) & 255L) << 40)) | ((((long) (local23_life51)[3]) & 255L) << 32)) | ((((long) (local23_life51)[4]) & 255L) << 24)) | ((((long) (local23_life51)[5]) & 255L) << 16)) | ((((long) (local23_life51)[6]) & 255L) << 8)) | (((long) (local23_life51)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    eb = ((long[])(local19_life21));
    fb = ((java.lang.Integer[])(new java.lang.Integer[55]));
    mb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life56;
    javax.crypto.Cipher __sourceSpill1364_58 = (local0_life56 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1364_59 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1364_60 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1364_61 = new byte[8];
    (__sourceSpill1364_61)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local1_life62 = 1;
    while ((local1_life62 < 8)) {
        (__sourceSpill1364_61)[local1_life62] = ((byte) ((int) ((local11_life8 << (local1_life62 * 8)) >>> 56)));
        local1_life62 += 1;
    }
    byte[] __sourcePreallocation1364_63 = __sourceSpill1364_61;
    ((javax.crypto.Cipher)(__sourceSpill1364_58)).init(((int)(__sourceSpill1364_59)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1364_60)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1364_63)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life66 = new long[9];
    int local3_life67 = 0;
    java.lang.String local4_life68;
    int local5_life70 = ((java.lang.String)((local4_life68 = "\013\000û\025Q¶c±\032\020íÞUyðü¾RN&²q]ÒFW<Ø\033¦¶À*\027ä!N\034ïUº\031.R\036Íÿ_×"))).length();
    int local2_life71 = 0;
    do {
        java.lang.String __sourceSpill1364_72 = local4_life68;
        int __sourceSpill1364_73 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life76 = ((java.lang.String)(((java.lang.String)(__sourceSpill1364_72)).substring(((int)(__sourceSpill1364_73)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1364_77 = local6_life66;
        int __sourceSpill1364_78 = local3_life67;
        local3_life67 += 1;
        long local8_life79 = (((((((((((long) (local7_life76)[0]) & 255L) << 56) | ((((long) (local7_life76)[1]) & 255L) << 48)) | ((((long) (local7_life76)[2]) & 255L) << 40)) | ((((long) (local7_life76)[3]) & 255L) << 32)) | ((((long) (local7_life76)[4]) & 255L) << 24)) | ((((long) (local7_life76)[5]) & 255L) << 16)) | ((((long) (local7_life76)[6]) & 255L) << 8)) | (((long) (local7_life76)[7]) & 255L));
        byte[] __sourceSpill1364_80 = new byte[8];
        (__sourceSpill1364_80)[0] = ((byte) ((int) (local8_life79 >>> 56)));
        (__sourceSpill1364_80)[1] = ((byte) ((int) (local8_life79 >>> 48)));
        (__sourceSpill1364_80)[2] = ((byte) ((int) (local8_life79 >>> 40)));
        (__sourceSpill1364_80)[3] = ((byte) ((int) (local8_life79 >>> 32)));
        (__sourceSpill1364_80)[4] = ((byte) ((int) (local8_life79 >>> 24)));
        (__sourceSpill1364_80)[5] = ((byte) ((int) (local8_life79 >>> 16)));
        (__sourceSpill1364_80)[6] = ((byte) ((int) (local8_life79 >>> 8)));
        (__sourceSpill1364_80)[7] = ((byte) ((int) local8_life79));
        javax.crypto.Cipher __sourceSpill1364_81 = local0_life56;
        byte[] local10_life83 = ((javax.crypto.Cipher)(__sourceSpill1364_81)).doFinal(((byte[])(__sourceSpill1364_80)));
        (__sourceSpill1364_77)[__sourceSpill1364_78] = (((((((((((long) (local10_life83)[0]) & 255L) << 56) | ((((long) (local10_life83)[1]) & 255L) << 48)) | ((((long) (local10_life83)[2]) & 255L) << 40)) | ((((long) (local10_life83)[3]) & 255L) << 32)) | ((((long) (local10_life83)[4]) & 255L) << 24)) | ((((long) (local10_life83)[5]) & 255L) << 16)) | ((((long) (local10_life83)[6]) & 255L) << 8)) | (((long) (local10_life83)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    local5_life70 = ((java.lang.String)((local4_life68 = "ØÑ\030´\"Z.Üf£s·]"))).length();
    local2_life71 = 0;
    do {
        java.lang.String __sourceSpill1364_85 = local4_life68;
        int __sourceSpill1364_86 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life89 = ((java.lang.String)(((java.lang.String)(__sourceSpill1364_85)).substring(((int)(__sourceSpill1364_86)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1364_90 = local6_life66;
        int __sourceSpill1364_91 = local3_life67;
        local3_life67 += 1;
        long local8_life92 = (((((((((((long) (local7_life89)[0]) & 255L) << 56) | ((((long) (local7_life89)[1]) & 255L) << 48)) | ((((long) (local7_life89)[2]) & 255L) << 40)) | ((((long) (local7_life89)[3]) & 255L) << 32)) | ((((long) (local7_life89)[4]) & 255L) << 24)) | ((((long) (local7_life89)[5]) & 255L) << 16)) | ((((long) (local7_life89)[6]) & 255L) << 8)) | (((long) (local7_life89)[7]) & 255L));
        byte[] __sourceSpill1364_93 = new byte[8];
        (__sourceSpill1364_93)[0] = ((byte) ((int) (local8_life92 >>> 56)));
        (__sourceSpill1364_93)[1] = ((byte) ((int) (local8_life92 >>> 48)));
        (__sourceSpill1364_93)[2] = ((byte) ((int) (local8_life92 >>> 40)));
        (__sourceSpill1364_93)[3] = ((byte) ((int) (local8_life92 >>> 32)));
        (__sourceSpill1364_93)[4] = ((byte) ((int) (local8_life92 >>> 24)));
        (__sourceSpill1364_93)[5] = ((byte) ((int) (local8_life92 >>> 16)));
        (__sourceSpill1364_93)[6] = ((byte) ((int) (local8_life92 >>> 8)));
        (__sourceSpill1364_93)[7] = ((byte) ((int) local8_life92));
        javax.crypto.Cipher __sourceSpill1364_94 = local0_life56;
        byte[] local10_life96 = ((javax.crypto.Cipher)(__sourceSpill1364_94)).doFinal(((byte[])(__sourceSpill1364_93)));
        (__sourceSpill1364_90)[__sourceSpill1364_91] = (((((((((((long) (local10_life96)[0]) & 255L) << 56) | ((((long) (local10_life96)[1]) & 255L) << 48)) | ((((long) (local10_life96)[2]) & 255L) << 40)) | ((((long) (local10_life96)[3]) & 255L) << 32)) | ((((long) (local10_life96)[4]) & 255L) << 24)) | ((((long) (local10_life96)[5]) & 255L) << 16)) | ((((long) (local10_life96)[6]) & 255L) << 8)) | (((long) (local10_life96)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    kb = ((long[])(local6_life66));
    lb = ((java.lang.Long[])(new java.lang.Long[9]));
}

private static native <E extends Throwable> void __sourceConstructorInit_b263e73c8dee9d46_0(net.minecraft.world.World a0) throws E;
private static native <E extends Throwable> double __sourceHandlerCall_05d6113578b07eee9825(net.minecraft.world.World a0) throws E;
private static final class __SourceHandler_05d6113578b07eee9825 {

public static double f3015(net.minecraft.world.World receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead3015_0() ^ 81243566178225L);
    return ((__call3015_2(__fieldRead3015_1(receiver)) == __fieldRead3015_3()) ? 0x0.0p0d : 0x1.f8p5d);
}
public static void h3015_0(moom.Oo p0) throws Throwable {
    throw __call1301500_0(p0);
}
private static native long __fieldRead3015_0() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead3015_1(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.WorldType __call3015_2(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead3015_3() throws Throwable;
private static native java.lang.Throwable __call1301500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.player.EntityPlayer __sourceHandlerCall_75e8f076f078d506b72d(net.minecraft.world.World a0, double a1, double a2, double a3, double a4) throws E;
private static final class __SourceHandler_75e8f076f078d506b72d {

public static net.minecraft.entity.player.EntityPlayer f1675(net.minecraft.world.World receiver, double p0, double p1, double p2, double p3) throws Throwable {
    int lexicalValue1675_52_0;
    double lexicalValue1675_60_0;
    net.minecraft.entity.player.EntityPlayer lexicalValue1675_66_0;
    java.lang.String spill1675_0;
    net.minecraft.entity.player.EntityPlayer spill1675_1;
    int spill1675_2;
    int spill1675_3;
    double spill1675_4;
    double spill1675_5;
    long life9_3;
    double life12_6;
    net.minecraft.entity.player.EntityPlayer life14_8;
    java.lang.String life11_9;
    java.util.Iterator life15_13;
    net.minecraft.entity.player.EntityPlayer life16_22;
    double life17_32;
    lexical_join_66: {
    lexical_join_65: {
    life9_3 = (__fieldRead1675_0() ^ 91047201674791L);
    spill1675_0 = __call1675_1();
    life12_6 = -0x1.0p0d;
    life14_8 = null;
    life11_9 = spill1675_0;
    life15_13 = __call1675_3(__fieldRead1675_2(receiver));
    lexical_cycle_14: while (true) {
    lexical_join_63: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_52: {
    lexical_join_47: {
    if (!(__call1675_4(life15_13))) {
        break lexical_join_65;
    }
    spill1675_1 = __cast1675_6(__call1675_5(life15_13));
    if (!((life11_9 == null))) {
        lexicalValue1675_66_0 = spill1675_1;
        break lexical_join_66;
    }
    life16_22 = spill1675_1;
    if (!(__call1675_8(__fieldRead1675_7(), life16_22))) {
        break lexical_join_63;
    }
    life17_32 = __call1675_9(life16_22, p0, p1, p2);
    spill1675_2 = __numericCompare1675_10(p3, 0x0.0p0d);
    if (!((life11_9 == null))) {
        lexicalValue1675_52_0 = spill1675_2;
        break lexical_join_52;
    }
    if (!((spill1675_2 >= 0))) {
        break lexical_join_47;
    }
    spill1675_3 = __numericCompare1675_11(life17_32, (p3 * p3));
    if (!((life11_9 == null))) {
        lexicalValue1675_52_0 = spill1675_3;
        break lexical_join_52;
    }
    if (!((spill1675_3 < 0))) {
        break lexical_join_63;
    }
    }
    spill1675_4 = life12_6;
    if (!((life11_9 == null))) {
        lexicalValue1675_60_0 = spill1675_4;
        break lexical_join_60;
    }
    lexicalValue1675_52_0 = __numericCompare1675_12(spill1675_4, -0x1.0p0d);
    }
    if (!((lexicalValue1675_52_0 != 0))) {
        break lexical_join_59;
    }
    spill1675_5 = life17_32;
    if (!((life11_9 == null))) {
        lexicalValue1675_60_0 = spill1675_5;
        break lexical_join_60;
    }
    if (!((__numericCompare1675_13(spill1675_5, life12_6) < 0))) {
        break lexical_join_63;
    }
    }
    lexicalValue1675_60_0 = life17_32;
    }
    life12_6 = lexicalValue1675_60_0;
    life14_8 = life16_22;
    }
    if (!((life11_9 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1675_66_0 = life14_8;
    }
    return lexicalValue1675_66_0;
}
public static void h1675_0(moom.Oo p0) throws Throwable {
    throw __call1167500_0(p0);
}
public static void h1675_1(moom.Oo p0) throws Throwable {
    throw __call1167501_0(p0);
}
public static void h1675_2(moom.Oo p0) throws Throwable {
    throw __call1167502_0(p0);
}
public static void h1675_3(moom.Oo p0) throws Throwable {
    throw __call1167503_0(p0);
}
public static void h1675_4(moom.Oo p0) throws Throwable {
    throw __call1167504_0(p0);
}
public static void h1675_5(moom.Oo p0) throws Throwable {
    throw __call1167505_0(p0);
}
public static void h1675_6(moom.Oo p0) throws Throwable {
    throw __call1167506_0(p0);
}
public static void h1675_7(moom.Oo p0) throws Throwable {
    throw __call1167507_0(p0);
}
private static native long __fieldRead1675_0() throws Throwable;
private static native java.lang.String __call1675_1() throws Throwable;
private static native java.util.List __fieldRead1675_2(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call1675_3(java.util.List a0) throws Throwable;
private static native boolean __call1675_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1675_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1675_6(java.lang.Object a0) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead1675_7() throws Throwable;
private static native boolean __call1675_8(com.google.common.base.Predicate a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native double __call1675_9(net.minecraft.entity.player.EntityPlayer a0, double a1, double a2, double a3) throws Throwable;
private static native int __numericCompare1675_10(double a0, double a1) throws Throwable;
private static native int __numericCompare1675_11(double a0, double a1) throws Throwable;
private static native int __numericCompare1675_12(double a0, double a1) throws Throwable;
private static native int __numericCompare1675_13(double a0, double a1) throws Throwable;
private static native java.lang.Throwable __call1167500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167507_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_2137b24c6a00e6109850(net.minecraft.world.World a0, int a1, int a2) throws E;
private static final class __SourceHandler_2137b24c6a00e6109850 {

public static int f1676(net.minecraft.world.World receiver, int p0, int p1) throws Throwable {
    net.minecraft.world.World forwardValue1676_62_0;
    int forwardValue1676_62_1;
    int forwardValue1676_62_2;
    int forwardValue1676_62_3;
    int forwardValue1676_71_0;
    int forwardValue1676_71_1;
    int spill1676_0;
    int spill1676_1;
    int spill1676_2;
    int spill1676_3;
    int spill1676_4;
    int spill1676_5;
    int spill1676_6;
    int spill1676_7;
    net.minecraft.world.World spill1676_8;
    int spill1676_9;
    int spill1676_10;
    int spill1676_11;
    long life3_3;
    java.lang.String life5_5;
    net.minecraft.world.chunk.Chunk life6_93;
    forward_join_71: {
    forward_join_68: {
    forward_join_62: {
    forward_join_56: {
    life3_3 = (__fieldRead1676_0() ^ 8672567666490L);
    life5_5 = __call1676_1();
    spill1676_0 = p0;
    spill1676_1 = __invokedynamic1676_2(20188, (2672907066595381757L ^ life3_3));
    if (!((life5_5 == null))) {
        forwardValue1676_71_0 = spill1676_0;
        forwardValue1676_71_1 = spill1676_1;
        break forward_join_71;
    }
    if (!((spill1676_0 >= spill1676_1))) {
        break forward_join_68;
    }
    spill1676_2 = p1;
    spill1676_3 = __invokedynamic1676_3(20188, (2672907066595381757L ^ life3_3));
    if (!((life5_5 == null))) {
        forwardValue1676_71_0 = spill1676_2;
        forwardValue1676_71_1 = spill1676_3;
        break forward_join_71;
    }
    if (!((spill1676_2 >= spill1676_3))) {
        break forward_join_68;
    }
    spill1676_4 = p0;
    spill1676_5 = __invokedynamic1676_4(14058, (675788743083190722L ^ life3_3));
    if (!((life5_5 == null))) {
        forwardValue1676_71_0 = spill1676_4;
        forwardValue1676_71_1 = spill1676_5;
        break forward_join_71;
    }
    if (!((spill1676_4 < spill1676_5))) {
        break forward_join_68;
    }
    spill1676_6 = p1;
    spill1676_7 = __invokedynamic1676_5(14058, (675788743083190722L ^ life3_3));
    if (!((life5_5 == null))) {
        forwardValue1676_71_0 = spill1676_6;
        forwardValue1676_71_1 = spill1676_7;
        break forward_join_71;
    }
    if (!((spill1676_6 < spill1676_7))) {
        break forward_join_68;
    }
    spill1676_8 = receiver;
    spill1676_9 = (p0 >> 4);
    spill1676_10 = (p1 >> 4);
    spill1676_11 = 1;
    if (!((life5_5 == null))) {
        forwardValue1676_62_0 = spill1676_8;
        forwardValue1676_62_1 = spill1676_9;
        forwardValue1676_62_2 = spill1676_10;
        forwardValue1676_62_3 = spill1676_11;
        break forward_join_62;
    }
    if (!((!__call1676_6(spill1676_8, spill1676_9, spill1676_10, spill1676_11)))) {
        break forward_join_56;
    }
    return 0;
    }
    forwardValue1676_62_0 = receiver;
    forwardValue1676_62_1 = (p0 >> 4);
    forwardValue1676_62_2 = p1;
    forwardValue1676_62_3 = 4;
    }
    life6_93 = __call1676_7(forwardValue1676_62_0, forwardValue1676_62_1, (forwardValue1676_62_2 >> forwardValue1676_62_3));
    return __call1676_8(life6_93);
    }
    forwardValue1676_71_0 = __call1676_9(receiver);
    forwardValue1676_71_1 = 1;
    }
    return (forwardValue1676_71_0 + forwardValue1676_71_1);
}
public static void h1676_0(moom.Oo p0) throws Throwable {
    throw __call1167600_0(p0);
}
public static void h1676_1(moom.Oo p0) throws Throwable {
    throw __call1167601_0(p0);
}
public static void h1676_2(moom.Oo p0) throws Throwable {
    throw __call1167602_0(p0);
}
public static void h1676_3(moom.Oo p0) throws Throwable {
    throw __call1167603_0(p0);
}
public static void h1676_4(moom.Oo p0) throws Throwable {
    throw __call1167604_0(p0);
}
public static void h1676_5(moom.Oo p0) throws Throwable {
    throw __call1167605_0(p0);
}
public static void h1676_6(moom.Oo p0) throws Throwable {
    throw __call1167606_0(p0);
}
public static void h1676_7(moom.Oo p0) throws Throwable {
    throw __call1167607_0(p0);
}
public static void h1676_8(moom.Oo p0) throws Throwable {
    throw __call1167608_0(p0);
}
public static void h1676_9(moom.Oo p0) throws Throwable {
    throw __call1167609_0(p0);
}
private static native long __fieldRead1676_0() throws Throwable;
private static native java.lang.String __call1676_1() throws Throwable;
private static native int __invokedynamic1676_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic1676_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic1676_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic1676_5(int a0, long a1) throws Throwable;
private static native boolean __call1676_6(net.minecraft.world.World a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1676_7(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native int __call1676_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1676_9(net.minecraft.world.World a0) throws Throwable;
private static native java.lang.Throwable __call1167600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167609_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8413ce2909e23561cd3a(net.minecraft.world.World a0, int a1, int a2, int a3, int a4) throws E;
private static final class __SourceHandler_8413ce2909e23561cd3a {

public static void f1677(net.minecraft.world.World receiver, int p0, int p1, int p2, int p3) throws Throwable {
    int lexicalValue1677_22_0;
    net.minecraft.world.World lexicalValue1677_44_0;
    int spill1677_0;
    net.minecraft.world.World spill1677_1;
    long life5_3;
    java.lang.String life7_5;
    int life8_15;
    int life8_30;
    lexical_join_51: {
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_22: {
    lexical_join_17: {
    life5_3 = (__fieldRead1677_0() ^ 123932120887291L);
    life7_5 = __call1677_1();
    spill1677_0 = p2;
    if (!((life7_5 == null))) {
        lexicalValue1677_22_0 = spill1677_0;
        break lexical_join_22;
    }
    if (!((spill1677_0 > p3))) {
        break lexical_join_17;
    }
    life8_15 = p3;
    p3 = p2;
    p2 = life8_15;
    }
    spill1677_1 = receiver;
    if (!((life7_5 == null))) {
        lexicalValue1677_44_0 = spill1677_1;
        break lexical_join_44;
    }
    lexicalValue1677_22_0 = __integerCategory1677_4(__call1677_3(__fieldRead1677_2(spill1677_1)));
    }
    if (!((lexicalValue1677_22_0 == 0))) {
        break lexical_join_43;
    }
    life8_30 = p2;
    lexical_cycle_25: while (true) {
    if (!((life8_30 <= p3))) {
        break lexical_join_43;
    }
    __call1677_6(receiver, __fieldRead1677_5(), new moom.DT(p0, life8_30, p1));
    life8_30 += 1;
    if (!((life7_5 == null))) {
        break lexical_join_51;
    }
    if (!((life7_5 != null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    lexicalValue1677_44_0 = receiver;
    }
    __call1677_7(lexicalValue1677_44_0, p0, p2, p1, p0, p3, p1);
    }
    return;
}
public static void h1677_0(moom.Oo p0) throws Throwable {
    throw __call1167700_0(p0);
}
public static void h1677_1(moom.Oo p0) throws Throwable {
    throw __call1167701_0(p0);
}
public static void h1677_2(moom.Oo p0) throws Throwable {
    throw __call1167702_0(p0);
}
private static native long __fieldRead1677_0() throws Throwable;
private static native java.lang.String __call1677_1() throws Throwable;
private static native moom.EA __fieldRead1677_2(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1677_3(moom.EA a0) throws Throwable;
private static native int __integerCategory1677_4(boolean value) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1677_5() throws Throwable;
private static native boolean __call1677_6(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native void __call1677_7(net.minecraft.world.World a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native java.lang.Throwable __call1167700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167702_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3f1094a234a2d1fdcc5c(net.minecraft.world.World a0, int a1, int a2, int a3, int a4, int a5, int a6, boolean a7) throws E;
private static final class __SourceHandler_3f1094a234a2d1fdcc5c {

public static boolean f1152(net.minecraft.world.World receiver, int p0, int p1, int p2, int p3, int p4, int p5, boolean p6) throws Throwable {
    int forestValue1152_38_0;
    int forestValue1152_66_0;
    int forestValue1152_68_0;
    int forestValue1152_70_0;
    int spill1152_0;
    int spill1152_1;
    int spill1152_2;
    boolean spill1152_3;
    long life8_3;
    java.lang.String life10_5;
    int life1_25;
    int life3_29;
    int life4_33;
    int life6_37;
    int life11_39;
    int life12_46;
    forest_join_70: {
    forest_join_69: {
    forest_join_68: {
    forest_join_67: {
    forest_join_66: {
    forest_join_65: {
    life8_3 = (__fieldRead1152_0() ^ 53529665548797L);
    life10_5 = __call1152_1();
    spill1152_0 = p4;
    if (!((life10_5 == null))) {
        forestValue1152_70_0 = spill1152_0;
        break forest_join_70;
    }
    if (!((spill1152_0 >= 0))) {
        break forest_join_69;
    }
    spill1152_1 = p1;
    if (!((life10_5 == null))) {
        forestValue1152_70_0 = spill1152_1;
        break forest_join_70;
    }
    if (!((spill1152_1 < __invokedynamic1152_2(5123, (1626578642690825696L ^ life8_3))))) {
        break forest_join_69;
    }
    life1_25 = (p0 >> 4);
    life3_29 = (p2 >> 4);
    life4_33 = (p3 >> 4);
    life6_37 = (p5 >> 4);
    life11_39 = life1_25;
    forest_cycle_37: while (true) {
    forest_join_61: {
    forestValue1152_38_0 = life11_39;
    forest_cycle_38: while (true) {
    if (!((forestValue1152_38_0 <= life4_33))) {
        break forest_join_67;
    }
    spill1152_2 = life3_29;
    if (!((life10_5 == null))) {
        forestValue1152_68_0 = spill1152_2;
        break forest_join_68;
    }
    life12_46 = spill1152_2;
    forest_cycle_44: while (true) {
    forest_join_58: {
    if (!((life12_46 <= life6_37))) {
        break forest_join_61;
    }
    spill1152_3 = __call1152_3(receiver, life11_39, life12_46, p6);
    if (!((life10_5 == null))) {
        forestValue1152_38_0 = __integerCategory1152_4(spill1152_3);
        continue forest_cycle_38;
    }
    if (!((life10_5 == null))) {
        forestValue1152_66_0 = __integerCategory1152_5(spill1152_3);
        break forest_join_66;
    }
    if (!((!spill1152_3))) {
        break forest_join_58;
    }
    break forest_join_65;
    }
    life12_46 += 1;
    if (!((life10_5 != null))) {
        continue forest_cycle_44;
    }
    break forest_cycle_44;
    }
    break forest_cycle_38;
    }
    }
    life11_39 += 1;
    if (!((life10_5 != null))) {
        continue forest_cycle_37;
    }
    break forest_cycle_37;
    }
    break forest_join_67;
    }
    forestValue1152_66_0 = 0;
    }
    return __integerCategory1152_6(forestValue1152_66_0);
    }
    forestValue1152_68_0 = 1;
    }
    return __integerCategory1152_7(forestValue1152_68_0);
    }
    forestValue1152_70_0 = 0;
    }
    return __integerCategory1152_8(forestValue1152_70_0);
}
public static boolean h1152_0(moom.Oo p0) throws Throwable {
    throw __call3115200_0(p0);
}
public static boolean h1152_1(moom.Oo p0) throws Throwable {
    throw __call3115201_0(p0);
}
public static boolean h1152_2(moom.Oo p0) throws Throwable {
    throw __call3115202_0(p0);
}
public static boolean h1152_3(moom.Oo p0) throws Throwable {
    throw __call3115203_0(p0);
}
private static native long __fieldRead1152_0() throws Throwable;
private static native java.lang.String __call1152_1() throws Throwable;
private static native int __invokedynamic1152_2(int a0, long a1) throws Throwable;
private static native boolean __call1152_3(net.minecraft.world.World a0, int a1, int a2, boolean a3) throws Throwable;
private static native int __integerCategory1152_4(boolean value) throws Throwable;
private static native int __integerCategory1152_5(boolean value) throws Throwable;
private static native boolean __integerCategory1152_6(int value) throws Throwable;
private static native boolean __integerCategory1152_7(int value) throws Throwable;
private static native boolean __integerCategory1152_8(int value) throws Throwable;
private static native java.lang.Throwable __call3115200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115203_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b9de783454e99100ef05(net.minecraft.world.World a0, int a1, int a2, net.minecraft.world.chunk.Chunk a3) throws E;
private static final class __SourceHandler_b9de783454e99100ef05 {

public static void f1679(net.minecraft.world.World receiver, int p0, int p1, net.minecraft.world.chunk.Chunk p2) throws Throwable {
    net.minecraft.world.World forwardValue1679_196_0;
    java.lang.String spill1679_0;
    net.minecraft.world.World spill1679_1;
    net.minecraft.world.World spill1679_2;
    net.minecraft.world.World spill1679_3;
    net.minecraft.world.World spill1679_4;
    long life4_3;
    java.lang.String life6_9;
    int life7_45;
    int life8_53;
    int life9_67;
    int life10_81;
    moom.DT life11_88;
    net.minecraft.block.Block life12_92;
    int life8_96;
    int life9_100;
    net.minecraft.entity.player.EntityPlayer life13_158;
    forward_join_201: {
    forward_join_196: {
    forward_join_195: {
    life4_3 = (__fieldRead1679_0() ^ 139581284427185L);
    spill1679_0 = __call1679_1();
    __call1679_3(__fieldRead1679_2(receiver), "moodSound");
    life6_9 = spill1679_0;
    spill1679_1 = receiver;
    if (!((life6_9 == null))) {
        forwardValue1679_196_0 = spill1679_1;
        break forward_join_196;
    }
    if (!((__fieldRead1679_4(spill1679_1) == 0))) {
        break forward_join_195;
    }
    spill1679_2 = receiver;
    if (!((life6_9 == null))) {
        forwardValue1679_196_0 = spill1679_2;
        break forward_join_196;
    }
    if (!((!__fieldRead1679_5(spill1679_2)))) {
        break forward_join_195;
    }
    __fieldWrite1679_8(receiver, ((__fieldRead1679_6(receiver) * 3) + __invokedynamic1679_7(21324, (6715335692964859595L ^ life4_3))));
    life7_45 = (__fieldRead1679_9(receiver) >> 2);
    life8_53 = (life7_45 & __invokedynamic1679_10(24438, (2603150431002231531L ^ life4_3)));
    life9_67 = ((life7_45 >> __invokedynamic1679_11(16662, (7984301825797659806L ^ life4_3))) & __invokedynamic1679_12(24438, (2603150431002231531L ^ life4_3)));
    life10_81 = ((life7_45 >> __invokedynamic1679_13(4563, (7598656664060054653L ^ life4_3))) & __invokedynamic1679_14(3671, (3254436506951570373L ^ life4_3)));
    life11_88 = new moom.DT(life8_53, life10_81, life9_67);
    life12_92 = __call1679_15(p2, life11_88);
    life8_96 = (life8_53 + p0);
    life9_100 = (life9_67 + p1);
    if (!((life6_9 == null))) {
        break forward_join_201;
    }
    if (!((__call1679_16(life12_92) == __fieldRead1679_17()))) {
        break forward_join_195;
    }
    spill1679_3 = receiver;
    if (!((life6_9 == null))) {
        forwardValue1679_196_0 = spill1679_3;
        break forward_join_196;
    }
    if (!((__call1679_18(spill1679_3, life11_88) <= __call1679_21(__fieldRead1679_19(receiver), __invokedynamic1679_20(16662, (7984301825797659806L ^ life4_3)))))) {
        break forward_join_195;
    }
    spill1679_4 = receiver;
    if (!((life6_9 == null))) {
        forwardValue1679_196_0 = spill1679_4;
        break forward_join_196;
    }
    if (!((__call1679_23(spill1679_4, __fieldRead1679_22(), life11_88) <= 0))) {
        break forward_join_195;
    }
    life13_158 = __call1679_24(receiver, (((double) life8_96) + 0x1.0p-1d), (((double) life10_81) + 0x1.0p-1d), (((double) life9_100) + 0x1.0p-1d), 0x1.0p3d);
    if (!((life6_9 == null))) {
        break forward_join_201;
    }
    if (!((life13_158 != null))) {
        break forward_join_195;
    }
    if (!((__numericCompare1679_26(__call1679_25(life13_158, (((double) life8_96) + 0x1.0p-1d), (((double) life10_81) + 0x1.0p-1d), (((double) life9_100) + 0x1.0p-1d)), 0x1.0p2d) > 0))) {
        break forward_join_195;
    }
    __call1679_29(receiver, (((double) life8_96) + 0x1.0p-1d), (((double) life10_81) + 0x1.0p-1d), (((double) life9_100) + 0x1.0p-1d), "ambient.cave.cave", 0x1.666666p-1f, (0x1.99999ap-1f + (__call1679_28(__fieldRead1679_27(receiver)) * 0x1.99999ap-3f)));
    __fieldWrite1679_34(receiver, (__call1679_32(__fieldRead1679_30(receiver), __invokedynamic1679_31(8601, (1414673898335566890L ^ life4_3))) + __invokedynamic1679_33(5893, (6547776034294614701L ^ life4_3))));
    }
    forwardValue1679_196_0 = receiver;
    }
    __call1679_36(__fieldRead1679_35(forwardValue1679_196_0), "checkLight");
    __call1679_37(p2);
    }
    return;
}
public static void h1679_0(moom.Oo p0) throws Throwable {
    throw __call1167900_0(p0);
}
public static void h1679_1(moom.Oo p0) throws Throwable {
    throw __call1167901_0(p0);
}
public static void h1679_2(moom.Oo p0) throws Throwable {
    throw __call1167902_0(p0);
}
public static void h1679_3(moom.Oo p0) throws Throwable {
    throw __call1167903_0(p0);
}
public static void h1679_4(moom.Oo p0) throws Throwable {
    throw __call1167904_0(p0);
}
public static void h1679_5(moom.Oo p0) throws Throwable {
    throw __call1167905_0(p0);
}
public static void h1679_6(moom.Oo p0) throws Throwable {
    throw __call1167906_0(p0);
}
public static void h1679_7(moom.Oo p0) throws Throwable {
    throw __call1167907_0(p0);
}
public static void h1679_8(moom.Oo p0) throws Throwable {
    throw __call1167908_0(p0);
}
public static void h1679_9(moom.Oo p0) throws Throwable {
    throw __call1167909_0(p0);
}
public static void h1679_10(moom.Oo p0) throws Throwable {
    throw __call1167910_0(p0);
}
private static native long __fieldRead1679_0() throws Throwable;
private static native java.lang.String __call1679_1() throws Throwable;
private static native moom.A9 __fieldRead1679_2(net.minecraft.world.World a0) throws Throwable;
private static native void __call1679_3(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead1679_4(net.minecraft.world.World a0) throws Throwable;
private static native boolean __fieldRead1679_5(net.minecraft.world.World a0) throws Throwable;
private static native int __fieldRead1679_6(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1679_7(int a0, long a1) throws Throwable;
private static native void __fieldWrite1679_8(net.minecraft.world.World a0, int a1) throws Throwable;
private static native int __fieldRead1679_9(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1679_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic1679_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic1679_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic1679_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic1679_14(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __call1679_15(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native moom.fn __call1679_16(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1679_17() throws Throwable;
private static native int __call1679_18(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native java.util.Random __fieldRead1679_19(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1679_20(int a0, long a1) throws Throwable;
private static native int __call1679_21(java.util.Random a0, int a1) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1679_22() throws Throwable;
private static native int __call1679_23(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __call1679_24(net.minecraft.world.World a0, double a1, double a2, double a3, double a4) throws Throwable;
private static native double __call1679_25(net.minecraft.entity.player.EntityPlayer a0, double a1, double a2, double a3) throws Throwable;
private static native int __numericCompare1679_26(double a0, double a1) throws Throwable;
private static native java.util.Random __fieldRead1679_27(net.minecraft.world.World a0) throws Throwable;
private static native float __call1679_28(java.util.Random a0) throws Throwable;
private static native void __call1679_29(net.minecraft.world.World a0, double a1, double a2, double a3, java.lang.String a4, float a5, float a6) throws Throwable;
private static native java.util.Random __fieldRead1679_30(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1679_31(int a0, long a1) throws Throwable;
private static native int __call1679_32(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic1679_33(int a0, long a1) throws Throwable;
private static native void __fieldWrite1679_34(net.minecraft.world.World a0, int a1) throws Throwable;
private static native moom.A9 __fieldRead1679_35(net.minecraft.world.World a0) throws Throwable;
private static native void __call1679_36(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call1679_37(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Throwable __call1167900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167910_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e3341be8d47028ecd921(net.minecraft.world.World a0, int a1, int a2, boolean a3) throws E;
private static final class __SourceHandler_e3341be8d47028ecd921 {

public static boolean f1680(net.minecraft.world.World receiver, int p0, int p1, boolean p2) throws Throwable {
    int forwardValue1680_15_0;
    int forwardValue1680_28_0;
    int forwardValue1680_30_0;
    boolean spill1680_0;
    boolean spill1680_1;
    long life4_3;
    java.lang.String life6_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_15: {
    life4_3 = (__fieldRead1680_0() ^ 9398544116731L);
    life6_5 = __call1680_1();
    spill1680_0 = __call1680_3(__fieldRead1680_2(receiver), p0, p1);
    if (!((life6_5 == null))) {
        forwardValue1680_15_0 = __integerCategory1680_4(spill1680_0);
        break forward_join_15;
    }
    if (!(spill1680_0)) {
        break forward_join_29;
    }
    forwardValue1680_15_0 = __integerCategory1680_5(p2);
    }
    if (!((life6_5 == null))) {
        forwardValue1680_28_0 = forwardValue1680_15_0;
        break forward_join_28;
    }
    if (!((forwardValue1680_15_0 == 0))) {
        break forward_join_27;
    }
    spill1680_1 = __call1680_8(__call1680_7(__fieldRead1680_6(receiver), p0, p1));
    if (!((life6_5 == null))) {
        forwardValue1680_28_0 = __integerCategory1680_9(spill1680_1);
        break forward_join_28;
    }
    if (!((!spill1680_1))) {
        break forward_join_29;
    }
    }
    forwardValue1680_28_0 = 1;
    }
    forwardValue1680_30_0 = forwardValue1680_28_0;
    break forward_join_30;
    }
    forwardValue1680_30_0 = 0;
    }
    return __integerCategory1680_10(forwardValue1680_30_0);
}
public static void h1680_0(moom.Oo p0) throws Throwable {
    throw __call1168000_0(p0);
}
public static void h1680_1(moom.Oo p0) throws Throwable {
    throw __call1168001_0(p0);
}
public static void h1680_2(moom.Oo p0) throws Throwable {
    throw __call1168002_0(p0);
}
public static void h1680_3(moom.Oo p0) throws Throwable {
    throw __call1168003_0(p0);
}
private static native long __fieldRead1680_0() throws Throwable;
private static native java.lang.String __call1680_1() throws Throwable;
private static native moom.Fn __fieldRead1680_2(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1680_3(moom.Fn a0, int a1, int a2) throws Throwable;
private static native int __integerCategory1680_4(boolean value) throws Throwable;
private static native int __integerCategory1680_5(boolean value) throws Throwable;
private static native moom.Fn __fieldRead1680_6(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1680_7(moom.Fn a0, int a1, int a2) throws Throwable;
private static native boolean __call1680_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory1680_9(boolean value) throws Throwable;
private static native boolean __integerCategory1680_10(int value) throws Throwable;
private static native java.lang.Throwable __call1168000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1168001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1168002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1168003_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_c04f2fcec31e9fea8c5d(net.minecraft.world.World a0, java.lang.Class a1) throws E;
private static final class __SourceHandler_c04f2fcec31e9fea8c5d {

public static int f1681(net.minecraft.world.World receiver, java.lang.Class p0) throws Throwable {
    int lexicalValue1681_36_0;
    int lexicalValue1681_41_0;
    java.lang.String spill1681_0;
    int spill1681_1;
    boolean spill1681_2;
    long life2_3;
    int life5_6;
    java.lang.String life4_7;
    java.util.Iterator life6_11;
    net.minecraft.entity.Entity life7_18;
    lexical_join_41: {
    lexical_join_40: {
    life2_3 = (__fieldRead1681_0() ^ 66079629816637L);
    spill1681_0 = __call1681_1();
    life5_6 = 0;
    life4_7 = spill1681_0;
    life6_11 = __call1681_3(__fieldRead1681_2(receiver));
    lexical_cycle_12: while (true) {
    lexical_join_38: {
    lexical_join_36: {
    lexical_join_32: {
    if (!(__call1681_4(life6_11))) {
        break lexical_join_40;
    }
    life7_18 = __cast1681_6(__call1681_5(life6_11));
    spill1681_1 = __instanceOf1681_7(life7_18);
    if (!((life4_7 == null))) {
        lexicalValue1681_41_0 = spill1681_1;
        break lexical_join_41;
    }
    if (!((life4_7 == null))) {
        lexicalValue1681_36_0 = spill1681_1;
        break lexical_join_36;
    }
    if (!((spill1681_1 != 0))) {
        break lexical_join_32;
    }
    spill1681_2 = __call1681_9(__cast1681_8(life7_18));
    if (!((life4_7 == null))) {
        lexicalValue1681_36_0 = __integerCategory1681_10(spill1681_2);
        break lexical_join_36;
    }
    if (!((!spill1681_2))) {
        break lexical_join_38;
    }
    }
    lexicalValue1681_36_0 = __integerCategory1681_13(__call1681_12(p0, __call1681_11(life7_18)));
    }
    if (!((lexicalValue1681_36_0 != 0))) {
        break lexical_join_38;
    }
    life5_6 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1681_41_0 = life5_6;
    }
    return lexicalValue1681_41_0;
}
public static void h1681_0(moom.Oo p0) throws Throwable {
    throw __call1168100_0(p0);
}
public static void h1681_1(moom.Oo p0) throws Throwable {
    throw __call1168101_0(p0);
}
public static void h1681_2(moom.Oo p0) throws Throwable {
    throw __call1168102_0(p0);
}
public static void h1681_3(moom.Oo p0) throws Throwable {
    throw __call1168103_0(p0);
}
public static void h1681_4(moom.Oo p0) throws Throwable {
    throw __call1168104_0(p0);
}
private static native long __fieldRead1681_0() throws Throwable;
private static native java.lang.String __call1681_1() throws Throwable;
private static native java.util.List __fieldRead1681_2(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call1681_3(java.util.List a0) throws Throwable;
private static native boolean __call1681_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1681_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast1681_6(java.lang.Object a0) throws Throwable;
private static native int __instanceOf1681_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLiving __cast1681_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1681_9(net.minecraft.entity.EntityLiving a0) throws Throwable;
private static native int __integerCategory1681_10(boolean value) throws Throwable;
private static native java.lang.Class __call1681_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1681_12(java.lang.Class a0, java.lang.Class a1) throws Throwable;
private static native int __integerCategory1681_13(boolean value) throws Throwable;
private static native java.lang.Throwable __call1168100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1168101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1168102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1168103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1168104_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_6705026899a9d3fa7ea6(net.minecraft.world.World a0, java.lang.Class a1, com.google.common.base.Predicate a2) throws E;
private static final class __SourceHandler_6705026899a9d3fa7ea6 {

public static java.util.List f275(net.minecraft.world.World receiver, java.lang.Class p0, com.google.common.base.Predicate p1) throws Throwable {
    int lexicalValue275_29_0;
    int lexicalValue275_35_0;
    java.lang.String spill275_0;
    boolean spill275_1;
    long life3_3;
    java.util.ArrayList life6_6;
    java.util.Iterator life7_10;
    java.lang.String life5_11;
    net.minecraft.entity.Entity life8_18;
    lexical_join_38: {
    life3_3 = (__fieldRead275_0() ^ 11182739264339L);
    spill275_0 = __call275_1();
    life6_6 = __call275_2();
    life7_10 = __call275_4(__fieldRead275_3(receiver));
    life5_11 = spill275_0;
    lexical_cycle_12: while (true) {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_29: {
    if (!(__call275_5(life7_10))) {
        break lexical_join_38;
    }
    life8_18 = __cast275_7(__call275_6(life7_10));
    spill275_1 = __call275_9(p0, __call275_8(life8_18));
    if (!((life5_11 == null))) {
        lexicalValue275_29_0 = __integerCategory275_10(spill275_1);
        break lexical_join_29;
    }
    if (!(spill275_1)) {
        break lexical_join_36;
    }
    lexicalValue275_29_0 = __integerCategory275_12(__call275_11(p1, life8_18));
    }
    if (!((life5_11 == null))) {
        lexicalValue275_35_0 = lexicalValue275_29_0;
        break lexical_join_35;
    }
    if (!((lexicalValue275_29_0 != 0))) {
        break lexical_join_36;
    }
    lexicalValue275_35_0 = __integerCategory275_14(__call275_13(life6_6, life8_18));
    }
    __discardScalar275_15(lexicalValue275_35_0);
    }
    if (!((life5_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life6_6;
}
public static void h275_0(moom.Oo p0) throws Throwable {
    throw __call1027500_0(p0);
}
public static void h275_1(moom.Oo p0) throws Throwable {
    throw __call1027501_0(p0);
}
public static void h275_2(moom.Oo p0) throws Throwable {
    throw __call1027502_0(p0);
}
public static void h275_3(moom.Oo p0) throws Throwable {
    throw __call1027503_0(p0);
}
private static native long __fieldRead275_0() throws Throwable;
private static native java.lang.String __call275_1() throws Throwable;
private static native java.util.ArrayList __call275_2() throws Throwable;
private static native java.util.List __fieldRead275_3(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call275_4(java.util.List a0) throws Throwable;
private static native boolean __call275_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call275_6(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast275_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __call275_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call275_9(java.lang.Class a0, java.lang.Class a1) throws Throwable;
private static native int __integerCategory275_10(boolean value) throws Throwable;
private static native boolean __call275_11(com.google.common.base.Predicate a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory275_12(boolean value) throws Throwable;
private static native boolean __call275_13(java.util.ArrayList a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory275_14(boolean value) throws Throwable;
private static native void __discardScalar275_15(int a0) throws Throwable;
private static native java.lang.Throwable __call1027500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027503_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_f45ebdd440c0afb61104(net.minecraft.world.World a0, java.lang.Class a1, moom.CA a2, com.google.common.base.Predicate a3) throws E;
private static final class __SourceHandler_f45ebdd440c0afb61104 {

public static java.util.List f1151(net.minecraft.world.World receiver, java.lang.Class p0, moom.CA p1, com.google.common.base.Predicate p2) throws Throwable {
    int forestValue1151_43_0;
    net.minecraft.world.World forestValue1151_63_0;
    int forestValue1151_63_1;
    int forestValue1151_63_2;
    java.lang.String spill1151_0;
    net.minecraft.world.World spill1151_1;
    int spill1151_2;
    int spill1151_3;
    boolean spill1151_4;
    long life4_3;
    int life7_11;
    int life8_20;
    java.lang.String life6_21;
    int life9_29;
    int life10_37;
    java.util.ArrayList life11_39;
    int life12_41;
    int life13_46;
    forest_join_75: {
    life4_3 = (__fieldRead1151_0() ^ 60825979490259L);
    life7_11 = __call1151_2(((__fieldRead1151_1(p1) - 0x1.0p1d) / 0x1.0p4d));
    spill1151_0 = __call1151_3();
    life8_20 = __call1151_5(((__fieldRead1151_4(p1) + 0x1.0p1d) / 0x1.0p4d));
    life6_21 = spill1151_0;
    life9_29 = __call1151_7(((__fieldRead1151_6(p1) - 0x1.0p1d) / 0x1.0p4d));
    life10_37 = __call1151_9(((__fieldRead1151_8(p1) + 0x1.0p1d) / 0x1.0p4d));
    life11_39 = __call1151_10();
    life12_41 = life7_11;
    forest_cycle_42: while (true) {
    forest_join_72: {
    forestValue1151_43_0 = life12_41;
    forest_cycle_43: while (true) {
    if (!((forestValue1151_43_0 <= life8_20))) {
        break forest_join_75;
    }
    life13_46 = life9_29;
    forest_cycle_47: while (true) {
    forest_join_69: {
    forest_join_63: {
    if (!((life13_46 <= life10_37))) {
        break forest_join_72;
    }
    spill1151_1 = receiver;
    spill1151_2 = life12_41;
    spill1151_3 = life13_46;
    if (!((life6_21 == null))) {
        forestValue1151_63_0 = spill1151_1;
        forestValue1151_63_1 = spill1151_2;
        forestValue1151_63_2 = spill1151_3;
        break forest_join_63;
    }
    spill1151_4 = __call1151_11(spill1151_1, spill1151_2, spill1151_3, 1);
    if (!((life6_21 == null))) {
        forestValue1151_43_0 = __integerCategory1151_12(spill1151_4);
        continue forest_cycle_43;
    }
    if (!(spill1151_4)) {
        break forest_join_69;
    }
    forestValue1151_63_0 = receiver;
    forestValue1151_63_1 = life12_41;
    forestValue1151_63_2 = life13_46;
    }
    __call1151_14(__call1151_13(forestValue1151_63_0, forestValue1151_63_1, forestValue1151_63_2), p0, p1, life11_39, p2);
    }
    life13_46 += 1;
    if (!((life6_21 != null))) {
        continue forest_cycle_47;
    }
    break forest_cycle_47;
    }
    break forest_cycle_43;
    }
    }
    life12_41 += 1;
    if (!((life6_21 != null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    }
    return life11_39;
}
public static java.util.List h1151_0(moom.Oo p0) throws Throwable {
    throw __call3115100_0(p0);
}
public static java.util.List h1151_1(moom.Oo p0) throws Throwable {
    throw __call3115101_0(p0);
}
private static native long __fieldRead1151_0() throws Throwable;
private static native double __fieldRead1151_1(moom.CA a0) throws Throwable;
private static native int __call1151_2(double a0) throws Throwable;
private static native java.lang.String __call1151_3() throws Throwable;
private static native double __fieldRead1151_4(moom.CA a0) throws Throwable;
private static native int __call1151_5(double a0) throws Throwable;
private static native double __fieldRead1151_6(moom.CA a0) throws Throwable;
private static native int __call1151_7(double a0) throws Throwable;
private static native double __fieldRead1151_8(moom.CA a0) throws Throwable;
private static native int __call1151_9(double a0) throws Throwable;
private static native java.util.ArrayList __call1151_10() throws Throwable;
private static native boolean __call1151_11(net.minecraft.world.World a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory1151_12(boolean value) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1151_13(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native void __call1151_14(net.minecraft.world.chunk.Chunk a0, java.lang.Class a1, moom.CA a2, java.util.ArrayList a3, com.google.common.base.Predicate a4) throws Throwable;
private static native java.lang.Throwable __call3115100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.Entity __sourceHandlerCall_76811d391db1b3d7f4bc(net.minecraft.world.World a0, java.lang.Class a1, moom.CA a2, net.minecraft.entity.Entity a3) throws E;
private static final class __SourceHandler_76811d391db1b3d7f4bc {

public static net.minecraft.entity.Entity f1684(net.minecraft.world.World receiver, java.lang.Class p0, moom.CA p1, net.minecraft.entity.Entity p2) throws Throwable {
    double lexicalValue1684_47_0;
    net.minecraft.entity.Entity lexicalValue1684_51_0;
    java.lang.String spill1684_0;
    net.minecraft.entity.Entity spill1684_1;
    double spill1684_2;
    long life4_3;
    java.util.List life7_9;
    net.minecraft.entity.Entity life8_11;
    double life9_13;
    java.util.Iterator life11_16;
    java.lang.String life6_17;
    net.minecraft.entity.Entity life12_24;
    double life13_43;
    lexical_join_51: {
    lexical_join_50: {
    life4_3 = (__fieldRead1684_0() ^ 49629127507723L);
    spill1684_0 = __call1684_1();
    life7_9 = __call1684_2(receiver, p0, p1);
    life8_11 = null;
    life9_13 = 0x1.fffffffffffffp1023d;
    life11_16 = __call1684_3(life7_9);
    life6_17 = spill1684_0;
    lexical_cycle_18: while (true) {
    lexical_join_48: {
    lexical_join_47: {
    if (!(__call1684_4(life11_16))) {
        break lexical_join_50;
    }
    life12_24 = __cast1684_6(__call1684_5(life11_16));
    spill1684_1 = life12_24;
    if (!((life6_17 == null))) {
        lexicalValue1684_51_0 = spill1684_1;
        break lexical_join_51;
    }
    if (!((spill1684_1 != p2))) {
        break lexical_join_48;
    }
    if (!(__call1684_8(__fieldRead1684_7(), life12_24))) {
        break lexical_join_48;
    }
    life13_43 = __call1684_9(p2, life12_24);
    spill1684_2 = life13_43;
    if (!((life6_17 == null))) {
        lexicalValue1684_47_0 = spill1684_2;
        break lexical_join_47;
    }
    if (!((__numericCompare1684_10(spill1684_2, life9_13) <= 0))) {
        break lexical_join_48;
    }
    life8_11 = life12_24;
    lexicalValue1684_47_0 = life13_43;
    }
    life9_13 = lexicalValue1684_47_0;
    }
    if (!((life6_17 != null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue1684_51_0 = life8_11;
    }
    return lexicalValue1684_51_0;
}
public static void h1684_0(moom.Oo p0) throws Throwable {
    throw __call1168400_0(p0);
}
public static void h1684_1(moom.Oo p0) throws Throwable {
    throw __call1168401_0(p0);
}
public static void h1684_2(moom.Oo p0) throws Throwable {
    throw __call1168402_0(p0);
}
private static native long __fieldRead1684_0() throws Throwable;
private static native java.lang.String __call1684_1() throws Throwable;
private static native java.util.List __call1684_2(net.minecraft.world.World a0, java.lang.Class a1, moom.CA a2) throws Throwable;
private static native java.util.Iterator __call1684_3(java.util.List a0) throws Throwable;
private static native boolean __call1684_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1684_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast1684_6(java.lang.Object a0) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead1684_7() throws Throwable;
private static native boolean __call1684_8(com.google.common.base.Predicate a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native double __call1684_9(net.minecraft.entity.Entity a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __numericCompare1684_10(double a0, double a1) throws Throwable;
private static native java.lang.Throwable __call1168400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1168401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1168402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6ce2e1a16bfd8fe10c8a(net.minecraft.world.World a0, java.util.Collection a1) throws E;
private static final class __SourceHandler_6ce2e1a16bfd8fe10c8a {

public static void f276(net.minecraft.world.World receiver, java.util.Collection p0) throws Throwable {
    int lexicalValue276_15_0;
    int lexicalValue276_42_0;
    boolean spill276_0;
    int spill276_1;
    long life2_3;
    java.lang.String life4_5;
    java.util.Iterator life5_26;
    net.minecraft.tileentity.TileEntity life6_33;
    lexical_join_45: {
    lexical_join_18: {
    lexical_join_15: {
    life2_3 = (__fieldRead276_0() ^ 116689691720735L);
    life4_5 = __call276_1();
    spill276_0 = __fieldRead276_2(receiver);
    if (!((life4_5 == null))) {
        lexicalValue276_15_0 = __integerCategory276_3(spill276_0);
        break lexical_join_15;
    }
    if (!(spill276_0)) {
        break lexical_join_18;
    }
    lexicalValue276_15_0 = __integerCategory276_6(__call276_5(__fieldRead276_4(receiver), p0));
    }
    __discardScalar276_7(lexicalValue276_15_0);
    if (!((life4_5 != null))) {
        break lexical_join_45;
    }
    }
    life5_26 = __call276_8(p0);
    lexical_cycle_21: while (true) {
    lexical_join_43: {
    lexical_join_42: {
    if (!(__call276_9(life5_26))) {
        break lexical_join_45;
    }
    life6_33 = __cast276_11(__call276_10(life5_26));
    __call276_13(__fieldRead276_12(receiver), life6_33);
    spill276_1 = __instanceOf276_14(life6_33);
    if (!((life4_5 == null))) {
        lexicalValue276_42_0 = spill276_1;
        break lexical_join_42;
    }
    if (!((spill276_1 != 0))) {
        break lexical_join_43;
    }
    lexicalValue276_42_0 = __integerCategory276_17(__call276_16(__fieldRead276_15(receiver), life6_33));
    }
    __discardScalar276_18(lexicalValue276_42_0);
    }
    if (!((life4_5 != null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    return;
}
public static void h276_0(moom.Oo p0) throws Throwable {
    throw __call1027600_0(p0);
}
public static void h276_1(moom.Oo p0) throws Throwable {
    throw __call1027601_0(p0);
}
public static void h276_2(moom.Oo p0) throws Throwable {
    throw __call1027602_0(p0);
}
public static void h276_3(moom.Oo p0) throws Throwable {
    throw __call1027603_0(p0);
}
private static native long __fieldRead276_0() throws Throwable;
private static native java.lang.String __call276_1() throws Throwable;
private static native boolean __fieldRead276_2(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory276_3(boolean value) throws Throwable;
private static native java.util.List __fieldRead276_4(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call276_5(java.util.List a0, java.util.Collection a1) throws Throwable;
private static native int __integerCategory276_6(boolean value) throws Throwable;
private static native void __discardScalar276_7(int a0) throws Throwable;
private static native java.util.Iterator __call276_8(java.util.Collection a0) throws Throwable;
private static native boolean __call276_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call276_10(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast276_11(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead276_12(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call276_13(java.util.List a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native int __instanceOf276_14(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.util.List __fieldRead276_15(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call276_16(java.util.List a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native int __integerCategory276_17(boolean value) throws Throwable;
private static native void __discardScalar276_18(int a0) throws Throwable;
private static native java.lang.Throwable __call1027600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027603_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.player.EntityPlayer __sourceHandlerCall_ad4805aba2f8ddef82a0(net.minecraft.world.World a0, java.util.UUID a1) throws E;
private static final class __SourceHandler_ad4805aba2f8ddef82a0 {

public static net.minecraft.entity.player.EntityPlayer f1686(net.minecraft.world.World receiver, java.util.UUID p0) throws Throwable {
    java.lang.String spill1686_0;
    long life2_3;
    java.util.Iterator life5_8;
    java.lang.String life4_9;
    net.minecraft.entity.player.EntityPlayer life6_16;
    lexical_join_26: {
    life2_3 = (__fieldRead1686_0() ^ 54585098441164L);
    spill1686_0 = __call1686_1();
    life5_8 = __call1686_3(__fieldRead1686_2(receiver));
    life4_9 = spill1686_0;
    lexical_cycle_10: while (true) {
    lexical_join_24: {
    if (!(__call1686_4(life5_8))) {
        break lexical_join_26;
    }
    life6_16 = __cast1686_6(__call1686_5(life5_8));
    if (!(__call1686_8(p0, __call1686_7(life6_16)))) {
        break lexical_join_24;
    }
    return life6_16;
    }
    if (!((life4_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return null;
}
public static void h1686_0(moom.Oo p0) throws Throwable {
    throw __call1168600_0(p0);
}
private static native long __fieldRead1686_0() throws Throwable;
private static native java.lang.String __call1686_1() throws Throwable;
private static native java.util.List __fieldRead1686_2(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call1686_3(java.util.List a0) throws Throwable;
private static native boolean __call1686_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1686_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1686_6(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call1686_7(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native boolean __call1686_8(java.util.UUID a0, java.util.UUID a1) throws Throwable;
private static native java.lang.Throwable __call1168600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_465e708a5c83030e633d(net.minecraft.world.World a0, moom.CA a1) throws E;
private static final class __SourceHandler_465e708a5c83030e633d {

public static java.util.List f1149(net.minecraft.world.World receiver, moom.CA p0) throws Throwable {
    int forestValue1149_45_0;
    int forestValue1149_51_0;
    int forestValue1149_51_1;
    int forestValue1149_71_0;
    int forestValue1149_98_0;
    int forestValue1149_98_1;
    int forestValue1149_107_0;
    int forestValue1149_107_1;
    int forestValue1149_116_0;
    int forestValue1149_116_1;
    java.lang.String spill1149_0;
    boolean spill1149_1;
    int spill1149_2;
    int spill1149_3;
    long life2_3;
    java.util.ArrayList life5_5;
    int life6_9;
    int life7_15;
    int life8_20;
    int life9_26;
    int life10_30;
    int life11_36;
    moom.DU life12_40;
    int life13_42;
    java.lang.String life4_43;
    int life14_48;
    int life15_73;
    net.minecraft.block.state.IBlockState life16_128;
    forest_join_144: {
    life2_3 = (__fieldRead1149_0() ^ 77802487876504L);
    life5_5 = __call1149_1();
    life6_9 = __call1149_3(__fieldRead1149_2(p0));
    life7_15 = __call1149_5((__fieldRead1149_4(p0) + 0x1.0p0d));
    spill1149_0 = __call1149_6();
    life8_20 = __call1149_8(__fieldRead1149_7(p0));
    life9_26 = __call1149_10((__fieldRead1149_9(p0) + 0x1.0p0d));
    life10_30 = __call1149_12(__fieldRead1149_11(p0));
    life11_36 = __call1149_14((__fieldRead1149_13(p0) + 0x1.0p0d));
    life12_40 = new moom.DU();
    life13_42 = life6_9;
    life4_43 = spill1149_0;
    forest_cycle_44: while (true) {
    forest_join_141: {
    forestValue1149_45_0 = life13_42;
    forest_cycle_45: while (true) {
    if (!((forestValue1149_45_0 < life7_15))) {
        break forest_join_144;
    }
    life14_48 = life10_30;
    forest_cycle_49: while (true) {
    forest_join_138: {
    forestValue1149_51_0 = life14_48;
    forestValue1149_51_1 = life11_36;
    forest_cycle_51: while (true) {
    forest_join_71: {
    if (!((forestValue1149_51_0 < forestValue1149_51_1))) {
        break forest_join_141;
    }
    spill1149_1 = __call1149_17(receiver, __call1149_16(life12_40, life13_42, __invokedynamic1149_15(21205, (7333329897649709421L ^ life2_3)), life14_48));
    if (!((life4_43 == null))) {
        forestValue1149_45_0 = __integerCategory1149_18(spill1149_1);
        continue forest_cycle_45;
    }
    if (!((life4_43 == null))) {
        forestValue1149_71_0 = __integerCategory1149_19(spill1149_1);
        break forest_join_71;
    }
    if (!(spill1149_1)) {
        break forest_join_138;
    }
    forestValue1149_71_0 = (life8_20 - 1);
    }
    life15_73 = forestValue1149_71_0;
    forest_cycle_72: while (true) {
    forest_join_126: {
    forest_join_123: {
    forest_join_116: {
    forest_join_107: {
    forest_join_98: {
    if (!((life15_73 < life9_26))) {
        break forest_join_138;
    }
    __call1149_20(life12_40, life13_42, life15_73, life14_48);
    spill1149_2 = life13_42;
    spill1149_3 = __invokedynamic1149_21(20188, (2672978674721701215L ^ life2_3));
    if (!((life4_43 == null))) {
        forestValue1149_51_0 = spill1149_2;
        forestValue1149_51_1 = spill1149_3;
        continue forest_cycle_51;
    }
    if (!((life4_43 == null))) {
        forestValue1149_98_0 = spill1149_2;
        forestValue1149_98_1 = spill1149_3;
        break forest_join_98;
    }
    if (!((spill1149_2 >= spill1149_3))) {
        break forest_join_123;
    }
    forestValue1149_98_0 = life13_42;
    forestValue1149_98_1 = __invokedynamic1149_22(14058, (675719619605546336L ^ life2_3));
    }
    if (!((life4_43 == null))) {
        forestValue1149_107_0 = forestValue1149_98_0;
        forestValue1149_107_1 = forestValue1149_98_1;
        break forest_join_107;
    }
    if (!((forestValue1149_98_0 < forestValue1149_98_1))) {
        break forest_join_123;
    }
    forestValue1149_107_0 = life14_48;
    forestValue1149_107_1 = __invokedynamic1149_23(20188, (2672978674721701215L ^ life2_3));
    }
    if (!((life4_43 == null))) {
        forestValue1149_116_0 = forestValue1149_107_0;
        forestValue1149_116_1 = forestValue1149_107_1;
        break forest_join_116;
    }
    if (!((forestValue1149_107_0 >= forestValue1149_107_1))) {
        break forest_join_123;
    }
    forestValue1149_116_0 = life14_48;
    forestValue1149_116_1 = __invokedynamic1149_24(14058, (675719619605546336L ^ life2_3));
    }
    if (!((forestValue1149_116_0 < forestValue1149_116_1))) {
        break forest_join_123;
    }
    life16_128 = __call1149_25(receiver, life12_40);
    if (!((life4_43 != null))) {
        break forest_join_126;
    }
    }
    life16_128 = __call1149_27(__fieldRead1149_26());
    }
    __call1149_29(__call1149_28(life16_128), receiver, life12_40, life16_128, p0, life5_5, null);
    life15_73 += 1;
    if (!((life4_43 != null))) {
        continue forest_cycle_72;
    }
    break forest_cycle_72;
    }
    break forest_cycle_51;
    }
    }
    life14_48 += 1;
    if (!((life4_43 != null))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    break forest_cycle_45;
    }
    }
    life13_42 += 1;
    if (!((life4_43 != null))) {
        continue forest_cycle_44;
    }
    break forest_cycle_44;
    }
    }
    return life5_5;
}
public static java.util.List h1149_0(moom.Oo p0) throws Throwable {
    throw __call3114900_0(p0);
}
public static java.util.List h1149_1(moom.Oo p0) throws Throwable {
    throw __call3114901_0(p0);
}
public static java.util.List h1149_2(moom.Oo p0) throws Throwable {
    throw __call3114902_0(p0);
}
public static java.util.List h1149_3(moom.Oo p0) throws Throwable {
    throw __call3114903_0(p0);
}
public static java.util.List h1149_4(moom.Oo p0) throws Throwable {
    throw __call3114904_0(p0);
}
public static java.util.List h1149_5(moom.Oo p0) throws Throwable {
    throw __call3114905_0(p0);
}
public static java.util.List h1149_6(moom.Oo p0) throws Throwable {
    throw __call3114906_0(p0);
}
public static java.util.List h1149_7(moom.Oo p0) throws Throwable {
    throw __call3114907_0(p0);
}
private static native long __fieldRead1149_0() throws Throwable;
private static native java.util.ArrayList __call1149_1() throws Throwable;
private static native double __fieldRead1149_2(moom.CA a0) throws Throwable;
private static native int __call1149_3(double a0) throws Throwable;
private static native double __fieldRead1149_4(moom.CA a0) throws Throwable;
private static native int __call1149_5(double a0) throws Throwable;
private static native java.lang.String __call1149_6() throws Throwable;
private static native double __fieldRead1149_7(moom.CA a0) throws Throwable;
private static native int __call1149_8(double a0) throws Throwable;
private static native double __fieldRead1149_9(moom.CA a0) throws Throwable;
private static native int __call1149_10(double a0) throws Throwable;
private static native double __fieldRead1149_11(moom.CA a0) throws Throwable;
private static native int __call1149_12(double a0) throws Throwable;
private static native double __fieldRead1149_13(moom.CA a0) throws Throwable;
private static native int __call1149_14(double a0) throws Throwable;
private static native int __invokedynamic1149_15(int a0, long a1) throws Throwable;
private static native moom.DU __call1149_16(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native boolean __call1149_17(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native int __integerCategory1149_18(boolean value) throws Throwable;
private static native int __integerCategory1149_19(boolean value) throws Throwable;
private static native moom.DU __call1149_20(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic1149_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic1149_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic1149_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic1149_24(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1149_25(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead1149_26() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1149_27(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __call1149_28(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call1149_29(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DU a2, net.minecraft.block.state.IBlockState a3, moom.CA a4, java.util.ArrayList a5, java.lang.Object a6) throws Throwable;
private static native java.lang.Throwable __call3114900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114907_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_fd409d3e448bc8c5c322(net.minecraft.world.World a0, moom.CA a1, moom.fn a2) throws E;
private static final class __SourceHandler_fd409d3e448bc8c5c322 {

public static boolean f1155(net.minecraft.world.World receiver, moom.CA p0, moom.fn p1) throws Throwable {
    int forestValue1155_43_0;
    int forestValue1155_86_0;
    java.lang.String spill1155_0;
    int spill1155_1;
    int spill1155_2;
    long life3_3;
    int life6_7;
    int life7_14;
    java.lang.String life5_15;
    int life8_19;
    int life9_25;
    int life10_29;
    int life11_35;
    moom.DU life12_39;
    int life13_41;
    int life14_48;
    int life15_55;
    forest_join_86: {
    forest_join_85: {
    forest_join_83: {
    life3_3 = (__fieldRead1155_0() ^ 70843478628581L);
    life6_7 = __call1155_2(__fieldRead1155_1(p0));
    spill1155_0 = __call1155_3();
    life7_14 = __call1155_5((__fieldRead1155_4(p0) + 0x1.0p0d));
    life5_15 = spill1155_0;
    life8_19 = __call1155_7(__fieldRead1155_6(p0));
    life9_25 = __call1155_9((__fieldRead1155_8(p0) + 0x1.0p0d));
    life10_29 = __call1155_11(__fieldRead1155_10(p0));
    life11_35 = __call1155_13((__fieldRead1155_12(p0) + 0x1.0p0d));
    life12_39 = new moom.DU();
    life13_41 = life6_7;
    forest_cycle_42: while (true) {
    forest_join_79: {
    forestValue1155_43_0 = life13_41;
    forest_cycle_43: while (true) {
    if (!((forestValue1155_43_0 < life7_14))) {
        break forest_join_85;
    }
    spill1155_1 = life8_19;
    if (!((life5_15 == null))) {
        forestValue1155_86_0 = spill1155_1;
        break forest_join_86;
    }
    life14_48 = spill1155_1;
    forest_cycle_49: while (true) {
    forest_join_77: {
    forest_join_76: {
    if (!((life14_48 < life9_25))) {
        break forest_join_79;
    }
    spill1155_2 = life10_29;
    if (!((life5_15 == null))) {
        forestValue1155_43_0 = spill1155_2;
        continue forest_cycle_43;
    }
    life15_55 = spill1155_2;
    forest_cycle_56: while (true) {
    forest_join_73: {
    if (!((life15_55 < life11_35))) {
        break forest_join_76;
    }
    if (!((life5_15 == null))) {
        break forest_join_77;
    }
    if (!((__call1155_17(__call1155_16(__call1155_15(receiver, __call1155_14(life12_39, life13_41, life14_48, life15_55)))) == p1))) {
        break forest_join_73;
    }
    break forest_join_83;
    }
    life15_55 += 1;
    if (!((life5_15 != null))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    }
    life14_48 += 1;
    }
    if (!((life5_15 != null))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    break forest_cycle_43;
    }
    }
    life13_41 += 1;
    if (!((life5_15 != null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_join_85;
    }
    return __integerCategory1155_18(1);
    }
    forestValue1155_86_0 = 0;
    }
    return __integerCategory1155_19(forestValue1155_86_0);
}
public static boolean h1155_0(moom.Oo p0) throws Throwable {
    throw __call3115500_0(p0);
}
public static boolean h1155_1(moom.Oo p0) throws Throwable {
    throw __call3115501_0(p0);
}
private static native long __fieldRead1155_0() throws Throwable;
private static native double __fieldRead1155_1(moom.CA a0) throws Throwable;
private static native int __call1155_2(double a0) throws Throwable;
private static native java.lang.String __call1155_3() throws Throwable;
private static native double __fieldRead1155_4(moom.CA a0) throws Throwable;
private static native int __call1155_5(double a0) throws Throwable;
private static native double __fieldRead1155_6(moom.CA a0) throws Throwable;
private static native int __call1155_7(double a0) throws Throwable;
private static native double __fieldRead1155_8(moom.CA a0) throws Throwable;
private static native int __call1155_9(double a0) throws Throwable;
private static native double __fieldRead1155_10(moom.CA a0) throws Throwable;
private static native int __call1155_11(double a0) throws Throwable;
private static native double __fieldRead1155_12(moom.CA a0) throws Throwable;
private static native int __call1155_13(double a0) throws Throwable;
private static native moom.DU __call1155_14(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1155_15(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native net.minecraft.block.Block __call1155_16(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call1155_17(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __integerCategory1155_18(int value) throws Throwable;
private static native boolean __integerCategory1155_19(int value) throws Throwable;
private static native java.lang.Throwable __call3115500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7a55ec8e87a64b4026db(net.minecraft.world.World a0, moom.CA a1, moom.fn a2, net.minecraft.entity.Entity a3) throws E;
private static final class __SourceHandler_7a55ec8e87a64b4026db {

public static boolean f1154(net.minecraft.world.World receiver, moom.CA p0, moom.fn p1, net.minecraft.entity.Entity p2) throws Throwable {
    int forestValue1154_51_0;
    int forestValue1154_66_0;
    int forestValue1154_145_0;
    int forestValue1154_186_0;
    java.lang.String spill1154_0;
    boolean spill1154_1;
    int spill1154_2;
    int spill1154_3;
    boolean spill1154_4;
    long life4_3;
    int life7_8;
    java.lang.String life6_9;
    int life8_15;
    int life9_19;
    int life10_25;
    int life11_29;
    int life12_35;
    int life13_52;
    moom.DR life14_59;
    moom.DU life15_63;
    int life16_65;
    int life17_72;
    int life18_79;
    net.minecraft.block.state.IBlockState life19_92;
    net.minecraft.block.Block life20_95;
    double life21_118;
    moom.DR life14_162;
    double life16_164;
    forest_join_186: {
    forest_join_185: {
    forest_join_145: {
    forest_join_141: {
    forest_join_51: {
    forest_join_50: {
    life4_3 = (__fieldRead1154_0() ^ 105501737919366L);
    spill1154_0 = __call1154_1();
    life7_8 = __call1154_3(__fieldRead1154_2(p0));
    life6_9 = spill1154_0;
    life8_15 = __call1154_5((__fieldRead1154_4(p0) + 0x1.0p0d));
    life9_19 = __call1154_7(__fieldRead1154_6(p0));
    life10_25 = __call1154_9((__fieldRead1154_8(p0) + 0x1.0p0d));
    life11_29 = __call1154_11(__fieldRead1154_10(p0));
    life12_35 = __call1154_13((__fieldRead1154_12(p0) + 0x1.0p0d));
    spill1154_1 = __call1154_14(receiver, life7_8, life9_19, life11_29, life8_15, life10_25, life12_35, 1);
    if (!((life6_9 == null))) {
        forestValue1154_51_0 = __integerCategory1154_15(spill1154_1);
        break forest_join_51;
    }
    if (!((!spill1154_1))) {
        break forest_join_50;
    }
    return __integerCategory1154_16(0);
    }
    forestValue1154_51_0 = 0;
    }
    life13_52 = forestValue1154_51_0;
    life14_59 = new moom.DR(0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
    life15_63 = new moom.DU();
    life16_65 = life7_8;
    forest_cycle_65: while (true) {
    forest_join_138: {
    forestValue1154_66_0 = life16_65;
    forest_cycle_66: while (true) {
    if (!((forestValue1154_66_0 < life8_15))) {
        break forest_join_141;
    }
    spill1154_2 = life9_19;
    if (!((life6_9 == null))) {
        forestValue1154_145_0 = spill1154_2;
        break forest_join_145;
    }
    life17_72 = spill1154_2;
    forest_cycle_72: while (true) {
    forest_join_136: {
    forest_join_135: {
    if (!((life17_72 < life10_25))) {
        break forest_join_138;
    }
    spill1154_3 = life11_29;
    if (!((life6_9 == null))) {
        forestValue1154_66_0 = spill1154_3;
        continue forest_cycle_66;
    }
    life18_79 = spill1154_3;
    forest_cycle_79: while (true) {
    forest_join_133: {
    forest_join_132: {
    if (!((life18_79 < life12_35))) {
        break forest_join_135;
    }
    __call1154_17(life15_63, life16_65, life17_72, life18_79);
    life19_92 = __call1154_18(receiver, life15_63);
    life20_95 = __call1154_19(life19_92);
    if (!((life6_9 == null))) {
        break forest_join_136;
    }
    if (!((life6_9 == null))) {
        break forest_join_133;
    }
    if (!((__call1154_20(life20_95) == p1))) {
        break forest_join_132;
    }
    life21_118 = ((double) (((float) (life17_72 + 1)) - __call1154_25(__call1154_24(__cast1154_23(__call1154_22(life19_92, __fieldRead1154_21()))))));
    if (!((life6_9 == null))) {
        break forest_join_133;
    }
    if (!((__numericCompare1154_26(((double) life10_25), life21_118) >= 0))) {
        break forest_join_132;
    }
    life13_52 = 1;
    life14_59 = __call1154_27(life20_95, receiver, life15_63, p2, life14_59);
    }
    life18_79 += 1;
    }
    if (!((life6_9 != null))) {
        continue forest_cycle_79;
    }
    break forest_cycle_79;
    }
    }
    life17_72 += 1;
    }
    if (!((life6_9 != null))) {
        continue forest_cycle_72;
    }
    break forest_cycle_72;
    }
    break forest_cycle_66;
    }
    }
    life16_65 += 1;
    if (!((life6_9 != null))) {
        continue forest_cycle_65;
    }
    break forest_cycle_65;
    }
    }
    forestValue1154_145_0 = __numericCompare1154_29(__call1154_28(life14_59), 0x0.0p0d);
    }
    if (!((life6_9 == null))) {
        forestValue1154_186_0 = forestValue1154_145_0;
        break forest_join_186;
    }
    if (!((forestValue1154_145_0 > 0))) {
        break forest_join_185;
    }
    spill1154_4 = __call1154_30(p2);
    if (!((life6_9 == null))) {
        forestValue1154_186_0 = __integerCategory1154_31(spill1154_4);
        break forest_join_186;
    }
    if (!(spill1154_4)) {
        break forest_join_185;
    }
    life14_162 = __call1154_32(life14_59);
    life16_164 = 0x1.cac083126e979p-7d;
    net.minecraft.entity.Entity __stackOp1154_33_0 = p2;
    __fieldWrite1154_36(__stackOp1154_33_0, (__fieldRead1154_34(__stackOp1154_33_0) + (__fieldRead1154_35(life14_162) * life16_164)));
    net.minecraft.entity.Entity __stackOp1154_37_0 = p2;
    __fieldWrite1154_40(__stackOp1154_37_0, (__fieldRead1154_38(__stackOp1154_37_0) + (__fieldRead1154_39(life14_162) * life16_164)));
    net.minecraft.entity.Entity __stackOp1154_41_0 = p2;
    __fieldWrite1154_44(__stackOp1154_41_0, (__fieldRead1154_42(__stackOp1154_41_0) + (__fieldRead1154_43(life14_162) * life16_164)));
    }
    forestValue1154_186_0 = life13_52;
    }
    return __integerCategory1154_45(forestValue1154_186_0);
}
public static boolean h1154_0(moom.Oo p0) throws Throwable {
    throw __call3115400_0(p0);
}
public static boolean h1154_1(moom.Oo p0) throws Throwable {
    throw __call3115401_0(p0);
}
public static boolean h1154_2(moom.Oo p0) throws Throwable {
    throw __call3115402_0(p0);
}
public static boolean h1154_3(moom.Oo p0) throws Throwable {
    throw __call3115403_0(p0);
}
public static boolean h1154_4(moom.Oo p0) throws Throwable {
    throw __call3115404_0(p0);
}
public static boolean h1154_5(moom.Oo p0) throws Throwable {
    throw __call3115405_0(p0);
}
public static boolean h1154_6(moom.Oo p0) throws Throwable {
    throw __call3115406_0(p0);
}
public static boolean h1154_7(moom.Oo p0) throws Throwable {
    throw __call3115407_0(p0);
}
private static native long __fieldRead1154_0() throws Throwable;
private static native java.lang.String __call1154_1() throws Throwable;
private static native double __fieldRead1154_2(moom.CA a0) throws Throwable;
private static native int __call1154_3(double a0) throws Throwable;
private static native double __fieldRead1154_4(moom.CA a0) throws Throwable;
private static native int __call1154_5(double a0) throws Throwable;
private static native double __fieldRead1154_6(moom.CA a0) throws Throwable;
private static native int __call1154_7(double a0) throws Throwable;
private static native double __fieldRead1154_8(moom.CA a0) throws Throwable;
private static native int __call1154_9(double a0) throws Throwable;
private static native double __fieldRead1154_10(moom.CA a0) throws Throwable;
private static native int __call1154_11(double a0) throws Throwable;
private static native double __fieldRead1154_12(moom.CA a0) throws Throwable;
private static native int __call1154_13(double a0) throws Throwable;
private static native boolean __call1154_14(net.minecraft.world.World a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7) throws Throwable;
private static native int __integerCategory1154_15(boolean value) throws Throwable;
private static native boolean __integerCategory1154_16(int value) throws Throwable;
private static native moom.DU __call1154_17(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1154_18(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native net.minecraft.block.Block __call1154_19(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call1154_20(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fy __fieldRead1154_21() throws Throwable;
private static native java.lang.Comparable __call1154_22(net.minecraft.block.state.IBlockState a0, moom.fy a1) throws Throwable;
private static native java.lang.Integer __cast1154_23(java.lang.Comparable a0) throws Throwable;
private static native int __call1154_24(java.lang.Integer a0) throws Throwable;
private static native float __call1154_25(int a0) throws Throwable;
private static native int __numericCompare1154_26(double a0, double a1) throws Throwable;
private static native moom.DR __call1154_27(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DU a2, net.minecraft.entity.Entity a3, moom.DR a4) throws Throwable;
private static native double __call1154_28(moom.DR a0) throws Throwable;
private static native int __numericCompare1154_29(double a0, double a1) throws Throwable;
private static native boolean __call1154_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1154_31(boolean value) throws Throwable;
private static native moom.DR __call1154_32(moom.DR a0) throws Throwable;
private static native double __fieldRead1154_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1154_35(moom.DR a0) throws Throwable;
private static native void __fieldWrite1154_36(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead1154_38(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1154_39(moom.DR a0) throws Throwable;
private static native void __fieldWrite1154_40(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead1154_42(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1154_43(moom.DR a0) throws Throwable;
private static native void __fieldWrite1154_44(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native boolean __integerCategory1154_45(int value) throws Throwable;
private static native java.lang.Throwable __call3115400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115407_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_2d78c26170ab34db28fd(net.minecraft.world.World a0, moom.CA a1, net.minecraft.entity.Entity a2) throws E;
private static final class __SourceHandler_2d78c26170ab34db28fd {

public static boolean f1690(net.minecraft.world.World receiver, moom.CA p0, net.minecraft.entity.Entity p1) throws Throwable {
    int lexicalValue1690_32_0;
    net.minecraft.entity.Entity lexicalValue1690_34_0;
    net.minecraft.entity.Entity lexicalValue1690_39_0;
    net.minecraft.entity.Entity lexicalValue1690_44_0;
    net.minecraft.entity.Entity lexicalValue1690_51_0;
    net.minecraft.entity.Entity lexicalValue1690_51_1;
    int lexicalValue1690_57_0;
    java.lang.String spill1690_0;
    boolean spill1690_1;
    net.minecraft.entity.Entity spill1690_2;
    net.minecraft.entity.Entity spill1690_3;
    long life3_3;
    java.util.List life6_8;
    java.util.Iterator life7_12;
    java.lang.String life5_13;
    net.minecraft.entity.Entity life8_20;
    lexical_join_57: {
    lexical_join_56: {
    life3_3 = (__fieldRead1690_0() ^ 54265641212786L);
    life6_8 = __call1690_1(receiver, null, p0);
    spill1690_0 = __call1690_2();
    life7_12 = __call1690_3(life6_8);
    life5_13 = spill1690_0;
    lexical_cycle_14: while (true) {
    lexical_join_54: {
    lexical_join_52: {
    lexical_join_51: {
    lexical_join_44: {
    lexical_join_39: {
    lexical_join_34: {
    lexical_join_32: {
    if (!(__call1690_4(life7_12))) {
        break lexical_join_56;
    }
    life8_20 = __cast1690_6(__call1690_5(life7_12));
    spill1690_1 = __fieldRead1690_7(life8_20);
    if (!((life5_13 == null))) {
        lexicalValue1690_57_0 = __integerCategory1690_8(spill1690_1);
        break lexical_join_57;
    }
    if (!((life5_13 == null))) {
        lexicalValue1690_32_0 = __integerCategory1690_9(spill1690_1);
        break lexical_join_32;
    }
    if (!((!spill1690_1))) {
        break lexical_join_54;
    }
    spill1690_2 = life8_20;
    if (!((life5_13 == null))) {
        lexicalValue1690_34_0 = spill1690_2;
        break lexical_join_34;
    }
    lexicalValue1690_32_0 = __integerCategory1690_11(__fieldRead1690_10(spill1690_2));
    }
    if (!((lexicalValue1690_32_0 != 0))) {
        break lexical_join_54;
    }
    lexicalValue1690_34_0 = life8_20;
    }
    if (!((life5_13 == null))) {
        lexicalValue1690_39_0 = lexicalValue1690_34_0;
        break lexical_join_39;
    }
    if (!((lexicalValue1690_34_0 != p1))) {
        break lexical_join_54;
    }
    lexicalValue1690_39_0 = p1;
    }
    if (!((life5_13 == null))) {
        lexicalValue1690_44_0 = lexicalValue1690_39_0;
        break lexical_join_44;
    }
    if (!((lexicalValue1690_39_0 != null))) {
        break lexical_join_52;
    }
    lexicalValue1690_44_0 = __fieldRead1690_12(p1);
    }
    spill1690_3 = life8_20;
    if (!((life5_13 == null))) {
        lexicalValue1690_51_0 = lexicalValue1690_44_0;
        lexicalValue1690_51_1 = spill1690_3;
        break lexical_join_51;
    }
    if (!((lexicalValue1690_44_0 != spill1690_3))) {
        break lexical_join_54;
    }
    lexicalValue1690_51_0 = __fieldRead1690_13(p1);
    lexicalValue1690_51_1 = life8_20;
    }
    if (!((lexicalValue1690_51_0 != lexicalValue1690_51_1))) {
        break lexical_join_54;
    }
    }
    return __integerCategory1690_14(0);
    }
    if (!((life5_13 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1690_57_0 = 1;
    }
    return __integerCategory1690_15(lexicalValue1690_57_0);
}
public static void h1690_0(moom.Oo p0) throws Throwable {
    throw __call1169000_0(p0);
}
public static void h1690_1(moom.Oo p0) throws Throwable {
    throw __call1169001_0(p0);
}
public static void h1690_2(moom.Oo p0) throws Throwable {
    throw __call1169002_0(p0);
}
public static void h1690_3(moom.Oo p0) throws Throwable {
    throw __call1169003_0(p0);
}
public static void h1690_4(moom.Oo p0) throws Throwable {
    throw __call1169004_0(p0);
}
public static void h1690_5(moom.Oo p0) throws Throwable {
    throw __call1169005_0(p0);
}
public static void h1690_6(moom.Oo p0) throws Throwable {
    throw __call1169006_0(p0);
}
public static void h1690_7(moom.Oo p0) throws Throwable {
    throw __call1169007_0(p0);
}
public static void h1690_8(moom.Oo p0) throws Throwable {
    throw __call1169008_0(p0);
}
public static void h1690_9(moom.Oo p0) throws Throwable {
    throw __call1169009_0(p0);
}
public static void h1690_10(moom.Oo p0) throws Throwable {
    throw __call1169010_0(p0);
}
private static native long __fieldRead1690_0() throws Throwable;
private static native java.util.List __call1690_1(net.minecraft.world.World a0, java.lang.Object a1, moom.CA a2) throws Throwable;
private static native java.lang.String __call1690_2() throws Throwable;
private static native java.util.Iterator __call1690_3(java.util.List a0) throws Throwable;
private static native boolean __call1690_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1690_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast1690_6(java.lang.Object a0) throws Throwable;
private static native boolean __fieldRead1690_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1690_8(boolean value) throws Throwable;
private static native int __integerCategory1690_9(boolean value) throws Throwable;
private static native boolean __fieldRead1690_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1690_11(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1690_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1690_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __integerCategory1690_14(int value) throws Throwable;
private static native boolean __integerCategory1690_15(int value) throws Throwable;
private static native java.lang.Throwable __call1169000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169010_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_c0ba706d10e078fd731e(net.minecraft.world.World a0, moom.DR a1, moom.CA a2) throws E;
private static final class __SourceHandler_c0ba706d10e078fd731e {

public static float f628(net.minecraft.world.World receiver, moom.DR p0, moom.CA p1) throws Throwable {
    int lexicalValue628_73_0;
    int lexicalValue628_79_0;
    int lexicalValue628_83_0;
    float lexicalValue628_185_0;
    float lexicalValue628_193_0;
    java.lang.String spill628_0;
    int spill628_1;
    float spill628_2;
    float spill628_3;
    long life3_3;
    double life6_16;
    java.lang.String life5_17;
    double life8_29;
    double life10_41;
    double life12_52;
    double life14_63;
    int life16_98;
    int life17_100;
    float life18_102;
    float life19_110;
    float life20_118;
    double life21_134;
    double life23_146;
    double life25_158;
    lexical_join_194: {
    lexical_join_193: {
    lexical_join_188: {
    lexical_join_83: {
    lexical_join_79: {
    lexical_join_73: {
    life3_3 = (__fieldRead628_0() ^ 68647493683283L);
    spill628_0 = __call628_1();
    life6_16 = (0x1.0p0d / (((__fieldRead628_2(p1) - __fieldRead628_3(p1)) * 0x1.0p1d) + 0x1.0p0d));
    life5_17 = spill628_0;
    life8_29 = (0x1.0p0d / (((__fieldRead628_4(p1) - __fieldRead628_5(p1)) * 0x1.0p1d) + 0x1.0p0d));
    life10_41 = (0x1.0p0d / (((__fieldRead628_6(p1) - __fieldRead628_7(p1)) * 0x1.0p1d) + 0x1.0p0d));
    life12_52 = ((0x1.0p0d - (__call628_8((0x1.0p0d / life6_16)) * life6_16)) / 0x1.0p1d);
    life14_63 = ((0x1.0p0d - (__call628_9((0x1.0p0d / life10_41)) * life10_41)) / 0x1.0p1d);
    spill628_1 = __numericCompare628_10(life6_16, 0x0.0p0d);
    if (!((life5_17 == null))) {
        lexicalValue628_73_0 = spill628_1;
        break lexical_join_73;
    }
    if (!((spill628_1 >= 0))) {
        break lexical_join_194;
    }
    lexicalValue628_73_0 = __numericCompare628_11(life8_29, 0x0.0p0d);
    }
    if (!((life5_17 == null))) {
        lexicalValue628_79_0 = lexicalValue628_73_0;
        break lexical_join_79;
    }
    if (!((lexicalValue628_73_0 >= 0))) {
        break lexical_join_194;
    }
    lexicalValue628_79_0 = __numericCompare628_12(life10_41, 0x0.0p0d);
    }
    if (!((life5_17 == null))) {
        lexicalValue628_83_0 = lexicalValue628_79_0;
        break lexical_join_83;
    }
    if (!((lexicalValue628_79_0 >= 0))) {
        break lexical_join_194;
    }
    lexicalValue628_83_0 = 0;
    }
    life16_98 = lexicalValue628_83_0;
    life17_100 = 0;
    life18_102 = 0x0.0p0f;
    lexical_cycle_88: while (true) {
    lexical_join_185: {
    lexical_join_180: {
    if (!((__numericCompare628_13(life18_102, 0x1.0p0f) <= 0))) {
        break lexical_join_188;
    }
    spill628_2 = 0x0.0p0f;
    if (!((life5_17 == null))) {
        lexicalValue628_193_0 = spill628_2;
        break lexical_join_193;
    }
    life19_110 = spill628_2;
    lexical_cycle_96: while (true) {
    lexical_join_178: {
    lexical_join_172: {
    if (!((__numericCompare628_14(life19_110, 0x1.0p0f) <= 0))) {
        break lexical_join_180;
    }
    spill628_3 = 0x0.0p0f;
    if (!((life5_17 == null))) {
        lexicalValue628_185_0 = spill628_3;
        break lexical_join_185;
    }
    life20_118 = spill628_3;
    lexical_cycle_104: while (true) {
    lexical_join_170: {
    lexical_join_163: {
    if (!((__numericCompare628_15(life20_118, 0x1.0p0f) <= 0))) {
        break lexical_join_172;
    }
    life21_134 = (__fieldRead628_16(p1) + ((__fieldRead628_17(p1) - __fieldRead628_18(p1)) * ((double) life18_102)));
    life23_146 = (__fieldRead628_19(p1) + ((__fieldRead628_20(p1) - __fieldRead628_21(p1)) * ((double) life19_110)));
    life25_158 = (__fieldRead628_22(p1) + ((__fieldRead628_23(p1) - __fieldRead628_24(p1)) * ((double) life20_118)));
    if (!((life5_17 == null))) {
        break lexical_join_178;
    }
    if (!((life5_17 == null))) {
        break lexical_join_170;
    }
    if (!((__call628_25(receiver, new moom.DR((life21_134 + life12_52), life23_146, (life25_158 + life14_63)), p0) == null))) {
        break lexical_join_163;
    }
    life16_98 += 1;
    }
    life17_100 += 1;
    life20_118 = ((float) (((double) life20_118) + life10_41));
    }
    if (!((life5_17 != null))) { continue lexical_cycle_104; }
    break lexical_cycle_104;
    }
    }
    life19_110 = ((float) (((double) life19_110) + life8_29));
    }
    if (!((life5_17 != null))) { continue lexical_cycle_96; }
    break lexical_cycle_96;
    }
    }
    lexicalValue628_185_0 = ((float) (((double) life18_102) + life6_16));
    }
    life18_102 = lexicalValue628_185_0;
    if (!((life5_17 != null))) { continue lexical_cycle_88; }
    break lexical_cycle_88;
    }
    }
    lexicalValue628_193_0 = (((float) life16_98) / ((float) life17_100));
    }
    return lexicalValue628_193_0;
    }
    return 0x0.0p0f;
}
public static float h628_0(moom.Oo p0) throws Throwable {
    throw __call2062800_0(p0);
}
public static float h628_1(moom.Oo p0) throws Throwable {
    throw __call2062801_0(p0);
}
public static float h628_2(moom.Oo p0) throws Throwable {
    throw __call2062802_0(p0);
}
public static float h628_3(moom.Oo p0) throws Throwable {
    throw __call2062803_0(p0);
}
public static float h628_4(moom.Oo p0) throws Throwable {
    throw __call2062804_0(p0);
}
public static float h628_5(moom.Oo p0) throws Throwable {
    throw __call2062805_0(p0);
}
public static float h628_6(moom.Oo p0) throws Throwable {
    throw __call2062806_0(p0);
}
public static float h628_7(moom.Oo p0) throws Throwable {
    throw __call2062807_0(p0);
}
private static native long __fieldRead628_0() throws Throwable;
private static native java.lang.String __call628_1() throws Throwable;
private static native double __fieldRead628_2(moom.CA a0) throws Throwable;
private static native double __fieldRead628_3(moom.CA a0) throws Throwable;
private static native double __fieldRead628_4(moom.CA a0) throws Throwable;
private static native double __fieldRead628_5(moom.CA a0) throws Throwable;
private static native double __fieldRead628_6(moom.CA a0) throws Throwable;
private static native double __fieldRead628_7(moom.CA a0) throws Throwable;
private static native double __call628_8(double a0) throws Throwable;
private static native double __call628_9(double a0) throws Throwable;
private static native int __numericCompare628_10(double a0, double a1) throws Throwable;
private static native int __numericCompare628_11(double a0, double a1) throws Throwable;
private static native int __numericCompare628_12(double a0, double a1) throws Throwable;
private static native int __numericCompare628_13(float a0, float a1) throws Throwable;
private static native int __numericCompare628_14(float a0, float a1) throws Throwable;
private static native int __numericCompare628_15(float a0, float a1) throws Throwable;
private static native double __fieldRead628_16(moom.CA a0) throws Throwable;
private static native double __fieldRead628_17(moom.CA a0) throws Throwable;
private static native double __fieldRead628_18(moom.CA a0) throws Throwable;
private static native double __fieldRead628_19(moom.CA a0) throws Throwable;
private static native double __fieldRead628_20(moom.CA a0) throws Throwable;
private static native double __fieldRead628_21(moom.CA a0) throws Throwable;
private static native double __fieldRead628_22(moom.CA a0) throws Throwable;
private static native double __fieldRead628_23(moom.CA a0) throws Throwable;
private static native double __fieldRead628_24(moom.CA a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __call628_25(net.minecraft.world.World a0, moom.DR a1, moom.DR a2) throws Throwable;
private static native java.lang.Throwable __call2062800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2062801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2062802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2062803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2062804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2062805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2062806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2062807_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.util.MovingObjectPosition __sourceHandlerCall_08ca7f2f53aa805d431a(net.minecraft.world.World a0, moom.DR a1, moom.DR a2, boolean a3, boolean a4, boolean a5) throws E;
private static final class __SourceHandler_08ca7f2f53aa805d431a {

public static net.minecraft.util.MovingObjectPosition f1691(net.minecraft.world.World receiver, moom.DR p0, moom.DR p1, boolean p2, boolean p3, boolean p4) throws Throwable {
    int lexicalValue1691_15_0;
    int lexicalValue1691_21_0;
    int lexicalValue1691_27_0;
    int lexicalValue1691_33_0;
    int lexicalValue1691_39_0;
    int lexicalValue1691_45_0;
    net.minecraft.block.Block lexicalValue1691_93_0;
    int lexicalValue1691_98_0;
    net.minecraft.block.Block lexicalValue1691_100_0;
    net.minecraft.util.MovingObjectPosition lexicalValue1691_111_0;
    int lexicalValue1691_134_0;
    int lexicalValue1691_140_0;
    int lexicalValue1691_146_0;
    net.minecraft.util.MovingObjectPosition lexicalValue1691_165_0;
    int lexicalValue1691_167_0;
    int lexicalValue1691_194_0;
    int lexicalValue1691_194_1;
    int lexicalValue1691_203_0;
    int lexicalValue1691_220_0;
    int lexicalValue1691_220_1;
    int lexicalValue1691_229_0;
    int lexicalValue1691_246_0;
    int lexicalValue1691_246_1;
    int lexicalValue1691_255_0;
    int lexicalValue1691_292_0;
    int lexicalValue1691_303_0;
    int lexicalValue1691_316_0;
    int lexicalValue1691_324_0;
    int lexicalValue1691_332_0;
    int lexicalValue1691_340_0;
    moom.bs lexicalValue1691_355_0;
    int lexicalValue1691_378_0;
    moom.bs lexicalValue1691_387_0;
    int lexicalValue1691_408_0;
    moom.bs lexicalValue1691_413_0;
    int lexicalValue1691_439_0;
    int lexicalValue1691_440_0;
    int lexicalValue1691_440_1;
    int lexicalValue1691_450_0;
    int lexicalValue1691_451_0;
    int lexicalValue1691_451_1;
    int lexicalValue1691_461_0;
    int lexicalValue1691_462_0;
    int lexicalValue1691_462_1;
    net.minecraft.block.Block lexicalValue1691_491_0;
    int lexicalValue1691_496_0;
    net.minecraft.block.Block lexicalValue1691_498_0;
    net.minecraft.util.MovingObjectPosition lexicalValue1691_509_0;
    int lexicalValue1691_523_0;
    net.minecraft.util.MovingObjectPosition lexicalValue1691_527_0;
    boolean spill1691_0;
    boolean spill1691_1;
    net.minecraft.block.Block spill1691_2;
    net.minecraft.util.MovingObjectPosition spill1691_3;
    boolean spill1691_4;
    int spill1691_5;
    int spill1691_6;
    int spill1691_7;
    int spill1691_8;
    int spill1691_9;
    int spill1691_10;
    int spill1691_11;
    int spill1691_12;
    int spill1691_13;
    int spill1691_14;
    int spill1691_15;
    int spill1691_16;
    int spill1691_17;
    int spill1691_18;
    int spill1691_19;
    int spill1691_20;
    boolean spill1691_21;
    net.minecraft.block.Block spill1691_22;
    net.minecraft.util.MovingObjectPosition spill1691_23;
    long life6_3;
    java.lang.String life8_5;
    int life9_81;
    int life10_85;
    int life11_89;
    int life12_93;
    int life13_97;
    int life14_101;
    moom.DT life15_108;
    net.minecraft.block.state.IBlockState life16_112;
    net.minecraft.block.Block life17_115;
    net.minecraft.util.MovingObjectPosition life18_156;
    net.minecraft.util.MovingObjectPosition life18_167;
    int life19_173;
    int life20_261;
    int life21_263;
    int life22_265;
    double life23_267;
    double life25_269;
    double life27_271;
    double life29_387;
    double life31_389;
    double life33_391;
    double life35_397;
    double life37_403;
    double life39_409;
    moom.bs life41_517;
    moom.DT life15_654;
    net.minecraft.block.state.IBlockState life42_658;
    net.minecraft.block.Block life43_661;
    net.minecraft.util.MovingObjectPosition life44_702;
    lexical_join_530: {
    lexical_join_528: {
    lexical_join_527: {
    lexical_join_526: {
    lexical_join_523: {
    lexical_join_522: {
    lexical_join_112: {
    lexical_join_111: {
    lexical_join_100: {
    lexical_join_98: {
    lexical_join_93: {
    lexical_join_92: {
    lexical_join_45: {
    lexical_join_39: {
    lexical_join_33: {
    lexical_join_27: {
    lexical_join_21: {
    lexical_join_15: {
    life6_3 = (__fieldRead1691_0() ^ 52450276690022L);
    life8_5 = __call1691_1();
    spill1691_0 = __call1691_3(__fieldRead1691_2(p0));
    if (!((life8_5 == null))) {
        lexicalValue1691_15_0 = __integerCategory1691_4(spill1691_0);
        break lexical_join_15;
    }
    if (!((!spill1691_0))) {
        break lexical_join_530;
    }
    lexicalValue1691_15_0 = __integerCategory1691_7(__call1691_6(__fieldRead1691_5(p0)));
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_21_0 = lexicalValue1691_15_0;
        break lexical_join_21;
    }
    if (!((lexicalValue1691_15_0 == 0))) {
        break lexical_join_530;
    }
    lexicalValue1691_21_0 = __integerCategory1691_10(__call1691_9(__fieldRead1691_8(p0)));
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_27_0 = lexicalValue1691_21_0;
        break lexical_join_27;
    }
    if (!((lexicalValue1691_21_0 == 0))) {
        break lexical_join_530;
    }
    lexicalValue1691_27_0 = __integerCategory1691_13(__call1691_12(__fieldRead1691_11(p1)));
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_33_0 = lexicalValue1691_27_0;
        break lexical_join_33;
    }
    if (!((lexicalValue1691_27_0 == 0))) {
        break lexical_join_528;
    }
    lexicalValue1691_33_0 = __integerCategory1691_16(__call1691_15(__fieldRead1691_14(p1)));
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_39_0 = lexicalValue1691_33_0;
        break lexical_join_39;
    }
    if (!((lexicalValue1691_33_0 == 0))) {
        break lexical_join_528;
    }
    lexicalValue1691_39_0 = __integerCategory1691_19(__call1691_18(__fieldRead1691_17(p1)));
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_45_0 = lexicalValue1691_39_0;
        break lexical_join_45;
    }
    if (!((lexicalValue1691_39_0 == 0))) {
        break lexical_join_528;
    }
    lexicalValue1691_45_0 = __call1691_21(__fieldRead1691_20(p1));
    }
    life9_81 = lexicalValue1691_45_0;
    life10_85 = __call1691_23(__fieldRead1691_22(p1));
    life11_89 = __call1691_25(__fieldRead1691_24(p1));
    life12_93 = __call1691_27(__fieldRead1691_26(p0));
    life13_97 = __call1691_29(__fieldRead1691_28(p0));
    life14_101 = __call1691_31(__fieldRead1691_30(p0));
    life15_108 = new moom.DT(life12_93, life13_97, life14_101);
    life16_112 = __call1691_32(receiver, life15_108);
    life17_115 = __call1691_33(life16_112);
    spill1691_1 = p3;
    if (!((life8_5 == null))) {
        lexicalValue1691_98_0 = __integerCategory1691_34(spill1691_1);
        break lexical_join_98;
    }
    if (!(spill1691_1)) {
        break lexical_join_92;
    }
    spill1691_2 = life17_115;
    if (!((life8_5 == null))) {
        lexicalValue1691_93_0 = spill1691_2;
        break lexical_join_93;
    }
    if (!((__call1691_35(spill1691_2, receiver, life15_108, life16_112) != null))) {
        break lexical_join_112;
    }
    }
    lexicalValue1691_93_0 = life17_115;
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_100_0 = lexicalValue1691_93_0;
        break lexical_join_100;
    }
    lexicalValue1691_98_0 = __integerCategory1691_37(__call1691_36(lexicalValue1691_93_0, life16_112, p2));
    }
    if (!((lexicalValue1691_98_0 != 0))) {
        break lexical_join_112;
    }
    lexicalValue1691_100_0 = life17_115;
    }
    life18_156 = __call1691_38(lexicalValue1691_100_0, receiver, life15_108, p0, p1);
    spill1691_3 = life18_156;
    if (!((life8_5 == null))) {
        lexicalValue1691_111_0 = spill1691_3;
        break lexical_join_111;
    }
    if (!((spill1691_3 != null))) {
        break lexical_join_112;
    }
    lexicalValue1691_111_0 = life18_156;
    }
    return lexicalValue1691_111_0;
    }
    life18_167 = null;
    life19_173 = __invokedynamic1691_39(21960, (8834317771465024947L ^ life6_3));
    lexical_cycle_120: while (true) {
    lexical_join_520: {
    lexical_join_512: {
    lexical_join_510: {
    lexical_join_509: {
    lexical_join_498: {
    lexical_join_496: {
    lexical_join_491: {
    lexical_join_490: {
    lexical_join_462: {
    lexical_join_461: {
    lexical_join_451: {
    lexical_join_450: {
    lexical_join_440: {
    lexical_join_439: {
    lexical_join_431: {
    lexical_join_413: {
    lexical_join_412: {
    lexical_join_408: {
    lexical_join_407: {
    lexical_join_387: {
    lexical_join_386: {
    lexical_join_378: {
    lexical_join_375: {
    lexical_join_355: {
    lexical_join_354: {
    lexical_join_340: {
    lexical_join_337: {
    lexical_join_332: {
    lexical_join_329: {
    lexical_join_324: {
    lexical_join_321: {
    lexical_join_316: {
    lexical_join_313: {
    lexical_join_303: {
    lexical_join_302: {
    lexical_join_292: {
    lexical_join_291: {
    lexical_join_256: {
    lexical_join_255: {
    lexical_join_254: {
    lexical_join_246: {
    lexical_join_242: {
    lexical_join_230: {
    lexical_join_229: {
    lexical_join_228: {
    lexical_join_220: {
    lexical_join_216: {
    lexical_join_204: {
    lexical_join_203: {
    lexical_join_202: {
    lexical_join_194: {
    lexical_join_190: {
    lexical_join_167: {
    lexical_join_166: {
    lexical_join_165: {
    lexical_join_164: {
    lexical_join_146: {
    lexical_join_145: {
    lexical_join_143: {
    lexical_join_140: {
    lexical_join_134: {
    if (!(((life19_173--) >= 0))) {
        break lexical_join_522;
    }
    spill1691_4 = __call1691_41(__fieldRead1691_40(p0));
    if (!((life8_5 == null))) {
        lexicalValue1691_523_0 = __integerCategory1691_42(spill1691_4);
        break lexical_join_523;
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_134_0 = __integerCategory1691_43(spill1691_4);
        break lexical_join_134;
    }
    if (!((!spill1691_4))) {
        break lexical_join_143;
    }
    lexicalValue1691_134_0 = __integerCategory1691_46(__call1691_45(__fieldRead1691_44(p0)));
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_140_0 = lexicalValue1691_134_0;
        break lexical_join_140;
    }
    if (!((lexicalValue1691_134_0 == 0))) {
        break lexical_join_143;
    }
    lexicalValue1691_140_0 = __integerCategory1691_49(__call1691_48(__fieldRead1691_47(p0)));
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_146_0 = lexicalValue1691_140_0;
        break lexical_join_146;
    }
    if (!((lexicalValue1691_140_0 != 0))) {
        break lexical_join_145;
    }
    }
    return null;
    }
    lexicalValue1691_146_0 = life12_93;
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_167_0 = lexicalValue1691_146_0;
        break lexical_join_167;
    }
    if (!((lexicalValue1691_146_0 == life9_81))) {
        break lexical_join_166;
    }
    spill1691_5 = life13_97;
    if (!((life8_5 == null))) {
        lexicalValue1691_167_0 = spill1691_5;
        break lexical_join_167;
    }
    if (!((spill1691_5 == life10_85))) {
        break lexical_join_166;
    }
    spill1691_6 = life14_101;
    if (!((life8_5 == null))) {
        lexicalValue1691_167_0 = spill1691_6;
        break lexical_join_167;
    }
    if (!((spill1691_6 == life11_89))) {
        break lexical_join_166;
    }
    if (!(p4)) {
        break lexical_join_164;
    }
    lexicalValue1691_165_0 = life18_167;
    break lexical_join_165;
    }
    lexicalValue1691_165_0 = null;
    }
    return lexicalValue1691_165_0;
    }
    lexicalValue1691_167_0 = 1;
    }
    life20_261 = lexicalValue1691_167_0;
    life21_263 = 1;
    life22_265 = 1;
    life23_267 = 0x1.f38p9d;
    life25_269 = 0x1.f38p9d;
    life27_271 = 0x1.f38p9d;
    spill1691_7 = life9_81;
    spill1691_8 = life12_93;
    if (!((life8_5 == null))) {
        lexicalValue1691_194_0 = spill1691_7;
        lexicalValue1691_194_1 = spill1691_8;
        break lexical_join_194;
    }
    if (!((spill1691_7 > spill1691_8))) {
        break lexical_join_190;
    }
    life23_267 = (((double) life12_93) + 0x1.0p0d);
    if (!((life8_5 != null))) {
        break lexical_join_204;
    }
    }
    spill1691_9 = life9_81;
    if (!((life8_5 == null))) {
        lexicalValue1691_203_0 = spill1691_9;
        break lexical_join_203;
    }
    lexicalValue1691_194_0 = spill1691_9;
    lexicalValue1691_194_1 = life12_93;
    }
    if (!((lexicalValue1691_194_0 < lexicalValue1691_194_1))) {
        break lexical_join_202;
    }
    life23_267 = (((double) life12_93) + 0x0.0p0d);
    if (!((life8_5 != null))) {
        break lexical_join_204;
    }
    }
    lexicalValue1691_203_0 = 0;
    }
    life20_261 = lexicalValue1691_203_0;
    }
    spill1691_10 = life10_85;
    spill1691_11 = life13_97;
    if (!((life8_5 == null))) {
        lexicalValue1691_220_0 = spill1691_10;
        lexicalValue1691_220_1 = spill1691_11;
        break lexical_join_220;
    }
    if (!((spill1691_10 > spill1691_11))) {
        break lexical_join_216;
    }
    life25_269 = (((double) life13_97) + 0x1.0p0d);
    if (!((life8_5 != null))) {
        break lexical_join_230;
    }
    }
    spill1691_12 = life10_85;
    if (!((life8_5 == null))) {
        lexicalValue1691_229_0 = spill1691_12;
        break lexical_join_229;
    }
    lexicalValue1691_220_0 = spill1691_12;
    lexicalValue1691_220_1 = life13_97;
    }
    if (!((lexicalValue1691_220_0 < lexicalValue1691_220_1))) {
        break lexical_join_228;
    }
    life25_269 = (((double) life13_97) + 0x0.0p0d);
    if (!((life8_5 != null))) {
        break lexical_join_230;
    }
    }
    lexicalValue1691_229_0 = 0;
    }
    life21_263 = lexicalValue1691_229_0;
    }
    spill1691_13 = life11_89;
    spill1691_14 = life14_101;
    if (!((life8_5 == null))) {
        lexicalValue1691_246_0 = spill1691_13;
        lexicalValue1691_246_1 = spill1691_14;
        break lexical_join_246;
    }
    if (!((spill1691_13 > spill1691_14))) {
        break lexical_join_242;
    }
    life27_271 = (((double) life14_101) + 0x1.0p0d);
    if (!((life8_5 != null))) {
        break lexical_join_256;
    }
    }
    spill1691_15 = life11_89;
    if (!((life8_5 == null))) {
        lexicalValue1691_255_0 = spill1691_15;
        break lexical_join_255;
    }
    lexicalValue1691_246_0 = spill1691_15;
    lexicalValue1691_246_1 = life14_101;
    }
    if (!((lexicalValue1691_246_0 < lexicalValue1691_246_1))) {
        break lexical_join_254;
    }
    life27_271 = (((double) life14_101) + 0x0.0p0d);
    if (!((life8_5 != null))) {
        break lexical_join_256;
    }
    }
    lexicalValue1691_255_0 = 0;
    }
    life22_265 = lexicalValue1691_255_0;
    }
    life29_387 = 0x1.f38p9d;
    life31_389 = 0x1.f38p9d;
    life33_391 = 0x1.f38p9d;
    life35_397 = (__fieldRead1691_50(p1) - __fieldRead1691_51(p0));
    life37_403 = (__fieldRead1691_52(p1) - __fieldRead1691_53(p0));
    life39_409 = (__fieldRead1691_54(p1) - __fieldRead1691_55(p0));
    spill1691_16 = life20_261;
    if (!((life8_5 == null))) {
        lexicalValue1691_292_0 = spill1691_16;
        break lexical_join_292;
    }
    if (!((spill1691_16 != 0))) {
        break lexical_join_291;
    }
    life29_387 = ((life23_267 - __fieldRead1691_56(p0)) / life35_397);
    }
    lexicalValue1691_292_0 = life21_263;
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_303_0 = lexicalValue1691_292_0;
        break lexical_join_303;
    }
    if (!((lexicalValue1691_292_0 != 0))) {
        break lexical_join_302;
    }
    life31_389 = ((life25_269 - __fieldRead1691_57(p0)) / life37_403);
    }
    lexicalValue1691_303_0 = life22_265;
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_316_0 = lexicalValue1691_303_0;
        break lexical_join_316;
    }
    if (!((lexicalValue1691_303_0 != 0))) {
        break lexical_join_313;
    }
    life33_391 = ((life27_271 - __fieldRead1691_58(p0)) / life39_409);
    }
    lexicalValue1691_316_0 = __numericCompare1691_59(life29_387, -0x0.0p0d);
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_324_0 = lexicalValue1691_316_0;
        break lexical_join_324;
    }
    if (!((lexicalValue1691_316_0 == 0))) {
        break lexical_join_321;
    }
    life29_387 = -0x1.a36e2eb1c432dp-14d;
    }
    lexicalValue1691_324_0 = __numericCompare1691_60(life31_389, -0x0.0p0d);
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_332_0 = lexicalValue1691_324_0;
        break lexical_join_332;
    }
    if (!((lexicalValue1691_324_0 == 0))) {
        break lexical_join_329;
    }
    life31_389 = -0x1.a36e2eb1c432dp-14d;
    }
    lexicalValue1691_332_0 = __numericCompare1691_61(life33_391, -0x0.0p0d);
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_340_0 = lexicalValue1691_332_0;
        break lexical_join_340;
    }
    if (!((lexicalValue1691_332_0 == 0))) {
        break lexical_join_337;
    }
    life33_391 = -0x1.a36e2eb1c432dp-14d;
    }
    lexicalValue1691_340_0 = __numericCompare1691_62(life29_387, life31_389);
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_378_0 = lexicalValue1691_340_0;
        break lexical_join_378;
    }
    if (!((lexicalValue1691_340_0 < 0))) {
        break lexical_join_375;
    }
    spill1691_17 = __numericCompare1691_63(life29_387, life33_391);
    if (!((life8_5 == null))) {
        lexicalValue1691_378_0 = spill1691_17;
        break lexical_join_378;
    }
    if (!((spill1691_17 < 0))) {
        break lexical_join_375;
    }
    if (!((life9_81 > life12_93))) {
        break lexical_join_354;
    }
    lexicalValue1691_355_0 = __fieldRead1691_64();
    break lexical_join_355;
    }
    lexicalValue1691_355_0 = __fieldRead1691_65();
    }
    life41_517 = lexicalValue1691_355_0;
    p0 = new moom.DR(life23_267, (__fieldRead1691_66(p0) + (life37_403 * life29_387)), (__fieldRead1691_67(p0) + (life39_409 * life29_387)));
    if (!((life8_5 != null))) {
        break lexical_join_431;
    }
    }
    lexicalValue1691_378_0 = __numericCompare1691_68(life31_389, life33_391);
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_408_0 = lexicalValue1691_378_0;
        break lexical_join_408;
    }
    if (!((lexicalValue1691_378_0 < 0))) {
        break lexical_join_407;
    }
    if (!((life10_85 > life13_97))) {
        break lexical_join_386;
    }
    lexicalValue1691_387_0 = __fieldRead1691_69();
    break lexical_join_387;
    }
    lexicalValue1691_387_0 = __fieldRead1691_70();
    }
    life41_517 = lexicalValue1691_387_0;
    p0 = new moom.DR((__fieldRead1691_71(p0) + (life35_397 * life31_389)), life25_269, (__fieldRead1691_72(p0) + (life39_409 * life31_389)));
    if (!((life8_5 != null))) {
        break lexical_join_431;
    }
    }
    lexicalValue1691_408_0 = life11_89;
    }
    if (!((lexicalValue1691_408_0 > life14_101))) {
        break lexical_join_412;
    }
    lexicalValue1691_413_0 = __fieldRead1691_73();
    break lexical_join_413;
    }
    lexicalValue1691_413_0 = __fieldRead1691_74();
    }
    life41_517 = lexicalValue1691_413_0;
    p0 = new moom.DR((__fieldRead1691_75(p0) + (life35_397 * life33_391)), (__fieldRead1691_76(p0) + (life37_403 * life33_391)), life27_271);
    }
    spill1691_18 = __call1691_78(__fieldRead1691_77(p0));
    if (!((life41_517 == __fieldRead1691_79()))) {
        lexicalValue1691_439_0 = spill1691_18;
        break lexical_join_439;
    }
    lexicalValue1691_440_0 = spill1691_18;
    lexicalValue1691_440_1 = 1;
    break lexical_join_440;
    }
    lexicalValue1691_440_0 = lexicalValue1691_439_0;
    lexicalValue1691_440_1 = 0;
    }
    life12_93 = (lexicalValue1691_440_0 - lexicalValue1691_440_1);
    spill1691_19 = __call1691_81(__fieldRead1691_80(p0));
    if (!((life41_517 == __fieldRead1691_82()))) {
        lexicalValue1691_450_0 = spill1691_19;
        break lexical_join_450;
    }
    lexicalValue1691_451_0 = spill1691_19;
    lexicalValue1691_451_1 = 1;
    break lexical_join_451;
    }
    lexicalValue1691_451_0 = lexicalValue1691_450_0;
    lexicalValue1691_451_1 = 0;
    }
    life13_97 = (lexicalValue1691_451_0 - lexicalValue1691_451_1);
    spill1691_20 = __call1691_84(__fieldRead1691_83(p0));
    if (!((life41_517 == __fieldRead1691_85()))) {
        lexicalValue1691_461_0 = spill1691_20;
        break lexical_join_461;
    }
    lexicalValue1691_462_0 = spill1691_20;
    lexicalValue1691_462_1 = 1;
    break lexical_join_462;
    }
    lexicalValue1691_462_0 = lexicalValue1691_461_0;
    lexicalValue1691_462_1 = 0;
    }
    life14_101 = (lexicalValue1691_462_0 - lexicalValue1691_462_1);
    life15_654 = new moom.DT(life12_93, life13_97, life14_101);
    life42_658 = __call1691_86(receiver, life15_654);
    life43_661 = __call1691_87(life42_658);
    spill1691_21 = p3;
    if (!((life8_5 == null))) {
        lexicalValue1691_496_0 = __integerCategory1691_88(spill1691_21);
        break lexical_join_496;
    }
    if (!(spill1691_21)) {
        break lexical_join_490;
    }
    spill1691_22 = life43_661;
    if (!((life8_5 == null))) {
        lexicalValue1691_491_0 = spill1691_22;
        break lexical_join_491;
    }
    if (!((__call1691_89(spill1691_22, receiver, life15_654, life42_658) != null))) {
        break lexical_join_520;
    }
    }
    lexicalValue1691_491_0 = life43_661;
    }
    if (!((life8_5 == null))) {
        lexicalValue1691_498_0 = lexicalValue1691_491_0;
        break lexical_join_498;
    }
    lexicalValue1691_496_0 = __integerCategory1691_91(__call1691_90(lexicalValue1691_491_0, life42_658, p2));
    }
    if (!((lexicalValue1691_496_0 != 0))) {
        break lexical_join_512;
    }
    lexicalValue1691_498_0 = life43_661;
    }
    life44_702 = __call1691_92(lexicalValue1691_498_0, receiver, life15_654, p0, p1);
    spill1691_23 = life44_702;
    if (!((life8_5 == null))) {
        lexicalValue1691_509_0 = spill1691_23;
        break lexical_join_509;
    }
    if (!((spill1691_23 != null))) {
        break lexical_join_510;
    }
    lexicalValue1691_509_0 = life44_702;
    }
    return lexicalValue1691_509_0;
    }
    if (!((life8_5 != null))) {
        break lexical_join_520;
    }
    }
    life18_167 = new net.minecraft.util.MovingObjectPosition(__fieldRead1691_93(), p0, life41_517, life15_654);
    }
    if (!((life8_5 != null))) { continue lexical_cycle_120; }
    break lexical_cycle_120;
    }
    }
    lexicalValue1691_523_0 = __integerCategory1691_94(p4);
    }
    if (!((lexicalValue1691_523_0 != 0))) {
        break lexical_join_526;
    }
    lexicalValue1691_527_0 = life18_167;
    break lexical_join_527;
    }
    lexicalValue1691_527_0 = null;
    }
    return lexicalValue1691_527_0;
    }
    return null;
    }
    return null;
}
public static void h1691_0(moom.Oo p0) throws Throwable {
    throw __call1169100_0(p0);
}
public static void h1691_1(moom.Oo p0) throws Throwable {
    throw __call1169101_0(p0);
}
public static void h1691_2(moom.Oo p0) throws Throwable {
    throw __call1169102_0(p0);
}
public static void h1691_3(moom.Oo p0) throws Throwable {
    throw __call1169103_0(p0);
}
public static void h1691_4(moom.Oo p0) throws Throwable {
    throw __call1169104_0(p0);
}
public static void h1691_5(moom.Oo p0) throws Throwable {
    throw __call1169105_0(p0);
}
public static void h1691_6(moom.Oo p0) throws Throwable {
    throw __call1169106_0(p0);
}
public static void h1691_7(moom.Oo p0) throws Throwable {
    throw __call1169107_0(p0);
}
public static void h1691_8(moom.Oo p0) throws Throwable {
    throw __call1169108_0(p0);
}
public static void h1691_9(moom.Oo p0) throws Throwable {
    throw __call1169109_0(p0);
}
public static void h1691_10(moom.Oo p0) throws Throwable {
    throw __call1169110_0(p0);
}
public static void h1691_11(moom.Oo p0) throws Throwable {
    throw __call1169111_0(p0);
}
public static void h1691_12(moom.Oo p0) throws Throwable {
    throw __call1169112_0(p0);
}
public static void h1691_13(moom.Oo p0) throws Throwable {
    throw __call1169113_0(p0);
}
public static void h1691_14(moom.Oo p0) throws Throwable {
    throw __call1169114_0(p0);
}
public static void h1691_15(moom.Oo p0) throws Throwable {
    throw __call1169115_0(p0);
}
public static void h1691_16(moom.Oo p0) throws Throwable {
    throw __call1169116_0(p0);
}
public static void h1691_17(moom.Oo p0) throws Throwable {
    throw __call1169117_0(p0);
}
public static void h1691_18(moom.Oo p0) throws Throwable {
    throw __call1169118_0(p0);
}
public static void h1691_19(moom.Oo p0) throws Throwable {
    throw __call1169119_0(p0);
}
public static void h1691_20(moom.Oo p0) throws Throwable {
    throw __call1169120_0(p0);
}
public static void h1691_21(moom.Oo p0) throws Throwable {
    throw __call1169121_0(p0);
}
public static void h1691_22(moom.Oo p0) throws Throwable {
    throw __call1169122_0(p0);
}
public static void h1691_23(moom.Oo p0) throws Throwable {
    throw __call1169123_0(p0);
}
public static void h1691_24(moom.Oo p0) throws Throwable {
    throw __call1169124_0(p0);
}
public static void h1691_25(moom.Oo p0) throws Throwable {
    throw __call1169125_0(p0);
}
public static void h1691_26(moom.Oo p0) throws Throwable {
    throw __call1169126_0(p0);
}
public static void h1691_27(moom.Oo p0) throws Throwable {
    throw __call1169127_0(p0);
}
public static void h1691_28(moom.Oo p0) throws Throwable {
    throw __call1169128_0(p0);
}
public static void h1691_29(moom.Oo p0) throws Throwable {
    throw __call1169129_0(p0);
}
public static void h1691_30(moom.Oo p0) throws Throwable {
    throw __call1169130_0(p0);
}
public static void h1691_31(moom.Oo p0) throws Throwable {
    throw __call1169131_0(p0);
}
public static void h1691_32(moom.Oo p0) throws Throwable {
    throw __call1169132_0(p0);
}
public static void h1691_33(moom.Oo p0) throws Throwable {
    throw __call1169133_0(p0);
}
public static void h1691_34(moom.Oo p0) throws Throwable {
    throw __call1169134_0(p0);
}
public static void h1691_35(moom.Oo p0) throws Throwable {
    throw __call1169135_0(p0);
}
public static void h1691_36(moom.Oo p0) throws Throwable {
    throw __call1169136_0(p0);
}
public static void h1691_37(moom.Oo p0) throws Throwable {
    throw __call1169137_0(p0);
}
public static void h1691_38(moom.Oo p0) throws Throwable {
    throw __call1169138_0(p0);
}
public static void h1691_39(moom.Oo p0) throws Throwable {
    throw __call1169139_0(p0);
}
public static void h1691_40(moom.Oo p0) throws Throwable {
    throw __call1169140_0(p0);
}
public static void h1691_41(moom.Oo p0) throws Throwable {
    throw __call1169141_0(p0);
}
public static void h1691_42(moom.Oo p0) throws Throwable {
    throw __call1169142_0(p0);
}
public static void h1691_43(moom.Oo p0) throws Throwable {
    throw __call1169143_0(p0);
}
public static void h1691_44(moom.Oo p0) throws Throwable {
    throw __call1169144_0(p0);
}
public static void h1691_45(moom.Oo p0) throws Throwable {
    throw __call1169145_0(p0);
}
public static void h1691_46(moom.Oo p0) throws Throwable {
    throw __call1169146_0(p0);
}
public static void h1691_47(moom.Oo p0) throws Throwable {
    throw __call1169147_0(p0);
}
public static void h1691_48(moom.Oo p0) throws Throwable {
    throw __call1169148_0(p0);
}
public static void h1691_49(moom.Oo p0) throws Throwable {
    throw __call1169149_0(p0);
}
public static void h1691_50(moom.Oo p0) throws Throwable {
    throw __call1169150_0(p0);
}
public static void h1691_51(moom.Oo p0) throws Throwable {
    throw __call1169151_0(p0);
}
public static void h1691_52(moom.Oo p0) throws Throwable {
    throw __call1169152_0(p0);
}
public static void h1691_53(moom.Oo p0) throws Throwable {
    throw __call1169153_0(p0);
}
public static void h1691_54(moom.Oo p0) throws Throwable {
    throw __call1169154_0(p0);
}
public static void h1691_55(moom.Oo p0) throws Throwable {
    throw __call1169155_0(p0);
}
public static void h1691_56(moom.Oo p0) throws Throwable {
    throw __call1169156_0(p0);
}
public static void h1691_57(moom.Oo p0) throws Throwable {
    throw __call1169157_0(p0);
}
public static void h1691_58(moom.Oo p0) throws Throwable {
    throw __call1169158_0(p0);
}
public static void h1691_59(moom.Oo p0) throws Throwable {
    throw __call1169159_0(p0);
}
public static void h1691_60(moom.Oo p0) throws Throwable {
    throw __call1169160_0(p0);
}
public static void h1691_61(moom.Oo p0) throws Throwable {
    throw __call1169161_0(p0);
}
public static void h1691_62(moom.Oo p0) throws Throwable {
    throw __call1169162_0(p0);
}
public static void h1691_63(moom.Oo p0) throws Throwable {
    throw __call1169163_0(p0);
}
public static void h1691_64(moom.Oo p0) throws Throwable {
    throw __call1169164_0(p0);
}
public static void h1691_65(moom.Oo p0) throws Throwable {
    throw __call1169165_0(p0);
}
public static void h1691_66(moom.Oo p0) throws Throwable {
    throw __call1169166_0(p0);
}
public static void h1691_67(moom.Oo p0) throws Throwable {
    throw __call1169167_0(p0);
}
public static void h1691_68(moom.Oo p0) throws Throwable {
    throw __call1169168_0(p0);
}
public static void h1691_69(moom.Oo p0) throws Throwable {
    throw __call1169169_0(p0);
}
public static void h1691_70(moom.Oo p0) throws Throwable {
    throw __call1169170_0(p0);
}
private static native long __fieldRead1691_0() throws Throwable;
private static native java.lang.String __call1691_1() throws Throwable;
private static native double __fieldRead1691_2(moom.DR a0) throws Throwable;
private static native boolean __call1691_3(double a0) throws Throwable;
private static native int __integerCategory1691_4(boolean value) throws Throwable;
private static native double __fieldRead1691_5(moom.DR a0) throws Throwable;
private static native boolean __call1691_6(double a0) throws Throwable;
private static native int __integerCategory1691_7(boolean value) throws Throwable;
private static native double __fieldRead1691_8(moom.DR a0) throws Throwable;
private static native boolean __call1691_9(double a0) throws Throwable;
private static native int __integerCategory1691_10(boolean value) throws Throwable;
private static native double __fieldRead1691_11(moom.DR a0) throws Throwable;
private static native boolean __call1691_12(double a0) throws Throwable;
private static native int __integerCategory1691_13(boolean value) throws Throwable;
private static native double __fieldRead1691_14(moom.DR a0) throws Throwable;
private static native boolean __call1691_15(double a0) throws Throwable;
private static native int __integerCategory1691_16(boolean value) throws Throwable;
private static native double __fieldRead1691_17(moom.DR a0) throws Throwable;
private static native boolean __call1691_18(double a0) throws Throwable;
private static native int __integerCategory1691_19(boolean value) throws Throwable;
private static native double __fieldRead1691_20(moom.DR a0) throws Throwable;
private static native int __call1691_21(double a0) throws Throwable;
private static native double __fieldRead1691_22(moom.DR a0) throws Throwable;
private static native int __call1691_23(double a0) throws Throwable;
private static native double __fieldRead1691_24(moom.DR a0) throws Throwable;
private static native int __call1691_25(double a0) throws Throwable;
private static native double __fieldRead1691_26(moom.DR a0) throws Throwable;
private static native int __call1691_27(double a0) throws Throwable;
private static native double __fieldRead1691_28(moom.DR a0) throws Throwable;
private static native int __call1691_29(double a0) throws Throwable;
private static native double __fieldRead1691_30(moom.DR a0) throws Throwable;
private static native int __call1691_31(double a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1691_32(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1691_33(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __integerCategory1691_34(boolean value) throws Throwable;
private static native moom.CA __call1691_35(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3) throws Throwable;
private static native boolean __call1691_36(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1, boolean a2) throws Throwable;
private static native int __integerCategory1691_37(boolean value) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __call1691_38(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, moom.DR a3, moom.DR a4) throws Throwable;
private static native int __invokedynamic1691_39(int a0, long a1) throws Throwable;
private static native double __fieldRead1691_40(moom.DR a0) throws Throwable;
private static native boolean __call1691_41(double a0) throws Throwable;
private static native int __integerCategory1691_42(boolean value) throws Throwable;
private static native int __integerCategory1691_43(boolean value) throws Throwable;
private static native double __fieldRead1691_44(moom.DR a0) throws Throwable;
private static native boolean __call1691_45(double a0) throws Throwable;
private static native int __integerCategory1691_46(boolean value) throws Throwable;
private static native double __fieldRead1691_47(moom.DR a0) throws Throwable;
private static native boolean __call1691_48(double a0) throws Throwable;
private static native int __integerCategory1691_49(boolean value) throws Throwable;
private static native double __fieldRead1691_50(moom.DR a0) throws Throwable;
private static native double __fieldRead1691_51(moom.DR a0) throws Throwable;
private static native double __fieldRead1691_52(moom.DR a0) throws Throwable;
private static native double __fieldRead1691_53(moom.DR a0) throws Throwable;
private static native double __fieldRead1691_54(moom.DR a0) throws Throwable;
private static native double __fieldRead1691_55(moom.DR a0) throws Throwable;
private static native double __fieldRead1691_56(moom.DR a0) throws Throwable;
private static native double __fieldRead1691_57(moom.DR a0) throws Throwable;
private static native double __fieldRead1691_58(moom.DR a0) throws Throwable;
private static native int __numericCompare1691_59(double a0, double a1) throws Throwable;
private static native int __numericCompare1691_60(double a0, double a1) throws Throwable;
private static native int __numericCompare1691_61(double a0, double a1) throws Throwable;
private static native int __numericCompare1691_62(double a0, double a1) throws Throwable;
private static native int __numericCompare1691_63(double a0, double a1) throws Throwable;
private static native moom.bs __fieldRead1691_64() throws Throwable;
private static native moom.bs __fieldRead1691_65() throws Throwable;
private static native double __fieldRead1691_66(moom.DR a0) throws Throwable;
private static native double __fieldRead1691_67(moom.DR a0) throws Throwable;
private static native int __numericCompare1691_68(double a0, double a1) throws Throwable;
private static native moom.bs __fieldRead1691_69() throws Throwable;
private static native moom.bs __fieldRead1691_70() throws Throwable;
private static native double __fieldRead1691_71(moom.DR a0) throws Throwable;
private static native double __fieldRead1691_72(moom.DR a0) throws Throwable;
private static native moom.bs __fieldRead1691_73() throws Throwable;
private static native moom.bs __fieldRead1691_74() throws Throwable;
private static native double __fieldRead1691_75(moom.DR a0) throws Throwable;
private static native double __fieldRead1691_76(moom.DR a0) throws Throwable;
private static native double __fieldRead1691_77(moom.DR a0) throws Throwable;
private static native int __call1691_78(double a0) throws Throwable;
private static native moom.bs __fieldRead1691_79() throws Throwable;
private static native double __fieldRead1691_80(moom.DR a0) throws Throwable;
private static native int __call1691_81(double a0) throws Throwable;
private static native moom.bs __fieldRead1691_82() throws Throwable;
private static native double __fieldRead1691_83(moom.DR a0) throws Throwable;
private static native int __call1691_84(double a0) throws Throwable;
private static native moom.bs __fieldRead1691_85() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1691_86(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1691_87(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __integerCategory1691_88(boolean value) throws Throwable;
private static native moom.CA __call1691_89(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3) throws Throwable;
private static native boolean __call1691_90(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1, boolean a2) throws Throwable;
private static native int __integerCategory1691_91(boolean value) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __call1691_92(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, moom.DR a3, moom.DR a4) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead1691_93() throws Throwable;
private static native int __integerCategory1691_94(boolean value) throws Throwable;
private static native java.lang.Throwable __call1169100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169107_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169108_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169109_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169110_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169111_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169112_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169113_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169114_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169115_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169116_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169117_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169118_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169119_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169120_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169121_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169122_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169123_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169124_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169125_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169126_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169127_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169128_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169129_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169130_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169131_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169132_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169133_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169134_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169135_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169136_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169137_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169138_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169139_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169140_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169141_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169142_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169143_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169144_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169145_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169146_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169147_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169148_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169149_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169150_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169151_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169152_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169153_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169154_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169155_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169156_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169157_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169158_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169159_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169160_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169161_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169162_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169163_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169164_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169165_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169166_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169167_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169168_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169169_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169170_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_c88bd4f8e74166352f3b(net.minecraft.world.World a0, moom.DT a1, int a2) throws E;
private static final class __SourceHandler_c88bd4f8e74166352f3b {

public static int f1692(net.minecraft.world.World receiver, moom.DT p0, int p1) throws Throwable {
    int forwardValue1692_33_0;
    int forwardValue1692_33_1;
    java.lang.String spill1692_0;
    int spill1692_1;
    int spill1692_2;
    long life3_3;
    int life6_9;
    java.lang.String life5_10;
    int life7_15;
    forward_join_33: {
    forward_join_23: {
    life3_3 = (__fieldRead1692_0() ^ 30950153360919L);
    spill1692_0 = __call1692_1();
    life6_9 = __call1692_3(receiver, __fieldRead1692_2(), p0);
    life5_10 = spill1692_0;
    life7_15 = __call1692_5(receiver, __fieldRead1692_4(), p0);
    spill1692_1 = life7_15;
    spill1692_2 = p1;
    if (!((life5_10 == null))) {
        forwardValue1692_33_0 = spill1692_1;
        forwardValue1692_33_1 = spill1692_2;
        break forward_join_33;
    }
    if (!((spill1692_1 < spill1692_2))) {
        break forward_join_23;
    }
    life7_15 = p1;
    }
    forwardValue1692_33_0 = (life6_9 << __invokedynamic1692_6(26353, (415388266666887368L ^ life3_3)));
    forwardValue1692_33_1 = (life7_15 << 4);
    }
    return (forwardValue1692_33_0 | forwardValue1692_33_1);
}
public static void h1692_0(moom.Oo p0) throws Throwable {
    throw __call1169200_0(p0);
}
private static native long __fieldRead1692_0() throws Throwable;
private static native java.lang.String __call1692_1() throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1692_2() throws Throwable;
private static native int __call1692_3(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1692_4() throws Throwable;
private static native int __call1692_5(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1692_6(int a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1169200_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_632beeccfd2e0366d7f0(net.minecraft.world.World a0, moom.DT a1, int a2, boolean a3) throws E;
private static final class __SourceHandler_632beeccfd2e0366d7f0 {

public static boolean f1693(net.minecraft.world.World receiver, moom.DT p0, int p1, boolean p2) throws Throwable {
    int forwardValue1693_24_0;
    int forwardValue1693_28_0;
    int forwardValue1693_30_0;
    int forwardValue1693_69_0;
    boolean spill1693_0;
    int spill1693_1;
    boolean spill1693_2;
    long life4_3;
    java.lang.String life6_5;
    int life7_42;
    forward_join_69: {
    forward_join_42: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life4_3 = (__fieldRead1693_0() ^ 101594845675493L);
    life6_5 = __call1693_1();
    spill1693_0 = __call1693_3(__call1693_2(), "\n");
    if (!((life6_5 == null))) {
        forwardValue1693_24_0 = __integerCategory1693_4(spill1693_0);
        break forward_join_24;
    }
    if (!(spill1693_0)) {
        break forward_join_15;
    }
    if (!((__call1693_6(__call1693_5()) == null))) {
        break forward_join_29;
    }
    }
    forwardValue1693_24_0 = __numericCompare1693_10((__call1693_7() - __call1693_8()), __invokedynamic1693_9(3626, (7412714957427362183L ^ life4_3)));
    }
    if (!((life6_5 == null))) {
        forwardValue1693_28_0 = forwardValue1693_24_0;
        break forward_join_28;
    }
    if (!((forwardValue1693_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue1693_28_0 = 1;
    }
    forwardValue1693_30_0 = forwardValue1693_28_0;
    break forward_join_30;
    }
    forwardValue1693_30_0 = 0;
    }
    life7_42 = forwardValue1693_30_0;
    spill1693_1 = life7_42;
    if (!((life6_5 == null))) {
        forwardValue1693_69_0 = spill1693_1;
        break forward_join_69;
    }
    if (!((spill1693_1 != 0))) {
        break forward_join_42;
    }
    spill1693_2 = __call1693_11(receiver);
    if (!((life6_5 == null))) {
        forwardValue1693_69_0 = __integerCategory1693_12(spill1693_2);
        break forward_join_69;
    }
    if (!((!spill1693_2))) {
        break forward_join_42;
    }
    return __integerCategory1693_13(0);
    }
    forwardValue1693_69_0 = __integerCategory1693_21(__call1693_20(receiver, (__call1693_14(p0) - p1), (__call1693_15(p0) - p1), (__call1693_16(p0) - p1), (__call1693_17(p0) + p1), (__call1693_18(p0) + p1), (__call1693_19(p0) + p1), p2));
    }
    return __integerCategory1693_22(forwardValue1693_69_0);
}
public static void h1693_0(moom.Oo p0) throws Throwable {
    throw __call1169300_0(p0);
}
public static void h1693_1(moom.Oo p0) throws Throwable {
    throw __call1169301_0(p0);
}
public static void h1693_2(moom.Oo p0) throws Throwable {
    throw __call1169302_0(p0);
}
public static void h1693_3(moom.Oo p0) throws Throwable {
    throw __call1169303_0(p0);
}
public static void h1693_4(moom.Oo p0) throws Throwable {
    throw __call1169304_0(p0);
}
public static void h1693_5(moom.Oo p0) throws Throwable {
    throw __call1169305_0(p0);
}
public static void h1693_6(moom.Oo p0) throws Throwable {
    throw __call1169306_0(p0);
}
public static void h1693_7(moom.Oo p0) throws Throwable {
    throw __call1169307_0(p0);
}
private static native long __fieldRead1693_0() throws Throwable;
private static native java.lang.String __call1693_1() throws Throwable;
private static native java.lang.String __call1693_2() throws Throwable;
private static native boolean __call1693_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1693_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call1693_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call1693_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native long __call1693_7() throws Throwable;
private static native long __call1693_8() throws Throwable;
private static native long __invokedynamic1693_9(int a0, long a1) throws Throwable;
private static native int __numericCompare1693_10(long a0, long a1) throws Throwable;
private static native boolean __call1693_11(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1693_12(boolean value) throws Throwable;
private static native boolean __integerCategory1693_13(int value) throws Throwable;
private static native int __call1693_14(moom.DT a0) throws Throwable;
private static native int __call1693_15(moom.DT a0) throws Throwable;
private static native int __call1693_16(moom.DT a0) throws Throwable;
private static native int __call1693_17(moom.DT a0) throws Throwable;
private static native int __call1693_18(moom.DT a0) throws Throwable;
private static native int __call1693_19(moom.DT a0) throws Throwable;
private static native boolean __call1693_20(net.minecraft.world.World a0, int a1, int a2, int a3, int a4, int a5, int a6, boolean a7) throws Throwable;
private static native int __integerCategory1693_21(boolean value) throws Throwable;
private static native boolean __integerCategory1693_22(int value) throws Throwable;
private static native java.lang.Throwable __call1169300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169307_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_8513b3793167afc9ebe5(net.minecraft.world.World a0, moom.DT a1, moom.DT a2, boolean a3) throws E;
private static final class __SourceHandler_8513b3793167afc9ebe5 {

public static boolean f1694(net.minecraft.world.World receiver, moom.DT p0, moom.DT p1, boolean p2) throws Throwable {
    int forwardValue1694_24_0;
    int forwardValue1694_28_0;
    int forwardValue1694_30_0;
    int forwardValue1694_57_0;
    boolean spill1694_0;
    int spill1694_1;
    boolean spill1694_2;
    long life4_3;
    java.lang.String life6_5;
    int life7_42;
    forward_join_57: {
    forward_join_42: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life4_3 = (__fieldRead1694_0() ^ 25777979473112L);
    life6_5 = __call1694_1();
    spill1694_0 = __call1694_3(__call1694_2(), "\n");
    if (!((life6_5 == null))) {
        forwardValue1694_24_0 = __integerCategory1694_4(spill1694_0);
        break forward_join_24;
    }
    if (!(spill1694_0)) {
        break forward_join_15;
    }
    if (!((__call1694_6(__call1694_5()) == null))) {
        break forward_join_29;
    }
    }
    forwardValue1694_24_0 = __numericCompare1694_10((__call1694_7() - __call1694_8()), __invokedynamic1694_9(3626, (7412656625305914042L ^ life4_3)));
    }
    if (!((life6_5 == null))) {
        forwardValue1694_28_0 = forwardValue1694_24_0;
        break forward_join_28;
    }
    if (!((forwardValue1694_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue1694_28_0 = 1;
    }
    forwardValue1694_30_0 = forwardValue1694_28_0;
    break forward_join_30;
    }
    forwardValue1694_30_0 = 0;
    }
    life7_42 = forwardValue1694_30_0;
    spill1694_1 = life7_42;
    if (!((life6_5 == null))) {
        forwardValue1694_57_0 = spill1694_1;
        break forward_join_57;
    }
    if (!((spill1694_1 != 0))) {
        break forward_join_42;
    }
    spill1694_2 = __call1694_11(receiver);
    if (!((life6_5 == null))) {
        forwardValue1694_57_0 = __integerCategory1694_12(spill1694_2);
        break forward_join_57;
    }
    if (!((!spill1694_2))) {
        break forward_join_42;
    }
    return __integerCategory1694_13(0);
    }
    forwardValue1694_57_0 = __integerCategory1694_21(__call1694_20(receiver, __call1694_14(p0), __call1694_15(p0), __call1694_16(p0), __call1694_17(p1), __call1694_18(p1), __call1694_19(p1), p2));
    }
    return __integerCategory1694_22(forwardValue1694_57_0);
}
public static void h1694_0(moom.Oo p0) throws Throwable {
    throw __call1169400_0(p0);
}
public static void h1694_1(moom.Oo p0) throws Throwable {
    throw __call1169401_0(p0);
}
public static void h1694_2(moom.Oo p0) throws Throwable {
    throw __call1169402_0(p0);
}
public static void h1694_3(moom.Oo p0) throws Throwable {
    throw __call1169403_0(p0);
}
public static void h1694_4(moom.Oo p0) throws Throwable {
    throw __call1169404_0(p0);
}
public static void h1694_5(moom.Oo p0) throws Throwable {
    throw __call1169405_0(p0);
}
public static void h1694_6(moom.Oo p0) throws Throwable {
    throw __call1169406_0(p0);
}
public static void h1694_7(moom.Oo p0) throws Throwable {
    throw __call1169407_0(p0);
}
private static native long __fieldRead1694_0() throws Throwable;
private static native java.lang.String __call1694_1() throws Throwable;
private static native java.lang.String __call1694_2() throws Throwable;
private static native boolean __call1694_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1694_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call1694_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call1694_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native long __call1694_7() throws Throwable;
private static native long __call1694_8() throws Throwable;
private static native long __invokedynamic1694_9(int a0, long a1) throws Throwable;
private static native int __numericCompare1694_10(long a0, long a1) throws Throwable;
private static native boolean __call1694_11(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1694_12(boolean value) throws Throwable;
private static native boolean __integerCategory1694_13(int value) throws Throwable;
private static native int __call1694_14(moom.DT a0) throws Throwable;
private static native int __call1694_15(moom.DT a0) throws Throwable;
private static native int __call1694_16(moom.DT a0) throws Throwable;
private static native int __call1694_17(moom.DT a0) throws Throwable;
private static native int __call1694_18(moom.DT a0) throws Throwable;
private static native int __call1694_19(moom.DT a0) throws Throwable;
private static native boolean __call1694_20(net.minecraft.world.World a0, int a1, int a2, int a3, int a4, int a5, int a6, boolean a7) throws Throwable;
private static native int __integerCategory1694_21(boolean value) throws Throwable;
private static native boolean __integerCategory1694_22(int value) throws Throwable;
private static native java.lang.Throwable __call1169400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169407_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2edbda6c176fe67a0d6e(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws E;
private static final class __SourceHandler_2edbda6c176fe67a0d6e {

public static void f1695(net.minecraft.world.World receiver, moom.DT p0, net.minecraft.block.Block p1) throws Throwable {
    net.minecraft.world.World forwardValue1695_14_0;
    net.minecraft.world.World spill1695_0;
    long life3_3;
    java.lang.String life5_5;
    forward_join_17: {
    forward_join_14: {
    life3_3 = (__fieldRead1695_0() ^ 61125254488194L);
    life5_5 = __call1695_1();
    spill1695_0 = receiver;
    if (!((life5_5 == null))) {
        forwardValue1695_14_0 = spill1695_0;
        break forward_join_14;
    }
    if (!((__call1695_3(__fieldRead1695_2(spill1695_0)) != __fieldRead1695_4()))) {
        break forward_join_17;
    }
    forwardValue1695_14_0 = receiver;
    }
    __call1695_5(forwardValue1695_14_0, p0, p1);
    }
    return;
}
public static void h1695_0(moom.Oo p0) throws Throwable {
    throw __call1169500_0(p0);
}
public static void h1695_1(moom.Oo p0) throws Throwable {
    throw __call1169501_0(p0);
}
private static native long __fieldRead1695_0() throws Throwable;
private static native java.lang.String __call1695_1() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1695_2(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.WorldType __call1695_3(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead1695_4() throws Throwable;
private static native void __call1695_5(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native java.lang.Throwable __call1169500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a0a3832bdcda3f7319ed(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2, moom.bs a3) throws E;
private static final class __SourceHandler_a0a3832bdcda3f7319ed {

public static void f1696(net.minecraft.world.World receiver, moom.DT p0, net.minecraft.block.Block p1, moom.bs p2) throws Throwable {
    moom.bs forwardValue1696_18_0;
    moom.bs forwardValue1696_18_1;
    moom.bs forwardValue1696_28_0;
    moom.bs forwardValue1696_28_1;
    moom.bs forwardValue1696_38_0;
    moom.bs forwardValue1696_38_1;
    moom.bs forwardValue1696_48_0;
    moom.bs forwardValue1696_48_1;
    moom.bs forwardValue1696_58_0;
    moom.bs forwardValue1696_58_1;
    moom.bs spill1696_0;
    moom.bs spill1696_1;
    long life4_3;
    java.lang.String life6_5;
    forward_join_64: {
    forward_join_58: {
    forward_join_56: {
    forward_join_48: {
    forward_join_46: {
    forward_join_38: {
    forward_join_36: {
    forward_join_28: {
    forward_join_26: {
    forward_join_18: {
    forward_join_16: {
    life4_3 = (__fieldRead1696_0() ^ 100130721375999L);
    life6_5 = __call1696_1();
    spill1696_0 = p2;
    spill1696_1 = __fieldRead1696_2();
    if (!((life6_5 == null))) {
        forwardValue1696_18_0 = spill1696_0;
        forwardValue1696_18_1 = spill1696_1;
        break forward_join_18;
    }
    if (!((spill1696_0 != spill1696_1))) {
        break forward_join_16;
    }
    __call1696_4(receiver, __call1696_3(p0), p1);
    }
    forwardValue1696_18_0 = p2;
    forwardValue1696_18_1 = __fieldRead1696_5();
    }
    if (!((life6_5 == null))) {
        forwardValue1696_28_0 = forwardValue1696_18_0;
        forwardValue1696_28_1 = forwardValue1696_18_1;
        break forward_join_28;
    }
    if (!((forwardValue1696_18_0 != forwardValue1696_18_1))) {
        break forward_join_26;
    }
    __call1696_7(receiver, __call1696_6(p0), p1);
    }
    forwardValue1696_28_0 = p2;
    forwardValue1696_28_1 = __fieldRead1696_8();
    }
    if (!((life6_5 == null))) {
        forwardValue1696_38_0 = forwardValue1696_28_0;
        forwardValue1696_38_1 = forwardValue1696_28_1;
        break forward_join_38;
    }
    if (!((forwardValue1696_28_0 != forwardValue1696_28_1))) {
        break forward_join_36;
    }
    __call1696_10(receiver, __call1696_9(p0), p1);
    }
    forwardValue1696_38_0 = p2;
    forwardValue1696_38_1 = __fieldRead1696_11();
    }
    if (!((life6_5 == null))) {
        forwardValue1696_48_0 = forwardValue1696_38_0;
        forwardValue1696_48_1 = forwardValue1696_38_1;
        break forward_join_48;
    }
    if (!((forwardValue1696_38_0 != forwardValue1696_38_1))) {
        break forward_join_46;
    }
    __call1696_13(receiver, __call1696_12(p0), p1);
    }
    forwardValue1696_48_0 = p2;
    forwardValue1696_48_1 = __fieldRead1696_14();
    }
    if (!((life6_5 == null))) {
        forwardValue1696_58_0 = forwardValue1696_48_0;
        forwardValue1696_58_1 = forwardValue1696_48_1;
        break forward_join_58;
    }
    if (!((forwardValue1696_48_0 != forwardValue1696_48_1))) {
        break forward_join_56;
    }
    __call1696_16(receiver, __call1696_15(p0), p1);
    }
    forwardValue1696_58_0 = p2;
    forwardValue1696_58_1 = __fieldRead1696_17();
    }
    if (!((forwardValue1696_58_0 != forwardValue1696_58_1))) {
        break forward_join_64;
    }
    __call1696_19(receiver, __call1696_18(p0), p1);
    }
    return;
}
public static void h1696_0(moom.Oo p0) throws Throwable {
    throw __call1169600_0(p0);
}
public static void h1696_1(moom.Oo p0) throws Throwable {
    throw __call1169601_0(p0);
}
public static void h1696_2(moom.Oo p0) throws Throwable {
    throw __call1169602_0(p0);
}
public static void h1696_3(moom.Oo p0) throws Throwable {
    throw __call1169603_0(p0);
}
public static void h1696_4(moom.Oo p0) throws Throwable {
    throw __call1169604_0(p0);
}
public static void h1696_5(moom.Oo p0) throws Throwable {
    throw __call1169605_0(p0);
}
public static void h1696_6(moom.Oo p0) throws Throwable {
    throw __call1169606_0(p0);
}
public static void h1696_7(moom.Oo p0) throws Throwable {
    throw __call1169607_0(p0);
}
public static void h1696_8(moom.Oo p0) throws Throwable {
    throw __call1169608_0(p0);
}
public static void h1696_9(moom.Oo p0) throws Throwable {
    throw __call1169609_0(p0);
}
public static void h1696_10(moom.Oo p0) throws Throwable {
    throw __call1169610_0(p0);
}
private static native long __fieldRead1696_0() throws Throwable;
private static native java.lang.String __call1696_1() throws Throwable;
private static native moom.bs __fieldRead1696_2() throws Throwable;
private static native moom.DT __call1696_3(moom.DT a0) throws Throwable;
private static native void __call1696_4(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.bs __fieldRead1696_5() throws Throwable;
private static native moom.DT __call1696_6(moom.DT a0) throws Throwable;
private static native void __call1696_7(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.bs __fieldRead1696_8() throws Throwable;
private static native moom.DT __call1696_9(moom.DT a0) throws Throwable;
private static native void __call1696_10(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.bs __fieldRead1696_11() throws Throwable;
private static native moom.DT __call1696_12(moom.DT a0) throws Throwable;
private static native void __call1696_13(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.bs __fieldRead1696_14() throws Throwable;
private static native moom.DT __call1696_15(moom.DT a0) throws Throwable;
private static native void __call1696_16(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.bs __fieldRead1696_17() throws Throwable;
private static native moom.DT __call1696_18(moom.DT a0) throws Throwable;
private static native void __call1696_19(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native java.lang.Throwable __call1169600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169609_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169610_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_dee479c9336fa702ef95(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws E;
private static final class __SourceHandler_dee479c9336fa702ef95 {

public static boolean f277(net.minecraft.world.World receiver, moom.DT p0, net.minecraft.block.state.IBlockState p1, int p2) throws Throwable {
    int forwardValue277_24_0;
    int forwardValue277_28_0;
    int forwardValue277_30_0;
    int forwardValue277_45_0;
    int forwardValue277_54_0;
    net.minecraft.world.World forwardValue277_65_0;
    net.minecraft.block.state.IBlockState forwardValue277_83_0;
    int forwardValue277_106_0;
    int forwardValue277_112_0;
    int forwardValue277_112_1;
    int forwardValue277_129_0;
    int forwardValue277_137_0;
    int forwardValue277_161_0;
    boolean spill277_0;
    int spill277_1;
    boolean spill277_2;
    net.minecraft.world.World spill277_3;
    net.minecraft.world.World spill277_4;
    net.minecraft.block.state.IBlockState spill277_5;
    int spill277_6;
    int spill277_7;
    int spill277_8;
    int spill277_9;
    boolean spill277_10;
    int spill277_11;
    int spill277_12;
    boolean spill277_13;
    long life4_3;
    java.lang.String life6_5;
    int life7_42;
    net.minecraft.world.chunk.Chunk life8_106;
    net.minecraft.block.Block life9_109;
    net.minecraft.block.state.IBlockState life10_114;
    net.minecraft.block.Block life11_128;
    forward_join_161: {
    forward_join_160: {
    forward_join_137: {
    forward_join_135: {
    forward_join_129: {
    forward_join_127: {
    forward_join_112: {
    forward_join_110: {
    forward_join_106: {
    forward_join_99: {
    forward_join_83: {
    forward_join_82: {
    forward_join_65: {
    forward_join_64: {
    forward_join_54: {
    forward_join_50: {
    forward_join_45: {
    forward_join_42: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life4_3 = (__fieldRead277_0() ^ 126800777429917L);
    life6_5 = __call277_1();
    spill277_0 = __call277_3(__call277_2(), "\n");
    if (!((life6_5 == null))) {
        forwardValue277_24_0 = __integerCategory277_4(spill277_0);
        break forward_join_24;
    }
    if (!(spill277_0)) {
        break forward_join_15;
    }
    if (!((__call277_6(__call277_5()) == null))) {
        break forward_join_29;
    }
    }
    forwardValue277_24_0 = __numericCompare277_10((__call277_7() - __call277_8()), __invokedynamic277_9(3626, (7412766449699845631L ^ life4_3)));
    }
    if (!((life6_5 == null))) {
        forwardValue277_28_0 = forwardValue277_24_0;
        break forward_join_28;
    }
    if (!((forwardValue277_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue277_28_0 = 1;
    }
    forwardValue277_30_0 = forwardValue277_28_0;
    break forward_join_30;
    }
    forwardValue277_30_0 = 0;
    }
    life7_42 = forwardValue277_30_0;
    spill277_1 = life7_42;
    if (!((life6_5 == null))) {
        forwardValue277_45_0 = spill277_1;
        break forward_join_45;
    }
    if (!((spill277_1 != 0))) {
        break forward_join_42;
    }
    spill277_2 = __call277_11(receiver);
    if (!((life6_5 == null))) {
        forwardValue277_45_0 = __integerCategory277_12(spill277_2);
        break forward_join_45;
    }
    if (!((!spill277_2))) {
        break forward_join_42;
    }
    return __integerCategory277_13(0);
    }
    forwardValue277_45_0 = __integerCategory277_15(__call277_14(receiver, p0));
    }
    if (!((life6_5 == null))) {
        forwardValue277_54_0 = forwardValue277_45_0;
        break forward_join_54;
    }
    if (!((forwardValue277_45_0 == 0))) {
        break forward_join_50;
    }
    return __integerCategory277_16(0);
    }
    spill277_3 = receiver;
    if (!((life6_5 == null))) {
        forwardValue277_65_0 = spill277_3;
        break forward_join_65;
    }
    forwardValue277_54_0 = __integerCategory277_18(__fieldRead277_17(spill277_3));
    }
    if (!((forwardValue277_54_0 == 0))) {
        break forward_join_64;
    }
    spill277_4 = receiver;
    if (!((life6_5 == null))) {
        forwardValue277_65_0 = spill277_4;
        break forward_join_65;
    }
    if (!((__call277_20(__fieldRead277_19(spill277_4)) == __fieldRead277_21()))) {
        break forward_join_64;
    }
    return __integerCategory277_22(0);
    }
    forwardValue277_65_0 = receiver;
    }
    life8_106 = __call277_23(forwardValue277_65_0, p0);
    life9_109 = __call277_24(p1);
    life10_114 = __call277_25(life8_106, p0, p1);
    spill277_5 = life10_114;
    if (!((life6_5 == null))) {
        forwardValue277_83_0 = spill277_5;
        break forward_join_83;
    }
    if (!((spill277_5 == null))) {
        break forward_join_82;
    }
    return __integerCategory277_26(0);
    }
    forwardValue277_83_0 = life10_114;
    }
    life11_128 = __call277_27(forwardValue277_83_0);
    spill277_6 = __call277_28(life9_109);
    if (!((life6_5 == null))) {
        forwardValue277_106_0 = spill277_6;
        break forward_join_106;
    }
    if (!((spill277_6 == __call277_29(life11_128)))) {
        break forward_join_99;
    }
    spill277_7 = __call277_30(life9_109);
    spill277_8 = __call277_31(life11_128);
    if (!((life6_5 == null))) {
        forwardValue277_112_0 = spill277_7;
        forwardValue277_112_1 = spill277_8;
        break forward_join_112;
    }
    if (!((spill277_7 != spill277_8))) {
        break forward_join_110;
    }
    }
    __call277_33(__fieldRead277_32(receiver), "checkLight");
    forwardValue277_106_0 = __integerCategory277_35(__call277_34(receiver, p0));
    }
    __discardScalar277_36(forwardValue277_106_0);
    __call277_38(__fieldRead277_37(receiver));
    }
    forwardValue277_112_0 = p2;
    forwardValue277_112_1 = 2;
    }
    spill277_9 = (forwardValue277_112_0 & forwardValue277_112_1);
    if (!((life6_5 == null))) {
        forwardValue277_137_0 = spill277_9;
        break forward_join_137;
    }
    if (!((spill277_9 != 0))) {
        break forward_join_135;
    }
    spill277_10 = __fieldRead277_39(receiver);
    if (!((life6_5 == null))) {
        forwardValue277_129_0 = __integerCategory277_40(spill277_10);
        break forward_join_129;
    }
    if (!(spill277_10)) {
        break forward_join_127;
    }
    spill277_11 = (p2 & 4);
    if (!((life6_5 == null))) {
        forwardValue277_137_0 = spill277_11;
        break forward_join_137;
    }
    if (!((spill277_11 == 0))) {
        break forward_join_135;
    }
    }
    forwardValue277_129_0 = __integerCategory277_42(__call277_41(life8_106));
    }
    if (!((life6_5 == null))) {
        forwardValue277_137_0 = forwardValue277_129_0;
        break forward_join_137;
    }
    if (!((forwardValue277_129_0 != 0))) {
        break forward_join_135;
    }
    __call277_43(receiver, p0);
    }
    forwardValue277_137_0 = __integerCategory277_45(__fieldRead277_44(receiver));
    }
    if (!((life6_5 == null))) {
        forwardValue277_161_0 = forwardValue277_137_0;
        break forward_join_161;
    }
    if (!((forwardValue277_137_0 == 0))) {
        break forward_join_160;
    }
    spill277_12 = (p2 & 1);
    if (!((life6_5 == null))) {
        forwardValue277_161_0 = spill277_12;
        break forward_join_161;
    }
    if (!((spill277_12 != 0))) {
        break forward_join_160;
    }
    __call277_47(receiver, p0, __call277_46(life10_114));
    spill277_13 = __call277_48(life9_109);
    if (!((life6_5 == null))) {
        forwardValue277_161_0 = __integerCategory277_49(spill277_13);
        break forward_join_161;
    }
    if (!(spill277_13)) {
        break forward_join_160;
    }
    __call277_50(receiver, p0, life9_109);
    }
    forwardValue277_161_0 = 1;
    }
    return __integerCategory277_51(forwardValue277_161_0);
}
public static void h277_0(moom.Oo p0) throws Throwable {
    throw __call1027700_0(p0);
}
public static void h277_1(moom.Oo p0) throws Throwable {
    throw __call1027701_0(p0);
}
public static void h277_2(moom.Oo p0) throws Throwable {
    throw __call1027702_0(p0);
}
public static void h277_3(moom.Oo p0) throws Throwable {
    throw __call1027703_0(p0);
}
public static void h277_4(moom.Oo p0) throws Throwable {
    throw __call1027704_0(p0);
}
public static void h277_5(moom.Oo p0) throws Throwable {
    throw __call1027705_0(p0);
}
public static void h277_6(moom.Oo p0) throws Throwable {
    throw __call1027706_0(p0);
}
public static void h277_7(moom.Oo p0) throws Throwable {
    throw __call1027707_0(p0);
}
public static void h277_8(moom.Oo p0) throws Throwable {
    throw __call1027708_0(p0);
}
public static void h277_9(moom.Oo p0) throws Throwable {
    throw __call1027709_0(p0);
}
public static void h277_10(moom.Oo p0) throws Throwable {
    throw __call1027710_0(p0);
}
public static void h277_11(moom.Oo p0) throws Throwable {
    throw __call1027711_0(p0);
}
public static void h277_12(moom.Oo p0) throws Throwable {
    throw __call1027712_0(p0);
}
public static void h277_13(moom.Oo p0) throws Throwable {
    throw __call1027713_0(p0);
}
public static void h277_14(moom.Oo p0) throws Throwable {
    throw __call1027714_0(p0);
}
public static void h277_15(moom.Oo p0) throws Throwable {
    throw __call1027715_0(p0);
}
public static void h277_16(moom.Oo p0) throws Throwable {
    throw __call1027716_0(p0);
}
public static void h277_17(moom.Oo p0) throws Throwable {
    throw __call1027717_0(p0);
}
public static void h277_18(moom.Oo p0) throws Throwable {
    throw __call1027718_0(p0);
}
public static void h277_19(moom.Oo p0) throws Throwable {
    throw __call1027719_0(p0);
}
public static void h277_20(moom.Oo p0) throws Throwable {
    throw __call1027720_0(p0);
}
public static void h277_21(moom.Oo p0) throws Throwable {
    throw __call1027721_0(p0);
}
public static void h277_22(moom.Oo p0) throws Throwable {
    throw __call1027722_0(p0);
}
public static void h277_23(moom.Oo p0) throws Throwable {
    throw __call1027723_0(p0);
}
public static void h277_24(moom.Oo p0) throws Throwable {
    throw __call1027724_0(p0);
}
public static void h277_25(moom.Oo p0) throws Throwable {
    throw __call1027725_0(p0);
}
public static void h277_26(moom.Oo p0) throws Throwable {
    throw __call1027726_0(p0);
}
public static void h277_27(moom.Oo p0) throws Throwable {
    throw __call1027727_0(p0);
}
public static void h277_28(moom.Oo p0) throws Throwable {
    throw __call1027728_0(p0);
}
public static void h277_29(moom.Oo p0) throws Throwable {
    throw __call1027729_0(p0);
}
public static void h277_30(moom.Oo p0) throws Throwable {
    throw __call1027730_0(p0);
}
public static void h277_31(moom.Oo p0) throws Throwable {
    throw __call1027731_0(p0);
}
public static void h277_32(moom.Oo p0) throws Throwable {
    throw __call1027732_0(p0);
}
public static void h277_33(moom.Oo p0) throws Throwable {
    throw __call1027733_0(p0);
}
private static native long __fieldRead277_0() throws Throwable;
private static native java.lang.String __call277_1() throws Throwable;
private static native java.lang.String __call277_2() throws Throwable;
private static native boolean __call277_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory277_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call277_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call277_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native long __call277_7() throws Throwable;
private static native long __call277_8() throws Throwable;
private static native long __invokedynamic277_9(int a0, long a1) throws Throwable;
private static native int __numericCompare277_10(long a0, long a1) throws Throwable;
private static native boolean __call277_11(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory277_12(boolean value) throws Throwable;
private static native boolean __integerCategory277_13(int value) throws Throwable;
private static native boolean __call277_14(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory277_15(boolean value) throws Throwable;
private static native boolean __integerCategory277_16(int value) throws Throwable;
private static native boolean __fieldRead277_17(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory277_18(boolean value) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead277_19(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.WorldType __call277_20(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead277_21() throws Throwable;
private static native boolean __integerCategory277_22(int value) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call277_23(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call277_24(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call277_25(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native boolean __integerCategory277_26(int value) throws Throwable;
private static native net.minecraft.block.Block __call277_27(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call277_28(net.minecraft.block.Block a0) throws Throwable;
private static native int __call277_29(net.minecraft.block.Block a0) throws Throwable;
private static native int __call277_30(net.minecraft.block.Block a0) throws Throwable;
private static native int __call277_31(net.minecraft.block.Block a0) throws Throwable;
private static native moom.A9 __fieldRead277_32(net.minecraft.world.World a0) throws Throwable;
private static native void __call277_33(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __call277_34(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory277_35(boolean value) throws Throwable;
private static native void __discardScalar277_36(int a0) throws Throwable;
private static native moom.A9 __fieldRead277_37(net.minecraft.world.World a0) throws Throwable;
private static native void __call277_38(moom.A9 a0) throws Throwable;
private static native boolean __fieldRead277_39(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory277_40(boolean value) throws Throwable;
private static native boolean __call277_41(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory277_42(boolean value) throws Throwable;
private static native void __call277_43(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native boolean __fieldRead277_44(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory277_45(boolean value) throws Throwable;
private static native net.minecraft.block.Block __call277_46(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call277_47(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native boolean __call277_48(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory277_49(boolean value) throws Throwable;
private static native void __call277_50(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native boolean __integerCategory277_51(int value) throws Throwable;
private static native java.lang.Throwable __call1027700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027707_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027708_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027709_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027710_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027711_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027712_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027713_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027714_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027715_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027716_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027717_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027718_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027719_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027720_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027721_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027722_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027723_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027724_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027725_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027726_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027727_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027728_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027729_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027730_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027731_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027732_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027733_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_43efa0443fe6fb89d342(net.minecraft.world.World a0, moom.DT a1, net.minecraft.tileentity.TileEntity a2) throws E;
private static final class __SourceHandler_43efa0443fe6fb89d342 {

public static void f278(net.minecraft.world.World receiver, moom.DT p0, net.minecraft.tileentity.TileEntity p1) throws Throwable {
    net.minecraft.tileentity.TileEntity lexicalValue278_11_0;
    int lexicalValue278_17_0;
    net.minecraft.tileentity.TileEntity lexicalValue278_44_0;
    int lexicalValue278_53_0;
    int lexicalValue278_59_0;
    net.minecraft.tileentity.TileEntity spill278_0;
    boolean spill278_1;
    net.minecraft.tileentity.TileEntity spill278_2;
    boolean spill278_3;
    long life3_3;
    java.lang.String life5_5;
    java.util.Iterator life6_38;
    net.minecraft.tileentity.TileEntity life7_45;
    lexical_join_66: {
    lexical_join_59: {
    lexical_join_56: {
    lexical_join_53: {
    lexical_join_49: {
    lexical_join_17: {
    lexical_join_11: {
    life3_3 = (__fieldRead278_0() ^ 65678234271793L);
    life5_5 = __call278_1();
    spill278_0 = p1;
    if (!((life5_5 == null))) {
        lexicalValue278_11_0 = spill278_0;
        break lexical_join_11;
    }
    if (!((spill278_0 != null))) {
        break lexical_join_66;
    }
    lexicalValue278_11_0 = p1;
    }
    spill278_1 = __call278_2(lexicalValue278_11_0);
    if (!((life5_5 == null))) {
        lexicalValue278_17_0 = __integerCategory278_3(spill278_1);
        break lexical_join_17;
    }
    if (!((!spill278_1))) {
        break lexical_join_66;
    }
    lexicalValue278_17_0 = __integerCategory278_5(__fieldRead278_4(receiver));
    }
    if (!((life5_5 == null))) {
        lexicalValue278_59_0 = lexicalValue278_17_0;
        break lexical_join_59;
    }
    if (!((lexicalValue278_17_0 != 0))) {
        break lexical_join_56;
    }
    __call278_6(p1, p0);
    life6_38 = __call278_8(__fieldRead278_7(receiver));
    lexical_cycle_27: while (true) {
    lexical_join_47: {
    lexical_join_44: {
    if (!(__call278_9(life6_38))) {
        break lexical_join_49;
    }
    life7_45 = __cast278_11(__call278_10(life6_38));
    spill278_2 = life7_45;
    if (!((life5_5 == null))) {
        lexicalValue278_44_0 = spill278_2;
        break lexical_join_44;
    }
    spill278_3 = __call278_13(__call278_12(spill278_2), p0);
    if (!((life5_5 == null))) {
        lexicalValue278_53_0 = __integerCategory278_14(spill278_3);
        break lexical_join_53;
    }
    if (!(spill278_3)) {
        break lexical_join_47;
    }
    lexicalValue278_44_0 = life7_45;
    }
    __call278_15(lexicalValue278_44_0);
    __call278_16(life6_38);
    }
    if (!((life5_5 != null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    lexicalValue278_53_0 = __integerCategory278_19(__call278_18(__fieldRead278_17(receiver), p1));
    }
    __discardScalar278_20(lexicalValue278_53_0);
    if (!((life5_5 != null))) {
        break lexical_join_66;
    }
    }
    lexicalValue278_59_0 = __integerCategory278_22(__call278_21(receiver, p1));
    }
    __discardScalar278_23(lexicalValue278_59_0);
    __call278_25(__call278_24(receiver, p0), p0, p1);
    }
    return;
}
public static void h278_0(moom.Oo p0) throws Throwable {
    throw __call1027800_0(p0);
}
public static void h278_1(moom.Oo p0) throws Throwable {
    throw __call1027801_0(p0);
}
public static void h278_2(moom.Oo p0) throws Throwable {
    throw __call1027802_0(p0);
}
public static void h278_3(moom.Oo p0) throws Throwable {
    throw __call1027803_0(p0);
}
public static void h278_4(moom.Oo p0) throws Throwable {
    throw __call1027804_0(p0);
}
public static void h278_5(moom.Oo p0) throws Throwable {
    throw __call1027805_0(p0);
}
public static void h278_6(moom.Oo p0) throws Throwable {
    throw __call1027806_0(p0);
}
private static native long __fieldRead278_0() throws Throwable;
private static native java.lang.String __call278_1() throws Throwable;
private static native boolean __call278_2(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __integerCategory278_3(boolean value) throws Throwable;
private static native boolean __fieldRead278_4(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory278_5(boolean value) throws Throwable;
private static native void __call278_6(net.minecraft.tileentity.TileEntity a0, moom.DT a1) throws Throwable;
private static native java.util.List __fieldRead278_7(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call278_8(java.util.List a0) throws Throwable;
private static native boolean __call278_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call278_10(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast278_11(java.lang.Object a0) throws Throwable;
private static native moom.DT __call278_12(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native boolean __call278_13(moom.DT a0, moom.DT a1) throws Throwable;
private static native int __integerCategory278_14(boolean value) throws Throwable;
private static native void __call278_15(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call278_16(java.util.Iterator a0) throws Throwable;
private static native java.util.List __fieldRead278_17(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call278_18(java.util.List a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native int __integerCategory278_19(boolean value) throws Throwable;
private static native void __discardScalar278_20(int a0) throws Throwable;
private static native boolean __call278_21(net.minecraft.world.World a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native int __integerCategory278_22(boolean value) throws Throwable;
private static native void __discardScalar278_23(int a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call278_24(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native void __call278_25(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.tileentity.TileEntity a2) throws Throwable;
private static native java.lang.Throwable __call1027800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027806_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_c935d15358036d35d900(net.minecraft.world.World a0, moom.DT a1, net.minecraft.world.EnumSkyBlock a2) throws E;
private static final class __SourceHandler_c935d15358036d35d900 {

public static int f1699(net.minecraft.world.World receiver, moom.DT p0, net.minecraft.world.EnumSkyBlock p1) throws Throwable {
    net.minecraft.world.World lexicalValue1699_23_0;
    moom.DT lexicalValue1699_23_1;
    int lexicalValue1699_33_0;
    int lexicalValue1699_54_0;
    int lexicalValue1699_55_0;
    int lexicalValue1699_55_1;
    int lexicalValue1699_66_0;
    int lexicalValue1699_66_1;
    int lexicalValue1699_79_0;
    int lexicalValue1699_79_1;
    int lexicalValue1699_81_0;
    int lexicalValue1699_124_0;
    int lexicalValue1699_124_1;
    int lexicalValue1699_126_0;
    int lexicalValue1699_131_0;
    net.minecraft.world.World spill1699_0;
    moom.DT spill1699_1;
    int spill1699_2;
    int spill1699_3;
    int spill1699_4;
    int spill1699_5;
    int spill1699_6;
    int spill1699_7;
    int spill1699_8;
    long life3_3;
    java.lang.String life5_5;
    net.minecraft.block.Block life6_33;
    int life7_43;
    int life8_46;
    moom.bs[] life9_113;
    int life10_116;
    int life11_118;
    moom.bs life12_125;
    moom.DT life13_129;
    int life14_136;
    lexical_join_131: {
    lexical_join_130: {
    lexical_join_82: {
    lexical_join_81: {
    lexical_join_79: {
    lexical_join_71: {
    lexical_join_66: {
    lexical_join_60: {
    lexical_join_55: {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_33: {
    lexical_join_31: {
    lexical_join_23: {
    lexical_join_21: {
    life3_3 = (__fieldRead1699_0() ^ 62907448348547L);
    life5_5 = __call1699_1();
    if (!((p1 == __fieldRead1699_2()))) {
        break lexical_join_21;
    }
    spill1699_0 = receiver;
    spill1699_1 = p0;
    if (!((life5_5 == null))) {
        lexicalValue1699_23_0 = spill1699_0;
        lexicalValue1699_23_1 = spill1699_1;
        break lexical_join_23;
    }
    if (!(__call1699_3(spill1699_0, spill1699_1))) {
        break lexical_join_21;
    }
    return __invokedynamic1699_4(24438, (2603212811164707033L ^ life3_3));
    }
    lexicalValue1699_23_0 = receiver;
    lexicalValue1699_23_1 = p0;
    }
    life6_33 = __call1699_6(__call1699_5(lexicalValue1699_23_0, lexicalValue1699_23_1));
    if (!((p1 == __fieldRead1699_7()))) {
        break lexical_join_31;
    }
    lexicalValue1699_33_0 = 0;
    break lexical_join_33;
    }
    lexicalValue1699_33_0 = __call1699_8(life6_33);
    }
    life7_43 = lexicalValue1699_33_0;
    life8_46 = __call1699_9(life6_33);
    spill1699_2 = life8_46;
    spill1699_3 = __invokedynamic1699_10(24438, (2603212811164707033L ^ life3_3));
    if (!((life5_5 == null))) {
        lexicalValue1699_55_0 = spill1699_2;
        lexicalValue1699_55_1 = spill1699_3;
        break lexical_join_55;
    }
    if (!((spill1699_2 >= spill1699_3))) {
        break lexical_join_53;
    }
    spill1699_4 = __call1699_11(life6_33);
    if (!((life5_5 == null))) {
        lexicalValue1699_54_0 = spill1699_4;
        break lexical_join_54;
    }
    if (!((spill1699_4 > 0))) {
        break lexical_join_53;
    }
    life8_46 = 1;
    }
    lexicalValue1699_54_0 = life8_46;
    }
    lexicalValue1699_55_0 = lexicalValue1699_54_0;
    lexicalValue1699_55_1 = 1;
    }
    if (!((life5_5 == null))) {
        lexicalValue1699_66_0 = lexicalValue1699_55_0;
        lexicalValue1699_66_1 = lexicalValue1699_55_1;
        break lexical_join_66;
    }
    if (!((lexicalValue1699_55_0 < lexicalValue1699_55_1))) {
        break lexical_join_60;
    }
    life8_46 = 1;
    }
    lexicalValue1699_66_0 = life8_46;
    lexicalValue1699_66_1 = __invokedynamic1699_12(24438, (2603212811164707033L ^ life3_3));
    }
    if (!((life5_5 == null))) {
        lexicalValue1699_79_0 = lexicalValue1699_66_0;
        lexicalValue1699_79_1 = lexicalValue1699_66_1;
        break lexical_join_79;
    }
    if (!((lexicalValue1699_66_0 >= lexicalValue1699_66_1))) {
        break lexical_join_71;
    }
    return 0;
    }
    spill1699_5 = life7_43;
    if (!((life5_5 == null))) {
        lexicalValue1699_81_0 = spill1699_5;
        break lexical_join_81;
    }
    lexicalValue1699_79_0 = spill1699_5;
    lexicalValue1699_79_1 = __invokedynamic1699_13(10162, (5242276941452087317L ^ life3_3));
    }
    if (!((lexicalValue1699_79_0 >= lexicalValue1699_79_1))) {
        break lexical_join_82;
    }
    lexicalValue1699_81_0 = life7_43;
    }
    return lexicalValue1699_81_0;
    }
    life9_113 = __call1699_14();
    life10_116 = (life9_113).length;
    life11_118 = 0;
    lexical_cycle_89: while (true) {
    lexical_join_127: {
    lexical_join_126: {
    lexical_join_124: {
    lexical_join_116: {
    if (!((life11_118 < life10_116))) {
        break lexical_join_130;
    }
    life12_125 = (life9_113)[life11_118];
    life13_129 = __call1699_15(p0, life12_125);
    life14_136 = (__call1699_16(receiver, p1, life13_129) - life8_46);
    spill1699_6 = life14_136;
    if (!((life5_5 == null))) {
        lexicalValue1699_131_0 = spill1699_6;
        break lexical_join_131;
    }
    spill1699_7 = life7_43;
    if (!((life5_5 == null))) {
        lexicalValue1699_124_0 = spill1699_6;
        lexicalValue1699_124_1 = spill1699_7;
        break lexical_join_124;
    }
    if (!((spill1699_6 > spill1699_7))) {
        break lexical_join_116;
    }
    life7_43 = life14_136;
    }
    spill1699_8 = life7_43;
    if (!((life5_5 == null))) {
        lexicalValue1699_126_0 = spill1699_8;
        break lexical_join_126;
    }
    lexicalValue1699_124_0 = spill1699_8;
    lexicalValue1699_124_1 = __invokedynamic1699_17(30843, (7419478042366562245L ^ life3_3));
    }
    if (!((lexicalValue1699_124_0 >= lexicalValue1699_124_1))) {
        break lexical_join_127;
    }
    lexicalValue1699_126_0 = life7_43;
    }
    return lexicalValue1699_126_0;
    }
    life11_118 += 1;
    if (!((life5_5 != null))) { continue lexical_cycle_89; }
    break lexical_cycle_89;
    }
    }
    lexicalValue1699_131_0 = life7_43;
    }
    return lexicalValue1699_131_0;
}
public static void h1699_0(moom.Oo p0) throws Throwable {
    throw __call1169900_0(p0);
}
public static void h1699_1(moom.Oo p0) throws Throwable {
    throw __call1169901_0(p0);
}
public static void h1699_2(moom.Oo p0) throws Throwable {
    throw __call1169902_0(p0);
}
public static void h1699_3(moom.Oo p0) throws Throwable {
    throw __call1169903_0(p0);
}
public static void h1699_4(moom.Oo p0) throws Throwable {
    throw __call1169904_0(p0);
}
public static void h1699_5(moom.Oo p0) throws Throwable {
    throw __call1169905_0(p0);
}
public static void h1699_6(moom.Oo p0) throws Throwable {
    throw __call1169906_0(p0);
}
public static void h1699_7(moom.Oo p0) throws Throwable {
    throw __call1169907_0(p0);
}
public static void h1699_8(moom.Oo p0) throws Throwable {
    throw __call1169908_0(p0);
}
public static void h1699_9(moom.Oo p0) throws Throwable {
    throw __call1169909_0(p0);
}
public static void h1699_10(moom.Oo p0) throws Throwable {
    throw __call1169910_0(p0);
}
public static void h1699_11(moom.Oo p0) throws Throwable {
    throw __call1169911_0(p0);
}
public static void h1699_12(moom.Oo p0) throws Throwable {
    throw __call1169912_0(p0);
}
public static void h1699_13(moom.Oo p0) throws Throwable {
    throw __call1169913_0(p0);
}
private static native long __fieldRead1699_0() throws Throwable;
private static native java.lang.String __call1699_1() throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1699_2() throws Throwable;
private static native boolean __call1699_3(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __invokedynamic1699_4(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1699_5(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1699_6(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1699_7() throws Throwable;
private static native int __call1699_8(net.minecraft.block.Block a0) throws Throwable;
private static native int __call1699_9(net.minecraft.block.Block a0) throws Throwable;
private static native int __invokedynamic1699_10(int a0, long a1) throws Throwable;
private static native int __call1699_11(net.minecraft.block.Block a0) throws Throwable;
private static native int __invokedynamic1699_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic1699_13(int a0, long a1) throws Throwable;
private static native moom.bs[] __call1699_14() throws Throwable;
private static native moom.DT __call1699_15(moom.DT a0, moom.bs a1) throws Throwable;
private static native int __call1699_16(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1699_17(int a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1169900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169910_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169911_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169912_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1169913_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_cf2c2e6b454d72bad5c0(net.minecraft.world.World a0, moom.DT a1, boolean a2) throws E;
private static final class __SourceHandler_cf2c2e6b454d72bad5c0 {

public static int f1700(net.minecraft.world.World receiver, moom.DT p0, boolean p1) throws Throwable {
    int forwardValue1700_97_0;
    int forwardValue1700_97_1;
    int forwardValue1700_104_0;
    int forwardValue1700_104_1;
    int forwardValue1700_113_0;
    int forwardValue1700_113_1;
    int forwardValue1700_117_0;
    int forwardValue1700_120_0;
    int forwardValue1700_129_0;
    moom.DT forwardValue1700_147_0;
    int forwardValue1700_163_0;
    int spill1700_0;
    int spill1700_1;
    int spill1700_2;
    int spill1700_3;
    boolean spill1700_4;
    boolean spill1700_5;
    int spill1700_6;
    int spill1700_7;
    int spill1700_8;
    moom.DT spill1700_9;
    long life3_3;
    java.lang.String life5_5;
    int life6_96;
    int life7_102;
    int life8_108;
    int life9_114;
    int life10_120;
    net.minecraft.world.chunk.Chunk life6_207;
    forward_join_163: {
    forward_join_158: {
    forward_join_148: {
    forward_join_147: {
    forward_join_129: {
    forward_join_125: {
    forward_join_120: {
    forward_join_118: {
    forward_join_117: {
    forward_join_116: {
    forward_join_113: {
    forward_join_109: {
    forward_join_104: {
    forward_join_102: {
    forward_join_97: {
    forward_join_95: {
    life3_3 = (__fieldRead1700_0() ^ 67682743677191L);
    life5_5 = __call1700_1();
    spill1700_0 = __call1700_2(p0);
    if (!((life5_5 == null))) {
        forwardValue1700_163_0 = spill1700_0;
        break forward_join_163;
    }
    if (!((spill1700_0 >= __invokedynamic1700_3(20188, (2672931171573745600L ^ life3_3))))) {
        break forward_join_158;
    }
    spill1700_1 = __call1700_4(p0);
    if (!((life5_5 == null))) {
        forwardValue1700_163_0 = spill1700_1;
        break forward_join_163;
    }
    if (!((spill1700_1 >= __invokedynamic1700_5(20188, (2672931171573745600L ^ life3_3))))) {
        break forward_join_158;
    }
    spill1700_2 = __call1700_6(p0);
    if (!((life5_5 == null))) {
        forwardValue1700_163_0 = spill1700_2;
        break forward_join_163;
    }
    if (!((spill1700_2 < __invokedynamic1700_7(14058, (675777600317702143L ^ life3_3))))) {
        break forward_join_158;
    }
    spill1700_3 = __call1700_8(p0);
    if (!((life5_5 == null))) {
        forwardValue1700_163_0 = spill1700_3;
        break forward_join_163;
    }
    if (!((spill1700_3 < __invokedynamic1700_9(14058, (675777600317702143L ^ life3_3))))) {
        break forward_join_158;
    }
    spill1700_4 = p1;
    if (!((life5_5 == null))) {
        forwardValue1700_120_0 = __integerCategory1700_10(spill1700_4);
        break forward_join_120;
    }
    if (!(spill1700_4)) {
        break forward_join_118;
    }
    spill1700_5 = __call1700_13(__call1700_12(__call1700_11(receiver, p0)));
    if (!((life5_5 == null))) {
        forwardValue1700_120_0 = __integerCategory1700_14(spill1700_5);
        break forward_join_120;
    }
    if (!(spill1700_5)) {
        break forward_join_118;
    }
    life6_96 = __call1700_16(receiver, __call1700_15(p0), 0);
    life7_102 = __call1700_18(receiver, __call1700_17(p0), 0);
    life8_108 = __call1700_20(receiver, __call1700_19(p0), 0);
    life9_114 = __call1700_22(receiver, __call1700_21(p0), 0);
    life10_120 = __call1700_24(receiver, __call1700_23(p0), 0);
    spill1700_6 = life7_102;
    spill1700_7 = life6_96;
    if (!((life5_5 == null))) {
        forwardValue1700_97_0 = spill1700_6;
        forwardValue1700_97_1 = spill1700_7;
        break forward_join_97;
    }
    if (!((spill1700_6 > spill1700_7))) {
        break forward_join_95;
    }
    life6_96 = life7_102;
    }
    forwardValue1700_97_0 = life8_108;
    forwardValue1700_97_1 = life6_96;
    }
    if (!((life5_5 == null))) {
        forwardValue1700_104_0 = forwardValue1700_97_0;
        forwardValue1700_104_1 = forwardValue1700_97_1;
        break forward_join_104;
    }
    if (!((forwardValue1700_97_0 > forwardValue1700_97_1))) {
        break forward_join_102;
    }
    life6_96 = life8_108;
    }
    forwardValue1700_104_0 = life9_114;
    forwardValue1700_104_1 = life6_96;
    }
    if (!((life5_5 == null))) {
        forwardValue1700_113_0 = forwardValue1700_104_0;
        forwardValue1700_113_1 = forwardValue1700_104_1;
        break forward_join_113;
    }
    if (!((forwardValue1700_104_0 > forwardValue1700_104_1))) {
        break forward_join_109;
    }
    life6_96 = life9_114;
    }
    spill1700_8 = life10_120;
    if (!((life5_5 == null))) {
        forwardValue1700_117_0 = spill1700_8;
        break forward_join_117;
    }
    forwardValue1700_113_0 = spill1700_8;
    forwardValue1700_113_1 = life6_96;
    }
    if (!((forwardValue1700_113_0 > forwardValue1700_113_1))) {
        break forward_join_116;
    }
    life6_96 = life10_120;
    }
    forwardValue1700_117_0 = life6_96;
    }
    return forwardValue1700_117_0;
    }
    forwardValue1700_120_0 = __call1700_25(p0);
    }
    if (!((life5_5 == null))) {
        forwardValue1700_129_0 = forwardValue1700_120_0;
        break forward_join_129;
    }
    if (!((forwardValue1700_120_0 < 0))) {
        break forward_join_125;
    }
    return 0;
    }
    spill1700_9 = p0;
    if (!((life5_5 == null))) {
        forwardValue1700_147_0 = spill1700_9;
        break forward_join_147;
    }
    forwardValue1700_129_0 = __call1700_26(spill1700_9);
    }
    if (!((forwardValue1700_129_0 >= __invokedynamic1700_27(5123, (1626584008123292954L ^ life3_3))))) {
        break forward_join_148;
    }
    forwardValue1700_147_0 = new moom.DT(__call1700_28(p0), __invokedynamic1700_29(3671, (3254510158409992051L ^ life3_3)), __call1700_30(p0));
    }
    p0 = forwardValue1700_147_0;
    }
    life6_207 = __call1700_31(receiver, p0);
    return __call1700_33(life6_207, p0, __fieldRead1700_32(receiver));
    }
    forwardValue1700_163_0 = __invokedynamic1700_34(24438, (2603217998639519325L ^ life3_3));
    }
    return forwardValue1700_163_0;
}
public static void h1700_0(moom.Oo p0) throws Throwable {
    throw __call1170000_0(p0);
}
public static void h1700_1(moom.Oo p0) throws Throwable {
    throw __call1170001_0(p0);
}
public static void h1700_2(moom.Oo p0) throws Throwable {
    throw __call1170002_0(p0);
}
public static void h1700_3(moom.Oo p0) throws Throwable {
    throw __call1170003_0(p0);
}
public static void h1700_4(moom.Oo p0) throws Throwable {
    throw __call1170004_0(p0);
}
public static void h1700_5(moom.Oo p0) throws Throwable {
    throw __call1170005_0(p0);
}
public static void h1700_6(moom.Oo p0) throws Throwable {
    throw __call1170006_0(p0);
}
public static void h1700_7(moom.Oo p0) throws Throwable {
    throw __call1170007_0(p0);
}
public static void h1700_8(moom.Oo p0) throws Throwable {
    throw __call1170008_0(p0);
}
public static void h1700_9(moom.Oo p0) throws Throwable {
    throw __call1170009_0(p0);
}
public static void h1700_10(moom.Oo p0) throws Throwable {
    throw __call1170010_0(p0);
}
public static void h1700_11(moom.Oo p0) throws Throwable {
    throw __call1170011_0(p0);
}
public static void h1700_12(moom.Oo p0) throws Throwable {
    throw __call1170012_0(p0);
}
public static void h1700_13(moom.Oo p0) throws Throwable {
    throw __call1170013_0(p0);
}
public static void h1700_14(moom.Oo p0) throws Throwable {
    throw __call1170014_0(p0);
}
public static void h1700_15(moom.Oo p0) throws Throwable {
    throw __call1170015_0(p0);
}
public static void h1700_16(moom.Oo p0) throws Throwable {
    throw __call1170016_0(p0);
}
public static void h1700_17(moom.Oo p0) throws Throwable {
    throw __call1170017_0(p0);
}
public static void h1700_18(moom.Oo p0) throws Throwable {
    throw __call1170018_0(p0);
}
private static native long __fieldRead1700_0() throws Throwable;
private static native java.lang.String __call1700_1() throws Throwable;
private static native int __call1700_2(moom.DT a0) throws Throwable;
private static native int __invokedynamic1700_3(int a0, long a1) throws Throwable;
private static native int __call1700_4(moom.DT a0) throws Throwable;
private static native int __invokedynamic1700_5(int a0, long a1) throws Throwable;
private static native int __call1700_6(moom.DT a0) throws Throwable;
private static native int __invokedynamic1700_7(int a0, long a1) throws Throwable;
private static native int __call1700_8(moom.DT a0) throws Throwable;
private static native int __invokedynamic1700_9(int a0, long a1) throws Throwable;
private static native int __integerCategory1700_10(boolean value) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1700_11(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1700_12(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call1700_13(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory1700_14(boolean value) throws Throwable;
private static native moom.DT __call1700_15(moom.DT a0) throws Throwable;
private static native int __call1700_16(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native moom.DT __call1700_17(moom.DT a0) throws Throwable;
private static native int __call1700_18(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native moom.DT __call1700_19(moom.DT a0) throws Throwable;
private static native int __call1700_20(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native moom.DT __call1700_21(moom.DT a0) throws Throwable;
private static native int __call1700_22(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native moom.DT __call1700_23(moom.DT a0) throws Throwable;
private static native int __call1700_24(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native int __call1700_25(moom.DT a0) throws Throwable;
private static native int __call1700_26(moom.DT a0) throws Throwable;
private static native int __invokedynamic1700_27(int a0, long a1) throws Throwable;
private static native int __call1700_28(moom.DT a0) throws Throwable;
private static native int __invokedynamic1700_29(int a0, long a1) throws Throwable;
private static native int __call1700_30(moom.DT a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1700_31(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __fieldRead1700_32(net.minecraft.world.World a0) throws Throwable;
private static native int __call1700_33(net.minecraft.world.chunk.Chunk a0, moom.DT a1, int a2) throws Throwable;
private static native int __invokedynamic1700_34(int a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1170000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170018_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e13073f4ab986f210b17(net.minecraft.world.World a0, moom.G2 a1) throws E;
private static final class __SourceHandler_e13073f4ab986f210b17 {

public static boolean f1701(net.minecraft.world.World receiver, moom.G2 p0) throws Throwable {
    int forwardValue1701_24_0;
    int forwardValue1701_28_0;
    int forwardValue1701_30_0;
    int forwardValue1701_46_0;
    boolean spill1701_0;
    int spill1701_1;
    boolean spill1701_2;
    long life2_3;
    java.lang.String life4_5;
    int life5_42;
    forward_join_46: {
    forward_join_42: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life2_3 = (__fieldRead1701_0() ^ 51265840637628L);
    life4_5 = __call1701_1();
    spill1701_0 = __call1701_3(__call1701_2(), "\n");
    if (!((life4_5 == null))) {
        forwardValue1701_24_0 = __integerCategory1701_4(spill1701_0);
        break forward_join_24;
    }
    if (!(spill1701_0)) {
        break forward_join_15;
    }
    if (!((__call1701_6(__call1701_5()) == null))) {
        break forward_join_29;
    }
    }
    forwardValue1701_24_0 = __numericCompare1701_10((__call1701_7() - __call1701_8()), __invokedynamic1701_9(3626, (7412698748783513822L ^ life2_3)));
    }
    if (!((life4_5 == null))) {
        forwardValue1701_28_0 = forwardValue1701_24_0;
        break forward_join_28;
    }
    if (!((forwardValue1701_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue1701_28_0 = 1;
    }
    forwardValue1701_30_0 = forwardValue1701_28_0;
    break forward_join_30;
    }
    forwardValue1701_30_0 = 0;
    }
    life5_42 = forwardValue1701_30_0;
    spill1701_1 = life5_42;
    if (!((life4_5 == null))) {
        forwardValue1701_46_0 = spill1701_1;
        break forward_join_46;
    }
    if (!((spill1701_1 != 0))) {
        break forward_join_42;
    }
    spill1701_2 = __call1701_11(receiver);
    if (!((life4_5 == null))) {
        forwardValue1701_46_0 = __integerCategory1701_12(spill1701_2);
        break forward_join_46;
    }
    if (!((!spill1701_2))) {
        break forward_join_42;
    }
    return __integerCategory1701_13(0);
    }
    forwardValue1701_46_0 = __integerCategory1701_15(__call1701_14(receiver, p0, 1));
    }
    return __integerCategory1701_16(forwardValue1701_46_0);
}
public static void h1701_0(moom.Oo p0) throws Throwable {
    throw __call1170100_0(p0);
}
public static void h1701_1(moom.Oo p0) throws Throwable {
    throw __call1170101_0(p0);
}
public static void h1701_2(moom.Oo p0) throws Throwable {
    throw __call1170102_0(p0);
}
public static void h1701_3(moom.Oo p0) throws Throwable {
    throw __call1170103_0(p0);
}
public static void h1701_4(moom.Oo p0) throws Throwable {
    throw __call1170104_0(p0);
}
public static void h1701_5(moom.Oo p0) throws Throwable {
    throw __call1170105_0(p0);
}
public static void h1701_6(moom.Oo p0) throws Throwable {
    throw __call1170106_0(p0);
}
public static void h1701_7(moom.Oo p0) throws Throwable {
    throw __call1170107_0(p0);
}
private static native long __fieldRead1701_0() throws Throwable;
private static native java.lang.String __call1701_1() throws Throwable;
private static native java.lang.String __call1701_2() throws Throwable;
private static native boolean __call1701_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1701_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call1701_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call1701_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native long __call1701_7() throws Throwable;
private static native long __call1701_8() throws Throwable;
private static native long __invokedynamic1701_9(int a0, long a1) throws Throwable;
private static native int __numericCompare1701_10(long a0, long a1) throws Throwable;
private static native boolean __call1701_11(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1701_12(boolean value) throws Throwable;
private static native boolean __integerCategory1701_13(int value) throws Throwable;
private static native boolean __call1701_14(net.minecraft.world.World a0, moom.G2 a1, int a2) throws Throwable;
private static native int __integerCategory1701_15(boolean value) throws Throwable;
private static native boolean __integerCategory1701_16(int value) throws Throwable;
private static native java.lang.Throwable __call1170100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170107_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.qZ __sourceHandlerCall_972522b6fd92a71b2564(net.minecraft.world.World a0, moom.qY a1) throws E;
private static final class __SourceHandler_972522b6fd92a71b2564 {

public static moom.qZ f715(net.minecraft.world.World receiver, moom.qY p0) throws Throwable {
    moom.qZ forwardValue715_20_0;
    java.lang.String forwardValue715_20_1;
    moom.qZ forwardValue715_22_0;
    java.lang.String forwardValue715_22_1;
    net.minecraft.world.storage.WorldInfo forwardValue715_22_2;
    moom.qZ forwardValue715_23_0;
    java.lang.String forwardValue715_23_1;
    java.lang.String forwardValue715_23_2;
    java.lang.String spill715_0;
    moom.qZ spill715_1;
    java.lang.String spill715_2;
    net.minecraft.world.storage.WorldInfo spill715_3;
    long life2_3;
    moom.qZ life5_9;
    java.lang.String life4_10;
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (__fieldRead715_0() ^ 104224877790207L);
    spill715_0 = __call715_1();
    life5_9 = __call715_2(p0, "Affected level", 1);
    life4_10 = spill715_0;
    spill715_1 = life5_9;
    spill715_2 = "Level name";
    spill715_3 = __fieldRead715_3(receiver);
    if (!((life4_10 == null))) {
        forwardValue715_22_0 = spill715_1;
        forwardValue715_22_1 = spill715_2;
        forwardValue715_22_2 = spill715_3;
        break forward_join_22;
    }
    if (!((spill715_3 == null))) {
        forwardValue715_20_0 = spill715_1;
        forwardValue715_20_1 = spill715_2;
        break forward_join_20;
    }
    forwardValue715_23_0 = spill715_1;
    forwardValue715_23_1 = spill715_2;
    forwardValue715_23_2 = "????";
    break forward_join_23;
    }
    forwardValue715_22_0 = forwardValue715_20_0;
    forwardValue715_22_1 = forwardValue715_20_1;
    forwardValue715_22_2 = __fieldRead715_4(receiver);
    }
    forwardValue715_23_0 = forwardValue715_22_0;
    forwardValue715_23_1 = forwardValue715_22_1;
    forwardValue715_23_2 = __call715_5(forwardValue715_22_2);
    }
    __call715_6(forwardValue715_23_0, forwardValue715_23_1, forwardValue715_23_2);
    __call715_8(life5_9, "All players", __invokedynamic715_7(receiver));
    __call715_10(life5_9, "Chunk stats", __invokedynamic715_9(receiver));
    __call715_12(__fieldRead715_11(receiver), life5_9);
    return life5_9;
}
public static moom.qZ h715_0(java.lang.Throwable p0) throws Throwable {
    throw __call2071500_0(p0);
}
public static moom.qZ h715_1(java.lang.Throwable p0) throws Throwable {
    throw __call2071501_0(p0);
}
public static moom.qZ h715_2(java.lang.Throwable p0, moom.qZ p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2071502_0(p1, "Level Data Unobtainable", local2);
    return p1;
}
private static native long __fieldRead715_0() throws Throwable;
private static native java.lang.String __call715_1() throws Throwable;
private static native moom.qZ __call715_2(moom.qY a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead715_3(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead715_4(net.minecraft.world.World a0) throws Throwable;
private static native java.lang.String __call715_5(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call715_6(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic715_7(net.minecraft.world.World a0) throws Throwable;
private static native void __call715_8(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic715_9(net.minecraft.world.World a0) throws Throwable;
private static native void __call715_10(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead715_11(net.minecraft.world.World a0) throws Throwable;
private static native void __call715_12(net.minecraft.world.storage.WorldInfo a0, moom.qZ a1) throws Throwable;
private static native java.lang.Throwable __call2071500_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2071501_0(java.lang.Throwable a0) throws Throwable;
private static native void __call2071502_0(moom.qZ a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ee4a90c086dc6a14c778(net.minecraft.world.World a0, net.minecraft.block.Block a1, moom.DT a2, boolean a3, moom.bs a4, net.minecraft.entity.Entity a5, net.minecraft.item.ItemStack a6) throws E;
private static final class __SourceHandler_ee4a90c086dc6a14c778 {

public static boolean f1702(net.minecraft.world.World receiver, net.minecraft.block.Block p0, moom.DT p1, boolean p2, moom.bs p3, net.minecraft.entity.Entity p4, net.minecraft.item.ItemStack p5) throws Throwable {
    moom.CA forwardValue1702_21_0;
    net.minecraft.block.Block forwardValue1702_41_0;
    moom.fn forwardValue1702_42_0;
    int forwardValue1702_52_0;
    int forwardValue1702_56_0;
    int forwardValue1702_58_0;
    java.lang.String spill1702_0;
    moom.fn spill1702_1;
    net.minecraft.block.Block spill1702_2;
    boolean spill1702_3;
    long life7_3;
    net.minecraft.block.Block life10_9;
    java.lang.String life9_10;
    moom.CA life11_23;
    forward_join_58: {
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_52: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_29: {
    forward_join_21: {
    forward_join_15: {
    life7_3 = (__fieldRead1702_0() ^ 114422367572958L);
    spill1702_0 = __call1702_1();
    life10_9 = __call1702_3(__call1702_2(receiver, p1));
    life9_10 = spill1702_0;
    if (!(p2)) {
        break forward_join_15;
    }
    forwardValue1702_21_0 = null;
    break forward_join_21;
    }
    forwardValue1702_21_0 = __call1702_5(p0, receiver, p1, __call1702_4(p0));
    }
    life11_23 = forwardValue1702_21_0;
    if (!((life11_23 != null))) {
        break forward_join_29;
    }
    if (!(__call1702_6(receiver, life11_23, p4))) {
        break forward_join_57;
    }
    }
    spill1702_1 = __call1702_7(life10_9);
    if (!((life9_10 == null))) {
        forwardValue1702_42_0 = spill1702_1;
        break forward_join_42;
    }
    if (!((spill1702_1 == __fieldRead1702_8()))) {
        break forward_join_40;
    }
    spill1702_2 = p0;
    if (!((life9_10 == null))) {
        forwardValue1702_41_0 = spill1702_2;
        break forward_join_41;
    }
    if (!((spill1702_2 != __fieldRead1702_9()))) {
        break forward_join_55;
    }
    }
    forwardValue1702_41_0 = life10_9;
    }
    forwardValue1702_42_0 = __call1702_10(forwardValue1702_41_0);
    }
    spill1702_3 = __call1702_11(forwardValue1702_42_0);
    if (!((life9_10 == null))) {
        forwardValue1702_52_0 = __integerCategory1702_12(spill1702_3);
        break forward_join_52;
    }
    if (!(spill1702_3)) {
        break forward_join_57;
    }
    forwardValue1702_52_0 = __integerCategory1702_14(__call1702_13(p0, receiver, p1, p3, p5));
    }
    if (!((life9_10 == null))) {
        forwardValue1702_56_0 = forwardValue1702_52_0;
        break forward_join_56;
    }
    if (!((forwardValue1702_52_0 != 0))) {
        break forward_join_57;
    }
    }
    forwardValue1702_56_0 = 1;
    }
    forwardValue1702_58_0 = forwardValue1702_56_0;
    break forward_join_58;
    }
    forwardValue1702_58_0 = 0;
    }
    return __integerCategory1702_15(forwardValue1702_58_0);
}
public static void h1702_0(moom.Oo p0) throws Throwable {
    throw __call1170200_0(p0);
}
public static void h1702_1(moom.Oo p0) throws Throwable {
    throw __call1170201_0(p0);
}
public static void h1702_2(moom.Oo p0) throws Throwable {
    throw __call1170202_0(p0);
}
public static void h1702_3(moom.Oo p0) throws Throwable {
    throw __call1170203_0(p0);
}
public static void h1702_4(moom.Oo p0) throws Throwable {
    throw __call1170204_0(p0);
}
public static void h1702_5(moom.Oo p0) throws Throwable {
    throw __call1170205_0(p0);
}
public static void h1702_6(moom.Oo p0) throws Throwable {
    throw __call1170206_0(p0);
}
public static void h1702_7(moom.Oo p0) throws Throwable {
    throw __call1170207_0(p0);
}
public static void h1702_8(moom.Oo p0) throws Throwable {
    throw __call1170208_0(p0);
}
public static void h1702_9(moom.Oo p0) throws Throwable {
    throw __call1170209_0(p0);
}
private static native long __fieldRead1702_0() throws Throwable;
private static native java.lang.String __call1702_1() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1702_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1702_3(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1702_4(net.minecraft.block.Block a0) throws Throwable;
private static native moom.CA __call1702_5(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3) throws Throwable;
private static native boolean __call1702_6(net.minecraft.world.World a0, moom.CA a1, net.minecraft.entity.Entity a2) throws Throwable;
private static native moom.fn __call1702_7(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1702_8() throws Throwable;
private static native net.minecraft.block.Block __fieldRead1702_9() throws Throwable;
private static native moom.fn __call1702_10(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call1702_11(moom.fn a0) throws Throwable;
private static native int __integerCategory1702_12(boolean value) throws Throwable;
private static native boolean __call1702_13(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, moom.bs a3, net.minecraft.item.ItemStack a4) throws Throwable;
private static native int __integerCategory1702_14(boolean value) throws Throwable;
private static native boolean __integerCategory1702_15(int value) throws Throwable;
private static native java.lang.Throwable __call1170200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170209_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_5459ae8946b2b2a3a71f(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, float a2) throws E;
private static final class __SourceHandler_5459ae8946b2b2a3a71f {

public static moom.DR f1703(net.minecraft.world.World receiver, net.minecraft.entity.Entity p0, float p1) throws Throwable {
    float forwardValue1703_177_0;
    int forwardValue1703_236_0;
    int forwardValue1703_241_0;
    float forwardValue1703_283_0;
    float forwardValue1703_283_1;
    moom.DR forwardValue1703_299_0;
    java.lang.String spill1703_0;
    float spill1703_1;
    int spill1703_2;
    float spill1703_3;
    float spill1703_4;
    moom.DR spill1703_5;
    long life3_3;
    float life6_8;
    float life7_19;
    float life7_24;
    int life8_28;
    int life9_32;
    int life10_36;
    moom.DT life11_43;
    net.minecraft.world.biome.BiomeGenBase life12_47;
    float life13_51;
    int life14_55;
    float life15_72;
    float life16_89;
    float life17_100;
    float life15_104;
    float life16_108;
    float life17_112;
    float life18_116;
    java.lang.String life5_117;
    float life19_140;
    float life20_146;
    float life19_180;
    float life20_203;
    float life21_209;
    float life20_256;
    float life20_271;
    forward_join_299: {
    forward_join_285: {
    forward_join_283: {
    forward_join_253: {
    forward_join_241: {
    forward_join_236: {
    forward_join_234: {
    forward_join_177: {
    forward_join_174: {
    life3_3 = (__fieldRead1703_0() ^ 41041342547833L);
    spill1703_0 = __call1703_1();
    life6_8 = __call1703_2(receiver, p1);
    life7_19 = ((__call1703_3(((life6_8 * 0x1.921fb6p1f) * 0x1.0p1f)) * 0x1.0p1f) + 0x1.0p-1f);
    life7_24 = __call1703_4(life7_19, 0x0.0p0f, 0x1.0p0f);
    life8_28 = __call1703_6(__fieldRead1703_5(p0));
    life9_32 = __call1703_8(__fieldRead1703_7(p0));
    life10_36 = __call1703_10(__fieldRead1703_9(p0));
    life11_43 = new moom.DT(life8_28, life9_32, life10_36);
    life12_47 = __call1703_11(receiver, life11_43);
    life13_51 = __call1703_12(life12_47, life11_43);
    life14_55 = __call1703_13(life12_47, life13_51);
    life15_72 = (((float) ((life14_55 >> __invokedynamic1703_14(4563, (7598560313410105013L ^ life3_3))) & __invokedynamic1703_15(3671, (3254500970682233101L ^ life3_3)))) / 0x1.fep7f);
    life16_89 = (((float) ((life14_55 >> __invokedynamic1703_16(16662, (7984226368024542806L ^ life3_3))) & __invokedynamic1703_17(3671, (3254500970682233101L ^ life3_3)))) / 0x1.fep7f);
    life17_100 = (((float) (life14_55 & __invokedynamic1703_18(3671, (3254500970682233101L ^ life3_3)))) / 0x1.fep7f);
    life15_104 = (life15_72 * life7_24);
    life16_108 = (life16_89 * life7_24);
    life17_112 = (life17_100 * life7_24);
    life18_116 = __call1703_19(receiver, p1);
    life5_117 = spill1703_0;
    spill1703_1 = life18_116;
    if (!((life5_117 == null))) {
        forwardValue1703_177_0 = spill1703_1;
        break forward_join_177;
    }
    if (!((__numericCompare1703_20(spill1703_1, 0x0.0p0f) > 0))) {
        break forward_join_174;
    }
    life19_140 = ((((life15_104 * 0x1.333334p-2f) + (life16_108 * 0x1.2e147ap-1f)) + (life17_112 * 0x1.c28f5cp-4f)) * 0x1.333334p-1f);
    life20_146 = (0x1.0p0f - (life18_116 * 0x1.8p-1f));
    life15_104 = ((life15_104 * life20_146) + (life19_140 * (0x1.0p0f - life20_146)));
    life16_108 = ((life16_108 * life20_146) + (life19_140 * (0x1.0p0f - life20_146)));
    life17_112 = ((life17_112 * life20_146) + (life19_140 * (0x1.0p0f - life20_146)));
    }
    forwardValue1703_177_0 = __call1703_21(receiver, p1);
    }
    life19_180 = forwardValue1703_177_0;
    spill1703_2 = __numericCompare1703_22(life19_180, 0x0.0p0f);
    if (!((life5_117 == null))) {
        forwardValue1703_236_0 = spill1703_2;
        break forward_join_236;
    }
    if (!((spill1703_2 > 0))) {
        break forward_join_234;
    }
    life20_203 = ((((life15_104 * 0x1.333334p-2f) + (life16_108 * 0x1.2e147ap-1f)) + (life17_112 * 0x1.c28f5cp-4f)) * 0x1.99999ap-3f);
    life21_209 = (0x1.0p0f - (life19_180 * 0x1.8p-1f));
    life15_104 = ((life15_104 * life21_209) + (life20_203 * (0x1.0p0f - life21_209)));
    life16_108 = ((life16_108 * life21_209) + (life20_203 * (0x1.0p0f - life21_209)));
    life17_112 = ((life17_112 * life21_209) + (life20_203 * (0x1.0p0f - life21_209)));
    }
    forwardValue1703_236_0 = __fieldRead1703_23(receiver);
    }
    if (!((life5_117 == null))) {
        forwardValue1703_241_0 = forwardValue1703_236_0;
        break forward_join_241;
    }
    if (!((forwardValue1703_236_0 > 0))) {
        break forward_join_285;
    }
    forwardValue1703_241_0 = __fieldRead1703_24(receiver);
    }
    life20_256 = (((float) forwardValue1703_241_0) - p1);
    spill1703_3 = life20_256;
    spill1703_4 = 0x1.0p0f;
    if (!((life5_117 == null))) {
        forwardValue1703_283_0 = spill1703_3;
        forwardValue1703_283_1 = spill1703_4;
        break forward_join_283;
    }
    if (!((__numericCompare1703_25(spill1703_3, spill1703_4) > 0))) {
        break forward_join_253;
    }
    life20_256 = 0x1.0p0f;
    }
    life20_271 = (life20_256 * 0x1.ccccccp-2f);
    life15_104 = ((life15_104 * (0x1.0p0f - life20_271)) + (0x1.99999ap-1f * life20_271));
    life16_108 = ((life16_108 * (0x1.0p0f - life20_271)) + (0x1.99999ap-1f * life20_271));
    forwardValue1703_283_0 = (life17_112 * (0x1.0p0f - life20_271));
    forwardValue1703_283_1 = life20_271;
    }
    life17_112 = (forwardValue1703_283_0 + forwardValue1703_283_1);
    }
    spill1703_5 = new moom.DR(((double) life15_104), ((double) life16_108), ((double) life17_112));
    if (!((life5_117 != null))) {
        forwardValue1703_299_0 = spill1703_5;
        break forward_join_299;
    }
    __call1703_26(new java.lang.String[1]);
    forwardValue1703_299_0 = spill1703_5;
    }
    return forwardValue1703_299_0;
}
public static void h1703_0(moom.Oo p0) throws Throwable {
    throw __call1170300_0(p0);
}
public static void h1703_1(moom.Oo p0) throws Throwable {
    throw __call1170301_0(p0);
}
public static void h1703_2(moom.Oo p0) throws Throwable {
    throw __call1170302_0(p0);
}
public static void h1703_3(moom.Oo p0) throws Throwable {
    throw __call1170303_0(p0);
}
public static void h1703_4(moom.Oo p0) throws Throwable {
    throw __call1170304_0(p0);
}
public static void h1703_5(moom.Oo p0) throws Throwable {
    throw __call1170305_0(p0);
}
private static native long __fieldRead1703_0() throws Throwable;
private static native java.lang.String __call1703_1() throws Throwable;
private static native float __call1703_2(net.minecraft.world.World a0, float a1) throws Throwable;
private static native float __call1703_3(float a0) throws Throwable;
private static native float __call1703_4(float a0, float a1, float a2) throws Throwable;
private static native double __fieldRead1703_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1703_6(double a0) throws Throwable;
private static native double __fieldRead1703_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1703_8(double a0) throws Throwable;
private static native double __fieldRead1703_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1703_10(double a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call1703_11(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native float __call1703_12(net.minecraft.world.biome.BiomeGenBase a0, moom.DT a1) throws Throwable;
private static native int __call1703_13(net.minecraft.world.biome.BiomeGenBase a0, float a1) throws Throwable;
private static native int __invokedynamic1703_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic1703_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic1703_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic1703_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic1703_18(int a0, long a1) throws Throwable;
private static native float __call1703_19(net.minecraft.world.World a0, float a1) throws Throwable;
private static native int __numericCompare1703_20(float a0, float a1) throws Throwable;
private static native float __call1703_21(net.minecraft.world.World a0, float a1) throws Throwable;
private static native int __numericCompare1703_22(float a0, float a1) throws Throwable;
private static native int __fieldRead1703_23(net.minecraft.world.World a0) throws Throwable;
private static native int __fieldRead1703_24(net.minecraft.world.World a0) throws Throwable;
private static native int __numericCompare1703_25(float a0, float a1) throws Throwable;
private static native void __call1703_26(java.lang.String[] a0) throws Throwable;
private static native java.lang.Throwable __call1170300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170305_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_d535e225d1825bd7f160(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws E;
private static final class __SourceHandler_d535e225d1825bd7f160 {

public static java.util.List f30(net.minecraft.world.World receiver, net.minecraft.entity.Entity p0, moom.CA p1) throws Throwable {
    int forestValue30_59_0;
    int forestValue30_64_0;
    int forestValue30_85_0;
    int forestValue30_111_0;
    int forestValue30_115_0;
    int forestValue30_128_0;
    int forestValue30_137_0;
    net.minecraft.entity.Entity forestValue30_202_0;
    java.util.List forestValue30_202_1;
    net.minecraft.entity.Entity forestValue30_207_0;
    moom.CA forestValue30_233_0;
    int forestValue30_243_0;
    java.lang.String spill30_0;
    boolean spill30_1;
    int spill30_2;
    int spill30_3;
    boolean spill30_4;
    net.minecraft.entity.Entity spill30_5;
    java.util.List spill30_6;
    net.minecraft.entity.Entity spill30_7;
    moom.CA spill30_8;
    moom.CA spill30_9;
    boolean spill30_10;
    long life3_3;
    java.util.List life6_5;
    int life7_9;
    int life8_16;
    int life9_20;
    int life10_26;
    int life11_30;
    java.lang.String life5_31;
    int life12_37;
    net.minecraft.world.border.WorldBorder life13_40;
    int life14_43;
    int life15_48;
    net.minecraft.block.state.IBlockState life16_51;
    moom.DU life17_55;
    int life18_57;
    int life19_65;
    int life20_96;
    net.minecraft.block.state.IBlockState life21_150;
    com.moon.ez life22_185;
    double life18_219;
    java.util.List life20_228;
    int life21_230;
    moom.CA life22_262;
    forest_join_247: {
    forest_join_174: {
    life3_3 = (__fieldRead30_0() ^ 103827132403480L);
    life6_5 = __call30_1();
    life7_9 = __call30_3(__fieldRead30_2(p1));
    spill30_0 = __call30_4();
    life8_16 = __call30_6((__fieldRead30_5(p1) + 0x1.0p0d));
    life9_20 = __call30_8(__fieldRead30_7(p1));
    life10_26 = __call30_10((__fieldRead30_9(p1) + 0x1.0p0d));
    life11_30 = __call30_12(__fieldRead30_11(p1));
    life5_31 = spill30_0;
    life12_37 = __call30_14((__fieldRead30_13(p1) + 0x1.0p0d));
    life13_40 = __call30_15(receiver);
    life14_43 = __integerCategory30_17(__call30_16(p0));
    life15_48 = __integerCategory30_19(__call30_18(receiver, life13_40, p0));
    life16_51 = __call30_21(__fieldRead30_20());
    life17_55 = new moom.DU();
    life18_57 = life7_9;
    forest_cycle_58: while (true) {
    forest_join_171: {
    forestValue30_59_0 = life18_57;
    forest_cycle_59: while (true) {
    if (!((forestValue30_59_0 < life8_16))) {
        break forest_join_174;
    }
    life19_65 = life11_30;
    forest_cycle_63: while (true) {
    forest_join_168: {
    forestValue30_64_0 = life19_65;
    forest_cycle_64: while (true) {
    forest_join_85: {
    if (!((forestValue30_64_0 < life12_37))) {
        break forest_join_171;
    }
    spill30_1 = __call30_24(receiver, __call30_23(life17_55, life18_57, __invokedynamic30_22(9967, (2662045681197289955L ^ life3_3)), life19_65));
    if (!((life5_31 == null))) {
        forestValue30_59_0 = __integerCategory30_25(spill30_1);
        continue forest_cycle_59;
    }
    if (!((life5_31 == null))) {
        forestValue30_85_0 = __integerCategory30_26(spill30_1);
        break forest_join_85;
    }
    if (!(spill30_1)) {
        break forest_join_168;
    }
    forestValue30_85_0 = (life9_20 - 1);
    }
    life20_96 = forestValue30_85_0;
    forest_cycle_86: while (true) {
    forest_join_156: {
    forest_join_137: {
    forest_join_135: {
    forest_join_131: {
    forest_join_128: {
    forest_join_119: {
    forest_join_115: {
    forest_join_111: {
    forest_join_110: {
    if (!((life20_96 < life10_26))) {
        break forest_join_168;
    }
    __call30_27(life17_55, life18_57, life20_96, life19_65);
    spill30_2 = life14_43;
    if (!((life5_31 == null))) {
        forestValue30_64_0 = spill30_2;
        continue forest_cycle_64;
    }
    if (!((life5_31 == null))) {
        forestValue30_111_0 = spill30_2;
        break forest_join_111;
    }
    if (!((spill30_2 != 0))) {
        break forest_join_110;
    }
    spill30_3 = life15_48;
    if (!((life5_31 == null))) {
        forestValue30_111_0 = spill30_3;
        break forest_join_111;
    }
    if (!((spill30_3 != 0))) {
        break forest_join_110;
    }
    __call30_28(p0, 0);
    if (!((life5_31 != null))) {
        break forest_join_119;
    }
    }
    forestValue30_111_0 = life14_43;
    }
    if (!((life5_31 == null))) {
        forestValue30_115_0 = forestValue30_111_0;
        break forest_join_115;
    }
    if (!((forestValue30_111_0 == 0))) {
        break forest_join_119;
    }
    forestValue30_115_0 = life15_48;
    }
    if (!((forestValue30_115_0 == 0))) {
        break forest_join_119;
    }
    __call30_29(p0, 1);
    }
    life21_150 = life16_51;
    spill30_4 = __call30_30(life13_40, life17_55);
    if (!((life5_31 == null))) {
        forestValue30_128_0 = __integerCategory30_31(spill30_4);
        break forest_join_128;
    }
    if (!((!spill30_4))) {
        break forest_join_131;
    }
    forestValue30_128_0 = life15_48;
    }
    if (!((life5_31 == null))) {
        forestValue30_137_0 = forestValue30_128_0;
        break forest_join_137;
    }
    if (!((forestValue30_128_0 == 0))) {
        break forest_join_135;
    }
    }
    life21_150 = __call30_32(receiver, life17_55);
    }
    forestValue30_137_0 = __instanceOf30_33(p0);
    }
    if (!((forestValue30_137_0 != 0))) {
        break forest_join_156;
    }
    life22_185 = new com.moon.ez(__call30_34(life16_51), life17_55, life6_5);
    __call30_37(__call30_36(__call30_35()), life22_185);
    life17_55 = __call30_38(life22_185);
    life6_5 = __call30_39(life22_185);
    }
    __call30_41(__call30_40(life21_150), receiver, life17_55, life21_150, p1, life6_5, p0);
    life20_96 += 1;
    if (!((life5_31 != null))) {
        continue forest_cycle_86;
    }
    break forest_cycle_86;
    }
    break forest_cycle_64;
    }
    }
    life19_65 += 1;
    if (!((life5_31 != null))) {
        continue forest_cycle_63;
    }
    break forest_cycle_63;
    }
    break forest_cycle_59;
    }
    }
    life18_57 += 1;
    if (!((life5_31 != null))) {
        continue forest_cycle_58;
    }
    break forest_cycle_58;
    }
    }
    life18_219 = 0x1.0p-2d;
    life20_228 = __call30_43(receiver, p0, __call30_42(p1, life18_219, life18_219, life18_219));
    life21_230 = 0;
    forest_cycle_187: while (true) {
    forest_join_245: {
    forest_join_244: {
    forest_join_243: {
    forest_join_233: {
    forest_join_223: {
    forest_join_207: {
    forest_join_202: {
    if (!((life21_230 < __call30_44(life20_228)))) {
        break forest_join_247;
    }
    spill30_5 = __fieldRead30_45(p0);
    spill30_6 = life20_228;
    if (!((life5_31 == null))) {
        forestValue30_202_0 = spill30_5;
        forestValue30_202_1 = spill30_6;
        break forest_join_202;
    }
    if (!((spill30_5 != spill30_6))) {
        break forest_join_244;
    }
    spill30_7 = __fieldRead30_46(p0);
    if (!((life5_31 == null))) {
        forestValue30_207_0 = spill30_7;
        break forest_join_207;
    }
    forestValue30_202_0 = spill30_7;
    forestValue30_202_1 = life20_228;
    }
    if (!((forestValue30_202_0 != forestValue30_202_1))) {
        break forest_join_244;
    }
    forestValue30_207_0 = __cast30_48(__call30_47(life20_228, life21_230));
    }
    life22_262 = __call30_49(forestValue30_207_0);
    spill30_8 = life22_262;
    if (!((life5_31 == null))) {
        forestValue30_233_0 = spill30_8;
        break forest_join_233;
    }
    if (!((spill30_8 != null))) {
        break forest_join_223;
    }
    spill30_9 = life22_262;
    if (!((life5_31 == null))) {
        forestValue30_233_0 = spill30_9;
        break forest_join_233;
    }
    if (!(__call30_50(spill30_9, p1))) {
        break forest_join_223;
    }
    __call30_51(life6_5, life22_262);
    }
    life22_262 = __call30_54(p0, __cast30_53(__call30_52(life20_228, life21_230)));
    if (!((life5_31 == null))) {
        break forest_join_245;
    }
    forestValue30_233_0 = life22_262;
    }
    if (!((forestValue30_233_0 != null))) {
        break forest_join_244;
    }
    spill30_10 = __call30_55(life22_262, p1);
    if (!((life5_31 == null))) {
        forestValue30_243_0 = __integerCategory30_56(spill30_10);
        break forest_join_243;
    }
    if (!(spill30_10)) {
        break forest_join_244;
    }
    forestValue30_243_0 = __integerCategory30_58(__call30_57(life6_5, life22_262));
    }
    __discardScalar30_59(forestValue30_243_0);
    }
    life21_230 += 1;
    }
    if (!((life5_31 != null))) {
        continue forest_cycle_187;
    }
    break forest_cycle_187;
    }
    }
    return life6_5;
}
public static java.util.List h30_0(moom.Oo p0) throws Throwable {
    throw __call3003000_0(p0);
}
public static java.util.List h30_1(moom.Oo p0) throws Throwable {
    throw __call3003001_0(p0);
}
public static java.util.List h30_2(moom.Oo p0) throws Throwable {
    throw __call3003002_0(p0);
}
public static java.util.List h30_3(moom.Oo p0) throws Throwable {
    throw __call3003003_0(p0);
}
public static java.util.List h30_4(moom.Oo p0) throws Throwable {
    throw __call3003004_0(p0);
}
public static java.util.List h30_5(moom.Oo p0) throws Throwable {
    throw __call3003005_0(p0);
}
public static java.util.List h30_6(moom.Oo p0) throws Throwable {
    throw __call3003006_0(p0);
}
public static java.util.List h30_7(moom.Oo p0) throws Throwable {
    throw __call3003007_0(p0);
}
public static java.util.List h30_8(moom.Oo p0) throws Throwable {
    throw __call3003008_0(p0);
}
public static java.util.List h30_9(moom.Oo p0) throws Throwable {
    throw __call3003009_0(p0);
}
public static java.util.List h30_10(moom.Oo p0) throws Throwable {
    throw __call3003010_0(p0);
}
public static java.util.List h30_11(moom.Oo p0) throws Throwable {
    throw __call3003011_0(p0);
}
public static java.util.List h30_12(moom.Oo p0) throws Throwable {
    throw __call3003012_0(p0);
}
public static java.util.List h30_13(moom.Oo p0) throws Throwable {
    throw __call3003013_0(p0);
}
public static java.util.List h30_14(moom.Oo p0) throws Throwable {
    throw __call3003014_0(p0);
}
public static java.util.List h30_15(moom.Oo p0) throws Throwable {
    throw __call3003015_0(p0);
}
public static java.util.List h30_16(moom.Oo p0) throws Throwable {
    throw __call3003016_0(p0);
}
public static java.util.List h30_17(moom.Oo p0) throws Throwable {
    throw __call3003017_0(p0);
}
public static java.util.List h30_18(moom.Oo p0) throws Throwable {
    throw __call3003018_0(p0);
}
public static java.util.List h30_19(moom.Oo p0) throws Throwable {
    throw __call3003019_0(p0);
}
public static java.util.List h30_20(moom.Oo p0) throws Throwable {
    throw __call3003020_0(p0);
}
public static java.util.List h30_21(moom.Oo p0) throws Throwable {
    throw __call3003021_0(p0);
}
public static java.util.List h30_22(moom.Oo p0) throws Throwable {
    throw __call3003022_0(p0);
}
private static native long __fieldRead30_0() throws Throwable;
private static native java.util.ArrayList __call30_1() throws Throwable;
private static native double __fieldRead30_2(moom.CA a0) throws Throwable;
private static native int __call30_3(double a0) throws Throwable;
private static native java.lang.String __call30_4() throws Throwable;
private static native double __fieldRead30_5(moom.CA a0) throws Throwable;
private static native int __call30_6(double a0) throws Throwable;
private static native double __fieldRead30_7(moom.CA a0) throws Throwable;
private static native int __call30_8(double a0) throws Throwable;
private static native double __fieldRead30_9(moom.CA a0) throws Throwable;
private static native int __call30_10(double a0) throws Throwable;
private static native double __fieldRead30_11(moom.CA a0) throws Throwable;
private static native int __call30_12(double a0) throws Throwable;
private static native double __fieldRead30_13(moom.CA a0) throws Throwable;
private static native int __call30_14(double a0) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call30_15(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call30_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory30_17(boolean value) throws Throwable;
private static native boolean __call30_18(net.minecraft.world.World a0, net.minecraft.world.border.WorldBorder a1, net.minecraft.entity.Entity a2) throws Throwable;
private static native int __integerCategory30_19(boolean value) throws Throwable;
private static native net.minecraft.block.Block __fieldRead30_20() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call30_21(net.minecraft.block.Block a0) throws Throwable;
private static native int __invokedynamic30_22(int a0, long a1) throws Throwable;
private static native moom.DU __call30_23(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native boolean __call30_24(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native int __integerCategory30_25(boolean value) throws Throwable;
private static native int __integerCategory30_26(boolean value) throws Throwable;
private static native moom.DU __call30_27(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native void __call30_28(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __call30_29(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native boolean __call30_30(net.minecraft.world.border.WorldBorder a0, moom.DU a1) throws Throwable;
private static native int __integerCategory30_31(boolean value) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call30_32(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native int __instanceOf30_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.block.Block __call30_34(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call30_35() throws Throwable;
private static native com.moon.events.EventBus __call30_36(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call30_37(com.moon.events.EventBus a0, com.moon.ez a1) throws Throwable;
private static native moom.DU __call30_38(com.moon.ez a0) throws Throwable;
private static native java.util.List __call30_39(com.moon.ez a0) throws Throwable;
private static native net.minecraft.block.Block __call30_40(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call30_41(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DU a2, net.minecraft.block.state.IBlockState a3, moom.CA a4, java.util.List a5, net.minecraft.entity.Entity a6) throws Throwable;
private static native moom.CA __call30_42(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.List __call30_43(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2) throws Throwable;
private static native int __call30_44(java.util.List a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead30_45(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead30_46(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Object __call30_47(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __cast30_48(java.lang.Object a0) throws Throwable;
private static native moom.CA __call30_49(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call30_50(moom.CA a0, moom.CA a1) throws Throwable;
private static native boolean __call30_51(java.util.List a0, moom.CA a1) throws Throwable;
private static native java.lang.Object __call30_52(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __cast30_53(java.lang.Object a0) throws Throwable;
private static native moom.CA __call30_54(net.minecraft.entity.Entity a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native boolean __call30_55(moom.CA a0, moom.CA a1) throws Throwable;
private static native int __integerCategory30_56(boolean value) throws Throwable;
private static native boolean __call30_57(java.util.List a0, moom.CA a1) throws Throwable;
private static native int __integerCategory30_58(boolean value) throws Throwable;
private static native void __discardScalar30_59(int a0) throws Throwable;
private static native java.lang.Throwable __call3003000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003018_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003019_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003020_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003021_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3003022_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_222f00da61e8231eebe7(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, moom.CA a2, com.google.common.base.Predicate a3) throws E;
private static final class __SourceHandler_222f00da61e8231eebe7 {

public static java.util.List f1153(net.minecraft.world.World receiver, net.minecraft.entity.Entity p0, moom.CA p1, com.google.common.base.Predicate p2) throws Throwable {
    int forestValue1153_43_0;
    net.minecraft.world.World forestValue1153_63_0;
    int forestValue1153_63_1;
    int forestValue1153_63_2;
    java.lang.String spill1153_0;
    net.minecraft.world.World spill1153_1;
    int spill1153_2;
    int spill1153_3;
    boolean spill1153_4;
    long life4_3;
    java.util.ArrayList life7_6;
    java.lang.String life6_7;
    int life8_15;
    int life9_23;
    int life10_31;
    int life11_39;
    int life12_41;
    int life13_46;
    forest_join_75: {
    life4_3 = (__fieldRead1153_0() ^ 16800448948267L);
    spill1153_0 = __call1153_1();
    life7_6 = __call1153_2();
    life6_7 = spill1153_0;
    life8_15 = __call1153_4(((__fieldRead1153_3(p1) - 0x1.0p1d) / 0x1.0p4d));
    life9_23 = __call1153_6(((__fieldRead1153_5(p1) + 0x1.0p1d) / 0x1.0p4d));
    life10_31 = __call1153_8(((__fieldRead1153_7(p1) - 0x1.0p1d) / 0x1.0p4d));
    life11_39 = __call1153_10(((__fieldRead1153_9(p1) + 0x1.0p1d) / 0x1.0p4d));
    life12_41 = life8_15;
    forest_cycle_42: while (true) {
    forest_join_72: {
    forestValue1153_43_0 = life12_41;
    forest_cycle_43: while (true) {
    if (!((forestValue1153_43_0 <= life9_23))) {
        break forest_join_75;
    }
    life13_46 = life10_31;
    forest_cycle_47: while (true) {
    forest_join_69: {
    forest_join_63: {
    if (!((life13_46 <= life11_39))) {
        break forest_join_72;
    }
    spill1153_1 = receiver;
    spill1153_2 = life12_41;
    spill1153_3 = life13_46;
    if (!((life6_7 == null))) {
        forestValue1153_63_0 = spill1153_1;
        forestValue1153_63_1 = spill1153_2;
        forestValue1153_63_2 = spill1153_3;
        break forest_join_63;
    }
    spill1153_4 = __call1153_11(spill1153_1, spill1153_2, spill1153_3, 1);
    if (!((life6_7 == null))) {
        forestValue1153_43_0 = __integerCategory1153_12(spill1153_4);
        continue forest_cycle_43;
    }
    if (!(spill1153_4)) {
        break forest_join_69;
    }
    forestValue1153_63_0 = receiver;
    forestValue1153_63_1 = life12_41;
    forestValue1153_63_2 = life13_46;
    }
    __call1153_14(__call1153_13(forestValue1153_63_0, forestValue1153_63_1, forestValue1153_63_2), p0, p1, life7_6, p2);
    }
    life13_46 += 1;
    if (!((life6_7 != null))) {
        continue forest_cycle_47;
    }
    break forest_cycle_47;
    }
    break forest_cycle_43;
    }
    }
    life12_41 += 1;
    if (!((life6_7 != null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    }
    return life7_6;
}
public static java.util.List h1153_0(moom.Oo p0) throws Throwable {
    throw __call3115300_0(p0);
}
public static java.util.List h1153_1(moom.Oo p0) throws Throwable {
    throw __call3115301_0(p0);
}
private static native long __fieldRead1153_0() throws Throwable;
private static native java.lang.String __call1153_1() throws Throwable;
private static native java.util.ArrayList __call1153_2() throws Throwable;
private static native double __fieldRead1153_3(moom.CA a0) throws Throwable;
private static native int __call1153_4(double a0) throws Throwable;
private static native double __fieldRead1153_5(moom.CA a0) throws Throwable;
private static native int __call1153_6(double a0) throws Throwable;
private static native double __fieldRead1153_7(moom.CA a0) throws Throwable;
private static native int __call1153_8(double a0) throws Throwable;
private static native double __fieldRead1153_9(moom.CA a0) throws Throwable;
private static native int __call1153_10(double a0) throws Throwable;
private static native boolean __call1153_11(net.minecraft.world.World a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory1153_12(boolean value) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1153_13(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native void __call1153_14(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1, moom.CA a2, java.util.ArrayList a3, com.google.common.base.Predicate a4) throws Throwable;
private static native java.lang.Throwable __call3115300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_113cdf9549eb5bfad974(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, boolean a2) throws E;
private static final class __SourceHandler_113cdf9549eb5bfad974 {

public static void f279(net.minecraft.world.World receiver, net.minecraft.entity.Entity p0, boolean p1) throws Throwable {
    int forwardValue279_65_0;
    net.minecraft.entity.Entity forwardValue279_89_0;
    int forwardValue279_99_0;
    net.minecraft.entity.Entity forwardValue279_107_0;
    int forwardValue279_115_0;
    net.minecraft.entity.Entity forwardValue279_123_0;
    int forwardValue279_131_0;
    net.minecraft.entity.Entity forwardValue279_139_0;
    int forwardValue279_148_0;
    net.minecraft.entity.Entity forwardValue279_157_0;
    int forwardValue279_166_0;
    net.minecraft.entity.Entity forwardValue279_175_0;
    int forwardValue279_183_0;
    int forwardValue279_221_0;
    int forwardValue279_251_0;
    net.minecraft.world.World forwardValue279_258_0;
    int forwardValue279_258_1;
    int forwardValue279_258_2;
    int forwardValue279_270_0;
    int forwardValue279_277_0;
    net.minecraft.entity.Entity forwardValue279_280_0;
    net.minecraft.entity.Entity forwardValue279_285_0;
    net.minecraft.entity.Entity forwardValue279_307_0;
    java.lang.String spill279_0;
    boolean spill279_1;
    boolean spill279_2;
    boolean spill279_3;
    net.minecraft.entity.Entity spill279_4;
    net.minecraft.entity.Entity spill279_5;
    boolean spill279_6;
    net.minecraft.entity.Entity spill279_7;
    boolean spill279_8;
    net.minecraft.entity.Entity spill279_9;
    boolean spill279_10;
    net.minecraft.entity.Entity spill279_11;
    boolean spill279_12;
    net.minecraft.entity.Entity spill279_13;
    boolean spill279_14;
    boolean spill279_15;
    int spill279_16;
    int spill279_17;
    int spill279_18;
    boolean spill279_19;
    net.minecraft.world.World spill279_20;
    int spill279_21;
    int spill279_22;
    net.minecraft.entity.Entity spill279_23;
    net.minecraft.entity.Entity spill279_24;
    long life3_3;
    int life6_8;
    java.lang.String life5_9;
    int life7_13;
    int life8_19;
    int life9_261;
    int life10_267;
    int life11_273;
    forward_join_309: {
    forward_join_307: {
    forward_join_302: {
    forward_join_285: {
    forward_join_280: {
    forward_join_277: {
    forward_join_270: {
    forward_join_266: {
    forward_join_263: {
    forward_join_258: {
    forward_join_251: {
    forward_join_244: {
    forward_join_221: {
    forward_join_219: {
    forward_join_183: {
    forward_join_178: {
    forward_join_175: {
    forward_join_174: {
    forward_join_166: {
    forward_join_160: {
    forward_join_157: {
    forward_join_156: {
    forward_join_148: {
    forward_join_142: {
    forward_join_139: {
    forward_join_138: {
    forward_join_131: {
    forward_join_126: {
    forward_join_123: {
    forward_join_122: {
    forward_join_115: {
    forward_join_110: {
    forward_join_107: {
    forward_join_106: {
    forward_join_99: {
    forward_join_90: {
    forward_join_89: {
    forward_join_88: {
    forward_join_65: {
    forward_join_44: {
    life3_3 = (__fieldRead279_0() ^ 18808928814755L);
    spill279_0 = __call279_1();
    life6_8 = __call279_3(__fieldRead279_2(p0));
    life5_9 = spill279_0;
    life7_13 = __call279_5(__fieldRead279_4(p0));
    life8_19 = __invokedynamic279_6(7379, (3547654138792419959L ^ life3_3));
    spill279_1 = p1;
    if (!((life5_9 == null))) {
        forwardValue279_65_0 = __integerCategory279_7(spill279_1);
        break forward_join_65;
    }
    if (!(spill279_1)) {
        break forward_join_44;
    }
    spill279_2 = __call279_8(receiver, (life6_8 - life8_19), 0, (life7_13 - life8_19), (life6_8 + life8_19), 0, (life7_13 + life8_19), 1);
    if (!((life5_9 == null))) {
        forwardValue279_65_0 = __integerCategory279_9(spill279_2);
        break forward_join_65;
    }
    if (!(spill279_2)) {
        break forward_join_309;
    }
    }
    __fieldWrite279_11(p0, __fieldRead279_10(p0));
    __fieldWrite279_13(p0, __fieldRead279_12(p0));
    __fieldWrite279_15(p0, __fieldRead279_14(p0));
    __fieldWrite279_17(p0, __fieldRead279_16(p0));
    __fieldWrite279_19(p0, __fieldRead279_18(p0));
    forwardValue279_65_0 = __integerCategory279_20(p1);
    }
    if (!((life5_9 == null))) {
        forwardValue279_99_0 = forwardValue279_65_0;
        break forward_join_99;
    }
    if (!((forwardValue279_65_0 != 0))) {
        break forward_join_90;
    }
    spill279_3 = __fieldRead279_21(p0);
    if (!((life5_9 == null))) {
        forwardValue279_99_0 = __integerCategory279_22(spill279_3);
        break forward_join_99;
    }
    if (!(spill279_3)) {
        break forward_join_90;
    }
    net.minecraft.entity.Entity __stackOp279_23_0 = p0;
    __fieldWrite279_25(__stackOp279_23_0, (__fieldRead279_24(__stackOp279_23_0) + 1));
    spill279_4 = __fieldRead279_26(p0);
    if (!((life5_9 == null))) {
        forwardValue279_89_0 = spill279_4;
        break forward_join_89;
    }
    if (!((spill279_4 != null))) {
        break forward_join_88;
    }
    __call279_27(p0);
    if (!((life5_9 != null))) {
        break forward_join_90;
    }
    }
    forwardValue279_89_0 = p0;
    }
    __call279_28(forwardValue279_89_0);
    }
    __call279_30(__fieldRead279_29(receiver), "chunkCheck");
    spill279_5 = p0;
    if (!((life5_9 == null))) {
        forwardValue279_107_0 = spill279_5;
        break forward_join_107;
    }
    forwardValue279_99_0 = __integerCategory279_33(__call279_32(__fieldRead279_31(spill279_5)));
    }
    if (!((forwardValue279_99_0 == 0))) {
        break forward_join_106;
    }
    spill279_6 = __call279_35(__fieldRead279_34(p0));
    if (!((life5_9 == null))) {
        forwardValue279_115_0 = __integerCategory279_36(spill279_6);
        break forward_join_115;
    }
    if (!(spill279_6)) {
        break forward_join_110;
    }
    }
    forwardValue279_107_0 = p0;
    }
    __fieldWrite279_38(forwardValue279_107_0, __fieldRead279_37(p0));
    }
    spill279_7 = p0;
    if (!((life5_9 == null))) {
        forwardValue279_123_0 = spill279_7;
        break forward_join_123;
    }
    forwardValue279_115_0 = __integerCategory279_41(__call279_40(__fieldRead279_39(spill279_7)));
    }
    if (!((forwardValue279_115_0 == 0))) {
        break forward_join_122;
    }
    spill279_8 = __call279_43(__fieldRead279_42(p0));
    if (!((life5_9 == null))) {
        forwardValue279_131_0 = __integerCategory279_44(spill279_8);
        break forward_join_131;
    }
    if (!(spill279_8)) {
        break forward_join_126;
    }
    }
    forwardValue279_123_0 = p0;
    }
    __fieldWrite279_46(forwardValue279_123_0, __fieldRead279_45(p0));
    }
    spill279_9 = p0;
    if (!((life5_9 == null))) {
        forwardValue279_139_0 = spill279_9;
        break forward_join_139;
    }
    forwardValue279_131_0 = __integerCategory279_49(__call279_48(__fieldRead279_47(spill279_9)));
    }
    if (!((forwardValue279_131_0 == 0))) {
        break forward_join_138;
    }
    spill279_10 = __call279_51(__fieldRead279_50(p0));
    if (!((life5_9 == null))) {
        forwardValue279_148_0 = __integerCategory279_52(spill279_10);
        break forward_join_148;
    }
    if (!(spill279_10)) {
        break forward_join_142;
    }
    }
    forwardValue279_139_0 = p0;
    }
    __fieldWrite279_54(forwardValue279_139_0, __fieldRead279_53(p0));
    }
    spill279_11 = p0;
    if (!((life5_9 == null))) {
        forwardValue279_157_0 = spill279_11;
        break forward_join_157;
    }
    forwardValue279_148_0 = __integerCategory279_57(__call279_56(((double) __fieldRead279_55(spill279_11))));
    }
    if (!((forwardValue279_148_0 == 0))) {
        break forward_join_156;
    }
    spill279_12 = __call279_59(((double) __fieldRead279_58(p0)));
    if (!((life5_9 == null))) {
        forwardValue279_166_0 = __integerCategory279_60(spill279_12);
        break forward_join_166;
    }
    if (!(spill279_12)) {
        break forward_join_160;
    }
    }
    forwardValue279_157_0 = p0;
    }
    __fieldWrite279_62(forwardValue279_157_0, __fieldRead279_61(p0));
    }
    spill279_13 = p0;
    if (!((life5_9 == null))) {
        forwardValue279_175_0 = spill279_13;
        break forward_join_175;
    }
    forwardValue279_166_0 = __integerCategory279_65(__call279_64(((double) __fieldRead279_63(spill279_13))));
    }
    if (!((forwardValue279_166_0 == 0))) {
        break forward_join_174;
    }
    spill279_14 = __call279_67(((double) __fieldRead279_66(p0)));
    if (!((life5_9 == null))) {
        forwardValue279_183_0 = __integerCategory279_68(spill279_14);
        break forward_join_183;
    }
    if (!(spill279_14)) {
        break forward_join_178;
    }
    }
    forwardValue279_175_0 = p0;
    }
    __fieldWrite279_70(forwardValue279_175_0, __fieldRead279_69(p0));
    }
    forwardValue279_183_0 = __call279_72((__fieldRead279_71(p0) / 0x1.0p4d));
    }
    life9_261 = forwardValue279_183_0;
    life10_267 = __call279_74((__fieldRead279_73(p0) / 0x1.0p4d));
    life11_273 = __call279_76((__fieldRead279_75(p0) / 0x1.0p4d));
    spill279_15 = __fieldRead279_77(p0);
    if (!((life5_9 == null))) {
        forwardValue279_221_0 = __integerCategory279_78(spill279_15);
        break forward_join_221;
    }
    if (!(spill279_15)) {
        break forward_join_219;
    }
    spill279_16 = __fieldRead279_79(p0);
    if (!((life5_9 == null))) {
        forwardValue279_221_0 = spill279_16;
        break forward_join_221;
    }
    if (!((spill279_16 == life9_261))) {
        break forward_join_219;
    }
    spill279_17 = __fieldRead279_80(p0);
    if (!((life5_9 == null))) {
        forwardValue279_221_0 = spill279_17;
        break forward_join_221;
    }
    if (!((spill279_17 == life10_267))) {
        break forward_join_219;
    }
    spill279_18 = __fieldRead279_81(p0);
    if (!((life5_9 == null))) {
        forwardValue279_270_0 = spill279_18;
        break forward_join_270;
    }
    if (!((spill279_18 != life11_273))) {
        break forward_join_266;
    }
    }
    forwardValue279_221_0 = __integerCategory279_83(__fieldRead279_82(p0));
    }
    if (!((life5_9 == null))) {
        forwardValue279_251_0 = forwardValue279_221_0;
        break forward_join_251;
    }
    if (!((forwardValue279_221_0 != 0))) {
        break forward_join_244;
    }
    spill279_19 = __call279_86(receiver, __fieldRead279_84(p0), __fieldRead279_85(p0), 1);
    if (!((life5_9 == null))) {
        forwardValue279_251_0 = __integerCategory279_87(spill279_19);
        break forward_join_251;
    }
    if (!(spill279_19)) {
        break forward_join_244;
    }
    __call279_92(__call279_90(receiver, __fieldRead279_88(p0), __fieldRead279_89(p0)), p0, __fieldRead279_91(p0));
    }
    spill279_20 = receiver;
    spill279_21 = life9_261;
    spill279_22 = life11_273;
    if (!((life5_9 == null))) {
        forwardValue279_258_0 = spill279_20;
        forwardValue279_258_1 = spill279_21;
        forwardValue279_258_2 = spill279_22;
        break forward_join_258;
    }
    forwardValue279_251_0 = __integerCategory279_94(__call279_93(spill279_20, spill279_21, spill279_22, 1));
    }
    if (!((forwardValue279_251_0 != 0))) {
        break forward_join_263;
    }
    __fieldWrite279_95(p0, 1);
    forwardValue279_258_0 = receiver;
    forwardValue279_258_1 = life9_261;
    forwardValue279_258_2 = life11_273;
    }
    __call279_97(__call279_96(forwardValue279_258_0, forwardValue279_258_1, forwardValue279_258_2), p0);
    if (!((life5_9 != null))) {
        break forward_join_266;
    }
    }
    __fieldWrite279_98(p0, 0);
    }
    __call279_100(__fieldRead279_99(receiver));
    forwardValue279_270_0 = __integerCategory279_101(p1);
    }
    if (!((life5_9 == null))) {
        forwardValue279_277_0 = forwardValue279_270_0;
        break forward_join_277;
    }
    if (!((forwardValue279_270_0 != 0))) {
        break forward_join_309;
    }
    spill279_23 = p0;
    if (!((life5_9 == null))) {
        forwardValue279_280_0 = spill279_23;
        break forward_join_280;
    }
    forwardValue279_277_0 = __integerCategory279_103(__fieldRead279_102(spill279_23));
    }
    if (!((forwardValue279_277_0 != 0))) {
        break forward_join_309;
    }
    forwardValue279_280_0 = __fieldRead279_104(p0);
    }
    if (!((life5_9 == null))) {
        forwardValue279_285_0 = forwardValue279_280_0;
        break forward_join_285;
    }
    if (!((forwardValue279_280_0 != null))) {
        break forward_join_309;
    }
    forwardValue279_285_0 = __fieldRead279_105(p0);
    }
    if (!((life5_9 == null))) {
        forwardValue279_307_0 = forwardValue279_285_0;
        break forward_join_307;
    }
    if (!((!__fieldRead279_106(forwardValue279_285_0)))) {
        break forward_join_302;
    }
    spill279_24 = __fieldRead279_108(__fieldRead279_107(p0));
    if (!((life5_9 == null))) {
        forwardValue279_307_0 = spill279_24;
        break forward_join_307;
    }
    if (!((spill279_24 == p0))) {
        break forward_join_302;
    }
    __call279_110(receiver, __fieldRead279_109(p0));
    if (!((life5_9 != null))) {
        break forward_join_309;
    }
    }
    __fieldWrite279_112(__fieldRead279_111(p0), null);
    forwardValue279_307_0 = p0;
    }
    __fieldWrite279_113(forwardValue279_307_0, null);
    }
    return;
}
public static void h279_0(moom.Oo p0) throws Throwable {
    throw __call1027900_0(p0);
}
public static void h279_1(moom.Oo p0) throws Throwable {
    throw __call1027901_0(p0);
}
public static void h279_2(moom.Oo p0) throws Throwable {
    throw __call1027902_0(p0);
}
public static void h279_3(moom.Oo p0) throws Throwable {
    throw __call1027903_0(p0);
}
public static void h279_4(moom.Oo p0) throws Throwable {
    throw __call1027904_0(p0);
}
public static void h279_5(moom.Oo p0) throws Throwable {
    throw __call1027905_0(p0);
}
public static void h279_6(moom.Oo p0) throws Throwable {
    throw __call1027906_0(p0);
}
public static void h279_7(moom.Oo p0) throws Throwable {
    throw __call1027907_0(p0);
}
public static void h279_8(moom.Oo p0) throws Throwable {
    throw __call1027908_0(p0);
}
public static void h279_9(moom.Oo p0) throws Throwable {
    throw __call1027909_0(p0);
}
public static void h279_10(moom.Oo p0) throws Throwable {
    throw __call1027910_0(p0);
}
public static void h279_11(moom.Oo p0) throws Throwable {
    throw __call1027911_0(p0);
}
public static void h279_12(moom.Oo p0) throws Throwable {
    throw __call1027912_0(p0);
}
public static void h279_13(moom.Oo p0) throws Throwable {
    throw __call1027913_0(p0);
}
public static void h279_14(moom.Oo p0) throws Throwable {
    throw __call1027914_0(p0);
}
public static void h279_15(moom.Oo p0) throws Throwable {
    throw __call1027915_0(p0);
}
public static void h279_16(moom.Oo p0) throws Throwable {
    throw __call1027916_0(p0);
}
public static void h279_17(moom.Oo p0) throws Throwable {
    throw __call1027917_0(p0);
}
public static void h279_18(moom.Oo p0) throws Throwable {
    throw __call1027918_0(p0);
}
public static void h279_19(moom.Oo p0) throws Throwable {
    throw __call1027919_0(p0);
}
public static void h279_20(moom.Oo p0) throws Throwable {
    throw __call1027920_0(p0);
}
public static void h279_21(moom.Oo p0) throws Throwable {
    throw __call1027921_0(p0);
}
public static void h279_22(moom.Oo p0) throws Throwable {
    throw __call1027922_0(p0);
}
public static void h279_23(moom.Oo p0) throws Throwable {
    throw __call1027923_0(p0);
}
public static void h279_24(moom.Oo p0) throws Throwable {
    throw __call1027924_0(p0);
}
public static void h279_25(moom.Oo p0) throws Throwable {
    throw __call1027925_0(p0);
}
public static void h279_26(moom.Oo p0) throws Throwable {
    throw __call1027926_0(p0);
}
public static void h279_27(moom.Oo p0) throws Throwable {
    throw __call1027927_0(p0);
}
public static void h279_28(moom.Oo p0) throws Throwable {
    throw __call1027928_0(p0);
}
public static void h279_29(moom.Oo p0) throws Throwable {
    throw __call1027929_0(p0);
}
public static void h279_30(moom.Oo p0) throws Throwable {
    throw __call1027930_0(p0);
}
public static void h279_31(moom.Oo p0) throws Throwable {
    throw __call1027931_0(p0);
}
public static void h279_32(moom.Oo p0) throws Throwable {
    throw __call1027932_0(p0);
}
public static void h279_33(moom.Oo p0) throws Throwable {
    throw __call1027933_0(p0);
}
public static void h279_34(moom.Oo p0) throws Throwable {
    throw __call1027934_0(p0);
}
public static void h279_35(moom.Oo p0) throws Throwable {
    throw __call1027935_0(p0);
}
public static void h279_36(moom.Oo p0) throws Throwable {
    throw __call1027936_0(p0);
}
public static void h279_37(moom.Oo p0) throws Throwable {
    throw __call1027937_0(p0);
}
public static void h279_38(moom.Oo p0) throws Throwable {
    throw __call1027938_0(p0);
}
public static void h279_39(moom.Oo p0) throws Throwable {
    throw __call1027939_0(p0);
}
public static void h279_40(moom.Oo p0) throws Throwable {
    throw __call1027940_0(p0);
}
public static void h279_41(moom.Oo p0) throws Throwable {
    throw __call1027941_0(p0);
}
public static void h279_42(moom.Oo p0) throws Throwable {
    throw __call1027942_0(p0);
}
public static void h279_43(moom.Oo p0) throws Throwable {
    throw __call1027943_0(p0);
}
public static void h279_44(moom.Oo p0) throws Throwable {
    throw __call1027944_0(p0);
}
public static void h279_45(moom.Oo p0) throws Throwable {
    throw __call1027945_0(p0);
}
public static void h279_46(moom.Oo p0) throws Throwable {
    throw __call1027946_0(p0);
}
public static void h279_47(moom.Oo p0) throws Throwable {
    throw __call1027947_0(p0);
}
public static void h279_48(moom.Oo p0) throws Throwable {
    throw __call1027948_0(p0);
}
public static void h279_49(moom.Oo p0) throws Throwable {
    throw __call1027949_0(p0);
}
public static void h279_50(moom.Oo p0) throws Throwable {
    throw __call1027950_0(p0);
}
public static void h279_51(moom.Oo p0) throws Throwable {
    throw __call1027951_0(p0);
}
private static native long __fieldRead279_0() throws Throwable;
private static native java.lang.String __call279_1() throws Throwable;
private static native double __fieldRead279_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call279_3(double a0) throws Throwable;
private static native double __fieldRead279_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call279_5(double a0) throws Throwable;
private static native int __invokedynamic279_6(int a0, long a1) throws Throwable;
private static native int __integerCategory279_7(boolean value) throws Throwable;
private static native boolean __call279_8(net.minecraft.world.World a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7) throws Throwable;
private static native int __integerCategory279_9(boolean value) throws Throwable;
private static native double __fieldRead279_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite279_11(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead279_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite279_13(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead279_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite279_15(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native float __fieldRead279_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite279_17(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native float __fieldRead279_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite279_19(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native int __integerCategory279_20(boolean value) throws Throwable;
private static native boolean __fieldRead279_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory279_22(boolean value) throws Throwable;
private static native int __fieldRead279_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite279_25(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead279_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call279_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call279_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.A9 __fieldRead279_29(net.minecraft.world.World a0) throws Throwable;
private static native void __call279_30(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native double __fieldRead279_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call279_32(double a0) throws Throwable;
private static native int __integerCategory279_33(boolean value) throws Throwable;
private static native double __fieldRead279_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call279_35(double a0) throws Throwable;
private static native int __integerCategory279_36(boolean value) throws Throwable;
private static native double __fieldRead279_37(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite279_38(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead279_39(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call279_40(double a0) throws Throwable;
private static native int __integerCategory279_41(boolean value) throws Throwable;
private static native double __fieldRead279_42(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call279_43(double a0) throws Throwable;
private static native int __integerCategory279_44(boolean value) throws Throwable;
private static native double __fieldRead279_45(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite279_46(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native double __fieldRead279_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call279_48(double a0) throws Throwable;
private static native int __integerCategory279_49(boolean value) throws Throwable;
private static native double __fieldRead279_50(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call279_51(double a0) throws Throwable;
private static native int __integerCategory279_52(boolean value) throws Throwable;
private static native double __fieldRead279_53(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite279_54(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native float __fieldRead279_55(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call279_56(double a0) throws Throwable;
private static native int __integerCategory279_57(boolean value) throws Throwable;
private static native float __fieldRead279_58(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call279_59(double a0) throws Throwable;
private static native int __integerCategory279_60(boolean value) throws Throwable;
private static native float __fieldRead279_61(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite279_62(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native float __fieldRead279_63(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call279_64(double a0) throws Throwable;
private static native int __integerCategory279_65(boolean value) throws Throwable;
private static native float __fieldRead279_66(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call279_67(double a0) throws Throwable;
private static native int __integerCategory279_68(boolean value) throws Throwable;
private static native float __fieldRead279_69(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite279_70(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native double __fieldRead279_71(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call279_72(double a0) throws Throwable;
private static native double __fieldRead279_73(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call279_74(double a0) throws Throwable;
private static native double __fieldRead279_75(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call279_76(double a0) throws Throwable;
private static native boolean __fieldRead279_77(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory279_78(boolean value) throws Throwable;
private static native int __fieldRead279_79(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead279_80(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead279_81(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead279_82(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory279_83(boolean value) throws Throwable;
private static native int __fieldRead279_84(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead279_85(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call279_86(net.minecraft.world.World a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory279_87(boolean value) throws Throwable;
private static native int __fieldRead279_88(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead279_89(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call279_90(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native int __fieldRead279_91(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call279_92(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native boolean __call279_93(net.minecraft.world.World a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory279_94(boolean value) throws Throwable;
private static native void __fieldWrite279_95(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call279_96(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native void __call279_97(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __fieldWrite279_98(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native moom.A9 __fieldRead279_99(net.minecraft.world.World a0) throws Throwable;
private static native void __call279_100(moom.A9 a0) throws Throwable;
private static native int __integerCategory279_101(boolean value) throws Throwable;
private static native boolean __fieldRead279_102(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory279_103(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead279_104(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead279_105(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead279_106(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead279_107(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead279_108(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead279_109(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call279_110(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead279_111(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite279_112(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite279_113(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Throwable __call1027900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027910_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027911_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027912_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027913_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027914_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027915_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027916_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027917_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027918_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027919_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027920_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027921_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027922_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027923_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027924_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027925_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027926_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027927_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027928_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027929_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027930_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027931_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027932_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027933_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027934_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027935_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027936_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027937_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027938_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027939_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027940_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027941_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027942_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027943_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027944_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027945_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027946_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027947_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027948_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027949_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027950_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1027951_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a6bdaf74c54f919f4a88(net.minecraft.world.World a0, net.minecraft.entity.player.EntityPlayer a1, int a2, moom.DT a3, int a4) throws E;
private static final class __SourceHandler_a6bdaf74c54f919f4a88 {

public static void f604(net.minecraft.world.World receiver, net.minecraft.entity.player.EntityPlayer p0, int p1, moom.DT p2, int p3) throws Throwable {
    long life5_3;
    java.lang.String life7_5;
    java.util.Iterator life8_9;
    net.minecraft.world.IWorldAccess life9_16;
    lexical_join_27: {
    life5_3 = (__fieldRead604_0() ^ 21536530256286L);
    life7_5 = __call604_1();
    life8_9 = __call604_3(__fieldRead604_2(receiver));
    lexical_cycle_10: while (true) {
    if (!(__call604_4(life8_9))) {
        break lexical_join_27;
    }
    life9_16 = __cast604_6(__call604_5(life8_9));
    __call604_7(life9_16, p0, p1, p2, p3);
    if (!((life7_5 == null))) {
        break lexical_join_27;
    }
    if (!((life7_5 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}
public static void h604_0(java.lang.Throwable p0) throws Throwable {
    throw __call2060400_0(p0);
}
public static void h604_1(java.lang.Throwable p0, net.minecraft.entity.player.EntityPlayer p1, int p2, moom.DT p3, int p4) throws Throwable {
    java.lang.Throwable local5 = p0;
    moom.qY local6 = __call2060401_0(local5, "Playing level event");
    moom.qZ local7 = __call2060401_1(local6, "Level event being played");
    __call2060401_3(local7, "Block coordinates", __call2060401_2(p3));
    __call2060401_4(local7, "Event source", p1);
    __call2060401_6(local7, "Event type", __call2060401_5(p2));
    __call2060401_8(local7, "Event data", __call2060401_7(p4));
    throw new moom.Oo(local6);
}
private static native long __fieldRead604_0() throws Throwable;
private static native java.lang.String __call604_1() throws Throwable;
private static native java.util.List __fieldRead604_2(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call604_3(java.util.List a0) throws Throwable;
private static native boolean __call604_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call604_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.world.IWorldAccess __cast604_6(java.lang.Object a0) throws Throwable;
private static native void __call604_7(net.minecraft.world.IWorldAccess a0, net.minecraft.entity.player.EntityPlayer a1, int a2, moom.DT a3, int a4) throws Throwable;
private static native java.lang.Throwable __call2060400_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2060401_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2060401_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2060401_2(moom.DT a0) throws Throwable;
private static native void __call2060401_3(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call2060401_4(moom.qZ a0, java.lang.String a1, net.minecraft.entity.player.EntityPlayer a2) throws Throwable;
private static native java.lang.Integer __call2060401_5(int a0) throws Throwable;
private static native void __call2060401_6(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2060401_7(int a0) throws Throwable;
private static native void __call2060401_8(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c922381a7e2c9da571e1(net.minecraft.world.World a0, net.minecraft.entity.player.EntityPlayer a1, moom.DT a2, moom.bs a3) throws E;
private static final class __SourceHandler_c922381a7e2c9da571e1 {

public static boolean f1706(net.minecraft.world.World receiver, net.minecraft.entity.player.EntityPlayer p0, moom.DT p1, moom.bs p2) throws Throwable {
    net.minecraft.world.World forwardValue1706_30_0;
    moom.DT forwardValue1706_30_1;
    java.lang.String spill1706_0;
    net.minecraft.world.World spill1706_1;
    moom.DT spill1706_2;
    long life4_3;
    moom.DT life2_8;
    java.lang.String life6_9;
    forward_join_34: {
    forward_join_30: {
    life4_3 = (__fieldRead1706_0() ^ 124328846929190L);
    spill1706_0 = __call1706_1();
    life2_8 = __call1706_2(p1, p2);
    life6_9 = spill1706_0;
    spill1706_1 = receiver;
    spill1706_2 = life2_8;
    if (!((life6_9 == null))) {
        forwardValue1706_30_0 = spill1706_1;
        forwardValue1706_30_1 = spill1706_2;
        break forward_join_30;
    }
    if (!((__call1706_4(__call1706_3(spill1706_1, spill1706_2)) == __fieldRead1706_5()))) {
        break forward_join_34;
    }
    __call1706_7(receiver, p0, __invokedynamic1706_6(14130, (7063126717041336850L ^ life4_3)), life2_8, 0);
    forwardValue1706_30_0 = receiver;
    forwardValue1706_30_1 = life2_8;
    }
    __call1706_8(forwardValue1706_30_0, forwardValue1706_30_1);
    return __integerCategory1706_9(1);
    }
    return __integerCategory1706_10(0);
}
public static void h1706_0(moom.Oo p0) throws Throwable {
    throw __call1170600_0(p0);
}
public static void h1706_1(moom.Oo p0) throws Throwable {
    throw __call1170601_0(p0);
}
private static native long __fieldRead1706_0() throws Throwable;
private static native java.lang.String __call1706_1() throws Throwable;
private static native moom.DT __call1706_2(moom.DT a0, moom.bs a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1706_3(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1706_4(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.BlockFire __fieldRead1706_5() throws Throwable;
private static native int __invokedynamic1706_6(int a0, long a1) throws Throwable;
private static native void __call1706_7(net.minecraft.world.World a0, net.minecraft.entity.player.EntityPlayer a1, int a2, moom.DT a3, int a4) throws Throwable;
private static native boolean __call1706_8(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native boolean __integerCategory1706_9(int value) throws Throwable;
private static native boolean __integerCategory1706_10(int value) throws Throwable;
private static native java.lang.Throwable __call1170600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_36ef8f46a66afb3e6418(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws E;
private static final class __SourceHandler_36ef8f46a66afb3e6418 {

public static int f1707(net.minecraft.world.World receiver, net.minecraft.world.EnumSkyBlock p0, moom.DT p1) throws Throwable {
    int forwardValue1707_19_0;
    int forwardValue1707_34_0;
    int forwardValue1707_43_0;
    int forwardValue1707_56_0;
    int forwardValue1707_96_0;
    int forwardValue1707_96_1;
    int forwardValue1707_103_0;
    int forwardValue1707_103_1;
    int forwardValue1707_112_0;
    int forwardValue1707_112_1;
    int forwardValue1707_116_0;
    net.minecraft.world.World forwardValue1707_119_0;
    moom.DT forwardValue1707_119_1;
    boolean spill1707_0;
    net.minecraft.world.World spill1707_1;
    moom.DT spill1707_2;
    int spill1707_3;
    int spill1707_4;
    int spill1707_5;
    long life3_3;
    java.lang.String life5_5;
    int life6_86;
    int life7_92;
    int life8_98;
    int life9_104;
    int life10_110;
    net.minecraft.world.chunk.Chunk life6_156;
    forward_join_119: {
    forward_join_117: {
    forward_join_116: {
    forward_join_115: {
    forward_join_112: {
    forward_join_108: {
    forward_join_103: {
    forward_join_101: {
    forward_join_96: {
    forward_join_94: {
    forward_join_56: {
    forward_join_49: {
    forward_join_43: {
    forward_join_40: {
    forward_join_34: {
    forward_join_31: {
    forward_join_19: {
    forward_join_17: {
    life3_3 = (__fieldRead1707_0() ^ 85468313292871L);
    life5_5 = __call1707_1();
    spill1707_0 = __call1707_3(__fieldRead1707_2(receiver));
    if (!((life5_5 == null))) {
        forwardValue1707_19_0 = __integerCategory1707_4(spill1707_0);
        break forward_join_19;
    }
    if (!(spill1707_0)) {
        break forward_join_17;
    }
    if (!((p0 == __fieldRead1707_5()))) {
        break forward_join_17;
    }
    return 0;
    }
    forwardValue1707_19_0 = __call1707_6(p1);
    }
    if (!((life5_5 == null))) {
        forwardValue1707_34_0 = forwardValue1707_19_0;
        break forward_join_34;
    }
    if (!((forwardValue1707_19_0 < 0))) {
        break forward_join_31;
    }
    p1 = new moom.DT(__call1707_7(p1), 0, __call1707_8(p1));
    }
    forwardValue1707_34_0 = __integerCategory1707_10(__call1707_9(receiver, p1));
    }
    if (!((life5_5 == null))) {
        forwardValue1707_43_0 = forwardValue1707_34_0;
        break forward_join_43;
    }
    if (!((forwardValue1707_34_0 == 0))) {
        break forward_join_40;
    }
    return __fieldRead1707_11(p0);
    }
    forwardValue1707_43_0 = __integerCategory1707_13(__call1707_12(receiver, p1));
    }
    if (!((life5_5 == null))) {
        forwardValue1707_56_0 = forwardValue1707_43_0;
        break forward_join_56;
    }
    if (!((forwardValue1707_43_0 == 0))) {
        break forward_join_49;
    }
    return __fieldRead1707_14(p0);
    }
    spill1707_1 = receiver;
    spill1707_2 = p1;
    if (!((life5_5 == null))) {
        forwardValue1707_119_0 = spill1707_1;
        forwardValue1707_119_1 = spill1707_2;
        break forward_join_119;
    }
    forwardValue1707_56_0 = __integerCategory1707_18(__call1707_17(__call1707_16(__call1707_15(spill1707_1, spill1707_2))));
    }
    if (!((forwardValue1707_56_0 != 0))) {
        break forward_join_117;
    }
    life6_86 = __call1707_20(receiver, p0, __call1707_19(p1));
    life7_92 = __call1707_22(receiver, p0, __call1707_21(p1));
    life8_98 = __call1707_24(receiver, p0, __call1707_23(p1));
    life9_104 = __call1707_26(receiver, p0, __call1707_25(p1));
    life10_110 = __call1707_28(receiver, p0, __call1707_27(p1));
    spill1707_3 = life7_92;
    spill1707_4 = life6_86;
    if (!((life5_5 == null))) {
        forwardValue1707_96_0 = spill1707_3;
        forwardValue1707_96_1 = spill1707_4;
        break forward_join_96;
    }
    if (!((spill1707_3 > spill1707_4))) {
        break forward_join_94;
    }
    life6_86 = life7_92;
    }
    forwardValue1707_96_0 = life8_98;
    forwardValue1707_96_1 = life6_86;
    }
    if (!((life5_5 == null))) {
        forwardValue1707_103_0 = forwardValue1707_96_0;
        forwardValue1707_103_1 = forwardValue1707_96_1;
        break forward_join_103;
    }
    if (!((forwardValue1707_96_0 > forwardValue1707_96_1))) {
        break forward_join_101;
    }
    life6_86 = life8_98;
    }
    forwardValue1707_103_0 = life9_104;
    forwardValue1707_103_1 = life6_86;
    }
    if (!((life5_5 == null))) {
        forwardValue1707_112_0 = forwardValue1707_103_0;
        forwardValue1707_112_1 = forwardValue1707_103_1;
        break forward_join_112;
    }
    if (!((forwardValue1707_103_0 > forwardValue1707_103_1))) {
        break forward_join_108;
    }
    life6_86 = life9_104;
    }
    spill1707_5 = life10_110;
    if (!((life5_5 == null))) {
        forwardValue1707_116_0 = spill1707_5;
        break forward_join_116;
    }
    forwardValue1707_112_0 = spill1707_5;
    forwardValue1707_112_1 = life6_86;
    }
    if (!((forwardValue1707_112_0 > forwardValue1707_112_1))) {
        break forward_join_115;
    }
    life6_86 = life10_110;
    }
    forwardValue1707_116_0 = life6_86;
    }
    return forwardValue1707_116_0;
    }
    forwardValue1707_119_0 = receiver;
    forwardValue1707_119_1 = p1;
    }
    life6_156 = __call1707_29(forwardValue1707_119_0, forwardValue1707_119_1);
    return __call1707_30(life6_156, p0, p1);
}
public static void h1707_0(moom.Oo p0) throws Throwable {
    throw __call1170700_0(p0);
}
public static void h1707_1(moom.Oo p0) throws Throwable {
    throw __call1170701_0(p0);
}
public static void h1707_2(moom.Oo p0) throws Throwable {
    throw __call1170702_0(p0);
}
public static void h1707_3(moom.Oo p0) throws Throwable {
    throw __call1170703_0(p0);
}
public static void h1707_4(moom.Oo p0) throws Throwable {
    throw __call1170704_0(p0);
}
public static void h1707_5(moom.Oo p0) throws Throwable {
    throw __call1170705_0(p0);
}
public static void h1707_6(moom.Oo p0) throws Throwable {
    throw __call1170706_0(p0);
}
public static void h1707_7(moom.Oo p0) throws Throwable {
    throw __call1170707_0(p0);
}
public static void h1707_8(moom.Oo p0) throws Throwable {
    throw __call1170708_0(p0);
}
public static void h1707_9(moom.Oo p0) throws Throwable {
    throw __call1170709_0(p0);
}
public static void h1707_10(moom.Oo p0) throws Throwable {
    throw __call1170710_0(p0);
}
public static void h1707_11(moom.Oo p0) throws Throwable {
    throw __call1170711_0(p0);
}
public static void h1707_12(moom.Oo p0) throws Throwable {
    throw __call1170712_0(p0);
}
private static native long __fieldRead1707_0() throws Throwable;
private static native java.lang.String __call1707_1() throws Throwable;
private static native moom.EA __fieldRead1707_2(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1707_3(moom.EA a0) throws Throwable;
private static native int __integerCategory1707_4(boolean value) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1707_5() throws Throwable;
private static native int __call1707_6(moom.DT a0) throws Throwable;
private static native int __call1707_7(moom.DT a0) throws Throwable;
private static native int __call1707_8(moom.DT a0) throws Throwable;
private static native boolean __call1707_9(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1707_10(boolean value) throws Throwable;
private static native int __fieldRead1707_11(net.minecraft.world.EnumSkyBlock a0) throws Throwable;
private static native boolean __call1707_12(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1707_13(boolean value) throws Throwable;
private static native int __fieldRead1707_14(net.minecraft.world.EnumSkyBlock a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1707_15(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1707_16(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call1707_17(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory1707_18(boolean value) throws Throwable;
private static native moom.DT __call1707_19(moom.DT a0) throws Throwable;
private static native int __call1707_20(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native moom.DT __call1707_21(moom.DT a0) throws Throwable;
private static native int __call1707_22(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native moom.DT __call1707_23(moom.DT a0) throws Throwable;
private static native int __call1707_24(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native moom.DT __call1707_25(moom.DT a0) throws Throwable;
private static native int __call1707_26(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native moom.DT __call1707_27(moom.DT a0) throws Throwable;
private static native int __call1707_28(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1707_29(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __call1707_30(net.minecraft.world.chunk.Chunk a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native java.lang.Throwable __call1170700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170707_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170708_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170709_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170710_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170711_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170712_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bc28384d986384500e09(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2, int a3) throws E;
private static final class __SourceHandler_bc28384d986384500e09 {

public static void f1708(net.minecraft.world.World receiver, net.minecraft.world.EnumSkyBlock p0, moom.DT p1, int p2) throws Throwable {
    int forwardValue1708_17_0;
    net.minecraft.world.World forwardValue1708_20_0;
    moom.DT forwardValue1708_20_1;
    boolean spill1708_0;
    net.minecraft.world.World spill1708_1;
    moom.DT spill1708_2;
    long life4_3;
    java.lang.String life6_5;
    net.minecraft.world.chunk.Chunk life7_33;
    forward_join_30: {
    forward_join_20: {
    forward_join_17: {
    life4_3 = (__fieldRead1708_0() ^ 126532729927379L);
    life6_5 = __call1708_1();
    spill1708_0 = __call1708_2(receiver, p1);
    if (!((life6_5 == null))) {
        forwardValue1708_17_0 = __integerCategory1708_3(spill1708_0);
        break forward_join_17;
    }
    if (!(spill1708_0)) {
        break forward_join_30;
    }
    spill1708_1 = receiver;
    spill1708_2 = p1;
    if (!((life6_5 == null))) {
        forwardValue1708_20_0 = spill1708_1;
        forwardValue1708_20_1 = spill1708_2;
        break forward_join_20;
    }
    forwardValue1708_17_0 = __integerCategory1708_5(__call1708_4(spill1708_1, spill1708_2));
    }
    if (!((forwardValue1708_17_0 != 0))) {
        break forward_join_30;
    }
    forwardValue1708_20_0 = receiver;
    forwardValue1708_20_1 = p1;
    }
    life7_33 = __call1708_6(forwardValue1708_20_0, forwardValue1708_20_1);
    __call1708_7(life7_33, p0, p1, p2);
    __call1708_8(receiver, p1);
    }
    return;
}
public static void h1708_0(moom.Oo p0) throws Throwable {
    throw __call1170800_0(p0);
}
public static void h1708_1(moom.Oo p0) throws Throwable {
    throw __call1170801_0(p0);
}
public static void h1708_2(moom.Oo p0) throws Throwable {
    throw __call1170802_0(p0);
}
public static void h1708_3(moom.Oo p0) throws Throwable {
    throw __call1170803_0(p0);
}
private static native long __fieldRead1708_0() throws Throwable;
private static native java.lang.String __call1708_1() throws Throwable;
private static native boolean __call1708_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1708_3(boolean value) throws Throwable;
private static native boolean __call1708_4(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1708_5(boolean value) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1708_6(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native void __call1708_7(net.minecraft.world.chunk.Chunk a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2, int a3) throws Throwable;
private static native void __call1708_8(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native java.lang.Throwable __call1170800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1170803_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d30b1c2de87611971b62(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws E;
private static final class __SourceHandler_d30b1c2de87611971b62 {

public static boolean f716(net.minecraft.world.IBlockAccess p0, moom.DT p1) throws Throwable {
    int forestValue716_26_0;
    int forestValue716_37_0;
    int forestValue716_48_0;
    int forestValue716_61_0;
    int forestValue716_70_0;
    int forestValue716_72_0;
    java.lang.String spill716_0;
    boolean spill716_1;
    boolean spill716_2;
    int spill716_3;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_8;
    java.lang.String life4_9;
    net.minecraft.block.Block life6_12;
    forest_join_72: {
    forest_join_71: {
    forest_join_70: {
    forest_join_69: {
    forest_join_61: {
    forest_join_48: {
    forest_join_46: {
    forest_join_37: {
    forest_join_35: {
    forest_join_26: {
    forest_join_24: {
    life2_3 = (__fieldRead716_0() ^ 70874428905605L);
    spill716_0 = __call716_1();
    life5_8 = __call716_2(p0, p1);
    life4_9 = spill716_0;
    life6_12 = __call716_3(life5_8);
    spill716_1 = __call716_5(__call716_4(life6_12));
    if (!((life4_9 == null))) {
        forestValue716_26_0 = __integerCategory716_6(spill716_1);
        break forest_join_26;
    }
    if (!(spill716_1)) {
        break forest_join_24;
    }
    spill716_2 = __call716_7(life6_12);
    if (!((life4_9 == null))) {
        forestValue716_70_0 = __integerCategory716_8(spill716_2);
        break forest_join_70;
    }
    if (!((!spill716_2))) {
        break forest_join_69;
    }
    }
    forestValue716_26_0 = __instanceOf716_9(life6_12);
    }
    if (!((life4_9 == null))) {
        forestValue716_37_0 = forestValue716_26_0;
        break forest_join_37;
    }
    if (!((forestValue716_26_0 != 0))) {
        break forest_join_35;
    }
    if (!((__call716_11(life5_8, __fieldRead716_10()) == __fieldRead716_12()))) {
        break forest_join_71;
    }
    break forest_join_69;
    }
    forestValue716_37_0 = __instanceOf716_13(life6_12);
    }
    if (!((life4_9 == null))) {
        forestValue716_48_0 = forestValue716_37_0;
        break forest_join_48;
    }
    if (!((forestValue716_37_0 != 0))) {
        break forest_join_46;
    }
    if (!((__call716_15(life5_8, __fieldRead716_14()) == __fieldRead716_16()))) {
        break forest_join_71;
    }
    break forest_join_69;
    }
    forestValue716_48_0 = __instanceOf716_17(life6_12);
    }
    if (!((life4_9 == null))) {
        forestValue716_70_0 = forestValue716_48_0;
        break forest_join_70;
    }
    if (!((forestValue716_48_0 == 0))) {
        break forest_join_69;
    }
    spill716_3 = __instanceOf716_18(life6_12);
    if (!((life4_9 == null))) {
        forestValue716_61_0 = spill716_3;
        break forest_join_61;
    }
    if (!((spill716_3 != 0))) {
        break forest_join_71;
    }
    forestValue716_61_0 = __call716_22(__cast716_21(__call716_20(life5_8, __fieldRead716_19())));
    }
    if (!((life4_9 == null))) {
        forestValue716_70_0 = forestValue716_61_0;
        break forest_join_70;
    }
    if (!((forestValue716_61_0 == __invokedynamic716_23(19610, (946712574281493549L ^ life2_3))))) {
        break forest_join_71;
    }
    }
    forestValue716_70_0 = 1;
    }
    forestValue716_72_0 = forestValue716_70_0;
    break forest_join_72;
    }
    forestValue716_72_0 = 0;
    }
    return __integerCategory716_24(forestValue716_72_0);
}
public static boolean h716_0(moom.Oo p0) throws Throwable {
    throw __call3071600_0(p0);
}
public static boolean h716_1(moom.Oo p0) throws Throwable {
    throw __call3071601_0(p0);
}
public static boolean h716_2(moom.Oo p0) throws Throwable {
    throw __call3071602_0(p0);
}
public static boolean h716_3(moom.Oo p0) throws Throwable {
    throw __call3071603_0(p0);
}
public static boolean h716_4(moom.Oo p0) throws Throwable {
    throw __call3071604_0(p0);
}
public static boolean h716_5(moom.Oo p0) throws Throwable {
    throw __call3071605_0(p0);
}
public static boolean h716_6(moom.Oo p0) throws Throwable {
    throw __call3071606_0(p0);
}
public static boolean h716_7(moom.Oo p0) throws Throwable {
    throw __call3071607_0(p0);
}
public static boolean h716_8(moom.Oo p0) throws Throwable {
    throw __call3071608_0(p0);
}
public static boolean h716_9(moom.Oo p0) throws Throwable {
    throw __call3071609_0(p0);
}
public static boolean h716_10(moom.Oo p0) throws Throwable {
    throw __call3071610_0(p0);
}
public static boolean h716_11(moom.Oo p0) throws Throwable {
    throw __call3071611_0(p0);
}
public static boolean h716_12(moom.Oo p0) throws Throwable {
    throw __call3071612_0(p0);
}
public static boolean h716_13(moom.Oo p0) throws Throwable {
    throw __call3071613_0(p0);
}
public static boolean h716_14(moom.Oo p0) throws Throwable {
    throw __call3071614_0(p0);
}
public static boolean h716_15(moom.Oo p0) throws Throwable {
    throw __call3071615_0(p0);
}
private static native long __fieldRead716_0() throws Throwable;
private static native java.lang.String __call716_1() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call716_2(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call716_3(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call716_4(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call716_5(moom.fn a0) throws Throwable;
private static native int __integerCategory716_6(boolean value) throws Throwable;
private static native boolean __call716_7(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory716_8(boolean value) throws Throwable;
private static native int __instanceOf716_9(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fw __fieldRead716_10() throws Throwable;
private static native java.lang.Comparable __call716_11(net.minecraft.block.state.IBlockState a0, moom.fw a1) throws Throwable;
private static native moom.al __fieldRead716_12() throws Throwable;
private static native int __instanceOf716_13(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fw __fieldRead716_14() throws Throwable;
private static native java.lang.Comparable __call716_15(net.minecraft.block.state.IBlockState a0, moom.fw a1) throws Throwable;
private static native moom.ak __fieldRead716_16() throws Throwable;
private static native int __instanceOf716_17(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf716_18(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fy __fieldRead716_19() throws Throwable;
private static native java.lang.Comparable __call716_20(net.minecraft.block.state.IBlockState a0, moom.fy a1) throws Throwable;
private static native java.lang.Integer __cast716_21(java.lang.Comparable a0) throws Throwable;
private static native int __call716_22(java.lang.Integer a0) throws Throwable;
private static native int __invokedynamic716_23(int a0, long a1) throws Throwable;
private static native boolean __integerCategory716_24(int value) throws Throwable;
private static native java.lang.Throwable __call3071600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071609_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071610_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071611_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071612_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071613_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071614_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071615_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d8854783c0386a41d5b9(net.minecraft.world.World a0, net.minecraft.world.border.WorldBorder a1, net.minecraft.entity.Entity a2) throws E;
private static final class __SourceHandler_d8854783c0386a41d5b9 {

public static boolean f1710(net.minecraft.world.World receiver, net.minecraft.world.border.WorldBorder p0, net.minecraft.entity.Entity p1) throws Throwable {
    int forwardValue1710_68_0;
    int forwardValue1710_75_0;
    int forwardValue1710_82_0;
    int forwardValue1710_86_0;
    int forwardValue1710_88_0;
    java.lang.String spill1710_0;
    int spill1710_1;
    long life3_3;
    double life6_6;
    double life8_10;
    double life10_13;
    java.lang.String life5_14;
    double life12_17;
    forward_join_88: {
    forward_join_87: {
    forward_join_86: {
    forward_join_82: {
    forward_join_75: {
    forward_join_68: {
    forward_join_57: {
    forward_join_53: {
    forward_join_41: {
    life3_3 = (__fieldRead1710_0() ^ 95979188657484L);
    life6_6 = __call1710_1(p0);
    spill1710_0 = __call1710_2();
    life8_10 = __call1710_3(p0);
    life10_13 = __call1710_4(p0);
    life5_14 = spill1710_0;
    life12_17 = __call1710_5(p0);
    if (!((life5_14 == null))) {
        break forward_join_53;
    }
    if (!(__call1710_6(p1))) {
        break forward_join_41;
    }
    life6_6 = (life6_6 + 0x1.0p0d);
    life8_10 = (life8_10 + 0x1.0p0d);
    life10_13 = (life10_13 - 0x1.0p0d);
    life12_17 = (life12_17 - 0x1.0p0d);
    if (!((life5_14 != null))) {
        break forward_join_57;
    }
    }
    life6_6 = (life6_6 - 0x1.0p0d);
    life8_10 = (life8_10 - 0x1.0p0d);
    life10_13 = (life10_13 + 0x1.0p0d);
    }
    life12_17 = (life12_17 + 0x1.0p0d);
    }
    spill1710_1 = __numericCompare1710_8(__fieldRead1710_7(p1), life6_6);
    if (!((life5_14 == null))) {
        forwardValue1710_68_0 = spill1710_1;
        break forward_join_68;
    }
    if (!((spill1710_1 > 0))) {
        break forward_join_87;
    }
    forwardValue1710_68_0 = __numericCompare1710_10(__fieldRead1710_9(p1), life10_13);
    }
    if (!((life5_14 == null))) {
        forwardValue1710_75_0 = forwardValue1710_68_0;
        break forward_join_75;
    }
    if (!((forwardValue1710_68_0 < 0))) {
        break forward_join_87;
    }
    forwardValue1710_75_0 = __numericCompare1710_12(__fieldRead1710_11(p1), life8_10);
    }
    if (!((life5_14 == null))) {
        forwardValue1710_82_0 = forwardValue1710_75_0;
        break forward_join_82;
    }
    if (!((forwardValue1710_75_0 > 0))) {
        break forward_join_87;
    }
    forwardValue1710_82_0 = __numericCompare1710_14(__fieldRead1710_13(p1), life12_17);
    }
    if (!((life5_14 == null))) {
        forwardValue1710_86_0 = forwardValue1710_82_0;
        break forward_join_86;
    }
    if (!((forwardValue1710_82_0 < 0))) {
        break forward_join_87;
    }
    forwardValue1710_86_0 = 1;
    }
    forwardValue1710_88_0 = forwardValue1710_86_0;
    break forward_join_88;
    }
    forwardValue1710_88_0 = 0;
    }
    return __integerCategory1710_15(forwardValue1710_88_0);
}
public static void h1710_0(moom.Oo p0) throws Throwable {
    throw __call1171000_0(p0);
}
public static void h1710_1(moom.Oo p0) throws Throwable {
    throw __call1171001_0(p0);
}
public static void h1710_2(moom.Oo p0) throws Throwable {
    throw __call1171002_0(p0);
}
public static void h1710_3(moom.Oo p0) throws Throwable {
    throw __call1171003_0(p0);
}
public static void h1710_4(moom.Oo p0) throws Throwable {
    throw __call1171004_0(p0);
}
public static void h1710_5(moom.Oo p0) throws Throwable {
    throw __call1171005_0(p0);
}
public static void h1710_6(moom.Oo p0) throws Throwable {
    throw __call1171006_0(p0);
}
public static void h1710_7(moom.Oo p0) throws Throwable {
    throw __call1171007_0(p0);
}
private static native long __fieldRead1710_0() throws Throwable;
private static native double __call1710_1(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native java.lang.String __call1710_2() throws Throwable;
private static native double __call1710_3(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native double __call1710_4(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native double __call1710_5(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native boolean __call1710_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1710_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1710_8(double a0, double a1) throws Throwable;
private static native double __fieldRead1710_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1710_10(double a0, double a1) throws Throwable;
private static native double __fieldRead1710_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1710_12(double a0, double a1) throws Throwable;
private static native double __fieldRead1710_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1710_14(double a0, double a1) throws Throwable;
private static native boolean __integerCategory1710_15(int value) throws Throwable;
private static native java.lang.Throwable __call1171000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171007_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.tileentity.TileEntity __sourceHandlerCall_f4dac35ab9ae8091181b(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_f4dac35ab9ae8091181b {

public static net.minecraft.tileentity.TileEntity f717(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    net.minecraft.world.World forestValue717_20_0;
    int forestValue717_41_0;
    net.minecraft.tileentity.TileEntity forestValue717_45_0;
    net.minecraft.tileentity.TileEntity forestValue717_58_0;
    int forestValue717_85_0;
    net.minecraft.tileentity.TileEntity forestValue717_87_0;
    net.minecraft.tileentity.TileEntity forestValue717_93_0;
    net.minecraft.world.World spill717_0;
    boolean spill717_1;
    net.minecraft.tileentity.TileEntity spill717_2;
    net.minecraft.tileentity.TileEntity spill717_3;
    net.minecraft.tileentity.TileEntity spill717_4;
    boolean spill717_5;
    net.minecraft.tileentity.TileEntity spill717_6;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.tileentity.TileEntity life5_13;
    java.util.Iterator life6_24;
    net.minecraft.tileentity.TileEntity life7_31;
    java.util.Iterator life6_72;
    net.minecraft.tileentity.TileEntity life7_79;
    forest_join_93: {
    forest_join_92: {
    forest_join_58: {
    forest_join_57: {
    forest_join_46: {
    forest_join_45: {
    forest_join_44: {
    forest_join_20: {
    forest_join_12: {
    life2_3 = (__fieldRead717_0() ^ 87040219177030L);
    life4_5 = __call717_1();
    if (!((!__call717_2(receiver, p0)))) {
        break forest_join_12;
    }
    return null;
    }
    life5_13 = null;
    spill717_0 = receiver;
    if (!((life4_5 == null))) {
        forestValue717_20_0 = spill717_0;
        break forest_join_20;
    }
    if (!(__fieldRead717_3(spill717_0))) {
        break forest_join_46;
    }
    forestValue717_20_0 = receiver;
    }
    life6_24 = __call717_5(__fieldRead717_4(forestValue717_20_0));
    forest_cycle_23: while (true) {
    forest_join_43: {
    forest_join_41: {
    if (!(__call717_6(life6_24))) {
        break forest_join_46;
    }
    life7_31 = __cast717_8(__call717_7(life6_24));
    spill717_1 = __call717_9(life7_31);
    if (!((life4_5 == null))) {
        forestValue717_41_0 = __integerCategory717_10(spill717_1);
        break forest_join_41;
    }
    if (!((!spill717_1))) {
        break forest_join_43;
    }
    spill717_2 = life7_31;
    if (!((life4_5 == null))) {
        forestValue717_45_0 = spill717_2;
        break forest_join_45;
    }
    forestValue717_41_0 = __integerCategory717_13(__call717_12(__call717_11(spill717_2), p0));
    }
    if (!((forestValue717_41_0 != 0))) {
        break forest_join_43;
    }
    break forest_join_44;
    }
    continue forest_cycle_23;
    }
    }
    forestValue717_45_0 = life7_31;
    }
    life5_13 = forestValue717_45_0;
    }
    spill717_3 = life5_13;
    if (!((life4_5 == null))) {
        forestValue717_58_0 = spill717_3;
        break forest_join_58;
    }
    if (!((spill717_3 == null))) {
        break forest_join_57;
    }
    life5_13 = __call717_16(__call717_14(receiver, p0), p0, __fieldRead717_15());
    }
    forestValue717_58_0 = life5_13;
    }
    if (!((life4_5 == null))) {
        forestValue717_93_0 = forestValue717_58_0;
        break forest_join_93;
    }
    if (!((forestValue717_58_0 == null))) {
        break forest_join_92;
    }
    life6_72 = __call717_18(__fieldRead717_17(receiver));
    forest_cycle_65: while (true) {
    forest_join_90: {
    forest_join_87: {
    forest_join_85: {
    if (!(__call717_19(life6_72))) {
        break forest_join_92;
    }
    life7_79 = __cast717_21(__call717_20(life6_72));
    spill717_4 = life7_79;
    if (!((life4_5 == null))) {
        forestValue717_93_0 = spill717_4;
        break forest_join_93;
    }
    spill717_5 = __call717_22(spill717_4);
    if (!((life4_5 == null))) {
        forestValue717_85_0 = __integerCategory717_23(spill717_5);
        break forest_join_85;
    }
    if (!((!spill717_5))) {
        break forest_join_90;
    }
    spill717_6 = life7_79;
    if (!((life4_5 == null))) {
        forestValue717_87_0 = spill717_6;
        break forest_join_87;
    }
    forestValue717_85_0 = __integerCategory717_26(__call717_25(__call717_24(spill717_6), p0));
    }
    if (!((forestValue717_85_0 != 0))) {
        break forest_join_90;
    }
    forestValue717_87_0 = life7_79;
    }
    life5_13 = forestValue717_87_0;
    if (!((life4_5 != null))) {
        break forest_join_92;
    }
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_65;
    }
    break forest_cycle_65;
    }
    }
    forestValue717_93_0 = life5_13;
    }
    return forestValue717_93_0;
}
public static net.minecraft.tileentity.TileEntity h717_0(moom.Oo p0) throws Throwable {
    throw __call3071700_0(p0);
}
public static net.minecraft.tileentity.TileEntity h717_1(moom.Oo p0) throws Throwable {
    throw __call3071701_0(p0);
}
public static net.minecraft.tileentity.TileEntity h717_2(moom.Oo p0) throws Throwable {
    throw __call3071702_0(p0);
}
public static net.minecraft.tileentity.TileEntity h717_3(moom.Oo p0) throws Throwable {
    throw __call3071703_0(p0);
}
public static net.minecraft.tileentity.TileEntity h717_4(moom.Oo p0) throws Throwable {
    throw __call3071704_0(p0);
}
public static net.minecraft.tileentity.TileEntity h717_5(moom.Oo p0) throws Throwable {
    throw __call3071705_0(p0);
}
public static net.minecraft.tileentity.TileEntity h717_6(moom.Oo p0) throws Throwable {
    throw __call3071706_0(p0);
}
public static net.minecraft.tileentity.TileEntity h717_7(moom.Oo p0) throws Throwable {
    throw __call3071707_0(p0);
}
public static net.minecraft.tileentity.TileEntity h717_8(moom.Oo p0) throws Throwable {
    throw __call3071708_0(p0);
}
public static net.minecraft.tileentity.TileEntity h717_9(moom.Oo p0) throws Throwable {
    throw __call3071709_0(p0);
}
public static net.minecraft.tileentity.TileEntity h717_10(moom.Oo p0) throws Throwable {
    throw __call3071710_0(p0);
}
public static net.minecraft.tileentity.TileEntity h717_11(moom.Oo p0) throws Throwable {
    throw __call3071711_0(p0);
}
public static net.minecraft.tileentity.TileEntity h717_12(moom.Oo p0) throws Throwable {
    throw __call3071712_0(p0);
}
private static native long __fieldRead717_0() throws Throwable;
private static native java.lang.String __call717_1() throws Throwable;
private static native boolean __call717_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native boolean __fieldRead717_3(net.minecraft.world.World a0) throws Throwable;
private static native java.util.List __fieldRead717_4(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call717_5(java.util.List a0) throws Throwable;
private static native boolean __call717_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call717_7(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast717_8(java.lang.Object a0) throws Throwable;
private static native boolean __call717_9(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __integerCategory717_10(boolean value) throws Throwable;
private static native moom.DT __call717_11(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native boolean __call717_12(moom.DT a0, moom.DT a1) throws Throwable;
private static native int __integerCategory717_13(boolean value) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call717_14(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk$EnumCreateEntityType __fieldRead717_15() throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call717_16(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.world.chunk.Chunk$EnumCreateEntityType a2) throws Throwable;
private static native java.util.List __fieldRead717_17(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call717_18(java.util.List a0) throws Throwable;
private static native boolean __call717_19(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call717_20(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast717_21(java.lang.Object a0) throws Throwable;
private static native boolean __call717_22(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __integerCategory717_23(boolean value) throws Throwable;
private static native moom.DT __call717_24(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native boolean __call717_25(moom.DT a0, moom.DT a1) throws Throwable;
private static native int __integerCategory717_26(boolean value) throws Throwable;
private static native java.lang.Throwable __call3071700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071707_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071708_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071709_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071710_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071711_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3071712_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_fce0bc5749b3f2dbf1c5(net.minecraft.world.World a0, double a1, double a2, double a3, double a4) throws E;
private static final class __SourceHandler_fce0bc5749b3f2dbf1c5 {

public static boolean f1712(net.minecraft.world.World receiver, double p0, double p1, double p2, double p3) throws Throwable {
    int lexicalValue1712_44_0;
    int lexicalValue1712_48_0;
    java.lang.String spill1712_0;
    boolean spill1712_1;
    int spill1712_2;
    int spill1712_3;
    long life9_3;
    java.util.Iterator life12_8;
    java.lang.String life11_9;
    net.minecraft.entity.player.EntityPlayer life13_16;
    double life14_31;
    lexical_join_48: {
    lexical_join_47: {
    life9_3 = (__fieldRead1712_0() ^ 58938531696301L);
    spill1712_0 = __call1712_1();
    life12_8 = __call1712_3(__fieldRead1712_2(receiver));
    life11_9 = spill1712_0;
    lexical_cycle_10: while (true) {
    lexical_join_45: {
    lexical_join_44: {
    lexical_join_43: {
    if (!(__call1712_4(life12_8))) {
        break lexical_join_47;
    }
    life13_16 = __cast1712_6(__call1712_5(life12_8));
    spill1712_1 = __call1712_8(__fieldRead1712_7(), life13_16);
    if (!((life11_9 == null))) {
        lexicalValue1712_48_0 = __integerCategory1712_9(spill1712_1);
        break lexical_join_48;
    }
    if (!(spill1712_1)) {
        break lexical_join_45;
    }
    life14_31 = __call1712_10(life13_16, p0, p1, p2);
    spill1712_2 = __numericCompare1712_11(p3, 0x0.0p0d);
    if (!((life11_9 == null))) {
        lexicalValue1712_44_0 = spill1712_2;
        break lexical_join_44;
    }
    if (!((spill1712_2 >= 0))) {
        break lexical_join_43;
    }
    spill1712_3 = __numericCompare1712_12(life14_31, (p3 * p3));
    if (!((life11_9 == null))) {
        lexicalValue1712_44_0 = spill1712_3;
        break lexical_join_44;
    }
    if (!((spill1712_3 < 0))) {
        break lexical_join_45;
    }
    }
    lexicalValue1712_44_0 = 1;
    }
    return __integerCategory1712_13(lexicalValue1712_44_0);
    }
    if (!((life11_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1712_48_0 = 0;
    }
    return __integerCategory1712_14(lexicalValue1712_48_0);
}
public static void h1712_0(moom.Oo p0) throws Throwable {
    throw __call1171200_0(p0);
}
public static void h1712_1(moom.Oo p0) throws Throwable {
    throw __call1171201_0(p0);
}
public static void h1712_2(moom.Oo p0) throws Throwable {
    throw __call1171202_0(p0);
}
public static void h1712_3(moom.Oo p0) throws Throwable {
    throw __call1171203_0(p0);
}
private static native long __fieldRead1712_0() throws Throwable;
private static native java.lang.String __call1712_1() throws Throwable;
private static native java.util.List __fieldRead1712_2(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call1712_3(java.util.List a0) throws Throwable;
private static native boolean __call1712_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1712_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1712_6(java.lang.Object a0) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead1712_7() throws Throwable;
private static native boolean __call1712_8(com.google.common.base.Predicate a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native int __integerCategory1712_9(boolean value) throws Throwable;
private static native double __call1712_10(net.minecraft.entity.player.EntityPlayer a0, double a1, double a2, double a3) throws Throwable;
private static native int __numericCompare1712_11(double a0, double a1) throws Throwable;
private static native int __numericCompare1712_12(double a0, double a1) throws Throwable;
private static native boolean __integerCategory1712_13(int value) throws Throwable;
private static native boolean __integerCategory1712_14(int value) throws Throwable;
private static native java.lang.Throwable __call1171200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171203_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9b90f2ce8f1a10a39fe4(net.minecraft.world.World a0, int a1, int a2) throws E;
private static final class __SourceHandler_9b90f2ce8f1a10a39fe4 {

public static boolean f1713(net.minecraft.world.World receiver, int p0, int p1) throws Throwable {
    int forwardValue1713_57_0;
    int forwardValue1713_57_1;
    int forwardValue1713_63_0;
    int forwardValue1713_63_1;
    int forwardValue1713_70_0;
    int forwardValue1713_70_1;
    int forwardValue1713_72_0;
    int forwardValue1713_74_0;
    java.lang.String spill1713_0;
    int spill1713_1;
    int spill1713_2;
    int spill1713_3;
    long life3_3;
    moom.DT life6_6;
    int life7_23;
    int life8_41;
    java.lang.String life5_42;
    int life9_48;
    forward_join_74: {
    forward_join_73: {
    forward_join_72: {
    forward_join_70: {
    forward_join_63: {
    forward_join_57: {
    life3_3 = (__fieldRead1713_0() ^ 131433003649119L);
    life6_6 = __call1713_1(receiver);
    life7_23 = (((p0 * __invokedynamic1713_2(4563, (7598646255533351315L ^ life3_3))) + __invokedynamic1713_3(16662, (7984311829271851376L ^ life3_3))) - __call1713_4(life6_6));
    spill1713_0 = __call1713_5();
    life8_41 = (((p1 * __invokedynamic1713_6(4563, (7598646255533351315L ^ life3_3))) + __invokedynamic1713_7(16662, (7984311829271851376L ^ life3_3))) - __call1713_8(life6_6));
    life5_42 = spill1713_0;
    life9_48 = __invokedynamic1713_9(27045, (669912695770978768L ^ life3_3));
    spill1713_1 = life7_23;
    spill1713_2 = (-life9_48);
    if (!((life5_42 == null))) {
        forwardValue1713_57_0 = spill1713_1;
        forwardValue1713_57_1 = spill1713_2;
        break forward_join_57;
    }
    if (!((spill1713_1 >= spill1713_2))) {
        break forward_join_73;
    }
    forwardValue1713_57_0 = life7_23;
    forwardValue1713_57_1 = life9_48;
    }
    if (!((life5_42 == null))) {
        forwardValue1713_63_0 = forwardValue1713_57_0;
        forwardValue1713_63_1 = forwardValue1713_57_1;
        break forward_join_63;
    }
    if (!((forwardValue1713_57_0 <= forwardValue1713_57_1))) {
        break forward_join_73;
    }
    forwardValue1713_63_0 = life8_41;
    forwardValue1713_63_1 = (-life9_48);
    }
    if (!((life5_42 == null))) {
        forwardValue1713_70_0 = forwardValue1713_63_0;
        forwardValue1713_70_1 = forwardValue1713_63_1;
        break forward_join_70;
    }
    if (!((forwardValue1713_63_0 >= forwardValue1713_63_1))) {
        break forward_join_73;
    }
    spill1713_3 = life8_41;
    if (!((life5_42 == null))) {
        forwardValue1713_72_0 = spill1713_3;
        break forward_join_72;
    }
    forwardValue1713_70_0 = spill1713_3;
    forwardValue1713_70_1 = life9_48;
    }
    if (!((forwardValue1713_70_0 <= forwardValue1713_70_1))) {
        break forward_join_73;
    }
    forwardValue1713_72_0 = 1;
    }
    forwardValue1713_74_0 = forwardValue1713_72_0;
    break forward_join_74;
    }
    forwardValue1713_74_0 = 0;
    }
    return __integerCategory1713_10(forwardValue1713_74_0);
}
public static void h1713_0(moom.Oo p0) throws Throwable {
    throw __call1171300_0(p0);
}
public static void h1713_1(moom.Oo p0) throws Throwable {
    throw __call1171301_0(p0);
}
public static void h1713_2(moom.Oo p0) throws Throwable {
    throw __call1171302_0(p0);
}
public static void h1713_3(moom.Oo p0) throws Throwable {
    throw __call1171303_0(p0);
}
public static void h1713_4(moom.Oo p0) throws Throwable {
    throw __call1171304_0(p0);
}
public static void h1713_5(moom.Oo p0) throws Throwable {
    throw __call1171305_0(p0);
}
public static void h1713_6(moom.Oo p0) throws Throwable {
    throw __call1171306_0(p0);
}
private static native long __fieldRead1713_0() throws Throwable;
private static native moom.DT __call1713_1(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1713_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic1713_3(int a0, long a1) throws Throwable;
private static native int __call1713_4(moom.DT a0) throws Throwable;
private static native java.lang.String __call1713_5() throws Throwable;
private static native int __invokedynamic1713_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic1713_7(int a0, long a1) throws Throwable;
private static native int __call1713_8(moom.DT a0) throws Throwable;
private static native int __invokedynamic1713_9(int a0, long a1) throws Throwable;
private static native boolean __integerCategory1713_10(int value) throws Throwable;
private static native java.lang.Throwable __call1171300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171306_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e71eb09d6f0c823cd704(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_e71eb09d6f0c823cd704 {

public static boolean f1714(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    int forwardValue1714_24_0;
    int forwardValue1714_28_0;
    int forwardValue1714_30_0;
    int forwardValue1714_39_0;
    net.minecraft.world.World forwardValue1714_43_0;
    int forwardValue1714_52_0;
    boolean spill1714_0;
    int spill1714_1;
    net.minecraft.world.World spill1714_2;
    long life2_3;
    java.lang.String life4_5;
    int life5_42;
    forward_join_52: {
    forward_join_51: {
    forward_join_43: {
    forward_join_42: {
    forward_join_39: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life2_3 = (__fieldRead1714_0() ^ 111325522549284L);
    life4_5 = __call1714_1();
    spill1714_0 = __call1714_3(__call1714_2(), "\n");
    if (!((life4_5 == null))) {
        forwardValue1714_24_0 = __integerCategory1714_4(spill1714_0);
        break forward_join_24;
    }
    if (!(spill1714_0)) {
        break forward_join_15;
    }
    if (!((__call1714_6(__call1714_5()) == null))) {
        break forward_join_29;
    }
    }
    forwardValue1714_24_0 = __numericCompare1714_10((__call1714_7() - __call1714_8()), __invokedynamic1714_9(3626, (7412777254141881414L ^ life2_3)));
    }
    if (!((life4_5 == null))) {
        forwardValue1714_28_0 = forwardValue1714_24_0;
        break forward_join_28;
    }
    if (!((forwardValue1714_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue1714_28_0 = 1;
    }
    forwardValue1714_30_0 = forwardValue1714_28_0;
    break forward_join_30;
    }
    forwardValue1714_30_0 = 0;
    }
    life5_42 = forwardValue1714_30_0;
    spill1714_1 = life5_42;
    if (!((life4_5 == null))) {
        forwardValue1714_39_0 = spill1714_1;
        break forward_join_39;
    }
    if (!((spill1714_1 != 0))) {
        break forward_join_42;
    }
    spill1714_2 = receiver;
    if (!((life4_5 == null))) {
        forwardValue1714_43_0 = spill1714_2;
        break forward_join_43;
    }
    forwardValue1714_39_0 = __integerCategory1714_12(__call1714_11(spill1714_2));
    }
    if (!((forwardValue1714_39_0 == 0))) {
        break forward_join_42;
    }
    return __integerCategory1714_13(0);
    }
    forwardValue1714_43_0 = receiver;
    }
    if (!((__call1714_16(__call1714_15(__call1714_14(forwardValue1714_43_0, p0))) == __fieldRead1714_17()))) {
        break forward_join_51;
    }
    forwardValue1714_52_0 = 1;
    break forward_join_52;
    }
    forwardValue1714_52_0 = 0;
    }
    return __integerCategory1714_18(forwardValue1714_52_0);
}
public static void h1714_0(moom.Oo p0) throws Throwable {
    throw __call1171400_0(p0);
}
public static void h1714_1(moom.Oo p0) throws Throwable {
    throw __call1171401_0(p0);
}
public static void h1714_2(moom.Oo p0) throws Throwable {
    throw __call1171402_0(p0);
}
public static void h1714_3(moom.Oo p0) throws Throwable {
    throw __call1171403_0(p0);
}
public static void h1714_4(moom.Oo p0) throws Throwable {
    throw __call1171404_0(p0);
}
public static void h1714_5(moom.Oo p0) throws Throwable {
    throw __call1171405_0(p0);
}
public static void h1714_6(moom.Oo p0) throws Throwable {
    throw __call1171406_0(p0);
}
public static void h1714_7(moom.Oo p0) throws Throwable {
    throw __call1171407_0(p0);
}
public static void h1714_8(moom.Oo p0) throws Throwable {
    throw __call1171408_0(p0);
}
private static native long __fieldRead1714_0() throws Throwable;
private static native java.lang.String __call1714_1() throws Throwable;
private static native java.lang.String __call1714_2() throws Throwable;
private static native boolean __call1714_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1714_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call1714_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call1714_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native long __call1714_7() throws Throwable;
private static native long __call1714_8() throws Throwable;
private static native long __invokedynamic1714_9(int a0, long a1) throws Throwable;
private static native int __numericCompare1714_10(long a0, long a1) throws Throwable;
private static native boolean __call1714_11(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1714_12(boolean value) throws Throwable;
private static native boolean __integerCategory1714_13(int value) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1714_14(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1714_15(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call1714_16(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1714_17() throws Throwable;
private static native boolean __integerCategory1714_18(int value) throws Throwable;
private static native java.lang.Throwable __call1171400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171408_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f2dc60cf60910f351390(net.minecraft.world.World a0, moom.DT a1, int a2) throws E;
private static final class __SourceHandler_f2dc60cf60910f351390 {

public static boolean f1715(net.minecraft.world.World receiver, moom.DT p0, int p1) throws Throwable {
    int forwardValue1715_24_0;
    int forwardValue1715_28_0;
    int forwardValue1715_30_0;
    int forwardValue1715_47_0;
    boolean spill1715_0;
    int spill1715_1;
    boolean spill1715_2;
    long life3_3;
    java.lang.String life5_5;
    int life6_42;
    forward_join_47: {
    forward_join_42: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life3_3 = (__fieldRead1715_0() ^ 81798038651513L);
    life5_5 = __call1715_1();
    spill1715_0 = __call1715_3(__call1715_2(), "\n");
    if (!((life5_5 == null))) {
        forwardValue1715_24_0 = __integerCategory1715_4(spill1715_0);
        break forward_join_24;
    }
    if (!(spill1715_0)) {
        break forward_join_15;
    }
    if (!((__call1715_6(__call1715_5()) == null))) {
        break forward_join_29;
    }
    }
    forwardValue1715_24_0 = __numericCompare1715_10((__call1715_7() - __call1715_8()), __invokedynamic1715_9(3626, (7412739142092108827L ^ life3_3)));
    }
    if (!((life5_5 == null))) {
        forwardValue1715_28_0 = forwardValue1715_24_0;
        break forward_join_28;
    }
    if (!((forwardValue1715_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue1715_28_0 = 1;
    }
    forwardValue1715_30_0 = forwardValue1715_28_0;
    break forward_join_30;
    }
    forwardValue1715_30_0 = 0;
    }
    life6_42 = forwardValue1715_30_0;
    spill1715_1 = life6_42;
    if (!((life5_5 == null))) {
        forwardValue1715_47_0 = spill1715_1;
        break forward_join_47;
    }
    if (!((spill1715_1 != 0))) {
        break forward_join_42;
    }
    spill1715_2 = __call1715_11(receiver);
    if (!((life5_5 == null))) {
        forwardValue1715_47_0 = __integerCategory1715_12(spill1715_2);
        break forward_join_47;
    }
    if (!((!spill1715_2))) {
        break forward_join_42;
    }
    return __integerCategory1715_13(0);
    }
    forwardValue1715_47_0 = __integerCategory1715_15(__call1715_14(receiver, p0, p1, 1));
    }
    return __integerCategory1715_16(forwardValue1715_47_0);
}
public static void h1715_0(moom.Oo p0) throws Throwable {
    throw __call1171500_0(p0);
}
public static void h1715_1(moom.Oo p0) throws Throwable {
    throw __call1171501_0(p0);
}
public static void h1715_2(moom.Oo p0) throws Throwable {
    throw __call1171502_0(p0);
}
public static void h1715_3(moom.Oo p0) throws Throwable {
    throw __call1171503_0(p0);
}
public static void h1715_4(moom.Oo p0) throws Throwable {
    throw __call1171504_0(p0);
}
public static void h1715_5(moom.Oo p0) throws Throwable {
    throw __call1171505_0(p0);
}
public static void h1715_6(moom.Oo p0) throws Throwable {
    throw __call1171506_0(p0);
}
public static void h1715_7(moom.Oo p0) throws Throwable {
    throw __call1171507_0(p0);
}
private static native long __fieldRead1715_0() throws Throwable;
private static native java.lang.String __call1715_1() throws Throwable;
private static native java.lang.String __call1715_2() throws Throwable;
private static native boolean __call1715_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1715_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call1715_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call1715_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native long __call1715_7() throws Throwable;
private static native long __call1715_8() throws Throwable;
private static native long __invokedynamic1715_9(int a0, long a1) throws Throwable;
private static native int __numericCompare1715_10(long a0, long a1) throws Throwable;
private static native boolean __call1715_11(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1715_12(boolean value) throws Throwable;
private static native boolean __integerCategory1715_13(int value) throws Throwable;
private static native boolean __call1715_14(net.minecraft.world.World a0, moom.DT a1, int a2, int a3) throws Throwable;
private static native int __integerCategory1715_15(boolean value) throws Throwable;
private static native boolean __integerCategory1715_16(int value) throws Throwable;
private static native java.lang.Throwable __call1171500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171507_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3c7b3c79e35d121c4bd3(net.minecraft.world.World a0, moom.DT a1, moom.DT a2) throws E;
private static final class __SourceHandler_3c7b3c79e35d121c4bd3 {

public static boolean f1716(net.minecraft.world.World receiver, moom.DT p0, moom.DT p1) throws Throwable {
    int forwardValue1716_24_0;
    int forwardValue1716_28_0;
    int forwardValue1716_30_0;
    int forwardValue1716_47_0;
    boolean spill1716_0;
    int spill1716_1;
    boolean spill1716_2;
    long life3_3;
    java.lang.String life5_5;
    int life6_42;
    forward_join_47: {
    forward_join_42: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life3_3 = (__fieldRead1716_0() ^ 62266370984147L);
    life5_5 = __call1716_1();
    spill1716_0 = __call1716_3(__call1716_2(), "\n");
    if (!((life5_5 == null))) {
        forwardValue1716_24_0 = __integerCategory1716_4(spill1716_0);
        break forward_join_24;
    }
    if (!(spill1716_0)) {
        break forward_join_15;
    }
    if (!((__call1716_6(__call1716_5()) == null))) {
        break forward_join_29;
    }
    }
    forwardValue1716_24_0 = __numericCompare1716_10((__call1716_7() - __call1716_8()), __invokedynamic1716_9(3626, (7412683356672736945L ^ life3_3)));
    }
    if (!((life5_5 == null))) {
        forwardValue1716_28_0 = forwardValue1716_24_0;
        break forward_join_28;
    }
    if (!((forwardValue1716_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue1716_28_0 = 1;
    }
    forwardValue1716_30_0 = forwardValue1716_28_0;
    break forward_join_30;
    }
    forwardValue1716_30_0 = 0;
    }
    life6_42 = forwardValue1716_30_0;
    spill1716_1 = life6_42;
    if (!((life5_5 == null))) {
        forwardValue1716_47_0 = spill1716_1;
        break forward_join_47;
    }
    if (!((spill1716_1 != 0))) {
        break forward_join_42;
    }
    spill1716_2 = __call1716_11(receiver);
    if (!((life5_5 == null))) {
        forwardValue1716_47_0 = __integerCategory1716_12(spill1716_2);
        break forward_join_47;
    }
    if (!((!spill1716_2))) {
        break forward_join_42;
    }
    return __integerCategory1716_13(0);
    }
    forwardValue1716_47_0 = __integerCategory1716_15(__call1716_14(receiver, p0, p1, 1));
    }
    return __integerCategory1716_16(forwardValue1716_47_0);
}
public static void h1716_0(moom.Oo p0) throws Throwable {
    throw __call1171600_0(p0);
}
public static void h1716_1(moom.Oo p0) throws Throwable {
    throw __call1171601_0(p0);
}
public static void h1716_2(moom.Oo p0) throws Throwable {
    throw __call1171602_0(p0);
}
public static void h1716_3(moom.Oo p0) throws Throwable {
    throw __call1171603_0(p0);
}
public static void h1716_4(moom.Oo p0) throws Throwable {
    throw __call1171604_0(p0);
}
public static void h1716_5(moom.Oo p0) throws Throwable {
    throw __call1171605_0(p0);
}
public static void h1716_6(moom.Oo p0) throws Throwable {
    throw __call1171606_0(p0);
}
public static void h1716_7(moom.Oo p0) throws Throwable {
    throw __call1171607_0(p0);
}
private static native long __fieldRead1716_0() throws Throwable;
private static native java.lang.String __call1716_1() throws Throwable;
private static native java.lang.String __call1716_2() throws Throwable;
private static native boolean __call1716_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1716_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call1716_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call1716_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native long __call1716_7() throws Throwable;
private static native long __call1716_8() throws Throwable;
private static native long __invokedynamic1716_9(int a0, long a1) throws Throwable;
private static native int __numericCompare1716_10(long a0, long a1) throws Throwable;
private static native boolean __call1716_11(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1716_12(boolean value) throws Throwable;
private static native boolean __integerCategory1716_13(int value) throws Throwable;
private static native boolean __call1716_14(net.minecraft.world.World a0, moom.DT a1, moom.DT a2, int a3) throws Throwable;
private static native int __integerCategory1716_15(boolean value) throws Throwable;
private static native boolean __integerCategory1716_16(int value) throws Throwable;
private static native java.lang.Throwable __call1171600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171607_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_1f4334eb6bb035f8e19d(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws E;
private static final class __SourceHandler_1f4334eb6bb035f8e19d {

public static boolean f1717(net.minecraft.world.World receiver, moom.DT p0, moom.bs p1) throws Throwable {
    int forwardValue1717_14_0;
    int forwardValue1717_16_0;
    int spill1717_0;
    long life3_3;
    java.lang.String life5_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life3_3 = (__fieldRead1717_0() ^ 67895210218662L);
    life5_5 = __call1717_1();
    spill1717_0 = __call1717_2(receiver, p0, p1);
    if (!((life5_5 == null))) {
        forwardValue1717_14_0 = spill1717_0;
        break forward_join_14;
    }
    if (!((spill1717_0 > 0))) {
        break forward_join_15;
    }
    forwardValue1717_14_0 = 1;
    }
    forwardValue1717_16_0 = forwardValue1717_14_0;
    break forward_join_16;
    }
    forwardValue1717_16_0 = 0;
    }
    return __integerCategory1717_3(forwardValue1717_16_0);
}
public static void h1717_0(moom.Oo p0) throws Throwable {
    throw __call1171700_0(p0);
}
private static native long __fieldRead1717_0() throws Throwable;
private static native java.lang.String __call1717_1() throws Throwable;
private static native int __call1717_2(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native boolean __integerCategory1717_3(int value) throws Throwable;
private static native java.lang.Throwable __call1171700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_30287ff40bc69b01ab20(net.minecraft.world.World a0, moom.DT a1, boolean a2) throws E;
private static final class __SourceHandler_30287ff40bc69b01ab20 {

public static boolean f1718(net.minecraft.world.World receiver, moom.DT p0, boolean p1) throws Throwable {
    int forwardValue1718_24_0;
    int forwardValue1718_28_0;
    int forwardValue1718_30_0;
    int forwardValue1718_45_0;
    int forwardValue1718_59_0;
    int forwardValue1718_63_0;
    int forwardValue1718_65_0;
    boolean spill1718_0;
    int spill1718_1;
    boolean spill1718_2;
    long life3_3;
    java.lang.String life5_5;
    int life6_42;
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_59: {
    forward_join_45: {
    forward_join_42: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life3_3 = (__fieldRead1718_0() ^ 89940115078332L);
    life5_5 = __call1718_1();
    spill1718_0 = __call1718_3(__call1718_2(), "\n");
    if (!((life5_5 == null))) {
        forwardValue1718_24_0 = __integerCategory1718_4(spill1718_0);
        break forward_join_24;
    }
    if (!(spill1718_0)) {
        break forward_join_15;
    }
    if (!((__call1718_6(__call1718_5()) == null))) {
        break forward_join_29;
    }
    }
    forwardValue1718_24_0 = __numericCompare1718_10((__call1718_7() - __call1718_8()), __invokedynamic1718_9(20382, (4449211098426231653L ^ life3_3)));
    }
    if (!((life5_5 == null))) {
        forwardValue1718_28_0 = forwardValue1718_24_0;
        break forward_join_28;
    }
    if (!((forwardValue1718_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue1718_28_0 = 1;
    }
    forwardValue1718_30_0 = forwardValue1718_28_0;
    break forward_join_30;
    }
    forwardValue1718_30_0 = 0;
    }
    life6_42 = forwardValue1718_30_0;
    spill1718_1 = life6_42;
    if (!((life5_5 == null))) {
        forwardValue1718_45_0 = spill1718_1;
        break forward_join_45;
    }
    if (!((spill1718_1 != 0))) {
        break forward_join_42;
    }
    spill1718_2 = __call1718_11(receiver);
    if (!((life5_5 == null))) {
        forwardValue1718_45_0 = __integerCategory1718_12(spill1718_2);
        break forward_join_45;
    }
    if (!((!spill1718_2))) {
        break forward_join_42;
    }
    return __integerCategory1718_13(0);
    }
    forwardValue1718_45_0 = __integerCategory1718_15(__call1718_14(receiver, p0));
    }
    if (!((life5_5 == null))) {
        forwardValue1718_59_0 = forwardValue1718_45_0;
        break forward_join_59;
    }
    if (!((forwardValue1718_45_0 != 0))) {
        break forward_join_64;
    }
    forwardValue1718_59_0 = __integerCategory1718_19(__call1718_18(receiver, (__call1718_16(p0) >> 4), (__call1718_17(p0) >> 4), p1));
    }
    if (!((life5_5 == null))) {
        forwardValue1718_63_0 = forwardValue1718_59_0;
        break forward_join_63;
    }
    if (!((forwardValue1718_59_0 != 0))) {
        break forward_join_64;
    }
    forwardValue1718_63_0 = 1;
    }
    forwardValue1718_65_0 = forwardValue1718_63_0;
    break forward_join_65;
    }
    forwardValue1718_65_0 = 0;
    }
    return __integerCategory1718_20(forwardValue1718_65_0);
}
public static void h1718_0(moom.Oo p0) throws Throwable {
    throw __call1171800_0(p0);
}
public static void h1718_1(moom.Oo p0) throws Throwable {
    throw __call1171801_0(p0);
}
public static void h1718_2(moom.Oo p0) throws Throwable {
    throw __call1171802_0(p0);
}
public static void h1718_3(moom.Oo p0) throws Throwable {
    throw __call1171803_0(p0);
}
public static void h1718_4(moom.Oo p0) throws Throwable {
    throw __call1171804_0(p0);
}
public static void h1718_5(moom.Oo p0) throws Throwable {
    throw __call1171805_0(p0);
}
public static void h1718_6(moom.Oo p0) throws Throwable {
    throw __call1171806_0(p0);
}
public static void h1718_7(moom.Oo p0) throws Throwable {
    throw __call1171807_0(p0);
}
public static void h1718_8(moom.Oo p0) throws Throwable {
    throw __call1171808_0(p0);
}
public static void h1718_9(moom.Oo p0) throws Throwable {
    throw __call1171809_0(p0);
}
public static void h1718_10(moom.Oo p0) throws Throwable {
    throw __call1171810_0(p0);
}
private static native long __fieldRead1718_0() throws Throwable;
private static native java.lang.String __call1718_1() throws Throwable;
private static native java.lang.String __call1718_2() throws Throwable;
private static native boolean __call1718_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1718_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call1718_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call1718_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native long __call1718_7() throws Throwable;
private static native long __call1718_8() throws Throwable;
private static native long __invokedynamic1718_9(int a0, long a1) throws Throwable;
private static native int __numericCompare1718_10(long a0, long a1) throws Throwable;
private static native boolean __call1718_11(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1718_12(boolean value) throws Throwable;
private static native boolean __integerCategory1718_13(int value) throws Throwable;
private static native boolean __call1718_14(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1718_15(boolean value) throws Throwable;
private static native int __call1718_16(moom.DT a0) throws Throwable;
private static native int __call1718_17(moom.DT a0) throws Throwable;
private static native boolean __call1718_18(net.minecraft.world.World a0, int a1, int a2, boolean a3) throws Throwable;
private static native int __integerCategory1718_19(boolean value) throws Throwable;
private static native boolean __integerCategory1718_20(int value) throws Throwable;
private static native java.lang.Throwable __call1171800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171810_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0a81e7e786d7ca896c70(net.minecraft.world.World a0, net.minecraft.tileentity.TileEntity a1) throws E;
private static final class __SourceHandler_0a81e7e786d7ca896c70 {

public static boolean f1719(net.minecraft.world.World receiver, net.minecraft.tileentity.TileEntity p0) throws Throwable {
    int forwardValue1719_26_0;
    java.lang.String spill1719_0;
    int spill1719_1;
    int spill1719_2;
    long life2_3;
    int life5_9;
    java.lang.String life4_10;
    forward_join_26: {
    forward_join_25: {
    life2_3 = (__fieldRead1719_0() ^ 41595873771635L);
    spill1719_0 = __call1719_1();
    life5_9 = __integerCategory1719_4(__call1719_3(__fieldRead1719_2(receiver), p0));
    life4_10 = spill1719_0;
    spill1719_1 = life5_9;
    if (!((life4_10 == null))) {
        forwardValue1719_26_0 = spill1719_1;
        break forward_join_26;
    }
    if (!((spill1719_1 != 0))) {
        break forward_join_25;
    }
    spill1719_2 = __instanceOf1719_5(p0);
    if (!((life4_10 == null))) {
        forwardValue1719_26_0 = spill1719_2;
        break forward_join_26;
    }
    if (!((spill1719_2 != 0))) {
        break forward_join_25;
    }
    __call1719_7(__fieldRead1719_6(receiver), p0);
    }
    forwardValue1719_26_0 = life5_9;
    }
    return __integerCategory1719_8(forwardValue1719_26_0);
}
public static void h1719_0(moom.Oo p0) throws Throwable {
    throw __call1171900_0(p0);
}
public static void h1719_1(moom.Oo p0) throws Throwable {
    throw __call1171901_0(p0);
}
public static void h1719_2(moom.Oo p0) throws Throwable {
    throw __call1171902_0(p0);
}
public static void h1719_3(moom.Oo p0) throws Throwable {
    throw __call1171903_0(p0);
}
private static native long __fieldRead1719_0() throws Throwable;
private static native java.lang.String __call1719_1() throws Throwable;
private static native java.util.List __fieldRead1719_2(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1719_3(java.util.List a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native int __integerCategory1719_4(boolean value) throws Throwable;
private static native int __instanceOf1719_5(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.util.List __fieldRead1719_6(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1719_7(java.util.List a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native boolean __integerCategory1719_8(int value) throws Throwable;
private static native java.lang.Throwable __call1171900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1171903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_1822409dda5753c3deb1(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws E;
private static final class __SourceHandler_1822409dda5753c3deb1 {

public static boolean f1150(net.minecraft.world.World receiver, net.minecraft.world.EnumSkyBlock p0, moom.DT p1) throws Throwable {
    int forestValue1150_21_0;
    int forestValue1150_66_0;
    int forestValue1150_66_1;
    int forestValue1150_87_0;
    int forestValue1150_87_1;
    int forestValue1150_193_0;
    int forestValue1150_200_0;
    int forestValue1150_458_0;
    int forestValue1150_458_1;
    int forestValue1150_463_0;
    int forestValue1150_463_1;
    int forestValue1150_490_0;
    int forestValue1150_492_0;
    int forestValue1150_507_0;
    int forestValue1150_515_0;
    int forestValue1150_573_0;
    int forestValue1150_573_1;
    int forestValue1150_630_0;
    int forestValue1150_630_1;
    int forestValue1150_687_0;
    int forestValue1150_687_1;
    int forestValue1150_744_0;
    int forestValue1150_744_1;
    int forestValue1150_803_0;
    int forestValue1150_803_1;
    net.minecraft.world.World forestValue1150_805_0;
    int forestValue1150_855_0;
    int forestValue1150_855_1;
    int forestValue1150_953_0;
    int forestValue1150_953_1;
    int forestValue1150_958_0;
    int forestValue1150_958_1;
    int forestValue1150_985_0;
    int forestValue1150_987_0;
    int forestValue1150_1002_0;
    int forestValue1150_1010_0;
    int forestValue1150_1068_0;
    int forestValue1150_1068_1;
    int forestValue1150_1125_0;
    int forestValue1150_1125_1;
    int forestValue1150_1182_0;
    int forestValue1150_1182_1;
    int forestValue1150_1239_0;
    int forestValue1150_1239_1;
    int forestValue1150_1298_0;
    int forestValue1150_1298_1;
    net.minecraft.world.World forestValue1150_1300_0;
    int forestValue1150_1357_0;
    boolean spill1150_0;
    int spill1150_1;
    int spill1150_2;
    int spill1150_3;
    int spill1150_4;
    int spill1150_5;
    int spill1150_6;
    int spill1150_7;
    int spill1150_8;
    int spill1150_9;
    int spill1150_10;
    int spill1150_11;
    net.minecraft.world.World spill1150_12;
    int spill1150_13;
    int spill1150_14;
    int spill1150_15;
    int spill1150_16;
    int spill1150_17;
    net.minecraft.world.World spill1150_18;
    int spill1150_19;
    int spill1150_20;
    long life3_3;
    java.lang.String life5_5;
    int life6_25;
    int life7_27;
    int life8_36;
    int life9_41;
    int life10_44;
    int life11_47;
    int life12_50;
    int life13_107;
    int life14_123;
    int life15_145;
    int life16_167;
    int life17_181;
    moom.DT life18_188;
    int life19_193;
    int life20_224;
    int life21_229;
    int life22_234;
    moom.DU life23_250;
    moom.bs[] life24_252;
    int life25_255;
    int life26_257;
    moom.bs life27_266;
    int life28_271;
    int life29_276;
    int life30_281;
    int life31_295;
    int life19_300;
    int life13_407;
    int life14_423;
    int life15_445;
    int life16_467;
    moom.DT life17_474;
    int life18_479;
    int life19_484;
    int life20_516;
    int life21_521;
    int life22_526;
    int life23_548;
    int life13_955;
    int life14_971;
    int life15_993;
    int life16_1015;
    moom.DT life17_1022;
    int life18_1027;
    int life19_1032;
    int life20_1064;
    int life21_1069;
    int life22_1074;
    int life23_1096;
    forest_join_1357: {
    forest_join_1353: {
    forest_join_855: {
    forest_join_351: {
    forest_join_349: {
    forest_join_66: {
    forest_join_64: {
    forest_join_21: {
    forest_join_20: {
    life3_3 = (__fieldRead1150_0() ^ 116209910013080L);
    life5_5 = __call1150_1();
    spill1150_0 = __call1150_3(receiver, p1, __invokedynamic1150_2(26860, (3500252733958376543L ^ life3_3)), 0);
    if (!((life5_5 == null))) {
        forestValue1150_21_0 = __integerCategory1150_4(spill1150_0);
        break forest_join_21;
    }
    if (!((!spill1150_0))) {
        break forest_join_20;
    }
    return __integerCategory1150_5(0);
    }
    forestValue1150_21_0 = 0;
    }
    life6_25 = forestValue1150_21_0;
    life7_27 = 0;
    __call1150_7(__fieldRead1150_6(receiver), "getBrightness");
    life8_36 = __call1150_8(receiver, p0, p1);
    life9_41 = __call1150_9(receiver, p1, p0);
    life10_44 = __call1150_10(p1);
    life11_47 = __call1150_11(p1);
    life12_50 = __call1150_12(p1);
    spill1150_1 = life9_41;
    spill1150_2 = life8_36;
    if (!((life5_5 == null))) {
        forestValue1150_66_0 = spill1150_1;
        forestValue1150_66_1 = spill1150_2;
        break forest_join_66;
    }
    if (!((spill1150_1 > spill1150_2))) {
        break forest_join_64;
    }
    (__fieldRead1150_13(receiver))[(life7_27++)] = __invokedynamic1150_14(28586, (7558466012602354452L ^ life3_3));
    if (!((life5_5 != null))) {
        break forest_join_351;
    }
    }
    forestValue1150_66_0 = life9_41;
    forestValue1150_66_1 = life8_36;
    }
    if (!((forestValue1150_66_0 < forestValue1150_66_1))) {
        break forest_join_351;
    }
    (__fieldRead1150_15(receiver))[(life7_27++)] = (__invokedynamic1150_16(26869, (537462479633501289L ^ life3_3)) | (life8_36 << __invokedynamic1150_17(28757, (3543964332551230670L ^ life3_3))));
    forest_cycle_85: while (true) {
    forest_join_347: {
    forestValue1150_87_0 = life6_25;
    forestValue1150_87_1 = life7_27;
    forest_cycle_87: while (true) {
    forest_join_200: {
    forest_join_193: {
    if (!((forestValue1150_87_0 < forestValue1150_87_1))) {
        break forest_join_349;
    }
    life13_107 = (__fieldRead1150_18(receiver))[(life6_25++)];
    life14_123 = (((life13_107 & __invokedynamic1150_19(4692, (1748283322826241737L ^ life3_3))) - __invokedynamic1150_20(16623, (8888342752747086912L ^ life3_3))) + life10_44);
    life15_145 = ((((life13_107 >> __invokedynamic1150_21(12592, (2009737792585176472L ^ life3_3))) & __invokedynamic1150_22(12836, (8951796832274323097L ^ life3_3))) - __invokedynamic1150_23(7379, (3547627107620763724L ^ life3_3))) + life11_47);
    life16_167 = ((((life13_107 >> __invokedynamic1150_24(4132, (4766607280715281553L ^ life3_3))) & __invokedynamic1150_25(12836, (8951796832274323097L ^ life3_3))) - __invokedynamic1150_26(7379, (3547627107620763724L ^ life3_3))) + life12_50);
    life17_181 = ((life13_107 >> __invokedynamic1150_27(29169, (429857243215713619L ^ life3_3))) & __invokedynamic1150_28(24438, (2603125413715442626L ^ life3_3)));
    life18_188 = new moom.DT(life14_123, life15_145, life16_167);
    life19_193 = __call1150_29(receiver, p0, life18_188);
    spill1150_3 = life19_193;
    if (!((life5_5 == null))) {
        forestValue1150_193_0 = spill1150_3;
        break forest_join_193;
    }
    spill1150_4 = life17_181;
    if (!((life5_5 == null))) {
        forestValue1150_855_0 = spill1150_3;
        forestValue1150_855_1 = spill1150_4;
        break forest_join_855;
    }
    if (!((spill1150_3 == spill1150_4))) {
        break forest_join_347;
    }
    __call1150_30(receiver, p0, life18_188, 0);
    forestValue1150_193_0 = life17_181;
    }
    if (!((life5_5 == null))) {
        forestValue1150_200_0 = forestValue1150_193_0;
        break forest_join_200;
    }
    if (!((forestValue1150_193_0 > 0))) {
        break forest_join_347;
    }
    forestValue1150_200_0 = __call1150_31((life14_123 - life10_44));
    }
    life20_224 = forestValue1150_200_0;
    life21_229 = __call1150_32((life15_145 - life11_47));
    life22_234 = __call1150_33((life16_167 - life12_50));
    if (!((((life20_224 + life21_229) + life22_234) < __invokedynamic1150_34(21668, (6305439619271815198L ^ life3_3))))) {
        break forest_join_347;
    }
    life23_250 = new moom.DU();
    life24_252 = __call1150_35();
    life25_255 = (life24_252).length;
    life26_257 = 0;
    forest_cycle_233: while (true) {
    forest_join_345: {
    forest_join_344: {
    if (!((life26_257 < life25_255))) {
        break forest_join_347;
    }
    life27_266 = (life24_252)[life26_257];
    life28_271 = (life14_123 + __call1150_36(life27_266));
    life29_276 = (life15_145 + __call1150_37(life27_266));
    life30_281 = (life16_167 + __call1150_38(life27_266));
    __call1150_39(life23_250, life28_271, life29_276, life30_281);
    life31_295 = __call1150_43(1, __call1150_42(__call1150_41(__call1150_40(receiver, life23_250))));
    life19_300 = __call1150_44(receiver, p0, life23_250);
    if (!((life5_5 == null))) {
        break forest_join_345;
    }
    spill1150_5 = life19_300;
    spill1150_6 = (life17_181 - life31_295);
    if (!((life5_5 == null))) {
        forestValue1150_87_0 = spill1150_5;
        forestValue1150_87_1 = spill1150_6;
        continue forest_cycle_87;
    }
    if (!((spill1150_5 == spill1150_6))) {
        break forest_join_344;
    }
    if (!((life7_27 < (__fieldRead1150_45(receiver)).length))) {
        break forest_join_344;
    }
    (__fieldRead1150_46(receiver))[(life7_27++)] = (((((life28_271 - life10_44) + __invokedynamic1150_47(7379, (3547627107620763724L ^ life3_3))) | (((life29_276 - life11_47) + __invokedynamic1150_48(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_49(19672, (1831480530135017588L ^ life3_3)))) | (((life30_281 - life12_50) + __invokedynamic1150_50(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_51(32169, (5070237600583309607L ^ life3_3)))) | ((life17_181 - life31_295) << __invokedynamic1150_52(29169, (429857243215713619L ^ life3_3))));
    }
    life26_257 += 1;
    }
    if (!((life5_5 != null))) {
        continue forest_cycle_233;
    }
    break forest_cycle_233;
    }
    break forest_cycle_87;
    }
    }
    if (!((life5_5 != null))) {
        continue forest_cycle_85;
    }
    break forest_cycle_85;
    }
    }
    life6_25 = 0;
    }
    __call1150_54(__fieldRead1150_53(receiver));
    __call1150_56(__fieldRead1150_55(receiver), "checkedPosition < toCheckCount");
    forest_cycle_358: while (true) {
    forest_join_852: {
    forest_join_805: {
    forest_join_803: {
    forest_join_795: {
    forest_join_744: {
    forest_join_738: {
    forest_join_687: {
    forest_join_681: {
    forest_join_630: {
    forest_join_624: {
    forest_join_573: {
    forest_join_567: {
    forest_join_515: {
    forest_join_507: {
    forest_join_492: {
    forest_join_491: {
    forest_join_490: {
    forest_join_463: {
    forest_join_458: {
    if (!((life6_25 < life7_27))) {
        break forest_join_1353;
    }
    life13_407 = (__fieldRead1150_57(receiver))[(life6_25++)];
    life14_423 = (((life13_407 & __invokedynamic1150_58(12836, (8951796832274323097L ^ life3_3))) - __invokedynamic1150_59(7379, (3547627107620763724L ^ life3_3))) + life10_44);
    life15_445 = ((((life13_407 >> __invokedynamic1150_60(19672, (1831480530135017588L ^ life3_3))) & __invokedynamic1150_61(12836, (8951796832274323097L ^ life3_3))) - __invokedynamic1150_62(7379, (3547627107620763724L ^ life3_3))) + life11_47);
    life16_467 = ((((life13_407 >> __invokedynamic1150_63(32169, (5070237600583309607L ^ life3_3))) & __invokedynamic1150_64(12836, (8951796832274323097L ^ life3_3))) - __invokedynamic1150_65(7379, (3547627107620763724L ^ life3_3))) + life12_50);
    life17_474 = new moom.DT(life14_423, life15_445, life16_467);
    life18_479 = __call1150_66(receiver, p0, life17_474);
    life19_484 = __call1150_67(receiver, life17_474, p0);
    spill1150_7 = life19_484;
    if (!((life5_5 == null))) {
        forestValue1150_1357_0 = spill1150_7;
        break forest_join_1357;
    }
    spill1150_8 = life18_479;
    if (!((life5_5 == null))) {
        forestValue1150_458_0 = spill1150_7;
        forestValue1150_458_1 = spill1150_8;
        break forest_join_458;
    }
    if (!((spill1150_7 != spill1150_8))) {
        break forest_join_852;
    }
    __call1150_68(receiver, p0, life17_474, life19_484);
    forestValue1150_458_0 = life19_484;
    forestValue1150_458_1 = life18_479;
    }
    if (!((life5_5 == null))) {
        forestValue1150_463_0 = forestValue1150_458_0;
        forestValue1150_463_1 = forestValue1150_458_1;
        break forest_join_463;
    }
    if (!((forestValue1150_458_0 > forestValue1150_458_1))) {
        break forest_join_852;
    }
    forestValue1150_463_0 = life14_423;
    forestValue1150_463_1 = life10_44;
    }
    life20_516 = __call1150_69((forestValue1150_463_0 - forestValue1150_463_1));
    life21_521 = __call1150_70((life15_445 - life11_47));
    life22_526 = __call1150_71((life16_467 - life12_50));
    spill1150_9 = life7_27;
    if (!((life5_5 == null))) {
        forestValue1150_490_0 = spill1150_9;
        break forest_join_490;
    }
    if (!((spill1150_9 < ((__fieldRead1150_72(receiver)).length - __invokedynamic1150_73(19672, (1831480530135017588L ^ life3_3)))))) {
        break forest_join_491;
    }
    forestValue1150_490_0 = 1;
    }
    forestValue1150_492_0 = forestValue1150_490_0;
    break forest_join_492;
    }
    forestValue1150_492_0 = 0;
    }
    life23_548 = forestValue1150_492_0;
    spill1150_10 = ((life20_516 + life21_521) + life22_526);
    if (!((life5_5 == null))) {
        forestValue1150_507_0 = spill1150_10;
        break forest_join_507;
    }
    if (!((spill1150_10 < __invokedynamic1150_74(21668, (6305439619271815198L ^ life3_3))))) {
        break forest_join_852;
    }
    forestValue1150_507_0 = life23_548;
    }
    if (!((life5_5 == null))) {
        forestValue1150_515_0 = forestValue1150_507_0;
        break forest_join_515;
    }
    if (!((forestValue1150_507_0 != 0))) {
        break forest_join_852;
    }
    forestValue1150_515_0 = __call1150_76(receiver, p0, __call1150_75(life17_474));
    }
    spill1150_11 = life19_484;
    if (!((life5_5 == null))) {
        forestValue1150_573_0 = forestValue1150_515_0;
        forestValue1150_573_1 = spill1150_11;
        break forest_join_573;
    }
    if (!((forestValue1150_515_0 < spill1150_11))) {
        break forest_join_567;
    }
    (__fieldRead1150_77(receiver))[(life7_27++)] = (((((life14_423 - 1) - life10_44) + __invokedynamic1150_78(7379, (3547627107620763724L ^ life3_3))) + (((life15_445 - life11_47) + __invokedynamic1150_79(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_80(19672, (1831480530135017588L ^ life3_3)))) + (((life16_467 - life12_50) + __invokedynamic1150_81(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_82(32169, (5070237600583309607L ^ life3_3))));
    }
    forestValue1150_573_0 = __call1150_84(receiver, p0, __call1150_83(life17_474));
    forestValue1150_573_1 = life19_484;
    }
    if (!((life5_5 == null))) {
        forestValue1150_630_0 = forestValue1150_573_0;
        forestValue1150_630_1 = forestValue1150_573_1;
        break forest_join_630;
    }
    if (!((forestValue1150_573_0 < forestValue1150_573_1))) {
        break forest_join_624;
    }
    (__fieldRead1150_85(receiver))[(life7_27++)] = (((((life14_423 + 1) - life10_44) + __invokedynamic1150_86(7379, (3547627107620763724L ^ life3_3))) + (((life15_445 - life11_47) + __invokedynamic1150_87(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_88(19672, (1831480530135017588L ^ life3_3)))) + (((life16_467 - life12_50) + __invokedynamic1150_89(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_90(32169, (5070237600583309607L ^ life3_3))));
    }
    forestValue1150_630_0 = __call1150_92(receiver, p0, __call1150_91(life17_474));
    forestValue1150_630_1 = life19_484;
    }
    if (!((life5_5 == null))) {
        forestValue1150_687_0 = forestValue1150_630_0;
        forestValue1150_687_1 = forestValue1150_630_1;
        break forest_join_687;
    }
    if (!((forestValue1150_630_0 < forestValue1150_630_1))) {
        break forest_join_681;
    }
    (__fieldRead1150_93(receiver))[(life7_27++)] = ((((life14_423 - life10_44) + __invokedynamic1150_94(7379, (3547627107620763724L ^ life3_3))) + ((((life15_445 - 1) - life11_47) + __invokedynamic1150_95(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_96(19672, (1831480530135017588L ^ life3_3)))) + (((life16_467 - life12_50) + __invokedynamic1150_97(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_98(32169, (5070237600583309607L ^ life3_3))));
    }
    forestValue1150_687_0 = __call1150_100(receiver, p0, __call1150_99(life17_474));
    forestValue1150_687_1 = life19_484;
    }
    if (!((life5_5 == null))) {
        forestValue1150_744_0 = forestValue1150_687_0;
        forestValue1150_744_1 = forestValue1150_687_1;
        break forest_join_744;
    }
    if (!((forestValue1150_687_0 < forestValue1150_687_1))) {
        break forest_join_738;
    }
    (__fieldRead1150_101(receiver))[(life7_27++)] = ((((life14_423 - life10_44) + __invokedynamic1150_102(7379, (3547627107620763724L ^ life3_3))) + ((((life15_445 + 1) - life11_47) + __invokedynamic1150_103(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_104(19672, (1831480530135017588L ^ life3_3)))) + (((life16_467 - life12_50) + __invokedynamic1150_105(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_106(32169, (5070237600583309607L ^ life3_3))));
    }
    forestValue1150_744_0 = __call1150_108(receiver, p0, __call1150_107(life17_474));
    forestValue1150_744_1 = life19_484;
    }
    if (!((life5_5 == null))) {
        forestValue1150_803_0 = forestValue1150_744_0;
        forestValue1150_803_1 = forestValue1150_744_1;
        break forest_join_803;
    }
    if (!((forestValue1150_744_0 < forestValue1150_744_1))) {
        break forest_join_795;
    }
    (__fieldRead1150_109(receiver))[(life7_27++)] = ((((life14_423 - life10_44) + __invokedynamic1150_110(7379, (3547627107620763724L ^ life3_3))) + (((life15_445 - life11_47) + __invokedynamic1150_111(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_112(19672, (1831480530135017588L ^ life3_3)))) + ((((life16_467 - 1) - life12_50) + __invokedynamic1150_113(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_114(32169, (5070237600583309607L ^ life3_3))));
    }
    spill1150_12 = receiver;
    if (!((life5_5 == null))) {
        forestValue1150_805_0 = spill1150_12;
        break forest_join_805;
    }
    forestValue1150_803_0 = __call1150_116(spill1150_12, p0, __call1150_115(life17_474));
    forestValue1150_803_1 = life19_484;
    }
    if (!((forestValue1150_803_0 < forestValue1150_803_1))) {
        break forest_join_852;
    }
    forestValue1150_805_0 = receiver;
    }
    (__fieldRead1150_117(forestValue1150_805_0))[(life7_27++)] = ((((life14_423 - life10_44) + __invokedynamic1150_118(7379, (3547627107620763724L ^ life3_3))) + (((life15_445 - life11_47) + __invokedynamic1150_119(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_120(19672, (1831480530135017588L ^ life3_3)))) + ((((life16_467 + 1) - life12_50) + __invokedynamic1150_121(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_122(32169, (5070237600583309607L ^ life3_3))));
    }
    if (!((life5_5 != null))) {
        continue forest_cycle_358;
    }
    break forest_cycle_358;
    }
    break forest_join_1353;
    }
    forest_cycle_855: while (true) {
    forest_join_1350: {
    forest_join_1347: {
    forest_join_1300: {
    forest_join_1298: {
    forest_join_1290: {
    forest_join_1239: {
    forest_join_1233: {
    forest_join_1182: {
    forest_join_1176: {
    forest_join_1125: {
    forest_join_1119: {
    forest_join_1068: {
    forest_join_1062: {
    forest_join_1010: {
    forest_join_1002: {
    forest_join_987: {
    forest_join_986: {
    forest_join_985: {
    forest_join_958: {
    forest_join_953: {
    if (!((forestValue1150_855_0 < forestValue1150_855_1))) {
        break forest_join_1353;
    }
    life13_955 = (__fieldRead1150_123(receiver))[(life6_25++)];
    life14_971 = (((life13_955 & __invokedynamic1150_124(12836, (8951796832274323097L ^ life3_3))) - __invokedynamic1150_125(7379, (3547627107620763724L ^ life3_3))) + life10_44);
    life15_993 = ((((life13_955 >> __invokedynamic1150_126(19672, (1831480530135017588L ^ life3_3))) & __invokedynamic1150_127(12836, (8951796832274323097L ^ life3_3))) - __invokedynamic1150_128(7379, (3547627107620763724L ^ life3_3))) + life11_47);
    life16_1015 = ((((life13_955 >> __invokedynamic1150_129(32169, (5070237600583309607L ^ life3_3))) & __invokedynamic1150_130(12836, (8951796832274323097L ^ life3_3))) - __invokedynamic1150_131(7379, (3547627107620763724L ^ life3_3))) + life12_50);
    life17_1022 = new moom.DT(life14_971, life15_993, life16_1015);
    life18_1027 = __call1150_132(receiver, p0, life17_1022);
    life19_1032 = __call1150_133(receiver, life17_1022, p0);
    spill1150_13 = life19_1032;
    if (!((life5_5 == null))) {
        forestValue1150_1357_0 = spill1150_13;
        break forest_join_1357;
    }
    spill1150_14 = life18_1027;
    if (!((life5_5 == null))) {
        forestValue1150_953_0 = spill1150_13;
        forestValue1150_953_1 = spill1150_14;
        break forest_join_953;
    }
    if (!((spill1150_13 != spill1150_14))) {
        break forest_join_1347;
    }
    __call1150_134(receiver, p0, life17_1022, life19_1032);
    forestValue1150_953_0 = life19_1032;
    forestValue1150_953_1 = life18_1027;
    }
    if (!((life5_5 == null))) {
        forestValue1150_958_0 = forestValue1150_953_0;
        forestValue1150_958_1 = forestValue1150_953_1;
        break forest_join_958;
    }
    if (!((forestValue1150_953_0 > forestValue1150_953_1))) {
        break forest_join_1347;
    }
    forestValue1150_958_0 = life14_971;
    forestValue1150_958_1 = life10_44;
    }
    life20_1064 = __call1150_135((forestValue1150_958_0 - forestValue1150_958_1));
    life21_1069 = __call1150_136((life15_993 - life11_47));
    life22_1074 = __call1150_137((life16_1015 - life12_50));
    spill1150_15 = life7_27;
    if (!((life5_5 == null))) {
        forestValue1150_985_0 = spill1150_15;
        break forest_join_985;
    }
    if (!((spill1150_15 < ((__fieldRead1150_138(receiver)).length - __invokedynamic1150_139(19672, (1831480530135017588L ^ life3_3)))))) {
        break forest_join_986;
    }
    forestValue1150_985_0 = 1;
    }
    forestValue1150_987_0 = forestValue1150_985_0;
    break forest_join_987;
    }
    forestValue1150_987_0 = 0;
    }
    life23_1096 = forestValue1150_987_0;
    spill1150_16 = ((life20_1064 + life21_1069) + life22_1074);
    if (!((life5_5 == null))) {
        forestValue1150_1002_0 = spill1150_16;
        break forest_join_1002;
    }
    if (!((spill1150_16 < __invokedynamic1150_140(21668, (6305439619271815198L ^ life3_3))))) {
        break forest_join_1347;
    }
    forestValue1150_1002_0 = life23_1096;
    }
    if (!((life5_5 == null))) {
        forestValue1150_1010_0 = forestValue1150_1002_0;
        break forest_join_1010;
    }
    if (!((forestValue1150_1002_0 != 0))) {
        break forest_join_1347;
    }
    forestValue1150_1010_0 = __call1150_142(receiver, p0, __call1150_141(life17_1022));
    }
    spill1150_17 = life19_1032;
    if (!((life5_5 == null))) {
        forestValue1150_1068_0 = forestValue1150_1010_0;
        forestValue1150_1068_1 = spill1150_17;
        break forest_join_1068;
    }
    if (!((forestValue1150_1010_0 < spill1150_17))) {
        break forest_join_1062;
    }
    (__fieldRead1150_143(receiver))[(life7_27++)] = (((((life14_971 - 1) - life10_44) + __invokedynamic1150_144(7379, (3547627107620763724L ^ life3_3))) + (((life15_993 - life11_47) + __invokedynamic1150_145(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_146(19672, (1831480530135017588L ^ life3_3)))) + (((life16_1015 - life12_50) + __invokedynamic1150_147(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_148(32169, (5070237600583309607L ^ life3_3))));
    }
    forestValue1150_1068_0 = __call1150_150(receiver, p0, __call1150_149(life17_1022));
    forestValue1150_1068_1 = life19_1032;
    }
    if (!((life5_5 == null))) {
        forestValue1150_1125_0 = forestValue1150_1068_0;
        forestValue1150_1125_1 = forestValue1150_1068_1;
        break forest_join_1125;
    }
    if (!((forestValue1150_1068_0 < forestValue1150_1068_1))) {
        break forest_join_1119;
    }
    (__fieldRead1150_151(receiver))[(life7_27++)] = (((((life14_971 + 1) - life10_44) + __invokedynamic1150_152(7379, (3547627107620763724L ^ life3_3))) + (((life15_993 - life11_47) + __invokedynamic1150_153(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_154(19672, (1831480530135017588L ^ life3_3)))) + (((life16_1015 - life12_50) + __invokedynamic1150_155(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_156(32169, (5070237600583309607L ^ life3_3))));
    }
    forestValue1150_1125_0 = __call1150_158(receiver, p0, __call1150_157(life17_1022));
    forestValue1150_1125_1 = life19_1032;
    }
    if (!((life5_5 == null))) {
        forestValue1150_1182_0 = forestValue1150_1125_0;
        forestValue1150_1182_1 = forestValue1150_1125_1;
        break forest_join_1182;
    }
    if (!((forestValue1150_1125_0 < forestValue1150_1125_1))) {
        break forest_join_1176;
    }
    (__fieldRead1150_159(receiver))[(life7_27++)] = ((((life14_971 - life10_44) + __invokedynamic1150_160(7379, (3547627107620763724L ^ life3_3))) + ((((life15_993 - 1) - life11_47) + __invokedynamic1150_161(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_162(19672, (1831480530135017588L ^ life3_3)))) + (((life16_1015 - life12_50) + __invokedynamic1150_163(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_164(32169, (5070237600583309607L ^ life3_3))));
    }
    forestValue1150_1182_0 = __call1150_166(receiver, p0, __call1150_165(life17_1022));
    forestValue1150_1182_1 = life19_1032;
    }
    if (!((life5_5 == null))) {
        forestValue1150_1239_0 = forestValue1150_1182_0;
        forestValue1150_1239_1 = forestValue1150_1182_1;
        break forest_join_1239;
    }
    if (!((forestValue1150_1182_0 < forestValue1150_1182_1))) {
        break forest_join_1233;
    }
    (__fieldRead1150_167(receiver))[(life7_27++)] = ((((life14_971 - life10_44) + __invokedynamic1150_168(7379, (3547627107620763724L ^ life3_3))) + ((((life15_993 + 1) - life11_47) + __invokedynamic1150_169(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_170(19672, (1831480530135017588L ^ life3_3)))) + (((life16_1015 - life12_50) + __invokedynamic1150_171(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_172(32169, (5070237600583309607L ^ life3_3))));
    }
    forestValue1150_1239_0 = __call1150_174(receiver, p0, __call1150_173(life17_1022));
    forestValue1150_1239_1 = life19_1032;
    }
    if (!((life5_5 == null))) {
        forestValue1150_1298_0 = forestValue1150_1239_0;
        forestValue1150_1298_1 = forestValue1150_1239_1;
        break forest_join_1298;
    }
    if (!((forestValue1150_1239_0 < forestValue1150_1239_1))) {
        break forest_join_1290;
    }
    (__fieldRead1150_175(receiver))[(life7_27++)] = ((((life14_971 - life10_44) + __invokedynamic1150_176(7379, (3547627107620763724L ^ life3_3))) + (((life15_993 - life11_47) + __invokedynamic1150_177(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_178(19672, (1831480530135017588L ^ life3_3)))) + ((((life16_1015 - 1) - life12_50) + __invokedynamic1150_179(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_180(32169, (5070237600583309607L ^ life3_3))));
    }
    spill1150_18 = receiver;
    if (!((life5_5 == null))) {
        forestValue1150_1300_0 = spill1150_18;
        break forest_join_1300;
    }
    forestValue1150_1298_0 = __call1150_182(spill1150_18, p0, __call1150_181(life17_1022));
    forestValue1150_1298_1 = life19_1032;
    }
    if (!((forestValue1150_1298_0 < forestValue1150_1298_1))) {
        break forest_join_1347;
    }
    forestValue1150_1300_0 = receiver;
    }
    (__fieldRead1150_183(forestValue1150_1300_0))[(life7_27++)] = ((((life14_971 - life10_44) + __invokedynamic1150_184(7379, (3547627107620763724L ^ life3_3))) + (((life15_993 - life11_47) + __invokedynamic1150_185(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_186(19672, (1831480530135017588L ^ life3_3)))) + ((((life16_1015 + 1) - life12_50) + __invokedynamic1150_187(7379, (3547627107620763724L ^ life3_3))) << __invokedynamic1150_188(32169, (5070237600583309607L ^ life3_3))));
    }
    if (!((life5_5 != null))) {
        break forest_join_1350;
    }
    break forest_join_1353;
    }
    spill1150_19 = life6_25;
    spill1150_20 = life7_27;
    forestValue1150_855_0 = spill1150_19;
    forestValue1150_855_1 = spill1150_20;
    continue forest_cycle_855;
    }
    }
    __call1150_190(__fieldRead1150_189(receiver));
    forestValue1150_1357_0 = 1;
    }
    return __integerCategory1150_191(forestValue1150_1357_0);
}
public static boolean h1150_0(moom.Oo p0) throws Throwable {
    throw __call3115000_0(p0);
}
public static boolean h1150_1(moom.Oo p0) throws Throwable {
    throw __call3115001_0(p0);
}
public static boolean h1150_2(moom.Oo p0) throws Throwable {
    throw __call3115002_0(p0);
}
public static boolean h1150_3(moom.Oo p0) throws Throwable {
    throw __call3115003_0(p0);
}
public static boolean h1150_4(moom.Oo p0) throws Throwable {
    throw __call3115004_0(p0);
}
public static boolean h1150_5(moom.Oo p0) throws Throwable {
    throw __call3115005_0(p0);
}
public static boolean h1150_6(moom.Oo p0) throws Throwable {
    throw __call3115006_0(p0);
}
public static boolean h1150_7(moom.Oo p0) throws Throwable {
    throw __call3115007_0(p0);
}
public static boolean h1150_8(moom.Oo p0) throws Throwable {
    throw __call3115008_0(p0);
}
public static boolean h1150_9(moom.Oo p0) throws Throwable {
    throw __call3115009_0(p0);
}
public static boolean h1150_10(moom.Oo p0) throws Throwable {
    throw __call3115010_0(p0);
}
public static boolean h1150_11(moom.Oo p0) throws Throwable {
    throw __call3115011_0(p0);
}
public static boolean h1150_12(moom.Oo p0) throws Throwable {
    throw __call3115012_0(p0);
}
public static boolean h1150_13(moom.Oo p0) throws Throwable {
    throw __call3115013_0(p0);
}
public static boolean h1150_14(moom.Oo p0) throws Throwable {
    throw __call3115014_0(p0);
}
public static boolean h1150_15(moom.Oo p0) throws Throwable {
    throw __call3115015_0(p0);
}
public static boolean h1150_16(moom.Oo p0) throws Throwable {
    throw __call3115016_0(p0);
}
public static boolean h1150_17(moom.Oo p0) throws Throwable {
    throw __call3115017_0(p0);
}
public static boolean h1150_18(moom.Oo p0) throws Throwable {
    throw __call3115018_0(p0);
}
public static boolean h1150_19(moom.Oo p0) throws Throwable {
    throw __call3115019_0(p0);
}
public static boolean h1150_20(moom.Oo p0) throws Throwable {
    throw __call3115020_0(p0);
}
public static boolean h1150_21(moom.Oo p0) throws Throwable {
    throw __call3115021_0(p0);
}
public static boolean h1150_22(moom.Oo p0) throws Throwable {
    throw __call3115022_0(p0);
}
public static boolean h1150_23(moom.Oo p0) throws Throwable {
    throw __call3115023_0(p0);
}
public static boolean h1150_24(moom.Oo p0) throws Throwable {
    throw __call3115024_0(p0);
}
public static boolean h1150_25(moom.Oo p0) throws Throwable {
    throw __call3115025_0(p0);
}
public static boolean h1150_26(moom.Oo p0) throws Throwable {
    throw __call3115026_0(p0);
}
public static boolean h1150_27(moom.Oo p0) throws Throwable {
    throw __call3115027_0(p0);
}
public static boolean h1150_28(moom.Oo p0) throws Throwable {
    throw __call3115028_0(p0);
}
public static boolean h1150_29(moom.Oo p0) throws Throwable {
    throw __call3115029_0(p0);
}
public static boolean h1150_30(moom.Oo p0) throws Throwable {
    throw __call3115030_0(p0);
}
public static boolean h1150_31(moom.Oo p0) throws Throwable {
    throw __call3115031_0(p0);
}
public static boolean h1150_32(moom.Oo p0) throws Throwable {
    throw __call3115032_0(p0);
}
public static boolean h1150_33(moom.Oo p0) throws Throwable {
    throw __call3115033_0(p0);
}
public static boolean h1150_34(moom.Oo p0) throws Throwable {
    throw __call3115034_0(p0);
}
public static boolean h1150_35(moom.Oo p0) throws Throwable {
    throw __call3115035_0(p0);
}
private static native long __fieldRead1150_0() throws Throwable;
private static native java.lang.String __call1150_1() throws Throwable;
private static native int __invokedynamic1150_2(int a0, long a1) throws Throwable;
private static native boolean __call1150_3(net.minecraft.world.World a0, moom.DT a1, int a2, int a3) throws Throwable;
private static native int __integerCategory1150_4(boolean value) throws Throwable;
private static native boolean __integerCategory1150_5(int value) throws Throwable;
private static native moom.A9 __fieldRead1150_6(net.minecraft.world.World a0) throws Throwable;
private static native void __call1150_7(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __call1150_8(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int __call1150_9(net.minecraft.world.World a0, moom.DT a1, net.minecraft.world.EnumSkyBlock a2) throws Throwable;
private static native int __call1150_10(moom.DT a0) throws Throwable;
private static native int __call1150_11(moom.DT a0) throws Throwable;
private static native int __call1150_12(moom.DT a0) throws Throwable;
private static native int[] __fieldRead1150_13(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_14(int a0, long a1) throws Throwable;
private static native int[] __fieldRead1150_15(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_17(int a0, long a1) throws Throwable;
private static native int[] __fieldRead1150_18(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_26(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_27(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_28(int a0, long a1) throws Throwable;
private static native int __call1150_29(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native void __call1150_30(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2, int a3) throws Throwable;
private static native int __call1150_31(int a0) throws Throwable;
private static native int __call1150_32(int a0) throws Throwable;
private static native int __call1150_33(int a0) throws Throwable;
private static native int __invokedynamic1150_34(int a0, long a1) throws Throwable;
private static native moom.bs[] __call1150_35() throws Throwable;
private static native int __call1150_36(moom.bs a0) throws Throwable;
private static native int __call1150_37(moom.bs a0) throws Throwable;
private static native int __call1150_38(moom.bs a0) throws Throwable;
private static native moom.DU __call1150_39(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1150_40(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native net.minecraft.block.Block __call1150_41(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call1150_42(net.minecraft.block.Block a0) throws Throwable;
private static native int __call1150_43(int a0, int a1) throws Throwable;
private static native int __call1150_44(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DU a2) throws Throwable;
private static native int[] __fieldRead1150_45(net.minecraft.world.World a0) throws Throwable;
private static native int[] __fieldRead1150_46(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_52(int a0, long a1) throws Throwable;
private static native moom.A9 __fieldRead1150_53(net.minecraft.world.World a0) throws Throwable;
private static native void __call1150_54(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead1150_55(net.minecraft.world.World a0) throws Throwable;
private static native void __call1150_56(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int[] __fieldRead1150_57(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_58(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_59(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_60(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_61(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_62(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_63(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_64(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_65(int a0, long a1) throws Throwable;
private static native int __call1150_66(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int __call1150_67(net.minecraft.world.World a0, moom.DT a1, net.minecraft.world.EnumSkyBlock a2) throws Throwable;
private static native void __call1150_68(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2, int a3) throws Throwable;
private static native int __call1150_69(int a0) throws Throwable;
private static native int __call1150_70(int a0) throws Throwable;
private static native int __call1150_71(int a0) throws Throwable;
private static native int[] __fieldRead1150_72(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_73(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_74(int a0, long a1) throws Throwable;
private static native moom.DT __call1150_75(moom.DT a0) throws Throwable;
private static native int __call1150_76(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int[] __fieldRead1150_77(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_78(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_79(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_80(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_81(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_82(int a0, long a1) throws Throwable;
private static native moom.DT __call1150_83(moom.DT a0) throws Throwable;
private static native int __call1150_84(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int[] __fieldRead1150_85(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_86(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_87(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_88(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_89(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_90(int a0, long a1) throws Throwable;
private static native moom.DT __call1150_91(moom.DT a0) throws Throwable;
private static native int __call1150_92(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int[] __fieldRead1150_93(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_94(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_95(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_96(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_97(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_98(int a0, long a1) throws Throwable;
private static native moom.DT __call1150_99(moom.DT a0) throws Throwable;
private static native int __call1150_100(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int[] __fieldRead1150_101(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_102(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_103(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_104(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_105(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_106(int a0, long a1) throws Throwable;
private static native moom.DT __call1150_107(moom.DT a0) throws Throwable;
private static native int __call1150_108(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int[] __fieldRead1150_109(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_110(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_111(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_112(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_113(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_114(int a0, long a1) throws Throwable;
private static native moom.DT __call1150_115(moom.DT a0) throws Throwable;
private static native int __call1150_116(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int[] __fieldRead1150_117(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_118(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_119(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_120(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_121(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_122(int a0, long a1) throws Throwable;
private static native int[] __fieldRead1150_123(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_124(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_125(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_126(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_127(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_128(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_129(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_130(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_131(int a0, long a1) throws Throwable;
private static native int __call1150_132(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int __call1150_133(net.minecraft.world.World a0, moom.DT a1, net.minecraft.world.EnumSkyBlock a2) throws Throwable;
private static native void __call1150_134(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2, int a3) throws Throwable;
private static native int __call1150_135(int a0) throws Throwable;
private static native int __call1150_136(int a0) throws Throwable;
private static native int __call1150_137(int a0) throws Throwable;
private static native int[] __fieldRead1150_138(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_139(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_140(int a0, long a1) throws Throwable;
private static native moom.DT __call1150_141(moom.DT a0) throws Throwable;
private static native int __call1150_142(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int[] __fieldRead1150_143(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_144(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_145(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_146(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_147(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_148(int a0, long a1) throws Throwable;
private static native moom.DT __call1150_149(moom.DT a0) throws Throwable;
private static native int __call1150_150(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int[] __fieldRead1150_151(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_152(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_153(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_154(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_155(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_156(int a0, long a1) throws Throwable;
private static native moom.DT __call1150_157(moom.DT a0) throws Throwable;
private static native int __call1150_158(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int[] __fieldRead1150_159(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_160(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_161(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_162(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_163(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_164(int a0, long a1) throws Throwable;
private static native moom.DT __call1150_165(moom.DT a0) throws Throwable;
private static native int __call1150_166(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int[] __fieldRead1150_167(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_168(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_169(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_170(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_171(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_172(int a0, long a1) throws Throwable;
private static native moom.DT __call1150_173(moom.DT a0) throws Throwable;
private static native int __call1150_174(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int[] __fieldRead1150_175(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_176(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_177(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_178(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_179(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_180(int a0, long a1) throws Throwable;
private static native moom.DT __call1150_181(moom.DT a0) throws Throwable;
private static native int __call1150_182(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int[] __fieldRead1150_183(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1150_184(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_185(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_186(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_187(int a0, long a1) throws Throwable;
private static native int __invokedynamic1150_188(int a0, long a1) throws Throwable;
private static native moom.A9 __fieldRead1150_189(net.minecraft.world.World a0) throws Throwable;
private static native void __call1150_190(moom.A9 a0) throws Throwable;
private static native boolean __integerCategory1150_191(int value) throws Throwable;
private static native java.lang.Throwable __call3115000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115018_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115019_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115020_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115021_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115022_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115023_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115024_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115025_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115026_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115027_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115028_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115029_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115030_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115031_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115032_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115033_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115034_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115035_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.Calendar __sourceHandlerCall_4377ac7f3742bb72a7c1(net.minecraft.world.World a0) throws E;
private static final class __SourceHandler_4377ac7f3742bb72a7c1 {

public static java.util.Calendar f1721(net.minecraft.world.World receiver) throws Throwable {
    net.minecraft.world.World forwardValue1721_24_0;
    net.minecraft.world.World spill1721_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead1721_0() ^ 32685237707855L);
    life3_5 = __call1721_1();
    spill1721_0 = receiver;
    if (!((life3_5 == null))) {
        forwardValue1721_24_0 = spill1721_0;
        break forward_join_24;
    }
    if (!((__numericCompare1721_4((__call1721_2(spill1721_0) % __invokedynamic1721_3(22656, (2886591415762535554L ^ life1_3))), 0L) == 0))) {
        break forward_join_23;
    }
    __call1721_7(__fieldRead1721_5(receiver), __call1721_6());
    }
    forwardValue1721_24_0 = receiver;
    }
    return __fieldRead1721_8(forwardValue1721_24_0);
}
public static void h1721_0(moom.Oo p0) throws Throwable {
    throw __call1172100_0(p0);
}
public static void h1721_1(moom.Oo p0) throws Throwable {
    throw __call1172101_0(p0);
}
private static native long __fieldRead1721_0() throws Throwable;
private static native java.lang.String __call1721_1() throws Throwable;
private static native long __call1721_2(net.minecraft.world.World a0) throws Throwable;
private static native long __invokedynamic1721_3(int a0, long a1) throws Throwable;
private static native int __numericCompare1721_4(long a0, long a1) throws Throwable;
private static native java.util.Calendar __fieldRead1721_5(net.minecraft.world.World a0) throws Throwable;
private static native long __call1721_6() throws Throwable;
private static native void __call1721_7(java.util.Calendar a0, long a1) throws Throwable;
private static native java.util.Calendar __fieldRead1721_8(net.minecraft.world.World a0) throws Throwable;
private static native java.lang.Throwable __call1172100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_939640022cb6898de827(net.minecraft.world.World a0, float a1) throws E;
private static final class __SourceHandler_939640022cb6898de827 {

public static moom.DR f1722(net.minecraft.world.World receiver, float p0) throws Throwable {
    float forwardValue1722_174_0;
    float forwardValue1722_174_1;
    float forwardValue1722_198_0;
    float forwardValue1722_198_1;
    java.lang.String spill1722_0;
    float spill1722_1;
    float spill1722_2;
    float spill1722_3;
    float spill1722_4;
    long life2_3;
    float life5_8;
    java.lang.String life4_9;
    float life6_20;
    float life6_25;
    float life7_49;
    float life8_73;
    float life9_91;
    float life10_95;
    float life11_118;
    float life12_124;
    float life9_178;
    float life11_182;
    float life12_208;
    float life13_214;
    forward_join_236: {
    forward_join_198: {
    forward_join_174: {
    forward_join_152: {
    life2_3 = (__fieldRead1722_0() ^ 46483853607815L);
    spill1722_0 = __call1722_1();
    life5_8 = __call1722_2(receiver, p0);
    life4_9 = spill1722_0;
    life6_20 = ((__call1722_3(((life5_8 * 0x1.921fb6p1f) * 0x1.0p1f)) * 0x1.0p1f) + 0x1.0p-1f);
    life6_25 = __call1722_4(life6_20, 0x0.0p0f, 0x1.0p0f);
    __call1722_5(receiver);
    life7_49 = (((float) ((__invokedynamic1722_6(13691, (2368865556054511285L ^ life2_3)) >> __invokedynamic1722_7(4563, (7598572362149227083L ^ life2_3))) & __invokedynamic1722_8(4022, (1112183476182561917L ^ life2_3)))) / 0x1.fep7f);
    __call1722_9(receiver);
    life8_73 = (((float) ((__invokedynamic1722_10(13691, (2368865556054511285L ^ life2_3)) >> __invokedynamic1722_11(1789, (3648019382450355558L ^ life2_3))) & __invokedynamic1722_12(3783, (4059673189455213834L ^ life2_3)))) / 0x1.fep7f);
    __call1722_13(receiver);
    life9_91 = (((float) (__invokedynamic1722_14(13691, (2368865556054511285L ^ life2_3)) & __invokedynamic1722_15(3783, (4059673189455213834L ^ life2_3)))) / 0x1.fep7f);
    life10_95 = __call1722_16(receiver, p0);
    spill1722_1 = life10_95;
    spill1722_2 = 0x0.0p0f;
    if (!((life4_9 == null))) {
        forwardValue1722_174_0 = spill1722_1;
        forwardValue1722_174_1 = spill1722_2;
        break forward_join_174;
    }
    if (!((__numericCompare1722_17(spill1722_1, spill1722_2) > 0))) {
        break forward_join_152;
    }
    life11_118 = ((((life7_49 * 0x1.333334p-2f) + (life8_73 * 0x1.2e147ap-1f)) + (life9_91 * 0x1.c28f5cp-4f)) * 0x1.333334p-1f);
    life12_124 = (0x1.0p0f - (life10_95 * 0x1.e66666p-1f));
    life7_49 = ((life7_49 * life12_124) + (life11_118 * (0x1.0p0f - life12_124)));
    life8_73 = ((life8_73 * life12_124) + (life11_118 * (0x1.0p0f - life12_124)));
    life9_91 = ((life9_91 * life12_124) + (life11_118 * (0x1.0p0f - life12_124)));
    }
    life7_49 = (life7_49 * ((life6_25 * 0x1.ccccccp-1f) + 0x1.99999ap-4f));
    life8_73 = (life8_73 * ((life6_25 * 0x1.ccccccp-1f) + 0x1.99999ap-4f));
    forwardValue1722_174_0 = life9_91;
    forwardValue1722_174_1 = ((life6_25 * 0x1.b33334p-1f) + 0x1.333334p-3f);
    }
    life9_178 = (forwardValue1722_174_0 * forwardValue1722_174_1);
    life11_182 = __call1722_18(receiver, p0);
    spill1722_3 = life11_182;
    spill1722_4 = 0x0.0p0f;
    if (!((life4_9 == null))) {
        forwardValue1722_198_0 = spill1722_3;
        forwardValue1722_198_1 = spill1722_4;
        break forward_join_198;
    }
    if (!((__numericCompare1722_19(spill1722_3, spill1722_4) > 0))) {
        break forward_join_236;
    }
    forwardValue1722_198_0 = (((life7_49 * 0x1.333334p-2f) + (life8_73 * 0x1.2e147ap-1f)) + (life9_178 * 0x1.c28f5cp-4f));
    forwardValue1722_198_1 = 0x1.99999ap-3f;
    }
    life12_208 = (forwardValue1722_198_0 * forwardValue1722_198_1);
    life13_214 = (0x1.0p0f - (life11_182 * 0x1.e66666p-1f));
    life7_49 = ((life7_49 * life13_214) + (life12_208 * (0x1.0p0f - life13_214)));
    life8_73 = ((life8_73 * life13_214) + (life12_208 * (0x1.0p0f - life13_214)));
    life9_178 = ((life9_178 * life13_214) + (life12_208 * (0x1.0p0f - life13_214)));
    }
    return new moom.DR(((double) life7_49), ((double) life8_73), ((double) life9_178));
}
public static void h1722_0(moom.Oo p0) throws Throwable {
    throw __call1172200_0(p0);
}
public static void h1722_1(moom.Oo p0) throws Throwable {
    throw __call1172201_0(p0);
}
public static void h1722_2(moom.Oo p0) throws Throwable {
    throw __call1172202_0(p0);
}
private static native long __fieldRead1722_0() throws Throwable;
private static native java.lang.String __call1722_1() throws Throwable;
private static native float __call1722_2(net.minecraft.world.World a0, float a1) throws Throwable;
private static native float __call1722_3(float a0) throws Throwable;
private static native float __call1722_4(float a0, float a1, float a2) throws Throwable;
private static native java.lang.Object __call1722_5(net.minecraft.world.World a0) throws Throwable;
private static native long __invokedynamic1722_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic1722_7(int a0, long a1) throws Throwable;
private static native long __invokedynamic1722_8(int a0, long a1) throws Throwable;
private static native java.lang.Object __call1722_9(net.minecraft.world.World a0) throws Throwable;
private static native long __invokedynamic1722_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic1722_11(int a0, long a1) throws Throwable;
private static native long __invokedynamic1722_12(int a0, long a1) throws Throwable;
private static native java.lang.Object __call1722_13(net.minecraft.world.World a0) throws Throwable;
private static native long __invokedynamic1722_14(int a0, long a1) throws Throwable;
private static native long __invokedynamic1722_15(int a0, long a1) throws Throwable;
private static native float __call1722_16(net.minecraft.world.World a0, float a1) throws Throwable;
private static native int __numericCompare1722_17(float a0, float a1) throws Throwable;
private static native float __call1722_18(net.minecraft.world.World a0, float a1) throws Throwable;
private static native int __numericCompare1722_19(float a0, float a1) throws Throwable;
private static native java.lang.Throwable __call1172200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172202_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DT __sourceHandlerCall_40e566c7fb3c45fae860(net.minecraft.world.World a0) throws E;
private static final class __SourceHandler_40e566c7fb3c45fae860 {

public static moom.DT f1723(net.minecraft.world.World receiver) throws Throwable {
    net.minecraft.world.World forwardValue1723_27_0;
    java.lang.String spill1723_0;
    net.minecraft.world.World spill1723_1;
    long life1_3;
    moom.DT life4_17;
    java.lang.String life3_18;
    forward_join_39: {
    forward_join_27: {
    life1_3 = (__fieldRead1723_0() ^ 88584711843891L);
    spill1723_0 = __call1723_1();
    life4_17 = new moom.DT(__call1723_3(__fieldRead1723_2(receiver)), __call1723_5(__fieldRead1723_4(receiver)), __call1723_7(__fieldRead1723_6(receiver)));
    life3_18 = spill1723_0;
    spill1723_1 = receiver;
    if (!((life3_18 == null))) {
        forwardValue1723_27_0 = spill1723_1;
        break forward_join_27;
    }
    if (!((!__call1723_9(__call1723_8(spill1723_1), life4_17)))) {
        break forward_join_39;
    }
    forwardValue1723_27_0 = receiver;
    }
    life4_17 = __call1723_14(forwardValue1723_27_0, new moom.DT(__call1723_11(__call1723_10(receiver)), 0x0.0p0d, __call1723_13(__call1723_12(receiver))));
    }
    return life4_17;
}
public static void h1723_0(moom.Oo p0) throws Throwable {
    throw __call1172300_0(p0);
}
public static void h1723_1(moom.Oo p0) throws Throwable {
    throw __call1172301_0(p0);
}
private static native long __fieldRead1723_0() throws Throwable;
private static native java.lang.String __call1723_1() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1723_2(net.minecraft.world.World a0) throws Throwable;
private static native int __call1723_3(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1723_4(net.minecraft.world.World a0) throws Throwable;
private static native int __call1723_5(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1723_6(net.minecraft.world.World a0) throws Throwable;
private static native int __call1723_7(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1723_8(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1723_9(net.minecraft.world.border.WorldBorder a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1723_10(net.minecraft.world.World a0) throws Throwable;
private static native double __call1723_11(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1723_12(net.minecraft.world.World a0) throws Throwable;
private static native double __call1723_13(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.DT __call1723_14(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native java.lang.Throwable __call1172300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DT __sourceHandlerCall_fe15c1751c83c6e3c0ab(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_fe15c1751c83c6e3c0ab {

public static moom.DT f1724(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    int forwardValue1724_91_0;
    int forwardValue1724_97_0;
    int forwardValue1724_97_1;
    int spill1724_0;
    int spill1724_1;
    int spill1724_2;
    int spill1724_3;
    int spill1724_4;
    int spill1724_5;
    int spill1724_6;
    int spill1724_7;
    boolean spill1724_8;
    long life2_3;
    java.lang.String life4_5;
    int life5_114;
    forward_join_99: {
    forward_join_97: {
    forward_join_94: {
    forward_join_91: {
    forward_join_90: {
    life2_3 = (__fieldRead1724_0() ^ 72001953014530L);
    life4_5 = __call1724_1();
    spill1724_0 = __call1724_2(p0);
    spill1724_1 = __invokedynamic1724_3(20188, (2672979080370525637L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue1724_97_0 = spill1724_0;
        forwardValue1724_97_1 = spill1724_1;
        break forward_join_97;
    }
    if (!((spill1724_0 >= spill1724_1))) {
        break forward_join_94;
    }
    spill1724_2 = __call1724_4(p0);
    spill1724_3 = __invokedynamic1724_5(20188, (2672979080370525637L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue1724_97_0 = spill1724_2;
        forwardValue1724_97_1 = spill1724_3;
        break forward_join_97;
    }
    if (!((spill1724_2 >= spill1724_3))) {
        break forward_join_94;
    }
    spill1724_4 = __call1724_6(p0);
    spill1724_5 = __invokedynamic1724_7(14058, (675721189463420410L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue1724_97_0 = spill1724_4;
        forwardValue1724_97_1 = spill1724_5;
        break forward_join_97;
    }
    if (!((spill1724_4 < spill1724_5))) {
        break forward_join_94;
    }
    spill1724_6 = __call1724_8(p0);
    spill1724_7 = __invokedynamic1724_9(14058, (675721189463420410L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue1724_97_0 = spill1724_6;
        forwardValue1724_97_1 = spill1724_7;
        break forward_join_97;
    }
    if (!((spill1724_6 < spill1724_7))) {
        break forward_join_94;
    }
    spill1724_8 = __call1724_12(receiver, (__call1724_10(p0) >> 4), (__call1724_11(p0) >> 4), 1);
    if (!((life4_5 == null))) {
        forwardValue1724_91_0 = __integerCategory1724_13(spill1724_8);
        break forward_join_91;
    }
    if (!(spill1724_8)) {
        break forward_join_90;
    }
    life5_114 = __call1724_21(__call1724_16(receiver, (__call1724_14(p0) >> 4), (__call1724_15(p0) >> 4)), (__call1724_17(p0) & __invokedynamic1724_18(24438, (2603080622989509720L ^ life2_3))), (__call1724_19(p0) & __invokedynamic1724_20(24438, (2603080622989509720L ^ life2_3))));
    if (!((life4_5 != null))) {
        break forward_join_99;
    }
    }
    forwardValue1724_91_0 = 0;
    }
    life5_114 = forwardValue1724_91_0;
    if (!((life4_5 != null))) {
        break forward_join_99;
    }
    }
    forwardValue1724_97_0 = __call1724_22(receiver);
    forwardValue1724_97_1 = 1;
    }
    life5_114 = (forwardValue1724_97_0 + forwardValue1724_97_1);
    }
    return new moom.DT(__call1724_23(p0), life5_114, __call1724_24(p0));
}
public static void h1724_0(moom.Oo p0) throws Throwable {
    throw __call1172400_0(p0);
}
public static void h1724_1(moom.Oo p0) throws Throwable {
    throw __call1172401_0(p0);
}
public static void h1724_2(moom.Oo p0) throws Throwable {
    throw __call1172402_0(p0);
}
public static void h1724_3(moom.Oo p0) throws Throwable {
    throw __call1172403_0(p0);
}
public static void h1724_4(moom.Oo p0) throws Throwable {
    throw __call1172404_0(p0);
}
public static void h1724_5(moom.Oo p0) throws Throwable {
    throw __call1172405_0(p0);
}
public static void h1724_6(moom.Oo p0) throws Throwable {
    throw __call1172406_0(p0);
}
public static void h1724_7(moom.Oo p0) throws Throwable {
    throw __call1172407_0(p0);
}
public static void h1724_8(moom.Oo p0) throws Throwable {
    throw __call1172408_0(p0);
}
public static void h1724_9(moom.Oo p0) throws Throwable {
    throw __call1172409_0(p0);
}
public static void h1724_10(moom.Oo p0) throws Throwable {
    throw __call1172410_0(p0);
}
private static native long __fieldRead1724_0() throws Throwable;
private static native java.lang.String __call1724_1() throws Throwable;
private static native int __call1724_2(moom.DT a0) throws Throwable;
private static native int __invokedynamic1724_3(int a0, long a1) throws Throwable;
private static native int __call1724_4(moom.DT a0) throws Throwable;
private static native int __invokedynamic1724_5(int a0, long a1) throws Throwable;
private static native int __call1724_6(moom.DT a0) throws Throwable;
private static native int __invokedynamic1724_7(int a0, long a1) throws Throwable;
private static native int __call1724_8(moom.DT a0) throws Throwable;
private static native int __invokedynamic1724_9(int a0, long a1) throws Throwable;
private static native int __call1724_10(moom.DT a0) throws Throwable;
private static native int __call1724_11(moom.DT a0) throws Throwable;
private static native boolean __call1724_12(net.minecraft.world.World a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory1724_13(boolean value) throws Throwable;
private static native int __call1724_14(moom.DT a0) throws Throwable;
private static native int __call1724_15(moom.DT a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1724_16(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native int __call1724_17(moom.DT a0) throws Throwable;
private static native int __invokedynamic1724_18(int a0, long a1) throws Throwable;
private static native int __call1724_19(moom.DT a0) throws Throwable;
private static native int __invokedynamic1724_20(int a0, long a1) throws Throwable;
private static native int __call1724_21(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws Throwable;
private static native int __call1724_22(net.minecraft.world.World a0) throws Throwable;
private static native int __call1724_23(moom.DT a0) throws Throwable;
private static native int __call1724_24(moom.DT a0) throws Throwable;
private static native java.lang.Throwable __call1172400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172410_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.biome.BiomeGenBase __sourceHandlerCall_cdfa094ea4617b2e2adf(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_cdfa094ea4617b2e2adf {

public static net.minecraft.world.biome.BiomeGenBase f606(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    net.minecraft.world.World forwardValue606_24_0;
    net.minecraft.world.World spill606_0;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.world.chunk.Chunk life5_18;
    forward_join_24: {
    forward_join_23: {
    life2_3 = (__fieldRead606_0() ^ 107622677836297L);
    life4_5 = __call606_1();
    spill606_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue606_24_0 = spill606_0;
        break forward_join_24;
    }
    if (!(__call606_2(spill606_0, p0))) {
        break forward_join_23;
    }
    life5_18 = __call606_3(receiver, p0);
    return __call606_6(life5_18, p0, __call606_5(__fieldRead606_4(receiver)));
    }
    forwardValue606_24_0 = receiver;
    }
    return __call606_10(__call606_8(__fieldRead606_7(forwardValue606_24_0)), p0, __fieldRead606_9());
}
public static net.minecraft.world.biome.BiomeGenBase h606_0(java.lang.Throwable p0) throws Throwable {
    throw __call2060600_0(p0);
}
public static net.minecraft.world.biome.BiomeGenBase h606_1(java.lang.Throwable p0, moom.DT p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    moom.qY local3 = __call2060601_0(local2, "Getting biome");
    moom.qZ local4 = __call2060601_1(local3, "Coordinates of biome request");
    __call2060601_3(local4, "Location", __invokedynamic2060601_2(p1));
    throw new moom.Oo(local3);
}
private static native long __fieldRead606_0() throws Throwable;
private static native java.lang.String __call606_1() throws Throwable;
private static native boolean __call606_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call606_3(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native moom.EA __fieldRead606_4(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.biome.WorldChunkManager __call606_5(moom.EA a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call606_6(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.world.biome.WorldChunkManager a2) throws Throwable;
private static native moom.EA __fieldRead606_7(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.biome.WorldChunkManager __call606_8(moom.EA a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead606_9() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call606_10(net.minecraft.world.biome.WorldChunkManager a0, moom.DT a1, net.minecraft.world.biome.BiomeGenBase a2) throws Throwable;
private static native java.lang.Throwable __call2060600_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2060601_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2060601_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2060601_2(moom.DT a0) throws Throwable;
private static native void __call2060601_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;

}

private static native <E extends Throwable> moom.Eh __sourceHandlerCall_c8e2b856914c3f8c5999(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_c8e2b856914c3f8c5999 {

public static moom.Eh f1725(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    net.minecraft.world.World forwardValue1725_21_0;
    moom.DT forwardValue1725_21_1;
    java.lang.String spill1725_0;
    net.minecraft.world.World spill1725_1;
    moom.DT spill1725_2;
    long life2_3;
    long life5_6;
    java.lang.String life4_7;
    float life7_9;
    forward_join_24: {
    forward_join_21: {
    life2_3 = (__fieldRead1725_0() ^ 80031403048566L);
    spill1725_0 = __call1725_1();
    life5_6 = 0L;
    life4_7 = spill1725_0;
    life7_9 = 0x0.0p0f;
    spill1725_1 = receiver;
    spill1725_2 = p0;
    if (!((life4_7 == null))) {
        forwardValue1725_21_0 = spill1725_1;
        forwardValue1725_21_1 = spill1725_2;
        break forward_join_21;
    }
    if (!(__call1725_2(spill1725_1, spill1725_2))) {
        break forward_join_24;
    }
    life7_9 = __call1725_3(receiver);
    forwardValue1725_21_0 = receiver;
    forwardValue1725_21_1 = p0;
    }
    life5_6 = __call1725_5(__call1725_4(forwardValue1725_21_0, forwardValue1725_21_1));
    }
    return new moom.Eh(__call1725_6(receiver), __call1725_7(receiver), life5_6, life7_9);
}
public static void h1725_0(moom.Oo p0) throws Throwable {
    throw __call1172500_0(p0);
}
private static native long __fieldRead1725_0() throws Throwable;
private static native java.lang.String __call1725_1() throws Throwable;
private static native boolean __call1725_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native float __call1725_3(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1725_4(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native long __call1725_5(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call1725_6(net.minecraft.world.World a0) throws Throwable;
private static native long __call1725_7(net.minecraft.world.World a0) throws Throwable;
private static native java.lang.Throwable __call1172500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_b89f63f501a339b1fc09(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_b89f63f501a339b1fc09 {

public static int f1726(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    int forwardValue1726_15_0;
    int forwardValue1726_42_0;
    int spill1726_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_42: {
    forward_join_36: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (__fieldRead1726_0() ^ 32838983422082L);
    life4_5 = __call1726_1();
    spill1726_0 = __call1726_2(p0);
    if (!((life4_5 == null))) {
        forwardValue1726_15_0 = spill1726_0;
        break forward_join_15;
    }
    if (!((spill1726_0 < 0))) {
        break forward_join_13;
    }
    return 0;
    }
    forwardValue1726_15_0 = __call1726_3(p0);
    }
    if (!((life4_5 == null))) {
        forwardValue1726_42_0 = forwardValue1726_15_0;
        break forward_join_42;
    }
    if (!((forwardValue1726_15_0 >= __invokedynamic1726_4(5123, (1626619541831351455L ^ life2_3))))) {
        break forward_join_36;
    }
    p0 = new moom.DT(__call1726_5(p0), __invokedynamic1726_6(1863, (1616207324649254884L ^ life2_3)), __call1726_7(p0));
    }
    forwardValue1726_42_0 = __call1726_9(__call1726_8(receiver, p0), p0, 0);
    }
    return forwardValue1726_42_0;
}
public static void h1726_0(moom.Oo p0) throws Throwable {
    throw __call1172600_0(p0);
}
public static void h1726_1(moom.Oo p0) throws Throwable {
    throw __call1172601_0(p0);
}
public static void h1726_2(moom.Oo p0) throws Throwable {
    throw __call1172602_0(p0);
}
private static native long __fieldRead1726_0() throws Throwable;
private static native java.lang.String __call1726_1() throws Throwable;
private static native int __call1726_2(moom.DT a0) throws Throwable;
private static native int __call1726_3(moom.DT a0) throws Throwable;
private static native int __invokedynamic1726_4(int a0, long a1) throws Throwable;
private static native int __call1726_5(moom.DT a0) throws Throwable;
private static native int __invokedynamic1726_6(int a0, long a1) throws Throwable;
private static native int __call1726_7(moom.DT a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1726_8(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __call1726_9(net.minecraft.world.chunk.Chunk a0, moom.DT a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1172600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172602_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.block.state.IBlockState __sourceHandlerCall_6687b77960ba83976380(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_6687b77960ba83976380 {

public static net.minecraft.block.state.IBlockState f1727(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    net.minecraft.world.World forwardValue1727_17_0;
    moom.DT forwardValue1727_17_1;
    net.minecraft.world.World spill1727_0;
    moom.DT spill1727_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.world.chunk.Chunk life5_23;
    forward_join_17: {
    forward_join_15: {
    life2_3 = (__fieldRead1727_0() ^ 94114884587129L);
    life4_5 = __call1727_1();
    spill1727_0 = receiver;
    spill1727_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue1727_17_0 = spill1727_0;
        forwardValue1727_17_1 = spill1727_1;
        break forward_join_17;
    }
    if (!((!__call1727_2(spill1727_0, spill1727_1)))) {
        break forward_join_15;
    }
    return __call1727_4(__fieldRead1727_3());
    }
    forwardValue1727_17_0 = receiver;
    forwardValue1727_17_1 = p0;
    }
    life5_23 = __call1727_5(forwardValue1727_17_0, forwardValue1727_17_1);
    return __call1727_6(life5_23, p0);
}
public static void h1727_0(moom.Oo p0) throws Throwable {
    throw __call1172700_0(p0);
}
public static void h1727_1(moom.Oo p0) throws Throwable {
    throw __call1172701_0(p0);
}
private static native long __fieldRead1727_0() throws Throwable;
private static native java.lang.String __call1727_1() throws Throwable;
private static native boolean __call1727_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead1727_3() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1727_4(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1727_5(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1727_6(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native java.lang.Throwable __call1172700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1172701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.player.EntityPlayer __sourceHandlerCall_8ee2b486637eb8298aaf(net.minecraft.world.World a0, java.lang.String a1) throws E;
private static final class __SourceHandler_8ee2b486637eb8298aaf {

public static net.minecraft.entity.player.EntityPlayer f1728(net.minecraft.world.World receiver, java.lang.String p0) throws Throwable {
    java.lang.String spill1728_0;
    long life2_3;
    java.util.Iterator life5_8;
    java.lang.String life4_9;
    net.minecraft.entity.player.EntityPlayer life6_16;
    lexical_join_26: {
    life2_3 = (__fieldRead1728_0() ^ 70464098519418L);
    spill1728_0 = __call1728_1();
    life5_8 = __call1728_3(__fieldRead1728_2(receiver));
    life4_9 = spill1728_0;
    lexical_cycle_10: while (true) {
    lexical_join_24: {
    if (!(__call1728_4(life5_8))) {
        break lexical_join_26;
    }
    life6_16 = __cast1728_6(__call1728_5(life5_8));
    if (!(__call1728_8(p0, __call1728_7(life6_16)))) {
        break lexical_join_24;
    }
    return life6_16;
    }
    if (!((life4_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return null;
}
public static void h1728_0(moom.Oo p0) throws Throwable {
    throw __call1172800_0(p0);
}
private static native long __fieldRead1728_0() throws Throwable;
private static native java.lang.String __call1728_1() throws Throwable;
private static native java.util.List __fieldRead1728_2(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call1728_3(java.util.List a0) throws Throwable;
private static native boolean __call1728_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1728_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1728_6(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1728_7(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native boolean __call1728_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1172800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_a933806a4bd83a63dfe9(net.minecraft.world.World a0, java.lang.Class a1, com.google.common.base.Predicate a2) throws E;
private static final class __SourceHandler_a933806a4bd83a63dfe9 {

public static java.util.List f280(net.minecraft.world.World receiver, java.lang.Class p0, com.google.common.base.Predicate p1) throws Throwable {
    int lexicalValue280_29_0;
    int lexicalValue280_35_0;
    java.lang.String spill280_0;
    boolean spill280_1;
    long life3_3;
    java.util.ArrayList life6_5;
    java.util.Iterator life7_10;
    java.lang.String life5_11;
    net.minecraft.entity.Entity life8_18;
    lexical_join_38: {
    life3_3 = (__fieldRead280_0() ^ 39116802369872L);
    life6_5 = __call280_1();
    spill280_0 = __call280_2();
    life7_10 = __call280_4(__fieldRead280_3(receiver));
    life5_11 = spill280_0;
    lexical_cycle_12: while (true) {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_29: {
    if (!(__call280_5(life7_10))) {
        break lexical_join_38;
    }
    life8_18 = __cast280_7(__call280_6(life7_10));
    spill280_1 = __call280_9(p0, __call280_8(life8_18));
    if (!((life5_11 == null))) {
        lexicalValue280_29_0 = __integerCategory280_10(spill280_1);
        break lexical_join_29;
    }
    if (!(spill280_1)) {
        break lexical_join_36;
    }
    lexicalValue280_29_0 = __integerCategory280_12(__call280_11(p1, life8_18));
    }
    if (!((life5_11 == null))) {
        lexicalValue280_35_0 = lexicalValue280_29_0;
        break lexical_join_35;
    }
    if (!((lexicalValue280_29_0 != 0))) {
        break lexical_join_36;
    }
    lexicalValue280_35_0 = __integerCategory280_14(__call280_13(life6_5, life8_18));
    }
    __discardScalar280_15(lexicalValue280_35_0);
    }
    if (!((life5_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life6_5;
}
public static void h280_0(moom.Oo p0) throws Throwable {
    throw __call1028000_0(p0);
}
public static void h280_1(moom.Oo p0) throws Throwable {
    throw __call1028001_0(p0);
}
public static void h280_2(moom.Oo p0) throws Throwable {
    throw __call1028002_0(p0);
}
public static void h280_3(moom.Oo p0) throws Throwable {
    throw __call1028003_0(p0);
}
private static native long __fieldRead280_0() throws Throwable;
private static native java.util.ArrayList __call280_1() throws Throwable;
private static native java.lang.String __call280_2() throws Throwable;
private static native java.util.List __fieldRead280_3(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call280_4(java.util.List a0) throws Throwable;
private static native boolean __call280_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call280_6(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast280_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __call280_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call280_9(java.lang.Class a0, java.lang.Class a1) throws Throwable;
private static native int __integerCategory280_10(boolean value) throws Throwable;
private static native boolean __call280_11(com.google.common.base.Predicate a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory280_12(boolean value) throws Throwable;
private static native boolean __call280_13(java.util.ArrayList a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory280_14(boolean value) throws Throwable;
private static native void __discardScalar280_15(int a0) throws Throwable;
private static native java.lang.Throwable __call1028000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028003_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ec242adf5fac871f5944(net.minecraft.world.World a0, moom.CA a1) throws E;
private static final class __SourceHandler_ec242adf5fac871f5944 {

public static boolean f1144(net.minecraft.world.World receiver, moom.CA p0) throws Throwable {
    int forestValue1144_37_0;
    int forestValue1144_84_0;
    java.lang.String spill1144_0;
    int spill1144_1;
    int spill1144_2;
    long life2_3;
    int life5_7;
    int life6_12;
    int life7_16;
    int life8_20;
    int life9_24;
    java.lang.String life4_25;
    int life10_29;
    moom.DU life11_33;
    int life12_35;
    int life13_42;
    int life14_49;
    net.minecraft.block.Block life15_61;
    forest_join_84: {
    forest_join_83: {
    forest_join_81: {
    life2_3 = (__fieldRead1144_0() ^ 92911685282740L);
    life5_7 = __call1144_2(__fieldRead1144_1(p0));
    spill1144_0 = __call1144_3();
    life6_12 = __call1144_5(__fieldRead1144_4(p0));
    life7_16 = __call1144_7(__fieldRead1144_6(p0));
    life8_20 = __call1144_9(__fieldRead1144_8(p0));
    life9_24 = __call1144_11(__fieldRead1144_10(p0));
    life4_25 = spill1144_0;
    life10_29 = __call1144_13(__fieldRead1144_12(p0));
    life11_33 = new moom.DU();
    life12_35 = life5_7;
    forest_cycle_36: while (true) {
    forest_join_77: {
    forestValue1144_37_0 = life12_35;
    forest_cycle_37: while (true) {
    if (!((forestValue1144_37_0 <= life6_12))) {
        break forest_join_83;
    }
    spill1144_1 = life7_16;
    if (!((life4_25 == null))) {
        forestValue1144_84_0 = spill1144_1;
        break forest_join_84;
    }
    life13_42 = spill1144_1;
    forest_cycle_43: while (true) {
    forest_join_75: {
    forest_join_74: {
    if (!((life13_42 <= life8_20))) {
        break forest_join_77;
    }
    spill1144_2 = life9_24;
    if (!((life4_25 == null))) {
        forestValue1144_37_0 = spill1144_2;
        continue forest_cycle_37;
    }
    life14_49 = spill1144_2;
    forest_cycle_50: while (true) {
    forest_join_72: {
    forest_join_71: {
    if (!((life14_49 <= life10_29))) {
        break forest_join_74;
    }
    life15_61 = __call1144_16(__call1144_15(receiver, __call1144_14(life11_33, life12_35, life13_42, life14_49)));
    if (!((life4_25 == null))) {
        break forest_join_75;
    }
    if (!((life4_25 == null))) {
        break forest_join_72;
    }
    if (!((__call1144_17(life15_61) != __fieldRead1144_18()))) {
        break forest_join_71;
    }
    break forest_join_81;
    }
    life14_49 += 1;
    }
    if (!((life4_25 != null))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    }
    life13_42 += 1;
    }
    if (!((life4_25 != null))) {
        continue forest_cycle_43;
    }
    break forest_cycle_43;
    }
    break forest_cycle_37;
    }
    }
    life12_35 += 1;
    if (!((life4_25 != null))) {
        continue forest_cycle_36;
    }
    break forest_cycle_36;
    }
    break forest_join_83;
    }
    return __integerCategory1144_19(1);
    }
    forestValue1144_84_0 = 0;
    }
    return __integerCategory1144_20(forestValue1144_84_0);
}
public static boolean h1144_0(moom.Oo p0) throws Throwable {
    throw __call3114400_0(p0);
}
public static boolean h1144_1(moom.Oo p0) throws Throwable {
    throw __call3114401_0(p0);
}
public static boolean h1144_2(moom.Oo p0) throws Throwable {
    throw __call3114402_0(p0);
}
private static native long __fieldRead1144_0() throws Throwable;
private static native double __fieldRead1144_1(moom.CA a0) throws Throwable;
private static native int __call1144_2(double a0) throws Throwable;
private static native java.lang.String __call1144_3() throws Throwable;
private static native double __fieldRead1144_4(moom.CA a0) throws Throwable;
private static native int __call1144_5(double a0) throws Throwable;
private static native double __fieldRead1144_6(moom.CA a0) throws Throwable;
private static native int __call1144_7(double a0) throws Throwable;
private static native double __fieldRead1144_8(moom.CA a0) throws Throwable;
private static native int __call1144_9(double a0) throws Throwable;
private static native double __fieldRead1144_10(moom.CA a0) throws Throwable;
private static native int __call1144_11(double a0) throws Throwable;
private static native double __fieldRead1144_12(moom.CA a0) throws Throwable;
private static native int __call1144_13(double a0) throws Throwable;
private static native moom.DU __call1144_14(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1144_15(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native net.minecraft.block.Block __call1144_16(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call1144_17(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1144_18() throws Throwable;
private static native boolean __integerCategory1144_19(int value) throws Throwable;
private static native boolean __integerCategory1144_20(int value) throws Throwable;
private static native java.lang.Throwable __call3114400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_085424a058a69b3ebcfe(net.minecraft.world.World a0, moom.CA a1, moom.fn a2) throws E;
private static final class __SourceHandler_085424a058a69b3ebcfe {

public static boolean f1145(net.minecraft.world.World receiver, moom.CA p0, moom.fn p1) throws Throwable {
    int forestValue1145_43_0;
    int forestValue1145_112_0;
    int forestValue1145_127_0;
    int forestValue1145_129_0;
    java.lang.String spill1145_0;
    int spill1145_1;
    int spill1145_2;
    int spill1145_3;
    long life3_3;
    int life6_7;
    int life7_13;
    int life8_17;
    int life9_24;
    int life10_28;
    java.lang.String life5_29;
    int life11_35;
    moom.DU life12_39;
    int life13_41;
    int life14_48;
    int life15_55;
    net.minecraft.block.state.IBlockState life16_66;
    net.minecraft.block.Block life17_69;
    int life18_85;
    double life19_90;
    forest_join_129: {
    forest_join_128: {
    forest_join_127: {
    forest_join_126: {
    life3_3 = (__fieldRead1145_0() ^ 75093567129242L);
    life6_7 = __call1145_2(__fieldRead1145_1(p0));
    life7_13 = __call1145_4((__fieldRead1145_3(p0) + 0x1.0p0d));
    life8_17 = __call1145_6(__fieldRead1145_5(p0));
    spill1145_0 = __call1145_7();
    life9_24 = __call1145_9((__fieldRead1145_8(p0) + 0x1.0p0d));
    life10_28 = __call1145_11(__fieldRead1145_10(p0));
    life5_29 = spill1145_0;
    life11_35 = __call1145_13((__fieldRead1145_12(p0) + 0x1.0p0d));
    life12_39 = new moom.DU();
    life13_41 = life6_7;
    forest_cycle_42: while (true) {
    forest_join_122: {
    forestValue1145_43_0 = life13_41;
    forest_cycle_43: while (true) {
    if (!((forestValue1145_43_0 < life7_13))) {
        break forest_join_128;
    }
    spill1145_1 = life8_17;
    if (!((life5_29 == null))) {
        forestValue1145_129_0 = spill1145_1;
        break forest_join_129;
    }
    life14_48 = spill1145_1;
    forest_cycle_49: while (true) {
    forest_join_120: {
    forest_join_119: {
    if (!((life14_48 < life9_24))) {
        break forest_join_122;
    }
    spill1145_2 = life10_28;
    if (!((life5_29 == null))) {
        forestValue1145_43_0 = spill1145_2;
        continue forest_cycle_43;
    }
    life15_55 = spill1145_2;
    forest_cycle_56: while (true) {
    forest_join_117: {
    forest_join_116: {
    forest_join_112: {
    forest_join_108: {
    if (!((life15_55 < life11_35))) {
        break forest_join_119;
    }
    life16_66 = __call1145_15(receiver, __call1145_14(life12_39, life13_41, life14_48, life15_55));
    life17_69 = __call1145_16(life16_66);
    if (!((life5_29 == null))) {
        break forest_join_120;
    }
    if (!((life5_29 == null))) {
        break forest_join_117;
    }
    if (!((__call1145_17(life17_69) == p1))) {
        break forest_join_116;
    }
    life18_85 = __call1145_21(__cast1145_20(__call1145_19(life16_66, __fieldRead1145_18())));
    life19_90 = ((double) (life14_48 + 1));
    spill1145_3 = life18_85;
    if (!((life5_29 == null))) {
        forestValue1145_112_0 = spill1145_3;
        break forest_join_112;
    }
    if (!((spill1145_3 < __invokedynamic1145_22(16662, (7984260416566525877L ^ life3_3))))) {
        break forest_join_108;
    }
    life19_90 = (((double) (life14_48 + 1)) - (((double) life18_85) / 0x1.0p3d));
    }
    forestValue1145_112_0 = __numericCompare1145_24(life19_90, __fieldRead1145_23(p0));
    }
    if (!((life5_29 == null))) {
        forestValue1145_127_0 = forestValue1145_112_0;
        break forest_join_127;
    }
    if (!((forestValue1145_112_0 >= 0))) {
        break forest_join_116;
    }
    break forest_join_126;
    }
    life15_55 += 1;
    }
    if (!((life5_29 != null))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    }
    life14_48 += 1;
    }
    if (!((life5_29 != null))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    break forest_cycle_43;
    }
    }
    life13_41 += 1;
    if (!((life5_29 != null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_join_128;
    }
    forestValue1145_127_0 = 1;
    }
    return __integerCategory1145_25(forestValue1145_127_0);
    }
    forestValue1145_129_0 = 0;
    }
    return __integerCategory1145_26(forestValue1145_129_0);
}
public static boolean h1145_0(moom.Oo p0) throws Throwable {
    throw __call3114500_0(p0);
}
public static boolean h1145_1(moom.Oo p0) throws Throwable {
    throw __call3114501_0(p0);
}
public static boolean h1145_2(moom.Oo p0) throws Throwable {
    throw __call3114502_0(p0);
}
public static boolean h1145_3(moom.Oo p0) throws Throwable {
    throw __call3114503_0(p0);
}
private static native long __fieldRead1145_0() throws Throwable;
private static native double __fieldRead1145_1(moom.CA a0) throws Throwable;
private static native int __call1145_2(double a0) throws Throwable;
private static native double __fieldRead1145_3(moom.CA a0) throws Throwable;
private static native int __call1145_4(double a0) throws Throwable;
private static native double __fieldRead1145_5(moom.CA a0) throws Throwable;
private static native int __call1145_6(double a0) throws Throwable;
private static native java.lang.String __call1145_7() throws Throwable;
private static native double __fieldRead1145_8(moom.CA a0) throws Throwable;
private static native int __call1145_9(double a0) throws Throwable;
private static native double __fieldRead1145_10(moom.CA a0) throws Throwable;
private static native int __call1145_11(double a0) throws Throwable;
private static native double __fieldRead1145_12(moom.CA a0) throws Throwable;
private static native int __call1145_13(double a0) throws Throwable;
private static native moom.DU __call1145_14(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1145_15(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native net.minecraft.block.Block __call1145_16(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call1145_17(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fy __fieldRead1145_18() throws Throwable;
private static native java.lang.Comparable __call1145_19(net.minecraft.block.state.IBlockState a0, moom.fy a1) throws Throwable;
private static native java.lang.Integer __cast1145_20(java.lang.Comparable a0) throws Throwable;
private static native int __call1145_21(java.lang.Integer a0) throws Throwable;
private static native int __invokedynamic1145_22(int a0, long a1) throws Throwable;
private static native double __fieldRead1145_23(moom.CA a0) throws Throwable;
private static native int __numericCompare1145_24(double a0, double a1) throws Throwable;
private static native boolean __integerCategory1145_25(int value) throws Throwable;
private static native boolean __integerCategory1145_26(int value) throws Throwable;
private static native java.lang.Throwable __call3114500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114503_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_526291be0b8e8d22048c(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws E;
private static final class __SourceHandler_526291be0b8e8d22048c {

public static int f1732(net.minecraft.world.World receiver, moom.DT p0, moom.bs p1) throws Throwable {
    net.minecraft.block.Block forwardValue1732_23_0;
    int forwardValue1732_28_0;
    java.lang.String spill1732_0;
    net.minecraft.block.Block spill1732_1;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    java.lang.String life5_9;
    net.minecraft.block.Block life7_12;
    forward_join_28: {
    forward_join_23: {
    forward_join_22: {
    life3_3 = (__fieldRead1732_0() ^ 16384320962872L);
    spill1732_0 = __call1732_1();
    life6_8 = __call1732_2(receiver, p0);
    life5_9 = spill1732_0;
    life7_12 = __call1732_3(life6_8);
    spill1732_1 = life7_12;
    if (!((life5_9 == null))) {
        forwardValue1732_23_0 = spill1732_1;
        break forward_join_23;
    }
    if (!(__call1732_4(spill1732_1))) {
        break forward_join_22;
    }
    forwardValue1732_28_0 = __call1732_5(receiver, p0);
    break forward_join_28;
    }
    forwardValue1732_23_0 = life7_12;
    }
    forwardValue1732_28_0 = __call1732_6(forwardValue1732_23_0, receiver, p0, life6_8, p1);
    }
    return forwardValue1732_28_0;
}
public static void h1732_0(moom.Oo p0) throws Throwable {
    throw __call1173200_0(p0);
}
public static void h1732_1(moom.Oo p0) throws Throwable {
    throw __call1173201_0(p0);
}
private static native long __fieldRead1732_0() throws Throwable;
private static native java.lang.String __call1732_1() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1732_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1732_3(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call1732_4(net.minecraft.block.Block a0) throws Throwable;
private static native int __call1732_5(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __call1732_6(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, moom.bs a4) throws Throwable;
private static native java.lang.Throwable __call1173200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_734d5f455320f74be7d6(net.minecraft.world.World a0, moom.DT a1, net.minecraft.tileentity.TileEntity a2) throws E;
private static final class __SourceHandler_734d5f455320f74be7d6 {

public static void f1733(net.minecraft.world.World receiver, moom.DT p0, net.minecraft.tileentity.TileEntity p1) throws Throwable {
    net.minecraft.world.World forwardValue1733_14_0;
    moom.DT forwardValue1733_14_1;
    net.minecraft.world.World spill1733_0;
    moom.DT spill1733_1;
    long life3_3;
    java.lang.String life5_5;
    forward_join_16: {
    forward_join_14: {
    life3_3 = (__fieldRead1733_0() ^ 117949159271968L);
    life5_5 = __call1733_1();
    spill1733_0 = receiver;
    spill1733_1 = p0;
    if (!((life5_5 == null))) {
        forwardValue1733_14_0 = spill1733_0;
        forwardValue1733_14_1 = spill1733_1;
        break forward_join_14;
    }
    if (!(__call1733_2(spill1733_0, spill1733_1))) {
        break forward_join_16;
    }
    forwardValue1733_14_0 = receiver;
    forwardValue1733_14_1 = p0;
    }
    __call1733_4(__call1733_3(forwardValue1733_14_0, forwardValue1733_14_1));
    }
    return;
}
public static void h1733_0(moom.Oo p0) throws Throwable {
    throw __call1173300_0(p0);
}
public static void h1733_1(moom.Oo p0) throws Throwable {
    throw __call1173301_0(p0);
}
private static native long __fieldRead1733_0() throws Throwable;
private static native java.lang.String __call1733_1() throws Throwable;
private static native boolean __call1733_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1733_3(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native void __call1733_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Throwable __call1173300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7aad43e9777f3f506188(net.minecraft.world.World a0, moom.DT a1, boolean a2) throws E;
private static final class __SourceHandler_7aad43e9777f3f506188 {

public static boolean f1734(net.minecraft.world.World receiver, moom.DT p0, boolean p1) throws Throwable {
    int forwardValue1734_24_0;
    int forwardValue1734_28_0;
    int forwardValue1734_30_0;
    int forwardValue1734_39_0;
    net.minecraft.world.World forwardValue1734_43_0;
    int forwardValue1734_94_0;
    int forwardValue1734_109_0;
    boolean spill1734_0;
    int spill1734_1;
    net.minecraft.world.World spill1734_2;
    int spill1734_3;
    long life3_3;
    java.lang.String life5_5;
    int life6_42;
    net.minecraft.block.state.IBlockState life7_68;
    net.minecraft.block.Block life8_71;
    forward_join_109: {
    forward_join_103: {
    forward_join_94: {
    forward_join_93: {
    forward_join_73: {
    forward_join_67: {
    forward_join_43: {
    forward_join_42: {
    forward_join_39: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life3_3 = (__fieldRead1734_0() ^ 38394088856681L);
    life5_5 = __call1734_1();
    spill1734_0 = __call1734_3(__call1734_2(), "\n");
    if (!((life5_5 == null))) {
        forwardValue1734_24_0 = __integerCategory1734_4(spill1734_0);
        break forward_join_24;
    }
    if (!(spill1734_0)) {
        break forward_join_15;
    }
    if (!((__call1734_6(__call1734_5()) == null))) {
        break forward_join_29;
    }
    }
    forwardValue1734_24_0 = __numericCompare1734_10((__call1734_7() - __call1734_8()), __invokedynamic1734_9(3626, (7412712196591200779L ^ life3_3)));
    }
    if (!((life5_5 == null))) {
        forwardValue1734_28_0 = forwardValue1734_24_0;
        break forward_join_28;
    }
    if (!((forwardValue1734_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue1734_28_0 = 1;
    }
    forwardValue1734_30_0 = forwardValue1734_28_0;
    break forward_join_30;
    }
    forwardValue1734_30_0 = 0;
    }
    life6_42 = forwardValue1734_30_0;
    spill1734_1 = life6_42;
    if (!((life5_5 == null))) {
        forwardValue1734_39_0 = spill1734_1;
        break forward_join_39;
    }
    if (!((spill1734_1 != 0))) {
        break forward_join_42;
    }
    spill1734_2 = receiver;
    if (!((life5_5 == null))) {
        forwardValue1734_43_0 = spill1734_2;
        break forward_join_43;
    }
    forwardValue1734_39_0 = __integerCategory1734_12(__call1734_11(spill1734_2));
    }
    if (!((forwardValue1734_39_0 == 0))) {
        break forward_join_42;
    }
    return __integerCategory1734_13(0);
    }
    forwardValue1734_43_0 = receiver;
    }
    life7_68 = __call1734_14(forwardValue1734_43_0, p0);
    life8_71 = __call1734_15(life7_68);
    if (!((__call1734_17(__call1734_16()) != __invokedynamic1734_18(332, (2565805764081607961L ^ life3_3))))) {
        break forward_join_67;
    }
    __call1734_21(receiver, __invokedynamic1734_19(16975, (601011635533391420L ^ life3_3)), p0, __call1734_20(life7_68));
    }
    if (!((__call1734_22(life8_71) == __fieldRead1734_23()))) {
        break forward_join_73;
    }
    return __integerCategory1734_24(0);
    }
    spill1734_3 = __call1734_26(__call1734_25());
    if (!((life5_5 == null))) {
        forwardValue1734_94_0 = spill1734_3;
        break forward_join_94;
    }
    if (!((spill1734_3 == __invokedynamic1734_27(4220, (8006682425814971428L ^ life3_3))))) {
        break forward_join_93;
    }
    __call1734_30(receiver, __invokedynamic1734_28(5873, (4760941878204592777L ^ life3_3)), p0, __call1734_29(life7_68));
    }
    forwardValue1734_94_0 = __integerCategory1734_31(p1);
    }
    if (!((life5_5 == null))) {
        forwardValue1734_109_0 = forwardValue1734_94_0;
        break forward_join_109;
    }
    if (!((forwardValue1734_94_0 != 0))) {
        break forward_join_103;
    }
    __call1734_32(life8_71, receiver, p0, life7_68, 0);
    }
    forwardValue1734_109_0 = __integerCategory1734_36(__call1734_35(receiver, p0, __call1734_34(__fieldRead1734_33()), 3));
    }
    return __integerCategory1734_37(forwardValue1734_109_0);
}
public static void h1734_0(moom.Oo p0) throws Throwable {
    throw __call1173400_0(p0);
}
public static void h1734_1(moom.Oo p0) throws Throwable {
    throw __call1173401_0(p0);
}
public static void h1734_2(moom.Oo p0) throws Throwable {
    throw __call1173402_0(p0);
}
public static void h1734_3(moom.Oo p0) throws Throwable {
    throw __call1173403_0(p0);
}
public static void h1734_4(moom.Oo p0) throws Throwable {
    throw __call1173404_0(p0);
}
public static void h1734_5(moom.Oo p0) throws Throwable {
    throw __call1173405_0(p0);
}
public static void h1734_6(moom.Oo p0) throws Throwable {
    throw __call1173406_0(p0);
}
public static void h1734_7(moom.Oo p0) throws Throwable {
    throw __call1173407_0(p0);
}
public static void h1734_8(moom.Oo p0) throws Throwable {
    throw __call1173408_0(p0);
}
public static void h1734_9(moom.Oo p0) throws Throwable {
    throw __call1173409_0(p0);
}
public static void h1734_10(moom.Oo p0) throws Throwable {
    throw __call1173410_0(p0);
}
public static void h1734_11(moom.Oo p0) throws Throwable {
    throw __call1173411_0(p0);
}
public static void h1734_12(moom.Oo p0) throws Throwable {
    throw __call1173412_0(p0);
}
public static void h1734_13(moom.Oo p0) throws Throwable {
    throw __call1173413_0(p0);
}
private static native long __fieldRead1734_0() throws Throwable;
private static native java.lang.String __call1734_1() throws Throwable;
private static native java.lang.String __call1734_2() throws Throwable;
private static native boolean __call1734_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1734_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call1734_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call1734_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native long __call1734_7() throws Throwable;
private static native long __call1734_8() throws Throwable;
private static native long __invokedynamic1734_9(int a0, long a1) throws Throwable;
private static native int __numericCompare1734_10(long a0, long a1) throws Throwable;
private static native boolean __call1734_11(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1734_12(boolean value) throws Throwable;
private static native boolean __integerCategory1734_13(int value) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1734_14(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1734_15(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native com.moon.o4 __call1734_16() throws Throwable;
private static native int __call1734_17(com.moon.o4 a0) throws Throwable;
private static native int __invokedynamic1734_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic1734_19(int a0, long a1) throws Throwable;
private static native int __call1734_20(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call1734_21(net.minecraft.world.World a0, int a1, moom.DT a2, int a3) throws Throwable;
private static native moom.fn __call1734_22(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1734_23() throws Throwable;
private static native boolean __integerCategory1734_24(int value) throws Throwable;
private static native com.moon.o4 __call1734_25() throws Throwable;
private static native int __call1734_26(com.moon.o4 a0) throws Throwable;
private static native int __invokedynamic1734_27(int a0, long a1) throws Throwable;
private static native int __invokedynamic1734_28(int a0, long a1) throws Throwable;
private static native int __call1734_29(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call1734_30(net.minecraft.world.World a0, int a1, moom.DT a2, int a3) throws Throwable;
private static native int __integerCategory1734_31(boolean value) throws Throwable;
private static native void __call1734_32(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, int a4) throws Throwable;
private static native net.minecraft.block.Block __fieldRead1734_33() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1734_34(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call1734_35(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native int __integerCategory1734_36(boolean value) throws Throwable;
private static native boolean __integerCategory1734_37(int value) throws Throwable;
private static native java.lang.Throwable __call1173400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173410_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173411_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173412_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173413_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_5445dbc84f125be524c2(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws E;
private static final class __SourceHandler_5445dbc84f125be524c2 {

public static int f1735(net.minecraft.world.World receiver, net.minecraft.world.EnumSkyBlock p0, moom.DT p1) throws Throwable {
    int forwardValue1735_23_0;
    int forwardValue1735_34_0;
    net.minecraft.world.World forwardValue1735_40_0;
    moom.DT forwardValue1735_40_1;
    int spill1735_0;
    net.minecraft.world.World spill1735_1;
    moom.DT spill1735_2;
    long life3_3;
    java.lang.String life5_5;
    net.minecraft.world.chunk.Chunk life6_54;
    forward_join_40: {
    forward_join_38: {
    forward_join_34: {
    forward_join_29: {
    forward_join_23: {
    forward_join_20: {
    life3_3 = (__fieldRead1735_0() ^ 123769056887868L);
    life5_5 = __call1735_1();
    spill1735_0 = __call1735_2(p1);
    if (!((life5_5 == null))) {
        forwardValue1735_23_0 = spill1735_0;
        break forward_join_23;
    }
    if (!((spill1735_0 < 0))) {
        break forward_join_20;
    }
    p1 = new moom.DT(__call1735_3(p1), 0, __call1735_4(p1));
    }
    forwardValue1735_23_0 = __integerCategory1735_6(__call1735_5(receiver, p1));
    }
    if (!((life5_5 == null))) {
        forwardValue1735_34_0 = forwardValue1735_23_0;
        break forward_join_34;
    }
    if (!((forwardValue1735_23_0 == 0))) {
        break forward_join_29;
    }
    return __fieldRead1735_7(p0);
    }
    spill1735_1 = receiver;
    spill1735_2 = p1;
    if (!((life5_5 == null))) {
        forwardValue1735_40_0 = spill1735_1;
        forwardValue1735_40_1 = spill1735_2;
        break forward_join_40;
    }
    forwardValue1735_34_0 = __integerCategory1735_9(__call1735_8(spill1735_1, spill1735_2));
    }
    if (!((forwardValue1735_34_0 == 0))) {
        break forward_join_38;
    }
    return __fieldRead1735_10(p0);
    }
    forwardValue1735_40_0 = receiver;
    forwardValue1735_40_1 = p1;
    }
    life6_54 = __call1735_11(forwardValue1735_40_0, forwardValue1735_40_1);
    return __call1735_12(life6_54, p0, p1);
}
public static void h1735_0(moom.Oo p0) throws Throwable {
    throw __call1173500_0(p0);
}
public static void h1735_1(moom.Oo p0) throws Throwable {
    throw __call1173501_0(p0);
}
public static void h1735_2(moom.Oo p0) throws Throwable {
    throw __call1173502_0(p0);
}
public static void h1735_3(moom.Oo p0) throws Throwable {
    throw __call1173503_0(p0);
}
public static void h1735_4(moom.Oo p0) throws Throwable {
    throw __call1173504_0(p0);
}
private static native long __fieldRead1735_0() throws Throwable;
private static native java.lang.String __call1735_1() throws Throwable;
private static native int __call1735_2(moom.DT a0) throws Throwable;
private static native int __call1735_3(moom.DT a0) throws Throwable;
private static native int __call1735_4(moom.DT a0) throws Throwable;
private static native boolean __call1735_5(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1735_6(boolean value) throws Throwable;
private static native int __fieldRead1735_7(net.minecraft.world.EnumSkyBlock a0) throws Throwable;
private static native boolean __call1735_8(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1735_9(boolean value) throws Throwable;
private static native int __fieldRead1735_10(net.minecraft.world.EnumSkyBlock a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1735_11(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __call1735_12(net.minecraft.world.chunk.Chunk a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native java.lang.Throwable __call1173500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173504_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_40faea8659e021b0794f(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_40faea8659e021b0794f {

public static boolean f1736(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    int forwardValue1736_24_0;
    int forwardValue1736_28_0;
    int forwardValue1736_30_0;
    int forwardValue1736_44_0;
    int forwardValue1736_59_0;
    int forwardValue1736_59_1;
    int forwardValue1736_69_0;
    int forwardValue1736_69_1;
    int forwardValue1736_81_0;
    int forwardValue1736_81_1;
    int forwardValue1736_84_0;
    int forwardValue1736_89_0;
    int forwardValue1736_98_0;
    int forwardValue1736_100_0;
    boolean spill1736_0;
    int spill1736_1;
    boolean spill1736_2;
    int spill1736_3;
    int spill1736_4;
    long life2_3;
    java.lang.String life4_5;
    int life5_42;
    forward_join_100: {
    forward_join_99: {
    forward_join_98: {
    forward_join_89: {
    forward_join_84: {
    forward_join_81: {
    forward_join_69: {
    forward_join_59: {
    forward_join_44: {
    forward_join_42: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life2_3 = (__fieldRead1736_0() ^ 14950963327369L);
    life4_5 = __call1736_1();
    spill1736_0 = __call1736_3(__call1736_2(), "\n");
    if (!((life4_5 == null))) {
        forwardValue1736_24_0 = __integerCategory1736_4(spill1736_0);
        break forward_join_24;
    }
    if (!(spill1736_0)) {
        break forward_join_15;
    }
    if (!((__call1736_6(__call1736_5()) == null))) {
        break forward_join_29;
    }
    }
    forwardValue1736_24_0 = __numericCompare1736_10((__call1736_7() - __call1736_8()), __invokedynamic1736_9(3626, (7412662227747637227L ^ life2_3)));
    }
    if (!((life4_5 == null))) {
        forwardValue1736_28_0 = forwardValue1736_24_0;
        break forward_join_28;
    }
    if (!((forwardValue1736_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue1736_28_0 = 1;
    }
    forwardValue1736_30_0 = forwardValue1736_28_0;
    break forward_join_30;
    }
    forwardValue1736_30_0 = 0;
    }
    life5_42 = forwardValue1736_30_0;
    spill1736_1 = life5_42;
    if (!((life4_5 == null))) {
        forwardValue1736_44_0 = spill1736_1;
        break forward_join_44;
    }
    if (!((spill1736_1 != 0))) {
        break forward_join_42;
    }
    spill1736_2 = __call1736_11(receiver);
    if (!((life4_5 == null))) {
        forwardValue1736_44_0 = __integerCategory1736_12(spill1736_2);
        break forward_join_44;
    }
    if (!((!spill1736_2))) {
        break forward_join_42;
    }
    return __integerCategory1736_13(0);
    }
    forwardValue1736_44_0 = __call1736_14(p0);
    }
    spill1736_3 = __invokedynamic1736_15(26910, (2540931126706184324L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue1736_59_0 = forwardValue1736_44_0;
        forwardValue1736_59_1 = spill1736_3;
        break forward_join_59;
    }
    if (!((forwardValue1736_44_0 >= spill1736_3))) {
        break forward_join_99;
    }
    forwardValue1736_59_0 = __call1736_16(p0);
    forwardValue1736_59_1 = __invokedynamic1736_17(20188, (2672913499575256910L ^ life2_3));
    }
    if (!((life4_5 == null))) {
        forwardValue1736_69_0 = forwardValue1736_59_0;
        forwardValue1736_69_1 = forwardValue1736_59_1;
        break forward_join_69;
    }
    if (!((forwardValue1736_59_0 >= forwardValue1736_59_1))) {
        break forward_join_99;
    }
    forwardValue1736_69_0 = __call1736_18(p0);
    forwardValue1736_69_1 = __invokedynamic1736_19(21427, (2363754517869566493L ^ life2_3));
    }
    if (!((life4_5 == null))) {
        forwardValue1736_81_0 = forwardValue1736_69_0;
        forwardValue1736_81_1 = forwardValue1736_69_1;
        break forward_join_81;
    }
    if (!((forwardValue1736_69_0 < forwardValue1736_69_1))) {
        break forward_join_99;
    }
    spill1736_4 = __call1736_20(p0);
    if (!((life4_5 == null))) {
        forwardValue1736_84_0 = spill1736_4;
        break forward_join_84;
    }
    forwardValue1736_81_0 = spill1736_4;
    forwardValue1736_81_1 = __invokedynamic1736_21(14058, (675795246376124273L ^ life2_3));
    }
    if (!((forwardValue1736_81_0 < forwardValue1736_81_1))) {
        break forward_join_99;
    }
    forwardValue1736_84_0 = __call1736_22(p0);
    }
    if (!((life4_5 == null))) {
        forwardValue1736_89_0 = forwardValue1736_84_0;
        break forward_join_89;
    }
    if (!((forwardValue1736_84_0 >= 0))) {
        break forward_join_99;
    }
    forwardValue1736_89_0 = __call1736_23(p0);
    }
    if (!((life4_5 == null))) {
        forwardValue1736_98_0 = forwardValue1736_89_0;
        break forward_join_98;
    }
    if (!((forwardValue1736_89_0 < __invokedynamic1736_24(5123, (1626636872547196308L ^ life2_3))))) {
        break forward_join_99;
    }
    forwardValue1736_98_0 = 1;
    }
    forwardValue1736_100_0 = forwardValue1736_98_0;
    break forward_join_100;
    }
    forwardValue1736_100_0 = 0;
    }
    return __integerCategory1736_25(forwardValue1736_100_0);
}
public static void h1736_0(moom.Oo p0) throws Throwable {
    throw __call1173600_0(p0);
}
public static void h1736_1(moom.Oo p0) throws Throwable {
    throw __call1173601_0(p0);
}
public static void h1736_2(moom.Oo p0) throws Throwable {
    throw __call1173602_0(p0);
}
public static void h1736_3(moom.Oo p0) throws Throwable {
    throw __call1173603_0(p0);
}
public static void h1736_4(moom.Oo p0) throws Throwable {
    throw __call1173604_0(p0);
}
public static void h1736_5(moom.Oo p0) throws Throwable {
    throw __call1173605_0(p0);
}
public static void h1736_6(moom.Oo p0) throws Throwable {
    throw __call1173606_0(p0);
}
public static void h1736_7(moom.Oo p0) throws Throwable {
    throw __call1173607_0(p0);
}
public static void h1736_8(moom.Oo p0) throws Throwable {
    throw __call1173608_0(p0);
}
public static void h1736_9(moom.Oo p0) throws Throwable {
    throw __call1173609_0(p0);
}
public static void h1736_10(moom.Oo p0) throws Throwable {
    throw __call1173610_0(p0);
}
public static void h1736_11(moom.Oo p0) throws Throwable {
    throw __call1173611_0(p0);
}
public static void h1736_12(moom.Oo p0) throws Throwable {
    throw __call1173612_0(p0);
}
public static void h1736_13(moom.Oo p0) throws Throwable {
    throw __call1173613_0(p0);
}
public static void h1736_14(moom.Oo p0) throws Throwable {
    throw __call1173614_0(p0);
}
public static void h1736_15(moom.Oo p0) throws Throwable {
    throw __call1173615_0(p0);
}
public static void h1736_16(moom.Oo p0) throws Throwable {
    throw __call1173616_0(p0);
}
public static void h1736_17(moom.Oo p0) throws Throwable {
    throw __call1173617_0(p0);
}
public static void h1736_18(moom.Oo p0) throws Throwable {
    throw __call1173618_0(p0);
}
public static void h1736_19(moom.Oo p0) throws Throwable {
    throw __call1173619_0(p0);
}
private static native long __fieldRead1736_0() throws Throwable;
private static native java.lang.String __call1736_1() throws Throwable;
private static native java.lang.String __call1736_2() throws Throwable;
private static native boolean __call1736_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1736_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call1736_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call1736_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native long __call1736_7() throws Throwable;
private static native long __call1736_8() throws Throwable;
private static native long __invokedynamic1736_9(int a0, long a1) throws Throwable;
private static native int __numericCompare1736_10(long a0, long a1) throws Throwable;
private static native boolean __call1736_11(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1736_12(boolean value) throws Throwable;
private static native boolean __integerCategory1736_13(int value) throws Throwable;
private static native int __call1736_14(moom.DT a0) throws Throwable;
private static native int __invokedynamic1736_15(int a0, long a1) throws Throwable;
private static native int __call1736_16(moom.DT a0) throws Throwable;
private static native int __invokedynamic1736_17(int a0, long a1) throws Throwable;
private static native int __call1736_18(moom.DT a0) throws Throwable;
private static native int __invokedynamic1736_19(int a0, long a1) throws Throwable;
private static native int __call1736_20(moom.DT a0) throws Throwable;
private static native int __invokedynamic1736_21(int a0, long a1) throws Throwable;
private static native int __call1736_22(moom.DT a0) throws Throwable;
private static native int __call1736_23(moom.DT a0) throws Throwable;
private static native int __invokedynamic1736_24(int a0, long a1) throws Throwable;
private static native boolean __integerCategory1736_25(int value) throws Throwable;
private static native java.lang.Throwable __call1173600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173609_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173610_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173611_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173612_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173613_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173614_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173615_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173616_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173617_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173618_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173619_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f98852253950b3472700(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_f98852253950b3472700 {

public static boolean f1737(net.minecraft.world.World receiver, net.minecraft.entity.Entity p0) throws Throwable {
    int forwardValue1737_29_0;
    int forwardValue1737_44_0;
    int forwardValue1737_72_0;
    java.lang.String spill1737_0;
    int spill1737_1;
    boolean spill1737_2;
    long life2_3;
    int life5_9;
    int life6_16;
    java.lang.String life4_17;
    int life7_20;
    net.minecraft.entity.player.EntityPlayer life8_66;
    forward_join_72: {
    forward_join_57: {
    forward_join_44: {
    forward_join_42: {
    forward_join_29: {
    forward_join_28: {
    life2_3 = (__fieldRead1737_0() ^ 135078079538108L);
    life5_9 = __call1737_2((__fieldRead1737_1(p0) / 0x1.0p4d));
    spill1737_0 = __call1737_3();
    life6_16 = __call1737_5((__fieldRead1737_4(p0) / 0x1.0p4d));
    life4_17 = spill1737_0;
    life7_20 = __integerCategory1737_7(__fieldRead1737_6(p0));
    spill1737_1 = __instanceOf1737_8(p0);
    if (!((life4_17 == null))) {
        forwardValue1737_29_0 = spill1737_1;
        break forward_join_29;
    }
    if (!((spill1737_1 != 0))) {
        break forward_join_28;
    }
    life7_20 = 1;
    }
    forwardValue1737_29_0 = life7_20;
    }
    if (!((life4_17 == null))) {
        forwardValue1737_44_0 = forwardValue1737_29_0;
        break forward_join_44;
    }
    if (!((forwardValue1737_29_0 == 0))) {
        break forward_join_42;
    }
    spill1737_2 = __call1737_9(receiver, life5_9, life6_16, 1);
    if (!((life4_17 == null))) {
        forwardValue1737_44_0 = __integerCategory1737_10(spill1737_2);
        break forward_join_44;
    }
    if (!((!spill1737_2))) {
        break forward_join_42;
    }
    return __integerCategory1737_11(0);
    }
    forwardValue1737_44_0 = __instanceOf1737_12(p0);
    }
    if (!((life4_17 == null))) {
        forwardValue1737_72_0 = forwardValue1737_44_0;
        break forward_join_72;
    }
    if (!((forwardValue1737_44_0 != 0))) {
        break forward_join_57;
    }
    life8_66 = __cast1737_13(p0);
    __call1737_15(__fieldRead1737_14(receiver), life8_66);
    __call1737_16(receiver);
    }
    __call1737_18(__call1737_17(receiver, life5_9, life6_16), p0);
    __call1737_20(__fieldRead1737_19(receiver), p0);
    __call1737_21(receiver, p0);
    forwardValue1737_72_0 = 1;
    }
    return __integerCategory1737_22(forwardValue1737_72_0);
}
public static void h1737_0(moom.Oo p0) throws Throwable {
    throw __call1173700_0(p0);
}
public static void h1737_1(moom.Oo p0) throws Throwable {
    throw __call1173701_0(p0);
}
public static void h1737_2(moom.Oo p0) throws Throwable {
    throw __call1173702_0(p0);
}
public static void h1737_3(moom.Oo p0) throws Throwable {
    throw __call1173703_0(p0);
}
public static void h1737_4(moom.Oo p0) throws Throwable {
    throw __call1173704_0(p0);
}
public static void h1737_5(moom.Oo p0) throws Throwable {
    throw __call1173705_0(p0);
}
private static native long __fieldRead1737_0() throws Throwable;
private static native double __fieldRead1737_1(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1737_2(double a0) throws Throwable;
private static native java.lang.String __call1737_3() throws Throwable;
private static native double __fieldRead1737_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1737_5(double a0) throws Throwable;
private static native boolean __fieldRead1737_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory1737_7(boolean value) throws Throwable;
private static native int __instanceOf1737_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1737_9(net.minecraft.world.World a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory1737_10(boolean value) throws Throwable;
private static native boolean __integerCategory1737_11(int value) throws Throwable;
private static native int __instanceOf1737_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1737_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.List __fieldRead1737_14(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1737_15(java.util.List a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native void __call1737_16(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1737_17(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native void __call1737_18(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.util.List __fieldRead1737_19(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1737_20(java.util.List a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __call1737_21(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native boolean __integerCategory1737_22(int value) throws Throwable;
private static native java.lang.Throwable __call1173700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173705_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f553378c4f8320ab9a28(net.minecraft.world.World a0) throws E;
private static final class __SourceHandler_f553378c4f8320ab9a28 {

public static void f718(net.minecraft.world.World receiver) throws Throwable {
    java.lang.Object forestValue718_47_0;
    int forestValue718_92_0;
    net.minecraft.world.World forestValue718_96_0;
    int forestValue718_96_1;
    int forestValue718_96_2;
    int forestValue718_120_0;
    net.minecraft.entity.Entity forestValue718_183_0;
    net.minecraft.entity.Entity forestValue718_190_0;
    int forestValue718_208_0;
    java.lang.Object forestValue718_239_0;
    net.minecraft.world.World forestValue718_241_0;
    moom.A9 forestValue718_245_0;
    int forestValue718_300_0;
    int forestValue718_316_0;
    net.minecraft.world.World forestValue718_320_0;
    moom.DT forestValue718_320_1;
    int forestValue718_332_0;
    int forestValue718_359_0;
    int forestValue718_382_0;
    int forestValue718_395_0;
    net.minecraft.world.World forestValue718_407_0;
    moom.DT forestValue718_407_1;
    net.minecraft.world.World forestValue718_417_0;
    java.lang.String spill718_0;
    net.minecraft.entity.Entity spill718_1;
    boolean spill718_2;
    net.minecraft.world.World spill718_3;
    int spill718_4;
    int spill718_5;
    boolean spill718_6;
    net.minecraft.entity.Entity spill718_7;
    net.minecraft.entity.Entity spill718_8;
    net.minecraft.entity.Entity spill718_9;
    boolean spill718_10;
    moom.A9 spill718_11;
    net.minecraft.entity.Entity spill718_12;
    net.minecraft.world.World spill718_13;
    boolean spill718_14;
    boolean spill718_15;
    boolean spill718_16;
    boolean spill718_17;
    net.minecraft.world.World spill718_18;
    moom.DT spill718_19;
    net.minecraft.world.World spill718_20;
    boolean spill718_21;
    net.minecraft.world.World spill718_22;
    moom.DT spill718_23;
    long life1_3;
    java.lang.String life3_13;
    int life4_15;
    net.minecraft.entity.Entity life5_28;
    java.util.Iterator life4_75;
    net.minecraft.entity.Entity life5_84;
    int life6_87;
    int life7_90;
    java.util.Iterator life4_129;
    net.minecraft.entity.Entity life5_139;
    net.minecraft.entity.Entity life5_154;
    int life4_178;
    net.minecraft.entity.Entity life5_191;
    int life6_272;
    int life7_275;
    java.util.Iterator life4_335;
    net.minecraft.tileentity.TileEntity life5_344;
    moom.DT life6_368;
    java.util.Iterator life5_477;
    net.minecraft.tileentity.TileEntity life6_486;
    forest_join_419: {
    forest_join_417: {
    forest_join_413: {
    forest_join_410: {
    forest_join_359: {
    forest_join_350: {
    forest_join_332: {
    forest_join_326: {
    forest_join_256: {
    forest_join_249: {
    forest_join_143: {
    forest_join_136: {
    forest_join_120: {
    forest_join_101: {
    forest_join_61: {
    forest_join_51: {
    life1_3 = (__fieldRead718_0() ^ 64177181622537L);
    __call718_2(__fieldRead718_1(receiver), "entities");
    spill718_0 = __call718_3();
    __call718_5(__fieldRead718_4(receiver), "global");
    life3_13 = spill718_0;
    life4_15 = 0;
    forest_cycle_16: while (true) {
    forest_join_48: {
    forest_join_47: {
    if (!((life4_15 < __call718_7(__fieldRead718_6(receiver))))) {
        break forest_join_51;
    }
    life5_28 = __cast718_10(__call718_9(__fieldRead718_8(receiver), life4_15));
    net.minecraft.entity.Entity __stackOp718_11_0 = life5_28;
    __fieldWrite718_13(__stackOp718_11_0, (__fieldRead718_12(__stackOp718_11_0) + 1));
    __call718_14(life5_28);
    if (!((life3_13 == null))) {
        break forest_join_61;
    }
    spill718_1 = life5_28;
    if (!((life3_13 == null))) {
        forestValue718_47_0 = spill718_1;
        break forest_join_47;
    }
    if (!(__fieldRead718_15(spill718_1))) {
        break forest_join_48;
    }
    forestValue718_47_0 = __call718_17(__fieldRead718_16(receiver), (life4_15--));
    }
    __discardScalar718_18(forestValue718_47_0);
    }
    life4_15 += 1;
    if (!((life3_13 != null))) {
        continue forest_cycle_16;
    }
    break forest_cycle_16;
    }
    }
    __call718_20(__fieldRead718_19(receiver), "remove");
    __call718_23(__fieldRead718_21(receiver), __fieldRead718_22(receiver));
    }
    life4_75 = __call718_25(__fieldRead718_24(receiver));
    forest_cycle_65: while (true) {
    forest_join_99: {
    forest_join_96: {
    forest_join_92: {
    if (!(__call718_26(life4_75))) {
        break forest_join_101;
    }
    life5_84 = __cast718_28(__call718_27(life4_75));
    life6_87 = __fieldRead718_29(life5_84);
    life7_90 = __fieldRead718_30(life5_84);
    spill718_2 = __fieldRead718_31(life5_84);
    if (!((life3_13 == null))) {
        forestValue718_120_0 = __integerCategory718_32(spill718_2);
        break forest_join_120;
    }
    if (!((life3_13 == null))) {
        forestValue718_92_0 = __integerCategory718_33(spill718_2);
        break forest_join_92;
    }
    if (!(spill718_2)) {
        break forest_join_99;
    }
    spill718_3 = receiver;
    spill718_4 = life6_87;
    spill718_5 = life7_90;
    if (!((life3_13 == null))) {
        forestValue718_96_0 = spill718_3;
        forestValue718_96_1 = spill718_4;
        forestValue718_96_2 = spill718_5;
        break forest_join_96;
    }
    forestValue718_92_0 = __integerCategory718_35(__call718_34(spill718_3, spill718_4, spill718_5, 1));
    }
    if (!((forestValue718_92_0 != 0))) {
        break forest_join_99;
    }
    forestValue718_96_0 = receiver;
    forestValue718_96_1 = life6_87;
    forestValue718_96_2 = life7_90;
    }
    __call718_37(__call718_36(forestValue718_96_0, forestValue718_96_1, forestValue718_96_2), life5_84);
    }
    if (!((life3_13 != null))) {
        continue forest_cycle_65;
    }
    break forest_cycle_65;
    }
    }
    life4_129 = __call718_39(__fieldRead718_38(receiver));
    forest_cycle_105: while (true) {
    if (!(__call718_40(life4_129))) {
        break forest_join_136;
    }
    life5_139 = __cast718_42(__call718_41(life4_129));
    __call718_43(receiver, life5_139);
    if (!((life3_13 == null))) {
        break forest_join_143;
    }
    if (!((life3_13 != null))) {
        continue forest_cycle_105;
    }
    break forest_cycle_105;
    }
    break forest_join_136;
    }
    forest_cycle_120: while (true) {
    forest_join_133: {
    if (!((forestValue718_120_0 != 0))) {
        break forest_join_136;
    }
    life5_154 = __cast718_45(__call718_44(life4_75));
    __call718_46(receiver, life5_154);
    if (!((life3_13 == null))) {
        break forest_join_143;
    }
    if (!((life3_13 != null))) {
        break forest_join_133;
    }
    break forest_join_136;
    }
    spill718_6 = __call718_47(life4_75);
    forestValue718_120_0 = __integerCategory718_48(spill718_6);
    continue forest_cycle_120;
    }
    }
    __call718_50(__fieldRead718_49(receiver));
    __call718_52(__fieldRead718_51(receiver), "regular");
    }
    life4_178 = 0;
    forest_cycle_145: while (true) {
    forest_join_246: {
    forest_join_245: {
    forest_join_243: {
    forest_join_241: {
    forest_join_239: {
    forest_join_234: {
    forest_join_208: {
    forest_join_197: {
    forest_join_190: {
    forest_join_185: {
    forest_join_183: {
    forest_join_178: {
    if (!((life4_178 < __call718_54(__fieldRead718_53(receiver))))) {
        break forest_join_249;
    }
    life5_191 = __cast718_57(__call718_56(__fieldRead718_55(receiver), life4_178));
    if (!((life3_13 == null))) {
        break forest_join_256;
    }
    spill718_7 = __fieldRead718_58(life5_191);
    if (!((life3_13 == null))) {
        forestValue718_190_0 = spill718_7;
        break forest_join_190;
    }
    if (!((spill718_7 != null))) {
        break forest_join_185;
    }
    spill718_8 = __fieldRead718_59(life5_191);
    if (!((life3_13 == null))) {
        forestValue718_183_0 = spill718_8;
        break forest_join_183;
    }
    if (!((!__fieldRead718_60(spill718_8)))) {
        break forest_join_178;
    }
    spill718_9 = __fieldRead718_62(__fieldRead718_61(life5_191));
    if (!((life3_13 == null))) {
        forestValue718_183_0 = spill718_9;
        break forest_join_183;
    }
    if (!((spill718_9 == life5_191))) {
        break forest_join_178;
    }
    if (!((life3_13 != null))) {
        break forest_join_246;
    }
    }
    __fieldWrite718_64(__fieldRead718_63(life5_191), null);
    forestValue718_183_0 = life5_191;
    }
    __fieldWrite718_65(forestValue718_183_0, null);
    }
    __call718_67(__fieldRead718_66(receiver), "tick");
    forestValue718_190_0 = life5_191;
    }
    spill718_10 = __fieldRead718_68(forestValue718_190_0);
    if (!((life3_13 == null))) {
        forestValue718_208_0 = __integerCategory718_69(spill718_10);
        break forest_join_208;
    }
    if (!((!spill718_10))) {
        break forest_join_197;
    }
    __call718_70(receiver, life5_191);
    }
    __call718_72(__fieldRead718_71(receiver));
    spill718_11 = __fieldRead718_73(receiver);
    if (!((life3_13 == null))) {
        forestValue718_245_0 = spill718_11;
        break forest_join_245;
    }
    __call718_74(spill718_11, "remove");
    forestValue718_208_0 = __integerCategory718_76(__fieldRead718_75(life5_191));
    }
    if (!((forestValue718_208_0 != 0))) {
        break forest_join_243;
    }
    life6_272 = __fieldRead718_77(life5_191);
    life7_275 = __fieldRead718_78(life5_191);
    spill718_12 = life5_191;
    if (!((life3_13 == null))) {
        forestValue718_239_0 = spill718_12;
        break forest_join_239;
    }
    if (!(__fieldRead718_79(spill718_12))) {
        break forest_join_234;
    }
    spill718_13 = receiver;
    if (!((life3_13 == null))) {
        forestValue718_241_0 = spill718_13;
        break forest_join_241;
    }
    if (!(__call718_80(spill718_13, life6_272, life7_275, 1))) {
        break forest_join_234;
    }
    __call718_82(__call718_81(receiver, life6_272, life7_275), life5_191);
    }
    forestValue718_239_0 = __call718_84(__fieldRead718_83(receiver), (life4_178--));
    }
    __discardScalar718_85(forestValue718_239_0);
    forestValue718_241_0 = receiver;
    }
    __call718_86(forestValue718_241_0, life5_191);
    }
    forestValue718_245_0 = __fieldRead718_87(receiver);
    }
    __call718_88(forestValue718_245_0);
    }
    life4_178 += 1;
    if (!((life3_13 != null))) {
        continue forest_cycle_145;
    }
    break forest_cycle_145;
    }
    }
    __call718_90(__fieldRead718_89(receiver), "blockEntities");
    __fieldWrite718_91(receiver, 1);
    }
    life4_335 = __call718_93(__fieldRead718_92(receiver));
    forest_cycle_260: while (true) {
    forest_join_324: {
    forest_join_320: {
    forest_join_316: {
    forest_join_300: {
    forest_join_298: {
    if (!(__call718_94(life4_335))) {
        break forest_join_326;
    }
    life5_344 = __cast718_96(__call718_95(life4_335));
    spill718_14 = __call718_97(life5_344);
    if (!((life3_13 == null))) {
        forestValue718_332_0 = __integerCategory718_98(spill718_14);
        break forest_join_332;
    }
    if (!((life3_13 == null))) {
        forestValue718_300_0 = __integerCategory718_99(spill718_14);
        break forest_join_300;
    }
    if (!((!spill718_14))) {
        break forest_join_298;
    }
    spill718_15 = __call718_100(life5_344);
    if (!((life3_13 == null))) {
        forestValue718_300_0 = __integerCategory718_101(spill718_15);
        break forest_join_300;
    }
    if (!(spill718_15)) {
        break forest_join_298;
    }
    life6_368 = __call718_102(life5_344);
    spill718_16 = __call718_103(receiver, life6_368);
    if (!((life3_13 == null))) {
        forestValue718_300_0 = __integerCategory718_104(spill718_16);
        break forest_join_300;
    }
    if (!(spill718_16)) {
        break forest_join_298;
    }
    spill718_17 = __call718_106(__fieldRead718_105(receiver), life6_368);
    if (!((life3_13 == null))) {
        forestValue718_300_0 = __integerCategory718_107(spill718_17);
        break forest_join_300;
    }
    if (!(spill718_17)) {
        break forest_join_298;
    }
    __call718_109(__cast718_108(life5_344));
    }
    forestValue718_300_0 = __integerCategory718_111(__call718_110(life5_344));
    }
    if (!((life3_13 == null))) {
        forestValue718_316_0 = forestValue718_300_0;
        break forest_join_316;
    }
    if (!((forestValue718_300_0 != 0))) {
        break forest_join_324;
    }
    __call718_112(life4_335);
    __call718_114(__fieldRead718_113(receiver), life5_344);
    spill718_18 = receiver;
    spill718_19 = __call718_115(life5_344);
    if (!((life3_13 == null))) {
        forestValue718_320_0 = spill718_18;
        forestValue718_320_1 = spill718_19;
        break forest_join_320;
    }
    forestValue718_316_0 = __integerCategory718_117(__call718_116(spill718_18, spill718_19));
    }
    if (!((forestValue718_316_0 != 0))) {
        break forest_join_324;
    }
    forestValue718_320_0 = receiver;
    forestValue718_320_1 = __call718_118(life5_344);
    }
    __call718_121(__call718_119(forestValue718_320_0, forestValue718_320_1), __call718_120(life5_344));
    }
    if (!((life3_13 != null))) {
        continue forest_cycle_260;
    }
    break forest_cycle_260;
    }
    }
    __fieldWrite718_122(receiver, 0);
    forestValue718_332_0 = __integerCategory718_125(__call718_124(__fieldRead718_123(receiver)));
    }
    if (!((life3_13 == null))) {
        forestValue718_359_0 = forestValue718_332_0;
        break forest_join_359;
    }
    if (!((forestValue718_332_0 == 0))) {
        break forest_join_350;
    }
    __call718_128(__fieldRead718_126(receiver), __fieldRead718_127(receiver));
    __call718_131(__fieldRead718_129(receiver), __fieldRead718_130(receiver));
    __call718_133(__fieldRead718_132(receiver));
    }
    __call718_135(__fieldRead718_134(receiver), "pendingBlockEntities");
    spill718_20 = receiver;
    if (!((life3_13 == null))) {
        forestValue718_417_0 = spill718_20;
        break forest_join_417;
    }
    forestValue718_359_0 = __integerCategory718_138(__call718_137(__fieldRead718_136(spill718_20)));
    }
    if (!((forestValue718_359_0 == 0))) {
        break forest_join_413;
    }
    life5_477 = __call718_140(__fieldRead718_139(receiver));
    forest_cycle_364: while (true) {
    forest_join_408: {
    forest_join_407: {
    forest_join_404: {
    forest_join_395: {
    forest_join_389: {
    forest_join_382: {
    if (!(__call718_141(life5_477))) {
        break forest_join_410;
    }
    life6_486 = __cast718_143(__call718_142(life5_477));
    if (!((life3_13 == null))) {
        break forest_join_419;
    }
    spill718_21 = __call718_144(life6_486);
    if (!((life3_13 == null))) {
        forestValue718_382_0 = __integerCategory718_145(spill718_21);
        break forest_join_382;
    }
    if (!((!spill718_21))) {
        break forest_join_408;
    }
    forestValue718_382_0 = __integerCategory718_148(__call718_147(__fieldRead718_146(receiver), life6_486));
    }
    if (!((life3_13 == null))) {
        forestValue718_395_0 = forestValue718_382_0;
        break forest_join_395;
    }
    if (!((forestValue718_382_0 == 0))) {
        break forest_join_389;
    }
    __call718_149(receiver, life6_486);
    }
    spill718_22 = receiver;
    spill718_23 = __call718_150(life6_486);
    if (!((life3_13 == null))) {
        forestValue718_407_0 = spill718_22;
        forestValue718_407_1 = spill718_23;
        break forest_join_407;
    }
    forestValue718_395_0 = __integerCategory718_152(__call718_151(spill718_22, spill718_23));
    }
    if (!((forestValue718_395_0 != 0))) {
        break forest_join_404;
    }
    __call718_156(__call718_154(receiver, __call718_153(life6_486)), __call718_155(life6_486), life6_486);
    }
    forestValue718_407_0 = receiver;
    forestValue718_407_1 = __call718_157(life6_486);
    }
    __call718_158(forestValue718_407_0, forestValue718_407_1);
    }
    if (!((life3_13 != null))) {
        continue forest_cycle_364;
    }
    break forest_cycle_364;
    }
    }
    __call718_160(__fieldRead718_159(receiver));
    }
    __call718_162(__fieldRead718_161(receiver));
    forestValue718_417_0 = receiver;
    }
    __call718_164(__fieldRead718_163(forestValue718_417_0));
    }
    return;
}
public static void h718_0(java.lang.Throwable p0, java.lang.String p1, net.minecraft.entity.Entity p2) throws Throwable {
    net.minecraft.entity.Entity forestValue3071800_21_0;
    net.minecraft.entity.Entity spill3071800_0;
    java.lang.Throwable life3_2;
    moom.qY life4_6;
    moom.qZ life5_10;
    forest_join_23: {
    forest_join_21: {
    forest_join_20: {
    life3_2 = p0;
    life4_6 = __call3071800_0(life3_2, "Ticking entity");
    life5_10 = __call3071800_1(life4_6, "Entity being ticked");
    spill3071800_0 = p2;
    if (!((p1 == null))) {
        forestValue3071800_21_0 = spill3071800_0;
        break forest_join_21;
    }
    if (!((spill3071800_0 == null))) {
        break forest_join_20;
    }
    __call3071800_2(life5_10, "Entity", "~~NULL~~");
    if (!((p1 != null))) {
        break forest_join_23;
    }
    }
    forestValue3071800_21_0 = p2;
    }
    __call3071800_3(forestValue3071800_21_0, life5_10);
    }
    throw new moom.Oo(life4_6);
}
public static void h718_1(java.lang.Throwable p0) throws Throwable {
    throw __call3071801_0(p0);
}
public static void h718_2(java.lang.Throwable p0) throws Throwable {
    throw __call3071802_0(p0);
}
public static void h718_3(java.lang.Throwable p0) throws Throwable {
    throw __call3071803_0(p0);
}
public static void h718_4(java.lang.Throwable p0) throws Throwable {
    throw __call3071804_0(p0);
}
public static void h718_5(java.lang.Throwable p0) throws Throwable {
    throw __call3071805_0(p0);
}
public static void h718_6(java.lang.Throwable p0) throws Throwable {
    throw __call3071806_0(p0);
}
public static void h718_7(java.lang.Throwable p0) throws Throwable {
    throw __call3071807_0(p0);
}
public static void h718_8(java.lang.Throwable p0) throws Throwable {
    throw __call3071808_0(p0);
}
public static void h718_9(java.lang.Throwable p0) throws Throwable {
    throw __call3071809_0(p0);
}
public static void h718_10(java.lang.Throwable p0) throws Throwable {
    throw __call3071810_0(p0);
}
public static void h718_11(java.lang.Throwable p0) throws Throwable {
    throw __call3071811_0(p0);
}
public static void h718_12(java.lang.Throwable p0) throws Throwable {
    throw __call3071812_0(p0);
}
public static void h718_13(java.lang.Throwable p0) throws Throwable {
    throw __call3071813_0(p0);
}
public static void h718_14(java.lang.Throwable p0) throws Throwable {
    throw __call3071814_0(p0);
}
public static void h718_15(java.lang.Throwable p0) throws Throwable {
    throw __call3071815_0(p0);
}
public static void h718_16(java.lang.Throwable p0) throws Throwable {
    throw __call3071816_0(p0);
}
public static void h718_17(java.lang.Throwable p0) throws Throwable {
    throw __call3071817_0(p0);
}
public static void h718_18(java.lang.Throwable p0) throws Throwable {
    throw __call3071818_0(p0);
}
public static void h718_19(java.lang.Throwable p0) throws Throwable {
    throw __call3071819_0(p0);
}
public static void h718_20(java.lang.Throwable p0) throws Throwable {
    throw __call3071820_0(p0);
}
public static void h718_21(java.lang.Throwable p0, net.minecraft.entity.Entity p1) throws Throwable {
    java.lang.Throwable life2_2;
    moom.qY life3_6;
    moom.qZ life4_10;
    life2_2 = p0;
    life3_6 = __call3071821_0(life2_2, "Ticking entity");
    life4_10 = __call3071821_1(life3_6, "Entity being ticked");
    __call3071821_2(p1, life4_10);
    throw new moom.Oo(life3_6);
}
public static void h718_22(java.lang.Throwable p0) throws Throwable {
    throw __call3071822_0(p0);
}
public static void h718_23(java.lang.Throwable p0) throws Throwable {
    throw __call3071823_0(p0);
}
public static void h718_24(java.lang.Throwable p0) throws Throwable {
    throw __call3071824_0(p0);
}
public static void h718_25(java.lang.Throwable p0) throws Throwable {
    throw __call3071825_0(p0);
}
public static void h718_26(java.lang.Throwable p0) throws Throwable {
    throw __call3071826_0(p0);
}
public static void h718_27(java.lang.Throwable p0) throws Throwable {
    throw __call3071827_0(p0);
}
public static void h718_28(java.lang.Throwable p0) throws Throwable {
    throw __call3071828_0(p0);
}
public static void h718_29(java.lang.Throwable p0) throws Throwable {
    throw __call3071829_0(p0);
}
public static void h718_30(java.lang.Throwable p0) throws Throwable {
    throw __call3071830_0(p0);
}
public static void h718_31(java.lang.Throwable p0) throws Throwable {
    throw __call3071831_0(p0);
}
public static void h718_32(java.lang.Throwable p0) throws Throwable {
    throw __call3071832_0(p0);
}
public static void h718_33(java.lang.Throwable p0) throws Throwable {
    throw __call3071833_0(p0);
}
public static void h718_34(java.lang.Throwable p0, net.minecraft.tileentity.TileEntity p1) throws Throwable {
    java.lang.Throwable life2_2;
    moom.qY life3_6;
    moom.qZ life4_10;
    life2_2 = p0;
    life3_6 = __call3071834_0(life2_2, "Ticking block entity");
    life4_10 = __call3071834_1(life3_6, "Block entity being ticked");
    __call3071834_2(p1, life4_10);
    throw new moom.Oo(life3_6);
}
public static void h718_35(java.lang.Throwable p0) throws Throwable {
    throw __call3071835_0(p0);
}
public static void h718_36(java.lang.Throwable p0) throws Throwable {
    throw __call3071836_0(p0);
}
public static void h718_37(java.lang.Throwable p0) throws Throwable {
    throw __call3071837_0(p0);
}
public static void h718_38(java.lang.Throwable p0) throws Throwable {
    throw __call3071838_0(p0);
}
public static void h718_39(java.lang.Throwable p0) throws Throwable {
    throw __call3071839_0(p0);
}
public static void h718_40(java.lang.Throwable p0) throws Throwable {
    throw __call3071840_0(p0);
}
public static void h718_41(java.lang.Throwable p0) throws Throwable {
    throw __call3071841_0(p0);
}
public static void h718_42(java.lang.Throwable p0) throws Throwable {
    throw __call3071842_0(p0);
}
public static void h718_43(java.lang.Throwable p0) throws Throwable {
    throw __call3071843_0(p0);
}
public static void h718_44(java.lang.Throwable p0) throws Throwable {
    throw __call3071844_0(p0);
}
public static void h718_45(java.lang.Throwable p0) throws Throwable {
    throw __call3071845_0(p0);
}
public static void h718_46(java.lang.Throwable p0) throws Throwable {
    throw __call3071846_0(p0);
}
public static void h718_47(java.lang.Throwable p0) throws Throwable {
    throw __call3071847_0(p0);
}
public static void h718_48(java.lang.Throwable p0) throws Throwable {
    throw __call3071848_0(p0);
}
private static native long __fieldRead718_0() throws Throwable;
private static native moom.A9 __fieldRead718_1(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_2(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call718_3() throws Throwable;
private static native moom.A9 __fieldRead718_4(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_5(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead718_6(net.minecraft.world.World a0) throws Throwable;
private static native int __call718_7(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead718_8(net.minecraft.world.World a0) throws Throwable;
private static native java.lang.Object __call718_9(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __cast718_10(java.lang.Object a0) throws Throwable;
private static native int __fieldRead718_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite718_13(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __call718_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead718_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.List __fieldRead718_16(net.minecraft.world.World a0) throws Throwable;
private static native java.lang.Object __call718_17(java.util.List a0, int a1) throws Throwable;
private static native void __discardScalar718_18(java.lang.Object a0) throws Throwable;
private static native moom.A9 __fieldRead718_19(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_20(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead718_21(net.minecraft.world.World a0) throws Throwable;
private static native java.util.List __fieldRead718_22(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call718_23(java.util.List a0, java.util.List a1) throws Throwable;
private static native java.util.List __fieldRead718_24(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call718_25(java.util.List a0) throws Throwable;
private static native boolean __call718_26(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call718_27(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast718_28(java.lang.Object a0) throws Throwable;
private static native int __fieldRead718_29(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead718_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead718_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory718_32(boolean value) throws Throwable;
private static native int __integerCategory718_33(boolean value) throws Throwable;
private static native boolean __call718_34(net.minecraft.world.World a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory718_35(boolean value) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call718_36(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native void __call718_37(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.util.List __fieldRead718_38(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call718_39(java.util.List a0) throws Throwable;
private static native boolean __call718_40(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call718_41(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast718_42(java.lang.Object a0) throws Throwable;
private static native void __call718_43(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.lang.Object __call718_44(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast718_45(java.lang.Object a0) throws Throwable;
private static native void __call718_46(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native boolean __call718_47(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory718_48(boolean value) throws Throwable;
private static native java.util.List __fieldRead718_49(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_50(java.util.List a0) throws Throwable;
private static native moom.A9 __fieldRead718_51(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_52(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead718_53(net.minecraft.world.World a0) throws Throwable;
private static native int __call718_54(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead718_55(net.minecraft.world.World a0) throws Throwable;
private static native java.lang.Object __call718_56(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __cast718_57(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead718_58(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead718_59(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead718_60(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead718_61(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead718_62(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead718_63(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite718_64(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite718_65(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native moom.A9 __fieldRead718_66(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_67(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead718_68(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory718_69(boolean value) throws Throwable;
private static native void __call718_70(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native moom.A9 __fieldRead718_71(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_72(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead718_73(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_74(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead718_75(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory718_76(boolean value) throws Throwable;
private static native int __fieldRead718_77(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead718_78(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead718_79(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call718_80(net.minecraft.world.World a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call718_81(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native void __call718_82(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.util.List __fieldRead718_83(net.minecraft.world.World a0) throws Throwable;
private static native java.lang.Object __call718_84(java.util.List a0, int a1) throws Throwable;
private static native void __discardScalar718_85(java.lang.Object a0) throws Throwable;
private static native void __call718_86(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native moom.A9 __fieldRead718_87(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_88(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead718_89(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_90(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite718_91(net.minecraft.world.World a0, int a1) throws Throwable;
private static native java.util.List __fieldRead718_92(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call718_93(java.util.List a0) throws Throwable;
private static native boolean __call718_94(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call718_95(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast718_96(java.lang.Object a0) throws Throwable;
private static native boolean __call718_97(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __integerCategory718_98(boolean value) throws Throwable;
private static native int __integerCategory718_99(boolean value) throws Throwable;
private static native boolean __call718_100(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __integerCategory718_101(boolean value) throws Throwable;
private static native moom.DT __call718_102(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native boolean __call718_103(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory718_104(boolean value) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __fieldRead718_105(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call718_106(net.minecraft.world.border.WorldBorder a0, moom.DT a1) throws Throwable;
private static native int __integerCategory718_107(boolean value) throws Throwable;
private static native net.minecraft.util.ITickable __cast718_108(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call718_109(net.minecraft.util.ITickable a0) throws Throwable;
private static native boolean __call718_110(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __integerCategory718_111(boolean value) throws Throwable;
private static native void __call718_112(java.util.Iterator a0) throws Throwable;
private static native java.util.List __fieldRead718_113(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call718_114(java.util.List a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native moom.DT __call718_115(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native boolean __call718_116(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory718_117(boolean value) throws Throwable;
private static native moom.DT __call718_118(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call718_119(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native moom.DT __call718_120(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call718_121(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native void __fieldWrite718_122(net.minecraft.world.World a0, int a1) throws Throwable;
private static native java.util.List __fieldRead718_123(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call718_124(java.util.List a0) throws Throwable;
private static native int __integerCategory718_125(boolean value) throws Throwable;
private static native java.util.List __fieldRead718_126(net.minecraft.world.World a0) throws Throwable;
private static native java.util.List __fieldRead718_127(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call718_128(java.util.List a0, java.util.List a1) throws Throwable;
private static native java.util.List __fieldRead718_129(net.minecraft.world.World a0) throws Throwable;
private static native java.util.List __fieldRead718_130(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call718_131(java.util.List a0, java.util.List a1) throws Throwable;
private static native java.util.List __fieldRead718_132(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_133(java.util.List a0) throws Throwable;
private static native moom.A9 __fieldRead718_134(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_135(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead718_136(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call718_137(java.util.List a0) throws Throwable;
private static native int __integerCategory718_138(boolean value) throws Throwable;
private static native java.util.List __fieldRead718_139(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call718_140(java.util.List a0) throws Throwable;
private static native boolean __call718_141(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call718_142(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast718_143(java.lang.Object a0) throws Throwable;
private static native boolean __call718_144(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __integerCategory718_145(boolean value) throws Throwable;
private static native java.util.List __fieldRead718_146(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call718_147(java.util.List a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native int __integerCategory718_148(boolean value) throws Throwable;
private static native boolean __call718_149(net.minecraft.world.World a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native moom.DT __call718_150(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native boolean __call718_151(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory718_152(boolean value) throws Throwable;
private static native moom.DT __call718_153(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call718_154(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native moom.DT __call718_155(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call718_156(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.tileentity.TileEntity a2) throws Throwable;
private static native moom.DT __call718_157(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call718_158(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native java.util.List __fieldRead718_159(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_160(java.util.List a0) throws Throwable;
private static native moom.A9 __fieldRead718_161(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_162(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead718_163(net.minecraft.world.World a0) throws Throwable;
private static native void __call718_164(moom.A9 a0) throws Throwable;
private static native moom.qY __call3071800_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3071800_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call3071800_2(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call3071800_3(net.minecraft.entity.Entity a0, moom.qZ a1) throws Throwable;
private static native java.lang.Throwable __call3071801_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071802_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071803_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071804_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071805_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071806_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071807_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071808_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071809_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071810_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071811_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071812_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071813_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071814_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071815_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071816_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071817_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071818_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071819_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071820_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3071821_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3071821_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call3071821_2(net.minecraft.entity.Entity a0, moom.qZ a1) throws Throwable;
private static native java.lang.Throwable __call3071822_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071823_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071824_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071825_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071826_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071827_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071828_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071829_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071830_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071831_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071832_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071833_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3071834_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3071834_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call3071834_2(net.minecraft.tileentity.TileEntity a0, moom.qZ a1) throws Throwable;
private static native java.lang.Throwable __call3071835_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071836_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071837_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071838_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071839_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071840_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071841_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071842_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071843_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071844_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071845_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071846_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071847_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071848_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_711872e055731f9d4d2a(net.minecraft.world.World a0, moom.CA a1) throws E;
private static final class __SourceHandler_711872e055731f9d4d2a {

public static boolean f1146(net.minecraft.world.World receiver, moom.CA p0) throws Throwable {
    int forestValue1146_37_0;
    int forestValue1146_44_0;
    int forestValue1146_84_0;
    java.lang.String spill1146_0;
    int spill1146_1;
    int spill1146_2;
    boolean spill1146_3;
    long life2_3;
    int life5_7;
    int life6_11;
    int life7_15;
    int life8_20;
    int life9_24;
    int life10_28;
    java.lang.String life4_29;
    moom.DU life11_33;
    int life12_35;
    int life13_42;
    int life14_49;
    net.minecraft.block.Block life15_61;
    forest_join_84: {
    forest_join_83: {
    forest_join_81: {
    life2_3 = (__fieldRead1146_0() ^ 7378756911814L);
    life5_7 = __call1146_2(__fieldRead1146_1(p0));
    life6_11 = __call1146_4(__fieldRead1146_3(p0));
    life7_15 = __call1146_6(__fieldRead1146_5(p0));
    spill1146_0 = __call1146_7();
    life8_20 = __call1146_9(__fieldRead1146_8(p0));
    life9_24 = __call1146_11(__fieldRead1146_10(p0));
    life10_28 = __call1146_13(__fieldRead1146_12(p0));
    life4_29 = spill1146_0;
    life11_33 = new moom.DU();
    life12_35 = life5_7;
    forest_cycle_36: while (true) {
    forest_join_77: {
    forestValue1146_37_0 = life12_35;
    forest_cycle_37: while (true) {
    if (!((forestValue1146_37_0 <= life6_11))) {
        break forest_join_83;
    }
    spill1146_1 = life7_15;
    if (!((life4_29 == null))) {
        forestValue1146_84_0 = spill1146_1;
        break forest_join_84;
    }
    life13_42 = spill1146_1;
    forest_cycle_43: while (true) {
    forest_join_74: {
    forestValue1146_44_0 = life13_42;
    forest_cycle_44: while (true) {
    if (!((forestValue1146_44_0 <= life8_20))) {
        break forest_join_77;
    }
    spill1146_2 = life9_24;
    if (!((life4_29 == null))) {
        forestValue1146_37_0 = spill1146_2;
        continue forest_cycle_37;
    }
    life14_49 = spill1146_2;
    forest_cycle_50: while (true) {
    forest_join_72: {
    forest_join_71: {
    if (!((life14_49 <= life10_28))) {
        break forest_join_74;
    }
    life15_61 = __call1146_16(__call1146_15(receiver, __call1146_14(life11_33, life12_35, life13_42, life14_49)));
    if (!((life4_29 == null))) {
        break forest_join_72;
    }
    spill1146_3 = __call1146_18(__call1146_17(life15_61));
    if (!((life4_29 == null))) {
        forestValue1146_44_0 = __integerCategory1146_19(spill1146_3);
        continue forest_cycle_44;
    }
    if (!(spill1146_3)) {
        break forest_join_71;
    }
    break forest_join_81;
    }
    life14_49 += 1;
    }
    if (!((life4_29 != null))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    break forest_cycle_44;
    }
    }
    life13_42 += 1;
    if (!((life4_29 != null))) {
        continue forest_cycle_43;
    }
    break forest_cycle_43;
    }
    break forest_cycle_37;
    }
    }
    life12_35 += 1;
    if (!((life4_29 != null))) {
        continue forest_cycle_36;
    }
    break forest_cycle_36;
    }
    break forest_join_83;
    }
    return __integerCategory1146_20(1);
    }
    forestValue1146_84_0 = 0;
    }
    return __integerCategory1146_21(forestValue1146_84_0);
}
public static boolean h1146_0(moom.Oo p0) throws Throwable {
    throw __call3114600_0(p0);
}
public static boolean h1146_1(moom.Oo p0) throws Throwable {
    throw __call3114601_0(p0);
}
private static native long __fieldRead1146_0() throws Throwable;
private static native double __fieldRead1146_1(moom.CA a0) throws Throwable;
private static native int __call1146_2(double a0) throws Throwable;
private static native double __fieldRead1146_3(moom.CA a0) throws Throwable;
private static native int __call1146_4(double a0) throws Throwable;
private static native double __fieldRead1146_5(moom.CA a0) throws Throwable;
private static native int __call1146_6(double a0) throws Throwable;
private static native java.lang.String __call1146_7() throws Throwable;
private static native double __fieldRead1146_8(moom.CA a0) throws Throwable;
private static native int __call1146_9(double a0) throws Throwable;
private static native double __fieldRead1146_10(moom.CA a0) throws Throwable;
private static native int __call1146_11(double a0) throws Throwable;
private static native double __fieldRead1146_12(moom.CA a0) throws Throwable;
private static native int __call1146_13(double a0) throws Throwable;
private static native moom.DU __call1146_14(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1146_15(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native net.minecraft.block.Block __call1146_16(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call1146_17(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call1146_18(moom.fn a0) throws Throwable;
private static native int __integerCategory1146_19(boolean value) throws Throwable;
private static native boolean __integerCategory1146_20(int value) throws Throwable;
private static native boolean __integerCategory1146_21(int value) throws Throwable;
private static native java.lang.Throwable __call3114600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_9a082b1f8c69f692f309(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_9a082b1f8c69f692f309 {

public static int f1739(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    int forwardValue1739_41_0;
    int forwardValue1739_41_1;
    int forwardValue1739_60_0;
    int forwardValue1739_60_1;
    int forwardValue1739_81_0;
    int forwardValue1739_81_1;
    int forwardValue1739_108_0;
    java.lang.String spill1739_0;
    int spill1739_1;
    int spill1739_2;
    int spill1739_3;
    int spill1739_4;
    long life2_3;
    int life5_6;
    java.lang.String life4_7;
    int life5_15;
    forward_join_108: {
    forward_join_107: {
    forward_join_81: {
    forward_join_65: {
    forward_join_60: {
    forward_join_46: {
    forward_join_41: {
    forward_join_27: {
    life2_3 = (__fieldRead1739_0() ^ 16865185239118L);
    spill1739_0 = __call1739_1();
    life5_6 = 0;
    life4_7 = spill1739_0;
    life5_15 = __call1739_5(life5_6, __call1739_4(receiver, __call1739_2(p0), __fieldRead1739_3()));
    spill1739_1 = life5_15;
    spill1739_2 = __invokedynamic1739_6(203, (8752809450661865662L ^ life2_3));
    if (!((life4_7 == null))) {
        forwardValue1739_41_0 = spill1739_1;
        forwardValue1739_41_1 = spill1739_2;
        break forward_join_41;
    }
    if (!((spill1739_1 >= spill1739_2))) {
        break forward_join_27;
    }
    return life5_15;
    }
    life5_15 = __call1739_10(life5_15, __call1739_9(receiver, __call1739_7(p0), __fieldRead1739_8()));
    forwardValue1739_41_0 = life5_15;
    forwardValue1739_41_1 = __invokedynamic1739_11(24438, (2603166492946806548L ^ life2_3));
    }
    if (!((life4_7 == null))) {
        forwardValue1739_60_0 = forwardValue1739_41_0;
        forwardValue1739_60_1 = forwardValue1739_41_1;
        break forward_join_60;
    }
    if (!((forwardValue1739_41_0 >= forwardValue1739_41_1))) {
        break forward_join_46;
    }
    return life5_15;
    }
    life5_15 = __call1739_15(life5_15, __call1739_14(receiver, __call1739_12(p0), __fieldRead1739_13()));
    forwardValue1739_60_0 = life5_15;
    forwardValue1739_60_1 = __invokedynamic1739_16(24438, (2603166492946806548L ^ life2_3));
    }
    if (!((life4_7 == null))) {
        forwardValue1739_81_0 = forwardValue1739_60_0;
        forwardValue1739_81_1 = forwardValue1739_60_1;
        break forward_join_81;
    }
    if (!((forwardValue1739_60_0 >= forwardValue1739_60_1))) {
        break forward_join_65;
    }
    return life5_15;
    }
    life5_15 = __call1739_20(life5_15, __call1739_19(receiver, __call1739_17(p0), __fieldRead1739_18()));
    spill1739_3 = life5_15;
    if (!((life4_7 == null))) {
        forwardValue1739_108_0 = spill1739_3;
        break forward_join_108;
    }
    forwardValue1739_81_0 = spill1739_3;
    forwardValue1739_81_1 = __invokedynamic1739_21(24438, (2603166492946806548L ^ life2_3));
    }
    if (!((forwardValue1739_81_0 < forwardValue1739_81_1))) {
        break forward_join_107;
    }
    life5_15 = __call1739_25(life5_15, __call1739_24(receiver, __call1739_22(p0), __fieldRead1739_23()));
    spill1739_4 = life5_15;
    if (!((life4_7 == null))) {
        forwardValue1739_108_0 = spill1739_4;
        break forward_join_108;
    }
    if (!((spill1739_4 < __invokedynamic1739_26(24438, (2603166492946806548L ^ life2_3))))) {
        break forward_join_107;
    }
    life5_15 = __call1739_30(life5_15, __call1739_29(receiver, __call1739_27(p0), __fieldRead1739_28()));
    }
    forwardValue1739_108_0 = life5_15;
    }
    return forwardValue1739_108_0;
}
public static void h1739_0(moom.Oo p0) throws Throwable {
    throw __call1173900_0(p0);
}
public static void h1739_1(moom.Oo p0) throws Throwable {
    throw __call1173901_0(p0);
}
public static void h1739_2(moom.Oo p0) throws Throwable {
    throw __call1173902_0(p0);
}
public static void h1739_3(moom.Oo p0) throws Throwable {
    throw __call1173903_0(p0);
}
public static void h1739_4(moom.Oo p0) throws Throwable {
    throw __call1173904_0(p0);
}
public static void h1739_5(moom.Oo p0) throws Throwable {
    throw __call1173905_0(p0);
}
public static void h1739_6(moom.Oo p0) throws Throwable {
    throw __call1173906_0(p0);
}
public static void h1739_7(moom.Oo p0) throws Throwable {
    throw __call1173907_0(p0);
}
private static native long __fieldRead1739_0() throws Throwable;
private static native java.lang.String __call1739_1() throws Throwable;
private static native moom.DT __call1739_2(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead1739_3() throws Throwable;
private static native int __call1739_4(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native int __call1739_5(int a0, int a1) throws Throwable;
private static native int __invokedynamic1739_6(int a0, long a1) throws Throwable;
private static native moom.DT __call1739_7(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead1739_8() throws Throwable;
private static native int __call1739_9(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native int __call1739_10(int a0, int a1) throws Throwable;
private static native int __invokedynamic1739_11(int a0, long a1) throws Throwable;
private static native moom.DT __call1739_12(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead1739_13() throws Throwable;
private static native int __call1739_14(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native int __call1739_15(int a0, int a1) throws Throwable;
private static native int __invokedynamic1739_16(int a0, long a1) throws Throwable;
private static native moom.DT __call1739_17(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead1739_18() throws Throwable;
private static native int __call1739_19(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native int __call1739_20(int a0, int a1) throws Throwable;
private static native int __invokedynamic1739_21(int a0, long a1) throws Throwable;
private static native moom.DT __call1739_22(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead1739_23() throws Throwable;
private static native int __call1739_24(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native int __call1739_25(int a0, int a1) throws Throwable;
private static native int __invokedynamic1739_26(int a0, long a1) throws Throwable;
private static native moom.DT __call1739_27(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead1739_28() throws Throwable;
private static native int __call1739_29(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native int __call1739_30(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1173900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1173907_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_02c4297335fb0c9e28cb(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws E;
private static final class __SourceHandler_02c4297335fb0c9e28cb {

public static void f610(net.minecraft.world.World receiver, moom.DT p0, net.minecraft.block.Block p1) throws Throwable {
    net.minecraft.world.World forwardValue610_12_0;
    net.minecraft.world.World spill610_0;
    long life3_3;
    java.lang.String life5_5;
    net.minecraft.block.state.IBlockState life6_20;
    forward_join_22: {
    forward_join_12: {
    life3_3 = (__fieldRead610_0() ^ 95466510684100L);
    life5_5 = __call610_1();
    spill610_0 = receiver;
    if (!((life5_5 == null))) {
        forwardValue610_12_0 = spill610_0;
        break forward_join_12;
    }
    if (!((!__fieldRead610_2(spill610_0)))) {
        break forward_join_22;
    }
    forwardValue610_12_0 = receiver;
    }
    life6_20 = __call610_3(forwardValue610_12_0, p0);
    __call610_5(__call610_4(life6_20), receiver, p0, life6_20, p1);
    }
    return;
}
public static void h610_0(java.lang.Throwable p0) throws Throwable {
    throw __call2061000_0(p0);
}
public static void h610_1(java.lang.Throwable p0) throws Throwable {
    throw __call2061001_0(p0);
}
public static void h610_2(java.lang.Throwable p0, moom.DT p1, net.minecraft.block.Block p2, net.minecraft.block.state.IBlockState p3) throws Throwable {
    java.lang.Throwable local4 = p0;
    moom.qY local5 = __call2061002_0(local4, "Exception while updating neighbours");
    moom.qZ local6 = __call2061002_1(local5, "Block being updated");
    __call2061002_3(local6, "Source block type", __invokedynamic2061002_2(p2));
    __call2061002_4(local6, p1, p3);
    throw new moom.Oo(local5);
}
private static native long __fieldRead610_0() throws Throwable;
private static native java.lang.String __call610_1() throws Throwable;
private static native boolean __fieldRead610_2(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call610_3(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call610_4(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call610_5(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, net.minecraft.block.Block a4) throws Throwable;
private static native java.lang.Throwable __call2061000_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061001_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2061002_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2061002_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2061002_2(net.minecraft.block.Block a0) throws Throwable;
private static native void __call2061002_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native void __call2061002_4(moom.qZ a0, moom.DT a1, net.minecraft.block.state.IBlockState a2) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_6fc98bfa01d2a18380ec(net.minecraft.world.World a0, moom.DT a1, boolean a2) throws E;
private static final class __SourceHandler_6fc98bfa01d2a18380ec {

public static boolean f1740(net.minecraft.world.World receiver, moom.DT p0, boolean p1) throws Throwable {
    net.minecraft.world.World forwardValue1740_15_0;
    int forwardValue1740_25_0;
    int forwardValue1740_39_0;
    int forwardValue1740_43_0;
    int forwardValue1740_45_0;
    net.minecraft.world.World spill1740_0;
    boolean spill1740_1;
    boolean spill1740_2;
    long life3_3;
    java.lang.String life5_5;
    net.minecraft.world.chunk.Chunk life6_23;
    net.minecraft.block.Block life7_38;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_26: {
    forward_join_25: {
    forward_join_15: {
    forward_join_14: {
    life3_3 = (__fieldRead1740_0() ^ 129638308614777L);
    life5_5 = __call1740_1();
    spill1740_0 = receiver;
    if (!((life5_5 == null))) {
        forwardValue1740_15_0 = spill1740_0;
        break forward_join_15;
    }
    if (!((!__call1740_2(spill1740_0, p0)))) {
        break forward_join_14;
    }
    return p1;
    }
    forwardValue1740_15_0 = receiver;
    }
    life6_23 = __call1740_4(__fieldRead1740_3(forwardValue1740_15_0), p0);
    spill1740_1 = __call1740_5(life6_23);
    if (!((life5_5 == null))) {
        forwardValue1740_25_0 = __integerCategory1740_6(spill1740_1);
        break forward_join_25;
    }
    if (!(spill1740_1)) {
        break forward_join_26;
    }
    forwardValue1740_25_0 = __integerCategory1740_7(p1);
    }
    return __integerCategory1740_8(forwardValue1740_25_0);
    }
    life7_38 = __call1740_10(__call1740_9(receiver, p0));
    spill1740_2 = __call1740_12(__call1740_11(life7_38));
    if (!((life5_5 == null))) {
        forwardValue1740_39_0 = __integerCategory1740_13(spill1740_2);
        break forward_join_39;
    }
    if (!(spill1740_2)) {
        break forward_join_44;
    }
    forwardValue1740_39_0 = __integerCategory1740_15(__call1740_14(life7_38));
    }
    if (!((life5_5 == null))) {
        forwardValue1740_43_0 = forwardValue1740_39_0;
        break forward_join_43;
    }
    if (!((forwardValue1740_39_0 != 0))) {
        break forward_join_44;
    }
    forwardValue1740_43_0 = 1;
    }
    forwardValue1740_45_0 = forwardValue1740_43_0;
    break forward_join_45;
    }
    forwardValue1740_45_0 = 0;
    }
    return __integerCategory1740_16(forwardValue1740_45_0);
}
public static void h1740_0(moom.Oo p0) throws Throwable {
    throw __call1174000_0(p0);
}
public static void h1740_1(moom.Oo p0) throws Throwable {
    throw __call1174001_0(p0);
}
public static void h1740_2(moom.Oo p0) throws Throwable {
    throw __call1174002_0(p0);
}
public static void h1740_3(moom.Oo p0) throws Throwable {
    throw __call1174003_0(p0);
}
public static void h1740_4(moom.Oo p0) throws Throwable {
    throw __call1174004_0(p0);
}
public static void h1740_5(moom.Oo p0) throws Throwable {
    throw __call1174005_0(p0);
}
private static native long __fieldRead1740_0() throws Throwable;
private static native java.lang.String __call1740_1() throws Throwable;
private static native boolean __call1740_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native moom.Fn __fieldRead1740_3(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1740_4(moom.Fn a0, moom.DT a1) throws Throwable;
private static native boolean __call1740_5(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory1740_6(boolean value) throws Throwable;
private static native int __integerCategory1740_7(boolean value) throws Throwable;
private static native boolean __integerCategory1740_8(int value) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1740_9(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1740_10(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call1740_11(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call1740_12(moom.fn a0) throws Throwable;
private static native int __integerCategory1740_13(boolean value) throws Throwable;
private static native boolean __call1740_14(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory1740_15(boolean value) throws Throwable;
private static native boolean __integerCategory1740_16(int value) throws Throwable;
private static native java.lang.Throwable __call1174000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174005_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_41218bd31504d856f098(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_41218bd31504d856f098 {

public static void f281(net.minecraft.world.World receiver, net.minecraft.entity.Entity p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue281_17_0;
    net.minecraft.entity.Entity forwardValue281_26_0;
    int forwardValue281_34_0;
    net.minecraft.entity.Entity spill281_0;
    int spill281_1;
    long life2_3;
    java.lang.String life4_5;
    forward_join_40: {
    forward_join_34: {
    forward_join_26: {
    forward_join_23: {
    forward_join_17: {
    forward_join_15: {
    life2_3 = (__fieldRead281_0() ^ 116246723972442L);
    life4_5 = __call281_1();
    spill281_0 = __fieldRead281_2(p0);
    if (!((life4_5 == null))) {
        forwardValue281_17_0 = spill281_0;
        break forward_join_17;
    }
    if (!((spill281_0 != null))) {
        break forward_join_15;
    }
    __call281_4(__fieldRead281_3(p0), null);
    }
    forwardValue281_17_0 = __fieldRead281_5(p0);
    }
    if (!((life4_5 == null))) {
        forwardValue281_26_0 = forwardValue281_17_0;
        break forward_join_26;
    }
    if (!((forwardValue281_17_0 != null))) {
        break forward_join_23;
    }
    __call281_6(p0, null);
    }
    __call281_7(p0);
    forwardValue281_26_0 = p0;
    }
    spill281_1 = __instanceOf281_8(forwardValue281_26_0);
    if (!((life4_5 == null))) {
        forwardValue281_34_0 = spill281_1;
        break forward_join_34;
    }
    if (!((spill281_1 != 0))) {
        break forward_join_40;
    }
    forwardValue281_34_0 = __integerCategory281_11(__call281_10(__fieldRead281_9(receiver), p0));
    }
    __discardScalar281_12(forwardValue281_34_0);
    __call281_13(receiver);
    __call281_14(receiver, p0);
    }
    return;
}
public static void h281_0(moom.Oo p0) throws Throwable {
    throw __call1028100_0(p0);
}
public static void h281_1(moom.Oo p0) throws Throwable {
    throw __call1028101_0(p0);
}
public static void h281_2(moom.Oo p0) throws Throwable {
    throw __call1028102_0(p0);
}
public static void h281_3(moom.Oo p0) throws Throwable {
    throw __call1028103_0(p0);
}
public static void h281_4(moom.Oo p0) throws Throwable {
    throw __call1028104_0(p0);
}
public static void h281_5(moom.Oo p0) throws Throwable {
    throw __call1028105_0(p0);
}
private static native long __fieldRead281_0() throws Throwable;
private static native java.lang.String __call281_1() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead281_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead281_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call281_4(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead281_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call281_6(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native void __call281_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf281_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.List __fieldRead281_9(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call281_10(java.util.List a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory281_11(boolean value) throws Throwable;
private static native void __discardScalar281_12(int a0) throws Throwable;
private static native void __call281_13(net.minecraft.world.World a0) throws Throwable;
private static native void __call281_14(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.lang.Throwable __call1028100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028105_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_db979206443dc1009eeb(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_db979206443dc1009eeb {

public static boolean f1742(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    int forwardValue1742_24_0;
    int forwardValue1742_28_0;
    int forwardValue1742_30_0;
    int forwardValue1742_46_0;
    boolean spill1742_0;
    int spill1742_1;
    boolean spill1742_2;
    long life2_3;
    java.lang.String life4_5;
    int life5_42;
    forward_join_46: {
    forward_join_42: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life2_3 = (__fieldRead1742_0() ^ 93788072807152L);
    life4_5 = __call1742_1();
    spill1742_0 = __call1742_3(__call1742_2(), "\n");
    if (!((life4_5 == null))) {
        forwardValue1742_24_0 = __integerCategory1742_4(spill1742_0);
        break forward_join_24;
    }
    if (!(spill1742_0)) {
        break forward_join_15;
    }
    if (!((__call1742_6(__call1742_5()) == null))) {
        break forward_join_29;
    }
    }
    forwardValue1742_24_0 = __numericCompare1742_10((__call1742_7() - __call1742_8()), __invokedynamic1742_9(3626, (7412724669826120850L ^ life2_3)));
    }
    if (!((life4_5 == null))) {
        forwardValue1742_28_0 = forwardValue1742_24_0;
        break forward_join_28;
    }
    if (!((forwardValue1742_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue1742_28_0 = 1;
    }
    forwardValue1742_30_0 = forwardValue1742_28_0;
    break forward_join_30;
    }
    forwardValue1742_30_0 = 0;
    }
    life5_42 = forwardValue1742_30_0;
    spill1742_1 = life5_42;
    if (!((life4_5 == null))) {
        forwardValue1742_46_0 = spill1742_1;
        break forward_join_46;
    }
    if (!((spill1742_1 != 0))) {
        break forward_join_42;
    }
    spill1742_2 = __call1742_11(receiver);
    if (!((life4_5 == null))) {
        forwardValue1742_46_0 = __integerCategory1742_12(spill1742_2);
        break forward_join_46;
    }
    if (!((!spill1742_2))) {
        break forward_join_42;
    }
    return __integerCategory1742_13(0);
    }
    forwardValue1742_46_0 = __integerCategory1742_15(__call1742_14(receiver, p0, 1));
    }
    return __integerCategory1742_16(forwardValue1742_46_0);
}
public static void h1742_0(moom.Oo p0) throws Throwable {
    throw __call1174200_0(p0);
}
public static void h1742_1(moom.Oo p0) throws Throwable {
    throw __call1174201_0(p0);
}
public static void h1742_2(moom.Oo p0) throws Throwable {
    throw __call1174202_0(p0);
}
public static void h1742_3(moom.Oo p0) throws Throwable {
    throw __call1174203_0(p0);
}
public static void h1742_4(moom.Oo p0) throws Throwable {
    throw __call1174204_0(p0);
}
public static void h1742_5(moom.Oo p0) throws Throwable {
    throw __call1174205_0(p0);
}
public static void h1742_6(moom.Oo p0) throws Throwable {
    throw __call1174206_0(p0);
}
public static void h1742_7(moom.Oo p0) throws Throwable {
    throw __call1174207_0(p0);
}
private static native long __fieldRead1742_0() throws Throwable;
private static native java.lang.String __call1742_1() throws Throwable;
private static native java.lang.String __call1742_2() throws Throwable;
private static native boolean __call1742_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1742_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call1742_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call1742_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native long __call1742_7() throws Throwable;
private static native long __call1742_8() throws Throwable;
private static native long __invokedynamic1742_9(int a0, long a1) throws Throwable;
private static native int __numericCompare1742_10(long a0, long a1) throws Throwable;
private static native boolean __call1742_11(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1742_12(boolean value) throws Throwable;
private static native boolean __integerCategory1742_13(int value) throws Throwable;
private static native boolean __call1742_14(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native int __integerCategory1742_15(boolean value) throws Throwable;
private static native boolean __integerCategory1742_16(int value) throws Throwable;
private static native java.lang.Throwable __call1174200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174207_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DT __sourceHandlerCall_69287a3ea016953e92f9(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_69287a3ea016953e92f9 {

public static moom.DT f1743(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    moom.DT lexicalValue1743_54_0;
    java.lang.String spill1743_0;
    moom.DT spill1743_1;
    long life2_3;
    net.minecraft.world.chunk.Chunk life5_8;
    moom.DT life6_24;
    java.lang.String life4_25;
    moom.DT life7_33;
    moom.fn life8_38;
    lexical_join_54: {
    lexical_join_53: {
    life2_3 = (__fieldRead1743_0() ^ 134490801851120L);
    spill1743_0 = __call1743_1();
    life5_8 = __call1743_2(receiver, p0);
    life6_24 = new moom.DT(__call1743_3(p0), (__call1743_4(life5_8) + __invokedynamic1743_5(4352, (4374229758061945807L ^ life2_3))), __call1743_6(p0));
    life4_25 = spill1743_0;
    lexical_cycle_26: while (true) {
    lexical_join_51: {
    lexical_join_49: {
    if (!((__call1743_7(life6_24) >= 0))) {
        break lexical_join_53;
    }
    spill1743_1 = __call1743_8(life6_24);
    if (!((life4_25 == null))) {
        lexicalValue1743_54_0 = spill1743_1;
        break lexical_join_54;
    }
    life7_33 = spill1743_1;
    life8_38 = __call1743_10(__call1743_9(life5_8, life7_33));
    if (!((life4_25 == null))) {
        break lexical_join_51;
    }
    if (!(__call1743_11(life8_38))) {
        break lexical_join_49;
    }
    if (!((life8_38 != __fieldRead1743_12()))) {
        break lexical_join_49;
    }
    if (!((life4_25 != null))) {
        break lexical_join_53;
    }
    }
    life6_24 = life7_33;
    }
    if (!((life4_25 != null))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    lexicalValue1743_54_0 = life6_24;
    }
    return lexicalValue1743_54_0;
}
public static void h1743_0(moom.Oo p0) throws Throwable {
    throw __call1174300_0(p0);
}
public static void h1743_1(moom.Oo p0) throws Throwable {
    throw __call1174301_0(p0);
}
public static void h1743_2(moom.Oo p0) throws Throwable {
    throw __call1174302_0(p0);
}
private static native long __fieldRead1743_0() throws Throwable;
private static native java.lang.String __call1743_1() throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1743_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __call1743_3(moom.DT a0) throws Throwable;
private static native int __call1743_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1743_5(int a0, long a1) throws Throwable;
private static native int __call1743_6(moom.DT a0) throws Throwable;
private static native int __call1743_7(moom.DT a0) throws Throwable;
private static native moom.DT __call1743_8(moom.DT a0) throws Throwable;
private static native net.minecraft.block.Block __call1743_9(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native moom.fn __call1743_10(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call1743_11(moom.fn a0) throws Throwable;
private static native moom.fn __fieldRead1743_12() throws Throwable;
private static native java.lang.Throwable __call1174300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cfbcba8ff5c0be662a82(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_cfbcba8ff5c0be662a82 {

public static void f282(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    int forwardValue282_25_0;
    net.minecraft.tileentity.TileEntity forwardValue282_29_0;
    java.lang.String spill282_0;
    net.minecraft.tileentity.TileEntity spill282_1;
    boolean spill282_2;
    long life2_3;
    net.minecraft.tileentity.TileEntity life5_8;
    java.lang.String life4_9;
    forward_join_50: {
    forward_join_45: {
    forward_join_29: {
    forward_join_28: {
    forward_join_25: {
    life2_3 = (__fieldRead282_0() ^ 117133086368201L);
    spill282_0 = __call282_1();
    life5_8 = __call282_2(receiver, p0);
    life4_9 = spill282_0;
    spill282_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue282_29_0 = spill282_1;
        break forward_join_29;
    }
    if (!((spill282_1 != null))) {
        break forward_join_28;
    }
    spill282_2 = __fieldRead282_3(receiver);
    if (!((life4_9 == null))) {
        forwardValue282_25_0 = __integerCategory282_4(spill282_2);
        break forward_join_25;
    }
    if (!(spill282_2)) {
        break forward_join_28;
    }
    __call282_5(life5_8);
    forwardValue282_25_0 = __integerCategory282_8(__call282_7(__fieldRead282_6(receiver), life5_8));
    }
    __discardScalar282_9(forwardValue282_25_0);
    if (!((life4_9 != null))) {
        break forward_join_50;
    }
    }
    forwardValue282_29_0 = life5_8;
    }
    if (!((forwardValue282_29_0 != null))) {
        break forward_join_45;
    }
    __call282_11(__fieldRead282_10(receiver), life5_8);
    __call282_13(__fieldRead282_12(receiver), life5_8);
    __call282_15(__fieldRead282_14(receiver), life5_8);
    }
    __call282_17(__call282_16(receiver, p0), p0);
    }
    return;
}
public static void h282_0(moom.Oo p0) throws Throwable {
    throw __call1028200_0(p0);
}
public static void h282_1(moom.Oo p0) throws Throwable {
    throw __call1028201_0(p0);
}
public static void h282_2(moom.Oo p0) throws Throwable {
    throw __call1028202_0(p0);
}
public static void h282_3(moom.Oo p0) throws Throwable {
    throw __call1028203_0(p0);
}
public static void h282_4(moom.Oo p0) throws Throwable {
    throw __call1028204_0(p0);
}
public static void h282_5(moom.Oo p0) throws Throwable {
    throw __call1028205_0(p0);
}
private static native long __fieldRead282_0() throws Throwable;
private static native java.lang.String __call282_1() throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call282_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native boolean __fieldRead282_3(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory282_4(boolean value) throws Throwable;
private static native void __call282_5(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.util.List __fieldRead282_6(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call282_7(java.util.List a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native int __integerCategory282_8(boolean value) throws Throwable;
private static native void __discardScalar282_9(int a0) throws Throwable;
private static native java.util.List __fieldRead282_10(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call282_11(java.util.List a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native java.util.List __fieldRead282_12(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call282_13(java.util.List a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native java.util.List __fieldRead282_14(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call282_15(java.util.List a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call282_16(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native void __call282_17(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native java.lang.Throwable __call1028200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028205_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_6807ec3031c1a8a030ed(net.minecraft.world.World a0, moom.CA a1) throws E;
private static final class __SourceHandler_6807ec3031c1a8a030ed {

public static boolean f1147(net.minecraft.world.World receiver, moom.CA p0) throws Throwable {
    int forestValue1147_55_0;
    net.minecraft.block.Block forestValue1147_88_0;
    net.minecraft.block.Block forestValue1147_93_0;
    int forestValue1147_109_0;
    java.lang.String spill1147_0;
    boolean spill1147_1;
    int spill1147_2;
    int spill1147_3;
    net.minecraft.block.Block spill1147_4;
    long life2_3;
    int life5_8;
    int life6_14;
    java.lang.String life4_15;
    int life7_19;
    int life8_25;
    int life9_29;
    int life10_35;
    moom.DU life11_52;
    int life12_54;
    int life13_61;
    int life14_68;
    net.minecraft.block.Block life15_80;
    forest_join_109: {
    forest_join_108: {
    forest_join_106: {
    life2_3 = (__fieldRead1147_0() ^ 13515290161597L);
    spill1147_0 = __call1147_1();
    life5_8 = __call1147_3(__fieldRead1147_2(p0));
    life6_14 = __call1147_5((__fieldRead1147_4(p0) + 0x1.0p0d));
    life4_15 = spill1147_0;
    life7_19 = __call1147_7(__fieldRead1147_6(p0));
    life8_25 = __call1147_9((__fieldRead1147_8(p0) + 0x1.0p0d));
    life9_29 = __call1147_11(__fieldRead1147_10(p0));
    life10_35 = __call1147_13((__fieldRead1147_12(p0) + 0x1.0p0d));
    spill1147_1 = __call1147_14(receiver, life5_8, life7_19, life9_29, life6_14, life8_25, life10_35, 1);
    if (!((life4_15 == null))) {
        forestValue1147_109_0 = __integerCategory1147_15(spill1147_1);
        break forest_join_109;
    }
    if (!(spill1147_1)) {
        break forest_join_108;
    }
    life11_52 = new moom.DU();
    life12_54 = life5_8;
    forest_cycle_54: while (true) {
    forest_join_102: {
    forestValue1147_55_0 = life12_54;
    forest_cycle_55: while (true) {
    if (!((forestValue1147_55_0 < life6_14))) {
        break forest_join_108;
    }
    spill1147_2 = life7_19;
    if (!((life4_15 == null))) {
        forestValue1147_109_0 = spill1147_2;
        break forest_join_109;
    }
    life13_61 = spill1147_2;
    forest_cycle_61: while (true) {
    forest_join_100: {
    forest_join_99: {
    if (!((life13_61 < life8_25))) {
        break forest_join_102;
    }
    spill1147_3 = life9_29;
    if (!((life4_15 == null))) {
        forestValue1147_55_0 = spill1147_3;
        continue forest_cycle_55;
    }
    life14_68 = spill1147_3;
    forest_cycle_68: while (true) {
    forest_join_96: {
    forest_join_93: {
    forest_join_88: {
    if (!((life14_68 < life10_35))) {
        break forest_join_99;
    }
    life15_80 = __call1147_18(__call1147_17(receiver, __call1147_16(life11_52, life12_54, life13_61, life14_68)));
    if (!((life4_15 == null))) {
        break forest_join_100;
    }
    spill1147_4 = life15_80;
    if (!((life4_15 == null))) {
        forestValue1147_88_0 = spill1147_4;
        break forest_join_88;
    }
    if (!((spill1147_4 != __fieldRead1147_19()))) {
        break forest_join_106;
    }
    forestValue1147_88_0 = life15_80;
    }
    if (!((life4_15 == null))) {
        forestValue1147_93_0 = forestValue1147_88_0;
        break forest_join_93;
    }
    if (!((forestValue1147_88_0 != __fieldRead1147_20()))) {
        break forest_join_106;
    }
    forestValue1147_93_0 = life15_80;
    }
    if (!((forestValue1147_93_0 == __fieldRead1147_21()))) {
        break forest_join_96;
    }
    break forest_join_106;
    }
    life14_68 += 1;
    if (!((life4_15 != null))) {
        continue forest_cycle_68;
    }
    break forest_cycle_68;
    }
    }
    life13_61 += 1;
    }
    if (!((life4_15 != null))) {
        continue forest_cycle_61;
    }
    break forest_cycle_61;
    }
    break forest_cycle_55;
    }
    }
    life12_54 += 1;
    if (!((life4_15 != null))) {
        continue forest_cycle_54;
    }
    break forest_cycle_54;
    }
    break forest_join_108;
    }
    return __integerCategory1147_22(1);
    }
    forestValue1147_109_0 = 0;
    }
    return __integerCategory1147_23(forestValue1147_109_0);
}
public static boolean h1147_0(moom.Oo p0) throws Throwable {
    throw __call3114700_0(p0);
}
public static boolean h1147_1(moom.Oo p0) throws Throwable {
    throw __call3114701_0(p0);
}
public static boolean h1147_2(moom.Oo p0) throws Throwable {
    throw __call3114702_0(p0);
}
public static boolean h1147_3(moom.Oo p0) throws Throwable {
    throw __call3114703_0(p0);
}
public static boolean h1147_4(moom.Oo p0) throws Throwable {
    throw __call3114704_0(p0);
}
public static boolean h1147_5(moom.Oo p0) throws Throwable {
    throw __call3114705_0(p0);
}
public static boolean h1147_6(moom.Oo p0) throws Throwable {
    throw __call3114706_0(p0);
}
private static native long __fieldRead1147_0() throws Throwable;
private static native java.lang.String __call1147_1() throws Throwable;
private static native double __fieldRead1147_2(moom.CA a0) throws Throwable;
private static native int __call1147_3(double a0) throws Throwable;
private static native double __fieldRead1147_4(moom.CA a0) throws Throwable;
private static native int __call1147_5(double a0) throws Throwable;
private static native double __fieldRead1147_6(moom.CA a0) throws Throwable;
private static native int __call1147_7(double a0) throws Throwable;
private static native double __fieldRead1147_8(moom.CA a0) throws Throwable;
private static native int __call1147_9(double a0) throws Throwable;
private static native double __fieldRead1147_10(moom.CA a0) throws Throwable;
private static native int __call1147_11(double a0) throws Throwable;
private static native double __fieldRead1147_12(moom.CA a0) throws Throwable;
private static native int __call1147_13(double a0) throws Throwable;
private static native boolean __call1147_14(net.minecraft.world.World a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7) throws Throwable;
private static native int __integerCategory1147_15(boolean value) throws Throwable;
private static native moom.DU __call1147_16(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1147_17(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native net.minecraft.block.Block __call1147_18(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.BlockFire __fieldRead1147_19() throws Throwable;
private static native moom.dM __fieldRead1147_20() throws Throwable;
private static native moom.dN __fieldRead1147_21() throws Throwable;
private static native boolean __integerCategory1147_22(int value) throws Throwable;
private static native boolean __integerCategory1147_23(int value) throws Throwable;
private static native java.lang.Throwable __call3114700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3114706_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_b68e631cc6a98beb421a(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_b68e631cc6a98beb421a {

public static int f1746(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    int lexicalValue1746_50_0;
    int lexicalValue1746_50_1;
    int lexicalValue1746_52_0;
    int lexicalValue1746_57_0;
    java.lang.String spill1746_0;
    int spill1746_1;
    int spill1746_2;
    int spill1746_3;
    long life2_3;
    int life5_6;
    moom.bs[] life6_8;
    int life7_11;
    java.lang.String life4_12;
    int life8_14;
    moom.bs life9_21;
    int life10_28;
    lexical_join_57: {
    lexical_join_56: {
    life2_3 = (__fieldRead1746_0() ^ 104245636029783L);
    spill1746_0 = __call1746_1();
    life5_6 = 0;
    life6_8 = __call1746_2();
    life7_11 = (life6_8).length;
    life4_12 = spill1746_0;
    life8_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_50: {
    lexical_join_46: {
    if (!((life8_14 < life7_11))) {
        break lexical_join_56;
    }
    life9_21 = (life6_8)[life8_14];
    life10_28 = __call1746_4(receiver, __call1746_3(p0, life9_21), life9_21);
    spill1746_1 = life10_28;
    if (!((life4_12 == null))) {
        lexicalValue1746_57_0 = spill1746_1;
        break lexical_join_57;
    }
    spill1746_2 = __invokedynamic1746_5(24438, (2603115473582291469L ^ life2_3));
    if (!((life4_12 == null))) {
        lexicalValue1746_50_0 = spill1746_1;
        lexicalValue1746_50_1 = spill1746_2;
        break lexical_join_50;
    }
    if (!((spill1746_1 >= spill1746_2))) {
        break lexical_join_46;
    }
    return __invokedynamic1746_6(24438, (2603115473582291469L ^ life2_3));
    }
    spill1746_3 = life10_28;
    if (!((life4_12 == null))) {
        lexicalValue1746_52_0 = spill1746_3;
        break lexical_join_52;
    }
    lexicalValue1746_50_0 = spill1746_3;
    lexicalValue1746_50_1 = life5_6;
    }
    if (!((lexicalValue1746_50_0 > lexicalValue1746_50_1))) {
        break lexical_join_53;
    }
    lexicalValue1746_52_0 = life10_28;
    }
    life5_6 = lexicalValue1746_52_0;
    }
    life8_14 += 1;
    if (!((life4_12 != null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue1746_57_0 = life5_6;
    }
    return lexicalValue1746_57_0;
}
public static void h1746_0(moom.Oo p0) throws Throwable {
    throw __call1174600_0(p0);
}
public static void h1746_1(moom.Oo p0) throws Throwable {
    throw __call1174601_0(p0);
}
public static void h1746_2(moom.Oo p0) throws Throwable {
    throw __call1174602_0(p0);
}
public static void h1746_3(moom.Oo p0) throws Throwable {
    throw __call1174603_0(p0);
}
private static native long __fieldRead1746_0() throws Throwable;
private static native java.lang.String __call1746_1() throws Throwable;
private static native moom.bs[] __call1746_2() throws Throwable;
private static native moom.DT __call1746_3(moom.DT a0, moom.bs a1) throws Throwable;
private static native int __call1746_4(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native int __invokedynamic1746_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1746_6(int a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1174600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174603_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4f067a092631c2bc58a5(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws E;
private static final class __SourceHandler_4f067a092631c2bc58a5 {

public static void f1747(net.minecraft.world.World receiver, moom.DT p0, net.minecraft.block.Block p1) throws Throwable {
    net.minecraft.world.World lexicalValue1747_28_0;
    moom.DT lexicalValue1747_28_1;
    int lexicalValue1747_49_0;
    int lexicalValue1747_66_0;
    net.minecraft.block.Block lexicalValue1747_69_0;
    java.lang.String spill1747_0;
    net.minecraft.world.World spill1747_1;
    moom.DT spill1747_2;
    boolean spill1747_3;
    net.minecraft.block.BlockRedstoneComparator spill1747_4;
    long life3_3;
    java.util.Iterator life6_7;
    java.lang.String life5_8;
    moom.bs life7_15;
    moom.DT life8_19;
    net.minecraft.block.state.IBlockState life9_35;
    lexical_join_76: {
    life3_3 = (__fieldRead1747_0() ^ 75948550470067L);
    spill1747_0 = __call1747_1();
    life6_7 = __call1747_3(__fieldRead1747_2());
    life5_8 = spill1747_0;
    lexical_cycle_9: while (true) {
    lexical_join_74: {
    lexical_join_69: {
    lexical_join_66: {
    lexical_join_49: {
    lexical_join_46: {
    lexical_join_28: {
    if (!(__call1747_4(life6_7))) {
        break lexical_join_76;
    }
    life7_15 = __cast1747_6(__call1747_5(life6_7));
    life8_19 = __call1747_7(p0, life7_15);
    spill1747_1 = receiver;
    spill1747_2 = life8_19;
    if (!((life5_8 == null))) {
        lexicalValue1747_28_0 = spill1747_1;
        lexicalValue1747_28_1 = spill1747_2;
        break lexical_join_28;
    }
    if (!(__call1747_8(spill1747_1, spill1747_2))) {
        break lexical_join_74;
    }
    lexicalValue1747_28_0 = receiver;
    lexicalValue1747_28_1 = life8_19;
    }
    life9_35 = __call1747_9(lexicalValue1747_28_0, lexicalValue1747_28_1);
    spill1747_3 = __call1747_12(__fieldRead1747_10(), __call1747_11(life9_35));
    if (!((life5_8 == null))) {
        lexicalValue1747_49_0 = __integerCategory1747_13(spill1747_3);
        break lexical_join_49;
    }
    if (!(spill1747_3)) {
        break lexical_join_46;
    }
    __call1747_15(__call1747_14(life9_35), receiver, life8_19, life9_35, p1);
    if (!((life5_8 != null))) {
        break lexical_join_74;
    }
    }
    lexicalValue1747_49_0 = __integerCategory1747_18(__call1747_17(__call1747_16(life9_35)));
    }
    if (!((life5_8 == null))) {
        lexicalValue1747_66_0 = lexicalValue1747_49_0;
        break lexical_join_66;
    }
    if (!((lexicalValue1747_49_0 != 0))) {
        break lexical_join_74;
    }
    life8_19 = __call1747_19(life8_19, life7_15);
    life9_35 = __call1747_20(receiver, life8_19);
    spill1747_4 = __fieldRead1747_21();
    if (!((life5_8 == null))) {
        lexicalValue1747_69_0 = spill1747_4;
        break lexical_join_69;
    }
    lexicalValue1747_66_0 = __integerCategory1747_24(__call1747_23(spill1747_4, __call1747_22(life9_35)));
    }
    if (!((lexicalValue1747_66_0 != 0))) {
        break lexical_join_74;
    }
    lexicalValue1747_69_0 = __call1747_25(life9_35);
    }
    __call1747_26(lexicalValue1747_69_0, receiver, life8_19, life9_35, p1);
    }
    if (!((life5_8 != null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}
public static void h1747_0(moom.Oo p0) throws Throwable {
    throw __call1174700_0(p0);
}
public static void h1747_1(moom.Oo p0) throws Throwable {
    throw __call1174701_0(p0);
}
public static void h1747_2(moom.Oo p0) throws Throwable {
    throw __call1174702_0(p0);
}
public static void h1747_3(moom.Oo p0) throws Throwable {
    throw __call1174703_0(p0);
}
public static void h1747_4(moom.Oo p0) throws Throwable {
    throw __call1174704_0(p0);
}
public static void h1747_5(moom.Oo p0) throws Throwable {
    throw __call1174705_0(p0);
}
public static void h1747_6(moom.Oo p0) throws Throwable {
    throw __call1174706_0(p0);
}
public static void h1747_7(moom.Oo p0) throws Throwable {
    throw __call1174707_0(p0);
}
private static native long __fieldRead1747_0() throws Throwable;
private static native java.lang.String __call1747_1() throws Throwable;
private static native net.minecraft.util.EnumFacing$Plane __fieldRead1747_2() throws Throwable;
private static native java.util.Iterator __call1747_3(net.minecraft.util.EnumFacing$Plane a0) throws Throwable;
private static native boolean __call1747_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1747_5(java.util.Iterator a0) throws Throwable;
private static native moom.bs __cast1747_6(java.lang.Object a0) throws Throwable;
private static native moom.DT __call1747_7(moom.DT a0, moom.bs a1) throws Throwable;
private static native boolean __call1747_8(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1747_9(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.BlockRedstoneComparator __fieldRead1747_10() throws Throwable;
private static native net.minecraft.block.Block __call1747_11(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call1747_12(net.minecraft.block.BlockRedstoneComparator a0, net.minecraft.block.Block a1) throws Throwable;
private static native int __integerCategory1747_13(boolean value) throws Throwable;
private static native net.minecraft.block.Block __call1747_14(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call1747_15(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, net.minecraft.block.Block a4) throws Throwable;
private static native net.minecraft.block.Block __call1747_16(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call1747_17(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory1747_18(boolean value) throws Throwable;
private static native moom.DT __call1747_19(moom.DT a0, moom.bs a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1747_20(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.BlockRedstoneComparator __fieldRead1747_21() throws Throwable;
private static native net.minecraft.block.Block __call1747_22(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call1747_23(net.minecraft.block.BlockRedstoneComparator a0, net.minecraft.block.Block a1) throws Throwable;
private static native int __integerCategory1747_24(boolean value) throws Throwable;
private static native net.minecraft.block.Block __call1747_25(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call1747_26(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, net.minecraft.block.Block a4) throws Throwable;
private static native java.lang.Throwable __call1174700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1174707_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_5f3cd48c6c5c4e22612e(net.minecraft.world.World a0, moom.DT a1, boolean a2) throws E;
private static final class __SourceHandler_5f3cd48c6c5c4e22612e {

public static boolean f632(net.minecraft.world.World receiver, moom.DT p0, boolean p1) throws Throwable {
    net.minecraft.block.Block forwardValue632_60_0;
    int forwardValue632_80_0;
    int forwardValue632_87_0;
    int forwardValue632_94_0;
    int forwardValue632_101_0;
    int forwardValue632_105_0;
    int forwardValue632_107_0;
    int forwardValue632_113_0;
    int forwardValue632_115_0;
    int forwardValue632_117_0;
    java.lang.String spill632_0;
    int spill632_1;
    int spill632_2;
    int spill632_3;
    int spill632_4;
    net.minecraft.block.Block spill632_5;
    int spill632_6;
    boolean spill632_7;
    int spill632_8;
    long life3_3;
    net.minecraft.world.biome.BiomeGenBase life6_8;
    java.lang.String life5_9;
    float life7_13;
    net.minecraft.block.state.IBlockState life8_71;
    net.minecraft.block.Block life9_74;
    int life10_169;
    forward_join_117: {
    forward_join_116: {
    forward_join_115: {
    forward_join_114: {
    forward_join_113: {
    forward_join_107: {
    forward_join_106: {
    forward_join_105: {
    forward_join_101: {
    forward_join_94: {
    forward_join_87: {
    forward_join_80: {
    forward_join_76: {
    forward_join_62: {
    forward_join_60: {
    life3_3 = (__fieldRead632_0() ^ 50420320699287L);
    spill632_0 = __call632_1();
    life6_8 = __call632_2(receiver, p0);
    life5_9 = spill632_0;
    life7_13 = __call632_3(life6_8, p0);
    spill632_1 = __numericCompare632_4(life7_13, 0x1.333334p-3f);
    if (!((life5_9 == null))) {
        forwardValue632_117_0 = spill632_1;
        break forward_join_117;
    }
    if (!((spill632_1 <= 0))) {
        break forward_join_116;
    }
    spill632_2 = __call632_5(p0);
    if (!((life5_9 == null))) {
        forwardValue632_117_0 = spill632_2;
        break forward_join_117;
    }
    if (!((spill632_2 >= 0))) {
        break forward_join_116;
    }
    spill632_3 = __call632_6(p0);
    if (!((life5_9 == null))) {
        forwardValue632_117_0 = spill632_3;
        break forward_join_117;
    }
    if (!((spill632_3 < __invokedynamic632_7(5123, (1626601956114952074L ^ life3_3))))) {
        break forward_join_116;
    }
    spill632_4 = __call632_9(receiver, __fieldRead632_8(), p0);
    if (!((life5_9 == null))) {
        forwardValue632_117_0 = spill632_4;
        break forward_join_117;
    }
    if (!((spill632_4 < __invokedynamic632_10(16490, (7891815331672570830L ^ life3_3))))) {
        break forward_join_116;
    }
    life8_71 = __call632_11(receiver, p0);
    life9_74 = __call632_12(life8_71);
    spill632_5 = life9_74;
    if (!((life5_9 == null))) {
        forwardValue632_60_0 = spill632_5;
        break forward_join_60;
    }
    if (!((spill632_5 != __fieldRead632_13()))) {
        break forward_join_62;
    }
    forwardValue632_60_0 = life9_74;
    }
    if (!((forwardValue632_60_0 == __fieldRead632_14()))) {
        break forward_join_116;
    }
    }
    spill632_6 = __call632_18(__cast632_17(__call632_16(life8_71, __fieldRead632_15())));
    if (!((life5_9 == null))) {
        forwardValue632_117_0 = spill632_6;
        break forward_join_117;
    }
    if (!((spill632_6 == 0))) {
        break forward_join_116;
    }
    spill632_7 = p1;
    if (!((life5_9 == null))) {
        forwardValue632_80_0 = __integerCategory632_19(spill632_7);
        break forward_join_80;
    }
    if (!((!spill632_7))) {
        break forward_join_76;
    }
    return __integerCategory632_20(1);
    }
    forwardValue632_80_0 = __integerCategory632_23(__call632_22(receiver, __call632_21(p0)));
    }
    if (!((life5_9 == null))) {
        forwardValue632_87_0 = forwardValue632_80_0;
        break forward_join_87;
    }
    if (!((forwardValue632_80_0 != 0))) {
        break forward_join_106;
    }
    forwardValue632_87_0 = __integerCategory632_26(__call632_25(receiver, __call632_24(p0)));
    }
    if (!((life5_9 == null))) {
        forwardValue632_94_0 = forwardValue632_87_0;
        break forward_join_94;
    }
    if (!((forwardValue632_87_0 != 0))) {
        break forward_join_106;
    }
    forwardValue632_94_0 = __integerCategory632_29(__call632_28(receiver, __call632_27(p0)));
    }
    if (!((life5_9 == null))) {
        forwardValue632_101_0 = forwardValue632_94_0;
        break forward_join_101;
    }
    if (!((forwardValue632_94_0 != 0))) {
        break forward_join_106;
    }
    forwardValue632_101_0 = __integerCategory632_32(__call632_31(receiver, __call632_30(p0)));
    }
    if (!((life5_9 == null))) {
        forwardValue632_105_0 = forwardValue632_101_0;
        break forward_join_105;
    }
    if (!((forwardValue632_101_0 != 0))) {
        break forward_join_106;
    }
    forwardValue632_105_0 = 1;
    }
    forwardValue632_107_0 = forwardValue632_105_0;
    break forward_join_107;
    }
    forwardValue632_107_0 = 0;
    }
    life10_169 = forwardValue632_107_0;
    spill632_8 = life10_169;
    if (!((life5_9 == null))) {
        forwardValue632_113_0 = spill632_8;
        break forward_join_113;
    }
    if (!((spill632_8 == 0))) {
        break forward_join_114;
    }
    forwardValue632_113_0 = 1;
    }
    forwardValue632_115_0 = forwardValue632_113_0;
    break forward_join_115;
    }
    forwardValue632_115_0 = 0;
    }
    return __integerCategory632_33(forwardValue632_115_0);
    }
    forwardValue632_117_0 = 0;
    }
    return __integerCategory632_34(forwardValue632_117_0);
}
public static boolean h632_0(moom.Oo p0) throws Throwable {
    throw __call2063200_0(p0);
}
public static boolean h632_1(moom.Oo p0) throws Throwable {
    throw __call2063201_0(p0);
}
public static boolean h632_2(moom.Oo p0) throws Throwable {
    throw __call2063202_0(p0);
}
public static boolean h632_3(moom.Oo p0) throws Throwable {
    throw __call2063203_0(p0);
}
public static boolean h632_4(moom.Oo p0) throws Throwable {
    throw __call2063204_0(p0);
}
public static boolean h632_5(moom.Oo p0) throws Throwable {
    throw __call2063205_0(p0);
}
public static boolean h632_6(moom.Oo p0) throws Throwable {
    throw __call2063206_0(p0);
}
public static boolean h632_7(moom.Oo p0) throws Throwable {
    throw __call2063207_0(p0);
}
public static boolean h632_8(moom.Oo p0) throws Throwable {
    throw __call2063208_0(p0);
}
public static boolean h632_9(moom.Oo p0) throws Throwable {
    throw __call2063209_0(p0);
}
public static boolean h632_10(moom.Oo p0) throws Throwable {
    throw __call2063210_0(p0);
}
public static boolean h632_11(moom.Oo p0) throws Throwable {
    throw __call2063211_0(p0);
}
public static boolean h632_12(moom.Oo p0) throws Throwable {
    throw __call2063212_0(p0);
}
public static boolean h632_13(moom.Oo p0) throws Throwable {
    throw __call2063213_0(p0);
}
public static boolean h632_14(moom.Oo p0) throws Throwable {
    throw __call2063214_0(p0);
}
public static boolean h632_15(moom.Oo p0) throws Throwable {
    throw __call2063215_0(p0);
}
public static boolean h632_16(moom.Oo p0) throws Throwable {
    throw __call2063216_0(p0);
}
public static boolean h632_17(moom.Oo p0) throws Throwable {
    throw __call2063217_0(p0);
}
public static boolean h632_18(moom.Oo p0) throws Throwable {
    throw __call2063218_0(p0);
}
public static boolean h632_19(moom.Oo p0) throws Throwable {
    throw __call2063219_0(p0);
}
public static boolean h632_20(moom.Oo p0) throws Throwable {
    throw __call2063220_0(p0);
}
public static boolean h632_21(moom.Oo p0) throws Throwable {
    throw __call2063221_0(p0);
}
private static native long __fieldRead632_0() throws Throwable;
private static native java.lang.String __call632_1() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call632_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native float __call632_3(net.minecraft.world.biome.BiomeGenBase a0, moom.DT a1) throws Throwable;
private static native int __numericCompare632_4(float a0, float a1) throws Throwable;
private static native int __call632_5(moom.DT a0) throws Throwable;
private static native int __call632_6(moom.DT a0) throws Throwable;
private static native int __invokedynamic632_7(int a0, long a1) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead632_8() throws Throwable;
private static native int __call632_9(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic632_10(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call632_11(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call632_12(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.dN __fieldRead632_13() throws Throwable;
private static native moom.dM __fieldRead632_14() throws Throwable;
private static native moom.fy __fieldRead632_15() throws Throwable;
private static native java.lang.Comparable __call632_16(net.minecraft.block.state.IBlockState a0, moom.fy a1) throws Throwable;
private static native java.lang.Integer __cast632_17(java.lang.Comparable a0) throws Throwable;
private static native int __call632_18(java.lang.Integer a0) throws Throwable;
private static native int __integerCategory632_19(boolean value) throws Throwable;
private static native boolean __integerCategory632_20(int value) throws Throwable;
private static native moom.DT __call632_21(moom.DT a0) throws Throwable;
private static native boolean __call632_22(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory632_23(boolean value) throws Throwable;
private static native moom.DT __call632_24(moom.DT a0) throws Throwable;
private static native boolean __call632_25(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory632_26(boolean value) throws Throwable;
private static native moom.DT __call632_27(moom.DT a0) throws Throwable;
private static native boolean __call632_28(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory632_29(boolean value) throws Throwable;
private static native moom.DT __call632_30(moom.DT a0) throws Throwable;
private static native boolean __call632_31(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory632_32(boolean value) throws Throwable;
private static native boolean __integerCategory632_33(int value) throws Throwable;
private static native boolean __integerCategory632_34(int value) throws Throwable;
private static native java.lang.Throwable __call2063200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063209_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063210_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063211_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063212_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063213_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063214_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063215_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063216_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063217_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063218_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063219_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063220_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063221_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_eac7c02085d5f9bdc1a3(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_eac7c02085d5f9bdc1a3 {

public static void f283(net.minecraft.world.World receiver, net.minecraft.entity.Entity p0) throws Throwable {
    int forwardValue283_22_0;
    int forwardValue283_49_0;
    java.lang.String spill283_0;
    int spill283_1;
    boolean spill283_2;
    boolean spill283_3;
    long life2_3;
    java.lang.String life4_7;
    int life5_28;
    int life6_31;
    forward_join_49: {
    forward_join_45: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (__fieldRead283_0() ^ 11254429039420L);
    spill283_0 = __call283_1();
    __call283_2(p0);
    life4_7 = spill283_0;
    spill283_1 = __instanceOf283_3(p0);
    if (!((life4_7 == null))) {
        forwardValue283_22_0 = spill283_1;
        break forward_join_22;
    }
    if (!((spill283_1 != 0))) {
        break forward_join_20;
    }
    __call283_5(__fieldRead283_4(receiver), p0);
    __call283_6(receiver);
    }
    forwardValue283_22_0 = __fieldRead283_7(p0);
    }
    life5_28 = forwardValue283_22_0;
    life6_31 = __fieldRead283_8(p0);
    spill283_2 = __fieldRead283_9(p0);
    if (!((life4_7 == null))) {
        forwardValue283_49_0 = __integerCategory283_10(spill283_2);
        break forward_join_49;
    }
    if (!(spill283_2)) {
        break forward_join_45;
    }
    spill283_3 = __call283_11(receiver, life5_28, life6_31, 1);
    if (!((life4_7 == null))) {
        forwardValue283_49_0 = __integerCategory283_12(spill283_3);
        break forward_join_49;
    }
    if (!(spill283_3)) {
        break forward_join_45;
    }
    __call283_14(__call283_13(receiver, life5_28, life6_31), p0);
    }
    forwardValue283_49_0 = __integerCategory283_17(__call283_16(__fieldRead283_15(receiver), p0));
    }
    __discardScalar283_18(forwardValue283_49_0);
    __call283_19(receiver, p0);
    return;
}
public static void h283_0(moom.Oo p0) throws Throwable {
    throw __call1028300_0(p0);
}
public static void h283_1(moom.Oo p0) throws Throwable {
    throw __call1028301_0(p0);
}
public static void h283_2(moom.Oo p0) throws Throwable {
    throw __call1028302_0(p0);
}
public static void h283_3(moom.Oo p0) throws Throwable {
    throw __call1028303_0(p0);
}
public static void h283_4(moom.Oo p0) throws Throwable {
    throw __call1028304_0(p0);
}
public static void h283_5(moom.Oo p0) throws Throwable {
    throw __call1028305_0(p0);
}
private static native long __fieldRead283_0() throws Throwable;
private static native java.lang.String __call283_1() throws Throwable;
private static native void __call283_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf283_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.List __fieldRead283_4(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call283_5(java.util.List a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __call283_6(net.minecraft.world.World a0) throws Throwable;
private static native int __fieldRead283_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead283_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead283_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory283_10(boolean value) throws Throwable;
private static native boolean __call283_11(net.minecraft.world.World a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory283_12(boolean value) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call283_13(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native void __call283_14(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.util.List __fieldRead283_15(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call283_16(java.util.List a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory283_17(boolean value) throws Throwable;
private static native void __discardScalar283_18(int a0) throws Throwable;
private static native void __call283_19(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.lang.Throwable __call1028300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028305_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_c766c95ad6aafbbb4731(net.minecraft.world.World a0) throws E;
private static final class __SourceHandler_c766c95ad6aafbbb4731 {

public static int f1749(net.minecraft.world.World receiver) throws Throwable {
    int forwardValue1749_17_0;
    int forwardValue1749_23_0;
    boolean spill1749_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_23: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead1749_0() ^ 121389507658758L);
    life3_5 = __call1749_1();
    spill1749_0 = __call1749_3(__fieldRead1749_2(receiver));
    if (!((life3_5 == null))) {
        forwardValue1749_17_0 = __integerCategory1749_4(spill1749_0);
        break forward_join_17;
    }
    if (!(spill1749_0)) {
        break forward_join_18;
    }
    forwardValue1749_17_0 = __invokedynamic1749_5(7871, (7647423628277785217L ^ life1_3));
    }
    forwardValue1749_23_0 = forwardValue1749_17_0;
    break forward_join_23;
    }
    forwardValue1749_23_0 = __invokedynamic1749_6(8283, (1777050974120713290L ^ life1_3));
    }
    return forwardValue1749_23_0;
}
public static void h1749_0(moom.Oo p0) throws Throwable {
    throw __call1174900_0(p0);
}
private static native long __fieldRead1749_0() throws Throwable;
private static native java.lang.String __call1749_1() throws Throwable;
private static native moom.EA __fieldRead1749_2(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1749_3(moom.EA a0) throws Throwable;
private static native int __integerCategory1749_4(boolean value) throws Throwable;
private static native int __invokedynamic1749_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1749_6(int a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1174900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_fcc780137e86b88ff993(net.minecraft.world.World a0, moom.DT a1, boolean a2) throws E;
private static final class __SourceHandler_fcc780137e86b88ff993 {

public static boolean f633(net.minecraft.world.World receiver, moom.DT p0, boolean p1) throws Throwable {
    int forwardValue633_23_0;
    int forwardValue633_30_0;
    net.minecraft.block.Block forwardValue633_67_0;
    int forwardValue633_74_0;
    int forwardValue633_76_0;
    int forwardValue633_78_0;
    java.lang.String spill633_0;
    int spill633_1;
    int spill633_2;
    int spill633_3;
    net.minecraft.block.Block spill633_4;
    boolean spill633_5;
    long life3_3;
    net.minecraft.world.biome.BiomeGenBase life6_8;
    float life7_12;
    java.lang.String life5_13;
    net.minecraft.block.Block life8_84;
    forward_join_78: {
    forward_join_77: {
    forward_join_76: {
    forward_join_75: {
    forward_join_74: {
    forward_join_67: {
    forward_join_30: {
    forward_join_28: {
    forward_join_23: {
    forward_join_22: {
    life3_3 = (__fieldRead633_0() ^ 38505439712778L);
    spill633_0 = __call633_1();
    life6_8 = __call633_2(receiver, p0);
    life7_12 = __call633_3(life6_8, p0);
    life5_13 = spill633_0;
    spill633_1 = __numericCompare633_4(life7_12, 0x1.333334p-3f);
    if (!((life5_13 == null))) {
        forwardValue633_23_0 = spill633_1;
        break forward_join_23;
    }
    if (!((spill633_1 > 0))) {
        break forward_join_22;
    }
    return __integerCategory633_5(0);
    }
    forwardValue633_23_0 = __integerCategory633_6(p1);
    }
    if (!((life5_13 == null))) {
        forwardValue633_30_0 = forwardValue633_23_0;
        break forward_join_30;
    }
    if (!((forwardValue633_23_0 == 0))) {
        break forward_join_28;
    }
    return __integerCategory633_7(1);
    }
    forwardValue633_30_0 = __call633_8(p0);
    }
    if (!((life5_13 == null))) {
        forwardValue633_78_0 = forwardValue633_30_0;
        break forward_join_78;
    }
    if (!((forwardValue633_30_0 >= 0))) {
        break forward_join_77;
    }
    spill633_2 = __call633_9(p0);
    if (!((life5_13 == null))) {
        forwardValue633_78_0 = spill633_2;
        break forward_join_78;
    }
    if (!((spill633_2 < __invokedynamic633_10(5123, (1626598819887036951L ^ life3_3))))) {
        break forward_join_77;
    }
    spill633_3 = __call633_12(receiver, __fieldRead633_11(), p0);
    if (!((life5_13 == null))) {
        forwardValue633_78_0 = spill633_3;
        break forward_join_78;
    }
    if (!((spill633_3 < __invokedynamic633_13(28064, (3157179235779167146L ^ life3_3))))) {
        break forward_join_77;
    }
    life8_84 = __call633_15(__call633_14(receiver, p0));
    spill633_4 = life8_84;
    if (!((life5_13 == null))) {
        forwardValue633_67_0 = spill633_4;
        break forward_join_67;
    }
    if (!((__call633_16(spill633_4) == __fieldRead633_17()))) {
        break forward_join_75;
    }
    forwardValue633_67_0 = __fieldRead633_18();
    }
    spill633_5 = __call633_19(forwardValue633_67_0, receiver, p0);
    if (!((life5_13 == null))) {
        forwardValue633_74_0 = __integerCategory633_20(spill633_5);
        break forward_join_74;
    }
    if (!(spill633_5)) {
        break forward_join_75;
    }
    forwardValue633_74_0 = 1;
    }
    forwardValue633_76_0 = forwardValue633_74_0;
    break forward_join_76;
    }
    forwardValue633_76_0 = 0;
    }
    return __integerCategory633_21(forwardValue633_76_0);
    }
    forwardValue633_78_0 = 0;
    }
    return __integerCategory633_22(forwardValue633_78_0);
}
public static boolean h633_0(moom.Oo p0) throws Throwable {
    throw __call2063300_0(p0);
}
public static boolean h633_1(moom.Oo p0) throws Throwable {
    throw __call2063301_0(p0);
}
public static boolean h633_2(moom.Oo p0) throws Throwable {
    throw __call2063302_0(p0);
}
public static boolean h633_3(moom.Oo p0) throws Throwable {
    throw __call2063303_0(p0);
}
public static boolean h633_4(moom.Oo p0) throws Throwable {
    throw __call2063304_0(p0);
}
public static boolean h633_5(moom.Oo p0) throws Throwable {
    throw __call2063305_0(p0);
}
public static boolean h633_6(moom.Oo p0) throws Throwable {
    throw __call2063306_0(p0);
}
public static boolean h633_7(moom.Oo p0) throws Throwable {
    throw __call2063307_0(p0);
}
public static boolean h633_8(moom.Oo p0) throws Throwable {
    throw __call2063308_0(p0);
}
public static boolean h633_9(moom.Oo p0) throws Throwable {
    throw __call2063309_0(p0);
}
public static boolean h633_10(moom.Oo p0) throws Throwable {
    throw __call2063310_0(p0);
}
public static boolean h633_11(moom.Oo p0) throws Throwable {
    throw __call2063311_0(p0);
}
private static native long __fieldRead633_0() throws Throwable;
private static native java.lang.String __call633_1() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call633_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native float __call633_3(net.minecraft.world.biome.BiomeGenBase a0, moom.DT a1) throws Throwable;
private static native int __numericCompare633_4(float a0, float a1) throws Throwable;
private static native boolean __integerCategory633_5(int value) throws Throwable;
private static native int __integerCategory633_6(boolean value) throws Throwable;
private static native boolean __integerCategory633_7(int value) throws Throwable;
private static native int __call633_8(moom.DT a0) throws Throwable;
private static native int __call633_9(moom.DT a0) throws Throwable;
private static native int __invokedynamic633_10(int a0, long a1) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead633_11() throws Throwable;
private static native int __call633_12(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic633_13(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call633_14(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call633_15(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call633_16(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead633_17() throws Throwable;
private static native net.minecraft.block.Block __fieldRead633_18() throws Throwable;
private static native boolean __call633_19(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2) throws Throwable;
private static native int __integerCategory633_20(boolean value) throws Throwable;
private static native boolean __integerCategory633_21(int value) throws Throwable;
private static native boolean __integerCategory633_22(int value) throws Throwable;
private static native java.lang.Throwable __call2063300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063308_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063309_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063310_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063311_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_683c2d704e5f4b58d624(net.minecraft.world.World a0) throws E;
private static final class __SourceHandler_683c2d704e5f4b58d624 {

public static boolean f1750(net.minecraft.world.World receiver) throws Throwable {
    int forwardValue1750_13_0;
    int forwardValue1750_15_0;
    int spill1750_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (__fieldRead1750_0() ^ 87500614125275L);
    life3_5 = __call1750_1();
    spill1750_0 = __fieldRead1750_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue1750_13_0 = spill1750_0;
        break forward_join_13;
    }
    if (!((spill1750_0 < 4))) {
        break forward_join_14;
    }
    forwardValue1750_13_0 = 1;
    }
    forwardValue1750_15_0 = forwardValue1750_13_0;
    break forward_join_15;
    }
    forwardValue1750_15_0 = 0;
    }
    return __integerCategory1750_3(forwardValue1750_15_0);
}
public static void h1750_0(moom.Oo p0) throws Throwable {
    throw __call1175000_0(p0);
}
public static void h1750_1(moom.Oo p0) throws Throwable {
    throw __call1175001_0(p0);
}
private static native long __fieldRead1750_0() throws Throwable;
private static native java.lang.String __call1750_1() throws Throwable;
private static native int __fieldRead1750_2(net.minecraft.world.World a0) throws Throwable;
private static native boolean __integerCategory1750_3(int value) throws Throwable;
private static native java.lang.Throwable __call1175000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_17910b5ab306f41d6cbd(net.minecraft.world.World a0) throws E;
private static final class __SourceHandler_17910b5ab306f41d6cbd {

public static void f1751(net.minecraft.world.World receiver) throws Throwable {
    int forwardValue1751_20_0;
    net.minecraft.world.World forwardValue1751_22_0;
    boolean spill1751_0;
    net.minecraft.world.World spill1751_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_24: {
    forward_join_22: {
    forward_join_20: {
    life1_3 = (__fieldRead1751_0() ^ 139918517057658L);
    life3_5 = __call1751_1();
    spill1751_0 = __call1751_3(__fieldRead1751_2(receiver));
    if (!((life3_5 == null))) {
        forwardValue1751_20_0 = __integerCategory1751_4(spill1751_0);
        break forward_join_20;
    }
    if (!(spill1751_0)) {
        break forward_join_24;
    }
    __fieldWrite1751_5(receiver, 0x1.0p0f);
    spill1751_1 = receiver;
    if (!((life3_5 == null))) {
        forwardValue1751_22_0 = spill1751_1;
        break forward_join_22;
    }
    forwardValue1751_20_0 = __integerCategory1751_8(__call1751_7(__fieldRead1751_6(spill1751_1)));
    }
    if (!((forwardValue1751_20_0 != 0))) {
        break forward_join_24;
    }
    forwardValue1751_22_0 = receiver;
    }
    __fieldWrite1751_9(forwardValue1751_22_0, 0x1.0p0f);
    }
    return;
}
public static void h1751_0(moom.Oo p0) throws Throwable {
    throw __call1175100_0(p0);
}
public static void h1751_1(moom.Oo p0) throws Throwable {
    throw __call1175101_0(p0);
}
public static void h1751_2(moom.Oo p0) throws Throwable {
    throw __call1175102_0(p0);
}
private static native long __fieldRead1751_0() throws Throwable;
private static native java.lang.String __call1751_1() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1751_2(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1751_3(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory1751_4(boolean value) throws Throwable;
private static native void __fieldWrite1751_5(net.minecraft.world.World a0, float a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1751_6(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1751_7(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory1751_8(boolean value) throws Throwable;
private static native void __fieldWrite1751_9(net.minecraft.world.World a0, float a1) throws Throwable;
private static native java.lang.Throwable __call1175100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175102_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_aa8ba46a9ad6fa8ef0dd(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_aa8ba46a9ad6fa8ef0dd {

public static boolean f1752(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    moom.DT lexicalValue1752_26_0;
    int lexicalValue1752_34_0;
    int lexicalValue1752_62_0;
    int lexicalValue1752_69_0;
    moom.DT spill1752_0;
    boolean spill1752_1;
    int spill1752_2;
    boolean spill1752_3;
    long life2_3;
    java.lang.String life4_5;
    moom.DT life5_31;
    moom.DT life5_45;
    net.minecraft.block.Block life6_55;
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_35: {
    lexical_join_34: {
    lexical_join_26: {
    lexical_join_17: {
    life2_3 = (__fieldRead1752_0() ^ 43128686456556L);
    life4_5 = __call1752_1();
    spill1752_0 = p0;
    if (!((life4_5 == null))) {
        lexicalValue1752_26_0 = spill1752_0;
        break lexical_join_26;
    }
    if (!((__call1752_2(spill1752_0) >= __call1752_3(receiver)))) {
        break lexical_join_17;
    }
    return __call1752_4(receiver, p0);
    }
    lexicalValue1752_26_0 = new moom.DT(__call1752_5(p0), __call1752_6(receiver), __call1752_7(p0));
    }
    life5_31 = lexicalValue1752_26_0;
    spill1752_1 = __call1752_8(receiver, life5_31);
    if (!((life4_5 == null))) {
        lexicalValue1752_34_0 = __integerCategory1752_9(spill1752_1);
        break lexical_join_34;
    }
    if (!((!spill1752_1))) {
        break lexical_join_35;
    }
    lexicalValue1752_34_0 = 0;
    }
    return __integerCategory1752_10(lexicalValue1752_34_0);
    }
    life5_45 = __call1752_11(life5_31);
    lexical_cycle_38: while (true) {
    lexical_join_66: {
    lexical_join_63: {
    lexical_join_62: {
    if (!((__call1752_12(life5_45) > __call1752_13(p0)))) {
        break lexical_join_68;
    }
    life6_55 = __call1752_15(__call1752_14(receiver, life5_45));
    if (!((life4_5 == null))) {
        break lexical_join_66;
    }
    spill1752_2 = __call1752_16(life6_55);
    if (!((life4_5 == null))) {
        lexicalValue1752_69_0 = spill1752_2;
        break lexical_join_69;
    }
    if (!((spill1752_2 > 0))) {
        break lexical_join_63;
    }
    spill1752_3 = __call1752_18(__call1752_17(life6_55));
    if (!((life4_5 == null))) {
        lexicalValue1752_62_0 = __integerCategory1752_19(spill1752_3);
        break lexical_join_62;
    }
    if (!((!spill1752_3))) {
        break lexical_join_63;
    }
    lexicalValue1752_62_0 = 0;
    }
    return __integerCategory1752_20(lexicalValue1752_62_0);
    }
    life5_45 = __call1752_21(life5_45);
    }
    if (!((life4_5 != null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    lexicalValue1752_69_0 = 1;
    }
    return __integerCategory1752_22(lexicalValue1752_69_0);
}
public static void h1752_0(moom.Oo p0) throws Throwable {
    throw __call1175200_0(p0);
}
public static void h1752_1(moom.Oo p0) throws Throwable {
    throw __call1175201_0(p0);
}
public static void h1752_2(moom.Oo p0) throws Throwable {
    throw __call1175202_0(p0);
}
public static void h1752_3(moom.Oo p0) throws Throwable {
    throw __call1175203_0(p0);
}
public static void h1752_4(moom.Oo p0) throws Throwable {
    throw __call1175204_0(p0);
}
public static void h1752_5(moom.Oo p0) throws Throwable {
    throw __call1175205_0(p0);
}
public static void h1752_6(moom.Oo p0) throws Throwable {
    throw __call1175206_0(p0);
}
private static native long __fieldRead1752_0() throws Throwable;
private static native java.lang.String __call1752_1() throws Throwable;
private static native int __call1752_2(moom.DT a0) throws Throwable;
private static native int __call1752_3(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1752_4(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __call1752_5(moom.DT a0) throws Throwable;
private static native int __call1752_6(net.minecraft.world.World a0) throws Throwable;
private static native int __call1752_7(moom.DT a0) throws Throwable;
private static native boolean __call1752_8(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1752_9(boolean value) throws Throwable;
private static native boolean __integerCategory1752_10(int value) throws Throwable;
private static native moom.DT __call1752_11(moom.DT a0) throws Throwable;
private static native int __call1752_12(moom.DT a0) throws Throwable;
private static native int __call1752_13(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1752_14(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1752_15(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call1752_16(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __call1752_17(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call1752_18(moom.fn a0) throws Throwable;
private static native int __integerCategory1752_19(boolean value) throws Throwable;
private static native boolean __integerCategory1752_20(int value) throws Throwable;
private static native moom.DT __call1752_21(moom.DT a0) throws Throwable;
private static native boolean __integerCategory1752_22(int value) throws Throwable;
private static native java.lang.Throwable __call1175200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175206_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3aeb06a842f97c541070(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_3aeb06a842f97c541070 {

public static void f284(net.minecraft.world.World receiver, net.minecraft.entity.Entity p0) throws Throwable {
    int lexicalValue284_57_0;
    int lexicalValue284_64_0;
    java.lang.String spill284_0;
    int spill284_1;
    long life2_3;
    int life5_9;
    int life6_15;
    int life7_18;
    int life8_22;
    java.lang.String life4_23;
    int life9_34;
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_57: {
    lexical_join_53: {
    life2_3 = (__fieldRead284_0() ^ 75377989602903L);
    life5_9 = __call284_2((__fieldRead284_1(p0) / 0x1.0p4d));
    life6_15 = __call284_4((__fieldRead284_3(p0) / 0x1.0p4d));
    spill284_0 = __call284_5();
    life7_18 = 2;
    life8_22 = (life5_9 - life7_18);
    life4_23 = spill284_0;
    lexical_cycle_24: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    if (!((life8_22 <= (life5_9 + life7_18)))) {
        break lexical_join_53;
    }
    spill284_1 = (life6_15 - life7_18);
    if (!((life4_23 == null))) {
        lexicalValue284_57_0 = spill284_1;
        break lexical_join_57;
    }
    life9_34 = spill284_1;
    lexical_cycle_35: while (true) {
    if (!((life9_34 <= (life6_15 + life7_18)))) {
        break lexical_join_50;
    }
    __call284_6(receiver, life8_22, life9_34);
    life9_34 += 1;
    if (!((life4_23 == null))) {
        break lexical_join_51;
    }
    if (!((life4_23 != null))) { continue lexical_cycle_35; }
    break lexical_cycle_35;
    }
    }
    life8_22 += 1;
    }
    if (!((life4_23 != null))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    lexicalValue284_57_0 = __integerCategory284_9(__call284_8(__fieldRead284_7(receiver), p0));
    }
    if (!((life4_23 == null))) {
        lexicalValue284_64_0 = lexicalValue284_57_0;
        break lexical_join_64;
    }
    if (!((lexicalValue284_57_0 == 0))) {
        break lexical_join_65;
    }
    lexicalValue284_64_0 = __integerCategory284_12(__call284_11(__fieldRead284_10(receiver), p0));
    }
    __discardScalar284_13(lexicalValue284_64_0);
    }
    return;
}
public static void h284_0(moom.Oo p0) throws Throwable {
    throw __call1028400_0(p0);
}
public static void h284_1(moom.Oo p0) throws Throwable {
    throw __call1028401_0(p0);
}
public static void h284_2(moom.Oo p0) throws Throwable {
    throw __call1028402_0(p0);
}
private static native long __fieldRead284_0() throws Throwable;
private static native double __fieldRead284_1(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call284_2(double a0) throws Throwable;
private static native double __fieldRead284_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call284_4(double a0) throws Throwable;
private static native java.lang.String __call284_5() throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call284_6(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native java.util.List __fieldRead284_7(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call284_8(java.util.List a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory284_9(boolean value) throws Throwable;
private static native java.util.List __fieldRead284_10(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call284_11(java.util.List a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory284_12(boolean value) throws Throwable;
private static native void __discardScalar284_13(int a0) throws Throwable;
private static native java.lang.Throwable __call1028400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1028402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_2d87ac045be0ad1379a7(net.minecraft.world.World a0) throws E;
private static final class __SourceHandler_2d87ac045be0ad1379a7 {

public static boolean f634(net.minecraft.world.World receiver) throws Throwable {
    int forwardValue634_16_0;
    int forwardValue634_18_0;
    int spill634_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead634_0() ^ 54725015936592L);
    life3_5 = __call634_1();
    spill634_0 = __numericCompare634_3(((double) __call634_2(receiver, 0x1.0p0f)), 0x1.ccccccccccccdp-1d);
    if (!((life3_5 == null))) {
        forwardValue634_16_0 = spill634_0;
        break forward_join_16;
    }
    if (!((spill634_0 > 0))) {
        break forward_join_17;
    }
    forwardValue634_16_0 = 1;
    }
    forwardValue634_18_0 = forwardValue634_16_0;
    break forward_join_18;
    }
    forwardValue634_18_0 = 0;
    }
    return __integerCategory634_4(forwardValue634_18_0);
}
public static boolean h634_0(moom.Oo p0) throws Throwable {
    throw __call2063400_0(p0);
}
private static native long __fieldRead634_0() throws Throwable;
private static native java.lang.String __call634_1() throws Throwable;
private static native float __call634_2(net.minecraft.world.World a0, float a1) throws Throwable;
private static native int __numericCompare634_3(double a0, double a1) throws Throwable;
private static native boolean __integerCategory634_4(int value) throws Throwable;
private static native java.lang.Throwable __call2063400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b3e82fc32990a0cd265c(net.minecraft.world.World a0) throws E;
private static final class __SourceHandler_b3e82fc32990a0cd265c {

public static void f1754(net.minecraft.world.World receiver) throws Throwable {
    int forwardValue1754_14_0;
    int forwardValue1754_20_0;
    net.minecraft.world.storage.WorldInfo forwardValue1754_39_0;
    int forwardValue1754_39_1;
    net.minecraft.world.storage.WorldInfo forwardValue1754_40_0;
    net.minecraft.world.storage.WorldInfo forwardValue1754_41_0;
    int forwardValue1754_41_1;
    net.minecraft.world.storage.WorldInfo forwardValue1754_51_0;
    int forwardValue1754_51_1;
    net.minecraft.world.storage.WorldInfo forwardValue1754_52_0;
    net.minecraft.world.storage.WorldInfo forwardValue1754_53_0;
    int forwardValue1754_53_1;
    int forwardValue1754_57_0;
    net.minecraft.world.storage.WorldInfo forwardValue1754_89_0;
    int forwardValue1754_112_0;
    net.minecraft.world.storage.WorldInfo forwardValue1754_124_0;
    int forwardValue1754_124_1;
    net.minecraft.world.storage.WorldInfo forwardValue1754_125_0;
    net.minecraft.world.storage.WorldInfo forwardValue1754_126_0;
    int forwardValue1754_126_1;
    int forwardValue1754_136_0;
    net.minecraft.world.World forwardValue1754_148_0;
    net.minecraft.world.storage.WorldInfo forwardValue1754_197_0;
    int forwardValue1754_220_0;
    net.minecraft.world.storage.WorldInfo forwardValue1754_232_0;
    int forwardValue1754_232_1;
    net.minecraft.world.storage.WorldInfo forwardValue1754_233_0;
    net.minecraft.world.storage.WorldInfo forwardValue1754_234_0;
    int forwardValue1754_234_1;
    int forwardValue1754_244_0;
    net.minecraft.world.World forwardValue1754_256_0;
    boolean spill1754_0;
    int spill1754_1;
    net.minecraft.world.storage.WorldInfo spill1754_2;
    boolean spill1754_3;
    net.minecraft.world.storage.WorldInfo spill1754_4;
    boolean spill1754_5;
    int spill1754_6;
    net.minecraft.world.storage.WorldInfo spill1754_7;
    net.minecraft.world.storage.WorldInfo spill1754_8;
    boolean spill1754_9;
    net.minecraft.world.World spill1754_10;
    int spill1754_11;
    net.minecraft.world.storage.WorldInfo spill1754_12;
    net.minecraft.world.storage.WorldInfo spill1754_13;
    boolean spill1754_14;
    net.minecraft.world.World spill1754_15;
    long life1_3;
    java.lang.String life3_5;
    int life4_32;
    int life5_81;
    int life6_225;
    forward_join_270: {
    forward_join_263: {
    forward_join_256: {
    forward_join_255: {
    forward_join_244: {
    forward_join_235: {
    forward_join_234: {
    forward_join_233: {
    forward_join_232: {
    forward_join_220: {
    forward_join_214: {
    forward_join_197: {
    forward_join_195: {
    forward_join_155: {
    forward_join_148: {
    forward_join_147: {
    forward_join_136: {
    forward_join_127: {
    forward_join_126: {
    forward_join_125: {
    forward_join_124: {
    forward_join_112: {
    forward_join_106: {
    forward_join_89: {
    forward_join_87: {
    forward_join_57: {
    forward_join_54: {
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_20: {
    forward_join_14: {
    life1_3 = (__fieldRead1754_0() ^ 95853592998184L);
    life3_5 = __call1754_1();
    spill1754_0 = __call1754_3(__fieldRead1754_2(receiver));
    if (!((life3_5 == null))) {
        forwardValue1754_14_0 = __integerCategory1754_4(spill1754_0);
        break forward_join_14;
    }
    if (!((!spill1754_0))) {
        break forward_join_270;
    }
    forwardValue1754_14_0 = __integerCategory1754_6(__fieldRead1754_5(receiver));
    }
    if (!((life3_5 == null))) {
        forwardValue1754_20_0 = forwardValue1754_14_0;
        break forward_join_20;
    }
    if (!((forwardValue1754_14_0 == 0))) {
        break forward_join_270;
    }
    forwardValue1754_20_0 = __call1754_8(__fieldRead1754_7(receiver));
    }
    life4_32 = forwardValue1754_20_0;
    spill1754_1 = life4_32;
    if (!((life3_5 == null))) {
        forwardValue1754_57_0 = spill1754_1;
        break forward_join_57;
    }
    if (!((spill1754_1 > 0))) {
        break forward_join_54;
    }
    life4_32 += -1;
    __call1754_10(__fieldRead1754_9(receiver), life4_32);
    spill1754_2 = __fieldRead1754_11(receiver);
    spill1754_3 = __call1754_13(__fieldRead1754_12(receiver));
    if (!((life3_5 == null))) {
        forwardValue1754_39_0 = spill1754_2;
        forwardValue1754_39_1 = __integerCategory1754_14(spill1754_3);
        break forward_join_39;
    }
    if (!(spill1754_3)) {
        forwardValue1754_40_0 = spill1754_2;
        break forward_join_40;
    }
    forwardValue1754_39_0 = spill1754_2;
    forwardValue1754_39_1 = 1;
    }
    forwardValue1754_41_0 = forwardValue1754_39_0;
    forwardValue1754_41_1 = forwardValue1754_39_1;
    break forward_join_41;
    }
    forwardValue1754_41_0 = forwardValue1754_40_0;
    forwardValue1754_41_1 = 2;
    }
    __call1754_15(forwardValue1754_41_0, forwardValue1754_41_1);
    spill1754_4 = __fieldRead1754_16(receiver);
    spill1754_5 = __call1754_18(__fieldRead1754_17(receiver));
    if (!((life3_5 == null))) {
        forwardValue1754_51_0 = spill1754_4;
        forwardValue1754_51_1 = __integerCategory1754_19(spill1754_5);
        break forward_join_51;
    }
    if (!(spill1754_5)) {
        forwardValue1754_52_0 = spill1754_4;
        break forward_join_52;
    }
    forwardValue1754_51_0 = spill1754_4;
    forwardValue1754_51_1 = 1;
    }
    forwardValue1754_53_0 = forwardValue1754_51_0;
    forwardValue1754_53_1 = forwardValue1754_51_1;
    break forward_join_53;
    }
    forwardValue1754_53_0 = forwardValue1754_52_0;
    forwardValue1754_53_1 = 2;
    }
    __call1754_20(forwardValue1754_53_0, forwardValue1754_53_1);
    }
    forwardValue1754_57_0 = __call1754_22(__fieldRead1754_21(receiver));
    }
    life5_81 = forwardValue1754_57_0;
    spill1754_6 = life5_81;
    if (!((life3_5 == null))) {
        forwardValue1754_112_0 = spill1754_6;
        break forward_join_112;
    }
    if (!((spill1754_6 <= 0))) {
        break forward_join_106;
    }
    spill1754_7 = __fieldRead1754_23(receiver);
    if (!((life3_5 == null))) {
        forwardValue1754_89_0 = spill1754_7;
        break forward_join_89;
    }
    if (!(__call1754_24(spill1754_7))) {
        break forward_join_87;
    }
    __call1754_30(__fieldRead1754_25(receiver), (__call1754_28(__fieldRead1754_26(receiver), __invokedynamic1754_27(19017, (2316871891620742004L ^ life1_3))) + __invokedynamic1754_29(11247, (8534342321619772143L ^ life1_3))));
    if (!((life3_5 != null))) {
        break forward_join_127;
    }
    }
    forwardValue1754_89_0 = __fieldRead1754_31(receiver);
    }
    __call1754_36(forwardValue1754_89_0, (__call1754_34(__fieldRead1754_32(receiver), __invokedynamic1754_33(285, (8489535450330695691L ^ life1_3))) + __invokedynamic1754_35(8601, (1414631338793937075L ^ life1_3))));
    if (!((life3_5 != null))) {
        break forward_join_127;
    }
    }
    life5_81 += -1;
    __call1754_38(__fieldRead1754_37(receiver), life5_81);
    forwardValue1754_112_0 = life5_81;
    }
    if (!((life3_5 == null))) {
        forwardValue1754_136_0 = forwardValue1754_112_0;
        break forward_join_136;
    }
    if (!((forwardValue1754_112_0 <= 0))) {
        break forward_join_127;
    }
    spill1754_8 = __fieldRead1754_39(receiver);
    spill1754_9 = __call1754_41(__fieldRead1754_40(receiver));
    if (!((life3_5 == null))) {
        forwardValue1754_124_0 = spill1754_8;
        forwardValue1754_124_1 = __integerCategory1754_42(spill1754_9);
        break forward_join_124;
    }
    if (!((!spill1754_9))) {
        forwardValue1754_125_0 = spill1754_8;
        break forward_join_125;
    }
    forwardValue1754_124_0 = spill1754_8;
    forwardValue1754_124_1 = 1;
    }
    forwardValue1754_126_0 = forwardValue1754_124_0;
    forwardValue1754_126_1 = forwardValue1754_124_1;
    break forward_join_126;
    }
    forwardValue1754_126_0 = forwardValue1754_125_0;
    forwardValue1754_126_1 = 0;
    }
    __call1754_43(forwardValue1754_126_0, forwardValue1754_126_1);
    }
    __fieldWrite1754_45(receiver, __fieldRead1754_44(receiver));
    spill1754_10 = receiver;
    if (!((life3_5 == null))) {
        forwardValue1754_148_0 = spill1754_10;
        break forward_join_148;
    }
    forwardValue1754_136_0 = __integerCategory1754_48(__call1754_47(__fieldRead1754_46(spill1754_10)));
    }
    if (!((forwardValue1754_136_0 != 0))) {
        break forward_join_147;
    }
    __fieldWrite1754_50(receiver, ((float) (((double) __fieldRead1754_49(receiver)) + 0x1.47ae147ae147bp-7d)));
    if (!((life3_5 != null))) {
        break forward_join_155;
    }
    }
    forwardValue1754_148_0 = receiver;
    }
    __fieldWrite1754_52(forwardValue1754_148_0, ((float) (((double) __fieldRead1754_51(receiver)) - 0x1.47ae147ae147bp-7d)));
    }
    __fieldWrite1754_55(receiver, __call1754_54(__fieldRead1754_53(receiver), 0x0.0p0f, 0x1.0p0f));
    life6_225 = __call1754_57(__fieldRead1754_56(receiver));
    spill1754_11 = life6_225;
    if (!((life3_5 == null))) {
        forwardValue1754_220_0 = spill1754_11;
        break forward_join_220;
    }
    if (!((spill1754_11 <= 0))) {
        break forward_join_214;
    }
    spill1754_12 = __fieldRead1754_58(receiver);
    if (!((life3_5 == null))) {
        forwardValue1754_197_0 = spill1754_12;
        break forward_join_197;
    }
    if (!(__call1754_59(spill1754_12))) {
        break forward_join_195;
    }
    __call1754_65(__fieldRead1754_60(receiver), (__call1754_63(__fieldRead1754_61(receiver), __invokedynamic1754_62(8601, (1414631338793937075L ^ life1_3))) + __invokedynamic1754_64(8601, (1414631338793937075L ^ life1_3))));
    if (!((life3_5 != null))) {
        break forward_join_235;
    }
    }
    forwardValue1754_197_0 = __fieldRead1754_66(receiver);
    }
    __call1754_71(forwardValue1754_197_0, (__call1754_69(__fieldRead1754_67(receiver), __invokedynamic1754_68(2217, (1172837467213758873L ^ life1_3))) + __invokedynamic1754_70(8601, (1414631338793937075L ^ life1_3))));
    if (!((life3_5 != null))) {
        break forward_join_235;
    }
    }
    life6_225 += -1;
    __call1754_73(__fieldRead1754_72(receiver), life6_225);
    forwardValue1754_220_0 = life6_225;
    }
    if (!((life3_5 == null))) {
        forwardValue1754_244_0 = forwardValue1754_220_0;
        break forward_join_244;
    }
    if (!((forwardValue1754_220_0 <= 0))) {
        break forward_join_235;
    }
    spill1754_13 = __fieldRead1754_74(receiver);
    spill1754_14 = __call1754_76(__fieldRead1754_75(receiver));
    if (!((life3_5 == null))) {
        forwardValue1754_232_0 = spill1754_13;
        forwardValue1754_232_1 = __integerCategory1754_77(spill1754_14);
        break forward_join_232;
    }
    if (!((!spill1754_14))) {
        forwardValue1754_233_0 = spill1754_13;
        break forward_join_233;
    }
    forwardValue1754_232_0 = spill1754_13;
    forwardValue1754_232_1 = 1;
    }
    forwardValue1754_234_0 = forwardValue1754_232_0;
    forwardValue1754_234_1 = forwardValue1754_232_1;
    break forward_join_234;
    }
    forwardValue1754_234_0 = forwardValue1754_233_0;
    forwardValue1754_234_1 = 0;
    }
    __call1754_78(forwardValue1754_234_0, forwardValue1754_234_1);
    }
    __fieldWrite1754_80(receiver, __fieldRead1754_79(receiver));
    spill1754_15 = receiver;
    if (!((life3_5 == null))) {
        forwardValue1754_256_0 = spill1754_15;
        break forward_join_256;
    }
    forwardValue1754_244_0 = __integerCategory1754_83(__call1754_82(__fieldRead1754_81(spill1754_15)));
    }
    if (!((forwardValue1754_244_0 != 0))) {
        break forward_join_255;
    }
    __fieldWrite1754_85(receiver, ((float) (((double) __fieldRead1754_84(receiver)) + 0x1.47ae147ae147bp-7d)));
    if (!((life3_5 != null))) {
        break forward_join_263;
    }
    }
    forwardValue1754_256_0 = receiver;
    }
    __fieldWrite1754_87(forwardValue1754_256_0, ((float) (((double) __fieldRead1754_86(receiver)) - 0x1.47ae147ae147bp-7d)));
    }
    __fieldWrite1754_90(receiver, __call1754_89(__fieldRead1754_88(receiver), 0x0.0p0f, 0x1.0p0f));
    }
    return;
}
public static void h1754_0(moom.Oo p0) throws Throwable {
    throw __call1175400_0(p0);
}
public static void h1754_1(moom.Oo p0) throws Throwable {
    throw __call1175401_0(p0);
}
public static void h1754_2(moom.Oo p0) throws Throwable {
    throw __call1175402_0(p0);
}
public static void h1754_3(moom.Oo p0) throws Throwable {
    throw __call1175403_0(p0);
}
public static void h1754_4(moom.Oo p0) throws Throwable {
    throw __call1175404_0(p0);
}
public static void h1754_5(moom.Oo p0) throws Throwable {
    throw __call1175405_0(p0);
}
public static void h1754_6(moom.Oo p0) throws Throwable {
    throw __call1175406_0(p0);
}
public static void h1754_7(moom.Oo p0) throws Throwable {
    throw __call1175407_0(p0);
}
public static void h1754_8(moom.Oo p0) throws Throwable {
    throw __call1175408_0(p0);
}
public static void h1754_9(moom.Oo p0) throws Throwable {
    throw __call1175409_0(p0);
}
public static void h1754_10(moom.Oo p0) throws Throwable {
    throw __call1175410_0(p0);
}
public static void h1754_11(moom.Oo p0) throws Throwable {
    throw __call1175411_0(p0);
}
public static void h1754_12(moom.Oo p0) throws Throwable {
    throw __call1175412_0(p0);
}
public static void h1754_13(moom.Oo p0) throws Throwable {
    throw __call1175413_0(p0);
}
public static void h1754_14(moom.Oo p0) throws Throwable {
    throw __call1175414_0(p0);
}
public static void h1754_15(moom.Oo p0) throws Throwable {
    throw __call1175415_0(p0);
}
public static void h1754_16(moom.Oo p0) throws Throwable {
    throw __call1175416_0(p0);
}
public static void h1754_17(moom.Oo p0) throws Throwable {
    throw __call1175417_0(p0);
}
public static void h1754_18(moom.Oo p0) throws Throwable {
    throw __call1175418_0(p0);
}
public static void h1754_19(moom.Oo p0) throws Throwable {
    throw __call1175419_0(p0);
}
public static void h1754_20(moom.Oo p0) throws Throwable {
    throw __call1175420_0(p0);
}
public static void h1754_21(moom.Oo p0) throws Throwable {
    throw __call1175421_0(p0);
}
public static void h1754_22(moom.Oo p0) throws Throwable {
    throw __call1175422_0(p0);
}
public static void h1754_23(moom.Oo p0) throws Throwable {
    throw __call1175423_0(p0);
}
public static void h1754_24(moom.Oo p0) throws Throwable {
    throw __call1175424_0(p0);
}
public static void h1754_25(moom.Oo p0) throws Throwable {
    throw __call1175425_0(p0);
}
public static void h1754_26(moom.Oo p0) throws Throwable {
    throw __call1175426_0(p0);
}
public static void h1754_27(moom.Oo p0) throws Throwable {
    throw __call1175427_0(p0);
}
public static void h1754_28(moom.Oo p0) throws Throwable {
    throw __call1175428_0(p0);
}
public static void h1754_29(moom.Oo p0) throws Throwable {
    throw __call1175429_0(p0);
}
public static void h1754_30(moom.Oo p0) throws Throwable {
    throw __call1175430_0(p0);
}
public static void h1754_31(moom.Oo p0) throws Throwable {
    throw __call1175431_0(p0);
}
private static native long __fieldRead1754_0() throws Throwable;
private static native java.lang.String __call1754_1() throws Throwable;
private static native moom.EA __fieldRead1754_2(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1754_3(moom.EA a0) throws Throwable;
private static native int __integerCategory1754_4(boolean value) throws Throwable;
private static native boolean __fieldRead1754_5(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1754_6(boolean value) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_7(net.minecraft.world.World a0) throws Throwable;
private static native int __call1754_8(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_9(net.minecraft.world.World a0) throws Throwable;
private static native void __call1754_10(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_11(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_12(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1754_13(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory1754_14(boolean value) throws Throwable;
private static native void __call1754_15(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_16(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_17(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1754_18(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory1754_19(boolean value) throws Throwable;
private static native void __call1754_20(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_21(net.minecraft.world.World a0) throws Throwable;
private static native int __call1754_22(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_23(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1754_24(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_25(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Random __fieldRead1754_26(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1754_27(int a0, long a1) throws Throwable;
private static native int __call1754_28(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic1754_29(int a0, long a1) throws Throwable;
private static native void __call1754_30(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_31(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Random __fieldRead1754_32(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1754_33(int a0, long a1) throws Throwable;
private static native int __call1754_34(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic1754_35(int a0, long a1) throws Throwable;
private static native void __call1754_36(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_37(net.minecraft.world.World a0) throws Throwable;
private static native void __call1754_38(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_39(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_40(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1754_41(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory1754_42(boolean value) throws Throwable;
private static native void __call1754_43(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native float __fieldRead1754_44(net.minecraft.world.World a0) throws Throwable;
private static native void __fieldWrite1754_45(net.minecraft.world.World a0, float a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_46(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1754_47(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory1754_48(boolean value) throws Throwable;
private static native float __fieldRead1754_49(net.minecraft.world.World a0) throws Throwable;
private static native void __fieldWrite1754_50(net.minecraft.world.World a0, float a1) throws Throwable;
private static native float __fieldRead1754_51(net.minecraft.world.World a0) throws Throwable;
private static native void __fieldWrite1754_52(net.minecraft.world.World a0, float a1) throws Throwable;
private static native float __fieldRead1754_53(net.minecraft.world.World a0) throws Throwable;
private static native float __call1754_54(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite1754_55(net.minecraft.world.World a0, float a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_56(net.minecraft.world.World a0) throws Throwable;
private static native int __call1754_57(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_58(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1754_59(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_60(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Random __fieldRead1754_61(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1754_62(int a0, long a1) throws Throwable;
private static native int __call1754_63(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic1754_64(int a0, long a1) throws Throwable;
private static native void __call1754_65(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_66(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Random __fieldRead1754_67(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1754_68(int a0, long a1) throws Throwable;
private static native int __call1754_69(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic1754_70(int a0, long a1) throws Throwable;
private static native void __call1754_71(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_72(net.minecraft.world.World a0) throws Throwable;
private static native void __call1754_73(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_74(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_75(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1754_76(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory1754_77(boolean value) throws Throwable;
private static native void __call1754_78(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native float __fieldRead1754_79(net.minecraft.world.World a0) throws Throwable;
private static native void __fieldWrite1754_80(net.minecraft.world.World a0, float a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1754_81(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1754_82(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory1754_83(boolean value) throws Throwable;
private static native float __fieldRead1754_84(net.minecraft.world.World a0) throws Throwable;
private static native void __fieldWrite1754_85(net.minecraft.world.World a0, float a1) throws Throwable;
private static native float __fieldRead1754_86(net.minecraft.world.World a0) throws Throwable;
private static native void __fieldWrite1754_87(net.minecraft.world.World a0, float a1) throws Throwable;
private static native float __fieldRead1754_88(net.minecraft.world.World a0) throws Throwable;
private static native float __call1754_89(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite1754_90(net.minecraft.world.World a0, float a1) throws Throwable;
private static native java.lang.Throwable __call1175400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175410_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175411_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175412_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175413_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175414_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175415_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175416_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175417_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175418_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175419_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175420_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175421_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175422_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175423_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175424_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175425_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175426_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175427_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175428_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175429_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175430_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175431_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_8c66ecb73bf81029b7f4(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_8c66ecb73bf81029b7f4 {

public static boolean f1755(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    moom.CA forwardValue1755_22_0;
    int forwardValue1755_29_0;
    int forwardValue1755_31_0;
    java.lang.String spill1755_0;
    moom.CA spill1755_1;
    int spill1755_2;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_8;
    moom.CA life6_15;
    java.lang.String life4_16;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_22: {
    life2_3 = (__fieldRead1755_0() ^ 41872044550119L);
    spill1755_0 = __call1755_1();
    life5_8 = __call1755_2(receiver, p0);
    life6_15 = __call1755_4(__call1755_3(life5_8), receiver, p0, life5_8);
    life4_16 = spill1755_0;
    spill1755_1 = life6_15;
    if (!((life4_16 == null))) {
        forwardValue1755_22_0 = spill1755_1;
        break forward_join_22;
    }
    if (!((spill1755_1 != null))) {
        break forward_join_30;
    }
    forwardValue1755_22_0 = life6_15;
    }
    spill1755_2 = __numericCompare1755_6(__call1755_5(forwardValue1755_22_0), 0x1.0p0d);
    if (!((life4_16 == null))) {
        forwardValue1755_29_0 = spill1755_2;
        break forward_join_29;
    }
    if (!((spill1755_2 >= 0))) {
        break forward_join_30;
    }
    forwardValue1755_29_0 = 1;
    }
    forwardValue1755_31_0 = forwardValue1755_29_0;
    break forward_join_31;
    }
    forwardValue1755_31_0 = 0;
    }
    return __integerCategory1755_7(forwardValue1755_31_0);
}
public static void h1755_0(moom.Oo p0) throws Throwable {
    throw __call1175500_0(p0);
}
public static void h1755_1(moom.Oo p0) throws Throwable {
    throw __call1175501_0(p0);
}
private static native long __fieldRead1755_0() throws Throwable;
private static native java.lang.String __call1755_1() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1755_2(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1755_3(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.CA __call1755_4(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3) throws Throwable;
private static native double __call1755_5(moom.CA a0) throws Throwable;
private static native int __numericCompare1755_6(double a0, double a1) throws Throwable;
private static native boolean __integerCategory1755_7(int value) throws Throwable;
private static native java.lang.Throwable __call1175500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e0e8e896ac0e59fe80b4(net.minecraft.world.World a0) throws E;
private static final class __SourceHandler_e0e8e896ac0e59fe80b4 {

public static boolean f635(net.minecraft.world.World receiver) throws Throwable {
    int forwardValue635_16_0;
    int forwardValue635_18_0;
    int spill635_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead635_0() ^ 53613945605069L);
    life3_5 = __call635_1();
    spill635_0 = __numericCompare635_3(((double) __call635_2(receiver, 0x1.0p0f)), 0x1.999999999999ap-3d);
    if (!((life3_5 == null))) {
        forwardValue635_16_0 = spill635_0;
        break forward_join_16;
    }
    if (!((spill635_0 > 0))) {
        break forward_join_17;
    }
    forwardValue635_16_0 = 1;
    }
    forwardValue635_18_0 = forwardValue635_16_0;
    break forward_join_18;
    }
    forwardValue635_18_0 = 0;
    }
    return __integerCategory635_4(forwardValue635_18_0);
}
public static boolean h635_0(moom.Oo p0) throws Throwable {
    throw __call2063500_0(p0);
}
private static native long __fieldRead635_0() throws Throwable;
private static native java.lang.String __call635_1() throws Throwable;
private static native float __call635_2(net.minecraft.world.World a0, float a1) throws Throwable;
private static native int __numericCompare635_3(double a0, double a1) throws Throwable;
private static native boolean __integerCategory635_4(int value) throws Throwable;
private static native java.lang.Throwable __call2063500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_243dbd8c746df15fec94(net.minecraft.world.World a0) throws E;
private static final class __SourceHandler_243dbd8c746df15fec94 {

public static void f1156(net.minecraft.world.World receiver) throws Throwable {
    int forestValue1156_19_0;
    int forestValue1156_83_0;
    int forestValue1156_101_0;
    net.minecraft.world.World forestValue1156_170_0;
    java.lang.String spill1156_0;
    int spill1156_1;
    int spill1156_2;
    net.minecraft.world.World spill1156_3;
    long life1_3;
    java.util.Iterator life4_15;
    java.lang.String life3_16;
    net.minecraft.entity.player.EntityPlayer life5_23;
    int life6_29;
    int life7_35;
    int life8_38;
    int life9_43;
    int life10_51;
    int life4_112;
    net.minecraft.entity.player.EntityPlayer life5_118;
    int life6_133;
    int life7_148;
    int life8_163;
    forest_join_170: {
    forest_join_169: {
    forest_join_101: {
    forest_join_92: {
    forest_join_83: {
    forest_join_78: {
    life1_3 = (__fieldRead1156_0() ^ 77134466416409L);
    __call1156_2(__fieldRead1156_1(receiver));
    spill1156_0 = __call1156_3();
    __call1156_5(__fieldRead1156_4(receiver), "buildList");
    life4_15 = __call1156_7(__fieldRead1156_6(receiver));
    life3_16 = spill1156_0;
    forest_cycle_17: while (true) {
    forest_join_76: {
    forestValue1156_19_0 = __integerCategory1156_9(__call1156_8(life4_15));
    forest_cycle_19: while (true) {
    if (!((forestValue1156_19_0 != 0))) {
        break forest_join_78;
    }
    life5_23 = __cast1156_11(__call1156_10(life4_15));
    life6_29 = __call1156_13((__fieldRead1156_12(life5_23) / 0x1.0p4d));
    life7_35 = __call1156_15((__fieldRead1156_14(life5_23) / 0x1.0p4d));
    life8_38 = __call1156_16(receiver);
    spill1156_1 = (-life8_38);
    if (!((life3_16 == null))) {
        forestValue1156_83_0 = spill1156_1;
        break forest_join_83;
    }
    life9_43 = spill1156_1;
    forest_cycle_44: while (true) {
    forest_join_74: {
    forest_join_73: {
    if (!((life9_43 <= life8_38))) {
        break forest_join_76;
    }
    spill1156_2 = (-life8_38);
    if (!((life3_16 == null))) {
        forestValue1156_19_0 = spill1156_2;
        continue forest_cycle_19;
    }
    life10_51 = spill1156_2;
    forest_cycle_52: while (true) {
    if (!((life10_51 <= life8_38))) {
        break forest_join_73;
    }
    __call1156_18(__fieldRead1156_17(receiver), new moom.Ee((life9_43 + life6_29), (life10_51 + life7_35)));
    life10_51 += 1;
    if (!((life3_16 == null))) {
        break forest_join_74;
    }
    if (!((life3_16 != null))) {
        continue forest_cycle_52;
    }
    break forest_cycle_52;
    }
    }
    life9_43 += 1;
    }
    if (!((life3_16 != null))) {
        continue forest_cycle_44;
    }
    break forest_cycle_44;
    }
    break forest_cycle_19;
    }
    }
    if (!((life3_16 != null))) {
        continue forest_cycle_17;
    }
    break forest_cycle_17;
    }
    }
    __call1156_20(__fieldRead1156_19(receiver));
    forestValue1156_83_0 = __fieldRead1156_21(receiver);
    }
    if (!((life3_16 == null))) {
        forestValue1156_101_0 = forestValue1156_83_0;
        break forest_join_101;
    }
    if (!((forestValue1156_83_0 > 0))) {
        break forest_join_92;
    }
    net.minecraft.world.World __stackOp1156_22_0 = receiver;
    __fieldWrite1156_24(__stackOp1156_22_0, (__fieldRead1156_23(__stackOp1156_22_0) - 1));
    }
    __call1156_26(__fieldRead1156_25(receiver), "playerCheckLight");
    spill1156_3 = receiver;
    if (!((life3_16 == null))) {
        forestValue1156_170_0 = spill1156_3;
        break forest_join_170;
    }
    forestValue1156_101_0 = __integerCategory1156_29(__call1156_28(__fieldRead1156_27(spill1156_3)));
    }
    if (!((forestValue1156_101_0 == 0))) {
        break forest_join_169;
    }
    life4_112 = __call1156_33(__fieldRead1156_30(receiver), __call1156_32(__fieldRead1156_31(receiver)));
    life5_118 = __cast1156_36(__call1156_35(__fieldRead1156_34(receiver), life4_112));
    life6_133 = ((__call1156_38(__fieldRead1156_37(life5_118)) + __call1156_41(__fieldRead1156_39(receiver), __invokedynamic1156_40(27486, (4802849786438708311L ^ life1_3)))) - 5);
    life7_148 = ((__call1156_43(__fieldRead1156_42(life5_118)) + __call1156_46(__fieldRead1156_44(receiver), __invokedynamic1156_45(27860, (5906829276340710392L ^ life1_3)))) - 5);
    life8_163 = ((__call1156_48(__fieldRead1156_47(life5_118)) + __call1156_51(__fieldRead1156_49(receiver), __invokedynamic1156_50(27860, (5906829276340710392L ^ life1_3)))) - 5);
    __call1156_52(receiver, new moom.DT(life6_133, life7_148, life8_163));
    }
    forestValue1156_170_0 = receiver;
    }
    __call1156_54(__fieldRead1156_53(forestValue1156_170_0));
    return;
}
public static void h1156_0(moom.Oo p0) throws Throwable {
    throw __call3115600_0(p0);
}
public static void h1156_1(moom.Oo p0) throws Throwable {
    throw __call3115601_0(p0);
}
public static void h1156_2(moom.Oo p0) throws Throwable {
    throw __call3115602_0(p0);
}
public static void h1156_3(moom.Oo p0) throws Throwable {
    throw __call3115603_0(p0);
}
private static native long __fieldRead1156_0() throws Throwable;
private static native java.util.Set __fieldRead1156_1(net.minecraft.world.World a0) throws Throwable;
private static native void __call1156_2(java.util.Set a0) throws Throwable;
private static native java.lang.String __call1156_3() throws Throwable;
private static native moom.A9 __fieldRead1156_4(net.minecraft.world.World a0) throws Throwable;
private static native void __call1156_5(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead1156_6(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call1156_7(java.util.List a0) throws Throwable;
private static native boolean __call1156_8(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory1156_9(boolean value) throws Throwable;
private static native java.lang.Object __call1156_10(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1156_11(java.lang.Object a0) throws Throwable;
private static native double __fieldRead1156_12(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __call1156_13(double a0) throws Throwable;
private static native double __fieldRead1156_14(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __call1156_15(double a0) throws Throwable;
private static native int __call1156_16(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Set __fieldRead1156_17(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1156_18(java.util.Set a0, moom.Ee a1) throws Throwable;
private static native moom.A9 __fieldRead1156_19(net.minecraft.world.World a0) throws Throwable;
private static native void __call1156_20(moom.A9 a0) throws Throwable;
private static native int __fieldRead1156_21(net.minecraft.world.World a0) throws Throwable;
private static native int __fieldRead1156_23(net.minecraft.world.World a0) throws Throwable;
private static native void __fieldWrite1156_24(net.minecraft.world.World a0, int a1) throws Throwable;
private static native moom.A9 __fieldRead1156_25(net.minecraft.world.World a0) throws Throwable;
private static native void __call1156_26(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead1156_27(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1156_28(java.util.List a0) throws Throwable;
private static native int __integerCategory1156_29(boolean value) throws Throwable;
private static native java.util.Random __fieldRead1156_30(net.minecraft.world.World a0) throws Throwable;
private static native java.util.List __fieldRead1156_31(net.minecraft.world.World a0) throws Throwable;
private static native int __call1156_32(java.util.List a0) throws Throwable;
private static native int __call1156_33(java.util.Random a0, int a1) throws Throwable;
private static native java.util.List __fieldRead1156_34(net.minecraft.world.World a0) throws Throwable;
private static native java.lang.Object __call1156_35(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1156_36(java.lang.Object a0) throws Throwable;
private static native double __fieldRead1156_37(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __call1156_38(double a0) throws Throwable;
private static native java.util.Random __fieldRead1156_39(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1156_40(int a0, long a1) throws Throwable;
private static native int __call1156_41(java.util.Random a0, int a1) throws Throwable;
private static native double __fieldRead1156_42(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __call1156_43(double a0) throws Throwable;
private static native java.util.Random __fieldRead1156_44(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1156_45(int a0, long a1) throws Throwable;
private static native int __call1156_46(java.util.Random a0, int a1) throws Throwable;
private static native double __fieldRead1156_47(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __call1156_48(double a0) throws Throwable;
private static native java.util.Random __fieldRead1156_49(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1156_50(int a0, long a1) throws Throwable;
private static native int __call1156_51(java.util.Random a0, int a1) throws Throwable;
private static native boolean __call1156_52(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native moom.A9 __fieldRead1156_53(net.minecraft.world.World a0) throws Throwable;
private static native void __call1156_54(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call3115600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3115603_0(moom.Oo a0) throws Throwable;

}



private static native <E extends Throwable> boolean __sourceHandlerCall_34cb10644470300efb5f(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_34cb10644470300efb5f {

public static boolean f3110(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead3110_0() ^ 140545559884584L);
    return ((__call3110_3(__call3110_2(__call3110_1(receiver, p0))) == __fieldRead3110_4()) ? true : false);
}
public static void h3110_0(moom.Oo p0) throws Throwable {
    throw __call1311000_0(p0);
}
private static native long __fieldRead3110_0() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call3110_1(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call3110_2(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call3110_3(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead3110_4() throws Throwable;
private static native java.lang.Throwable __call1311000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d045f0be0f39068343f8(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_d045f0be0f39068343f8 {

public static boolean f1757(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    int forwardValue1757_29_0;
    java.lang.String spill1757_0;
    boolean spill1757_1;
    long life2_3;
    int life5_6;
    java.lang.String life4_7;
    int life5_30;
    forward_join_29: {
    forward_join_21: {
    life2_3 = (__fieldRead1757_0() ^ 62319303010748L);
    spill1757_0 = __call1757_1();
    life5_6 = 0;
    life4_7 = spill1757_0;
    spill1757_1 = __call1757_3(__fieldRead1757_2(receiver));
    if (!((life4_7 == null))) {
        forwardValue1757_29_0 = __integerCategory1757_4(spill1757_1);
        break forward_join_29;
    }
    if (!((!spill1757_1))) {
        break forward_join_21;
    }
    life5_6 = (life5_6 | __integerCategoryRepair1757_0(__call1757_6(receiver, __fieldRead1757_5(), p0)));
    }
    life5_30 = (life5_6 | __integerCategoryRepair1757_1(__call1757_8(receiver, __fieldRead1757_7(), p0)));
    forwardValue1757_29_0 = life5_30;
    }
    return __integerCategory1757_9(forwardValue1757_29_0);
}
public static void h1757_0(moom.Oo p0) throws Throwable {
    throw __call1175700_0(p0);
}
private static native long __fieldRead1757_0() throws Throwable;
private static native java.lang.String __call1757_1() throws Throwable;
private static native moom.EA __fieldRead1757_2(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1757_3(moom.EA a0) throws Throwable;
private static native int __integerCategory1757_4(boolean value) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1757_5() throws Throwable;
private static native boolean __call1757_6(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1757_7() throws Throwable;
private static native boolean __call1757_8(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native boolean __integerCategory1757_9(int value) throws Throwable;
private static native java.lang.Throwable __call1175700_0(moom.Oo a0) throws Throwable;
private static native int __integerCategoryRepair1757_0(boolean value) throws Throwable;
private static native int __integerCategoryRepair1757_1(boolean value) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_8ab203839bec24300a3d(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_8ab203839bec24300a3d {

public static boolean f1758(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    int forwardValue1758_55_0;
    int forwardValue1758_57_0;
    int spill1758_0;
    int spill1758_1;
    int spill1758_2;
    int spill1758_3;
    int spill1758_4;
    int spill1758_5;
    long life2_3;
    java.lang.String life4_5;
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    life2_3 = (__fieldRead1758_0() ^ 17265760594451L);
    life4_5 = __call1758_1();
    spill1758_0 = __call1758_4(receiver, __call1758_2(p0), __fieldRead1758_3());
    if (!((life4_5 == null))) {
        forwardValue1758_55_0 = spill1758_0;
        break forward_join_55;
    }
    if (!((spill1758_0 <= 0))) {
        break forward_join_54;
    }
    spill1758_1 = __call1758_7(receiver, __call1758_5(p0), __fieldRead1758_6());
    if (!((life4_5 == null))) {
        forwardValue1758_55_0 = spill1758_1;
        break forward_join_55;
    }
    if (!((spill1758_1 <= 0))) {
        break forward_join_54;
    }
    spill1758_2 = __call1758_10(receiver, __call1758_8(p0), __fieldRead1758_9());
    if (!((life4_5 == null))) {
        forwardValue1758_55_0 = spill1758_2;
        break forward_join_55;
    }
    if (!((spill1758_2 <= 0))) {
        break forward_join_54;
    }
    spill1758_3 = __call1758_13(receiver, __call1758_11(p0), __fieldRead1758_12());
    if (!((life4_5 == null))) {
        forwardValue1758_55_0 = spill1758_3;
        break forward_join_55;
    }
    if (!((spill1758_3 <= 0))) {
        break forward_join_54;
    }
    spill1758_4 = __call1758_16(receiver, __call1758_14(p0), __fieldRead1758_15());
    if (!((life4_5 == null))) {
        forwardValue1758_55_0 = spill1758_4;
        break forward_join_55;
    }
    if (!((spill1758_4 <= 0))) {
        break forward_join_54;
    }
    spill1758_5 = __call1758_19(receiver, __call1758_17(p0), __fieldRead1758_18());
    if (!((life4_5 == null))) {
        forwardValue1758_55_0 = spill1758_5;
        break forward_join_55;
    }
    if (!((spill1758_5 > 0))) {
        break forward_join_56;
    }
    }
    forwardValue1758_55_0 = 1;
    }
    forwardValue1758_57_0 = forwardValue1758_55_0;
    break forward_join_57;
    }
    forwardValue1758_57_0 = 0;
    }
    return __integerCategory1758_20(forwardValue1758_57_0);
}
public static void h1758_0(moom.Oo p0) throws Throwable {
    throw __call1175800_0(p0);
}
public static void h1758_1(moom.Oo p0) throws Throwable {
    throw __call1175801_0(p0);
}
public static void h1758_2(moom.Oo p0) throws Throwable {
    throw __call1175802_0(p0);
}
public static void h1758_3(moom.Oo p0) throws Throwable {
    throw __call1175803_0(p0);
}
public static void h1758_4(moom.Oo p0) throws Throwable {
    throw __call1175804_0(p0);
}
public static void h1758_5(moom.Oo p0) throws Throwable {
    throw __call1175805_0(p0);
}
public static void h1758_6(moom.Oo p0) throws Throwable {
    throw __call1175806_0(p0);
}
public static void h1758_7(moom.Oo p0) throws Throwable {
    throw __call1175807_0(p0);
}
public static void h1758_8(moom.Oo p0) throws Throwable {
    throw __call1175808_0(p0);
}
public static void h1758_9(moom.Oo p0) throws Throwable {
    throw __call1175809_0(p0);
}
public static void h1758_10(moom.Oo p0) throws Throwable {
    throw __call1175810_0(p0);
}
private static native long __fieldRead1758_0() throws Throwable;
private static native java.lang.String __call1758_1() throws Throwable;
private static native moom.DT __call1758_2(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead1758_3() throws Throwable;
private static native int __call1758_4(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native moom.DT __call1758_5(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead1758_6() throws Throwable;
private static native int __call1758_7(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native moom.DT __call1758_8(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead1758_9() throws Throwable;
private static native int __call1758_10(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native moom.DT __call1758_11(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead1758_12() throws Throwable;
private static native int __call1758_13(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native moom.DT __call1758_14(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead1758_15() throws Throwable;
private static native int __call1758_16(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native moom.DT __call1758_17(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead1758_18() throws Throwable;
private static native int __call1758_19(net.minecraft.world.World a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native boolean __integerCategory1758_20(int value) throws Throwable;
private static native java.lang.Throwable __call1175800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175810_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_05e361237a4f3b13fa2e(net.minecraft.world.World a0, moom.DT a1) throws E;
private static final class __SourceHandler_05e361237a4f3b13fa2e {

public static boolean f1759(net.minecraft.world.World receiver, moom.DT p0) throws Throwable {
    int forwardValue1759_16_0;
    int forwardValue1759_27_0;
    net.minecraft.world.World forwardValue1759_34_0;
    moom.DT forwardValue1759_34_1;
    int forwardValue1759_45_0;
    int forwardValue1759_50_0;
    int forwardValue1759_54_0;
    int forwardValue1759_56_0;
    boolean spill1759_0;
    net.minecraft.world.World spill1759_1;
    moom.DT spill1759_2;
    boolean spill1759_3;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.world.biome.BiomeGenBase life5_50;
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_50: {
    forward_join_45: {
    forward_join_34: {
    forward_join_32: {
    forward_join_27: {
    forward_join_21: {
    forward_join_16: {
    forward_join_13: {
    life2_3 = (__fieldRead1759_0() ^ 103082397663536L);
    life4_5 = __call1759_1();
    spill1759_0 = __call1759_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue1759_16_0 = __integerCategory1759_3(spill1759_0);
        break forward_join_16;
    }
    if (!((!spill1759_0))) {
        break forward_join_13;
    }
    return __integerCategory1759_4(0);
    }
    forwardValue1759_16_0 = __integerCategory1759_6(__call1759_5(receiver, p0));
    }
    if (!((life4_5 == null))) {
        forwardValue1759_27_0 = forwardValue1759_16_0;
        break forward_join_27;
    }
    if (!((forwardValue1759_16_0 == 0))) {
        break forward_join_21;
    }
    return __integerCategory1759_7(0);
    }
    spill1759_1 = receiver;
    spill1759_2 = p0;
    if (!((life4_5 == null))) {
        forwardValue1759_34_0 = spill1759_1;
        forwardValue1759_34_1 = spill1759_2;
        break forward_join_34;
    }
    forwardValue1759_27_0 = __call1759_9(__call1759_8(spill1759_1, spill1759_2));
    }
    if (!((forwardValue1759_27_0 > __call1759_10(p0)))) {
        break forward_join_32;
    }
    return __integerCategory1759_11(0);
    }
    forwardValue1759_34_0 = receiver;
    forwardValue1759_34_1 = p0;
    }
    life5_50 = __call1759_12(forwardValue1759_34_0, forwardValue1759_34_1);
    spill1759_3 = __call1759_13(life5_50);
    if (!((life4_5 == null))) {
        forwardValue1759_45_0 = __integerCategory1759_14(spill1759_3);
        break forward_join_45;
    }
    if (!((!spill1759_3))) {
        break forward_join_55;
    }
    forwardValue1759_45_0 = __integerCategory1759_16(__call1759_15(receiver, p0, 0));
    }
    if (!((life4_5 == null))) {
        forwardValue1759_50_0 = forwardValue1759_45_0;
        break forward_join_50;
    }
    if (!((forwardValue1759_45_0 == 0))) {
        break forward_join_55;
    }
    forwardValue1759_50_0 = __integerCategory1759_18(__call1759_17(life5_50));
    }
    if (!((life4_5 == null))) {
        forwardValue1759_54_0 = forwardValue1759_50_0;
        break forward_join_54;
    }
    if (!((forwardValue1759_50_0 != 0))) {
        break forward_join_55;
    }
    forwardValue1759_54_0 = 1;
    }
    forwardValue1759_56_0 = forwardValue1759_54_0;
    break forward_join_56;
    }
    forwardValue1759_56_0 = 0;
    }
    return __integerCategory1759_19(forwardValue1759_56_0);
}
public static void h1759_0(moom.Oo p0) throws Throwable {
    throw __call1175900_0(p0);
}
public static void h1759_1(moom.Oo p0) throws Throwable {
    throw __call1175901_0(p0);
}
public static void h1759_2(moom.Oo p0) throws Throwable {
    throw __call1175902_0(p0);
}
public static void h1759_3(moom.Oo p0) throws Throwable {
    throw __call1175903_0(p0);
}
public static void h1759_4(moom.Oo p0) throws Throwable {
    throw __call1175904_0(p0);
}
public static void h1759_5(moom.Oo p0) throws Throwable {
    throw __call1175905_0(p0);
}
public static void h1759_6(moom.Oo p0) throws Throwable {
    throw __call1175906_0(p0);
}
public static void h1759_7(moom.Oo p0) throws Throwable {
    throw __call1175907_0(p0);
}
public static void h1759_8(moom.Oo p0) throws Throwable {
    throw __call1175908_0(p0);
}
public static void h1759_9(moom.Oo p0) throws Throwable {
    throw __call1175909_0(p0);
}
public static void h1759_10(moom.Oo p0) throws Throwable {
    throw __call1175910_0(p0);
}
private static native long __fieldRead1759_0() throws Throwable;
private static native java.lang.String __call1759_1() throws Throwable;
private static native boolean __call1759_2(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory1759_3(boolean value) throws Throwable;
private static native boolean __integerCategory1759_4(int value) throws Throwable;
private static native boolean __call1759_5(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1759_6(boolean value) throws Throwable;
private static native boolean __integerCategory1759_7(int value) throws Throwable;
private static native moom.DT __call1759_8(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __call1759_9(moom.DT a0) throws Throwable;
private static native int __call1759_10(moom.DT a0) throws Throwable;
private static native boolean __integerCategory1759_11(int value) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call1759_12(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native boolean __call1759_13(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __integerCategory1759_14(boolean value) throws Throwable;
private static native boolean __call1759_15(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native int __integerCategory1759_16(boolean value) throws Throwable;
private static native boolean __call1759_17(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __integerCategory1759_18(boolean value) throws Throwable;
private static native boolean __integerCategory1759_19(int value) throws Throwable;
private static native java.lang.Throwable __call1175900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1175910_0(moom.Oo a0) throws Throwable;

}


public void i() {
return;
}


public boolean i(moom.DT p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.World)(this)).d(((moom.DT)(p0)), ((boolean)(true))))) != 0);
}


public boolean i__Boolean() { return true; } // Legacy HWID/resource binding removed.


public void b__Void() { __sourceHandlerCall_f553378c4f8320ab9a28(this); }


public boolean b(moom.CA p0) { return __sourceHandlerCall_ec242adf5fac871f5944(this, p0); }


public boolean b(moom.CA p0, moom.fn p1) { return __sourceHandlerCall_085424a058a69b3ebcfe(this, p0, p1); }


public void b(moom.DT p0, net.minecraft.block.Block p1, int p2, int p3) {
return;
}


public void b__Void(moom.DT p0) {
java.lang.String spill1739_0;
    long life2_3;
    java.util.Iterator life5_8;
    java.lang.String life4_9;
    net.minecraft.world.IWorldAccess life6_16;
    lexical_join_22: {
    life2_3 = (net.minecraft.world.World.bb ^ 19060948036598L);
    spill1739_0 = net.minecraft.world.World.c__String();
    life5_8 = ((java.util.List)(this.w)).iterator();
    life4_9 = spill1739_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_22;
    }
    life6_16 = ((net.minecraft.world.IWorldAccess)(((java.util.Iterator)(life5_8)).next()));
    ((net.minecraft.world.IWorldAccess)(life6_16)).b(((moom.DT)(p0)));
    if (!((life4_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


protected abstract int b();

public int b(net.minecraft.world.EnumSkyBlock p0, moom.DT p1) { return __sourceHandlerCall_5445dbc84f125be524c2(this, p0, p1); }


public java.lang.String b__String() {
return ((moom.Fn)(this.x)).a__String();
}


public boolean b(moom.DT p0, boolean p1) { return __sourceHandlerCall_7aad43e9777f3f506188(this, p0, p1); }


public void b(net.minecraft.world.IWorldAccess p0) {
((java.util.List)(this.w)).remove(((java.lang.Object)(p0)));
    return;
}


protected void b(net.minecraft.entity.Entity p0) {
java.lang.String spill1738_0;
    long life2_3;
    java.util.Iterator life5_8;
    java.lang.String life4_9;
    net.minecraft.world.IWorldAccess life6_16;
    lexical_join_22: {
    life2_3 = (net.minecraft.world.World.bb ^ 85604724347302L);
    spill1738_0 = net.minecraft.world.World.c__String();
    life5_8 = ((java.util.List)(this.w)).iterator();
    life4_9 = spill1738_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_22;
    }
    life6_16 = ((net.minecraft.world.IWorldAccess)(((java.util.Iterator)(life5_8)).next()));
    ((net.minecraft.world.IWorldAccess)(life6_16)).b(((net.minecraft.entity.Entity)(p0)));
    if (!((life4_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public boolean b__Boolean(net.minecraft.entity.Entity p0) { return __sourceHandlerCall_f98852253950b3472700(this, p0); }


public int b(moom.DT p0) {
return ((net.minecraft.world.World)(this)).a(((moom.DT)(p0)), ((boolean)(true)));
}


public moom.DT b__DT(moom.DT p0) {
return ((net.minecraft.world.chunk.Chunk)(((net.minecraft.world.World)(this)).a__Fk(((moom.DT)(p0))))).a__DT(((moom.DT)(p0)));
}


public void b(moom.DT p0, net.minecraft.block.Block p1) {
((net.minecraft.world.World)(this)).c(((moom.DT)(((moom.DT)(p0)).e())), ((net.minecraft.block.Block)(p1)));
    ((net.minecraft.world.World)(this)).c(((moom.DT)(((moom.DT)(p0)).f())), ((net.minecraft.block.Block)(p1)));
    ((net.minecraft.world.World)(this)).c(((moom.DT)(((moom.DT)(p0)).b__DT())), ((net.minecraft.block.Block)(p1)));
    ((net.minecraft.world.World)(this)).c(((moom.DT)(((moom.DT)(p0)).a__DT())), ((net.minecraft.block.Block)(p1)));
    ((net.minecraft.world.World)(this)).c(((moom.DT)(((moom.DT)(p0)).c__DT())), ((net.minecraft.block.Block)(p1)));
    ((net.minecraft.world.World)(this)).c(((moom.DT)(((moom.DT)(p0)).d__DT())), ((net.minecraft.block.Block)(p1)));
    return;
}


public moom.DR b__DR(float p0) {
float local2 = ((net.minecraft.world.World)(this)).b(((float)(p0)));
    return ((moom.EA)(this.v)).a(((float)(local2)), ((float)(p0)));
}


public float b(float p0) {
return ((moom.EA)(this.v)).a(((long)(((net.minecraft.world.storage.WorldInfo)(this.z)).c__Long())), ((float)(p0)));
}


public moom.Fn b__Fn() {
return this.x;
}


public void b(long p0) {
((net.minecraft.world.storage.WorldInfo)(this.z)).b(((long)(p0)));
    return;
}


public long b__Long() {
return ((net.minecraft.world.storage.WorldInfo)(this.z)).b__Long();
}


public int b(moom.DT p0, moom.bs p1) { return __sourceHandlerCall_526291be0b8e8d22048c(this, p0, p1); }


public void b(int p0) {
this.m = ((int)(p0));
    return;
}


public void b(int p0, moom.DT p1, int p2) {
((net.minecraft.world.World)(this)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(p0)), ((moom.DT)(p1)), ((int)(p2)));
    return;
}


public void b__Void(float p0) {
this.p = ((float)(p0));
    this.q = ((float)(p0));
    return;
}


private boolean b__Boolean(moom.DT p0) { return __sourceHandlerCall_40faea8659e021b0794f(this, p0); }


public static void b(java.lang.String p0) {
R = ((java.lang.String)(p0));
    return;
}


public java.util.List<net.minecraft.entity.Entity> b(net.minecraft.entity.Entity p0, moom.CA p1) {
return ((net.minecraft.world.World)(this)).a(((net.minecraft.entity.Entity)(p0)), ((moom.CA)(p1)), ((com.google.common.base.Predicate)(moom.CY.d)));
}


public <T extends net.minecraft.entity.Entity> java.util.List<T> b(java.lang.Class<? extends T> p0, com.google.common.base.Predicate<? super T> p1) { return __sourceHandlerCall_a933806a4bd83a63dfe9(this, p0, p1); }


public void b(java.util.Collection<net.minecraft.entity.Entity> p0) {
java.lang.String spill1737_0;
    long life2_3;
    java.util.Iterator life5_12;
    java.lang.String life4_13;
    net.minecraft.entity.Entity life6_20;
    lexical_join_26: {
    life2_3 = (net.minecraft.world.World.bb ^ 53145148822982L);
    spill1737_0 = net.minecraft.world.World.c__String();
    ((java.util.List)(this.c)).addAll(((java.util.Collection)(p0)));
    life5_12 = ((java.util.Collection)(p0)).iterator();
    life4_13 = spill1737_0;
    lexical_cycle_14: while (true) {
    if (!(((java.util.Iterator)(life5_12)).hasNext())) {
        break lexical_join_26;
    }
    life6_20 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life5_12)).next()));
    ((net.minecraft.world.World)(this)).a(((net.minecraft.entity.Entity)(life6_20)));
    if (!((life4_13 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}


public void b(moom.DT p0, net.minecraft.tileentity.TileEntity p1) { __sourceHandlerCall_734d5f455320f74be7d6(this, p0, p1); }


public int e() { return __sourceHandlerCall_c766c95ad6aafbbb4731(this); }


public boolean e__Boolean() { return __sourceHandlerCall_683c2d704e5f4b58d624(this); }


protected void e__Void() { __sourceHandlerCall_17910b5ab306f41d6cbd(this); }


public boolean e(moom.DT p0, boolean p1) { return __sourceHandlerCall_fcc780137e86b88ff993(this, p0, p1); }


public void e(net.minecraft.entity.Entity p0) {
((net.minecraft.world.World)(this)).a(((net.minecraft.entity.Entity)(p0)), ((boolean)(true)));
    return;
}


public float e(float p0) {
return ((this.r + ((this.s - this.r) * p0)) * ((net.minecraft.world.World)(this)).f(((float)(p0))));
}


public boolean e(moom.DT p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.chunk.Chunk)(((net.minecraft.world.World)(this)).a__Fk(((moom.DT)(p0))))).a__Boolean(((moom.DT)(p0))))) != 0);
}


public int c() {
return this.a;
}


public void c(int p0) {
this.t = ((int)(p0));
    return;
}


public void c__Void() {
long life1_3;
    int life3_7;
    life1_3 = (net.minecraft.world.World.bb ^ 100289364637162L);
    life3_7 = ((net.minecraft.world.World)(this)).a__Int(((float)(0x1.0p0f)));
    try {
        if ((life3_7 != this.m)) {
        this.m = ((int)(life3_7));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw __sourceExactCall_43000439f2b564(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public int c(moom.DT p0) { return __sourceHandlerCall_9a082b1f8c69f692f309(this, p0); }


public boolean c(moom.DT p0, boolean p1) { return __sourceHandlerCall_6fc98bfa01d2a18380ec(this, p0, p1); }


public void c(int p0, moom.DT p1, int p2) {
java.lang.String spill1740_0;
    long life4_3;
    java.util.Iterator life7_8;
    java.lang.String life6_9;
    net.minecraft.world.IWorldAccess life8_16;
    lexical_join_24: {
    life4_3 = (net.minecraft.world.World.bb ^ 73969262748985L);
    spill1740_0 = net.minecraft.world.World.c__String();
    life7_8 = ((java.util.List)(this.w)).iterator();
    life6_9 = spill1740_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life7_8)).hasNext())) {
        break lexical_join_24;
    }
    life8_16 = ((net.minecraft.world.IWorldAccess)(((java.util.Iterator)(life7_8)).next()));
    ((net.minecraft.world.IWorldAccess)(life8_16)).b(((int)(p0)), ((moom.DT)(p1)), ((int)(p2)));
    if (!((life6_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void c(moom.DT p0, net.minecraft.block.Block p1) { __sourceHandlerCall_02c4297335fb0c9e28cb(this, p0, p1); }


public void c(net.minecraft.entity.Entity p0) { __sourceHandlerCall_41218bd31504d856f098(this, p0); }


public float c(float p0) {
float local2 = ((net.minecraft.world.World)(this)).b(((float)(p0)));
    return ((local2 * 0x1.921fb6p1f) * 0x1.0p1f);
}


public moom.DT c__DT(moom.DT p0) { return __sourceHandlerCall_69287a3ea016953e92f9(this, p0); }


public boolean c(moom.CA p0) { return __sourceHandlerCall_711872e055731f9d4d2a(this, p0); }


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral12446_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Eu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void c(moom.DT p0, net.minecraft.block.Block p1, int p2, int p3) {
((net.minecraft.block.Block)(p1)).a(((net.minecraft.world.World)(this)), ((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this)).a__fE(((moom.DT)(p0))))), ((int)(p2)), ((int)(p3)));
    return;
}


private static long c(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7618);
    if (((net.minecraft.world.World.lb)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.world.World.kb)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.world.World.mb)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.world.World.mb)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Eu", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.world.World.lb)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.world.World.lb)[life3_8])).longValue();
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = __sourceExactCall_905d35574a3b42(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean c__Boolean(moom.DT p0) { return __sourceHandlerCall_db979206443dc1009eeb(this, p0); }


public long c__Long() {
return ((net.minecraft.world.storage.WorldInfo)(this.z)).c__Long();
}


public void c__Void(moom.DT p0) { __sourceHandlerCall_cfbcba8ff5c0be662a82(this, p0); }


public void c(java.util.Collection<net.minecraft.entity.Entity> p0) {
((java.util.List)(this.d)).addAll(((java.util.Collection)(p0)));
    return;
}


public static java.lang.String c__String() {
return net.minecraft.world.World.R;
}


public boolean n(moom.DT p0) {
java.lang.Object local2 = ((net.minecraft.world.World)(this)).a__ES(((moom.DT)(p0)));
    return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.biome.BiomeGenBase)(local2)).c__Boolean())) != 0);
}


public boolean h(moom.DT p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.World)(this)).d(((moom.DT)(p0)), ((boolean)(false))))) != 0);
}


protected void h() {
((net.minecraft.world.World)(this)).g__Void();
    return;
}


public boolean h__Boolean() {
return ((((this.A) ? 1 : 0)) != 0);
}


public void f(net.minecraft.entity.Entity p0) { __sourceHandlerCall_3aeb06a842f97c541070(this, p0); }


public float f(float p0) {
return (this.p + ((this.q - this.p) * p0));
}


public boolean f__Boolean() { return __sourceHandlerCall_2d87ac045be0ad1379a7(this); }


protected void f__Void() { __sourceHandlerCall_b3e82fc32990a0cd265c(this); }


public int f() {
return this.m;
}


public boolean f(moom.DT p0) { return __sourceHandlerCall_aa8ba46a9ad6fa8ef0dd(this, p0); }


public boolean l(moom.DT p0) { return __sourceHandlerCall_8ab203839bec24300a3d(this, p0); }


public void d__Void() {
((net.minecraft.world.World)(this)).f__Void();
    return;
}


public float d(float p0) {
float local2 = ((net.minecraft.world.World)(this)).b(((float)(p0)));
    float local3 = (0x1.0p0f - ((moom.Dr.b(((float)(((local2 * 0x1.921fb6p1f) * 0x1.0p1f)))) * 0x1.0p1f) + 0x1.0p-2f));
    local3 = moom.Dr.a(((float)(local3)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    return ((local3 * local3) * 0x1.0p-1f);
}


public int d() {
long local1 = (net.minecraft.world.World.bb ^ 73322124721616L);
    return __sourceIntrinsic_e0f64934fe3a_originalDynamicSite2061_1(5123, (1626563251046404557L ^ local1));
}


public boolean d__Boolean(moom.DT p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.World)(this)).a(((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(3))))) != 0);
}


public void d__Void(moom.DT p0) {
((net.minecraft.world.storage.WorldInfo)(this.z)).a(((moom.DT)(p0)));
    return;
}


public boolean d(moom.CA p0) { return __sourceHandlerCall_6807ec3031c1a8a030ed(this, p0); }


public boolean d__Boolean() {
return ((0) != 0);
}


public void d(net.minecraft.entity.Entity p0) { __sourceHandlerCall_eac7c02085d5f9bdc1a3(this, p0); }


public void d(moom.DT p0, net.minecraft.block.Block p1) { __sourceHandlerCall_4f067a092631c2bc58a5(this, p0, p1); }


public int d(moom.DT p0) { return __sourceHandlerCall_b68e631cc6a98beb421a(this, p0); }


public boolean d(moom.DT p0, boolean p1) { return __sourceHandlerCall_5f3cd48c6c5c4e22612e(this, p0, p1); }


public boolean a(net.minecraft.block.Block p0, moom.DT p1, boolean p2, moom.bs p3, net.minecraft.entity.Entity p4, net.minecraft.item.ItemStack p5) { return __sourceHandlerCall_ee4a90c086dc6a14c778(this, p0, p1, p2, p3, p4, p5); }


public int a(java.lang.Class<?> p0) { return __sourceHandlerCall_c04f2fcec31e9fea8c5d(this, p0); }


public boolean a__Boolean(moom.DT p0, boolean p1) { return __sourceHandlerCall_30287ff40bc69b01ab20(this, p0, p1); }


public net.minecraft.entity.player.EntityPlayer a(net.minecraft.entity.Entity p0, double p1) {
return ((net.minecraft.world.World)(this)).a(((double)(((net.minecraft.entity.Entity)(p0)).n)), ((double)(((net.minecraft.entity.Entity)(p0)).o)), ((double)(((net.minecraft.entity.Entity)(p0)).p)), ((double)(p1)));
}


public boolean a(moom.DT p0, moom.DT p1, boolean p2) { return __sourceHandlerCall_8513b3793167afc9ebe5(this, p0, p1, p2); }


public long a__Long() {
return ((net.minecraft.world.storage.WorldInfo)(this.z)).a__Long();
}


public net.minecraft.entity.player.EntityPlayer a(double p0, double p1, double p2, double p3) { return __sourceHandlerCall_75e8f076f078d506b72d(this, p0, p1, p2, p3); }


public java.util.List<net.minecraft.entity.Entity> a__List() {
return this.c;
}


public boolean a(moom.G2 p0) { return __sourceHandlerCall_e13073f4ab986f210b17(this, p0); }


public moom.DT a__DT() { return __sourceHandlerCall_40e566c7fb3c45fae860(this); }


public boolean a__Boolean(double p0, double p1, double p2, double p3) { return __sourceHandlerCall_fce0bc5749b3f2dbf1c5(this, p0, p1, p2, p3); }


public void a(long p0) {
((net.minecraft.world.storage.WorldInfo)(this.z)).a(((long)(p0)));
    return;
}


public boolean a__Boolean(moom.DT p0, moom.DT p1) { return __sourceHandlerCall_3c7b3c79e35d121c4bd3(this, p0, p1); }


public net.minecraft.entity.player.EntityPlayer a__tn(java.lang.String p0) { return __sourceHandlerCall_8ee2b486637eb8298aaf(this, p0); }


public boolean a(moom.DT p0, int p1, boolean p2) { return __sourceHandlerCall_632beeccfd2e0366d7f0(this, p0, p1, p2); }


public net.minecraft.entity.player.EntityPlayer a(java.util.UUID p0) { return __sourceHandlerCall_ad4805aba2f8ddef82a0(this, p0); }


public boolean a__Boolean(moom.DT p0, int p1) { return __sourceHandlerCall_f2dc60cf60910f351390(this, p0, p1); }


public void a__Void(int p0) {
this.a = ((int)(p0));
    return;
}


public int a(moom.DT p0, moom.bs p1) {
java.lang.Object local3 = ((net.minecraft.world.World)(this)).a__fE(((moom.DT)(p0)));
    return ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(local3)).a__ch())).b(((net.minecraft.world.IBlockAccess)(this)), ((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(local3)), ((moom.bs)(p1)));
}


public net.minecraft.world.WorldType a__EL() {
return ((net.minecraft.world.storage.WorldInfo)(this.z)).a__EL();
}


public boolean a__Boolean(moom.DT p0, moom.bs p1) { return __sourceHandlerCall_1f4334eb6bb035f8e19d(this, p0, p1); }


public moom.Eh a__Eh(moom.DT p0) { return __sourceHandlerCall_c8e2b856914c3f8c5999(this, p0); }


public net.minecraft.world.EnumDifficulty a__bB() {
return ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(this)).a__IX())).a__bB();
}


protected abstract moom.Fn a__Fn();

public moom.EG a__EG() {
return this.C;
}


public net.minecraft.world.border.WorldBorder a__Fi() {
return this.M;
}


public double a() { return __sourceHandlerCall_05d6113578b07eee9825(this); }


public moom.qZ a(moom.qY p0) { return __sourceHandlerCall_972522b6fd92a71b2564(this, p0); }


public java.util.Calendar a__Calendar() { return __sourceHandlerCall_4377ac7f3742bb72a7c1(this); }


public void a(double p0, double p1, double p2, double p3, double p4, double p5, net.minecraft.nbt.NBTTagCompound p6) {
return;
}


public net.minecraft.scoreboard.Scoreboard a__Bh() {
return this.F;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23995;
      if (fb[var3] == null) {
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
         long var5 = eb[var3];
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
         Object[] var9 = (Object[])gb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               gb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Eu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         fb[var3] = var15;
      }

      return fb[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_2ca9f65bb5867f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12478_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Eu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a(int p0, int p1) { return __sourceHandlerCall_2137b24c6a00e6109850(this, p0, p1); }


public boolean a__Boolean(int p0, int p1) { return __sourceHandlerCall_9b90f2ce8f1a10a39fe4(this, p0, p1); }


public net.minecraft.world.biome.WorldChunkManager a__Ff() {
return ((moom.EA)(this.v)).a__Ff();
}


public net.minecraft.world.biome.BiomeGenBase a__ES(moom.DT p0) { return __sourceHandlerCall_cdfa094ea4617b2e2adf(this, p0); }


public net.minecraft.world.World a__Eu() {
return this;
}


public net.minecraft.world.GameRules a__Ej() {
return ((net.minecraft.world.storage.WorldInfo)(this.z)).a__Ej();
}


public boolean a__Boolean(moom.DT p0) { return __sourceHandlerCall_e71eb09d6f0c823cd704(this, p0); }


public void a__Void(float p0) {
this.r = ((float)(p0));
    this.s = ((float)(p0));
    return;
}


public net.minecraft.block.Block a__ch(moom.DT p0) {
java.lang.String spill1736_0;
    long life2_3;
    moom.DT life5_14;
    java.lang.String life4_15;
    lexical_join_26: {
    life2_3 = (net.minecraft.world.World.bb ^ 87798744572234L);
    spill1736_0 = net.minecraft.world.World.c__String();
    life5_14 = new moom.DT(((moom.DT)(p0)).a(), ((net.minecraft.world.World)(this)).c(), ((moom.DT)(p0)).c());
    life4_15 = spill1736_0;
    lexical_cycle_16: while (true) {
    if (!((!((net.minecraft.world.World)(this)).a__Boolean(((moom.DT)(((moom.DT)(life5_14)).a__DT())))))) {
        break lexical_join_26;
    }
    life5_14 = ((moom.DT)(life5_14)).a__DT();
    if (!((life4_15 != null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this)).a__fE(((moom.DT)(life5_14))))).a__ch();
}


public moom.IO a__IO() {
return this.B;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0, moom.DT p1) {
return ((1) != 0);
}


public void a(net.minecraft.entity.Entity p0, byte p1) {
return;
}


public net.minecraft.world.storage.ISaveHandler a__IL() {
return this.y;
}


public net.minecraft.world.storage.WorldInfo a__IX() {
return this.z;
}


public void a__Void() {
long local1 = (net.minecraft.world.World.bb ^ 41419030662982L);
    ((net.minecraft.world.World)(this)).d__Void(((moom.DT)(new moom.DT(__sourceIntrinsic_b82a5b29b709_originalDynamicSite2062_1(16662, (7984226196492662377L ^ local1)), __sourceIntrinsic_b82a5b29b709_originalDynamicSite2062_2(21205, (7333368557437363635L ^ local1)), __sourceIntrinsic_b82a5b29b709_originalDynamicSite2062_3(16662, (7984226196492662377L ^ local1))))));
    return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0, int p1, moom.DT p2, int p3) { __sourceHandlerCall_a6bdaf74c54f919f4a88(this, p0, p1, p2, p3); }


public void a(moom.EK p0) {
((net.minecraft.world.storage.WorldInfo)(this.z)).f(((boolean)(true)));
    return;
}


public java.util.Random a(int p0, int p1, int p2) {
long local4 = (net.minecraft.world.World.bb ^ 86710394309444L);
    long local6 = ((((((long) p0) * __sourceIntrinsic_c61504a3d09f_originalDynamicSite2063_1(23179, (7690560178997176704L ^ local4))) + (((long) p1) * __sourceIntrinsic_c61504a3d09f_originalDynamicSite2063_2(8525, (1243097292942070338L ^ local4)))) + ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(this)).a__IX())).a__Long()) + ((long) p2));
    ((java.util.Random)(this.u)).setSeed(((long)(local6)));
    return this.u;
}


public moom.DT a(java.lang.String p0, moom.DT p1) {
return ((moom.Fn)(((net.minecraft.world.World)(this)).b__Fn())).a(((net.minecraft.world.World)(this)), ((java.lang.String)(p0)), ((moom.DT)(p1)));
}


public void a(java.lang.String p0, net.minecraft.world.WorldSavedData p1) {
((moom.IO)(this.B)).a(((java.lang.String)(p0)), ((net.minecraft.world.WorldSavedData)(p1)));
    return;
}


public net.minecraft.world.WorldSavedData a(java.lang.Class<? extends net.minecraft.world.WorldSavedData> p0, java.lang.String p1) {
return ((moom.IO)(this.B)).a(((java.lang.Class)(p0)), ((java.lang.String)(p1)));
}


public int a(java.lang.String p0) {
return ((moom.IO)(this.B)).a(((java.lang.String)(p0)));
}


public void a(int p0, moom.DT p1, int p2) {
java.lang.String spill1729_0;
    long life4_3;
    java.util.Iterator life7_8;
    java.lang.String life6_9;
    net.minecraft.world.IWorldAccess life8_16;
    lexical_join_24: {
    life4_3 = (net.minecraft.world.World.bb ^ 53224947668327L);
    spill1729_0 = net.minecraft.world.World.c__String();
    life7_8 = ((java.util.List)(this.w)).iterator();
    life6_9 = spill1729_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life7_8)).hasNext())) {
        break lexical_join_24;
    }
    life8_16 = ((net.minecraft.world.IWorldAccess)(((java.util.Iterator)(life7_8)).next()));
    ((net.minecraft.world.IWorldAccess)(life8_16)).a(((int)(p0)), ((moom.DT)(p1)), ((int)(p2)));
    if (!((life6_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public int a__Int(float p0) {
float local2 = ((net.minecraft.world.World)(this)).b(((float)(p0)));
    float local3 = (0x1.0p0f - ((moom.Dr.b(((float)(((local2 * 0x1.921fb6p1f) * 0x1.0p1f)))) * 0x1.0p1f) + 0x1.0p-1f));
    local3 = moom.Dr.a(((float)(local3)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    local3 = (0x1.0p0f - local3);
    local3 = ((float) (((double) local3) * (0x1.0p0d - (((double) (((net.minecraft.world.World)(this)).f(((float)(p0))) * 0x1.4p2f)) / 0x1.0p4d))));
    local3 = ((float) (((double) local3) * (0x1.0p0d - (((double) (((net.minecraft.world.World)(this)).e(((float)(p0))) * 0x1.4p2f)) / 0x1.0p4d))));
    local3 = (0x1.0p0f - local3);
    return ((int) (local3 * 0x1.6p3f));
}


public float a(float p0) {
float local2 = ((net.minecraft.world.World)(this)).b(((float)(p0)));
    float local3 = (0x1.0p0f - ((moom.Dr.b(((float)(((local2 * 0x1.921fb6p1f) * 0x1.0p1f)))) * 0x1.0p1f) + 0x1.99999ap-3f));
    local3 = moom.Dr.a(((float)(local3)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    local3 = (0x1.0p0f - local3);
    local3 = ((float) (((double) local3) * (0x1.0p0d - (((double) (((net.minecraft.world.World)(this)).f(((float)(p0))) * 0x1.4p2f)) / 0x1.0p4d))));
    local3 = ((float) (((double) local3) * (0x1.0p0d - (((double) (((net.minecraft.world.World)(this)).e(((float)(p0))) * 0x1.4p2f)) / 0x1.0p4d))));
    return ((local3 * 0x1.99999ap-1f) + 0x1.99999ap-3f);
}


public moom.DR a(net.minecraft.entity.Entity p0, float p1) { return __sourceHandlerCall_5459ae8946b2b2a3a71f(this, p0, p1); }


public int a__Int() {
return ((moom.EA)(this.v)).a(((long)(((net.minecraft.world.storage.WorldInfo)(this.z)).c__Long())));
}


public float a__Float() {
return (moom.EA.a)[((moom.EA)(this.v)).a(((long)(((net.minecraft.world.storage.WorldInfo)(this.z)).c__Long())))];
}


public moom.DR a__DR(float p0) { return __sourceHandlerCall_939640022cb6898de827(this, p0); }


public void a(net.minecraft.world.IWorldAccess p0) {
((java.util.List)(this.w)).add(((java.lang.Object)(p0)));
    return;
}


public boolean a__Boolean(moom.DT p0, net.minecraft.block.Block p1) {
return ((0) != 0);
}


public java.util.List<moom.CA> a(net.minecraft.entity.Entity p0, moom.CA p1) { return __sourceHandlerCall_d535e225d1825bd7f160(this, p0, p1); }


public boolean a(net.minecraft.world.border.WorldBorder p0, net.minecraft.entity.Entity p1) { return __sourceHandlerCall_d8854783c0386a41d5b9(this, p0, p1); }


public java.util.List<moom.CA> a(moom.CA p0) { return __sourceHandlerCall_465e708a5c83030e633d(this, p0); }


public void a(int p0, int p1, int p2, int p3) { __sourceHandlerCall_8413ce2909e23561cd3a(this, p0, p1, p2, p3); }


public boolean a__Boolean(net.minecraft.tileentity.TileEntity p0) { return __sourceHandlerCall_0a81e7e786d7ca896c70(this, p0); }


public void a(java.util.Collection<net.minecraft.tileentity.TileEntity> p0) { __sourceHandlerCall_6ce2e1a16bfd8fe10c8a(this, p0); }


public void a(moom.DT p0, net.minecraft.block.Block p1) { __sourceHandlerCall_2edbda6c176fe67a0d6e(this, p0, p1); }


public void a(net.minecraft.entity.Entity p0, boolean p1) { __sourceHandlerCall_113cdf9549eb5bfad974(this, p0, p1); }


public void a(moom.DT p0, net.minecraft.block.Block p1, moom.bs p2) { __sourceHandlerCall_a0a3832bdcda3f7319ed(this, p0, p1, p2); }


public void a(int p0, int p1, int p2, int p3, int p4, int p5) {
java.lang.String spill1728_0;
    long life7_3;
    java.util.Iterator life10_8;
    java.lang.String life9_9;
    net.minecraft.world.IWorldAccess life11_16;
    lexical_join_27: {
    life7_3 = (net.minecraft.world.World.bb ^ 11849791639599L);
    spill1728_0 = net.minecraft.world.World.c__String();
    life10_8 = ((java.util.List)(this.w)).iterator();
    life9_9 = spill1728_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life10_8)).hasNext())) {
        break lexical_join_27;
    }
    life11_16 = ((net.minecraft.world.IWorldAccess)(((java.util.Iterator)(life10_8)).next()));
    ((net.minecraft.world.IWorldAccess)(life11_16)).a(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)));
    if (!((life9_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void a(moom.DT p0, net.minecraft.block.Block p1, int p2) {
return;
}


public void a(moom.DT p0, net.minecraft.block.Block p1, int p2, int p3) {
return;
}


public void a(moom.DT p0, moom.DT p1) {
((net.minecraft.world.World)(this)).a(((int)(((moom.DT)(p0)).a())), ((int)(((moom.DT)(p0)).b())), ((int)(((moom.DT)(p0)).c())), ((int)(((moom.DT)(p1)).a())), ((int)(((moom.DT)(p1)).b())), ((int)(((moom.DT)(p1)).c())));
    return;
}


public float a(moom.DT p0) {
return (((moom.EA)(this.v)).a__ArrayFloat())[((net.minecraft.world.World)(this)).b(((moom.DT)(p0)))];
}


public net.minecraft.block.state.IBlockState a__fE(moom.DT p0) { return __sourceHandlerCall_6687b77960ba83976380(this, p0); }


public int a__Int(moom.DT p0) { return __sourceHandlerCall_b89f63f501a339b1fc09(this, p0); }


public net.minecraft.util.MovingObjectPosition a(moom.DR p0, moom.DR p1) {
return ((net.minecraft.world.World)(this)).a(((moom.DR)(p0)), ((moom.DR)(p1)), ((boolean)(false)), ((boolean)(false)), ((boolean)(false)));
}


public net.minecraft.util.MovingObjectPosition a(moom.DR p0, moom.DR p1, boolean p2) {
return ((net.minecraft.world.World)(this)).a(((moom.DR)(p0)), ((moom.DR)(p1)), ((boolean)(p2)), ((boolean)(false)), ((boolean)(false)));
}


public net.minecraft.util.MovingObjectPosition a(moom.DR p0, moom.DR p1, boolean p2, boolean p3, boolean p4) { return __sourceHandlerCall_08ca7f2f53aa805d431a(this, p0, p1, p2, p3, p4); }


public int a(net.minecraft.world.EnumSkyBlock p0, moom.DT p1) { return __sourceHandlerCall_36ef8f46a66afb3e6418(this, p0, p1); }


public moom.DT a__DT(moom.DT p0) { return __sourceHandlerCall_fe15c1751c83c6e3c0ab(this, p0); }


public void a(net.minecraft.world.EnumSkyBlock p0, moom.DT p1, int p2) { __sourceHandlerCall_bc28384d986384500e09(this, p0, p1, p2); }


public int a(moom.DT p0, boolean p1) { return __sourceHandlerCall_cf2c2e6b454d72bad5c0(this, p0, p1); }


public int a(moom.DT p0, int p1) { return __sourceHandlerCall_c88bd4f8e74166352f3b(this, p0, p1); }


public void a(net.minecraft.util.EnumParticleTypes p0, double p1, double p2, double p3, double p4, double p5, double p6, int[] p7) {
((net.minecraft.world.World)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(p0)).a())), ((boolean)(((net.minecraft.util.EnumParticleTypes)(p0)).a__Boolean())), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((int[])(p7)));
    return;
}


public void a(net.minecraft.util.EnumParticleTypes p0, boolean p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) {
((net.minecraft.world.World)(this)).a(((int)(((net.minecraft.util.EnumParticleTypes)(p0)).a())), ((boolean)((((net.minecraft.util.EnumParticleTypes)(p0)).a__Boolean() | p1))), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((double)(p7)), ((int[])(p8)));
    return;
}


private void a(int p0, boolean p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) {
java.lang.String spill1730_0;
    long life16_3;
    java.util.Iterator life19_8;
    java.lang.String life18_9;
    net.minecraft.world.IWorldAccess life20_16;
    lexical_join_30: {
    life16_3 = (net.minecraft.world.World.bb ^ 107606072890664L);
    spill1730_0 = net.minecraft.world.World.c__String();
    life19_8 = ((java.util.List)(this.w)).iterator();
    life18_9 = spill1730_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life19_8)).hasNext())) {
        break lexical_join_30;
    }
    life20_16 = ((net.minecraft.world.IWorldAccess)(((java.util.Iterator)(life19_8)).next()));
    ((net.minecraft.world.IWorldAccess)(life20_16)).a__Void(((int)(p0)), ((boolean)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((double)(p7)), ((int[])(p8)));
    if (!((life18_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public boolean a__Boolean(net.minecraft.entity.Entity p0) {
((java.util.List)(this.j)).add(((java.lang.Object)(p0)));
    return ((1) != 0);
}


protected void a(net.minecraft.entity.Entity p0) {
java.lang.String spill1732_0;
    long life2_3;
    java.util.Iterator life5_8;
    java.lang.String life4_9;
    net.minecraft.world.IWorldAccess life6_16;
    lexical_join_22: {
    life2_3 = (net.minecraft.world.World.bb ^ 35502406258340L);
    spill1732_0 = net.minecraft.world.World.c__String();
    life5_8 = ((java.util.List)(this.w)).iterator();
    life4_9 = spill1732_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_22;
    }
    life6_16 = ((net.minecraft.world.IWorldAccess)(((java.util.Iterator)(life5_8)).next()));
    ((net.minecraft.world.IWorldAccess)(life6_16)).a(((net.minecraft.entity.Entity)(p0)));
    if (!((life4_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void a(net.minecraft.entity.Entity p0, java.lang.String p1, float p2, float p3) {
java.lang.String spill1733_0;
    long life5_3;
    java.util.Iterator life8_8;
    java.lang.String life7_9;
    net.minecraft.world.IWorldAccess life9_16;
    lexical_join_30: {
    life5_3 = (net.minecraft.world.World.bb ^ 92816887984610L);
    spill1733_0 = net.minecraft.world.World.c__String();
    life8_8 = ((java.util.List)(this.w)).iterator();
    life7_9 = spill1733_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life8_8)).hasNext())) {
        break lexical_join_30;
    }
    life9_16 = ((net.minecraft.world.IWorldAccess)(((java.util.Iterator)(life8_8)).next()));
    ((net.minecraft.world.IWorldAccess)(life9_16)).a(((java.lang.String)(p1)), ((double)(((net.minecraft.entity.Entity)(p0)).n)), ((double)(((net.minecraft.entity.Entity)(p0)).o)), ((double)(((net.minecraft.entity.Entity)(p0)).p)), ((float)(p2)), ((float)(p3)));
    if (!((life7_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0, java.lang.String p1, float p2, float p3) {
java.lang.String spill1734_0;
    long life5_3;
    java.util.Iterator life8_8;
    java.lang.String life7_9;
    net.minecraft.world.IWorldAccess life9_16;
    lexical_join_31: {
    life5_3 = (net.minecraft.world.World.bb ^ 66182859951351L);
    spill1734_0 = net.minecraft.world.World.c__String();
    life8_8 = ((java.util.List)(this.w)).iterator();
    life7_9 = spill1734_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life8_8)).hasNext())) {
        break lexical_join_31;
    }
    life9_16 = ((net.minecraft.world.IWorldAccess)(((java.util.Iterator)(life8_8)).next()));
    ((net.minecraft.world.IWorldAccess)(life9_16)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((java.lang.String)(p1)), ((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).n)), ((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).o)), ((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).p)), ((float)(p2)), ((float)(p3)));
    if (!((life7_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void a(double p0, double p1, double p2, java.lang.String p3, float p4, float p5) {
java.lang.String spill1727_0;
    long life10_3;
    java.util.Iterator life13_8;
    java.lang.String life12_9;
    net.minecraft.world.IWorldAccess life14_16;
    lexical_join_27: {
    life10_3 = (net.minecraft.world.World.bb ^ 20328618714659L);
    spill1727_0 = net.minecraft.world.World.c__String();
    life13_8 = ((java.util.List)(this.w)).iterator();
    life12_9 = spill1727_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life13_8)).hasNext())) {
        break lexical_join_27;
    }
    life14_16 = ((net.minecraft.world.IWorldAccess)(((java.util.Iterator)(life13_8)).next()));
    ((net.minecraft.world.IWorldAccess)(life14_16)).a(((java.lang.String)(p3)), ((double)(p0)), ((double)(p1)), ((double)(p2)), ((float)(p4)), ((float)(p5)));
    if (!((life12_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void a(double p0, double p1, double p2, java.lang.String p3, float p4, float p5, boolean p6) {
return;
}


public void a(moom.DT p0, java.lang.String p1) {
java.lang.String spill1731_0;
    long life3_3;
    java.util.Iterator life6_8;
    java.lang.String life5_9;
    net.minecraft.world.IWorldAccess life7_16;
    lexical_join_23: {
    life3_3 = (net.minecraft.world.World.bb ^ 74068984365845L);
    spill1731_0 = net.minecraft.world.World.c__String();
    life6_8 = ((java.util.List)(this.w)).iterator();
    life5_9 = spill1731_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life6_8)).hasNext())) {
        break lexical_join_23;
    }
    life7_16 = ((net.minecraft.world.IWorldAccess)(((java.util.Iterator)(life6_8)).next()));
    ((net.minecraft.world.IWorldAccess)(life7_16)).a(((java.lang.String)(p1)), ((moom.DT)(p0)));
    if (!((life5_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public net.minecraft.world.chunk.Chunk a__Fk(moom.DT p0) {
return ((net.minecraft.world.World)(this)).a__Fk(((int)((((moom.DT)(p0)).a() >> 4))), ((int)((((moom.DT)(p0)).c() >> 4))));
}


protected boolean a(int p0, int p1, boolean p2) { return __sourceHandlerCall_e3341be8d47028ecd921(this, p0, p1, p2); }


private int a(moom.DT p0, net.minecraft.world.EnumSkyBlock p1) { return __sourceHandlerCall_c935d15358036d35d900(this, p0, p1); }


public boolean a__Boolean(net.minecraft.world.EnumSkyBlock p0, moom.DT p1) { return __sourceHandlerCall_1822409dda5753c3deb1(this, p0, p1); }


public boolean a(boolean p0) {
return ((0) != 0);
}


public void a(boolean p0, boolean p1) {
this.J = ((boolean)(p0));
    this.K = ((boolean)(p1));
    return;
}


public boolean a(moom.DT p0, net.minecraft.block.state.IBlockState p1, int p2) { return __sourceHandlerCall_dee479c9336fa702ef95(this, p0, p1, p2); }


public net.minecraft.world.chunk.Chunk a__Fk(int p0, int p1) {
return ((moom.Fn)(this.x)).a(((int)(p0)), ((int)(p1)));
}


protected void a(int p0, int p1, net.minecraft.world.chunk.Chunk p2) { __sourceHandlerCall_b9de783454e99100ef05(this, p0, p1, p2); }


public void a(net.minecraft.block.Block p0, moom.DT p1, java.util.Random p2) {
this.b = ((boolean)(true));
    ((net.minecraft.block.Block)(p0)).b(((net.minecraft.world.World)(this)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this)).a__fE(((moom.DT)(p1))))), ((java.util.Random)(p2)));
    this.b = ((boolean)(false));
    return;
}


public boolean a__Boolean(moom.G2 p0, boolean p1) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.World)(this)).a(((int)(((moom.G2)(p0)).a)), ((int)(((moom.G2)(p0)).b)), ((int)(((moom.G2)(p0)).c)), ((int)(((moom.G2)(p0)).d)), ((int)(((moom.G2)(p0)).e)), ((int)(((moom.G2)(p0)).f)), ((boolean)(p1))))) != 0);
}


public <T extends net.minecraft.entity.Entity> java.util.List<T> a(java.lang.Class<? extends T> p0, moom.CA p1) {
return ((net.minecraft.world.World)(this)).a(((java.lang.Class)(p0)), ((moom.CA)(p1)), ((com.google.common.base.Predicate)(moom.CY.d)));
}


public <T extends net.minecraft.entity.Entity> java.util.List<T> a(java.lang.Class<? extends T> p0, moom.CA p1, com.google.common.base.Predicate<? super T> p2) { return __sourceHandlerCall_f45ebdd440c0afb61104(this, p0, p1, p2); }


public <T extends net.minecraft.entity.Entity> T a(java.lang.Class<? extends T> p0, moom.CA p1, T p2) { return ((T)(__sourceHandlerCall_76811d391db1b3d7f4bc(this, p0, p1, p2))); }


public net.minecraft.entity.Entity a(int p0) {
return ((net.minecraft.entity.Entity)(((moom.Dd)(this.k)).a__Object(((int)(p0)))));
}


public java.util.List<moom.Er> a(net.minecraft.world.chunk.Chunk p0, boolean p1) {
return null;
}


public java.util.List<moom.Er> a(moom.G2 p0, boolean p1) {
return null;
}


private boolean a(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6) { return __sourceHandlerCall_3f1094a234a2d1fdcc5c(this, p0, p1, p2, p3, p4, p5, p6); }


public java.util.List<net.minecraft.entity.Entity> a(net.minecraft.entity.Entity p0, moom.CA p1, com.google.common.base.Predicate<? super net.minecraft.entity.Entity> p2) { return __sourceHandlerCall_222f00da61e8231eebe7(this, p0, p1, p2); }


public <T extends net.minecraft.entity.Entity> java.util.List<T> a(java.lang.Class<? extends T> p0, com.google.common.base.Predicate<? super T> p1) { return __sourceHandlerCall_6705026899a9d3fa7ea6(this, p0, p1); }


public moom.Ei a(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, boolean p5) {
return ((net.minecraft.world.World)(this)).a(((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((boolean)(false)), ((boolean)(p5)));
}


public boolean a__Boolean(moom.CA p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.World)(this)).a(((moom.CA)(p0)), ((net.minecraft.entity.Entity)(null))))) != 0);
}


public moom.Ei a(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, boolean p5, boolean p6) {
moom.Ei local11 = new moom.Ei(this, p0, p1, p2, p3, p4, p5, p6);
    ((moom.Ei)(local11)).a__Void();
    ((moom.Ei)(local11)).a(((boolean)(true)));
    return local11;
}


public float a(moom.DR p0, moom.CA p1) { return __sourceHandlerCall_c0ba706d10e078fd731e(this, p0, p1); }


public boolean a(net.minecraft.entity.player.EntityPlayer p0, moom.DT p1, moom.bs p2) { return __sourceHandlerCall_c922381a7e2c9da571e1(this, p0, p1, p2); }


public boolean a(moom.CA p0, net.minecraft.entity.Entity p1) { return __sourceHandlerCall_2d78c26170ab34db28fd(this, p0, p1); }


public void a__Void(moom.DT p0) {
java.lang.String spill1735_0;
    long life2_3;
    java.util.Iterator life5_8;
    java.lang.String life4_9;
    net.minecraft.world.IWorldAccess life6_16;
    lexical_join_22: {
    life2_3 = (net.minecraft.world.World.bb ^ 47081366854578L);
    spill1735_0 = net.minecraft.world.World.c__String();
    life5_8 = ((java.util.List)(this.w)).iterator();
    life4_9 = spill1735_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_22;
    }
    life6_16 = ((net.minecraft.world.IWorldAccess)(((java.util.Iterator)(life5_8)).next()));
    ((net.minecraft.world.IWorldAccess)(life6_16)).a__Void(((moom.DT)(p0)));
    if (!((life4_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public boolean a(moom.CA p0, moom.fn p1, net.minecraft.entity.Entity p2) { return __sourceHandlerCall_7a55ec8e87a64b4026db(this, p0, p1, p2); }


public boolean a(moom.CA p0, moom.fn p1) { return __sourceHandlerCall_fd409d3e448bc8c5c322(this, p0, p1); }


public boolean a(moom.DT p0, net.minecraft.block.state.IBlockState p1) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.World)(this)).a(((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(p1)), ((int)(3))))) != 0);
}


public void a(moom.DT p0, net.minecraft.tileentity.TileEntity p1) { __sourceHandlerCall_43efa0443fe6fb89d342(this, p0, p1); }


public net.minecraft.tileentity.TileEntity a__B9(moom.DT p0) { return __sourceHandlerCall_f4dac35ab9ae8091181b(this, p0); }


public static boolean a(net.minecraft.world.IBlockAccess p0, moom.DT p1) { return __sourceHandlerCall_d30b1c2de87611971b62(p0, p1); }


public void a(net.minecraft.tileentity.TileEntity p0) {
((java.util.List)(this.h)).add(((java.lang.Object)(p0)));
    return;
}


public java.lang.String a__String() {
return __sourceIntrinsic_64ccfb84e285_originalDynamicSite2064_2(((java.util.List)(this.c)).size());
}


public boolean m(moom.DT p0) { return __sourceHandlerCall_05e361237a4f3b13fa2e(this, p0); }


public boolean k(moom.DT p0) { return __sourceHandlerCall_d045f0be0f39068343f8(this, p0); }


public void k() {
return;
}


public int g() {
return this.t;
}


public boolean g(moom.DT p0) { return __sourceHandlerCall_8c66ecb73bf81029b7f4(this, p0); }


public boolean g__Boolean() { return __sourceHandlerCall_e0e8e896ac0e59fe80b4(this); }


protected void g__Void() { __sourceHandlerCall_243dbd8c746df15fec94(this); }


public void j() throws net.minecraft.world.MinecraftException {
((net.minecraft.world.storage.ISaveHandler)(this.y)).a__Void();
    return;
}


private boolean j(moom.DT p0) { return __sourceHandlerCall_34cb10644470300efb5f(this, p0); }


private static java.lang.String lambda$getBiomeGenForCoords$0(moom.DT p0) throws java.lang.Exception {
return __sourceExactCall_16b52be06fd8c9(((moom.DT)(p0)));
}


private java.lang.String lambda$addWorldInfoToCrashReport$2() throws java.lang.Exception {
return __sourceIntrinsic_a60669e167d7_originalDynamicSite2065_3(((java.util.List)(this.i)).size(), this.i);
}


private java.lang.String lambda$addWorldInfoToCrashReport$3() throws java.lang.Exception {
return ((moom.Fn)(this.x)).a__String();
}


private static java.lang.String lambda$notifyBlockOfStateChange$1(net.minecraft.block.Block p0) throws java.lang.Exception {
try {
        return java.lang.String.format(((java.lang.String)("ID #%d (%s // %s)")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(__sourceExactCall_4be9acdbe11525(((net.minecraft.block.Block)(p0)))))), ((net.minecraft.block.Block)(p0)).b__String(), ((java.lang.Class)(((java.lang.Object)(p0)).getClass())).getCanonicalName()})));
    } catch (java.lang.Throwable caught1) {
        return __sourceIntrinsic_d4b4b02b5adf_invokedynamic12537_7(__sourceExactCall_4be9acdbe11525(((net.minecraft.block.Block)(p0))));
    }
}


private static native <E extends Throwable> int __sourceIntrinsic_b263e73c8dee9d46_originalDynamicSite869_5(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b263e73c8dee9d46_originalDynamicSite869_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b263e73c8dee9d46_originalDynamicSite869_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b263e73c8dee9d46_originalDynamicSite869_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b263e73c8dee9d46_originalDynamicSite869_52(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_c61504a3d09f_originalDynamicSite2063_1(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_c61504a3d09f_originalDynamicSite2063_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12478_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite2064_2(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite2062_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite2062_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite2062_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral12446_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0f64934fe3a_originalDynamicSite2061_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a60669e167d7_originalDynamicSite2065_3(int a0, java.util.List a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d4b4b02b5adf_invokedynamic12537_7(int a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native java.lang.Throwable __sourceExactCall_43000439f2b564(java.lang.Throwable p0);
private static native long __sourceExactCall_905d35574a3b42(int p0, long p1);
private static native int __sourceExactCall_2ca9f65bb5867f(int p0, long p1);
private static native java.lang.String __sourceExactCall_16b52be06fd8c9(moom.DT p0);
private static native int __sourceExactCall_4be9acdbe11525(net.minecraft.block.Block p0);
}
