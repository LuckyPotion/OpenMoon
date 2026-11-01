package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FB implements moom.Fn {

private net.minecraft.world.World a;

private boolean b;

private java.util.Random c;

private double[] d;

private double[] e;

private double[] f;

private double[] g;

private moom.FV h;

private moom.FV i;

private moom.FV j;

private moom.FV k;

private moom.FV l;

public moom.FV m;

public moom.FV n;

private moom.Gk o;

private moom.Gm p;

private moom.Gn q;

private moom.FY r;

private moom.Go s;

private moom.Go t;

private moom.FZ u;

private moom.FZ v;

private moom.FO w;

private moom.FI x;

double[] y;

double[] z;

double[] A;

double[] B;

double[] C;

private static long D;

private static long[] E;

private static java.lang.Integer[] F;

private static java.util.Map G;

private static long[] H;

private static java.lang.Long[] I;

private static java.util.Map J;

public FB(net.minecraft.world.World p0, boolean p1, long p2) { super(); }


private static void __sourceConstructorBody_eba85a4c36d0e982(moom.FB receiver, net.minecraft.world.World p0, boolean p1, long p2) throws Throwable {

long local5 = (moom.FB.D ^ 196829244514L);

    moom.FB.__sourceConstructorInit_eba85a4c36d0e982_0(((moom.FB)(receiver)));

    ((moom.FB)(receiver)).d = ((double[])(new double[__sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_2(1130, (1303317476551742045L ^ local5))]));

    ((moom.FB)(receiver)).e = ((double[])(new double[__sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_4(121, (8745683318728939094L ^ local5))]));

    ((moom.FB)(receiver)).f = ((double[])(new double[__sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_6(121, (8745683318728939094L ^ local5))]));

    ((moom.FB)(receiver)).o = ((moom.Gk)(new moom.Gk()));

    ((moom.FB)(receiver)).p = ((moom.Gm)(new moom.Gm()));

    ((moom.FB)(receiver)).q = ((moom.Gn)(new moom.Gn()));

    ((moom.FB)(receiver)).r = ((moom.FY)(new moom.Gu(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b3)).a__fE(), __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_13(18339, (8565850828807868800L ^ local5)), moom.fF.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aV))))));

    ((moom.FB)(receiver)).s = ((moom.Go)(new moom.Go(net.minecraft.init.Blocks.k, true)));

    ((moom.FB)(receiver)).t = ((moom.Go)(new moom.Go(net.minecraft.init.Blocks.k, false)));

    ((moom.FB)(receiver)).u = ((moom.FZ)(new moom.FZ(net.minecraft.init.Blocks.P)));

    ((moom.FB)(receiver)).v = ((moom.FZ)(new moom.FZ(net.minecraft.init.Blocks.Q)));

    ((moom.FB)(receiver)).w = ((moom.FO)(new moom.FO()));

    ((moom.FB)(receiver)).x = ((moom.FI)(new moom.FK()));

    ((moom.FB)(receiver)).a = ((net.minecraft.world.World)(p0));

    ((moom.FB)(receiver)).b = ((boolean)(p1));

    ((moom.FB)(receiver)).c = ((java.util.Random)(new java.util.Random(p2)));

    ((moom.FB)(receiver)).h = ((moom.FV)(new moom.FV(((moom.FB)(receiver)).c, __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_31(21263, (5062841951625512250L ^ local5)))));

    ((moom.FB)(receiver)).i = ((moom.FV)(new moom.FV(((moom.FB)(receiver)).c, __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_34(21263, (5062841951625512250L ^ local5)))));

    ((moom.FB)(receiver)).j = ((moom.FV)(new moom.FV(((moom.FB)(receiver)).c, __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_37(14789, (766991336734683112L ^ local5)))));

    ((moom.FB)(receiver)).k = ((moom.FV)(new moom.FV(((moom.FB)(receiver)).c, 4)));

    ((moom.FB)(receiver)).l = ((moom.FV)(new moom.FV(((moom.FB)(receiver)).c, 4)));

    ((moom.FB)(receiver)).m = ((moom.FV)(new moom.FV(((moom.FB)(receiver)).c, __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_44(30460, (3313976199635443927L ^ local5)))));

    ((moom.FB)(receiver)).n = ((moom.FV)(new moom.FV(((moom.FB)(receiver)).c, __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_47(21263, (5062841951625512250L ^ local5)))));

    ((net.minecraft.world.World)(p0)).a__Void(((int)(__sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_49(4004, (2352787510841891206L ^ local5)))));

    return;

}



