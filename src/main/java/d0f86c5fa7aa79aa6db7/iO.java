package com.moon;


public class iO extends com.moon.iw {

private com.moon.iU k;

protected com.moon.jE l;

private static boolean m;

private static long n;

private static java.lang.String[] o;

private static java.lang.String[] p;

private static java.util.Map q;

public iO() { super(); }


private static void __sourceConstructorBody_55ad1827de9cccff(com.moon.iO receiver) throws Throwable {

long local1 = (com.moon.iO.n ^ 80093689275626L);

    com.moon.iO.__sourceConstructorInit_55ad1827de9cccff_0(((com.moon.iO)(receiver)));

    ((com.moon.iO)(receiver)).k = ((com.moon.iU)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(com.moon.iU.a__iV())).a(((java.lang.Class)(com.moon.i3.class))))).a(((java.lang.String)(__sourceIntrinsic_55ad1827de9cccff_originalDynamicSite1027_5(31976, (2163927893880591855L ^ local1))))))).c(((java.lang.String)(__sourceIntrinsic_55ad1827de9cccff_originalDynamicSite1027_7(29199, (8147983871232465673L ^ local1))))))).b(((java.lang.String)(__sourceIntrinsic_55ad1827de9cccff_originalDynamicSite1027_9(29199, (8147983871232465673L ^ local1))))))).a()));

    ((com.moon.iO)(receiver)).l = ((com.moon.jE)(((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_55ad1827de9cccff_originalDynamicSite1027_14(2438, (1102252613384282242L ^ local1))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_55ad1827de9cccff_originalDynamicSite1027_16(receiver)))))).a()));

    return;

}



static {
n = ((long)(((moom._a)(moom._c.a(((long)(7445996048104635373L)), ((long)(-6016166928560556536L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(133583165685353L)))));
    int __sourceSpill165_6 = 1;
    q = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.iO.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill165_6))));
    long local0_life9 = (com.moon.iO.n ^ 28219810126258L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill165_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill165_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill165_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill165_16 = new byte[8];
    (__sourceSpill165_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill165_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation165_18 = __sourceSpill165_16;
    ((javax.crypto.Cipher)(__sourceSpill165_13)).init(((int)(__sourceSpill165_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill165_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation165_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[3];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "\f()á°ù8£Oz;oÕ¦Ê¸&I~¹£äÎ3Ð«\026¶\034¡ìûÒ(ê\004\000m\036\007_­­,uµ[T\035°\b(öé%\001p]y\0273\027Lû\020±+\037\005\030óTL¢J(÷Ìäl¸\002^£9-à×k"))).length();
    int local5_life26 = 40;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill165_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill165_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill165_31)).doFinal(((byte[])(__sourceSpill165_30)));
        java.lang.String __sourceSpill165_36 = ((java.lang.String)(com.moon.iO.b(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill165_37 = local9_life21;
        int __sourceSpill165_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill165_37)[__sourceSpill165_38] = __sourceSpill165_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    o = ((java.lang.String[])(local9_life21));
    p = ((java.lang.String[])(new java.lang.String[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_55ad1827de9cccff_0(com.moon.iO a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static boolean b__Boolean() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.iO.a__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1618_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/iO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill603_0 = p0;
        life4_9 += 1;
        life5_44 = (spill603_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill603_1 = p0;
        life4_9 += 1;
        life5_76 = (spill603_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill603_2 = p0;
        life4_9 += 1;
        life5_91 = (spill603_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23318);
    if (((com.moon.iO.p)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.iO.q)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.iO.q)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/iO", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.iO.o)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.iO.p)[life5_8] = com.moon.iO.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.iO.p)[life5_8];
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.iO.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static void b(boolean p0) {
m = ((boolean)(p0));
    return;
}


protected void b__Void() {
((com.moon.jE)(this.l)).a__Void();
    return;
}


protected void c__Void() {
long local1 = (com.moon.iO.n ^ 5524204649442L);
    boolean spill1396_0 = com.moon.iO.b__Boolean();
    ((com.moon.jE)(this.l)).a(((float)((0x1.666666p-1f / ((float) ((moom.ir)(com.moon.nS.a())).c())))));
    boolean local3 = spill1396_0;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.iO.b(((boolean)__sourceIntrinsic_integerToBoolean(((local3 ? 0 : 1)))));
    }
    return;
}


public com.moon.jE c() {
return this.l;
}


public static boolean a__Boolean() {
return ((((com.moon.iO.m) ? 1 : 0)) != 0);
}


public com.moon.iU a__iU() {
return this.k;
}


private com.moon.jD lambda$new$0() {
return this.g;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55ad1827de9cccff_originalDynamicSite1027_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55ad1827de9cccff_originalDynamicSite1027_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55ad1827de9cccff_originalDynamicSite1027_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55ad1827de9cccff_originalDynamicSite1027_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_55ad1827de9cccff_originalDynamicSite1027_16(com.moon.iO a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1618_0() throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
