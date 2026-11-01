package moom;


public class Kz extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

public Kz() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_5e2c29f4035c2984(moom.Kz receiver) throws Throwable {

long local1 = (moom.Kz.f ^ 100674576408058L);

    moom.Kz.__sourceConstructorInit_5e2c29f4035c2984_0(((moom.Kz)(receiver)), ((java.lang.Object)(net.minecraft.tileentity.TileEntityChest.class)), ((java.lang.String)(__sourceIntrinsic_5e2c29f4035c2984_originalDynamicSite2356_2(13666, (9116276310331445437L ^ local1)))), ((float)(0x0.0p0f)));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(6627833033846174304L)), ((long)(-4508264489652272688L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(248714068334217L)))));

    j = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.Kz.f ^ 131214066613471L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill793_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill793_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill793_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill793_14 = new byte[8];

    (__sourceSpill793_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill793_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation793_16 = __sourceSpill793_14;

    ((javax.crypto.Cipher)(__sourceSpill793_11)).init(((int)(__sourceSpill793_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill793_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation793_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[7];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "é}Q]p­?ð\tÕÁ\005È çî&\013\002ñ+ä7'àL=9oÕ[nbO°ÈÉ¤©¸e<\013¸<\020\020Û´Ö\027\031î­s¾¯d\033C\000\020\tUA\006*\005 ks×©èZ\022\020LâK\023\"~àÒË\000°uB"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill793_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill793_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill793_29)).doFinal(((byte[])(__sourceSpill793_28)));

        java.lang.String __sourceSpill793_34 = ((java.lang.String)(moom.Kz.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill793_35 = local9_life19;

        int __sourceSpill793_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill793_35)[__sourceSpill793_36] = __sourceSpill793_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "× \037T+%Vå\020<\006Iû©\023\020,Ó·ÛÉè§Ç¾[N-4\006"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill793_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill793_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill793_43)).doFinal(((byte[])(__sourceSpill793_42)));

        java.lang.String __sourceSpill793_48 = ((java.lang.String)(moom.Kz.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill793_49 = local9_life19;

        int __sourceSpill793_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill793_49)[__sourceSpill793_50] = __sourceSpill793_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    h = ((java.lang.String[])(local9_life19));

    i = ((java.lang.String[])(new java.lang.String[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_5e2c29f4035c2984_0(moom.Kz a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

public java.lang.String[] b__ArrayString() {
long local1 = (moom.Kz.f ^ 108934256158815L);
    return new java.lang.String[] {__sourceIntrinsic_b33388dd40f1_originalDynamicSite1261_1(18977, (1474726314215742046L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1261_2(28551, (8221072715579899897L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1261_3(6960, (931099723720444744L ^ local1))};
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
        byte[] spill2973_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2973_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2973_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2973_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2973_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2973_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 28788);
    if (((moom.Kz.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Kz.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Kz.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Kz", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Kz.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Kz.i)[life5_8] = moom.Kz.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Kz.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Kz.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5820_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Kz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2531_12_0;
    int forwardValue2531_38_0;
    int forwardValue2531_51_0;
    moom.jD forwardValue2531_56_0;
    moom.iQ spill2531_0;
    boolean spill2531_1;
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
    life3_3 = (moom.Kz.f ^ 113733134583815L);
    life5_5 = moom.Km.b();
    spill2531_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2531_12_0 = spill2531_0;
        break forward_join_12;
    }
    if (!((((spill2531_0 instanceof moom.i4) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2531_12_0 = p0;
    }
    life6_19 = ((moom.i4)(forwardValue2531_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2531_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2531_4(24878, (8732346551805268235L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2531_38_0 = ((spill2531_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2531_1)) {
        break forward_join_31;
    }
    forwardValue2531_56_0 = ((moom.i4)(life6_19)).i;
    break forward_join_56;
    }
    forwardValue2531_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2531_8(10722, (7516722595220396483L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2531_51_0 = forwardValue2531_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2531_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2531_56_0 = ((moom.i4)(life6_19)).j;
    break forward_join_56;
    }
    forwardValue2531_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2531_12(31079, (5929371035197819204L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2531_51_0 != 0))) {
        break forward_join_55;
    }
    forwardValue2531_56_0 = ((moom.i4)(life6_19)).k;
    break forward_join_56;
    }
    forwardValue2531_56_0 = null;
    }
    return forwardValue2531_56_0;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer forestValue12_20_0;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer forestValue12_37_0;
    int[] spill12_0;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer spill12_1;
    long life3_3;
    moom.oo life6_6;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer life7_10;
    int[] life5_11;
    forest_join_37: {
    forest_join_31: {
    forest_join_20: {
    forest_join_19: {
    life3_3 = (moom.Kz.f ^ 16885478195104L);
    spill12_0 = moom.Km.b();
    life6_6 = moom.oo.b;
    life7_10 = ((moom.oo)(life6_6)).a(((java.lang.Class)(net.minecraft.tileentity.TileEntityChest.class)));
    life5_11 = spill12_0;
    spill12_1 = life7_10;
    if (!((life5_11 != null))) {
        forestValue12_20_0 = spill12_1;
        break forest_join_20;
    }
    if (!((((spill12_1 instanceof net.minecraft.client.renderer.tileentity.TileEntityChestRenderer) ? 1 : 0) == 0))) {
        break forest_join_19;
    }
    return null;
    }
    forestValue12_20_0 = life7_10;
    }
    if (!((life5_11 != null))) {
        forestValue12_37_0 = forestValue12_20_0;
        break forest_join_37;
    }
    if (!((((net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer)(forestValue12_20_0)).a() == null))) {
        break forest_join_31;
    }
    life7_10 = new net.minecraft.client.renderer.tileentity.TileEntityChestRenderer();
    ((net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer)(life7_10)).a(((moom.oo)(life6_6)));
    }
    ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(life7_10)))).m = ((moom.i4)(((moom.i4)(p0))));
    forestValue12_37_0 = life7_10;
    }
    return forestValue12_37_0;
}


public moom.iQ a__iQ() {
return new moom.i5();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5e2c29f4035c2984_originalDynamicSite2356_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5820_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2531_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2531_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2531_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1261_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1261_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1261_3(int a0, long a1) throws E;
}
