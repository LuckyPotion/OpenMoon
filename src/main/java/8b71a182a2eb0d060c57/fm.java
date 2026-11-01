package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class fm extends com.moon.fj {

private final java.util.List<moom.yK> e;

private moom.DR f;

private moom.DT g;

private boolean h;

private int i;

private static final long k;

private static final long[] l;

private static final java.lang.Integer[] m;

private static final java.util.Map n;

public fm() {
super();
    this.e = new java.util.ArrayList();
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-35103827889863449L)), ((long)(5082856750958888409L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(218606528224992L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.fm.k ^ 27588075501867L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill98_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill98_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill98_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill98_14 = new byte[8];
    (__sourceSpill98_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill98_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation98_16 = __sourceSpill98_14;
    ((javax.crypto.Cipher)(__sourceSpill98_11)).init(((int)(__sourceSpill98_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill98_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation98_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "D­-KýÇÑ«ç2\023âçðû\020D\033Fô"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill98_25 = local6_life21;
        int __sourceSpill98_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill98_25)).substring(((int)(__sourceSpill98_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill98_30 = local8_life19;
        int __sourceSpill98_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill98_33 = new byte[8];
        (__sourceSpill98_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill98_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill98_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill98_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill98_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill98_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill98_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill98_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill98_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill98_34)).doFinal(((byte[])(__sourceSpill98_33)));
        (__sourceSpill98_30)[__sourceSpill98_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    l = ((long[])(local8_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1141_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/fm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.fm.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21370;
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
            throw new RuntimeException("com/moon/fm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


public void a(com.moon.event.PacketEvent p0) {
int forestValue56_38_0;
    int forestValue56_45_0;
    int forestValue56_52_0;
    int forestValue56_59_0;
    com.moon.fm forestValue56_61_0;
    com.moon.event.PacketEvent forestValue56_104_0;
    moom.yK forestValue56_105_0;
    int forestValue56_132_0;
    int forestValue56_139_0;
    int forestValue56_146_0;
    int forestValue56_151_0;
    int forestValue56_215_0;
    com.moon.fm forestValue56_245_0;
    int forestValue56_245_1;
    int forestValue56_250_0;
    int forestValue56_298_0;
    java.util.List forestValue56_311_0;
    int forestValue56_320_0;
    moom.yK forestValue56_322_0;
    com.moon.fm forestValue56_351_0;
    com.moon.event.PacketEvent spill56_0;
    int spill56_1;
    int spill56_2;
    int spill56_3;
    moom.yK spill56_4;
    com.moon.fm spill56_5;
    int spill56_6;
    int spill56_7;
    int spill56_8;
    com.moon.fm spill56_9;
    int spill56_10;
    int spill56_11;
    java.util.List spill56_12;
    java.util.List spill56_13;
    net.minecraft.client.network.NetHandlerPlayClient spill56_14;
    moom.yK spill56_15;
    com.moon.fm spill56_16;
    long life2_3;
    int[] life4_5;
    net.minecraft.block.Block life7_98;
    moom.yK life7_125;
    moom.y7 life5_134;
    net.minecraft.block.Block life7_205;
    moom.DT life7_309;
    net.minecraft.block.Block life8_315;
    moom.zB life6_364;
    double life7_383;
    forest_join_353: {
    forest_join_351: {
    forest_join_350: {
    forest_join_322: {
    forest_join_320: {
    forest_join_313: {
    forest_join_311: {
    forest_join_298: {
    forest_join_293: {
    forest_join_286: {
    forest_join_250: {
    forest_join_247: {
    forest_join_246: {
    forest_join_245: {
    forest_join_215: {
    forest_join_192: {
    forest_join_182: {
    forest_join_168: {
    forest_join_164: {
    forest_join_151: {
    forest_join_146: {
    forest_join_139: {
    forest_join_132: {
    forest_join_129: {
    forest_join_105: {
    forest_join_104: {
    forest_join_103: {
    forest_join_98: {
    forest_join_88: {
    forest_join_74: {
    forest_join_70: {
    forest_join_61: {
    forest_join_59: {
    forest_join_52: {
    forest_join_45: {
    forest_join_38: {
    forest_join_35: {
    life2_3 = (com.moon.fm.k ^ 87799199138297L);
    life4_5 = moom.bs.b__ArrayInt();
    spill56_0 = p0;
    if (!((life4_5 == null))) {
        forestValue56_104_0 = spill56_0;
        break forest_join_104;
    }
    if (!(((com.moon.event.PacketEvent)(spill56_0)).b__sourceReturn_aae029aa0a())) {
        break forest_join_103;
    }
    spill56_1 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.y6) ? 1 : 0);
    if (!((life4_5 == null))) {
        forestValue56_38_0 = spill56_1;
        break forest_join_38;
    }
    if (!((spill56_1 == 0))) {
        break forest_join_35;
    }
    spill56_2 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.za) ? 1 : 0);
    if (!((life4_5 == null))) {
        forestValue56_38_0 = spill56_2;
        break forest_join_38;
    }
    if (!((spill56_2 == 0))) {
        break forest_join_35;
    }
    spill56_3 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zb) ? 1 : 0);
    if (!((life4_5 == null))) {
        forestValue56_38_0 = spill56_3;
        break forest_join_38;
    }
    if (!((spill56_3 == 0))) {
        break forest_join_35;
    }
    spill56_4 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    if (!((life4_5 == null))) {
        forestValue56_105_0 = spill56_4;
        break forest_join_105;
    }
    if (!((((spill56_4 instanceof moom.zd) ? 1 : 0) != 0))) {
        break forest_join_103;
    }
    }
    forestValue56_38_0 = ((((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).a__jS())).j) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue56_45_0 = forestValue56_38_0;
        break forest_join_45;
    }
    if (!((forestValue56_38_0 != 0))) {
        break forest_join_353;
    }
    forestValue56_45_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).K)).b1)).c) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue56_52_0 = forestValue56_45_0;
        break forest_join_52;
    }
    if (!((forestValue56_45_0 == 0))) {
        break forest_join_353;
    }
    forestValue56_52_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).K)).b1)).b) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue56_59_0 = forestValue56_52_0;
        break forest_join_59;
    }
    if (!((forestValue56_52_0 == 0))) {
        break forest_join_353;
    }
    spill56_5 = this;
    if (!((life4_5 == null))) {
        forestValue56_61_0 = spill56_5;
        break forest_join_61;
    }
    forestValue56_59_0 = ((__sourceExactCall_9fa73d7d144c6b(((com.moon.fm)(spill56_5)))) ? 1 : 0);
    }
    if (!((forestValue56_59_0 == 0))) {
        break forest_join_353;
    }
    forestValue56_61_0 = this;
    }
    if (!((((com.moon.fm)(forestValue56_61_0)).f != null))) {
        break forest_join_353;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).K)).L)), ((float)(0x1.4p4f))) > 0))) {
        break forest_join_70;
    }
    return;
    }
    if (!((this.g == null))) {
        break forest_join_74;
    }
    return;
    }
    life7_98 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).I)).a__fE(((moom.DT)(this.g))))).a__ch();
    if (!((life4_5 == null))) {
        break forest_join_98;
    }
    if (!((((net.minecraft.block.Block)(life7_98)).a__fn() == moom.fn.a))) {
        break forest_join_88;
    }
    return;
    }
    ((java.util.List)(this.e)).add(((java.lang.Object)(((com.moon.event.PacketEvent)(p0)).getPacket())));
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    }
    if (!((life4_5 != null))) {
        break forest_join_353;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[5])));
    }
    forestValue56_104_0 = p0;
    }
    forestValue56_105_0 = ((com.moon.event.PacketEvent)(forestValue56_104_0)).getPacket();
    }
    life7_125 = forestValue56_105_0;
    spill56_6 = ((life7_125 instanceof moom.y7) ? 1 : 0);
    if (!((life4_5 == null))) {
        forestValue56_320_0 = spill56_6;
        break forest_join_320;
    }
    if (!((spill56_6 != 0))) {
        break forest_join_313;
    }
    life5_134 = ((moom.y7)(life7_125));
    spill56_7 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).K)).S;
    if (!((life4_5 == null))) {
        forestValue56_132_0 = spill56_7;
        break forest_join_132;
    }
    if (!((spill56_7 <= __sourceIntrinsic_0d28a2dd2629_invokedynamic56_51(3899, (7527410471023423937L ^ life2_3))))) {
        break forest_join_129;
    }
    ((java.util.List)(this.e)).clear();
    return;
    }
    forestValue56_132_0 = ((((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).a__jS())).j) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue56_139_0 = forestValue56_132_0;
        break forest_join_139;
    }
    if (!((forestValue56_132_0 != 0))) {
        break forest_join_353;
    }
    forestValue56_139_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).K)).b1)).c) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue56_146_0 = forestValue56_139_0;
        break forest_join_146;
    }
    if (!((forestValue56_139_0 == 0))) {
        break forest_join_353;
    }
    forestValue56_146_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).K)).b1)).b) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue56_151_0 = forestValue56_146_0;
        break forest_join_151;
    }
    if (!((forestValue56_146_0 == 0))) {
        break forest_join_353;
    }
    forestValue56_151_0 = ((__sourceExactCall_9fa73d7d144c6b(((com.moon.fm)(this)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue56_250_0 = forestValue56_151_0;
        break forest_join_250;
    }
    if (!((forestValue56_151_0 == 0))) {
        break forest_join_247;
    }
    if (!((this.f != null))) {
        break forest_join_353;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).K)).L)), ((float)(0x1.4p4f))) > 0))) {
        break forest_join_164;
    }
    return;
    }
    if (!((this.g == null))) {
        break forest_join_168;
    }
    return;
    }
    life7_205 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).I)).a__fE(((moom.DT)(this.g))))).a__ch();
    if (!((life4_5 == null))) {
        break forest_join_192;
    }
    if (!((((net.minecraft.block.Block)(life7_205)).a__fn() == moom.fn.a))) {
        break forest_join_182;
    }
    return;
    }
    ((java.util.List)(this.e)).add(((java.lang.Object)(((com.moon.event.PacketEvent)(p0)).getPacket())));
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    }
    spill56_8 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).K)).L)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.AntiVoid)(((com.moon.module.impl.AntiVoid)(((com.moon.fm)(this)).a())))).a__kZ())).getValue())))).floatValue())));
    if (!((life4_5 == null))) {
        forestValue56_215_0 = spill56_8;
        break forest_join_215;
    }
    if (!((spill56_8 > 0))) {
        break forest_join_246;
    }
    com.moon.fm __stackOp56_97_0 = this;
    spill56_9 = __stackOp56_97_0;
    spill56_10 = (((com.moon.fm)(__stackOp56_97_0)).i + 1);
    if (!((life4_5 == null))) {
        forestValue56_245_0 = spill56_9;
        forestValue56_245_1 = spill56_10;
        break forest_join_245;
    }
    com.moon.fm __stackOp56_99_0 = spill56_9;
    int __stackOp56_99_1 = spill56_10;
    spill56_11 = __stackOp56_99_1;
    ((com.moon.fm)(__stackOp56_99_0)).i = ((int)(__stackOp56_99_1));
    forestValue56_215_0 = spill56_11;
    }
    if (!((forestValue56_215_0 >= __sourceIntrinsic_0d28a2dd2629_invokedynamic56_101(23684, (6076585835853013631L ^ life2_3))))) {
        break forest_join_246;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).K)).cm)).b(((moom.yK)(new moom.y8(((moom.DR)(this.f)).a, (((moom.DR)(this.f)).b - 0x1.0p0d), ((moom.DR)(this.f)).c, false))));
    this.i = ((int)(0));
    forestValue56_245_0 = this;
    forestValue56_245_1 = 1;
    }
    ((com.moon.fm)(forestValue56_245_0)).h = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue56_245_1)));
    }
    break forest_join_353;
    }
    forestValue56_250_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue56_298_0 = forestValue56_250_0;
        break forest_join_298;
    }
    if (!((forestValue56_250_0 != 0))) {
        break forest_join_293;
    }
    this.f = ((moom.DR)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).K)).a__DR()));
    life7_309 = new moom.DT(((moom.DR)(this.f)).a, (((moom.DR)(this.f)).b - 0x1.0p0d), ((moom.DR)(this.f)).c);
    life8_315 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).I)).a__fE(((moom.DT)(life7_309))))).a__ch();
    if (!((((net.minecraft.block.Block)(life8_315)).a__fn() != moom.fn.a))) {
        break forest_join_286;
    }
    this.g = ((moom.DT)(life7_309));
    }
    this.i = ((int)(__sourceIntrinsic_0d28a2dd2629_invokedynamic56_135(13943, (2127768228707371151L ^ life2_3))));
    }
    spill56_12 = this.e;
    if (!((life4_5 == null))) {
        forestValue56_311_0 = spill56_12;
        break forest_join_311;
    }
    forestValue56_298_0 = ((((java.util.List)(spill56_12)).isEmpty()) ? 1 : 0);
    }
    if (!((forestValue56_298_0 == 0))) {
        break forest_join_353;
    }
    spill56_13 = this.e;
    net.minecraft.client.network.NetHandlerPlayClient __stackOp56_144_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fm.a)).K)).cm;
    spill56_14 = __stackOp56_144_0;
    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp56_144_0)));
    ((java.util.List)(spill56_13)).forEach(((java.util.function.Consumer)(__sourceIntrinsic_0d28a2dd2629_invokedynamic56_146(spill56_14))));
    forestValue56_311_0 = this.e;
    }
    ((java.util.List)(forestValue56_311_0)).clear();
    break forest_join_353;
    }
    life7_125 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    spill56_15 = life7_125;
    if (!((life4_5 == null))) {
        forestValue56_322_0 = spill56_15;
        break forest_join_322;
    }
    forestValue56_320_0 = ((spill56_15 instanceof moom.zB) ? 1 : 0);
    }
    if (!((forestValue56_320_0 != 0))) {
        break forest_join_353;
    }
    forestValue56_322_0 = life7_125;
    }
    life6_364 = ((moom.zB)(forestValue56_322_0));
    ((java.util.List)(this.e)).clear();
    this.h = ((boolean)(false));
    spill56_16 = this;
    if (!((life4_5 == null))) {
        forestValue56_351_0 = spill56_16;
        break forest_join_351;
    }
    if (!((((com.moon.fm)(spill56_16)).f != null))) {
        break forest_join_350;
    }
    life7_383 = (((moom.zB)(life6_364)).b() - ((moom.DR)(this.f)).b);
    if (!((recovery.source.CarrierOps.dcmpl(((double)(java.lang.Math.abs(((double)(life7_383))))), ((double)(0x1.0p1d))) > 0))) {
        break forest_join_350;
    }
    this.f = ((moom.DR)(null));
    }
    forestValue56_351_0 = this;
    }
    ((com.moon.fm)(forestValue56_351_0)).i = ((int)(0));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_0d28a2dd2629_invokedynamic56_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0d28a2dd2629_invokedynamic56_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0d28a2dd2629_invokedynamic56_135(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_0d28a2dd2629_invokedynamic56_146(net.minecraft.client.network.NetHandlerPlayClient a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1141_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);

private static native boolean __sourceExactCall_9fa73d7d144c6b(com.moon.fm p0);
}
