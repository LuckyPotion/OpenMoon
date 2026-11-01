package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hy extends com.moon.hx {

private com.moon.nY f;

private com.moon.nX g;

private com.moon.module.impl.HUD h;

private com.moon.module.impl.Effects i;

private net.minecraft.entity.player.EntityPlayer j;

private net.minecraft.entity.player.EntityPlayer k;

private long l;

private long m;

private boolean n;

private static long o;

private static long[] q;

private static java.lang.Integer[] r;

private static java.util.Map s;

private static long[] t;

private static java.lang.Long[] u;

private static java.util.Map v;

public hy() { super(); }


private static void __sourceConstructorBody_84b11caee404a83e(com.moon.hy receiver) throws Throwable {

long local1 = (com.moon.hy.o ^ 93523505695444L);

    com.moon.hy.__sourceConstructorInit_84b11caee404a83e_0(((com.moon.hy)(receiver)));

    ((com.moon.hy)(receiver)).f = ((com.moon.nY)(new com.moon.nY(__sourceIntrinsic_84b11caee404a83e_originalDynamicSite985_2(22940, (9007819271068200852L ^ local1)), com.moon.cj.EASE_IN_OUT_BACK)));

    ((com.moon.hy)(receiver)).g = ((com.moon.nX)(new com.moon.nX()));

    return;

}



static {
o = ((long)(((moom._a)(moom._c.a(((long)(-1270043128400170426L)), ((long)(5024857307535848005L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(248374407081396L)))));

    s = ((java.util.Map)(new java.util.HashMap(13)));

    long local11_life7 = (com.moon.hy.o ^ 88808446660747L);

    javax.crypto.Cipher local13_life9;

    javax.crypto.Cipher __sourceSpill214_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill214_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill214_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill214_14 = new byte[8];

    (__sourceSpill214_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));

    int local14_life15 = 1;

    while ((local14_life15 < 8)) {

        (__sourceSpill214_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));

        local14_life15 += 1;

    }

    byte[] __sourcePreallocation214_16 = __sourceSpill214_14;

    ((javax.crypto.Cipher)(__sourceSpill214_11)).init(((int)(__sourceSpill214_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill214_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation214_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local19_life19 = new long[9];

    int local16_life20 = 0;

    java.lang.String local17_life21;

    int local18_life23 = ((java.lang.String)((local17_life21 = "r\035\024±c½0¾C|þ.õ¯ÛjÆo\tªÏÊ_¬ \036\030`¯ýbAØT2;¾£\031³ÂDË\037·á¬I+¬å"))).length();

    int local15_life24 = 0;

    do {

        java.lang.String __sourceSpill214_25 = local17_life21;

        int __sourceSpill214_26 = local15_life24;

        local15_life24 += 8;

        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill214_25)).substring(((int)(__sourceSpill214_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill214_30 = local19_life19;

        int __sourceSpill214_31 = local16_life20;

        local16_life20 += 1;

        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));

        byte[] __sourceSpill214_33 = new byte[8];

        (__sourceSpill214_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));

        (__sourceSpill214_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));

        (__sourceSpill214_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));

        (__sourceSpill214_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));

        (__sourceSpill214_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));

        (__sourceSpill214_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));

        (__sourceSpill214_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));

        (__sourceSpill214_33)[7] = ((byte) ((int) local21_life32));

        javax.crypto.Cipher __sourceSpill214_34 = local13_life9;

        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill214_34)).doFinal(((byte[])(__sourceSpill214_33)));

        (__sourceSpill214_30)[__sourceSpill214_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));

    } while ((!(local15_life24 >= local18_life23)));

    local18_life23 = ((java.lang.String)((local17_life21 = "yû\022¢í\021Oy@P7\005¾È"))).length();

    local15_life24 = 0;

    do {

        java.lang.String __sourceSpill214_38 = local17_life21;

        int __sourceSpill214_39 = local15_life24;

        local15_life24 += 8;

        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill214_38)).substring(((int)(__sourceSpill214_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill214_43 = local19_life19;

        int __sourceSpill214_44 = local16_life20;

        local16_life20 += 1;

        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));

        byte[] __sourceSpill214_46 = new byte[8];

        (__sourceSpill214_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));

        (__sourceSpill214_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));

        (__sourceSpill214_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));

        (__sourceSpill214_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));

        (__sourceSpill214_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));

        (__sourceSpill214_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));

        (__sourceSpill214_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));

        (__sourceSpill214_46)[7] = ((byte) ((int) local21_life45));

        javax.crypto.Cipher __sourceSpill214_47 = local13_life9;

        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill214_47)).doFinal(((byte[])(__sourceSpill214_46)));

        (__sourceSpill214_43)[__sourceSpill214_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));

    } while ((!(local15_life24 >= local18_life23)));

    q = ((long[])(local19_life19));

    r = ((java.lang.Integer[])(new java.lang.Integer[9]));

    v = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life54;

    javax.crypto.Cipher __sourceSpill214_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill214_57 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill214_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill214_59 = new byte[8];

    (__sourceSpill214_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));

    int local1_life60 = 1;

    while ((local1_life60 < 8)) {

        (__sourceSpill214_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));

        local1_life60 += 1;

    }

    byte[] __sourcePreallocation214_61 = __sourceSpill214_59;

    ((javax.crypto.Cipher)(__sourceSpill214_56)).init(((int)(__sourceSpill214_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill214_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation214_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local6_life64 = new long[4];

    int local3_life65 = 0;

    java.lang.String local4_life66;

    int local5_life68 = ((java.lang.String)((local4_life66 = "øç\fã#×ãóê8üÎH'(Ú"))).length();

    int local2_life69 = 0;

    do {

        java.lang.String __sourceSpill214_70 = local4_life66;

        int __sourceSpill214_71 = local2_life69;

        local2_life69 += 8;

        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill214_70)).substring(((int)(__sourceSpill214_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill214_75 = local6_life64;

        int __sourceSpill214_76 = local3_life65;

        local3_life65 += 1;

        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));

        byte[] __sourceSpill214_78 = new byte[8];

        (__sourceSpill214_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));

        (__sourceSpill214_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));

        (__sourceSpill214_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));

        (__sourceSpill214_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));

        (__sourceSpill214_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));

        (__sourceSpill214_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));

        (__sourceSpill214_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));

        (__sourceSpill214_78)[7] = ((byte) ((int) local8_life77));

        javax.crypto.Cipher __sourceSpill214_79 = local0_life54;

        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill214_79)).doFinal(((byte[])(__sourceSpill214_78)));

        (__sourceSpill214_75)[__sourceSpill214_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));

    } while ((!(local2_life69 >= local5_life68)));

    local5_life68 = ((java.lang.String)((local4_life66 = "ÑVÒ¦¶#\"Sä\030«§xµ"))).length();

    local2_life69 = 0;

    do {

        java.lang.String __sourceSpill214_83 = local4_life66;

        int __sourceSpill214_84 = local2_life69;

        local2_life69 += 8;

        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill214_83)).substring(((int)(__sourceSpill214_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill214_88 = local6_life64;

        int __sourceSpill214_89 = local3_life65;

        local3_life65 += 1;

        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));

        byte[] __sourceSpill214_91 = new byte[8];

        (__sourceSpill214_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));

        (__sourceSpill214_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));

        (__sourceSpill214_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));

        (__sourceSpill214_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));

        (__sourceSpill214_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));

        (__sourceSpill214_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));

        (__sourceSpill214_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));

        (__sourceSpill214_91)[7] = ((byte) ((int) local8_life90));

        javax.crypto.Cipher __sourceSpill214_92 = local0_life54;

        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill214_92)).doFinal(((byte[])(__sourceSpill214_91)));

        (__sourceSpill214_88)[__sourceSpill214_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));

    } while ((!(local2_life69 >= local5_life68)));

    t = ((long[])(local6_life64));

    u = ((java.lang.Long[])(new java.lang.Long[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_84b11caee404a83e_0(com.moon.hy a0) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1541_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18831);
    if (((com.moon.hy.u)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.hy.t)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.hy.v)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hy.v)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/hy", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.hy.u)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.hy.u)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.hy.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b__Void() {
com.moon.hy forwardValue401_33_0;
    int forwardValue401_51_0;
    com.moon.hy forwardValue401_57_0;
    java.lang.String spill401_0;
    com.moon.hy spill401_1;
    int spill401_2;
    com.moon.hy spill401_3;
    long life1_3;
    java.lang.String life3_7;
    forward_join_62: {
    forward_join_57: {
    forward_join_52: {
    forward_join_51: {
    forward_join_36: {
    forward_join_33: {
    life1_3 = (com.moon.hy.o ^ 90770166370200L);
    spill401_0 = net.minecraft.command.CommandBase.b();
    ((com.moon.hy)(this)).d__sourceReturn_da8c82d5d4();
    life3_7 = spill401_0;
    ((com.moon.nY)(this.f)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.n)));
    spill401_1 = this;
    if (!((life3_7 != null))) {
        forwardValue401_33_0 = spill401_1;
        break forward_join_33;
    }
    if (!((((com.moon.hy)(spill401_1)).a__tn() != this.j))) {
        break forward_join_36;
    }
    this.l = ((long)(__sourceIntrinsic_9bf881b104f5_invokedynamic401_8(20119, (9065518493300112850L ^ life1_3))));
    this.m = ((long)(java.lang.System.currentTimeMillis()));
    forwardValue401_33_0 = this;
    }
    ((com.moon.hy)(forwardValue401_33_0)).j = ((net.minecraft.entity.player.EntityPlayer)(((com.moon.hy)(this)).a__tn()));
    }
    spill401_2 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - this.m))), ((long)(this.l)));
    if (!((life3_7 != null))) {
        forwardValue401_51_0 = spill401_2;
        break forward_join_51;
    }
    if (!((spill401_2 >= 0))) {
        break forward_join_52;
    }
    spill401_3 = this;
    if (!((life3_7 != null))) {
        forwardValue401_57_0 = spill401_3;
        break forward_join_57;
    }
    forwardValue401_51_0 = ((((com.moon.nY)(((com.moon.hy)(spill401_3)).f)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue401_51_0 == 0))) {
        break forward_join_62;
    }
    }
    ((com.moon.gW)(((com.moon.module.impl.Effects)(this.i)).a__gW())).c();
    forwardValue401_57_0 = this;
    }
    ((com.moon.gV)(((com.moon.module.impl.Effects)(((com.moon.hy)(forwardValue401_57_0)).i)).a())).a(((boolean)(true)));
    }
    return;
}


