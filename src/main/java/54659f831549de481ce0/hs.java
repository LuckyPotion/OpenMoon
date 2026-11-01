package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hs implements com.moon.hn {

private com.moon.module.impl.HUD b;

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map j;

public hs() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(7907826285543320040L)), ((long)(-166259289141239456L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(280355599845563L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.hs.c ^ 117625524935846L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill144_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill144_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill144_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill144_14 = new byte[8];
    (__sourceSpill144_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill144_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation144_16 = __sourceSpill144_14;
    ((javax.crypto.Cipher)(__sourceSpill144_11)).init(((int)(__sourceSpill144_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill144_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation144_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[5];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "úVQÿÓ\030I\003b4¿\0313ò¤º4ß\r\026û\006ÛÝî\036\016\006g¬gì\t­t_^\nÉ'v\006XóÕjÓáIaW\tÎV»=úàÏ¤\032 !]T\032)·\r\006´i\tªX\022\004Hþ¼H¶¯\000¾&\036«Ö=\020 \034ñ\035bë½ \n,O\024ûÄ"))).length();
    int local16_life24 = 72;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill144_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill144_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill144_29)).doFinal(((byte[])(__sourceSpill144_28)));
        java.lang.String __sourceSpill144_34 = ((java.lang.String)(com.moon.hs.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill144_35 = local20_life19;
        int __sourceSpill144_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill144_35)[__sourceSpill144_36] = __sourceSpill144_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "óÍ~lO.\"ÉÄ=iÞàë/¡@!Õ½\0303SÛëQR¸ÊÉ\"CåFe\004ÙM\003É\027ðØ("))).length();
    local16_life24 = 24;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill144_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill144_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill144_42)).doFinal(((byte[])(__sourceSpill144_41)));
        java.lang.String __sourceSpill144_47 = ((java.lang.String)(com.moon.hs.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill144_48 = local20_life19;
        int __sourceSpill144_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill144_48)[__sourceSpill144_49] = __sourceSpill144_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    d = ((java.lang.String[])(local20_life19));
    e = ((java.lang.String[])(new java.lang.String[5]));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill144_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill144_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill144_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill144_60 = new byte[8];
    (__sourceSpill144_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill144_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation144_62 = __sourceSpill144_60;
    ((javax.crypto.Cipher)(__sourceSpill144_57)).init(((int)(__sourceSpill144_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill144_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation144_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[3];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "0ü¯\030D&6\036pqs½s\002´Y^\024j "))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill144_71 = local4_life67;
        int __sourceSpill144_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill144_71)).substring(((int)(__sourceSpill144_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill144_76 = local6_life65;
        int __sourceSpill144_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill144_79 = new byte[8];
        (__sourceSpill144_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill144_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill144_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill144_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill144_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill144_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill144_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill144_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill144_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill144_80)).doFinal(((byte[])(__sourceSpill144_79)));
        (__sourceSpill144_76)[__sourceSpill144_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    g = ((long[])(local6_life65));
    h = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void b() {
com.moon.hs forwardValue378_12_0;
    com.moon.hs spill378_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.hs.c ^ 67282624483304L);
    life3_5 = com.moon.hq.b__ArrayString();
    spill378_0 = this;
    if (!((life3_5 == null))) {
        forwardValue378_12_0 = spill378_0;
        break forward_join_12;
    }
    if (!((((com.moon.hs)(spill378_0)).b == null))) {
        break forward_join_18;
    }
    forwardValue378_12_0 = this;
    }
    ((com.moon.hs)(forwardValue378_12_0)).b = ((com.moon.module.impl.HUD)(((com.moon.module.impl.HUD)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.HUD.class)))))));
    }
    return;
}


