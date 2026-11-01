package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jg extends moom.iQ {

public moom.jD[] i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public jg() { super(); }


private static void __sourceConstructorBody_bbf9e4ee52cb0ccc(moom.jg receiver) throws Throwable {

long local1 = (moom.jg.j ^ 64146905044800L);

    moom.jg.__sourceConstructorInit_bbf9e4ee52cb0ccc_0(((moom.jg)(receiver)));

    ((moom.jg)(receiver)).i = ((moom.jD[])(new moom.jD[__sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_2(29453, (1191036955541208547L ^ local1))]));

    (((moom.jg)(receiver)).i)[0] = new moom.jD(receiver, 0, __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_5(16374, (351279707752149275L ^ local1)));

    (((moom.jg)(receiver)).i)[1] = new moom.jD(receiver, 0, 0);

    (((moom.jg)(receiver)).i)[2] = new moom.jD(receiver, 0, 0);

    (((moom.jg)(receiver)).i)[3] = new moom.jD(receiver, 0, 0);

    (((moom.jg)(receiver)).i)[4] = new moom.jD(receiver, 0, 0);

    (((moom.jg)(receiver)).i)[5] = new moom.jD(receiver, __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_11(19921, (2371451756875858745L ^ local1)), __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_12(10245, (5184259940277167850L ^ local1)));

    int local3 = __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_13(26274, (6421337697466869833L ^ local1));

    int local4 = __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_14(9375, (9126137263003380339L ^ local1));

    int local5 = __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_15(12842, (6535190666370038976L ^ local1));

    int local6 = 4;

    ((moom.jD)((((moom.jg)(receiver)).i)[0])).a(((float)(((float) ((-local3) / 2)))), ((float)(((float) ((-local5) / 2)))), ((float)(-0x1.0p0f)), ((int)(local3)), ((int)(local5)), ((int)(2)), ((float)(0x0.0p0f)));

    ((moom.jD)((((moom.jg)(receiver)).i)[0])).a(((float)(0x0.0p0f)), ((float)(((float) local6))), ((float)(0x0.0p0f)));

    ((moom.jD)((((moom.jg)(receiver)).i)[5])).a(((float)(((float) (((-local3) / 2) + 1)))), ((float)(((float) (((-local5) / 2) + 1)))), ((float)(-0x1.0p0f)), ((int)((local3 - 2))), ((int)((local5 - 2))), ((int)(1)), ((float)(0x0.0p0f)));

    ((moom.jD)((((moom.jg)(receiver)).i)[5])).a(((float)(0x0.0p0f)), ((float)(((float) local6))), ((float)(0x0.0p0f)));

    ((moom.jD)((((moom.jg)(receiver)).i)[1])).a(((float)(((float) (((-local3) / 2) + 2)))), ((float)(((float) ((-local4) - 1)))), ((float)(-0x1.0p0f)), ((int)((local3 - 4))), ((int)(local4)), ((int)(2)), ((float)(0x0.0p0f)));

    ((moom.jD)((((moom.jg)(receiver)).i)[1])).a(((float)(((float) (((-local3) / 2) + 1)))), ((float)(((float) local6))), ((float)(0x0.0p0f)));

    ((moom.jD)((((moom.jg)(receiver)).i)[2])).a(((float)(((float) (((-local3) / 2) + 2)))), ((float)(((float) ((-local4) - 1)))), ((float)(-0x1.0p0f)), ((int)((local3 - 4))), ((int)(local4)), ((int)(2)), ((float)(0x0.0p0f)));

    ((moom.jD)((((moom.jg)(receiver)).i)[2])).a(((float)(((float) ((local3 / 2) - 1)))), ((float)(((float) local6))), ((float)(0x0.0p0f)));

    ((moom.jD)((((moom.jg)(receiver)).i)[3])).a(((float)(((float) (((-local3) / 2) + 2)))), ((float)(((float) ((-local4) - 1)))), ((float)(-0x1.0p0f)), ((int)((local3 - 4))), ((int)(local4)), ((int)(2)), ((float)(0x0.0p0f)));

    ((moom.jD)((((moom.jg)(receiver)).i)[3])).a(((float)(0x0.0p0f)), ((float)(((float) local6))), ((float)(((float) (((-local5) / 2) + 1)))));

    ((moom.jD)((((moom.jg)(receiver)).i)[4])).a(((float)(((float) (((-local3) / 2) + 2)))), ((float)(((float) ((-local4) - 1)))), ((float)(-0x1.0p0f)), ((int)((local3 - 4))), ((int)(local4)), ((int)(2)), ((float)(0x0.0p0f)));

    ((moom.jD)((((moom.jg)(receiver)).i)[4])).a(((float)(0x0.0p0f)), ((float)(((float) local6))), ((float)(((float) ((local5 / 2) - 1)))));

    ((moom.jD)((((moom.jg)(receiver)).i)[0])).h = ((float)(0x1.921fb6p0f));

    ((moom.jD)((((moom.jg)(receiver)).i)[1])).i = ((float)(0x1.2d97c8p2f));

    ((moom.jD)((((moom.jg)(receiver)).i)[2])).i = ((float)(0x1.921fb6p0f));

    ((moom.jD)((((moom.jg)(receiver)).i)[3])).i = ((float)(0x1.921fb6p1f));

    ((moom.jD)((((moom.jg)(receiver)).i)[5])).h = ((float)(-0x1.921fb6p0f));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_bbf9e4ee52cb0ccc_0(moom.jg a0) throws E;

static {
j = ((long)(((moom._a)(moom._c.a(((long)(194291295586269585L)), ((long)(-569505757341636140L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(256035444076313L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jg.j ^ 128151463557153L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1335_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1335_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1335_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1335_14 = new byte[8];
    (__sourceSpill1335_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1335_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1335_16 = __sourceSpill1335_14;
    ((javax.crypto.Cipher)(__sourceSpill1335_11)).init(((int)(__sourceSpill1335_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1335_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1335_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "vq\004+8¹\003ýÞâ\fûÏ×¾£ôõ;v þ¹\023wÖXØÞ:Tw}à-®°\026æÆ+"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1335_25 = local6_life21;
        int __sourceSpill1335_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1335_25)).substring(((int)(__sourceSpill1335_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1335_30 = local8_life19;
        int __sourceSpill1335_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1335_33 = new byte[8];
        (__sourceSpill1335_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1335_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1335_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1335_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1335_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1335_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1335_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1335_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1335_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1335_34)).doFinal(((byte[])(__sourceSpill1335_33)));
        (__sourceSpill1335_30)[__sourceSpill1335_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ÿ\"&èÄYs~\016ÅyÌá"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1335_38 = local6_life21;
        int __sourceSpill1335_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1335_38)).substring(((int)(__sourceSpill1335_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1335_43 = local8_life19;
        int __sourceSpill1335_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1335_46 = new byte[8];
        (__sourceSpill1335_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1335_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1335_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1335_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1335_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1335_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1335_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1335_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1335_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1335_47)).doFinal(((byte[])(__sourceSpill1335_46)));
        (__sourceSpill1335_43)[__sourceSpill1335_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8171_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jg.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21080;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/jg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
net.minecraft.entity.Entity[] spill1222_0;
    long life8_3;
    net.minecraft.entity.Entity[] life10_13;
    int life11_15;
    lexical_join_32: {
    life8_3 = (moom.jg.j ^ 55691322470990L);
    spill1222_0 = moom.iQ.b();
    ((moom.jD)((this.i)[5])).f = ((float)((0x1.0p2f - p3)));
    life10_13 = spill1222_0;
    life11_15 = 0;
    lexical_cycle_16: while (true) {
    if (!((life11_15 < __sourceIntrinsic_335cac213604_invokedynamic1222_4(24193, (7245641126268958054L ^ life8_3))))) {
        break lexical_join_32;
    }
    ((moom.jD)((this.i)[life11_15])).a(((float)(p6)));
    life11_15 += 1;
    if (!((life10_13 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bbf9e4ee52cb0ccc_originalDynamicSite2979_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8171_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335cac213604_invokedynamic1222_4(int a0, long a1) throws E;
}
