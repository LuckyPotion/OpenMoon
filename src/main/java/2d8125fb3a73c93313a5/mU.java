package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mU extends com.moon.mT {

private final com.moon.mX[] g;

private final com.moon.setting.BezierSetting h;

private com.moon.mX i;

private static java.lang.String[] j;

private static final long k;

private static final long[] l;

private static final java.lang.Integer[] m;

private static final java.util.Map n;

public mU(com.moon.setting.BezierSetting p0) {
super();
    this.g = new com.moon.mX[4];
    this.h = p0;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-5042187834077091987L)), ((long)(-901124893283858180L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(268870256273254L)))));
    java.lang.Object __sourceSpill376_6 = null;
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (com.moon.mU.k ^ 52046224731196L);
    com.moon.mU.b(((java.lang.String[])(__sourceSpill376_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill376_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill376_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill376_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill376_16 = new byte[8];
    (__sourceSpill376_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill376_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation376_18 = __sourceSpill376_16;
    ((javax.crypto.Cipher)(__sourceSpill376_13)).init(((int)(__sourceSpill376_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill376_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation376_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[4];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "N:ñ¤\nz¹ËPÎ,6#Ü"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill376_27 = local6_life23;
        int __sourceSpill376_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill376_27)).substring(((int)(__sourceSpill376_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill376_32 = local8_life21;
        int __sourceSpill376_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill376_35 = new byte[8];
        (__sourceSpill376_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill376_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill376_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill376_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill376_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill376_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill376_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill376_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill376_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill376_36)).doFinal(((byte[])(__sourceSpill376_35)));
        (__sourceSpill376_32)[__sourceSpill376_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "õÀ¹;F¥\026ö¼³®\0339àn"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill376_40 = local6_life23;
        int __sourceSpill376_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill376_40)).substring(((int)(__sourceSpill376_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill376_45 = local8_life21;
        int __sourceSpill376_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill376_48 = new byte[8];
        (__sourceSpill376_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill376_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill376_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill376_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill376_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill376_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill376_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill376_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill376_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill376_49)).doFinal(((byte[])(__sourceSpill376_48)));
        (__sourceSpill376_45)[__sourceSpill376_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    l = ((long[])(local8_life21));
    m = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public void b(int p0, int p1, int p2) {
this.i = ((com.moon.mX)(null));
    super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public static void b(java.lang.String[] p0) {
com.moon.mU.j = ((java.lang.String[])(p0));
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2246_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/mU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.lang.String[] a__ArrayString() {
return com.moon.mU.j;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.mU.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11426;
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
            throw new RuntimeException("com/moon/mU", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


public void a(int p0, int p1) {
com.moon.mX lexicalValue203_370_0;
    com.moon.mX lexicalValue203_377_0;
    com.moon.mX lexicalValue203_378_0;
    float lexicalValue203_378_1;
    java.lang.String[] spill203_0;
    int spill203_1;
    com.moon.mX spill203_2;
    long life3_3;
    com.moon.hW life6_14;
    float life7_34;
    float life8_39;
    float life9_44;
    float life10_51;
    float life11_58;
    java.lang.String[] life5_59;
    float life12_63;
    com.moon.hW life13_186;
    com.moon.iv life14_190;
    float life15_194;
    float life16_198;
    int life17_200;
    float[] life18_215;
    float life19_223;
    float life20_231;
    com.moon.hW life17_285;
    com.moon.iv life18_289;
    com.moon.mX[] life19_292;
    int life20_295;
    int life21_297;
    com.moon.mX life22_304;
    float life19_350;
    float life20_360;
    lexical_join_383: {
    lexical_join_378: {
    lexical_join_377: {
    lexical_join_370: {
    lexical_join_368: {
    lexical_join_333: {
    lexical_join_322: {
    lexical_join_276: {
    lexical_join_253: {
    life3_3 = (com.moon.mU.k ^ 2535945218359L);
    ((com.moon.mU)(this)).d = ((float)(0x1.2cp7f));
    ((com.moon.mU)(this)).c = ((float)(0x1.2cp7f));
    life6_14 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    spill203_0 = com.moon.mU.a__ArrayString();
    ((com.moon.hW)(life6_14)).a(((com.moon.iX)(com.moon.i3.a(((float)(((com.moon.mU)(this)).a)), ((float)(((com.moon.mU)(this)).b)), ((float)(((com.moon.mU)(this)).c)), ((float)(((com.moon.mU)(this)).d)), ((float)(0x1.8p2f)), ((int)(((com.v)(((com.moon.mU)(this)).e)).g()))))));
    ((com.moon.hW)(life6_14)).b();
    life7_34 = 0x1.0p3f;
    life8_39 = (((com.moon.mU)(this)).a + life7_34);
    life9_44 = (((com.moon.mU)(this)).b + life7_34);
    life10_51 = (((com.moon.mU)(this)).c - (life7_34 * 0x1.0p1f));
    life11_58 = (((com.moon.mU)(this)).d - (life7_34 * 0x1.0p1f));
    life5_59 = spill203_0;
    life12_63 = (life9_44 + life11_58);
    ((com.moon.mX)((this.g)[0])).a(((float)(life8_39)));
    ((com.moon.mX)((this.g)[0])).b(((float)((life12_63 - (((com.moon.setting.BezierSetting)(this.h)).getStartValue() * life11_58)))));
    ((com.moon.mX)((this.g)[1])).a(((float)((life8_39 + (((((com.moon.setting.BezierSetting)(this.h)).getControlPoints())[0])[0] * life10_51)))));
    ((com.moon.mX)((this.g)[1])).b(((float)((life12_63 - (((((com.moon.setting.BezierSetting)(this.h)).getControlPoints())[0])[1] * life11_58)))));
    ((com.moon.mX)((this.g)[2])).a(((float)((life8_39 + (((((com.moon.setting.BezierSetting)(this.h)).getControlPoints())[1])[0] * life10_51)))));
    ((com.moon.mX)((this.g)[2])).b(((float)((life12_63 - (((((com.moon.setting.BezierSetting)(this.h)).getControlPoints())[1])[1] * life11_58)))));
    ((com.moon.mX)((this.g)[3])).a(((float)((life8_39 + life10_51))));
    ((com.moon.mX)((this.g)[3])).b(((float)((life12_63 - (((com.moon.setting.BezierSetting)(this.h)).getEndValue() * life11_58)))));
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic203_49(3205, (1177826733021882191L ^ life3_3)))));
    life13_186 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.RECTANGLE))))).a(((int)(3))))).a();
    life14_190 = ((com.moon.hY)(((com.moon.hW)(life13_186)).a__hY())).a__iv();
    life15_194 = ((com.moon.hY)(((com.moon.hW)(life13_186)).a__hY())).a();
    life16_198 = ((com.moon.hY)(((com.moon.hW)(life13_186)).a__hY())).b();
    life17_200 = 0;
    lexical_cycle_201: while (true) {
    if (!((life17_200 < __sourceIntrinsic_fd0ba049c90e_invokedynamic203_62(23610, (7977220941780891635L ^ life3_3))))) {
        break lexical_join_253;
    }
    life18_215 = ((com.moon.setting.BezierSetting)(this.h)).evaluate(((float)((((float) life17_200) / 0x1.9p6f))));
    life19_223 = (life8_39 + ((life18_215)[0] * life10_51));
    life20_231 = (life12_63 - ((life18_215)[1] * life11_58));
    ((com.moon.iv)(((com.moon.iv)(life14_190)).a(((float)((life19_223 / life15_194))), ((float)((life20_231 / life16_198)))))).a(((int)(((com.v)(((com.moon.mU)(this)).e)).h())));
    life17_200 += 1;
    if (!((life5_59 == null))) {
        break lexical_join_276;
    }
    if (!((life5_59 != null))) { continue lexical_cycle_201; }
    break lexical_cycle_201;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    ((com.moon.hY)(((com.moon.hW)(life13_186)).a__hY())).b(((int)((((com.moon.hY)(((com.moon.hW)(life13_186)).a__hY())).b__Int() + __sourceIntrinsic_fd0ba049c90e_invokedynamic203_73(19693, (5905308473081898790L ^ life3_3))))));
    spill203_1 = 8942;
    ((com.moon.hW)(life13_186)).b();
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic203_76(spill203_1, (3833638362399787302L ^ life3_3)))));
    org.lwjgl.opengl.GL11.glPointSize(((float)(0x1.4p3f)));
    }
    life17_285 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.RECTANGLE))))).a(((int)(0))))).a();
    life18_289 = ((com.moon.hY)(((com.moon.hW)(life17_285)).a__hY())).a__iv();
    life19_292 = this.g;
    life20_295 = (life19_292).length;
    life21_297 = 0;
    lexical_cycle_295: while (true) {
    if (!((life21_297 < life20_295))) {
        break lexical_join_322;
    }
    life22_304 = (life19_292)[life21_297];
    ((com.moon.iv)(((com.moon.iv)(life18_289)).a(((float)((((com.moon.mX)(life22_304)).a() / life15_194))), ((float)((((com.moon.mX)(life22_304)).b() / life16_198)))))).a(((int)(((com.v)(((com.moon.mU)(this)).e)).a())));
    life21_297 += 1;
    if (!((life5_59 == null))) {
        break lexical_join_333;
    }
    if (!((life5_59 != null))) { continue lexical_cycle_295; }
    break lexical_cycle_295;
    }
    }
    ((com.moon.hY)(((com.moon.hW)(life17_285)).a__hY())).b(((int)((((com.moon.hY)(((com.moon.hW)(life17_285)).a__hY())).b__Int() + 4))));
    ((com.moon.hW)(life17_285)).b();
    }
    if (!((this.i != null))) {
        break lexical_join_383;
    }
    life19_350 = (0x1.0p0f - ((((float) p1) - life9_44) / life11_58));
    life20_360 = moom.Dr.a(((float)(((((float) p0) - life8_39) / life10_51))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    spill203_2 = this.i;
    if (!((life5_59 == null))) {
        lexicalValue203_370_0 = spill203_2;
        break lexical_join_370;
    }
    life21_297 = ((((com.moon.mX)(spill203_2)).a__Boolean()) ? 1 : 0);
    if (!((life21_297 != 0))) {
        break lexical_join_368;
    }
    ((com.moon.mX)(this.i)).a(((float)(life20_360)));
    }
    lexicalValue203_370_0 = this.i;
    }
    if (!((life21_297 == 0))) {
        lexicalValue203_377_0 = lexicalValue203_370_0;
        break lexical_join_377;
    }
    lexicalValue203_378_0 = lexicalValue203_370_0;
    lexicalValue203_378_1 = moom.Dr.a(((float)(life19_350)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    break lexical_join_378;
    }
    lexicalValue203_378_0 = lexicalValue203_377_0;
    lexicalValue203_378_1 = life19_350;
    }
    ((com.moon.mX)(lexicalValue203_378_0)).b(((float)(lexicalValue203_378_1)));
    ((com.moon.mX)(this.i)).a__Void();
    }
    return;
}


