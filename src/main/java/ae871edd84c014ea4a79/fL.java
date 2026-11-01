package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class fL extends com.moon.e2<com.moon.module.impl.Step> {

private boolean e;

private boolean f;

private boolean g;

private double h;

private double i;

private double j;

private moom.CA k;

private int l;

private double m;

private static final long n;

private static final java.lang.String o;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map s;

public fL() {
super(com.moon.module.impl.Step.class);
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-8355822771320991041L)), ((long)(7701430958471585717L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(120036193639482L)))));
    long local11_life6 = (com.moon.fL.n ^ 52227375909750L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill92_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill92_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill92_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill92_13 = new byte[8];
    (__sourceSpill92_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill92_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation92_15 = __sourceSpill92_13;
    ((javax.crypto.Cipher)(__sourceSpill92_10)).init(((int)(__sourceSpill92_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill92_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation92_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill92_19 = ((java.lang.String)("KfÔiÜîOQ¾\004\022w\027")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill92_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill92_20)).doFinal(((byte[])(__sourceSpill92_19)));
    o = ((java.lang.String)(((java.lang.String)(com.moon.fL.a(((byte[])(local15_life22))))).intern()));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill92_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill92_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill92_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill92_33 = new byte[8];
    (__sourceSpill92_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill92_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation92_35 = __sourceSpill92_33;
    ((javax.crypto.Cipher)(__sourceSpill92_30)).init(((int)(__sourceSpill92_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill92_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation92_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[2];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "îA\020°àû^óQò\006Àhù<"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill92_44 = local4_life40;
        int __sourceSpill92_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill92_44)).substring(((int)(__sourceSpill92_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill92_49 = local6_life38;
        int __sourceSpill92_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill92_52 = new byte[8];
        (__sourceSpill92_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill92_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill92_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill92_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill92_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill92_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill92_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill92_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill92_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill92_53)).doFinal(((byte[])(__sourceSpill92_52)));
        (__sourceSpill92_49)[__sourceSpill92_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    q = ((long[])(local6_life38));
    r = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11751;
      if (r[var3] == null) {
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
         long var5 = q[var3];
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
         Object[] var9 = (Object[])s.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               s.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/fL", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         r[var3] = var15;
      }

      return r[var3];
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
        byte[] spill260_0 = p0;
        life4_9 += 1;
        life5_44 = (spill260_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill260_1 = p0;
        life4_9 += 1;
        life5_76 = (spill260_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill260_2 = p0;
        life4_9 += 1;
        life5_91 = (spill260_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(com.moon.dQ p0) {
int forwardValue119_13_0;
    int forwardValue119_18_0;
    boolean spill119_0;
    long life2_3;
    int life4_5;
    forward_join_23: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (com.moon.fL.n ^ 8962752036382L);
    life4_5 = net.minecraft.tileentity.TileEntity.f();
    spill119_0 = this.g;
    if (!((life4_5 != 0))) {
        forwardValue119_13_0 = ((spill119_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill119_0))) {
        break forward_join_19;
    }
    forwardValue119_13_0 = ((this.e) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue119_18_0 = forwardValue119_13_0;
        break forward_join_18;
    }
    if (!((forwardValue119_13_0 == 0))) {
        break forward_join_19;
    }
    forwardValue119_18_0 = ((this.f) ? 1 : 0);
    }
    if (!((forwardValue119_18_0 != 0))) {
        break forward_join_23;
    }
    }
    ((com.moon.dQ)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.fL.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1060_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/fL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.event.TickEvent p0) {
int forestValue26_33_0;
    int forestValue26_40_0;
    int forestValue26_46_0;
    int forestValue26_51_0;
    int forestValue26_83_0;
    net.minecraft.client.entity.EntityPlayerSP forestValue26_106_0;
    com.moon.fL forestValue26_109_0;
    int forestValue26_120_0;
    com.moon.fL forestValue26_134_0;
    int forestValue26_134_1;
    int spill26_0;
    boolean spill26_1;
    boolean spill26_2;
    com.moon.fL spill26_3;
    double spill26_4;
    net.minecraft.client.entity.EntityPlayerSP spill26_5;
    com.moon.fL spill26_6;
    int spill26_7;
    int spill26_8;
    long life2_3;
    int life4_10;
    com.moon.fU life5_22;
    forest_join_135: {
    forest_join_134: {
    forest_join_120: {
    forest_join_111: {
    forest_join_109: {
    forest_join_108: {
    forest_join_106: {
    forest_join_83: {
    forest_join_80: {
    forest_join_51: {
    forest_join_46: {
    forest_join_44: {
    forest_join_43: {
    forest_join_40: {
    forest_join_33: {
    forest_join_19: {
    forest_join_18: {
    life2_3 = (com.moon.fL.n ^ 67799989923972L);
    spill26_0 = net.minecraft.tileentity.TileEntity.f();
    ((com.moon.module.impl.Step)(((com.moon.module.impl.Step)(((com.moon.fL)(this)).a())))).setSuffix(((java.lang.String)(com.moon.fL.o)));
    life4_10 = spill26_0;
    if (!((((net.minecraft.client.Minecraft)(com.moon.fL.a)).K != null))) {
        break forest_join_18;
    }
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.POST))) {
        break forest_join_19;
    }
    }
    return;
    }
    life5_22 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    spill26_1 = ((com.moon.module.Module)(((com.moon.fU)(life5_22)).a(((java.lang.Class)(com.moon.module.impl.ScaffoldWalk.class))))).isEnabled();
    if (!((life4_10 != 0))) {
        forestValue26_33_0 = ((spill26_1) ? 1 : 0);
        break forest_join_33;
    }
    if (!((!spill26_1))) {
        break forest_join_43;
    }
    forestValue26_33_0 = ((((com.moon.module.Module)(((com.moon.fU)(life5_22)).a(((java.lang.Class)(com.moon.module.impl.Speed.class))))).isEnabled()) ? 1 : 0);
    }
    if (!((life4_10 != 0))) {
        forestValue26_40_0 = forestValue26_33_0;
        break forest_join_40;
    }
    if (!((forestValue26_33_0 == 0))) {
        break forest_join_43;
    }
    forestValue26_40_0 = ((((com.moon.module.Module)(((com.moon.fU)(life5_22)).a(((java.lang.Class)(com.moon.module.impl.Flight.class))))).isEnabled()) ? 1 : 0);
    }
    if (!((life4_10 != 0))) {
        forestValue26_46_0 = forestValue26_40_0;
        break forest_join_46;
    }
    if (!((forestValue26_40_0 != 0))) {
        break forest_join_44;
    }
    }
    return;
    }
    forestValue26_46_0 = ((this.g) ? 1 : 0);
    }
    if (!((life4_10 != 0))) {
        forestValue26_51_0 = forestValue26_46_0;
        break forest_join_51;
    }
    if (!((forestValue26_46_0 != 0))) {
        break forest_join_135;
    }
    forestValue26_51_0 = ((this.f) ? 1 : 0);
    }
    if (!((life4_10 != 0))) {
        forestValue26_83_0 = forestValue26_51_0;
        break forest_join_83;
    }
    if (!((forestValue26_51_0 != 0))) {
        break forest_join_80;
    }
    spill26_2 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).A;
    if (!((life4_10 != 0))) {
        forestValue26_120_0 = ((spill26_2) ? 1 : 0);
        break forest_join_120;
    }
    if (!(spill26_2)) {
        break forest_join_111;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).D__sourceReturn_da8c82d5d4();
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).u = ((double)(0x1.ade7ea5f84cadp-2d));
    this.e = ((boolean)(true));
    this.f = ((boolean)(false));
    this.m = ((double)(0x0.0p0d));
    com.moon.nJ.a__Void(((double)(0x0.0p0d)));
    if (!((life4_10 == 0))) {
        break forest_join_111;
    }
    }
    forestValue26_83_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_10 != 0))) {
        forestValue26_120_0 = forestValue26_83_0;
        break forest_join_120;
    }
    if (!((forestValue26_83_0 == 0))) {
        break forest_join_111;
    }
    spill26_3 = this;
    if (!((life4_10 != 0))) {
        forestValue26_109_0 = spill26_3;
        break forest_join_109;
    }
    com.moon.fL __stackOp26_46_0 = spill26_3;
    com.moon.fL __stackOp26_48_0 = __stackOp26_46_0;
    double __stackOp26_48_1 = (((com.moon.fL)(__stackOp26_46_0)).m + 0x1.0p0d);
    spill26_4 = __stackOp26_48_1;
    ((com.moon.fL)(__stackOp26_48_0)).m = ((double)(__stackOp26_48_1));
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill26_4)), ((double)(0x1.8p1d))) == 0))) {
        break forest_join_108;
    }
    spill26_5 = ((net.minecraft.client.Minecraft)(com.moon.fL.a)).K;
    if (!((life4_10 != 0))) {
        forestValue26_106_0 = spill26_5;
        break forest_join_106;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(spill26_5)).ae())) {
        break forest_join_108;
    }
    forestValue26_106_0 = ((net.minecraft.client.Minecraft)(com.moon.fL.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forestValue26_106_0)).u = ((double)(0x0.0p0d));
    }
    forestValue26_109_0 = this;
    }
    ((com.moon.fL)(forestValue26_109_0)).e = ((boolean)(false));
    }
    com.moon.fL __stackOp26_58_0 = this;
    spill26_6 = __stackOp26_58_0;
    spill26_7 = (((com.moon.fL)(__stackOp26_58_0)).l + 1);
    if (!((life4_10 != 0))) {
        forestValue26_134_0 = spill26_6;
        forestValue26_134_1 = spill26_7;
        break forest_join_134;
    }
    com.moon.fL __stackOp26_60_0 = spill26_6;
    int __stackOp26_60_1 = spill26_7;
    spill26_8 = __stackOp26_60_1;
    ((com.moon.fL)(__stackOp26_60_0)).l = ((int)(__stackOp26_60_1));
    forestValue26_120_0 = spill26_8;
    }
    if (!((forestValue26_120_0 >= __sourceIntrinsic_be06bc302d53_invokedynamic26_62(19701, (637804731184144393L ^ life2_3))))) {
        break forest_join_135;
    }
    this.g = ((boolean)(false));
    this.e = ((boolean)(false));
    forestValue26_134_0 = this;
    forestValue26_134_1 = 0;
    }
    ((com.moon.fL)(forestValue26_134_0)).f = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue26_134_1)));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
