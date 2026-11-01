package com.moon;


public class dx {

private final java.util.Map<java.lang.String, com.moon.c0> a;

private static final long b;

private static final java.lang.String[] c;

private static final java.lang.String[] d;

private static final java.util.Map e;

public dx(java.util.Map<java.lang.String, com.moon.c0> p0) {
super();
    this.a = p0;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(5375362737905367832L)), ((long)(-5182870984054250211L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(81777428820863L)))));

    e = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.dx.b ^ 117091851233795L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill128_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill128_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill128_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill128_14 = new byte[8];

    (__sourceSpill128_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill128_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation128_16 = __sourceSpill128_14;

    ((javax.crypto.Cipher)(__sourceSpill128_11)).init(((int)(__sourceSpill128_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill128_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation128_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[14];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "®ñïgh«Manlü?\007M\024 ºó½ö~;Os£SñAç¸M»6\\·ÙQTÁ9QA\005ÄaòQ7Æ5Z?¬O ðÖ¯i\fH³j¦T\034³å\034°\020s\001¡;,ø1\033}»Ó{\b7ÿ¹©U¾<\027\0200ÉSlµà\013rª\037³^F\177§N8VÖ÷\037ª¸t8aW&\006\017»ÏrC.\024Ú\"(-\031KíÜ\"\024Õlá³Se\023ÜÍ+Ñì±Àì½­bÔa\fcl8\025Îçv\023îtÙt\022\"ÈBÖ·\177Û\007ú\001\000Kï~\033Û3\007W2\032EqdÓÚd\rÊjÓÀµi3Ä@0\177â$(\177j ^ÕÉè\rø¥âÈ±_1É#\fìnö<ô\nµíÆ)D\034\033 jè]\026?­{/Ü_Ü\000-i?Î=º}\026\030aì&¯Ï¿m'ÒãÜiEe<;:?h5é u\025\f÷&}ÕüÆ5{m0e&\031´\036E£¬érO^ò\017\030¼\020*2ÈÕ\023\016Pð\024qÖgYl\0330.\022fÙBQÞ\034\031°Kqä\003¾|?\035ê°é\\0Ã£SuÁ¡BT\0259X²J\017±Æ\020\032ÔbÝü\0203ÅÁÒÂ®Ê²]>^¬W³\020ÙK\b\020ÁÏÕ Yvi±¢ÿ@9¶4º8¼\037%Plèù­³\\Ø\036Ö(¿+ºF­¨ò¡\trIæå\031UråØj8¨ \032;çÐ&\033\007ù¬Ë×?;­"))).length();

    int local5_life24 = 104;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill128_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill128_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill128_29)).doFinal(((byte[])(__sourceSpill128_28)));

        java.lang.String __sourceSpill128_34 = ((java.lang.String)(com.moon.dx.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill128_35 = local9_life19;

        int __sourceSpill128_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill128_35)[__sourceSpill128_36] = __sourceSpill128_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "~r?\035\035a¡$?|5~c\020`^Ý}ÙÖ8\031{Ý.\023ònêÉ?Æ×ý _Bûô£'ÔÍ\b#{¸eËé5½äºN`ºÇH(é\034²\030¥È\rûÀ\033Â|ø+\030\025>\025¤×ú!ÎbZIOv°É>C\002ô\nÒjXÅÿê­\177À\\rÇT·@²ÿ£H\025õ/ÙÚÀ»:"))).length();

    local5_life24 = 64;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill128_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill128_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill128_43)).doFinal(((byte[])(__sourceSpill128_42)));

        java.lang.String __sourceSpill128_48 = ((java.lang.String)(com.moon.dx.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill128_49 = local9_life19;

        int __sourceSpill128_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill128_49)[__sourceSpill128_50] = __sourceSpill128_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    c = ((java.lang.String[])(local9_life19));

    d = ((java.lang.String[])(new java.lang.String[14]));
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
        byte[] spill174_0 = p0;
        life4_9 += 1;
        life5_44 = (spill174_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill174_1 = p0;
        life4_9 += 1;
        life5_76 = (spill174_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill174_2 = p0;
        life4_9 += 1;
        life5_91 = (spill174_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14815);
    if (((com.moon.dx.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.dx.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.dx.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/dx", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.dx.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.dx.d)[life5_8] = com.moon.dx.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.dx.d)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral943_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/dx"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.dx.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void a(com.moon.c0 p0) {
java.lang.StringBuilder lexicalValue13_103_0;
    net.minecraft.entity.Entity[] spill13_0;
    java.lang.StringBuilder spill13_1;
    long life2_3;
    java.lang.StringBuilder life5_7;
    java.lang.StringBuilder life6_11;
    java.util.Iterator life7_39;
    net.minecraft.entity.Entity[] life4_40;
    com.moon.df life8_47;
    lexical_join_129: {
    lexical_join_106: {
    life2_3 = (com.moon.dx.b ^ 44013769899848L);
    life5_7 = new java.lang.StringBuilder();
    life6_11 = new java.lang.StringBuilder();
    spill13_0 = com.moon.dy.b();
    ((java.lang.StringBuilder)(life5_7)).append(((java.lang.String)(java.lang.String.format(((java.lang.String)(__sourceIntrinsic_9218a52d7ad3_invokedynamic13_2(32082, (7057962514092753454L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[] {((com.moon.c0)(p0)).a__String(), java.lang.Integer.valueOf(((int)(((java.util.List)(((com.moon.c0)(p0)).b__List())).size())))}))))));
    life7_39 = ((java.util.List)(((com.moon.c0)(p0)).b__List())).iterator();
    life4_40 = spill13_0;
    lexical_cycle_41: while (true) {
    lexical_join_104: {
    lexical_join_103: {
    lexical_join_92: {
    if (!(((java.util.Iterator)(life7_39)).hasNext())) {
        break lexical_join_106;
    }
    life8_47 = ((com.moon.df)(((java.util.Iterator)(life7_39)).next()));
    spill13_1 = ((java.lang.StringBuilder)(life5_7)).append(((java.lang.String)(java.lang.String.format(((java.lang.String)(__sourceIntrinsic_9218a52d7ad3_invokedynamic13_14(6449, (5180210456041416270L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[] {((com.moon.df)(life8_47)).a__String(), ((com.moon.df)(life8_47)).b(), ((java.lang.Class)(((com.moon.df)(life8_47)).a__Class())).getSimpleName()}))))));
    if (!((life4_40 == null))) {
        lexicalValue13_103_0 = spill13_1;
        break lexical_join_103;
    }
    recovery.source.CarrierOps.discard(spill13_1);
    if (!((life4_40 == null))) {
        break lexical_join_129;
    }
    if (!(((com.moon.df)(life8_47)).b__Boolean())) {
        break lexical_join_92;
    }
    ((java.lang.StringBuilder)(((java.lang.StringBuilder)(life6_11)).append(((java.lang.String)(((com.moon.df)(life8_47)).a__String(((java.lang.String)("")))))))).append(((java.lang.String)(" ")));
    if (!((life4_40 != null))) {
        break lexical_join_104;
    }
    }
    lexicalValue13_103_0 = ((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(life6_11)).append(((java.lang.String)("("))))).append(((java.lang.String)(((com.moon.df)(life8_47)).a__String(((java.lang.String)("")))))))).append(((java.lang.String)(")"))))).append(((java.lang.String)(" ")));
    }
    recovery.source.CarrierOps.discard(lexicalValue13_103_0);
    }
    if (!((life4_40 != null))) { continue lexical_cycle_41; }
    break lexical_cycle_41;
    }
    }
    ((java.lang.StringBuilder)(life5_7)).append(((java.lang.String)(java.lang.String.format(((java.lang.String)(__sourceIntrinsic_9218a52d7ad3_invokedynamic13_32(30866, (8433770613046642666L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[] {((com.moon.c0)(p0)).a__String(), life6_11}))))));
    com.moon.nC.a(((java.lang.String)(((java.lang.StringBuilder)(life5_7)).toString())));
    }
    return;
}


public void a(com.moon.dK p0) {
java.lang.String lexicalValue14_23_0;
    java.lang.String lexicalValue14_23_1;
    com.moon.c0 lexicalValue14_48_0;
    int lexicalValue14_90_0;
    int lexicalValue14_90_1;
    java.lang.String[] lexicalValue14_97_0;
    int lexicalValue14_142_0;
    int lexicalValue14_181_0;
    int lexicalValue14_185_0;
    com.moon.dc lexicalValue14_233_0;
    com.moon.dc lexicalValue14_257_0;
    java.lang.String lexicalValue14_270_0;
    net.minecraft.entity.Entity[] spill14_0;
    java.lang.String spill14_1;
    java.lang.String spill14_2;
    com.moon.c0 spill14_3;
    int spill14_4;
    int spill14_5;
    java.lang.String[] spill14_6;
    int spill14_7;
    boolean spill14_8;
    java.lang.String spill14_9;
    java.lang.String spill14_10;
    com.moon.dc spill14_11;
    java.lang.String spill14_12;
    long life2_3;
    java.lang.String life5_7;
    net.minecraft.entity.Entity[] life4_8;
    java.lang.String[] life6_30;
    java.lang.String life7_34;
    com.moon.c0 life8_41;
    java.util.Iterator life9_61;
    com.moon.df life10_68;
    java.util.List life9_82;
    java.util.List life10_85;
    java.lang.String[] life11_122;
    int life12_124;
    java.lang.String life13_132;
    com.moon.df life14_153;
    int life15_156;
    java.lang.String life16_186;
    java.lang.String life17_187;
    int life18_188;
    java.lang.String life19_232;
    java.lang.String life20_233;
    int life21_234;
    com.moon.dc life11_269;
    lexical_join_276: {
    lexical_join_271: {
    lexical_join_270: {
    lexical_join_257: {
    lexical_join_256: {
    lexical_join_233: {
    lexical_join_224: {
    lexical_join_97: {
    lexical_join_90: {
    lexical_join_85: {
    lexical_join_66: {
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_23: {
    life2_3 = (com.moon.dx.b ^ 105920375886915L);
    spill14_0 = com.moon.dy.b();
    life5_7 = ((com.moon.dK)(p0)).a__sourceReturn_0e30dfc966();
    life4_8 = spill14_0;
    spill14_1 = life5_7;
    spill14_2 = ".";
    if (!((life4_8 == null))) {
        lexicalValue14_23_0 = spill14_1;
        lexicalValue14_23_1 = spill14_2;
        break lexical_join_23;
    }
    if (!(((java.lang.String)(spill14_1)).startsWith(((java.lang.String)(spill14_2))))) {
        break lexical_join_271;
    }
    ((com.moon.dK)(p0)).setCancelled(((boolean)(true)));
    lexicalValue14_23_0 = ((java.lang.String)(life5_7)).substring(((int)(1)));
    lexicalValue14_23_1 = " ";
    }
    life6_30 = ((java.lang.String)(lexicalValue14_23_0)).split(((java.lang.String)(lexicalValue14_23_1)));
    life7_34 = (life6_30)[0];
    life8_41 = ((com.moon.c0)(((java.util.Map)(this.a)).get(((java.lang.Object)(((java.lang.String)(life7_34)).toLowerCase())))));
    spill14_3 = life8_41;
    if (!((life4_8 == null))) {
        lexicalValue14_48_0 = spill14_3;
        break lexical_join_48;
    }
    if (!((spill14_3 == null))) {
        break lexical_join_47;
    }
    __sourceExactCall_a08afeae3b4d94(((java.lang.String)(__sourceIntrinsic_165dba65c8eb_invokedynamic14_11(16708, (2789821647529022776L ^ life2_3)))));
    return;
    }
    lexicalValue14_48_0 = life8_41;
    }
    life9_61 = ((java.util.List)(((com.moon.c0)(lexicalValue14_48_0)).b__List())).iterator();
    lexical_cycle_51: while (true) {
    if (!(((java.util.Iterator)(life9_61)).hasNext())) {
        break lexical_join_66;
    }
    life10_68 = ((com.moon.df)(__sourceExactCall_c7b373ea42fd0e(((java.util.Iterator)(life9_61)))));
    __sourceExactCall_19d1eaf6cdcd0f(((com.moon.df)(life10_68)), ((java.lang.Object)(null)));
    if (!((life4_8 == null))) {
        break lexical_join_271;
    }
    if (!((life4_8 != null))) { continue lexical_cycle_51; }
    break lexical_cycle_51;
    }
    }
    life9_82 = ((com.moon.c0)(life8_41)).b__List();
    life10_85 = ((com.moon.c0)(life8_41)).a__List();
    spill14_4 = ((java.util.List)(life10_85)).size();
    spill14_5 = ((life6_30).length - 1);
    if (!((life4_8 == null))) {
        lexicalValue14_90_0 = spill14_4;
        lexicalValue14_90_1 = spill14_5;
        break lexical_join_90;
    }
    if (!((spill14_4 > spill14_5))) {
        break lexical_join_85;
    }
    __sourceExactCall_57b5bc7c761d63(this, ((com.moon.c0)(life8_41)));
    return;
    }
    spill14_6 = life6_30;
    if (!((life4_8 == null))) {
        lexicalValue14_97_0 = spill14_6;
        break lexical_join_97;
    }
    lexicalValue14_90_0 = (spill14_6).length;
    lexicalValue14_90_1 = 1;
    }
    if (!((lexicalValue14_90_0 > lexicalValue14_90_1))) {
        break lexical_join_224;
    }
    lexicalValue14_97_0 = ((java.lang.String[])(java.util.Arrays.copyOfRange(((java.lang.Object[])(life6_30)), ((int)(1)), ((int)((life6_30).length)))));
    }
    life11_122 = lexicalValue14_97_0;
    life12_124 = 0;
    lexical_cycle_100: while (true) {
    lexical_join_222: {
    lexical_join_221: {
    lexical_join_185: {
    lexical_join_181: {
    lexical_join_178: {
    lexical_join_142: {
    if (!((life12_124 < (life11_122).length))) {
        break lexical_join_224;
    }
    life13_132 = (life11_122)[life12_124];
    if (!((life4_8 == null))) {
        break lexical_join_271;
    }
    if (!((life4_8 == null))) {
        break lexical_join_222;
    }
    if (!(((((java.util.List)(life9_82)).size() - 1) >= life12_124))) {
        break lexical_join_221;
    }
    life14_153 = ((com.moon.df)(((java.util.List)(life9_82)).get(((int)(life12_124)))));
    life15_156 = ((((com.moon.df)(life14_153)).a__Boolean()) ? 1 : 0);
    spill14_7 = life15_156;
    if (!((life4_8 == null))) {
        lexicalValue14_181_0 = spill14_7;
        break lexical_join_181;
    }
    if (!((spill14_7 != 0))) {
        break lexical_join_178;
    }
    spill14_8 = __sourceExactCall_5576361fc35140(((com.moon.df)(life14_153)), ((java.lang.String[])(((java.lang.String[])(java.util.Arrays.copyOfRange(((java.lang.Object[])(life11_122)), ((int)(life12_124)), ((int)((life11_122).length))))))));
    if (!((life4_8 == null))) {
        lexicalValue14_142_0 = ((spill14_8) ? 1 : 0);
        break lexical_join_142;
    }
    if (!((!spill14_8))) {
        break lexical_join_224;
    }
    lexicalValue14_142_0 = life12_124;
    }
    spill14_9 = life13_132;
    life16_186 = ((java.lang.Class)(((com.moon.df)(life14_153)).a__Class())).getSimpleName();
    life17_187 = spill14_9;
    life18_188 = lexicalValue14_142_0;
    __sourceExactCall_a08afeae3b4d94(((java.lang.String)(__sourceIntrinsic_165dba65c8eb_invokedynamic14_40(__sourceIntrinsic_165dba65c8eb_invokedynamic14_36(11182, (977998578768347093L ^ life2_3)), life18_188, __sourceIntrinsic_165dba65c8eb_invokedynamic14_37(13686, (1915681344112681227L ^ life2_3)), life17_187, __sourceIntrinsic_165dba65c8eb_invokedynamic14_38(5169, (1632617261913325635L ^ life2_3)), life16_186, __sourceIntrinsic_165dba65c8eb_invokedynamic14_39(7362, (7492930223361837234L ^ life2_3))))));
    __sourceExactCall_57b5bc7c761d63(this, ((com.moon.c0)(life8_41)));
    return;
    }
    lexicalValue14_181_0 = ((((com.moon.df)(life14_153)).a__Boolean(((java.lang.String)(life13_132)))) ? 1 : 0);
    }
    if (!((life4_8 == null))) {
        lexicalValue14_185_0 = lexicalValue14_181_0;
        break lexical_join_185;
    }
    if (!((lexicalValue14_181_0 == 0))) {
        break lexical_join_221;
    }
    lexicalValue14_185_0 = life12_124;
    }
    spill14_10 = life13_132;
    life19_232 = ((java.lang.Class)(((com.moon.df)(life14_153)).a__Class())).getSimpleName();
    life20_233 = spill14_10;
    life21_234 = lexicalValue14_185_0;
    __sourceExactCall_a08afeae3b4d94(((java.lang.String)(__sourceIntrinsic_165dba65c8eb_invokedynamic14_51(__sourceIntrinsic_165dba65c8eb_invokedynamic14_47(28454, (451427491208739676L ^ life2_3)), life21_234, __sourceIntrinsic_165dba65c8eb_invokedynamic14_48(12731, (6924026651261560269L ^ life2_3)), life20_233, __sourceIntrinsic_165dba65c8eb_invokedynamic14_49(561, (8182368023402141248L ^ life2_3)), life19_232, __sourceIntrinsic_165dba65c8eb_invokedynamic14_50(6838, (8954694031428570824L ^ life2_3))))));
    __sourceExactCall_57b5bc7c761d63(this, ((com.moon.c0)(life8_41)));
    return;
    }
    life12_124 += 1;
    }
    if (!((life4_8 != null))) { continue lexical_cycle_100; }
    break lexical_cycle_100;
    }
    }
    life11_269 = __sourceExactCall_6ade35fb6a0680(((com.moon.c0)(life8_41)));
    spill14_11 = life11_269;
    if (!((life4_8 == null))) {
        lexicalValue14_233_0 = spill14_11;
        break lexical_join_233;
    }
    if (!((!((com.moon.dc)(spill14_11)).a__Boolean()))) {
        break lexical_join_271;
    }
    lexicalValue14_233_0 = life11_269;
    }
    if (!((life4_8 == null))) {
        lexicalValue14_257_0 = lexicalValue14_233_0;
        break lexical_join_257;
    }
    if (!((((com.moon.dc)(lexicalValue14_233_0)).a__df() != null))) {
        break lexical_join_256;
    }
    java.lang.String __stackOp14_60_0 = ((com.moon.df)(((com.moon.dc)(life11_269)).a__df())).a__String();
    java.lang.String __stackOp14_60_1 = __sourceIntrinsic_165dba65c8eb_invokedynamic14_59(23907, (7637177633110001948L ^ life2_3));
    __sourceExactCall_a08afeae3b4d94(((java.lang.String)(__sourceIntrinsic_165dba65c8eb_invokedynamic14_62(__stackOp14_60_1, __stackOp14_60_0, __sourceIntrinsic_165dba65c8eb_invokedynamic14_61(6838, (8954694031428570824L ^ life2_3))))));
    __sourceExactCall_57b5bc7c761d63(this, ((com.moon.c0)(life8_41)));
    }
    lexicalValue14_257_0 = life11_269;
    }
    spill14_12 = ((com.moon.dc)(lexicalValue14_257_0)).a__String();
    if (!((life4_8 == null))) {
        lexicalValue14_270_0 = spill14_12;
        break lexical_join_270;
    }
    if (!((spill14_12 != null))) {
        break lexical_join_271;
    }
    java.lang.String __stackOp14_68_0 = ((com.moon.dc)(life11_269)).a__String();
    java.lang.String __stackOp14_68_1 = __sourceIntrinsic_165dba65c8eb_invokedynamic14_67(531, (4110527330063079014L ^ life2_3));
    lexicalValue14_270_0 = __sourceIntrinsic_165dba65c8eb_invokedynamic14_69(__stackOp14_68_1, __stackOp14_68_0);
    }
    __sourceExactCall_a08afeae3b4d94(((java.lang.String)(lexicalValue14_270_0)));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_276;
    }
    com.moon.dy.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral943_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9218a52d7ad3_invokedynamic13_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9218a52d7ad3_invokedynamic13_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9218a52d7ad3_invokedynamic13_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_40(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_51(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_62(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_67(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_165dba65c8eb_invokedynamic14_69(java.lang.String a0, java.lang.String a1) throws E;

private static native void __sourceExactCall_a08afeae3b4d94(java.lang.String p0);
private static native java.lang.Object __sourceExactCall_c7b373ea42fd0e(java.util.Iterator p0);
private static native com.moon.df __sourceExactCall_19d1eaf6cdcd0f(com.moon.df p0, java.lang.Object p1);
private static native void __sourceExactCall_57b5bc7c761d63(com.moon.dx p0, com.moon.c0 p1);
private static native boolean __sourceExactCall_5576361fc35140(com.moon.df p0, java.lang.String[] p1);
private static native com.moon.dc __sourceExactCall_6ade35fb6a0680(com.moon.c0 p0);
}
