package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jq implements com.moon.ji {

private final java.util.Map<java.lang.String, java.lang.Float> a;

private final java.util.Map<java.lang.String, java.lang.Float> b;

private final com.moon.jz c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public jq(com.moon.jz p0) {
super();
    this.a = new java.util.concurrent.ConcurrentHashMap();
    this.b = new java.util.concurrent.ConcurrentHashMap();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(9213299811065869129L)), ((long)(2444354763281106753L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(35739615635235L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.jq.d ^ 44539787939832L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill326_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill326_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill326_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill326_14 = new byte[8];
    (__sourceSpill326_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill326_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation326_16 = __sourceSpill326_14;
    ((javax.crypto.Cipher)(__sourceSpill326_11)).init(((int)(__sourceSpill326_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill326_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation326_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "XÀ°?jE[0ÒGÜ?!ºÑhJRöÖ.\035\037p0ùb\037Äð\026Òwóêm] ÷ßê¤"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill326_25 = local6_life21;
        int __sourceSpill326_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill326_25)).substring(((int)(__sourceSpill326_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill326_30 = local8_life19;
        int __sourceSpill326_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill326_33 = new byte[8];
        (__sourceSpill326_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill326_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill326_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill326_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill326_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill326_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill326_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill326_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill326_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill326_34)).doFinal(((byte[])(__sourceSpill326_33)));
        (__sourceSpill326_30)[__sourceSpill326_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¼7q­úþ¢Ú+HXý"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill326_38 = local6_life21;
        int __sourceSpill326_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill326_38)).substring(((int)(__sourceSpill326_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill326_43 = local8_life19;
        int __sourceSpill326_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill326_46 = new byte[8];
        (__sourceSpill326_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill326_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill326_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill326_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill326_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill326_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill326_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill326_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill326_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill326_47)).doFinal(((byte[])(__sourceSpill326_46)));
        (__sourceSpill326_43)[__sourceSpill326_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


public java.util.Map<java.lang.String, java.lang.Float> b() {
return this.b;
}


public float b(java.lang.String p0) {
((java.util.Map)(this.b)).computeIfAbsent(((java.lang.Object)(p0)), ((java.util.function.Function)(__sourceIntrinsic_4b576e529508_originalDynamicSite453_1(this, p0))));
    return (((java.lang.Float)(((java.lang.Float)(((java.util.Map)(this.b)).get(((java.lang.Object)(p0))))))).floatValue() + ((com.moon.jx)(((com.moon.ju)(((com.moon.jy)(((com.moon.jz)(this.c)).a())).a())).a__jx())).e());
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1984_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.jq.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2755;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/jq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


public float a(java.lang.String p0) {
((java.util.Map)(this.a)).computeIfAbsent(((java.lang.Object)(p0)), ((java.util.function.Function)(__sourceIntrinsic_26cdbb4b15ac_originalDynamicSite454_1(this, p0))));
    return ((java.lang.Float)(((java.lang.Float)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0))))))).floatValue();
}


public java.util.Map<java.lang.String, java.lang.Float> a__Map() {
return this.a;
}


public com.moon.jz a__jz() {
return this.c;
}


public float a() {
return ((com.moon.jx)(((com.moon.ju)(((com.moon.jy)(((com.moon.jz)(this.c)).a())).a())).a__jx())).c();
}


private java.lang.Float lambda$computeRelativeWidth$0(java.lang.String p0, java.lang.String p1) {
int lexicalValue128_24_0;
    int lexicalValue128_26_0;
    int lexicalValue128_55_0;
    int lexicalValue128_55_1;
    int lexicalValue128_66_0;
    int lexicalValue128_66_1;
    int lexicalValue128_74_0;
    int lexicalValue128_74_1;
    float lexicalValue128_98_0;
    boolean spill128_0;
    int spill128_1;
    int spill128_2;
    int spill128_3;
    long life3_3;
    char[] life6_7;
    int life5_8;
    float life7_10;
    int life8_12;
    int life9_14;
    int life10_29;
    int life11_33;
    com.moon.jr life12_120;
    float life13_142;
    lexical_join_111: {
    life3_3 = (com.moon.jq.d ^ 78832986463444L);
    spill128_0 = com.moon.jn.c__Boolean();
    life6_7 = ((java.lang.String)(p0)).toCharArray();
    life5_8 = ((spill128_0) ? 1 : 0);
    life7_10 = 0x0.0p0f;
    life8_12 = 0;
    life9_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_109: {
    lexical_join_108: {
    lexical_join_98: {
    lexical_join_97: {
    lexical_join_89: {
    lexical_join_80: {
    lexical_join_77: {
    lexical_join_74: {
    lexical_join_66: {
    lexical_join_60: {
    lexical_join_55: {
    lexical_join_26: {
    lexical_join_25: {
    lexical_join_24: {
    if (!((life9_14 < (life6_7).length))) {
        break lexical_join_111;
    }
    spill128_1 = life8_12;
    if (!((life5_8 != 0))) {
        lexicalValue128_24_0 = spill128_1;
        break lexical_join_24;
    }
    if (!((spill128_1 != 0))) {
        break lexical_join_25;
    }
    lexicalValue128_24_0 = 1;
    }
    lexicalValue128_26_0 = lexicalValue128_24_0;
    break lexical_join_26;
    }
    lexicalValue128_26_0 = 0;
    }
    life10_29 = lexicalValue128_26_0;
    life11_33 = ((int)((life6_7)[life9_14]));
    if (!((life5_8 != 0))) {
        break lexical_join_109;
    }
    if (!((life11_33 != __sourceIntrinsic_aebc6f562325_invokedynamic128_5(24980, (4622221500217894700L ^ life3_3))))) {
        break lexical_join_108;
    }
    spill128_2 = life11_33;
    spill128_3 = __sourceIntrinsic_aebc6f562325_invokedynamic128_6(14249, (9208344780872970519L ^ life3_3));
    if (!((life5_8 != 0))) {
        lexicalValue128_55_0 = spill128_2;
        lexicalValue128_55_1 = spill128_3;
        break lexical_join_55;
    }
    if (!((spill128_2 != spill128_3))) {
        break lexical_join_108;
    }
    lexicalValue128_55_0 = life11_33;
    lexicalValue128_55_1 = __sourceIntrinsic_aebc6f562325_invokedynamic128_7(14147, (7185686002262340092L ^ life3_3));
    }
    if (!((life5_8 != 0))) {
        lexicalValue128_66_0 = lexicalValue128_55_0;
        lexicalValue128_66_1 = lexicalValue128_55_1;
        break lexical_join_66;
    }
    if (!((lexicalValue128_55_0 == lexicalValue128_55_1))) {
        break lexical_join_60;
    }
    if (!((life5_8 == 0))) {
        break lexical_join_108;
    }
    }
    lexicalValue128_66_0 = life11_33;
    lexicalValue128_66_1 = __sourceIntrinsic_aebc6f562325_invokedynamic128_8(28064, (2890831406982179609L ^ life3_3));
    }
    if (!((life5_8 != 0))) {
        lexicalValue128_74_0 = lexicalValue128_66_0;
        lexicalValue128_74_1 = lexicalValue128_66_1;
        break lexical_join_74;
    }
    if (!((lexicalValue128_66_0 == lexicalValue128_66_1))) {
        break lexical_join_80;
    }
    lexicalValue128_74_0 = life9_14;
    lexicalValue128_74_1 = ((life6_7).length - 2);
    }
    if (!((lexicalValue128_74_0 >= lexicalValue128_74_1))) {
        break lexical_join_77;
    }
    if (!((life5_8 == 0))) {
        break lexical_join_111;
    }
    }
    life9_14 += 1;
    if (!((life5_8 == 0))) {
        break lexical_join_108;
    }
    }
    life12_120 = ((com.moon.jz)(this.c)).a(((char)(life11_33)));
    if (!((life12_120 == null))) {
        break lexical_join_89;
    }
    if (!((life5_8 == 0))) {
        break lexical_join_108;
    }
    }
    if (!((life10_29 != 0))) {
        break lexical_join_97;
    }
    lexicalValue128_98_0 = ((com.moon.jz)(this.c)).a(((char)(life8_12)), ((char)(life11_33)));
    break lexical_join_98;
    }
    lexicalValue128_98_0 = 0x0.0p0f;
    }
    life13_142 = lexicalValue128_98_0;
    life7_10 = (life7_10 + (((com.moon.jr)(life12_120)).g() + life13_142));
    life8_12 = life11_33;
    }
    life9_14 += 1;
    }
    if (!((life5_8 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return java.lang.Float.valueOf(((float)(life7_10)));
}


private java.lang.Float lambda$computeRelativeHeight$1(java.lang.String p0, java.lang.String p1) {
int lexicalValue127_45_0;
    int lexicalValue127_45_1;
    int lexicalValue127_56_0;
    int lexicalValue127_56_1;
    int lexicalValue127_64_0;
    int lexicalValue127_64_1;
    com.moon.jr lexicalValue127_82_0;
    float lexicalValue127_90_0;
    boolean spill127_0;
    int spill127_1;
    int spill127_2;
    com.moon.jr spill127_3;
    float spill127_4;
    long life3_3;
    char[] life6_6;
    float life7_9;
    int life8_11;
    int life5_12;
    int life9_20;
    com.moon.jr life10_107;
    lexical_join_94: {
    life3_3 = (com.moon.jq.d ^ 83159077367785L);
    life6_6 = ((java.lang.String)(p0)).toCharArray();
    spill127_0 = com.moon.jn.c__Boolean();
    life7_9 = 0x0.0p0f;
    life8_11 = 0;
    life5_12 = ((spill127_0) ? 1 : 0);
    lexical_cycle_13: while (true) {
    lexical_join_92: {
    lexical_join_91: {
    lexical_join_90: {
    lexical_join_82: {
    lexical_join_81: {
    lexical_join_70: {
    lexical_join_67: {
    lexical_join_64: {
    lexical_join_56: {
    lexical_join_50: {
    lexical_join_45: {
    if (!((life8_11 < (life6_6).length))) {
        break lexical_join_94;
    }
    life9_20 = ((int)((life6_6)[life8_11]));
    if (!((life5_12 != 0))) {
        break lexical_join_92;
    }
    if (!((life9_20 != __sourceIntrinsic_849bb518464f_invokedynamic127_5(30226, (6749816404336313235L ^ life3_3))))) {
        break lexical_join_91;
    }
    spill127_1 = life9_20;
    spill127_2 = __sourceIntrinsic_849bb518464f_invokedynamic127_6(25374, (4668884627207427737L ^ life3_3));
    if (!((life5_12 != 0))) {
        lexicalValue127_45_0 = spill127_1;
        lexicalValue127_45_1 = spill127_2;
        break lexical_join_45;
    }
    if (!((spill127_1 != spill127_2))) {
        break lexical_join_91;
    }
    lexicalValue127_45_0 = life9_20;
    lexicalValue127_45_1 = __sourceIntrinsic_849bb518464f_invokedynamic127_7(477, (4632698833586811997L ^ life3_3));
    }
    if (!((life5_12 != 0))) {
        lexicalValue127_56_0 = lexicalValue127_45_0;
        lexicalValue127_56_1 = lexicalValue127_45_1;
        break lexical_join_56;
    }
    if (!((lexicalValue127_45_0 == lexicalValue127_45_1))) {
        break lexical_join_50;
    }
    if (!((life5_12 == 0))) {
        break lexical_join_91;
    }
    }
    lexicalValue127_56_0 = life9_20;
    lexicalValue127_56_1 = __sourceIntrinsic_849bb518464f_invokedynamic127_8(4536, (4428222051103401022L ^ life3_3));
    }
    if (!((life5_12 != 0))) {
        lexicalValue127_64_0 = lexicalValue127_56_0;
        lexicalValue127_64_1 = lexicalValue127_56_1;
        break lexical_join_64;
    }
    if (!((lexicalValue127_56_0 == lexicalValue127_56_1))) {
        break lexical_join_70;
    }
    lexicalValue127_64_0 = life8_11;
    lexicalValue127_64_1 = ((life6_6).length - 2);
    }
    if (!((lexicalValue127_64_0 >= lexicalValue127_64_1))) {
        break lexical_join_67;
    }
    if (!((life5_12 == 0))) {
        break lexical_join_94;
    }
    }
    life8_11 += 1;
    if (!((life5_12 == 0))) {
        break lexical_join_91;
    }
    }
    life10_107 = ((com.moon.jz)(this.c)).a(((char)(life9_20)));
    spill127_3 = life10_107;
    if (!((life5_12 != 0))) {
        lexicalValue127_82_0 = spill127_3;
        break lexical_join_82;
    }
    if (!((spill127_3 == null))) {
        break lexical_join_81;
    }
    if (!((life5_12 == 0))) {
        break lexical_join_91;
    }
    }
    lexicalValue127_82_0 = life10_107;
    }
    spill127_4 = ((com.moon.jr)(lexicalValue127_82_0)).f();
    if (!((life5_12 != 0))) {
        lexicalValue127_90_0 = spill127_4;
        break lexical_join_90;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill127_4)), ((float)(life7_9))) > 0))) {
        break lexical_join_91;
    }
    lexicalValue127_90_0 = ((com.moon.jr)(life10_107)).f();
    }
    life7_9 = lexicalValue127_90_0;
    }
    life8_11 += 1;
    }
    if (!((life5_12 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return java.lang.Float.valueOf(((float)(life7_9)));
}


private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_4b576e529508_originalDynamicSite453_1(com.moon.jq a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1984_0() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_26cdbb4b15ac_originalDynamicSite454_1(com.moon.jq a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aebc6f562325_invokedynamic128_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aebc6f562325_invokedynamic128_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aebc6f562325_invokedynamic128_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aebc6f562325_invokedynamic128_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_849bb518464f_invokedynamic127_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_849bb518464f_invokedynamic127_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_849bb518464f_invokedynamic127_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_849bb518464f_invokedynamic127_8(int a0, long a1) throws E;
}