private java.lang.String[] b__ArrayString() {
long life1_3;
    java.lang.String life3_5;
    life1_3 = (com.moon.hs.c ^ 35660687845981L);
    life3_5 = "";
    if (((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.b)).j())).getValue())))).booleanValue()) {
        java.lang.String spill379_0 = life3_5;
        java.lang.String __stackOp379_12_0 = ((java.lang.String)(__sourceIntrinsic_b33388dd40f1_invokedynamic379_6(10146, (4960911746145233714L ^ life1_3)))).substring(((int)(0)), ((int)(__sourceIntrinsic_b33388dd40f1_invokedynamic379_7(31046, (5419910717190400560L ^ life1_3)))));
        java.lang.String __stackOp379_12_1 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__String();
        java.lang.String __stackOp379_12_2 = __sourceIntrinsic_b33388dd40f1_invokedynamic379_11(982, (347086459654115141L ^ life1_3));
        java.lang.String spill379_1 = __stackOp379_12_2;
        java.lang.String spill379_2 = __stackOp379_12_0;
        java.lang.String spill379_3 = __stackOp379_12_1;
        recovery.source.CarrierOps.discard(__stackOp379_12_2);
        java.lang.String __stackOp379_15_0 = spill379_3;
        java.lang.String __stackOp379_15_1 = __sourceIntrinsic_b33388dd40f1_invokedynamic379_14(5244, (8222163141689153774L ^ life1_3));
        life3_5 = __sourceIntrinsic_b33388dd40f1_invokedynamic379_16(spill379_0, spill379_1, spill379_2, __stackOp379_15_1, __stackOp379_15_0);
    }
    return ((java.lang.String)(life3_5)).split(((java.lang.String)("\n")));
}


public void b(com.moon.hW p0) {
return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral1502_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hs"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.hs.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28599;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/hs", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


public void c(com.moon.hW p0) {
return;
}


public void d(com.moon.hW p0) {
int lexicalValue78_21_0;
    java.lang.Object lexicalValue78_29_0;
    java.lang.String[] spill78_0;
    boolean spill78_1;
    java.lang.Boolean spill78_2;
    long life2_3;
    java.lang.String[] life4_7;
    com.moon.jm life5_42;
    moom.ir life6_44;
    java.lang.String[] life7_57;
    java.lang.String[] life8_60;
    float life9_62;
    float life10_74;
    java.lang.String[] life11_76;
    int life12_79;
    int life13_81;
    java.lang.String life14_88;
    int life13_150;
    java.lang.String life14_157;
    lexical_join_208: {
    lexical_join_206: {
    lexical_join_134: {
    lexical_join_127: {
    lexical_join_29: {
    lexical_join_21: {
    life2_3 = (com.moon.hs.c ^ 41776178423303L);
    spill78_0 = com.moon.hq.b__ArrayString();
    this.b();
    life4_7 = spill78_0;
    spill78_1 = ((com.moon.hs)(this)).a__Boolean();
    if (!((life4_7 == null))) {
        lexicalValue78_21_0 = ((spill78_1) ? 1 : 0);
        break lexical_join_21;
    }
    if (!(spill78_1)) {
        break lexical_join_208;
    }
    spill78_2 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.b)).k())).getValue()));
    if (!((life4_7 == null))) {
        lexicalValue78_29_0 = spill78_2;
        break lexical_join_29;
    }
    lexicalValue78_21_0 = ((((java.lang.Boolean)(spill78_2)).booleanValue()) ? 1 : 0);
    }
    if (!((lexicalValue78_21_0 != 0))) {
        break lexical_join_208;
    }
    lexicalValue78_29_0 = ((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.b)).i__kY())).getValue())))).a__Supplier())).get();
    }
    life5_42 = ((com.moon.jm)(lexicalValue78_29_0));
    life6_44 = com.moon.nS.a();
    ((moom.ir)(life6_44)).a(((float)((0x1.0p0f / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.b)).e__kZ())).getValue())))).floatValue()))));
    life7_57 = ((com.moon.hs)(this)).a__ArrayString();
    life8_60 = ((com.moon.hs)(this)).b__ArrayString();
    life9_62 = 0x0.0p0f;
    life10_74 = (((float) ((moom.ir)(life6_44)).b__Int()) - ((com.moon.hs)(this)).a(((int)(__sourceIntrinsic_f0efb0c1e576_invokedynamic78_28(30845, (2013631864334919507L ^ life2_3))))));
    life11_76 = life7_57;
    life12_79 = (life11_76).length;
    life13_81 = 0;
    lexical_cycle_70: while (true) {
    if (!((life13_81 < life12_79))) {
        break lexical_join_127;
    }
    life14_88 = (life11_76)[life13_81];
    ((com.moon.jm)(life5_42)).a(((com.moon.hW)(((com.moon.module.impl.HUD)(this.b)).e())), ((java.lang.String)(life14_88)), ((float)(0x1.2p3f)), ((float)(0x1.0p1f)), ((float)(((life10_74 - 0x1.0p0f) - life9_62))), ((int)(((com.moon.hs)(this)).a(((float)(0x0.0p0f)), ((com.moon.module.impl.HUD)(this.b)), ((com.moon.b0)(((com.moon.b0)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.b)).c__kY())).getValue())))), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.b)).c__kX())).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.b)).d__kX())).getValue())))).intValue()))))));
    life9_62 = (life9_62 + ((com.moon.hs)(this)).a(((int)(__sourceIntrinsic_f0efb0c1e576_invokedynamic78_49(30845, (2013631864334919507L ^ life2_3))))));
    life13_81 += 1;
    if (!((life4_7 == null))) {
        break lexical_join_134;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_70; }
    break lexical_cycle_70;
    }
    }
    life9_62 = 0x0.0p0f;
    life11_76 = life8_60;
    life12_79 = (life11_76).length;
    }
    life13_150 = 0;
    lexical_cycle_136: while (true) {
    if (!((life13_150 < life12_79))) {
        break lexical_join_206;
    }
    life14_157 = (life11_76)[life13_150];
    ((com.moon.jm)(life5_42)).a(((com.moon.hW)(((com.moon.module.impl.HUD)(this.b)).e())), ((java.lang.String)(life14_157)), ((float)(0x1.2p3f)), ((float)(((((float) ((moom.ir)(life6_44)).a__Int()) - ((com.moon.hs)(this)).a(((java.lang.String)(life14_157)), ((int)(__sourceIntrinsic_f0efb0c1e576_invokedynamic78_54(30845, (2013631864334919507L ^ life2_3)))))) - 0x1.0p1f))), ((float)(((life10_74 - 0x1.0p0f) - life9_62))), ((int)(((com.moon.hs)(this)).a(((float)(0x0.0p0f)), ((com.moon.module.impl.HUD)(this.b)), ((com.moon.b0)(((com.moon.b0)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.b)).c__kY())).getValue())))), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.b)).c__kX())).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.b)).d__kX())).getValue())))).intValue()))))));
    life9_62 = (life9_62 + ((com.moon.hs)(this)).a(((int)(__sourceIntrinsic_f0efb0c1e576_invokedynamic78_73(30845, (2013631864334919507L ^ life2_3))))));
    life13_150 += 1;
    if (!((life4_7 == null))) {
        break lexical_join_208;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_136; }
    break lexical_cycle_136;
    }
    }
    ((moom.ir)(life6_44)).a__Void();
    }
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.hs.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 28753);
    if (((com.moon.hs.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.hs.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hs.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/hs", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.hs.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.hs.e)[life5_8] = com.moon.hs.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.hs.e)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1505_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hs"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.hW p0) {
return;
}


private float a(int p0) {
int forwardValue373_32_0;
    boolean spill373_0;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.jm life5_26;
    forward_join_32: {
    forward_join_29: {
    life2_3 = (com.moon.hs.c ^ 108314675876950L);
    life4_5 = com.moon.hq.b__ArrayString();
    spill373_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.b)).k())).getValue())))).booleanValue();
    if (!((life4_5 == null))) {
        forwardValue373_32_0 = ((spill373_0) ? 1 : 0);
        break forward_join_32;
    }
    if (!(spill373_0)) {
        break forward_join_29;
    }
    life5_26 = ((com.moon.jm)(((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.b)).i__kY())).getValue())))).a__Supplier())).get()));
    return ((com.moon.jm)(life5_26)).a(((float)(((float) p0))));
    }
    forwardValue373_32_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hs.a)).N)).c;
    }
    return ((float) forwardValue373_32_0);
}


