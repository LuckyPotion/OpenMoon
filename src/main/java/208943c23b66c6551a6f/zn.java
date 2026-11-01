package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class zn implements moom.yK<moom.y3> {

private java.lang.String a;

private moom.DT b;

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public zn(java.lang.String p0, moom.DT p1) {
super();
    this.a = p0;
    this.b = p1;
}


public zn(java.lang.String p0) {
this(p0, null);
}


public zn() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3294858400753463856L)), ((long)(-8693692516386472808L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(14223102202232L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.zn.c ^ 64640504918305L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1148_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1148_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1148_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1148_14 = new byte[8];
    (__sourceSpill1148_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1148_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1148_16 = __sourceSpill1148_14;
    ((javax.crypto.Cipher)(__sourceSpill1148_11)).init(((int)(__sourceSpill1148_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1148_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1148_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\001\007ãG\022ÄÝ\036+\027Ð\003ºÐ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1148_25 = local6_life21;
        int __sourceSpill1148_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1148_25)).substring(((int)(__sourceSpill1148_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1148_30 = local8_life19;
        int __sourceSpill1148_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1148_33 = new byte[8];
        (__sourceSpill1148_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1148_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1148_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1148_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1148_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1148_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1148_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1148_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1148_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1148_34)).doFinal(((byte[])(__sourceSpill1148_33)));
        (__sourceSpill1148_30)[__sourceSpill1148_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public moom.DT b__DT() {
return this.b;
}


public java.lang.String b() {
return this.a;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int forwardValue4609_24_0;
    net.minecraft.network.PacketBuffer forwardValue4609_34_0;
    boolean spill4609_0;
    net.minecraft.network.PacketBuffer spill4609_1;
    long life2_3;
    int life4_17;
    int life5_26;
    forward_join_37: {
    forward_join_34: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (moom.zn.c ^ 58161070224068L);
    spill4609_0 = moom.y7.j();
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(org.apache.commons.lang3.StringUtils.substring(((java.lang.String)(this.a)), ((int)(0)), ((int)(__sourceIntrinsic_0875c19f50e0_invokedynamic4609_3(12, (166370502997932823L ^ life2_3))))))));
    life4_17 = ((spill4609_0) ? 1 : 0);
    if (!((this.b != null))) {
        break forward_join_23;
    }
    forwardValue4609_24_0 = 1;
    break forward_join_24;
    }
    forwardValue4609_24_0 = 0;
    }
    life5_26 = forwardValue4609_24_0;
    spill4609_1 = p0;
    if (!((life4_17 == 0))) {
        forwardValue4609_34_0 = spill4609_1;
        break forward_join_34;
    }
    ((net.minecraft.network.PacketBuffer)(spill4609_1)).writeBoolean(((boolean)__sourceIntrinsic_integerToBoolean((life5_26))));
    if (!((life5_26 != 0))) {
        break forward_join_37;
    }
    forwardValue4609_34_0 = p0;
    }
    ((net.minecraft.network.PacketBuffer)(forwardValue4609_34_0)).a(((moom.DT)(this.b)));
    }
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zn)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5882;
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
            throw new RuntimeException("moom/zn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9900_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/zn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.zn.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (moom.zn.c ^ 72775532241229L);
    this.a = ((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_invokedynamic9901_1(26984, (1447576299683398139L ^ local2)))))));
    boolean local4 = ((net.minecraft.network.PacketBuffer)(p0)).readBoolean();
    if (local4) {
        this.b = ((moom.DT)(((net.minecraft.network.PacketBuffer)(p0)).a__DT()));
    }
    return;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zn)(this)));
    return;
}


public java.lang.String a() {
return this.a;
}


public moom.DT a__DT() {
return this.b;
}


public moom.zn a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
}


public moom.zn a(moom.DT p0) {
this.b = ((moom.DT)(p0));
    return this;
}


private static native <E extends Throwable> int __sourceIntrinsic_0875c19f50e0_invokedynamic4609_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9900_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic9901_1(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);


}
