package moom;


public class KF extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

public KF() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_1f043a61ebe78068(moom.KF receiver) throws Throwable {

long local1 = (moom.KF.f ^ 16570244215349L);

    moom.KF.__sourceConstructorInit_1f043a61ebe78068_0(((moom.KF)(receiver)), ((java.lang.Object)(net.minecraft.entity.monster.EntityEndermite.class)), ((java.lang.String)(__sourceIntrinsic_1f043a61ebe78068_originalDynamicSite2282_2(17406, (1421570752308314151L ^ local1)))), ((float)(0x1.333334p-2f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_1f043a61ebe78068_0(moom.KF a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(7677536583434973154L)), ((long)(-6497981910769275984L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(113945798420851L)))));

    j = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.KF.f ^ 321900297818L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill753_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill753_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill753_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill753_14 = new byte[8];

    (__sourceSpill753_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill753_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation753_16 = __sourceSpill753_14;

    ((javax.crypto.Cipher)(__sourceSpill753_11)).init(((int)(__sourceSpill753_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill753_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation753_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[6];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "¼vÖ\027ZïUÛ\007\002¼d³\020Drñ»În\020\f4\025\026o²âj\030eÚ°ïo(w[e\003\ndXÄÚÕrî`}\020õG÷:ºd=4æ{\016\022@æ"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill753_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill753_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill753_29)).doFinal(((byte[])(__sourceSpill753_28)));

        java.lang.String __sourceSpill753_34 = ((java.lang.String)(moom.KF.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill753_35 = local9_life19;

        int __sourceSpill753_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill753_35)[__sourceSpill753_36] = __sourceSpill753_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "¡\016î\022Àì\01775mº(!\020;»½~¤3¯WñÞ\"`ÀÁ"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill753_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill753_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill753_43)).doFinal(((byte[])(__sourceSpill753_42)));

        java.lang.String __sourceSpill753_48 = ((java.lang.String)(moom.KF.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill753_49 = local9_life19;

        int __sourceSpill753_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill753_49)[__sourceSpill753_50] = __sourceSpill753_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    h = ((java.lang.String[])(local9_life19));

    i = ((java.lang.String[])(new java.lang.String[6]));
}


public java.lang.String[] b__ArrayString() {
long local1 = (moom.KF.f ^ 63014608832042L);
    return new java.lang.String[] {__sourceIntrinsic_b33388dd40f1_originalDynamicSite1235_1(4185, (813208858204137368L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1235_2(22610, (3356635241061330837L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1235_3(25604, (636046981229351873L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1235_4(18079, (4934050412246905179L ^ local1))};
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
        byte[] spill2872_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2872_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2872_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2872_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2872_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2872_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 22475);
    if (((moom.KF.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.KF.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.KF.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/KF", life9_51);
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
        life9_116 = ((java.lang.String)((moom.KF.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.KF.i)[life5_8] = moom.KF.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.KF.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.KF.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5629_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2470_12_0;
    int forwardValue2470_50_0;
    moom.jD forwardValue2470_58_0;
    moom.iQ spill2470_0;
    int spill2470_1;
    long life3_3;
    int[] life5_5;
    moom.i_ life6_19;
    java.lang.String life7_31;
    moom.jD[] life8_38;
    java.lang.String life9_49;
    int life10_53;
    forward_join_59: {
    forward_join_58: {
    forward_join_57: {
    forward_join_50: {
    forward_join_35: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.KF.f ^ 67259453302386L);
    life5_5 = moom.Km.b();
    spill2470_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2470_12_0 = spill2470_0;
        break forward_join_12;
    }
    if (!((((spill2470_0 instanceof moom.i_) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2470_12_0 = p0;
    }
    life6_19 = ((moom.i_)(forwardValue2470_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    life7_31 = __sourceIntrinsic_38607ace6cb3_invokedynamic2470_4(29768, (8619431039059420112L ^ life3_3));
    if (!(((java.lang.String)(p1)).startsWith(((java.lang.String)(life7_31))))) {
        break forward_join_59;
    }
    life8_38 = ((moom.i_)(life6_19)).l;
    if (!((life8_38 == null))) {
        break forward_join_35;
    }
    return null;
    }
    life9_49 = ((java.lang.String)(p1)).substring(((int)(((java.lang.String)(life7_31)).length())));
    life10_53 = moom.BU.a(((java.lang.String)(life9_49)), ((int)(-1)));
    life10_53 += -1;
    spill2470_1 = life10_53;
    if (!((life5_5 != null))) {
        forwardValue2470_50_0 = spill2470_1;
        break forward_join_50;
    }
    if (!((spill2470_1 >= 0))) {
        break forward_join_57;
    }
    forwardValue2470_50_0 = life10_53;
    }
    if (!((forwardValue2470_50_0 < (life8_38).length))) {
        break forward_join_57;
    }
    forwardValue2470_58_0 = (life8_38)[life10_53];
    break forward_join_58;
    }
    forwardValue2470_58_0 = null;
    }
    return forwardValue2470_58_0;
    }
    return null;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    moom.m6 local4 = new moom.m6(local3);
    ((moom.m6)(local4)).m = ((moom.iQ)(p0));
    ((moom.m6)(local4)).c = ((float)(p1));
    return local4;
}


public moom.iQ a__iQ() {
return new moom.i_();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1f043a61ebe78068_originalDynamicSite2282_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1235_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1235_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1235_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1235_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5629_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2470_4(int a0, long a1) throws E;
}
