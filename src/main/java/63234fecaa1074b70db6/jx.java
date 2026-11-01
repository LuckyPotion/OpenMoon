package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jx extends moom.jw {

public boolean o;

public moom.jD p;

public moom.jD q;

private static long s;

private static long[] w;

private static java.lang.Integer[] x;

private static java.util.Map y;

public jx(float p0) { super(0.0F, 0.0F, 0, 0); }


private static void __sourceConstructorBody_4696dfebfcffef7b(moom.jx receiver, float p0) throws Throwable {

long local2 = (moom.jx.s ^ 115626084406495L);

    moom.jx.__sourceConstructorInit_4696dfebfcffef7b_0(((moom.jx)(receiver)), ((float)(p0)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_1(30211, (7960766616719926228L ^ local2)))), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_2(26847, (8191124057390824715L ^ local2)))));

    ((moom.jx)(receiver)).p = ((moom.jD)(((moom.jD)(new moom.jD(receiver))).b(((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_4(10911, (1225613522339397453L ^ local2)))), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_5(24582, (8660641442760963541L ^ local2)))))));

    ((moom.jD)(((moom.jx)(receiver)).p)).a(((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.jD)(((moom.jx)(receiver)).p)).a(((int)(0)), ((int)(0))))).a(((float)(0x0.0p0f)), ((float)(0x1.8p1f)), ((float)(-0x1.bp2f)), ((int)(1)), ((int)(1)), ((int)(1)), ((float)(-0x1.0p-2f)));

    ((moom.jD)(((moom.jx)(receiver)).n)).a(((moom.jD)(((moom.jx)(receiver)).p)));

    ((moom.jx)(receiver)).q = ((moom.jD)(((moom.jD)(new moom.jD(receiver))).b(((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_16(10911, (1225613522339397453L ^ local2)))), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_17(24582, (8660641442760963541L ^ local2)))))));

    ((moom.jD)(((moom.jx)(receiver)).q)).a(((float)(-0x1.4p2f)), ((float)(-0x1.41p3f)), ((float)(-0x1.4p2f)));

    ((moom.jD)(((moom.jD)(((moom.jx)(receiver)).q)).a(((int)(0)), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_23(10911, (1225613522339397453L ^ local2))))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_25(24349, (4778285203165547206L ^ local2)))), ((int)(2)), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_26(24349, (4778285203165547206L ^ local2)))));

    ((moom.jD)(((moom.jx)(receiver)).i)).a(((moom.jD)(((moom.jx)(receiver)).q)));

    moom.jD local4 = ((moom.jD)(new moom.jD(receiver))).b(((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_31(10911, (1225613522339397453L ^ local2)))), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_32(24582, (8660641442760963541L ^ local2)))));

    ((moom.jD)(local4)).a(((float)(0x1.cp0f)), ((float)(-0x1.0p2f)), ((float)(0x1.0p1f)));

    ((moom.jD)(((moom.jD)(local4)).a(((int)(0)), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_35(7306, (8859588979983599964L ^ local2))))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_37(21010, (1447507995248396235L ^ local2)))), ((int)(4)), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_38(5272, (3324873803054104896L ^ local2)))));

    ((moom.jD)(local4)).h = ((float)(-0x1.aceeap-5f));

    ((moom.jD)(local4)).j = ((float)(0x1.aceeap-6f));

    ((moom.jD)(((moom.jx)(receiver)).q)).a(((moom.jD)(local4)));

    moom.jD local5 = ((moom.jD)(new moom.jD(receiver))).b(((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_44(10911, (1225613522339397453L ^ local2)))), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_45(24582, (8660641442760963541L ^ local2)))));

    ((moom.jD)(local5)).a(((float)(0x1.cp0f)), ((float)(-0x1.0p2f)), ((float)(0x1.0p1f)));

    ((moom.jD)(((moom.jD)(local5)).a(((int)(0)), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_48(2164, (3814663337623444901L ^ local2))))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(4)), ((int)(4)), ((int)(4)));

    ((moom.jD)(local5)).h = ((float)(-0x1.aceeap-4f));

    ((moom.jD)(local5)).j = ((float)(0x1.aceeap-5f));

    ((moom.jD)(local4)).a(((moom.jD)(local5)));

    moom.jD local6 = ((moom.jD)(new moom.jD(receiver))).b(((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_54(10911, (1225613522339397453L ^ local2)))), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_55(24582, (8660641442760963541L ^ local2)))));

    ((moom.jD)(local6)).a(((float)(0x1.cp0f)), ((float)(-0x1.0p1f)), ((float)(0x1.0p1f)));

    ((moom.jD)(((moom.jD)(local6)).a(((int)(0)), ((int)(__sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_58(24084, (7699814615743761345L ^ local2))))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(1)), ((int)(2)), ((int)(1)), ((float)(0x1.0p-2f)));

    ((moom.jD)(local6)).h = ((float)(-0x1.aceeap-3f));

    ((moom.jD)(local6)).j = ((float)(0x1.aceeap-4f));

    ((moom.jD)(local5)).a(((moom.jD)(local6)));

    return;

}