return;
}


public void a(com.moon.dU p0) {
int lexicalValue27_20_0;
    int lexicalValue27_27_0;
    int lexicalValue27_33_0;
    int lexicalValue27_43_0;
    int lexicalValue27_59_0;
    int lexicalValue27_67_0;
    net.minecraft.client.entity.EntityPlayerSP lexicalValue27_102_0;
    int lexicalValue27_116_0;
    int lexicalValue27_118_0;
    int lexicalValue27_207_0;
    int lexicalValue27_211_0;
    int lexicalValue27_213_0;
    double lexicalValue27_302_0;
    int spill27_0;
    boolean spill27_1;
    boolean spill27_2;
    net.minecraft.client.entity.EntityPlayerSP spill27_3;
    net.minecraft.client.entity.EntityPlayerSP spill27_4;
    net.minecraft.client.entity.EntityPlayerSP spill27_5;
    net.minecraft.client.entity.EntityPlayerSP spill27_6;
    int spill27_7;
    boolean spill27_8;
    int spill27_9;
    double spill27_10;
    double spill27_11;
    long life2_3;
    com.moon.fU life5_7;
    int life4_8;
    double life6_169;
    int life8_182;
    double life9_187;
    double life11_190;
    double life13_193;
    double life15_195;
    java.util.List life17_216;
    moom.CA life18_220;
    java.util.Iterator life19_223;
    moom.CA life20_230;
    int life19_295;
    java.util.Iterator life20_298;
    moom.CA life21_305;
    java.util.Iterator life20_335;
    moom.CA life21_342;
    double life20_408;
    double life22_411;
    double life24_414;
    moom.CA life26_418;
    java.util.List life27_440;
    moom.CA life28_444;
    moom.CA life29_450;
    double life30_453;
    java.util.Iterator life32_456;
    moom.CA life33_463;
    double life32_483;
    java.util.Iterator life34_486;
    moom.CA life35_493;
    double life34_513;
    java.util.Iterator life36_516;
    moom.CA life37_523;
    moom.CA life36_545;
    double life37_548;
    java.util.Iterator life39_551;
    moom.CA life40_558;
    double life39_578;
    java.util.Iterator life41_581;
    moom.CA life42_588;
    double life41_608;
    java.util.Iterator life43_611;
    moom.CA life44_618;
    double life43_644;
    double life45_652;
    java.util.Iterator life47_700;
    moom.CA life48_707;
    lexical_join_648: {
    lexical_join_643: {
    lexical_join_640: {
    lexical_join_634: {
    lexical_join_599: {
    lexical_join_588: {
    lexical_join_565: {
    lexical_join_561: {
    lexical_join_551: {
    lexical_join_513: {
    lexical_join_507: {
    lexical_join_486: {
    lexical_join_480: {
    lexical_join_459: {
    lexical_join_453: {
    lexical_join_427: {
    lexical_join_421: {
    lexical_join_400: {
    lexical_join_394: {
    lexical_join_373: {
    lexical_join_367: {
    lexical_join_302: {
    lexical_join_300: {
    lexical_join_282: {
    lexical_join_271: {
    lexical_join_248: {
    lexical_join_237: {
    lexical_join_213: {
    lexical_join_212: {
    lexical_join_211: {
    lexical_join_210: {
    lexical_join_207: {
    lexical_join_191: {
    lexical_join_180: {
    lexical_join_118: {
    lexical_join_117: {
    lexical_join_116: {
    lexical_join_102: {
    lexical_join_100: {
    lexical_join_67: {
    lexical_join_59: {
    lexical_join_57: {
    lexical_join_43: {
    lexical_join_41: {
    lexical_join_33: {
    lexical_join_31: {
    lexical_join_30: {
    lexical_join_27: {
    lexical_join_20: {
    life2_3 = (com.moon.fL.n ^ 11205794169951L);
    spill27_0 = net.minecraft.tileentity.TileEntity.g();
    life5_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    life4_8 = spill27_0;
    spill27_1 = ((com.moon.module.Module)(((com.moon.fU)(life5_7)).a(((java.lang.Class)(com.moon.module.impl.ScaffoldWalk.class))))).isEnabled();
    if (!((life4_8 == 0))) {
        lexicalValue27_20_0 = ((spill27_1) ? 1 : 0);
        break lexical_join_20;
    }
    if (!((!spill27_1))) {
        break lexical_join_30;
    }
    lexicalValue27_20_0 = ((((com.moon.module.Module)(((com.moon.fU)(life5_7)).a(((java.lang.Class)(com.moon.module.impl.Speed.class))))).isEnabled()) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        lexicalValue27_27_0 = lexicalValue27_20_0;
        break lexical_join_27;
    }
    if (!((lexicalValue27_20_0 == 0))) {
        break lexical_join_30;
    }
    lexicalValue27_27_0 = ((((com.moon.module.Module)(((com.moon.fU)(life5_7)).a(((java.lang.Class)(com.moon.module.impl.Flight.class))))).isEnabled()) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        lexicalValue27_33_0 = lexicalValue27_27_0;
        break lexical_join_33;
    }
    if (!((lexicalValue27_27_0 != 0))) {
        break lexical_join_31;
    }
    }
    return;
    }
    lexicalValue27_33_0 = ((this.g) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        lexicalValue27_43_0 = lexicalValue27_33_0;
        break lexical_join_43;
    }
    if (!((lexicalValue27_33_0 != 0))) {
        break lexical_join_41;
    }
    ((com.moon.dU)(p0)).a(((float)(0x1.333334p-1f)));
    return;
    }
    lexicalValue27_43_0 = ((((com.moon.dU)(p0)).b__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        lexicalValue27_59_0 = lexicalValue27_43_0;
        break lexical_join_59;
    }
    if (!((lexicalValue27_43_0 != 0))) {
        break lexical_join_57;
    }
    spill27_2 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).A;
    if (!((life4_8 == 0))) {
        lexicalValue27_59_0 = ((spill27_2) ? 1 : 0);
        break lexical_join_59;
    }
    if (!((!spill27_2))) {
        break lexical_join_57;
    }
    ((com.moon.dU)(p0)).a(((float)(0x1.333334p-1f)));
    return;
    }
    lexicalValue27_59_0 = ((((com.moon.dU)(p0)).b__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        lexicalValue27_67_0 = lexicalValue27_59_0;
        break lexical_join_67;
    }
    if (!((lexicalValue27_59_0 != 0))) {
        break lexical_join_100;
    }
    spill27_3 = ((net.minecraft.client.Minecraft)(com.moon.fL.a)).K;
    if (!((life4_8 == 0))) {
        lexicalValue27_102_0 = spill27_3;
        break lexical_join_102;
    }
    lexicalValue27_67_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill27_3)).C) ? 1 : 0);
    }
    if (!((lexicalValue27_67_0 != 0))) {
        break lexical_join_100;
    }
    spill27_4 = ((net.minecraft.client.Minecraft)(com.moon.fL.a)).K;
    if (!((life4_8 == 0))) {
        lexicalValue27_102_0 = spill27_4;
        break lexical_join_102;
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(spill27_4)).I__Boolean()))) {
        break lexical_join_100;
    }
    spill27_5 = ((net.minecraft.client.Minecraft)(com.moon.fL.a)).K;
    if (!((life4_8 == 0))) {
        lexicalValue27_102_0 = spill27_5;
        break lexical_join_102;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(spill27_5)).A)) {
        break lexical_join_100;
    }
    spill27_6 = ((net.minecraft.client.Minecraft)(com.moon.fL.a)).K;
    if (!((life4_8 == 0))) {
        lexicalValue27_102_0 = spill27_6;
        break lexical_join_102;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(spill27_6)).by != __sourceIntrinsic_a4ef4997ea40_invokedynamic27_41(23335, (9087772969546466049L ^ life2_3))))) {
        break lexical_join_100;
    }
    this.k = ((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b()));
    ((com.moon.dU)(p0)).a(((float)(0x1.0p0f)));
    }
    lexicalValue27_102_0 = ((net.minecraft.client.Minecraft)(com.moon.fL.a)).K;
    }
    life6_169 = (((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(lexicalValue27_102_0)).b())).c - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).o);
    spill27_7 = recovery.source.CarrierOps.dcmpl(((double)(life6_169)), ((double)(0x1.3333333333333p-1d)));
    if (!((life4_8 == 0))) {
        lexicalValue27_116_0 = spill27_7;
        break lexical_join_116;
    }
    if (!((spill27_7 > 0))) {
        break lexical_join_117;
    }
    lexicalValue27_116_0 = 1;
    }
    lexicalValue27_118_0 = lexicalValue27_116_0;
    break lexical_join_118;
    }
    lexicalValue27_118_0 = 0;
    }
    life8_182 = lexicalValue27_118_0;
    if (!((life8_182 != 0))) {
        break lexical_join_643;
    }
    life9_187 = this.h;
    life11_190 = this.i;
    life13_193 = this.j;
    life15_195 = 0x1.3333333333333p-1d;
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).a(((moom.CA)(this.k)));
    life17_216 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).I)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)), ((moom.CA)(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b())).a(((double)(this.h)), ((double)(this.i)), ((double)(this.j))))));
    life18_220 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b();
    life19_223 = ((java.util.List)(life17_216)).iterator();
    lexical_cycle_160: while (true) {
    if (!(((java.util.Iterator)(life19_223)).hasNext())) {
        break lexical_join_180;
    }
    life20_230 = ((moom.CA)(((java.util.Iterator)(life19_223)).next()));
    this.i = ((double)(((moom.CA)(life20_230)).b(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b())), ((double)(this.i)))));
    if (!((life4_8 == 0))) {
        break lexical_join_191;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_160; }
    break lexical_cycle_160;
    }
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).a(((moom.CA)(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b())).c(((double)(0x0.0p0d)), ((double)(this.i)), ((double)(0x0.0p0d))))));
    }
    spill27_8 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).A;
    if (!((life4_8 == 0))) {
        lexicalValue27_211_0 = ((spill27_8) ? 1 : 0);
        break lexical_join_211;
    }
    if (!((!spill27_8))) {
        break lexical_join_210;
    }
    spill27_9 = recovery.source.CarrierOps.dcmpl(((double)(life11_190)), ((double)(this.i)));
    if (!((life4_8 == 0))) {
        lexicalValue27_207_0 = spill27_9;
        break lexical_join_207;
    }
    if (!((spill27_9 != 0))) {
        break lexical_join_212;
    }
    lexicalValue27_207_0 = recovery.source.CarrierOps.dcmpg(((double)(life11_190)), ((double)(0x0.0p0d)));
    }
    if (!((life4_8 == 0))) {
        lexicalValue27_211_0 = lexicalValue27_207_0;
        break lexical_join_211;
    }
    if (!((lexicalValue27_207_0 < 0))) {
        break lexical_join_212;
    }
    }
    lexicalValue27_211_0 = 1;
    }
    lexicalValue27_213_0 = lexicalValue27_211_0;
    break lexical_join_213;
    }
    lexicalValue27_213_0 = 0;
    }
    life19_295 = lexicalValue27_213_0;
    life20_298 = ((java.util.List)(life17_216)).iterator();
    lexical_cycle_217: while (true) {
    if (!(((java.util.Iterator)(life20_298)).hasNext())) {
        break lexical_join_237;
    }
    life21_305 = ((moom.CA)(((java.util.Iterator)(life20_298)).next()));
    this.h = ((double)(((moom.CA)(life21_305)).a(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b())), ((double)(this.h)))));
    if (!((life4_8 == 0))) {
        break lexical_join_248;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_217; }
    break lexical_cycle_217;
    }
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).a(((moom.CA)(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b())).c(((double)(this.h)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d))))));
    }
    life20_335 = ((java.util.List)(life17_216)).iterator();
    lexical_cycle_251: while (true) {
    if (!(((java.util.Iterator)(life20_335)).hasNext())) {
        break lexical_join_271;
    }
    life21_342 = ((moom.CA)(((java.util.Iterator)(life20_335)).next()));
    this.j = ((double)(((moom.CA)(life21_342)).c(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b())), ((double)(this.j)))));
    if (!((life4_8 == 0))) {
        break lexical_join_282;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_251; }
    break lexical_cycle_251;
    }
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).a(((moom.CA)(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b())).c(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(this.j))))));
    }
    if (!((life4_8 == 0))) {
        break lexical_join_640;
    }
    if (!((life19_295 != 0))) {
        break lexical_join_634;
    }
    spill27_10 = life9_187;
    if (!((life4_8 == 0))) {
        lexicalValue27_302_0 = spill27_10;
        break lexical_join_302;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill27_10)), ((double)(this.h))) == 0))) {
        break lexical_join_300;
    }
    spill27_11 = life13_193;
    if (!((life4_8 == 0))) {
        lexicalValue27_302_0 = spill27_11;
        break lexical_join_302;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill27_11)), ((double)(this.j))) != 0))) {
        break lexical_join_634;
    }
    }
    lexicalValue27_302_0 = this.h;
    }
    life20_408 = lexicalValue27_302_0;
    life22_411 = this.i;
    life24_414 = this.j;
    life26_418 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b();
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).a(((moom.CA)(life18_220)));
    this.i = ((double)(life15_195));
    life27_440 = ((net.minecraft.world.World)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).i)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)), ((moom.CA)(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b())).a(((double)(life9_187)), ((double)(this.i)), ((double)(life13_193))))));
    life28_444 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b();
    life29_450 = ((moom.CA)(life28_444)).a(((double)(life9_187)), ((double)(0x0.0p0d)), ((double)(life13_193)));
    life30_453 = this.i;
    life32_456 = ((java.util.List)(life27_440)).iterator();
    lexical_cycle_351: while (true) {
    if (!(((java.util.Iterator)(life32_456)).hasNext())) {
        break lexical_join_367;
    }
    life33_463 = ((moom.CA)(((java.util.Iterator)(life32_456)).next()));
    life30_453 = ((moom.CA)(life33_463)).b(((moom.CA)(life29_450)), ((double)(life30_453)));
    if (!((life4_8 == 0))) {
        break lexical_join_373;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_351; }
    break lexical_cycle_351;
    }
    }
    life28_444 = ((moom.CA)(life28_444)).c(((double)(0x0.0p0d)), ((double)(life30_453)), ((double)(0x0.0p0d)));
    }
    life32_483 = life9_187;
    life34_486 = ((java.util.List)(life27_440)).iterator();
    lexical_cycle_378: while (true) {
    if (!(((java.util.Iterator)(life34_486)).hasNext())) {
        break lexical_join_394;
    }
    life35_493 = ((moom.CA)(((java.util.Iterator)(life34_486)).next()));
    life32_483 = ((moom.CA)(life35_493)).a(((moom.CA)(life28_444)), ((double)(life32_483)));
    if (!((life4_8 == 0))) {
        break lexical_join_400;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_378; }
    break lexical_cycle_378;
    }
    }
    life28_444 = ((moom.CA)(life28_444)).c(((double)(life32_483)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));
    }
    life34_513 = life13_193;
    life36_516 = ((java.util.List)(life27_440)).iterator();
    lexical_cycle_405: while (true) {
    if (!(((java.util.Iterator)(life36_516)).hasNext())) {
        break lexical_join_421;
    }
    life37_523 = ((moom.CA)(((java.util.Iterator)(life36_516)).next()));
    life34_513 = ((moom.CA)(life37_523)).c(((moom.CA)(life28_444)), ((double)(life34_513)));
    if (!((life4_8 == 0))) {
        break lexical_join_427;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_405; }
    break lexical_cycle_405;
    }
    }
    life28_444 = ((moom.CA)(life28_444)).c(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(life34_513)));
    }
    life36_545 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b();
    life37_548 = this.i;
    life39_551 = ((java.util.List)(life27_440)).iterator();
    lexical_cycle_437: while (true) {
    if (!(((java.util.Iterator)(life39_551)).hasNext())) {
        break lexical_join_453;
    }
    life40_558 = ((moom.CA)(((java.util.Iterator)(life39_551)).next()));
    life37_548 = ((moom.CA)(life40_558)).b(((moom.CA)(life36_545)), ((double)(life37_548)));
    if (!((life4_8 == 0))) {
        break lexical_join_459;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_437; }
    break lexical_cycle_437;
    }
    }
    life36_545 = ((moom.CA)(life36_545)).c(((double)(0x0.0p0d)), ((double)(life37_548)), ((double)(0x0.0p0d)));
    }
    life39_578 = life9_187;
    life41_581 = ((java.util.List)(life27_440)).iterator();
    lexical_cycle_464: while (true) {
    if (!(((java.util.Iterator)(life41_581)).hasNext())) {
        break lexical_join_480;
    }
    life42_588 = ((moom.CA)(((java.util.Iterator)(life41_581)).next()));
    life39_578 = ((moom.CA)(life42_588)).a(((moom.CA)(life36_545)), ((double)(life39_578)));
    if (!((life4_8 == 0))) {
        break lexical_join_486;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_464; }
    break lexical_cycle_464;
    }
    }
    life36_545 = ((moom.CA)(life36_545)).c(((double)(life39_578)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));
    }
    life41_608 = life13_193;
    life43_611 = ((java.util.List)(life27_440)).iterator();
    lexical_cycle_491: while (true) {
    if (!(((java.util.Iterator)(life43_611)).hasNext())) {
        break lexical_join_507;
    }
    life44_618 = ((moom.CA)(((java.util.Iterator)(life43_611)).next()));
    life41_608 = ((moom.CA)(life44_618)).c(((moom.CA)(life36_545)), ((double)(life41_608)));
    if (!((life4_8 == 0))) {
        break lexical_join_513;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_491; }
    break lexical_cycle_491;
    }
    }
    life36_545 = ((moom.CA)(life36_545)).c(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(life41_608)));
    }
    life43_644 = ((life32_483 * life32_483) + (life34_513 * life34_513));
    life45_652 = ((life39_578 * life39_578) + (life41_608 * life41_608));
    if (!((life4_8 == 0))) {
        break lexical_join_561;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life43_644)), ((double)(life45_652))) > 0))) {
        break lexical_join_551;
    }
    this.h = ((double)(life32_483));
    this.j = ((double)(life34_513));
    this.i = ((double)((-life30_453)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).a(((moom.CA)(life28_444)));
    if (!((life4_8 != 0))) {
        break lexical_join_565;
    }
    }
    this.h = ((double)(life39_578));
    this.j = ((double)(life41_608));
    this.i = ((double)((-life37_548)));
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).a(((moom.CA)(life36_545)));
    }
    life47_700 = ((java.util.List)(life27_440)).iterator();
    lexical_cycle_568: while (true) {
    if (!(((java.util.Iterator)(life47_700)).hasNext())) {
        break lexical_join_588;
    }
    life48_707 = ((moom.CA)(((java.util.Iterator)(life47_700)).next()));
    this.i = ((double)(((moom.CA)(life48_707)).b(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b())), ((double)(this.i)))));
    if (!((life4_8 == 0))) {
        break lexical_join_599;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_568; }
    break lexical_cycle_568;
    }
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).a(((moom.CA)(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).b())).c(((double)(0x0.0p0d)), ((double)(this.i)), ((double)(0x0.0p0d))))));
    }
    if (!((life4_8 == 0))) {
        break lexical_join_640;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((life20_408 * life20_408) + (life24_414 * life24_414)))), ((double)(((this.h * this.h) + (this.j * this.j))))) >= 0))) {
        break lexical_join_634;
    }
    this.h = ((double)(life20_408));
    this.i = ((double)(life22_411));
    this.j = ((double)(life24_414));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).a(((moom.CA)(life26_418)));
    }
    this.f = ((boolean)(true));
    this.g = ((boolean)(true));
    }
    this.l = ((int)(0));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_648;
    }
    life4_8 += 1;
    net.minecraft.tileentity.TileEntity.b(((int)(life4_8)));
    }
    return;
}


