package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class yq extends net.minecraft.nbt.NBTBase$NBTPrimitive {

private double c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

private static final long i;

yq() {
super();
}


public yq(double p0) {
super();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-5444791084962080703L)), ((long)(-3029266283466565635L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(123951198934390L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.yq.d ^ 5345942562567L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill1132_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1132_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1132_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1132_14 = new byte[8];
    (__sourceSpill1132_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill1132_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation1132_16 = __sourceSpill1132_14;
    ((javax.crypto.Cipher)(__sourceSpill1132_11)).init(((int)(__sourceSpill1132_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1132_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1132_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[4];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "ÁÿU÷bVeÖ\022\036ÍÑM$"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill1132_25 = local11_life21;
        int __sourceSpill1132_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1132_25)).substring(((int)(__sourceSpill1132_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1132_30 = local13_life19;
        int __sourceSpill1132_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill1132_33 = new byte[8];
        (__sourceSpill1132_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill1132_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill1132_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill1132_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill1132_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill1132_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill1132_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill1132_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill1132_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill1132_34)).doFinal(((byte[])(__sourceSpill1132_33)));
        (__sourceSpill1132_30)[__sourceSpill1132_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "¤È¨T³«\"Zw\021U4¢e"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill1132_38 = local11_life21;
        int __sourceSpill1132_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1132_38)).substring(((int)(__sourceSpill1132_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1132_43 = local13_life19;
        int __sourceSpill1132_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill1132_46 = new byte[8];
        (__sourceSpill1132_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill1132_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill1132_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill1132_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill1132_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill1132_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill1132_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill1132_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill1132_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill1132_47)).doFinal(((byte[])(__sourceSpill1132_46)));
        (__sourceSpill1132_43)[__sourceSpill1132_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    e = ((long[])(local13_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[4]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill1132_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1132_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1132_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1132_58 = new byte[8];
    (__sourceSpill1132_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill1132_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation1132_60 = __sourceSpill1132_58;
    ((javax.crypto.Cipher)(__sourceSpill1132_55)).init(((int)(__sourceSpill1132_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1132_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1132_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = -6598551482758020748L;
    byte[] __sourceSpill1132_64 = new byte[8];
    (__sourceSpill1132_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill1132_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill1132_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill1132_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill1132_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill1132_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill1132_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill1132_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill1132_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill1132_65)).doFinal(((byte[])(__sourceSpill1132_64)));
    i = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
}


public boolean equals(java.lang.Object p0) {
int forwardValue4578_24_0;
    int forwardValue4578_26_0;
    int forwardValue4578_28_0;
    boolean spill4578_0;
    int spill4578_1;
    long life2_3;
    java.lang.String life4_5;
    moom.yq life5_17;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (moom.yq.d ^ 61750719062223L);
    life4_5 = net.minecraft.nbt.NBTBase.b();
    spill4578_0 = super.equals(((java.lang.Object)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4578_28_0 = ((spill4578_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill4578_0)) {
        break forward_join_27;
    }
    life5_17 = ((moom.yq)(p0));
    spill4578_1 = recovery.source.CarrierOps.dcmpl(((double)(this.c)), ((double)(((moom.yq)(life5_17)).c)));
    if (!((life4_5 == null))) {
        forwardValue4578_24_0 = spill4578_1;
        break forward_join_24;
    }
    if (!((spill4578_1 == 0))) {
        break forward_join_25;
    }
    forwardValue4578_24_0 = 1;
    }
    forwardValue4578_26_0 = forwardValue4578_24_0;
    break forward_join_26;
    }
    forwardValue4578_26_0 = 0;
    }
    return ((forwardValue4578_26_0) != 0);
    }
    forwardValue4578_28_0 = 0;
    }
    return ((forwardValue4578_28_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1712_1(this.c);
}


public int hashCode() {
long local1 = (moom.yq.d ^ 127811090035241L);
    long local3 = java.lang.Double.doubleToLongBits(((double)(this.c)));
    return (super.hashCode() ^ ((int) (local3 ^ (local3 >>> __sourceIntrinsic_1861091996aa_originalDynamicSite1713_4(27982, (6902307805467876787L ^ local1))))));
}


public byte b__sourceReturn_7d493934e8() {
long local1 = (moom.yq.d ^ 1326730065960L);
    return ((byte) (moom.Dr.b__Int(((double)(this.c))) & __sourceIntrinsic_8bc6784b5e90_originalDynamicSite1714_3(30032, (8149475219710414766L ^ local1))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public float a__Float() {
return ((float) this.c);
}


public double a__Double() {
return this.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9846_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.yq.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3366;
      if (g[var3] == null) {
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/yq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public net.minecraft.nbt.NBTBase a__yn() {
return new moom.yq(this.c);
}


public byte a() {
long life1_3;
    life1_3 = (moom.yq.d ^ 46399030244160L);
    return ((byte)(__sourceIntrinsic_f90ab603e3aa_invokedynamic951_1(21633, (3164810656700966166L ^ life1_3))));
}


void a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException {
long local4 = (moom.yq.d ^ 247180182434L);
    ((moom.yB)(p2)).a(((long)(moom.yq.i)));
    this.c = ((double)(((java.io.DataInput)(p0)).readDouble()));
    return;
}


void a(java.io.DataOutput p0) throws java.io.IOException {
((java.io.DataOutput)(p0)).writeDouble(((double)(this.c)));
    return;
}


public long a__Long() {
return ((long) java.lang.Math.floor(((double)(this.c))));
}


public int a__Int() {
return moom.Dr.b__Int(((double)(this.c)));
}


public short a__Short() {
long local1 = (moom.yq.d ^ 90343371367451L);
    return ((short) (moom.Dr.b__Int(((double)(this.c))) & __sourceIntrinsic_bf7f94fc0f2a_originalDynamicSite1716_3(29550, (1772090918335468960L ^ local1))));
}


private static native <E extends Throwable> int __sourceIntrinsic_f90ab603e3aa_invokedynamic951_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9846_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf7f94fc0f2a_originalDynamicSite1716_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8bc6784b5e90_originalDynamicSite1714_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1713_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1712_1(double a0) throws E;
}