public void a__Void() {
long local1 = (com.moon.mU.k ^ 63632150281823L);
    (this.g)[0] = new com.moon.mX(__sourceIntrinsic_b82a5b29b709_invokedynamic1900_2(this), false);
    java.lang.String[] spill1900_0 = com.moon.mU.a__ArrayString();
    (this.g)[1] = new com.moon.mX(__sourceIntrinsic_b82a5b29b709_invokedynamic1900_5(this), true);
    java.lang.String[] local3 = spill1900_0;
    (this.g)[2] = new com.moon.mX(__sourceIntrinsic_b82a5b29b709_invokedynamic1900_7(this), true);
    (this.g)[3] = new com.moon.mX(__sourceIntrinsic_b82a5b29b709_invokedynamic1900_9(this), false);
    super.a__Void();
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.mU.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public void a(int p0, int p1, int p2) {
long life4_3;
    java.lang.String[] life6_5;
    com.moon.mX life7_24;
    forward_join_34: {
    forward_join_29: {
    life4_3 = (com.moon.mU.k ^ 49542099896708L);
    life6_5 = com.moon.mU.a__ArrayString();
    if (!((life6_5 == null))) { break forward_join_34; }
    if (!((p2 == 0))) { break forward_join_29; }
    life7_24 = ((com.moon.mX)(((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(java.util.Arrays.stream(((java.lang.Object[])(this.g))))).filter(((java.util.function.Predicate)(__sourceIntrinsic_e4d4f5a69301_invokedynamic970_4(p0, p1)))))).findFirst())).orElse(((java.lang.Object)(null)))));
    if (!((life6_5 == null))) { break forward_join_34; }
    if (!((life7_24 != null))) { break forward_join_29; }
    this.i = ((com.moon.mX)(life7_24));
    }
    super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    }
    return;
}


