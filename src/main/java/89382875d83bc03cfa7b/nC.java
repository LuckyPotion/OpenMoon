package com.moon;


public class nC {

private static final net.minecraft.client.Minecraft a;

private static final net.kyori.adventure.text.minimessage.MiniMessage b;

private static final net.kyori.adventure.text.serializer.gson.GsonComponentSerializer c;

private static final long d;

private static final java.lang.String[] e;

private static final java.lang.String[] f;

private static final java.util.Map g;

public nC() {
super();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-2592848137592228168L)), ((long)(3594036311803519952L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(256829088391174L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.nC.d ^ 140435397858856L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill304_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill304_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill304_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill304_14 = new byte[8];
    (__sourceSpill304_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill304_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation304_16 = __sourceSpill304_14;
    ((javax.crypto.Cipher)(__sourceSpill304_11)).init(((int)(__sourceSpill304_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill304_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation304_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "mD0w\030NºáCÿ\016¯Ó\031á>\003y\034\017iUì=»&Ã-@céFÅ\016Ã´u[ÅJÜ\027èÆîÙù¿à\006b Îk\r<¬5éòñÁx1\001VRo8O4¢ú\b³õZÇ­ýÉphBûG\027ãH¨\031\027Î©ÆäÇ½F\"CNEAþÇô%3'7Mö~5¢ô¤ê\025äH\bè<ýBaó£%ew\rvÑ×ß\rIýva\036\023S ÑmzÀ=²Ù²\021·b2³j+½\t\003³lUê×¹Sü\004n0?ÄGñQ¼²²6\020j+l~Á²\020ß¹÷g\020M7ê\016:sÙ°ûý\nJã_\025ÖÕØë^\016¡"))).length();
    int local5_life24 = 96;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill304_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill304_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill304_29)).doFinal(((byte[])(__sourceSpill304_28)));
        java.lang.String __sourceSpill304_34 = ((java.lang.String)(com.moon.nC.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill304_35 = local9_life19;
        int __sourceSpill304_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill304_35)[__sourceSpill304_36] = __sourceSpill304_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    e = ((java.lang.String[])(local9_life19));
    f = ((java.lang.String[])(new java.lang.String[3]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
    b = ((net.kyori.adventure.text.minimessage.MiniMessage)(net.kyori.adventure.text.minimessage.MiniMessage.miniMessage()));
    c = ((net.kyori.adventure.text.serializer.gson.GsonComponentSerializer)(net.kyori.adventure.text.serializer.gson.GsonComponentSerializer.colorDownsamplingGson()));
}


public static void b(java.lang.String p0) {
long local1_life2 = (com.moon.nC.d ^ 92438267650469L);
    java.lang.String __stackOp185_5_0 = p0;
    java.lang.String __stackOp185_5_1 = __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite185_4(31559, (6225533114168451327L ^ local1_life2));
    java.lang.String local3_life7 = __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite185_6(__stackOp185_5_1, __stackOp185_5_0);
    ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__Void(((java.lang.Runnable)(__sourceIntrinsic_d1c1922d1ba0_originalDynamicSite185_9(local3_life7))));
    return;
}


public static void c(java.lang.String p0) {
long local1_life2 = (com.moon.nC.d ^ 14386532885622L);
    java.lang.String __stackOp186_5_0 = p0;
    java.lang.String __stackOp186_5_1 = __sourceIntrinsic_41b51cd99fcb_originalDynamicSite186_4(31811, (7309550416496681514L ^ local1_life2));
    java.lang.String local3_life7 = __sourceIntrinsic_41b51cd99fcb_originalDynamicSite186_6(__stackOp186_5_1, __stackOp186_5_0);
    ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__Void(((java.lang.Runnable)(__sourceIntrinsic_41b51cd99fcb_originalDynamicSite186_9(local3_life7))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23449);
    if (((com.moon.nC.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.nC.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.nC.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/nC", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.nC.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.nC.f)[life5_8] = com.moon.nC.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.nC.f)[life5_8];
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
        byte[] spill1312_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1312_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1312_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1312_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1312_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1312_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.nC.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2844_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a(java.lang.String p0) {
long local1_life2 = (com.moon.nC.d ^ 34947334114972L);
    java.lang.String __stackOp184_5_0 = p0;
    java.lang.String __stackOp184_5_1 = __sourceIntrinsic_474b89cf9bbb_originalDynamicSite184_4(20912, (653914267102143792L ^ local1_life2));
    java.lang.String local3_life7 = __sourceIntrinsic_474b89cf9bbb_originalDynamicSite184_6(__stackOp184_5_1, __stackOp184_5_0);
    ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__Void(((java.lang.Runnable)(__sourceIntrinsic_474b89cf9bbb_originalDynamicSite184_9(local3_life7))));
    return;
}


private static void lambda$chat$0(java.lang.String p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue1015_13_0;
    net.minecraft.client.entity.EntityPlayerSP spill1015_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_13: {
    life1_3 = (com.moon.nC.d ^ 36301583346978L);
    life3_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill1015_0 = ((net.minecraft.client.Minecraft)(com.moon.nC.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue1015_13_0 = spill1015_0;
        break forward_join_13;
    }
    if (!((spill1015_0 != null))) {
        break forward_join_21;
    }
    forwardValue1015_13_0 = ((net.minecraft.client.Minecraft)(com.moon.nC.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue1015_13_0)).a(((net.minecraft.util.IChatComponent)(net.minecraft.util.IChatComponent$Serializer.a(((java.lang.String)(((java.lang.String)(__sourceExactCall_0c43fdbdea2465(((net.kyori.adventure.text.serializer.gson.GsonComponentSerializer)(com.moon.nC.c)), ((net.kyori.adventure.text.Component)(__sourceExactCall_d4a0f4c0241b26(((net.kyori.adventure.text.minimessage.MiniMessage)(com.moon.nC.b)), ((java.lang.Object)(p0))))))))))))));
    }
    return;
}


private static void lambda$gateway$1(java.lang.String p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue1017_13_0;
    net.minecraft.client.entity.EntityPlayerSP spill1017_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_13: {
    life1_3 = (com.moon.nC.d ^ 53325445838273L);
    life3_5 = ((com.moon.aO.c()) ? 1 : 0);
    spill1017_0 = ((net.minecraft.client.Minecraft)(com.moon.nC.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue1017_13_0 = spill1017_0;
        break forward_join_13;
    }
    if (!((spill1017_0 != null))) {
        break forward_join_21;
    }
    forwardValue1017_13_0 = ((net.minecraft.client.Minecraft)(com.moon.nC.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue1017_13_0)).a(((net.minecraft.util.IChatComponent)(net.minecraft.util.IChatComponent$Serializer.a(((java.lang.String)(((java.lang.String)(__sourceExactCall_0c43fdbdea2465(((net.kyori.adventure.text.serializer.gson.GsonComponentSerializer)(com.moon.nC.c)), ((net.kyori.adventure.text.Component)(__sourceExactCall_d4a0f4c0241b26(((net.kyori.adventure.text.minimessage.MiniMessage)(com.moon.nC.b)), ((java.lang.Object)(p0))))))))))))));
    }
    return;
}


private static void lambda$chatRaw$2(java.lang.String p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue1016_13_0;
    net.minecraft.client.entity.EntityPlayerSP spill1016_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_13: {
    life1_3 = (com.moon.nC.d ^ 74131828078407L);
    life3_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill1016_0 = ((net.minecraft.client.Minecraft)(com.moon.nC.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue1016_13_0 = spill1016_0;
        break forward_join_13;
    }
    if (!((spill1016_0 != null))) {
        break forward_join_18;
    }
    forwardValue1016_13_0 = ((net.minecraft.client.Minecraft)(com.moon.nC.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue1016_13_0)).a(((net.minecraft.util.IChatComponent)(new moom.CM(p0))));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_originalDynamicSite184_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_originalDynamicSite184_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_474b89cf9bbb_originalDynamicSite184_9(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2844_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite185_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite185_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite185_9(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41b51cd99fcb_originalDynamicSite186_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41b51cd99fcb_originalDynamicSite186_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_41b51cd99fcb_originalDynamicSite186_9(java.lang.String a0) throws E;

private static native java.lang.Object __sourceExactCall_0c43fdbdea2465(net.kyori.adventure.text.serializer.gson.GsonComponentSerializer p0, net.kyori.adventure.text.Component p1);
private static native net.kyori.adventure.text.Component __sourceExactCall_d4a0f4c0241b26(net.kyori.adventure.text.minimessage.MiniMessage p0, java.lang.Object p1);
}
