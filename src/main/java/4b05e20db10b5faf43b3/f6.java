package com.moon;


public class f6 extends com.moon.f0 {

private static final long c;

private static final long d;

public f6() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-8870210779375458380L)), ((long)(-3219158959401020432L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(167531299553273L)))));
    long local0_life6 = (com.moon.f6.c ^ 116307525616030L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill89_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill89_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill89_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill89_13 = new byte[8];
    (__sourceSpill89_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill89_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation89_15 = __sourceSpill89_13;
    ((javax.crypto.Cipher)(__sourceSpill89_10)).init(((int)(__sourceSpill89_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill89_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation89_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -6212876096104141476L;
    byte[] __sourceSpill89_19 = new byte[8];
    (__sourceSpill89_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill89_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill89_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill89_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill89_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill89_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill89_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill89_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill89_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill89_20)).doFinal(((byte[])(__sourceSpill89_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
((com.moon.f6)(this)).f();
    return;
}


public void c() {
return;
}


public void d() {
return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue90_19_0;
    int forwardValue90_45_0;
    int forwardValue90_50_0;
    boolean spill90_0;
    int spill90_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_28;
    net.minecraft.entity.EntityLivingBase life6_33;
    int life7_38;
    double life8_43;
    forward_join_59: {
    forward_join_57: {
    forward_join_53: {
    forward_join_50: {
    forward_join_45: {
    forward_join_19: {
    life2_3 = (com.moon.f6.c ^ 132887828738470L);
    life4_5 = moom.DT.a__Arrayr3();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_59;
    }
    spill90_0 = ((com.moon.f6)(this)).a__Boolean();
    if (!((life4_5 != null))) {
        forwardValue90_19_0 = ((spill90_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill90_0)) {
        break forward_join_59;
    }
    forwardValue90_19_0 = ((((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f6)(this)).b)).a__gd())).a__Boolean()) ? 1 : 0);
    }
    life5_28 = forwardValue90_19_0;
    life6_33 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f6)(this)).b)).a__gd())).a__sG();
    life7_38 = ((com.moon.ga)(((com.moon.module.impl.KillAura)(((com.moon.f6)(this)).b)).a__ga())).a__Int();
    life8_43 = ((com.moon.ga)(((com.moon.module.impl.KillAura)(((com.moon.f6)(this)).b)).a__ga())).b();
    spill90_1 = life5_28;
    if (!((life4_5 != null))) {
        forwardValue90_45_0 = spill90_1;
        break forward_join_45;
    }
    if (!((spill90_1 != 0))) {
        break forward_join_57;
    }
    forwardValue90_45_0 = recovery.source.CarrierOps.dcmpg(((double)(((double) life7_38))), ((double)((life8_43 - 0x1.0p0d))));
    }
    if (!((life4_5 != null))) {
        forwardValue90_50_0 = forwardValue90_45_0;
        break forward_join_50;
    }
    if (!((forwardValue90_45_0 >= 0))) {
        break forward_join_53;
    }
    forwardValue90_50_0 = ((net.minecraft.entity.EntityLivingBase)(life6_33)).U;
    }
    if (!((forwardValue90_50_0 > ((int) com.moon.f6.d)))) {
        break forward_join_57;
    }
    }
    ((com.moon.f6)(this)).e();
    if (!((life4_5 == null))) {
        break forward_join_59;
    }
    }
    ((com.moon.f6)(this)).f();
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
return;
}


public void a__Void() {
return;
}

}
