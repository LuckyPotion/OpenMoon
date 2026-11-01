package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jr extends moom.jq {

public moom.jD j;

private static long k;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

public jr() { super(0, 0, 0, 0); }


private static void __sourceConstructorBody_62da8d7bc4be239c(moom.jr receiver) throws Throwable {

long local1 = (moom.jr.k ^ 51642509379671L);

    moom.jr.__sourceConstructorInit_62da8d7bc4be239c_0(((moom.jr)(receiver)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_62da8d7bc4be239c_originalDynamicSite3001_1(2760, (1193467223439245228L ^ local1)))), ((int)(__sourceIntrinsic_62da8d7bc4be239c_originalDynamicSite3001_2(31065, (9212791933307489337L ^ local1)))));

    ((moom.jr)(receiver)).j = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_62da8d7bc4be239c_originalDynamicSite3001_4(8937, (1705598096729167755L ^ local1)), 0)));

    ((moom.jD)(((moom.jr)(receiver)).j)).a(((float)(-0x1.0p2f)), ((float)(-0x1.0p3f)), ((float)(-0x1.0p2f)), ((int)(__sourceIntrinsic_62da8d7bc4be239c_originalDynamicSite3001_7(10492, (4865416456029953437L ^ local1)))), ((int)(__sourceIntrinsic_62da8d7bc4be239c_originalDynamicSite3001_8(13580, (6889495904738689135L ^ local1)))), ((int)(__sourceIntrinsic_62da8d7bc4be239c_originalDynamicSite3001_9(13580, (6889495904738689135L ^ local1)))), ((float)(0x1.0p-2f)));

    ((moom.jD)(((moom.jr)(receiver)).j)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_62da8d7bc4be239c_0(moom.jr a0, int a1, int a2, int a3, int a4) throws E;

static {
k = ((long)(((moom._a)(moom._c.a(((long)(-6230758521528805215L)), ((long)(4638647897108152101L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(27890171721478L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jr.k ^ 98168356362109L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1345_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1345_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1345_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1345_14 = new byte[8];
    (__sourceSpill1345_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1345_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1345_16 = __sourceSpill1345_14;
    ((javax.crypto.Cipher)(__sourceSpill1345_11)).init(((int)(__sourceSpill1345_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1345_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1345_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "6éba\022`,\036«Yì-aôÉM\rå%bê"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1345_25 = local6_life21;
        int __sourceSpill1345_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1345_25)).substring(((int)(__sourceSpill1345_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1345_30 = local8_life19;
        int __sourceSpill1345_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1345_33 = new byte[8];
        (__sourceSpill1345_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1345_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1345_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1345_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1345_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1345_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1345_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1345_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1345_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1345_34)).doFinal(((byte[])(__sourceSpill1345_33)));
        (__sourceSpill1345_30)[__sourceSpill1345_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\005_ëDÆÓ\031x\022óBLy<"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1345_38 = local6_life21;
        int __sourceSpill1345_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1345_38)).substring(((int)(__sourceSpill1345_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1345_43 = local8_life19;
        int __sourceSpill1345_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1345_46 = new byte[8];
        (__sourceSpill1345_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1345_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1345_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1345_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1345_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1345_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1345_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1345_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1345_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1345_47)).doFinal(((byte[])(__sourceSpill1345_46)));
        (__sourceSpill1345_43)[__sourceSpill1345_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jr.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8186_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16419;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/jr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
super.a(((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)));
    ((moom.jD)(this.j)).a(((float)(p6)));
    return;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
super.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((net.minecraft.entity.Entity)(p6)));
    ((moom.jD)(this.j)).i = ((float)(((moom.jD)(this.i)).i));
    ((moom.jD)(this.j)).h = ((float)(((moom.jD)(this.i)).h));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_62da8d7bc4be239c_originalDynamicSite3001_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62da8d7bc4be239c_originalDynamicSite3001_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62da8d7bc4be239c_originalDynamicSite3001_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62da8d7bc4be239c_originalDynamicSite3001_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62da8d7bc4be239c_originalDynamicSite3001_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62da8d7bc4be239c_originalDynamicSite3001_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8186_0() throws E;
}
