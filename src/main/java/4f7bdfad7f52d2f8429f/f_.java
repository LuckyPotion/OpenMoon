package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class f_ extends com.moon.f0 {

private boolean c;

private int d;

private int e;

private static long g;

private static java.lang.String h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public f_() { super(); }


private static void __sourceConstructorBody_60a19cfbba8125a0(com.moon.f_ receiver) throws Throwable {

long local1 = (com.moon.f_.g ^ 68046286153679L);

    com.moon.f_.__sourceConstructorInit_60a19cfbba8125a0_0(((com.moon.f_)(receiver)));

    ((com.moon.f_)(receiver)).d = ((int)(__sourceIntrinsic_60a19cfbba8125a0_originalDynamicSite851_2(9216, (6063347444512223832L ^ local1))));

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(7728023111937540934L)), ((long)(6299794138259825877L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(27919041081288L)))));
    long local11_life6 = (com.moon.f_.g ^ 66542377430939L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill95_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill95_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill95_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill95_13 = new byte[8];
    (__sourceSpill95_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill95_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation95_15 = __sourceSpill95_13;
    ((javax.crypto.Cipher)(__sourceSpill95_10)).init(((int)(__sourceSpill95_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill95_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation95_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill95_19 = ((java.lang.String)(" YÌvÆUÖ­ãtÞ>Õ¬>¢p\033ª6\006·Æ}8¶ÒÝ´")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill95_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill95_20)).doFinal(((byte[])(__sourceSpill95_19)));
    h = ((java.lang.String)(((java.lang.String)(com.moon.f_.a(((byte[])(local15_life22))))).intern()));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill95_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill95_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill95_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill95_33 = new byte[8];
    (__sourceSpill95_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill95_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation95_35 = __sourceSpill95_33;
    ((javax.crypto.Cipher)(__sourceSpill95_30)).init(((int)(__sourceSpill95_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill95_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation95_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[6];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "c°°ä*DMWÚlxíPfD)_)6õ¬/&ÌT:U\000"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill95_44 = local4_life40;
        int __sourceSpill95_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill95_44)).substring(((int)(__sourceSpill95_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill95_49 = local6_life38;
        int __sourceSpill95_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill95_52 = new byte[8];
        (__sourceSpill95_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill95_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill95_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill95_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill95_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill95_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill95_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill95_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill95_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill95_53)).doFinal(((byte[])(__sourceSpill95_52)));
        (__sourceSpill95_49)[__sourceSpill95_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    local5_life42 = ((java.lang.String)((local4_life40 = "ê\013B-¡1-âå\006\005·d"))).length();
    local2_life43 = 0;
    do {
        java.lang.String __sourceSpill95_57 = local4_life40;
        int __sourceSpill95_58 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill95_57)).substring(((int)(__sourceSpill95_58)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill95_62 = local6_life38;
        int __sourceSpill95_63 = local3_life39;
        local3_life39 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill95_65 = new byte[8];
        (__sourceSpill95_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill95_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill95_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill95_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill95_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill95_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill95_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill95_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill95_66 = local0_life28;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill95_66)).doFinal(((byte[])(__sourceSpill95_65)));
        (__sourceSpill95_62)[__sourceSpill95_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    i = ((long[])(local6_life38));
    j = ((java.lang.Integer[])(new java.lang.Integer[6]));
}

private static native <E extends Throwable> void __sourceConstructorInit_60a19cfbba8125a0_0(com.moon.f_ a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private boolean b__Boolean() {
int forwardValue150_17_0;
    int forwardValue150_19_0;
    int spill150_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (com.moon.f_.g ^ 2939149361887L);
    life3_5 = moom.DT.a__Arrayr3();
    spill150_0 = this.d;
    if (!((life3_5 != null))) {
        forwardValue150_17_0 = spill150_0;
        break forward_join_17;
    }
    if (!((spill150_0 < __sourceIntrinsic_74e88f4b4822_invokedynamic150_3(12827, (2852862932667539794L ^ life1_3))))) {
        break forward_join_18;
    }
    forwardValue150_17_0 = 1;
    }
    forwardValue150_19_0 = forwardValue150_17_0;
    break forward_join_19;
    }
    forwardValue150_19_0 = 0;
    }
    return ((forwardValue150_19_0) != 0);
}


public void b() {
com.moon.f_ forwardValue149_22_0;
    com.moon.f_ spill149_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_24: {
    forward_join_22: {
    life1_3 = (com.moon.f_.g ^ 119503277888350L);
    life3_5 = moom.DT.a__Arrayr3();
    spill149_0 = this;
    if (!((life3_5 != null))) {
        forwardValue149_22_0 = spill149_0;
        break forward_join_22;
    }
    if (!(((com.moon.f_)(spill149_0)).c)) {
        break forward_join_24;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f_.a)).K)).cm)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.RELEASE_USE_ITEM, moom.DT.f, moom.bs.DOWN))));
    forwardValue149_22_0 = this;
    }
    ((com.moon.f_)(forwardValue149_22_0)).c = ((boolean)(false));
    }
    return;
}


