package com.moon;


public class jY implements com.moon.scripting.api.functions.ClientFunctions {

private static final net.minecraft.client.Minecraft a;

private static final java.util.Map<java.lang.String, java.lang.String> b;

private com.moon.module.impl.KillAura c;

private com.moon.module.impl.Effects d;

private static final long e;

public jY() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(7330925239013389524L)), ((long)(4025918206163372224L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(256363510512504L)))));

    long local9_life6 = (com.moon.jY.e ^ 110900451917771L);

    javax.crypto.Cipher local1_life8;

    javax.crypto.Cipher __sourceSpill278_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill278_11 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill278_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill278_13 = new byte[8];

    (__sourceSpill278_13)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local2_life14 = 1;

    while ((local2_life14 < 8)) {

        (__sourceSpill278_13)[local2_life14] = ((byte) ((int) ((local9_life6 << (local2_life14 * 8)) >>> 56)));

        local2_life14 += 1;

    }

    byte[] __sourcePreallocation278_15 = __sourceSpill278_13;

    ((javax.crypto.Cipher)(__sourceSpill278_10)).init(((int)(__sourceSpill278_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill278_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation278_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local0_life18 = new java.lang.String[44];

    int local6_life19 = 0;

    java.lang.String local5_life20;

    int local7_life22 = ((java.lang.String)((local5_life20 = "*Ý<þ\023\026\031\bx\020ìsxñ\017ú\b%\031Ùí\r9vR\bX.\017Ö)¹s¡\bä\0018·9wü\bÝä\030\035\001\b\020\021\020\006_Ææ6Üÿþ~H\bH-#\bKÕ¹\001¤\035M\020òB*P_¸úr+¸Z$K.\020\027Hdu_\0228ù¥ÜÏ³ {\b\f\0371ljJ#\b\035æÂRf§p-\b\016y\023\027ÞCþu\b6nßìøö\bC\0016ê\025\bEÕí¤\177aªY\020òB*P_¸\0021\nÚ4\f\020¶p¥` 'yú\035ÊÄB&r\004\bj¬izÏðø\b&\027¡\fò²é\b\"Õ\023|míAr\bVs^¦ºm-\020/QÊÚf<\020ó)ñ-\007ìÕ\0201\027\024üY&WYûÝÃûÌÌ\032\b³W\\V¡d\0207ÀÂçÝÞÖªkCúÆÞ\177µ\b÷j\022¯=ésÐ\b\005:YÛ\021çÜ'\b\033¨Ú|6\bkSNJ\035æ\020) #E¤´·Z\rA³'­$\bYpôXËý\020Hô\035Ï~<\003Gäx{ÄìVÏ\b\030®úí ï?\0208Ú`1×/¯\026HÝ)¤R4'\bú\027¬xå¥ [\bóXCÂ\026Ô*¥\bF­YÙÈ®Q\024\b-Ó\001\037\005ø\006ë\b¶A×¯\020tÐ\036\020$ô\003ý\027ö\023î9[q¥½\b\b\b`mìO\032\031+"))).length();

    int local4_life23 = 8;

    int local3_life24 = -1;

    while (true) {

        local3_life24 += 1;

        byte[] __sourceSpill278_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill278_28 = local1_life8;

        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill278_28)).doFinal(((byte[])(__sourceSpill278_27)));

        java.lang.String __sourceSpill278_33 = ((java.lang.String)(com.moon.jY.a(((byte[])(local8_life30))))).intern();

        java.lang.String[] __sourceSpill278_34 = local0_life18;

        int __sourceSpill278_35 = local6_life19;

        local6_life19 += 1;

        (__sourceSpill278_34)[__sourceSpill278_35] = __sourceSpill278_33;

        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }

        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));

    }

    local7_life22 = ((java.lang.String)((local5_life20 = "¥Á©|%åLË\b¨U\b;b¶"))).length();

    local4_life23 = 8;

    local3_life24 = -1;

    while (true) {

        local3_life24 += 1;

        byte[] __sourceSpill278_41 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill278_42 = local1_life8;

        byte[] local8_life44 = ((javax.crypto.Cipher)(__sourceSpill278_42)).doFinal(((byte[])(__sourceSpill278_41)));

        java.lang.String __sourceSpill278_47 = ((java.lang.String)(com.moon.jY.a(((byte[])(local8_life44))))).intern();

        java.lang.String[] __sourceSpill278_48 = local0_life18;

        int __sourceSpill278_49 = local6_life19;

        local6_life19 += 1;

        (__sourceSpill278_48)[__sourceSpill278_49] = __sourceSpill278_47;

        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }

        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));

    }

    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));

    b = ((java.util.Map)(new java.util.HashMap()));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[37])), ((java.lang.Object)((local0_life18)[18])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[11])), ((java.lang.Object)((local0_life18)[30])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[1])), ((java.lang.Object)((local0_life18)[8])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[13])), ((java.lang.Object)((local0_life18)[17])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[21])), ((java.lang.Object)((local0_life18)[23])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[42])), ((java.lang.Object)((local0_life18)[22])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[4])), ((java.lang.Object)((local0_life18)[15])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[20])), ((java.lang.Object)((local0_life18)[33])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[5])), ((java.lang.Object)((local0_life18)[16])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[19])), ((java.lang.Object)((local0_life18)[39])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[7])), ((java.lang.Object)((local0_life18)[31])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[29])), ((java.lang.Object)((local0_life18)[28])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[0])), ((java.lang.Object)((local0_life18)[27])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[12])), ((java.lang.Object)((local0_life18)[34])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[38])), ((java.lang.Object)((local0_life18)[32])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[36])), ((java.lang.Object)((local0_life18)[35])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[26])), ((java.lang.Object)((local0_life18)[40])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[24])), ((java.lang.Object)((local0_life18)[41])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[43])), ((java.lang.Object)((local0_life18)[6])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[10])), ((java.lang.Object)((local0_life18)[25])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[14])), ((java.lang.Object)((local0_life18)[9])));

    ((java.util.Map)(com.moon.jY.b)).put(((java.lang.Object)((local0_life18)[3])), ((java.lang.Object)((local0_life18)[2])));
}