private float a(java.lang.String p0, int p1) {
int forwardValue374_34_0;
    boolean spill374_0;
    long life3_3;
    java.lang.String[] life5_5;
    com.moon.jm life6_26;
    forward_join_34: {
    forward_join_30: {
    life3_3 = (com.moon.hs.c ^ 69171279033749L);
    life5_5 = com.moon.hq.b__ArrayString();
    spill374_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.b)).k())).getValue())))).booleanValue();
    if (!((life5_5 == null))) {
        forwardValue374_34_0 = ((spill374_0) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill374_0)) {
        break forward_join_30;
    }
    life6_26 = ((com.moon.jm)(((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.b)).i__kY())).getValue())))).a__Supplier())).get()));
    return ((com.moon.jm)(life6_26)).a(((java.lang.String)(p0)), ((float)(((float) p1))));
    }
    forwardValue374_34_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hs.a)).N)).a(((java.lang.String)(p0)));
    }
    return ((float) forwardValue374_34_0);
}


private boolean a__Boolean() {
int forwardValue376_36_0;
    int forwardValue376_40_0;
    int forwardValue376_42_0;
    boolean spill376_0;
    boolean spill376_1;
    boolean spill376_2;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_36: {
    forward_join_33: {
    life1_3 = (com.moon.hs.c ^ 15227158681055L);
    life3_5 = com.moon.hq.b__ArrayString();
    spill376_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.b)).h__kV())).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue376_36_0 = ((spill376_0) ? 1 : 0);
        break forward_join_36;
    }
    if (!((!spill376_0))) {
        break forward_join_33;
    }
    spill376_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.b)).i__kV())).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue376_36_0 = ((spill376_1) ? 1 : 0);
        break forward_join_36;
    }
    if (!((!spill376_1))) {
        break forward_join_33;
    }
    spill376_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.b)).j())).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue376_36_0 = ((spill376_2) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill376_2)) {
        break forward_join_41;
    }
    }
    forwardValue376_36_0 = ((((net.minecraft.client.Minecraft)(com.moon.hs.a)).P instanceof moom.gF) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue376_40_0 = forwardValue376_36_0;
        break forward_join_40;
    }
    if (!((forwardValue376_36_0 == 0))) {
        break forward_join_41;
    }
    forwardValue376_40_0 = 1;
    }
    forwardValue376_42_0 = forwardValue376_40_0;
    break forward_join_42;
    }
    forwardValue376_42_0 = 0;
    }
    return ((forwardValue376_42_0) != 0);
}


