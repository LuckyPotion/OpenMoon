package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiIngame extends net.minecraft.client.gui.Gui {

private static final moom.DD f;

private static final moom.DD g;

private static final moom.DD h;

private final java.util.Random i;

private final net.minecraft.client.Minecraft j;

private final net.minecraft.client.renderer.entity.RenderItem k;

private final moom.gB l;

private final net.minecraft.client.gui.GuiOverlayDebug m;

private final moom.hI n;

private final moom.gD o;

public float p;

private int q;

private java.lang.String r;

private int s;

private boolean t;

private int u;

private net.minecraft.item.ItemStack v;

private int w;

private java.lang.String x;

private java.lang.String y;

private int z;

private int A;

private int B;

private int C;

private int D;

private long E;

private long F;

private com.moon.module.impl.Camera G;

private com.moon.module.impl.Effects H;

private com.moon.module.impl.CustomMinecraft I;

private static final long J;

private static final long[] K;

private static final java.lang.Integer[] L;

private static final java.util.Map M;

private static final long[] N;

private static final java.lang.Long[] O;

private static final java.util.Map P;

public GuiIngame(net.minecraft.client.Minecraft p0) {
super();
    this.i = new java.util.Random();
    this.p = 0x1.0000000000000p+0f;
    this.r = "";
    this.x = "";
    this.y = "";
    this.C = 0;
    this.D = 0;
    this.E = 0L;
    this.F = 0L;
    this.j = p0;
    this.k = (p0).a__nv();
    this.m = new net.minecraft.client.gui.GuiOverlayDebug(p0);
    this.n = new moom.hI(p0);
    this.l = new moom.gB(p0);
    this.o = new moom.gD(p0, this);
    (this).a__Void();
}


static {
J = ((long)(((moom._a)(moom._c.a(((long)(-8797952670606489803L)), ((long)(1272701140401123664L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(132884260650303L)))));

    M = ((java.util.Map)(new java.util.HashMap(13)));

    long local11_life7 = (net.minecraft.client.gui.GuiIngame.J ^ 68265428402632L);

    javax.crypto.Cipher local13_life9;

    javax.crypto.Cipher __sourceSpill1314_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill1314_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill1314_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill1314_14 = new byte[8];

    (__sourceSpill1314_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));

    int local14_life15 = 1;

    while ((local14_life15 < 8)) {

        (__sourceSpill1314_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));

        local14_life15 += 1;

    }

    byte[] __sourcePreallocation1314_16 = __sourceSpill1314_14;

    ((javax.crypto.Cipher)(__sourceSpill1314_11)).init(((int)(__sourceSpill1314_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1314_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1314_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local19_life19 = new long[85];

    int local16_life20 = 0;

    java.lang.String local17_life21;

    int local18_life23 = ((java.lang.String)((local17_life21 = "\020îW÷rò;M}OÑÌþ½\027´`¹¬v5^\027â¯HN<u\t÷p­B[ùçCø\002\\µÑqm4^\026ç3'\017GæcyÍ\034z1Ëß_½¤ãU\t;ä8 Úl¸8À\037ÅuJÅÔ¨\000.4\022^Fn?Q\022ÌYé>#CHÎÖÑÒû#ÑKÜÏy ó¢4PÖ¼\001á\016é¦\020@zVs¹ÔÐ¦Ùæ³\n;!Ch~gßöZ_ðßapGÖ\004¶°Rg\bCåSwü\006C@½\031H\023\016Àµæó\030Ö§rÏ#\004Ý¿F2\004z¦³XD»¢\031}ÿÃÓÉWe\007QÔh\006eK\004{2¯ï\006x´¡xmt\fÝYý«ä,*\021£ùV2y\006Ógs*\017R¹ú9\007\177ÎÍ¯cÔcè¤ã\003\030àÆbÈöy¸l Â\025¨oÍß¼\020\035ðÙ\031tY^ÓKnÙÔ2\0005\\ysPZZ³QÔà\006J~Þf¤Ó\034[ Ð«6ÖÜDAÈá2|¸I[\021Û5\025;Ù7uEId\031\017º±x¶ÖürjÎP³ZVÌ¿a=iº\177N\fw1×\\C¤U\017{c³\034u=póìPì1\004è\021RíêÒ^\022*}IH86h\\Y\\-¾n«qªz~\177\r\\RôÑ\b\004C\023ðeû\177»nÅ~>\016:ð+{b=5ò)b\031¢XôCùÆ\037U:\006ç<ëmâi±¬¾NkAnK\177·ÞP¹@Lbû>.ý/\\´ýúÇá0t\f»¹ð\0135#qÆ{&Á²ôP\005Ð^a\\é\025\004\r\026èW|^×*öR¶ÍãáÀÕÕ]¨éÊ®æè8\032äÇÜ½ÌòÈ\001Þ\001@eup¨gê\177_2¨Sb\\?:÷Ä¥\023¶­Ñ5x¿\032l&\0004lx*dÿ\0220¸\026¿\002-ÎÃíóu\026÷Ëq5s®Ë"))).length();

    int local15_life24 = 0;

    do {

        java.lang.String __sourceSpill1314_25 = local17_life21;

        int __sourceSpill1314_26 = local15_life24;

        local15_life24 += 8;

        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1314_25)).substring(((int)(__sourceSpill1314_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill1314_30 = local19_life19;

        int __sourceSpill1314_31 = local16_life20;

        local16_life20 += 1;

        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));

        byte[] __sourceSpill1314_33 = new byte[8];

        (__sourceSpill1314_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));

        (__sourceSpill1314_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));

        (__sourceSpill1314_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));

        (__sourceSpill1314_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));

        (__sourceSpill1314_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));

        (__sourceSpill1314_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));

        (__sourceSpill1314_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));

        (__sourceSpill1314_33)[7] = ((byte) ((int) local21_life32));

        javax.crypto.Cipher __sourceSpill1314_34 = local13_life9;

        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill1314_34)).doFinal(((byte[])(__sourceSpill1314_33)));

        (__sourceSpill1314_30)[__sourceSpill1314_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));

    } while ((!(local15_life24 >= local18_life23)));

    local18_life23 = ((java.lang.String)((local17_life21 = "?\002\016ÉQ×8FZk\013;f1"))).length();

    local15_life24 = 0;

    do {

        java.lang.String __sourceSpill1314_38 = local17_life21;

        int __sourceSpill1314_39 = local15_life24;

        local15_life24 += 8;

        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1314_38)).substring(((int)(__sourceSpill1314_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill1314_43 = local19_life19;

        int __sourceSpill1314_44 = local16_life20;

        local16_life20 += 1;

        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));

        byte[] __sourceSpill1314_46 = new byte[8];

        (__sourceSpill1314_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));

        (__sourceSpill1314_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));

        (__sourceSpill1314_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));

        (__sourceSpill1314_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));

        (__sourceSpill1314_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));

        (__sourceSpill1314_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));

        (__sourceSpill1314_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));

        (__sourceSpill1314_46)[7] = ((byte) ((int) local21_life45));

        javax.crypto.Cipher __sourceSpill1314_47 = local13_life9;

        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill1314_47)).doFinal(((byte[])(__sourceSpill1314_46)));

        (__sourceSpill1314_43)[__sourceSpill1314_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));

    } while ((!(local15_life24 >= local18_life23)));

    K = ((long[])(local19_life19));

    L = ((java.lang.Integer[])(new java.lang.Integer[85]));

    P = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life54;

    javax.crypto.Cipher __sourceSpill1314_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill1314_57 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill1314_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill1314_59 = new byte[8];

    (__sourceSpill1314_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));

    int local1_life60 = 1;

    while ((local1_life60 < 8)) {

        (__sourceSpill1314_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));

        local1_life60 += 1;

    }

    byte[] __sourcePreallocation1314_61 = __sourceSpill1314_59;

    ((javax.crypto.Cipher)(__sourceSpill1314_56)).init(((int)(__sourceSpill1314_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1314_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1314_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local6_life64 = new long[6];

    int local3_life65 = 0;

    java.lang.String local4_life66;

    int local5_life68 = ((java.lang.String)((local4_life66 = "\035\023Þ\024´Ï5ñ©ÊÚr=Ê¨ÀOÜN<@Ý:\033<\\"))).length();

    int local2_life69 = 0;

    do {

        java.lang.String __sourceSpill1314_70 = local4_life66;

        int __sourceSpill1314_71 = local2_life69;

        local2_life69 += 8;

        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1314_70)).substring(((int)(__sourceSpill1314_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill1314_75 = local6_life64;

        int __sourceSpill1314_76 = local3_life65;

        local3_life65 += 1;

        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));

        byte[] __sourceSpill1314_78 = new byte[8];

        (__sourceSpill1314_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));

        (__sourceSpill1314_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));

        (__sourceSpill1314_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));

        (__sourceSpill1314_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));

        (__sourceSpill1314_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));

        (__sourceSpill1314_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));

        (__sourceSpill1314_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));

        (__sourceSpill1314_78)[7] = ((byte) ((int) local8_life77));

        javax.crypto.Cipher __sourceSpill1314_79 = local0_life54;

        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1314_79)).doFinal(((byte[])(__sourceSpill1314_78)));

        (__sourceSpill1314_75)[__sourceSpill1314_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));

    } while ((!(local2_life69 >= local5_life68)));

    local5_life68 = ((java.lang.String)((local4_life66 = "xIÜÇ\rï{Æ\037^£<ôFå"))).length();

    local2_life69 = 0;

    do {

        java.lang.String __sourceSpill1314_83 = local4_life66;

        int __sourceSpill1314_84 = local2_life69;

        local2_life69 += 8;

        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill1314_83)).substring(((int)(__sourceSpill1314_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill1314_88 = local6_life64;

        int __sourceSpill1314_89 = local3_life65;

        local3_life65 += 1;

        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));

        byte[] __sourceSpill1314_91 = new byte[8];

        (__sourceSpill1314_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));

        (__sourceSpill1314_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));

        (__sourceSpill1314_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));

        (__sourceSpill1314_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));

        (__sourceSpill1314_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));

        (__sourceSpill1314_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));

        (__sourceSpill1314_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));

        (__sourceSpill1314_91)[7] = ((byte) ((int) local8_life90));

        javax.crypto.Cipher __sourceSpill1314_92 = local0_life54;

        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill1314_92)).doFinal(((byte[])(__sourceSpill1314_91)));

        (__sourceSpill1314_88)[__sourceSpill1314_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));

    } while ((!(local2_life69 >= local5_life68)));

    N = ((long[])(local6_life64));

    O = ((java.lang.Long[])(new java.lang.Long[6]));

    f = ((moom.DD)(new moom.DD("textures/misc/vignette.png")));

    g = ((moom.DD)(new moom.DD("textures/gui/widgets.png")));

    h = ((moom.DD)(new moom.DD("textures/misc/pumpkinblur.png")));
}


public void b(moom.ir p0, int p1) {
long life3_3;
    int life5_18;
    int life6_26;
    int life7_37;
    int life8_48;
    int life6_97;
    java.lang.String life7_108;
    int life8_118;
    int life9_129;
    int life10_131;
    life3_3 = (net.minecraft.client.gui.GuiIngame.J ^ 83366487352949L);
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).a__Void(((java.lang.String)("expBar")));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.j)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.Gui.c)));
    life5_18 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).q__sourceReturn_8abf5c6871();
    if ((life5_18 > 0)) {
        life6_26 = __sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_11(13148, (8624424383505733684L ^ life3_3));
        life7_37 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).b4 * ((float) (life6_26 + 1))));
        life8_48 = ((((moom.ir)(p0)).b__Int() - __sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_16(18376, (4792964604192189674L ^ life3_3))) + 3);
        ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(p1)), ((int)(life8_48)), ((int)(0)), ((int)(__sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_17(30268, (8909198281145179397L ^ life3_3)))), ((int)(life6_26)), ((int)(5)));
        if ((life7_37 > 0)) {
        ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(p1)), ((int)(life8_48)), ((int)(0)), ((int)(__sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_19(25356, (3598868512658147454L ^ life3_3)))), ((int)(life7_37)), ((int)(5)));
    }
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b();
    if ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).b2 > 0)) {
        ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).a__Void(((java.lang.String)("expLevel")));
        life6_97 = __sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_30(14472, (4829763273052197850L ^ life3_3));
        if (moom.BU.ag()) {
        life6_97 = moom.Jl.b(((int)(life6_97)));
    }
        life7_108 = __sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_36(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).b2);
        life8_118 = ((((moom.ir)(p0)).a__Int() - ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(life7_108)))) / 2);
        life9_129 = ((((moom.ir)(p0)).b__Int() - __sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_41(16153, (487030327314814000L ^ life3_3))) - 4);
        life10_131 = 0;
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).b(((java.lang.String)(life7_108)), ((float)(((float) (life8_118 + 1)))), ((float)(((float) life9_129))), ((int)(0)));
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).b(((java.lang.String)(life7_108)), ((float)(((float) (life8_118 - 1)))), ((float)(((float) life9_129))), ((int)(0)));
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).b(((java.lang.String)(life7_108)), ((float)(((float) life8_118))), ((float)(((float) (life9_129 + 1)))), ((int)(0)));
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).b(((java.lang.String)(life7_108)), ((float)(((float) life8_118))), ((float)(((float) (life9_129 - 1)))), ((int)(0)));
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).b(((java.lang.String)(life7_108)), ((float)(((float) life8_118))), ((float)(((float) life9_129))), ((int)(life6_97)));
        ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b();
    }
    return;
}


