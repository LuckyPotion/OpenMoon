package moom;


public class Mo implements moom.Mu {

private int a;

private final moom.DD b;

private int c;

private net.minecraft.client.renderer.texture.ITextureObject d;

private static final long e;

private static final java.lang.String[] f;

private static final java.lang.String[] g;

private static final java.util.Map h;

private static final long i;

public Mo(int p0, moom.DD p1, int p2) {
super();
    this.a = -1;
    this.c = 0;
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-9125108056780467355L)), ((long)(-4069691819758482287L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(219952486236020L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.Mo.e ^ 110383590861771L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill709_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill709_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill709_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill709_14 = new byte[8];
    (__sourceSpill709_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill709_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation709_16 = __sourceSpill709_14;
    ((javax.crypto.Cipher)(__sourceSpill709_11)).init(((int)(__sourceSpill709_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill709_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation709_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[3];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "R:h \"Û£¹ØrÏÂ\034B¨^ZjÑ`ý\022®èÙ4ýæ\005\030«¯EÀ$Ï\033}\031]ÐPVW¶³þÛdP K7 9\021\"4-ç0ùÊ@°î¥ú¬ø4\024Í\006\034lª"))).length();
    int local10_life24 = 32;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill709_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill709_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill709_29)).doFinal(((byte[])(__sourceSpill709_28)));
        java.lang.String __sourceSpill709_34 = ((java.lang.String)(moom.Mo.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill709_35 = local14_life19;
        int __sourceSpill709_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill709_35)[__sourceSpill709_36] = __sourceSpill709_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    f = ((java.lang.String[])(local14_life19));
    g = ((java.lang.String[])(new java.lang.String[3]));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill709_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill709_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill709_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill709_46 = new byte[8];
    (__sourceSpill709_46)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill709_46)[local1_life47] = ((byte) ((int) ((local5_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation709_48 = __sourceSpill709_46;
    ((javax.crypto.Cipher)(__sourceSpill709_43)).init(((int)(__sourceSpill709_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill709_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation709_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life51 = 8896106790241184748L;
    byte[] __sourceSpill709_52 = new byte[8];
    (__sourceSpill709_52)[0] = ((byte) ((int) (local2_life51 >>> 56)));
    (__sourceSpill709_52)[1] = ((byte) ((int) (local2_life51 >>> 48)));
    (__sourceSpill709_52)[2] = ((byte) ((int) (local2_life51 >>> 40)));
    (__sourceSpill709_52)[3] = ((byte) ((int) (local2_life51 >>> 32)));
    (__sourceSpill709_52)[4] = ((byte) ((int) (local2_life51 >>> 24)));
    (__sourceSpill709_52)[5] = ((byte) ((int) (local2_life51 >>> 16)));
    (__sourceSpill709_52)[6] = ((byte) ((int) (local2_life51 >>> 8)));
    (__sourceSpill709_52)[7] = ((byte) ((int) local2_life51));
    javax.crypto.Cipher __sourceSpill709_53 = local0_life41;
    byte[] local4_life55 = ((javax.crypto.Cipher)(__sourceSpill709_53)).doFinal(((byte[])(__sourceSpill709_52)));
    i = ((long)((((((((((((long) (local4_life55)[0]) & 255L) << 56) | ((((long) (local4_life55)[1]) & 255L) << 48)) | ((((long) (local4_life55)[2]) & 255L) << 40)) | ((((long) (local4_life55)[3]) & 255L) << 32)) | ((((long) (local4_life55)[4]) & 255L) << 24)) | ((((long) (local4_life55)[5]) & 255L) << 16)) | ((((long) (local4_life55)[6]) & 255L) << 8)) | (((long) (local4_life55)[7]) & 255L))));
}


public java.lang.String toString() {
int forwardValue2748_17_0;
    moom.DD forwardValue2748_17_1;
    net.minecraft.client.renderer.texture.ITextureObject forwardValue2748_17_2;
    int forwardValue2748_20_0;
    moom.DD forwardValue2748_20_1;
    int forwardValue2748_21_0;
    moom.DD forwardValue2748_21_1;
    java.lang.Object forwardValue2748_21_2;
    int spill2748_0;
    moom.DD spill2748_1;
    net.minecraft.client.renderer.texture.ITextureObject spill2748_2;
    long life1_3;
    int life3_5;
    java.lang.Object life4_27;
    moom.DD life5_28;
    int life6_29;
    forward_join_21: {
    forward_join_20: {
    forward_join_17: {
    life1_3 = (moom.Mo.e ^ 92985821206468L);
    life3_5 = moom.MS.b();
    spill2748_0 = this.a;
    spill2748_1 = this.b;
    spill2748_2 = this.d;
    if (!((life3_5 == 0))) {
        forwardValue2748_17_0 = spill2748_0;
        forwardValue2748_17_1 = spill2748_1;
        forwardValue2748_17_2 = spill2748_2;
        break forward_join_17;
    }
    if (!((spill2748_2 != null))) {
        forwardValue2748_20_0 = spill2748_0;
        forwardValue2748_20_1 = spill2748_1;
        break forward_join_20;
    }
    forwardValue2748_17_0 = spill2748_0;
    forwardValue2748_17_1 = spill2748_1;
    forwardValue2748_17_2 = this.d;
    }
    forwardValue2748_21_0 = forwardValue2748_17_0;
    forwardValue2748_21_1 = forwardValue2748_17_1;
    forwardValue2748_21_2 = java.lang.Integer.valueOf(((int)(((net.minecraft.client.renderer.texture.ITextureObject)(forwardValue2748_17_2)).a())));
    break forward_join_21;
    }
    forwardValue2748_21_0 = forwardValue2748_20_0;
    forwardValue2748_21_1 = forwardValue2748_20_1;
    forwardValue2748_21_2 = "";
    }
    life4_27 = forwardValue2748_21_2;
    life5_28 = forwardValue2748_21_1;
    life6_29 = forwardValue2748_21_0;
    return __sourceIntrinsic_a86c261fcdee_invokedynamic2748_11(__sourceIntrinsic_a86c261fcdee_invokedynamic2748_8(25089, (827046978116195753L ^ life1_3)), life6_29, __sourceIntrinsic_a86c261fcdee_invokedynamic2748_9(9276, (816887933530297237L ^ life1_3)), life5_28, __sourceIntrinsic_a86c261fcdee_invokedynamic2748_10(29067, (624023327754389025L ^ life1_3)), life4_27);
}


public int b() {
return this.a;
}


public int c() {
long local1 = (moom.Mo.e ^ 136426219580723L);
    return ((int) moom.Mo.i);
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
        byte[] spill3246_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3246_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3246_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3246_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3246_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3246_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20391);
    if (((moom.Mo.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Mo.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Mo.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Mo", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Mo.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Mo.g)[life5_8] = moom.Mo.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Mo.g)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Mo.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6456_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Mo"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a__Void() {
return;
}


public int a() {
int forwardValue2746_43_0;
    int forwardValue2746_43_1;
    net.minecraft.client.renderer.texture.ITextureObject forwardValue2746_48_0;
    int forwardValue2746_49_0;
    int spill2746_0;
    int spill2746_1;
    int spill2746_2;
    moom.n2 spill2746_3;
    int spill2746_4;
    int spill2746_5;
    int spill2746_6;
    long life1_3;
    net.minecraft.client.renderer.texture.ITextureObject life4_7;
    int life3_8;
    moom.n2 life5_30;
    moom.MA life6_35;
    forward_join_49: {
    forward_join_48: {
    forward_join_47: {
    forward_join_43: {
    forward_join_38: {
    life1_3 = (moom.Mo.e ^ 119732205765323L);
    spill2746_0 = moom.MS.c();
    life4_7 = ((moom.Mo)(this)).a__ob();
    life3_8 = spill2746_0;
    spill2746_1 = this.c;
    if (!((life3_8 != 0))) {
        forwardValue2746_49_0 = spill2746_1;
        break forward_join_49;
    }
    if (!((spill2746_1 != 0))) {
        break forward_join_47;
    }
    spill2746_2 = ((life4_7 instanceof moom.n2) ? 1 : 0);
    if (!((life3_8 != 0))) {
        forwardValue2746_49_0 = spill2746_2;
        break forward_join_49;
    }
    if (!((spill2746_2 != 0))) {
        break forward_join_47;
    }
    life5_30 = ((moom.n2)(life4_7));
    spill2746_3 = life5_30;
    if (!((life3_8 != 0))) {
        forwardValue2746_48_0 = spill2746_3;
        break forward_join_48;
    }
    life6_35 = ((moom.n2)(spill2746_3)).f;
    if (!((life6_35 != null))) {
        break forward_join_47;
    }
    spill2746_4 = this.c;
    spill2746_5 = 1;
    if (!((life3_8 != 0))) {
        forwardValue2746_43_0 = spill2746_4;
        forwardValue2746_43_1 = spill2746_5;
        break forward_join_43;
    }
    if (!((spill2746_4 == spill2746_5))) {
        break forward_join_38;
    }
    return ((moom.MA)(life6_35)).b;
    }
    spill2746_6 = this.c;
    if (!((life3_8 != 0))) {
        forwardValue2746_49_0 = spill2746_6;
        break forward_join_49;
    }
    forwardValue2746_43_0 = spill2746_6;
    forwardValue2746_43_1 = 2;
    }
    if (!((forwardValue2746_43_0 == forwardValue2746_43_1))) {
        break forward_join_47;
    }
    return ((moom.MA)(life6_35)).c;
    }
    forwardValue2746_48_0 = life4_7;
    }
    forwardValue2746_49_0 = ((net.minecraft.client.renderer.texture.ITextureObject)(forwardValue2746_48_0)).a();
    }
    return forwardValue2746_49_0;
}


public net.minecraft.client.renderer.texture.ITextureObject a__ob() {
net.minecraft.client.renderer.texture.ITextureObject forwardValue2747_47_0;
    net.minecraft.client.renderer.texture.ITextureObject spill2747_0;
    net.minecraft.client.renderer.texture.ITextureObject spill2747_1;
    long life1_3;
    int life3_5;
    net.minecraft.client.renderer.texture.TextureManager life4_16;
    forward_join_47: {
    forward_join_45: {
    life1_3 = (moom.Mo.e ^ 13138440420767L);
    life3_5 = moom.MS.b();
    spill2747_0 = this.d;
    if (!((life3_5 == 0))) {
        forwardValue2747_47_0 = spill2747_0;
        break forward_join_47;
    }
    if (!((spill2747_0 == null))) {
        break forward_join_45;
    }
    life4_16 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__ok();
    this.d = ((net.minecraft.client.renderer.texture.ITextureObject)(((net.minecraft.client.renderer.texture.TextureManager)(life4_16)).a(((moom.DD)(this.b)))));
    spill2747_1 = this.d;
    if (!((life3_5 == 0))) {
        forwardValue2747_47_0 = spill2747_1;
        break forward_join_47;
    }
    if (!((spill2747_1 == null))) {
        break forward_join_45;
    }
    this.d = ((net.minecraft.client.renderer.texture.ITextureObject)(new moom.n6(this.b)));
    ((net.minecraft.client.renderer.texture.TextureManager)(life4_16)).a(((moom.DD)(this.b)), ((net.minecraft.client.renderer.texture.ITextureObject)(this.d)));
    this.d = ((net.minecraft.client.renderer.texture.ITextureObject)(((net.minecraft.client.renderer.texture.TextureManager)(life4_16)).a(((moom.DD)(this.b)))));
    }
    forwardValue2747_47_0 = this.d;
    }
    return forwardValue2747_47_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic2748_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic2748_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic2748_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic2748_11(java.lang.String a0, int a1, java.lang.String a2, moom.DD a3, java.lang.String a4, java.lang.Object a5) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6456_0() throws E;
}
