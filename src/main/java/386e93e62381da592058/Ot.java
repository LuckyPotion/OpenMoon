package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ot extends java.lang.Thread {

private moom.jP a;

private java.net.InetAddress b;

private java.net.MulticastSocket c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

public Ot(moom.jP p0) throws java.io.IOException { super((java.lang.String)null); }

private static void __sourceConstructorBody_ecd56f8152f41167(moom.Ot receiver, moom.jP p0) throws Throwable {
long local2 = (moom.Ot.d ^ 81863743450067L);
    moom.Ot.__sourceConstructorInit_ecd56f8152f41167_0(((moom.Ot)(receiver)), ((java.lang.String)(__sourceIntrinsic_ecd56f8152f41167_originalDynamicSite2542_3(((java.util.concurrent.atomic.AtomicInteger)(moom.jN.a)).incrementAndGet()))));
    ((moom.Ot)(receiver)).a = ((moom.jP)(p0));
    ((moom.Ot)(receiver)).setDaemon(((boolean)(true)));
    ((moom.Ot)(receiver)).c = ((java.net.MulticastSocket)(new java.net.MulticastSocket(__sourceIntrinsic_ecd56f8152f41167_originalDynamicSite2542_7(4857, (5845638689199834866L ^ local2)))));
    ((moom.Ot)(receiver)).b = ((java.net.InetAddress)(java.net.InetAddress.getByName(((java.lang.String)("224.0.2.60")))));
    ((java.net.MulticastSocket)(((moom.Ot)(receiver)).c)).setSoTimeout(((int)(__sourceIntrinsic_ecd56f8152f41167_originalDynamicSite2542_12(20857, (6370532863185913200L ^ local2)))));
    ((java.net.MulticastSocket)(((moom.Ot)(receiver)).c)).joinGroup(((java.net.InetAddress)(((moom.Ot)(receiver)).b)));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-2845038969620905467L)), ((long)(8654658298833130592L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(7462993671639L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ot.d ^ 12087355133147L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill752_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill752_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill752_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill752_14 = new byte[8];
    (__sourceSpill752_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill752_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation752_16 = __sourceSpill752_14;
    ((javax.crypto.Cipher)(__sourceSpill752_11)).init(((int)(__sourceSpill752_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill752_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation752_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ú\003:2R`XRó\n4:êÇnbî!vv"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill752_25 = local6_life21;
        int __sourceSpill752_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill752_25)).substring(((int)(__sourceSpill752_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill752_30 = local8_life19;
        int __sourceSpill752_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill752_33 = new byte[8];
        (__sourceSpill752_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill752_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill752_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill752_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill752_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill752_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill752_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill752_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill752_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill752_34)).doFinal(((byte[])(__sourceSpill752_33)));
        (__sourceSpill752_30)[__sourceSpill752_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_ecd56f8152f41167_0(moom.Ot a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_afda724f21c6445f9ac3(moom.Ot a0) throws E;
private static final class __SourceHandler_afda724f21c6445f9ac3 {

public static void f815(moom.Ot receiver) throws Throwable {
    boolean spill815_0;
    long life1_3;
    byte[] life4_11;
    int life3_12;
    java.net.DatagramPacket life5_22;
    java.lang.String life6_39;
    forest_join_58: {
    forest_join_53: {
    life1_3 = (__fieldRead815_0() ^ 12338937251996L);
    spill815_0 = __call815_1();
    life4_11 = new byte[__invokedynamic815_2(12871, (5674564509069837568L ^ life1_3))];
    life3_12 = __integerCategory815_3(spill815_0);
    forest_cycle_13: while (true) {
    if (!((!__call815_4(receiver)))) {
        break forest_join_53;
    }
    life5_22 = new java.net.DatagramPacket(life4_11, (life4_11).length);
    __call815_6(__fieldRead815_5(receiver), life5_22);
    if (!((life3_12 == 0))) {
        break forest_join_58;
    }
    life6_39 = new java.lang.String(__call815_7(life5_22), __call815_8(life5_22), __call815_9(life5_22));
    __call815_13(__fieldRead815_10(), __invokedynamic815_12(__call815_11(life5_22), life6_39));
    __call815_16(__fieldRead815_14(receiver), life6_39, __call815_15(life5_22));
    if (!((life3_12 != 0))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    }
    __call815_19(__fieldRead815_17(receiver), __fieldRead815_18(receiver));
    }
    __call815_21(__fieldRead815_20(receiver));
    return;
}
public static void h815_0(moom.Oo p0) throws Throwable {
    throw __call3081500_0(p0);
}
public static void h815_1(java.net.SocketTimeoutException p0, moom.Ot p1, int p2, byte[] p3, java.net.DatagramPacket p4, java.lang.String p5) throws Throwable {
    java.net.SocketTimeoutException life5_2;
    java.net.DatagramPacket life4_13;
    java.lang.String life5_30;
    forest_join_47: {
    forest_join_42: {
    life5_2 = p0;
    forest_cycle_2: while (true) {
    if (!((!__call3081501_0(p1)))) {
        break forest_join_42;
    }
    life4_13 = new java.net.DatagramPacket(p3, (p3).length);
    __call3081501_2(__fieldRead3081501_1(p1), life4_13);
    if (!((p2 == 0))) {
        break forest_join_47;
    }
    life5_30 = new java.lang.String(__call3081501_3(life4_13), __call3081501_4(life4_13), __call3081501_5(life4_13));
    __call3081501_9(__fieldRead3081501_6(), __invokedynamic3081501_8(__call3081501_7(life4_13), life5_30));
    __call3081501_12(__fieldRead3081501_10(p1), life5_30, __call3081501_11(life4_13));
    if (!((p2 != 0))) {
        continue forest_cycle_2;
    }
    break forest_cycle_2;
    }
    }
    __call3081501_15(__fieldRead3081501_13(p1), __fieldRead3081501_14(p1));
    }
    __call3081501_17(__fieldRead3081501_16(p1));
    return;
}
public static void h815_2(java.io.IOException p0, moom.Ot p1, int p2, byte[] p3, java.net.DatagramPacket p4, java.lang.String p5) throws Throwable {
    java.io.IOException life5_2;
    java.lang.String life5_18;
    forest_join_55: {
    forest_join_50: {
    life5_2 = p0;
    __call3081502_1(__fieldRead3081502_0(), "Couldn't ping server", life5_2);
    if (!((p2 != 0))) {
        break forest_join_50;
    }
    forest_cycle_8: while (true) {
    forest_join_33: {
    life5_18 = new java.lang.String(__call3081502_2(p4), __call3081502_3(p4), __call3081502_4(p4));
    __call3081502_8(__fieldRead3081502_5(), __invokedynamic3081502_7(__call3081502_6(p4), life5_18));
    __call3081502_11(__fieldRead3081502_9(p1), life5_18, __call3081502_10(p4));
    if (!((p2 != 0))) {
        break forest_join_33;
    }
    break forest_join_50;
    }
    if (!((!__call3081502_12(p1)))) {
        break forest_join_50;
    }
    p4 = new java.net.DatagramPacket(p3, (p3).length);
    __call3081502_14(__fieldRead3081502_13(p1), p4);
    if (!((p2 == 0))) {
        break forest_join_55;
    }
    continue forest_cycle_8;
    }
    }
    __call3081502_17(__fieldRead3081502_15(p1), __fieldRead3081502_16(p1));
    }
    __call3081502_19(__fieldRead3081502_18(p1));
    return;
}
public static void h815_3(java.io.IOException p0, moom.Ot p1, java.net.DatagramPacket p2) throws Throwable {
    java.io.IOException life2_2;
    life2_2 = p0;
    __call3081503_1(__fieldRead3081503_0(p1));
    return;
}
private static native long __fieldRead815_0() throws Throwable;
private static native boolean __call815_1() throws Throwable;
private static native int __invokedynamic815_2(int a0, long a1) throws Throwable;
private static native int __integerCategory815_3(boolean value) throws Throwable;
private static native boolean __call815_4(moom.Ot a0) throws Throwable;
private static native java.net.MulticastSocket __fieldRead815_5(moom.Ot a0) throws Throwable;
private static native void __call815_6(java.net.MulticastSocket a0, java.net.DatagramPacket a1) throws Throwable;
private static native byte[] __call815_7(java.net.DatagramPacket a0) throws Throwable;
private static native int __call815_8(java.net.DatagramPacket a0) throws Throwable;
private static native int __call815_9(java.net.DatagramPacket a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead815_10() throws Throwable;
private static native java.net.InetAddress __call815_11(java.net.DatagramPacket a0) throws Throwable;
private static native java.lang.String __invokedynamic815_12(java.net.InetAddress a0, java.lang.String a1) throws Throwable;
private static native void __call815_13(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native moom.jP __fieldRead815_14(moom.Ot a0) throws Throwable;
private static native java.net.InetAddress __call815_15(java.net.DatagramPacket a0) throws Throwable;
private static native void __call815_16(moom.jP a0, java.lang.String a1, java.net.InetAddress a2) throws Throwable;
private static native java.net.MulticastSocket __fieldRead815_17(moom.Ot a0) throws Throwable;
private static native java.net.InetAddress __fieldRead815_18(moom.Ot a0) throws Throwable;
private static native void __call815_19(java.net.MulticastSocket a0, java.net.InetAddress a1) throws Throwable;
private static native java.net.MulticastSocket __fieldRead815_20(moom.Ot a0) throws Throwable;
private static native void __call815_21(java.net.MulticastSocket a0) throws Throwable;
private static native moom.Oo __call3081500_0(moom.Oo a0) throws Throwable;
private static native boolean __call3081501_0(moom.Ot a0) throws Throwable;
private static native java.net.MulticastSocket __fieldRead3081501_1(moom.Ot a0) throws Throwable;
private static native void __call3081501_2(java.net.MulticastSocket a0, java.net.DatagramPacket a1) throws Throwable;
private static native byte[] __call3081501_3(java.net.DatagramPacket a0) throws Throwable;
private static native int __call3081501_4(java.net.DatagramPacket a0) throws Throwable;
private static native int __call3081501_5(java.net.DatagramPacket a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3081501_6() throws Throwable;
private static native java.net.InetAddress __call3081501_7(java.net.DatagramPacket a0) throws Throwable;
private static native java.lang.String __invokedynamic3081501_8(java.net.InetAddress a0, java.lang.String a1) throws Throwable;
private static native void __call3081501_9(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native moom.jP __fieldRead3081501_10(moom.Ot a0) throws Throwable;
private static native java.net.InetAddress __call3081501_11(java.net.DatagramPacket a0) throws Throwable;
private static native void __call3081501_12(moom.jP a0, java.lang.String a1, java.net.InetAddress a2) throws Throwable;
private static native java.net.MulticastSocket __fieldRead3081501_13(moom.Ot a0) throws Throwable;
private static native java.net.InetAddress __fieldRead3081501_14(moom.Ot a0) throws Throwable;
private static native void __call3081501_15(java.net.MulticastSocket a0, java.net.InetAddress a1) throws Throwable;
private static native java.net.MulticastSocket __fieldRead3081501_16(moom.Ot a0) throws Throwable;
private static native void __call3081501_17(java.net.MulticastSocket a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3081502_0() throws Throwable;
private static native void __call3081502_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native byte[] __call3081502_2(java.net.DatagramPacket a0) throws Throwable;
private static native int __call3081502_3(java.net.DatagramPacket a0) throws Throwable;
private static native int __call3081502_4(java.net.DatagramPacket a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3081502_5() throws Throwable;
private static native java.net.InetAddress __call3081502_6(java.net.DatagramPacket a0) throws Throwable;
private static native java.lang.String __invokedynamic3081502_7(java.net.InetAddress a0, java.lang.String a1) throws Throwable;
private static native void __call3081502_8(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native moom.jP __fieldRead3081502_9(moom.Ot a0) throws Throwable;
private static native java.net.InetAddress __call3081502_10(java.net.DatagramPacket a0) throws Throwable;
private static native void __call3081502_11(moom.jP a0, java.lang.String a1, java.net.InetAddress a2) throws Throwable;
private static native boolean __call3081502_12(moom.Ot a0) throws Throwable;
private static native java.net.MulticastSocket __fieldRead3081502_13(moom.Ot a0) throws Throwable;
private static native void __call3081502_14(java.net.MulticastSocket a0, java.net.DatagramPacket a1) throws Throwable;
private static native java.net.MulticastSocket __fieldRead3081502_15(moom.Ot a0) throws Throwable;
private static native java.net.InetAddress __fieldRead3081502_16(moom.Ot a0) throws Throwable;
private static native void __call3081502_17(java.net.MulticastSocket a0, java.net.InetAddress a1) throws Throwable;
private static native java.net.MulticastSocket __fieldRead3081502_18(moom.Ot a0) throws Throwable;
private static native void __call3081502_19(java.net.MulticastSocket a0) throws Throwable;
private static native java.net.MulticastSocket __fieldRead3081503_0(moom.Ot a0) throws Throwable;
private static native void __call3081503_1(java.net.MulticastSocket a0) throws Throwable;

}


public void run() { __sourceHandlerCall_afda724f21c6445f9ac3(this); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6870_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ot"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ot.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7355;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Ot", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ecd56f8152f41167_originalDynamicSite2542_3(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ecd56f8152f41167_originalDynamicSite2542_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ecd56f8152f41167_originalDynamicSite2542_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6870_0() throws E;
}