public void b(moom.ir p0) {
long local2 = (net.minecraft.client.gui.GuiIngame.J ^ 85830425077752L);
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).a__Void(((java.lang.String)("demo")));
    java.lang.String local4 = "";
    if ((((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.j)).I)).b__Long() >= __sourceIntrinsic_a59fcae0fae5_invokedynamic8451_7(10469, (4837294475507347763L ^ local2)))) {
        local4 = moom.oO.a(((java.lang.String)("demo.demoExpired")), ((java.lang.Object[])(new java.lang.Object[0])));
    } else {
        local4 = moom.oO.a(((java.lang.String)("demo.remainingTime")), ((java.lang.Object[])(new java.lang.Object[] {moom.DK.a(((int)(((int) (__sourceIntrinsic_a59fcae0fae5_invokedynamic8451_9(15416, (9030073680961873388L ^ local2)) - ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.j)).I)).b__Long())))))})));
    }
    int local5 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(local4)));
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(local4)), ((float)(((float) ((((moom.ir)(p0)).a__Int() - local5) - __sourceIntrinsic_a59fcae0fae5_invokedynamic8451_19(11597, (3088411216158689167L ^ local2)))))), ((float)(0x1.4p2f)), ((int)(__sourceIntrinsic_a59fcae0fae5_invokedynamic8451_20(12671, (3230056963935574996L ^ local2)))));
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b();
    return;
}


private void b() {
long life1_3;
    net.minecraft.client.gui.FontRenderer life3_19;
    moom.ir life4_28;
    int life5_31;
    int life6_33;
    int life7_42;
    int life8_53;
    int life9_55;
    java.lang.String life10_98;
    life1_3 = (net.minecraft.client.gui.GuiIngame.J ^ 9720863211347L);
    if ((moom.vJ.c != null)) {
        if ((moom.vJ.b > 0)) {
        moom.vJ.b = ((int)((moom.vJ.b - 1)));
        int spill8373_0 = 13148;
        life3_19 = ((net.minecraft.client.Minecraft)(this.j)).N;
        long spill8373_1 = (8624498072045994258L ^ life1_3);
        life4_28 = new moom.ir(this.j);
        life5_31 = ((moom.ir)(life4_28)).a__Int();
        life6_33 = __sourceIntrinsic_938da207dded_invokedynamic8373_9(spill8373_0, spill8373_1);
        int spill8373_2 = 273;
        life7_42 = ((life5_31 / 2) - (life6_33 / 2));
        long spill8373_3 = (1559365474691216239L ^ life1_3);
        life8_53 = ((int) (moom.vJ.a * ((float) (life6_33 + 1))));
        life9_55 = __sourceIntrinsic_938da207dded_invokedynamic8373_11(spill8373_2, spill8373_3);
        ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life7_42)), ((int)(life9_55)), ((int)(0)), ((int)(__sourceIntrinsic_938da207dded_invokedynamic8373_12(15148, (7010218379199990080L ^ life1_3)))), ((int)(life6_33)), ((int)(5)));
        ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life7_42)), ((int)(life9_55)), ((int)(0)), ((int)(__sourceIntrinsic_938da207dded_invokedynamic8373_14(30942, (8417696574497655517L ^ life1_3)))), ((int)(life6_33)), ((int)(5)));
        if ((life8_53 > 0)) {
        ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life7_42)), ((int)(life9_55)), ((int)(0)), ((int)(__sourceIntrinsic_938da207dded_invokedynamic8373_16(11814, (7946479305897532451L ^ life1_3)))), ((int)(life8_53)), ((int)(5)));
    }
        life10_98 = moom.vJ.c;
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(life10_98)), ((float)(((float) ((life5_31 / 2) - (((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(life10_98))) / 2))))), ((float)(((float) (life9_55 - __sourceIntrinsic_938da207dded_invokedynamic8373_22(11597, (3088479216709066532L ^ life1_3)))))), ((int)(__sourceIntrinsic_938da207dded_invokedynamic8373_23(12671, (3229979686151799679L ^ life1_3)))));
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.j)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.GuiIngame.c)));
    }
    }
    return;
}


private void b(float p0, moom.ir p1) {
long local3 = (net.minecraft.client.gui.GuiIngame.J ^ 34334055492522L);
    if ((p0 < 0x1.0p0f)) {
        p0 = (p0 * p0);
        p0 = (p0 * p0);
        p0 = ((p0 * 0x1.99999ap-1f) + 0x1.99999ap-3f);
    }
    moom.kZ.c__Void();
    int spill8453_0 = 1802;
    moom.kZ.i();
    long spill8453_1 = (6267249037214130687L ^ local3);
    moom.kZ.a(((boolean)(false)));
    moom.kZ.a(((int)(__sourceIntrinsic_4d38a8356407_invokedynamic8453_4(spill8453_0, spill8453_1))), ((int)(__sourceIntrinsic_4d38a8356407_invokedynamic8453_5(18763, (2026823436880769021L ^ local3)))), ((int)(1)), ((int)(0)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(p0)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.j)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
    net.minecraft.client.renderer.texture.TextureAtlasSprite local5 = ((net.minecraft.client.renderer.BlockModelShapes)(((net.minecraft.client.renderer.BlockRendererDispatcher)(((net.minecraft.client.Minecraft)(this.j)).a__kP())).a__kN())).a(((net.minecraft.block.state.IBlockState)(((moom.cr)(net.minecraft.init.Blocks.aY)).a__fE())));
    float local6 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local5)).a();
    float local7 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local5)).c();
    float local8 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local5)).b();
    float local9 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local5)).d();
    net.minecraft.client.renderer.Tessellator local10 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local11 = ((net.minecraft.client.renderer.Tessellator)(local10)).a__lw();
    ((moom.lw)(local11)).a(((int)(__sourceIntrinsic_4d38a8356407_invokedynamic8453_24(1193, (1796158669168681558L ^ local3)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local11)).a(((double)(0x0.0p0d)), ((double)(((double) ((moom.ir)(p1)).b__Int()))), ((double)(-0x1.68p6d))))).a(((double)(((double) local6))), ((double)(((double) local9)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local11)).a(((double)(((double) ((moom.ir)(p1)).a__Int()))), ((double)(((double) ((moom.ir)(p1)).b__Int()))), ((double)(-0x1.68p6d))))).a(((double)(((double) local8))), ((double)(((double) local9)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local11)).a(((double)(((double) ((moom.ir)(p1)).a__Int()))), ((double)(0x0.0p0d)), ((double)(-0x1.68p6d))))).a(((double)(((double) local8))), ((double)(((double) local7)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local11)).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(-0x1.68p6d))))).a(((double)(((double) local6))), ((double)(((double) local7)))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local10)).a__Void();
    moom.kZ.a(((boolean)(true)));
    moom.kZ.j();
    moom.kZ.d__Void();
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


