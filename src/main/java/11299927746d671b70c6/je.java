package com.moon;


public class je {

private final java.util.Map<java.lang.Integer, com.moon.jb> a;

private static net.minecraft.entity.Entity[] b;

private static final long c;

private static final java.lang.String d;

public je() {
super();
    this.a = new java.util.HashMap();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3950203279210591849L)), ((long)(3867553760055953296L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(93759758923617L)))));
    java.lang.Object __sourceSpill197_6 = null;
    long local0_life7 = (com.moon.je.c ^ 59162608104987L);
    com.moon.je.b(((net.minecraft.entity.Entity[])(__sourceSpill197_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill197_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill197_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill197_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill197_15 = new byte[8];
    (__sourceSpill197_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill197_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation197_17 = __sourceSpill197_15;
    ((javax.crypto.Cipher)(__sourceSpill197_12)).init(((int)(__sourceSpill197_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill197_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation197_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill197_21 = ((java.lang.String)("½\013*ë\030Ã")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill197_22 = local2_life10;
    byte[] local4_life24 = ((javax.crypto.Cipher)(__sourceSpill197_22)).doFinal(((byte[])(__sourceSpill197_21)));
    d = ((java.lang.String)(((java.lang.String)(com.moon.je.a(((byte[])(local4_life24))))).intern()));
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.je.b = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.je.b;
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
        byte[] spill816_0 = p0;
        life4_9 += 1;
        life5_44 = (spill816_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill816_1 = p0;
        life4_9 += 1;
        life5_76 = (spill816_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill816_2 = p0;
        life4_9 += 1;
        life5_91 = (spill816_2)[life4_9];
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


public com.moon.jb a() {
long local1 = (com.moon.je.c ^ 6850388636134L);
    this.a(((java.util.Map)(this.a)), ((java.lang.String)(com.moon.je.d)), ((int)(5)), ((com.moon.cc)(com.moon.cc.BITMAP)));
    return ((com.moon.jb)(((java.util.Map)(this.a)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(5))))))));
}


private void a(java.util.Map<java.lang.Integer, com.moon.jb> p0, java.lang.String p1, int p2, com.moon.cc p3) {
java.util.Map forwardValue600_16_0;
    java.lang.Integer forwardValue600_16_1;
    java.util.Map spill600_0;
    java.lang.Integer spill600_1;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    forward_join_25: {
    forward_join_16: {
    life5_3 = (com.moon.je.c ^ 57674195653578L);
    life7_5 = com.moon.je.b();
    spill600_0 = p0;
    spill600_1 = java.lang.Integer.valueOf(((int)(p2)));
    if (!((life7_5 == null))) {
        forwardValue600_16_0 = spill600_0;
        forwardValue600_16_1 = spill600_1;
        break forward_join_16;
    }
    if (!((!((java.util.Map)(spill600_0)).containsKey(((java.lang.Object)(spill600_1)))))) {
        break forward_join_25;
    }
    forwardValue600_16_0 = p0;
    forwardValue600_16_1 = java.lang.Integer.valueOf(((int)(p2)));
    }
    ((java.util.Map)(forwardValue600_16_0)).put(((java.lang.Object)(forwardValue600_16_1)), ((java.lang.Object)(new com.moon.jb(p1, ((float) p2), p3))));
    }
    return;
}

}
