package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class fe extends com.moon.e2<com.moon.module.impl.Disabler> {

private boolean e;

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public fe() {
super(com.moon.module.impl.Disabler.class);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-62052659823256135L)), ((long)(4254174257056802336L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(44738004122615L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.fe.f ^ 115705722046644L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill181_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill181_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill181_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill181_14 = new byte[8];
    (__sourceSpill181_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill181_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation181_16 = __sourceSpill181_14;
    ((javax.crypto.Cipher)(__sourceSpill181_11)).init(((int)(__sourceSpill181_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill181_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation181_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ü#õ:]\0219TBjhÏ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill181_25 = local6_life21;
        int __sourceSpill181_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill181_25)).substring(((int)(__sourceSpill181_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill181_30 = local8_life19;
        int __sourceSpill181_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill181_33 = new byte[8];
        (__sourceSpill181_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill181_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill181_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill181_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill181_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill181_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill181_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill181_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill181_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill181_34)).doFinal(((byte[])(__sourceSpill181_33)));
        (__sourceSpill181_30)[__sourceSpill181_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "e»­:N]ívi\022Yéh®"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill181_38 = local6_life21;
        int __sourceSpill181_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill181_38)).substring(((int)(__sourceSpill181_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill181_43 = local8_life19;
        int __sourceSpill181_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill181_46 = new byte[8];
        (__sourceSpill181_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill181_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill181_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill181_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill181_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill181_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill181_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill181_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill181_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill181_47)).doFinal(((byte[])(__sourceSpill181_46)));
        (__sourceSpill181_43)[__sourceSpill181_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1112_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/fe"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.fe.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25158;
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/fe", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


public void a(com.moon.event.PacketEvent p0) {
int forwardValue155_20_0;
    int forwardValue155_33_0;
    moom.yK forwardValue155_50_0;
    moom.yK forwardValue155_57_0;
    int forwardValue155_70_0;
    int forwardValue155_79_0;
    int forwardValue155_81_0;
    moom.zi forwardValue155_98_0;
    int forwardValue155_98_1;
    moom.zi forwardValue155_99_0;
    moom.zi forwardValue155_104_0;
    int forwardValue155_104_1;
    int spill155_0;
    moom.yK spill155_1;
    moom.yK spill155_2;
    boolean spill155_3;
    moom.zi spill155_4;
    int spill155_5;
    long life2_3;
    int life4_5;
    moom.yK life6_80;
    moom.zi life5_94;
    int life6_97;
    int life7_129;
    forward_join_111: {
    forward_join_106: {
    forward_join_104: {
    forward_join_99: {
    forward_join_98: {
    forward_join_81: {
    forward_join_80: {
    forward_join_79: {
    forward_join_70: {
    forward_join_57: {
    forward_join_50: {
    forward_join_48: {
    forward_join_33: {
    forward_join_28: {
    forward_join_20: {
    forward_join_17: {
    life2_3 = (com.moon.fe.f ^ 52697893960944L);
    life4_5 = __sourceExactCall_29b1e480a5b245();
    spill155_0 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zA) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue155_20_0 = spill155_0;
        break forward_join_20;
    }
    if (!((spill155_0 != 0))) {
        break forward_join_17;
    }
    this.e = ((boolean)(true));
    if (!((life4_5 == 0))) {
        break forward_join_106;
    }
    }
    forwardValue155_20_0 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.y6) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue155_33_0 = forwardValue155_20_0;
        break forward_join_33;
    }
    if (!((forwardValue155_20_0 != 0))) {
        break forward_join_28;
    }
    this.e = ((boolean)(false));
    if (!((life4_5 == 0))) {
        break forward_join_106;
    }
    }
    spill155_1 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    if (!((life4_5 != 0))) {
        forwardValue155_50_0 = spill155_1;
        break forward_join_50;
    }
    forwardValue155_33_0 = ((spill155_1 instanceof moom.y7) ? 1 : 0);
    }
    if (!((forwardValue155_33_0 != 0))) {
        break forward_join_48;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fe.a)).K)).S <= __sourceIntrinsic_0d28a2dd2629_invokedynamic155_13(11501, (3428257235964947142L ^ life2_3))))) {
        break forward_join_48;
    }
    this.e = ((boolean)(true));
    if (!((life4_5 == 0))) {
        break forward_join_106;
    }
    }
    forwardValue155_50_0 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    }
    life6_80 = forwardValue155_50_0;
    spill155_2 = life6_80;
    if (!((life4_5 != 0))) {
        forwardValue155_57_0 = spill155_2;
        break forward_join_57;
    }
    if (!((((spill155_2 instanceof moom.zi) ? 1 : 0) != 0))) {
        break forward_join_106;
    }
    forwardValue155_57_0 = life6_80;
    }
    life5_94 = ((moom.zi)(forwardValue155_57_0));
    life6_97 = ((moom.zi)(life5_94)).a__Short();
    spill155_3 = this.e;
    if (!((life4_5 != 0))) {
        forwardValue155_70_0 = ((spill155_3) ? 1 : 0);
        break forward_join_70;
    }
    if (!(spill155_3)) {
        break forward_join_80;
    }
    forwardValue155_70_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fe.a)).K)).S;
    }
    if (!((life4_5 != 0))) {
        forwardValue155_79_0 = forwardValue155_70_0;
        break forward_join_79;
    }
    if (!((forwardValue155_70_0 <= __sourceIntrinsic_0d28a2dd2629_invokedynamic155_24(4525, (3041963264891869061L ^ life2_3))))) {
        break forward_join_80;
    }
    forwardValue155_79_0 = 1;
    }
    forwardValue155_81_0 = forwardValue155_79_0;
    break forward_join_81;
    }
    forwardValue155_81_0 = 0;
    }
    life7_129 = forwardValue155_81_0;
    if (!((life7_129 != 0))) {
        break forward_join_106;
    }
    spill155_4 = life5_94;
    spill155_5 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fe.a)).K)).S % 2);
    if (!((life4_5 != 0))) {
        forwardValue155_98_0 = spill155_4;
        forwardValue155_98_1 = spill155_5;
        break forward_join_98;
    }
    if (!((spill155_5 == 0))) {
        forwardValue155_99_0 = spill155_4;
        break forward_join_99;
    }
    forwardValue155_98_0 = spill155_4;
    forwardValue155_98_1 = __sourceIntrinsic_0d28a2dd2629_invokedynamic155_28(8686, (6129215067061348292L ^ life2_3));
    }
    forwardValue155_104_0 = forwardValue155_98_0;
    forwardValue155_104_1 = forwardValue155_98_1;
    break forward_join_104;
    }
    forwardValue155_104_0 = forwardValue155_99_0;
    forwardValue155_104_1 = __sourceIntrinsic_0d28a2dd2629_invokedynamic155_29(20167, (246156210052499694L ^ life2_3));
    }
    ((moom.zi)(forwardValue155_104_0)).a(((short)(forwardValue155_104_1)));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_111;
    }
    life4_5 += 1;
    __sourceExactCall_22bb17d1b1257e(((int)(life4_5)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1112_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0d28a2dd2629_invokedynamic155_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0d28a2dd2629_invokedynamic155_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0d28a2dd2629_invokedynamic155_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0d28a2dd2629_invokedynamic155_29(int a0, long a1) throws E;

private static native int __sourceExactCall_29b1e480a5b245();
private static native void __sourceExactCall_22bb17d1b1257e(int p0);
}
