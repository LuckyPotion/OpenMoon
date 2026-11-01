package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ng extends com.moon.m5 {

private com.moon.setting.IntegerSetting n;

private java.lang.String o;

private boolean p;

private boolean q;

private static long r;

private static long[] s;

private static java.lang.Integer[] t;

private static java.util.Map u;

public ng(com.moon.nh p0, com.moon.setting.IntegerSetting p1, float p2, float p3, float p4, float p5) {
super(p0, p2, p3, p4, p5);
    this.n = p1;
}


static {
r = ((long)(((moom._a)(moom._c.a(((long)(-2311824187536417152L)), ((long)(4249437053222827568L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(57770818991208L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ng.r ^ 137501708664818L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill315_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill315_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill315_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill315_14 = new byte[8];
    (__sourceSpill315_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill315_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation315_16 = __sourceSpill315_14;
    ((javax.crypto.Cipher)(__sourceSpill315_11)).init(((int)(__sourceSpill315_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill315_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation315_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "×ìùË3\002²¾õµÉNÝÓkðdÒ\037a"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill315_25 = local6_life21;
        int __sourceSpill315_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill315_25)).substring(((int)(__sourceSpill315_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill315_30 = local8_life19;
        int __sourceSpill315_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill315_33 = new byte[8];
        (__sourceSpill315_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill315_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill315_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill315_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill315_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill315_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill315_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill315_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill315_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill315_34)).doFinal(((byte[])(__sourceSpill315_33)));
        (__sourceSpill315_30)[__sourceSpill315_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    s = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceHandlerCall_a9f070ab4d33b7c1cdad(com.moon.ng a0) throws E;
private static final class __SourceHandler_a9f070ab4d33b7c1cdad {

public static void f69(com.moon.ng receiver) throws Throwable {
    int forwardValue69_14_0;
    boolean spill69_0;
    long life1_3;
    int[] life3_5;
    int life4_17;
    forward_join_20: {
    forward_join_14: {
    life1_3 = (__fieldRead69_0() ^ 15255886887361L);
    life3_5 = __call69_1();
    spill69_0 = __fieldRead69_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue69_14_0 = __integerCategory69_3(spill69_0);
        break forward_join_14;
    }
    if (!(spill69_0)) {
        break forward_join_20;
    }
    forwardValue69_14_0 = __call69_5(__fieldRead69_4(receiver));
    }
    life4_17 = forwardValue69_14_0;
    __call69_7(__fieldRead69_6(receiver), ((float) life4_17));
    }
    return;
}
public static void h69_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2006900_0(p0);
}
public static void h69_1(java.lang.NumberFormatException p0, com.moon.ng p1) throws Throwable {
    java.lang.NumberFormatException local2 = p0;
    __fieldWrite2006901_0(p1, 0);
    return;
}
private static native long __fieldRead69_0() throws Throwable;
private static native int[] __call69_1() throws Throwable;
private static native boolean __fieldRead69_2(com.moon.ng a0) throws Throwable;
private static native int __integerCategory69_3(boolean value) throws Throwable;
private static native java.lang.String __fieldRead69_4(com.moon.ng a0) throws Throwable;
private static native int __call69_5(java.lang.String a0) throws Throwable;
private static native com.moon.setting.IntegerSetting __fieldRead69_6(com.moon.ng a0) throws Throwable;
private static native void __call69_7(com.moon.setting.IntegerSetting a0, float a1) throws Throwable;
private static native java.lang.NumberFormatException __call2006900_0(java.lang.NumberFormatException a0) throws Throwable;
private static native void __fieldWrite2006901_0(com.moon.ng a0, int a1) throws Throwable;

}


public void b(int p0, int p1, int p2) {
this.q = ((boolean)(false));
    super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void b(int p0, int p1) {
float local3 = (((com.moon.ng)(this)).a() + 0x1.0p3f);
    float local4 = (((com.moon.ng)(this)).b() + 0x1.2p2f);
    float local5 = (((com.moon.ng)(this)).c() - 0x1.0p4f);
    float local6 = ((((com.moon.setting.IntegerSetting)(this.n)).getSliderValue() - ((float) ((com.moon.setting.IntegerSetting)(this.n)).getMin())) / ((float) (((com.moon.setting.IntegerSetting)(this.n)).getMax() - ((com.moon.setting.IntegerSetting)(this.n)).getMin())));
    java.lang.Object local7 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    float local8 = moom.Dr.a(((float)(((local3 + ((local5 + 0x1.0p0f) * local6)) - 0x1.0p2f))), ((float)((local3 - 0x1.0p-1f))), ((float)(((local3 + local5) - 0x1.ep2f))));
    ((com.moon.hW)(local7)).a(((com.moon.iX)(com.moon.i3.a(((float)(local8)), ((float)((local4 + 0x1.3p3f))), ((float)(0x1.0p3f)), ((float)(0x1.0p3f)), ((float)(0x1.8p1f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.ng)(this)).a__lS())).a__kX())).getValue())))).intValue()))))));
    ((com.moon.hW)(local7)).b();
    super.b(((int)(p0)), ((int)(p1)));
    return;
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.IntegerSetting)(this.n)).isAvailable())) != 0);
}