private float e() {
java.lang.Object local1 = ((net.minecraft.entity.player.EntityPlayer)(this.k)).a__String();
    return java.lang.Math.max(((float)((((((float) ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hy.a)).N)).a(((java.lang.String)(local1)))) + 0x1.0p5f) + 0x1.0p3f) + 0x1.6p2f))), ((float)(0x1.b8p6f)));
}


private void d__sourceReturn_da8c82d5d4() {
com.moon.hy forwardValue402_24_0;
    com.moon.hy spill402_0;
    com.moon.hy spill402_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_30: {
    forward_join_24: {
    forward_join_16: {
    life1_3 = (com.moon.hy.o ^ 58218822033579L);
    life3_5 = net.minecraft.command.CommandBase.b();
    spill402_0 = this;
    if (!((life3_5 != null))) {
        forwardValue402_24_0 = spill402_0;
        break forward_join_24;
    }
    if (!((((com.moon.hy)(spill402_0)).h != null))) {
        break forward_join_16;
    }
    spill402_1 = this;
    if (!((life3_5 != null))) {
        forwardValue402_24_0 = spill402_1;
        break forward_join_24;
    }
    if (!((((com.moon.hy)(spill402_1)).i == null))) {
        break forward_join_30;
    }
    }
    this.h = ((com.moon.module.impl.HUD)(((com.moon.module.impl.HUD)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.HUD.class)))))));
    forwardValue402_24_0 = this;
    }
    ((com.moon.hy)(forwardValue402_24_0)).i = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1545_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(boolean p0) {
return;
}