private java.lang.String[] a__ArrayString() {
int forestValue62_34_0;
    int forestValue62_59_0;
    java.lang.String[] spill62_0;
    boolean spill62_1;
    java.lang.String spill62_2;
    java.lang.String spill62_3;
    java.lang.String spill62_4;
    double spill62_5;
    long life1_3;
    java.lang.String life4_6;
    java.lang.String[] life3_7;
    forest_join_60: {
    forest_join_59: {
    forest_join_53: {
    forest_join_34: {
    forest_join_28: {
    life1_3 = (com.moon.hs.c ^ 111361525486592L);
    spill62_0 = com.moon.hq.b__ArrayString();
    life4_6 = "";
    life3_7 = spill62_0;
    spill62_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.b)).h__kV())).getValue())))).booleanValue();
    if (!((life3_7 == null))) {
        forestValue62_34_0 = ((spill62_1) ? 1 : 0);
        break forest_join_34;
    }
    if (!(spill62_1)) {
        break forest_join_28;
    }
    spill62_2 = life4_6;
    int __stackOp62_10_0 = net.minecraft.client.Minecraft.b();
    java.lang.String __stackOp62_10_1 = __sourceIntrinsic_b40ddfd35a1d_invokedynamic62_9(13937, (3377271732548633784L ^ life1_3));
    life4_6 = __sourceIntrinsic_b40ddfd35a1d_invokedynamic62_11(spill62_2, __stackOp62_10_1, __stackOp62_10_0, "\n");
    }
    forestValue62_34_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.b)).i__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_7 == null))) {
        forestValue62_59_0 = forestValue62_34_0;
        break forest_join_59;
    }
    if (!((forestValue62_34_0 != 0))) {
        break forest_join_53;
    }
    spill62_3 = life4_6;
    double __stackOp62_23_0 = com.moon.nI.a(((double)(((double) ((com.moon.nN)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__nN())).a()))), ((int)(2)));
    java.lang.String __stackOp62_23_1 = __sourceIntrinsic_b40ddfd35a1d_invokedynamic62_22(3756, (7817115218026052704L ^ life1_3));
    spill62_4 = __stackOp62_23_1;
    spill62_5 = __stackOp62_23_0;
    recovery.source.CarrierOps.discard(__stackOp62_23_1);
    life4_6 = __sourceIntrinsic_b40ddfd35a1d_invokedynamic62_25(spill62_3, spill62_4, spill62_5);
    }
    forestValue62_59_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.b)).i__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue62_59_0 != 0))) {
        break forest_join_60;
    }
    }
    return ((java.lang.String)(life4_6)).split(((java.lang.String)("\n")));
}


