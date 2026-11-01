package com.moon.module.impl;


public class Speed extends com.moon.module.Module {

private com.moon.setting.EnumSetting<com.moon.bw> s;

private com.moon.setting.BooleanSetting t;

public com.moon.setting.BooleanSetting u;

public com.moon.setting.FloatSetting v;

private com.moon.setting.ModeSetting<com.moon.bx> w;

private com.moon.setting.BooleanSetting x;

private com.moon.setting.BooleanSetting y;

private com.moon.setting.FloatSetting z;

public com.moon.setting.BooleanSetting A;

public com.moon.setting.FloatSetting B;

public com.moon.setting.BooleanSetting C;

public com.moon.setting.FloatSetting D;

private static long E;

private static java.lang.String[] F;

private static java.lang.String[] G;

private static java.util.Map H;

public Speed(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_024beae218ed00f3(com.moon.module.impl.Speed receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life1 = (com.moon.module.impl.Speed.E ^ 17151601967322L);

    int[] __sourceSpill211_3 = com.moon.bx.b();

    com.moon.module.impl.Speed.__sourceConstructorInit_024beae218ed00f3_0(((com.moon.module.impl.Speed)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Speed)(receiver)).s = ((com.moon.setting.EnumSetting)(((com.moon.mg)(((com.moon.mg)(com.moon.setting.EnumSetting.builder(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_5(9332, (3155678199226707288L ^ local5_life1)))), ((java.lang.Class)(com.moon.bw.class)), ((com.moon.module.Module)(receiver))))).a(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_8(13076, (5489293779854309947L ^ local5_life1)))), ((java.lang.Enum)(com.moon.bw.VANILLA))))).a()));

    ((com.moon.module.impl.Speed)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_13(30255, (3485286671687647001L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_15(19681, (549068101888525764L ^ local5_life1)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_17(receiver)))))).a()));

    ((com.moon.module.impl.Speed)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_21(24690, (8584865972001270104L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_23(18257, (90743630311902842L ^ local5_life1)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_25(receiver)))))).a()));

    ((com.moon.module.impl.Speed)(receiver)).v = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_29(28371, (2742537699153143796L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_31(9615, (4771239855543069887L ^ local5_life1)))), ((float)(0x1.4p1f)), ((float)(0x1.0p0f)), ((float)(0x1.8p1f)), ((float)(0x1.0p-2f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_33(receiver)))))).a()));

    ((com.moon.module.impl.Speed)(receiver)).w = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_37(27708, (4347020762623501598L ^ local5_life1)))), ((java.lang.Class)(com.moon.bx.class))))).a(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_40(32020, (5408894270207783984L ^ local5_life1)))), ((java.lang.Enum)(com.moon.bx.HOP))))).a(((java.util.function.Supplier)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_43(receiver)))))).a()));

    ((com.moon.module.impl.Speed)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_47(24995, (7944400930420746390L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_49(12390, (7135889535000164672L ^ local5_life1)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_51(receiver)))))).a()));

    ((com.moon.module.impl.Speed)(receiver)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_55(9845, (782141910530830166L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_57(24318, (487383256760604639L ^ local5_life1)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_59(receiver)))))).a()));

    ((com.moon.module.impl.Speed)(receiver)).z = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_63(6206, (5710895606888239373L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_65(15035, (3427708161107997583L ^ local5_life1)))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.4p3f)), ((float)(0x1.0p-2f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_67(receiver)))))).a()));

    ((com.moon.module.impl.Speed)(receiver)).A = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_71(16239, (3804102894200174151L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_73(15473, (4172212399262774592L ^ local5_life1)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_75(receiver)))))).a()));

    ((com.moon.module.impl.Speed)(receiver)).B = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_79(8836, (2128925653653760937L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_81(17432, (8690796341112065336L ^ local5_life1)))), ((float)(0x1.4p1f)), ((float)(0x1.0p0f)), ((float)(0x1.8p1f)), ((float)(0x1.0p-2f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_83(receiver)))))).a()));

    ((com.moon.module.impl.Speed)(receiver)).C = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_87(1860, (6269107181098634867L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_89(17063, (8110026184934443913L ^ local5_life1)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_91(receiver)))))).a()));

    ((com.moon.module.impl.Speed)(receiver)).D = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_95(21604, (3853229978400251222L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_97(16787, (5097371458619132090L ^ local5_life1)))), ((float)(0x1.0p-1f)), ((float)(0x1.99999ap-4f)), ((float)(0x1.4p3f)), ((float)(0x1.99999ap-4f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_99(receiver)))))).a()));

    int[] local7_life103 = __sourceSpill211_3;

    if ((local7_life103 != null)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_024beae218ed00f3_0(com.moon.module.impl.Speed a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
E = ((long)(((moom._a)(moom._c.a(((long)(-2518322882203686828L)), ((long)(5038038596552013396L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(68566648998105L)))));

    H = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.module.impl.Speed.E ^ 45553673831258L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill387_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill387_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill387_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill387_14 = new byte[8];

    (__sourceSpill387_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill387_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation387_16 = __sourceSpill387_14;

    ((javax.crypto.Cipher)(__sourceSpill387_11)).init(((int)(__sourceSpill387_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill387_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation387_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[24];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "[s*Or0¦l-\"ëêrÑ½3a<y\027\\­ÿs××ªæQ\037e`ùå\037\030?!¹î\037Cþ´²\r±z\023]+¢=¼EÌ Y_U\026x\033JuKn66ô{Çª¨þGJ\037T¬ èP\\ØC9ï\004î.1¬S\tß×d#,D4ð0\001\004P&\177± ÌÌ°;¸ze¿\rÂßÿon6©\bþ¸wýå7X µ(W Ò³æü@oö7Öhò\032 í­ÐÃÕõ[òY\nB¬¶WÍ\017\0042M\033\020KòÅ¬ çÞ9\0137\016Z0@(wa\022&ü6 s´nöBõ@¡ì¥þ7.ëÚÚõZöZz_?×; d6½(\\]Üü¦¡\027¦|O¤ £L\023EÎWA\t\031iÓ\016(£Æûç®\000ì¹iVhj\020çhÄ&¸SÑ®ÇÈó\027Ï¶Ê\030\032¿Qà\034¿g\017Öú·\007¢Ìø±áþ\030»\"\177g&HÕ\"º£\0256ÓÕ2!üF\177¹\034\0200{\000]PW\016½»\0338*¡R\\\005Zÿu^\004½%(.¾\024üÓ\005ß×}\"3÷ÑÍÈJ\021Ï\037Ç=Ä®Ú\ru+ùOÌ(oý#ï\020ÒÞAS®R3çù³]?[\037À\020.pÐ¨Z^ø¿\020Ýdµ±Ù(§ô)Ë.IÞ¥OÏ4ÊÖýÕÃP=,Z¶Ù}e\032¦Ëo×\034.¶§3: \024©±ÿöpW·Ou¶À¦ÆÄ«_mðê®\024ÿé^Ðic Â\004iD#µ(\022xA¹Gþ{-,TL÷\022uRÍ(þf's\026[|µ²\177+a\037Â^l%ëâ%kúíZ®x¿NM¸ÒT-\b­(uY»b[æãm 4µisp¶\005\017=\016pèöX¥ñ\035øRwÏ>«à_R\005XT \"r6Ö8¼ÂGðJLqX«\020\000©r\000j\026öü%Û\003W³"))).length();

    int local5_life24 = 40;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill387_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill387_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill387_29)).doFinal(((byte[])(__sourceSpill387_28)));

        java.lang.String __sourceSpill387_34 = ((java.lang.String)(com.moon.module.impl.Speed.c(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill387_35 = local9_life19;

        int __sourceSpill387_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill387_35)[__sourceSpill387_36] = __sourceSpill387_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "Jüiÿ\035B'#ëKã+Q[Ú%]ß»þ¢\035c¥VÆ²EtH [{æðú QÏ<Èã½FAL*º}1Ù©÷Ë'ÛV\177øÜ8e®qb¸X±"))).length();

    local5_life24 = 40;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill387_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill387_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill387_43)).doFinal(((byte[])(__sourceSpill387_42)));

        java.lang.String __sourceSpill387_48 = ((java.lang.String)(com.moon.module.impl.Speed.c(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill387_49 = local9_life19;

        int __sourceSpill387_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill387_49)[__sourceSpill387_50] = __sourceSpill387_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    F = ((java.lang.String[])(local9_life19));

    G = ((java.lang.String[])(new java.lang.String[24]));
}


public com.moon.setting.BooleanSetting b() {
return this.u;
}


public com.moon.setting.FloatSetting b__kZ() {
return this.z;
}


public com.moon.setting.BooleanSetting e() {
return this.A;
}


public com.moon.setting.FloatSetting c__kZ() {
return this.B;
}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 22076);
    if (((com.moon.module.impl.Speed.G)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Speed.H)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Speed.H)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ls", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Speed.F)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Speed.G)[life5_8] = com.moon.module.impl.Speed.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Speed.G)[life5_8];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2668_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ls"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Speed.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String c(byte[] p0) {
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
        byte[] spill1209_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1209_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1209_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1209_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1209_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1209_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public com.moon.setting.BooleanSetting c() {
return this.x;
}


public com.moon.setting.BooleanSetting f() {
return this.C;
}


public com.moon.setting.FloatSetting d__kZ() {
return this.D;
}


public com.moon.setting.BooleanSetting d() {
return this.y;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.t;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.v;
}


public void a(com.moon.event.TickEvent p0) {
((com.moon.module.impl.Speed)(this)).setSuffix(((java.lang.String)(((com.moon.bw)(((com.moon.bw)(((com.moon.setting.EnumSetting)(this.s)).getValue())))).a__String())));
    return;
}


public com.moon.setting.ModeSetting<com.moon.bx> a__kY() {
return this.w;
}


public com.moon.setting.EnumSetting<com.moon.bw> a() {
return this.s;
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.Speed.E ^ 27993770644978L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bw.NCP) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$1() {
long local1 = (com.moon.module.impl.Speed.E ^ 139235101469968L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bw.WATCHDOG) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$9() {
long local1 = (com.moon.module.impl.Speed.E ^ 113337132397584L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bw.VANILLA) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$10() {
long local1 = (com.moon.module.impl.Speed.E ^ 100172403628885L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bw.VANILLA) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$3() {
long local1 = (com.moon.module.impl.Speed.E ^ 134073639333685L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bw.VERUS) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$2() {
java.lang.Object forwardValue933_16_0;
    int forwardValue933_22_0;
    int forwardValue933_24_0;
    java.lang.Object spill933_0;
    boolean spill933_1;
    long life1_3;
    int[] life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.Speed.E ^ 128362831741888L);
    life3_5 = com.moon.bx.b();
    spill933_0 = ((com.moon.setting.EnumSetting)(this.s)).getValue();
    if (!((life3_5 == null))) {
        forwardValue933_16_0 = spill933_0;
        break forward_join_16;
    }
    if (!((spill933_0 == com.moon.bw.WATCHDOG))) {
        break forward_join_23;
    }
    forwardValue933_16_0 = ((com.moon.setting.BooleanSetting)(this.u)).getValue();
    }
    spill933_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue933_16_0)))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue933_22_0 = ((spill933_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill933_1)) {
        break forward_join_23;
    }
    forwardValue933_22_0 = 1;
    }
    forwardValue933_24_0 = forwardValue933_22_0;
    break forward_join_24;
    }
    forwardValue933_24_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue933_24_0))));
}


