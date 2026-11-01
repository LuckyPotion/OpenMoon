package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class fi extends com.moon.e2<com.moon.module.impl.Tickbase> {

private net.minecraft.entity.Entity e;

private long f;

private long g;

private double h;

private long i;

private boolean j;

private static final long k;

private static final long[] l;

private static final java.lang.Integer[] m;

private static final java.util.Map n;

private static final long[] o;

private static final java.lang.Long[] q;

private static final java.util.Map r;

public fi() {
super(com.moon.module.impl.Tickbase.class);
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(3891145744837775044L)), ((long)(-8455528165732873251L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(162478702363657L)))));

    n = ((java.util.Map)(new java.util.HashMap(13)));

    long local11_life7 = (com.moon.fi.k ^ 126985634899414L);

    javax.crypto.Cipher local13_life9;

    javax.crypto.Cipher __sourceSpill155_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill155_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill155_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill155_14 = new byte[8];

    (__sourceSpill155_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));

    int local14_life15 = 1;

    while ((local14_life15 < 8)) {

        (__sourceSpill155_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));

        local14_life15 += 1;

    }

    byte[] __sourcePreallocation155_16 = __sourceSpill155_14;

    ((javax.crypto.Cipher)(__sourceSpill155_11)).init(((int)(__sourceSpill155_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill155_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation155_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local19_life19 = new long[6];

    int local16_life20 = 0;

    java.lang.String local17_life21;

    int local18_life23 = ((java.lang.String)((local17_life21 = "FPSl}\b{²R Gû[\035ÚbñRB8ümæ\025\004\bZÄå-\000\036"))).length();

    int local15_life24 = 0;

    do {

        java.lang.String __sourceSpill155_25 = local17_life21;

        int __sourceSpill155_26 = local15_life24;

        local15_life24 += 8;

        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill155_25)).substring(((int)(__sourceSpill155_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill155_30 = local19_life19;

        int __sourceSpill155_31 = local16_life20;

        local16_life20 += 1;

        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));

        byte[] __sourceSpill155_33 = new byte[8];

        (__sourceSpill155_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));

        (__sourceSpill155_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));

        (__sourceSpill155_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));

        (__sourceSpill155_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));

        (__sourceSpill155_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));

        (__sourceSpill155_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));

        (__sourceSpill155_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));

        (__sourceSpill155_33)[7] = ((byte) ((int) local21_life32));

        javax.crypto.Cipher __sourceSpill155_34 = local13_life9;

        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill155_34)).doFinal(((byte[])(__sourceSpill155_33)));

        (__sourceSpill155_30)[__sourceSpill155_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));

    } while ((!(local15_life24 >= local18_life23)));

    local18_life23 = ((java.lang.String)((local17_life21 = "R§R(ï)ñåInô\023÷ÌÔ"))).length();

    local15_life24 = 0;

    do {

        java.lang.String __sourceSpill155_38 = local17_life21;

        int __sourceSpill155_39 = local15_life24;

        local15_life24 += 8;

        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill155_38)).substring(((int)(__sourceSpill155_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill155_43 = local19_life19;

        int __sourceSpill155_44 = local16_life20;

        local16_life20 += 1;

        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));

        byte[] __sourceSpill155_46 = new byte[8];

        (__sourceSpill155_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));

        (__sourceSpill155_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));

        (__sourceSpill155_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));

        (__sourceSpill155_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));

        (__sourceSpill155_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));

        (__sourceSpill155_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));

        (__sourceSpill155_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));

        (__sourceSpill155_46)[7] = ((byte) ((int) local21_life45));

        javax.crypto.Cipher __sourceSpill155_47 = local13_life9;

        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill155_47)).doFinal(((byte[])(__sourceSpill155_46)));

        (__sourceSpill155_43)[__sourceSpill155_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));

    } while ((!(local15_life24 >= local18_life23)));

    l = ((long[])(local19_life19));

    m = ((java.lang.Integer[])(new java.lang.Integer[6]));

    r = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life54;

    javax.crypto.Cipher __sourceSpill155_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill155_57 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill155_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill155_59 = new byte[8];

    (__sourceSpill155_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));

    int local1_life60 = 1;

    while ((local1_life60 < 8)) {

        (__sourceSpill155_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));

        local1_life60 += 1;

    }

    byte[] __sourcePreallocation155_61 = __sourceSpill155_59;

    ((javax.crypto.Cipher)(__sourceSpill155_56)).init(((int)(__sourceSpill155_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill155_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation155_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local6_life64 = new long[5];

    int local3_life65 = 0;

    java.lang.String local4_life66;

    int local5_life68 = ((java.lang.String)((local4_life66 = "\t}2ú+wL<wL(\013~8\000\003\005q"))).length();

    int local2_life69 = 0;

    do {

        java.lang.String __sourceSpill155_70 = local4_life66;

        int __sourceSpill155_71 = local2_life69;

        local2_life69 += 8;

        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill155_70)).substring(((int)(__sourceSpill155_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill155_75 = local6_life64;

        int __sourceSpill155_76 = local3_life65;

        local3_life65 += 1;

        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));

        byte[] __sourceSpill155_78 = new byte[8];

        (__sourceSpill155_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));

        (__sourceSpill155_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));

        (__sourceSpill155_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));

        (__sourceSpill155_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));

        (__sourceSpill155_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));

        (__sourceSpill155_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));

        (__sourceSpill155_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));

        (__sourceSpill155_78)[7] = ((byte) ((int) local8_life77));

        javax.crypto.Cipher __sourceSpill155_79 = local0_life54;

        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill155_79)).doFinal(((byte[])(__sourceSpill155_78)));

        (__sourceSpill155_75)[__sourceSpill155_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));

    } while ((!(local2_life69 >= local5_life68)));

    local5_life68 = ((java.lang.String)((local4_life66 = "ðÄR­ýÕàyê¦¯'n9¶"))).length();

    local2_life69 = 0;

    do {

        java.lang.String __sourceSpill155_83 = local4_life66;

        int __sourceSpill155_84 = local2_life69;

        local2_life69 += 8;

        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill155_83)).substring(((int)(__sourceSpill155_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill155_88 = local6_life64;

        int __sourceSpill155_89 = local3_life65;

        local3_life65 += 1;

        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));

        byte[] __sourceSpill155_91 = new byte[8];

        (__sourceSpill155_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));

        (__sourceSpill155_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));

        (__sourceSpill155_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));

        (__sourceSpill155_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));

        (__sourceSpill155_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));

        (__sourceSpill155_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));

        (__sourceSpill155_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));

        (__sourceSpill155_91)[7] = ((byte) ((int) local8_life90));

        javax.crypto.Cipher __sourceSpill155_92 = local0_life54;

        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill155_92)).doFinal(((byte[])(__sourceSpill155_91)));

        (__sourceSpill155_88)[__sourceSpill155_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));

    } while ((!(local2_life69 >= local5_life68)));

    o = ((long[])(local6_life64));

    q = ((java.lang.Long[])(new java.lang.Long[5]));
}


