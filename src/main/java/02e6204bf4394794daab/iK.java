package com.moon;


public class iK extends com.moon.iw {

private com.moon.iU k;

protected com.moon.jE l;

protected com.moon.jE m;

protected com.moon.jE n;

protected com.moon.jE o;

protected com.moon.jE p;

private static int q;

private static long r;

private static java.lang.String[] s;

private static java.lang.String[] t;

private static java.util.Map u;

public iK() { super(); }


private static void __sourceConstructorBody_3ff5a3e516152ade(com.moon.iK receiver) throws Throwable {

long local1 = (com.moon.iK.r ^ 15985239892657L);

    com.moon.iK.__sourceConstructorInit_3ff5a3e516152ade_0(((com.moon.iK)(receiver)));

    ((com.moon.iK)(receiver)).k = ((com.moon.iU)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(com.moon.iU.a__iV())).a(((java.lang.Class)(com.moon.i5.class))))).a(((java.lang.String)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_5(32123, (6002659423923808224L ^ local1))))))).c(((java.lang.String)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_7(20992, (3640386952094255257L ^ local1))))))).b(((java.lang.String)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_9(20992, (3640386952094255257L ^ local1))))))).a()));

    ((com.moon.iK)(receiver)).l = ((com.moon.jE)(((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_14(6432, (8093244024725685176L ^ local1))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_16(receiver)))))).a()));

    ((com.moon.iK)(receiver)).m = ((com.moon.jE)(((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_21(9799, (4512707272321105113L ^ local1))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_23(receiver)))))).a()));

    ((com.moon.iK)(receiver)).n = ((com.moon.jE)(((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_28(3327, (18379850355103333L ^ local1))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_30(receiver)))))).a()));

    ((com.moon.iK)(receiver)).o = ((com.moon.jE)(((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_35(19510, (2520331310142494377L ^ local1))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_37(receiver)))))).a()));

    ((com.moon.iK)(receiver)).p = ((com.moon.jE)(((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_42(24287, (3971332768714916930L ^ local1))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_44(receiver)))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3ff5a3e516152ade_0(com.moon.iK a0) throws E;

static {
r = ((long)(((moom._a)(moom._c.a(((long)(3487580396436508911L)), ((long)(-4227986276395426519L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(76805549338098L)))));

    int __sourceSpill236_6 = 0;

    u = ((java.util.Map)(new java.util.HashMap(13)));

    com.moon.iK.b(((int)(__sourceSpill236_6)));

    long local0_life9 = (com.moon.iK.r ^ 106483834255505L);

    javax.crypto.Cipher local2_life11;

    javax.crypto.Cipher __sourceSpill236_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill236_14 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill236_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill236_16 = new byte[8];

    (__sourceSpill236_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));

    int local3_life17 = 1;

    while ((local3_life17 < 8)) {

        (__sourceSpill236_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));

        local3_life17 += 1;

    }

    byte[] __sourcePreallocation236_18 = __sourceSpill236_16;

    ((javax.crypto.Cipher)(__sourceSpill236_13)).init(((int)(__sourceSpill236_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill236_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation236_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life21 = new java.lang.String[7];

    int local7_life22 = 0;

    java.lang.String local6_life23;

    int local8_life25 = ((java.lang.String)((local6_life23 = "Ö\021\013Lºf]RÎDÑ~º\001Èî\030bí_+uB_¿ãºÇªgSæµk\025'f\020Ï ôê$Ü(»z\027¯'\007D²\020¹Ùµu\032ärg\r\"ÂÉ\t&\020°¹\020TèuïH¼7?"))).length();

    int local5_life26 = 16;

    int local4_life27 = -1;

    while (true) {

        local4_life27 += 1;

        byte[] __sourceSpill236_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill236_31 = local2_life11;

        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill236_31)).doFinal(((byte[])(__sourceSpill236_30)));

        java.lang.String __sourceSpill236_36 = ((java.lang.String)(com.moon.iK.b(((byte[])(local10_life33))))).intern();

        java.lang.String[] __sourceSpill236_37 = local9_life21;

        int __sourceSpill236_38 = local7_life22;

        local7_life22 += 1;

        (__sourceSpill236_37)[__sourceSpill236_38] = __sourceSpill236_36;

        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }

        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));

    }

    local8_life25 = ((java.lang.String)((local6_life23 = "\003\022@ÉÒh\000AeÑÿ*£¹Gô\0261ò\001Wº,v(}GT\030Pr*#¶Y\017ÿâÂÜ ¯Öðæ¡8\017'"))).length();

    local5_life26 = 32;

    local4_life27 = -1;

    while (true) {

        local4_life27 += 1;

        byte[] __sourceSpill236_44 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill236_45 = local2_life11;

        byte[] local10_life47 = ((javax.crypto.Cipher)(__sourceSpill236_45)).doFinal(((byte[])(__sourceSpill236_44)));

        java.lang.String __sourceSpill236_50 = ((java.lang.String)(com.moon.iK.b(((byte[])(local10_life47))))).intern();

        java.lang.String[] __sourceSpill236_51 = local9_life21;

        int __sourceSpill236_52 = local7_life22;

        local7_life22 += 1;

        (__sourceSpill236_51)[__sourceSpill236_52] = __sourceSpill236_50;

        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }

        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));

    }

    s = ((java.lang.String[])(local9_life21));

    t = ((java.lang.String[])(new java.lang.String[7]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1604_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/iK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static int b__sourceReturn_8abf5c6871() {
int local0 = __sourceExactCall_44b6fb0be0eda8();
    if ((local0 == 0)) {
        return 91;
    }
    return 0;
}


public static void b(int p0) {
q = ((int)(p0));
    return;
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.iK.b(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27175);
    if (((com.moon.iK.t)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.iK.u)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.iK.u)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/iK", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.iK.s)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.iK.t)[life5_8] = com.moon.iK.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.iK.t)[life5_8];
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
        byte[] spill599_0 = p0;
        life4_9 += 1;
        life5_44 = (spill599_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill599_1 = p0;
        life4_9 += 1;
        life5_76 = (spill599_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill599_2 = p0;
        life4_9 += 1;
        life5_91 = (spill599_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b__Void() {
((com.moon.jE)(this.l)).a__Void();
    ((com.moon.jE)(this.n)).a__Void();
    ((com.moon.jE)(this.o)).a__Void();
    ((com.moon.jE)(this.m)).a__Void();
    ((com.moon.jE)(this.p)).a__Void();
    return;
}


public com.moon.jE e() {
return this.n;
}


public com.moon.jE c() {
return this.l;
}


protected void c__Void() {
return;
}


public com.moon.jE f() {
return this.o;
}


public com.moon.jE d__sourceReturn_2220af9394() {
return this.m;
}


public static int a__sourceReturn_8abf5c6871() {
return com.moon.iK.q;
}


public com.moon.iU a__iU() {
return this.k;
}


public void a(com.moon.hY p0) {
long life2_3;
    com.moon.iv life5_7;
    int life4_16;
    life2_3 = (com.moon.iK.r ^ 17106419976375L);
    int spill1372_0 = __sourceExactCall_44b6fb0be0eda8();
    life5_7 = ((com.moon.hY)(p0)).a__iv();
    ((com.moon.iv)(((com.moon.iv)(life5_7)).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    life4_16 = spill1372_0;
    ((com.moon.iv)(((com.moon.iv)(life5_7)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    ((com.moon.iv)(((com.moon.iv)(life5_7)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((com.moon.iv)(((com.moon.iv)(life5_7)).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f))))).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    ((com.moon.hY)(p0)).b(((int)(4)));
    super.a(((com.moon.hY)(p0)));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        life4_16 += 1;
        com.moon.iK.b(((int)(life4_16)));
    }
    return;
}


public com.moon.jE g() {
return this.p;
}


private com.moon.jD lambda$new$0() {
return this.g;
}


private com.moon.jD lambda$new$1() {
return this.g;
}


private com.moon.jD lambda$new$3() {
return this.g;
}


private com.moon.jD lambda$new$2() {
return this.g;
}


private com.moon.jD lambda$new$4() {
return this.g;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_16(com.moon.iK a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_23(com.moon.iK a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_30(com.moon.iK a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_37(com.moon.iK a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3ff5a3e516152ade_originalDynamicSite1019_44(com.moon.iK a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1604_0() throws E;

private static native int __sourceExactCall_44b6fb0be0eda8();
}
