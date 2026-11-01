package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gd {

private static final net.minecraft.client.Minecraft a;

private final java.util.Map<com.moon.bd, com.moon.gj> b;

private final com.moon.module.impl.KillAura c;

private com.moon.module.impl.AntiBot d;

private com.moon.module.impl.Teams e;

private net.minecraft.entity.EntityLivingBase f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public gd(com.moon.module.impl.KillAura p0) {
super();
    this.b = new java.util.HashMap();
    this.c = p0;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(989897325800452948L)), ((long)(-3046981443624076315L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(155551632548982L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.gd.g ^ 33237953936206L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill119_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill119_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill119_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill119_14 = new byte[8];
    (__sourceSpill119_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill119_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation119_16 = __sourceSpill119_14;
    ((javax.crypto.Cipher)(__sourceSpill119_11)).init(((int)(__sourceSpill119_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill119_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation119_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\022Ý¿Ù\000ì×¿3\016Údý"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill119_25 = local6_life21;
        int __sourceSpill119_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill119_25)).substring(((int)(__sourceSpill119_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill119_30 = local8_life19;
        int __sourceSpill119_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill119_33 = new byte[8];
        (__sourceSpill119_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill119_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill119_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill119_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill119_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill119_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill119_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill119_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill119_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill119_34)).doFinal(((byte[])(__sourceSpill119_33)));
        (__sourceSpill119_30)[__sourceSpill119_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}


public void b() {
this.f = ((net.minecraft.entity.EntityLivingBase)(null));
    this.e();
    ((com.moon.gj)(((com.moon.gj)(((java.util.Map)(this.b)).get(((java.lang.Object)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.KillAura)(this.c)).a__kY())).getValue()))))))).b();
    return;
}


private void e() {
((java.util.Map)(this.b)).computeIfAbsent(((java.lang.Object)(((com.moon.bd)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.KillAura)(this.c)).a__kY())).getValue())))), ((java.util.function.Function)(__sourceIntrinsic_85f1dd884e89_originalDynamicSite379_5(this))));
    return;
}


public void c() {
this.d();
    com.moon.eV local1 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__eV();
    this.e();
    java.util.List local2 = ((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.gd.a)).I)).c)).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_5b7380e7aa7c_originalDynamicSite380_8(this)))))).filter(((java.util.function.Predicate)(__sourceIntrinsic_5b7380e7aa7c_originalDynamicSite380_10(this, local1)))))).map(((java.util.function.Function)(__sourceIntrinsic_5b7380e7aa7c_originalDynamicSite380_12()))))).toList();
    this.f = ((net.minecraft.entity.EntityLivingBase)(((com.moon.gj)(((com.moon.gj)(((java.util.Map)(this.b)).get(((java.lang.Object)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.KillAura)(this.c)).a__kY())).getValue()))))))).a(((java.util.List)(local2)))));
    return;
}


private void d() {
com.moon.gd forwardValue280_24_0;
    com.moon.gd spill280_0;
    com.moon.gd spill280_1;
    long life1_3;
    int life3_5;
    forward_join_30: {
    forward_join_24: {
    forward_join_16: {
    life1_3 = (com.moon.gd.g ^ 10347487524448L);
    life3_5 = ((net.minecraft.entity.EntityLiving.W()) ? 1 : 0);
    spill280_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue280_24_0 = spill280_0;
        break forward_join_24;
    }
    if (!((((com.moon.gd)(spill280_0)).d != null))) {
        break forward_join_16;
    }
    spill280_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue280_24_0 = spill280_1;
        break forward_join_24;
    }
    if (!((((com.moon.gd)(spill280_1)).e == null))) {
        break forward_join_30;
    }
    }
    this.d = ((com.moon.module.impl.AntiBot)(((com.moon.module.impl.AntiBot)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.AntiBot.class)))))));
    forwardValue280_24_0 = this;
    }
    ((com.moon.gd)(forwardValue280_24_0)).e = ((com.moon.module.impl.Teams)(((com.moon.module.impl.Teams)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Teams.class)))))));
    }
    return;
}


