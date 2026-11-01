package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ft extends com.moon.e2<com.moon.module.impl.Flight> {

private final java.util.LinkedList<moom.DN<moom.yK<?>, java.lang.Long>> e;

private int f;

private int g;

private boolean h;

private boolean i;

private boolean j;

private boolean k;

private static final long l;

private static final long[] m;

private static final java.lang.Integer[] n;

private static final java.util.Map o;

private static final long q;

public ft() {
super(com.moon.module.impl.Flight.class);
    this.e = new java.util.LinkedList();
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-5135565684994259626L)), ((long)(186258680040950636L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(277159326532617L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.ft.l ^ 9452627283680L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill100_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill100_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill100_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill100_14 = new byte[8];
    (__sourceSpill100_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill100_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation100_16 = __sourceSpill100_14;
    ((javax.crypto.Cipher)(__sourceSpill100_11)).init(((int)(__sourceSpill100_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill100_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation100_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[2];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "¶è\023¤ê\002Âô¯'"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill100_25 = local11_life21;
        int __sourceSpill100_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill100_25)).substring(((int)(__sourceSpill100_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill100_30 = local13_life19;
        int __sourceSpill100_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill100_33 = new byte[8];
        (__sourceSpill100_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill100_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill100_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill100_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill100_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill100_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill100_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill100_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill100_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill100_34)).doFinal(((byte[])(__sourceSpill100_33)));
        (__sourceSpill100_30)[__sourceSpill100_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    m = ((long[])(local13_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[2]));
    javax.crypto.Cipher local0_life40;
    javax.crypto.Cipher __sourceSpill100_42 = (local0_life40 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill100_43 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill100_44 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill100_45 = new byte[8];
    (__sourceSpill100_45)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life46 = 1;
    while ((local1_life46 < 8)) {
        (__sourceSpill100_45)[local1_life46] = ((byte) ((int) ((local5_life7 << (local1_life46 * 8)) >>> 56)));
        local1_life46 += 1;
    }
    byte[] __sourcePreallocation100_47 = __sourceSpill100_45;
    ((javax.crypto.Cipher)(__sourceSpill100_42)).init(((int)(__sourceSpill100_43)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill100_44)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation100_47)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life50 = 259763958915342131L;
    byte[] __sourceSpill100_51 = new byte[8];
    (__sourceSpill100_51)[0] = ((byte) ((int) (local2_life50 >>> 56)));
    (__sourceSpill100_51)[1] = ((byte) ((int) (local2_life50 >>> 48)));
    (__sourceSpill100_51)[2] = ((byte) ((int) (local2_life50 >>> 40)));
    (__sourceSpill100_51)[3] = ((byte) ((int) (local2_life50 >>> 32)));
    (__sourceSpill100_51)[4] = ((byte) ((int) (local2_life50 >>> 24)));
    (__sourceSpill100_51)[5] = ((byte) ((int) (local2_life50 >>> 16)));
    (__sourceSpill100_51)[6] = ((byte) ((int) (local2_life50 >>> 8)));
    (__sourceSpill100_51)[7] = ((byte) ((int) local2_life50));
    javax.crypto.Cipher __sourceSpill100_52 = local0_life40;
    byte[] local4_life54 = ((javax.crypto.Cipher)(__sourceSpill100_52)).doFinal(((byte[])(__sourceSpill100_51)));
    q = ((long)((((((((((((long) (local4_life54)[0]) & 255L) << 56) | ((((long) (local4_life54)[1]) & 255L) << 48)) | ((((long) (local4_life54)[2]) & 255L) << 40)) | ((((long) (local4_life54)[3]) & 255L) << 32)) | ((((long) (local4_life54)[4]) & 255L) << 24)) | ((((long) (local4_life54)[5]) & 255L) << 16)) | ((((long) (local4_life54)[6]) & 255L) << 8)) | (((long) (local4_life54)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
this.i = ((boolean)(false));
    this.h = ((boolean)(true));
    this.g = ((int)(0));
    this.k = ((boolean)(false));
    ((com.moon.ft)(this)).a(((long)(0L)));
    return;
}


public void c() {
this.f = ((int)(0));
    ((com.moon.ft)(this)).a(((long)(0L)));
    return;
}


public void a(com.moon.ez p0) {
((java.util.List)(((com.moon.ez)(p0)).a())).add(((java.lang.Object)(new moom.CA(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).n, java.lang.Math.floor(((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).o))), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).p))));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27257;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ft", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ft.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1153_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ft"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.dL p0) {
long local2 = (com.moon.ft.l ^ 98070262619566L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Flight)(((com.moon.module.impl.Flight)(((com.moon.ft)(this)).a())))).a__kV())).getValue())))).booleanValue()) != 0)) {
        ((com.moon.dL)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
int forwardValue190_30_0;
    int forwardValue190_32_0;
    int forwardValue190_56_0;
    java.lang.String[] spill190_0;
    int spill190_1;
    int spill190_2;
    int spill190_3;
    long life2_3;
    int life5_12;
    java.lang.String[] life4_13;
    moom.yK life6_18;
    int life7_41;
    forward_join_63: {
    forward_join_56: {
    forward_join_53: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    life2_3 = (com.moon.ft.l ^ 21175064259625L);
    spill190_0 = moom.Dr.b();
    life5_12 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Flight)(((com.moon.module.impl.Flight)(((com.moon.ft)(this)).a())))).a__kV())).getValue())))).booleanValue()) ? 1 : 0);
    life4_13 = spill190_0;
    if (!((life5_12 != 0))) {
        break forward_join_63;
    }
    life6_18 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    spill190_1 = ((life6_18 instanceof moom.zt) ? 1 : 0);
    if (!((life4_13 != null))) {
        forwardValue190_30_0 = spill190_1;
        break forward_join_30;
    }
    if (!((spill190_1 == 0))) {
        break forward_join_29;
    }
    spill190_2 = ((life6_18 instanceof moom.Aj) ? 1 : 0);
    if (!((life4_13 != null))) {
        forwardValue190_30_0 = spill190_2;
        break forward_join_30;
    }
    if (!((spill190_2 != 0))) {
        break forward_join_31;
    }
    }
    forwardValue190_30_0 = 1;
    }
    forwardValue190_32_0 = forwardValue190_30_0;
    break forward_join_32;
    }
    forwardValue190_32_0 = 0;
    }
    life7_41 = forwardValue190_32_0;
    spill190_3 = life7_41;
    if (!((life4_13 != null))) {
        forwardValue190_56_0 = spill190_3;
        break forward_join_56;
    }
    if (!((spill190_3 != 0))) {
        break forward_join_53;
    }
    ((java.util.LinkedList)(this.e)).add(((java.lang.Object)(new moom.DN(life6_18, java.lang.Long.valueOf(((long)(java.lang.System.currentTimeMillis())))))));
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    if (!((life4_13 == null))) {
        break forward_join_63;
    }
    }
    forwardValue190_56_0 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zi) ? 1 : 0);
    }
    if (!((forwardValue190_56_0 != 0))) {
        break forward_join_63;
    }
    this.i = ((boolean)(true));
    this.h = ((boolean)(false));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