static {
D = ((long)(((moom._a)(moom._c.a(((long)(-6661446788845281203L)), ((long)(5695902101803984280L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(201805968076399L)))));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.FB.D ^ 119423603340376L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill531_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill531_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill531_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill531_14 = new byte[8];
    (__sourceSpill531_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill531_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation531_16 = __sourceSpill531_14;
    ((javax.crypto.Cipher)(__sourceSpill531_11)).init(((int)(__sourceSpill531_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill531_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation531_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[20];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "üy8ËâÎ`w´NOX¡Nü³4HÕ\026Ã\025¶»(J\033\023Ùb\035Ð<§!=Ã\020,m\\\"<{üN°þièßäCäzöoUh¦wÑ\0047Ñuæ\032 \bôÞ÷Å3Äû\031ò=(±\004!\023õ³\fÎ¡\177\fIÏ¿¥«Ð \003k(\032Ý\034e-ÿ*Ô½\033§nò\031æ'47Äí\035Kþ"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill531_25 = local17_life21;
        int __sourceSpill531_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill531_25)).substring(((int)(__sourceSpill531_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill531_30 = local19_life19;
        int __sourceSpill531_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill531_33 = new byte[8];
        (__sourceSpill531_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill531_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill531_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill531_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill531_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill531_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill531_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill531_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill531_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill531_34)).doFinal(((byte[])(__sourceSpill531_33)));
        (__sourceSpill531_30)[__sourceSpill531_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "0\004µõÇM\003àÇ\t7HIK"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill531_38 = local17_life21;
        int __sourceSpill531_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill531_38)).substring(((int)(__sourceSpill531_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill531_43 = local19_life19;
        int __sourceSpill531_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill531_46 = new byte[8];
        (__sourceSpill531_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill531_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill531_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill531_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill531_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill531_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill531_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill531_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill531_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill531_47)).doFinal(((byte[])(__sourceSpill531_46)));
        (__sourceSpill531_43)[__sourceSpill531_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    E = ((long[])(local19_life19));
    F = ((java.lang.Integer[])(new java.lang.Integer[20]));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill531_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill531_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill531_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill531_59 = new byte[8];
    (__sourceSpill531_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill531_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation531_61 = __sourceSpill531_59;
    ((javax.crypto.Cipher)(__sourceSpill531_56)).init(((int)(__sourceSpill531_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill531_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation531_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "ËÏÆ8Å7óVÈ\033Ù6\022\003a"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill531_70 = local4_life66;
        int __sourceSpill531_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill531_70)).substring(((int)(__sourceSpill531_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill531_75 = local6_life64;
        int __sourceSpill531_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill531_78 = new byte[8];
        (__sourceSpill531_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill531_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill531_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill531_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill531_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill531_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill531_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill531_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill531_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill531_79)).doFinal(((byte[])(__sourceSpill531_78)));
        (__sourceSpill531_75)[__sourceSpill531_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    H = ((long[])(local6_life64));
    I = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_eba85a4c36d0e982_0(moom.FB a0) throws E;

public boolean b__Boolean() {
return ((1) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4466_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.FB.b(((int)(local4)), ((long)(local5)));
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3512);
    if (((moom.FB.I)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.FB.H)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.FB.J)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.FB.J)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/FB", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.FB.I)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.FB.I)[life3_8])).longValue();
}


public void b(int p0, int p1, moom.Fm p2) {
int forestValue617_135_0;
    int forestValue617_149_0;
    int forestValue617_149_1;
    int forestValue617_176_0;
    int forestValue617_178_0;
    int forestValue617_203_0;
    int forestValue617_205_0;
    int forestValue617_267_0;
    int forestValue617_267_1;
    net.minecraft.block.Block forestValue617_281_0;
    net.minecraft.block.Block forestValue617_288_0;
    int forestValue617_306_0;
    int forestValue617_336_0;
    int forestValue617_346_0;
    int forestValue617_347_0;
    int forestValue617_347_1;
    net.minecraft.block.state.IBlockState forestValue617_363_0;
    int forestValue617_372_0;
    int forestValue617_372_1;
    int forestValue617_390_0;
    java.lang.String[] spill617_0;
    int spill617_1;
    int spill617_2;
    int spill617_3;
    long spill617_4;
    int spill617_5;
    int spill617_6;
    net.minecraft.block.Block spill617_7;
    int spill617_8;
    int spill617_9;
    int spill617_10;
    int spill617_11;
    int spill617_12;
    int spill617_13;
    net.minecraft.block.state.IBlockState spill617_14;
    net.minecraft.block.state.IBlockState spill617_15;
    long life4_3;
    int life7_9;
    double life8_11;
    java.lang.String[] life6_89;
    int life10_133;
    int life11_142;
    int life12_179;
    int life13_207;
    int life14_231;
    int life15_234;
    net.minecraft.block.state.IBlockState life16_240;
    net.minecraft.block.state.IBlockState life17_243;
    int life18_245;
    net.minecraft.block.state.IBlockState life19_277;
    forest_join_420: {
    life4_3 = (moom.FB.D ^ 31027285471744L);
    life7_9 = (((net.minecraft.world.World)(this.a)).c() + 1);
    life8_11 = 0x1.0p-5d;
    spill617_0 = moom.FI.b();
    this.d = ((double[])(((moom.FV)(this.k)).a(((double[])(this.d)), ((int)((p0 * __sourceIntrinsic_7c74804d1c65_invokedynamic617_6(21263, (5062837610631551832L ^ life4_3))))), ((int)((p1 * __sourceIntrinsic_7c74804d1c65_invokedynamic617_7(21263, (5062837610631551832L ^ life4_3))))), ((int)(0)), ((int)(__sourceIntrinsic_7c74804d1c65_invokedynamic617_8(21263, (5062837610631551832L ^ life4_3)))), ((int)(__sourceIntrinsic_7c74804d1c65_invokedynamic617_9(21263, (5062837610631551832L ^ life4_3)))), ((int)(1)), ((double)(life8_11)), ((double)(life8_11)), ((double)(0x1.0p0d)))));
    this.e = ((double[])(((moom.FV)(this.k)).a(((double[])(this.e)), ((int)((p0 * __sourceIntrinsic_7c74804d1c65_invokedynamic617_14(21263, (5062837610631551832L ^ life4_3))))), ((int)(__sourceIntrinsic_7c74804d1c65_invokedynamic617_15(25861, (5125416268854914383L ^ life4_3)))), ((int)((p1 * __sourceIntrinsic_7c74804d1c65_invokedynamic617_16(21263, (5062837610631551832L ^ life4_3))))), ((int)(__sourceIntrinsic_7c74804d1c65_invokedynamic617_17(21263, (5062837610631551832L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_7c74804d1c65_invokedynamic617_18(21263, (5062837610631551832L ^ life4_3)))), ((double)(life8_11)), ((double)(0x1.0p0d)), ((double)(life8_11)))));
    life6_89 = spill617_0;
    this.f = ((double[])(((moom.FV)(this.l)).a(((double[])(this.f)), ((int)((p0 * __sourceIntrinsic_7c74804d1c65_invokedynamic617_23(21263, (5062837610631551832L ^ life4_3))))), ((int)((p1 * __sourceIntrinsic_7c74804d1c65_invokedynamic617_24(21263, (5062837610631551832L ^ life4_3))))), ((int)(0)), ((int)(__sourceIntrinsic_7c74804d1c65_invokedynamic617_25(21263, (5062837610631551832L ^ life4_3)))), ((int)(__sourceIntrinsic_7c74804d1c65_invokedynamic617_26(21263, (5062837610631551832L ^ life4_3)))), ((int)(1)), ((double)((life8_11 * 0x1.0p1d))), ((double)((life8_11 * 0x1.0p1d))), ((double)((life8_11 * 0x1.0p1d))))));
    life10_133 = 0;
    forest_cycle_134: while (true) {
    forest_join_417: {
    forestValue617_135_0 = life10_133;
    forest_cycle_135: while (true) {
    if (!((forestValue617_135_0 < __sourceIntrinsic_7c74804d1c65_invokedynamic617_29(21263, (5062837610631551832L ^ life4_3))))) {
        break forest_join_420;
    }
    life11_142 = 0;
    forest_cycle_143: while (true) {
    forest_join_414: {
    forestValue617_149_0 = life11_142;
    forestValue617_149_1 = __sourceIntrinsic_7c74804d1c65_invokedynamic617_30(21263, (5062837610631551832L ^ life4_3));
    forest_cycle_149: while (true) {
    forest_join_205: {
    forest_join_204: {
    forest_join_203: {
    forest_join_178: {
    forest_join_177: {
    forest_join_176: {
    if (!((forestValue617_149_0 < forestValue617_149_1))) {
        break forest_join_417;
    }
    spill617_1 = recovery.source.CarrierOps.dcmpl(((double)(((this.d)[(life10_133 + (life11_142 * __sourceIntrinsic_7c74804d1c65_invokedynamic617_32(21263, (5062837610631551832L ^ life4_3))))] + (((java.util.Random)(this.c)).nextDouble() * 0x1.999999999999ap-3d)))), ((double)(0x0.0p0d)));
    if (!((life6_89 != null))) {
        forestValue617_135_0 = spill617_1;
        continue forest_cycle_135;
    }
    if (!((life6_89 != null))) {
        forestValue617_176_0 = spill617_1;
        break forest_join_176;
    }
    if (!((spill617_1 > 0))) {
        break forest_join_177;
    }
    forestValue617_176_0 = 1;
    }
    forestValue617_178_0 = forestValue617_176_0;
    break forest_join_178;
    }
    forestValue617_178_0 = 0;
    }
    life12_179 = forestValue617_178_0;
    spill617_2 = recovery.source.CarrierOps.dcmpl(((double)(((this.e)[(life10_133 + (life11_142 * __sourceIntrinsic_7c74804d1c65_invokedynamic617_37(21263, (5062837610631551832L ^ life4_3))))] + (((java.util.Random)(this.c)).nextDouble() * 0x1.999999999999ap-3d)))), ((double)(0x0.0p0d)));
    if (!((life6_89 != null))) {
        forestValue617_203_0 = spill617_2;
        break forest_join_203;
    }
    if (!((spill617_2 > 0))) {
        break forest_join_204;
    }
    forestValue617_203_0 = 1;
    }
    forestValue617_205_0 = forestValue617_203_0;
    break forest_join_205;
    }
    forestValue617_205_0 = 0;
    }
    life13_207 = forestValue617_205_0;
    life14_231 = ((int) ((((this.f)[(life10_133 + (life11_142 * __sourceIntrinsic_7c74804d1c65_invokedynamic617_42(21263, (5062837610631551832L ^ life4_3))))] / 0x1.8p1d) + 0x1.8p1d) + (((java.util.Random)(this.c)).nextDouble() * 0x1.0p-2d)));
    spill617_3 = 14883;
    life15_234 = -1;
    spill617_4 = (6503771349606478443L ^ life4_3);
    life16_240 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aV)).a__fE();
    life17_243 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aV)).a__fE();
    life18_245 = __sourceIntrinsic_7c74804d1c65_invokedynamic617_49(spill617_3, spill617_4);
    forest_cycle_244: while (true) {
    forest_join_411: {
    forest_join_404: {
    forest_join_402: {
    forest_join_400: {
    forest_join_390: {
    forest_join_389: {
    forest_join_387: {
    forest_join_381: {
    forest_join_372: {
    forest_join_364: {
    forest_join_363: {
    forest_join_361: {
    forest_join_347: {
    forest_join_346: {
    forest_join_345: {
    forest_join_336: {
    forest_join_335: {
    forest_join_306: {
    forest_join_305: {
    forest_join_288: {
    forest_join_281: {
    forest_join_267: {
    if (!((life18_245 >= 0))) {
        break forest_join_414;
    }
    spill617_5 = life18_245;
    spill617_6 = (__sourceIntrinsic_7c74804d1c65_invokedynamic617_50(11819, (3860477767452141181L ^ life4_3)) - ((java.util.Random)(this.c)).nextInt(((int)(5))));
    if (!((life6_89 != null))) {
        forestValue617_149_0 = spill617_5;
        forestValue617_149_1 = spill617_6;
        continue forest_cycle_149;
    }
    if (!((life6_89 != null))) {
        forestValue617_267_0 = spill617_5;
        forestValue617_267_1 = spill617_6;
        break forest_join_267;
    }
    if (!((spill617_5 < spill617_6))) {
        break forest_join_404;
    }
    forestValue617_267_0 = life18_245;
    forestValue617_267_1 = ((java.util.Random)(this.c)).nextInt(((int)(5)));
    }
    if (!((forestValue617_267_0 > forestValue617_267_1))) {
        break forest_join_404;
    }
    life19_277 = ((moom.Fm)(p2)).a(((int)(life11_142)), ((int)(life18_245)), ((int)(life10_133)));
    spill617_7 = ((net.minecraft.block.state.IBlockState)(life19_277)).a__ch();
    if (!((life6_89 != null))) {
        forestValue617_281_0 = spill617_7;
        break forest_join_281;
    }
    if (!((spill617_7 != null))) {
        break forest_join_400;
    }
    forestValue617_281_0 = ((net.minecraft.block.state.IBlockState)(life19_277)).a__ch();
    }
    if (!((life6_89 != null))) {
        forestValue617_288_0 = forestValue617_281_0;
        break forest_join_288;
    }
    if (!((((net.minecraft.block.Block)(forestValue617_281_0)).a__fn() != moom.fn.a))) {
        break forest_join_400;
    }
    forestValue617_288_0 = ((net.minecraft.block.state.IBlockState)(life19_277)).a__ch();
    }
    if (!((forestValue617_288_0 == net.minecraft.init.Blocks.aV))) {
        break forest_join_402;
    }
    spill617_8 = life15_234;
    if (!((life6_89 != null))) {
        forestValue617_390_0 = spill617_8;
        break forest_join_390;
    }
    if (!((spill617_8 == -1))) {
        break forest_join_389;
    }
    spill617_9 = life14_231;
    if (!((life6_89 != null))) {
        forestValue617_306_0 = spill617_9;
        break forest_join_306;
    }
    if (!((spill617_9 <= 0))) {
        break forest_join_305;
    }
    life16_240 = null;
    life17_243 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aV)).a__fE();
    break forest_join_345;
    }
    forestValue617_306_0 = life18_245;
    }
    spill617_10 = (life7_9 - 4);
    if (!((life6_89 != null))) {
        forestValue617_347_0 = forestValue617_306_0;
        forestValue617_347_1 = spill617_10;
        break forest_join_347;
    }
    if (!((forestValue617_306_0 >= spill617_10))) {
        break forest_join_345;
    }
    spill617_11 = life18_245;
    spill617_12 = (life7_9 + 1);
    if (!((life6_89 != null))) {
        forestValue617_347_0 = spill617_11;
        forestValue617_347_1 = spill617_12;
        break forest_join_347;
    }
    if (!((spill617_11 <= spill617_12))) {
        break forest_join_345;
    }
    life16_240 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aV)).a__fE();
    life17_243 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aV)).a__fE();
    spill617_13 = life13_207;
    if (!((life6_89 != null))) {
        forestValue617_336_0 = spill617_13;
        break forest_join_336;
    }
    if (!((spill617_13 != 0))) {
        break forest_join_335;
    }
    life16_240 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.n)).a__fE();
    life17_243 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aV)).a__fE();
    }
    forestValue617_336_0 = life12_179;
    }
    if (!((life6_89 != null))) {
        forestValue617_346_0 = forestValue617_336_0;
        break forest_join_346;
    }
    if (!((forestValue617_336_0 != 0))) {
        break forest_join_345;
    }
    life16_240 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aW)).a__fE();
    life17_243 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aW)).a__fE();
    }
    forestValue617_346_0 = life18_245;
    }
    forestValue617_347_0 = forestValue617_346_0;
    forestValue617_347_1 = life7_9;
    }
    if (!((life6_89 != null))) {
        forestValue617_372_0 = forestValue617_347_0;
        forestValue617_372_1 = forestValue617_347_1;
        break forest_join_372;
    }
    if (!((forestValue617_347_0 < forestValue617_347_1))) {
        break forest_join_364;
    }
    spill617_14 = life16_240;
    if (!((life6_89 != null))) {
        forestValue617_363_0 = spill617_14;
        break forest_join_363;
    }
    if (!((spill617_14 != null))) {
        break forest_join_361;
    }
    spill617_15 = life16_240;
    if (!((life6_89 != null))) {
        forestValue617_363_0 = spill617_15;
        break forest_join_363;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(spill617_15)).a__ch())).a__fn() == moom.fn.a))) {
        break forest_join_364;
    }
    }
    forestValue617_363_0 = ((moom.dN)(net.minecraft.init.Blocks.l)).a__fE();
    }
    life16_240 = forestValue617_363_0;
    }
    life15_234 = life14_231;
    if (!((life6_89 != null))) {
        break forest_join_387;
    }
    forestValue617_372_0 = life18_245;
    forestValue617_372_1 = (life7_9 - 1);
    }
    if (!((forestValue617_372_0 >= forestValue617_372_1))) {
        break forest_join_381;
    }
    ((moom.Fm)(p2)).a(((int)(life11_142)), ((int)(life18_245)), ((int)(life10_133)), ((net.minecraft.block.state.IBlockState)(life16_240)));
    if (!((life6_89 == null))) {
        break forest_join_402;
    }
    }
    ((moom.Fm)(p2)).a(((int)(life11_142)), ((int)(life18_245)), ((int)(life10_133)), ((net.minecraft.block.state.IBlockState)(life17_243)));
    }
    if (!((life6_89 == null))) {
        break forest_join_402;
    }
    }
    forestValue617_390_0 = life15_234;
    }
    if (!((forestValue617_390_0 > 0))) {
        break forest_join_402;
    }
    life15_234 += -1;
    ((moom.Fm)(p2)).a(((int)(life11_142)), ((int)(life18_245)), ((int)(life10_133)), ((net.minecraft.block.state.IBlockState)(life17_243)));
    if (!((life6_89 == null))) {
        break forest_join_402;
    }
    }
    life15_234 = -1;
    }
    if (!((life6_89 == null))) {
        break forest_join_411;
    }
    }
    ((moom.Fm)(p2)).a(((int)(life11_142)), ((int)(life18_245)), ((int)(life10_133)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.h)).a__fE())));
    }
    life18_245 += -1;
    if (!((life6_89 == null))) {
        continue forest_cycle_244;
    }
    break forest_cycle_244;
    }
    break forest_cycle_149;
    }
    }
    life11_142 += 1;
    if (!((life6_89 == null))) {
        continue forest_cycle_143;
    }
    break forest_cycle_143;
    }
    break forest_cycle_135;
    }
    }
    life10_133 += 1;
    if (!((life6_89 == null))) {
        continue forest_cycle_134;
    }
    break forest_cycle_134;
    }
    }
    return;
}


