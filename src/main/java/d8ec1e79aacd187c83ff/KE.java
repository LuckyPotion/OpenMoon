package moom;


public class KE extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

public KE() { this((java.lang.String)null); }


private static void __sourceConstructorBody_3ec1d729617257f8(moom.KE receiver) throws Throwable {

long local1_life1 = (moom.KE.f ^ 23128148911731L);

    moom.KE.__sourceConstructorInit_3ec1d729617257f8_0(((moom.KE)(receiver)), ((java.lang.String)(__sourceIntrinsic_3ec1d729617257f8_originalDynamicSite658_2(16019, (3236871630372211484L ^ local1_life1)))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3ec1d729617257f8_0(moom.KE a0, java.lang.String a1) throws E;

protected KE(java.lang.String p0) {
super(moom.tw.class, p0, 0x1.0000000000000p-1f);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-5102170450960347119L)), ((long)(3945874120812759124L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(103696330357291L)))));

    j = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.KE.f ^ 77490925187956L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill752_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill752_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill752_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill752_14 = new byte[8];

    (__sourceSpill752_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill752_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation752_16 = __sourceSpill752_14;

    ((javax.crypto.Cipher)(__sourceSpill752_11)).init(((int)(__sourceSpill752_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill752_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation752_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[8];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "¸û\000¥Ö\001¨ñ]Ü\036ôÖz¨\020Óá­Ò´\036@tÊîÂô*\1778¸\r\026³x\030(!øb(í÷Ý\007àçî¤·ßë¥\"RÂè\025ÖÔ7õ#M@q¿ d\fh¹&\035rÔ\033ÚÌh\020ËËÿ³\026Ã\021½ª¥\0053\032\fT\020°zÞS\031Ñ·í<=H«Æ* ÷\005\016Ö_\035íá|¯ÀÈvbyà}\003§îi\f@^L\001ò"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill752_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill752_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill752_29)).doFinal(((byte[])(__sourceSpill752_28)));

        java.lang.String __sourceSpill752_34 = ((java.lang.String)(moom.KE.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill752_35 = local9_life19;

        int __sourceSpill752_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill752_35)[__sourceSpill752_36] = __sourceSpill752_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "uêçv\\%NÄ6î­ãÌ|S\020Â\006XÉÿY\004®Ûi½¤¹K\004ü"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill752_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill752_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill752_43)).doFinal(((byte[])(__sourceSpill752_42)));

        java.lang.String __sourceSpill752_48 = ((java.lang.String)(moom.KE.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill752_49 = local9_life19;

        int __sourceSpill752_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill752_49)[__sourceSpill752_50] = __sourceSpill752_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    h = ((java.lang.String[])(local9_life19));

    i = ((java.lang.String[])(new java.lang.String[8]));
}


public java.lang.String[] b__ArrayString() {
long local1 = (moom.KE.f ^ 33471220632120L);
    return new java.lang.String[] {__sourceIntrinsic_b33388dd40f1_originalDynamicSite1234_1(17371, (7151904856121514524L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1234_2(13532, (2701014628221316381L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1234_3(25398, (5378403801201818355L ^ local1))};
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
        byte[] spill2870_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2870_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2870_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2870_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2870_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2870_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 31182);
    if (((moom.KE.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.KE.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.KE.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/KE", life9_51);
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
        life9_116 = ((java.lang.String)((moom.KE.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.KE.i)[life5_8] = moom.KE.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.KE.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.KE.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5624_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2469_12_0;
    int forwardValue2469_38_0;
    int forwardValue2469_51_0;
    moom.jD forwardValue2469_56_0;
    moom.iQ spill2469_0;
    boolean spill2469_1;
    long life3_3;
    int[] life5_5;
    moom.i9 life6_19;
    forward_join_56: {
    forward_join_55: {
    forward_join_51: {
    forward_join_44: {
    forward_join_38: {
    forward_join_31: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.KE.f ^ 28667103488608L);
    life5_5 = moom.Km.b();
    spill2469_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2469_12_0 = spill2469_0;
        break forward_join_12;
    }
    if (!((((spill2469_0 instanceof moom.i9) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2469_12_0 = p0;
    }
    life6_19 = ((moom.i9)(forwardValue2469_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2469_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2469_4(27151, (552094050185139093L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2469_38_0 = ((spill2469_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2469_1)) {
        break forward_join_31;
    }
    forwardValue2469_56_0 = ((moom.i9)(life6_19)).i;
    break forward_join_56;
    }
    forwardValue2469_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2469_8(20, (9155977681040095628L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2469_51_0 = forwardValue2469_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2469_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2469_56_0 = ((moom.i9)(life6_19)).j;
    break forward_join_56;
    }
    forwardValue2469_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2469_12(11017, (3505513218332037783L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2469_51_0 != 0))) {
        break forward_join_55;
    }
    forwardValue2469_56_0 = ((moom.i9)(life6_19)).k;
    break forward_join_56;
    }
    forwardValue2469_56_0 = null;
    }
    return forwardValue2469_56_0;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.Render forwardValue2468_26_0;
    int[] spill2468_0;
    net.minecraft.client.renderer.entity.Render spill2468_1;
    long life3_3;
    net.minecraft.client.renderer.entity.RenderManager life6_7;
    int[] life5_8;
    net.minecraft.client.renderer.entity.Render life7_14;
    moom.ns life8_25;
    forward_join_36: {
    forward_join_26: {
    forward_join_25: {
    life3_3 = (moom.KE.f ^ 125591009287623L);
    spill2468_0 = moom.Km.b();
    life6_7 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    life5_8 = spill2468_0;
    life7_14 = ((net.minecraft.client.renderer.entity.Render)(((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(life6_7)).a__Map())).get(((java.lang.Object)(moom.tw.class)))));
    spill2468_1 = life7_14;
    if (!((life5_8 != null))) {
        forwardValue2468_26_0 = spill2468_1;
        break forward_join_26;
    }
    if (!((((spill2468_1 instanceof moom.ns) ? 1 : 0) != 0))) {
        break forward_join_25;
    }
    life8_25 = ((moom.ns)(life7_14));
    if (!((life5_8 == null))) {
        break forward_join_36;
    }
    }
    forwardValue2468_26_0 = life7_14;
    }
    net.minecraft.client.renderer.entity.Render __stackOp2468_11_0 = forwardValue2468_26_0;
    java.lang.String __stackOp2468_11_1 = __sourceIntrinsic_7ab34bcb5e67_invokedynamic2468_10(31054, (2893090127285041010L ^ life3_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_7ab34bcb5e67_invokedynamic2468_12(__stackOp2468_11_1, __stackOp2468_11_0))));
    return null;
    }
    ((moom.ns)(life8_25)).i = ((moom.iQ)(p0));
    ((moom.ns)(life8_25)).c = ((float)(p1));
    return life8_25;
}


public moom.iQ a__iQ() {
return new moom.i9(0x0.0p0f, true);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3ec1d729617257f8_originalDynamicSite658_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1234_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1234_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1234_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5624_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2469_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2469_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2469_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ab34bcb5e67_invokedynamic2468_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ab34bcb5e67_invokedynamic2468_12(java.lang.String a0, net.minecraft.client.renderer.entity.Render a1) throws E;
}
