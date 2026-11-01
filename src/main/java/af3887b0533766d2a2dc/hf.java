package com.moon;


class hf implements com.moon.g8 {

com.moon.hc a;

private static long b;

private static java.lang.String c;

hf(com.moon.hc p0) { super(); }


private static void __sourceConstructorBody_67cb2e631e790955(com.moon.hf receiver, com.moon.hc p0) throws Throwable {

((com.moon.hf)(receiver)).a = ((com.moon.hc)(p0));

    com.moon.hf.__sourceConstructorInit_67cb2e631e790955_0(((com.moon.hf)(receiver)));

    return;

}



static {
b = ((long)(((moom._a)(moom._c.a(((long)(3338867388434229901L)), ((long)(-9109899936167233607L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(268262225391134L)))));
    long local0_life6 = (com.moon.hf.b ^ 139450087763445L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill136_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill136_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill136_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill136_13 = new byte[8];
    (__sourceSpill136_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill136_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation136_15 = __sourceSpill136_13;
    ((javax.crypto.Cipher)(__sourceSpill136_10)).init(((int)(__sourceSpill136_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill136_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation136_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill136_19 = ((java.lang.String)("y5²f×}\021")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill136_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill136_20)).doFinal(((byte[])(__sourceSpill136_19)));
    c = ((java.lang.String)(((java.lang.String)(com.moon.hf.a(((byte[])(local4_life22))))).intern()));
}

private static native <E extends Throwable> void __sourceConstructorInit_67cb2e631e790955_0(com.moon.hf a0) throws E;

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
        byte[] spill517_0 = p0;
        life4_9 += 1;
        life5_44 = (spill517_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill517_1 = p0;
        life4_9 += 1;
        life5_76 = (spill517_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill517_2 = p0;
        life4_9 += 1;
        life5_91 = (spill517_2)[life4_9];
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
net.minecraft.entity.Entity forwardValue353_12_0;
    int forwardValue353_25_0;
    int forwardValue353_29_0;
    int forwardValue353_31_0;
    net.minecraft.entity.Entity spill353_0;
    boolean spill353_1;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.entity.player.EntityPlayer life5_19;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_25: {
    forward_join_12: {
    life2_3 = (com.moon.hf.b ^ 75243743815603L);
    life4_5 = moom.mS.a__ArrayString();
    spill353_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue353_12_0 = spill353_0;
        break forward_join_12;
    }
    if (!((((spill353_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_30;
    }
    forwardValue353_12_0 = p0;
    }
    life5_19 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue353_12_0));
    spill353_1 = ((net.minecraft.entity.player.EntityPlayer)(life5_19)).N__Boolean();
    if (!((life4_5 == null))) {
        forwardValue353_25_0 = ((spill353_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill353_1)) {
        break forward_join_30;
    }
    forwardValue353_25_0 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.ESP)(((com.moon.hc)(this.a)).a__lV())).b__k4())).isSelected(((java.lang.Enum)(com.moon.bU.BLOCK)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue353_29_0 = forwardValue353_25_0;
        break forward_join_29;
    }
    if (!((forwardValue353_25_0 != 0))) {
        break forward_join_30;
    }
    forwardValue353_29_0 = 1;
    }
    forwardValue353_31_0 = forwardValue353_29_0;
    break forward_join_31;
    }
    forwardValue353_31_0 = 0;
    }
    return ((forwardValue353_31_0) != 0);
}


public java.lang.String a(net.minecraft.entity.Entity p0) {
long local2 = (com.moon.hf.b ^ 115475342039568L);
    return com.moon.hf.c;
}

}
