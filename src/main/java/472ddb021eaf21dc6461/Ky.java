package moom;


public class Ky extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

public Ky() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_efbd04e717c94c66(moom.Ky receiver) throws Throwable {

long local1 = (moom.Ky.f ^ 96875048644114L);

    moom.Ky.__sourceConstructorInit_efbd04e717c94c66_0(((moom.Ky)(receiver)), ((java.lang.Object)(net.minecraft.tileentity.TileEntityChest.class)), ((java.lang.String)(__sourceIntrinsic_efbd04e717c94c66_originalDynamicSite2354_2(32277, (8852647834133353050L ^ local1)))), ((float)(0x0.0p0f)));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(3467107747563969161L)), ((long)(6218632488554474909L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(24815779879684L)))));

    j = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.Ky.f ^ 58384630975801L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill792_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill792_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill792_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill792_14 = new byte[8];

    (__sourceSpill792_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill792_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation792_16 = __sourceSpill792_14;

    ((javax.crypto.Cipher)(__sourceSpill792_11)).init(((int)(__sourceSpill792_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill792_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation792_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[7];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "\024çqàÈê\002æÑÌ©U{£\020\000WË\002Bjò+Møñq\177\020¬\b^\001\bAç4\013\"PR½·\020ïl}³Ó!ÁQXñÕCwk\032E\020ñg`Ê\rÿLù¼·ítÁ"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill792_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill792_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill792_29)).doFinal(((byte[])(__sourceSpill792_28)));

        java.lang.String __sourceSpill792_34 = ((java.lang.String)(moom.Ky.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill792_35 = local9_life19;

        int __sourceSpill792_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill792_35)[__sourceSpill792_36] = __sourceSpill792_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "~$~\"Ué¨'~IÜµ©U\020Í;ÉsÒÚ×452øól·¶`"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill792_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill792_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill792_43)).doFinal(((byte[])(__sourceSpill792_42)));

        java.lang.String __sourceSpill792_48 = ((java.lang.String)(moom.Ky.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill792_49 = local9_life19;

        int __sourceSpill792_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill792_49)[__sourceSpill792_50] = __sourceSpill792_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    h = ((java.lang.String[])(local9_life19));

    i = ((java.lang.String[])(new java.lang.String[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_efbd04e717c94c66_0(moom.Ky a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

public java.lang.String[] b__ArrayString() {
long local1 = (moom.Ky.f ^ 34135464311923L);
    return new java.lang.String[] {__sourceIntrinsic_b33388dd40f1_originalDynamicSite1260_1(2687, (2395346593021654101L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1260_2(22657, (9027068547999344296L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1260_3(26723, (1893079546866734668L ^ local1))};
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
        byte[] spill2970_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2970_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2970_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2970_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2970_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2970_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24101);
    if (((moom.Ky.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Ky.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Ky.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Ky", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Ky.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Ky.i)[life5_8] = moom.Ky.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Ky.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Ky.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5815_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ky"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2529_12_0;
    int forwardValue2529_38_0;
    int forwardValue2529_51_0;
    moom.jD forwardValue2529_56_0;
    moom.iQ spill2529_0;
    boolean spill2529_1;
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
    life3_3 = (moom.Ky.f ^ 30135580040235L);
    life5_5 = moom.Km.b();
    spill2529_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2529_12_0 = spill2529_0;
        break forward_join_12;
    }
    if (!((((spill2529_0 instanceof moom.i4) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2529_12_0 = p0;
    }
    life6_19 = ((moom.i4)(forwardValue2529_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2529_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2529_4(24430, (2773738463175852314L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2529_38_0 = ((spill2529_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2529_1)) {
        break forward_join_31;
    }
    forwardValue2529_56_0 = ((moom.i4)(life6_19)).i;
    break forward_join_56;
    }
    forwardValue2529_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2529_8(3599, (4320263240499040380L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2529_51_0 = forwardValue2529_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2529_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2529_56_0 = ((moom.i4)(life6_19)).j;
    break forward_join_56;
    }
    forwardValue2529_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2529_12(759, (7553709529091710087L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2529_51_0 != 0))) {
        break forward_join_55;
    }
    forwardValue2529_56_0 = ((moom.i4)(life6_19)).k;
    break forward_join_56;
    }
    forwardValue2529_56_0 = null;
    }
    return forwardValue2529_56_0;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer forestValue11_20_0;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer forestValue11_37_0;
    int[] spill11_0;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer spill11_1;
    long life3_3;
    moom.oo life6_6;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer life7_10;
    int[] life5_11;
    forest_join_37: {
    forest_join_31: {
    forest_join_20: {
    forest_join_19: {
    life3_3 = (moom.Ky.f ^ 126733872327564L);
    spill11_0 = moom.Km.b();
    life6_6 = moom.oo.b;
    life7_10 = ((moom.oo)(life6_6)).a(((java.lang.Class)(net.minecraft.tileentity.TileEntityChest.class)));
    life5_11 = spill11_0;
    spill11_1 = life7_10;
    if (!((life5_11 != null))) {
        forestValue11_20_0 = spill11_1;
        break forest_join_20;
    }
    if (!((((spill11_1 instanceof net.minecraft.client.renderer.tileentity.TileEntityChestRenderer) ? 1 : 0) == 0))) {
        break forest_join_19;
    }
    return null;
    }
    forestValue11_20_0 = life7_10;
    }
    if (!((life5_11 != null))) {
        forestValue11_37_0 = forestValue11_20_0;
        break forest_join_37;
    }
    if (!((((net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer)(forestValue11_20_0)).a() == null))) {
        break forest_join_31;
    }
    life7_10 = new net.minecraft.client.renderer.tileentity.TileEntityChestRenderer();
    ((net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer)(life7_10)).a(((moom.oo)(life6_6)));
    }
    ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(life7_10)))).l = ((moom.i4)(((moom.i4)(p0))));
    forestValue11_37_0 = life7_10;
    }
    return forestValue11_37_0;
}


public moom.iQ a__iQ() {
return new moom.i4();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_efbd04e717c94c66_originalDynamicSite2354_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5815_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2529_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2529_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2529_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1260_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1260_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1260_3(int a0, long a1) throws E;
}