public void c(int p0, int p1) {
java.lang.Object forwardValue1111_144_0;
    java.lang.String forwardValue1111_146_0;
    com.moon.ng forwardValue1111_206_0;
    int[] spill1111_0;
    com.moon.ng spill1111_1;
    com.moon.ng spill1111_2;
    long life3_3;
    float life6_8;
    float life7_13;
    float life8_18;
    float life9_37;
    int[] life5_38;
    com.moon.jm life10_43;
    com.moon.hW life11_48;
    com.moon.hW life12_55;
    java.lang.String life13_151;
    float life14_199;
    forward_join_214: {
    forward_join_206: {
    forward_join_205: {
    forward_join_146: {
    forward_join_144: {
    forward_join_141: {
    life3_3 = (com.moon.ng.r ^ 86245344568584L);
    life6_8 = (((com.moon.ng)(this)).a() + 0x1.0p3f);
    life7_13 = (((com.moon.ng)(this)).b() + 0x1.2p2f);
    life8_18 = (((com.moon.ng)(this)).c() - 0x1.0p4f);
    spill1111_0 = __sourceExactCall_f9767dd554d5b6();
    life9_37 = ((((com.moon.setting.IntegerSetting)(this.n)).getSliderValue() - ((float) ((com.moon.setting.IntegerSetting)(this.n)).getMin())) / ((float) (((com.moon.setting.IntegerSetting)(this.n)).getMax() - ((com.moon.setting.IntegerSetting)(this.n)).getMin())));
    life5_38 = spill1111_0;
    life10_43 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life11_48 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life12_55 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life10_43))))).a();
    ((com.moon.hW)(life11_48)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 - 0x1.0p-1f))), ((float)(((life7_13 + 0x1.cp1f) + ((com.moon.jm)(life10_43)).a(((float)(0x1.cp2f)))))), ((float)((life8_18 + 0x1.0p0f))), ((float)(0x1.8p1f)), ((float)(0x1.8p-1f)), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic1111_27(28006, (4211076657064915086L ^ life3_3))))))));
    ((com.moon.hW)(life11_48)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 - 0x1.0p-1f))), ((float)(((life7_13 + 0x1.cp1f) + ((com.moon.jm)(life10_43)).a(((float)(0x1.cp2f)))))), ((float)(((life8_18 + 0x1.0p0f) * life9_37))), ((float)(0x1.8p1f)), ((float)(0x1.8p-1f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.ng)(this)).a__lS())).a__kX())).getValue())))).intValue()))))));
    ((com.moon.jm)(life10_43)).b(((com.moon.hW)(life12_55)), ((java.lang.String)(((com.moon.setting.IntegerSetting)(this.n)).getDisplayName())), ((float)(0x1.cp2f)), ((float)(life6_8)), ((float)(life7_13)), ((int)(-1)));
    ((com.moon.ng)(this)).a(((float)(((life6_8 + ((com.moon.jm)(life10_43)).a(((java.lang.String)(((com.moon.setting.IntegerSetting)(this.n)).getDisplayName())), ((float)(0x1.cp2f)))) + 0x1.0p2f))), ((float)((life7_13 + 0x1.0p-1f))), ((int)(p0)), ((int)(p1)));
    spill1111_1 = this;
    if (!((life5_38 != null))) {
        forwardValue1111_144_0 = spill1111_1;
        break forward_join_144;
    }
    if (!(((com.moon.ng)(spill1111_1)).p)) {
        break forward_join_141;
    }
    forwardValue1111_146_0 = __sourceIntrinsic_505b8c2844d4_invokedynamic1111_47(this.o);
    break forward_join_146;
    }
    forwardValue1111_144_0 = ((com.moon.setting.IntegerSetting)(this.n)).getValue();
    }
    forwardValue1111_146_0 = ((java.lang.Integer)(((java.lang.Integer)(forwardValue1111_144_0)))).toString();
    }
    life13_151 = forwardValue1111_146_0;
    ((com.moon.jm)(life10_43)).b(((com.moon.hW)(life12_55)), ((java.lang.String)(life13_151)), ((float)(0x1.cp2f)), ((float)(((life6_8 + life8_18) - ((com.moon.jm)(life10_43)).a(((java.lang.String)(life13_151)), ((float)(0x1.cp2f)))))), ((float)(life7_13)), ((int)(-1)));
    ((com.moon.hW)(life11_48)).b();
    ((com.moon.hW)(life12_55)).b();
    spill1111_2 = this;
    if (!((life5_38 != null))) {
        forwardValue1111_206_0 = spill1111_2;
        break forward_join_206;
    }
    if (!(((com.moon.ng)(spill1111_2)).q)) {
        break forward_join_205;
    }
    life14_199 = ((((((float) p0) - life6_8) * ((float) (((com.moon.setting.IntegerSetting)(this.n)).getMax() - ((com.moon.setting.IntegerSetting)(this.n)).getMin()))) / life8_18) + ((float) ((com.moon.setting.IntegerSetting)(this.n)).getMin()));
    ((com.moon.setting.IntegerSetting)(this.n)).setValueFromSlider(((float)(moom.Dr.a(((float)(life14_199)), ((float)(((float) ((com.moon.setting.IntegerSetting)(this.n)).getMin()))), ((float)(((float) ((com.moon.setting.IntegerSetting)(this.n)).getMax())))))));
    }
    forwardValue1111_206_0 = this;
    }
    __sourceIntrinsic_505b8c2844d4_call1111_70(forwardValue1111_206_0, p0, p1);
    if (!((life5_38 == null))) {
        break forward_join_214;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


private void d__sourceReturn_da8c82d5d4() { __sourceHandlerCall_a9f070ab4d33b7c1cdad(this); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19709;
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
            throw new RuntimeException("com/moon/ng", var14);
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
    int local7 = __sourceExactCall_a04793abdc50bb(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3003_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ng"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, int p2) {
int forwardValue1110_82_0;
    com.moon.ng forwardValue1110_101_0;
    int forwardValue1110_101_1;
    int[] spill1110_0;
    boolean spill1110_1;
    int spill1110_2;
    com.moon.ng spill1110_3;
    int spill1110_4;
    long life4_3;
    float life7_8;
    float life8_14;
    int[] life6_15;
    float life9_20;
    com.moon.jm life10_25;
    forward_join_102: {
    forward_join_101: {
    forward_join_97: {
    forward_join_82: {
    forward_join_50: {
    life4_3 = (com.moon.ng.r ^ 111309697035606L);
    life7_8 = (((com.moon.ng)(this)).a() + 0x1.0p3f);
    spill1110_0 = __sourceExactCall_f9767dd554d5b6();
    life8_14 = (((com.moon.ng)(this)).b() + 0x1.2p2f);
    life6_15 = spill1110_0;
    life9_20 = (((com.moon.ng)(this)).c() - 0x1.0p4f);
    life10_25 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    spill1110_1 = ((com.moon.ng)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life7_8)), ((float)(((life8_14 + 0x1.8p1f) + ((com.moon.jm)(life10_25)).a(((float)(0x1.cp2f)))))), ((float)(life9_20)), ((float)(0x1.cp2f)));
    if (!((life6_15 != null))) {
        forwardValue1110_82_0 = ((spill1110_1) ? 1 : 0);
        break forward_join_82;
    }
    if (!(spill1110_1)) {
        break forward_join_50;
    }
    spill1110_2 = p2;
    if (!((life6_15 != null))) {
        forwardValue1110_82_0 = spill1110_2;
        break forward_join_82;
    }
    if (!((spill1110_2 == 0))) {
        break forward_join_50;
    }
    this.q = ((boolean)(true));
    }
    spill1110_3 = this;
    spill1110_4 = p0;
    if (!((life6_15 != null))) {
        forwardValue1110_101_0 = spill1110_3;
        forwardValue1110_101_1 = spill1110_4;
        break forward_join_101;
    }
    forwardValue1110_82_0 = ((((com.moon.ng)(spill1110_3)).a(((int)(spill1110_4)), ((int)(p1)), ((float)(((life7_8 + life9_20) - ((com.moon.jm)(life10_25)).a(((java.lang.String)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.n)).getValue())))).toString())), ((float)(0x1.cp2f)))))), ((float)((life8_14 + 0x1.8p0f))), ((float)(((com.moon.jm)(life10_25)).a(((java.lang.String)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.n)).getValue())))).toString())), ((float)(0x1.cp2f))))), ((float)(((com.moon.jm)(life10_25)).a(((float)(0x1.cp2f))))))) ? 1 : 0);
    }
    if (!((forwardValue1110_82_0 != 0))) {
        break forward_join_97;
    }
    if (!((p2 == 0))) {
        break forward_join_97;
    }
    this.o = ((java.lang.String)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.n)).getValue())))).toString()));
    this.p = ((boolean)(true));
    if (!((life6_15 == null))) {
        break forward_join_102;
    }
    }
    ((com.moon.ng)(this)).d__sourceReturn_da8c82d5d4();
    forwardValue1110_101_0 = this;
    forwardValue1110_101_1 = 0;
    }
    ((com.moon.ng)(forwardValue1110_101_0)).p = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1110_101_1)));
    }
    super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void a(char p0, int p1) {
int forwardValue1109_26_0;
    com.moon.ng forwardValue1109_56_0;
    int spill1109_0;
    com.moon.ng spill1109_1;
    long life3_3;
    int[] life5_5;
    forward_join_56: {
    forward_join_55: {
    forward_join_49: {
    forward_join_26: {
    forward_join_22: {
    life3_3 = (com.moon.ng.r ^ 15562008716142L);
    life5_5 = __sourceExactCall_f9767dd554d5b6();
    spill1109_0 = p1;
    if (!((life5_5 != null))) {
        forwardValue1109_26_0 = spill1109_0;
        break forward_join_26;
    }
    if (!((spill1109_0 == __sourceIntrinsic_f7d59ba1def0_invokedynamic1109_2(30142, (8493514450656800306L ^ life3_3))))) {
        break forward_join_22;
    }
    ((com.moon.ng)(this)).d__sourceReturn_da8c82d5d4();
    this.p = ((boolean)(false));
    if (!((life5_5 == null))) {
        break forward_join_55;
    }
    }
    spill1109_1 = this;
    if (!((life5_5 != null))) {
        forwardValue1109_56_0 = spill1109_1;
        break forward_join_56;
    }
    forwardValue1109_26_0 = ((((com.moon.ng)(spill1109_1)).p) ? 1 : 0);
    }
    if (!((forwardValue1109_26_0 != 0))) {
        break forward_join_55;
    }
    if (!((p1 == __sourceIntrinsic_f7d59ba1def0_invokedynamic1109_7(25974, (3806884163050716921L ^ life3_3))))) {
        break forward_join_49;
    }
    this.o = ((java.lang.String)(((java.lang.String)(this.o)).substring(((int)(0)), ((int)(java.lang.Math.max(((int)((((java.lang.String)(this.o)).length() - 1))), ((int)(0))))))));
    if (!((life5_5 == null))) {
        break forward_join_55;
    }
    }
    com.moon.ng __stackOp1109_14_0 = this;
    ((com.moon.ng)(__stackOp1109_14_0)).o = ((java.lang.String)(__sourceIntrinsic_f7d59ba1def0_invokedynamic1109_16(((com.moon.ng)(__stackOp1109_14_0)).o, p0)));
    }
    forwardValue1109_56_0 = this;
    }
    __sourceIntrinsic_f7d59ba1def0_call1109_18(forwardValue1109_56_0, p0, p1);
    return;
}