public net.minecraft.entity.EntityLivingBase a__sG() {
return this.f;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17088;
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
            throw new RuntimeException("com/moon/gd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1291_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.gd.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.module.impl.AntiBot a() {
return this.d;
}


public com.moon.module.impl.KillAura a__lb() {
return this.c;
}


public java.util.Map<com.moon.bd, com.moon.gj> a__Map() {
return this.b;
}


public boolean a__Boolean() {
long local1 = (com.moon.gd.g ^ 42912397189028L);
    return ((((this.f != null) ? 1 : 0)) != 0);
}


public void a__Void() {
this.f = ((net.minecraft.entity.EntityLivingBase)(null));
    this.e();
    ((com.moon.gj)(((com.moon.gj)(((java.util.Map)(this.b)).get(((java.lang.Object)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.KillAura)(this.c)).a__kY())).getValue()))))))).a();
    return;
}


public com.moon.module.impl.Teams a__ld() {
return this.e;
}


private boolean lambda$searchForTarget$1(com.moon.eV p0, net.minecraft.entity.Entity p1) {
int lexicalValue57_25_0;
    int lexicalValue57_29_0;
    int lexicalValue57_31_0;
    com.moon.be lexicalValue57_73_0;
    int lexicalValue57_80_0;
    int lexicalValue57_86_0;
    int lexicalValue57_107_0;
    int lexicalValue57_119_0;
    int lexicalValue57_125_0;
    int spill57_0;
    boolean spill57_1;
    int spill57_2;
    com.moon.be spill57_3;
    boolean spill57_4;
    int spill57_5;
    boolean spill57_6;
    boolean spill57_7;
    long life3_3;
    int life5_5;
    net.minecraft.entity.player.EntityPlayer life6_16;
    int life6_43;
    int life7_45;
    java.util.Map life8_51;
    java.util.Iterator life9_55;
    com.moon.be life10_62;
    int life11_68;
    net.minecraft.entity.player.EntityPlayer life9_132;
    lexical_join_125: {
    lexical_join_124: {
    lexical_join_119: {
    lexical_join_117: {
    lexical_join_107: {
    lexical_join_106: {
    lexical_join_86: {
    lexical_join_83: {
    lexical_join_31: {
    lexical_join_30: {
    lexical_join_29: {
    lexical_join_28: {
    lexical_join_25: {
    lexical_join_20: {
    life3_3 = (com.moon.gd.g ^ 21711512497922L);
    life5_5 = ((net.minecraft.entity.EntityLiving.X()) ? 1 : 0);
    spill57_0 = ((p1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_5 != 0))) {
        lexicalValue57_25_0 = spill57_0;
        break lexical_join_25;
    }
    if (!((spill57_0 != 0))) {
        break lexical_join_20;
    }
    life6_16 = ((net.minecraft.entity.player.EntityPlayer)(p1));
    spill57_1 = ((com.moon.eV)(p0)).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(life6_16)));
    if (!((life5_5 != 0))) {
        lexicalValue57_29_0 = ((spill57_1) ? 1 : 0);
        break lexical_join_29;
    }
    if (!((!spill57_1))) {
        break lexical_join_28;
    }
    }
    lexicalValue57_25_0 = ((((com.moon.module.impl.AntiBot)(this.d)).a(((int)(((net.minecraft.entity.Entity)(p1)).e__Int())))) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        lexicalValue57_31_0 = lexicalValue57_25_0;
        break lexical_join_31;
    }
    if (!((lexicalValue57_25_0 != 0))) {
        break lexical_join_30;
    }
    }
    lexicalValue57_29_0 = 0;
    }
    return ((lexicalValue57_29_0) != 0);
    }
    lexicalValue57_31_0 = 0;
    }
    life6_43 = lexicalValue57_31_0;
    life7_45 = 0;
    life8_51 = ((java.util.Map)(((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.KillAura)(this.c)).a__k4())).getValue()));
    life9_55 = ((java.util.Set)(((java.util.Map)(life8_51)).keySet())).iterator();
    lexical_cycle_44: while (true) {
    lexical_join_81: {
    lexical_join_80: {
    lexical_join_73: {
    lexical_join_72: {
    lexical_join_63: {
    if (!(((java.util.Iterator)(life9_55)).hasNext())) {
        break lexical_join_83;
    }
    life10_62 = ((com.moon.be)(((java.util.Iterator)(life9_55)).next()));
    life11_68 = ((((java.lang.Boolean)(((java.lang.Boolean)(((java.util.Map)(life8_51)).get(((java.lang.Object)(life10_62))))))).booleanValue()) ? 1 : 0);
    spill57_2 = life11_68;
    if (!((life5_5 != 0))) {
        lexicalValue57_86_0 = spill57_2;
        break lexical_join_86;
    }
    if (!((spill57_2 == 0))) {
        break lexical_join_63;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_44; }
    }
    spill57_3 = life10_62;
    if (!((life5_5 != 0))) {
        lexicalValue57_73_0 = spill57_3;
        break lexical_join_73;
    }
    if (!((spill57_3 == com.moon.be.INVISIBLES))) {
        break lexical_join_72;
    }
    life6_43 = 1;
    if (!((life5_5 == 0))) {
        break lexical_join_81;
    }
    }
    lexicalValue57_73_0 = life10_62;
    }
    spill57_4 = ((java.util.function.Predicate)(((com.moon.be)(lexicalValue57_73_0)).a__Predicate())).test(((java.lang.Object)(p1)));
    if (!((life5_5 != 0))) {
        lexicalValue57_80_0 = ((spill57_4) ? 1 : 0);
        break lexical_join_80;
    }
    if (!(spill57_4)) {
        break lexical_join_81;
    }
    lexicalValue57_80_0 = 1;
    }
    life7_45 = lexicalValue57_80_0;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    }
    lexicalValue57_86_0 = ((((com.moon.module.impl.Teams)(this.e)).isEnabled()) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        lexicalValue57_107_0 = lexicalValue57_86_0;
        break lexical_join_107;
    }
    if (!((lexicalValue57_86_0 != 0))) {
        break lexical_join_106;
    }
    spill57_5 = ((p1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_5 != 0))) {
        lexicalValue57_107_0 = spill57_5;
        break lexical_join_107;
    }
    if (!((spill57_5 != 0))) {
        break lexical_join_106;
    }
    life9_132 = ((net.minecraft.entity.player.EntityPlayer)(p1));
    spill57_6 = ((com.moon.module.impl.Teams)(this.e)).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(life9_132)));
    if (!((life5_5 != 0))) {
        lexicalValue57_107_0 = ((spill57_6) ? 1 : 0);
        break lexical_join_107;
    }
    if (!(spill57_6)) {
        break lexical_join_106;
    }
    return ((0) != 0);
    }
    lexicalValue57_107_0 = life6_43;
    }
    if (!((life5_5 != 0))) {
        lexicalValue57_119_0 = lexicalValue57_107_0;
        break lexical_join_119;
    }
    if (!((lexicalValue57_107_0 == 0))) {
        break lexical_join_117;
    }
    spill57_7 = ((net.minecraft.entity.Entity)(p1)).v__Boolean();
    if (!((life5_5 != 0))) {
        lexicalValue57_119_0 = ((spill57_7) ? 1 : 0);
        break lexical_join_119;
    }
    if (!(spill57_7)) {
        break lexical_join_117;
    }
    return ((0) != 0);
    }
    lexicalValue57_119_0 = ((p1 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        lexicalValue57_125_0 = lexicalValue57_119_0;
        break lexical_join_125;
    }
    if (!((lexicalValue57_119_0 == 0))) {
        break lexical_join_124;
    }
    return ((0) != 0);
    }
    lexicalValue57_125_0 = life7_45;
    }
    return ((lexicalValue57_125_0) != 0);
}


