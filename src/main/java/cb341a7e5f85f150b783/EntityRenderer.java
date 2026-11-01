package net.minecraft.client.renderer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityRenderer implements net.minecraft.client.resources.IResourceManagerReloadListener {

private static org.apache.logging.log4j.Logger a;

private static moom.DD b;

private static moom.DD c;

private static moom.DD[] d;

public static int e;

public static boolean f;

public static int g;

private net.minecraft.client.Minecraft h;

private moom.oR i;

private java.util.Random j;

private net.minecraft.client.gui.MapItemRenderer k;

private float l;

private boolean m;

private boolean n;

private moom.n3 o;

private int[] p;

private moom.DD q;

private float[] r;

private float[] s;

private java.nio.FloatBuffer t;

private int u;

private boolean v;

private double w;

private boolean x;

private net.minecraft.client.shader.ShaderGroup[] y;

public moom.lm z;

public float A;

public float B;

public float C;

public int D;

public boolean E;

private float F;

private int G;

private net.minecraft.entity.Entity H;

private net.minecraft.util.MouseFilter I;

private net.minecraft.util.MouseFilter J;

private float K;

private float L;

private float M;

private float N;

private float O;

private float P;

private float Q;

private float R;

private float S;

private float T;

private boolean U;

private long V;

private long W;

private boolean X;

private float Y;

private float Z;

private int aa;

private float ab;

private float ac;

private double ad;

private double ae;

private net.minecraft.client.shader.ShaderGroup af;

private int ag;

private boolean ah;

private boolean ai;

private net.minecraft.world.World aj;

private float ak;

private long al;

private int am;

private int an;

private int ao;

private float ap;

private float aq;

private boolean ar;

private com.moon.nW as;

private static long bb;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

private static long[] fb;

private static java.lang.Long[] gb;

private static java.util.Map hb;

public EntityRenderer(net.minecraft.client.Minecraft p0, moom.oR p1) { super(); }

private static void __sourceConstructorBody_da8374cdc0187020(net.minecraft.client.renderer.EntityRenderer receiver, net.minecraft.client.Minecraft p0, moom.oR p1) throws Throwable {
long local3_life1 = (net.minecraft.client.renderer.EntityRenderer.bb ^ 132915703725973L);
    net.minecraft.client.renderer.EntityRenderer.__sourceConstructorInit_da8374cdc0187020_0(((net.minecraft.client.renderer.EntityRenderer)(receiver)));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).j = ((java.util.Random)(new java.util.Random()));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).l = ((float)(0x1.0p2f));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).m = ((boolean)(true));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).n = ((boolean)(true));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).r = ((float[])(new float[__sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_7(20713, (4543733590363573009L ^ local3_life1))]));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).s = ((float[])(new float[__sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_9(22745, (3896430172459664198L ^ local3_life1))]));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).t = ((java.nio.FloatBuffer)(net.minecraft.client.renderer.GLAllocation.a__FloatBuffer(((int)(__sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_11(5478, (2055926695815696126L ^ local3_life1)))))));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).u = ((int)(0));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).v = ((boolean)(false));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).w = ((double)(0x1.0p0d));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).x = ((boolean)(false));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).y = ((net.minecraft.client.shader.ShaderGroup[])(new net.minecraft.client.shader.ShaderGroup[__sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_18(2528, (4029240570305040912L ^ local3_life1))]));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).E = ((boolean)(false));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).I = ((net.minecraft.util.MouseFilter)(new net.minecraft.util.MouseFilter()));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).J = ((net.minecraft.util.MouseFilter)(new net.minecraft.util.MouseFilter()));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).K = ((float)(0x1.0p2f));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).V = ((long)(net.minecraft.client.Minecraft.a__Long()));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).ai = ((boolean)(false));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).aj = ((net.minecraft.world.World)(null));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).ak = ((float)(0x1.0p7f));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).al = ((long)(0L));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).am = ((int)(0));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).an = ((int)(0));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).ao = ((int)(0));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).ap = ((float)(0x0.0p0f));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).aq = ((float)(0x0.0p0f));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).ar = ((boolean)(false));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).as = ((com.moon.nW)(new com.moon.nW()));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).ag = ((int)(net.minecraft.client.renderer.EntityRenderer.e));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).ah = ((boolean)(false));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).D = ((int)(0));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).h = ((net.minecraft.client.Minecraft)(p0));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).i = ((moom.oR)(p1));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).z = ((moom.lm)(((net.minecraft.client.Minecraft)(p0)).a__lm()));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).k = ((net.minecraft.client.gui.MapItemRenderer)(new net.minecraft.client.gui.MapItemRenderer(((net.minecraft.client.Minecraft)(p0)).a__ok())));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).o = ((moom.n3)(new moom.n3(__sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_47(5478, (2055926695815696126L ^ local3_life1)), __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_48(5478, (2055926695815696126L ^ local3_life1)))));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).q = ((moom.DD)(((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(p0)).a__ok())).a(((java.lang.String)("lightMap")), ((moom.n3)(((net.minecraft.client.renderer.EntityRenderer)(receiver)).o)))));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).p = ((int[])(__sourceExactCall_d0385b7c81a8a4(((moom.n3)(((net.minecraft.client.renderer.EntityRenderer)(receiver)).o)))));
    ((net.minecraft.client.renderer.EntityRenderer)(receiver)).af = ((net.minecraft.client.shader.ShaderGroup)(null));
    int local5_life58 = 0;
    while ((local5_life58 < __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_59(17511, (3918231512834023342L ^ local3_life1)))) {
        int local6_life60 = 0;
        while ((local6_life60 < __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_61(17511, (3918231512834023342L ^ local3_life1)))) {
        float local7_life63 = ((float) (local6_life60 - __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_62(5478, (2055926695815696126L ^ local3_life1))));
        float local8_life65 = ((float) (local5_life58 - __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_64(5478, (2055926695815696126L ^ local3_life1))));
        float local9_life67 = moom.Dr.c(((float)(((local7_life63 * local7_life63) + (local8_life65 * local8_life65)))));
        (((net.minecraft.client.renderer.EntityRenderer)(receiver)).r)[((local5_life58 << 5) | local6_life60)] = ((-local8_life65) / local9_life67);
        (((net.minecraft.client.renderer.EntityRenderer)(receiver)).s)[((local5_life58 << 5) | local6_life60)] = (local7_life63 / local9_life67);
        local6_life60 += 1;
    }
        local5_life58 += 1;
    }
    return;
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(2750945865847148817L)), ((long)(-1933620666084625788L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(112664025640533L)))));
    long local22_life6 = (net.minecraft.client.renderer.EntityRenderer.bb ^ 13652118750094L);
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill1323_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1323_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1323_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1323_14 = new byte[8];
    (__sourceSpill1323_14)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill1323_14)[local12_life15] = ((byte) ((int) ((local22_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation1323_16 = __sourceSpill1323_14;
    ((javax.crypto.Cipher)(__sourceSpill1323_11)).init(((int)(__sourceSpill1323_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1323_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1323_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life19 = new long[95];
    int local14_life20 = 0;
    java.lang.String local15_life21;
    int local16_life23 = ((java.lang.String)((local15_life21 = "\016\n£ÌW·Ìþ4¤å%Û$0ROÒ\007TÄ`.I·Å¨â$ÀáÕ\031Å'%qèþÊ÷'0ýáM\n*ñs¸l±p¼·íýRm\013×Õ!\000ÛpÔö67ÙL\bu°¡»9GÃ É¥ÇË\027a¿µ~Ò\033òèð\\X£ûq\013iÙè*Dªú\026únªµ-4eZ¾n4UþP«sf\024­9®\023-ögQ5\001tì6\007Iëk\022ïò\017Òë:òd1ªõ°üÓ3q2¡þ\004B\017\001Ô­\nNdjX%L¾;N¦<IÑÁ°N¨hû\001\027íBTÄn÷%¥3V .ñ'­\006¡fÒâY&,»[0@D·3}åÈïÁ¹YEû=*º¥q~àÏ}N6²Ùÿ¸æ\n¶¶úÆÓ\026¾ôÓ¸¬R¤õ¦\037vÊ¹Îrnf\fã*ö ¸qy%¯×f©\027WzÅ\tË\004ôs­JÊO\006tË\003g\000*Ê\001\f3\032Xa\026®\005Å/Ç¥×+¸³©£&Ø#Sj¹É=a¶ïðõE«üö\0079ã±½Å\000ØGìé\022VÏ\034KÇd\013ò\035aY.ÅèmGü\tøAù\003¦\007\020AÂÒ\006\033\\ýEæóíRIõ\tÈè|\001çQ}o\nJ8\004kP+­\034ïÇ`_(®Æöºpãâ»I\t*\002ÕV1\031o¹×>Î_ZÜ~ ëo®\017ðoªÖ©\013'¯Û[M\027\031èG¥\033\016\004Èò\1773X6a\bV\031<JNf)<Ýúâ}\031¡áÔ\034ªkGðrÈ§UkyE<sûO\0249è\033²Ì}DÊbþ÷i\007|%¶<~\177q\026$kó\026H©Ñ¸éÒ\006Áÿî)\021KcÁµSUìGý%Ñ;>ð]$Ëy\034l\fâ\006\b×ÓÕ\\ÿ\0000¬\006\006lÔÝ\035£â\026-aÉ9j0M=\016\0262Ã»~_°\";¤\031é\035û¿\004Dº;t!Íîþl> *`n.Ö\025d\013\021¡í\003\001Û¥:J9#ÙrÝs\000ûãQYìÿö\024ËJË¥V5"))).length();
    int local13_life24 = 0;
    do {
        java.lang.String __sourceSpill1323_25 = local15_life21;
        int __sourceSpill1323_26 = local13_life24;
        local13_life24 += 8;
        byte[] local18_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1323_25)).substring(((int)(__sourceSpill1323_26)), ((int)(local13_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1323_30 = local17_life19;
        int __sourceSpill1323_31 = local14_life20;
        local14_life20 += 1;
        long local19_life32 = (((((((((((long) (local18_life29)[0]) & 255L) << 56) | ((((long) (local18_life29)[1]) & 255L) << 48)) | ((((long) (local18_life29)[2]) & 255L) << 40)) | ((((long) (local18_life29)[3]) & 255L) << 32)) | ((((long) (local18_life29)[4]) & 255L) << 24)) | ((((long) (local18_life29)[5]) & 255L) << 16)) | ((((long) (local18_life29)[6]) & 255L) << 8)) | (((long) (local18_life29)[7]) & 255L));
        byte[] __sourceSpill1323_33 = new byte[8];
        (__sourceSpill1323_33)[0] = ((byte) ((int) (local19_life32 >>> 56)));
        (__sourceSpill1323_33)[1] = ((byte) ((int) (local19_life32 >>> 48)));
        (__sourceSpill1323_33)[2] = ((byte) ((int) (local19_life32 >>> 40)));
        (__sourceSpill1323_33)[3] = ((byte) ((int) (local19_life32 >>> 32)));
        (__sourceSpill1323_33)[4] = ((byte) ((int) (local19_life32 >>> 24)));
        (__sourceSpill1323_33)[5] = ((byte) ((int) (local19_life32 >>> 16)));
        (__sourceSpill1323_33)[6] = ((byte) ((int) (local19_life32 >>> 8)));
        (__sourceSpill1323_33)[7] = ((byte) ((int) local19_life32));
        javax.crypto.Cipher __sourceSpill1323_34 = local11_life9;
        byte[] local21_life36 = ((javax.crypto.Cipher)(__sourceSpill1323_34)).doFinal(((byte[])(__sourceSpill1323_33)));
        (__sourceSpill1323_30)[__sourceSpill1323_31] = (((((((((((long) (local21_life36)[0]) & 255L) << 56) | ((((long) (local21_life36)[1]) & 255L) << 48)) | ((((long) (local21_life36)[2]) & 255L) << 40)) | ((((long) (local21_life36)[3]) & 255L) << 32)) | ((((long) (local21_life36)[4]) & 255L) << 24)) | ((((long) (local21_life36)[5]) & 255L) << 16)) | ((((long) (local21_life36)[6]) & 255L) << 8)) | (((long) (local21_life36)[7]) & 255L));
    } while ((!(local13_life24 >= local16_life23)));
    local16_life23 = ((java.lang.String)((local15_life21 = "ÎYñò1[ ü<~~ã²ä¿o"))).length();
    local13_life24 = 0;
    do {
        java.lang.String __sourceSpill1323_38 = local15_life21;
        int __sourceSpill1323_39 = local13_life24;
        local13_life24 += 8;
        byte[] local18_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1323_38)).substring(((int)(__sourceSpill1323_39)), ((int)(local13_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1323_43 = local17_life19;
        int __sourceSpill1323_44 = local14_life20;
        local14_life20 += 1;
        long local19_life45 = (((((((((((long) (local18_life42)[0]) & 255L) << 56) | ((((long) (local18_life42)[1]) & 255L) << 48)) | ((((long) (local18_life42)[2]) & 255L) << 40)) | ((((long) (local18_life42)[3]) & 255L) << 32)) | ((((long) (local18_life42)[4]) & 255L) << 24)) | ((((long) (local18_life42)[5]) & 255L) << 16)) | ((((long) (local18_life42)[6]) & 255L) << 8)) | (((long) (local18_life42)[7]) & 255L));
        byte[] __sourceSpill1323_46 = new byte[8];
        (__sourceSpill1323_46)[0] = ((byte) ((int) (local19_life45 >>> 56)));
        (__sourceSpill1323_46)[1] = ((byte) ((int) (local19_life45 >>> 48)));
        (__sourceSpill1323_46)[2] = ((byte) ((int) (local19_life45 >>> 40)));
        (__sourceSpill1323_46)[3] = ((byte) ((int) (local19_life45 >>> 32)));
        (__sourceSpill1323_46)[4] = ((byte) ((int) (local19_life45 >>> 24)));
        (__sourceSpill1323_46)[5] = ((byte) ((int) (local19_life45 >>> 16)));
        (__sourceSpill1323_46)[6] = ((byte) ((int) (local19_life45 >>> 8)));
        (__sourceSpill1323_46)[7] = ((byte) ((int) local19_life45));
        javax.crypto.Cipher __sourceSpill1323_47 = local11_life9;
        byte[] local21_life49 = ((javax.crypto.Cipher)(__sourceSpill1323_47)).doFinal(((byte[])(__sourceSpill1323_46)));
        (__sourceSpill1323_43)[__sourceSpill1323_44] = (((((((((((long) (local21_life49)[0]) & 255L) << 56) | ((((long) (local21_life49)[1]) & 255L) << 48)) | ((((long) (local21_life49)[2]) & 255L) << 40)) | ((((long) (local21_life49)[3]) & 255L) << 32)) | ((((long) (local21_life49)[4]) & 255L) << 24)) | ((((long) (local21_life49)[5]) & 255L) << 16)) | ((((long) (local21_life49)[6]) & 255L) << 8)) | (((long) (local21_life49)[7]) & 255L));
    } while ((!(local13_life24 >= local16_life23)));
    cb = ((long[])(local17_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[95]));
    hb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill1323_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1323_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1323_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1323_59 = new byte[8];
    (__sourceSpill1323_59)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill1323_59)[local1_life60] = ((byte) ((int) ((local22_life6 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation1323_61 = __sourceSpill1323_59;
    ((javax.crypto.Cipher)(__sourceSpill1323_56)).init(((int)(__sourceSpill1323_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1323_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1323_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[14];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "F !\035\033Ê¢\020R\026«¼ÃÃ*÷a\036ò¹>mYßð?ÝÁ ;nC´J¯}áûSÑ·\nÜÿ\005¹k[ü{\035¤\017GxS\001Q«BÖÉª*ÈêgÀ¥H­\003l¢KàöJÕ\f\035ä£Eþ"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1323_70 = local4_life66;
        int __sourceSpill1323_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1323_70)).substring(((int)(__sourceSpill1323_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1323_75 = local6_life64;
        int __sourceSpill1323_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill1323_78 = new byte[8];
        (__sourceSpill1323_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill1323_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill1323_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill1323_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill1323_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill1323_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill1323_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill1323_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill1323_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1323_79)).doFinal(((byte[])(__sourceSpill1323_78)));
        (__sourceSpill1323_75)[__sourceSpill1323_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    local5_life68 = ((java.lang.String)((local4_life66 = "\"Á¼öf\020gIe|>q"))).length();
    local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1323_83 = local4_life66;
        int __sourceSpill1323_84 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill1323_83)).substring(((int)(__sourceSpill1323_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1323_88 = local6_life64;
        int __sourceSpill1323_89 = local3_life65;
        local3_life65 += 1;
        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));
        byte[] __sourceSpill1323_91 = new byte[8];
        (__sourceSpill1323_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));
        (__sourceSpill1323_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));
        (__sourceSpill1323_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));
        (__sourceSpill1323_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));
        (__sourceSpill1323_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));
        (__sourceSpill1323_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));
        (__sourceSpill1323_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));
        (__sourceSpill1323_91)[7] = ((byte) ((int) local8_life90));
        javax.crypto.Cipher __sourceSpill1323_92 = local0_life54;
        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill1323_92)).doFinal(((byte[])(__sourceSpill1323_91)));
        (__sourceSpill1323_88)[__sourceSpill1323_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    fb = ((long[])(local6_life64));
    gb = ((java.lang.Long[])(new java.lang.Long[14]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((moom.DD)(new moom.DD("textures/environment/rain.png")));
    c = ((moom.DD)(new moom.DD("textures/environment/snow.png")));
    moom.DD[] __sourceSpill1323_102 = new moom.DD[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_101(30168, (3663418527616193103L ^ local22_life6))];
    (__sourceSpill1323_102)[0] = new moom.DD("shaders/post/notch.json");
    (__sourceSpill1323_102)[1] = new moom.DD("shaders/post/fxaa.json");
    (__sourceSpill1323_102)[2] = new moom.DD("shaders/post/art.json");
    (__sourceSpill1323_102)[3] = new moom.DD("shaders/post/bumpy.json");
    (__sourceSpill1323_102)[4] = new moom.DD("shaders/post/blobs2.json");
    (__sourceSpill1323_102)[5] = new moom.DD("shaders/post/pencil.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_103(30773, (1617038271062958063L ^ local22_life6))] = new moom.DD("shaders/post/color_convolve.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_104(32254, (4803600109596727856L ^ local22_life6))] = new moom.DD("shaders/post/deconverge.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_105(27870, (8135850949849140057L ^ local22_life6))] = new moom.DD("shaders/post/flip.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_106(16859, (4399724477096617529L ^ local22_life6))] = new moom.DD("shaders/post/invert.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_107(2528, (4029253247568031243L ^ local22_life6))] = new moom.DD("shaders/post/ntsc.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_108(23850, (2228197565591059114L ^ local22_life6))] = new moom.DD("shaders/post/outline.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_109(24075, (5629930714513996275L ^ local22_life6))] = new moom.DD("shaders/post/phosphor.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_110(6689, (1357241987076308417L ^ local22_life6))] = new moom.DD("shaders/post/scan_pincushion.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_111(19079, (644290894917332347L ^ local22_life6))] = new moom.DD("shaders/post/sobel.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_112(27858, (8398689542150867744L ^ local22_life6))] = new moom.DD("shaders/post/bits.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_113(5478, (2056010772892889829L ^ local22_life6))] = new moom.DD("shaders/post/desaturate.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_114(17593, (1306868708936868649L ^ local22_life6))] = new moom.DD("shaders/post/green.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_115(16180, (8174988023153924329L ^ local22_life6))] = new moom.DD("shaders/post/blur.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_116(14765, (5395064531023470127L ^ local22_life6))] = new moom.DD("shaders/post/wobble.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_117(30288, (5977697505399165368L ^ local22_life6))] = new moom.DD("shaders/post/blobs.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_118(6696, (4311389832420965792L ^ local22_life6))] = new moom.DD("shaders/post/antialias.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_119(17939, (86265635228246521L ^ local22_life6))] = new moom.DD("shaders/post/creeper.json");
    (__sourceSpill1323_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_120(25391, (1584097973531722915L ^ local22_life6))] = new moom.DD("shaders/post/spider.json");
    d = ((moom.DD[])(__sourceSpill1323_102));
    e = ((int)((net.minecraft.client.renderer.EntityRenderer.d).length));
}

private static native <E extends Throwable> void __sourceConstructorInit_da8374cdc0187020_0(net.minecraft.client.renderer.EntityRenderer a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_a5686e6a18c5d8674fdc(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws E;
private static final class __SourceHandler_a5686e6a18c5d8674fdc {

public static void f579(net.minecraft.client.renderer.EntityRenderer receiver, float p0) throws Throwable {
    moom.DR forestValue579_243_0;
    long life2_3;
    net.minecraft.entity.Entity life4_7;
    double life5_29;
    double life7_57;
    moom.DR life9_61;
    int life10_63;
    int life11_65;
    com.moon.eD life12_88;
    moom.DR life13_114;
    moom.DR life14_129;
    moom.DR life15_134;
    float life16_136;
    java.util.List life17_167;
    double life18_169;
    java.util.Iterator life20_172;
    net.minecraft.entity.Entity life21_179;
    float life22_201;
    com.moon.es life23_206;
    float life22_213;
    moom.CA life24_223;
    net.minecraft.util.MovingObjectPosition life25_228;
    double life26_258;
    int life28_269;
    com.moon.eD life20_304;
    forest_join_366: {
    forest_join_362: {
    forest_join_357: {
    forest_join_340: {
    forest_join_329: {
    forest_join_290: {
    forest_join_108: {
    forest_join_97: {
    forest_join_79: {
    forest_join_73: {
    forest_join_46: {
    forest_join_44: {
    life2_3 = (__fieldRead579_0() ^ 20077391682202L);
    life4_7 = __call579_2(__fieldRead579_1(receiver));
    if (!((life4_7 != null))) {
        break forest_join_366;
    }
    if (!((__fieldRead579_4(__fieldRead579_3(receiver)) != null))) {
        break forest_join_366;
    }
    __call579_7(__fieldRead579_6(__fieldRead579_5(receiver)), "pick");
    __fieldWrite579_9(__fieldRead579_8(receiver), null);
    life5_29 = ((double) __call579_12(__fieldRead579_11(__fieldRead579_10(receiver))));
    if (!(__call579_15(__fieldRead579_13(receiver), __invokedynamic579_14(13200, (6710049775598654753L ^ life2_3))))) {
        break forest_join_46;
    }
    if (!((__fieldRead579_16() != null))) {
        break forest_join_44;
    }
    if (!((!__call579_18(__fieldRead579_17(), "NOTHINGHERE")))) {
        break forest_join_46;
    }
    }
    life5_29 = 0x0.0p0d;
    }
    __fieldWrite579_21(__fieldRead579_19(receiver), __call579_20(life4_7, life5_29, p0));
    life7_57 = life5_29;
    life9_61 = __call579_22(life4_7, p0);
    life10_63 = 0;
    life11_65 = 3;
    if (!(__call579_25(__fieldRead579_24(__fieldRead579_23(receiver))))) {
        break forest_join_73;
    }
    life5_29 = 0x1.8p2d;
    life7_57 = 0x1.8p2d;
    break forest_join_79;
    }
    if (!((__numericCompare579_26(life5_29, 0x1.8p1d) > 0))) {
        break forest_join_79;
    }
    life10_63 = 1;
    }
    life12_88 = new com.moon.eD(life5_29, __fieldRead579_27(receiver));
    __call579_30(__call579_29(__call579_28()), life12_88);
    if (!((__numericCompare579_32(__call579_31(life12_88), 0x1.2p2d) > 0))) {
        break forest_join_97;
    }
    life5_29 = 0x1.8p2d;
    }
    if (!((__fieldRead579_34(__fieldRead579_33(receiver)) != null))) {
        break forest_join_108;
    }
    life7_57 = __call579_38(__fieldRead579_37(__fieldRead579_36(__fieldRead579_35(receiver))), life9_61);
    }
    life13_114 = __call579_39(life4_7, p0);
    life14_129 = __call579_43(life9_61, (__fieldRead579_40(life13_114) * life5_29), (__fieldRead579_41(life13_114) * life5_29), (__fieldRead579_42(life13_114) * life5_29));
    __fieldWrite579_44(receiver, null);
    life15_134 = null;
    life16_136 = 0x1.0p0f;
    life17_167 = __call579_56(__fieldRead579_46(__fieldRead579_45(receiver)), life4_7, __call579_52(__call579_51(__call579_47(life4_7), (__fieldRead579_48(life13_114) * life5_29), (__fieldRead579_49(life13_114) * life5_29), (__fieldRead579_50(life13_114) * life5_29)), ((double) life16_136), ((double) life16_136), ((double) life16_136)), __call579_55(__fieldRead579_53(), __invokedynamic579_54()));
    life18_169 = life7_57;
    life20_172 = __call579_57(life17_167);
    forest_cycle_170: while (true) {
    forest_join_289: {
    forest_join_281: {
    forest_join_262: {
    forest_join_247: {
    forest_join_243: {
    forest_join_241: {
    forest_join_196: {
    if (!(__call579_58(life20_172))) {
        break forest_join_290;
    }
    life21_179 = __cast579_60(__call579_59(life20_172));
    if (!((__call579_61(life21_179) != __invokedynamic579_62(26087, (5549011319960673086L ^ life2_3))))) {
        continue forest_cycle_170;
    }
    if (!((__call579_63(life21_179) != __invokedynamic579_64(28626, (8817766882241876271L ^ life2_3))))) {
        continue forest_cycle_170;
    }
    if (!((__fieldRead579_65() == null))) {
        break forest_join_196;
    }
    continue forest_cycle_170;
    }
    life22_201 = __call579_66(life21_179);
    life23_206 = new com.moon.es(life22_201);
    __call579_69(__call579_68(__call579_67()), life23_206);
    life22_213 = __call579_70(life23_206);
    life24_223 = __call579_72(__call579_71(life21_179), ((double) life22_213), ((double) life22_213), ((double) life22_213));
    life25_228 = __call579_73(life24_223, life9_61, life14_129);
    if (!(__call579_74(life24_223, life9_61))) {
        break forest_join_247;
    }
    if (!((__numericCompare579_75(life18_169, 0x0.0p0d) >= 0))) {
        break forest_join_289;
    }
    __fieldWrite579_76(receiver, life21_179);
    if (!((life25_228 == null))) {
        break forest_join_241;
    }
    forestValue579_243_0 = life9_61;
    break forest_join_243;
    }
    forestValue579_243_0 = __fieldRead579_77(life25_228);
    }
    life15_134 = forestValue579_243_0;
    life18_169 = 0x0.0p0d;
    break forest_join_289;
    }
    if (!((life25_228 != null))) {
        break forest_join_289;
    }
    life26_258 = __call579_79(life9_61, __fieldRead579_78(life25_228));
    if (!((__numericCompare579_80(life26_258, life18_169) >= 0))) {
        break forest_join_262;
    }
    if (!((__numericCompare579_81(life18_169, 0x0.0p0d) == 0))) {
        break forest_join_289;
    }
    }
    life28_269 = 0;
    if (!((life28_269 == 0))) {
        break forest_join_281;
    }
    if (!((life21_179 == __fieldRead579_82(life4_7)))) {
        break forest_join_281;
    }
    if (!((__numericCompare579_83(life18_169, 0x0.0p0d) == 0))) {
        break forest_join_289;
    }
    __fieldWrite579_84(receiver, life21_179);
    life15_134 = __fieldRead579_85(life25_228);
    break forest_join_289;
    }
    __fieldWrite579_86(receiver, life21_179);
    life15_134 = __fieldRead579_87(life25_228);
    life18_169 = life26_258;
    }
    continue forest_cycle_170;
    }
    }
    life20_304 = new com.moon.eD(0x1.8p1d, __fieldRead579_88(receiver));
    __call579_91(__call579_90(__call579_89()), life20_304);
    if (!((__fieldRead579_92(receiver) != null))) {
        break forest_join_329;
    }
    if (!((life10_63 != 0))) {
        break forest_join_329;
    }
    if (!((__numericCompare579_95(__call579_93(life9_61, life15_134), __call579_94(life20_304)) > 0))) {
        break forest_join_329;
    }
    __fieldWrite579_96(receiver, null);
    __fieldWrite579_99(__fieldRead579_97(receiver), new net.minecraft.util.MovingObjectPosition(__fieldRead579_98(), life15_134, null, new moom.DT(life15_134)));
    }
    if (!((__fieldRead579_100(receiver) != null))) {
        break forest_join_362;
    }
    if (!((__numericCompare579_101(life18_169, life7_57) >= 0))) {
        break forest_join_340;
    }
    if (!((__fieldRead579_103(__fieldRead579_102(receiver)) == null))) {
        break forest_join_362;
    }
    }
    __fieldWrite579_106(__fieldRead579_104(receiver), new net.minecraft.util.MovingObjectPosition(__fieldRead579_105(receiver), life15_134));
    if (!((__instanceOf579_108(__fieldRead579_107(receiver)) == 0))) {
        break forest_join_357;
    }
    if (!((__instanceOf579_110(__fieldRead579_109(receiver)) != 0))) {
        break forest_join_362;
    }
    }
    __fieldWrite579_113(__fieldRead579_111(receiver), __fieldRead579_112(receiver));
    }
    __call579_116(__fieldRead579_115(__fieldRead579_114(receiver)));
    }
    return;
}
public static void h579_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057900_0(p0);
}
public static void h579_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057901_0(p0);
}
public static void h579_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057902_0(p0);
}
public static void h579_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057903_0(p0);
}
public static void h579_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057904_0(p0);
}
public static void h579_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057905_0(p0);
}
public static void h579_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057906_0(p0);
}
public static void h579_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057907_0(p0);
}
public static void h579_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057908_0(p0);
}
public static void h579_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057909_0(p0);
}
public static void h579_10(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057910_0(p0);
}
public static void h579_11(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057911_0(p0);
}
public static void h579_12(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057912_0(p0);
}
public static void h579_13(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057913_0(p0);
}
public static void h579_14(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057914_0(p0);
}
public static void h579_15(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057915_0(p0);
}
public static void h579_16(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057916_0(p0);
}
public static void h579_17(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3057917_0(p0);
}
private static native long __fieldRead579_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call579_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_3(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead579_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_5(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead579_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call579_7(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite579_9(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_10(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.jI __fieldRead579_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call579_12(moom.jI a0) throws Throwable;
private static native com.moon.nW __fieldRead579_13(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native long __invokedynamic579_14(int a0, long a1) throws Throwable;
private static native boolean __call579_15(com.moon.nW a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead579_16() throws Throwable;
private static native java.lang.String __fieldRead579_17() throws Throwable;
private static native boolean __call579_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_19(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __call579_20(net.minecraft.entity.Entity a0, double a1, float a2) throws Throwable;
private static native void __fieldWrite579_21(net.minecraft.client.Minecraft a0, net.minecraft.util.MovingObjectPosition a1) throws Throwable;
private static native moom.DR __call579_22(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_23(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.jI __fieldRead579_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call579_25(moom.jI a0) throws Throwable;
private static native int __numericCompare579_26(double a0, double a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead579_27(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call579_28() throws Throwable;
private static native com.moon.events.EventBus __call579_29(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call579_30(com.moon.events.EventBus a0, com.moon.eD a1) throws Throwable;
private static native double __call579_31(com.moon.eD a0) throws Throwable;
private static native int __numericCompare579_32(double a0, double a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_33(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead579_34(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_35(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead579_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DR __fieldRead579_37(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native double __call579_38(moom.DR a0, moom.DR a1) throws Throwable;
private static native moom.DR __call579_39(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native double __fieldRead579_40(moom.DR a0) throws Throwable;
private static native double __fieldRead579_41(moom.DR a0) throws Throwable;
private static native double __fieldRead579_42(moom.DR a0) throws Throwable;
private static native moom.DR __call579_43(moom.DR a0, double a1, double a2, double a3) throws Throwable;
private static native void __fieldWrite579_44(net.minecraft.client.renderer.EntityRenderer a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_45(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead579_46(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.CA __call579_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead579_48(moom.DR a0) throws Throwable;
private static native double __fieldRead579_49(moom.DR a0) throws Throwable;
private static native double __fieldRead579_50(moom.DR a0) throws Throwable;
private static native moom.CA __call579_51(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native moom.CA __call579_52(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead579_53() throws Throwable;
private static native com.google.common.base.Predicate __invokedynamic579_54() throws Throwable;
private static native com.google.common.base.Predicate __call579_55(com.google.common.base.Predicate a0, com.google.common.base.Predicate a1) throws Throwable;
private static native java.util.List __call579_56(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1, moom.CA a2, com.google.common.base.Predicate a3) throws Throwable;
private static native java.util.Iterator __call579_57(java.util.List a0) throws Throwable;
private static native boolean __call579_58(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call579_59(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast579_60(java.lang.Object a0) throws Throwable;
private static native int __call579_61(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic579_62(int a0, long a1) throws Throwable;
private static native int __call579_63(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic579_64(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead579_65() throws Throwable;
private static native float __call579_66(net.minecraft.entity.Entity a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call579_67() throws Throwable;
private static native com.moon.events.EventBus __call579_68(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call579_69(com.moon.events.EventBus a0, com.moon.es a1) throws Throwable;
private static native float __call579_70(com.moon.es a0) throws Throwable;
private static native moom.CA __call579_71(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call579_72(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __call579_73(moom.CA a0, moom.DR a1, moom.DR a2) throws Throwable;
private static native boolean __call579_74(moom.CA a0, moom.DR a1) throws Throwable;
private static native int __numericCompare579_75(double a0, double a1) throws Throwable;
private static native void __fieldWrite579_76(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native moom.DR __fieldRead579_77(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native moom.DR __fieldRead579_78(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native double __call579_79(moom.DR a0, moom.DR a1) throws Throwable;
private static native int __numericCompare579_80(double a0, double a1) throws Throwable;
private static native int __numericCompare579_81(double a0, double a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead579_82(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare579_83(double a0, double a1) throws Throwable;
private static native void __fieldWrite579_84(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native moom.DR __fieldRead579_85(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native void __fieldWrite579_86(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native moom.DR __fieldRead579_87(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead579_88(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call579_89() throws Throwable;
private static native com.moon.events.EventBus __call579_90(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call579_91(com.moon.events.EventBus a0, com.moon.eD a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead579_92(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native double __call579_93(moom.DR a0, moom.DR a1) throws Throwable;
private static native double __call579_94(com.moon.eD a0) throws Throwable;
private static native int __numericCompare579_95(double a0, double a1) throws Throwable;
private static native void __fieldWrite579_96(net.minecraft.client.renderer.EntityRenderer a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_97(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead579_98() throws Throwable;
private static native void __fieldWrite579_99(net.minecraft.client.Minecraft a0, net.minecraft.util.MovingObjectPosition a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead579_100(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __numericCompare579_101(double a0, double a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_102(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead579_103(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_104(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead579_105(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite579_106(net.minecraft.client.Minecraft a0, net.minecraft.util.MovingObjectPosition a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead579_107(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __instanceOf579_108(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead579_109(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __instanceOf579_110(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_111(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead579_112(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite579_113(net.minecraft.client.Minecraft a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead579_114(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead579_115(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call579_116(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call3057900_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057901_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057902_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057903_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057904_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057905_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057906_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057907_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057908_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057909_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057910_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057911_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057912_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057913_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057914_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057915_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057916_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3057917_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_937a3cc8e85d58b1cb3e(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2) throws E;
private static final class __SourceHandler_937a3cc8e85d58b1cb3e {

public static void f580(net.minecraft.client.renderer.EntityRenderer receiver, float p0, int p1) throws Throwable {
    double spill580_0;
    long life3_3;
    float life5_43;
    float life6_173;
    int life7_183;
    float life8_207;
    float life8_211;
    forest_join_236: {
    forest_join_189: {
    forest_join_150: {
    forest_join_139: {
    forest_join_99: {
    forest_join_73: {
    forest_join_59: {
    forest_join_33: {
    forest_join_25: {
    life3_3 = (__fieldRead580_0() ^ 34971553245296L);
    __fieldWrite580_5(receiver, ((float) (__fieldRead580_3(__fieldRead580_2(__fieldRead580_1(receiver))) * __invokedynamic580_4(5478, (2056026559874750747L ^ life3_3)))));
    if (!(__call580_6())) {
        break forest_join_25;
    }
    net.minecraft.client.renderer.EntityRenderer __stackOp580_7_0 = receiver;
    __fieldWrite580_9(__stackOp580_7_0, (__fieldRead580_8(__stackOp580_7_0) * 0x1.e66666p-1f));
    }
    if (!(__call580_10())) {
        break forest_join_33;
    }
    net.minecraft.client.renderer.EntityRenderer __stackOp580_11_0 = receiver;
    __fieldWrite580_13(__stackOp580_11_0, (__fieldRead580_12(__stackOp580_11_0) * 0x1.a8f5c2p-1f));
    }
    __call580_15(__invokedynamic580_14(22520, (1898602420778081165L ^ life3_3)));
    __call580_16();
    life5_43 = 0x1.1eb852p-4f;
    if (!(__fieldRead580_19(__fieldRead580_18(__fieldRead580_17(receiver))))) {
        break forest_join_59;
    }
    __call580_20((((float) (-((p1 * 2) - 1))) * life5_43), 0x0.0p0f, 0x0.0p0f);
    }
    __fieldWrite580_22(receiver, (__fieldRead580_21(receiver) * 0x1.0p1f));
    if (!((__numericCompare580_24(__fieldRead580_23(receiver), 0x1.5ap7f) < 0))) {
        break forest_join_73;
    }
    __fieldWrite580_25(receiver, 0x1.5ap7f);
    }
    __call580_26(receiver);
    if (!((__numericCompare580_27(0x1.0p0d, 0x1.0p0d) != 0))) {
        break forest_join_99;
    }
    __call580_30(((float) __fieldRead580_28(receiver)), ((float) (-__fieldRead580_29(receiver))), 0x0.0p0f);
    __call580_31(receiver);
    spill580_0 = 0x1.0p0d;
    __call580_32(receiver);
    __call580_33(spill580_0, 0x1.0p0d, 0x1.0p0d);
    }
    __call580_40(__call580_34(receiver, p0, 1), (((float) __fieldRead580_36(__fieldRead580_35(receiver))) / ((float) __fieldRead580_38(__fieldRead580_37(receiver)))), 0x1.99999ap-5f, __fieldRead580_39(receiver));
    __call580_42(__invokedynamic580_41(25934, (8139962278241446263L ^ life3_3)));
    __call580_43();
    if (!(__fieldRead580_46(__fieldRead580_45(__fieldRead580_44(receiver))))) {
        break forest_join_139;
    }
    __call580_47((((float) ((p1 * 2) - 1)) * 0x1.99999ap-4f), 0x0.0p0f, 0x0.0p0f);
    }
    __call580_48(receiver, p0);
    if (!(__fieldRead580_51(__fieldRead580_50(__fieldRead580_49(receiver))))) {
        break forest_join_150;
    }
    __call580_52(receiver, p0);
    }
    life6_173 = (__fieldRead580_55(__fieldRead580_54(__fieldRead580_53(receiver))) + ((__fieldRead580_58(__fieldRead580_57(__fieldRead580_56(receiver))) - __fieldRead580_61(__fieldRead580_60(__fieldRead580_59(receiver)))) * p0));
    if (!((__numericCompare580_62(life6_173, 0x0.0p0f) > 0))) {
        break forest_join_236;
    }
    life7_183 = __invokedynamic580_63(30288, (5977718788349246022L ^ life3_3));
    if (!(__call580_67(__fieldRead580_65(__fieldRead580_64(receiver)), __fieldRead580_66()))) {
        break forest_join_189;
    }
    life7_183 = __invokedynamic580_68(32254, (4803585421574943182L ^ life3_3));
    }
    life8_207 = ((0x1.4p2f / ((life6_173 * life6_173) + 0x1.4p2f)) - (life6_173 * 0x1.47ae14p-5f));
    life8_211 = (life8_207 * life8_207);
    __call580_70(((((float) __fieldRead580_69(receiver)) + p0) * ((float) life7_183)), 0x0.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call580_71((0x1.0p0f / life8_211), 0x1.0p0f, 0x1.0p0f);
    __call580_73(((-(((float) __fieldRead580_72(receiver)) + p0)) * ((float) life7_183)), 0x0.0p0f, 0x1.0p0f, 0x1.0p0f);
    }
    __call580_74(receiver, p0);
    __call580_75(receiver);
    return;
}
public static void h580_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058000_0(p0);
}
public static void h580_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058001_0(p0);
}
public static void h580_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058002_0(p0);
}
public static void h580_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058003_0(p0);
}
public static void h580_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058004_0(p0);
}
public static void h580_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058005_0(p0);
}
public static void h580_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058006_0(p0);
}
private static native long __fieldRead580_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead580_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead580_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead580_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __invokedynamic580_4(int a0, long a1) throws Throwable;
private static native void __fieldWrite580_5(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native boolean __call580_6() throws Throwable;
private static native float __fieldRead580_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite580_9(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native boolean __call580_10() throws Throwable;
private static native float __fieldRead580_12(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite580_13(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native int __invokedynamic580_14(int a0, long a1) throws Throwable;
private static native void __call580_15(int a0) throws Throwable;
private static native void __call580_16() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead580_17(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead580_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead580_19(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call580_20(float a0, float a1, float a2) throws Throwable;
private static native float __fieldRead580_21(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite580_22(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead580_23(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __numericCompare580_24(float a0, float a1) throws Throwable;
private static native void __fieldWrite580_25(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native java.lang.Object __call580_26(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __numericCompare580_27(double a0, double a1) throws Throwable;
private static native double __fieldRead580_28(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native double __fieldRead580_29(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call580_30(float a0, float a1, float a2) throws Throwable;
private static native java.lang.Object __call580_31(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native java.lang.Object __call580_32(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call580_33(double a0, double a1, double a2) throws Throwable;
private static native float __call580_34(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead580_35(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead580_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead580_37(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead580_38(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead580_39(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call580_40(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic580_41(int a0, long a1) throws Throwable;
private static native void __call580_42(int a0) throws Throwable;
private static native void __call580_43() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead580_44(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead580_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead580_46(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call580_47(float a0, float a1, float a2) throws Throwable;
private static native void __call580_48(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead580_49(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead580_50(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead580_51(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call580_52(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead580_53(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead580_54(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead580_55(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead580_56(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead580_57(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead580_58(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead580_59(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead580_60(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead580_61(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __numericCompare580_62(float a0, float a1) throws Throwable;
private static native int __invokedynamic580_63(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead580_64(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead580_65(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead580_66() throws Throwable;
private static native boolean __call580_67(net.minecraft.client.entity.EntityPlayerSP a0, net.minecraft.potion.Potion a1) throws Throwable;
private static native int __invokedynamic580_68(int a0, long a1) throws Throwable;
private static native int __fieldRead580_69(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call580_70(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call580_71(float a0, float a1, float a2) throws Throwable;
private static native int __fieldRead580_72(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call580_73(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call580_74(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native java.lang.Object __call580_75(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native java.lang.Throwable __call3058000_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058001_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058002_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058003_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058004_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058005_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058006_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5deba8c9fdf600886666(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2, boolean a3, boolean a4, boolean a5) throws E;
private static final class __SourceHandler_5deba8c9fdf600886666 {

public static void f1389(net.minecraft.client.renderer.EntityRenderer receiver, float p0, int p1, boolean p2, boolean p3, boolean p4) throws Throwable {
    int forwardValue1389_108_0;
    long life6_3;
    float life8_15;
    int life9_88;
    int life10_162;
    forward_join_197: {
    forward_join_189: {
    forward_join_173: {
    forward_join_170: {
    forward_join_169: {
    forward_join_157: {
    forward_join_153: {
    forward_join_108: {
    forward_join_107: {
    forward_join_94: {
    forward_join_78: {
    forward_join_36: {
    forward_join_33: {
    life6_3 = (__fieldRead1389_0() ^ 106748180321264L);
    __call1389_1(receiver);
    __call1389_3(__invokedynamic1389_2(12123, (7939273539200063731L ^ life6_3)));
    __call1389_4();
    life8_15 = 0x1.1eb852p-4f;
    if (!(__fieldRead1389_7(__fieldRead1389_6(__fieldRead1389_5(receiver))))) {
        break forward_join_33;
    }
    __call1389_8((((float) (-((p1 * 2) - 1))) * life8_15), 0x0.0p0f, 0x0.0p0f);
    }
    if (!(__call1389_9())) {
        break forward_join_36;
    }
    __call1389_10();
    }
    __call1389_17(__call1389_11(receiver, p0, 0), (((float) __fieldRead1389_13(__fieldRead1389_12(receiver))) / ((float) __fieldRead1389_15(__fieldRead1389_14(receiver)))), 0x1.99999ap-5f, (__fieldRead1389_16(receiver) * 0x1.0p1f));
    __call1389_19(__invokedynamic1389_18(25934, (8139845421648663287L ^ life6_3)));
    __call1389_20();
    if (!(__fieldRead1389_23(__fieldRead1389_22(__fieldRead1389_21(receiver))))) {
        break forward_join_78;
    }
    __call1389_24((((float) ((p1 * 2) - 1)) * 0x1.99999ap-4f), 0x0.0p0f, 0x0.0p0f);
    }
    life9_88 = 0;
    if (!(p2)) {
        break forward_join_170;
    }
    __call1389_25();
    __call1389_26(receiver, p0);
    if (!(__fieldRead1389_29(__fieldRead1389_28(__fieldRead1389_27(receiver))))) {
        break forward_join_94;
    }
    __call1389_30(receiver, p0);
    }
    if (!((__instanceOf1389_33(__call1389_32(__fieldRead1389_31(receiver))) != 0))) {
        break forward_join_107;
    }
    if (!(__call1389_37(__cast1389_36(__call1389_35(__fieldRead1389_34(receiver)))))) {
        break forward_join_107;
    }
    forwardValue1389_108_0 = 1;
    break forward_join_108;
    }
    forwardValue1389_108_0 = 0;
    }
    life9_88 = forwardValue1389_108_0;
    if (!((__fieldRead1389_40(__fieldRead1389_39(__fieldRead1389_38(receiver))) == 0))) {
        break forward_join_169;
    }
    if (!((life9_88 == 0))) {
        break forward_join_169;
    }
    if (!((!__fieldRead1389_43(__fieldRead1389_42(__fieldRead1389_41(receiver)))))) {
        break forward_join_169;
    }
    if (!((!__call1389_46(__fieldRead1389_45(__fieldRead1389_44(receiver)))))) {
        break forward_join_169;
    }
    __call1389_47(receiver);
    life10_162 = __invokedynamic1389_48(1608, (8878656318803554753L ^ life6_3));
    __call1389_50(__invokedynamic1389_49(11426, (2474734701803969302L ^ life6_3)));
    __call1389_51(0x0.0p0f, ((float) (-life10_162)));
    if (!(__call1389_52())) {
        break forward_join_153;
    }
    __call1389_54(__fieldRead1389_53(receiver), p0, p4);
    break forward_join_157;
    }
    __call1389_56(__fieldRead1389_55(receiver), p0);
    }
    __call1389_58(__invokedynamic1389_57(1419, (4544275264922333714L ^ life6_3)));
    __call1389_59(0x0.0p0f, ((float) life10_162));
    __call1389_60(receiver);
    }
    __call1389_61();
    }
    if (!((!p3))) {
        break forward_join_173;
    }
    return;
    }
    __call1389_62(receiver);
    if (!((__fieldRead1389_65(__fieldRead1389_64(__fieldRead1389_63(receiver))) == 0))) {
        break forward_join_189;
    }
    if (!((life9_88 == 0))) {
        break forward_join_189;
    }
    __call1389_67(__fieldRead1389_66(receiver), p0);
    __call1389_68(receiver, p0);
    }
    if (!(__fieldRead1389_71(__fieldRead1389_70(__fieldRead1389_69(receiver))))) {
        break forward_join_197;
    }
    __call1389_72(receiver, p0);
    }
    __call1389_74(__invokedynamic1389_73(1419, (4544275264922333714L ^ life6_3)));
    return;
}
public static void h1389_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138900_0(p0);
}
public static void h1389_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138901_0(p0);
}
public static void h1389_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138902_0(p0);
}
public static void h1389_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138903_0(p0);
}
public static void h1389_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138904_0(p0);
}
public static void h1389_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138905_0(p0);
}
public static void h1389_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138906_0(p0);
}
public static void h1389_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138907_0(p0);
}
public static void h1389_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138908_0(p0);
}
public static void h1389_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138909_0(p0);
}
public static void h1389_10(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138910_0(p0);
}
public static void h1389_11(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138911_0(p0);
}
public static void h1389_12(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138912_0(p0);
}
public static void h1389_13(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138913_0(p0);
}
public static void h1389_14(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1138914_0(p0);
}
private static native long __fieldRead1389_0() throws Throwable;
private static native java.lang.Object __call1389_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __invokedynamic1389_2(int a0, long a1) throws Throwable;
private static native void __call1389_3(int a0) throws Throwable;
private static native void __call1389_4() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1389_5(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1389_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1389_7(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call1389_8(float a0, float a1, float a2) throws Throwable;
private static native boolean __call1389_9() throws Throwable;
private static native void __call1389_10() throws Throwable;
private static native float __call1389_11(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1389_12(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead1389_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1389_14(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead1389_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead1389_16(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call1389_17(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic1389_18(int a0, long a1) throws Throwable;
private static native void __call1389_19(int a0) throws Throwable;
private static native void __call1389_20() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1389_21(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1389_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1389_23(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call1389_24(float a0, float a1, float a2) throws Throwable;
private static native void __call1389_25() throws Throwable;
private static native void __call1389_26(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1389_27(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1389_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1389_29(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call1389_30(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1389_31(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1389_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf1389_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1389_34(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1389_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast1389_36(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1389_37(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1389_38(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1389_39(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1389_40(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1389_41(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1389_42(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1389_43(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1389_44(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.jI __fieldRead1389_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1389_46(moom.jI a0) throws Throwable;
private static native void __call1389_47(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __invokedynamic1389_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic1389_49(int a0, long a1) throws Throwable;
private static native void __call1389_50(int a0) throws Throwable;
private static native void __call1389_51(float a0, float a1) throws Throwable;
private static native boolean __call1389_52() throws Throwable;
private static native moom.lm __fieldRead1389_53(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call1389_54(moom.lm a0, float a1, boolean a2) throws Throwable;
private static native moom.lm __fieldRead1389_55(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call1389_56(moom.lm a0, float a1) throws Throwable;
private static native int __invokedynamic1389_57(int a0, long a1) throws Throwable;
private static native void __call1389_58(int a0) throws Throwable;
private static native void __call1389_59(float a0, float a1) throws Throwable;
private static native void __call1389_60(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call1389_61() throws Throwable;
private static native void __call1389_62(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1389_63(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1389_64(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1389_65(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native moom.lm __fieldRead1389_66(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call1389_67(moom.lm a0, float a1) throws Throwable;
private static native void __call1389_68(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1389_69(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1389_70(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1389_71(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call1389_72(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native int __invokedynamic1389_73(int a0, long a1) throws Throwable;
private static native void __call1389_74(int a0) throws Throwable;
private static native java.lang.Throwable __call1138900_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138901_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138902_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138903_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138904_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138905_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138906_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138907_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138908_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138909_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138910_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138911_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138912_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138913_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1138914_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9c2fe8aeb0a50f67a625(net.minecraft.client.renderer.EntityRenderer a0, float a1, long a2) throws E;
private static final class __SourceHandler_9c2fe8aeb0a50f67a625 {

public static void f900212(net.minecraft.client.renderer.EntityRenderer receiver, float p0, long p1) throws Throwable {
    int spill900212_0;
    int spill900212_1;
    long life4_3;
    int life6_9;
    float life7_108;
    float life8_116;
    float life9_124;
    float life10_132;
    int life11_134;
    float life12_166;
    float life9_174;
    float life10_179;
    moom.ir life7_231;
    int life8_234;
    int life9_237;
    int life10_245;
    int life11_257;
    int life12_262;
    int life13_276;
    int life13_284;
    long life14_289;
    long life16_303;
    forest_join_412: {
    forest_join_396: {
    forest_join_390: {
    forest_join_373: {
    forest_join_335: {
    forest_join_330: {
    forest_join_323: {
    forest_join_300: {
    forest_join_181: {
    forest_join_166: {
    forest_join_121: {
    forest_join_69: {
    forest_join_43: {
    forest_join_40: {
    forest_join_25: {
    life4_3 = (__fieldRead900212_0() ^ 30492114254553L);
    __fieldWrite900212_1(p0);
    __call900212_2(receiver);
    life6_9 = __integerCategory900212_4(__call900212_3());
    if (!((life6_9 == 0))) {
        break forest_join_40;
    }
    if (!(__fieldRead900212_7(__fieldRead900212_6(__fieldRead900212_5(receiver))))) {
        break forest_join_40;
    }
    if (!(__fieldRead900212_10(__fieldRead900212_9(__fieldRead900212_8(receiver))))) {
        break forest_join_25;
    }
    if (!((!__call900212_11(1)))) {
        break forest_join_40;
    }
    }
    if (!((__numericCompare900212_15((__call900212_12() - __fieldRead900212_13(receiver)), __invokedynamic900212_14(13524, (6501278184703996451L ^ life4_3))) > 0))) {
        break forest_join_43;
    }
    __call900212_17(__fieldRead900212_16(receiver));
    break forest_join_43;
    }
    __fieldWrite900212_19(receiver, __call900212_18());
    }
    __call900212_22(__fieldRead900212_21(__fieldRead900212_20(receiver)), "mouse");
    if (!((life6_9 != 0))) {
        break forest_join_69;
    }
    if (!(__fieldRead900212_23())) {
        break forest_join_69;
    }
    if (!(__fieldRead900212_25(__fieldRead900212_24(receiver)))) {
        break forest_join_69;
    }
    if (!((!__call900212_26()))) {
        break forest_join_69;
    }
    __call900212_27(0);
    __call900212_30((__call900212_28() / 2), (__call900212_29() / 2));
    __call900212_31(1);
    }
    if (!(__fieldRead900212_33(__fieldRead900212_32(receiver)))) {
        break forest_join_181;
    }
    if (!((life6_9 != 0))) {
        break forest_join_181;
    }
    __call900212_36(__fieldRead900212_35(__fieldRead900212_34(receiver)));
    life7_108 = ((__fieldRead900212_39(__fieldRead900212_38(__fieldRead900212_37(receiver))) * 0x1.333334p-1f) + 0x1.99999ap-3f);
    life8_116 = (((life7_108 * life7_108) * life7_108) * 0x1.0p3f);
    life9_124 = (((float) __fieldRead900212_42(__fieldRead900212_41(__fieldRead900212_40(receiver)))) * life8_116);
    life10_132 = (((float) __fieldRead900212_45(__fieldRead900212_44(__fieldRead900212_43(receiver)))) * life8_116);
    life11_134 = 1;
    if (!(__fieldRead900212_48(__fieldRead900212_47(__fieldRead900212_46(receiver))))) {
        break forest_join_121;
    }
    life11_134 = -1;
    }
    if (!(__fieldRead900212_51(__fieldRead900212_50(__fieldRead900212_49(receiver))))) {
        break forest_join_166;
    }
    net.minecraft.client.renderer.EntityRenderer __stackOp900212_52_0 = receiver;
    __fieldWrite900212_54(__stackOp900212_52_0, (__fieldRead900212_53(__stackOp900212_52_0) + life9_124));
    net.minecraft.client.renderer.EntityRenderer __stackOp900212_55_0 = receiver;
    __fieldWrite900212_57(__stackOp900212_55_0, (__fieldRead900212_56(__stackOp900212_55_0) + life10_132));
    life12_166 = (p0 - __fieldRead900212_58(receiver));
    __fieldWrite900212_59(receiver, p0);
    life9_174 = (__fieldRead900212_60(receiver) * life12_166);
    life10_179 = (__fieldRead900212_61(receiver) * life12_166);
    __call900212_64(__fieldRead900212_63(__fieldRead900212_62(receiver)), life9_174, (life10_179 * ((float) life11_134)));
    break forest_join_181;
    }
    __fieldWrite900212_65(receiver, 0x0.0p0f);
    __fieldWrite900212_66(receiver, 0x0.0p0f);
    __call900212_69(__fieldRead900212_68(__fieldRead900212_67(receiver)), life9_124, (life10_132 * ((float) life11_134)));
    }
    __call900212_72(__fieldRead900212_71(__fieldRead900212_70(receiver)));
    if (!((!__fieldRead900212_74(__fieldRead900212_73(receiver))))) {
        break forest_join_396;
    }
    __call900212_77(__call900212_76(__call900212_75()), new com.moon.eC());
    __fieldWrite900212_81(__fieldRead900212_80(__fieldRead900212_79(__fieldRead900212_78(receiver))));
    life7_231 = new moom.ir(__fieldRead900212_82(receiver));
    life8_234 = __call900212_83(life7_231);
    life9_237 = __call900212_84(life7_231);
    life10_245 = ((__call900212_85() * life8_234) / __fieldRead900212_87(__fieldRead900212_86(receiver)));
    life11_257 = ((life9_237 - ((__call900212_88() * life9_237) / __fieldRead900212_90(__fieldRead900212_89(receiver)))) - 1);
    life12_262 = __fieldRead900212_93(__fieldRead900212_92(__fieldRead900212_91(receiver)));
    if (!((__fieldRead900212_95(__fieldRead900212_94(receiver)) != null))) {
        break forest_join_335;
    }
    __call900212_98(__fieldRead900212_97(__fieldRead900212_96(receiver)), "level");
    life13_276 = __call900212_100(__call900212_99(), life12_262);
    life13_284 = __call900212_102(life13_276, __invokedynamic900212_101(8737, (248193482553769091L ^ life4_3)));
    spill900212_0 = 5162;
    life14_289 = (__call900212_103() - p1);
    life16_303 = __call900212_105((((long) ((__invokedynamic900212_104(spill900212_0, (1067715218879908486L ^ life4_3)) / life13_284) / 4)) - life14_289), 0L);
    __call900212_107(receiver, p0, (__call900212_106() + life16_303));
    __fieldWrite900212_109(receiver, __call900212_108());
    __call900212_112(__fieldRead900212_111(__fieldRead900212_110(receiver)), "gui");
    if (!(__fieldRead900212_115(__fieldRead900212_114(__fieldRead900212_113(receiver))))) {
        break forest_join_300;
    }
    if (!((__fieldRead900212_117(__fieldRead900212_116(receiver)) != null))) {
        break forest_join_330;
    }
    }
    __call900212_119(__invokedynamic900212_118(23041, (4848061002676946058L ^ life4_3)), 0x1.99999ap-4f);
    __call900212_122(__fieldRead900212_121(__fieldRead900212_120(receiver)), p0);
    if (!(__fieldRead900212_125(__fieldRead900212_124(__fieldRead900212_123(receiver))))) {
        break forest_join_323;
    }
    if (!((!__fieldRead900212_128(__fieldRead900212_127(__fieldRead900212_126(receiver)))))) {
        break forest_join_323;
    }
    __call900212_129();
    }
    if (!(__fieldRead900212_132(__fieldRead900212_131(__fieldRead900212_130(receiver))))) {
        break forest_join_330;
    }
    __call900212_133(life7_231);
    }
    __call900212_136(__fieldRead900212_135(__fieldRead900212_134(receiver)));
    break forest_join_373;
    }
    __call900212_141(0, 0, __fieldRead900212_138(__fieldRead900212_137(receiver)), __fieldRead900212_140(__fieldRead900212_139(receiver)));
    __call900212_143(__invokedynamic900212_142(22520, (1898606590996367652L ^ life4_3)));
    spill900212_1 = 25934;
    __call900212_144();
    __call900212_146(__invokedynamic900212_145(spill900212_1, (8139958245055298526L ^ life4_3)));
    __call900212_147();
    __call900212_148(receiver);
    __fieldWrite900212_150(receiver, __call900212_149());
    __fieldWrite900212_154(__fieldRead900212_151(), __call900212_153(__fieldRead900212_152(receiver)));
    __fieldWrite900212_158(__fieldRead900212_155(), __fieldRead900212_157(__fieldRead900212_156(receiver)));
    }
    if (!((__fieldRead900212_160(__fieldRead900212_159(receiver)) != null))) {
        break forest_join_390;
    }
    __call900212_162(__invokedynamic900212_161(15936, (8564886955555791075L ^ life4_3)));
    __call900212_165(__fieldRead900212_164(__fieldRead900212_163(receiver)), life10_245, life11_257, p0);
    }
    __call900212_168(__call900212_167(__call900212_166()), new com.moon.eB());
    }
    __call900212_169(receiver);
    __call900212_170(receiver);
    __call900212_171();
    __call900212_172();
    if (!(__fieldRead900212_175(__fieldRead900212_174(__fieldRead900212_173(receiver))))) {
        break forest_join_412;
    }
    __fieldWrite900212_178(__fieldRead900212_177(__fieldRead900212_176(receiver)), 1);
    }
    return;
}
public static void h900212_0(java.lang.Throwable p0) throws Throwable {
    throw __call93021200_0(p0);
}
public static void h900212_1(java.lang.Throwable p0) throws Throwable {
    throw __call93021201_0(p0);
}
public static void h900212_2(java.lang.Throwable p0) throws Throwable {
    throw __call93021202_0(p0);
}
public static void h900212_3(java.lang.Throwable p0) throws Throwable {
    throw __call93021203_0(p0);
}
public static void h900212_4(java.lang.Throwable p0) throws Throwable {
    throw __call93021204_0(p0);
}
public static void h900212_5(java.lang.Throwable p0) throws Throwable {
    throw __call93021205_0(p0);
}
public static void h900212_6(java.lang.Throwable p0) throws Throwable {
    throw __call93021206_0(p0);
}
public static void h900212_7(java.lang.Throwable p0) throws Throwable {
    throw __call93021207_0(p0);
}
public static void h900212_8(java.lang.Throwable p0) throws Throwable {
    throw __call93021208_0(p0);
}
public static void h900212_9(java.lang.Throwable p0) throws Throwable {
    throw __call93021209_0(p0);
}
public static void h900212_10(java.lang.Throwable p0) throws Throwable {
    throw __call93021210_0(p0);
}
public static void h900212_11(java.lang.Throwable p0) throws Throwable {
    throw __call93021211_0(p0);
}
public static void h900212_12(java.lang.Throwable p0) throws Throwable {
    throw __call93021212_0(p0);
}
public static void h900212_13(java.lang.Throwable p0) throws Throwable {
    throw __call93021213_0(p0);
}
public static void h900212_14(java.lang.Throwable p0) throws Throwable {
    throw __call93021214_0(p0);
}
public static void h900212_15(java.lang.Throwable p0, net.minecraft.client.renderer.EntityRenderer p1, moom.ir p2, int p3, int p4) throws Throwable {
    java.lang.Throwable life5_2;
    moom.qY life6_6;
    moom.qZ life7_10;
    life5_2 = p0;
    life6_6 = __call93021215_0(life5_2, "Rendering screen");
    life7_10 = __call93021215_1(life6_6, "Screen render details");
    __call93021215_3(life7_10, "Screen name", __invokedynamic93021215_2(p1));
    __call93021215_5(life7_10, "Mouse location", __invokedynamic93021215_4(p3, p4));
    __call93021215_7(life7_10, "Screen size", __invokedynamic93021215_6(p1, p2));
    throw new moom.Oo(life6_6);
}
public static void h900212_16(java.lang.Throwable p0) throws Throwable {
    throw __call93021216_0(p0);
}
private static native long __fieldRead900212_0() throws Throwable;
private static native void __fieldWrite900212_1(float a0) throws Throwable;
private static native void __call900212_2(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native boolean __call900212_3() throws Throwable;
private static native int __integerCategory900212_4(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_5(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead900212_7(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead900212_10(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call900212_11(int a0) throws Throwable;
private static native long __call900212_12() throws Throwable;
private static native long __fieldRead900212_13(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native long __invokedynamic900212_14(int a0, long a1) throws Throwable;
private static native int __numericCompare900212_15(long a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_16(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call900212_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __call900212_18() throws Throwable;
private static native void __fieldWrite900212_19(net.minecraft.client.renderer.EntityRenderer a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_20(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead900212_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call900212_22(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead900212_23() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_24(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native boolean __fieldRead900212_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call900212_26() throws Throwable;
private static native void __call900212_27(int a0) throws Throwable;
private static native int __call900212_28() throws Throwable;
private static native int __call900212_29() throws Throwable;
private static native void __call900212_30(int a0, int a1) throws Throwable;
private static native void __call900212_31(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_32(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native boolean __fieldRead900212_33(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_34(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.Dt __fieldRead900212_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call900212_36(moom.Dt a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_37(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_38(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead900212_39(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_40(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.Dt __fieldRead900212_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead900212_42(moom.Dt a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_43(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.Dt __fieldRead900212_44(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead900212_45(moom.Dt a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_46(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_47(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead900212_48(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_49(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_50(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead900212_51(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native float __fieldRead900212_53(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite900212_54(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead900212_56(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite900212_57(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead900212_58(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite900212_59(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead900212_60(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead900212_61(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_62(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead900212_63(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call900212_64(net.minecraft.client.entity.EntityPlayerSP a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite900212_65(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite900212_66(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_67(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead900212_68(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call900212_69(net.minecraft.client.entity.EntityPlayerSP a0, float a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_70(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead900212_71(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call900212_72(moom.A9 a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_73(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native boolean __fieldRead900212_74(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call900212_75() throws Throwable;
private static native com.moon.events.EventBus __call900212_76(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call900212_77(com.moon.events.EventBus a0, com.moon.eC a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_78(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_79(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead900212_80(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __fieldWrite900212_81(boolean a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_82(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __call900212_83(moom.ir a0) throws Throwable;
private static native int __call900212_84(moom.ir a0) throws Throwable;
private static native int __call900212_85() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_86(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead900212_87(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call900212_88() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_89(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead900212_90(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_91(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_92(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead900212_93(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_94(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead900212_95(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_96(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead900212_97(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call900212_98(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __call900212_99() throws Throwable;
private static native int __call900212_100(int a0, int a1) throws Throwable;
private static native int __invokedynamic900212_101(int a0, long a1) throws Throwable;
private static native int __call900212_102(int a0, int a1) throws Throwable;
private static native long __call900212_103() throws Throwable;
private static native int __invokedynamic900212_104(int a0, long a1) throws Throwable;
private static native long __call900212_105(long a0, long a1) throws Throwable;
private static native long __call900212_106() throws Throwable;
private static native void __call900212_107(net.minecraft.client.renderer.EntityRenderer a0, float a1, long a2) throws Throwable;
private static native long __call900212_108() throws Throwable;
private static native void __fieldWrite900212_109(net.minecraft.client.renderer.EntityRenderer a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_110(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead900212_111(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call900212_112(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_113(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_114(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead900212_115(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_116(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead900212_117(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic900212_118(int a0, long a1) throws Throwable;
private static native void __call900212_119(int a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_120(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead900212_121(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call900212_122(net.minecraft.client.gui.GuiIngame a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_123(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_124(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead900212_125(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_126(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_127(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead900212_128(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call900212_129() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_130(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_131(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead900212_132(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call900212_133(moom.ir a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_134(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead900212_135(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call900212_136(moom.A9 a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_137(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead900212_138(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_139(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead900212_140(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call900212_141(int a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic900212_142(int a0, long a1) throws Throwable;
private static native void __call900212_143(int a0) throws Throwable;
private static native void __call900212_144() throws Throwable;
private static native int __invokedynamic900212_145(int a0, long a1) throws Throwable;
private static native void __call900212_146(int a0) throws Throwable;
private static native void __call900212_147() throws Throwable;
private static native void __call900212_148(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native long __call900212_149() throws Throwable;
private static native void __fieldWrite900212_150(net.minecraft.client.renderer.EntityRenderer a0, long a1) throws Throwable;
private static native moom.oo __fieldRead900212_151() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_152(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call900212_153(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite900212_154(moom.oo a0, net.minecraft.client.renderer.texture.TextureManager a1) throws Throwable;
private static native moom.oo __fieldRead900212_155() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_156(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead900212_157(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite900212_158(moom.oo a0, net.minecraft.client.gui.FontRenderer a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_159(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead900212_160(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic900212_161(int a0, long a1) throws Throwable;
private static native void __call900212_162(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_163(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead900212_164(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call900212_165(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, float a3) throws Throwable;
private static native com.moon.runtime.ClientContext __call900212_166() throws Throwable;
private static native com.moon.events.EventBus __call900212_167(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call900212_168(com.moon.events.EventBus a0, com.moon.eB a1) throws Throwable;
private static native void __call900212_169(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call900212_170(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call900212_171() throws Throwable;
private static native void __call900212_172() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_173(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_174(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead900212_175(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900212_176(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900212_177(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite900212_178(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native java.lang.Throwable __call93021200_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021201_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021202_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021203_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021204_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021205_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021206_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021207_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021208_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021209_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021210_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021211_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021212_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021213_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93021214_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call93021215_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call93021215_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic93021215_2(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call93021215_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic93021215_4(int a0, int a1) throws Throwable;
private static native void __call93021215_5(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic93021215_6(net.minecraft.client.renderer.EntityRenderer a0, moom.ir a1) throws Throwable;
private static native void __call93021215_7(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.lang.Throwable __call93021216_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_9367375197d78ceb02bf(net.minecraft.client.renderer.EntityRenderer a0, float a1, boolean a2) throws E;
private static final class __SourceHandler_9367375197d78ceb02bf {

public static float f1390(net.minecraft.client.renderer.EntityRenderer receiver, float p0, boolean p1) throws Throwable {
    net.minecraft.entity.Entity life3_6;
    float life4_8;
    int life5_32;
    net.minecraft.client.settings.GameSettings life6_40;
    float life6_126;
    net.minecraft.block.Block life6_147;
    forward_join_146: {
    forward_join_129: {
    forward_join_99: {
    forward_join_75: {
    forward_join_68: {
    forward_join_47: {
    forward_join_31: {
    __call1390_0(receiver);
    life3_6 = __call1390_2(__fieldRead1390_1(receiver));
    life4_8 = 0x1.18p6f;
    if (!(p1)) { break forward_join_31; }
    life4_8 = __fieldRead1390_5(__fieldRead1390_4(__fieldRead1390_3(receiver)));
    if (!(__call1390_6())) { break forward_join_31; }
    life4_8 = (life4_8 * (__fieldRead1390_7(receiver) + ((__fieldRead1390_8(receiver) - __fieldRead1390_9(receiver)) * p0)));
    }
    life5_32 = 0;
    if (!((__fieldRead1390_11(__fieldRead1390_10(receiver)) == null))) { break forward_join_47; }
    life6_40 = __fieldRead1390_13(__fieldRead1390_12(receiver));
    life5_32 = __integerCategory1390_18(__call1390_17(__fieldRead1390_16(__fieldRead1390_15(__fieldRead1390_14(receiver)))));
    }
    if (!((life5_32 != 0))) { break forward_join_75; }
    if (!((!__fieldRead1390_19()))) { break forward_join_68; }
    __fieldWrite1390_20(1);
    __fieldWrite1390_24(__fieldRead1390_23(__fieldRead1390_22(__fieldRead1390_21(receiver))));
    __fieldWrite1390_27(__fieldRead1390_26(__fieldRead1390_25(receiver)), 1);
    __fieldWrite1390_30(__fieldRead1390_29(__fieldRead1390_28(receiver)), 1);
    }
    if (!(__fieldRead1390_31())) { break forward_join_99; }
    life4_8 = (life4_8 / 0x1.0p2f);
    break forward_join_99;
    }
    if (!(__fieldRead1390_32())) { break forward_join_99; }
    __fieldWrite1390_33(0);
    __fieldWrite1390_37(__fieldRead1390_35(__fieldRead1390_34(receiver)), __fieldRead1390_36());
    __fieldWrite1390_38(receiver, new net.minecraft.util.MouseFilter());
    __fieldWrite1390_39(receiver, new net.minecraft.util.MouseFilter());
    __fieldWrite1390_42(__fieldRead1390_41(__fieldRead1390_40(receiver)), 1);
    }
    if (!((__instanceOf1390_43(life3_6) != 0))) { break forward_join_129; }
    if (!((__numericCompare1390_46(__call1390_45(__cast1390_44(life3_6)), 0x0.0p0f) <= 0))) { break forward_join_129; }
    life6_126 = (((float) __fieldRead1390_48(__cast1390_47(life3_6))) + p0);
    life4_8 = (life4_8 / (((0x1.0p0f - (0x1.f4p8f / (life6_126 + 0x1.f4p8f))) * 0x1.0p1f) + 0x1.0p0f));
    }
    life6_147 = __call1390_51(__fieldRead1390_50(__fieldRead1390_49(receiver)), life3_6, p0);
    if (!((__call1390_52(life6_147) == __fieldRead1390_53()))) { break forward_join_146; }
    life4_8 = ((life4_8 * 0x1.ep5f) / 0x1.18p6f);
    }
    return life4_8;
}
public static void h1390_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139000_0(p0);
}
public static void h1390_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139001_0(p0);
}
public static void h1390_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139002_0(p0);
}
public static void h1390_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139003_0(p0);
}
private static native java.lang.Object __call1390_0(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1390_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1390_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1390_3(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1390_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead1390_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call1390_6() throws Throwable;
private static native float __fieldRead1390_7(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead1390_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead1390_9(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1390_10(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1390_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1390_12(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1390_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1390_14(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1390_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead1390_16(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call1390_17(moom.pz a0) throws Throwable;
private static native int __integerCategory1390_18(boolean value) throws Throwable;
private static native boolean __fieldRead1390_19() throws Throwable;
private static native void __fieldWrite1390_20(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1390_21(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1390_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1390_23(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __fieldWrite1390_24(boolean a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1390_25(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1390_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite1390_27(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1390_28(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead1390_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite1390_30(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native boolean __fieldRead1390_31() throws Throwable;
private static native boolean __fieldRead1390_32() throws Throwable;
private static native void __fieldWrite1390_33(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1390_34(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1390_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1390_36() throws Throwable;
private static native void __fieldWrite1390_37(net.minecraft.client.settings.GameSettings a0, boolean a1) throws Throwable;
private static native void __fieldWrite1390_38(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.util.MouseFilter a1) throws Throwable;
private static native void __fieldWrite1390_39(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.util.MouseFilter a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1390_40(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead1390_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite1390_42(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native int __instanceOf1390_43(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast1390_44(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call1390_45(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native int __numericCompare1390_46(float a0, float a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast1390_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead1390_48(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1390_49(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1390_50(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.block.Block __call1390_51(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native moom.fn __call1390_52(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1390_53() throws Throwable;
private static native java.lang.Throwable __call1139000_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139001_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139002_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139003_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ce2f5959b58b4b166321(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws E;
private static final class __SourceHandler_ce2f5959b58b4b166321 {

public static boolean f2430(net.minecraft.client.renderer.EntityRenderer receiver, int p0) throws Throwable {
    if ((!__call2430_0())) {
        return false;
    }
    if ((__fieldRead2430_1(receiver) != null)) {
        if ((__fieldRead2430_2(receiver) != (__fieldRead2430_3(receiver))[2])) {
        if ((__fieldRead2430_4(receiver) != (__fieldRead2430_5(receiver))[4])) {
        return true;
    }
    }
    }
    if ((p0 != 2)) {
        if ((p0 != 4)) {
        if ((__fieldRead2430_6(receiver) != null)) {
        __call2430_8(__fieldRead2430_7(receiver));
        __fieldWrite2430_9(receiver, null);
    }
        return true;
    }
    }
    if ((__fieldRead2430_10(receiver) != null)) {
        if ((__fieldRead2430_11(receiver) == (__fieldRead2430_12(receiver))[p0])) {
        return true;
    }
    }
    if ((__fieldRead2430_14(__fieldRead2430_13(receiver)) == null)) {
        return true;
    }
    __call2430_16(receiver, new moom.DD(__invokedynamic2430_15(p0)));
    (__fieldRead2430_17(receiver))[p0] = __fieldRead2430_18(receiver);
    return __fieldRead2430_19(receiver);
}
public static void h2430_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243000_0(p0);
}
public static void h2430_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243001_0(p0);
}
public static void h2430_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243002_0(p0);
}
public static void h2430_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243003_0(p0);
}
public static void h2430_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243004_0(p0);
}
public static void h2430_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243005_0(p0);
}
public static void h2430_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243006_0(p0);
}
public static void h2430_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243007_0(p0);
}
public static void h2430_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243008_0(p0);
}
public static void h2430_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243009_0(p0);
}
private static native boolean __call2430_0() throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2430_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2430_2(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup[] __fieldRead2430_3(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2430_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup[] __fieldRead2430_5(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2430_6(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2430_7(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call2430_8(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native void __fieldWrite2430_9(net.minecraft.client.renderer.EntityRenderer a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2430_10(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2430_11(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup[] __fieldRead2430_12(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2430_13(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2430_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __invokedynamic2430_15(int a0) throws Throwable;
private static native void __call2430_16(net.minecraft.client.renderer.EntityRenderer a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup[] __fieldRead2430_17(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2430_18(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native boolean __fieldRead2430_19(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native java.lang.Throwable __call1243000_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243001_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243002_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243003_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243004_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243005_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243006_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243007_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243008_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243009_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_24d05b311d9868e5c4c5(net.minecraft.client.renderer.EntityRenderer a0, int a1, float a2) throws E;
private static final class __SourceHandler_24d05b311d9868e5c4c5 {

public static void f720007(net.minecraft.client.renderer.EntityRenderer receiver, int p0, float p1) throws Throwable {
    float forestValue720007_175_0;
    com.moon.d7 spill720007_0;
    int spill720007_1;
    long life3_3;
    net.minecraft.entity.Entity life5_10;
    int life6_12;
    int life6_20;
    net.minecraft.block.Block life7_51;
    float life8_53;
    com.moon.d7 life9_73;
    float life10_82;
    int life11_88;
    float life9_179;
    float life10_199;
    float life9_221;
    forest_join_287: {
    forest_join_269: {
    forest_join_256: {
    forest_join_240: {
    forest_join_234: {
    forest_join_214: {
    forest_join_201: {
    forest_join_200: {
    forest_join_187: {
    forest_join_175: {
    forest_join_174: {
    forest_join_160: {
    forest_join_148: {
    forest_join_147: {
    forest_join_131: {
    forest_join_125: {
    forest_join_109: {
    forest_join_61: {
    forest_join_21: {
    life3_3 = (__fieldRead720007_0() ^ 40288767114408L);
    __fieldWrite720007_1(receiver, 0);
    life5_10 = __call720007_3(__fieldRead720007_2(receiver));
    life6_12 = 0;
    if (!((__instanceOf720007_4(life5_10) != 0))) {
        break forest_join_21;
    }
    life6_20 = __localWitness720007(__integerCategory720007_8(__fieldRead720007_7(__fieldRead720007_6(__cast720007_5(life5_10)))));
    }
    __call720007_14(__invokedynamic720007_9(30593, (4689599763574189899L ^ life3_3)), __call720007_13(receiver, __fieldRead720007_10(receiver), __fieldRead720007_11(receiver), __fieldRead720007_12(receiver), 0x1.0p0f));
    __call720007_15(0x0.0p0f, -0x1.0p0f, 0x0.0p0f);
    __call720007_16(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    life7_51 = __call720007_19(__fieldRead720007_18(__fieldRead720007_17(receiver)), life5_10, p1);
    life8_53 = -0x1.0p0f;
    if (!((__numericCompare720007_20(life8_53, 0x0.0p0f) >= 0))) {
        break forest_join_61;
    }
    __call720007_21(life8_53);
    break forest_join_287;
    }
    if (!((__instanceOf720007_22(life5_10) != 0))) {
        break forest_join_148;
    }
    if (!(__call720007_25(__cast720007_23(life5_10), __fieldRead720007_24()))) {
        break forest_join_148;
    }
    com.moon.d7 __stackOp720007_27_0 = __sourceUninitializedNEW720007_26();
    spill720007_0 = __stackOp720007_27_0;
    __explicitNewInit720007_28(__stackOp720007_27_0);
    life9_73 = spill720007_0;
    __call720007_31(__call720007_30(__call720007_29()), life9_73);
    if (!((!__call720007_32(life9_73)))) {
        break forest_join_147;
    }
    life10_82 = 0x1.4p2f;
    life11_88 = __call720007_36(__call720007_35(__cast720007_33(life5_10), __fieldRead720007_34()));
    if (!((life11_88 < __invokedynamic720007_37(30288, (5977724741196770974L ^ life3_3))))) {
        break forest_join_109;
    }
    life10_82 = (0x1.4p2f + ((__fieldRead720007_38(receiver) - 0x1.4p2f) * (0x1.0p0f - (((float) life11_88) / 0x1.4p4f))));
    }
    __call720007_40(__invokedynamic720007_39(3176, (6357766170237474006L ^ life3_3)));
    if (!((p0 == -1))) {
        break forest_join_125;
    }
    __call720007_41(0x0.0p0f);
    __call720007_42((life10_82 * 0x1.99999ap-1f));
    break forest_join_131;
    }
    __call720007_43((life10_82 * 0x1.0p-2f));
    __call720007_44(life10_82);
    }
    if (!(__fieldRead720007_46(__call720007_45()))) {
        break forest_join_147;
    }
    if (!(__call720007_47())) {
        break forest_join_147;
    }
    __call720007_50(__invokedynamic720007_48(14129, (8021572938256461788L ^ life3_3)), __invokedynamic720007_49(22157, (5917923517288795717L ^ life3_3)));
    }
    break forest_join_287;
    }
    if (!(__fieldRead720007_51(receiver))) {
        break forest_join_160;
    }
    __call720007_53(__invokedynamic720007_52(9743, (6722996837385682686L ^ life3_3)));
    __call720007_54(0x1.99999ap-4f);
    break forest_join_287;
    }
    if (!((__call720007_55(life7_51) == __fieldRead720007_56()))) {
        break forest_join_201;
    }
    __call720007_58(__invokedynamic720007_57(24875, (8714359133751507403L ^ life3_3)));
    if (!(__call720007_59())) {
        break forest_join_174;
    }
    forestValue720007_175_0 = 0x1.47ae14p-6f;
    break forest_join_175;
    }
    forestValue720007_175_0 = 0x1.99999ap-4f;
    }
    life9_179 = forestValue720007_175_0;
    if (!((__instanceOf720007_60(life5_10) != 0))) {
        break forest_join_187;
    }
    if (!(__call720007_63(__cast720007_61(life5_10), __fieldRead720007_62()))) {
        break forest_join_187;
    }
    __call720007_64(0x1.47ae14p-7f);
    break forest_join_200;
    }
    life10_199 = (0x1.99999ap-4f - (((float) __call720007_65(life5_10)) * 0x1.eb851ep-6f));
    __call720007_67(__call720007_66(life10_199, 0x0.0p0f, life9_179));
    }
    break forest_join_287;
    }
    if (!((__call720007_68(life7_51) == __fieldRead720007_69()))) {
        break forest_join_214;
    }
    __call720007_71(__invokedynamic720007_70(24875, (8714359133751507403L ^ life3_3)));
    __call720007_72(0x1.0p1f);
    break forest_join_287;
    }
    life9_221 = __fieldRead720007_73(receiver);
    __fieldWrite720007_74(receiver, 1);
    __call720007_76(__invokedynamic720007_75(3176, (6357766170237474006L ^ life3_3)));
    if (!((p0 == -1))) {
        break forest_join_234;
    }
    __call720007_77(0x0.0p0f);
    __call720007_78(life9_221);
    break forest_join_240;
    }
    __call720007_80((life9_221 * __call720007_79()));
    __call720007_81(life9_221);
    }
    if (!(__fieldRead720007_83(__call720007_82()))) {
        break forest_join_269;
    }
    if (!(__call720007_84())) {
        break forest_join_256;
    }
    __call720007_87(__invokedynamic720007_85(31083, (3143910288141083084L ^ life3_3)), __invokedynamic720007_86(12083, (5042596747545982874L ^ life3_3)));
    }
    if (!(__call720007_88())) {
        break forest_join_269;
    }
    __call720007_91(__invokedynamic720007_89(31083, (3143910288141083084L ^ life3_3)), __invokedynamic720007_90(20773, (9185628939239147983L ^ life3_3)));
    }
    if (!(__call720007_97(__fieldRead720007_94(__fieldRead720007_93(__fieldRead720007_92(receiver))), ((int) __fieldRead720007_95(life5_10)), ((int) __fieldRead720007_96(life5_10))))) {
        break forest_join_287;
    }
    __call720007_98((life9_221 * 0x1.99999ap-5f));
    __call720007_99(life9_221);
    }
    __call720007_100();
    spill720007_1 = 6890;
    __call720007_101();
    __call720007_104(__invokedynamic720007_102(spill720007_1, (2720393017806586413L ^ life3_3)), __invokedynamic720007_103(28682, (2071853372752980223L ^ life3_3)));
    return;
}

public static void h720007_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000700_0(p0);
}
public static void h720007_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000701_0(p0);
}
public static void h720007_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000702_0(p0);
}
public static void h720007_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000703_0(p0);
}
public static void h720007_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000704_0(p0);
}
public static void h720007_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000705_0(p0);
}
public static void h720007_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000706_0(p0);
}
public static void h720007_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000707_0(p0);
}
public static void h720007_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000708_0(p0);
}
public static void h720007_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000709_0(p0);
}
public static void h720007_10(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000710_0(p0);
}
public static void h720007_11(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000711_0(p0);
}
public static void h720007_12(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000712_0(p0);
}
public static void h720007_13(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000713_0(p0);
}
public static void h720007_14(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000714_0(p0);
}
public static void h720007_15(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000715_0(p0);
}
private static native long __fieldRead720007_0() throws Throwable;
private static native void __fieldWrite720007_1(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead720007_2(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call720007_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf720007_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast720007_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead720007_6(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native boolean __fieldRead720007_7(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native int __integerCategory720007_8(boolean value) throws Throwable;
private static native int __invokedynamic720007_9(int a0, long a1) throws Throwable;
private static native float __fieldRead720007_10(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead720007_11(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead720007_12(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native java.nio.FloatBuffer __call720007_13(net.minecraft.client.renderer.EntityRenderer a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call720007_14(int a0, java.nio.FloatBuffer a1) throws Throwable;
private static native void __call720007_15(float a0, float a1, float a2) throws Throwable;
private static native void __call720007_16(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead720007_17(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead720007_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.block.Block __call720007_19(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native int __numericCompare720007_20(float a0, float a1) throws Throwable;
private static native void __call720007_21(float a0) throws Throwable;
private static native int __instanceOf720007_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast720007_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead720007_24() throws Throwable;
private static native boolean __call720007_25(net.minecraft.entity.EntityLivingBase a0, net.minecraft.potion.Potion a1) throws Throwable;
private static native com.moon.d7 __sourceUninitializedNEW720007_26() throws Throwable;
private static native void __explicitNewInit720007_28(com.moon.d7 a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call720007_29() throws Throwable;
private static native com.moon.events.EventBus __call720007_30(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call720007_31(com.moon.events.EventBus a0, com.moon.d7 a1) throws Throwable;
private static native boolean __call720007_32(com.moon.d7 a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast720007_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead720007_34() throws Throwable;
private static native net.minecraft.potion.PotionEffect __call720007_35(net.minecraft.entity.EntityLivingBase a0, net.minecraft.potion.Potion a1) throws Throwable;
private static native int __call720007_36(net.minecraft.potion.PotionEffect a0) throws Throwable;
private static native int __invokedynamic720007_37(int a0, long a1) throws Throwable;
private static native float __fieldRead720007_38(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __invokedynamic720007_39(int a0, long a1) throws Throwable;
private static native void __call720007_40(int a0) throws Throwable;
private static native void __call720007_41(float a0) throws Throwable;
private static native void __call720007_42(float a0) throws Throwable;
private static native void __call720007_43(float a0) throws Throwable;
private static native void __call720007_44(float a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call720007_45() throws Throwable;
private static native boolean __fieldRead720007_46(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __call720007_47() throws Throwable;
private static native int __invokedynamic720007_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic720007_49(int a0, long a1) throws Throwable;
private static native void __call720007_50(int a0, int a1) throws Throwable;
private static native boolean __fieldRead720007_51(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __invokedynamic720007_52(int a0, long a1) throws Throwable;
private static native void __call720007_53(int a0) throws Throwable;
private static native void __call720007_54(float a0) throws Throwable;
private static native moom.fn __call720007_55(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead720007_56() throws Throwable;
private static native int __invokedynamic720007_57(int a0, long a1) throws Throwable;
private static native void __call720007_58(int a0) throws Throwable;
private static native boolean __call720007_59() throws Throwable;
private static native int __instanceOf720007_60(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast720007_61(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead720007_62() throws Throwable;
private static native boolean __call720007_63(net.minecraft.entity.EntityLivingBase a0, net.minecraft.potion.Potion a1) throws Throwable;
private static native void __call720007_64(float a0) throws Throwable;
private static native int __call720007_65(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call720007_66(float a0, float a1, float a2) throws Throwable;
private static native void __call720007_67(float a0) throws Throwable;
private static native moom.fn __call720007_68(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead720007_69() throws Throwable;
private static native int __invokedynamic720007_70(int a0, long a1) throws Throwable;
private static native void __call720007_71(int a0) throws Throwable;
private static native void __call720007_72(float a0) throws Throwable;
private static native float __fieldRead720007_73(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite720007_74(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native int __invokedynamic720007_75(int a0, long a1) throws Throwable;
private static native void __call720007_76(int a0) throws Throwable;
private static native void __call720007_77(float a0) throws Throwable;
private static native void __call720007_78(float a0) throws Throwable;
private static native float __call720007_79() throws Throwable;
private static native void __call720007_80(float a0) throws Throwable;
private static native void __call720007_81(float a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call720007_82() throws Throwable;
private static native boolean __fieldRead720007_83(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __call720007_84() throws Throwable;
private static native int __invokedynamic720007_85(int a0, long a1) throws Throwable;
private static native int __invokedynamic720007_86(int a0, long a1) throws Throwable;
private static native void __call720007_87(int a0, int a1) throws Throwable;
private static native boolean __call720007_88() throws Throwable;
private static native int __invokedynamic720007_89(int a0, long a1) throws Throwable;
private static native int __invokedynamic720007_90(int a0, long a1) throws Throwable;
private static native void __call720007_91(int a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead720007_92(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead720007_93(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.EA __fieldRead720007_94(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native double __fieldRead720007_95(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead720007_96(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call720007_97(moom.EA a0, int a1, int a2) throws Throwable;
private static native void __call720007_98(float a0) throws Throwable;
private static native void __call720007_99(float a0) throws Throwable;
private static native void __call720007_100() throws Throwable;
private static native void __call720007_101() throws Throwable;
private static native int __invokedynamic720007_102(int a0, long a1) throws Throwable;
private static native int __invokedynamic720007_103(int a0, long a1) throws Throwable;
private static native void __call720007_104(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call75000700_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000701_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000702_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000703_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000704_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000705_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000706_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000707_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000708_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000709_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000710_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000711_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000712_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000713_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000714_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000715_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native int __localWitness720007(int p0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cdf505e30518e32a839e(net.minecraft.client.renderer.EntityRenderer a0, int a1, float a2, long a3) throws E;
private static final class __SourceHandler_cdf505e30518e32a839e {

public static void f200009(net.minecraft.client.renderer.EntityRenderer receiver, int p0, float p1, long p2) throws Throwable {
    net.minecraft.client.entity.EntityPlayerSP forestValue200009_86_0;
    net.minecraft.client.entity.EntityPlayerSP forestValue200009_87_0;
    int forestValue200009_87_1;
    moom.mv forestValue200009_107_0;
    moom.mv forestValue200009_108_0;
    int forestValue200009_108_1;
    net.minecraft.client.renderer.texture.ITextureObject forestValue200009_434_0;
    int forestValue200009_434_1;
    net.minecraft.client.renderer.texture.ITextureObject forestValue200009_435_0;
    int forestValue200009_435_1;
    int forestValue200009_435_2;
    net.minecraft.client.entity.EntityPlayerSP spill200009_0;
    moom.mv spill200009_1;
    int spill200009_2;
    int spill200009_3;
    long spill200009_4;
    int spill200009_5;
    long spill200009_6;
    net.minecraft.client.renderer.RenderGlobal spill200009_7;
    net.minecraft.entity.Entity spill200009_8;
    double spill200009_9;
    net.minecraft.client.renderer.culling.Frustum spill200009_10;
    int spill200009_11;
    net.minecraft.client.renderer.RenderGlobal spill200009_12;
    net.minecraft.entity.Entity spill200009_13;
    double spill200009_14;
    net.minecraft.client.renderer.culling.Frustum spill200009_15;
    int spill200009_16;
    net.minecraft.client.renderer.texture.ITextureObject spill200009_17;
    int spill200009_18;
    int spill200009_19;
    int spill200009_20;
    long spill200009_21;
    int spill200009_22;
    int spill200009_23;
    int spill200009_24;
    long spill200009_25;
    long life5_3;
    int life7_5;
    net.minecraft.client.renderer.RenderGlobal life8_16;
    net.minecraft.client.particle.EffectRenderer life9_20;
    int life10_23;
    moom.mv life11_97;
    net.minecraft.client.renderer.culling.Frustum life12_117;
    net.minecraft.entity.Entity life13_121;
    double life14_133;
    double life16_145;
    double life18_157;
    net.minecraft.entity.player.EntityPlayer life20_563;
    net.minecraft.entity.player.EntityPlayer life20_600;
    forest_join_864: {
    forest_join_861: {
    forest_join_858: {
    forest_join_854: {
    forest_join_847: {
    forest_join_823: {
    forest_join_785: {
    forest_join_774: {
    forest_join_726: {
    forest_join_713: {
    forest_join_707: {
    forest_join_698: {
    forest_join_690: {
    forest_join_683: {
    forest_join_666: {
    forest_join_639: {
    forest_join_598: {
    forest_join_597: {
    forest_join_558: {
    forest_join_478: {
    forest_join_461: {
    forest_join_435: {
    forest_join_434: {
    forest_join_421: {
    forest_join_409: {
    forest_join_398: {
    forest_join_373: {
    forest_join_359: {
    forest_join_354: {
    forest_join_337: {
    forest_join_288: {
    forest_join_256: {
    forest_join_255: {
    forest_join_224: {
    forest_join_217: {
    forest_join_173: {
    forest_join_167: {
    forest_join_162: {
    forest_join_108: {
    forest_join_107: {
    forest_join_87: {
    forest_join_86: {
    forest_join_75: {
    forest_join_62: {
    forest_join_50: {
    forest_join_41: {
    forest_join_12: {
    life5_3 = (__fieldRead200009_0() ^ 64663144483356L);
    life7_5 = __integerCategory200009_2(__call200009_1());
    if (!((life7_5 != 0))) {
        break forest_join_12;
    }
    __call200009_3(p0, p1, p2);
    }
    life8_16 = __fieldRead200009_5(__fieldRead200009_4(receiver));
    life9_20 = __fieldRead200009_7(__fieldRead200009_6(receiver));
    life10_23 = __integerCategory200009_9(__call200009_8(receiver));
    __call200009_10();
    __call200009_13(__fieldRead200009_12(__fieldRead200009_11(receiver)), "clear");
    if (!((life7_5 != 0))) {
        break forest_join_41;
    }
    __call200009_18(0, 0, __fieldRead200009_15(__fieldRead200009_14(receiver)), __fieldRead200009_17(__fieldRead200009_16(receiver)));
    break forest_join_50;
    }
    __call200009_23(0, 0, __fieldRead200009_20(__fieldRead200009_19(receiver)), __fieldRead200009_22(__fieldRead200009_21(receiver)));
    }
    __call200009_24(receiver, p1);
    __call200009_26(__invokedynamic200009_25(2241, (4984330546313864910L ^ life5_3)));
    if (!((life7_5 != 0))) {
        break forest_join_62;
    }
    __call200009_27();
    }
    __call200009_30(__fieldRead200009_29(__fieldRead200009_28(receiver)), "camera");
    __call200009_31(receiver, p1, p0);
    if (!((life7_5 != 0))) {
        break forest_join_75;
    }
    __call200009_32(p1);
    }
    spill200009_0 = __fieldRead200009_34(__fieldRead200009_33(receiver));
    if (!((__fieldRead200009_37(__fieldRead200009_36(__fieldRead200009_35(receiver))) == 2))) {
        forestValue200009_86_0 = spill200009_0;
        break forest_join_86;
    }
    forestValue200009_87_0 = spill200009_0;
    forestValue200009_87_1 = 1;
    break forest_join_87;
    }
    forestValue200009_87_0 = forestValue200009_86_0;
    forestValue200009_87_1 = 0;
    }
    __call200009_38(forestValue200009_87_0, forestValue200009_87_1);
    __call200009_41(__fieldRead200009_40(__fieldRead200009_39(receiver)), "frustum");
    life11_97 = __call200009_42();
    __call200009_45(__fieldRead200009_44(__fieldRead200009_43(receiver)), "culling");
    spill200009_1 = life11_97;
    if (!(__call200009_46())) {
        forestValue200009_107_0 = spill200009_1;
        break forest_join_107;
    }
    if (!((!__call200009_47()))) {
        forestValue200009_107_0 = spill200009_1;
        break forest_join_107;
    }
    forestValue200009_108_0 = spill200009_1;
    forestValue200009_108_1 = 1;
    break forest_join_108;
    }
    forestValue200009_108_0 = forestValue200009_107_0;
    forestValue200009_108_1 = 0;
    }
    __fieldWrite200009_48(forestValue200009_108_0, forestValue200009_108_1);
    life12_117 = new net.minecraft.client.renderer.culling.Frustum(life11_97);
    life13_121 = __call200009_50(__fieldRead200009_49(receiver));
    life14_133 = (__fieldRead200009_51(life13_121) + ((__fieldRead200009_52(life13_121) - __fieldRead200009_53(life13_121)) * ((double) p1)));
    life16_145 = (__fieldRead200009_54(life13_121) + ((__fieldRead200009_55(life13_121) - __fieldRead200009_56(life13_121)) * ((double) p1)));
    life18_157 = (__fieldRead200009_57(life13_121) + ((__fieldRead200009_58(life13_121) - __fieldRead200009_59(life13_121)) * ((double) p1)));
    if (!((life7_5 != 0))) {
        break forest_join_162;
    }
    __call200009_60(life12_117, life14_133, life16_145, life18_157);
    break forest_join_167;
    }
    __call200009_61(life12_117, life14_133, life16_145, life18_157);
    }
    if (!((!__call200009_62()))) {
        break forest_join_173;
    }
    if (!((!__call200009_63()))) {
        break forest_join_173;
    }
    if (!(__call200009_64())) {
        break forest_join_255;
    }
    }
    if (!((!__fieldRead200009_65()))) {
        break forest_join_255;
    }
    __call200009_66(receiver, -1, p1);
    spill200009_2 = 22520;
    __call200009_69(__fieldRead200009_68(__fieldRead200009_67(receiver)), "sky");
    __call200009_71(__invokedynamic200009_70(spill200009_2, (1898572728138430945L ^ life5_3)));
    spill200009_3 = 25934;
    __call200009_72();
    spill200009_4 = (8139923799155591963L ^ life5_3);
    __call200009_79(__call200009_73(receiver, p1, 1), (((float) __fieldRead200009_75(__fieldRead200009_74(receiver))) / ((float) __fieldRead200009_77(__fieldRead200009_76(receiver)))), 0x1.99999ap-5f, __fieldRead200009_78(receiver));
    __call200009_81(__invokedynamic200009_80(spill200009_3, spill200009_4));
    if (!((life7_5 != 0))) {
        break forest_join_217;
    }
    __call200009_82();
    }
    __call200009_83(life8_16, p1, p0);
    if (!((life7_5 != 0))) {
        break forest_join_224;
    }
    __call200009_84();
    }
    __call200009_86(__invokedynamic200009_85(22520, (1898572728138430945L ^ life5_3)));
    spill200009_5 = 25934;
    __call200009_87();
    spill200009_6 = (8139923799155591963L ^ life5_3);
    __call200009_94(__call200009_88(receiver, p1, 1), (((float) __fieldRead200009_90(__fieldRead200009_89(receiver))) / ((float) __fieldRead200009_92(__fieldRead200009_91(receiver)))), 0x1.99999ap-5f, __fieldRead200009_93(receiver));
    __call200009_96(__invokedynamic200009_95(spill200009_5, spill200009_6));
    break forest_join_256;
    }
    __call200009_97();
    }
    __call200009_98(receiver, 0, p1);
    __call200009_100(__invokedynamic200009_99(22537, (2408367626834605577L ^ life5_3)));
    if (!((__numericCompare200009_106((__fieldRead200009_101(life13_121) + ((double) __call200009_102(life13_121))), (0x1.0p7d + ((double) (__fieldRead200009_105(__fieldRead200009_104(__fieldRead200009_103(receiver))) * 0x1.0p7f)))) < 0))) {
        break forest_join_288;
    }
    __call200009_107(receiver, life8_16, p1, p0);
    }
    __call200009_110(__fieldRead200009_109(__fieldRead200009_108(receiver)), "prepareterrain");
    __call200009_111(receiver, 0, p1);
    __call200009_115(__call200009_113(__fieldRead200009_112(receiver)), __fieldRead200009_114());
    __call200009_116();
    __call200009_119(__fieldRead200009_118(__fieldRead200009_117(receiver)), "terrain_setup");
    __call200009_123(receiver, life13_121, p1, life12_117, __call200009_122(__fieldRead200009_121(__fieldRead200009_120(receiver))));
    if (!((life7_5 != 0))) {
        break forest_join_337;
    }
    spill200009_7 = life8_16;
    spill200009_8 = life13_121;
    spill200009_9 = ((double) p1);
    spill200009_10 = life12_117;
    net.minecraft.client.renderer.EntityRenderer __stackOp200009_124_0 = receiver;
    net.minecraft.client.renderer.EntityRenderer __stackOp200009_126_0 = __stackOp200009_124_0;
    int __stackOp200009_126_1 = __fieldRead200009_125(__stackOp200009_124_0);
    spill200009_11 = __stackOp200009_126_1;
    __fieldWrite200009_127(__stackOp200009_126_0, (__stackOp200009_126_1 + 1));
    __call200009_131(spill200009_7, spill200009_8, spill200009_9, spill200009_10, spill200009_11, __call200009_130(__fieldRead200009_129(__fieldRead200009_128(receiver))));
    break forest_join_354;
    }
    spill200009_12 = life8_16;
    spill200009_13 = life13_121;
    spill200009_14 = ((double) p1);
    spill200009_15 = life12_117;
    net.minecraft.client.renderer.EntityRenderer __stackOp200009_132_0 = receiver;
    net.minecraft.client.renderer.EntityRenderer __stackOp200009_134_0 = __stackOp200009_132_0;
    int __stackOp200009_134_1 = __fieldRead200009_133(__stackOp200009_132_0);
    spill200009_16 = __stackOp200009_134_1;
    __fieldWrite200009_135(__stackOp200009_134_0, (__stackOp200009_134_1 + 1));
    __call200009_139(spill200009_12, spill200009_13, spill200009_14, spill200009_15, spill200009_16, __call200009_138(__fieldRead200009_137(__fieldRead200009_136(receiver))));
    }
    if (!((p0 != 0))) {
        break forest_join_359;
    }
    if (!((p0 == 2))) {
        break forest_join_373;
    }
    }
    __call200009_142(__fieldRead200009_141(__fieldRead200009_140(receiver)), "updatechunks");
    __call200009_144(__fieldRead200009_143());
    __call200009_147(__fieldRead200009_146(__fieldRead200009_145(receiver)), p2);
    __call200009_149(__fieldRead200009_148());
    }
    __call200009_152(__fieldRead200009_151(__fieldRead200009_150(receiver)), "terrain");
    __call200009_154(__fieldRead200009_153());
    if (!(__fieldRead200009_157(__fieldRead200009_156(__fieldRead200009_155(receiver))))) {
        break forest_join_398;
    }
    if (!((p0 > 0))) {
        break forest_join_398;
    }
    __call200009_160(__fieldRead200009_159(__fieldRead200009_158(receiver)), "finish");
    __call200009_161();
    __call200009_164(__fieldRead200009_163(__fieldRead200009_162(receiver)), "terrain");
    }
    __call200009_166(__invokedynamic200009_165(25934, (8139923799155591963L ^ life5_3)));
    __call200009_167();
    __call200009_168();
    if (!((life7_5 != 0))) {
        break forest_join_409;
    }
    __call200009_169();
    }
    __call200009_171(life8_16, __fieldRead200009_170(), ((double) p1), p0, life13_121);
    __call200009_172();
    if (!((life7_5 != 0))) {
        break forest_join_421;
    }
    __call200009_173();
    }
    spill200009_17 = __call200009_177(__call200009_175(__fieldRead200009_174(receiver)), __fieldRead200009_176());
    spill200009_18 = 0;
    if (!((__fieldRead200009_180(__fieldRead200009_179(__fieldRead200009_178(receiver))) > 0))) {
        forestValue200009_434_0 = spill200009_17;
        forestValue200009_434_1 = spill200009_18;
        break forest_join_434;
    }
    forestValue200009_435_0 = spill200009_17;
    forestValue200009_435_1 = spill200009_18;
    forestValue200009_435_2 = 1;
    break forest_join_435;
    }
    forestValue200009_435_0 = forestValue200009_434_0;
    forestValue200009_435_1 = forestValue200009_434_1;
    forestValue200009_435_2 = 0;
    }
    __call200009_181(forestValue200009_435_0, forestValue200009_435_1, forestValue200009_435_2);
    __call200009_183(life8_16, __fieldRead200009_182(), ((double) p1), p0, life13_121);
    __call200009_188(__call200009_187(__call200009_185(__fieldRead200009_184(receiver)), __fieldRead200009_186()));
    __call200009_193(__call200009_192(__call200009_190(__fieldRead200009_189(receiver)), __fieldRead200009_191()), 0, 0);
    if (!((life7_5 != 0))) {
        break forest_join_461;
    }
    __call200009_194();
    }
    __call200009_196(life8_16, __fieldRead200009_195(), ((double) p1), p0, life13_121);
    __call200009_201(__call200009_200(__call200009_198(__fieldRead200009_197(receiver)), __fieldRead200009_199()));
    if (!((life7_5 != 0))) {
        break forest_join_478;
    }
    __call200009_202();
    }
    __call200009_204(__fieldRead200009_203());
    __call200009_206(__invokedynamic200009_205(24062, (6611313832215180186L ^ life5_3)));
    __call200009_208(__invokedynamic200009_207(23041, (4848095034112308303L ^ life5_3)), 0x1.99999ap-4f);
    spill200009_19 = 25934;
    __call200009_209(receiver);
    __call200009_211(__invokedynamic200009_210(spill200009_19, (8139923799155591963L ^ life5_3)));
    spill200009_20 = 25934;
    __call200009_212();
    spill200009_21 = (8139923799155591963L ^ life5_3);
    __call200009_213();
    __call200009_214();
    __call200009_217(__fieldRead200009_216(__fieldRead200009_215(receiver)), "entities");
    __fieldWrite200009_218(1);
    __call200009_219(life8_16, life13_121, life12_117, p1);
    __fieldWrite200009_220(0);
    __call200009_221();
    __call200009_222(receiver);
    __call200009_224(__invokedynamic200009_223(spill200009_20, spill200009_21));
    __call200009_225();
    __call200009_226();
    if (!((__fieldRead200009_228(__fieldRead200009_227(receiver)) != null))) {
        break forest_join_558;
    }
    if (!(__call200009_230(life13_121, __fieldRead200009_229()))) {
        break forest_join_558;
    }
    if (!((life10_23 != 0))) {
        break forest_join_558;
    }
    life20_563 = __cast200009_231(life13_121);
    __call200009_232();
    __call200009_235(__fieldRead200009_234(__fieldRead200009_233(receiver)), "outline");
    __call200009_238(life8_16, life20_563, __fieldRead200009_237(__fieldRead200009_236(receiver)), 0, p1);
    __call200009_239();
    }
    __call200009_241(__invokedynamic200009_240(25934, (8139923799155591963L ^ life5_3)));
    __call200009_242();
    if (!((life10_23 != 0))) {
        break forest_join_598;
    }
    if (!((__fieldRead200009_244(__fieldRead200009_243(receiver)) != null))) {
        break forest_join_598;
    }
    if (!((!__call200009_246(life13_121, __fieldRead200009_245())))) {
        break forest_join_598;
    }
    life20_600 = __cast200009_247(life13_121);
    __call200009_248();
    __call200009_251(__fieldRead200009_250(__fieldRead200009_249(receiver)), "outline");
    if (!((!__fieldRead200009_254(__fieldRead200009_253(__fieldRead200009_252(receiver)))))) {
        break forest_join_597;
    }
    __call200009_257(life8_16, life20_600, __fieldRead200009_256(__fieldRead200009_255(receiver)), 0, p1);
    }
    __call200009_258();
    }
    if (!((!__call200009_260(__fieldRead200009_259(life8_16))))) {
        break forest_join_639;
    }
    __call200009_263(__fieldRead200009_262(__fieldRead200009_261(receiver)), "destroyProgress");
    spill200009_22 = 27000;
    __call200009_264();
    __call200009_266(__invokedynamic200009_265(spill200009_22, (8838308210001495925L ^ life5_3)), 1, 1, 0);
    __call200009_271(__call200009_270(__call200009_268(__fieldRead200009_267(receiver)), __fieldRead200009_269()), 0, 0);
    __call200009_275(life8_16, __call200009_272(), __call200009_274(__call200009_273()), life13_121, p1);
    __call200009_280(__call200009_279(__call200009_277(__fieldRead200009_276(receiver)), __fieldRead200009_278()));
    __call200009_281();
    }
    __call200009_284(__invokedynamic200009_282(27000, (8838308210001495925L ^ life5_3)), __invokedynamic200009_283(4803, (2351873261746371733L ^ life5_3)), 1, 0);
    __call200009_285();
    __call200009_286(receiver);
    __call200009_287(receiver);
    __call200009_290(__fieldRead200009_289(__fieldRead200009_288(receiver)), "litParticles");
    if (!((life7_5 != 0))) {
        break forest_join_666;
    }
    __call200009_291();
    }
    __call200009_292(life9_20, life13_121, p1);
    __call200009_293();
    __call200009_294(receiver, 0, p1);
    __call200009_297(__fieldRead200009_296(__fieldRead200009_295(receiver)), "particles");
    if (!((life7_5 != 0))) {
        break forest_join_683;
    }
    __call200009_298();
    }
    __call200009_299(life9_20, life13_121, p1);
    if (!((life7_5 != 0))) {
        break forest_join_690;
    }
    __call200009_300();
    }
    __call200009_301(receiver);
    __call200009_302(0);
    if (!(__call200009_303())) {
        break forest_join_698;
    }
    __call200009_305(__call200009_304());
    }
    __call200009_306();
    __call200009_309(__fieldRead200009_308(__fieldRead200009_307(receiver)), "weather");
    if (!((life7_5 != 0))) {
        break forest_join_707;
    }
    __call200009_310();
    }
    __call200009_311(receiver, p1);
    if (!((life7_5 != 0))) {
        break forest_join_713;
    }
    __call200009_312();
    }
    __call200009_313(1);
    __call200009_314(life8_16, life13_121, p1);
    if (!((life7_5 != 0))) {
        break forest_join_726;
    }
    __call200009_315(receiver, p1, p0);
    __call200009_316();
    }
    __call200009_317();
    spill200009_23 = 27000;
    __call200009_318();
    __call200009_321(__invokedynamic200009_319(spill200009_23, (8838308210001495925L ^ life5_3)), __invokedynamic200009_320(4803, (2351873261746371733L ^ life5_3)), 1, 0);
    __call200009_323(__invokedynamic200009_322(23041, (4848095034112308303L ^ life5_3)), 0x1.99999ap-4f);
    spill200009_24 = 25976;
    __call200009_324(receiver, 0, p1);
    spill200009_25 = (4979320288434670371L ^ life5_3);
    __call200009_325();
    __call200009_326(0);
    __call200009_330(__call200009_328(__fieldRead200009_327(receiver)), __fieldRead200009_329());
    __call200009_332(__invokedynamic200009_331(spill200009_24, spill200009_25));
    __call200009_335(__fieldRead200009_334(__fieldRead200009_333(receiver)), "translucent");
    if (!((life7_5 != 0))) {
        break forest_join_774;
    }
    __call200009_336();
    }
    __call200009_338(life8_16, __fieldRead200009_337(), ((double) p1), p0, life13_121);
    if (!((life7_5 != 0))) {
        break forest_join_785;
    }
    __call200009_339();
    }
    __call200009_341(__invokedynamic200009_340(23642, (3361664845580038709L ^ life5_3)));
    __call200009_342(1);
    __call200009_343();
    __call200009_344();
    __call200009_345();
    if (!((__numericCompare200009_351((__fieldRead200009_346(life13_121) + ((double) __call200009_347(life13_121))), (0x1.0p7d + ((double) (__fieldRead200009_350(__fieldRead200009_349(__fieldRead200009_348(receiver))) * 0x1.0p7f)))) >= 0))) {
        break forest_join_823;
    }
    __call200009_354(__fieldRead200009_353(__fieldRead200009_352(receiver)), "aboveClouds");
    __call200009_355(receiver, life8_16, p1, p0);
    }
    __call200009_358(__fieldRead200009_357(__fieldRead200009_356(receiver)), "hand");
    __call200009_362(__call200009_360(__call200009_359()), new com.moon.eT(__fieldRead200009_361()));
    __call200009_363(receiver);
    if (!((!__fieldRead200009_364()))) {
        break forest_join_861;
    }
    if (!((life7_5 != 0))) {
        break forest_join_847;
    }
    __call200009_365(receiver, p1, p0);
    __call200009_366();
    }
    if (!((life7_5 != 0))) {
        break forest_join_854;
    }
    __call200009_367(receiver, p1, p0);
    break forest_join_858;
    }
    __call200009_368(receiver, p1, p0);
    }
    __call200009_369(receiver, p1);
    }
    if (!((life7_5 != 0))) {
        break forest_join_864;
    }
    __call200009_370();
    }
    __call200009_374(__call200009_372(__call200009_371()), new com.moon.eT(__fieldRead200009_373()));
    return;
}
public static void h200009_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000900_0(p0);
}
public static void h200009_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000901_0(p0);
}
public static void h200009_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000902_0(p0);
}
public static void h200009_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000903_0(p0);
}
public static void h200009_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000904_0(p0);
}
public static void h200009_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000905_0(p0);
}
public static void h200009_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000906_0(p0);
}
public static void h200009_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000907_0(p0);
}
public static void h200009_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000908_0(p0);
}
public static void h200009_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000909_0(p0);
}
public static void h200009_10(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000910_0(p0);
}
public static void h200009_11(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000911_0(p0);
}
public static void h200009_12(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000912_0(p0);
}
public static void h200009_13(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000913_0(p0);
}
public static void h200009_14(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000914_0(p0);
}
public static void h200009_15(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000915_0(p0);
}
public static void h200009_16(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000916_0(p0);
}
public static void h200009_17(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000917_0(p0);
}
public static void h200009_18(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000918_0(p0);
}
public static void h200009_19(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000919_0(p0);
}
public static void h200009_20(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000920_0(p0);
}
public static void h200009_21(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000921_0(p0);
}
public static void h200009_22(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000922_0(p0);
}
public static void h200009_23(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000923_0(p0);
}
public static void h200009_24(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000924_0(p0);
}
public static void h200009_25(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000925_0(p0);
}
public static void h200009_26(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000926_0(p0);
}
public static void h200009_27(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000927_0(p0);
}
public static void h200009_28(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000928_0(p0);
}
public static void h200009_29(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000929_0(p0);
}
public static void h200009_30(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000930_0(p0);
}
public static void h200009_31(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000931_0(p0);
}
public static void h200009_32(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000932_0(p0);
}
public static void h200009_33(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000933_0(p0);
}
public static void h200009_34(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000934_0(p0);
}
public static void h200009_35(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000935_0(p0);
}
public static void h200009_36(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000936_0(p0);
}
public static void h200009_37(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000937_0(p0);
}
public static void h200009_38(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000938_0(p0);
}
public static void h200009_39(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000939_0(p0);
}
public static void h200009_40(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000940_0(p0);
}
public static void h200009_41(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000941_0(p0);
}
public static void h200009_42(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000942_0(p0);
}
public static void h200009_43(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000943_0(p0);
}
public static void h200009_44(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call23000944_0(p0);
}
private static native long __fieldRead200009_0() throws Throwable;
private static native boolean __call200009_1() throws Throwable;
private static native int __integerCategory200009_2(boolean value) throws Throwable;
private static native void __call200009_3(int a0, float a1, long a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead200009_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_6(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.particle.EffectRenderer __fieldRead200009_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call200009_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __integerCategory200009_9(boolean value) throws Throwable;
private static native void __call200009_10() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_11(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_13(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_14(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead200009_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_16(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead200009_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_18(int a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_19(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead200009_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_21(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead200009_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_23(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call200009_24(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native int __invokedynamic200009_25(int a0, long a1) throws Throwable;
private static native void __call200009_26(int a0) throws Throwable;
private static native void __call200009_27() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_28(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_30(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call200009_31(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2) throws Throwable;
private static native void __call200009_32(float a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_33(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead200009_34(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_35(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead200009_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead200009_37(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call200009_38(net.minecraft.client.entity.EntityPlayerSP a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_39(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_40(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_41(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.mv __call200009_42() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_43(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_44(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_45(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __call200009_46() throws Throwable;
private static native boolean __call200009_47() throws Throwable;
private static native void __fieldWrite200009_48(moom.mv a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_49(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call200009_50(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead200009_51(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead200009_52(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead200009_53(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead200009_54(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead200009_55(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead200009_56(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead200009_57(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead200009_58(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead200009_59(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call200009_60(net.minecraft.client.renderer.culling.Frustum a0, double a1, double a2, double a3) throws Throwable;
private static native void __call200009_61(net.minecraft.client.renderer.culling.Frustum a0, double a1, double a2, double a3) throws Throwable;
private static native boolean __call200009_62() throws Throwable;
private static native boolean __call200009_63() throws Throwable;
private static native boolean __call200009_64() throws Throwable;
private static native boolean __fieldRead200009_65() throws Throwable;
private static native void __call200009_66(net.minecraft.client.renderer.EntityRenderer a0, int a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_67(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_68(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_69(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic200009_70(int a0, long a1) throws Throwable;
private static native void __call200009_71(int a0) throws Throwable;
private static native void __call200009_72() throws Throwable;
private static native float __call200009_73(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_74(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead200009_75(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_76(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead200009_77(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead200009_78(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call200009_79(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic200009_80(int a0, long a1) throws Throwable;
private static native void __call200009_81(int a0) throws Throwable;
private static native void __call200009_82() throws Throwable;
private static native void __call200009_83(net.minecraft.client.renderer.RenderGlobal a0, float a1, int a2) throws Throwable;
private static native void __call200009_84() throws Throwable;
private static native int __invokedynamic200009_85(int a0, long a1) throws Throwable;
private static native void __call200009_86(int a0) throws Throwable;
private static native void __call200009_87() throws Throwable;
private static native float __call200009_88(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_89(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead200009_90(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_91(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead200009_92(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead200009_93(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call200009_94(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic200009_95(int a0, long a1) throws Throwable;
private static native void __call200009_96(int a0) throws Throwable;
private static native void __call200009_97() throws Throwable;
private static native void __call200009_98(net.minecraft.client.renderer.EntityRenderer a0, int a1, float a2) throws Throwable;
private static native int __invokedynamic200009_99(int a0, long a1) throws Throwable;
private static native void __call200009_100(int a0) throws Throwable;
private static native double __fieldRead200009_101(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call200009_102(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_103(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead200009_104(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead200009_105(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __numericCompare200009_106(double a0, double a1) throws Throwable;
private static native void __call200009_107(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.client.renderer.RenderGlobal a1, float a2, int a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_108(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_109(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_110(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call200009_111(net.minecraft.client.renderer.EntityRenderer a0, int a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_112(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call200009_113(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead200009_114() throws Throwable;
private static native void __call200009_115(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call200009_116() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_117(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_118(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_119(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_120(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead200009_121(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call200009_122(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call200009_123(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.entity.Entity a1, float a2, net.minecraft.client.renderer.culling.Frustum a3, boolean a4) throws Throwable;
private static native int __fieldRead200009_125(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite200009_127(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_128(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead200009_129(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call200009_130(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call200009_131(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.Entity a1, double a2, net.minecraft.client.renderer.culling.Frustum a3, int a4, boolean a5) throws Throwable;
private static native int __fieldRead200009_133(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite200009_135(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_136(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead200009_137(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call200009_138(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call200009_139(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.Entity a1, double a2, net.minecraft.client.renderer.culling.Frustum a3, int a4, boolean a5) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_140(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_141(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_142(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.JL __fieldRead200009_143() throws Throwable;
private static native void __call200009_144(moom.JL a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_145(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead200009_146(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_147(net.minecraft.client.renderer.RenderGlobal a0, long a1) throws Throwable;
private static native moom.JL __fieldRead200009_148() throws Throwable;
private static native void __call200009_149(moom.JL a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_150(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_151(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_152(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.JL __fieldRead200009_153() throws Throwable;
private static native void __call200009_154(moom.JL a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_155(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead200009_156(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead200009_157(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_158(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_159(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_160(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call200009_161() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_162(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_163(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_164(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic200009_165(int a0, long a1) throws Throwable;
private static native void __call200009_166(int a0) throws Throwable;
private static native void __call200009_167() throws Throwable;
private static native void __call200009_168() throws Throwable;
private static native void __call200009_169() throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead200009_170() throws Throwable;
private static native int __call200009_171(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.util.EnumWorldBlockLayer a1, double a2, int a3, net.minecraft.entity.Entity a4) throws Throwable;
private static native void __call200009_172() throws Throwable;
private static native void __call200009_173() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_174(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call200009_175(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead200009_176() throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call200009_177(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_178(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead200009_179(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead200009_180(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call200009_181(net.minecraft.client.renderer.texture.ITextureObject a0, int a1, int a2) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead200009_182() throws Throwable;
private static native int __call200009_183(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.util.EnumWorldBlockLayer a1, double a2, int a3, net.minecraft.entity.Entity a4) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_184(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call200009_185(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead200009_186() throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call200009_187(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call200009_188(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_189(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call200009_190(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead200009_191() throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call200009_192(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call200009_193(net.minecraft.client.renderer.texture.ITextureObject a0, int a1, int a2) throws Throwable;
private static native void __call200009_194() throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead200009_195() throws Throwable;
private static native int __call200009_196(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.util.EnumWorldBlockLayer a1, double a2, int a3, net.minecraft.entity.Entity a4) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_197(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call200009_198(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead200009_199() throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call200009_200(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call200009_201(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native void __call200009_202() throws Throwable;
private static native moom.JL __fieldRead200009_203() throws Throwable;
private static native void __call200009_204(moom.JL a0) throws Throwable;
private static native int __invokedynamic200009_205(int a0, long a1) throws Throwable;
private static native void __call200009_206(int a0) throws Throwable;
private static native int __invokedynamic200009_207(int a0, long a1) throws Throwable;
private static native void __call200009_208(int a0, float a1) throws Throwable;
private static native java.lang.Object __call200009_209(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __invokedynamic200009_210(int a0, long a1) throws Throwable;
private static native void __call200009_211(int a0) throws Throwable;
private static native void __call200009_212() throws Throwable;
private static native void __call200009_213() throws Throwable;
private static native void __call200009_214() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_215(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_216(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_217(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite200009_218(int a0) throws Throwable;
private static native void __call200009_219(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.Entity a1, net.minecraft.client.renderer.culling.Frustum a2, float a3) throws Throwable;
private static native void __fieldWrite200009_220(int a0) throws Throwable;
private static native void __call200009_221() throws Throwable;
private static native void __call200009_222(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __invokedynamic200009_223(int a0, long a1) throws Throwable;
private static native void __call200009_224(int a0) throws Throwable;
private static native void __call200009_225() throws Throwable;
private static native void __call200009_226() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_227(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead200009_228(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.fn __fieldRead200009_229() throws Throwable;
private static native boolean __call200009_230(net.minecraft.entity.Entity a0, moom.fn a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast200009_231(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call200009_232() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_233(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_234(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_235(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_236(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead200009_237(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_238(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.player.EntityPlayer a1, net.minecraft.util.MovingObjectPosition a2, int a3, float a4) throws Throwable;
private static native void __call200009_239() throws Throwable;
private static native int __invokedynamic200009_240(int a0, long a1) throws Throwable;
private static native void __call200009_241(int a0) throws Throwable;
private static native void __call200009_242() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_243(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead200009_244(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.fn __fieldRead200009_245() throws Throwable;
private static native boolean __call200009_246(net.minecraft.entity.Entity a0, moom.fn a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast200009_247(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call200009_248() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_249(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_250(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_251(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_252(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead200009_253(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead200009_254(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_255(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead200009_256(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_257(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.player.EntityPlayer a1, net.minecraft.util.MovingObjectPosition a2, int a3, float a4) throws Throwable;
private static native void __call200009_258() throws Throwable;
private static native java.util.Map __fieldRead200009_259(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call200009_260(java.util.Map a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_261(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_262(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_263(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call200009_264() throws Throwable;
private static native int __invokedynamic200009_265(int a0, long a1) throws Throwable;
private static native void __call200009_266(int a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_267(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call200009_268(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead200009_269() throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call200009_270(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call200009_271(net.minecraft.client.renderer.texture.ITextureObject a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call200009_272() throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call200009_273() throws Throwable;
private static native moom.lw __call200009_274(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call200009_275(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.client.renderer.Tessellator a1, moom.lw a2, net.minecraft.entity.Entity a3, float a4) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_276(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call200009_277(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead200009_278() throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call200009_279(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call200009_280(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native void __call200009_281() throws Throwable;
private static native int __invokedynamic200009_282(int a0, long a1) throws Throwable;
private static native int __invokedynamic200009_283(int a0, long a1) throws Throwable;
private static native void __call200009_284(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call200009_285() throws Throwable;
private static native java.lang.Object __call200009_286(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call200009_287(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_288(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_289(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_290(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call200009_291() throws Throwable;
private static native void __call200009_292(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native void __call200009_293() throws Throwable;
private static native void __call200009_294(net.minecraft.client.renderer.EntityRenderer a0, int a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_295(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_296(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_297(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call200009_298() throws Throwable;
private static native void __call200009_299(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native void __call200009_300() throws Throwable;
private static native void __call200009_301(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call200009_302(int a0) throws Throwable;
private static native boolean __call200009_303() throws Throwable;
private static native boolean __call200009_304() throws Throwable;
private static native void __call200009_305(boolean a0) throws Throwable;
private static native void __call200009_306() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_307(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_308(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_309(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call200009_310() throws Throwable;
private static native void __call200009_311(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __call200009_312() throws Throwable;
private static native void __call200009_313(int a0) throws Throwable;
private static native void __call200009_314(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native void __call200009_315(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2) throws Throwable;
private static native void __call200009_316() throws Throwable;
private static native void __call200009_317() throws Throwable;
private static native void __call200009_318() throws Throwable;
private static native int __invokedynamic200009_319(int a0, long a1) throws Throwable;
private static native int __invokedynamic200009_320(int a0, long a1) throws Throwable;
private static native void __call200009_321(int a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic200009_322(int a0, long a1) throws Throwable;
private static native void __call200009_323(int a0, float a1) throws Throwable;
private static native void __call200009_324(net.minecraft.client.renderer.EntityRenderer a0, int a1, float a2) throws Throwable;
private static native void __call200009_325() throws Throwable;
private static native void __call200009_326(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_327(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call200009_328(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead200009_329() throws Throwable;
private static native void __call200009_330(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic200009_331(int a0, long a1) throws Throwable;
private static native void __call200009_332(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_333(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_334(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_335(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call200009_336() throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead200009_337() throws Throwable;
private static native int __call200009_338(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.util.EnumWorldBlockLayer a1, double a2, int a3, net.minecraft.entity.Entity a4) throws Throwable;
private static native void __call200009_339() throws Throwable;
private static native int __invokedynamic200009_340(int a0, long a1) throws Throwable;
private static native void __call200009_341(int a0) throws Throwable;
private static native void __call200009_342(int a0) throws Throwable;
private static native void __call200009_343() throws Throwable;
private static native void __call200009_344() throws Throwable;
private static native void __call200009_345() throws Throwable;
private static native double __fieldRead200009_346(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call200009_347(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_348(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead200009_349(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead200009_350(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __numericCompare200009_351(double a0, double a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_352(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_353(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_354(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call200009_355(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.client.renderer.RenderGlobal a1, float a2, int a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200009_356(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead200009_357(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200009_358(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call200009_359() throws Throwable;
private static native com.moon.events.EventBus __call200009_360(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.a2 __fieldRead200009_361() throws Throwable;
private static native void __call200009_362(com.moon.events.EventBus a0, com.moon.eT a1) throws Throwable;
private static native java.lang.Object __call200009_363(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native boolean __fieldRead200009_364() throws Throwable;
private static native void __call200009_365(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2) throws Throwable;
private static native void __call200009_366() throws Throwable;
private static native void __call200009_367(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2) throws Throwable;
private static native void __call200009_368(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2) throws Throwable;
private static native void __call200009_369(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __call200009_370() throws Throwable;
private static native com.moon.runtime.ClientContext __call200009_371() throws Throwable;
private static native com.moon.events.EventBus __call200009_372(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.a2 __fieldRead200009_373() throws Throwable;
private static native void __call200009_374(com.moon.events.EventBus a0, com.moon.eT a1) throws Throwable;
private static native java.lang.Throwable __call23000900_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000901_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000902_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000903_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000904_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000905_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000906_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000907_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000908_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000909_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000910_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000911_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000912_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000913_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000914_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000915_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000916_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000917_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000918_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000919_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000920_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000921_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000922_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000923_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000924_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000925_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000926_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000927_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000928_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000929_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000930_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000931_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000932_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000933_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000934_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000935_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000936_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000937_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000938_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000939_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000940_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000941_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000942_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000943_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call23000944_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5a41d40e01c5cc9a7860(net.minecraft.client.renderer.EntityRenderer a0, int a1, int a2) throws E;
private static final class __SourceHandler_5a41d40e01c5cc9a7860 {

public static void f2433(net.minecraft.client.renderer.EntityRenderer receiver, int p0, int p1) throws Throwable {
    if (__fieldRead2433_0()) {
        if ((__fieldRead2433_1(receiver) != null)) {
        __call2433_3(__fieldRead2433_2(receiver), p0, p1);
    }
        __call2433_6(__fieldRead2433_5(__fieldRead2433_4(receiver)), p0, p1);
    }
    return;
}
public static void h2433_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243300_0(p0);
}
public static void h2433_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243301_0(p0);
}
private static native boolean __fieldRead2433_0() throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2433_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2433_2(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call2433_3(net.minecraft.client.shader.ShaderGroup a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2433_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead2433_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2433_6(net.minecraft.client.renderer.RenderGlobal a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1243300_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243301_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7c017a464c6f4fb88e2b(net.minecraft.client.renderer.EntityRenderer a0, moom.DD a1) throws E;
private static final class __SourceHandler_7c017a464c6f4fb88e2b {

public static void f582(net.minecraft.client.renderer.EntityRenderer receiver, moom.DD p0) throws Throwable {
    if (__call582_0()) {
        __fieldWrite582_6(receiver, new net.minecraft.client.shader.ShaderGroup(__call582_2(__fieldRead582_1(receiver)), __fieldRead582_3(receiver), __call582_5(__fieldRead582_4(receiver)), p0));
        __call582_12(__fieldRead582_7(receiver), __fieldRead582_9(__fieldRead582_8(receiver)), __fieldRead582_11(__fieldRead582_10(receiver)));
        __fieldWrite582_13(receiver, 1);
    } else {
        
    }
    return;
}
public static void h582_0(moom.Oo p0) throws Throwable {
    throw __call2058200_0(p0);
}
public static void h582_1(java.lang.Exception p0, net.minecraft.client.renderer.EntityRenderer p1, moom.DD p2) throws Throwable {
    java.lang.Exception local3 = p0;
    __call2058201_2(__fieldRead2058201_0(), __invokedynamic2058201_1(p2), local3);
    __fieldWrite2058201_4(p1, __fieldRead2058201_3());
    __fieldWrite2058201_5(p1, 0);
    return;
}
private static native boolean __call582_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead582_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call582_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.oR __fieldRead582_3(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead582_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __call582_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite582_6(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.client.shader.ShaderGroup a1) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead582_7(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead582_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead582_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead582_10(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead582_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call582_12(net.minecraft.client.shader.ShaderGroup a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite582_13(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native java.lang.Throwable __call2058200_0(moom.Oo a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2058201_0() throws Throwable;
private static native java.lang.String __invokedynamic2058201_1(moom.DD a0) throws Throwable;
private static native void __call2058201_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native int __fieldRead2058201_3() throws Throwable;
private static native void __fieldWrite2058201_4(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite2058201_5(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_01a131300656b33cedcb(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.client.gui.GuiMainMenu a1) throws E;
private static final class __SourceHandler_01a131300656b33cedcb {

public static void f232(net.minecraft.client.renderer.EntityRenderer receiver, net.minecraft.client.gui.GuiMainMenu p0) throws Throwable {
    long life2_3;
    java.lang.String life4_5;
    java.util.Calendar life5_7;
    int life6_16;
    int life7_22;
    life2_3 = (__fieldRead232_0() ^ 120111699781173L);
    life4_5 = null;
    life5_7 = __call232_1();
    __call232_2(life5_7, new java.util.Date());
    life6_16 = __call232_3(life5_7, 5);
    life7_22 = (__call232_4(life5_7, 2) + 1);
    if ((life6_16 == __invokedynamic232_5(27870, (8135814309659471586L ^ life2_3)))) {
        if ((life7_22 == 4)) {
        life4_5 = "Happy birthday, OptiFine!";
    }
    }
    if ((life6_16 == __invokedynamic232_6(19658, (2989895970010156783L ^ life2_3)))) {
        if ((life7_22 == __invokedynamic232_7(27870, (8135814309659471586L ^ life2_3)))) {
        life4_5 = "Happy birthday, sp614x!";
    }
    }
    if ((life4_5 == null)) {
        return;
    }
    __fieldWrite232_8(p0, life4_5);
    return;
}
public static void h232_0(java.lang.Throwable p0) throws Throwable {
    throw __call2023200_0(p0);
}
public static void h232_1(java.lang.Throwable p0) throws Throwable {
    throw __call2023201_0(p0);
}
public static void h232_2(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    return;
}
private static native long __fieldRead232_0() throws Throwable;
private static native java.util.Calendar __call232_1() throws Throwable;
private static native void __call232_2(java.util.Calendar a0, java.util.Date a1) throws Throwable;
private static native int __call232_3(java.util.Calendar a0, int a1) throws Throwable;
private static native int __call232_4(java.util.Calendar a0, int a1) throws Throwable;
private static native int __invokedynamic232_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic232_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic232_7(int a0, long a1) throws Throwable;
private static native void __fieldWrite232_8(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call2023200_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2023201_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fb1b425dd81d3a37e075(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.client.renderer.RenderGlobal a1, float a2, int a3) throws E;
private static final class __SourceHandler_fb1b425dd81d3a37e075 {

public static void f100153(net.minecraft.client.renderer.EntityRenderer receiver, net.minecraft.client.renderer.RenderGlobal p0, float p1, int p2) throws Throwable {
    int spill100153_0;
    long spill100153_1;
    int spill100153_2;
    long spill100153_3;
    int spill100153_4;
    long spill100153_5;
    long life4_3;
    forest_join_95: {
    life4_3 = (__fieldRead100153_0() ^ 93272327859524L);
    if (!((__fieldRead100153_3(__fieldRead100153_2(__fieldRead100153_1(receiver))) >= 4))) {
        break forest_join_95;
    }
    if (!((!__call100153_4()))) {
        break forest_join_95;
    }
    if (!(__call100153_7(__fieldRead100153_6(__fieldRead100153_5(receiver))))) {
        break forest_join_95;
    }
    __call100153_10(__fieldRead100153_9(__fieldRead100153_8(receiver)), "clouds");
    __call100153_12(__invokedynamic100153_11(22520, (1898684840339218105L ^ life4_3)));
    spill100153_0 = 25934;
    __call100153_13();
    spill100153_1 = (8139903977477319747L ^ life4_3);
    __call100153_20(__call100153_14(receiver, p1, 1), (((float) __fieldRead100153_16(__fieldRead100153_15(receiver))) / ((float) __fieldRead100153_18(__fieldRead100153_17(receiver)))), 0x1.99999ap-5f, (__fieldRead100153_19(receiver) * 0x1.0p2f));
    __call100153_22(__invokedynamic100153_21(spill100153_0, spill100153_1));
    spill100153_2 = 22520;
    __call100153_23();
    spill100153_3 = (1898684840339218105L ^ life4_3);
    __call100153_24(receiver, 0, p1);
    __call100153_25(p0, p1, p2);
    __call100153_26();
    __call100153_27();
    __call100153_29(__invokedynamic100153_28(spill100153_2, spill100153_3));
    spill100153_4 = 25934;
    __call100153_30();
    spill100153_5 = (8139903977477319747L ^ life4_3);
    __call100153_37(__call100153_31(receiver, p1, 1), (((float) __fieldRead100153_33(__fieldRead100153_32(receiver))) / ((float) __fieldRead100153_35(__fieldRead100153_34(receiver)))), 0x1.99999ap-5f, __fieldRead100153_36(receiver));
    __call100153_39(__invokedynamic100153_38(spill100153_4, spill100153_5));
    }
    return;
}
public static void h100153_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13015300_0(p0);
}
public static void h100153_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13015301_0(p0);
}
public static void h100153_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13015302_0(p0);
}
private static native long __fieldRead100153_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100153_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead100153_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead100153_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call100153_4() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100153_5(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead100153_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call100153_7(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100153_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead100153_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100153_10(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic100153_11(int a0, long a1) throws Throwable;
private static native void __call100153_12(int a0) throws Throwable;
private static native void __call100153_13() throws Throwable;
private static native float __call100153_14(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100153_15(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead100153_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100153_17(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead100153_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead100153_19(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call100153_20(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic100153_21(int a0, long a1) throws Throwable;
private static native void __call100153_22(int a0) throws Throwable;
private static native void __call100153_23() throws Throwable;
private static native void __call100153_24(net.minecraft.client.renderer.EntityRenderer a0, int a1, float a2) throws Throwable;
private static native void __call100153_25(net.minecraft.client.renderer.RenderGlobal a0, float a1, int a2) throws Throwable;
private static native void __call100153_26() throws Throwable;
private static native void __call100153_27() throws Throwable;
private static native int __invokedynamic100153_28(int a0, long a1) throws Throwable;
private static native void __call100153_29(int a0) throws Throwable;
private static native void __call100153_30() throws Throwable;
private static native float __call100153_31(net.minecraft.client.renderer.EntityRenderer a0, float a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100153_32(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead100153_33(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100153_34(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead100153_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead100153_36(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call100153_37(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic100153_38(int a0, long a1) throws Throwable;
private static native void __call100153_39(int a0) throws Throwable;
private static native java.lang.Throwable __call13015300_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13015301_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13015302_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_340f1cce372bca1286c1(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_340f1cce372bca1286c1 {

public static void f2437(net.minecraft.client.renderer.EntityRenderer receiver, net.minecraft.entity.Entity p0) throws Throwable {
    if (__fieldRead2437_0()) {
        if ((__fieldRead2437_1(receiver) != null)) {
        __call2437_3(__fieldRead2437_2(receiver));
    }
        __fieldWrite2437_4(receiver, null);
        if ((__instanceOf2437_5(p0) != 0)) {
        __call2437_6(receiver, new moom.DD("shaders/post/creeper.json"));
    } else {
        if ((__instanceOf2437_7(p0) != 0)) {
        __call2437_8(receiver, new moom.DD("shaders/post/spider.json"));
    } else {
        if ((__instanceOf2437_9(p0) != 0)) {
        __call2437_10(receiver, new moom.DD("shaders/post/invert.json"));
    }
    }
    }
    }
    return;
}
public static void h2437_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243700_0(p0);
}
public static void h2437_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243701_0(p0);
}
public static void h2437_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243702_0(p0);
}
public static void h2437_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243703_0(p0);
}
public static void h2437_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1243704_0(p0);
}
private static native boolean __fieldRead2437_0() throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2437_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2437_2(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call2437_3(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native void __fieldWrite2437_4(net.minecraft.client.renderer.EntityRenderer a0, java.lang.Object a1) throws Throwable;
private static native int __instanceOf2437_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call2437_6(net.minecraft.client.renderer.EntityRenderer a0, moom.DD a1) throws Throwable;
private static native int __instanceOf2437_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call2437_8(net.minecraft.client.renderer.EntityRenderer a0, moom.DD a1) throws Throwable;
private static native int __instanceOf2437_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call2437_10(net.minecraft.client.renderer.EntityRenderer a0, moom.DD a1) throws Throwable;
private static native java.lang.Throwable __call1243700_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243701_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243702_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243703_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1243704_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_78dc1beeab0ab2c0dfa0(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.entity.Entity a1, double a2, net.minecraft.client.renderer.culling.ICamera a3, boolean a4) throws E;
private static final class __SourceHandler_78dc1beeab0ab2c0dfa0 {

public static void f583(net.minecraft.client.renderer.EntityRenderer receiver, net.minecraft.entity.Entity p0, double p1, net.minecraft.client.renderer.culling.ICamera p2, boolean p3) throws Throwable {
    net.minecraft.client.renderer.RenderGlobal spill583_0;
    net.minecraft.entity.Entity spill583_1;
    double spill583_2;
    net.minecraft.client.renderer.culling.ICamera spill583_3;
    int spill583_4;
    long life6_3;
    int life8_8;
    int life9_13;
    net.minecraft.client.renderer.RenderGlobal life10_29;
    int life11_32;
    long life12_34;
    long life14_44;
    int life16_46;
    int life17_48;
    int life17_50;
    int life18_52;
    int life16_86;
    life6_3 = (__fieldRead583_0() ^ 71584422365327L);
    life8_8 = __fieldRead583_3(__fieldRead583_2(__fieldRead583_1(receiver)));
    life9_13 = __integerCategory583_7(__fieldRead583_6(__fieldRead583_5(__fieldRead583_4(receiver))));
    __fieldWrite583_11(__fieldRead583_9(__fieldRead583_8(receiver)), __invokedynamic583_10(11662, (8187103656142586189L ^ life6_3)));
    __fieldWrite583_14(__fieldRead583_13(__fieldRead583_12(receiver)), 0);
    life10_29 = __call583_15();
    life11_32 = __call583_16(life10_29);
    life12_34 = __call583_17();
    __call583_18("Loading visible chunks");
    life14_44 = (__call583_19() + __invokedynamic583_20(4850, (775888722088191572L ^ life6_3)));
    life16_46 = 0;
    life17_48 = 0;
    forest_cycle_49: while (true) {
    forest_join_133: {
    forest_join_118: {
    forest_join_109: {
    life17_50 = 0;
    life18_52 = 0;
    forest_cycle_53: while (true) {
    forest_join_107: {
    forest_join_99: {
    forest_join_81: {
    if (!((life18_52 < __invokedynamic583_21(15605, (2175693600401543227L ^ life6_3))))) {
        break forest_join_109;
    }
    __fieldWrite583_22(life10_29, 1);
    spill583_0 = life10_29;
    spill583_1 = p0;
    spill583_2 = p1;
    spill583_3 = p2;
    net.minecraft.client.renderer.EntityRenderer __stackOp583_23_0 = receiver;
    net.minecraft.client.renderer.EntityRenderer __stackOp583_25_0 = __stackOp583_23_0;
    int __stackOp583_25_1 = __fieldRead583_24(__stackOp583_23_0);
    spill583_4 = __stackOp583_25_1;
    __fieldWrite583_26(__stackOp583_25_0, (__stackOp583_25_1 + 1));
    __call583_27(spill583_0, spill583_1, spill583_2, spill583_3, spill583_4, p3);
    if (!((!__call583_28(life10_29)))) {
        break forest_join_81;
    }
    life17_50 = 1;
    }
    life16_86 = (life16_46 + __call583_29(life10_29));
    forest_cycle_86: while (true) {
    if (!((!__call583_30(life10_29)))) {
        break forest_join_99;
    }
    __call583_33(life10_29, (__call583_31() + __invokedynamic583_32(30717, (4590959440262234960L ^ life6_3))));
    continue forest_cycle_86;
    }
    }
    life16_46 = (life16_86 - __call583_34(life10_29));
    if (!((life17_50 == 0))) {
        break forest_join_107;
    }
    break forest_join_109;
    }
    life18_52 += 1;
    continue forest_cycle_53;
    }
    }
    if (!((__call583_35(life10_29) != life11_32))) {
        break forest_join_118;
    }
    life17_50 = 1;
    life11_32 = __call583_36(life10_29);
    }
    if (!((__numericCompare583_38(__call583_37(), life14_44) > 0))) {
        break forest_join_133;
    }
    __call583_40(__invokedynamic583_39(life16_46));
    life14_44 = (__call583_41() + __invokedynamic583_42(21059, (64406337908418283L ^ life6_3)));
    }
    if (!((life17_50 == 0))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    __call583_44(__invokedynamic583_43(life16_46));
    __call583_45("Finished loading visible chunks");
    __fieldWrite583_46(0);
    __fieldWrite583_49(__fieldRead583_48(__fieldRead583_47(receiver)), life8_8);
    __fieldWrite583_52(__fieldRead583_51(__fieldRead583_50(receiver)), life9_13);
    return;
}
public static void h583_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058300_0(p0);
}
public static void h583_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058301_0(p0);
}
public static void h583_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058302_0(p0);
}
public static void h583_3(java.lang.Throwable p0, net.minecraft.client.renderer.EntityRenderer p1, int p2, int p3) throws Throwable {
    java.lang.Throwable life4_2;
    life4_2 = p0;
    __fieldWrite3058303_2(__fieldRead3058303_1(__fieldRead3058303_0(p1)), p2);
    __fieldWrite3058303_5(__fieldRead3058303_4(__fieldRead3058303_3(p1)), p3);
    throw life4_2;
}
private static native long __fieldRead583_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead583_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead583_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead583_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead583_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead583_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead583_6(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory583_7(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead583_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead583_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic583_10(int a0, long a1) throws Throwable;
private static native void __fieldWrite583_11(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead583_12(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead583_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite583_14(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __call583_15() throws Throwable;
private static native int __call583_16(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native long __call583_17() throws Throwable;
private static native void __call583_18(java.lang.String a0) throws Throwable;
private static native long __call583_19() throws Throwable;
private static native long __invokedynamic583_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic583_21(int a0, long a1) throws Throwable;
private static native void __fieldWrite583_22(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native int __fieldRead583_24(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite583_26(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native void __call583_27(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.Entity a1, double a2, net.minecraft.client.renderer.culling.ICamera a3, int a4, boolean a5) throws Throwable;
private static native boolean __call583_28(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call583_29(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call583_30(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native long __call583_31() throws Throwable;
private static native long __invokedynamic583_32(int a0, long a1) throws Throwable;
private static native void __call583_33(net.minecraft.client.renderer.RenderGlobal a0, long a1) throws Throwable;
private static native int __call583_34(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call583_35(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call583_36(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native long __call583_37() throws Throwable;
private static native int __numericCompare583_38(long a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic583_39(int a0) throws Throwable;
private static native void __call583_40(java.lang.String a0) throws Throwable;
private static native long __call583_41() throws Throwable;
private static native long __invokedynamic583_42(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic583_43(int a0) throws Throwable;
private static native void __call583_44(java.lang.String a0) throws Throwable;
private static native void __call583_45(java.lang.String a0) throws Throwable;
private static native void __fieldWrite583_46(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead583_47(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead583_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite583_49(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead583_50(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead583_51(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite583_52(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3058300_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058301_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058302_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3058303_0(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead3058303_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite3058303_2(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3058303_3(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead3058303_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite3058303_5(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8fd35b29da8e0766b0d4(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.entity.Entity a1, float a2, net.minecraft.client.renderer.culling.ICamera a3, boolean a4) throws E;
private static final class __SourceHandler_8fd35b29da8e0766b0d4 {

public static void f100152(net.minecraft.client.renderer.EntityRenderer receiver, net.minecraft.entity.Entity p0, float p1, net.minecraft.client.renderer.culling.ICamera p2, boolean p3) throws Throwable {
    long life5_3;
    int life7_9;
    moom.CM life8_61;
    forest_join_66: {
    forest_join_48: {
    forest_join_29: {
    life5_3 = (__fieldRead100152_0() ^ 126906366052213L);
    life7_9 = __invokedynamic100152_1(15446, (229446276773682983L ^ life5_3));
    if (!(__fieldRead100152_2(receiver))) {
        break forest_join_29;
    }
    __fieldWrite100152_3(receiver, 0);
    __call100152_4(receiver, p0, ((double) p1), p2, p3);
    __call100152_8(__call100152_7(__fieldRead100152_6(__fieldRead100152_5(receiver))), life7_9);
    }
    if (!(__call100152_10(__invokedynamic100152_9(2284, (7184713203911338881L ^ life5_3))))) {
        break forest_join_66;
    }
    if (!(__call100152_12(__invokedynamic100152_11(5766, (5106179103092848056L ^ life5_3))))) {
        break forest_join_66;
    }
    if (!((__fieldRead100152_14(__fieldRead100152_13(receiver)) != null))) {
        break forest_join_48;
    }
    return;
    }
    __fieldWrite100152_15(receiver, 1);
    life8_61 = new moom.CM(__call100152_16("of.message.loadingVisibleChunks", new java.lang.Object[0]));
    __call100152_20(__call100152_19(__fieldRead100152_18(__fieldRead100152_17(receiver))), life8_61, life7_9);
    }
    return;
}
public static void h100152_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13015200_0(p0);
}
public static void h100152_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13015201_0(p0);
}
public static void h100152_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13015202_0(p0);
}
public static void h100152_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13015203_0(p0);
}
private static native long __fieldRead100152_0() throws Throwable;
private static native int __invokedynamic100152_1(int a0, long a1) throws Throwable;
private static native boolean __fieldRead100152_2(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite100152_3(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native void __call100152_4(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.entity.Entity a1, double a2, net.minecraft.client.renderer.culling.ICamera a3, boolean a4) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100152_5(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead100152_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call100152_7(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call100152_8(moom.gB a0, int a1) throws Throwable;
private static native int __invokedynamic100152_9(int a0, long a1) throws Throwable;
private static native boolean __call100152_10(int a0) throws Throwable;
private static native int __invokedynamic100152_11(int a0, long a1) throws Throwable;
private static native boolean __call100152_12(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100152_13(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead100152_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite100152_15(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native java.lang.String __call100152_16(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100152_17(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead100152_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call100152_19(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call100152_20(moom.gB a0, moom.CM a1, int a2) throws Throwable;
private static native java.lang.Throwable __call13015200_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13015201_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13015202_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13015203_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_35fe494e684b10268304(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.entity.EntityLivingBase a1, float a2) throws E;
private static final class __SourceHandler_35fe494e684b10268304 {

public static float f2440(net.minecraft.client.renderer.EntityRenderer receiver, net.minecraft.entity.EntityLivingBase p0, float p1) throws Throwable {
    long life3_3;
    int life5_8;
    life3_3 = (__fieldRead2440_0() ^ 9011663766073L);
    life5_8 = __call2440_3(__call2440_2(p0, __fieldRead2440_1()));
    return ((life5_8 > __invokedynamic2440_4(32381, (7542509864738723849L ^ life3_3))) ? 0x1.0p0f : (0x1.666666p-1f + (__call2440_5((((((float) life5_8) - p1) * 0x1.921fb6p1f) * 0x1.99999ap-3f)) * 0x1.333334p-2f)));
}
public static void h2440_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244000_0(p0);
}
private static native long __fieldRead2440_0() throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead2440_1() throws Throwable;
private static native net.minecraft.potion.PotionEffect __call2440_2(net.minecraft.entity.EntityLivingBase a0, net.minecraft.potion.Potion a1) throws Throwable;
private static native int __call2440_3(net.minecraft.potion.PotionEffect a0) throws Throwable;
private static native int __invokedynamic2440_4(int a0, long a1) throws Throwable;
private static native float __call2440_5(float a0) throws Throwable;
private static native java.lang.Throwable __call1244000_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0903940e26b93b236fd4(net.minecraft.client.renderer.EntityRenderer a0) throws E;
private static final class __SourceHandler_0903940e26b93b236fd4 {

public static boolean f1393(net.minecraft.client.renderer.EntityRenderer receiver) throws Throwable {
    int forwardValue1393_8_0;
    forward_join_8: {
    forward_join_7: {
    if (!(__fieldRead1393_0())) {
        break forward_join_7;
    }
    if (!((__fieldRead1393_1(receiver) != null))) {
        break forward_join_7;
    }
    forwardValue1393_8_0 = 1;
    break forward_join_8;
    }
    forwardValue1393_8_0 = 0;
    }
    return __integerCategory1393_2(forwardValue1393_8_0);
}
public static void h1393_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139300_0(p0);
}
public static void h1393_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139301_0(p0);
}
private static native boolean __fieldRead1393_0() throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead1393_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native boolean __integerCategory1393_2(int value) throws Throwable;
private static native java.lang.Throwable __call1139300_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139301_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_220bbdf1f04b3a438810(net.minecraft.client.renderer.EntityRenderer a0) throws E;
private static final class __SourceHandler_220bbdf1f04b3a438810 {

public static void f2442(net.minecraft.client.renderer.EntityRenderer receiver) throws Throwable {
    net.minecraft.client.renderer.EntityRenderer spill2442_0 = receiver;
    __fieldWrite2442_1(spill2442_0, ((!__fieldRead2442_0(receiver)) ? 1 : 0));
    return;
}
public static void h2442_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244200_0(p0);
}
private static native boolean __fieldRead2442_0(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite2442_1(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1244200_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8b9624e9c44f2b598148(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws E;
private static final class __SourceHandler_8b9624e9c44f2b598148 {

public static void f2443(net.minecraft.client.renderer.EntityRenderer receiver, float p0) throws Throwable {
    com.moon.dO life2_3;
    net.minecraft.entity.Entity life4_17;
    net.minecraft.entity.EntityLivingBase life3_23;
    float life4_29;
    float life5_40;
    float life4_64;
    float life4_75;
    float life5_78;
    life2_3 = new com.moon.dO();
    __call2443_2(__call2443_1(__call2443_0()), life2_3);
    if (__call2443_3(life2_3)) {
        return;
    }
    life4_17 = __call2443_5(__fieldRead2443_4(receiver));
    if ((__instanceOf2443_6(life4_17) != 0)) {
        life3_23 = __cast2443_7(life4_17);
        life4_29 = (((float) __fieldRead2443_8(life3_23)) - p0);
        if ((__call2443_9(life3_23) <= 0x0.0p0f)) {
        life5_40 = (((float) __fieldRead2443_10(life3_23)) + p0);
        __call2443_11((0x1.4p5f - (0x1.f4p12f / (life5_40 + 0x1.9p7f))), 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    }
        if ((life4_29 < 0x0.0p0f)) {
        return;
    }
        life4_64 = (life4_29 / ((float) __fieldRead2443_12(life3_23)));
        life4_75 = __call2443_13(((((life4_64 * life4_64) * life4_64) * life4_64) * 0x1.921fb6p1f));
        life5_78 = __fieldRead2443_14(life3_23);
        __call2443_15((-life5_78), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
        __call2443_16(((-life4_75) * 0x1.cp3f), 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
        __call2443_17(life5_78, 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    }
    return;
}
public static void h2443_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244300_0(p0);
}
public static void h2443_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244301_0(p0);
}
private static native com.moon.runtime.ClientContext __call2443_0() throws Throwable;
private static native com.moon.events.EventBus __call2443_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call2443_2(com.moon.events.EventBus a0, com.moon.dO a1) throws Throwable;
private static native boolean __call2443_3(com.moon.dO a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2443_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2443_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf2443_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast2443_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead2443_8(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __call2443_9(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native int __fieldRead2443_10(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __call2443_11(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __fieldRead2443_12(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __call2443_13(float a0) throws Throwable;
private static native float __fieldRead2443_14(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __call2443_15(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call2443_16(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call2443_17(float a0, float a1, float a2, float a3) throws Throwable;
private static native java.lang.Throwable __call1244300_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1244301_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_49a02453036aa6b7d2d3(net.minecraft.client.renderer.EntityRenderer a0, float a1, long a2) throws E;
private static final class __SourceHandler_49a02453036aa6b7d2d3 {

public static void f2444(net.minecraft.client.renderer.EntityRenderer receiver, float p0, long p1) throws Throwable {
    long life4_3;
    double life6_24;
    double life8_29;
    double life10_34;
    com.moon.eR life12_41;
    life4_3 = (__fieldRead2444_0() ^ 33195984557344L);
    __call2444_1(receiver, p0);
    if ((__call2444_3(__fieldRead2444_2(receiver)) == null)) {
        __call2444_7(__fieldRead2444_4(receiver), __fieldRead2444_6(__fieldRead2444_5(receiver)));
    }
    life6_24 = __fieldRead2444_10(__call2444_9(__fieldRead2444_8(receiver)));
    life8_29 = __fieldRead2444_13(__call2444_12(__fieldRead2444_11(receiver)));
    life10_34 = __fieldRead2444_16(__call2444_15(__fieldRead2444_14(receiver)));
    life12_41 = new com.moon.eR(life6_24, life8_29, life10_34);
    __call2444_19(__call2444_18(__call2444_17()), life12_41);
    __fieldWrite2444_23(__call2444_21(__fieldRead2444_20(receiver)), __call2444_22(life12_41));
    __fieldWrite2444_27(__call2444_25(__fieldRead2444_24(receiver)), __call2444_26(life12_41));
    __fieldWrite2444_31(__call2444_29(__fieldRead2444_28(receiver)), __call2444_30(life12_41));
    __call2444_32(receiver, p0);
    if (__call2444_33()) {
        __call2444_35(__fieldRead2444_34(receiver), p0, p1);
    }
    __call2444_36();
    int spill2444_0 = 31866;
    __call2444_37();
    __call2444_39(__invokedynamic2444_38(spill2444_0, (5356559808872254798L ^ life4_3)), 0x1.99999ap-4f);
    __call2444_42(__fieldRead2444_41(__fieldRead2444_40(receiver)), "center");
    if (__fieldRead2444_45(__fieldRead2444_44(__fieldRead2444_43(receiver)))) {
        __fieldWrite2444_46(0);
        __call2444_47(0, 1, 1, 0);
        __call2444_48(receiver, 0, p0, p1);
        __fieldWrite2444_49(1);
        __call2444_50(1, 0, 0, 0);
        __call2444_51(receiver, 1, p0, p1);
        __call2444_52(1, 1, 1, 0);
    } else {
        __call2444_53(receiver, 2, p0, p1);
    }
    __call2444_56(__fieldRead2444_55(__fieldRead2444_54(receiver)));
    return;
}
public static void h2444_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244400_0(p0);
}
public static void h2444_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244401_0(p0);
}
public static void h2444_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244402_0(p0);
}
private static native long __fieldRead2444_0() throws Throwable;
private static native void __call2444_1(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_2(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2444_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_5(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2444_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2444_7(net.minecraft.client.Minecraft a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2444_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2444_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_11(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2444_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2444_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_14(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2444_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2444_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call2444_17() throws Throwable;
private static native com.moon.events.EventBus __call2444_18(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call2444_19(com.moon.events.EventBus a0, com.moon.eR a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_20(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2444_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call2444_22(com.moon.eR a0) throws Throwable;
private static native void __fieldWrite2444_23(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_24(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2444_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call2444_26(com.moon.eR a0) throws Throwable;
private static native void __fieldWrite2444_27(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_28(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2444_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call2444_30(com.moon.eR a0) throws Throwable;
private static native void __fieldWrite2444_31(net.minecraft.entity.Entity a0, double a1) throws Throwable;
private static native void __call2444_32(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native boolean __call2444_33() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_34(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call2444_35(net.minecraft.client.Minecraft a0, float a1, long a2) throws Throwable;
private static native void __call2444_36() throws Throwable;
private static native void __call2444_37() throws Throwable;
private static native int __invokedynamic2444_38(int a0, long a1) throws Throwable;
private static native void __call2444_39(int a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_40(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead2444_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2444_42(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_43(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2444_44(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead2444_45(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __fieldWrite2444_46(int a0) throws Throwable;
private static native void __call2444_47(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call2444_48(net.minecraft.client.renderer.EntityRenderer a0, int a1, float a2, long a3) throws Throwable;
private static native void __fieldWrite2444_49(int a0) throws Throwable;
private static native void __call2444_50(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call2444_51(net.minecraft.client.renderer.EntityRenderer a0, int a1, float a2, long a3) throws Throwable;
private static native void __call2444_52(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call2444_53(net.minecraft.client.renderer.EntityRenderer a0, int a1, float a2, long a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2444_54(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead2444_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2444_56(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call1244400_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1244401_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1244402_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7341f5da0f44e6a08f5f(net.minecraft.client.renderer.EntityRenderer a0, moom.oR a1) throws E;
private static final class __SourceHandler_7341f5da0f44e6a08f5f {

public static void f2445(net.minecraft.client.renderer.EntityRenderer receiver, moom.oR p0) throws Throwable {
    if ((__fieldRead2445_0(receiver) != null)) {
        __call2445_2(__fieldRead2445_1(receiver));
    }
    __fieldWrite2445_3(receiver, null);
    if ((__fieldRead2445_4(receiver) != __fieldRead2445_5())) {
        __call2445_8(receiver, (__fieldRead2445_6())[__fieldRead2445_7(receiver)]);
    } else {
        __call2445_11(receiver, __call2445_10(__fieldRead2445_9(receiver)));
    }
    return;
}
public static void h2445_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244500_0(p0);
}
public static void h2445_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244501_0(p0);
}
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2445_0(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2445_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call2445_2(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native void __fieldWrite2445_3(net.minecraft.client.renderer.EntityRenderer a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead2445_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead2445_5() throws Throwable;
private static native moom.DD[] __fieldRead2445_6() throws Throwable;
private static native int __fieldRead2445_7(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call2445_8(net.minecraft.client.renderer.EntityRenderer a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2445_9(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2445_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2445_11(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.lang.Throwable __call1244500_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1244501_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3bb2234333aa9ce2ba7b(net.minecraft.client.renderer.EntityRenderer a0) throws E;
private static final class __SourceHandler_3bb2234333aa9ce2ba7b {

public static boolean f1394(net.minecraft.client.renderer.EntityRenderer receiver) throws Throwable {
    int forwardValue1394_18_0;
    int forwardValue1394_74_0;
    int forwardValue1394_89_0;
    net.minecraft.entity.Entity life1_6;
    int life2_23;
    net.minecraft.item.ItemStack life3_37;
    moom.DT life4_55;
    net.minecraft.block.state.IBlockState life5_61;
    net.minecraft.block.Block life6_64;
    forward_join_90: {
    forward_join_89: {
    forward_join_88: {
    forward_join_86: {
    forward_join_76: {
    forward_join_74: {
    forward_join_73: {
    forward_join_18: {
    forward_join_17: {
    __call1394_0(receiver);
    life1_6 = __call1394_2(__fieldRead1394_1(receiver));
    if (!((__instanceOf1394_3(life1_6) != 0))) {
        break forward_join_17;
    }
    if (!((!__fieldRead1394_6(__fieldRead1394_5(__fieldRead1394_4(receiver)))))) {
        break forward_join_17;
    }
    forwardValue1394_18_0 = 1;
    break forward_join_18;
    }
    forwardValue1394_18_0 = 0;
    }
    life2_23 = forwardValue1394_18_0;
    if (!((life2_23 != 0))) {
        break forward_join_90;
    }
    if (!((!__fieldRead1394_9(__fieldRead1394_8(__cast1394_7(life1_6)))))) {
        break forward_join_90;
    }
    life3_37 = __call1394_11(__cast1394_10(life1_6));
    if (!((__fieldRead1394_13(__fieldRead1394_12(receiver)) != null))) {
        break forward_join_90;
    }
    if (!((__fieldRead1394_16(__fieldRead1394_15(__fieldRead1394_14(receiver))) == __fieldRead1394_17()))) {
        break forward_join_90;
    }
    life4_55 = __call1394_20(__fieldRead1394_19(__fieldRead1394_18(receiver)));
    life5_61 = __call1394_23(__fieldRead1394_22(__fieldRead1394_21(receiver)), life4_55);
    life6_64 = __call1394_24(life5_61);
    if (!((__call1394_27(__fieldRead1394_26(__fieldRead1394_25(receiver))) == __fieldRead1394_28()))) {
        break forward_join_76;
    }
    if (!(__call1394_30(__call1394_29(life5_61)))) {
        break forward_join_73;
    }
    if (!((__instanceOf1394_34(__call1394_33(__fieldRead1394_32(__fieldRead1394_31(receiver)), life4_55)) != 0))) {
        break forward_join_73;
    }
    forwardValue1394_74_0 = 1;
    break forward_join_74;
    }
    forwardValue1394_74_0 = 0;
    }
    life2_23 = forwardValue1394_74_0;
    break forward_join_90;
    }
    if (!((life3_37 != null))) {
        break forward_join_88;
    }
    if (!((!__call1394_35(life3_37, life6_64)))) {
        break forward_join_86;
    }
    if (!(__call1394_36(life3_37, life6_64))) {
        break forward_join_88;
    }
    }
    forwardValue1394_89_0 = 1;
    break forward_join_89;
    }
    forwardValue1394_89_0 = 0;
    }
    life2_23 = forwardValue1394_89_0;
    }
    return __integerCategory1394_37(life2_23);
}
public static void h1394_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139400_0(p0);
}
public static void h1394_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139401_0(p0);
}
public static void h1394_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139402_0(p0);
}
public static void h1394_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139403_0(p0);
}
public static void h1394_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139404_0(p0);
}
public static void h1394_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139405_0(p0);
}
public static void h1394_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139406_0(p0);
}
public static void h1394_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139407_0(p0);
}
public static void h1394_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139408_0(p0);
}
public static void h1394_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139409_0(p0);
}
private static native java.lang.Object __call1394_0(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1394_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1394_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf1394_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1394_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1394_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1394_6(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1394_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead1394_8(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native boolean __fieldRead1394_9(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1394_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1394_11(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1394_12(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead1394_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1394_14(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead1394_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead1394_16(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead1394_17() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1394_18(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead1394_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call1394_20(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1394_21(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1394_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1394_23(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1394_24(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1394_25(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.jI __fieldRead1394_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call1394_27(moom.jI a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1394_28() throws Throwable;
private static native net.minecraft.block.Block __call1394_29(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call1394_30(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1394_31(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1394_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1394_33(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native int __instanceOf1394_34(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native boolean __call1394_35(net.minecraft.item.ItemStack a0, net.minecraft.block.Block a1) throws Throwable;
private static native boolean __call1394_36(net.minecraft.item.ItemStack a0, net.minecraft.block.Block a1) throws Throwable;
private static native boolean __integerCategory1394_37(int value) throws Throwable;
private static native java.lang.Throwable __call1139400_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139401_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139402_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139403_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139404_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139405_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139406_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139407_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139408_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139409_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b0c0d66779fe5374ba83(net.minecraft.client.renderer.EntityRenderer a0) throws E;
private static final class __SourceHandler_b0c0d66779fe5374ba83 {

public static void f2447(net.minecraft.client.renderer.EntityRenderer receiver) throws Throwable {
    if (__fieldRead2447_0()) {
        if ((__instanceOf2447_3(__call2447_2(__fieldRead2447_1(receiver))) != 0)) {
        if ((__fieldRead2447_4(receiver) != null)) {
        __call2447_6(__fieldRead2447_5(receiver));
    }
        __fieldWrite2447_9(receiver, ((__fieldRead2447_7(receiver) + 1) % ((__fieldRead2447_8()).length + 1)));
        if ((__fieldRead2447_10(receiver) != __fieldRead2447_11())) {
        __call2447_14(receiver, (__fieldRead2447_12())[__fieldRead2447_13(receiver)]);
    } else {
        __fieldWrite2447_15(receiver, null);
    }
    }
    }
    return;
}
public static void h2447_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244700_0(p0);
}
public static void h2447_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244701_0(p0);
}
public static void h2447_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244702_0(p0);
}
public static void h2447_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1244703_0(p0);
}
private static native boolean __fieldRead2447_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2447_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2447_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf2447_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2447_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2447_5(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call2447_6(net.minecraft.client.shader.ShaderGroup a0) throws Throwable;
private static native int __fieldRead2447_7(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.DD[] __fieldRead2447_8() throws Throwable;
private static native void __fieldWrite2447_9(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native int __fieldRead2447_10(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead2447_11() throws Throwable;
private static native moom.DD[] __fieldRead2447_12() throws Throwable;
private static native int __fieldRead2447_13(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call2447_14(net.minecraft.client.renderer.EntityRenderer a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite2447_15(net.minecraft.client.renderer.EntityRenderer a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Throwable __call1244700_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1244701_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1244702_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1244703_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8ae01ea9fdd234b2443e(net.minecraft.client.renderer.EntityRenderer a0) throws E;
private static final class __SourceHandler_8ae01ea9fdd234b2443e {

public static void f223(net.minecraft.client.renderer.EntityRenderer receiver) throws Throwable {
    float life1_38;
    float life2_46;
    net.minecraft.entity.Entity life1_105;
    double life2_108;
    double life4_115;
    double life6_118;
    float life8_129;
    float life9_137;
    float life9_142;
    float life10_150;
    if (__fieldRead223_0()) {
        if ((__call223_1() == null)) {
        __call223_2();
    }
    }
    __call223_3(receiver);
    __call223_4(receiver);
    __fieldWrite223_6(receiver, __fieldRead223_5(receiver));
    net.minecraft.client.renderer.EntityRenderer spill223_0 = receiver;
    __call223_7(receiver);
    __fieldWrite223_8(spill223_0, 0x1.0p2f);
    if (__fieldRead223_11(__fieldRead223_10(__fieldRead223_9(receiver)))) {
        life1_38 = ((__fieldRead223_14(__fieldRead223_13(__fieldRead223_12(receiver))) * 0x1.333334p-1f) + 0x1.99999ap-3f);
        life2_46 = (((life1_38 * life1_38) * life1_38) * 0x1.0p3f);
        __fieldWrite223_18(receiver, __call223_17(__fieldRead223_15(receiver), __fieldRead223_16(receiver), (0x1.99999ap-5f * life2_46)));
        __fieldWrite223_22(receiver, __call223_21(__fieldRead223_19(receiver), __fieldRead223_20(receiver), (0x1.99999ap-5f * life2_46)));
        __fieldWrite223_23(receiver, 0x0.0p0f);
        __fieldWrite223_24(receiver, 0x0.0p0f);
        __fieldWrite223_25(receiver, 0x0.0p0f);
    } else {
        __fieldWrite223_26(receiver, 0x0.0p0f);
        __fieldWrite223_27(receiver, 0x0.0p0f);
        __call223_29(__fieldRead223_28(receiver));
        __call223_31(__fieldRead223_30(receiver));
    }
    if ((__call223_33(__fieldRead223_32(receiver)) == null)) {
        __call223_37(__fieldRead223_34(receiver), __fieldRead223_36(__fieldRead223_35(receiver)));
    }
    life1_105 = __call223_39(__fieldRead223_38(receiver));
    life2_108 = __fieldRead223_40(life1_105);
    life4_115 = (__fieldRead223_41(life1_105) + ((double) __call223_42(life1_105)));
    life6_118 = __fieldRead223_43(life1_105);
    life8_129 = __call223_46(__fieldRead223_45(__fieldRead223_44(receiver)), new moom.DT(life2_108, life4_115, life6_118));
    life9_137 = (((float) __fieldRead223_49(__fieldRead223_48(__fieldRead223_47(receiver)))) / 0x1.0p4f);
    life9_142 = __call223_50(life9_137, 0x0.0p0f, 0x1.0p0f);
    life10_150 = ((life8_129 * (0x1.0p0f - life9_142)) + life9_142);
    net.minecraft.client.renderer.EntityRenderer __stackOp223_51_0 = receiver;
    __fieldWrite223_54(__stackOp223_51_0, (__fieldRead223_52(__stackOp223_51_0) + ((life10_150 - __fieldRead223_53(receiver)) * 0x1.99999ap-4f)));
    net.minecraft.client.renderer.EntityRenderer __stackOp223_55_0 = receiver;
    __fieldWrite223_57(__stackOp223_55_0, (__fieldRead223_56(__stackOp223_55_0) + 1));
    __call223_59(__fieldRead223_58(receiver));
    __call223_60(receiver);
    __fieldWrite223_62(receiver, __fieldRead223_61(receiver));
    if (__fieldRead223_63()) {
        net.minecraft.client.renderer.EntityRenderer __stackOp223_64_0 = receiver;
        __fieldWrite223_66(__stackOp223_64_0, (__fieldRead223_65(__stackOp223_64_0) + 0x1.99999ap-5f));
        if ((__fieldRead223_67(receiver) > 0x1.0p0f)) {
        __fieldWrite223_68(receiver, 0x1.0p0f);
    }
        __fieldWrite223_69(0);
    } else {
        if ((__fieldRead223_70(receiver) > 0x0.0p0f)) {
        net.minecraft.client.renderer.EntityRenderer __stackOp223_71_0 = receiver;
        __fieldWrite223_73(__stackOp223_71_0, (__fieldRead223_72(__stackOp223_71_0) - 0x1.99999ap-7f));
    }
    }
    return;
}
public static void h223_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1022300_0(p0);
}
public static void h223_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1022301_0(p0);
}
public static void h223_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1022302_0(p0);
}
public static void h223_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1022303_0(p0);
}
public static void h223_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1022304_0(p0);
}
public static void h223_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1022305_0(p0);
}
private static native boolean __fieldRead223_0() throws Throwable;
private static native moom.pD __call223_1() throws Throwable;
private static native void __call223_2() throws Throwable;
private static native void __call223_3(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call223_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead223_5(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite223_6(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native java.lang.Object __call223_7(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite223_8(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead223_9(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead223_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead223_11(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead223_12(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead223_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead223_14(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.util.MouseFilter __fieldRead223_15(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead223_16(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __call223_17(net.minecraft.util.MouseFilter a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite223_18(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.util.MouseFilter __fieldRead223_19(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead223_20(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __call223_21(net.minecraft.util.MouseFilter a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite223_22(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite223_23(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite223_24(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite223_25(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite223_26(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite223_27(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.util.MouseFilter __fieldRead223_28(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call223_29(net.minecraft.util.MouseFilter a0) throws Throwable;
private static native net.minecraft.util.MouseFilter __fieldRead223_30(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call223_31(net.minecraft.util.MouseFilter a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead223_32(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call223_33(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead223_34(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead223_35(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead223_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call223_37(net.minecraft.client.Minecraft a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead223_38(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call223_39(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead223_40(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead223_41(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call223_42(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead223_43(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead223_44(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead223_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call223_46(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead223_47(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead223_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead223_49(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native float __call223_50(float a0, float a1, float a2) throws Throwable;
private static native float __fieldRead223_52(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead223_53(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite223_54(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native int __fieldRead223_56(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite223_57(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native moom.lm __fieldRead223_58(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call223_59(moom.lm a0) throws Throwable;
private static native void __call223_60(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead223_61(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite223_62(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native boolean __fieldRead223_63() throws Throwable;
private static native float __fieldRead223_65(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite223_66(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead223_67(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite223_68(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite223_69(int a0) throws Throwable;
private static native float __fieldRead223_70(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead223_72(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite223_73(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native java.lang.Throwable __call1022300_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1022301_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1022302_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1022303_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1022304_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1022305_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_53b969c3aff9c69d5034(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws E;
private static final class __SourceHandler_53b969c3aff9c69d5034 {

public static void f584(net.minecraft.client.renderer.EntityRenderer receiver, float p0) throws Throwable {
    float spill584_0;
    long life2_3;
    net.minecraft.entity.Entity life4_7;
    float life5_10;
    double life6_22;
    double life8_37;
    double life10_49;
    moom.DT life12_77;
    net.minecraft.block.state.IBlockState life13_83;
    net.minecraft.block.Block life14_86;
    int life15_95;
    double life12_157;
    float life14_172;
    float life15_175;
    double life16_203;
    double life18_220;
    double life20_231;
    int life22_233;
    float life23_249;
    float life24_260;
    float life25_271;
    float life23_275;
    float life24_279;
    float life25_283;
    net.minecraft.util.MovingObjectPosition life26_327;
    double life27_339;
    moom.sK life12_428;
    double life6_478;
    double life8_493;
    double life10_505;
    forest_join_459: {
    forest_join_443: {
    forest_join_401: {
    forest_join_397: {
    forest_join_396: {
    forest_join_358: {
    forest_join_347: {
    forest_join_185: {
    forest_join_169: {
    forest_join_138: {
    forest_join_107: {
    life2_3 = (__fieldRead584_0() ^ 71681961961731L);
    life4_7 = __call584_2(__fieldRead584_1(receiver));
    life5_10 = __call584_3(life4_7);
    life6_22 = (__fieldRead584_4(life4_7) + ((__fieldRead584_5(life4_7) - __fieldRead584_6(life4_7)) * ((double) p0)));
    life8_37 = ((__fieldRead584_7(life4_7) + ((__fieldRead584_8(life4_7) - __fieldRead584_9(life4_7)) * ((double) p0))) + ((double) life5_10));
    life10_49 = (__fieldRead584_10(life4_7) + ((__fieldRead584_11(life4_7) - __fieldRead584_12(life4_7)) * ((double) p0)));
    if (!((__instanceOf584_13(life4_7) != 0))) {
        break forest_join_138;
    }
    if (!(__call584_15(__cast584_14(life4_7)))) {
        break forest_join_138;
    }
    life5_10 = ((float) (((double) life5_10) + 0x1.0p0d));
    __call584_16(0x0.0p0f, 0x1.333334p-2f, 0x0.0p0f);
    if (!((!__fieldRead584_19(__fieldRead584_18(__fieldRead584_17(receiver)))))) {
        break forest_join_401;
    }
    life12_77 = new moom.DT(life4_7);
    life13_83 = __call584_22(__fieldRead584_21(__fieldRead584_20(receiver)), life12_77);
    life14_86 = __call584_23(life13_83);
    if (!((life14_86 == __fieldRead584_24()))) {
        break forest_join_107;
    }
    life15_95 = __call584_28(__cast584_27(__call584_26(life13_83, __fieldRead584_25())));
    __call584_30(((float) (life15_95 * __invokedynamic584_29(111, (2179488741845290298L ^ life2_3)))), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    }
    __call584_34(((__fieldRead584_31(life4_7) + ((__fieldRead584_32(life4_7) - __fieldRead584_33(life4_7)) * p0)) + 0x1.68p7f), 0x0.0p0f, -0x1.0p0f, 0x0.0p0f);
    __call584_38((__fieldRead584_35(life4_7) + ((__fieldRead584_36(life4_7) - __fieldRead584_37(life4_7)) * p0)), -0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    break forest_join_401;
    }
    if (!((__fieldRead584_41(__fieldRead584_40(__fieldRead584_39(receiver))) > 0))) {
        break forest_join_397;
    }
    spill584_0 = __fieldRead584_42(receiver);
    __call584_43(receiver);
    life12_157 = ((double) (spill584_0 + ((0x1.0p2f - __fieldRead584_44(receiver)) * p0)));
    if (!(__fieldRead584_47(__fieldRead584_46(__fieldRead584_45(receiver))))) {
        break forest_join_169;
    }
    __call584_48(0x0.0p0f, 0x0.0p0f, ((float) (-life12_157)));
    break forest_join_396;
    }
    life14_172 = __fieldRead584_49(life4_7);
    life15_175 = __fieldRead584_50(life4_7);
    if (!((__fieldRead584_53(__fieldRead584_52(__fieldRead584_51(receiver))) == 2))) {
        break forest_join_185;
    }
    life15_175 = (life15_175 + 0x1.68p7f);
    }
    life16_203 = (((double) ((-__call584_54(((life14_172 / 0x1.68p7f) * 0x1.921fb6p1f))) * __call584_55(((life15_175 / 0x1.68p7f) * 0x1.921fb6p1f)))) * life12_157);
    life18_220 = (((double) (__call584_56(((life14_172 / 0x1.68p7f) * 0x1.921fb6p1f)) * __call584_57(((life15_175 / 0x1.68p7f) * 0x1.921fb6p1f)))) * life12_157);
    life20_231 = (((double) (-__call584_58(((life15_175 / 0x1.68p7f) * 0x1.921fb6p1f)))) * life12_157);
    life22_233 = 0;
    forest_cycle_233: while (true) {
    forest_join_345: {
    if (!((life22_233 < __invokedynamic584_59(27870, (8135774778064183764L ^ life2_3))))) {
        break forest_join_347;
    }
    life23_249 = ((float) (((life22_233 & 1) * 2) - 1));
    life24_260 = ((float) ((((life22_233 >> 1) & 1) * 2) - 1));
    life25_271 = ((float) ((((life22_233 >> 2) & 1) * 2) - 1));
    life23_275 = (life23_249 * 0x1.99999ap-4f);
    life24_279 = (life24_260 * 0x1.99999ap-4f);
    life25_283 = (life25_271 * 0x1.99999ap-4f);
    life26_327 = __call584_62(__fieldRead584_61(__fieldRead584_60(receiver)), new moom.DR((life6_22 + ((double) life23_275)), (life8_37 + ((double) life24_279)), (life10_49 + ((double) life25_283))), new moom.DR((((life6_22 - life16_203) + ((double) life23_275)) + ((double) life25_283)), ((life8_37 - life20_231) + ((double) life24_279)), ((life10_49 - life18_220) + ((double) life25_283))));
    if (!((life26_327 != null))) {
        break forest_join_345;
    }
    life27_339 = __call584_64(__fieldRead584_63(life26_327), new moom.DR(life6_22, life8_37, life10_49));
    if (!((__numericCompare584_65(life27_339, life12_157) < 0))) {
        break forest_join_345;
    }
    life12_157 = life27_339;
    }
    life22_233 += 1;
    continue forest_cycle_233;
    }
    }
    if (!((__fieldRead584_68(__fieldRead584_67(__fieldRead584_66(receiver))) == 2))) {
        break forest_join_358;
    }
    __call584_69(0x1.68p7f, 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    }
    __call584_71((__fieldRead584_70(life4_7) - life15_175), 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    __call584_73((__fieldRead584_72(life4_7) - life14_172), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    __call584_74(0x0.0p0f, 0x0.0p0f, ((float) (-life12_157)));
    __call584_76((life14_172 - __fieldRead584_75(life4_7)), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    __call584_78((life15_175 - __fieldRead584_77(life4_7)), 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    }
    break forest_join_401;
    }
    __call584_79(0x0.0p0f, 0x0.0p0f, -0x1.99999ap-4f);
    }
    if (!((!__fieldRead584_82(__fieldRead584_81(__fieldRead584_80(receiver)))))) {
        break forest_join_459;
    }
    __call584_86((__fieldRead584_83(life4_7) + ((__fieldRead584_84(life4_7) - __fieldRead584_85(life4_7)) * p0)), 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    if (!((__instanceOf584_87(life4_7) != 0))) {
        break forest_join_443;
    }
    life12_428 = __cast584_88(life4_7);
    __call584_92(((__fieldRead584_89(life12_428) + ((__fieldRead584_90(life12_428) - __fieldRead584_91(life12_428)) * p0)) + 0x1.68p7f), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    break forest_join_459;
    }
    __call584_96(((__fieldRead584_93(life4_7) + ((__fieldRead584_94(life4_7) - __fieldRead584_95(life4_7)) * p0)) + 0x1.68p7f), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    }
    __call584_97(0x0.0p0f, (-life5_10), 0x0.0p0f);
    life6_478 = (__fieldRead584_98(life4_7) + ((__fieldRead584_99(life4_7) - __fieldRead584_100(life4_7)) * ((double) p0)));
    life8_493 = ((__fieldRead584_101(life4_7) + ((__fieldRead584_102(life4_7) - __fieldRead584_103(life4_7)) * ((double) p0))) + ((double) life5_10));
    life10_505 = (__fieldRead584_104(life4_7) + ((__fieldRead584_105(life4_7) - __fieldRead584_106(life4_7)) * ((double) p0)));
    __fieldWrite584_110(receiver, __call584_109(__fieldRead584_108(__fieldRead584_107(receiver)), life6_478, life8_493, life10_505, p0));
    return;
}
public static void h584_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058400_0(p0);
}
public static void h584_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058401_0(p0);
}
public static void h584_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058402_0(p0);
}
public static void h584_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058403_0(p0);
}
private static native long __fieldRead584_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead584_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call584_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call584_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf584_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast584_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call584_15(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __call584_16(float a0, float a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead584_17(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead584_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead584_19(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead584_20(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead584_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call584_22(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call584_23(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead584_24() throws Throwable;
private static native moom.fx __fieldRead584_25() throws Throwable;
private static native java.lang.Comparable __call584_26(net.minecraft.block.state.IBlockState a0, moom.fx a1) throws Throwable;
private static native moom.bs __cast584_27(java.lang.Comparable a0) throws Throwable;
private static native int __call584_28(moom.bs a0) throws Throwable;
private static native int __invokedynamic584_29(int a0, long a1) throws Throwable;
private static native void __call584_30(float a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead584_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead584_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead584_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call584_34(float a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead584_35(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead584_36(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead584_37(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call584_38(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead584_39(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead584_40(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead584_41(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native float __fieldRead584_42(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native java.lang.Object __call584_43(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead584_44(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead584_45(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead584_46(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead584_47(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call584_48(float a0, float a1, float a2) throws Throwable;
private static native float __fieldRead584_49(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead584_50(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead584_51(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead584_52(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead584_53(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native float __call584_54(float a0) throws Throwable;
private static native float __call584_55(float a0) throws Throwable;
private static native float __call584_56(float a0) throws Throwable;
private static native float __call584_57(float a0) throws Throwable;
private static native float __call584_58(float a0) throws Throwable;
private static native int __invokedynamic584_59(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead584_60(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead584_61(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __call584_62(net.minecraft.client.multiplayer.WorldClient a0, moom.DR a1, moom.DR a2) throws Throwable;
private static native moom.DR __fieldRead584_63(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native double __call584_64(moom.DR a0, moom.DR a1) throws Throwable;
private static native int __numericCompare584_65(double a0, double a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead584_66(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead584_67(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead584_68(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call584_69(float a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead584_70(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call584_71(float a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead584_72(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call584_73(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call584_74(float a0, float a1, float a2) throws Throwable;
private static native float __fieldRead584_75(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call584_76(float a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead584_77(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call584_78(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call584_79(float a0, float a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead584_80(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead584_81(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead584_82(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native float __fieldRead584_83(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead584_84(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead584_85(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call584_86(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __instanceOf584_87(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.sK __cast584_88(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead584_89(moom.sK a0) throws Throwable;
private static native float __fieldRead584_90(moom.sK a0) throws Throwable;
private static native float __fieldRead584_91(moom.sK a0) throws Throwable;
private static native void __call584_92(float a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead584_93(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead584_94(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead584_95(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call584_96(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call584_97(float a0, float a1, float a2) throws Throwable;
private static native double __fieldRead584_98(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_99(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_100(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_101(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_102(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_103(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_104(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_105(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead584_106(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead584_107(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead584_108(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call584_109(net.minecraft.client.renderer.RenderGlobal a0, double a1, double a2, double a3, float a4) throws Throwable;
private static native void __fieldWrite584_110(net.minecraft.client.renderer.EntityRenderer a0, boolean a1) throws Throwable;
private static native java.lang.Throwable __call3058400_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058401_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058402_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058403_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8e231e9d542d755e198c(net.minecraft.client.renderer.EntityRenderer a0) throws E;
private static final class __SourceHandler_8e231e9d542d755e198c {

public static void f224(net.minecraft.client.renderer.EntityRenderer receiver) throws Throwable {
    float life1_1;
    net.minecraft.entity.Entity life3_5;
    moom.to life2_11;
    life1_1 = 0x1.0p0f;
    life3_5 = __call224_1(__fieldRead224_0(receiver));
    if ((__instanceOf224_2(life3_5) != 0)) {
        life2_11 = __cast224_3(life3_5);
        life1_1 = __call224_4(life2_11);
    }
    __fieldWrite224_6(receiver, __fieldRead224_5(receiver));
    net.minecraft.client.renderer.EntityRenderer __stackOp224_7_0 = receiver;
    __fieldWrite224_10(__stackOp224_7_0, (__fieldRead224_8(__stackOp224_7_0) + ((life1_1 - __fieldRead224_9(receiver)) * 0x1.0p-1f)));
    if ((__fieldRead224_11(receiver) > 0x1.8p0f)) {
        __fieldWrite224_12(receiver, 0x1.8p0f);
    }
    if ((__fieldRead224_13(receiver) < 0x1.99999ap-4f)) {
        __fieldWrite224_14(receiver, 0x1.99999ap-4f);
    }
    return;
}
public static void h224_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1022400_0(p0);
}
public static void h224_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1022401_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead224_0(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call224_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf224_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.to __cast224_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call224_4(moom.to a0) throws Throwable;
private static native float __fieldRead224_5(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite224_6(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead224_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead224_9(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite224_10(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead224_11(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite224_12(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead224_13(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite224_14(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native java.lang.Throwable __call1022400_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1022401_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_669e2d11491aaad8e2d5(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws E;
private static final class __SourceHandler_669e2d11491aaad8e2d5 {

public static void f2451(net.minecraft.client.renderer.EntityRenderer receiver, float p0) throws Throwable {
    long life2_3;
    net.minecraft.client.multiplayer.WorldClient life4_15;
    float life5_55;
    float life6_61;
    int life7_63;
    float life8_84;
    float life9_103;
    float life10_126;
    float life11_134;
    float life12_146;
    float life13_156;
    float life14_160;
    float life15_164;
    float life16_168;
    float life14_174;
    float life15_180;
    float life16_186;
    float life17_202;
    float life17_274;
    float life18_278;
    float life17_357;
    float life18_361;
    float life19_365;
    float life20_369;
    float life18_379;
    float life19_389;
    float life20_399;
    float life14_409;
    float life15_419;
    float life16_429;
    float life14_435;
    float life15_441;
    float life16_447;
    int life21_489;
    int life22_494;
    int life23_499;
    int life24_504;
    life2_3 = (__fieldRead2451_0() ^ 133714507557290L);
    if (__fieldRead2451_1(receiver)) {
        __call2451_4(__fieldRead2451_3(__fieldRead2451_2(receiver)), "lightTex");
        life4_15 = __fieldRead2451_6(__fieldRead2451_5(receiver));
        if ((life4_15 != null)) {
        if (__call2451_7()) {
        if (__call2451_14(life4_15, __fieldRead2451_8(receiver), __fieldRead2451_9(receiver), __call2451_13(__fieldRead2451_11(__fieldRead2451_10(receiver)), __fieldRead2451_12()), p0)) {
        __call2451_16(__fieldRead2451_15(receiver));
        __fieldWrite2451_17(receiver, 0);
        __call2451_20(__fieldRead2451_19(__fieldRead2451_18(receiver)));
        return;
    }
    }
        life5_55 = __call2451_21(life4_15, 0x1.0p0f);
        life6_61 = ((life5_55 * 0x1.e66666p-1f) + 0x1.99999ap-5f);
        life7_63 = 0;
        loop_region_56: while ((life7_63 < __invokedynamic2451_22(20610, (6685652812764503359L ^ life2_3)))) {
        life8_84 = ((__call2451_24(__fieldRead2451_23(life4_15)))[(life7_63 / __invokedynamic2451_25(19681, (5381592424641937696L ^ life2_3)))] * life6_61);
        life9_103 = ((__call2451_27(__fieldRead2451_26(life4_15)))[(life7_63 % __invokedynamic2451_28(5478, (2055927391672408257L ^ life2_3)))] * ((__fieldRead2451_29(receiver) * 0x1.99999ap-4f) + 0x1.8p0f));
        if ((__call2451_30(life4_15) > 0)) {
        life8_84 = (__call2451_32(__fieldRead2451_31(life4_15)))[(life7_63 / __invokedynamic2451_33(5478, (2055927391672408257L ^ life2_3)))];
    }
        life10_126 = (life8_84 * ((life5_55 * 0x1.4cccccp-1f) + 0x1.666666p-2f));
        life11_134 = (life8_84 * ((life5_55 * 0x1.4cccccp-1f) + 0x1.666666p-2f));
        life12_146 = (life9_103 * ((((life9_103 * 0x1.333334p-1f) + 0x1.99999ap-2f) * 0x1.333334p-1f) + 0x1.99999ap-2f));
        life13_156 = (life9_103 * (((life9_103 * life9_103) * 0x1.333334p-1f) + 0x1.99999ap-2f));
        life14_160 = (life10_126 + life9_103);
        life15_164 = (life11_134 + life12_146);
        life16_168 = (life8_84 + life13_156);
        life14_174 = ((life14_160 * 0x1.eb851ep-1f) + 0x1.eb851ep-6f);
        life15_180 = ((life15_164 * 0x1.eb851ep-1f) + 0x1.eb851ep-6f);
        life16_186 = ((life16_168 * 0x1.eb851ep-1f) + 0x1.eb851ep-6f);
        if ((__fieldRead2451_34(receiver) > 0x0.0p0f)) {
        life17_202 = (__fieldRead2451_35(receiver) + ((__fieldRead2451_36(receiver) - __fieldRead2451_37(receiver)) * p0));
        life14_174 = ((life14_174 * (0x1.0p0f - life17_202)) + ((life14_174 * 0x1.666666p-1f) * life17_202));
        life15_180 = ((life15_180 * (0x1.0p0f - life17_202)) + ((life15_180 * 0x1.333334p-1f) * life17_202));
        life16_186 = ((life16_186 * (0x1.0p0f - life17_202)) + ((life16_186 * 0x1.333334p-1f) * life17_202));
    }
        if ((__call2451_39(__fieldRead2451_38(life4_15)) == 1)) {
        life14_174 = (0x1.c28f5cp-3f + (life9_103 * 0x1.8p-1f));
        life15_180 = (0x1.1eb852p-2f + (life12_146 * 0x1.8p-1f));
        life16_186 = (0x1.0p-2f + (life13_156 * 0x1.8p-1f));
    }
        if (__call2451_43(__fieldRead2451_41(__fieldRead2451_40(receiver)), __fieldRead2451_42())) {
        life17_274 = __call2451_46(receiver, __fieldRead2451_45(__fieldRead2451_44(receiver)), p0);
        life18_278 = (0x1.0p0f / life14_174);
        if ((life18_278 > (0x1.0p0f / life15_180))) {
        life18_278 = (0x1.0p0f / life15_180);
    }
        if ((life18_278 > (0x1.0p0f / life16_186))) {
        life18_278 = (0x1.0p0f / life16_186);
    }
        life14_174 = ((life14_174 * (0x1.0p0f - life17_274)) + ((life14_174 * life18_278) * life17_274));
        life15_180 = ((life15_180 * (0x1.0p0f - life17_274)) + ((life15_180 * life18_278) * life17_274));
        life16_186 = ((life16_186 * (0x1.0p0f - life17_274)) + ((life16_186 * life18_278) * life17_274));
    }
        if ((life14_174 > 0x1.0p0f)) {
        life14_174 = 0x1.0p0f;
    }
        if ((life15_180 > 0x1.0p0f)) {
        life15_180 = 0x1.0p0f;
    }
        if ((life16_186 > 0x1.0p0f)) {
        life16_186 = 0x1.0p0f;
    }
        life17_357 = __fieldRead2451_49(__fieldRead2451_48(__fieldRead2451_47(receiver)));
        life18_361 = (0x1.0p0f - life14_174);
        life19_365 = (0x1.0p0f - life15_180);
        life20_369 = (0x1.0p0f - life16_186);
        life18_379 = (0x1.0p0f - (((life18_361 * life18_361) * life18_361) * life18_361));
        life19_389 = (0x1.0p0f - (((life19_365 * life19_365) * life19_365) * life19_365));
        life20_399 = (0x1.0p0f - (((life20_369 * life20_369) * life20_369) * life20_369));
        life14_409 = ((life14_174 * (0x1.0p0f - life17_357)) + (life18_379 * life17_357));
        life15_419 = ((life15_180 * (0x1.0p0f - life17_357)) + (life19_389 * life17_357));
        life16_429 = ((life16_186 * (0x1.0p0f - life17_357)) + (life20_399 * life17_357));
        life14_435 = ((life14_409 * 0x1.eb851ep-1f) + 0x1.eb851ep-6f);
        life15_441 = ((life15_419 * 0x1.eb851ep-1f) + 0x1.eb851ep-6f);
        life16_447 = ((life16_429 * 0x1.eb851ep-1f) + 0x1.eb851ep-6f);
        if ((life14_435 > 0x1.0p0f)) {
        life14_435 = 0x1.0p0f;
    }
        if ((life15_441 > 0x1.0p0f)) {
        life15_441 = 0x1.0p0f;
    }
        if ((life16_447 > 0x1.0p0f)) {
        life16_447 = 0x1.0p0f;
    }
        if ((life14_435 < 0x0.0p0f)) {
        life14_435 = 0x0.0p0f;
    }
        if ((life15_441 < 0x0.0p0f)) {
        life15_441 = 0x0.0p0f;
    }
        if ((life16_447 < 0x0.0p0f)) {
        life16_447 = 0x0.0p0f;
    }
        life21_489 = __invokedynamic2451_50(23650, (3603247256519037319L ^ life2_3));
        life22_494 = ((int) (life14_435 * 0x1.fep7f));
        life23_499 = ((int) (life15_441 * 0x1.fep7f));
        life24_504 = ((int) (life16_447 * 0x1.fep7f));
        (__fieldRead2451_51(receiver))[life7_63] = ((((life21_489 << __invokedynamic2451_52(17618, (8768790894607845644L ^ life2_3))) | (life22_494 << __invokedynamic2451_53(5478, (2055927391672408257L ^ life2_3)))) | (life23_499 << __invokedynamic2451_54(2330, (6449590514779882688L ^ life2_3)))) | life24_504);
        life7_63 += 1;
    }
        __call2451_56(__fieldRead2451_55(receiver));
        __fieldWrite2451_57(receiver, 0);
        __call2451_60(__fieldRead2451_59(__fieldRead2451_58(receiver)));
    }
    }
    return;
}
public static void h2451_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245100_0(p0);
}
public static void h2451_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245101_0(p0);
}
public static void h2451_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245102_0(p0);
}
private static native long __fieldRead2451_0() throws Throwable;
private static native boolean __fieldRead2451_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2451_2(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead2451_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2451_4(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2451_5(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2451_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call2451_7() throws Throwable;
private static native float __fieldRead2451_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int[] __fieldRead2451_9(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2451_10(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2451_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead2451_12() throws Throwable;
private static native boolean __call2451_13(net.minecraft.client.entity.EntityPlayerSP a0, net.minecraft.potion.Potion a1) throws Throwable;
private static native boolean __call2451_14(net.minecraft.client.multiplayer.WorldClient a0, float a1, int[] a2, boolean a3, float a4) throws Throwable;
private static native moom.n3 __fieldRead2451_15(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call2451_16(moom.n3 a0) throws Throwable;
private static native void __fieldWrite2451_17(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2451_18(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead2451_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2451_20(moom.A9 a0) throws Throwable;
private static native float __call2451_21(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native int __invokedynamic2451_22(int a0, long a1) throws Throwable;
private static native moom.EA __fieldRead2451_23(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float[] __call2451_24(moom.EA a0) throws Throwable;
private static native int __invokedynamic2451_25(int a0, long a1) throws Throwable;
private static native moom.EA __fieldRead2451_26(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float[] __call2451_27(moom.EA a0) throws Throwable;
private static native int __invokedynamic2451_28(int a0, long a1) throws Throwable;
private static native float __fieldRead2451_29(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __call2451_30(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native moom.EA __fieldRead2451_31(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float[] __call2451_32(moom.EA a0) throws Throwable;
private static native int __invokedynamic2451_33(int a0, long a1) throws Throwable;
private static native float __fieldRead2451_34(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead2451_35(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead2451_36(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead2451_37(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.EA __fieldRead2451_38(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call2451_39(moom.EA a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2451_40(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2451_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead2451_42() throws Throwable;
private static native boolean __call2451_43(net.minecraft.client.entity.EntityPlayerSP a0, net.minecraft.potion.Potion a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2451_44(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2451_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call2451_46(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.client.entity.EntityPlayerSP a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2451_47(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2451_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead2451_49(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __invokedynamic2451_50(int a0, long a1) throws Throwable;
private static native int[] __fieldRead2451_51(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __invokedynamic2451_52(int a0, long a1) throws Throwable;
private static native int __invokedynamic2451_53(int a0, long a1) throws Throwable;
private static native int __invokedynamic2451_54(int a0, long a1) throws Throwable;
private static native moom.n3 __fieldRead2451_55(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call2451_56(moom.n3 a0) throws Throwable;
private static native void __fieldWrite2451_57(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2451_58(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead2451_59(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2451_60(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call1245100_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1245101_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1245102_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6132570c917598e0f91c(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws E;
private static final class __SourceHandler_6132570c917598e0f91c {

public static void f100151(net.minecraft.client.renderer.EntityRenderer receiver, float p0) throws Throwable {
    int spill100151_0;
    int spill100151_1;
    long spill100151_2;
    long life2_3;
    net.minecraft.entity.Entity life4_30;
    forest_join_134: {
    life2_3 = (__fieldRead100151_0() ^ 95021050144750L);
    if (!(__fieldRead100151_3(__fieldRead100151_2(__fieldRead100151_1(receiver))))) {
        break forest_join_134;
    }
    if (!((!__fieldRead100151_6(__fieldRead100151_5(__fieldRead100151_4(receiver)))))) {
        break forest_join_134;
    }
    if (!((!__call100151_9(__fieldRead100151_8(__fieldRead100151_7(receiver)))))) {
        break forest_join_134;
    }
    if (!((!__fieldRead100151_12(__fieldRead100151_11(__fieldRead100151_10(receiver)))))) {
        break forest_join_134;
    }
    life4_30 = __call100151_14(__fieldRead100151_13(receiver));
    spill100151_0 = 5688;
    __call100151_15();
    __call100151_18(__invokedynamic100151_16(spill100151_0, (3629322435840431500L ^ life2_3)), __invokedynamic100151_17(1796, (8289522010235978943L ^ life2_3)), 1, 0);
    spill100151_1 = 5973;
    __call100151_19(0x1.0p0f);
    spill100151_2 = (5326986180320482464L ^ life2_3);
    __call100151_20();
    __call100151_21(0);
    __call100151_22();
    __call100151_24(__invokedynamic100151_23(spill100151_1, spill100151_2));
    __call100151_25();
    __call100151_26(receiver, p0);
    __call100151_28(0x0.0p0f, __call100151_27(life4_30), 0x0.0p0f);
    __call100151_31(new moom.CA(0x0.0p0d, 0x0.0p0d, 0x0.0p0d, 0x1.47ae147ae147bp-8d, 0x1.a36e2eb1c432dp-14d, 0x1.a36e2eb1c432dp-14d), __invokedynamic100151_29(17278, (8293493552778477706L ^ life2_3)), 0, 0, __invokedynamic100151_30(23650, (3603268649319538627L ^ life2_3)));
    __call100151_34(new moom.CA(0x0.0p0d, 0x0.0p0d, 0x0.0p0d, 0x1.a36e2eb1c432dp-14d, 0x1.a36e2eb1c432dp-14d, 0x1.47ae147ae147bp-8d), 0, 0, __invokedynamic100151_32(23650, (3603268649319538627L ^ life2_3)), __invokedynamic100151_33(23650, (3603268649319538627L ^ life2_3)));
    __call100151_37(new moom.CA(0x0.0p0d, 0x0.0p0d, 0x0.0p0d, 0x1.a36e2eb1c432dp-14d, 0x1.b089a02752546p-9d, 0x1.a36e2eb1c432dp-14d), 0, __invokedynamic100151_35(23650, (3603268649319538627L ^ life2_3)), 0, __invokedynamic100151_36(23650, (3603268649319538627L ^ life2_3)));
    __call100151_38();
    __call100151_39(1);
    __call100151_40();
    __call100151_41();
    }
    return;
}
public static void h100151_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13015100_0(p0);
}
public static void h100151_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13015101_0(p0);
}
public static void h100151_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13015102_0(p0);
}
private static native long __fieldRead100151_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100151_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead100151_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead100151_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100151_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead100151_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead100151_6(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100151_7(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead100151_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call100151_9(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100151_10(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead100151_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead100151_12(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100151_13(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call100151_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100151_15() throws Throwable;
private static native int __invokedynamic100151_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic100151_17(int a0, long a1) throws Throwable;
private static native void __call100151_18(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call100151_19(float a0) throws Throwable;
private static native void __call100151_20() throws Throwable;
private static native void __call100151_21(int a0) throws Throwable;
private static native void __call100151_22() throws Throwable;
private static native int __invokedynamic100151_23(int a0, long a1) throws Throwable;
private static native void __call100151_24(int a0) throws Throwable;
private static native void __call100151_25() throws Throwable;
private static native void __call100151_26(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __call100151_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call100151_28(float a0, float a1, float a2) throws Throwable;
private static native int __invokedynamic100151_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic100151_30(int a0, long a1) throws Throwable;
private static native void __call100151_31(moom.CA a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native int __invokedynamic100151_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic100151_33(int a0, long a1) throws Throwable;
private static native void __call100151_34(moom.CA a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native int __invokedynamic100151_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic100151_36(int a0, long a1) throws Throwable;
private static native void __call100151_37(moom.CA a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call100151_38() throws Throwable;
private static native void __call100151_39(int a0) throws Throwable;
private static native void __call100151_40() throws Throwable;
private static native void __call100151_41() throws Throwable;
private static native java.lang.Throwable __call13015100_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13015101_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13015102_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_682b6dd69ef4e23f5ff7(net.minecraft.client.renderer.EntityRenderer a0) throws E;
private static final class __SourceHandler_682b6dd69ef4e23f5ff7 {

public static void f100154(net.minecraft.client.renderer.EntityRenderer receiver) throws Throwable {
    long life1_3;
    float life3_14;
    forest_join_110: {
    life1_3 = (__fieldRead100154_0() ^ 75669311498934L);
    __call100154_2(__fieldRead100154_1());
    __call100154_4(__invokedynamic100154_3(13713, (7883734474811997008L ^ life1_3)));
    __call100154_5();
    life3_14 = 0x1.0p-8f;
    __call100154_6(life3_14, life3_14, life3_14);
    __call100154_7(0x1.0p3f, 0x1.0p3f, 0x1.0p3f);
    __call100154_9(__invokedynamic100154_8(25934, (8139886396086528945L ^ life1_3)));
    __call100154_13(__call100154_11(__fieldRead100154_10(receiver)), __fieldRead100154_12(receiver));
    __call100154_17(__invokedynamic100154_14(8493, (1739156870995472260L ^ life1_3)), __invokedynamic100154_15(9034, (7235369246389005727L ^ life1_3)), __invokedynamic100154_16(28488, (5783488432502972921L ^ life1_3)));
    __call100154_21(__invokedynamic100154_18(4743, (7494482110199749668L ^ life1_3)), __invokedynamic100154_19(1579, (3592091402102982892L ^ life1_3)), __invokedynamic100154_20(3176, (6357731184168420040L ^ life1_3)));
    __call100154_25(__invokedynamic100154_22(4743, (7494482110199749668L ^ life1_3)), __invokedynamic100154_23(25122, (4983603087113235653L ^ life1_3)), __invokedynamic100154_24(29739, (5418016996138138255L ^ life1_3)));
    __call100154_29(__invokedynamic100154_26(4743, (7494482110199749668L ^ life1_3)), __invokedynamic100154_27(19767, (1387754434224620497L ^ life1_3)), __invokedynamic100154_28(15594, (8885254310948598279L ^ life1_3)));
    __call100154_30(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call100154_31();
    __call100154_33(__fieldRead100154_32());
    if (!(__call100154_34())) {
        break forest_join_110;
    }
    __call100154_35();
    }
    return;
}
public static void h100154_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13015400_0(p0);
}
private static native long __fieldRead100154_0() throws Throwable;
private static native int __fieldRead100154_1() throws Throwable;
private static native void __call100154_2(int a0) throws Throwable;
private static native int __invokedynamic100154_3(int a0, long a1) throws Throwable;
private static native void __call100154_4(int a0) throws Throwable;
private static native void __call100154_5() throws Throwable;
private static native void __call100154_6(float a0, float a1, float a2) throws Throwable;
private static native void __call100154_7(float a0, float a1, float a2) throws Throwable;
private static native int __invokedynamic100154_8(int a0, long a1) throws Throwable;
private static native void __call100154_9(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100154_10(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call100154_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead100154_12(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call100154_13(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic100154_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic100154_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic100154_16(int a0, long a1) throws Throwable;
private static native void __call100154_17(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100154_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic100154_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic100154_20(int a0, long a1) throws Throwable;
private static native void __call100154_21(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100154_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic100154_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic100154_24(int a0, long a1) throws Throwable;
private static native void __call100154_25(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100154_26(int a0, long a1) throws Throwable;
private static native int __invokedynamic100154_27(int a0, long a1) throws Throwable;
private static native int __invokedynamic100154_28(int a0, long a1) throws Throwable;
private static native void __call100154_29(int a0, int a1, int a2) throws Throwable;
private static native void __call100154_30(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call100154_31() throws Throwable;
private static native int __fieldRead100154_32() throws Throwable;
private static native void __call100154_33(int a0) throws Throwable;
private static native boolean __call100154_34() throws Throwable;
private static native void __call100154_35() throws Throwable;
private static native java.lang.Throwable __call13015400_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c0d1d3abbe0ed468aefe(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws E;
private static final class __SourceHandler_c0d1d3abbe0ed468aefe {

public static void f1396(net.minecraft.client.renderer.EntityRenderer receiver, float p0) throws Throwable {
    int spill1396_0;
    long spill1396_1;
    int spill1396_2;
    long spill1396_3;
    long life2_3;
    float life4_9;
    net.minecraft.entity.Entity life5_28;
    net.minecraft.client.multiplayer.WorldClient life6_35;
    int life7_39;
    int life8_43;
    int life9_47;
    net.minecraft.client.renderer.Tessellator life10_49;
    moom.lw life11_52;
    double life12_86;
    double life14_98;
    double life16_110;
    int life18_113;
    int life19_115;
    int life20_125;
    float life21_131;
    moom.DU life22_148;
    int life23_152;
    int life24_161;
    int life25_192;
    double life26_200;
    double life28_208;
    net.minecraft.world.biome.BiomeGenBase life30_218;
    int life31_232;
    int life32_236;
    int life33_240;
    int life34_254;
    float life35_311;
    double life36_406;
    double life38_415;
    double life40_424;
    float life42_436;
    float life43_448;
    int life44_459;
    int life45_473;
    int life46_481;
    double life36_657;
    double life38_672;
    double life40_686;
    double life42_695;
    double life44_704;
    float life46_716;
    float life47_728;
    int life48_749;
    int life49_763;
    int life50_771;
    lexical_join_921: {
    lexical_join_905: {
    lexical_join_901: {
    lexical_join_119: {
    lexical_join_17: {
    life2_3 = (__fieldRead1396_0() ^ 125787574998357L);
    life4_9 = __call1396_3(__fieldRead1396_2(__fieldRead1396_1(receiver)), p0);
    if (!((__numericCompare1396_4(life4_9, 0x0.0p0f) > 0))) {
        break lexical_join_921;
    }
    if (!(__call1396_5())) {
        break lexical_join_17;
    }
    return;
    }
    __call1396_6(receiver);
    spill1396_0 = 27000;
    life5_28 = __call1396_8(__fieldRead1396_7(receiver));
    spill1396_1 = (8838229425477031996L ^ life2_3);
    life6_35 = __fieldRead1396_10(__fieldRead1396_9(receiver));
    life7_39 = __call1396_12(__fieldRead1396_11(life5_28));
    life8_43 = __call1396_14(__fieldRead1396_13(life5_28));
    life9_47 = __call1396_16(__fieldRead1396_15(life5_28));
    life10_49 = __call1396_17();
    life11_52 = __call1396_18(life10_49);
    __call1396_19();
    __call1396_20(0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    __call1396_21();
    __call1396_24(__invokedynamic1396_22(spill1396_0, spill1396_1), __invokedynamic1396_23(4803, (2351935558572958684L ^ life2_3)), 1, 0);
    __call1396_26(__invokedynamic1396_25(23041, (4848032742797028102L ^ life2_3)), 0x1.99999ap-4f);
    life12_86 = (__fieldRead1396_27(life5_28) + ((__fieldRead1396_28(life5_28) - __fieldRead1396_29(life5_28)) * ((double) p0)));
    life14_98 = (__fieldRead1396_30(life5_28) + ((__fieldRead1396_31(life5_28) - __fieldRead1396_32(life5_28)) * ((double) p0)));
    life16_110 = (__fieldRead1396_33(life5_28) + ((__fieldRead1396_34(life5_28) - __fieldRead1396_35(life5_28)) * ((double) p0)));
    life18_113 = __call1396_36(life14_98);
    life19_115 = 5;
    if (!(__call1396_37())) {
        break lexical_join_119;
    }
    life19_115 = __invokedynamic1396_38(25195, (2510506071735833405L ^ life2_3));
    }
    life20_125 = -1;
    life21_131 = (((float) __fieldRead1396_39(receiver)) + p0);
    __call1396_40(life11_52, (-life12_86), (-life14_98), (-life16_110));
    __call1396_41(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    life22_148 = new moom.DU();
    life23_152 = (life9_47 - life19_115);
    lexical_cycle_148: while (true) {
    lexical_join_899: {
    if (!((life23_152 <= (life9_47 + life19_115)))) {
        break lexical_join_901;
    }
    life24_161 = (life7_39 - life19_115);
    lexical_cycle_157: while (true) {
    lexical_join_897: {
    lexical_join_620: {
    lexical_join_605: {
    lexical_join_598: {
    lexical_join_333: {
    lexical_join_318: {
    lexical_join_243: {
    lexical_join_238: {
    lexical_join_220: {
    if (!((life24_161 <= (life7_39 + life19_115)))) {
        break lexical_join_899;
    }
    life25_192 = ((((((life23_152 - life9_47) + __invokedynamic1396_42(5478, (2055916225395024958L ^ life2_3))) * __invokedynamic1396_43(9618, (9157432521823540399L ^ life2_3))) + life24_161) - life7_39) + __invokedynamic1396_44(5478, (2055916225395024958L ^ life2_3)));
    life26_200 = (((double) (__fieldRead1396_45(receiver))[life25_192]) * 0x1.0p-1d);
    life28_208 = (((double) (__fieldRead1396_46(receiver))[life25_192]) * 0x1.0p-1d);
    __call1396_47(life22_148, life24_161, 0, life23_152);
    life30_218 = __call1396_48(life6_35, life22_148);
    if (!((!__call1396_49(life30_218)))) {
        break lexical_join_220;
    }
    if (!(__call1396_50(life30_218))) {
        break lexical_join_897;
    }
    }
    life31_232 = __call1396_52(__call1396_51(life6_35, life22_148));
    life32_236 = (life8_43 - life19_115);
    life33_240 = (life8_43 + life19_115);
    if (!((life32_236 < life31_232))) {
        break lexical_join_238;
    }
    life32_236 = life31_232;
    }
    if (!((life33_240 < life31_232))) {
        break lexical_join_243;
    }
    life33_240 = life31_232;
    }
    life34_254 = __call1396_53(life31_232, life18_113);
    if (!((life32_236 != life33_240))) {
        break lexical_join_897;
    }
    __call1396_59(__fieldRead1396_54(receiver), ((((((long) life24_161) * ((long) life24_161)) * __invokedynamic1396_55(18437, (8345159490262114677L ^ life2_3))) + (((long) life24_161) * __invokedynamic1396_56(32253, (2637370014116975755L ^ life2_3)))) ^ (((((long) life23_152) * ((long) life23_152)) * __invokedynamic1396_57(22921, (7820602456434422003L ^ life2_3))) + (((long) life23_152) * __invokedynamic1396_58(8675, (1781329048916084887L ^ life2_3))))));
    __call1396_60(life22_148, life24_161, life32_236, life23_152);
    life35_311 = __call1396_61(life30_218, life22_148);
    if (!((__numericCompare1396_64(__call1396_63(__call1396_62(life6_35), life35_311, life31_232), 0x1.333334p-3f) >= 0))) {
        break lexical_join_598;
    }
    if (!((life20_125 != 0))) {
        break lexical_join_333;
    }
    if (!((life20_125 >= 0))) {
        break lexical_join_318;
    }
    __call1396_65(life10_49);
    }
    life20_125 = 0;
    __call1396_69(__call1396_67(__fieldRead1396_66(receiver)), __fieldRead1396_68());
    __call1396_72(life11_52, __invokedynamic1396_70(13601, (4111846298218284042L ^ life2_3)), __fieldRead1396_71());
    }
    life36_406 = (((((double) (((((__fieldRead1396_73(receiver) + ((life24_161 * life24_161) * __invokedynamic1396_74(29590, (2064567856955064988L ^ life2_3)))) + (life24_161 * __invokedynamic1396_75(22662, (4255752572792089006L ^ life2_3)))) + ((life23_152 * life23_152) * __invokedynamic1396_76(3614, (7448467395825434401L ^ life2_3)))) + (life23_152 * __invokedynamic1396_77(16674, (7980057804935606396L ^ life2_3)))) & __invokedynamic1396_78(24512, (8783774122311102109L ^ life2_3)))) + ((double) p0)) / 0x1.0p5d) * (0x1.8p1d + __call1396_80(__fieldRead1396_79(receiver))));
    life38_415 = (((double) (((float) life24_161) + 0x1.0p-1f)) - __fieldRead1396_81(life5_28));
    life40_424 = (((double) (((float) life23_152) + 0x1.0p-1f)) - __fieldRead1396_82(life5_28));
    life42_436 = (__call1396_83(((life38_415 * life38_415) + (life40_424 * life40_424))) / ((float) life19_115));
    life43_448 = ((((0x1.0p0f - (life42_436 * life42_436)) * 0x1.0p-1f) + 0x1.0p-1f) * life4_9);
    __call1396_84(life22_148, life24_161, life34_254, life23_152);
    life44_459 = __call1396_85(life6_35, life22_148, 0);
    life45_473 = ((life44_459 >> __invokedynamic1396_86(5478, (2055916225395024958L ^ life2_3))) & __invokedynamic1396_87(6152, (4140007963030317376L ^ life2_3)));
    life46_481 = (life44_459 & __invokedynamic1396_88(13311, (3139505093147902700L ^ life2_3)));
    __call1396_93(__call1396_92(__call1396_91(__call1396_90(__call1396_89(life11_52, ((((double) life24_161) - life26_200) + 0x1.0p-1d), ((double) life32_236), ((((double) life23_152) - life28_208) + 0x1.0p-1d)), 0x0.0p0d, ((((double) life32_236) * 0x1.0p-2d) + life36_406)), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, life43_448), life45_473, life46_481));
    __call1396_98(__call1396_97(__call1396_96(__call1396_95(__call1396_94(life11_52, ((((double) life24_161) + life26_200) + 0x1.0p-1d), ((double) life32_236), ((((double) life23_152) + life28_208) + 0x1.0p-1d)), 0x1.0p0d, ((((double) life32_236) * 0x1.0p-2d) + life36_406)), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, life43_448), life45_473, life46_481));
    __call1396_103(__call1396_102(__call1396_101(__call1396_100(__call1396_99(life11_52, ((((double) life24_161) + life26_200) + 0x1.0p-1d), ((double) life33_240), ((((double) life23_152) + life28_208) + 0x1.0p-1d)), 0x1.0p0d, ((((double) life33_240) * 0x1.0p-2d) + life36_406)), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, life43_448), life45_473, life46_481));
    __call1396_108(__call1396_107(__call1396_106(__call1396_105(__call1396_104(life11_52, ((((double) life24_161) - life26_200) + 0x1.0p-1d), ((double) life33_240), ((((double) life23_152) - life28_208) + 0x1.0p-1d)), 0x0.0p0d, ((((double) life33_240) * 0x1.0p-2d) + life36_406)), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, life43_448), life45_473, life46_481));
    break lexical_join_897;
    }
    if (!((life20_125 != 1))) {
        break lexical_join_620;
    }
    if (!((life20_125 == 0))) {
        break lexical_join_605;
    }
    __call1396_109(life10_49);
    }
    life20_125 = 1;
    __call1396_113(__call1396_111(__fieldRead1396_110(receiver)), __fieldRead1396_112());
    __call1396_116(life11_52, __invokedynamic1396_114(32254, (4803562706571594987L ^ life2_3)), __fieldRead1396_115());
    }
    life36_657 = ((double) ((((float) (__fieldRead1396_117(receiver) & __invokedynamic1396_118(3995, (1515468716846448281L ^ life2_3)))) + p0) / 0x1.0p9f));
    life38_672 = (__call1396_120(__fieldRead1396_119(receiver)) + ((((double) life21_131) * 0x1.47ae147ae147bp-7d) * ((double) ((float) __call1396_122(__fieldRead1396_121(receiver))))));
    life40_686 = (__call1396_124(__fieldRead1396_123(receiver)) + (((double) (life21_131 * ((float) __call1396_126(__fieldRead1396_125(receiver))))) * 0x1.0624dd2f1a9fcp-10d));
    life42_695 = (((double) (((float) life24_161) + 0x1.0p-1f)) - __fieldRead1396_127(life5_28));
    life44_704 = (((double) (((float) life23_152) + 0x1.0p-1f)) - __fieldRead1396_128(life5_28));
    life46_716 = (__call1396_129(((life42_695 * life42_695) + (life44_704 * life44_704))) / ((float) life19_115));
    life47_728 = ((((0x1.0p0f - (life46_716 * life46_716)) * 0x1.333334p-2f) + 0x1.0p-1f) * life4_9);
    __call1396_130(life22_148, life24_161, life34_254, life23_152);
    life48_749 = (((__call1396_131(life6_35, life22_148, 0) * 3) + __invokedynamic1396_132(21580, (7923155020364850519L ^ life2_3))) / 4);
    life49_763 = ((life48_749 >> __invokedynamic1396_133(5478, (2055916225395024958L ^ life2_3))) & __invokedynamic1396_134(13311, (3139505093147902700L ^ life2_3)));
    life50_771 = (life48_749 & __invokedynamic1396_135(13311, (3139505093147902700L ^ life2_3)));
    __call1396_140(__call1396_139(__call1396_138(__call1396_137(__call1396_136(life11_52, ((((double) life24_161) - life26_200) + 0x1.0p-1d), ((double) life32_236), ((((double) life23_152) - life28_208) + 0x1.0p-1d)), (0x0.0p0d + life38_672), (((((double) life32_236) * 0x1.0p-2d) + life36_657) + life40_686)), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, life47_728), life49_763, life50_771));
    __call1396_145(__call1396_144(__call1396_143(__call1396_142(__call1396_141(life11_52, ((((double) life24_161) + life26_200) + 0x1.0p-1d), ((double) life32_236), ((((double) life23_152) + life28_208) + 0x1.0p-1d)), (0x1.0p0d + life38_672), (((((double) life32_236) * 0x1.0p-2d) + life36_657) + life40_686)), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, life47_728), life49_763, life50_771));
    __call1396_150(__call1396_149(__call1396_148(__call1396_147(__call1396_146(life11_52, ((((double) life24_161) + life26_200) + 0x1.0p-1d), ((double) life33_240), ((((double) life23_152) + life28_208) + 0x1.0p-1d)), (0x1.0p0d + life38_672), (((((double) life33_240) * 0x1.0p-2d) + life36_657) + life40_686)), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, life47_728), life49_763, life50_771));
    __call1396_155(__call1396_154(__call1396_153(__call1396_152(__call1396_151(life11_52, ((((double) life24_161) - life26_200) + 0x1.0p-1d), ((double) life33_240), ((((double) life23_152) - life28_208) + 0x1.0p-1d)), (0x0.0p0d + life38_672), (((((double) life33_240) * 0x1.0p-2d) + life36_657) + life40_686)), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, life47_728), life49_763, life50_771));
    }
    life24_161 += 1;
    continue lexical_cycle_157;
    }
    }
    life23_152 += 1;
    continue lexical_cycle_148;
    }
    }
    if (!((life20_125 >= 0))) {
        break lexical_join_905;
    }
    __call1396_156(life10_49);
    }
    __call1396_157(life11_52, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
    spill1396_2 = 23041;
    __call1396_158();
    spill1396_3 = (4848032742797028102L ^ life2_3);
    __call1396_159();
    __call1396_161(__invokedynamic1396_160(spill1396_2, spill1396_3), 0x1.99999ap-4f);
    __call1396_162(receiver);
    }
    return;
}
public static void h1396_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139600_0(p0);
}
public static void h1396_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139601_0(p0);
}
public static void h1396_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139602_0(p0);
}
public static void h1396_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139603_0(p0);
}
public static void h1396_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139604_0(p0);
}
public static void h1396_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139605_0(p0);
}
public static void h1396_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139606_0(p0);
}
public static void h1396_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139607_0(p0);
}
public static void h1396_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1139608_0(p0);
}
private static native long __fieldRead1396_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1396_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1396_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call1396_3(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native int __numericCompare1396_4(float a0, float a1) throws Throwable;
private static native boolean __call1396_5() throws Throwable;
private static native void __call1396_6(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1396_7(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1396_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1396_9(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1396_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1396_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1396_12(double a0) throws Throwable;
private static native double __fieldRead1396_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1396_14(double a0) throws Throwable;
private static native double __fieldRead1396_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1396_16(double a0) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call1396_17() throws Throwable;
private static native moom.lw __call1396_18(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call1396_19() throws Throwable;
private static native void __call1396_20(float a0, float a1, float a2) throws Throwable;
private static native void __call1396_21() throws Throwable;
private static native int __invokedynamic1396_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic1396_23(int a0, long a1) throws Throwable;
private static native void __call1396_24(int a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic1396_25(int a0, long a1) throws Throwable;
private static native void __call1396_26(int a0, float a1) throws Throwable;
private static native double __fieldRead1396_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1396_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1396_29(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1396_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1396_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1396_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1396_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1396_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1396_35(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1396_36(double a0) throws Throwable;
private static native boolean __call1396_37() throws Throwable;
private static native int __invokedynamic1396_38(int a0, long a1) throws Throwable;
private static native int __fieldRead1396_39(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call1396_40(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call1396_41(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic1396_42(int a0, long a1) throws Throwable;
private static native int __invokedynamic1396_43(int a0, long a1) throws Throwable;
private static native int __invokedynamic1396_44(int a0, long a1) throws Throwable;
private static native float[] __fieldRead1396_45(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float[] __fieldRead1396_46(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.DU __call1396_47(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call1396_48(net.minecraft.client.multiplayer.WorldClient a0, moom.DU a1) throws Throwable;
private static native boolean __call1396_49(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native boolean __call1396_50(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native moom.DT __call1396_51(net.minecraft.client.multiplayer.WorldClient a0, moom.DU a1) throws Throwable;
private static native int __call1396_52(moom.DT a0) throws Throwable;
private static native int __call1396_53(int a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1396_54(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native long __invokedynamic1396_55(int a0, long a1) throws Throwable;
private static native long __invokedynamic1396_56(int a0, long a1) throws Throwable;
private static native long __invokedynamic1396_57(int a0, long a1) throws Throwable;
private static native long __invokedynamic1396_58(int a0, long a1) throws Throwable;
private static native void __call1396_59(java.util.Random a0, long a1) throws Throwable;
private static native moom.DU __call1396_60(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native float __call1396_61(net.minecraft.world.biome.BiomeGenBase a0, moom.DU a1) throws Throwable;
private static native net.minecraft.world.biome.WorldChunkManager __call1396_62(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call1396_63(net.minecraft.world.biome.WorldChunkManager a0, float a1, int a2) throws Throwable;
private static native int __numericCompare1396_64(float a0, float a1) throws Throwable;
private static native void __call1396_65(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1396_66(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1396_67(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1396_68() throws Throwable;
private static native void __call1396_69(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic1396_70(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead1396_71() throws Throwable;
private static native void __call1396_72(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native int __fieldRead1396_73(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __invokedynamic1396_74(int a0, long a1) throws Throwable;
private static native int __invokedynamic1396_75(int a0, long a1) throws Throwable;
private static native int __invokedynamic1396_76(int a0, long a1) throws Throwable;
private static native int __invokedynamic1396_77(int a0, long a1) throws Throwable;
private static native int __invokedynamic1396_78(int a0, long a1) throws Throwable;
private static native java.util.Random __fieldRead1396_79(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native double __call1396_80(java.util.Random a0) throws Throwable;
private static native double __fieldRead1396_81(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1396_82(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call1396_83(double a0) throws Throwable;
private static native moom.DU __call1396_84(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native int __call1396_85(net.minecraft.client.multiplayer.WorldClient a0, moom.DU a1, int a2) throws Throwable;
private static native int __invokedynamic1396_86(int a0, long a1) throws Throwable;
private static native int __invokedynamic1396_87(int a0, long a1) throws Throwable;
private static native int __invokedynamic1396_88(int a0, long a1) throws Throwable;
private static native moom.lw __call1396_89(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1396_90(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call1396_91(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call1396_92(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call1396_93(moom.lw a0) throws Throwable;
private static native moom.lw __call1396_94(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1396_95(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call1396_96(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call1396_97(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call1396_98(moom.lw a0) throws Throwable;
private static native moom.lw __call1396_99(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1396_100(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call1396_101(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call1396_102(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call1396_103(moom.lw a0) throws Throwable;
private static native moom.lw __call1396_104(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1396_105(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call1396_106(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call1396_107(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call1396_108(moom.lw a0) throws Throwable;
private static native void __call1396_109(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1396_110(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1396_111(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1396_112() throws Throwable;
private static native void __call1396_113(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic1396_114(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead1396_115() throws Throwable;
private static native void __call1396_116(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native int __fieldRead1396_117(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __invokedynamic1396_118(int a0, long a1) throws Throwable;
private static native java.util.Random __fieldRead1396_119(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native double __call1396_120(java.util.Random a0) throws Throwable;
private static native java.util.Random __fieldRead1396_121(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native double __call1396_122(java.util.Random a0) throws Throwable;
private static native java.util.Random __fieldRead1396_123(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native double __call1396_124(java.util.Random a0) throws Throwable;
private static native java.util.Random __fieldRead1396_125(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native double __call1396_126(java.util.Random a0) throws Throwable;
private static native double __fieldRead1396_127(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1396_128(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call1396_129(double a0) throws Throwable;
private static native moom.DU __call1396_130(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native int __call1396_131(net.minecraft.client.multiplayer.WorldClient a0, moom.DU a1, int a2) throws Throwable;
private static native int __invokedynamic1396_132(int a0, long a1) throws Throwable;
private static native int __invokedynamic1396_133(int a0, long a1) throws Throwable;
private static native int __invokedynamic1396_134(int a0, long a1) throws Throwable;
private static native int __invokedynamic1396_135(int a0, long a1) throws Throwable;
private static native moom.lw __call1396_136(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1396_137(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call1396_138(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call1396_139(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call1396_140(moom.lw a0) throws Throwable;
private static native moom.lw __call1396_141(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1396_142(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call1396_143(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call1396_144(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call1396_145(moom.lw a0) throws Throwable;
private static native moom.lw __call1396_146(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1396_147(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call1396_148(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call1396_149(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call1396_150(moom.lw a0) throws Throwable;
private static native moom.lw __call1396_151(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1396_152(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call1396_153(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call1396_154(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call1396_155(moom.lw a0) throws Throwable;
private static native void __call1396_156(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call1396_157(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call1396_158() throws Throwable;
private static native void __call1396_159() throws Throwable;
private static native int __invokedynamic1396_160(int a0, long a1) throws Throwable;
private static native void __call1396_161(int a0, float a1) throws Throwable;
private static native void __call1396_162(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native java.lang.Throwable __call1139600_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139601_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139602_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139603_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139604_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139605_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139606_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139607_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1139608_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4231b39026bfceb14a01(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws E;
private static final class __SourceHandler_4231b39026bfceb14a01 {

public static void f585(net.minecraft.client.renderer.EntityRenderer receiver, float p0) throws Throwable {
    moom.DR forestValue585_114_0;
    long life2_3;
    net.minecraft.client.multiplayer.WorldClient life4_7;
    net.minecraft.entity.Entity life5_11;
    float life6_23;
    float life6_31;
    moom.DR life7_38;
    moom.DR life7_46;
    float life8_50;
    float life9_54;
    float life10_58;
    moom.DR life11_62;
    moom.DR life11_70;
    double life12_93;
    moom.DR life14_114;
    float life15_121;
    float[] life16_139;
    float life15_147;
    float life12_226;
    float life13_236;
    float life14_242;
    float life13_264;
    float life14_274;
    net.minecraft.block.Block life14_299;
    moom.DR life15_306;
    float life15_332;
    float life15_337;
    moom.DR life16_386;
    moom.DR life15_437;
    float life15_466;
    double life16_500;
    int life18_515;
    double life16_550;
    float life18_590;
    float life18_650;
    float life19_655;
    float life18_753;
    float life19_765;
    float life20_777;
    forest_join_781: {
    forest_join_726: {
    forest_join_681: {
    forest_join_674: {
    forest_join_662: {
    forest_join_631: {
    forest_join_570: {
    forest_join_542: {
    forest_join_532: {
    forest_join_530: {
    forest_join_453: {
    forest_join_404: {
    forest_join_403: {
    forest_join_352: {
    forest_join_323: {
    forest_join_293: {
    forest_join_261: {
    forest_join_190: {
    forest_join_128: {
    forest_join_114: {
    forest_join_108: {
    life2_3 = (__fieldRead585_0() ^ 45090940198435L);
    life4_7 = __fieldRead585_2(__fieldRead585_1(receiver));
    life5_11 = __call585_4(__fieldRead585_3(receiver));
    life6_23 = (0x1.0p-2f + ((0x1.8p-1f * ((float) __fieldRead585_7(__fieldRead585_6(__fieldRead585_5(receiver))))) / 0x1.0p5f));
    life6_31 = (0x1.0p0f - ((float) __call585_8(((double) life6_23), 0x1.0p-2d)));
    life7_38 = __call585_11(life4_7, __call585_10(__fieldRead585_9(receiver)), p0);
    life7_46 = __call585_14(life7_38, life4_7, __call585_13(__fieldRead585_12(receiver)), p0);
    life8_50 = ((float) __fieldRead585_15(life7_46));
    life9_54 = ((float) __fieldRead585_16(life7_46));
    life10_58 = ((float) __fieldRead585_17(life7_46));
    life11_62 = __call585_18(life4_7, p0);
    life11_70 = __call585_21(life11_62, life4_7, __call585_20(__fieldRead585_19(receiver)), p0);
    __fieldWrite585_23(receiver, ((float) __fieldRead585_22(life11_70)));
    __fieldWrite585_25(receiver, ((float) __fieldRead585_24(life11_70)));
    __fieldWrite585_27(receiver, ((float) __fieldRead585_26(life11_70)));
    if (!((__fieldRead585_30(__fieldRead585_29(__fieldRead585_28(receiver))) >= 4))) {
        break forest_join_190;
    }
    life12_93 = -0x1.0p0d;
    if (!((__numericCompare585_33(__call585_32(__call585_31(life4_7, p0)), 0x0.0p0f) > 0))) {
        break forest_join_108;
    }
    forestValue585_114_0 = new moom.DR(life12_93, 0x0.0p0d, 0x0.0p0d);
    break forest_join_114;
    }
    forestValue585_114_0 = new moom.DR(0x1.0p0d, 0x0.0p0d, 0x0.0p0d);
    }
    life14_114 = forestValue585_114_0;
    life15_121 = ((float) __call585_35(__call585_34(life5_11, p0), life14_114));
    if (!((__numericCompare585_36(life15_121, 0x0.0p0f) < 0))) {
        break forest_join_128;
    }
    life15_121 = 0x0.0p0f;
    }
    if (!((__numericCompare585_37(life15_121, 0x0.0p0f) > 0))) {
        break forest_join_190;
    }
    life16_139 = __call585_40(__fieldRead585_38(life4_7), __call585_39(life4_7, p0), p0);
    if (!((life16_139 != null))) {
        break forest_join_190;
    }
    life15_147 = (life15_121 * (life16_139)[3]);
    __fieldWrite585_42(receiver, ((__fieldRead585_41(receiver) * (0x1.0p0f - life15_147)) + ((life16_139)[0] * life15_147)));
    __fieldWrite585_44(receiver, ((__fieldRead585_43(receiver) * (0x1.0p0f - life15_147)) + ((life16_139)[1] * life15_147)));
    __fieldWrite585_46(receiver, ((__fieldRead585_45(receiver) * (0x1.0p0f - life15_147)) + ((life16_139)[2] * life15_147)));
    }
    net.minecraft.client.renderer.EntityRenderer __stackOp585_47_0 = receiver;
    __fieldWrite585_50(__stackOp585_47_0, (__fieldRead585_48(__stackOp585_47_0) + ((life8_50 - __fieldRead585_49(receiver)) * life6_31)));
    net.minecraft.client.renderer.EntityRenderer __stackOp585_51_0 = receiver;
    __fieldWrite585_54(__stackOp585_51_0, (__fieldRead585_52(__stackOp585_51_0) + ((life9_54 - __fieldRead585_53(receiver)) * life6_31)));
    net.minecraft.client.renderer.EntityRenderer __stackOp585_55_0 = receiver;
    __fieldWrite585_58(__stackOp585_55_0, (__fieldRead585_56(__stackOp585_55_0) + ((life10_58 - __fieldRead585_57(receiver)) * life6_31)));
    life12_226 = __call585_59(life4_7, p0);
    if (!((__numericCompare585_60(life12_226, 0x0.0p0f) > 0))) {
        break forest_join_261;
    }
    life13_236 = (0x1.0p0f - (life12_226 * 0x1.0p-1f));
    life14_242 = (0x1.0p0f - (life12_226 * 0x1.99999ap-2f));
    net.minecraft.client.renderer.EntityRenderer __stackOp585_61_0 = receiver;
    __fieldWrite585_63(__stackOp585_61_0, (__fieldRead585_62(__stackOp585_61_0) * life13_236));
    net.minecraft.client.renderer.EntityRenderer __stackOp585_64_0 = receiver;
    __fieldWrite585_66(__stackOp585_64_0, (__fieldRead585_65(__stackOp585_64_0) * life13_236));
    net.minecraft.client.renderer.EntityRenderer __stackOp585_67_0 = receiver;
    __fieldWrite585_69(__stackOp585_67_0, (__fieldRead585_68(__stackOp585_67_0) * life14_242));
    }
    life13_264 = __call585_70(life4_7, p0);
    if (!((__numericCompare585_71(life13_264, 0x0.0p0f) > 0))) {
        break forest_join_293;
    }
    life14_274 = (0x1.0p0f - (life13_264 * 0x1.0p-1f));
    net.minecraft.client.renderer.EntityRenderer __stackOp585_72_0 = receiver;
    __fieldWrite585_74(__stackOp585_72_0, (__fieldRead585_73(__stackOp585_72_0) * life14_274));
    net.minecraft.client.renderer.EntityRenderer __stackOp585_75_0 = receiver;
    __fieldWrite585_77(__stackOp585_75_0, (__fieldRead585_76(__stackOp585_75_0) * life14_274));
    net.minecraft.client.renderer.EntityRenderer __stackOp585_78_0 = receiver;
    __fieldWrite585_80(__stackOp585_78_0, (__fieldRead585_79(__stackOp585_78_0) * life14_274));
    }
    life14_299 = __call585_83(__fieldRead585_82(__fieldRead585_81(receiver)), life5_11, p0);
    if (!(__fieldRead585_84(receiver))) {
        break forest_join_323;
    }
    life15_306 = __call585_85(life4_7, p0);
    __fieldWrite585_87(receiver, ((float) __fieldRead585_86(life15_306)));
    __fieldWrite585_89(receiver, ((float) __fieldRead585_88(life15_306)));
    __fieldWrite585_91(receiver, ((float) __fieldRead585_90(life15_306)));
    break forest_join_453;
    }
    if (!((__call585_92(life14_299) == __fieldRead585_93()))) {
        break forest_join_404;
    }
    life15_332 = (((float) __call585_94(life5_11)) * 0x1.99999ap-3f);
    life15_337 = __call585_95(life15_332, 0x0.0p0f, 0x1.333334p-1f);
    if (!((__instanceOf585_96(life5_11) != 0))) {
        break forest_join_352;
    }
    if (!(__call585_99(__cast585_97(life5_11), __fieldRead585_98()))) {
        break forest_join_352;
    }
    life15_337 = ((life15_337 * 0x1.333334p-2f) + 0x1.333334p-1f);
    }
    __fieldWrite585_100(receiver, (0x1.47ae14p-6f + life15_337));
    __fieldWrite585_101(receiver, (0x1.47ae14p-6f + life15_337));
    __fieldWrite585_102(receiver, (0x1.99999ap-3f + life15_337));
    life16_386 = __call585_114(__fieldRead585_104(__fieldRead585_103(receiver)), __fieldRead585_107(__call585_106(__fieldRead585_105(receiver))), (__fieldRead585_110(__call585_109(__fieldRead585_108(receiver))) + 0x1.0p0d), __fieldRead585_113(__call585_112(__fieldRead585_111(receiver))));
    if (!((life16_386 != null))) {
        break forest_join_403;
    }
    __fieldWrite585_116(receiver, ((float) __fieldRead585_115(life16_386)));
    __fieldWrite585_118(receiver, ((float) __fieldRead585_117(life16_386)));
    __fieldWrite585_120(receiver, ((float) __fieldRead585_119(life16_386)));
    }
    break forest_join_453;
    }
    if (!((__call585_121(life14_299) == __fieldRead585_122()))) {
        break forest_join_453;
    }
    __fieldWrite585_123(receiver, 0x1.333334p-1f);
    __fieldWrite585_124(receiver, 0x1.99999ap-4f);
    __fieldWrite585_125(receiver, 0x0.0p0f);
    life15_437 = __call585_137(__fieldRead585_127(__fieldRead585_126(receiver)), __fieldRead585_130(__call585_129(__fieldRead585_128(receiver))), (__fieldRead585_133(__call585_132(__fieldRead585_131(receiver))) + 0x1.0p0d), __fieldRead585_136(__call585_135(__fieldRead585_134(receiver))));
    if (!((life15_437 != null))) {
        break forest_join_453;
    }
    __fieldWrite585_139(receiver, ((float) __fieldRead585_138(life15_437)));
    __fieldWrite585_141(receiver, ((float) __fieldRead585_140(life15_437)));
    __fieldWrite585_143(receiver, ((float) __fieldRead585_142(life15_437)));
    }
    life15_466 = (__fieldRead585_144(receiver) + ((__fieldRead585_145(receiver) - __fieldRead585_146(receiver)) * p0));
    net.minecraft.client.renderer.EntityRenderer __stackOp585_147_0 = receiver;
    __fieldWrite585_149(__stackOp585_147_0, (__fieldRead585_148(__stackOp585_147_0) * life15_466));
    net.minecraft.client.renderer.EntityRenderer __stackOp585_150_0 = receiver;
    __fieldWrite585_152(__stackOp585_150_0, (__fieldRead585_151(__stackOp585_150_0) * life15_466));
    net.minecraft.client.renderer.EntityRenderer __stackOp585_153_0 = receiver;
    __fieldWrite585_155(__stackOp585_153_0, (__fieldRead585_154(__stackOp585_153_0) * life15_466));
    life16_500 = ((__fieldRead585_156(life5_11) + ((__fieldRead585_157(life5_11) - __fieldRead585_158(life5_11)) * ((double) p0))) * __call585_160(__fieldRead585_159(life4_7)));
    if (!((__instanceOf585_161(life5_11) != 0))) {
        break forest_join_532;
    }
    if (!(__call585_164(__cast585_162(life5_11), __fieldRead585_163()))) {
        break forest_join_532;
    }
    life18_515 = __call585_168(__call585_167(__cast585_165(life5_11), __fieldRead585_166()));
    if (!((life18_515 < __invokedynamic585_169(2619, (6175380712442982470L ^ life2_3))))) {
        break forest_join_530;
    }
    life16_500 = (life16_500 * ((double) (0x1.0p0f - (((float) life18_515) / 0x1.4p4f))));
    break forest_join_532;
    }
    life16_500 = 0x0.0p0d;
    }
    if (!((__numericCompare585_170(life16_500, 0x1.0p0d) < 0))) {
        break forest_join_570;
    }
    if (!((__numericCompare585_171(life16_500, 0x0.0p0d) < 0))) {
        break forest_join_542;
    }
    life16_500 = 0x0.0p0d;
    }
    life16_550 = (life16_500 * life16_500);
    __fieldWrite585_173(receiver, ((float) (((double) __fieldRead585_172(receiver)) * life16_550)));
    __fieldWrite585_175(receiver, ((float) (((double) __fieldRead585_174(receiver)) * life16_550)));
    __fieldWrite585_177(receiver, ((float) (((double) __fieldRead585_176(receiver)) * life16_550)));
    }
    if (!((__numericCompare585_179(__fieldRead585_178(receiver), 0x0.0p0f) > 0))) {
        break forest_join_631;
    }
    life18_590 = (__fieldRead585_180(receiver) + ((__fieldRead585_181(receiver) - __fieldRead585_182(receiver)) * p0));
    __fieldWrite585_185(receiver, ((__fieldRead585_183(receiver) * (0x1.0p0f - life18_590)) + ((__fieldRead585_184(receiver) * 0x1.666666p-1f) * life18_590)));
    __fieldWrite585_188(receiver, ((__fieldRead585_186(receiver) * (0x1.0p0f - life18_590)) + ((__fieldRead585_187(receiver) * 0x1.333334p-1f) * life18_590)));
    __fieldWrite585_191(receiver, ((__fieldRead585_189(receiver) * (0x1.0p0f - life18_590)) + ((__fieldRead585_190(receiver) * 0x1.333334p-1f) * life18_590)));
    }
    if (!((__instanceOf585_192(life5_11) != 0))) {
        break forest_join_726;
    }
    if (!(__call585_195(__cast585_193(life5_11), __fieldRead585_194()))) {
        break forest_join_726;
    }
    life18_650 = __call585_197(receiver, __cast585_196(life5_11), p0);
    life19_655 = (0x1.0p0f / __fieldRead585_198(receiver));
    if (!((__numericCompare585_200(life19_655, (0x1.0p0f / __fieldRead585_199(receiver))) > 0))) {
        break forest_join_662;
    }
    life19_655 = (0x1.0p0f / __fieldRead585_201(receiver));
    }
    if (!((__numericCompare585_203(life19_655, (0x1.0p0f / __fieldRead585_202(receiver))) > 0))) {
        break forest_join_674;
    }
    life19_655 = (0x1.0p0f / __fieldRead585_204(receiver));
    }
    if (!(__call585_205(life19_655))) {
        break forest_join_681;
    }
    life19_655 = __call585_206(life19_655, 0x0.0p0d);
    }
    __fieldWrite585_209(receiver, ((__fieldRead585_207(receiver) * (0x1.0p0f - life18_650)) + ((__fieldRead585_208(receiver) * life19_655) * life18_650)));
    __fieldWrite585_212(receiver, ((__fieldRead585_210(receiver) * (0x1.0p0f - life18_650)) + ((__fieldRead585_211(receiver) * life19_655) * life18_650)));
    __fieldWrite585_215(receiver, ((__fieldRead585_213(receiver) * (0x1.0p0f - life18_650)) + ((__fieldRead585_214(receiver) * life19_655) * life18_650)));
    }
    if (!(__fieldRead585_218(__fieldRead585_217(__fieldRead585_216(receiver))))) {
        break forest_join_781;
    }
    life18_753 = ((((__fieldRead585_219(receiver) * 0x1.ep4f) + (__fieldRead585_220(receiver) * 0x1.d8p5f)) + (__fieldRead585_221(receiver) * 0x1.6p3f)) / 0x1.9p6f);
    life19_765 = (((__fieldRead585_222(receiver) * 0x1.ep4f) + (__fieldRead585_223(receiver) * 0x1.18p6f)) / 0x1.9p6f);
    life20_777 = (((__fieldRead585_224(receiver) * 0x1.ep4f) + (__fieldRead585_225(receiver) * 0x1.18p6f)) / 0x1.9p6f);
    __fieldWrite585_226(receiver, life18_753);
    __fieldWrite585_227(receiver, life19_765);
    __fieldWrite585_228(receiver, life20_777);
    }
    __call585_232(__fieldRead585_229(receiver), __fieldRead585_230(receiver), __fieldRead585_231(receiver), 0x0.0p0f);
    return;
}
public static void h585_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058500_0(p0);
}
public static void h585_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058501_0(p0);
}
public static void h585_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058502_0(p0);
}
public static void h585_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058503_0(p0);
}
public static void h585_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058504_0(p0);
}
public static void h585_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058505_0(p0);
}
public static void h585_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058506_0(p0);
}
private static native long __fieldRead585_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead585_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_3(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call585_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_5(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead585_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead585_7(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native double __call585_8(double a0, double a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_9(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call585_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DR __call585_11(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_12(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call585_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DR __call585_14(moom.DR a0, net.minecraft.client.multiplayer.WorldClient a1, net.minecraft.entity.Entity a2, float a3) throws Throwable;
private static native double __fieldRead585_15(moom.DR a0) throws Throwable;
private static native double __fieldRead585_16(moom.DR a0) throws Throwable;
private static native double __fieldRead585_17(moom.DR a0) throws Throwable;
private static native moom.DR __call585_18(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_19(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call585_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DR __call585_21(moom.DR a0, net.minecraft.client.multiplayer.WorldClient a1, net.minecraft.entity.Entity a2, float a3) throws Throwable;
private static native double __fieldRead585_22(moom.DR a0) throws Throwable;
private static native void __fieldWrite585_23(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native double __fieldRead585_24(moom.DR a0) throws Throwable;
private static native void __fieldWrite585_25(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native double __fieldRead585_26(moom.DR a0) throws Throwable;
private static native void __fieldWrite585_27(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_28(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead585_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead585_30(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native float __call585_31(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native float __call585_32(float a0) throws Throwable;
private static native int __numericCompare585_33(float a0, float a1) throws Throwable;
private static native moom.DR __call585_34(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native double __call585_35(moom.DR a0, moom.DR a1) throws Throwable;
private static native int __numericCompare585_36(float a0, float a1) throws Throwable;
private static native int __numericCompare585_37(float a0, float a1) throws Throwable;
private static native moom.EA __fieldRead585_38(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call585_39(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native float[] __call585_40(moom.EA a0, float a1, float a2) throws Throwable;
private static native float __fieldRead585_41(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_42(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_43(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_44(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_45(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_46(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_48(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_49(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_50(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_52(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_53(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_54(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_56(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_57(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_58(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __call585_59(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native int __numericCompare585_60(float a0, float a1) throws Throwable;
private static native float __fieldRead585_62(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_63(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_65(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_66(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_68(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_69(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __call585_70(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native int __numericCompare585_71(float a0, float a1) throws Throwable;
private static native float __fieldRead585_73(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_74(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_76(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_77(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_79(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_80(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_81(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead585_82(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.block.Block __call585_83(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native boolean __fieldRead585_84(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.DR __call585_85(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native double __fieldRead585_86(moom.DR a0) throws Throwable;
private static native void __fieldWrite585_87(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native double __fieldRead585_88(moom.DR a0) throws Throwable;
private static native void __fieldWrite585_89(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native double __fieldRead585_90(moom.DR a0) throws Throwable;
private static native void __fieldWrite585_91(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native moom.fn __call585_92(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead585_93() throws Throwable;
private static native int __call585_94(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call585_95(float a0, float a1, float a2) throws Throwable;
private static native int __instanceOf585_96(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast585_97(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead585_98() throws Throwable;
private static native boolean __call585_99(net.minecraft.entity.EntityLivingBase a0, net.minecraft.potion.Potion a1) throws Throwable;
private static native void __fieldWrite585_100(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite585_101(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite585_102(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_103(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead585_104(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_105(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call585_106(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead585_107(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_108(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call585_109(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead585_110(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_111(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call585_112(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead585_113(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DR __call585_114(net.minecraft.client.multiplayer.WorldClient a0, double a1, double a2, double a3) throws Throwable;
private static native double __fieldRead585_115(moom.DR a0) throws Throwable;
private static native void __fieldWrite585_116(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native double __fieldRead585_117(moom.DR a0) throws Throwable;
private static native void __fieldWrite585_118(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native double __fieldRead585_119(moom.DR a0) throws Throwable;
private static native void __fieldWrite585_120(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native moom.fn __call585_121(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead585_122() throws Throwable;
private static native void __fieldWrite585_123(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite585_124(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite585_125(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_126(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead585_127(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_128(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call585_129(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead585_130(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_131(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call585_132(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead585_133(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_134(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call585_135(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead585_136(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DR __call585_137(net.minecraft.client.multiplayer.WorldClient a0, double a1, double a2, double a3) throws Throwable;
private static native double __fieldRead585_138(moom.DR a0) throws Throwable;
private static native void __fieldWrite585_139(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native double __fieldRead585_140(moom.DR a0) throws Throwable;
private static native void __fieldWrite585_141(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native double __fieldRead585_142(moom.DR a0) throws Throwable;
private static native void __fieldWrite585_143(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_144(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_145(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_146(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_148(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_149(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_151(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_152(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_154(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_155(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native double __fieldRead585_156(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead585_157(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead585_158(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.EA __fieldRead585_159(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native double __call585_160(moom.EA a0) throws Throwable;
private static native int __instanceOf585_161(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast585_162(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead585_163() throws Throwable;
private static native boolean __call585_164(net.minecraft.entity.EntityLivingBase a0, net.minecraft.potion.Potion a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast585_165(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead585_166() throws Throwable;
private static native net.minecraft.potion.PotionEffect __call585_167(net.minecraft.entity.EntityLivingBase a0, net.minecraft.potion.Potion a1) throws Throwable;
private static native int __call585_168(net.minecraft.potion.PotionEffect a0) throws Throwable;
private static native int __invokedynamic585_169(int a0, long a1) throws Throwable;
private static native int __numericCompare585_170(double a0, double a1) throws Throwable;
private static native int __numericCompare585_171(double a0, double a1) throws Throwable;
private static native float __fieldRead585_172(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_173(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_174(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_175(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_176(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_177(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_178(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __numericCompare585_179(float a0, float a1) throws Throwable;
private static native float __fieldRead585_180(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_181(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_182(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_183(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_184(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_185(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_186(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_187(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_188(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_189(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_190(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_191(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native int __instanceOf585_192(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast585_193(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.potion.Potion __fieldRead585_194() throws Throwable;
private static native boolean __call585_195(net.minecraft.entity.EntityLivingBase a0, net.minecraft.potion.Potion a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast585_196(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call585_197(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.entity.EntityLivingBase a1, float a2) throws Throwable;
private static native float __fieldRead585_198(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_199(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __numericCompare585_200(float a0, float a1) throws Throwable;
private static native float __fieldRead585_201(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_202(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __numericCompare585_203(float a0, float a1) throws Throwable;
private static native float __fieldRead585_204(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native boolean __call585_205(float a0) throws Throwable;
private static native float __call585_206(float a0, double a1) throws Throwable;
private static native float __fieldRead585_207(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_208(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_209(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_210(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_211(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_212(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_213(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_214(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_215(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead585_216(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead585_217(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead585_218(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native float __fieldRead585_219(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_220(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_221(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_222(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_223(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_224(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_225(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite585_226(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite585_227(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite585_228(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native float __fieldRead585_229(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_230(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native float __fieldRead585_231(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call585_232(float a0, float a1, float a2, float a3) throws Throwable;
private static native java.lang.Throwable __call3058500_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058501_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058502_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058503_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058504_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058505_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058506_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c5185610b3bc5ead5922(net.minecraft.client.renderer.EntityRenderer a0) throws E;
private static final class __SourceHandler_c5185610b3bc5ead5922 {

public static void f1000(net.minecraft.client.renderer.EntityRenderer receiver) throws Throwable {
    int spill1000_0;
    long spill1000_1;
    int spill1000_2;
    int spill1000_3;
    long life1_3;
    float life3_9;
    net.minecraft.entity.Entity life4_39;
    net.minecraft.client.multiplayer.WorldClient life5_46;
    moom.DT life6_51;
    int life7_53;
    double life8_55;
    double life10_57;
    double life12_59;
    int life14_61;
    int life15_68;
    int life16_89;
    moom.DT life17_116;
    net.minecraft.world.biome.BiomeGenBase life18_120;
    moom.DT life19_123;
    net.minecraft.block.Block life20_128;
    double life21_158;
    double life23_162;
    forest_join_319: {
    forest_join_308: {
    forest_join_262: {
    forest_join_87: {
    forest_join_79: {
    forest_join_16: {
    life1_3 = (__fieldRead1000_0() ^ 108546117901624L);
    life3_9 = __call1000_3(__fieldRead1000_2(__fieldRead1000_1(receiver)), 0x1.0p0f);
    if (!((!__call1000_4()))) {
        break forest_join_16;
    }
    life3_9 = (life3_9 / 0x1.0p1f);
    }
    if (!((__numericCompare1000_5(life3_9, 0x0.0p0f) != 0))) {
        break forest_join_319;
    }
    if (!(__call1000_6())) {
        break forest_join_319;
    }
    __call1000_10(__fieldRead1000_7(receiver), (((long) __fieldRead1000_8(receiver)) * __invokedynamic1000_9(25770, (2391922780489844152L ^ life1_3))));
    spill1000_0 = 2528;
    life4_39 = __call1000_12(__fieldRead1000_11(receiver));
    spill1000_1 = (4029216063263436989L ^ life1_3);
    life5_46 = __fieldRead1000_14(__fieldRead1000_13(receiver));
    life6_51 = new moom.DT(life4_39);
    life7_53 = __invokedynamic1000_15(spill1000_0, spill1000_1);
    life8_55 = 0x0.0p0d;
    life10_57 = 0x0.0p0d;
    life12_59 = 0x0.0p0d;
    life14_61 = 0;
    life15_68 = ((int) ((0x1.9p6f * life3_9) * life3_9));
    if (!((__fieldRead1000_18(__fieldRead1000_17(__fieldRead1000_16(receiver))) == 1))) {
        break forest_join_79;
    }
    life15_68 = (life15_68 >> 1);
    break forest_join_87;
    }
    if (!((__fieldRead1000_21(__fieldRead1000_20(__fieldRead1000_19(receiver))) == 2))) {
        break forest_join_87;
    }
    life15_68 = 0;
    }
    life16_89 = 0;
    forest_cycle_89: while (true) {
    forest_join_260: {
    forest_join_231: {
    forest_join_193: {
    if (!((life16_89 < life15_68))) {
        break forest_join_262;
    }
    life17_116 = __call1000_31(life5_46, __call1000_30(life6_51, (__call1000_23(__fieldRead1000_22(receiver), life7_53) - __call1000_25(__fieldRead1000_24(receiver), life7_53)), 0, (__call1000_27(__fieldRead1000_26(receiver), life7_53) - __call1000_29(__fieldRead1000_28(receiver), life7_53))));
    life18_120 = __call1000_32(life5_46, life17_116);
    life19_123 = __call1000_33(life17_116);
    life20_128 = __call1000_35(__call1000_34(life5_46, life19_123));
    if (!((__call1000_36(life17_116) <= (__call1000_37(life6_51) + life7_53)))) {
        break forest_join_260;
    }
    if (!((__call1000_38(life17_116) >= (__call1000_39(life6_51) - life7_53)))) {
        break forest_join_260;
    }
    if (!(__call1000_40(life18_120))) {
        break forest_join_260;
    }
    if (!((__numericCompare1000_42(__call1000_41(life18_120, life17_116), 0x1.333334p-3f) >= 0))) {
        break forest_join_260;
    }
    life21_158 = __call1000_44(__fieldRead1000_43(receiver));
    life23_162 = __call1000_46(__fieldRead1000_45(receiver));
    if (!((__call1000_47(life20_128) == __fieldRead1000_48()))) {
        break forest_join_193;
    }
    __call1000_56(__fieldRead1000_50(__fieldRead1000_49(receiver)), __fieldRead1000_51(), (((double) __call1000_52(life17_116)) + life21_158), (((double) (((float) __call1000_53(life17_116)) + 0x1.99999ap-4f)) - __call1000_54(life20_128)), (((double) __call1000_55(life17_116)) + life23_162), 0x0.0p0d, 0x0.0p0d, 0x0.0p0d, new int[0]);
    break forest_join_260;
    }
    if (!((__call1000_57(life20_128) != __fieldRead1000_58()))) {
        break forest_join_260;
    }
    __call1000_59(life20_128, life5_46, life19_123);
    life14_61 += 1;
    if (!((__call1000_61(__fieldRead1000_60(receiver), life14_61) == 0))) {
        break forest_join_231;
    }
    life8_55 = (((double) __call1000_62(life19_123)) + life21_158);
    life10_57 = ((((double) (((float) __call1000_63(life19_123)) + 0x1.99999ap-4f)) + __call1000_64(life20_128)) - 0x1.0p0d);
    life12_59 = (((double) __call1000_65(life19_123)) + life23_162);
    }
    __call1000_73(__fieldRead1000_67(__fieldRead1000_66(receiver)), __fieldRead1000_68(), (((double) __call1000_69(life19_123)) + life21_158), (((double) (((float) __call1000_70(life19_123)) + 0x1.99999ap-4f)) + __call1000_71(life20_128)), (((double) __call1000_72(life19_123)) + life23_162), 0x0.0p0d, 0x0.0p0d, 0x0.0p0d, new int[0]);
    }
    life16_89 += 1;
    continue forest_cycle_89;
    }
    }
    if (!((life14_61 > 0))) {
        break forest_join_319;
    }
    spill1000_2 = __call1000_75(__fieldRead1000_74(receiver), 3);
    net.minecraft.client.renderer.EntityRenderer __stackOp1000_76_0 = receiver;
    net.minecraft.client.renderer.EntityRenderer __stackOp1000_78_0 = __stackOp1000_76_0;
    int __stackOp1000_78_1 = __fieldRead1000_77(__stackOp1000_76_0);
    spill1000_3 = __stackOp1000_78_1;
    __fieldWrite1000_79(__stackOp1000_78_0, (__stackOp1000_78_1 + 1));
    if (!((spill1000_2 < spill1000_3))) {
        break forest_join_319;
    }
    __fieldWrite1000_80(receiver, 0);
    if (!((__numericCompare1000_82(life10_57, ((double) (__call1000_81(life6_51) + 1))) > 0))) {
        break forest_join_308;
    }
    if (!((__call1000_84(__call1000_83(life5_46, life6_51)) > __call1000_86(((float) __call1000_85(life6_51)))))) {
        break forest_join_308;
    }
    __call1000_89(__fieldRead1000_88(__fieldRead1000_87(receiver)), life8_55, life10_57, life12_59, "ambient.weather.rain", 0x1.99999ap-4f, 0x1.0p-1f, 0);
    break forest_join_319;
    }
    __call1000_92(__fieldRead1000_91(__fieldRead1000_90(receiver)), life8_55, life10_57, life12_59, "ambient.weather.rain", 0x1.99999ap-3f, 0x1.0p0f, 0);
    }
    return;
}
public static void h1000_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3100000_0(p0);
}
public static void h1000_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3100001_0(p0);
}
public static void h1000_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3100002_0(p0);
}
public static void h1000_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3100003_0(p0);
}
public static void h1000_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3100004_0(p0);
}
public static void h1000_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3100005_0(p0);
}
public static void h1000_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3100006_0(p0);
}
public static void h1000_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3100007_0(p0);
}
public static void h1000_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3100008_0(p0);
}
public static void h1000_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3100009_0(p0);
}
private static native long __fieldRead1000_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1000_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1000_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call1000_3(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native boolean __call1000_4() throws Throwable;
private static native int __numericCompare1000_5(float a0, float a1) throws Throwable;
private static native boolean __call1000_6() throws Throwable;
private static native java.util.Random __fieldRead1000_7(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead1000_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native long __invokedynamic1000_9(int a0, long a1) throws Throwable;
private static native void __call1000_10(java.util.Random a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1000_11(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1000_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1000_13(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1000_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic1000_15(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1000_16(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1000_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1000_18(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1000_19(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1000_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1000_21(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.util.Random __fieldRead1000_22(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __call1000_23(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1000_24(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __call1000_25(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1000_26(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __call1000_27(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1000_28(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __call1000_29(java.util.Random a0, int a1) throws Throwable;
private static native moom.DT __call1000_30(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.DT __call1000_31(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call1000_32(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native moom.DT __call1000_33(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1000_34(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1000_35(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call1000_36(moom.DT a0) throws Throwable;
private static native int __call1000_37(moom.DT a0) throws Throwable;
private static native int __call1000_38(moom.DT a0) throws Throwable;
private static native int __call1000_39(moom.DT a0) throws Throwable;
private static native boolean __call1000_40(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native float __call1000_41(net.minecraft.world.biome.BiomeGenBase a0, moom.DT a1) throws Throwable;
private static native int __numericCompare1000_42(float a0, float a1) throws Throwable;
private static native java.util.Random __fieldRead1000_43(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native double __call1000_44(java.util.Random a0) throws Throwable;
private static native java.util.Random __fieldRead1000_45(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native double __call1000_46(java.util.Random a0) throws Throwable;
private static native moom.fn __call1000_47(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1000_48() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1000_49(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1000_50(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1000_51() throws Throwable;
private static native int __call1000_52(moom.DT a0) throws Throwable;
private static native int __call1000_53(moom.DT a0) throws Throwable;
private static native double __call1000_54(net.minecraft.block.Block a0) throws Throwable;
private static native int __call1000_55(moom.DT a0) throws Throwable;
private static native void __call1000_56(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native moom.fn __call1000_57(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1000_58() throws Throwable;
private static native void __call1000_59(net.minecraft.block.Block a0, net.minecraft.client.multiplayer.WorldClient a1, moom.DT a2) throws Throwable;
private static native java.util.Random __fieldRead1000_60(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __call1000_61(java.util.Random a0, int a1) throws Throwable;
private static native int __call1000_62(moom.DT a0) throws Throwable;
private static native int __call1000_63(moom.DT a0) throws Throwable;
private static native double __call1000_64(net.minecraft.block.Block a0) throws Throwable;
private static native int __call1000_65(moom.DT a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1000_66(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1000_67(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1000_68() throws Throwable;
private static native int __call1000_69(moom.DT a0) throws Throwable;
private static native int __call1000_70(moom.DT a0) throws Throwable;
private static native double __call1000_71(net.minecraft.block.Block a0) throws Throwable;
private static native int __call1000_72(moom.DT a0) throws Throwable;
private static native void __call1000_73(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native java.util.Random __fieldRead1000_74(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __call1000_75(java.util.Random a0, int a1) throws Throwable;
private static native int __fieldRead1000_77(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite1000_79(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite1000_80(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native int __call1000_81(moom.DT a0) throws Throwable;
private static native int __numericCompare1000_82(double a0, double a1) throws Throwable;
private static native moom.DT __call1000_83(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native int __call1000_84(moom.DT a0) throws Throwable;
private static native int __call1000_85(moom.DT a0) throws Throwable;
private static native int __call1000_86(float a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1000_87(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1000_88(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1000_89(net.minecraft.client.multiplayer.WorldClient a0, double a1, double a2, double a3, java.lang.String a4, float a5, float a6, int a7) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1000_90(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1000_91(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1000_92(net.minecraft.client.multiplayer.WorldClient a0, double a1, double a2, double a3, java.lang.String a4, float a5, float a6, int a7) throws Throwable;
private static native java.lang.Throwable __call3100000_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3100001_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3100002_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3100003_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3100004_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3100005_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3100006_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3100007_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3100008_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3100009_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9a746b4de1be31cf704a(net.minecraft.client.renderer.EntityRenderer a0) throws E;
private static final class __SourceHandler_9a746b4de1be31cf704a {

public static void f586(net.minecraft.client.renderer.EntityRenderer receiver) throws Throwable {
    long life1_3;
    net.minecraft.server.integrated.IntegratedServer life3_20;
    int life4_26;
    long life5_59;
    long life7_73;
    int life9_96;
    int life10_101;
    forest_join_174: {
    forest_join_168: {
    forest_join_167: {
    forest_join_161: {
    forest_join_150: {
    forest_join_149: {
    forest_join_136: {
    forest_join_135: {
    forest_join_132: {
    forest_join_120: {
    forest_join_103: {
    forest_join_77: {
    forest_join_47: {
    life1_3 = (__fieldRead586_0() ^ 95458215149746L);
    __fieldWrite586_1(receiver, 0);
    if (!(__call586_2())) {
        break forest_join_168;
    }
    if (!(__call586_3())) {
        break forest_join_168;
    }
    if (!(__call586_5(__fieldRead586_4(receiver)))) {
        break forest_join_174;
    }
    life3_20 = __call586_7(__fieldRead586_6(receiver));
    if (!((life3_20 != null))) {
        break forest_join_167;
    }
    life4_26 = __integerCategory586_10(__call586_9(__fieldRead586_8(receiver)));
    if (!((life4_26 == 0))) {
        break forest_join_150;
    }
    if (!((__instanceOf586_13(__fieldRead586_12(__fieldRead586_11(receiver))) == 0))) {
        break forest_join_150;
    }
    if (!((__fieldRead586_14(receiver) > 0))) {
        break forest_join_47;
    }
    __call586_16(__fieldRead586_15());
    __call586_18(((long) __fieldRead586_17(receiver)));
    __call586_20(__fieldRead586_19());
    __fieldWrite586_22(receiver, __fieldRead586_21(receiver));
    }
    life5_59 = (__call586_23() / __invokedynamic586_24(7080, (7146444436790716218L ^ life1_3)));
    if (!((__numericCompare586_26(__fieldRead586_25(receiver), 0L) != 0))) {
        break forest_join_136;
    }
    if (!((__fieldRead586_27(receiver) != 0))) {
        break forest_join_136;
    }
    life7_73 = (life5_59 - __fieldRead586_28(receiver));
    if (!((__numericCompare586_29(life7_73, 0L) < 0))) {
        break forest_join_77;
    }
    __fieldWrite586_30(receiver, life5_59);
    life7_73 = 0L;
    }
    if (!((__numericCompare586_32(life7_73, __invokedynamic586_31(21728, (6913378452971677818L ^ life1_3))) >= 0))) {
        break forest_join_135;
    }
    __fieldWrite586_33(receiver, life5_59);
    life9_96 = __call586_34(life3_20);
    life10_101 = (life9_96 - __fieldRead586_35(receiver));
    if (!((life10_101 < 0))) {
        break forest_join_103;
    }
    __fieldWrite586_36(receiver, life9_96);
    life10_101 = 0;
    }
    if (!((life10_101 < 1))) {
        break forest_join_120;
    }
    if (!((__fieldRead586_37(receiver) < __invokedynamic586_38(7473, (8766553685672049122L ^ life1_3))))) {
        break forest_join_120;
    }
    net.minecraft.client.renderer.EntityRenderer __stackOp586_39_0 = receiver;
    __fieldWrite586_41(__stackOp586_39_0, (__fieldRead586_40(__stackOp586_39_0) + 2));
    }
    if (!((life10_101 > 1))) {
        break forest_join_132;
    }
    if (!((__fieldRead586_42(receiver) > 0))) {
        break forest_join_132;
    }
    net.minecraft.client.renderer.EntityRenderer __stackOp586_43_0 = receiver;
    __fieldWrite586_45(__stackOp586_43_0, (__fieldRead586_44(__stackOp586_43_0) - 1));
    }
    __fieldWrite586_46(receiver, life9_96);
    }
    break forest_join_149;
    }
    __fieldWrite586_47(receiver, life5_59);
    __fieldWrite586_49(receiver, __call586_48(life3_20));
    __fieldWrite586_50(receiver, 0x1.0p0f);
    __fieldWrite586_51(receiver, 0x1.9p5f);
    }
    break forest_join_167;
    }
    if (!((__instanceOf586_54(__fieldRead586_53(__fieldRead586_52(receiver))) != 0))) {
        break forest_join_161;
    }
    __call586_56(__invokedynamic586_55(25324, (7844847550984806010L ^ life1_3)));
    }
    __fieldWrite586_57(receiver, 0L);
    __fieldWrite586_58(receiver, 0);
    }
    break forest_join_174;
    }
    __fieldWrite586_59(receiver, 0L);
    __fieldWrite586_60(receiver, 0);
    }
    return;
}
public static void h586_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058600_0(p0);
}
public static void h586_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058601_0(p0);
}
public static void h586_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058602_0(p0);
}
public static void h586_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058603_0(p0);
}
public static void h586_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058604_0(p0);
}
public static void h586_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058605_0(p0);
}
public static void h586_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058606_0(p0);
}
public static void h586_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058607_0(p0);
}
public static void h586_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058608_0(p0);
}
public static void h586_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058609_0(p0);
}
public static void h586_10(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3058610_0(p0);
}
private static native long __fieldRead586_0() throws Throwable;
private static native void __fieldWrite586_1(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native boolean __call586_2() throws Throwable;
private static native boolean __call586_3() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead586_4(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native boolean __call586_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead586_6(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __call586_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead586_8(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native boolean __call586_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory586_10(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead586_11(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead586_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf586_13(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __fieldRead586_14(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.JL __fieldRead586_15() throws Throwable;
private static native void __call586_16(moom.JL a0) throws Throwable;
private static native int __fieldRead586_17(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call586_18(long a0) throws Throwable;
private static native moom.JL __fieldRead586_19() throws Throwable;
private static native void __call586_20(moom.JL a0) throws Throwable;
private static native int __fieldRead586_21(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite586_22(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native long __call586_23() throws Throwable;
private static native long __invokedynamic586_24(int a0, long a1) throws Throwable;
private static native long __fieldRead586_25(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __numericCompare586_26(long a0, long a1) throws Throwable;
private static native int __fieldRead586_27(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native long __fieldRead586_28(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __numericCompare586_29(long a0, long a1) throws Throwable;
private static native void __fieldWrite586_30(net.minecraft.client.renderer.EntityRenderer a0, long a1) throws Throwable;
private static native long __invokedynamic586_31(int a0, long a1) throws Throwable;
private static native int __numericCompare586_32(long a0, long a1) throws Throwable;
private static native void __fieldWrite586_33(net.minecraft.client.renderer.EntityRenderer a0, long a1) throws Throwable;
private static native int __call586_34(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native int __fieldRead586_35(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite586_36(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native int __fieldRead586_37(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __invokedynamic586_38(int a0, long a1) throws Throwable;
private static native int __fieldRead586_40(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite586_41(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native int __fieldRead586_42(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead586_44(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __fieldWrite586_45(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite586_46(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite586_47(net.minecraft.client.renderer.EntityRenderer a0, long a1) throws Throwable;
private static native int __call586_48(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __fieldWrite586_49(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite586_50(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native void __fieldWrite586_51(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead586_52(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead586_53(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf586_54(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native long __invokedynamic586_55(int a0, long a1) throws Throwable;
private static native void __call586_56(long a0) throws Throwable;
private static native void __fieldWrite586_57(net.minecraft.client.renderer.EntityRenderer a0, long a1) throws Throwable;
private static native void __fieldWrite586_58(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite586_59(net.minecraft.client.renderer.EntityRenderer a0, long a1) throws Throwable;
private static native void __fieldWrite586_60(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3058600_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058601_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058602_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058603_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058604_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058605_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058606_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058607_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058608_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058609_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3058610_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_177d2b71ad01d90ad4ef(net.minecraft.client.renderer.EntityRenderer a0) throws E;
private static final class __SourceHandler_177d2b71ad01d90ad4ef {

public static void f2458(net.minecraft.client.renderer.EntityRenderer receiver) throws Throwable {
    long life1_3;
    net.minecraft.client.multiplayer.WorldClient life3_41;
    java.lang.String life4_56;
    java.lang.String life5_60;
    moom.CM life6_73;
    moom.CM life4_105;
    life1_3 = (__fieldRead2458_0() ^ 3587975663645L);
    __call2458_1();
    if ((!__fieldRead2458_2(receiver))) {
        __call2458_3();
        if ((__call2458_4() == __invokedynamic2458_5(12050, (3399452674324306800L ^ life1_3)))) {
        if ((__call2458_6() == __invokedynamic2458_7(17511, (3918168426295291942L ^ life1_3)))) {
        __call2458_8(1);
    }
    }
        __fieldWrite2458_9(receiver, 1);
    }
    __call2458_10();
    life3_41 = __fieldRead2458_12(__fieldRead2458_11(receiver));
    if ((life3_41 != null)) {
        if ((__call2458_13() != null)) {
        life4_56 = __call2458_15(__call2458_14("HD_U", "HD_U", "HD Ultra"), "L", "Light");
        life5_60 = __invokedynamic2458_17(life4_56, __call2458_16());
        life6_73 = new moom.CM(__call2458_19("of.message.newVersion", new java.lang.Object[] {__invokedynamic2458_18(life5_60)}));
        __call2458_22(life6_73, __call2458_21(new moom.CO(), new moom.v2(__fieldRead2458_20(), "https://optifine.net/downloads")));
        __call2458_26(__call2458_25(__fieldRead2458_24(__fieldRead2458_23(receiver))), life6_73);
        __call2458_27(null);
    }
        if (__call2458_28()) {
        __call2458_29(0);
        life4_105 = new moom.CM(__call2458_30("of.message.java64Bit", new java.lang.Object[0]));
        __call2458_34(__call2458_33(__fieldRead2458_32(__fieldRead2458_31(receiver))), life4_105);
    }
    }
    if ((__instanceOf2458_37(__fieldRead2458_36(__fieldRead2458_35(receiver))) != 0)) {
        __call2458_41(receiver, __cast2458_40(__fieldRead2458_39(__fieldRead2458_38(receiver))));
    }
    if ((__fieldRead2458_42(receiver) != life3_41)) {
        __call2458_44(__fieldRead2458_43(receiver), life3_41);
        __call2458_45();
        __fieldWrite2458_46(receiver, 0L);
        __fieldWrite2458_47(receiver, 0);
        __fieldWrite2458_48(receiver, life3_41);
    }
    if ((!__call2458_50(receiver, __fieldRead2458_49()))) {
        __fieldWrite2458_51(0);
    }
    if ((__fieldRead2458_53(__fieldRead2458_52(receiver)) != null)) {
        if ((__call2458_56(__fieldRead2458_55(__fieldRead2458_54(receiver))) == __classLiteral2458_57())) {
        __call2458_62(__fieldRead2458_58(receiver), new moom.gH(__cast2458_61(__fieldRead2458_60(__fieldRead2458_59(receiver)))));
    }
    }
    return;
}
public static void h2458_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245800_0(p0);
}
public static void h2458_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245801_0(p0);
}
public static void h2458_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245802_0(p0);
}
public static void h2458_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245803_0(p0);
}
public static void h2458_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245804_0(p0);
}
public static void h2458_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245805_0(p0);
}
public static void h2458_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245806_0(p0);
}
public static void h2458_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245807_0(p0);
}
public static void h2458_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245808_0(p0);
}
private static native long __fieldRead2458_0() throws Throwable;
private static native void __call2458_1() throws Throwable;
private static native boolean __fieldRead2458_2(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call2458_3() throws Throwable;
private static native int __call2458_4() throws Throwable;
private static native int __invokedynamic2458_5(int a0, long a1) throws Throwable;
private static native int __call2458_6() throws Throwable;
private static native int __invokedynamic2458_7(int a0, long a1) throws Throwable;
private static native void __call2458_8(int a0) throws Throwable;
private static native void __fieldWrite2458_9(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native void __call2458_10() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2458_11(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2458_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call2458_13() throws Throwable;
private static native java.lang.String __call2458_14(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __call2458_15(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __call2458_16() throws Throwable;
private static native java.lang.String __invokedynamic2458_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic2458_18(java.lang.String a0) throws Throwable;
private static native java.lang.String __call2458_19(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __fieldRead2458_20() throws Throwable;
private static native moom.CO __call2458_21(moom.CO a0, moom.v2 a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call2458_22(moom.CM a0, moom.CO a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2458_23(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead2458_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call2458_25(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call2458_26(moom.gB a0, moom.CM a1) throws Throwable;
private static native void __call2458_27(java.lang.Object a0) throws Throwable;
private static native boolean __call2458_28() throws Throwable;
private static native void __call2458_29(int a0) throws Throwable;
private static native java.lang.String __call2458_30(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2458_31(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead2458_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call2458_33(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call2458_34(moom.gB a0, moom.CM a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2458_35(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead2458_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf2458_37(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2458_38(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead2458_39(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiMainMenu __cast2458_40(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call2458_41(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.client.gui.GuiMainMenu a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead2458_42(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead2458_43(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call2458_44(net.minecraft.world.World a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native void __call2458_45() throws Throwable;
private static native void __fieldWrite2458_46(net.minecraft.client.renderer.EntityRenderer a0, long a1) throws Throwable;
private static native void __fieldWrite2458_47(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite2458_48(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native int __fieldRead2458_49() throws Throwable;
private static native boolean __call2458_50(net.minecraft.client.renderer.EntityRenderer a0, int a1) throws Throwable;
private static native void __fieldWrite2458_51(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2458_52(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead2458_53(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2458_54(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead2458_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Class __call2458_56(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native java.lang.Object __classLiteral2458_57() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2458_58(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2458_59(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead2458_60(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gF __cast2458_61(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call2458_62(net.minecraft.client.Minecraft a0, moom.gH a1) throws Throwable;
private static native java.lang.Throwable __call1245800_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1245801_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1245802_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1245803_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1245804_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1245805_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1245806_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1245807_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1245808_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fd396bffb0b95a614998(net.minecraft.client.renderer.EntityRenderer a0) throws E;
private static final class __SourceHandler_fd396bffb0b95a614998 {

public static void f2459(net.minecraft.client.renderer.EntityRenderer receiver) throws Throwable {
    long life1_3;
    int life3_25;
    java.lang.String life4_36;
    moom.CM life5_53;
    life1_3 = (__fieldRead2459_0() ^ 108463462059869L);
    if ((__fieldRead2459_2(__fieldRead2459_1(receiver)) != null)) {
        if (__call2459_3()) {
        if (__call2459_5("CheckGlErrorFrameFinish", __invokedynamic2459_4(25957, (8863816927321003550L ^ life1_3)))) {
        life3_25 = __call2459_6();
        if ((life3_25 != 0)) {
        if (__call2459_7(life3_25)) {
        life4_36 = __call2459_8(life3_25);
        life5_53 = new moom.CM(__call2459_10("of.message.openglError", new java.lang.Object[] {__call2459_9(life3_25), life4_36}));
        __call2459_14(__call2459_13(__fieldRead2459_12(__fieldRead2459_11(receiver))), life5_53);
    }
    }
    }
    }
    }
    return;
}
public static void h2459_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245900_0(p0);
}
public static void h2459_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245901_0(p0);
}
public static void h2459_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1245902_0(p0);
}
private static native long __fieldRead2459_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2459_1(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2459_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call2459_3() throws Throwable;
private static native long __invokedynamic2459_4(int a0, long a1) throws Throwable;
private static native boolean __call2459_5(java.lang.String a0, long a1) throws Throwable;
private static native int __call2459_6() throws Throwable;
private static native boolean __call2459_7(int a0) throws Throwable;
private static native java.lang.String __call2459_8(int a0) throws Throwable;
private static native java.lang.Integer __call2459_9(int a0) throws Throwable;
private static native java.lang.String __call2459_10(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2459_11(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead2459_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call2459_13(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call2459_14(moom.gB a0, moom.CM a1) throws Throwable;
private static native java.lang.Throwable __call1245900_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1245901_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1245902_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}


private void i() { __sourceHandlerCall_c5185610b3bc5ead5922(this); }


public void b(float p0, long p1) { __sourceHandlerCall_49a02453036aa6b7d2d3(this, p0, p1); }


private boolean b__Boolean() { return __sourceHandlerCall_3bb2234333aa9ce2ba7b(this); }


private void b(float p0, int p1) {
((net.minecraft.client.renderer.EntityRenderer)(this)).a(((float)(p0)), ((int)(p1)), ((boolean)(true)), ((boolean)(true)), ((boolean)(false)));
    return;
}


private void b(float p0) { __sourceHandlerCall_8b9624e9c44f2b598148(this, p0); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10558_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/kV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = __sourceExactCall_a245654bd81445(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long b(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8089);
    if (((net.minecraft.client.renderer.EntityRenderer.gb)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.client.renderer.EntityRenderer.fb)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.client.renderer.EntityRenderer.hb)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.client.renderer.EntityRenderer.hb)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/kV", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.client.renderer.EntityRenderer.gb)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.client.renderer.EntityRenderer.gb)[life3_8])).longValue();
}


public void b(moom.oR p0) { __sourceHandlerCall_7341f5da0f44e6a08f5f(this, p0); }


public void b() { __sourceHandlerCall_220bbdf1f04b3a438810(this); }


private void e(float p0) { __sourceHandlerCall_669e2d11491aaad8e2d5(this, p0); }


private void e() { __sourceHandlerCall_8e231e9d542d755e198c(this); }


public void c() { __sourceHandlerCall_b0c0d66779fe5374ba83(this); }


private void c(float p0) {
net.minecraft.entity.Entity life3_3;
    net.minecraft.entity.player.EntityPlayer life2_9;
    float life3_15;
    float life4_23;
    float life5_34;
    float life6_45;
    life3_3 = ((net.minecraft.client.Minecraft)(this.h)).a__r3();
    if ((((life3_3 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0)) {
        life2_9 = ((net.minecraft.entity.player.EntityPlayer)(life3_3));
        life3_15 = (((net.minecraft.entity.player.EntityPlayer)(life2_9)).J - ((net.minecraft.entity.player.EntityPlayer)(life2_9)).I);
        life4_23 = (-(((net.minecraft.entity.player.EntityPlayer)(life2_9)).J + (life3_15 * p0)));
        life5_34 = (((net.minecraft.entity.player.EntityPlayer)(life2_9)).bJ + ((((net.minecraft.entity.player.EntityPlayer)(life2_9)).bK - ((net.minecraft.entity.player.EntityPlayer)(life2_9)).bJ) * p0));
        life6_45 = (((net.minecraft.entity.player.EntityPlayer)(life2_9)).aY + ((((net.minecraft.entity.player.EntityPlayer)(life2_9)).aZ - ((net.minecraft.entity.player.EntityPlayer)(life2_9)).aY) * p0));
        moom.kZ.b(((float)(((moom.Dr.a(((float)((life4_23 * 0x1.921fb6p1f)))) * life5_34) * 0x1.0p-1f))), ((float)((-java.lang.Math.abs(((float)((moom.Dr.b(((float)((life4_23 * 0x1.921fb6p1f)))) * life5_34))))))), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(((moom.Dr.a(((float)((life4_23 * 0x1.921fb6p1f)))) * life5_34) * 0x1.8p1f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
        moom.kZ.b(((float)((java.lang.Math.abs(((float)((moom.Dr.b(((float)(((life4_23 * 0x1.921fb6p1f) - 0x1.99999ap-3f)))) * life5_34)))) * 0x1.4p2f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(life6_45)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    }
    return;
}


private void h() {
this.Z = ((float)(((float) (((double) this.Z) + (((java.lang.Math.random() - java.lang.Math.random()) * java.lang.Math.random()) * java.lang.Math.random())))));
    this.Z = ((float)(((float) (((double) this.Z) * 0x1.ccccccccccccdp-1d))));
    this.Y += (this.Z - this.Y);
    this.X = ((boolean)(true));
    return;
}


private void h(float p0) { __sourceHandlerCall_4231b39026bfceb14a01(this, p0); }


private void f(float p0) { __sourceHandlerCall_6132570c917598e0f91c(this, p0); }


public void f() {
try {
        moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.r)));
        moom.kZ.v();
        moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.q)));
        if (moom.BU.ap()) {
        moom.MP.av();
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_0) {
        throw __sourceExactCall_acb84f8d3432af(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


private void l() { __sourceHandlerCall_177d2b71ad01d90ad4ef(this); }


public void d() { __sourceHandlerCall_8ae01ea9fdd234b2443e(this); }


public void d(float p0) { __sourceHandlerCall_53b969c3aff9c69d5034(this, p0); }


public boolean a(int p0) { return __sourceHandlerCall_ce2f5959b58b4b166321(this, p0); }


private java.nio.FloatBuffer a(float p0, float p1, float p2, float p3) {
try {
        if (moom.BU.ap()) {
        moom.MP.a(((float)(p0)), ((float)(p1)), ((float)(p2)));
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_0) {
        throw __sourceExactCall_acb84f8d3432af(((java.lang.Throwable)(caught_rethrow_0)));
    }
    ((java.nio.FloatBuffer)(this.t)).clear();
    ((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(this.t)).put(((float)(p0))))).put(((float)(p1))))).put(((float)(p2))))).put(((float)(p3)));
    ((java.nio.FloatBuffer)(this.t)).flip();
    return this.t;
}


private void a(net.minecraft.entity.Entity p0, float p1, net.minecraft.client.renderer.culling.ICamera p2, boolean p3) { __sourceHandlerCall_8fd35b29da8e0766b0d4(this, p0, p1, p2, p3); }


public net.minecraft.client.gui.MapItemRenderer a__ip() {
return this.k;
}


private void a(net.minecraft.client.gui.GuiMainMenu p0) { __sourceHandlerCall_01a131300656b33cedcb(this, p0); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2021;
      if (db[var3] == null) {
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
         long var5 = cb[var3];
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
         Object[] var9 = (Object[])eb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               eb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/kV", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_517e7c60d6bb5c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10576_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/kV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a(net.minecraft.entity.Entity p0, double p1, net.minecraft.client.renderer.culling.ICamera p2, boolean p3) { __sourceHandlerCall_78dc1beeab0ab2c0dfa0(this, p0, p1, p2, p3); }


public moom.DD a() {
return this.q;
}


public void a__Void() {
try {
        if ((this.af != null)) {
        ((net.minecraft.client.shader.ShaderGroup)(this.af)).a__Void();
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_0) {
        throw __sourceExactCall_acb84f8d3432af(((java.lang.Throwable)(caught_rethrow_0)));
    }
    this.af = ((net.minecraft.client.shader.ShaderGroup)(null));
    this.ag = ((int)(net.minecraft.client.renderer.EntityRenderer.e));
    return;
}


public void a(net.minecraft.entity.Entity p0) { __sourceHandlerCall_340f1cce372bca1286c1(this, p0); }


public void a(float p0) { __sourceHandlerCall_a5686e6a18c5d8674fdc(this, p0); }


public void a(int p0, int p1) { __sourceHandlerCall_5a41d40e01c5cc9a7860(this, p0, p1); }


public float a(net.minecraft.entity.EntityLivingBase p0, float p1) { return __sourceHandlerCall_35fe494e684b10268304(this, p0, p1); }


public void a(float p0, long p1) { __sourceHandlerCall_9c2fe8aeb0a50f67a625(this, p0, p1); }


public net.minecraft.client.shader.ShaderGroup a__pC() {
return this.af;
}


public void a(float p0, int p1) { __sourceHandlerCall_937a3cc8e85d58b1cb3e(this, p0, p1); }


public void a(float p0, int p1, boolean p2, boolean p3, boolean p4) { __sourceHandlerCall_5deba8c9fdf600886666(this, p0, p1, p2, p3, p4); }


private float a(float p0, boolean p1) { return __sourceHandlerCall_9367375197d78ceb02bf(this, p0, p1); }


public boolean a__Boolean() { return __sourceHandlerCall_0903940e26b93b236fd4(this); }


private void a(int p0, float p1) { __sourceHandlerCall_24d05b311d9868e5c4c5(this, p0, p1); }


private void a(net.minecraft.client.renderer.RenderGlobal p0, float p1, int p2) { __sourceHandlerCall_fb1b425dd81d3a37e075(this, p0, p1, p2); }


private void a(moom.DD p0) { __sourceHandlerCall_7c017a464c6f4fb88e2b(this, p0); }


private void a(int p0, float p1, long p2) { __sourceHandlerCall_cdf505e30518e32a839e(this, p0, p1, p2); }


private void m() { __sourceHandlerCall_fd396bffb0b95a614998(this); }


private void k() { __sourceHandlerCall_9a746b4de1be31cf704a(this); }


public void g() { __sourceHandlerCall_682b6dd69ef4e23f5ff7(this); }


protected void g(float p0) { __sourceHandlerCall_c0d1d3abbe0ed468aefe(this, p0); }


public void j() {
long local1 = (net.minecraft.client.renderer.EntityRenderer.bb ^ 91017004311267L);
    moom.ir local3 = new moom.ir(this.h);
    moom.kZ.k(((int)(__sourceIntrinsic_e7f949c9ef6e_originalDynamicSite1822_2(15936, (8564964899238787289L ^ local1)))));
    moom.kZ.l(((int)(__sourceIntrinsic_e7f949c9ef6e_originalDynamicSite1822_4(22520, (1898687111743885598L ^ local1)))));
    moom.kZ.A();
    moom.kZ.a(((double)(0x0.0p0d)), ((double)(((moom.ir)(local3)).a())), ((double)(((moom.ir)(local3)).b())), ((double)(0x0.0p0d)), ((double)(0x1.f4p9d)), ((double)(0x1.77p11d)));
    moom.kZ.l(((int)(__sourceIntrinsic_e7f949c9ef6e_originalDynamicSite1822_10(25934, (8139897445189346276L ^ local1)))));
    moom.kZ.A();
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.f4p10f)));
    return;
}


private static java.lang.String lambda$updateCameraAndRender$1(int p0, int p1) throws java.lang.Exception {
return java.lang.String.format(((java.lang.String)("Scaled: (%d, %d). Absolute: (%d, %d)")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(p0))), java.lang.Integer.valueOf(((int)(p1))), java.lang.Integer.valueOf(((int)(org.lwjgl.input.Mouse.getX()))), java.lang.Integer.valueOf(((int)(org.lwjgl.input.Mouse.getY())))})));
}


private java.lang.String lambda$updateCameraAndRender$0() throws java.lang.Exception {
return ((java.lang.Class)(((java.lang.Object)(((net.minecraft.client.Minecraft)(this.h)).P)).getClass())).getCanonicalName();
}


private java.lang.String lambda$updateCameraAndRender$2(moom.ir p0) throws java.lang.Exception {
return java.lang.String.format(((java.lang.String)("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(((moom.ir)(p0)).a__Int()))), java.lang.Integer.valueOf(((int)(((moom.ir)(p0)).b__Int()))), java.lang.Integer.valueOf(((int)(((net.minecraft.client.Minecraft)(this.h)).G))), java.lang.Integer.valueOf(((int)(((net.minecraft.client.Minecraft)(this.h)).H))), java.lang.Integer.valueOf(((int)(((moom.ir)(p0)).c())))})));
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1323_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_da8374cdc0187020_originalDynamicSite3016_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10576_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10558_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_originalDynamicSite1822_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_originalDynamicSite1822_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_originalDynamicSite1822_10(int a0, long a1) throws E;

private static native long __sourceExactCall_a245654bd81445(int p0, long p1);
private static native java.lang.Throwable __sourceExactCall_acb84f8d3432af(java.lang.Throwable p0);
private static native int __sourceExactCall_517e7c60d6bb5c(int p0, long p1);

private static native int[] __sourceExactCall_d0385b7c81a8a4(moom.n3 p0);
}
