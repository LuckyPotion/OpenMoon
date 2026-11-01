package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ga {

private static net.minecraft.client.Minecraft a;

private com.moon.module.impl.KillAura b;

private com.moon.fZ c;

private double d;

private double e;

private double f;

private int g;

private com.moon.nW h;

private long i;

private double j;

private double k;

private boolean l;

private boolean m;

private static long n;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public ga(com.moon.module.impl.KillAura p0) { super(); }


private static void __sourceConstructorBody_9c6b749243bc8814(com.moon.ga receiver, com.moon.module.impl.KillAura p0) throws Throwable {

long local2 = (com.moon.ga.n ^ 42385609554592L);

    com.moon.ga.__sourceConstructorInit_9c6b749243bc8814_0(((com.moon.ga)(receiver)));

    ((com.moon.ga)(receiver)).c = ((com.moon.fZ)(new com.moon.fZ()));

    ((com.moon.ga)(receiver)).d = ((double)(0x1.fffffffffffffp1023d));

    ((com.moon.ga)(receiver)).e = ((double)(0x0.0p0d));

    ((com.moon.ga)(receiver)).h = ((com.moon.nW)(new com.moon.nW()));

    ((com.moon.ga)(receiver)).i = ((long)(((long) com.moon.nI.a(((int)(__sourceIntrinsic_9c6b749243bc8814_originalDynamicSite900_6(12256, (3824520287458391275L ^ local2)))), ((int)(__sourceIntrinsic_9c6b749243bc8814_originalDynamicSite900_7(8051, (1990675014660998271L ^ local2))))))));

    ((com.moon.ga)(receiver)).j = ((double)(0x0.0p0d));

    ((com.moon.ga)(receiver)).k = ((double)(0x0.0p0d));

    ((com.moon.ga)(receiver)).b = ((com.moon.module.impl.KillAura)(p0));

    return;

}



static {
n = ((long)(((moom._a)(moom._c.a(((long)(-3503538481646056587L)), ((long)(-6828819870100590683L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(141156321326729L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ga.n ^ 62872103152066L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill210_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill210_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill210_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill210_14 = new byte[8];
    (__sourceSpill210_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill210_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation210_16 = __sourceSpill210_14;
    ((javax.crypto.Cipher)(__sourceSpill210_11)).init(((int)(__sourceSpill210_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill210_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation210_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "`\rÃ d¥îËÓÏÎè¸{ÁM>§\007e:|¬µêìâ¡óm ¤kBs¿¢n,\006u¾´u\"åÆæ@\bÀ*Q"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill210_25 = local6_life21;
        int __sourceSpill210_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill210_25)).substring(((int)(__sourceSpill210_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill210_30 = local8_life19;
        int __sourceSpill210_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill210_33 = new byte[8];
        (__sourceSpill210_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill210_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill210_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill210_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill210_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill210_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill210_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill210_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill210_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill210_34)).doFinal(((byte[])(__sourceSpill210_33)));
        (__sourceSpill210_30)[__sourceSpill210_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\006·Æpñrìk¹\036u^\037ó"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill210_38 = local6_life21;
        int __sourceSpill210_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill210_38)).substring(((int)(__sourceSpill210_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill210_43 = local8_life19;
        int __sourceSpill210_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill210_46 = new byte[8];
        (__sourceSpill210_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill210_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill210_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill210_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill210_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill210_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill210_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill210_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill210_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill210_47)).doFinal(((byte[])(__sourceSpill210_46)));
        (__sourceSpill210_43)[__sourceSpill210_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[10]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}

private static native <E extends Throwable> void __sourceConstructorInit_9c6b749243bc8814_0(com.moon.ga a0) throws E;

public double b() {
return this.e;
}


public void b__Void() {
com.moon.module.impl.KillAura forwardValue272_21_0;
    net.minecraft.entity.EntityLivingBase forwardValue272_29_0;
    int forwardValue272_50_0;
    int forwardValue272_80_0;
    com.moon.module.impl.KillAura spill272_0;
    net.minecraft.entity.EntityLivingBase spill272_1;
    int spill272_2;
    boolean spill272_3;
    long life1_3;
    int life3_5;
    net.minecraft.entity.EntityLivingBase life4_32;
    double life5_45;
    int life7_48;
    com.moon.dM life8_81;
    forward_join_94: {
    forward_join_91: {
    forward_join_89: {
    forward_join_80: {
    forward_join_79: {
    forward_join_59: {
    forward_join_50: {
    forward_join_29: {
    forward_join_21: {
    forward_join_19: {
    life1_3 = (com.moon.ga.n ^ 38438320925505L);
    life3_5 = ((net.minecraft.entity.EntityLiving.X()) ? 1 : 0);
    spill272_0 = this.b;
    if (!((life3_5 != 0))) {
        forwardValue272_21_0 = spill272_0;
        break forward_join_21;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.KillAura)(spill272_0)).Q)).getValue())))).booleanValue())) {
        break forward_join_19;
    }
    ((com.moon.ga)(this)).d__Void();
    if (!((life3_5 == 0))) {
        break forward_join_94;
    }
    }
    forwardValue272_21_0 = this.b;
    }
    life4_32 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(forwardValue272_21_0)).a__gd())).a__sG();
    spill272_1 = life4_32;
    if (!((life3_5 != 0))) {
        forwardValue272_29_0 = spill272_1;
        break forward_join_29;
    }
    if (!((spill272_1 != null))) {
        break forward_join_94;
    }
    forwardValue272_29_0 = life4_32;
    }
    life5_45 = ((double) ((net.minecraft.entity.EntityLivingBase)(forwardValue272_29_0)).a__Float(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.ga.a)).K))));
    life7_48 = ((com.moon.o4)(com.moon.o4.a__o4())).b();
    spill272_2 = recovery.source.CarrierOps.dcmpg(((double)(life5_45)), ((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.KillAura)(this.b)).b__kZ())).getValue())))).floatValue()))));
    if (!((life3_5 != 0))) {
        forwardValue272_50_0 = spill272_2;
        break forward_join_50;
    }
    if (!((spill272_2 <= 0))) {
        break forward_join_91;
    }
    forwardValue272_50_0 = life7_48;
    }
    if (!((forwardValue272_50_0 <= __sourceIntrinsic_9bf881b104f5_invokedynamic272_23(20819, (4913347648852171704L ^ life1_3))))) {
        break forward_join_59;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ga.a)).K)).B__sourceReturn_da8c82d5d4();
    }
    life8_81 = new com.moon.dM(life4_32);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life8_81)));
    spill272_3 = ((com.moon.dM)(life8_81)).isCancelled();
    if (!((life3_5 != 0))) {
        forwardValue272_80_0 = ((spill272_3) ? 1 : 0);
        break forward_join_80;
    }
    if (!((!spill272_3))) {
        break forward_join_79;
    }
    ((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.ga.a)).F)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.ga.a)).K)), ((net.minecraft.entity.Entity)(life4_32)));
    }
    forwardValue272_80_0 = life7_48;
    }
    if (!((forwardValue272_80_0 > __sourceIntrinsic_9bf881b104f5_invokedynamic272_37(28738, (4606271034537261738L ^ life1_3))))) {
        break forward_join_89;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ga.a)).K)).B__sourceReturn_da8c82d5d4();
    }
    if (!((life3_5 == 0))) {
        break forward_join_94;
    }
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ga.a)).K)).B__sourceReturn_da8c82d5d4();
    }
    return;
}