private boolean lambda$searchForTarget$0(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue282_25_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue282_25_1;
    net.minecraft.entity.Entity forwardValue282_27_0;
    int forwardValue282_45_0;
    int forwardValue282_45_1;
    int forwardValue282_47_0;
    int forwardValue282_49_0;
    net.minecraft.entity.Entity spill282_0;
    net.minecraft.client.entity.EntityPlayerSP spill282_1;
    net.minecraft.entity.Entity spill282_2;
    int spill282_3;
    int spill282_4;
    int spill282_5;
    long life2_3;
    int life4_5;
    forward_join_49: {
    forward_join_48: {
    forward_join_47: {
    forward_join_45: {
    forward_join_27: {
    forward_join_25: {
    life2_3 = (com.moon.gd.g ^ 108085937878008L);
    life4_5 = ((net.minecraft.entity.EntityLiving.X()) ? 1 : 0);
    spill282_0 = p0;
    spill282_1 = ((net.minecraft.client.Minecraft)(com.moon.gd.a)).K;
    if (!((life4_5 != 0))) {
        forwardValue282_25_0 = spill282_0;
        forwardValue282_25_1 = spill282_1;
        break forward_join_25;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.Entity)(spill282_0)).a__Float(((net.minecraft.entity.Entity)(spill282_1))))), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.KillAura)(this.c)).a__kZ())).getValue())))).floatValue()))) <= 0))) {
        break forward_join_48;
    }
    spill282_2 = p0;
    if (!((life4_5 != 0))) {
        forwardValue282_27_0 = spill282_2;
        break forward_join_27;
    }
    forwardValue282_25_0 = spill282_2;
    forwardValue282_25_1 = ((net.minecraft.client.Minecraft)(com.moon.gd.a)).K;
    }
    if (!((forwardValue282_25_0 != forwardValue282_25_1))) {
        break forward_join_48;
    }
    forwardValue282_27_0 = p0;
    }
    spill282_3 = ((net.minecraft.entity.Entity)(forwardValue282_27_0)).e__Int();
    spill282_4 = __sourceIntrinsic_3961a8b7093e_invokedynamic282_15(15243, (5593922348420232923L ^ life2_3));
    if (!((life4_5 != 0))) {
        forwardValue282_45_0 = spill282_3;
        forwardValue282_45_1 = spill282_4;
        break forward_join_45;
    }
    if (!((spill282_3 != spill282_4))) {
        break forward_join_48;
    }
    spill282_5 = ((net.minecraft.entity.Entity)(p0)).e__Int();
    if (!((life4_5 != 0))) {
        forwardValue282_47_0 = spill282_5;
        break forward_join_47;
    }
    forwardValue282_45_0 = spill282_5;
    forwardValue282_45_1 = __sourceIntrinsic_3961a8b7093e_invokedynamic282_17(23677, (3760561999806796076L ^ life2_3));
    }
    if (!((forwardValue282_45_0 != forwardValue282_45_1))) {
        break forward_join_48;
    }
    forwardValue282_47_0 = 1;
    }
    forwardValue282_49_0 = forwardValue282_47_0;
    break forward_join_49;
    }
    forwardValue282_49_0 = 0;
    }
    return ((forwardValue282_49_0) != 0);
}


