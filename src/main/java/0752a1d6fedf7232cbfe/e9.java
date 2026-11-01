package com.moon;


public class e9 extends com.moon.e2<com.moon.module.impl.Velocity> {

private boolean e;

private double f;

private int g;

private static final long h;

private static final java.lang.String i;

public e9() {
super(com.moon.module.impl.Velocity.class);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-177820979996799167L)), ((long)(4951183561360087889L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(184166602688135L)))));
    long local0_life6 = (com.moon.e9.h ^ 124232026411993L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill80_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill80_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill80_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill80_13 = new byte[8];
    (__sourceSpill80_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill80_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation80_15 = __sourceSpill80_13;
    ((javax.crypto.Cipher)(__sourceSpill80_10)).init(((int)(__sourceSpill80_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill80_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation80_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill80_19 = ((java.lang.String)("Þjg\003\034ÞqvújÐKFüpu")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill80_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill80_20)).doFinal(((byte[])(__sourceSpill80_19)));
    i = ((java.lang.String)(((java.lang.String)(com.moon.e9.a(((byte[])(local4_life22))))).intern()));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
super.b();
    return;
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
        byte[] spill195_0 = p0;
        life4_9 += 1;
        life5_44 = (spill195_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill195_1 = p0;
        life4_9 += 1;
        life5_76 = (spill195_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill195_2 = p0;
        life4_9 += 1;
        life5_91 = (spill195_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private void a(com.moon.n5 p0) {
return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue69_19_0;
    com.moon.e9 forwardValue69_32_0;
    boolean spill69_0;
    com.moon.e9 spill69_1;
    long life2_3;
    int life4_5;
    forward_join_37: {
    forward_join_32: {
    forward_join_31: {
    forward_join_19: {
    life2_3 = (com.moon.e9.h ^ 77050625819640L);
    life4_5 = com.moon.module.Module.d__IntStatic();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_37;
    }
    spill69_0 = this.e;
    if (!((life4_5 != 0))) {
        forwardValue69_19_0 = ((spill69_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill69_0)) {
        break forward_join_37;
    }
    spill69_1 = this;
    if (!((life4_5 != 0))) {
        forwardValue69_32_0 = spill69_1;
        break forward_join_32;
    }
    forwardValue69_19_0 = ((com.moon.e9)(spill69_1)).g;
    }
    if (!((forwardValue69_19_0 == 3))) {
        break forward_join_31;
    }
    if (!((!((com.moon.module.Module)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Speed.class))))).isEnabled()))) {
        break forward_join_31;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e9.a)).K)).u = ((double)(-0x1.41205bc01a36ep-4d));
    }
    forwardValue69_32_0 = this;
    }
    com.moon.e9 __stackOp69_15_0 = forwardValue69_32_0;
    ((com.moon.e9)(__stackOp69_15_0)).g = ((int)((((com.moon.e9)(__stackOp69_15_0)).g + 1)));
    }
    return;
}


public void a(com.moon.dW p0) {
long life2_3;
    double life5_8;
    int life4_9;
    life2_3 = (com.moon.e9.h ^ 131914659368376L);
    int spill864_0 = com.moon.module.Module.d__IntStatic();
    life5_8 = ((com.moon.n5)(((com.moon.dW)(p0)).a__sourceReturn_821aa26535())).b;
    life4_9 = spill864_0;
    if ((life4_9 != 0)) {
        if ((life5_8 > 0x0.0p0d)) {
        this.f = ((double)(life5_8));
        this.e = ((boolean)(true));
        this.g = ((int)(0));
    }
        ((com.moon.dW)(p0)).b(((boolean)(true)));
    }
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        life4_9 += 1;
        com.moon.module.Module.b(((int)(life4_9)));
    }
    return;
}


public void a(com.moon.event.TickEvent p0) {
long local2 = (com.moon.e9.h ^ 111749945259559L);
    int local4 = com.moon.module.Module.c__IntStatic();
    if ((local4 == 0)) {
        if ((((com.moon.event.TickEvent)(p0)).getPhase() != com.moon.event.TickPhase.PRE)) {
        return;
    }
        ((com.moon.module.impl.Velocity)(((com.moon.module.impl.Velocity)(((com.moon.e9)(this)).a())))).setSuffix(((java.lang.String)(com.moon.e9.i)));
    }
    return;
}

}
