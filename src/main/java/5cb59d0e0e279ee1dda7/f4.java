package com.moon;


public class f4 extends com.moon.f0 {

private static final long c;

private static final long d;

public f4() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-4089271249169906822L)), ((long)(-588609044605488428L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(64210889295141L)))));
    long local0_life6 = (com.moon.f4.c ^ 93434108920252L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill87_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill87_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill87_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill87_13 = new byte[8];
    (__sourceSpill87_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill87_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation87_15 = __sourceSpill87_13;
    ((javax.crypto.Cipher)(__sourceSpill87_10)).init(((int)(__sourceSpill87_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill87_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation87_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -1577528710794406133L;
    byte[] __sourceSpill87_19 = new byte[8];
    (__sourceSpill87_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill87_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill87_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill87_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill87_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill87_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill87_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill87_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill87_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill87_20)).doFinal(((byte[])(__sourceSpill87_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
((com.moon.f4)(this)).f();
    return;
}


public void c() {
return;
}


public void d() {
return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue86_19_0;
    int forwardValue86_31_0;
    boolean spill86_0;
    int spill86_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_28;
    net.minecraft.entity.EntityLivingBase life6_33;
    forward_join_40: {
    forward_join_38: {
    forward_join_31: {
    forward_join_19: {
    life2_3 = (com.moon.f4.c ^ 77561466723397L);
    life4_5 = moom.DT.a__Arrayr3();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_40;
    }
    spill86_0 = ((com.moon.f4)(this)).a__Boolean();
    if (!((life4_5 != null))) {
        forwardValue86_19_0 = ((spill86_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill86_0)) {
        break forward_join_40;
    }
    forwardValue86_19_0 = ((((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f4)(this)).b)).a__gd())).a__Boolean()) ? 1 : 0);
    }
    life5_28 = forwardValue86_19_0;
    life6_33 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f4)(this)).b)).a__gd())).a__sG();
    spill86_1 = life5_28;
    if (!((life4_5 != null))) {
        forwardValue86_31_0 = spill86_1;
        break forward_join_31;
    }
    if (!((spill86_1 != 0))) {
        break forward_join_38;
    }
    forwardValue86_31_0 = ((net.minecraft.entity.EntityLivingBase)(life6_33)).U;
    }
    if (!((forwardValue86_31_0 > ((int) com.moon.f4.d)))) {
        break forward_join_38;
    }
    ((com.moon.f4)(this)).e();
    if (!((life4_5 == null))) {
        break forward_join_40;
    }
    }
    ((com.moon.f4)(this)).f();
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