private java.lang.Boolean lambda$new$4() {
long local1 = (com.moon.module.impl.Speed.E ^ 56056909832274L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bw.STRAFE) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$8() {
java.lang.Object forwardValue936_16_0;
    int forwardValue936_22_0;
    int forwardValue936_24_0;
    java.lang.Object spill936_0;
    boolean spill936_1;
    long life1_3;
    int[] life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.Speed.E ^ 59489079478509L);
    life3_5 = com.moon.bx.b();
    spill936_0 = ((com.moon.setting.EnumSetting)(this.s)).getValue();
    if (!((life3_5 == null))) {
        forwardValue936_16_0 = spill936_0;
        break forward_join_16;
    }
    if (!((spill936_0 == com.moon.bw.UNIVERSO))) {
        break forward_join_23;
    }
    forwardValue936_16_0 = ((com.moon.setting.BooleanSetting)(this.A)).getValue();
    }
    spill936_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue936_16_0)))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue936_22_0 = ((spill936_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill936_1)) {
        break forward_join_23;
    }
    forwardValue936_22_0 = 1;
    }
    forwardValue936_24_0 = forwardValue936_22_0;
    break forward_join_24;
    }
    forwardValue936_24_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue936_24_0))));
}


private java.lang.Boolean lambda$new$6() {
java.lang.Object forwardValue935_16_0;
    int forwardValue935_26_0;
    int forwardValue935_30_0;
    int forwardValue935_32_0;
    java.lang.Object spill935_0;
    boolean spill935_1;
    long life1_3;
    int[] life3_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_26: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.Speed.E ^ 68277537471013L);
    life3_5 = com.moon.bx.b();
    spill935_0 = ((com.moon.setting.EnumSetting)(this.s)).getValue();
    if (!((life3_5 == null))) {
        forwardValue935_16_0 = spill935_0;
        break forward_join_16;
    }
    if (!((spill935_0 == com.moon.bw.STRAFE))) {
        break forward_join_31;
    }
    forwardValue935_16_0 = ((com.moon.setting.BooleanSetting)(this.y)).getValue();
    }
    spill935_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue935_16_0)))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue935_26_0 = ((spill935_1) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill935_1)) {
        break forward_join_31;
    }
    forwardValue935_26_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue935_30_0 = forwardValue935_26_0;
        break forward_join_30;
    }
    if (!((forwardValue935_26_0 == 0))) {
        break forward_join_31;
    }
    forwardValue935_30_0 = 1;
    }
    forwardValue935_32_0 = forwardValue935_30_0;
    break forward_join_32;
    }
    forwardValue935_32_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue935_32_0))));
}


