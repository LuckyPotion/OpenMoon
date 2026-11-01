package moom;


public class Mn implements moom.Mu {

private int a;

private java.lang.String b;

private net.minecraft.client.renderer.texture.ITextureObject c;

private static final long d;

private static final java.lang.String[] e;

private static final java.lang.String[] f;

private static final java.util.Map g;

private static final long h;

public Mn(int p0, java.lang.String p1, net.minecraft.client.renderer.texture.ITextureObject p2) {
super();
    this.a = -1;
    this.b = null;
    this.c = null;
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-6156289075902107076L)), ((long)(8167164566464946121L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(263650454977882L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.Mn.d ^ 40991816754559L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill708_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill708_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill708_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill708_14 = new byte[8];
    (__sourceSpill708_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill708_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation708_16 = __sourceSpill708_14;
    ((javax.crypto.Cipher)(__sourceSpill708_11)).init(((int)(__sourceSpill708_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill708_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation708_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[3];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "õ/&ñ]Hôµ\\5Á¹ÒSá¡\n#±jªà¬ðR°s\1774ÉÔ\030]f×ÿÛ\033Fç_Ó\032§ÚªÊ Ô»\\5SY Âóþ1 wJMib¦\027\177?W_\025\026O>\033Òø&2P3\\¥"))).length();
    int local10_life24 = 32;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill708_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill708_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill708_29)).doFinal(((byte[])(__sourceSpill708_28)));
        java.lang.String __sourceSpill708_34 = ((java.lang.String)(moom.Mn.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill708_35 = local14_life19;
        int __sourceSpill708_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill708_35)[__sourceSpill708_36] = __sourceSpill708_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    e = ((java.lang.String[])(local14_life19));
    f = ((java.lang.String[])(new java.lang.String[3]));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill708_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill708_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill708_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill708_46 = new byte[8];
    (__sourceSpill708_46)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill708_46)[local1_life47] = ((byte) ((int) ((local5_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation708_48 = __sourceSpill708_46;
    ((javax.crypto.Cipher)(__sourceSpill708_43)).init(((int)(__sourceSpill708_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill708_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation708_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life51 = -1403046223434197165L;
    byte[] __sourceSpill708_52 = new byte[8];
    (__sourceSpill708_52)[0] = ((byte) ((int) (local2_life51 >>> 56)));
    (__sourceSpill708_52)[1] = ((byte) ((int) (local2_life51 >>> 48)));
    (__sourceSpill708_52)[2] = ((byte) ((int) (local2_life51 >>> 40)));
    (__sourceSpill708_52)[3] = ((byte) ((int) (local2_life51 >>> 32)));
    (__sourceSpill708_52)[4] = ((byte) ((int) (local2_life51 >>> 24)));
    (__sourceSpill708_52)[5] = ((byte) ((int) (local2_life51 >>> 16)));
    (__sourceSpill708_52)[6] = ((byte) ((int) (local2_life51 >>> 8)));
    (__sourceSpill708_52)[7] = ((byte) ((int) local2_life51));
    javax.crypto.Cipher __sourceSpill708_53 = local0_life41;
    byte[] local4_life55 = ((javax.crypto.Cipher)(__sourceSpill708_53)).doFinal(((byte[])(__sourceSpill708_52)));
    h = ((long)((((((((((((long) (local4_life55)[0]) & 255L) << 56) | ((((long) (local4_life55)[1]) & 255L) << 48)) | ((((long) (local4_life55)[2]) & 255L) << 40)) | ((((long) (local4_life55)[3]) & 255L) << 32)) | ((((long) (local4_life55)[4]) & 255L) << 24)) | ((((long) (local4_life55)[5]) & 255L) << 16)) | ((((long) (local4_life55)[6]) & 255L) << 8)) | (((long) (local4_life55)[7]) & 255L))));
}


public java.lang.String toString() {
long local1 = (moom.Mn.d ^ 128926769861470L);
    int __sourceSpill1964_4 = this.a;
    java.lang.String __sourceSpill1964_5 = this.b;
    int local3 = this.a();
    java.lang.String local4 = __sourceSpill1964_5;
    int local5 = __sourceSpill1964_4;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1964_9(__sourceIntrinsic_a86c261fcdee_originalDynamicSite1964_6(5711, (3519246151876008641L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1964_7(6411, (6300466968455894407L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1964_8(11651, (1756411509980750094L ^ local1)), local3);
}


public int b() {
return this.a;
}


public int c() {
long local1 = (moom.Mn.d ^ 44163639519835L);
    return ((int) moom.Mn.h);
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
        byte[] spill3244_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3244_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3244_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3244_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3244_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3244_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14193);
    if (((moom.Mn.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Mn.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Mn.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Mn", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Mn.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Mn.f)[life5_8] = moom.Mn.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Mn.f)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Mn.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6452_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Mn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a__Void() {
moom.ol.a__Void(((int)(((net.minecraft.client.renderer.texture.ITextureObject)(this.c)).a())));
    return;
}


public int a() {
return ((net.minecraft.client.renderer.texture.ITextureObject)(this.c)).a();
}


public net.minecraft.client.renderer.texture.ITextureObject a__ob() {
return this.c;
}


public java.lang.String a__String() {
return this.b;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6452_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1964_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1964_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1964_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1964_9(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, int a5) throws E;
}