private void c(moom.ir p0) {
int forestValue983_49_0;
    int spill983_0;
    long spill983_1;
    long life2_3;
    net.minecraft.entity.Entity life5_7;
    net.minecraft.entity.player.EntityPlayer life4_13;
    int life5_17;
    int life6_50;
    int life7_123;
    int life8_137;
    net.minecraft.util.FoodStats life9_140;
    int life10_143;
    int life11_146;
    net.minecraft.entity.ai.attributes.IAttributeInstance life12_150;
    int life13_161;
    int life14_172;
    int life15_181;
    float life16_186;
    float life17_192;
    int life18_201;
    int life19_209;
    int life20_223;
    float life21_225;
    int life22_228;
    int life23_230;
    int life24_249;
    int life25_269;
    int life24_381;
    int life25_389;
    int life26_403;
    int life27_417;
    int life28_433;
    int life29_439;
    int life30_456;
    net.minecraft.entity.Entity life24_726;
    int life26_735;
    int life27_744;
    int life28_750;
    int life29_752;
    int life30_808;
    net.minecraft.entity.EntityLivingBase life25_988;
    int life26_999;
    float life27_1002;
    int life28_1009;
    int life29_1024;
    int life30_1026;
    int life31_1036;
    int life32_1042;
    int life33_1051;
    int life34_1053;
    int life35_1073;
    int life25_1192;
    int life26_1202;
    int life27_1212;
    int life28_1214;
    forest_join_1281: {
    forest_join_1277: {
    forest_join_1154: {
    forest_join_1000: {
    forest_join_960: {
    forest_join_959: {
    forest_join_707: {
    forest_join_359: {
    forest_join_238: {
    forest_join_113: {
    forest_join_93: {
    forest_join_72: {
    forest_join_49: {
    forest_join_48: {
    life2_3 = (net.minecraft.client.gui.GuiIngame.J ^ 123510892970688L);
    life5_7 = ((net.minecraft.client.Minecraft)(this.j)).a__r3();
    if (!((((life5_7 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forest_join_1281;
    }
    life4_13 = ((net.minecraft.entity.player.EntityPlayer)(life5_7));
    life5_17 = moom.Dr.b__Int(((float)(((net.minecraft.entity.player.EntityPlayer)(life4_13)).b__sourceReturn_bc607678b6())));
    if (!((recovery.source.CarrierOps.lcmp(((long)(this.F)), ((long)(((long) this.q)))) > 0))) {
        break forest_join_48;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)((((this.F - ((long) this.q)) / __sourceIntrinsic_72315f9b5253_invokedynamic983_12(11228, (3676082533319874357L ^ life2_3))) % __sourceIntrinsic_72315f9b5253_invokedynamic983_13(27553, (586551934099347278L ^ life2_3))))), ((long)(1L))) == 0))) {
        break forest_join_48;
    }
    forestValue983_49_0 = 1;
    break forest_join_49;
    }
    forestValue983_49_0 = 0;
    }
    life6_50 = forestValue983_49_0;
    if (!((life5_17 < this.C))) {
        break forest_join_72;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(life4_13)).U > 0))) {
        break forest_join_72;
    }
    this.E = ((long)(net.minecraft.client.Minecraft.a__Long()));
    this.F = ((long)(((long) (this.q + __sourceIntrinsic_72315f9b5253_invokedynamic983_20(3125, (7937191678485300181L ^ life2_3))))));
    break forest_join_93;
    }
    if (!((life5_17 > this.C))) {
        break forest_join_93;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(life4_13)).U > 0))) {
        break forest_join_93;
    }
    this.E = ((long)(net.minecraft.client.Minecraft.a__Long()));
    this.F = ((long)(((long) (this.q + __sourceIntrinsic_72315f9b5253_invokedynamic983_27(11597, (3088347815645094583L ^ life2_3))))));
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)((net.minecraft.client.Minecraft.a__Long() - this.E))), ((long)(__sourceIntrinsic_72315f9b5253_invokedynamic983_31(30848, (6243828304001156205L ^ life2_3))))) > 0))) {
        break forest_join_113;
    }
    this.C = ((int)(life5_17));
    this.D = ((int)(life5_17));
    this.E = ((long)(net.minecraft.client.Minecraft.a__Long()));
    }
    this.C = ((int)(life5_17));
    life7_123 = this.D;
    ((java.util.Random)(this.i)).setSeed(((long)((((long) this.q) * __sourceIntrinsic_72315f9b5253_invokedynamic983_41(17257, (3570014026084384641L ^ life2_3))))));
    life8_137 = 0;
    life9_140 = ((net.minecraft.entity.player.EntityPlayer)(life4_13)).a__C2();
    life10_143 = ((net.minecraft.util.FoodStats)(life9_140)).a__Int();
    life11_146 = ((net.minecraft.util.FoodStats)(life9_140)).b();
    life12_150 = ((net.minecraft.entity.player.EntityPlayer)(life4_13)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b)));
    life13_161 = ((((moom.ir)(p0)).a__Int() / 2) - __sourceIntrinsic_72315f9b5253_invokedynamic983_49(31248, (6146381996767442413L ^ life2_3)));
    life14_172 = ((((moom.ir)(p0)).a__Int() / 2) + __sourceIntrinsic_72315f9b5253_invokedynamic983_51(31248, (6146381996767442413L ^ life2_3)));
    life15_181 = (((moom.ir)(p0)).b__Int() - __sourceIntrinsic_72315f9b5253_invokedynamic983_53(26721, (3050237415722706816L ^ life2_3)));
    spill983_0 = 11597;
    life16_186 = ((float) ((net.minecraft.entity.ai.attributes.IAttributeInstance)(life12_150)).b());
    spill983_1 = (3088347815645094583L ^ life2_3);
    life17_192 = ((net.minecraft.entity.player.EntityPlayer)(life4_13)).j__sourceReturn_bc607678b6();
    life18_201 = moom.Dr.b__Int(((float)((((life16_186 + life17_192) / 0x1.0p1f) / 0x1.4p3f))));
    life19_209 = java.lang.Math.max(((int)((__sourceIntrinsic_72315f9b5253_invokedynamic983_57(spill983_0, spill983_1) - (life18_201 - 2)))), ((int)(3)));
    life20_223 = ((life15_181 - ((life18_201 - 1) * life19_209)) - __sourceIntrinsic_72315f9b5253_invokedynamic983_59(11597, (3088347815645094583L ^ life2_3)));
    life21_225 = life17_192;
    life22_228 = ((net.minecraft.entity.player.EntityPlayer)(life4_13)).d__Int();
    life23_230 = -1;
    if (!(((net.minecraft.entity.player.EntityPlayer)(life4_13)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.m))))) {
        break forest_join_238;
    }
    life23_230 = (this.q % moom.Dr.b__Int(((float)((life16_186 + 0x1.4p2f)))));
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).a__Void(((java.lang.String)("armor")));
    life24_249 = 0;
    forest_cycle_245: while (true) {
    forest_join_357: {
    forest_join_326: {
    forest_join_295: {
    if (!((life24_249 < __sourceIntrinsic_72315f9b5253_invokedynamic983_68(11597, (3088347815645094583L ^ life2_3))))) {
        break forest_join_359;
    }
    if (!((life22_228 > 0))) {
        break forest_join_357;
    }
    life25_269 = (life13_161 + (life24_249 * __sourceIntrinsic_72315f9b5253_invokedynamic983_69(23144, (470529322304198062L ^ life2_3))));
    if (!((((life24_249 * 2) + 1) < life22_228))) {
        break forest_join_295;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life25_269)), ((int)(life20_223)), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_70(28573, (5071827816836948042L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_71(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_72(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_73(27747, (2988996036696368026L ^ life2_3)))));
    }
    if (!((((life24_249 * 2) + 1) == life22_228))) {
        break forest_join_326;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life25_269)), ((int)(life20_223)), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_75(20930, (571933924631731734L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_76(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_77(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_78(27747, (2988996036696368026L ^ life2_3)))));
    }
    if (!((((life24_249 * 2) + 1) > life22_228))) {
        break forest_join_357;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life25_269)), ((int)(life20_223)), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_80(15334, (386813325432239155L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_81(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_82(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_83(27747, (2988996036696368026L ^ life2_3)))));
    }
    life24_249 += 1;
    continue forest_cycle_245;
    }
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b(((java.lang.String)("health")));
    life24_381 = (moom.Dr.b__Int(((float)(((life16_186 + life17_192) / 0x1.0p1f)))) - 1);
    forest_cycle_373: while (true) {
    forest_join_705: {
    forest_join_701: {
    forest_join_673: {
    forest_join_634: {
    forest_join_598: {
    forest_join_559: {
    forest_join_524: {
    forest_join_453: {
    forest_join_444: {
    forest_join_440: {
    forest_join_398: {
    forest_join_392: {
    forest_join_387: {
    if (!((life24_381 >= 0))) {
        break forest_join_707;
    }
    life25_389 = __sourceIntrinsic_72315f9b5253_invokedynamic983_89(15334, (386813325432239155L ^ life2_3));
    if (!(((net.minecraft.entity.player.EntityPlayer)(life4_13)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.v))))) {
        break forest_join_387;
    }
    life25_389 += 36;
    break forest_join_392;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(life4_13)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.w))))) {
        break forest_join_392;
    }
    life25_389 += 72;
    }
    life26_403 = 0;
    if (!((life6_50 != 0))) {
        break forest_join_398;
    }
    life26_403 = 1;
    }
    life27_417 = (moom.Dr.b__Int(((float)((((float) (life24_381 + 1)) / 0x1.4p3f)))) - 1);
    life28_433 = (life13_161 + ((life24_381 % __sourceIntrinsic_72315f9b5253_invokedynamic983_95(11597, (3088347815645094583L ^ life2_3))) * __sourceIntrinsic_72315f9b5253_invokedynamic983_96(23144, (470529322304198062L ^ life2_3))));
    life29_439 = (life15_181 - (life27_417 * life19_209));
    if (!((life5_17 <= 4))) {
        break forest_join_440;
    }
    life29_439 = (life29_439 + ((java.util.Random)(this.i)).nextInt(((int)(2))));
    }
    if (!((life24_381 == life23_230))) {
        break forest_join_444;
    }
    life29_439 += -2;
    }
    life30_456 = 0;
    if (!(((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(life4_13)).i)).a__IX())).d__Boolean())) {
        break forest_join_453;
    }
    life30_456 = 5;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life28_433)), ((int)(life29_439)), ((int)((__sourceIntrinsic_72315f9b5253_invokedynamic983_102(15334, (386813325432239155L ^ life2_3)) + (life26_403 * __sourceIntrinsic_72315f9b5253_invokedynamic983_103(27747, (2988996036696368026L ^ life2_3)))))), ((int)((__sourceIntrinsic_72315f9b5253_invokedynamic983_104(27747, (2988996036696368026L ^ life2_3)) * life30_456))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_105(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_106(27747, (2988996036696368026L ^ life2_3)))));
    if (!((life6_50 != 0))) {
        break forest_join_559;
    }
    if (!((((life24_381 * 2) + 1) < life7_123))) {
        break forest_join_524;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life28_433)), ((int)(life29_439)), ((int)((life25_389 + __sourceIntrinsic_72315f9b5253_invokedynamic983_108(19730, (8075844790112207584L ^ life2_3))))), ((int)((__sourceIntrinsic_72315f9b5253_invokedynamic983_109(27747, (2988996036696368026L ^ life2_3)) * life30_456))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_110(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_111(27747, (2988996036696368026L ^ life2_3)))));
    }
    if (!((((life24_381 * 2) + 1) == life7_123))) {
        break forest_join_559;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life28_433)), ((int)(life29_439)), ((int)((life25_389 + __sourceIntrinsic_72315f9b5253_invokedynamic983_113(23335, (2310922502209426659L ^ life2_3))))), ((int)((__sourceIntrinsic_72315f9b5253_invokedynamic983_114(27747, (2988996036696368026L ^ life2_3)) * life30_456))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_115(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_116(27747, (2988996036696368026L ^ life2_3)))));
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life21_225)), ((float)(0x0.0p0f))) <= 0))) {
        break forest_join_634;
    }
    if (!((((life24_381 * 2) + 1) < life5_17))) {
        break forest_join_598;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life28_433)), ((int)(life29_439)), ((int)((life25_389 + __sourceIntrinsic_72315f9b5253_invokedynamic983_119(1494, (1728171957559331361L ^ life2_3))))), ((int)((__sourceIntrinsic_72315f9b5253_invokedynamic983_120(27747, (2988996036696368026L ^ life2_3)) * life30_456))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_121(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_122(27747, (2988996036696368026L ^ life2_3)))));
    }
    if (!((((life24_381 * 2) + 1) == life5_17))) {
        break forest_join_705;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life28_433)), ((int)(life29_439)), ((int)((life25_389 + __sourceIntrinsic_72315f9b5253_invokedynamic983_124(5073, (615896674112674907L ^ life2_3))))), ((int)((__sourceIntrinsic_72315f9b5253_invokedynamic983_125(27747, (2988996036696368026L ^ life2_3)) * life30_456))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_126(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_127(27747, (2988996036696368026L ^ life2_3)))));
    break forest_join_705;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life21_225)), ((float)(life17_192))) == 0))) {
        break forest_join_673;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)((life17_192 % 0x1.0p1f))), ((float)(0x1.0p0f))) == 0))) {
        break forest_join_673;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life28_433)), ((int)(life29_439)), ((int)((life25_389 + __sourceIntrinsic_72315f9b5253_invokedynamic983_131(29774, (7428688505011436478L ^ life2_3))))), ((int)((__sourceIntrinsic_72315f9b5253_invokedynamic983_132(27747, (2988996036696368026L ^ life2_3)) * life30_456))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_133(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_134(27747, (2988996036696368026L ^ life2_3)))));
    break forest_join_701;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life28_433)), ((int)(life29_439)), ((int)((life25_389 + __sourceIntrinsic_72315f9b5253_invokedynamic983_136(7931, (6122591042252706048L ^ life2_3))))), ((int)((__sourceIntrinsic_72315f9b5253_invokedynamic983_137(27747, (2988996036696368026L ^ life2_3)) * life30_456))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_138(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_139(27747, (2988996036696368026L ^ life2_3)))));
    }
    life21_225 = (life21_225 - 0x1.0p1f);
    }
    life24_381 += -1;
    continue forest_cycle_373;
    }
    }
    life24_726 = ((net.minecraft.entity.player.EntityPlayer)(life4_13)).g;
    if (!((life24_726 == null))) {
        break forest_join_960;
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b(((java.lang.String)("food")));
    life26_735 = 0;
    forest_cycle_719: while (true) {
    forest_join_957: {
    forest_join_924: {
    forest_join_891: {
    forest_join_858: {
    forest_join_775: {
    forest_join_771: {
    forest_join_747: {
    if (!((life26_735 < __sourceIntrinsic_72315f9b5253_invokedynamic983_145(11597, (3088347815645094583L ^ life2_3))))) {
        break forest_join_959;
    }
    life27_744 = life15_181;
    life28_750 = __sourceIntrinsic_72315f9b5253_invokedynamic983_146(15334, (386813325432239155L ^ life2_3));
    life29_752 = 0;
    if (!(((net.minecraft.entity.player.EntityPlayer)(life4_13)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.t))))) {
        break forest_join_747;
    }
    life28_750 += 36;
    life29_752 = __sourceIntrinsic_72315f9b5253_invokedynamic983_149(30030, (5658892392145418970L ^ life2_3));
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.util.FoodStats)(((net.minecraft.entity.player.EntityPlayer)(life4_13)).a__C2())).a())), ((float)(0x0.0p0f))) <= 0))) {
        break forest_join_771;
    }
    if (!(((this.q % ((life10_143 * 3) + 1)) == 0))) {
        break forest_join_771;
    }
    life27_744 = (life15_181 + (((java.util.Random)(this.i)).nextInt(((int)(3))) - 1));
    }
    if (!((life8_137 != 0))) {
        break forest_join_775;
    }
    life29_752 = 1;
    }
    life30_808 = ((life14_172 - (life26_735 * __sourceIntrinsic_72315f9b5253_invokedynamic983_156(23144, (470529322304198062L ^ life2_3)))) - __sourceIntrinsic_72315f9b5253_invokedynamic983_157(27747, (2988996036696368026L ^ life2_3)));
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life30_808)), ((int)(life27_744)), ((int)((__sourceIntrinsic_72315f9b5253_invokedynamic983_158(15334, (386813325432239155L ^ life2_3)) + (life29_752 * __sourceIntrinsic_72315f9b5253_invokedynamic983_159(27747, (2988996036696368026L ^ life2_3)))))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_160(1834, (1744806695342508232L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_161(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_162(27747, (2988996036696368026L ^ life2_3)))));
    if (!((life8_137 != 0))) {
        break forest_join_891;
    }
    if (!((((life26_735 * 2) + 1) < life11_146))) {
        break forest_join_858;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life30_808)), ((int)(life27_744)), ((int)((life28_750 + __sourceIntrinsic_72315f9b5253_invokedynamic983_164(1226, (8072731768772463361L ^ life2_3))))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_165(20110, (8082224468805992806L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_166(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_167(27747, (2988996036696368026L ^ life2_3)))));
    }
    if (!((((life26_735 * 2) + 1) == life11_146))) {
        break forest_join_891;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life30_808)), ((int)(life27_744)), ((int)((life28_750 + __sourceIntrinsic_72315f9b5253_invokedynamic983_169(7616, (155767033530290769L ^ life2_3))))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_170(20110, (8082224468805992806L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_171(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_172(27747, (2988996036696368026L ^ life2_3)))));
    }
    if (!((((life26_735 * 2) + 1) < life10_143))) {
        break forest_join_924;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life30_808)), ((int)(life27_744)), ((int)((life28_750 + __sourceIntrinsic_72315f9b5253_invokedynamic983_174(27423, (4675842749116310778L ^ life2_3))))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_175(20110, (8082224468805992806L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_176(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_177(27747, (2988996036696368026L ^ life2_3)))));
    }
    if (!((((life26_735 * 2) + 1) == life10_143))) {
        break forest_join_957;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life30_808)), ((int)(life27_744)), ((int)((life28_750 + __sourceIntrinsic_72315f9b5253_invokedynamic983_179(15935, (5727824251325559279L ^ life2_3))))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_180(20110, (8082224468805992806L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_181(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_182(27747, (2988996036696368026L ^ life2_3)))));
    }
    life26_735 += 1;
    continue forest_cycle_719;
    }
    }
    break forest_join_1154;
    }
    if (!((((life24_726 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forest_join_1154;
    }
    life25_988 = ((net.minecraft.entity.EntityLivingBase)(life24_726));
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b(((java.lang.String)("mountHealth")));
    life26_999 = ((int) java.lang.Math.ceil(((double)(((double) ((net.minecraft.entity.EntityLivingBase)(life25_988)).b__sourceReturn_bc607678b6())))));
    life27_1002 = ((net.minecraft.entity.EntityLivingBase)(life25_988)).a();
    life28_1009 = (((int) (life27_1002 + 0x1.0p-1f)) / 2);
    if (!((life28_1009 > __sourceIntrinsic_72315f9b5253_invokedynamic983_192(28399, (8748877169128431997L ^ life2_3))))) {
        break forest_join_1000;
    }
    life28_1009 = __sourceIntrinsic_72315f9b5253_invokedynamic983_193(16881, (8535233305913871912L ^ life2_3));
    }
    life29_1024 = life15_181;
    life30_1026 = 0;
    forest_cycle_1004: while (true) {
    forest_join_1151: {
    if (!((life28_1009 > 0))) {
        break forest_join_1154;
    }
    life31_1036 = java.lang.Math.min(((int)(life28_1009)), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_194(11597, (3088347815645094583L ^ life2_3)))));
    life28_1009 = (life28_1009 - life31_1036);
    life32_1042 = 0;
    forest_cycle_1020: while (true) {
    forest_join_1149: {
    forest_join_1114: {
    forest_join_1035: {
    if (!((life32_1042 < life31_1036))) {
        break forest_join_1151;
    }
    life33_1051 = __sourceIntrinsic_72315f9b5253_invokedynamic983_196(11758, (5113639103480341039L ^ life2_3));
    life34_1053 = 0;
    if (!((life8_137 != 0))) {
        break forest_join_1035;
    }
    life34_1053 = 1;
    }
    life35_1073 = ((life14_172 - (life32_1042 * __sourceIntrinsic_72315f9b5253_invokedynamic983_197(23144, (470529322304198062L ^ life2_3)))) - __sourceIntrinsic_72315f9b5253_invokedynamic983_198(27747, (2988996036696368026L ^ life2_3)));
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life35_1073)), ((int)(life29_1024)), ((int)((life33_1051 + (life34_1053 * __sourceIntrinsic_72315f9b5253_invokedynamic983_199(27747, (2988996036696368026L ^ life2_3)))))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_200(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_201(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_202(27747, (2988996036696368026L ^ life2_3)))));
    if (!(((((life32_1042 * 2) + 1) + life30_1026) < life26_999))) {
        break forest_join_1114;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life35_1073)), ((int)(life29_1024)), ((int)((life33_1051 + __sourceIntrinsic_72315f9b5253_invokedynamic983_204(27423, (4675842749116310778L ^ life2_3))))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_205(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_206(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_207(27747, (2988996036696368026L ^ life2_3)))));
    }
    if (!(((((life32_1042 * 2) + 1) + life30_1026) == life26_999))) {
        break forest_join_1149;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(life35_1073)), ((int)(life29_1024)), ((int)((life33_1051 + __sourceIntrinsic_72315f9b5253_invokedynamic983_209(15935, (5727824251325559279L ^ life2_3))))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_210(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_211(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_212(27747, (2988996036696368026L ^ life2_3)))));
    }
    life32_1042 += 1;
    continue forest_cycle_1020;
    }
    }
    life29_1024 += -10;
    life30_1026 += 20;
    continue forest_cycle_1004;
    }
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b(((java.lang.String)("air")));
    if (!(((net.minecraft.entity.player.EntityPlayer)(life4_13)).a(((moom.fn)(moom.fn.h))))) {
        break forest_join_1277;
    }
    life25_1192 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).h();
    life26_1202 = moom.Dr.d(((double)(((((double) (life25_1192 - 2)) * 0x1.4p3d) / 0x1.2cp8d))));
    life27_1212 = (moom.Dr.d(((double)(((((double) life25_1192) * 0x1.4p3d) / 0x1.2cp8d)))) - life26_1202);
    life28_1214 = 0;
    forest_cycle_1190: while (true) {
    forest_join_1275: {
    forest_join_1237: {
    if (!((life28_1214 < (life26_1202 + life27_1212)))) {
        break forest_join_1277;
    }
    if (!((life28_1214 < life26_1202))) {
        break forest_join_1237;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(((life14_172 - (life28_1214 * __sourceIntrinsic_72315f9b5253_invokedynamic983_224(23144, (470529322304198062L ^ life2_3)))) - __sourceIntrinsic_72315f9b5253_invokedynamic983_225(27747, (2988996036696368026L ^ life2_3))))), ((int)(life20_223)), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_226(15334, (386813325432239155L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_227(15664, (4499733612046824107L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_228(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_229(27747, (2988996036696368026L ^ life2_3)))));
    break forest_join_1275;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(((life14_172 - (life28_1214 * __sourceIntrinsic_72315f9b5253_invokedynamic983_231(23144, (470529322304198062L ^ life2_3)))) - __sourceIntrinsic_72315f9b5253_invokedynamic983_232(27747, (2988996036696368026L ^ life2_3))))), ((int)(life20_223)), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_233(5943, (4178374288177797339L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_234(16690, (983399306743336667L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_235(27747, (2988996036696368026L ^ life2_3)))), ((int)(__sourceIntrinsic_72315f9b5253_invokedynamic983_236(27747, (2988996036696368026L ^ life2_3)))));
    }
    life28_1214 += 1;
    continue forest_cycle_1190;
    }
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b();
    }
    return;
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.client.gui.GuiIngame.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23620);
    if (((net.minecraft.client.gui.GuiIngame.O)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.client.gui.GuiIngame.N)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.client.gui.GuiIngame.P)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.client.gui.GuiIngame.P)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/gz", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.client.gui.GuiIngame.O)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.client.gui.GuiIngame.O)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral10260_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void c() {
