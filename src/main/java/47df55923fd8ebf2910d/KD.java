package moom;


public class KD extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

public KD() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_1adf05bede02cec5(moom.KD receiver) throws Throwable {

long local1 = (moom.KD.f ^ 25207945804320L);

    moom.KD.__sourceConstructorInit_1adf05bede02cec5_0(((moom.KD)(receiver)), ((java.lang.Object)(moom.Cg.class)), ((java.lang.String)(__sourceIntrinsic_1adf05bede02cec5_originalDynamicSite2278_2(29256, (1493131874797166326L ^ local1)))), ((float)(0x0.0p0f)));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(1732200075713346586L)), ((long)(9042613965013007785L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(88271917173838L)))));

    j = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.KD.f ^ 27741595380721L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill751_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill751_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill751_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill751_14 = new byte[8];

    (__sourceSpill751_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill751_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation751_16 = __sourceSpill751_14;

    ((javax.crypto.Cipher)(__sourceSpill751_11)).init(((int)(__sourceSpill751_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill751_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation751_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[7];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "agrkeîQì\nUë\032j\020¬ Ô{\002G3É¯tJ5p òÐoaÍ±(ð}=>ç¼¿\034Râk­ÓA¯\035_IAP¥ \020¼aJnD\034ÑG\027óîú:O2\020ôÄò,í¼\b{~o\001P\002ùx"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill751_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill751_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill751_29)).doFinal(((byte[])(__sourceSpill751_28)));

        java.lang.String __sourceSpill751_34 = ((java.lang.String)(moom.KD.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill751_35 = local9_life19;

        int __sourceSpill751_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill751_35)[__sourceSpill751_36] = __sourceSpill751_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "âß&z¡Ií_Iáãr\020it«Jë«a¶Ë¬ÂÞ´ê"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill751_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill751_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill751_43)).doFinal(((byte[])(__sourceSpill751_42)));

        java.lang.String __sourceSpill751_48 = ((java.lang.String)(moom.KD.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill751_49 = local9_life19;

        int __sourceSpill751_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill751_49)[__sourceSpill751_50] = __sourceSpill751_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    h = ((java.lang.String[])(local9_life19));

    i = ((java.lang.String[])(new java.lang.String[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_1adf05bede02cec5_0(moom.KD a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

public java.lang.String[] b__ArrayString() {
long local1 = (moom.KD.f ^ 60425994067982L);
    return new java.lang.String[] {__sourceIntrinsic_b33388dd40f1_originalDynamicSite1233_1(23673, (316095508997794538L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1233_2(3932, (6428265699896539597L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1233_3(3362, (9117207736380242870L ^ local1))};
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
        byte[] spill2867_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2867_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2867_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2867_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2867_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2867_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5789);
    if (((moom.KD.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.KD.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.KD.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/KD", life9_51);
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
        life9_116 = ((java.lang.String)((moom.KD.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.KD.i)[life5_8] = moom.KD.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.KD.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.KD.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5619_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2467_12_0;
    int forwardValue2467_38_0;
    int forwardValue2467_51_0;
    moom.jD forwardValue2467_56_0;
    moom.iQ spill2467_0;
    boolean spill2467_1;
    long life3_3;
    int[] life5_5;
    moom.i4 life6_19;
    forward_join_56: {
    forward_join_55: {
    forward_join_51: {
    forward_join_44: {
    forward_join_38: {
    forward_join_31: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.KD.f ^ 55622802014294L);
    life5_5 = moom.Km.b();
    spill2467_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2467_12_0 = spill2467_0;
        break forward_join_12;
    }
    if (!((((spill2467_0 instanceof moom.i4) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2467_12_0 = p0;
    }
    life6_19 = ((moom.i4)(forwardValue2467_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2467_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2467_4(23570, (7197595039611882205L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2467_38_0 = ((spill2467_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2467_1)) {
        break forward_join_31;
    }
    forwardValue2467_56_0 = ((moom.i4)(life6_19)).i;
    break forward_join_56;
    }
    forwardValue2467_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2467_8(13713, (425161491836429151L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2467_51_0 = forwardValue2467_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2467_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2467_56_0 = ((moom.i4)(life6_19)).j;
    break forward_join_56;
    }
    forwardValue2467_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2467_12(2853, (6337398493788921327L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2467_51_0 != 0))) {
        break forward_join_55;
    }
    forwardValue2467_56_0 = ((moom.i4)(life6_19)).k;
    break forward_join_56;
    }
    forwardValue2467_56_0 = null;
    }
    return forwardValue2467_56_0;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer forestValue43_20_0;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer forestValue43_37_0;
    int[] spill43_0;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer spill43_1;
    long life3_3;
    moom.oo life6_6;
    int[] life5_7;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer life7_11;
    forest_join_37: {
    forest_join_31: {
    forest_join_20: {
    forest_join_19: {
    life3_3 = (moom.KD.f ^ 99769047382001L);
    spill43_0 = moom.Km.b();
    life6_6 = moom.oo.b;
    life5_7 = spill43_0;
    life7_11 = ((moom.oo)(life6_6)).a(((java.lang.Class)(moom.Cg.class)));
    spill43_1 = life7_11;
    if (!((life5_7 != null))) {
        forestValue43_20_0 = spill43_1;
        break forest_join_20;
    }
    if (!((((spill43_1 instanceof moom.ow) ? 1 : 0) == 0))) {
        break forest_join_19;
    }
    return null;
    }
    forestValue43_20_0 = life7_11;
    }
    if (!((life5_7 != null))) {
        forestValue43_37_0 = forestValue43_20_0;
        break forest_join_37;
    }
    if (!((((net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer)(forestValue43_20_0)).a() == null))) {
        break forest_join_31;
    }
    life7_11 = new moom.ow();
    ((net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer)(life7_11)).a(((moom.oo)(life6_6)));
    }
    ((moom.ow)(((moom.ow)(life7_11)))).g = ((moom.i4)(((moom.i4)(p0))));
    forestValue43_37_0 = life7_11;
    }
    return forestValue43_37_0;
}


public moom.iQ a__iQ() {
return new moom.i4();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1adf05bede02cec5_originalDynamicSite2278_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5619_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2467_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2467_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2467_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1233_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1233_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1233_3(int a0, long a1) throws E;
}
