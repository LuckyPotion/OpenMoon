package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jv extends moom.iQ {

public moom.jD i;

public moom.jD[] j;

private static long k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

public jv() { super(); }


private static void __sourceConstructorBody_1ae3edbadf84870f(moom.jv receiver) throws Throwable {

net.minecraft.entity.Entity[] spill475_0;

    long life1_3;

    int life4_19;

    net.minecraft.entity.Entity[] life3_65;

    int life5_67;

    double life6_98;

    float life8_104;

    float life9_110;

    double life6_165;

    forest_join_176: {

    life1_3 = (moom.jv.k ^ 101107047101560L);

    moom.jv.__sourceConstructorInit_1ae3edbadf84870f_0(((moom.jv)(receiver)));

    ((moom.jv)(receiver)).j = ((moom.jD[])(new moom.jD[__sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_2(31018, (2189432782468621247L ^ life1_3))]));

    life4_19 = __sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_4(13667, (356895843105271794L ^ life1_3));

    ((moom.jv)(receiver)).i = ((moom.jD)(new moom.jD(receiver, 0, 0)));

    spill475_0 = moom.iQ.b();

    ((moom.jD)(((moom.jv)(receiver)).i)).a(((float)(-0x1.8p2f)), ((float)(-0x1.0p3f)), ((float)(-0x1.8p2f)), ((int)(__sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_8(12542, (4821279463180921449L ^ life1_3)))), ((int)(__sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_9(10575, (5213614831616521180L ^ life1_3)))), ((int)(__sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_10(27061, (8436238330644575009L ^ life1_3)))));

    moom.jD __stackOp475_13_0 = ((moom.jv)(receiver)).i;

    ((moom.jD)(__stackOp475_13_0)).f = ((float)((((moom.jD)(__stackOp475_13_0)).f + ((float) (__sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_15(17371, (7764477525601818957L ^ life1_3)) + life4_19)))));

    life3_65 = spill475_0;

    life5_67 = 0;

    forest_cycle_68: while (true) {

    if (!((life5_67 < (((moom.jv)(receiver)).j).length))) {

        break forest_join_176;

    }

    (((moom.jv)(receiver)).j)[life5_67] = new moom.jD(receiver, __sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_19(18532, (9038010005508100852L ^ life1_3)), 0);

    life6_98 = (((((double) life5_67) * 0x1.921fb54442d18p1d) * 0x1.0p1d) / ((double) (((moom.jv)(receiver)).j).length));

    life8_104 = (((float) java.lang.Math.cos(((double)(life6_98)))) * 0x1.4p2f);

    life9_110 = (((float) java.lang.Math.sin(((double)(life6_98)))) * 0x1.4p2f);

    ((moom.jD)((((moom.jv)(receiver)).j)[life5_67])).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_24(14444, (6083628231055827710L ^ life1_3)))), ((int)(2)));

    ((moom.jD)((((moom.jv)(receiver)).j)[life5_67])).e = ((float)(life8_104));

    ((moom.jD)((((moom.jv)(receiver)).j)[life5_67])).g = ((float)(life9_110));

    ((moom.jD)((((moom.jv)(receiver)).j)[life5_67])).f = ((float)(((float) (__sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_31(14422, (7097887121241531084L ^ life1_3)) + life4_19))));

    life6_165 = ((((((double) life5_67) * 0x1.921fb54442d18p1d) * -0x1.0p1d) / ((double) (((moom.jv)(receiver)).j).length)) + 0x1.921fb54442d18p0d);

    ((moom.jD)((((moom.jv)(receiver)).j)[life5_67])).i = ((float)(((float) life6_165)));

    life5_67 += 1;

    if (!((life3_65 == null))) {

        continue forest_cycle_68;

    }

    break forest_cycle_68;

    }

    }

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(-8818121123827013335L)), ((long)(-5310866444513212052L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(96622575336229L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jv.k ^ 97733303125089L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1349_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1349_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1349_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1349_14 = new byte[8];
    (__sourceSpill1349_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1349_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1349_16 = __sourceSpill1349_14;
    ((javax.crypto.Cipher)(__sourceSpill1349_11)).init(((int)(__sourceSpill1349_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1349_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1349_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "BlÎ\003¤É£JðP\rGÄ,ã\027Æ_ CÀòF{¥Rn,Ne¦\f¥/ã\tÐL¡~ôÑXd³@µd:"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1349_25 = local6_life21;
        int __sourceSpill1349_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1349_25)).substring(((int)(__sourceSpill1349_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1349_30 = local8_life19;
        int __sourceSpill1349_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1349_33 = new byte[8];
        (__sourceSpill1349_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1349_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1349_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1349_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1349_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1349_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1349_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1349_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1349_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1349_34)).doFinal(((byte[])(__sourceSpill1349_33)));
        (__sourceSpill1349_30)[__sourceSpill1349_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = ",/=Ë\027t\022?¼H\\±"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1349_38 = local6_life21;
        int __sourceSpill1349_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1349_38)).substring(((int)(__sourceSpill1349_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1349_43 = local8_life19;
        int __sourceSpill1349_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1349_46 = new byte[8];
        (__sourceSpill1349_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1349_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1349_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1349_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1349_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1349_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1349_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1349_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1349_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1349_47)).doFinal(((byte[])(__sourceSpill1349_46)));
        (__sourceSpill1349_43)[__sourceSpill1349_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    l = ((long[])(local8_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[9]));
}

private static native <E extends Throwable> void __sourceConstructorInit_1ae3edbadf84870f_0(moom.jv a0) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jv.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8191_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31054;
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
            throw new RuntimeException("moom/jv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
net.minecraft.entity.Entity[] spill1225_0;
    long life8_3;
    moom.jD[] life11_7;
    int life12_10;
    int life13_12;
    net.minecraft.entity.Entity[] life10_13;
    moom.jD life14_20;
    lexical_join_27: {
    life8_3 = (moom.jv.k ^ 122282893959734L);
    spill1225_0 = moom.iQ.b();
    life11_7 = this.j;
    life12_10 = (life11_7).length;
    life13_12 = 0;
    life10_13 = spill1225_0;
    lexical_cycle_14: while (true) {
    if (!((life13_12 < life12_10))) {
        break lexical_join_27;
    }
    life14_20 = (life11_7)[life13_12];
    ((moom.jD)(life14_20)).h = ((float)(p2));
    life13_12 += 1;
    if (!((life10_13 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
net.minecraft.entity.Entity[] spill1226_0;
    long life8_3;
    moom.jD[] life11_19;
    int life12_23;
    net.minecraft.entity.Entity[] life10_24;
    int life13_26;
    moom.jD life14_33;
    lexical_join_40: {
    life8_3 = (moom.jv.k ^ 18341028277790L);
    ((moom.jv)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    ((moom.jD)(this.i)).a(((float)(p6)));
    life11_19 = this.j;
    spill1226_0 = moom.iQ.b();
    life12_23 = (life11_19).length;
    life10_24 = spill1226_0;
    life13_26 = 0;
    lexical_cycle_27: while (true) {
    if (!((life13_26 < life12_23))) {
        break lexical_join_40;
    }
    life14_33 = (life11_19)[life13_26];
    ((moom.jD)(life14_33)).a(((float)(p6)));
    life13_26 += 1;
    if (!((life10_24 == null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ae3edbadf84870f_invokedynamic475_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8191_0() throws E;
}
