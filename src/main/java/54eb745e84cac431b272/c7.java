package com.moon;


public class c7 extends com.moon.c0 {

private static final long g;

private static final java.lang.String[] h;

private static final java.lang.String[] i;

private static final java.util.Map k;

private static final long o;

public c7(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) {
super(p0, p1, p2);
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(6437253371157542393L)), ((long)(166734420330313657L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(16530078912220L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.c7.g ^ 36909551234833L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill39_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill39_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill39_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill39_14 = new byte[8];
    (__sourceSpill39_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill39_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation39_16 = __sourceSpill39_14;
    ((javax.crypto.Cipher)(__sourceSpill39_11)).init(((int)(__sourceSpill39_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill39_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation39_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[2];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "W[§%îZa#'\002«ý¼$²8³6d)p÷2DôË.\nhx¬¥ð\013\013¨É®º»U­2QX\006>ËÞ[\033ñ\031w°\016z»ÈÄ\037Æ"))).length();
    int local10_life24 = 16;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill39_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill39_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill39_29)).doFinal(((byte[])(__sourceSpill39_28)));
        java.lang.String __sourceSpill39_34 = ((java.lang.String)(com.moon.c7.b(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill39_35 = local14_life19;
        int __sourceSpill39_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill39_35)[__sourceSpill39_36] = __sourceSpill39_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    h = ((java.lang.String[])(local14_life19));
    i = ((java.lang.String[])(new java.lang.String[2]));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill39_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill39_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill39_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill39_46 = new byte[8];
    (__sourceSpill39_46)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill39_46)[local1_life47] = ((byte) ((int) ((local5_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation39_48 = __sourceSpill39_46;
    ((javax.crypto.Cipher)(__sourceSpill39_43)).init(((int)(__sourceSpill39_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill39_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation39_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life51 = -3975581503673785333L;
    byte[] __sourceSpill39_52 = new byte[8];
    (__sourceSpill39_52)[0] = ((byte) ((int) (local2_life51 >>> 56)));
    (__sourceSpill39_52)[1] = ((byte) ((int) (local2_life51 >>> 48)));
    (__sourceSpill39_52)[2] = ((byte) ((int) (local2_life51 >>> 40)));
    (__sourceSpill39_52)[3] = ((byte) ((int) (local2_life51 >>> 32)));
    (__sourceSpill39_52)[4] = ((byte) ((int) (local2_life51 >>> 24)));
    (__sourceSpill39_52)[5] = ((byte) ((int) (local2_life51 >>> 16)));
    (__sourceSpill39_52)[6] = ((byte) ((int) (local2_life51 >>> 8)));
    (__sourceSpill39_52)[7] = ((byte) ((int) local2_life51));
    javax.crypto.Cipher __sourceSpill39_53 = local0_life41;
    byte[] local4_life55 = ((javax.crypto.Cipher)(__sourceSpill39_53)).doFinal(((byte[])(__sourceSpill39_52)));
    o = ((long)((((((((((((long) (local4_life55)[0]) & 255L) << 56) | ((((long) (local4_life55)[1]) & 255L) << 48)) | ((((long) (local4_life55)[2]) & 255L) << 40)) | ((((long) (local4_life55)[3]) & 255L) << 32)) | ((((long) (local4_life55)[4]) & 255L) << 24)) | ((((long) (local4_life55)[5]) & 255L) << 16)) | ((((long) (local4_life55)[6]) & 255L) << 8)) | (((long) (local4_life55)[7]) & 255L))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral755_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/c7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.c7.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String b(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16740);
    if (((com.moon.c7.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.c7.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.c7.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/c7", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.c7.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.c7.i)[life5_8] = com.moon.c7.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.c7.i)[life5_8];
}


private static java.lang.String b(byte[] p0) {
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
        byte[] spill104_0 = p0;
        life4_9 += 1;
        life5_44 = (spill104_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill104_1 = p0;
        life4_9 += 1;
        life5_76 = (spill104_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill104_2 = p0;
        life4_9 += 1;
        life5_91 = (spill104_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public com.moon.dc a() {
long local1 = (com.moon.c7.g ^ 30689850643330L);
    java.lang.String local3 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.c7.a)).K)).a__String();
    ((java.awt.datatransfer.Clipboard)(((java.awt.Toolkit)(java.awt.Toolkit.getDefaultToolkit())).getSystemClipboard())).setContents(((java.awt.datatransfer.Transferable)(new java.awt.datatransfer.StringSelection(local3))), ((java.awt.datatransfer.ClipboardOwner)(null)));
    ((com.moon.hD)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD())).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_originalDynamicSite74_10(2979, (4663956578504938866L ^ local1))))))).b(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_originalDynamicSite74_12(13577, (9024681095564176345L ^ local1))))))).a(((com.moon.b8)(com.moon.b8.SUCCESS))))).a(((long)(com.moon.c7.o))))).a())));
    return ((com.moon.dd)(((com.moon.dd)(com.moon.dc.a())).a(((boolean)(true))))).a();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral755_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_originalDynamicSite74_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_originalDynamicSite74_12(int a0, long a1) throws E;
}
