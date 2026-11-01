package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiOverlayDebug extends net.minecraft.client.gui.Gui {

private final net.minecraft.client.Minecraft f;

private final net.minecraft.client.gui.FontRenderer g;

private java.lang.String h;

private java.util.List<java.lang.String> i;

private java.util.List<java.lang.String> j;

private long k;

private long l;

private static final long m;

private static final long[] n;

private static final java.lang.Integer[] o;

private static final java.util.Map p;

private static final long[] q;

private static final java.lang.Long[] r;

private static final java.util.Map s;

public GuiOverlayDebug(net.minecraft.client.Minecraft p0) {
super();
    this.h = null;
    this.i = null;
    this.j = null;
    this.k = 0L;
    this.l = 0L;
    this.f = p0;
    this.g = p0.N;
}


static {
m = ((long)(((moom._a)(moom._c.a(((long)(-6424276116437085050L)), ((long)(1707034183470977780L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(252294275971411L)))));

    p = ((java.util.Map)(new java.util.HashMap(13)));

    long local11_life7 = (net.minecraft.client.gui.GuiOverlayDebug.m ^ 32506626860126L);

    javax.crypto.Cipher local13_life9;

    javax.crypto.Cipher __sourceSpill1316_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill1316_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill1316_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill1316_14 = new byte[8];

    (__sourceSpill1316_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));

    int local14_life15 = 1;

    while ((local14_life15 < 8)) {

        (__sourceSpill1316_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));

        local14_life15 += 1;

    }

    byte[] __sourcePreallocation1316_16 = __sourceSpill1316_14;

    ((javax.crypto.Cipher)(__sourceSpill1316_11)).init(((int)(__sourceSpill1316_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1316_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1316_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local19_life19 = new long[43];

    int local16_life20 = 0;

    java.lang.String local17_life21;

    int local18_life23 = ((java.lang.String)((local17_life21 = "ó]0¥ï))þó\\|\fµQE;0`=¯}\000WúC?:\002WF&Ç%ô\002\026Ë[\000Fö4y7ã\036kßOÆÖÚýF\034\f1-]%Ç\fó0Cã['\006&6¢ºØÜÓv¨\003O'1\000\005Ä_ÍD£î\013¤õ\037ì{*æ\030\022h»y\022>Yõ-{8×÷ê\036éÐê\006\030§ÎX\002«Õÿ\001új\n:DHP§ä¶CPhÃf45öûy<ðïÃ$ïc\tû\1774\t¾@Üá\030\tö\036m\034dåc¼\003B«øåHXßûÑókþÓ\026SÓÅ'\001Êâê^\017\036\003+\005ùzN³±{N/ó6ôLË}ÎÀ\024z¨<Æ<j\\.)ñx®\037xK6KÔ(T@ú]DzêìÏ× FVgA\tmÇ\035Ý^§ûÚR¾«kb²ñAÐ=ÑvçìÜ\003"))).length();

    int local15_life24 = 0;

    do {

        java.lang.String __sourceSpill1316_25 = local17_life21;

        int __sourceSpill1316_26 = local15_life24;

        local15_life24 += 8;

        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1316_25)).substring(((int)(__sourceSpill1316_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill1316_30 = local19_life19;

        int __sourceSpill1316_31 = local16_life20;

        local16_life20 += 1;

        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));

        byte[] __sourceSpill1316_33 = new byte[8];

        (__sourceSpill1316_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));

        (__sourceSpill1316_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));

        (__sourceSpill1316_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));

        (__sourceSpill1316_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));

        (__sourceSpill1316_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));

        (__sourceSpill1316_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));

        (__sourceSpill1316_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));

        (__sourceSpill1316_33)[7] = ((byte) ((int) local21_life32));

        javax.crypto.Cipher __sourceSpill1316_34 = local13_life9;

        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill1316_34)).doFinal(((byte[])(__sourceSpill1316_33)));

        (__sourceSpill1316_30)[__sourceSpill1316_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));

    } while ((!(local15_life24 >= local18_life23)));

    local18_life23 = ((java.lang.String)((local17_life21 = "`fsmiÓ\bq³xNïl¸E"))).length();

    local15_life24 = 0;

    do {

        java.lang.String __sourceSpill1316_38 = local17_life21;

        int __sourceSpill1316_39 = local15_life24;

        local15_life24 += 8;

        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1316_38)).substring(((int)(__sourceSpill1316_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill1316_43 = local19_life19;

        int __sourceSpill1316_44 = local16_life20;

        local16_life20 += 1;

        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));

        byte[] __sourceSpill1316_46 = new byte[8];

        (__sourceSpill1316_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));

        (__sourceSpill1316_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));

        (__sourceSpill1316_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));

        (__sourceSpill1316_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));

        (__sourceSpill1316_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));

        (__sourceSpill1316_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));

        (__sourceSpill1316_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));

        (__sourceSpill1316_46)[7] = ((byte) ((int) local21_life45));

        javax.crypto.Cipher __sourceSpill1316_47 = local13_life9;

        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill1316_47)).doFinal(((byte[])(__sourceSpill1316_46)));

        (__sourceSpill1316_43)[__sourceSpill1316_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));

    } while ((!(local15_life24 >= local18_life23)));

    n = ((long[])(local19_life19));

    o = ((java.lang.Integer[])(new java.lang.Integer[43]));

    s = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life54;

    javax.crypto.Cipher __sourceSpill1316_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill1316_57 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill1316_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill1316_59 = new byte[8];

    (__sourceSpill1316_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));

    int local1_life60 = 1;

    while ((local1_life60 < 8)) {

        (__sourceSpill1316_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));

        local1_life60 += 1;

    }

    byte[] __sourcePreallocation1316_61 = __sourceSpill1316_59;

    ((javax.crypto.Cipher)(__sourceSpill1316_56)).init(((int)(__sourceSpill1316_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1316_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1316_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local6_life64 = new long[5];

    int local3_life65 = 0;

    java.lang.String local4_life66;

    int local5_life68 = ((java.lang.String)((local4_life66 = "=-± _\023SÜ!\r©_ª&;>\toö"))).length();

    int local2_life69 = 0;

    do {

        java.lang.String __sourceSpill1316_70 = local4_life66;

        int __sourceSpill1316_71 = local2_life69;

        local2_life69 += 8;

        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1316_70)).substring(((int)(__sourceSpill1316_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill1316_75 = local6_life64;

        int __sourceSpill1316_76 = local3_life65;

        local3_life65 += 1;

        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));

        byte[] __sourceSpill1316_78 = new byte[8];

        (__sourceSpill1316_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));

        (__sourceSpill1316_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));

        (__sourceSpill1316_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));

        (__sourceSpill1316_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));

        (__sourceSpill1316_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));

        (__sourceSpill1316_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));

        (__sourceSpill1316_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));

        (__sourceSpill1316_78)[7] = ((byte) ((int) local8_life77));

        javax.crypto.Cipher __sourceSpill1316_79 = local0_life54;

        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1316_79)).doFinal(((byte[])(__sourceSpill1316_78)));

        (__sourceSpill1316_75)[__sourceSpill1316_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));

    } while ((!(local2_life69 >= local5_life68)));

    local5_life68 = ((java.lang.String)((local4_life66 = "$Å\024\020¨èq¿uIÂ´¯³\017"))).length();

    local2_life69 = 0;

    do {

        java.lang.String __sourceSpill1316_83 = local4_life66;

        int __sourceSpill1316_84 = local2_life69;

        local2_life69 += 8;

        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill1316_83)).substring(((int)(__sourceSpill1316_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill1316_88 = local6_life64;

        int __sourceSpill1316_89 = local3_life65;

        local3_life65 += 1;

        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));

        byte[] __sourceSpill1316_91 = new byte[8];

        (__sourceSpill1316_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));

        (__sourceSpill1316_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));

        (__sourceSpill1316_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));

        (__sourceSpill1316_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));

        (__sourceSpill1316_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));

        (__sourceSpill1316_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));

        (__sourceSpill1316_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));

        (__sourceSpill1316_91)[7] = ((byte) ((int) local8_life90));

        javax.crypto.Cipher __sourceSpill1316_92 = local0_life54;

        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill1316_92)).doFinal(((byte[])(__sourceSpill1316_91)));

        (__sourceSpill1316_88)[__sourceSpill1316_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));

    } while ((!(local2_life69 >= local5_life68)));

    q = ((long[])(local6_life64));

    r = ((java.lang.Long[])(new java.lang.Long[5]));
}


