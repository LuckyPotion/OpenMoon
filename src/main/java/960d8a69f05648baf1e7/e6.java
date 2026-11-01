package com.moon;


public class e6 extends com.moon.e2<com.moon.module.impl.Velocity> {

private final java.util.Queue<moom.zi> e;

private boolean f;

private boolean g;

private static final long h;

private static final java.lang.String i;

private static final long j;

public e6() {
super(com.moon.module.impl.Velocity.class);
    this.e = new java.util.concurrent.LinkedBlockingQueue();
    this.f = false;
    this.g = false;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-7059072037788389931L)), ((long)(366783689306877568L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(269756774826394L)))));
    long local5_life6 = (com.moon.e6.h ^ 68795168945853L);
    javax.crypto.Cipher local7_life8;
    javax.crypto.Cipher __sourceSpill77_10 = (local7_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill77_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill77_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill77_13 = new byte[8];
    (__sourceSpill77_13)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local8_life14 = 1;
    while ((local8_life14 < 8)) {
        (__sourceSpill77_13)[local8_life14] = ((byte) ((int) ((local5_life6 << (local8_life14 * 8)) >>> 56)));
        local8_life14 += 1;
    }
    byte[] __sourcePreallocation77_15 = __sourceSpill77_13;
    ((javax.crypto.Cipher)(__sourceSpill77_10)).init(((int)(__sourceSpill77_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill77_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation77_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill77_19 = ((java.lang.String)("õ¨È\033kô°m£y~Ê®Ü\001")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill77_20 = local7_life8;
    byte[] local9_life22 = ((javax.crypto.Cipher)(__sourceSpill77_20)).doFinal(((byte[])(__sourceSpill77_19)));
    i = ((java.lang.String)(((java.lang.String)(com.moon.e6.a(((byte[])(local9_life22))))).intern()));
    javax.crypto.Cipher local0_life27;
    javax.crypto.Cipher __sourceSpill77_29 = (local0_life27 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill77_30 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill77_31 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill77_32 = new byte[8];
    (__sourceSpill77_32)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local1_life33 = 1;
    while ((local1_life33 < 8)) {
        (__sourceSpill77_32)[local1_life33] = ((byte) ((int) ((local5_life6 << (local1_life33 * 8)) >>> 56)));
        local1_life33 += 1;
    }
    byte[] __sourcePreallocation77_34 = __sourceSpill77_32;
    ((javax.crypto.Cipher)(__sourceSpill77_29)).init(((int)(__sourceSpill77_30)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill77_31)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation77_34)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life37 = -6895467471474620281L;
    byte[] __sourceSpill77_38 = new byte[8];
    (__sourceSpill77_38)[0] = ((byte) ((int) (local2_life37 >>> 56)));
    (__sourceSpill77_38)[1] = ((byte) ((int) (local2_life37 >>> 48)));
    (__sourceSpill77_38)[2] = ((byte) ((int) (local2_life37 >>> 40)));
    (__sourceSpill77_38)[3] = ((byte) ((int) (local2_life37 >>> 32)));
    (__sourceSpill77_38)[4] = ((byte) ((int) (local2_life37 >>> 24)));
    (__sourceSpill77_38)[5] = ((byte) ((int) (local2_life37 >>> 16)));
    (__sourceSpill77_38)[6] = ((byte) ((int) (local2_life37 >>> 8)));
    (__sourceSpill77_38)[7] = ((byte) ((int) local2_life37));
    javax.crypto.Cipher __sourceSpill77_39 = local0_life27;
    byte[] local4_life41 = ((javax.crypto.Cipher)(__sourceSpill77_39)).doFinal(((byte[])(__sourceSpill77_38)));
    j = ((long)((((((((((((long) (local4_life41)[0]) & 255L) << 56) | ((((long) (local4_life41)[1]) & 255L) << 48)) | ((((long) (local4_life41)[2]) & 255L) << 40)) | ((((long) (local4_life41)[3]) & 255L) << 32)) | ((((long) (local4_life41)[4]) & 255L) << 24)) | ((((long) (local4_life41)[5]) & 255L) << 16)) | ((((long) (local4_life41)[6]) & 255L) << 8)) | (((long) (local4_life41)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
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
        byte[] spill186_0 = p0;
        life4_9 += 1;
        life5_44 = (spill186_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill186_1 = p0;
        life4_9 += 1;
        life5_76 = (spill186_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill186_2 = p0;
        life4_9 += 1;
        life5_91 = (spill186_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(com.moon.dW p0) {
com.moon.e6 forwardValue61_20_0;
    com.moon.e6 spill61_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_20: {
    life2_3 = (com.moon.e6.h ^ 83138418136526L);
    life4_5 = com.moon.module.Module.c__IntStatic();
    spill61_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue61_20_0 = spill61_0;
        break forward_join_20;
    }
    if (!((!((com.moon.e6)(spill61_0)).f))) {
        break forward_join_22;
    }
    ((com.moon.dW)(p0)).b(((boolean)(true)));
    ((com.moon.dW)(p0)).a(((boolean)(true)));
    forwardValue61_20_0 = this;
    }
    ((com.moon.e6)(forwardValue61_20_0)).g = ((boolean)(true));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
long life2_3;
    int life4_5;
    moom.zi life5_21;
    lexical_join_34: {
    lexical_join_29: {
    life2_3 = (com.moon.e6.h ^ 47684434101515L);
    life4_5 = com.moon.module.Module.d__IntStatic();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.POST))) {
        break lexical_join_34;
    }
    this.g = ((boolean)(false));
    lexical_cycle_13: while (true) {
    if (!(((life5_21 = ((moom.zi)(((java.util.Queue)(this.e)).poll()))) != null))) {
        break lexical_join_29;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e6.a)).K)).cm)).b(((moom.yK)(life5_21)));
    if (!((life4_5 != 0))) {
        break lexical_join_34;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    ((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e6)(this)).a())))).setSuffix(((java.lang.String)(com.moon.e6.i)));
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue63_13_0;
    com.moon.e6 forwardValue63_48_0;
    int forwardValue63_55_0;
    net.minecraft.client.entity.EntityPlayerSP spill63_0;
    int spill63_1;
    com.moon.e6 spill63_2;
    com.moon.e6 spill63_3;
    long life2_3;
    int life4_5;
    moom.yK life6_25;
    moom.zi life5_36;
    forward_join_59: {
    forward_join_55: {
    forward_join_52: {
    forward_join_48: {
    forward_join_47: {
    forward_join_13: {
    life2_3 = (com.moon.e6.h ^ 69933166424758L);
    life4_5 = com.moon.module.Module.d__IntStatic();
    spill63_0 = ((net.minecraft.client.Minecraft)(com.moon.e6.a)).K;
    if (!((life4_5 != 0))) {
        forwardValue63_13_0 = spill63_0;
        break forward_join_13;
    }
    if (!((spill63_0 != null))) {
        break forward_join_59;
    }
    forwardValue63_13_0 = ((net.minecraft.client.Minecraft)(com.moon.e6.a)).K;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(forwardValue63_13_0)).S > ((int) com.moon.e6.j)))) {
        break forward_join_59;
    }
    life6_25 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    spill63_1 = ((life6_25 instanceof moom.zi) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue63_55_0 = spill63_1;
        break forward_join_55;
    }
    if (!((spill63_1 != 0))) {
        break forward_join_52;
    }
    life5_36 = ((moom.zi)(life6_25));
    spill63_2 = this;
    if (!((life4_5 != 0))) {
        forwardValue63_48_0 = spill63_2;
        break forward_join_48;
    }
    if (!((!((com.moon.e6)(spill63_2)).f))) {
        break forward_join_47;
    }
    spill63_3 = this;
    if (!((life4_5 != 0))) {
        forwardValue63_48_0 = spill63_3;
        break forward_join_48;
    }
    if (!(((com.moon.e6)(spill63_3)).g)) {
        break forward_join_47;
    }
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    ((java.util.Queue)(this.e)).add(((java.lang.Object)(life5_36)));
    }
    forwardValue63_48_0 = this;
    }
    ((com.moon.e6)(forwardValue63_48_0)).f = ((boolean)(false));
    if (!((life4_5 == 0))) {
        break forward_join_59;
    }
    }
    forwardValue63_55_0 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zB) ? 1 : 0);
    }
    if (!((forwardValue63_55_0 != 0))) {
        break forward_join_59;
    }
    this.f = ((boolean)(true));
    }
    return;
}

}
