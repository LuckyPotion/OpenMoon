package moom;


public class KL extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long k;

public KL() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_850a93ef952773e6(moom.KL receiver) throws Throwable {

long local1 = (moom.KL.f ^ 138571077484022L);

    moom.KL.__sourceConstructorInit_850a93ef952773e6_0(((moom.KL)(receiver)), ((java.lang.Object)(net.minecraft.entity.monster.EntityIronGolem.class)), ((java.lang.String)(__sourceIntrinsic_850a93ef952773e6_originalDynamicSite2294_2(28221, (3140201738392007227L ^ local1)))), ((float)(0x1.0p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_850a93ef952773e6_0(moom.KL a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(8713060678368199882L)), ((long)(501626323441140136L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(128685890633361L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.KL.f ^ 55853301184027L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill635_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill635_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill635_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill635_14 = new byte[8];
    (__sourceSpill635_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill635_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation635_16 = __sourceSpill635_14;
    ((javax.crypto.Cipher)(__sourceSpill635_11)).init(((int)(__sourceSpill635_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill635_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation635_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[13];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "¡/\rZÂ\024¦M\nïº\037d\031p4z\020ÎI¡ç&boæÎ½ jLþ2\r¨¥\033ã]7c4\033ý[~öt*¾å\036v\021Qµ² än\002kÁ>1ÉwAÙÇ\nP:\0052ÎñÎPÕÞG !cIªÌc\021¯¢\000Ø9[¤7XÁ>ÑÈÑÄ~©ÙÇù ø\003ñ\020¨}\005.½#\t/öÃT´IÙéâ\037\b75\030M÷\t=éÏ8¼WU(>}\002xì\027\016\020\003\0336ôÅi$°\0311ÃºÐl1\020NwíetHºÚõtüê\016câ\030æÃG×_Wi¯3\020÷T5Þ¶³Ê|ÛÉ\020\177KoËKª¸=/SõzÐ\0205 'Ñ2wg/U/#Á>û "))).length();
    int local10_life24 = 32;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill635_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill635_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill635_29)).doFinal(((byte[])(__sourceSpill635_28)));
        java.lang.String __sourceSpill635_34 = ((java.lang.String)(moom.KL.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill635_35 = local14_life19;
        int __sourceSpill635_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill635_35)[__sourceSpill635_36] = __sourceSpill635_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "Ü\020üüñ6ÊTO.ï&\002h}P´Ág³~Öm¿±¬zµ\030¼.i4Ñ¦ã\003¿\0068\r\000¶ïÈ\031\000"))).length();
    local10_life24 = 32;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill635_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill635_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill635_42)).doFinal(((byte[])(__sourceSpill635_41)));
        java.lang.String __sourceSpill635_47 = ((java.lang.String)(moom.KL.a(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill635_48 = local14_life19;
        int __sourceSpill635_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill635_48)[__sourceSpill635_49] = __sourceSpill635_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    h = ((java.lang.String[])(local14_life19));
    i = ((java.lang.String[])(new java.lang.String[13]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill635_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill635_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill635_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill635_59 = new byte[8];
    (__sourceSpill635_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill635_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation635_61 = __sourceSpill635_59;
    ((javax.crypto.Cipher)(__sourceSpill635_56)).init(((int)(__sourceSpill635_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill635_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation635_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = 5686730933589892609L;
    byte[] __sourceSpill635_65 = new byte[8];
    (__sourceSpill635_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill635_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill635_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill635_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill635_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill635_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill635_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill635_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill635_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill635_66)).doFinal(((byte[])(__sourceSpill635_65)));
    k = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.KL.f ^ 51130021238748L);
    java.lang.String[] __sourceSharedArray661_4 = new java.lang.String[((int) moom.KL.k)];
    __sourceSharedArray661_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite661_3(32604, (4802908879920122232L ^ local1_life1));
    __sourceSharedArray661_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite661_5(1026, (1157545182252053029L ^ local1_life1));
    __sourceSharedArray661_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite661_6(12858, (8531597546910057495L ^ local1_life1));
    __sourceSharedArray661_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite661_7(10007, (86377473866731825L ^ local1_life1));
    __sourceSharedArray661_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite661_8(25422, (1283683451611665761L ^ local1_life1));
    __sourceSharedArray661_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite661_9(8972, (8714620627378967847L ^ local1_life1));
    return __sourceSharedArray661_4;
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
        byte[] spill2885_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2885_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2885_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2885_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2885_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2885_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5665);
    if (((moom.KL.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.KL.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.KL.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/KL", life9_51);
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
        life9_116 = ((java.lang.String)((moom.KL.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.KL.i)[life5_8] = moom.KL.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.KL.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.KL.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5662_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2477_12_0;
    int forwardValue2477_38_0;
    int forwardValue2477_51_0;
    int forwardValue2477_64_0;
    int forwardValue2477_77_0;
    int forwardValue2477_90_0;
    moom.jD forwardValue2477_95_0;
    moom.iQ spill2477_0;
    boolean spill2477_1;
    long life3_3;
    int[] life5_5;
    moom.jd life6_19;
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
    life3_3 = (moom.KL.f ^ 47154822559620L);
    life5_5 = moom.Km.b();
    spill2477_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2477_12_0 = spill2477_0;
        break forward_join_12;
    }
    if (!((((spill2477_0 instanceof moom.jd) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2477_12_0 = p0;
    }
    life6_19 = ((moom.jd)(forwardValue2477_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2477_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2477_4(1539, (1697928720808595570L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2477_38_0 = ((spill2477_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2477_1)) {
        break forward_join_31;
    }
    forwardValue2477_95_0 = ((moom.jd)(life6_19)).i;
    break forward_join_95;
    }
    forwardValue2477_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2477_8(1109, (8161207435061875237L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2477_51_0 = forwardValue2477_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2477_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2477_95_0 = ((moom.jd)(life6_19)).j;
    break forward_join_95;
    }
    forwardValue2477_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2477_12(8453, (7363740929540028275L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2477_64_0 = forwardValue2477_51_0;
        break forward_join_64;
    }
    if (!((forwardValue2477_51_0 != 0))) {
        break forward_join_57;
    }
    forwardValue2477_95_0 = ((moom.jd)(life6_19)).l;
    break forward_join_95;
    }
    forwardValue2477_64_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2477_16(958, (7161035884778640835L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2477_77_0 = forwardValue2477_64_0;
        break forward_join_77;
    }
    if (!((forwardValue2477_64_0 != 0))) {
        break forward_join_70;
    }
    forwardValue2477_95_0 = ((moom.jd)(life6_19)).k;
    break forward_join_95;
    }
    forwardValue2477_77_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2477_20(19912, (1172399785625951154L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2477_90_0 = forwardValue2477_77_0;
        break forward_join_90;
    }
    if (!((forwardValue2477_77_0 != 0))) {
        break forward_join_83;
    }
    forwardValue2477_95_0 = ((moom.jd)(life6_19)).m;
    break forward_join_95;
    }
    forwardValue2477_90_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2477_24(9022, (1137323003671442764L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2477_90_0 != 0))) {
        break forward_join_94;
    }
    forwardValue2477_95_0 = ((moom.jd)(life6_19)).n;
    break forward_join_95;
    }
    forwardValue2477_95_0 = null;
    }
    return forwardValue2477_95_0;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    moom.na local4 = new moom.na(local3);
    ((moom.na)(local4)).m = ((moom.iQ)(p0));
    ((moom.na)(local4)).c = ((float)(p1));
    return local4;
}


public moom.iQ a__iQ() {
return new moom.jd();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_850a93ef952773e6_originalDynamicSite2294_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite661_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite661_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite661_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite661_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite661_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite661_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5662_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2477_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2477_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2477_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2477_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2477_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2477_24(int a0, long a1) throws E;
}