private static boolean lambda$mouseClicked$4(int p0, int p1, com.moon.mX p2) {
return (__sourceIntrinsic_booleanComparison((((com.moon.mX)(p2)).a(((int)(p0)), ((int)(p1))))) != 0);
}


private void lambda$init$1(com.moon.n4 p0) {
((com.moon.setting.BezierSetting)(this.h)).setControlPoints(((float[][])(new float[][] {new float[] {((com.moon.n4)(p0)).a__Float(), ((com.moon.n4)(p0)).b__Float()}, (((com.moon.setting.BezierSetting)(this.h)).getControlPoints())[1]})));
    return;
}


private void lambda$init$3(com.moon.n4 p0) {
((com.moon.setting.BezierSetting)(this.h)).setEndValue(((float)(((com.moon.n4)(p0)).b__Float())));
    return;
}


private void lambda$init$2(com.moon.n4 p0) {
((com.moon.setting.BezierSetting)(this.h)).setControlPoints(((float[][])(new float[][] {(((com.moon.setting.BezierSetting)(this.h)).getControlPoints())[0], new float[] {((com.moon.n4)(p0)).a__Float(), ((com.moon.n4)(p0)).b__Float()}})));
    return;
}


private void lambda$init$0(com.moon.n4 p0) {
((com.moon.setting.BezierSetting)(this.h)).setStartValue(((float)(((com.moon.n4)(p0)).b__Float())));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic203_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic203_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic203_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic203_76(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_e4d4f5a69301_invokedynamic970_4(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2246_0() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_b82a5b29b709_invokedynamic1900_2(com.moon.mU a0) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_b82a5b29b709_invokedynamic1900_5(com.moon.mU a0) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_b82a5b29b709_invokedynamic1900_7(com.moon.mU a0) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_b82a5b29b709_invokedynamic1900_9(com.moon.mU a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
