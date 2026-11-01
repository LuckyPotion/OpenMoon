package moom;


public class Kq extends moom.Kp {

private static long f;

private static java.lang.String[] l;

private static java.lang.String[] m;

private static java.util.Map n;

public Kq() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_abdbb8990363c433(moom.Kq receiver) throws Throwable {

long local1 = (moom.Kq.f ^ 119662832138420L);

    moom.Kq.__sourceConstructorInit_abdbb8990363c433_0(((moom.Kq)(receiver)), ((java.lang.Object)(net.minecraft.entity.item.EntityArmorStand.class)), ((java.lang.String)(__sourceIntrinsic_abdbb8990363c433_originalDynamicSite2338_2(5089, (5941969927239737071L ^ local1)))), ((float)(0x0.0p0f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_abdbb8990363c433_0(moom.Kq a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(-6356258113472376003L)), ((long)(-5434386951301955L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(54527161861207L)))));

    n = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.Kq.f ^ 92132330147451L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill784_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill784_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill784_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill784_14 = new byte[8];

    (__sourceSpill784_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill784_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation784_16 = __sourceSpill784_14;

    ((javax.crypto.Cipher)(__sourceSpill784_11)).init(((int)(__sourceSpill784_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill784_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation784_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[9];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "-6£xzËÒ0Øo#_Y\026·\020&±¢Cá{¨¨\030ñ wîa\020ò\0027ÑE\033?p4\003{~É<î\020>Þ¾_>ÝÆl.\"öýa@X\020>\017\bÖ\036\021Bª]áom \b\020Á\007C÷¨Mk\\ÎÈ±ÊÈá\030\034zJþÁ|\021Ý7ØË\004ohù¯Ý\007ÎVê¦%"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill784_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill784_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill784_29)).doFinal(((byte[])(__sourceSpill784_28)));

        java.lang.String __sourceSpill784_34 = ((java.lang.String)(moom.Kq.b(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill784_35 = local9_life19;

        int __sourceSpill784_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill784_35)[__sourceSpill784_36] = __sourceSpill784_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "ü\\`>z´@qÎ\034l 7zÍÒ\020L,I1ôHÚ,\036b\021¤Ý"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill784_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill784_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill784_43)).doFinal(((byte[])(__sourceSpill784_42)));

        java.lang.String __sourceSpill784_48 = ((java.lang.String)(moom.Kq.b(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill784_49 = local9_life19;

        int __sourceSpill784_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill784_49)[__sourceSpill784_50] = __sourceSpill784_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    l = ((java.lang.String[])(local9_life19));

    m = ((java.lang.String[])(new java.lang.String[9]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5790_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Kq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill2956_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2956_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2956_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2956_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2956_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2956_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8397);
    if (((moom.Kq.m)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Kq.n)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Kq.n)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Kq", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Kq.l)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Kq.m)[life5_8] = moom.Kq.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Kq.m)[life5_8];
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Kq.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String[] b__ArrayString() {
long local1 = (moom.Kq.f ^ 73419159483774L);
    java.lang.String[] local3 = super.b__ArrayString();
    local3 = ((java.lang.String[])(moom.BU.a(((java.lang.Object[])(local3)), ((java.lang.Object[])(new java.lang.String[] {__sourceIntrinsic_b33388dd40f1_originalDynamicSite1256_2(18149, (8595785033685157408L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1256_3(24578, (3406352985342566596L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1256_4(19855, (5297350637353291085L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1256_5(378, (4099851581441311162L ^ local1))})))));
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2523_12_0;
    int forwardValue2523_38_0;
    int forwardValue2523_51_0;
    int forwardValue2523_64_0;
    moom.jD forwardValue2523_72_0;
    moom.iQ spill2523_0;
    boolean spill2523_1;
    long life3_3;
    int[] life5_5;
    moom.iV life6_19;
    forward_join_72: {
    forward_join_68: {
    forward_join_64: {
    forward_join_57: {
    forward_join_51: {
    forward_join_44: {
    forward_join_38: {
    forward_join_31: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.Kq.f ^ 77676871800102L);
    life5_5 = moom.Km.b();
    spill2523_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2523_12_0 = spill2523_0;
        break forward_join_12;
    }
    if (!((((spill2523_0 instanceof moom.iV) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2523_12_0 = p0;
    }
    life6_19 = ((moom.iV)(forwardValue2523_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2523_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2523_4(9653, (8387023817423111463L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2523_38_0 = ((spill2523_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2523_1)) {
        break forward_join_31;
    }
    forwardValue2523_72_0 = ((moom.iV)(life6_19)).t;
    break forward_join_72;
    }
    forwardValue2523_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2523_8(10806, (7973407073084590765L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2523_51_0 = forwardValue2523_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2523_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2523_72_0 = ((moom.iV)(life6_19)).u;
    break forward_join_72;
    }
    forwardValue2523_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2523_12(24597, (724747710487462026L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2523_64_0 = forwardValue2523_51_0;
        break forward_join_64;
    }
    if (!((forwardValue2523_51_0 != 0))) {
        break forward_join_57;
    }
    forwardValue2523_72_0 = ((moom.iV)(life6_19)).v;
    break forward_join_72;
    }
    forwardValue2523_64_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2523_16(24276, (7015144901732122189L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2523_64_0 != 0))) {
        break forward_join_68;
    }
    forwardValue2523_72_0 = ((moom.iV)(life6_19)).w;
    break forward_join_72;
    }
    forwardValue2523_72_0 = super.a(((moom.iQ)(life6_19)), ((java.lang.String)(p1)));
    }
    return forwardValue2523_72_0;
}


public moom.iQ a__iQ() {
return new moom.iV();
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    moom.mT local4 = new moom.mT(local3);
    ((moom.mT)(local4)).m = ((moom.iQ)(p0));
    ((moom.mT)(local4)).c = ((float)(p1));
    return local4;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_abdbb8990363c433_originalDynamicSite2338_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5790_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1256_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1256_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1256_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1256_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2523_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2523_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2523_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2523_16(int a0, long a1) throws E;
}
