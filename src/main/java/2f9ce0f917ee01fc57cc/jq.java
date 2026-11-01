package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jq extends moom.iQ {

public moom.jD i;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

public jq() { this(0, 0, 0, 0); }


private static void __sourceConstructorBody_3b73f60e0170cffc(moom.jq receiver) throws Throwable {

long local1_life1 = (moom.jq.l ^ 97568835034076L);

    moom.jq.__sourceConstructorInit_3b73f60e0170cffc_0(((moom.jq)(receiver)), ((int)(0)), ((int)(__sourceIntrinsic_3b73f60e0170cffc_originalDynamicSite857_2(3090, (4736378880199539950L ^ local1_life1)))), ((int)(__sourceIntrinsic_3b73f60e0170cffc_originalDynamicSite857_3(14223, (8813584199285147505L ^ local1_life1)))), ((int)(__sourceIntrinsic_3b73f60e0170cffc_originalDynamicSite857_4(12111, (7524899452882263984L ^ local1_life1)))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3b73f60e0170cffc_0(moom.jq a0, int a1, int a2, int a3, int a4) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_625bf8155330fe4d_0(moom.jq a0) throws E;

public jq(int p0, int p1, int p2, int p3) { super(); }


private static void __sourceConstructorBody_625bf8155330fe4d(moom.jq receiver, int p0, int p1, int p2, int p3) throws Throwable {

long local5 = (moom.jq.l ^ 20932102091461L);

    moom.jq.__sourceConstructorInit_625bf8155330fe4d_0(((moom.jq)(receiver)));

    ((moom.jq)(receiver)).f = ((int)(p2));

    ((moom.jq)(receiver)).g = ((int)(p3));

    ((moom.jq)(receiver)).i = ((moom.jD)(new moom.jD(receiver, p0, p1)));

    ((moom.jD)(((moom.jq)(receiver)).i)).a(((float)(-0x1.0p2f)), ((float)(-0x1.0p3f)), ((float)(-0x1.0p2f)), ((int)(__sourceIntrinsic_625bf8155330fe4d_originalDynamicSite2999_6(26406, (4514898514378718916L ^ local5)))), ((int)(__sourceIntrinsic_625bf8155330fe4d_originalDynamicSite2999_7(30694, (8604566564328402434L ^ local5)))), ((int)(__sourceIntrinsic_625bf8155330fe4d_originalDynamicSite2999_8(30694, (8604566564328402434L ^ local5)))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.jq)(receiver)).i)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));

    return;

}



static {
l = ((long)(((moom._a)(moom._c.a(((long)(5073934997813946919L)), ((long)(-6251496119254153248L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(215685753367835L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jq.l ^ 2639522831066L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1344_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1344_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1344_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1344_14 = new byte[8];
    (__sourceSpill1344_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1344_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1344_16 = __sourceSpill1344_14;
    ((javax.crypto.Cipher)(__sourceSpill1344_11)).init(((int)(__sourceSpill1344_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1344_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1344_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = " %\007H'9°{|6\027ÛÅÑ×\002²\023EcØf"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1344_25 = local6_life21;
        int __sourceSpill1344_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1344_25)).substring(((int)(__sourceSpill1344_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1344_30 = local8_life19;
        int __sourceSpill1344_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1344_33 = new byte[8];
        (__sourceSpill1344_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1344_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1344_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1344_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1344_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1344_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1344_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1344_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1344_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1344_34)).doFinal(((byte[])(__sourceSpill1344_33)));
        (__sourceSpill1344_30)[__sourceSpill1344_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\034bk±BóTÕ¯yv»¨\005÷"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1344_38 = local6_life21;
        int __sourceSpill1344_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1344_38)).substring(((int)(__sourceSpill1344_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1344_43 = local8_life19;
        int __sourceSpill1344_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1344_46 = new byte[8];
        (__sourceSpill1344_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1344_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1344_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1344_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1344_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1344_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1344_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1344_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1344_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1344_47)).doFinal(((byte[])(__sourceSpill1344_46)));
        (__sourceSpill1344_43)[__sourceSpill1344_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jq.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8185_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29980;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/jq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
((moom.jq)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    ((moom.jD)(this.i)).a(((float)(p6)));
    return;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
super.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((net.minecraft.entity.Entity)(p6)));
    ((moom.jD)(this.i)).i = ((float)((p3 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.i)).h = ((float)((p4 / 0x1.ca5dcp5f)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_3b73f60e0170cffc_originalDynamicSite857_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3b73f60e0170cffc_originalDynamicSite857_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3b73f60e0170cffc_originalDynamicSite857_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_625bf8155330fe4d_originalDynamicSite2999_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_625bf8155330fe4d_originalDynamicSite2999_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_625bf8155330fe4d_originalDynamicSite2999_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8185_0() throws E;
}
