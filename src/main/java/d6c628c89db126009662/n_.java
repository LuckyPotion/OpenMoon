package moom;


public class n_ extends moom.n2 {

private java.lang.String h;

private static net.minecraft.client.resources.data.IMetadataSerializer i;

private static long j;

private static java.lang.String[] k;

private static java.lang.String[] l;

private static java.util.Map m;

public n_(java.lang.String p0) {
super();
    this.h = p0;
}


static {
j = ((long)(__sourceExactCall_93409fc8361486(((moom._a)(__sourceExactCall_41bab94bc4b1bd(((long)(-6116208216543383138L)), ((long)(-1564484320244562848L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))), ((long)(61791093342564L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.n_.j ^ 101356123441495L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1095_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill1095_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1095_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1095_14 = new byte[8];
    (__sourceSpill1095_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1095_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1095_16 = __sourceSpill1095_14;
    ((javax.crypto.Cipher)(__sourceSpill1095_11)).init(((int)(__sourceSpill1095_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1095_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1095_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[5];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "wJþ¼^T¬ EË\037\0170~1è\017)ù\005#~Î\000½Ã<i`³¶×_ÎÍV-üâ*}BZ®Æ°_SÓà&oL\020XÚ-s\rµ:]TfÞSr\\"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill1095_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill1095_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill1095_29)).doFinal(((byte[])(__sourceSpill1095_28)));
        java.lang.String __sourceSpill1095_34 = ((java.lang.String)(__sourceExactCall_804dd4ed858bae(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill1095_35 = local9_life19;
        int __sourceSpill1095_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill1095_35)[__sourceSpill1095_36] = __sourceSpill1095_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "µ\0264\007Uî>\0056VÈ@81¨u\030Wê\016¨\001ÿçë\016R÷À+¾KuùmCôdÁàu\001\000ïs·\006×\000¹Ü/\006(XÐ¡\bo­Ï@ð¯"))).length();
    local5_life24 = 16;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill1095_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill1095_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill1095_43)).doFinal(((byte[])(__sourceSpill1095_42)));
        java.lang.String __sourceSpill1095_48 = ((java.lang.String)(__sourceExactCall_804dd4ed858bae(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill1095_49 = local9_life19;
        int __sourceSpill1095_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill1095_49)[__sourceSpill1095_50] = __sourceSpill1095_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    k = ((java.lang.String[])(local9_life19));
    l = ((java.lang.String[])(new java.lang.String[5]));
    i = ((net.minecraft.client.resources.data.IMetadataSerializer)(__sourceExactCall_728666623a8216()));
}

private static native <E extends Throwable> net.minecraft.client.resources.data.TextureMetadataSection __sourceHandlerCall_8d69276ad590842eebbd(java.lang.String a0, net.minecraft.client.resources.data.TextureMetadataSection a1) throws E;
private static final class __SourceHandler_8d69276ad590842eebbd {

public static net.minecraft.client.resources.data.TextureMetadataSection f428(java.lang.String p0, net.minecraft.client.resources.data.TextureMetadataSection p1) throws Throwable {
    net.minecraft.client.resources.data.TextureMetadataSection forwardValue428_56_0;
    int spill428_0;
    net.minecraft.client.resources.data.TextureMetadataSection spill428_1;
    long life2_3;
    java.lang.String life5_12;
    java.lang.String life6_18;
    java.io.InputStream life7_21;
    int life4_22;
    java.io.BufferedReader life8_32;
    com.google.gson.JsonObject life10_36;
    net.minecraft.client.resources.data.TextureMetadataSection life11_42;
    net.minecraft.client.resources.data.TextureMetadataSection life12_51;
    net.minecraft.client.resources.data.TextureMetadataSection life9_59;
    forward_join_63: {
    forward_join_56: {
    forward_join_55: {
    life2_3 = (__fieldRead428_0() ^ 130623440019228L);
    spill428_0 = __call428_1();
    life5_12 = __invokedynamic428_3(p0, __invokedynamic428_2(32404, (9065584470268033457L ^ life2_3)));
    life6_18 = __invokedynamic428_4(30990, (8238069352682929705L ^ life2_3));
    life7_21 = __call428_5(life5_12);
    life4_22 = spill428_0;
    if (!((life7_21 != null))) {
        break forward_join_63;
    }
    life8_32 = new java.io.BufferedReader(new java.io.InputStreamReader(life7_21));
    life10_36 = __call428_7(__call428_6(life8_32));
    life11_42 = __cast428_10(__call428_9(__fieldRead428_8(), life6_18, life10_36));
    spill428_1 = life11_42;
    if (!((life4_22 == 0))) {
        forwardValue428_56_0 = spill428_1;
        break forward_join_56;
    }
    if (!((spill428_1 == null))) {
        break forward_join_55;
    }
    life12_51 = p1;
    __call428_11(life8_32);
    __call428_12(life7_21);
    return life12_51;
    }
    forwardValue428_56_0 = life11_42;
    }
    life9_59 = forwardValue428_56_0;
    __call428_13(life8_32);
    __call428_14(life7_21);
    return life9_59;
    }
    return p1;
}
public static net.minecraft.client.resources.data.TextureMetadataSection h428_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call2042800_0(p0);
}
public static net.minecraft.client.resources.data.TextureMetadataSection h428_1(java.lang.RuntimeException p0, net.minecraft.client.resources.data.TextureMetadataSection p1, long p2, java.lang.String p3, java.io.InputStream p4, java.io.BufferedReader p5) throws Throwable {
    java.lang.RuntimeException local7 = p0;
    java.lang.String __stackOp2042801_1_0 = p3;
    java.lang.String __stackOp2042801_1_1 = __invokedynamic2042801_0(6, (6661960977774528288L ^ p2));
    __call2042801_3(__invokedynamic2042801_2(__stackOp2042801_1_1, __stackOp2042801_1_0));
    java.lang.String spill2042801_0 = __call2042801_5(__call2042801_4(local7));
    java.lang.String __stackOp2042801_8_0 = __call2042801_6(local7);
    java.lang.String __stackOp2042801_8_1 = __invokedynamic2042801_7(6348, (2809378320821116904L ^ p2));
    __call2042801_10(__invokedynamic2042801_9(spill2042801_0, __stackOp2042801_8_1, __stackOp2042801_8_0));
    net.minecraft.client.resources.data.TextureMetadataSection local8 = p1;
    __call2042801_11(p5);
    __call2042801_12(p4);
    return local8;
}
public static net.minecraft.client.resources.data.TextureMetadataSection h428_2(java.lang.Throwable p0, java.io.InputStream p1, java.io.BufferedReader p2) throws Throwable {
    java.lang.Throwable local3 = p0;
    __call2042802_0(p2);
    __call2042802_1(p1);
    throw local3;
}
private static native long __fieldRead428_0() throws Throwable;
private static native int __call428_1() throws Throwable;
private static native java.lang.String __invokedynamic428_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic428_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic428_4(int a0, long a1) throws Throwable;
private static native java.io.InputStream __call428_5(java.lang.String a0) throws Throwable;
private static native com.google.gson.JsonElement __call428_6(java.io.BufferedReader a0) throws Throwable;
private static native com.google.gson.JsonObject __call428_7(com.google.gson.JsonElement a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSerializer __fieldRead428_8() throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call428_9(net.minecraft.client.resources.data.IMetadataSerializer a0, java.lang.String a1, com.google.gson.JsonObject a2) throws Throwable;
private static native net.minecraft.client.resources.data.TextureMetadataSection __cast428_10(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native void __call428_11(java.io.BufferedReader a0) throws Throwable;
private static native void __call428_12(java.io.InputStream a0) throws Throwable;
private static native void __call428_13(java.io.BufferedReader a0) throws Throwable;
private static native void __call428_14(java.io.InputStream a0) throws Throwable;
private static native java.lang.Exception __call2042800_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.String __invokedynamic2042801_0(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2042801_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call2042801_3(java.lang.String a0) throws Throwable;
private static native java.lang.Class __call2042801_4(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.String __call2042801_5(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call2042801_6(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.String __invokedynamic2042801_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2042801_9(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call2042801_10(java.lang.String a0) throws Throwable;
private static native void __call2042801_11(java.io.BufferedReader a0) throws Throwable;
private static native void __call2042801_12(java.io.InputStream a0) throws Throwable;
private static native void __call2042802_0(java.io.BufferedReader a0) throws Throwable;
private static native void __call2042802_1(java.io.InputStream a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1bdc92443b7584043823(moom.n_ a0, moom.oR a1) throws E;
private static final class __SourceHandler_1bdc92443b7584043823 {

public static void f469(moom.n_ receiver, moom.oR p0) throws Throwable {
    java.io.InputStream forestValue469_30_0;
    int spill469_0;
    java.io.InputStream spill469_1;
    long life2_3;
    int life4_7;
    java.io.InputStream life5_11;
    java.awt.image.BufferedImage life6_32;
    net.minecraft.client.resources.data.TextureMetadataSection life7_44;
    forest_join_30: {
    forest_join_29: {
    life2_3 = (__fieldRead469_0() ^ 54391536564437L);
    spill469_0 = __call469_1();
    __call469_2(receiver);
    life4_7 = spill469_0;
    life5_11 = __call469_4(__fieldRead469_3(receiver));
    spill469_1 = life5_11;
    if (!((life4_7 == 0))) {
        forestValue469_30_0 = spill469_1;
        break forest_join_30;
    }
    if (!((spill469_1 == null))) {
        break forest_join_29;
    }
    java.lang.Object __inlineStack469_7Token;
    throw new java.io.FileNotFoundException(__invokedynamic469_8(__inlineStack469_7Output0((__inlineStack469_7Token = __inlineStack469_7Pack(__fieldRead469_5(receiver), __invokedynamic469_6(22587, (6231014328964446417L ^ life2_3))))), __inlineStack469_7Output1(__inlineStack469_7Token)));
    }
    forestValue469_30_0 = life5_11;
    }
    life6_32 = __call469_9(forestValue469_30_0);
    life7_44 = __call469_11(__fieldRead469_10(receiver), new net.minecraft.client.resources.data.TextureMetadataSection(false, false, new java.util.ArrayList()));
    __call469_15(__call469_12(receiver), life6_32, __call469_13(life7_44), __call469_14(life7_44));
    __call469_16(life5_11);
    return;
}
public static void h469_0(java.io.IOException p0) throws Throwable {
    throw __call3046900_0(p0);
}
public static void h469_1(java.io.IOException p0) throws Throwable {
    throw __call3046901_0(p0);
}
public static void h469_2(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3046902_0(p1);
    throw life2_2;
}
private static native long __fieldRead469_0() throws Throwable;
private static native int __call469_1() throws Throwable;
private static native void __call469_2(moom.n_ a0) throws Throwable;
private static native java.lang.String __fieldRead469_3(moom.n_ a0) throws Throwable;
private static native java.io.InputStream __call469_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead469_5(moom.n_ a0) throws Throwable;
private static native java.lang.String __invokedynamic469_6(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack469_7Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack469_7Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack469_7Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic469_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.awt.image.BufferedImage __call469_9(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __fieldRead469_10(moom.n_ a0) throws Throwable;
private static native net.minecraft.client.resources.data.TextureMetadataSection __call469_11(java.lang.String a0, net.minecraft.client.resources.data.TextureMetadataSection a1) throws Throwable;
private static native int __call469_12(moom.n_ a0) throws Throwable;
private static native boolean __call469_13(net.minecraft.client.resources.data.TextureMetadataSection a0) throws Throwable;
private static native boolean __call469_14(net.minecraft.client.resources.data.TextureMetadataSection a0) throws Throwable;
private static native int __call469_15(int a0, java.awt.image.BufferedImage a1, boolean a2, boolean a3) throws Throwable;
private static native void __call469_16(java.io.InputStream a0) throws Throwable;
private static native java.lang.Exception __call3046900_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3046901_0(java.io.IOException a0) throws Throwable;
private static native void __call3046902_0(java.io.InputStream a0) throws Throwable;

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
        byte[] spill4389_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4389_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4389_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4389_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4389_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4389_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3454);
    if (((moom.n_.l)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.n_.m)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.n_.m)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/n_", life9_51);
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
        life9_116 = ((java.lang.String)((moom.n_.k)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.n_.l)[life5_8] = __sourceExactCall_804dd4ed858bae(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.n_.l)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_d90aecc668add3(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8510_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/n_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(moom.oR p0) throws java.io.IOException { __sourceHandlerCall_1bdc92443b7584043823(this, p0); }


public static net.minecraft.client.resources.data.TextureMetadataSection a(java.lang.String p0, net.minecraft.client.resources.data.TextureMetadataSection p1) { return __sourceHandlerCall_8d69276ad590842eebbd(p0, p1); }


private static net.minecraft.client.resources.data.IMetadataSerializer a__sourceReturn_8bd378af37() {
net.minecraft.client.resources.data.IMetadataSerializer local0 = new net.minecraft.client.resources.data.IMetadataSerializer();
    ((net.minecraft.client.resources.data.IMetadataSerializer)(local0)).a(((net.minecraft.client.resources.data.IMetadataSectionSerializer)(new moom.pf())), ((java.lang.Class)(net.minecraft.client.resources.data.TextureMetadataSection.class)));
    ((net.minecraft.client.resources.data.IMetadataSerializer)(local0)).a(((net.minecraft.client.resources.data.IMetadataSectionSerializer)(new moom.pc())), ((java.lang.Class)(net.minecraft.client.resources.data.FontMetadataSection.class)));
    ((net.minecraft.client.resources.data.IMetadataSerializer)(local0)).a(((net.minecraft.client.resources.data.IMetadataSectionSerializer)(new moom.pb())), ((java.lang.Class)(net.minecraft.client.resources.data.AnimationMetadataSection.class)));
    ((net.minecraft.client.resources.data.IMetadataSerializer)(local0)).a(((net.minecraft.client.resources.data.IMetadataSectionSerializer)(new moom.pe())), ((java.lang.Class)(net.minecraft.client.resources.data.PackMetadataSection.class)));
    ((net.minecraft.client.resources.data.IMetadataSerializer)(local0)).a(((net.minecraft.client.resources.data.IMetadataSectionSerializer)(new moom.pd())), ((java.lang.Class)(net.minecraft.client.resources.data.LanguageMetadataSection.class)));
    return local0;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8510_0() throws E;

private static native java.lang.String __sourceExactCall_804dd4ed858bae(byte[] p0);
private static native java.lang.String __sourceExactCall_d90aecc668add3(int p0, long p1);

private static native long __sourceExactCall_93409fc8361486(moom._a p0, long p1);
private static native moom._a __sourceExactCall_41bab94bc4b1bd(long p0, long p1, java.lang.Object p2);
private static native net.minecraft.client.resources.data.IMetadataSerializer __sourceExactCall_728666623a8216();
}
