package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class m7 extends com.moon.m5 {

private com.moon.nY n;

private com.moon.setting.BooleanSetting o;

private boolean p;

private static long q;

private static long[] r;

private static java.lang.Integer[] s;

private static java.util.Map t;

private static long u;

public m7(com.moon.nh p0, com.moon.setting.BooleanSetting p1, float p2, float p3, float p4, float p5) { super((com.moon.nh)null, 0.0F, 0.0F, 0.0F, 0.0F); }

private static void __sourceConstructorBody_f324f7a1b5ddcf69(com.moon.m7 receiver, com.moon.nh p0, com.moon.setting.BooleanSetting p1, float p2, float p3, float p4, float p5) throws Throwable {
long local7 = (com.moon.m7.q ^ 121066698545209L);
    com.moon.m7.__sourceConstructorInit_f324f7a1b5ddcf69_0(((com.moon.m7)(receiver)), ((com.moon.nh)(p0)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)));
    ((com.moon.m7)(receiver)).n = ((com.moon.nY)(new com.moon.nY(com.moon.m7.u, com.moon.cj.EASE_IN_OUT_CUBIC)));
    ((com.moon.m7)(receiver)).o = ((com.moon.setting.BooleanSetting)(p1));
    ((com.moon.nY)(((com.moon.m7)(receiver)).n)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((boolean)(true)));
    ((com.moon.nY)(((com.moon.m7)(receiver)).n)).b__Void();
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_f324f7a1b5ddcf69_0(com.moon.m7 a0, com.moon.nh a1, float a2, float a3, float a4, float a5) throws E;

static {
q = ((long)(((moom._a)(moom._c.a(((long)(2324243510641586948L)), ((long)(-3167322801020691467L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(147542948286118L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.m7.q ^ 44773866316873L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill237_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill237_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill237_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill237_14 = new byte[8];
    (__sourceSpill237_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill237_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation237_16 = __sourceSpill237_14;
    ((javax.crypto.Cipher)(__sourceSpill237_11)).init(((int)(__sourceSpill237_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill237_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation237_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[2];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "ç3¦ é2#ï\"ä¥6ËíG"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill237_25 = local11_life21;
        int __sourceSpill237_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill237_25)).substring(((int)(__sourceSpill237_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill237_30 = local13_life19;
        int __sourceSpill237_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill237_33 = new byte[8];
        (__sourceSpill237_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill237_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill237_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill237_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill237_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill237_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill237_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill237_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill237_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill237_34)).doFinal(((byte[])(__sourceSpill237_33)));
        (__sourceSpill237_30)[__sourceSpill237_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    r = ((long[])(local13_life19));
    s = ((java.lang.Integer[])(new java.lang.Integer[2]));
    javax.crypto.Cipher local0_life40;
    javax.crypto.Cipher __sourceSpill237_42 = (local0_life40 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill237_43 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill237_44 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill237_45 = new byte[8];
    (__sourceSpill237_45)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life46 = 1;
    while ((local1_life46 < 8)) {
        (__sourceSpill237_45)[local1_life46] = ((byte) ((int) ((local5_life7 << (local1_life46 * 8)) >>> 56)));
        local1_life46 += 1;
    }
    byte[] __sourcePreallocation237_47 = __sourceSpill237_45;
    ((javax.crypto.Cipher)(__sourceSpill237_42)).init(((int)(__sourceSpill237_43)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill237_44)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation237_47)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life50 = -2229934333978662622L;
    byte[] __sourceSpill237_51 = new byte[8];
    (__sourceSpill237_51)[0] = ((byte) ((int) (local2_life50 >>> 56)));
    (__sourceSpill237_51)[1] = ((byte) ((int) (local2_life50 >>> 48)));
    (__sourceSpill237_51)[2] = ((byte) ((int) (local2_life50 >>> 40)));
    (__sourceSpill237_51)[3] = ((byte) ((int) (local2_life50 >>> 32)));
    (__sourceSpill237_51)[4] = ((byte) ((int) (local2_life50 >>> 24)));
    (__sourceSpill237_51)[5] = ((byte) ((int) (local2_life50 >>> 16)));
    (__sourceSpill237_51)[6] = ((byte) ((int) (local2_life50 >>> 8)));
    (__sourceSpill237_51)[7] = ((byte) ((int) local2_life50));
    javax.crypto.Cipher __sourceSpill237_52 = local0_life40;
    byte[] local4_life54 = ((javax.crypto.Cipher)(__sourceSpill237_52)).doFinal(((byte[])(__sourceSpill237_51)));
    u = ((long)((((((((((((long) (local4_life54)[0]) & 255L) << 56) | ((((long) (local4_life54)[1]) & 255L) << 48)) | ((((long) (local4_life54)[2]) & 255L) << 40)) | ((((long) (local4_life54)[3]) & 255L) << 32)) | ((((long) (local4_life54)[4]) & 255L) << 24)) | ((((long) (local4_life54)[5]) & 255L) << 16)) | ((((long) (local4_life54)[6]) & 255L) << 8)) | (((long) (local4_life54)[7]) & 255L))));
}


public void b(int p0, int p1, int p2) {
super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void b(int p0, int p1) {
float local3 = (((com.moon.m7)(this)).a() + 0x1.0p3f);
    float local4 = (((com.moon.m7)(this)).b() + 0x1.2p2f);
    float local5 = (((com.moon.m7)(this)).c() - 0x1.0p4f);
    float local6 = ((com.moon.nY)(this.n)).c();
    java.lang.Object local7 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    float local8 = (0x1.ep2f * local6);
    ((com.moon.hW)(local7)).a(((com.moon.iX)(com.moon.i3.a(((float)((((local3 + local5) - 0x1.4p4f) + local8))), ((float)((local4 + 0x1.0p1f))), ((float)(0x1.5p3f)), ((float)(0x1.5p3f)), ((float)(0x1.0p2f)), ((int)(-1))))));
    ((com.moon.hW)(local7)).b();
    super.b(((int)(p0)), ((int)(p1)));
    return;
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.BooleanSetting)(this.o)).isAvailable())) != 0);
}


public void c(int p0, int p1) {
com.moon.nY forwardValue673_184_0;
    com.moon.nY forwardValue673_185_0;
    float forwardValue673_185_1;
    com.moon.m7 forwardValue673_201_0;
    net.minecraft.entity.Entity[] spill673_0;
    com.moon.m7 spill673_1;
    com.moon.nY spill673_2;
    long life3_3;
    float life6_8;
    float life7_13;
    float life8_18;
    float life9_24;
    float life10_28;
    com.moon.jm life11_33;
    net.minecraft.entity.Entity[] life5_34;
    com.moon.hW life12_39;
    com.moon.hW life13_44;
    com.moon.hW life14_51;
    forward_join_209: {
    forward_join_201: {
    forward_join_193: {
    forward_join_185: {
    forward_join_184: {
    life3_3 = (com.moon.m7.q ^ 43565612135170L);
    life6_8 = (((com.moon.m7)(this)).a() + 0x1.0p3f);
    life7_13 = (((com.moon.m7)(this)).b() + 0x1.2p2f);
    life8_18 = (((com.moon.m7)(this)).c() - 0x1.0p4f);
    spill673_0 = moom.lw.b__Arrayr3();
    life9_24 = (this.k - 0x1.2p2f);
    life10_28 = ((com.moon.nY)(this.n)).c();
    life11_33 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life5_34 = spill673_0;
    life12_39 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life13_44 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.OUTLINE_ROUNDED_RECTANGLE))))).a();
    life14_51 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life11_33))))).a();
    ((com.moon.hW)(life12_39)).a(((com.moon.iX)(com.moon.i3.a(((float)(((life6_8 + life8_18) - 0x1.6p4f))), ((float)(life7_13)), ((float)(0x1.6p4f)), ((float)(0x1.dp3f)), ((float)(0x1.8p2f)), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic673_25(6675, (5765949199816045631L ^ life3_3))))))));
    ((com.moon.hW)(life13_44)).a(((com.moon.iX)(com.moon.i1.a(((float)(((life6_8 + life8_18) - 0x1.68p4f))), ((float)((life7_13 - 0x1.0p-1f))), ((float)(0x1.7p4f)), ((float)(0x1.fp3f)), ((float)(0x1.ap2f)), ((float)(0x1.0p-2f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceIntrinsic_505b8c2844d4_invokedynamic673_28(17415, (764809092179913258L ^ life3_3))))).a(((float)((0x1.0p0f - life10_28)))))).getRGB()))))));
    ((com.moon.hW)(life12_39)).a(((com.moon.iX)(com.moon.i3.a(((float)(((life6_8 + life8_18) - 0x1.6p4f))), ((float)(life7_13)), ((float)(0x1.6p4f)), ((float)(0x1.dp3f)), ((float)(0x1.8p2f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.m7)(this)).a__lS())).a__kX())).getValue())))).intValue()))).a(((float)(life10_28))))).getRGB()))))));
    ((com.moon.jm)(life11_33)).b(((com.moon.hW)(life14_51)), ((java.lang.String)(((com.moon.setting.BooleanSetting)(this.o)).getDisplayName())), ((float)(0x1.cp2f)), ((float)(life6_8)), ((float)((((life7_13 + (life9_24 / 0x1.0p1f)) - (((com.moon.jm)(life11_33)).b(((java.lang.String)(((com.moon.setting.BooleanSetting)(this.o)).getDisplayName())), ((float)(0x1.cp2f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(-1)));
    ((com.moon.m7)(this)).a(((float)(((life6_8 + life8_18) - 0x1.08p5f))), ((float)((life7_13 + 0x1.0p2f))), ((int)(p0)), ((int)(p1)));
    ((com.moon.hW)(life12_39)).b();
    ((com.moon.hW)(life13_44)).b();
    ((com.moon.hW)(life14_51)).b();
    spill673_1 = this;
    if (!((life5_34 == null))) {
        forwardValue673_201_0 = spill673_1;
        break forward_join_201;
    }
    if (!((((com.moon.m7)(spill673_1)).p != ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.o)).getValue())))).booleanValue()))) {
        break forward_join_193;
    }
    spill673_2 = this.n;
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.o)).getValue())))).booleanValue())) {
        forwardValue673_184_0 = spill673_2;
        break forward_join_184;
    }
    forwardValue673_185_0 = spill673_2;
    forwardValue673_185_1 = 0x1.0p0f;
    break forward_join_185;
    }
    forwardValue673_185_0 = forwardValue673_184_0;
    forwardValue673_185_1 = 0x0.0p0f;
    }
    ((com.moon.nY)(forwardValue673_185_0)).a(((float)(forwardValue673_185_1)));
    this.p = ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.o)).getValue())))).booleanValue()));
    }
    ((com.moon.nY)(this.n)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.p)));
    forwardValue673_201_0 = this;
    }
    __sourceIntrinsic_505b8c2844d4_call673_71(forwardValue673_201_0, p0, p1);
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_209;
    }
    __sourceExactCall_c1acbf9e6af6e5(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[3])));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16184;
      if (s[var3] == null) {
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
         long var5 = r[var3];
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
         Object[] var9 = (Object[])t.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               t.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/m7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         s[var3] = var15;
      }

      return s[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_8247c1c9235629(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2139_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/m7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1) {
float local3 = (((com.moon.m7)(this)).a() + 0x1.0p3f);
    float local4 = (((com.moon.m7)(this)).b() + 0x1.2p2f);
    float local5 = (((com.moon.m7)(this)).c() - 0x1.0p4f);
    float local6 = ((com.moon.nY)(this.n)).c();
    com.moon.hW local7 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    float local8 = (0x1.ep2f * local6);
    ((com.moon.hW)(local7)).a(((com.moon.iX)(com.moon.i3.a(((float)((((local3 + local5) - 0x1.4p4f) + local8))), ((float)((local4 + 0x1.0p1f))), ((float)(0x1.5p3f)), ((float)(0x1.5p3f)), ((float)(0x1.0p2f)), ((int)(__sourceExactCall_cd88b7748cd09e(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))).a(((float)((local6 * 0x1.ccccccp-1f)))))))))))));
    ((com.moon.hW)(local7)).b();
    super.a(((int)(p0)), ((int)(p1)));
    return;
}