public void b() {
this.f = ((long)(0L));
    this.g = ((long)(0L));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1131_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/fi"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29172);
    if (((com.moon.fi.q)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.fi.o)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.fi.r)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.fi.r)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/fi", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.fi.q)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.fi.q)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.fi.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void c() {
net.minecraft.client.Minecraft forwardValue172_13_0;
    net.minecraft.client.Minecraft spill172_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_13: {
    forward_join_12: {
    life1_3 = (com.moon.fi.k ^ 54624666175583L);
    life3_5 = net.minecraft.init.Blocks.b();
    spill172_0 = com.moon.fi.a;
    if (!((life3_5 != null))) {
        forwardValue172_13_0 = spill172_0;
        break forward_join_13;
    }
    if (!((((net.minecraft.client.Minecraft)(spill172_0)).K == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue172_13_0 = com.moon.fi.a;
    }
    ((moom.DM)(((net.minecraft.client.Minecraft)(forwardValue172_13_0)).l)).c = ((float)(0x1.0p0f));
    return;
}


public void a(com.moon.event.PacketEvent p0) {
int forwardValue170_22_0;

    int forwardValue170_43_0;

    int forwardValue170_49_0;

    int forwardValue170_119_0;

    com.moon.fi forwardValue170_155_0;

    java.lang.String spill170_0;

    int spill170_1;

    int spill170_2;

    com.moon.fi spill170_3;

    int spill170_4;

    com.moon.fi spill170_5;

    com.moon.fi spill170_6;

    long life2_3;

    moom.yK life6_7;

    java.lang.String life4_8;

    moom.y6 life5_19;

    long life5_72;

    long life7_87;

    int life9_164;

    int life10_174;

    int life11_180;

    forward_join_162: {

    forward_join_157: {

    forward_join_155: {

    forward_join_154: {

    forward_join_119: {

    forward_join_87: {

    forward_join_49: {

    forward_join_43: {

    forward_join_41: {

    forward_join_22: {

    forward_join_20: {

    life2_3 = (com.moon.fi.k ^ 5466625910871L);

    spill170_0 = net.minecraft.init.Blocks.b();

    life6_7 = ((com.moon.event.PacketEvent)(p0)).getPacket();

    life4_8 = spill170_0;

    spill170_1 = ((life6_7 instanceof moom.y6) ? 1 : 0);

    if (!((life4_8 != null))) {

        forwardValue170_22_0 = spill170_1;

        break forward_join_22;

    }

    if (!((spill170_1 != 0))) {

        break forward_join_20;

    }

    life5_19 = ((moom.y6)(life6_7));

    ((com.moon.fi)(this)).a(((moom.y6)(life5_19)));

    }

    forwardValue170_22_0 = ((((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a()) ? 1 : 0);

    }

    if (!((life4_8 != null))) {

        forwardValue170_43_0 = forwardValue170_22_0;

        break forward_join_43;

    }

    if (!((forwardValue170_22_0 == 0))) {

        break forward_join_41;

    }

    spill170_2 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zB) ? 1 : 0);

    if (!((life4_8 != null))) {

        forwardValue170_43_0 = spill170_2;

        break forward_join_43;

    }

    if (!((spill170_2 != 0))) {

        break forward_join_41;

    }

    com.moon.fi __stackOp170_10_0 = this;

    ((com.moon.fi)(__stackOp170_10_0)).f = ((long)((((com.moon.fi)(__stackOp170_10_0)).f - __sourceIntrinsic_0d28a2dd2629_invokedynamic170_12(14424, (3479855372587676226L ^ life2_3)))));

    }

    forwardValue170_43_0 = ((((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a()) ? 1 : 0);

    }

    if (!((life4_8 != null))) {

        forwardValue170_49_0 = forwardValue170_43_0;

        break forward_join_49;

    }

    if (!((forwardValue170_43_0 != 0))) {

        break forward_join_157;

    }

    forwardValue170_49_0 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.y7) ? 1 : 0);

    }

    if (!((forwardValue170_49_0 != 0))) {

        break forward_join_157;

    }

    life5_72 = java.lang.System.currentTimeMillis();

    spill170_3 = this;

    if (!((life4_8 != null))) {

        forwardValue170_155_0 = spill170_3;

        break forward_join_155;

    }

    if (!((recovery.source.CarrierOps.lcmp(((long)(((com.moon.fi)(spill170_3)).g)), ((long)(0L))) != 0))) {

        break forward_join_154;

    }

    life7_87 = (life5_72 - this.g);

    spill170_4 = recovery.source.CarrierOps.lcmp(((long)(java.lang.Math.abs(((long)((life7_87 - __sourceIntrinsic_0d28a2dd2629_invokedynamic170_22(5531, (641849276945112966L ^ life2_3)))))))), ((long)(__sourceIntrinsic_0d28a2dd2629_invokedynamic170_24(14795, (767773867534857175L ^ life2_3)))));

    if (!((life4_8 != null))) {

        forwardValue170_119_0 = spill170_4;

        break forward_join_119;

    }

    if (!((spill170_4 <= 0))) {

        break forward_join_87;

    }

    life7_87 = __sourceIntrinsic_0d28a2dd2629_invokedynamic170_26(5531, (641849276945112966L ^ life2_3));

    }

    com.moon.fi __stackOp170_27_0 = this;

    ((com.moon.fi)(__stackOp170_27_0)).f = ((long)((((com.moon.fi)(__stackOp170_27_0)).f + (__sourceIntrinsic_0d28a2dd2629_invokedynamic170_29(5531, (641849276945112966L ^ life2_3)) - life7_87))));

    this.f = ((long)(java.lang.Math.min(((long)(this.f)), ((long)(0L)))));

    this.f = ((long)(java.lang.Math.max(((long)(this.f)), ((long)((-((com.moon.fi)(this)).a__sourceReturn_f9912cc5c6()))))));

    spill170_5 = this;

    if (!((life4_8 != null))) {

        forwardValue170_155_0 = spill170_5;

        break forward_join_155;

    }

    forwardValue170_119_0 = recovery.source.CarrierOps.dcmpl(((double)(((com.moon.fi)(spill170_5)).h)), ((double)(0x0.0p0d)));

    }

    if (!((forwardValue170_119_0 == 0))) {

        break forward_join_154;

    }

    spill170_6 = this;

    if (!((life4_8 != null))) {

        forwardValue170_155_0 = spill170_6;

        break forward_join_155;

    }

    life9_164 = ((int) (((double) (((com.moon.fi)(spill170_6)).a__sourceReturn_f9912cc5c6() + this.f)) / 0x1.9p5d));

    life10_174 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fi.a)).K)).U - __sourceIntrinsic_0d28a2dd2629_invokedynamic170_45(12598, (5236723991407209513L ^ life2_3)));

    life11_180 = java.lang.Math.min(((int)(life9_164)), ((int)(java.lang.Math.max(((int)(life10_174)), ((int)(0))))));

    if (!((life11_180 > 0))) {

        break forward_join_154;

    }

    this.h = ((double)(((double) life11_180)));

    }

    forwardValue170_155_0 = this;

    }

    ((com.moon.fi)(forwardValue170_155_0)).g = ((long)(life5_72));

    }

    if (!((life4_8 == null))) {

        break forward_join_162;

    }

    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));

    }

    return;
}


