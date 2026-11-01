package moom;


public class K6 extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long k;

public K6() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_91ca0f348be5eeb3(moom.K6 receiver) throws Throwable {

long local1 = (moom.K6.f ^ 31514173039409L);

    moom.K6.__sourceConstructorInit_91ca0f348be5eeb3_0(((moom.K6)(receiver)), ((java.lang.Object)(net.minecraft.entity.passive.EntityVillager.class)), ((java.lang.String)(__sourceIntrinsic_91ca0f348be5eeb3_originalDynamicSite2264_2(32334, (970347450916700325L ^ local1)))), ((float)(0x1.0p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_91ca0f348be5eeb3_0(moom.K6 a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(-7339785119430374749L)), ((long)(2991092997733538960L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(75789036388671L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.K6.f ^ 61666732765601L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill624_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill624_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill624_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill624_14 = new byte[8];
    (__sourceSpill624_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill624_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation624_16 = __sourceSpill624_14;
    ((javax.crypto.Cipher)(__sourceSpill624_11)).init(((int)(__sourceSpill624_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill624_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation624_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[13];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "RÁÓ¼³|è>Þ7ÿR_0E0\030HÈ\016JÈü´Öð\020õ\002üC,Qî­g\020,J.&°ìfhà\002Z\020c£À<I\023ÄC\rr\032×Æ²\030\004_»åB0Äô\030\004/+ÙÃ;¿Ý\031\026\022N :ÉFH|\000¶\027u\002Êýí2Þ\003æ­¥Ìkv{ÿZ\020e$\027iÐ\020\020:Ï´4S\tÚk¦\007\004s~ [WÎ\024\n«5\035¼eÛÆõ\032û]µñJkbÆÇýZ8 =,}À\027\0021c¦Qúé¡©éÿaÍ\031JØÏD\027\027bj,Ù\020Q.\023Ä2ÇÓ\016Y@\003T\020u»ü×dXä'CÈ'¬ÔF"))).length();
    int local10_life24 = 16;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill624_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill624_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill624_29)).doFinal(((byte[])(__sourceSpill624_28)));
        java.lang.String __sourceSpill624_34 = ((java.lang.String)(moom.K6.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill624_35 = local14_life19;
        int __sourceSpill624_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill624_35)[__sourceSpill624_36] = __sourceSpill624_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "ÀðH\027~Ùe\030\fÿ~¶éÿ»\177\036?Îº\020_\b%0C@×¢Luåó§Õ"))).length();
    local10_life24 = 24;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill624_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill624_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill624_42)).doFinal(((byte[])(__sourceSpill624_41)));
        java.lang.String __sourceSpill624_47 = ((java.lang.String)(moom.K6.a(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill624_48 = local14_life19;
        int __sourceSpill624_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill624_48)[__sourceSpill624_49] = __sourceSpill624_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    h = ((java.lang.String[])(local14_life19));
    i = ((java.lang.String[])(new java.lang.String[13]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill624_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill624_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill624_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill624_59 = new byte[8];
    (__sourceSpill624_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill624_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation624_61 = __sourceSpill624_59;
    ((javax.crypto.Cipher)(__sourceSpill624_56)).init(((int)(__sourceSpill624_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill624_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation624_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = 9162210353365062137L;
    byte[] __sourceSpill624_65 = new byte[8];
    (__sourceSpill624_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill624_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill624_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill624_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill624_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill624_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill624_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill624_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill624_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill624_66)).doFinal(((byte[])(__sourceSpill624_65)));
    k = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.K6.f ^ 79093374969975L);
    java.lang.String[] __sourceSharedArray652_4 = new java.lang.String[((int) moom.K6.k)];
    __sourceSharedArray652_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite652_3(19223, (6299853495524998840L ^ local1_life1));
    __sourceSharedArray652_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite652_5(13933, (7363146622926865355L ^ local1_life1));
    __sourceSharedArray652_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite652_6(24355, (708963294889486985L ^ local1_life1));
    __sourceSharedArray652_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite652_7(23781, (8704041313440606542L ^ local1_life1));
    __sourceSharedArray652_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite652_8(19671, (1580415205529008499L ^ local1_life1));
    __sourceSharedArray652_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite652_9(10831, (1721933260547284963L ^ local1_life1));
    return __sourceSharedArray652_4;
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
        byte[] spill2852_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2852_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2852_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2852_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2852_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2852_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21923);
    if (((moom.K6.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.K6.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.K6.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/K6", life9_51);
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
        life9_116 = ((java.lang.String)((moom.K6.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.K6.i)[life5_8] = moom.K6.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.K6.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.K6.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5587_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/K6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2459_12_0;
    int forwardValue2459_38_0;
    int forwardValue2459_51_0;
    int forwardValue2459_64_0;
    int forwardValue2459_77_0;
    int forwardValue2459_90_0;
    moom.jD forwardValue2459_95_0;
    moom.iQ spill2459_0;
    boolean spill2459_1;
    long life3_3;
    int[] life5_5;
    moom.jw life6_19;
    forward_join_95: {
    forward_join_94: {
    forward_join_90: {
    forward_join_83: {
    forward_join_77: {
    forward_join_70: {
    forward_join_64: {
    forward_join_57: {
    forward_join_51: {
    forward_join_44: {
    forward_join_38: {
    forward_join_31: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.K6.f ^ 74272470370351L);
    life5_5 = moom.Km.b();
    spill2459_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2459_12_0 = spill2459_0;
        break forward_join_12;
    }
    if (!((((spill2459_0 instanceof moom.jw) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2459_12_0 = p0;
    }
    life6_19 = ((moom.jw)(forwardValue2459_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2459_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2459_4(4665, (3046987930915833796L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2459_38_0 = ((spill2459_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2459_1)) {
        break forward_join_31;
    }
    forwardValue2459_95_0 = ((moom.jw)(life6_19)).i;
    break forward_join_95;
    }
    forwardValue2459_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2459_8(1464, (8232102757160292423L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2459_51_0 = forwardValue2459_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2459_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2459_95_0 = ((moom.jw)(life6_19)).j;
    break forward_join_95;
    }
    forwardValue2459_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2459_12(22978, (9197915353287674938L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2459_64_0 = forwardValue2459_51_0;
        break forward_join_64;
    }
    if (!((forwardValue2459_51_0 != 0))) {
        break forward_join_57;
    }
    forwardValue2459_95_0 = ((moom.jw)(life6_19)).k;
    break forward_join_95;
    }
    forwardValue2459_64_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2459_16(24408, (5753162687754259113L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2459_77_0 = forwardValue2459_64_0;
        break forward_join_77;
    }
    if (!((forwardValue2459_64_0 != 0))) {
        break forward_join_70;
    }
    forwardValue2459_95_0 = ((moom.jw)(life6_19)).m;
    break forward_join_95;
    }
    forwardValue2459_77_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2459_20(4130, (2098404780984305106L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2459_90_0 = forwardValue2459_77_0;
        break forward_join_90;
    }
    if (!((forwardValue2459_77_0 != 0))) {
        break forward_join_83;
    }
    forwardValue2459_95_0 = ((moom.jw)(life6_19)).l;
    break forward_join_95;
    }
    forwardValue2459_90_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2459_24(1631, (77792549226484649L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2459_90_0 != 0))) {
        break forward_join_94;
    }
    forwardValue2459_95_0 = ((moom.jw)(life6_19)).n;
    break forward_join_95;
    }
    forwardValue2459_95_0 = null;
    }
    return forwardValue2459_95_0;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    net.minecraft.client.renderer.entity.RenderVillager local4 = new net.minecraft.client.renderer.entity.RenderVillager(local3);
    ((net.minecraft.client.renderer.entity.RenderVillager)(local4)).m = ((moom.iQ)(p0));
    ((net.minecraft.client.renderer.entity.RenderVillager)(local4)).c = ((float)(p1));
    return local4;
}


public moom.iQ a__iQ() {
return new moom.jw(0x0.0p0f);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_91ca0f348be5eeb3_originalDynamicSite2264_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite652_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite652_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite652_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite652_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite652_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite652_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5587_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2459_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2459_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2459_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2459_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2459_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2459_24(int a0, long a1) throws E;
}
