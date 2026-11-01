package net.minecraft.server.integrated;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class IntegratedServer extends moom.Bl {

private static org.apache.logging.log4j.Logger ac;

private net.minecraft.client.Minecraft ad;

private moom.EK ae;

private boolean af;

private boolean ag;

private moom.Os ah;

private long ai;

public net.minecraft.world.World aj;

public moom.DT ak;

public moom.Eh al;

private static net.minecraft.entity.Entity[] am;

private static long cb;

private static long[] gb;

private static java.lang.Integer[] hb;

private static java.util.Map ib;

private static long[] mb;

private static java.lang.Long[] nb;

private static java.util.Map ob;

public IntegratedServer(net.minecraft.client.Minecraft p0) {
super((p0).a__Proxy(), new java.io.File(p0.h, (net.minecraft.server.integrated.IntegratedServer.b).getName()));
    this.ai = 0L;
    this.aj = null;
    this.ak = null;
    this.al = null;
    this.ad = p0;
    this.ae = null;
}


public IntegratedServer(net.minecraft.client.Minecraft p0, java.lang.String p1, java.lang.String p2, moom.EK p3) { super((java.io.File)null, (java.net.Proxy)null, (java.io.File)null); __sourceHandlerCall_7033815af6188fc55969(this, p0, p1, p2, p3); }


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-6705312493878498290L)), ((long)(911982983172580885L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(105999501026894L)))));
    java.lang.Object __sourceSpill1356_6 = null;
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life8 = (net.minecraft.server.integrated.IntegratedServer.cb ^ 91361502453415L);
    net.minecraft.server.integrated.IntegratedServer.a(((net.minecraft.entity.Entity[])(__sourceSpill1356_6)));
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill1356_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1356_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1356_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1356_16 = new byte[8];
    (__sourceSpill1356_16)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill1356_16)[local14_life17] = ((byte) ((int) ((local11_life8 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation1356_18 = __sourceSpill1356_16;
    ((javax.crypto.Cipher)(__sourceSpill1356_13)).init(((int)(__sourceSpill1356_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1356_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1356_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life21 = new long[5];
    int local16_life22 = 0;
    java.lang.String local17_life23;
    int local18_life25 = ((java.lang.String)((local17_life23 = "ú£ÙÔ)A\006\021\036/Ì¹Xþ%¤\001ô\030\037ÈR²"))).length();
    int local15_life26 = 0;
    do {
        java.lang.String __sourceSpill1356_27 = local17_life23;
        int __sourceSpill1356_28 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1356_27)).substring(((int)(__sourceSpill1356_28)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1356_32 = local19_life21;
        int __sourceSpill1356_33 = local16_life22;
        local16_life22 += 1;
        long local21_life34 = (((((((((((long) (local20_life31)[0]) & 255L) << 56) | ((((long) (local20_life31)[1]) & 255L) << 48)) | ((((long) (local20_life31)[2]) & 255L) << 40)) | ((((long) (local20_life31)[3]) & 255L) << 32)) | ((((long) (local20_life31)[4]) & 255L) << 24)) | ((((long) (local20_life31)[5]) & 255L) << 16)) | ((((long) (local20_life31)[6]) & 255L) << 8)) | (((long) (local20_life31)[7]) & 255L));
        byte[] __sourceSpill1356_35 = new byte[8];
        (__sourceSpill1356_35)[0] = ((byte) ((int) (local21_life34 >>> 56)));
        (__sourceSpill1356_35)[1] = ((byte) ((int) (local21_life34 >>> 48)));
        (__sourceSpill1356_35)[2] = ((byte) ((int) (local21_life34 >>> 40)));
        (__sourceSpill1356_35)[3] = ((byte) ((int) (local21_life34 >>> 32)));
        (__sourceSpill1356_35)[4] = ((byte) ((int) (local21_life34 >>> 24)));
        (__sourceSpill1356_35)[5] = ((byte) ((int) (local21_life34 >>> 16)));
        (__sourceSpill1356_35)[6] = ((byte) ((int) (local21_life34 >>> 8)));
        (__sourceSpill1356_35)[7] = ((byte) ((int) local21_life34));
        javax.crypto.Cipher __sourceSpill1356_36 = local13_life11;
        byte[] local23_life38 = ((javax.crypto.Cipher)(__sourceSpill1356_36)).doFinal(((byte[])(__sourceSpill1356_35)));
        (__sourceSpill1356_32)[__sourceSpill1356_33] = (((((((((((long) (local23_life38)[0]) & 255L) << 56) | ((((long) (local23_life38)[1]) & 255L) << 48)) | ((((long) (local23_life38)[2]) & 255L) << 40)) | ((((long) (local23_life38)[3]) & 255L) << 32)) | ((((long) (local23_life38)[4]) & 255L) << 24)) | ((((long) (local23_life38)[5]) & 255L) << 16)) | ((((long) (local23_life38)[6]) & 255L) << 8)) | (((long) (local23_life38)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    local18_life25 = ((java.lang.String)((local17_life23 = "`ë5SXÀ\r\027.Zô »mäÁ"))).length();
    local15_life26 = 0;
    do {
        java.lang.String __sourceSpill1356_40 = local17_life23;
        int __sourceSpill1356_41 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1356_40)).substring(((int)(__sourceSpill1356_41)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1356_45 = local19_life21;
        int __sourceSpill1356_46 = local16_life22;
        local16_life22 += 1;
        long local21_life47 = (((((((((((long) (local20_life44)[0]) & 255L) << 56) | ((((long) (local20_life44)[1]) & 255L) << 48)) | ((((long) (local20_life44)[2]) & 255L) << 40)) | ((((long) (local20_life44)[3]) & 255L) << 32)) | ((((long) (local20_life44)[4]) & 255L) << 24)) | ((((long) (local20_life44)[5]) & 255L) << 16)) | ((((long) (local20_life44)[6]) & 255L) << 8)) | (((long) (local20_life44)[7]) & 255L));
        byte[] __sourceSpill1356_48 = new byte[8];
        (__sourceSpill1356_48)[0] = ((byte) ((int) (local21_life47 >>> 56)));
        (__sourceSpill1356_48)[1] = ((byte) ((int) (local21_life47 >>> 48)));
        (__sourceSpill1356_48)[2] = ((byte) ((int) (local21_life47 >>> 40)));
        (__sourceSpill1356_48)[3] = ((byte) ((int) (local21_life47 >>> 32)));
        (__sourceSpill1356_48)[4] = ((byte) ((int) (local21_life47 >>> 24)));
        (__sourceSpill1356_48)[5] = ((byte) ((int) (local21_life47 >>> 16)));
        (__sourceSpill1356_48)[6] = ((byte) ((int) (local21_life47 >>> 8)));
        (__sourceSpill1356_48)[7] = ((byte) ((int) local21_life47));
        javax.crypto.Cipher __sourceSpill1356_49 = local13_life11;
        byte[] local23_life51 = ((javax.crypto.Cipher)(__sourceSpill1356_49)).doFinal(((byte[])(__sourceSpill1356_48)));
        (__sourceSpill1356_45)[__sourceSpill1356_46] = (((((((((((long) (local23_life51)[0]) & 255L) << 56) | ((((long) (local23_life51)[1]) & 255L) << 48)) | ((((long) (local23_life51)[2]) & 255L) << 40)) | ((((long) (local23_life51)[3]) & 255L) << 32)) | ((((long) (local23_life51)[4]) & 255L) << 24)) | ((((long) (local23_life51)[5]) & 255L) << 16)) | ((((long) (local23_life51)[6]) & 255L) << 8)) | (((long) (local23_life51)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    gb = ((long[])(local19_life21));
    hb = ((java.lang.Integer[])(new java.lang.Integer[5]));
    ob = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life56;
    javax.crypto.Cipher __sourceSpill1356_58 = (local0_life56 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1356_59 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1356_60 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1356_61 = new byte[8];
    (__sourceSpill1356_61)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local1_life62 = 1;
    while ((local1_life62 < 8)) {
        (__sourceSpill1356_61)[local1_life62] = ((byte) ((int) ((local11_life8 << (local1_life62 * 8)) >>> 56)));
        local1_life62 += 1;
    }
    byte[] __sourcePreallocation1356_63 = __sourceSpill1356_61;
    ((javax.crypto.Cipher)(__sourceSpill1356_58)).init(((int)(__sourceSpill1356_59)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1356_60)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1356_63)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life66 = new long[10];
    int local3_life67 = 0;
    java.lang.String local4_life68;
    int local5_life70 = ((java.lang.String)((local4_life68 = "HÊ\"\037ã?øÕGJä,\005¤£tw.\003àÌ\177·$¿\007ÐR\"»læþPhMKöàSwlÙàO\006c¶&´û²ÞûSn\035õ.Ù"))).length();
    int local2_life71 = 0;
    do {
        java.lang.String __sourceSpill1356_72 = local4_life68;
        int __sourceSpill1356_73 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life76 = ((java.lang.String)(((java.lang.String)(__sourceSpill1356_72)).substring(((int)(__sourceSpill1356_73)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1356_77 = local6_life66;
        int __sourceSpill1356_78 = local3_life67;
        local3_life67 += 1;
        long local8_life79 = (((((((((((long) (local7_life76)[0]) & 255L) << 56) | ((((long) (local7_life76)[1]) & 255L) << 48)) | ((((long) (local7_life76)[2]) & 255L) << 40)) | ((((long) (local7_life76)[3]) & 255L) << 32)) | ((((long) (local7_life76)[4]) & 255L) << 24)) | ((((long) (local7_life76)[5]) & 255L) << 16)) | ((((long) (local7_life76)[6]) & 255L) << 8)) | (((long) (local7_life76)[7]) & 255L));
        byte[] __sourceSpill1356_80 = new byte[8];
        (__sourceSpill1356_80)[0] = ((byte) ((int) (local8_life79 >>> 56)));
        (__sourceSpill1356_80)[1] = ((byte) ((int) (local8_life79 >>> 48)));
        (__sourceSpill1356_80)[2] = ((byte) ((int) (local8_life79 >>> 40)));
        (__sourceSpill1356_80)[3] = ((byte) ((int) (local8_life79 >>> 32)));
        (__sourceSpill1356_80)[4] = ((byte) ((int) (local8_life79 >>> 24)));
        (__sourceSpill1356_80)[5] = ((byte) ((int) (local8_life79 >>> 16)));
        (__sourceSpill1356_80)[6] = ((byte) ((int) (local8_life79 >>> 8)));
        (__sourceSpill1356_80)[7] = ((byte) ((int) local8_life79));
        javax.crypto.Cipher __sourceSpill1356_81 = local0_life56;
        byte[] local10_life83 = ((javax.crypto.Cipher)(__sourceSpill1356_81)).doFinal(((byte[])(__sourceSpill1356_80)));
        (__sourceSpill1356_77)[__sourceSpill1356_78] = (((((((((((long) (local10_life83)[0]) & 255L) << 56) | ((((long) (local10_life83)[1]) & 255L) << 48)) | ((((long) (local10_life83)[2]) & 255L) << 40)) | ((((long) (local10_life83)[3]) & 255L) << 32)) | ((((long) (local10_life83)[4]) & 255L) << 24)) | ((((long) (local10_life83)[5]) & 255L) << 16)) | ((((long) (local10_life83)[6]) & 255L) << 8)) | (((long) (local10_life83)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    local5_life70 = ((java.lang.String)((local4_life68 = "rù$þA\n³\023\036|fãº"))).length();
    local2_life71 = 0;
    do {
        java.lang.String __sourceSpill1356_85 = local4_life68;
        int __sourceSpill1356_86 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life89 = ((java.lang.String)(((java.lang.String)(__sourceSpill1356_85)).substring(((int)(__sourceSpill1356_86)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1356_90 = local6_life66;
        int __sourceSpill1356_91 = local3_life67;
        local3_life67 += 1;
        long local8_life92 = (((((((((((long) (local7_life89)[0]) & 255L) << 56) | ((((long) (local7_life89)[1]) & 255L) << 48)) | ((((long) (local7_life89)[2]) & 255L) << 40)) | ((((long) (local7_life89)[3]) & 255L) << 32)) | ((((long) (local7_life89)[4]) & 255L) << 24)) | ((((long) (local7_life89)[5]) & 255L) << 16)) | ((((long) (local7_life89)[6]) & 255L) << 8)) | (((long) (local7_life89)[7]) & 255L));
        byte[] __sourceSpill1356_93 = new byte[8];
        (__sourceSpill1356_93)[0] = ((byte) ((int) (local8_life92 >>> 56)));
        (__sourceSpill1356_93)[1] = ((byte) ((int) (local8_life92 >>> 48)));
        (__sourceSpill1356_93)[2] = ((byte) ((int) (local8_life92 >>> 40)));
        (__sourceSpill1356_93)[3] = ((byte) ((int) (local8_life92 >>> 32)));
        (__sourceSpill1356_93)[4] = ((byte) ((int) (local8_life92 >>> 24)));
        (__sourceSpill1356_93)[5] = ((byte) ((int) (local8_life92 >>> 16)));
        (__sourceSpill1356_93)[6] = ((byte) ((int) (local8_life92 >>> 8)));
        (__sourceSpill1356_93)[7] = ((byte) ((int) local8_life92));
        javax.crypto.Cipher __sourceSpill1356_94 = local0_life56;
        byte[] local10_life96 = ((javax.crypto.Cipher)(__sourceSpill1356_94)).doFinal(((byte[])(__sourceSpill1356_93)));
        (__sourceSpill1356_90)[__sourceSpill1356_91] = (((((((((((long) (local10_life96)[0]) & 255L) << 56) | ((((long) (local10_life96)[1]) & 255L) << 48)) | ((((long) (local10_life96)[2]) & 255L) << 40)) | ((((long) (local10_life96)[3]) & 255L) << 32)) | ((((long) (local10_life96)[4]) & 255L) << 24)) | ((((long) (local10_life96)[5]) & 255L) << 16)) | ((((long) (local10_life96)[6]) & 255L) << 8)) | (((long) (local10_life96)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    mb = ((long[])(local6_life66));
    nb = ((java.lang.Long[])(new java.lang.Long[10]));
    ac = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_7033815af6188fc55969(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.client.Minecraft a1, java.lang.String a2, java.lang.String a3, moom.EK a4) throws E;
private static final class __SourceHandler_7033815af6188fc55969 {

public static void f573(net.minecraft.server.integrated.IntegratedServer receiver, net.minecraft.client.Minecraft p0, java.lang.String p1, java.lang.String p2, moom.EK p3) throws Throwable {
    net.minecraft.server.integrated.IntegratedServer forwardValue573_77_0;
    moom.EK forwardValue573_77_1;
    net.minecraft.server.integrated.IntegratedServer forwardValue573_78_0;
    net.minecraft.server.integrated.IntegratedServer forwardValue573_79_0;
    moom.EK forwardValue573_79_1;
    net.minecraft.world.storage.WorldInfo forwardValue573_94_0;
    net.minecraft.nbt.NBTTagCompound forwardValue573_101_0;
    int forwardValue573_109_0;
    net.minecraft.entity.Entity[] spill573_0;
    net.minecraft.server.integrated.IntegratedServer spill573_1;
    moom.EK spill573_2;
    net.minecraft.server.integrated.IntegratedServer spill573_3;
    net.minecraft.world.storage.WorldInfo spill573_4;
    net.minecraft.nbt.NBTTagCompound spill573_5;
    boolean spill573_6;
    long life5_3;
    net.minecraft.entity.Entity[] life7_25;
    net.minecraft.world.storage.ISaveHandler life8_91;
    net.minecraft.world.storage.WorldInfo life9_94;
    net.minecraft.nbt.NBTTagCompound life10_104;
    forward_join_120: {
    forward_join_115: {
    forward_join_109: {
    forward_join_101: {
    forward_join_94: {
    forward_join_79: {
    forward_join_78: {
    forward_join_77: {
    life5_3 = (__fieldRead573_0() ^ 128264755464252L);
    __directSuperInit573_6(receiver, new java.io.File(__fieldRead573_1(p0), "saves"), __call573_2(p0), new java.io.File(__fieldRead573_3(p0), __call573_5(__fieldRead573_4())));
    spill573_0 = __call573_7();
    __fieldWrite573_8(receiver, 0L);
    life7_25 = spill573_0;
    __fieldWrite573_9(receiver, null);
    __fieldWrite573_10(receiver, null);
    __fieldWrite573_11(receiver, null);
    __call573_14(receiver, __call573_13(__call573_12(p0)));
    __call573_15(receiver, p1);
    __call573_16(receiver, p2);
    __call573_18(receiver, __call573_17(p0));
    spill573_1 = receiver;
    spill573_2 = p3;
    if (!((life7_25 == null))) {
        forwardValue573_77_0 = spill573_1;
        forwardValue573_77_1 = spill573_2;
        break forward_join_77;
    }
    __call573_20(spill573_1, __call573_19(spill573_2));
    __call573_22(receiver, __invokedynamic573_21(3551, (775905927692484381L ^ life5_3)));
    __call573_23(receiver, new moom.BB(receiver));
    __fieldWrite573_24(receiver, p0);
    spill573_3 = receiver;
    if (!(__call573_25(receiver))) {
        forwardValue573_78_0 = spill573_3;
        break forward_join_78;
    }
    forwardValue573_77_0 = spill573_3;
    forwardValue573_77_1 = __fieldRead573_26();
    }
    forwardValue573_79_0 = forwardValue573_77_0;
    forwardValue573_79_1 = forwardValue573_77_1;
    break forward_join_79;
    }
    forwardValue573_79_0 = forwardValue573_78_0;
    forwardValue573_79_1 = p3;
    }
    __fieldWrite573_27(forwardValue573_79_0, forwardValue573_79_1);
    life8_91 = __call573_29(__call573_28(receiver), p1, 0);
    life9_94 = __call573_30(life8_91);
    spill573_4 = life9_94;
    if (!((life7_25 == null))) {
        forwardValue573_94_0 = spill573_4;
        break forward_join_94;
    }
    if (!((spill573_4 != null))) {
        break forward_join_115;
    }
    forwardValue573_94_0 = life9_94;
    }
    life10_104 = __call573_31(forwardValue573_94_0);
    spill573_5 = life10_104;
    if (!((life7_25 == null))) {
        forwardValue573_101_0 = spill573_5;
        break forward_join_101;
    }
    if (!((spill573_5 != null))) {
        break forward_join_115;
    }
    forwardValue573_101_0 = life10_104;
    }
    spill573_6 = __call573_32(forwardValue573_101_0, "Dimension");
    if (!((life7_25 == null))) {
        forwardValue573_109_0 = __integerCategory573_33(spill573_6);
        break forward_join_109;
    }
    if (!(spill573_6)) {
        break forward_join_115;
    }
    forwardValue573_109_0 = __call573_34(life10_104, "Dimension");
    }
    __fieldWrite573_35(forwardValue573_109_0);
    __call573_38(__fieldRead573_37(__fieldRead573_36(receiver)), -1);
    }
    if (!((life7_25 != null))) {
        break forward_join_120;
    }
    __call573_39(new java.lang.String[3]);
    }
    return;
}
public static void h573_0(moom.Oo p0) throws Throwable {
    throw __call3057300_0(p0);
}
public static void h573_1(moom.Oo p0) throws Throwable {
    throw __call3057301_0(p0);
}
public static void h573_2(moom.Oo p0) throws Throwable {
    throw __call3057302_0(p0);
}
public static void h573_3(moom.Oo p0) throws Throwable {
    throw __call3057303_0(p0);
}
public static void h573_4(moom.Oo p0) throws Throwable {
    throw __call3057304_0(p0);
}
public static void h573_5(moom.Oo p0) throws Throwable {
    throw __call3057305_0(p0);
}
public static void h573_6(moom.Oo p0) throws Throwable {
    throw __call3057306_0(p0);
}
private static native long __fieldRead573_0() throws Throwable;
private static native java.io.File __fieldRead573_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.net.Proxy __call573_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.io.File __fieldRead573_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.io.File __fieldRead573_4() throws Throwable;
private static native java.lang.String __call573_5(java.io.File a0) throws Throwable;
private static native void __directSuperInit573_6(net.minecraft.server.integrated.IntegratedServer a0, java.io.File a1, java.net.Proxy a2, java.io.File a3) throws Throwable;
private static native net.minecraft.entity.Entity[] __call573_7() throws Throwable;
private static native void __fieldWrite573_8(net.minecraft.server.integrated.IntegratedServer a0, long a1) throws Throwable;
private static native void __fieldWrite573_9(net.minecraft.server.integrated.IntegratedServer a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite573_10(net.minecraft.server.integrated.IntegratedServer a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite573_11(net.minecraft.server.integrated.IntegratedServer a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.util.Session __call573_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call573_13(net.minecraft.util.Session a0) throws Throwable;
private static native void __call573_14(net.minecraft.server.integrated.IntegratedServer a0, java.lang.String a1) throws Throwable;
private static native void __call573_15(net.minecraft.server.integrated.IntegratedServer a0, java.lang.String a1) throws Throwable;
private static native void __call573_16(net.minecraft.server.integrated.IntegratedServer a0, java.lang.String a1) throws Throwable;
private static native boolean __call573_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call573_18(net.minecraft.server.integrated.IntegratedServer a0, boolean a1) throws Throwable;
private static native boolean __call573_19(moom.EK a0) throws Throwable;
private static native void __call573_20(net.minecraft.server.integrated.IntegratedServer a0, boolean a1) throws Throwable;
private static native int __invokedynamic573_21(int a0, long a1) throws Throwable;
private static native void __call573_22(net.minecraft.server.integrated.IntegratedServer a0, int a1) throws Throwable;
private static native void __call573_23(net.minecraft.server.integrated.IntegratedServer a0, moom.BB a1) throws Throwable;
private static native void __fieldWrite573_24(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.client.Minecraft a1) throws Throwable;
private static native boolean __call573_25(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.EK __fieldRead573_26() throws Throwable;
private static native void __fieldWrite573_27(net.minecraft.server.integrated.IntegratedServer a0, moom.EK a1) throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __call573_28(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __call573_29(net.minecraft.world.storage.ISaveFormat a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call573_30(net.minecraft.world.storage.ISaveHandler a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call573_31(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native boolean __call573_32(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory573_33(boolean value) throws Throwable;
private static native int __call573_34(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite573_35(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead573_36(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.fL __fieldRead573_37(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call573_38(moom.fL a0, int a1) throws Throwable;
private static native void __call573_39(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3057300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3057301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3057302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3057303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3057304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3057305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3057306_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_39e309b2c830c9ec2631(net.minecraft.server.integrated.IntegratedServer a0, java.lang.String a1, java.lang.String a2, long a3, net.minecraft.world.WorldType a4, java.lang.String a5) throws E;
private static final class __SourceHandler_39e309b2c830c9ec2631 {

public static void f100210(net.minecraft.server.integrated.IntegratedServer receiver, java.lang.String p0, java.lang.String p1, long p2, net.minecraft.world.WorldType p3, java.lang.String p4) throws Throwable {
    net.minecraft.world.storage.WorldInfo forestValue100210_52_0;
    int forestValue100210_76_0;
    int forestValue100210_76_1;
    int forestValue100210_80_0;
    int forestValue100210_87_0;
    net.minecraft.server.integrated.IntegratedServer forestValue100210_106_0;
    net.minecraft.server.integrated.IntegratedServer forestValue100210_184_0;
    net.minecraft.entity.Entity[] spill100210_0;
    net.minecraft.world.storage.WorldInfo spill100210_1;
    int spill100210_2;
    int spill100210_3;
    int spill100210_4;
    net.minecraft.server.integrated.IntegratedServer spill100210_5;
    net.minecraft.server.integrated.IntegratedServer spill100210_6;
    long life7_3;
    net.minecraft.world.storage.ISaveHandler life10_28;
    net.minecraft.entity.Entity[] life9_29;
    net.minecraft.world.storage.WorldInfo life11_37;
    int life12_57;
    int life13_64;
    forest_join_184: {
    forest_join_183: {
    forest_join_168: {
    forest_join_163: {
    forest_join_54: {
    forest_join_52: {
    forest_join_51: {
    life7_3 = (__fieldRead100210_0() ^ 64588831733052L);
    __call100210_1(receiver, p0);
    __fieldWrite100210_2(receiver, new net.minecraft.world.WorldServer[3]);
    spill100210_0 = __call100210_3();
    __fieldWrite100210_7(receiver, __call100210_6((__fieldRead100210_4(receiver)).length, __invokedynamic100210_5(34, (2217668012883611618L ^ life7_3))));
    life10_28 = __call100210_9(__call100210_8(receiver), p0, 1);
    life9_29 = spill100210_0;
    __call100210_11(receiver, __call100210_10(receiver), life10_28);
    life11_37 = __call100210_12(life10_28);
    spill100210_1 = life11_37;
    if (!((life9_29 == null))) {
        forestValue100210_52_0 = spill100210_1;
        break forest_join_52;
    }
    if (!((spill100210_1 == null))) {
        break forest_join_51;
    }
    life11_37 = new net.minecraft.world.storage.WorldInfo(__fieldRead100210_13(receiver), p1);
    if (!((life9_29 != null))) {
        break forest_join_54;
    }
    }
    forestValue100210_52_0 = life11_37;
    }
    __call100210_14(forestValue100210_52_0, p1);
    }
    life12_57 = 0;
    forest_cycle_56: while (true) {
    forest_join_147: {
    forest_join_129: {
    forest_join_120: {
    forest_join_106: {
    forest_join_105: {
    forest_join_87: {
    forest_join_80: {
    forest_join_79: {
    forest_join_76: {
    forest_join_72: {
    if (!((life12_57 < (__fieldRead100210_15(receiver)).length))) {
        break forest_join_163;
    }
    life13_64 = 0;
    if (!((life9_29 == null))) {
        break forest_join_168;
    }
    spill100210_2 = life12_57;
    spill100210_3 = 1;
    if (!((life9_29 == null))) {
        forestValue100210_76_0 = spill100210_2;
        forestValue100210_76_1 = spill100210_3;
        break forest_join_76;
    }
    if (!((spill100210_2 == spill100210_3))) {
        break forest_join_72;
    }
    life13_64 = -1;
    }
    spill100210_4 = life12_57;
    if (!((life9_29 == null))) {
        forestValue100210_80_0 = spill100210_4;
        break forest_join_80;
    }
    forestValue100210_76_0 = spill100210_4;
    forestValue100210_76_1 = 2;
    }
    if (!((forestValue100210_76_0 == forestValue100210_76_1))) {
        break forest_join_79;
    }
    life13_64 = 1;
    }
    forestValue100210_80_0 = life12_57;
    }
    if (!((life9_29 == null))) {
        forestValue100210_87_0 = forestValue100210_80_0;
        break forest_join_87;
    }
    if (!((forestValue100210_80_0 == 0))) {
        break forest_join_129;
    }
    spill100210_5 = receiver;
    if (!((life9_29 == null))) {
        forestValue100210_106_0 = spill100210_5;
        break forest_join_106;
    }
    forestValue100210_87_0 = __integerCategory100210_17(__call100210_16(spill100210_5));
    }
    if (!((forestValue100210_87_0 != 0))) {
        break forest_join_105;
    }
    (__fieldRead100210_18(receiver))[life12_57] = __cast100210_21(__call100210_20(new moom.Ey(receiver, life10_28, life11_37, life13_64, __fieldRead100210_19(receiver))));
    if (!((life9_29 != null))) {
        break forest_join_120;
    }
    }
    forestValue100210_106_0 = receiver;
    }
    (__fieldRead100210_22(forestValue100210_106_0))[life12_57] = __cast100210_25(__call100210_24(new net.minecraft.world.WorldServer(receiver, life10_28, life11_37, life13_64, __fieldRead100210_23(receiver))));
    }
    __call100210_28((__fieldRead100210_26(receiver))[life12_57], __fieldRead100210_27(receiver));
    if (!((life9_29 != null))) {
        break forest_join_147;
    }
    }
    (__fieldRead100210_29(receiver))[life12_57] = __cast100210_33(__call100210_32(new moom.Ex(receiver, life10_28, life13_64, (__fieldRead100210_30(receiver))[0], __fieldRead100210_31(receiver))));
    }
    __call100210_36((__fieldRead100210_34(receiver))[life12_57], new moom.Ez(receiver, (__fieldRead100210_35(receiver))[life12_57]));
    life12_57 += 1;
    if (!((life9_29 != null))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    }
    __call100210_39(__call100210_37(receiver), __fieldRead100210_38(receiver));
    }
    spill100210_6 = receiver;
    if (!((life9_29 == null))) {
        forestValue100210_184_0 = spill100210_6;
        break forest_join_184;
    }
    if (!((__call100210_42(__call100210_41((__fieldRead100210_40(spill100210_6))[0])) == null))) {
        break forest_join_183;
    }
    __call100210_46(receiver, __fieldRead100210_45(__fieldRead100210_44(__fieldRead100210_43(receiver))));
    }
    forestValue100210_184_0 = receiver;
    }
    __call100210_47(forestValue100210_184_0);
    return;
}
public static void h100210_0(moom.Oo p0) throws Throwable {
    throw __call13021000_0(p0);
}
public static void h100210_1(moom.Oo p0) throws Throwable {
    throw __call13021001_0(p0);
}
public static void h100210_2(moom.Oo p0) throws Throwable {
    throw __call13021002_0(p0);
}
public static void h100210_3(moom.Oo p0) throws Throwable {
    throw __call13021003_0(p0);
}
public static void h100210_4(moom.Oo p0) throws Throwable {
    throw __call13021004_0(p0);
}
public static void h100210_5(moom.Oo p0) throws Throwable {
    throw __call13021005_0(p0);
}
public static void h100210_6(moom.Oo p0) throws Throwable {
    throw __call13021006_0(p0);
}
public static void h100210_7(moom.Oo p0) throws Throwable {
    throw __call13021007_0(p0);
}
public static void h100210_8(moom.Oo p0) throws Throwable {
    throw __call13021008_0(p0);
}
public static void h100210_9(moom.Oo p0) throws Throwable {
    throw __call13021009_0(p0);
}
public static void h100210_10(moom.Oo p0) throws Throwable {
    throw __call13021010_0(p0);
}
public static void h100210_11(moom.Oo p0) throws Throwable {
    throw __call13021011_0(p0);
}
public static void h100210_12(moom.Oo p0) throws Throwable {
    throw __call13021012_0(p0);
}
private static native long __fieldRead100210_0() throws Throwable;
private static native void __call100210_1(net.minecraft.server.integrated.IntegratedServer a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite100210_2(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.world.WorldServer[] a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call100210_3() throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100210_4(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native int __invokedynamic100210_5(int a0, long a1) throws Throwable;
private static native long[][] __call100210_6(int a0, int a1) throws Throwable;
private static native void __fieldWrite100210_7(net.minecraft.server.integrated.IntegratedServer a0, long[][] a1) throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __call100210_8(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __call100210_9(net.minecraft.world.storage.ISaveFormat a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __call100210_10(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call100210_11(net.minecraft.server.integrated.IntegratedServer a0, java.lang.String a1, net.minecraft.world.storage.ISaveHandler a2) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call100210_12(net.minecraft.world.storage.ISaveHandler a0) throws Throwable;
private static native moom.EK __fieldRead100210_13(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call100210_14(net.minecraft.world.storage.WorldInfo a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100210_15(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native boolean __call100210_16(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native int __integerCategory100210_17(boolean value) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100210_18(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.A9 __fieldRead100210_19(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.World __call100210_20(moom.Ey a0) throws Throwable;
private static native net.minecraft.world.WorldServer __cast100210_21(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100210_22(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.A9 __fieldRead100210_23(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.World __call100210_24(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __cast100210_25(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100210_26(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.EK __fieldRead100210_27(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call100210_28(net.minecraft.world.WorldServer a0, moom.EK a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100210_29(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100210_30(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.A9 __fieldRead100210_31(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.World __call100210_32(moom.Ex a0) throws Throwable;
private static native net.minecraft.world.WorldServer __cast100210_33(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100210_34(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100210_35(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call100210_36(net.minecraft.world.WorldServer a0, moom.Ez a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call100210_37(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100210_38(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call100210_39(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.world.WorldServer[] a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead100210_40(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call100210_41(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call100210_42(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100210_43(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead100210_44(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead100210_45(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call100210_46(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native void __call100210_47(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native java.lang.Exception __call13021000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13021001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13021002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13021003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13021004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13021005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13021006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13021007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13021008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13021009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13021010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13021011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13021012_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8b0282efdeeb6e754784(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.world.EnumDifficulty a1) throws E;
private static final class __SourceHandler_8b0282efdeeb6e754784 {

public static void f1659(net.minecraft.server.integrated.IntegratedServer receiver, net.minecraft.world.EnumDifficulty p0) throws Throwable {
    net.minecraft.client.multiplayer.WorldClient forwardValue1659_18_0;
    net.minecraft.entity.Entity[] spill1659_0;
    net.minecraft.client.multiplayer.WorldClient spill1659_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_21: {
    forward_join_18: {
    life2_3 = (__fieldRead1659_0() ^ 21161130931849L);
    spill1659_0 = __call1659_1();
    __call1659_2(receiver, p0);
    life4_8 = spill1659_0;
    spill1659_1 = __fieldRead1659_4(__fieldRead1659_3(receiver));
    if (!((life4_8 == null))) {
        forwardValue1659_18_0 = spill1659_1;
        break forward_join_18;
    }
    if (!((spill1659_1 != null))) {
        break forward_join_21;
    }
    forwardValue1659_18_0 = __fieldRead1659_6(__fieldRead1659_5(receiver));
    }
    __call1659_8(__call1659_7(forwardValue1659_18_0), p0);
    }
    return;
}
public static void h1659_0(moom.Oo p0) throws Throwable {
    throw __call1165900_0(p0);
}
public static void h1659_1(moom.Oo p0) throws Throwable {
    throw __call1165901_0(p0);
}
private static native long __fieldRead1659_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1659_1() throws Throwable;
private static native void __call1659_2(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1659_3(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1659_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1659_5(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1659_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1659_7(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call1659_8(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native java.lang.Exception __call1165900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1165901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fa8e1ab0bd5eb4c005e3(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.world.WorldServer a1) throws E;
private static final class __SourceHandler_fa8e1ab0bd5eb4c005e3 {

public static void f1660(net.minecraft.server.integrated.IntegratedServer receiver, net.minecraft.world.WorldServer p0) throws Throwable {
    int forwardValue1660_14_0;
    int forwardValue1660_21_0;
    int forwardValue1660_25_0;
    net.minecraft.server.integrated.IntegratedServer forwardValue1660_36_0;
    net.minecraft.server.integrated.IntegratedServer forwardValue1660_50_0;
    boolean spill1660_0;
    net.minecraft.server.integrated.IntegratedServer spill1660_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_52: {
    forward_join_50: {
    forward_join_36: {
    forward_join_29: {
    forward_join_25: {
    forward_join_21: {
    forward_join_20: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead1660_0() ^ 107868169648909L);
    life4_5 = __call1660_1();
    spill1660_0 = __call1660_2();
    if (!((life4_5 == null))) {
        forwardValue1660_14_0 = __integerCategory1660_3(spill1660_0);
        break forward_join_14;
    }
    if (!((!spill1660_0))) {
        break forward_join_13;
    }
    __call1660_4(receiver, p0);
    }
    forwardValue1660_14_0 = __integerCategory1660_6(__call1660_5());
    }
    if (!((life4_5 == null))) {
        forwardValue1660_21_0 = forwardValue1660_14_0;
        break forward_join_21;
    }
    if (!((forwardValue1660_14_0 == 0))) {
        break forward_join_20;
    }
    __call1660_7(receiver, p0);
    }
    forwardValue1660_21_0 = __integerCategory1660_9(__fieldRead1660_8());
    }
    if (!((life4_5 == null))) {
        forwardValue1660_25_0 = forwardValue1660_21_0;
        break forward_join_25;
    }
    if (!((forwardValue1660_21_0 != 0))) {
        break forward_join_29;
    }
    forwardValue1660_25_0 = 0;
    }
    __fieldWrite1660_10(forwardValue1660_25_0);
    __call1660_12(__call1660_11(), p0);
    }
    spill1660_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue1660_36_0 = spill1660_1;
        break forward_join_36;
    }
    if (!((__fieldRead1660_13(spill1660_1) == p0))) {
        break forward_join_52;
    }
    forwardValue1660_36_0 = receiver;
    }
    if (!((life4_5 == null))) {
        forwardValue1660_50_0 = forwardValue1660_36_0;
        break forward_join_50;
    }
    if (!((__fieldRead1660_14(forwardValue1660_36_0) != null))) {
        break forward_join_52;
    }
    __fieldWrite1660_17(receiver, __call1660_16(p0, __fieldRead1660_15(receiver)));
    __fieldWrite1660_18(receiver, null);
    forwardValue1660_50_0 = receiver;
    }
    __fieldWrite1660_19(forwardValue1660_50_0, null);
    }
    return;
}
public static void h1660_0(moom.Oo p0) throws Throwable {
    throw __call1166000_0(p0);
}
public static void h1660_1(moom.Oo p0) throws Throwable {
    throw __call1166001_0(p0);
}
public static void h1660_2(moom.Oo p0) throws Throwable {
    throw __call1166002_0(p0);
}
public static void h1660_3(moom.Oo p0) throws Throwable {
    throw __call1166003_0(p0);
}
public static void h1660_4(moom.Oo p0) throws Throwable {
    throw __call1166004_0(p0);
}
public static void h1660_5(moom.Oo p0) throws Throwable {
    throw __call1166005_0(p0);
}
public static void h1660_6(moom.Oo p0) throws Throwable {
    throw __call1166006_0(p0);
}
public static void h1660_7(moom.Oo p0) throws Throwable {
    throw __call1166007_0(p0);
}
public static void h1660_8(moom.Oo p0) throws Throwable {
    throw __call1166008_0(p0);
}
private static native long __fieldRead1660_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1660_1() throws Throwable;
private static native boolean __call1660_2() throws Throwable;
private static native int __integerCategory1660_3(boolean value) throws Throwable;
private static native void __call1660_4(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.world.WorldServer a1) throws Throwable;
private static native boolean __call1660_5() throws Throwable;
private static native int __integerCategory1660_6(boolean value) throws Throwable;
private static native void __call1660_7(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.world.WorldServer a1) throws Throwable;
private static native boolean __fieldRead1660_8() throws Throwable;
private static native int __integerCategory1660_9(boolean value) throws Throwable;
private static native void __fieldWrite1660_10(int a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call1660_11() throws Throwable;
private static native void __call1660_12(net.minecraft.client.settings.GameSettings a0, net.minecraft.world.WorldServer a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1660_13(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.DT __fieldRead1660_14(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.DT __fieldRead1660_15(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.Eh __call1660_16(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native void __fieldWrite1660_17(net.minecraft.server.integrated.IntegratedServer a0, moom.Eh a1) throws Throwable;
private static native void __fieldWrite1660_18(net.minecraft.server.integrated.IntegratedServer a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite1660_19(net.minecraft.server.integrated.IntegratedServer a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Exception __call1166000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166008_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_aedc824467cd9af72927(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.world.WorldSettings$GameType a1, boolean a2) throws E;
private static final class __SourceHandler_aedc824467cd9af72927 {

public static java.lang.String f700(net.minecraft.server.integrated.IntegratedServer receiver, net.minecraft.world.WorldSettings$GameType p0, boolean p1) throws Throwable {
    int spill700_0;
    int joinValue700_1_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_7;
    int life6_9;
    life3_3 = (__fieldRead700_0() ^ 19760247196407L);
    life5_5 = __call700_1();
    life6_7 = -1;
    life6_9 = __call700_2();
    spill700_0 = life6_9;
    if ((life5_5 == null)) {
        if ((spill700_0 <= 0)) {
        life6_9 = __invokedynamic700_3(32047, (423572253079506215L ^ life3_3));
    } else {
        
    }
        __call700_5(__call700_4(receiver), null, life6_9);
        __call700_8(__fieldRead700_6(), __invokedynamic700_7(life6_9));
        __fieldWrite700_9(receiver, 1);
        __fieldWrite700_12(receiver, new moom.Os(__call700_10(receiver), __invokedynamic700_11(life6_9)));
        __call700_14(__fieldRead700_13(receiver));
        __call700_16(__call700_15(receiver), p0);
        __call700_18(__call700_17(receiver), p1);
        joinValue700_1_0 = life6_9;
    } else {
        joinValue700_1_0 = spill700_0;
    }
    return __invokedynamic700_19(joinValue700_1_0);
}
public static java.lang.String h700_0(java.io.IOException p0, net.minecraft.server.integrated.IntegratedServer p1, net.minecraft.world.WorldSettings$GameType p2, boolean p3, long p4, net.minecraft.entity.Entity[] p5, int p6) throws Throwable {
    int spill3070000_0;
    int joinValue3070000_1_0;
    java.io.IOException life8_2;
    life8_2 = p0;
    spill3070000_0 = p6;
    if ((p5 == null)) {
        if ((spill3070000_0 <= 0)) {
        p6 = __invokedynamic3070000_0(32047, (423572253079506215L ^ p4));
    } else {
        
    }
        __call3070000_2(__call3070000_1(p1), null, p6);
        __call3070000_5(__fieldRead3070000_3(), __invokedynamic3070000_4(p6));
        __fieldWrite3070000_6(p1, 1);
        __fieldWrite3070000_9(p1, new moom.Os(__call3070000_7(p1), __invokedynamic3070000_8(p6)));
        __call3070000_11(__fieldRead3070000_10(p1));
        __call3070000_13(__call3070000_12(p1), p2);
        __call3070000_15(__call3070000_14(p1), p3);
        joinValue3070000_1_0 = p6;
    } else {
        joinValue3070000_1_0 = spill3070000_0;
    }
    return __invokedynamic3070000_16(joinValue3070000_1_0);
}
public static java.lang.String h700_1(java.io.IOException p0) throws Throwable {
    throw __call3070001_0(p0);
}
public static java.lang.String h700_2(java.io.IOException p0, int p1) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    return null;
}
private static native long __fieldRead700_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call700_1() throws Throwable;
private static native int __call700_2() throws Throwable;
private static native int __invokedynamic700_3(int a0, long a1) throws Throwable;
private static native net.minecraft.network.NetworkSystem __call700_4(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call700_5(net.minecraft.network.NetworkSystem a0, java.lang.Object a1, int a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead700_6() throws Throwable;
private static native java.lang.String __invokedynamic700_7(int a0) throws Throwable;
private static native void __call700_8(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite700_9(net.minecraft.server.integrated.IntegratedServer a0, int a1) throws Throwable;
private static native java.lang.String __call700_10(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native java.lang.String __invokedynamic700_11(int a0) throws Throwable;
private static native void __fieldWrite700_12(net.minecraft.server.integrated.IntegratedServer a0, moom.Os a1) throws Throwable;
private static native moom.Os __fieldRead700_13(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call700_14(moom.Os a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call700_15(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call700_16(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call700_17(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call700_18(net.minecraft.server.management.ServerConfigurationManager a0, boolean a1) throws Throwable;
private static native java.lang.String __invokedynamic700_19(int a0) throws Throwable;
private static native int __invokedynamic3070000_0(int a0, long a1) throws Throwable;
private static native net.minecraft.network.NetworkSystem __call3070000_1(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call3070000_2(net.minecraft.network.NetworkSystem a0, java.lang.Object a1, int a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3070000_3() throws Throwable;
private static native java.lang.String __invokedynamic3070000_4(int a0) throws Throwable;
private static native void __call3070000_5(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite3070000_6(net.minecraft.server.integrated.IntegratedServer a0, int a1) throws Throwable;
private static native java.lang.String __call3070000_7(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native java.lang.String __invokedynamic3070000_8(int a0) throws Throwable;
private static native void __fieldWrite3070000_9(net.minecraft.server.integrated.IntegratedServer a0, moom.Os a1) throws Throwable;
private static native moom.Os __fieldRead3070000_10(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call3070000_11(moom.Os a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call3070000_12(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call3070000_13(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call3070000_14(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call3070000_15(net.minecraft.server.management.ServerConfigurationManager a0, boolean a1) throws Throwable;
private static native java.lang.String __invokedynamic3070000_16(int a0) throws Throwable;
private static native java.lang.Exception __call3070001_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2b91790819bfb35649f2(net.minecraft.server.integrated.IntegratedServer a0, boolean a1) throws E;
private static final class __SourceHandler_2b91790819bfb35649f2 {

public static void f2979(net.minecraft.server.integrated.IntegratedServer receiver, boolean p0) throws Throwable {
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_15;
    int life6_20;
    life2_3 = (__fieldRead2979_0() ^ 117845597005272L);
    life4_5 = __call2979_1();
    if ((life4_5 == null)) {
        if (p0) {
        life5_15 = __call2979_2(receiver);
        life6_20 = __fieldRead2979_5(__fieldRead2979_4(__fieldRead2979_3(receiver)));
        if ((((long) life5_15) < (__fieldRead2979_6(receiver) + ((long) life6_20)))) {
        return;
    }
        __fieldWrite2979_7(receiver, ((long) life5_15));
    }
        __call2979_8(receiver, p0);
    }
    return;
}
public static void h2979_0(moom.Oo p0) throws Throwable {
    throw __call1297900_0(p0);
}
public static void h2979_1(moom.Oo p0) throws Throwable {
    throw __call1297901_0(p0);
}
private static native long __fieldRead2979_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call2979_1() throws Throwable;
private static native int __call2979_2(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2979_3(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2979_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead2979_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native long __fieldRead2979_6(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __fieldWrite2979_7(net.minecraft.server.integrated.IntegratedServer a0, long a1) throws Throwable;
private static native void __call2979_8(net.minecraft.server.integrated.IntegratedServer a0, boolean a1) throws Throwable;
private static native java.lang.Exception __call1297900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1297901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.EnumDifficulty __sourceHandlerCall_0c679a3a3a1d0fbe4801(net.minecraft.server.integrated.IntegratedServer a0) throws E;
private static final class __SourceHandler_0c679a3a3a1d0fbe4801 {

public static net.minecraft.world.EnumDifficulty f1661(net.minecraft.server.integrated.IntegratedServer receiver) throws Throwable {
    net.minecraft.client.multiplayer.WorldClient forwardValue1661_20_0;
    net.minecraft.world.EnumDifficulty forwardValue1661_22_0;
    net.minecraft.client.multiplayer.WorldClient spill1661_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_20: {
    forward_join_17: {
    life1_3 = (__fieldRead1661_0() ^ 95349965044839L);
    life3_5 = __call1661_1();
    spill1661_0 = __fieldRead1661_3(__fieldRead1661_2(receiver));
    if (!((life3_5 == null))) {
        forwardValue1661_20_0 = spill1661_0;
        break forward_join_20;
    }
    if (!((spill1661_0 == null))) {
        break forward_join_17;
    }
    forwardValue1661_22_0 = __fieldRead1661_6(__fieldRead1661_5(__fieldRead1661_4(receiver)));
    break forward_join_22;
    }
    forwardValue1661_20_0 = __fieldRead1661_8(__fieldRead1661_7(receiver));
    }
    forwardValue1661_22_0 = __call1661_10(__call1661_9(forwardValue1661_20_0));
    }
    return forwardValue1661_22_0;
}
public static void h1661_0(moom.Oo p0) throws Throwable {
    throw __call1166100_0(p0);
}
public static void h1661_1(moom.Oo p0) throws Throwable {
    throw __call1166101_0(p0);
}
private static native long __fieldRead1661_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1661_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1661_2(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1661_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1661_4(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1661_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead1661_6(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1661_7(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1661_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1661_9(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call1661_10(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.Exception __call1166100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e8d7085072f4e3917bc2(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.world.WorldServer a1) throws E;
private static final class __SourceHandler_e8d7085072f4e3917bc2 {

public static void f1662(net.minecraft.server.integrated.IntegratedServer receiver, net.minecraft.world.WorldServer p0) throws Throwable {
    net.minecraft.world.storage.WorldInfo forwardValue1662_32_0;
    net.minecraft.entity.Entity[] spill1662_0;
    net.minecraft.world.storage.WorldInfo spill1662_1;
    net.minecraft.world.storage.WorldInfo spill1662_2;
    long life2_3;
    net.minecraft.world.storage.WorldInfo life5_7;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_69: {
    forward_join_32: {
    forward_join_19: {
    life2_3 = (__fieldRead1662_0() ^ 31806025912022L);
    spill1662_0 = __call1662_1();
    life5_7 = __call1662_2(p0);
    life4_8 = spill1662_0;
    spill1662_1 = life5_7;
    if (!((life4_8 == null))) {
        forwardValue1662_32_0 = spill1662_1;
        break forward_join_32;
    }
    if (!((!__call1662_3(spill1662_1)))) {
        break forward_join_19;
    }
    spill1662_2 = life5_7;
    if (!((life4_8 == null))) {
        forwardValue1662_32_0 = spill1662_2;
        break forward_join_32;
    }
    if (!(__call1662_4(spill1662_2))) {
        break forward_join_69;
    }
    }
    __call1662_5(life5_7, 0);
    __call1662_6(life5_7, 0);
    __call1662_7(p0, 0x0.0p0f);
    __call1662_8(life5_7, 0);
    forwardValue1662_32_0 = life5_7;
    }
    __call1662_9(forwardValue1662_32_0, 0);
    __call1662_10(p0, 0x0.0p0f);
    __call1662_12(__call1662_11(receiver), new moom.Ac(2, 0x0.0p0f));
    __call1662_15(__call1662_13(receiver), new moom.Ac(__invokedynamic1662_14(23510, (9114576871933030397L ^ life2_3)), 0x0.0p0f));
    __call1662_18(__call1662_16(receiver), new moom.Ac(__invokedynamic1662_17(31652, (3257904873227587465L ^ life2_3)), 0x0.0p0f));
    }
    return;
}
public static void h1662_0(moom.Oo p0) throws Throwable {
    throw __call1166200_0(p0);
}
public static void h1662_1(moom.Oo p0) throws Throwable {
    throw __call1166201_0(p0);
}
public static void h1662_2(moom.Oo p0) throws Throwable {
    throw __call1166202_0(p0);
}
public static void h1662_3(moom.Oo p0) throws Throwable {
    throw __call1166203_0(p0);
}
private static native long __fieldRead1662_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1662_1() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1662_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1662_3(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native boolean __call1662_4(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1662_5(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1662_6(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1662_7(net.minecraft.world.WorldServer a0, float a1) throws Throwable;
private static native void __call1662_8(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1662_9(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __call1662_10(net.minecraft.world.WorldServer a0, float a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1662_11(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call1662_12(net.minecraft.server.management.ServerConfigurationManager a0, moom.Ac a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1662_13(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native int __invokedynamic1662_14(int a0, long a1) throws Throwable;
private static native void __call1662_15(net.minecraft.server.management.ServerConfigurationManager a0, moom.Ac a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1662_16(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native int __invokedynamic1662_17(int a0, long a1) throws Throwable;
private static native void __call1662_18(net.minecraft.server.management.ServerConfigurationManager a0, moom.Ac a1) throws Throwable;
private static native java.lang.Exception __call1166200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166203_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1c709f8ee02c06b4d5a4(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.world.WorldServer a1) throws E;
private static final class __SourceHandler_1c709f8ee02c06b4d5a4 {

public static void f614(net.minecraft.server.integrated.IntegratedServer receiver, net.minecraft.world.WorldServer p0) throws Throwable {
    int forwardValue614_57_0;
    int forwardValue614_72_0;
    int forwardValue614_82_0;
    int forwardValue614_103_0;
    net.minecraft.entity.Entity[] spill614_0;
    boolean spill614_1;
    int spill614_2;
    long life2_3;
    net.minecraft.world.storage.WorldInfo life5_7;
    net.minecraft.entity.Entity[] life4_8;
    long life6_16;
    long life8_24;
    forward_join_121: {
    forward_join_103: {
    forward_join_96: {
    forward_join_82: {
    forward_join_72: {
    forward_join_71: {
    forward_join_57: {
    forward_join_50: {
    life2_3 = (__fieldRead614_0() ^ 100366474576622L);
    spill614_0 = __call614_1();
    life5_7 = __call614_2(p0);
    life4_8 = spill614_0;
    if (!((__call614_4(__call614_3(life5_7)) == 1))) {
        break forward_join_121;
    }
    life6_16 = __call614_5(p0);
    life8_24 = (life6_16 % __invokedynamic614_6(8880, (3367377864765440812L ^ life2_3)));
    spill614_1 = __call614_7();
    if (!((life4_8 == null))) {
        forwardValue614_72_0 = __integerCategory614_8(spill614_1);
        break forward_join_72;
    }
    if (!(spill614_1)) {
        break forward_join_71;
    }
    spill614_2 = __numericCompare614_10(life8_24, __invokedynamic614_9(24793, (7330328220657926474L ^ life2_3)));
    if (!((life4_8 == null))) {
        forwardValue614_57_0 = spill614_2;
        break forward_join_57;
    }
    if (!((spill614_2 <= 0))) {
        break forward_join_50;
    }
    __call614_12(p0, ((life6_16 - life8_24) + __invokedynamic614_11(9004, (921746890454663868L ^ life2_3))));
    }
    forwardValue614_57_0 = __numericCompare614_14(life8_24, __invokedynamic614_13(5502, (6596229547704759529L ^ life2_3)));
    }
    if (!((life4_8 == null))) {
        forwardValue614_72_0 = forwardValue614_57_0;
        break forward_join_72;
    }
    if (!((forwardValue614_57_0 >= 0))) {
        break forward_join_71;
    }
    __call614_16(p0, ((life6_16 - life8_24) + __invokedynamic614_15(431, (7789176324499185723L ^ life2_3))));
    }
    forwardValue614_72_0 = __integerCategory614_18(__call614_17());
    }
    if (!((life4_8 == null))) {
        forwardValue614_82_0 = forwardValue614_72_0;
        break forward_join_82;
    }
    if (!((forwardValue614_72_0 != 0))) {
        break forward_join_121;
    }
    forwardValue614_82_0 = __numericCompare614_20(life8_24, __invokedynamic614_19(28769, (3015879964308460023L ^ life2_3)));
    }
    if (!((life4_8 == null))) {
        forwardValue614_103_0 = forwardValue614_82_0;
        break forward_join_103;
    }
    if (!((forwardValue614_82_0 <= 0))) {
        break forward_join_96;
    }
    __call614_22(p0, ((life6_16 - life8_24) + __invokedynamic614_21(4746, (6321511491088462619L ^ life2_3))));
    }
    forwardValue614_103_0 = __numericCompare614_24(life8_24, __invokedynamic614_23(19955, (2144436211683683425L ^ life2_3)));
    }
    if (!((forwardValue614_103_0 >= 0))) {
        break forward_join_121;
    }
    __call614_27(p0, (((life6_16 - life8_24) + __invokedynamic614_25(26952, (8243081877130528981L ^ life2_3))) + __invokedynamic614_26(27203, (3413682178810694614L ^ life2_3))));
    }
    return;
}
public static void h614_0(moom.Oo p0) throws Throwable {
    throw __call2061400_0(p0);
}
public static void h614_1(moom.Oo p0) throws Throwable {
    throw __call2061401_0(p0);
}
public static void h614_2(moom.Oo p0) throws Throwable {
    throw __call2061402_0(p0);
}
public static void h614_3(moom.Oo p0) throws Throwable {
    throw __call2061403_0(p0);
}
public static void h614_4(moom.Oo p0) throws Throwable {
    throw __call2061404_0(p0);
}
public static void h614_5(moom.Oo p0) throws Throwable {
    throw __call2061405_0(p0);
}
public static void h614_6(moom.Oo p0) throws Throwable {
    throw __call2061406_0(p0);
}
public static void h614_7(moom.Oo p0) throws Throwable {
    throw __call2061407_0(p0);
}
public static void h614_8(moom.Oo p0) throws Throwable {
    throw __call2061408_0(p0);
}
public static void h614_9(moom.Oo p0) throws Throwable {
    throw __call2061409_0(p0);
}
public static void h614_10(moom.Oo p0) throws Throwable {
    throw __call2061410_0(p0);
}
private static native long __fieldRead614_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call614_1() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call614_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call614_3(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __call614_4(net.minecraft.world.WorldSettings$GameType a0) throws Throwable;
private static native long __call614_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __invokedynamic614_6(int a0, long a1) throws Throwable;
private static native boolean __call614_7() throws Throwable;
private static native int __integerCategory614_8(boolean value) throws Throwable;
private static native long __invokedynamic614_9(int a0, long a1) throws Throwable;
private static native int __numericCompare614_10(long a0, long a1) throws Throwable;
private static native long __invokedynamic614_11(int a0, long a1) throws Throwable;
private static native void __call614_12(net.minecraft.world.WorldServer a0, long a1) throws Throwable;
private static native long __invokedynamic614_13(int a0, long a1) throws Throwable;
private static native int __numericCompare614_14(long a0, long a1) throws Throwable;
private static native long __invokedynamic614_15(int a0, long a1) throws Throwable;
private static native void __call614_16(net.minecraft.world.WorldServer a0, long a1) throws Throwable;
private static native boolean __call614_17() throws Throwable;
private static native int __integerCategory614_18(boolean value) throws Throwable;
private static native long __invokedynamic614_19(int a0, long a1) throws Throwable;
private static native int __numericCompare614_20(long a0, long a1) throws Throwable;
private static native long __invokedynamic614_21(int a0, long a1) throws Throwable;
private static native void __call614_22(net.minecraft.world.WorldServer a0, long a1) throws Throwable;
private static native long __invokedynamic614_23(int a0, long a1) throws Throwable;
private static native int __numericCompare614_24(long a0, long a1) throws Throwable;
private static native long __invokedynamic614_25(int a0, long a1) throws Throwable;
private static native long __invokedynamic614_26(int a0, long a1) throws Throwable;
private static native void __call614_27(net.minecraft.world.WorldServer a0, long a1) throws Throwable;
private static native java.lang.Exception __call2061400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2061401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2061402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2061403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2061404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2061405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2061406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2061407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2061408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2061409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2061410_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_806a7d6ef24b42bb77e9(net.minecraft.server.integrated.IntegratedServer a0) throws E;
private static final class __SourceHandler_806a7d6ef24b42bb77e9 {

public static void f1663(net.minecraft.server.integrated.IntegratedServer receiver) throws Throwable {
    moom.Os forwardValue1663_15_0;
    net.minecraft.entity.Entity[] spill1663_0;
    moom.Os spill1663_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    forward_join_19: {
    forward_join_15: {
    life1_3 = (__fieldRead1663_0() ^ 58967215935207L);
    spill1663_0 = __call1663_1();
    __call1663_2(receiver);
    life3_7 = spill1663_0;
    spill1663_1 = __fieldRead1663_3(receiver);
    if (!((life3_7 == null))) {
        forwardValue1663_15_0 = spill1663_1;
        break forward_join_15;
    }
    if (!((spill1663_1 != null))) {
        break forward_join_19;
    }
    forwardValue1663_15_0 = __fieldRead1663_4(receiver);
    }
    __call1663_5(forwardValue1663_15_0);
    __fieldWrite1663_6(receiver, null);
    }
    return;
}
public static void h1663_0(moom.Oo p0) throws Throwable {
    throw __call1166300_0(p0);
}
public static void h1663_1(moom.Oo p0) throws Throwable {
    throw __call1166301_0(p0);
}
private static native long __fieldRead1663_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1663_1() throws Throwable;
private static native void __call1663_2(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.Os __fieldRead1663_3(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.Os __fieldRead1663_4(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call1663_5(moom.Os a0) throws Throwable;
private static native void __fieldWrite1663_6(net.minecraft.server.integrated.IntegratedServer a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Exception __call1166300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_5c3de9163fa70cd5282a(net.minecraft.server.integrated.IntegratedServer a0) throws E;
private static final class __SourceHandler_5c3de9163fa70cd5282a {

public static boolean f615(net.minecraft.server.integrated.IntegratedServer receiver) throws Throwable {
    int forwardValue615_70_0;
    net.minecraft.entity.Entity[] spill615_0;
    int spill615_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_28;
    forward_join_70: {
    life1_3 = (__fieldRead615_0() ^ 23968111852313L);
    __call615_3(__call615_2(__call615_1()), new com.moon.ev("Singleplayer", true));
    __call615_5(__fieldRead615_4(), "Starting integrated minecraft server version 1.9");
    __call615_6(receiver, 1);
    __call615_7(receiver, 1);
    __call615_8(receiver, 1);
    spill615_0 = __call615_9();
    __call615_10(receiver, 1);
    life3_28 = spill615_0;
    __call615_11(receiver, 1);
    __call615_13(__fieldRead615_12(), "Generating keypair");
    __call615_15(receiver, __call615_14());
    __call615_24(receiver, __call615_16(receiver), __call615_17(receiver), __call615_19(__fieldRead615_18(receiver)), __call615_21(__fieldRead615_20(receiver)), __call615_23(__fieldRead615_22(receiver)));
    __call615_30(receiver, __invokedynamic615_29(__call615_25(receiver), __call615_28(__call615_27((__fieldRead615_26(receiver))[0]))));
    spill615_1 = 1;
    if (!((__call615_31() != null))) {
        forwardValue615_70_0 = spill615_1;
        break forward_join_70;
    }
    __call615_32(new net.minecraft.entity.Entity[1]);
    forwardValue615_70_0 = spill615_1;
    }
    return __integerCategory615_33(forwardValue615_70_0);
}
public static boolean h615_0(java.io.IOException p0) throws Throwable {
    throw __call2061500_0(p0);
}
private static native long __fieldRead615_0() throws Throwable;
private static native com.moon.runtime.ClientContext __call615_1() throws Throwable;
private static native com.moon.events.EventBus __call615_2(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call615_3(com.moon.events.EventBus a0, com.moon.ev a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead615_4() throws Throwable;
private static native void __call615_5(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call615_6(net.minecraft.server.integrated.IntegratedServer a0, int a1) throws Throwable;
private static native void __call615_7(net.minecraft.server.integrated.IntegratedServer a0, int a1) throws Throwable;
private static native void __call615_8(net.minecraft.server.integrated.IntegratedServer a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call615_9() throws Throwable;
private static native void __call615_10(net.minecraft.server.integrated.IntegratedServer a0, int a1) throws Throwable;
private static native void __call615_11(net.minecraft.server.integrated.IntegratedServer a0, int a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead615_12() throws Throwable;
private static native void __call615_13(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.security.KeyPair __call615_14() throws Throwable;
private static native void __call615_15(net.minecraft.server.integrated.IntegratedServer a0, java.security.KeyPair a1) throws Throwable;
private static native java.lang.String __call615_16(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native java.lang.String __call615_17(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.EK __fieldRead615_18(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native long __call615_19(moom.EK a0) throws Throwable;
private static native moom.EK __fieldRead615_20(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.WorldType __call615_21(moom.EK a0) throws Throwable;
private static native moom.EK __fieldRead615_22(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native java.lang.String __call615_23(moom.EK a0) throws Throwable;
private static native void __call615_24(net.minecraft.server.integrated.IntegratedServer a0, java.lang.String a1, java.lang.String a2, long a3, net.minecraft.world.WorldType a4, java.lang.String a5) throws Throwable;
private static native java.lang.String __call615_25(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead615_26(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call615_27(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.String __call615_28(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.String __invokedynamic615_29(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call615_30(net.minecraft.server.integrated.IntegratedServer a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __call615_31() throws Throwable;
private static native void __call615_32(net.minecraft.entity.Entity[] a0) throws Throwable;
private static native boolean __integerCategory615_33(int value) throws Throwable;
private static native java.lang.Exception __call2061500_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4e43b7e68c0c0addd6da(net.minecraft.server.integrated.IntegratedServer a0) throws E;
private static final class __SourceHandler_4e43b7e68c0c0addd6da {

public static void f1664(net.minecraft.server.integrated.IntegratedServer receiver) throws Throwable {
    net.minecraft.server.integrated.IntegratedServer forwardValue1664_20_0;
    moom.Os forwardValue1664_26_0;
    net.minecraft.server.integrated.IntegratedServer spill1664_0;
    moom.Os spill1664_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_30: {
    forward_join_26: {
    forward_join_20: {
    forward_join_17: {
    life1_3 = (__fieldRead1664_0() ^ 106252724645129L);
    life3_5 = __call1664_1();
    spill1664_0 = receiver;
    if (!((life3_5 == null))) {
        forwardValue1664_20_0 = spill1664_0;
        break forward_join_20;
    }
    if (!(__call1664_2(spill1664_0))) {
        break forward_join_17;
    }
    __call1664_5(__call1664_4(receiver, __invokedynamic1664_3(receiver)));
    }
    __call1664_6(receiver);
    forwardValue1664_20_0 = receiver;
    }
    spill1664_1 = __fieldRead1664_7(forwardValue1664_20_0);
    if (!((life3_5 == null))) {
        forwardValue1664_26_0 = spill1664_1;
        break forward_join_26;
    }
    if (!((spill1664_1 != null))) {
        break forward_join_30;
    }
    forwardValue1664_26_0 = __fieldRead1664_8(receiver);
    }
    __call1664_9(forwardValue1664_26_0);
    __fieldWrite1664_10(receiver, null);
    }
    return;
}
public static void h1664_0(moom.Oo p0) throws Throwable {
    throw __call1166400_0(p0);
}
public static void h1664_1(moom.Oo p0) throws Throwable {
    throw __call1166401_0(p0);
}
public static void h1664_2(moom.Oo p0) throws Throwable {
    throw __call1166402_0(p0);
}
public static void h1664_3(moom.Oo p0) throws Throwable {
    throw __call1166403_0(p0);
}
private static native long __fieldRead1664_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1664_1() throws Throwable;
private static native boolean __call1664_2(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic1664_3(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call1664_4(net.minecraft.server.integrated.IntegratedServer a0, java.lang.Runnable a1) throws Throwable;
private static native java.lang.Object __call1664_5(com.google.common.util.concurrent.ListenableFuture a0) throws Throwable;
private static native void __call1664_6(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.Os __fieldRead1664_7(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.Os __fieldRead1664_8(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call1664_9(moom.Os a0) throws Throwable;
private static native void __fieldWrite1664_10(net.minecraft.server.integrated.IntegratedServer a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Exception __call1166400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166403_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4ca1082ad6324781d202(net.minecraft.server.integrated.IntegratedServer a0) throws E;
private static final class __SourceHandler_4ca1082ad6324781d202 {

public static void f702(net.minecraft.server.integrated.IntegratedServer receiver) throws Throwable {
    net.minecraft.server.integrated.IntegratedServer forestValue702_18_0;
    net.minecraft.client.Minecraft forestValue702_18_1;
    net.minecraft.server.integrated.IntegratedServer forestValue702_23_0;
    int forestValue702_23_1;
    net.minecraft.server.integrated.IntegratedServer forestValue702_24_0;
    net.minecraft.server.integrated.IntegratedServer forestValue702_25_0;
    int forestValue702_25_1;
    int forestValue702_46_0;
    int forestValue702_81_0;
    net.minecraft.client.Minecraft forestValue702_116_0;
    net.minecraft.server.integrated.IntegratedServer forestValue702_119_0;
    net.minecraft.world.storage.WorldInfo forestValue702_163_0;
    int forestValue702_164_0;
    int forestValue702_169_0;
    net.minecraft.entity.Entity[] spill702_0;
    net.minecraft.server.integrated.IntegratedServer spill702_1;
    net.minecraft.client.Minecraft spill702_2;
    boolean spill702_3;
    int spill702_4;
    boolean spill702_5;
    net.minecraft.client.Minecraft spill702_6;
    org.apache.logging.log4j.Logger spill702_7;
    java.lang.String spill702_8;
    java.lang.Object[] spill702_9;
    java.lang.Object[] spill702_10;
    net.minecraft.server.integrated.IntegratedServer spill702_11;
    boolean spill702_12;
    net.minecraft.world.storage.WorldInfo spill702_13;
    org.apache.logging.log4j.Logger spill702_14;
    java.lang.String spill702_15;
    java.lang.Object[] spill702_16;
    java.lang.Object[] spill702_17;
    org.apache.logging.log4j.Logger spill702_18;
    java.lang.String spill702_19;
    java.lang.Object[] spill702_20;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    int life4_10;
    java.util.Queue life5_60;
    net.minecraft.world.storage.WorldInfo life5_138;
    net.minecraft.world.storage.WorldInfo life6_143;
    net.minecraft.world.WorldServer[] life7_204;
    int life8_207;
    int life9_209;
    net.minecraft.world.WorldServer life10_216;
    forest_join_206: {
    forest_join_169: {
    forest_join_164: {
    forest_join_163: {
    forest_join_162: {
    forest_join_119: {
    forest_join_116: {
    forest_join_112: {
    forest_join_81: {
    forest_join_73: {
    forest_join_71: {
    forest_join_69: {
    forest_join_46: {
    forest_join_44: {
    forest_join_25: {
    forest_join_24: {
    forest_join_23: {
    forest_join_18: {
    life1_3 = (__fieldRead702_0() ^ 63834359130051L);
    spill702_0 = __call702_1();
    __call702_2(receiver);
    life3_7 = spill702_0;
    life4_10 = __integerCategory702_4(__fieldRead702_3(receiver));
    spill702_1 = receiver;
    spill702_2 = __call702_5();
    if (!((life3_7 == null))) {
        forestValue702_18_0 = spill702_1;
        forestValue702_18_1 = spill702_2;
        break forest_join_18;
    }
    if (!((__call702_6(spill702_2) != null))) {
        forestValue702_24_0 = spill702_1;
        break forest_join_24;
    }
    forestValue702_18_0 = spill702_1;
    forestValue702_18_1 = __call702_7();
    }
    spill702_3 = __call702_8(forestValue702_18_1);
    if (!((life3_7 == null))) {
        forestValue702_23_0 = forestValue702_18_0;
        forestValue702_23_1 = __integerCategory702_9(spill702_3);
        break forest_join_23;
    }
    if (!(spill702_3)) {
        forestValue702_24_0 = forestValue702_18_0;
        break forest_join_24;
    }
    forestValue702_23_0 = forestValue702_18_0;
    forestValue702_23_1 = 1;
    }
    forestValue702_25_0 = forestValue702_23_0;
    forestValue702_25_1 = forestValue702_23_1;
    break forest_join_25;
    }
    forestValue702_25_0 = forestValue702_24_0;
    forestValue702_25_1 = 0;
    }
    __fieldWrite702_10(forestValue702_25_0, forestValue702_25_1);
    spill702_4 = life4_10;
    if (!((life3_7 == null))) {
        forestValue702_46_0 = spill702_4;
        break forest_join_46;
    }
    if (!((spill702_4 == 0))) {
        break forest_join_44;
    }
    spill702_5 = __fieldRead702_11(receiver);
    if (!((life3_7 == null))) {
        forestValue702_46_0 = __integerCategory702_12(spill702_5);
        break forest_join_46;
    }
    if (!(spill702_5)) {
        break forest_join_44;
    }
    __call702_14(__fieldRead702_13(), "Saving and pausing game...");
    __call702_16(__call702_15(receiver));
    __call702_17(receiver, 0);
    }
    forestValue702_46_0 = __integerCategory702_19(__fieldRead702_18(receiver));
    }
    if (!((life3_7 == null))) {
        forestValue702_81_0 = forestValue702_46_0;
        break forest_join_81;
    }
    if (!((forestValue702_46_0 != 0))) {
        break forest_join_73;
    }
    __monitorEnter702_21((life5_60 = __fieldRead702_20(receiver)));
    forest_cycle_54: while (true) {
    if (!((!__call702_23(__fieldRead702_22(receiver))))) {
        break forest_join_69;
    }
    __call702_28(__cast702_26(__call702_25(__fieldRead702_24(receiver))), __fieldRead702_27());
    if (!((life3_7 == null))) {
        break forest_join_71;
    }
    if (!((life3_7 != null))) {
        continue forest_cycle_54;
    }
    break forest_cycle_54;
    }
    }
    __monitorExit702_29(life5_60);
    }
    if (!((life3_7 != null))) {
        break forest_join_206;
    }
    }
    __call702_30(receiver);
    spill702_6 = __fieldRead702_31(receiver);
    if (!((life3_7 == null))) {
        forestValue702_116_0 = spill702_6;
        break forest_join_116;
    }
    forestValue702_81_0 = __fieldRead702_33(__fieldRead702_32(spill702_6));
    }
    if (!((forestValue702_81_0 != __call702_35(__call702_34(receiver))))) {
        break forest_join_112;
    }
    spill702_7 = __fieldRead702_36();
    spill702_8 = "Changing view distance to {}, from {}";
    java.lang.Object[] __stackOp702_37_0 = new java.lang.Object[2];
    spill702_9 = __stackOp702_37_0;
    (__stackOp702_37_0)[0] = __call702_41(__fieldRead702_40(__fieldRead702_39(__fieldRead702_38(receiver))));
    java.lang.Object[] __stackOp702_42_0 = spill702_9;
    spill702_10 = __stackOp702_42_0;
    (__stackOp702_42_0)[1] = __call702_45(__call702_44(__call702_43(receiver)));
    __call702_46(spill702_7, spill702_8, spill702_10);
    __call702_51(__call702_47(receiver), __fieldRead702_50(__fieldRead702_49(__fieldRead702_48(receiver))));
    }
    spill702_11 = receiver;
    if (!((life3_7 == null))) {
        forestValue702_119_0 = spill702_11;
        break forest_join_119;
    }
    forestValue702_116_0 = __fieldRead702_52(spill702_11);
    }
    if (!((__fieldRead702_53(forestValue702_116_0) != null))) {
        break forest_join_206;
    }
    forestValue702_119_0 = receiver;
    }
    life5_138 = __call702_55((__fieldRead702_54(forestValue702_119_0))[0]);
    life6_143 = __call702_58(__fieldRead702_57(__fieldRead702_56(receiver)));
    spill702_12 = __call702_59(life5_138);
    if (!((life3_7 == null))) {
        forestValue702_164_0 = __integerCategory702_60(spill702_12);
        break forest_join_164;
    }
    if (!((!spill702_12))) {
        break forest_join_162;
    }
    spill702_13 = life6_143;
    if (!((life3_7 == null))) {
        forestValue702_163_0 = spill702_13;
        break forest_join_163;
    }
    if (!((__call702_61(spill702_13) != __call702_62(life5_138)))) {
        break forest_join_162;
    }
    spill702_14 = __fieldRead702_63();
    spill702_15 = "Changing difficulty to {}, from {}";
    java.lang.Object[] __stackOp702_64_0 = new java.lang.Object[2];
    spill702_16 = __stackOp702_64_0;
    (__stackOp702_64_0)[0] = __call702_65(life6_143);
    java.lang.Object[] __stackOp702_66_0 = spill702_16;
    spill702_17 = __stackOp702_66_0;
    (__stackOp702_66_0)[1] = __call702_67(life5_138);
    __call702_68(spill702_14, spill702_15, spill702_17);
    __call702_70(receiver, __call702_69(life6_143));
    if (!((life3_7 != null))) {
        break forest_join_206;
    }
    }
    forestValue702_163_0 = life6_143;
    }
    forestValue702_164_0 = __integerCategory702_72(__call702_71(forestValue702_163_0));
    }
    if (!((life3_7 == null))) {
        forestValue702_169_0 = forestValue702_164_0;
        break forest_join_169;
    }
    if (!((forestValue702_164_0 != 0))) {
        break forest_join_206;
    }
    forestValue702_169_0 = __integerCategory702_74(__call702_73(life5_138));
    }
    if (!((forestValue702_169_0 == 0))) {
        break forest_join_206;
    }
    spill702_18 = __fieldRead702_75();
    spill702_19 = "Locking difficulty to {}";
    java.lang.Object[] __stackOp702_76_0 = new java.lang.Object[1];
    spill702_20 = __stackOp702_76_0;
    (__stackOp702_76_0)[0] = __call702_77(life6_143);
    __call702_78(spill702_18, spill702_19, spill702_20);
    life7_204 = __fieldRead702_79(receiver);
    life8_207 = (life7_204).length;
    life9_209 = 0;
    forest_cycle_188: while (true) {
    forest_join_204: {
    forest_join_203: {
    if (!((life9_209 < life8_207))) {
        break forest_join_206;
    }
    life10_216 = (life7_204)[life9_209];
    if (!((life3_7 == null))) {
        break forest_join_204;
    }
    if (!((life10_216 != null))) {
        break forest_join_203;
    }
    __call702_81(__call702_80(life10_216), 1);
    }
    life9_209 += 1;
    }
    if (!((life3_7 != null))) {
        continue forest_cycle_188;
    }
    break forest_cycle_188;
    }
    }
    return;
}
public static void h702_0(moom.Oo p0) throws Throwable {
    throw __call3070200_0(p0);
}
public static void h702_1(moom.Oo p0) throws Throwable {
    throw __call3070201_0(p0);
}
public static void h702_2(moom.Oo p0) throws Throwable {
    throw __call3070202_0(p0);
}
public static void h702_3(moom.Oo p0) throws Throwable {
    throw __call3070203_0(p0);
}
public static void h702_4(moom.Oo p0) throws Throwable {
    throw __call3070204_0(p0);
}
public static void h702_5(moom.Oo p0) throws Throwable {
    throw __call3070205_0(p0);
}
public static void h702_6(moom.Oo p0) throws Throwable {
    throw __call3070206_0(p0);
}
public static void h702_7(moom.Oo p0) throws Throwable {
    throw __call3070207_0(p0);
}
public static void h702_8(moom.Oo p0) throws Throwable {
    throw __call3070208_0(p0);
}
public static void h702_9(java.lang.Throwable p0, java.util.Queue p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3070209_0(p1);
    throw life2_2;
}
public static void h702_10(moom.Oo p0) throws Throwable {
    throw __call3070210_0(p0);
}
public static void h702_11(moom.Oo p0) throws Throwable {
    throw __call3070211_0(p0);
}
public static void h702_12(moom.Oo p0) throws Throwable {
    throw __call3070212_0(p0);
}
public static void h702_13(moom.Oo p0) throws Throwable {
    throw __call3070213_0(p0);
}
public static void h702_14(moom.Oo p0) throws Throwable {
    throw __call3070214_0(p0);
}
public static void h702_15(moom.Oo p0) throws Throwable {
    throw __call3070215_0(p0);
}
public static void h702_16(moom.Oo p0) throws Throwable {
    throw __call3070216_0(p0);
}
public static void h702_17(moom.Oo p0) throws Throwable {
    throw __call3070217_0(p0);
}
public static void h702_18(moom.Oo p0) throws Throwable {
    throw __call3070218_0(p0);
}
public static void h702_19(moom.Oo p0) throws Throwable {
    throw __call3070219_0(p0);
}
public static void h702_20(moom.Oo p0) throws Throwable {
    throw __call3070220_0(p0);
}
public static void h702_21(moom.Oo p0) throws Throwable {
    throw __call3070221_0(p0);
}
public static void h702_22(moom.Oo p0) throws Throwable {
    throw __call3070222_0(p0);
}
public static void h702_23(moom.Oo p0) throws Throwable {
    throw __call3070223_0(p0);
}
private static native long __fieldRead702_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call702_1() throws Throwable;
private static native void __call702_2(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native boolean __fieldRead702_3(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native int __integerCategory702_4(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __call702_5() throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __call702_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call702_7() throws Throwable;
private static native boolean __call702_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory702_9(boolean value) throws Throwable;
private static native void __fieldWrite702_10(net.minecraft.server.integrated.IntegratedServer a0, int a1) throws Throwable;
private static native boolean __fieldRead702_11(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native int __integerCategory702_12(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead702_13() throws Throwable;
private static native void __call702_14(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call702_15(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __call702_16(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native void __call702_17(net.minecraft.server.integrated.IntegratedServer a0, int a1) throws Throwable;
private static native boolean __fieldRead702_18(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native int __integerCategory702_19(boolean value) throws Throwable;
private static native java.util.Queue __fieldRead702_20(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __monitorEnter702_21(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead702_22(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native boolean __call702_23(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead702_24(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native java.lang.Object __call702_25(java.util.Queue a0) throws Throwable;
private static native java.util.concurrent.FutureTask __cast702_26(java.lang.Object a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead702_27() throws Throwable;
private static native java.lang.Object __call702_28(java.util.concurrent.FutureTask a0, org.apache.logging.log4j.Logger a1) throws Throwable;
private static native void __monitorExit702_29(java.util.Queue a0) throws Throwable;
private static native void __call702_30(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead702_31(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead702_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead702_33(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call702_34(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native int __call702_35(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead702_36() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead702_38(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead702_39(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead702_40(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Integer __call702_41(int a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call702_43(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native int __call702_44(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.lang.Integer __call702_45(int a0) throws Throwable;
private static native void __call702_46(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call702_47(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead702_48(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead702_49(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead702_50(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call702_51(net.minecraft.server.management.ServerConfigurationManager a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead702_52(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead702_53(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead702_54(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call702_55(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead702_56(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead702_57(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call702_58(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call702_59(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory702_60(boolean value) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call702_61(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call702_62(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead702_63() throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call702_65(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call702_67(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call702_68(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call702_69(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call702_70(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native boolean __call702_71(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory702_72(boolean value) throws Throwable;
private static native boolean __call702_73(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory702_74(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead702_75() throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call702_77(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call702_78(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead702_79(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call702_80(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call702_81(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native java.lang.Exception __call3070200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070208_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3070209_0(java.util.Queue a0) throws Throwable;
private static native java.lang.Exception __call3070210_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070211_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070212_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070213_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070214_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070215_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070216_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070217_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070218_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070219_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070220_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070221_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070222_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3070223_0(moom.Oo a0) throws Throwable;

}


public boolean B() {
return ((((this.ag) ? 1 : 0)) != 0);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.server.integrated.IntegratedServer.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28103;
      if (hb[var3] == null) {
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
         long var5 = gb[var3];
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
         Object[] var9 = (Object[])ib.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               ib.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Bm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         hb[var3] = var15;
      }

      return hb[var3];
}


private void b(net.minecraft.world.WorldServer p0) { __sourceHandlerCall_e8d7085072f4e3917bc2(this, p0); }


public boolean b__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).b__Boolean())) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12152_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Bm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean e__Boolean() {
return ((0) != 0);
}


public boolean s() {
return ((0) != 0);
}


public void c__Void() { __sourceHandlerCall_806a7d6ef24b42bb77e9(this); }


private void c(net.minecraft.world.WorldServer p0) { __sourceHandlerCall_1c709f8ee02c06b4d5a4(this, p0); }


private void n__sourceReturn_da8c82d5d4() {
net.minecraft.entity.Entity[] spill1660_0;
    long life1_3;
    net.minecraft.world.WorldServer[] life4_7;
    int life5_10;
    net.minecraft.entity.Entity[] life3_11;
    int life6_13;
    net.minecraft.world.WorldServer life7_20;
    lexical_join_27: {
    life1_3 = (net.minecraft.server.integrated.IntegratedServer.cb ^ 5676245483764L);
    spill1660_0 = net.minecraft.server.integrated.IntegratedServer.a__Arrayr3();
    life4_7 = this.n;
    life5_10 = (life4_7).length;
    life3_11 = spill1660_0;
    life6_13 = 0;
    lexical_cycle_14: while (true) {
    if (!((life6_13 < life5_10))) {
        break lexical_join_27;
    }
    life7_20 = (life4_7)[life6_13];
    ((net.minecraft.server.integrated.IntegratedServer)(this)).a(((net.minecraft.world.WorldServer)(life7_20)));
    life6_13 += 1;
    if (!((life3_11 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}


public boolean h__Boolean() {
return ((1) != 0);
}


public boolean f__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.EK)(this.ae)).b__Boolean())) != 0);
}


private static long d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.server.integrated.IntegratedServer.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long d(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29762);
    if (((net.minecraft.server.integrated.IntegratedServer.nb)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.server.integrated.IntegratedServer.mb)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.server.integrated.IntegratedServer.ob)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.server.integrated.IntegratedServer.ob)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Bm", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.server.integrated.IntegratedServer.nb)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.server.integrated.IntegratedServer.nb)[life3_8])).longValue();
}


public void d__Void() { __sourceHandlerCall_4e43b7e68c0c0addd6da(this); }


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral12158_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Bm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected boolean d__Boolean() throws java.io.IOException { return __sourceHandlerCall_5c3de9163fa70cd5282a(this); }


public void a(boolean p0) { __sourceHandlerCall_2b91790819bfb35649f2(this, p0); }


public static net.minecraft.entity.Entity[] a__Arrayr3() {
return net.minecraft.server.integrated.IntegratedServer.am;
}


public static void a(net.minecraft.entity.Entity[] p0) {
am = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public java.io.File a__File() {
return ((net.minecraft.client.Minecraft)(this.ad)).h;
}


private void a(net.minecraft.world.WorldServer p0) { __sourceHandlerCall_fa8e1ab0bd5eb4c005e3(this, p0); }


protected moom.qL a__qL() {
return new moom.qM();
}


protected void a(java.lang.String p0, java.lang.String p1, long p2, net.minecraft.world.WorldType p3, java.lang.String p4) { __sourceHandlerCall_39e309b2c830c9ec2631(this, p0, p1, p2, p3, p4); }


public net.minecraft.world.WorldSettings$GameType a__bE() {
return ((moom.EK)(this.ae)).a__bE();
}


public net.minecraft.world.EnumDifficulty a__bB() { return __sourceHandlerCall_0c679a3a3a1d0fbe4801(this); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(net.minecraft.world.WorldSettings$GameType p0) {
((net.minecraft.server.management.ServerConfigurationManager)(((net.minecraft.server.integrated.IntegratedServer)(this)).a__BA())).a(((net.minecraft.world.WorldSettings$GameType)(p0)));
    return;
}


protected void a__Void(moom.qY p0) {
((net.minecraft.client.Minecraft)(this.ad)).a__Void(((moom.qY)(p0)));
    return;
}


public moom.qY a(moom.qY p0) {
p0 = super.a(((moom.qY)(p0)));
    ((moom.qZ)(((moom.qY)(p0)).a__qZ())).a(((java.lang.String)("Type")), ((java.util.concurrent.Callable)(__sourceIntrinsic_e0ab097a5004_originalDynamicSite2038_2())));
    ((moom.qZ)(((moom.qY)(p0)).a__qZ())).a(((java.lang.String)("Is Modded")), ((java.util.concurrent.Callable)(__sourceIntrinsic_e0ab097a5004_originalDynamicSite2038_5(this))));
    return p0;
}


public void a(net.minecraft.world.EnumDifficulty p0) { __sourceHandlerCall_8b0282efdeeb6e754784(this, p0); }


public java.lang.String a(net.minecraft.world.WorldSettings$GameType p0, boolean p1) { return __sourceHandlerCall_aedc824467cd9af72927(this, p0, p1); }


public void a(net.minecraft.profiler.PlayerUsageSnooper p0) {
super.a(((net.minecraft.profiler.PlayerUsageSnooper)(p0)));
    ((net.minecraft.profiler.PlayerUsageSnooper)(p0)).a(((java.lang.String)("snooper_partner")), ((java.lang.Object)(((net.minecraft.profiler.PlayerUsageSnooper)(((net.minecraft.client.Minecraft)(this.ad)).a__A8())).a__String())));
    return;
}


public int a() {
return 4;
}


public moom.Eh a(net.minecraft.world.World p0, moom.DT p1) {
this.aj = ((net.minecraft.world.World)(p0));
    this.ak = ((moom.DT)(p1));
    return this.al;
}


public void m__sourceReturn_da8c82d5d4() {
((net.minecraft.server.integrated.IntegratedServer)(this)).e__Void();
    return;
}


public boolean o() {
return ((0) != 0);
}


public boolean g__Boolean() {
return ((1) != 0);
}


public void g__Void() { __sourceHandlerCall_4ca1082ad6324781d202(this); }


public boolean v() {
return ((1) != 0);
}


private void lambda$initiateShutdown$2() {
net.minecraft.entity.Entity[] spill1659_0;
    long life1_3;
    java.util.Iterator life4_10;
    net.minecraft.entity.Entity[] life3_11;
    net.minecraft.entity.player.EntityPlayerMP life5_18;
    lexical_join_25: {
    life1_3 = (net.minecraft.server.integrated.IntegratedServer.cb ^ 55982695329937L);
    spill1659_0 = net.minecraft.server.integrated.IntegratedServer.a__Arrayr3();
    life4_10 = ((java.util.ArrayList)(com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((net.minecraft.server.management.ServerConfigurationManager)(((net.minecraft.server.integrated.IntegratedServer)(this)).a__BA())).a__List()))))).iterator();
    life3_11 = spill1659_0;
    lexical_cycle_12: while (true) {
    if (!(((java.util.Iterator)(life4_10)).hasNext())) {
        break lexical_join_25;
    }
    life5_18 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life4_10)).next()));
    ((net.minecraft.server.management.ServerConfigurationManager)(((net.minecraft.server.integrated.IntegratedServer)(this)).a__BA())).d(((net.minecraft.entity.player.EntityPlayerMP)(life5_18)));
    if (!((life3_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return;
}


private static java.lang.String lambda$addServerInfoToCrashReport$0() throws java.lang.Exception {
return "Integrated Server (map_client.txt)";
}


private java.lang.String lambda$addServerInfoToCrashReport$1() throws java.lang.Exception {
int forwardValue5586_25_0;
    java.lang.String forwardValue5586_28_0;
    java.lang.String forwardValue5586_35_0;
    net.minecraft.entity.Entity[] spill5586_0;
    boolean spill5586_1;
    java.lang.String spill5586_2;
    long life1_3;
    java.lang.String life4_6;
    net.minecraft.entity.Entity[] life3_7;
    forward_join_35: {
    forward_join_34: {
    forward_join_29: {
    forward_join_28: {
    forward_join_25: {
    forward_join_17: {
    life1_3 = (net.minecraft.server.integrated.IntegratedServer.cb ^ 129153047324690L);
    spill5586_0 = net.minecraft.server.integrated.IntegratedServer.a__Arrayr3();
    life4_6 = moom.fK.a();
    life3_7 = spill5586_0;
    spill5586_1 = ((java.lang.String)(life4_6)).equals(((java.lang.Object)("vanilla")));
    if (!((life3_7 == null))) {
        forwardValue5586_25_0 = ((spill5586_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill5586_1))) {
        break forward_join_17;
    }
    return __sourceIntrinsic_844ce714365c_invokedynamic5586_5(life4_6);
    }
    life4_6 = ((net.minecraft.server.integrated.IntegratedServer)(this)).d__String();
    spill5586_2 = life4_6;
    if (!((life3_7 == null))) {
        forwardValue5586_28_0 = spill5586_2;
        break forward_join_28;
    }
    forwardValue5586_25_0 = ((((java.lang.String)(spill5586_2)).equals(((java.lang.Object)("vanilla")))) ? 1 : 0);
    }
    if (!((forwardValue5586_25_0 == 0))) {
        break forward_join_29;
    }
    forwardValue5586_28_0 = __sourceIntrinsic_844ce714365c_invokedynamic5586_9(life4_6);
    }
    forwardValue5586_35_0 = forwardValue5586_28_0;
    break forward_join_35;
    }
    if (!((((java.lang.Class)(net.minecraft.client.Minecraft.class)).getSigners() == null))) {
        break forward_join_34;
    }
    forwardValue5586_35_0 = "Very likely; Jar signature invalidated";
    break forward_join_35;
    }
    forwardValue5586_35_0 = "Probably not. Jar signature remains and both client + server brands are untouched.";
    }
    return forwardValue5586_35_0;
}


private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_e0ab097a5004_originalDynamicSite2038_2() throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_e0ab097a5004_originalDynamicSite2038_5(net.minecraft.server.integrated.IntegratedServer a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12152_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral12158_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_844ce714365c_invokedynamic5586_5(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_844ce714365c_invokedynamic5586_9(java.lang.String a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
