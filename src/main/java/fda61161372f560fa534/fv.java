package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class fv extends com.moon.e2<com.moon.module.impl.LongJump> {

private boolean e;

private boolean f;

private int g;

private boolean h;

private int i;

private double j;

private int k;

private int l;

private static final long m;

private static final long[] n;

private static final java.lang.Integer[] o;

private static final java.util.Map q;

public fv() {
super(com.moon.module.impl.LongJump.class);
    this.g = 0;
    this.i = 0;
    this.j = 0x0.0p+0d;
    this.k = 0;
    this.l = 0;
}


static {
m = ((long)(((moom._a)(moom._c.a(((long)(-349799939077600423L)), ((long)(6677622033610155493L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(165060543668468L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.fv.m ^ 45944388851122L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill101_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill101_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill101_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill101_14 = new byte[8];
    (__sourceSpill101_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill101_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation101_16 = __sourceSpill101_14;
    ((javax.crypto.Cipher)(__sourceSpill101_11)).init(((int)(__sourceSpill101_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill101_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation101_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "AÐcr¹\005æýí$!9¥&±k"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill101_25 = local6_life21;
        int __sourceSpill101_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill101_25)).substring(((int)(__sourceSpill101_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill101_30 = local8_life19;
        int __sourceSpill101_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill101_33 = new byte[8];
        (__sourceSpill101_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill101_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill101_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill101_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill101_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill101_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill101_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill101_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill101_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill101_34)).doFinal(((byte[])(__sourceSpill101_33)));
        (__sourceSpill101_30)[__sourceSpill101_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    n = ((long[])(local8_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
net.minecraft.client.Minecraft forwardValue195_39_0;
    net.minecraft.entity.Entity[] spill195_0;
    net.minecraft.client.Minecraft spill195_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_14;
    forward_join_47: {
    forward_join_42: {
    forward_join_39: {
    life1_3 = (com.moon.fv.m ^ 9455237582059L);
    this.e = ((boolean)(false));
    spill195_0 = net.minecraft.client.gui.GuiScreen.a__Arrayr3();
    this.f = ((boolean)(false));
    this.h = ((boolean)(false));
    life3_14 = spill195_0;
    this.i = ((int)(0));
    this.j = ((double)(0x0.0p0d));
    this.k = ((int)(0));
    this.l = ((int)(0));
    spill195_1 = com.moon.fv.a;
    if (!((life3_14 != null))) {
        forwardValue195_39_0 = spill195_1;
        break forward_join_39;
    }
    if (!((((net.minecraft.client.Minecraft)(spill195_1)).K != null))) {
        break forward_join_42;
    }
    this.g = ((int)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).S));
    com.moon.nO.a();
    forwardValue195_39_0 = com.moon.fv.a;
    }
    ((moom.DM)(((net.minecraft.client.Minecraft)(forwardValue195_39_0)).l)).c = ((float)(0x1.0p-1f));
    }
    if (!((life3_14 == null))) {
        break forward_join_47;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


public void c() {
net.minecraft.client.Minecraft forwardValue196_12_0;
    net.minecraft.client.Minecraft spill196_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_15: {
    forward_join_12: {
    life1_3 = (com.moon.fv.m ^ 104378915931020L);
    life3_5 = net.minecraft.client.gui.GuiScreen.a__Arrayr3();
    spill196_0 = com.moon.fv.a;
    if (!((life3_5 != null))) {
        forwardValue196_12_0 = spill196_0;
        break forward_join_12;
    }
    if (!((((net.minecraft.client.Minecraft)(spill196_0)).K != null))) {
        break forward_join_15;
    }
    forwardValue196_12_0 = com.moon.fv.a;
    }
    ((moom.DM)(((net.minecraft.client.Minecraft)(forwardValue196_12_0)).l)).c = ((float)(0x1.0p0f));
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.fv.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22738;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
            throw new RuntimeException("com/moon/fv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1161_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/fv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.event.MotionEvent p0) {
int forwardValue192_42_0;
    int forwardValue192_49_0;
    int forwardValue192_52_0;
    int forwardValue192_75_0;
    int forwardValue192_102_0;
    int forwardValue192_161_0;
    int forwardValue192_190_0;
    int forwardValue192_202_0;
    int forwardValue192_227_0;
    int forwardValue192_239_0;
    int forwardValue192_244_0;
    int forwardValue192_251_0;
    int forwardValue192_256_0;
    net.minecraft.entity.Entity[] spill192_0;
    boolean spill192_1;
    boolean spill192_2;
    boolean spill192_3;
    boolean spill192_4;
    boolean spill192_5;
    boolean spill192_6;
    int spill192_7;
    boolean spill192_8;
    int spill192_9;
    com.moon.event.MotionEvent spill192_10;
    double spill192_11;
    com.moon.event.MotionEvent spill192_12;
    double spill192_13;
    long life2_3;
    int life5_6;
    net.minecraft.entity.Entity[] life4_7;
    double life6_17;
    double life6_227;
    forward_join_274: {
    forward_join_269: {
    forward_join_263: {
    forward_join_256: {
    forward_join_251: {
    forward_join_244: {
    forward_join_239: {
    forward_join_238: {
    forward_join_227: {
    forward_join_223: {
    forward_join_202: {
    forward_join_198: {
    forward_join_190: {
    forward_join_187: {
    forward_join_184: {
    forward_join_161: {
    forward_join_142: {
    forward_join_102: {
    forward_join_100: {
    forward_join_75: {
    forward_join_72: {
    forward_join_52: {
    forward_join_50: {
    forward_join_49: {
    forward_join_48: {
    forward_join_42: {
    forward_join_35: {
    life2_3 = (com.moon.fv.m ^ 96124403622614L);
    spill192_0 = net.minecraft.client.gui.GuiScreen.a__Arrayr3();
    life5_6 = 0;
    life4_7 = spill192_0;
    spill192_1 = this.e;
    if (!((life4_7 != null))) {
        forwardValue192_52_0 = ((spill192_1) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill192_1)) {
        break forward_join_50;
    }
    life6_17 = 0x1.3db22d0e56042p-1d;
    spill192_2 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)));
    if (!((life4_7 != null))) {
        forwardValue192_42_0 = ((spill192_2) ? 1 : 0);
        break forward_join_42;
    }
    if (!(spill192_2)) {
        break forward_join_35;
    }
    life6_17 = (life6_17 * (0x1.0p0d + (0x1.3333333333333p-3d * ((double) ((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d))))).c()))));
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(life6_17)));
    forwardValue192_42_0 = recovery.source.CarrierOps.dcmpl(((double)(this.j)), ((double)(0x1.8p1d)));
    }
    if (!((life4_7 != null))) {
        forwardValue192_49_0 = forwardValue192_42_0;
        break forward_join_49;
    }
    if (!((forwardValue192_42_0 >= 0))) {
        break forward_join_48;
    }
    this.e = ((boolean)(false));
    }
    forwardValue192_49_0 = 1;
    }
    life5_6 = forwardValue192_49_0;
    }
    forwardValue192_52_0 = ((this.f) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        forwardValue192_75_0 = forwardValue192_52_0;
        break forward_join_75;
    }
    if (!((forwardValue192_52_0 != 0))) {
        break forward_join_72;
    }
    spill192_3 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).A;
    if (!((life4_7 != null))) {
        forwardValue192_75_0 = ((spill192_3) ? 1 : 0);
        break forward_join_75;
    }
    if (!(spill192_3)) {
        break forward_join_72;
    }
    spill192_4 = this.h;
    if (!((life4_7 != null))) {
        forwardValue192_75_0 = ((spill192_4) ? 1 : 0);
        break forward_join_75;
    }
    if (!((!spill192_4))) {
        break forward_join_72;
    }
    ((com.moon.module.impl.LongJump)(((com.moon.module.impl.LongJump)(((com.moon.fv)(this)).a())))).setEnabled(((boolean)(false)));
    return;
    }
    forwardValue192_75_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        forwardValue192_102_0 = forwardValue192_75_0;
        break forward_join_102;
    }
    if (!((forwardValue192_75_0 != 0))) {
        break forward_join_100;
    }
    spill192_5 = this.h;
    if (!((life4_7 != null))) {
        forwardValue192_102_0 = ((spill192_5) ? 1 : 0);
        break forward_join_102;
    }
    if (!((!spill192_5))) {
        break forward_join_100;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).u = ((double)(0x1.a3d70a3d70a3dp-1d));
    ((com.moon.event.MotionEvent)(p0)).setMotionY(((double)(0x1.2p3d)));
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(0x1.947ae147ae148p-1d)));
    this.e = ((boolean)(true));
    this.f = ((boolean)(true));
    }
    forwardValue192_102_0 = ((this.h) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        forwardValue192_190_0 = forwardValue192_102_0;
        break forward_join_190;
    }
    if (!((forwardValue192_102_0 != 0))) {
        break forward_join_187;
    }
    spill192_6 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).A;
    if (!((life4_7 != null))) {
        forwardValue192_190_0 = ((spill192_6) ? 1 : 0);
        break forward_join_190;
    }
    if (!(spill192_6)) {
        break forward_join_187;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).u = ((double)(0x1.3333333333333p-3d));
    com.moon.fv __stackOp192_51_0 = this;
    com.moon.fv __stackOp192_53_0 = __stackOp192_51_0;
    int __stackOp192_53_1 = ((com.moon.fv)(__stackOp192_51_0)).i;
    spill192_7 = __stackOp192_53_1;
    ((com.moon.fv)(__stackOp192_53_0)).i = ((int)((__stackOp192_53_1 + 1)));
    if (!((life4_7 != null))) {
        forwardValue192_161_0 = spill192_7;
        break forward_join_161;
    }
    if (!((spill192_7 > 0))) {
        break forward_join_142;
    }
    this.h = ((boolean)(false));
    this.i = ((int)(0));
    this.g = ((int)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).S));
    com.moon.fv __stackOp192_61_0 = this;
    ((com.moon.fv)(__stackOp192_61_0)).l = ((int)((((com.moon.fv)(__stackOp192_61_0)).l + 1)));
    }
    forwardValue192_161_0 = ((((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).I)).a__fE(((moom.DT)(new moom.DT(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).n, (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).o - 0x1.0p0d), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).p)))))).a__ch() instanceof moom.ci) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        forwardValue192_190_0 = forwardValue192_161_0;
        break forward_join_190;
    }
    if (!((forwardValue192_161_0 != 0))) {
        break forward_join_187;
    }
    life6_227 = 0x1.35c28f5c28f5cp-1d;
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d))))) {
        break forward_join_184;
    }
    life6_227 = (life6_227 * (0x1.0p0d + (0x1.3333333333333p-3d * ((double) ((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d))))).c()))));
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(life6_227)));
    }
    forwardValue192_190_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        forwardValue192_202_0 = forwardValue192_190_0;
        break forward_join_202;
    }
    if (!((forwardValue192_190_0 != 0))) {
        break forward_join_198;
    }
    spill192_8 = this.h;
    if (!((life4_7 != null))) {
        forwardValue192_202_0 = ((spill192_8) ? 1 : 0);
        break forward_join_202;
    }
    if (!(spill192_8)) {
        break forward_join_269;
    }
    }
    forwardValue192_202_0 = recovery.source.CarrierOps.dcmpg(((double)(((com.moon.event.MotionEvent)(p0)).getMotionY())), ((double)(0x0.0p0d)));
    }
    if (!((life4_7 != null))) {
        forwardValue192_227_0 = forwardValue192_202_0;
        break forward_join_227;
    }
    if (!((forwardValue192_202_0 < 0))) {
        break forward_join_223;
    }
    spill192_9 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).S % 2);
    if (!((life4_7 != null))) {
        forwardValue192_227_0 = spill192_9;
        break forward_join_227;
    }
    if (!((spill192_9 == 0))) {
        break forward_join_223;
    }
    spill192_10 = p0;
    net.minecraft.client.entity.EntityPlayerSP __stackOp192_101_0 = ((net.minecraft.client.Minecraft)(com.moon.fv.a)).K;
    double __stackOp192_101_1 = -0x1.8db8bac710cb3p-4d;
    spill192_11 = __stackOp192_101_1;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp192_101_0)).u = ((double)(__stackOp192_101_1));
    ((com.moon.event.MotionEvent)(spill192_10)).setMotionY(((double)(spill192_11)));
    if (!((life4_7 == null))) {
        break forward_join_238;
    }
    }
    forwardValue192_227_0 = recovery.source.CarrierOps.dcmpg(((double)(((com.moon.event.MotionEvent)(p0)).getMotionY())), ((double)(0x1.1eb851eb851ecp-4d)));
    }
    if (!((life4_7 != null))) {
        forwardValue192_239_0 = forwardValue192_227_0;
        break forward_join_239;
    }
    if (!((forwardValue192_227_0 <= 0))) {
        break forward_join_238;
    }
    spill192_12 = p0;
    net.minecraft.client.entity.EntityPlayerSP __stackOp192_108_0 = ((net.minecraft.client.Minecraft)(com.moon.fv.a)).K;
    double __stackOp192_108_1 = -0x1.2f1a9fbe76c8bp-3d;
    spill192_13 = __stackOp192_108_1;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp192_108_0)).u = ((double)(__stackOp192_108_1));
    ((com.moon.event.MotionEvent)(spill192_12)).setMotionY(((double)(spill192_13)));
    }
    forwardValue192_239_0 = life5_6;
    }
    if (!((life4_7 != null))) {
        forwardValue192_244_0 = forwardValue192_239_0;
        break forward_join_244;
    }
    if (!((forwardValue192_239_0 == 0))) {
        break forward_join_269;
    }
    forwardValue192_244_0 = ((this.h) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        forwardValue192_251_0 = forwardValue192_244_0;
        break forward_join_251;
    }
    if (!((forwardValue192_244_0 != 0))) {
        break forward_join_263;
    }
    forwardValue192_251_0 = (this.l % 5);
    }
    if (!((life4_7 != null))) {
        forwardValue192_256_0 = forwardValue192_251_0;
        break forward_join_256;
    }
    if (!((forwardValue192_251_0 == 0))) {
        break forward_join_263;
    }
    forwardValue192_256_0 = this.l;
    }
    if (!((forwardValue192_256_0 > 0))) {
        break forward_join_263;
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(com.moon.nJ.a(((double)(0x1.851eb851eb852p-2d))))));
    if (!((life4_7 == null))) {
        break forward_join_269;
    }
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)((com.moon.nJ.a(((double)(0x1.851eb851eb852p-2d))) * 0x1.4p0d))));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_274;
    }
    net.minecraft.client.gui.GuiScreen.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
    return;
}


