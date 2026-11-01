package moom;


public class KO extends moom.Km {

private static long f;

private static java.lang.String[] i;

private static java.lang.String[] j;

private static java.util.Map k;

private static long m;

public KO() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_ba6b5d03540a147b(moom.KO receiver) throws Throwable {

long local1 = (moom.KO.f ^ 135994643734977L);

    moom.KO.__sourceConstructorInit_ba6b5d03540a147b_0(((moom.KO)(receiver)), ((java.lang.Object)(net.minecraft.entity.item.EntityMinecart.class)), ((java.lang.String)(__sourceIntrinsic_ba6b5d03540a147b_originalDynamicSite2300_2(7110, (7083863563640798229L ^ local1)))), ((float)(0x1.0p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_ba6b5d03540a147b_0(moom.KO a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

protected KO(java.lang.Class p0, java.lang.String p1, float p2) {
super(p0, p1, p2);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-6532958631907731196L)), ((long)(-8470268929801879387L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(119159368988912L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.KO.f ^ 18649849793436L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill638_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill638_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill638_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill638_14 = new byte[8];
    (__sourceSpill638_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill638_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation638_16 = __sourceSpill638_14;
    ((javax.crypto.Cipher)(__sourceSpill638_11)).init(((int)(__sourceSpill638_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill638_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation638_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[13];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "×Mª>8¿RíºC±\"Ü\020ÄÒÒ\"°n2L\025V¤¥åÖÝ\020Mí ¡\022¥W\030Çq\022\0203ùÝ¹\023\035ÎNo\022&ð:»\020ó¿Ï&|¢zm\036Ä;\000\004#\030ÉÈî Ù_ÔÕ9%û\016ràäãøf·\033}\020Õ»êgXþ/Åì\"ä£|\020fp\000\013©¥\0273lßL£Í\020[H¦ã±ÑD\032°\004Þ\016'\020¸3f\026LF\\Ã,\024MÚÞ1;\022\020\031§±#\035&Ã\034y#ø\r­º\020"))).length();
    int local10_life24 = 16;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill638_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill638_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill638_29)).doFinal(((byte[])(__sourceSpill638_28)));
        java.lang.String __sourceSpill638_34 = ((java.lang.String)(moom.KO.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill638_35 = local14_life19;
        int __sourceSpill638_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill638_35)[__sourceSpill638_36] = __sourceSpill638_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "eùCòÐÄæ\026\034×n\tyª#\020ø´Z\031»ð»Çj\017 ÇµäÓ"))).length();
    local10_life24 = 16;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill638_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill638_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill638_42)).doFinal(((byte[])(__sourceSpill638_41)));
        java.lang.String __sourceSpill638_47 = ((java.lang.String)(moom.KO.a(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill638_48 = local14_life19;
        int __sourceSpill638_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill638_48)[__sourceSpill638_49] = __sourceSpill638_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    i = ((java.lang.String[])(local14_life19));
    j = ((java.lang.String[])(new java.lang.String[13]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill638_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill638_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill638_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill638_59 = new byte[8];
    (__sourceSpill638_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill638_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation638_61 = __sourceSpill638_59;
    ((javax.crypto.Cipher)(__sourceSpill638_56)).init(((int)(__sourceSpill638_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill638_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation638_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = 3949127367457500201L;
    byte[] __sourceSpill638_65 = new byte[8];
    (__sourceSpill638_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill638_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill638_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill638_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill638_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill638_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill638_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill638_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill638_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill638_66)).doFinal(((byte[])(__sourceSpill638_65)));
    m = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.KO.f ^ 12675272712617L);
    java.lang.String[] __sourceSharedArray663_4 = new java.lang.String[((int) moom.KO.m)];
    __sourceSharedArray663_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite663_3(12858, (7532999597366351237L ^ local1_life1));
    __sourceSharedArray663_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite663_5(19130, (3783545985828056333L ^ local1_life1));
    __sourceSharedArray663_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite663_6(500, (1628508311185008204L ^ local1_life1));
    __sourceSharedArray663_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite663_7(12582, (4497636850840835740L ^ local1_life1));
    __sourceSharedArray663_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite663_8(22314, (2344963834168471702L ^ local1_life1));
    __sourceSharedArray663_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite663_9(80, (5638968921128151022L ^ local1_life1));
    return __sourceSharedArray663_4;
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
        byte[] spill2891_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2891_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2891_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2891_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2891_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2891_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1969);
    if (((moom.KO.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.KO.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.KO.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/KO", life9_51);
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
        life9_116 = ((java.lang.String)((moom.KO.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.KO.j)[life5_8] = moom.KO.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.KO.j)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.KO.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5675_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2480_12_0;
    int forwardValue2480_40_0;
    int forwardValue2480_55_0;
    int forwardValue2480_70_0;
    int forwardValue2480_85_0;
    int forwardValue2480_100_0;
    moom.jD forwardValue2480_107_0;
    moom.iQ spill2480_0;
    boolean spill2480_1;
    long life3_3;
    int[] life5_5;
    moom.jg life6_19;
    forward_join_107: {
    forward_join_106: {
    forward_join_100: {
    forward_join_93: {
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
    life3_3 = (moom.KO.f ^ 17474167947761L);
    life5_5 = moom.Km.b();
    spill2480_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2480_12_0 = spill2480_0;
        break forward_join_12;
    }
    if (!((((spill2480_0 instanceof moom.jg) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2480_12_0 = p0;
    }
    life6_19 = ((moom.jg)(forwardValue2480_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2480_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2480_4(25386, (3606369976878179526L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2480_40_0 = ((spill2480_1) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill2480_1)) {
        break forward_join_33;
    }
    forwardValue2480_107_0 = (((moom.jg)(life6_19)).i)[0];
    break forward_join_107;
    }
    forwardValue2480_40_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2480_8(13823, (1426485617111888414L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2480_55_0 = forwardValue2480_40_0;
        break forward_join_55;
    }
    if (!((forwardValue2480_40_0 != 0))) {
        break forward_join_48;
    }
    forwardValue2480_107_0 = (((moom.jg)(life6_19)).i)[1];
    break forward_join_107;
    }
    forwardValue2480_55_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2480_12(4639, (8441380411930072570L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2480_70_0 = forwardValue2480_55_0;
        break forward_join_70;
    }
    if (!((forwardValue2480_55_0 != 0))) {
        break forward_join_63;
    }
    forwardValue2480_107_0 = (((moom.jg)(life6_19)).i)[2];
    break forward_join_107;
    }
    forwardValue2480_70_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2480_16(27897, (4329344124217469719L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2480_85_0 = forwardValue2480_70_0;
        break forward_join_85;
    }
    if (!((forwardValue2480_70_0 != 0))) {
        break forward_join_78;
    }
    forwardValue2480_107_0 = (((moom.jg)(life6_19)).i)[3];
    break forward_join_107;
    }
    forwardValue2480_85_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2480_20(19471, (8882448647675448293L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2480_100_0 = forwardValue2480_85_0;
        break forward_join_100;
    }
    if (!((forwardValue2480_85_0 != 0))) {
        break forward_join_93;
    }
    forwardValue2480_107_0 = (((moom.jg)(life6_19)).i)[4];
    break forward_join_107;
    }
    forwardValue2480_100_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2480_24(32234, (4533482103300995591L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2480_100_0 != 0))) {
        break forward_join_106;
    }
    forwardValue2480_107_0 = (((moom.jg)(life6_19)).i)[5];
    break forward_join_107;
    }
    forwardValue2480_107_0 = null;
    }
    return forwardValue2480_107_0;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    moom.mK local4 = new moom.mK(local3);
    ((moom.mK)(local4)).i = ((moom.iQ)(p0));
    ((moom.mK)(local4)).c = ((float)(p1));
    return local4;
}


public moom.iQ a__iQ() {
return new moom.jg();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ba6b5d03540a147b_originalDynamicSite2300_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite663_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite663_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite663_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite663_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite663_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite663_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5675_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2480_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2480_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2480_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2480_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2480_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2480_24(int a0, long a1) throws E;
}
