package com.moon;


public class pl extends net.minecraft.client.gui.GuiScreen {

private com.moon.nx w;

private com.moon.nB x;

private com.moon.module.impl.ClickGUI y;

private static long z;

private static java.lang.String[] A;

private static java.lang.String[] B;

private static java.util.Map C;

private static long D;

public pl() { super(); }


private static void __sourceConstructorBody_448260b9a9f1aabf(com.moon.pl receiver) throws Throwable {

long local1 = (com.moon.pl.z ^ 135002764987943L);

    com.moon.pl.__sourceConstructorInit_448260b9a9f1aabf_0(((com.moon.pl)(receiver)));

    ((com.moon.pl)(receiver)).w = ((com.moon.nx)(new com.moon.nx(new java.lang.String[] {__sourceIntrinsic_448260b9a9f1aabf_originalDynamicSite1515_2(9829, (2313079579108792810L ^ local1)), __sourceIntrinsic_448260b9a9f1aabf_originalDynamicSite1515_3(3583, (413678394613887606L ^ local1))}, __sourceIntrinsic_448260b9a9f1aabf_originalDynamicSite1515_4(9829, (2313079579108792810L ^ local1)))));

    return;

}



static {
z = ((long)(((moom._a)(moom._c.a(((long)(-4893019434018922037L)), ((long)(-1645842465858605196L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(197625836932056L)))));
    C = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.pl.z ^ 13105136965003L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill378_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill378_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill378_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill378_14 = new byte[8];
    (__sourceSpill378_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill378_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation378_16 = __sourceSpill378_14;
    ((javax.crypto.Cipher)(__sourceSpill378_11)).init(((int)(__sourceSpill378_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill378_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation378_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[6];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "²þÙäWE´ø£Z\016Í×³3\030Þ»þK5\000-\\;\tÂohYÖËºYãôï\033\020\032B\0323\031?$ýç\001µÆ)PÖ0n\026Ñc\022øRÙ{\022õ~3vób\023ze\032\037Ü\030\037ï\fÀ\013¤|£Y\013{I©W9¥ö^E°iAPAñ>F?ê¬.mvTg+z\017ÀÖoDÜFâQ"))).length();
    int local10_life24 = 16;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill378_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill378_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill378_29)).doFinal(((byte[])(__sourceSpill378_28)));
        java.lang.String __sourceSpill378_34 = ((java.lang.String)(com.moon.pl.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill378_35 = local14_life19;
        int __sourceSpill378_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill378_35)[__sourceSpill378_36] = __sourceSpill378_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "~ÏÖSÞ+;ä8\bK\037£\020\036û¡\022ì\030áËo~B\f¦«\nX"))).length();
    local10_life24 = 16;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill378_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill378_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill378_42)).doFinal(((byte[])(__sourceSpill378_41)));
        java.lang.String __sourceSpill378_47 = ((java.lang.String)(com.moon.pl.a(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill378_48 = local14_life19;
        int __sourceSpill378_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill378_48)[__sourceSpill378_49] = __sourceSpill378_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    A = ((java.lang.String[])(local14_life19));
    B = ((java.lang.String[])(new java.lang.String[6]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill378_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill378_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill378_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill378_59 = new byte[8];
    (__sourceSpill378_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill378_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation378_61 = __sourceSpill378_59;
    ((javax.crypto.Cipher)(__sourceSpill378_56)).init(((int)(__sourceSpill378_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill378_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation378_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = 2346187880516659231L;
    byte[] __sourceSpill378_65 = new byte[8];
    (__sourceSpill378_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill378_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill378_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill378_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill378_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill378_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill378_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill378_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill378_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill378_66)).doFinal(((byte[])(__sourceSpill378_65)));
    D = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_448260b9a9f1aabf_0(com.moon.pl a0) throws E;

protected void b(int p0, int p1, int p2) {
super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void c__Void() {
long local1 = (com.moon.pl.z ^ 77193795480931L);
    this.y = ((com.moon.module.impl.ClickGUI)(((com.moon.module.impl.ClickGUI)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.ClickGUI.class)))))));
    moom.ir local3 = com.moon.nS.a();
    int local4 = ((moom.ir)(local3)).a__Int();
    int local5 = ((moom.ir)(local3)).b__Int();
    float local6 = 0x1.a9p8f;
    float local7 = 0x1.45p8f;
    float local8 = ((((float) local4) / 0x1.0p1f) - (local6 / 0x1.0p1f));
    float local9 = ((((float) local5) / 0x1.0p1f) - (local7 / 0x1.0p1f));
    float local10 = 0x1.18p5f;
    this.x = ((com.moon.nB)(new com.moon.nB(local8, (local9 + local10), local6, (local7 - local10), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite618_10(15407, (3454924867967787238L ^ local1)), new com.moon.ny[] {new com.moon.nz(__sourceIntrinsic_7ac46ee229a8_originalDynamicSite618_11(9829, (2313030941572250286L ^ local1)), 0), new com.moon.nA(__sourceIntrinsic_7ac46ee229a8_originalDynamicSite618_12(10901, (3812791049418258009L ^ local1)), 1)})));
    super.c__Void();
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20414);
    if (((com.moon.pl.B)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.pl.C)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.pl.C)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/pl", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.pl.A)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.pl.B)[life5_8] = com.moon.pl.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.pl.B)[life5_8];
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
        byte[] spill1556_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1556_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1556_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1556_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1556_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1556_2)[life4_9];
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
    java.lang.String local7 = com.moon.pl.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3279_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, float p2) {
long life4_3;
    com.v life7_7;
    moom.ir life8_9;
    com.moon.jm life9_15;
    int life10_19;
    int life11_22;
    float life12_24;
    float life13_26;
    float life14_35;
    float life15_44;
    float life16_46;
    java.lang.String life17_56;
    com.moon.hW life18_79;
    com.moon.hW life19_86;
    com.moon.hW life20_91;
    com.moon.i3 life21_130;
    int life6_165;
    life4_3 = (com.moon.pl.z ^ 135693385050341L);
    life7_7 = ((com.moon.module.impl.ClickGUI)(this.y)).a__v();
    life8_9 = com.moon.nS.a();
    boolean spill1229_0 = com.moon.nx.b__Boolean();
    life9_15 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.ROBOTO_MEDIUM)));
    moom.kZ.l();
    life10_19 = ((moom.ir)(life8_9)).a__Int();
    life11_22 = ((moom.ir)(life8_9)).b__Int();
    life12_24 = 0x1.a9p8f;
    life13_26 = 0x1.45p8f;
    life14_35 = ((((float) life10_19) / 0x1.0p1f) - (life12_24 / 0x1.0p1f));
    life15_44 = ((((float) life11_22) / 0x1.0p1f) - (life13_26 / 0x1.0p1f));
    life16_46 = 0x1.18p5f;
    life17_56 = ((java.lang.String)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic1229_12(23022, (4350224136213119138L ^ life4_3)))).substring(((int)(0)), ((int)(((int) com.moon.pl.D))));
    ((com.moon.nx)(this.w)).a(((float)((life14_35 + (life12_24 / 0x1.0p1f)))));
    ((com.moon.nx)(this.w)).b(((float)((life15_44 + (life16_46 / 0x1.0p1f)))));
    life18_79 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life19_86 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life9_15))))).a();
    life20_91 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.GRADIENT))))).a();
    ((com.moon.hW)(life18_79)).a(((com.moon.iX)(com.moon.i3.a(((float)(life14_35)), ((float)(life15_44)), ((float)(life12_24)), ((float)(life13_26)), ((float)(0x1.8p3f)), ((int)(((com.v)(life7_7)).q()))))));
    ((com.moon.hW)(life18_79)).a(((com.moon.iX)(com.moon.i3.a(((float)(life14_35)), ((float)(life15_44)), ((float)(life12_24)), ((float)(life13_26)), ((float)(0x1.8p3f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(life7_7)).g()))).a(((float)(0x1.0p-1f))))).getRGB()))))));
    life21_130 = com.moon.i3.a(((float)(life14_35)), ((float)((life15_44 + life16_46))), ((float)(life12_24)), ((float)((life13_26 - life16_46))), ((float)(0x1.8p3f)), ((int)(((com.v)(life7_7)).q())));
    ((com.moon.i3)(life21_130)).e(((boolean)(false)));
    ((com.moon.hW)(life18_79)).a(((com.moon.iX)(life21_130)));
    ((com.moon.jm)(life9_15)).b(((com.moon.hW)(life19_86)), ((java.lang.String)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic1229_44(20894, (2452571774810704080L ^ life4_3)))), ((float)(0x1.cp3f)), ((float)((life14_35 + 0x1.4p3f))), ((float)((((life15_44 + (life16_46 / 0x1.0p1f)) - (((com.moon.jm)(life9_15)).a(((float)(0x1.cp3f))) / 0x1.0p1f)) + 0x1.8p0f))), ((int)(((com.v)(life7_7)).a())));
    life6_165 = ((spill1229_0) ? 1 : 0);
    ((com.moon.jm)(life9_15)).b(((com.moon.hW)(life19_86)), ((java.lang.String)(life17_56)), ((float)(0x1.6p3f)), ((float)((((life14_35 + life12_24) - ((com.moon.jm)(life9_15)).a(((java.lang.String)(life17_56)), ((float)(0x1.6p3f)))) - 0x1.4p3f))), ((float)((((life15_44 + (life16_46 / 0x1.0p1f)) - (((com.moon.jm)(life9_15)).a(((float)(0x1.8p3f))) / 0x1.0p1f)) + 0x1.8p0f))), ((int)(((com.v)(life7_7)).e())));
    ((com.moon.hW)(life18_79)).b();
    ((com.moon.hW)(life19_86)).b();
    ((com.moon.hW)(life20_91)).b();
    ((com.moon.nx)(this.w)).a(((com.v)(life7_7)), ((int)(p0)), ((int)(p1)));
    ((com.moon.nB)(this.x)).a(((java.lang.String)(((com.moon.nx)(this.w)).a__String())));
    ((com.moon.nB)(this.x)).a(((com.v)(life7_7)), ((int)(p0)), ((int)(p1)));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    if ((life6_165 == 0)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException {
((com.moon.nx)(this.w)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


protected void a(char p0, int p1) throws java.io.IOException {
super.a(((char)(p0)), ((int)(p1)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_448260b9a9f1aabf_originalDynamicSite1515_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_448260b9a9f1aabf_originalDynamicSite1515_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_448260b9a9f1aabf_originalDynamicSite1515_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_95e4e99d9b0c_invokedynamic1229_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_95e4e99d9b0c_invokedynamic1229_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3279_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite618_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite618_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite618_12(int a0, long a1) throws E;
}
