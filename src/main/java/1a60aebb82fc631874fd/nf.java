package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nf extends com.moon.m5 {

private com.moon.setting.FloatSetting n;

private java.lang.String o;

private boolean p;

private boolean q;

private static long r;

private static long[] s;

private static java.lang.Integer[] t;

private static java.util.Map u;

public nf(com.moon.nh p0, com.moon.setting.FloatSetting p1, float p2, float p3, float p4, float p5) {
super(p0, p2, p3, p4, p5);
    this.n = p1;
}


static {
r = ((long)(((moom._a)(moom._c.a(((long)(523423292841084241L)), ((long)(-8315673267020792399L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(63181549452997L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.nf.r ^ 29818025519426L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill314_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill314_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill314_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill314_14 = new byte[8];
    (__sourceSpill314_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill314_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation314_16 = __sourceSpill314_14;
    ((javax.crypto.Cipher)(__sourceSpill314_11)).init(((int)(__sourceSpill314_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill314_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation314_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ô­Å\002Ë\033N'ö¥¨uTi7ÐF3ÑTa"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill314_25 = local6_life21;
        int __sourceSpill314_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill314_25)).substring(((int)(__sourceSpill314_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill314_30 = local8_life19;
        int __sourceSpill314_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill314_33 = new byte[8];
        (__sourceSpill314_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill314_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill314_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill314_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill314_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill314_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill314_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill314_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill314_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill314_34)).doFinal(((byte[])(__sourceSpill314_33)));
        (__sourceSpill314_30)[__sourceSpill314_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    s = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceHandlerCall_9978be92b8a3ad36e19f(com.moon.nf a0) throws E;
private static final class __SourceHandler_9978be92b8a3ad36e19f {

public static void f68(com.moon.nf receiver) throws Throwable {
    com.moon.nf forwardValue68_12_0;
    com.moon.nf spill68_0;
    long life1_3;
    int[] life3_5;
    float life4_17;
    forward_join_20: {
    forward_join_12: {
    life1_3 = (__fieldRead68_0() ^ 37656764531450L);
    life3_5 = __call68_1();
    spill68_0 = receiver;
    if (!((life3_5 != null))) {
        forwardValue68_12_0 = spill68_0;
        break forward_join_12;
    }
    if (!(__fieldRead68_2(spill68_0))) {
        break forward_join_20;
    }
    forwardValue68_12_0 = receiver;
    }
    life4_17 = __call68_4(__fieldRead68_3(forwardValue68_12_0));
    __call68_7(__fieldRead68_5(receiver), __call68_6(life4_17));
    }
    return;
}
public static void h68_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2006800_0(p0);
}
public static void h68_1(java.lang.NumberFormatException p0, com.moon.nf p1) throws Throwable {
    java.lang.NumberFormatException local2 = p0;
    __fieldWrite2006801_0(p1, 0);
    return;
}
private static native long __fieldRead68_0() throws Throwable;
private static native int[] __call68_1() throws Throwable;
private static native boolean __fieldRead68_2(com.moon.nf a0) throws Throwable;
private static native java.lang.String __fieldRead68_3(com.moon.nf a0) throws Throwable;
private static native float __call68_4(java.lang.String a0) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead68_5(com.moon.nf a0) throws Throwable;
private static native java.lang.Float __call68_6(float a0) throws Throwable;
private static native void __call68_7(com.moon.setting.FloatSetting a0, java.lang.Float a1) throws Throwable;
private static native java.lang.NumberFormatException __call2006800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native void __fieldWrite2006801_0(com.moon.nf a0, int a1) throws Throwable;

}


public void b(int p0, int p1, int p2) {
this.q = ((boolean)(false));
    super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void b(int p0, int p1) {
float local3 = (((com.moon.nf)(this)).a() + 0x1.0p3f);
    float local4 = (((com.moon.nf)(this)).b() + 0x1.2p2f);
    float local5 = (((com.moon.nf)(this)).c() - 0x1.0p4f);
    float local6 = ((((com.moon.setting.FloatSetting)(this.n)).getSliderValue() - ((com.moon.setting.FloatSetting)(this.n)).getMin()) / (((com.moon.setting.FloatSetting)(this.n)).getMax() - ((com.moon.setting.FloatSetting)(this.n)).getMin()));
    java.lang.Object local7 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    float local8 = moom.Dr.a(((float)(((local3 + ((local5 + 0x1.0p0f) * local6)) - 0x1.0p2f))), ((float)((local3 - 0x1.0p-1f))), ((float)(((local3 + local5) - 0x1.ep2f))));
    ((com.moon.hW)(local7)).a(((com.moon.iX)(com.moon.i3.a(((float)(local8)), ((float)((local4 + 0x1.3p3f))), ((float)(0x1.0p3f)), ((float)(0x1.0p3f)), ((float)(0x1.8p1f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.nf)(this)).a__lS())).a__kX())).getValue())))).intValue()))))));
    ((com.moon.hW)(local7)).b();
    super.b(((int)(p0)), ((int)(p1)));
    return;
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.FloatSetting)(this.n)).isAvailable())) != 0);
}