public void c() {
return;
}


public void d() {
return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29207;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/f_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
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
        byte[] spill289_0 = p0;
        life4_9 += 1;
        life5_44 = (spill289_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill289_1 = p0;
        life4_9 += 1;
        life5_76 = (spill289_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill289_2 = p0;
        life4_9 += 1;
        life5_91 = (spill289_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.f_.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1102_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/f_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.event.PacketEvent p0) {
int forwardValue148_15_0;
    int spill148_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_19: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (com.moon.f_.g ^ 84946899033942L);
    life4_5 = moom.DT.a__Arrayr3();
    spill148_0 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.za) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue148_15_0 = spill148_0;
        break forward_join_15;
    }
    if (!((spill148_0 == 0))) {
        break forward_join_16;
    }
    forwardValue148_15_0 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zc) ? 1 : 0);
    }
    if (!((forwardValue148_15_0 != 0))) {
        break forward_join_19;
    }
    }
    this.c = ((boolean)(false));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue147_51_0;
    int forwardValue147_63_0;
    int forwardValue147_103_0;
    int forwardValue147_113_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue147_116_0;
    com.moon.f_ forwardValue147_137_0;
    int forwardValue147_138_0;
    com.moon.f_ forwardValue147_149_0;
    int forwardValue147_152_0;
    com.moon.f_ forwardValue147_167_0;
    net.minecraft.entity.Entity[] spill147_0;
    boolean spill147_1;
    com.moon.f_ spill147_2;
    boolean spill147_3;
    int spill147_4;
    net.minecraft.client.entity.EntityPlayerSP spill147_5;
    com.moon.f_ spill147_6;
    long life2_3;
    int life5_9;
    net.minecraft.entity.Entity[] life4_10;
    forward_join_174: {
    forward_join_169: {
    forward_join_167: {
    forward_join_152: {
    forward_join_149: {
    forward_join_148: {
    forward_join_138: {
    forward_join_137: {
    forward_join_136: {
    forward_join_116: {
    forward_join_113: {
    forward_join_103: {
    forward_join_101: {
    forward_join_63: {
    forward_join_61: {
    forward_join_51: {
    forward_join_49: {
    life2_3 = (com.moon.f_.g ^ 112902560883608L);
    spill147_0 = moom.DT.a__Arrayr3();
    life5_9 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f_.a)).K)).bD)).c;
    life4_10 = spill147_0;
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.BEFORE))) {
        break forward_join_169;
    }
    spill147_1 = ((com.moon.f_)(this)).a__Boolean();
    if (!((life4_10 != null))) {
        forwardValue147_138_0 = ((spill147_1) ? 1 : 0);
        break forward_join_138;
    }
    if (!(spill147_1)) {
        break forward_join_136;
    }
    spill147_2 = this;
    if (!((life4_10 != null))) {
        forwardValue147_137_0 = spill147_2;
        break forward_join_137;
    }
    if (!((((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f_)(spill147_2)).b)).a__gd())).a__sG() != null))) {
        break forward_join_136;
    }
    spill147_3 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.KillAura)(this.b)).p())).getValue())))).booleanValue();
    if (!((life4_10 != null))) {
        forwardValue147_51_0 = ((spill147_3) ? 1 : 0);
        break forward_join_51;
    }
    if (!(spill147_3)) {
        break forward_join_49;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f_.a)).K)).cm)).a(((moom.yK)(new moom.zb(null))));
    this.c = ((boolean)(true));
    if (!((life4_10 == null))) {
        break forward_join_169;
    }
    }
    forwardValue147_51_0 = ((com.moon.o4)(com.moon.o4.a__o4())).b();
    }
    if (!((life4_10 != null))) {
        forwardValue147_63_0 = forwardValue147_51_0;
        break forward_join_63;
    }
    if (!((forwardValue147_51_0 != ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(((com.moon.cl)(com.moon.cl.R1_12_2)).a())).getVersion()))) {
        break forward_join_61;
    }
    com.moon.nC.a(((java.lang.String)(com.moon.f_.h)));
    if (!((life4_10 == null))) {
        break forward_join_169;
    }
    }
    forwardValue147_63_0 = ((this.c) ? 1 : 0);
    }
    if (!((life4_10 != null))) {
        forwardValue147_103_0 = forwardValue147_63_0;
        break forward_join_103;
    }
    if (!((forwardValue147_63_0 == 0))) {
        break forward_join_101;
    }
    com.moon.f_ __stackOp147_33_0 = this;
    com.moon.f_ __stackOp147_35_0 = __stackOp147_33_0;
    int __stackOp147_35_1 = (((com.moon.f_)(__stackOp147_33_0)).e - 1);
    spill147_4 = __stackOp147_35_1;
    ((com.moon.f_)(__stackOp147_35_0)).e = ((int)(__stackOp147_35_1));
    if (!((life4_10 != null))) {
        forwardValue147_103_0 = spill147_4;
        break forward_join_103;
    }
    if (!((spill147_4 <= 0))) {
        break forward_join_101;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f_.a)).K)).cm)).b(((moom.yK)(new com.moon.hT(__sourceIntrinsic_9f71572286bb_invokedynamic147_40(19786, (4834544804883521351L ^ life2_3)), 0))));
    this.c = ((boolean)(true));
    this.e = ((int)(__sourceIntrinsic_9f71572286bb_invokedynamic147_43(16613, (1883045066047148777L ^ life2_3))));
    if (!((life4_10 == null))) {
        break forward_join_169;
    }
    }
    forwardValue147_103_0 = ((this.c) ? 1 : 0);
    }
    if (!((life4_10 != null))) {
        forwardValue147_113_0 = forwardValue147_103_0;
        break forward_join_113;
    }
    if (!((forwardValue147_103_0 != 0))) {
        break forward_join_169;
    }
    spill147_5 = ((net.minecraft.client.Minecraft)(com.moon.f_.a)).K;
    if (!((life4_10 != null))) {
        forwardValue147_116_0 = spill147_5;
        break forward_join_116;
    }
    forwardValue147_113_0 = (((net.minecraft.client.entity.EntityPlayerSP)(spill147_5)).S % 3);
    }
    if (!((forwardValue147_113_0 == 0))) {
        break forward_join_169;
    }
    forwardValue147_116_0 = ((net.minecraft.client.Minecraft)(com.moon.f_.a)).K;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue147_116_0)).cm)).b(((moom.yK)(new com.moon.hT(__sourceIntrinsic_9f71572286bb_invokedynamic147_53(4956, (5846175928257904981L ^ life2_3)), 1))));
    this.e = ((int)(__sourceIntrinsic_9f71572286bb_invokedynamic147_55(27542, (7376521874564315550L ^ life2_3))));
    if (!((life4_10 == null))) {
        break forward_join_169;
    }
    }
    forwardValue147_137_0 = this;
    }
    forwardValue147_138_0 = ((((com.moon.f_)(forwardValue147_137_0)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_10 != null))) {
        forwardValue147_152_0 = forwardValue147_138_0;
        break forward_join_152;
    }
    if (!((forwardValue147_138_0 != 0))) {
        break forward_join_148;
    }
    spill147_6 = this;
    if (!((life4_10 != null))) {
        forwardValue147_149_0 = spill147_6;
        break forward_join_149;
    }
    if (!((((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f_)(spill147_6)).b)).a__gd())).a__sG() == null))) {
        break forward_join_169;
    }
    }
    forwardValue147_149_0 = this;
    }
    if (!((life4_10 != null))) {
        forwardValue147_167_0 = forwardValue147_149_0;
        break forward_join_167;
    }
    forwardValue147_152_0 = ((((com.moon.f_)(forwardValue147_149_0)).c) ? 1 : 0);
    }
    if (!((forwardValue147_152_0 != 0))) {
        break forward_join_169;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f_.a)).K)).cm)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.RELEASE_USE_ITEM, moom.DT.f, moom.bs.DOWN))));
    this.c = ((boolean)(false));
    forwardValue147_167_0 = this;
    }
    ((com.moon.f_)(forwardValue147_167_0)).e = ((int)(0));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_174;
    }
    moom.DT.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[3])));
    }
    return;
}


public void a__Void() {
long local1 = (com.moon.f_.g ^ 111224606741259L);
    this.d = ((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f_.a)).K)).bD)).c));
    net.minecraft.entity.Entity[] spill987_0 = moom.DT.a__Arrayr3();
    this.c = ((boolean)(false));
    net.minecraft.entity.Entity[] local3 = spill987_0;
    if ((local3 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_60a19cfbba8125a0_originalDynamicSite851_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic147_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic147_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic147_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic147_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1102_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e88f4b4822_invokedynamic150_3(int a0, long a1) throws E;
}
