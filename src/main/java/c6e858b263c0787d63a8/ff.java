package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ff extends com.moon.e2<com.moon.module.impl.Disabler> {

private com.moon.module.impl.Velocity e;

private boolean f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public ff() {
super(com.moon.module.impl.Disabler.class);
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-5268849515345241951L)), ((long)(1049077619885397156L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(2321990626188L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ff.g ^ 93890226163166L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill182_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill182_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill182_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill182_14 = new byte[8];
    (__sourceSpill182_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill182_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation182_16 = __sourceSpill182_14;
    ((javax.crypto.Cipher)(__sourceSpill182_11)).init(((int)(__sourceSpill182_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill182_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation182_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ê\\G`¹\0213Ï[¾ÔòÚ²g"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill182_25 = local6_life21;
        int __sourceSpill182_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill182_25)).substring(((int)(__sourceSpill182_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill182_30 = local8_life19;
        int __sourceSpill182_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill182_33 = new byte[8];
        (__sourceSpill182_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill182_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill182_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill182_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill182_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill182_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill182_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill182_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill182_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill182_34)).doFinal(((byte[])(__sourceSpill182_33)));
        (__sourceSpill182_30)[__sourceSpill182_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\003J\003Xé\034íaå± "))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill182_38 = local6_life21;
        int __sourceSpill182_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill182_38)).substring(((int)(__sourceSpill182_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill182_43 = local8_life19;
        int __sourceSpill182_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill182_46 = new byte[8];
        (__sourceSpill182_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill182_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill182_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill182_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill182_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill182_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill182_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill182_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill182_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill182_47)).doFinal(((byte[])(__sourceSpill182_46)));
        (__sourceSpill182_43)[__sourceSpill182_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void d() {
com.moon.ff forwardValue159_12_0;
    com.moon.ff spill159_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.ff.g ^ 137567173097056L);
    life3_5 = __sourceExactCall_3aeb6b5647b550();
    spill159_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue159_12_0 = spill159_0;
        break forward_join_12;
    }
    if (!((((com.moon.ff)(spill159_0)).e == null))) {
        break forward_join_18;
    }
    forwardValue159_12_0 = this;
    }
    ((com.moon.ff)(forwardValue159_12_0)).e = ((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Velocity.class)))))));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1115_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ff"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ff.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5801;
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
            throw new RuntimeException("com/moon/ff", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


public void a(com.moon.event.PacketEvent p0) {
moom.yK lexicalValue30_44_0;
    moom.yK lexicalValue30_46_0;
    int lexicalValue30_47_0;
    java.lang.Object lexicalValue30_91_0;
    java.lang.Object lexicalValue30_98_0;
    int lexicalValue30_116_0;
    net.minecraft.client.entity.EntityPlayerSP lexicalValue30_131_0;
    int lexicalValue30_142_0;
    int lexicalValue30_169_0;
    int lexicalValue30_179_0;
    int spill30_0;
    int spill30_1;
    moom.zT spill30_2;
    moom.zT spill30_3;
    boolean spill30_4;
    int spill30_5;
    moom.r2 spill30_6;
    int spill30_7;
    java.lang.Object spill30_8;
    int spill30_9;
    net.minecraft.client.entity.EntityPlayerSP spill30_10;
    boolean spill30_11;
    int spill30_12;
    boolean spill30_13;
    long life2_3;
    int life4_7;
    moom.yK life6_13;
    moom.zT life5_24;
    net.minecraft.entity.Entity life6_31;
    moom.zV life5_67;
    java.util.Iterator life6_98;
    moom.r2 life7_105;
    java.lang.Object life9_124;
    java.lang.Byte life8_138;
    lexical_join_183: {
    lexical_join_179: {
    lexical_join_176: {
    lexical_join_169: {
    lexical_join_166: {
    lexical_join_142: {
    lexical_join_139: {
    lexical_join_47: {
    lexical_join_46: {
    lexical_join_44: {
    lexical_join_42: {
    life2_3 = (com.moon.ff.g ^ 75107765982568L);
    spill30_0 = __sourceExactCall_29b1e480a5b245();
    ((com.moon.ff)(this)).d();
    life4_7 = spill30_0;
    if (!((((net.minecraft.client.Minecraft)(com.moon.ff.a)).K != null))) {
        break lexical_join_183;
    }
    life6_13 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    spill30_1 = ((life6_13 instanceof moom.zT) ? 1 : 0);
    if (!((life4_7 != 0))) {
        lexicalValue30_47_0 = spill30_1;
        break lexical_join_47;
    }
    if (!((spill30_1 != 0))) {
        break lexical_join_42;
    }
    life5_24 = ((moom.zT)(life6_13));
    spill30_2 = life5_24;
    if (!((life4_7 != 0))) {
        lexicalValue30_46_0 = spill30_2;
        break lexical_join_46;
    }
    life6_31 = ((moom.zT)(spill30_2)).a(((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.ff.a)).I)));
    if (!((life6_31 == ((net.minecraft.client.Minecraft)(com.moon.ff.a)).K))) {
        break lexical_join_42;
    }
    spill30_3 = life5_24;
    if (!((life4_7 != 0))) {
        lexicalValue30_44_0 = spill30_3;
        break lexical_join_44;
    }
    if (!((((moom.zT)(spill30_3)).a() == 2))) {
        break lexical_join_42;
    }
    this.f = ((boolean)(true));
    }
    lexicalValue30_44_0 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    }
    life6_13 = lexicalValue30_44_0;
    lexicalValue30_46_0 = life6_13;
    }
    lexicalValue30_47_0 = ((lexicalValue30_46_0 instanceof moom.zV) ? 1 : 0);
    }
    if (!((life4_7 != 0))) {
        lexicalValue30_142_0 = lexicalValue30_47_0;
        break lexical_join_142;
    }
    if (!((lexicalValue30_47_0 != 0))) {
        break lexical_join_139;
    }
    life5_67 = ((moom.zV)(life6_13));
    spill30_4 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Disabler)(((com.moon.module.impl.Disabler)(((com.moon.ff)(this)).a())))).b())).getValue())))).booleanValue();
    if (!((life4_7 != 0))) {
        lexicalValue30_142_0 = ((spill30_4) ? 1 : 0);
        break lexical_join_142;
    }
    if (!(spill30_4)) {
        break lexical_join_139;
    }
    spill30_5 = ((moom.zV)(life5_67)).a();
    if (!((life4_7 != 0))) {
        lexicalValue30_142_0 = spill30_5;
        break lexical_join_142;
    }
    if (!((spill30_5 == ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ff.a)).K)).e__Int()))) {
        break lexical_join_139;
    }
    life6_98 = ((java.util.List)(((moom.zV)(life5_67)).a__List())).iterator();
    lexical_cycle_75: while (true) {
    lexical_join_137: {
    lexical_join_131: {
    lexical_join_116: {
    lexical_join_98: {
    lexical_join_91: {
    if (!(((java.util.Iterator)(life6_98)).hasNext())) {
        break lexical_join_139;
    }
    life7_105 = ((moom.r2)(((java.util.Iterator)(life6_98)).next()));
    spill30_6 = life7_105;
    if (!((life4_7 != 0))) {
        lexicalValue30_91_0 = spill30_6;
        break lexical_join_91;
    }
    spill30_7 = ((moom.r2)(spill30_6)).a();
    if (!((life4_7 != 0))) {
        lexicalValue30_142_0 = spill30_7;
        break lexical_join_142;
    }
    if (!((spill30_7 == 0))) {
        break lexical_join_137;
    }
    lexicalValue30_91_0 = ((moom.r2)(life7_105)).a__Object();
    }
    life9_124 = lexicalValue30_91_0;
    spill30_8 = life9_124;
    if (!((life4_7 != 0))) {
        lexicalValue30_98_0 = spill30_8;
        break lexical_join_98;
    }
    if (!((((spill30_8 instanceof java.lang.Byte) ? 1 : 0) != 0))) {
        break lexical_join_137;
    }
    lexicalValue30_98_0 = life9_124;
    }
    life8_138 = ((java.lang.Byte)(lexicalValue30_98_0));
    spill30_9 = (((java.lang.Byte)(life8_138)).byteValue() & __sourceIntrinsic_0d28a2dd2629_invokedynamic30_39(27048, (6998982627815385091L ^ life2_3)));
    if (!((life4_7 != 0))) {
        lexicalValue30_116_0 = spill30_9;
        break lexical_join_116;
    }
    if (!((spill30_9 == 0))) {
        break lexical_join_137;
    }
    spill30_10 = ((net.minecraft.client.Minecraft)(com.moon.ff.a)).K;
    if (!((life4_7 != 0))) {
        lexicalValue30_131_0 = spill30_10;
        break lexical_join_131;
    }
    lexicalValue30_116_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill30_10)).u__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue30_116_0 != 0))) {
        break lexical_join_137;
    }
    ((moom.r2)(life7_105)).a(((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (((java.lang.Byte)(life8_138)).byteValue() | __sourceIntrinsic_0d28a2dd2629_invokedynamic30_45(18521, (1335050865608116720L ^ life2_3))))))))));
    lexicalValue30_131_0 = ((net.minecraft.client.Minecraft)(com.moon.ff.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(lexicalValue30_131_0)).c(((boolean)(true)));
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    }
    if (!((life4_7 == 0))) { continue lexical_cycle_75; }
    break lexical_cycle_75;
    }
    }
    lexicalValue30_142_0 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.Aj) ? 1 : 0);
    }
    if (!((life4_7 != 0))) {
        lexicalValue30_179_0 = lexicalValue30_142_0;
        break lexical_join_179;
    }
    if (!((lexicalValue30_142_0 != 0))) {
        break lexical_join_176;
    }
    spill30_11 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Disabler)(((com.moon.module.impl.Disabler)(((com.moon.ff)(this)).a())))).c())).getValue())))).booleanValue();
    if (!((life4_7 != 0))) {
        lexicalValue30_179_0 = ((spill30_11) ? 1 : 0);
        break lexical_join_179;
    }
    if (!(spill30_11)) {
        break lexical_join_176;
    }
    spill30_12 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ff.a)).K)).aO;
    if (!((life4_7 != 0))) {
        lexicalValue30_169_0 = spill30_12;
        break lexical_join_169;
    }
    if (!((spill30_12 <= 0))) {
        break lexical_join_166;
    }
    spill30_13 = this.f;
    if (!((life4_7 != 0))) {
        lexicalValue30_179_0 = ((spill30_13) ? 1 : 0);
        break lexical_join_179;
    }
    if (!(spill30_13)) {
        break lexical_join_176;
    }
    }
    lexicalValue30_169_0 = ((((com.moon.module.impl.Velocity)(this.e)).isEnabled()) ? 1 : 0);
    }
    if (!((life4_7 != 0))) {
        lexicalValue30_179_0 = lexicalValue30_169_0;
        break lexical_join_179;
    }
    if (!((lexicalValue30_169_0 != 0))) {
        break lexical_join_176;
    }
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    }
    lexicalValue30_179_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ff.a)).K)).aO;
    }
    if (!((lexicalValue30_179_0 > 0))) {
        break lexical_join_183;
    }
    this.f = ((boolean)(false));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
java.lang.Object forwardValue157_17_0;
    int forwardValue157_44_0;
    int forwardValue157_56_0;
    int forwardValue157_80_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue157_83_0;
    com.moon.event.MovePhase spill157_0;
    boolean spill157_1;
    net.minecraft.client.entity.EntityPlayerSP spill157_2;
    long life2_3;
    int life4_5;
    forward_join_91: {
    forward_join_83: {
    forward_join_80: {
    forward_join_69: {
    forward_join_56: {
    forward_join_44: {
    forward_join_37: {
    forward_join_17: {
    life2_3 = (com.moon.ff.g ^ 92697249660737L);
    life4_5 = __sourceExactCall_29b1e480a5b245();
    spill157_0 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    if (!((life4_5 != 0))) {
        forwardValue157_17_0 = spill157_0;
        break forward_join_17;
    }
    if (!((spill157_0 == com.moon.event.MovePhase.PRE))) {
        break forward_join_91;
    }
    forwardValue157_17_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Disabler)(((com.moon.module.impl.Disabler)(((com.moon.ff)(this)).a())))).a__kV())).getValue();
    }
    spill157_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue157_17_0)))).booleanValue();
    if (!((life4_5 != 0))) {
        forwardValue157_44_0 = ((spill157_1) ? 1 : 0);
        break forward_join_44;
    }
    if (!(spill157_1)) {
        break forward_join_37;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ff.a)).K)).cm)).b(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK, new moom.DT(0, 0, 0), moom.bs.DOWN))));
    }
    forwardValue157_44_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Disabler)(((com.moon.module.impl.Disabler)(((com.moon.ff)(this)).a())))).b())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue157_56_0 = forwardValue157_44_0;
        break forward_join_56;
    }
    if (!((forwardValue157_44_0 != 0))) {
        break forward_join_91;
    }
    forwardValue157_56_0 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ff.a)).K)).S % __sourceIntrinsic_9f71572286bb_invokedynamic157_27(20747, (7037958917340625544L ^ life2_3)));
    }
    if (!((life4_5 != 0))) {
        forwardValue157_80_0 = forwardValue157_56_0;
        break forward_join_80;
    }
    if (!((forwardValue157_56_0 == 0))) {
        break forward_join_69;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ff.a)).K)).cm)).b(((moom.yK)(new moom.ze(((net.minecraft.client.Minecraft)(com.moon.ff.a)).K, net.minecraft.network.play.client.C0BPacketEntityAction$Action.STOP_SPRINTING))));
    }
    spill157_2 = ((net.minecraft.client.Minecraft)(com.moon.ff.a)).K;
    if (!((life4_5 != 0))) {
        forwardValue157_83_0 = spill157_2;
        break forward_join_83;
    }
    forwardValue157_80_0 = (((net.minecraft.client.entity.EntityPlayerSP)(spill157_2)).S % __sourceIntrinsic_9f71572286bb_invokedynamic157_38(22589, (3281132892858414012L ^ life2_3)));
    }
    if (!((forwardValue157_80_0 == 0))) {
        break forward_join_91;
    }
    forwardValue157_83_0 = ((net.minecraft.client.Minecraft)(com.moon.ff.a)).K;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue157_83_0)).cm)).b(((moom.yK)(new moom.ze(((net.minecraft.client.Minecraft)(com.moon.ff.a)).K, net.minecraft.network.play.client.C0BPacketEntityAction$Action.STOP_SNEAKING))));
    }
    return;
}


public void a(com.moon.dT p0) {
int forwardValue156_19_0;
    int forwardValue156_25_0;
    boolean spill156_0;
    long life2_3;
    int life4_5;
    forward_join_30: {
    forward_join_25: {
    forward_join_19: {
    life2_3 = (com.moon.ff.g ^ 61738436245375L);
    life4_5 = __sourceExactCall_3aeb6b5647b550();
    spill156_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ff.a)).K)).u__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue156_19_0 = ((spill156_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill156_0)) {
        break forward_join_30;
    }
    forwardValue156_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Disabler)(((com.moon.module.impl.Disabler)(((com.moon.ff)(this)).a())))).b())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue156_25_0 = forwardValue156_19_0;
        break forward_join_25;
    }
    if (!((forwardValue156_19_0 != 0))) {
        break forward_join_30;
    }
    forwardValue156_25_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ff.a)).K)).ae()) ? 1 : 0);
    }
    if (!((forwardValue156_25_0 != 0))) {
        break forward_join_30;
    }
    ((com.moon.dT)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1115_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0d28a2dd2629_invokedynamic30_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0d28a2dd2629_invokedynamic30_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic157_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic157_38(int a0, long a1) throws E;

private static native int __sourceExactCall_3aeb6b5647b550();
private static native int __sourceExactCall_29b1e480a5b245();
}
