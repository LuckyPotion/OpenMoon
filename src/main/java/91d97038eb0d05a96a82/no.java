package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class no extends com.moon.nn {

private final com.moon.mX[] g;

private final com.moon.setting.BezierSetting h;

private com.moon.mX i;

private static boolean j;

private static final long k;

private static final long[] l;

private static final java.lang.Integer[] m;

private static final java.util.Map n;

public no(com.moon.setting.BezierSetting p0) {
super();
    this.g = new com.moon.mX[4];
    this.h = p0;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-7171780541228333811L)), ((long)(410709711815978389L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(181428580165929L)))));
    int __sourceSpill472_6 = 0;
    n = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.no.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill472_6))));
    long local0_life9 = (com.moon.no.k ^ 117020029645359L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill472_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill472_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill472_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill472_16 = new byte[8];
    (__sourceSpill472_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill472_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation472_18 = __sourceSpill472_16;
    ((javax.crypto.Cipher)(__sourceSpill472_13)).init(((int)(__sourceSpill472_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill472_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation472_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[6];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "w;\033Å\027.\031ODU\000Íi¤Â}¬©ØuÁf]µ\032Dþ;ÊÌD"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill472_27 = local6_life23;
        int __sourceSpill472_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill472_27)).substring(((int)(__sourceSpill472_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill472_32 = local8_life21;
        int __sourceSpill472_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill472_35 = new byte[8];
        (__sourceSpill472_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill472_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill472_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill472_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill472_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill472_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill472_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill472_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill472_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill472_36)).doFinal(((byte[])(__sourceSpill472_35)));
        (__sourceSpill472_32)[__sourceSpill472_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "¨.w¢ÿà=¢X\0259®/"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill472_40 = local6_life23;
        int __sourceSpill472_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill472_40)).substring(((int)(__sourceSpill472_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill472_45 = local8_life21;
        int __sourceSpill472_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill472_48 = new byte[8];
        (__sourceSpill472_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill472_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill472_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill472_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill472_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill472_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill472_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill472_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill472_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill472_49)).doFinal(((byte[])(__sourceSpill472_48)));
        (__sourceSpill472_45)[__sourceSpill472_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    l = ((long[])(local8_life21));
    m = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


public static boolean b__sourceReturn_aae029aa0a() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.no.a__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public static void b(boolean p0) {
com.moon.no.j = ((boolean)(p0));
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b(int p0, int p1, int p2) {
this.i = ((com.moon.mX)(null));
    super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public static boolean a__Boolean() {
return ((((com.moon.no.j) ? 1 : 0)) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3013_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/no"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_58987bb62cfa36(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7839;
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
            throw new RuntimeException("com/moon/no", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


public void a(int p0, int p1) {
com.moon.mX lexicalValue319_372_0;
    com.moon.mX lexicalValue319_379_0;
    com.moon.mX lexicalValue319_380_0;
    float lexicalValue319_380_1;
    boolean spill319_0;
    int spill319_1;
    com.moon.mX spill319_2;
    long life3_3;
    com.moon.hW life6_14;
    float life7_36;
    float life8_41;
    float life9_46;
    float life10_53;
    float life11_60;
    int life5_61;
    float life12_65;
    com.moon.hW life13_188;
    com.moon.iv life14_192;
    float life15_196;
    float life16_200;
    int life17_202;
    float[] life18_217;
    float life19_225;
    float life20_233;
    com.moon.hW life17_289;
    com.moon.iv life18_293;
    com.moon.mX[] life19_296;
    int life20_299;
    int life21_301;
    com.moon.mX life22_308;
    float life19_352;
    float life20_362;
    lexical_join_385: {
    lexical_join_380: {
    lexical_join_379: {
    lexical_join_372: {
    lexical_join_370: {
    lexical_join_335: {
    lexical_join_324: {
    lexical_join_280: {
    lexical_join_257: {
    life3_3 = (com.moon.no.k ^ 43844414602854L);
    ((com.moon.no)(this)).d = ((float)(0x1.2cp7f));
    ((com.moon.no)(this)).c = ((float)(0x1.2cp7f));
    life6_14 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    spill319_0 = com.moon.no.a__Boolean();
    ((com.moon.hW)(life6_14)).a(((com.moon.iX)(com.moon.i3.a(((float)(((com.moon.no)(this)).a)), ((float)(((com.moon.no)(this)).b)), ((float)(((com.moon.no)(this)).c)), ((float)(((com.moon.no)(this)).d)), ((float)(0x1.8p2f)), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic319_12(13673, (5644326923840067593L ^ life3_3))))))));
    ((com.moon.hW)(life6_14)).b();
    life7_36 = 0x1.0p3f;
    life8_41 = (((com.moon.no)(this)).a + life7_36);
    life9_46 = (((com.moon.no)(this)).b + life7_36);
    life10_53 = (((com.moon.no)(this)).c - (life7_36 * 0x1.0p1f));
    life11_60 = (((com.moon.no)(this)).d - (life7_36 * 0x1.0p1f));
    life5_61 = ((spill319_0) ? 1 : 0);
    life12_65 = (life9_46 + life11_60);
    ((com.moon.mX)((this.g)[0])).a(((float)(life8_41)));
    ((com.moon.mX)((this.g)[0])).b(((float)((life12_65 - (((com.moon.setting.BezierSetting)(this.h)).getStartValue() * life11_60)))));
    ((com.moon.mX)((this.g)[1])).a(((float)((life8_41 + (((((com.moon.setting.BezierSetting)(this.h)).getControlPoints())[0])[0] * life10_53)))));
    ((com.moon.mX)((this.g)[1])).b(((float)((life12_65 - (((((com.moon.setting.BezierSetting)(this.h)).getControlPoints())[0])[1] * life11_60)))));
    ((com.moon.mX)((this.g)[2])).a(((float)((life8_41 + (((((com.moon.setting.BezierSetting)(this.h)).getControlPoints())[1])[0] * life10_53)))));
    ((com.moon.mX)((this.g)[2])).b(((float)((life12_65 - (((((com.moon.setting.BezierSetting)(this.h)).getControlPoints())[1])[1] * life11_60)))));
    ((com.moon.mX)((this.g)[3])).a(((float)((life8_41 + life10_53))));
    ((com.moon.mX)((this.g)[3])).b(((float)((life12_65 - (((com.moon.setting.BezierSetting)(this.h)).getEndValue() * life11_60)))));
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic319_49(23569, (5404532416607875440L ^ life3_3)))));
    life13_188 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.RECTANGLE))))).a(((int)(3))))).a();
    life14_192 = ((com.moon.hY)(((com.moon.hW)(life13_188)).a__hY())).a__iv();
    life15_196 = ((com.moon.hY)(((com.moon.hW)(life13_188)).a__hY())).a();
    life16_200 = ((com.moon.hY)(((com.moon.hW)(life13_188)).a__hY())).b();
    life17_202 = 0;
    lexical_cycle_203: while (true) {
    if (!((life17_202 < __sourceIntrinsic_fd0ba049c90e_invokedynamic319_62(30351, (1064092890785438701L ^ life3_3))))) {
        break lexical_join_257;
    }
    life18_217 = ((com.moon.setting.BezierSetting)(this.h)).evaluate(((float)((((float) life17_202) / 0x1.9p6f))));
    life19_225 = (life8_41 + ((life18_217)[0] * life10_53));
    life20_233 = (life12_65 - ((life18_217)[1] * life11_60));
    ((com.moon.iv)(((com.moon.iv)(life14_192)).a(((float)((life19_225 / life15_196))), ((float)((life20_233 / life16_200)))))).a(((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic319_66(22782, (3361294102812980635L ^ life3_3)))));
    life17_202 += 1;
    if (!((life5_61 == 0))) {
        break lexical_join_280;
    }
    if (!((life5_61 != 0))) { continue lexical_cycle_203; }
    break lexical_cycle_203;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[5])));
    }
    ((com.moon.hY)(((com.moon.hW)(life13_188)).a__hY())).b(((int)((((com.moon.hY)(((com.moon.hW)(life13_188)).a__hY())).b__Int() + __sourceIntrinsic_fd0ba049c90e_invokedynamic319_72(30676, (2866417086606039728L ^ life3_3))))));
    spill319_1 = 3851;
    ((com.moon.hW)(life13_188)).b();
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic319_75(spill319_1, (4395670214349922920L ^ life3_3)))));
    org.lwjgl.opengl.GL11.glPointSize(((float)(0x1.4p3f)));
    }
    life17_289 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.RECTANGLE))))).a(((int)(0))))).a();
    life18_293 = ((com.moon.hY)(((com.moon.hW)(life17_289)).a__hY())).a__iv();
    life19_296 = this.g;
    life20_299 = (life19_296).length;
    life21_301 = 0;
    lexical_cycle_299: while (true) {
    if (!((life21_301 < life20_299))) {
        break lexical_join_324;
    }
    life22_308 = (life19_296)[life21_301];
    ((com.moon.iv)(((com.moon.iv)(life18_293)).a(((float)((((com.moon.mX)(life22_308)).a() / life15_196))), ((float)((((com.moon.mX)(life22_308)).b() / life16_200)))))).a(((int)(-1)));
    life21_301 += 1;
    if (!((life5_61 == 0))) {
        break lexical_join_335;
    }
    if (!((life5_61 != 0))) { continue lexical_cycle_299; }
    break lexical_cycle_299;
    }
    }
    ((com.moon.hY)(((com.moon.hW)(life17_289)).a__hY())).b(((int)((((com.moon.hY)(((com.moon.hW)(life17_289)).a__hY())).b__Int() + 4))));
    ((com.moon.hW)(life17_289)).b();
    }
    if (!((this.i != null))) {
        break lexical_join_385;
    }
    life19_352 = (0x1.0p0f - ((((float) p1) - life9_46) / life11_60));
    life20_362 = moom.Dr.a(((float)(((((float) p0) - life8_41) / life10_53))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    spill319_2 = this.i;
    if (!((life5_61 == 0))) {
        lexicalValue319_372_0 = spill319_2;
        break lexical_join_372;
    }
    life21_301 = ((((com.moon.mX)(spill319_2)).a__Boolean()) ? 1 : 0);
    if (!((life21_301 != 0))) {
        break lexical_join_370;
    }
    ((com.moon.mX)(this.i)).a(((float)(life20_362)));
    }
    lexicalValue319_372_0 = this.i;
    }
    if (!((life21_301 == 0))) {
        lexicalValue319_379_0 = lexicalValue319_372_0;
        break lexical_join_379;
    }
    lexicalValue319_380_0 = lexicalValue319_372_0;
    lexicalValue319_380_1 = moom.Dr.a(((float)(life19_352)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    break lexical_join_380;
    }
    lexicalValue319_380_0 = lexicalValue319_379_0;
    lexicalValue319_380_1 = life19_352;
    }
    ((com.moon.mX)(lexicalValue319_380_0)).b(((float)(lexicalValue319_380_1)));
    ((com.moon.mX)(this.i)).a__Void();
    }
    return;
}


