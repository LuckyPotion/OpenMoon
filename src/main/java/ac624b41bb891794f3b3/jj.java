package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jj extends moom.ji {

private static long q;

private static long[] s;

private static java.lang.Integer[] w;

private static java.util.Map x;

public jj() { super(0, 0.0F); }


private static void __sourceConstructorBody_662cd7b2cf57f071(moom.jj receiver) throws Throwable {

long local1_life1 = (moom.jj.q ^ 12860142687853L);

    moom.jj.__sourceConstructorInit_662cd7b2cf57f071_0(((moom.jj)(receiver)), ((int)(__sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_2(12252, (6734821462228795777L ^ local1_life1)))), ((float)(0x0.0p0f)));

    ((moom.jj)(receiver)).i = ((moom.jD)(new moom.jD(receiver, 0, 0)));

    ((moom.jD)(((moom.jj)(receiver)).i)).a(((float)(-0x1.0p2f)), ((float)(-0x1.0p2f)), ((float)(-0x1.8p2f)), ((int)(__sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_6(23094, (6765444077391148134L ^ local1_life1)))), ((int)(__sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_7(9289, (3359829239559457297L ^ local1_life1)))), ((int)(__sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_8(1750, (2946451294586775693L ^ local1_life1)))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.jj)(receiver)).i)).a(((float)(0x0.0p0f)), ((float)(0x1.0p2f)), ((float)(-0x1.0p3f)));

    ((moom.jD)(((moom.jD)(((moom.jj)(receiver)).i)).a(((int)(__sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_13(4027, (8524383827021079018L ^ local1_life1)))), ((int)(0))))).a(((float)(-0x1.4p2f)), ((float)(-0x1.4p2f)), ((float)(-0x1.0p2f)), ((int)(1)), ((int)(3)), ((int)(1)), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.jD)(((moom.jj)(receiver)).i)).a(((int)(__sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_17(24566, (7675759971220910511L ^ local1_life1)))), ((int)(0))))).a(((float)(0x1.0p2f)), ((float)(-0x1.4p2f)), ((float)(-0x1.0p2f)), ((int)(1)), ((int)(3)), ((int)(1)), ((float)(0x0.0p0f)));

    ((moom.jj)(receiver)).j = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_20(8477, (5030663859192008515L ^ local1_life1)), 4)));

    ((moom.jD)(((moom.jj)(receiver)).j)).a(((float)(-0x1.8p2f)), ((float)(-0x1.4p3f)), ((float)(-0x1.cp2f)), ((int)(__sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_23(13309, (1960888674896747937L ^ local1_life1)))), ((int)(__sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_24(12281, (7971496279526080931L ^ local1_life1)))), ((int)(__sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_25(2079, (1215059299319457356L ^ local1_life1)))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.jj)(receiver)).j)).a(((float)(0x0.0p0f)), ((float)(0x1.4p2f)), ((float)(0x1.0p1f)));

    ((moom.jD)(((moom.jD)(((moom.jj)(receiver)).j)).a(((int)(__sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_30(24673, (6197639106514112062L ^ local1_life1)))), ((int)(0))))).a(((float)(-0x1.0p1f)), ((float)(0x1.0p1f)), ((float)(-0x1.0p3f)), ((int)(4)), ((int)(__sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_32(6280, (6123791646965937882L ^ local1_life1)))), ((int)(1)));

    ((moom.jj)(receiver)).k.e -= 0x1.0p0f;

    ((moom.jj)(receiver)).l.e += 0x1.0p0f;

    ((moom.jj)(receiver)).k.g += 0x0.0p0f;

    ((moom.jj)(receiver)).l.g += 0x0.0p0f;

    ((moom.jj)(receiver)).m.e -= 0x1.0p0f;

    ((moom.jj)(receiver)).n.e += 0x1.0p0f;

    ((moom.jj)(receiver)).m.g -= 0x1.0p0f;

    ((moom.jj)(receiver)).n.g -= 0x1.0p0f;

    receiver.p += 0x1.0p1f;

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_662cd7b2cf57f071_0(moom.jj a0, int a1, float a2) throws E;

static {
q = ((long)(((moom._a)(moom._c.a(((long)(-8021403521501327379L)), ((long)(-5561459300151185368L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(185979057489398L)))));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jj.q ^ 99056684761830L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1337_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1337_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1337_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1337_14 = new byte[8];
    (__sourceSpill1337_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1337_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1337_16 = __sourceSpill1337_14;
    ((javax.crypto.Cipher)(__sourceSpill1337_11)).init(((int)(__sourceSpill1337_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1337_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1337_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[12];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "U±G\tIÕ¦-¤Ü$µ\"\006Qb?²\"0Ã·\f÷\023¢äE0H^}\f¿èñl²WGb¡ú<\003\017æ¡+4=óªOÜeÇ»³<\013î/N\035\020"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1337_25 = local6_life21;
        int __sourceSpill1337_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1337_25)).substring(((int)(__sourceSpill1337_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1337_30 = local8_life19;
        int __sourceSpill1337_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1337_33 = new byte[8];
        (__sourceSpill1337_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1337_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1337_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1337_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1337_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1337_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1337_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1337_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1337_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1337_34)).doFinal(((byte[])(__sourceSpill1337_33)));
        (__sourceSpill1337_30)[__sourceSpill1337_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "VÏ°\013lw=2+ö!\r¼"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1337_38 = local6_life21;
        int __sourceSpill1337_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1337_38)).substring(((int)(__sourceSpill1337_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1337_43 = local8_life19;
        int __sourceSpill1337_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1337_46 = new byte[8];
        (__sourceSpill1337_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1337_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1337_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1337_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1337_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1337_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1337_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1337_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1337_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1337_47)).doFinal(((byte[])(__sourceSpill1337_46)));
        (__sourceSpill1337_43)[__sourceSpill1337_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    s = ((long[])(local8_life19));
    w = ((java.lang.Integer[])(new java.lang.Integer[12]));
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jj.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8175_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30935;
      if (w[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])x.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               x.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/jj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         w[var3] = var15;
      }

      return w[var3];
}


private static native <E extends Throwable> int __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_662cd7b2cf57f071_originalDynamicSite853_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8175_0() throws E;
}