public net.minecraft.world.chunk.Chunk a(int p0, int p1) {
moom.FB lexicalValue633_55_0;
    java.lang.String[] spill633_0;
    moom.FB spill633_1;
    long life3_3;
    moom.Fm life6_27;
    java.lang.String[] life5_39;
    net.minecraft.world.chunk.Chunk life7_77;
    net.minecraft.world.biome.BiomeGenBase[] life8_107;
    byte[] life9_110;
    int life10_112;
    lexical_join_126: {
    lexical_join_124: {
    lexical_join_63: {
    lexical_join_55: {
    life3_3 = (moom.FB.D ^ 110084648633160L);
    ((java.util.Random)(this.c)).setSeed(((long)(((((long) p0) * __sourceIntrinsic_a55be857de7c_invokedynamic633_2(32646, (8726975303898861439L ^ life3_3))) + (((long) p1) * __sourceIntrinsic_a55be857de7c_invokedynamic633_3(8273, (3880277495150661801L ^ life3_3)))))));
    life6_27 = new moom.Fm();
    ((moom.FB)(this)).a(((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_27)));
    spill633_0 = moom.FI.b();
    ((moom.FB)(this)).b(((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_27)));
    life5_39 = spill633_0;
    ((moom.FI)(this.x)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.a)), ((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_27)));
    spill633_1 = this;
    if (!((life5_39 != null))) {
        lexicalValue633_55_0 = spill633_1;
        break lexical_join_55;
    }
    if (!(((moom.FB)(spill633_1)).b)) {
        break lexical_join_63;
    }
    lexicalValue633_55_0 = this;
    }
    ((moom.FO)(((moom.FB)(lexicalValue633_55_0)).w)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.a)), ((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_27)));
    }
    life7_77 = new net.minecraft.world.chunk.Chunk(this.a, life6_27, p0, p1);
    life8_107 = ((net.minecraft.world.biome.WorldChunkManager)(((net.minecraft.world.World)(this.a)).a__Ff())).b(((net.minecraft.world.biome.BiomeGenBase[])(null)), ((int)((p0 * __sourceIntrinsic_a55be857de7c_invokedynamic633_18(21263, (5062811089173670416L ^ life3_3))))), ((int)((p1 * __sourceIntrinsic_a55be857de7c_invokedynamic633_19(21263, (5062811089173670416L ^ life3_3))))), ((int)(__sourceIntrinsic_a55be857de7c_invokedynamic633_20(21263, (5062811089173670416L ^ life3_3)))), ((int)(__sourceIntrinsic_a55be857de7c_invokedynamic633_21(21263, (5062811089173670416L ^ life3_3)))));
    life9_110 = ((net.minecraft.world.chunk.Chunk)(life7_77)).a__ArrayByte();
    life10_112 = 0;
    lexical_cycle_107: while (true) {
    if (!((life10_112 < (life9_110).length))) {
        break lexical_join_124;
    }
    (life9_110)[life10_112] = ((byte) ((net.minecraft.world.biome.BiomeGenBase)((life8_107)[life10_112])).aB);
    life10_112 += 1;
    if (!((life5_39 != null))) {
        break lexical_join_126;
    }
    if (!((life5_39 == null))) { continue lexical_cycle_107; }
    break lexical_cycle_107;
    }
    }
    ((net.minecraft.world.chunk.Chunk)(life7_77)).f();
    }
    return life7_77;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x444F;
        if (F[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = E[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])G.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    G.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/FB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            FB.F[n2] = n3;
        }
        return F[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.world.chunk.Chunk a(moom.DT p0) {
return ((moom.FB)(this)).a(((int)((((moom.DT)(p0)).a() >> 4))), ((int)((((moom.DT)(p0)).c() >> 4))));
}


public void a(net.minecraft.world.chunk.Chunk p0, int p1, int p2) {
((moom.FO)(this.w)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.a)), ((int)(p1)), ((int)(p2)), ((moom.Fm)(null)));
    return;
}


