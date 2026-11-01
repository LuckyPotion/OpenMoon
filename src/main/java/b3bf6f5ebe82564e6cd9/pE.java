package com.moon;


public class pE extends org.java_websocket.client.WebSocketClient {

private org.tinylog.TaggedLogger a;

private com.moon.od b;

private static java.lang.String c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

public pE(com.moon.od p0, java.lang.String p1) { super((java.net.URI)null); }

private static void __sourceConstructorBody_a047e948653361a0(com.moon.pE receiver, com.moon.od p0, java.lang.String p1) throws Throwable {
long local3 = (com.moon.pE.d ^ 49141574629301L);
    com.moon.pE.__sourceConstructorInit_a047e948653361a0_0(((com.moon.pE)(receiver)), ((java.net.URI)(java.net.URI.create(((java.lang.String)(p1))))));
    ((com.moon.pE)(receiver)).a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_a047e948653361a0_originalDynamicSite1454_3(24115, (7981241117501371341L ^ local3)))))));
    ((com.moon.pE)(receiver)).b = ((com.moon.od)(p0));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-2797878273321609783L)), ((long)(-2655947074812618947L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(266841035355821L)))));
    java.lang.Object __sourceSpill349_6 = null;
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (com.moon.pE.d ^ 59745003293188L);
    com.moon.pE.b(((java.lang.String)(__sourceSpill349_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill349_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill349_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill349_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill349_16 = new byte[8];
    (__sourceSpill349_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill349_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation349_18 = __sourceSpill349_16;
    ((javax.crypto.Cipher)(__sourceSpill349_13)).init(((int)(__sourceSpill349_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill349_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation349_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[3];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "kù<ó}|\035}©Ö¤\r\002Ù??c5?tÝä¢tóKþ¹3|è~ïvfYè%Ï«f¸\026\020$:\033:)¸æ.Ð¼cëÐ0¦&¼\027Õ5\027@ìa`«Ì\021£¾DJ0[\017*\031üTLºAîÈè?øéÉb\"°j®^¢ºÃ04u`~(EuR<\031¸`«U\f\fÉÕUk(LtùÚòÒ\023ËB;\027Ä\013\036^<úqM.'íy°89jOòåT6{Sé"))).length();
    int local5_life26 = 72;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill349_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill349_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill349_31)).doFinal(((byte[])(__sourceSpill349_30)));
        java.lang.String __sourceSpill349_36 = ((java.lang.String)(com.moon.pE.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill349_37 = local9_life21;
        int __sourceSpill349_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill349_37)[__sourceSpill349_38] = __sourceSpill349_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    e = ((java.lang.String[])(local9_life21));
    f = ((java.lang.String[])(new java.lang.String[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_a047e948653361a0_0(com.moon.pE a0, java.net.URI a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_f7959c57827b66654620(com.moon.pE a0, com.google.protobuf.GeneratedMessageV3 a1) throws E;
private static final class __SourceHandler_f7959c57827b66654620 {

public static void f542(com.moon.pE receiver, com.google.protobuf.GeneratedMessageV3 p0) throws Throwable {
    com.moon.pE forwardValue542_16_0;
    com.moon.pE forwardValue542_21_0;
    java.lang.String spill542_0;
    com.moon.pE spill542_1;
    long life2_3;
    java.nio.ByteBuffer life5_7;
    java.lang.String life4_8;
    forward_join_28: {
    forward_join_21: {
    forward_join_16: {
    life2_3 = (__fieldRead542_0() ^ 128154971112290L);
    spill542_0 = __call542_1();
    life5_7 = __call542_2(p0);
    life4_8 = spill542_0;
    spill542_1 = receiver;
    if (!((life4_8 == null))) {
        forwardValue542_16_0 = spill542_1;
        break forward_join_16;
    }
    if (!((__call542_4(__fieldRead542_3(spill542_1)) != null))) {
        break forward_join_28;
    }
    forwardValue542_16_0 = receiver;
    }
    if (!((life4_8 == null))) {
        forwardValue542_21_0 = forwardValue542_16_0;
        break forward_join_21;
    }
    if (!(__call542_5(forwardValue542_16_0))) {
        break forward_join_28;
    }
    forwardValue542_21_0 = receiver;
    }
    __call542_10(forwardValue542_21_0, __call542_9(__call542_7(__fieldRead542_6(receiver)), __call542_8(life5_7)));
    }
    return;
}
public static void h542_0(moom.Oo p0) throws Throwable {
    throw __call1054200_0(p0);
}
public static void h542_1(moom.Oo p0) throws Throwable {
    throw __call1054201_0(p0);
}
public static void h542_2(moom.Oo p0) throws Throwable {
    throw __call1054202_0(p0);
}
public static void h542_3(moom.Oo p0) throws Throwable {
    throw __call1054203_0(p0);
}
private static native long __fieldRead542_0() throws Throwable;
private static native java.lang.String __call542_1() throws Throwable;
private static native java.nio.ByteBuffer __call542_2(com.google.protobuf.GeneratedMessageV3 a0) throws Throwable;
private static native com.moon.od __fieldRead542_3(com.moon.pE a0) throws Throwable;
private static native com.moon.ov __call542_4(com.moon.od a0) throws Throwable;
private static native boolean __call542_5(com.moon.pE a0) throws Throwable;
private static native com.moon.od __fieldRead542_6(com.moon.pE a0) throws Throwable;
private static native com.moon.ov __call542_7(com.moon.od a0) throws Throwable;
private static native byte[] __call542_8(java.nio.ByteBuffer a0) throws Throwable;
private static native byte[] __call542_9(com.moon.ov a0, byte[] a1) throws Throwable;
private static native void __call542_10(com.moon.pE a0, byte[] a1) throws Throwable;
private static native java.lang.Throwable __call1054200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1054201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1054202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1054203_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_39959879dc8e19e01270(com.moon.pE a0, java.nio.ByteBuffer a1) throws E;
private static final class __SourceHandler_39959879dc8e19e01270 {

public static void f154(com.moon.pE receiver, java.nio.ByteBuffer p0) throws Throwable {
    com.moon.ov forestValue154_17_0;
    com.aayushatharva.brotli4j.decoder.DirectDecompress forestValue154_33_0;
    com.moon.ov spill154_0;
    com.aayushatharva.brotli4j.decoder.DirectDecompress spill154_1;
    org.tinylog.TaggedLogger spill154_2;
    java.lang.String spill154_3;
    java.lang.Object[] spill154_4;
    long life2_3;
    java.lang.String life4_5;
    com.moon.ov life5_9;
    java.nio.ByteBuffer life6_11;
    com.aayushatharva.brotli4j.decoder.DirectDecompress life7_26;
    java.nio.ByteBuffer life6_38;
    forest_join_64: {
    forest_join_49: {
    forest_join_33: {
    forest_join_22: {
    forest_join_17: {
    life2_3 = (__fieldRead154_0() ^ 105546007243364L);
    life4_5 = __call154_1();
    life5_9 = __call154_3(__fieldRead154_2(receiver));
    life6_11 = p0;
    spill154_0 = life5_9;
    if (!((life4_5 == null))) {
        forestValue154_17_0 = spill154_0;
        break forest_join_17;
    }
    if (!((spill154_0 != null))) {
        break forest_join_22;
    }
    forestValue154_17_0 = life5_9;
    }
    life6_11 = __call154_6(__call154_5(forestValue154_17_0, __call154_4(p0)));
    }
    life7_26 = __call154_8(__call154_7(life6_11));
    spill154_1 = life7_26;
    if (!((life4_5 == null))) {
        forestValue154_33_0 = spill154_1;
        break forest_join_33;
    }
    if (!((__call154_9(spill154_1) == __fieldRead154_10()))) {
        break forest_join_49;
    }
    forestValue154_33_0 = life7_26;
    }
    life6_38 = __call154_12(__call154_11(forestValue154_33_0));
    __call154_17(__call154_16(__call154_14(__fieldRead154_13(receiver)), __call154_15(life6_38)), life6_38);
    if (!((life4_5 != null))) {
        break forest_join_64;
    }
    __call154_18(new java.lang.String[4]);
    }
    spill154_2 = __fieldRead154_19(receiver);
    spill154_3 = __invokedynamic154_20(22121, (5492790611431859780L ^ life2_3));
    java.lang.Object[] __stackOp154_21_0 = new java.lang.Object[1];
    spill154_4 = __stackOp154_21_0;
    (__stackOp154_21_0)[0] = __call154_22(life7_26);
    __call154_23(spill154_2, spill154_3, spill154_4);
    }
    return;
}
public static void h154_0(java.lang.Throwable p0) throws Throwable {
    throw __call3015400_0(p0);
}
public static void h154_1(java.lang.Throwable p0) throws Throwable {
    throw __call3015401_0(p0);
}
public static void h154_2(java.lang.Throwable p0) throws Throwable {
    throw __call3015402_0(p0);
}
public static void h154_3(java.lang.Throwable p0) throws Throwable {
    throw __call3015403_0(p0);
}
public static void h154_4(java.lang.Throwable p0, com.moon.ov p1) throws Throwable {
    java.lang.Throwable life1_2;
    life1_2 = p0;
    throw life1_2;
}
private static native long __fieldRead154_0() throws Throwable;
private static native java.lang.String __call154_1() throws Throwable;
private static native com.moon.od __fieldRead154_2(com.moon.pE a0) throws Throwable;
private static native com.moon.ov __call154_3(com.moon.od a0) throws Throwable;
private static native byte[] __call154_4(java.nio.ByteBuffer a0) throws Throwable;
private static native byte[] __call154_5(com.moon.ov a0, byte[] a1) throws Throwable;
private static native java.nio.ByteBuffer __call154_6(byte[] a0) throws Throwable;
private static native byte[] __call154_7(java.nio.ByteBuffer a0) throws Throwable;
private static native com.aayushatharva.brotli4j.decoder.DirectDecompress __call154_8(byte[] a0) throws Throwable;
private static native com.aayushatharva.brotli4j.decoder.DecoderJNI.Status __call154_9(com.aayushatharva.brotli4j.decoder.DirectDecompress a0) throws Throwable;
private static native com.aayushatharva.brotli4j.decoder.DecoderJNI.Status __fieldRead154_10() throws Throwable;
private static native byte[] __call154_11(com.aayushatharva.brotli4j.decoder.DirectDecompress a0) throws Throwable;
private static native java.nio.ByteBuffer __call154_12(byte[] a0) throws Throwable;
private static native com.moon.od __fieldRead154_13(com.moon.pE a0) throws Throwable;
private static native com.moon.ot __call154_14(com.moon.od a0) throws Throwable;
private static native byte __call154_15(java.nio.ByteBuffer a0) throws Throwable;
private static native com.moon.ol __call154_16(com.moon.ot a0, byte a1) throws Throwable;
private static native void __call154_17(com.moon.ol a0, java.nio.ByteBuffer a1) throws Throwable;
private static native void __call154_18(java.lang.String[] a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead154_19(com.moon.pE a0) throws Throwable;
private static native java.lang.String __invokedynamic154_20(int a0, long a1) throws Throwable;
private static native com.aayushatharva.brotli4j.decoder.DecoderJNI.Status __call154_22(com.aayushatharva.brotli4j.decoder.DirectDecompress a0) throws Throwable;
private static native void __call154_23(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Throwable __call3015400_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3015401_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3015402_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3015403_0(java.lang.Throwable a0) throws Throwable;

}


public static void b(java.lang.String p0) {
c = ((java.lang.String)(p0));
    return;
}


public static java.lang.String b() {
return com.moon.pE.c;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
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
        byte[] spill1489_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1489_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1489_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1489_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1489_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1489_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7006);
    if (((com.moon.pE.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.pE.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.pE.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/pE", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.pE.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.pE.f)[life5_8] = com.moon.pE.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.pE.f)[life5_8];
}


public void a(com.google.protobuf.GeneratedMessageV3 p0) { __sourceHandlerCall_f7959c57827b66654620(this, p0); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.pE.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3142_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void onClose(int p0, java.lang.String p1, boolean p2) {
((com.moon.od)(this.b)).c();
    ((com.moon.od)(this.b)).a(((com.moon.ov)(null)));
    return;
}


public void onError(java.lang.Exception p0) {
return;
}


public void onMessage(java.nio.ByteBuffer p0) { __sourceHandlerCall_39959879dc8e19e01270(this, p0); }


public void onMessage(java.lang.String p0) {
return;
}


public void onOpen(org.java_websocket.handshake.ServerHandshake p0) {
long life2_3;
    java.lang.String life4_23;
    life2_3 = (com.moon.pE.d ^ 15466074488855L);
    java.lang.String spill800_0 = com.moon.pE.b();
    ((org.tinylog.TaggedLogger)(this.a)).info(((java.lang.Object)(__sourceIntrinsic_47fc9102cde9_invokedynamic800_3(17936, (1071584029517716559L ^ life2_3)))));
    ((com.moon.pE)(this)).send(((java.nio.ByteBuffer)(com.moon.ou.a(((com.google.protobuf.GeneratedMessageV3)(((com.moon.ao)(((com.moon.ao)(com.moon.M.b__ao())).a(((java.lang.String)(((com.moon.oe)(((com.moon.od)(this.b)).a())).b()))))).b()))))));
    life4_23 = spill800_0;
    try {
        if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.pE.b(((java.lang.String)("C7C6tc")));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw com.moon.pE.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a047e948653361a0_originalDynamicSite1454_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3142_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_47fc9102cde9_invokedynamic800_3(int a0, long a1) throws E;
}
