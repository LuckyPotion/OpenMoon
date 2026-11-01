package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class js extends moom.iQ {

public moom.jD i;

public moom.jD j;

public moom.jD k;

public moom.jD l;

private static long m;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

public js(int p0) { super(); }


private static void __sourceConstructorBody_6177013d4c12b30b(moom.js receiver, int p0) throws Throwable {

forward_join_142: {

    forward_join_132: {

    long local2_life2 = (moom.js.m ^ 97129683399834L);

    net.minecraft.entity.Entity[] __sourceSpill685_4 = moom.iQ.b();

    moom.js.__sourceConstructorInit_6177013d4c12b30b_0(((moom.js)(receiver)));

    ((moom.js)(receiver)).i = ((moom.jD)(new moom.jD(((moom.iQ) receiver), 0, p0)));

    net.minecraft.entity.Entity[] local4_life7 = __sourceSpill685_4;

    ((moom.jD)(((moom.js)(receiver)).i)).a(((float)(-1065353216)), ((float)(1098907648)), ((float)(-1065353216)), ((int)(__sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_13(16498, (7437889793010244178L ^ local2_life2)))), ((int)(__sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_15(11675, (6117337670723270589L ^ local2_life2)))), ((int)(__sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_17(11675, (6117337670723270589L ^ local2_life2)))));

    if (!((local4_life7 != null))) { break forward_join_132; }

    if (!((p0 > 0))) { break forward_join_142; }

    ((moom.js)(receiver)).i = ((moom.jD)(new moom.jD(((moom.iQ) receiver), 0, p0)));

    ((moom.jD)(((moom.js)(receiver)).i)).a(((float)(-1069547520)), ((float)(1099431936)), ((float)(-1069547520)), ((int)(__sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_25(18516, (4200672124925481589L ^ local2_life2)))), ((int)(__sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_27(13388, (1678993639360851563L ^ local2_life2)))), ((int)(__sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_29(13388, (1678993639360851563L ^ local2_life2)))));

    ((moom.js)(receiver)).j = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_32(16576, (6854664626053716707L ^ local2_life2)), 0)));

    ((moom.jD)(((moom.js)(receiver)).j)).a(((float)(-1068498944)), ((float)(1099956224)), ((float)(-1067450368)), ((int)(2)), ((int)(2)), ((int)(2)));

    ((moom.js)(receiver)).k = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_40(6006, (4163144936464010580L ^ local2_life2)), 4)));

    ((moom.jD)(((moom.js)(receiver)).k)).a(((float)(1067450368)), ((float)(1099956224)), ((float)(-1067450368)), ((int)(2)), ((int)(2)), ((int)(2)));

    ((moom.js)(receiver)).l = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_48(6006, (4163144936464010580L ^ local2_life2)), __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_50(11675, (6117337670723270589L ^ local2_life2)))));

    }

    ((moom.jD)(((moom.js)(receiver)).l)).a(((float)(0x0.0p0f)), ((float)(1101529088)), ((float)(-1067450368)), ((int)(1)), ((int)(1)), ((int)(1)));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6177013d4c12b30b_0(moom.js a0) throws E;

static {
m = ((long)(((moom._a)(moom._c.a(((long)(-2603900557485512586L)), ((long)(-2473197525327962704L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(149042908842190L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.js.m ^ 127656223115761L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1346_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1346_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1346_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1346_14 = new byte[8];
    (__sourceSpill1346_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1346_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1346_16 = __sourceSpill1346_14;
    ((javax.crypto.Cipher)(__sourceSpill1346_11)).init(((int)(__sourceSpill1346_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1346_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1346_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "dÒß.ÑØ\177\"!\027\036\004\fêl§üj%ÝHk\033:dnN0"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1346_25 = local6_life21;
        int __sourceSpill1346_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1346_25)).substring(((int)(__sourceSpill1346_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1346_30 = local8_life19;
        int __sourceSpill1346_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1346_33 = new byte[8];
        (__sourceSpill1346_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1346_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1346_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1346_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1346_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1346_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1346_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1346_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1346_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1346_34)).doFinal(((byte[])(__sourceSpill1346_33)));
        (__sourceSpill1346_30)[__sourceSpill1346_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Íç~ÃËlF¯¡ÄÎ8^®}"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1346_38 = local6_life21;
        int __sourceSpill1346_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1346_38)).substring(((int)(__sourceSpill1346_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1346_43 = local8_life19;
        int __sourceSpill1346_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1346_46 = new byte[8];
        (__sourceSpill1346_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1346_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1346_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1346_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1346_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1346_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1346_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1346_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1346_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1346_47)).doFinal(((byte[])(__sourceSpill1346_46)));
        (__sourceSpill1346_43)[__sourceSpill1346_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    n = ((long[])(local8_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.js.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7017;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/js", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8187_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/js"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
moom.jD forwardValue3700_34_0;
    net.minecraft.entity.Entity[] spill3700_0;
    moom.jD spill3700_1;
    long life8_3;
    net.minecraft.entity.Entity[] life10_18;
    forward_join_36: {
    forward_join_34: {
    life8_3 = (moom.js.m ^ 116780800150634L);
    spill3700_0 = moom.iQ.b();
    ((moom.js)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    ((moom.jD)(this.i)).a(((float)(p6)));
    life10_18 = spill3700_0;
    spill3700_1 = this.j;
    if (!((life10_18 != null))) {
        forwardValue3700_34_0 = spill3700_1;
        break forward_join_34;
    }
    if (!((spill3700_1 != null))) {
        break forward_join_36;
    }
    ((moom.jD)(this.j)).a(((float)(p6)));
    ((moom.jD)(this.k)).a(((float)(p6)));
    forwardValue3700_34_0 = this.l;
    }
    ((moom.jD)(forwardValue3700_34_0)).a(((float)(p6)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6177013d4c12b30b_originalDynamicSite685_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8187_0() throws E;
}
