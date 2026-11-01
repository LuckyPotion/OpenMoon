package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tY {

private final net.minecraft.entity.EntityLivingBase a;

private int b;

private float c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public tY(net.minecraft.entity.EntityLivingBase p0) {
super();
    this.a = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-1913110208236718431L)), ((long)(-3331771117813470416L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(215362331384584L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tY.d ^ 40527108119220L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1033_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1033_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1033_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1033_14 = new byte[8];
    (__sourceSpill1033_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1033_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1033_16 = __sourceSpill1033_14;
    ((javax.crypto.Cipher)(__sourceSpill1033_11)).init(((int)(__sourceSpill1033_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1033_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1033_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\004ÿ<mFíÇÛC\037\035ö"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1033_25 = local6_life21;
        int __sourceSpill1033_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1033_25)).substring(((int)(__sourceSpill1033_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1033_30 = local8_life19;
        int __sourceSpill1033_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1033_33 = new byte[8];
        (__sourceSpill1033_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1033_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1033_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1033_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1033_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1033_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1033_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1033_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1033_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1033_34)).doFinal(((byte[])(__sourceSpill1033_33)));
        (__sourceSpill1033_30)[__sourceSpill1033_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30470;
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
            throw new RuntimeException("moom/tY", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tY.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9183_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private float a(float p0, float p1, float p2) {
int forwardValue4080_26_0;
    float forwardValue4080_31_0;
    float forwardValue4080_31_1;
    int spill4080_0;
    int spill4080_1;
    float spill4080_2;
    float spill4080_3;
    long life4_3;
    float life7_9;
    int life6_10;
    forward_join_31: {
    forward_join_29: {
    forward_join_26: {
    forward_join_21: {
    life4_3 = (moom.tY.d ^ 125989326079216L);
    spill4080_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life7_9 = moom.Dr.e(((float)((p0 - p1))));
    life6_10 = spill4080_0;
    spill4080_1 = recovery.source.CarrierOps.fcmpg(((float)(life7_9)), ((float)((-p2))));
    if (!((life6_10 == 0))) {
        forwardValue4080_26_0 = spill4080_1;
        break forward_join_26;
    }
    if (!((spill4080_1 < 0))) {
        break forward_join_21;
    }
    life7_9 = (-p2);
    }
    spill4080_2 = life7_9;
    spill4080_3 = p2;
    if (!((life6_10 == 0))) {
        forwardValue4080_31_0 = spill4080_2;
        forwardValue4080_31_1 = spill4080_3;
        break forward_join_31;
    }
    forwardValue4080_26_0 = recovery.source.CarrierOps.fcmpl(((float)(spill4080_2)), ((float)(spill4080_3)));
    }
    if (!((forwardValue4080_26_0 >= 0))) {
        break forward_join_29;
    }
    life7_9 = p2;
    }
    forwardValue4080_31_0 = p0;
    forwardValue4080_31_1 = life7_9;
    }
    return (forwardValue4080_31_0 - forwardValue4080_31_1);
}


public void a() {
int forwardValue4079_97_0;
    moom.tY forwardValue4079_127_0;
    int spill4079_0;
    int spill4079_1;
    moom.tY spill4079_2;
    long life1_3;
    double life4_11;
    double life6_20;
    int life3_21;
    float life8_69;
    int life9_112;
    forward_join_138: {
    forward_join_127: {
    forward_join_126: {
    forward_join_97: {
    forward_join_86: {
    forward_join_62: {
    forward_join_60: {
    life1_3 = (moom.tY.d ^ 12234282523579L);
    life4_11 = (((net.minecraft.entity.EntityLivingBase)(this.a)).n - ((net.minecraft.entity.EntityLivingBase)(this.a)).k);
    spill4079_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    life6_20 = (((net.minecraft.entity.EntityLivingBase)(this.a)).p - ((net.minecraft.entity.EntityLivingBase)(this.a)).m);
    life3_21 = spill4079_0;
    if (!((life3_21 != 0))) {
        break forward_join_60;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((life4_11 * life4_11) + (life6_20 * life6_20)))), ((double)(0x1.0c6f7cp-22d))) > 0))) {
        break forward_join_62;
    }
    ((net.minecraft.entity.EntityLivingBase)(this.a)).a2 = ((float)(((net.minecraft.entity.EntityLivingBase)(this.a)).w));
    ((net.minecraft.entity.EntityLivingBase)(this.a)).a4 = ((float)(this.a(((float)(((net.minecraft.entity.EntityLivingBase)(this.a)).a2)), ((float)(((net.minecraft.entity.EntityLivingBase)(this.a)).a4)), ((float)(0x1.2cp6f)))));
    this.c = ((float)(((net.minecraft.entity.EntityLivingBase)(this.a)).a4));
    this.b = ((int)(0));
    }
    if (!((life3_21 == 0))) {
        break forward_join_138;
    }
    }
    life8_69 = 0x1.2cp6f;
    spill4079_1 = recovery.source.CarrierOps.fcmpl(((float)(java.lang.Math.abs(((float)((((net.minecraft.entity.EntityLivingBase)(this.a)).a4 - this.c)))))), ((float)(0x1.ep3f)));
    if (!((life3_21 != 0))) {
        forwardValue4079_97_0 = spill4079_1;
        break forward_join_97;
    }
    if (!((spill4079_1 > 0))) {
        break forward_join_86;
    }
    this.b = ((int)(0));
    this.c = ((float)(((net.minecraft.entity.EntityLivingBase)(this.a)).a4));
    if (!((life3_21 == 0))) {
        break forward_join_126;
    }
    }
    moom.tY __stackOp4079_35_0 = this;
    ((moom.tY)(__stackOp4079_35_0)).b = ((int)((((moom.tY)(__stackOp4079_35_0)).b + 1)));
    forwardValue4079_97_0 = __sourceIntrinsic_2c8ae721fed4_invokedynamic4079_38(18672, (3582376376984726935L ^ life1_3));
    }
    life9_112 = forwardValue4079_97_0;
    spill4079_2 = this;
    if (!((life3_21 != 0))) {
        forwardValue4079_127_0 = spill4079_2;
        break forward_join_127;
    }
    if (!((((moom.tY)(spill4079_2)).b > __sourceIntrinsic_2c8ae721fed4_invokedynamic4079_40(20950, (3121960310433150128L ^ life1_3))))) {
        break forward_join_126;
    }
    life8_69 = (java.lang.Math.max(((float)((0x1.0p0f - (((float) (this.b - __sourceIntrinsic_2c8ae721fed4_invokedynamic4079_42(20950, (3121960310433150128L ^ life1_3)))) / 0x1.4p3f)))), ((float)(0x0.0p0f))) * 0x1.2cp6f);
    }
    forwardValue4079_127_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(((moom.tY)(forwardValue4079_127_0)).a)).a2 = ((float)(this.a(((float)(((net.minecraft.entity.EntityLivingBase)(this.a)).a4)), ((float)(((net.minecraft.entity.EntityLivingBase)(this.a)).a2)), ((float)(life8_69)))));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9183_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic4079_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic4079_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic4079_42(int a0, long a1) throws E;
}
