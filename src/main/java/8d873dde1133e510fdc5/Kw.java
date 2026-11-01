package moom;


public class Kw extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

public Kw() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_084f790224c766cb(moom.Kw receiver) throws Throwable {

long local1 = (moom.Kw.f ^ 108311432090545L);

    moom.Kw.__sourceConstructorInit_084f790224c766cb_0(((moom.Kw)(receiver)), ((java.lang.Object)(moom.tv.class)), ((java.lang.String)(__sourceIntrinsic_084f790224c766cb_originalDynamicSite2350_2(21189, (5251394015831720754L ^ local1)))), ((float)(0x1.0p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_084f790224c766cb_0(moom.Kw a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(3573525576802466431L)), ((long)(3698401928584351676L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(203170906075119L)))));

    j = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.Kw.f ^ 33045026284695L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill790_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill790_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill790_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill790_14 = new byte[8];

    (__sourceSpill790_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill790_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation790_16 = __sourceSpill790_14;

    ((javax.crypto.Cipher)(__sourceSpill790_11)).init(((int)(__sourceSpill790_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill790_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation790_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[11];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "×ù\bûç\013ä8«ù$x\020\177ªÞz+ÊzÃ7lG\0172²d\020â[\004¢Ñ@À<¿4à;MZÊ\024\020æ+ÑæL´çC1Aé\\¸\020ËÂpKË%È\0355*®-r=\020\004V\t¯JéØÁ$¾$»\022\020\000<]$ï\020\bæòÏÄS\030I\020\000\007G½u \\Â³°\017I(ß\024\020°\004ÞvFIO°\1774\016\r½/."))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill790_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill790_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill790_29)).doFinal(((byte[])(__sourceSpill790_28)));

        java.lang.String __sourceSpill790_34 = ((java.lang.String)(moom.Kw.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill790_35 = local9_life19;

        int __sourceSpill790_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill790_35)[__sourceSpill790_36] = __sourceSpill790_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "Èvü!ôjDRG\017¯ÿYD\020c\034ìæuåvRÈógÃ"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill790_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill790_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill790_43)).doFinal(((byte[])(__sourceSpill790_42)));

        java.lang.String __sourceSpill790_48 = ((java.lang.String)(moom.Kw.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill790_49 = local9_life19;

        int __sourceSpill790_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill790_49)[__sourceSpill790_50] = __sourceSpill790_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    h = ((java.lang.String[])(local9_life19));

    i = ((java.lang.String[])(new java.lang.String[11]));
}


public java.lang.String[] b__ArrayString() {
long local1 = (moom.Kw.f ^ 21047397214778L);
    return new java.lang.String[] {__sourceIntrinsic_b33388dd40f1_originalDynamicSite1258_1(25610, (8564403129284496504L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1258_2(29413, (6985632335106939542L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1258_3(1141, (6306171945004329997L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1258_4(14487, (7317882570185822439L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1258_5(8247, (9073349270836627529L ^ local1))};
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
        byte[] spill2964_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2964_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2964_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2964_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2964_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2964_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18549);
    if (((moom.Kw.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Kw.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Kw.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Kw", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Kw.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Kw.i)[life5_8] = moom.Kw.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Kw.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Kw.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5805_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Kw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2525_12_0;
    int forwardValue2525_40_0;
    int forwardValue2525_55_0;
    int forwardValue2525_70_0;
    int forwardValue2525_85_0;
    moom.jD forwardValue2525_92_0;
    moom.iQ spill2525_0;
    boolean spill2525_1;
    long life3_3;
    int[] life5_5;
    moom.i2 life6_19;
    forward_join_92: {
    forward_join_91: {
    forward_join_85: {
    forward_join_78: {
    forward_join_70: {
    forward_join_63: {
    forward_join_55: {
    forward_join_48: {
    forward_join_40: {
    forward_join_33: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.Kw.f ^ 25597167274594L);
    life5_5 = moom.Km.b();
    spill2525_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2525_12_0 = spill2525_0;
        break forward_join_12;
    }
    if (!((((spill2525_0 instanceof moom.i2) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2525_12_0 = p0;
    }
    life6_19 = ((moom.i2)(forwardValue2525_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2525_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2525_4(20655, (6327368017199323272L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2525_40_0 = ((spill2525_1) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill2525_1)) {
        break forward_join_33;
    }
    forwardValue2525_92_0 = (((moom.i2)(life6_19)).i)[0];
    break forward_join_92;
    }
    forwardValue2525_40_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2525_8(7201, (56983473895281664L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2525_55_0 = forwardValue2525_40_0;
        break forward_join_55;
    }
    if (!((forwardValue2525_40_0 != 0))) {
        break forward_join_48;
    }
    forwardValue2525_92_0 = (((moom.i2)(life6_19)).i)[1];
    break forward_join_92;
    }
    forwardValue2525_55_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2525_12(4793, (6289141939293690524L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2525_70_0 = forwardValue2525_55_0;
        break forward_join_70;
    }
    if (!((forwardValue2525_55_0 != 0))) {
        break forward_join_63;
    }
    forwardValue2525_92_0 = (((moom.i2)(life6_19)).i)[2];
    break forward_join_92;
    }
    forwardValue2525_70_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2525_16(4722, (1012291710858926672L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2525_85_0 = forwardValue2525_70_0;
        break forward_join_85;
    }
    if (!((forwardValue2525_70_0 != 0))) {
        break forward_join_78;
    }
    forwardValue2525_92_0 = (((moom.i2)(life6_19)).i)[3];
    break forward_join_92;
    }
    forwardValue2525_85_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2525_20(9909, (5587580223722237590L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2525_85_0 != 0))) {
        break forward_join_91;
    }
    forwardValue2525_92_0 = (((moom.i2)(life6_19)).i)[4];
    break forward_join_92;
    }
    forwardValue2525_92_0 = null;
    }
    return forwardValue2525_92_0;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    moom.mC local4 = new moom.mC(local3);
    ((moom.mC)(local4)).i = ((moom.iQ)(p0));
    ((moom.mC)(local4)).c = ((float)(p1));
    return local4;
}


public moom.iQ a__iQ() {
return new moom.i2();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_084f790224c766cb_originalDynamicSite2350_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1258_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1258_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1258_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1258_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1258_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5805_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2525_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2525_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2525_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2525_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2525_20(int a0, long a1) throws E;
}
