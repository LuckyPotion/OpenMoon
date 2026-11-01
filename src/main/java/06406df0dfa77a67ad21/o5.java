package com.moon;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageDecoder;


public class o5 {

private static long a;

private static java.lang.String[] b;

private static java.lang.String[] c;

private static java.util.Map d;

public o5() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-2387162568334735091L)), ((long)(159786927172027373L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(262715588926455L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.o5.a ^ 8599773487311L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill322_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill322_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill322_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill322_14 = new byte[8];
    (__sourceSpill322_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill322_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation322_16 = __sourceSpill322_14;
    ((javax.crypto.Cipher)(__sourceSpill322_11)).init(((int)(__sourceSpill322_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill322_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation322_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "îâm0\023\013ã6\027V(\033¬\\Ü¤ÇXV#[öÇc¶¸\030ØïFìäÇ0çi>l\017®ëÐ\032'áP}w´p"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill322_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill322_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill322_29)).doFinal(((byte[])(__sourceSpill322_28)));
        java.lang.String __sourceSpill322_34 = ((java.lang.String)(com.moon.o5.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill322_35 = local9_life19;
        int __sourceSpill322_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill322_35)[__sourceSpill322_36] = __sourceSpill322_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    b = ((java.lang.String[])(local9_life19));
    c = ((java.lang.String[])(new java.lang.String[2]));
}

private static native <E extends Throwable> void __sourceHandlerCall_62d15413e60d6dcc86a5(ChannelHandlerContext a0, ByteBuf a1) throws E;
private static final class __SourceHandler_62d15413e60d6dcc86a5 {

public static void f149(ChannelHandlerContext p0, ByteBuf p1) throws Throwable {
    java.lang.Object forestValue149_36_0;
    ByteBuf forestValue149_37_0;
    boolean spill149_0;
    ChannelHandler spill149_1;
    long life2_3;
    ChannelHandler life5_13;
    int life4_14;
    ByteBuf life6_38;
    forest_join_51: {
    forest_join_37: {
    forest_join_36: {
    forest_join_29: {
    life2_3 = (__fieldRead149_0() ^ 75013846625078L);
    spill149_0 = __call149_1();
    life5_13 = __call149_4(__call149_2(p0), __invokedynamic149_3(724, (1000372669479635209L ^ life2_3)));
    life4_14 = __integerCategory149_5(spill149_0);
    spill149_1 = life5_13;
    if (!((life4_14 == 0))) {
        forestValue149_36_0 = spill149_1;
        break forest_join_36;
    }
    if (!((__instanceOf149_6(spill149_1) != 0))) {
        break forest_join_29;
    }
    forestValue149_37_0 = __cast149_10(__call149_9(__call149_8(__cast149_7(life5_13), p0, p1), 0));
    break forest_join_37;
    }
    forestValue149_36_0 = __call149_13(__call149_12(__cast149_11(life5_13), p0, p1), 0);
    }
    forestValue149_37_0 = __cast149_14(forestValue149_36_0);
    }
    life6_38 = forestValue149_37_0;
    __call149_16(__call149_15(p1), life6_38);
    __call149_17(life6_38);
    if (!((life4_14 != 0))) {
        break forest_join_51;
    }
    __call149_18(new java.lang.String[4]);
    }
    return;
}
public static void h149_0(java.lang.reflect.InvocationTargetException p0) throws Throwable {
    throw __call3014900_0(p0);
}
public static void h149_1(java.lang.reflect.InvocationTargetException p0) throws Throwable {
    throw __call3014901_0(p0);
}
public static void h149_2(java.lang.Throwable p0, ByteBuf p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3014902_0(p1);
    throw life2_2;
}
public static void h149_3(java.lang.reflect.InvocationTargetException p0) throws Throwable {
    throw __call3014903_0(p0);
}
private static native long __fieldRead149_0() throws Throwable;
private static native boolean __call149_1() throws Throwable;
private static native ChannelPipeline __call149_2(ChannelHandlerContext a0) throws Throwable;
private static native java.lang.String __invokedynamic149_3(int a0, long a1) throws Throwable;
private static native ChannelHandler __call149_4(ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory149_5(boolean value) throws Throwable;
private static native int __instanceOf149_6(ChannelHandler a0) throws Throwable;
private static native MessageToMessageDecoder __cast149_7(ChannelHandler a0) throws Throwable;
private static native java.util.List __call149_8(MessageToMessageDecoder a0, ChannelHandlerContext a1, ByteBuf a2) throws Throwable;
private static native java.lang.Object __call149_9(java.util.List a0, int a1) throws Throwable;
private static native ByteBuf __cast149_10(java.lang.Object a0) throws Throwable;
private static native ByteToMessageDecoder __cast149_11(ChannelHandler a0) throws Throwable;
private static native java.util.List __call149_12(ByteToMessageDecoder a0, ChannelHandlerContext a1, ByteBuf a2) throws Throwable;
private static native java.lang.Object __call149_13(java.util.List a0, int a1) throws Throwable;
private static native ByteBuf __cast149_14(java.lang.Object a0) throws Throwable;
private static native ByteBuf __call149_15(ByteBuf a0) throws Throwable;
private static native ByteBuf __call149_16(ByteBuf a0, ByteBuf a1) throws Throwable;
private static native boolean __call149_17(ByteBuf a0) throws Throwable;
private static native void __call149_18(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3014900_0(java.lang.reflect.InvocationTargetException a0) throws Throwable;
private static native java.lang.Exception __call3014901_0(java.lang.reflect.InvocationTargetException a0) throws Throwable;
private static native boolean __call3014902_0(ByteBuf a0) throws Throwable;
private static native java.lang.Exception __call3014903_0(java.lang.reflect.InvocationTargetException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_734ea79ab1569c906e48(ChannelHandlerContext a0, ByteBuf a1) throws E;
private static final class __SourceHandler_734ea79ab1569c906e48 {

public static void f150(ChannelHandlerContext p0, ByteBuf p1) throws Throwable {
    int forestValue150_38_0;
    boolean spill150_0;
    long life2_3;
    ByteBuf life5_8;
    int life4_9;
    forest_join_39: {
    forest_join_38: {
    forest_join_37: {
    life2_3 = (__fieldRead150_0() ^ 125511100453706L);
    spill150_0 = __call150_1();
    life5_8 = __call150_3(__call150_2(p0));
    life4_9 = __integerCategory150_4(spill150_0);
    __call150_9(__cast150_8(__call150_7(__call150_5(p0), __invokedynamic150_6(15527, (4133015688195723015L ^ life2_3)))), p0, p1, life5_8);
    __call150_11(__call150_10(p1), life5_8);
    __call150_12(life5_8);
    if (!((__call150_13() != null))) {
        break forest_join_39;
    }
    if (!((life4_9 != 0))) {
        break forest_join_37;
    }
    forestValue150_38_0 = 0;
    break forest_join_38;
    }
    forestValue150_38_0 = 1;
    }
    __call150_14(forestValue150_38_0);
    }
    return;
}
public static void h150_0(java.lang.Throwable p0, ByteBuf p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3015000_0(p1);
    throw life2_2;
}
public static void h150_1(java.lang.Exception p0) throws Throwable {
    throw __call3015001_0(p0);
}
public static void h150_2(java.lang.Exception p0) throws Throwable {
    throw __call3015002_0(p0);
}
private static native long __fieldRead150_0() throws Throwable;
private static native boolean __call150_1() throws Throwable;
private static native ByteBufAllocator __call150_2(ChannelHandlerContext a0) throws Throwable;
private static native ByteBuf __call150_3(ByteBufAllocator a0) throws Throwable;
private static native int __integerCategory150_4(boolean value) throws Throwable;
private static native ChannelPipeline __call150_5(ChannelHandlerContext a0) throws Throwable;
private static native java.lang.String __invokedynamic150_6(int a0, long a1) throws Throwable;
private static native ChannelHandler __call150_7(ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native MessageToByteEncoder __cast150_8(ChannelHandler a0) throws Throwable;
private static native void __call150_9(MessageToByteEncoder a0, ChannelHandlerContext a1, ByteBuf a2, ByteBuf a3) throws Throwable;
private static native ByteBuf __call150_10(ByteBuf a0) throws Throwable;
private static native ByteBuf __call150_11(ByteBuf a0, ByteBuf a1) throws Throwable;
private static native boolean __call150_12(ByteBuf a0) throws Throwable;
private static native java.lang.String[] __call150_13() throws Throwable;
private static native void __call150_14(int a0) throws Throwable;
private static native boolean __call3015000_0(ByteBuf a0) throws Throwable;
private static native java.lang.Exception __call3015001_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3015002_0(java.lang.Exception a0) throws Throwable;

}


public static void b(ChannelHandlerContext p0, ByteBuf p1) throws java.lang.Exception { __sourceHandlerCall_734ea79ab1569c906e48(p0, p1); }


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 19865);
    if (((com.moon.o5.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.o5.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.o5.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/o5", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.o5.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.o5.c)[life5_8] = com.moon.o5.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.o5.c)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.o5.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3052_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/o5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill1445_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1445_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1445_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1445_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1445_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1445_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static void a(ChannelHandlerContext p0, ByteBuf p1) throws java.lang.reflect.InvocationTargetException { __sourceHandlerCall_62d15413e60d6dcc86a5(p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3052_0() throws E;
}