long life1_3;
    net.minecraft.item.ItemStack life3_55;
    forward_join_96: {
    forward_join_93: {
    forward_join_86: {
    forward_join_76: {
    forward_join_53: {
    forward_join_31: {
    forward_join_13: {
    life1_3 = (net.minecraft.client.gui.GuiIngame.J ^ 125207977214174L);
    if (!((this.s > 0))) { break forward_join_13; }
    net.minecraft.client.gui.GuiIngame __stackOp4788_2_0 = this;
    ((net.minecraft.client.gui.GuiIngame)(__stackOp4788_2_0)).s = ((int)((((net.minecraft.client.gui.GuiIngame)(__stackOp4788_2_0)).s - 1)));
    }
    if (!((this.w > 0))) { break forward_join_31; }
    net.minecraft.client.gui.GuiIngame __stackOp4788_6_0 = this;
    ((net.minecraft.client.gui.GuiIngame)(__stackOp4788_6_0)).w = ((int)((((net.minecraft.client.gui.GuiIngame)(__stackOp4788_6_0)).w - 1)));
    if (!((this.w <= 0))) { break forward_join_31; }
    this.x = ((java.lang.String)(""));
    this.y = ((java.lang.String)(""));
    }
    net.minecraft.client.gui.GuiIngame __stackOp4788_12_0 = this;
    ((net.minecraft.client.gui.GuiIngame)(__stackOp4788_12_0)).q = ((int)((((net.minecraft.client.gui.GuiIngame)(__stackOp4788_12_0)).q + 1)));
    if (!((((net.minecraft.client.Minecraft)(this.j)).K != null))) { break forward_join_96; }
    life3_55 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).bD)).a__xW();
    if (!((life3_55 == null))) { break forward_join_53; }
    this.u = ((int)(0));
    break forward_join_93;
    }
    if (!((this.v != null))) { break forward_join_86; }
    if (!((((net.minecraft.item.ItemStack)(life3_55)).a__wQ() == ((net.minecraft.item.ItemStack)(this.v)).a__wQ()))) { break forward_join_86; }
    if (!(net.minecraft.item.ItemStack.a(((net.minecraft.item.ItemStack)(life3_55)), ((net.minecraft.item.ItemStack)(this.v))))) { break forward_join_86; }
    if (!((!((net.minecraft.item.ItemStack)(life3_55)).b__Boolean()))) { break forward_join_76; }
    if (!((((net.minecraft.item.ItemStack)(life3_55)).c() == ((net.minecraft.item.ItemStack)(this.v)).c()))) { break forward_join_86; }
    }
    if (!((this.u > 0))) { break forward_join_93; }
    net.minecraft.client.gui.GuiIngame __stackOp4788_33_0 = this;
    ((net.minecraft.client.gui.GuiIngame)(__stackOp4788_33_0)).u = ((int)((((net.minecraft.client.gui.GuiIngame)(__stackOp4788_33_0)).u - 1)));
    break forward_join_93;
    }
    this.u = ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4788_36(114, (3287207344375827895L ^ life1_3))));
    }
    this.v = ((net.minecraft.item.ItemStack)(life3_55));
    }
    return;
}


public void d() {
((moom.gD)(this.o)).a();
    return;
}


