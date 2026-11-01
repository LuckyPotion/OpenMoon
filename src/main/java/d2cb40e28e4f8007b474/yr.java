package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class yr extends net.minecraft.nbt.NBTBase$NBTPrimitive {

private float c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

private static final long i;

yr() {
super();
}


public yr(float p0) {
super();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-3981174710400953547L)), ((long)(448752598771370860L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(230788532030558L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.yr.d ^ 26920625507957L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill1133_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1133_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1133_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1133_14 = new byte[8];
    (__sourceSpill1133_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill1133_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation1133_16 = __sourceSpill1133_14;
    ((javax.crypto.Cipher)(__sourceSpill1133_11)).init(((int)(__sourceSpill1133_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1133_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1133_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[2];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "©èuÒ\tâì\006¡æ§"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill1133_25 = local11_life21;
        int __sourceSpill1133_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1133_25)).substring(((int)(__sourceSpill1133_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1133_30 = local13_life19;
        int __sourceSpill1133_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill1133_33 = new byte[8];
        (__sourceSpill1133_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill1133_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill1133_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill1133_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill1133_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill1133_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill1133_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill1133_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill1133_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill1133_34)).doFinal(((byte[])(__sourceSpill1133_33)));
        (__sourceSpill1133_30)[__sourceSpill1133_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    e = ((long[])(local13_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
    javax.crypto.Cipher local0_life40;
    javax.crypto.Cipher __sourceSpill1133_42 = (local0_life40 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1133_43 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1133_44 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1133_45 = new byte[8];
    (__sourceSpill1133_45)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life46 = 1;
    while ((local1_life46 < 8)) {
        (__sourceSpill1133_45)[local1_life46] = ((byte) ((int) ((local5_life7 << (local1_life46 * 8)) >>> 56)));
        local1_life46 += 1;
    }
    byte[] __sourcePreallocation1133_47 = __sourceSpill1133_45;
    ((javax.crypto.Cipher)(__sourceSpill1133_42)).init(((int)(__sourceSpill1133_43)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1133_44)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1133_47)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life50 = -5361141552809900140L;
    byte[] __sourceSpill1133_51 = new byte[8];
    (__sourceSpill1133_51)[0] = ((byte) ((int) (local2_life50 >>> 56)));
    (__sourceSpill1133_51)[1] = ((byte) ((int) (local2_life50 >>> 48)));
    (__sourceSpill1133_51)[2] = ((byte) ((int) (local2_life50 >>> 40)));
    (__sourceSpill1133_51)[3] = ((byte) ((int) (local2_life50 >>> 32)));
    (__sourceSpill1133_51)[4] = ((byte) ((int) (local2_life50 >>> 24)));
    (__sourceSpill1133_51)[5] = ((byte) ((int) (local2_life50 >>> 16)));
    (__sourceSpill1133_51)[6] = ((byte) ((int) (local2_life50 >>> 8)));
    (__sourceSpill1133_51)[7] = ((byte) ((int) local2_life50));
    javax.crypto.Cipher __sourceSpill1133_52 = local0_life40;
    byte[] local4_life54 = ((javax.crypto.Cipher)(__sourceSpill1133_52)).doFinal(((byte[])(__sourceSpill1133_51)));
    i = ((long)((((((((((((long) (local4_life54)[0]) & 255L) << 56) | ((((long) (local4_life54)[1]) & 255L) << 48)) | ((((long) (local4_life54)[2]) & 255L) << 40)) | ((((long) (local4_life54)[3]) & 255L) << 32)) | ((((long) (local4_life54)[4]) & 255L) << 24)) | ((((long) (local4_life54)[5]) & 255L) << 16)) | ((((long) (local4_life54)[6]) & 255L) << 8)) | (((long) (local4_life54)[7]) & 255L))));
}


public boolean equals(java.lang.Object p0) {
int forwardValue4579_24_0;
    int forwardValue4579_26_0;
    int forwardValue4579_28_0;
    boolean spill4579_0;
    int spill4579_1;
    long life2_3;
    java.lang.String life4_5;
    moom.yr life5_17;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (moom.yr.d ^ 66533805112442L);
    life4_5 = net.minecraft.nbt.NBTBase.b();
    spill4579_0 = super.equals(((java.lang.Object)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4579_28_0 = ((spill4579_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill4579_0)) {
        break forward_join_27;
    }
    life5_17 = ((moom.yr)(p0));
    spill4579_1 = recovery.source.CarrierOps.fcmpl(((float)(this.c)), ((float)(((moom.yr)(life5_17)).c)));
    if (!((life4_5 == null))) {
        forwardValue4579_24_0 = spill4579_1;
        break forward_join_24;
    }
    if (!((spill4579_1 == 0))) {
        break forward_join_25;
    }
    forwardValue4579_24_0 = 1;
    }
    forwardValue4579_26_0 = forwardValue4579_24_0;
    break forward_join_26;
    }
    forwardValue4579_26_0 = 0;
    }
    return ((forwardValue4579_26_0) != 0);
    }
    forwardValue4579_28_0 = 0;
    }
    return ((forwardValue4579_28_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1717_1(this.c);
}


public int hashCode() {
return (super.hashCode() ^ java.lang.Float.floatToIntBits(((float)(this.c))));
}


public byte b__sourceReturn_7d493934e8() {
long local1 = (moom.yr.d ^ 113315779524159L);
    return ((byte) (moom.Dr.a__Int(((float)(this.c))) & __sourceIntrinsic_8bc6784b5e90_originalDynamicSite1718_3(22744, (2450482701623411927L ^ local1))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public float a__Float() {
return this.c;
}


public double a__Double() {
return ((double) this.c);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9848_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.yr.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27605;
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
            throw new RuntimeException("moom/yr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public net.minecraft.nbt.NBTBase a__yn() {
return new moom.yr(this.c);
}


public byte a() {
return 5;
}


void a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException {
long local4 = (moom.yr.d ^ 112158920232373L);
    ((moom.yB)(p2)).a(((long)(moom.yr.i)));
    this.c = ((float)(((java.io.DataInput)(p0)).readFloat()));
    return;
}


void a(java.io.DataOutput p0) throws java.io.IOException {
((java.io.DataOutput)(p0)).writeFloat(((float)(this.c)));
    return;
}


public long a__Long() {
return ((long) this.c);
}


public int a__Int() {
return moom.Dr.a__Int(((float)(this.c)));
}


public short a__Short() {
long local1 = (moom.yr.d ^ 57248441297420L);
    return ((short) (moom.Dr.a__Int(((float)(this.c))) & __sourceIntrinsic_bf7f94fc0f2a_originalDynamicSite1719_3(28244, (4118554141117034089L ^ local1))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1717_1(float a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8bc6784b5e90_originalDynamicSite1718_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9848_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf7f94fc0f2a_originalDynamicSite1719_3(int a0, long a1) throws E;
}