public boolean b__Boolean() {
return ((((this.m) ? 1 : 0)) != 0);
}


public double e() {
return this.k;
}


public double c() {
return this.f;
}


public void c__Void() {
this.l = ((boolean)(true));
    return;
}


private void d__Void() {
net.minecraft.client.Minecraft forwardValue273_13_0;
    net.minecraft.client.Minecraft spill273_0;
    long life1_3;
    int life3_5;
    int life4_21;
    forward_join_13: {
    forward_join_12: {
    life1_3 = (com.moon.ga.n ^ 108511817289267L);
    life3_5 = ((net.minecraft.entity.EntityLiving.W()) ? 1 : 0);
    spill273_0 = com.moon.ga.a;
    if (!((life3_5 == 0))) {
        forwardValue273_13_0 = spill273_0;
        break forward_join_13;
    }
    if (!((((net.minecraft.client.Minecraft)(spill273_0)).P != null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue273_13_0 = com.moon.ga.a;
    }
    life4_21 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(forwardValue273_13_0)).W)).av)).b();
    moom.pz.a(((int)(life4_21)), ((boolean)(true)));
    moom.pz.a(((int)(life4_21)));
    moom.pz.a(((int)(life4_21)), ((boolean)(false)));
    moom.pz.a(((int)(life4_21)));
    return;
}


public double d() {
return this.j;
}


public com.moon.ga a(int p0) {
this.g = ((int)(p0));
    return this;
}