private com.moon.gj lambda$populateStrategies$3(com.moon.bd p0) {
com.moon.gj forwardValue25_30_0;
    long life2_3;
    forward_join_30: {
    forward_join_25: {
    forward_join_19: {
    forward_join_13: {
    forward_join_9: {
    life2_3 = (com.moon.gd.g ^ 72217004370488L);
    switch ((com.moon.ge.a)[((com.moon.bd)(p0)).ordinal()]) {
default:
{
        break forward_join_9;
    }
case 1:
{
        break forward_join_13;
    }
case 2:
{
        break forward_join_19;
    }
case 3:
{
        break forward_join_25;
    }
}
    }
    throw new java.lang.IncompatibleClassChangeError();
    }
    forwardValue25_30_0 = new com.moon.gl(this.c);
    break forward_join_30;
    }
    forwardValue25_30_0 = new com.moon.gm(this.c);
    break forward_join_30;
    }
    forwardValue25_30_0 = new com.moon.gk(this.c);
    }
    return forwardValue25_30_0;
}


private static net.minecraft.entity.EntityLivingBase lambda$searchForTarget$2(net.minecraft.entity.Entity p0) {
return ((net.minecraft.entity.EntityLivingBase)(p0));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1291_0() throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_5b7380e7aa7c_originalDynamicSite380_8(com.moon.gd a0) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_5b7380e7aa7c_originalDynamicSite380_10(com.moon.gd a0, com.moon.eV a1) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_5b7380e7aa7c_originalDynamicSite380_12() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_85f1dd884e89_originalDynamicSite379_5(com.moon.gd a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3961a8b7093e_invokedynamic282_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3961a8b7093e_invokedynamic282_17(int a0, long a1) throws E;
}