private void d(moom.ir p0) {
long local2 = (net.minecraft.client.gui.GuiIngame.J ^ 52645760809319L);
    moom.kZ.i();
    moom.kZ.a(((boolean)(false)));
    moom.kZ.a(((int)(__sourceIntrinsic_de35682d228a_originalDynamicSite1777_3(1802, (6267195459693966130L ^ local2)))), ((int)(__sourceIntrinsic_de35682d228a_originalDynamicSite1777_4(18763, (2026771525986139440L ^ local2)))), ((int)(1)), ((int)(0)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.c__Void();
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.j)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.GuiIngame.h)));
    net.minecraft.client.renderer.Tessellator local4 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local5 = ((net.minecraft.client.renderer.Tessellator)(local4)).a__lw();
    ((moom.lw)(local5)).a(((int)(__sourceIntrinsic_de35682d228a_originalDynamicSite1777_14(12694, (2120358664069563866L ^ local2)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local5)).a(((double)(0x0.0p0d)), ((double)(((double) ((moom.ir)(p0)).b__Int()))), ((double)(-0x1.68p6d))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local5)).a(((double)(((double) ((moom.ir)(p0)).a__Int()))), ((double)(((double) ((moom.ir)(p0)).b__Int()))), ((double)(-0x1.68p6d))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local5)).a(((double)(((double) ((moom.ir)(p0)).a__Int()))), ((double)(0x0.0p0d)), ((double)(-0x1.68p6d))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local5)).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(-0x1.68p6d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local4)).a__Void();
    moom.kZ.a(((boolean)(true)));
    moom.kZ.j();
    moom.kZ.d__Void();
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(moom.ir p0, float p1) {
long life3_3;
    net.minecraft.entity.Entity life6_7;
    net.minecraft.entity.player.EntityPlayer life5_13;
    com.moon.ea life6_22;
    int life7_39;
    float life8_42;
    int life7_142;
    int life8_170;
    int life9_181;
    life3_3 = (net.minecraft.client.gui.GuiIngame.J ^ 15330282488928L);
    life6_7 = ((net.minecraft.client.Minecraft)(this.j)).a__r3();
    if ((((life6_7 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0)) {
        life5_13 = ((net.minecraft.entity.player.EntityPlayer)(life6_7));
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        life6_22 = new com.moon.ea();
        ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life6_22)));
        if ((!((com.moon.ea)(life6_22)).isCancelled())) {
        ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.j)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.GuiIngame.g)));
        life7_39 = (((moom.ir)(p0)).a__Int() / 2);
        life8_42 = ((net.minecraft.client.gui.GuiIngame)(this)).d;
        ((net.minecraft.client.gui.GuiIngame)(this)).d = ((float)(-0x1.68p6f));
        ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)((life7_39 - __sourceIntrinsic_eee30c91936c_invokedynamic8377_17(5707, (6002967881482247972L ^ life3_3))))), ((int)((((moom.ir)(p0)).b__Int() - __sourceIntrinsic_eee30c91936c_invokedynamic8377_19(3748, (288191702380349402L ^ life3_3))))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_eee30c91936c_invokedynamic8377_20(13148, (8624492703142656545L ^ life3_3)))), ((int)(__sourceIntrinsic_eee30c91936c_invokedynamic8377_21(14136, (7577245349743738482L ^ life3_3)))));
        ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)((((life7_39 - __sourceIntrinsic_eee30c91936c_invokedynamic8377_23(31248, (6146332088149865293L ^ life3_3))) - 1) + (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(life5_13)).bD)).c * __sourceIntrinsic_eee30c91936c_invokedynamic8377_26(3125, (7937291303444907381L ^ life3_3)))))), ((int)(((((moom.ir)(p0)).b__Int() - __sourceIntrinsic_eee30c91936c_invokedynamic8377_28(14136, (7577245349743738482L ^ life3_3))) - 1))), ((int)(0)), ((int)(__sourceIntrinsic_eee30c91936c_invokedynamic8377_29(14136, (7577245349743738482L ^ life3_3)))), ((int)(__sourceIntrinsic_eee30c91936c_invokedynamic8377_30(27458, (514440447453356664L ^ life3_3)))), ((int)(__sourceIntrinsic_eee30c91936c_invokedynamic8377_31(14136, (7577245349743738482L ^ life3_3)))));
        ((net.minecraft.client.gui.GuiIngame)(this)).d = ((float)(life8_42));
    }
        moom.kZ.y();
        int spill8377_0 = 1802;
        moom.kZ.l();
        moom.kZ.a(((int)(__sourceIntrinsic_eee30c91936c_invokedynamic8377_36(spill8377_0, (6267232771520466485L ^ life3_3)))), ((int)(__sourceIntrinsic_eee30c91936c_invokedynamic8377_37(18763, (2026808837596659767L ^ life3_3)))), ((int)(1)), ((int)(0)));
        moom.lt.c();
        life7_142 = 0;
        while ((life7_142 < __sourceIntrinsic_eee30c91936c_invokedynamic8377_40(18670, (1278710131154239896L ^ life3_3)))) {
        life8_170 = ((((((moom.ir)(p0)).a__Int() / 2) - __sourceIntrinsic_eee30c91936c_invokedynamic8377_42(5279, (5487463392148528615L ^ life3_3))) + (life7_142 * __sourceIntrinsic_eee30c91936c_invokedynamic8377_43(3125, (7937291303444907381L ^ life3_3)))) + 2);
        life9_181 = ((((moom.ir)(p0)).b__Int() - __sourceIntrinsic_eee30c91936c_invokedynamic8377_45(28624, (24574408959420035L ^ life3_3))) - 3);
        ((net.minecraft.client.gui.GuiIngame)(this)).a(((int)(life7_142)), ((int)(life8_170)), ((int)(life9_181)), ((float)(p1)), ((net.minecraft.entity.player.EntityPlayer)(life5_13)));
        life7_142 += 1;
    }
        moom.lt.a();
        moom.kZ.z();
        moom.kZ.k();
    }
    return;
}


public moom.gD a__gD() {
return this.o;
}


public moom.hI a__hI() {
return this.n;
}


public net.minecraft.client.gui.FontRenderer a__ga() {
return ((net.minecraft.client.Minecraft)(this.j)).N;
}


public void a(java.lang.String p0, boolean p1) {
long local3 = (net.minecraft.client.gui.GuiIngame.J ^ 21284189147871L);
    this.r = ((java.lang.String)(p0));
    this.s = ((int)(__sourceIntrinsic_dc5299bd7a3c_originalDynamicSite1778_2(10509, (6520955946387928796L ^ local3))));
    this.t = ((boolean)(p1));
    return;
}


public void a__Void() {
long local1 = (net.minecraft.client.gui.GuiIngame.J ^ 93708815911530L);
    this.z = ((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1779_1(19989, (268894644185090356L ^ local1))));
    this.A = ((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1779_3(22275, (3369757773544804426L ^ local1))));
    this.B = ((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1779_5(8619, (2241562228970563316L ^ local1))));
    return;
}