public boolean a__Boolean() {
return ((((this.l) ? 1 : 0)) != 0);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ga.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17985;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ga", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1280_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ga"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.ga a(boolean p0) {
this.m = ((boolean)(p0));
    return this;
}


public com.moon.fZ a__fZ() {
return this.c;
}


public com.moon.module.impl.KillAura a__lb() {
return this.b;
}


private double a(double p0, boolean p1, boolean p2) {
net.minecraft.item.ItemStack forestValue64_26_0;
    int forestValue64_39_0;
    int forestValue64_48_0;
    int forestValue64_57_0;
    int forestValue64_87_0;
    net.minecraft.item.Item forestValue64_89_0;
    double forestValue64_146_0;
    int forestValue64_230_0;
    int forestValue64_230_1;
    double forestValue64_259_0;
    net.minecraft.item.ItemStack spill64_0;
    int spill64_1;
    net.minecraft.item.Item spill64_2;
    int spill64_3;
    int spill64_4;
    int spill64_5;
    double spill64_6;
    double spill64_7;
    long life5_3;
    int life7_5;
    double life8_16;
    net.minecraft.item.Item life10_29;
    moom.xR life11_71;
    moom.xw life12_101;
    double life8_151;
    double life10_161;
    double life12_165;
    double life14_173;
    double life16_186;
    int life18_191;
    int life19_193;
    double life14_227;
    double life18_246;
    double life20_267;
    forest_join_260: {
    forest_join_259: {
    forest_join_258: {
    forest_join_230: {
    forest_join_210: {
    forest_join_207: {
    forest_join_146: {
    forest_join_145: {
    forest_join_135: {
    forest_join_121: {
    forest_join_113: {
    forest_join_111: {
    forest_join_107: {
    forest_join_103: {
    forest_join_101: {
    forest_join_99: {
    forest_join_89: {
    forest_join_87: {
    forest_join_83: {
    forest_join_81: {
    forest_join_79: {
    forest_join_75: {
    forest_join_71: {
    forest_join_57: {
    forest_join_55: {
    forest_join_48: {
    forest_join_46: {
    forest_join_39: {
    forest_join_37: {
    forest_join_26: {
    forest_join_15: {
    life5_3 = (com.moon.ga.n ^ 137096483715007L);
    life7_5 = ((net.minecraft.entity.EntityLiving.X()) ? 1 : 0);
    switch ((com.moon.gb.b)[((com.moon.ba)(((com.moon.ba)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.KillAura)(this.b)).c__kY())).getValue())))).ordinal()]) {
case 1:
{
        break forest_join_15;
    }
case 2:
{
        break forest_join_121;
    }
case 3:
case 4:
{
        break forest_join_135;
    }
default:
{
        break forest_join_260;
    }
}
    }
    life8_16 = 0x1.0p2d;
    spill64_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ga.a)).K)).a__xW();
    if (!((life7_5 != 0))) {
        forestValue64_26_0 = spill64_0;
        break forest_join_26;
    }
    if (!((spill64_0 != null))) {
        break forest_join_113;
    }
    forestValue64_26_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ga.a)).K)).a__xW();
    }
    life10_29 = ((net.minecraft.item.ItemStack)(forestValue64_26_0)).a__wQ();
    spill64_1 = ((life10_29 instanceof moom.xP) ? 1 : 0);
    if (!((life7_5 != 0))) {
        forestValue64_39_0 = spill64_1;
        break forest_join_39;
    }
    if (!((spill64_1 != 0))) {
        break forest_join_37;
    }
    life8_16 = 0x1.999999999999ap0d;
    if (!((life7_5 == 0))) {
        break forest_join_113;
    }
    }
    forestValue64_39_0 = ((life10_29 instanceof moom.xT) ? 1 : 0);
    }
    if (!((life7_5 != 0))) {
        forestValue64_48_0 = forestValue64_39_0;
        break forest_join_48;
    }
    if (!((forestValue64_39_0 != 0))) {
        break forest_join_46;
    }
    life8_16 = 0x1.0p0d;
    if (!((life7_5 == 0))) {
        break forest_join_113;
    }
    }
    forestValue64_48_0 = ((life10_29 instanceof moom.xS) ? 1 : 0);
    }
    if (!((life7_5 != 0))) {
        forestValue64_57_0 = forestValue64_48_0;
        break forest_join_57;
    }
    if (!((forestValue64_48_0 != 0))) {
        break forest_join_55;
    }
    life8_16 = 0x1.3333333333333p0d;
    if (!((life7_5 == 0))) {
        break forest_join_113;
    }
    }
    forestValue64_57_0 = ((life10_29 instanceof moom.xR) ? 1 : 0);
    }
    if (!((life7_5 != 0))) {
        forestValue64_87_0 = forestValue64_57_0;
        break forest_join_87;
    }
    if (!((forestValue64_57_0 != 0))) {
        break forest_join_83;
    }
    life11_71 = ((moom.xR)(life10_29));
    if (!((life7_5 != 0))) {
        break forest_join_81;
    }
    switch ((com.moon.gb.a)[((moom.a4)(((moom.xR)(life11_71)).a__a4())).ordinal()]) {
case 1:
case 2:
{
        break forest_join_71;
    }
case 3:
{
        break forest_join_75;
    }
default:
{
        break forest_join_79;
    }
}
    }
    life8_16 = 0x1.999999999999ap-1d;
    if (!((life7_5 == 0))) {
        break forest_join_113;
    }
    }
    life8_16 = 0x1.ccccccccccccdp-1d;
    if (!((life7_5 == 0))) {
        break forest_join_113;
    }
    }
    life8_16 = 0x1.0p0d;
    }
    if (!((life7_5 == 0))) {
        break forest_join_113;
    }
    }
    spill64_2 = life10_29;
    if (!((life7_5 != 0))) {
        forestValue64_89_0 = spill64_2;
        break forest_join_89;
    }
    forestValue64_87_0 = ((spill64_2 instanceof moom.xw) ? 1 : 0);
    }
    if (!((forestValue64_87_0 != 0))) {
        break forest_join_113;
    }
    forestValue64_89_0 = life10_29;
    }
    life12_101 = ((moom.xw)(forestValue64_89_0));
    if (!((life7_5 != 0))) {
        break forest_join_101;
    }
    switch ((com.moon.gb.a)[((moom.a4)(((moom.xw)(life12_101)).a__sourceReturn_fdbc2aadd1())).ordinal()]) {
case 2:
case 4:
{
        break forest_join_99;
    }
case 1:
{
        break forest_join_103;
    }
case 3:
{
        break forest_join_107;
    }
default:
{
        break forest_join_111;
    }
}
    }
    life8_16 = 0x1.0p0d;
    }
    if (!((life7_5 == 0))) {
        break forest_join_113;
    }
    }
    life8_16 = 0x1.0p1d;
    if (!((life7_5 == 0))) {
        break forest_join_113;
    }
    }
    life8_16 = 0x1.8p1d;
    if (!((life7_5 == 0))) {
        break forest_join_113;
    }
    }
    life8_16 = 0x1.0p2d;
    }
    return java.lang.Math.max(((double)(0x1.0p0d)), ((double)(((0x1.0p0d / life8_16) * 0x1.4p4d))));
    }
    return ((double) java.lang.Math.max(((long)(1L)), ((long)(java.lang.Math.round(((double)((0x1.4p4d / ((double) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.KillAura)(this.b)).a__k1())).getValue())))).intValue())))))))));
    }
    life8_151 = java.lang.Math.max(((double)(0x1.0p0d)), ((double)((p0 - 0x1.8p1d))));
    if (!(p1)) {
        break forest_join_145;
    }
    forestValue64_146_0 = 0x1.7p4d;
    break forest_join_146;
    }
    forestValue64_146_0 = 0x1.4p4d;
    }
    life10_161 = java.lang.Math.min(((double)(forestValue64_146_0)), ((double)((p0 + 0x1.0p2d))));
    life12_165 = com.moon.nI.a(((double)(life8_151)), ((double)(life10_161)));
    if (!(p2)) {
        break forest_join_210;
    }
    life14_173 = ((life8_151 + life10_161) / 0x1.0p1d);
    spill64_3 = 27015;
    life16_186 = (java.lang.Math.min(((double)((p0 - 0x1.0p0d))), ((double)(java.lang.Math.min(((double)((0x1.7p4d - p0))), ((double)(life14_173)))))) * 0x1.3333333333333p-1d);
    life18_191 = __sourceIntrinsic_907485cceaa2_invokedynamic64_42(spill64_3, (6188243835280555930L ^ life5_3));
    life19_193 = 0;
    forest_cycle_183: while (true) {
    forest_join_205: {
    forest_join_201: {
    if (!((recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.abs(((double)((life12_165 - this.d)))))), ((double)(life16_186))) <= 0))) {
        break forest_join_207;
    }
    life19_193 += 1;
    if (!((life7_5 != 0))) {
        break forest_join_205;
    }
    spill64_4 = life19_193;
    spill64_5 = life18_191;
    if (!((life7_5 != 0))) {
        forestValue64_230_0 = spill64_4;
        forestValue64_230_1 = spill64_5;
        break forest_join_230;
    }
    if (!((spill64_4 >= spill64_5))) {
        break forest_join_201;
    }
    if (!((life7_5 == 0))) {
        break forest_join_207;
    }
    }
    life12_165 = com.moon.nI.a(((double)(life8_151)), ((double)(life10_161)));
    }
    if (!((life7_5 == 0))) {
        continue forest_cycle_183;
    }
    break forest_cycle_183;
    }
    }
    this.d = ((double)(life12_165));
    }
    life14_227 = (0x1.4p4d / life12_165);
    life14_173 = ((com.moon.fZ)(this.c)).a(((double)(life14_227)), ((double)(com.moon.nI.a(((double)(0x1.999999999999ap-3d)), ((double)(0x1.999999999999ap-1d))))));
    life16_186 = 0x1.4p3d;
    forestValue64_230_0 = 0;
    forestValue64_230_1 = __sourceIntrinsic_907485cceaa2_invokedynamic64_51(25653, (3395181919113015844L ^ life5_3));
    }
    life18_246 = ((double) com.moon.nI.a(((int)(forestValue64_230_0)), ((int)(forestValue64_230_1))));
    spill64_6 = life18_246;
    if (!((life7_5 != 0))) {
        forestValue64_259_0 = spill64_6;
        break forest_join_259;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill64_6)), ((double)(life16_186))) <= 0))) {
        break forest_join_258;
    }
    spill64_7 = ((com.moon.fZ)(this.c)).c();
    if (!((life7_5 != 0))) {
        forestValue64_259_0 = spill64_7;
        break forest_join_259;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill64_7)), ((double)(0x1.8p2d))) >= 0))) {
        break forest_join_258;
    }
    life20_267 = com.moon.nI.a(((double)(0x1.8p0d)), ((double)(0x1.b333333333333p1d)));
    life14_173 = (life14_173 + ((com.moon.fZ)(this.c)).a(((double)(life20_267))));
    }
    forestValue64_259_0 = life14_173;
    }
    return forestValue64_259_0;
    }
    return 0x0.0p0d;
}


