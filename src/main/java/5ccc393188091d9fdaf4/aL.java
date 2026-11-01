package com.moon;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelPipeline;


public abstract class aL extends ChannelInboundHandlerAdapter {

private final com.viaversion.viaversion.api.connection.UserConnection a;

private static java.lang.String b;

private static final long d;

private static final java.lang.String[] e;

private static final java.lang.String[] f;

private static final java.util.Map g;

public aL(com.viaversion.viaversion.api.connection.UserConnection p0) {
super();
    this.a = ((com.viaversion.viaversion.api.connection.UserConnection)(p0));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-2430118058900603755L)), ((long)(5421128033164897273L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(149513958938483L)))));
    java.lang.Object __sourceSpill8_6 = null;
    g = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.aL.b(((java.lang.String)(__sourceSpill8_6)));
    long local0_life9 = (com.moon.aL.d ^ 74842782740153L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill8_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill8_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill8_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill8_16 = new byte[8];
    (__sourceSpill8_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill8_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation8_18 = __sourceSpill8_16;
    ((javax.crypto.Cipher)(__sourceSpill8_13)).init(((int)(__sourceSpill8_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill8_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation8_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[4];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "Ý\f¸ÑÛrä¤0ÙY\r.\003Õãë~\177ôú\027\tú\033Ç Ç=MK`N\004¬äöd@\032Ì\013þ¹w\001§ =A\r~Cúl"))).length();
    int local5_life26 = 32;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill8_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill8_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill8_31)).doFinal(((byte[])(__sourceSpill8_30)));
        java.lang.String __sourceSpill8_36 = ((java.lang.String)(com.moon.aL.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill8_37 = local9_life21;
        int __sourceSpill8_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill8_37)[__sourceSpill8_38] = __sourceSpill8_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    local8_life25 = ((java.lang.String)((local6_life23 = "98x\"D\001çOØàÿ_·órl7õga1û¿Õ\030pÐ\fdX°C\031ÃHl.m;­0\030À=W"))).length();
    local5_life26 = 32;
    local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill8_43 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill8_44 = local2_life11;
        byte[] local10_life46 = ((javax.crypto.Cipher)(__sourceSpill8_44)).doFinal(((byte[])(__sourceSpill8_43)));
        java.lang.String __sourceSpill8_49 = ((java.lang.String)(com.moon.aL.a(((byte[])(local10_life46))))).intern();
        java.lang.String[] __sourceSpill8_50 = local9_life21;
        int __sourceSpill8_51 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill8_50)[__sourceSpill8_51] = __sourceSpill8_49;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    e = ((java.lang.String[])(local9_life21));
    f = ((java.lang.String[])(new java.lang.String[4]));
}


public abstract java.lang.String b();

public static void b(java.lang.String p0) {
com.moon.aL.b = ((java.lang.String)(p0));
    return;
}


public static java.lang.String e() {
return com.moon.aL.b;
}


public abstract java.lang.String c();

