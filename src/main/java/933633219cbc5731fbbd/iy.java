package com.moon;


public class iy extends com.moon.iw {

private com.moon.iU k;

private static java.lang.String[] l;

private static long m;

private static java.lang.String[] n;

private static java.lang.String[] o;

private static java.util.Map p;

public iy() { super(); }


private static void __sourceConstructorBody_7ffb62c56543ac63(com.moon.iy receiver) throws Throwable {

long local1 = (com.moon.iy.m ^ 136766975649767L);

    com.moon.iy.__sourceConstructorInit_7ffb62c56543ac63_0(((com.moon.iy)(receiver)));

    ((com.moon.iy)(receiver)).k = ((com.moon.iU)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(com.moon.iU.a__iV())).a(((java.lang.Class)(com.moon.iZ.class))))).a(((java.lang.String)(__sourceIntrinsic_7ffb62c56543ac63_originalDynamicSite1057_5(21025, (4020622973401904385L ^ local1))))))).c(((java.lang.String)(__sourceIntrinsic_7ffb62c56543ac63_originalDynamicSite1057_7(20407, (7155640399936366741L ^ local1))))))).b(((java.lang.String)(__sourceIntrinsic_7ffb62c56543ac63_originalDynamicSite1057_9(20407, (7155640399936366741L ^ local1))))))).a()));

    return;

}



static {
m = ((long)(((moom._a)(moom._c.a(((long)(8272555999571842634L)), ((long)(3048860383730626528L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(120009864051278L)))));

    java.lang.String[] __sourceSpill255_6 = new java.lang.String[3];

    p = ((java.util.Map)(new java.util.HashMap(13)));

    com.moon.iy.b(((java.lang.String[])(__sourceSpill255_6)));

    long local0_life9 = (com.moon.iy.m ^ 104755441900873L);

    javax.crypto.Cipher local2_life11;

    javax.crypto.Cipher __sourceSpill255_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill255_14 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill255_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill255_16 = new byte[8];

    (__sourceSpill255_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));

    int local3_life17 = 1;

    while ((local3_life17 < 8)) {

        (__sourceSpill255_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));

        local3_life17 += 1;

    }

    byte[] __sourcePreallocation255_18 = __sourceSpill255_16;

    ((javax.crypto.Cipher)(__sourceSpill255_13)).init(((int)(__sourceSpill255_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill255_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation255_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life21 = new java.lang.String[6];

    int local7_life22 = 0;

    java.lang.String local6_life23;

    int local8_life25 = ((java.lang.String)((local6_life23 = "ï´L]mÏ41¼c£é\035\020g,\027ûoöÕf3|º6 \016ýzÜ\002Cú<È·ó#>\006Ü\0008ø\003¤ÑÉÞÈ·\fXü©¹\020óì¨Ô¡¿«l\034æ*é\177f"))).length();

    int local5_life26 = 16;

    int local4_life27 = -1;

    while (true) {

        local4_life27 += 1;

        byte[] __sourceSpill255_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill255_31 = local2_life11;

        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill255_31)).doFinal(((byte[])(__sourceSpill255_30)));

        java.lang.String __sourceSpill255_36 = ((java.lang.String)(com.moon.iy.b(((byte[])(local10_life33))))).intern();

        java.lang.String[] __sourceSpill255_37 = local9_life21;

        int __sourceSpill255_38 = local7_life22;

        local7_life22 += 1;

        (__sourceSpill255_37)[__sourceSpill255_38] = __sourceSpill255_36;

        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }

        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));

    }

    local8_life25 = ((java.lang.String)((local6_life23 = "Ë;\036\177bHÙ­2ùÖãÜzØ\027¿¬V\033¥\016_¶AÀ\0210ZìÄ æ´#ÕeV{P\036òY¥v6Êkápp¥^Ù DÈÉ#6^"))).length();

    local5_life26 = 32;

    local4_life27 = -1;

    while (true) {

        local4_life27 += 1;

        byte[] __sourceSpill255_44 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill255_45 = local2_life11;

        byte[] local10_life47 = ((javax.crypto.Cipher)(__sourceSpill255_45)).doFinal(((byte[])(__sourceSpill255_44)));

        java.lang.String __sourceSpill255_50 = ((java.lang.String)(com.moon.iy.b(((byte[])(local10_life47))))).intern();

        java.lang.String[] __sourceSpill255_51 = local9_life21;

        int __sourceSpill255_52 = local7_life22;

        local7_life22 += 1;

        (__sourceSpill255_51)[__sourceSpill255_52] = __sourceSpill255_50;

        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }

        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));

    }

    n = ((java.lang.String[])(local9_life21));

    o = ((java.lang.String[])(new java.lang.String[6]));
}