public void a__Void() {
int lexicalValue77_19_0;
    java.lang.String[] spill77_0;
    boolean spill77_1;
    long life1_3;
    java.lang.String[] life3_7;
    moom.ir life4_27;
    java.lang.String[] life5_40;
    java.lang.String[] life6_43;
    float life7_45;
    float life8_57;
    java.lang.String[] life9_59;
    int life10_62;
    int life11_64;
    java.lang.String life12_71;
    int life11_133;
    java.lang.String life12_140;
    lexical_join_195: {
    lexical_join_193: {
    lexical_join_123: {
    lexical_join_116: {
    lexical_join_19: {
    life1_3 = (com.moon.hs.c ^ 60080956836744L);
    spill77_0 = com.moon.hq.b__ArrayString();
    this.b();
    life3_7 = spill77_0;
    spill77_1 = ((com.moon.hs)(this)).a__Boolean();
    if (!((life3_7 == null))) {
        lexicalValue77_19_0 = ((spill77_1) ? 1 : 0);
        break lexical_join_19;
    }
    if (!(spill77_1)) {
        break lexical_join_195;
    }
    lexicalValue77_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.b)).k())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((lexicalValue77_19_0 == 0))) {
        break lexical_join_195;
    }
    life4_27 = com.moon.nS.a();
    ((moom.ir)(life4_27)).a(((float)((0x1.0p0f / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.b)).e__kZ())).getValue())))).floatValue()))));
    life5_40 = ((com.moon.hs)(this)).a__ArrayString();
    life6_43 = ((com.moon.hs)(this)).b__ArrayString();
    life7_45 = 0x0.0p0f;
    life8_57 = (((float) ((moom.ir)(life4_27)).b__Int()) - ((com.moon.hs)(this)).a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic77_21(31285, (2138339970633156759L ^ life1_3))))));
    life9_59 = life5_40;
    life10_62 = (life9_59).length;
    life11_64 = 0;
    lexical_cycle_59: while (true) {
    if (!((life11_64 < life10_62))) {
        break lexical_join_116;
    }
    life12_71 = (life9_59)[life11_64];
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hs.a)).N)).a(((java.lang.String)(life12_71)), ((float)(0x1.0p1f)), ((float)(((life8_57 - 0x1.0p0f) - life7_45))), ((int)(((com.moon.hs)(this)).a(((float)(0x0.0p0f)), ((com.moon.module.impl.HUD)(this.b)), ((com.moon.b0)(((com.moon.b0)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.b)).c__kY())).getValue())))), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.b)).c__kX())).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.b)).d__kX())).getValue())))).intValue()))))));
    life7_45 = (life7_45 + (((com.moon.hs)(this)).a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic77_42(30845, (2013611344762653404L ^ life1_3))))) + 0x1.0p0f));
    life11_64 += 1;
    if (!((life3_7 == null))) {
        break lexical_join_123;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_59; }
    break lexical_cycle_59;
    }
    }
    life7_45 = 0x0.0p0f;
    life9_59 = life6_43;
    life10_62 = (life9_59).length;
    }
    life11_133 = 0;
    lexical_cycle_125: while (true) {
    if (!((life11_133 < life10_62))) {
        break lexical_join_193;
    }
    life12_140 = (life9_59)[life11_133];
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hs.a)).N)).a(((java.lang.String)(life12_140)), ((float)(((((float) ((moom.ir)(life4_27)).a__Int()) - ((com.moon.hs)(this)).a(((java.lang.String)(life12_140)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic77_47(30845, (2013611344762653404L ^ life1_3)))))) - 0x1.0p1f))), ((float)(((life8_57 - 0x1.0p0f) - life7_45))), ((int)(((com.moon.hs)(this)).a(((float)(0x0.0p0f)), ((com.moon.module.impl.HUD)(this.b)), ((com.moon.b0)(((com.moon.b0)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.b)).c__kY())).getValue())))), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.b)).c__kX())).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.b)).d__kX())).getValue())))).intValue()))))));
    life7_45 = (life7_45 + ((com.moon.hs)(this)).a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic77_66(30845, (2013611344762653404L ^ life1_3))))));
    life11_133 += 1;
    if (!((life3_7 == null))) {
        break lexical_join_195;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_125; }
    break lexical_cycle_125;
    }
    }
    ((moom.ir)(life4_27)).a__Void();
    }
    return;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill548_0 = p0;
        life4_9 += 1;
        life5_44 = (spill548_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill548_1 = p0;
        life4_9 += 1;
        life5_76 = (spill548_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill548_2 = p0;
        life4_9 += 1;
        life5_91 = (spill548_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1505_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b40ddfd35a1d_invokedynamic62_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b40ddfd35a1d_invokedynamic62_11(java.lang.String a0, java.lang.String a1, int a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b40ddfd35a1d_invokedynamic62_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b40ddfd35a1d_invokedynamic62_25(java.lang.String a0, java.lang.String a1, double a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic77_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic77_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic77_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic77_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_invokedynamic379_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_invokedynamic379_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_invokedynamic379_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_invokedynamic379_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_invokedynamic379_16(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral1502_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic78_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic78_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic78_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic78_73(int a0, long a1) throws E;
}
