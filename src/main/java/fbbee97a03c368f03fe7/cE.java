package com.moon;


public class cE {

private java.util.Map<java.lang.String, java.lang.String> a;

private static java.lang.String[] b;

private static long c;

private static java.lang.String d;

public cE() { super(); }


private static void __sourceConstructorBody_684a442e02d92d65(com.moon.cE receiver) throws Throwable {

long local1_life1 = (com.moon.cE.c ^ 52889174125634L);

    java.lang.String[] __sourceSpill13_3 = com.moon.cE.b();

    com.moon.cE.__sourceConstructorInit_684a442e02d92d65_0(((com.moon.cE)(receiver)));

    java.lang.String[] local3_life5 = __sourceSpill13_3;

    ((com.moon.cE)(receiver)).a = ((java.util.Map)(new java.util.HashMap()));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.cE.b(((java.lang.String[])(new java.lang.String[1])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_684a442e02d92d65_0(com.moon.cE a0) throws E;

static {
c = ((long)(((moom._a)(moom._c.a(((long)(-8004692044465938575L)), ((long)(-4761266552272654779L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(53147993025485L)))));
    java.lang.String[] __sourceSpill46_6 = new java.lang.String[1];
    long local0_life7 = (com.moon.cE.c ^ 72654787964662L);
    com.moon.cE.b(((java.lang.String[])(__sourceSpill46_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill46_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill46_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill46_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill46_15 = new byte[8];
    (__sourceSpill46_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill46_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation46_17 = __sourceSpill46_15;
    ((javax.crypto.Cipher)(__sourceSpill46_12)).init(((int)(__sourceSpill46_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill46_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation46_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill46_21 = ((java.lang.String)("{O£0«­Þ\004")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill46_22 = local2_life10;
    byte[] local4_life24 = ((javax.crypto.Cipher)(__sourceSpill46_22)).doFinal(((byte[])(__sourceSpill46_21)));
    d = ((java.lang.String)(((java.lang.String)(com.moon.cE.a(((byte[])(local4_life24))))).intern()));
}


public static void b(java.lang.String[] p0) {
b = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b() {
return com.moon.cE.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill112_0 = p0;
        life4_9 += 1;
        life5_44 = (spill112_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill112_1 = p0;
        life4_9 += 1;
        life5_76 = (spill112_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill112_2 = p0;
        life4_9 += 1;
        life5_91 = (spill112_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public java.util.Map<java.lang.String, java.lang.String> a__Map() {
return this.a;
}


public java.lang.String a() {
long life1_3;
    java.lang.StringBuilder life4_8;
    java.lang.String[] life3_9;
    life1_3 = (com.moon.cE.c ^ 136832326977440L);
    java.lang.String[] spill747_0 = com.moon.cE.b();
    life4_8 = new java.lang.StringBuilder();
    life3_9 = spill747_0;
    ((java.util.Map)(this.a)).forEach(((java.util.function.BiConsumer)(__sourceIntrinsic_63ef3276e4d3_invokedynamic747_3(life4_8))));
    java.lang.String spill747_1 = ((java.lang.String)(((java.lang.StringBuilder)(life4_8)).toString())).trim();
    if ((life3_9 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return spill747_1;
}


private static void lambda$parseAsHeader$0(java.lang.StringBuilder p0, java.lang.String p1, java.lang.String p2) {
long local3 = (com.moon.cE.c ^ 88362611712965L);
    ((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(p0)).append(((java.lang.String)(p1))))).append(((java.lang.String)("="))))).append(((java.lang.String)(p2))))).append(((java.lang.String)(com.moon.cE.d)));
    return;
}


private static native <E extends Throwable> java.util.function.BiConsumer __sourceIntrinsic_63ef3276e4d3_invokedynamic747_3(java.lang.StringBuilder a0) throws E;
}