protected void b(moom.ir p0) {
long life2_3;
    java.util.List life4_6;
    int life5_33;
    java.lang.String life6_42;
    int life7_49;
    int life8_54;
    int life9_61;
    int life10_67;
    lexical_join_103: {
    lexical_join_29: {
    lexical_join_14: {
    life2_3 = (net.minecraft.client.gui.GuiOverlayDebug.m ^ 138220470491620L);
    life4_6 = this.j;
    if (!((life4_6 != null))) {
        break lexical_join_14;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(java.lang.System.currentTimeMillis())), ((long)(this.l))) > 0))) {
        break lexical_join_29;
    }
    }
    life4_6 = ((net.minecraft.client.gui.GuiOverlayDebug)(this)).b();
    this.j = ((java.util.List)(life4_6));
    this.l = ((long)((java.lang.System.currentTimeMillis() + __sourceIntrinsic_a59fcae0fae5_invokedynamic1485_8(24523, (3842120635783026975L ^ life2_3)))));
    }
    life5_33 = 0;
    lexical_cycle_31: while (true) {
    lexical_join_101: {
    if (!((life5_33 < ((java.util.List)(life4_6)).size()))) {
        break lexical_join_103;
    }
    life6_42 = ((java.lang.String)(((java.util.List)(life4_6)).get(((int)(life5_33)))));
    if (!((!com.google.common.base.Strings.isNullOrEmpty(((java.lang.String)(life6_42)))))) {
        break lexical_join_101;
    }
    life7_49 = ((net.minecraft.client.gui.FontRenderer)(this.g)).c;
    life8_54 = ((net.minecraft.client.gui.FontRenderer)(this.g)).a(((java.lang.String)(life6_42)));
    life9_61 = ((((moom.ir)(p0)).a__Int() - 2) - life8_54);
    life10_67 = (2 + (life7_49 * life5_33));
    __sourceExactCall_16cb8f4aa874be(((int)((life9_61 - 1))), ((int)((life10_67 - 1))), ((int)(((life9_61 + life8_54) + 1))), ((int)(((life10_67 + life7_49) - 1))), ((int)(__sourceIntrinsic_a59fcae0fae5_invokedynamic1485_19(22131, (2604923225678296071L ^ life2_3)))));
    ((net.minecraft.client.gui.FontRenderer)(this.g)).b(((java.lang.String)(life6_42)), ((float)(((float) life9_61))), ((float)(((float) life10_67))), ((int)(__sourceIntrinsic_a59fcae0fae5_invokedynamic1485_22(23792, (3951768482505309874L ^ life2_3)))));
    }
    life5_33 += 1;
    continue lexical_cycle_31;
    }
    }
    return;
}