public com.moon.setting.Setting a__sourceReturn_7d3c444d39() {
return this.n;
}


public void a(int p0, int p1) {
float local3 = (((com.moon.ng)(this)).a() + 0x1.0p3f);
    float local4 = (((com.moon.ng)(this)).b() + 0x1.2p2f);
    float local5 = (((com.moon.ng)(this)).c() - 0x1.0p4f);
    float local6 = ((((com.moon.setting.IntegerSetting)(this.n)).getSliderValue() - ((float) ((com.moon.setting.IntegerSetting)(this.n)).getMin())) / ((float) (((com.moon.setting.IntegerSetting)(this.n)).getMax() - ((com.moon.setting.IntegerSetting)(this.n)).getMin())));
    com.moon.hW local7 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    float local8 = moom.Dr.a(((float)(((local3 + ((local5 + 0x1.0p0f) * local6)) - 0x1.0p2f))), ((float)((local3 - 0x1.0p-1f))), ((float)(((local3 + local5) - 0x1.ep2f))));
    ((com.moon.hW)(local7)).a(((com.moon.iX)(com.moon.i3.a(((float)(local8)), ((float)((local4 + 0x1.3p3f))), ((float)(0x1.0p3f)), ((float)(0x1.0p3f)), ((float)(0x1.8p1f)), ((int)(__sourceExactCall_cd88b7748cd09e(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))).a(((float)(0x1.8p-1f))))))))))));
    ((com.moon.hW)(local7)).b();
    super.a(((int)(p0)), ((int)(p1)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_f7d59ba1def0_invokedynamic1109_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7d59ba1def0_invokedynamic1109_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f7d59ba1def0_invokedynamic1109_16(java.lang.String a0, char a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_f7d59ba1def0_call1109_18(com.moon.ng a0, char a1, int a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3003_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic1111_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_505b8c2844d4_invokedynamic1111_47(java.lang.String a0) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_505b8c2844d4_call1111_70(com.moon.ng a0, int a1, int a2) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int[] __sourceExactCall_f9767dd554d5b6();
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
private static native int __sourceExactCall_a04793abdc50bb(int p0, long p1);

private static native int __sourceExactCall_cd88b7748cd09e(com.moon.aO p0);
}
