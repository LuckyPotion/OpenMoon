package com.moon;


public class bL extends sourcebuild.EnumConstructor<com.moon.bL> implements com.moon.l8 {

public static com.moon.bL GOLDEN_HEAD;

public static com.moon.bL AAA_RATED_STEAK;

public static com.moon.bL FRACTURED_SOUL;

public static com.moon.bL RAGE_POTATO;

private java.lang.String a;

private int b;

private java.util.function.BiPredicate<net.minecraft.client.Minecraft, net.minecraft.item.ItemStack> c;

private static com.moon.bL[] d;

private static long e;

private static java.lang.String[] f;

private static java.lang.String[] g;

private static java.util.Map h;

private bL(java.lang.String p0, int p1, java.lang.String p2, int p3, java.util.function.BiPredicate<net.minecraft.client.Minecraft, net.minecraft.item.ItemStack> p4) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
    this.c = p4;
}


private static void initialize() {
e = ((long)(((moom._a)(moom._c.a(((long)(-6510892178837915231L)), ((long)(-1063680077433162076L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(128300716355675L)))));
    long local20_life6 = (com.moon.bL.e ^ 107777512159053L);
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill20_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill20_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill20_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill20_14 = new byte[8];
    (__sourceSpill20_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill20_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation20_16 = __sourceSpill20_14;
    ((javax.crypto.Cipher)(__sourceSpill20_11)).init(((int)(__sourceSpill20_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill20_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation20_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[9];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "\026!r\026^ÇL-àÎ©8ö/WñòÉÓe1Á\030½\177®K»\"r&¢áx\006\fªÌ(â\034;æ\024\r\020ë8)Ô«o ·*£zÝ_àvó\030Âç²\023í9t0\020\006ÇkwyÌ\037:Sé\037\\\030O-«Í)ÌO\001Ã¾\004ä]2§Í\016Àb\013 ¹BZ9¥Lþê5wÖ~)K9\021õò¥°\017ì-9 má¤ÂDy®ÛZÿ\f9ën\007M\177èÇÒÙàìXÐª"))).length();
    int local14_life24 = 24;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill20_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill20_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill20_29)).doFinal(((byte[])(__sourceSpill20_28)));
        java.lang.String __sourceSpill20_34 = ((java.lang.String)(com.moon.bL.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill20_35 = local18_life19;
        int __sourceSpill20_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill20_35)[__sourceSpill20_36] = __sourceSpill20_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "ÌÑa²9x¨\001`Wo´Y\002fÉ\007\n\024¢\007\024Ú5¼¾³\030í­Û \005¨\001ïPâôÄûg´'´ÄwSI"))).length();
    local14_life24 = 32;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill20_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill20_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill20_42)).doFinal(((byte[])(__sourceSpill20_41)));
        java.lang.String __sourceSpill20_47 = ((java.lang.String)(com.moon.bL.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill20_48 = local18_life19;
        int __sourceSpill20_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill20_48)[__sourceSpill20_49] = __sourceSpill20_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    f = ((java.lang.String[])(local18_life19));
    g = ((java.lang.String[])(new java.lang.String[9]));
    javax.crypto.Cipher local1_life54;
    javax.crypto.Cipher __sourceSpill20_56 = (local1_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill20_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill20_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill20_59 = new byte[8];
    (__sourceSpill20_59)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local2_life60 = 1;
    while ((local2_life60 < 8)) {
        (__sourceSpill20_59)[local2_life60] = ((byte) ((int) ((local20_life6 << (local2_life60 * 8)) >>> 56)));
        local2_life60 += 1;
    }
    byte[] __sourcePreallocation20_61 = __sourceSpill20_59;
    ((javax.crypto.Cipher)(__sourceSpill20_56)).init(((int)(__sourceSpill20_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill20_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation20_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life64 = new long[4];
    int local4_life65 = 0;
    java.lang.String local5_life66;
    int local6_life68 = ((java.lang.String)((local5_life66 = "úTÑávBÍ\007®µLý\036#"))).length();
    int local3_life69 = 0;
    do {
        java.lang.String __sourceSpill20_70 = local5_life66;
        int __sourceSpill20_71 = local3_life69;
        local3_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill20_70)).substring(((int)(__sourceSpill20_71)), ((int)(local3_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill20_75 = local0_life64;
        int __sourceSpill20_76 = local4_life65;
        local4_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill20_78 = new byte[8];
        (__sourceSpill20_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill20_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill20_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill20_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill20_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill20_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill20_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill20_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill20_79 = local1_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill20_79)).doFinal(((byte[])(__sourceSpill20_78)));
        (__sourceSpill20_75)[__sourceSpill20_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local3_life69 >= local6_life68)));
    local6_life68 = ((java.lang.String)((local5_life66 = "u\006MÞð\023É¤\000Â\017\004\027©*"))).length();
    local3_life69 = 0;
    do {
        java.lang.String __sourceSpill20_83 = local5_life66;
        int __sourceSpill20_84 = local3_life69;
        local3_life69 += 8;
        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill20_83)).substring(((int)(__sourceSpill20_84)), ((int)(local3_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill20_88 = local0_life64;
        int __sourceSpill20_89 = local4_life65;
        local4_life65 += 1;
        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));
        byte[] __sourceSpill20_91 = new byte[8];
        (__sourceSpill20_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));
        (__sourceSpill20_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));
        (__sourceSpill20_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));
        (__sourceSpill20_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));
        (__sourceSpill20_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));
        (__sourceSpill20_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));
        (__sourceSpill20_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));
        (__sourceSpill20_91)[7] = ((byte) ((int) local8_life90));
        javax.crypto.Cipher __sourceSpill20_92 = local1_life54;
        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill20_92)).doFinal(((byte[])(__sourceSpill20_91)));
        (__sourceSpill20_88)[__sourceSpill20_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));
    } while ((!(local3_life69 >= local6_life68)));
    GOLDEN_HEAD = ((com.moon.bL)(new com.moon.bL(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_95(13035, (4662688375264348740L ^ local20_life6)), 0, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_96(31241, (204622269596680868L ^ local20_life6)), ((int) (local0_life64)[1]), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_97())));
    AAA_RATED_STEAK = ((com.moon.bL)(new com.moon.bL(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_99(11653, (7196376377824941349L ^ local20_life6)), 1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_100(28741, (4095458808890607852L ^ local20_life6)), ((int) (local0_life64)[3]), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_101())));
    FRACTURED_SOUL = ((com.moon.bL)(new com.moon.bL(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_103(20775, (1439190878894451087L ^ local20_life6)), 2, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_104(15230, (8117040308911178709L ^ local20_life6)), ((int) (local0_life64)[2]), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_105())));
    RAGE_POTATO = ((com.moon.bL)(new com.moon.bL(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_107(5875, (7222099045017595487L ^ local20_life6)), 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_108(21325, (5118178061470657507L ^ local20_life6)), ((int) (local0_life64)[0]), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_109())));
    d = ((com.moon.bL[])(com.moon.bL.a__ArraybL()));
}


