package moom;


public class M8 extends moom.M7 {

private moom.Nh[] j;

private moom.M7[] k;

private static long l;

private static java.lang.String[] n;

private static java.lang.String[] o;

private static java.util.Map s;

public M8(moom.Nh[] p0, moom.M7[] p1) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (java.lang.String[])null, (java.lang.String)null, (java.lang.String)null); }


private static void __sourceConstructorBody_23fae83ed6daf279(moom.M8 receiver, moom.Nh[] p0, moom.M7[] p1) throws Throwable {

long local3 = (moom.M8.l ^ 29713977612701L);

    moom.M8.__sourceConstructorInit_23fae83ed6daf279_0(((moom.M8)(receiver)), ((java.lang.String)(__sourceIntrinsic_23fae83ed6daf279_originalDynamicSite2412_1(5726, (9146616707553450733L ^ local3)))), ((java.lang.String)("")), ((java.lang.String)(moom.M8.a(((moom.Nh[])(p0)), ((moom.M7[])(p1))))), ((java.lang.String[])(moom.M8.a(((moom.Nh[])(p0))))), ((java.lang.String)(moom.M8.a(((moom.Nh[])(p0)), ((moom.M7[])(p1)), ((boolean)(true))))), ((java.lang.Object)(null)));

    ((moom.M8)(receiver)).j = ((moom.Nh[])(null));

    ((moom.M8)(receiver)).k = ((moom.M7[])(null));

    ((moom.M8)(receiver)).j = ((moom.Nh[])(p0));

    ((moom.M8)(receiver)).k = ((moom.M7[])(p1));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_23fae83ed6daf279_0(moom.M8 a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String[] a4, java.lang.String a5, java.lang.Object a6) throws E;

static {
l = ((long)(((moom._a)(moom._c.a(((long)(6150194286065879298L)), ((long)(8747660166567839724L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(158176543090300L)))));

    s = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.M8.l ^ 128876555712342L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill827_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill827_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill827_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill827_14 = new byte[8];

    (__sourceSpill827_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill827_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation827_16 = __sourceSpill827_14;

    ((javax.crypto.Cipher)(__sourceSpill827_11)).init(((int)(__sourceSpill827_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill827_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation827_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[13];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "Ç\024`<Ú ÿvø Xg\000ûèwá/×£\000:øhahÐ$\"àd\001\033Ê¼u\020\017\004µ(á³>ÿ·[[Æ\fã2ê\030`\016?\002Iäæ\021v²[´fB\bÒ$æ|\037\006D <±½Yo\022\030pUeP0+w+ÿ\006\021\027i\023iå?)\\Y\020o×(Uk6üìå8bý¤\r(µØ×ÝØ)@¶|¯b\0216\037\"M\036ºm2¨ÔC,\025ï5ôêåe¼\000\030ÛI)\000û\0206Ê8¬u#Äð¾\005)\f9øi W\024ÅÙãÐè\027\033ÌÝÞ¦¯µÁ1\177YÕ:?è]DÔö\r$ \005\027\031ýt\r9q\016Ú7_ùtó³\001%Ú¥ÊÓ?Ö¡áé ùyYVÆ°¢\032\024\177by<ÕÊPG\037?k­\023/lOÂ\030\027T_+>ÂÖ[uOøosúÛ,Ü,Ý«e"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill827_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill827_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill827_29)).doFinal(((byte[])(__sourceSpill827_28)));

        java.lang.String __sourceSpill827_34 = ((java.lang.String)(moom.M8.b(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill827_35 = local9_life19;

        int __sourceSpill827_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill827_35)[__sourceSpill827_36] = __sourceSpill827_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "I!¦¶¦\035\001\\\"qæÄ\020úõ­ðÃ9\fT1_'¨zùCÁ"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill827_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill827_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill827_43)).doFinal(((byte[])(__sourceSpill827_42)));

        java.lang.String __sourceSpill827_48 = ((java.lang.String)(moom.M8.b(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill827_49 = local9_life19;

        int __sourceSpill827_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill827_49)[__sourceSpill827_50] = __sourceSpill827_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    n = ((java.lang.String[])(local9_life19));

    o = ((java.lang.String[])(new java.lang.String[13]));
}


public java.lang.String b(java.lang.String p0) {
java.lang.String forwardValue2651_21_0;
    java.lang.String forwardValue2651_27_0;
    java.lang.String spill2651_0;
    long life2_3;
    int[] life4_5;
    forward_join_27: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.M8.l ^ 53417090423441L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2651_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue2651_21_0 = spill2651_0;
        break forward_join_21;
    }
    if (!(((java.lang.String)(spill2651_0)).equals(((java.lang.Object)(__sourceIntrinsic_73d8ac8b7602_invokedynamic2651_2(13643, (1072142537777150715L ^ life2_3))))))) {
        break forward_join_22;
    }
    forwardValue2651_21_0 = __sourceIntrinsic_73d8ac8b7602_invokedynamic2651_4(27444, (7802784590940972169L ^ life2_3));
    }
    forwardValue2651_27_0 = forwardValue2651_21_0;
    break forward_join_27;
    }
    forwardValue2651_27_0 = __sourceIntrinsic_73d8ac8b7602_invokedynamic2651_5(28711, (4397421562952597394L ^ life2_3));
    }
    return forwardValue2651_27_0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6058_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/M8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill3123_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3123_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3123_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3123_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3123_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3123_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21646);
    if (((moom.M8.o)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.M8.s)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.M8.s)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/M8", life9_51);
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
        life9_116 = ((java.lang.String)((moom.M8.n)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.M8.o)[life5_8] = moom.M8.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.M8.o)[life5_8];
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.M8.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b__Void() {
moom.M8 forwardValue2652_22_0;
    int[] spill2652_0;
    moom.M8 spill2652_1;
    long life1_3;
    int[] life3_7;
    forward_join_22: {
    forward_join_21: {
    life1_3 = (moom.M8.l ^ 931536193095L);
    spill2652_0 = moom.M7.b__ArrayInt();
    super.b__Void();
    life3_7 = spill2652_0;
    spill2652_1 = this;
    if (!((life3_7 == null))) {
        forwardValue2652_22_0 = spill2652_1;
        break forward_join_22;
    }
    if (!(((java.lang.String)(((moom.M8)(spill2652_1)).d())).equals(((java.lang.Object)(__sourceIntrinsic_9bf881b104f5_invokedynamic2652_4(13643, (1072195055577179693L ^ life1_3))))))) {
        break forward_join_21;
    }
    super.b__Void();
    }
    forwardValue2652_22_0 = this;
    }
    ((moom.M8)(forwardValue2652_22_0)).e__sourceReturn_da8c82d5d4();
    return;
}


private void e__sourceReturn_da8c82d5d4() {
moom.Nh lexicalValue947_16_0;
    int[] spill947_0;
    moom.Nh spill947_1;
    long life1_3;
    moom.Nh life4_9;
    int[] life3_10;
    java.lang.String[] life5_20;
    java.lang.String[] life6_22;
    int life7_25;
    int life8_27;
    java.lang.String life9_34;
    moom.M7 life10_38;
    java.lang.String life11_49;
    lexical_join_51: {
    lexical_join_16: {
    life1_3 = (moom.M8.l ^ 90664786670386L);
    spill947_0 = moom.M7.b__ArrayInt();
    life4_9 = ((moom.M8)(this)).a__Nh(((java.lang.String)(((moom.M8)(this)).d())));
    life3_10 = spill947_0;
    spill947_1 = life4_9;
    if (!((life3_10 == null))) {
        lexicalValue947_16_0 = spill947_1;
        break lexical_join_16;
    }
    if (!((spill947_1 != null))) {
        break lexical_join_51;
    }
    lexicalValue947_16_0 = life4_9;
    }
    life5_20 = ((moom.Nh)(lexicalValue947_16_0)).a__ArrayString();
    life6_22 = life5_20;
    life7_25 = (life6_22).length;
    life8_27 = 0;
    lexical_cycle_25: while (true) {
    lexical_join_49: {
    lexical_join_48: {
    if (!((life8_27 < life7_25))) {
        break lexical_join_51;
    }
    life9_34 = (life6_22)[life8_27];
    life10_38 = ((moom.M8)(this)).a__M7(((java.lang.String)(life9_34)));
    if (!((life3_10 == null))) {
        break lexical_join_49;
    }
    if (!((life10_38 != null))) {
        break lexical_join_48;
    }
    life11_49 = ((moom.Nh)(life4_9)).a(((java.lang.String)(life9_34)));
    ((moom.M7)(life10_38)).a__Boolean(((java.lang.String)(life11_49)));
    }
    life8_27 += 1;
    }
    if (!((life3_10 != null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    return;
}


public java.lang.String c() {
java.lang.String lexicalValue946_19_0;
    java.lang.String lexicalValue946_95_0;
    int[] spill946_0;
    java.lang.String spill946_1;
    java.lang.String spill946_2;
    long life1_3;
    java.lang.String life4_12;
    int[] life3_13;
    java.lang.StringBuilder life5_26;
    moom.Nh[] life6_29;
    int life7_32;
    int life8_34;
    moom.Nh life9_41;
    java.lang.String life10_44;
    java.lang.String life11_72;
    lexical_join_95: {
    lexical_join_93: {
    lexical_join_20: {
    lexical_join_19: {
    life1_3 = (moom.M8.l ^ 62997524593635L);
    spill946_0 = moom.M7.b__ArrayInt();
    life4_12 = moom.MP.a(((java.lang.String)(__sourceIntrinsic_fe670a2392c4_invokedynamic946_2(29003, (8978728096532275075L ^ life1_3)))), ((java.lang.String)(null)));
    life3_13 = spill946_0;
    spill946_1 = life4_12;
    if (!((life3_13 == null))) {
        lexicalValue946_19_0 = spill946_1;
        break lexical_join_19;
    }
    if (!((spill946_1 != null))) {
        break lexical_join_20;
    }
    lexicalValue946_19_0 = life4_12;
    }
    return lexicalValue946_19_0;
    }
    life5_26 = new java.lang.StringBuilder();
    life6_29 = this.j;
    life7_32 = (life6_29).length;
    life8_34 = 0;
    lexical_cycle_32: while (true) {
    lexical_join_91: {
    lexical_join_90: {
    if (!((life8_34 < life7_32))) {
        break lexical_join_93;
    }
    life9_41 = (life6_29)[life8_34];
    life10_44 = ((moom.Nh)(life9_41)).a();
    if (!((life3_13 == null))) {
        break lexical_join_91;
    }
    spill946_2 = life10_44;
    if (!((life3_13 == null))) {
        lexicalValue946_95_0 = spill946_2;
        break lexical_join_95;
    }
    if (!((spill946_2 != null))) {
        break lexical_join_90;
    }
    java.lang.String __stackOp946_7_0 = life10_44;
    java.lang.String __stackOp946_7_1 = __sourceIntrinsic_fe670a2392c4_invokedynamic946_6(16422, (1434424349200789228L ^ life1_3));
    life11_72 = moom.MP.a(((java.lang.String)(__sourceIntrinsic_fe670a2392c4_invokedynamic946_9(__stackOp946_7_1, __stackOp946_7_0, __sourceIntrinsic_fe670a2392c4_invokedynamic946_8(11007, (476761824208176188L ^ life1_3))))), ((java.lang.String)(null)));
    if (!((life3_13 == null))) {
        break lexical_join_91;
    }
    if (!((life11_72 != null))) {
        break lexical_join_90;
    }
    ((java.lang.StringBuilder)(life5_26)).append(((java.lang.String)(life11_72)));
    if (!((life3_13 == null))) {
        break lexical_join_91;
    }
    if (!((!((java.lang.String)(life11_72)).endsWith(((java.lang.String)(__sourceIntrinsic_fe670a2392c4_invokedynamic946_12(7255, (5741920787079164572L ^ life1_3)))))))) {
        break lexical_join_90;
    }
    ((java.lang.StringBuilder)(life5_26)).append(((java.lang.String)(__sourceIntrinsic_fe670a2392c4_invokedynamic946_14(16114, (5011709950686122034L ^ life1_3)))));
    }
    life8_34 += 1;
    }
    if (!((life3_13 != null))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    lexicalValue946_95_0 = ((java.lang.StringBuilder)(life5_26)).toString();
    }
    return lexicalValue946_95_0;
}


public java.lang.String f() {
long local1 = (moom.M8.l ^ 104505271780097L);
    return moom.JM.a(((java.lang.String)(__sourceIntrinsic_1bc14720020d_originalDynamicSite1282_1(5616, (2106247968739247068L ^ local1)))));
}


public void d__sourceReturn_da8c82d5d4() {
long life1_3;
    moom.Nh life3_8;
    java.lang.String life4_20;
    life1_3 = (moom.M8.l ^ 135614351565039L);
    life3_8 = ((moom.M8)(this)).a__Nh(((java.lang.String)(((moom.M8)(this)).d())));
    if ((!moom.MO.a(((moom.Nh)(life3_8)), ((moom.M7[])(this.k)), ((boolean)(false))))) {
        life4_20 = moom.M8.a(((moom.Nh[])(this.j)), ((moom.M7[])(this.k)));
        ((moom.M8)(this)).a__Boolean(((java.lang.String)(life4_20)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a(java.lang.String p0) {
java.lang.String forwardValue2646_37_0;
    java.lang.String forwardValue2646_37_1;
    java.lang.String forwardValue2646_38_0;
    java.lang.String spill2646_0;
    java.lang.String spill2646_1;
    long life2_3;
    int[] life4_5;
    forward_join_38: {
    forward_join_37: {
    forward_join_28: {
    life2_3 = (moom.M8.l ^ 70833344875341L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2646_0 = p0;
    spill2646_1 = __sourceIntrinsic_c43bc540f167_invokedynamic2646_2(165, (6259929854033649354L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue2646_37_0 = spill2646_0;
        forwardValue2646_37_1 = spill2646_1;
        break forward_join_37;
    }
    if (!(((java.lang.String)(spill2646_0)).equals(((java.lang.Object)(spill2646_1))))) {
        break forward_join_28;
    }
    forwardValue2646_38_0 = moom.JM.a(((java.lang.String)(__sourceIntrinsic_c43bc540f167_invokedynamic2646_4(8721, (8634032211692026998L ^ life2_3)))), ((java.lang.String)(__sourceIntrinsic_c43bc540f167_invokedynamic2646_5(13643, (1072264682307709735L ^ life2_3)))));
    break forward_join_38;
    }
    java.lang.String __stackOp2646_8_0 = p0;
    java.lang.String __stackOp2646_8_1 = __sourceIntrinsic_c43bc540f167_invokedynamic2646_7(4814, (1009314544617770156L ^ life2_3));
    forwardValue2646_37_0 = __sourceIntrinsic_c43bc540f167_invokedynamic2646_9(__stackOp2646_8_1, __stackOp2646_8_0);
    forwardValue2646_37_1 = p0;
    }
    forwardValue2646_38_0 = moom.MP.a(((java.lang.String)(forwardValue2646_37_0)), ((java.lang.String)(forwardValue2646_37_1)));
    }
    return forwardValue2646_38_0;
}


private moom.Nh a__Nh(java.lang.String p0) {
int[] spill945_0;
    long life2_3;
    moom.Nh[] life5_7;
    int life6_10;
    int[] life4_11;
    int life7_13;
    moom.Nh life8_20;
    lexical_join_33: {
    life2_3 = (moom.M8.l ^ 2887886051451L);
    spill945_0 = moom.M7.b__ArrayInt();
    life5_7 = this.j;
    life6_10 = (life5_7).length;
    life4_11 = spill945_0;
    life7_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    if (!((life7_13 < life6_10))) {
        break lexical_join_33;
    }
    life8_20 = (life5_7)[life7_13];
    if (!((life4_11 == null))) {
        break lexical_join_31;
    }
    if (!(((java.lang.String)(((moom.Nh)(life8_20)).a())).equals(((java.lang.Object)(p0))))) {
        break lexical_join_30;
    }
    return life8_20;
    }
    life7_13 += 1;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return null;
}


private static java.lang.String a(moom.Nh[] p0, moom.M7[] p1) {
return moom.M8.a(((moom.Nh[])(p0)), ((moom.M7[])(p1)), ((boolean)(false)));
}


private static java.lang.String a(moom.Nh[] p0, moom.M7[] p1, boolean p2) {
moom.Nh forwardValue2648_22_0;
    java.lang.String forwardValue2648_23_0;
    int[] spill2648_0;
    moom.Nh spill2648_1;
    long life3_3;
    moom.Nh life6_9;
    int[] life5_10;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life3_3 = (moom.M8.l ^ 54325613236756L);
    spill2648_0 = moom.M7.b__ArrayInt();
    life6_9 = moom.MO.a(((moom.Nh[])(p0)), ((moom.M7[])(p1)), ((boolean)(p2)));
    life5_10 = spill2648_0;
    spill2648_1 = life6_9;
    if (!((life5_10 == null))) {
        forwardValue2648_22_0 = spill2648_1;
        break forward_join_22;
    }
    if (!((spill2648_1 == null))) {
        break forward_join_21;
    }
    forwardValue2648_23_0 = __sourceIntrinsic_7674714d8d78_invokedynamic2648_3(13643, (1072140422368260734L ^ life3_3));
    break forward_join_23;
    }
    forwardValue2648_22_0 = life6_9;
    }
    forwardValue2648_23_0 = ((moom.Nh)(forwardValue2648_22_0)).a();
    }
    return forwardValue2648_23_0;
}


private static java.lang.String[] a(moom.Nh[] p0) {
int[] spill943_0;
    long life1_3;
    java.util.ArrayList life4_7;
    moom.Nh[] life5_9;
    int life6_12;
    int life7_15;
    int[] life3_16;
    moom.Nh life8_23;
    lexical_join_42: {
    lexical_join_34: {
    life1_3 = (moom.M8.l ^ 88210309748488L);
    life4_7 = new java.util.ArrayList();
    life5_9 = p0;
    life6_12 = (life5_9).length;
    spill943_0 = moom.M7.b__ArrayInt();
    life7_15 = 0;
    life3_16 = spill943_0;
    lexical_cycle_17: while (true) {
    if (!((life7_15 < life6_12))) {
        break lexical_join_34;
    }
    life8_23 = (life5_9)[life7_15];
    ((java.util.List)(life4_7)).add(((java.lang.Object)(((moom.Nh)(life8_23)).a())));
    life7_15 += 1;
    if (!((life3_16 == null))) {
        break lexical_join_42;
    }
    if (!((life3_16 != null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    ((java.util.List)(life4_7)).add(((java.lang.Object)(__sourceIntrinsic_e147a559db17_invokedynamic943_4(13643, (1072247424930838370L ^ life1_3)))));
    }
    return ((java.lang.String[])(((java.util.List)(life4_7)).toArray(((java.lang.Object[])(new java.lang.String[0])))));
}


private moom.M7 a__M7(java.lang.String p0) {
int[] spill944_0;
    long life2_3;
    moom.M7[] life5_7;
    int life6_10;
    int[] life4_11;
    int life7_13;
    moom.M7 life8_20;
    lexical_join_33: {
    life2_3 = (moom.M8.l ^ 55759603830298L);
    spill944_0 = moom.M7.b__ArrayInt();
    life5_7 = this.k;
    life6_10 = (life5_7).length;
    life4_11 = spill944_0;
    life7_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    if (!((life7_13 < life6_10))) {
        break lexical_join_33;
    }
    life8_20 = (life5_7)[life7_13];
    if (!((life4_11 == null))) {
        break lexical_join_31;
    }
    if (!(((java.lang.String)(((moom.M7)(life8_20)).a__String())).equals(((java.lang.Object)(p0))))) {
        break lexical_join_30;
    }
    return life8_20;
    }
    life7_13 += 1;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return null;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_23fae83ed6daf279_originalDynamicSite2412_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_73d8ac8b7602_invokedynamic2651_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_73d8ac8b7602_invokedynamic2651_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_73d8ac8b7602_invokedynamic2651_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6058_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic2652_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_invokedynamic946_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_invokedynamic946_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_invokedynamic946_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_invokedynamic946_9(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_invokedynamic946_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_invokedynamic946_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1bc14720020d_originalDynamicSite1282_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_invokedynamic2646_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_invokedynamic2646_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_invokedynamic2646_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_invokedynamic2646_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_invokedynamic2646_9(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7674714d8d78_invokedynamic2648_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e147a559db17_invokedynamic943_4(int a0, long a1) throws E;
}
