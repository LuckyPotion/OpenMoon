package moom;


public class K2 extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

public K2() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_054c4d6995b1f3f9(moom.K2 receiver) throws Throwable {

long local1 = (moom.K2.f ^ 73122999421451L);

    moom.K2.__sourceConstructorInit_054c4d6995b1f3f9_0(((moom.K2)(receiver)), ((java.lang.Object)(moom.sY.class)), ((java.lang.String)(__sourceIntrinsic_054c4d6995b1f3f9_originalDynamicSite2256_2(782, (6900298669877764710L ^ local1)))), ((float)(0x1.0p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_054c4d6995b1f3f9_0(moom.K2 a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(625020744738264865L)), ((long)(-5870707169473274843L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(187272116929974L)))));

    j = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.K2.f ^ 119484984661551L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill740_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill740_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill740_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill740_14 = new byte[8];

    (__sourceSpill740_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill740_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation740_16 = __sourceSpill740_14;

    ((javax.crypto.Cipher)(__sourceSpill740_11)).init(((int)(__sourceSpill740_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill740_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation740_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[11];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "|cÞ_§´äíÄ¼[Kf\005\003H\022QÃ«Þ[¾ÓÕï}Ð H Öüñ÷{\002ÑÆãÉmÁ\b\rLÀ,Ïká\030?\020\036 í§|êâàX~»eñ\t\031nØÛÞ\013Ä\020\022ZÐÇ\020Í6\001&èB\bAKi´Àx Ë_¬\033üI\fC\020\021«&\n@¨óY¸[O\035\"5Á,ðH\0063 9F\\­UÀC¼­~s>×)\f¡9Àc7©î\021¹¿ÀÕ\020ZtV\fÅ®\fdéQÈk)Ç\b\020Ø\004\\_'R:Ü!\r#^Y_² Ï\024!f!H\005vÇl\tû\"öOªüc2E:\"Rñ\002B"))).length();

    int local5_life24 = 32;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill740_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill740_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill740_29)).doFinal(((byte[])(__sourceSpill740_28)));

        java.lang.String __sourceSpill740_34 = ((java.lang.String)(moom.K2.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill740_35 = local9_life19;

        int __sourceSpill740_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill740_35)[__sourceSpill740_36] = __sourceSpill740_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "¨Âì©Ü2k\022VREPØ ö¯R\nmRjkQËi,KÏ\003ØÙ$ÐXÍ<rpòüf\034¶"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill740_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill740_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill740_43)).doFinal(((byte[])(__sourceSpill740_42)));

        java.lang.String __sourceSpill740_48 = ((java.lang.String)(moom.K2.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill740_49 = local9_life19;

        int __sourceSpill740_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill740_49)[__sourceSpill740_50] = __sourceSpill740_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    h = ((java.lang.String[])(local9_life19));

    i = ((java.lang.String[])(new java.lang.String[11]));
}


public java.lang.String[] b__ArrayString() {
long local1 = (moom.K2.f ^ 131959016061036L);
    return new java.lang.String[] {__sourceIntrinsic_b33388dd40f1_originalDynamicSite1223_1(19465, (60736781041917701L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1223_2(2803, (2860745914517035513L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1223_3(32507, (5783095720277569010L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1223_4(30996, (2364861935142234641L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1223_5(4428, (7403602473255338562L ^ local1))};
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
        byte[] spill2845_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2845_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2845_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2845_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2845_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2845_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13056);
    if (((moom.K2.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.K2.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.K2.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/K2", life9_51);
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
        life9_116 = ((java.lang.String)((moom.K2.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.K2.i)[life5_8] = moom.K2.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.K2.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.K2.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5572_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/K2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2456_12_0;
    int forwardValue2456_38_0;
    int forwardValue2456_51_0;
    int forwardValue2456_64_0;
    int forwardValue2456_77_0;
    moom.jD forwardValue2456_82_0;
    moom.iQ spill2456_0;
    boolean spill2456_1;
    long life3_3;
    int[] life5_5;
    moom.jt life6_19;
    forward_join_82: {
    forward_join_81: {
    forward_join_77: {
    forward_join_70: {
    forward_join_64: {
    forward_join_57: {
    forward_join_51: {
    forward_join_44: {
    forward_join_38: {
    forward_join_31: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.K2.f ^ 136784758741044L);
    life5_5 = moom.Km.b();
    spill2456_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2456_12_0 = spill2456_0;
        break forward_join_12;
    }
    if (!((((spill2456_0 instanceof moom.jt) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2456_12_0 = p0;
    }
    life6_19 = ((moom.jt)(forwardValue2456_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2456_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2456_4(2013, (2815515168165098627L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2456_38_0 = ((spill2456_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2456_1)) {
        break forward_join_31;
    }
    forwardValue2456_82_0 = ((moom.jt)(life6_19)).i;
    break forward_join_82;
    }
    forwardValue2456_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2456_8(29087, (5787129777527030464L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2456_51_0 = forwardValue2456_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2456_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2456_82_0 = ((moom.jt)(life6_19)).j;
    break forward_join_82;
    }
    forwardValue2456_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2456_12(8527, (2616357110156939807L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2456_64_0 = forwardValue2456_51_0;
        break forward_join_64;
    }
    if (!((forwardValue2456_51_0 != 0))) {
        break forward_join_57;
    }
    forwardValue2456_82_0 = ((moom.jt)(life6_19)).k;
    break forward_join_82;
    }
    forwardValue2456_64_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2456_16(25980, (8072751147171321391L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2456_77_0 = forwardValue2456_64_0;
        break forward_join_77;
    }
    if (!((forwardValue2456_64_0 != 0))) {
        break forward_join_70;
    }
    forwardValue2456_82_0 = ((moom.jt)(life6_19)).m;
    break forward_join_82;
    }
    forwardValue2456_77_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2456_20(751, (2950027294485672378L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2456_77_0 != 0))) {
        break forward_join_81;
    }
    forwardValue2456_82_0 = ((moom.jt)(life6_19)).l;
    break forward_join_82;
    }
    forwardValue2456_82_0 = null;
    }
    return forwardValue2456_82_0;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    moom.nj local4 = new moom.nj(local3);
    ((moom.nj)(local4)).m = ((moom.iQ)(p0));
    ((moom.nj)(local4)).c = ((float)(p1));
    return local4;
}


public moom.iQ a__iQ() {
return new moom.jt();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_054c4d6995b1f3f9_originalDynamicSite2256_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1223_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1223_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1223_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1223_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1223_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5572_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2456_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2456_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2456_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2456_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2456_20(int a0, long a1) throws E;
}