public void a(float p0) {
net.minecraft.scoreboard.ScoreObjective forwardValue4786_846_0;
    int spill4786_0;
    int spill4786_1;
    int spill4786_2;
    long spill4786_3;
    long life2_3;
    moom.ir life4_9;
    int life5_12;
    int life6_15;
    com.moon.event.Render2DEvent life7_59;
    com.moon.d_ life8_94;
    com.moon.eh life9_127;
    net.minecraft.item.ItemStack life10_184;
    float life11_231;
    com.moon.d3 life11_274;
    com.moon.d8 life12_354;
    int life13_404;
    float life14_409;
    int life15_443;
    int life13_470;
    float life14_561;
    int life15_568;
    int life16_623;
    com.moon.eg life14_680;
    float life15_705;
    int life16_710;
    float life17_730;
    int life16_762;
    int life17_813;
    net.minecraft.scoreboard.Scoreboard life15_879;
    net.minecraft.scoreboard.ScoreObjective life16_881;
    moom.Bk life17_888;
    net.minecraft.util.EnumChatFormatting life18_893;
    int life19_898;
    net.minecraft.scoreboard.ScoreObjective life18_916;
    com.moon.dY life19_930;
    com.moon.dX life19_970;
    net.minecraft.scoreboard.ScoreObjective life18_994;
    forward_join_962: {
    forward_join_955: {
    forward_join_951: {
    forward_join_940: {
    forward_join_911: {
    forward_join_863: {
    forward_join_854: {
    forward_join_846: {
    forward_join_843: {
    forward_join_839: {
    forward_join_807: {
    forward_join_803: {
    forward_join_686: {
    forward_join_672: {
    forward_join_612: {
    forward_join_608: {
    forward_join_575: {
    forward_join_517: {
    forward_join_483: {
    forward_join_474: {
    forward_join_467: {
    forward_join_458: {
    forward_join_444: {
    forward_join_435: {
    forward_join_410: {
    forward_join_381: {
    forward_join_341: {
    forward_join_333: {
    forward_join_297: {
    forward_join_226: {
    forward_join_222: {
    forward_join_211: {
    forward_join_180: {
    forward_join_158: {
    forward_join_145: {
    forward_join_131: {
    forward_join_109: {
    forward_join_84: {
    forward_join_74: {
    life2_3 = (net.minecraft.client.gui.GuiIngame.J ^ 97122793200038L);
    life4_9 = new moom.ir(this.j);
    life5_12 = ((moom.ir)(life4_9)).a__Int();
    life6_15 = ((moom.ir)(life4_9)).b__Int();
    moom.kZ.l(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_4(5341, (6334429489093787768L ^ life2_3)))));
    moom.kZ.A();
    moom.kZ.a(((double)(0x0.0p0d)), ((double)(((moom.ir)(life4_9)).a())), ((double)(((moom.ir)(life4_9)).b())), ((double)(0x0.0p0d)), ((double)(0x1.f4p9d)), ((double)(0x1.77p11d)));
    moom.kZ.l(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_10(2465, (7469223749787639054L ^ life2_3)))));
    moom.kZ.A();
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.f4p10f)));
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.eP())));
    moom.kZ.k(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_17(17749, (1326441774617203141L ^ life2_3)))));
    life7_59 = new com.moon.event.Render2DEvent(com.moon.event.RenderPhase.PRE);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life7_59)));
    if (!((this.H == null))) {
        break forward_join_74;
    }
    this.H = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    }
    if (!((!((com.moon.module.impl.Effects)(this.H)).isEnabled()))) {
        break forward_join_84;
    }
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.event.Render3DEvent())));
    }
    moom.kZ.l();
    life8_94 = new com.moon.d_();
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life8_94)));
    if (!((!((com.moon.event.Render2DEvent)(life7_59)).isCancelled()))) {
        break forward_join_962;
    }
    if (!((!((com.moon.d_)(life8_94)).isCancelled()))) {
        break forward_join_962;
    }
    if (!((this.G == null))) {
        break forward_join_109;
    }
    this.G = ((com.moon.module.impl.Camera)(((com.moon.module.impl.Camera)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Camera.class)))))));
    }
    life9_127 = new com.moon.eh();
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life9_127)));
    if (!((!((com.moon.eh)(life9_127)).isCancelled()))) {
        break forward_join_145;
    }
    if (!(moom.BU.P())) {
        break forward_join_131;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).a(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).a(((float)(p0))))), ((moom.ir)(life4_9)));
    break forward_join_158;
    }
    moom.kZ.a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_57(1802, (6267315940534670323L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_58(18763, (2026899393030790641L ^ life2_3)))), ((int)(1)), ((int)(0)));
    break forward_join_158;
    }
    moom.kZ.a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_60(1802, (6267315940534670323L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_61(18763, (2026899393030790641L ^ life2_3)))), ((int)(1)), ((int)(0)));
    }
    life10_184 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).bD)).c(((int)(3)));
    if (!((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.j)).W)).aP == 0))) {
        break forward_join_180;
    }
    if (!((life10_184 != null))) {
        break forward_join_180;
    }
    if (!((((net.minecraft.item.ItemStack)(life10_184)).a__wQ() == net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aU)))))) {
        break forward_join_180;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).d(((moom.ir)(life4_9)));
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.l)))))) {
        break forward_join_211;
    }
    life11_231 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).cv + ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).cu - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).cv) * p0));
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life11_231)), ((float)(0x0.0p0f))) > 0))) {
        break forward_join_211;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((float)(life11_231)), ((moom.ir)(life4_9)));
    }
    if (!(((moom.jI)(((net.minecraft.client.Minecraft)(this.j)).F)).a__Boolean())) {
        break forward_join_222;
    }
    ((moom.hI)(this.n)).a(((moom.ir)(life4_9)), ((float)(p0)));
    break forward_join_226;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).a(((moom.ir)(life4_9)), ((float)(p0)));
    }
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.j)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.GuiIngame.c)));
    moom.kZ.l();
    life11_274 = new com.moon.d3();
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life11_274)));
    if (!(((net.minecraft.client.gui.GuiIngame)(this)).a__Boolean())) {
        break forward_join_297;
    }
    if (!((!((com.moon.d3)(life11_274)).isCancelled()))) {
        break forward_join_297;
    }
    moom.kZ.a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_106(28857, (5022349867039007779L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_107(27463, (4914320572528213967L ^ life2_3)))), ((int)(1)), ((int)(0)));
    moom.kZ.d__Void();
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(((life5_12 / 2) - __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_110(12694, (2120475571497493787L ^ life2_3))))), ((int)(((life6_15 / 2) - __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_111(12694, (2120475571497493787L ^ life2_3))))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_112(15334, (386769345888841557L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_113(15334, (386769345888841557L ^ life2_3)))));
    }
    moom.kZ.d__Void();
    moom.kZ.a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_116(1802, (6267315940534670323L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_117(18763, (2026899393030790641L ^ life2_3)))), ((int)(1)), ((int)(0)));
    life12_354 = new com.moon.d8();
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life12_354)));
    if (!((!((com.moon.d8)(life12_354)).isCancelled()))) {
        break forward_join_333;
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).a__Void(((java.lang.String)("bossHealth")));
    ((net.minecraft.client.gui.GuiIngame)(this)).b();
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b();
    }
    if (!(((moom.jI)(((net.minecraft.client.Minecraft)(this.j)).F)).b__Boolean())) {
        break forward_join_341;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).c(((moom.ir)(life4_9)));
    }
    moom.kZ.k();
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).o__sourceReturn_8abf5c6871() > 0))) {
        break forward_join_410;
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).a__Void(((java.lang.String)("sleep")));
    moom.kZ.i();
    moom.kZ.c__Void();
    life13_404 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).o__sourceReturn_8abf5c6871();
    life14_409 = (((float) life13_404) / 0x1.9p6f);
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life14_409)), ((float)(0x1.0p0f))) > 0))) {
        break forward_join_381;
    }
    life14_409 = (0x1.0p0f - (((float) (life13_404 - __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_147(13702, (6915705811827057022L ^ life2_3)))) / 0x1.4p3f));
    }
    life15_443 = ((((int) (0x1.b8p7f * life14_409)) << __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_148(27458, (514533478399786942L ^ life2_3))) | __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_149(28163, (8950165424675568311L ^ life2_3)));
    net.minecraft.client.gui.GuiIngame.a(((int)(0)), ((int)(0)), ((int)(life5_12)), ((int)(life6_15)), ((int)(life15_443)));
    moom.kZ.d__Void();
    moom.kZ.j();
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b();
    }
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    life13_470 = ((life5_12 / 2) - __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_157(31248, (6146425976447151755L ^ life2_3)));
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).ac())) {
        break forward_join_435;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).a(((moom.ir)(life4_9)), ((int)(life13_470)));
    break forward_join_444;
    }
    if (!(((moom.jI)(((net.minecraft.client.Minecraft)(this.j)).F)).c__Boolean())) {
        break forward_join_444;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((moom.ir)(life4_9)), ((int)(life13_470)));
    }
    if (!(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.j)).W)).P)) {
        break forward_join_458;
    }
    if (!((!((moom.jI)(((net.minecraft.client.Minecraft)(this.j)).F)).a__Boolean()))) {
        break forward_join_458;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).a(((moom.ir)(life4_9)));
    break forward_join_467;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).U__Boolean())) {
        break forward_join_467;
    }
    ((moom.hI)(this.n)).a(((moom.ir)(life4_9)));
    }
    if (!(((net.minecraft.client.Minecraft)(this.j)).i__Boolean())) {
        break forward_join_474;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((moom.ir)(life4_9)));
    }
    if (!(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.j)).W)).aQ)) {
        break forward_join_483;
    }
    ((net.minecraft.client.gui.GuiOverlayDebug)(this.m)).a(((moom.ir)(life4_9)));
    }
    if (!((this.s > 0))) {
        break forward_join_612;
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).a__Void(((java.lang.String)("overlayMessage")));
    life14_561 = (((float) this.s) - p0);
    life15_568 = ((int) ((life14_561 * 0x1.fep7f) / 0x1.4p4f));
    if (!((life15_568 > __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_191(30457, (5609064531431039495L ^ life2_3))))) {
        break forward_join_517;
    }
    life15_568 = __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_192(30457, (5609064531431039495L ^ life2_3));
    }
    if (!((life15_568 > __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_193(22038, (8196742071477928696L ^ life2_3))))) {
        break forward_join_608;
    }
    moom.kZ.B();
    moom.kZ.b(((float)(((float) (life5_12 / 2)))), ((float)(((float) (life6_15 - __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_195(27553, (6104438817267302207L ^ life2_3)))))), ((float)(0x0.0p0f)));
    spill4786_0 = 1802;
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_198(spill4786_0, (6267315940534670323L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_199(18763, (2026899393030790641L ^ life2_3)))), ((int)(1)), ((int)(0)));
    life16_623 = __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_201(12671, (3230033020400559498L ^ life2_3));
    if (!(this.t)) {
        break forward_join_575;
    }
    life16_623 = (moom.Dr.b(((float)((life14_561 / 0x1.9p5f))), ((float)(0x1.666666p-1f)), ((float)(0x1.333334p-1f))) & __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_204(12671, (3230033020400559498L ^ life2_3)));
    }
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).b(((java.lang.String)(this.r)), ((float)(((float) ((-((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(this.r)))) / 2)))), ((float)(-0x1.0p2f)), ((int)((life16_623 + ((life15_568 << __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_210(27458, (514533478399786942L ^ life2_3))) & __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_211(21939, (4284991913807282442L ^ life2_3)))))));
    moom.kZ.k();
    moom.kZ.C();
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b();
    }
    life14_680 = new com.moon.eg();
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life14_680)));
    if (!((!((com.moon.eg)(life14_680)).isCancelled()))) {
        break forward_join_807;
    }
    if (!((this.w > 0))) {
        break forward_join_807;
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).a__Void(((java.lang.String)("titleAndSubtitle")));
    spill4786_1 = 30457;
    life15_705 = (((float) this.w) - p0);
    life16_710 = __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_227(spill4786_1, (5609064531431039495L ^ life2_3));
    if (!((this.w > (this.B + this.A)))) {
        break forward_join_672;
    }
    life17_730 = (((float) ((this.z + this.A) + this.B)) - life15_705);
    life16_710 = ((int) ((life17_730 * 0x1.fep7f) / ((float) this.z)));
    }
    if (!((this.w <= this.B))) {
        break forward_join_686;
    }
    life16_710 = ((int) ((life15_705 * 0x1.fep7f) / ((float) this.B)));
    }
    life16_762 = moom.Dr.a(((int)(life16_710)), ((int)(0)), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_238(30457, (5609064531431039495L ^ life2_3)))));
    if (!((life16_762 > __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_240(23144, (470502933334101704L ^ life2_3))))) {
        break forward_join_803;
    }
    moom.kZ.B();
    spill4786_2 = 1802;
    moom.kZ.b(((float)(((float) (life5_12 / 2)))), ((float)(((float) (life6_15 / 2)))), ((float)(0x0.0p0f)));
    spill4786_3 = (6267315940534670323L ^ life2_3);
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_244(spill4786_2, spill4786_3))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_245(18763, (2026899393030790641L ^ life2_3)))), ((int)(1)), ((int)(0)));
    moom.kZ.B();
    moom.kZ.a(((float)(0x1.0p2f)), ((float)(0x1.0p2f)), ((float)(0x1.0p2f)));
    life17_813 = ((life16_762 << __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_249(27458, (514533478399786942L ^ life2_3))) & __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_250(28985, (204526811692017053L ^ life2_3)));
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(this.x)), ((float)(((float) ((-((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(this.x)))) / 2)))), ((float)(-0x1.4p3f)), ((int)((__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_256(12671, (3230033020400559498L ^ life2_3)) | life17_813))), ((boolean)(true)));
    moom.kZ.C();
    moom.kZ.B();
    moom.kZ.a(((float)(0x1.0p1f)), ((float)(0x1.0p1f)), ((float)(0x1.0p1f)));
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(this.y)), ((float)(((float) ((-((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(this.y)))) / 2)))), ((float)(0x1.4p2f)), ((int)((__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_266(12671, (3230033020400559498L ^ life2_3)) | life17_813))), ((boolean)(true)));
    moom.kZ.C();
    moom.kZ.k();
    moom.kZ.C();
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b();
    }
    life15_879 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.j)).I)).a__Bh();
    life16_881 = null;
    life17_888 = ((net.minecraft.scoreboard.Scoreboard)(life15_879)).c(((java.lang.String)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).a__String())));
    if (!((life17_888 != null))) {
        break forward_join_839;
    }
    life18_893 = ((moom.Bk)(life17_888)).a__br();
    if (!((life18_893 != null))) {
        break forward_join_839;
    }
    life19_898 = ((net.minecraft.util.EnumChatFormatting)(life18_893)).a();
    if (!((life19_898 >= 0))) {
        break forward_join_839;
    }
    life16_881 = ((net.minecraft.scoreboard.Scoreboard)(life15_879)).a__Bg(((int)((3 + life19_898))));
    }
    if (!((life16_881 != null))) {
        break forward_join_843;
    }
    forwardValue4786_846_0 = life16_881;
    break forward_join_846;
    }
    forwardValue4786_846_0 = ((net.minecraft.scoreboard.Scoreboard)(life15_879)).a__Bg(((int)(1)));
    }
    life18_916 = forwardValue4786_846_0;
    if (!((life18_916 != null))) {
        break forward_join_854;
    }
    ((net.minecraft.client.gui.GuiIngame)(this)).a(((net.minecraft.scoreboard.ScoreObjective)(life18_916)), ((moom.ir)(life4_9)));
    break forward_join_863;
    }
    life19_930 = new com.moon.dY(null);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life19_930)));
    }
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_290(1802, (6267315940534670323L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_291(18763, (2026899393030790641L ^ life2_3)))), ((int)(1)), ((int)(0)));
    moom.kZ.c__Void();
    moom.kZ.B();
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(((float) (life6_15 - __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_295(20651, (2844146784272811015L ^ life2_3)))))), ((float)(0x0.0p0f)));
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).a__Void(((java.lang.String)("chat")));
    life19_970 = new com.moon.dX();
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life19_970)));
    if (!((!((com.moon.dX)(life19_970)).isCancelled()))) {
        break forward_join_911;
    }
    ((moom.gB)(this.l)).a(((int)(this.q)));
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b();
    moom.kZ.C();
    life18_994 = ((net.minecraft.scoreboard.Scoreboard)(life15_879)).a__Bg(((int)(0)));
    if (!(((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.j)).W)).ay)).a__Boolean())) {
        break forward_join_951;
    }
    if (!(((net.minecraft.client.Minecraft)(this.j)).j__Boolean())) {
        break forward_join_940;
    }
    if (!((((java.util.Collection)(((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).cm)).a__Collection())).size() <= 1))) {
        break forward_join_940;
    }
    if (!((life18_994 != null))) {
        break forward_join_951;
    }
    }
    ((moom.gD)(this.o)).a(((boolean)(true)));
    ((moom.gD)(this.o)).a(((int)(life5_12)), ((net.minecraft.scoreboard.Scoreboard)(life15_879)), ((net.minecraft.scoreboard.ScoreObjective)(life18_994)));
    break forward_join_955;
    }
    ((moom.gD)(this.o)).a(((boolean)(false)));
    }
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.f();
    moom.kZ.d__Void();
    }
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.event.Render2DEvent(com.moon.event.RenderPhase.POST))));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10264_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiIngame.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28528;
      if (L[var3] == null) {
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
         long var5 = K[var3];
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
         Object[] var9 = (Object[])M.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               M.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         L[var3] = var15;
      }

      return L[var3];
}


public void a(java.lang.String p0) {
((net.minecraft.client.gui.GuiIngame)(this)).a(((java.lang.String)(moom.oO.a(((java.lang.String)("record.nowPlaying")), ((java.lang.Object[])(new java.lang.Object[] {p0}))))), ((boolean)(true)));
    return;
}


public void a(moom.ir p0) {
long life2_3;
    java.lang.String life4_21;
    int life5_39;
    int life6_48;
    int life7_66;
    life2_3 = (net.minecraft.client.gui.GuiIngame.J ^ 2046916211407L);
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).a__Void(((java.lang.String)("selectedItemName")));
    if ((this.u > 0)) {
        if ((this.v != null)) {
        life4_21 = ((net.minecraft.item.ItemStack)(this.v)).b__String();
        if (((net.minecraft.item.ItemStack)(this.v)).f__Boolean()) {
        life4_21 = __sourceIntrinsic_b9db2db4e947_invokedynamic8379_11(net.minecraft.util.EnumChatFormatting.ITALIC, life4_21);
    }
        life5_39 = ((((moom.ir)(p0)).a__Int() - ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(life4_21)))) / 2);
        life6_48 = (((moom.ir)(p0)).b__Int() - __sourceIntrinsic_b9db2db4e947_invokedynamic8379_16(11833, (5302737829231055355L ^ life2_3)));
        if ((!((moom.jI)(((net.minecraft.client.Minecraft)(this.j)).F)).b__Boolean())) {
        life6_48 += 14;
    }
        life7_66 = ((int) ((((float) this.u) * 0x1.0p8f) / 0x1.4p3f));
        if ((life7_66 > __sourceIntrinsic_b9db2db4e947_invokedynamic8379_21(26278, (5884285658244159841L ^ life2_3)))) {
        life7_66 = __sourceIntrinsic_b9db2db4e947_invokedynamic8379_22(30457, (5609022163522718062L ^ life2_3));
    }
        if ((life7_66 > 0)) {
        moom.kZ.B();
        int spill8379_0 = 10504;
        moom.kZ.l();
        moom.kZ.a(((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic8379_25(spill8379_0, (4707902615026685634L ^ life2_3)))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic8379_26(12882, (5399170449438264772L ^ life2_3)))), ((int)(1)), ((int)(0)));
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(life4_21)), ((float)(((float) life5_39))), ((float)(((float) life6_48))), ((int)((__sourceIntrinsic_b9db2db4e947_invokedynamic8379_29(24161, (1669178905617539502L ^ life2_3)) + (life7_66 << __sourceIntrinsic_b9db2db4e947_invokedynamic8379_30(3244, (6208187490365141853L ^ life2_3)))))));
        moom.kZ.k();
        moom.kZ.C();
    }
    }
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b();
    return;
}


