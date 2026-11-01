package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class g0 extends com.moon.gZ {

private com.moon.hW c;

private com.moon.hW d;

private com.moon.module.impl.KillAura e;

private com.moon.module.impl.StorageEsp f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public g0(com.moon.module.impl.ESP p0, com.moon.module.impl.StorageEsp p1) {
super(p0);
    this.f = p1;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-5965091847095165151L)), ((long)(3449600408386604028L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(279236191925262L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.g0.g ^ 88854155488836L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill104_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill104_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill104_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill104_14 = new byte[8];
    (__sourceSpill104_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill104_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation104_16 = __sourceSpill104_14;
    ((javax.crypto.Cipher)(__sourceSpill104_11)).init(((int)(__sourceSpill104_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill104_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation104_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ìg`7ËÆH5MÛºNÌ\026g{`Å·¦"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill104_25 = local6_life21;
        int __sourceSpill104_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill104_25)).substring(((int)(__sourceSpill104_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill104_30 = local8_life19;
        int __sourceSpill104_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill104_33 = new byte[8];
        (__sourceSpill104_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill104_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill104_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill104_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill104_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill104_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill104_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill104_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill104_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill104_34)).doFinal(((byte[])(__sourceSpill104_33)));
        (__sourceSpill104_30)[__sourceSpill104_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1175_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/g0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22922;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
            throw new RuntimeException("com/moon/g0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.g0.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b__Void() {
com.moon.g0 forwardValue209_32_0;
    net.minecraft.entity.Entity[] spill209_0;
    com.moon.g0 spill209_1;
    com.moon.g0 spill209_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_12;
    forward_join_43: {
    forward_join_38: {
    forward_join_32: {
    forward_join_31: {
    life1_3 = (com.moon.g0.g ^ 93171695985098L);
    spill209_0 = __sourceExactCall_ea897610666eaa();
    this.c = ((com.moon.hW)(((com.moon.g0)(this)).a(((com.moon.hW)(this.c)), ((boolean)(false)))));
    life3_12 = spill209_0;
    spill209_1 = this;
    if (!((life3_12 != null))) {
        forwardValue209_32_0 = spill209_1;
        break forward_join_32;
    }
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g0)(spill209_1)).a())).u())).getValue())))).booleanValue()))) {
        break forward_join_31;
    }
    spill209_2 = this;
    if (!((life3_12 != null))) {
        forwardValue209_32_0 = spill209_2;
        break forward_join_32;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(((com.moon.g0)(spill209_2)).f)).i())).getValue())))).booleanValue())) {
        break forward_join_38;
    }
    }
    forwardValue209_32_0 = this;
    }
    ((com.moon.g0)(forwardValue209_32_0)).d = ((com.moon.hW)(((com.moon.g0)(this)).a(((com.moon.hW)(this.d)), ((boolean)(true)))));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_43;
    }
    __sourceExactCall_aea6825a3115d6(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
    return;
}


public void c__Void() {
return;
}


private void d() {
com.moon.g0 forwardValue210_12_0;
    com.moon.g0 spill210_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.g0.g ^ 131533602249959L);
    life3_5 = __sourceExactCall_ea897610666eaa();
    spill210_0 = this;
    if (!((life3_5 != null))) {
        forwardValue210_12_0 = spill210_0;
        break forward_join_12;
    }
    if (!((((com.moon.g0)(spill210_0)).e == null))) {
        break forward_join_18;
    }
    forwardValue210_12_0 = this;
    }
    ((com.moon.g0)(forwardValue210_12_0)).e = ((com.moon.module.impl.KillAura)(((com.moon.module.impl.KillAura)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.KillAura.class)))))));
    }
    return;
}