public abstract java.lang.String d();

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
        byte[] spill9_0 = p0;
        life4_9 += 1;
        life5_44 = (spill9_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill9_1 = p0;
        life4_9 += 1;
        life5_76 = (spill9_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill9_2 = p0;
        life4_9 += 1;
        life5_91 = (spill9_2)[life4_9];
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


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 17218);
    if (((com.moon.aL.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.aL.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.aL.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/aL", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.aL.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.aL.f)[life5_8] = com.moon.aL.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.aL.f)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.aL.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public abstract java.lang.String a__String();

public com.viaversion.viaversion.api.connection.UserConnection a() {
return this.a;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral319_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/aL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void handlerAdded(ChannelHandlerContext p0) throws java.lang.Exception {
long life2_3;
    java.lang.String life4_24;
    life2_3 = (com.moon.aL.d ^ 49281385957460L);
    super.handlerAdded(((ChannelHandlerContext)(p0)));
    java.lang.String spill10_0 = com.moon.aL.e();
    ((ChannelPipeline)(((ChannelHandlerContext)(p0)).pipeline())).addBefore(((java.lang.String)(((com.moon.aL)(this)).a__String())), ((java.lang.String)(__sourceIntrinsic_68c8c257bc01_invokedynamic10_5(26287, (2458993998656034804L ^ life2_3)))), ((ChannelHandler)(new com.moon.aM(this.a))));
    life4_24 = spill10_0;
    ((ChannelPipeline)(((ChannelHandlerContext)(p0)).pipeline())).addBefore(((java.lang.String)(this.b())), ((java.lang.String)(__sourceIntrinsic_68c8c257bc01_invokedynamic10_10(8537, (5517278280279494657L ^ life2_3)))), ((ChannelHandler)(new com.moon.aN(this.a))));
    if ((life4_24 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public void userEventTriggered(ChannelHandlerContext p0, java.lang.Object p1) throws java.lang.Exception {
int forwardValue11_21_0;
    int forwardValue11_38_0;
    int forwardValue11_38_1;
    java.lang.String spill11_0;
    int spill11_1;
    int spill11_2;
    int spill11_3;
    long life3_3;
    java.lang.String life5_9;
    int life6_27;
    ChannelHandler life7_56;
    ChannelHandler life8_65;
    forward_join_91: {
    forward_join_38: {
    forward_join_28: {
    forward_join_21: {
    life3_3 = (com.moon.aL.d ^ 16929331297361L);
    spill11_0 = com.moon.aL.e();
    super.userEventTriggered(((ChannelHandlerContext)(p0)), ((java.lang.Object)(p1)));
    life5_9 = spill11_0;
    spill11_1 = ((p1 instanceof com.moon.hQ) ? 1 : 0);
    if (!((life5_9 == null))) {
        forwardValue11_21_0 = spill11_1;
        break forward_join_21;
    }
    if (!((spill11_1 != 0))) {
        break forward_join_91;
    }
    forwardValue11_21_0 = ((java.util.List)(((ChannelPipeline)(((ChannelHandlerContext)(p0)).pipeline())).names())).indexOf(((java.lang.Object)(((com.moon.aL)(this)).c())));
    }
    life6_27 = forwardValue11_21_0;
    spill11_2 = life6_27;
    spill11_3 = -1;
    if (!((life5_9 == null))) {
        forwardValue11_38_0 = spill11_2;
        forwardValue11_38_1 = spill11_3;
        break forward_join_38;
    }
    if (!((spill11_2 == spill11_3))) {
        break forward_join_28;
    }
    return;
    }
    forwardValue11_38_0 = life6_27;
    forwardValue11_38_1 = ((java.util.List)(((ChannelPipeline)(((ChannelHandlerContext)(p0)).pipeline())).names())).indexOf(((java.lang.Object)(__sourceIntrinsic_c0c2ecc50330_invokedynamic11_10(27630, (4726519046555102898L ^ life3_3)))));
    }
    if (!((forwardValue11_38_0 > forwardValue11_38_1))) {
        break forward_join_91;
    }
    life7_56 = ((ChannelPipeline)(((ChannelHandlerContext)(p0)).pipeline())).get(((java.lang.String)(__sourceIntrinsic_c0c2ecc50330_invokedynamic11_13(26287, (2459028845826925553L ^ life3_3)))));
    life8_65 = ((ChannelPipeline)(((ChannelHandlerContext)(p0)).pipeline())).get(((java.lang.String)(__sourceIntrinsic_c0c2ecc50330_invokedynamic11_16(29641, (3733725889560147606L ^ life3_3)))));
    ((ChannelPipeline)(((ChannelHandlerContext)(p0)).pipeline())).remove(((ChannelHandler)(life7_56)));
    ((ChannelPipeline)(((ChannelHandlerContext)(p0)).pipeline())).remove(((ChannelHandler)(life8_65)));
    ((ChannelPipeline)(((ChannelHandlerContext)(p0)).pipeline())).addAfter(((java.lang.String)(((com.moon.aL)(this)).c())), ((java.lang.String)(__sourceIntrinsic_c0c2ecc50330_invokedynamic11_24(26287, (2459028845826925553L ^ life3_3)))), ((ChannelHandler)(life7_56)));
    ((ChannelPipeline)(((ChannelHandlerContext)(p0)).pipeline())).addAfter(((java.lang.String)(this.d())), ((java.lang.String)(__sourceIntrinsic_c0c2ecc50330_invokedynamic11_28(8537, (5517310773641061380L ^ life3_3)))), ((ChannelHandler)(life8_65)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral319_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_68c8c257bc01_invokedynamic10_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_68c8c257bc01_invokedynamic10_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0c2ecc50330_invokedynamic11_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0c2ecc50330_invokedynamic11_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0c2ecc50330_invokedynamic11_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0c2ecc50330_invokedynamic11_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0c2ecc50330_invokedynamic11_28(int a0, long a1) throws E;
}