private void a(int p0, int p1, int p2, float p3, net.minecraft.entity.player.EntityPlayer p4) {
long life6_3;
    net.minecraft.item.ItemStack life8_9;
    float life9_17;
    float life10_28;
    life6_3 = (net.minecraft.client.gui.GuiIngame.J ^ 77013770233636L);
    life8_9 = (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p4)).bD)).a)[p0];
    if ((life8_9 != null)) {
        life9_17 = (((float) ((net.minecraft.item.ItemStack)(life8_9)).c) - p3);
        if ((life9_17 > 0x0.0p0f)) {
        moom.kZ.B();
        life10_28 = (0x1.0p0f + (life9_17 / 0x1.4p2f));
        moom.kZ.b(((float)(((float) (p1 + __sourceIntrinsic_20abdc69087e_invokedynamic8380_5(23144, (470504883210219594L ^ life6_3)))))), ((float)(((float) (p2 + __sourceIntrinsic_20abdc69087e_invokedynamic8380_6(24616, (2378330747910375976L ^ life6_3)))))), ((float)(0x0.0p0f)));
        moom.kZ.a(((float)((0x1.0p0f / life10_28))), ((float)(((life10_28 + 0x1.0p0f) / 0x1.0p1f))), ((float)(0x1.0p0f)));
        moom.kZ.b(((float)(((float) (-(p1 + __sourceIntrinsic_20abdc69087e_invokedynamic8380_9(23144, (470504883210219594L ^ life6_3))))))), ((float)(((float) (-(p2 + __sourceIntrinsic_20abdc69087e_invokedynamic8380_10(24616, (2378330747910375976L ^ life6_3))))))), ((float)(0x0.0p0f)));
    }
        ((net.minecraft.client.renderer.entity.RenderItem)(this.k)).a(((net.minecraft.item.ItemStack)(life8_9)), ((int)(p1)), ((int)(p2)));
        if ((life9_17 > 0x0.0p0f)) {
        moom.kZ.C();
    }
        ((net.minecraft.client.renderer.entity.RenderItem)(this.k)).a(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.j)).N)), ((net.minecraft.item.ItemStack)(life8_9)), ((int)(p1)), ((int)(p2)));
    }
    return;
}


public boolean a__Boolean() {
if ((((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.j)).W)).aQ) ? 1 : 0) != 0)) {
        if ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).V()) == 0)) {
        if ((((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.j)).W)).H) ? 1 : 0) == 0)) {
        return ((0) != 0);
    }
    }
    }
    if ((__sourceIntrinsic_booleanComparison(((moom.jI)(((net.minecraft.client.Minecraft)(this.j)).F)).a__Boolean()) != 0)) {
        if ((((net.minecraft.client.Minecraft)(this.j)).L != null)) {
        return ((1) != 0);
    }
        if ((((net.minecraft.client.Minecraft)(this.j)).V != null)) {
        if ((((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(this.j)).V)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK)) {
        java.lang.Object local1 = ((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(this.j)).V)).a();
        return ((((((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.j)).I)).a__B9(((moom.DT)(local1))) instanceof net.minecraft.inventory.IInventory) ? 1 : 0)) != 0);
    }
    }
        return ((0) != 0);
    }
    return ((1) != 0);
}


public void a(float p0, moom.ir p1) {
long life3_3;
    float life1_26;
    float life1_31;
    net.minecraft.world.border.WorldBorder life5_36;
    float life6_43;
    double life7_59;
    double life9_65;
    float life6_78;
    net.minecraft.client.renderer.Tessellator life11_134;
    moom.lw life12_137;
    life3_3 = (net.minecraft.client.gui.GuiIngame.J ^ 50156057143131L);
    if ((!moom.BU.P())) {
        moom.kZ.j();
        moom.kZ.a(((int)(__sourceIntrinsic_295a1d801482_invokedynamic8381_3(1802, (6267198053147012366L ^ life3_3)))), ((int)(__sourceIntrinsic_295a1d801482_invokedynamic8381_4(18763, (2026773260248589068L ^ life3_3)))), ((int)(1)), ((int)(0)));
    } else {
        life1_26 = (0x1.0p0f - p0);
        life1_31 = moom.Dr.a(((float)(life1_26)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
        life5_36 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.j)).I)).a__Fi();
        life6_43 = ((float) ((net.minecraft.world.border.WorldBorder)(life5_36)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.j)).K))));
        life7_59 = java.lang.Math.min(((double)(((((net.minecraft.world.border.WorldBorder)(life5_36)).k() * ((double) ((net.minecraft.world.border.WorldBorder)(life5_36)).b__Int())) * 0x1.f4p9d))), ((double)(java.lang.Math.abs(((double)((((net.minecraft.world.border.WorldBorder)(life5_36)).h() - ((net.minecraft.world.border.WorldBorder)(life5_36)).g())))))));
        life9_65 = java.lang.Math.max(((double)(((double) ((net.minecraft.world.border.WorldBorder)(life5_36)).c__Int()))), ((double)(life7_59)));
        if ((((double) life6_43) < life9_65)) {
        life6_78 = (0x1.0p0f - ((float) (((double) life6_43) / life9_65)));
    } else {
        life6_78 = 0x0.0p0f;
    }
        this.p = ((float)(((float) (((double) this.p) + (((double) (life1_31 - this.p)) * 0x1.47ae147ae147bp-7d)))));
        moom.kZ.i();
        moom.kZ.a(((boolean)(false)));
        moom.kZ.a(((int)(0)), ((int)(__sourceIntrinsic_295a1d801482_invokedynamic8381_26(25793, (2195507707827555977L ^ life3_3)))), ((int)(1)), ((int)(0)));
        if ((life6_78 > 0x0.0p0f)) {
        moom.kZ.c(((float)(0x0.0p0f)), ((float)(life6_78)), ((float)(life6_78)), ((float)(0x1.0p0f)));
    } else {
        moom.kZ.c(((float)(this.p)), ((float)(this.p)), ((float)(this.p)), ((float)(0x1.0p0f)));
    }
        ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.j)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.GuiIngame.f)));
        life11_134 = net.minecraft.client.renderer.Tessellator.a();
        life12_137 = ((net.minecraft.client.renderer.Tessellator)(life11_134)).a__lw();
        ((moom.lw)(life12_137)).a(((int)(__sourceIntrinsic_295a1d801482_invokedynamic8381_39(12694, (2120355968275373030L ^ life3_3)))), ((moom.oD)(moom.oB.i)));
        int spill8381_0 = 1802;
        ((moom.lw)(((moom.lw)(((moom.lw)(life12_137)).a(((double)(0x0.0p0d)), ((double)(((double) ((moom.ir)(p1)).b__Int()))), ((double)(-0x1.68p6d))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).c__Void();
        long spill8381_1 = (6267198053147012366L ^ life3_3);
        ((moom.lw)(((moom.lw)(((moom.lw)(life12_137)).a(((double)(((double) ((moom.ir)(p1)).a__Int()))), ((double)(((double) ((moom.ir)(p1)).b__Int()))), ((double)(-0x1.68p6d))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life12_137)).a(((double)(((double) ((moom.ir)(p1)).a__Int()))), ((double)(0x0.0p0d)), ((double)(-0x1.68p6d))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life12_137)).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(-0x1.68p6d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life11_134)).a__Void();
        moom.kZ.a(((boolean)(true)));
        moom.kZ.j();
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        moom.kZ.a(((int)(__sourceIntrinsic_295a1d801482_invokedynamic8381_62(spill8381_0, spill8381_1))), ((int)(__sourceIntrinsic_295a1d801482_invokedynamic8381_63(18763, (2026773260248589068L ^ life3_3)))), ((int)(1)), ((int)(0)));
    }
    return;
}


private void a(net.minecraft.scoreboard.ScoreObjective p0, moom.ir p1) {
long life3_3;
    com.moon.dY life5_8;
    net.minecraft.scoreboard.Scoreboard life6_30;
    java.util.Collection life7_34;
    java.util.ArrayList life8_43;
    java.util.ArrayList life7_63;
    int life9_72;
    java.util.Iterator life10_75;
    net.minecraft.scoreboard.Score life11_82;
    moom.Bk life12_87;
    java.lang.String life13_96;
    int life10_111;
    int life11_120;
    int life12_122;
    int life13_129;
    int life14_131;
    java.util.Iterator life15_134;
    net.minecraft.scoreboard.Score life16_141;
    moom.Bk life17_147;
    java.lang.String life18_152;
    java.lang.String life19_157;
    int life20_165;
    int life21_172;
    java.lang.String life22_190;
    java.lang.String life22_266;
    forest_join_352: {
    forest_join_104: {
    forest_join_66: {
    forest_join_64: {
    forest_join_27: {
    forest_join_17: {
    life3_3 = (net.minecraft.client.gui.GuiIngame.J ^ 24400203460418L);
    life5_8 = new com.moon.dY(p0);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life5_8)));
    if (!(((com.moon.dY)(life5_8)).isCancelled())) {
        break forest_join_17;
    }
    return;
    }
    if (!((this.I == null))) {
        break forest_join_27;
    }
    this.I = ((com.moon.module.impl.CustomMinecraft)(((com.moon.module.impl.CustomMinecraft)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.CustomMinecraft.class)))))));
    }
    life6_30 = ((net.minecraft.scoreboard.ScoreObjective)(p0)).a__Bh();
    life7_34 = ((net.minecraft.scoreboard.Scoreboard)(life6_30)).a(((net.minecraft.scoreboard.ScoreObjective)(p0)));
    life8_43 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((java.lang.Iterable)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.Collection)(life7_34)).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_2330de98e0b4_invokedynamic984_15()))))).collect(((java.util.stream.Collector)(java.util.stream.Collectors.toList()))))))));
    if (!((((java.util.List)(life8_43)).size() > __sourceIntrinsic_2330de98e0b4_invokedynamic984_22(12975, (7510762535831294172L ^ life3_3))))) {
        break forest_join_64;
    }
    life7_63 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(com.google.common.collect.Iterables.skip(((java.lang.Iterable)(life8_43)), ((int)((((java.util.Collection)(life7_34)).size() - __sourceIntrinsic_2330de98e0b4_invokedynamic984_24(15102, (401594048864508051L ^ life3_3)))))))));
    break forest_join_66;
    }
    life7_63 = life8_43;
    }
    life9_72 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(((net.minecraft.scoreboard.ScoreObjective)(p0)).b())));
    life10_75 = ((java.util.Collection)(life7_63)).iterator();
    forest_cycle_75: while (true) {
    if (!(((java.util.Iterator)(life10_75)).hasNext())) {
        break forest_join_104;
    }
    life11_82 = ((net.minecraft.scoreboard.Score)(((java.util.Iterator)(life10_75)).next()));
    life12_87 = ((net.minecraft.scoreboard.Scoreboard)(life6_30)).c(((java.lang.String)(((net.minecraft.scoreboard.Score)(life11_82)).a__String())));
    life13_96 = __sourceIntrinsic_2330de98e0b4_invokedynamic984_40(moom.Bk.a(((moom.Bj)(life12_87)), ((java.lang.String)(((net.minecraft.scoreboard.Score)(life11_82)).a__String()))), net.minecraft.util.EnumChatFormatting.RED, ((net.minecraft.scoreboard.Score)(life11_82)).a());
    life9_72 = java.lang.Math.max(((int)(life9_72)), ((int)(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(life13_96))))));
    continue forest_cycle_75;
    }
    }
    life10_111 = (((java.util.Collection)(life7_63)).size() * ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).c);
    life11_120 = ((((moom.ir)(p1)).b__Int() / 2) + (life10_111 / 3));
    life12_122 = 3;
    life13_129 = ((((moom.ir)(p1)).a__Int() - life9_72) - life12_122);
    life14_131 = 0;
    life15_134 = ((java.util.Collection)(life7_63)).iterator();
    forest_cycle_134: while (true) {
    forest_join_351: {
    forest_join_326: {
    forest_join_256: {
    forest_join_241: {
    forest_join_204: {
    if (!(((java.util.Iterator)(life15_134)).hasNext())) {
        break forest_join_352;
    }
    life16_141 = ((net.minecraft.scoreboard.Score)(((java.util.Iterator)(life15_134)).next()));
    life14_131 += 1;
    life17_147 = ((net.minecraft.scoreboard.Scoreboard)(life6_30)).c(((java.lang.String)(((net.minecraft.scoreboard.Score)(life16_141)).a__String())));
    life18_152 = moom.Bk.a(((moom.Bj)(life17_147)), ((java.lang.String)(((net.minecraft.scoreboard.Score)(life16_141)).a__String())));
    life19_157 = __sourceIntrinsic_2330de98e0b4_invokedynamic984_59(net.minecraft.util.EnumChatFormatting.RED, ((net.minecraft.scoreboard.Score)(life16_141)).a());
    life20_165 = (life11_120 - (life14_131 * ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).c));
    life21_172 = ((((moom.ir)(p1)).a__Int() - life12_122) + 2);
    if (!(((com.moon.module.impl.CustomMinecraft)(this.I)).isEnabled())) {
        break forest_join_204;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.CustomMinecraft)(this.I)).a__kV())).getValue())))).booleanValue())) {
        break forest_join_204;
    }
    life22_190 = ((java.lang.String)(((com.moon.setting.StringListSetting)(((com.moon.module.impl.CustomMinecraft)(this.I)).a__k3())).getValue()));
    if (!(((java.lang.String)(((java.lang.String)(((java.lang.String)(((java.lang.String)(life18_152)).replaceAll(((java.lang.String)("§[0-9]")), ((java.lang.String)(""))))).replaceAll(((java.lang.String)("§[a-z]")), ((java.lang.String)(""))))).replaceAll(((java.lang.String)("[^\\x00-\\x7F]+")), ((java.lang.String)(""))))).equals(((java.lang.Object)(life22_190))))) {
        break forest_join_204;
    }
    life18_152 = "§9§lmoonclient.xyz";
    }
    net.minecraft.client.gui.GuiIngame.a(((int)((life13_129 - 2))), ((int)(life20_165)), ((int)(life21_172)), ((int)((life20_165 + ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).c))), ((int)(__sourceIntrinsic_2330de98e0b4_invokedynamic984_80(13263, (7004437677968937345L ^ life3_3)))));
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).b(((java.lang.String)(life18_152)), ((float)(((float) life13_129))), ((float)(((float) life20_165))), ((int)(-1)));
    if (!(((com.moon.module.impl.Camera)(this.G)).isEnabled())) {
        break forest_join_241;
    }
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Camera)(this.G)).k())).getValue())))).booleanValue()))) {
        break forest_join_256;
    }
    }
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).b(((java.lang.String)(life19_157)), ((float)(((float) (life21_172 - ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(life19_157))))))), ((float)(((float) life20_165))), ((int)(-1)));
    }
    if (!((life14_131 == ((java.util.Collection)(life7_63)).size()))) {
        break forest_join_351;
    }
    life22_266 = ((net.minecraft.scoreboard.ScoreObjective)(p0)).b();
    net.minecraft.client.gui.GuiIngame.a(((int)((life13_129 - 2))), ((int)(((life20_165 - ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).c) - 1))), ((int)(life21_172)), ((int)((life20_165 - 1))), ((int)(__sourceIntrinsic_2330de98e0b4_invokedynamic984_99(22898, (5423063921333254954L ^ life3_3)))));
    net.minecraft.client.gui.GuiIngame.a(((int)((life13_129 - 2))), ((int)((life20_165 - 1))), ((int)(life21_172)), ((int)(life20_165)), ((int)(__sourceIntrinsic_2330de98e0b4_invokedynamic984_101(15105, (8700411731035969893L ^ life3_3)))));
    if (!(((com.moon.module.impl.CustomMinecraft)(this.I)).isEnabled())) {
        break forest_join_326;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.CustomMinecraft)(this.I)).a__kV())).getValue())))).booleanValue())) {
        break forest_join_326;
    }
    if (!(((java.lang.String)(((java.lang.String)(((java.lang.String)(((java.lang.String)(life22_266)).replaceAll(((java.lang.String)("§[0-9]")), ((java.lang.String)(""))))).replaceAll(((java.lang.String)("§[a-z]")), ((java.lang.String)(""))))).replaceAll(((java.lang.String)("[^\\x00-\\x7F]+")), ((java.lang.String)(""))))).equals(((java.lang.Object)(((com.moon.setting.StringListSetting)(((com.moon.module.impl.CustomMinecraft)(this.I)).a__k3())).getValue()))))) {
        break forest_join_326;
    }
    life22_266 = "§9§lmoonclient.xyz";
    }
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).b(((java.lang.String)(life22_266)), ((float)(((float) ((life13_129 + (life9_72 / 2)) - (((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).a(((java.lang.String)(life22_266))) / 2))))), ((float)(((float) (life20_165 - ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiIngame)(this)).a__ga())).c)))), ((int)(-1)));
    }
    continue forest_cycle_134;
    }
    }
    return;
}


