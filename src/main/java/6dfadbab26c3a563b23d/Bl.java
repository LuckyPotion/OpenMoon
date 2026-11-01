package moom;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class Bl implements java.lang.Runnable, net.minecraft.command.ICommandSender, net.minecraft.util.IThreadListener, net.minecraft.profiler.IPlayerUsage {

private static org.apache.logging.log4j.Logger a;

public static java.io.File b;

private static moom.Bl c;

private net.minecraft.world.storage.ISaveFormat d;

private net.minecraft.profiler.PlayerUsageSnooper e;

private java.io.File f;

private java.util.List<net.minecraft.util.ITickable> g;

protected net.minecraft.command.ICommandManager h;

public moom.A9 i;

private net.minecraft.network.NetworkSystem j;

private net.minecraft.network.ServerStatusResponse k;

private java.util.Random l;

private int m;

public net.minecraft.world.WorldServer[] n;

private net.minecraft.server.management.ServerConfigurationManager o;

private boolean p;

private boolean q;

private int r;

protected java.net.Proxy s;

public java.lang.String t;

public int u;

private boolean v;

private boolean w;

private boolean x;

private boolean y;

private boolean z;

private java.lang.String A;

private int B;

private int C;

public long[] D;

public long[][] E;

private java.security.KeyPair F;

private java.lang.String G;

private java.lang.String H;

private java.lang.String I;

private boolean J;

private boolean K;

private boolean L;

private java.lang.String M;

private java.lang.String N;

private boolean O;

private long P;

private java.lang.String Q;

private boolean R;

private boolean S;

private com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService T;

private com.mojang.authlib.minecraft.MinecraftSessionService U;

private long V;

private com.mojang.authlib.GameProfileRepository W;

private moom.Bt X;

protected java.util.Queue<java.util.concurrent.FutureTask<?>> Y;

private java.lang.Thread Z;

private long aa;

private static net.minecraft.entity.Entity[] ab;

private static long bb;

private static long[] db;

private static java.lang.Integer[] eb;

private static java.util.Map fb;

private static long[] jb;

private static java.lang.Long[] kb;

private static java.util.Map lb;

public Bl(java.net.Proxy p0, java.io.File p1) { super(); }

private static void __sourceConstructorBody_45fe388741d158ea(moom.Bl receiver, java.net.Proxy p0, java.io.File p1) throws Throwable {
long local3_life2 = (moom.Bl.bb ^ 31093662451333L);
    moom.Bl.__sourceConstructorInit_45fe388741d158ea_0(((moom.Bl)(receiver)));
    ((moom.Bl)(receiver)).e = ((net.minecraft.profiler.PlayerUsageSnooper)(new net.minecraft.profiler.PlayerUsageSnooper("server", ((net.minecraft.profiler.IPlayerUsage) receiver), moom.Bl.a__Long())));
    ((moom.Bl)(receiver)).g = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((moom.Bl)(receiver)).i = ((moom.A9)(new moom.A9()));
    net.minecraft.entity.Entity[] __sourceSpill464_11 = moom.Bl.b__Arrayr3();
    ((moom.Bl)(receiver)).k = ((net.minecraft.network.ServerStatusResponse)(new net.minecraft.network.ServerStatusResponse()));
    ((moom.Bl)(receiver)).l = ((java.util.Random)(new java.util.Random()));
    ((moom.Bl)(receiver)).m = ((int)(-1));
    ((moom.Bl)(receiver)).p = ((boolean)(true));
    ((moom.Bl)(receiver)).C = ((int)(0));
    ((moom.Bl)(receiver)).D = ((long[])(new long[__sourceIntrinsic_45fe388741d158ea_originalDynamicSite464_17(17056, (4679517054483548175L ^ local3_life2))]));
    ((moom.Bl)(receiver)).M = ((java.lang.String)(""));
    ((moom.Bl)(receiver)).N = ((java.lang.String)(""));
    ((moom.Bl)(receiver)).V = ((long)(0L));
    ((moom.Bl)(receiver)).Y = ((java.util.Queue)(com.google.common.collect.Queues.newArrayDeque()));
    ((moom.Bl)(receiver)).aa = ((long)(moom.Bl.a__Long()));
    ((moom.Bl)(receiver)).s = ((java.net.Proxy)(p0));
    c = ((moom.Bl)(receiver));
    ((moom.Bl)(receiver)).f = ((java.io.File)(null));
    ((moom.Bl)(receiver)).j = ((net.minecraft.network.NetworkSystem)(null));
    ((moom.Bl)(receiver)).X = ((moom.Bt)(new moom.Bt(receiver, p1)));
    ((moom.Bl)(receiver)).h = ((net.minecraft.command.ICommandManager)(null));
    ((moom.Bl)(receiver)).d = ((net.minecraft.world.storage.ISaveFormat)(null));
    net.minecraft.entity.Entity[] local5_life33 = __sourceSpill464_11;
    try {
        ((moom.Bl)(receiver)).T = ((com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService)(new com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService(p0, ((java.util.UUID)(java.util.UUID.randomUUID())).toString())));
        ((moom.Bl)(receiver)).U = ((com.mojang.authlib.minecraft.MinecraftSessionService)(((com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService)(((moom.Bl)(receiver)).T)).createMinecraftSessionService()));
        ((moom.Bl)(receiver)).W = ((com.mojang.authlib.GameProfileRepository)(((com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService)(((moom.Bl)(receiver)).T)).createProfileRepository()));
        if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.Bl.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[4])));
    }
    } catch (moom.Oo __catchStack464) {
        throw moom.Bl.a(((java.lang.Throwable)(__catchStack464)));
    }
    return;
}


public Bl(java.io.File p0, java.net.Proxy p1, java.io.File p2) { super(); }