protected java.util.List<java.lang.String> b() {
long life1_3;
    long life3_6;
    long life5_9;
    long life7_12;
    long life9_16;
    java.util.ArrayList life11_190;
    long life12_192;
    long life14_194;
    java.lang.String life16_200;
    moom.DT life17_243;
    net.minecraft.block.state.IBlockState life18_249;
    com.google.common.collect.UnmodifiableIterator life19_281;
    java.util.Map.Entry life20_288;
    java.lang.String life21_293;
    life1_3 = (net.minecraft.client.gui.GuiOverlayDebug.m ^ 105041191292148L);
    life3_6 = ((java.lang.Runtime)(java.lang.Runtime.getRuntime())).maxMemory();
    life5_9 = ((java.lang.Runtime)(java.lang.Runtime.getRuntime())).totalMemory();
    life7_12 = ((java.lang.Runtime)(java.lang.Runtime.getRuntime())).freeMemory();
    life9_16 = (life5_9 - life7_12);
    java.lang.String[] __stackOp1484_8_0 = new java.lang.String[__sourceIntrinsic_ddb9ed984821_invokedynamic1484_7(9715, (2263966906773099194L ^ life1_3))];
    java.lang.String[] spill1484_0 = __stackOp1484_8_0;
    java.lang.String[] spill1484_1 = __stackOp1484_8_0;
    int spill1484_2 = 0;
    java.lang.String spill1484_3 = "Java: %s %dbit";
    java.lang.Object[] __stackOp1484_9_0 = new java.lang.Object[2];
    java.lang.Object[] spill1484_4 = __stackOp1484_9_0;
    (__stackOp1484_9_0)[0] = java.lang.System.getProperty(((java.lang.String)("java.version")));
    java.lang.Object[] __stackOp1484_11_0 = spill1484_4;
    java.lang.Object[] spill1484_5 = __stackOp1484_11_0;
    java.lang.Object[] spill1484_6 = __stackOp1484_11_0;
    int spill1484_7 = 1;
    (spill1484_6)[spill1484_7] = java.lang.Integer.valueOf(((int)((((net.minecraft.client.Minecraft)(this.f)).m__Boolean() ? __sourceIntrinsic_ddb9ed984821_invokedynamic1484_14(32549, (5978768555953653863L ^ life1_3)) : __sourceIntrinsic_ddb9ed984821_invokedynamic1484_15(26638, (2077027633736458088L ^ life1_3))))));
    (spill1484_1)[spill1484_2] = java.lang.String.format(((java.lang.String)(spill1484_3)), ((java.lang.Object[])(spill1484_5)));
    java.lang.String[] __stackOp1484_18_0 = spill1484_0;
    java.lang.String[] spill1484_8 = __stackOp1484_18_0;
    java.lang.String[] spill1484_9 = __stackOp1484_18_0;
    int spill1484_10 = 1;
    java.lang.String spill1484_11 = "Mem: % 2d%% %03d/%03dMB";
    java.lang.Object[] __stackOp1484_19_0 = new java.lang.Object[3];
    java.lang.Object[] spill1484_12 = __stackOp1484_19_0;
    (__stackOp1484_19_0)[0] = java.lang.Long.valueOf(((long)(((life9_16 * __sourceIntrinsic_ddb9ed984821_invokedynamic1484_20(24523, (3842087671788997647L ^ life1_3))) / life3_6))));
    java.lang.Object[] __stackOp1484_22_0 = spill1484_12;
    java.lang.Object[] spill1484_13 = __stackOp1484_22_0;
    (__stackOp1484_22_0)[1] = java.lang.Long.valueOf(((long)(__sourceExactCall_301920c7a6f5f1(((long)(life9_16))))));
    java.lang.Object[] __stackOp1484_25_0 = spill1484_13;
    java.lang.Object[] spill1484_14 = __stackOp1484_25_0;
    (__stackOp1484_25_0)[2] = java.lang.Long.valueOf(((long)(__sourceExactCall_301920c7a6f5f1(((long)(life3_6))))));
    (spill1484_9)[spill1484_10] = java.lang.String.format(((java.lang.String)(spill1484_11)), ((java.lang.Object[])(spill1484_14)));
    java.lang.String[] __stackOp1484_29_0 = spill1484_8;
    java.lang.String[] spill1484_15 = __stackOp1484_29_0;
    java.lang.String[] spill1484_16 = __stackOp1484_29_0;
    int spill1484_17 = 2;
    java.lang.String spill1484_18 = "Allocated: % 2d%% %03dMB";
    java.lang.Object[] __stackOp1484_30_0 = new java.lang.Object[2];
    java.lang.Object[] spill1484_19 = __stackOp1484_30_0;
    (__stackOp1484_30_0)[0] = java.lang.Long.valueOf(((long)(((life5_9 * __sourceIntrinsic_ddb9ed984821_invokedynamic1484_31(24523, (3842087671788997647L ^ life1_3))) / life3_6))));
    java.lang.Object[] __stackOp1484_33_0 = spill1484_19;
    java.lang.Object[] spill1484_20 = __stackOp1484_33_0;
    (__stackOp1484_33_0)[1] = java.lang.Long.valueOf(((long)(__sourceExactCall_301920c7a6f5f1(((long)(life5_9))))));
    (spill1484_16)[spill1484_17] = java.lang.String.format(((java.lang.String)(spill1484_18)), ((java.lang.Object[])(spill1484_20)));
    java.lang.String[] __stackOp1484_37_0 = spill1484_15;
    java.lang.String[] spill1484_21 = __stackOp1484_37_0;
    (__stackOp1484_37_0)[3] = "";
    java.lang.String[] __stackOp1484_38_0 = spill1484_21;
    java.lang.String[] spill1484_22 = __stackOp1484_38_0;
    java.lang.String[] spill1484_23 = __stackOp1484_38_0;
    int spill1484_24 = 4;
    java.lang.String spill1484_25 = "CPU: %s";
    java.lang.Object[] __stackOp1484_39_0 = new java.lang.Object[1];
    java.lang.Object[] spill1484_26 = __stackOp1484_39_0;
    (__stackOp1484_39_0)[0] = net.minecraft.client.renderer.OpenGlHelper.b__String();
    (spill1484_23)[spill1484_24] = java.lang.String.format(((java.lang.String)(spill1484_25)), ((java.lang.Object[])(spill1484_26)));
    java.lang.String[] __stackOp1484_42_0 = spill1484_22;
    java.lang.String[] spill1484_27 = __stackOp1484_42_0;
    (__stackOp1484_42_0)[5] = "";
    java.lang.String[] __stackOp1484_43_0 = spill1484_27;
    java.lang.String[] spill1484_28 = __stackOp1484_43_0;
    java.lang.String[] spill1484_29 = __stackOp1484_43_0;
    int spill1484_30 = __sourceIntrinsic_ddb9ed984821_invokedynamic1484_44(27958, (5078999896993045095L ^ life1_3));
    java.lang.String spill1484_31 = "Display: %dx%d (%s)";
    java.lang.Object[] __stackOp1484_45_0 = new java.lang.Object[3];
    java.lang.Object[] spill1484_32 = __stackOp1484_45_0;
    (__stackOp1484_45_0)[0] = java.lang.Integer.valueOf(((int)(org.lwjgl.opengl.Display.getWidth())));
    java.lang.Object[] __stackOp1484_48_0 = spill1484_32;
    java.lang.Object[] spill1484_33 = __stackOp1484_48_0;
    (__stackOp1484_48_0)[1] = java.lang.Integer.valueOf(((int)(org.lwjgl.opengl.Display.getHeight())));
    java.lang.Object[] __stackOp1484_51_0 = spill1484_33;
    java.lang.Object[] spill1484_34 = __stackOp1484_51_0;
    (__stackOp1484_51_0)[2] = org.lwjgl.opengl.GL11.glGetString(((int)(__sourceIntrinsic_ddb9ed984821_invokedynamic1484_52(4039, (184084328750217375L ^ life1_3)))));
    (spill1484_29)[spill1484_30] = java.lang.String.format(((java.lang.String)(spill1484_31)), ((java.lang.Object[])(spill1484_34)));
    java.lang.String[] __stackOp1484_55_0 = spill1484_28;
    java.lang.String[] spill1484_35 = __stackOp1484_55_0;
    (__stackOp1484_55_0)[__sourceIntrinsic_ddb9ed984821_invokedynamic1484_56(19766, (8171390854757268054L ^ life1_3))] = org.lwjgl.opengl.GL11.glGetString(((int)(__sourceIntrinsic_ddb9ed984821_invokedynamic1484_57(17967, (8556226003248198011L ^ life1_3)))));
    java.lang.String[] __stackOp1484_59_0 = spill1484_35;
    java.lang.String[] spill1484_36 = __stackOp1484_59_0;
    (__stackOp1484_59_0)[__sourceIntrinsic_ddb9ed984821_invokedynamic1484_60(19380, (2673967671638539498L ^ life1_3))] = org.lwjgl.opengl.GL11.glGetString(((int)(__sourceIntrinsic_ddb9ed984821_invokedynamic1484_61(9029, (6282709941912720385L ^ life1_3)))));
    life11_190 = com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(spill1484_36)));
    life12_192 = __sourceExactCall_e2d8cb66b32a88();
    life14_194 = moom.N6.b();
    life16_200 = __sourceIntrinsic_ddb9ed984821_invokedynamic1484_68(__sourceExactCall_301920c7a6f5f1(((long)(life12_192))), __sourceExactCall_301920c7a6f5f1(((long)(life14_194))));
    ((java.util.List)(life11_190)).add(((int)(4)), ((java.lang.Object)(life16_200)));
    ((java.util.List)(life11_190)).set(((int)(5)), ((java.lang.Object)(__sourceIntrinsic_ddb9ed984821_invokedynamic1484_71(moom.N5.d()))));
    if (((net.minecraft.client.gui.GuiOverlayDebug)(this)).a__Boolean()) {
        return life11_190;
    }
    if ((((net.minecraft.client.Minecraft)(this.f)).V != null)) {
        if ((((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(this.f)).V)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK)) {
        if ((__sourceExactCall_49318c7079e312(((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(this.f)).V))) != null)) {
        life17_243 = __sourceExactCall_49318c7079e312(((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(this.f)).V)));
        life18_249 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.f)).I)).a__fE(((moom.DT)(life17_243)));
        if ((((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.f)).I)).a__EL() != net.minecraft.world.WorldType.g)) {
        life18_249 = __sourceExactCall_4e3042eb3e6c68(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life18_249)).a__ch())), ((net.minecraft.block.state.IBlockState)(life18_249)), ((net.minecraft.world.IBlockAccess)(((net.minecraft.client.Minecraft)(this.f)).I)), ((moom.DT)(life17_243)));
    }
        ((java.util.List)(life11_190)).add(((java.lang.Object)("")));
        ((java.util.List)(life11_190)).add(((java.lang.Object)(java.lang.String.valueOf(((java.lang.Object)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(((net.minecraft.block.state.IBlockState)(life18_249)).a__ch())))))))));
        life19_281 = ((com.google.common.collect.ImmutableSet)(((com.google.common.collect.ImmutableMap)(__sourceExactCall_4da07a95bf9046(((net.minecraft.block.state.IBlockState)(life18_249))))).entrySet())).iterator();
        loop_region_272: while (((java.util.Iterator)(life19_281)).hasNext()) {
        life20_288 = ((java.util.Map.Entry)(((java.util.Iterator)(life19_281)).next()));
        life21_293 = ((java.lang.Object)(((java.lang.Comparable)(((java.util.Map.Entry)(life20_288)).getValue())))).toString();
        if ((((java.util.Map.Entry)(life20_288)).getValue() == java.lang.Boolean.TRUE)) {
        life21_293 = __sourceIntrinsic_ddb9ed984821_invokedynamic1484_115(net.minecraft.util.EnumChatFormatting.GREEN, life21_293);
    } else {
        if ((((java.util.Map.Entry)(life20_288)).getValue() == java.lang.Boolean.FALSE)) {
        life21_293 = __sourceIntrinsic_ddb9ed984821_invokedynamic1484_119(net.minecraft.util.EnumChatFormatting.RED, life21_293);
    }
    }
        ((java.util.List)(life11_190)).add(((java.lang.Object)(__sourceIntrinsic_ddb9ed984821_invokedynamic1484_123(((net.minecraft.block.properties.IProperty)(((net.minecraft.block.properties.IProperty)(((java.util.Map.Entry)(life20_288)).getKey())))).a__String(), life21_293))));
    }
    }
    }
    }
    return life11_190;
}


