package net.minecraft.network;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class NetHandlerPlayServer implements moom.y3, net.minecraft.util.ITickable {

private static org.apache.logging.log4j.Logger a;

public net.minecraft.network.NetworkManager b;

private moom.Bl c;

public net.minecraft.entity.player.EntityPlayerMP d;

private int e;

private int f;

private int g;

private boolean h;

private int i;

private long j;

private long k;

private int l;

private int m;

private moom.Dd<java.lang.Short> n;

private double o;

private double p;

private double q;

private boolean r;

private static long s;

private static long[] t;

private static java.lang.Integer[] u;

private static java.util.Map v;

private static long[] w;

private static java.lang.Long[] x;

private static java.util.Map y;

public NetHandlerPlayServer(moom.Bl p0, net.minecraft.network.NetworkManager p1, net.minecraft.entity.player.EntityPlayerMP p2) {
super();
    this.n = ((moom.Dd)(new moom.Dd()));
    this.r = ((boolean)(true));
    this.c = ((moom.Bl)(p0));
    this.b = ((net.minecraft.network.NetworkManager)(p1));
    ((net.minecraft.network.NetworkManager)(p1)).a(((moom.yE)(this)));
    this.d = ((net.minecraft.entity.player.EntityPlayerMP)(p2));
    ((net.minecraft.entity.player.EntityPlayerMP)(p2)).cg = ((net.minecraft.network.NetHandlerPlayServer)(this));
    return;
}


static {
s = ((long)(((moom._a)(moom._c.a(((long)(2376014691226539640L)), ((long)(702499671244392669L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(161120722745163L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (net.minecraft.network.NetHandlerPlayServer.s ^ 131644882987560L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill1350_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1350_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1350_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1350_14 = new byte[8];
    (__sourceSpill1350_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill1350_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation1350_16 = __sourceSpill1350_14;
    ((javax.crypto.Cipher)(__sourceSpill1350_11)).init(((int)(__sourceSpill1350_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1350_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1350_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[13];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "b\032gØ©±@SÄ)\\$¤>ÎZ$Ir=ô?§½þ·ÄBb]pË²\002=Á8\031@\037lqJãG1\020ª±Sæ)÷ÇÍ\025xwWµ?\004§¥+½_ÓÚÍÏàg×\035\013\"\017"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1350_25 = local17_life21;
        int __sourceSpill1350_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1350_25)).substring(((int)(__sourceSpill1350_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1350_30 = local19_life19;
        int __sourceSpill1350_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill1350_33 = new byte[8];
        (__sourceSpill1350_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill1350_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill1350_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill1350_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill1350_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill1350_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill1350_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill1350_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill1350_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill1350_34)).doFinal(((byte[])(__sourceSpill1350_33)));
        (__sourceSpill1350_30)[__sourceSpill1350_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "Î\0342§þK¯5M\023r¸¸î\003ë"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1350_38 = local17_life21;
        int __sourceSpill1350_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1350_38)).substring(((int)(__sourceSpill1350_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1350_43 = local19_life19;
        int __sourceSpill1350_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill1350_46 = new byte[8];
        (__sourceSpill1350_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill1350_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill1350_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill1350_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill1350_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill1350_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill1350_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill1350_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill1350_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill1350_47)).doFinal(((byte[])(__sourceSpill1350_46)));
        (__sourceSpill1350_43)[__sourceSpill1350_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    t = ((long[])(local19_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[13]));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill1350_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1350_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1350_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1350_59 = new byte[8];
    (__sourceSpill1350_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill1350_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation1350_61 = __sourceSpill1350_59;
    ((javax.crypto.Cipher)(__sourceSpill1350_56)).init(((int)(__sourceSpill1350_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1350_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1350_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[4];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "Ö½¾;0ÎHjOï6\177\0160"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1350_70 = local4_life66;
        int __sourceSpill1350_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1350_70)).substring(((int)(__sourceSpill1350_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1350_75 = local6_life64;
        int __sourceSpill1350_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill1350_78 = new byte[8];
        (__sourceSpill1350_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill1350_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill1350_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill1350_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill1350_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill1350_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill1350_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill1350_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill1350_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1350_79)).doFinal(((byte[])(__sourceSpill1350_78)));
        (__sourceSpill1350_75)[__sourceSpill1350_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    local5_life68 = ((java.lang.String)((local4_life66 = "GÉV\034áÉÏÕ« êúD"))).length();
    local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1350_83 = local4_life66;
        int __sourceSpill1350_84 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill1350_83)).substring(((int)(__sourceSpill1350_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1350_88 = local6_life64;
        int __sourceSpill1350_89 = local3_life65;
        local3_life65 += 1;
        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));
        byte[] __sourceSpill1350_91 = new byte[8];
        (__sourceSpill1350_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));
        (__sourceSpill1350_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));
        (__sourceSpill1350_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));
        (__sourceSpill1350_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));
        (__sourceSpill1350_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));
        (__sourceSpill1350_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));
        (__sourceSpill1350_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));
        (__sourceSpill1350_91)[7] = ((byte) ((int) local8_life90));
        javax.crypto.Cipher __sourceSpill1350_92 = local0_life54;
        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill1350_92)).doFinal(((byte[])(__sourceSpill1350_91)));
        (__sourceSpill1350_88)[__sourceSpill1350_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    w = ((long[])(local6_life64));
    x = ((java.lang.Long[])(new java.lang.Long[4]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_8662032e8a22ac444ff9(net.minecraft.network.NetHandlerPlayServer a0, double a1, double a2, double a3, float a4, float a5, java.util.Set a6) throws E;
private static final class __SourceHandler_8662032e8a22ac444ff9 {

public static void f266(net.minecraft.network.NetHandlerPlayServer receiver, double p0, double p1, double p2, float p3, float p4, java.util.Set p5) throws Throwable {
    int forwardValue266_35_0;
    int forwardValue266_49_0;
    int forwardValue266_77_0;
    java.lang.String spill266_0;
    boolean spill266_1;
    boolean spill266_2;
    long life10_3;
    java.lang.String life12_8;
    float life13_74;
    float life14_76;
    forward_join_112: {
    forward_join_84: {
    forward_join_77: {
    forward_join_74: {
    forward_join_58: {
    forward_join_49: {
    forward_join_46: {
    forward_join_35: {
    forward_join_32: {
    life10_3 = (__fieldRead266_0() ^ 79488981342105L);
    spill266_0 = __call266_1();
    __fieldWrite266_2(receiver, 0);
    life12_8 = spill266_0;
    __fieldWrite266_3(receiver, p0);
    __fieldWrite266_4(receiver, p1);
    __fieldWrite266_5(receiver, p2);
    spill266_1 = __call266_7(p5, __fieldRead266_6());
    if (!((life12_8 == null))) {
        forwardValue266_35_0 = __integerCategory266_8(spill266_1);
        break forward_join_35;
    }
    if (!(spill266_1)) {
        break forward_join_32;
    }
    net.minecraft.network.NetHandlerPlayServer __stackOp266_9_0 = receiver;
    __fieldWrite266_13(__stackOp266_9_0, (__fieldRead266_10(__stackOp266_9_0) + __fieldRead266_12(__fieldRead266_11(receiver))));
    }
    forwardValue266_35_0 = __integerCategory266_16(__call266_15(p5, __fieldRead266_14()));
    }
    if (!((life12_8 == null))) {
        forwardValue266_49_0 = forwardValue266_35_0;
        break forward_join_49;
    }
    if (!((forwardValue266_35_0 != 0))) {
        break forward_join_46;
    }
    net.minecraft.network.NetHandlerPlayServer __stackOp266_17_0 = receiver;
    __fieldWrite266_21(__stackOp266_17_0, (__fieldRead266_18(__stackOp266_17_0) + __fieldRead266_20(__fieldRead266_19(receiver))));
    }
    forwardValue266_49_0 = __integerCategory266_24(__call266_23(p5, __fieldRead266_22()));
    }
    if (!((forwardValue266_49_0 != 0))) {
        break forward_join_58;
    }
    net.minecraft.network.NetHandlerPlayServer __stackOp266_25_0 = receiver;
    __fieldWrite266_29(__stackOp266_25_0, (__fieldRead266_26(__stackOp266_25_0) + __fieldRead266_28(__fieldRead266_27(receiver))));
    }
    life13_74 = p3;
    life14_76 = p4;
    spill266_2 = __call266_31(p5, __fieldRead266_30());
    if (!((life12_8 == null))) {
        forwardValue266_77_0 = __integerCategory266_32(spill266_2);
        break forward_join_77;
    }
    if (!(spill266_2)) {
        break forward_join_74;
    }
    life13_74 = (p3 + __fieldRead266_34(__fieldRead266_33(receiver)));
    }
    forwardValue266_77_0 = __integerCategory266_37(__call266_36(p5, __fieldRead266_35()));
    }
    if (!((forwardValue266_77_0 != 0))) {
        break forward_join_84;
    }
    life14_76 = (p4 + __fieldRead266_39(__fieldRead266_38(receiver)));
    }
    __call266_44(__fieldRead266_40(receiver), __fieldRead266_41(receiver), __fieldRead266_42(receiver), __fieldRead266_43(receiver), life13_74, life14_76);
    __call266_47(__fieldRead266_46(__fieldRead266_45(receiver)), new moom.zB(p0, p1, p2, p3, p4, p5));
    if (!((__call266_48() != null))) {
        break forward_join_112;
    }
    __call266_49("LXCtD");
    }
    return;
}
public static void h266_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026600_0(p0);
}
public static void h266_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026601_0(p0);
}
public static void h266_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026602_0(p0);
}
public static void h266_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026603_0(p0);
}
public static void h266_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026604_0(p0);
}
public static void h266_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026605_0(p0);
}
public static void h266_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026606_0(p0);
}
private static native long __fieldRead266_0() throws Throwable;
private static native java.lang.String __call266_1() throws Throwable;
private static native void __fieldWrite266_2(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native void __fieldWrite266_3(net.minecraft.network.NetHandlerPlayServer a0, double a1) throws Throwable;
private static native void __fieldWrite266_4(net.minecraft.network.NetHandlerPlayServer a0, double a1) throws Throwable;
private static native void __fieldWrite266_5(net.minecraft.network.NetHandlerPlayServer a0, double a1) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead266_6() throws Throwable;
private static native boolean __call266_7(java.util.Set a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native int __integerCategory266_8(boolean value) throws Throwable;
private static native double __fieldRead266_10(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead266_11(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead266_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite266_13(net.minecraft.network.NetHandlerPlayServer a0, double a1) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead266_14() throws Throwable;
private static native boolean __call266_15(java.util.Set a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native int __integerCategory266_16(boolean value) throws Throwable;
private static native double __fieldRead266_18(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead266_19(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead266_20(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite266_21(net.minecraft.network.NetHandlerPlayServer a0, double a1) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead266_22() throws Throwable;
private static native boolean __call266_23(java.util.Set a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native int __integerCategory266_24(boolean value) throws Throwable;
private static native double __fieldRead266_26(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead266_27(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead266_28(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite266_29(net.minecraft.network.NetHandlerPlayServer a0, double a1) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead266_30() throws Throwable;
private static native boolean __call266_31(java.util.Set a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native int __integerCategory266_32(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead266_33(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead266_34(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead266_35() throws Throwable;
private static native boolean __call266_36(java.util.Set a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native int __integerCategory266_37(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead266_38(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead266_39(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead266_40(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead266_41(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead266_42(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead266_43(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call266_44(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead266_45(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead266_46(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call266_47(net.minecraft.network.NetHandlerPlayServer a0, moom.zB a1) throws Throwable;
private static native java.lang.String[] __call266_48() throws Throwable;
private static native void __call266_49(java.lang.String a0) throws Throwable;
private static native java.lang.Throwable __call1026600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026601_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026602_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026603_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026604_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026605_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026606_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a0320019adfedf51c475(net.minecraft.network.NetHandlerPlayServer a0, moom.y4 a1) throws E;
private static final class __SourceHandler_a0320019adfedf51c475 {

public static void f1628(net.minecraft.network.NetHandlerPlayServer receiver, moom.y4 p0) throws Throwable {
    int forwardValue1628_19_0;
    int spill1628_0;
    long life2_3;
    java.lang.String life4_5;
    int life5_25;
    forward_join_32: {
    forward_join_19: {
    life2_3 = (__fieldRead1628_0() ^ 121160373578829L);
    life4_5 = __call1628_1();
    spill1628_0 = __call1628_2(p0);
    if (!((life4_5 == null))) {
        forwardValue1628_19_0 = spill1628_0;
        break forward_join_19;
    }
    if (!((spill1628_0 == __fieldRead1628_3(receiver)))) {
        break forward_join_32;
    }
    forwardValue1628_19_0 = ((int) (__call1628_4(receiver) - __fieldRead1628_5(receiver)));
    }
    life5_25 = forwardValue1628_19_0;
    __fieldWrite1628_9(__fieldRead1628_6(receiver), (((__fieldRead1628_8(__fieldRead1628_7(receiver)) * 3) + life5_25) / 4));
    }
    return;
}
public static void h1628_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1162800_0(p0);
}
public static void h1628_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1162801_0(p0);
}
private static native long __fieldRead1628_0() throws Throwable;
private static native java.lang.String __call1628_1() throws Throwable;
private static native int __call1628_2(moom.y4 a0) throws Throwable;
private static native int __fieldRead1628_3(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native long __call1628_4(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native long __fieldRead1628_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1628_6(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1628_7(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __fieldRead1628_8(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite1628_9(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1162800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1162801_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_17c36717c49bbf4b0cce(net.minecraft.network.NetHandlerPlayServer a0, moom.y5 a1) throws E;
private static final class __SourceHandler_17c36717c49bbf4b0cce {

public static void f72(net.minecraft.network.NetHandlerPlayServer receiver, moom.y5 p0) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP lexicalValue72_41_0;
    int lexicalValue72_71_0;
    int lexicalValue72_129_0;
    net.minecraft.network.NetHandlerPlayServer lexicalValue72_131_0;
    java.lang.String spill72_0;
    net.minecraft.entity.player.EntityPlayerMP spill72_1;
    boolean spill72_2;
    int spill72_3;
    net.minecraft.network.NetHandlerPlayServer spill72_4;
    long life2_3;
    java.lang.String life4_11;
    moom.CN life5_28;
    java.lang.String life5_50;
    java.lang.String life5_53;
    int life6_55;
    moom.CN life6_107;
    lexical_join_133: {
    lexical_join_131: {
    lexical_join_129: {
    lexical_join_100: {
    lexical_join_77: {
    lexical_join_71: {
    lexical_join_68: {
    lexical_join_41: {
    lexical_join_39: {
    life2_3 = (__fieldRead72_0() ^ 89167094746793L);
    spill72_0 = __call72_1();
    __call72_4(p0, receiver, __call72_3(__fieldRead72_2(receiver)));
    life4_11 = spill72_0;
    spill72_1 = __fieldRead72_5(receiver);
    if (!((life4_11 == null))) {
        lexicalValue72_41_0 = spill72_1;
        break lexical_join_41;
    }
    if (!((__call72_6(spill72_1) == __fieldRead72_7()))) {
        break lexical_join_39;
    }
    life5_28 = new moom.CN("chat.cannotSend", new java.lang.Object[0]);
    __call72_10(__call72_8(life5_28), __fieldRead72_9());
    __call72_11(receiver, new moom.zv(life5_28));
    if (!((life4_11 != null))) {
        break lexical_join_133;
    }
    }
    lexicalValue72_41_0 = __fieldRead72_12(receiver);
    }
    __call72_13(lexicalValue72_41_0);
    life5_50 = __call72_14(p0);
    life5_53 = __call72_15(life5_50);
    life6_55 = 0;
    lexical_cycle_50: while (true) {
    lexical_join_65: {
    if (!((life6_55 < __call72_16(life5_53)))) {
        break lexical_join_68;
    }
    spill72_2 = __call72_18(__call72_17(life5_53, life6_55));
    if (!((life4_11 == null))) {
        lexicalValue72_71_0 = __integerCategory72_19(spill72_2);
        break lexical_join_71;
    }
    if (!((!spill72_2))) {
        break lexical_join_65;
    }
    __call72_20(receiver, "Illegal characters in chat");
    return;
    }
    life6_55 += 1;
    if (!((life4_11 != null))) { continue lexical_cycle_50; }
    break lexical_cycle_50;
    }
    }
    lexicalValue72_71_0 = __integerCategory72_22(__call72_21(life5_53, "/"));
    }
    if (!((lexicalValue72_71_0 != 0))) {
        break lexical_join_77;
    }
    __call72_23(receiver, life5_53);
    if (!((life4_11 != null))) {
        break lexical_join_100;
    }
    }
    life6_107 = new moom.CN("chat.type.text", new java.lang.Object[] {__call72_25(__fieldRead72_24(receiver)), life5_53});
    __call72_28(__call72_27(__fieldRead72_26(receiver)), life6_107, 0);
    }
    net.minecraft.network.NetHandlerPlayServer __stackOp72_29_0 = receiver;
    __fieldWrite72_32(__stackOp72_29_0, (__fieldRead72_30(__stackOp72_29_0) + __invokedynamic72_31(24748, (6393153324096045377L ^ life2_3))));
    spill72_3 = __fieldRead72_33(receiver);
    if (!((life4_11 == null))) {
        lexicalValue72_129_0 = spill72_3;
        break lexical_join_129;
    }
    if (!((spill72_3 > __invokedynamic72_34(19863, (1004436890282683505L ^ life2_3))))) {
        break lexical_join_133;
    }
    spill72_4 = receiver;
    if (!((life4_11 == null))) {
        lexicalValue72_131_0 = spill72_4;
        break lexical_join_131;
    }
    lexicalValue72_129_0 = __integerCategory72_40(__call72_39(__call72_36(__fieldRead72_35(spill72_4)), __call72_38(__fieldRead72_37(receiver))));
    }
    if (!((lexicalValue72_129_0 == 0))) {
        break lexical_join_133;
    }
    lexicalValue72_131_0 = receiver;
    }
    __call72_41(lexicalValue72_131_0, "disconnect.spam");
    }
    return;
}
public static void h72_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3007200_0(p0);
}
public static void h72_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3007201_0(p0);
}
public static void h72_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3007202_0(p0);
}
public static void h72_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3007203_0(p0);
}
public static void h72_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3007204_0(p0);
}
public static void h72_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3007205_0(p0);
}
public static void h72_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3007206_0(p0);
}
public static void h72_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3007207_0(p0);
}
private static native long __fieldRead72_0() throws Throwable;
private static native java.lang.String __call72_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead72_2(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call72_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call72_4(moom.y5 a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead72_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer$EnumChatVisibility __call72_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer$EnumChatVisibility __fieldRead72_7() throws Throwable;
private static native moom.CO __call72_8(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead72_9() throws Throwable;
private static native moom.CO __call72_10(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native void __call72_11(net.minecraft.network.NetHandlerPlayServer a0, moom.zv a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead72_12(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call72_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __call72_14(moom.y5 a0) throws Throwable;
private static native java.lang.String __call72_15(java.lang.String a0) throws Throwable;
private static native int __call72_16(java.lang.String a0) throws Throwable;
private static native char __call72_17(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call72_18(char a0) throws Throwable;
private static native int __integerCategory72_19(boolean value) throws Throwable;
private static native void __call72_20(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native boolean __call72_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory72_22(boolean value) throws Throwable;
private static native void __call72_23(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead72_24(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call72_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.Bl __fieldRead72_26(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call72_27(moom.Bl a0) throws Throwable;
private static native void __call72_28(net.minecraft.server.management.ServerConfigurationManager a0, moom.CN a1, int a2) throws Throwable;
private static native int __fieldRead72_30(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __invokedynamic72_31(int a0, long a1) throws Throwable;
private static native void __fieldWrite72_32(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native int __fieldRead72_33(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __invokedynamic72_34(int a0, long a1) throws Throwable;
private static native moom.Bl __fieldRead72_35(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call72_36(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead72_37(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call72_38(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call72_39(net.minecraft.server.management.ServerConfigurationManager a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native int __integerCategory72_40(boolean value) throws Throwable;
private static native void __call72_41(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3007200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3007201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3007202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3007203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3007204_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3007205_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3007206_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3007207_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c03a232f956e2daf02d0(net.minecraft.network.NetHandlerPlayServer a0, moom.y6 a1) throws E;
private static final class __SourceHandler_c03a232f956e2daf02d0 {

public static void f1630(net.minecraft.network.NetHandlerPlayServer receiver, moom.y6 p0) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP forwardValue1630_32_0;
    int forwardValue1630_49_0;
    net.minecraft.network.play.client.C02PacketUseEntity$Action forwardValue1630_66_0;
    net.minecraft.network.play.client.C02PacketUseEntity$Action forwardValue1630_66_1;
    net.minecraft.network.play.client.C02PacketUseEntity$Action forwardValue1630_81_0;
    net.minecraft.network.play.client.C02PacketUseEntity$Action forwardValue1630_81_1;
    int forwardValue1630_89_0;
    int forwardValue1630_96_0;
    net.minecraft.entity.Entity forwardValue1630_98_0;
    java.lang.String spill1630_0;
    net.minecraft.entity.player.EntityPlayerMP spill1630_1;
    int spill1630_2;
    net.minecraft.network.play.client.C02PacketUseEntity$Action spill1630_3;
    net.minecraft.network.play.client.C02PacketUseEntity$Action spill1630_4;
    int spill1630_5;
    net.minecraft.entity.Entity spill1630_6;
    long life2_3;
    net.minecraft.world.WorldServer life5_17;
    java.lang.String life4_18;
    net.minecraft.entity.Entity life6_22;
    int life7_40;
    double life8_42;
    forward_join_116: {
    forward_join_112: {
    forward_join_101: {
    forward_join_98: {
    forward_join_96: {
    forward_join_89: {
    forward_join_81: {
    forward_join_78: {
    forward_join_66: {
    forward_join_63: {
    forward_join_49: {
    forward_join_43: {
    forward_join_32: {
    life2_3 = (__fieldRead1630_0() ^ 101387782887530L);
    spill1630_0 = __call1630_1();
    __call1630_4(p0, receiver, __call1630_3(__fieldRead1630_2(receiver)));
    life5_17 = __call1630_8(__fieldRead1630_5(receiver), __fieldRead1630_7(__fieldRead1630_6(receiver)));
    life4_18 = spill1630_0;
    life6_22 = __call1630_9(p0, life5_17);
    spill1630_1 = __fieldRead1630_10(receiver);
    if (!((life4_18 == null))) {
        forwardValue1630_32_0 = spill1630_1;
        break forward_join_32;
    }
    __call1630_11(spill1630_1);
    if (!((life6_22 != null))) {
        break forward_join_116;
    }
    forwardValue1630_32_0 = __fieldRead1630_12(receiver);
    }
    life7_40 = __integerCategory1630_14(__call1630_13(forwardValue1630_32_0, life6_22));
    life8_42 = 0x1.2p5d;
    spill1630_2 = life7_40;
    if (!((life4_18 == null))) {
        forwardValue1630_49_0 = spill1630_2;
        break forward_join_49;
    }
    if (!((spill1630_2 == 0))) {
        break forward_join_43;
    }
    life8_42 = 0x1.2p3d;
    }
    forwardValue1630_49_0 = __numericCompare1630_17(__call1630_16(__fieldRead1630_15(receiver), life6_22), life8_42);
    }
    if (!((forwardValue1630_49_0 < 0))) {
        break forward_join_116;
    }
    spill1630_3 = __call1630_18(p0);
    spill1630_4 = __fieldRead1630_19();
    if (!((life4_18 == null))) {
        forwardValue1630_66_0 = spill1630_3;
        forwardValue1630_66_1 = spill1630_4;
        break forward_join_66;
    }
    if (!((spill1630_3 == spill1630_4))) {
        break forward_join_63;
    }
    __call1630_21(__fieldRead1630_20(receiver), life6_22);
    if (!((life4_18 != null))) {
        break forward_join_116;
    }
    }
    forwardValue1630_66_0 = __call1630_22(p0);
    forwardValue1630_66_1 = __fieldRead1630_23();
    }
    if (!((life4_18 == null))) {
        forwardValue1630_81_0 = forwardValue1630_66_0;
        forwardValue1630_81_1 = forwardValue1630_66_1;
        break forward_join_81;
    }
    if (!((forwardValue1630_66_0 == forwardValue1630_66_1))) {
        break forward_join_78;
    }
    __call1630_26(life6_22, __fieldRead1630_24(receiver), __call1630_25(p0));
    if (!((life4_18 != null))) {
        break forward_join_116;
    }
    }
    forwardValue1630_81_0 = __call1630_27(p0);
    forwardValue1630_81_1 = __fieldRead1630_28();
    }
    if (!((forwardValue1630_81_0 == forwardValue1630_81_1))) {
        break forward_join_116;
    }
    spill1630_5 = __instanceOf1630_29(life6_22);
    if (!((life4_18 == null))) {
        forwardValue1630_89_0 = spill1630_5;
        break forward_join_89;
    }
    if (!((spill1630_5 == 0))) {
        break forward_join_101;
    }
    forwardValue1630_89_0 = __instanceOf1630_30(life6_22);
    }
    if (!((life4_18 == null))) {
        forwardValue1630_96_0 = forwardValue1630_89_0;
        break forward_join_96;
    }
    if (!((forwardValue1630_89_0 == 0))) {
        break forward_join_101;
    }
    spill1630_6 = life6_22;
    if (!((life4_18 == null))) {
        forwardValue1630_98_0 = spill1630_6;
        break forward_join_98;
    }
    forwardValue1630_96_0 = __instanceOf1630_31(spill1630_6);
    }
    if (!((forwardValue1630_96_0 == 0))) {
        break forward_join_101;
    }
    forwardValue1630_98_0 = life6_22;
    }
    if (!((forwardValue1630_98_0 == __fieldRead1630_32(receiver)))) {
        break forward_join_112;
    }
    }
    __call1630_33(receiver, "Attempting to attack an invalid entity");
    __call1630_38(__fieldRead1630_34(receiver), __invokedynamic1630_37(__call1630_36(__fieldRead1630_35(receiver))));
    return;
    }
    __call1630_40(__fieldRead1630_39(receiver), life6_22);
    }
    return;
}
public static void h1630_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163000_0(p0);
}
public static void h1630_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163001_0(p0);
}
public static void h1630_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163002_0(p0);
}
public static void h1630_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163003_0(p0);
}
public static void h1630_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163004_0(p0);
}
public static void h1630_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163005_0(p0);
}
public static void h1630_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163006_0(p0);
}
public static void h1630_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163007_0(p0);
}
public static void h1630_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163008_0(p0);
}
public static void h1630_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163009_0(p0);
}
public static void h1630_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163010_0(p0);
}
public static void h1630_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163011_0(p0);
}
public static void h1630_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163012_0(p0);
}
public static void h1630_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163013_0(p0);
}
public static void h1630_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163014_0(p0);
}
public static void h1630_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163015_0(p0);
}
public static void h1630_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163016_0(p0);
}
private static native long __fieldRead1630_0() throws Throwable;
private static native java.lang.String __call1630_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1630_2(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1630_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1630_4(moom.y6 a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native moom.Bl __fieldRead1630_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1630_6(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __fieldRead1630_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1630_8(moom.Bl a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __call1630_9(moom.y6 a0, net.minecraft.world.WorldServer a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1630_10(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1630_11(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1630_12(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call1630_13(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory1630_14(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1630_15(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __call1630_16(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __numericCompare1630_17(double a0, double a1) throws Throwable;
private static native net.minecraft.network.play.client.C02PacketUseEntity$Action __call1630_18(moom.y6 a0) throws Throwable;
private static native net.minecraft.network.play.client.C02PacketUseEntity$Action __fieldRead1630_19() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1630_20(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call1630_21(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.network.play.client.C02PacketUseEntity$Action __call1630_22(moom.y6 a0) throws Throwable;
private static native net.minecraft.network.play.client.C02PacketUseEntity$Action __fieldRead1630_23() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1630_24(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.DR __call1630_25(moom.y6 a0) throws Throwable;
private static native boolean __call1630_26(net.minecraft.entity.Entity a0, net.minecraft.entity.player.EntityPlayerMP a1, moom.DR a2) throws Throwable;
private static native net.minecraft.network.play.client.C02PacketUseEntity$Action __call1630_27(moom.y6 a0) throws Throwable;
private static native net.minecraft.network.play.client.C02PacketUseEntity$Action __fieldRead1630_28() throws Throwable;
private static native int __instanceOf1630_29(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf1630_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf1630_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1630_32(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1630_33(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native moom.Bl __fieldRead1630_34(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1630_35(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call1630_36(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __invokedynamic1630_37(java.lang.String a0) throws Throwable;
private static native void __call1630_38(moom.Bl a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1630_39(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1630_40(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.lang.Throwable __call1163000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163003_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163004_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163005_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163006_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163007_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163008_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163009_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163010_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163011_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163012_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163013_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163014_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163015_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163016_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_af5f4412070147b81bfe(net.minecraft.network.NetHandlerPlayServer a0, moom.y7 a1) throws E;
private static final class __SourceHandler_af5f4412070147b81bfe {

public static void f268(net.minecraft.network.NetHandlerPlayServer receiver, moom.y7 p0) throws Throwable {
    net.minecraft.network.NetHandlerPlayServer forwardValue268_24_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue268_41_0;
    int forwardValue268_104_0;
    net.minecraft.entity.Entity forwardValue268_189_0;
    net.minecraft.network.NetHandlerPlayServer forwardValue268_229_0;
    net.minecraft.network.NetHandlerPlayServer forwardValue268_244_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue268_255_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue268_284_0;
    int forwardValue268_338_0;
    int forwardValue268_372_0;
    int forwardValue268_397_0;
    int forwardValue268_466_0;
    net.minecraft.network.NetHandlerPlayServer forwardValue268_490_0;
    int forwardValue268_570_0;
    double forwardValue268_578_0;
    int forwardValue268_598_0;
    int forwardValue268_657_0;
    int forwardValue268_679_0;
    int forwardValue268_691_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue268_705_0;
    int forwardValue268_740_0;
    int forwardValue268_753_0;
    net.minecraft.network.NetHandlerPlayServer forwardValue268_770_0;
    net.minecraft.network.NetHandlerPlayServer forwardValue268_784_0;
    int forwardValue268_802_0;
    net.minecraft.network.NetHandlerPlayServer forwardValue268_809_0;
    java.lang.String spill268_0;
    net.minecraft.network.NetHandlerPlayServer spill268_1;
    net.minecraft.entity.player.EntityPlayerMP spill268_2;
    boolean spill268_3;
    boolean spill268_4;
    int spill268_5;
    net.minecraft.entity.player.EntityPlayerMP spill268_6;
    net.minecraft.entity.Entity spill268_7;
    net.minecraft.network.NetHandlerPlayServer spill268_8;
    boolean spill268_9;
    int spill268_10;
    int spill268_11;
    int spill268_12;
    net.minecraft.network.NetHandlerPlayServer spill268_13;
    net.minecraft.network.NetHandlerPlayServer spill268_14;
    boolean spill268_15;
    boolean spill268_16;
    int spill268_17;
    double spill268_18;
    int spill268_19;
    int spill268_20;
    boolean spill268_21;
    boolean spill268_22;
    net.minecraft.entity.player.EntityPlayerMP spill268_23;
    int spill268_24;
    int spill268_25;
    net.minecraft.entity.player.EntityPlayerMP spill268_26;
    net.minecraft.network.NetHandlerPlayServer spill268_27;
    net.minecraft.network.NetHandlerPlayServer spill268_28;
    boolean spill268_29;
    net.minecraft.network.NetHandlerPlayServer spill268_30;
    net.minecraft.network.NetHandlerPlayServer spill268_31;
    long life2_3;
    java.lang.String life4_11;
    net.minecraft.world.WorldServer life5_38;
    double life6_57;
    double life8_61;
    double life10_65;
    double life12_67;
    double life14_73;
    double life16_79;
    double life18_85;
    float life20_159;
    float life21_163;
    double life22_171;
    double life24_175;
    double life26_179;
    net.minecraft.entity.Entity life28_251;
    double life20_350;
    double life22_369;
    double life24_373;
    double life26_377;
    float life28_381;
    float life29_385;
    double life30_499;
    double life32_505;
    double life34_511;
    double life36_535;
    double life38_547;
    float life40_618;
    int life41_634;
    double life34_724;
    int life42_738;
    int life43_831;
    moom.CA life43_895;
    forward_join_822: {
    forward_join_809: {
    forward_join_802: {
    forward_join_795: {
    forward_join_784: {
    forward_join_772: {
    forward_join_770: {
    forward_join_769: {
    forward_join_753: {
    forward_join_740: {
    forward_join_705: {
    forward_join_703: {
    forward_join_691: {
    forward_join_686: {
    forward_join_679: {
    forward_join_657: {
    forward_join_626: {
    forward_join_598: {
    forward_join_579: {
    forward_join_578: {
    forward_join_577: {
    forward_join_570: {
    forward_join_542: {
    forward_join_504: {
    forward_join_490: {
    forward_join_477: {
    forward_join_466: {
    forward_join_399: {
    forward_join_397: {
    forward_join_381: {
    forward_join_372: {
    forward_join_370: {
    forward_join_369: {
    forward_join_366: {
    forward_join_338: {
    forward_join_336: {
    forward_join_284: {
    forward_join_282: {
    forward_join_255: {
    forward_join_253: {
    forward_join_248: {
    forward_join_244: {
    forward_join_229: {
    forward_join_228: {
    forward_join_223: {
    forward_join_189: {
    forward_join_178: {
    forward_join_168: {
    forward_join_152: {
    forward_join_104: {
    forward_join_102: {
    forward_join_41: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (__fieldRead268_0() ^ 29511125305372L);
    spill268_0 = __call268_1();
    __call268_4(p0, receiver, __call268_3(__fieldRead268_2(receiver)));
    life4_11 = spill268_0;
    spill268_1 = receiver;
    if (!((life4_11 == null))) {
        forwardValue268_24_0 = spill268_1;
        break forward_join_24;
    }
    if (!(__call268_5(spill268_1, p0))) {
        break forward_join_23;
    }
    __call268_6(receiver, "Invalid move packet received");
    if (!((life4_11 != null))) {
        break forward_join_822;
    }
    }
    forwardValue268_24_0 = receiver;
    }
    life5_38 = __call268_10(__fieldRead268_7(forwardValue268_24_0), __fieldRead268_9(__fieldRead268_8(receiver)));
    __fieldWrite268_11(receiver, 1);
    spill268_2 = __fieldRead268_12(receiver);
    if (!((life4_11 == null))) {
        forwardValue268_41_0 = spill268_2;
        break forward_join_41;
    }
    if (!((!__fieldRead268_13(spill268_2)))) {
        break forward_join_822;
    }
    forwardValue268_41_0 = __fieldRead268_14(receiver);
    }
    life6_57 = __fieldRead268_15(forwardValue268_41_0);
    life8_61 = __fieldRead268_17(__fieldRead268_16(receiver));
    life10_65 = __fieldRead268_19(__fieldRead268_18(receiver));
    life12_67 = 0x0.0p0d;
    life14_73 = (__call268_20(p0) - __fieldRead268_21(receiver));
    life16_79 = (__call268_22(p0) - __fieldRead268_23(receiver));
    life18_85 = (__call268_24(p0) - __fieldRead268_25(receiver));
    spill268_3 = __call268_26(p0);
    if (!((life4_11 == null))) {
        forwardValue268_104_0 = __integerCategory268_27(spill268_3);
        break forward_join_104;
    }
    if (!(spill268_3)) {
        break forward_join_102;
    }
    life12_67 = (((life14_73 * life14_73) + (life16_79 * life16_79)) + (life18_85 * life18_85));
    spill268_4 = __fieldRead268_28(receiver);
    if (!((life4_11 == null))) {
        forwardValue268_104_0 = __integerCategory268_29(spill268_4);
        break forward_join_104;
    }
    if (!((!spill268_4))) {
        break forward_join_102;
    }
    spill268_5 = __numericCompare268_30(life12_67, 0x1.0p-2d);
    if (!((life4_11 == null))) {
        forwardValue268_104_0 = spill268_5;
        break forward_join_104;
    }
    if (!((spill268_5 < 0))) {
        break forward_join_102;
    }
    __fieldWrite268_31(receiver, 1);
    }
    forwardValue268_104_0 = __integerCategory268_33(__fieldRead268_32(receiver));
    }
    if (!((life4_11 == null))) {
        forwardValue268_802_0 = forwardValue268_104_0;
        break forward_join_802;
    }
    if (!((forwardValue268_104_0 != 0))) {
        break forward_join_795;
    }
    __fieldWrite268_35(receiver, __fieldRead268_34(receiver));
    spill268_6 = __fieldRead268_36(receiver);
    if (!((life4_11 == null))) {
        forwardValue268_255_0 = spill268_6;
        break forward_join_255;
    }
    if (!((__fieldRead268_37(spill268_6) != null))) {
        break forward_join_253;
    }
    life20_159 = __fieldRead268_39(__fieldRead268_38(receiver));
    life21_163 = __fieldRead268_41(__fieldRead268_40(receiver));
    __call268_44(__fieldRead268_43(__fieldRead268_42(receiver)));
    life22_171 = __fieldRead268_46(__fieldRead268_45(receiver));
    life24_175 = __fieldRead268_48(__fieldRead268_47(receiver));
    life26_179 = __fieldRead268_50(__fieldRead268_49(receiver));
    if (!((life4_11 == null))) {
        break forward_join_168;
    }
    if (!(__call268_51(p0))) {
        break forward_join_152;
    }
    life20_159 = __call268_52(p0);
    life21_163 = __call268_53(p0);
    }
    __fieldWrite268_56(__fieldRead268_54(receiver), __call268_55(p0));
    __call268_58(__fieldRead268_57(receiver));
    __call268_60(__fieldRead268_59(receiver), life22_171, life24_175, life26_179, life20_159, life21_163);
    }
    spill268_7 = __fieldRead268_62(__fieldRead268_61(receiver));
    if (!((life4_11 == null))) {
        forwardValue268_189_0 = spill268_7;
        break forward_join_189;
    }
    if (!((spill268_7 != null))) {
        break forward_join_178;
    }
    __call268_65(__fieldRead268_64(__fieldRead268_63(receiver)));
    }
    __call268_69(__call268_67(__fieldRead268_66(receiver)), __fieldRead268_68(receiver));
    spill268_8 = receiver;
    if (!((life4_11 == null))) {
        forwardValue268_229_0 = spill268_8;
        break forward_join_229;
    }
    forwardValue268_189_0 = __fieldRead268_71(__fieldRead268_70(spill268_8));
    }
    if (!((forwardValue268_189_0 != null))) {
        break forward_join_228;
    }
    if (!((__numericCompare268_72(life12_67, 0x1.0p2d) > 0))) {
        break forward_join_223;
    }
    life28_251 = __fieldRead268_74(__fieldRead268_73(receiver));
    __call268_77(__fieldRead268_76(__fieldRead268_75(receiver)), new moom.zR(life28_251));
    __call268_88(receiver, __fieldRead268_79(__fieldRead268_78(receiver)), __fieldRead268_81(__fieldRead268_80(receiver)), __fieldRead268_83(__fieldRead268_82(receiver)), __fieldRead268_85(__fieldRead268_84(receiver)), __fieldRead268_87(__fieldRead268_86(receiver)));
    }
    __fieldWrite268_91(__fieldRead268_90(__fieldRead268_89(receiver)), 1);
    }
    forwardValue268_229_0 = receiver;
    }
    if (!((life4_11 == null))) {
        forwardValue268_244_0 = forwardValue268_229_0;
        break forward_join_244;
    }
    if (!(__fieldRead268_92(forwardValue268_229_0))) {
        break forward_join_248;
    }
    __fieldWrite268_95(receiver, __fieldRead268_94(__fieldRead268_93(receiver)));
    __fieldWrite268_98(receiver, __fieldRead268_97(__fieldRead268_96(receiver)));
    forwardValue268_244_0 = receiver;
    }
    __fieldWrite268_101(forwardValue268_244_0, __fieldRead268_100(__fieldRead268_99(receiver)));
    }
    __call268_103(life5_38, __fieldRead268_102(receiver));
    return;
    }
    forwardValue268_255_0 = __fieldRead268_104(receiver);
    }
    if (!((life4_11 == null))) {
        forwardValue268_284_0 = forwardValue268_255_0;
        break forward_join_284;
    }
    if (!(__call268_105(forwardValue268_255_0))) {
        break forward_join_282;
    }
    __call268_107(__fieldRead268_106(receiver));
    __call268_116(__fieldRead268_108(receiver), __fieldRead268_109(receiver), __fieldRead268_110(receiver), __fieldRead268_111(receiver), __fieldRead268_113(__fieldRead268_112(receiver)), __fieldRead268_115(__fieldRead268_114(receiver)));
    __call268_118(life5_38, __fieldRead268_117(receiver));
    return;
    }
    forwardValue268_284_0 = __fieldRead268_119(receiver);
    }
    life20_350 = __fieldRead268_120(forwardValue268_284_0);
    __fieldWrite268_123(receiver, __fieldRead268_122(__fieldRead268_121(receiver)));
    __fieldWrite268_126(receiver, __fieldRead268_125(__fieldRead268_124(receiver)));
    __fieldWrite268_129(receiver, __fieldRead268_128(__fieldRead268_127(receiver)));
    life22_369 = __fieldRead268_131(__fieldRead268_130(receiver));
    life24_373 = __fieldRead268_133(__fieldRead268_132(receiver));
    life26_377 = __fieldRead268_135(__fieldRead268_134(receiver));
    life28_381 = __fieldRead268_137(__fieldRead268_136(receiver));
    life29_385 = __fieldRead268_139(__fieldRead268_138(receiver));
    spill268_9 = __call268_140(p0);
    if (!((life4_11 == null))) {
        forwardValue268_338_0 = __integerCategory268_141(spill268_9);
        break forward_join_338;
    }
    if (!(spill268_9)) {
        break forward_join_336;
    }
    spill268_10 = __numericCompare268_143(__call268_142(p0), -0x1.f38p9d);
    if (!((life4_11 == null))) {
        forwardValue268_338_0 = spill268_10;
        break forward_join_338;
    }
    if (!((spill268_10 == 0))) {
        break forward_join_336;
    }
    __call268_144(p0, 0);
    }
    forwardValue268_338_0 = __integerCategory268_146(__call268_145(p0));
    }
    if (!((life4_11 == null))) {
        forwardValue268_372_0 = forwardValue268_338_0;
        break forward_join_372;
    }
    if (!((forwardValue268_338_0 != 0))) {
        break forward_join_370;
    }
    life22_369 = __call268_147(p0);
    life24_373 = __call268_148(p0);
    life26_377 = __call268_149(p0);
    if (!((life4_11 == null))) {
        break forward_join_369;
    }
    if (!((__numericCompare268_152(__call268_151(__call268_150(p0)), 0x1.c9c38p24d) <= 0))) {
        break forward_join_366;
    }
    spill268_11 = __numericCompare268_155(__call268_154(__call268_153(p0)), 0x1.c9c38p24d);
    if (!((life4_11 == null))) {
        forwardValue268_372_0 = spill268_11;
        break forward_join_372;
    }
    if (!((spill268_11 > 0))) {
        break forward_join_370;
    }
    }
    __call268_156(receiver, "Illegal position");
    }
    return;
    }
    forwardValue268_372_0 = __integerCategory268_158(__call268_157(p0));
    }
    if (!((life4_11 == null))) {
        forwardValue268_397_0 = forwardValue268_372_0;
        break forward_join_397;
    }
    if (!((forwardValue268_372_0 != 0))) {
        break forward_join_381;
    }
    life28_381 = __call268_159(p0);
    life29_385 = __call268_160(p0);
    }
    __call268_162(__fieldRead268_161(receiver));
    __call268_167(__fieldRead268_163(receiver), __fieldRead268_164(receiver), __fieldRead268_165(receiver), __fieldRead268_166(receiver), life28_381, life29_385);
    forwardValue268_397_0 = __integerCategory268_169(__fieldRead268_168(receiver));
    }
    if (!((forwardValue268_397_0 == 0))) {
        break forward_join_399;
    }
    return;
    }
    life30_499 = (life22_369 - __fieldRead268_171(__fieldRead268_170(receiver)));
    life32_505 = (life24_373 - __fieldRead268_173(__fieldRead268_172(receiver)));
    life34_511 = (life26_377 - __fieldRead268_175(__fieldRead268_174(receiver)));
    life36_535 = (((__fieldRead268_177(__fieldRead268_176(receiver)) * __fieldRead268_179(__fieldRead268_178(receiver))) + (__fieldRead268_181(__fieldRead268_180(receiver)) * __fieldRead268_183(__fieldRead268_182(receiver)))) + (__fieldRead268_185(__fieldRead268_184(receiver)) * __fieldRead268_187(__fieldRead268_186(receiver))));
    life38_547 = (((life30_499 * life30_499) + (life32_505 * life32_505)) + (life34_511 * life34_511));
    spill268_12 = __numericCompare268_188((life38_547 - life36_535), 0x1.9p6d);
    if (!((life4_11 == null))) {
        forwardValue268_466_0 = spill268_12;
        break forward_join_466;
    }
    if (!((spill268_12 > 0))) {
        break forward_join_504;
    }
    spill268_13 = receiver;
    if (!((life4_11 == null))) {
        forwardValue268_490_0 = spill268_13;
        break forward_join_490;
    }
    forwardValue268_466_0 = __integerCategory268_191(__call268_190(__fieldRead268_189(spill268_13)));
    }
    if (!((forwardValue268_466_0 != 0))) {
        break forward_join_477;
    }
    spill268_14 = receiver;
    if (!((life4_11 == null))) {
        forwardValue268_490_0 = spill268_14;
        break forward_join_490;
    }
    if (!((!__call268_196(__call268_193(__fieldRead268_192(spill268_14)), __call268_195(__fieldRead268_194(receiver)))))) {
        break forward_join_504;
    }
    }
    __call268_201(__fieldRead268_197(), __invokedynamic268_200(__call268_199(__fieldRead268_198(receiver)), life30_499, life32_505, life34_511, life30_499, life32_505, life34_511));
    forwardValue268_490_0 = receiver;
    }
    __call268_209(forwardValue268_490_0, __fieldRead268_202(receiver), __fieldRead268_203(receiver), __fieldRead268_204(receiver), __fieldRead268_206(__fieldRead268_205(receiver)), __fieldRead268_208(__fieldRead268_207(receiver)));
    return;
    }
    life40_618 = 0x1.0p-4f;
    life41_634 = __integerCategory268_216(__call268_215(__call268_214(life5_38, __fieldRead268_210(receiver), __call268_213(__call268_212(__fieldRead268_211(receiver)), ((double) life40_618), ((double) life40_618), ((double) life40_618)))));
    spill268_15 = __fieldRead268_218(__fieldRead268_217(receiver));
    if (!((life4_11 == null))) {
        forwardValue268_570_0 = __integerCategory268_219(spill268_15);
        break forward_join_570;
    }
    if (!(spill268_15)) {
        break forward_join_542;
    }
    spill268_16 = __call268_220(p0);
    if (!((life4_11 == null))) {
        forwardValue268_570_0 = __integerCategory268_221(spill268_16);
        break forward_join_570;
    }
    if (!((!spill268_16))) {
        break forward_join_542;
    }
    spill268_17 = __numericCompare268_222(life32_505, 0x0.0p0d);
    if (!((life4_11 == null))) {
        forwardValue268_570_0 = spill268_17;
        break forward_join_570;
    }
    if (!((spill268_17 > 0))) {
        break forward_join_542;
    }
    __call268_224(__fieldRead268_223(receiver));
    }
    __call268_226(__fieldRead268_225(receiver), life30_499, life32_505, life34_511);
    __fieldWrite268_229(__fieldRead268_227(receiver), __call268_228(p0));
    life30_499 = (life22_369 - __fieldRead268_231(__fieldRead268_230(receiver)));
    life32_505 = (life24_373 - __fieldRead268_233(__fieldRead268_232(receiver)));
    spill268_18 = life32_505;
    if (!((life4_11 == null))) {
        forwardValue268_578_0 = spill268_18;
        break forward_join_578;
    }
    forwardValue268_570_0 = __numericCompare268_234(spill268_18, -0x1.0p-1d);
    }
    if (!((forwardValue268_570_0 <= 0))) {
        break forward_join_577;
    }
    spill268_19 = __numericCompare268_235(life32_505, 0x1.0p-1d);
    if (!((life4_11 == null))) {
        forwardValue268_598_0 = spill268_19;
        break forward_join_598;
    }
    if (!((spill268_19 < 0))) {
        break forward_join_579;
    }
    }
    forwardValue268_578_0 = 0x0.0p0d;
    }
    life32_505 = forwardValue268_578_0;
    }
    life34_724 = (life26_377 - __fieldRead268_237(__fieldRead268_236(receiver)));
    life38_547 = (((life30_499 * life30_499) + (life32_505 * life32_505)) + (life34_724 * life34_724));
    forwardValue268_598_0 = 0;
    }
    life42_738 = forwardValue268_598_0;
    spill268_20 = __numericCompare268_238(life38_547, 0x1.0p-4d);
    if (!((life4_11 == null))) {
        forwardValue268_657_0 = spill268_20;
        break forward_join_657;
    }
    if (!((spill268_20 > 0))) {
        break forward_join_626;
    }
    spill268_21 = __call268_240(__fieldRead268_239(receiver));
    if (!((life4_11 == null))) {
        forwardValue268_657_0 = __integerCategory268_241(spill268_21);
        break forward_join_657;
    }
    if (!((!spill268_21))) {
        break forward_join_626;
    }
    spill268_22 = __call268_244(__fieldRead268_243(__fieldRead268_242(receiver)));
    if (!((life4_11 == null))) {
        forwardValue268_657_0 = __integerCategory268_245(spill268_22);
        break forward_join_657;
    }
    if (!((!spill268_22))) {
        break forward_join_626;
    }
    life42_738 = 1;
    __call268_250(__fieldRead268_246(), __invokedynamic268_249(__call268_248(__fieldRead268_247(receiver))));
    }
    __call268_252(__fieldRead268_251(receiver), life22_369, life24_373, life26_377, life28_381, life29_385);
    __call268_260(__fieldRead268_253(receiver), (__fieldRead268_255(__fieldRead268_254(receiver)) - life6_57), (__fieldRead268_257(__fieldRead268_256(receiver)) - life8_61), (__fieldRead268_259(__fieldRead268_258(receiver)) - life10_65));
    spill268_23 = __fieldRead268_261(receiver);
    if (!((life4_11 == null))) {
        forwardValue268_705_0 = spill268_23;
        break forward_join_705;
    }
    forwardValue268_657_0 = __integerCategory268_263(__fieldRead268_262(spill268_23));
    }
    if (!((forwardValue268_657_0 == 0))) {
        break forward_join_703;
    }
    life43_831 = __integerCategory268_270(__call268_269(__call268_268(life5_38, __fieldRead268_264(receiver), __call268_267(__call268_266(__fieldRead268_265(receiver)), ((double) life40_618), ((double) life40_618), ((double) life40_618)))));
    spill268_24 = life41_634;
    if (!((life4_11 == null))) {
        forwardValue268_679_0 = spill268_24;
        break forward_join_679;
    }
    if (!((spill268_24 != 0))) {
        break forward_join_703;
    }
    forwardValue268_679_0 = life42_738;
    }
    if (!((life4_11 == null))) {
        forwardValue268_691_0 = forwardValue268_679_0;
        break forward_join_691;
    }
    if (!((forwardValue268_679_0 == 0))) {
        break forward_join_686;
    }
    spill268_25 = life43_831;
    if (!((life4_11 == null))) {
        forwardValue268_691_0 = spill268_25;
        break forward_join_691;
    }
    if (!((spill268_25 == 0))) {
        break forward_join_703;
    }
    }
    spill268_26 = __fieldRead268_271(receiver);
    if (!((life4_11 == null))) {
        forwardValue268_705_0 = spill268_26;
        break forward_join_705;
    }
    forwardValue268_691_0 = __integerCategory268_273(__call268_272(spill268_26));
    }
    if (!((forwardValue268_691_0 == 0))) {
        break forward_join_703;
    }
    __call268_277(receiver, __fieldRead268_274(receiver), __fieldRead268_275(receiver), __fieldRead268_276(receiver), life28_381, life29_385);
    return;
    }
    forwardValue268_705_0 = __fieldRead268_278(receiver);
    }
    life43_895 = __call268_281(__call268_280(__call268_279(forwardValue268_705_0), ((double) life40_618), ((double) life40_618), ((double) life40_618)), 0x0.0p0d, -0x1.199999999999ap-1d, 0x0.0p0d);
    spill268_27 = receiver;
    if (!((life4_11 == null))) {
        forwardValue268_770_0 = spill268_27;
        break forward_join_770;
    }
    if (!((!__call268_283(__fieldRead268_282(spill268_27))))) {
        break forward_join_769;
    }
    spill268_28 = receiver;
    if (!((life4_11 == null))) {
        forwardValue268_770_0 = spill268_28;
        break forward_join_770;
    }
    if (!((!__fieldRead268_286(__fieldRead268_285(__fieldRead268_284(spill268_28)))))) {
        break forward_join_769;
    }
    spill268_29 = __call268_287(life5_38, life43_895);
    if (!((life4_11 == null))) {
        forwardValue268_740_0 = __integerCategory268_288(spill268_29);
        break forward_join_740;
    }
    if (!((!spill268_29))) {
        break forward_join_769;
    }
    forwardValue268_740_0 = __numericCompare268_289(life32_505, -0x1.0p-5d);
    }
    if (!((life4_11 == null))) {
        forwardValue268_753_0 = forwardValue268_740_0;
        break forward_join_753;
    }
    if (!((forwardValue268_740_0 >= 0))) {
        break forward_join_772;
    }
    net.minecraft.network.NetHandlerPlayServer __stackOp268_290_0 = receiver;
    __fieldWrite268_292(__stackOp268_290_0, (__fieldRead268_291(__stackOp268_290_0) + 1));
    spill268_30 = receiver;
    if (!((life4_11 == null))) {
        forwardValue268_784_0 = spill268_30;
        break forward_join_784;
    }
    forwardValue268_753_0 = __fieldRead268_293(spill268_30);
    }
    if (!((forwardValue268_753_0 > __invokedynamic268_294(26733, (5890065514352824124L ^ life2_3))))) {
        break forward_join_772;
    }
    __call268_299(__fieldRead268_295(), __invokedynamic268_298(__call268_297(__fieldRead268_296(receiver))));
    __call268_300(receiver, "Flying is not enabled on this server");
    return;
    }
    forwardValue268_770_0 = receiver;
    }
    __fieldWrite268_301(forwardValue268_770_0, 0);
    }
    __fieldWrite268_304(__fieldRead268_302(receiver), __call268_303(p0));
    __call268_308(__call268_306(__fieldRead268_305(receiver)), __fieldRead268_307(receiver));
    forwardValue268_784_0 = receiver;
    }
    __call268_313(__fieldRead268_309(forwardValue268_784_0), (__fieldRead268_311(__fieldRead268_310(receiver)) - life20_350), __call268_312(p0));
    if (!((life4_11 != null))) {
        break forward_join_822;
    }
    }
    spill268_31 = receiver;
    if (!((life4_11 == null))) {
        forwardValue268_809_0 = spill268_31;
        break forward_join_809;
    }
    forwardValue268_802_0 = (__fieldRead268_314(spill268_31) - __fieldRead268_315(receiver));
    }
    if (!((forwardValue268_802_0 > __invokedynamic268_316(9679, (2968455284407861906L ^ life2_3))))) {
        break forward_join_822;
    }
    forwardValue268_809_0 = receiver;
    }
    __call268_324(forwardValue268_809_0, __fieldRead268_317(receiver), __fieldRead268_318(receiver), __fieldRead268_319(receiver), __fieldRead268_321(__fieldRead268_320(receiver)), __fieldRead268_323(__fieldRead268_322(receiver)));
    }
    return;
}
public static void h268_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026800_0(p0);
}
public static void h268_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026801_0(p0);
}
public static void h268_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026802_0(p0);
}
public static void h268_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026803_0(p0);
}
public static void h268_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026804_0(p0);
}
public static void h268_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026805_0(p0);
}
public static void h268_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026806_0(p0);
}
public static void h268_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026807_0(p0);
}
public static void h268_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026808_0(p0);
}
public static void h268_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026809_0(p0);
}
public static void h268_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026810_0(p0);
}
public static void h268_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026811_0(p0);
}
public static void h268_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026812_0(p0);
}
public static void h268_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026813_0(p0);
}
public static void h268_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026814_0(p0);
}
public static void h268_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026815_0(p0);
}
public static void h268_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026816_0(p0);
}
public static void h268_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026817_0(p0);
}
public static void h268_18(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026818_0(p0);
}
public static void h268_19(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026819_0(p0);
}
public static void h268_20(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026820_0(p0);
}
public static void h268_21(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026821_0(p0);
}
public static void h268_22(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026822_0(p0);
}
public static void h268_23(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026823_0(p0);
}
public static void h268_24(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026824_0(p0);
}
public static void h268_25(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026825_0(p0);
}
public static void h268_26(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026826_0(p0);
}
public static void h268_27(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026827_0(p0);
}
public static void h268_28(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026828_0(p0);
}
public static void h268_29(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026829_0(p0);
}
public static void h268_30(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026830_0(p0);
}
public static void h268_31(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026831_0(p0);
}
public static void h268_32(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026832_0(p0);
}
public static void h268_33(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026833_0(p0);
}
public static void h268_34(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026834_0(p0);
}
public static void h268_35(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026835_0(p0);
}
public static void h268_36(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026836_0(p0);
}
public static void h268_37(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026837_0(p0);
}
public static void h268_38(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026838_0(p0);
}
public static void h268_39(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026839_0(p0);
}
public static void h268_40(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026840_0(p0);
}
public static void h268_41(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026841_0(p0);
}
public static void h268_42(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026842_0(p0);
}
public static void h268_43(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026843_0(p0);
}
public static void h268_44(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026844_0(p0);
}
public static void h268_45(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026845_0(p0);
}
public static void h268_46(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026846_0(p0);
}
public static void h268_47(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026847_0(p0);
}
public static void h268_48(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026848_0(p0);
}
public static void h268_49(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026849_0(p0);
}
public static void h268_50(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026850_0(p0);
}
public static void h268_51(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026851_0(p0);
}
public static void h268_52(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026852_0(p0);
}
public static void h268_53(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026853_0(p0);
}
public static void h268_54(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026854_0(p0);
}
public static void h268_55(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026855_0(p0);
}
public static void h268_56(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026856_0(p0);
}
public static void h268_57(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026857_0(p0);
}
public static void h268_58(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026858_0(p0);
}
public static void h268_59(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026859_0(p0);
}
public static void h268_60(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026860_0(p0);
}
public static void h268_61(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026861_0(p0);
}
public static void h268_62(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026862_0(p0);
}
public static void h268_63(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026863_0(p0);
}
public static void h268_64(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026864_0(p0);
}
public static void h268_65(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026865_0(p0);
}
public static void h268_66(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026866_0(p0);
}
public static void h268_67(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026867_0(p0);
}
public static void h268_68(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026868_0(p0);
}
public static void h268_69(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026869_0(p0);
}
public static void h268_70(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026870_0(p0);
}
public static void h268_71(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026871_0(p0);
}
public static void h268_72(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026872_0(p0);
}
private static native long __fieldRead268_0() throws Throwable;
private static native java.lang.String __call268_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_2(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call268_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call268_4(moom.y7 a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native boolean __call268_5(net.minecraft.network.NetHandlerPlayServer a0, moom.y7 a1) throws Throwable;
private static native void __call268_6(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native moom.Bl __fieldRead268_7(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_8(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __fieldRead268_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call268_10(moom.Bl a0, int a1) throws Throwable;
private static native void __fieldWrite268_11(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_12(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __fieldRead268_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_14(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_15(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_16(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_17(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_18(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_19(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __call268_20(moom.y7 a0) throws Throwable;
private static native double __fieldRead268_21(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __call268_22(moom.y7 a0) throws Throwable;
private static native double __fieldRead268_23(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __call268_24(moom.y7 a0) throws Throwable;
private static native double __fieldRead268_25(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call268_26(moom.y7 a0) throws Throwable;
private static native int __integerCategory268_27(boolean value) throws Throwable;
private static native boolean __fieldRead268_28(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __integerCategory268_29(boolean value) throws Throwable;
private static native int __numericCompare268_30(double a0, double a1) throws Throwable;
private static native void __fieldWrite268_31(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native boolean __fieldRead268_32(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __integerCategory268_33(boolean value) throws Throwable;
private static native int __fieldRead268_34(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite268_35(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_36(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead268_37(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_38(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead268_39(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_40(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead268_41(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_42(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead268_43(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call268_44(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_45(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_46(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_47(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_48(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_49(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_50(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call268_51(moom.y7 a0) throws Throwable;
private static native float __call268_52(moom.y7 a0) throws Throwable;
private static native float __call268_53(moom.y7 a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_54(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call268_55(moom.y7 a0) throws Throwable;
private static native void __fieldWrite268_56(net.minecraft.entity.player.EntityPlayerMP a0, boolean a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_57(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_58(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_59(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_60(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_61(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead268_62(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_63(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead268_64(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call268_65(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.Bl __fieldRead268_66(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call268_67(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_68(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_69(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_70(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead268_71(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __numericCompare268_72(double a0, double a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_73(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead268_74(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_75(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead268_76(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call268_77(net.minecraft.network.NetHandlerPlayServer a0, moom.zR a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_78(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_79(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_80(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_81(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_82(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_83(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_84(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead268_85(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_86(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead268_87(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call268_88(net.minecraft.network.NetHandlerPlayServer a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_89(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead268_90(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite268_91(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native boolean __fieldRead268_92(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_93(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_94(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite268_95(net.minecraft.network.NetHandlerPlayServer a0, double a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_96(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_97(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite268_98(net.minecraft.network.NetHandlerPlayServer a0, double a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_99(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_100(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite268_101(net.minecraft.network.NetHandlerPlayServer a0, double a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_102(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_103(net.minecraft.world.WorldServer a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_104(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call268_105(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_106(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_107(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_108(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_109(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_110(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_111(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_112(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead268_113(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_114(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead268_115(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call268_116(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_117(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_118(net.minecraft.world.WorldServer a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_119(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_120(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_121(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_122(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite268_123(net.minecraft.network.NetHandlerPlayServer a0, double a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_124(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_125(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite268_126(net.minecraft.network.NetHandlerPlayServer a0, double a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_127(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_128(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __fieldWrite268_129(net.minecraft.network.NetHandlerPlayServer a0, double a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_130(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_131(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_132(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_133(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_134(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_135(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_136(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead268_137(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_138(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead268_139(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call268_140(moom.y7 a0) throws Throwable;
private static native int __integerCategory268_141(boolean value) throws Throwable;
private static native double __call268_142(moom.y7 a0) throws Throwable;
private static native int __numericCompare268_143(double a0, double a1) throws Throwable;
private static native void __call268_144(moom.y7 a0, int a1) throws Throwable;
private static native boolean __call268_145(moom.y7 a0) throws Throwable;
private static native int __integerCategory268_146(boolean value) throws Throwable;
private static native double __call268_147(moom.y7 a0) throws Throwable;
private static native double __call268_148(moom.y7 a0) throws Throwable;
private static native double __call268_149(moom.y7 a0) throws Throwable;
private static native double __call268_150(moom.y7 a0) throws Throwable;
private static native double __call268_151(double a0) throws Throwable;
private static native int __numericCompare268_152(double a0, double a1) throws Throwable;
private static native double __call268_153(moom.y7 a0) throws Throwable;
private static native double __call268_154(double a0) throws Throwable;
private static native int __numericCompare268_155(double a0, double a1) throws Throwable;
private static native void __call268_156(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native boolean __call268_157(moom.y7 a0) throws Throwable;
private static native int __integerCategory268_158(boolean value) throws Throwable;
private static native float __call268_159(moom.y7 a0) throws Throwable;
private static native float __call268_160(moom.y7 a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_161(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_162(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_163(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_164(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_165(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_166(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_167(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native boolean __fieldRead268_168(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __integerCategory268_169(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_170(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_171(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_172(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_173(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_174(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_175(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_176(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_177(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_178(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_179(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_180(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_181(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_182(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_183(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_184(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_185(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_186(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_187(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __numericCompare268_188(double a0, double a1) throws Throwable;
private static native moom.Bl __fieldRead268_189(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call268_190(moom.Bl a0) throws Throwable;
private static native int __integerCategory268_191(boolean value) throws Throwable;
private static native moom.Bl __fieldRead268_192(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call268_193(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_194(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call268_195(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call268_196(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead268_197() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_198(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call268_199(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __invokedynamic268_200(java.lang.String a0, double a1, double a2, double a3, double a4, double a5, double a6) throws Throwable;
private static native void __call268_201(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native double __fieldRead268_202(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_203(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_204(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_205(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead268_206(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_207(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead268_208(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call268_209(net.minecraft.network.NetHandlerPlayServer a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_210(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_211(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.CA __call268_212(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.CA __call268_213(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.List __call268_214(net.minecraft.world.WorldServer a0, net.minecraft.entity.player.EntityPlayerMP a1, moom.CA a2) throws Throwable;
private static native boolean __call268_215(java.util.List a0) throws Throwable;
private static native int __integerCategory268_216(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_217(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __fieldRead268_218(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory268_219(boolean value) throws Throwable;
private static native boolean __call268_220(moom.y7 a0) throws Throwable;
private static native int __integerCategory268_221(boolean value) throws Throwable;
private static native int __numericCompare268_222(double a0, double a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_223(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_224(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_225(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_226(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_227(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call268_228(moom.y7 a0) throws Throwable;
private static native void __fieldWrite268_229(net.minecraft.entity.player.EntityPlayerMP a0, boolean a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_230(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_231(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_232(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_233(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __numericCompare268_234(double a0, double a1) throws Throwable;
private static native int __numericCompare268_235(double a0, double a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_236(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_237(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __numericCompare268_238(double a0, double a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_239(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call268_240(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory268_241(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_242(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.Bo __fieldRead268_243(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call268_244(moom.Bo a0) throws Throwable;
private static native int __integerCategory268_245(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead268_246() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_247(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call268_248(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __invokedynamic268_249(java.lang.String a0) throws Throwable;
private static native void __call268_250(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_251(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_252(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_253(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_254(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_255(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_256(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_257(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_258(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_259(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call268_260(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_261(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __fieldRead268_262(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory268_263(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_264(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_265(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.CA __call268_266(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.CA __call268_267(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.util.List __call268_268(net.minecraft.world.WorldServer a0, net.minecraft.entity.player.EntityPlayerMP a1, moom.CA a2) throws Throwable;
private static native boolean __call268_269(java.util.List a0) throws Throwable;
private static native int __integerCategory268_270(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_271(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call268_272(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory268_273(boolean value) throws Throwable;
private static native double __fieldRead268_274(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_275(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_276(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_277(net.minecraft.network.NetHandlerPlayServer a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_278(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.CA __call268_279(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.CA __call268_280(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native moom.CA __call268_281(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native moom.Bl __fieldRead268_282(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call268_283(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_284(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead268_285(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __fieldRead268_286(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native boolean __call268_287(net.minecraft.world.WorldServer a0, moom.CA a1) throws Throwable;
private static native int __integerCategory268_288(boolean value) throws Throwable;
private static native int __numericCompare268_289(double a0, double a1) throws Throwable;
private static native int __fieldRead268_291(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite268_292(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native int __fieldRead268_293(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __invokedynamic268_294(int a0, long a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead268_295() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_296(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call268_297(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __invokedynamic268_298(java.lang.String a0) throws Throwable;
private static native void __call268_299(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call268_300(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite268_301(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_302(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call268_303(moom.y7 a0) throws Throwable;
private static native void __fieldWrite268_304(net.minecraft.entity.player.EntityPlayerMP a0, boolean a1) throws Throwable;
private static native moom.Bl __fieldRead268_305(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call268_306(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_307(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call268_308(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_309(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_310(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_311(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call268_312(moom.y7 a0) throws Throwable;
private static native void __call268_313(net.minecraft.entity.player.EntityPlayerMP a0, double a1, boolean a2) throws Throwable;
private static native int __fieldRead268_314(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __fieldRead268_315(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __invokedynamic268_316(int a0, long a1) throws Throwable;
private static native double __fieldRead268_317(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_318(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead268_319(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_320(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead268_321(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead268_322(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __fieldRead268_323(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call268_324(net.minecraft.network.NetHandlerPlayServer a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native java.lang.Throwable __call1026800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026802_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026803_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026804_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026805_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026806_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026807_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026808_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026809_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026810_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026811_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026812_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026813_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026814_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026815_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026816_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026817_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026818_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026819_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026820_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026821_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026822_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026823_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026824_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026825_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026826_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026827_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026828_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026829_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026830_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026831_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026832_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026833_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026834_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026835_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026836_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026837_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026838_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026839_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026840_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026841_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026842_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026843_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026844_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026845_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026846_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026847_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026848_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026849_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026850_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026851_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026852_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026853_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026854_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026855_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026856_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026857_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026858_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026859_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026860_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026861_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026862_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026863_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026864_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026865_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026866_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026867_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026868_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026869_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026870_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026871_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026872_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3211ada3e5874c20ef41(net.minecraft.network.NetHandlerPlayServer a0, moom.yK a1) throws E;
private static final class __SourceHandler_3211ada3e5874c20ef41 {

public static void f581(net.minecraft.network.NetHandlerPlayServer receiver, moom.yK p0) throws Throwable {
    net.minecraft.entity.player.EntityPlayer$EnumChatVisibility forwardValue581_26_0;
    net.minecraft.entity.player.EntityPlayer$EnumChatVisibility forwardValue581_26_1;
    net.minecraft.entity.player.EntityPlayer$EnumChatVisibility spill581_0;
    net.minecraft.entity.player.EntityPlayer$EnumChatVisibility spill581_1;
    long life2_3;
    java.lang.String life4_5;
    moom.zv life5_16;
    net.minecraft.entity.player.EntityPlayer$EnumChatVisibility life6_20;
    forward_join_35: {
    forward_join_31: {
    forward_join_26: {
    forward_join_24: {
    life2_3 = (__fieldRead581_0() ^ 50889710595591L);
    life4_5 = __call581_1();
    if (!((life4_5 == null))) {
        break forward_join_35;
    }
    if (!((__instanceOf581_2(p0) != 0))) {
        break forward_join_31;
    }
    life5_16 = __cast581_3(p0);
    life6_20 = __call581_5(__fieldRead581_4(receiver));
    spill581_0 = life6_20;
    spill581_1 = __fieldRead581_6();
    if (!((life4_5 == null))) {
        forwardValue581_26_0 = spill581_0;
        forwardValue581_26_1 = spill581_1;
        break forward_join_26;
    }
    if (!((spill581_0 == spill581_1))) {
        break forward_join_24;
    }
    return;
    }
    forwardValue581_26_0 = life6_20;
    forwardValue581_26_1 = __fieldRead581_7();
    }
    if (!((forwardValue581_26_0 == forwardValue581_26_1))) {
        break forward_join_31;
    }
    if (!((!__call581_8(life5_16)))) {
        break forward_join_31;
    }
    return;
    }
    __call581_10(__fieldRead581_9(receiver), p0);
    }
    return;
}
public static void h581_0(java.lang.Throwable p0) throws Throwable {
    throw __call2058100_0(p0);
}
public static void h581_1(java.lang.Throwable p0) throws Throwable {
    throw __call2058101_0(p0);
}
public static void h581_2(java.lang.Throwable p0) throws Throwable {
    throw __call2058102_0(p0);
}
public static void h581_3(java.lang.Throwable p0) throws Throwable {
    throw __call2058103_0(p0);
}
public static void h581_4(java.lang.Throwable p0, moom.yK p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    moom.qY local3 = __call2058104_0(local2, "Sending packet");
    moom.qZ local4 = __call2058104_1(local3, "Packet being sent");
    __call2058104_3(local4, "Packet class", __invokedynamic2058104_2(p1));
    throw new moom.Oo(local3);
}
private static native long __fieldRead581_0() throws Throwable;
private static native java.lang.String __call581_1() throws Throwable;
private static native int __instanceOf581_2(moom.yK a0) throws Throwable;
private static native moom.zv __cast581_3(moom.yK a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead581_4(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer$EnumChatVisibility __call581_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer$EnumChatVisibility __fieldRead581_6() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer$EnumChatVisibility __fieldRead581_7() throws Throwable;
private static native boolean __call581_8(moom.zv a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead581_9(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call581_10(net.minecraft.network.NetworkManager a0, moom.yK a1) throws Throwable;
private static native java.lang.Throwable __call2058100_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2058101_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2058102_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2058103_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2058104_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2058104_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2058104_2(moom.yK a0) throws Throwable;
private static native void __call2058104_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e5cd45eb5e7f031a16ff(net.minecraft.network.NetHandlerPlayServer a0, moom.za a1) throws E;
private static final class __SourceHandler_e5cd45eb5e7f031a16ff {

public static void f562(net.minecraft.network.NetHandlerPlayServer receiver, moom.za p0) throws Throwable {
    int forwardValue562_38_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue562_41_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue562_53_0;
    int forwardValue562_114_0;
    net.minecraft.network.NetHandlerPlayServer forwardValue562_152_0;
    net.minecraft.network.play.client.C07PacketPlayerDigging$Action forwardValue562_163_0;
    net.minecraft.network.play.client.C07PacketPlayerDigging$Action forwardValue562_163_1;
    net.minecraft.network.play.client.C07PacketPlayerDigging$Action forwardValue562_176_0;
    net.minecraft.network.play.client.C07PacketPlayerDigging$Action forwardValue562_176_1;
    java.lang.String spill562_0;
    int spill562_1;
    net.minecraft.entity.player.EntityPlayerMP spill562_2;
    net.minecraft.entity.player.EntityPlayerMP spill562_3;
    int spill562_4;
    net.minecraft.network.play.client.C07PacketPlayerDigging$Action spill562_5;
    net.minecraft.network.play.client.C07PacketPlayerDigging$Action spill562_6;
    net.minecraft.network.NetHandlerPlayServer spill562_7;
    long life2_3;
    java.lang.String life4_11;
    net.minecraft.world.WorldServer life5_18;
    moom.DT life6_21;
    double life7_87;
    double life9_99;
    double life11_109;
    double life13_121;
    forward_join_198: {
    forward_join_197: {
    forward_join_181: {
    forward_join_176: {
    forward_join_173: {
    forward_join_163: {
    forward_join_160: {
    forward_join_152: {
    forward_join_149: {
    forward_join_119: {
    forward_join_114: {
    forward_join_112: {
    forward_join_61: {
    forward_join_57: {
    forward_join_56: {
    forward_join_53: {
    forward_join_45: {
    forward_join_44: {
    forward_join_41: {
    forward_join_38: {
    forward_join_33: {
    life2_3 = (__fieldRead562_0() ^ 50471634167610L);
    spill562_0 = __call562_1();
    __call562_4(p0, receiver, __call562_3(__fieldRead562_2(receiver)));
    life4_11 = spill562_0;
    life5_18 = __call562_8(__fieldRead562_5(receiver), __fieldRead562_7(__fieldRead562_6(receiver)));
    life6_21 = __call562_9(p0);
    __call562_11(__fieldRead562_10(receiver));
    spill562_1 = (__fieldRead562_12())[__call562_14(__call562_13(p0))];
    if (!((life4_11 == null))) {
        forwardValue562_38_0 = spill562_1;
        break forward_join_38;
    }
    switch (spill562_1) {
case 1:
{
        break forward_join_33;
    }
case 2:
{
        break forward_join_45;
    }
case 3:
{
        break forward_join_57;
    }
case 4:
case 5:
case 6:
{
        break forward_join_61;
    }
default:
{
        break forward_join_198;
    }
}
    }
    spill562_2 = __fieldRead562_15(receiver);
    if (!((life4_11 == null))) {
        forwardValue562_41_0 = spill562_2;
        break forward_join_41;
    }
    forwardValue562_38_0 = __integerCategory562_17(__call562_16(spill562_2));
    }
    if (!((forwardValue562_38_0 == 0))) {
        break forward_join_44;
    }
    forwardValue562_41_0 = __fieldRead562_18(receiver);
    }
    __call562_19(forwardValue562_41_0, 0);
    }
    return;
    }
    spill562_3 = __fieldRead562_20(receiver);
    if (!((life4_11 == null))) {
        forwardValue562_53_0 = spill562_3;
        break forward_join_53;
    }
    if (!((!__call562_21(spill562_3)))) {
        break forward_join_56;
    }
    forwardValue562_53_0 = __fieldRead562_22(receiver);
    }
    __call562_23(forwardValue562_53_0, 1);
    }
    return;
    }
    __call562_25(__fieldRead562_24(receiver));
    return;
    }
    life7_87 = (__fieldRead562_27(__fieldRead562_26(receiver)) - (((double) __call562_28(life6_21)) + 0x1.0p-1d));
    life9_99 = ((__fieldRead562_30(__fieldRead562_29(receiver)) - (((double) __call562_31(life6_21)) + 0x1.0p-1d)) + 0x1.8p0d);
    life11_109 = (__fieldRead562_33(__fieldRead562_32(receiver)) - (((double) __call562_34(life6_21)) + 0x1.0p-1d));
    life13_121 = (((life7_87 * life7_87) + (life9_99 * life9_99)) + (life11_109 * life11_109));
    spill562_4 = __numericCompare562_35(life13_121, 0x1.2p5d);
    if (!((life4_11 == null))) {
        forwardValue562_114_0 = spill562_4;
        break forward_join_114;
    }
    if (!((spill562_4 > 0))) {
        break forward_join_112;
    }
    return;
    }
    forwardValue562_114_0 = __call562_36(life6_21);
    }
    if (!((forwardValue562_114_0 >= __call562_38(__fieldRead562_37(receiver))))) {
        break forward_join_119;
    }
    return;
    }
    spill562_5 = __call562_39(p0);
    spill562_6 = __fieldRead562_40();
    if (!((life4_11 == null))) {
        forwardValue562_163_0 = spill562_5;
        forwardValue562_163_1 = spill562_6;
        break forward_join_163;
    }
    if (!((spill562_5 == spill562_6))) {
        break forward_join_160;
    }
    spill562_7 = receiver;
    if (!((life4_11 == null))) {
        forwardValue562_152_0 = spill562_7;
        break forward_join_152;
    }
    if (!((!__call562_43(__fieldRead562_41(spill562_7), life5_18, life6_21, __fieldRead562_42(receiver))))) {
        break forward_join_149;
    }
    if (!(__call562_45(__call562_44(life5_18), life6_21))) {
        break forward_join_149;
    }
    __call562_49(__fieldRead562_47(__fieldRead562_46(receiver)), life6_21, __call562_48(p0));
    if (!((life4_11 != null))) {
        break forward_join_197;
    }
    }
    forwardValue562_152_0 = __fieldRead562_51(__fieldRead562_50(receiver));
    }
    __call562_52(forwardValue562_152_0, new moom.z5(life5_18, life6_21));
    if (!((life4_11 != null))) {
        break forward_join_197;
    }
    }
    forwardValue562_163_0 = __call562_53(p0);
    forwardValue562_163_1 = __fieldRead562_54();
    }
    if (!((life4_11 == null))) {
        forwardValue562_176_0 = forwardValue562_163_0;
        forwardValue562_176_1 = forwardValue562_163_1;
        break forward_join_176;
    }
    if (!((forwardValue562_163_0 == forwardValue562_163_1))) {
        break forward_join_173;
    }
    __call562_57(__fieldRead562_56(__fieldRead562_55(receiver)), life6_21);
    if (!((life4_11 != null))) {
        break forward_join_181;
    }
    }
    forwardValue562_176_0 = __call562_58(p0);
    forwardValue562_176_1 = __fieldRead562_59();
    }
    if (!((forwardValue562_176_0 == forwardValue562_176_1))) {
        break forward_join_181;
    }
    __call562_62(__fieldRead562_61(__fieldRead562_60(receiver)));
    }
    if (!((__call562_65(__call562_64(__call562_63(life5_18, life6_21))) != __fieldRead562_66()))) {
        break forward_join_197;
    }
    __call562_69(__fieldRead562_68(__fieldRead562_67(receiver)), new moom.z5(life5_18, life6_21));
    }
    return;
    }
    throw new java.lang.IllegalArgumentException("Invalid player action");
}
public static void h562_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056200_0(p0);
}
public static void h562_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056201_0(p0);
}
public static void h562_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056202_0(p0);
}
public static void h562_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056203_0(p0);
}
public static void h562_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056204_0(p0);
}
public static void h562_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056205_0(p0);
}
public static void h562_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056206_0(p0);
}
public static void h562_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056207_0(p0);
}
public static void h562_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056208_0(p0);
}
public static void h562_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056209_0(p0);
}
public static void h562_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056210_0(p0);
}
public static void h562_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056211_0(p0);
}
public static void h562_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056212_0(p0);
}
public static void h562_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056213_0(p0);
}
public static void h562_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056214_0(p0);
}
public static void h562_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056215_0(p0);
}
public static void h562_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056216_0(p0);
}
public static void h562_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056217_0(p0);
}
public static void h562_18(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056218_0(p0);
}
public static void h562_19(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056219_0(p0);
}
private static native long __fieldRead562_0() throws Throwable;
private static native java.lang.String __call562_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_2(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call562_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call562_4(moom.za a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native moom.Bl __fieldRead562_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_6(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __fieldRead562_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call562_8(moom.Bl a0, int a1) throws Throwable;
private static native moom.DT __call562_9(moom.za a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_10(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call562_11(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int[] __fieldRead562_12() throws Throwable;
private static native net.minecraft.network.play.client.C07PacketPlayerDigging$Action __call562_13(moom.za a0) throws Throwable;
private static native int __call562_14(net.minecraft.network.play.client.C07PacketPlayerDigging$Action a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_15(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call562_16(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory562_17(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_18(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call562_19(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_20(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call562_21(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_22(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call562_23(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_24(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call562_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_26(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead562_27(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call562_28(moom.DT a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_29(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead562_30(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call562_31(moom.DT a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_32(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead562_33(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call562_34(moom.DT a0) throws Throwable;
private static native int __numericCompare562_35(double a0, double a1) throws Throwable;
private static native int __call562_36(moom.DT a0) throws Throwable;
private static native moom.Bl __fieldRead562_37(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __call562_38(moom.Bl a0) throws Throwable;
private static native net.minecraft.network.play.client.C07PacketPlayerDigging$Action __call562_39(moom.za a0) throws Throwable;
private static native net.minecraft.network.play.client.C07PacketPlayerDigging$Action __fieldRead562_40() throws Throwable;
private static native moom.Bl __fieldRead562_41(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_42(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call562_43(moom.Bl a0, net.minecraft.world.WorldServer a1, moom.DT a2, net.minecraft.entity.player.EntityPlayerMP a3) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call562_44(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call562_45(net.minecraft.world.border.WorldBorder a0, moom.DT a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_46(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.Bo __fieldRead562_47(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.bs __call562_48(moom.za a0) throws Throwable;
private static native void __call562_49(moom.Bo a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_50(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead562_51(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call562_52(net.minecraft.network.NetHandlerPlayServer a0, moom.z5 a1) throws Throwable;
private static native net.minecraft.network.play.client.C07PacketPlayerDigging$Action __call562_53(moom.za a0) throws Throwable;
private static native net.minecraft.network.play.client.C07PacketPlayerDigging$Action __fieldRead562_54() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_55(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.Bo __fieldRead562_56(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call562_57(moom.Bo a0, moom.DT a1) throws Throwable;
private static native net.minecraft.network.play.client.C07PacketPlayerDigging$Action __call562_58(moom.za a0) throws Throwable;
private static native net.minecraft.network.play.client.C07PacketPlayerDigging$Action __fieldRead562_59() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_60(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.Bo __fieldRead562_61(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call562_62(moom.Bo a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call562_63(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call562_64(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call562_65(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead562_66() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead562_67(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead562_68(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call562_69(net.minecraft.network.NetHandlerPlayServer a0, moom.z5 a1) throws Throwable;
private static native java.lang.Throwable __call2056200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056204_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056205_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056206_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056207_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056208_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056209_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056210_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056211_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056212_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056213_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056214_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056215_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056216_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056217_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056218_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056219_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5b3dc280ec5cf40112f0(net.minecraft.network.NetHandlerPlayServer a0, moom.zb a1) throws E;
private static final class __SourceHandler_5b3dc280ec5cf40112f0 {

public static void f1632(net.minecraft.network.NetHandlerPlayServer receiver, moom.zb p0) throws Throwable {
    int forwardValue1632_69_0;
    int forwardValue1632_69_1;
    int forwardValue1632_83_0;
    int forwardValue1632_144_0;
    net.minecraft.item.ItemStack forwardValue1632_225_0;
    net.minecraft.item.ItemStack forwardValue1632_229_0;
    net.minecraft.network.NetHandlerPlayServer forwardValue1632_285_0;
    java.lang.String spill1632_0;
    int spill1632_1;
    int spill1632_2;
    int spill1632_3;
    int spill1632_4;
    int spill1632_5;
    boolean spill1632_6;
    boolean spill1632_7;
    net.minecraft.item.ItemStack spill1632_8;
    net.minecraft.item.ItemStack spill1632_9;
    net.minecraft.network.NetHandlerPlayServer spill1632_10;
    long life2_3;
    net.minecraft.world.WorldServer life5_17;
    net.minecraft.item.ItemStack life6_22;
    java.lang.String life4_23;
    int life7_25;
    moom.DT life8_28;
    moom.bs life9_32;
    moom.CN life10_210;
    net.minecraft.item.ItemStack life6_255;
    moom.wB life10_330;
    forward_join_299: {
    forward_join_285: {
    forward_join_231: {
    forward_join_229: {
    forward_join_225: {
    forward_join_224: {
    forward_join_198: {
    forward_join_176: {
    forward_join_147: {
    forward_join_144: {
    forward_join_143: {
    forward_join_83: {
    forward_join_81: {
    forward_join_69: {
    forward_join_60: {
    forward_join_49: {
    life2_3 = (__fieldRead1632_0() ^ 107836858087534L);
    __call1632_3(p0, receiver, __call1632_2(__fieldRead1632_1(receiver)));
    spill1632_0 = __call1632_4();
    life5_17 = __call1632_8(__fieldRead1632_5(receiver), __fieldRead1632_7(__fieldRead1632_6(receiver)));
    life6_22 = __call1632_11(__fieldRead1632_10(__fieldRead1632_9(receiver)));
    life4_23 = spill1632_0;
    life7_25 = 0;
    life8_28 = __call1632_12(p0);
    life9_32 = __call1632_14(__call1632_13(p0));
    __call1632_16(__fieldRead1632_15(receiver));
    spill1632_1 = __call1632_17(p0);
    spill1632_2 = __invokedynamic1632_18(25556, (7890173824617280756L ^ life2_3));
    if (!((life4_23 == null))) {
        forwardValue1632_69_0 = spill1632_1;
        forwardValue1632_69_1 = spill1632_2;
        break forward_join_69;
    }
    if (!((spill1632_1 == spill1632_2))) {
        break forward_join_60;
    }
    if (!((life6_22 == null))) {
        break forward_join_49;
    }
    return;
    }
    __call1632_22(__fieldRead1632_20(__fieldRead1632_19(receiver)), __fieldRead1632_21(receiver), life5_17, life6_22);
    if (!((life4_23 != null))) {
        break forward_join_176;
    }
    }
    spill1632_3 = __call1632_23(life8_28);
    if (!((life4_23 == null))) {
        forwardValue1632_83_0 = spill1632_3;
        break forward_join_83;
    }
    forwardValue1632_69_0 = spill1632_3;
    forwardValue1632_69_1 = (__call1632_25(__fieldRead1632_24(receiver)) - 1);
    }
    if (!((forwardValue1632_69_0 >= forwardValue1632_69_1))) {
        break forward_join_81;
    }
    if (!((life9_32 != __fieldRead1632_26()))) {
        break forward_join_147;
    }
    spill1632_4 = __call1632_27(life8_28);
    if (!((life4_23 == null))) {
        forwardValue1632_83_0 = spill1632_4;
        break forward_join_83;
    }
    if (!((spill1632_4 < __call1632_29(__fieldRead1632_28(receiver))))) {
        break forward_join_147;
    }
    }
    forwardValue1632_83_0 = __integerCategory1632_31(__fieldRead1632_30(receiver));
    }
    if (!((life4_23 == null))) {
        forwardValue1632_144_0 = forwardValue1632_83_0;
        break forward_join_144;
    }
    if (!((forwardValue1632_83_0 != 0))) {
        break forward_join_143;
    }
    spill1632_5 = __numericCompare1632_37(__call1632_36(__fieldRead1632_32(receiver), (((double) __call1632_33(life8_28)) + 0x1.0p-1d), (((double) __call1632_34(life8_28)) + 0x1.0p-1d), (((double) __call1632_35(life8_28)) + 0x1.0p-1d)), 0x1.0p6d);
    if (!((life4_23 == null))) {
        forwardValue1632_144_0 = spill1632_5;
        break forward_join_144;
    }
    if (!((spill1632_5 < 0))) {
        break forward_join_143;
    }
    spill1632_6 = __call1632_40(__fieldRead1632_38(receiver), life5_17, life8_28, __fieldRead1632_39(receiver));
    if (!((life4_23 == null))) {
        forwardValue1632_144_0 = __integerCategory1632_41(spill1632_6);
        break forward_join_144;
    }
    if (!((!spill1632_6))) {
        break forward_join_143;
    }
    spill1632_7 = __call1632_43(__call1632_42(life5_17), life8_28);
    if (!((life4_23 == null))) {
        forwardValue1632_144_0 = __integerCategory1632_44(spill1632_7);
        break forward_join_144;
    }
    if (!(spill1632_7)) {
        break forward_join_143;
    }
    __call1632_51(__fieldRead1632_46(__fieldRead1632_45(receiver)), __fieldRead1632_47(receiver), life5_17, life6_22, life8_28, life9_32, __call1632_48(p0), __call1632_49(p0), __call1632_50(p0));
    }
    forwardValue1632_144_0 = 1;
    }
    life7_25 = forwardValue1632_144_0;
    if (!((life4_23 != null))) {
        break forward_join_176;
    }
    }
    life10_210 = new moom.CN("build.tooHigh", new java.lang.Object[] {__call1632_54(__call1632_53(__fieldRead1632_52(receiver)))});
    __call1632_57(__call1632_55(life10_210), __fieldRead1632_56());
    __call1632_60(__fieldRead1632_59(__fieldRead1632_58(receiver)), new moom.zv(life10_210));
    life7_25 = 1;
    }
    if (!((life7_25 != 0))) {
        break forward_join_198;
    }
    __call1632_63(__fieldRead1632_62(__fieldRead1632_61(receiver)), new moom.z5(life5_17, life8_28));
    __call1632_67(__fieldRead1632_65(__fieldRead1632_64(receiver)), new moom.z5(life5_17, __call1632_66(life8_28, life9_32)));
    }
    life6_255 = __call1632_70(__fieldRead1632_69(__fieldRead1632_68(receiver)));
    spill1632_8 = life6_255;
    if (!((life4_23 == null))) {
        forwardValue1632_225_0 = spill1632_8;
        break forward_join_225;
    }
    if (!((spill1632_8 != null))) {
        break forward_join_224;
    }
    spill1632_9 = life6_255;
    if (!((life4_23 == null))) {
        forwardValue1632_225_0 = spill1632_9;
        break forward_join_225;
    }
    if (!((__fieldRead1632_71(spill1632_9) == 0))) {
        break forward_join_224;
    }
    (__fieldRead1632_74(__fieldRead1632_73(__fieldRead1632_72(receiver))))[__fieldRead1632_77(__fieldRead1632_76(__fieldRead1632_75(receiver)))] = null;
    life6_255 = null;
    }
    forwardValue1632_225_0 = life6_255;
    }
    if (!((life4_23 == null))) {
        forwardValue1632_229_0 = forwardValue1632_225_0;
        break forward_join_229;
    }
    if (!((forwardValue1632_225_0 != null))) {
        break forward_join_231;
    }
    forwardValue1632_229_0 = life6_255;
    }
    if (!((__call1632_78(forwardValue1632_229_0) == 0))) {
        break forward_join_299;
    }
    }
    __fieldWrite1632_80(__fieldRead1632_79(receiver), 1);
    (__fieldRead1632_83(__fieldRead1632_82(__fieldRead1632_81(receiver))))[__fieldRead1632_86(__fieldRead1632_85(__fieldRead1632_84(receiver)))] = __call1632_93((__fieldRead1632_89(__fieldRead1632_88(__fieldRead1632_87(receiver))))[__fieldRead1632_92(__fieldRead1632_91(__fieldRead1632_90(receiver)))]);
    life10_330 = __call1632_101(__fieldRead1632_95(__fieldRead1632_94(receiver)), __fieldRead1632_97(__fieldRead1632_96(receiver)), __fieldRead1632_100(__fieldRead1632_99(__fieldRead1632_98(receiver))));
    __call1632_104(__fieldRead1632_103(__fieldRead1632_102(receiver)));
    __fieldWrite1632_106(__fieldRead1632_105(receiver), 0);
    spill1632_10 = receiver;
    if (!((life4_23 == null))) {
        forwardValue1632_285_0 = spill1632_10;
        break forward_join_285;
    }
    if (!((!__call1632_111(__call1632_109(__fieldRead1632_108(__fieldRead1632_107(spill1632_10))), __call1632_110(p0))))) {
        break forward_join_299;
    }
    forwardValue1632_285_0 = receiver;
    }
    __call1632_119(forwardValue1632_285_0, new moom.Ag(__fieldRead1632_114(__fieldRead1632_113(__fieldRead1632_112(receiver))), __fieldRead1632_115(life10_330), __call1632_118(__fieldRead1632_117(__fieldRead1632_116(receiver)))));
    }
    return;
}
public static void h1632_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163200_0(p0);
}
public static void h1632_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163201_0(p0);
}
public static void h1632_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163202_0(p0);
}
public static void h1632_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163203_0(p0);
}
public static void h1632_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163204_0(p0);
}
public static void h1632_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163205_0(p0);
}
public static void h1632_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163206_0(p0);
}
public static void h1632_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163207_0(p0);
}
public static void h1632_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163208_0(p0);
}
public static void h1632_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163209_0(p0);
}
public static void h1632_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163210_0(p0);
}
public static void h1632_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163211_0(p0);
}
public static void h1632_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163212_0(p0);
}
public static void h1632_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163213_0(p0);
}
public static void h1632_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163214_0(p0);
}
public static void h1632_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163215_0(p0);
}
public static void h1632_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163216_0(p0);
}
public static void h1632_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163217_0(p0);
}
public static void h1632_18(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163218_0(p0);
}
public static void h1632_19(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163219_0(p0);
}
public static void h1632_20(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163220_0(p0);
}
public static void h1632_21(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163221_0(p0);
}
public static void h1632_22(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163222_0(p0);
}
public static void h1632_23(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163223_0(p0);
}
private static native long __fieldRead1632_0() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_1(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1632_2(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1632_3(moom.zb a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native java.lang.String __call1632_4() throws Throwable;
private static native moom.Bl __fieldRead1632_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_6(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __fieldRead1632_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1632_8(moom.Bl a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_9(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1632_10(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1632_11(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native moom.DT __call1632_12(moom.zb a0) throws Throwable;
private static native int __call1632_13(moom.zb a0) throws Throwable;
private static native moom.bs __call1632_14(int a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_15(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1632_16(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1632_17(moom.zb a0) throws Throwable;
private static native int __invokedynamic1632_18(int a0, long a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_19(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.Bo __fieldRead1632_20(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_21(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call1632_22(moom.Bo a0, net.minecraft.entity.player.EntityPlayerMP a1, net.minecraft.world.WorldServer a2, net.minecraft.item.ItemStack a3) throws Throwable;
private static native int __call1632_23(moom.DT a0) throws Throwable;
private static native moom.Bl __fieldRead1632_24(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __call1632_25(moom.Bl a0) throws Throwable;
private static native moom.bs __fieldRead1632_26() throws Throwable;
private static native int __call1632_27(moom.DT a0) throws Throwable;
private static native moom.Bl __fieldRead1632_28(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __call1632_29(moom.Bl a0) throws Throwable;
private static native boolean __fieldRead1632_30(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __integerCategory1632_31(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_32(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __call1632_33(moom.DT a0) throws Throwable;
private static native int __call1632_34(moom.DT a0) throws Throwable;
private static native int __call1632_35(moom.DT a0) throws Throwable;
private static native double __call1632_36(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3) throws Throwable;
private static native int __numericCompare1632_37(double a0, double a1) throws Throwable;
private static native moom.Bl __fieldRead1632_38(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_39(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call1632_40(moom.Bl a0, net.minecraft.world.WorldServer a1, moom.DT a2, net.minecraft.entity.player.EntityPlayerMP a3) throws Throwable;
private static native int __integerCategory1632_41(boolean value) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1632_42(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1632_43(net.minecraft.world.border.WorldBorder a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1632_44(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_45(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.Bo __fieldRead1632_46(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_47(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __call1632_48(moom.zb a0) throws Throwable;
private static native float __call1632_49(moom.zb a0) throws Throwable;
private static native float __call1632_50(moom.zb a0) throws Throwable;
private static native boolean __call1632_51(moom.Bo a0, net.minecraft.entity.player.EntityPlayerMP a1, net.minecraft.world.WorldServer a2, net.minecraft.item.ItemStack a3, moom.DT a4, moom.bs a5, float a6, float a7, float a8) throws Throwable;
private static native moom.Bl __fieldRead1632_52(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __call1632_53(moom.Bl a0) throws Throwable;
private static native java.lang.Integer __call1632_54(int a0) throws Throwable;
private static native moom.CO __call1632_55(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1632_56() throws Throwable;
private static native moom.CO __call1632_57(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_58(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1632_59(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1632_60(net.minecraft.network.NetHandlerPlayServer a0, moom.zv a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_61(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1632_62(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1632_63(net.minecraft.network.NetHandlerPlayServer a0, moom.z5 a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_64(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1632_65(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.DT __call1632_66(moom.DT a0, moom.bs a1) throws Throwable;
private static native void __call1632_67(net.minecraft.network.NetHandlerPlayServer a0, moom.z5 a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_68(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1632_69(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1632_70(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead1632_71(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_72(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1632_73(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1632_74(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_75(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1632_76(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1632_77(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __call1632_78(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_79(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite1632_80(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_81(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1632_82(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1632_83(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_84(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1632_85(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1632_86(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_87(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1632_88(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1632_89(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_90(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1632_91(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1632_92(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1632_93(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_94(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1632_95(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_96(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1632_97(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_98(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1632_99(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1632_100(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native moom.wB __call1632_101(moom.v8 a0, net.minecraft.entity.player.InventoryPlayer a1, int a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_102(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1632_103(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1632_104(moom.v8 a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_105(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite1632_106(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_107(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1632_108(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1632_109(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1632_110(moom.zb a0) throws Throwable;
private static native boolean __call1632_111(net.minecraft.item.ItemStack a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_112(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1632_113(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1632_114(moom.v8 a0) throws Throwable;
private static native int __fieldRead1632_115(moom.wB a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1632_116(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1632_117(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1632_118(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native void __call1632_119(net.minecraft.network.NetHandlerPlayServer a0, moom.Ag a1) throws Throwable;
private static native java.lang.Throwable __call1163200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163204_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163205_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163206_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163207_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163208_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163209_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163210_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163211_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163212_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163213_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163214_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163215_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163216_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163217_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163218_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163219_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163220_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163221_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163222_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163223_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_68eb4747b301a6504b9f(net.minecraft.network.NetHandlerPlayServer a0, moom.zc a1) throws E;
private static final class __SourceHandler_68eb4747b301a6504b9f {

public static void f1633(net.minecraft.network.NetHandlerPlayServer receiver, moom.zc p0) throws Throwable {
    int forwardValue1633_19_0;
    java.lang.String spill1633_0;
    int spill1633_1;
    long life2_3;
    java.lang.String life4_11;
    forward_join_38: {
    forward_join_32: {
    forward_join_19: {
    life2_3 = (__fieldRead1633_0() ^ 38156764535848L);
    spill1633_0 = __call1633_1();
    __call1633_4(p0, receiver, __call1633_3(__fieldRead1633_2(receiver)));
    life4_11 = spill1633_0;
    spill1633_1 = __call1633_5(p0);
    if (!((life4_11 == null))) {
        forwardValue1633_19_0 = spill1633_1;
        break forward_join_19;
    }
    if (!((spill1633_1 >= 0))) {
        break forward_join_32;
    }
    forwardValue1633_19_0 = __call1633_6(p0);
    }
    if (!((forwardValue1633_19_0 < __call1633_7()))) {
        break forward_join_32;
    }
    __fieldWrite1633_11(__fieldRead1633_9(__fieldRead1633_8(receiver)), __call1633_10(p0));
    __call1633_13(__fieldRead1633_12(receiver));
    if (!((life4_11 != null))) {
        break forward_join_38;
    }
    }
    __call1633_18(__fieldRead1633_14(), __invokedynamic1633_17(__call1633_16(__fieldRead1633_15(receiver))));
    }
    return;
}
public static void h1633_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163300_0(p0);
}
public static void h1633_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163301_0(p0);
}
public static void h1633_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163302_0(p0);
}
public static void h1633_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163303_0(p0);
}
private static native long __fieldRead1633_0() throws Throwable;
private static native java.lang.String __call1633_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1633_2(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1633_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1633_4(moom.zc a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native int __call1633_5(moom.zc a0) throws Throwable;
private static native int __call1633_6(moom.zc a0) throws Throwable;
private static native int __call1633_7() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1633_8(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1633_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1633_10(moom.zc a0) throws Throwable;
private static native void __fieldWrite1633_11(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1633_12(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1633_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1633_14() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1633_15(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call1633_16(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __invokedynamic1633_17(java.lang.String a0) throws Throwable;
private static native void __call1633_18(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1163300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163303_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d5c0c69d7ba187be5884(net.minecraft.network.NetHandlerPlayServer a0, moom.ze a1) throws E;
private static final class __SourceHandler_d5c0c69d7ba187be5884 {

public static void f563(net.minecraft.network.NetHandlerPlayServer receiver, moom.ze p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue563_68_0;
    net.minecraft.entity.Entity forwardValue563_84_0;
    java.lang.String spill563_0;
    net.minecraft.entity.Entity spill563_1;
    net.minecraft.entity.Entity spill563_2;
    long life2_3;
    java.lang.String life4_11;
    forward_join_95: {
    forward_join_90: {
    forward_join_84: {
    forward_join_74: {
    forward_join_68: {
    forward_join_58: {
    forward_join_47: {
    forward_join_41: {
    forward_join_35: {
    forward_join_29: {
    forward_join_27: {
    forward_join_23: {
    life2_3 = (__fieldRead563_0() ^ 3174533230777L);
    spill563_0 = __call563_1();
    __call563_4(p0, receiver, __call563_3(__fieldRead563_2(receiver)));
    life4_11 = spill563_0;
    __call563_6(__fieldRead563_5(receiver));
    if (!((life4_11 == null))) {
        break forward_join_27;
    }
    switch ((__fieldRead563_7())[__call563_9(__call563_8(p0))]) {
case 1:
{
        break forward_join_23;
    }
case 2:
{
        break forward_join_29;
    }
case 3:
{
        break forward_join_35;
    }
case 4:
{
        break forward_join_41;
    }
case 5:
{
        break forward_join_47;
    }
case 6:
{
        break forward_join_58;
    }
case 7:
{
        break forward_join_74;
    }
default:
{
        break forward_join_90;
    }
}
    }
    __call563_11(__fieldRead563_10(receiver), 1);
    }
    if (!((life4_11 != null))) {
        break forward_join_95;
    }
    }
    __call563_13(__fieldRead563_12(receiver), 0);
    if (!((life4_11 != null))) {
        break forward_join_95;
    }
    }
    __call563_15(__fieldRead563_14(receiver), 1);
    if (!((life4_11 != null))) {
        break forward_join_95;
    }
    }
    __call563_17(__fieldRead563_16(receiver), 0);
    if (!((life4_11 != null))) {
        break forward_join_95;
    }
    }
    __call563_19(__fieldRead563_18(receiver), 0, 1, 1);
    __fieldWrite563_20(receiver, 0);
    if (!((life4_11 != null))) {
        break forward_join_95;
    }
    }
    spill563_1 = __fieldRead563_22(__fieldRead563_21(receiver));
    if (!((life4_11 == null))) {
        forwardValue563_68_0 = spill563_1;
        break forward_join_68;
    }
    if (!((__instanceOf563_23(spill563_1) != 0))) {
        break forward_join_95;
    }
    forwardValue563_68_0 = __fieldRead563_25(__fieldRead563_24(receiver));
    }
    __call563_28(__cast563_26(forwardValue563_68_0), __call563_27(p0));
    if (!((life4_11 != null))) {
        break forward_join_95;
    }
    }
    spill563_2 = __fieldRead563_30(__fieldRead563_29(receiver));
    if (!((life4_11 == null))) {
        forwardValue563_84_0 = spill563_2;
        break forward_join_84;
    }
    if (!((__instanceOf563_31(spill563_2) != 0))) {
        break forward_join_95;
    }
    forwardValue563_84_0 = __fieldRead563_33(__fieldRead563_32(receiver));
    }
    __call563_36(__cast563_34(forwardValue563_84_0), __fieldRead563_35(receiver));
    if (!((life4_11 != null))) {
        break forward_join_95;
    }
    }
    throw new java.lang.IllegalArgumentException("Invalid client command!");
    }
    return;
}
public static void h563_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056300_0(p0);
}
public static void h563_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056301_0(p0);
}
public static void h563_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056302_0(p0);
}
public static void h563_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056303_0(p0);
}
public static void h563_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056304_0(p0);
}
public static void h563_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056305_0(p0);
}
public static void h563_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056306_0(p0);
}
public static void h563_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056307_0(p0);
}
public static void h563_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056308_0(p0);
}
public static void h563_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056309_0(p0);
}
public static void h563_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056310_0(p0);
}
public static void h563_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056311_0(p0);
}
public static void h563_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056312_0(p0);
}
private static native long __fieldRead563_0() throws Throwable;
private static native java.lang.String __call563_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead563_2(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call563_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call563_4(moom.ze a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead563_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call563_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int[] __fieldRead563_7() throws Throwable;
private static native net.minecraft.network.play.client.C0BPacketEntityAction$Action __call563_8(moom.ze a0) throws Throwable;
private static native int __call563_9(net.minecraft.network.play.client.C0BPacketEntityAction$Action a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead563_10(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call563_11(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead563_12(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call563_13(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead563_14(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call563_15(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead563_16(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call563_17(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead563_18(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call563_19(net.minecraft.entity.player.EntityPlayerMP a0, int a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite563_20(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead563_21(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead563_22(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf563_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead563_24(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead563_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.passive.EntityHorse __cast563_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call563_27(moom.ze a0) throws Throwable;
private static native void __call563_28(net.minecraft.entity.passive.EntityHorse a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead563_29(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead563_30(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf563_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead563_32(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead563_33(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.passive.EntityHorse __cast563_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead563_35(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call563_36(net.minecraft.entity.passive.EntityHorse a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native java.lang.Throwable __call2056300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056303_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056304_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056305_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056306_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056307_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056308_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056309_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056310_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056311_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056312_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_46314390620990f687eb(net.minecraft.network.NetHandlerPlayServer a0, moom.zh a1) throws E;
private static final class __SourceHandler_46314390620990f687eb {

public static void f1634(net.minecraft.network.NetHandlerPlayServer receiver, moom.zh p0) throws Throwable {
    int lexicalValue1634_30_0;
    int lexicalValue1634_38_0;
    net.minecraft.entity.player.EntityPlayerMP lexicalValue1634_77_0;
    java.lang.String spill1634_0;
    int spill1634_1;
    net.minecraft.entity.player.EntityPlayerMP spill1634_2;
    long life2_3;
    java.lang.String life4_14;
    java.util.ArrayList life5_55;
    int life6_57;
    net.minecraft.item.ItemStack life5_108;
    java.util.ArrayList life6_184;
    int life7_186;
    lexical_join_187: {
    lexical_join_180: {
    lexical_join_153: {
    lexical_join_124: {
    lexical_join_77: {
    lexical_join_75: {
    lexical_join_73: {
    lexical_join_66: {
    lexical_join_38: {
    lexical_join_30: {
    life2_3 = (__fieldRead1634_0() ^ 30198694767821L);
    __call1634_3(p0, receiver, __call1634_2(__fieldRead1634_1(receiver)));
    spill1634_0 = __call1634_4();
    __call1634_6(__fieldRead1634_5(receiver));
    life4_14 = spill1634_0;
    spill1634_1 = __fieldRead1634_9(__fieldRead1634_8(__fieldRead1634_7(receiver)));
    if (!((life4_14 == null))) {
        lexicalValue1634_30_0 = spill1634_1;
        break lexical_join_30;
    }
    if (!((spill1634_1 == __call1634_10(p0)))) {
        break lexical_join_187;
    }
    lexicalValue1634_30_0 = __integerCategory1634_15(__call1634_14(__fieldRead1634_12(__fieldRead1634_11(receiver)), __fieldRead1634_13(receiver)));
    }
    if (!((life4_14 == null))) {
        lexicalValue1634_38_0 = lexicalValue1634_30_0;
        break lexical_join_38;
    }
    if (!((lexicalValue1634_30_0 != 0))) {
        break lexical_join_187;
    }
    spill1634_2 = __fieldRead1634_16(receiver);
    if (!((life4_14 == null))) {
        lexicalValue1634_77_0 = spill1634_2;
        break lexical_join_77;
    }
    lexicalValue1634_38_0 = __integerCategory1634_18(__call1634_17(spill1634_2));
    }
    if (!((lexicalValue1634_38_0 != 0))) {
        break lexical_join_75;
    }
    life5_55 = __call1634_19();
    life6_57 = 0;
    lexical_cycle_43: while (true) {
    if (!((life6_57 < __call1634_23(__fieldRead1634_22(__fieldRead1634_21(__fieldRead1634_20(receiver))))))) {
        break lexical_join_66;
    }
    __call1634_30(life5_55, __call1634_29(__cast1634_28(__call1634_27(__fieldRead1634_26(__fieldRead1634_25(__fieldRead1634_24(receiver))), life6_57))));
    life6_57 += 1;
    if (!((life4_14 == null))) {
        break lexical_join_73;
    }
    if (!((life4_14 != null))) { continue lexical_cycle_43; }
    break lexical_cycle_43;
    }
    }
    __call1634_34(__fieldRead1634_31(receiver), __fieldRead1634_33(__fieldRead1634_32(receiver)), life5_55);
    }
    if (!((life4_14 != null))) {
        break lexical_join_187;
    }
    }
    lexicalValue1634_77_0 = __fieldRead1634_35(receiver);
    }
    life5_108 = __call1634_41(__fieldRead1634_36(lexicalValue1634_77_0), __call1634_37(p0), __call1634_38(p0), __call1634_39(p0), __fieldRead1634_40(receiver));
    if (!((life4_14 == null))) {
        break lexical_join_153;
    }
    if (!(__call1634_43(__call1634_42(p0), life5_108))) {
        break lexical_join_124;
    }
    __call1634_48(__fieldRead1634_45(__fieldRead1634_44(receiver)), new moom.Aj(__call1634_46(p0), __call1634_47(p0), true));
    __fieldWrite1634_50(__fieldRead1634_49(receiver), 1);
    __call1634_53(__fieldRead1634_52(__fieldRead1634_51(receiver)));
    __call1634_55(__fieldRead1634_54(receiver));
    __fieldWrite1634_57(__fieldRead1634_56(receiver), 0);
    if (!((life4_14 != null))) {
        break lexical_join_187;
    }
    }
    __call1634_64(__fieldRead1634_58(receiver), __fieldRead1634_61(__fieldRead1634_60(__fieldRead1634_59(receiver))), __call1634_63(__call1634_62(p0)));
    __call1634_69(__fieldRead1634_66(__fieldRead1634_65(receiver)), new moom.Aj(__call1634_67(p0), __call1634_68(p0), false));
    __call1634_73(__fieldRead1634_71(__fieldRead1634_70(receiver)), __fieldRead1634_72(receiver), 0);
    }
    life6_184 = __call1634_74();
    life7_186 = 0;
    lexical_cycle_157: while (true) {
    if (!((life7_186 < __call1634_78(__fieldRead1634_77(__fieldRead1634_76(__fieldRead1634_75(receiver))))))) {
        break lexical_join_180;
    }
    __call1634_85(life6_184, __call1634_84(__cast1634_83(__call1634_82(__fieldRead1634_81(__fieldRead1634_80(__fieldRead1634_79(receiver))), life7_186))));
    life7_186 += 1;
    if (!((life4_14 == null))) {
        break lexical_join_187;
    }
    if (!((life4_14 != null))) { continue lexical_cycle_157; }
    break lexical_cycle_157;
    }
    }
    __call1634_89(__fieldRead1634_86(receiver), __fieldRead1634_88(__fieldRead1634_87(receiver)), life6_184);
    }
    return;
}
public static void h1634_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163400_0(p0);
}
public static void h1634_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163401_0(p0);
}
public static void h1634_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163402_0(p0);
}
public static void h1634_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163403_0(p0);
}
public static void h1634_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163404_0(p0);
}
public static void h1634_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163405_0(p0);
}
public static void h1634_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163406_0(p0);
}
public static void h1634_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163407_0(p0);
}
public static void h1634_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163408_0(p0);
}
public static void h1634_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163409_0(p0);
}
public static void h1634_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163410_0(p0);
}
private static native long __fieldRead1634_0() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_1(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1634_2(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1634_3(moom.zh a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native java.lang.String __call1634_4() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1634_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_7(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1634_8(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1634_9(moom.v8 a0) throws Throwable;
private static native int __call1634_10(moom.zh a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_11(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1634_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_13(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call1634_14(moom.v8 a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native int __integerCategory1634_15(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_16(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call1634_17(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory1634_18(boolean value) throws Throwable;
private static native java.util.ArrayList __call1634_19() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_20(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1634_21(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.util.List __fieldRead1634_22(moom.v8 a0) throws Throwable;
private static native int __call1634_23(java.util.List a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_24(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1634_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.util.List __fieldRead1634_26(moom.v8 a0) throws Throwable;
private static native java.lang.Object __call1634_27(java.util.List a0, int a1) throws Throwable;
private static native moom.wB __cast1634_28(java.lang.Object a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1634_29(moom.wB a0) throws Throwable;
private static native boolean __call1634_30(java.util.ArrayList a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_31(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_32(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1634_33(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1634_34(net.minecraft.entity.player.EntityPlayerMP a0, moom.v8 a1, java.util.ArrayList a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_35(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1634_36(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1634_37(moom.zh a0) throws Throwable;
private static native int __call1634_38(moom.zh a0) throws Throwable;
private static native int __call1634_39(moom.zh a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_40(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1634_41(moom.v8 a0, int a1, int a2, int a3, net.minecraft.entity.player.EntityPlayerMP a4) throws Throwable;
private static native net.minecraft.item.ItemStack __call1634_42(moom.zh a0) throws Throwable;
private static native boolean __call1634_43(net.minecraft.item.ItemStack a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_44(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1634_45(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1634_46(moom.zh a0) throws Throwable;
private static native short __call1634_47(moom.zh a0) throws Throwable;
private static native void __call1634_48(net.minecraft.network.NetHandlerPlayServer a0, moom.Aj a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_49(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite1634_50(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_51(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1634_52(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1634_53(moom.v8 a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_54(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1634_55(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_56(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite1634_57(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native moom.Dd __fieldRead1634_58(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_59(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1634_60(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1634_61(moom.v8 a0) throws Throwable;
private static native short __call1634_62(moom.zh a0) throws Throwable;
private static native java.lang.Short __call1634_63(short a0) throws Throwable;
private static native void __call1634_64(moom.Dd a0, int a1, java.lang.Short a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_65(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1634_66(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1634_67(moom.zh a0) throws Throwable;
private static native short __call1634_68(moom.zh a0) throws Throwable;
private static native void __call1634_69(net.minecraft.network.NetHandlerPlayServer a0, moom.Aj a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_70(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1634_71(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_72(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1634_73(moom.v8 a0, net.minecraft.entity.player.EntityPlayerMP a1, int a2) throws Throwable;
private static native java.util.ArrayList __call1634_74() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_75(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1634_76(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.util.List __fieldRead1634_77(moom.v8 a0) throws Throwable;
private static native int __call1634_78(java.util.List a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_79(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1634_80(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.util.List __fieldRead1634_81(moom.v8 a0) throws Throwable;
private static native java.lang.Object __call1634_82(java.util.List a0, int a1) throws Throwable;
private static native moom.wB __cast1634_83(java.lang.Object a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1634_84(moom.wB a0) throws Throwable;
private static native boolean __call1634_85(java.util.ArrayList a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_86(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1634_87(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1634_88(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1634_89(net.minecraft.entity.player.EntityPlayerMP a0, moom.v8 a1, java.util.ArrayList a2) throws Throwable;
private static native java.lang.Throwable __call1163400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163401_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163402_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163403_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163404_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163405_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163406_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163407_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163408_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163409_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163410_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_75ec0a2ffbe97ccc6fd1(net.minecraft.network.NetHandlerPlayServer a0, moom.zi a1) throws E;
private static final class __SourceHandler_75ec0a2ffbe97ccc6fd1 {

public static void f1131(net.minecraft.network.NetHandlerPlayServer receiver, moom.zi p0) throws Throwable {
    int forestValue1131_38_0;
    int forestValue1131_38_1;
    int forestValue1131_45_0;
    int forestValue1131_53_0;
    net.minecraft.entity.player.EntityPlayerMP forestValue1131_56_0;
    java.lang.String spill1131_0;
    short spill1131_1;
    short spill1131_2;
    int spill1131_3;
    net.minecraft.entity.player.EntityPlayerMP spill1131_4;
    long life2_3;
    java.lang.String life4_11;
    java.lang.Short life5_20;
    forest_join_61: {
    forest_join_56: {
    forest_join_53: {
    forest_join_45: {
    forest_join_38: {
    life2_3 = (__fieldRead1131_0() ^ 81766568724433L);
    spill1131_0 = __call1131_1();
    __call1131_4(p0, receiver, __call1131_3(__fieldRead1131_2(receiver)));
    life4_11 = spill1131_0;
    life5_20 = __cast1131_10(__call1131_9(__fieldRead1131_5(receiver), __fieldRead1131_8(__fieldRead1131_7(__fieldRead1131_6(receiver)))));
    if (!((life5_20 != null))) {
        break forest_join_61;
    }
    spill1131_1 = __call1131_11(p0);
    spill1131_2 = __call1131_12(life5_20);
    if (!((life4_11 == null))) {
        forestValue1131_38_0 = __integerCategory1131_13(spill1131_1);
        forestValue1131_38_1 = __integerCategory1131_14(spill1131_2);
        break forest_join_38;
    }
    if (!((spill1131_1 == spill1131_2))) {
        break forest_join_61;
    }
    spill1131_3 = __fieldRead1131_17(__fieldRead1131_16(__fieldRead1131_15(receiver)));
    if (!((life4_11 == null))) {
        forestValue1131_45_0 = spill1131_3;
        break forest_join_45;
    }
    forestValue1131_38_0 = spill1131_3;
    forestValue1131_38_1 = __call1131_18(p0);
    }
    if (!((forestValue1131_38_0 == forestValue1131_38_1))) {
        break forest_join_61;
    }
    forestValue1131_45_0 = __integerCategory1131_23(__call1131_22(__fieldRead1131_20(__fieldRead1131_19(receiver)), __fieldRead1131_21(receiver)));
    }
    if (!((life4_11 == null))) {
        forestValue1131_53_0 = forestValue1131_45_0;
        break forest_join_53;
    }
    if (!((forestValue1131_45_0 == 0))) {
        break forest_join_61;
    }
    spill1131_4 = __fieldRead1131_24(receiver);
    if (!((life4_11 == null))) {
        forestValue1131_56_0 = spill1131_4;
        break forest_join_56;
    }
    forestValue1131_53_0 = __integerCategory1131_26(__call1131_25(spill1131_4));
    }
    if (!((forestValue1131_53_0 == 0))) {
        break forest_join_61;
    }
    forestValue1131_56_0 = __fieldRead1131_27(receiver);
    }
    __call1131_30(__fieldRead1131_28(forestValue1131_56_0), __fieldRead1131_29(receiver), 1);
    }
    return;
}
public static void h1131_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3113100_0(p0);
}
public static void h1131_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3113101_0(p0);
}
public static void h1131_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3113102_0(p0);
}
public static void h1131_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3113103_0(p0);
}
public static void h1131_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3113104_0(p0);
}
public static void h1131_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3113105_0(p0);
}
public static void h1131_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3113106_0(p0);
}
public static void h1131_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3113107_0(p0);
}
public static void h1131_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3113108_0(p0);
}
private static native long __fieldRead1131_0() throws Throwable;
private static native java.lang.String __call1131_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1131_2(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1131_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1131_4(moom.zi a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native moom.Dd __fieldRead1131_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1131_6(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1131_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1131_8(moom.v8 a0) throws Throwable;
private static native java.lang.Object __call1131_9(moom.Dd a0, int a1) throws Throwable;
private static native java.lang.Short __cast1131_10(java.lang.Object a0) throws Throwable;
private static native short __call1131_11(moom.zi a0) throws Throwable;
private static native short __call1131_12(java.lang.Short a0) throws Throwable;
private static native int __integerCategory1131_13(short value) throws Throwable;
private static native int __integerCategory1131_14(short value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1131_15(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1131_16(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead1131_17(moom.v8 a0) throws Throwable;
private static native int __call1131_18(moom.zi a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1131_19(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1131_20(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1131_21(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call1131_22(moom.v8 a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native int __integerCategory1131_23(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1131_24(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call1131_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory1131_26(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1131_27(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead1131_28(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1131_29(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1131_30(moom.v8 a0, net.minecraft.entity.player.EntityPlayerMP a1, int a2) throws Throwable;
private static native java.lang.Throwable __call3113100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3113101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3113102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3113103_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3113104_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3113105_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3113106_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3113107_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call3113108_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b679bcc70d3627df4c98(net.minecraft.network.NetHandlerPlayServer a0, moom.zj a1) throws E;
private static final class __SourceHandler_b679bcc70d3627df4c98 {

public static void f269(net.minecraft.network.NetHandlerPlayServer receiver, moom.zj p0) throws Throwable {
    int forwardValue269_21_0;
    int forwardValue269_25_0;
    int forwardValue269_27_0;
    net.minecraft.item.ItemStack forwardValue269_36_0;
    int forwardValue269_118_0;
    int forwardValue269_133_0;
    int forwardValue269_133_1;
    int forwardValue269_135_0;
    int forwardValue269_137_0;
    net.minecraft.item.ItemStack forwardValue269_143_0;
    int forwardValue269_148_0;
    net.minecraft.item.ItemStack forwardValue269_154_0;
    int forwardValue269_160_0;
    int forwardValue269_170_0;
    int forwardValue269_174_0;
    int forwardValue269_176_0;
    int forwardValue269_206_0;
    int forwardValue269_210_0;
    int forwardValue269_214_0;
    int forwardValue269_221_0;
    net.minecraft.network.NetHandlerPlayServer forwardValue269_238_0;
    net.minecraft.entity.item.EntityItem forwardValue269_248_0;
    java.lang.String spill269_0;
    boolean spill269_1;
    net.minecraft.item.ItemStack spill269_2;
    boolean spill269_3;
    boolean spill269_4;
    boolean spill269_5;
    boolean spill269_6;
    boolean spill269_7;
    int spill269_8;
    int spill269_9;
    net.minecraft.item.ItemStack spill269_10;
    net.minecraft.item.ItemStack spill269_11;
    int spill269_12;
    int spill269_13;
    int spill269_14;
    int spill269_15;
    net.minecraft.network.NetHandlerPlayServer spill269_16;
    net.minecraft.entity.item.EntityItem spill269_17;
    long life2_3;
    java.lang.String life4_11;
    int life5_36;
    net.minecraft.item.ItemStack life6_39;
    net.minecraft.nbt.NBTTagCompound life7_77;
    moom.DT life8_123;
    net.minecraft.tileentity.TileEntity life9_129;
    net.minecraft.nbt.NBTTagCompound life10_135;
    int life7_182;
    int life8_198;
    int life9_244;
    net.minecraft.entity.item.EntityItem life10_349;
    forward_join_249: {
    forward_join_248: {
    forward_join_238: {
    forward_join_221: {
    forward_join_214: {
    forward_join_210: {
    forward_join_206: {
    forward_join_205: {
    forward_join_176: {
    forward_join_175: {
    forward_join_174: {
    forward_join_173: {
    forward_join_170: {
    forward_join_160: {
    forward_join_154: {
    forward_join_148: {
    forward_join_147: {
    forward_join_145: {
    forward_join_143: {
    forward_join_137: {
    forward_join_136: {
    forward_join_135: {
    forward_join_133: {
    forward_join_118: {
    forward_join_116: {
    forward_join_36: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_21: {
    life2_3 = (__fieldRead269_0() ^ 34882742484648L);
    spill269_0 = __call269_1();
    __call269_4(p0, receiver, __call269_3(__fieldRead269_2(receiver)));
    life4_11 = spill269_0;
    spill269_1 = __call269_7(__fieldRead269_6(__fieldRead269_5(receiver)));
    if (!((life4_11 == null))) {
        forwardValue269_21_0 = __integerCategory269_8(spill269_1);
        break forward_join_21;
    }
    if (!(spill269_1)) {
        break forward_join_249;
    }
    forwardValue269_21_0 = __call269_9(p0);
    }
    if (!((life4_11 == null))) {
        forwardValue269_25_0 = forwardValue269_21_0;
        break forward_join_25;
    }
    if (!((forwardValue269_21_0 < 0))) {
        break forward_join_26;
    }
    forwardValue269_25_0 = 1;
    }
    forwardValue269_27_0 = forwardValue269_25_0;
    break forward_join_27;
    }
    forwardValue269_27_0 = 0;
    }
    life5_36 = forwardValue269_27_0;
    life6_39 = __call269_10(p0);
    spill269_2 = life6_39;
    if (!((life4_11 == null))) {
        forwardValue269_36_0 = spill269_2;
        break forward_join_36;
    }
    if (!((spill269_2 != null))) {
        break forward_join_116;
    }
    forwardValue269_36_0 = life6_39;
    }
    spill269_3 = __call269_11(forwardValue269_36_0);
    if (!((life4_11 == null))) {
        forwardValue269_118_0 = __integerCategory269_12(spill269_3);
        break forward_join_118;
    }
    if (!(spill269_3)) {
        break forward_join_116;
    }
    spill269_4 = __call269_15(__call269_13(life6_39), "BlockEntityTag", __invokedynamic269_14(32065, (5105625636999507104L ^ life2_3)));
    if (!((life4_11 == null))) {
        forwardValue269_118_0 = __integerCategory269_16(spill269_4);
        break forward_join_118;
    }
    if (!(spill269_4)) {
        break forward_join_116;
    }
    life7_77 = __call269_18(__call269_17(life6_39), "BlockEntityTag");
    spill269_5 = __call269_19(life7_77, "x");
    if (!((life4_11 == null))) {
        forwardValue269_118_0 = __integerCategory269_20(spill269_5);
        break forward_join_118;
    }
    if (!(spill269_5)) {
        break forward_join_116;
    }
    spill269_6 = __call269_21(life7_77, "y");
    if (!((life4_11 == null))) {
        forwardValue269_118_0 = __integerCategory269_22(spill269_6);
        break forward_join_118;
    }
    if (!(spill269_6)) {
        break forward_join_116;
    }
    spill269_7 = __call269_23(life7_77, "z");
    if (!((life4_11 == null))) {
        forwardValue269_118_0 = __integerCategory269_24(spill269_7);
        break forward_join_118;
    }
    if (!(spill269_7)) {
        break forward_join_116;
    }
    life8_123 = new moom.DT(__call269_25(life7_77, "x"), __call269_26(life7_77, "y"), __call269_27(life7_77, "z"));
    life9_129 = __call269_30(__fieldRead269_29(__fieldRead269_28(receiver)), life8_123);
    if (!((life9_129 != null))) {
        break forward_join_116;
    }
    life10_135 = new net.minecraft.nbt.NBTTagCompound();
    __call269_31(life9_129, life10_135);
    __call269_32(life10_135, "x");
    __call269_33(life10_135, "y");
    __call269_34(life10_135, "z");
    __call269_35(life6_39, "BlockEntityTag", life10_135);
    }
    forwardValue269_118_0 = __call269_36(p0);
    }
    spill269_8 = 1;
    if (!((life4_11 == null))) {
        forwardValue269_133_0 = forwardValue269_118_0;
        forwardValue269_133_1 = spill269_8;
        break forward_join_133;
    }
    if (!((forwardValue269_118_0 >= spill269_8))) {
        break forward_join_136;
    }
    spill269_9 = __call269_37(p0);
    if (!((life4_11 == null))) {
        forwardValue269_135_0 = spill269_9;
        break forward_join_135;
    }
    forwardValue269_133_0 = spill269_9;
    forwardValue269_133_1 = (__invokedynamic269_38(21653, (6936128793342182769L ^ life2_3)) + __call269_39());
    }
    if (!((forwardValue269_133_0 < forwardValue269_133_1))) {
        break forward_join_136;
    }
    forwardValue269_135_0 = 1;
    }
    forwardValue269_137_0 = forwardValue269_135_0;
    break forward_join_137;
    }
    forwardValue269_137_0 = 0;
    }
    life7_182 = forwardValue269_137_0;
    spill269_10 = life6_39;
    if (!((life4_11 == null))) {
        forwardValue269_143_0 = spill269_10;
        break forward_join_143;
    }
    if (!((spill269_10 != null))) {
        break forward_join_145;
    }
    forwardValue269_143_0 = life6_39;
    }
    if (!((__call269_40(forwardValue269_143_0) != null))) {
        break forward_join_147;
    }
    }
    forwardValue269_148_0 = 1;
    break forward_join_148;
    }
    forwardValue269_148_0 = 0;
    }
    life8_198 = forwardValue269_148_0;
    spill269_11 = life6_39;
    if (!((life4_11 == null))) {
        forwardValue269_154_0 = spill269_11;
        break forward_join_154;
    }
    if (!((spill269_11 != null))) {
        break forward_join_173;
    }
    forwardValue269_154_0 = life6_39;
    }
    spill269_12 = __call269_41(forwardValue269_154_0);
    if (!((life4_11 == null))) {
        forwardValue269_160_0 = spill269_12;
        break forward_join_160;
    }
    if (!((spill269_12 >= 0))) {
        break forward_join_175;
    }
    forwardValue269_160_0 = __fieldRead269_42(life6_39);
    }
    if (!((life4_11 == null))) {
        forwardValue269_170_0 = forwardValue269_160_0;
        break forward_join_170;
    }
    if (!((forwardValue269_160_0 <= __invokedynamic269_43(10290, (408679570069486047L ^ life2_3))))) {
        break forward_join_175;
    }
    forwardValue269_170_0 = __fieldRead269_44(life6_39);
    }
    if (!((life4_11 == null))) {
        forwardValue269_174_0 = forwardValue269_170_0;
        break forward_join_174;
    }
    if (!((forwardValue269_170_0 > 0))) {
        break forward_join_175;
    }
    }
    forwardValue269_174_0 = 1;
    }
    forwardValue269_176_0 = forwardValue269_174_0;
    break forward_join_176;
    }
    forwardValue269_176_0 = 0;
    }
    life9_244 = forwardValue269_176_0;
    spill269_13 = life7_182;
    if (!((life4_11 == null))) {
        forwardValue269_206_0 = spill269_13;
        break forward_join_206;
    }
    if (!((spill269_13 != 0))) {
        break forward_join_205;
    }
    spill269_14 = life8_198;
    if (!((life4_11 == null))) {
        forwardValue269_206_0 = spill269_14;
        break forward_join_206;
    }
    if (!((spill269_14 != 0))) {
        break forward_join_205;
    }
    spill269_15 = life9_244;
    if (!((life4_11 == null))) {
        forwardValue269_206_0 = spill269_15;
        break forward_join_206;
    }
    if (!((spill269_15 != 0))) {
        break forward_join_205;
    }
    __call269_48(__fieldRead269_46(__fieldRead269_45(receiver)), __call269_47(p0), life6_39);
    __call269_52(__fieldRead269_50(__fieldRead269_49(receiver)), __fieldRead269_51(receiver), 1);
    if (!((life4_11 != null))) {
        break forward_join_249;
    }
    }
    forwardValue269_206_0 = life5_36;
    }
    if (!((life4_11 == null))) {
        forwardValue269_210_0 = forwardValue269_206_0;
        break forward_join_210;
    }
    if (!((forwardValue269_206_0 != 0))) {
        break forward_join_249;
    }
    forwardValue269_210_0 = life8_198;
    }
    if (!((life4_11 == null))) {
        forwardValue269_214_0 = forwardValue269_210_0;
        break forward_join_214;
    }
    if (!((forwardValue269_210_0 != 0))) {
        break forward_join_249;
    }
    forwardValue269_214_0 = life9_244;
    }
    if (!((life4_11 == null))) {
        forwardValue269_221_0 = forwardValue269_214_0;
        break forward_join_221;
    }
    if (!((forwardValue269_214_0 != 0))) {
        break forward_join_249;
    }
    spill269_16 = receiver;
    if (!((life4_11 == null))) {
        forwardValue269_238_0 = spill269_16;
        break forward_join_238;
    }
    forwardValue269_221_0 = __fieldRead269_53(spill269_16);
    }
    if (!((forwardValue269_221_0 < __invokedynamic269_54(15355, (3032611852891384337L ^ life2_3))))) {
        break forward_join_249;
    }
    net.minecraft.network.NetHandlerPlayServer __stackOp269_55_0 = receiver;
    __fieldWrite269_58(__stackOp269_55_0, (__fieldRead269_56(__stackOp269_55_0) + __invokedynamic269_57(24748, (6393217778934952256L ^ life2_3))));
    forwardValue269_238_0 = receiver;
    }
    life10_349 = __call269_60(__fieldRead269_59(forwardValue269_238_0), life6_39, 1);
    spill269_17 = life10_349;
    if (!((life4_11 == null))) {
        forwardValue269_248_0 = spill269_17;
        break forward_join_248;
    }
    if (!((spill269_17 != null))) {
        break forward_join_249;
    }
    forwardValue269_248_0 = life10_349;
    }
    __call269_61(forwardValue269_248_0);
    }
    return;
}
public static void h269_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026900_0(p0);
}
public static void h269_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026901_0(p0);
}
public static void h269_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026902_0(p0);
}
public static void h269_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026903_0(p0);
}
public static void h269_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026904_0(p0);
}
public static void h269_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026905_0(p0);
}
public static void h269_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026906_0(p0);
}
public static void h269_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026907_0(p0);
}
public static void h269_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026908_0(p0);
}
public static void h269_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026909_0(p0);
}
public static void h269_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026910_0(p0);
}
public static void h269_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026911_0(p0);
}
public static void h269_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026912_0(p0);
}
public static void h269_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026913_0(p0);
}
public static void h269_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026914_0(p0);
}
public static void h269_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026915_0(p0);
}
public static void h269_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026916_0(p0);
}
public static void h269_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026917_0(p0);
}
public static void h269_18(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026918_0(p0);
}
public static void h269_19(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026919_0(p0);
}
public static void h269_20(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026920_0(p0);
}
public static void h269_21(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026921_0(p0);
}
public static void h269_22(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026922_0(p0);
}
public static void h269_23(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026923_0(p0);
}
public static void h269_24(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026924_0(p0);
}
public static void h269_25(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026925_0(p0);
}
public static void h269_26(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026926_0(p0);
}
public static void h269_27(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026927_0(p0);
}
public static void h269_28(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026928_0(p0);
}
public static void h269_29(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026929_0(p0);
}
public static void h269_30(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026930_0(p0);
}
public static void h269_31(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026931_0(p0);
}
public static void h269_32(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026932_0(p0);
}
public static void h269_33(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026933_0(p0);
}
public static void h269_34(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026934_0(p0);
}
public static void h269_35(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026935_0(p0);
}
public static void h269_36(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1026936_0(p0);
}
private static native long __fieldRead269_0() throws Throwable;
private static native java.lang.String __call269_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead269_2(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call269_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call269_4(moom.zj a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead269_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.Bo __fieldRead269_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call269_7(moom.Bo a0) throws Throwable;
private static native int __integerCategory269_8(boolean value) throws Throwable;
private static native int __call269_9(moom.zj a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call269_10(moom.zj a0) throws Throwable;
private static native boolean __call269_11(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __integerCategory269_12(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call269_13(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __invokedynamic269_14(int a0, long a1) throws Throwable;
private static native boolean __call269_15(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory269_16(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call269_17(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call269_18(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __call269_19(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory269_20(boolean value) throws Throwable;
private static native boolean __call269_21(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory269_22(boolean value) throws Throwable;
private static native boolean __call269_23(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory269_24(boolean value) throws Throwable;
private static native int __call269_25(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __call269_26(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __call269_27(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead269_28(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead269_29(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call269_30(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native void __call269_31(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call269_32(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call269_33(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call269_34(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call269_35(net.minecraft.item.ItemStack a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native int __call269_36(moom.zj a0) throws Throwable;
private static native int __call269_37(moom.zj a0) throws Throwable;
private static native int __invokedynamic269_38(int a0, long a1) throws Throwable;
private static native int __call269_39() throws Throwable;
private static native net.minecraft.item.Item __call269_40(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call269_41(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead269_42(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __invokedynamic269_43(int a0, long a1) throws Throwable;
private static native int __fieldRead269_44(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead269_45(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead269_46(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call269_47(moom.zj a0) throws Throwable;
private static native void __call269_48(moom.v8 a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead269_49(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead269_50(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead269_51(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call269_52(moom.v8 a0, net.minecraft.entity.player.EntityPlayerMP a1, int a2) throws Throwable;
private static native int __fieldRead269_53(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __invokedynamic269_54(int a0, long a1) throws Throwable;
private static native int __fieldRead269_56(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __invokedynamic269_57(int a0, long a1) throws Throwable;
private static native void __fieldWrite269_58(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead269_59(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call269_60(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native void __call269_61(net.minecraft.entity.item.EntityItem a0) throws Throwable;
private static native java.lang.Throwable __call1026900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026902_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026903_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026904_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026905_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026906_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026907_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026908_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026909_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026910_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026911_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026912_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026913_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026914_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026915_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026916_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026917_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026918_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026919_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026920_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026921_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026922_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026923_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026924_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026925_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026926_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026927_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026928_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026929_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026930_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026931_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026932_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026933_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026934_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026935_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1026936_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a05f18976e9933895ccc(net.minecraft.network.NetHandlerPlayServer a0, moom.zk a1) throws E;
private static final class __SourceHandler_a05f18976e9933895ccc {

public static void f270(net.minecraft.network.NetHandlerPlayServer receiver, moom.zk p0) throws Throwable {
    int forwardValue270_30_0;
    int forwardValue270_36_0;
    int forwardValue270_47_0;
    java.lang.String spill270_0;
    int spill270_1;
    long life2_3;
    java.lang.String life4_11;
    forward_join_52: {
    forward_join_47: {
    forward_join_36: {
    forward_join_30: {
    life2_3 = (__fieldRead270_0() ^ 129970282843121L);
    spill270_0 = __call270_1();
    __call270_4(p0, receiver, __call270_3(__fieldRead270_2(receiver)));
    life4_11 = spill270_0;
    __call270_6(__fieldRead270_5(receiver));
    spill270_1 = __fieldRead270_9(__fieldRead270_8(__fieldRead270_7(receiver)));
    if (!((life4_11 == null))) {
        forwardValue270_30_0 = spill270_1;
        break forward_join_30;
    }
    if (!((spill270_1 == __call270_10(p0)))) {
        break forward_join_52;
    }
    forwardValue270_30_0 = __integerCategory270_15(__call270_14(__fieldRead270_12(__fieldRead270_11(receiver)), __fieldRead270_13(receiver)));
    }
    if (!((life4_11 == null))) {
        forwardValue270_36_0 = forwardValue270_30_0;
        break forward_join_36;
    }
    if (!((forwardValue270_30_0 != 0))) {
        break forward_join_52;
    }
    forwardValue270_36_0 = __integerCategory270_18(__call270_17(__fieldRead270_16(receiver)));
    }
    if (!((life4_11 == null))) {
        forwardValue270_47_0 = forwardValue270_36_0;
        break forward_join_47;
    }
    if (!((forwardValue270_36_0 == 0))) {
        break forward_join_52;
    }
    forwardValue270_47_0 = __integerCategory270_24(__call270_23(__fieldRead270_20(__fieldRead270_19(receiver)), __fieldRead270_21(receiver), __call270_22(p0)));
    }
    __discardScalar270_25(forwardValue270_47_0);
    __call270_28(__fieldRead270_27(__fieldRead270_26(receiver)));
    }
    return;
}
public static void h270_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027000_0(p0);
}
public static void h270_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027001_0(p0);
}
public static void h270_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027002_0(p0);
}
public static void h270_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027003_0(p0);
}
public static void h270_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027004_0(p0);
}
public static void h270_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027005_0(p0);
}
private static native long __fieldRead270_0() throws Throwable;
private static native java.lang.String __call270_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead270_2(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call270_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call270_4(moom.zk a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead270_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call270_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead270_7(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead270_8(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __fieldRead270_9(moom.v8 a0) throws Throwable;
private static native int __call270_10(moom.zk a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead270_11(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead270_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead270_13(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call270_14(moom.v8 a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native int __integerCategory270_15(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead270_16(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call270_17(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory270_18(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead270_19(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead270_20(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead270_21(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __call270_22(moom.zk a0) throws Throwable;
private static native boolean __call270_23(moom.v8 a0, net.minecraft.entity.player.EntityPlayerMP a1, int a2) throws Throwable;
private static native int __integerCategory270_24(boolean value) throws Throwable;
private static native void __discardScalar270_25(int a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead270_26(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead270_27(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call270_28(moom.v8 a0) throws Throwable;
private static native java.lang.Throwable __call1027000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027003_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027004_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027005_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f0089208936b9660daf5(net.minecraft.network.NetHandlerPlayServer a0, moom.zl a1) throws E;
private static final class __SourceHandler_f0089208936b9660daf5 {

public static void f1638(net.minecraft.network.NetHandlerPlayServer receiver, moom.zl p0) throws Throwable {
    net.minecraft.world.WorldServer lexicalValue1638_33_0;
    moom.DT lexicalValue1638_33_1;
    net.minecraft.tileentity.TileEntity lexicalValue1638_41_0;
    moom.Ct lexicalValue1638_52_0;
    java.lang.String spill1638_0;
    net.minecraft.world.WorldServer spill1638_1;
    moom.DT spill1638_2;
    net.minecraft.tileentity.TileEntity spill1638_3;
    moom.Ct spill1638_4;
    long life2_3;
    net.minecraft.world.WorldServer life5_20;
    java.lang.String life4_21;
    moom.DT life6_24;
    net.minecraft.tileentity.TileEntity life7_40;
    moom.Ct life8_54;
    net.minecraft.util.IChatComponent[] life9_88;
    int life10_90;
    lexical_join_95: {
    lexical_join_92: {
    lexical_join_90: {
    lexical_join_64: {
    lexical_join_56: {
    lexical_join_52: {
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_41: {
    lexical_join_33: {
    life2_3 = (__fieldRead1638_0() ^ 92864042717827L);
    __call1638_3(p0, receiver, __call1638_2(__fieldRead1638_1(receiver)));
    spill1638_0 = __call1638_4();
    __call1638_6(__fieldRead1638_5(receiver));
    life5_20 = __call1638_10(__fieldRead1638_7(receiver), __fieldRead1638_9(__fieldRead1638_8(receiver)));
    life4_21 = spill1638_0;
    life6_24 = __call1638_11(p0);
    spill1638_1 = life5_20;
    spill1638_2 = life6_24;
    if (!((life4_21 == null))) {
        lexicalValue1638_33_0 = spill1638_1;
        lexicalValue1638_33_1 = spill1638_2;
        break lexical_join_33;
    }
    if (!(__call1638_12(spill1638_1, spill1638_2))) {
        break lexical_join_95;
    }
    lexicalValue1638_33_0 = life5_20;
    lexicalValue1638_33_1 = life6_24;
    }
    life7_40 = __call1638_13(lexicalValue1638_33_0, lexicalValue1638_33_1);
    spill1638_3 = life7_40;
    if (!((life4_21 == null))) {
        lexicalValue1638_41_0 = spill1638_3;
        break lexical_join_41;
    }
    if (!((__instanceOf1638_14(spill1638_3) != 0))) {
        break lexical_join_45;
    }
    lexicalValue1638_41_0 = life7_40;
    }
    life8_54 = __cast1638_15(lexicalValue1638_41_0);
    if (!((life4_21 != null))) {
        break lexical_join_46;
    }
    }
    return;
    }
    spill1638_4 = life8_54;
    if (!((life4_21 == null))) {
        lexicalValue1638_52_0 = spill1638_4;
        break lexical_join_52;
    }
    if (!(__call1638_16(spill1638_4))) {
        break lexical_join_56;
    }
    lexicalValue1638_52_0 = life8_54;
    }
    if (!((__call1638_17(lexicalValue1638_52_0) != __fieldRead1638_18(receiver)))) {
        break lexical_join_64;
    }
    }
    __call1638_23(__fieldRead1638_19(receiver), __invokedynamic1638_22(__call1638_21(__fieldRead1638_20(receiver))));
    return;
    }
    life9_88 = __call1638_24(p0);
    life10_90 = 0;
    lexical_cycle_69: while (true) {
    if (!((life10_90 < (life9_88).length))) {
        break lexical_join_90;
    }
    (__fieldRead1638_25(life8_54))[life10_90] = new moom.CM(__call1638_27(__call1638_26((life9_88)[life10_90])));
    life10_90 += 1;
    if (!((life4_21 == null))) {
        break lexical_join_92;
    }
    if (!((life4_21 != null))) { continue lexical_cycle_69; }
    break lexical_cycle_69;
    }
    }
    __call1638_28(life8_54);
    }
    __call1638_29(life5_20, life6_24);
    }
    return;
}
public static void h1638_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163800_0(p0);
}
public static void h1638_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163801_0(p0);
}
public static void h1638_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163802_0(p0);
}
public static void h1638_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163803_0(p0);
}
public static void h1638_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163804_0(p0);
}
public static void h1638_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163805_0(p0);
}
public static void h1638_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163806_0(p0);
}
public static void h1638_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163807_0(p0);
}
public static void h1638_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163808_0(p0);
}
private static native long __fieldRead1638_0() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1638_1(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1638_2(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1638_3(moom.zl a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native java.lang.String __call1638_4() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1638_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1638_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.Bl __fieldRead1638_7(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1638_8(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __fieldRead1638_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1638_10(moom.Bl a0, int a1) throws Throwable;
private static native moom.DT __call1638_11(moom.zl a0) throws Throwable;
private static native boolean __call1638_12(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1638_13(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native int __instanceOf1638_14(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.Ct __cast1638_15(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native boolean __call1638_16(moom.Ct a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __call1638_17(moom.Ct a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1638_18(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.Bl __fieldRead1638_19(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1638_20(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call1638_21(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __invokedynamic1638_22(java.lang.String a0) throws Throwable;
private static native void __call1638_23(moom.Bl a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent[] __call1638_24(moom.zl a0) throws Throwable;
private static native net.minecraft.util.IChatComponent[] __fieldRead1638_25(moom.Ct a0) throws Throwable;
private static native java.lang.String __call1638_26(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.lang.String __call1638_27(java.lang.String a0) throws Throwable;
private static native void __call1638_28(moom.Ct a0) throws Throwable;
private static native void __call1638_29(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native java.lang.Throwable __call1163800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163802_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163803_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163804_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163805_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163806_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163807_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163808_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a75e68fcded825825097(net.minecraft.network.NetHandlerPlayServer a0, moom.zm a1) throws E;
private static final class __SourceHandler_a75e68fcded825825097 {

public static void f1639(net.minecraft.network.NetHandlerPlayServer receiver, moom.zm p0) throws Throwable {
    net.minecraft.entity.player.PlayerCapabilities forwardValue1639_24_0;
    int forwardValue1639_24_1;
    net.minecraft.entity.player.PlayerCapabilities forwardValue1639_28_0;
    int forwardValue1639_28_1;
    net.minecraft.entity.player.PlayerCapabilities forwardValue1639_29_0;
    net.minecraft.entity.player.PlayerCapabilities forwardValue1639_30_0;
    int forwardValue1639_30_1;
    java.lang.String spill1639_0;
    net.minecraft.entity.player.PlayerCapabilities spill1639_1;
    boolean spill1639_2;
    long life2_3;
    java.lang.String life4_11;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    life2_3 = (__fieldRead1639_0() ^ 81175923904674L);
    spill1639_0 = __call1639_1();
    __call1639_4(p0, receiver, __call1639_3(__fieldRead1639_2(receiver)));
    life4_11 = spill1639_0;
    spill1639_1 = __fieldRead1639_6(__fieldRead1639_5(receiver));
    spill1639_2 = __call1639_7(p0);
    if (!((life4_11 == null))) {
        forwardValue1639_24_0 = spill1639_1;
        forwardValue1639_24_1 = __integerCategory1639_8(spill1639_2);
        break forward_join_24;
    }
    if (!(spill1639_2)) {
        forwardValue1639_29_0 = spill1639_1;
        break forward_join_29;
    }
    forwardValue1639_24_0 = spill1639_1;
    forwardValue1639_24_1 = __integerCategory1639_12(__fieldRead1639_11(__fieldRead1639_10(__fieldRead1639_9(receiver))));
    }
    if (!((life4_11 == null))) {
        forwardValue1639_28_0 = forwardValue1639_24_0;
        forwardValue1639_28_1 = forwardValue1639_24_1;
        break forward_join_28;
    }
    if (!((forwardValue1639_24_1 != 0))) {
        forwardValue1639_29_0 = forwardValue1639_24_0;
        break forward_join_29;
    }
    forwardValue1639_28_0 = forwardValue1639_24_0;
    forwardValue1639_28_1 = 1;
    }
    forwardValue1639_30_0 = forwardValue1639_28_0;
    forwardValue1639_30_1 = forwardValue1639_28_1;
    break forward_join_30;
    }
    forwardValue1639_30_0 = forwardValue1639_29_0;
    forwardValue1639_30_1 = 0;
    }
    __fieldWrite1639_13(forwardValue1639_30_0, forwardValue1639_30_1);
    return;
}
public static void h1639_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163900_0(p0);
}
public static void h1639_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163901_0(p0);
}
public static void h1639_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1163902_0(p0);
}
private static native long __fieldRead1639_0() throws Throwable;
private static native java.lang.String __call1639_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1639_2(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1639_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1639_4(moom.zm a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1639_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead1639_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call1639_7(moom.zm a0) throws Throwable;
private static native int __integerCategory1639_8(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1639_9(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead1639_10(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __fieldRead1639_11(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native int __integerCategory1639_12(boolean value) throws Throwable;
private static native void __fieldWrite1639_13(net.minecraft.entity.player.PlayerCapabilities a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1163900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1163902_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6881f4516537eab95f56(net.minecraft.network.NetHandlerPlayServer a0, moom.zp a1) throws E;
private static final class __SourceHandler_6881f4516537eab95f56 {

public static void f564(net.minecraft.network.NetHandlerPlayServer receiver, moom.zp p0) throws Throwable {
    int forwardValue564_28_0;
    int forwardValue564_48_0;
    int forwardValue564_66_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue564_69_0;
    int forwardValue564_108_0;
    net.minecraft.network.NetHandlerPlayServer forwardValue564_111_0;
    java.lang.String spill564_0;
    int spill564_1;
    boolean spill564_2;
    net.minecraft.entity.player.EntityPlayerMP spill564_3;
    net.minecraft.network.NetHandlerPlayServer spill564_4;
    long life2_3;
    net.minecraft.network.play.client.C16PacketClientStatus$EnumState life5_16;
    java.lang.String life4_17;
    moom.BN life6_119;
    forward_join_134: {
    forward_join_130: {
    forward_join_122: {
    forward_join_111: {
    forward_join_110: {
    forward_join_108: {
    forward_join_101: {
    forward_join_77: {
    forward_join_69: {
    forward_join_66: {
    forward_join_48: {
    forward_join_43: {
    forward_join_28: {
    forward_join_25: {
    life2_3 = (__fieldRead564_0() ^ 36092187971513L);
    __call564_3(p0, receiver, __call564_2(__fieldRead564_1(receiver)));
    spill564_0 = __call564_4();
    __call564_6(__fieldRead564_5(receiver));
    life5_16 = __call564_7(p0);
    life4_17 = spill564_0;
    spill564_1 = (__fieldRead564_8())[__call564_9(life5_16)];
    if (!((life4_17 == null))) {
        forwardValue564_28_0 = spill564_1;
        break forward_join_28;
    }
    switch (spill564_1) {
case 1:
{
        break forward_join_25;
    }
case 2:
{
        break forward_join_122;
    }
case 3:
{
        break forward_join_130;
    }
default:
{
        break forward_join_134;
    }
}
    }
    forwardValue564_28_0 = __integerCategory564_12(__fieldRead564_11(__fieldRead564_10(receiver)));
    }
    if (!((life4_17 == null))) {
        forwardValue564_48_0 = forwardValue564_28_0;
        break forward_join_48;
    }
    if (!((forwardValue564_28_0 != 0))) {
        break forward_join_43;
    }
    __fieldWrite564_17(receiver, __call564_16(__call564_14(__fieldRead564_13(receiver)), __fieldRead564_15(receiver), 0, 1));
    if (!((life4_17 != null))) {
        break forward_join_134;
    }
    }
    forwardValue564_48_0 = __integerCategory564_22(__call564_21(__call564_20(__call564_19(__fieldRead564_18(receiver)))));
    }
    if (!((life4_17 == null))) {
        forwardValue564_108_0 = forwardValue564_48_0;
        break forward_join_108;
    }
    if (!((forwardValue564_48_0 != 0))) {
        break forward_join_101;
    }
    spill564_2 = __call564_24(__fieldRead564_23(receiver));
    if (!((life4_17 == null))) {
        forwardValue564_66_0 = __integerCategory564_25(spill564_2);
        break forward_join_66;
    }
    if (!(spill564_2)) {
        break forward_join_77;
    }
    spill564_3 = __fieldRead564_26(receiver);
    if (!((life4_17 == null))) {
        forwardValue564_69_0 = spill564_3;
        break forward_join_69;
    }
    forwardValue564_66_0 = __integerCategory564_31(__call564_30(__call564_27(spill564_3), __call564_29(__fieldRead564_28(receiver))));
    }
    if (!((forwardValue564_66_0 != 0))) {
        break forward_join_77;
    }
    forwardValue564_69_0 = __fieldRead564_32(receiver);
    }
    __call564_34(__fieldRead564_33(forwardValue564_69_0), "You have died. Game over, man, it's game over!");
    __call564_36(__fieldRead564_35(receiver));
    if (!((life4_17 != null))) {
        break forward_join_134;
    }
    }
    life6_119 = new moom.BN(__call564_38(__fieldRead564_37(receiver)), null, "(You just lost the game)", null, "Death in Hardcore");
    __call564_42(__call564_41(__call564_40(__fieldRead564_39(receiver))), life6_119);
    __call564_45(__fieldRead564_44(__fieldRead564_43(receiver)), "You have died. Game over, man, it's game over!");
    if (!((life4_17 != null))) {
        break forward_join_134;
    }
    }
    spill564_4 = receiver;
    if (!((life4_17 == null))) {
        forwardValue564_111_0 = spill564_4;
        break forward_join_111;
    }
    forwardValue564_108_0 = __numericCompare564_48(__call564_47(__fieldRead564_46(spill564_4)), 0x0.0p0f);
    }
    if (!((forwardValue564_108_0 > 0))) {
        break forward_join_110;
    }
    return;
    }
    forwardValue564_111_0 = receiver;
    }
    __fieldWrite564_53(forwardValue564_111_0, __call564_52(__call564_50(__fieldRead564_49(receiver)), __fieldRead564_51(receiver), 0, 0));
    if (!((life4_17 != null))) {
        break forward_join_134;
    }
    }
    __call564_57(__call564_55(__fieldRead564_54(receiver)), __fieldRead564_56(receiver));
    if (!((life4_17 != null))) {
        break forward_join_134;
    }
    }
    __call564_60(__fieldRead564_58(receiver), __fieldRead564_59());
    }
    return;
}
public static void h564_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056400_0(p0);
}
public static void h564_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056401_0(p0);
}
public static void h564_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056402_0(p0);
}
public static void h564_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056403_0(p0);
}
public static void h564_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056404_0(p0);
}
public static void h564_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056405_0(p0);
}
public static void h564_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056406_0(p0);
}
public static void h564_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056407_0(p0);
}
public static void h564_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056408_0(p0);
}
public static void h564_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056409_0(p0);
}
public static void h564_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056410_0(p0);
}
public static void h564_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056411_0(p0);
}
public static void h564_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056412_0(p0);
}
public static void h564_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056413_0(p0);
}
public static void h564_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2056414_0(p0);
}
private static native long __fieldRead564_0() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_1(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call564_2(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call564_3(moom.zp a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native java.lang.String __call564_4() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call564_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.network.play.client.C16PacketClientStatus$EnumState __call564_7(moom.zp a0) throws Throwable;
private static native int[] __fieldRead564_8() throws Throwable;
private static native int __call564_9(net.minecraft.network.play.client.C16PacketClientStatus$EnumState a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_10(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __fieldRead564_11(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __integerCategory564_12(boolean value) throws Throwable;
private static native moom.Bl __fieldRead564_13(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call564_14(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_15(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call564_16(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite564_17(net.minecraft.network.NetHandlerPlayServer a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_18(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call564_19(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call564_20(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call564_21(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory564_22(boolean value) throws Throwable;
private static native moom.Bl __fieldRead564_23(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call564_24(moom.Bl a0) throws Throwable;
private static native int __integerCategory564_25(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_26(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call564_27(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.Bl __fieldRead564_28(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call564_29(moom.Bl a0) throws Throwable;
private static native boolean __call564_30(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory564_31(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_32(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead564_33(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call564_34(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native moom.Bl __fieldRead564_35(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call564_36(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_37(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call564_38(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.Bl __fieldRead564_39(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call564_40(moom.Bl a0) throws Throwable;
private static native moom.BF __call564_41(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native void __call564_42(moom.BF a0, moom.BN a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_43(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead564_44(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call564_45(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_46(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native float __call564_47(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __numericCompare564_48(float a0, float a1) throws Throwable;
private static native moom.Bl __fieldRead564_49(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call564_50(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_51(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call564_52(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite564_53(net.minecraft.network.NetHandlerPlayServer a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_54(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __call564_55(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_56(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call564_57(net.minecraft.stats.StatisticsFile a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead564_58(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.BZ __fieldRead564_59() throws Throwable;
private static native void __call564_60(net.minecraft.entity.player.EntityPlayerMP a0, moom.BZ a1) throws Throwable;
private static native java.lang.Throwable __call2056400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056401_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056402_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056403_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056404_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056405_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056406_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056407_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056408_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056409_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056410_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056411_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056412_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056413_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call2056414_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c76ae9a871fbc4a0f995(net.minecraft.network.NetHandlerPlayServer a0, moom.zq a1) throws E;
private static final class __SourceHandler_c76ae9a871fbc4a0f995 {

public static void f168(net.minecraft.network.NetHandlerPlayServer receiver, moom.zq p0) throws Throwable {
    net.minecraft.item.ItemStack forwardValue168_48_0;
    net.minecraft.item.ItemStack forwardValue168_58_0;
    net.minecraft.item.Item forwardValue168_69_0;
    net.minecraft.item.Item forwardValue168_69_1;
    net.minecraft.item.ItemStack forwardValue168_71_0;
    int forwardValue168_91_0;
    net.minecraft.item.ItemStack forwardValue168_123_0;
    net.minecraft.item.ItemStack forwardValue168_133_0;
    net.minecraft.item.Item forwardValue168_143_0;
    net.minecraft.item.Item forwardValue168_143_1;
    net.minecraft.item.ItemStack forwardValue168_176_0;
    int forwardValue168_187_0;
    moom.v8 forwardValue168_204_0;
    int forwardValue168_212_0;
    int forwardValue168_239_0;
    net.minecraft.tileentity.TileEntity forwardValue168_279_0;
    int forwardValue168_284_0;
    net.minecraft.entity.Entity forwardValue168_299_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue168_349_0;
    int forwardValue168_362_0;
    moom.wB forwardValue168_394_0;
    int forwardValue168_415_0;
    moom.v8 forwardValue168_426_0;
    net.minecraft.network.PacketBuffer forwardValue168_435_0;
    net.minecraft.network.PacketBuffer forwardValue168_442_0;
    java.lang.String spill168_0;
    boolean spill168_1;
    net.minecraft.item.ItemStack spill168_2;
    net.minecraft.item.ItemStack spill168_3;
    net.minecraft.item.Item spill168_4;
    net.minecraft.item.Item spill168_5;
    net.minecraft.item.ItemStack spill168_6;
    net.minecraft.item.ItemStack spill168_7;
    net.minecraft.item.ItemStack spill168_8;
    net.minecraft.item.Item spill168_9;
    net.minecraft.item.Item spill168_10;
    net.minecraft.item.ItemStack spill168_11;
    moom.v8 spill168_12;
    boolean spill168_13;
    net.minecraft.entity.player.EntityPlayerMP spill168_14;
    net.minecraft.entity.player.EntityPlayerMP spill168_15;
    int spill168_16;
    net.minecraft.tileentity.TileEntity spill168_17;
    net.minecraft.entity.Entity spill168_18;
    moom.wB spill168_19;
    moom.v8 spill168_20;
    net.minecraft.network.PacketBuffer spill168_21;
    long life2_3;
    java.lang.String life4_11;
    net.minecraft.network.PacketBuffer life6_28;
    net.minecraft.item.ItemStack life7_31;
    net.minecraft.item.ItemStack life8_62;
    net.minecraft.network.PacketBuffer life6_148;
    net.minecraft.item.ItemStack life7_151;
    net.minecraft.item.ItemStack life8_182;
    int life6_289;
    moom.v8 life7_293;
    net.minecraft.network.PacketBuffer life6_385;
    int life7_388;
    moom.qV life8_390;
    net.minecraft.tileentity.TileEntity life9_411;
    net.minecraft.entity.Entity life9_437;
    java.lang.String life9_457;
    int life10_460;
    net.minecraft.network.PacketBuffer life6_563;
    int life7_566;
    int life8_569;
    moom.wa life9_574;
    moom.wB life10_578;
    net.minecraft.inventory.IInventory life11_596;
    moom.v8 life6_626;
    moom.wk life5_640;
    java.lang.String life6_674;
    forward_join_465: {
    forward_join_462: {
    forward_join_461: {
    forward_join_442: {
    forward_join_435: {
    forward_join_426: {
    forward_join_415: {
    forward_join_411: {
    forward_join_410: {
    forward_join_394: {
    forward_join_362: {
    forward_join_358: {
    forward_join_349: {
    forward_join_347: {
    forward_join_345: {
    forward_join_342: {
    forward_join_329: {
    forward_join_327: {
    forward_join_302: {
    forward_join_299: {
    forward_join_284: {
    forward_join_283: {
    forward_join_282: {
    forward_join_279: {
    forward_join_239: {
    forward_join_232: {
    forward_join_212: {
    forward_join_208: {
    forward_join_207: {
    forward_join_204: {
    forward_join_187: {
    forward_join_183: {
    forward_join_181: {
    forward_join_178: {
    forward_join_176: {
    forward_join_143: {
    forward_join_133: {
    forward_join_132: {
    forward_join_123: {
    forward_join_119: {
    forward_join_91: {
    forward_join_87: {
    forward_join_85: {
    forward_join_82: {
    forward_join_71: {
    forward_join_69: {
    forward_join_58: {
    forward_join_57: {
    forward_join_48: {
    forward_join_44: {
    life2_3 = (__fieldRead168_0() ^ 40019661263090L);
    spill168_0 = __call168_1();
    __call168_4(p0, receiver, __call168_3(__fieldRead168_2(receiver)));
    life4_11 = spill168_0;
    spill168_1 = __call168_6("MC|BEdit", __call168_5(p0));
    if (!((life4_11 == null))) {
        forwardValue168_91_0 = __integerCategory168_7(spill168_1);
        break forward_join_91;
    }
    if (!(spill168_1)) {
        break forward_join_87;
    }
    life6_28 = new net.minecraft.network.PacketBuffer(__call168_9(__call168_8(p0)));
    life7_31 = __call168_10(life6_28);
    if (!((life4_11 == null))) {
        break forward_join_85;
    }
    if (!((life7_31 != null))) {
        break forward_join_82;
    }
    spill168_2 = life7_31;
    if (!((life4_11 == null))) {
        forwardValue168_48_0 = spill168_2;
        break forward_join_48;
    }
    if (!((!__call168_12(__call168_11(spill168_2))))) {
        break forward_join_44;
    }
    throw new java.io.IOException("Invalid book tag!");
    }
    forwardValue168_48_0 = __call168_15(__fieldRead168_14(__fieldRead168_13(receiver)));
    }
    life8_62 = forwardValue168_48_0;
    spill168_3 = life8_62;
    if (!((life4_11 == null))) {
        forwardValue168_58_0 = spill168_3;
        break forward_join_58;
    }
    if (!((spill168_3 == null))) {
        break forward_join_57;
    }
    __call168_16(life6_28);
    return;
    }
    forwardValue168_58_0 = life7_31;
    }
    spill168_4 = __call168_17(forwardValue168_58_0);
    spill168_5 = __fieldRead168_18();
    if (!((life4_11 == null))) {
        forwardValue168_69_0 = spill168_4;
        forwardValue168_69_1 = spill168_5;
        break forward_join_69;
    }
    if (!((spill168_4 == spill168_5))) {
        break forward_join_82;
    }
    spill168_6 = life7_31;
    if (!((life4_11 == null))) {
        forwardValue168_71_0 = spill168_6;
        break forward_join_71;
    }
    forwardValue168_69_0 = __call168_19(spill168_6);
    forwardValue168_69_1 = __call168_20(life8_62);
    }
    if (!((forwardValue168_69_0 == forwardValue168_69_1))) {
        break forward_join_82;
    }
    forwardValue168_71_0 = life8_62;
    }
    __call168_24(forwardValue168_71_0, "pages", __call168_23(__call168_21(life7_31), "pages", __invokedynamic168_22(19521, (8781241759777584115L ^ life2_3))));
    }
    __call168_25(life6_28);
    }
    if (!((life4_11 != null))) {
        break forward_join_465;
    }
    }
    forwardValue168_91_0 = __integerCategory168_28(__call168_27("MC|BSign", __call168_26(p0)));
    }
    if (!((life4_11 == null))) {
        forwardValue168_187_0 = forwardValue168_91_0;
        break forward_join_187;
    }
    if (!((forwardValue168_91_0 != 0))) {
        break forward_join_183;
    }
    life6_148 = new net.minecraft.network.PacketBuffer(__call168_30(__call168_29(p0)));
    life7_151 = __call168_31(life6_148);
    if (!((life4_11 == null))) {
        break forward_join_181;
    }
    if (!((life7_151 != null))) {
        break forward_join_178;
    }
    spill168_7 = life7_151;
    if (!((life4_11 == null))) {
        forwardValue168_123_0 = spill168_7;
        break forward_join_123;
    }
    if (!((!__call168_33(__call168_32(spill168_7))))) {
        break forward_join_119;
    }
    throw new java.io.IOException("Invalid book tag!");
    }
    forwardValue168_123_0 = __call168_36(__fieldRead168_35(__fieldRead168_34(receiver)));
    }
    life8_182 = forwardValue168_123_0;
    spill168_8 = life8_182;
    if (!((life4_11 == null))) {
        forwardValue168_133_0 = spill168_8;
        break forward_join_133;
    }
    if (!((spill168_8 == null))) {
        break forward_join_132;
    }
    __call168_37(life6_148);
    return;
    }
    forwardValue168_133_0 = life7_151;
    }
    spill168_9 = __call168_38(forwardValue168_133_0);
    spill168_10 = __fieldRead168_39();
    if (!((life4_11 == null))) {
        forwardValue168_143_0 = spill168_9;
        forwardValue168_143_1 = spill168_10;
        break forward_join_143;
    }
    if (!((spill168_9 == spill168_10))) {
        break forward_join_178;
    }
    spill168_11 = life8_182;
    if (!((life4_11 == null))) {
        forwardValue168_176_0 = spill168_11;
        break forward_join_176;
    }
    forwardValue168_143_0 = __call168_40(spill168_11);
    forwardValue168_143_1 = __fieldRead168_41();
    }
    if (!((forwardValue168_143_0 == forwardValue168_143_1))) {
        break forward_join_178;
    }
    __call168_44(life8_182, "author", new moom.yA(__call168_43(__fieldRead168_42(receiver))));
    __call168_47(life8_182, "title", new moom.yA(__call168_46(__call168_45(life7_151), "title")));
    __call168_51(life8_182, "pages", __call168_50(__call168_48(life7_151), "pages", __invokedynamic168_49(7719, (3565035628831580566L ^ life2_3))));
    forwardValue168_176_0 = life8_182;
    }
    __call168_53(forwardValue168_176_0, __fieldRead168_52());
    }
    __call168_54(life6_148);
    }
    if (!((life4_11 != null))) {
        break forward_join_465;
    }
    }
    forwardValue168_187_0 = __integerCategory168_57(__call168_56("MC|TrSel", __call168_55(p0)));
    }
    if (!((life4_11 == null))) {
        forwardValue168_212_0 = forwardValue168_187_0;
        break forward_join_212;
    }
    if (!((forwardValue168_187_0 != 0))) {
        break forward_join_208;
    }
    life6_289 = __call168_59(__call168_58(p0));
    life7_293 = __fieldRead168_61(__fieldRead168_60(receiver));
    spill168_12 = life7_293;
    if (!((life4_11 == null))) {
        forwardValue168_204_0 = spill168_12;
        break forward_join_204;
    }
    if (!((__instanceOf168_62(spill168_12) != 0))) {
        break forward_join_207;
    }
    forwardValue168_204_0 = life7_293;
    }
    __call168_64(__cast168_63(forwardValue168_204_0), life6_289);
    }
    break forward_join_465;
    }
    forwardValue168_212_0 = __integerCategory168_67(__call168_66("MC|AdvCdm", __call168_65(p0)));
    }
    if (!((life4_11 == null))) {
        forwardValue168_362_0 = forwardValue168_212_0;
        break forward_join_362;
    }
    if (!((forwardValue168_212_0 != 0))) {
        break forward_join_358;
    }
    spill168_13 = __call168_69(__fieldRead168_68(receiver));
    if (!((life4_11 == null))) {
        forwardValue168_239_0 = __integerCategory168_70(spill168_13);
        break forward_join_239;
    }
    if (!((!spill168_13))) {
        break forward_join_232;
    }
    __call168_72(__fieldRead168_71(receiver), new moom.CN("advMode.notEnabled", new java.lang.Object[0]));
    if (!((life4_11 != null))) {
        break forward_join_465;
    }
    }
    spill168_14 = __fieldRead168_73(receiver);
    if (!((life4_11 == null))) {
        forwardValue168_349_0 = spill168_14;
        break forward_join_349;
    }
    forwardValue168_239_0 = __integerCategory168_75(__call168_74(spill168_14, 2, ""));
    }
    if (!((forwardValue168_239_0 != 0))) {
        break forward_join_347;
    }
    spill168_15 = __fieldRead168_76(receiver);
    if (!((life4_11 == null))) {
        forwardValue168_349_0 = spill168_15;
        break forward_join_349;
    }
    if (!(__fieldRead168_78(__fieldRead168_77(spill168_15)))) {
        break forward_join_347;
    }
    life6_385 = __call168_79(p0);
    life7_388 = __call168_80(life6_385);
    life8_390 = null;
    spill168_16 = life7_388;
    if (!((life4_11 == null))) {
        forwardValue168_284_0 = spill168_16;
        break forward_join_284;
    }
    if (!((spill168_16 == 0))) {
        break forward_join_283;
    }
    life9_411 = __call168_86(__fieldRead168_82(__fieldRead168_81(receiver)), new moom.DT(__call168_83(life6_385), __call168_84(life6_385), __call168_85(life6_385)));
    spill168_17 = life9_411;
    if (!((life4_11 == null))) {
        forwardValue168_279_0 = spill168_17;
        break forward_join_279;
    }
    if (!((__instanceOf168_87(spill168_17) != 0))) {
        break forward_join_282;
    }
    forwardValue168_279_0 = life9_411;
    }
    life8_390 = __call168_89(__cast168_88(forwardValue168_279_0));
    }
    break forward_join_302;
    }
    forwardValue168_284_0 = life7_388;
    }
    if (!((forwardValue168_284_0 == 1))) {
        break forward_join_302;
    }
    life9_437 = __call168_93(__fieldRead168_91(__fieldRead168_90(receiver)), __call168_92(life6_385));
    spill168_18 = life9_437;
    if (!((life4_11 == null))) {
        forwardValue168_299_0 = spill168_18;
        break forward_join_299;
    }
    if (!((__instanceOf168_94(spill168_18) != 0))) {
        break forward_join_302;
    }
    forwardValue168_299_0 = life9_437;
    }
    life8_390 = __call168_96(__cast168_95(forwardValue168_299_0));
    }
    life9_457 = __call168_98(life6_385, __call168_97(life6_385));
    life10_460 = __integerCategory168_100(__call168_99(life6_385));
    if (!((life4_11 == null))) {
        break forward_join_345;
    }
    if (!((life8_390 != null))) {
        break forward_join_342;
    }
    __call168_101(life8_390, life9_457);
    __call168_102(life8_390, life10_460);
    if (!((life4_11 == null))) {
        break forward_join_329;
    }
    if (!((life10_460 == 0))) {
        break forward_join_327;
    }
    __call168_103(life8_390, null);
    }
    __call168_104(life8_390);
    }
    __call168_106(__fieldRead168_105(receiver), new moom.CN("advMode.setCommand.success", new java.lang.Object[] {life9_457}));
    }
    __call168_107(life6_385);
    }
    if (!((life4_11 != null))) {
        break forward_join_465;
    }
    }
    forwardValue168_349_0 = __fieldRead168_108(receiver);
    }
    __call168_109(forwardValue168_349_0, new moom.CN("advMode.notAllowed", new java.lang.Object[0]));
    if (!((life4_11 != null))) {
        break forward_join_465;
    }
    }
    forwardValue168_362_0 = __integerCategory168_112(__call168_111("MC|Beacon", __call168_110(p0)));
    }
    if (!((life4_11 == null))) {
        forwardValue168_415_0 = forwardValue168_362_0;
        break forward_join_415;
    }
    if (!((forwardValue168_362_0 != 0))) {
        break forward_join_411;
    }
    if (!((__instanceOf168_115(__fieldRead168_114(__fieldRead168_113(receiver))) != 0))) {
        break forward_join_465;
    }
    life6_563 = __call168_116(p0);
    life7_566 = __call168_117(life6_563);
    life8_569 = __call168_118(life6_563);
    life9_574 = __cast168_121(__fieldRead168_120(__fieldRead168_119(receiver)));
    life10_578 = __call168_122(life9_574, 0);
    spill168_19 = life10_578;
    if (!((life4_11 == null))) {
        forwardValue168_394_0 = spill168_19;
        break forward_join_394;
    }
    if (!(__call168_123(spill168_19))) {
        break forward_join_410;
    }
    forwardValue168_394_0 = life10_578;
    }
    __call168_124(forwardValue168_394_0, 1);
    life11_596 = __call168_125(life9_574);
    __call168_126(life11_596, 1, life7_566);
    __call168_127(life11_596, 2, life8_569);
    __call168_128(life11_596);
    }
    break forward_join_465;
    }
    forwardValue168_415_0 = __integerCategory168_131(__call168_130("MC|ItemName", __call168_129(p0)));
    }
    if (!((forwardValue168_415_0 != 0))) {
        break forward_join_465;
    }
    life6_626 = __fieldRead168_133(__fieldRead168_132(receiver));
    spill168_20 = life6_626;
    if (!((life4_11 == null))) {
        forwardValue168_426_0 = spill168_20;
        break forward_join_426;
    }
    if (!((__instanceOf168_134(spill168_20) != 0))) {
        break forward_join_465;
    }
    forwardValue168_426_0 = life6_626;
    }
    life5_640 = __cast168_135(forwardValue168_426_0);
    spill168_21 = __call168_136(p0);
    if (!((life4_11 == null))) {
        forwardValue168_435_0 = spill168_21;
        break forward_join_435;
    }
    if (!((spill168_21 != null))) {
        break forward_join_462;
    }
    forwardValue168_435_0 = __call168_137(p0);
    }
    if (!((life4_11 == null))) {
        forwardValue168_442_0 = forwardValue168_435_0;
        break forward_join_442;
    }
    if (!((__call168_138(forwardValue168_435_0) >= 1))) {
        break forward_join_462;
    }
    forwardValue168_442_0 = __call168_139(p0);
    }
    life6_674 = __call168_142(__call168_141(forwardValue168_442_0, __invokedynamic168_140(26146, (4306381912090794391L ^ life2_3))));
    if (!((__call168_143(life6_674) <= __invokedynamic168_144(4138, (5914832861949505438L ^ life2_3))))) {
        break forward_join_461;
    }
    __call168_145(life5_640, life6_674);
    }
    break forward_join_465;
    }
    __call168_146(life5_640, "");
    }
    return;
}
public static void h168_0(java.lang.Exception p0) throws Throwable {
    throw __call3016800_0(p0);
}
public static void h168_1(java.lang.Exception p0) throws Throwable {
    throw __call3016801_0(p0);
}
public static void h168_2(java.lang.Exception p0) throws Throwable {
    throw __call3016802_0(p0);
}
public static void h168_3(java.lang.Exception p0) throws Throwable {
    throw __call3016803_0(p0);
}
public static void h168_4(java.lang.Exception p0) throws Throwable {
    throw __call3016804_0(p0);
}
public static void h168_5(java.lang.Exception p0) throws Throwable {
    throw __call3016805_0(p0);
}
public static void h168_6(java.lang.Exception p0) throws Throwable {
    throw __call3016806_0(p0);
}
public static void h168_7(java.lang.Exception p0) throws Throwable {
    throw __call3016807_0(p0);
}
public static void h168_8(java.lang.Exception p0) throws Throwable {
    throw __call3016808_0(p0);
}
public static void h168_9(java.lang.Exception p0, net.minecraft.network.NetHandlerPlayServer p1, moom.zq p2, long p3, java.lang.String p4, net.minecraft.network.PacketBuffer p5) throws Throwable {
    net.minecraft.item.ItemStack forwardValue3016809_47_0;
    net.minecraft.item.ItemStack forwardValue3016809_57_0;
    net.minecraft.item.Item forwardValue3016809_67_0;
    net.minecraft.item.Item forwardValue3016809_67_1;
    net.minecraft.item.ItemStack forwardValue3016809_100_0;
    int forwardValue3016809_111_0;
    moom.v8 forwardValue3016809_128_0;
    int forwardValue3016809_136_0;
    int forwardValue3016809_163_0;
    net.minecraft.tileentity.TileEntity forwardValue3016809_203_0;
    int forwardValue3016809_208_0;
    net.minecraft.entity.Entity forwardValue3016809_223_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue3016809_273_0;
    int forwardValue3016809_286_0;
    moom.wB forwardValue3016809_318_0;
    int forwardValue3016809_339_0;
    moom.v8 forwardValue3016809_350_0;
    net.minecraft.network.PacketBuffer forwardValue3016809_359_0;
    net.minecraft.network.PacketBuffer forwardValue3016809_366_0;
    boolean spill3016809_0;
    net.minecraft.item.ItemStack spill3016809_1;
    net.minecraft.item.ItemStack spill3016809_2;
    net.minecraft.item.Item spill3016809_3;
    net.minecraft.item.Item spill3016809_4;
    net.minecraft.item.ItemStack spill3016809_5;
    moom.v8 spill3016809_6;
    boolean spill3016809_7;
    net.minecraft.entity.player.EntityPlayerMP spill3016809_8;
    net.minecraft.entity.player.EntityPlayerMP spill3016809_9;
    int spill3016809_10;
    net.minecraft.tileentity.TileEntity spill3016809_11;
    net.minecraft.entity.Entity spill3016809_12;
    moom.wB spill3016809_13;
    moom.v8 spill3016809_14;
    net.minecraft.network.PacketBuffer spill3016809_15;
    java.lang.Exception life8_2;
    net.minecraft.network.PacketBuffer life6_28;
    net.minecraft.item.ItemStack life8_31;
    net.minecraft.item.ItemStack life9_54;
    int life6_132;
    moom.v8 life8_136;
    net.minecraft.network.PacketBuffer life6_199;
    int life8_202;
    moom.qV life9_204;
    net.minecraft.tileentity.TileEntity life10_223;
    net.minecraft.entity.Entity life10_245;
    java.lang.String life10_261;
    int life11_264;
    net.minecraft.network.PacketBuffer life6_336;
    int life8_339;
    int life9_342;
    moom.wa life10_347;
    moom.wB life11_351;
    net.minecraft.inventory.IInventory life12_365;
    moom.v8 life6_386;
    moom.wk life7_396;
    java.lang.String life6_422;
    forward_join_389: {
    forward_join_386: {
    forward_join_385: {
    forward_join_366: {
    forward_join_359: {
    forward_join_350: {
    forward_join_339: {
    forward_join_335: {
    forward_join_334: {
    forward_join_318: {
    forward_join_286: {
    forward_join_282: {
    forward_join_273: {
    forward_join_271: {
    forward_join_269: {
    forward_join_266: {
    forward_join_253: {
    forward_join_251: {
    forward_join_226: {
    forward_join_223: {
    forward_join_208: {
    forward_join_207: {
    forward_join_206: {
    forward_join_203: {
    forward_join_163: {
    forward_join_156: {
    forward_join_136: {
    forward_join_132: {
    forward_join_131: {
    forward_join_128: {
    forward_join_111: {
    forward_join_107: {
    forward_join_105: {
    forward_join_102: {
    forward_join_100: {
    forward_join_67: {
    forward_join_57: {
    forward_join_56: {
    forward_join_47: {
    forward_join_43: {
    life8_2 = p0;
    __call3016809_1(__fieldRead3016809_0(), "Couldn't handle book info", life8_2);
    __call3016809_2(p5);
    if (!((p4 != null))) {
        break forward_join_389;
    }
    spill3016809_0 = __call3016809_4("MC|BSign", __call3016809_3(p2));
    if (!((p4 == null))) {
        forwardValue3016809_111_0 = __integerCategory3016809_5(spill3016809_0);
        break forward_join_111;
    }
    if (!(spill3016809_0)) {
        break forward_join_107;
    }
    life6_28 = new net.minecraft.network.PacketBuffer(__call3016809_7(__call3016809_6(p2)));
    life8_31 = __call3016809_8(life6_28);
    if (!((p4 == null))) {
        break forward_join_105;
    }
    if (!((life8_31 != null))) {
        break forward_join_102;
    }
    spill3016809_1 = life8_31;
    if (!((p4 == null))) {
        forwardValue3016809_47_0 = spill3016809_1;
        break forward_join_47;
    }
    if (!((!__call3016809_10(__call3016809_9(spill3016809_1))))) {
        break forward_join_43;
    }
    throw new java.io.IOException("Invalid book tag!");
    }
    forwardValue3016809_47_0 = __call3016809_13(__fieldRead3016809_12(__fieldRead3016809_11(p1)));
    }
    life9_54 = forwardValue3016809_47_0;
    spill3016809_2 = life9_54;
    if (!((p4 == null))) {
        forwardValue3016809_57_0 = spill3016809_2;
        break forward_join_57;
    }
    if (!((spill3016809_2 == null))) {
        break forward_join_56;
    }
    __call3016809_14(life6_28);
    return;
    }
    forwardValue3016809_57_0 = life8_31;
    }
    spill3016809_3 = __call3016809_15(forwardValue3016809_57_0);
    spill3016809_4 = __fieldRead3016809_16();
    if (!((p4 == null))) {
        forwardValue3016809_67_0 = spill3016809_3;
        forwardValue3016809_67_1 = spill3016809_4;
        break forward_join_67;
    }
    if (!((spill3016809_3 == spill3016809_4))) {
        break forward_join_102;
    }
    spill3016809_5 = life9_54;
    if (!((p4 == null))) {
        forwardValue3016809_100_0 = spill3016809_5;
        break forward_join_100;
    }
    forwardValue3016809_67_0 = __call3016809_17(spill3016809_5);
    forwardValue3016809_67_1 = __fieldRead3016809_18();
    }
    if (!((forwardValue3016809_67_0 == forwardValue3016809_67_1))) {
        break forward_join_102;
    }
    __call3016809_21(life9_54, "author", new moom.yA(__call3016809_20(__fieldRead3016809_19(p1))));
    __call3016809_24(life9_54, "title", new moom.yA(__call3016809_23(__call3016809_22(life8_31), "title")));
    __call3016809_28(life9_54, "pages", __call3016809_27(__call3016809_25(life8_31), "pages", __invokedynamic3016809_26(7719, (3565035628831580566L ^ p3))));
    forwardValue3016809_100_0 = life9_54;
    }
    __call3016809_30(forwardValue3016809_100_0, __fieldRead3016809_29());
    }
    __call3016809_31(life6_28);
    }
    if (!((p4 != null))) {
        break forward_join_389;
    }
    }
    forwardValue3016809_111_0 = __integerCategory3016809_34(__call3016809_33("MC|TrSel", __call3016809_32(p2)));
    }
    if (!((p4 == null))) {
        forwardValue3016809_136_0 = forwardValue3016809_111_0;
        break forward_join_136;
    }
    if (!((forwardValue3016809_111_0 != 0))) {
        break forward_join_132;
    }
    life6_132 = __call3016809_36(__call3016809_35(p2));
    life8_136 = __fieldRead3016809_38(__fieldRead3016809_37(p1));
    spill3016809_6 = life8_136;
    if (!((p4 == null))) {
        forwardValue3016809_128_0 = spill3016809_6;
        break forward_join_128;
    }
    if (!((__instanceOf3016809_39(spill3016809_6) != 0))) {
        break forward_join_131;
    }
    forwardValue3016809_128_0 = life8_136;
    }
    __call3016809_41(__cast3016809_40(forwardValue3016809_128_0), life6_132);
    }
    break forward_join_389;
    }
    forwardValue3016809_136_0 = __integerCategory3016809_44(__call3016809_43("MC|AdvCdm", __call3016809_42(p2)));
    }
    if (!((p4 == null))) {
        forwardValue3016809_286_0 = forwardValue3016809_136_0;
        break forward_join_286;
    }
    if (!((forwardValue3016809_136_0 != 0))) {
        break forward_join_282;
    }
    spill3016809_7 = __call3016809_46(__fieldRead3016809_45(p1));
    if (!((p4 == null))) {
        forwardValue3016809_163_0 = __integerCategory3016809_47(spill3016809_7);
        break forward_join_163;
    }
    if (!((!spill3016809_7))) {
        break forward_join_156;
    }
    __call3016809_49(__fieldRead3016809_48(p1), new moom.CN("advMode.notEnabled", new java.lang.Object[0]));
    if (!((p4 != null))) {
        break forward_join_389;
    }
    }
    spill3016809_8 = __fieldRead3016809_50(p1);
    if (!((p4 == null))) {
        forwardValue3016809_273_0 = spill3016809_8;
        break forward_join_273;
    }
    forwardValue3016809_163_0 = __integerCategory3016809_52(__call3016809_51(spill3016809_8, 2, ""));
    }
    if (!((forwardValue3016809_163_0 != 0))) {
        break forward_join_271;
    }
    spill3016809_9 = __fieldRead3016809_53(p1);
    if (!((p4 == null))) {
        forwardValue3016809_273_0 = spill3016809_9;
        break forward_join_273;
    }
    if (!(__fieldRead3016809_55(__fieldRead3016809_54(spill3016809_9)))) {
        break forward_join_271;
    }
    life6_199 = __call3016809_56(p2);
    life8_202 = __call3016809_57(life6_199);
    life9_204 = null;
    spill3016809_10 = life8_202;
    if (!((p4 == null))) {
        forwardValue3016809_208_0 = spill3016809_10;
        break forward_join_208;
    }
    if (!((spill3016809_10 == 0))) {
        break forward_join_207;
    }
    life10_223 = __call3016809_63(__fieldRead3016809_59(__fieldRead3016809_58(p1)), new moom.DT(__call3016809_60(life6_199), __call3016809_61(life6_199), __call3016809_62(life6_199)));
    spill3016809_11 = life10_223;
    if (!((p4 == null))) {
        forwardValue3016809_203_0 = spill3016809_11;
        break forward_join_203;
    }
    if (!((__instanceOf3016809_64(spill3016809_11) != 0))) {
        break forward_join_206;
    }
    forwardValue3016809_203_0 = life10_223;
    }
    life9_204 = __call3016809_66(__cast3016809_65(forwardValue3016809_203_0));
    }
    break forward_join_226;
    }
    forwardValue3016809_208_0 = life8_202;
    }
    if (!((forwardValue3016809_208_0 == 1))) {
        break forward_join_226;
    }
    life10_245 = __call3016809_70(__fieldRead3016809_68(__fieldRead3016809_67(p1)), __call3016809_69(life6_199));
    spill3016809_12 = life10_245;
    if (!((p4 == null))) {
        forwardValue3016809_223_0 = spill3016809_12;
        break forward_join_223;
    }
    if (!((__instanceOf3016809_71(spill3016809_12) != 0))) {
        break forward_join_226;
    }
    forwardValue3016809_223_0 = life10_245;
    }
    life9_204 = __call3016809_73(__cast3016809_72(forwardValue3016809_223_0));
    }
    life10_261 = __call3016809_75(life6_199, __call3016809_74(life6_199));
    life11_264 = __integerCategory3016809_77(__call3016809_76(life6_199));
    if (!((p4 == null))) {
        break forward_join_269;
    }
    if (!((life9_204 != null))) {
        break forward_join_266;
    }
    __call3016809_78(life9_204, life10_261);
    __call3016809_79(life9_204, life11_264);
    if (!((p4 == null))) {
        break forward_join_253;
    }
    if (!((life11_264 == 0))) {
        break forward_join_251;
    }
    __call3016809_80(life9_204, null);
    }
    __call3016809_81(life9_204);
    }
    __call3016809_83(__fieldRead3016809_82(p1), new moom.CN("advMode.setCommand.success", new java.lang.Object[] {life10_261}));
    }
    __call3016809_84(life6_199);
    }
    if (!((p4 != null))) {
        break forward_join_389;
    }
    }
    forwardValue3016809_273_0 = __fieldRead3016809_85(p1);
    }
    __call3016809_86(forwardValue3016809_273_0, new moom.CN("advMode.notAllowed", new java.lang.Object[0]));
    if (!((p4 != null))) {
        break forward_join_389;
    }
    }
    forwardValue3016809_286_0 = __integerCategory3016809_89(__call3016809_88("MC|Beacon", __call3016809_87(p2)));
    }
    if (!((p4 == null))) {
        forwardValue3016809_339_0 = forwardValue3016809_286_0;
        break forward_join_339;
    }
    if (!((forwardValue3016809_286_0 != 0))) {
        break forward_join_335;
    }
    if (!((__instanceOf3016809_92(__fieldRead3016809_91(__fieldRead3016809_90(p1))) != 0))) {
        break forward_join_389;
    }
    life6_336 = __call3016809_93(p2);
    life8_339 = __call3016809_94(life6_336);
    life9_342 = __call3016809_95(life6_336);
    life10_347 = __cast3016809_98(__fieldRead3016809_97(__fieldRead3016809_96(p1)));
    life11_351 = __call3016809_99(life10_347, 0);
    spill3016809_13 = life11_351;
    if (!((p4 == null))) {
        forwardValue3016809_318_0 = spill3016809_13;
        break forward_join_318;
    }
    if (!(__call3016809_100(spill3016809_13))) {
        break forward_join_334;
    }
    forwardValue3016809_318_0 = life11_351;
    }
    __call3016809_101(forwardValue3016809_318_0, 1);
    life12_365 = __call3016809_102(life10_347);
    __call3016809_103(life12_365, 1, life8_339);
    __call3016809_104(life12_365, 2, life9_342);
    __call3016809_105(life12_365);
    }
    break forward_join_389;
    }
    forwardValue3016809_339_0 = __integerCategory3016809_108(__call3016809_107("MC|ItemName", __call3016809_106(p2)));
    }
    if (!((forwardValue3016809_339_0 != 0))) {
        break forward_join_389;
    }
    life6_386 = __fieldRead3016809_110(__fieldRead3016809_109(p1));
    spill3016809_14 = life6_386;
    if (!((p4 == null))) {
        forwardValue3016809_350_0 = spill3016809_14;
        break forward_join_350;
    }
    if (!((__instanceOf3016809_111(spill3016809_14) != 0))) {
        break forward_join_389;
    }
    forwardValue3016809_350_0 = life6_386;
    }
    life7_396 = __cast3016809_112(forwardValue3016809_350_0);
    spill3016809_15 = __call3016809_113(p2);
    if (!((p4 == null))) {
        forwardValue3016809_359_0 = spill3016809_15;
        break forward_join_359;
    }
    if (!((spill3016809_15 != null))) {
        break forward_join_386;
    }
    forwardValue3016809_359_0 = __call3016809_114(p2);
    }
    if (!((p4 == null))) {
        forwardValue3016809_366_0 = forwardValue3016809_359_0;
        break forward_join_366;
    }
    if (!((__call3016809_115(forwardValue3016809_359_0) >= 1))) {
        break forward_join_386;
    }
    forwardValue3016809_366_0 = __call3016809_116(p2);
    }
    life6_422 = __call3016809_119(__call3016809_118(forwardValue3016809_366_0, __invokedynamic3016809_117(26146, (4306381912090794391L ^ p3))));
    if (!((__call3016809_120(life6_422) <= __invokedynamic3016809_121(4138, (5914832861949505438L ^ p3))))) {
        break forward_join_385;
    }
    __call3016809_122(life7_396, life6_422);
    }
    break forward_join_389;
    }
    __call3016809_123(life7_396, "");
    }
    return;
}
public static void h168_10(java.lang.Throwable p0, net.minecraft.network.PacketBuffer p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3016810_0(p1);
    throw life2_2;
}
public static void h168_11(java.lang.Exception p0) throws Throwable {
    throw __call3016811_0(p0);
}
public static void h168_12(java.lang.Exception p0) throws Throwable {
    throw __call3016812_0(p0);
}
public static void h168_13(java.lang.Exception p0) throws Throwable {
    throw __call3016813_0(p0);
}
public static void h168_14(java.lang.Exception p0) throws Throwable {
    throw __call3016814_0(p0);
}
public static void h168_15(java.lang.Exception p0) throws Throwable {
    throw __call3016815_0(p0);
}
public static void h168_16(java.lang.Exception p0) throws Throwable {
    throw __call3016816_0(p0);
}
public static void h168_17(java.lang.Exception p0) throws Throwable {
    throw __call3016817_0(p0);
}
public static void h168_18(java.lang.Exception p0) throws Throwable {
    throw __call3016818_0(p0);
}
public static void h168_19(java.lang.Exception p0) throws Throwable {
    throw __call3016819_0(p0);
}
public static void h168_20(java.lang.Exception p0) throws Throwable {
    throw __call3016820_0(p0);
}
public static void h168_21(java.lang.Exception p0) throws Throwable {
    throw __call3016821_0(p0);
}
public static void h168_22(java.lang.Exception p0, net.minecraft.network.NetHandlerPlayServer p1, moom.zq p2, long p3, java.lang.String p4, net.minecraft.network.PacketBuffer p5) throws Throwable {
    moom.v8 forwardValue3016822_32_0;
    int forwardValue3016822_40_0;
    int forwardValue3016822_67_0;
    net.minecraft.tileentity.TileEntity forwardValue3016822_107_0;
    int forwardValue3016822_112_0;
    net.minecraft.entity.Entity forwardValue3016822_127_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue3016822_177_0;
    int forwardValue3016822_190_0;
    moom.wB forwardValue3016822_222_0;
    int forwardValue3016822_243_0;
    moom.v8 forwardValue3016822_254_0;
    net.minecraft.network.PacketBuffer forwardValue3016822_263_0;
    net.minecraft.network.PacketBuffer forwardValue3016822_270_0;
    boolean spill3016822_0;
    moom.v8 spill3016822_1;
    boolean spill3016822_2;
    net.minecraft.entity.player.EntityPlayerMP spill3016822_3;
    net.minecraft.entity.player.EntityPlayerMP spill3016822_4;
    int spill3016822_5;
    net.minecraft.tileentity.TileEntity spill3016822_6;
    net.minecraft.entity.Entity spill3016822_7;
    moom.wB spill3016822_8;
    moom.v8 spill3016822_9;
    net.minecraft.network.PacketBuffer spill3016822_10;
    java.lang.Exception life8_2;
    int life6_25;
    moom.v8 life8_29;
    net.minecraft.network.PacketBuffer life6_92;
    int life8_95;
    moom.qV life9_97;
    net.minecraft.tileentity.TileEntity life10_116;
    net.minecraft.entity.Entity life10_138;
    java.lang.String life10_154;
    int life11_157;
    net.minecraft.network.PacketBuffer life6_229;
    int life8_232;
    int life9_235;
    moom.wa life10_240;
    moom.wB life11_244;
    net.minecraft.inventory.IInventory life12_258;
    moom.v8 life6_279;
    moom.wk life7_289;
    java.lang.String life6_315;
    forward_join_293: {
    forward_join_290: {
    forward_join_289: {
    forward_join_270: {
    forward_join_263: {
    forward_join_254: {
    forward_join_243: {
    forward_join_239: {
    forward_join_238: {
    forward_join_222: {
    forward_join_190: {
    forward_join_186: {
    forward_join_177: {
    forward_join_175: {
    forward_join_173: {
    forward_join_170: {
    forward_join_157: {
    forward_join_155: {
    forward_join_130: {
    forward_join_127: {
    forward_join_112: {
    forward_join_111: {
    forward_join_110: {
    forward_join_107: {
    forward_join_67: {
    forward_join_60: {
    forward_join_40: {
    forward_join_36: {
    forward_join_35: {
    forward_join_32: {
    life8_2 = p0;
    __call3016822_1(__fieldRead3016822_0(), "Couldn't sign book", life8_2);
    __call3016822_2(p5);
    if (!((p4 != null))) {
        break forward_join_293;
    }
    spill3016822_0 = __call3016822_4("MC|TrSel", __call3016822_3(p2));
    if (!((p4 == null))) {
        forwardValue3016822_40_0 = __integerCategory3016822_5(spill3016822_0);
        break forward_join_40;
    }
    if (!(spill3016822_0)) {
        break forward_join_36;
    }
    life6_25 = __call3016822_7(__call3016822_6(p2));
    life8_29 = __fieldRead3016822_9(__fieldRead3016822_8(p1));
    spill3016822_1 = life8_29;
    if (!((p4 == null))) {
        forwardValue3016822_32_0 = spill3016822_1;
        break forward_join_32;
    }
    if (!((__instanceOf3016822_10(spill3016822_1) != 0))) {
        break forward_join_35;
    }
    forwardValue3016822_32_0 = life8_29;
    }
    __call3016822_12(__cast3016822_11(forwardValue3016822_32_0), life6_25);
    }
    break forward_join_293;
    }
    forwardValue3016822_40_0 = __integerCategory3016822_15(__call3016822_14("MC|AdvCdm", __call3016822_13(p2)));
    }
    if (!((p4 == null))) {
        forwardValue3016822_190_0 = forwardValue3016822_40_0;
        break forward_join_190;
    }
    if (!((forwardValue3016822_40_0 != 0))) {
        break forward_join_186;
    }
    spill3016822_2 = __call3016822_17(__fieldRead3016822_16(p1));
    if (!((p4 == null))) {
        forwardValue3016822_67_0 = __integerCategory3016822_18(spill3016822_2);
        break forward_join_67;
    }
    if (!((!spill3016822_2))) {
        break forward_join_60;
    }
    __call3016822_20(__fieldRead3016822_19(p1), new moom.CN("advMode.notEnabled", new java.lang.Object[0]));
    if (!((p4 != null))) {
        break forward_join_293;
    }
    }
    spill3016822_3 = __fieldRead3016822_21(p1);
    if (!((p4 == null))) {
        forwardValue3016822_177_0 = spill3016822_3;
        break forward_join_177;
    }
    forwardValue3016822_67_0 = __integerCategory3016822_23(__call3016822_22(spill3016822_3, 2, ""));
    }
    if (!((forwardValue3016822_67_0 != 0))) {
        break forward_join_175;
    }
    spill3016822_4 = __fieldRead3016822_24(p1);
    if (!((p4 == null))) {
        forwardValue3016822_177_0 = spill3016822_4;
        break forward_join_177;
    }
    if (!(__fieldRead3016822_26(__fieldRead3016822_25(spill3016822_4)))) {
        break forward_join_175;
    }
    life6_92 = __call3016822_27(p2);
    life8_95 = __call3016822_28(life6_92);
    life9_97 = null;
    spill3016822_5 = life8_95;
    if (!((p4 == null))) {
        forwardValue3016822_112_0 = spill3016822_5;
        break forward_join_112;
    }
    if (!((spill3016822_5 == 0))) {
        break forward_join_111;
    }
    life10_116 = __call3016822_34(__fieldRead3016822_30(__fieldRead3016822_29(p1)), new moom.DT(__call3016822_31(life6_92), __call3016822_32(life6_92), __call3016822_33(life6_92)));
    spill3016822_6 = life10_116;
    if (!((p4 == null))) {
        forwardValue3016822_107_0 = spill3016822_6;
        break forward_join_107;
    }
    if (!((__instanceOf3016822_35(spill3016822_6) != 0))) {
        break forward_join_110;
    }
    forwardValue3016822_107_0 = life10_116;
    }
    life9_97 = __call3016822_37(__cast3016822_36(forwardValue3016822_107_0));
    }
    break forward_join_130;
    }
    forwardValue3016822_112_0 = life8_95;
    }
    if (!((forwardValue3016822_112_0 == 1))) {
        break forward_join_130;
    }
    life10_138 = __call3016822_41(__fieldRead3016822_39(__fieldRead3016822_38(p1)), __call3016822_40(life6_92));
    spill3016822_7 = life10_138;
    if (!((p4 == null))) {
        forwardValue3016822_127_0 = spill3016822_7;
        break forward_join_127;
    }
    if (!((__instanceOf3016822_42(spill3016822_7) != 0))) {
        break forward_join_130;
    }
    forwardValue3016822_127_0 = life10_138;
    }
    life9_97 = __call3016822_44(__cast3016822_43(forwardValue3016822_127_0));
    }
    life10_154 = __call3016822_46(life6_92, __call3016822_45(life6_92));
    life11_157 = __integerCategory3016822_48(__call3016822_47(life6_92));
    if (!((p4 == null))) {
        break forward_join_173;
    }
    if (!((life9_97 != null))) {
        break forward_join_170;
    }
    __call3016822_49(life9_97, life10_154);
    __call3016822_50(life9_97, life11_157);
    if (!((p4 == null))) {
        break forward_join_157;
    }
    if (!((life11_157 == 0))) {
        break forward_join_155;
    }
    __call3016822_51(life9_97, null);
    }
    __call3016822_52(life9_97);
    }
    __call3016822_54(__fieldRead3016822_53(p1), new moom.CN("advMode.setCommand.success", new java.lang.Object[] {life10_154}));
    }
    __call3016822_55(life6_92);
    }
    if (!((p4 != null))) {
        break forward_join_293;
    }
    }
    forwardValue3016822_177_0 = __fieldRead3016822_56(p1);
    }
    __call3016822_57(forwardValue3016822_177_0, new moom.CN("advMode.notAllowed", new java.lang.Object[0]));
    if (!((p4 != null))) {
        break forward_join_293;
    }
    }
    forwardValue3016822_190_0 = __integerCategory3016822_60(__call3016822_59("MC|Beacon", __call3016822_58(p2)));
    }
    if (!((p4 == null))) {
        forwardValue3016822_243_0 = forwardValue3016822_190_0;
        break forward_join_243;
    }
    if (!((forwardValue3016822_190_0 != 0))) {
        break forward_join_239;
    }
    if (!((__instanceOf3016822_63(__fieldRead3016822_62(__fieldRead3016822_61(p1))) != 0))) {
        break forward_join_293;
    }
    life6_229 = __call3016822_64(p2);
    life8_232 = __call3016822_65(life6_229);
    life9_235 = __call3016822_66(life6_229);
    life10_240 = __cast3016822_69(__fieldRead3016822_68(__fieldRead3016822_67(p1)));
    life11_244 = __call3016822_70(life10_240, 0);
    spill3016822_8 = life11_244;
    if (!((p4 == null))) {
        forwardValue3016822_222_0 = spill3016822_8;
        break forward_join_222;
    }
    if (!(__call3016822_71(spill3016822_8))) {
        break forward_join_238;
    }
    forwardValue3016822_222_0 = life11_244;
    }
    __call3016822_72(forwardValue3016822_222_0, 1);
    life12_258 = __call3016822_73(life10_240);
    __call3016822_74(life12_258, 1, life8_232);
    __call3016822_75(life12_258, 2, life9_235);
    __call3016822_76(life12_258);
    }
    break forward_join_293;
    }
    forwardValue3016822_243_0 = __integerCategory3016822_79(__call3016822_78("MC|ItemName", __call3016822_77(p2)));
    }
    if (!((forwardValue3016822_243_0 != 0))) {
        break forward_join_293;
    }
    life6_279 = __fieldRead3016822_81(__fieldRead3016822_80(p1));
    spill3016822_9 = life6_279;
    if (!((p4 == null))) {
        forwardValue3016822_254_0 = spill3016822_9;
        break forward_join_254;
    }
    if (!((__instanceOf3016822_82(spill3016822_9) != 0))) {
        break forward_join_293;
    }
    forwardValue3016822_254_0 = life6_279;
    }
    life7_289 = __cast3016822_83(forwardValue3016822_254_0);
    spill3016822_10 = __call3016822_84(p2);
    if (!((p4 == null))) {
        forwardValue3016822_263_0 = spill3016822_10;
        break forward_join_263;
    }
    if (!((spill3016822_10 != null))) {
        break forward_join_290;
    }
    forwardValue3016822_263_0 = __call3016822_85(p2);
    }
    if (!((p4 == null))) {
        forwardValue3016822_270_0 = forwardValue3016822_263_0;
        break forward_join_270;
    }
    if (!((__call3016822_86(forwardValue3016822_263_0) >= 1))) {
        break forward_join_290;
    }
    forwardValue3016822_270_0 = __call3016822_87(p2);
    }
    life6_315 = __call3016822_90(__call3016822_89(forwardValue3016822_270_0, __invokedynamic3016822_88(26146, (4306381912090794391L ^ p3))));
    if (!((__call3016822_91(life6_315) <= __invokedynamic3016822_92(4138, (5914832861949505438L ^ p3))))) {
        break forward_join_289;
    }
    __call3016822_93(life7_289, life6_315);
    }
    break forward_join_293;
    }
    __call3016822_94(life7_289, "");
    }
    return;
}
public static void h168_23(java.lang.Throwable p0, net.minecraft.network.PacketBuffer p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3016823_0(p1);
    throw life2_2;
}
public static void h168_24(java.lang.Exception p0) throws Throwable {
    throw __call3016824_0(p0);
}
public static void h168_25(java.lang.Exception p0) throws Throwable {
    throw __call3016825_0(p0);
}
public static void h168_26(java.lang.Exception p0) throws Throwable {
    throw __call3016826_0(p0);
}
public static void h168_27(java.lang.Exception p0) throws Throwable {
    throw __call3016827_0(p0);
}
public static void h168_28(java.lang.Exception p0, net.minecraft.network.NetHandlerPlayServer p1, moom.zq p2, long p3, java.lang.String p4) throws Throwable {
    int forwardValue3016828_39_0;
    net.minecraft.tileentity.TileEntity forwardValue3016828_79_0;
    int forwardValue3016828_84_0;
    net.minecraft.entity.Entity forwardValue3016828_99_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue3016828_149_0;
    int forwardValue3016828_162_0;
    moom.wB forwardValue3016828_194_0;
    int forwardValue3016828_215_0;
    moom.v8 forwardValue3016828_226_0;
    net.minecraft.network.PacketBuffer forwardValue3016828_235_0;
    net.minecraft.network.PacketBuffer forwardValue3016828_242_0;
    boolean spill3016828_0;
    boolean spill3016828_1;
    net.minecraft.entity.player.EntityPlayerMP spill3016828_2;
    net.minecraft.entity.player.EntityPlayerMP spill3016828_3;
    int spill3016828_4;
    net.minecraft.tileentity.TileEntity spill3016828_5;
    net.minecraft.entity.Entity spill3016828_6;
    moom.wB spill3016828_7;
    moom.v8 spill3016828_8;
    net.minecraft.network.PacketBuffer spill3016828_9;
    java.lang.Exception life7_2;
    net.minecraft.network.PacketBuffer life7_59;
    int life8_62;
    moom.qV life9_64;
    net.minecraft.tileentity.TileEntity life10_83;
    net.minecraft.entity.Entity life10_105;
    java.lang.String life10_121;
    int life11_124;
    net.minecraft.network.PacketBuffer life7_196;
    int life8_199;
    int life9_202;
    moom.wa life10_207;
    moom.wB life11_211;
    net.minecraft.inventory.IInventory life12_225;
    moom.v8 life7_246;
    moom.wk life6_256;
    java.lang.String life7_282;
    forward_join_265: {
    forward_join_262: {
    forward_join_261: {
    forward_join_242: {
    forward_join_235: {
    forward_join_226: {
    forward_join_215: {
    forward_join_211: {
    forward_join_210: {
    forward_join_194: {
    forward_join_162: {
    forward_join_158: {
    forward_join_149: {
    forward_join_147: {
    forward_join_145: {
    forward_join_142: {
    forward_join_129: {
    forward_join_127: {
    forward_join_102: {
    forward_join_99: {
    forward_join_84: {
    forward_join_83: {
    forward_join_82: {
    forward_join_79: {
    forward_join_39: {
    forward_join_32: {
    life7_2 = p0;
    __call3016828_1(__fieldRead3016828_0(), "Couldn't select trade", life7_2);
    if (!((p4 != null))) {
        break forward_join_265;
    }
    spill3016828_0 = __call3016828_3("MC|AdvCdm", __call3016828_2(p2));
    if (!((p4 == null))) {
        forwardValue3016828_162_0 = __integerCategory3016828_4(spill3016828_0);
        break forward_join_162;
    }
    if (!(spill3016828_0)) {
        break forward_join_158;
    }
    spill3016828_1 = __call3016828_6(__fieldRead3016828_5(p1));
    if (!((p4 == null))) {
        forwardValue3016828_39_0 = __integerCategory3016828_7(spill3016828_1);
        break forward_join_39;
    }
    if (!((!spill3016828_1))) {
        break forward_join_32;
    }
    __call3016828_9(__fieldRead3016828_8(p1), new moom.CN("advMode.notEnabled", new java.lang.Object[0]));
    if (!((p4 != null))) {
        break forward_join_265;
    }
    }
    spill3016828_2 = __fieldRead3016828_10(p1);
    if (!((p4 == null))) {
        forwardValue3016828_149_0 = spill3016828_2;
        break forward_join_149;
    }
    forwardValue3016828_39_0 = __integerCategory3016828_12(__call3016828_11(spill3016828_2, 2, ""));
    }
    if (!((forwardValue3016828_39_0 != 0))) {
        break forward_join_147;
    }
    spill3016828_3 = __fieldRead3016828_13(p1);
    if (!((p4 == null))) {
        forwardValue3016828_149_0 = spill3016828_3;
        break forward_join_149;
    }
    if (!(__fieldRead3016828_15(__fieldRead3016828_14(spill3016828_3)))) {
        break forward_join_147;
    }
    life7_59 = __call3016828_16(p2);
    life8_62 = __call3016828_17(life7_59);
    life9_64 = null;
    spill3016828_4 = life8_62;
    if (!((p4 == null))) {
        forwardValue3016828_84_0 = spill3016828_4;
        break forward_join_84;
    }
    if (!((spill3016828_4 == 0))) {
        break forward_join_83;
    }
    life10_83 = __call3016828_23(__fieldRead3016828_19(__fieldRead3016828_18(p1)), new moom.DT(__call3016828_20(life7_59), __call3016828_21(life7_59), __call3016828_22(life7_59)));
    spill3016828_5 = life10_83;
    if (!((p4 == null))) {
        forwardValue3016828_79_0 = spill3016828_5;
        break forward_join_79;
    }
    if (!((__instanceOf3016828_24(spill3016828_5) != 0))) {
        break forward_join_82;
    }
    forwardValue3016828_79_0 = life10_83;
    }
    life9_64 = __call3016828_26(__cast3016828_25(forwardValue3016828_79_0));
    }
    break forward_join_102;
    }
    forwardValue3016828_84_0 = life8_62;
    }
    if (!((forwardValue3016828_84_0 == 1))) {
        break forward_join_102;
    }
    life10_105 = __call3016828_30(__fieldRead3016828_28(__fieldRead3016828_27(p1)), __call3016828_29(life7_59));
    spill3016828_6 = life10_105;
    if (!((p4 == null))) {
        forwardValue3016828_99_0 = spill3016828_6;
        break forward_join_99;
    }
    if (!((__instanceOf3016828_31(spill3016828_6) != 0))) {
        break forward_join_102;
    }
    forwardValue3016828_99_0 = life10_105;
    }
    life9_64 = __call3016828_33(__cast3016828_32(forwardValue3016828_99_0));
    }
    life10_121 = __call3016828_35(life7_59, __call3016828_34(life7_59));
    life11_124 = __integerCategory3016828_37(__call3016828_36(life7_59));
    if (!((p4 == null))) {
        break forward_join_145;
    }
    if (!((life9_64 != null))) {
        break forward_join_142;
    }
    __call3016828_38(life9_64, life10_121);
    __call3016828_39(life9_64, life11_124);
    if (!((p4 == null))) {
        break forward_join_129;
    }
    if (!((life11_124 == 0))) {
        break forward_join_127;
    }
    __call3016828_40(life9_64, null);
    }
    __call3016828_41(life9_64);
    }
    __call3016828_43(__fieldRead3016828_42(p1), new moom.CN("advMode.setCommand.success", new java.lang.Object[] {life10_121}));
    }
    __call3016828_44(life7_59);
    }
    if (!((p4 != null))) {
        break forward_join_265;
    }
    }
    forwardValue3016828_149_0 = __fieldRead3016828_45(p1);
    }
    __call3016828_46(forwardValue3016828_149_0, new moom.CN("advMode.notAllowed", new java.lang.Object[0]));
    if (!((p4 != null))) {
        break forward_join_265;
    }
    }
    forwardValue3016828_162_0 = __integerCategory3016828_49(__call3016828_48("MC|Beacon", __call3016828_47(p2)));
    }
    if (!((p4 == null))) {
        forwardValue3016828_215_0 = forwardValue3016828_162_0;
        break forward_join_215;
    }
    if (!((forwardValue3016828_162_0 != 0))) {
        break forward_join_211;
    }
    if (!((__instanceOf3016828_52(__fieldRead3016828_51(__fieldRead3016828_50(p1))) != 0))) {
        break forward_join_265;
    }
    life7_196 = __call3016828_53(p2);
    life8_199 = __call3016828_54(life7_196);
    life9_202 = __call3016828_55(life7_196);
    life10_207 = __cast3016828_58(__fieldRead3016828_57(__fieldRead3016828_56(p1)));
    life11_211 = __call3016828_59(life10_207, 0);
    spill3016828_7 = life11_211;
    if (!((p4 == null))) {
        forwardValue3016828_194_0 = spill3016828_7;
        break forward_join_194;
    }
    if (!(__call3016828_60(spill3016828_7))) {
        break forward_join_210;
    }
    forwardValue3016828_194_0 = life11_211;
    }
    __call3016828_61(forwardValue3016828_194_0, 1);
    life12_225 = __call3016828_62(life10_207);
    __call3016828_63(life12_225, 1, life8_199);
    __call3016828_64(life12_225, 2, life9_202);
    __call3016828_65(life12_225);
    }
    break forward_join_265;
    }
    forwardValue3016828_215_0 = __integerCategory3016828_68(__call3016828_67("MC|ItemName", __call3016828_66(p2)));
    }
    if (!((forwardValue3016828_215_0 != 0))) {
        break forward_join_265;
    }
    life7_246 = __fieldRead3016828_70(__fieldRead3016828_69(p1));
    spill3016828_8 = life7_246;
    if (!((p4 == null))) {
        forwardValue3016828_226_0 = spill3016828_8;
        break forward_join_226;
    }
    if (!((__instanceOf3016828_71(spill3016828_8) != 0))) {
        break forward_join_265;
    }
    forwardValue3016828_226_0 = life7_246;
    }
    life6_256 = __cast3016828_72(forwardValue3016828_226_0);
    spill3016828_9 = __call3016828_73(p2);
    if (!((p4 == null))) {
        forwardValue3016828_235_0 = spill3016828_9;
        break forward_join_235;
    }
    if (!((spill3016828_9 != null))) {
        break forward_join_262;
    }
    forwardValue3016828_235_0 = __call3016828_74(p2);
    }
    if (!((p4 == null))) {
        forwardValue3016828_242_0 = forwardValue3016828_235_0;
        break forward_join_242;
    }
    if (!((__call3016828_75(forwardValue3016828_235_0) >= 1))) {
        break forward_join_262;
    }
    forwardValue3016828_242_0 = __call3016828_76(p2);
    }
    life7_282 = __call3016828_79(__call3016828_78(forwardValue3016828_242_0, __invokedynamic3016828_77(26146, (4306381912090794391L ^ p3))));
    if (!((__call3016828_80(life7_282) <= __invokedynamic3016828_81(4138, (5914832861949505438L ^ p3))))) {
        break forward_join_261;
    }
    __call3016828_82(life6_256, life7_282);
    }
    break forward_join_265;
    }
    __call3016828_83(life6_256, "");
    }
    return;
}
public static void h168_29(java.lang.Exception p0) throws Throwable {
    throw __call3016829_0(p0);
}
public static void h168_30(java.lang.Exception p0) throws Throwable {
    throw __call3016830_0(p0);
}
public static void h168_31(java.lang.Exception p0) throws Throwable {
    throw __call3016831_0(p0);
}
public static void h168_32(java.lang.Exception p0) throws Throwable {
    throw __call3016832_0(p0);
}
public static void h168_33(java.lang.Exception p0) throws Throwable {
    throw __call3016833_0(p0);
}
public static void h168_34(java.lang.Exception p0) throws Throwable {
    throw __call3016834_0(p0);
}
public static void h168_35(java.lang.Exception p0) throws Throwable {
    throw __call3016835_0(p0);
}
public static void h168_36(java.lang.Exception p0) throws Throwable {
    throw __call3016836_0(p0);
}
public static void h168_37(java.lang.Exception p0) throws Throwable {
    throw __call3016837_0(p0);
}
public static void h168_38(java.lang.Exception p0) throws Throwable {
    throw __call3016838_0(p0);
}
public static void h168_39(java.lang.Exception p0) throws Throwable {
    throw __call3016839_0(p0);
}
public static void h168_40(java.lang.Exception p0) throws Throwable {
    throw __call3016840_0(p0);
}
public static void h168_41(java.lang.Exception p0) throws Throwable {
    throw __call3016841_0(p0);
}
public static void h168_42(java.lang.Exception p0) throws Throwable {
    throw __call3016842_0(p0);
}
public static void h168_43(java.lang.Exception p0) throws Throwable {
    throw __call3016843_0(p0);
}
public static void h168_44(java.lang.Exception p0) throws Throwable {
    throw __call3016844_0(p0);
}
public static void h168_45(java.lang.Exception p0) throws Throwable {
    throw __call3016845_0(p0);
}
public static void h168_46(java.lang.Exception p0) throws Throwable {
    throw __call3016846_0(p0);
}
public static void h168_47(java.lang.Exception p0, net.minecraft.network.NetHandlerPlayServer p1, moom.zq p2, long p3, java.lang.String p4, net.minecraft.network.PacketBuffer p5) throws Throwable {
    moom.wB forwardValue3016847_58_0;
    int forwardValue3016847_79_0;
    moom.v8 forwardValue3016847_90_0;
    net.minecraft.network.PacketBuffer forwardValue3016847_99_0;
    net.minecraft.network.PacketBuffer forwardValue3016847_106_0;
    boolean spill3016847_0;
    moom.wB spill3016847_1;
    moom.v8 spill3016847_2;
    net.minecraft.network.PacketBuffer spill3016847_3;
    java.lang.Exception life8_2;
    net.minecraft.network.PacketBuffer life6_42;
    int life8_45;
    int life9_48;
    moom.wa life10_53;
    moom.wB life11_57;
    net.minecraft.inventory.IInventory life12_71;
    moom.v8 life6_92;
    moom.wk life7_102;
    java.lang.String life6_128;
    forward_join_129: {
    forward_join_126: {
    forward_join_125: {
    forward_join_106: {
    forward_join_99: {
    forward_join_90: {
    forward_join_79: {
    forward_join_75: {
    forward_join_74: {
    forward_join_58: {
    life8_2 = p0;
    __call3016847_1(__fieldRead3016847_0(), "Couldn't set command block", life8_2);
    __call3016847_2(p5);
    if (!((p4 != null))) {
        break forward_join_129;
    }
    __call3016847_4(__fieldRead3016847_3(p1), new moom.CN("advMode.notAllowed", new java.lang.Object[0]));
    if (!((p4 != null))) {
        break forward_join_129;
    }
    spill3016847_0 = __call3016847_6("MC|Beacon", __call3016847_5(p2));
    if (!((p4 == null))) {
        forwardValue3016847_79_0 = __integerCategory3016847_7(spill3016847_0);
        break forward_join_79;
    }
    if (!(spill3016847_0)) {
        break forward_join_75;
    }
    if (!((__instanceOf3016847_10(__fieldRead3016847_9(__fieldRead3016847_8(p1))) != 0))) {
        break forward_join_129;
    }
    life6_42 = __call3016847_11(p2);
    life8_45 = __call3016847_12(life6_42);
    life9_48 = __call3016847_13(life6_42);
    life10_53 = __cast3016847_16(__fieldRead3016847_15(__fieldRead3016847_14(p1)));
    life11_57 = __call3016847_17(life10_53, 0);
    spill3016847_1 = life11_57;
    if (!((p4 == null))) {
        forwardValue3016847_58_0 = spill3016847_1;
        break forward_join_58;
    }
    if (!(__call3016847_18(spill3016847_1))) {
        break forward_join_74;
    }
    forwardValue3016847_58_0 = life11_57;
    }
    __call3016847_19(forwardValue3016847_58_0, 1);
    life12_71 = __call3016847_20(life10_53);
    __call3016847_21(life12_71, 1, life8_45);
    __call3016847_22(life12_71, 2, life9_48);
    __call3016847_23(life12_71);
    }
    break forward_join_129;
    }
    forwardValue3016847_79_0 = __integerCategory3016847_26(__call3016847_25("MC|ItemName", __call3016847_24(p2)));
    }
    if (!((forwardValue3016847_79_0 != 0))) {
        break forward_join_129;
    }
    life6_92 = __fieldRead3016847_28(__fieldRead3016847_27(p1));
    spill3016847_2 = life6_92;
    if (!((p4 == null))) {
        forwardValue3016847_90_0 = spill3016847_2;
        break forward_join_90;
    }
    if (!((__instanceOf3016847_29(spill3016847_2) != 0))) {
        break forward_join_129;
    }
    forwardValue3016847_90_0 = life6_92;
    }
    life7_102 = __cast3016847_30(forwardValue3016847_90_0);
    spill3016847_3 = __call3016847_31(p2);
    if (!((p4 == null))) {
        forwardValue3016847_99_0 = spill3016847_3;
        break forward_join_99;
    }
    if (!((spill3016847_3 != null))) {
        break forward_join_126;
    }
    forwardValue3016847_99_0 = __call3016847_32(p2);
    }
    if (!((p4 == null))) {
        forwardValue3016847_106_0 = forwardValue3016847_99_0;
        break forward_join_106;
    }
    if (!((__call3016847_33(forwardValue3016847_99_0) >= 1))) {
        break forward_join_126;
    }
    forwardValue3016847_106_0 = __call3016847_34(p2);
    }
    life6_128 = __call3016847_37(__call3016847_36(forwardValue3016847_106_0, __invokedynamic3016847_35(26146, (4306381912090794391L ^ p3))));
    if (!((__call3016847_38(life6_128) <= __invokedynamic3016847_39(4138, (5914832861949505438L ^ p3))))) {
        break forward_join_125;
    }
    __call3016847_40(life7_102, life6_128);
    }
    break forward_join_129;
    }
    __call3016847_41(life7_102, "");
    }
    return;
}
public static void h168_48(java.lang.Throwable p0, net.minecraft.network.PacketBuffer p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3016848_0(p1);
    throw life2_2;
}
public static void h168_49(java.lang.Exception p0) throws Throwable {
    throw __call3016849_0(p0);
}
public static void h168_50(java.lang.Exception p0) throws Throwable {
    throw __call3016850_0(p0);
}
public static void h168_51(java.lang.Exception p0) throws Throwable {
    throw __call3016851_0(p0);
}
public static void h168_52(java.lang.Exception p0) throws Throwable {
    throw __call3016852_0(p0);
}
public static void h168_53(java.lang.Exception p0) throws Throwable {
    throw __call3016853_0(p0);
}
public static void h168_54(java.lang.Exception p0) throws Throwable {
    throw __call3016854_0(p0);
}
public static void h168_55(java.lang.Exception p0, net.minecraft.network.NetHandlerPlayServer p1, moom.zq p2, long p3, java.lang.String p4) throws Throwable {
    moom.v8 forwardValue3016855_23_0;
    net.minecraft.network.PacketBuffer forwardValue3016855_32_0;
    net.minecraft.network.PacketBuffer forwardValue3016855_39_0;
    moom.v8 spill3016855_0;
    net.minecraft.network.PacketBuffer spill3016855_1;
    java.lang.Exception life7_2;
    moom.v8 life7_18;
    moom.wk life6_28;
    java.lang.String life7_54;
    forward_join_62: {
    forward_join_59: {
    forward_join_58: {
    forward_join_39: {
    forward_join_32: {
    forward_join_23: {
    life7_2 = p0;
    __call3016855_1(__fieldRead3016855_0(), "Couldn't set beacon", life7_2);
    if (!((p4 != null))) {
        break forward_join_62;
    }
    if (!(__call3016855_3("MC|ItemName", __call3016855_2(p2)))) {
        break forward_join_62;
    }
    life7_18 = __fieldRead3016855_5(__fieldRead3016855_4(p1));
    spill3016855_0 = life7_18;
    if (!((p4 == null))) {
        forwardValue3016855_23_0 = spill3016855_0;
        break forward_join_23;
    }
    if (!((__instanceOf3016855_6(spill3016855_0) != 0))) {
        break forward_join_62;
    }
    forwardValue3016855_23_0 = life7_18;
    }
    life6_28 = __cast3016855_7(forwardValue3016855_23_0);
    spill3016855_1 = __call3016855_8(p2);
    if (!((p4 == null))) {
        forwardValue3016855_32_0 = spill3016855_1;
        break forward_join_32;
    }
    if (!((spill3016855_1 != null))) {
        break forward_join_59;
    }
    forwardValue3016855_32_0 = __call3016855_9(p2);
    }
    if (!((p4 == null))) {
        forwardValue3016855_39_0 = forwardValue3016855_32_0;
        break forward_join_39;
    }
    if (!((__call3016855_10(forwardValue3016855_32_0) >= 1))) {
        break forward_join_59;
    }
    forwardValue3016855_39_0 = __call3016855_11(p2);
    }
    life7_54 = __call3016855_14(__call3016855_13(forwardValue3016855_39_0, __invokedynamic3016855_12(26146, (4306381912090794391L ^ p3))));
    if (!((__call3016855_15(life7_54) <= __invokedynamic3016855_16(4138, (5914832861949505438L ^ p3))))) {
        break forward_join_58;
    }
    __call3016855_17(life6_28, life7_54);
    }
    break forward_join_62;
    }
    __call3016855_18(life6_28, "");
    }
    return;
}
public static void h168_56(java.lang.Exception p0) throws Throwable {
    throw __call3016856_0(p0);
}
public static void h168_57(java.lang.Exception p0) throws Throwable {
    throw __call3016857_0(p0);
}
public static void h168_58(java.lang.Exception p0) throws Throwable {
    throw __call3016858_0(p0);
}
public static void h168_59(java.lang.Exception p0) throws Throwable {
    throw __call3016859_0(p0);
}
public static void h168_60(java.lang.Exception p0) throws Throwable {
    throw __call3016860_0(p0);
}
public static void h168_61(java.lang.Exception p0) throws Throwable {
    throw __call3016861_0(p0);
}
public static void h168_62(java.lang.Exception p0) throws Throwable {
    throw __call3016862_0(p0);
}
public static void h168_63(java.lang.Exception p0) throws Throwable {
    throw __call3016863_0(p0);
}
private static native long __fieldRead168_0() throws Throwable;
private static native java.lang.String __call168_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_2(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call168_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call168_4(moom.zq a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native java.lang.String __call168_5(moom.zq a0) throws Throwable;
private static native boolean __call168_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory168_7(boolean value) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call168_8(moom.zq a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call168_9(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call168_10(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call168_11(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call168_12(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_13(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead168_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call168_15(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __call168_16(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.item.Item __call168_17(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead168_18() throws Throwable;
private static native net.minecraft.item.Item __call168_19(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.Item __call168_20(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call168_21(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __invokedynamic168_22(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call168_23(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call168_24(net.minecraft.item.ItemStack a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native boolean __call168_25(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.String __call168_26(moom.zq a0) throws Throwable;
private static native boolean __call168_27(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory168_28(boolean value) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call168_29(moom.zq a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call168_30(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call168_31(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call168_32(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call168_33(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_34(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead168_35(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call168_36(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __call168_37(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.item.Item __call168_38(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead168_39() throws Throwable;
private static native net.minecraft.item.Item __call168_40(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead168_41() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_42(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call168_43(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call168_44(net.minecraft.item.ItemStack a0, java.lang.String a1, moom.yA a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call168_45(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.String __call168_46(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call168_47(net.minecraft.item.ItemStack a0, java.lang.String a1, moom.yA a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call168_48(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __invokedynamic168_49(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call168_50(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call168_51(net.minecraft.item.ItemStack a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native net.minecraft.item.Item __fieldRead168_52() throws Throwable;
private static native void __call168_53(net.minecraft.item.ItemStack a0, net.minecraft.item.Item a1) throws Throwable;
private static native boolean __call168_54(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.String __call168_55(moom.zq a0) throws Throwable;
private static native boolean __call168_56(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory168_57(boolean value) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call168_58(moom.zq a0) throws Throwable;
private static native int __call168_59(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_60(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead168_61(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf168_62(moom.v8 a0) throws Throwable;
private static native moom.wi __cast168_63(moom.v8 a0) throws Throwable;
private static native void __call168_64(moom.wi a0, int a1) throws Throwable;
private static native java.lang.String __call168_65(moom.zq a0) throws Throwable;
private static native boolean __call168_66(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory168_67(boolean value) throws Throwable;
private static native moom.Bl __fieldRead168_68(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call168_69(moom.Bl a0) throws Throwable;
private static native int __integerCategory168_70(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_71(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call168_72(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_73(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call168_74(net.minecraft.entity.player.EntityPlayerMP a0, int a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory168_75(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_76(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead168_77(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __fieldRead168_78(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call168_79(moom.zq a0) throws Throwable;
private static native byte __call168_80(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_81(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead168_82(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call168_83(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call168_84(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call168_85(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call168_86(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __instanceOf168_87(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntityCommandBlock __cast168_88(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.qV __call168_89(net.minecraft.tileentity.TileEntityCommandBlock a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_90(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead168_91(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call168_92(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call168_93(net.minecraft.world.World a0, int a1) throws Throwable;
private static native int __instanceOf168_94(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tC __cast168_95(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.qV __call168_96(moom.tC a0) throws Throwable;
private static native int __call168_97(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.String __call168_98(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native boolean __call168_99(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __integerCategory168_100(boolean value) throws Throwable;
private static native void __call168_101(moom.qV a0, java.lang.String a1) throws Throwable;
private static native void __call168_102(moom.qV a0, int a1) throws Throwable;
private static native void __call168_103(moom.qV a0, java.lang.Object a1) throws Throwable;
private static native void __call168_104(moom.qV a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_105(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call168_106(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native boolean __call168_107(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_108(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call168_109(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native java.lang.String __call168_110(moom.zq a0) throws Throwable;
private static native boolean __call168_111(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory168_112(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_113(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead168_114(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf168_115(moom.v8 a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call168_116(moom.zq a0) throws Throwable;
private static native int __call168_117(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call168_118(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_119(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead168_120(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.wa __cast168_121(moom.v8 a0) throws Throwable;
private static native moom.wB __call168_122(moom.wa a0, int a1) throws Throwable;
private static native boolean __call168_123(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call168_124(moom.wB a0, int a1) throws Throwable;
private static native net.minecraft.inventory.IInventory __call168_125(moom.wa a0) throws Throwable;
private static native void __call168_126(net.minecraft.inventory.IInventory a0, int a1, int a2) throws Throwable;
private static native void __call168_127(net.minecraft.inventory.IInventory a0, int a1, int a2) throws Throwable;
private static native void __call168_128(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native java.lang.String __call168_129(moom.zq a0) throws Throwable;
private static native boolean __call168_130(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory168_131(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead168_132(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead168_133(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf168_134(moom.v8 a0) throws Throwable;
private static native moom.wk __cast168_135(moom.v8 a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call168_136(moom.zq a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call168_137(moom.zq a0) throws Throwable;
private static native int __call168_138(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call168_139(moom.zq a0) throws Throwable;
private static native int __invokedynamic168_140(int a0, long a1) throws Throwable;
private static native java.lang.String __call168_141(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.String __call168_142(java.lang.String a0) throws Throwable;
private static native int __call168_143(java.lang.String a0) throws Throwable;
private static native int __invokedynamic168_144(int a0, long a1) throws Throwable;
private static native void __call168_145(moom.wk a0, java.lang.String a1) throws Throwable;
private static native void __call168_146(moom.wk a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3016800_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016801_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016802_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016803_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016804_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016805_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016806_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016807_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016808_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3016809_0() throws Throwable;
private static native void __call3016809_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native boolean __call3016809_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.String __call3016809_3(moom.zq a0) throws Throwable;
private static native boolean __call3016809_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016809_5(boolean value) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016809_6(moom.zq a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call3016809_7(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call3016809_8(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call3016809_9(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call3016809_10(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_11(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead3016809_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call3016809_13(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __call3016809_14(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.item.Item __call3016809_15(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead3016809_16() throws Throwable;
private static native net.minecraft.item.Item __call3016809_17(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead3016809_18() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_19(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call3016809_20(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call3016809_21(net.minecraft.item.ItemStack a0, java.lang.String a1, moom.yA a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call3016809_22(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.String __call3016809_23(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call3016809_24(net.minecraft.item.ItemStack a0, java.lang.String a1, moom.yA a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call3016809_25(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __invokedynamic3016809_26(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call3016809_27(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call3016809_28(net.minecraft.item.ItemStack a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native net.minecraft.item.Item __fieldRead3016809_29() throws Throwable;
private static native void __call3016809_30(net.minecraft.item.ItemStack a0, net.minecraft.item.Item a1) throws Throwable;
private static native boolean __call3016809_31(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.String __call3016809_32(moom.zq a0) throws Throwable;
private static native boolean __call3016809_33(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016809_34(boolean value) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016809_35(moom.zq a0) throws Throwable;
private static native int __call3016809_36(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_37(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016809_38(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf3016809_39(moom.v8 a0) throws Throwable;
private static native moom.wi __cast3016809_40(moom.v8 a0) throws Throwable;
private static native void __call3016809_41(moom.wi a0, int a1) throws Throwable;
private static native java.lang.String __call3016809_42(moom.zq a0) throws Throwable;
private static native boolean __call3016809_43(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016809_44(boolean value) throws Throwable;
private static native moom.Bl __fieldRead3016809_45(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call3016809_46(moom.Bl a0) throws Throwable;
private static native int __integerCategory3016809_47(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_48(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call3016809_49(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_50(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call3016809_51(net.minecraft.entity.player.EntityPlayerMP a0, int a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory3016809_52(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_53(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead3016809_54(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __fieldRead3016809_55(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016809_56(moom.zq a0) throws Throwable;
private static native byte __call3016809_57(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_58(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead3016809_59(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call3016809_60(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call3016809_61(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call3016809_62(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call3016809_63(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __instanceOf3016809_64(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntityCommandBlock __cast3016809_65(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.qV __call3016809_66(net.minecraft.tileentity.TileEntityCommandBlock a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_67(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead3016809_68(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call3016809_69(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call3016809_70(net.minecraft.world.World a0, int a1) throws Throwable;
private static native int __instanceOf3016809_71(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tC __cast3016809_72(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.qV __call3016809_73(moom.tC a0) throws Throwable;
private static native int __call3016809_74(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.String __call3016809_75(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native boolean __call3016809_76(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __integerCategory3016809_77(boolean value) throws Throwable;
private static native void __call3016809_78(moom.qV a0, java.lang.String a1) throws Throwable;
private static native void __call3016809_79(moom.qV a0, int a1) throws Throwable;
private static native void __call3016809_80(moom.qV a0, java.lang.Object a1) throws Throwable;
private static native void __call3016809_81(moom.qV a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_82(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call3016809_83(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native boolean __call3016809_84(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_85(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call3016809_86(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native java.lang.String __call3016809_87(moom.zq a0) throws Throwable;
private static native boolean __call3016809_88(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016809_89(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_90(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016809_91(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf3016809_92(moom.v8 a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016809_93(moom.zq a0) throws Throwable;
private static native int __call3016809_94(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call3016809_95(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_96(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016809_97(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.wa __cast3016809_98(moom.v8 a0) throws Throwable;
private static native moom.wB __call3016809_99(moom.wa a0, int a1) throws Throwable;
private static native boolean __call3016809_100(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call3016809_101(moom.wB a0, int a1) throws Throwable;
private static native net.minecraft.inventory.IInventory __call3016809_102(moom.wa a0) throws Throwable;
private static native void __call3016809_103(net.minecraft.inventory.IInventory a0, int a1, int a2) throws Throwable;
private static native void __call3016809_104(net.minecraft.inventory.IInventory a0, int a1, int a2) throws Throwable;
private static native void __call3016809_105(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native java.lang.String __call3016809_106(moom.zq a0) throws Throwable;
private static native boolean __call3016809_107(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016809_108(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016809_109(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016809_110(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf3016809_111(moom.v8 a0) throws Throwable;
private static native moom.wk __cast3016809_112(moom.v8 a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016809_113(moom.zq a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016809_114(moom.zq a0) throws Throwable;
private static native int __call3016809_115(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016809_116(moom.zq a0) throws Throwable;
private static native int __invokedynamic3016809_117(int a0, long a1) throws Throwable;
private static native java.lang.String __call3016809_118(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.String __call3016809_119(java.lang.String a0) throws Throwable;
private static native int __call3016809_120(java.lang.String a0) throws Throwable;
private static native int __invokedynamic3016809_121(int a0, long a1) throws Throwable;
private static native void __call3016809_122(moom.wk a0, java.lang.String a1) throws Throwable;
private static native void __call3016809_123(moom.wk a0, java.lang.String a1) throws Throwable;
private static native boolean __call3016810_0(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.Throwable __call3016811_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016812_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016813_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016814_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016815_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016816_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016817_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016818_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016819_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016820_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016821_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3016822_0() throws Throwable;
private static native void __call3016822_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native boolean __call3016822_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.String __call3016822_3(moom.zq a0) throws Throwable;
private static native boolean __call3016822_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016822_5(boolean value) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016822_6(moom.zq a0) throws Throwable;
private static native int __call3016822_7(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016822_8(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016822_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf3016822_10(moom.v8 a0) throws Throwable;
private static native moom.wi __cast3016822_11(moom.v8 a0) throws Throwable;
private static native void __call3016822_12(moom.wi a0, int a1) throws Throwable;
private static native java.lang.String __call3016822_13(moom.zq a0) throws Throwable;
private static native boolean __call3016822_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016822_15(boolean value) throws Throwable;
private static native moom.Bl __fieldRead3016822_16(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call3016822_17(moom.Bl a0) throws Throwable;
private static native int __integerCategory3016822_18(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016822_19(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call3016822_20(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016822_21(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call3016822_22(net.minecraft.entity.player.EntityPlayerMP a0, int a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory3016822_23(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016822_24(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead3016822_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __fieldRead3016822_26(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016822_27(moom.zq a0) throws Throwable;
private static native byte __call3016822_28(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016822_29(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead3016822_30(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call3016822_31(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call3016822_32(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call3016822_33(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call3016822_34(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __instanceOf3016822_35(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntityCommandBlock __cast3016822_36(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.qV __call3016822_37(net.minecraft.tileentity.TileEntityCommandBlock a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016822_38(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead3016822_39(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call3016822_40(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call3016822_41(net.minecraft.world.World a0, int a1) throws Throwable;
private static native int __instanceOf3016822_42(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tC __cast3016822_43(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.qV __call3016822_44(moom.tC a0) throws Throwable;
private static native int __call3016822_45(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.String __call3016822_46(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native boolean __call3016822_47(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __integerCategory3016822_48(boolean value) throws Throwable;
private static native void __call3016822_49(moom.qV a0, java.lang.String a1) throws Throwable;
private static native void __call3016822_50(moom.qV a0, int a1) throws Throwable;
private static native void __call3016822_51(moom.qV a0, java.lang.Object a1) throws Throwable;
private static native void __call3016822_52(moom.qV a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016822_53(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call3016822_54(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native boolean __call3016822_55(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016822_56(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call3016822_57(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native java.lang.String __call3016822_58(moom.zq a0) throws Throwable;
private static native boolean __call3016822_59(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016822_60(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016822_61(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016822_62(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf3016822_63(moom.v8 a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016822_64(moom.zq a0) throws Throwable;
private static native int __call3016822_65(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call3016822_66(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016822_67(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016822_68(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.wa __cast3016822_69(moom.v8 a0) throws Throwable;
private static native moom.wB __call3016822_70(moom.wa a0, int a1) throws Throwable;
private static native boolean __call3016822_71(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call3016822_72(moom.wB a0, int a1) throws Throwable;
private static native net.minecraft.inventory.IInventory __call3016822_73(moom.wa a0) throws Throwable;
private static native void __call3016822_74(net.minecraft.inventory.IInventory a0, int a1, int a2) throws Throwable;
private static native void __call3016822_75(net.minecraft.inventory.IInventory a0, int a1, int a2) throws Throwable;
private static native void __call3016822_76(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native java.lang.String __call3016822_77(moom.zq a0) throws Throwable;
private static native boolean __call3016822_78(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016822_79(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016822_80(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016822_81(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf3016822_82(moom.v8 a0) throws Throwable;
private static native moom.wk __cast3016822_83(moom.v8 a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016822_84(moom.zq a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016822_85(moom.zq a0) throws Throwable;
private static native int __call3016822_86(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016822_87(moom.zq a0) throws Throwable;
private static native int __invokedynamic3016822_88(int a0, long a1) throws Throwable;
private static native java.lang.String __call3016822_89(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.String __call3016822_90(java.lang.String a0) throws Throwable;
private static native int __call3016822_91(java.lang.String a0) throws Throwable;
private static native int __invokedynamic3016822_92(int a0, long a1) throws Throwable;
private static native void __call3016822_93(moom.wk a0, java.lang.String a1) throws Throwable;
private static native void __call3016822_94(moom.wk a0, java.lang.String a1) throws Throwable;
private static native boolean __call3016823_0(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.Throwable __call3016824_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016825_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016826_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016827_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3016828_0() throws Throwable;
private static native void __call3016828_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native java.lang.String __call3016828_2(moom.zq a0) throws Throwable;
private static native boolean __call3016828_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016828_4(boolean value) throws Throwable;
private static native moom.Bl __fieldRead3016828_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call3016828_6(moom.Bl a0) throws Throwable;
private static native int __integerCategory3016828_7(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016828_8(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call3016828_9(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016828_10(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call3016828_11(net.minecraft.entity.player.EntityPlayerMP a0, int a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory3016828_12(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016828_13(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead3016828_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __fieldRead3016828_15(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016828_16(moom.zq a0) throws Throwable;
private static native byte __call3016828_17(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016828_18(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead3016828_19(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call3016828_20(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call3016828_21(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call3016828_22(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call3016828_23(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __instanceOf3016828_24(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntityCommandBlock __cast3016828_25(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.qV __call3016828_26(net.minecraft.tileentity.TileEntityCommandBlock a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016828_27(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead3016828_28(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call3016828_29(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call3016828_30(net.minecraft.world.World a0, int a1) throws Throwable;
private static native int __instanceOf3016828_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tC __cast3016828_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.qV __call3016828_33(moom.tC a0) throws Throwable;
private static native int __call3016828_34(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.String __call3016828_35(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native boolean __call3016828_36(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __integerCategory3016828_37(boolean value) throws Throwable;
private static native void __call3016828_38(moom.qV a0, java.lang.String a1) throws Throwable;
private static native void __call3016828_39(moom.qV a0, int a1) throws Throwable;
private static native void __call3016828_40(moom.qV a0, java.lang.Object a1) throws Throwable;
private static native void __call3016828_41(moom.qV a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016828_42(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call3016828_43(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native boolean __call3016828_44(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016828_45(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call3016828_46(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native java.lang.String __call3016828_47(moom.zq a0) throws Throwable;
private static native boolean __call3016828_48(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016828_49(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016828_50(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016828_51(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf3016828_52(moom.v8 a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016828_53(moom.zq a0) throws Throwable;
private static native int __call3016828_54(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call3016828_55(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016828_56(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016828_57(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.wa __cast3016828_58(moom.v8 a0) throws Throwable;
private static native moom.wB __call3016828_59(moom.wa a0, int a1) throws Throwable;
private static native boolean __call3016828_60(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call3016828_61(moom.wB a0, int a1) throws Throwable;
private static native net.minecraft.inventory.IInventory __call3016828_62(moom.wa a0) throws Throwable;
private static native void __call3016828_63(net.minecraft.inventory.IInventory a0, int a1, int a2) throws Throwable;
private static native void __call3016828_64(net.minecraft.inventory.IInventory a0, int a1, int a2) throws Throwable;
private static native void __call3016828_65(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native java.lang.String __call3016828_66(moom.zq a0) throws Throwable;
private static native boolean __call3016828_67(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016828_68(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016828_69(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016828_70(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf3016828_71(moom.v8 a0) throws Throwable;
private static native moom.wk __cast3016828_72(moom.v8 a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016828_73(moom.zq a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016828_74(moom.zq a0) throws Throwable;
private static native int __call3016828_75(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016828_76(moom.zq a0) throws Throwable;
private static native int __invokedynamic3016828_77(int a0, long a1) throws Throwable;
private static native java.lang.String __call3016828_78(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.String __call3016828_79(java.lang.String a0) throws Throwable;
private static native int __call3016828_80(java.lang.String a0) throws Throwable;
private static native int __invokedynamic3016828_81(int a0, long a1) throws Throwable;
private static native void __call3016828_82(moom.wk a0, java.lang.String a1) throws Throwable;
private static native void __call3016828_83(moom.wk a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3016829_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016830_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016831_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016832_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016833_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016834_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016835_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016836_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016837_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016838_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016839_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016840_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016841_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016842_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016843_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016844_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016845_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016846_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3016847_0() throws Throwable;
private static native void __call3016847_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native boolean __call3016847_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016847_3(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call3016847_4(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native java.lang.String __call3016847_5(moom.zq a0) throws Throwable;
private static native boolean __call3016847_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016847_7(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016847_8(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016847_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf3016847_10(moom.v8 a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016847_11(moom.zq a0) throws Throwable;
private static native int __call3016847_12(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call3016847_13(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016847_14(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016847_15(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.wa __cast3016847_16(moom.v8 a0) throws Throwable;
private static native moom.wB __call3016847_17(moom.wa a0, int a1) throws Throwable;
private static native boolean __call3016847_18(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call3016847_19(moom.wB a0, int a1) throws Throwable;
private static native net.minecraft.inventory.IInventory __call3016847_20(moom.wa a0) throws Throwable;
private static native void __call3016847_21(net.minecraft.inventory.IInventory a0, int a1, int a2) throws Throwable;
private static native void __call3016847_22(net.minecraft.inventory.IInventory a0, int a1, int a2) throws Throwable;
private static native void __call3016847_23(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native java.lang.String __call3016847_24(moom.zq a0) throws Throwable;
private static native boolean __call3016847_25(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3016847_26(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016847_27(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016847_28(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf3016847_29(moom.v8 a0) throws Throwable;
private static native moom.wk __cast3016847_30(moom.v8 a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016847_31(moom.zq a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016847_32(moom.zq a0) throws Throwable;
private static native int __call3016847_33(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016847_34(moom.zq a0) throws Throwable;
private static native int __invokedynamic3016847_35(int a0, long a1) throws Throwable;
private static native java.lang.String __call3016847_36(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.String __call3016847_37(java.lang.String a0) throws Throwable;
private static native int __call3016847_38(java.lang.String a0) throws Throwable;
private static native int __invokedynamic3016847_39(int a0, long a1) throws Throwable;
private static native void __call3016847_40(moom.wk a0, java.lang.String a1) throws Throwable;
private static native void __call3016847_41(moom.wk a0, java.lang.String a1) throws Throwable;
private static native boolean __call3016848_0(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.Throwable __call3016849_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016850_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016851_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016852_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016853_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016854_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3016855_0() throws Throwable;
private static native void __call3016855_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native java.lang.String __call3016855_2(moom.zq a0) throws Throwable;
private static native boolean __call3016855_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead3016855_4(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.v8 __fieldRead3016855_5(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __instanceOf3016855_6(moom.v8 a0) throws Throwable;
private static native moom.wk __cast3016855_7(moom.v8 a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016855_8(moom.zq a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016855_9(moom.zq a0) throws Throwable;
private static native int __call3016855_10(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call3016855_11(moom.zq a0) throws Throwable;
private static native int __invokedynamic3016855_12(int a0, long a1) throws Throwable;
private static native java.lang.String __call3016855_13(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.String __call3016855_14(java.lang.String a0) throws Throwable;
private static native int __call3016855_15(java.lang.String a0) throws Throwable;
private static native int __invokedynamic3016855_16(int a0, long a1) throws Throwable;
private static native void __call3016855_17(moom.wk a0, java.lang.String a1) throws Throwable;
private static native void __call3016855_18(moom.wk a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3016856_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016857_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016858_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016859_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016860_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016861_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016862_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3016863_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2d3b0d9e06f04ba6df93(net.minecraft.network.NetHandlerPlayServer a0, moom.zr a1) throws E;
private static final class __SourceHandler_2d3b0d9e06f04ba6df93 {

public static void f1640(net.minecraft.network.NetHandlerPlayServer receiver, moom.zr p0) throws Throwable {
    net.minecraft.entity.Entity lexicalValue1640_69_0;
    net.minecraft.world.World lexicalValue1640_70_0;
    net.minecraft.entity.player.EntityPlayerMP lexicalValue1640_168_0;
    net.minecraft.entity.player.EntityPlayerMP lexicalValue1640_187_0;
    java.lang.String spill1640_0;
    net.minecraft.world.WorldServer spill1640_1;
    net.minecraft.entity.Entity spill1640_2;
    net.minecraft.entity.player.EntityPlayerMP spill1640_3;
    net.minecraft.entity.player.EntityPlayerMP spill1640_4;
    long life2_3;
    java.lang.String life4_11;
    net.minecraft.entity.Entity life5_17;
    net.minecraft.world.WorldServer[] life6_21;
    int life7_24;
    int life8_26;
    net.minecraft.world.WorldServer life9_33;
    net.minecraft.world.WorldServer life6_101;
    net.minecraft.world.WorldServer life7_105;
    lexical_join_194: {
    lexical_join_187: {
    lexical_join_185: {
    lexical_join_168: {
    lexical_join_146: {
    lexical_join_70: {
    lexical_join_69: {
    lexical_join_53: {
    life2_3 = (__fieldRead1640_0() ^ 34776785528230L);
    spill1640_0 = __call1640_1();
    __call1640_4(p0, receiver, __call1640_3(__fieldRead1640_2(receiver)));
    life4_11 = spill1640_0;
    if (!(__call1640_6(__fieldRead1640_5(receiver)))) {
        break lexical_join_194;
    }
    life5_17 = null;
    life6_21 = __fieldRead1640_8(__fieldRead1640_7(receiver));
    life7_24 = (life6_21).length;
    life8_26 = 0;
    lexical_cycle_27: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    if (!((life8_26 < life7_24))) {
        break lexical_join_53;
    }
    life9_33 = (life6_21)[life8_26];
    if (!((life4_11 == null))) {
        break lexical_join_51;
    }
    spill1640_1 = life9_33;
    if (!((life4_11 == null))) {
        lexicalValue1640_70_0 = spill1640_1;
        break lexical_join_70;
    }
    if (!((spill1640_1 != null))) {
        break lexical_join_50;
    }
    life5_17 = __call1640_9(p0, life9_33);
    if (!((life4_11 == null))) {
        break lexical_join_51;
    }
    if (!((life5_17 != null))) {
        break lexical_join_50;
    }
    if (!((life4_11 != null))) {
        break lexical_join_53;
    }
    }
    life8_26 += 1;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    spill1640_2 = life5_17;
    if (!((life4_11 == null))) {
        lexicalValue1640_69_0 = spill1640_2;
        break lexical_join_69;
    }
    if (!((spill1640_2 != null))) {
        break lexical_join_194;
    }
    __call1640_12(__fieldRead1640_10(receiver), __fieldRead1640_11(receiver));
    spill1640_3 = __fieldRead1640_13(receiver);
    if (!((life4_11 == null))) {
        lexicalValue1640_187_0 = spill1640_3;
        break lexical_join_187;
    }
    __call1640_14(spill1640_3, null);
    lexicalValue1640_69_0 = life5_17;
    }
    lexicalValue1640_70_0 = __fieldRead1640_15(lexicalValue1640_69_0);
    }
    if (!((lexicalValue1640_70_0 != __fieldRead1640_17(__fieldRead1640_16(receiver))))) {
        break lexical_join_185;
    }
    life6_101 = __call1640_19(__fieldRead1640_18(receiver));
    life7_105 = __cast1640_21(__fieldRead1640_20(life5_17));
    __fieldWrite1640_24(__fieldRead1640_22(receiver), __fieldRead1640_23(life5_17));
    __call1640_33(receiver, new moom.zA(__fieldRead1640_26(__fieldRead1640_25(receiver)), __call1640_27(life6_101), __call1640_29(__call1640_28(life6_101)), __call1640_32(__fieldRead1640_31(__fieldRead1640_30(receiver)))));
    __call1640_35(life6_101, __fieldRead1640_34(receiver));
    __fieldWrite1640_37(__fieldRead1640_36(receiver), 0);
    __call1640_44(__fieldRead1640_38(receiver), __fieldRead1640_39(life5_17), __fieldRead1640_40(life5_17), __fieldRead1640_41(life5_17), __fieldRead1640_42(life5_17), __fieldRead1640_43(life5_17));
    spill1640_4 = __fieldRead1640_45(receiver);
    if (!((life4_11 == null))) {
        lexicalValue1640_168_0 = spill1640_4;
        break lexical_join_168;
    }
    if (!(__call1640_46(spill1640_4))) {
        break lexical_join_146;
    }
    __call1640_48(life6_101, __fieldRead1640_47(receiver), 0);
    __call1640_50(life7_105, __fieldRead1640_49(receiver));
    __call1640_52(life7_105, __fieldRead1640_51(receiver), 0);
    }
    __call1640_54(__fieldRead1640_53(receiver), life7_105);
    __call1640_58(__call1640_56(__fieldRead1640_55(receiver)), __fieldRead1640_57(receiver), life6_101);
    __call1640_63(__fieldRead1640_59(receiver), __fieldRead1640_60(life5_17), __fieldRead1640_61(life5_17), __fieldRead1640_62(life5_17));
    lexicalValue1640_168_0 = __fieldRead1640_64(receiver);
    }
    __call1640_66(__fieldRead1640_65(lexicalValue1640_168_0), life7_105);
    __call1640_70(__call1640_68(__fieldRead1640_67(receiver)), __fieldRead1640_69(receiver), life7_105);
    __call1640_74(__call1640_72(__fieldRead1640_71(receiver)), __fieldRead1640_73(receiver));
    break lexical_join_194;
    }
    lexicalValue1640_187_0 = __fieldRead1640_75(receiver);
    }
    __call1640_79(lexicalValue1640_187_0, __fieldRead1640_76(life5_17), __fieldRead1640_77(life5_17), __fieldRead1640_78(life5_17));
    }
    return;
}
public static void h1640_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164000_0(p0);
}
public static void h1640_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164001_0(p0);
}
public static void h1640_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164002_0(p0);
}
public static void h1640_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164003_0(p0);
}
public static void h1640_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164004_0(p0);
}
public static void h1640_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164005_0(p0);
}
public static void h1640_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164006_0(p0);
}
public static void h1640_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164007_0(p0);
}
public static void h1640_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164008_0(p0);
}
public static void h1640_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164009_0(p0);
}
private static native long __fieldRead1640_0() throws Throwable;
private static native java.lang.String __call1640_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_2(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1640_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1640_4(moom.zr a0, net.minecraft.network.NetHandlerPlayServer a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_5(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call1640_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.Bl __fieldRead1640_7(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead1640_8(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1640_9(moom.zr a0, net.minecraft.world.WorldServer a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_10(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_11(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1640_12(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_13(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1640_14(net.minecraft.entity.player.EntityPlayerMP a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1640_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_16(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1640_17(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_18(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __call1640_19(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1640_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.WorldServer __cast1640_21(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_22(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __fieldRead1640_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1640_24(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_25(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __fieldRead1640_26(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call1640_27(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1640_28(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.WorldType __call1640_29(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_30(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.Bo __fieldRead1640_31(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call1640_32(moom.Bo a0) throws Throwable;
private static native void __call1640_33(net.minecraft.network.NetHandlerPlayServer a0, moom.zA a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_34(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1640_35(net.minecraft.world.WorldServer a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_36(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite1640_37(net.minecraft.entity.player.EntityPlayerMP a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_38(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead1640_39(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1640_40(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1640_41(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1640_42(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead1640_43(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1640_44(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_45(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call1640_46(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_47(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1640_48(net.minecraft.world.WorldServer a0, net.minecraft.entity.player.EntityPlayerMP a1, int a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_49(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call1640_50(net.minecraft.world.WorldServer a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_51(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1640_52(net.minecraft.world.WorldServer a0, net.minecraft.entity.player.EntityPlayerMP a1, int a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_53(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1640_54(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.world.WorldServer a1) throws Throwable;
private static native moom.Bl __fieldRead1640_55(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1640_56(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_57(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1640_58(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_59(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead1640_60(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1640_61(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1640_62(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1640_63(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_64(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.Bo __fieldRead1640_65(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1640_66(moom.Bo a0, net.minecraft.world.WorldServer a1) throws Throwable;
private static native moom.Bl __fieldRead1640_67(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1640_68(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_69(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1640_70(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1, net.minecraft.world.WorldServer a2) throws Throwable;
private static native moom.Bl __fieldRead1640_71(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1640_72(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_73(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1640_74(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1640_75(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native double __fieldRead1640_76(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1640_77(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1640_78(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1640_79(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call1164000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164003_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164004_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164005_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164006_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164007_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164008_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164009_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_43663e876f0242c3bd0b(net.minecraft.network.NetHandlerPlayServer a0, net.minecraft.util.IChatComponent a1) throws E;
private static final class __SourceHandler_43663e876f0242c3bd0b {

public static void f1641(net.minecraft.network.NetHandlerPlayServer receiver, net.minecraft.util.IChatComponent p0) throws Throwable {
    int forwardValue1641_63_0;
    net.minecraft.network.NetHandlerPlayServer forwardValue1641_68_0;
    java.lang.String spill1641_0;
    boolean spill1641_1;
    net.minecraft.network.NetHandlerPlayServer spill1641_2;
    long life2_3;
    moom.CN life5_27;
    java.lang.String life4_28;
    forward_join_70: {
    forward_join_68: {
    forward_join_63: {
    life2_3 = (__fieldRead1641_0() ^ 7505803908367L);
    spill1641_0 = __call1641_1();
    __call1641_6(__fieldRead1641_2(), __invokedynamic1641_5(__call1641_4(__fieldRead1641_3(receiver)), p0));
    __call1641_8(__fieldRead1641_7(receiver));
    life5_27 = new moom.CN("multiplayer.player.left", new java.lang.Object[] {__call1641_10(__fieldRead1641_9(receiver))});
    life4_28 = spill1641_0;
    __call1641_13(__call1641_11(life5_27), __fieldRead1641_12());
    __call1641_16(__call1641_15(__fieldRead1641_14(receiver)), life5_27);
    __call1641_18(__fieldRead1641_17(receiver));
    __call1641_22(__call1641_20(__fieldRead1641_19(receiver)), __fieldRead1641_21(receiver));
    spill1641_1 = __call1641_24(__fieldRead1641_23(receiver));
    if (!((life4_28 == null))) {
        forwardValue1641_63_0 = __integerCategory1641_25(spill1641_1);
        break forward_join_63;
    }
    if (!(spill1641_1)) {
        break forward_join_70;
    }
    spill1641_2 = receiver;
    if (!((life4_28 == null))) {
        forwardValue1641_68_0 = spill1641_2;
        break forward_join_68;
    }
    forwardValue1641_63_0 = __integerCategory1641_31(__call1641_30(__call1641_27(__fieldRead1641_26(spill1641_2)), __call1641_29(__fieldRead1641_28(receiver))));
    }
    if (!((forwardValue1641_63_0 != 0))) {
        break forward_join_70;
    }
    __call1641_33(__fieldRead1641_32(), "Stopping singleplayer server as player logged out");
    forwardValue1641_68_0 = receiver;
    }
    __call1641_35(__fieldRead1641_34(forwardValue1641_68_0));
    }
    return;
}
public static void h1641_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164100_0(p0);
}
public static void h1641_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164101_0(p0);
}
public static void h1641_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164102_0(p0);
}
public static void h1641_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164103_0(p0);
}
private static native long __fieldRead1641_0() throws Throwable;
private static native java.lang.String __call1641_1() throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1641_2() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1641_3(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call1641_4(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __invokedynamic1641_5(java.lang.String a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native void __call1641_6(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native moom.Bl __fieldRead1641_7(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1641_8(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1641_9(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1641_10(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.CO __call1641_11(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1641_12() throws Throwable;
private static native moom.CO __call1641_13(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native moom.Bl __fieldRead1641_14(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1641_15(moom.Bl a0) throws Throwable;
private static native void __call1641_16(net.minecraft.server.management.ServerConfigurationManager a0, moom.CN a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1641_17(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1641_18(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.Bl __fieldRead1641_19(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1641_20(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1641_21(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1641_22(net.minecraft.server.management.ServerConfigurationManager a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native moom.Bl __fieldRead1641_23(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native boolean __call1641_24(moom.Bl a0) throws Throwable;
private static native int __integerCategory1641_25(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead1641_26(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call1641_27(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.Bl __fieldRead1641_28(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native java.lang.String __call1641_29(moom.Bl a0) throws Throwable;
private static native boolean __call1641_30(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1641_31(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1641_32() throws Throwable;
private static native void __call1641_33(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native moom.Bl __fieldRead1641_34(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call1641_35(moom.Bl a0) throws Throwable;
private static native java.lang.Throwable __call1164100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164103_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_bfa7b54c37b145133275(net.minecraft.network.NetHandlerPlayServer a0, moom.y7 a1) throws E;
private static final class __SourceHandler_bfa7b54c37b145133275 {

public static boolean f1642(net.minecraft.network.NetHandlerPlayServer receiver, moom.y7 p0) throws Throwable {
    int forwardValue1642_37_0;
    int forwardValue1642_39_0;
    boolean spill1642_0;
    boolean spill1642_1;
    boolean spill1642_2;
    boolean spill1642_3;
    boolean spill1642_4;
    long life2_3;
    java.lang.String life4_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    life2_3 = (__fieldRead1642_0() ^ 98849760325914L);
    life4_5 = __call1642_1();
    spill1642_0 = __call1642_3(__call1642_2(p0));
    if (!((life4_5 == null))) {
        forwardValue1642_37_0 = __integerCategory1642_4(spill1642_0);
        break forward_join_37;
    }
    if (!(spill1642_0)) {
        break forward_join_36;
    }
    spill1642_1 = __call1642_6(__call1642_5(p0));
    if (!((life4_5 == null))) {
        forwardValue1642_37_0 = __integerCategory1642_7(spill1642_1);
        break forward_join_37;
    }
    if (!(spill1642_1)) {
        break forward_join_36;
    }
    spill1642_2 = __call1642_9(__call1642_8(p0));
    if (!((life4_5 == null))) {
        forwardValue1642_37_0 = __integerCategory1642_10(spill1642_2);
        break forward_join_37;
    }
    if (!(spill1642_2)) {
        break forward_join_36;
    }
    spill1642_3 = __call1642_12(__call1642_11(p0));
    if (!((life4_5 == null))) {
        forwardValue1642_37_0 = __integerCategory1642_13(spill1642_3);
        break forward_join_37;
    }
    if (!(spill1642_3)) {
        break forward_join_36;
    }
    spill1642_4 = __call1642_15(__call1642_14(p0));
    if (!((life4_5 == null))) {
        forwardValue1642_37_0 = __integerCategory1642_16(spill1642_4);
        break forward_join_37;
    }
    if (!((!spill1642_4))) {
        break forward_join_38;
    }
    }
    forwardValue1642_37_0 = 1;
    }
    forwardValue1642_39_0 = forwardValue1642_37_0;
    break forward_join_39;
    }
    forwardValue1642_39_0 = 0;
    }
    return __integerCategory1642_17(forwardValue1642_39_0);
}
public static void h1642_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164200_0(p0);
}
public static void h1642_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164201_0(p0);
}
public static void h1642_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164202_0(p0);
}
public static void h1642_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164203_0(p0);
}
public static void h1642_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164204_0(p0);
}
public static void h1642_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164205_0(p0);
}
public static void h1642_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164206_0(p0);
}
public static void h1642_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164207_0(p0);
}
public static void h1642_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1164208_0(p0);
}
private static native long __fieldRead1642_0() throws Throwable;
private static native java.lang.String __call1642_1() throws Throwable;
private static native double __call1642_2(moom.y7 a0) throws Throwable;
private static native boolean __call1642_3(double a0) throws Throwable;
private static native int __integerCategory1642_4(boolean value) throws Throwable;
private static native double __call1642_5(moom.y7 a0) throws Throwable;
private static native boolean __call1642_6(double a0) throws Throwable;
private static native int __integerCategory1642_7(boolean value) throws Throwable;
private static native double __call1642_8(moom.y7 a0) throws Throwable;
private static native boolean __call1642_9(double a0) throws Throwable;
private static native int __integerCategory1642_10(boolean value) throws Throwable;
private static native float __call1642_11(moom.y7 a0) throws Throwable;
private static native boolean __call1642_12(float a0) throws Throwable;
private static native int __integerCategory1642_13(boolean value) throws Throwable;
private static native float __call1642_14(moom.y7 a0) throws Throwable;
private static native boolean __call1642_15(float a0) throws Throwable;
private static native int __integerCategory1642_16(boolean value) throws Throwable;
private static native boolean __integerCategory1642_17(int value) throws Throwable;
private static native java.lang.Throwable __call1164200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164204_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164205_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164206_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164207_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1164208_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9bcc17046f5e018a109d(net.minecraft.network.NetHandlerPlayServer a0) throws E;
private static final class __SourceHandler_9bcc17046f5e018a109d {

public static void f271(net.minecraft.network.NetHandlerPlayServer receiver) throws Throwable {
    int forwardValue271_62_0;
    int forwardValue271_73_0;
    int forwardValue271_87_0;
    int forwardValue271_93_0;
    int forwardValue271_118_0;
    java.lang.String spill271_0;
    int spill271_1;
    long life1_3;
    java.lang.String life3_8;
    forward_join_122: {
    forward_join_118: {
    forward_join_93: {
    forward_join_87: {
    forward_join_82: {
    forward_join_73: {
    forward_join_71: {
    forward_join_62: {
    forward_join_56: {
    life1_3 = (__fieldRead271_0() ^ 41665630624728L);
    spill271_0 = __call271_1();
    __fieldWrite271_2(receiver, 0);
    life3_8 = spill271_0;
    net.minecraft.network.NetHandlerPlayServer __stackOp271_3_0 = receiver;
    __fieldWrite271_5(__stackOp271_3_0, (__fieldRead271_4(__stackOp271_3_0) + 1));
    __call271_8(__fieldRead271_7(__fieldRead271_6(receiver)), "keepAlive");
    spill271_1 = __numericCompare271_12((((long) __fieldRead271_9(receiver)) - __fieldRead271_10(receiver)), __invokedynamic271_11(18877, (78193869050770555L ^ life1_3)));
    if (!((life3_8 == null))) {
        forwardValue271_62_0 = spill271_1;
        break forward_join_62;
    }
    if (!((spill271_1 > 0))) {
        break forward_join_56;
    }
    __fieldWrite271_14(receiver, ((long) __fieldRead271_13(receiver)));
    __fieldWrite271_16(receiver, __call271_15(receiver));
    __fieldWrite271_18(receiver, ((int) __fieldRead271_17(receiver)));
    __call271_20(receiver, new moom.zt(__fieldRead271_19(receiver)));
    }
    __call271_23(__fieldRead271_22(__fieldRead271_21(receiver)));
    forwardValue271_62_0 = __fieldRead271_24(receiver);
    }
    if (!((life3_8 == null))) {
        forwardValue271_73_0 = forwardValue271_62_0;
        break forward_join_73;
    }
    if (!((forwardValue271_62_0 > 0))) {
        break forward_join_71;
    }
    net.minecraft.network.NetHandlerPlayServer __stackOp271_25_0 = receiver;
    __fieldWrite271_27(__stackOp271_25_0, (__fieldRead271_26(__stackOp271_25_0) - 1));
    }
    forwardValue271_73_0 = __fieldRead271_28(receiver);
    }
    if (!((life3_8 == null))) {
        forwardValue271_87_0 = forwardValue271_73_0;
        break forward_join_87;
    }
    if (!((forwardValue271_73_0 > 0))) {
        break forward_join_82;
    }
    net.minecraft.network.NetHandlerPlayServer __stackOp271_29_0 = receiver;
    __fieldWrite271_31(__stackOp271_29_0, (__fieldRead271_30(__stackOp271_29_0) - 1));
    }
    forwardValue271_87_0 = __numericCompare271_34(__call271_33(__fieldRead271_32(receiver)), 0L);
    }
    if (!((life3_8 == null))) {
        forwardValue271_93_0 = forwardValue271_87_0;
        break forward_join_93;
    }
    if (!((forwardValue271_87_0 > 0))) {
        break forward_join_122;
    }
    forwardValue271_93_0 = __call271_36(__fieldRead271_35(receiver));
    }
    if (!((life3_8 == null))) {
        forwardValue271_118_0 = forwardValue271_93_0;
        break forward_join_118;
    }
    if (!((forwardValue271_93_0 > 0))) {
        break forward_join_122;
    }
    forwardValue271_118_0 = __numericCompare271_44((__call271_37() - __call271_39(__fieldRead271_38(receiver))), ((((long) __call271_41(__fieldRead271_40(receiver))) * __invokedynamic271_42(21511, (8900361795350653379L ^ life1_3))) * __invokedynamic271_43(11682, (2563031372108992615L ^ life1_3))));
    }
    if (!((forwardValue271_118_0 > 0))) {
        break forward_join_122;
    }
    __call271_45(receiver, "You have been idle for too long!");
    }
    return;
}
public static void h271_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027100_0(p0);
}
public static void h271_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027101_0(p0);
}
public static void h271_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027102_0(p0);
}
public static void h271_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027103_0(p0);
}
public static void h271_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027104_0(p0);
}
public static void h271_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027105_0(p0);
}
public static void h271_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027106_0(p0);
}
public static void h271_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027107_0(p0);
}
public static void h271_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027108_0(p0);
}
public static void h271_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027109_0(p0);
}
public static void h271_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027110_0(p0);
}
private static native long __fieldRead271_0() throws Throwable;
private static native java.lang.String __call271_1() throws Throwable;
private static native void __fieldWrite271_2(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native int __fieldRead271_4(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite271_5(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native moom.Bl __fieldRead271_6(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.A9 __fieldRead271_7(moom.Bl a0) throws Throwable;
private static native void __call271_8(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead271_9(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native long __fieldRead271_10(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native long __invokedynamic271_11(int a0, long a1) throws Throwable;
private static native int __numericCompare271_12(long a0, long a1) throws Throwable;
private static native int __fieldRead271_13(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite271_14(net.minecraft.network.NetHandlerPlayServer a0, long a1) throws Throwable;
private static native long __call271_15(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite271_16(net.minecraft.network.NetHandlerPlayServer a0, long a1) throws Throwable;
private static native long __fieldRead271_17(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite271_18(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native int __fieldRead271_19(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __call271_20(net.minecraft.network.NetHandlerPlayServer a0, moom.zt a1) throws Throwable;
private static native moom.Bl __fieldRead271_21(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native moom.A9 __fieldRead271_22(moom.Bl a0) throws Throwable;
private static native void __call271_23(moom.A9 a0) throws Throwable;
private static native int __fieldRead271_24(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __fieldRead271_26(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite271_27(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native int __fieldRead271_28(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __fieldRead271_30(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native void __fieldWrite271_31(net.minecraft.network.NetHandlerPlayServer a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead271_32(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native long __call271_33(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __numericCompare271_34(long a0, long a1) throws Throwable;
private static native moom.Bl __fieldRead271_35(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __call271_36(moom.Bl a0) throws Throwable;
private static native long __call271_37() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __fieldRead271_38(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native long __call271_39(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.Bl __fieldRead271_40(net.minecraft.network.NetHandlerPlayServer a0) throws Throwable;
private static native int __call271_41(moom.Bl a0) throws Throwable;
private static native long __invokedynamic271_42(int a0, long a1) throws Throwable;
private static native long __invokedynamic271_43(int a0, long a1) throws Throwable;
private static native int __numericCompare271_44(long a0, long a1) throws Throwable;
private static native void __call271_45(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1027100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027103_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027104_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027105_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027106_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027107_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027108_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027109_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1027110_0(java.lang.IllegalArgumentException a0) throws Throwable;

}


private void b(java.lang.String p0) {
((net.minecraft.command.ICommandManager)(((moom.Bl)(this.c)).a__qS())).a(((net.minecraft.command.ICommandSender)(this.d)), ((java.lang.String)(p0)));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12031_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.network.NetHandlerPlayServer.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long b(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20741);
    if (((net.minecraft.network.NetHandlerPlayServer.x)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.network.NetHandlerPlayServer.w)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.network.NetHandlerPlayServer.y)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.network.NetHandlerPlayServer.y)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/yF", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.network.NetHandlerPlayServer.x)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.network.NetHandlerPlayServer.x)[life3_8])).longValue();
}


public void c__Void() { __sourceHandlerCall_9bcc17046f5e018a109d(this); }


public void a(moom.zm p0) { __sourceHandlerCall_a75e68fcded825825097(this, p0); }


private long a() {
long local1 = (net.minecraft.network.NetHandlerPlayServer.s ^ 104462693608111L);
    return (java.lang.System.nanoTime() / __sourceIntrinsic_d3e4e16d7952_originalDynamicSite2030_2(31166, (257283381503243534L ^ local1)));
}


public void a(moom.y4 p0) { __sourceHandlerCall_a0320019adfedf51c475(this, p0); }


public void a(moom.zn p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(((net.minecraft.entity.player.EntityPlayerMP)(this.d)).a__Ew())));
    java.util.ArrayList local2 = com.google.common.collect.Lists.newArrayList();
    ((java.util.List)(local2)).addAll(((java.util.Collection)(((moom.Bl)(this.c)).a(((net.minecraft.command.ICommandSender)(this.d)), ((java.lang.String)(((moom.zn)(p0)).a())), ((moom.DT)(((moom.zn)(p0)).a__DT()))))));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(this.d)).cg)).a(((moom.yK)(new moom.At(((java.lang.String[])(((java.util.List)(local2)).toArray(((java.lang.Object[])(new java.lang.String[0])))))))));
    return;
}


public void a(moom.zo p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(((net.minecraft.entity.player.EntityPlayerMP)(this.d)).a__Ew())));
    ((net.minecraft.entity.player.EntityPlayerMP)(this.d)).a(((moom.zo)(p0)));
    return;
}


public void a(moom.zk p0) { __sourceHandlerCall_a05f18976e9933895ccc(this, p0); }


public void a(moom.zj p0) { __sourceHandlerCall_b679bcc70d3627df4c98(this, p0); }


public void a(moom.zi p0) { __sourceHandlerCall_75ec0a2ffbe97ccc6fd1(this, p0); }


public void a(moom.zl p0) { __sourceHandlerCall_f0089208936b9660daf5(this, p0); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.network.NetHandlerPlayServer.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12040_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.network.NetworkManager a__r() {
return this.b;
}


public void a(moom.zg p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(((net.minecraft.entity.player.EntityPlayerMP)(this.d)).a__Ew())));
    ((net.minecraft.entity.player.EntityPlayerMP)(this.d)).Z();
    return;
}


public void a(moom.zq p0) { __sourceHandlerCall_c76ae9a871fbc4a0f995(this, p0); }


public void a(java.lang.String p0) {
moom.CM local2_life0 = new moom.CM(p0);
    ((net.minecraft.network.NetworkManager)(this.b)).a(((moom.yK)(new moom.Az(((net.minecraft.util.IChatComponent) local2_life0)))), ((io.netty.util.concurrent.GenericFutureListener)(__sourceIntrinsic_474b89cf9bbb_originalDynamicSite11_2(this, local2_life0))), ((io.netty.util.concurrent.GenericFutureListener[])(new io.netty.util.concurrent.GenericFutureListener[0])));
    ((net.minecraft.network.NetworkManager)(this.b)).c();
    moom.Bl __sourceSpill11_8 = this.c;
    net.minecraft.network.NetworkManager __sourceEffectfulDup11_9 = this.b;
    net.minecraft.network.NetworkManager __sourceSpill11_11 = __sourceEffectfulDup11_9;
    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup11_9)));
    com.google.common.util.concurrent.Futures.getUnchecked(((java.util.concurrent.Future)(((moom.Bl)(__sourceSpill11_8)).a(((java.lang.Runnable)(__sourceIntrinsic_474b89cf9bbb_originalDynamicSite11_12(__sourceSpill11_11)))))));
    return;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6239;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/yF", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


public void a(moom.zr p0) { __sourceHandlerCall_2d3b0d9e06f04ba6df93(this, p0); }


public void a(moom.zs p0) {
return;
}


public void a(net.minecraft.util.IChatComponent p0) { __sourceHandlerCall_43663e876f0242c3bd0b(this, p0); }


public void a(moom.y7 p0) { __sourceHandlerCall_af5f4412070147b81bfe(this, p0); }


public void a(moom.yK p0) { __sourceHandlerCall_3211ada3e5874c20ef41(this, p0); }


public void a(double p0, double p1, double p2, float p3, float p4) {
((net.minecraft.network.NetHandlerPlayServer)(this)).a(((double)(p0)), ((double)(p1)), ((double)(p2)), ((float)(p3)), ((float)(p4)), ((java.util.Set)(java.util.Collections.emptySet())));
    return;
}


public void a(double p0, double p1, double p2, float p3, float p4, java.util.Set<net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags> p5) { __sourceHandlerCall_8662032e8a22ac444ff9(this, p0, p1, p2, p3, p4, p5); }


public void a(moom.za p0) { __sourceHandlerCall_e5cd45eb5e7f031a16ff(this, p0); }


public void a(moom.zb p0) { __sourceHandlerCall_5b3dc280ec5cf40112f0(this, p0); }


public void a(moom.ze p0) { __sourceHandlerCall_d5c0c69d7ba187be5884(this, p0); }


public void a(moom.y6 p0) { __sourceHandlerCall_c03a232f956e2daf02d0(this, p0); }


public void a(moom.zp p0) { __sourceHandlerCall_6881f4516537eab95f56(this, p0); }


public void a(moom.zf p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(((net.minecraft.entity.player.EntityPlayerMP)(this.d)).a__Ew())));
    ((net.minecraft.entity.player.EntityPlayerMP)(this.d)).a(((float)(((moom.zf)(p0)).a())), ((float)(((moom.zf)(p0)).b())), ((boolean)(((moom.zf)(p0)).a__Boolean())), ((boolean)(((moom.zf)(p0)).b__Boolean())));
    return;
}


public void a(moom.zh p0) { __sourceHandlerCall_46314390620990f687eb(this, p0); }


public void a(moom.zc p0) { __sourceHandlerCall_68eb4747b301a6504b9f(this, p0); }


public void a(moom.y5 p0) { __sourceHandlerCall_17c36717c49bbf4b0cce(this, p0); }


public void a(moom.zd p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(((net.minecraft.entity.player.EntityPlayerMP)(this.d)).a__Ew())));
    ((net.minecraft.entity.player.EntityPlayerMP)(this.d)).ac();
    ((net.minecraft.entity.player.EntityPlayerMP)(this.d)).B__sourceReturn_da8c82d5d4();
    return;
}


private boolean a__Boolean(moom.y7 p0) { return __sourceHandlerCall_bfa7b54c37b145133275(this, p0); }


private static java.lang.String lambda$sendPacket$1(moom.yK p0) throws java.lang.Exception {
return ((java.lang.Class)(((java.lang.Object)(p0)).getClass())).getCanonicalName();
}


private void lambda$kickPlayerFromServer$0(moom.CM p0, io.netty.util.concurrent.Future p1) throws java.lang.Exception {
((net.minecraft.network.NetworkManager)(this.b)).a(((net.minecraft.util.IChatComponent)(p0)));
    return;
}


private static native <E extends Throwable> long __sourceIntrinsic_d3e4e16d7952_originalDynamicSite2030_2(int a0, long a1) throws E;

private static native <E extends Throwable> io.netty.util.concurrent.GenericFutureListener __sourceIntrinsic_474b89cf9bbb_originalDynamicSite11_2(net.minecraft.network.NetHandlerPlayServer a0, moom.CM a1) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_474b89cf9bbb_originalDynamicSite11_12(net.minecraft.network.NetworkManager a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12040_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12031_0() throws E;
}
