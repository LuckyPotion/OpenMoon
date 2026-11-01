package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Flight extends com.moon.module.Module {

private com.moon.setting.EnumSetting<com.moon.bs> s;

public com.moon.setting.FloatSetting t;

public com.moon.setting.FloatSetting u;

public com.moon.setting.FloatSetting v;

public com.moon.setting.BooleanSetting w;

public com.moon.setting.IntegerSetting x;

public com.moon.setting.BooleanSetting y;

private static long z;

private static java.lang.String[] A;

private static java.lang.String[] B;

private static java.util.Map C;

private static long[] D;

private static java.lang.Integer[] E;

private static java.util.Map F;

public Flight(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_6f6d5316ff6e0f26(com.moon.module.impl.Flight receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life1 = (com.moon.module.impl.Flight.z ^ 64523547175192L);

    int[] __sourceSpill195_3 = com.moon.bx.b();

    com.moon.module.impl.Flight.__sourceConstructorInit_6f6d5316ff6e0f26_0(((com.moon.module.impl.Flight)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Flight)(receiver)).s = ((com.moon.setting.EnumSetting)(((com.moon.mg)(((com.moon.mg)(com.moon.setting.EnumSetting.builder(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_5(29460, (1733206415857104461L ^ local5_life1)))), ((java.lang.Class)(com.moon.bs.class)), ((com.moon.module.Module)(receiver))))).a(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_8(1706, (3710076358591726586L ^ local5_life1)))), ((java.lang.Enum)(com.moon.bs.VANILLA))))).a()));

    ((com.moon.module.impl.Flight)(receiver)).t = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_13(16867, (607623721553953979L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_15(25586, (5978376238816339622L ^ local5_life1)))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.4p2f)), ((float)(0x1.99999ap-4f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_17(receiver)))))).a()));

    ((com.moon.module.impl.Flight)(receiver)).u = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_21(15531, (5076553252942117370L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_23(31529, (3666729735435107954L ^ local5_life1)))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.4p2f)), ((float)(0x1.99999ap-4f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_25(receiver)))))).a()));

    ((com.moon.module.impl.Flight)(receiver)).v = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_29(11933, (382918774945147841L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_31(10937, (7268680162068590574L ^ local5_life1)))), ((float)(0x1.0p1f)), ((float)(0x0.0p0f)), ((float)(0x1.4p3f)), ((float)(0x1.99999ap-4f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_33(receiver)))))).a()));

    ((com.moon.module.impl.Flight)(receiver)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_37(30151, (2941415953866698900L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_39(18207, (7105891831473996365L ^ local5_life1)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_41(receiver)))))).a()));

    ((com.moon.module.impl.Flight)(receiver)).x = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_45(9745, (1175287938099831628L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_47(26300, (2201337916058412009L ^ local5_life1)))), ((int)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_48(30437, (5140276597396078681L ^ local5_life1)))), ((int)(0)), ((int)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_49(515, (6677496994696393918L ^ local5_life1)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_51(receiver)))))).a()));

    int[] local7_life55 = __sourceSpill195_3;

    ((com.moon.module.impl.Flight)(receiver)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_56(30272, (2739317294147351322L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_58(21043, (4517548016803616613L ^ local5_life1)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_60(receiver)))))).a()));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.bx.b(((int[])(new int[2])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6f6d5316ff6e0f26_0(com.moon.module.impl.Flight a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
z = ((long)(((moom._a)(moom._c.a(((long)(-3636366223700864919L)), ((long)(-2851538153873794244L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(78580833725931L)))));
    C = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.Flight.z ^ 122880569116541L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill273_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill273_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill273_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill273_14 = new byte[8];
    (__sourceSpill273_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill273_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation273_16 = __sourceSpill273_14;
    ((javax.crypto.Cipher)(__sourceSpill273_11)).init(((int)(__sourceSpill273_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill273_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation273_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[14];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "íÓ\0251Z¨aäû\000J¤qâ8UìC\177R\\¿/f* \026<jqÅ×É~!@w1\fxG\023Øý¯eZÊ®ozlÁA¶a¡F,£Zù\002(\007ÆqaÐÕgk<W,:Ô[P\\4eã¿Iwl\031ø\017Gqv¥¤q1tw8¦ÿ\005VÏN_ý3\037\030_5º\000óÇh\031ß\b\"l¦»\f¤\026_qÒ¡Ð\036Õ\032JHb]\031*¿a%°<!\030æñó>Fñâ6¿ 1îß®PH\007½\017·oÛ(7ï$Nívlºbë}1\000Mû\023qî\00700¦b÷·WeØôx²¾4 ÄC.m\035ù×1W\027\002\007({\177CÇ\035¯L\005Ìs^p\020P[\177\001X\ný\035Cæ¹ÒÍæµ( \0175;ÿ\017\031ÿúãçïÛîÐyÐ'å¾ÿÚ.¢>sª#Ôq\016*Ôhtû\020\rogöY¢k0:Ì\016ïCj(1ÞkÛ\nqU:}ð¦^Uµw»çâ\033lÒfR±ÍÏlfçþ_\032×T\001\0024ÿ0)½\027ÍvQR{D\001°÷R\n0\030ñ¯¼\024#%ºååZBE'Ê\035z^ÌN;ö\177Ë£FÆ"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill273_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill273_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill273_29)).doFinal(((byte[])(__sourceSpill273_28)));
        java.lang.String __sourceSpill273_34 = ((java.lang.String)(com.moon.module.impl.Flight.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill273_35 = local20_life19;
        int __sourceSpill273_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill273_35)[__sourceSpill273_36] = __sourceSpill273_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "iqmB3,ª\\æßr%;yÈ¹AÜ\033ÂÃÍÿ\017Y(»nZ\177*§GH7\034\024ð\003úÈd.!OßpÝª\007 ÐH[.Câá¸e\004"))).length();
    local16_life24 = 32;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill273_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill273_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill273_42)).doFinal(((byte[])(__sourceSpill273_41)));
        java.lang.String __sourceSpill273_47 = ((java.lang.String)(com.moon.module.impl.Flight.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill273_48 = local20_life19;
        int __sourceSpill273_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill273_48)[__sourceSpill273_49] = __sourceSpill273_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    A = ((java.lang.String[])(local20_life19));
    B = ((java.lang.String[])(new java.lang.String[14]));
    F = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill273_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill273_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill273_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill273_60 = new byte[8];
    (__sourceSpill273_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill273_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation273_62 = __sourceSpill273_60;
    ((javax.crypto.Cipher)(__sourceSpill273_57)).init(((int)(__sourceSpill273_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill273_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation273_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "Z\023ùRª\025L\037QnOkrÇ~"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill273_71 = local4_life67;
        int __sourceSpill273_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill273_71)).substring(((int)(__sourceSpill273_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill273_76 = local6_life65;
        int __sourceSpill273_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill273_79 = new byte[8];
        (__sourceSpill273_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill273_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill273_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill273_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill273_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill273_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill273_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill273_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill273_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill273_80)).doFinal(((byte[])(__sourceSpill273_79)));
        (__sourceSpill273_76)[__sourceSpill273_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    D = ((long[])(local6_life65));
    E = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public com.moon.setting.BooleanSetting b() {
return this.y;
}


public com.moon.setting.FloatSetting b__kZ() {
return this.u;
}


private static java.lang.String c(byte[] p0) {
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
        byte[] spill1089_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1089_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1089_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1089_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1089_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1089_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8065);
    if (((com.moon.module.impl.Flight.B)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Flight.C)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Flight.C)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ln", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.module.impl.Flight.A)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Flight.B)[life5_8] = com.moon.module.impl.Flight.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Flight.B)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Flight.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.setting.FloatSetting c() {
return this.v;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2476_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ln"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.Flight.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2477_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ln"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11372;
      if (E[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = D[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])F.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               F.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ln", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         E[var3] = var15;
      }

      return E[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.setting.EnumSetting<com.moon.bs> a__k2() {
return this.s;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.t;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.w;
}


public com.moon.setting.IntegerSetting a() {
return this.x;
}


public void a(com.moon.event.TickEvent p0) {
((com.moon.module.impl.Flight)(this)).setSuffix(((java.lang.String)(((com.moon.bs)(((com.moon.bs)(((com.moon.setting.EnumSetting)(this.s)).getValue())))).a__String())));
    return;
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.Flight.z ^ 56286214182726L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bs.VANILLA) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$1() {
long local1 = (com.moon.module.impl.Flight.z ^ 56165626948553L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bs.VANILLA) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$3() {
long local1 = (com.moon.module.impl.Flight.z ^ 67719819436693L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bs.VERUS) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$2() {
long local1 = (com.moon.module.impl.Flight.z ^ 127077755592104L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bs.FUN_CRAFT) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$4() {
java.lang.Object forwardValue833_16_0;
    int forwardValue833_22_0;
    int forwardValue833_24_0;
    java.lang.Object spill833_0;
    boolean spill833_1;
    long life1_3;
    int[] life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.Flight.z ^ 81180826914893L);
    life3_5 = com.moon.bx.b();
    spill833_0 = ((com.moon.setting.EnumSetting)(this.s)).getValue();
    if (!((life3_5 == null))) {
        forwardValue833_16_0 = spill833_0;
        break forward_join_16;
    }
    if (!((spill833_0 == com.moon.bs.VERUS))) {
        break forward_join_23;
    }
    forwardValue833_16_0 = ((com.moon.setting.BooleanSetting)(this.w)).getValue();
    }
    spill833_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue833_16_0)))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue833_22_0 = ((spill833_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill833_1)) {
        break forward_join_23;
    }
    forwardValue833_22_0 = 1;
    }
    forwardValue833_24_0 = forwardValue833_22_0;
    break forward_join_24;
    }
    forwardValue833_24_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue833_24_0))));
}


private java.lang.Boolean lambda$new$5() {
java.lang.Object forwardValue834_16_0;
    int forwardValue834_22_0;
    int forwardValue834_24_0;
    java.lang.Object spill834_0;
    boolean spill834_1;
    long life1_3;
    int[] life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.Flight.z ^ 135123121694718L);
    life3_5 = com.moon.bx.b();
    spill834_0 = ((com.moon.setting.EnumSetting)(this.s)).getValue();
    if (!((life3_5 == null))) {
        forwardValue834_16_0 = spill834_0;
        break forward_join_16;
    }
    if (!((spill834_0 == com.moon.bs.VERUS))) {
        break forward_join_23;
    }
    forwardValue834_16_0 = ((com.moon.setting.BooleanSetting)(this.w)).getValue();
    }
    spill834_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue834_16_0)))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue834_22_0 = ((spill834_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill834_1)) {
        break forward_join_23;
    }
    forwardValue834_22_0 = 1;
    }
    forwardValue834_24_0 = forwardValue834_22_0;
    break forward_join_24;
    }
    forwardValue834_24_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue834_24_0))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_17(com.moon.module.impl.Flight a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_25(com.moon.module.impl.Flight a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_33(com.moon.module.impl.Flight a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_41(com.moon.module.impl.Flight a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_45(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_51(com.moon.module.impl.Flight a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_6f6d5316ff6e0f26_originalDynamicSite195_60(com.moon.module.impl.Flight a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2476_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2477_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