private int a(float p0, double p1, com.moon.module.impl.HUD p2, com.moon.b0 p3, int p4, int p5) {
java.lang.Object forwardValue36_29_0;
    int forwardValue36_189_0;
    java.lang.String spill36_0;
    com.moon.b0 spill36_1;
    int spill36_2;
    int spill36_3;
    int[] spill36_4;
    int[] spill36_5;
    int[] spill36_6;
    int[] spill36_7;
    int[] spill36_8;
    int[] spill36_9;
    int[] spill36_10;
    int[] spill36_11;
    int[] spill36_12;
    int[] spill36_13;
    int[] spill36_14;
    int[] spill36_15;
    int[] spill36_16;
    int[] spill36_17;
    long life8_3;
    int life11_7;
    java.lang.String life10_8;
    int life12_38;
    long life13_40;
    long life15_51;
    int life17_60;
    int[] life18_98;
    int life12_121;
    long life15_128;
    int[] life17_167;
    forward_join_190: {
    forward_join_189: {
    forward_join_188: {
    forward_join_119: {
    forward_join_42: {
    forward_join_34: {
    forward_join_29: {
    life8_3 = (com.moon.hy.o ^ 25424946487009L);
    spill36_0 = net.minecraft.command.CommandBase.b();
    life11_7 = ((com.moon.b0)(p3)).ordinal();
    life10_8 = spill36_0;
    spill36_1 = p3;
    if (!((life10_8 != null))) {
        forwardValue36_29_0 = spill36_1;
        break forward_join_29;
    }
    if (!((spill36_1 == com.moon.b0.SYNC))) {
        break forward_join_34;
    }
    p4 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(p2)).e__kX())).getValue())))).intValue();
    p5 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(p2)).f__kX())).getValue())))).intValue();
    forwardValue36_29_0 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(p2)).f__kY())).getValue();
    }
    life11_7 = (((com.moon.bY)(((com.moon.bY)(forwardValue36_29_0)))).ordinal() + 1);
    }
    life12_38 = -1;
    life13_40 = java.lang.System.currentTimeMillis();
    spill36_2 = life11_7;
    if (!((life10_8 != null))) {
        forwardValue36_189_0 = spill36_2;
        break forward_join_189;
    }
    switch (spill36_2) {
case 3:
{
        break forward_join_42;
    }
case 2:
{
        break forward_join_119;
    }
default:
{
        break forward_join_188;
    }
}
    }
    life15_51 = ((long) (0x1.8p0d * p1));
    spill36_3 = 23340;
    life17_60 = ((java.awt.Color)(((java.awt.Color)(((java.awt.Color)(new java.awt.Color(p4))).darker())).darker())).getRGB();
    int[] __stackOp36_21_0 = new int[__sourceIntrinsic_96a894c32cfa_invokedynamic36_20(spill36_3, (939676699805090463L ^ life8_3))];
    spill36_4 = __stackOp36_21_0;
    (__stackOp36_21_0)[0] = p4;
    int[] __stackOp36_22_0 = spill36_4;
    spill36_5 = __stackOp36_22_0;
    (__stackOp36_22_0)[1] = life17_60;
    int[] __stackOp36_23_0 = spill36_5;
    spill36_6 = __stackOp36_23_0;
    (__stackOp36_23_0)[2] = p4;
    int[] __stackOp36_24_0 = spill36_6;
    spill36_7 = __stackOp36_24_0;
    (__stackOp36_24_0)[3] = life17_60;
    int[] __stackOp36_25_0 = spill36_7;
    spill36_8 = __stackOp36_25_0;
    (__stackOp36_25_0)[4] = p4;
    int[] __stackOp36_26_0 = spill36_8;
    spill36_9 = __stackOp36_26_0;
    (__stackOp36_26_0)[5] = life17_60;
    int[] __stackOp36_27_0 = spill36_9;
    spill36_10 = __stackOp36_27_0;
    (__stackOp36_27_0)[__sourceIntrinsic_96a894c32cfa_invokedynamic36_28(12303, (5659789811131148735L ^ life8_3))] = p4;
    life18_98 = spill36_10;
    life12_121 = com.moon.nD.a(((int[])(life18_98)), ((double)(((double) (((float) ((life13_40 + (((long) ((int) p0)) * __sourceIntrinsic_96a894c32cfa_invokedynamic36_29(6882, (8880382276980111581L ^ life8_3)))) % life15_51)) / (((float) life15_51) / 0x1.0p1f))))));
    if (!((life10_8 == null))) {
        break forward_join_190;
    }
    }
    life15_128 = ((long) (0x1.8p0d * p1));
    int[] __stackOp36_32_0 = new int[__sourceIntrinsic_96a894c32cfa_invokedynamic36_31(9955, (1684016669088087894L ^ life8_3))];
    spill36_11 = __stackOp36_32_0;
    (__stackOp36_32_0)[0] = p4;
    int[] __stackOp36_33_0 = spill36_11;
    spill36_12 = __stackOp36_33_0;
    (__stackOp36_33_0)[1] = p5;
    int[] __stackOp36_34_0 = spill36_12;
    spill36_13 = __stackOp36_34_0;
    (__stackOp36_34_0)[2] = p4;
    int[] __stackOp36_35_0 = spill36_13;
    spill36_14 = __stackOp36_35_0;
    (__stackOp36_35_0)[3] = p5;
    int[] __stackOp36_36_0 = spill36_14;
    spill36_15 = __stackOp36_36_0;
    (__stackOp36_36_0)[4] = p4;
    int[] __stackOp36_37_0 = spill36_15;
    spill36_16 = __stackOp36_37_0;
    (__stackOp36_37_0)[5] = p5;
    int[] __stackOp36_38_0 = spill36_16;
    spill36_17 = __stackOp36_38_0;
    (__stackOp36_38_0)[__sourceIntrinsic_96a894c32cfa_invokedynamic36_39(18710, (4510252148220301481L ^ life8_3))] = p4;
    life17_167 = spill36_17;
    life12_121 = com.moon.nD.a(((int[])(life17_167)), ((double)(((double) (((float) ((life13_40 + (((long) ((int) p0)) * __sourceIntrinsic_96a894c32cfa_invokedynamic36_40(23931, (7757786679321739077L ^ life8_3)))) % life15_128)) / (((float) life15_128) / 0x1.0p1f))))));
    if (!((life10_8 == null))) {
        break forward_join_190;
    }
    }
    forwardValue36_189_0 = p4;
    }
    return forwardValue36_189_0;
    }
    return life12_121;
}