public void c(int p0, int p1) {
java.lang.Object forwardValue1108_125_0;
    java.lang.String forwardValue1108_127_0;
    com.moon.nf forwardValue1108_205_0;
    int[] spill1108_0;
    com.moon.nf spill1108_1;
    com.moon.nf spill1108_2;
    long life3_3;
    float life6_8;
    float life7_13;
    float life8_19;
    float life9_35;
    int[] life5_36;
    com.moon.jm life10_41;
    com.moon.hW life11_46;
    com.moon.hW life12_53;
    java.lang.String life13_132;
    float life14_195;
    forward_join_213: {
    forward_join_205: {
    forward_join_204: {
    forward_join_127: {
    forward_join_125: {
    forward_join_122: {
    life3_3 = (com.moon.nf.r ^ 53719864790121L);
    life6_8 = (((com.moon.nf)(this)).a() + 0x1.0p3f);
    life7_13 = (((com.moon.nf)(this)).b() + 0x1.2p2f);
    spill1108_0 = __sourceExactCall_f9767dd554d5b6();
    life8_19 = (((com.moon.nf)(this)).c() - 0x1.0p4f);
    life9_35 = ((((com.moon.setting.FloatSetting)(this.n)).getSliderValue() - ((com.moon.setting.FloatSetting)(this.n)).getMin()) / (((com.moon.setting.FloatSetting)(this.n)).getMax() - ((com.moon.setting.FloatSetting)(this.n)).getMin()));
    life5_36 = spill1108_0;
    life10_41 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life11_46 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life12_53 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life10_41))))).a();
    ((com.moon.hW)(life11_46)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 - 0x1.0p-1f))), ((float)(((life7_13 + 0x1.cp1f) + ((com.moon.jm)(life10_41)).a(((float)(0x1.cp2f)))))), ((float)((life8_19 + 0x1.0p0f))), ((float)(0x1.8p1f)), ((float)(0x1.8p-1f)), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic1108_27(16313, (3934549364443653078L ^ life3_3))))))));
    ((com.moon.hW)(life11_46)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 - 0x1.0p-1f))), ((float)(((life7_13 + 0x1.cp1f) + ((com.moon.jm)(life10_41)).a(((float)(0x1.cp2f)))))), ((float)(((life8_19 + 0x1.0p0f) * life9_35))), ((float)(0x1.8p1f)), ((float)(0x1.8p-1f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.nf)(this)).a__lS())).a__kX())).getValue())))).intValue()))))));
    ((com.moon.jm)(life10_41)).b(((com.moon.hW)(life12_53)), ((java.lang.String)(((com.moon.setting.FloatSetting)(this.n)).getDisplayName())), ((float)(0x1.cp2f)), ((float)(life6_8)), ((float)(life7_13)), ((int)(-1)));
    spill1108_1 = this;
    if (!((life5_36 != null))) {
        forwardValue1108_125_0 = spill1108_1;
        break forward_join_125;
    }
    if (!(((com.moon.nf)(spill1108_1)).p)) {
        break forward_join_122;
    }
    forwardValue1108_127_0 = __sourceIntrinsic_505b8c2844d4_invokedynamic1108_43(this.o);
    break forward_join_127;
    }
    forwardValue1108_125_0 = ((com.moon.setting.FloatSetting)(this.n)).getValue();
    }
    forwardValue1108_127_0 = ((java.lang.Float)(((java.lang.Float)(forwardValue1108_125_0)))).toString();
    }
    life13_132 = forwardValue1108_127_0;
    ((com.moon.jm)(life10_41)).b(((com.moon.hW)(life12_53)), ((java.lang.String)(life13_132)), ((float)(0x1.cp2f)), ((float)(((life6_8 + life8_19) - ((com.moon.jm)(life10_41)).a(((java.lang.String)(life13_132)), ((float)(0x1.cp2f)))))), ((float)(life7_13)), ((int)(-1)));
    ((com.moon.nf)(this)).a(((float)(((life6_8 + ((com.moon.jm)(life10_41)).a(((java.lang.String)(((com.moon.setting.FloatSetting)(this.n)).getDisplayName())), ((float)(0x1.cp2f)))) + 0x1.0p2f))), ((float)((life7_13 + 0x1.0p-1f))), ((int)(p0)), ((int)(p1)));
    ((com.moon.hW)(life11_46)).b();
    ((com.moon.hW)(life12_53)).b();
    spill1108_2 = this;
    if (!((life5_36 != null))) {
        forwardValue1108_205_0 = spill1108_2;
        break forward_join_205;
    }
    if (!(((com.moon.nf)(spill1108_2)).q)) {
        break forward_join_204;
    }
    life14_195 = ((((((float) p0) - life6_8) * (((com.moon.setting.FloatSetting)(this.n)).getMax() - ((com.moon.setting.FloatSetting)(this.n)).getMin())) / life8_19) + ((com.moon.setting.FloatSetting)(this.n)).getMin());
    ((com.moon.setting.FloatSetting)(this.n)).setValue(((java.lang.Float)(java.lang.Float.valueOf(((float)(moom.Dr.a(((float)(life14_195)), ((float)(java.lang.Math.max(((float)(((com.moon.setting.FloatSetting)(this.n)).getMin())), ((float)(((com.moon.setting.FloatSetting)(this.n)).getDragMin()))))), ((float)(((com.moon.setting.FloatSetting)(this.n)).getMax())))))))));
    }
    forwardValue1108_205_0 = this;
    }
    __sourceIntrinsic_505b8c2844d4_call1108_74(forwardValue1108_205_0, p0, p1);
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_213;
    }
    com.moon.jU.b(((int[])(new int[5])));
    }
    return;
}


