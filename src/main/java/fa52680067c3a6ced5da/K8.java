package moom;


public class K8 extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long k;

public K8() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_8627ed9ed9cb0380(moom.K8 receiver) throws Throwable {

long local1 = (moom.K8.f ^ 131237419032149L);

    moom.K8.__sourceConstructorInit_8627ed9ed9cb0380_0(((moom.K8)(receiver)), ((java.lang.Object)(net.minecraft.entity.boss.EntityWither.class)), ((java.lang.String)(__sourceIntrinsic_8627ed9ed9cb0380_originalDynamicSite2268_2(586, (8044693292016457939L ^ local1)))), ((float)(0x1.0p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_8627ed9ed9cb0380_0(moom.K8 a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(-913794510601646215L)), ((long)(-1903526824172919611L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(204613059254124L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.K8.f ^ 35100659855225L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill626_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill626_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill626_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill626_14 = new byte[8];
    (__sourceSpill626_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill626_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation626_16 = __sourceSpill626_14;
    ((javax.crypto.Cipher)(__sourceSpill626_11)).init(((int)(__sourceSpill626_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill626_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation626_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[9];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "Us%èdÊ\n/òyõ5¿y\031\020®µ+6É\"\034u¢\033b¶ëyó\020·Ü'ôÂ&íI,§Ñ\000×\b¥\020­çþ2!´¨Epp¼¤\032±ï\020\033bÒé¤'{-Y ÏÝw\020\0219hjwÒè³T9lÑ\013\037\020/ÆxÄ1¦yî\"õäªH¶"))).length();
    int local10_life24 = 16;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill626_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill626_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill626_29)).doFinal(((byte[])(__sourceSpill626_28)));
        java.lang.String __sourceSpill626_34 = ((java.lang.String)(moom.K8.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill626_35 = local14_life19;
        int __sourceSpill626_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill626_35)[__sourceSpill626_36] = __sourceSpill626_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "§ßYÛ¢aÐqÞgÊ¬ÀZ\030«v\035C¥%Á7\003¯jEèVð\032Öðö\005=Æ:"))).length();
    local10_life24 = 16;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill626_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill626_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill626_42)).doFinal(((byte[])(__sourceSpill626_41)));
        java.lang.String __sourceSpill626_47 = ((java.lang.String)(moom.K8.a(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill626_48 = local14_life19;
        int __sourceSpill626_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill626_48)[__sourceSpill626_49] = __sourceSpill626_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    h = ((java.lang.String[])(local14_life19));
    i = ((java.lang.String[])(new java.lang.String[9]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill626_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill626_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill626_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill626_59 = new byte[8];
    (__sourceSpill626_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill626_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation626_61 = __sourceSpill626_59;
    ((javax.crypto.Cipher)(__sourceSpill626_56)).init(((int)(__sourceSpill626_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill626_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation626_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = -5331265757571578848L;
    byte[] __sourceSpill626_65 = new byte[8];
    (__sourceSpill626_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill626_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill626_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill626_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill626_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill626_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill626_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill626_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill626_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill626_66)).doFinal(((byte[])(__sourceSpill626_65)));
    k = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.K8.f ^ 38082201754492L);
    java.lang.String[] __sourceSharedArray654_4 = new java.lang.String[((int) moom.K8.k)];
    __sourceSharedArray654_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite654_3(5206, (6767399053565414379L ^ local1_life1));
    __sourceSharedArray654_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite654_5(21428, (4429457688105618447L ^ local1_life1));
    __sourceSharedArray654_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite654_6(971, (2450856228053965943L ^ local1_life1));
    __sourceSharedArray654_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite654_7(13741, (2557539184774900243L ^ local1_life1));
    __sourceSharedArray654_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite654_8(17859, (1694586253846420092L ^ local1_life1));
    __sourceSharedArray654_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite654_9(7262, (1640305520272753636L ^ local1_life1));
    return __sourceSharedArray654_4;
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
        byte[] spill2856_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2856_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2856_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2856_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2856_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2856_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 32695);
    if (((moom.K8.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.K8.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.K8.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/K8", life9_51);
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
        life9_116 = ((java.lang.String)((moom.K8.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.K8.i)[life5_8] = moom.K8.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.K8.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.K8.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5596_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/K8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2461_12_0;
    int forwardValue2461_52_0;
    moom.jD forwardValue2461_60_0;
    java.lang.String forwardValue2461_66_0;
    int forwardValue2461_93_0;
    moom.jD forwardValue2461_101_0;
    moom.iQ spill2461_0;
    java.lang.String spill2461_1;
    int spill2461_2;
    int spill2461_3;
    long life3_3;
    int[] life5_5;
    moom.jy life6_19;
    java.lang.String life7_31;
    moom.jD[] life8_43;
    java.lang.String life9_54;
    int life10_58;
    java.lang.String life8_84;
    moom.jD[] life9_91;
    java.lang.String life10_102;
    int life11_106;
    forward_join_102: {
    forward_join_101: {
    forward_join_100: {
    forward_join_93: {
    forward_join_78: {
    forward_join_66: {
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_52: {
    forward_join_37: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.K8.f ^ 42610381683492L);
    life5_5 = moom.Km.b();
    spill2461_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2461_12_0 = spill2461_0;
        break forward_join_12;
    }
    if (!((((spill2461_0 instanceof moom.jy) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2461_12_0 = p0;
    }
    life6_19 = ((moom.jy)(forwardValue2461_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    life7_31 = __sourceIntrinsic_38607ace6cb3_invokedynamic2461_4(23325, (5031134880268936445L ^ life3_3));
    spill2461_1 = p1;
    if (!((life5_5 != null))) {
        forwardValue2461_66_0 = spill2461_1;
        break forward_join_66;
    }
    if (!(((java.lang.String)(spill2461_1)).startsWith(((java.lang.String)(life7_31))))) {
        break forward_join_61;
    }
    life8_43 = ((moom.jy)(life6_19)).i;
    if (!((life8_43 == null))) {
        break forward_join_37;
    }
    return null;
    }
    life9_54 = ((java.lang.String)(p1)).substring(((int)(((java.lang.String)(life7_31)).length())));
    life10_58 = moom.BU.a(((java.lang.String)(life9_54)), ((int)(-1)));
    life10_58 += -1;
    spill2461_2 = life10_58;
    if (!((life5_5 != null))) {
        forwardValue2461_52_0 = spill2461_2;
        break forward_join_52;
    }
    if (!((spill2461_2 >= 0))) {
        break forward_join_59;
    }
    forwardValue2461_52_0 = life10_58;
    }
    if (!((forwardValue2461_52_0 < (life8_43).length))) {
        break forward_join_59;
    }
    forwardValue2461_60_0 = (life8_43)[life10_58];
    break forward_join_60;
    }
    forwardValue2461_60_0 = null;
    }
    return forwardValue2461_60_0;
    }
    forwardValue2461_66_0 = __sourceIntrinsic_38607ace6cb3_invokedynamic2461_10(6165, (3454097143825770484L ^ life3_3));
    }
    life8_84 = forwardValue2461_66_0;
    if (!(((java.lang.String)(p1)).startsWith(((java.lang.String)(life8_84))))) {
        break forward_join_102;
    }
    life9_91 = ((moom.jy)(life6_19)).j;
    if (!((life9_91 == null))) {
        break forward_join_78;
    }
    return null;
    }
    life10_102 = ((java.lang.String)(p1)).substring(((int)(((java.lang.String)(life8_84)).length())));
    life11_106 = moom.BU.a(((java.lang.String)(life10_102)), ((int)(-1)));
    life11_106 += -1;
    spill2461_3 = life11_106;
    if (!((life5_5 != null))) {
        forwardValue2461_93_0 = spill2461_3;
        break forward_join_93;
    }
    if (!((spill2461_3 >= 0))) {
        break forward_join_100;
    }
    forwardValue2461_93_0 = life11_106;
    }
    if (!((forwardValue2461_93_0 < (life9_91).length))) {
        break forward_join_100;
    }
    forwardValue2461_101_0 = (life9_91)[life11_106];
    break forward_join_101;
    }
    forwardValue2461_101_0 = null;
    }
    return forwardValue2461_101_0;
    }
    return null;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    moom.np local4 = new moom.np(local3);
    ((moom.np)(local4)).m = ((moom.iQ)(p0));
    ((moom.np)(local4)).c = ((float)(p1));
    return local4;
}


public moom.iQ a__iQ() {
return new moom.jy(0x0.0p0f);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8627ed9ed9cb0380_originalDynamicSite2268_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite654_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite654_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite654_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite654_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite654_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite654_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5596_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2461_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2461_10(int a0, long a1) throws E;
}