java.lang.Object forwardValue189_18_0;
    int forwardValue189_50_0;
    int forwardValue189_62_0;
    int forwardValue189_66_0;
    int forwardValue189_70_0;
    int forwardValue189_157_0;
    int forwardValue189_157_1;
    int forwardValue189_223_0;
    int forwardValue189_223_1;
    int forwardValue189_231_0;
    com.moon.ft forwardValue189_233_0;
    com.moon.event.MovePhase spill189_0;
    boolean spill189_1;
    boolean spill189_2;
    int spill189_3;
    int spill189_4;
    int spill189_5;
    int spill189_6;
    int spill189_7;
    com.moon.ft spill189_8;
    long life2_3;
    java.lang.String[] life4_5;
    int life5_25;
    int life6_33;
    int life7_41;
    double life8_101;
    double life10_105;
    double life12_109;
    moom.DT life14_118;
    net.minecraft.item.ItemStack life15_127;
    forward_join_238: {
    forward_join_233: {
    forward_join_231: {
    forward_join_227: {
    forward_join_223: {
    forward_join_213: {
    forward_join_157: {
    forward_join_154: {
    forward_join_72: {
    forward_join_71: {
    forward_join_70: {
    forward_join_66: {
    forward_join_62: {
    forward_join_60: {
    forward_join_50: {
    forward_join_49: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (com.moon.ft.l ^ 125773481984700L);
    life4_5 = moom.Dr.b();
    spill189_0 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    if (!((life4_5 != null))) {
        forwardValue189_18_0 = spill189_0;
        break forward_join_18;
    }
    if (!((spill189_0 != com.moon.event.MovePhase.PRE))) {
        break forward_join_13;
    }
    return;
    }
    forwardValue189_18_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Flight)(((com.moon.module.impl.Flight)(((com.moon.ft)(this)).a())))).a__kV())).getValue();
    }
    life5_25 = ((((java.lang.Boolean)(((java.lang.Boolean)(forwardValue189_18_0)))).booleanValue()) ? 1 : 0);
    life6_33 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Flight)(((com.moon.module.impl.Flight)(((com.moon.ft)(this)).a())))).a())).getValue())))).intValue();
    life7_41 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Flight)(((com.moon.module.impl.Flight)(((com.moon.ft)(this)).a())))).b())).getValue())))).booleanValue()) ? 1 : 0);
    spill189_1 = ((java.util.LinkedList)(this.e)).isEmpty();
    if (!((life4_5 != null))) {
        forwardValue189_50_0 = ((spill189_1) ? 1 : 0);
        break forward_join_50;
    }
    if (!((!spill189_1))) {
        break forward_join_49;
    }
    ((com.moon.ft)(this)).a(((long)((((long) life6_33) * com.moon.ft.q))));
    }
    forwardValue189_50_0 = life5_25;
    }
    if (!((life4_5 != null))) {
        forwardValue189_62_0 = forwardValue189_50_0;
        break forward_join_62;
    }
    if (!((forwardValue189_50_0 != 0))) {
        break forward_join_60;
    }
    spill189_2 = this.i;
    if (!((life4_5 != null))) {
        forwardValue189_62_0 = ((spill189_2) ? 1 : 0);
        break forward_join_62;
    }
    if (!((!spill189_2))) {
        break forward_join_60;
    }
    life7_41 = 1;
    }
    forwardValue189_62_0 = ((this.h) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue189_66_0 = forwardValue189_62_0;
        break forward_join_66;
    }
    if (!((forwardValue189_62_0 == 0))) {
        break forward_join_71;
    }
    forwardValue189_66_0 = life7_41;
    }
    if (!((life4_5 != null))) {
        forwardValue189_70_0 = forwardValue189_66_0;
        break forward_join_70;
    }
    if (!((forwardValue189_66_0 != 0))) {
        break forward_join_71;
    }
    forwardValue189_70_0 = life5_25;
    }
    if (!((forwardValue189_70_0 == 0))) {
        break forward_join_72;
    }
    }
    return;
    }
    life8_101 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).n;
    life10_105 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).o;
    life12_109 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).p;
    life14_118 = new moom.DT(life8_101, (life10_105 - 0x1.8p0d), life12_109);
    life15_127 = new net.minecraft.item.ItemStack(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__wQ(((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).I)), ((moom.DT)(life14_118))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).cm)).b(((moom.yK)(new moom.zb(life14_118, 1, life15_127, 0x0.0p0f, ((float) (0x1.0p-1d + (java.lang.Math.random() * 0x1.99999ap-4d))), 0x0.0p0f))));
    com.moon.ft __stackOp189_51_0 = this;
    ((com.moon.ft)(__stackOp189_51_0)).f = ((int)((((com.moon.ft)(__stackOp189_51_0)).f + 1)));
    spill189_3 = this.f;
    spill189_4 = 4;
    if (!((life4_5 != null))) {
        forwardValue189_157_0 = spill189_3;
        forwardValue189_157_1 = spill189_4;
        break forward_join_157;
    }
    if (!((spill189_3 < spill189_4))) {
        break forward_join_154;
    }
    ((com.moon.event.MoveEvent)(p0)).setCancelled(((boolean)(true)));
    spill189_5 = this.f;
    spill189_6 = 2;
    if (!((life4_5 != null))) {
        forwardValue189_223_0 = spill189_5;
        forwardValue189_223_1 = spill189_6;
        break forward_join_223;
    }
    if (!((spill189_5 == spill189_6))) {
        break forward_join_213;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).cm)).b(((moom.yK)(new moom.ze(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K, net.minecraft.network.play.client.C0BPacketEntityAction$Action.START_SPRINTING))));
    if (!((life4_5 == null))) {
        break forward_join_213;
    }
    }
    forwardValue189_157_0 = this.f;
    forwardValue189_157_1 = 4;
    }
    if (!((life4_5 != null))) {
        forwardValue189_223_0 = forwardValue189_157_0;
        forwardValue189_223_1 = forwardValue189_157_1;
        break forward_join_223;
    }
    if (!((forwardValue189_157_0 == forwardValue189_157_1))) {
        break forward_join_213;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).cm)).b(((moom.yK)(new moom.y_(life8_101, (life10_105 + 0x1.4p2d), life12_109, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).w, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).x, false))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).cm)).b(((moom.yK)(new moom.y_(life8_101, life10_105, life12_109, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).w, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).x, false))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).cm)).b(((moom.yK)(new moom.y_(life8_101, life10_105, life12_109, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).w, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).x, true))));
    }
    spill189_7 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).U;
    if (!((life4_5 != null))) {
        forwardValue189_231_0 = spill189_7;
        break forward_join_231;
    }
    forwardValue189_223_0 = spill189_7;
    forwardValue189_223_1 = __sourceIntrinsic_9f71572286bb_invokedynamic189_98(392, (9076954285731777065L ^ life2_3));
    }
    if (!((forwardValue189_223_0 >= forwardValue189_223_1))) {
        break forward_join_227;
    }
    this.j = ((boolean)(true));
    }
    spill189_8 = this;
    if (!((life4_5 != null))) {
        forwardValue189_233_0 = spill189_8;
        break forward_join_233;
    }
    forwardValue189_231_0 = ((((com.moon.ft)(spill189_8)).j) ? 1 : 0);
    }
    if (!((forwardValue189_231_0 != 0))) {
        break forward_join_238;
    }
    forwardValue189_233_0 = this;
    }
    com.moon.ft __stackOp189_102_0 = forwardValue189_233_0;
    ((com.moon.ft)(__stackOp189_102_0)).g = ((int)((((com.moon.ft)(__stackOp189_102_0)).g + 1)));
    }
    return;
}