private static void __sourceConstructorBody_54dc952ed83d030e(moom.Bl receiver, java.io.File p0, java.net.Proxy p1, java.io.File p2) throws Throwable {
long local4_life2 = (moom.Bl.bb ^ 24791395475138L);
    moom.Bl.__sourceConstructorInit_54dc952ed83d030e_0(((moom.Bl)(receiver)));
    ((moom.Bl)(receiver)).e = ((net.minecraft.profiler.PlayerUsageSnooper)(new net.minecraft.profiler.PlayerUsageSnooper("server", ((net.minecraft.profiler.IPlayerUsage) receiver), moom.Bl.a__Long())));
    ((moom.Bl)(receiver)).g = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((moom.Bl)(receiver)).i = ((moom.A9)(new moom.A9()));
    ((moom.Bl)(receiver)).k = ((net.minecraft.network.ServerStatusResponse)(new net.minecraft.network.ServerStatusResponse()));
    ((moom.Bl)(receiver)).l = ((java.util.Random)(new java.util.Random()));
    ((moom.Bl)(receiver)).m = ((int)(-1));
    ((moom.Bl)(receiver)).p = ((boolean)(true));
    ((moom.Bl)(receiver)).C = ((int)(0));
    ((moom.Bl)(receiver)).D = ((long[])(new long[__sourceIntrinsic_54dc952ed83d030e_originalDynamicSite463_15(17056, (4679505254788190280L ^ local4_life2))]));
    ((moom.Bl)(receiver)).M = ((java.lang.String)(""));
    ((moom.Bl)(receiver)).N = ((java.lang.String)(""));
    net.minecraft.entity.Entity[] __sourceSpill463_21 = moom.Bl.b__Arrayr3();
    ((moom.Bl)(receiver)).V = ((long)(0L));
    ((moom.Bl)(receiver)).Y = ((java.util.Queue)(com.google.common.collect.Queues.newArrayDeque()));
    ((moom.Bl)(receiver)).aa = ((long)(moom.Bl.a__Long()));
    ((moom.Bl)(receiver)).s = ((java.net.Proxy)(p1));
    c = ((moom.Bl)(receiver));
    ((moom.Bl)(receiver)).f = ((java.io.File)(p0));
    ((moom.Bl)(receiver)).j = ((net.minecraft.network.NetworkSystem)(new net.minecraft.network.NetworkSystem(receiver)));
    ((moom.Bl)(receiver)).X = ((moom.Bt)(new moom.Bt(receiver, p2)));
    ((moom.Bl)(receiver)).h = ((net.minecraft.command.ICommandManager)(((moom.Bl)(receiver)).a__qL()));
    ((moom.Bl)(receiver)).d = ((net.minecraft.world.storage.ISaveFormat)(new net.minecraft.world.chunk.storage.AnvilSaveConverter(p0)));
    ((moom.Bl)(receiver)).T = ((com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService)(new com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService(p1, ((java.util.UUID)(java.util.UUID.randomUUID())).toString())));
    net.minecraft.entity.Entity[] local6_life37 = __sourceSpill463_21;
    try {
        ((moom.Bl)(receiver)).U = ((com.mojang.authlib.minecraft.MinecraftSessionService)(((com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService)(((moom.Bl)(receiver)).T)).createMinecraftSessionService()));
        ((moom.Bl)(receiver)).W = ((com.mojang.authlib.GameProfileRepository)(((com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService)(((moom.Bl)(receiver)).T)).createProfileRepository()));
        if ((local6_life37 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    } catch (moom.Oo __catchStack463) {
        throw moom.Bl.a(((java.lang.Throwable)(__catchStack463)));
    }
    return;
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-4617369158292213628L)), ((long)(5322920408219876460L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(201169091675508L)))));
    java.lang.Object __sourceSpill605_6 = null;
    fb = ((java.util.Map)(new java.util.HashMap(13)));
    moom.Bl.b(((net.minecraft.entity.Entity[])(__sourceSpill605_6)));
    long local11_life9 = (moom.Bl.bb ^ 121589121994360L);
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill605_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill605_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill605_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill605_16 = new byte[8];
    (__sourceSpill605_16)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill605_16)[local14_life17] = ((byte) ((int) ((local11_life9 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation605_18 = __sourceSpill605_16;
    ((javax.crypto.Cipher)(__sourceSpill605_13)).init(((int)(__sourceSpill605_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill605_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation605_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life21 = new long[19];
    int local16_life22 = 0;
    java.lang.String local17_life23;
    int local18_life25 = ((java.lang.String)((local17_life23 = "8û2Ã¢<s^\025ó`\031¿û\016·+,1(yB`¨\037eÅt}Í\033bçÑåmOc\026h\000l!!àc>äèq¯Ä_tWs©Y¶¼ì´Ù\037ôÿÄè\033is\020°\035ÝË0ò]]Ä²ÑdÖoÿ&ûlq*A1xæøùÒ#q\002\t¼ÜÃ¾5òÏ¾\177³o ºiúm£k"))).length();
    int local15_life26 = 0;
    do {
        java.lang.String __sourceSpill605_27 = local17_life23;
        int __sourceSpill605_28 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill605_27)).substring(((int)(__sourceSpill605_28)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill605_32 = local19_life21;
        int __sourceSpill605_33 = local16_life22;
        local16_life22 += 1;
        long local21_life34 = (((((((((((long) (local20_life31)[0]) & 255L) << 56) | ((((long) (local20_life31)[1]) & 255L) << 48)) | ((((long) (local20_life31)[2]) & 255L) << 40)) | ((((long) (local20_life31)[3]) & 255L) << 32)) | ((((long) (local20_life31)[4]) & 255L) << 24)) | ((((long) (local20_life31)[5]) & 255L) << 16)) | ((((long) (local20_life31)[6]) & 255L) << 8)) | (((long) (local20_life31)[7]) & 255L));
        byte[] __sourceSpill605_35 = new byte[8];
        (__sourceSpill605_35)[0] = ((byte) ((int) (local21_life34 >>> 56)));
        (__sourceSpill605_35)[1] = ((byte) ((int) (local21_life34 >>> 48)));
        (__sourceSpill605_35)[2] = ((byte) ((int) (local21_life34 >>> 40)));
        (__sourceSpill605_35)[3] = ((byte) ((int) (local21_life34 >>> 32)));
        (__sourceSpill605_35)[4] = ((byte) ((int) (local21_life34 >>> 24)));
        (__sourceSpill605_35)[5] = ((byte) ((int) (local21_life34 >>> 16)));
        (__sourceSpill605_35)[6] = ((byte) ((int) (local21_life34 >>> 8)));
        (__sourceSpill605_35)[7] = ((byte) ((int) local21_life34));
        javax.crypto.Cipher __sourceSpill605_36 = local13_life11;
        byte[] local23_life38 = ((javax.crypto.Cipher)(__sourceSpill605_36)).doFinal(((byte[])(__sourceSpill605_35)));
        (__sourceSpill605_32)[__sourceSpill605_33] = (((((((((((long) (local23_life38)[0]) & 255L) << 56) | ((((long) (local23_life38)[1]) & 255L) << 48)) | ((((long) (local23_life38)[2]) & 255L) << 40)) | ((((long) (local23_life38)[3]) & 255L) << 32)) | ((((long) (local23_life38)[4]) & 255L) << 24)) | ((((long) (local23_life38)[5]) & 255L) << 16)) | ((((long) (local23_life38)[6]) & 255L) << 8)) | (((long) (local23_life38)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    local18_life25 = ((java.lang.String)((local17_life23 = "\004uø¼Ö¬¾\025Ñ?;Eb!\177"))).length();
    local15_life26 = 0;
    do {
        java.lang.String __sourceSpill605_40 = local17_life23;
        int __sourceSpill605_41 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill605_40)).substring(((int)(__sourceSpill605_41)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill605_45 = local19_life21;
        int __sourceSpill605_46 = local16_life22;
        local16_life22 += 1;
        long local21_life47 = (((((((((((long) (local20_life44)[0]) & 255L) << 56) | ((((long) (local20_life44)[1]) & 255L) << 48)) | ((((long) (local20_life44)[2]) & 255L) << 40)) | ((((long) (local20_life44)[3]) & 255L) << 32)) | ((((long) (local20_life44)[4]) & 255L) << 24)) | ((((long) (local20_life44)[5]) & 255L) << 16)) | ((((long) (local20_life44)[6]) & 255L) << 8)) | (((long) (local20_life44)[7]) & 255L));
        byte[] __sourceSpill605_48 = new byte[8];
        (__sourceSpill605_48)[0] = ((byte) ((int) (local21_life47 >>> 56)));
        (__sourceSpill605_48)[1] = ((byte) ((int) (local21_life47 >>> 48)));
        (__sourceSpill605_48)[2] = ((byte) ((int) (local21_life47 >>> 40)));
        (__sourceSpill605_48)[3] = ((byte) ((int) (local21_life47 >>> 32)));
        (__sourceSpill605_48)[4] = ((byte) ((int) (local21_life47 >>> 24)));
        (__sourceSpill605_48)[5] = ((byte) ((int) (local21_life47 >>> 16)));
        (__sourceSpill605_48)[6] = ((byte) ((int) (local21_life47 >>> 8)));
        (__sourceSpill605_48)[7] = ((byte) ((int) local21_life47));
        javax.crypto.Cipher __sourceSpill605_49 = local13_life11;
        byte[] local23_life51 = ((javax.crypto.Cipher)(__sourceSpill605_49)).doFinal(((byte[])(__sourceSpill605_48)));
        (__sourceSpill605_45)[__sourceSpill605_46] = (((((((((((long) (local23_life51)[0]) & 255L) << 56) | ((((long) (local23_life51)[1]) & 255L) << 48)) | ((((long) (local23_life51)[2]) & 255L) << 40)) | ((((long) (local23_life51)[3]) & 255L) << 32)) | ((((long) (local23_life51)[4]) & 255L) << 24)) | ((((long) (local23_life51)[5]) & 255L) << 16)) | ((((long) (local23_life51)[6]) & 255L) << 8)) | (((long) (local23_life51)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    db = ((long[])(local19_life21));
    eb = ((java.lang.Integer[])(new java.lang.Integer[19]));
    lb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life56;
    javax.crypto.Cipher __sourceSpill605_58 = (local0_life56 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill605_59 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill605_60 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill605_61 = new byte[8];
    (__sourceSpill605_61)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local1_life62 = 1;
    while ((local1_life62 < 8)) {
        (__sourceSpill605_61)[local1_life62] = ((byte) ((int) ((local11_life9 << (local1_life62 * 8)) >>> 56)));
        local1_life62 += 1;
    }
    byte[] __sourcePreallocation605_63 = __sourceSpill605_61;
    ((javax.crypto.Cipher)(__sourceSpill605_58)).init(((int)(__sourceSpill605_59)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill605_60)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation605_63)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life66 = new long[9];
    int local3_life67 = 0;
    java.lang.String local4_life68;
    int local5_life70 = ((java.lang.String)((local4_life68 = "\007\013\\óñI1ñNh-°I47U÷}<Yü¼hÄ\025GöÕñ#\007ù\002=Ñ\003¿^0mñ\005ë%Ü?ÑöÇ"))).length();
    int local2_life71 = 0;
    do {
        java.lang.String __sourceSpill605_72 = local4_life68;
        int __sourceSpill605_73 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life76 = ((java.lang.String)(((java.lang.String)(__sourceSpill605_72)).substring(((int)(__sourceSpill605_73)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill605_77 = local6_life66;
        int __sourceSpill605_78 = local3_life67;
        local3_life67 += 1;
        long local8_life79 = (((((((((((long) (local7_life76)[0]) & 255L) << 56) | ((((long) (local7_life76)[1]) & 255L) << 48)) | ((((long) (local7_life76)[2]) & 255L) << 40)) | ((((long) (local7_life76)[3]) & 255L) << 32)) | ((((long) (local7_life76)[4]) & 255L) << 24)) | ((((long) (local7_life76)[5]) & 255L) << 16)) | ((((long) (local7_life76)[6]) & 255L) << 8)) | (((long) (local7_life76)[7]) & 255L));
        byte[] __sourceSpill605_80 = new byte[8];
        (__sourceSpill605_80)[0] = ((byte) ((int) (local8_life79 >>> 56)));
        (__sourceSpill605_80)[1] = ((byte) ((int) (local8_life79 >>> 48)));
        (__sourceSpill605_80)[2] = ((byte) ((int) (local8_life79 >>> 40)));
        (__sourceSpill605_80)[3] = ((byte) ((int) (local8_life79 >>> 32)));
        (__sourceSpill605_80)[4] = ((byte) ((int) (local8_life79 >>> 24)));
        (__sourceSpill605_80)[5] = ((byte) ((int) (local8_life79 >>> 16)));
        (__sourceSpill605_80)[6] = ((byte) ((int) (local8_life79 >>> 8)));
        (__sourceSpill605_80)[7] = ((byte) ((int) local8_life79));
        javax.crypto.Cipher __sourceSpill605_81 = local0_life56;
        byte[] local10_life83 = ((javax.crypto.Cipher)(__sourceSpill605_81)).doFinal(((byte[])(__sourceSpill605_80)));
        (__sourceSpill605_77)[__sourceSpill605_78] = (((((((((((long) (local10_life83)[0]) & 255L) << 56) | ((((long) (local10_life83)[1]) & 255L) << 48)) | ((((long) (local10_life83)[2]) & 255L) << 40)) | ((((long) (local10_life83)[3]) & 255L) << 32)) | ((((long) (local10_life83)[4]) & 255L) << 24)) | ((((long) (local10_life83)[5]) & 255L) << 16)) | ((((long) (local10_life83)[6]) & 255L) << 8)) | (((long) (local10_life83)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    local5_life70 = ((java.lang.String)((local4_life68 = "\t;{J[=n{Âý\b¨\000Ù"))).length();
    local2_life71 = 0;
    do {
        java.lang.String __sourceSpill605_85 = local4_life68;
        int __sourceSpill605_86 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life89 = ((java.lang.String)(((java.lang.String)(__sourceSpill605_85)).substring(((int)(__sourceSpill605_86)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill605_90 = local6_life66;
        int __sourceSpill605_91 = local3_life67;
        local3_life67 += 1;
        long local8_life92 = (((((((((((long) (local7_life89)[0]) & 255L) << 56) | ((((long) (local7_life89)[1]) & 255L) << 48)) | ((((long) (local7_life89)[2]) & 255L) << 40)) | ((((long) (local7_life89)[3]) & 255L) << 32)) | ((((long) (local7_life89)[4]) & 255L) << 24)) | ((((long) (local7_life89)[5]) & 255L) << 16)) | ((((long) (local7_life89)[6]) & 255L) << 8)) | (((long) (local7_life89)[7]) & 255L));
        byte[] __sourceSpill605_93 = new byte[8];
        (__sourceSpill605_93)[0] = ((byte) ((int) (local8_life92 >>> 56)));
        (__sourceSpill605_93)[1] = ((byte) ((int) (local8_life92 >>> 48)));
        (__sourceSpill605_93)[2] = ((byte) ((int) (local8_life92 >>> 40)));
        (__sourceSpill605_93)[3] = ((byte) ((int) (local8_life92 >>> 32)));
        (__sourceSpill605_93)[4] = ((byte) ((int) (local8_life92 >>> 24)));
        (__sourceSpill605_93)[5] = ((byte) ((int) (local8_life92 >>> 16)));
        (__sourceSpill605_93)[6] = ((byte) ((int) (local8_life92 >>> 8)));
        (__sourceSpill605_93)[7] = ((byte) ((int) local8_life92));
        javax.crypto.Cipher __sourceSpill605_94 = local0_life56;
        byte[] local10_life96 = ((javax.crypto.Cipher)(__sourceSpill605_94)).doFinal(((byte[])(__sourceSpill605_93)));
        (__sourceSpill605_90)[__sourceSpill605_91] = (((((((((((long) (local10_life96)[0]) & 255L) << 56) | ((((long) (local10_life96)[1]) & 255L) << 48)) | ((((long) (local10_life96)[2]) & 255L) << 40)) | ((((long) (local10_life96)[3]) & 255L) << 32)) | ((((long) (local10_life96)[4]) & 255L) << 24)) | ((((long) (local10_life96)[5]) & 255L) << 16)) | ((((long) (local10_life96)[6]) & 255L) << 8)) | (((long) (local10_life96)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    jb = ((long[])(local6_life66));
    kb = ((java.lang.Long[])(new java.lang.Long[9]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((java.io.File)(new java.io.File("usercache.json")));
}

private static native <E extends Throwable> void __sourceConstructorInit_54dc952ed83d030e_0(moom.Bl a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_45fe388741d158ea_0(moom.Bl a0) throws E;
private static native <E extends Throwable> net.minecraft.world.WorldServer __sourceHandlerCall_719e8d5fb341631a56d6(moom.Bl a0, int a1) throws E;
private static final class __SourceHandler_719e8d5fb341631a56d6 {

public static net.minecraft.world.WorldServer f603(moom.Bl receiver, int p0) throws Throwable {
    int forwardValue603_18_0;
    int forwardValue603_18_1;
    net.minecraft.world.WorldServer forwardValue603_28_0;
    int spill603_0;
    int spill603_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_28: {
    forward_join_24: {
    forward_join_18: {
    forward_join_16: {
    life2_3 = (__fieldRead603_0() ^ 134685338145978L);
    life4_5 = __call603_1();
    spill603_0 = p0;
    spill603_1 = -1;
    if (!((life4_5 == null))) {
        forwardValue603_18_0 = spill603_0;
        forwardValue603_18_1 = spill603_1;
        break forward_join_18;
    }
    if (!((spill603_0 == spill603_1))) {
        break forward_join_16;
    }
    forwardValue603_28_0 = (__fieldRead603_2(receiver))[1];
    break forward_join_28;
    }
    forwardValue603_18_0 = p0;
    forwardValue603_18_1 = 1;
    }
    if (!((forwardValue603_18_0 == forwardValue603_18_1))) {
        break forward_join_24;
    }
    forwardValue603_28_0 = (__fieldRead603_3(receiver))[2];
    break forward_join_28;
    }
    forwardValue603_28_0 = (__fieldRead603_4(receiver))[0];
    }
    return forwardValue603_28_0;
}
public static void h603_0(moom.Oo p0) throws Throwable {
    throw __call1060300_0(p0);
}
public static void h603_1(moom.Oo p0) throws Throwable {
    throw __call1060301_0(p0);
}
public static void h603_2(moom.Oo p0) throws Throwable {
    throw __call1060302_0(p0);
}
private static native long __fieldRead603_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call603_1() throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead603_2(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead603_3(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead603_4(moom.Bl a0) throws Throwable;
private static native java.lang.Throwable __call1060300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1f0f1a56f1f42f622726(moom.Bl a0, java.lang.String a1, java.lang.String a2, long a3, net.minecraft.world.WorldType a4, java.lang.String a5) throws E;
private static final class __SourceHandler_1f0f1a56f1f42f622726 {

public static void f100080(moom.Bl receiver, java.lang.String p0, java.lang.String p1, long p2, net.minecraft.world.WorldType p3, java.lang.String p4) throws Throwable {
    net.minecraft.world.storage.WorldInfo forestValue100080_85_0;
    int forestValue100080_114_0;
    int forestValue100080_114_1;
    int forestValue100080_118_0;
    int forestValue100080_125_0;
    moom.Bl forestValue100080_144_0;
    net.minecraft.entity.Entity[] spill100080_0;
    net.minecraft.world.storage.WorldInfo spill100080_1;
    int spill100080_2;
    int spill100080_3;
    int spill100080_4;
    moom.Bl spill100080_5;
    long life7_3;
    net.minecraft.world.storage.ISaveHandler life10_31;
    net.minecraft.entity.Entity[] life9_32;
    net.minecraft.world.storage.WorldInfo life11_40;
    moom.EK life12_51;
    int life13_98;
    int life14_105;
    forest_join_224: {
    forest_join_213: {
    forest_join_92: {
    forest_join_85: {
    forest_join_84: {
    forest_join_82: {
    forest_join_76: {
    forest_join_52: {
    life7_3 = (__fieldRead100080_0() ^ 98445482821223L);
    __call100080_1(receiver, p0);
    __call100080_2(receiver, "menu.loadingLevel");
    __fieldWrite100080_3(receiver, new net.minecraft.world.WorldServer[3]);
    __fieldWrite100080_7(receiver, __call100080_6((__fieldRead100080_4(receiver)).length, __invokedynamic100080_5(17056, (4679449166578174189L ^ life7_3))));
    spill100080_0 = __call100080_8();
    life10_31 = __call100080_10(__fieldRead100080_9(receiver), p0, 1);
    life9_32 = spill100080_0;
    __call100080_12(receiver, __call100080_11(receiver), life10_31);
    life11_40 = __call100080_13(life10_31);
    spill100080_1 = life11_40;
    if (!((life9_32 == null))) {
        forestValue100080_85_0 = spill100080_1;
        break forest_join_85;
    }
    if (!((spill100080_1 == null))) {
        break forest_join_84;
    }
    if (!(__call100080_14(receiver))) {
        break forest_join_52;
    }
    life12_51 = __fieldRead100080_15();
    if (!((life9_32 != null))) {
        break forest_join_76;
    }
    }
    life12_51 = new moom.EK(p2, __call100080_16(receiver), __call100080_17(receiver), __call100080_18(receiver), p3);
    __call100080_19(life12_51, p4);
    if (!((life9_32 == null))) {
        break forest_join_82;
    }
    if (!(__fieldRead100080_20(receiver))) {
        break forest_join_76;
    }
    __call100080_21(life12_51);
    }
    life11_40 = new net.minecraft.world.storage.WorldInfo(life12_51, p1);
    }
    if (!((life9_32 != null))) {
        break forest_join_92;
    }
    }
    forestValue100080_85_0 = life11_40;
    }
    __call100080_22(forestValue100080_85_0, p1);
    life12_51 = new moom.EK(life11_40);
    }
    life13_98 = 0;
    forest_cycle_94: while (true) {
    forest_join_211: {
    forest_join_210: {
    forest_join_184: {
    forest_join_166: {
    forest_join_158: {
    forest_join_144: {
    forest_join_143: {
    forest_join_125: {
    forest_join_118: {
    forest_join_117: {
    forest_join_114: {
    forest_join_110: {
    if (!((life13_98 < (__fieldRead100080_23(receiver)).length))) {
        break forest_join_213;
    }
    life14_105 = 0;
    if (!((life9_32 == null))) {
        break forest_join_224;
    }
    spill100080_2 = life13_98;
    spill100080_3 = 1;
    if (!((life9_32 == null))) {
        forestValue100080_114_0 = spill100080_2;
        forestValue100080_114_1 = spill100080_3;
        break forest_join_114;
    }
    if (!((spill100080_2 == spill100080_3))) {
        break forest_join_110;
    }
    life14_105 = -1;
    }
    spill100080_4 = life13_98;
    if (!((life9_32 == null))) {
        forestValue100080_118_0 = spill100080_4;
        break forest_join_118;
    }
    forestValue100080_114_0 = spill100080_4;
    forestValue100080_114_1 = 2;
    }
    if (!((forestValue100080_114_0 == forestValue100080_114_1))) {
        break forest_join_117;
    }
    life14_105 = 1;
    }
    forestValue100080_118_0 = life13_98;
    }
    if (!((life9_32 == null))) {
        forestValue100080_125_0 = forestValue100080_118_0;
        break forest_join_125;
    }
    if (!((forestValue100080_118_0 == 0))) {
        break forest_join_166;
    }
    spill100080_5 = receiver;
    if (!((life9_32 == null))) {
        forestValue100080_144_0 = spill100080_5;
        break forest_join_144;
    }
    forestValue100080_125_0 = __integerCategory100080_25(__call100080_24(spill100080_5));
    }
    if (!((forestValue100080_125_0 != 0))) {
        break forest_join_143;
    }
    (__fieldRead100080_26(receiver))[life13_98] = __cast100080_29(__call100080_28(new moom.Ey(receiver, life10_31, life11_40, life14_105, __fieldRead100080_27(receiver))));
    if (!((life9_32 != null))) {
        break forest_join_158;
    }
    }
    forestValue100080_144_0 = receiver;
    }
    (__fieldRead100080_30(forestValue100080_144_0))[life13_98] = __cast100080_33(__call100080_32(new net.minecraft.world.WorldServer(receiver, life10_31, life11_40, life14_105, __fieldRead100080_31(receiver))));
    }
    __call100080_35((__fieldRead100080_34(receiver))[life13_98], life12_51);
    if (!((life9_32 != null))) {
        break forest_join_184;
    }
    }
    (__fieldRead100080_36(receiver))[life13_98] = __cast100080_40(__call100080_39(new moom.Ex(receiver, life10_31, life14_105, (__fieldRead100080_37(receiver))[0], __fieldRead100080_38(receiver))));
    }
    __call100080_43((__fieldRead100080_41(receiver))[life13_98], new moom.Ez(receiver, (__fieldRead100080_42(receiver))[life13_98]));
    if (!((life9_32 == null))) {
        break forest_join_211;
    }
    if (!((!__call100080_44(receiver)))) {
        break forest_join_210;
    }
    __call100080_48(__call100080_46((__fieldRead100080_45(receiver))[life13_98]), __call100080_47(receiver));
    }
    life13_98 += 1;
    }
    if (!((life9_32 != null))) {
        continue forest_cycle_94;
    }
    break forest_cycle_94;
    }
    }
    __call100080_51(__fieldRead100080_49(receiver), __fieldRead100080_50(receiver));
    __call100080_53(receiver, __call100080_52(receiver));
    __call100080_54(receiver);
    }
    return;
}
public static void h100080_0(moom.Oo p0) throws Throwable {
    throw __call13008000_0(p0);
}
public static void h100080_1(moom.Oo p0) throws Throwable {
    throw __call13008001_0(p0);
}
public static void h100080_2(moom.Oo p0) throws Throwable {
    throw __call13008002_0(p0);
}
public static void h100080_3(moom.Oo p0) throws Throwable {
    throw __call13008003_0(p0);
}
public static void h100080_4(moom.Oo p0) throws Throwable {
    throw __call13008004_0(p0);
}
public static void h100080_5(moom.Oo p0) throws Throwable {
    throw __call13008005_0(p0);
}
public static void h100080_6(moom.Oo p0) throws Throwable {
    throw __call13008006_0(p0);
}
public static void h100080_7(moom.Oo p0) throws Throwable {
    throw __call13008007_0(p0);
}
public static void h100080_8(moom.Oo p0) throws Throwable {
    throw __call13008008_0(p0);
}
public static void h100080_9(moom.Oo p0) throws Throwable {
    throw __call13008009_0(p0);
}
public static void h100080_10(moom.Oo p0) throws Throwable {
    throw __call13008010_0(p0);
}
public static void h100080_11(moom.Oo p0) throws Throwable {
    throw __call13008011_0(p0);
}
public static void h100080_12(moom.Oo p0) throws Throwable {
    throw __call13008012_0(p0);
}
public static void h100080_13(moom.Oo p0) throws Throwable {
    throw __call13008013_0(p0);
}
public static void h100080_14(moom.Oo p0) throws Throwable {
    throw __call13008014_0(p0);
}
public static void h100080_15(moom.Oo p0) throws Throwable {
    throw __call13008015_0(p0);
}
private static native long __fieldRead100080_0() throws Throwable;
private static native void __call100080_1(moom.Bl a0, java.lang.String a1) throws Throwable;
private static native void __call100080_2(moom.Bl a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite100080_3(moom.Bl a0, net.minecraft.world.WorldServer[] a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100080_4(moom.Bl a0) throws Throwable;
private static native int __invokedynamic100080_5(int a0, long a1) throws Throwable;
private static native long[][] __call100080_6(int a0, int a1) throws Throwable;
private static native void __fieldWrite100080_7(moom.Bl a0, long[][] a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call100080_8() throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __fieldRead100080_9(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __call100080_10(net.minecraft.world.storage.ISaveFormat a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __call100080_11(moom.Bl a0) throws Throwable;
private static native void __call100080_12(moom.Bl a0, java.lang.String a1, net.minecraft.world.storage.ISaveHandler a2) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call100080_13(net.minecraft.world.storage.ISaveHandler a0) throws Throwable;
private static native boolean __call100080_14(moom.Bl a0) throws Throwable;
private static native moom.EK __fieldRead100080_15() throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call100080_16(moom.Bl a0) throws Throwable;
private static native boolean __call100080_17(moom.Bl a0) throws Throwable;
private static native boolean __call100080_18(moom.Bl a0) throws Throwable;
private static native moom.EK __call100080_19(moom.EK a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead100080_20(moom.Bl a0) throws Throwable;
private static native moom.EK __call100080_21(moom.EK a0) throws Throwable;
private static native void __call100080_22(net.minecraft.world.storage.WorldInfo a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100080_23(moom.Bl a0) throws Throwable;
private static native boolean __call100080_24(moom.Bl a0) throws Throwable;
private static native int __integerCategory100080_25(boolean value) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100080_26(moom.Bl a0) throws Throwable;
private static native moom.A9 __fieldRead100080_27(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.World __call100080_28(moom.Ey a0) throws Throwable;
private static native net.minecraft.world.WorldServer __cast100080_29(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100080_30(moom.Bl a0) throws Throwable;
private static native moom.A9 __fieldRead100080_31(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.World __call100080_32(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __cast100080_33(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100080_34(moom.Bl a0) throws Throwable;
private static native void __call100080_35(net.minecraft.world.WorldServer a0, moom.EK a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100080_36(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100080_37(moom.Bl a0) throws Throwable;
private static native moom.A9 __fieldRead100080_38(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.World __call100080_39(moom.Ex a0) throws Throwable;
private static native net.minecraft.world.WorldServer __cast100080_40(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100080_41(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100080_42(moom.Bl a0) throws Throwable;
private static native void __call100080_43(net.minecraft.world.WorldServer a0, moom.Ez a1) throws Throwable;
private static native boolean __call100080_44(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100080_45(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call100080_46(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call100080_47(moom.Bl a0) throws Throwable;
private static native void __call100080_48(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __fieldRead100080_49(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100080_50(moom.Bl a0) throws Throwable;
private static native void __call100080_51(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.world.WorldServer[] a1) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call100080_52(moom.Bl a0) throws Throwable;
private static native void __call100080_53(moom.Bl a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native void __call100080_54(moom.Bl a0) throws Throwable;
private static native java.lang.Throwable __call13008000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13008015_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.Entity __sourceHandlerCall_756950b593d8514e822d(moom.Bl a0, java.util.UUID a1) throws E;
private static final class __SourceHandler_756950b593d8514e822d {

public static net.minecraft.entity.Entity f604(moom.Bl receiver, java.util.UUID p0) throws Throwable {
    net.minecraft.entity.Entity[] spill604_0;
    long life2_3;
    net.minecraft.world.WorldServer[] life5_6;
    int life6_9;
    int life7_12;
    net.minecraft.entity.Entity[] life4_13;
    net.minecraft.world.WorldServer life8_20;
    net.minecraft.entity.Entity life9_31;
    lexical_join_38: {
    life2_3 = (__fieldRead604_0() ^ 25098323312371L);
    life5_6 = __fieldRead604_1(receiver);
    life6_9 = (life5_6).length;
    spill604_0 = __call604_2();
    life7_12 = 0;
    life4_13 = spill604_0;
    lexical_cycle_14: while (true) {
    lexical_join_36: {
    lexical_join_35: {
    if (!((life7_12 < life6_9))) {
        break lexical_join_38;
    }
    life8_20 = (life5_6)[life7_12];
    if (!((life4_13 == null))) {
        break lexical_join_36;
    }
    if (!((life8_20 != null))) {
        break lexical_join_35;
    }
    life9_31 = __call604_3(life8_20, p0);
    if (!((life4_13 == null))) {
        break lexical_join_36;
    }
    if (!((life9_31 != null))) {
        break lexical_join_35;
    }
    return life9_31;
    }
    life7_12 += 1;
    }
    if (!((life4_13 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return null;
}
public static void h604_0(moom.Oo p0) throws Throwable {
    throw __call1060400_0(p0);
}
public static void h604_1(moom.Oo p0) throws Throwable {
    throw __call1060401_0(p0);
}
public static void h604_2(moom.Oo p0) throws Throwable {
    throw __call1060402_0(p0);
}
private static native long __fieldRead604_0() throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead604_1(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call604_2() throws Throwable;
private static native net.minecraft.entity.Entity __call604_3(net.minecraft.world.WorldServer a0, java.util.UUID a1) throws Throwable;
private static native java.lang.Throwable __call1060400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> com.google.common.util.concurrent.ListenableFuture __sourceHandlerCall_ecc91480c798eff1247e(moom.Bl a0, java.util.concurrent.Callable a1) throws E;
private static final class __SourceHandler_ecc91480c798eff1247e {

public static com.google.common.util.concurrent.ListenableFuture f219(moom.Bl receiver, java.util.concurrent.Callable p0) throws Throwable {
    java.lang.Object forestValue219_38_0;
    net.minecraft.entity.Entity[] spill219_0;
    moom.Bl spill219_1;
    moom.Bl spill219_2;
    com.google.common.util.concurrent.ListenableFutureTask spill219_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    com.google.common.util.concurrent.ListenableFutureTask life5_24;
    java.util.Queue life6_28;
    forest_join_38: {
    forest_join_36: {
    life2_3 = (__fieldRead219_0() ^ 44229410016341L);
    spill219_0 = __call219_1();
    __call219_2(p0);
    life4_8 = spill219_0;
    spill219_1 = receiver;
    if (!((life4_8 == null))) {
        forestValue219_38_0 = spill219_1;
        break forest_join_38;
    }
    if (!((!__call219_3(spill219_1)))) {
        break forest_join_36;
    }
    spill219_2 = receiver;
    if (!((life4_8 == null))) {
        forestValue219_38_0 = spill219_2;
        break forest_join_38;
    }
    if (!((!__call219_4(spill219_2)))) {
        break forest_join_36;
    }
    life5_24 = __call219_5(p0);
    __monitorEnter219_7((life6_28 = __fieldRead219_6(receiver)));
    __call219_9(__fieldRead219_8(receiver), life5_24);
    spill219_3 = life5_24;
    __monitorExit219_10(life6_28);
    return spill219_3;
    }
    forestValue219_38_0 = __call219_11(p0);
    }
    return __call219_12(forestValue219_38_0);
}
public static com.google.common.util.concurrent.ListenableFuture h219_0(java.lang.Exception p0) throws Throwable {
    throw __call3021900_0(p0);
}
public static com.google.common.util.concurrent.ListenableFuture h219_1(java.lang.Exception p0) throws Throwable {
    throw __call3021901_0(p0);
}
public static com.google.common.util.concurrent.ListenableFuture h219_2(java.lang.Exception p0) throws Throwable {
    throw __call3021902_0(p0);
}
public static com.google.common.util.concurrent.ListenableFuture h219_3(java.lang.Throwable p0, java.util.Queue p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3021903_0(p1);
    throw life2_2;
}
public static com.google.common.util.concurrent.ListenableFuture h219_4(java.lang.Exception p0, com.google.common.util.concurrent.ListenableFutureTask p1) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    return __call3021904_0(life1_2);
}
private static native long __fieldRead219_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call219_1() throws Throwable;
private static native java.lang.Object __call219_2(java.util.concurrent.Callable a0) throws Throwable;
private static native boolean __call219_3(moom.Bl a0) throws Throwable;
private static native boolean __call219_4(moom.Bl a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFutureTask __call219_5(java.util.concurrent.Callable a0) throws Throwable;
private static native java.util.Queue __fieldRead219_6(moom.Bl a0) throws Throwable;
private static native void __monitorEnter219_7(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead219_8(moom.Bl a0) throws Throwable;
private static native boolean __call219_9(java.util.Queue a0, com.google.common.util.concurrent.ListenableFutureTask a1) throws Throwable;
private static native void __monitorExit219_10(java.util.Queue a0) throws Throwable;
private static native java.lang.Object __call219_11(java.util.concurrent.Callable a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call219_12(java.lang.Object a0) throws Throwable;
private static native java.lang.Throwable __call3021900_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3021901_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3021902_0(java.lang.Exception a0) throws Throwable;
private static native void __monitorExit3021903_0(java.util.Queue a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call3021904_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> moom.qY __sourceHandlerCall_f76f8e8dc81844a0bf1b(moom.Bl a0, moom.qY a1) throws E;
private static final class __SourceHandler_f76f8e8dc81844a0bf1b {

public static moom.qY f605(moom.Bl receiver, moom.qY p0) throws Throwable {
    moom.qY forwardValue605_24_0;
    moom.qY spill605_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_24: {
    forward_join_23: {
    life2_3 = (__fieldRead605_0() ^ 54968575640803L);
    life4_5 = __call605_1();
    spill605_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue605_24_0 = spill605_0;
        break forward_join_24;
    }
    __call605_4(__call605_2(spill605_0), "Profiler Position", __invokedynamic605_3(receiver));
    if (!((__fieldRead605_5(receiver) != null))) {
        break forward_join_23;
    }
    __call605_8(__call605_6(p0), "Player Count", __invokedynamic605_7(receiver));
    }
    forwardValue605_24_0 = p0;
    }
    return forwardValue605_24_0;
}
public static void h605_0(moom.Oo p0) throws Throwable {
    throw __call1060500_0(p0);
}
public static void h605_1(moom.Oo p0) throws Throwable {
    throw __call1060501_0(p0);
}
private static native long __fieldRead605_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call605_1() throws Throwable;
private static native moom.qZ __call605_2(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic605_3(moom.Bl a0) throws Throwable;
private static native void __call605_4(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __fieldRead605_5(moom.Bl a0) throws Throwable;
private static native moom.qZ __call605_6(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic605_7(moom.Bl a0) throws Throwable;
private static native void __call605_8(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.lang.Throwable __call1060500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_c263078720300fba08fa(moom.Bl a0, net.minecraft.command.ICommandSender a1, java.lang.String a2, moom.DT a3) throws E;
private static final class __SourceHandler_c263078720300fba08fa {

public static java.util.List f58(moom.Bl receiver, net.minecraft.command.ICommandSender p0, java.lang.String p1, moom.DT p2) throws Throwable {
    int lexicalValue58_25_0;
    int lexicalValue58_27_0;
    java.util.List lexicalValue58_40_0;
    int lexicalValue58_65_0;
    java.lang.String lexicalValue58_72_0;
    java.lang.String lexicalValue58_72_1;
    net.minecraft.entity.Entity[] spill58_0;
    java.lang.String spill58_1;
    java.lang.String spill58_2;
    boolean spill58_3;
    java.util.List spill58_4;
    int spill58_5;
    long life4_3;
    java.util.ArrayList life7_6;
    net.minecraft.entity.Entity[] life6_7;
    int life8_33;
    java.util.List life9_40;
    java.util.Iterator life10_50;
    java.lang.String life11_57;
    java.lang.String[] life8_98;
    java.lang.String life9_105;
    java.lang.String[] life10_109;
    int life11_112;
    int life12_114;
    java.lang.String life13_121;
    lexical_join_111: {
    lexical_join_72: {
    lexical_join_70: {
    lexical_join_68: {
    lexical_join_40: {
    lexical_join_27: {
    lexical_join_26: {
    lexical_join_25: {
    life4_3 = (__fieldRead58_0() ^ 101057170852866L);
    spill58_0 = __call58_1();
    life7_6 = __call58_2();
    life6_7 = spill58_0;
    spill58_1 = p1;
    spill58_2 = "/";
    if (!((life6_7 == null))) {
        lexicalValue58_72_0 = spill58_1;
        lexicalValue58_72_1 = spill58_2;
        break lexical_join_72;
    }
    if (!(__call58_3(spill58_1, spill58_2))) {
        break lexical_join_70;
    }
    p1 = __call58_4(p1, 1);
    spill58_3 = __call58_5(p1, " ");
    if (!((life6_7 == null))) {
        lexicalValue58_25_0 = __integerCategory58_6(spill58_3);
        break lexical_join_25;
    }
    if (!((!spill58_3))) {
        break lexical_join_26;
    }
    lexicalValue58_25_0 = 1;
    }
    lexicalValue58_27_0 = lexicalValue58_25_0;
    break lexical_join_27;
    }
    lexicalValue58_27_0 = 0;
    }
    life8_33 = lexicalValue58_27_0;
    life9_40 = __call58_8(__fieldRead58_7(receiver), p0, p1, p2);
    spill58_4 = life9_40;
    if (!((life6_7 == null))) {
        lexicalValue58_40_0 = spill58_4;
        break lexical_join_40;
    }
    if (!((spill58_4 != null))) {
        break lexical_join_68;
    }
    lexicalValue58_40_0 = life9_40;
    }
    life10_50 = __call58_9(lexicalValue58_40_0);
    lexical_cycle_42: while (true) {
    lexical_join_66: {
    lexical_join_65: {
    lexical_join_62: {
    if (!(__call58_10(life10_50))) {
        break lexical_join_68;
    }
    life11_57 = __cast58_12(__call58_11(life10_50));
    if (!((life6_7 == null))) {
        break lexical_join_111;
    }
    spill58_5 = life8_33;
    if (!((life6_7 == null))) {
        lexicalValue58_65_0 = spill58_5;
        break lexical_join_65;
    }
    if (!((spill58_5 != 0))) {
        break lexical_join_62;
    }
    __call58_14(life7_6, __invokedynamic58_13(life11_57));
    if (!((life6_7 != null))) {
        break lexical_join_66;
    }
    }
    lexicalValue58_65_0 = __integerCategory58_16(__call58_15(life7_6, life11_57));
    }
    __discardScalar58_17(lexicalValue58_65_0);
    }
    if (!((life6_7 != null))) { continue lexical_cycle_42; }
    break lexical_cycle_42;
    }
    }
    if (!((life6_7 != null))) {
        break lexical_join_111;
    }
    }
    lexicalValue58_72_0 = p1;
    lexicalValue58_72_1 = " ";
    }
    life8_98 = __call58_18(lexicalValue58_72_0, lexicalValue58_72_1, -1);
    life9_105 = (life8_98)[((life8_98).length - 1)];
    life10_109 = __call58_20(__fieldRead58_19(receiver));
    life11_112 = (life10_109).length;
    life12_114 = 0;
    lexical_cycle_91: while (true) {
    lexical_join_109: {
    lexical_join_108: {
    if (!((life12_114 < life11_112))) {
        break lexical_join_111;
    }
    life13_121 = (life10_109)[life12_114];
    if (!((life6_7 == null))) {
        break lexical_join_109;
    }
    if (!(__call58_21(life9_105, life13_121))) {
        break lexical_join_108;
    }
    __call58_22(life7_6, life13_121);
    }
    life12_114 += 1;
    }
    if (!((life6_7 != null))) { continue lexical_cycle_91; }
    break lexical_cycle_91;
    }
    }
    return life7_6;
}
public static void h58_0(moom.Oo p0) throws Throwable {
    throw __call1005800_0(p0);
}
public static void h58_1(moom.Oo p0) throws Throwable {
    throw __call1005801_0(p0);
}
public static void h58_2(moom.Oo p0) throws Throwable {
    throw __call1005802_0(p0);
}
public static void h58_3(moom.Oo p0) throws Throwable {
    throw __call1005803_0(p0);
}
public static void h58_4(moom.Oo p0) throws Throwable {
    throw __call1005804_0(p0);
}
public static void h58_5(moom.Oo p0) throws Throwable {
    throw __call1005805_0(p0);
}
public static void h58_6(moom.Oo p0) throws Throwable {
    throw __call1005806_0(p0);
}
public static void h58_7(moom.Oo p0) throws Throwable {
    throw __call1005807_0(p0);
}
public static void h58_8(moom.Oo p0) throws Throwable {
    throw __call1005808_0(p0);
}
public static void h58_9(moom.Oo p0) throws Throwable {
    throw __call1005809_0(p0);
}
private static native long __fieldRead58_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call58_1() throws Throwable;
private static native java.util.ArrayList __call58_2() throws Throwable;
private static native boolean __call58_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call58_4(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call58_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory58_6(boolean value) throws Throwable;
private static native net.minecraft.command.ICommandManager __fieldRead58_7(moom.Bl a0) throws Throwable;
private static native java.util.List __call58_8(net.minecraft.command.ICommandManager a0, net.minecraft.command.ICommandSender a1, java.lang.String a2, moom.DT a3) throws Throwable;
private static native java.util.Iterator __call58_9(java.util.List a0) throws Throwable;
private static native boolean __call58_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call58_11(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast58_12(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic58_13(java.lang.String a0) throws Throwable;
private static native boolean __call58_14(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native boolean __call58_15(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory58_16(boolean value) throws Throwable;
private static native void __discardScalar58_17(int a0) throws Throwable;
private static native java.lang.String[] __call58_18(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __fieldRead58_19(moom.Bl a0) throws Throwable;
private static native java.lang.String[] __call58_20(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native boolean __call58_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call58_22(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1005800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1005801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1005802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1005803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1005804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1005805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1005806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1005807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1005808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1005809_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_109b9ef20b3fc5a68e32(moom.Bl a0, net.minecraft.network.ServerStatusResponse a1) throws E;
private static final class __SourceHandler_109b9ef20b3fc5a68e32 {

public static void f220(moom.Bl receiver, net.minecraft.network.ServerStatusResponse p0) throws Throwable {
    int forestValue220_29_0;
    int forestValue220_31_0;
    int forestValue220_46_0;
    int forestValue220_48_0;
    net.minecraft.entity.Entity[] spill220_0;
    int spill220_1;
    int spill220_2;
    long life2_3;
    java.io.File life5_8;
    net.minecraft.entity.Entity[] life4_9;
    ByteBuf life6_14;
    java.awt.image.BufferedImage life7_17;
    ByteBuf life8_66;
    forest_join_72: {
    forest_join_48: {
    forest_join_47: {
    forest_join_46: {
    forest_join_31: {
    forest_join_30: {
    forest_join_29: {
    life2_3 = (__fieldRead220_0() ^ 11552627156719L);
    spill220_0 = __call220_1();
    life5_8 = __call220_2(receiver, "server-icon.png");
    life4_9 = spill220_0;
    if (!(__call220_3(life5_8))) {
        break forest_join_72;
    }
    life6_14 = __call220_4();
    life7_17 = __call220_5(life5_8);
    spill220_1 = __call220_6(life7_17);
    if (!((life4_9 == null))) {
        forestValue220_29_0 = spill220_1;
        break forest_join_29;
    }
    if (!((spill220_1 == __invokedynamic220_7(28106, (4776420877976438556L ^ life2_3))))) {
        break forest_join_30;
    }
    forestValue220_29_0 = 1;
    }
    forestValue220_31_0 = forestValue220_29_0;
    break forest_join_31;
    }
    forestValue220_31_0 = 0;
    }
    __call220_8(forestValue220_31_0, "Must be 64 pixels wide", new java.lang.Object[0]);
    spill220_2 = __call220_9(life7_17);
    if (!((life4_9 == null))) {
        forestValue220_46_0 = spill220_2;
        break forest_join_46;
    }
    if (!((spill220_2 == __invokedynamic220_10(4050, (1660327400130307342L ^ life2_3))))) {
        break forest_join_47;
    }
    forestValue220_46_0 = 1;
    }
    forestValue220_48_0 = forestValue220_46_0;
    break forest_join_48;
    }
    forestValue220_48_0 = 0;
    }
    __call220_11(forestValue220_48_0, "Must be 64 pixels high", new java.lang.Object[0]);
    __call220_12(life7_17, "PNG", new ByteBufOutputStream(life6_14));
    life8_66 = __call220_13(life6_14);
    __call220_17(p0, __invokedynamic220_16(__call220_15(life8_66, __fieldRead220_14())));
    __call220_18(life6_14);
    }
    return;
}
public static void h220_0(java.lang.Exception p0) throws Throwable {
    throw __call3022000_0(p0);
}
public static void h220_1(java.lang.Exception p0) throws Throwable {
    throw __call3022001_0(p0);
}
public static void h220_2(java.lang.Exception p0) throws Throwable {
    throw __call3022002_0(p0);
}
public static void h220_3(java.lang.Exception p0) throws Throwable {
    throw __call3022003_0(p0);
}
public static void h220_4(java.lang.Exception p0, ByteBuf p1, java.awt.image.BufferedImage p2) throws Throwable {
    java.lang.Exception life2_2;
    life2_2 = p0;
    __call3022004_1(__fieldRead3022004_0(), "Couldn't load server icon", life2_2);
    __call3022004_2(p1);
    return;
}
public static void h220_5(java.lang.Throwable p0, ByteBuf p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3022005_0(p1);
    throw life2_2;
}
private static native long __fieldRead220_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call220_1() throws Throwable;
private static native java.io.File __call220_2(moom.Bl a0, java.lang.String a1) throws Throwable;
private static native boolean __call220_3(java.io.File a0) throws Throwable;
private static native ByteBuf __call220_4() throws Throwable;
private static native java.awt.image.BufferedImage __call220_5(java.io.File a0) throws Throwable;
private static native int __call220_6(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __invokedynamic220_7(int a0, long a1) throws Throwable;
private static native void __call220_8(int a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __call220_9(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __invokedynamic220_10(int a0, long a1) throws Throwable;
private static native void __call220_11(int a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __call220_12(java.awt.image.BufferedImage a0, java.lang.String a1, ByteBufOutputStream a2) throws Throwable;
private static native ByteBuf __call220_13(ByteBuf a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead220_14() throws Throwable;
private static native java.lang.String __call220_15(ByteBuf a0, java.nio.charset.Charset a1) throws Throwable;
private static native java.lang.String __invokedynamic220_16(java.lang.String a0) throws Throwable;
private static native void __call220_17(net.minecraft.network.ServerStatusResponse a0, java.lang.String a1) throws Throwable;
private static native boolean __call220_18(ByteBuf a0) throws Throwable;
private static native java.lang.Throwable __call3022000_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3022001_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3022002_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3022003_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3022004_0() throws Throwable;
private static native void __call3022004_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native boolean __call3022004_2(ByteBuf a0) throws Throwable;
private static native boolean __call3022005_0(ByteBuf a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e1524100c71f1332077a(moom.Bl a0, net.minecraft.profiler.PlayerUsageSnooper a1) throws E;
private static final class __SourceHandler_e1524100c71f1332077a {

public static void f607(moom.Bl receiver, net.minecraft.profiler.PlayerUsageSnooper p0) throws Throwable {
    net.minecraft.profiler.PlayerUsageSnooper lexicalValue607_53_0;
    java.lang.String lexicalValue607_53_1;
    net.minecraft.profiler.PlayerUsageSnooper lexicalValue607_54_0;
    java.lang.String lexicalValue607_54_1;
    java.lang.String lexicalValue607_54_2;
    net.minecraft.entity.Entity[] spill607_0;
    net.minecraft.profiler.PlayerUsageSnooper spill607_1;
    java.lang.String spill607_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_14;
    int life5_94;
    net.minecraft.world.WorldServer[] life6_105;
    int life7_108;
    int life8_110;
    net.minecraft.world.WorldServer life9_117;
    net.minecraft.world.storage.WorldInfo life10_132;
    lexical_join_182: {
    lexical_join_177: {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_46: {
    lexical_join_40: {
    life2_3 = (__fieldRead607_0() ^ 79685604566701L);
    __call607_2(p0, "whitelist_enabled", __fieldRead607_1());
    spill607_0 = __call607_3();
    __call607_5(p0, "whitelist_count", __call607_4(0));
    life4_14 = spill607_0;
    if (!((life4_14 == null))) {
        break lexical_join_46;
    }
    if (!((__fieldRead607_6(receiver) != null))) {
        break lexical_join_40;
    }
    __call607_9(p0, "players_current", __call607_8(__call607_7(receiver)));
    __call607_12(p0, "players_max", __call607_11(__call607_10(receiver)));
    __call607_16(p0, "players_seen", __call607_15((__call607_14(__fieldRead607_13(receiver))).length));
    }
    __call607_19(p0, "uses_auth", __call607_18(__fieldRead607_17(receiver)));
    }
    spill607_1 = p0;
    spill607_2 = "gui_state";
    if (!(__call607_20(receiver))) {
        lexicalValue607_53_0 = spill607_1;
        lexicalValue607_53_1 = spill607_2;
        break lexical_join_53;
    }
    lexicalValue607_54_0 = spill607_1;
    lexicalValue607_54_1 = spill607_2;
    lexicalValue607_54_2 = "enabled";
    break lexical_join_54;
    }
    lexicalValue607_54_0 = lexicalValue607_53_0;
    lexicalValue607_54_1 = lexicalValue607_53_1;
    lexicalValue607_54_2 = "disabled";
    }
    __call607_21(lexicalValue607_54_0, lexicalValue607_54_1, lexicalValue607_54_2);
    __call607_27(p0, "run_time", __call607_26((((__call607_22() - __call607_23(p0)) / __invokedynamic607_24(31979, (8368891897052002749L ^ life2_3))) * __invokedynamic607_25(9434, (5542185655663206793L ^ life2_3)))));
    __call607_31(p0, "avg_tick_ms", __call607_30(((int) (__call607_29(__fieldRead607_28(receiver)) * 0x1.0c6f7a0b5ed8dp-20d))));
    life5_94 = 0;
    if (!((life4_14 == null))) {
        break lexical_join_182;
    }
    if (!((__fieldRead607_32(receiver) != null))) {
        break lexical_join_177;
    }
    life6_105 = __fieldRead607_33(receiver);
    life7_108 = (life6_105).length;
    life8_110 = 0;
    lexical_cycle_100: while (true) {
    lexical_join_175: {
    lexical_join_174: {
    if (!((life8_110 < life7_108))) {
        break lexical_join_177;
    }
    life9_117 = (life6_105)[life8_110];
    if (!((life4_14 == null))) {
        break lexical_join_182;
    }
    if (!((life4_14 == null))) {
        break lexical_join_175;
    }
    if (!((life9_117 != null))) {
        break lexical_join_174;
    }
    life10_132 = __call607_34(life9_117);
    __call607_39(p0, __invokedynamic607_35(life5_94), __call607_38(__call607_37(__fieldRead607_36(life9_117))));
    __call607_42(p0, __invokedynamic607_40(life5_94), __call607_41(life10_132));
    __call607_45(p0, __invokedynamic607_43(life5_94), __call607_44(life9_117));
    __call607_49(p0, __invokedynamic607_46(life5_94), __call607_48(__call607_47(life10_132)));
    __call607_53(p0, __invokedynamic607_50(life5_94), __call607_52(__call607_51(life10_132)));
    __call607_58(p0, __invokedynamic607_54(life5_94), __call607_57(__call607_56(__call607_55(life10_132))));
    __call607_62(p0, __invokedynamic607_59(life5_94), __call607_61(__fieldRead607_60(receiver)));
    __call607_67(p0, __invokedynamic607_63(life5_94), __call607_66(__call607_65(__call607_64(life9_117))));
    life5_94 += 1;
    }
    life8_110 += 1;
    }
    if (!((life4_14 != null))) { continue lexical_cycle_100; }
    break lexical_cycle_100;
    }
    }
    __call607_69(p0, "worlds", __call607_68(life5_94));
    }
    return;
}
public static void h607_0(moom.Oo p0) throws Throwable {
    throw __call1060700_0(p0);
}
public static void h607_1(moom.Oo p0) throws Throwable {
    throw __call1060701_0(p0);
}
public static void h607_2(moom.Oo p0) throws Throwable {
    throw __call1060702_0(p0);
}
public static void h607_3(moom.Oo p0) throws Throwable {
    throw __call1060703_0(p0);
}
public static void h607_4(moom.Oo p0) throws Throwable {
    throw __call1060704_0(p0);
}
public static void h607_5(moom.Oo p0) throws Throwable {
    throw __call1060705_0(p0);
}
private static native long __fieldRead607_0() throws Throwable;
private static native java.lang.Boolean __fieldRead607_1() throws Throwable;
private static native void __call607_2(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native net.minecraft.entity.Entity[] __call607_3() throws Throwable;
private static native java.lang.Integer __call607_4(int a0) throws Throwable;
private static native void __call607_5(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __fieldRead607_6(moom.Bl a0) throws Throwable;
private static native int __call607_7(moom.Bl a0) throws Throwable;
private static native java.lang.Integer __call607_8(int a0) throws Throwable;
private static native void __call607_9(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __call607_10(moom.Bl a0) throws Throwable;
private static native java.lang.Integer __call607_11(int a0) throws Throwable;
private static native void __call607_12(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __fieldRead607_13(moom.Bl a0) throws Throwable;
private static native java.lang.String[] __call607_14(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.lang.Integer __call607_15(int a0) throws Throwable;
private static native void __call607_16(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native boolean __fieldRead607_17(moom.Bl a0) throws Throwable;
private static native java.lang.Boolean __call607_18(boolean a0) throws Throwable;
private static native void __call607_19(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __call607_20(moom.Bl a0) throws Throwable;
private static native void __call607_21(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native long __call607_22() throws Throwable;
private static native long __call607_23(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native long __invokedynamic607_24(int a0, long a1) throws Throwable;
private static native long __invokedynamic607_25(int a0, long a1) throws Throwable;
private static native java.lang.Long __call607_26(long a0) throws Throwable;
private static native void __call607_27(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Long a2) throws Throwable;
private static native long[] __fieldRead607_28(moom.Bl a0) throws Throwable;
private static native double __call607_29(long[] a0) throws Throwable;
private static native java.lang.Integer __call607_30(int a0) throws Throwable;
private static native void __call607_31(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead607_32(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead607_33(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call607_34(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.String __invokedynamic607_35(int a0) throws Throwable;
private static native moom.EA __fieldRead607_36(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call607_37(moom.EA a0) throws Throwable;
private static native java.lang.Integer __call607_38(int a0) throws Throwable;
private static native void __call607_39(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.String __invokedynamic607_40(int a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call607_41(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call607_42(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, net.minecraft.world.WorldSettings$GameType a2) throws Throwable;
private static native java.lang.String __invokedynamic607_43(int a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call607_44(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call607_45(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, net.minecraft.world.EnumDifficulty a2) throws Throwable;
private static native java.lang.String __invokedynamic607_46(int a0) throws Throwable;
private static native boolean __call607_47(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.Boolean __call607_48(boolean a0) throws Throwable;
private static native void __call607_49(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native java.lang.String __invokedynamic607_50(int a0) throws Throwable;
private static native net.minecraft.world.WorldType __call607_51(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.String __call607_52(net.minecraft.world.WorldType a0) throws Throwable;
private static native void __call607_53(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic607_54(int a0) throws Throwable;
private static native net.minecraft.world.WorldType __call607_55(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __call607_56(net.minecraft.world.WorldType a0) throws Throwable;
private static native java.lang.Integer __call607_57(int a0) throws Throwable;
private static native void __call607_58(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.String __invokedynamic607_59(int a0) throws Throwable;
private static native int __fieldRead607_60(moom.Bl a0) throws Throwable;
private static native java.lang.Integer __call607_61(int a0) throws Throwable;
private static native void __call607_62(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.String __invokedynamic607_63(int a0) throws Throwable;
private static native moom.Fn __call607_64(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call607_65(moom.Fn a0) throws Throwable;
private static native java.lang.Integer __call607_66(int a0) throws Throwable;
private static native void __call607_67(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call607_68(int a0) throws Throwable;
private static native void __call607_69(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Throwable __call1060700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060705_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_34bd83ea1f27ad578bb9(moom.Bl a0, net.minecraft.world.EnumDifficulty a1) throws E;
private static final class __SourceHandler_34bd83ea1f27ad578bb9 {

public static void f608(moom.Bl receiver, net.minecraft.world.EnumDifficulty p0) throws Throwable {
    int lexicalValue608_43_0;
    net.minecraft.world.WorldServer lexicalValue608_55_0;
    net.minecraft.world.WorldServer lexicalValue608_56_0;
    int lexicalValue608_56_1;
    net.minecraft.entity.Entity[] spill608_0;
    boolean spill608_1;
    net.minecraft.world.WorldServer spill608_2;
    long life2_3;
    net.minecraft.world.WorldServer[] life5_7;
    net.minecraft.entity.Entity[] life4_8;
    int life6_11;
    int life7_13;
    net.minecraft.world.WorldServer life8_20;
    lexical_join_73: {
    life2_3 = (__fieldRead608_0() ^ 123186505483730L);
    spill608_0 = __call608_1();
    life5_7 = __fieldRead608_2(receiver);
    life4_8 = spill608_0;
    life6_11 = (life5_7).length;
    life7_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_60: {
    lexical_join_56: {
    lexical_join_55: {
    lexical_join_43: {
    lexical_join_41: {
    if (!((life7_13 < life6_11))) {
        break lexical_join_73;
    }
    life8_20 = (life5_7)[life7_13];
    if (!((life4_8 == null))) {
        break lexical_join_71;
    }
    if (!((life8_20 != null))) {
        break lexical_join_70;
    }
    spill608_1 = __call608_4(__call608_3(life8_20));
    if (!((life4_8 == null))) {
        lexicalValue608_43_0 = __integerCategory608_5(spill608_1);
        break lexical_join_43;
    }
    if (!(spill608_1)) {
        break lexical_join_41;
    }
    __call608_8(__call608_6(life8_20), __fieldRead608_7());
    __call608_9(life8_20, 1, 1);
    if (!((life4_8 != null))) {
        break lexical_join_70;
    }
    }
    lexicalValue608_43_0 = __integerCategory608_11(__call608_10(receiver));
    }
    if (!((lexicalValue608_43_0 != 0))) {
        break lexical_join_60;
    }
    __call608_13(__call608_12(life8_20), p0);
    spill608_2 = life8_20;
    if (!((__call608_14(life8_20) != __fieldRead608_15()))) {
        lexicalValue608_55_0 = spill608_2;
        break lexical_join_55;
    }
    lexicalValue608_56_0 = spill608_2;
    lexicalValue608_56_1 = 1;
    break lexical_join_56;
    }
    lexicalValue608_56_0 = lexicalValue608_55_0;
    lexicalValue608_56_1 = 0;
    }
    __call608_16(lexicalValue608_56_0, lexicalValue608_56_1, 1);
    if (!((life4_8 != null))) {
        break lexical_join_70;
    }
    }
    __call608_18(__call608_17(life8_20), p0);
    __call608_21(life8_20, __call608_19(receiver), __fieldRead608_20(receiver));
    }
    life7_13 += 1;
    }
    if (!((life4_8 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}
public static void h608_0(moom.Oo p0) throws Throwable {
    throw __call1060800_0(p0);
}
public static void h608_1(moom.Oo p0) throws Throwable {
    throw __call1060801_0(p0);
}
public static void h608_2(moom.Oo p0) throws Throwable {
    throw __call1060802_0(p0);
}
public static void h608_3(moom.Oo p0) throws Throwable {
    throw __call1060803_0(p0);
}
public static void h608_4(moom.Oo p0) throws Throwable {
    throw __call1060804_0(p0);
}
public static void h608_5(moom.Oo p0) throws Throwable {
    throw __call1060805_0(p0);
}
public static void h608_6(moom.Oo p0) throws Throwable {
    throw __call1060806_0(p0);
}
public static void h608_7(moom.Oo p0) throws Throwable {
    throw __call1060807_0(p0);
}
private static native long __fieldRead608_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call608_1() throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead608_2(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call608_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call608_4(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory608_5(boolean value) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call608_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead608_7() throws Throwable;
private static native void __call608_8(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native void __call608_9(net.minecraft.world.WorldServer a0, int a1, int a2) throws Throwable;
private static native boolean __call608_10(moom.Bl a0) throws Throwable;
private static native int __integerCategory608_11(boolean value) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call608_12(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call608_13(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call608_14(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead608_15() throws Throwable;
private static native void __call608_16(net.minecraft.world.WorldServer a0, int a1, int a2) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call608_17(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call608_18(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native boolean __call608_19(moom.Bl a0) throws Throwable;
private static native boolean __fieldRead608_20(moom.Bl a0) throws Throwable;
private static native void __call608_21(net.minecraft.world.WorldServer a0, boolean a1, boolean a2) throws Throwable;
private static native java.lang.Throwable __call1060800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1060807_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_16c2f393213ee365024e(moom.Bl a0, boolean a1) throws E;
private static final class __SourceHandler_16c2f393213ee365024e {

public static void f592(moom.Bl receiver, boolean p0) throws Throwable {
    moom.Bl forestValue592_12_0;
    moom.Bl spill592_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.world.WorldServer[] life5_15;
    int life6_18;
    int life7_20;
    net.minecraft.world.WorldServer life8_27;
    forest_join_48: {
    forest_join_12: {
    life2_3 = (__fieldRead592_0() ^ 8905390626435L);
    life4_5 = __call592_1();
    spill592_0 = receiver;
    if (!((life4_5 == null))) {
        forestValue592_12_0 = spill592_0;
        break forest_join_12;
    }
    if (!((!__fieldRead592_2(spill592_0)))) {
        break forest_join_48;
    }
    forestValue592_12_0 = receiver;
    }
    life5_15 = __fieldRead592_3(forestValue592_12_0);
    life6_18 = (life5_15).length;
    life7_20 = 0;
    forest_cycle_19: while (true) {
    forest_join_46: {
    forest_join_45: {
    forest_join_41: {
    if (!((life7_20 < life6_18))) {
        break forest_join_48;
    }
    life8_27 = (life5_15)[life7_20];
    if (!((life4_5 == null))) {
        break forest_join_46;
    }
    if (!((life8_27 != null))) {
        break forest_join_45;
    }
    if (!((!p0))) {
        break forest_join_41;
    }
    __call592_10(__fieldRead592_4(), __invokedynamic592_9(__call592_6(__call592_5(life8_27)), __call592_8(__fieldRead592_7(life8_27))));
    }
    __call592_11(life8_27, 1, null);
    }
    life7_20 += 1;
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_19;
    }
    break forest_cycle_19;
    }
    }
    return;
}
public static void h592_0(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3059200_0(p0);
}
public static void h592_1(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3059201_0(p0);
}
public static void h592_2(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3059202_0(p0);
}
public static void h592_3(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3059203_0(p0);
}
public static void h592_4(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3059204_0(p0);
}
public static void h592_5(net.minecraft.world.MinecraftException p0, boolean p1, net.minecraft.entity.Entity[] p2, net.minecraft.world.WorldServer[] p3, int p4, int p5, net.minecraft.world.WorldServer p6) throws Throwable {
    net.minecraft.world.MinecraftException life7_2;
    net.minecraft.world.WorldServer life6_17;
    forest_join_37: {
    life7_2 = p0;
    __call3059205_2(__fieldRead3059205_0(), __call3059205_1(life7_2));
    forest_cycle_6: while (true) {
    forest_join_32: {
    p5 += 1;
    forest_cycle_7: while (true) {
    forest_join_10: {
    if (!((p2 != null))) {
        break forest_join_10;
    }
    break forest_join_37;
    }
    if (!((p5 < p4))) {
        break forest_join_37;
    }
    life6_17 = (p3)[p5];
    if (!((p2 == null))) {
        continue forest_cycle_7;
    }
    break forest_cycle_7;
    }
    if (!((life6_17 != null))) {
        continue forest_cycle_6;
    }
    if (!((!p1))) {
        break forest_join_32;
    }
    __call3059205_9(__fieldRead3059205_3(), __invokedynamic3059205_8(__call3059205_5(__call3059205_4(life6_17)), __call3059205_7(__fieldRead3059205_6(life6_17))));
    }
    __call3059205_10(life6_17, 1, null);
    continue forest_cycle_6;
    }
    }
    return;
}
private static native long __fieldRead592_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call592_1() throws Throwable;
private static native boolean __fieldRead592_2(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead592_3(moom.Bl a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead592_4() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call592_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.String __call592_6(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native moom.EA __fieldRead592_7(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.String __call592_8(moom.EA a0) throws Throwable;
private static native java.lang.String __invokedynamic592_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call592_10(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call592_11(net.minecraft.world.WorldServer a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Throwable __call3059200_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native java.lang.Throwable __call3059201_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native java.lang.Throwable __call3059202_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native java.lang.Throwable __call3059203_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native java.lang.Throwable __call3059204_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3059205_0() throws Throwable;
private static native java.lang.String __call3059205_1(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native void __call3059205_2(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3059205_3() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call3059205_4(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.String __call3059205_5(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native moom.EA __fieldRead3059205_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.String __call3059205_7(moom.EA a0) throws Throwable;
private static native java.lang.String __invokedynamic3059205_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3059205_9(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call3059205_10(net.minecraft.world.WorldServer a0, int a1, java.lang.Object a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_16d327c5c895cbfc26b9(moom.Bl a0) throws E;
private static final class __SourceHandler_16d327c5c895cbfc26b9 {

public static void f591(moom.Bl receiver) throws Throwable {
    int forestValue591_54_0;
    moom.Bl forestValue591_141_0;
    net.minecraft.entity.Entity[] spill591_0;
    moom.Bl spill591_1;
    boolean spill591_2;
    long life1_3;
    int life4_9;
    int life5_11;
    int life6_17;
    int life7_23;
    int life8_25;
    int life9_31;
    net.minecraft.world.WorldServer life10_40;
    moom.DT life11_43;
    long life12_45;
    net.minecraft.entity.Entity[] life3_46;
    int life14_52;
    int life15_74;
    long life16_88;
    forest_join_141: {
    forest_join_140: {
    life1_3 = (__fieldRead591_0() ^ 119846780363438L);
    life4_9 = __invokedynamic591_1(14894, (4313398987491529911L ^ life1_3));
    life5_11 = 4;
    life6_17 = __invokedynamic591_2(22751, (7604091972736300632L ^ life1_3));
    life7_23 = __invokedynamic591_3(18463, (8502122553683650180L ^ life1_3));
    life8_25 = 0;
    spill591_0 = __call591_4();
    __call591_5(receiver, "menu.generatingTerrain");
    life9_31 = 0;
    __call591_8(__fieldRead591_6(), __invokedynamic591_7(life9_31));
    life10_40 = (__fieldRead591_9(receiver))[life9_31];
    life11_43 = __call591_10(life10_40);
    life12_45 = __call591_11();
    life3_46 = spill591_0;
    life14_52 = __invokedynamic591_12(3136, (113541143296729810L ^ life1_3));
    forest_cycle_53: while (true) {
    forest_join_137: {
    forestValue591_54_0 = life14_52;
    forest_cycle_54: while (true) {
    if (!((forestValue591_54_0 <= __invokedynamic591_13(23568, (3683710461683643016L ^ life1_3))))) {
        break forest_join_140;
    }
    spill591_1 = receiver;
    if (!((life3_46 == null))) {
        forestValue591_141_0 = spill591_1;
        break forest_join_141;
    }
    if (!((life3_46 == null))) {
        forestValue591_141_0 = spill591_1;
        break forest_join_141;
    }
    if (!(__call591_14(spill591_1))) {
        break forest_join_140;
    }
    life15_74 = __invokedynamic591_15(2215, (5986349153224287798L ^ life1_3));
    forest_cycle_73: while (true) {
    forest_join_135: {
    forest_join_117: {
    if (!((life15_74 <= __invokedynamic591_16(23568, (3683710461683643016L ^ life1_3))))) {
        break forest_join_137;
    }
    spill591_2 = __call591_17(receiver);
    if (!((life3_46 == null))) {
        forestValue591_54_0 = __integerCategory591_18(spill591_2);
        continue forest_cycle_54;
    }
    if (!(spill591_2)) {
        break forest_join_137;
    }
    life16_88 = __call591_19();
    if (!((life3_46 == null))) {
        break forest_join_135;
    }
    if (!((__numericCompare591_21((life16_88 - life12_45), __invokedynamic591_20(18351, (5550927369515058936L ^ life1_3))) > 0))) {
        break forest_join_117;
    }
    __call591_24(receiver, "Preparing spawn area", ((life8_25 * __invokedynamic591_22(3845, (6613922100827873680L ^ life1_3))) / __invokedynamic591_23(13949, (3429858343461116129L ^ life1_3))));
    life12_45 = life16_88;
    }
    life8_25 += 1;
    __call591_28(__fieldRead591_25(life10_40), ((__call591_26(life11_43) + life14_52) >> 4), ((__call591_27(life11_43) + life15_74) >> 4));
    life15_74 += 16;
    }
    if (!((life3_46 != null))) {
        continue forest_cycle_73;
    }
    break forest_cycle_73;
    }
    break forest_cycle_54;
    }
    }
    life14_52 += 16;
    if (!((life3_46 != null))) {
        continue forest_cycle_53;
    }
    break forest_cycle_53;
    }
    }
    forestValue591_141_0 = receiver;
    }
    __call591_29(forestValue591_141_0);
    return;
}
public static void h591_0(moom.Oo p0) throws Throwable {
    throw __call3059100_0(p0);
}
public static void h591_1(moom.Oo p0) throws Throwable {
    throw __call3059101_0(p0);
}
public static void h591_2(moom.Oo p0) throws Throwable {
    throw __call3059102_0(p0);
}
private static native long __fieldRead591_0() throws Throwable;
private static native int __invokedynamic591_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic591_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic591_3(int a0, long a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call591_4() throws Throwable;
private static native void __call591_5(moom.Bl a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead591_6() throws Throwable;
private static native java.lang.String __invokedynamic591_7(int a0) throws Throwable;
private static native void __call591_8(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead591_9(moom.Bl a0) throws Throwable;
private static native moom.DT __call591_10(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __call591_11() throws Throwable;
private static native int __invokedynamic591_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic591_13(int a0, long a1) throws Throwable;
private static native boolean __call591_14(moom.Bl a0) throws Throwable;
private static native int __invokedynamic591_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic591_16(int a0, long a1) throws Throwable;
private static native boolean __call591_17(moom.Bl a0) throws Throwable;
private static native int __integerCategory591_18(boolean value) throws Throwable;
private static native long __call591_19() throws Throwable;
private static native long __invokedynamic591_20(int a0, long a1) throws Throwable;
private static native int __numericCompare591_21(long a0, long a1) throws Throwable;
private static native int __invokedynamic591_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic591_23(int a0, long a1) throws Throwable;
private static native void __call591_24(moom.Bl a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.world.gen.ChunkProviderServer __fieldRead591_25(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call591_26(moom.DT a0) throws Throwable;
private static native int __call591_27(moom.DT a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call591_28(net.minecraft.world.gen.ChunkProviderServer a0, int a1, int a2) throws Throwable;
private static native void __call591_29(moom.Bl a0) throws Throwable;
private static native java.lang.Throwable __call3059100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3059101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3059102_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_22941b1b69e1593d7444(moom.Bl a0, java.lang.String a1) throws E;
private static final class __SourceHandler_22941b1b69e1593d7444 {

public static void f59(moom.Bl receiver, java.lang.String p0) throws Throwable {
    int forwardValue59_27_0;
    boolean spill59_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_28: {
    forward_join_27: {
    life2_3 = (__fieldRead59_0() ^ 53541109769533L);
    life4_5 = __call59_1();
    spill59_0 = __call59_3(__call59_2(receiver), p0);
    if (!((life4_5 == null))) {
        forwardValue59_27_0 = __integerCategory59_4(spill59_0);
        break forward_join_27;
    }
    if (!(spill59_0)) {
        break forward_join_28;
    }
    __call59_6(__fieldRead59_5(), "Converting map!");
    __call59_7(receiver, "menu.convertingLevel");
    forwardValue59_27_0 = __integerCategory59_10(__call59_9(__call59_8(receiver), p0, new moom.Bn(receiver)));
    }
    __discardScalar59_11(forwardValue59_27_0);
    }
    return;
}
public static void h59_0(moom.Oo p0) throws Throwable {
    throw __call1005900_0(p0);
}
public static void h59_1(moom.Oo p0) throws Throwable {
    throw __call1005901_0(p0);
}
private static native long __fieldRead59_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call59_1() throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __call59_2(moom.Bl a0) throws Throwable;
private static native boolean __call59_3(net.minecraft.world.storage.ISaveFormat a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory59_4(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead59_5() throws Throwable;
private static native void __call59_6(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call59_7(moom.Bl a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __call59_8(moom.Bl a0) throws Throwable;
private static native boolean __call59_9(net.minecraft.world.storage.ISaveFormat a0, java.lang.String a1, moom.Bn a2) throws Throwable;
private static native int __integerCategory59_10(boolean value) throws Throwable;
private static native void __discardScalar59_11(int a0) throws Throwable;
private static native java.lang.Throwable __call1005900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1005901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f7a2f687324a7cd20c40(moom.Bl a0, net.minecraft.profiler.PlayerUsageSnooper a1) throws E;
private static final class __SourceHandler_f7a2f687324a7cd20c40 {

public static void f611(moom.Bl receiver, net.minecraft.profiler.PlayerUsageSnooper p0) throws Throwable {
    net.minecraft.profiler.PlayerUsageSnooper forwardValue611_24_0;
    java.lang.String forwardValue611_24_1;
    java.lang.String forwardValue611_24_2;
    net.minecraft.profiler.PlayerUsageSnooper forwardValue611_25_0;
    java.lang.String forwardValue611_25_1;
    net.minecraft.profiler.PlayerUsageSnooper forwardValue611_26_0;
    java.lang.String forwardValue611_26_1;
    java.lang.String forwardValue611_26_2;
    net.minecraft.entity.Entity[] spill611_0;
    net.minecraft.profiler.PlayerUsageSnooper spill611_1;
    java.lang.String spill611_2;
    java.lang.String spill611_3;
    net.minecraft.profiler.PlayerUsageSnooper spill611_4;
    java.lang.String spill611_5;
    long life2_3;
    net.minecraft.entity.Entity[] life4_11;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (__fieldRead611_0() ^ 136247693486274L);
    spill611_0 = __call611_1();
    __call611_4(p0, "singleplayer", __call611_3(__call611_2(receiver)));
    life4_11 = spill611_0;
    spill611_1 = p0;
    spill611_2 = "server_brand";
    spill611_3 = __call611_5(receiver);
    if (!((life4_11 == null))) {
        forwardValue611_24_0 = spill611_1;
        forwardValue611_24_1 = spill611_2;
        forwardValue611_24_2 = spill611_3;
        break forward_join_24;
    }
    __call611_6(spill611_1, spill611_2, spill611_3);
    spill611_4 = p0;
    spill611_5 = "gui_supported";
    if (!(__call611_7())) {
        forwardValue611_25_0 = spill611_4;
        forwardValue611_25_1 = spill611_5;
        break forward_join_25;
    }
    forwardValue611_24_0 = spill611_4;
    forwardValue611_24_1 = spill611_5;
    forwardValue611_24_2 = "headless";
    }
    forwardValue611_26_0 = forwardValue611_24_0;
    forwardValue611_26_1 = forwardValue611_24_1;
    forwardValue611_26_2 = forwardValue611_24_2;
    break forward_join_26;
    }
    forwardValue611_26_0 = forwardValue611_25_0;
    forwardValue611_26_1 = forwardValue611_25_1;
    forwardValue611_26_2 = "supported";
    }
    __call611_8(forwardValue611_26_0, forwardValue611_26_1, forwardValue611_26_2);
    __call611_11(p0, "dedicated", __call611_10(__call611_9(receiver)));
    return;
}
public static void h611_0(moom.Oo p0) throws Throwable {
    throw __call1061100_0(p0);
}
public static void h611_1(moom.Oo p0) throws Throwable {
    throw __call1061101_0(p0);
}
private static native long __fieldRead611_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call611_1() throws Throwable;
private static native boolean __call611_2(moom.Bl a0) throws Throwable;
private static native java.lang.Boolean __call611_3(boolean a0) throws Throwable;
private static native void __call611_4(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native java.lang.String __call611_5(moom.Bl a0) throws Throwable;
private static native void __call611_6(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call611_7() throws Throwable;
private static native void __call611_8(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call611_9(moom.Bl a0) throws Throwable;
private static native java.lang.Boolean __call611_10(boolean a0) throws Throwable;
private static native void __call611_11(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native java.lang.Throwable __call1061100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1061101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7d0794c93b621d75169c(moom.Bl a0) throws E;
private static final class __SourceHandler_7d0794c93b621d75169c {

public static boolean f1069(moom.Bl receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead1069_0() ^ 61472609246134L);
    return ((__call1069_1() == __fieldRead1069_2(receiver)) ? true : false);
}
public static void h1069_0(moom.Oo p0) throws Throwable {
    throw __call1106900_0(p0);
}
private static native long __fieldRead1069_0() throws Throwable;
private static native java.lang.Thread __call1069_1() throws Throwable;
private static native java.lang.Thread __fieldRead1069_2(moom.Bl a0) throws Throwable;
private static native java.lang.Throwable __call1106900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_86f935902b51d4accd46(moom.Bl a0) throws E;
private static final class __SourceHandler_86f935902b51d4accd46 {

public static void f612(moom.Bl receiver) throws Throwable {
    moom.Bl lexicalValue612_15_0;
    moom.Bl lexicalValue612_23_0;
    moom.Bl lexicalValue612_37_0;
    moom.Bl lexicalValue612_70_0;
    net.minecraft.profiler.PlayerUsageSnooper lexicalValue612_77_0;
    moom.Bl spill612_0;
    net.minecraft.profiler.PlayerUsageSnooper spill612_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.world.WorldServer[] life4_70;
    int life5_73;
    int life6_75;
    net.minecraft.world.WorldServer life7_82;
    lexical_join_78: {
    lexical_join_77: {
    lexical_join_70: {
    lexical_join_69: {
    lexical_join_37: {
    lexical_join_36: {
    lexical_join_23: {
    lexical_join_22: {
    lexical_join_15: {
    life1_3 = (__fieldRead612_0() ^ 95203279125948L);
    life3_5 = __call612_1();
    spill612_0 = receiver;
    if (!((life3_5 == null))) {
        lexicalValue612_15_0 = spill612_0;
        break lexical_join_15;
    }
    if (!((!__fieldRead612_2(spill612_0)))) {
        break lexical_join_78;
    }
    __call612_4(__fieldRead612_3(), "Stopping server");
    lexicalValue612_15_0 = receiver;
    }
    if (!((life3_5 == null))) {
        lexicalValue612_23_0 = lexicalValue612_15_0;
        break lexical_join_23;
    }
    if (!((__call612_5(lexicalValue612_15_0) != null))) {
        break lexical_join_22;
    }
    __call612_7(__call612_6(receiver));
    }
    lexicalValue612_23_0 = receiver;
    }
    if (!((life3_5 == null))) {
        lexicalValue612_37_0 = lexicalValue612_23_0;
        break lexical_join_37;
    }
    if (!((__fieldRead612_8(lexicalValue612_23_0) != null))) {
        break lexical_join_36;
    }
    __call612_10(__fieldRead612_9(), "Saving players");
    __call612_12(__fieldRead612_11(receiver));
    __call612_14(__fieldRead612_13(receiver));
    }
    lexicalValue612_37_0 = receiver;
    }
    if (!((life3_5 == null))) {
        lexicalValue612_70_0 = lexicalValue612_37_0;
        break lexical_join_70;
    }
    if (!((__fieldRead612_15(lexicalValue612_37_0) != null))) {
        break lexical_join_69;
    }
    __call612_17(__fieldRead612_16(), "Saving worlds");
    __call612_18(receiver, 0);
    life4_70 = __fieldRead612_19(receiver);
    life5_73 = (life4_70).length;
    life6_75 = 0;
    lexical_cycle_55: while (true) {
    if (!((life6_75 < life5_73))) {
        break lexical_join_69;
    }
    life7_82 = (life4_70)[life6_75];
    __call612_20(life7_82);
    life6_75 += 1;
    if (!((life3_5 == null))) {
        break lexical_join_78;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_55; }
    break lexical_cycle_55;
    }
    }
    lexicalValue612_70_0 = receiver;
    }
    spill612_1 = __fieldRead612_21(lexicalValue612_70_0);
    if (!((life3_5 == null))) {
        lexicalValue612_77_0 = spill612_1;
        break lexical_join_77;
    }
    if (!(__call612_22(spill612_1))) {
        break lexical_join_78;
    }
    lexicalValue612_77_0 = __fieldRead612_23(receiver);
    }
    __call612_24(lexicalValue612_77_0);
    }
    return;
}
public static void h612_0(moom.Oo p0) throws Throwable {
    throw __call1061200_0(p0);
}
public static void h612_1(moom.Oo p0) throws Throwable {
    throw __call1061201_0(p0);
}
public static void h612_2(moom.Oo p0) throws Throwable {
    throw __call1061202_0(p0);
}
public static void h612_3(moom.Oo p0) throws Throwable {
    throw __call1061203_0(p0);
}
public static void h612_4(moom.Oo p0) throws Throwable {
    throw __call1061204_0(p0);
}
public static void h612_5(moom.Oo p0) throws Throwable {
    throw __call1061205_0(p0);
}
public static void h612_6(moom.Oo p0) throws Throwable {
    throw __call1061206_0(p0);
}
public static void h612_7(moom.Oo p0) throws Throwable {
    throw __call1061207_0(p0);
}
public static void h612_8(moom.Oo p0) throws Throwable {
    throw __call1061208_0(p0);
}
public static void h612_9(moom.Oo p0) throws Throwable {
    throw __call1061209_0(p0);
}
private static native long __fieldRead612_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call612_1() throws Throwable;
private static native boolean __fieldRead612_2(moom.Bl a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead612_3() throws Throwable;
private static native void __call612_4(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.network.NetworkSystem __call612_5(moom.Bl a0) throws Throwable;
private static native net.minecraft.network.NetworkSystem __call612_6(moom.Bl a0) throws Throwable;
private static native void __call612_7(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __fieldRead612_8(moom.Bl a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead612_9() throws Throwable;
private static native void __call612_10(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __fieldRead612_11(moom.Bl a0) throws Throwable;
private static native void __call612_12(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __fieldRead612_13(moom.Bl a0) throws Throwable;
private static native void __call612_14(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead612_15(moom.Bl a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead612_16() throws Throwable;
private static native void __call612_17(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call612_18(moom.Bl a0, int a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead612_19(moom.Bl a0) throws Throwable;
private static native void __call612_20(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead612_21(moom.Bl a0) throws Throwable;
private static native boolean __call612_22(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead612_23(moom.Bl a0) throws Throwable;
private static native void __call612_24(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.lang.Throwable __call1061200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1061201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1061202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1061203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1061204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1061205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1061206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1061207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1061208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1061209_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_38aff7ca69cd249a49b2(moom.Bl a0) throws E;
private static final class __SourceHandler_38aff7ca69cd249a49b2 {

public static void f60(moom.Bl receiver) throws Throwable {
    int lexicalValue60_45_0;
    int lexicalValue60_120_0;
    int lexicalValue60_164_0;
    int lexicalValue60_189_0;
    int lexicalValue60_189_1;
    int lexicalValue60_190_0;
    moom.Bl lexicalValue60_198_0;
    net.minecraft.entity.Entity[] spill60_0;
    boolean spill60_1;
    int spill60_2;
    int spill60_3;
    moom.Bl spill60_4;
    long life1_3;
    long life4_6;
    net.minecraft.entity.Entity[] life3_7;
    com.mojang.authlib.GameProfile[] life6_79;
    int life7_89;
    int life8_91;
    lexical_join_198: {
    lexical_join_194: {
    lexical_join_190: {
    lexical_join_189: {
    lexical_join_180: {
    lexical_join_164: {
    lexical_join_136: {
    lexical_join_120: {
    lexical_join_112: {
    lexical_join_107: {
    lexical_join_104: {
    lexical_join_45: {
    lexical_join_29: {
    life1_3 = (__fieldRead60_0() ^ 98105544103064L);
    spill60_0 = __call60_1();
    life4_6 = __call60_2();
    life3_7 = spill60_0;
    moom.Bl __stackOp60_3_0 = receiver;
    __fieldWrite60_5(__stackOp60_3_0, (__fieldRead60_4(__stackOp60_3_0) + 1));
    spill60_1 = __fieldRead60_6(receiver);
    if (!((life3_7 == null))) {
        lexicalValue60_45_0 = __integerCategory60_7(spill60_1);
        break lexical_join_45;
    }
    if (!(spill60_1)) {
        break lexical_join_29;
    }
    __fieldWrite60_8(receiver, 0);
    __fieldWrite60_10(__fieldRead60_9(receiver), 1);
    __call60_12(__fieldRead60_11(receiver));
    }
    __call60_14(__fieldRead60_13(receiver), "root");
    __call60_15(receiver);
    lexicalValue60_45_0 = __numericCompare60_18((life4_6 - __fieldRead60_16(receiver)), __invokedynamic60_17(23913, (4784216284664949260L ^ life1_3)));
    }
    if (!((life3_7 == null))) {
        lexicalValue60_120_0 = lexicalValue60_45_0;
        break lexical_join_120;
    }
    if (!((lexicalValue60_45_0 >= 0))) {
        break lexical_join_112;
    }
    __fieldWrite60_19(receiver, life4_6);
    __call60_23(__fieldRead60_20(receiver), new net.minecraft.network.ServerStatusResponse$PlayerCountData(__call60_21(receiver), __call60_22(receiver)));
    life6_79 = new com.mojang.authlib.GameProfile[__call60_26(__call60_24(receiver), __invokedynamic60_25(1987, (6462879273500893029L ^ life1_3)))];
    life7_89 = __call60_29(__fieldRead60_27(receiver), 0, (__call60_28(receiver) - (life6_79).length));
    life8_91 = 0;
    lexical_cycle_83: while (true) {
    if (!((life8_91 < (life6_79).length))) {
        break lexical_join_104;
    }
    (life6_79)[life8_91] = __call60_34(__cast60_33(__call60_32(__call60_31(__fieldRead60_30(receiver)), (life7_89 + life8_91))));
    life8_91 += 1;
    if (!((life3_7 == null))) {
        break lexical_join_107;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_83; }
    break lexical_cycle_83;
    }
    }
    __call60_36(__call60_35(life6_79));
    }
    __call60_39(__call60_38(__fieldRead60_37(receiver)), life6_79);
    }
    lexicalValue60_120_0 = (__fieldRead60_40(receiver) % __invokedynamic60_41(5491, (8314015324826553814L ^ life1_3)));
    }
    if (!((life3_7 == null))) {
        lexicalValue60_164_0 = lexicalValue60_120_0;
        break lexical_join_164;
    }
    if (!((lexicalValue60_120_0 == 0))) {
        break lexical_join_136;
    }
    __call60_43(__fieldRead60_42(receiver), "save");
    __call60_45(__fieldRead60_44(receiver));
    __call60_46(receiver, 1);
    __call60_48(__fieldRead60_47(receiver));
    }
    __call60_50(__fieldRead60_49(receiver), "tallying");
    (__fieldRead60_51(receiver))[(__fieldRead60_52(receiver) % __invokedynamic60_53(17056, (4679449511619205650L ^ life1_3)))] = (__call60_54() - life4_6);
    __call60_56(__fieldRead60_55(receiver));
    __call60_58(__fieldRead60_57(receiver), "snooper");
    lexicalValue60_164_0 = __integerCategory60_61(__call60_60(__fieldRead60_59(receiver)));
    }
    if (!((life3_7 == null))) {
        lexicalValue60_190_0 = lexicalValue60_164_0;
        break lexical_join_190;
    }
    if (!((lexicalValue60_164_0 == 0))) {
        break lexical_join_180;
    }
    spill60_2 = __fieldRead60_62(receiver);
    spill60_3 = __invokedynamic60_63(17056, (4679449511619205650L ^ life1_3));
    if (!((life3_7 == null))) {
        lexicalValue60_189_0 = spill60_2;
        lexicalValue60_189_1 = spill60_3;
        break lexical_join_189;
    }
    if (!((spill60_2 > spill60_3))) {
        break lexical_join_180;
    }
    __call60_65(__fieldRead60_64(receiver));
    }
    spill60_4 = receiver;
    if (!((life3_7 == null))) {
        lexicalValue60_198_0 = spill60_4;
        break lexical_join_198;
    }
    lexicalValue60_189_0 = __fieldRead60_66(spill60_4);
    lexicalValue60_189_1 = __invokedynamic60_67(25118, (699163139133815486L ^ life1_3));
    }
    lexicalValue60_190_0 = (lexicalValue60_189_0 % lexicalValue60_189_1);
    }
    if (!((lexicalValue60_190_0 == 0))) {
        break lexical_join_194;
    }
    __call60_69(__fieldRead60_68(receiver));
    }
    __call60_71(__fieldRead60_70(receiver));
    lexicalValue60_198_0 = receiver;
    }
    __call60_73(__fieldRead60_72(lexicalValue60_198_0));
    return;
}
public static void h60_0(moom.Oo p0) throws Throwable {
    throw __call1006000_0(p0);
}
public static void h60_1(moom.Oo p0) throws Throwable {
    throw __call1006001_0(p0);
}
public static void h60_2(moom.Oo p0) throws Throwable {
    throw __call1006002_0(p0);
}
public static void h60_3(moom.Oo p0) throws Throwable {
    throw __call1006003_0(p0);
}
public static void h60_4(moom.Oo p0) throws Throwable {
    throw __call1006004_0(p0);
}
public static void h60_5(moom.Oo p0) throws Throwable {
    throw __call1006005_0(p0);
}
public static void h60_6(moom.Oo p0) throws Throwable {
    throw __call1006006_0(p0);
}
public static void h60_7(moom.Oo p0) throws Throwable {
    throw __call1006007_0(p0);
}
public static void h60_8(moom.Oo p0) throws Throwable {
    throw __call1006008_0(p0);
}
public static void h60_9(moom.Oo p0) throws Throwable {
    throw __call1006009_0(p0);
}
public static void h60_10(moom.Oo p0) throws Throwable {
    throw __call1006010_0(p0);
}
public static void h60_11(moom.Oo p0) throws Throwable {
    throw __call1006011_0(p0);
}
private static native long __fieldRead60_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call60_1() throws Throwable;
private static native long __call60_2() throws Throwable;
private static native int __fieldRead60_4(moom.Bl a0) throws Throwable;
private static native void __fieldWrite60_5(moom.Bl a0, int a1) throws Throwable;
private static native boolean __fieldRead60_6(moom.Bl a0) throws Throwable;
private static native int __integerCategory60_7(boolean value) throws Throwable;
private static native void __fieldWrite60_8(moom.Bl a0, int a1) throws Throwable;
private static native moom.A9 __fieldRead60_9(moom.Bl a0) throws Throwable;
private static native void __fieldWrite60_10(moom.A9 a0, int a1) throws Throwable;
private static native moom.A9 __fieldRead60_11(moom.Bl a0) throws Throwable;
private static native void __call60_12(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead60_13(moom.Bl a0) throws Throwable;
private static native void __call60_14(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call60_15(moom.Bl a0) throws Throwable;
private static native long __fieldRead60_16(moom.Bl a0) throws Throwable;
private static native long __invokedynamic60_17(int a0, long a1) throws Throwable;
private static native int __numericCompare60_18(long a0, long a1) throws Throwable;
private static native void __fieldWrite60_19(moom.Bl a0, long a1) throws Throwable;
private static native net.minecraft.network.ServerStatusResponse __fieldRead60_20(moom.Bl a0) throws Throwable;
private static native int __call60_21(moom.Bl a0) throws Throwable;
private static native int __call60_22(moom.Bl a0) throws Throwable;
private static native void __call60_23(net.minecraft.network.ServerStatusResponse a0, net.minecraft.network.ServerStatusResponse$PlayerCountData a1) throws Throwable;
private static native int __call60_24(moom.Bl a0) throws Throwable;
private static native int __invokedynamic60_25(int a0, long a1) throws Throwable;
private static native int __call60_26(int a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead60_27(moom.Bl a0) throws Throwable;
private static native int __call60_28(moom.Bl a0) throws Throwable;
private static native int __call60_29(java.util.Random a0, int a1, int a2) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __fieldRead60_30(moom.Bl a0) throws Throwable;
private static native java.util.List __call60_31(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.lang.Object __call60_32(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast60_33(java.lang.Object a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call60_34(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.util.List __call60_35(com.mojang.authlib.GameProfile[] a0) throws Throwable;
private static native void __call60_36(java.util.List a0) throws Throwable;
private static native net.minecraft.network.ServerStatusResponse __fieldRead60_37(moom.Bl a0) throws Throwable;
private static native net.minecraft.network.ServerStatusResponse$PlayerCountData __call60_38(net.minecraft.network.ServerStatusResponse a0) throws Throwable;
private static native void __call60_39(net.minecraft.network.ServerStatusResponse$PlayerCountData a0, com.mojang.authlib.GameProfile[] a1) throws Throwable;
private static native int __fieldRead60_40(moom.Bl a0) throws Throwable;
private static native int __invokedynamic60_41(int a0, long a1) throws Throwable;
private static native moom.A9 __fieldRead60_42(moom.Bl a0) throws Throwable;
private static native void __call60_43(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __fieldRead60_44(moom.Bl a0) throws Throwable;
private static native void __call60_45(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native void __call60_46(moom.Bl a0, int a1) throws Throwable;
private static native moom.A9 __fieldRead60_47(moom.Bl a0) throws Throwable;
private static native void __call60_48(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead60_49(moom.Bl a0) throws Throwable;
private static native void __call60_50(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native long[] __fieldRead60_51(moom.Bl a0) throws Throwable;
private static native int __fieldRead60_52(moom.Bl a0) throws Throwable;
private static native int __invokedynamic60_53(int a0, long a1) throws Throwable;
private static native long __call60_54() throws Throwable;
private static native moom.A9 __fieldRead60_55(moom.Bl a0) throws Throwable;
private static native void __call60_56(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead60_57(moom.Bl a0) throws Throwable;
private static native void __call60_58(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead60_59(moom.Bl a0) throws Throwable;
private static native boolean __call60_60(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native int __integerCategory60_61(boolean value) throws Throwable;
private static native int __fieldRead60_62(moom.Bl a0) throws Throwable;
private static native int __invokedynamic60_63(int a0, long a1) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead60_64(moom.Bl a0) throws Throwable;
private static native void __call60_65(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native int __fieldRead60_66(moom.Bl a0) throws Throwable;
private static native int __invokedynamic60_67(int a0, long a1) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead60_68(moom.Bl a0) throws Throwable;
private static native void __call60_69(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native moom.A9 __fieldRead60_70(moom.Bl a0) throws Throwable;
private static native void __call60_71(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead60_72(moom.Bl a0) throws Throwable;
private static native void __call60_73(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call1006000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1006001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1006002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1006003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1006004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1006005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1006006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1006007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1006008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1006009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1006010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1006011_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0b21949e8b50646ff1df(moom.Bl a0) throws E;
private static final class __SourceHandler_0b21949e8b50646ff1df {

public static void f221(moom.Bl receiver) throws Throwable {
    int forestValue221_55_0;
    moom.Bl forestValue221_103_0;
    moom.Bl forestValue221_127_0;
    net.minecraft.entity.Entity[] spill221_0;
    int spill221_1;
    moom.Bl spill221_2;
    moom.Bl spill221_3;
    long life1_3;
    java.util.Queue life4_12;
    net.minecraft.entity.Entity[] life3_14;
    int life4_39;
    long life5_46;
    net.minecraft.world.WorldServer life7_66;
    java.util.Iterator life4_176;
    net.minecraft.util.ITickable life5_183;
    forest_join_183: {
    forest_join_180: {
    forest_join_163: {
    forest_join_145: {
    forest_join_32: {
    forest_join_30: {
    life1_3 = (__fieldRead221_0() ^ 80779816505900L);
    spill221_0 = __call221_1();
    __call221_3(__fieldRead221_2(receiver), "jobs");
    __monitorEnter221_5((life4_12 = __fieldRead221_4(receiver)));
    life3_14 = spill221_0;
    forest_cycle_15: while (true) {
    if (!((!__call221_7(__fieldRead221_6(receiver))))) {
        break forest_join_30;
    }
    __call221_12(__cast221_10(__call221_9(__fieldRead221_8(receiver))), __fieldRead221_11());
    if (!((life3_14 == null))) {
        break forest_join_32;
    }
    if (!((life3_14 != null))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    __monitorExit221_13(life4_12);
    }
    __call221_15(__fieldRead221_14(receiver), "levels");
    life4_39 = 0;
    forest_cycle_38: while (true) {
    forest_join_127: {
    forest_join_126: {
    forest_join_103: {
    forest_join_102: {
    forest_join_56: {
    forest_join_55: {
    if (!((life4_39 < (__fieldRead221_16(receiver)).length))) {
        break forest_join_145;
    }
    life5_46 = __call221_17();
    if (!((life3_14 == null))) {
        break forest_join_163;
    }
    spill221_1 = life4_39;
    if (!((life3_14 == null))) {
        forestValue221_55_0 = spill221_1;
        break forest_join_55;
    }
    if (!((spill221_1 != 0))) {
        break forest_join_56;
    }
    spill221_2 = receiver;
    if (!((life3_14 == null))) {
        forestValue221_127_0 = spill221_2;
        break forest_join_127;
    }
    forestValue221_55_0 = __integerCategory221_19(__call221_18(spill221_2));
    }
    if (!((forestValue221_55_0 != 0))) {
        break forest_join_126;
    }
    }
    life7_66 = (__fieldRead221_20(receiver))[life4_39];
    __call221_24(__fieldRead221_21(receiver), __call221_23(__call221_22(life7_66)));
    spill221_3 = receiver;
    if (!((life3_14 == null))) {
        forestValue221_103_0 = spill221_3;
        break forest_join_103;
    }
    if (!(((__fieldRead221_25(spill221_3) % __invokedynamic221_26(29469, (3875371346381008129L ^ life1_3))) == 0))) {
        break forest_join_102;
    }
    __call221_28(__fieldRead221_27(receiver), "timeSync");
    __call221_36(__fieldRead221_29(receiver), new moom.zw(__call221_30(life7_66), __call221_31(life7_66), __call221_33(__call221_32(life7_66), "doDaylightCycle")), __call221_35(__fieldRead221_34(life7_66)));
    __call221_38(__fieldRead221_37(receiver));
    }
    forestValue221_103_0 = receiver;
    }
    __call221_40(__fieldRead221_39(forestValue221_103_0), "tick");
    __call221_41(life7_66);
    __call221_42(life7_66);
    __call221_44(__fieldRead221_43(receiver));
    __call221_46(__fieldRead221_45(receiver), "tracker");
    __call221_48(__call221_47(life7_66));
    __call221_50(__fieldRead221_49(receiver));
    __call221_52(__fieldRead221_51(receiver));
    }
    forestValue221_127_0 = receiver;
    }
    ((__fieldRead221_53(forestValue221_127_0))[life4_39])[(__fieldRead221_54(receiver) % __invokedynamic221_55(17056, (4679432187965070502L ^ life1_3)))] = (__call221_56() - life5_46);
    life4_39 += 1;
    if (!((life3_14 != null))) {
        continue forest_cycle_38;
    }
    break forest_cycle_38;
    }
    }
    __call221_58(__fieldRead221_57(receiver), "connection");
    __call221_60(__call221_59(receiver));
    __call221_62(__fieldRead221_61(receiver), "players");
    __call221_64(__fieldRead221_63(receiver));
    __call221_66(__fieldRead221_65(receiver), "tickables");
    }
    life4_176 = __call221_68(__fieldRead221_67(receiver));
    forest_cycle_167: while (true) {
    if (!(__call221_69(life4_176))) {
        break forest_join_180;
    }
    life5_183 = __cast221_71(__call221_70(life4_176));
    __call221_72(life5_183);
    if (!((life3_14 == null))) {
        break forest_join_183;
    }
    if (!((life3_14 != null))) {
        continue forest_cycle_167;
    }
    break forest_cycle_167;
    }
    }
    __call221_74(__fieldRead221_73(receiver));
    }
    return;
}
public static void h221_0(java.lang.Throwable p0) throws Throwable {
    throw __call3022100_0(p0);
}
public static void h221_1(java.lang.Throwable p0, java.util.Queue p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3022101_0(p1);
    throw life2_2;
}
public static void h221_2(java.lang.Throwable p0) throws Throwable {
    throw __call3022102_0(p0);
}
public static void h221_3(java.lang.Throwable p0) throws Throwable {
    throw __call3022103_0(p0);
}
public static void h221_4(java.lang.Throwable p0) throws Throwable {
    throw __call3022104_0(p0);
}
public static void h221_5(java.lang.Throwable p0) throws Throwable {
    throw __call3022105_0(p0);
}
public static void h221_6(java.lang.Throwable p0) throws Throwable {
    throw __call3022106_0(p0);
}
public static void h221_7(java.lang.Throwable p0) throws Throwable {
    throw __call3022107_0(p0);
}
public static void h221_8(java.lang.Throwable p0, net.minecraft.world.WorldServer p1) throws Throwable {
    java.lang.Throwable life2_2;
    moom.qY life3_6;
    life2_2 = p0;
    life3_6 = __call3022108_0(life2_2, "Exception ticking world");
    __call3022108_1(p1, life3_6);
    throw new moom.Oo(life3_6);
}
public static void h221_9(java.lang.Throwable p0, net.minecraft.world.WorldServer p1) throws Throwable {
    java.lang.Throwable life2_2;
    moom.qY life3_6;
    life2_2 = p0;
    life3_6 = __call3022109_0(life2_2, "Exception ticking world entities");
    __call3022109_1(p1, life3_6);
    throw new moom.Oo(life3_6);
}
public static void h221_10(java.lang.Throwable p0) throws Throwable {
    throw __call3022110_0(p0);
}
private static native long __fieldRead221_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call221_1() throws Throwable;
private static native moom.A9 __fieldRead221_2(moom.Bl a0) throws Throwable;
private static native void __call221_3(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.Queue __fieldRead221_4(moom.Bl a0) throws Throwable;
private static native void __monitorEnter221_5(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead221_6(moom.Bl a0) throws Throwable;
private static native boolean __call221_7(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead221_8(moom.Bl a0) throws Throwable;
private static native java.lang.Object __call221_9(java.util.Queue a0) throws Throwable;
private static native java.util.concurrent.FutureTask __cast221_10(java.lang.Object a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead221_11() throws Throwable;
private static native java.lang.Object __call221_12(java.util.concurrent.FutureTask a0, org.apache.logging.log4j.Logger a1) throws Throwable;
private static native void __monitorExit221_13(java.util.Queue a0) throws Throwable;
private static native moom.A9 __fieldRead221_14(moom.Bl a0) throws Throwable;
private static native void __call221_15(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead221_16(moom.Bl a0) throws Throwable;
private static native long __call221_17() throws Throwable;
private static native boolean __call221_18(moom.Bl a0) throws Throwable;
private static native int __integerCategory221_19(boolean value) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead221_20(moom.Bl a0) throws Throwable;
private static native moom.A9 __fieldRead221_21(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call221_22(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.String __call221_23(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call221_24(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead221_25(moom.Bl a0) throws Throwable;
private static native int __invokedynamic221_26(int a0, long a1) throws Throwable;
private static native moom.A9 __fieldRead221_27(moom.Bl a0) throws Throwable;
private static native void __call221_28(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __fieldRead221_29(moom.Bl a0) throws Throwable;
private static native long __call221_30(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __call221_31(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.GameRules __call221_32(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call221_33(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native moom.EA __fieldRead221_34(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call221_35(moom.EA a0) throws Throwable;
private static native void __call221_36(net.minecraft.server.management.ServerConfigurationManager a0, moom.zw a1, int a2) throws Throwable;
private static native moom.A9 __fieldRead221_37(moom.Bl a0) throws Throwable;
private static native void __call221_38(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead221_39(moom.Bl a0) throws Throwable;
private static native void __call221_40(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call221_41(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call221_42(net.minecraft.world.WorldServer a0) throws Throwable;
private static native moom.A9 __fieldRead221_43(moom.Bl a0) throws Throwable;
private static native void __call221_44(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead221_45(moom.Bl a0) throws Throwable;
private static native void __call221_46(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.EntityTracker __call221_47(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call221_48(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native moom.A9 __fieldRead221_49(moom.Bl a0) throws Throwable;
private static native void __call221_50(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead221_51(moom.Bl a0) throws Throwable;
private static native void __call221_52(moom.A9 a0) throws Throwable;
private static native long[][] __fieldRead221_53(moom.Bl a0) throws Throwable;
private static native int __fieldRead221_54(moom.Bl a0) throws Throwable;
private static native int __invokedynamic221_55(int a0, long a1) throws Throwable;
private static native long __call221_56() throws Throwable;
private static native moom.A9 __fieldRead221_57(moom.Bl a0) throws Throwable;
private static native void __call221_58(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.network.NetworkSystem __call221_59(moom.Bl a0) throws Throwable;
private static native void __call221_60(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native moom.A9 __fieldRead221_61(moom.Bl a0) throws Throwable;
private static native void __call221_62(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __fieldRead221_63(moom.Bl a0) throws Throwable;
private static native void __call221_64(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native moom.A9 __fieldRead221_65(moom.Bl a0) throws Throwable;
private static native void __call221_66(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead221_67(moom.Bl a0) throws Throwable;
private static native java.util.Iterator __call221_68(java.util.List a0) throws Throwable;
private static native boolean __call221_69(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call221_70(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.util.ITickable __cast221_71(java.lang.Object a0) throws Throwable;
private static native void __call221_72(net.minecraft.util.ITickable a0) throws Throwable;
private static native moom.A9 __fieldRead221_73(moom.Bl a0) throws Throwable;
private static native void __call221_74(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call3022100_0(java.lang.Throwable a0) throws Throwable;
private static native void __monitorExit3022101_0(java.util.Queue a0) throws Throwable;
private static native java.lang.Throwable __call3022102_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022103_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022104_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022105_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022106_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022107_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3022108_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3022108_1(net.minecraft.world.WorldServer a0, moom.qY a1) throws Throwable;
private static native moom.qY __call3022109_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3022109_1(net.minecraft.world.WorldServer a0, moom.qY a1) throws Throwable;
private static native java.lang.Throwable __call3022110_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_30fb83ae9bae5055f320(moom.Bl a0) throws E;
private static final class __SourceHandler_30fb83ae9bae5055f320 {

public static void f613(moom.Bl receiver) throws Throwable {
    net.minecraft.entity.Entity[] spill613_0;
    long life1_3;
    net.minecraft.world.WorldServer[] life4_13;
    net.minecraft.entity.Entity[] life3_14;
    int life5_17;
    int life6_19;
    net.minecraft.world.WorldServer life7_26;
    lexical_join_50: {
    lexical_join_38: {
    life1_3 = (__fieldRead613_0() ^ 90944460654721L);
    spill613_0 = __call613_1();
    __fieldWrite613_2(receiver, 1);
    __call613_4(__call613_3(receiver));
    life4_13 = __fieldRead613_5(receiver);
    life3_14 = spill613_0;
    life5_17 = (life4_13).length;
    life6_19 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_36: {
    lexical_join_35: {
    if (!((life6_19 < life5_17))) {
        break lexical_join_38;
    }
    life7_26 = (life4_13)[life6_19];
    if (!((life3_14 == null))) {
        break lexical_join_50;
    }
    if (!((life3_14 == null))) {
        break lexical_join_36;
    }
    if (!((life7_26 != null))) {
        break lexical_join_35;
    }
    __call613_6(life7_26);
    }
    life6_19 += 1;
    }
    if (!((life3_14 != null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    __call613_11(__call613_7(receiver), __call613_10(__call613_9((__fieldRead613_8(receiver))[0])));
    __call613_12(receiver);
    }
    return;
}
public static void h613_0(moom.Oo p0) throws Throwable {
    throw __call1061300_0(p0);
}
public static void h613_1(moom.Oo p0) throws Throwable {
    throw __call1061301_0(p0);
}
public static void h613_2(moom.Oo p0) throws Throwable {
    throw __call1061302_0(p0);
}
private static native long __fieldRead613_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call613_1() throws Throwable;
private static native void __fieldWrite613_2(moom.Bl a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __call613_3(moom.Bl a0) throws Throwable;
private static native void __call613_4(net.minecraft.world.storage.ISaveFormat a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead613_5(moom.Bl a0) throws Throwable;
private static native void __call613_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __call613_7(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead613_8(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __call613_9(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.String __call613_10(net.minecraft.world.storage.ISaveHandler a0) throws Throwable;
private static native boolean __call613_11(net.minecraft.world.storage.ISaveFormat a0, java.lang.String a1) throws Throwable;
private static native void __call613_12(moom.Bl a0) throws Throwable;
private static native java.lang.Throwable __call1061300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1061301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1061302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_98ab2650b34bd2b2466c(moom.Bl a0) throws E;
private static final class __SourceHandler_98ab2650b34bd2b2466c {

public static boolean f1074(moom.Bl receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead1074_0() ^ 70217989800328L);
    return ((__fieldRead1074_1(receiver) != null) ? true : false);
}
public static void h1074_0(moom.Oo p0) throws Throwable {
    throw __call1107400_0(p0);
}
private static native long __fieldRead1074_0() throws Throwable;
private static native java.io.File __fieldRead1074_1(moom.Bl a0) throws Throwable;
private static native java.lang.Throwable __call1107400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c3d9e87b0aeaab3dea84(moom.Bl a0) throws E;
private static final class __SourceHandler_c3d9e87b0aeaab3dea84 {

public static boolean f1075(moom.Bl receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead1075_0() ^ 78052300737852L);
    return ((__fieldRead1075_1(receiver) != null) ? true : false);
}
public static void h1075_0(moom.Oo p0) throws Throwable {
    throw __call1107500_0(p0);
}
private static native long __fieldRead1075_0() throws Throwable;
private static native java.lang.String __fieldRead1075_1(moom.Bl a0) throws Throwable;
private static native java.lang.Throwable __call1107500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_306538d52b73119eb140(moom.Bl a0) throws E;
private static final class __SourceHandler_306538d52b73119eb140 {

public static java.lang.String f614(moom.Bl receiver) throws Throwable {
    moom.A9 forwardValue614_14_0;
    java.lang.String forwardValue614_17_0;
    moom.A9 spill614_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    life1_3 = (__fieldRead614_0() ^ 119116052928880L);
    life3_5 = __call614_1();
    spill614_0 = __fieldRead614_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue614_14_0 = spill614_0;
        break forward_join_14;
    }
    if (!(__fieldRead614_3(spill614_0))) {
        break forward_join_16;
    }
    forwardValue614_14_0 = __fieldRead614_4(receiver);
    }
    forwardValue614_17_0 = __call614_5(forwardValue614_14_0);
    break forward_join_17;
    }
    forwardValue614_17_0 = "N/A (disabled)";
    }
    return forwardValue614_17_0;
}
public static void h614_0(java.lang.Exception p0) throws Throwable {
    throw __call1061400_0(p0);
}
public static void h614_1(java.lang.Exception p0) throws Throwable {
    throw __call1061401_0(p0);
}
private static native long __fieldRead614_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call614_1() throws Throwable;
private static native moom.A9 __fieldRead614_2(moom.Bl a0) throws Throwable;
private static native boolean __fieldRead614_3(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead614_4(moom.Bl a0) throws Throwable;
private static native java.lang.String __call614_5(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call1061400_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1061401_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_caa4526adde7cbcc4a2d(moom.Bl a0) throws E;
private static final class __SourceHandler_caa4526adde7cbcc4a2d {

public static void f222(moom.Bl receiver) throws Throwable {
    int forestValue222_110_0;
    int forestValue222_130_0;
    int forestValue222_162_0;
    moom.Bl forestValue222_204_0;
    moom.Bl spill222_0;
    int spill222_1;
    int spill222_2;
    org.apache.logging.log4j.Logger spill222_3;
    java.lang.String spill222_4;
    java.lang.Object[] spill222_5;
    java.lang.Object[] spill222_6;
    int spill222_7;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    long life4_18;
    long life6_49;
    long life8_54;
    forest_join_213: {
    forest_join_206: {
    forest_join_204: {
    forest_join_203: {
    forest_join_201: {
    life1_3 = (__fieldRead222_0() ^ 121087128898363L);
    life3_5 = __call222_1();
    spill222_0 = receiver;
    if (!((life3_5 == null))) {
        forestValue222_204_0 = spill222_0;
        break forest_join_204;
    }
    if (!(__call222_2(spill222_0))) {
        break forest_join_203;
    }
    __fieldWrite222_4(receiver, __call222_3());
    life4_18 = 0L;
    __call222_7(__fieldRead222_5(receiver), new moom.CM(__fieldRead222_6(receiver)));
    __call222_10(__fieldRead222_8(receiver), new net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier("1.8.9", __invokedynamic222_9(12129, (520839457505912928L ^ life1_3))));
    __call222_12(receiver, __fieldRead222_11(receiver));
    forest_cycle_40: while (true) {
    forest_join_199: {
    forest_join_186: {
    forest_join_162: {
    forest_join_139: {
    forest_join_130: {
    forest_join_118: {
    forest_join_110: {
    forest_join_107: {
    if (!(__fieldRead222_13(receiver))) {
        break forest_join_201;
    }
    life6_49 = __call222_14();
    life8_54 = (life6_49 - __fieldRead222_15(receiver));
    if (!((life3_5 == null))) {
        break forest_join_213;
    }
    spill222_1 = __numericCompare222_17(life8_54, __invokedynamic222_16(7856, (2924456248562447992L ^ life1_3)));
    if (!((life3_5 == null))) {
        forestValue222_110_0 = spill222_1;
        break forest_join_110;
    }
    if (!((spill222_1 > 0))) {
        break forest_join_107;
    }
    spill222_2 = __numericCompare222_21((__fieldRead222_18(receiver) - __fieldRead222_19(receiver)), __invokedynamic222_20(9729, (4614725813414579904L ^ life1_3)));
    if (!((life3_5 == null))) {
        forestValue222_110_0 = spill222_2;
        break forest_join_110;
    }
    if (!((spill222_2 >= 0))) {
        break forest_join_107;
    }
    spill222_3 = __fieldRead222_22();
    spill222_4 = "Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)";
    java.lang.Object[] __stackOp222_23_0 = new java.lang.Object[2];
    spill222_5 = __stackOp222_23_0;
    (__stackOp222_23_0)[0] = __call222_24(life8_54);
    java.lang.Object[] __stackOp222_25_0 = spill222_5;
    spill222_6 = __stackOp222_25_0;
    (__stackOp222_25_0)[1] = __call222_27((life8_54 / __invokedynamic222_26(9068, (3258915855503149992L ^ life1_3))));
    __call222_28(spill222_3, spill222_4, spill222_6);
    life8_54 = __invokedynamic222_29(11464, (5163533810624119819L ^ life1_3));
    __fieldWrite222_31(receiver, __fieldRead222_30(receiver));
    }
    forestValue222_110_0 = __numericCompare222_32(life8_54, 0L);
    }
    if (!((life3_5 == null))) {
        forestValue222_130_0 = forestValue222_110_0;
        break forest_join_130;
    }
    if (!((forestValue222_110_0 < 0))) {
        break forest_join_118;
    }
    __call222_34(__fieldRead222_33(), "Time ran backwards! Did the system time change?");
    life8_54 = 0L;
    }
    life4_18 = (life4_18 + life8_54);
    __fieldWrite222_35(receiver, life6_49);
    forestValue222_130_0 = __integerCategory222_38(__call222_37((__fieldRead222_36(receiver))[0]));
    }
    if (!((life3_5 == null))) {
        forestValue222_162_0 = forestValue222_130_0;
        break forest_join_162;
    }
    if (!((forestValue222_130_0 != 0))) {
        break forest_join_139;
    }
    __call222_39(receiver);
    life4_18 = 0L;
    if (!((life3_5 != null))) {
        break forest_join_186;
    }
    }
    forest_cycle_139: while (true) {
    if (!((__numericCompare222_41(life4_18, __invokedynamic222_40(14202, (679913125068627901L ^ life1_3))) > 0))) {
        break forest_join_186;
    }
    life4_18 = (life4_18 - __invokedynamic222_42(14202, (679913125068627901L ^ life1_3)));
    __call222_43(receiver);
    if (!((life3_5 == null))) {
        break forest_join_199;
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_139;
    }
    break forest_cycle_139;
    }
    break forest_join_186;
    }
    forest_cycle_162: while (true) {
    forest_join_178: {
    if (!((forestValue222_162_0 > 0))) {
        break forest_join_186;
    }
    life4_18 = (life4_18 - __invokedynamic222_44(14202, (679913125068627901L ^ life1_3)));
    __call222_45(receiver);
    if (!((life3_5 == null))) {
        break forest_join_199;
    }
    if (!((life3_5 != null))) {
        break forest_join_178;
    }
    break forest_join_186;
    }
    spill222_7 = __numericCompare222_47(life4_18, __invokedynamic222_46(14202, (679913125068627901L ^ life1_3)));
    forestValue222_162_0 = spill222_7;
    continue forest_cycle_162;
    }
    }
    __call222_50(__call222_49(1L, (__invokedynamic222_48(14202, (679913125068627901L ^ life1_3)) - life4_18)));
    __fieldWrite222_51(receiver, 1);
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    }
    if (!((life3_5 != null))) {
        break forest_join_206;
    }
    }
    forestValue222_204_0 = receiver;
    }
    __call222_52(forestValue222_204_0, null);
    }
    __fieldWrite222_53(receiver, 1);
    __call222_54(receiver);
    __call222_55(receiver);
    }
    return;
}
public static void h222_0(java.lang.Throwable p0) throws Throwable {
    throw __call3022200_0(p0);
}
public static void h222_1(java.lang.Throwable p0) throws Throwable {
    throw __call3022201_0(p0);
}
public static void h222_2(java.lang.Throwable p0) throws Throwable {
    throw __call3022202_0(p0);
}
public static void h222_3(java.lang.Throwable p0) throws Throwable {
    throw __call3022203_0(p0);
}
public static void h222_4(java.lang.Throwable p0) throws Throwable {
    throw __call3022204_0(p0);
}
public static void h222_5(java.lang.Throwable p0) throws Throwable {
    throw __call3022205_0(p0);
}
public static void h222_6(java.lang.Throwable p0) throws Throwable {
    throw __call3022206_0(p0);
}
public static void h222_7(java.lang.Throwable p0) throws Throwable {
    throw __call3022207_0(p0);
}
public static void h222_8(java.lang.Throwable p0) throws Throwable {
    throw __call3022208_0(p0);
}
public static void h222_9(java.lang.Throwable p0) throws Throwable {
    throw __call3022209_0(p0);
}
public static void h222_10(java.lang.Throwable p0, moom.Bl p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3022210_1(__fieldRead3022210_0(), "Exception stopping the server", life2_2);
    __call3022210_2(p1);
    return;
}
public static void h222_11(java.lang.Throwable p0, moom.Bl p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3022211_0(p1);
    throw life2_2;
}
public static void h222_12(java.lang.Throwable p0, moom.Bl p1, net.minecraft.entity.Entity[] p2) throws Throwable {
    java.lang.Throwable life3_2;
    java.lang.Object life4_8;
    moom.qY life4_17;
    java.io.File life5_45;
    forest_join_61: {
    forest_join_58: {
    forest_join_56: {
    forest_join_26: {
    forest_join_18: {
    life3_2 = p0;
    __call3022212_1(__fieldRead3022212_0(), "Encountered an unexpected exception", life3_2);
    life4_8 = null;
    if (!((__instanceOf3022212_2(life3_2) != 0))) {
        break forest_join_18;
    }
    life4_17 = __call3022212_5(p1, __call3022212_4(__cast3022212_3(life3_2)));
    break forest_join_26;
    }
    life4_17 = __call3022212_6(p1, new moom.qY("Exception in server tick loop", life3_2));
    }
    life5_45 = new java.io.File(new java.io.File(__call3022212_7(p1), "crash-reports"), __invokedynamic3022212_9(__call3022212_8(new java.text.SimpleDateFormat("yyyy-MM-dd_HH.mm.ss"), new java.util.Date())));
    if (!((p2 == null))) {
        break forest_join_56;
    }
    if (!(__call3022212_10(life4_17, life5_45))) {
        break forest_join_58;
    }
    __call3022212_14(__fieldRead3022212_11(), __invokedynamic3022212_13(__call3022212_12(life5_45)));
    }
    if (!((p2 != null))) {
        break forest_join_61;
    }
    }
    __call3022212_16(__fieldRead3022212_15(), "We were unable to save this crash report to disk.");
    }
    __call3022212_17(p1, life4_17);
    __fieldWrite3022212_18(p1, 1);
    __call3022212_19(p1);
    __call3022212_20(p1);
    return;
}
public static void h222_13(java.lang.Throwable p0) throws Throwable {
    throw __call3022213_0(p0);
}
public static void h222_14(java.lang.Throwable p0) throws Throwable {
    throw __call3022214_0(p0);
}
public static void h222_15(java.lang.Throwable p0) throws Throwable {
    throw __call3022215_0(p0);
}
public static void h222_16(java.lang.Throwable p0, moom.Bl p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3022216_1(__fieldRead3022216_0(), "Exception stopping the server", life2_2);
    __call3022216_2(p1);
    return;
}
public static void h222_17(java.lang.Throwable p0, moom.Bl p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3022217_0(p1);
    throw life2_2;
}
public static void h222_18(java.lang.Throwable p0, moom.Bl p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __fieldWrite3022218_0(p1, 1);
    __call3022218_1(p1);
    __call3022218_2(p1);
    throw life2_2;
}
public static void h222_19(java.lang.Throwable p0, moom.Bl p1, java.lang.Throwable p2) throws Throwable {
    java.lang.Throwable life3_2;
    life3_2 = p0;
    __call3022219_1(__fieldRead3022219_0(), "Exception stopping the server", life3_2);
    __call3022219_2(p1);
    throw p2;
}
public static void h222_20(java.lang.Throwable p0, moom.Bl p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3022220_0(p1);
    throw life2_2;
}
private static native long __fieldRead222_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call222_1() throws Throwable;
private static native boolean __call222_2(moom.Bl a0) throws Throwable;
private static native long __call222_3() throws Throwable;
private static native void __fieldWrite222_4(moom.Bl a0, long a1) throws Throwable;
private static native net.minecraft.network.ServerStatusResponse __fieldRead222_5(moom.Bl a0) throws Throwable;
private static native java.lang.String __fieldRead222_6(moom.Bl a0) throws Throwable;
private static native void __call222_7(net.minecraft.network.ServerStatusResponse a0, moom.CM a1) throws Throwable;
private static native net.minecraft.network.ServerStatusResponse __fieldRead222_8(moom.Bl a0) throws Throwable;
private static native int __invokedynamic222_9(int a0, long a1) throws Throwable;
private static native void __call222_10(net.minecraft.network.ServerStatusResponse a0, net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier a1) throws Throwable;
private static native net.minecraft.network.ServerStatusResponse __fieldRead222_11(moom.Bl a0) throws Throwable;
private static native void __call222_12(moom.Bl a0, net.minecraft.network.ServerStatusResponse a1) throws Throwable;
private static native boolean __fieldRead222_13(moom.Bl a0) throws Throwable;
private static native long __call222_14() throws Throwable;
private static native long __fieldRead222_15(moom.Bl a0) throws Throwable;
private static native long __invokedynamic222_16(int a0, long a1) throws Throwable;
private static native int __numericCompare222_17(long a0, long a1) throws Throwable;
private static native long __fieldRead222_18(moom.Bl a0) throws Throwable;
private static native long __fieldRead222_19(moom.Bl a0) throws Throwable;
private static native long __invokedynamic222_20(int a0, long a1) throws Throwable;
private static native int __numericCompare222_21(long a0, long a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead222_22() throws Throwable;
private static native java.lang.Long __call222_24(long a0) throws Throwable;
private static native long __invokedynamic222_26(int a0, long a1) throws Throwable;
private static native java.lang.Long __call222_27(long a0) throws Throwable;
private static native void __call222_28(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native long __invokedynamic222_29(int a0, long a1) throws Throwable;
private static native long __fieldRead222_30(moom.Bl a0) throws Throwable;
private static native void __fieldWrite222_31(moom.Bl a0, long a1) throws Throwable;
private static native int __numericCompare222_32(long a0, long a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead222_33() throws Throwable;
private static native void __call222_34(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite222_35(moom.Bl a0, long a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead222_36(moom.Bl a0) throws Throwable;
private static native boolean __call222_37(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory222_38(boolean value) throws Throwable;
private static native void __call222_39(moom.Bl a0) throws Throwable;
private static native long __invokedynamic222_40(int a0, long a1) throws Throwable;
private static native int __numericCompare222_41(long a0, long a1) throws Throwable;
private static native long __invokedynamic222_42(int a0, long a1) throws Throwable;
private static native void __call222_43(moom.Bl a0) throws Throwable;
private static native long __invokedynamic222_44(int a0, long a1) throws Throwable;
private static native void __call222_45(moom.Bl a0) throws Throwable;
private static native long __invokedynamic222_46(int a0, long a1) throws Throwable;
private static native int __numericCompare222_47(long a0, long a1) throws Throwable;
private static native long __invokedynamic222_48(int a0, long a1) throws Throwable;
private static native long __call222_49(long a0, long a1) throws Throwable;
private static native void __call222_50(long a0) throws Throwable;
private static native void __fieldWrite222_51(moom.Bl a0, int a1) throws Throwable;
private static native void __call222_52(moom.Bl a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite222_53(moom.Bl a0, int a1) throws Throwable;
private static native void __call222_54(moom.Bl a0) throws Throwable;
private static native void __call222_55(moom.Bl a0) throws Throwable;
private static native java.lang.Throwable __call3022200_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022201_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022202_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022203_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022204_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022205_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022206_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022207_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022208_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022209_0(java.lang.Throwable a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3022210_0() throws Throwable;
private static native void __call3022210_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;
private static native void __call3022210_2(moom.Bl a0) throws Throwable;
private static native void __call3022211_0(moom.Bl a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3022212_0() throws Throwable;
private static native void __call3022212_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;
private static native int __instanceOf3022212_2(java.lang.Throwable a0) throws Throwable;
private static native moom.Oo __cast3022212_3(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3022212_4(moom.Oo a0) throws Throwable;
private static native moom.qY __call3022212_5(moom.Bl a0, moom.qY a1) throws Throwable;
private static native moom.qY __call3022212_6(moom.Bl a0, moom.qY a1) throws Throwable;
private static native java.io.File __call3022212_7(moom.Bl a0) throws Throwable;
private static native java.lang.String __call3022212_8(java.text.SimpleDateFormat a0, java.util.Date a1) throws Throwable;
private static native java.lang.String __invokedynamic3022212_9(java.lang.String a0) throws Throwable;
private static native boolean __call3022212_10(moom.qY a0, java.io.File a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3022212_11() throws Throwable;
private static native java.lang.String __call3022212_12(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic3022212_13(java.lang.String a0) throws Throwable;
private static native void __call3022212_14(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3022212_15() throws Throwable;
private static native void __call3022212_16(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call3022212_17(moom.Bl a0, moom.qY a1) throws Throwable;
private static native void __fieldWrite3022212_18(moom.Bl a0, int a1) throws Throwable;
private static native void __call3022212_19(moom.Bl a0) throws Throwable;
private static native void __call3022212_20(moom.Bl a0) throws Throwable;
private static native java.lang.Throwable __call3022213_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022214_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3022215_0(java.lang.Throwable a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3022216_0() throws Throwable;
private static native void __call3022216_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;
private static native void __call3022216_2(moom.Bl a0) throws Throwable;
private static native void __call3022217_0(moom.Bl a0) throws Throwable;
private static native void __fieldWrite3022218_0(moom.Bl a0, int a1) throws Throwable;
private static native void __call3022218_1(moom.Bl a0) throws Throwable;
private static native void __call3022218_2(moom.Bl a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3022219_0() throws Throwable;
private static native void __call3022219_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;
private static native void __call3022219_2(moom.Bl a0) throws Throwable;
private static native void __call3022220_0(moom.Bl a0) throws Throwable;

}


public void run() { __sourceHandlerCall_caa4526adde7cbcc4a2d(this); }


public java.lang.String i__String() {
return this.N;
}


public int i() {
long local1 = (moom.Bl.bb ^ 120728992182051L);
    return __sourceIntrinsic_663e7d89db5d_originalDynamicSite1064_1(30732, (8662600816376290078L ^ local1));
}


public boolean i__Boolean() {
return ((((this.p) ? 1 : 0)) != 0);
}


public void i__Void() {
this.Z = ((java.lang.Thread)(new java.lang.Thread(this, "Server thread")));
    ((java.lang.Thread)(this.Z)).start();
    return;
}


public void b(net.minecraft.profiler.PlayerUsageSnooper p0) { __sourceHandlerCall_f7a2f687324a7cd20c40(this, p0); }


public boolean b__Boolean() {
return ((1) != 0);
}


protected void b__Void() {
this.t = ((java.lang.String)(null));
    this.u = ((int)(0));
    return;
}


public int b() {
return ((net.minecraft.server.management.ServerConfigurationManager)(this.o)).b();
}


public void b(boolean p0) {
this.J = ((boolean)(p0));
    return;
}


public synchronized java.lang.String b__String() {
return this.Q;
}


public static void b(net.minecraft.entity.Entity[] p0) {
ab = ((net.minecraft.entity.Entity[])(p0));
    return;
}


protected synchronized void b(java.lang.String p0) {
this.Q = ((java.lang.String)(p0));
    return;
}


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return moom.Bl.ab;
}


public void b(int p0) {
this.C = ((int)(p0));
    return;
}


public java.lang.String e__String() {
return this.G;
}


protected void e__Void() {
c = ((moom.Bl)(this));
    return;
}


public void e(java.lang.String p0) {
this.H = ((java.lang.String)(p0));
    return;
}


public int e() {
return this.r;
}


public abstract boolean e__Boolean();

public void e(boolean p0) {
this.w = ((boolean)(p0));
    return;
}


public boolean x() {
return ((((this.O) ? 1 : 0)) != 0);
}


public abstract boolean s();

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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1944);
    if (((moom.Bl.kb)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.Bl.jb)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.Bl.lb)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Bl.lb)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Bl", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.Bl.kb)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.Bl.kb)[life3_8])).longValue();
}


public java.lang.String c__String() {
return "1.8.9";
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.Bl.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void c(java.lang.String p0) {
((org.apache.logging.log4j.Logger)(moom.Bl.a)).warn(((java.lang.String)(p0)));
    return;
}


public boolean c__Boolean() { return __sourceHandlerCall_7d0794c93b621d75169c(this); }


public void c(boolean p0) {
this.K = ((boolean)(p0));
    return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral3927_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Bl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int c() {
return ((net.minecraft.server.management.ServerConfigurationManager)(this.o)).c();
}


public void c__Void() { __sourceHandlerCall_86f935902b51d4accd46(this); }


public boolean n() {
return ((((this.J) ? 1 : 0)) != 0);
}


public java.lang.String h__String() {
return this.M;
}


public void h(boolean p0) {
this.z = ((boolean)(p0));
    return;
}


public int h() {
long local1 = (moom.Bl.bb ^ 6455224118639L);
    return __sourceIntrinsic_9d7e73b66053_originalDynamicSite1065_1(30188, (2753061275909575848L ^ local1));
}


public abstract boolean h__Boolean();

public void h__Void() { __sourceHandlerCall_0b21949e8b50646ff1df(this); }


public void f(boolean p0) {
this.x = ((boolean)(p0));
    return;
}


public abstract boolean f__Boolean();

public int f() {
long local1 = (moom.Bl.bb ^ 98345491003020L);
    return __sourceIntrinsic_d5f736cb4191_originalDynamicSite1066_1(29637, (113047899470432637L ^ local1));
}


public void f(java.lang.String p0) {
this.I = ((java.lang.String)(p0));
    return;
}


public java.lang.String f__String() {
return this.H;
}


protected void f__Void() {
return;
}


public boolean l__Boolean() { return __sourceHandlerCall_c3d9e87b0aeaab3dea84(this); }


public void l() {
this.V = ((long)(0L));
    return;
}


public void d__Void() {
this.p = ((boolean)(false));
    return;
}


public int d() {
return this.B;
}


protected abstract boolean d__Boolean() throws java.io.IOException;

public void d(boolean p0) {
this.v = ((boolean)(p0));
    return;
}


public java.lang.String d__String() {
return "vanilla";
}


public void d(java.lang.String p0) {
this.G = ((java.lang.String)(p0));
    return;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.player.EntityPlayer p2) {
return ((0) != 0);
}


public java.net.Proxy a__Proxy() {
return this.s;
}


public net.minecraft.entity.Entity a__r3() {
return null;
}


public static long a__Long() {
return java.lang.System.currentTimeMillis();
}


public abstract java.lang.String a(net.minecraft.world.WorldSettings$GameType p0, boolean p1);

public abstract int a();

public net.minecraft.network.NetworkSystem a__yJ() {
return this.j;
}


public void a(net.minecraft.world.WorldSettings$GameType p0) {
net.minecraft.entity.Entity[] spill508_0;
    long life2_3;
    int life5_6;
    net.minecraft.entity.Entity[] life4_7;
    lexical_join_23: {
    life2_3 = (moom.Bl.bb ^ 34290567696803L);
    spill508_0 = moom.Bl.b__Arrayr3();
    life5_6 = 0;
    life4_7 = spill508_0;
    lexical_cycle_8: while (true) {
    if (!((life5_6 < (this.n).length))) {
        break lexical_join_23;
    }
    ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.WorldServer)((((moom.Bl)(moom.Bl.a__Bl())).n)[life5_6])).a__IX())).a(((net.minecraft.world.WorldSettings$GameType)(p0)));
    life5_6 += 1;
    if (!((life4_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public void a(net.minecraft.server.management.ServerConfigurationManager p0) {
this.o = ((net.minecraft.server.management.ServerConfigurationManager)(p0));
    return;
}


public net.minecraft.world.World a__Eu() {
return (this.n)[0];
}


public net.minecraft.server.management.ServerConfigurationManager a__BA() {
return this.o;
}


public moom.DR a__DR() {
return new moom.DR(0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
}


public moom.DT a__DT() {
return moom.DT.f;
}


public net.minecraft.profiler.PlayerUsageSnooper a__A8() {
return this.e;
}


protected void a__Void(java.lang.String p0) { __sourceHandlerCall_22941b1b69e1593d7444(this, p0); }


protected void a(java.lang.String p0, java.lang.String p1, long p2, net.minecraft.world.WorldType p3, java.lang.String p4) { __sourceHandlerCall_1f0f1a56f1f42f622726(this, p0, p1, p2, p3, p4); }


protected void a__Void() { __sourceHandlerCall_16d327c5c895cbfc26b9(this); }


protected void a(java.lang.String p0, net.minecraft.world.storage.ISaveHandler p1) {
long life3_3;
    java.io.File life5_10;
    life3_3 = (moom.Bl.bb ^ 96034769849345L);
    life5_10 = new java.io.File(((net.minecraft.world.storage.ISaveHandler)(p1)).a(), "resources.zip");
    try {
        if (((java.io.File)(life5_10)).isFile()) {
        ((moom.Bl)(this)).a(((java.lang.String)(__sourceIntrinsic_3bac4d8b9ec3_invokedynamic1072_4(p0, ((java.io.File)(life5_10)).getName()))), ((java.lang.String)("")));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.Bl.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public abstract net.minecraft.world.WorldSettings$GameType a__bE();

public com.google.common.util.concurrent.ListenableFuture<java.lang.Object> a(java.lang.Runnable p0) {
org.apache.commons.lang3.Validate.notNull(((java.lang.Object)(p0)));
    return ((moom.Bl)(this)).a(((java.util.concurrent.Callable)(java.util.concurrent.Executors.callable(((java.lang.Runnable)(p0))))));
}


protected moom.qL a__qL() {
return new moom.qL();
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3936_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Bl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Bl.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26712;
      if (eb[var3] == null) {
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
         long var5 = db[var3];
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
         Object[] var9 = (Object[])fb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               fb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Bl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         eb[var3] = var15;
      }

      return eb[var3];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public moom.Bt a__Bt() {
return this.X;
}


public com.mojang.authlib.GameProfileRepository a__GameProfileRepository() {
return this.W;
}


public com.mojang.authlib.minecraft.MinecraftSessionService a__MinecraftSessionService() {
return this.U;
}


public net.minecraft.util.IChatComponent a__C5() {
return new moom.CM(((moom.Bl)(this)).a__String());
}


public abstract net.minecraft.world.EnumDifficulty a__bB();

public <V> com.google.common.util.concurrent.ListenableFuture<V> a(java.util.concurrent.Callable<V> p0) { return __sourceHandlerCall_ecc91480c798eff1247e(this, p0); }


public void a(net.minecraft.command.CommandResultStats$Type p0, int p1) {
return;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.GameRules)(((net.minecraft.world.WorldServer)((((moom.Bl)(moom.Bl.a__Bl())).n)[0])).a__Ej())).a__Boolean(((java.lang.String)("sendCommandFeedback"))))) != 0);
}


public net.minecraft.entity.Entity a(java.util.UUID p0) { return __sourceHandlerCall_756950b593d8514e822d(this, p0); }


public net.minecraft.network.ServerStatusResponse a__yM() {
return this.k;
}


public java.lang.String a__String() {
return "Server";
}


public void a(net.minecraft.util.IChatComponent p0) {
((org.apache.logging.log4j.Logger)(moom.Bl.a)).info(((java.lang.String)(((net.minecraft.util.IChatComponent)(p0)).b())));
    return;
}


public net.minecraft.world.storage.ISaveFormat a__IK() {
return this.d;
}


public boolean a(int p0, java.lang.String p1) {
return ((1) != 0);
}


public void a(java.lang.String p0, java.lang.String p1) {
this.M = ((java.lang.String)(p0));
    this.N = ((java.lang.String)(p1));
    return;
}


protected void a(boolean p0) { __sourceHandlerCall_16c2f393213ee365024e(this, p0); }


protected void a(java.lang.String p0, int p1) {
this.t = ((java.lang.String)(p0));
    this.u = ((int)(p1));
    ((org.apache.logging.log4j.Logger)(moom.Bl.a)).info(((java.lang.String)(__sourceIntrinsic_b3e4ccfc83ba_originalDynamicSite1067_3(p0, p1))));
    return;
}


protected void a__Void(moom.qY p0) {
return;
}


public java.security.KeyPair a__KeyPair() {
return this.F;
}


public void a(java.security.KeyPair p0) {
this.F = ((java.security.KeyPair)(p0));
    return;
}


public void a(net.minecraft.world.EnumDifficulty p0) { __sourceHandlerCall_34bd83ea1f27ad578bb9(this, p0); }


public net.minecraft.command.ICommandManager a__qS() {
return this.h;
}


private void a(net.minecraft.network.ServerStatusResponse p0) { __sourceHandlerCall_109b9ef20b3fc5a68e32(this, p0); }


public java.io.File a__File() {
return new java.io.File(".");
}


public java.lang.String[] a__ArrayString() {
return ((net.minecraft.server.management.ServerConfigurationManager)(this.o)).a__ArrayString();
}


public net.minecraft.world.WorldServer a(int p0) { return __sourceHandlerCall_719e8d5fb341631a56d6(this, p0); }


public java.io.File a(java.lang.String p0) {
return new java.io.File(((moom.Bl)(this)).a__File(), p0);
}


public void a(net.minecraft.profiler.PlayerUsageSnooper p0) { __sourceHandlerCall_e1524100c71f1332077a(this, p0); }


public void a__Void(int p0) {
this.B = ((int)(p0));
    return;
}


public static moom.Bl a__Bl() {
return moom.Bl.c;
}


public moom.qY a(moom.qY p0) { return __sourceHandlerCall_f76f8e8dc81844a0bf1b(this, p0); }


public com.mojang.authlib.GameProfile[] a__ArrayGameProfile() {
return ((net.minecraft.server.management.ServerConfigurationManager)(this.o)).a__ArrayGameProfile();
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String p1, moom.DT p2) { return __sourceHandlerCall_c263078720300fba08fa(this, p0, p1, p2); }


protected boolean m() {
return ((1) != 0);
}


public abstract boolean o();

public boolean p() {
return ((((this.v) ? 1 : 0)) != 0);
}


public void k() {
this.R = ((boolean)(true));
    return;
}


public boolean k__Boolean() { return __sourceHandlerCall_98ab2650b34bd2b2466c(this); }


public boolean t() {
return ((((this.y) ? 1 : 0)) != 0);
}


public void g__Void() { __sourceHandlerCall_38aff7ca69cd249a49b2(this); }


public void g(boolean p0) {
this.y = ((boolean)(p0));
    return;
}


public abstract boolean g__Boolean();

public int g() {
return this.C;
}


public void g(java.lang.String p0) {
this.A = ((java.lang.String)(p0));
    return;
}


public java.lang.String g__String() {
return this.I;
}


public abstract boolean v();

public boolean j__Boolean() {
return ((1) != 0);
}


public void j__Void() { __sourceHandlerCall_30fb83ae9bae5055f320(this); }


public java.lang.String j() {
return this.A;
}


public boolean q() {
return ((((this.w) ? 1 : 0)) != 0);
}


public boolean z() {
return ((((this.S) ? 1 : 0)) != 0);
}


public boolean w() {
return ((((this.q) ? 1 : 0)) != 0);
}


public boolean u() {
return ((((this.z) ? 1 : 0)) != 0);
}


public boolean r() {
return ((((this.x) ? 1 : 0)) != 0);
}


public boolean y() {
return ((0) != 0);
}


public boolean A() {
return ((1) != 0);
}


private java.lang.String lambda$addServerInfoToCrashReport$0() throws java.lang.Exception { return __sourceHandlerCall_306538d52b73119eb140(this); }


private java.lang.String lambda$addServerInfoToCrashReport$1() throws java.lang.Exception {
return __sourceIntrinsic_844ce714365c_originalDynamicSite1068_6(((net.minecraft.server.management.ServerConfigurationManager)(this.o)).b(), ((net.minecraft.server.management.ServerConfigurationManager)(this.o)).c(), ((net.minecraft.server.management.ServerConfigurationManager)(this.o)).a__List());
}


private static native <E extends Throwable> int __sourceIntrinsic_54dc952ed83d030e_originalDynamicSite463_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fe388741d158ea_originalDynamicSite464_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b3e4ccfc83ba_originalDynamicSite1067_3(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3bac4d8b9ec3_invokedynamic1072_4(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3936_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral3927_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_originalDynamicSite1066_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9d7e73b66053_originalDynamicSite1065_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_663e7d89db5d_originalDynamicSite1064_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_844ce714365c_originalDynamicSite1068_6(int a0, int a1, java.util.List a2) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