public int a() {
return this.q;
}


public moom.gB a__gB() {
return this.l;
}


public void a(net.minecraft.util.IChatComponent p0, boolean p1) {
((net.minecraft.client.gui.GuiIngame)(this)).a(((java.lang.String)(((net.minecraft.util.IChatComponent)(p0)).b())), ((boolean)(p1)));
    return;
}


public void a(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4) {
forward_join_70: {
    forward_join_57: {
    forward_join_52: {
    forward_join_47: {
    forward_join_42: {
    forward_join_36: {
    forward_join_20: {
    if (!((p0 == null))) { break forward_join_20; }
    if (!((p1 == null))) { break forward_join_20; }
    if (!((p2 < 0))) { break forward_join_20; }
    if (!((p3 < 0))) { break forward_join_20; }
    if (!((p4 < 0))) { break forward_join_20; }
    this.x = ((java.lang.String)(""));
    this.y = ((java.lang.String)(""));
    this.w = ((int)(0));
    break forward_join_70;
    }
    if (!((p0 != null))) { break forward_join_36; }
    this.x = ((java.lang.String)(p0));
    this.w = ((int)(((this.z + this.A) + this.B)));
    break forward_join_70;
    }
    if (!((p1 != null))) { break forward_join_42; }
    this.y = ((java.lang.String)(p1));
    break forward_join_70;
    }
    if (!((p2 >= 0))) { break forward_join_47; }
    this.z = ((int)(p2));
    }
    if (!((p3 >= 0))) { break forward_join_52; }
    this.A = ((int)(p3));
    }
    if (!((p4 >= 0))) { break forward_join_57; }
    this.B = ((int)(p4));
    }
    if (!((this.w > 0))) { break forward_join_70; }
    this.w = ((int)(((this.z + this.A) + this.B)));
    }
    return;
}


public void a(moom.ir p0, int p1) {
long local3 = (net.minecraft.client.gui.GuiIngame.J ^ 37038850184293L);
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).a__Void(((java.lang.String)("jumpBar")));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.j)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.Gui.c)));
    float local5 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.j)).K)).n__sourceReturn_bc607678b6();
    int local6 = __sourceIntrinsic_6f2db999745d_invokedynamic10270_11(3694, (7419967019598010175L ^ local3));
    int local7 = ((int) (local5 * ((float) (local6 + 1))));
    int local8 = ((((moom.ir)(p0)).b__Int() - __sourceIntrinsic_6f2db999745d_invokedynamic10270_13(31474, (7156046788039287686L ^ local3))) + 3);
    ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(p1)), ((int)(local8)), ((int)(0)), ((int)(__sourceIntrinsic_6f2db999745d_invokedynamic10270_14(13071, (3932727500797045283L ^ local3)))), ((int)(local6)), ((int)(5)));
    if ((local7 > 0)) {
        ((net.minecraft.client.gui.GuiIngame)(this)).b(((int)(p1)), ((int)(local8)), ((int)(0)), ((int)(__sourceIntrinsic_6f2db999745d_invokedynamic10270_16(19624, (5181155528662717840L ^ local3)))), ((int)(local7)), ((int)(5)));
    }
    ((moom.A9)(((net.minecraft.client.Minecraft)(this.j)).j)).b();
    return;
}


private static boolean lambda$renderScoreboard$0(net.minecraft.scoreboard.Score p0) {
int forwardValue4790_11_0;
    forward_join_11: {
    forward_join_10: {
    if (!((((net.minecraft.scoreboard.Score)(p0)).a__String() != null))) {
        break forward_join_10;
    }
    if (!((!((java.lang.String)(((net.minecraft.scoreboard.Score)(p0)).a__String())).startsWith(((java.lang.String)("#")))))) {
        break forward_join_10;
    }
    forwardValue4790_11_0 = 1;
    break forward_join_11;
    }
    forwardValue4790_11_0 = 0;
    }
    return ((forwardValue4790_11_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_191(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_192(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_201(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_210(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_211(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_227(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_238(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_240(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_244(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_245(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_249(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_250(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_256(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_266(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_290(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_291(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4786_295(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_295a1d801482_invokedynamic8381_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_295a1d801482_invokedynamic8381_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_295a1d801482_invokedynamic8381_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_295a1d801482_invokedynamic8381_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_295a1d801482_invokedynamic8381_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_295a1d801482_invokedynamic8381_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20abdc69087e_invokedynamic8380_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20abdc69087e_invokedynamic8380_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20abdc69087e_invokedynamic8380_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20abdc69087e_invokedynamic8380_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dc5299bd7a3c_originalDynamicSite1778_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10264_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b9db2db4e947_invokedynamic8379_11(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic8379_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic8379_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic8379_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic8379_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic8379_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic8379_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic8379_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee30c91936c_invokedynamic8377_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6f2db999745d_invokedynamic10270_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6f2db999745d_invokedynamic10270_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6f2db999745d_invokedynamic10270_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6f2db999745d_invokedynamic10270_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_2330de98e0b4_invokedynamic984_15() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2330de98e0b4_invokedynamic984_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2330de98e0b4_invokedynamic984_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2330de98e0b4_invokedynamic984_40(java.lang.String a0, net.minecraft.util.EnumChatFormatting a1, int a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2330de98e0b4_invokedynamic984_59(net.minecraft.util.EnumChatFormatting a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2330de98e0b4_invokedynamic984_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2330de98e0b4_invokedynamic984_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2330de98e0b4_invokedynamic984_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1779_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1779_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1779_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic8373_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic8373_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic8373_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic8373_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic8373_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic8373_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic8373_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4d38a8356407_invokedynamic8453_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4d38a8356407_invokedynamic8453_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4d38a8356407_invokedynamic8453_24(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a59fcae0fae5_invokedynamic8451_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a59fcae0fae5_invokedynamic8451_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a59fcae0fae5_invokedynamic8451_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a59fcae0fae5_invokedynamic8451_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_36(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a2f30d9a2ec6_invokedynamic8372_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4788_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral10260_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_72315f9b5253_invokedynamic983_12(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_72315f9b5253_invokedynamic983_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_27(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_72315f9b5253_invokedynamic983_31(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_72315f9b5253_invokedynamic983_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_172(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_179(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_192(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_196(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_200(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_201(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_202(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_206(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_207(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_209(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_210(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_211(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_212(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_225(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_226(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_227(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_228(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_229(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_231(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_232(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_233(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_235(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_72315f9b5253_invokedynamic983_236(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de35682d228a_originalDynamicSite1777_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de35682d228a_originalDynamicSite1777_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de35682d228a_originalDynamicSite1777_14(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
