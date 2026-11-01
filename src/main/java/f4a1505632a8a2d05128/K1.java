package moom;


public class K1 extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long k;

public K1() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_98b575dd68eda81b(moom.K1 receiver) throws Throwable {

long local1 = (moom.K1.f ^ 8463774275061L);

    moom.K1.__sourceConstructorInit_98b575dd68eda81b_0(((moom.K1)(receiver)), ((java.lang.Object)(net.minecraft.entity.monster.EntitySlime.class)), ((java.lang.String)(__sourceIntrinsic_98b575dd68eda81b_originalDynamicSite2254_2(8084, (985590078355925244L ^ local1)))), ((float)(0x1.0p-2f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_98b575dd68eda81b_0(moom.K1 a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(-621471207845107913L)), ((long)(-4644654731702861823L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189841387542135L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.K1.f ^ 94264570548422L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill620_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill620_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill620_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill620_14 = new byte[8];
    (__sourceSpill620_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill620_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation620_16 = __sourceSpill620_14;
    ((javax.crypto.Cipher)(__sourceSpill620_11)).init(((int)(__sourceSpill620_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill620_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation620_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[9];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "©\tË¾+µúÐlúë\rÿj5\020bu½(b\035À,K\020Ð7á\020hô\ng¹eîý5($\0205å¤õØÈ\0221ñØ[á{  %ë&ß·_p,¢\026\026ú©ÿVIh0E·áN½eýàNrÝô &àvbËG»Õê?³µ/ØL¿q\037åÇshÍ{! Ã\030ÍI\026Îð¯\177Fð²¤ÐSÿ*kiJ¨­"))).length();
    int local10_life24 = 16;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill620_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill620_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill620_29)).doFinal(((byte[])(__sourceSpill620_28)));
        java.lang.String __sourceSpill620_34 = ((java.lang.String)(moom.K1.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill620_35 = local14_life19;
        int __sourceSpill620_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill620_35)[__sourceSpill620_36] = __sourceSpill620_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "[ÌU1Bò²_~ðAGd 0\031#\177'\031Ú\022ïGu!Ï»´y\034¨FèÅÆñ\020¡áo¨V"))).length();
    local10_life24 = 16;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill620_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill620_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill620_42)).doFinal(((byte[])(__sourceSpill620_41)));
        java.lang.String __sourceSpill620_47 = ((java.lang.String)(moom.K1.a(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill620_48 = local14_life19;
        int __sourceSpill620_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill620_48)[__sourceSpill620_49] = __sourceSpill620_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    h = ((java.lang.String[])(local14_life19));
    i = ((java.lang.String[])(new java.lang.String[9]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill620_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill620_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill620_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill620_59 = new byte[8];
    (__sourceSpill620_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill620_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation620_61 = __sourceSpill620_59;
    ((javax.crypto.Cipher)(__sourceSpill620_56)).init(((int)(__sourceSpill620_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill620_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation620_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = 3211103362044578357L;
    byte[] __sourceSpill620_65 = new byte[8];
    (__sourceSpill620_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill620_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill620_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill620_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill620_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill620_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill620_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill620_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill620_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill620_66)).doFinal(((byte[])(__sourceSpill620_65)));
    k = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
}


public java.lang.String[] b__ArrayString() {
long local1 = (moom.K1.f ^ 39545162387889L);
    return new java.lang.String[] {__sourceIntrinsic_b33388dd40f1_originalDynamicSite1222_1(10179, (8203622983658198253L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1222_2(29422, (2085861368794382788L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1222_3(27255, (1701669789485996382L ^ local1)), __sourceIntrinsic_b33388dd40f1_originalDynamicSite1222_4(16757, (6335437848547832410L ^ local1))};
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
        byte[] spill2843_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2843_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2843_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2843_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2843_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2843_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21280);
    if (((moom.K1.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.K1.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.K1.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/K1", life9_51);
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
        life9_116 = ((java.lang.String)((moom.K1.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.K1.i)[life5_8] = moom.K1.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.K1.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.K1.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5568_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/K1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2455_12_0;
    int forwardValue2455_38_0;
    int forwardValue2455_51_0;
    int forwardValue2455_64_0;
    moom.jD forwardValue2455_69_0;
    moom.iQ spill2455_0;
    boolean spill2455_1;
    long life3_3;
    int[] life5_5;
    moom.js life6_19;
    forward_join_69: {
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
    life3_3 = (moom.K1.f ^ 43520499462633L);
    life5_5 = moom.Km.b();
    spill2455_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2455_12_0 = spill2455_0;
        break forward_join_12;
    }
    if (!((((spill2455_0 instanceof moom.js) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2455_12_0 = p0;
    }
    life6_19 = ((moom.js)(forwardValue2455_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2455_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2455_4(23053, (5048213074205100413L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2455_38_0 = ((spill2455_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2455_1)) {
        break forward_join_31;
    }
    forwardValue2455_69_0 = ((moom.js)(life6_19)).i;
    break forward_join_69;
    }
    forwardValue2455_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2455_8(817, (1918453475417854018L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2455_51_0 = forwardValue2455_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2455_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2455_69_0 = ((moom.js)(life6_19)).k;
    break forward_join_69;
    }
    forwardValue2455_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2455_12(19874, (6121983366347218653L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2455_64_0 = forwardValue2455_51_0;
        break forward_join_64;
    }
    if (!((forwardValue2455_51_0 != 0))) {
        break forward_join_57;
    }
    forwardValue2455_69_0 = ((moom.js)(life6_19)).j;
    break forward_join_69;
    }
    forwardValue2455_64_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2455_16(9314, (399560619757811479L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2455_64_0 != 0))) {
        break forward_join_68;
    }
    forwardValue2455_69_0 = ((moom.js)(life6_19)).l;
    break forward_join_69;
    }
    forwardValue2455_69_0 = null;
    }
    return forwardValue2455_69_0;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    return new moom.ni(local3, p0, p1);
}


public moom.iQ a__iQ() {
long local1 = (moom.K1.f ^ 58180590196606L);
    return new moom.js(((int) moom.K1.k));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_98b575dd68eda81b_originalDynamicSite2254_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1222_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1222_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1222_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite1222_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5568_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2455_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2455_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2455_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2455_16(int a0, long a1) throws E;
}