public static com.moon.bL[] values() {
return ((com.moon.bL[])(((com.moon.bL[])(com.moon.bL.d)).clone()));
}


public static com.moon.bL valueOf(java.lang.String p0) {
return ((com.moon.bL)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bL.class)), ((java.lang.String)(p0)))));
}


private static com.moon.bL[] a__ArraybL() {
return new com.moon.bL[] {com.moon.bL.GOLDEN_HEAD, com.moon.bL.AAA_RATED_STEAK, com.moon.bL.FRACTURED_SOUL, com.moon.bL.RAGE_POTATO};
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
        byte[] spill52_0 = p0;
        life4_9 += 1;
        life5_44 = (spill52_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill52_1 = p0;
        life4_9 += 1;
        life5_76 = (spill52_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill52_2 = p0;
        life4_9 += 1;
        life5_91 = (spill52_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 22776);
    if (((com.moon.bL.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.bL.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.bL.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/bL", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.bL.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.bL.g)[life5_8] = com.moon.bL.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.bL.g)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.bL.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int a() {
return this.b;
}


public java.lang.String a__String() {
return this.a;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral676_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/bL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.util.function.BiPredicate<net.minecraft.client.Minecraft, net.minecraft.item.ItemStack> a__BiPredicate() {
return this.c;
}


private static boolean lambda$static$1(net.minecraft.client.Minecraft p0, net.minecraft.item.ItemStack p1) {
int forwardValue17_25_0;
    int forwardValue17_29_0;
    int forwardValue17_31_0;
    boolean spill17_0;
    boolean spill17_1;
    long life2_3;
    int life4_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_25: {
    forward_join_20: {
    life2_3 = (com.moon.bL.e ^ 71223537251073L);
    life4_5 = ((com.moon.po.c__Boolean()) ? 1 : 0);
    spill17_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(p0)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)));
    if (!((life4_5 != 0))) {
        forwardValue17_25_0 = ((spill17_0) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill17_0)) {
        break forward_join_20;
    }
    spill17_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(p0)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.n)));
    if (!((life4_5 != 0))) {
        forwardValue17_25_0 = ((spill17_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill17_1))) {
        break forward_join_30;
    }
    }
    forwardValue17_25_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(p0)).K)).b__sourceReturn_bc607678b6())), ((float)(0x1.3p4f)));
    }
    if (!((life4_5 != 0))) {
        forwardValue17_29_0 = forwardValue17_25_0;
        break forward_join_29;
    }
    if (!((forwardValue17_25_0 <= 0))) {
        break forward_join_30;
    }
    forwardValue17_29_0 = 1;
    }
    forwardValue17_31_0 = forwardValue17_29_0;
    break forward_join_31;
    }
    forwardValue17_31_0 = 0;
    }
    return ((forwardValue17_31_0) != 0);
}