static {
s = ((long)(((moom._a)(moom._c.a(((long)(6047548447080629598L)), ((long)(-6880601194881473040L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(70756463922205L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jx.s ^ 72114284723927L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1351_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1351_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1351_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1351_14 = new byte[8];
    (__sourceSpill1351_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1351_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1351_16 = __sourceSpill1351_14;
    ((javax.crypto.Cipher)(__sourceSpill1351_11)).init(((int)(__sourceSpill1351_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1351_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1351_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "=¨þ^Ó#ª<Lhù,eÖJõÚR\0031ÄÞ\005O\rÝçåßÎíÚíñ¨BóÊá¯£6£(\177¢ËêÜ\f\023\"êãHÁ_#´¤>"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1351_25 = local6_life21;
        int __sourceSpill1351_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1351_25)).substring(((int)(__sourceSpill1351_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1351_30 = local8_life19;
        int __sourceSpill1351_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1351_33 = new byte[8];
        (__sourceSpill1351_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1351_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1351_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1351_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1351_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1351_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1351_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1351_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1351_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1351_34)).doFinal(((byte[])(__sourceSpill1351_33)));
        (__sourceSpill1351_30)[__sourceSpill1351_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ùí`\007³ºZS¸æ>\023\n\003\023"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1351_38 = local6_life21;
        int __sourceSpill1351_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1351_38)).substring(((int)(__sourceSpill1351_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1351_43 = local8_life19;
        int __sourceSpill1351_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1351_46 = new byte[8];
        (__sourceSpill1351_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1351_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1351_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1351_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1351_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1351_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1351_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1351_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1351_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1351_47)).doFinal(((byte[])(__sourceSpill1351_46)));
        (__sourceSpill1351_43)[__sourceSpill1351_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    w = ((long[])(local8_life19));
    x = ((java.lang.Integer[])(new java.lang.Integer[11]));
}

private static native <E extends Throwable> void __sourceConstructorInit_4696dfebfcffef7b_0(moom.jx a0, float a1, float a2, int a3, int a4) throws E;

private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jx.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2911;
      if (x[var3] == null) {
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
         long var5 = w[var3];
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
         Object[] var9 = (Object[])y.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               y.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/jx", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         x[var3] = var15;
      }

      return x[var3];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8195_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jx"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
moom.jx forestValue869_87_0;
    net.minecraft.entity.Entity[] spill869_0;
    moom.jD spill869_1;
    moom.jD spill869_2;
    float spill869_3;
    float spill869_4;
    moom.jx spill869_5;
    long life8_3;
    net.minecraft.entity.Entity[] life10_14;
    float life11_38;
    forest_join_90: {
    forest_join_87: {
    life8_3 = (moom.jx.s ^ 110249569124291L);
    spill869_0 = moom.iQ.b();
    super.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((net.minecraft.entity.Entity)(p6)));
    life10_14 = spill869_0;
    spill869_1 = this.n;
    spill869_2 = this.n;
    moom.jD __stackOp869_6_0 = this.n;
    float __stackOp869_6_1 = 0x0.0p0f;
    spill869_3 = __stackOp869_6_1;
    ((moom.jD)(__stackOp869_6_0)).v = ((float)(__stackOp869_6_1));
    moom.jD __stackOp869_8_0 = spill869_2;
    float __stackOp869_8_1 = spill869_3;
    spill869_4 = __stackOp869_8_1;
    ((moom.jD)(__stackOp869_8_0)).u = ((float)(__stackOp869_8_1));
    ((moom.jD)(spill869_1)).t = ((float)(spill869_4));
    life11_38 = (0x1.47ae14p-7f * ((float) (((net.minecraft.entity.Entity)(p6)).e__Int() % __sourceIntrinsic_9ae3c8defce5_invokedynamic869_12(10321, (3084652841150682781L ^ life8_3)))));
    ((moom.jD)(this.n)).h = ((float)((((moom.Dr.a(((float)((((float) ((net.minecraft.entity.Entity)(p6)).S) * life11_38)))) * 0x1.2p2f) * 0x1.921fb6p1f) / 0x1.68p7f)));
    ((moom.jD)(this.n)).i = ((float)(0x0.0p0f));
    ((moom.jD)(this.n)).j = ((float)((((moom.Dr.b(((float)((((float) ((net.minecraft.entity.Entity)(p6)).S) * life11_38)))) * 0x1.4p1f) * 0x1.921fb6p1f) / 0x1.68p7f)));
    spill869_5 = this;
    if (!((life10_14 != null))) {
        forestValue869_87_0 = spill869_5;
        break forest_join_87;
    }
    if (!(((moom.jx)(spill869_5)).o)) {
        break forest_join_90;
    }
    ((moom.jD)(this.n)).h = ((float)(-0x1.ccccccp-1f));
    ((moom.jD)(this.n)).v = ((float)(-0x1.8p-4f));
    forestValue869_87_0 = this;
    }
    ((moom.jD)(((moom.jx)(forestValue869_87_0)).n)).u = ((float)(0x1.8p-3f));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4696dfebfcffef7b_originalDynamicSite3014_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic869_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8195_0() throws E;
}