public void a(com.moon.event.MotionEvent p0) {
int forwardValue121_26_0;
    int forwardValue121_35_0;
    double forwardValue121_37_0;
    int spill121_0;
    boolean spill121_1;
    double spill121_2;
    long life2_3;
    int life4_17;
    forward_join_62: {
    forward_join_59: {
    forward_join_37: {
    forward_join_35: {
    forward_join_26: {
    life2_3 = (com.moon.fL.n ^ 92549257297558L);
    this.h = ((double)(((com.moon.event.MotionEvent)(p0)).getMotionX()));
    this.i = ((double)(((com.moon.event.MotionEvent)(p0)).getMotionY()));
    spill121_0 = net.minecraft.tileentity.TileEntity.f();
    this.j = ((double)(((com.moon.event.MotionEvent)(p0)).getMotionZ()));
    life4_17 = spill121_0;
    spill121_1 = this.g;
    if (!((life4_17 != 0))) {
        forwardValue121_26_0 = ((spill121_1) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill121_1)) {
        break forward_join_62;
    }
    forwardValue121_26_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fL.a)).K)).ae()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forwardValue121_35_0 = forwardValue121_26_0;
        break forward_join_35;
    }
    if (!((forwardValue121_26_0 != 0))) {
        break forward_join_62;
    }
    spill121_2 = this.m;
    if (!((life4_17 != 0))) {
        forwardValue121_37_0 = spill121_2;
        break forward_join_37;
    }
    forwardValue121_35_0 = recovery.source.CarrierOps.dcmpl(((double)(spill121_2)), ((double)(0x1.8p1d)));
    }
    if (!((forwardValue121_35_0 >= 0))) {
        break forward_join_59;
    }
    forwardValue121_37_0 = 0x1.0a3d70a3d70a4p-2d;
    }
    com.moon.nJ.a__Void(((double)(forwardValue121_37_0)));
    net.minecraft.client.entity.EntityPlayerSP __stackOp121_19_0 = ((net.minecraft.client.Minecraft)(com.moon.fL.a)).K;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp121_19_0)).u = ((double)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp121_19_0)).u - 0x1.5810624dd2f1bp-5d)));
    this.g = ((boolean)(false));
    this.e = ((boolean)(false));
    this.f = ((boolean)(false));
    if (!((life4_17 == 0))) {
        break forward_join_62;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(0x0.0p0d)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_a4ef4997ea40_invokedynamic27_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be06bc302d53_invokedynamic26_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1060_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
