package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class DK {

private static final java.util.regex.Pattern a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public DK() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(863853725108957540L)), ((long)(3987914317008463200L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(254407429317103L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.DK.b ^ 21445506330416L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill689_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill689_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill689_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill689_14 = new byte[8];
    (__sourceSpill689_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill689_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation689_16 = __sourceSpill689_14;
    ((javax.crypto.Cipher)(__sourceSpill689_11)).init(((int)(__sourceSpill689_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill689_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation689_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¦\t¡0,\030Ü^;Ö\034\022òÁ\r\b"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill689_25 = local6_life21;
        int __sourceSpill689_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill689_25)).substring(((int)(__sourceSpill689_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill689_30 = local8_life19;
        int __sourceSpill689_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill689_33 = new byte[8];
        (__sourceSpill689_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill689_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill689_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill689_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill689_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill689_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill689_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill689_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill689_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill689_34)).doFinal(((byte[])(__sourceSpill689_33)));
        (__sourceSpill689_30)[__sourceSpill689_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\036ã·è)\f²÷gÑM ãØ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill689_38 = local6_life21;
        int __sourceSpill689_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill689_38)).substring(((int)(__sourceSpill689_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill689_43 = local8_life19;
        int __sourceSpill689_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill689_46 = new byte[8];
        (__sourceSpill689_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill689_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill689_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill689_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill689_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill689_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill689_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill689_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill689_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill689_47)).doFinal(((byte[])(__sourceSpill689_46)));
        (__sourceSpill689_43)[__sourceSpill689_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[4]));
    a = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("(?i)\\u00A7[0-9A-FK-OR]")))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 32258;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/DK", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.DK.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4173_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/DK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.lang.String a(int p0) {
int forwardValue1692_45_0;
    int forwardValue1692_45_1;
    java.lang.String forwardValue1692_46_0;
    boolean spill1692_0;
    int spill1692_1;
    int spill1692_2;
    long life1_3;
    int life4_12;
    int life3_13;
    int life5_21;
    int life4_29;
    forward_join_46: {
    forward_join_45: {
    forward_join_43: {
    life1_3 = (moom.DK.b ^ 58419607494201L);
    spill1692_0 = moom.DS.b__Boolean();
    life4_12 = (p0 / __sourceIntrinsic_008018dcd7e9_invokedynamic1692_2(23125, (4843896137984412803L ^ life1_3)));
    life3_13 = ((spill1692_0) ? 1 : 0);
    life5_21 = (life4_12 / __sourceIntrinsic_008018dcd7e9_invokedynamic1692_4(32224, (2551692974408969015L ^ life1_3)));
    life4_29 = (life4_12 % __sourceIntrinsic_008018dcd7e9_invokedynamic1692_5(19658, (8554129119148677663L ^ life1_3)));
    spill1692_1 = life4_29;
    spill1692_2 = __sourceIntrinsic_008018dcd7e9_invokedynamic1692_6(20341, (4827366769485912481L ^ life1_3));
    if (!((life3_13 == 0))) {
        forwardValue1692_45_0 = spill1692_1;
        forwardValue1692_45_1 = spill1692_2;
        break forward_join_45;
    }
    if (!((spill1692_1 < spill1692_2))) {
        break forward_join_43;
    }
    forwardValue1692_46_0 = __sourceIntrinsic_008018dcd7e9_invokedynamic1692_7(life5_21, life4_29);
    break forward_join_46;
    }
    forwardValue1692_45_0 = life5_21;
    forwardValue1692_45_1 = life4_29;
    }
    forwardValue1692_46_0 = __sourceIntrinsic_008018dcd7e9_invokedynamic1692_8(forwardValue1692_45_0, forwardValue1692_45_1);
    }
    return forwardValue1692_46_0;
}


public static boolean a__Boolean(java.lang.String p0) {
return (__sourceIntrinsic_booleanComparison((org.apache.commons.lang3.StringUtils.isEmpty(((java.lang.CharSequence)(p0))))) != 0);
}


public static java.lang.String a(java.lang.String p0) {
return ((java.util.regex.Matcher)(((java.util.regex.Pattern)(moom.DK.a)).matcher(((java.lang.CharSequence)(p0))))).replaceAll(((java.lang.String)("")));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4173_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_008018dcd7e9_invokedynamic1692_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_008018dcd7e9_invokedynamic1692_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_008018dcd7e9_invokedynamic1692_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_008018dcd7e9_invokedynamic1692_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_008018dcd7e9_invokedynamic1692_7(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_008018dcd7e9_invokedynamic1692_8(int a0, int a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