private java.lang.Boolean lambda$new$5() {
java.lang.Object forwardValue934_16_0;
    int forwardValue934_22_0;
    int forwardValue934_24_0;
    java.lang.Object spill934_0;
    boolean spill934_1;
    long life1_3;
    int[] life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.Speed.E ^ 76498567278685L);
    life3_5 = com.moon.bx.b();
    spill934_0 = ((com.moon.setting.EnumSetting)(this.s)).getValue();
    if (!((life3_5 == null))) {
        forwardValue934_16_0 = spill934_0;
        break forward_join_16;
    }
    if (!((spill934_0 == com.moon.bw.STRAFE))) {
        break forward_join_23;
    }
    forwardValue934_16_0 = ((com.moon.setting.BooleanSetting)(this.x)).getValue();
    }
    spill934_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue934_16_0)))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue934_22_0 = ((spill934_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill934_1))) {
        break forward_join_23;
    }
    forwardValue934_22_0 = 1;
    }
    forwardValue934_24_0 = forwardValue934_22_0;
    break forward_join_24;
    }
    forwardValue934_24_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue934_24_0))));
}


private java.lang.Boolean lambda$new$7() {
long local1 = (com.moon.module.impl.Speed.E ^ 52813045278L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bw.UNIVERSO) ? 1 : 0)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_17(com.moon.module.impl.Speed a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_25(com.moon.module.impl.Speed a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_33(com.moon.module.impl.Speed a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_43(com.moon.module.impl.Speed a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_51(com.moon.module.impl.Speed a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_59(com.moon.module.impl.Speed a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_63(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_67(com.moon.module.impl.Speed a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_71(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_73(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_75(com.moon.module.impl.Speed a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_79(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_81(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_83(com.moon.module.impl.Speed a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_87(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_89(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_91(com.moon.module.impl.Speed a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_95(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_97(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_024beae218ed00f3_originalDynamicSite211_99(com.moon.module.impl.Speed a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2668_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