private static boolean lambda$static$0(net.minecraft.client.Minecraft p0, net.minecraft.item.ItemStack p1) {
int forwardValue16_19_0;
    int forwardValue16_30_0;
    int forwardValue16_34_0;
    int forwardValue16_36_0;
    int spill16_0;
    long life2_3;
    int life4_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_30: {
    forward_join_19: {
    life2_3 = (com.moon.bL.e ^ 89613288934742L);
    life4_5 = ((com.moon.po.c__Boolean()) ? 1 : 0);
    spill16_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(p0)).K)).j__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    if (!((life4_5 != 0))) {
        forwardValue16_19_0 = spill16_0;
        break forward_join_19;
    }
    if (!((spill16_0 <= 0))) {
        break forward_join_35;
    }
    forwardValue16_19_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(p0)).K)).b__sourceReturn_bc607678b6())), ((float)(0x1.0p4f)));
    }
    if (!((life4_5 != 0))) {
        forwardValue16_30_0 = forwardValue16_19_0;
        break forward_join_30;
    }
    if (!((forwardValue16_19_0 <= 0))) {
        break forward_join_35;
    }
    forwardValue16_30_0 = ((((java.lang.String)(((net.minecraft.item.ItemStack)(p1)).b__String())).contains(((java.lang.CharSequence)(__sourceIntrinsic_fdc1dde174fc_invokedynamic16_10(3837, (2990112987770031180L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue16_34_0 = forwardValue16_30_0;
        break forward_join_34;
    }
    if (!((forwardValue16_30_0 == 0))) {
        break forward_join_35;
    }
    forwardValue16_34_0 = 1;
    }
    forwardValue16_36_0 = forwardValue16_34_0;
    break forward_join_36;
    }
    forwardValue16_36_0 = 0;
    }
    return ((forwardValue16_36_0) != 0);
}


private static boolean lambda$static$3(net.minecraft.client.Minecraft p0, net.minecraft.item.ItemStack p1) {
int forwardValue19_25_0;
    int forwardValue19_33_0;
    int forwardValue19_37_0;
    int forwardValue19_39_0;
    boolean spill19_0;
    boolean spill19_1;
    long life2_3;
    int life4_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_33: {
    forward_join_25: {
    forward_join_20: {
    life2_3 = (com.moon.bL.e ^ 136358540502029L);
    life4_5 = ((com.moon.po.c__Boolean()) ? 1 : 0);
    spill19_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(p0)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)));
    if (!((life4_5 != 0))) {
        forwardValue19_25_0 = ((spill19_0) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill19_0)) {
        break forward_join_20;
    }
    spill19_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(p0)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.n)));
    if (!((life4_5 != 0))) {
        forwardValue19_25_0 = ((spill19_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill19_1))) {
        break forward_join_38;
    }
    }
    forwardValue19_25_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(p0)).K)).b__sourceReturn_bc607678b6())), ((float)(0x1.2p4f)));
    }
    if (!((life4_5 != 0))) {
        forwardValue19_33_0 = forwardValue19_25_0;
        break forward_join_33;
    }
    if (!((forwardValue19_25_0 <= 0))) {
        break forward_join_38;
    }
    forwardValue19_33_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(p0)).K)).j__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != 0))) {
        forwardValue19_37_0 = forwardValue19_33_0;
        break forward_join_37;
    }
    if (!((forwardValue19_33_0 <= 0))) {
        break forward_join_38;
    }
    forwardValue19_37_0 = 1;
    }
    forwardValue19_39_0 = forwardValue19_37_0;
    break forward_join_39;
    }
    forwardValue19_39_0 = 0;
    }
    return ((forwardValue19_39_0) != 0);
}


private static boolean lambda$static$2(net.minecraft.client.Minecraft p0, net.minecraft.item.ItemStack p1) {
int forwardValue18_19_0;
    int forwardValue18_23_0;
    int forwardValue18_25_0;
    int spill18_0;
    long life2_3;
    int life4_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life2_3 = (com.moon.bL.e ^ 57673736342317L);
    life4_5 = ((com.moon.po.c__Boolean()) ? 1 : 0);
    spill18_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(p0)).K)).j__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    if (!((life4_5 != 0))) {
        forwardValue18_19_0 = spill18_0;
        break forward_join_19;
    }
    if (!((spill18_0 <= 0))) {
        break forward_join_24;
    }
    forwardValue18_19_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(p0)).K)).b__sourceReturn_bc607678b6())), ((float)(0x1.8p3f)));
    }
    if (!((life4_5 != 0))) {
        forwardValue18_23_0 = forwardValue18_19_0;
        break forward_join_23;
    }
    if (!((forwardValue18_19_0 <= 0))) {
        break forward_join_24;
    }
    forwardValue18_23_0 = 1;
    }
    forwardValue18_25_0 = forwardValue18_23_0;
    break forward_join_25;
    }
    forwardValue18_25_0 = 0;
    }
    return ((forwardValue18_25_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_95(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_96(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.BiPredicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_97() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_99(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_100(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.BiPredicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_101() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_103(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_104(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.BiPredicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_105() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_107(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_108(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.BiPredicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite20_109() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral676_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fdc1dde174fc_invokedynamic16_10(int a0, long a1) throws E;
}
