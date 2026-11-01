package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jB extends com.moon.jA {

private static final long c;

private static final java.util.HashMap<com.moon.jD, com.moon.jE> d;

private static final java.util.HashMap<com.moon.jD, com.moon.jE> e;

private static final java.util.HashMap<com.moon.jD, com.moon.jE> f;

private static final java.util.HashMap<com.moon.jD, com.moon.jE> g;

private static final java.util.HashMap<com.moon.jD, com.moon.jE> h;

private static final java.util.HashMap<com.moon.jD, com.moon.jE> i;

private static final java.util.HashMap<com.moon.jD, com.moon.jE> j;

private final int k;

private final int l;

private final float m;

private final float n;

private final boolean o;

private static final long p;

private static final java.lang.String[] q;

private static final java.lang.String[] r;

private static final java.util.Map s;

private static final long[] t;

private static final java.lang.Integer[] u;

private static final java.util.Map v;

private jB(int p0, int p1, float p2, float p3, boolean p4) {
super();
    this.k = p0;
    this.l = p1;
    this.m = p2;
    this.n = p3;
    this.o = p4;
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(6186520443126988401L)), ((long)(3145167469317281324L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(169974567962384L)))));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.jB.p ^ 12556924616523L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill180_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill180_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill180_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill180_14 = new byte[8];
    (__sourceSpill180_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill180_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation180_16 = __sourceSpill180_14;
    ((javax.crypto.Cipher)(__sourceSpill180_11)).init(((int)(__sourceSpill180_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill180_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation180_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[7];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "ªLK*ï{ð+t@;ÅõXç\\`åY\016d\030±ö%ò\026\\[7\035ó9¦Ò[ä(ýâ\020(µü*Ü[~Æ`yH\024\034çæi\036ds\016_ù´|m¥øî\\ï-\\Ùù \177Ùá\177HðÒ\027bòùBJÖå®rì½U #z/àe] ü¥8\"&35áÉ¯a¾ÿ\034&B°Ä<\000\032Ó?²ã\nbÐ©"))).length();
    int local16_life24 = 24;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill180_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill180_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill180_29)).doFinal(((byte[])(__sourceSpill180_28)));
        java.lang.String __sourceSpill180_34 = ((java.lang.String)(com.moon.jB.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill180_35 = local20_life19;
        int __sourceSpill180_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill180_35)[__sourceSpill180_36] = __sourceSpill180_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "!B\033a=\0239cæ9\013Y9è&³\036w8\021/P\fÐÁaÿÕç8yô\034Âú`I# \025ýöä¹àD&îwÚ\024àJJ}+G<Ã\033N®ÀEð5\tA"))).length();
    local16_life24 = 40;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill180_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill180_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill180_42)).doFinal(((byte[])(__sourceSpill180_41)));
        java.lang.String __sourceSpill180_47 = ((java.lang.String)(com.moon.jB.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill180_48 = local20_life19;
        int __sourceSpill180_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill180_48)[__sourceSpill180_49] = __sourceSpill180_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    q = ((java.lang.String[])(local20_life19));
    r = ((java.lang.String[])(new java.lang.String[7]));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill180_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill180_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill180_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill180_60 = new byte[8];
    (__sourceSpill180_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill180_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation180_62 = __sourceSpill180_60;
    ((javax.crypto.Cipher)(__sourceSpill180_57)).init(((int)(__sourceSpill180_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill180_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation180_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[6];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "»WëN\0015ÿ\177d\n`ã,ôÀØ0ëõÆà¨,·"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill180_71 = local4_life67;
        int __sourceSpill180_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill180_71)).substring(((int)(__sourceSpill180_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill180_76 = local6_life65;
        int __sourceSpill180_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill180_79 = new byte[8];
        (__sourceSpill180_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill180_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill180_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill180_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill180_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill180_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill180_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill180_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill180_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill180_80)).doFinal(((byte[])(__sourceSpill180_79)));
        (__sourceSpill180_76)[__sourceSpill180_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "åçìÊlÊh¾7®IW\177Lä"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill180_84 = local4_life67;
        int __sourceSpill180_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill180_84)).substring(((int)(__sourceSpill180_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill180_89 = local6_life65;
        int __sourceSpill180_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill180_92 = new byte[8];
        (__sourceSpill180_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill180_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill180_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill180_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill180_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill180_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill180_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill180_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill180_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill180_93)).doFinal(((byte[])(__sourceSpill180_92)));
        (__sourceSpill180_89)[__sourceSpill180_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    t = ((long[])(local6_life65));
    u = ((java.lang.Integer[])(new java.lang.Integer[6]));
    c = ((long)(java.lang.System.currentTimeMillis()));
    d = ((java.util.HashMap)(new java.util.HashMap()));
    e = ((java.util.HashMap)(new java.util.HashMap()));
    f = ((java.util.HashMap)(new java.util.HashMap()));
    g = ((java.util.HashMap)(new java.util.HashMap()));
    h = ((java.util.HashMap)(new java.util.HashMap()));
    i = ((java.util.HashMap)(new java.util.HashMap()));
    j = ((java.util.HashMap)(new java.util.HashMap()));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1868_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.jB.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x338F;
        if (u[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = t[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])v.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    v.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/jB", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jB.u[n2] = n6;
        }
        return u[n2];
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill778_0 = p0;
        life4_9 += 1;
        life5_44 = (spill778_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill778_1 = p0;
        life4_9 += 1;
        life5_76 = (spill778_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill778_2 = p0;
        life4_9 += 1;
        life5_91 = (spill778_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(float p0, float p1) {
com.moon.jE forwardValue569_118_0;
    int forwardValue569_118_1;
    com.moon.jE forwardValue569_119_0;
    com.moon.jE forwardValue569_124_0;
    int forwardValue569_124_1;
    int spill569_0;
    com.moon.jE spill569_1;
    boolean spill569_2;
    long life3_3;
    com.moon.jE life6_59;
    int life5_60;
    com.moon.jE life7_66;
    com.moon.jE life8_72;
    com.moon.jE life9_78;
    com.moon.jE life10_84;
    com.moon.jE life11_90;
    com.moon.jE life12_96;
    forward_join_150: {
    forward_join_124: {
    forward_join_119: {
    forward_join_118: {
    life3_3 = (com.moon.jB.p ^ 36925438281423L);
    ((java.util.HashMap)(com.moon.jB.d)).computeIfAbsent(((java.lang.Object)(((com.moon.jB)(this)).a)), ((java.util.function.Function)(__sourceIntrinsic_9229ce90378e_invokedynamic569_3(this))));
    ((java.util.HashMap)(com.moon.jB.e)).computeIfAbsent(((java.lang.Object)(((com.moon.jB)(this)).a)), ((java.util.function.Function)(__sourceIntrinsic_9229ce90378e_invokedynamic569_7(this))));
    ((java.util.HashMap)(com.moon.jB.f)).computeIfAbsent(((java.lang.Object)(((com.moon.jB)(this)).a)), ((java.util.function.Function)(__sourceIntrinsic_9229ce90378e_invokedynamic569_11(this))));
    ((java.util.HashMap)(com.moon.jB.g)).computeIfAbsent(((java.lang.Object)(((com.moon.jB)(this)).a)), ((java.util.function.Function)(__sourceIntrinsic_9229ce90378e_invokedynamic569_15(this))));
    spill569_0 = __sourceExactCall_a6edf96e0f7348();
    ((java.util.HashMap)(com.moon.jB.h)).computeIfAbsent(((java.lang.Object)(((com.moon.jB)(this)).a)), ((java.util.function.Function)(__sourceIntrinsic_9229ce90378e_invokedynamic569_20(this))));
    ((java.util.HashMap)(com.moon.jB.i)).computeIfAbsent(((java.lang.Object)(((com.moon.jB)(this)).a)), ((java.util.function.Function)(__sourceIntrinsic_9229ce90378e_invokedynamic569_24(this))));
    ((java.util.HashMap)(com.moon.jB.j)).computeIfAbsent(((java.lang.Object)(((com.moon.jB)(this)).a)), ((java.util.function.Function)(__sourceIntrinsic_9229ce90378e_invokedynamic569_28(this))));
    life6_59 = ((com.moon.jE)(((java.util.HashMap)(com.moon.jB.d)).get(((java.lang.Object)(((com.moon.jB)(this)).a)))));
    life5_60 = spill569_0;
    life7_66 = ((com.moon.jE)(((java.util.HashMap)(com.moon.jB.e)).get(((java.lang.Object)(((com.moon.jB)(this)).a)))));
    life8_72 = ((com.moon.jE)(((java.util.HashMap)(com.moon.jB.f)).get(((java.lang.Object)(((com.moon.jB)(this)).a)))));
    life9_78 = ((com.moon.jE)(((java.util.HashMap)(com.moon.jB.g)).get(((java.lang.Object)(((com.moon.jB)(this)).a)))));
    life10_84 = ((com.moon.jE)(((java.util.HashMap)(com.moon.jB.h)).get(((java.lang.Object)(((com.moon.jB)(this)).a)))));
    life11_90 = ((com.moon.jE)(((java.util.HashMap)(com.moon.jB.i)).get(((java.lang.Object)(((com.moon.jB)(this)).a)))));
    life12_96 = ((com.moon.jE)(((java.util.HashMap)(com.moon.jB.j)).get(((java.lang.Object)(((com.moon.jB)(this)).a)))));
    ((com.moon.jB)(this)).a(((com.moon.jE)(life6_59)), ((int)(this.k)));
    ((com.moon.jB)(this)).a(((com.moon.jE)(life7_66)), ((int)(this.l)));
    ((com.moon.jE)(life8_72)).a(((float)(this.m)));
    spill569_1 = life9_78;
    spill569_2 = this.o;
    if (!((life5_60 != 0))) {
        forwardValue569_118_0 = spill569_1;
        forwardValue569_118_1 = ((spill569_2) ? 1 : 0);
        break forward_join_118;
    }
    if (!(spill569_2)) {
        forwardValue569_119_0 = spill569_1;
        break forward_join_119;
    }
    forwardValue569_118_0 = spill569_1;
    forwardValue569_118_1 = 4;
    }
    forwardValue569_124_0 = forwardValue569_118_0;
    forwardValue569_124_1 = forwardValue569_118_1;
    break forward_join_124;
    }
    forwardValue569_124_0 = forwardValue569_119_0;
    forwardValue569_124_1 = __sourceIntrinsic_9229ce90378e_invokedynamic569_66(16286, (3295977580628838119L ^ life3_3));
    }
    ((com.moon.jE)(forwardValue569_124_0)).a__Void(((int)(forwardValue569_124_1)));
    ((com.moon.jE)(life10_84)).a(((boolean)(this.o)));
    ((com.moon.jE)(life11_90)).a(((float)(((((float) (java.lang.System.currentTimeMillis() - com.moon.jB.c)) + (this.n / 0x1.4p2f)) / 0x1.f4p9f))));
    ((com.moon.jE)(life12_96)).a__Void(((int)(1)));
    if (!((life5_60 == 0))) {
        break forward_join_150;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[5])));
    }
    return;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 19878);
    if (((com.moon.jB.r)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jB.s)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jB.s)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jB", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.jB.q)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jB.r)[life5_8] = __sourceExactCall_9b0d01a2ea248d(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jB.r)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_085ee847882623(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1872_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a(com.moon.jE p0, int p1) {
long local3 = (com.moon.jB.p ^ 75776986811224L);
    float local5 = com.moon.hU.k();
    float local6 = (((float) ((p1 >> __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_2(1560, (3929247770786067189L ^ local3))) & __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_3(25511, (8828644574933456712L ^ local3)))) / 0x1.fep7f);
    float local7 = (((float) ((p1 >> __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_4(18338, (3201144423357526858L ^ local3))) & __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_5(13463, (5272247003469987966L ^ local3)))) / 0x1.fep7f);
    float local8 = (((float) (p1 & __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_6(13463, (5272247003469987966L ^ local3)))) / 0x1.fep7f);
    float local9 = ((((float) ((p1 >> __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_7(6220, (6992879816055024800L ^ local3))) & __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_8(13463, (5272247003469987966L ^ local3)))) / 0x1.fep7f) * local5);
    ((com.moon.jE)(p0)).a(((float)(local6)), ((float)(local7)), ((float)(local8)), ((float)(local9)));
    return;
}


public void a__Void() {
java.lang.Object local1 = ((com.moon.jE)(((java.util.HashMap)(com.moon.jB.j)).get(((java.lang.Object)(((com.moon.jB)(this)).a)))));
    ((com.moon.jD)(((com.moon.jB)(this)).a)).a__Void();
    ((com.moon.jE)(local1)).a__Void(((int)(0)));
    org.lwjgl.opengl.GL20.glUseProgram(((int)(0)));
    return;
}


public static com.moon.jB a(int p0, int p1, float p2, float p3, boolean p4) {
return new com.moon.jB(p0, p1, p2, p3, p4);
}


private com.moon.jD lambda$apply$4() {
return ((com.moon.jB)(this)).a;
}


private com.moon.jD lambda$apply$0() {
return ((com.moon.jB)(this)).a;
}


private com.moon.jE lambda$apply$9(com.moon.jD p0) {
long local2 = (com.moon.jB.p ^ 88366992597090L);
    com.moon.jE local4 = ((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_ed814dcc345a_originalDynamicSite417_2(11293, (6798357414849023463L ^ local2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ed814dcc345a_originalDynamicSite417_4(this)))))).a();
    ((com.moon.jE)(local4)).a__Void();
    return local4;
}


private com.moon.jD lambda$apply$10() {
return ((com.moon.jB)(this)).a;
}


private com.moon.jE lambda$apply$1(com.moon.jD p0) {
long local2 = (com.moon.jB.p ^ 132245672399399L);
    com.moon.jE local4 = ((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_0105eeef81f3_originalDynamicSite418_2(9310, (5967726261109897189L ^ local2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_0105eeef81f3_originalDynamicSite418_4(this)))))).a();
    ((com.moon.jE)(local4)).a__Void();
    return local4;
}


private com.moon.jE lambda$apply$5(com.moon.jD p0) {
long local2 = (com.moon.jB.p ^ 42912635054259L);
    com.moon.jE local4 = ((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_d34502d6534e_originalDynamicSite419_2(32525, (3886201800589022755L ^ local2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_d34502d6534e_originalDynamicSite419_4(this)))))).a();
    ((com.moon.jE)(local4)).a__Void();
    return local4;
}


private com.moon.jE lambda$apply$7(com.moon.jD p0) {
long local2 = (com.moon.jB.p ^ 137704896350927L);
    com.moon.jE local4 = ((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_0d5913725d85_originalDynamicSite420_2(17241, (3569924341361772552L ^ local2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_0d5913725d85_originalDynamicSite420_4(this)))))).a();
    ((com.moon.jE)(local4)).a__Void();
    return local4;
}


private com.moon.jD lambda$apply$6() {
return ((com.moon.jB)(this)).a;
}


private com.moon.jE lambda$apply$13(com.moon.jD p0) {
long local2 = (com.moon.jB.p ^ 121160887278385L);
    com.moon.jE local4 = ((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_f3ee36a8e57c_originalDynamicSite421_2(20354, (4438640805630203180L ^ local2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_f3ee36a8e57c_originalDynamicSite421_4(this)))))).a();
    ((com.moon.jE)(local4)).a__Void();
    return local4;
}


private com.moon.jD lambda$apply$12() {
return ((com.moon.jB)(this)).a;
}


private com.moon.jE lambda$apply$3(com.moon.jD p0) {
long local2 = (com.moon.jB.p ^ 13867047911202L);
    com.moon.jE local4 = ((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_966ad018ea26_originalDynamicSite422_2(31166, (8709206123436377861L ^ local2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_966ad018ea26_originalDynamicSite422_4(this)))))).a();
    ((com.moon.jE)(local4)).a__Void();
    return local4;
}


private com.moon.jD lambda$apply$8() {
return ((com.moon.jB)(this)).a;
}


private com.moon.jD lambda$apply$2() {
return ((com.moon.jB)(this)).a;
}


private com.moon.jE lambda$apply$11(com.moon.jD p0) {
long local2 = (com.moon.jB.p ^ 133821029229030L);
    com.moon.jE local4 = ((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_6349b81a0f88_originalDynamicSite423_2(12678, (1215657305712529915L ^ local2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_6349b81a0f88_originalDynamicSite423_4(this)))))).a();
    ((com.moon.jE)(local4)).a__Void();
    return local4;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1868_0() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_9229ce90378e_invokedynamic569_3(com.moon.jB a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_9229ce90378e_invokedynamic569_7(com.moon.jB a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_9229ce90378e_invokedynamic569_11(com.moon.jB a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_9229ce90378e_invokedynamic569_15(com.moon.jB a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_9229ce90378e_invokedynamic569_20(com.moon.jB a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_9229ce90378e_invokedynamic569_24(com.moon.jB a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_9229ce90378e_invokedynamic569_28(com.moon.jB a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9229ce90378e_invokedynamic569_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1872_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_68d8bb35e3e2_originalDynamicSite416_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ed814dcc345a_originalDynamicSite417_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ed814dcc345a_originalDynamicSite417_4(com.moon.jB a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0105eeef81f3_originalDynamicSite418_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_0105eeef81f3_originalDynamicSite418_4(com.moon.jB a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d34502d6534e_originalDynamicSite419_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_d34502d6534e_originalDynamicSite419_4(com.moon.jB a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d5913725d85_originalDynamicSite420_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_0d5913725d85_originalDynamicSite420_4(com.moon.jB a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f3ee36a8e57c_originalDynamicSite421_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_f3ee36a8e57c_originalDynamicSite421_4(com.moon.jB a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_966ad018ea26_originalDynamicSite422_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_966ad018ea26_originalDynamicSite422_4(com.moon.jB a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6349b81a0f88_originalDynamicSite423_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_6349b81a0f88_originalDynamicSite423_4(com.moon.jB a0) throws E;

private static native int __sourceExactCall_a6edf96e0f7348();
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
private static native java.lang.String __sourceExactCall_9b0d01a2ea248d(byte[] p0);
private static native java.lang.String __sourceExactCall_085ee847882623(int p0, long p1);
}