private void b__Void() {
long local1 = (net.minecraft.client.gui.GuiOverlayDebug.m ^ 62064051488152L);
    moom.kZ.i();
    moom.C3 local3 = ((net.minecraft.client.Minecraft)(this.f)).a__C3();
    int local4 = ((moom.C3)(local3)).a();
    int local5 = ((moom.C3)(local3)).b();
    long[] local6 = ((moom.C3)(local3)).a__ArrayLong();
    moom.ir local7 = new moom.ir(this.f);
    int local8 = local4;
    int local9 = 0;
    __sourceExactCall_16cb8f4aa874be(((int)(0)), ((int)((((moom.ir)(local7)).b__Int() - __sourceIntrinsic_9bf881b104f5_invokedynamic8593_9(18062, (6571479171706878135L ^ local1))))), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_10(14981, (5007739737290835108L ^ local1)))), ((int)(((moom.ir)(local7)).b__Int())), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_12(22131, (2604996040479041659L ^ local1)))));
    while ((local8 != local5)) {
        int local10 = ((moom.C3)(local3)).a(((long)((local6)[local8])), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_14(21631, (3201610133208525381L ^ local1)))));
        int local11 = ((net.minecraft.client.gui.GuiOverlayDebug)(this)).a__sourceReturn_7f61ff1305(((int)(moom.Dr.a(((int)(local10)), ((int)(0)), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_16(31920, (8026365174722151066L ^ local1))))))), ((int)(0)), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_18(28884, (4023772688622866163L ^ local1)))), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_19(31920, (8026365174722151066L ^ local1)))));
        ((net.minecraft.client.gui.GuiOverlayDebug)(this)).b(((int)(local9)), ((int)(((moom.ir)(local7)).b__Int())), ((int)((((moom.ir)(local7)).b__Int() - local10))), ((int)(local11)));
        local9 += 1;
        local8 = ((moom.C3)(local3)).a(((int)((local8 + 1))));
    }
    __sourceExactCall_16cb8f4aa874be(((int)(1)), ((int)(((((moom.ir)(local7)).b__Int() - __sourceIntrinsic_9bf881b104f5_invokedynamic8593_26(28884, (4023772688622866163L ^ local1))) + 1))), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_27(10828, (1533391807739663429L ^ local1)))), ((int)(((((moom.ir)(local7)).b__Int() - __sourceIntrinsic_9bf881b104f5_invokedynamic8593_29(28884, (4023772688622866163L ^ local1))) + __sourceIntrinsic_9bf881b104f5_invokedynamic8593_30(14286, (7678617782002747899L ^ local1))))), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_31(22131, (2604996040479041659L ^ local1)))));
    ((net.minecraft.client.gui.FontRenderer)(this.g)).b(((java.lang.String)("60")), ((float)(0x1.0p1f)), ((float)(((float) ((((moom.ir)(local7)).b__Int() - __sourceIntrinsic_9bf881b104f5_invokedynamic8593_35(28884, (4023772688622866163L ^ local1))) + 2)))), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_36(23792, (3951844595425698510L ^ local1)))));
    ((net.minecraft.client.gui.GuiOverlayDebug)(this)).a(((int)(0)), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_38(29941, (4696836040963705564L ^ local1)))), ((int)((((moom.ir)(local7)).b__Int() - __sourceIntrinsic_9bf881b104f5_invokedynamic8593_40(28884, (4023772688622866163L ^ local1))))), ((int)(-1)));
    __sourceExactCall_16cb8f4aa874be(((int)(1)), ((int)(((((moom.ir)(local7)).b__Int() - __sourceIntrinsic_9bf881b104f5_invokedynamic8593_43(31920, (8026365174722151066L ^ local1))) + 1))), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_44(27511, (6577743305426326860L ^ local1)))), ((int)(((((moom.ir)(local7)).b__Int() - __sourceIntrinsic_9bf881b104f5_invokedynamic8593_46(31920, (8026365174722151066L ^ local1))) + __sourceIntrinsic_9bf881b104f5_invokedynamic8593_47(14286, (7678617782002747899L ^ local1))))), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_48(22131, (2604996040479041659L ^ local1)))));
    ((net.minecraft.client.gui.FontRenderer)(this.g)).b(((java.lang.String)("30")), ((float)(0x1.0p1f)), ((float)(((float) ((((moom.ir)(local7)).b__Int() - __sourceIntrinsic_9bf881b104f5_invokedynamic8593_52(31920, (8026365174722151066L ^ local1))) + 2)))), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_53(23792, (3951844595425698510L ^ local1)))));
    ((net.minecraft.client.gui.GuiOverlayDebug)(this)).a(((int)(0)), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_55(29367, (7683131682276232343L ^ local1)))), ((int)((((moom.ir)(local7)).b__Int() - __sourceIntrinsic_9bf881b104f5_invokedynamic8593_57(31920, (8026365174722151066L ^ local1))))), ((int)(-1)));
    ((net.minecraft.client.gui.GuiOverlayDebug)(this)).a(((int)(0)), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_59(29367, (7683131682276232343L ^ local1)))), ((int)((((moom.ir)(local7)).b__Int() - 1))), ((int)(-1)));
    ((net.minecraft.client.gui.GuiOverlayDebug)(this)).b(((int)(0)), ((int)((((moom.ir)(local7)).b__Int() - __sourceIntrinsic_9bf881b104f5_invokedynamic8593_63(31920, (8026365174722151066L ^ local1))))), ((int)(((moom.ir)(local7)).b__Int())), ((int)(-1)));
    ((net.minecraft.client.gui.GuiOverlayDebug)(this)).b(((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_66(29367, (7683131682276232343L ^ local1)))), ((int)((((moom.ir)(local7)).b__Int() - __sourceIntrinsic_9bf881b104f5_invokedynamic8593_68(31920, (8026365174722151066L ^ local1))))), ((int)(((moom.ir)(local7)).b__Int())), ((int)(-1)));
    if ((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.f)).W)).r <= __sourceIntrinsic_9bf881b104f5_invokedynamic8593_74(3564, (4746752492869006301L ^ local1)))) {
        ((net.minecraft.client.gui.GuiOverlayDebug)(this)).a(((int)(0)), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_75(29367, (7683131682276232343L ^ local1)))), ((int)(((((moom.ir)(local7)).b__Int() - __sourceIntrinsic_9bf881b104f5_invokedynamic8593_77(31920, (8026365174722151066L ^ local1))) + (((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.f)).W)).r / 2)))), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic8593_81(1529, (7355088534190898139L ^ local1)))));
    }
    moom.kZ.j();
    return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral10314_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 19950);
    if (((net.minecraft.client.gui.GuiOverlayDebug.r)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.client.gui.GuiOverlayDebug.q)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.client.gui.GuiOverlayDebug.s)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.client.gui.GuiOverlayDebug.s)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/gC", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.client.gui.GuiOverlayDebug.r)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.client.gui.GuiOverlayDebug.r)[life3_8])).longValue();
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.client.gui.GuiOverlayDebug.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26987;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gC", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiOverlayDebug.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10316_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private boolean a__Boolean() {
int forwardValue4793_13_0;
    forward_join_13: {
    forward_join_12: {
    forward_join_10: {
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.f)).K)).V()))) {
        break forward_join_10;
    }
    if (!(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.f)).W)).H)) {
        break forward_join_12;
    }
    }
    forwardValue4793_13_0 = 1;
    break forward_join_13;
    }
    forwardValue4793_13_0 = 0;
    }
    return ((forwardValue4793_13_0) != 0);
}


public void a(moom.ir p0) {
((moom.A9)(((net.minecraft.client.Minecraft)(this.f)).j)).a__Void(((java.lang.String)("debug")));
    moom.kZ.B();
    ((net.minecraft.client.gui.GuiOverlayDebug)(this)).a__Void();
    ((net.minecraft.client.gui.GuiOverlayDebug)(this)).b(((moom.ir)(p0)));
    moom.kZ.C();
    if ((((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.f)).W)).aS) ? 1 : 0) != 0)) {
        ((net.minecraft.client.gui.GuiOverlayDebug)(this)).b__Void();
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.f)).j)).b();
    return;
}


private int a(int p0, int p1, float p2) {
long local4 = (net.minecraft.client.gui.GuiOverlayDebug.m ^ 84660011828270L);
    int local6 = ((p0 >> __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_1(30840, (2423341358712145912L ^ local4))) & __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_2(27527, (494620932177613845L ^ local4)));
    int local7 = ((p0 >> __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_3(14068, (4983995157208926561L ^ local4))) & __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_4(19995, (1561308590049391016L ^ local4)));
    int local8 = ((p0 >> __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_5(19380, (2673946418245202992L ^ local4))) & __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_6(19995, (1561308590049391016L ^ local4)));
    int local9 = (p0 & __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_7(19995, (1561308590049391016L ^ local4)));
    int local10 = ((p1 >> __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_8(2961, (1488189722164081708L ^ local4))) & __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_9(19995, (1561308590049391016L ^ local4)));
    int local11 = ((p1 >> __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_10(31575, (6265882850754381014L ^ local4))) & __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_11(19995, (1561308590049391016L ^ local4)));
    int local12 = ((p1 >> __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_12(19380, (2673946418245202992L ^ local4))) & __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_13(19995, (1561308590049391016L ^ local4)));
    int local13 = (p1 & __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_14(19995, (1561308590049391016L ^ local4)));
    int local14 = moom.Dr.a(((int)(((int) (((float) local6) + (((float) (local10 - local6)) * p2))))), ((int)(0)), ((int)(__sourceIntrinsic_7ec54f765870_originalDynamicSite1787_15(19995, (1561308590049391016L ^ local4)))));
    int local15 = moom.Dr.a(((int)(((int) (((float) local7) + (((float) (local11 - local7)) * p2))))), ((int)(0)), ((int)(__sourceIntrinsic_7ec54f765870_originalDynamicSite1787_17(19995, (1561308590049391016L ^ local4)))));
    int local16 = moom.Dr.a(((int)(((int) (((float) local8) + (((float) (local12 - local8)) * p2))))), ((int)(0)), ((int)(__sourceIntrinsic_7ec54f765870_originalDynamicSite1787_19(19995, (1561308590049391016L ^ local4)))));
    int local17 = moom.Dr.a(((int)(((int) (((float) local9) + (((float) (local13 - local9)) * p2))))), ((int)(0)), ((int)(__sourceIntrinsic_7ec54f765870_originalDynamicSite1787_21(19995, (1561308590049391016L ^ local4)))));
    return ((((local14 << __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_23(2961, (1488189722164081708L ^ local4))) | (local15 << __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_24(31575, (6265882850754381014L ^ local4)))) | (local16 << __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_25(19380, (2673946418245202992L ^ local4)))) | local17);
}