private static moom.Oo a(moom.Oo p0) {
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
        byte[] spill803_0 = p0;
        life4_9 += 1;
        life5_44 = (spill803_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill803_1 = p0;
        life4_9 += 1;
        life5_76 = (spill803_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill803_2 = p0;
        life4_9 += 1;
        life5_91 = (spill803_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void message(java.lang.String p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue591_13_0;
    net.minecraft.client.entity.EntityPlayerSP spill591_0;
    long life2_3;
    int life4_5;
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.jY.e ^ 32914781851420L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill591_0 = ((net.minecraft.client.Minecraft)(com.moon.jY.a)).K;
    if (!((life4_5 == 0))) {
        forwardValue591_13_0 = spill591_0;
        break forward_join_13;
    }
    if (!((spill591_0 != null))) {
        break forward_join_15;
    }
    forwardValue591_13_0 = ((net.minecraft.client.Minecraft)(com.moon.jY.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue591_13_0)).b(((java.lang.String)(p0)));
    }
    return;
}


public void print(java.lang.String p0) {
boolean spill118_0;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    java.lang.String life6_16;
    java.lang.String life7_21;
    lexical_join_33: {
    lexical_join_31: {
    life2_3 = (com.moon.jY.e ^ 28828616085901L);
    spill118_0 = com.moon.j2.c();
    life5_8 = ((java.util.Set)(((java.util.Map)(com.moon.jY.b)).keySet())).iterator();
    life4_9 = ((spill118_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_31;
    }
    life6_16 = ((java.lang.String)(((java.util.Iterator)(life5_8)).next()));
    life7_21 = ((java.lang.String)(((java.util.Map)(com.moon.jY.b)).get(((java.lang.Object)(life6_16)))));
    p0 = ((java.lang.String)(p0)).replaceAll(((java.lang.String)(life6_16)), ((java.lang.String)(life7_21)));
    if (!((life4_9 == 0))) {
        break lexical_join_33;
    }
    if (!((life4_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    com.moon.nC.a(((java.lang.String)(p0)));
    }
    return;
}


public long time() {
return java.lang.System.currentTimeMillis();
}


public int fps() {
return net.minecraft.client.Minecraft.b();
}


public int current_kill_aura_target() {
com.moon.module.impl.KillAura forwardValue589_20_0;
    net.minecraft.entity.EntityLivingBase forwardValue589_31_0;
    int forwardValue589_32_0;
    com.moon.module.impl.KillAura spill589_0;
    net.minecraft.entity.EntityLivingBase spill589_1;
    long life1_3;
    int life3_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_27: {
    forward_join_20: {
    forward_join_18: {
    life1_3 = (com.moon.jY.e ^ 16468858433694L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill589_0 = this.c;
    if (!((life3_5 == 0))) {
        forwardValue589_20_0 = spill589_0;
        break forward_join_20;
    }
    if (!((spill589_0 == null))) {
        break forward_join_18;
    }
    this.c = ((com.moon.module.impl.KillAura)(((com.moon.module.impl.KillAura)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.KillAura.class)))))));
    }
    forwardValue589_20_0 = this.c;
    }
    spill589_1 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(forwardValue589_20_0)).a__gd())).a__sG();
    if (!((life3_5 == 0))) {
        forwardValue589_31_0 = spill589_1;
        break forward_join_31;
    }
    if (!((spill589_1 == null))) {
        break forward_join_27;
    }
    forwardValue589_32_0 = -1;
    break forward_join_32;
    }
    forwardValue589_31_0 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(this.c)).a__gd())).a__sG();
    }
    forwardValue589_32_0 = ((net.minecraft.entity.EntityLivingBase)(forwardValue589_31_0)).e__Int();
    }
    return forwardValue589_32_0;
}