private void a(long p0) {
java.lang.Object lexicalValue36_43_0;
    java.lang.String[] spill36_0;
    net.minecraft.client.network.NetHandlerPlayClient spill36_1;
    long life3_3;
    long life6_6;
    java.lang.String[] life5_7;
    moom.DN life8_13;
    moom.yK life9_18;
    long life10_23;
    lexical_join_46: {
    life3_3 = (com.moon.ft.l ^ 23833754891964L);
    spill36_0 = moom.Dr.b();
    life6_6 = java.lang.System.currentTimeMillis();
    life5_7 = spill36_0;
    lexical_cycle_8: while (true) {
    lexical_join_43: {
    lexical_join_40: {
    lexical_join_32: {
    if (!(((life8_13 = ((moom.DN)(((java.util.LinkedList)(this.e)).peek()))) != null))) {
        break lexical_join_46;
    }
    life9_18 = ((moom.yK)(((moom.DN)(life8_13)).a()));
    life10_23 = ((java.lang.Long)(((java.lang.Long)(((moom.DN)(life8_13)).b())))).longValue();
    if (!((recovery.source.CarrierOps.lcmp(((long)((life6_6 - life10_23))), ((long)(p0))) < 0))) {
        break lexical_join_32;
    }
    if (!((life5_7 == null))) {
        break lexical_join_46;
    }
    }
    spill36_1 = ((net.minecraft.client.Minecraft)(com.moon.ft.a)).a__jS();
    if (!((life5_7 != null))) {
        lexicalValue36_43_0 = spill36_1;
        break lexical_join_43;
    }
    if (!((spill36_1 != null))) {
        break lexical_join_40;
    }
    ((net.minecraft.client.Minecraft)(com.moon.ft.a)).a(((moom.yK)(life9_18)));
    }
    lexicalValue36_43_0 = ((java.util.LinkedList)(this.e)).poll();
    }
    recovery.source.CarrierOps.discard(lexicalValue36_43_0);
    if (!((life5_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public void a(com.moon.event.MotionEvent p0) {
int forwardValue188_14_0;
    int forwardValue188_20_0;
    int forwardValue188_27_0;
    com.moon.ft forwardValue188_33_0;
    int spill188_0;
    com.moon.ft spill188_1;
    long life2_3;
    java.lang.String[] life4_5;
    int life5_83;
    forward_join_76: {
    forward_join_73: {
    forward_join_71: {
    forward_join_68: {
    forward_join_66: {
    forward_join_41: {
    forward_join_37: {
    forward_join_33: {
    forward_join_27: {
    forward_join_20: {
    forward_join_14: {
    life2_3 = (com.moon.ft.l ^ 71448468725180L);
    life4_5 = moom.Dr.b();
    spill188_0 = this.f;
    if (!((life4_5 != null))) {
        forwardValue188_14_0 = spill188_0;
        break forward_join_14;
    }
    if (!((spill188_0 >= 5))) {
        break forward_join_73;
    }
    forwardValue188_14_0 = ((this.j) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue188_20_0 = forwardValue188_14_0;
        break forward_join_20;
    }
    if (!((forwardValue188_14_0 != 0))) {
        break forward_join_73;
    }
    forwardValue188_20_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ft.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue188_27_0 = forwardValue188_20_0;
        break forward_join_27;
    }
    if (!((forwardValue188_20_0 != 0))) {
        break forward_join_37;
    }
    spill188_1 = this;
    if (!((life4_5 != null))) {
        forwardValue188_33_0 = spill188_1;
        break forward_join_33;
    }
    forwardValue188_27_0 = ((((com.moon.ft)(spill188_1)).k) ? 1 : 0);
    }
    if (!((forwardValue188_27_0 == 0))) {
        break forward_join_37;
    }
    ((com.moon.event.MotionEvent)(p0)).setMotionY(((double)(0x1.ae147ap-2d)));
    forwardValue188_33_0 = this;
    }
    ((com.moon.ft)(forwardValue188_33_0)).k = ((boolean)(true));
    if (!((life4_5 == null))) {
        break forward_join_41;
    }
    }
    ((com.moon.event.MotionEvent)(p0)).setMotionY(((double)(0x0.0p0d)));
    }
    life5_83 = (__sourceIntrinsic_ec6de7cefe2c_invokedynamic188_14(31674, (8482893838064922394L ^ life2_3)) + (((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Flight)(((com.moon.module.impl.Flight)(((com.moon.ft)(this)).a())))).a())).getValue())))).intValue() * 2));
    if (!((life4_5 != null))) {
        break forward_join_66;
    }
    if (!((this.g < life5_83))) {
        break forward_join_68;
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(0x1.4p1d)));
    }
    if (!((life4_5 == null))) {
        break forward_join_71;
    }
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(com.moon.nJ.b())));
    }
    if (!((life4_5 == null))) {
        break forward_join_76;
    }
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(0x0.0p0d)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1153_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic189_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec6de7cefe2c_invokedynamic188_14(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