public java.util.List<moom.D7> a(net.minecraft.entity.EnumCreatureType p0, moom.DT p1) {
int forwardValue1903_28_0;
    moom.FB forwardValue1903_44_0;
    net.minecraft.world.World forwardValue1903_46_0;
    moom.DT forwardValue1903_46_1;
    boolean spill1903_0;
    moom.FB spill1903_1;
    net.minecraft.world.World spill1903_2;
    moom.DT spill1903_3;
    long life3_3;
    java.lang.String[] life5_5;
    net.minecraft.world.biome.BiomeGenBase life6_66;
    forward_join_46: {
    forward_join_44: {
    forward_join_43: {
    forward_join_28: {
    forward_join_20: {
    life3_3 = (moom.FB.D ^ 12750848366537L);
    life5_5 = moom.FI.b();
    if (!((p0 == net.minecraft.entity.EnumCreatureType.MONSTER))) {
        break forward_join_43;
    }
    spill1903_0 = ((moom.FO)(this.w)).a__Boolean(((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue1903_28_0 = ((spill1903_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill1903_0)) {
        break forward_join_20;
    }
    return ((moom.FO)(this.w)).b__sourceReturn_3f0615080b();
    }
    spill1903_1 = this;
    if (!((life5_5 != null))) {
        forwardValue1903_44_0 = spill1903_1;
        break forward_join_44;
    }
    forwardValue1903_28_0 = ((((moom.FO)(((moom.FB)(spill1903_1)).w)).a__Boolean(((net.minecraft.world.World)(this.a)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((forwardValue1903_28_0 != 0))) {
        break forward_join_43;
    }
    spill1903_2 = this.a;
    spill1903_3 = ((moom.DT)(p1)).b__DT();
    if (!((life5_5 != null))) {
        forwardValue1903_46_0 = spill1903_2;
        forwardValue1903_46_1 = spill1903_3;
        break forward_join_46;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill1903_2)).a__fE(((moom.DT)(spill1903_3))))).a__ch() == net.minecraft.init.Blocks.bn))) {
        break forward_join_43;
    }
    return ((moom.FO)(this.w)).b__sourceReturn_3f0615080b();
    }
    forwardValue1903_44_0 = this;
    }
    forwardValue1903_46_0 = ((moom.FB)(forwardValue1903_44_0)).a;
    forwardValue1903_46_1 = p1;
    }
    life6_66 = ((net.minecraft.world.World)(forwardValue1903_46_0)).a__ES(((moom.DT)(forwardValue1903_46_1)));
    return ((net.minecraft.world.biome.BiomeGenBase)(life6_66)).a(((net.minecraft.entity.EnumCreatureType)(p0)));
}


public void a(int p0, int p1, moom.Fm p2) {
int forestValue618_49_0;
    int forestValue618_54_0;
    int forestValue618_61_0;
    int forestValue618_218_0;
    int forestValue618_248_0;
    int forestValue618_248_1;
    int forestValue618_298_0;
    java.lang.String[] spill618_0;
    int spill618_1;
    int spill618_2;
    int spill618_3;
    int spill618_4;
    int spill618_5;
    int spill618_6;
    int spill618_7;
    long life4_3;
    int life7_5;
    int life8_14;
    int life9_18;
    java.lang.String[] life6_19;
    int life10_25;
    int life11_29;
    int life12_47;
    int life13_52;
    int life14_59;
    double life15_68;
    double life17_81;
    double life19_96;
    double life21_111;
    double life23_128;
    double life25_147;
    double life27_168;
    double life29_189;
    double life31_212;
    int life33_216;
    double life34_225;
    double life36_227;
    double life38_229;
    double life40_235;
    double life42_241;
    int life44_245;
    double life45_250;
    double life47_252;
    double life49_258;
    int life51_262;
    net.minecraft.block.state.IBlockState life52_267;
    int life53_299;
    int life54_309;
    int life55_315;
    forest_join_367: {
    life4_3 = (moom.FB.D ^ 63583090739717L);
    life7_5 = 4;
    spill618_0 = moom.FI.b();
    life8_14 = ((((net.minecraft.world.World)(this.a)).c() / 2) + 1);
    life9_18 = (life7_5 + 1);
    life6_19 = spill618_0;
    life10_25 = __sourceIntrinsic_273b4708c739_invokedynamic618_4(2274, (3122720394632673445L ^ life4_3));
    life11_29 = (life7_5 + 1);
    this.g = ((double[])(((moom.FB)(this)).a(((double[])(this.g)), ((int)((p0 * life7_5))), ((int)(0)), ((int)((p1 * life7_5))), ((int)(life9_18)), ((int)(life10_25)), ((int)(life11_29)))));
    life12_47 = 0;
    forest_cycle_48: while (true) {
    forest_join_364: {
    forestValue618_49_0 = life12_47;
    forest_cycle_49: while (true) {
    if (!((forestValue618_49_0 < life7_5))) {
        break forest_join_367;
    }
    life13_52 = 0;
    forest_cycle_53: while (true) {
    forest_join_361: {
    forestValue618_54_0 = life13_52;
    forest_cycle_54: while (true) {
    if (!((forestValue618_54_0 < life7_5))) {
        break forest_join_364;
    }
    spill618_1 = 0;
    if (!((life6_19 != null))) {
        forestValue618_49_0 = spill618_1;
        continue forest_cycle_49;
    }
    life14_59 = spill618_1;
    forest_cycle_60: while (true) {
    forest_join_358: {
    forestValue618_61_0 = life14_59;
    forest_cycle_61: while (true) {
    if (!((forestValue618_61_0 < __sourceIntrinsic_273b4708c739_invokedynamic618_8(5916, (1274115135162722135L ^ life4_3))))) {
        break forest_join_361;
    }
    life15_68 = 0x1.0p-3d;
    life17_81 = (this.g)[((((life12_47 * life11_29) + life13_52) * life10_25) + life14_59)];
    life19_96 = (this.g)[(((((life12_47 * life11_29) + life13_52) + 1) * life10_25) + life14_59)];
    life21_111 = (this.g)[(((((life12_47 + 1) * life11_29) + life13_52) * life10_25) + life14_59)];
    life23_128 = (this.g)[((((((life12_47 + 1) * life11_29) + life13_52) + 1) * life10_25) + life14_59)];
    life25_147 = (((this.g)[(((((life12_47 * life11_29) + life13_52) * life10_25) + life14_59) + 1)] - life17_81) * life15_68);
    life27_168 = (((this.g)[((((((life12_47 * life11_29) + life13_52) + 1) * life10_25) + life14_59) + 1)] - life19_96) * life15_68);
    life29_189 = (((this.g)[((((((life12_47 + 1) * life11_29) + life13_52) * life10_25) + life14_59) + 1)] - life21_111) * life15_68);
    life31_212 = (((this.g)[(((((((life12_47 + 1) * life11_29) + life13_52) + 1) * life10_25) + life14_59) + 1)] - life23_128) * life15_68);
    spill618_2 = 0;
    if (!((life6_19 != null))) {
        forestValue618_54_0 = spill618_2;
        continue forest_cycle_54;
    }
    life33_216 = spill618_2;
    forest_cycle_217: while (true) {
    forest_join_339: {
    forestValue618_218_0 = life33_216;
    forest_cycle_218: while (true) {
    if (!((forestValue618_218_0 < __sourceIntrinsic_273b4708c739_invokedynamic618_17(7254, (2617214957817900052L ^ life4_3))))) {
        break forest_join_358;
    }
    life34_225 = 0x1.0p-2d;
    life36_227 = life17_81;
    life38_229 = life19_96;
    life40_235 = ((life21_111 - life17_81) * life34_225);
    life42_241 = ((life23_128 - life19_96) * life34_225);
    spill618_3 = 0;
    if (!((life6_19 != null))) {
        forestValue618_61_0 = spill618_3;
        continue forest_cycle_61;
    }
    life44_245 = spill618_3;
    forest_cycle_246: while (true) {
    forest_join_328: {
    forestValue618_248_0 = life44_245;
    forestValue618_248_1 = 4;
    forest_cycle_248: while (true) {
    if (!((forestValue618_248_0 < forestValue618_248_1))) {
        break forest_join_339;
    }
    life45_250 = 0x1.0p-2d;
    life47_252 = life36_227;
    life49_258 = ((life38_229 - life36_227) * life45_250);
    spill618_4 = 0;
    if (!((life6_19 != null))) {
        forestValue618_218_0 = spill618_4;
        continue forest_cycle_218;
    }
    life51_262 = spill618_4;
    forest_cycle_263: while (true) {
    forest_join_298: {
    forest_join_293: {
    forest_join_284: {
    if (!((life51_262 < 4))) {
        break forest_join_328;
    }
    life52_267 = null;
    spill618_5 = ((life14_59 * __sourceIntrinsic_273b4708c739_invokedynamic618_18(14789, (766983540359891343L ^ life4_3))) + life33_216);
    spill618_6 = life8_14;
    if (!((life6_19 != null))) {
        forestValue618_248_0 = spill618_5;
        forestValue618_248_1 = spill618_6;
        continue forest_cycle_248;
    }
    if (!((spill618_5 < spill618_6))) {
        break forest_join_284;
    }
    life52_267 = ((moom.dN)(net.minecraft.init.Blocks.l)).a__fE();
    }
    spill618_7 = recovery.source.CarrierOps.dcmpl(((double)(life47_252)), ((double)(0x0.0p0d)));
    if (!((life6_19 != null))) {
        forestValue618_298_0 = spill618_7;
        break forest_join_298;
    }
    if (!((spill618_7 > 0))) {
        break forest_join_293;
    }
    life52_267 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aV)).a__fE();
    }
    forestValue618_298_0 = (life44_245 + (life12_47 * 4));
    }
    life53_299 = forestValue618_298_0;
    life54_309 = (life33_216 + (life14_59 * __sourceIntrinsic_273b4708c739_invokedynamic618_24(14789, (766983540359891343L ^ life4_3))));
    life55_315 = (life51_262 + (life13_52 * 4));
    ((moom.Fm)(p2)).a(((int)(life53_299)), ((int)(life54_309)), ((int)(life55_315)), ((net.minecraft.block.state.IBlockState)(life52_267)));
    life47_252 = (life47_252 + life49_258);
    life51_262 += 1;
    if (!((life6_19 == null))) {
        continue forest_cycle_263;
    }
    break forest_cycle_263;
    }
    break forest_cycle_248;
    }
    }
    life36_227 = (life36_227 + life40_235);
    life38_229 = (life38_229 + life42_241);
    life44_245 += 1;
    if (!((life6_19 == null))) {
        continue forest_cycle_246;
    }
    break forest_cycle_246;
    }
    break forest_cycle_218;
    }
    }
    life17_81 = (life17_81 + life25_147);
    life19_96 = (life19_96 + life27_168);
    life21_111 = (life21_111 + life29_189);
    life23_128 = (life23_128 + life31_212);
    life33_216 += 1;
    if (!((life6_19 == null))) {
        continue forest_cycle_217;
    }
    break forest_cycle_217;
    }
    break forest_cycle_61;
    }
    }
    life14_59 += 1;
    if (!((life6_19 == null))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    break forest_cycle_54;
    }
    }
    life13_52 += 1;
    if (!((life6_19 == null))) {
        continue forest_cycle_53;
    }
    break forest_cycle_53;
    }
    break forest_cycle_49;
    }
    }
    life12_47 += 1;
    if (!((life6_19 == null))) {
        continue forest_cycle_48;
    }
    break forest_cycle_48;
    }
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4472_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.FB.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public void a__Void() {
return;
}


public boolean a(boolean p0, net.minecraft.util.IProgressUpdate p1) {
return ((1) != 0);
}


public boolean a(moom.Fn p0, net.minecraft.world.chunk.Chunk p1, int p2, int p3) {
return ((0) != 0);
}


public void a(moom.Fn p0, int p1, int p2) {
int lexicalValue635_361_0;
    int lexicalValue635_411_0;
    java.lang.String[] spill635_0;
    boolean spill635_1;
    long life4_3;
    moom.DT life7_24;
    moom.Ee life8_30;
    java.lang.String[] life6_41;
    int life9_43;
    int life9_444;
    lexical_join_520: {
    lexical_join_518: {
    lexical_join_466: {
    lexical_join_464: {
    lexical_join_411: {
    lexical_join_410: {
    lexical_join_361: {
    lexical_join_358: {
    lexical_join_306: {
    lexical_join_248: {
    lexical_join_246: {
    lexical_join_178: {
    lexical_join_176: {
    lexical_join_106: {
    lexical_join_104: {
    life4_3 = (moom.FB.D ^ 111207662888353L);
    moom.du.Q = ((boolean)(true));
    life7_24 = new moom.DT((p1 * __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_2(21263, (5062810034610916601L ^ life4_3))), 0, (p2 * __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_3(21263, (5062810034610916601L ^ life4_3))));
    life8_30 = new moom.Ee(p1, p2);
    spill635_0 = moom.FI.b();
    ((moom.FO)(this.w)).a(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.c)), ((moom.Ee)(life8_30)));
    life6_41 = spill635_0;
    life9_43 = 0;
    lexical_cycle_44: while (true) {
    if (!((life9_43 < __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_9(14789, (766882455709722155L ^ life4_3))))) {
        break lexical_join_104;
    }
    ((moom.Go)(this.t)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.c)), ((moom.DT)(((moom.DT)(life7_24)).a(((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_14(21263, (5062810034610916601L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_16(14789, (766882455709722155L ^ life4_3))))), ((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_18(25841, (57080002672851731L ^ life4_3))))) + 4))), ((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_21(21263, (5062810034610916601L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_23(14789, (766882455709722155L ^ life4_3)))))))));
    life9_43 += 1;
    if (!((life6_41 != null))) {
        break lexical_join_106;
    }
    if (!((life6_41 == null))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    }
    life9_43 = 0;
    }
    lexical_cycle_106: while (true) {
    if (!((life9_43 < (((java.util.Random)(this.c)).nextInt(((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_28(1987, (3496263718932650025L ^ life4_3))))) + 1)))) + 1)))) {
        break lexical_join_176;
    }
    ((moom.Gk)(this.o)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.c)), ((moom.DT)(((moom.DT)(life7_24)).a(((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_35(21263, (5062810034610916601L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_37(14789, (766882455709722155L ^ life4_3))))), ((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_39(6307, (2676199500035491670L ^ life4_3))))) + 4))), ((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_42(21263, (5062810034610916601L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_44(14789, (766882455709722155L ^ life4_3)))))))));
    life9_43 += 1;
    if (!((life6_41 != null))) {
        break lexical_join_178;
    }
    if (!((life6_41 == null))) { continue lexical_cycle_106; }
    break lexical_cycle_106;
    }
    }
    life9_43 = 0;
    }
    lexical_cycle_178: while (true) {
    if (!((life9_43 < ((java.util.Random)(this.c)).nextInt(((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_49(30460, (3314085013272619284L ^ life4_3))))) + 1))))))) {
        break lexical_join_246;
    }
    ((moom.Gm)(this.p)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.c)), ((moom.DT)(((moom.DT)(life7_24)).a(((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_56(21263, (5062810034610916601L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_58(14789, (766882455709722155L ^ life4_3))))), ((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_60(6307, (2676199500035491670L ^ life4_3))))) + 4))), ((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_63(21263, (5062810034610916601L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_65(14789, (766882455709722155L ^ life4_3)))))))));
    life9_43 += 1;
    if (!((life6_41 != null))) {
        break lexical_join_248;
    }
    if (!((life6_41 == null))) { continue lexical_cycle_178; }
    break lexical_cycle_178;
    }
    }
    life9_43 = 0;
    }
    lexical_cycle_248: while (true) {
    if (!((life9_43 < __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_68(30460, (3314085013272619284L ^ life4_3))))) {
        break lexical_join_306;
    }
    ((moom.Gn)(this.q)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.c)), ((moom.DT)(((moom.DT)(life7_24)).a(((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_73(21263, (5062810034610916601L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_75(14789, (766882455709722155L ^ life4_3))))), ((int)(((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_77(10081, (3631583333263227012L ^ life4_3))))))), ((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_80(21263, (5062810034610916601L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_82(14789, (766882455709722155L ^ life4_3)))))))));
    life9_43 += 1;
    if (!((life6_41 != null))) {
        break lexical_join_358;
    }
    if (!((life6_41 == null))) { continue lexical_cycle_248; }
    break lexical_cycle_248;
    }
    }
    spill635_1 = ((java.util.Random)(this.c)).nextBoolean();
    if (!((life6_41 != null))) {
        lexicalValue635_361_0 = ((spill635_1) ? 1 : 0);
        break lexical_join_361;
    }
    if (!(spill635_1)) {
        break lexical_join_358;
    }
    ((moom.FZ)(this.u)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.c)), ((moom.DT)(((moom.DT)(life7_24)).a(((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_92(21263, (5062810034610916601L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_94(14789, (766882455709722155L ^ life4_3))))), ((int)(((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_96(6983, (6166638654063740074L ^ life4_3))))))), ((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_99(21263, (5062810034610916601L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_101(14789, (766882455709722155L ^ life4_3)))))))));
    }
    lexicalValue635_361_0 = ((((java.util.Random)(this.c)).nextBoolean()) ? 1 : 0);
    }
    if (!((life6_41 != null))) {
        lexicalValue635_411_0 = lexicalValue635_361_0;
        break lexical_join_411;
    }
    if (!((lexicalValue635_361_0 != 0))) {
        break lexical_join_410;
    }
    ((moom.FZ)(this.v)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.c)), ((moom.DT)(((moom.DT)(life7_24)).a(((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_111(21263, (5062810034610916601L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_113(14789, (766882455709722155L ^ life4_3))))), ((int)(((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_115(6983, (6166638654063740074L ^ life4_3))))))), ((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_118(21263, (5062810034610916601L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_120(14789, (766882455709722155L ^ life4_3)))))))));
    }
    lexicalValue635_411_0 = 0;
    }
    life9_444 = lexicalValue635_411_0;
    lexical_cycle_412: while (true) {
    if (!((life9_444 < __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_123(21263, (5062810034610916601L ^ life4_3))))) {
        break lexical_join_464;
    }
    ((moom.FY)(this.r)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.c)), ((moom.DT)(((moom.DT)(life7_24)).a(((int)(((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_128(21263, (5062810034610916601L ^ life4_3))))))), ((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_131(2308, (675742990728238819L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_133(30460, (3314085013272619284L ^ life4_3))))), ((int)(((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_135(21263, (5062810034610916601L ^ life4_3)))))))))));
    life9_444 += 1;
    if (!((life6_41 != null))) {
        break lexical_join_466;
    }
    if (!((life6_41 == null))) { continue lexical_cycle_412; }
    break lexical_cycle_412;
    }
    }
    life9_444 = 0;
    }
    lexical_cycle_466: while (true) {
    if (!((life9_444 < __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_139(21263, (5062810034610916601L ^ life4_3))))) {
        break lexical_join_518;
    }
    ((moom.Go)(this.s)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.c)), ((moom.DT)(((moom.DT)(life7_24)).a(((int)(((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_144(21263, (5062810034610916601L ^ life4_3))))))), ((int)((((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_147(12631, (8712320499838594739L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_149(30460, (3314085013272619284L ^ life4_3))))), ((int)(((java.util.Random)(this.c)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic635_151(21263, (5062810034610916601L ^ life4_3)))))))))));
    life9_444 += 1;
    if (!((life6_41 != null))) {
        break lexical_join_520;
    }
    if (!((life6_41 == null))) { continue lexical_cycle_466; }
    break lexical_cycle_466;
    }
    }
    moom.du.Q = ((boolean)(false));
    }
    return;
}