private static native <E extends Throwable> void __sourceConstructorInit_7ffb62c56543ac63_0(com.moon.iy a0) throws E;

protected void b__Void() {
long life1_3;
    int life4_13;
    int life5_23;
    int life6_33;
    int life7_43;
    java.lang.String[] life3_58;
    life1_3 = (com.moon.iy.m ^ 4893501792526L);
    life4_13 = org.lwjgl.opengl.GL20.glGetUniformLocation(((int)(((com.moon.jD)(this.g)).a())), ((java.lang.CharSequence)(__sourceIntrinsic_9bf881b104f5_invokedynamic434_3(26047, (6070743161427428471L ^ life1_3)))));
    life5_23 = org.lwjgl.opengl.GL20.glGetUniformLocation(((int)(((com.moon.jD)(this.g)).a())), ((java.lang.CharSequence)(__sourceIntrinsic_9bf881b104f5_invokedynamic434_7(24692, (4706583508414300606L ^ life1_3)))));
    life6_33 = org.lwjgl.opengl.GL20.glGetUniformLocation(((int)(((com.moon.jD)(this.g)).a())), ((java.lang.CharSequence)(__sourceIntrinsic_9bf881b104f5_invokedynamic434_11(4298, (174224713105830151L ^ life1_3)))));
    life7_43 = org.lwjgl.opengl.GL20.glGetUniformLocation(((int)(((com.moon.jD)(this.g)).a())), ((java.lang.CharSequence)(__sourceIntrinsic_9bf881b104f5_invokedynamic434_15(30799, (3434412033905006979L ^ life1_3)))));
    org.lwjgl.opengl.GL20.glUniform1i(((int)(life4_13)), ((int)(0)));
    org.lwjgl.opengl.GL20.glUniform1f(((int)(life7_43)), ((float)(0x1.0p-1f)));
    org.lwjgl.opengl.GL20.glUniform1f(((int)(life5_23)), ((float)(0x1.0p0f)));
    java.lang.String[] spill434_0 = com.moon.iy.a__ArrayString();
    org.lwjgl.opengl.GL20.glUniform2f(((int)(life6_33)), ((float)(0x1.728p11f)), ((float)(0x1.728p11f)));
    life3_58 = spill434_0;
    if ((life3_58 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1704_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/iy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill638_0 = p0;
        life4_9 += 1;
        life5_44 = (spill638_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill638_1 = p0;
        life4_9 += 1;
        life5_76 = (spill638_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill638_2 = p0;
        life4_9 += 1;
        life5_91 = (spill638_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16690);
    if (((com.moon.iy.o)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.iy.p)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.iy.p)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/iy", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.iy.n)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.iy.o)[life5_8] = com.moon.iy.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.iy.o)[life5_8];
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.iy.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static void b(java.lang.String[] p0) {
l = ((java.lang.String[])(p0));
    return;
}


protected void c__Void() {
return;
}


public static java.lang.String[] a__ArrayString() {
return com.moon.iy.l;
}


public com.moon.iU a__iU() {
return this.k;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ffb62c56543ac63_originalDynamicSite1057_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ffb62c56543ac63_originalDynamicSite1057_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ffb62c56543ac63_originalDynamicSite1057_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1704_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic434_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic434_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic434_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic434_15(int a0, long a1) throws E;
}