public void a__Void() {
com.moon.hy lexicalValue84_30_0;
    net.minecraft.entity.player.EntityPlayer lexicalValue84_327_0;
    java.lang.String spill84_0;
    net.minecraft.entity.player.EntityPlayer spill84_1;
    com.moon.hy spill84_2;
    int spill84_3;
    long life1_3;
    net.minecraft.entity.player.EntityPlayer life4_8;
    int life5_12;
    java.lang.String life3_13;
    com.moon.hW life6_49;
    int life7_54;
    float life8_56;
    float life9_140;
    float life10_145;
    float life11_157;
    float life12_162;
    float life13_197;
    float life14_203;
    float life15_205;
    int life16_207;
    float life17_219;
    net.minecraft.item.ItemStack life18_226;
    java.lang.String life16_274;
    lexical_join_345: {
    lexical_join_342: {
    lexical_join_339: {
    lexical_join_327: {
    lexical_join_324: {
    lexical_join_321: {
    lexical_join_246: {
    lexical_join_30: {
    life1_3 = (com.moon.hy.o ^ 2370111383098L);
    ((com.moon.hy)(this)).d__sourceReturn_da8c82d5d4();
    life4_8 = ((com.moon.hy)(this)).a__tn();
    spill84_0 = net.minecraft.command.CommandBase.b();
    life5_12 = ((com.moon.hy)(this)).a__sourceReturn_8abf5c6871();
    life3_13 = spill84_0;
    spill84_1 = this.k;
    if (!((life3_13 != null))) {
        lexicalValue84_327_0 = spill84_1;
        break lexical_join_327;
    }
    if (!((spill84_1 != null))) {
        break lexical_join_321;
    }
    spill84_2 = this;
    if (!((life3_13 != null))) {
        lexicalValue84_30_0 = spill84_2;
        break lexical_join_30;
    }
    if (!(((com.moon.hy)(spill84_2)).n)) {
        break lexical_join_321;
    }
    moom.kZ.i();
    moom.kZ.l();
    this.d = ((float)(0x1.f4p6f));
    lexicalValue84_30_0 = this;
    }
    ((com.moon.hy)(lexicalValue84_30_0)).e = ((float)(0x1.9p5f));
    spill84_3 = 30731;
    life6_49 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.RECTANGLE))))).a();
    life7_54 = __sourceIntrinsic_b82a5b29b709_invokedynamic84_15(spill84_3, (8297020619084257633L ^ life1_3));
    life8_56 = 0x1.0p0f;
    ((com.moon.hW)(life6_49)).a(((com.moon.iX)(com.moon.i2.a(((float)((((com.moon.hy)(this)).a() - life8_56))), ((float)((((com.moon.hy)(this)).b() - life8_56))), ((float)((this.d + (life8_56 * 0x1.0p1f)))), ((float)(life8_56)), ((int)(life7_54))))));
    ((com.moon.hW)(life6_49)).a(((com.moon.iX)(com.moon.i2.a(((float)((((com.moon.hy)(this)).a() - life8_56))), ((float)((((com.moon.hy)(this)).b() + this.e))), ((float)((this.d + (life8_56 * 0x1.0p1f)))), ((float)(life8_56)), ((int)(life7_54))))));
    ((com.moon.hW)(life6_49)).a(((com.moon.iX)(com.moon.i2.a(((float)((((com.moon.hy)(this)).a() - life8_56))), ((float)(((com.moon.hy)(this)).b())), ((float)(life8_56)), ((float)(this.e)), ((int)(life7_54))))));
    ((com.moon.hW)(life6_49)).a(((com.moon.iX)(com.moon.i2.a(((float)((((com.moon.hy)(this)).a() + this.d))), ((float)(((com.moon.hy)(this)).b())), ((float)(life8_56)), ((float)(this.e)), ((int)(life7_54))))));
    ((com.moon.hW)(life6_49)).a(((com.moon.iX)(com.moon.i2.a(((float)(((com.moon.hy)(this)).a())), ((float)(((com.moon.hy)(this)).b())), ((float)(this.d)), ((float)(this.e)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic84_42(10417, (1477169019240679896L ^ life1_3))))))));
    life9_140 = 0x1.6p3f;
    life10_145 = (this.d - 0x1.1p5f);
    life11_157 = (java.lang.Math.min(((float)(((net.minecraft.entity.player.EntityPlayer)(this.k)).b__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.player.EntityPlayer)(this.k)).a()))) / ((net.minecraft.entity.player.EntityPlayer)(this.k)).a());
    life12_162 = (((com.moon.hy)(this)).b() + 0x1.1p4f);
    ((com.moon.hW)(life6_49)).a(((com.moon.iX)(com.moon.i2.a(((float)((((com.moon.hy)(this)).a() + 0x1.ep4f))), ((float)(life12_162)), ((float)(life10_145)), ((float)(life9_140)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic84_55(20362, (1124203044067143399L ^ life1_3))))))));
    ((com.moon.hW)(life6_49)).a(((com.moon.iX)(com.moon.i2.a(((float)((((com.moon.hy)(this)).a() + 0x1.ep4f))), ((float)(life12_162)), ((float)((life10_145 * life11_157))), ((float)(life9_140)), ((int)(life5_12))))));
    ((com.moon.hW)(life6_49)).b();
    life13_197 = (((com.moon.hy)(this)).a() + 0x1.bp4f);
    life14_203 = ((life12_162 + life9_140) + 0x1.8p0f);
    life15_205 = 0x1.cp3f;
    life16_207 = 0;
    lexical_cycle_196: while (true) {
    lexical_join_244: {
    lexical_join_243: {
    if (!((life16_207 < 4))) {
        break lexical_join_246;
    }
    life17_219 = (life13_197 + ((life15_205 + 0x1.8p1f) * ((float) life16_207)));
    life18_226 = ((net.minecraft.entity.player.EntityPlayer)(this.k)).a__xW(((int)((4 - life16_207))));
    if (!((life3_13 != null))) {
        break lexical_join_324;
    }
    if (!((life3_13 != null))) {
        break lexical_join_244;
    }
    if (!((life18_226 != null))) {
        break lexical_join_243;
    }
    moom.kZ.j();
    moom.lt.b();
    ((net.minecraft.client.renderer.entity.RenderItem)(((net.minecraft.client.Minecraft)(com.moon.hy.a)).a__nv())).a(((net.minecraft.item.ItemStack)(life18_226)), ((float)(life17_219)), ((float)((life14_203 + 0x1.0p0f))));
    ((net.minecraft.client.renderer.entity.RenderItem)(((net.minecraft.client.Minecraft)(com.moon.hy.a)).a__nv())).a(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hy.a)).N)), ((net.minecraft.item.ItemStack)(life18_226)), ((float)(life17_219)), ((float)((life14_203 + 0x1.0p0f))));
    moom.lt.a();
    moom.kZ.i();
    }
    life16_207 += 1;
    }
    if (!((life3_13 == null))) { continue lexical_cycle_196; }
    break lexical_cycle_196;
    }
    }
    life16_274 = __sourceIntrinsic_b82a5b29b709_invokedynamic84_80(com.moon.nI.a(((double)(((double) ((net.minecraft.entity.player.EntityPlayer)(this.k)).b__sourceReturn_bc607678b6()))), ((int)(1))));
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hy.a)).N)).a(((java.lang.String)(life16_274)), ((float)((((((com.moon.hy)(this)).a() + 0x1.ep4f) + (life10_145 / 0x1.0p1f)) - (((float) ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hy.a)).N)).a(((java.lang.String)(life16_274)))) / 0x1.0p1f)))), ((float)((life12_162 + 0x1.8p0f))), ((int)(life5_12)));
    ((com.moon.hy)(this)).a(((float)((((com.moon.hy)(this)).a() + 0x1.cp3f))), ((float)((((com.moon.hy)(this)).b() + 0x1.6cp5f))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic84_90(12583, (6750626316233969739L ^ life1_3)))), ((float)(moom.Dr.a(((float)(((net.minecraft.entity.player.EntityPlayer)(this.k)).a4)), ((float)(-0x1.18p5f)), ((float)(0x1.18p5f))))), ((float)(((net.minecraft.entity.player.EntityPlayer)(this.k)).x)), ((net.minecraft.entity.EntityLivingBase)(this.k)));
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hy.a)).N)).a(((java.lang.String)(((net.minecraft.entity.player.EntityPlayer)(this.k)).a__String())), ((float)((((com.moon.hy)(this)).a() + 0x1.ep4f))), ((float)((((com.moon.hy)(this)).b() + 0x1.8p2f))), ((int)(-1)));
    }
    com.moon.hU.b__Void();
    com.moon.hU.a__Void();
    com.moon.hU.d__Void();
    }
    if (!((life3_13 != null))) {
        break lexical_join_342;
    }
    lexicalValue84_327_0 = life4_8;
    }
    if (!((lexicalValue84_327_0 != null))) {
        break lexical_join_339;
    }
    this.j = ((net.minecraft.entity.player.EntityPlayer)(life4_8));
    this.k = ((net.minecraft.entity.player.EntityPlayer)(life4_8));
    this.n = ((boolean)(true));
    if (!((life3_13 == null))) {
        break lexical_join_345;
    }
    }
    this.j = ((net.minecraft.entity.player.EntityPlayer)(null));
    }
    this.n = ((boolean)(false));
    }
    return;
}


