package moom;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class q extends SimpleChannelInboundHandler<ByteBuf> {

moom.l a;

private static long b;

private static long[] c;

private static java.lang.Integer[] d;

private static java.util.Map e;

q(moom.l p0) { super(); }

private static void __sourceConstructorBody_ba30d70012eb39eb(moom.q receiver, moom.l p0) throws Throwable {
((moom.q)(receiver)).a = ((moom.l)(p0));
    moom.q.__sourceConstructorInit_ba30d70012eb39eb_0(((moom.q)(receiver)));
    return;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(4121038242834451549L)), ((long)(-1129447415603141223L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(251573748705724L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.q.b ^ 66128710422600L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1467_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1467_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1467_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1467_14 = new byte[8];
    (__sourceSpill1467_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1467_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1467_16 = __sourceSpill1467_14;
    ((javax.crypto.Cipher)(__sourceSpill1467_11)).init(((int)(__sourceSpill1467_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1467_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1467_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "gG½ÎÆÔ\n(²Òm¶ÉùÊæ\033 G@èÙ­M"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1467_25 = local6_life21;
        int __sourceSpill1467_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1467_25)).substring(((int)(__sourceSpill1467_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1467_30 = local8_life19;
        int __sourceSpill1467_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1467_33 = new byte[8];
        (__sourceSpill1467_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1467_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1467_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1467_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1467_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1467_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1467_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1467_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1467_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1467_34)).doFinal(((byte[])(__sourceSpill1467_33)));
        (__sourceSpill1467_30)[__sourceSpill1467_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "*ú\n\177\024¡sWú¬|6\006¸G"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1467_38 = local6_life21;
        int __sourceSpill1467_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1467_38)).substring(((int)(__sourceSpill1467_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1467_43 = local8_life19;
        int __sourceSpill1467_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1467_46 = new byte[8];
        (__sourceSpill1467_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1467_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1467_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1467_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1467_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1467_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1467_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1467_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1467_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1467_47)).doFinal(((byte[])(__sourceSpill1467_46)));
        (__sourceSpill1467_43)[__sourceSpill1467_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_ba30d70012eb39eb_0(moom.q a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_72d9a5bfc0f06ce3488c(moom.q a0, ChannelHandlerContext a1) throws E;
private static final class __SourceHandler_72d9a5bfc0f06ce3488c {

public static void f454(moom.q receiver, ChannelHandlerContext p0) throws Throwable {
    boolean spill454_0;
    long life2_3;
    ByteBuf life5_9;
    int life4_10;
    char[] life6_33;
    char[] life7_40;
    int life8_43;
    int life9_45;
    int life10_52;
    char[] life6_94;
    int life9_106;
    int life10_113;
    lexical_join_137: {
    lexical_join_120: {
    lexical_join_102: {
    lexical_join_62: {
    life2_3 = (__fieldRead454_0() ^ 53245196233179L);
    __call454_1(receiver, p0);
    spill454_0 = __call454_2();
    life5_9 = __call454_3();
    life4_10 = __integerCategory454_4(spill454_0);
    __call454_6(life5_9, __invokedynamic454_5(26111, (6022069978227444822L ^ life2_3)));
    __call454_7(life5_9, 1);
    __call454_9(life5_9, __invokedynamic454_8(29089, (5960717772142286861L ^ life2_3)));
    life6_33 = __call454_10("MC|PingHost");
    __call454_11(life5_9, (life6_33).length);
    life7_40 = life6_33;
    life8_43 = (life7_40).length;
    life9_45 = 0;
    lexical_cycle_46: while (true) {
    if (!((life9_45 < life8_43))) {
        break lexical_join_62;
    }
    life10_52 = __integerCategory454_12((life7_40)[life9_45]);
    __call454_13(life5_9, life10_52);
    life9_45 += 1;
    if (!((life4_10 == 0))) {
        break lexical_join_102;
    }
    if (!((life4_10 != 0))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    __call454_19(life5_9, (__invokedynamic454_14(6420, (8807652077412905145L ^ life2_3)) + (2 * __call454_18(__call454_17(__fieldRead454_16(__fieldRead454_15(receiver)))))));
    __call454_21(life5_9, __invokedynamic454_20(5033, (4538567984118725127L ^ life2_3)));
    life6_94 = __call454_25(__call454_24(__fieldRead454_23(__fieldRead454_22(receiver))));
    __call454_26(life5_9, (life6_94).length);
    life7_40 = life6_94;
    life8_43 = (life7_40).length;
    }
    life9_106 = 0;
    lexical_cycle_104: while (true) {
    if (!((life9_106 < life8_43))) {
        break lexical_join_120;
    }
    life10_113 = __integerCategory454_27((life7_40)[life9_106]);
    __call454_28(life5_9, life10_113);
    life9_106 += 1;
    if (!((life4_10 == 0))) {
        break lexical_join_137;
    }
    if (!((life4_10 != 0))) { continue lexical_cycle_104; }
    break lexical_cycle_104;
    }
    }
    __call454_32(life5_9, __call454_31(__fieldRead454_30(__fieldRead454_29(receiver))));
    __call454_36(__call454_34(__call454_33(p0), life5_9), __fieldRead454_35());
    __call454_37(life5_9);
    }
    return;
}
public static void h454_0(java.lang.Exception p0) throws Throwable {
    throw __call2045400_0(p0);
}
public static void h454_1(java.lang.Exception p0) throws Throwable {
    throw __call2045401_0(p0);
}
public static void h454_2(java.lang.Throwable p0, ByteBuf p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2045402_0(p1);
    throw local2;
}
private static native long __fieldRead454_0() throws Throwable;
private static native void __call454_1(moom.q a0, ChannelHandlerContext a1) throws Throwable;
private static native boolean __call454_2() throws Throwable;
private static native ByteBuf __call454_3() throws Throwable;
private static native int __integerCategory454_4(boolean value) throws Throwable;
private static native int __invokedynamic454_5(int a0, long a1) throws Throwable;
private static native ByteBuf __call454_6(ByteBuf a0, int a1) throws Throwable;
private static native ByteBuf __call454_7(ByteBuf a0, int a1) throws Throwable;
private static native int __invokedynamic454_8(int a0, long a1) throws Throwable;
private static native ByteBuf __call454_9(ByteBuf a0, int a1) throws Throwable;
private static native char[] __call454_10(java.lang.String a0) throws Throwable;
private static native ByteBuf __call454_11(ByteBuf a0, int a1) throws Throwable;
private static native int __integerCategory454_12(char value) throws Throwable;
private static native ByteBuf __call454_13(ByteBuf a0, int a1) throws Throwable;
private static native int __invokedynamic454_14(int a0, long a1) throws Throwable;
private static native moom.l __fieldRead454_15(moom.q a0) throws Throwable;
private static native moom.jK __fieldRead454_16(moom.l a0) throws Throwable;
private static native java.lang.String __call454_17(moom.jK a0) throws Throwable;
private static native int __call454_18(java.lang.String a0) throws Throwable;
private static native ByteBuf __call454_19(ByteBuf a0, int a1) throws Throwable;
private static native int __invokedynamic454_20(int a0, long a1) throws Throwable;
private static native ByteBuf __call454_21(ByteBuf a0, int a1) throws Throwable;
private static native moom.l __fieldRead454_22(moom.q a0) throws Throwable;
private static native moom.jK __fieldRead454_23(moom.l a0) throws Throwable;
private static native java.lang.String __call454_24(moom.jK a0) throws Throwable;
private static native char[] __call454_25(java.lang.String a0) throws Throwable;
private static native ByteBuf __call454_26(ByteBuf a0, int a1) throws Throwable;
private static native int __integerCategory454_27(char value) throws Throwable;
private static native ByteBuf __call454_28(ByteBuf a0, int a1) throws Throwable;
private static native moom.l __fieldRead454_29(moom.q a0) throws Throwable;
private static native moom.jK __fieldRead454_30(moom.l a0) throws Throwable;
private static native int __call454_31(moom.jK a0) throws Throwable;
private static native ByteBuf __call454_32(ByteBuf a0, int a1) throws Throwable;
private static native Channel __call454_33(ChannelHandlerContext a0) throws Throwable;
private static native ChannelFuture __call454_34(Channel a0, ByteBuf a1) throws Throwable;
private static native ChannelFutureListener __fieldRead454_35() throws Throwable;
private static native ChannelFuture __call454_36(ChannelFuture a0, ChannelFutureListener a1) throws Throwable;
private static native boolean __call454_37(ByteBuf a0) throws Throwable;
private static native java.lang.Exception __call2045400_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2045401_0(java.lang.Exception a0) throws Throwable;
private static native boolean __call2045402_0(ByteBuf a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14601;
      if (d[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = c[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/q", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_d6d0d1c167761c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8727_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/q"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(ChannelHandlerContext p0, ByteBuf p1) throws java.lang.Exception {
long life3_3;
    int life6_7;
    int life5_8;
    java.lang.String life7_32;
    java.lang.String[] life8_39;
    int life9_56;
    java.lang.String life10_60;
    java.lang.String life11_64;
    int life12_70;
    int life13_76;
    forward_join_99: {
    forward_join_96: {
    life3_3 = (moom.q.b ^ 53875416021080L);
    boolean spill4452_0 = net.minecraft.client.network.NetHandlerPlayClient.b();
    life6_7 = ((ByteBuf)(p1)).readUnsignedByte();
    life5_8 = ((spill4452_0) ? 1 : 0);
    if (!((life5_8 == 0))) { break forward_join_99; }
    if (!((life6_7 == __sourceIntrinsic_43a7407d3a5a_invokedynamic4452_4(8261, (6764127106748913769L ^ life3_3))))) { break forward_join_96; }
    life7_32 = new java.lang.String(((ByteBuf)(((ByteBuf)(p1)).readBytes(((int)((((ByteBuf)(p1)).readShort() * 2)))))).array(), com.google.common.base.Charsets.UTF_16BE);
    life8_39 = ((java.lang.String[])(com.google.common.collect.Iterables.toArray(((java.lang.Iterable)(((com.google.common.base.Splitter)(moom.jZ.a)).split(((java.lang.CharSequence)(life7_32))))), ((java.lang.Class)(java.lang.String.class)))));
    if (!((life5_8 == 0))) { break forward_join_99; }
    if (!(((java.lang.String)("§1")).equals(((java.lang.Object)((life8_39)[0]))))) { break forward_join_96; }
    life9_56 = moom.Dr.a(((java.lang.String)((life8_39)[1])), ((int)(0)));
    life10_60 = (life8_39)[2];
    life11_64 = (life8_39)[3];
    life12_70 = moom.Dr.a(((java.lang.String)((life8_39)[4])), ((int)(-1)));
    life13_76 = moom.Dr.a(((java.lang.String)((life8_39)[5])), ((int)(-1)));
    ((moom.jL)(((moom.l)(this.a)).b)).f = ((int)(-1));
    ((moom.jL)(((moom.l)(this.a)).b)).g = ((java.lang.String)(life10_60));
    ((moom.jL)(((moom.l)(this.a)).b)).d = ((java.lang.String)(life11_64));
    ((moom.jL)(((moom.l)(this.a)).b)).c = ((java.lang.String)(__sourceIntrinsic_43a7407d3a5a_invokedynamic4452_32(net.minecraft.util.EnumChatFormatting.GRAY, life12_70, net.minecraft.util.EnumChatFormatting.DARK_GRAY, net.minecraft.util.EnumChatFormatting.GRAY, life13_76)));
    }
    ((ChannelHandlerContext)(p0)).close();
    }
    return;
}


public void exceptionCaught(ChannelHandlerContext p0, java.lang.Throwable p1) throws java.lang.Exception {
((ChannelHandlerContext)(p0)).close();
    return;
}


public void channelActive(ChannelHandlerContext p0) throws java.lang.Exception { __sourceHandlerCall_72d9a5bfc0f06ce3488c(this, p0); }


private static native <E extends Throwable> int __sourceIntrinsic_43a7407d3a5a_invokedynamic4452_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_43a7407d3a5a_invokedynamic4452_32(net.minecraft.util.EnumChatFormatting a0, int a1, net.minecraft.util.EnumChatFormatting a2, net.minecraft.util.EnumChatFormatting a3, int a4) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8727_0() throws E;

private static native int __sourceExactCall_d6d0d1c167761c(int p0, long p1);

protected void channelRead0__sourceBridge_4d0fe34909(ChannelHandlerContext p0, java.lang.Object p1) throws java.lang.Exception {
((moom.q)(this)).a(((ChannelHandlerContext)(p0)), ((ByteBuf)(((ByteBuf)(p1)))));
}

public void channelRead0(ChannelHandlerContext __bridgeParam0, ByteBuf __bridgeParam1) throws java.lang.Exception { this.channelRead0__sourceBridge_4d0fe34909(((ChannelHandlerContext)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))); }
}