public void force_effects_redraw() {
com.moon.module.impl.Effects forwardValue590_24_0;
    com.moon.module.impl.Effects spill590_0;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_18: {
    life1_3 = (com.moon.jY.e ^ 129077992524186L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill590_0 = this.d;
    if (!((life3_5 != 0))) {
        forwardValue590_24_0 = spill590_0;
        break forward_join_24;
    }
    if (!((spill590_0 == null))) {
        break forward_join_18;
    }
    this.d = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    }
    ((com.moon.gW)(((com.moon.module.impl.Effects)(this.d)).a__gW())).c();
    forwardValue590_24_0 = this.d;
    }
    ((com.moon.gV)(((com.moon.module.impl.Effects)(forwardValue590_24_0)).a())).a(((boolean)(true)));
    return;
}


public float get_width() {
return ((float) ((net.minecraft.client.Minecraft)(com.moon.jY.a)).G);
}


public float get_height() {
return ((float) ((net.minecraft.client.Minecraft)(com.moon.jY.a)).H);
}


public float get_scaled_height() {
return ((float) ((moom.ir)(com.moon.nS.a())).b__Int());
}


public boolean is_mouse_down(int p0) {
return (__sourceIntrinsic_booleanComparison((org.lwjgl.input.Mouse.isButtonDown(((int)(p0))))) != 0);
}


public float get_scaled_width() {
return ((float) ((moom.ir)(com.moon.nS.a())).a__Int());
}


public void set_timer_speed(double p0) {
((moom.DM)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).l)).c = ((float)(((float) p0)));
    return;
}


public boolean is_key_down(int p0) {
return (__sourceIntrinsic_booleanComparison((org.lwjgl.input.Keyboard.isKeyDown(((int)(p0))))) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