private com.moon.hW a(com.moon.hW p0, boolean p1) {
com.moon.hW lexicalValue38_13_0;
    com.moon.hX lexicalValue38_21_0;
    int lexicalValue38_21_1;
    com.moon.hX lexicalValue38_22_0;
    com.moon.hX lexicalValue38_27_0;
    int lexicalValue38_27_1;
    int lexicalValue38_60_0;
    int lexicalValue38_87_0;
    int lexicalValue38_92_0;
    net.minecraft.tileentity.TileEntity lexicalValue38_146_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue38_161_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue38_170_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue38_179_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue38_184_0;
    com.moon.hW lexicalValue38_230_0;
    moom.CA lexicalValue38_230_1;
    com.moon.aO lexicalValue38_230_2;
    com.moon.hW lexicalValue38_236_0;
    moom.CA lexicalValue38_236_1;
    com.moon.aO lexicalValue38_236_2;
    float lexicalValue38_236_3;
    int lexicalValue38_245_0;
    int lexicalValue38_254_0;
    int lexicalValue38_258_0;
    int lexicalValue38_267_0;
    com.moon.aO lexicalValue38_281_0;
    com.moon.aO lexicalValue38_287_0;
    float lexicalValue38_287_1;
    com.moon.aO lexicalValue38_302_0;
    com.moon.aO lexicalValue38_308_0;
    float lexicalValue38_308_1;
    int lexicalValue38_330_0;
    com.moon.hW lexicalValue38_480_0;
    moom.CA lexicalValue38_480_1;
    com.moon.module.impl.KillAura lexicalValue38_480_2;
    com.moon.hW lexicalValue38_486_0;
    moom.CA lexicalValue38_486_1;
    com.moon.hW lexicalValue38_487_0;
    moom.CA lexicalValue38_487_1;
    com.moon.aO lexicalValue38_487_2;
    net.minecraft.entity.Entity[] spill38_0;
    com.moon.hW spill38_1;
    com.moon.hX spill38_2;
    boolean spill38_3;
    boolean spill38_4;
    boolean spill38_5;
    boolean spill38_6;
    boolean spill38_7;
    net.minecraft.tileentity.TileEntity spill38_8;
    net.minecraft.tileentity.TileEntityChest spill38_9;
    com.moon.hW spill38_10;
    moom.CA spill38_11;
    com.moon.aO spill38_12;
    com.moon.aO spill38_13;
    com.moon.aO spill38_14;
    boolean spill38_15;
    com.moon.hW spill38_16;
    moom.CA spill38_17;
    com.moon.module.impl.KillAura spill38_18;
    long life3_3;
    net.minecraft.entity.Entity[] life5_7;
    com.moon.hW life1_40;
    java.util.Iterator life6_94;
    net.minecraft.tileentity.TileEntity life7_101;
    double life8_138;
    double life10_142;
    double life12_146;
    double life14_153;
    double life16_160;
    double life18_167;
    moom.CA life20_181;
    net.minecraft.tileentity.TileEntityChest life21_195;
    net.minecraft.tileentity.TileEntityChest life22_197;
    com.moon.aO life6_373;
    com.moon.aO life7_396;
    java.util.Iterator life8_401;
    net.minecraft.entity.Entity life9_408;
    float life10_429;
    double life11_437;
    double life13_445;
    double life15_453;
    float life17_456;
    float life18_461;
    double life19_465;
    double life21_469;
    double life23_473;
    com.moon.setting.FloatSetting life25_477;
    com.moon.setting.FloatSetting life26_481;
    moom.CA life27_562;
    lexical_join_492: {
    lexical_join_308: {
    lexical_join_302: {
    lexical_join_287: {
    lexical_join_281: {
    lexical_join_268: {
    lexical_join_267: {
    lexical_join_258: {
    lexical_join_254: {
    lexical_join_245: {
    lexical_join_242: {
    lexical_join_63: {
    lexical_join_60: {
    lexical_join_27: {
    lexical_join_22: {
    lexical_join_21: {
    lexical_join_15: {
    lexical_join_13: {
    life3_3 = (com.moon.g0.g ^ 34372126187237L);
    spill38_0 = __sourceExactCall_ea897610666eaa();
    this.d();
    life5_7 = spill38_0;
    spill38_1 = p0;
    if (!((life5_7 != null))) {
        lexicalValue38_13_0 = spill38_1;
        break lexical_join_13;
    }
    if (!((spill38_1 != null))) {
        break lexical_join_15;
    }
    lexicalValue38_13_0 = p0;
    }
    ((com.moon.hY)(((com.moon.hW)(lexicalValue38_13_0)).a__hY())).g();
    }
    spill38_2 = com.moon.hW.a();
    spill38_3 = p1;
    if (!((life5_7 != null))) {
        lexicalValue38_21_0 = spill38_2;
        lexicalValue38_21_1 = ((spill38_3) ? 1 : 0);
        break lexical_join_21;
    }
    if (!(spill38_3)) {
        lexicalValue38_22_0 = spill38_2;
        break lexical_join_22;
    }
    lexicalValue38_21_0 = spill38_2;
    lexicalValue38_21_1 = 1;
    }
    lexicalValue38_27_0 = lexicalValue38_21_0;
    lexicalValue38_27_1 = lexicalValue38_21_1;
    break lexical_join_27;
    }
    lexicalValue38_27_0 = lexicalValue38_22_0;
    lexicalValue38_27_1 = __sourceIntrinsic_f3137819d6bc_invokedynamic38_7(23073, (1286476302544859527L ^ life3_3));
    }
    life1_40 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(lexicalValue38_27_0)).a(((int)(lexicalValue38_27_1))))).a(((com.moon.cb)(com.moon.cb.WORLD))))).b())).c())).a__hX())).a();
    spill38_4 = ((com.moon.module.impl.StorageEsp)(this.f)).isEnabled();
    if (!((life5_7 != null))) {
        lexicalValue38_245_0 = ((spill38_4) ? 1 : 0);
        break lexical_join_245;
    }
    if (!(spill38_4)) {
        break lexical_join_242;
    }
    spill38_5 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(this.f)).h())).getValue())))).booleanValue();
    if (!((life5_7 != null))) {
        lexicalValue38_245_0 = ((spill38_5) ? 1 : 0);
        break lexical_join_245;
    }
    if (!(spill38_5)) {
        break lexical_join_242;
    }
    spill38_6 = p1;
    if (!((life5_7 != null))) {
        lexicalValue38_60_0 = ((spill38_6) ? 1 : 0);
        break lexical_join_60;
    }
    if (!(spill38_6)) {
        break lexical_join_63;
    }
    lexicalValue38_60_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(this.f)).i())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life5_7 != null))) {
        lexicalValue38_245_0 = lexicalValue38_60_0;
        break lexical_join_245;
    }
    if (!((lexicalValue38_60_0 != 0))) {
        break lexical_join_242;
    }
    }
    life6_94 = ((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.g0.a)).I)).e)).iterator();
    lexical_cycle_68: while (true) {
    lexical_join_240: {
    lexical_join_236: {
    lexical_join_230: {
    lexical_join_218: {
    lexical_join_185: {
    lexical_join_184: {
    lexical_join_179: {
    lexical_join_177: {
    lexical_join_170: {
    lexical_join_168: {
    lexical_join_161: {
    lexical_join_159: {
    lexical_join_146: {
    lexical_join_93: {
    lexical_join_92: {
    lexical_join_87: {
    lexical_join_85: {
    if (!(((java.util.Iterator)(life6_94)).hasNext())) {
        break lexical_join_242;
    }
    life7_101 = ((net.minecraft.tileentity.TileEntity)(((java.util.Iterator)(life6_94)).next()));
    spill38_7 = com.moon.nG.a(((moom.CA)(((net.minecraft.tileentity.TileEntity)(life7_101)).a())));
    if (!((life5_7 != null))) {
        lexicalValue38_245_0 = ((spill38_7) ? 1 : 0);
        break lexical_join_245;
    }
    if (!((life5_7 != null))) {
        lexicalValue38_87_0 = ((spill38_7) ? 1 : 0);
        break lexical_join_87;
    }
    if (!((!spill38_7))) {
        break lexical_join_85;
    }
    if (!((life5_7 == null))) { continue lexical_cycle_68; }
    }
    lexicalValue38_87_0 = ((life7_101 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0);
    }
    if (!((life5_7 != null))) {
        lexicalValue38_92_0 = lexicalValue38_87_0;
        break lexical_join_92;
    }
    if (!((lexicalValue38_87_0 == 0))) {
        break lexical_join_93;
    }
    lexicalValue38_92_0 = ((life7_101 instanceof moom.Cg) ? 1 : 0);
    }
    if (!((lexicalValue38_92_0 != 0))) {
        break lexical_join_240;
    }
    }
    life8_138 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g0.a)).a__nw())).a();
    life10_142 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g0.a)).a__nw())).b();
    life12_146 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g0.a)).a__nw())).c();
    life14_153 = (((double) ((moom.DT)(((net.minecraft.tileentity.TileEntity)(life7_101)).a__DT())).a()) - life8_138);
    life16_160 = (((double) ((moom.DT)(((net.minecraft.tileentity.TileEntity)(life7_101)).a__DT())).b()) - life10_142);
    life18_167 = (((double) ((moom.DT)(((net.minecraft.tileentity.TileEntity)(life7_101)).a__DT())).c()) - life12_146);
    life20_181 = ((moom.CA)(new moom.CA(0x1.0p-4d, 0x0.0p0d, 0x1.0p-4d, 0x1.e147ae147ae14p-1d, 0x1.cp-1d, 0x1.e147ae147ae14p-1d))).c(((double)(life14_153)), ((double)(life16_160)), ((double)(life18_167)));
    spill38_8 = life7_101;
    if (!((life5_7 != null))) {
        lexicalValue38_146_0 = spill38_8;
        break lexical_join_146;
    }
    if (!((((spill38_8 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0) != 0))) {
        break lexical_join_218;
    }
    lexicalValue38_146_0 = life7_101;
    }
    life21_195 = ((net.minecraft.tileentity.TileEntityChest)(lexicalValue38_146_0));
    life22_197 = null;
    spill38_9 = ((net.minecraft.tileentity.TileEntityChest)(life21_195)).r;
    if (!((life5_7 != null))) {
        lexicalValue38_161_0 = spill38_9;
        break lexical_join_161;
    }
    if (!((spill38_9 != null))) {
        break lexical_join_159;
    }
    life22_197 = ((net.minecraft.tileentity.TileEntityChest)(life21_195)).r;
    break lexical_join_185;
    }
    lexicalValue38_161_0 = ((net.minecraft.tileentity.TileEntityChest)(life21_195)).q;
    }
    if (!((life5_7 != null))) {
        lexicalValue38_170_0 = lexicalValue38_161_0;
        break lexical_join_170;
    }
    if (!((lexicalValue38_161_0 != null))) {
        break lexical_join_168;
    }
    life22_197 = ((net.minecraft.tileentity.TileEntityChest)(life21_195)).q;
    break lexical_join_185;
    }
    lexicalValue38_170_0 = ((net.minecraft.tileentity.TileEntityChest)(life21_195)).p;
    }
    if (!((life5_7 != null))) {
        lexicalValue38_179_0 = lexicalValue38_170_0;
        break lexical_join_179;
    }
    if (!((lexicalValue38_170_0 != null))) {
        break lexical_join_177;
    }
    life22_197 = ((net.minecraft.tileentity.TileEntityChest)(life21_195)).p;
    break lexical_join_185;
    }
    lexicalValue38_179_0 = ((net.minecraft.tileentity.TileEntityChest)(life21_195)).s;
    }
    if (!((life5_7 != null))) {
        lexicalValue38_184_0 = lexicalValue38_179_0;
        break lexical_join_184;
    }
    if (!((lexicalValue38_179_0 != null))) {
        break lexical_join_185;
    }
    lexicalValue38_184_0 = ((net.minecraft.tileentity.TileEntityChest)(life21_195)).s;
    }
    life22_197 = lexicalValue38_184_0;
    }
    if (!((life22_197 != null))) {
        break lexical_join_218;
    }
    life20_181 = ((moom.CA)(life20_181)).a(((moom.CA)(((moom.CA)(new moom.CA(0x1.0p-4d, 0x0.0p0d, 0x1.0p-4d, 0x1.e147ae147ae14p-1d, 0x1.cp-1d, 0x1.e147ae147ae14p-1d))).c(((double)((((double) ((moom.DT)(__sourceExactCall_30feacdcf52645(((net.minecraft.tileentity.TileEntityChest)(life22_197))))).a()) - life8_138))), ((double)((((double) ((moom.DT)(__sourceExactCall_30feacdcf52645(((net.minecraft.tileentity.TileEntityChest)(life22_197))))).b()) - life10_142))), ((double)((((double) ((moom.DT)(__sourceExactCall_30feacdcf52645(((net.minecraft.tileentity.TileEntityChest)(life22_197))))).c()) - life12_146)))))));
    }
    spill38_10 = life1_40;
    spill38_11 = life20_181;
    spill38_12 = new com.moon.aO(((com.moon.g0)(this)).a(((net.minecraft.tileentity.TileEntity)(life7_101))));
    if (!(p1)) {
        lexicalValue38_230_0 = spill38_10;
        lexicalValue38_230_1 = spill38_11;
        lexicalValue38_230_2 = spill38_12;
        break lexical_join_230;
    }
    lexicalValue38_236_0 = spill38_10;
    lexicalValue38_236_1 = spill38_11;
    lexicalValue38_236_2 = spill38_12;
    lexicalValue38_236_3 = 0x1.0p0f;
    break lexical_join_236;
    }
    lexicalValue38_236_0 = lexicalValue38_230_0;
    lexicalValue38_236_1 = lexicalValue38_230_1;
    lexicalValue38_236_2 = lexicalValue38_230_2;
    lexicalValue38_236_3 = ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.StorageEsp)(this.f)).b__kZ())).getValue())))).floatValue();
    }
    ((com.moon.hW)(lexicalValue38_236_0)).a(((com.moon.iX)(com.moon.i9.a(((moom.CA)(lexicalValue38_236_1)), ((int)(((com.moon.aO)(((com.moon.aO)(lexicalValue38_236_2)).a(((float)(lexicalValue38_236_3))))).getRGB()))))));
    }
    if (!((life5_7 == null))) { continue lexical_cycle_68; }
    break lexical_cycle_68;
    }
    }
    lexicalValue38_245_0 = ((((com.moon.module.impl.ESP)(((com.moon.g0)(this)).a())).isEnabled()) ? 1 : 0);
    }
    if (!((life5_7 != null))) {
        lexicalValue38_254_0 = lexicalValue38_245_0;
        break lexical_join_254;
    }
    if (!((lexicalValue38_245_0 != 0))) {
        break lexical_join_492;
    }
    lexicalValue38_254_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g0)(this)).a())).s())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life5_7 != null))) {
        lexicalValue38_258_0 = lexicalValue38_254_0;
        break lexical_join_258;
    }
    if (!((lexicalValue38_254_0 != 0))) {
        break lexical_join_492;
    }
    lexicalValue38_258_0 = ((p1) ? 1 : 0);
    }
    if (!((life5_7 != null))) {
        lexicalValue38_267_0 = lexicalValue38_258_0;
        break lexical_join_267;
    }
    if (!((lexicalValue38_258_0 != 0))) {
        break lexical_join_268;
    }
    lexicalValue38_267_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g0)(this)).a())).u())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((lexicalValue38_267_0 != 0))) {
        break lexical_join_492;
    }
    }
    spill38_13 = new com.moon.aO(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.g0)(this)).a())).l__kX())).getValue())))).intValue());
    if (!(p1)) {
        lexicalValue38_281_0 = spill38_13;
        break lexical_join_281;
    }
    lexicalValue38_287_0 = spill38_13;
    lexicalValue38_287_1 = 0x1.0p0f;
    break lexical_join_287;
    }
    lexicalValue38_287_0 = lexicalValue38_281_0;
    lexicalValue38_287_1 = ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.ESP)(((com.moon.g0)(this)).a())).g__kZ())).getValue())))).floatValue();
    }
    life6_373 = ((com.moon.aO)(lexicalValue38_287_0)).a(((float)(lexicalValue38_287_1)));
    spill38_14 = new com.moon.aO(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.g0)(this)).a())).m__kX())).getValue())))).intValue());
    if (!(p1)) {
        lexicalValue38_302_0 = spill38_14;
        break lexical_join_302;
    }
    lexicalValue38_308_0 = spill38_14;
    lexicalValue38_308_1 = 0x1.0p0f;
    break lexical_join_308;
    }
    lexicalValue38_308_0 = lexicalValue38_302_0;
    lexicalValue38_308_1 = ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.ESP)(((com.moon.g0)(this)).a())).g__kZ())).getValue())))).floatValue();
    }
    life7_396 = ((com.moon.aO)(lexicalValue38_308_0)).a(((float)(lexicalValue38_308_1)));
    life8_401 = ((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.g0.a)).I)).c)).iterator();
    lexical_cycle_315: while (true) {
    lexical_join_487: {
    lexical_join_486: {
    lexical_join_480: {
    lexical_join_333: {
    lexical_join_330: {
    if (!(((java.util.Iterator)(life8_401)).hasNext())) {
        break lexical_join_492;
    }
    life9_408 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life8_401)).next()));
    spill38_15 = ((com.moon.g0)(this)).a(((net.minecraft.entity.Entity)(life9_408)));
    if (!((life5_7 != null))) {
        lexicalValue38_330_0 = ((spill38_15) ? 1 : 0);
        break lexical_join_330;
    }
    if (!(spill38_15)) { continue lexical_cycle_315; }
    lexicalValue38_330_0 = ((com.moon.nG.a(((net.minecraft.entity.Entity)(life9_408)))) ? 1 : 0);
    }
    if (!((lexicalValue38_330_0 == 0))) {
        break lexical_join_333;
    }
    if (!((life5_7 == null))) { continue lexical_cycle_315; }
    }
    life10_429 = ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.g0.a)).l)).b;
    life11_437 = com.moon.nR.a(((double)(((net.minecraft.entity.Entity)(life9_408)).n)), ((double)(((net.minecraft.entity.Entity)(life9_408)).M)), ((double)(((double) life10_429))));
    life13_445 = com.moon.nR.a(((double)(((net.minecraft.entity.Entity)(life9_408)).o)), ((double)(((net.minecraft.entity.Entity)(life9_408)).N)), ((double)(((double) life10_429))));
    life15_453 = com.moon.nR.a(((double)(((net.minecraft.entity.Entity)(life9_408)).p)), ((double)(((net.minecraft.entity.Entity)(life9_408)).O)), ((double)(((double) life10_429))));
    life17_456 = ((net.minecraft.entity.Entity)(life9_408)).G;
    life18_461 = (((net.minecraft.entity.Entity)(life9_408)).H + 0x1.99999ap-4f);
    life19_465 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g0.a)).a__nw())).a();
    life21_469 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g0.a)).a__nw())).b();
    life23_473 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g0.a)).a__nw())).c();
    life25_477 = ((com.moon.module.impl.ESP)(((com.moon.g0)(this)).a())).h__kZ();
    life26_481 = ((com.moon.module.impl.ESP)(((com.moon.g0)(this)).a())).i__kZ();
    life27_562 = new moom.CA(((((life11_437 - life19_465) - ((double) life17_456)) + 0x1.0p-2d) - ((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(life25_477)).getValue())))).floatValue())), ((life13_445 - life21_469) - ((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(life26_481)).getValue())))).floatValue())), ((((life15_453 - life23_473) - ((double) life17_456)) + 0x1.0p-2d) - ((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(life25_477)).getValue())))).floatValue())), ((((life11_437 - life19_465) + ((double) life17_456)) - 0x1.0p-2d) + ((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(life25_477)).getValue())))).floatValue())), (((life13_445 - life21_469) + ((double) life18_461)) + ((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(life26_481)).getValue())))).floatValue())), ((((life15_453 - life23_473) + ((double) life17_456)) - 0x1.0p-2d) + ((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(life25_477)).getValue())))).floatValue())));
    spill38_16 = life1_40;
    spill38_17 = life27_562;
    spill38_18 = this.e;
    if (!((life5_7 != null))) {
        lexicalValue38_480_0 = spill38_16;
        lexicalValue38_480_1 = spill38_17;
        lexicalValue38_480_2 = spill38_18;
        break lexical_join_480;
    }
    if (!(((com.moon.module.impl.KillAura)(spill38_18)).isEnabled())) {
        lexicalValue38_486_0 = spill38_16;
        lexicalValue38_486_1 = spill38_17;
        break lexical_join_486;
    }
    lexicalValue38_480_0 = spill38_16;
    lexicalValue38_480_1 = spill38_17;
    lexicalValue38_480_2 = this.e;
    }
    if (!((((com.moon.gd)(((com.moon.module.impl.KillAura)(lexicalValue38_480_2)).a__gd())).a__sG() == life9_408))) {
        lexicalValue38_486_0 = lexicalValue38_480_0;
        lexicalValue38_486_1 = lexicalValue38_480_1;
        break lexical_join_486;
    }
    lexicalValue38_487_0 = lexicalValue38_480_0;
    lexicalValue38_487_1 = lexicalValue38_480_1;
    lexicalValue38_487_2 = life7_396;
    break lexical_join_487;
    }
    lexicalValue38_487_0 = lexicalValue38_486_0;
    lexicalValue38_487_1 = lexicalValue38_486_1;
    lexicalValue38_487_2 = life6_373;
    }
    ((com.moon.hW)(lexicalValue38_487_0)).a(((com.moon.iX)(com.moon.i9.a(((moom.CA)(lexicalValue38_487_1)), ((int)(((com.moon.aO)(lexicalValue38_487_2)).getRGB()))))));
    if (!((life5_7 == null))) { continue lexical_cycle_315; }
    break lexical_cycle_315;
    }
    }
    return life1_40;
}