public void a__Void() {
int forestValue65_31_0;
    float forestValue65_49_0;
    int forestValue65_80_0;
    int forestValue65_89_0;
    int forestValue65_93_0;
    int forestValue65_95_0;
    int forestValue65_103_0;
    int forestValue65_107_0;
    int forestValue65_109_0;
    int forestValue65_120_0;
    int forestValue65_147_0;
    int forestValue65_168_0;
    net.minecraft.entity.EntityLivingBase forestValue65_174_0;
    int forestValue65_188_0;
    int forestValue65_190_0;
    int forestValue65_212_0;
    int forestValue65_227_0;
    int forestValue65_231_0;
    int forestValue65_252_0;
    int forestValue65_259_0;
    int forestValue65_263_0;
    int forestValue65_267_0;
    int forestValue65_269_0;
    com.moon.ga forestValue65_291_0;
    int forestValue65_304_0;
    int forestValue65_308_0;
    int forestValue65_329_0;
    int forestValue65_336_0;
    int forestValue65_340_0;
    int forestValue65_344_0;
    int forestValue65_346_0;
    int forestValue65_376_0;
    boolean spill65_0;
    boolean spill65_1;
    boolean spill65_2;
    int spill65_3;
    boolean spill65_4;
    int spill65_5;
    com.moon.ga spill65_6;
    net.minecraft.entity.EntityLivingBase spill65_7;
    int spill65_8;
    int spill65_9;
    int spill65_10;
    int spill65_11;
    int spill65_12;
    int spill65_13;
    int spill65_14;
    com.moon.ga spill65_15;
    long life1_3;
    com.moon.setting.BooleanSetting life4_7;
    float life5_16;
    int life3_17;
    double life6_47;
    double life8_63;
    int life6_115;
    int life7_138;
    int life8_194;
    int life9_196;
    net.minecraft.entity.EntityLivingBase life10_212;
    int life11_220;
    int life12_255;
    int life10_381;
    int life10_490;
    forest_join_387: {
    forest_join_381: {
    forest_join_376: {
    forest_join_370: {
    forest_join_291: {
    forest_join_213: {
    forest_join_212: {
    forest_join_211: {
    forest_join_190: {
    forest_join_189: {
    forest_join_188: {
    forest_join_187: {
    forest_join_178: {
    forest_join_174: {
    forest_join_168: {
    forest_join_167: {
    forest_join_147: {
    forest_join_146: {
    forest_join_120: {
    forest_join_118: {
    forest_join_109: {
    forest_join_108: {
    forest_join_107: {
    forest_join_103: {
    forest_join_95: {
    forest_join_94: {
    forest_join_93: {
    forest_join_89: {
    forest_join_80: {
    forest_join_78: {
    forest_join_49: {
    forest_join_48: {
    forest_join_34: {
    forest_join_31: {
    life1_3 = (com.moon.ga.n ^ 115190389367032L);
    life4_7 = ((com.moon.module.impl.KillAura)(this.b)).h();
    spill65_0 = net.minecraft.entity.EntityLiving.X();
    life5_16 = ((float) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.KillAura)(this.b)).a__k1())).getValue())))).intValue());
    life3_17 = ((spill65_0) ? 1 : 0);
    spill65_1 = ((com.moon.nW)(this.h)).b(((long)(this.i)));
    if (!((life3_17 != 0))) {
        forestValue65_31_0 = ((spill65_1) ? 1 : 0);
        break forest_join_31;
    }
    if (!((!spill65_1))) {
        break forest_join_34;
    }
    forestValue65_31_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) life5_16))), ((double)(this.k)));
    }
    if (!((life3_17 != 0))) {
        forestValue65_80_0 = forestValue65_31_0;
        break forest_join_80;
    }
    if (!((forestValue65_31_0 != 0))) {
        break forest_join_78;
    }
    }
    life6_47 = ((double) java.lang.Math.max(((float)(0x1.0p0f)), ((float)((life5_16 - 0x1.8p1f)))));
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(life4_7)).getValue())))).booleanValue())) {
        break forest_join_48;
    }
    forestValue65_49_0 = 0x1.7p4f;
    break forest_join_49;
    }
    forestValue65_49_0 = 0x1.4p4f;
    }
    life8_63 = ((double) java.lang.Math.min(((float)(forestValue65_49_0)), ((float)((life5_16 + 0x1.0p2f)))));
    this.j = ((double)(com.moon.nI.a(((double)(life6_47)), ((double)(life8_63)))));
    this.k = ((double)(((double) life5_16)));
    this.i = ((long)(((long) com.moon.nI.a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic65_24(16467, (1549946046827036932L ^ life1_3)))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic65_25(24784, (8897679158895190411L ^ life1_3))))))));
    }
    forestValue65_80_0 = ((this.l) ? 1 : 0);
    }
    if (!((life3_17 != 0))) {
        forestValue65_89_0 = forestValue65_80_0;
        break forest_join_89;
    }
    if (!((forestValue65_80_0 == 0))) {
        break forest_join_94;
    }
    forestValue65_89_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) this.g))), ((double)(this.e)));
    }
    if (!((life3_17 != 0))) {
        forestValue65_93_0 = forestValue65_89_0;
        break forest_join_93;
    }
    if (!((forestValue65_89_0 >= 0))) {
        break forest_join_94;
    }
    forestValue65_93_0 = 1;
    }
    forestValue65_95_0 = forestValue65_93_0;
    break forest_join_95;
    }
    forestValue65_95_0 = 0;
    }
    life6_115 = forestValue65_95_0;
    spill65_2 = ((com.moon.module.impl.KillAura)(this.b)).c__Boolean();
    if (!((life3_17 != 0))) {
        forestValue65_103_0 = ((spill65_2) ? 1 : 0);
        break forest_join_103;
    }
    if (!(spill65_2)) {
        break forest_join_108;
    }
    forestValue65_103_0 = life6_115;
    }
    if (!((life3_17 != 0))) {
        forestValue65_107_0 = forestValue65_103_0;
        break forest_join_107;
    }
    if (!((forestValue65_103_0 != 0))) {
        break forest_join_108;
    }
    forestValue65_107_0 = 1;
    }
    forestValue65_109_0 = forestValue65_107_0;
    break forest_join_109;
    }
    forestValue65_109_0 = 0;
    }
    life7_138 = forestValue65_109_0;
    spill65_3 = life7_138;
    if (!((life3_17 != 0))) {
        forestValue65_120_0 = spill65_3;
        break forest_join_120;
    }
    if (!((spill65_3 != 0))) {
        break forest_join_118;
    }
    ((com.moon.f0)(((com.moon.module.impl.KillAura)(this.b)).a())).c();
    }
    forestValue65_120_0 = ((this.m) ? 1 : 0);
    }
    if (!((life3_17 != 0))) {
        forestValue65_376_0 = forestValue65_120_0;
        break forest_join_376;
    }
    if (!((forestValue65_120_0 == 0))) {
        break forest_join_370;
    }
    spill65_4 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.KillAura)(this.b)).a__kV())).getValue())))).booleanValue();
    if (!((life3_17 != 0))) {
        forestValue65_147_0 = ((spill65_4) ? 1 : 0);
        break forest_join_147;
    }
    if (!(spill65_4)) {
        break forest_join_146;
    }
    spill65_5 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ga.a)).K)).U;
    if (!((life3_17 != 0))) {
        forestValue65_147_0 = spill65_5;
        break forest_join_147;
    }
    if (!((spill65_5 >= __sourceIntrinsic_b82a5b29b709_invokedynamic65_50(10847, (8685245058494688010L ^ life1_3))))) {
        break forest_join_146;
    }
    this.e = ((double)(0x0.0p0d));
    }
    forestValue65_147_0 = 0;
    }
    life8_194 = forestValue65_147_0;
    life9_196 = 0;
    spill65_6 = this;
    if (!((life3_17 != 0))) {
        forestValue65_291_0 = spill65_6;
        break forest_join_291;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.KillAura)(((com.moon.ga)(spill65_6)).b)).c__kY())).getValue() == com.moon.ba.HURT_TIME))) {
        break forest_join_213;
    }
    life10_212 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(this.b)).a__gd())).a__sG();
    if (!((life10_212 != null))) {
        break forest_join_167;
    }
    forestValue65_168_0 = 1;
    break forest_join_168;
    }
    forestValue65_168_0 = 0;
    }
    life11_220 = forestValue65_168_0;
    spill65_7 = life10_212;
    if (!((life3_17 != 0))) {
        forestValue65_174_0 = spill65_7;
        break forest_join_174;
    }
    if (!((spill65_7 != null))) {
        break forest_join_178;
    }
    forestValue65_174_0 = life10_212;
    }
    spill65_8 = ((net.minecraft.entity.EntityLivingBase)(forestValue65_174_0)).U;
    if (!((life3_17 != 0))) {
        forestValue65_188_0 = spill65_8;
        break forest_join_188;
    }
    if (!((spill65_8 == 0))) {
        break forest_join_187;
    }
    }
    spill65_9 = recovery.source.CarrierOps.dcmpl(((double)(((double) this.g))), ((double)(this.e)));
    if (!((life3_17 != 0))) {
        forestValue65_188_0 = spill65_9;
        break forest_join_188;
    }
    if (!((spill65_9 >= 0))) {
        break forest_join_189;
    }
    }
    forestValue65_188_0 = 1;
    }
    forestValue65_190_0 = forestValue65_188_0;
    break forest_join_190;
    }
    forestValue65_190_0 = 0;
    }
    life12_255 = forestValue65_190_0;
    spill65_10 = life11_220;
    if (!((life3_17 != 0))) {
        forestValue65_212_0 = spill65_10;
        break forest_join_212;
    }
    if (!((spill65_10 != 0))) {
        break forest_join_211;
    }
    spill65_11 = life12_255;
    if (!((life3_17 != 0))) {
        forestValue65_212_0 = spill65_11;
        break forest_join_212;
    }
    if (!((spill65_11 != 0))) {
        break forest_join_211;
    }
    spill65_12 = ((net.minecraft.entity.EntityLivingBase)(life10_212)).U;
    if (!((life3_17 != 0))) {
        forestValue65_212_0 = spill65_12;
        break forest_join_212;
    }
    if (!((spill65_12 <= __sourceIntrinsic_b82a5b29b709_invokedynamic65_64(9242, (1875077144539391306L ^ life1_3))))) {
        break forest_join_211;
    }
    life8_194 = 1;
    }
    forestValue65_212_0 = life11_220;
    }
    life9_196 = forestValue65_212_0;
    }
    forest_cycle_213: while (true) {
    forest_join_269: {
    forest_join_268: {
    forest_join_267: {
    forest_join_263: {
    forest_join_259: {
    forest_join_252: {
    forest_join_242: {
    forest_join_231: {
    forest_join_230: {
    forest_join_227: {
    forest_join_226: {
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) this.g))), ((double)(this.e))) >= 0))) {
        break forest_join_226;
    }
    spill65_13 = life9_196;
    if (!((life3_17 != 0))) {
        forestValue65_227_0 = spill65_13;
        break forest_join_227;
    }
    if (!((life3_17 != 0))) {
        forestValue65_231_0 = spill65_13;
        break forest_join_231;
    }
    if (!((spill65_13 != 0))) {
        break forest_join_230;
    }
    }
    forestValue65_227_0 = life8_194;
    }
    if (!((life3_17 != 0))) {
        forestValue65_376_0 = forestValue65_227_0;
        break forest_join_376;
    }
    if (!((forestValue65_227_0 != 0))) {
        break forest_join_370;
    }
    }
    forestValue65_231_0 = life6_115;
    }
    if (!((life3_17 != 0))) {
        forestValue65_252_0 = forestValue65_231_0;
        break forest_join_252;
    }
    if (!((forestValue65_231_0 == 0))) {
        break forest_join_242;
    }
    this.l = ((boolean)(false));
    if (!((life3_17 == 0))) {
        break forest_join_370;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    ((com.moon.ga)(this)).b__Void();
    this.f = ((double)(this.e));
    forestValue65_252_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(life4_7)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_17 != 0))) {
        forestValue65_259_0 = forestValue65_252_0;
        break forest_join_259;
    }
    if (!((forestValue65_252_0 != 0))) {
        break forest_join_268;
    }
    forestValue65_259_0 = recovery.source.CarrierOps.dcmpl(((double)(this.f)), ((double)(0x0.0p0d)));
    }
    if (!((life3_17 != 0))) {
        forestValue65_263_0 = forestValue65_259_0;
        break forest_join_263;
    }
    if (!((forestValue65_259_0 > 0))) {
        break forest_join_268;
    }
    forestValue65_263_0 = life8_194;
    }
    if (!((life3_17 != 0))) {
        forestValue65_267_0 = forestValue65_263_0;
        break forest_join_267;
    }
    if (!((forestValue65_263_0 == 0))) {
        break forest_join_268;
    }
    forestValue65_267_0 = 1;
    }
    forestValue65_269_0 = forestValue65_267_0;
    break forest_join_269;
    }
    forestValue65_269_0 = 0;
    }
    life10_381 = forestValue65_269_0;
    this.e = ((double)(((com.moon.ga)(this)).a(((double)(this.j)), ((boolean)__sourceIntrinsic_integerToBoolean((life10_381))), ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.KillAura)(this.b)).i())).getValue())))).booleanValue())))));
    this.g = ((int)(0));
    life8_194 = 0;
    if (!((life3_17 == 0))) {
        continue forest_cycle_213;
    }
    break forest_cycle_213;
    }
    break forest_join_370;
    }
    forest_cycle_291: while (true) {
    forest_join_368: {
    forest_join_346: {
    forest_join_345: {
    forest_join_344: {
    forest_join_340: {
    forest_join_336: {
    forest_join_329: {
    forest_join_319: {
    forest_join_308: {
    forest_join_307: {
    forest_join_304: {
    forest_join_303: {
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) ((com.moon.ga)(forestValue65_291_0)).g))), ((double)(this.e))) >= 0))) {
        break forest_join_303;
    }
    spill65_14 = life9_196;
    if (!((life3_17 != 0))) {
        forestValue65_304_0 = spill65_14;
        break forest_join_304;
    }
    if (!((life3_17 != 0))) {
        forestValue65_308_0 = spill65_14;
        break forest_join_308;
    }
    if (!((spill65_14 != 0))) {
        break forest_join_307;
    }
    }
    forestValue65_304_0 = life8_194;
    }
    if (!((life3_17 != 0))) {
        forestValue65_376_0 = forestValue65_304_0;
        break forest_join_376;
    }
    if (!((forestValue65_304_0 != 0))) {
        break forest_join_370;
    }
    }
    forestValue65_308_0 = life6_115;
    }
    if (!((life3_17 != 0))) {
        forestValue65_329_0 = forestValue65_308_0;
        break forest_join_329;
    }
    if (!((forestValue65_308_0 == 0))) {
        break forest_join_319;
    }
    this.l = ((boolean)(false));
    if (!((life3_17 == 0))) {
        break forest_join_370;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    ((com.moon.ga)(this)).b__Void();
    this.f = ((double)(this.e));
    forestValue65_329_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(life4_7)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_17 != 0))) {
        forestValue65_336_0 = forestValue65_329_0;
        break forest_join_336;
    }
    if (!((forestValue65_329_0 != 0))) {
        break forest_join_345;
    }
    forestValue65_336_0 = recovery.source.CarrierOps.dcmpl(((double)(this.f)), ((double)(0x0.0p0d)));
    }
    if (!((life3_17 != 0))) {
        forestValue65_340_0 = forestValue65_336_0;
        break forest_join_340;
    }
    if (!((forestValue65_336_0 > 0))) {
        break forest_join_345;
    }
    forestValue65_340_0 = life8_194;
    }
    if (!((life3_17 != 0))) {
        forestValue65_344_0 = forestValue65_340_0;
        break forest_join_344;
    }
    if (!((forestValue65_340_0 == 0))) {
        break forest_join_345;
    }
    forestValue65_344_0 = 1;
    }
    forestValue65_346_0 = forestValue65_344_0;
    break forest_join_346;
    }
    forestValue65_346_0 = 0;
    }
    life10_490 = forestValue65_346_0;
    this.e = ((double)(((com.moon.ga)(this)).a(((double)(this.j)), ((boolean)__sourceIntrinsic_integerToBoolean((life10_490))), ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.KillAura)(this.b)).i())).getValue())))).booleanValue())))));
    this.g = ((int)(0));
    life8_194 = 0;
    if (!((life3_17 == 0))) {
        break forest_join_368;
    }
    break forest_join_370;
    }
    spill65_15 = this;
    forestValue65_291_0 = spill65_15;
    continue forest_cycle_291;
    }
    }
    this.m = ((boolean)(false));
    if (!((life3_17 != 0))) {
        break forest_join_387;
    }
    forestValue65_376_0 = life7_138;
    }
    if (!((forestValue65_376_0 != 0))) {
        break forest_join_381;
    }
    ((com.moon.f0)(((com.moon.module.impl.KillAura)(this.b)).a())).d();
    }
    com.moon.ga __stackOp65_115_0 = this;
    ((com.moon.ga)(__stackOp65_115_0)).g = ((int)((((com.moon.ga)(__stackOp65_115_0)).g + 1)));
    }
    return;
}


public long a__Long() {
return this.i;
}


public com.moon.nW a__nW() {
return this.h;
}


public int a__Int() {
return this.g;
}


public double a() {
return this.d;
}


private static native <E extends Throwable> int __sourceIntrinsic_9c6b749243bc8814_originalDynamicSite900_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9c6b749243bc8814_originalDynamicSite900_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_907485cceaa2_invokedynamic64_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_907485cceaa2_invokedynamic64_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1280_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic65_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic65_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic65_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic65_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic272_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic272_37(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
