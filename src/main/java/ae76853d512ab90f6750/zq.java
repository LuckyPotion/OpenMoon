package moom;

import io.netty.buffer.ByteBuf;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class zq implements moom.yK<moom.y3> {

private java.lang.String a;

private net.minecraft.network.PacketBuffer b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

public zq() {
super();
}

private static native <E extends Throwable> void __sourceConstructorInit_33ad06d5beacbeb2_0(moom.zq a0) throws E;

public zq(java.lang.String p0, net.minecraft.network.PacketBuffer p1) { super(); }


private static void __sourceConstructorBody_33ad06d5beacbeb2(moom.zq receiver, java.lang.String p0, net.minecraft.network.PacketBuffer p1) throws Throwable {

long local3 = (moom.zq.c ^ 120481325173665L);

    moom.zq.__sourceConstructorInit_33ad06d5beacbeb2_0(((moom.zq)(receiver)));

    ((moom.zq)(receiver)).a = ((java.lang.String)(p0));

    ((moom.zq)(receiver)).b = ((net.minecraft.network.PacketBuffer)(p1));

    if ((((net.minecraft.network.PacketBuffer)(p1)).writerIndex() > __sourceIntrinsic_33ad06d5beacbeb2_originalDynamicSite3635_5(23151, (4550891337939174125L ^ local3)))) {

        throw new java.lang.IllegalArgumentException("Payload may not be larger than 32767 bytes");

    }

    return;

}



static {
c = ((long)(((moom._a)(moom._c.a(((long)(-5957848975144287371L)), ((long)(3349593529627137448L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(70846109178181L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.zq.c ^ 41812442512211L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1150_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1150_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1150_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1150_14 = new byte[8];
    (__sourceSpill1150_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1150_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1150_16 = __sourceSpill1150_14;
    ((javax.crypto.Cipher)(__sourceSpill1150_11)).init(((int)(__sourceSpill1150_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1150_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1150_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "U8-\002ù \013Ò\003\\UÔÍÏòæ\022ëTþ\007"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1150_25 = local6_life21;
        int __sourceSpill1150_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1150_25)).substring(((int)(__sourceSpill1150_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1150_30 = local8_life19;
        int __sourceSpill1150_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1150_33 = new byte[8];
        (__sourceSpill1150_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1150_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1150_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1150_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1150_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1150_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1150_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1150_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1150_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1150_34)).doFinal(((byte[])(__sourceSpill1150_33)));
        (__sourceSpill1150_30)[__sourceSpill1150_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeBytes(((ByteBuf)(this.b)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.zq.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5096;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/zq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9902_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/zq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int forwardValue4610_23_0;
    boolean spill4610_0;
    int spill4610_1;
    long life2_3;
    int life5_16;
    int life4_17;
    forward_join_44: {
    forward_join_39: {
    forward_join_23: {
    life2_3 = (moom.zq.c ^ 39251543490208L);
    spill4610_0 = moom.y7.i();
    this.a = ((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_invokedynamic4610_2(1302, (252663155282094230L ^ life2_3)))))));
    life5_16 = ((net.minecraft.network.PacketBuffer)(p0)).readableBytes();
    life4_17 = ((spill4610_0) ? 1 : 0);
    spill4610_1 = life5_16;
    if (!((life4_17 != 0))) {
        forwardValue4610_23_0 = spill4610_1;
        break forward_join_23;
    }
    if (!((spill4610_1 >= 0))) {
        break forward_join_39;
    }
    forwardValue4610_23_0 = life5_16;
    }
    if (!((forwardValue4610_23_0 <= __sourceIntrinsic_ba748fb9d83f_invokedynamic4610_7(9866, (7189786132282444555L ^ life2_3))))) {
        break forward_join_39;
    }
    this.b = ((net.minecraft.network.PacketBuffer)(new net.minecraft.network.PacketBuffer(((net.minecraft.network.PacketBuffer)(p0)).readBytes(((int)(life5_16))))));
    if (!((life4_17 == 0))) {
        break forward_join_44;
    }
    }
    throw new java.io.IOException("Payload may not be larger than 32767 bytes");
    }
    return;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zq)(this)));
    return;
}


public java.lang.String a() {
return this.a;
}


public net.minecraft.network.PacketBuffer a__i() {
return this.b;
}


private static native <E extends Throwable> int __sourceIntrinsic_33ad06d5beacbeb2_originalDynamicSite3635_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9902_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic4610_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic4610_7(int a0, long a1) throws E;
}