private void d__sourceReturn_da8c82d5d4() { __sourceHandlerCall_9978be92b8a3ad36e19f(this); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3450;
      if (t[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/nf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
}


private static java.lang.NumberFormatException a(java.lang.NumberFormatException p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_7402b5dadb64f1(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2998_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, int p2) {
int forwardValue1107_82_0;
    com.moon.nf forwardValue1107_101_0;
    int forwardValue1107_101_1;
    int[] spill1107_0;
    boolean spill1107_1;
    int spill1107_2;
    com.moon.nf spill1107_3;
    int spill1107_4;
    long life4_3;
    float life7_9;
    float life8_14;
    int[] life6_15;
    float life9_20;
    com.moon.jm life10_25;
    forward_join_102: {
    forward_join_101: {
    forward_join_97: {
    forward_join_82: {
    forward_join_50: {
    life4_3 = (com.moon.nf.r ^ 30336975537207L);
    spill1107_0 = __sourceExactCall_f9767dd554d5b6();
    life7_9 = (((com.moon.nf)(this)).a() + 0x1.0p3f);
    life8_14 = (((com.moon.nf)(this)).b() + 0x1.2p2f);
    life6_15 = spill1107_0;
    life9_20 = (((com.moon.nf)(this)).c() - 0x1.0p4f);
    life10_25 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    spill1107_1 = ((com.moon.nf)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life7_9)), ((float)(((life8_14 + 0x1.8p1f) + ((com.moon.jm)(life10_25)).a(((float)(0x1.cp2f)))))), ((float)(life9_20)), ((float)(0x1.cp2f)));
    if (!((life6_15 != null))) {
        forwardValue1107_82_0 = ((spill1107_1) ? 1 : 0);
        break forward_join_82;
    }
    if (!(spill1107_1)) {
        break forward_join_50;
    }
    spill1107_2 = p2;
    if (!((life6_15 != null))) {
        forwardValue1107_82_0 = spill1107_2;
        break forward_join_82;
    }
    if (!((spill1107_2 == 0))) {
        break forward_join_50;
    }
    this.q = ((boolean)(true));
    }
    spill1107_3 = this;
    spill1107_4 = p0;
    if (!((life6_15 != null))) {
        forwardValue1107_101_0 = spill1107_3;
        forwardValue1107_101_1 = spill1107_4;
        break forward_join_101;
    }
    forwardValue1107_82_0 = ((((com.moon.nf)(spill1107_3)).a(((int)(spill1107_4)), ((int)(p1)), ((float)(((life7_9 + life9_20) - ((com.moon.jm)(life10_25)).a(((java.lang.String)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.n)).getValue())))).toString())), ((float)(0x1.cp2f)))))), ((float)((life8_14 + 0x1.8p0f))), ((float)(((com.moon.jm)(life10_25)).a(((java.lang.String)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.n)).getValue())))).toString())), ((float)(0x1.cp2f))))), ((float)(((com.moon.jm)(life10_25)).a(((float)(0x1.cp2f))))))) ? 1 : 0);
    }
    if (!((forwardValue1107_82_0 != 0))) {
        break forward_join_97;
    }
    if (!((p2 == 0))) {
        break forward_join_97;
    }
    this.o = ((java.lang.String)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.n)).getValue())))).toString()));
    this.p = ((boolean)(true));
    if (!((life6_15 == null))) {
        break forward_join_102;
    }
    }
    ((com.moon.nf)(this)).d__sourceReturn_da8c82d5d4();
    forwardValue1107_101_0 = this;
    forwardValue1107_101_1 = 0;
    }
    ((com.moon.nf)(forwardValue1107_101_0)).p = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1107_101_1)));
    }
    super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void a(char p0, int p1) {
int forwardValue1106_26_0;
    com.moon.nf forwardValue1106_56_0;
    int spill1106_0;
    com.moon.nf spill1106_1;
    long life3_3;
    int[] life5_5;
    forward_join_56: {
    forward_join_55: {
    forward_join_49: {
    forward_join_26: {
    forward_join_22: {
    life3_3 = (com.moon.nf.r ^ 123748717251087L);
    life5_5 = __sourceExactCall_f9767dd554d5b6();
    spill1106_0 = p1;
    if (!((life5_5 != null))) {
        forwardValue1106_26_0 = spill1106_0;
        break forward_join_26;
    }
    if (!((spill1106_0 == __sourceIntrinsic_f7d59ba1def0_invokedynamic1106_2(7948, (212765106026808580L ^ life3_3))))) {
        break forward_join_22;
    }
    ((com.moon.nf)(this)).d__sourceReturn_da8c82d5d4();
    this.p = ((boolean)(false));
    if (!((life5_5 == null))) {
        break forward_join_55;
    }
    }
    spill1106_1 = this;
    if (!((life5_5 != null))) {
        forwardValue1106_56_0 = spill1106_1;
        break forward_join_56;
    }
    forwardValue1106_26_0 = ((((com.moon.nf)(spill1106_1)).p) ? 1 : 0);
    }
    if (!((forwardValue1106_26_0 != 0))) {
        break forward_join_55;
    }
    if (!((p1 == __sourceIntrinsic_f7d59ba1def0_invokedynamic1106_7(23794, (5829493362339792633L ^ life3_3))))) {
        break forward_join_49;
    }
    this.o = ((java.lang.String)(((java.lang.String)(this.o)).substring(((int)(0)), ((int)(java.lang.Math.max(((int)((((java.lang.String)(this.o)).length() - 1))), ((int)(0))))))));
    if (!((life5_5 == null))) {
        break forward_join_55;
    }
    }
    com.moon.nf __stackOp1106_14_0 = this;
    ((com.moon.nf)(__stackOp1106_14_0)).o = ((java.lang.String)(__sourceIntrinsic_f7d59ba1def0_invokedynamic1106_16(((com.moon.nf)(__stackOp1106_14_0)).o, p0)));
    }
    forwardValue1106_56_0 = this;
    }
    __sourceIntrinsic_f7d59ba1def0_call1106_18(forwardValue1106_56_0, p0, p1);
    return;
}