private int a__sourceReturn_7f61ff1305(int p0, int p1, int p2, int p3) {
long local5 = (net.minecraft.client.gui.GuiOverlayDebug.m ^ 94447144680266L);
    return ((p0 < p2) ? ((net.minecraft.client.gui.GuiOverlayDebug)(this)).a(((int)(__sourceIntrinsic_bf1f811575b2_invokedynamic10318_1(19671, (506412011034397742L ^ local5)))), ((int)(__sourceIntrinsic_bf1f811575b2_invokedynamic10318_2(3936, (6352397909408059284L ^ local5)))), ((float)((((float) p0) / ((float) p2))))) : ((net.minecraft.client.gui.GuiOverlayDebug)(this)).a(((int)(__sourceIntrinsic_bf1f811575b2_invokedynamic10318_4(11424, (4306616331122125948L ^ local5)))), ((int)(__sourceIntrinsic_bf1f811575b2_invokedynamic10318_5(18161, (4628454019188377125L ^ local5)))), ((float)((((float) (p0 - p2)) / ((float) (p3 - p2)))))));
}


protected java.util.List<java.lang.String> a() {
java.lang.String[] spill451_0;
    java.lang.String[] spill451_1;
    java.lang.String[] spill451_2;
    java.lang.String[] spill451_3;
    java.lang.String[] spill451_4;
    java.lang.String[] spill451_5;
    java.lang.String[] spill451_6;
    java.lang.String[] spill451_7;
    java.lang.String[] spill451_8;
    int spill451_9;
    java.lang.String spill451_10;
    java.lang.Object[] spill451_11;
    java.lang.Object[] spill451_12;
    java.lang.Object[] spill451_13;
    java.lang.String[] spill451_14;
    java.lang.String[] spill451_15;
    java.lang.String[] spill451_16;
    java.lang.String[] spill451_17;
    java.lang.String[] spill451_18;
    java.lang.String[] spill451_19;
    java.lang.String[] spill451_20;
    java.lang.String[] spill451_21;
    java.lang.String[] spill451_22;
    int spill451_23;
    java.lang.String spill451_24;
    java.lang.Object[] spill451_25;
    java.lang.Object[] spill451_26;
    java.lang.Object[] spill451_27;
    java.lang.String[] spill451_28;
    java.lang.String[] spill451_29;
    int spill451_30;
    java.lang.String spill451_31;
    java.lang.Object[] spill451_32;
    java.lang.Object[] spill451_33;
    java.lang.Object[] spill451_34;
    java.lang.String[] spill451_35;
    java.lang.String[] spill451_36;
    int spill451_37;
    java.lang.String spill451_38;
    java.lang.Object[] spill451_39;
    java.lang.Object[] spill451_40;
    java.lang.Object[] spill451_41;
    java.lang.Object[] spill451_42;
    java.lang.Object[] spill451_43;
    java.lang.Object[] spill451_44;
    java.lang.String[] spill451_45;
    java.lang.String[] spill451_46;
    int spill451_47;
    java.lang.String spill451_48;
    java.lang.Object[] spill451_49;
    java.lang.Object[] spill451_50;
    java.lang.Object[] spill451_51;
    java.lang.Object[] spill451_52;
    java.util.ArrayList spill451_53;
    java.lang.String spill451_54;
    java.lang.Object[] spill451_55;
    java.lang.Object[] spill451_56;
    java.util.ArrayList spill451_57;
    java.lang.String spill451_58;
    java.lang.Object[] spill451_59;
    java.lang.Object[] spill451_60;
    java.lang.Object[] spill451_61;
    long life1_3;
    moom.DT life3_20;
    java.lang.StringBuilder life4_33;
    int life5_35;
    int life6_41;
    java.lang.StringBuilder life4_111;
    net.minecraft.client.renderer.texture.TextureMap life5_113;
    java.lang.String life6_143;
    net.minecraft.entity.Entity life7_263;
    moom.bs life8_266;
    java.lang.String life9_268;
    java.util.ArrayList life10_521;
    net.minecraft.world.chunk.Chunk life11_540;
    moom.Eh life12_574;
    net.minecraft.entity.player.EntityPlayerMP life13_595;
    moom.Eh life14_608;
    moom.DT life11_689;
    forward_join_674: {
    forward_join_629: {
    forward_join_611: {
    forward_join_584: {
    forward_join_262: {
    forward_join_260: {
    forward_join_257: {
    forward_join_254: {
    forward_join_251: {
    forward_join_237: {
    forward_join_113: {
    forward_join_90: {
    forward_join_80: {
    forward_join_74: {
    forward_join_68: {
    forward_join_62: {
    forward_join_56: {
    forward_join_50: {
    life1_3 = (net.minecraft.client.gui.GuiOverlayDebug.m ^ 96814911905563L);
    life3_20 = new moom.DT(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.f)).a__r3())).n, ((moom.CA)(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.f)).a__r3())).b())).c, ((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.f)).a__r3())).p);
    if (!((((net.minecraft.client.Minecraft)(this.f)).Z != this.h))) {
        break forward_join_90;
    }
    life4_33 = new java.lang.StringBuilder(((net.minecraft.client.Minecraft)(this.f)).Z);
    life5_35 = moom.BU.i();
    life6_41 = ((java.lang.String)(((net.minecraft.client.Minecraft)(this.f)).Z)).indexOf(((java.lang.String)(" fps ")));
    if (!((life6_41 >= 0))) {
        break forward_join_50;
    }
    ((java.lang.StringBuilder)(life4_33)).insert(((int)(life6_41)), ((java.lang.String)(__sourceIntrinsic_4adeefca06d1_invokedynamic451_20(life5_35))));
    }
    if (!(moom.BU.aF())) {
        break forward_join_56;
    }
    ((java.lang.StringBuilder)(life4_33)).append(((java.lang.String)(" sf")));
    }
    if (!(moom.BU.V())) {
        break forward_join_62;
    }
    ((java.lang.StringBuilder)(life4_33)).append(((java.lang.String)(" af")));
    }
    if (!(moom.BU.W())) {
        break forward_join_68;
    }
    ((java.lang.StringBuilder)(life4_33)).append(((java.lang.String)(" aa")));
    }
    if (!(moom.BU.aD())) {
        break forward_join_74;
    }
    ((java.lang.StringBuilder)(life4_33)).append(((java.lang.String)(" reg")));
    }
    if (!(moom.BU.ap())) {
        break forward_join_80;
    }
    ((java.lang.StringBuilder)(life4_33)).append(((java.lang.String)(" sh")));
    }
    ((net.minecraft.client.Minecraft)(this.f)).Z = ((java.lang.String)(((java.lang.StringBuilder)(life4_33)).toString()));
    this.h = ((java.lang.String)(((net.minecraft.client.Minecraft)(this.f)).Z));
    }
    life4_111 = new java.lang.StringBuilder();
    life5_113 = moom.BU.a__n8();
    ((java.lang.StringBuilder)(life4_111)).append(((java.lang.String)(", A: ")));
    if (!(moom.JY.a__Boolean())) {
        break forward_join_113;
    }
    ((java.lang.StringBuilder)(life4_111)).append(((int)((((net.minecraft.client.renderer.texture.TextureMap)(life5_113)).h() + moom.J2.b()))));
    ((java.lang.StringBuilder)(life4_111)).append(((java.lang.String)("/")));
    }
    ((java.lang.StringBuilder)(life4_111)).append(((int)((((net.minecraft.client.renderer.texture.TextureMap)(life5_113)).g() + moom.J2.a()))));
    life6_143 = ((java.lang.StringBuilder)(life4_111)).toString();
    if (!(((net.minecraft.client.gui.GuiOverlayDebug)(this)).a__Boolean())) {
        break forward_join_237;
    }
    java.lang.String[] __stackOp451_51_0 = new java.lang.String[__sourceIntrinsic_4adeefca06d1_invokedynamic451_50(351, (2133817836695381488L ^ life1_3))];
    spill451_0 = __stackOp451_51_0;
    (__stackOp451_51_0)[0] = __sourceIntrinsic_4adeefca06d1_invokedynamic451_55(((net.minecraft.client.Minecraft)(this.f)).a__String(), moom.fK.a());
    java.lang.String[] __stackOp451_56_0 = spill451_0;
    spill451_1 = __stackOp451_56_0;
    (__stackOp451_56_0)[1] = ((net.minecraft.client.Minecraft)(this.f)).Z;
    java.lang.String[] __stackOp451_59_0 = spill451_1;
    spill451_2 = __stackOp451_59_0;
    (__stackOp451_59_0)[2] = ((net.minecraft.client.renderer.RenderGlobal)(((net.minecraft.client.Minecraft)(this.f)).J)).a__String();
    java.lang.String[] __stackOp451_63_0 = spill451_2;
    spill451_3 = __stackOp451_63_0;
    (__stackOp451_63_0)[3] = ((net.minecraft.client.renderer.RenderGlobal)(((net.minecraft.client.Minecraft)(this.f)).J)).b__String();
    java.lang.String[] __stackOp451_67_0 = spill451_3;
    spill451_4 = __stackOp451_67_0;
    (__stackOp451_67_0)[4] = __sourceIntrinsic_4adeefca06d1_invokedynamic451_74(((net.minecraft.client.particle.EffectRenderer)(((net.minecraft.client.Minecraft)(this.f)).M)).a(), ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.f)).I)).a__String(), life6_143);
    java.lang.String[] __stackOp451_75_0 = spill451_4;
    spill451_5 = __stackOp451_75_0;
    (__stackOp451_75_0)[5] = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.f)).I)).b__String();
    java.lang.String[] __stackOp451_79_0 = spill451_5;
    spill451_6 = __stackOp451_79_0;
    (__stackOp451_79_0)[__sourceIntrinsic_4adeefca06d1_invokedynamic451_80(23658, (6852248540762487001L ^ life1_3))] = "";
    java.lang.String[] __stackOp451_81_0 = spill451_6;
    spill451_7 = __stackOp451_81_0;
    spill451_8 = __stackOp451_81_0;
    spill451_9 = __sourceIntrinsic_4adeefca06d1_invokedynamic451_82(17510, (7579942266592895210L ^ life1_3));
    spill451_10 = "Chunk-relative: %d %d %d";
    java.lang.Object[] __stackOp451_83_0 = new java.lang.Object[3];
    spill451_11 = __stackOp451_83_0;
    (__stackOp451_83_0)[0] = java.lang.Integer.valueOf(((int)((((moom.DT)(life3_20)).a() & __sourceIntrinsic_4adeefca06d1_invokedynamic451_85(27503, (3406461096336691152L ^ life1_3))))));
    java.lang.Object[] __stackOp451_87_0 = spill451_11;
    spill451_12 = __stackOp451_87_0;
    (__stackOp451_87_0)[1] = java.lang.Integer.valueOf(((int)((((moom.DT)(life3_20)).b() & __sourceIntrinsic_4adeefca06d1_invokedynamic451_89(27497, (4034763520677416901L ^ life1_3))))));
    java.lang.Object[] __stackOp451_91_0 = spill451_12;
    spill451_13 = __stackOp451_91_0;
    (__stackOp451_91_0)[2] = java.lang.Integer.valueOf(((int)((((moom.DT)(life3_20)).c() & __sourceIntrinsic_4adeefca06d1_invokedynamic451_93(27497, (4034763520677416901L ^ life1_3))))));
    (spill451_8)[spill451_9] = java.lang.String.format(((java.lang.String)(spill451_10)), ((java.lang.Object[])(spill451_13)));
    return com.google.common.collect.Lists.newArrayList(((spill451_7)));
    }
    life7_263 = ((net.minecraft.client.Minecraft)(this.f)).a__r3();
    life8_266 = ((net.minecraft.entity.Entity)(life7_263)).b__bs();
    life9_268 = "Invalid";
    switch ((moom.hQ.a)[((moom.bs)(life8_266)).ordinal()]) {
case 1:
{
        break forward_join_251;
    }
case 2:
{
        break forward_join_254;
    }
case 3:
{
        break forward_join_257;
    }
case 4:
{
        break forward_join_260;
    }
default:
{
        break forward_join_262;
    }
}
    }
    life9_268 = "Towards negative Z";
    break forward_join_262;
    }
    life9_268 = "Towards positive Z";
    break forward_join_262;
    }
    life9_268 = "Towards negative X";
    break forward_join_262;
    }
    life9_268 = "Towards positive X";
    }
    java.lang.String[] __stackOp451_103_0 = new java.lang.String[__sourceIntrinsic_4adeefca06d1_invokedynamic451_102(31813, (8986365714349725890L ^ life1_3))];
    spill451_14 = __stackOp451_103_0;
    (__stackOp451_103_0)[0] = __sourceIntrinsic_4adeefca06d1_invokedynamic451_107(((net.minecraft.client.Minecraft)(this.f)).a__String(), moom.fK.a());
    java.lang.String[] __stackOp451_108_0 = spill451_14;
    spill451_15 = __stackOp451_108_0;
    (__stackOp451_108_0)[1] = ((net.minecraft.client.Minecraft)(this.f)).Z;
    java.lang.String[] __stackOp451_111_0 = spill451_15;
    spill451_16 = __stackOp451_111_0;
    (__stackOp451_111_0)[2] = ((net.minecraft.client.renderer.RenderGlobal)(((net.minecraft.client.Minecraft)(this.f)).J)).a__String();
    java.lang.String[] __stackOp451_115_0 = spill451_16;
    spill451_17 = __stackOp451_115_0;
    (__stackOp451_115_0)[3] = ((net.minecraft.client.renderer.RenderGlobal)(((net.minecraft.client.Minecraft)(this.f)).J)).b__String();
    java.lang.String[] __stackOp451_119_0 = spill451_17;
    spill451_18 = __stackOp451_119_0;
    (__stackOp451_119_0)[4] = __sourceIntrinsic_4adeefca06d1_invokedynamic451_126(((net.minecraft.client.particle.EffectRenderer)(((net.minecraft.client.Minecraft)(this.f)).M)).a(), ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.f)).I)).a__String(), life6_143);
    java.lang.String[] __stackOp451_127_0 = spill451_18;
    spill451_19 = __stackOp451_127_0;
    (__stackOp451_127_0)[5] = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.f)).I)).b__String();
    java.lang.String[] __stackOp451_131_0 = spill451_19;
    spill451_20 = __stackOp451_131_0;
    (__stackOp451_131_0)[__sourceIntrinsic_4adeefca06d1_invokedynamic451_132(27958, (5079001526724069768L ^ life1_3))] = "";
    java.lang.String[] __stackOp451_133_0 = spill451_20;
    spill451_21 = __stackOp451_133_0;
    spill451_22 = __stackOp451_133_0;
    spill451_23 = __sourceIntrinsic_4adeefca06d1_invokedynamic451_134(19766, (8171389229975513529L ^ life1_3));
    spill451_24 = "XYZ: %.3f / %.5f / %.3f";
    java.lang.Object[] __stackOp451_135_0 = new java.lang.Object[3];
    spill451_25 = __stackOp451_135_0;
    (__stackOp451_135_0)[0] = java.lang.Double.valueOf(((double)(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.f)).a__r3())).n)));
    java.lang.Object[] __stackOp451_140_0 = spill451_25;
    spill451_26 = __stackOp451_140_0;
    (__stackOp451_140_0)[1] = java.lang.Double.valueOf(((double)(((moom.CA)(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.f)).a__r3())).b())).c)));
    java.lang.Object[] __stackOp451_146_0 = spill451_26;
    spill451_27 = __stackOp451_146_0;
    (__stackOp451_146_0)[2] = java.lang.Double.valueOf(((double)(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.f)).a__r3())).p)));
    (spill451_22)[spill451_23] = java.lang.String.format(((java.lang.String)(spill451_24)), ((java.lang.Object[])(spill451_27)));
    java.lang.String[] __stackOp451_152_0 = spill451_21;
    spill451_28 = __stackOp451_152_0;
    spill451_29 = __stackOp451_152_0;
    spill451_30 = __sourceIntrinsic_4adeefca06d1_invokedynamic451_153(19380, (2673960514403348229L ^ life1_3));
    spill451_31 = "Block: %d %d %d";
    java.lang.Object[] __stackOp451_154_0 = new java.lang.Object[3];
    spill451_32 = __stackOp451_154_0;
    (__stackOp451_154_0)[0] = java.lang.Integer.valueOf(((int)(((moom.DT)(life3_20)).a())));
    java.lang.Object[] __stackOp451_157_0 = spill451_32;
    spill451_33 = __stackOp451_157_0;
    (__stackOp451_157_0)[1] = java.lang.Integer.valueOf(((int)(((moom.DT)(life3_20)).b())));
    java.lang.Object[] __stackOp451_160_0 = spill451_33;
    spill451_34 = __stackOp451_160_0;
    (__stackOp451_160_0)[2] = java.lang.Integer.valueOf(((int)(((moom.DT)(life3_20)).c())));
    (spill451_29)[spill451_30] = java.lang.String.format(((java.lang.String)(spill451_31)), ((java.lang.Object[])(spill451_34)));
    java.lang.String[] __stackOp451_164_0 = spill451_28;
    spill451_35 = __stackOp451_164_0;
    spill451_36 = __stackOp451_164_0;
    spill451_37 = __sourceIntrinsic_4adeefca06d1_invokedynamic451_165(1640, (654191921474757318L ^ life1_3));
    spill451_38 = "Chunk: %d %d %d in %d %d %d";
    java.lang.Object[] __stackOp451_167_0 = new java.lang.Object[__sourceIntrinsic_4adeefca06d1_invokedynamic451_166(27958, (5079001526724069768L ^ life1_3))];
    spill451_39 = __stackOp451_167_0;
    (__stackOp451_167_0)[0] = java.lang.Integer.valueOf(((int)((((moom.DT)(life3_20)).a() & __sourceIntrinsic_4adeefca06d1_invokedynamic451_169(27497, (4034763520677416901L ^ life1_3))))));
    java.lang.Object[] __stackOp451_171_0 = spill451_39;
    spill451_40 = __stackOp451_171_0;
    (__stackOp451_171_0)[1] = java.lang.Integer.valueOf(((int)((((moom.DT)(life3_20)).b() & __sourceIntrinsic_4adeefca06d1_invokedynamic451_173(27497, (4034763520677416901L ^ life1_3))))));
    java.lang.Object[] __stackOp451_175_0 = spill451_40;
    spill451_41 = __stackOp451_175_0;
    (__stackOp451_175_0)[2] = java.lang.Integer.valueOf(((int)((((moom.DT)(life3_20)).c() & __sourceIntrinsic_4adeefca06d1_invokedynamic451_177(27497, (4034763520677416901L ^ life1_3))))));
    java.lang.Object[] __stackOp451_179_0 = spill451_41;
    spill451_42 = __stackOp451_179_0;
    (__stackOp451_179_0)[3] = java.lang.Integer.valueOf(((int)((((moom.DT)(life3_20)).a() >> 4))));
    java.lang.Object[] __stackOp451_182_0 = spill451_42;
    spill451_43 = __stackOp451_182_0;
    (__stackOp451_182_0)[4] = java.lang.Integer.valueOf(((int)((((moom.DT)(life3_20)).b() >> 4))));
    java.lang.Object[] __stackOp451_185_0 = spill451_43;
    spill451_44 = __stackOp451_185_0;
    (__stackOp451_185_0)[5] = java.lang.Integer.valueOf(((int)((((moom.DT)(life3_20)).c() >> 4))));
    (spill451_36)[spill451_37] = java.lang.String.format(((java.lang.String)(spill451_38)), ((java.lang.Object[])(spill451_44)));
    java.lang.String[] __stackOp451_189_0 = spill451_35;
    spill451_45 = __stackOp451_189_0;
    spill451_46 = __stackOp451_189_0;
    spill451_47 = __sourceIntrinsic_4adeefca06d1_invokedynamic451_190(11962, (6032448267552770570L ^ life1_3));
    spill451_48 = "Facing: %s (%s) (%.1f / %.1f)";
    java.lang.Object[] __stackOp451_191_0 = new java.lang.Object[4];
    spill451_49 = __stackOp451_191_0;
    (__stackOp451_191_0)[0] = life8_266;
    java.lang.Object[] __stackOp451_192_0 = spill451_49;
    spill451_50 = __stackOp451_192_0;
    (__stackOp451_192_0)[1] = life9_268;
    java.lang.Object[] __stackOp451_193_0 = spill451_50;
    spill451_51 = __stackOp451_193_0;
    (__stackOp451_193_0)[2] = java.lang.Float.valueOf(((float)(moom.Dr.e(((float)(((net.minecraft.entity.Entity)(life7_263)).w))))));
    java.lang.Object[] __stackOp451_197_0 = spill451_51;
    spill451_52 = __stackOp451_197_0;
    (__stackOp451_197_0)[3] = java.lang.Float.valueOf(((float)(moom.Dr.e(((float)(((net.minecraft.entity.Entity)(life7_263)).x))))));
    (spill451_46)[spill451_47] = java.lang.String.format(((java.lang.String)(spill451_48)), ((java.lang.Object[])(spill451_52)));
    life10_521 = com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(spill451_45)));
    if (!((((net.minecraft.client.Minecraft)(this.f)).I != null))) {
        break forward_join_611;
    }
    if (!(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.f)).I)).c__Boolean(((moom.DT)(life3_20))))) {
        break forward_join_611;
    }
    life11_540 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.f)).I)).a__Fk(((moom.DT)(life3_20)));
    ((java.util.List)(life10_521)).add(((java.lang.Object)(__sourceIntrinsic_4adeefca06d1_invokedynamic451_216(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.chunk.Chunk)(life11_540)).a(((moom.DT)(life3_20)), ((net.minecraft.world.biome.WorldChunkManager)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.f)).I)).a__Ff()))))).aj))));
    ((java.util.List)(life10_521)).add(((java.lang.Object)(__sourceIntrinsic_4adeefca06d1_invokedynamic451_223(((net.minecraft.world.chunk.Chunk)(life11_540)).a(((moom.DT)(life3_20)), ((int)(0))), ((net.minecraft.world.chunk.Chunk)(life11_540)).a(((net.minecraft.world.EnumSkyBlock)(net.minecraft.world.EnumSkyBlock.SKY)), ((moom.DT)(life3_20))), ((net.minecraft.world.chunk.Chunk)(life11_540)).a(((net.minecraft.world.EnumSkyBlock)(net.minecraft.world.EnumSkyBlock.BLOCK)), ((moom.DT)(life3_20)))))));
    life12_574 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.f)).I)).a__Eh(((moom.DT)(life3_20)));
    if (!(((net.minecraft.client.Minecraft)(this.f)).j__Boolean())) {
        break forward_join_584;
    }
    if (!((((net.minecraft.client.Minecraft)(this.f)).a__Bm() != null))) {
        break forward_join_584;
    }
    life13_595 = ((net.minecraft.server.management.ServerConfigurationManager)(((net.minecraft.server.integrated.IntegratedServer)(((net.minecraft.client.Minecraft)(this.f)).a__Bm())).a__BA())).a(((java.util.UUID)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.f)).K)).a__UUID())));
    if (!((life13_595 != null))) {
        break forward_join_584;
    }
    life14_608 = ((net.minecraft.server.integrated.IntegratedServer)(((net.minecraft.client.Minecraft)(this.f)).a__Bm())).a(((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayerMP)(life13_595)).i)), ((moom.DT)(new moom.DT(life13_595))));
    if (!((life14_608 != null))) {
        break forward_join_584;
    }
    life12_574 = life14_608;
    }
    spill451_53 = life10_521;
    spill451_54 = "Local Difficulty: %.2f (Day %d)";
    java.lang.Object[] __stackOp451_243_0 = new java.lang.Object[2];
    spill451_55 = __stackOp451_243_0;
    (__stackOp451_243_0)[0] = java.lang.Float.valueOf(((float)(((moom.Eh)(life12_574)).a())));
    java.lang.Object[] __stackOp451_246_0 = spill451_55;
    spill451_56 = __stackOp451_246_0;
    (__stackOp451_246_0)[1] = java.lang.Long.valueOf(((long)((((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.f)).I)).c__Long() / __sourceIntrinsic_4adeefca06d1_invokedynamic451_250(4373, (5248078450317644091L ^ life1_3))))));
    ((java.util.List)(spill451_53)).add(((java.lang.Object)(java.lang.String.format(((java.lang.String)(spill451_54)), ((java.lang.Object[])(spill451_56))))));
    }
    if (!((((net.minecraft.client.Minecraft)(this.f)).R != null))) {
        break forward_join_629;
    }
    if (!(((net.minecraft.client.renderer.EntityRenderer)(((net.minecraft.client.Minecraft)(this.f)).R)).a__Boolean())) {
        break forward_join_629;
    }
    ((java.util.List)(life10_521)).add(((java.lang.Object)(__sourceIntrinsic_4adeefca06d1_invokedynamic451_263(((net.minecraft.client.shader.ShaderGroup)(((net.minecraft.client.renderer.EntityRenderer)(((net.minecraft.client.Minecraft)(this.f)).R)).a__pC())).a()))));
    }
    if (!((((net.minecraft.client.Minecraft)(this.f)).V != null))) {
        break forward_join_674;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(this.f)).V)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK))) {
        break forward_join_674;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(this.f)).V)).a() != null))) {
        break forward_join_674;
    }
    life11_689 = ((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(this.f)).V)).a();
    spill451_57 = life10_521;
    spill451_58 = "Looking at: %d %d %d";
    java.lang.Object[] __stackOp451_277_0 = new java.lang.Object[3];
    spill451_59 = __stackOp451_277_0;
    (__stackOp451_277_0)[0] = java.lang.Integer.valueOf(((int)(((moom.DT)(life11_689)).a())));
    java.lang.Object[] __stackOp451_280_0 = spill451_59;
    spill451_60 = __stackOp451_280_0;
    (__stackOp451_280_0)[1] = java.lang.Integer.valueOf(((int)(((moom.DT)(life11_689)).b())));
    java.lang.Object[] __stackOp451_283_0 = spill451_60;
    spill451_61 = __stackOp451_283_0;
    (__stackOp451_283_0)[2] = java.lang.Integer.valueOf(((int)(((moom.DT)(life11_689)).c())));
    ((java.util.List)(spill451_57)).add(((java.lang.Object)(java.lang.String.format(((java.lang.String)(spill451_58)), ((java.lang.Object[])(spill451_61))))));
    }
    return life10_521;
}