public com.moon.setting.Setting a__sourceReturn_7d3c444d39() {
return this.o;
}


public void a(int p0, int p1, int p2) {
com.moon.setting.BooleanSetting forwardValue672_49_0;
    int forwardValue672_49_1;
    com.moon.setting.BooleanSetting forwardValue672_50_0;
    com.moon.setting.BooleanSetting forwardValue672_51_0;
    int forwardValue672_51_1;
    com.moon.m7 forwardValue672_56_0;
    int forwardValue672_56_1;
    int forwardValue672_56_2;
    net.minecraft.entity.Entity[] spill672_0;
    com.moon.m7 spill672_1;
    int spill672_2;
    int spill672_3;
    com.moon.setting.BooleanSetting spill672_4;
    boolean spill672_5;
    long life4_3;
    float life7_8;
    float life8_13;
    float life9_19;
    net.minecraft.entity.Entity[] life6_20;
    forward_join_56: {
    forward_join_53: {
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    life4_3 = (com.moon.m7.q ^ 14103213390684L);
    life7_8 = (((com.moon.m7)(this)).a() + 0x1.0p3f);
    life8_13 = (((com.moon.m7)(this)).b() + 0x1.2p2f);
    spill672_0 = moom.lw.b__Arrayr3();
    life9_19 = (((com.moon.m7)(this)).c() - 0x1.0p4f);
    life6_20 = spill672_0;
    spill672_1 = this;
    spill672_2 = p0;
    spill672_3 = p1;
    if (!((life6_20 == null))) {
        forwardValue672_56_0 = spill672_1;
        forwardValue672_56_1 = spill672_2;
        forwardValue672_56_2 = spill672_3;
        break forward_join_56;
    }
    if (!(((com.moon.m7)(spill672_1)).a(((int)(spill672_2)), ((int)(spill672_3)), ((float)(((life7_8 + life9_19) - 0x1.6p4f))), ((float)(life8_13)), ((float)(0x1.6p4f)), ((float)(0x1.dp3f))))) {
        break forward_join_53;
    }
    if (!((p2 == 0))) {
        break forward_join_53;
    }
    spill672_4 = this.o;
    spill672_5 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.o)).getValue())))).booleanValue();
    if (!((life6_20 == null))) {
        forwardValue672_49_0 = spill672_4;
        forwardValue672_49_1 = ((spill672_5) ? 1 : 0);
        break forward_join_49;
    }
    if (!((!spill672_5))) {
        forwardValue672_50_0 = spill672_4;
        break forward_join_50;
    }
    forwardValue672_49_0 = spill672_4;
    forwardValue672_49_1 = 1;
    }
    forwardValue672_51_0 = forwardValue672_49_0;
    forwardValue672_51_1 = forwardValue672_49_1;
    break forward_join_51;
    }
    forwardValue672_51_0 = forwardValue672_50_0;
    forwardValue672_51_1 = 0;
    }
    ((com.moon.setting.BooleanSetting)(forwardValue672_51_0)).setValue(((java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue672_51_1)))))));
    }
    forwardValue672_56_0 = this;
    forwardValue672_56_1 = p0;
    forwardValue672_56_2 = p1;
    }
    __sourceIntrinsic_e4d4f5a69301_call672_14(forwardValue672_56_0, forwardValue672_56_1, forwardValue672_56_2, p2);
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic673_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic673_28(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_505b8c2844d4_call673_71(com.moon.m7 a0, int a1, int a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2139_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_e4d4f5a69301_call672_14(com.moon.m7 a0, int a1, int a2, int a3) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native void __sourceExactCall_c1acbf9e6af6e5(net.minecraft.entity.Entity[] p0);
private static native int __sourceExactCall_8247c1c9235629(int p0, long p1);

private static native int __sourceExactCall_cd88b7748cd09e(com.moon.aO p0);
}