private int a(float p0, com.moon.module.impl.HUD p1, com.moon.b0 p2, int p3, int p4) {
return ((com.moon.hy)(this)).a(((float)(p0)), ((double)(0x1.194p12d)), ((com.moon.module.impl.HUD)(p1)), ((com.moon.b0)(p2)), ((int)(p3)), ((int)(p4)));
}


private int a__sourceReturn_8abf5c6871() {
long local1 = (com.moon.hy.o ^ 70471954107765L);
    ((com.moon.hy)(this)).d__sourceReturn_da8c82d5d4();
    return ((this.k != null) ? (java.awt.Color.HSBtoRGB(((float)((java.lang.Math.max(((float)(0x0.0p0f)), ((float)((java.lang.Math.min(((float)(((net.minecraft.entity.player.EntityPlayer)(this.k)).b__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.player.EntityPlayer)(this.k)).a()))) / ((net.minecraft.entity.player.EntityPlayer)(this.k)).a())))) / 0x1.8p1f))), ((float)(0x1.0p0f)), ((float)(0x1.ccccccp-1f))) | __sourceIntrinsic_8aebf151eadb_invokedynamic1548_12(16311, (3635197055069828503L ^ local1))) : -1);
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29188;
      if (r[var3] == null) {
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
         long var5 = q[var3];
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
         Object[] var9 = (Object[])s.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               s.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/hy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         r[var3] = var15;
      }

      return r[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.hy.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> long __sourceIntrinsic_84b11caee404a83e_originalDynamicSite985_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_invokedynamic1548_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96a894c32cfa_invokedynamic36_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96a894c32cfa_invokedynamic36_28(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_96a894c32cfa_invokedynamic36_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96a894c32cfa_invokedynamic36_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96a894c32cfa_invokedynamic36_39(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_96a894c32cfa_invokedynamic36_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1545_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic84_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic84_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic84_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic84_80(double a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic84_90(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1541_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_9bf881b104f5_invokedynamic401_8(int a0, long a1) throws E;
}