private static long a(long p0) {
long local2 = (net.minecraft.client.gui.GuiOverlayDebug.m ^ 14097915141119L);
    return ((p0 / __sourceIntrinsic_831055b54746_originalDynamicSite1788_1(9118, (9115443052164900688L ^ local2))) / __sourceIntrinsic_831055b54746_originalDynamicSite1788_2(14247, (2654924487868937066L ^ local2)));
}


protected void a__Void() {
long life1_3;
    java.util.List life3_6;
    int life4_33;
    java.lang.String life5_42;
    int life6_49;
    int life7_54;
    int life8_56;
    int life9_62;
    lexical_join_95: {
    lexical_join_29: {
    lexical_join_14: {
    life1_3 = (net.minecraft.client.gui.GuiOverlayDebug.m ^ 17445693602260L);
    life3_6 = this.i;
    if (!((life3_6 != null))) {
        break lexical_join_14;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(java.lang.System.currentTimeMillis())), ((long)(this.k))) > 0))) {
        break lexical_join_29;
    }
    }
    life3_6 = ((net.minecraft.client.gui.GuiOverlayDebug)(this)).a();
    this.i = ((java.util.List)(life3_6));
    this.k = ((long)((java.lang.System.currentTimeMillis() + __sourceIntrinsic_b82a5b29b709_invokedynamic1483_8(7140, (3741952865404075267L ^ life1_3)))));
    }
    life4_33 = 0;
    lexical_cycle_31: while (true) {
    lexical_join_93: {
    if (!((life4_33 < ((java.util.List)(life3_6)).size()))) {
        break lexical_join_95;
    }
    life5_42 = ((java.lang.String)(((java.util.List)(life3_6)).get(((int)(life4_33)))));
    if (!((!com.google.common.base.Strings.isNullOrEmpty(((java.lang.String)(life5_42)))))) {
        break lexical_join_93;
    }
    life6_49 = ((net.minecraft.client.gui.FontRenderer)(this.g)).c;
    life7_54 = ((net.minecraft.client.gui.FontRenderer)(this.g)).a(((java.lang.String)(life5_42)));
    life8_56 = 2;
    life9_62 = (2 + (life6_49 * life4_33));
    __sourceExactCall_16cb8f4aa874be(((int)(1)), ((int)((life9_62 - 1))), ((int)(((2 + life7_54) + 1))), ((int)(((life9_62 + life6_49) - 1))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic1483_18(14528, (4871852701960256179L ^ life1_3)))));
    ((net.minecraft.client.gui.FontRenderer)(this.g)).b(((java.lang.String)(life5_42)), ((float)(0x1.0p1f)), ((float)(((float) life9_62))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic1483_21(30399, (5840198628161058046L ^ life1_3)))));
    }
    life4_33 += 1;
    continue lexical_cycle_31;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4adeefca06d1_invokedynamic451_20(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4adeefca06d1_invokedynamic451_55(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4adeefca06d1_invokedynamic451_74(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_102(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4adeefca06d1_invokedynamic451_107(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4adeefca06d1_invokedynamic451_126(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4adeefca06d1_invokedynamic451_190(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4adeefca06d1_invokedynamic451_216(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4adeefca06d1_invokedynamic451_223(int a0, int a1, int a2) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_4adeefca06d1_invokedynamic451_250(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4adeefca06d1_invokedynamic451_263(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ec54f765870_originalDynamicSite1787_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf1f811575b2_invokedynamic10318_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf1f811575b2_invokedynamic10318_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf1f811575b2_invokedynamic10318_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf1f811575b2_invokedynamic10318_5(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_831055b54746_originalDynamicSite1788_1(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_831055b54746_originalDynamicSite1788_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10316_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1483_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1483_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1483_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ddb9ed984821_invokedynamic1484_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ddb9ed984821_invokedynamic1484_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ddb9ed984821_invokedynamic1484_15(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_ddb9ed984821_invokedynamic1484_20(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_ddb9ed984821_invokedynamic1484_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ddb9ed984821_invokedynamic1484_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ddb9ed984821_invokedynamic1484_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ddb9ed984821_invokedynamic1484_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ddb9ed984821_invokedynamic1484_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ddb9ed984821_invokedynamic1484_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ddb9ed984821_invokedynamic1484_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddb9ed984821_invokedynamic1484_68(long a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddb9ed984821_invokedynamic1484_71(long a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddb9ed984821_invokedynamic1484_115(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddb9ed984821_invokedynamic1484_119(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddb9ed984821_invokedynamic1484_123(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a59fcae0fae5_invokedynamic1485_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a59fcae0fae5_invokedynamic1485_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a59fcae0fae5_invokedynamic1485_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic8593_81(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral10314_0() throws E;

private static native void __sourceExactCall_16cb8f4aa874be(int p0, int p1, int p2, int p3, int p4);
private static native long __sourceExactCall_301920c7a6f5f1(long p0);

private static native long __sourceExactCall_e2d8cb66b32a88();
private static native moom.DT __sourceExactCall_49318c7079e312(net.minecraft.util.MovingObjectPosition p0);
private static native net.minecraft.block.state.IBlockState __sourceExactCall_4e3042eb3e6c68(net.minecraft.block.Block p0, net.minecraft.block.state.IBlockState p1, net.minecraft.world.IBlockAccess p2, moom.DT p3);
private static native com.google.common.collect.ImmutableMap __sourceExactCall_4da07a95bf9046(net.minecraft.block.state.IBlockState p0);
}