public int a() {
return 0;
}


public moom.DT a(net.minecraft.world.World p0, java.lang.String p1, moom.DT p2) {
return null;
}


private double[] a(double[] p0, int p1, int p2, int p3, int p4, int p5, int p6) {
double[] forestValue254_16_0;
    int forestValue254_156_0;
    double forestValue254_159_0;
    double forestValue254_159_1;
    int forestValue254_180_0;
    int forestValue254_185_0;
    int forestValue254_244_0;
    double forestValue254_255_0;
    double forestValue254_255_1;
    int forestValue254_294_0;
    double forestValue254_300_0;
    double forestValue254_300_1;
    int forestValue254_332_0;
    int forestValue254_332_1;
    int forestValue254_336_0;
    int forestValue254_395_0;
    double forestValue254_406_0;
    double forestValue254_406_1;
    int forestValue254_445_0;
    double forestValue254_451_0;
    double forestValue254_451_1;
    int forestValue254_484_0;
    double[] spill254_0;
    int spill254_1;
    int spill254_2;
    double spill254_3;
    double spill254_4;
    int spill254_5;
    int spill254_6;
    double spill254_7;
    double spill254_8;
    int spill254_9;
    double spill254_10;
    double spill254_11;
    int spill254_12;
    int spill254_13;
    double spill254_14;
    double spill254_15;
    int spill254_16;
    double spill254_17;
    double spill254_18;
    int spill254_19;
    long life8_3;
    java.lang.String[] life10_5;
    double life11_23;
    double life13_25;
    int life15_113;
    double[] life16_116;
    int life17_118;
    double life18_141;
    double life18_177;
    int life17_197;
    int life18_206;
    double life19_214;
    int life21_219;
    double life22_226;
    double life24_230;
    double life26_237;
    double life28_244;
    double life30_255;
    double life22_269;
    double life22_301;
    double life32_321;
    double life32_350;
    double life32_355;
    int life18_387;
    double life19_395;
    int life21_400;
    double life22_407;
    double life24_411;
    double life26_418;
    double life28_425;
    double life30_436;
    double life22_450;
    double life22_482;
    double life32_502;
    double life32_531;
    double life32_536;
    forest_join_486: {
    forest_join_332: {
    forest_join_177: {
    forest_join_17: {
    forest_join_16: {
    life8_3 = (moom.FB.D ^ 109886595763195L);
    life10_5 = moom.FI.b();
    spill254_0 = p0;
    if (!((life10_5 != null))) {
        forestValue254_16_0 = spill254_0;
        break forest_join_16;
    }
    if (!((spill254_0 == null))) {
        break forest_join_17;
    }
    forestValue254_16_0 = new double[((p4 * p5) * p6)];
    }
    p0 = forestValue254_16_0;
    }
    life11_23 = 0x1.5634bc6a7ef9ep9d;
    life13_25 = 0x1.00a78d4fdf3b6p11d;
    this.B = ((double[])(((moom.FV)(this.m)).a(((double[])(this.B)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(1)), ((int)(p6)), ((double)(0x1.0p0d)), ((double)(0x0.0p0d)), ((double)(0x1.0p0d)))));
    this.C = ((double[])(((moom.FV)(this.n)).a(((double[])(this.C)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(1)), ((int)(p6)), ((double)(0x1.9p6d)), ((double)(0x0.0p0d)), ((double)(0x1.9p6d)))));
    this.y = ((double[])(((moom.FV)(this.j)).a(((double[])(this.y)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((double)((life11_23 / 0x1.4p6d))), ((double)((life13_25 / 0x1.ep5d))), ((double)((life11_23 / 0x1.4p6d))))));
    this.z = ((double[])(((moom.FV)(this.h)).a(((double[])(this.z)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((double)(life11_23)), ((double)(life13_25)), ((double)(life11_23)))));
    this.A = ((double[])(((moom.FV)(this.i)).a(((double[])(this.A)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((double)(life11_23)), ((double)(life13_25)), ((double)(life11_23)))));
    life15_113 = 0;
    life16_116 = new double[p5];
    life17_118 = 0;
    forest_cycle_114: while (true) {
    forest_join_174: {
    forest_join_159: {
    forest_join_156: {
    forest_join_151: {
    if (!((life17_118 < p5))) {
        break forest_join_177;
    }
    (life16_116)[life17_118] = (java.lang.Math.cos(((double)((((((double) life17_118) * 0x1.921fb54442d18p1d) * 0x1.8p2d) / ((double) p5))))) * 0x1.0p1d);
    life18_141 = ((double) life17_118);
    spill254_1 = life17_118;
    if (!((life10_5 != null))) {
        forestValue254_156_0 = spill254_1;
        break forest_join_156;
    }
    spill254_2 = (p5 / 2);
    if (!((life10_5 != null))) {
        forestValue254_332_0 = spill254_1;
        forestValue254_332_1 = spill254_2;
        break forest_join_332;
    }
    if (!((spill254_1 > spill254_2))) {
        break forest_join_151;
    }
    life18_141 = ((double) ((p5 - 1) - life17_118));
    }
    spill254_3 = life18_141;
    spill254_4 = 0x1.0p2d;
    if (!((life10_5 != null))) {
        forestValue254_159_0 = spill254_3;
        forestValue254_159_1 = spill254_4;
        break forest_join_159;
    }
    forestValue254_156_0 = recovery.source.CarrierOps.dcmpg(((double)(spill254_3)), ((double)(spill254_4)));
    }
    if (!((forestValue254_156_0 < 0))) {
        break forest_join_174;
    }
    forestValue254_159_0 = 0x1.0p2d;
    forestValue254_159_1 = life18_141;
    }
    life18_177 = (forestValue254_159_0 - forestValue254_159_1);
    double[] __stackOp254_24_0 = life16_116;
    int __stackOp254_24_1 = life17_118;
    (__stackOp254_24_0)[__stackOp254_24_1] = ((__stackOp254_24_0)[__stackOp254_24_1] - (((life18_177 * life18_177) * life18_177) * 0x1.4p3d));
    }
    life17_118 += 1;
    if (!((life10_5 == null))) {
        continue forest_cycle_114;
    }
    break forest_cycle_114;
    }
    }
    life17_197 = 0;
    forest_cycle_179: while (true) {
    forest_join_328: {
    forestValue254_180_0 = life17_197;
    forest_cycle_180: while (true) {
    if (!((forestValue254_180_0 < p4))) {
        break forest_join_486;
    }
    life18_206 = 0;
    forest_cycle_184: while (true) {
    forest_join_325: {
    forestValue254_185_0 = life18_206;
    forest_cycle_185: while (true) {
    if (!((forestValue254_185_0 < p6))) {
        break forest_join_328;
    }
    life19_214 = 0x0.0p0d;
    spill254_5 = 0;
    if (!((life10_5 != null))) {
        forestValue254_180_0 = spill254_5;
        continue forest_cycle_180;
    }
    life21_219 = spill254_5;
    forest_cycle_193: while (true) {
    forest_join_317: {
    forest_join_300: {
    forest_join_294: {
    forest_join_288: {
    forest_join_257: {
    forest_join_255: {
    forest_join_249: {
    forest_join_244: {
    forest_join_239: {
    if (!((life21_219 < p5))) {
        break forest_join_325;
    }
    life22_226 = 0x0.0p0d;
    life24_230 = (life16_116)[life21_219];
    life26_237 = ((this.z)[life15_113] / 0x1.0p9d);
    life28_244 = ((this.A)[life15_113] / 0x1.0p9d);
    life30_255 = ((((this.y)[life15_113] / 0x1.4p3d) + 0x1.0p0d) / 0x1.0p1d);
    spill254_6 = recovery.source.CarrierOps.dcmpg(((double)(life30_255)), ((double)(0x0.0p0d)));
    if (!((life10_5 != null))) {
        forestValue254_185_0 = spill254_6;
        continue forest_cycle_185;
    }
    if (!((life10_5 != null))) {
        forestValue254_244_0 = spill254_6;
        break forest_join_244;
    }
    if (!((spill254_6 < 0))) {
        break forest_join_239;
    }
    life22_269 = life26_237;
    if (!((life10_5 == null))) {
        break forest_join_257;
    }
    }
    spill254_7 = life30_255;
    spill254_8 = 0x1.0p0d;
    if (!((life10_5 != null))) {
        forestValue254_255_0 = spill254_7;
        forestValue254_255_1 = spill254_8;
        break forest_join_255;
    }
    forestValue254_244_0 = recovery.source.CarrierOps.dcmpl(((double)(spill254_7)), ((double)(spill254_8)));
    }
    if (!((forestValue254_244_0 > 0))) {
        break forest_join_249;
    }
    life22_269 = life28_244;
    if (!((life10_5 == null))) {
        break forest_join_257;
    }
    }
    forestValue254_255_0 = life26_237;
    forestValue254_255_1 = ((life28_244 - life26_237) * life30_255);
    }
    life22_269 = (forestValue254_255_0 + forestValue254_255_1);
    }
    life22_301 = (life22_269 - life24_230);
    spill254_9 = life21_219;
    if (!((life10_5 != null))) {
        forestValue254_294_0 = spill254_9;
        break forest_join_294;
    }
    if (!((spill254_9 > (p5 - 4)))) {
        break forest_join_288;
    }
    life32_321 = ((double) (((float) (life21_219 - (p5 - 4))) / 0x1.8p1f));
    life22_301 = ((life22_301 * (0x1.0p0d - life32_321)) + (-0x1.4p3d * life32_321));
    }
    spill254_10 = ((double) life21_219);
    spill254_11 = life19_214;
    if (!((life10_5 != null))) {
        forestValue254_300_0 = spill254_10;
        forestValue254_300_1 = spill254_11;
        break forest_join_300;
    }
    forestValue254_294_0 = recovery.source.CarrierOps.dcmpg(((double)(spill254_10)), ((double)(spill254_11)));
    }
    if (!((forestValue254_294_0 < 0))) {
        break forest_join_317;
    }
    forestValue254_300_0 = (life19_214 - ((double) life21_219));
    forestValue254_300_1 = 0x1.0p2d;
    }
    life32_350 = (forestValue254_300_0 / forestValue254_300_1);
    life32_355 = moom.Dr.a(((double)(life32_350)), ((double)(0x0.0p0d)), ((double)(0x1.0p0d)));
    life22_301 = ((life22_301 * (0x1.0p0d - life32_355)) + (-0x1.4p3d * life32_355));
    }
    (p0)[life15_113] = life22_301;
    life15_113 += 1;
    life21_219 += 1;
    if (!((life10_5 == null))) {
        continue forest_cycle_193;
    }
    break forest_cycle_193;
    }
    break forest_cycle_185;
    }
    }
    life18_206 += 1;
    if (!((life10_5 == null))) {
        continue forest_cycle_184;
    }
    break forest_cycle_184;
    }
    break forest_cycle_180;
    }
    }
    life17_197 += 1;
    if (!((life10_5 == null))) {
        continue forest_cycle_179;
    }
    break forest_cycle_179;
    }
    break forest_join_486;
    }
    forest_cycle_332: while (true) {
    forest_join_484: {
    forest_join_483: {
    forest_join_479: {
    if (!((forestValue254_332_0 < forestValue254_332_1))) {
        break forest_join_486;
    }
    life18_387 = 0;
    forest_cycle_335: while (true) {
    forest_join_476: {
    forestValue254_336_0 = life18_387;
    forest_cycle_336: while (true) {
    if (!((forestValue254_336_0 < p6))) {
        break forest_join_479;
    }
    life19_395 = 0x0.0p0d;
    spill254_12 = 0;
    if (!((life10_5 != null))) {
        forestValue254_484_0 = spill254_12;
        break forest_join_484;
    }
    life21_400 = spill254_12;
    forest_cycle_344: while (true) {
    forest_join_468: {
    forest_join_451: {
    forest_join_445: {
    forest_join_439: {
    forest_join_408: {
    forest_join_406: {
    forest_join_400: {
    forest_join_395: {
    forest_join_390: {
    if (!((life21_400 < p5))) {
        break forest_join_476;
    }
    life22_407 = 0x0.0p0d;
    life24_411 = (life16_116)[life21_400];
    life26_418 = ((this.z)[life15_113] / 0x1.0p9d);
    life28_425 = ((this.A)[life15_113] / 0x1.0p9d);
    life30_436 = ((((this.y)[life15_113] / 0x1.4p3d) + 0x1.0p0d) / 0x1.0p1d);
    spill254_13 = recovery.source.CarrierOps.dcmpg(((double)(life30_436)), ((double)(0x0.0p0d)));
    if (!((life10_5 != null))) {
        forestValue254_336_0 = spill254_13;
        continue forest_cycle_336;
    }
    if (!((life10_5 != null))) {
        forestValue254_395_0 = spill254_13;
        break forest_join_395;
    }
    if (!((spill254_13 < 0))) {
        break forest_join_390;
    }
    life22_450 = life26_418;
    if (!((life10_5 == null))) {
        break forest_join_408;
    }
    }
    spill254_14 = life30_436;
    spill254_15 = 0x1.0p0d;
    if (!((life10_5 != null))) {
        forestValue254_406_0 = spill254_14;
        forestValue254_406_1 = spill254_15;
        break forest_join_406;
    }
    forestValue254_395_0 = recovery.source.CarrierOps.dcmpl(((double)(spill254_14)), ((double)(spill254_15)));
    }
    if (!((forestValue254_395_0 > 0))) {
        break forest_join_400;
    }
    life22_450 = life28_425;
    if (!((life10_5 == null))) {
        break forest_join_408;
    }
    }
    forestValue254_406_0 = life26_418;
    forestValue254_406_1 = ((life28_425 - life26_418) * life30_436);
    }
    life22_450 = (forestValue254_406_0 + forestValue254_406_1);
    }
    life22_482 = (life22_450 - life24_411);
    spill254_16 = life21_400;
    if (!((life10_5 != null))) {
        forestValue254_445_0 = spill254_16;
        break forest_join_445;
    }
    if (!((spill254_16 > (p5 - 4)))) {
        break forest_join_439;
    }
    life32_502 = ((double) (((float) (life21_400 - (p5 - 4))) / 0x1.8p1f));
    life22_482 = ((life22_482 * (0x1.0p0d - life32_502)) + (-0x1.4p3d * life32_502));
    }
    spill254_17 = ((double) life21_400);
    spill254_18 = life19_395;
    if (!((life10_5 != null))) {
        forestValue254_451_0 = spill254_17;
        forestValue254_451_1 = spill254_18;
        break forest_join_451;
    }
    forestValue254_445_0 = recovery.source.CarrierOps.dcmpg(((double)(spill254_17)), ((double)(spill254_18)));
    }
    if (!((forestValue254_445_0 < 0))) {
        break forest_join_468;
    }
    forestValue254_451_0 = (life19_395 - ((double) life21_400));
    forestValue254_451_1 = 0x1.0p2d;
    }
    life32_531 = (forestValue254_451_0 / forestValue254_451_1);
    life32_536 = moom.Dr.a(((double)(life32_531)), ((double)(0x0.0p0d)), ((double)(0x1.0p0d)));
    life22_482 = ((life22_482 * (0x1.0p0d - life32_536)) + (-0x1.4p3d * life32_536));
    }
    (p0)[life15_113] = life22_482;
    life15_113 += 1;
    life21_400 += 1;
    if (!((life10_5 == null))) {
        continue forest_cycle_344;
    }
    break forest_cycle_344;
    }
    break forest_cycle_336;
    }
    }
    life18_387 += 1;
    if (!((life10_5 == null))) {
        continue forest_cycle_335;
    }
    break forest_cycle_335;
    }
    }
    life17_118 += 1;
    if (!((life10_5 == null))) {
        break forest_join_483;
    }
    break forest_join_486;
    }
    forestValue254_484_0 = life17_118;
    }
    spill254_19 = p4;
    forestValue254_332_0 = forestValue254_484_0;
    forestValue254_332_1 = spill254_19;
    continue forest_cycle_332;
    }
    }
    return p0;
}


public java.lang.String a__String() {
return "HellRandomLevelSource";
}


public boolean a__Boolean(int p0, int p1) {
return ((1) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eba85a4c36d0e982_originalDynamicSite1994_49(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a55be857de7c_invokedynamic633_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a55be857de7c_invokedynamic633_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic633_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic633_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic633_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic633_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic618_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic618_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic618_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic618_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic618_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4472_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic635_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c74804d1c65_invokedynamic617_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4466_0() throws E;
}
