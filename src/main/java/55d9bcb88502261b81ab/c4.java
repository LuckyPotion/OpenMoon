package com.moon;


public class c4 extends com.moon.c0 {

private com.moon.dh<com.moon.aU> g;

private com.moon.dm h;

private com.moon.dm i;

private static long k;

private static java.lang.String[] o;

private static java.lang.String[] p;

private static java.util.Map q;

private static long[] r;

private static java.lang.Long[] s;

private static java.util.Map t;

public c4(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String[])null); }


private static void __sourceConstructorBody_5d28a9b67e21c464(com.moon.c4 receiver, java.lang.String p0, java.lang.String p1, java.lang.String[] p2) throws Throwable {

long local4 = (com.moon.c4.k ^ 25005625171248L);

    com.moon.c4.__sourceConstructorInit_5d28a9b67e21c464_0(((com.moon.c4)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String[])(p2)));

    ((com.moon.c4)(receiver)).g = ((com.moon.dh)(((com.moon.dh)(((com.moon.dn)(((com.moon.dn)(((com.moon.dn)(((com.moon.dq)(com.moon.dh.a__sourceStatic_4981646cb3(((java.lang.Class)(com.moon.aU.class))))).a(((java.lang.String)(__sourceIntrinsic_5d28a9b67e21c464_originalDynamicSite712_4(5339, (6098631515509802403L ^ local4))))))).b(((java.lang.String)(__sourceIntrinsic_5d28a9b67e21c464_originalDynamicSite712_6(10201, (1269902706025887395L ^ local4))))))).a__dn())).a()))));

    ((com.moon.c4)(receiver)).h = ((com.moon.dm)(((com.moon.dm)(((com.moon.dn)(((com.moon.dn)(((com.moon.dv)(com.moon.dm.a__dv())).a(((java.lang.String)(__sourceIntrinsic_5d28a9b67e21c464_originalDynamicSite712_13(18146, (3212291450710497181L ^ local4))))))).b(((java.lang.String)(__sourceIntrinsic_5d28a9b67e21c464_originalDynamicSite712_15(24362, (5185192226590887507L ^ local4))))))).a()))));

    ((com.moon.c4)(receiver)).i = ((com.moon.dm)(((com.moon.dm)(((com.moon.dn)(((com.moon.dn)(((com.moon.dv)(com.moon.dm.a__dv())).a(((java.lang.String)(__sourceIntrinsic_5d28a9b67e21c464_originalDynamicSite712_21(1486, (3149008391426331812L ^ local4))))))).b(((java.lang.String)(__sourceIntrinsic_5d28a9b67e21c464_originalDynamicSite712_23(31510, (1689678573643803262L ^ local4))))))).a()))));

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(3450373167523499785L)), ((long)(-5079500639381609863L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(78804819939937L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.c4.k ^ 116050024769188L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill36_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill36_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill36_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill36_14 = new byte[8];
    (__sourceSpill36_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill36_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation36_16 = __sourceSpill36_14;
    ((javax.crypto.Cipher)(__sourceSpill36_11)).init(((int)(__sourceSpill36_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill36_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation36_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[19];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "¦¦\007\036o$©\016©É\020®T\001|Ø>6¥Úê^èløjÇ\016;âJ\001Ö¦UÎún!¾Láü\000l\027`º1v6Ã\"w¡\177Úð\006\båÈûb)\034þÒ@1(SÎe>\027\017¼üaã]ïb\034ÿ¹ùwf®»¤GD²`\021¸/Ñ9,DAPñFZú|S\020Vwºl\bW¼Ýü>­\r®\020'ÙôAiIHð£71À(¤Îí\007\022äEÑ/õGetÚ\\!A©éL\036ËiW\n{}\004uªájìðc5Ü@'^Hì\f&(HÔu*-Mòí¿_o\004æ)Âòîæâmêw4Uù{Cj\\¦¾Çm&ÞûÕÈPoLøb½#1Íë\002v¬«NùL­eØZ¼5Ëæ:©Ýº¥¬OaÐ9s/\030#Ïx\025Ï\016v\030¶\036\020q\025+\177\t ¼Aoì\025Ù¥jã\020õ/fLµð¡\005Nx2Å£tûYh4\fÏ\022RÒøyd\f\025qD©ÓÐÄÇj2á`í®lãhYý\023ìõb&2\002|m=Dðõà\"ªE\036úa2T\033-­ª½ók½K0ìó'=R¶}¬WÕ\r\004:\024Måú>ð+G\005Â\022¢Á\036Ý{_8õ-ûQ\033\001\036yT}2Z:?öÅ@ÇìU£:Ç_ø+?ÿR´\022z\007*Û>3R¤\033:Ðw\013<j:]\000¾(Æ°Ï\027¯]AÎ°ËÆúð?\030ý3ä\032õe\032âèX®ôu¬5GKz­H;Gnt½â÷\017\005\\\0324Wi81c3\016°1Æ¢kK¬ÎÔÞ\035Ègßl£ÞzúbÙ¥â÷¤ÌÿzBe²O=îÂÚ[\030|kÍ°úúõôám= à#\036ëôO\"÷æ\027ÿ>Ö&ÿlg¡ð\022\033ï\nQ\017ê0MÙ(Ø¯Rôà\001ÃcÖöø1o'X\021Æ«ËPÔ\017O &Ýì(×\035Y\017¡\020NÌ¸î«Óà\006Ñ\005ÑîO_i\030ßÑwMæòù±à2²\030ínuaÏ\"Ç¹ê38Ïs~äÔ¼\n¨ßfn'g\031ò\nþd]ÊÜgØÜÝ¾F!ÍvÉ4zÝ-Ç6û\031¡ý¦\025Å¯hZh4Ð¼o,Svmø\021Y\037Ð(~\005.7\023AeÆ\030ír1ÛXúÞU9(Dù^V¸\022{²eï´¤Ï$<\006U*(ý?ÞùÍ\033×ª§îªm-{ñv\021å\013.ycòÄ\005D1\025\nC\004DO·n¦¶Á\020h46Ó\001ÖÊ¿\005¤ý¥ y"))).length();
    int local16_life24 = 128;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill36_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill36_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill36_29)).doFinal(((byte[])(__sourceSpill36_28)));
        java.lang.String __sourceSpill36_34 = ((java.lang.String)(com.moon.c4.b(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill36_35 = local20_life19;
        int __sourceSpill36_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill36_35)[__sourceSpill36_36] = __sourceSpill36_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "A\027*:&ï\"®qÑ}UßÑiTÊáºU\020ði4Ü`®³ÁHÅEM\036\001\026°qLõ½¤¡ñLi@Äy«S\002C)ø\034äüæ8ÂGÀËqvmv%¾vSq?,1ÍÐ¢Ýaz?Åêy@MAÚ\034°\035Ù*<Î_BÐs¸Év\016\bîc\036"))).length();
    local16_life24 = 32;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill36_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill36_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill36_42)).doFinal(((byte[])(__sourceSpill36_41)));
        java.lang.String __sourceSpill36_47 = ((java.lang.String)(com.moon.c4.b(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill36_48 = local20_life19;
        int __sourceSpill36_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill36_48)[__sourceSpill36_49] = __sourceSpill36_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    o = ((java.lang.String[])(local20_life19));
    p = ((java.lang.String[])(new java.lang.String[19]));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill36_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill36_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill36_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill36_60 = new byte[8];
    (__sourceSpill36_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill36_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation36_62 = __sourceSpill36_60;
    ((javax.crypto.Cipher)(__sourceSpill36_57)).init(((int)(__sourceSpill36_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill36_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation36_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "IKde.F\013\031é\t5\177ã»á"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill36_71 = local4_life67;
        int __sourceSpill36_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill36_71)).substring(((int)(__sourceSpill36_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill36_76 = local6_life65;
        int __sourceSpill36_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill36_79 = new byte[8];
        (__sourceSpill36_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill36_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill36_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill36_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill36_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill36_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill36_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill36_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill36_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill36_80)).doFinal(((byte[])(__sourceSpill36_79)));
        (__sourceSpill36_76)[__sourceSpill36_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    r = ((long[])(local6_life65));
    s = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_5d28a9b67e21c464_0(com.moon.c4 a0, java.lang.String a1, java.lang.String a2, java.lang.String[] a3) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral742_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/c4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.c4.b(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10166);
    if (((com.moon.c4.p)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.c4.q)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.c4.q)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/c4", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.c4.o)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.c4.p)[life5_8] = com.moon.c4.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.c4.p)[life5_8];
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
        byte[] spill100_0 = p0;
        life4_9 += 1;
        life5_44 = (spill100_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill100_1 = p0;
        life4_9 += 1;
        life5_76 = (spill100_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill100_2 = p0;
        life4_9 += 1;
        life5_91 = (spill100_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static long c(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13893);
    if (((com.moon.c4.s)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.c4.r)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.c4.t)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.c4.t)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/c4", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.c4.s)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.c4.s)[life3_8])).longValue();
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.c4.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral746_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/c4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.dc a() {
java.lang.StringBuilder forestValue12_96_0;
    java.lang.String forestValue12_101_0;
    int forestValue12_109_0;
    int forestValue12_218_0;
    int spill12_0;
    java.lang.StringBuilder spill12_1;
    java.lang.String spill12_2;
    com.moon.hD spill12_3;
    com.moon.hB spill12_4;
    com.moon.hD spill12_5;
    com.moon.hB spill12_6;
    long life1_3;
    com.moon.eV life4_7;
    int life3_8;
    java.lang.String life5_13;
    java.lang.String life6_21;
    java.lang.StringBuilder life7_33;
    java.util.Map life8_36;
    java.util.Iterator life9_57;
    com.moon.eU life10_64;
    int life7_113;
    int life7_225;
    forest_join_289: {
    forest_join_256: {
    forest_join_253: {
    forest_join_218: {
    forest_join_217: {
    forest_join_213: {
    forest_join_183: {
    forest_join_181: {
    forest_join_144: {
    forest_join_109: {
    forest_join_108: {
    forest_join_104: {
    forest_join_101: {
    forest_join_99: {
    forest_join_30: {
    life1_3 = (com.moon.c4.k ^ 16699927065673L);
    spill12_0 = com.moon.aW.b();
    life4_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__eV();
    life3_8 = spill12_0;
    life5_13 = ((java.lang.String)(((com.moon.dm)(this.h)).a__Object()));
    life6_21 = ((java.lang.String)(java.util.Objects.requireNonNullElse(((java.lang.Object)(((java.lang.String)(((com.moon.dm)(this.i)).a__Object())))), ((java.lang.Object)("")))));
    switch ((com.moon.dA.a)[((com.moon.aU)(((com.moon.aU)(((com.moon.dh)(this.g)).a__Object())))).ordinal()]) {
case 1:
{
        break forest_join_30;
    }
case 2:
{
        break forest_join_104;
    }
case 3:
{
        break forest_join_183;
    }
case 4:
{
        break forest_join_213;
    }
default:
{
        break forest_join_289;
    }
}
    }
    life7_33 = new java.lang.StringBuilder();
    life8_36 = ((com.moon.eV)(life4_7)).a();
    ((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(life7_33)).append(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_18(5214, (4823330361351629910L ^ life1_3))))))).append(((int)(((java.util.Map)(life8_36)).size()))))).append(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_22(21210, (5304551003197319896L ^ life1_3)))));
    life9_57 = ((java.util.Collection)(((java.util.Map)(life8_36)).values())).iterator();
    forest_cycle_58: while (true) {
    forest_join_97: {
    forest_join_96: {
    if (!(((java.util.Iterator)(life9_57)).hasNext())) {
        break forest_join_99;
    }
    life10_64 = ((com.moon.eU)(((java.util.Iterator)(life9_57)).next()));
    spill12_1 = ((java.lang.StringBuilder)(((java.lang.StringBuilder)(life7_33)).append(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_29(16273, (5867417301131413402L ^ life1_3))))))).append(((java.lang.String)(((com.moon.eU)(life10_64)).a())));
    if (!((life3_8 == 0))) {
        forestValue12_96_0 = spill12_1;
        break forest_join_96;
    }
    recovery.source.CarrierOps.discard(spill12_1);
    spill12_2 = ((com.moon.eU)(life10_64)).b();
    if (!((life3_8 == 0))) {
        forestValue12_101_0 = spill12_2;
        break forest_join_101;
    }
    if (!((!((java.lang.String)(spill12_2)).isEmpty()))) {
        break forest_join_97;
    }
    forestValue12_96_0 = ((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(life7_33)).append(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_36(32258, (7874410368625083915L ^ life1_3))))))).append(((java.lang.String)(((com.moon.eU)(life10_64)).b()))))).append(((java.lang.String)(")")));
    }
    recovery.source.CarrierOps.discard(forestValue12_96_0);
    }
    if (!((life3_8 != 0))) {
        continue forest_cycle_58;
    }
    break forest_cycle_58;
    }
    }
    forestValue12_101_0 = ((java.lang.StringBuilder)(life7_33)).toString();
    }
    com.moon.nC.a(((java.lang.String)(forestValue12_101_0)));
    if (!((life3_8 != 0))) {
        break forest_join_289;
    }
    }
    if (!((life5_13 != null))) {
        break forest_join_108;
    }
    forestValue12_109_0 = 1;
    break forest_join_109;
    }
    forestValue12_109_0 = 0;
    }
    life7_113 = forestValue12_109_0;
    if (!((life3_8 == 0))) {
        break forest_join_181;
    }
    if (!((life7_113 == 0))) {
        break forest_join_144;
    }
    ((com.moon.hD)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD())).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_47(7425, (5807887435809613062L ^ life1_3))))))).b(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_49(25620, (4608781466402495512L ^ life1_3))))))).a(((com.moon.b8)(com.moon.b8.ERROR))))).a(((long)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_53(30984, (4755609886112747768L ^ life1_3))))))).a())));
    return ((com.moon.dd)(((com.moon.dd)(com.moon.dc.a())).a(((boolean)(true))))).a();
    }
    ((com.moon.eV)(life4_7)).a(((java.lang.String)(life5_13)), ((java.lang.String)(life6_21)));
    spill12_3 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD();
    spill12_4 = ((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_64(2461, (2264170364189438354L ^ life1_3)))));
    java.lang.String __stackOp12_67_0 = life5_13;
    java.lang.String __stackOp12_67_1 = __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_66(26951, (1468718768283717961L ^ life1_3));
    ((com.moon.hD)(spill12_3)).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(spill12_4)).b(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_69(__stackOp12_67_1, __stackOp12_67_0, __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_68(18987, (1680331547311485487L ^ life1_3)))))))).a(((com.moon.b8)(com.moon.b8.SUCCESS))))).a(((long)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_73(19597, (2931776139513570684L ^ life1_3))))))).a())));
    }
    if (!((life3_8 != 0))) {
        break forest_join_289;
    }
    }
    ((java.util.Map)(((com.moon.eV)(life4_7)).a())).clear();
    ((com.moon.hD)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD())).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_82(2461, (2264170364189438354L ^ life1_3))))))).b(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_84(29190, (3895408485977033228L ^ life1_3))))))).a(((com.moon.b8)(com.moon.b8.SUCCESS))))).a(((long)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_88(19597, (2931776139513570684L ^ life1_3))))))).a())));
    if (!((life3_8 != 0))) {
        break forest_join_289;
    }
    }
    if (!((life5_13 != null))) {
        break forest_join_217;
    }
    forestValue12_218_0 = 1;
    break forest_join_218;
    }
    forestValue12_218_0 = 0;
    }
    life7_225 = forestValue12_218_0;
    if (!((life3_8 == 0))) {
        break forest_join_256;
    }
    if (!((life7_225 == 0))) {
        break forest_join_253;
    }
    ((com.moon.hD)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD())).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_95(2461, (2264170364189438354L ^ life1_3))))))).b(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_97(6433, (5281906455068172580L ^ life1_3))))))).a(((com.moon.b8)(com.moon.b8.ERROR))))).a(((long)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_101(19597, (2931776139513570684L ^ life1_3))))))).a())));
    return ((com.moon.dd)(((com.moon.dd)(com.moon.dc.a())).a(((boolean)(true))))).a();
    }
    ((com.moon.eV)(life4_7)).a(((java.lang.String)(life5_13)));
    }
    spill12_5 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD();
    spill12_6 = ((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_112(2461, (2264170364189438354L ^ life1_3)))));
    java.lang.String __stackOp12_115_0 = life5_13;
    java.lang.String __stackOp12_115_1 = __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_114(3341, (3268227660198245663L ^ life1_3));
    ((com.moon.hD)(spill12_5)).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(spill12_6)).b(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_117(__stackOp12_115_1, __stackOp12_115_0, __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_116(28295, (7802368297495402122L ^ life1_3)))))))).a(((com.moon.b8)(com.moon.b8.SUCCESS))))).a(((long)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_121(19597, (2931776139513570684L ^ life1_3))))))).a())));
    }
    return ((com.moon.dd)(((com.moon.dd)(com.moon.dc.a())).a(((boolean)(true))))).a();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5d28a9b67e21c464_originalDynamicSite712_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5d28a9b67e21c464_originalDynamicSite712_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5d28a9b67e21c464_originalDynamicSite712_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5d28a9b67e21c464_originalDynamicSite712_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5d28a9b67e21c464_originalDynamicSite712_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5d28a9b67e21c464_originalDynamicSite712_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_49(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_53(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_69(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_73(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_82(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_84(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_88(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_95(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_97(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_101(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_112(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_114(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_116(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_117(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_02ebfbfb2bd5_invokedynamic12_121(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral742_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral746_0() throws E;
}