public void a__Void() {
java.lang.Object forwardValue208_38_0;
    com.moon.g0 forwardValue208_51_0;
    com.moon.hW forwardValue208_57_0;
    net.minecraft.entity.Entity[] spill208_0;
    com.moon.hW spill208_1;
    com.moon.g0 spill208_2;
    com.moon.g0 spill208_3;
    com.moon.hW spill208_4;
    long life1_3;
    net.minecraft.entity.Entity[] life3_8;
    forward_join_64: {
    forward_join_58: {
    forward_join_57: {
    forward_join_51: {
    forward_join_50: {
    forward_join_38: {
    forward_join_32: {
    life1_3 = (com.moon.g0.g ^ 134994814766876L);
    moom.kZ.o();
    moom.kZ.i();
    spill208_0 = __sourceExactCall_ea897610666eaa();
    moom.kZ.l();
    life3_8 = spill208_0;
    moom.kZ.a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic208_5(11910, (4633478486001063131L ^ life1_3)))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic208_6(20193, (8837468744767960253L ^ life1_3)))), ((int)(1)), ((int)(0)));
    org.lwjgl.opengl.GL11.glLineWidth(((float)(0x1.0p-1f)));
    spill208_1 = this.c;
    if (!((life3_8 != null))) {
        forwardValue208_38_0 = spill208_1;
        break forward_join_38;
    }
    if (!((spill208_1 != null))) {
        break forward_join_32;
    }
    ((com.moon.hW)(this.c)).b();
    }
    spill208_2 = this;
    if (!((life3_8 != null))) {
        forwardValue208_51_0 = spill208_2;
        break forward_join_51;
    }
    forwardValue208_38_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g0)(spill208_2)).a())).u())).getValue();
    }
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(forwardValue208_38_0)))).booleanValue()))) {
        break forward_join_50;
    }
    spill208_3 = this;
    if (!((life3_8 != null))) {
        forwardValue208_51_0 = spill208_3;
        break forward_join_51;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(((com.moon.g0)(spill208_3)).f)).i())).getValue())))).booleanValue())) {
        break forward_join_58;
    }
    }
    forwardValue208_51_0 = this;
    }
    spill208_4 = ((com.moon.g0)(forwardValue208_51_0)).d;
    if (!((life3_8 != null))) {
        forwardValue208_57_0 = spill208_4;
        break forward_join_57;
    }
    if (!((spill208_4 != null))) {
        break forward_join_58;
    }
    forwardValue208_57_0 = this.d;
    }
    ((com.moon.hW)(forwardValue208_57_0)).b();
    }
    moom.kZ.j();
    if (!((life3_8 == null))) {
        break forward_join_64;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(net.minecraft.tileentity.TileEntity p0) {
int forwardValue207_33_0;
    int forwardValue207_36_0;
    int forwardValue207_47_0;
    int spill207_0;
    int spill207_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.tileentity.TileEntityChest life5_16;
    forward_join_47: {
    forward_join_46: {
    forward_join_36: {
    forward_join_34: {
    forward_join_33: {
    forward_join_27: {
    life2_3 = (com.moon.g0.g ^ 64502817986147L);
    life4_5 = __sourceExactCall_ea897610666eaa();
    spill207_0 = ((p0 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue207_36_0 = spill207_0;
        break forward_join_36;
    }
    if (!((spill207_0 != 0))) {
        break forward_join_34;
    }
    life5_16 = ((net.minecraft.tileentity.TileEntityChest)(p0));
    spill207_1 = ((net.minecraft.tileentity.TileEntityChest)(life5_16)).h();
    if (!((life4_5 != null))) {
        forwardValue207_33_0 = spill207_1;
        break forward_join_33;
    }
    if (!((spill207_1 == 1))) {
        break forward_join_27;
    }
    return ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.StorageEsp)(this.f)).h__kX())).getValue())))).intValue();
    }
    forwardValue207_33_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.StorageEsp)(this.f)).g__kX())).getValue())))).intValue();
    }
    return forwardValue207_33_0;
    }
    forwardValue207_36_0 = ((p0 instanceof moom.Cg) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue207_47_0 = forwardValue207_36_0;
        break forward_join_47;
    }
    if (!((forwardValue207_36_0 != 0))) {
        break forward_join_46;
    }
    return ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.StorageEsp)(this.f)).i__kX())).getValue())))).intValue();
    }
    forwardValue207_47_0 = -1;
    }
    return forwardValue207_47_0;
}


public boolean a__Boolean() {
return ((1) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_f3137819d6bc_invokedynamic38_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic208_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic208_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1175_0() throws E;

private static native net.minecraft.entity.Entity[] __sourceExactCall_ea897610666eaa();
private static native void __sourceExactCall_aea6825a3115d6(net.minecraft.entity.Entity[] p0);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);

private static native moom.DT __sourceExactCall_30feacdcf52645(net.minecraft.tileentity.TileEntityChest p0);
}
