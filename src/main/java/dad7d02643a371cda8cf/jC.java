package com.moon;


public class jC extends com.moon.jA {

private static final java.util.HashMap<com.moon.jD, com.moon.jE> c;

private static final java.util.HashMap<com.moon.jD, com.moon.jE> d;

private final float e;

private final float f;

private final float g;

private final float i;

private static int j;

private static final long h;

private static final java.lang.String[] k;

private static final java.lang.String[] l;

private static final java.util.Map m;

private jC(float p0, float p1, float p2, float p3) {
super();
    this.e = p0;
    this.f = p1;
    this.g = p2;
    this.i = p3;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-2277593276685689103L)), ((long)(174595847755252057L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(93330120504356L)))));
    int __sourceSpill181_6 = 0;
    m = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.jC.b(((int)(__sourceSpill181_6)));
    long local0_life9 = (com.moon.jC.h ^ 48282979053948L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill181_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill181_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill181_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill181_16 = new byte[8];
    (__sourceSpill181_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill181_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation181_18 = __sourceSpill181_16;
    ((javax.crypto.Cipher)(__sourceSpill181_13)).init(((int)(__sourceSpill181_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill181_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation181_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[2];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "ÙFðÚêF\013û0ñ°½-¹môÚòuäµB*«K}fm¥÷uöÄxo\030[[a'­²Ò­g->\022b*úwñ"))).length();
    int local5_life26 = 40;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill181_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill181_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill181_31)).doFinal(((byte[])(__sourceSpill181_30)));
        java.lang.String __sourceSpill181_36 = ((java.lang.String)(com.moon.jC.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill181_37 = local9_life21;
        int __sourceSpill181_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill181_37)[__sourceSpill181_38] = __sourceSpill181_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    k = ((java.lang.String[])(local9_life21));
    l = ((java.lang.String[])(new java.lang.String[2]));
    c = ((java.util.HashMap)(new java.util.HashMap()));
    d = ((java.util.HashMap)(new java.util.HashMap()));
}


public static int b__sourceReturn_8abf5c6871() {
int local0 = com.moon.jC.a();
    if ((local0 == 0)) {
        return 122;
    }
    return 0;
}


public static void b(int p0) {
com.moon.jC.j = ((int)(p0));
    return;
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
        byte[] spill779_0 = p0;
        life4_9 += 1;
        life5_44 = (spill779_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill779_1 = p0;
        life4_9 += 1;
        life5_76 = (spill779_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill779_2 = p0;
        life4_9 += 1;
        life5_91 = (spill779_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static int a() {
return com.moon.jC.j;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1874_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_e2462206036f44(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7262);
    if (((com.moon.jC.l)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jC.m)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jC.m)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jC", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jC.k)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jC.l)[life5_8] = __sourceExactCall_1ec43043b79cca(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jC.l)[life5_8];
}


public static com.moon.jC a(float p0, float p1, float p2, float p3) {
return new com.moon.jC(p0, p1, p2, p3);
}


public void a__Void() {
java.lang.Object local1 = ((com.moon.jE)(((java.util.HashMap)(com.moon.jC.d)).get(((java.lang.Object)(((com.moon.jC)(this)).a)))));
    ((com.moon.jD)(((com.moon.jC)(this)).a)).a__Void();
    ((com.moon.jE)(local1)).a__Void(((int)(0)));
    org.lwjgl.opengl.GL20.glUseProgram(((int)(0)));
    return;
}


public void a(float p0, float p1) {
long life3_3;
    float life6_23;
    float life7_31;
    float life8_36;
    float life9_44;
    com.moon.jE life10_50;
    com.moon.jE life11_56;
    int life5_66;
    life3_3 = (com.moon.jC.h ^ 9594520663192L);
    ((java.util.HashMap)(com.moon.jC.c)).computeIfAbsent(((java.lang.Object)(((com.moon.jC)(this)).a)), ((java.util.function.Function)(__sourceIntrinsic_9229ce90378e_invokedynamic1598_3(this))));
    ((java.util.HashMap)(com.moon.jC.d)).computeIfAbsent(((java.lang.Object)(((com.moon.jC)(this)).a)), ((java.util.function.Function)(__sourceIntrinsic_9229ce90378e_invokedynamic1598_7(this))));
    int spill1598_0 = __sourceExactCall_a6edf96e0f7348();
    life6_23 = (this.e / p0);
    life7_31 = ((this.e + this.g) / p0);
    life8_36 = (this.f / p1);
    life9_44 = ((this.f + this.i) / p1);
    life10_50 = ((com.moon.jE)(((java.util.HashMap)(com.moon.jC.c)).get(((java.lang.Object)(((com.moon.jC)(this)).a)))));
    life11_56 = ((com.moon.jE)(((java.util.HashMap)(com.moon.jC.d)).get(((java.lang.Object)(((com.moon.jC)(this)).a)))));
    ((com.moon.jE)(life10_50)).a(((float)(life6_23)), ((float)(life8_36)), ((float)(life7_31)), ((float)(life9_44)));
    ((com.moon.jE)(life11_56)).a__Void(((int)(1)));
    life5_66 = spill1598_0;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        life5_66 += 1;
        com.moon.jC.b(((int)(life5_66)));
    }
    return;
}


private com.moon.jD lambda$apply$0() {
return ((com.moon.jC)(this)).a;
}


private com.moon.jE lambda$apply$1(com.moon.jD p0) {
long local2 = (com.moon.jC.h ^ 78187871995141L);
    com.moon.jE local4 = ((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_0105eeef81f3_originalDynamicSite424_2(1708, (895402658127372698L ^ local2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_0105eeef81f3_originalDynamicSite424_4(this)))))).a();
    ((com.moon.jE)(local4)).a__Void();
    return local4;
}


private com.moon.jE lambda$apply$3(com.moon.jD p0) {
long local2 = (com.moon.jC.h ^ 49179255211430L);
    com.moon.jE local4 = ((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_966ad018ea26_originalDynamicSite425_2(18081, (1030909966260543797L ^ local2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_966ad018ea26_originalDynamicSite425_4(this)))))).a();
    ((com.moon.jE)(local4)).a__Void();
    return local4;
}


private com.moon.jD lambda$apply$2() {
return ((com.moon.jC)(this)).a;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1874_0() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_9229ce90378e_invokedynamic1598_3(com.moon.jC a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_9229ce90378e_invokedynamic1598_7(com.moon.jC a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0105eeef81f3_originalDynamicSite424_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_0105eeef81f3_originalDynamicSite424_4(com.moon.jC a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_966ad018ea26_originalDynamicSite425_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_966ad018ea26_originalDynamicSite425_4(com.moon.jC a0) throws E;

private static native java.lang.String __sourceExactCall_e2462206036f44(int p0, long p1);
private static native java.lang.String __sourceExactCall_1ec43043b79cca(byte[] p0);
private static native int __sourceExactCall_a6edf96e0f7348();
}