public com.moon.setting.Setting a__sourceReturn_7d3c444d39() {
return this.n;
}


public void a(int p0, int p1) {
float local3 = (((com.moon.nf)(this)).a() + 0x1.0p3f);
    float local4 = (((com.moon.nf)(this)).b() + 0x1.2p2f);
    float local5 = (((com.moon.nf)(this)).c() - 0x1.0p4f);
    float local6 = ((((com.moon.setting.FloatSetting)(this.n)).getSliderValue() - ((com.moon.setting.FloatSetting)(this.n)).getMin()) / (((com.moon.setting.FloatSetting)(this.n)).getMax() - ((com.moon.setting.FloatSetting)(this.n)).getMin()));
    com.moon.hW local7 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    float local8 = moom.Dr.a(((float)(((local3 + ((local5 + 0x1.0p0f) * local6)) - 0x1.0p2f))), ((float)((local3 - 0x1.0p-1f))), ((float)(((local3 + local5) - 0x1.ep2f))));
    ((com.moon.hW)(local7)).a(((com.moon.iX)(com.moon.i3.a(((float)(local8)), ((float)((local4 + 0x1.3p3f))), ((float)(0x1.0p3f)), ((float)(0x1.0p3f)), ((float)(0x1.8p1f)), ((int)(__sourceExactCall_cd88b7748cd09e(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))).a(((float)(0x1.8p-1f))))))))))));
    ((com.moon.hW)(local7)).b();
    super.a(((int)(p0)), ((int)(p1)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_f7d59ba1def0_invokedynamic1106_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7d59ba1def0_invokedynamic1106_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f7d59ba1def0_invokedynamic1106_16(java.lang.String a0, char a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_f7d59ba1def0_call1106_18(com.moon.nf a0, char a1, int a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2998_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic1108_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_505b8c2844d4_invokedynamic1108_43(java.lang.String a0) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_505b8c2844d4_call1108_74(com.moon.nf a0, int a1, int a2) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int[] __sourceExactCall_f9767dd554d5b6();
private static native int __sourceExactCall_7402b5dadb64f1(int p0, long p1);

private static native int __sourceExactCall_cd88b7748cd09e(com.moon.aO p0);
}
