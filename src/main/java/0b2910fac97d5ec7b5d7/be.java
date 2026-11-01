package com.moon;


public class be extends sourcebuild.EnumConstructor<com.moon.be> implements com.moon.l8 {

public static com.moon.be PLAYERS;

public static com.moon.be ANIMALS;

public static com.moon.be MOBS;

public static com.moon.be INVISIBLES;

private java.lang.String a;

private java.util.function.Predicate<net.minecraft.entity.Entity> b;

private static com.moon.be[] c;

private static long d;

private be(java.lang.String p0, int p1, java.lang.String p2, java.util.function.Predicate<net.minecraft.entity.Entity> p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(-54978387921341155L)), ((long)(5817781726697319400L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(108554860531172L)))));
    long local9_life6 = (com.moon.be.d ^ 84556632431370L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill60_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill60_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill60_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill60_13 = new byte[8];
    (__sourceSpill60_13)[0] = ((byte) ((int) (local9_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill60_13)[local2_life14] = ((byte) ((int) ((local9_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation60_15 = __sourceSpill60_13;
    ((javax.crypto.Cipher)(__sourceSpill60_10)).init(((int)(__sourceSpill60_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill60_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation60_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[8];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "yPe`\njß.\b=v\002Ñ/*ö\020¸òÝ¾0\nP\177'ÃôÛ2¢\b\007Ý¦ðø¨Ö\bÄ5±ÅÈÌµ³\b¬ßâE¤Tæç"))).length();
    int local4_life23 = 8;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill60_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill60_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill60_28)).doFinal(((byte[])(__sourceSpill60_27)));
        java.lang.String __sourceSpill60_33 = ((java.lang.String)(com.moon.be.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill60_34 = local0_life18;
        int __sourceSpill60_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill60_34)[__sourceSpill60_35] = __sourceSpill60_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    local7_life22 = ((java.lang.String)((local5_life20 = "\006ó-V\004\032Æ\036\020r/'á£ÚóØ)¿P*æü]«"))).length();
    local4_life23 = 8;
    local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill60_41 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill60_42 = local1_life8;
        byte[] local8_life44 = ((javax.crypto.Cipher)(__sourceSpill60_42)).doFinal(((byte[])(__sourceSpill60_41)));
        java.lang.String __sourceSpill60_47 = ((java.lang.String)(com.moon.be.a(((byte[])(local8_life44))))).intern();
        java.lang.String[] __sourceSpill60_48 = local0_life18;
        int __sourceSpill60_49 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill60_48)[__sourceSpill60_49] = __sourceSpill60_47;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    PLAYERS = ((com.moon.be)(new com.moon.be((local0_life18)[6], 0, (local0_life18)[0], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite60_52())));
    ANIMALS = ((com.moon.be)(new com.moon.be((local0_life18)[3], 1, (local0_life18)[4], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite60_54())));
    MOBS = ((com.moon.be)(new com.moon.be((local0_life18)[5], 2, (local0_life18)[1], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite60_56())));
    INVISIBLES = ((com.moon.be)(new com.moon.be((local0_life18)[2], 3, (local0_life18)[7], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite60_58())));
    c = ((com.moon.be[])(com.moon.be.a__Arraybe()));
}


public static com.moon.be[] values() {
return ((com.moon.be[])(((com.moon.be[])(com.moon.be.c)).clone()));
}


public static com.moon.be valueOf(java.lang.String p0) {
return ((com.moon.be)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.be.class)), ((java.lang.String)(p0)))));
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
        byte[] spill73_0 = p0;
        life4_9 += 1;
        life5_44 = (spill73_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill73_1 = p0;
        life4_9 += 1;
        life5_76 = (spill73_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill73_2 = p0;
        life4_9 += 1;
        life5_91 = (spill73_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.be[] a__Arraybe() {
return new com.moon.be[] {com.moon.be.PLAYERS, com.moon.be.ANIMALS, com.moon.be.MOBS, com.moon.be.INVISIBLES};
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.function.Predicate<net.minecraft.entity.Entity> a__Predicate() {
return this.b;
}


public java.lang.String a__String() {
return this.a;
}


private static boolean lambda$static$1(net.minecraft.entity.Entity p0) {
int forwardValue20_22_0;
    int forwardValue20_24_0;
    int spill20_0;
    int spill20_1;
    int spill20_2;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life1_3 = (com.moon.be.d ^ 105637406357639L);
    life3_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill20_0 = ((p0 instanceof moom.sK) ? 1 : 0);
    if (!((life3_5 == 0))) {
        forwardValue20_22_0 = spill20_0;
        break forward_join_22;
    }
    if (!((spill20_0 == 0))) {
        break forward_join_21;
    }
    spill20_1 = ((p0 instanceof moom.tl) ? 1 : 0);
    if (!((life3_5 == 0))) {
        forwardValue20_22_0 = spill20_1;
        break forward_join_22;
    }
    if (!((spill20_1 == 0))) {
        break forward_join_21;
    }
    spill20_2 = ((p0 instanceof net.minecraft.entity.passive.EntityVillager) ? 1 : 0);
    if (!((life3_5 == 0))) {
        forwardValue20_22_0 = spill20_2;
        break forward_join_22;
    }
    if (!((spill20_2 != 0))) {
        break forward_join_23;
    }
    }
    forwardValue20_22_0 = 1;
    }
    forwardValue20_24_0 = forwardValue20_22_0;
    break forward_join_24;
    }
    forwardValue20_24_0 = 0;
    }
    return ((forwardValue20_24_0) != 0);
}


private static boolean lambda$static$0(net.minecraft.entity.Entity p0) {
return ((((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0)) != 0);
}


private static boolean lambda$static$2(net.minecraft.entity.Entity p0) {
int forwardValue21_17_0;
    int forwardValue21_19_0;
    int spill21_0;
    int spill21_1;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (com.moon.be.d ^ 58899038000986L);
    life3_5 = ((com.moon.bg.c()) ? 1 : 0);
    spill21_0 = ((p0 instanceof moom.sZ) ? 1 : 0);
    if (!((life3_5 != 0))) {
        forwardValue21_17_0 = spill21_0;
        break forward_join_17;
    }
    if (!((spill21_0 == 0))) {
        break forward_join_16;
    }
    spill21_1 = ((p0 instanceof net.minecraft.entity.monster.EntityIronGolem) ? 1 : 0);
    if (!((life3_5 != 0))) {
        forwardValue21_17_0 = spill21_1;
        break forward_join_17;
    }
    if (!((spill21_1 != 0))) {
        break forward_join_18;
    }
    }
    forwardValue21_17_0 = 1;
    }
    forwardValue21_19_0 = forwardValue21_17_0;
    break forward_join_19;
    }
    forwardValue21_19_0 = 0;
    }
    return ((forwardValue21_19_0) != 0);
}


private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite60_52() throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite60_54() throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite60_56() throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite60_58() throws E;
}
