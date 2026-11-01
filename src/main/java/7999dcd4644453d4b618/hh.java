package com.moon;


class hh implements com.moon.g8 {

com.moon.hc a;

private static long b;

private static java.lang.String c;

hh(com.moon.hc p0) { super(); }


private static void __sourceConstructorBody_bf2d6512f14acb85(com.moon.hh receiver, com.moon.hc p0) throws Throwable {

((com.moon.hh)(receiver)).a = ((com.moon.hc)(p0));

    com.moon.hh.__sourceConstructorInit_bf2d6512f14acb85_0(((com.moon.hh)(receiver)));

    return;

}



static {
b = ((long)(((moom._a)(moom._c.a(((long)(-6538425770957624908L)), ((long)(1949049982642651305L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(40895050051588L)))));
    long local0_life6 = (com.moon.hh.b ^ 13400911555385L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill138_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill138_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill138_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill138_13 = new byte[8];
    (__sourceSpill138_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill138_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation138_15 = __sourceSpill138_13;
    ((javax.crypto.Cipher)(__sourceSpill138_10)).init(((int)(__sourceSpill138_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill138_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation138_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill138_19 = ((java.lang.String)("e\021Õg+\003/")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill138_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill138_20)).doFinal(((byte[])(__sourceSpill138_19)));
    c = ((java.lang.String)(((java.lang.String)(com.moon.hh.a(((byte[])(local4_life22))))).intern()));
}

private static native <E extends Throwable> void __sourceConstructorInit_bf2d6512f14acb85_0(com.moon.hh a0) throws E;

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
        byte[] spill521_0 = p0;
        life4_9 += 1;
        life5_44 = (spill521_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill521_1 = p0;
        life4_9 += 1;
        life5_76 = (spill521_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill521_2 = p0;
        life4_9 += 1;
        life5_91 = (spill521_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue355_12_0;
    int forwardValue355_31_0;
    int forwardValue355_35_0;
    int forwardValue355_37_0;
    net.minecraft.entity.Entity spill355_0;
    int spill355_1;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.entity.player.EntityPlayer life5_19;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_31: {
    forward_join_12: {
    life2_3 = (com.moon.hh.b ^ 10824070177393L);
    life4_5 = moom.mS.a__ArrayString();
    spill355_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue355_12_0 = spill355_0;
        break forward_join_12;
    }
    if (!((((spill355_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_36;
    }
    forwardValue355_12_0 = p0;
    }
    life5_19 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue355_12_0));
    spill355_1 = recovery.source.CarrierOps.dcmpg(((double)(((double) (((net.minecraft.entity.player.EntityPlayer)(life5_19)).b__sourceReturn_bc607678b6() / ((net.minecraft.entity.player.EntityPlayer)(life5_19)).a())))), ((double)(0x1.0p-2d)));
    if (!((life4_5 == null))) {
        forwardValue355_31_0 = spill355_1;
        break forward_join_31;
    }
    if (!((spill355_1 < 0))) {
        break forward_join_36;
    }
    forwardValue355_31_0 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.ESP)(((com.moon.hc)(this.a)).a__lV())).b__k4())).isSelected(((java.lang.Enum)(com.moon.bU.LOW_HP)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue355_35_0 = forwardValue355_31_0;
        break forward_join_35;
    }
    if (!((forwardValue355_31_0 != 0))) {
        break forward_join_36;
    }
    forwardValue355_35_0 = 1;
    }
    forwardValue355_37_0 = forwardValue355_35_0;
    break forward_join_37;
    }
    forwardValue355_37_0 = 0;
    }
    return ((forwardValue355_37_0) != 0);
}


public java.lang.String a(net.minecraft.entity.Entity p0) {
long local2 = (com.moon.hh.b ^ 40342946226130L);
    return com.moon.hh.c;
}

}
