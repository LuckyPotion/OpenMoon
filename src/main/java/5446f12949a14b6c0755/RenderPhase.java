package com.moon.event;


public class RenderPhase extends sourcebuild.EnumConstructor<com.moon.event.RenderPhase> {

public static com.moon.event.RenderPhase PRE;

public static com.moon.event.RenderPhase POST;

private static com.moon.event.RenderPhase[] a;

private static net.minecraft.entity.Entity[] b;

private RenderPhase(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(6109389590381633845L)), ((long)(-7029386467156036808L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(42077452351432L))) ^ 119378668381986L);
    if ((com.moon.event.RenderPhase.b() != null)) {
        com.moon.event.RenderPhase.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[2])));
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill85_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill85_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill85_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill85_13 = new byte[8];
    (__sourceSpill85_13)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill85_13)[local2_life14] = ((byte) ((int) ((local9_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation85_15 = __sourceSpill85_13;
    ((javax.crypto.Cipher)(__sourceSpill85_10)).init(((int)(__sourceSpill85_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill85_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation85_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[2];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "\024`ÈÆ7Äq\bÝ±®áv¸"))).length();
    int local4_life23 = 8;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill85_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill85_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill85_28)).doFinal(((byte[])(__sourceSpill85_27)));
        java.lang.String __sourceSpill85_33 = ((java.lang.String)(com.moon.event.RenderPhase.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill85_34 = local0_life18;
        int __sourceSpill85_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill85_34)[__sourceSpill85_35] = __sourceSpill85_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    PRE = ((com.moon.event.RenderPhase)(new com.moon.event.RenderPhase((local0_life18)[1], 0)));
    POST = ((com.moon.event.RenderPhase)(new com.moon.event.RenderPhase((local0_life18)[0], 1)));
    a = ((com.moon.event.RenderPhase[])(com.moon.event.RenderPhase.a()));
}


public static com.moon.event.RenderPhase[] values() {
return ((com.moon.event.RenderPhase[])(((com.moon.event.RenderPhase[])(com.moon.event.RenderPhase.a)).clone()));
}


public static com.moon.event.RenderPhase valueOf(java.lang.String p0) {
return ((com.moon.event.RenderPhase)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.event.RenderPhase.class)), ((java.lang.String)(p0)))));
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.event.RenderPhase.b;
}


public static void b(net.minecraft.entity.Entity[] p0) {
b = ((net.minecraft.entity.Entity[])(p0));
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
        byte[] spill206_0 = p0;
        life4_9 += 1;
        life5_44 = (spill206_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill206_1 = p0;
        life4_9 += 1;
        life5_76 = (spill206_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill206_2 = p0;
        life4_9 += 1;
        life5_91 = (spill206_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.event.RenderPhase[] a() {
return new com.moon.event.RenderPhase[] {com.moon.event.RenderPhase.PRE, com.moon.event.RenderPhase.POST};
}

}