public void a__Void() {
long local1 = (com.moon.no.k ^ 58409112166222L);
    boolean spill2528_0 = com.moon.no.a__Boolean();
    (this.g)[0] = new com.moon.mX(__sourceIntrinsic_b82a5b29b709_invokedynamic2528_3(this), false);
    (this.g)[1] = new com.moon.mX(__sourceIntrinsic_b82a5b29b709_invokedynamic2528_5(this), true);
    boolean local3 = spill2528_0;
    (this.g)[2] = new com.moon.mX(__sourceIntrinsic_b82a5b29b709_invokedynamic2528_7(this), true);
    (this.g)[3] = new com.moon.mX(__sourceIntrinsic_b82a5b29b709_invokedynamic2528_9(this), false);
    super.a__Void();
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        __sourceExactCall_e3f218ba132999(((boolean)__sourceIntrinsic_integerToBoolean(((local3 ? 0 : 1)))));
    }
    return;
}


public void a(int p0, int p1, int p2) {
long life4_3;
    int life6_5;
    com.moon.mX life7_24;
    forward_join_34: {
    forward_join_29: {
    life4_3 = (com.moon.no.k ^ 134999212005055L);
    life6_5 = ((__sourceExactCall_bf00d5b8f9f95a()) ? 1 : 0);
    if (!((life6_5 != 0))) { break forward_join_34; }
    if (!((p2 == 0))) { break forward_join_29; }
    life7_24 = ((com.moon.mX)(((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(java.util.Arrays.stream(((java.lang.Object[])(this.g))))).filter(((java.util.function.Predicate)(__sourceIntrinsic_e4d4f5a69301_invokedynamic1418_5(p0, p1)))))).findFirst())).orElse(((java.lang.Object)(null)))));
    if (!((life6_5 != 0))) { break forward_join_34; }
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


private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic319_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic319_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic319_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic319_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic319_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic319_75(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_e4d4f5a69301_invokedynamic1418_5(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3013_0() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_b82a5b29b709_invokedynamic2528_3(com.moon.no a0) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_b82a5b29b709_invokedynamic2528_5(com.moon.no a0) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_b82a5b29b709_invokedynamic2528_7(com.moon.no a0) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_b82a5b29b709_invokedynamic2528_9(com.moon.no a0) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_58987bb62cfa36(int p0, long p1);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
private static native void __sourceExactCall_e3f218ba132999(boolean p0);
private static native boolean __sourceExactCall_bf00d5b8f9f95a();
}
