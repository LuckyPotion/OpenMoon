package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ss extends net.minecraft.client.particle.EntityFX {

private float aV;

private double aW;

private double aX;

private double aY;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected ss(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_f0c0df27ab9d0061(moom.ss receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) throws Throwable {

moom.ss spill504_0;

    double spill504_1;

    moom.ss spill504_2;

    double spill504_3;

    moom.ss spill504_4;

    double spill504_5;

    moom.ss spill504_6;

    float spill504_7;

    moom.ss spill504_8;

    moom.ss spill504_9;

    float spill504_10;

    float spill504_11;

    long life14_3;

    float life16_47;

    life14_3 = (moom.ss.bb ^ 132945368386095L);

    moom.ss.__sourceConstructorInit_f0c0df27ab9d0061_0(((moom.ss)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)));

    ((moom.ss)(receiver)).t = ((double)(p4));

    ((moom.ss)(receiver)).u = ((double)(p5));

    ((moom.ss)(receiver)).v = ((double)(p6));

    spill504_0 = receiver;

    moom.ss __stackOp504_5_0 = receiver;

    double __stackOp504_5_1 = p1;

    spill504_1 = __stackOp504_5_1;

    ((moom.ss)(__stackOp504_5_0)).n = ((double)(__stackOp504_5_1));

    ((moom.ss)(spill504_0)).aW = ((double)(spill504_1));

    spill504_2 = receiver;

    moom.ss __stackOp504_8_0 = receiver;

    double __stackOp504_8_1 = p2;

    spill504_3 = __stackOp504_8_1;

    ((moom.ss)(__stackOp504_8_0)).o = ((double)(__stackOp504_8_1));

    ((moom.ss)(spill504_2)).aX = ((double)(spill504_3));

    spill504_4 = receiver;

    moom.ss __stackOp504_11_0 = receiver;

    double __stackOp504_11_1 = p3;

    spill504_5 = __stackOp504_11_1;

    ((moom.ss)(__stackOp504_11_0)).p = ((double)(__stackOp504_11_1));

    ((moom.ss)(spill504_4)).aY = ((double)(spill504_5));

    life16_47 = ((((java.util.Random)(((moom.ss)(receiver)).ah)).nextFloat() * 0x1.333334p-1f) + 0x1.99999ap-2f);

    spill504_6 = receiver;

    moom.ss __stackOp504_18_0 = receiver;

    float __stackOp504_18_1 = ((((java.util.Random)(((moom.ss)(receiver)).ah)).nextFloat() * 0x1.99999ap-3f) + 0x1.0p-1f);

    spill504_7 = __stackOp504_18_1;

    ((moom.ss)(__stackOp504_18_0)).aK = ((float)(__stackOp504_18_1));

    ((moom.ss)(spill504_6)).aV = ((float)(spill504_7));

    spill504_8 = receiver;

    spill504_9 = receiver;

    moom.ss __stackOp504_21_0 = receiver;

    float __stackOp504_21_1 = life16_47;

    spill504_10 = __stackOp504_21_1;

    ((moom.ss)(__stackOp504_21_0)).aO = ((float)(__stackOp504_21_1));

    moom.ss __stackOp504_23_0 = spill504_9;

    float __stackOp504_23_1 = spill504_10;

    spill504_11 = __stackOp504_23_1;

    ((moom.ss)(__stackOp504_23_0)).aN = ((float)(__stackOp504_23_1));

    ((moom.ss)(spill504_8)).aM = ((float)(spill504_11));

    moom.ss __stackOp504_26_0 = receiver;

    ((moom.ss)(__stackOp504_26_0)).aN = ((float)((((moom.ss)(__stackOp504_26_0)).aN * 0x1.333334p-2f)));

    moom.ss __stackOp504_29_0 = receiver;

    ((moom.ss)(__stackOp504_29_0)).aM = ((float)((((moom.ss)(__stackOp504_29_0)).aM * 0x1.ccccccp-1f)));

    ((moom.ss)(receiver)).aJ = ((int)((((int) (java.lang.Math.random() * 0x1.4p3d)) + __sourceIntrinsic_f0c0df27ab9d0061_invokedynamic504_33(29327, (4026956649362430898L ^ life14_3)))));

    ((moom.ss)(receiver)).Q = ((boolean)(true));

    ((moom.ss)(receiver)).g(((int)(((int) (java.lang.Math.random() * 0x1.0p3d)))));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(4403121434026187774L)), ((long)(-8422823835395814820L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200541798884963L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ss.bb ^ 15609312238508L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1544_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1544_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1544_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1544_14 = new byte[8];
    (__sourceSpill1544_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1544_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1544_16 = __sourceSpill1544_14;
    ((javax.crypto.Cipher)(__sourceSpill1544_11)).init(((int)(__sourceSpill1544_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1544_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1544_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ûó³8ó#^²Uÿ%\003\037¹M\\¦-ÙÇIÄ{\003áÝ5(¼´î"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1544_25 = local6_life21;
        int __sourceSpill1544_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1544_25)).substring(((int)(__sourceSpill1544_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1544_30 = local8_life19;
        int __sourceSpill1544_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1544_33 = new byte[8];
        (__sourceSpill1544_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1544_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1544_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1544_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1544_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1544_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1544_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1544_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1544_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1544_34)).doFinal(((byte[])(__sourceSpill1544_33)));
        (__sourceSpill1544_30)[__sourceSpill1544_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ú\007\004ê$70 ì#MÈ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1544_38 = local6_life21;
        int __sourceSpill1544_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1544_38)).substring(((int)(__sourceSpill1544_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1544_43 = local8_life19;
        int __sourceSpill1544_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1544_46 = new byte[8];
        (__sourceSpill1544_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1544_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1544_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1544_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1544_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1544_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1544_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1544_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1544_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1544_47)).doFinal(((byte[])(__sourceSpill1544_46)));
        (__sourceSpill1544_43)[__sourceSpill1544_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_f0c0df27ab9d0061_0(moom.ss a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

public boolean b__Boolean() {
return ((1) != 0);
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11563;
      if (ib[var3] == null) {
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
         long var5 = hb[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ss", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ss.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9091_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ss"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public float a__sourceReturn_f6c4892e39(float p0) {
float local2 = super.a(((float)(p0)));
    float local3 = (((float) this.aI) / ((float) this.aJ));
    local3 = (((local3 * local3) * local3) * local3);
    return ((local2 * (0x1.0p0f - local3)) + local3);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
float local9 = ((((float) this.aI) + p2) / ((float) this.aJ));
    local9 = (0x1.0p0f - local9);
    local9 = (local9 * local9);
    local9 = (0x1.0p0f - local9);
    this.aK = ((float)((this.aV * local9)));
    super.a(((moom.lw)(p0)), ((net.minecraft.entity.Entity)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    return;
}


public int a__Int(float p0) {
long local2 = (moom.ss.bb ^ 31631622157421L);
    int local4 = super.a__Int(((float)(p0)));
    float local5 = (((float) this.aI) / ((float) this.aJ));
    local5 = (local5 * local5);
    local5 = (local5 * local5);
    int local6 = (local4 & __sourceIntrinsic_dbecb07edf7c_invokedynamic9092_4(24765, (8662127128702269380L ^ local2)));
    int local7 = ((local4 >> __sourceIntrinsic_dbecb07edf7c_invokedynamic9092_5(759, (9126088617499153803L ^ local2))) & __sourceIntrinsic_dbecb07edf7c_invokedynamic9092_6(28281, (8352053374120933635L ^ local2)));
    local7 = (local7 + ((int) ((local5 * 0x1.ep3f) * 0x1.0p4f)));
    if ((local7 > __sourceIntrinsic_dbecb07edf7c_invokedynamic9092_7(15973, (1284195743437449499L ^ local2)))) {
        local7 = __sourceIntrinsic_dbecb07edf7c_invokedynamic9092_8(8044, (468717502676256785L ^ local2));
    }
    return (local6 | (local7 << __sourceIntrinsic_dbecb07edf7c_invokedynamic9092_9(16058, (6623086620634245570L ^ local2))));
}


public void g__Void() {
float life1_19;
    float life1_28;
    float life1_32;
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    life1_19 = (((float) this.aI) / ((float) this.aJ));
    life1_28 = ((-life1_19) + ((life1_19 * life1_19) * 0x1.0p1f));
    life1_32 = (0x1.0p0f - life1_28);
    this.n = ((double)((this.aW + (this.t * ((double) life1_32)))));
    this.o = ((double)(((this.aX + (this.u * ((double) life1_32))) + ((double) (0x1.0p0f - life1_32)))));
    this.p = ((double)((this.aY + (this.v * ((double) life1_32)))));
    moom.ss __stackOp4008_17_0 = this;
    moom.ss __stackOp4008_19_0 = __stackOp4008_17_0;
    int __stackOp4008_19_1 = ((moom.ss)(__stackOp4008_17_0)).aI;
    int spill4008_0 = __stackOp4008_19_1;
    ((moom.ss)(__stackOp4008_19_0)).aI = ((int)((__stackOp4008_19_1 + 1)));
    if ((spill4008_0 >= this.aJ)) {
        ((moom.ss)(this)).f__Void();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_f0c0df27ab9d0061_invokedynamic504_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9092_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9092_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9092_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9092_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9092_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9092_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9091_0() throws E;
}