public void a(com.moon.ez p0) {
int forwardValue194_36_0;
    int forwardValue194_36_1;
    int forwardValue194_39_0;
    int forwardValue194_58_0;
    int spill194_0;
    int spill194_1;
    int spill194_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_59: {
    forward_join_58: {
    forward_join_39: {
    forward_join_36: {
    forward_join_23: {
    life2_3 = (com.moon.fv.m ^ 67795555353445L);
    life4_5 = net.minecraft.client.gui.GuiScreen.a__Arrayr3();
    spill194_0 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).S - this.g);
    spill194_1 = __sourceIntrinsic_73942bf99565_invokedynamic194_6(16536, (1524098952733541184L ^ life2_3));
    if (!((life4_5 != null))) {
        forwardValue194_36_0 = spill194_0;
        forwardValue194_36_1 = spill194_1;
        break forward_join_36;
    }
    if (!((spill194_0 == spill194_1))) {
        break forward_join_23;
    }
    this.h = ((boolean)(true));
    }
    spill194_2 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).S - this.g);
    if (!((life4_5 != null))) {
        forwardValue194_39_0 = spill194_2;
        break forward_join_39;
    }
    forwardValue194_36_0 = spill194_2;
    forwardValue194_36_1 = __sourceIntrinsic_73942bf99565_invokedynamic194_12(20415, (3029082265013079142L ^ life2_3));
    }
    if (!((forwardValue194_36_0 > forwardValue194_36_1))) {
        break forward_join_59;
    }
    forwardValue194_39_0 = ((this.h) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue194_58_0 = forwardValue194_39_0;
        break forward_join_58;
    }
    if (!((forwardValue194_39_0 != 0))) {
        break forward_join_59;
    }
    forwardValue194_58_0 = ((((java.util.List)(((com.moon.ez)(p0)).a())).add(((java.lang.Object)(new moom.CA(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).n, java.lang.Math.floor(((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).o))), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).K)).p))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue194_58_0);
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_31: {
    forward_join_18: {
    life2_3 = (com.moon.fv.m ^ 4905180945435L);
    life4_5 = net.minecraft.client.gui.GuiScreen.a__Arrayr3();
    if (!((life4_5 != null))) { break forward_join_18; }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) { break forward_join_31; }
    com.moon.fv __stackOp193_4_0 = this;
    ((com.moon.fv)(__stackOp193_4_0)).j = ((double)((((com.moon.fv)(__stackOp193_4_0)).j + 0x1.0p0d)));
    }
    com.moon.fv __stackOp193_7_0 = this;
    com.moon.fv __stackOp193_9_0 = __stackOp193_7_0;
    int __stackOp193_9_1 = (((com.moon.fv)(__stackOp193_7_0)).k + 1);
    int spill193_0 = __stackOp193_9_1;
    ((com.moon.fv)(__stackOp193_9_0)).k = ((int)(__stackOp193_9_1));
    if (!((spill193_0 >= 5))) { break forward_join_31; }
    ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.fv.a)).l)).c = ((float)(0x1.0p0f));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_73942bf99565_invokedynamic194_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73942bf99565_invokedynamic194_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1161_0() throws E;
}
