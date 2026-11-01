package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ja extends moom.iQ {

public moom.jD i;

public moom.jD[] j;

private static long k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

private static long o;

public ja() { super(); }


private static void __sourceConstructorBody_2484b4ccad6b107a(moom.ja receiver) throws Throwable {

net.minecraft.entity.Entity[] spill473_0;

    long life1_3;

    int life4_19;

    java.util.Random life5_69;

    int life6_71;

    net.minecraft.entity.Entity[] life3_72;

    float life7_111;

    float life8_124;

    int life9_138;

    forest_join_179: {

    life1_3 = (moom.ja.k ^ 129429239091171L);

    moom.ja.__sourceConstructorInit_2484b4ccad6b107a_0(((moom.ja)(receiver)));

    ((moom.ja)(receiver)).j = ((moom.jD[])(new moom.jD[__sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_2(23965, (4817412029379984318L ^ life1_3))]));

    life4_19 = __sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_4(5973, (4869134432659403120L ^ life1_3));

    ((moom.ja)(receiver)).i = ((moom.jD)(new moom.jD(receiver, 0, 0)));

    ((moom.jD)(((moom.ja)(receiver)).i)).a(((float)(-0x1.0p3f)), ((float)(-0x1.0p3f)), ((float)(-0x1.0p3f)), ((int)(__sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_7(24211, (6452431660122683570L ^ life1_3)))), ((int)(__sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_8(25564, (5593582307207775739L ^ life1_3)))), ((int)(__sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_9(25564, (5593582307207775739L ^ life1_3)))));

    moom.jD __stackOp473_12_0 = ((moom.ja)(receiver)).i;

    ((moom.jD)(__stackOp473_12_0)).f = ((float)((((moom.jD)(__stackOp473_12_0)).f + ((float) (__sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_14(22412, (5299672299963101610L ^ life1_3)) + life4_19)))));

    spill473_0 = moom.iQ.b();

    life5_69 = new java.util.Random(moom.ja.o);

    life6_71 = 0;

    life3_72 = spill473_0;

    forest_cycle_73: while (true) {

    if (!((life6_71 < (((moom.ja)(receiver)).j).length))) {

        break forest_join_179;

    }

    (((moom.ja)(receiver)).j)[life6_71] = new moom.jD(receiver, 0, 0);

    life7_111 = ((((((((float) (life6_71 % 3)) - (((float) ((life6_71 / 3) % 2)) * 0x1.0p-1f)) + 0x1.0p-2f) / 0x1.0p1f) * 0x1.0p1f) - 0x1.0p0f) * 0x1.4p2f);

    life8_124 = ((((((float) (life6_71 / 3)) / 0x1.0p1f) * 0x1.0p1f) - 0x1.0p0f) * 0x1.4p2f);

    life9_138 = (((java.util.Random)(life5_69)).nextInt(((int)(__sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_20(26855, (5843964075361996483L ^ life1_3))))) + __sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_22(27585, (5978514570572500451L ^ life1_3)));

    ((moom.jD)((((moom.ja)(receiver)).j)[life6_71])).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(life9_138)), ((int)(2)));

    ((moom.jD)((((moom.ja)(receiver)).j)[life6_71])).e = ((float)(life7_111));

    ((moom.jD)((((moom.ja)(receiver)).j)[life6_71])).g = ((float)(life8_124));

    ((moom.jD)((((moom.ja)(receiver)).j)[life6_71])).f = ((float)(((float) (__sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_30(8365, (1245245906966300301L ^ life1_3)) + life4_19))));

    life6_71 += 1;

    if (!((life3_72 == null))) {

        continue forest_cycle_73;

    }

    break forest_cycle_73;

    }

    }

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(-5057491055876163642L)), ((long)(-2030735953477985524L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(257148115788510L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.ja.k ^ 2669145638358L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill897_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill897_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill897_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill897_14 = new byte[8];
    (__sourceSpill897_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill897_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation897_16 = __sourceSpill897_14;
    ((javax.crypto.Cipher)(__sourceSpill897_11)).init(((int)(__sourceSpill897_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill897_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation897_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[8];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "§\n-\fÚg\"¹Sxs¤û\037\0035Jr\027\006sR&©\bægÑæ`0@JÕåJ\023ÃÉ¹\031\023:îö"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill897_25 = local11_life21;
        int __sourceSpill897_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill897_25)).substring(((int)(__sourceSpill897_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill897_30 = local13_life19;
        int __sourceSpill897_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill897_33 = new byte[8];
        (__sourceSpill897_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill897_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill897_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill897_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill897_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill897_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill897_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill897_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill897_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill897_34)).doFinal(((byte[])(__sourceSpill897_33)));
        (__sourceSpill897_30)[__sourceSpill897_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "\"±\004\\]Zyî.*\000!µèß"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill897_38 = local11_life21;
        int __sourceSpill897_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill897_38)).substring(((int)(__sourceSpill897_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill897_43 = local13_life19;
        int __sourceSpill897_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill897_46 = new byte[8];
        (__sourceSpill897_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill897_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill897_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill897_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill897_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill897_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill897_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill897_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill897_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill897_47)).doFinal(((byte[])(__sourceSpill897_46)));
        (__sourceSpill897_43)[__sourceSpill897_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    l = ((long[])(local13_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[8]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill897_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill897_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill897_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill897_58 = new byte[8];
    (__sourceSpill897_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill897_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation897_60 = __sourceSpill897_58;
    ((javax.crypto.Cipher)(__sourceSpill897_55)).init(((int)(__sourceSpill897_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill897_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation897_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = 2292102331306900497L;
    byte[] __sourceSpill897_64 = new byte[8];
    (__sourceSpill897_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill897_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill897_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill897_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill897_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill897_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill897_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill897_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill897_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill897_65)).doFinal(((byte[])(__sourceSpill897_64)));
    o = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_2484b4ccad6b107a_0(moom.ja a0) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8156_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ja"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18281;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ja", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ja.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
net.minecraft.entity.Entity[] spill1217_0;
    long life8_3;
    net.minecraft.entity.Entity[] life10_15;
    moom.jD[] life11_26;
    int life12_29;
    int life13_31;
    moom.jD life14_38;
    lexical_join_48: {
    lexical_join_47: {
    life8_3 = (moom.ja.k ^ 52880093615890L);
    spill1217_0 = moom.iQ.b();
    ((moom.ja)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    moom.kZ.B();
    life10_15 = spill1217_0;
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.333334p-1f)), ((float)(0x0.0p0f)));
    ((moom.jD)(this.i)).a(((float)(p6)));
    life11_26 = this.j;
    life12_29 = (life11_26).length;
    life13_31 = 0;
    lexical_cycle_32: while (true) {
    if (!((life13_31 < life12_29))) {
        break lexical_join_47;
    }
    life14_38 = (life11_26)[life13_31];
    ((moom.jD)(life14_38)).a(((float)(p6)));
    life13_31 += 1;
    if (!((life10_15 != null))) {
        break lexical_join_48;
    }
    if (!((life10_15 == null))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    moom.kZ.C();
    }
    return;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
net.minecraft.entity.Entity[] spill1216_0;
    long life8_3;
    int life11_6;
    net.minecraft.entity.Entity[] life10_7;
    lexical_join_32: {
    life8_3 = (moom.ja.k ^ 87417436461882L);
    spill1216_0 = moom.iQ.b();
    life11_6 = 0;
    life10_7 = spill1216_0;
    lexical_cycle_8: while (true) {
    if (!((life11_6 < (this.j).length))) {
        break lexical_join_32;
    }
    ((moom.jD)((this.j)[life11_6])).h = ((float)(((0x1.99999ap-3f * moom.Dr.a(((float)(((p2 * 0x1.333334p-2f) + ((float) life11_6)))))) + 0x1.99999ap-2f)));
    life11_6 += 1;
    if (!((life10_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2484b4ccad6b107a_invokedynamic473_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8156_0() throws E;
}