private void a(moom.y6 p0) {
com.moon.fi forestValue30_20_0;
    int forestValue30_27_0;
    int forestValue30_47_0;
    int forestValue30_52_0;
    int forestValue30_52_1;
    int forestValue30_65_0;
    int forestValue30_65_1;
    int forestValue30_76_0;
    int forestValue30_88_0;
    com.moon.fi spill30_0;
    int spill30_1;
    int spill30_2;
    int spill30_3;
    int spill30_4;
    int spill30_5;
    long life2_3;
    java.lang.String life4_5;
    int life5_104;
    int life6_112;
    forest_join_99: {
    forest_join_88: {
    forest_join_76: {
    forest_join_72: {
    forest_join_65: {
    forest_join_52: {
    forest_join_47: {
    forest_join_44: {
    forest_join_27: {
    forest_join_25: {
    forest_join_20: {
    forest_join_19: {
    life2_3 = (com.moon.fi.k ^ 111074818134164L);
    life4_5 = net.minecraft.init.Blocks.b();
    spill30_0 = this;
    if (!((life4_5 != null))) {
        forestValue30_20_0 = spill30_0;
        break forest_join_20;
    }
    if (!((((com.moon.fi)(spill30_0)).e != null))) {
        break forest_join_19;
    }
    spill30_1 = ((net.minecraft.entity.Entity)(this.e)).e__Int();
    if (!((life4_5 != null))) {
        forestValue30_27_0 = spill30_1;
        break forest_join_27;
    }
    if (!((spill30_1 != ((moom.y6)(p0)).a()))) {
        break forest_join_25;
    }
    }
    forestValue30_20_0 = this;
    }
    ((com.moon.fi)(forestValue30_20_0)).e = ((net.minecraft.entity.Entity)(((moom.y6)(p0)).a(((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.fi.a)).I)))));
    }
    forestValue30_27_0 = ((this.j) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue30_47_0 = forestValue30_27_0;
        break forest_join_47;
    }
    if (!((forestValue30_27_0 != 0))) {
        break forest_join_44;
    }
    spill30_2 = ((net.minecraft.entity.Entity)(this.e)).U;
    spill30_3 = __sourceIntrinsic_dadb575223bf_invokedynamic30_14(29707, (9095734238871572947L ^ life2_3));
    if (!((life4_5 != null))) {
        forestValue30_52_0 = spill30_2;
        forestValue30_52_1 = spill30_3;
        break forest_join_52;
    }
    if (!((spill30_2 <= spill30_3))) {
        break forest_join_44;
    }
    this.i = ((long)(java.lang.System.currentTimeMillis()));
    }
    forestValue30_47_0 = ((net.minecraft.entity.Entity)(this.e)).U;
    }
    forestValue30_52_0 = forestValue30_47_0;
    forestValue30_52_1 = __sourceIntrinsic_dadb575223bf_invokedynamic30_19(26465, (5351963111713522367L ^ life2_3));
    }
    if (!((life4_5 != null))) {
        forestValue30_65_0 = forestValue30_52_0;
        forestValue30_65_1 = forestValue30_52_1;
        break forest_join_65;
    }
    if (!((forestValue30_52_0 <= forestValue30_52_1))) {
        break forest_join_99;
    }
    spill30_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fi.a)).K)).U;
    if (!((life4_5 != null))) {
        forestValue30_76_0 = spill30_4;
        break forest_join_76;
    }
    forestValue30_65_0 = spill30_4;
    forestValue30_65_1 = __sourceIntrinsic_dadb575223bf_invokedynamic30_23(15954, (2559677289753811855L ^ life2_3));
    }
    if (!((forestValue30_65_0 <= forestValue30_65_1))) {
        break forest_join_72;
    }
    spill30_5 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fi.a)).K)).U;
    if (!((life4_5 != null))) {
        forestValue30_76_0 = spill30_5;
        break forest_join_76;
    }
    if (!((spill30_5 == 0))) {
        break forest_join_99;
    }
    }
    forestValue30_76_0 = recovery.source.CarrierOps.dcmpl(((double)(this.h)), ((double)(0x0.0p0d)));
    }
    if (!((life4_5 != null))) {
        forestValue30_88_0 = forestValue30_76_0;
        break forest_join_88;
    }
    if (!((forestValue30_76_0 == 0))) {
        break forest_join_99;
    }
    forestValue30_88_0 = ((int) (((double) (((com.moon.fi)(this)).a__sourceReturn_f9912cc5c6() + this.f)) / 0x1.9p5d));
    }
    life5_104 = forestValue30_88_0;
    life6_112 = java.lang.Math.min(((int)(life5_104)), ((int)(__sourceIntrinsic_dadb575223bf_invokedynamic30_31(10805, (8570249060188426218L ^ life2_3)))));
    if (!((life6_112 > 0))) {
        break forest_join_99;
    }
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1136_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/fi"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.eH p0) {
net.minecraft.entity.Entity forestValue31_24_0;
    net.minecraft.util.MovingObjectPosition forestValue31_62_0;
    net.minecraft.util.MovingObjectPosition forestValue31_67_0;
    int forestValue31_97_0;
    int forestValue31_101_0;
    int forestValue31_103_0;
    int forestValue31_115_0;
    int forestValue31_121_0;
    int forestValue31_136_0;
    int forestValue31_138_0;
    int forestValue31_159_0;
    net.minecraft.client.entity.EntityPlayerSP spill31_0;
    net.minecraft.util.MovingObjectPosition spill31_1;
    int spill31_2;
    int spill31_3;
    int spill31_4;
    int spill31_5;
    int spill31_6;
    long life2_3;
    java.lang.String life4_5;
    com.moon.n4 life5_47;
    moom.DR life6_52;
    net.minecraft.util.MovingObjectPosition life7_60;
    double life8_77;
    int life10_85;
    int life11_113;
    int life12_155;
    forest_join_160: {
    forest_join_159: {
    forest_join_155: {
    forest_join_138: {
    forest_join_137: {
    forest_join_136: {
    forest_join_135: {
    forest_join_121: {
    forest_join_115: {
    forest_join_106: {
    forest_join_103: {
    forest_join_102: {
    forest_join_101: {
    forest_join_97: {
    forest_join_87: {
    forest_join_67: {
    forest_join_62: {
    forest_join_34: {
    forest_join_26: {
    forest_join_24: {
    forest_join_22: {
    forest_join_21: {
    forest_join_18: {
    life2_3 = (com.moon.fi.k ^ 30207039974050L);
    life4_5 = net.minecraft.init.Blocks.b();
    if (!((life4_5 != null))) {
        break forest_join_21;
    }
    if (!((((net.minecraft.client.Minecraft)(com.moon.fi.a)).K != null))) {
        break forest_join_18;
    }
    spill31_0 = ((net.minecraft.client.Minecraft)(com.moon.fi.a)).K;
    if (!((life4_5 != null))) {
        forestValue31_24_0 = spill31_0;
        break forest_join_24;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(spill31_0)).S <= 1))) {
        break forest_join_22;
    }
    }
    this.f = ((long)(0L));
    }
    return;
    }
    forestValue31_24_0 = this.e;
    }
    if (!((forestValue31_24_0 == null))) {
        break forest_join_26;
    }
    return;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.fi.a)).l)).c))), ((double)(0x1.0p0d))) != 0))) {
        break forest_join_34;
    }
    return;
    }
    life5_47 = new com.moon.n4(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fi.a)).K)).cw, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fi.a)).K)).cx);
    life6_52 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fi.a)).K)).b(((float)(0x1.0p0f)));
    life7_60 = com.moon.nQ.a(((float)(((com.moon.n4)(life5_47)).a__Float())), ((float)(((com.moon.n4)(life5_47)).b__Float())), ((float)(0x1.0p3f)), ((float)(0x1.0p0f)));
    spill31_1 = life7_60;
    if (!((life4_5 != null))) {
        forestValue31_62_0 = spill31_1;
        break forest_join_62;
    }
    if (!((spill31_1 != null))) {
        break forest_join_155;
    }
    forestValue31_62_0 = life7_60;
    }
    if (!((life4_5 != null))) {
        forestValue31_67_0 = forestValue31_62_0;
        break forest_join_67;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forestValue31_62_0)).e != null))) {
        break forest_join_155;
    }
    forestValue31_67_0 = life7_60;
    }
    life8_77 = ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(forestValue31_67_0)).d)).b(((moom.DR)(life6_52)));
    life10_85 = ((int) (((double) (-this.f)) / 0x1.9p5d));
    spill31_2 = life10_85;
    if (!((life4_5 != null))) {
        forestValue31_97_0 = spill31_2;
        break forest_join_97;
    }
    if (!((spill31_2 < 1))) {
        break forest_join_87;
    }
    this.j = ((boolean)(false));
    }
    forestValue31_97_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - this.i))), ((long)(__sourceIntrinsic_56a6d861a15d_invokedynamic31_32(10593, (684251749698412938L ^ life2_3)))));
    }
    if (!((life4_5 != null))) {
        forestValue31_101_0 = forestValue31_97_0;
        break forest_join_101;
    }
    if (!((forestValue31_97_0 <= 0))) {
        break forest_join_102;
    }
    forestValue31_101_0 = 1;
    }
    forestValue31_103_0 = forestValue31_101_0;
    break forest_join_103;
    }
    forestValue31_103_0 = 0;
    }
    life11_113 = forestValue31_103_0;
    if (!((life11_113 != 0))) {
        break forest_join_106;
    }
    }
    spill31_3 = recovery.source.CarrierOps.dcmpl(((double)(life8_77)), ((double)(0x1.8p1d)));
    if (!((life4_5 != null))) {
        forestValue31_115_0 = spill31_3;
        break forest_join_115;
    }
    if (!((spill31_3 > 0))) {
        break forest_join_137;
    }
    forestValue31_115_0 = recovery.source.CarrierOps.dcmpg(((double)(life8_77)), ((double)(0x1.333334p2d)));
    }
    if (!((life4_5 != null))) {
        forestValue31_121_0 = forestValue31_115_0;
        break forest_join_121;
    }
    if (!((forestValue31_115_0 <= 0))) {
        break forest_join_137;
    }
    forestValue31_121_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fi.a)).K)).U;
    }
    if (!((life4_5 != null))) {
        forestValue31_136_0 = forestValue31_121_0;
        break forest_join_136;
    }
    if (!((forestValue31_121_0 >= __sourceIntrinsic_56a6d861a15d_invokedynamic31_39(2465, (3466351026336175694L ^ life2_3))))) {
        break forest_join_135;
    }
    spill31_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fi.a)).K)).aO;
    if (!((life4_5 != null))) {
        forestValue31_136_0 = spill31_4;
        break forest_join_136;
    }
    if (!((spill31_4 == 0))) {
        break forest_join_137;
    }
    }
    forestValue31_136_0 = 1;
    }
    forestValue31_138_0 = forestValue31_136_0;
    break forest_join_138;
    }
    forestValue31_138_0 = 0;
    }
    life12_155 = forestValue31_138_0;
    spill31_5 = life12_155;
    if (!((life4_5 != null))) {
        forestValue31_159_0 = spill31_5;
        break forest_join_159;
    }
    if (!((spill31_5 != 0))) {
        break forest_join_155;
    }
    spill31_6 = life10_85;
    if (!((life4_5 != null))) {
        forestValue31_159_0 = spill31_6;
        break forest_join_159;
    }
    if (!((spill31_6 >= 1))) {
        break forest_join_155;
    }
    ((com.moon.eH)(p0)).a(((int)(1)));
    this.j = ((boolean)(true));
    }
    forestValue31_159_0 = recovery.source.CarrierOps.dcmpl(((double)(this.h)), ((double)(0x0.0p0d)));
    }
    if (!((forestValue31_159_0 > 0))) {
        break forest_join_160;
    }
    }
    ((com.moon.eH)(p0)).a(((double)(this.h)));
    this.h = ((double)(0x0.0p0d));
    return;
}


private long a__sourceReturn_f9912cc5c6() {
long local1 = (com.moon.fi.k ^ 8568918873951L);
    return (((long) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Tickbase)(((com.moon.module.impl.Tickbase)(((com.moon.fi)(this)).a())))).a())).getValue())))).intValue()) * __sourceIntrinsic_d3e4e16d7952_originalDynamicSite374_7(5888, (726345178073276951L ^ local1)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26357;
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
            throw new RuntimeException("com/moon/fi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.fi.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> long __sourceIntrinsic_d3e4e16d7952_originalDynamicSite374_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_56a6d861a15d_invokedynamic31_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_56a6d861a15d_invokedynamic31_39(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic170_12(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic170_22(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic170_24(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic170_26(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic170_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0d28a2dd2629_invokedynamic170_45(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1136_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dadb575223bf_invokedynamic30_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dadb575223bf_invokedynamic30_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dadb575223bf_invokedynamic30_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dadb575223bf_invokedynamic30_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1131_0() throws E;
}
